package org.springframework.util;

import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StreamUtils {
    public static final int BUFFER_SIZE = 4096;

    private static class NonClosingInputStream extends FilterInputStream {
        public NonClosingInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    private static class NonClosingOutputStream extends FilterOutputStream {
        public NonClosingOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.out.write(bArr, i2, i3);
        }
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Assert.notNull(inputStream, "No InputStream specified");
        Assert.notNull(outputStream, "No OutputStream specified");
        byte[] bArr = new byte[4096];
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                outputStream.flush();
                return i2;
            }
            outputStream.write(bArr, 0, i3);
            i2 += i3;
        }
    }

    public static void copy(String str, Charset charset, OutputStream outputStream) throws IOException {
        Assert.notNull(str, "No input String specified");
        Assert.notNull(charset, "No charset specified");
        Assert.notNull(outputStream, "No OutputStream specified");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        outputStreamWriter.write(str);
        outputStreamWriter.flush();
    }

    public static void copy(byte[] bArr, OutputStream outputStream) throws IOException {
        Assert.notNull(bArr, "No input byte array specified");
        Assert.notNull(outputStream, "No OutputStream specified");
        outputStream.write(bArr);
    }

    public static byte[] copyToByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String copyToString(InputStream inputStream, Charset charset) throws IOException {
        Assert.notNull(inputStream, "No InputStream specified");
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = new char[4096];
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (i2 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i2);
        }
    }

    public static InputStream nonClosing(InputStream inputStream) {
        Assert.notNull(inputStream, "No InputStream specified");
        return new NonClosingInputStream(inputStream);
    }

    public static OutputStream nonClosing(OutputStream outputStream) {
        Assert.notNull(outputStream, "No OutputStream specified");
        return new NonClosingOutputStream(outputStream);
    }
}
