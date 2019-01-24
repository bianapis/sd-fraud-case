package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudCaseRequestResponse
 */
public class FraudCaseRequestResponse   {
  private String fraudDecisionAssessmentGuidanceTaskReference = null;

  private String fraudModelModel = null;

  private String fraudModelModelUsageGuidelines = null;

  private Object fraudDecisionAssessmentGuidanceTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"Refers to the task to provide production guidance and support with the use of fraud detection models\" 
   * @return fraudDecisionAssessmentGuidanceTaskReference
  **/

  public String getFraudDecisionAssessmentGuidanceTaskReference() {
    return fraudDecisionAssessmentGuidanceTaskReference;
  }

  public void setFraudDecisionAssessmentGuidanceTaskReference(String fraudDecisionAssessmentGuidanceTaskReference) {
    this.fraudDecisionAssessmentGuidanceTaskReference = fraudDecisionAssessmentGuidanceTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"This is the executable fraud decisioning model specification\" 
   * @return fraudModelModel
  **/

  public String getFraudModelModel() {
    return fraudModelModel;
  }

  public void setFraudModelModel(String fraudModelModel) {
    this.fraudModelModel = fraudModelModel;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Guidance on usage and result interpretation\" 
   * @return fraudModelModelUsageGuidelines
  **/

  public String getFraudModelModelUsageGuidelines() {
    return fraudModelModelUsageGuidelines;
  }

  public void setFraudModelModelUsageGuidelines(String fraudModelModelUsageGuidelines) {
    this.fraudModelModelUsageGuidelines = fraudModelModelUsageGuidelines;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"The processing record for the guidance task\" 
   * @return fraudDecisionAssessmentGuidanceTaskRecord
  **/

  public Object getFraudDecisionAssessmentGuidanceTaskRecord() {
    return fraudDecisionAssessmentGuidanceTaskRecord;
  }

  public void setFraudDecisionAssessmentGuidanceTaskRecord(Object fraudDecisionAssessmentGuidanceTaskRecord) {
    this.fraudDecisionAssessmentGuidanceTaskRecord = fraudDecisionAssessmentGuidanceTaskRecord;
  }


}

