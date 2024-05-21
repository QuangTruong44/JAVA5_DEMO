package com.poly.demo01.beanconfig;

import com.poly.demo01.Bean.SchoolInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolInformationConfig {
    @Bean("SchoolInformationConfig")
    public SchoolInformation schoolInformation(){
        SchoolInformation schoolInformation = new SchoolInformation();
        schoolInformation.setFullName("FPTPOLY-config");
        schoolInformation.setLocation("TPHCM");
        return schoolInformation;
    }
}
