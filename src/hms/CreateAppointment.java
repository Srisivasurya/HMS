package HospitalManagement;

import java.util.Map;
import java.util.Date;
import java.util.Iterator;
import java.util.*;

public class CreateAppointment {
    public void createAppointment(Long patientID, Map<Long,Patient> patientMap,Long doctorID, Map<Long,Doctor>doctorMap
            ,String purposeofVisit, String dateOfVisit, Map<Long,Appointment> appointmentMap) throws Exception {

        if(patientID == null){
            throw new Exception("Patient ID is null");
        }
        if (patientMap.isEmpty()) {
            throw new Exception("patientMap is null");
        }
        if (doctorID == null) {
            throw new Exception("doctor id is null");
        }
        if (doctorMap.isEmpty()) {
            throw new Exception("doctorMap is null");
        }
        if (appointmentMap.isEmpty()) {
            throw new Exception("appointmentMap is null");
        }
        if (purposeofVisit == null) {
            throw new Exception("purposeOfVisit is null");
        }

        Patient p = new Patient();
        if (patientMap.containsKey(patientID)) {
            p = patientMap.get(patientID);
        }
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(GenerateAID.getId(new ArrayList<>(appointmentMap.keySet())));
        appointment.setDateofVisit(dateOfVisit);
        appointment.setDoctor(doctorMap.get(doctorID));
        appointment.setPatient(p);
        appointment.setPurposeOfVisit(purposeofVisit);
        appointment.setFirstVisit(true);

        Iterator<Long> iter = appointmentMap.keySet().iterator();
        Appointment appt = new Appointment();
        Long appointmentId;
        while (iter.hasNext()) {
            appointmentId = iter.next();
            appt = appointmentMap.get(appointmentId);
            if (appt.getPatient() != null && appt.getPatient().getPatientId() == patientID) {
                appointment.setFirstVisit(false);
                break;
            }
        }
        appointmentMap.put(appointment.getAppointmentId(), appointment);

    }

}






