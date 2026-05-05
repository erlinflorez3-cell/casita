package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import com.facetec.sdk.cf;
import com.facetec.sdk.fr;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class gg {
    public static final byte[] B;
    public static final Comparator<String> C;
    public static final Charset Code;
    private static final ib D;
    private static final ib F;
    public static final ga I;
    private static final ib L;
    private static final ib S;
    public static final String[] V = new String[0];
    public static final TimeZone Z;

    /* JADX INFO: renamed from: a */
    private static final Charset f3217a;

    /* JADX INFO: renamed from: b */
    private static final Charset f3218b;

    /* JADX INFO: renamed from: c */
    private static final ib f3219c;

    /* JADX INFO: renamed from: d */
    private static final Charset f3220d;

    /* JADX INFO: renamed from: e */
    private static final Charset f3221e;

    /* JADX INFO: renamed from: f */
    private static final Pattern f3222f;

    /* JADX INFO: renamed from: g */
    private static final Method f3223g;

    /* JADX INFO: renamed from: com.facetec.sdk.gg$1 */
    final class AnonymousClass1 implements ThreadFactory {
        private /* synthetic */ boolean V;
        private /* synthetic */ String Z;

        AnonymousClass1(String str, boolean z2) {
            str = str;
            z = z2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, str);
            thread.setDaemon(z);
            return thread;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.gg$5 */
    final class AnonymousClass5 implements Comparator<String> {
        AnonymousClass5() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    static {
        byte[] bArr = new byte[0];
        B = bArr;
        Method declaredMethod = null;
        I = ga.V(null, bArr);
        gb.V((fw) null, bArr);
        D = ib.B("efbbbf");
        L = ib.B("feff");
        F = ib.B("fffe");
        S = ib.B("0000ffff");
        f3219c = ib.B("ffff0000");
        Code = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        f3217a = Charset.forName("UTF-16BE");
        f3220d = Charset.forName("UTF-16LE");
        f3221e = Charset.forName("UTF-32BE");
        f3218b = Charset.forName("UTF-32LE");
        Z = TimeZone.getTimeZone("GMT");
        C = new Comparator<String>() { // from class: com.facetec.sdk.gg.5
            AnonymousClass5() {
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        };
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f3223g = declaredMethod;
        f3222f = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static int B(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static int B(String str, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return i2;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
    }

    public static void B(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean B(cf.I i2, int i3, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jB_ = i2.S().d_() ? i2.S().b_() - jNanoTime : Long.MAX_VALUE;
        i2.S().Z(Math.min(jB_, timeUnit.toNanos(i3)) + jNanoTime);
        try {
            ie ieVar = new ie();
            while (i2.V(ieVar, 8192L) != -1) {
                ieVar.m();
            }
            if (jB_ == Long.MAX_VALUE) {
                i2.S().L();
                return true;
            }
            i2.S().Z(jNanoTime + jB_);
            return true;
        } catch (InterruptedIOException unused) {
            if (jB_ == Long.MAX_VALUE) {
                i2.S().L();
                return false;
            }
            i2.S().Z(jNanoTime + jB_);
            return false;
        } catch (Throwable th) {
            if (jB_ == Long.MAX_VALUE) {
                i2.S().L();
            } else {
                i2.S().Z(jNanoTime + jB_);
            }
            throw th;
        }
    }

    public static boolean B(cf.I i2, TimeUnit timeUnit) {
        try {
            return B(i2, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String[] B(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String Code(String str, int i2, int i3) {
        int iV = V(str, i2, i3);
        return str.substring(iV, B(str, iV, i3));
    }

    public static String Code(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static <T> List<T> Code(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> Code(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> Code(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int I(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    public static int I(String str, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(60L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(new StringBuilder().append(str).append(" too large.").toString());
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(new StringBuilder().append(str).append(" too small.").toString());
    }

    public static int I(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static AssertionError I(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset I(cf.I i2, Charset charset) throws IOException {
        if (i2.V(D)) {
            i2.V(r1.S());
            return Code;
        }
        if (i2.V(L)) {
            i2.V(r1.S());
            return f3217a;
        }
        if (i2.V(F)) {
            i2.V(r1.S());
            return f3220d;
        }
        if (i2.V(S)) {
            i2.V(r1.S());
            return f3221e;
        }
        if (!i2.V(f3219c)) {
            return charset;
        }
        i2.V(r1.S());
        return f3218b;
    }

    public static boolean I(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean I(String str) {
        return f3222f.matcher(str).matches();
    }

    public static String[] I(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    public static int V(String str, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int V(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String V(fp fpVar, boolean z2) {
        String string = fpVar.D().contains(Global.COLON) ? new StringBuilder("[").append(fpVar.D()).append("]").toString() : fpVar.D();
        return (z2 || fpVar.F() != fp.V(fpVar.Z())) ? new StringBuilder().append(string).append(Global.COLON).append(fpVar.F()).toString() : string;
    }

    public static ThreadFactory V(String str, boolean z2) {
        return new ThreadFactory() { // from class: com.facetec.sdk.gg.1
            private /* synthetic */ boolean V;
            private /* synthetic */ String Z;

            AnonymousClass1(String str2, boolean z22) {
                str = str2;
                z = z22;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static X509TrustManager V() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException(new StringBuilder("Unexpected default trust managers:").append(Arrays.toString(trustManagers)).toString());
        } catch (GeneralSecurityException e2) {
            throw I("No System TLS", e2);
        }
    }

    public static void V(long j2, long j3) {
        if (j3 < 0 || 0 > j2 || j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void V(Throwable th, Throwable th2) {
        Method method = f3223g;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static void V(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!I(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean V(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static boolean V(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    private static boolean V(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == 16) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char cCharAt = str.charAt(i6);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i6++;
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        return i5 == i4 + 4;
    }

    public static boolean V(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int Z(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static fr Z(List<hc> list) {
        fr.V v2 = new fr.V();
        for (hc hcVar : list) {
            ge.Code.Z(v2, hcVar.L.Z(), hcVar.F.Z());
        }
        return v2.I();
    }

    public static String Z(String str) {
        if (!str.contains(Global.COLON)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (V(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        int i2 = 0;
        InetAddress inetAddressZ = (str.startsWith("[") && str.endsWith("]")) ? Z(str, 1, str.length() - 1) : Z(str, 0, str.length());
        if (inetAddressZ == null) {
            return null;
        }
        byte[] address = inetAddressZ.getAddress();
        if (address.length != 16) {
            throw new AssertionError(new StringBuilder("Invalid IPv6 address: '").append(str).append("'").toString());
        }
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i3 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        ie ieVar = new ie();
        while (i2 < address.length) {
            if (i2 == i3) {
                ieVar.I(58);
                i2 += i5;
                if (i2 == 16) {
                    ieVar.I(58);
                }
            } else {
                if (i2 > 0) {
                    ieVar.I(58);
                }
                byte b2 = address[i2];
                ieVar.I((((b2 + 255) - (b2 | 255)) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return ieVar.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0076, code lost:
    
        r1 = r4 - r3;
        java.lang.System.arraycopy(r6, r3, r6, 16 - r1, r1);
        java.util.Arrays.fill(r6, r3, (16 - r4) + r3, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0086, code lost:
    
        return java.net.InetAddress.getByAddress(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x008c, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0047, code lost:
    
        if (r4 == 16) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0049, code lost:
    
        if (r3 != (-1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x004b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0068, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0051  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress Z(java.lang.String r12, int r13, int r14) {
        /*
            r7 = 16
            byte[] r6 = new byte[r7]
            r5 = 0
            r9 = -1
            r4 = r5
            r3 = r9
            r8 = r3
        L9:
            r11 = 0
            if (r13 >= r14) goto L47
            if (r4 != r7) goto Lf
            return r11
        Lf:
            int r1 = r13 + 2
            r10 = 2
            if (r1 > r14) goto L1f
            java.lang.String r0 = "::"
            boolean r0 = r12.regionMatches(r13, r0, r5, r10)
            if (r0 == 0) goto L1f
            if (r3 == r9) goto L42
            return r11
        L1f:
            if (r4 == 0) goto L2c
            java.lang.String r0 = ":"
            r1 = 1
            boolean r0 = r12.regionMatches(r13, r0, r5, r1)
            if (r0 == 0) goto L2e
            int r13 = r13 + 1
        L2c:
            r8 = r13
            goto L4d
        L2e:
            java.lang.String r0 = "."
            boolean r0 = r12.regionMatches(r13, r0, r5, r1)
            if (r0 == 0) goto L75
            int r0 = r4 + (-2)
            boolean r0 = V(r12, r8, r14, r6, r0)
            if (r0 != 0) goto L3f
            return r11
        L3f:
            int r4 = r4 + 2
            goto L47
        L42:
            int r4 = r4 + 2
            r3 = r4
            if (r1 != r14) goto L4c
        L47:
            if (r4 == r7) goto L82
            if (r3 != r9) goto L76
            return r11
        L4c:
            r8 = r1
        L4d:
            r2 = r5
            r13 = r8
        L4f:
            if (r13 >= r14) goto L61
            char r0 = r12.charAt(r13)
            int r0 = I(r0)
            if (r0 == r9) goto L61
            int r2 = r2 << 4
            int r2 = r2 + r0
            int r13 = r13 + 1
            goto L4f
        L61:
            int r1 = r13 - r8
            if (r1 == 0) goto L68
            r0 = 4
            if (r1 <= r0) goto L69
        L68:
            return r11
        L69:
            int r1 = r4 + 1
            int r0 = r2 >>> 8
            byte r0 = (byte) r0
            r6[r4] = r0
            int r4 = r4 + r10
            byte r0 = (byte) r2
            r6[r1] = r0
            goto L9
        L75:
            return r11
        L76:
            int r1 = r4 - r3
            int r0 = 16 - r1
            java.lang.System.arraycopy(r6, r3, r6, r0, r1)
            int r7 = r7 - r4
            int r7 = r7 + r3
            java.util.Arrays.fill(r6, r3, r7, r5)
        L82:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r6)     // Catch: java.net.UnknownHostException -> L87
            return r0
        L87:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.gg.Z(java.lang.String, int, int):java.net.InetAddress");
    }
}
