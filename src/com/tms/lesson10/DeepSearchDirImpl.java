package com.tms.lesson10;

import java.io.File;

public class DeepSearchDirImpl implements DeepSearchDir{
/*если указываю папку с загрузками, то все нормально работает.
Но если просто /Users/Admin/, то работает до какого-то момента и все выводит,
а потом кидает nullPointerException.*/
    @Override
    public void deepSearch(File file) {
        File [] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                System.out.println(file1.getName());
                deepSearch(file1);
            } else if (file1.isFile()) {
                System.out.println(file1.getName());
            }
        }
    }
}
