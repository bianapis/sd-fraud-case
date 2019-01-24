package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudCaseRecordRequest
 */
public class FraudCaseRecordRequest   {
  private String recordingRecordType = null;

  private Object recordingRecord = null;

  private String recordingRecordDateTime = null;

  private String empolyeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return recordingRecordType
  **/

  public String getRecordingRecordType() {
    return recordingRecordType;
  }

  public void setRecordingRecordType(String recordingRecordType) {
    this.recordingRecordType = recordingRecordType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return recordingRecord
  **/

  public Object getRecordingRecord() {
    return recordingRecord;
  }

  public void setRecordingRecord(Object recordingRecord) {
    this.recordingRecord = recordingRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return recordingRecordDateTime
  **/

  public String getRecordingRecordDateTime() {
    return recordingRecordDateTime;
  }

  public void setRecordingRecordDateTime(String recordingRecordDateTime) {
    this.recordingRecordDateTime = recordingRecordDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return empolyeeBusinessUnitReference
  **/

  public String getEmpolyeeBusinessUnitReference() {
    return empolyeeBusinessUnitReference;
  }

  public void setEmpolyeeBusinessUnitReference(String empolyeeBusinessUnitReference) {
    this.empolyeeBusinessUnitReference = empolyeeBusinessUnitReference;
  }


}

