
package HospitalManagement;

import java.util.Date;

public class Appointment {
    private String dateofVisit;
    private Patient patientID;
    private Doctor doctorID;
    private long appointmentID;
    private String purposeofVisit;
    private boolean isFirstVisit;
    private Float BP;
    private Float temperature;

    public long getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(long appointmentID) {
        this.appointmentID = appointmentID;
    }


    public String getDateofVisit(){

        return dateofVisit;
    }

    public void setDateofVisit( Date dateofVisit ){

        this.dateofVisit = String.valueOf(dateofVisit);
    }


    public Patient getPatientID() {
        return patientID;
    }

    public void setPatientID(Patient patientID) {
        this.patientID = patientID;
    }

    public Doctor getDoctorID() {

        return doctorID;
    }

    public void setDoctorID(Doctor doctorID) {

        this.doctorID = doctorID;
    }

    public String getPurposeofVisit(){

        return purposeofVisit;
    }

    public void setPurposeofVisit( String purposeofVisit ){

        this.purposeofVisit = purposeofVisit;
    }

    public String getIsFirstVisit(){

        return String.valueOf(isFirstVisit);
    }

    public void setIsFirstVisit(boolean isFirstVisit ){

        this.isFirstVisit = isFirstVisit;
    }

    public Float getBP(){

        return BP;
    }

    public void setBP( Float BP ){

        this.BP =  BP;
    }

    public Float getTemperature(){

        return temperature;
    }

    public void setTemperature( Float temperature ){

        this.temperature =  temperature;
    }

    public String toString() {
        return "Appointment{" + "appointmentId=" + appointmentID + ", patient=" + patientID + ", dateOfVisit=" + dateofVisit + ", purposeOfVisit='" + purposeofVisit + '\'' + ", isFirstVisit=" + isFirstVisit + ", bp=" + BP + ", temperature=" + temperature + ", doctor=" + doctorID +   '}';
    }


}
