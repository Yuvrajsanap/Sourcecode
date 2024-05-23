import java.text.SimpleDateFormat;
import java.util.Date;

public class question4 {
    public static void main(String[] args) {
        Date today = new Date();                
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        String formattedDate = formatter.format(today);
        System.out.println("Today's date: " + formattedDate);
    }
}
