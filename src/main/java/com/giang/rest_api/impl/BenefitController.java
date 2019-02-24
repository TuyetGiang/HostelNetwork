package com.giang.rest_api.impl;

import com.giang.rest_api.BenefitApi;
import com.giang.service.BenefitService;
import com.giang.service.dto.BenefitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BenefitController implements BenefitApi {

    @Autowired
    BenefitService benefitService;

    @Override
    public ResponseEntity<BenefitDTO> insert(@RequestBody BenefitDTO dto) {
        return ResponseEntity.ok(benefitService.insertBenefit(dto));
    }

    @Override
    public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(benefitService.deleteBenefit(id));
    }

    @Override
    public ResponseEntity<BenefitDTO> changeName(@PathVariable("id") Integer id,
                                                 @RequestParam("benefitname") String benefitName) {
        return ResponseEntity.ok(benefitService.changeNameBenefit(id, benefitName));
    }

    @Override
    public ResponseEntity<List<BenefitDTO>> getAll() {
        return ResponseEntity.ok(benefitService.getAll());
    }

    @Override
    public ResponseEntity<BenefitDTO> getBenefit(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(benefitService.getABenefit(id));
    }
}
