package HospitalManagement;

public class Bed {
    Long bedID;
    String bedType;
    String roomName;

    public Long getBedID() {
        return bedID;
    }

    public void setBedID(Long bedID) {
        this.bedID = bedID;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }



    public String toString() {
        return "Bed{" + "bedId=" + bedID + ", bedType='" + bedType + '\'' + ", roomName='" + roomName + '\'' + '}';
    }
}
