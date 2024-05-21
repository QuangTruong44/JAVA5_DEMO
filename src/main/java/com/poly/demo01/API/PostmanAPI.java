package com.poly.demo01.API;

import Entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PostmanAPI {
    @GetMapping("/getStudentInformation")
        public ResponseEntity<?> doGetStudentInformation(Student student){
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Call api Success");
        result.put("status", true);
        result.put("data", student);
        return ResponseEntity.ok(result);
    }
}
