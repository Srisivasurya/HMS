package hms;
import java.util.*;

class GenerateVisitId {

    public static Long getVisitId(ArrayList<Long> visitId) {

        Collections.sort(visitId);
        Long l = (new Long(visitId.size()));
        l++;
        return l++;
    }

}