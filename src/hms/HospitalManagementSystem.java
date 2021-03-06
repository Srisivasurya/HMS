package hms;

import java.util.*;

public class HospitalManagementSystem {
    private static Map <Long,Hospital> hospitalMap;

    private static Map<Long,Doctor> doctorMap;

    private static Map<Long,Patient> patientMap;

    private static Map <Long,Medicine> medicineMap;

    private static Medicine medicine;

    private static List<Medicine> medicineList;

    private static Map <Long,Appointment> appointmentMap;

    private static Map<Long, InPatient> inPatientMap;

    private static Map<Long,Visiting> visitingMap;;

    private static Map<Long, Bed> bedMap;

    static {

        hospitalMap = new HashMap<>();

        Hospital hospital = getHospital(1011l,"Frontline Hospital","Chennai");

        hospitalMap.put(hospital.getHospitalId(), hospital);

        doctorMap = new HashMap<>();

        Doctor doctorSurya = getDoctor(0001l,"Dr.SivaSurya","Cardialogy");
        Doctor doctorRamesh = getDoctor(0002l,"Dr. RameshNatarajan","Orthopedics");
        Doctor doctorGuru = getDoctor(0003l,"Dr. Gurunathan","Dermatalogist");
        Doctor doctorDeepa = getDoctor(0004l,"Dr. Deepa","Otolaryngologist");
        Doctor doctorSiva = getDoctor(0005l,"Dr. Siva","Psychotist");

        doctorMap.put(doctorSurya.getDoctorID(), doctorSurya);
        doctorMap.put(doctorRamesh.getDoctorID(), doctorRamesh);
        doctorMap.put(doctorGuru.getDoctorID(), doctorGuru);
        doctorMap.put(doctorDeepa.getDoctorID(), doctorDeepa);
        doctorMap.put(doctorSiva.getDoctorID(), doctorSiva);

        patientMap = new HashMap<>();

        Patient patientSivahari = getPatient(101l,"Sivahari",12/11/2001,"9452154268","Outpatient");
        Patient patientChandhra = getPatient(102l,"Chandhra",01/02/1999,"7397511890","Outpatient");
        Patient patientLaxmi = getPatient(103l,"Laxmi",10/11/1997,"7505545896","Outpatient");
        Patient patientBadsha = getPatient(104l,"Badsha",20/01/2002,"8524596210","Outpatient");
        Patient patientBabu = getPatient(105l,"Babu",20/05/2002,"7397528910","Outpatient");

        patientMap.put(patientSivahari.getPatientId(), patientSivahari);
        patientMap.put(patientChandhra.getPatientId(), patientChandhra);
        patientMap.put(patientLaxmi.getPatientId(), patientLaxmi);
        patientMap.put(patientBadsha.getPatientId(), patientBadsha);
        patientMap.put(patientBabu.getPatientId(), patientBabu);

        medicineMap = new HashMap<>();

        Medicine medicineMonopril = getMedicine(1001L,"Monopril","12/02/2023",2001L,"For clearing blood clot");
        Medicine medicineVecuronium = getMedicine(1002L,"Vecuronium","15/04/2023",2002L,"For Bone strength");
        Medicine medicineAvelumab = getMedicine(1003L,"Aveluamb","25/06/2023",2003L,"For Skin Disease");
        Medicine medicineNystan = getMedicine(1004L,"Nystan","28/07/2023",2004L,"For Nose and Tongue Problem");
        Medicine medicineOrnlo = getMedicine(1005L,"Orlno","28/09/2023",2005L,"For relaxing mental stress");


        medicineMap.put(medicineMonopril.getMedicineId(),medicineMonopril);
        medicineMap.put(medicineVecuronium.getMedicineId(),medicineVecuronium);
        medicineMap.put(medicineAvelumab.getMedicineId(), medicineAvelumab);
        medicineMap.put(medicineNystan.getMedicineId(), medicineNystan);
        medicineMap.put(medicineOrnlo.getMedicineId(), medicineOrnlo);

        appointmentMap= new HashMap<>();

        Appointment appointmentOne = getAppointment("04/04/2021",patientMap.get(101L),doctorMap.get(001L),1L,"For Heart Problem",false,95.5F,80F);
        Appointment appointmentTwo = getAppointment("05/10/2021",patientMap.get(102L),doctorMap.get(002L),2L,"For Bone Fracture",false,94.5F,81F);
        Appointment appointmentThree = getAppointment("15/04/2021",patientMap.get(103L),doctorMap.get(003L),3L,"For Skin Allergy",false,92.5F,82.3F);
        Appointment appointmentFour = getAppointment("25/04/2021",patientMap.get(104L),doctorMap.get(004L),4L,"For Tongue Problem",false,94.5F,84.3F);
        Appointment appointmentFive = getAppointment("30/04/2021",patientMap.get(105L),doctorMap.get(005L),5L,"For Mental Stress",false,96.5F,83.3F);

        appointmentMap.put(appointmentOne.getAppointmentId(), appointmentOne);
        appointmentMap.put(appointmentTwo.getAppointmentId(), appointmentTwo);
        appointmentMap.put(appointmentThree.getAppointmentId(), appointmentThree);
        appointmentMap.put(appointmentFour.getAppointmentId(), appointmentFour);
        appointmentMap.put(appointmentFive.getAppointmentId(), appointmentFive);


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

    public static void populateVisitInformation() {

        visitingMap =new HashMap<>();

        Visiting visitingOne = getVisiting(010L,appointmentMap.get(101L),"Walk Regularly","Monopril",true);
        Visiting visitingTwo = getVisiting(020L,appointmentMap.get(102L),"Take proper rest and relax","Vecuronium",true);
        Visiting visitingThree = getVisiting(030L,appointmentMap.get(103L),"Take sunlight at morning and evening","Avelumab",true);
        Visiting visitingFour = getVisiting(040L,appointmentMap.get(104L),"Do Medication","Nystan",true);
        Visiting visitingFive = getVisiting(050L,appointmentMap.get(105L),"Keep mind stress free","Ornlo Medicine",true);

        visitingMap.put(visitingOne.getVisitId(), visitingOne);
        visitingMap.put(visitingTwo.getVisitId(), visitingTwo);
        visitingMap.put(visitingThree.getVisitId(), visitingThree);
        visitingMap.put(visitingFour.getVisitId(), visitingFour);
        visitingMap.put(visitingFive.getVisitId(), visitingFour);

    }

    public static void main(String args[]){

        populateVisitInformation();

        AppointmentBO appointmentBO = new AppointmentBO();

        try {
            appointmentBO.createAppointment(101L, patientMap,0001L,doctorMap,"For Heart Problem","04/04/2021",appointmentMap);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        InPatientBO inPatientBO = new InPatientBO();
        try {
            inPatientBO.allocateBed(102L,patientMap,102L,inPatientMap,01L,"01",bedMap);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        VisitInformation visitInfo = new VisitInformation();

        try {
            visitInfo.checkNoofVisit(102L,appointmentMap,"Take proper rest and relax","Vecuronium",true,visitingMap);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ReportBO rtBO = new ReportBO();
        try {
            rtBO.getPatientDetails(102L,"Chandra",patientMap);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            rtBO.displayOutPatient(patientMap);
        } catch (Exception e) {
            System.out.println(" Invalid Patient details : " + e.getMessage());
        }
        try{

            rtBO.displayDoctor(101L,appointmentMap);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            rtBO.displayInPatient(inPatientMap);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            rtBO.visitInfo(visitingMap,030L);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            rtBO.patientFollowUp(visitingMap);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

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

    private static Appointment getAppointment(String dateOfVisit, Patient patient, Doctor doctor, Long appointmentId,
                                              String purposeOfVisit, boolean firstVisit, Float patientBP, Float patientTemperature){

        Appointment appointment = new Appointment();
        appointment.setDateofVisit(DateUtility.getDate(dateOfVisit));
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

    private static Medicine getMedicine(Long medicineId,String medicineName,String expiryDate,Long batchNumber,
                                        String purchaseOfMedicine){
        Medicine medicine = new Medicine();
        medicine.setMedicineId(medicineId);
        medicine.setMedicineName(medicineName);
        medicine.setExpiryDate(expiryDate);
        medicine.setBatchNumber(batchNumber);
        medicine.setPurposeOfMedicine(purchaseOfMedicine);
        return medicine;
    }
}
