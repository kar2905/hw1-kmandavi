

/* First created by JCasGen Fri Oct 12 14:58:12 EDT 2012 */
package hw1.kmandavi;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Type System for Gene Annotator

 * Updated by JCasGen Fri Oct 12 14:58:12 EDT 2012
 * XML source: /home/kartik/andorid-workspace/hw1-kmandavi/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class GeneAnnotator extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneAnnotator.class);
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
  protected GeneAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneAnnotator(JCas jcas, int begin, int end) {
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

  /** getter for identifier - gets 
   * @generated */
  public String getIdentifier() {
    if (GeneAnnotator_Type.featOkTst && ((GeneAnnotator_Type)jcasType).casFeat_identifier == null)
      jcasType.jcas.throwFeatMissing("identifier", "hw1.kmandavi.GeneAnnotator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneAnnotator_Type)jcasType).casFeatCode_identifier);}
    
  /** setter for identifier - sets  
   * @generated */
  public void setIdentifier(String v) {
    if (GeneAnnotator_Type.featOkTst && ((GeneAnnotator_Type)jcasType).casFeat_identifier == null)
      jcasType.jcas.throwFeatMissing("identifier", "hw1.kmandavi.GeneAnnotator");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneAnnotator_Type)jcasType).casFeatCode_identifier, v);}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets 
   * @generated */
  public String getText() {
    if (GeneAnnotator_Type.featOkTst && ((GeneAnnotator_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "hw1.kmandavi.GeneAnnotator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneAnnotator_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets  
   * @generated */
  public void setText(String v) {
    if (GeneAnnotator_Type.featOkTst && ((GeneAnnotator_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "hw1.kmandavi.GeneAnnotator");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneAnnotator_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: geneName

  /** getter for geneName - gets 
   * @generated */
  public String getGeneName() {
    if (GeneAnnotator_Type.featOkTst && ((GeneAnnotator_Type)jcasType).casFeat_geneName == null)
      jcasType.jcas.throwFeatMissing("geneName", "hw1.kmandavi.GeneAnnotator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneAnnotator_Type)jcasType).casFeatCode_geneName);}
    
  /** setter for geneName - sets  
   * @generated */
  public void setGeneName(String v) {
    if (GeneAnnotator_Type.featOkTst && ((GeneAnnotator_Type)jcasType).casFeat_geneName == null)
      jcasType.jcas.throwFeatMissing("geneName", "hw1.kmandavi.GeneAnnotator");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneAnnotator_Type)jcasType).casFeatCode_geneName, v);}    
  }

    