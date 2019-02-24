package com.giang.service.impl;

import com.giang.repository.AppointmentRepository;
import com.giang.repository.entity.Appointment;
import com.giang.service.AppointmentService;
import com.giang.service.dto.AppointmentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<AppointmentDTO> getAll() {
        return appointmentRepository.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public List<AppointmentDTO> getAppointmentByTime(LocalDate from, LocalDate to) {
        return appointmentRepository.findByTime(from, to).stream().map(this::mapToDto).collect(Collectors.toList());
    }

    private AppointmentDTO mapToDto(Appointment entity) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(entity, AppointmentDTO.class);
    }
}
