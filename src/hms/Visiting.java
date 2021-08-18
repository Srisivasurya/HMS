package HospitalManagement;

public class Visiting {
    private Long visitId;
    private Appointment appointment;
    private String doctorRecommendation;
    private String medicine;
    private Boolean followUpNeeded;

    public Long getVisitId() {

        return visitId;
    }

    public void setVisitId(Long visitId) {

        this.visitId = visitId;
    }

    public Appointment getAppointment(Appointment appointment) {
        return this.appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
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

    public Boolean getFollowUpNeeded(){

        return followUpNeeded;
    }

    public void setFollowUpNeeded( Boolean followUpNeeded ){

        this.followUpNeeded = followUpNeeded;
    }

    public String toString() {
        return "VisitLogInformation{" + "visitId=" + visitId + ", appointment=" + appointment + ", doctorRecommendation='" + doctorRecommendation + '\'' + ", followUpNeed=" + followUpNeeded + '}';
    }
}

