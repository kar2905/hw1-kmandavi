package hw1.kmandavi;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

import hw1.kmandavi.sentence;

import hw1.kmandavi.GeneTag;

import hw1.kmandavi.PosTagNamedEntityRecognizer;

public class GeneAnnotator extends JCasAnnotator_ImplBase {
  

  @Override
  /**
   * Implementation for the process method
   * Annotates Genes. 
   * Retrieves the sentence CAS, uses NER and then looks up the entities in the gene database
   * If found, adds a new index to the CAS with the respective offset
   */
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    // get document text
    JCas jcas = aJCas;
    
    String sentenceIdentifier = "";
    String sentenceText = "";
    System.out.println("Annotating Genes");
    PosTagNamedEntityRecognizer Tagger = null;
    try {
      Tagger = new PosTagNamedEntityRecognizer();
    } catch (ResourceInitializationException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    CSVToHashMap genes = new CSVToHashMap();
    

    // retrieve the filename of the input file from the CAS
    FSIterator it = jcas.getAnnotationIndex(sentence.type).iterator();
    while (it.hasNext()) {

      sentence annotation = (sentence) it.next();
      sentenceIdentifier = annotation.getIdentifier();
      sentenceText = annotation.getText();
      Map<Integer, Integer> occurences = Tagger.getGeneSpans(sentenceText);
      int begin;
      int end;
      String gene;
      for (Map.Entry<Integer, Integer> entry : occurences.entrySet())
      {
          begin = entry.getKey();
          end = entry.getValue();
          gene = sentenceText.substring(begin, end);
          begin = begin - countWhiteSpaces(sentenceText.substring(0,begin)) ;
          end = begin + gene.length() - countWhiteSpaces(gene) - 1;
          
          if(genes.findGene(gene) == true ){
            GeneTag ann = new GeneTag(jcas);
            ann.setBegin(begin);
            ann.setEnd(end);
            ann.setIdentifier(sentenceIdentifier);
            ann.setName(gene);
            ann.addToIndexes();
          }
      }
      
    }       
    
  }
  
  /**
   * Counts the whitespace in a given string
   * @param phrase string to search whitespace in
   * @return number of whitespaces
   */
  
  private int countWhiteSpaces(String phrase){
    int countBlank = 0;
    for(int i=0; i<phrase.length(); i++) {
      if(Character.isWhitespace(phrase.charAt(i))) {
          countBlank++;
      }
  }
    return countBlank;
  }

}
