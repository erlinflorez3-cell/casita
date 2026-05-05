package o.ce;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import o.a.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends SSLSocketFactory {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22171b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22172c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int[] f22173e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f22174a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, int r10) {
        /*
            int r0 = r10 * 2
            int r7 = 4 - r0
            int r0 = r9 * 2
            int r6 = 121 - r0
            byte[] r5 = o.ce.a.$$a
            int r1 = r8 * 4
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L2b
            r1 = r2
            r0 = r3
        L17:
            int r6 = r6 + r1
            int r7 = r7 + 1
            r1 = r0
        L1b:
            byte r0 = (byte) r6
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L28:
            r1 = r5[r7]
            goto L17
        L2b:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ce.a.$$c(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22172c = 0;
        f22171b = 1;
        f22173e = new int[]{626793539, -637503862, 952374876, 1248069137, -1816183715, -2135413508, 1385814135, 341389783, 1299235302, -1601252659, 1345948088, 971609636, -1521877519, -1663240229, -1632495152, 324168327, 677511245, -685615970};
    }

    public a(TrustManager[] trustManagerArr) throws Throwable {
        Object[] objArr = new Object[1];
        f(new int[]{-264491954, 172931743, 1007777977, -614593102}, 7 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        SSLContext sSLContext = SSLContext.getInstance(((String) objArr[0]).intern());
        sSLContext.init(null, trustManagerArr, null);
        this.f22174a = sSLContext.getSocketFactory();
    }

    private static Socket a(Socket socket) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22171b + 63;
        f22172c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z2 = socket instanceof SSLSocket;
            obj.hashCode();
            throw null;
        }
        if (socket instanceof SSLSocket) {
            Object[] objArr = new Object[1];
            f(new int[]{-264491954, 172931743, 1007777977, -614593102}, TextUtils.getCapsMode("", 0, 0) + 7, objArr);
            ((SSLSocket) socket).setEnabledProtocols(new String[]{((String) objArr[0]).intern()});
        }
        int i4 = f22171b + 9;
        f22172c = i4 % 128;
        if (i4 % 2 == 0) {
            return socket;
        }
        throw null;
    }

    private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f22173e;
        int i5 = 989264422;
        long j2 = 0;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 109;
                $10 = i8 % 128;
                if (i8 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) ($$b - 1);
                            byte b3 = b2;
                            objA = o.d.d.a(675 - TextUtils.getOffsetBefore("", i6), (char) ExpandableListView.getPackedPositionType(j2), KeyEvent.keyCodeFromString("") + 12, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i3 = 2;
                        i7 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        int i9 = 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte b4 = (byte) ($$b - 1);
                        byte b5 = b4;
                        objA2 = o.d.d.a(KeyEvent.keyCodeFromString("") + 675, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), i9, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i7++;
                    i3 = 2;
                }
                i5 = 989264422;
                j2 = 0;
                i6 = 0;
            }
            int i10 = $10 + 45;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f22173e;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 9;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        int i14 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 674;
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i15 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11;
                        byte b6 = (byte) ($$b - 1);
                        byte b7 = b6;
                        objA3 = o.d.d.a(i14, packedPositionType, i15, -328001469, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i12])};
                    Object objA4 = o.d.d.a(989264422);
                    if (objA4 == null) {
                        int absoluteGravity = 675 - Gravity.getAbsoluteGravity(0, 0);
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                        int keyRepeatTimeout = 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b8 = (byte) ($$b - 1);
                        byte b9 = b8;
                        objA4 = o.d.d.a(absoluteGravity, cLastIndexOf, keyRepeatTimeout, -328001469, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    i12++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i16 = $10 + 71;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                lVar.f19942e ^= iArr4[i18];
                Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA5 = o.d.d.a(2098218801);
                if (objA5 == null) {
                    int longPressTimeout = 301 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    char scrollBarSize = (char) (52697 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int iMyTid = (Process.myTid() >> 22) + 11;
                    int i20 = $$b;
                    byte b10 = (byte) (i20 - 1);
                    byte b11 = (byte) i20;
                    objA5 = o.d.d.a(longPressTimeout, scrollBarSize, iMyTid, -1416256172, false, $$c(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i18++;
            }
            int i21 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i21;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i22 = lVar.f19942e;
            int i23 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = o.d.d.a(986820978);
            if (objA6 == null) {
                int gidForName = Process.getGidForName("") + 230;
                char c2 = (char) (51005 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9;
                byte b12 = (byte) ($$b - 1);
                byte b13 = (byte) (b12 + 2);
                objA6 = o.d.d.a(gidForName, c2, minimumFlingVelocity, -330018025, false, $$c(b12, b13, (byte) (b13 - 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{39, 50, 101, -97};
        $$b = 1;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22171b + 111;
        f22172c = i3 % 128;
        int i4 = i3 % 2;
        Socket socketA = a(this.f22174a.createSocket());
        int i5 = f22171b + 81;
        f22172c = i5 % 128;
        int i6 = i5 % 2;
        return socketA;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22171b + 79;
        f22172c = i4 % 128;
        int i5 = i4 % 2;
        Socket socketA = a(this.f22174a.createSocket(str, i2));
        int i6 = f22172c + 97;
        f22171b = i6 % 128;
        if (i6 % 2 != 0) {
            return socketA;
        }
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = f22172c + 37;
        f22171b = i5 % 128;
        if (i5 % 2 == 0) {
            a(this.f22174a.createSocket(str, i2, inetAddress, i3));
            throw null;
        }
        Socket socketA = a(this.f22174a.createSocket(str, i2, inetAddress, i3));
        int i6 = f22172c + 23;
        f22171b = i6 % 128;
        int i7 = i6 % 2;
        return socketA;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22171b + 61;
        f22172c = i4 % 128;
        if (i4 % 2 != 0) {
            a(this.f22174a.createSocket(inetAddress, i2));
            throw null;
        }
        Socket socketA = a(this.f22174a.createSocket(inetAddress, i2));
        int i5 = f22171b + 67;
        f22172c = i5 % 128;
        int i6 = i5 % 2;
        return socketA;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = f22171b + 53;
        f22172c = i5 % 128;
        int i6 = i5 % 2;
        Socket socketA = a(this.f22174a.createSocket(inetAddress, i2, inetAddress2, i3));
        int i7 = f22172c + 57;
        f22171b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 27 / 0;
        }
        return socketA;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22172c + 113;
        f22171b = i4 % 128;
        int i5 = i4 % 2;
        Socket socketCreateSocket = this.f22174a.createSocket(socket, str, i2, z2);
        if (i5 != 0) {
            return a(socketCreateSocket);
        }
        a(socketCreateSocket);
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        int i2 = 2 % 2;
        int i3 = f22171b + 109;
        f22172c = i3 % 128;
        if (i3 % 2 != 0) {
            this.f22174a.getDefaultCipherSuites();
            throw null;
        }
        String[] defaultCipherSuites = this.f22174a.getDefaultCipherSuites();
        int i4 = f22172c + 95;
        f22171b = i4 % 128;
        int i5 = i4 % 2;
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        int i2 = 2 % 2;
        int i3 = f22172c + 41;
        f22171b = i3 % 128;
        if (i3 % 2 == 0) {
            this.f22174a.getSupportedCipherSuites();
            throw null;
        }
        String[] supportedCipherSuites = this.f22174a.getSupportedCipherSuites();
        int i4 = f22172c + 13;
        f22171b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return supportedCipherSuites;
    }
}
