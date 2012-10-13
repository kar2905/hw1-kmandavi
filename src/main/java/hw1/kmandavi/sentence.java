

/* First created by JCasGen Fri Oct 12 15:30:51 EDT 2012 */
package hw1.kmandavi;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Type System for Sentence of Input


 * Updated by JCasGen Fri Oct 12 15:31:04 EDT 2012
 * XML source: /home/kartik/andorid-workspace/hw1-kmandavi/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(sentence.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public sentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: identifier

  /** getter for identifier - gets unique sentence identifier

   * @generated */
  public String getIdentifier() {
    if (sentence_Type.featOkTst && ((sentence_Type)jcasType).casFeat_identifier == null)
      jcasType.jcas.throwFeatMissing("identifier", "hw1.kmandavi.sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((sentence_Type)jcasType).casFeatCode_identifier);}
    
  /** setter for identifier - sets unique sentence identifier
 
   * @generated */
  public void setIdentifier(String v) {
    if (sentence_Type.featOkTst && ((sentence_Type)jcasType).casFeat_identifier == null)
      jcasType.jcas.throwFeatMissing("identifier", "hw1.kmandavi.sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((sentence_Type)jcasType).casFeatCode_identifier, v);}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets sentance text for input

   * @generated */
  public String getText() {
    if (sentence_Type.featOkTst && ((sentence_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "hw1.kmandavi.sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((sentence_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets sentance text for input
 
   * @generated */
  public void setText(String v) {
    if (sentence_Type.featOkTst && ((sentence_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "hw1.kmandavi.sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((sentence_Type)jcasType).casFeatCode_text, v);}    
  }

    