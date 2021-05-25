package com.tempest.travelsecretary.util;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Java实现本地写文件
 */
public class WriteFile {

    public static void sendid(String content) throws Exception{

        String path = "/tmp/sendid.txt";
    	
    	//String path = "D://temp//sendid.txt";
        
        File file = new File(path);

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(content.getBytes());

        fileOutputStream.close();

    }

}
