package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudCaseRequestRequest
 */
public class FraudCaseRequestRequest   {
  private String fraudModelModelReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"Refers to specific fraud decisioing models used\" 
   * @return fraudModelModelReference
  **/

  public String getFraudModelModelReference() {
    return fraudModelModelReference;
  }

  public void setFraudModelModelReference(String fraudModelModelReference) {
    this.fraudModelModelReference = fraudModelModelReference;
  }


}

