import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

    ArrayList<Message> messages;




        /*Scanner sc = new Scanner(System.in);
        message = sc.next();
        if (message.length()>10) {
            System.out.println("too long");
            return;
        } else System.out.println(message);
        System.out.println("created by: " + author);
        System.out.println("created at: " + createdAt);
        //System.out.println(createdTime);*/

        public static void main(String[] args) {
            /*String messages;
            messages = new ArrayList<Message>();
            scanner = new Scanner(System.in);
            System.out.print("hello");
            Scanner sc = new Scanner(System.in);
            messages = sc.next();*/


            Message test = new Message("message", "author", new Date());
            Scanner sc = new Scanner(System.in);
            Object Message = sc.next();
            System.out.println(test.toString());





            /*String message;
            String author = System.getProperty("user.name");
            Date createdAt = new Date();
            Scanner sc = new Scanner(System.in);
            message = sc.next();
            if (message.length()>10) {
                System.out.println("too long");
                return;
            } else System.out.println(author + ": " + message + "\non: " + createdAt);*/

    }

}
