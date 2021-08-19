package hms;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.*;
import java.util.*;

class Dates {
    public static void main(String args[]) {
        SimpleDateFormat geek = new SimpleDateFormat("dd / MM / yy");
        Calendar c = Calendar.getInstance();
        System.out.println("Present Date : " + c.getTime());
    }

}
