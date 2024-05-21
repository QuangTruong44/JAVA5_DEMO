package com.poly.demo01.API;

import com.poly.demo01.dto.SinhVienDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/JV5B3")
public class ValidationApi {
    @PostMapping("/Validation-sever-side")
    public ResponseEntity<?>  doGetValidationSeverSide(@Valid @RequestBody SinhVienDTO sinhVien){
        Map<String, Object> resultApi = new HashMap<>();
        resultApi.put("status", true);
        resultApi.put("message", "Call Api Success");
        resultApi.put("data", sinhVien);
        return ResponseEntity.ok(resultApi);
    }
}
