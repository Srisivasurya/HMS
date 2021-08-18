package HospitalSystem;

class InPatient {
    Long patientId;
    Long ipIdentificationNumber;
    Long bed;

    public Long getPatientID() {
        return patientId;
    }

    public void setPatientId(Long patientID) {
        this.patientId = patientId;
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
        return "InPatient{" + "patientId=" + patientId + ", ipIdentificationNumber=" + ipIdentificationNumber + ", bed=" + bed + '}';
    }
}