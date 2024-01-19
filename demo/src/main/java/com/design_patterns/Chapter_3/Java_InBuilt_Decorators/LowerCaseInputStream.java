package com.design_patterns.Chapter_3.Java_InBuilt_Decorators;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// FilterInputStream is just like our CondimentDecorator
public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }
    
    public int read() throws IOException{
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offset, int len) throws IOException{
        int result = super.read(b, offset, len);
        for(int i = offset; i < offset + result; i++){

        }
        return -1;
    }
}