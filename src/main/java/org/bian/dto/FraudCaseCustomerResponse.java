package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudCaseCustomerResponse
 */
public class FraudCaseCustomerResponse   {
  private String fraudDecisionReference = null;

  private String customerFraudDecisionAnalysisReference = null;

  private String fraudModelModelReference = null;

  private String fraudModelModel = null;

  private Object fraudDetectionAnalysisRecord = null;

  private Object fraudDetectionDiagnosisRecord = null;

  private Object fraudDecisionRecord = null;

  private Object customerFraudDecisionAnalysisRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the specific fraud decision assessment\" 
   * @return fraudDecisionReference
  **/

  public String getFraudDecisionReference() {
    return fraudDecisionReference;
  }

  public void setFraudDecisionReference(String fraudDecisionReference) {
    this.fraudDecisionReference = fraudDecisionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the action to perform customer related fraud decision analysis\" 
   * @return customerFraudDecisionAnalysisReference
  **/

  public String getCustomerFraudDecisionAnalysisReference() {
    return customerFraudDecisionAnalysisReference;
  }

  public void setCustomerFraudDecisionAnalysisReference(String customerFraudDecisionAnalysisReference) {
    this.customerFraudDecisionAnalysisReference = customerFraudDecisionAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"this is the reference to the customer fraud decision model\" 
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"is the production record of the customer fraud decisioning analysis activity\" 
   * @return customerFraudDecisionAnalysisRecord
  **/

  public Object getCustomerFraudDecisionAnalysisRecord() {
    return customerFraudDecisionAnalysisRecord;
  }

  public void setCustomerFraudDecisionAnalysisRecord(Object customerFraudDecisionAnalysisRecord) {
    this.customerFraudDecisionAnalysisRecord = customerFraudDecisionAnalysisRecord;
  }


}

