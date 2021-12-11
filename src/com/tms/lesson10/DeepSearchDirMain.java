package com.tms.lesson10;

import java.io.File;

public class DeepSearchDirMain {

    public static void main(String[] args) {
        File files = new File("/Users/Админ/Downloads");
        DeepSearchDir deepSearchDir = new DeepSearchDirImpl();
        deepSearchDir.deepSearch(files);
    }

}
