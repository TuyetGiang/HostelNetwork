package com.giang.rest_api.impl;

import com.giang.rest_api.AppoinmentApi;
import com.giang.service.dto.AppointmentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class AppointmentController implements AppoinmentApi {
    @Override
    public ResponseEntity<List<AppointmentDTO>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<List<AppointmentDTO>> getAppointmentByTime(LocalDate startDateTime, LocalDate endDateTime) {
        return null;
    }
}
