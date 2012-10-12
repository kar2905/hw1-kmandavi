
/* First created by JCasGen Fri Oct 12 14:58:12 EDT 2012 */
package hw1.kmandavi;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Type System for Gene Annotator

 * Updated by JCasGen Fri Oct 12 14:58:12 EDT 2012
 * @generated */
public class GeneAnnotator_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneAnnotator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneAnnotator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneAnnotator(addr, GeneAnnotator_Type.this);
  			   GeneAnnotator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneAnnotator(addr, GeneAnnotator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneAnnotator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.kmandavi.GeneAnnotator");
 
  /** @generated */
  final Feature casFeat_identifier;
  /** @generated */
  final int     casFeatCode_identifier;
  /** @generated */ 
  public String getIdentifier(int addr) {
        if (featOkTst && casFeat_identifier == null)
      jcas.throwFeatMissing("identifier", "hw1.kmandavi.GeneAnnotator");
    return ll_cas.ll_getStringValue(addr, casFeatCode_identifier);
  }
  /** @generated */    
  public void setIdentifier(int addr, String v) {
        if (featOkTst && casFeat_identifier == null)
      jcas.throwFeatMissing("identifier", "hw1.kmandavi.GeneAnnotator");
    ll_cas.ll_setStringValue(addr, casFeatCode_identifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "hw1.kmandavi.GeneAnnotator");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "hw1.kmandavi.GeneAnnotator");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_geneName;
  /** @generated */
  final int     casFeatCode_geneName;
  /** @generated */ 
  public String getGeneName(int addr) {
        if (featOkTst && casFeat_geneName == null)
      jcas.throwFeatMissing("geneName", "hw1.kmandavi.GeneAnnotator");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geneName);
  }
  /** @generated */    
  public void setGeneName(int addr, String v) {
        if (featOkTst && casFeat_geneName == null)
      jcas.throwFeatMissing("geneName", "hw1.kmandavi.GeneAnnotator");
    ll_cas.ll_setStringValue(addr, casFeatCode_geneName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GeneAnnotator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_identifier = jcas.getRequiredFeatureDE(casType, "identifier", "uima.cas.String", featOkTst);
    casFeatCode_identifier  = (null == casFeat_identifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_identifier).getCode();

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

 
    casFeat_geneName = jcas.getRequiredFeatureDE(casType, "geneName", "uima.cas.String", featOkTst);
    casFeatCode_geneName  = (null == casFeat_geneName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geneName).getCode();

  }
}



    