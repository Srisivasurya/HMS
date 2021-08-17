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
    private static Appointment appointmentOne;
    private static Appointment appointmentTwo;
    private static Appointment appointmentThree;
    private static Appointment appointmentFour;

    static private Map<Long, InPatient> inPatientMap;

    private static Map<Long,Visiting> visitingMap;
    private static Visiting visitingOne;
    private static Visiting visitingTwo;
    private static Visiting visitingThree;
    private static Visiting visitingFour;

    static private Map<Long, Bed> bedMap;
    static private Bed bedOne;
    static private Bed bedTwo;
    static private Bed bedThree;
    static private Bed bedFour;
    static private Bed bedFive;


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
        appointmentOne = new Appointment();
        appointmentOne.setAppointmentID(1L);
        appointmentOne.setPatientID(patientMap.get(101L));
        appointmentOne.setDoctorID(doctorMap.get(001L));
        appointmentOne.setDateofVisit(new Date(2021,04,05));
        appointmentOne.setPurposeofVisit("For Heart weakening");
        appointmentOne.setBP(95.5F);
        appointmentOne.setTemperature(80F);
        appointmentOne.setIsFirstVisit(false);

        appointmentTwo = new Appointment();
        appointmentTwo.setAppointmentID(2L);
        appointmentTwo.setPatientID(patientMap.get(102L));
        appointmentTwo.setDoctorID(doctorMap.get(002L));
        appointmentTwo.setDateofVisit(new Date(2021,04,10));
        appointmentTwo.setPurposeofVisit("For Bone Fracture");
        appointmentTwo.setBP(94.5F);
        appointmentTwo.setTemperature(81F);
        appointmentTwo.setIsFirstVisit(false);

        appointmentThree = new Appointment();
        appointmentThree.setAppointmentID(03L);
        appointmentThree.setPatientID(patientMap.get(103L));
        appointmentThree.setDoctorID(doctorMap.get(003L));
        appointmentThree.setDateofVisit(new Date(2021,04,15));
        appointmentThree.setPurposeofVisit("For Skin Allergy");
        appointmentThree.setBP(92.5F);
        appointmentThree.setTemperature(82.3F);
        appointmentThree.setIsFirstVisit(false);

        appointmentFour = new Appointment();
        appointmentFour.setAppointmentID(04L);
        appointmentFour.setPatientID(patientMap.get(104L));
        appointmentFour.setDoctorID(doctorMap.get(004L));
        appointmentFour.setDateofVisit(new Date(2021,04,15));
        appointmentFour.setPurposeofVisit("For Tongue Problem");
        appointmentFour.setBP(94.5F);
        appointmentFour.setTemperature(84.3F);
        appointmentFour.setIsFirstVisit(false);

        appointmentMap.put(appointmentOne.getAppointmentID(), appointmentOne);
        appointmentMap.put(appointmentTwo.getAppointmentID(), appointmentTwo);
        appointmentMap.put(appointmentThree.getAppointmentID(), appointmentThree);
        appointmentMap.put(appointmentFour.getAppointmentID(), appointmentFour);

        bedMap = new HashMap<>();
        bedOne = new Bed();
        bedOne.setBedID(01l);
        bedOne.setBedType("Normal Bed");
        bedOne.setRoomName("01");

        bedTwo = new Bed();
        bedTwo.setBedID(02l);
        bedTwo.setBedType("Normal Bed");
        bedTwo.setRoomName("02");

        bedThree = new Bed();
        bedThree.setBedID(03l);
        bedThree.setBedType("Normal Bed");
        bedThree.setRoomName("01");

        bedFour = new Bed();
        bedFour.setBedID(04l);
        bedFour.setBedType("Normal Bed");
        bedFour.setRoomName("04");

        bedFive = new Bed();
        bedFive.setBedID(05l);
        bedFive.setBedType("Normal Bed");
        bedFive.setRoomName("05");

        bedMap.put(bedOne.getBedID(), bedOne);
        bedMap.put(bedTwo.getBedID(), bedTwo);
        bedMap.put(bedThree.getBedID(), bedThree);
        bedMap.put(bedFour.getBedID(), bedFour);
        bedMap.put(bedFive.getBedID(), bedFive);

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
        visitingOne = new Visiting();
        visitingOne.setVisitID(010L);
        visitingOne.setAppointment(appointmentMap.get(1L));
        visitingOne.setDoctorRecommendation("Walk Regularly");
        visitingOne.setMedicine("Monopril");

        visitingTwo = new Visiting();
        visitingTwo.setVisitID(020L);
        visitingTwo.setAppointment(appointmentMap.get(2L));
        visitingTwo.setDoctorRecommendation("Take proper rest and relax");
        visitingTwo.setMedicine("Vecuronium");

        visitingThree = new Visiting();
        visitingThree.setVisitID(030L);
        visitingThree.setAppointment(appointmentMap.get(3L));
        visitingThree.setDoctorRecommendation("Take sunlight at morning and evening");
        visitingThree.setMedicine("Avelumab");

        visitingFour = new Visiting();
        visitingFour.setVisitID(040L);
        visitingFour.setAppointment(appointmentMap.get(4L));
        visitingFour.setDoctorRecommendation("Do medication");
        visitingFour.setMedicine("Nystan");

        visitingMap.put(visitingOne.getVisitID(), visitingOne);
        visitingMap.put(visitingTwo.getVisitID(), visitingTwo);
        visitingMap.put(visitingThree.getVisitID(), visitingThree);
        visitingMap.put(visitingFour.getVisitID(), visitingFour);

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
}
