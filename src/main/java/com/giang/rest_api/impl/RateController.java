package com.giang.rest_api.impl;

import com.giang.rest_api.RateApi;
import com.giang.service.dto.RateDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class RateController implements RateApi {
    @Override
    public ResponseEntity<List<RateDTO>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<List<RateDTO>> getRateByTime(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public ResponseEntity<Integer> deleteAllRateOfBlockUser(Integer userId) {
        return null;
    }
}
