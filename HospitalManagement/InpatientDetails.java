package HospitalManagement;

import java.util.Map;

class InPatientDetails {

    public void allocateBedForINPatient(Long patientId, Map<Long, InPatient> inPatientDetails,
                                        Map<Long, Bed> bedDetails, String bedType, String roomName) throws Exception {

        System.out.println("hi");

        if (patientId == null) {
            throw new Exception("InValid InPatient Id : ");
        }
        if (inPatientDetails.isEmpty()) {
            throw new Exception("InPatient Details is Empty : ");
        }
        if (bedDetails.isEmpty()) {
            throw new Exception("BedDetails Is Empty : ");
        }

        if (bedType == null) {
            throw new Exception("Bed Is Not Available : ");
        }
        if (roomName == null) {
            throw new Exception("Room Is Not Available : ");
        }

        InPatient inPatient = null;
        if (inPatientDetails.containsKey(patientId)) {
            inPatient = inPatientDetails.get(patientId);
            System.out.println(inPatient);
        }
    }
}