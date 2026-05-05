package o.bi;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.g;
import o.cg.f;

/* JADX INFO: loaded from: classes6.dex */
final class c extends f {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f21244f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f21245h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f21246i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21247k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21248l = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f21249o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r8, byte r9, int r10) {
        /*
            byte[] r7 = o.bi.c.$$c
            int r0 = r8 * 2
            int r6 = r0 + 1
            int r0 = r9 * 3
            int r5 = 4 - r0
            int r0 = r10 * 3
            int r0 = r0 + 69
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L2a
            r2 = r3
            r1 = r5
        L15:
            int r0 = -r0
            int r5 = r5 + 1
            int r0 = r0 + r1
        L19:
            r1 = r0
            byte r0 = (byte) r1
            r4[r2] = r0
            int r2 = r2 + 1
            if (r2 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r7[r5]
            goto L15
        L2a:
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bi.c.$$g(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21248l = 0;
        f21247k = 1;
        f21246i = (char) 45357;
        f21244f = (char) 50128;
        f21245h = (char) 33072;
        f21249o = (char) 62988;
    }

    c(Context context) {
        super(context, 27);
    }

    private static void C(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i5 = $11 + 1;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i7 = $11 + 79;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            int i9 = 58224;
            int i10 = 0;
            while (i10 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i11 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f21245h) ^ (-7511683281764982996L))));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f21249o);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 271, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - TextUtils.indexOf("", "", 0), -1995022631, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f21246i) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f21244f)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(270 - (Process.myPid() >> 22), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, -1995022631, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                int scrollBarSize = 270 - (ViewConfiguration.getScrollBarSize() >> 8);
                char c4 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iRed = Color.red(0) + 11;
                byte b6 = (byte) 0;
                byte b7 = b6;
                String str$$g = $$g(b6, b7, (byte) (b7 + 1));
                i3 = 2;
                objA3 = o.d.d.a(scrollBarSize, c4, iRed, -2074123590, false, str$$g, new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static /* synthetic */ f.e e(c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21248l + 83;
        f21247k = i3 % 128;
        if (i3 % 2 != 0) {
            return super.b_();
        }
        super.b_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$c = new byte[]{60, -17, 3, Ascii.NAK};
        $$f = 78;
    }

    @Override // o.cg.f
    public final String a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21247k + 87;
        f21248l = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        C("ꢜ\uf286駄\ueeee̜艒꜔ꗿ덆\ue682귛蝡쭍䃄䷛瞣ꢜ\uf286", ImageFormat.getBitsPerPixel(0) + 19, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f21248l + 37;
        f21247k = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.cg.f
    public final f.e b_() {
        int i2 = 2 % 2;
        new Thread() { // from class: o.bi.c.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f21250a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f21251c = 0;

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                int i3 = 2 % 2;
                int i4 = f21250a;
                int i5 = ((i4 + 59) - (59 | i4)) + ((-1) - (((-1) - i4) & ((-1) - 59)));
                f21251c = i5 % 128;
                int i6 = i5 % 2;
                try {
                    c.e(c.this);
                    int i7 = f21251c + 65;
                    f21250a = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                } catch (o.bk.d | o.cg.a e2) {
                    e2.printStackTrace();
                }
            }
        }.start();
        f.e eVar = new f.e(new o.ef.a(), true);
        int i3 = f21247k + 63;
        f21248l = i3 % 128;
        if (i3 % 2 == 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.cg.f
    public final void d() throws o.ef.b, o.bt.b, o.bu.c, o.bw.d {
        int i2 = 2 % 2;
        int i3 = f21248l + 109;
        f21247k = i3 % 128;
        if (i3 % 2 != 0) {
            j();
            l();
            m();
            o();
            n();
            k();
            return;
        }
        j();
        l();
        m();
        o();
        n();
        k();
        throw null;
    }
}
