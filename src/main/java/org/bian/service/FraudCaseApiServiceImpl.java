/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FraudCaseApiServiceImpl implements FraudCaseApiService {

	public FraudCaseCustomerEvaluationResponse evaluateCustomers(String crReferenceId, FraudCaseCustomerRequest request){
		return JsonReader.read("evaluate-FraudCaseCustomerEvaluationResponse.json",new TypeReference<FraudCaseCustomerEvaluationResponse>(){});
	}
	
	public FraudCaseIntermediaryEvaluationResponse evaluateIntermediaries(String crReferenceId, FraudCaseIntermediaryRequest request){
		return JsonReader.read("evaluate-FraudCaseIntermediaryEvaluationResponse.json",new TypeReference<FraudCaseIntermediaryEvaluationResponse>(){});
	}
	
	public FraudCaseMerchantEvaluationResponse evaluateMerchants(String crReferenceId, FraudCaseMerchantRequest request){
		return JsonReader.read("evaluate-FraudCaseMerchantEvaluationResponse.json",new TypeReference<FraudCaseMerchantEvaluationResponse>(){});
	}
	
	public FraudCaseRecordResponse record(String crReferenceId, FraudCaseRecordRequest request){
		return JsonReader.read("record-FraudCaseRecordResponse.json",new TypeReference<FraudCaseRecordResponse>(){});
	}
	
	public FraudCaseRequestResponse requestPost(String sdReferenceId, FraudCaseRequestRequest request){
		return JsonReader.read("requestPost-FraudCaseRequestResponse.json",new TypeReference<FraudCaseRequestResponse>(){});
	}
	
	public FraudCaseResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-FraudCaseResponse.json",new TypeReference<FraudCaseResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public FraudCaseCustomerResponse retrieveCustomers(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudCaseCustomerResponse.json",new TypeReference<FraudCaseCustomerResponse>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public FraudCaseIntermediaryResponse retrieveIntermediaries(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudCaseIntermediaryResponse.json",new TypeReference<FraudCaseIntermediaryResponse>(){});
	}
	
	public FraudCaseMerchantResponse retrieveMerchants(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudCaseMerchantResponse.json",new TypeReference<FraudCaseMerchantResponse>(){});
	}
	
}
