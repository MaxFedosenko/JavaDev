package com.tms.lesson10;

import java.io.*;
import java.util.Iterator;

public class Dialog {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/Админ/dialog.txt"));
             BufferedWriter bw1 = new BufferedWriter(new FileWriter("/Users/Админ/romeo.txt", true));
             BufferedWriter bw2 = new BufferedWriter(new FileWriter("/Users/Админ/juliet.txt", true))) {
            String s = br.readLine();
            boolean rom = false;
            boolean jul = false;
            while (s != null) {
                if (s.contains("Romeo") || (rom && !s.contains("Juliet"))){
                    bw1.write(s);
                    bw1.newLine();
                    rom = true;
                    jul = false;
                } else if (s.contains("Juliet") || (jul && !s.contains("Romeo"))) {
                    bw2.write(s);
                    bw2.newLine();
                    rom = false;
                    jul = true;
                }
                s = br.readLine();
            }
        }catch (IOException exc) {
            exc.printStackTrace();
        }

    }

}
