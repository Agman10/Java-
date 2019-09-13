import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

    private static ArrayList<Message> messages;




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
            System.out.println("Starting!");
            messages = new ArrayList<Message>();
            awaitInput();
            /*if (message.length()>10) {
                System.out.println("Message is too long");
                awaitInput();

            } else System.out.println(post.toString());
            awaitInput();*/

    }

    private static void awaitInput() {
        System.out.print(": ");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();


        Message post = new Message(messages.size(), message, "author", new Date());
        if (message.contentEquals("/stop")){
            System.out.println("Shutting down!");
            System.exit(0);

        } else if (message.length() > 20) {
            System.out.println("Message is too long");
            awaitInput();

        } else if (message.length() == 0){
            System.out.println("There is no message");
            awaitInput();

        } else if (message.contentEquals("/view")) {
            System.out.println(messages);
            awaitInput();

        } else if (message.contentEquals("/edit")) {
            System.out.println("edit");
            awaitInput();

        } else System.out.println(post.toString());
        messages.add(post);
        awaitInput();
    }
}


            /*String messages;
            messages = new ArrayList<Message>();
            scanner = new Scanner(System.in);
            System.out.print("hello");
            Scanner sc = new Scanner(System.in);
            messages = sc.next();*/

            /*String message;
            String author = System.getProperty("user.name");
            Date createdAt = new Date();
            Scanner sc = new Scanner(System.in);
            message = sc.next();
            if (message.length()>10) {
                System.out.println("too long");
                return;
            } else System.out.println(author + ": " + message + "\non: " + createdAt);*/
