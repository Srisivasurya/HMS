package HospitalManagement;

import java.util.Map;

class InPatientDetails {

    public void allocateBedForINPatient(Long patientID, Map<Long, InPatient> inPatientMap,
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

        InPatient inPatient = null;
        if (inPatientMap.containsKey(patientID)) {
            inPatient = inPatientMap.get(patientID);
            System.out.println(inPatient);
        }
    }
}