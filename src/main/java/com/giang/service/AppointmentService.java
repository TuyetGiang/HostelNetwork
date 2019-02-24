package com.giang.service;

import com.giang.service.dto.AppointmentDTO;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentService {
    List<AppointmentDTO> getAll();

    List<AppointmentDTO> getAppointmentByTime(LocalDate from, LocalDate to);
}
