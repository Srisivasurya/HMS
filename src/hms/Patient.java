package HospitalManagement;

public class Patient {
    private String patientName;
    private long patientId;
    private int patientDOB;
    private String phoneNumber;
    private String address;
    private String type;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientID) {
        this.patientId = patientId;
    }

    public int getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(int patientDOB) {
        this.patientDOB = patientDOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Patient{" + "patientId=" + patientId + ", patientName='" + patientName + '\'' + ", dob=" + patientDOB + ", phoneNumber='" + phoneNumber + '\'' + ", address='" + address + '\'' + ", patientType='" + type + '\'' + '}';
    }

}
