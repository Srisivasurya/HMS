package hms;

import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;

public class VisitInformation {
    private Long appointmentId;

    public Patient checkNoofVisit(Long appointmentID, Map<Long, Appointment> appointmentMap,
                                  String doctorRecommendation, String medicine, Boolean followUpNeeded,
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

        if (appointmentMap.isEmpty()){
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

        Patient patient = appointment.getPatient();

        Visiting visit = new Visiting();

        visit.setVisitId(GenerateVisitId.getVisitId(new ArrayList<>(visitingMap.keySet())));
        visit.setDoctorRecommendation(doctorRecommendation);
        visit.setMedicine(medicine);
        visit.setFollowUpNeeded(followUpNeeded);
        visit.setAppointment(appointment);

        visitingMap.put(visit.getVisitId(),visit);

        return patient;
    }


}

