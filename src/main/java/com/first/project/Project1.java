package com.first.project;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Project1 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        try {
            FileWriter writer = new FileWriter("formattedDate.txt");
            writer.write(dateFormat.format(date));
            writer.close();
        }catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
