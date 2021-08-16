package HospitalManagement;

import java.util.Map;
import java.util.Date;
import java.util.Iterator;
import java.util.*;

public class CreateAppointment {
    public Appointment createAppointment(Long patientID, Map<Long,Patient> patientMap,Long doctorID, Map<Long,Doctor>doctorMap
            ,String purposeofVisit, Map<Long,Appointment> appointmentMap) {


        Patient p = new Patient();
        if (patientMap.containsKey(patientID)){
            p = patientMap.get(patientID);
        }



        Appointment newAppointment = new Appointment();
        newAppointment.setPurposeofVisit(purposeofVisit);
        newAppointment.setDoctorID(doctorMap.get(doctorID));
        newAppointment.setPatientID(patientMap.get(patientID));

        Iterator<Long> ite =  appointmentMap.keySet().iterator();
        Long appointmentID = 0L;

        while(ite.hasNext()) {

            appointmentID = ite.next();
            newAppointment = appointmentMap.get(appointmentID);
            if(newAppointment.getPatientID() != null && newAppointment.getPatientID().getPatientID()==appointmentID){
                newAppointment.setIsFirstVisit(false);
            }
            else{
                newAppointment.setIsFirstVisit(true);
            }
        }
        return newAppointment;
    }

}






