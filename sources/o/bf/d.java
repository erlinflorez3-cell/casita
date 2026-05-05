package o.bf;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.GZIPInputStream;
import o.bu.c;
import o.cg.f;
import o.ea.g;
import o.ef.b;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends f {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21004f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f21005h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f21006i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21007l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21008m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21009n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21010o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r8, int r9, short r10) {
        /*
            int r0 = r8 * 3
            int r8 = 1 - r0
            byte[] r7 = o.bf.d.$$c
            int r6 = 122 - r9
            int r0 = r10 * 4
            int r5 = r0 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L2a
            r1 = r5
            r2 = r3
        L13:
            int r0 = -r5
            int r6 = r6 + r0
            int r5 = r1 + 1
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r7[r5]
            r1 = r5
            r5 = r0
            goto L13
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bf.d.$$g(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21007l = 0;
        f21009n = 1;
        f21010o = 0;
        f21008m = 1;
        e();
        TextUtils.lastIndexOf("", '0', 0, 0);
        SystemClock.elapsedRealtime();
        int i2 = f21007l + 125;
        f21009n = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    d(Context context) throws o.bk.d {
        super(context, 17);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void C(char r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bf.d.C(char, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object[]):void");
    }

    public static String d(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21008m + 45;
        f21010o = i3 % 128;
        int i4 = i3 % 2;
        try {
            byte[] bytes = str.getBytes(g.c());
            Class<?> cls = Class.forName(hg.Vd("S_Ta]VP\u0019_]QS\u0014'EVG\u0017\u0014", (short) (OY.Xd() ^ 32333), (short) (OY.Xd() ^ 10098)));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE};
            Object[] objArr = {bytes, 10};
            short sXd = (short) (ZN.Xd() ^ 17262);
            int[] iArr = new int["IIFQEE".length()];
            QB qb = new QB("IIFQEE");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(sXd + i5 + xuXd.CK(iKK));
                i5++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i5), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                if (bArr[0] == 31) {
                    int i6 = f21010o + 39;
                    f21008m = i6 % 128;
                    int i7 = i6 % 2;
                    if (bArr[1] == -117) {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr2 = new byte[32];
                        while (true) {
                            int i8 = gZIPInputStream.read(bArr2);
                            if (i8 == -1) {
                                gZIPInputStream.close();
                                return sb.toString();
                            }
                            sb.append(new String(bArr2, 0, i8, g.c()));
                        }
                    }
                }
                return new String(bArr, g.c());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            if (!o.ea.f.a()) {
                return null;
            }
            Object[] objArr2 = new Object[1];
            C((char) (59361 - View.MeasureSpec.getMode(0)), C1561oA.yd("\ue15aท很샕䷹됚\uf2ba\ud811蓰倚ᢽ揹ພ峆淢뤦ᗣ퉓쩹鷖ざᖿ\ue45bࠦ\ue000쑴閇ꞝ慪", (short) (C1580rY.Xd() ^ (-26447))), C1561oA.Yd("ȧȨȩȪ", (short) (C1607wl.Xd() ^ 1866)), Xg.qd("啳欍ࢠ윑", (short) (C1607wl.Xd() ^ 23470), (short) (C1607wl.Xd() ^ 14999)), 2001462581 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            C((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22763), Jg.Wd("뫅軉哘烂쾥쭙\u0a00㋢냿ỉ雩枙釮嘆", (short) (C1580rY.Xd() ^ (-15462)), (short) (C1580rY.Xd() ^ (-10674))), ZO.xd("\u0097҅Լԉ", (short) (Od.Xd() ^ (-27571)), (short) (Od.Xd() ^ (-25796))), C1626yg.Ud("疀䴝씮䯰", (short) (FB.Xd() ^ 29246), (short) (FB.Xd() ^ 27316)), ViewConfiguration.getDoubleTapTimeout() >> 16, objArr3);
            o.ea.f.e(strIntern, ((String) objArr3[0]).intern(), e3);
            return null;
        }
    }

    static void e() {
        f21006i = 740602047300126166L;
        f21004f = 941486469;
        f21005h = (char) 17878;
    }

    static void init$0() {
        $$c = new byte[]{92, 54, -72, -111};
        $$f = Mp4VideoDirectory.TAG_COLOR_TABLE;
    }

    @Override // o.cg.f
    public final String a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21008m + 43;
        f21010o = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        C((char) (57935 - TextUtils.indexOf("", "", 0, 0)), "\uf48eㄫ쭨鉚햮㬑\uea7a\ue394惛쫤\uf184㫲ġ劄ᣏꂕ⮜쏗勆", "\u0000\u0000\u0000\u0000", "堅敆佹㓢", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2036680280, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f21008m + 37;
        f21010o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return strIntern;
    }

    @Override // o.cg.f
    public final void d() throws b, o.bt.b, c, o.bw.d {
        int i2 = 2 % 2;
        int i3 = f21008m + 33;
        f21010o = i3 % 128;
        int i4 = i3 % 2;
        j();
        m();
        o();
        int i5 = f21010o + 69;
        f21008m = i5 % 128;
        int i6 = i5 % 2;
    }
}
