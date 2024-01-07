package Decorator.InputStreamDekorator;

import java.io.*;

public class ToLowerCaseInputStream extends FilterInputStream {


    public ToLowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return (c==-1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int lenght) throws IOException {
        int read = in.read(b, offset, lenght);
        for (int i = offset; i < offset + read; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return read;
    }
}
