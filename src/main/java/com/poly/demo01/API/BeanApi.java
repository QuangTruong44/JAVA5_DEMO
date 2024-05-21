package com.poly.demo01.API;

import com.poly.demo01.Bean.SchoolInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java5-B4")
public class BeanApi {
    @Autowired
    @Qualifier("SchoolInformationConfig")
    SchoolInformation schoolInformation;
    @GetMapping("/getSchoolInformation")
    public ResponseEntity<?> doGetSchoolInformation() {
//        SchoolInformation schoolInformation = new SchoolInformation();
//        schoolInformation.setFullName("FPTPOLY");
//        schoolInformation.setLocation("TPHCM");
        return ResponseEntity.ok(schoolInformation);
    }
}
