package o.m;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char f26428a = 0;

    /* JADX INFO: renamed from: b */
    private static char f26429b = 0;

    /* JADX INFO: renamed from: c */
    private static int f26430c = 0;

    /* JADX INFO: renamed from: d */
    private static char f26431d = 0;

    /* JADX INFO: renamed from: e */
    private static char f26432e = 0;

    /* JADX INFO: renamed from: f */
    private static int f26433f = 0;

    /* JADX INFO: renamed from: j */
    private static int f26434j = 0;

    /* JADX INFO: renamed from: m */
    private static int f26435m = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, int r9, int r10) {
        /*
            int r0 = r9 * 2
            int r7 = 3 - r0
            int r2 = r10 * 4
            int r1 = 1 - r2
            byte[] r6 = o.m.d.$$a
            int r0 = r8 * 3
            int r5 = 72 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L2b
            r0 = r2
            r1 = r3
        L17:
            int r0 = -r0
            int r5 = r5 + r0
        L19:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r7 = r7 + 1
            int r1 = r1 + 1
            r0 = r6[r7]
            goto L17
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.d.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26434j = 0;
        f26435m = 1;
        f26430c = 0;
        f26433f = 1;
        b();
        Drawable.resolveOpacity(0, 0);
        int i2 = f26435m + 53;
        f26434j = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public d() {
        super(i.f26497e);
    }

    static void b() {
        f26428a = (char) 61021;
        f26429b = (char) 17526;
        f26431d = (char) 16380;
        f26432e = (char) 55517;
    }

    static void init$0() {
        $$a = new byte[]{76, -81, MessagePack.Code.EXT16, -107};
        $$b = 206;
    }

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i5 = $10 + 33;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 40 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        int i7 = $11 + 17;
        $10 = i7 % 128;
        while (true) {
            int i8 = i7 % i3;
            if (gVar.f19924d >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i2);
                return;
            }
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i9 = $10 + 1;
            $11 = i9 % 128;
            int i10 = i9 % i3;
            int i11 = 58224;
            int i12 = 0;
            while (i12 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i13 = (c3 + i11) ^ ((c3 << 4) + ((char) (((long) f26431d) ^ (-7511683281764982996L))));
                int i14 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f26432e);
                    objArr2[i3] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 270, (char) TextUtils.getCapsMode("", 0, 0), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i11) ^ ((cCharValue << 4) + ((char) (((long) f26428a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f26429b)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(270 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.keyCodeFromString("") + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i11 -= 40503;
                    i12++;
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
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(270 - Gravity.getAbsoluteGravity(0, 0), (char) Drawable.resolveOpacity(0, 0), 10 - TextUtils.indexOf((CharSequence) "", '0'), -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i7 = $11 + 65;
            $10 = i7 % 128;
            i3 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x001d  */
    @Override // o.m.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final o.l.c e(android.content.Context r10, fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt r11) throws java.lang.Throwable {
        /*
            r9 = this;
            r5 = 2
            int r0 = r5 % r5
            boolean r0 = r11 instanceof fr.antelop.sdk.authentication.prompt.CustomerConsentPrompt
            if (r0 != 0) goto Lb4
            int r0 = o.m.d.f26433f
            int r1 = r0 + 39
            int r0 = r1 % 128
            o.m.d.f26430c = r0
            int r1 = r1 % r5
            r8 = 0
            r7 = 1
            if (r1 == 0) goto Lab
            boolean r1 = o.ea.f.a()
            r0 = 46
            int r0 = r0 / r8
            if (r1 == 0) goto L65
        L1d:
            int r0 = o.m.d.f26433f
            int r1 = r0 + 81
            int r0 = r1 % 128
            o.m.d.f26430c = r0
            int r1 = r1 % r5
            java.lang.String r4 = ""
            java.lang.String r2 = "葇遯ᆇ瞥䫉ꎔ栛欏텣\ue28d뀽摐\ud966켆藸䖠塱並슣䒐硙ྜྷ끡\ueacd\uf4c1蛩跪\udc5f봞逝饤䡁ܟ攷䁰ﭚ犿瘊\ue7a6\ue82e犿瘊汭鎥䐉㛳跪\udc5f\uf5ab鯙탲㳥栛欏屐ส鉕숎蔓稯"
            java.lang.String r3 = "끡\ueacd\uf4c1蛩跪\udc5f봞逝䋾譫堏䊬䁰ﭚ䢶琰峞釄쯌膕蔓稯"
            if (r1 == 0) goto L86
            int r0 = android.view.ViewConfiguration.getEdgeSlop()
            int r0 = r0 << 74
            r1 = 52
            int r1 = r1 << r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            p(r3, r1, r0)
            r0 = r0[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r0.intern()
            r0 = 104(0x68, float:1.46E-43)
            int r0 = android.text.TextUtils.lastIndexOf(r4, r0)
            r1 = 4
            int r1 = r1 << r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            p(r2, r1, r0)
            r0 = r0[r8]
        L53:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r3, r0)
            int r0 = o.m.d.f26433f
            int r1 = r0 + 51
            int r0 = r1 % 128
            o.m.d.f26430c = r0
            int r1 = r1 % r5
        L65:
            fr.antelop.sdk.exception.WalletValidationException r6 = new fr.antelop.sdk.exception.WalletValidationException
            fr.antelop.sdk.exception.WalletValidationErrorCode r5 = fr.antelop.sdk.exception.WalletValidationErrorCode.InvalidFormat
            long r3 = android.os.SystemClock.currentThreadTimeMillis()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r2 = 29 - r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "끡\ueacd\uf4c1蛩跪\udc5f봞逝饤䡁ܟ攷䁰ﭚ犿瘊\ue7a6\ue82e犿瘊汭鎥䐉㛳跪\udc5f\uf5ab鯙"
            p(r0, r2, r1)
            r0 = r1[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r6.<init>(r5, r0)
            throw r6
        L86:
            int r0 = android.view.ViewConfiguration.getEdgeSlop()
            int r0 = r0 >> 16
            int r1 = r0 + 21
            java.lang.Object[] r0 = new java.lang.Object[r7]
            p(r3, r1, r0)
            r0 = r0[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r0.intern()
            r0 = 48
            int r0 = android.text.TextUtils.lastIndexOf(r4, r0)
            int r1 = 58 - r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            p(r2, r1, r0)
            r0 = r0[r8]
            goto L53
        Lab:
            boolean r0 = o.ea.f.a()
            r0 = r0 ^ r7
            if (r0 == r7) goto L65
            goto L1d
        Lb4:
            fr.antelop.sdk.authentication.prompt.CustomerConsentPrompt r11 = (fr.antelop.sdk.authentication.prompt.CustomerConsentPrompt) r11
            o.k.b r2 = new o.k.b
            java.lang.String r1 = r11.getTitle()
            java.lang.String r0 = r11.getSubtitle()
            r2.<init>(r10, r1, r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.d.e(android.content.Context, fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt):o.l.c");
    }
}
