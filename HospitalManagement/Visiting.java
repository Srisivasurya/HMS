package HospitalManagement;

public class Visiting {
    private long visitID;
    private Appointment appointmentID;
    private String doctorRecommendation;
    private String medicine;
    private String followUpNeeded;

    public long getVisitID() {

        return visitID;
    }

    public void setVisitID(long visitID) {

        this.visitID = visitID;
    }

    public Appointment getAppointmentID(Appointment appointmentID) {
        return this.appointmentID;
    }

    public void setAppointment(Appointment appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getDoctorRecommendation(){

        return doctorRecommendation;
    }

    public void setDoctorRecommendation( String doctorRecommendation ){

        this.doctorRecommendation = doctorRecommendation;
    }

    public String getMedicine(){

        return medicine;
    }

    public void setMedicine( String medicine ){

        this.medicine = medicine;
    }

    public String getFollowUpNeeded(){

        return followUpNeeded;
    }

    public void setFollowUpNeeded( String followUpNeeded ){

        this.followUpNeeded = followUpNeeded;
    }

    public String toString() {
        return "VisitLogInformation{" + "visitId=" + visitID + ", appointment=" + appointmentID + ", doctorRecommendation='" + doctorRecommendation + '\'' + ", followUpNeed=" + followUpNeeded + '}';
    }
}

