package com.tata.spring.ws;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.tata.spring.ws.proxies.EmployeeDetailsRequest;
import com.tata.spring.ws.proxies.EmployeeDetailsStatus;

@Endpoint
public class EmployeeDetailsEndpoint {

	@PayloadRoot(localPart="EmployeeDetailsRequest" , namespace="http://com.tata.hpe")
	public @ResponsePayload EmployeeDetailsStatus getEmpDetails(@RequestPayload EmployeeDetailsRequest request){
		EmployeeDetailsStatus status = new EmployeeDetailsStatus();
		status.setStatus("Ok "+request.getEmployeeId()+" "+request.getEmployeeName());
		return status;
	}
}
