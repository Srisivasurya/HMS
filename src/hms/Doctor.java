package HospitalManagement;

public class Doctor {

    private long doctorID;
    private String doctorName;
    private String specialisation;

    public long getDoctorID() {

        return doctorID;
    }

    public void setDoctorID(long doctorID) {

        this.doctorID = doctorID;
    }

    public String getDoctorName() {

        return doctorName;
    }

    public void setDoctorName(String doctorName) {

        this.doctorName = doctorName;
    }

    public String getSpecialisation() {

        return specialisation;
    }

    public void setSpecialisation(String specialisation) {

        this.specialisation = specialisation;
    }

    public String toString() {
        return "Doctor{" + "doctorId=" + doctorID + ", doctorName='" + doctorName + '\'' + ", specialisation='" + specialisation + '\'' + '}';
    }

}

