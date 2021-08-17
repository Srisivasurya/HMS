package HospitalManagement;

import java.util.Map;
import java.util.Date;
import java.util.Iterator;
import java.util.*;

public class VisitInformation {
    private Long appointmentId;

    public Patient checkNoofVisit(Long appointmentID, Map<Long, Appointment> appointmentMap,
                                  String doctorRecommendation, String medicine, String followUpNeeded,
                                  Map<Long,Visiting> visitingMap ) throws Exception {

        if (appointmentID == null) {
            throw new Exception("AppoinmentID is null");
        }

        if (doctorRecommendation == null) {
            throw new Exception("Doctor Recomondation is null");
        }

        if (medicine == null) {
            throw new Exception("Medicine is null");
        }

        if(appointmentMap.isEmpty()){
            throw new Exception("Appointment is Empty");
        }

        if (followUpNeeded == null) {
            throw new Exception("FollowUpNedded is empty");
        }

        if (visitingMap.isEmpty()) {
            throw new Exception("Visiting Map is empty ");
        }

        Appointment appointment = new Appointment();
        if (appointmentMap.containsKey(appointmentID)) {
            appointment = appointmentMap.get(appointmentID);
        }

        Patient patient = appointment.getPatientID();

        Visiting visit = new Visiting();

        visit.setDoctorRecommendation(doctorRecommendation);
        visit.setMedicine(medicine);
        visit.setFollowUpNeeded(followUpNeeded);

        return null;
    }

}
