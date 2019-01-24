package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudCaseIntermediaryRequest
 */
public class FraudCaseIntermediaryRequest   {
  private String fraudModelModelReference = null;

  private String fraudModelModel = null;

  private Object fraudDetectionAnalysisRecord = null;

  private Object fraudDetectionDiagnosisRecord = null;

  private Object fraudDecisionRecord = null;

  private Object intermediaryFraudDecisionAnalysisRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"this is the reference to the intermediary fraud decision model\" 
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"is the production record of the intermediary fraud decisioning analysis activity\" 
   * @return intermediaryFraudDecisionAnalysisRecord
  **/

  public Object getIntermediaryFraudDecisionAnalysisRecord() {
    return intermediaryFraudDecisionAnalysisRecord;
  }

  public void setIntermediaryFraudDecisionAnalysisRecord(Object intermediaryFraudDecisionAnalysisRecord) {
    this.intermediaryFraudDecisionAnalysisRecord = intermediaryFraudDecisionAnalysisRecord;
  }


}

