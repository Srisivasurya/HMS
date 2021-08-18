package HospitalSystem;

import java.util.Map;
import java.util.Date;
import java.util.Iterator;
import java.util.*;

public class AppointmentBO {
    public void createAppointment(Long patientId, Map<Long,Patient> patientMap,Long doctorId, Map<Long,Doctor>doctorMap
            ,String purposeOfVisit, String dateOfVisit, Map<Long,Appointment> appointmentMap) throws Exception {

        if(patientId == null){
            throw new Exception("Patient ID is null");
        }
        if (patientMap.isEmpty()) {
            throw new Exception("patientMap is null");
        }
        if (doctorId == null) {
            throw new Exception("doctor id is null");
        }
        if (doctorMap.isEmpty()) {
            throw new Exception("doctorMap is null");
        }
        if (appointmentMap.isEmpty()) {
            throw new Exception("appointmentMap is null");
        }
        if (purposeOfVisit == null) {
            throw new Exception("purposeOfVisit is null");
        }

        Patient p = new Patient();
        if (patientMap.containsKey(patientId)) {
            p = patientMap.get(patientId);
        }
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(GenerateAID.getId(new ArrayList<>(appointmentMap.keySet())));
        appointment.setDateofVisit(dateOfVisit);
        appointment.setDoctor(doctorMap.get(doctorId));
        appointment.setPatient(p);
        appointment.setPurposeOfVisit(purposeOfVisit);
        appointment.setFirstVisit(true);

        Iterator<Long> iter = appointmentMap.keySet().iterator();
        Appointment appt = new Appointment();
        Long appointmentId;
        while (iter.hasNext()) {
            appointmentId = iter.next();
            appt = appointmentMap.get(appointmentId);
            if (appt.getPatient() != null && appt.getPatient().getPatientId() == patientId) {
                appointment.setFirstVisit(false);
                break;
            }
        }
        appointmentMap.put(appointment.getAppointmentId(), appointment);

    }

}






