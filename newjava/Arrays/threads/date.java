import java.util.Calendar;
import java.util.Date;
public class date {
    public static void main(String[] args) {
        // Date d =new Date();
        // System.out.println(d);
        Date d=new Date();
        System.out.println(d.getHours()+" /"+d.getMinutes()+"/"+d.getSeconds());
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ " /" +c.get(Calendar.MINUTE)+"/"+c.get(Calendar.SECOND));

    }
}
