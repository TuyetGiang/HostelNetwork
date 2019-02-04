package com.giang.rest_api;

import com.giang.service.dto.BenefitDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RequestMapping("/benefits")
public interface BenefitApi {
    @ApiOperation(tags = "BENEFIT", value = "Create new benefit", response = BenefitDTO.class)
    @PostMapping("")
    ResponseEntity<BenefitDTO> insert(@RequestBody BenefitDTO dto);

    @ApiOperation(tags = "BENEFIT", value = "Delete a benefit", response = BenefitDTO.class)
    @DeleteMapping("/{id}")
    ResponseEntity<Boolean> delete(@PathVariable("id") Integer id);


    @ApiOperation(tags = "BENEFIT", value = "Update a benefit", response = BenefitDTO.class)
    @PutMapping("/{id}")
    ResponseEntity<BenefitDTO> update(@PathVariable("id") Integer id,
                                      @RequestParam("key") String key,
                                      @RequestParam("value") Object value);

    @ApiOperation(tags = "BENEFIT", value = "Get all benefit", response = BenefitDTO.class)
    @GetMapping("")
    ResponseEntity<List<BenefitDTO>> getAll();

    @ApiOperation(tags = "BENEFIT", value = "Get a benefit", response = BenefitDTO.class)
    @GetMapping("/{id}")
    ResponseEntity<BenefitDTO> getBenefit(@PathVariable("id") Integer id);


}
