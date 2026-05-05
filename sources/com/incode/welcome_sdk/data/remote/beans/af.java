package com.incode.welcome_sdk.data.remote.beans;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public final class af {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f9231a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9232c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9233d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f9234e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f9235f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f9236b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r0 = r7 + 4
            int r1 = r8 * 3
            int r8 = 1 - r1
            int r1 = r6 * 3
            int r7 = 111 - r1
            byte[] r6 = com.incode.welcome_sdk.data.remote.beans.af.$$a
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r6 != 0) goto L29
            r1 = r0
            r7 = r8
            r3 = r4
        L14:
            int r7 = r7 + r0
            r0 = r1
            r2 = r3
        L17:
            int r3 = r2 + 1
            byte r1 = (byte) r7
            r5[r2] = r1
            if (r3 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            int r1 = r0 + 1
            r0 = r6[r1]
            goto L14
        L29:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.af.$$c(int, int, short):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{4, -122, -75, -94};
        $$b = PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
    }

    private af(File file) {
        this.f9236b = file;
    }

    public final File c() {
        int i2 = 2 % 2;
        int i3 = f9232c;
        int i4 = i3 + 77;
        f9235f = i4 % 128;
        int i5 = i4 % 2;
        File file = this.f9236b;
        int i6 = i3 + 109;
        f9235f = i6 % 128;
        int i7 = i6 % 2;
        return file;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseOnboardingStart{report='").append(this.f9236b).append("'}").toString();
        int i3 = f9235f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9232c = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static af d(ResponseBody responseBody, String str, File file) {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(str);
        Object[] objArr = new Object[1];
        g("菙⤜亘⦞檟끡❔ﮀ唑䞌䦔鶇ꨓ蘭熥", 1405356021 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (Gravity.getAbsoluteGravity(0, 0) + 51073), "\u0000\u0000\u0000\u0000", "\uf58f쐇腓냇", objArr);
        File file2 = new File(file, sbAppend.append(((String) objArr[0]).intern()).toString());
        b(responseBody, file2);
        af afVar = new af(file2);
        int i3 = f9232c + 123;
        f9235f = i3 % 128;
        int i4 = i3 % 2;
        return afVar;
    }

    private static boolean b(ResponseBody responseBody, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        int i2 = 2 % 2;
        InputStream inputStream = null;
        try {
            try {
                byte[] bArr = new byte[4096];
                InputStream inputStreamByteStream = responseBody.byteStream();
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int i3 = inputStreamByteStream.read(bArr);
                            if (i3 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i3);
                        } catch (IOException unused) {
                            inputStream = inputStreamByteStream;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStreamByteStream;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    }
                    fileOutputStream.flush();
                    if (inputStreamByteStream != null) {
                        int i4 = f9235f + 7;
                        f9232c = i4 % 128;
                        if (i4 % 2 != 0) {
                            inputStreamByteStream.close();
                            inputStream.hashCode();
                            throw null;
                        }
                        inputStreamByteStream.close();
                    }
                    fileOutputStream.close();
                    int i5 = f9235f + 27;
                    f9232c = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                } catch (IOException unused2) {
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (IOException unused3) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException unused4) {
            return false;
        }
    }

    private static void g(String str, int i2, char c2, String str2, String str3, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        Object obj = str6;
        if (str6 != null) {
            char[] charArray = str6.toCharArray();
            int i5 = $10 + 115;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        Object charArray2 = str5;
        if (str5 != null) {
            int i7 = $10 + 55;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        int i9 = 0;
        Object charArray3 = str4;
        if (str4 != null) {
            int i10 = $11 + 55;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 22 / 0;
                charArray3 = str4.toCharArray();
            } else {
                charArray3 = str4.toCharArray();
            }
        }
        com.c.a.q qVar = new com.c.a.q();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        qVar.f2785d = 0;
        while (qVar.f2785d < length3) {
            int i12 = $10 + 69;
            $11 = i12 % 128;
            int i13 = i12 % i3;
            try {
                Object[] objArr2 = {qVar};
                Object objC = com.c.a.e.e.c(1902411467);
                if (objC == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", i9, i9) + 42780);
                    int windowTouchSlop = 16 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iMyPid = 134 - (Process.myPid() >> 22);
                    Class[] clsArr = new Class[1];
                    clsArr[i9] = Object.class;
                    objC = com.c.a.e.e.e(cIndexOf, windowTouchSlop, iMyPid, 1912503474, false, "k", clsArr);
                }
                int iIntValue = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {qVar};
                Object objC2 = com.c.a.e.e.c(1563994930);
                if (objC2 == null) {
                    byte b2 = (byte) i9;
                    byte b3 = (byte) (b2 - 1);
                    objC2 = com.c.a.e.e.e((char) View.MeasureSpec.getSize(i9), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 674, 1570941259, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {qVar, Integer.valueOf(cArr3[qVar.f2785d % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objC3 = com.c.a.e.e.c(-869156665);
                if (objC3 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (-b4);
                    objC3 = com.c.a.e.e.e((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ImageFormat.getBitsPerPixel(0) + 28, 573 - Color.argb(0, 0, 0, 0), -861160770, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objC3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objC4 = com.c.a.e.e.c(911331319);
                if (objC4 == null) {
                    i3 = 2;
                    objC4 = com.c.a.e.e.e((char) ((Process.myTid() >> 22) + 9336), 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.argb(0, 0, 0, 0) + 1394, 919326094, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                cArr4[iIntValue2] = ((Character) ((Method) objC4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = qVar.f2784b;
                cArr5[qVar.f2785d] = (char) (((((long) (cArr3[iIntValue2] ^ r8[qVar.f2785d])) ^ (f9234e ^ 1009698840002613947L)) ^ ((long) ((int) (((long) f9233d) ^ 1009698840002613947L)))) ^ ((long) ((char) (((long) f9231a) ^ 1009698840002613947L))));
                qVar.f2785d++;
                i9 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f9232c = 0;
        f9235f = 1;
        f9234e = 1009698840002613947L;
        f9233d = 2022247185;
        f9231a = (char) 53947;
    }
}
