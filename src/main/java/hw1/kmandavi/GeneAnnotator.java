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
    

    // retrieve the filename of the input file from the CAS
    FSIterator it = jcas.getAnnotationIndex(sentence.type).iterator();
    while (it.hasNext()) {
      System.out.println("Iterating through sentences");

      sentence annotation = (sentence) it.next();
      sentenceIdentifier = annotation.getIdentifier();
      sentenceText = annotation.getText();
      Map<Integer, Integer> occurences = Tagger.getGeneSpans(sentenceText);
      for (Map.Entry<Integer, Integer> entry : occurences.entrySet())
      {
          System.out.println(entry.getKey() + "/" + entry.getValue());
      }

      String text[] = sentenceText.split(" ");
      int begin = 0;
      for(int i=0; i< text.length; i++){
        GeneTag ann = new GeneTag(jcas);
        ann.setBegin(begin);
        ann.setEnd(begin + text[i].length());
        ann.setIdentifier(sentenceIdentifier);
        ann.setName(text[i]);
        ann.addToIndexes();
        begin += text[i].length();

      }
      
    }       
    
  }

}
