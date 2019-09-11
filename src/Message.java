import java.io.File;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;

public class Message {

        private String message;
        private String author;
        private Date createdAt;

        //LocalTime createdTime = LocalTime.now();

        class Update {
            private Date updatedAt = new Date();
        }

        //variables to message
        public Message(String message, String author, Date createdAt) {
            this.message = message;
            this.author = System.getProperty("user.name");
            this.createdAt = new Date();
        }

    //System.out.println(createdTime);
    @Override
    public String toString() {
        //return message + "written by: " + author + "written at: " + createdAt.toString();
        return author + ": " + message + "\non: " + createdAt.toString();
    }




}
