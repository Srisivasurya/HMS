package hms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility
{

    public static Date getDate(String date) {
         Date d = null;
        try
        {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY");
            simpleDateFormat.parse(date);
            d = simpleDateFormat.parse(date);
        } catch (Exception e)
        {
            System.out.println("Date Format should be DD/MM/YYY:" + e.getMessage());
        }
        return d;
    }
}


