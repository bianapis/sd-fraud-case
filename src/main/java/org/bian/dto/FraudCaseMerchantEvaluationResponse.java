package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudCaseMerchantEvaluationResponse
 */
public class FraudCaseMerchantEvaluationResponse   {
  private String fraudDecisionReference = null;

  private String merchantFraudDecisionAnalysisReference = null;

  private String fraudModelModelReference = null;

  private String fraudModelModel = null;

  private Object fraudDetectionAnalysisRecord = null;

  private Object fraudDetectionDiagnosisRecord = null;

  private Object fraudDecisionRecord = null;

  private Object merchantFraudDecisionAnalysisRecord = null;

  private String merchantEvaluationResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"Refers to the specific fraud decision assessment\" 
   * @return fraudDecisionReference
  **/

  public String getFraudDecisionReference() {
    return fraudDecisionReference;
  }

  public void setFraudDecisionReference(String fraudDecisionReference) {
    this.fraudDecisionReference = fraudDecisionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"Refers to the action to perform merchant related fraud analysis\" 
   * @return merchantFraudDecisionAnalysisReference
  **/

  public String getMerchantFraudDecisionAnalysisReference() {
    return merchantFraudDecisionAnalysisReference;
  }

  public void setMerchantFraudDecisionAnalysisReference(String merchantFraudDecisionAnalysisReference) {
    this.merchantFraudDecisionAnalysisReference = merchantFraudDecisionAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"this is the reference to the merchant fraud decision model\" 
   * @return fraudModelModelReference
  **/

  public String getFraudModelModelReference() {
    return fraudModelModelReference;
  }

  public void setFraudModelModelReference(String fraudModelModelReference) {
    this.fraudModelModelReference = fraudModelModelReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"this is the executable model specificaion\" 
   * @return fraudModelModel
  **/

  public String getFraudModelModel() {
    return fraudModelModel;
  }

  public void setFraudModelModel(String fraudModelModel) {
    this.fraudModelModel = fraudModelModel;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"the production transaction analysis results, including reference to any potential fraud transactions - note this will be a real-time dataset provided for decisioning\" 
   * @return fraudDetectionAnalysisRecord
  **/

  public Object getFraudDetectionAnalysisRecord() {
    return fraudDetectionAnalysisRecord;
  }

  public void setFraudDetectionAnalysisRecord(Object fraudDetectionAnalysisRecord) {
    this.fraudDetectionAnalysisRecord = fraudDetectionAnalysisRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"is the diagnosis record/recommendation developed by this Service Domain and returned to production where the response is applied\" 
   * @return fraudDetectionDiagnosisRecord
  **/

  public Object getFraudDetectionDiagnosisRecord() {
    return fraudDetectionDiagnosisRecord;
  }

  public void setFraudDetectionDiagnosisRecord(Object fraudDetectionDiagnosisRecord) {
    this.fraudDetectionDiagnosisRecord = fraudDetectionDiagnosisRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"is the production record containing all details and the result of the fraud decision assessment\" 
   * @return fraudDecisionRecord
  **/

  public Object getFraudDecisionRecord() {
    return fraudDecisionRecord;
  }

  public void setFraudDecisionRecord(Object fraudDecisionRecord) {
    this.fraudDecisionRecord = fraudDecisionRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"is the production record of the merchant fraud decisioning analysis activity\" 
   * @return merchantFraudDecisionAnalysisRecord
  **/

  public Object getMerchantFraudDecisionAnalysisRecord() {
    return merchantFraudDecisionAnalysisRecord;
  }

  public void setMerchantFraudDecisionAnalysisRecord(Object merchantFraudDecisionAnalysisRecord) {
    this.merchantFraudDecisionAnalysisRecord = merchantFraudDecisionAnalysisRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return merchantEvaluationResult
  **/

  public String getMerchantEvaluationResult() {
    return merchantEvaluationResult;
  }

  public void setMerchantEvaluationResult(String merchantEvaluationResult) {
    this.merchantEvaluationResult = merchantEvaluationResult;
  }


}

