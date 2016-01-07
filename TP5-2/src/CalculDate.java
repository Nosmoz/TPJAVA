import java.util.Calendar;

/**
 * Created by h13002021 on 07/01/16.
 */
public class CalculDate {

    public static Calendar ajout(int nbJour) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,nbJour);
        return calendar;
    } // ajout()
}
