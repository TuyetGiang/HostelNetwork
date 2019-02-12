package com.giang.rest_api;

import com.giang.service.dto.RateDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Component
@RequestMapping("/rates")
public interface RateApi {
    @ApiOperation(tags = {"RATE"}, value = "Get all rates", response = RateDTO.class)
    @GetMapping("")
    ResponseEntity<List<RateDTO>> getAll();

    @ApiOperation(tags = {"RATE"}, value = "Get all rates is create between 2 time", response = RateDTO.class)
    @GetMapping("/times")
    ResponseEntity<List<RateDTO>> getRateByTime(@RequestParam("start") LocalDate startDate,
                                                @RequestParam("end") LocalDate endDate);

    @ApiOperation(tags = {"RATE"}, value = "Delete all rates is create by a user_id who is blocked", response = RateDTO.class)
    @DeleteMapping("/{user_id}")
    ResponseEntity<Integer> deleteAllRateOfBlockUser(@PathVariable("user_id") Integer userId);

}
