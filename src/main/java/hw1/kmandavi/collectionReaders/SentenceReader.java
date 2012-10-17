package hw1.kmandavi.collectionReaders;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.Progress;
import org.apache.uima.resource.ResourceInitializationException;

import hw1.kmandavi.sentence;

public class SentenceReader extends CollectionReader_ImplBase {
  
  private BufferedReader in;
  private int read = 1;
  String cas = "";
  /**
   * Reads the input file and builds for the CAS
   * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize()
   */
  public void initialize() throws ResourceInitializationException {
    String input = (String) getConfigParameterValue("INPUT_FILE");
    FileReader file;
    System.out.println("Initializing Collection Reader");
    try {
      file = new FileReader(input);
      in = new BufferedReader(file);
      System.out.println(input);
       int i=0;
      char chars[]=new char[4096];
      while( (in.read(chars))!=-1 ){
        cas+=new String(chars);
        chars=null;
        chars=new char[4096];
      }
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  /**
   * Sets the document to the CAS
   * This implementation gets the CAS object and assigns the value to the CAS. 
   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
   */
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    System.out.println("Collection Reader:getNext");
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }
    jcas.setDocumentText(cas);
    read = 0;
  }

  @Override
  public void close() throws IOException {
    in.close();
  }

  @Override
  public Progress[] getProgress() {
    return null;
  }

  @Override
  /*
   * Overridden to return true only for the first time so as to read the file. (non-Javadoc)
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#hasNext()
   */
  public boolean hasNext() throws IOException, CollectionException {
    System.out.println("Collection Reader:hasNext");
    if(read == 1) return true;
    return false;
  }

}