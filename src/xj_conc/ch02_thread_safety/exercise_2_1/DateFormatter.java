package xj_conc.ch02_thread_safety.exercise_2_1;

import net.jcip.annotations.*;

import java.text.*;
import java.util.*;

/**
 * Solve thread safety by using thread confinement.
 */
@ThreadSafe
public class DateFormatter {
//    private final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    public String format(Date date) {
        return df.get().format(date);
    }

    private static final ThreadLocal<DateFormat> df =
        ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));


    public Date parse(String date) throws ParseException {
        return df.get().parse(date);
    }
}
