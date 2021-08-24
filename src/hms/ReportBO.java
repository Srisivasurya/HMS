package hms;

import java.util.*;

public class ReportBO {

    public void getPatientDetails(Long patientId, String patientName, Map<Long, Patient> patientMap) throws Exception {

        Patient patient = new Patient();

        if (patientMap.isEmpty()) {
            throw new Exception("Patient Map is null");
        }
        if (patientName == null) {
            throw new Exception("Patient Name is null");
        }
        if (patientId == null) {
            throw new Exception("Patient ID is null");
        }
        if (patientMap.containsKey(patientId)) {
            patient = patientMap.get(patientId);
        }
        Patient patient1 = new Patient();
        Iterator<Long> itr = patientMap.keySet().iterator();
        while (itr.hasNext()) {
            patient1 = patientMap.get(itr.next());
            if (patient1.getPatientName().equals(patientName)) {
                System.out.println(" Patient detail for given patient name : " + patient1);
            }
        }
        System.out.println("");

    }

    public void displayOutPatient(Map<Long, Patient> patientMap) throws Exception {

        if (patientMap.isEmpty())
            throw new Exception("patient detail is null");

        Patient patient2 = new Patient();
        Iterator<Long> itr = patientMap.keySet().iterator();
        while (itr.hasNext()) {
            patient2 = patientMap.get(itr.next());
            if (patient2.getType().equals("OP")) {
                System.out.println(" out-patient detail : " + patient2);
            }
        }
        System.out.println("");
    }

    public void displayDoctor(Long doctorId,Map<Long,Appointment> appointmentMap) throws Exception {

        if(appointmentMap.isEmpty()){
            throw new Exception("Appointment Map is null");
        }
        if(doctorId == null){
            throw new Exception("Doctor ID is null");
        }

        Iterator<Long> itr = appointmentMap.keySet().iterator();
        while (itr.hasNext()){
            Appointment appointment = (Appointment) appointmentMap.keySet().iterator();
            if(appointment.getDoctor().getDoctorID()==doctorId){
                System.out.println("List of Doctor:"+appointment.getDoctor());
            }
        }
    }

    public void displayInPatient(Map<Long,InPatient> inPatientMap) throws Exception{
        if(inPatientMap.isEmpty()){
            throw new Exception("InPatient Map is empty");
        }
        InPatient inPatient = new InPatient();
        Iterator<Long> itr = inPatientMap.keySet().iterator();
        while(itr.hasNext()){
            inPatient = inPatientMap.get(itr.next());
            System.out.println("Inpatient List"+ inPatient.getPatientID());
        }
    }
}