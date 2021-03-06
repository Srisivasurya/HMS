package hms;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
class InPatientBO {

    public void allocateBed(Long patientId, Map<Long, Patient> patientMap,Long patientID, Map<Long, InPatient> inPatientMap,
                            Long bedId,Map<Long, Bed> bedMap, String bedType, String roomName) throws Exception {

        InPatient inPatient = new InPatient();

        if (patientID == null) {
            throw new Exception("InValid InPatient Id : ");
        }
        if (inPatientMap.isEmpty()) {
            throw new Exception("InPatient Detail is Empty : ");
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

        Patient patient;
        if (patientMap.containsKey(patientId)) {
            patient = patientMap.get(patientId);
        } else {
            throw new Exception("Patient is not Available : ");
        }

        inPatient.setIpIdentificationNumber(GenerateIPNumber.getIpIdentificationNumber(new ArrayList<Long>(inPatientMap.keySet())));

        if(patient.getType().equals("IP")){
            inPatient.setPatientId(patientId);
            inPatient.setBed(bedId);
        }
        else{
            throw new Exception("No Bed for Out Patient");
        }
        inPatientMap.put(inPatient.getIpIdentificationNumber(),inPatient);
    }


    public void allocateBed(long l, Map<Long,Patient> patientMap , long l1, Map<Long, InPatient> inPatientMap,long l2,String s,Map<Long, Bed> bedMap){
    }

    public boolean checkPatientType(Map<Long,Visiting> visitingMap,Patient patient){

        Iterator<Long> iter = visitingMap.keySet().iterator();
        Visiting visiting = new Visiting();
        int visitcount = 0;
        while(iter.hasNext()){
            visiting = visitingMap.get(iter.next());
            if(visiting.getAppointment().getPatient().getPatientId() == patient.getPatientId()){
                visitcount++;
            }

            System.out.println("Visit Count"+visitcount);

            if(visitcount >= 3){
                patient.setType("IP");
                return true;
            }
        }
        return false;
    }
}



