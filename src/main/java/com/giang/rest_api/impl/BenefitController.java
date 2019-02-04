package com.giang.rest_api.impl;

import com.giang.rest_api.BenefitApi;
import com.giang.service.dto.BenefitDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BenefitController implements BenefitApi {
    @Override
    public ResponseEntity<BenefitDTO> insert(@RequestBody BenefitDTO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<BenefitDTO> update(@PathVariable("id") Integer id,
                                             @RequestParam("key") String key,
                                             @RequestParam("value") Object value) {
        return null;
    }

    @Override
    public ResponseEntity<List<BenefitDTO>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<BenefitDTO> getBenefit(@PathVariable("id") Integer id) {
        return null;
    }
}
