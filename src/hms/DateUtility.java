package hms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {

    public static Date getDate(String date) throws Exception{

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY");
        simpleDateFormat.parse(date);
        Date d;
        d=simpleDateFormat.parse(date);
        return d;
    }

}
