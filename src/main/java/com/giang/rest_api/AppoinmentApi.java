package com.giang.rest_api;

import com.giang.service.dto.AppointmentDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Component
@RequestMapping("/appointments")
public interface AppoinmentApi {
    @ApiOperation(tags = {"APPOINMENT"}, value = "Get all appointments", response = AppointmentDTO.class)
    @GetMapping("")
    ResponseEntity<List<AppointmentDTO>> getAll();

    @ApiOperation(tags = {"APPOINMENT"}, value = "Get all appointments is create between 2 time", response = AppointmentDTO.class)
    @GetMapping("/times")
    ResponseEntity<List<AppointmentDTO>> getAppointmentByTime(@RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
                                                              @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to);


}
