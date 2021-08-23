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
}