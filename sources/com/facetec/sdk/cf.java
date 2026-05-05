package com.facetec.sdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import androidx.core.content.ContextCompat;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class cf {
    private IsoDep Code;
    private String D;
    private final NfcAdapter I;
    private Z S;
    private final WeakReference<Activity> V;
    private Exception Z = null;
    private cl B = null;

    /* JADX INFO: renamed from: com.facetec.sdk.cf$1 */
    final class AnonymousClass1 implements Runnable {
        private /* synthetic */ I Z;

        AnonymousClass1(I i2) {
            i = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            cf.I(cf.this, i);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.cf$2 */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.Code();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.cf$5 */
    final class AnonymousClass5 implements Runnable {
        private /* synthetic */ cl I;

        AnonymousClass5(cl clVar) {
            clVar = clVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.B(clVar);
        }
    }

    public static final class Code {
        public final String Code;
        public final int I;
        public final fx V;

        public Code() {
        }

        private Code(fx fxVar, int i2, String str) {
            this.V = fxVar;
            this.I = i2;
            this.Code = str;
        }

        public static Code Z(String str) throws IOException {
            fx fxVar;
            int i2;
            String strSubstring;
            if (str.startsWith("HTTP/1.")) {
                i2 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    fxVar = fx.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                    }
                    fxVar = fx.HTTP_1_1;
                }
            } else {
                if (!str.startsWith("ICY ")) {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                }
                fxVar = fx.HTTP_1_0;
                i2 = 4;
            }
            int i3 = i2 + 3;
            if (str.length() < i3) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            try {
                int i4 = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i3) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                    }
                    strSubstring = str.substring(i2 + 4);
                }
                return new Code(fxVar, i4, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.V == fx.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
            sb.append(TokenParser.SP).append(this.I);
            if (this.Code != null) {
                sb.append(TokenParser.SP).append(this.Code);
            }
            return sb.toString();
        }
    }

    public interface I extends Closeable, Flushable, Cloneable, ReadableByteChannel, WritableByteChannel {
        I B() throws IOException;

        I B(long j2) throws IOException;

        void B(cl clVar);

        void B(fy fyVar) throws IOException;

        I C() throws IOException;

        String C(long j2) throws IOException;

        I Code(int i2) throws IOException;

        ib Code(long j2) throws IOException;

        String Code(Charset charset) throws IOException;

        void Code();

        void Code(byte[] bArr) throws IOException;

        byte D() throws IOException;

        byte[] D(long j2) throws IOException;

        boolean F() throws IOException;

        I I() throws IOException;

        I I(int i2) throws IOException;

        I I(long j2) throws IOException;

        ie L();

        im S();

        long V(ie ieVar, long j2) throws IOException;

        I V(String str) throws IOException;

        fy V() throws IOException;

        void V(long j2) throws IOException;

        boolean V(ib ibVar) throws IOException;

        I Z(int i2) throws IOException;

        I Z(byte[] bArr) throws IOException;

        I Z(byte[] bArr, int i2, int i3) throws IOException;

        X509Certificate Z(X509Certificate x509Certificate);

        void Z();

        void Z(long j2) throws IOException;

        void Z(I i2);

        void Z(ie ieVar, long j2) throws IOException;

        int a() throws IOException;

        short b() throws IOException;

        long c() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        void close() throws IOException;

        int d() throws IOException;

        short e() throws IOException;

        @Override // java.io.Flushable
        void flush() throws IOException;

        long g() throws IOException;

        String j() throws IOException;
    }

    public static class Z {
        public final String B;
        public final String V;
        public final String Z;
    }

    private cf(NfcAdapter nfcAdapter, Activity activity) {
        this.I = nfcAdapter;
        this.V = new WeakReference<>(activity);
    }

    public static boolean Code(Activity activity) {
        return ContextCompat.checkSelfPermission(activity, "android.permission.NFC") == 0 && V(activity) != null;
    }

    static /* synthetic */ void I(cf cfVar, I i2) {
        cl clVar;
        String strNativeStartReading;
        Activity activity = cfVar.V.get();
        if (activity != null) {
            cfVar.Z = null;
            cfVar.B = null;
            try {
                String str = cfVar.D;
                strNativeStartReading = (str == null || str.isEmpty()) ? cfVar.nativeStartReading(cfVar.S.Z, cfVar.S.V, cfVar.S.B) : cfVar.nativeStartReadingWithKey(cfVar.D);
            } catch (Throwable unused) {
                clVar = cl.Unknown;
            }
            if (strNativeStartReading != null) {
                new JSONObject(strNativeStartReading);
                activity.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.cf.2
                    AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        i.Code();
                    }
                });
                return;
            }
            if (cfVar.Z != null) {
                clVar = cl.ConnectionError;
            } else {
                clVar = cfVar.B;
                if (clVar == null) {
                    clVar = cl.Unknown;
                }
            }
            activity.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.cf.5
                private /* synthetic */ cl I;

                AnonymousClass5(cl clVar2) {
                    clVar = clVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.B(clVar);
                }
            });
        }
    }

    public static boolean I(Activity activity) {
        NfcAdapter nfcAdapterV;
        return ContextCompat.checkSelfPermission(activity, "android.permission.NFC") == 0 && (nfcAdapterV = V(activity)) != null && nfcAdapterV.isEnabled();
    }

    private static NfcAdapter V(Activity activity) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-928));
        int[] iArr = new int["E><".length()];
        QB qb = new QB("E><");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd2 = (short) (C1607wl.Xd() ^ 19701);
        int[] iArr2 = new int["r\u0001w\u0007\u0005\u007f{F|\n\n\u0011\u0003\r\u0014NDqqxj~{".length()];
        QB qb2 = new QB("r\u0001w\u0007\u0005\u007f{F|\n\n\u0011\u0003\r\u0014NDqqxj~{");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Class.forName(Qg.kd("\b}\u0012{G\u0005x\u0005|Bf\u0007\u0004y}u", (short) (C1633zX.Xd() ^ (-19162)), (short) (C1633zX.Xd() ^ (-425))))};
        Object[] objArr = {str};
        short sXd3 = (short) (ZN.Xd() ^ 31376);
        short sXd4 = (short) (ZN.Xd() ^ 559);
        int[] iArr3 = new int["$!/\r2++\u001b\"\u0007\u0018$'\u0019\u0012\u0013".length()];
        QB qb3 = new QB("$!/\r2++\u001b\"\u0007\u0018$'\u0019\u0012\u0013");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3) + sXd4);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            NfcManager nfcManager = (NfcManager) method.invoke(activity, objArr);
            if (nfcManager == null) {
                return null;
            }
            return nfcManager.getDefaultAdapter();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static cf Z(Activity activity) throws Throwable {
        NfcAdapter nfcAdapterV = V(activity);
        if (nfcAdapterV == null) {
            return null;
        }
        return new cf(nfcAdapterV, activity);
    }

    public final boolean I(Intent intent, I i2) {
        if (!"android.nfc.action.TECH_DISCOVERED".equals(intent.getAction())) {
            return false;
        }
        this.Code = IsoDep.get((Tag) intent.getExtras().getParcelable("android.nfc.extra.TAG"));
        new Thread(new Runnable() { // from class: com.facetec.sdk.cf.1
            private /* synthetic */ I Z;

            AnonymousClass1(I i22) {
                i = i22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cf.I(cf.this, i);
            }
        }).start();
        return true;
    }

    public final boolean I(Class<?> cls, String str) {
        Activity activity = this.V.get();
        if (activity == null) {
            return false;
        }
        this.D = str;
        Intent intent = new Intent(activity, cls);
        intent.addFlags(536870912);
        this.I.enableForegroundDispatch(activity, PendingIntent.getActivity(activity, 0, intent, 134217728), null, new String[][]{new String[]{"android.nfc.tech.IsoDep"}});
        return true;
    }

    public final void V() {
        Activity activity = this.V.get();
        if (activity != null) {
            this.I.disableForegroundDispatch(activity);
        }
    }

    final native String nativeStartReading(String str, String str2, String str3);

    final native String nativeStartReadingWithKey(String str);

    final byte[] sendCommand(byte[] bArr) {
        this.Z = null;
        try {
            if (!this.Code.isConnected()) {
                this.Code.connect();
            }
            return this.Code.transceive(bArr);
        } catch (IOException e2) {
            this.Z = e2;
            e2.printStackTrace();
            return null;
        }
    }

    final void setNativeError(int i2) {
        if (i2 == 1) {
            this.B = cl.Unknown;
        } else if (i2 == 2) {
            this.B = cl.InvalidMrzKey;
        } else {
            if (i2 != 3) {
                return;
            }
            this.B = cl.ResponseError;
        }
    }
}
