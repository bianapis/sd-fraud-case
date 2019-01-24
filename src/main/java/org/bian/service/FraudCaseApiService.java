/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FraudCaseApiService {

	FraudCaseCustomerEvaluationResponse evaluateCustomers(String crReferenceId, FraudCaseCustomerRequest request);
	
	FraudCaseIntermediaryEvaluationResponse evaluateIntermediaries(String crReferenceId, FraudCaseIntermediaryRequest request);
	
	FraudCaseMerchantEvaluationResponse evaluateMerchants(String crReferenceId, FraudCaseMerchantRequest request);
	
	FraudCaseRecordResponse record(String crReferenceId, FraudCaseRecordRequest request);
	
	FraudCaseRequestResponse requestPost(String sdReferenceId, FraudCaseRequestRequest request);
	
	FraudCaseResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	FraudCaseCustomerResponse retrieveCustomers(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	FraudCaseIntermediaryResponse retrieveIntermediaries(String crReferenceId, String bqReferenceId);
	
	FraudCaseMerchantResponse retrieveMerchants(String crReferenceId, String bqReferenceId);
	
}
