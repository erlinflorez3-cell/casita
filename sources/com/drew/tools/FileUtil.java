package com.drew.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class FileUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static byte[] readBytes(File file) throws Throwable {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        ?? r1 = 0;
        r1 = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i2 = 0;
            while (i2 != length) {
                try {
                    int i3 = fileInputStream.read(bArr, i2, length - i2);
                    if (i3 == -1) {
                        break;
                    }
                    i2 += i3;
                    r1 = i3;
                } catch (Throwable th) {
                    th = th;
                    r1 = fileInputStream;
                    if (r1 != 0) {
                        r1.close();
                    }
                    throw th;
                }
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] readBytes(String str) throws IOException {
        return readBytes(new File(str));
    }

    public static void saveBytes(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
