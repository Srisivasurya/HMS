package HospitalManagement;

import java.util.Date;

public class Patient {
    private String patientName;
    private long patientID;
    private String patientDOB;
    private String phoneNumber;
    private String address;
    private String typeIpOp;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public String getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(Date patientDOB) {
        this.patientDOB = String.valueOf(patientDOB);
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

    public String getTypeIpOp() {
        return typeIpOp;
    }

    public void setTypeIpOp(String typeIpOp) {
        this.typeIpOp = typeIpOp;
    }

    public String toString() {
        return "Patient{" + "patientId=" + patientID + ", patientName='" + patientName + '\'' + ", dob=" + patientDOB + ", phoneNumber='" + phoneNumber + '\'' + ", address='" + address + '\'' + ", patientType='" + typeIpOp + '\'' + '}';
    }

}
