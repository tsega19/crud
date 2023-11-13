package com.patientportal.Appointment.AppointmentRepository;

import com.patientportal.Appointment.AppointmentModel.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}