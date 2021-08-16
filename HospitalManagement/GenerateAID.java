package HospitalManagement;


import java.util.ArrayList;
import java.util.Collections;

public class GenerateAID {

    static public Long getId(ArrayList<Long> longs) {
        Collections.sort(longs);
        Long l = (new Long(longs.size()));
        l++;
        return l++;
    }
}
