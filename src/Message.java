import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class Message {
    public static void main(String[] args) {
        String message;
        String author = System.getProperty("user.name");
        LocalDate createdAt = LocalDate.now();
        //LocalTime createdTime = LocalTime.now();
        Date updatedAt;


        Scanner in = new Scanner(System.in);

        message = in.next();
        if (message.length()>10) {
            System.out.println("too long");
            return;
        } else System.out.println(message);
        System.out.println("created by: " + author);
        System.out.println("created at: " + createdAt);
        //System.out.println(createdTime);

    }
}
