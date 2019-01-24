/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;

import org.bian.annotation.BQ;
import org.bian.annotation.BianRestController;
import org.bian.annotation.functionalpattern.Assess;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.bian.dto.FraudCaseCustomerEvaluationResponse;
import org.bian.dto.FraudCaseCustomerRequest;
import org.bian.dto.FraudCaseCustomerResponse;
import org.bian.dto.FraudCaseIntermediaryEvaluationResponse;
import org.bian.dto.FraudCaseIntermediaryRequest;
import org.bian.dto.FraudCaseIntermediaryResponse;
import org.bian.dto.FraudCaseMerchantEvaluationResponse;
import org.bian.dto.FraudCaseMerchantRequest;
import org.bian.dto.FraudCaseMerchantResponse;
import org.bian.dto.FraudCaseRecordRequest;
import org.bian.dto.FraudCaseRecordResponse;
import org.bian.dto.FraudCaseRequestRequest;
import org.bian.dto.FraudCaseRequestResponse;
import org.bian.dto.FraudCaseResponse;
import org.bian.service.FraudCaseApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@BianRestController
public class FraudCaseApiController {

	@Autowired
	FraudCaseApiService service;
	
	@BQ("customers")
	@Assess.Evaluate
	public BianResponse<FraudCaseCustomerEvaluationResponse> evaluateCustomers(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudCaseCustomerRequest> bianRequest) {
		return BianResponse.forSuccess(service.evaluateCustomers(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("intermediaries")
	@Assess.Evaluate
	public BianResponse<FraudCaseIntermediaryEvaluationResponse> evaluateIntermediaries(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudCaseIntermediaryRequest> bianRequest) {
		return BianResponse.forSuccess(service.evaluateIntermediaries(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("merchants")
	@Assess.Evaluate
	public BianResponse<FraudCaseMerchantEvaluationResponse> evaluateMerchants(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudCaseMerchantRequest> bianRequest) {
		return BianResponse.forSuccess(service.evaluateMerchants(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Record
	public BianResponse<FraudCaseRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudCaseRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "{sd-reference-id}/requisition")
	public BianResponse<FraudCaseRequestResponse> requestPost(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<FraudCaseRequestRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Retrieve
	public BianResponse<FraudCaseResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("customers")
	@Assess.Retrieve
	public BianResponse<FraudCaseCustomerResponse> retrieveCustomers(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCustomers(crReferenceId, bqReferenceId));
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("intermediaries")
	@Assess.Retrieve
	public BianResponse<FraudCaseIntermediaryResponse> retrieveIntermediaries(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIntermediaries(crReferenceId, bqReferenceId));
	}
	
	@BQ("merchants")
	@Assess.Retrieve
	public BianResponse<FraudCaseMerchantResponse> retrieveMerchants(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMerchants(crReferenceId, bqReferenceId));
	}
	
}
