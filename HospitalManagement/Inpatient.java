package HospitalManagement;

class InPatient {
    Long patientID;
    Long ipIdentificationNumber;
    Long bed;

    public Long getPatientID() {
        return patientID;
    }

    public void setPatientId(Long patientID) {
        this.patientID = patientID;
    }

    public Long getIpIdentificationNumber() {
        return ipIdentificationNumber;
    }

    public void setIpIdentificationNumber(Long ipIdentificationNumber) {
        this.ipIdentificationNumber = ipIdentificationNumber;
    }

    public Long getBed() {
        return bed;
    }

    public void setBed(Long bed) {
        this.bed = bed;
    }


    public String toString() {
        return "InPatient{" + "patientId=" + patientID + ", ipIdentificationNumber=" + ipIdentificationNumber + ", bed=" + bed + '}';
    }
}