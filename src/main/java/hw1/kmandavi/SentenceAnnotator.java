package hw1.kmandavi;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import hw1.kmandavi.sentence;



public class SentenceAnnotator extends JCasAnnotator_ImplBase {
  

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    // get document text
    String docText = aJCas.getDocumentText().trim();
    String text[] = docText.split("[\\n]");
    System.out.println("Annotating Sentence");

    for(int i=0; i<text.length;i++){
      int firstSpace = text[i].indexOf(' ');
      //System.out.println(text[i]);
      String sentenceIdentifier = text[i].substring(0, firstSpace);
      String sentenceText = text[i].substring(firstSpace).trim();

       sentence annotation = new sentence(aJCas);
        annotation.setIdentifier(sentenceIdentifier);
        annotation.setText(sentenceText);
        annotation.addToIndexes();
    }
   
    
    
  }

}
