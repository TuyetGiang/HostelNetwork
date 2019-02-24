package com.giang.repository;

import com.giang.repository.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    @Query("SELECT a FROM Appointment  a WHERE a.createDate >= ?1 AND a.createDate <= ?2")
    List<Appointment> findByTime(LocalDate from, LocalDate to);
}
