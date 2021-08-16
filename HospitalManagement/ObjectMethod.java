package HospitalManagement;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ObjectMethod {
    private static Map <Long,Hospital> hospitalMap;
    private static Hospital hospital;

    private static Map<Long,Doctor> doctorMap;
    private static Doctor doctorSurya;
    private static Doctor doctorRamesh;
    private static Doctor doctorGuru;
    private static Doctor doctorDeepa;

    private static Map<Long,Patient> patientMap;
    private static Patient patientSivahari;
    private static Patient patientChandhra;
    private static Patient patientLaxmi;
    private static Patient patientBadsha;
    private static Patient patientMuthu;

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

    private static Map<Long,Visiting> visitingMap;
    private static Visiting visitingOne;
    private static Visiting visitingTwo;
    private static Visiting visitingThree;
    private static Visiting visitingFour;


    static {

        hospitalMap = new HashMap<>();
        Hospital hospital = new Hospital();
        hospital.setHospitalName("Frontline Hospital");
        hospital.setHospitalID(0001l);
        hospital.setHospitalLocation("Chennai");
        hospitalMap.put(hospital.getHospitalID(), hospital);


        doctorMap = new HashMap<>();
        doctorSurya = new Doctor();
        doctorSurya.setDoctorName("Dr. SivaSurya");
        doctorSurya.setDoctorID(0001l);
        doctorSurya.setSpecialisation("Cardialogy");

        doctorRamesh = new Doctor();
        doctorRamesh.setDoctorName("Dr. RameshNatarajan");
        doctorRamesh.setDoctorID(0002l);
        doctorRamesh.setSpecialisation("Orthopedics");

        doctorGuru = new Doctor();
        doctorGuru.setDoctorName("Dr. Gurunathan");
        doctorGuru.setDoctorID(0003l);
        doctorGuru.setSpecialisation("Dermatalogist");

        doctorDeepa = new Doctor();
        doctorDeepa.setDoctorName("Dr. Deepa");
        doctorDeepa.setDoctorID(0004l);
        doctorDeepa.setSpecialisation("Otolaryngologist.");

        doctorMap.put(doctorSurya.getDoctorID(), doctorSurya);
        doctorMap.put(doctorRamesh.getDoctorID(), doctorRamesh);
        doctorMap.put(doctorGuru.getDoctorID(), doctorGuru);
        doctorMap.put(doctorDeepa.getDoctorID(), doctorDeepa);

        patientMap = new HashMap<>();
        patientSivahari = new Patient();
        patientSivahari.setPatientName("Sivahari");
        patientSivahari.setPatientID(101l);
        patientSivahari.setPatientDOB(new Date(2001,12,11));
        patientSivahari.setPhoneNumber("9452154268");
        patientSivahari.setTypeIpOp("OutPatient");

        patientChandhra = new Patient();
        patientChandhra.setPatientName("Chandhra");
        patientChandhra.setPatientID(102l);
        patientChandhra.setPatientDOB(new Date(1999,02,01));
        patientChandhra.setPhoneNumber("7397511890");
        patientChandhra.setTypeIpOp("OutPatient");

        patientLaxmi = new Patient();
        patientLaxmi.setPatientName("Laxmi");
        patientLaxmi.setPatientID(103l);
        patientLaxmi.setPatientDOB(new Date(1997,11,10));
        patientLaxmi.setPhoneNumber("7505545896");
        patientLaxmi.setTypeIpOp("OutPatient");

        patientBadsha = new Patient();
        patientBadsha.setPatientName("Badsha");
        patientBadsha.setPatientID(104l);
        patientBadsha.setPatientDOB(new Date(2002,01,20));
        patientBadsha.setPhoneNumber("8524596210");
        patientBadsha.setTypeIpOp("OutPatient");


        patientMap.put(patientSivahari.getPatientID(), patientSivahari);
        patientMap.put(patientChandhra.getPatientID(), patientChandhra);
        patientMap.put(patientLaxmi.getPatientID(), patientLaxmi);
        patientMap.put(patientBadsha.getPatientID(), patientBadsha);

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

        medicineMap.put(medicineMonopril.getBatchNumber(), medicineMonopril);
        medicineMap.put(medicineVecuronium.getBatchNumber(), medicineVecuronium);
        medicineMap.put(medicineAvelumab.getBatchNumber(), medicineAvelumab);
        medicineMap.put(medicineNystan.getBatchNumber(), medicineNystan);

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

        CreateAppointment ca = new CreateAppointment();

        Appointment appointment = ca.createAppointment(101L,patientMap,001L,doctorMap,
                " Chest Pain ",appointmentMap);


        System.out.println(appointment);

    }

}
