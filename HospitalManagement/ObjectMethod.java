package HospitalManagement;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ObjectMethod {
    private static Map <Long,Hospital> hospitalMap;

    private static Map<Long,Doctor> doctorMap;

    private static Map<Long,Patient> patientMap;

    private static Map <Long,Medicine> medicineMap;
    private static Medicine medicine;
    private static List<Medicine> medicineList;
    private static Medicine medicineMonopril;
    private static Medicine medicineVecuronium;
    private static Medicine medicineAvelumab;
    private static Medicine medicineNystan;

    private static Map <Long,Appointment> appointmentMap;

    static private Map<Long, InPatient> inPatientMap;

    private static Map<Long,Visiting> visitingMap;;

    static private Map<Long, Bed> bedMap;

    static {

        hospitalMap = new HashMap<>();

        Hospital hospital = getHospital(1011l,"Frontline Hospital","Chennai");

        hospitalMap.put(hospital.getHospitalId(), hospital);

        doctorMap = new HashMap<>();

        Doctor doctorSurya = getDoctor(0001l,"Dr.SivaSurya","Cardialogy");
        Doctor doctorRamesh = getDoctor(0002l,"Dr. RameshNatarajan","Orthopedics");
        Doctor doctorGuru = getDoctor(0003l,"Dr. Gurunathan","Dermatalogist");
        Doctor doctorDeepa = getDoctor(0004l,"Dr. Deepa","Otolaryngologist");

        doctorMap.put(doctorSurya.getDoctorID(), doctorSurya);
        doctorMap.put(doctorRamesh.getDoctorID(), doctorRamesh);
        doctorMap.put(doctorGuru.getDoctorID(), doctorGuru);
        doctorMap.put(doctorDeepa.getDoctorID(), doctorDeepa);

        patientMap = new HashMap<>();

        Patient patientSivahari = getPatient(101l,"Sivahari",12/11/2001,"9452154268","Outpatient");
        Patient patientChandhra = getPatient(102l,"Chandhra",01/02/1999,"7397511890","Outpatient");
        Patient patientLaxmi = getPatient(103l,"Laxmi",10/11/1997,"7505545896","Outpatient");
        Patient patientBadsha = getPatient(104l,"Badsha",20/01/2002,"8524596210","Outpatient");

        patientMap.put(patientSivahari.getPatientId(), patientSivahari);
        patientMap.put(patientChandhra.getPatientId(), patientChandhra);
        patientMap.put(patientLaxmi.getPatientId(), patientLaxmi);
        patientMap.put(patientBadsha.getPatientId(), patientBadsha);

        medicineMap = new HashMap<>();
        medicineMonopril = new Medicine();
        medicineMonopril.setMedicineName( "Monopril" );
        medicineMonopril.setMedicineId(1001L);
        medicineMonopril.setBatchNumber(2001L);
        medicineMonopril.setExpiryDate(new Date(2023,02,12));
        medicineMonopril.setPurposeOfMedicine("For clearing blood clot");

        medicineVecuronium = new Medicine();
        medicineVecuronium.setMedicineName( "Vecuronium" );
        medicineVecuronium.setMedicineId(1002L);
        medicineVecuronium.setBatchNumber(2002L);
        medicineVecuronium.setExpiryDate(new Date(2023,04,15));
        medicineVecuronium.setPurposeOfMedicine("For Bone strength");


        medicineAvelumab = new Medicine();
        medicineAvelumab.setMedicineName( "Avelumab" );
        medicineAvelumab.setMedicineId(1003L);
        medicineAvelumab.setBatchNumber(2003L);
        medicineAvelumab.setExpiryDate(new Date(2023,06,25));
        medicineAvelumab.setPurposeOfMedicine("For Skin Disease");

        medicineNystan = new Medicine();
        medicineNystan .setMedicineName( "Nystan" );
        medicineNystan .setMedicineId(1004L);
        medicineNystan .setBatchNumber(2004L);
        medicineNystan .setExpiryDate(new Date(2023,07,28));
        medicineNystan .setPurposeOfMedicine("For Nose and Tongue Problem");

        medicineMap.put(medicineMonopril.getMedicineId(),medicineMonopril);
        medicineMap.put(medicineVecuronium.getMedicineId(),medicineVecuronium);
        medicineMap.put(medicineAvelumab.getMedicineId(), medicineAvelumab);
        medicineMap.put(medicineNystan.getMedicineId(), medicineNystan);


        appointmentMap= new HashMap<>();

        Appointment appointmentOne = getAppointment("04/04/2021",patientMap.get(101L),doctorMap.get(001L),1L,"For Heart Problem",false,95.5F,80F);
        Appointment appointmentTwo = getAppointment("05/10/2021",patientMap.get(102L),doctorMap.get(002L),2L,"For Bone Fracture",false,94.5F,81F);
        Appointment appointmentThree = getAppointment("15/04/2021",patientMap.get(103L),doctorMap.get(003L),3L,"For Skin Allergy",false,92.5F,82.3F);
        Appointment appointmentFour = getAppointment("25/04/2021",patientMap.get(104L),doctorMap.get(004L),4L,"For Tongue Problem",false,94.5F,84.3F);

        appointmentMap.put(appointmentOne.getAppointmentId(), appointmentOne);
        appointmentMap.put(appointmentTwo.getAppointmentId(), appointmentTwo);
        appointmentMap.put(appointmentThree.getAppointmentId(), appointmentThree);
        appointmentMap.put(appointmentFour.getAppointmentId(), appointmentFour);

        bedMap = new HashMap<>();

        Bed bedOne = getBed(01l,"Normal Bed","01");
        Bed bedTwo = getBed(02l,"Normal Bed","02");
        Bed bedThree = getBed(03l,"Normal Bed","03");
        Bed bedFour = getBed(04l,"Normal Bed","04");
        Bed bedFive= getBed(05l,"Normal Bed","05");

        bedMap.put(bedOne.getBedId(), bedOne);
        bedMap.put(bedTwo.getBedId(), bedTwo);
        bedMap.put(bedThree.getBedId(), bedThree);
        bedMap.put(bedFour.getBedId(), bedFour);
        bedMap.put(bedFive.getBedId(), bedFive);

    }

    static public List<Medicine> getMedicine() {

        medicineList = new ArrayList<>();

        Random random = new Random();
        int randomNumber;
        for (int i = 0; i < 3; i++) {
            randomNumber = random.nextInt(5);
            if (medicineMap.containsKey(new Long(randomNumber)))
                medicineList.add(medicineMap.get(new Long(randomNumber)));
        }

        return medicineList;
    }

    static public void populateVisitInformation() {

        visitingMap =new HashMap<>();

        Visiting visitingOne = getVisiting(010L,appointmentMap.get(1L),"Walk Regularly","Monopril",true);
        Visiting visitingTwo = getVisiting(020L,appointmentMap.get(2L),"Take proper rest and relax","Vecuronium",true);
        Visiting visitingThree = getVisiting(030L,appointmentMap.get(3L),"Take sunlight at morning and evening","Avelumab",true);
        Visiting visitingFour = getVisiting(040L,appointmentMap.get(4L),"Do Medication","Nystan",true);

        visitingMap.put(visitingOne.getVisitId(), visitingOne);
        visitingMap.put(visitingTwo.getVisitId(), visitingTwo);
        visitingMap.put(visitingThree.getVisitId(), visitingThree);
        visitingMap.put(visitingFour.getVisitId(), visitingFour);

    }

    public static void main(String args[]){

        populateVisitInformation();



    }
    /**
     * @param doctorId
     * @param doctorName
     * @param specialisation
     * @return
     */
   private static Doctor getDoctor(Long doctorId,String doctorName,String specialisation){
       Doctor doctor = new Doctor();
       doctor.setDoctorName(doctorName);
       doctor.setDoctorID(doctorId);
       doctor.setSpecialisation(specialisation);
       return doctor;
   }

    private static Hospital getHospital(Long hospitalId,String hospitalName,String hospitalLocation){
        Hospital hospital = new Hospital();
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalLocation(hospitalLocation);
        return hospital;
    }

    private static Patient getPatient(Long patientId, String patientName, int patientDOB, String phoneNumber, String type){
        Patient patient = new Patient();
        patient.setPatientName(patientName);
        patient.setPatientId(patientId);
        patient.setPatientDOB(patientDOB);
        patient.setPhoneNumber(phoneNumber);
        patient.setType(phoneNumber);
        return patient;
    }

    private static Bed getBed(Long bedId, String bedType,String roomName){
        Bed bed = new Bed();
        bed.setBedId(bedId);
        bed.setBedType(bedType);
        bed.setRoomName(roomName);
        return bed;
    }

    private static Appointment getAppointment(String dateOfVisit,Patient patient,Doctor doctor,Long appointmentId,
                                              String purposeOfVisit,boolean firstVisit,Float patientBP,Float patientTemperature){

       Appointment appointment = new Appointment();
       appointment.setDateofVisit(dateOfVisit);
       appointment.setPatient(patient);
       appointment.setDoctor(doctor);
       appointment.setAppointmentId(appointmentId);
       appointment.setPurposeOfVisit(purposeOfVisit);
       appointment.setFirstVisit(firstVisit);
       appointment.setPatientBP(patientBP);
       appointment.setTemperature(patientTemperature);
       return appointment;
   }
   private static Visiting getVisiting(Long visitId,Appointment appointment,String doctorRecommendation,String medicine,Boolean followUpNeeded){
       Visiting visiting = new Visiting();
       visiting.setVisitId(visitId);
       visiting.setAppointment(appointment);
       visiting.setDoctorRecommendation(doctorRecommendation);
       visiting.setMedicine(medicine);
       visiting.setFollowUpNeeded(followUpNeeded);
       return visiting;
   }

   private static Medicine getMedicine(){}
}
