package com.democode.soapApp.service;

import org.springframework.stereotype.Service;


@Service
public class StudentService {

    public wsdl.GetStudentResponse getStudent(int id) {
        wsdl.GetStudentResponse response = new wsdl.GetStudentResponse();

        if (id == 1) {
            response.setName("Theshika Navod");
            response.setAge(24);
            response.setCourse("Computer Engineering");
        } else {
            response.setName("Unknown");
            response.setAge(0);
            response.setCourse("N/A");
        }

        return response;
    }
}
