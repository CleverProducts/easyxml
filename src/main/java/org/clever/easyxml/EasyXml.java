package org.clever.easyxml;


import com.ximpleware.VTDGen;
import org.clever.easyxml.handler.BindHandler;
import org.clever.easyxml.handler.Handler;

import java.io.*;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

public class EasyXml<T> {
    FileInputStream inputStream;
    byte[] bytes;

    public EasyXml(FileInputStream fileInputStream) throws IOException {
        this.inputStream = fileInputStream;
        FileChannel channel = inputStream.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(8 * 1000);
        int nRead;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        while ((nRead = channel.read(bb)) != -1) {
            bb.limit(nRead);
            while (bb.hasRemaining()) {
                bb.get();
            }
            buffer.write(bb.array(),0,nRead);
            bb.clear();
        }
    }

    public EasyXml(InputStream inputStream) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[8 * 1000];
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }
        buffer.flush();
        bytes = buffer.toByteArray();

    }

    private byte[] copyBytes(byte[] bytes, ByteBuffer bb) {
        byte[] combined = new byte[bytes.length + bb.array().length];
        byte[] byteToCopy = bb.array();
        System.arraycopy(bytes, 0, combined, 0, bytes.length);
        System.arraycopy(byteToCopy, 0, combined, bytes.length, bb.limit());

        return combined;
    }

    public void parse(Handler handler) {

    }

    @SuppressWarnings("unchecked")
    public T marshall(Class clazz) {
        Annotation[] annotations = clazz.getAnnotations();

        VTDGen vg = new VTDGen();
        vg.setDoc("".getBytes());


        return (T) new Object();
    }

    @SuppressWarnings("unchecked")
    public void marshall(Class clazz, BindHandler handler) {

    }
}
