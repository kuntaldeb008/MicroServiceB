package com.example.microserviceb.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

//import com.example.microserviceasdk.sdk.MicroserviceAService;

//import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MicroserviceBController {
  
	@Autowired
    private RestTemplate restTemplate;
	
   // private final ObjectMapper objectMapper = new ObjectMapper();

	/*
	 * autowiring it to fix "this.microserviceAService" is null
	 */
	/*@Autowired
	private MicroserviceAService microserviceAService;*/ 
	
	/*
	 * The response from the Microservice A is already in the JSON format. 
	 * you can directly return the responseFromMicroserviceA string without any additional processing
	 * If the responseFromMicroserviceA is not in the JSON format, then you would need to convert it to JSON using the ObjectMapper instance.
	 * The ObjectMapper is a powerful tool for serializing and deserializing JSON data in Java. If your response is a JSON object and not a string, you can create a POJO (Plain Old Java Object) class representing the structure of the JSON response and use the objectMapper to serialize it into JSON format. You can also use the objectMapper to deserialize JSON strings into Java objects.
	 */

    @GetMapping("/detailsfrommicroserviceaapi")
    public String getDetailsFromMicroserviceAApi() {
    	String microserviceAUrl = "http://localhost:8081/get/data";
    	String responseFromMicroserviceA = restTemplate.getForObject(microserviceAUrl, String.class);
    	//String jsonResponse = objectMapper.writeValueAsString(responseFromMicroserviceA);
       // return jsonResponse;
    	return responseFromMicroserviceA;
    }
    
   /* @GetMapping("/detailsfrommicroservicea")
    public List<String> getDetailsFromMicroserviceA() {
        return microserviceAService.returnDataFromServiceA();
    }*/

}
