package com.tms.lesson10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialSer {

    public static void main(String[] args) {

        User user = new User("Max", 26, true);


        try (ObjectOutputStream oostr = new ObjectOutputStream(new FileOutputStream("/Users/Админ/user.txt"))) {
            oostr.writeObject(user);
        }catch (IOException exc) {
            exc.printStackTrace();
        }

    }

}
