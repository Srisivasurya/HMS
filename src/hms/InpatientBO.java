package hms;

import java.util.Map;

class InPatientBO {

    public void allocateBed(Long patientId, Map<Long, Patient> patientMap,Long patientID, Map<Long, InPatient> inPatientMap,
                            Map<Long, Bed> bedMap, String bedType, String roomName) throws Exception {

        System.out.println("hi");

        if (patientID == null) {
            throw new Exception("InValid InPatient Id : ");
        }
        if (inPatientMap.isEmpty()) {
            throw new Exception("InPatient Details is Empty : ");
        }
        if (bedMap.isEmpty()) {
            throw new Exception("BedDetails Is Empty : ");
        }

        if (bedType == null) {
            throw new Exception("Bed Is Not Available : ");
        }
        if (roomName == null) {
            throw new Exception("Room Is Not Available : ");
        }

        Patient patient = new Patient();
        if (patientMap.containsKey(patientId)) {
            patient = patientMap.get(patientId);
        } else {
            throw new Exception("Patient is not Available : ");
        }
    }

}


