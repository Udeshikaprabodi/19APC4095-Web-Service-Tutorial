package com.example.assignment;

import jakarta.xml.ws.Endpoint;

public class StringManipulationServicePublisher {

    public static void main(String[] args) {
        String url = "http://localhost:8081/StringManipulationService";
        Endpoint.publish(url, new StringManipulationService());
        System.out.println("SOAP Web Service is running at " + url + "?wsdl");
    }
}
