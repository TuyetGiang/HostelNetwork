package com.giang.rest_api.impl;

import com.giang.rest_api.AppoinmentApi;
import com.giang.service.AppointmentService;
import com.giang.service.dto.AppointmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class AppointmentController implements AppoinmentApi {

    @Autowired
    AppointmentService appointmentService;

    @Override
    public ResponseEntity<List<AppointmentDTO>> getAll() {
        return ResponseEntity.ok(appointmentService.getAll());
    }

    @Override
    public ResponseEntity<List<AppointmentDTO>> getAppointmentByTime(@RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
                                                                     @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return ResponseEntity.ok(appointmentService.getAppointmentByTime(from, to));
    }
}
