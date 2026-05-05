package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.UUID;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
final class Installation {
    static final String INSTALLATION = "INSTALLATION";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    static String deviceId = null;

    private Installation() {
    }

    public static synchronized String id(Context context) throws RuntimeException {
        if (deviceId == null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.Zd("& skFJ#Vj`]-\u001c\u000f\u0013\u0019(B\u001b\u000fYzQ", (short) (C1607wl.Xd() ^ 19408), (short) (C1607wl.Xd() ^ 10326))).getMethod(C1561oA.Xd("65E\u0018<@:I\u001bAK", (short) (C1607wl.Xd() ^ 30558)), new Class[0]);
            try {
                method.setAccessible(true);
                File file = (File) method.invoke(context, objArr);
                short sXd = (short) (OY.Xd() ^ 12638);
                int[] iArr = new int["\u001f#++\u001b%(\u001c\"\u0016\u001f\u001d".length()];
                QB qb = new QB("\u001f#++\u001b%(\u001c\"\u0016\u001f\u001d");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                File file2 = new File(file, new String(iArr, 0, i2));
                try {
                    if (!file2.exists()) {
                        String strWriteInstallationFile = writeInstallationFile(file2);
                        deviceId = strWriteInstallationFile;
                        return strWriteInstallationFile;
                    }
                    deviceId = readInstallationFile(file2);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return deviceId;
    }

    static String readInstallationFile(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, UTF_8);
            randomAccessFile.close();
            return str;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static String writeInstallationFile(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String string = UUID.randomUUID().toString();
            fileOutputStream.write(string.getBytes(UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();
            return string;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
