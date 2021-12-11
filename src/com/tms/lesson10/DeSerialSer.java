package com.tms.lesson10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialSer {

    public static void main(String[] args) {

        try (ObjectInputStream oistr = new ObjectInputStream(new FileInputStream("/Users/Админ/user.txt"))) {
            Object o = oistr.readObject();
            if (o instanceof User) {
                User user = (User) o;
                System.out.println(user);
            }
        } catch (IOException | ClassNotFoundException exc) {
            exc.printStackTrace();
        }

    }

}
