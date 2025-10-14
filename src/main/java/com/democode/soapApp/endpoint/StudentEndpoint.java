package com.democode.soapApp.endpoint;

import org.springframework.ws.server.endpoint.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.democode.soapApp.service.StudentService;

@Endpoint
public class StudentEndpoint {

    private static final String NAMESPACE_URI = "http://www.democode.com/soapApp/wsdl";

    @Autowired
    private StudentService studentService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
    @ResponsePayload
    public wsdl.GetStudentResponse getStudent(@RequestPayload wsdl.GetStudentRequest request) {
        return studentService.getStudent(request.getId());
    }
}
