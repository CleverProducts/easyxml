package org.clever.easyxml;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sinan on 24.01.2016.
 */
public class EasyTest {

    @Test
    public void parseTest() throws IOException {
        String path = EasyTest.class.getClassLoader().getResource("testfile.xml").getPath();
        FileInputStream fis = new FileInputStream(new File(path));
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            new EasyXml(fis);
        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration : " + (duration / 5));
    }

    @Test
    public void parseTest2() throws IOException {
        InputStream fis = EasyTest.class.getClassLoader().getResourceAsStream("testfile.xml");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            new EasyXml(fis);
        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration : " + (duration / 5));
    }

}
