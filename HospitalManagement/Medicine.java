package HospitalManagement;

import java.util.Date;

public class Medicine {
    private Long medicineId;
    private String medicineName;
    private String expiryDate;
    private Long batchNumber;
    private String purposeOfMedicine;

    public Long getMedicineId(){

        return medicineId;
    }

    public void setMedicineId( long medicineId ){

        this.medicineId = medicineId;
    }

    public String getMedicineName(){

        return  medicineName;
    }

    public void setMedicineName( String medicineName ){

        this.medicineName = medicineName;
    }

    public String getExpiryDate(){

        return  expiryDate;
    }

    public void setExpiryDate( Date expiryDate ){

        this.expiryDate = String.valueOf(expiryDate);
    }

    public long getBatchNumber(){

        return batchNumber;
    }

    public void setBatchNumber( long batchNumber ){

        this.batchNumber = batchNumber;
    }

    public String getPurposeOfMedicine(){

        return purposeOfMedicine;
    }

    public void setPurposeOfMedicine( String purposeOfMedicine ){

        this.purposeOfMedicine = purposeOfMedicine;
    }

    public String toString() {
        return "Medicine{" + "medicineId=" + medicineId + ", medicineName='" + medicineName + '\'' + ", expiryDate=" + expiryDate + ", batchNumber='" + batchNumber + '\'' + ", purposeOfMedicine='" + purposeOfMedicine + '\'' + '}';
    }


}