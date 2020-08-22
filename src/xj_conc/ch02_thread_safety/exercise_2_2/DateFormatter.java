package xj_conc.ch02_thread_safety.exercise_2_2;

import net.jcip.annotations.*;

import java.text.*;
import java.util.*;

/**
 * Solve thread safety by using stack confinement.
 */
@ThreadSafe
public class DateFormatter {

    public static String format(Date date) {
     DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        return df.format(date);
    }

    public Date parse(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.parse(date);
    }

}
