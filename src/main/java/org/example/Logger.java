package org.example;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger logger = new Logger();
    private int num = 1;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private LocalDateTime dateTime = LocalDateTime.now();
    private String formattedDateTime = dateTime.format(formatter);

    private Logger() {
    }

    public static Logger getInstance() {
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + formattedDateTime + " " + num++ + "] " + msg);
    }
}
