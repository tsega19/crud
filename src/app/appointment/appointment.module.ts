// appointment.component.ts
import { Component, OnInit } from '@angular/core';
import { AppointmentService } from '../services/appointment.service';
import { Appointment } from '../appointment';

@Component({
  selector: 'app-appointment',
  templateUrl: './appointment.component.html',
  styleUrls: ['./appointment.component.css'],
})
export class AppointmentComponent implements OnInit {
  appointments: Appointment[] = [];

  constructor(private appointmentService: AppointmentService) {}

  ngOnInit(): void {
    this.loadAppointments();
  }

  private loadAppointments(): void {
    this.appointmentService.getAppointments().subscribe(
      (appointments) => {
        this.appointments = appointments;
      },
      (error) => {
        console.error('Error loading appointments:', error);
      }
    );
  }
}
