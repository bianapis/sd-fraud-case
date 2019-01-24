package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudCaseResponse
 */
public class FraudCaseResponse   {
  private String fraudDecisionReference = null;

  private String fraudDecisionDecision = null;

  private Object fraudDecisionResponse = null;

  private Object fraudDecisionRecord = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"captures the result of the fraud assessment analysis\" 
   * @return fraudDecisionDecision
  **/

  public String getFraudDecisionDecision() {
    return fraudDecisionDecision;
  }

  public void setFraudDecisionDecision(String fraudDecisionDecision) {
    this.fraudDecisionDecision = fraudDecisionDecision;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"lists the actions required in response the fraud decision\" 
   * @return fraudDecisionResponse
  **/

  public Object getFraudDecisionResponse() {
    return fraudDecisionResponse;
  }

  public void setFraudDecisionResponse(Object fraudDecisionResponse) {
    this.fraudDecisionResponse = fraudDecisionResponse;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"is the production record containing all details and the result of   the fraud decision assessment\" 
   * @return fraudDecisionRecord
  **/

  public Object getFraudDecisionRecord() {
    return fraudDecisionRecord;
  }

  public void setFraudDecisionRecord(Object fraudDecisionRecord) {
    this.fraudDecisionRecord = fraudDecisionRecord;
  }


}

