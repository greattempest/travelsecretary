package com.tempest.travelsecretary.util;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Java实现本地读文件
 */
public class ReadFile {

    public static String sendid() throws Exception{

        String path = "/tmp/sendid.txt";
    	
    	//String path = "D://temp//sendid.txt";
    	
        FileInputStream fileInputStream = new FileInputStream(path);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String line = null;
        String line1 = null;

        while ((line = bufferedReader.readLine()) != null) {
            //System.out.println(line);
        	line1=line;
        }

        fileInputStream.close();
        
        return line1;

    }
}
