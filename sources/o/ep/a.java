package o.ep;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.card.emvapplication.EmvApplication;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.a.g;
import o.a.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Iterable<o.eq.b> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;
    public static int B = 0;
    private static int C = 0;
    public static int D = 0;

    /* JADX INFO: renamed from: a */
    public static int f24398a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24399b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24400c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24401d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24402e = 0;

    /* JADX INFO: renamed from: f */
    public static int f24403f = 0;

    /* JADX INFO: renamed from: g */
    public static int f24404g = 0;

    /* JADX INFO: renamed from: h */
    public static int f24405h = 0;

    /* JADX INFO: renamed from: i */
    public static int f24406i = 0;

    /* JADX INFO: renamed from: j */
    public static int f24407j = 0;

    /* JADX INFO: renamed from: l */
    public static int f24408l = 0;

    /* JADX INFO: renamed from: n */
    public static int f24409n = 0;

    /* JADX INFO: renamed from: t */
    private static int[] f24410t = null;

    /* JADX INFO: renamed from: u */
    private static char f24411u = 0;

    /* JADX INFO: renamed from: v */
    private static char f24412v = 0;

    /* JADX INFO: renamed from: w */
    private static char f24413w = 0;

    /* JADX INFO: renamed from: x */
    private static char f24414x = 0;

    /* JADX INFO: renamed from: y */
    private static int f24415y = 0;

    /* JADX INFO: renamed from: z */
    private static int f24416z = 0;

    /* JADX INFO: renamed from: k */
    private String f24417k;

    /* JADX INFO: renamed from: m */
    private final String f24418m;

    /* JADX INFO: renamed from: o */
    private final LinkedHashSet<o.eq.b> f24419o = new LinkedHashSet<>();

    /* JADX INFO: renamed from: p */
    private boolean f24420p;

    /* JADX INFO: renamed from: q */
    private String f24421q;

    /* JADX INFO: renamed from: r */
    private byte[] f24422r;

    /* JADX INFO: renamed from: s */
    private byte[] f24423s;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r9, int r10, int r11) {
        /*
            byte[] r8 = o.ep.a.$$c
            int r0 = r10 + 4
            int r7 = r11 * 3
            int r1 = r7 + 1
            int r6 = 121 - r9
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r8 != 0) goto L26
            r1 = r0
            r3 = r4
        L11:
            int r6 = r6 + r0
            r0 = r1
            r2 = r3
        L14:
            int r1 = r0 + 1
            byte r0 = (byte) r6
            r5[r2] = r0
            int r3 = r2 + 1
            if (r2 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            r0 = r8[r1]
            goto L11
        L26:
            r2 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.a.$$g(short, int, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        D = -1719388413;
        B = 1747863166;
        init$0();
        f24408l = 205508138;
        f24409n = 100858832;
        f24403f = -884032481;
        f24405h = -1973640245;
        f24406i = 1031809487;
        f24407j = -1030794841;
        f24404g = -1943351830;
        f24401d = 2142640834;
        f24400c = 822152608;
        f24399b = 1387405579;
        f24402e = 1608260191;
        f24398a = 1116513410;
        f24416z = 0;
        A = 1;
        f24415y = 0;
        C = 1;
        s();
        ExpandableListView.getPackedPositionType(0L);
        int i2 = f24416z + 111;
        A = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(String str) {
        this.f24418m = str;
    }

    private static void E(byte b2, byte b3, short s2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 100 - b2;
        int i3 = b3 + 4;
        int i4 = s2 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += i4;
        }
        while (true) {
            i5++;
            i3++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 += bArr[i3];
        }
    }

    private static void F(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f24410t;
        long j2 = 0;
        int i5 = 989264422;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a((-16776541) - Color.rgb(0, 0, 0), (char) ExpandableListView.getPackedPositionGroup(j2), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12, -328001469, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    j2 = 0;
                    i5 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f24410t;
        if (iArr6 != null) {
            int i8 = $11 + 41;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i3])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i6;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(Color.rgb(i6, i6, i6) + 16777891, (char) (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, -328001469, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i3++;
                i6 = 0;
            }
            int i9 = $10 + 1;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            iArr6 = iArr2;
            i6 = 0;
        }
        System.arraycopy(iArr6, i6, iArr5, i6, length3);
        lVar.f19941d = i6;
        while (lVar.f19941d < iArr.length) {
            cArr[i6] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                lVar.f19942e ^= iArr5[i11];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 301;
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 52697);
                    int iMakeMeasureSpec = 11 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b6 = (byte) ($$c[0] - 1);
                    byte b7 = (byte) (b6 - 3);
                    objA3 = o.d.d.a(minimumFlingVelocity, maxKeyCode, iMakeMeasureSpec, -1416256172, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i11++;
            }
            int i13 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i13;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i14 = lVar.f19942e;
            int i15 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 229;
                char c2 = (char) (51005 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int defaultSize = View.getDefaultSize(0, 0) + 9;
                byte length4 = (byte) $$c.length;
                byte b8 = (byte) (length4 - 5);
                objA4 = o.d.d.a(capsMode, c2, defaultSize, -330018025, false, $$g(length4, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i6 = 0;
        }
        String str = new String(cArr2, 0, i2);
        int i16 = $10 + 41;
        $11 = i16 % 128;
        if (i16 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    private static void G(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        char c2 = 2;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $11 + 57;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                char c3 = cArr3[1];
                char c4 = cArr3[0];
                int i8 = (c4 + i6) ^ ((c4 << 4) + ((char) (((long) f24412v) ^ (-7511683281764982996L))));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f24413w);
                    objArr2[c2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        objA = o.d.d.a(270 - View.MeasureSpec.getMode(0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, -1995022631, false, $$g((byte) 52, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f24414x) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f24411u)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) (-1);
                        objA2 = o.d.d.a(269 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1995022631, false, $$g((byte) 52, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c2 = 2;
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
                byte b4 = (byte) (-1);
                objA3 = o.d.d.a(TextUtils.indexOf("", "") + 270, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - TextUtils.getCapsMode("", 0, 0), -2074123590, false, $$g((byte) ((-1) - (((-1) - $$f) | ((-1) - 191))), b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i10 = $11 + 19;
            $10 = i10 % 128;
            c2 = 2;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void H(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r0 = r7 * 3
            int r7 = r0 + 101
            int r0 = r6 * 4
            int r6 = 4 - r0
            byte[] r5 = o.ep.a.$$d
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L30
            r1 = r6
            r0 = r8
            r2 = r3
        L16:
            int r6 = r6 + r0
            int r0 = r1 + 1
            r1 = r2
            r7 = r6
            r6 = r0
        L1c:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r8) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r9[r3] = r0
            return
        L2b:
            r0 = r5[r6]
            r1 = r6
            r6 = r7
            goto L16
        L30:
            r1 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.a.H(int, int, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24415y;
        int i4 = i3 + 55;
        C = i4 % 128;
        int i5 = i4 % 2;
        String str = aVar.f24421q;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 49;
        C = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        a aVar = (a) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f24415y + 3;
        C = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            F(new int[]{-220952766, -30359567, -455042538, -1804207343, -843081472, 1421732421, -912442193, -148176403, 1340078734, 2073409341, 1651722853, -1914072054}, 24 - View.resolveSizeAndState(0, 0, 0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            G("퉒ᎂḇꟙ魋Ƙ⯶ⲛ\uef31\uf3ea᪷셬椱偝\ue53a幞杪Ḱ\ueae5㞋⽗盼摬樠廼襻\udf75煏\uf359㺻㾵蟋碴ọ댐\ue439쒀⠏\ueadc悀廼襻พ\ufdef\ue53a幞杪Ḱ\ueae5㞋⽗盼摬樠碴ọ댐\ue439쒀⠏\ueadc悀", Color.argb(0, 0, 0, 0) + 62, objArr3);
            o.ea.f.c(strIntern, String.format(((String) objArr3[0]).intern(), aVar.f24417k, str));
            int i4 = f24415y + 73;
            C = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 5;
            }
        }
        if (str == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr4 = new Object[1];
            F(new int[]{513212065, 1534111404, 1964917694, -2042226207, -517707911, 797406514, -580905035, -12384501}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, objArr4);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr4[0]).intern());
        }
        o.eq.b bVarE = aVar.e(str);
        if (bVarE == null) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Unknown;
            Object[] objArr5 = new Object[1];
            F(new int[]{513212065, 1534111404, 1964917694, -2042226207, -517707911, 797406514, -580905035, -12384501}, Gravity.getAbsoluteGravity(0, 0) + 14, objArr5);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr5[0]).intern());
        }
        Object[] objArr6 = {bVarE};
        int priority = Thread.currentThread().getPriority();
        int i6 = (int) Runtime.getRuntime().totalMemory();
        int i7 = 579433029 * o.eq.b.f24696b;
        o.eq.b.f24696b = i7;
        if (((o.eq.d) o.eq.b.e(i7, Thread.currentThread().getPriority(), i6, -578669383, priority, 578669383, objArr6)) != o.eq.d.f24730a) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.WrongState;
            Object[] objArr7 = new Object[1];
            F(new int[]{513212065, 1534111404, 1964917694, -2042226207, -517707911, 797406514, -580905035, -12384501}, (-16777202) - Color.rgb(0, 0, 0), objArr7);
            throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr7[0]).intern());
        }
        o.en.b bVarC = o.en.b.c();
        if (bVarC.s()) {
            int i8 = o.en.b.f24090e * (-1580596594);
            o.en.b.f24090e = i8;
            int i9 = o.en.b.f24087b * (-2071415875);
            o.en.b.f24087b = i9;
            ((o.fr.e) o.en.b.a(342371170, i8, new Object[]{bVarC}, i9, -342371167, Process.myUid(), new Random().nextInt(460146032))).a().d(aVar.f24418m, aVar.f24417k, str);
            return null;
        }
        WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.WrongState;
        Object[] objArr8 = new Object[1];
        F(new int[]{620841945, -1126564268, 1714736805, -250511249}, View.resolveSize(0, 0) + 6, objArr8);
        String strIntern2 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        G("诡峬끎Ꮫ\uef28乥碴ọ跚㦽茟Ȝ\uf2fe䨾䄏㉆鏋\ue405\uef82⌤쿕ꏠ撎饓摬樠\udc97씜\u0eea賯竖Ⅵ۸뿪뾦鍾體ꮌ\udf6d疜\uea1f㔠", View.MeasureSpec.getMode(0) + 42, objArr9);
        throw new WalletValidationException(walletValidationErrorCode4, strIntern2, ((String) objArr9[0]).intern());
    }

    public static /* synthetic */ int c(o.et.c cVar, o.et.c cVar2) {
        int i2 = 2 % 2;
        int i3 = C + 95;
        f24415y = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cVar};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = o.et.c.f25345n * 655284246;
        o.et.c.f25345n = i5;
        int i6 = o.et.c.f25344m * 705755884;
        o.et.c.f25344m = i6;
        int i7 = o.et.c.f25346o * (-100553870);
        o.et.c.f25346o = i7;
        short sShortValue = ((Short) o.et.c.d(1163887627, objArr, elapsedCpuTime, -1163887626, i5, i6, i7)).shortValue();
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        int i8 = o.et.c.f25345n * 655284246;
        o.et.c.f25345n = i8;
        int i9 = o.et.c.f25344m * 705755884;
        o.et.c.f25344m = i9;
        int i10 = o.et.c.f25346o * (-100553870);
        o.et.c.f25346o = i10;
        int iShortValue = sShortValue - ((Short) o.et.c.d(1163887627, new Object[]{cVar2}, elapsedCpuTime2, -1163887626, i8, i9, i10)).shortValue();
        if (iShortValue != 0) {
            return iShortValue;
        }
        int i11 = C + 75;
        f24415y = i11 % 128;
        int i12 = i11 % 2;
        return 1;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Object obj;
        a aVar = (a) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = C + 65;
        f24415y = i3 % 128;
        int i4 = i3 % 2;
        Iterator<o.eq.b> it = aVar.f24419o.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                int i5 = f24415y + 83;
                C = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
        } while (!it.next().k().equals(str));
        int i6 = C + 17;
        f24415y = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    private boolean c(o.eq.d dVar) {
        int i2 = 2 % 2;
        Iterator<o.eq.b> it = this.f24419o.iterator();
        int i3 = C + 77;
        while (true) {
            f24415y = i3 % 128;
            int i4 = i3 % 2;
            if (!it.hasNext()) {
                return false;
            }
            Object[] objArr = {it.next()};
            int priority = Thread.currentThread().getPriority();
            int i5 = (int) Runtime.getRuntime().totalMemory();
            int i6 = 579433029 * o.eq.b.f24696b;
            o.eq.b.f24696b = i6;
            if (((o.eq.d) o.eq.b.e(i6, Thread.currentThread().getPriority(), i5, -578669383, priority, 578669383, objArr)) == dVar) {
                return true;
            }
            i3 = C + 71;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x001f, code lost:
    
        if (r2.s() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0021, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002a, code lost:
    
        if (r2.s() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002d, code lost:
    
        r7 = o.en.b.f24090e * (-1580596594);
        o.en.b.f24090e = r7;
        r9 = o.en.b.f24087b * (-2071415875);
        o.en.b.f24087b = r9;
        r2 = ((o.fr.e) o.en.b.a(342371170, r7, new java.lang.Object[]{r2}, r9, -342371167, android.os.Process.myUid(), new java.util.Random().nextInt(460146032))).a().a(r3.f24418m, r3.f24417k);
        r0 = r3.b().keySet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r2 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r0.contains(r2) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        r1 = o.ep.a.C + 123;
        o.ep.a.f24415y = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if ((r1 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object d(java.lang.Object[] r12) {
        /*
            r6 = 0
            r3 = r12[r6]
            o.ep.a r3 = (o.ep.a) r3
            r5 = 2
            int r0 = r5 % r5
            int r0 = o.ep.a.C
            int r1 = r0 + 63
            int r0 = r1 % 128
            o.ep.a.f24415y = r0
            int r1 = r1 % r5
            r4 = 0
            if (r1 == 0) goto L22
            o.en.b r2 = o.en.b.c()
            boolean r1 = r2.s()
            r0 = 41
            int r0 = r0 / r6
            if (r1 != 0) goto L2d
        L21:
            return r4
        L22:
            o.en.b r2 = o.en.b.c()
            boolean r0 = r2.s()
            if (r0 != 0) goto L2d
            goto L21
        L2d:
            java.lang.Object[] r8 = new java.lang.Object[]{r2}
            int r7 = o.en.b.f24090e
            r0 = -1580596594(0xffffffffa1ca028e, float:-1.3688729E-18)
            int r7 = r7 * r0
            o.en.b.f24090e = r7
            int r9 = o.en.b.f24087b
            r0 = -2071415875(0xffffffff8488b3bd, float:-3.213851E-36)
            int r9 = r9 * r0
            o.en.b.f24087b = r9
            int r11 = android.os.Process.myUid()
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r0 = 460146032(0x1b6d4570, float:1.9626617E-22)
            int r12 = r1.nextInt(r0)
            r6 = 342371170(0x14682b62, float:1.17215625E-26)
            r10 = -342371167(0xffffffffeb97d4a1, float:-3.6710382E26)
            java.lang.Object r0 = o.en.b.a(r6, r7, r8, r9, r10, r11, r12)
            o.fr.e r0 = (o.fr.e) r0
            o.fr.c r2 = r0.a()
            java.lang.String r1 = r3.f24418m
            java.lang.String r0 = r3.f24417k
            java.lang.String r2 = r2.a(r1, r0)
            java.util.Map r0 = r3.b()
            java.util.Set r0 = r0.keySet()
            if (r2 == 0) goto L89
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L89
            int r0 = o.ep.a.C
            int r1 = r0 + 123
            int r0 = r1 % 128
            o.ep.a.f24415y = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L85
            return r2
        L85:
            r4.hashCode()
            throw r4
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.a.d(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object e(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (-1) - (((-1) - (~i2)) & ((-1) - i4));
        int i9 = ~((i8 + i5) - (i8 & i5));
        int i10 = ~((-1) - (((-1) - (~i4)) & ((-1) - i2)));
        int i11 = ~i5;
        int i12 = i10 | (~(i11 | i2));
        int i13 = ~((-1) - (((-1) - i11) & ((-1) - i4)));
        int i14 = i2 + i4 + i7 + ((-1568348280) * i6) + (1617068012 * i3);
        int i15 = i14 * i14;
        int i16 = (((-430874860) * i2) - 739508224) + (1544986862 * i4) + (i9 * 987930861) + ((-987930861) * i12) + (987930861 * i13) + (557056000 * i7) + ((-1885339648) * i6) + (1743781888 * i3) + (858456064 * i15);
        int i17 = (i2 * (-973781596)) + 539565670 + (i4 * (-973779706)) + (i9 * 945) + (i12 * (-945)) + (i13 * 945) + (i7 * (-973780651)) + (i6 * 424585256) + (i3 * 537576796) + (i15 * 1078394880);
        int i18 = i16 + (i17 * i17 * 192741376);
        if (i18 == 1) {
            return a(objArr);
        }
        if (i18 == 2) {
            return d(objArr);
        }
        if (i18 == 3) {
            return b(objArr);
        }
        if (i18 == 4) {
            return e(objArr);
        }
        if (i18 != 5) {
            return c(objArr);
        }
        a aVar = (a) objArr[0];
        String str = (String) objArr[1];
        int i19 = 2 % 2;
        int i20 = C;
        int i21 = i20 + 123;
        f24415y = i21 % 128;
        int i22 = i21 % 2;
        aVar.f24417k = str;
        int i23 = i20 + 27;
        f24415y = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24415y + 57;
        C = i3 % 128;
        int i4 = i3 % 2;
        for (d dVar : o.en.b.c().g().values()) {
            int i5 = C + 79;
            f24415y = i5 % 128;
            int i6 = i5 % 2;
            if (dVar.h(aVar.h())) {
                return dVar.b();
            }
        }
        int i7 = C + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f24415y = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
        $$b = 25;
    }

    static void init$1() {
        $$d = new byte[]{68, -108, -67, 58};
        $$e = 4;
    }

    static void init$2() {
        $$c = new byte[]{3, 32, 122, 114};
        $$f = 113;
    }

    static void s() {
        f24410t = new int[]{-637723641, -934437059, -964974560, 458300044, 1617095431, -1849655341, -1168326728, -1569806185, 1086231513, -1500872573, 637474743, -1802348216, 1377959940, 786069158, -1579485347, -1736300847, -2099151611, 1673853164};
        f24414x = (char) 48118;
        f24411u = (char) 30790;
        f24412v = (char) 58756;
        f24413w = (char) 24651;
    }

    public final List<o.eq.b> a() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(this.f24419o);
        int i3 = C + 71;
        f24415y = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    public final void a(String str) {
        int iMyPid = Process.myPid();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f24409n * (-160947621);
        f24409n = i2;
        int i3 = f24408l * 2025584838;
        f24408l = i3;
        e(-1118833945, new Object[]{this, str}, i3, 1118833950, iMyPid, i2, iElapsedRealtime);
    }

    public final Map<String, EmvApplication> b() {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        Iterator<o.eq.b> it = this.f24419o.iterator();
        while (it.hasNext()) {
            int i3 = C + 31;
            f24415y = i3 % 128;
            if (i3 % 2 != 0) {
                o.eq.b next = it.next();
                map.put(next.k(), next.e());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            o.eq.b next2 = it.next();
            map.put(next2.k(), next2.e());
            int i4 = C + 7;
            f24415y = i4 % 128;
            int i5 = i4 % 2;
        }
        return map;
    }

    public final o.eq.b b(String str) {
        int i2 = 2 % 2;
        for (o.eq.b bVar : this.f24419o) {
            if (bVar.k().equals(str)) {
                int i3 = C + 101;
                int i4 = i3 % 128;
                f24415y = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 25;
                C = i6 % 128;
                int i7 = i6 % 2;
                return bVar;
            }
            int i8 = f24415y + 45;
            C = i8 % 128;
            int i9 = i8 % 2;
        }
        return null;
    }

    public final void b(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = C + 115;
        int i4 = i3 % 128;
        f24415y = i4;
        int i5 = i3 % 2;
        this.f24423s = bArr;
        int i6 = i4 + 97;
        C = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean b(o.eq.b bVar) {
        int i2 = 2 % 2;
        if (bVar == null) {
            int i3 = C + 99;
            f24415y = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        Iterator<o.eq.b> it = this.f24419o.iterator();
        while (it.hasNext()) {
            if (it.next().k().equals(bVar.k())) {
                return false;
            }
            int i5 = f24415y + 63;
            C = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f24419o.add(bVar);
        return true;
    }

    public final List<o.et.c> c() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (o.eq.b bVar : this.f24419o) {
            if (bVar instanceof o.et.c) {
                int i3 = C + 111;
                f24415y = i3 % 128;
                if (i3 % 2 != 0) {
                    arrayList.add((o.et.c) bVar);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                arrayList.add((o.et.c) bVar);
            }
            int i4 = f24415y + 115;
            C = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: o.ep.a$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return a.c((o.et.c) obj2, (o.et.c) obj3);
            }
        });
        return arrayList;
    }

    public final void c(String str) {
        int i2 = 2 % 2;
        int i3 = C + 21;
        f24415y = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24421q = str;
            return;
        }
        this.f24421q = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f24415y + 63;
        C = i3 % 128;
        if (i3 % 2 != 0) {
            this.f24420p = z2;
        } else {
            this.f24420p = z2;
            int i4 = 57 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0019, code lost:
    
        r1 = o.ep.a.f24415y + 89;
        o.ep.a.C = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0024, code lost:
    
        r2 = r2.e();
        r1 = o.ep.a.f24415y + 121;
        o.ep.a.C = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
    
        if ((r1 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
    
        r0 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0041, code lost:
    
        r0 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0048, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.card.emvapplication.EmvApplication d(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.ep.a.C
            int r1 = r0 + 107
            int r0 = r1 % 128
            o.ep.a.f24415y = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 == 0) goto L3a
            o.eq.b r2 = r5.b(r6)
            r0 = 44
            int r0 = r0 / 0
            if (r2 == 0) goto L48
        L19:
            int r0 = o.ep.a.f24415y
            int r1 = r0 + 89
            int r0 = r1 % 128
            o.ep.a.C = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L41
            java.lang.Object r2 = r2.e()
            fr.antelop.sdk.card.emvapplication.EmvApplication r2 = (fr.antelop.sdk.card.emvapplication.EmvApplication) r2
            int r0 = o.ep.a.f24415y
            int r1 = r0 + 121
            int r0 = r1 % 128
            o.ep.a.C = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L39
            r0 = 81
            int r0 = r0 / 0
        L39:
            return r2
        L3a:
            o.eq.b r2 = r5.b(r6)
            if (r2 == 0) goto L48
            goto L19
        L41:
            java.lang.Object r0 = r2.e()
            fr.antelop.sdk.card.emvapplication.EmvApplication r0 = (fr.antelop.sdk.card.emvapplication.EmvApplication) r0
            throw r3
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.a.d(java.lang.String):fr.antelop.sdk.card.emvapplication.EmvApplication");
    }

    public final a d(o.eq.d dVar) {
        int i2 = 2 % 2;
        a aVar = new a(this.f24418m);
        aVar.f24417k = this.f24417k;
        aVar.f24421q = this.f24421q;
        aVar.f24420p = this.f24420p;
        byte[] bArr = this.f24423s;
        if (bArr != null) {
            aVar.f24423s = Arrays.copyOf(bArr, bArr.length);
        }
        byte[] bArr2 = this.f24422r;
        if (bArr2 != null) {
            int i3 = C + 61;
            f24415y = i3 % 128;
            int i4 = i3 % 2;
            aVar.f24422r = Arrays.copyOf(bArr2, bArr2.length);
        }
        Iterator<o.eq.b> it = this.f24419o.iterator();
        while (it.hasNext()) {
            int i5 = f24415y + 23;
            C = i5 % 128;
            if (i5 % 2 == 0) {
                aVar.f24419o.add(it.next().b(dVar));
                int i6 = 5 / 0;
            } else {
                aVar.f24419o.add(it.next().b(dVar));
            }
            int i7 = C + 65;
            f24415y = i7 % 128;
            int i8 = i7 % 2;
        }
        return aVar;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 103;
        f24415y = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f24420p;
        int i5 = i3 + 125;
        f24415y = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return z2;
    }

    public final o.eq.b e(String str) {
        int i2 = 2 % 2;
        int i3 = f24415y + 35;
        C = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f24419o.iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<o.eq.b> it = this.f24419o.iterator();
        while (!(!it.hasNext())) {
            o.eq.b next = it.next();
            if (next.k().equals(str)) {
                return next;
            }
            int i4 = f24415y + 43;
            C = i4 % 128;
            int i5 = i4 % 2;
        }
        return null;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = C + 47;
        f24415y = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = c(o.eq.d.f24730a);
        int i5 = f24415y + 115;
        C = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    final o.eq.d f() {
        int i2 = 2 % 2;
        Iterator<o.eq.b> it = this.f24419o.iterator();
        o.eq.d dVarC = null;
        while (it.hasNext()) {
            int i3 = C + 57;
            f24415y = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = {it.next()};
                int priority = Thread.currentThread().getPriority();
                int i4 = (int) Runtime.getRuntime().totalMemory();
                int i5 = o.eq.b.f24696b * 579433029;
                o.eq.b.f24696b = i5;
                dVarC = o.eq.d.c(dVarC, (o.eq.d) o.eq.b.e(i5, Thread.currentThread().getPriority(), i4, -578669383, priority, 578669383, objArr));
                int i6 = 61 / 0;
            } else {
                Object[] objArr2 = {it.next()};
                int priority2 = Thread.currentThread().getPriority();
                int i7 = (int) Runtime.getRuntime().totalMemory();
                int i8 = o.eq.b.f24696b * 579433029;
                o.eq.b.f24696b = i8;
                dVarC = o.eq.d.c(dVarC, (o.eq.d) o.eq.b.e(i8, Thread.currentThread().getPriority(), i7, -578669383, priority2, 578669383, objArr2));
            }
        }
        int i9 = C + 97;
        f24415y = i9 % 128;
        if (i9 % 2 == 0) {
            return dVarC;
        }
        throw null;
    }

    public final String g() {
        int i2 = f24399b * (-193681782);
        f24399b = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = (-1292223516) * f24400c;
        f24400c = i3;
        return (String) e(-579306999, new Object[]{this}, i3, 579307000, i2, elapsedCpuTime, iElapsedRealtime);
    }

    public final void g(String str) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = C + 63;
            f24415y = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            F(new int[]{-220952766, -30359567, -455042538, -1804207343, -843081472, 1421732421, -912442193, -148176403, 1340078734, 2073409341, 1651722853, -1914072054}, 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            G("퉒ᎂ遢옉\udc84\ue926埙람挠챱啕稥賧⚻⽗盼摬樠᪷셬椱偝\ue53a幞杪Ḱ\ueae5㞋⽗盼摬樠廼襻\udf75煏\uf359㺻㾵蟋碴ọ댐\ue439쒀⠏\ueadc悀廼襻พ\ufdef\ue53a幞杪Ḱ\ueae5㞋⽗盼摬樠碴ọ댐\ue439쒀⠏\ueadc悀", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 69, objArr2);
            o.ea.f.c(strIntern, String.format(((String) objArr2[0]).intern(), this.f24417k, str));
            int i5 = C + 37;
            f24415y = i5 % 128;
            int i6 = i5 % 2;
        }
        if (str == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            F(new int[]{513212065, 1534111404, 1964917694, -2042226207, -517707911, 797406514, -580905035, -12384501}, View.combineMeasuredStates(0, 0) + 14, objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        o.eq.b bVarE = e(str);
        if (bVarE == null) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Unknown;
            Object[] objArr4 = new Object[1];
            F(new int[]{513212065, 1534111404, 1964917694, -2042226207, -517707911, 797406514, -580905035, -12384501}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, objArr4);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr4[0]).intern());
        }
        Object[] objArr5 = {bVarE};
        int priority = Thread.currentThread().getPriority();
        int i7 = (int) Runtime.getRuntime().totalMemory();
        int i8 = 579433029 * o.eq.b.f24696b;
        o.eq.b.f24696b = i8;
        if (((o.eq.d) o.eq.b.e(i8, Thread.currentThread().getPriority(), i7, -578669383, priority, 578669383, objArr5)) != o.eq.d.f24730a) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.WrongState;
            Object[] objArr6 = new Object[1];
            F(new int[]{513212065, 1534111404, 1964917694, -2042226207, -517707911, 797406514, -580905035, -12384501}, 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr6);
            throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr6[0]).intern());
        }
        o.en.b bVarC = o.en.b.c();
        if (bVarC.s()) {
            int i9 = o.en.b.f24090e * (-1580596594);
            o.en.b.f24090e = i9;
            int i10 = o.en.b.f24087b * (-2071415875);
            o.en.b.f24087b = i10;
            ((o.fr.e) o.en.b.a(342371170, i9, new Object[]{bVarC}, i10, -342371167, Process.myUid(), new Random().nextInt(460146032))).a().e(this.f24418m, this.f24417k, str);
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.WrongState;
        Object[] objArr7 = new Object[1];
        F(new int[]{620841945, -1126564268, 1714736805, -250511249}, 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr7);
        String strIntern2 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        G("诡峬끎Ꮫ\uef28乥碴ọ跚㦽茟Ȝ\uf2fe䨾䄏㉆鏋\ue405\uef82⌤쿕ꏠ撎饓摬樠\udc97씜\u0eea賯竖Ⅵ۸뿪뾦鍾體ꮌ\udf6d疜\uea1f㔠", View.resolveSize(0, 0) + 42, objArr8);
        throw new WalletValidationException(walletValidationErrorCode4, strIntern2, ((String) objArr8[0]).intern());
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = C + 29;
        f24415y = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f24417k;
        if (i4 != 0) {
            int i5 = 48 / 0;
        }
        return str;
    }

    public final void h(String str) throws WalletValidationException {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int priority = Thread.currentThread().getPriority();
        int i2 = f24407j * (-1188078458);
        f24407j = i2;
        e(2078061910, new Object[]{this, str}, Process.myPid(), -2078061907, iUptimeMillis, i2, priority);
    }

    public final int i() {
        int size;
        int i2 = 2 % 2;
        int i3 = C + 105;
        f24415y = i3 % 128;
        if (i3 % 2 != 0) {
            size = this.f24419o.size();
            int i4 = 61 / 0;
        } else {
            size = this.f24419o.size();
        }
        int i5 = C + 65;
        f24415y = i5 % 128;
        int i6 = i5 % 2;
        return size;
    }

    @Override // java.lang.Iterable
    public final Iterator<o.eq.b> iterator() {
        int i2 = 2 % 2;
        int i3 = f24415y + 109;
        C = i3 % 128;
        int i4 = i3 % 2;
        Iterator<o.eq.b> it = this.f24419o.iterator();
        int i5 = f24415y + 103;
        C = i5 % 128;
        int i6 = i5 % 2;
        return it;
    }

    final int j() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24415y + 111;
        C = i3 % 128;
        int i4 = i3 % 2;
        int i5 = C + 109;
        f24415y = i5 % 128;
        int i6 = i5 % 2;
        short s2 = -1;
        for (o.eq.b bVar : this.f24419o) {
            if (bVar instanceof o.et.c) {
                short sZ = ((o.et.c) bVar).z();
                if (s2 != -1) {
                    int i7 = f24415y + 125;
                    C = i7 % 128;
                    int i8 = i7 % 2;
                    if (sZ < s2) {
                    }
                }
                s2 = sZ;
            }
        }
        return Math.max(0, (int) s2);
    }

    public final boolean j(String str) {
        int iActiveCount = Thread.activeCount();
        int i2 = f24398a * (-579709169);
        f24398a = i2;
        int i3 = f24402e * (-1921349572);
        f24402e = i3;
        return ((Boolean) e(1475540925, new Object[]{this, str}, (int) SystemClock.uptimeMillis(), -1475540925, iActiveCount, i3, i2)).booleanValue();
    }

    public final void k() throws Throwable {
        int i2 = 2 % 2;
        int i3 = C + 115;
        f24415y = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            F(new int[]{-220952766, -30359567, -455042538, -1804207343, -843081472, 1421732421, -912442193, -148176403, 1340078734, 2073409341, 1651722853, -1914072054}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            G("뾦鍾퉒ᎂḇꟙ魋Ƙ⯶ⲛ\uef31\uf3ea᪷셬椱偝\ue53a幞杪Ḱ\ueae5㞋⽗盼摬樠廼襻\udf75煏\uf359㺻㾵蟋碴ọ댐\ue439쒀⠏", 40 - TextUtils.getTrimmedLength(""), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(this.f24417k).toString());
        }
        o.en.b bVarC = o.en.b.c();
        if (!bVarC.s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            F(new int[]{620841945, -1126564268, 1714736805, -250511249}, 6 - Color.red(0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            G("诡峬끎Ꮫ\uef28乥碴ọ跚㦽茟Ȝ\uf2fe䨾䄏㉆鏋\ue405\uef82⌤쿕ꏠ撎饓摬樠\udc97씜\u0eea賯竖Ⅵ۸뿪뾦鍾體ꮌ\udf6d疜\uea1f㔠", 42 - View.combineMeasuredStates(0, 0), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
        }
        int i5 = o.en.b.f24090e * (-1580596594);
        o.en.b.f24090e = i5;
        int i6 = o.en.b.f24087b * (-2071415875);
        o.en.b.f24087b = i6;
        ((o.fr.e) o.en.b.a(342371170, i5, new Object[]{bVarC}, i6, -342371167, Process.myUid(), new Random().nextInt(460146032))).a().e(this.f24418m, this.f24417k);
        int i7 = f24415y + 7;
        C = i7 % 128;
        int i8 = i7 % 2;
    }

    public final String l() {
        int i2 = f24406i * 404510432;
        f24406i = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = f24405h * 1014692146;
        f24405h = i3;
        int i4 = 285257847 * f24403f;
        f24403f = i4;
        return (String) e(-575235144, new Object[]{this}, i4, 575235148, i2, i3, iElapsedRealtime);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.a.m():java.lang.String");
    }

    public final String n() {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iActiveCount = Thread.activeCount();
        int i3 = f24401d * 708244067;
        f24401d = i3;
        int i4 = 300999422 * f24404g;
        f24404g = i4;
        return (String) e(1872929260, new Object[]{this}, i4, -1872929258, i2, i3, iActiveCount);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.a.o():void");
    }
}
