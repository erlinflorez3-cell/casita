package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facetec.sdk.Code;
import com.facetec.sdk.cf;
import com.facetec.sdk.fq;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Semaphore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
class br implements ZoomEncryptStrings {
    private static final Semaphore B;
    private static int C = 0;
    private static /* synthetic */ boolean Code = false;
    private static long D = 0;
    private static int F = 1;
    private static char I = 0;
    private static volatile boolean V = false;
    private static char[] Z = null;

    /* JADX INFO: renamed from: com.facetec.sdk.br$1 */
    final class AnonymousClass1 implements cf.I {
        AnonymousClass1() {
        }

        @Override // com.facetec.sdk.cf.I
        public final void B(fy fyVar) throws IOException {
        }

        @Override // com.facetec.sdk.cf.I
        public final void Z() {
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.br$2 */
    final class AnonymousClass2 implements cf.I, Runnable {
        private /* synthetic */ String B;
        private /* synthetic */ long C;
        private /* synthetic */ String Code;
        private /* synthetic */ Runnable D;
        private /* synthetic */ ft F;
        private /* synthetic */ String I;
        private /* synthetic */ Context L;
        private /* synthetic */ boolean S = true;
        private /* synthetic */ Context V;
        private /* synthetic */ String Z;

        AnonymousClass2(String str, String str2, String str3, Context context, String str4, ft ftVar, Context context2, long j2, Runnable runnable) {
            this.Z = str;
            this.Code = str2;
            this.I = str3;
            this.V = context;
            this.B = str4;
            this.F = ftVar;
            this.L = context2;
            this.C = j2;
            this.D = runnable;
        }

        @Override // com.facetec.sdk.cf.I
        public final void B(fy fyVar) throws Throwable {
            if (br.Z()) {
                br.I(this.L);
            }
        }

        @Override // com.facetec.sdk.cf.I
        public final void Z() {
            if (this.S) {
                br.Code(this.L);
            }
            Runnable runnable = this.D;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            fq.Z zB = new fq.Z().B("e", this.Z);
            zB.B("diagnosticSessionId", this.Code);
            String str = this.I;
            if (str != null) {
                zB.B("diagnosticId", str);
            }
            try {
                this.F.I(Code.V(this.V, this.B).B(zB.Code()).Z()).Z(this);
            } catch (Code.V unused) {
                br.Code(this.L);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.br$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Z;

        static {
            int[] iArr = new int[bp.values().length];
            Z = iArr;
            try {
                iArr[bp.ZOOM_EVENT_ENROLL_SESSION_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Z[bp.ZOOM_EVENT_MID_ENROLL_SESSION_GLASSES_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Z[bp.ZOOM_EVENT_ENROLL_SESSION_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Z[bp.ZOOM_EVENT_ENROLL_SESSION_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Z[bp.ZOOM_EVENT_ENROLL_SESSION_CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Z[bp.ZOOM_EVENT_VERIFY_SESSION_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Z[bp.ZOOM_EVENT_VERIFY_SESSION_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Z[bp.ZOOM_EVENT_VERIFY_SESSION_FAIL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Z[bp.ZOOM_EVENT_VERIFY_SESSION_CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Z[bp.ZOOM_EVENT_AUTH_SESSION_START.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Z[bp.ZOOM_EVENT_AUTH_SESSION_SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Z[bp.ZOOM_EVENT_AUTH_SESSION_FAIL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Z[bp.ZOOM_EVENT_AUTH_SESSION_CANCEL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Z[bp.ZOOM_EVENT_DIAGNOSTIC_UPLOAD_FAIL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                Z[bp.ZOOM_EVENT_ZOOM_SESSION_SUCCESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                Z[bp.ZOOM_EVENT_PHOENIX_SESSION_FAIL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                Z[bp.ZOOM_EVENT_ZOOM_SESSION_FAIL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.br$5 */
    final class AnonymousClass5 implements Runnable {
        private /* synthetic */ Context I;

        AnonymousClass5(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List listV;
            try {
                try {
                    br.V().acquire();
                    listV = br.V(context, Boolean.TRUE);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    br.V().release();
                    listV = null;
                }
                if (listV == null || listV.isEmpty()) {
                    return;
                }
                br.Z(context, listV);
            } finally {
                br.V().release();
            }
        }
    }

    static class I {
        I() {
        }
    }

    static {
        I();
        int i2 = C + 67;
        F = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        Code = true;
        B = new Semaphore(1);
        V = false;
        int i5 = C + 55;
        F = i5 % 128;
        int i6 = i5 % 2;
    }

    br() {
    }

    private static void B(Context context) {
        int i2 = 2 % 2;
        Code(context, Collections.singletonList(new I()));
        int i3 = C + 25;
        F = i3 % 128;
        int i4 = i3 % 2;
    }

    static void B(Context context, bp bpVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 59;
        F = i3 % 128;
        int i4 = i3 % 2;
        V(context, bpVar, null);
        if (i4 == 0) {
            throw null;
        }
    }

    private static String Code() {
        int i2 = 2 % 2;
        int i3 = C + 89;
        F = i3 % 128;
        int i4 = i3 % 2;
        String strIntern = I("\n\u000b\u000b\u0006\u001a\u001b\u0010\u0015\u001c\u001d\u001b\u000b\f\u001f !\"\u001f\u0010\u001e\u0094", 21 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((-16777166) - Color.rgb(0, 0, 0))).intern();
        int i5 = C + 81;
        F = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return strIntern;
    }

    static /* synthetic */ void Code(Context context) {
        int i2 = 2 % 2;
        int i3 = F + 43;
        C = i3 % 128;
        int i4 = i3 % 2;
        B(context);
        int i5 = C + 1;
        F = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void Code(Context context, List<I> list) {
        Semaphore semaphore;
        int i2 = 2 % 2;
        int i3 = F + 17;
        C = i3 % 128;
        try {
            try {
                if (i3 % 2 != 0) {
                    semaphore = B;
                    semaphore.acquire();
                    List<I> listZ = Z(context, Boolean.FALSE);
                    listZ.addAll(list);
                    V(context, listZ);
                    V = false;
                } else {
                    semaphore = B;
                    semaphore.acquire();
                    List<I> listZ2 = Z(context, Boolean.FALSE);
                    listZ2.addAll(list);
                    V(context, listZ2);
                    V = true;
                }
                semaphore.release();
            } catch (Exception e2) {
                e2.printStackTrace();
                B.release();
            }
        } catch (Throwable th) {
            B.release();
            throw th;
        }
    }

    private static String I(String str, int i2, byte b2) {
        int i3 = 2 % 2;
        int i4 = C;
        int i5 = i4 + 11;
        F = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str;
        if (str != null) {
            int i7 = i4 + 111;
            F = i7 % 128;
            int i8 = i7 % 2;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        char[] cArr2 = Z;
        char c2 = I;
        char[] cArr3 = new char[i2];
        if (i2 % 2 != 0) {
            i2--;
            cArr3[i2] = (char) (cArr[i2] - b2);
        }
        if (i2 > 1) {
            int i9 = F + 59;
            C = i9 % 128;
            int i10 = i9 % 2;
            for (int i11 = 0; i11 < i2; i11 += 2) {
                char c3 = cArr[i11];
                int i12 = i11 + 1;
                char c4 = cArr[i12];
                if (c3 == c4) {
                    cArr3[i11] = (char) (c3 - b2);
                    cArr3[i12] = (char) (c4 - b2);
                } else {
                    int iZ = er.Z(c3, c2);
                    int iCode = er.Code(c3, c2);
                    int iZ2 = er.Z(c4, c2);
                    int iCode2 = er.Code(c4, c2);
                    if (iCode == iCode2) {
                        int i13 = F + 91;
                        C = i13 % 128;
                        int i14 = i13 % 2;
                        int I2 = er.I(iZ, c2);
                        int I3 = er.I(iZ2, c2);
                        int iV = er.V(I2, iCode, c2);
                        int iV2 = er.V(I3, iCode2, c2);
                        cArr3[i11] = cArr2[iV];
                        cArr3[i12] = cArr2[iV2];
                    } else if (iZ == iZ2) {
                        int i15 = C + 85;
                        F = i15 % 128;
                        int i16 = i15 % 2;
                        int I4 = er.I(iCode, c2);
                        int I5 = er.I(iCode2, c2);
                        int iV3 = er.V(iZ, I4, c2);
                        int iV4 = er.V(iZ2, I5, c2);
                        cArr3[i11] = cArr2[iV3];
                        cArr3[i12] = cArr2[iV4];
                    } else {
                        int iV5 = er.V(iZ, iCode2, c2);
                        int iV6 = er.V(iZ2, iCode, c2);
                        cArr3[i11] = cArr2[iV5];
                        cArr3[i12] = cArr2[iV6];
                    }
                }
            }
        }
        return new String(cArr3);
    }

    static void I() {
        I = (char) 6;
        Z = new char[]{'h', 't', 'p', 's', AbstractJsonLexerKt.COLON, '/', 'a', 'i', '.', 'z', 'o', 'm', 'u', 'c', 'v', '1', 'e', 'n', 'C', 'l', 'd', TokenParser.SP, 'f', 'r', 'q', '_', 'b', '0', 'F', 'M', 'N', 'B', '8', '7', 'k', 'j'};
        D = 7950209696138000507L;
    }

    static void I(Context context) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("q}r\u007f\u0004|v?kvtyqy~7c\u000f\r\u0012\n\u001c\u0017", (short) (C1633zX.Xd() ^ (-10593)))).getMethod(Qg.kd("DAO\u001bIHC?85G;@>\u0012=;@0B=", (short) (C1580rY.Xd() ^ (-9105)), (short) (C1580rY.Xd() ^ (-819))), new Class[0]);
        try {
            method.setAccessible(true);
            ax.Z(new Runnable() { // from class: com.facetec.sdk.br.5
                private /* synthetic */ Context I;

                AnonymousClass5(Context context2) {
                    context = context2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    List listV;
                    try {
                        try {
                            br.V().acquire();
                            listV = br.V(context, Boolean.TRUE);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            br.V().release();
                            listV = null;
                        }
                        if (listV == null || listV.isEmpty()) {
                            return;
                        }
                        br.Z(context, listV);
                    } finally {
                        br.V().release();
                    }
                }
            });
            int i3 = C + 37;
            F = i3 % 128;
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

    private static String V(bp bpVar) {
        int i2 = 2 % 2;
        Object obj = null;
        switch (AnonymousClass4.Z[bpVar.ordinal()]) {
            case 1:
                return I("~", -ImageFormat.getBitsPerPixel(0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 21)).intern();
            case 2:
                return I("´", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, (byte) (71 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern();
            case 3:
                return I("å", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, (byte) (View.resolveSize(0, 0) + PanasonicMakernoteDirectory.TAG_BURST_SPEED)).intern();
            case 4:
                return Z("좤溪죋좹ノ", (Process.myTid() >> 22) + 1).intern();
            case 5:
                return I("\u0081", ((Process.getThreadPriority(0) + 20) >> 6) + 1, (byte) (17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).intern();
            case 6:
                return I("ß", 1 - (ViewConfiguration.getTapTimeout() >> 16), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 108)).intern();
            case 7:
                String strIntern = Z("\ue1d8骞\ue1acגּ怨", View.MeasureSpec.getMode(0) + 1).intern();
                int i3 = C + 1;
                F = i3 % 128;
                if (i3 % 2 != 0) {
                    return strIntern;
                }
                super.hashCode();
                throw null;
            case 8:
                return Z("\uf364ꐤ\uf311싙᳆", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern();
            case 9:
                return I("\u0085", TextUtils.indexOf("", "", 0) + 1, (byte) ((-16777201) - Color.rgb(0, 0, 0))).intern();
            case 10:
                return I("\u0083", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) (33 - Process.getGidForName(""))).intern();
            case 11:
                return Z("鳵\uda32鲗ᬻꏁ", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
            case 12:
                return I("g", 1 - TextUtils.getOffsetBefore("", 0), (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 4)).intern();
            case 13:
                return Z("\ud80b\ue926\ud86f癁冼", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern();
            case 14:
                return Z("\udfcd\uef63\udfb4\u0cf6乓", -MotionEvent.axisFromString("")).intern();
            case 15:
                return Z("귯誕궗梍㍃", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
            case 16:
                String strIntern2 = Z("뙂ऑ똰\u0eef楊", Drawable.resolveOpacity(0, 0) + 1).intern();
                int i4 = C + 61;
                F = i4 % 128;
                if (i4 % 2 != 0) {
                    return strIntern2;
                }
                super.hashCode();
                throw null;
            case 17:
                return Z("洣쐙浙ꋄ\ue8c4", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern();
            default:
                if (Code) {
                    return I("\f\u000b", 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((Process.myTid() >> 22) + 20)).intern();
                }
                throw new AssertionError();
        }
    }

    static /* synthetic */ List V(Context context, Boolean bool) throws Exception {
        int i2 = 2 % 2;
        int i3 = C + 123;
        F = i3 % 128;
        int i4 = i3 % 2;
        List<I> listZ = Z(context, bool);
        int i5 = F + 23;
        C = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return listZ;
    }

    static /* synthetic */ Semaphore V() {
        Semaphore semaphore;
        int i2 = 2 % 2;
        int i3 = C + 69;
        int i4 = i3 % 128;
        F = i4;
        if (i3 % 2 == 0) {
            semaphore = B;
            int i5 = 92 / 0;
        } else {
            semaphore = B;
        }
        int i6 = i4 + 123;
        C = i6 % 128;
        if (i6 % 2 == 0) {
            return semaphore;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static void V(Context context, bp bpVar, Runnable runnable) throws Throwable {
        int i2 = 2 % 2;
        if (n.I()) {
            ft ftVarI = by.I(context);
            String strB = bz.B(V(bpVar));
            long time = new Date().getTime();
            String str = null;
            if (bpVar.B()) {
                int i3 = C + 25;
                F = i3 % 128;
                if (i3 % 2 == 0) {
                    String str2 = ad.V;
                    throw null;
                }
                str = ad.V;
            }
            String str3 = ad.B;
            Object[] objArr = new Object[0];
            Method method = Class.forName(yg.hg.Vd("t\u0001u\u0003~wq:nyw|lty2Fqotdvq", (short) (C1499aX.Xd() ^ (-21894)), (short) (C1499aX.Xd() ^ (-25206)))).getMethod(C1561oA.ud("\u001b\u0018&q \u001f\u001a\u0016\u000f\f\u001e\u0012\u0017\u0015h\u0014\u0012\u0017\u0007\u0019\u0014", (short) (C1607wl.Xd() ^ 12754)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                if (n.Code != null) {
                    ax.Z(new AnonymousClass2(strB, str3, str, context, new StringBuilder().append(I(C1561oA.yd("$&')#%Ęę#é%'!#$ \u001f&\u0017\u0017\u0016\u001e\u001c\u0018Ø\u0017\u000e\u0016\t\u0019\u001a\r\r\u000f\u0010\fÌ\u0004\u0010\u0006{\u0005\b\u000eî", (short) (Od.Xd() ^ (-14679))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 44, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 122)).intern()).append(n.Code).toString(), ftVarI, context2, time, runnable));
                    return;
                }
                B(context);
                int i4 = F + 125;
                C = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 43 / 0;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static void V(Context context, List<I> list) throws Exception {
        int i2 = 2 % 2;
        String strI = new ck().I(list);
        byte[] bArrZ = Z(context);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014", (short) (FB.Xd() ^ 17177))).getMethod(Xg.qd("VUe5TW][;ak", (short) (C1607wl.Xd() ^ 26183), (short) (C1607wl.Xd() ^ 8153)), new Class[0]);
        try {
            method.setAccessible(true);
            m.I(new File((File) method.invoke(context, objArr), Code()), bArrZ, strI.getBytes(StandardCharsets.UTF_8));
            int i3 = F + 97;
            C = i3 % 128;
            int i4 = i3 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String Z(java.lang.String r12, int r13) {
        /*
            r11 = 2
            int r0 = r11 % r11
            int r0 = com.facetec.sdk.br.F
            int r1 = r0 + 31
            int r0 = r1 % 128
            com.facetec.sdk.br.C = r0
            int r1 = r1 % r11
            if (r1 == 0) goto L62
            r0 = 92
            int r0 = r0 / 0
            if (r12 == 0) goto L18
        L14:
            char[] r12 = r12.toCharArray()
        L18:
            char[] r12 = (char[]) r12
            long r0 = com.facetec.sdk.br.D
            char[] r7 = com.facetec.sdk.eq.I(r0, r12, r13)
            r6 = 4
            r8 = r6
        L22:
            int r0 = r7.length
            if (r8 >= r0) goto L65
            int r0 = com.facetec.sdk.br.C
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.facetec.sdk.br.F = r0
            int r1 = r1 % r11
            if (r1 != 0) goto L4c
            int r4 = r8 << 2
            char r2 = r7[r8]
            int r0 = r8 >> 5
            char r1 = r7[r0]
            int r0 = r2 + r1
            r2 = r2 & r1
            int r0 = r0 - r2
            long r2 = (long) r0
            long r4 = (long) r4
            long r9 = com.facetec.sdk.br.D
            long r0 = r4 + r9
            long r4 = r4 & r9
            long r0 = r0 - r4
            long r2 = r2 * r0
            int r0 = (int) r2
            char r0 = (char) r0
            r7[r8] = r0
            int r8 = r8 + 71
            goto L22
        L4c:
            int r2 = r8 + (-4)
            char r1 = r7[r8]
            int r0 = r8 % 4
            char r0 = r7[r0]
            r1 = r1 ^ r0
            long r4 = (long) r1
            long r2 = (long) r2
            long r0 = com.facetec.sdk.br.D
            long r2 = r2 * r0
            long r4 = r4 ^ r2
            int r0 = (int) r4
            char r0 = (char) r0
            r7[r8] = r0
            int r8 = r8 + 1
            goto L22
        L62:
            if (r12 == 0) goto L18
            goto L14
        L65:
            java.lang.String r1 = new java.lang.String
            int r0 = r7.length
            int r0 = r0 - r6
            r1.<init>(r7, r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.br.Z(java.lang.String, int):java.lang.String");
    }

    private static List<I> Z(Context context, Boolean bool) throws Exception {
        int i2 = 2 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("\u0003Cmo(\u0018IHy8-f\u0010\rHsG'\u001cXC\f<", (short) (C1633zX.Xd() ^ (-23192)), (short) (C1633zX.Xd() ^ (-14362)))).getMethod(ZO.xd("-^(:M;>0PIa", (short) (Od.Xd() ^ (-1732)), (short) (Od.Xd() ^ (-8151))), new Class[0]);
        try {
            method.setAccessible(true);
            File file = new File((File) method.invoke(context, objArr), Code());
            if (!file.exists()) {
                ArrayList arrayList = new ArrayList();
                int i3 = C + 79;
                F = i3 % 128;
                int i4 = i3 % 2;
                return arrayList;
            }
            I[] iArr = (I[]) new ck().Z(new String(m.I(file, Z(context)), StandardCharsets.UTF_8), I[].class);
            if (bool.booleanValue()) {
                int i5 = C + 87;
                F = i5 % 128;
                int i6 = i5 % 2;
                file.delete();
                V = false;
            }
            return new ArrayList(Arrays.asList(iArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ void Z(Context context, List list) {
        int i2 = 2 % 2;
        try {
            by.I(context).I(Code.Code(context, Z("헛鿑햳瓞襞柞葜恟㑄䖌ꘓ䈬ᙢ⏲쁹\u2439灥Ɓ\ue20b؆刊ᾏఌ\uf817뱩ﶥ⸣\uda3e鹼\udbb3䣐뷎\uf880멈檅龔\udac1顥瓧燢Ⓒ癥雹厐ڐ吋낟㖙惐㈡튢ឭ䊧ဳﲶ\u09ba", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern(), list)).Z(new cf.I() { // from class: com.facetec.sdk.br.1
                AnonymousClass1() {
                }

                @Override // com.facetec.sdk.cf.I
                public final void B(fy fyVar) throws IOException {
                }

                @Override // com.facetec.sdk.cf.I
                public final void Z() {
                }
            });
            int i3 = C + 93;
            F = i3 % 128;
            int i4 = i3 % 2;
        } catch (Code.V e2) {
            I("\u0016\u0006\r\u0012\u0015\u0016\u0010\u000b\u0003\u0013\f\u0012\u0002\u0001\u0011\f\u0007\r\f\u0007\u0004\r\u0016\tyy\u0019\r\f\u0011\u0016\u000f\u000f\u0011\r\u0005\t\u001b\u0016\u0011\u001e\u0012\u000f\u0004\u0002\u00053", 46 - ImageFormat.getBitsPerPixel(0), (byte) (KeyEvent.getDeadChar(0, 0) + 19)).intern();
            e2.getMessage();
        }
    }

    static /* synthetic */ boolean Z() {
        int i2 = 2 % 2;
        int i3 = C + 17;
        F = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = V;
        if (i4 == 0) {
            int i5 = 18 / 0;
        }
        return z2;
    }

    private static byte[] Z(Context context) throws Exception {
        int i2 = 2 % 2;
        int i3 = C + 43;
        F = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrI = C1150r.I(Z.Z(context), Z("ྰ\uee2c\u0ff5嫚풯ᘡꩉ㶰\uee28㑫衛ᾓ찋列\uee71秆ꨇ灶찃寨补湳", 1 - Color.red(0)).intern());
        int i5 = F + 15;
        C = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return bArrI;
    }
}
