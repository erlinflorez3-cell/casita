package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Process;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.hermes.intl.Constants;
import com.facetec.sdk.Code;
import com.facetec.sdk.bg;
import com.facetec.sdk.by;
import com.facetec.sdk.cf;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
final class a {
    static String B = null;
    private static int Code = 0;
    private static int D = 1;
    private static char I = 0;
    private static char[] V = null;
    static String Z = null;

    /* JADX INFO: renamed from: com.facetec.sdk.a$1 */
    final class AnonymousClass1 implements Runnable {
        private static int[] B = {265907950, 539096245, -1857628990, 259532621, -1474227605, -885746930, -1039469429, -1945161618, -530742893, 154678506, 1407073196, -1367480365, -701214376, 824933466, 2122496221, -1370168372, -1412676774, -1145117732};
        private static int D = 1;
        private static int V = 0;
        private /* synthetic */ Context Code;
        private /* synthetic */ String I;

        /* JADX INFO: renamed from: com.facetec.sdk.a$1$1 */
        final class C01571 implements cf.I {
            C01571() {
            }

            @Override // com.facetec.sdk.cf.I
            public final void B(fy fyVar) throws IOException {
                fyVar.V();
            }

            @Override // com.facetec.sdk.cf.I
            public final void Z() {
            }
        }

        AnonymousClass1(String str, Context context) {
            str = str;
            context = context;
        }

        private static String Z(int[] iArr, int i2) {
            int i3 = 2 % 2;
            int i4 = D + 41;
            V = i4 % 128;
            int i5 = i4 % 2;
            char[] cArr = new char[iArr.length << 1];
            int[] iArr2 = (int[]) B.clone();
            int i6 = V + 19;
            D = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < iArr.length) {
                int i9 = iArr[i8];
                char c2 = (char) (i9 >> 16);
                char c3 = (char) i9;
                int i10 = iArr[i8 + 1];
                char[] cArr2 = {c2, c3, (char) (i10 >> 16), (char) i10};
                es.Code(cArr2, iArr2, false);
                int i11 = i8 << 1;
                cArr[i11] = cArr2[0];
                cArr[i11 + 1] = cArr2[1];
                cArr[i11 + 2] = cArr2[2];
                cArr[i11 + 3] = cArr2[3];
                i8 += 2;
                int i12 = D + 31;
                V = i12 % 128;
                int i13 = i12 % 2;
            }
            return new String(cArr, 0, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.a.AnonymousClass1.run():void");
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.a$2 */
    final class AnonymousClass2 implements cf.I {
        AnonymousClass2() {
        }

        @Override // com.facetec.sdk.cf.I
        public final void B(fy fyVar) throws IOException {
            fyVar.V();
        }

        @Override // com.facetec.sdk.cf.I
        public final void Z() {
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.a$3 */
    final class AnonymousClass3 extends Thread {
        private /* synthetic */ Runnable I;

        AnonymousClass3(Runnable runnable) {
            runnable = runnable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setPriority(1);
            Process.setThreadPriority(19);
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.a$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Z;

        static {
            int[] iArr = new int[com.facetec.sdk.V.values().length];
            Z = iArr;
            try {
                iArr[com.facetec.sdk.V.FACESCAN_CALLBACK_CALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Z[com.facetec.sdk.V.ID_SCAN_CALLBACK_CALLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Z[com.facetec.sdk.V.DEVELOPER_USED_FACESCAN_CALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Z[com.facetec.sdk.V.DEVELOPER_USED_ID_SCAN_CALLBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Z[com.facetec.sdk.V.DOCUMENT_TYPE_PRESSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Z[com.facetec.sdk.V.FULL_SESSION_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Z[com.facetec.sdk.V.GET_READY_IM_READY_SHOWN_AND_READY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Z[com.facetec.sdk.V.GET_READY_IM_READY_PRESSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Z[com.facetec.sdk.V.GET_READY_IM_READY_SHOWN_AND_READY_RETRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Z[com.facetec.sdk.V.GET_READY_IM_READY_PRESSED_RETY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Z[com.facetec.sdk.V.NON_FATAL_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Z[com.facetec.sdk.V.SEVERE_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Z[com.facetec.sdk.V.VOCAL_GUIDANCE_STARTED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Z[com.facetec.sdk.V.CAMERA_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                Z[com.facetec.sdk.V.NFC_ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                Z[com.facetec.sdk.V.DEFINITELY_BUG_IF_SEEN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                Z[com.facetec.sdk.V.STARTPREVIEW_EXCEPTION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.a$5 */
    final class AnonymousClass5 implements Runnable {
        private /* synthetic */ Context B;
        private /* synthetic */ boolean I;
        private /* synthetic */ Context V;
        private /* synthetic */ D Z;

        AnonymousClass5(Context context, Context context2, D d2, boolean z2) {
            context = context;
            context = context2;
            d = d2;
            z = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            by.Code(context).Z(context, d, z, new B(context, d));
        }
    }

    static class B extends by.B {
        private final Context V;
        private final D Z;

        B(Context context, D d2) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("v\u0005{\u000b\t\u0004\u007fJ\u0001\u000e\u000e\u0015\u0007\u0011\u0018Rh\u0016\u0016\u001d\u000f# ", (short) (C1633zX.Xd() ^ (-18576)))).getMethod(Wg.vd("'&6\u0004,-*(+*>433\t6>E7K@", (short) (Od.Xd() ^ (-31026))), new Class[0]);
            try {
                method.setAccessible(true);
                this.V = (Context) method.invoke(context, objArr);
                this.Z = d2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // com.facetec.sdk.by.B
        public final void B() {
            a.I(this.V, this.Z);
        }

        @Override // com.facetec.sdk.by.B
        public final void Code() {
            a.I(this.V);
        }
    }

    static class Code extends ax {
        private static /* synthetic */ boolean B = true;
        private D Z;

        Code(Context context, D d2) {
            super(context);
            this.Z = d2;
        }

        @Override // com.facetec.sdk.ax
        final void Code() throws Throwable {
            if (!B && this.V == null) {
                throw new AssertionError();
            }
            String strZ = a.Z();
            Context context = this.V;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fDX\u0004\u0002\u0007v\t\u0004", (short) (C1607wl.Xd() ^ 9933), (short) (C1607wl.Xd() ^ 19516))).getMethod(yg.hg.Vd("YVd2OPTP.RZ", (short) (ZN.Xd() ^ 31335), (short) (ZN.Xd() ^ 32282)), new Class[0]);
            try {
                method.setAccessible(true);
                File file = new File((File) method.invoke(context, objArr), strZ);
                try {
                    m.I(file, a.Z(this.V, strZ), this.Z.Code());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.Z = null;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    static class I {
        int B;
        String I;

        private I() {
        }

        /* synthetic */ I(byte b2) {
            this();
        }
    }

    static class V extends ax {
        private static /* synthetic */ boolean Z = true;

        V(Context context) {
            super(context);
        }

        @Override // com.facetec.sdk.ax
        final void Code() throws Throwable {
            if (!Z && this.V == null) {
                throw new AssertionError();
            }
            Context context = this.V;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("bncple_(\\gejZbg 4_]bRd_", (short) (C1607wl.Xd() ^ 13800))).getMethod(C1561oA.yd("96D\u0010>=84-*<053\u00072PUEWR", (short) (OY.Xd() ^ 2471)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                D dZ = a.Z(context2);
                if (dZ != null) {
                    a.Code(context2, dZ);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    enum Z {
        USER_CANCELLED,
        USER_FAILED,
        USER_WAS_SUCCESSFUL,
        PRE_SESSION_PHASE_1_TIMEOUT,
        PRE_SESSION_PHASE_2_TIMEOUT,
        SESSION_TIMEOUT,
        SESSION_CONTEXT_SWITCH
    }

    static {
        I();
        Z = "";
        B = bo.f3038b;
        int i2 = Code + 113;
        D = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    a() {
    }

    static /* synthetic */ cv B(String str, String str2) {
        int i2 = 2 % 2;
        cv cvVar = new cv();
        cvVar.Z(str, str2);
        int i3 = D + 19;
        Code = i3 % 128;
        if (i3 % 2 == 0) {
            return cvVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static String B(com.facetec.sdk.V v2) {
        int i2 = 2 % 2;
        int i3 = D + 55;
        Code = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int i4 = AnonymousClass4.Z[v2.ordinal()];
            throw null;
        }
        switch (AnonymousClass4.Z[v2.ordinal()]) {
            case 1:
                return "faceScanCallbackCalled";
            case 2:
                return "idScanCallbackCalled";
            case 3:
                return "developerUsedFaceScanCallback";
            case 4:
                return "developerUsedIDScanCallback";
            case 5:
                int i5 = Code + 95;
                D = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 49 / 0;
                }
                return "documentTypePressed";
            case 6:
                return "fullSessionStart";
            case 7:
                int i7 = D + 57;
                Code = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 65 / 0;
                }
                return "getReadyImReadyShownAndReady";
            case 8:
                return "getReadyImReadyPressed";
            case 9:
                return "getReadyImReadyShownAndReadyRetry";
            case 10:
                int i9 = Code + 107;
                D = i9 % 128;
                if (i9 % 2 != 0) {
                    return "getReadyImReadyPressedRetry";
                }
                super.hashCode();
                throw null;
            case 11:
                return "nonFatalError";
            case 12:
                return "severeError";
            case 13:
                return "vocalGuidanceStarted";
            case 14:
                return "cameraError";
            case 15:
                return "nfcError";
            case 16:
                return "definitelyBugIfSeen";
            case 17:
                return "startPreviewException";
            default:
                return "";
        }
    }

    private static byte[] B(Context context, String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = Code + 63;
        D = i3 % 128;
        if (i3 % 2 != 0) {
            return C1150r.I(com.facetec.sdk.Z.Z(context), "Cached file secret for ".concat(String.valueOf(str)));
        }
        C1150r.I(com.facetec.sdk.Z.Z(context), "Cached file secret for ".concat(String.valueOf(str)));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0077 A[Catch: all -> 0x00d1, TryCatch #0 {, blocks: (B:60:0x0004, B:61:0x0039, B:62:0x0040, B:64:0x004a, B:66:0x004e, B:72:0x0077, B:77:0x00a4, B:80:0x00ad, B:83:0x00b9, B:85:0x00bc, B:79:0x00aa, B:88:0x00c1, B:92:0x00c7, B:93:0x00ca, B:69:0x0071, B:95:0x00cc, B:96:0x00d0, B:76:0x0094, B:75:0x0083, B:87:0x00be, B:78:0x00a8), top: B:100:0x0004, inners: #1, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized com.facetec.sdk.D Code(android.content.Context r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.a.Code(android.content.Context):com.facetec.sdk.D");
    }

    static /* synthetic */ String Code(com.facetec.sdk.V v2) {
        int i2 = 2 % 2;
        int i3 = D + 49;
        Code = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass4.Z[v2.ordinal()];
        if (i5 != 1) {
            return i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? B(v2) : "documentType" : "idScanCallback" : "faceScanCallback" : "idScanCaptureResult";
        }
        int i6 = Code + 65;
        D = i6 % 128;
        int i7 = i6 % 2;
        return "faceScanCaptureResult";
    }

    static /* synthetic */ void Code(Context context, D d2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = Code + 121;
        D = i3 % 128;
        int i4 = i3 % 2;
        Code(context, true, d2);
        int i5 = Code + 99;
        D = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void Code(Context context, String str, ArrayList<String> arrayList, String str2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = D + 17;
        Code = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
            if (!V()) {
                return;
            }
        } else if (!V()) {
            return;
        }
        String strQ = ai.q(com.facetec.sdk.Z.I());
        if (strQ.equals("")) {
            int i5 = Code + 81;
            D = i5 % 128;
            if (i5 % 2 == 0) {
                str2.equals("");
                throw null;
            }
            if (str2.equals("")) {
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(bz.Code(it.next()));
            int i6 = D + 33;
            Code = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 4;
            }
        }
        D d2 = new D(strQ, null, arrayList2, str, str2, ad.B, ad.V, "");
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u000b\u0002_@3Cw^0U\u0015KA!l\u0013\u000e?1]h\u001c\u0010", (short) (C1580rY.Xd() ^ (-19562)), (short) (C1580rY.Xd() ^ (-27868)))).getMethod(C1626yg.Ud("\u001cHL!W\u001f|\u001emBV\u0013J\rs\n9i\rb\u0004", (short) (C1580rY.Xd() ^ (-27127)), (short) (C1580rY.Xd() ^ (-15576))), new Class[0]);
        try {
            method.setAccessible(true);
            Code((Context) method.invoke(context, objArr), false, d2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void Code(Context context, boolean z2, D d2) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd(" \u0005\u0007.q\u001f\u0010\u001f*32\\\u001f,<\u0015u\n^n%yi", (short) (OY.Xd() ^ 29090))).getMethod(EO.Od(";ab\u0014Z7SX-k|S(1\u001e)LX\u0002\u00017", (short) (ZN.Xd() ^ 9361)), new Class[0]);
        try {
            method.setAccessible(true);
            Z(new Runnable() { // from class: com.facetec.sdk.a.5
                private /* synthetic */ Context B;
                private /* synthetic */ boolean I;
                private /* synthetic */ Context V;
                private /* synthetic */ D Z;

                AnonymousClass5(Context context2, Context context3, D d22, boolean z22) {
                    context = context2;
                    context = context3;
                    d = d22;
                    z = z22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    by.Code(context).Z(context, d, z, new B(context, d));
                }
            });
            int i3 = Code + 13;
            D = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String I(int i2, byte b2, String str) {
        int i3 = 2 % 2;
        Object charArray = str;
        if (str != null) {
            int i4 = D + 125;
            Code = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 68 / 0;
                charArray = str.toCharArray();
            } else {
                charArray = str.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        char[] cArr2 = V;
        char c2 = I;
        char[] cArr3 = new char[i2];
        if (i2 % 2 != 0) {
            int i6 = Code + 121;
            D = i6 % 128;
            if (i6 % 2 == 0) {
                i2 += 103;
                cArr3[i2] = (char) (cArr[i2] % b2);
            } else {
                i2--;
                cArr3[i2] = (char) (cArr[i2] - b2);
            }
        }
        if (i2 > 1) {
            int i7 = D + 103;
            Code = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < i2; i9 += 2) {
                char c3 = cArr[i9];
                int i10 = i9 + 1;
                char c4 = cArr[i10];
                if (c3 == c4) {
                    cArr3[i9] = (char) (c3 - b2);
                    cArr3[i10] = (char) (c4 - b2);
                } else {
                    int iZ = er.Z(c3, c2);
                    int iCode = er.Code(c3, c2);
                    int iZ2 = er.Z(c4, c2);
                    int iCode2 = er.Code(c4, c2);
                    if (iCode == iCode2) {
                        int I2 = er.I(iZ, c2);
                        int I3 = er.I(iZ2, c2);
                        int iV = er.V(I2, iCode, c2);
                        int iV2 = er.V(I3, iCode2, c2);
                        cArr3[i9] = cArr2[iV];
                        cArr3[i10] = cArr2[iV2];
                    } else if (iZ == iZ2) {
                        int I4 = er.I(iCode, c2);
                        int I5 = er.I(iCode2, c2);
                        int iV3 = er.V(iZ, I4, c2);
                        int iV4 = er.V(iZ2, I5, c2);
                        cArr3[i9] = cArr2[iV3];
                        cArr3[i10] = cArr2[iV4];
                    } else {
                        int iV5 = er.V(iZ, iCode2, c2);
                        int iV6 = er.V(iZ2, iCode, c2);
                        cArr3[i9] = cArr2[iV5];
                        cArr3[i10] = cArr2[iV6];
                    }
                }
            }
        }
        return new String(cArr3);
    }

    static String I(Activity activity) {
        String str;
        int i2 = 2 % 2;
        if (activity == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("{  Activity State Info -- isFinishing: ");
        String str2 = "true";
        if (activity.isFinishing()) {
            int i3 = Code + 41;
            D = i3 % 128;
            int i4 = i3 % 2;
            str = "true";
        } else {
            str = Constants.CASEFIRST_FALSE;
        }
        StringBuilder sbAppend = sb.append(str).append("  |  hasWindowFocus: ");
        if (activity.hasWindowFocus()) {
            int i5 = D + 107;
            Code = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
        } else {
            int i6 = D + 7;
            Code = i6 % 128;
            int i7 = i6 % 2;
            str2 = Constants.CASEFIRST_FALSE;
        }
        return sbAppend.append(str2).append("  }").toString();
    }

    static void I() {
        I = (char) 5;
        V = new char[]{'h', 't', 'p', 's', AbstractJsonLexerKt.COLON, '/', 'a', 'i', '.', 'z', 'o', 'm', 'u', 'c', 'v', '1', 'e', 'n', 'j', 'k', 'l', 'q', 'r', 'w', 'x'};
    }

    static void I(Context context) {
        int i2 = 2 % 2;
        new V(context).execute(new Void[0]);
        int i3 = D + 75;
        Code = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ void I(Context context, D d2) {
        int i2 = 2 % 2;
        new Code(context, d2).execute(new Void[0]);
        int i3 = D + 11;
        Code = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static void I(Context context, bu buVar) throws Throwable {
        String str;
        int i2 = 2 % 2;
        int i3 = Code + 61;
        D = i3 % 128;
        int i4 = i3 % 2;
        if (V()) {
            int i5 = D + 51;
            Code = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (buVar == null) {
                return;
            }
            cv cvVar = new cv();
            String strQd = C1561oA.Qd("\u0013\u0014", (short) (Od.Xd() ^ (-19666)));
            short sXd = (short) (Od.Xd() ^ (-6851));
            short sXd2 = (short) (Od.Xd() ^ (-18931));
            int[] iArr = new int["SN".length()];
            QB qb = new QB("SN");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK((xuXd.CK(iKK) - (sXd + i6)) - sXd2);
                i6++;
            }
            cvVar.Z(strQd, new String(iArr, 0, i6));
            short sXd3 = (short) (C1633zX.Xd() ^ (-4348));
            int[] iArr2 = new int["twjolZ~th".length()];
            QB qb2 = new QB("twjolZ~th");
            int i7 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i7] = xuXd2.fK(sXd3 + sXd3 + i7 + xuXd2.CK(iKK2));
                i7++;
            }
            cvVar.Z(new String(iArr2, 0, i7), C1561oA.Kd("\u0017%#\"\u001c", (short) (OY.Xd() ^ 19066)));
            cvVar.Z(Wg.Zd("f\u0004Pi\u001e\u0001\tUp}Kb\u0005w", (short) (C1580rY.Xd() ^ (-26116)), (short) (C1580rY.Xd() ^ (-4611))), n.D(context));
            cvVar.Z(C1561oA.Xd("IOHOWY^`VQ8T", (short) (OY.Xd() ^ 28935)), ad.V);
            cv cvVar2 = new cv();
            cvVar2.B(Wg.vd("5", (short) (OY.Xd() ^ 22378)), Integer.valueOf(buVar.B));
            Integer numValueOf = Integer.valueOf(buVar.I);
            short sXd4 = (short) (OY.Xd() ^ 24882);
            short sXd5 = (short) (OY.Xd() ^ 28720);
            int[] iArr3 = new int["\u0005".length()];
            QB qb3 = new QB("\u0005");
            int i8 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i8] = xuXd3.fK(((sXd4 + i8) + xuXd3.CK(iKK3)) - sXd5);
                i8++;
            }
            cvVar2.B(new String(iArr3, 0, i8), numValueOf);
            short sXd6 = (short) (C1633zX.Xd() ^ (-22697));
            short sXd7 = (short) (C1633zX.Xd() ^ (-6504));
            int[] iArr4 = new int["\u000e\u0014".length()];
            QB qb4 = new QB("\u000e\u0014");
            int i9 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i9] = xuXd4.fK(sXd6 + i9 + xuXd4.CK(iKK4) + sXd7);
                i9++;
            }
            cvVar.I(new String(iArr4, 0, i9), cvVar2);
            String[] strArrO = ai.o();
            if (strArrO.length == 0) {
                return;
            }
            ArrayList<I> arrayList = new ArrayList();
            int length = strArrO.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArrO[i10];
                short sXd8 = (short) (FB.Xd() ^ 32120);
                int[] iArr5 = new int["q}r\u007f{tn7}{oq2Ecte52".length()];
                QB qb5 = new QB("q}r\u007f{tn7}{oq2Ecte52");
                int i11 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i11] = xuXd5.fK(sXd8 + i11 + xuXd5.CK(iKK5));
                    i11++;
                }
                Object[] objArr = {str2, 2};
                Method declaredMethod = Class.forName(new String(iArr5, 0, i11)).getDeclaredMethod(C1561oA.Yd("\u0014\u0016\u0015\"\u0018\u001a", (short) (Od.Xd() ^ (-9394))), Class.forName(C1561oA.yd("[QeO#`T``&Jjoeia", (short) (ZN.Xd() ^ 2163))), Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                    try {
                        if (be.V(context).booleanValue()) {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(buVar.B, buVar.I, Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            Z(bitmapCreateBitmap).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            Object[] objArr2 = {byteArrayOutputStream.toByteArray(), 2};
                            Method declaredMethod2 = Class.forName(Xg.qd("esjywrn9\u0002\u0002w{>Ss\u0007yKJ", (short) (C1499aX.Xd() ^ (-7474)), (short) (C1499aX.Xd() ^ (-28142)))).getDeclaredMethod(Jg.Wd("k^IYE8\u000f%}#\u0017pm`", (short) (ZN.Xd() ^ 8377), (short) (ZN.Xd() ^ 9565)), byte[].class, Integer.TYPE);
                            try {
                                declaredMethod2.setAccessible(true);
                                str = (String) declaredMethod2.invoke(null, objArr2);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } else {
                            YuvImage yuvImage = new YuvImage(bArr, 17, buVar.B, buVar.I, null);
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            yuvImage.compressToJpeg(new Rect(0, 0, buVar.B, buVar.I), 100, byteArrayOutputStream2);
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                            Z(bitmapDecodeByteArray).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream3);
                            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                            short sXd9 = (short) (C1607wl.Xd() ^ 23722);
                            short sXd10 = (short) (C1607wl.Xd() ^ 3681);
                            int[] iArr6 = new int["qLznK\u0013\u00025\u001fP\u001b\u0019&\u001ew_\u001b9y".length()];
                            QB qb6 = new QB("qLznK\u0013\u00025\u001fP\u001b\u0019&\u001ew_\u001b9y");
                            int i12 = 0;
                            while (qb6.YK()) {
                                int iKK6 = qb6.KK();
                                Xu xuXd6 = Xu.Xd(iKK6);
                                iArr6[i12] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i12 % C1561oA.Xd.length] ^ ((i12 * sXd10) + sXd9)));
                                i12++;
                            }
                            Object[] objArr3 = {byteArray2, 2};
                            Method declaredMethod3 = Class.forName(new String(iArr6, 0, i12)).getDeclaredMethod(C1626yg.Ud(".BDv]r?'}OF 2h", (short) (ZN.Xd() ^ 18460), (short) (ZN.Xd() ^ 11372)), byte[].class, Integer.TYPE);
                            try {
                                declaredMethod3.setAccessible(true);
                                str = (String) declaredMethod3.invoke(null, objArr3);
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }
                    } catch (bi e4) {
                        e4.printStackTrace();
                        str = "";
                    }
                    I i13 = new I((byte) 0);
                    i13.B = (int) (System.currentTimeMillis() / 1000);
                    i13.I = str;
                    arrayList.add(i13);
                    i10++;
                    int i14 = Code + 55;
                    D = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 3 % 2;
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            co coVar = new co();
            for (I i16 : arrayList) {
                cv cvVar3 = new cv();
                cvVar3.Z(Ig.wd("6t\u00155X", (short) (C1633zX.Xd() ^ (-32047))), i16.I);
                cvVar3.B(EO.Od("9\u0005X+rH\u0013q;", (short) (C1499aX.Xd() ^ (-12350))), Integer.valueOf(i16.B));
                coVar.B(cvVar3);
            }
            cvVar.I(C1561oA.Qd("\u000e\u001a\u000f\t", (short) (ZN.Xd() ^ 15389)), coVar);
            try {
                by.I(context).I(com.facetec.sdk.Code.Code(context, I(46 - ExpandableListView.getPackedPositionGroup(0L), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 124), C1593ug.zd(" \"#%'ѪҘҙ.)130:8:6;33@F@B=?@FDFOCSJFPNPMҌYIKRW[", (short) (ZN.Xd() ^ 6195), (short) (ZN.Xd() ^ 4446))).intern(), cvVar)).Z(new cf.I() { // from class: com.facetec.sdk.a.2
                    AnonymousClass2() {
                    }

                    @Override // com.facetec.sdk.cf.I
                    public final void B(fy fyVar) throws IOException {
                        fyVar.V();
                    }

                    @Override // com.facetec.sdk.cf.I
                    public final void Z() {
                    }
                });
            } catch (Code.V e6) {
                e6.printStackTrace();
            }
        }
    }

    static void V(Context context, com.facetec.sdk.V v2, String str) {
        int i2 = 2 % 2;
        if (context != null) {
            int i3 = D + 13;
            Code = i3 % 128;
            int i4 = i3 % 2;
            if (V()) {
                Z(new Runnable() { // from class: com.facetec.sdk.a.1
                    private static int[] B = {265907950, 539096245, -1857628990, 259532621, -1474227605, -885746930, -1039469429, -1945161618, -530742893, 154678506, 1407073196, -1367480365, -701214376, 824933466, 2122496221, -1370168372, -1412676774, -1145117732};
                    private static int D = 1;
                    private static int V = 0;
                    private /* synthetic */ Context Code;
                    private /* synthetic */ String I;

                    /* JADX INFO: renamed from: com.facetec.sdk.a$1$1 */
                    final class C01571 implements cf.I {
                        C01571() {
                        }

                        @Override // com.facetec.sdk.cf.I
                        public final void B(fy fyVar) throws IOException {
                            fyVar.V();
                        }

                        @Override // com.facetec.sdk.cf.I
                        public final void Z() {
                        }
                    }

                    AnonymousClass1(String str2, Context context2) {
                        str = str2;
                        context = context2;
                    }

                    private static String Z(int[] iArr, int i22) {
                        int i32 = 2 % 2;
                        int i42 = D + 41;
                        V = i42 % 128;
                        int i5 = i42 % 2;
                        char[] cArr = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) B.clone();
                        int i6 = V + 19;
                        D = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = 0;
                        while (i8 < iArr.length) {
                            int i9 = iArr[i8];
                            char c2 = (char) (i9 >> 16);
                            char c3 = (char) i9;
                            int i10 = iArr[i8 + 1];
                            char[] cArr2 = {c2, c3, (char) (i10 >> 16), (char) i10};
                            es.Code(cArr2, iArr2, false);
                            int i11 = i8 << 1;
                            cArr[i11] = cArr2[0];
                            cArr[i11 + 1] = cArr2[1];
                            cArr[i11 + 2] = cArr2[2];
                            cArr[i11 + 3] = cArr2[3];
                            i8 += 2;
                            int i12 = D + 31;
                            V = i12 % 128;
                            int i13 = i12 % 2;
                        }
                        return new String(cArr, 0, i22);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instruction units count: 274
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.a.AnonymousClass1.run():void");
                    }
                });
                int i5 = D + 107;
                Code = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        }
    }

    static void V(Context context, bg.V v2) {
        int i2 = 2 % 2;
        int i3 = D + 121;
        Code = i3 % 128;
        int i4 = i3 % 2;
        V(context, com.facetec.sdk.V.VOCAL_GUIDANCE_STARTED, v2.B());
        int i5 = D + 13;
        Code = i5 % 128;
        int i6 = i5 % 2;
    }

    static boolean V() {
        boolean zCode;
        int i2 = 2 % 2;
        int i3 = Code + 19;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            zCode = com.facetec.sdk.Z.Code();
            int i4 = 57 / 0;
        } else {
            zCode = com.facetec.sdk.Z.Code();
        }
        int i5 = Code + 49;
        D = i5 % 128;
        int i6 = i5 % 2;
        return zCode;
    }

    private static Bitmap Z(Bitmap bitmap) {
        int i2 = 2 % 2;
        Matrix matrix = new Matrix();
        matrix.postRotate(270.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        int i3 = Code + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        D = i3 % 128;
        int i4 = i3 % 2;
        return bitmapCreateBitmap;
    }

    static /* synthetic */ D Z(Context context) {
        int i2 = 2 % 2;
        int i3 = Code + 17;
        D = i3 % 128;
        int i4 = i3 % 2;
        D dCode = Code(context);
        if (i4 == 0) {
            int i5 = 84 / 0;
        }
        return dCode;
    }

    static /* synthetic */ String Z() {
        int i2 = 2 % 2;
        int i3 = D + 37;
        Code = i3 % 128;
        int i4 = i3 % 2;
        String strConcat = "temp_minr9h493v".concat(String.valueOf(ce.V(22, 22)));
        int i5 = D + 93;
        Code = i5 % 128;
        if (i5 % 2 == 0) {
            return strConcat;
        }
        throw null;
    }

    private static void Z(Runnable runnable) {
        int i2 = 2 % 2;
        AnonymousClass3 anonymousClass3 = new Thread() { // from class: com.facetec.sdk.a.3
            private /* synthetic */ Runnable I;

            AnonymousClass3(Runnable runnable2) {
                runnable = runnable2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                setPriority(1);
                Process.setThreadPriority(19);
                runnable.run();
            }
        };
        anonymousClass3.setPriority(1);
        anonymousClass3.start();
        int i3 = Code + 53;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
    }

    static /* synthetic */ byte[] Z(Context context, String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = Code + 115;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            B(context, str);
            throw null;
        }
        byte[] bArrB = B(context, str);
        int i4 = Code + 93;
        D = i4 % 128;
        int i5 = i4 % 2;
        return bArrB;
    }
}
