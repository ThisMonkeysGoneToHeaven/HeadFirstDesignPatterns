package com.design_patterns.Chapter_3.Java_InBuilt_Decorators;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException{
        int c;

        try{
            InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                    new FileInputStream("demo/src/main/resources/test.txt")));
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }

            in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
