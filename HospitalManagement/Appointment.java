
package HospitalManagement;

import java.util.Date;

public class Appointment {
    private String dateOfVisit;
    private Patient patient;
    private Doctor doctor;
    private Long appointmentId;
    private String purposeOfVisit;
    private boolean firstVisit;
    private Float patientBP;
    private Float patientTemperature;

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentID) {
        this.appointmentId = appointmentId;
    }


    public String getDateOfVisit(){

        return dateOfVisit;
    }

    public void setDateofVisit( String dateOfVisit ){

        this.dateOfVisit = dateOfVisit;
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {

        return doctor;
    }

    public void setDoctor(Doctor doctor) {

        this.doctor = doctor;
    }

    public String getPurposeOfVisit(){

        return purposeOfVisit;
    }

    public void setPurposeOfVisit( String purposeOfVisit ){

        this.purposeOfVisit = purposeOfVisit;
    }

    public String getFirstVisit(){

        return String.valueOf(firstVisit);
    }

    public void setFirstVisit(boolean firstVisit ){

        this.firstVisit = firstVisit;
    }

    public Float getPatientBP(){

        return patientBP;
    }

    public void setPatientBP( Float patientBP ){

        this.patientBP =  patientBP;
    }

    public Float getTemperature(){

        return patientTemperature;
    }

    public void setTemperature( Float temperature ){

        this.patientTemperature =  patientTemperature;
    }

    public String toString() {
        return "Appointment{" + "appointmentId=" + appointmentId + ", patient=" + patient + ", dateOfVisit=" + dateOfVisit + ", purposeOfVisit='" + purposeOfVisit + '\'' + ", FirstVisit=" + firstVisit + ", patient bp=" + patientBP + ", Patient temperature=" + patientTemperature + ", doctor=" + doctor +   '}';
    }


}
