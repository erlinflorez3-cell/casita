package o.v;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import fr.antelop.sdk.cardeventlistener.CardEventListener;
import fr.antelop.sdk.cardeventlistener.DefaultCardEventListener;
import java.lang.reflect.Method;
import o.a.h;
import o.d.d;
import o.ea.f;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26842a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f26843b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26844c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26845d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26846e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f26847f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f26848i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f26849j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f26850k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26851l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26852m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f26853n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f26854o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f26855p = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f26856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CardEventListener f26857h = c();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r8, int r9, int r10) {
        /*
            byte[] r7 = o.v.b.$$c
            int r0 = r8 * 4
            int r6 = 1 - r0
            int r5 = 111 - r10
            int r0 = r9 * 2
            int r4 = 3 - r0
            byte[] r3 = new byte[r6]
            r2 = 0
            if (r7 != 0) goto L27
            r0 = r5
            r1 = r2
            r5 = r6
        L14:
            int r5 = r5 + r0
        L15:
            int r4 = r4 + 1
            byte r0 = (byte) r5
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L24:
            r0 = r7[r4]
            goto L14
        L27:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v.b.$$g(int, int, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f26855p = 420906388;
        init$0();
        f26847f = 912236333;
        f26848i = 1548435178;
        f26845d = 1633058415;
        f26842a = -1946870804;
        f26843b = -1806955722;
        f26846e = -1815605791;
        f26844c = -885973490;
        f26853n = 0;
        f26852m = 1;
        f26850k = 0;
        f26851l = 1;
        a();
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.getOffsetAfter("", 0);
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getLongPressTimeout();
        int i2 = f26853n + 111;
        f26852m = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
    }

    b(Context context) {
        this.f26856g = context;
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i7;
        int i9 = ~((-1) - (((-1) - i8) & ((-1) - i2)));
        int i10 = ~((-1) - (((-1) - i3) & ((-1) - i7)));
        int i11 = (i10 + i9) - (i10 & i9);
        int i12 = ~i3;
        int i13 = (-1) - (((-1) - (~((-1) - (((-1) - i7) & ((-1) - (~i2)))))) & ((-1) - (~((i12 + i8) - (i12 & i8)))));
        int i14 = (i13 + i9) - (i13 & i9);
        int i15 = (-1) - (((-1) - i8) & ((-1) - ((i3 + i2) - (i3 & i2))));
        int i16 = i3 + i2 + i4 + (1050315579 * i5) + (2086215248 * i6);
        int i17 = i16 * i16;
        int i18 = (i3 * (-1156115713)) + 1671168000 + ((-1156115713) * i2) + ((-1856302338) * i11) + (i14 * 1856302338) + (1856302338 * i15) + (700186624 * i4) + ((-1303117824) * i5) + (314572800 * i6) + (431423488 * i17);
        int i19 = ((i3 * (-961373039)) - 1316831794) + (i2 * (-961373039)) + (i11 * (-990)) + (i14 * 990) + (i15 * 990) + (i4 * (-961372049)) + (i5 * 755842709) + (i6 * (-1858722640)) + (i17 * (-2040987648));
        int i20 = i18 + (i19 * i19 * 1361641472);
        if (i20 == 1) {
            return e(objArr);
        }
        if (i20 == 2) {
            return b(objArr);
        }
        b bVar = (b) objArr[0];
        int i21 = 2 % 2;
        int i22 = f26851l + 9;
        f26850k = i22 % 128;
        int i23 = i22 % 2;
        String string = super.toString();
        int i24 = f26850k + 57;
        f26851l = i24 % 128;
        int i25 = i24 % 2;
        return string;
    }

    static void a() {
        f26849j = new char[]{51644, 64582, 64599, 64583, 64617, 64584, 64585, 64631, 64621, 64590, 64586, 64592, 64588, 64630, 64612, 64614, 64578, 51643, 64597, 64523, 64587, 64598, 64593, 64625, 51646, 64604, 64591, 51645, 64620, 64577, 64589, 64595, 64576, 64580, 64608, 64579};
        f26854o = (char) 51641;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        b bVar = (b) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        int i3 = f26850k + 11;
        f26851l = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            bVar.e().onCardTermsAndConditionsApprovalRequired(bVar.f26856g, str, str2);
            return null;
        }
        bVar.e().onCardTermsAndConditionsApprovalRequired(bVar.f26856g, str, str2);
        obj.hashCode();
        throw null;
    }

    private CardEventListener c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26850k + 107;
        f26851l = i3 % 128;
        int i4 = i3 % 2;
        try {
            Context context = this.f26856g;
            Object[] objArr = new Object[1];
            q(29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), " \u0005\u0015\u001f\u0015\u0017\u001e\b\u0006\u0016\u0015\r \u0003\u001c# !\u0015\u0017\u0000\u0010\u0016\u0017\u0002\u001a\u0002\b", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 21), objArr);
            String strD = m.d(context, ((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            q((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, " \u0005\u0015\u001f\u0015\u0017\u001e\b\u0006\u0016\u0015\r \u0003\u001c# !\u0015\u0017\u0000\u0010\u0016\u0017\u0002\u001a\u0002\b", (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 21), objArr2);
            return (CardEventListener) m.d(CardEventListener.class, strD, ((String) objArr2[0]).intern());
        } catch (PackageManager.NameNotFoundException | RuntimeException e2) {
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                q(21 - TextUtils.lastIndexOf("", '0'), "\u001a\u0016\u001a\u0002\u0003\u000e \u0003\u001c# !\u0015\u0017\u0015\u0003㙛㙛\t\u0003\u0003\u0007", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 101), objArr3);
                f.d(((String) objArr3[0]).intern(), e2.getMessage());
                int i5 = f26850k + 125;
                f26851l = i5 % 128;
                int i6 = i5 % 2;
            }
            return new DefaultCardEventListener();
        }
    }

    private CardEventListener e() {
        CardEventListener cardEventListener;
        int i2 = 2 % 2;
        int i3 = f26850k + 9;
        int i4 = i3 % 128;
        f26851l = i4;
        if (i3 % 2 == 0) {
            cardEventListener = this.f26857h;
            int i5 = 33 / 0;
        } else {
            cardEventListener = this.f26857h;
        }
        int i6 = i4 + 21;
        f26850k = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
        return cardEventListener;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        b bVar = (b) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        int i3 = f26850k + 11;
        f26851l = i3 % 128;
        int i4 = i3 % 2;
        bVar.e().onCardActivationRequired(bVar.f26856g, str, str2);
        int i5 = f26851l + 95;
        f26850k = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{7, 42, -92, 85};
        $$b = 0;
    }

    static void init$1() {
        $$d = new byte[]{37, 121, MessagePack.Code.MAP32, 74, 65, -75, 75, MessagePack.Code.FLOAT32, 64, -14};
        $$e = 23;
    }

    static void init$2() {
        $$c = new byte[]{125, 113, 52, MessagePack.Code.FLOAT32};
        $$f = 65;
    }

    private static void q(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f26849j;
        char c2 = '0';
        int i6 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 1;
                $10 = i8 % 128;
                if (i8 % i4 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objA = d.a(421932776);
                        if (objA == null) {
                            int iIndexOf = TextUtils.indexOf("", c2, 0) + 12;
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA = d.a((ViewConfiguration.getScrollBarSize() >> i6) + 270, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), iIndexOf, -811348851, false, $$g(b3, b4, (byte) (9 | b4)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i7--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objA2 = d.a(421932776);
                    if (objA2 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA2 = d.a(270 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -811348851, false, $$g(b5, b6, (byte) (9 | b6)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i4 = 2;
                c2 = '0';
                i6 = 8;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f26854o)};
        Object objA3 = d.a(421932776);
        if (objA3 == null) {
            byte b7 = (byte) 0;
            byte b8 = b7;
            objA3 = d.a(270 - View.getDefaultSize(0, 0), (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, -811348851, false, $$g(b7, b8, (byte) ((-1) - (((-1) - b8) & ((-1) - 9)))), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i9 = $11 + 123;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                i3 = i2 + 11;
                cArr4[i3] = (char) (cArr[i3] + b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                int i10 = $10 + 95;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                    Object objA4 = d.a(219124184);
                    if (objA4 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objA4 = d.a(825 - Gravity.getAbsoluteGravity(0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 10 - TextUtils.lastIndexOf("", '0'), -611683395, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                        Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA5 = d.a(-634864343);
                        if (objA5 == null) {
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            objA5 = d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + JfifUtil.MARKER_SOS, (char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 11, 212688716, false, $$g(b11, b12, (byte) (b12 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                        int i12 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i12];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i13 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i14 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i13];
                        cArr4[hVar.f19926b + 1] = cArr2[i14];
                    } else {
                        int i15 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i16 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i15];
                        cArr4[hVar.f19926b + 1] = cArr2[i16];
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i17 = 0; i17 < i2; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(int r9, byte r10, byte r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.v.b.$$a
            int r0 = r9 * 3
            int r7 = 3 - r0
            int r0 = r11 * 2
            int r6 = 1 - r0
            int r0 = r10 * 3
            int r0 = 101 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2c
            r3 = r7
            r2 = r4
        L15:
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L18:
            byte r0 = (byte) r7
            int r2 = r1 + 1
            r5[r1] = r0
            int r3 = r3 + 1
            if (r2 != r6) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L29:
            r0 = r8[r3]
            goto L15
        L2c:
            r1 = r4
            r3 = r7
            r7 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v.b.r(int, byte, byte, java.lang.Object[]):void");
    }

    private static void s(short s2, byte b2, short s3, Object[] objArr) {
        int i2 = 9 - (b2 * 6);
        byte[] bArr = $$d;
        int i3 = s3 * 6;
        int i4 = 111 - s2;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = i2 + (-i3);
            i2 = i2;
        }
        while (true) {
            int i6 = i2 + 1;
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 += -bArr[i6];
                i2 = i6;
            }
        }
    }

    public final void a(String str, String str2) {
        int i2 = f26843b * (-2099597960);
        f26843b = i2;
        int i3 = f26842a * (-1446248405);
        f26842a = i3;
        a(17633177, -17633176, i3, Process.myTid(), (int) SystemClock.elapsedRealtime(), i2, new Object[]{this, str, str2});
    }

    public final void b(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26850k + 111;
        f26851l = i3 % 128;
        int i4 = i3 % 2;
        e().onCardDeleted(this.f26856g, str, str2);
        int i5 = f26851l + 97;
        f26850k = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void c(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26851l + 95;
        f26850k = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            e().onCardActivating(this.f26856g, str, str2);
            obj.hashCode();
            throw null;
        }
        e().onCardActivating(this.f26856g, str, str2);
        int i4 = f26850k + 85;
        f26851l = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0627  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object clone() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v.b.clone():java.lang.Object");
    }

    public final void d(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26850k + 83;
        f26851l = i3 % 128;
        int i4 = i3 % 2;
        e().onCardLocked(this.f26856g, str, str2);
        int i5 = f26850k + 45;
        f26851l = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void e(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26850k + 39;
        f26851l = i3 % 128;
        int i4 = i3 % 2;
        e().onCardActivated(this.f26856g, str, str2);
        int i5 = f26851l + 77;
        f26850k = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f26851l + 37;
        f26850k = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
        return zEquals;
    }

    public final void f(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26851l + 67;
        f26850k = i3 % 128;
        if (i3 % 2 == 0) {
            e().onCardPaymentKeysRefreshed(this.f26856g, str, str2);
        } else {
            e().onCardPaymentKeysRefreshed(this.f26856g, str, str2);
            throw null;
        }
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26850k + 103;
        f26851l = i3 % 128;
        int i4 = i3 % 2;
        super.finalize();
        int i5 = f26850k + 123;
        f26851l = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void g(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26850k + 15;
        f26851l = i3 % 128;
        int i4 = i3 % 2;
        e().onCardDisplayUpdated(this.f26856g, str, str2);
        int i5 = f26851l + 121;
        f26850k = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void h(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26850k + 1;
        f26851l = i3 % 128;
        if (i3 % 2 != 0) {
            e().onCardPaymentInformationUpdated(this.f26856g, str, str2);
            return;
        }
        e().onCardPaymentInformationUpdated(this.f26856g, str, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f26850k + 29;
        f26851l = i3 % 128;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        int iHashCode = super.hashCode();
        int i4 = f26850k + 77;
        f26851l = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final void i(String str, String str2) {
        int i2 = f26845d * (-432841243);
        f26845d = i2;
        int i3 = f26848i * 525849671;
        f26848i = i3;
        int iMyPid = Process.myPid();
        int i4 = f26847f * (-380703258);
        f26847f = i4;
        a(490872507, -490872505, i3, iMyPid, i4, i2, new Object[]{this, str, str2});
    }

    public final void j(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f26851l + 45;
        f26850k = i3 % 128;
        if (i3 % 2 == 0) {
            e().onCardRedigitized(this.f26856g, str, str2);
        } else {
            e().onCardRedigitized(this.f26856g, str, str2);
            int i4 = 71 / 0;
        }
    }

    public final String toString() {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = f26844c * (-930831054);
        f26844c = i2;
        int iMyTid = Process.myTid();
        int i3 = f26846e * 1427917001;
        f26846e = i3;
        return (String) a(905562648, -905562648, i2, iMyTid, i3, elapsedCpuTime, new Object[]{this});
    }
}
