package o.er;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.digitalcard.VirtualCardNumber;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.eo.e;
import o.ep.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f25174b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25175c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f25176d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f25177e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25178h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25179j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, byte r8, byte r9) {
        /*
            int r0 = r7 * 3
            int r7 = 3 - r0
            int r6 = r9 * 2
            int r0 = r6 + 1
            int r5 = r8 + 102
            byte[] r4 = o.er.u.$$a
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r4 != 0) goto L27
            r0 = r5
            r5 = r6
            r1 = r2
        L14:
            int r5 = r5 + r0
        L15:
            int r7 = r7 + 1
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r6) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r4[r7]
            goto L14
        L27:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.u.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25179j = 0;
        f25178h = 1;
        f25176d = 0;
        f25175c = 1;
        a();
        ViewConfiguration.getMaximumDrawingCacheSize();
        KeyEvent.getMaxKeyCode();
        int i2 = f25178h + 105;
        f25179j = i2 % 128;
        int i3 = i2 % 2;
    }

    public u(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    static void a() {
        f25174b = new char[]{64587, 64586, 64592, 64580, 64617, 64578, 64595, 65469, 64533, 64593, 64598, 64630, 64620, 65470, 64539, 64614, 64589, 64579, 64609, 64597, 64583, 64599, 64576, 64584, 64532, 64517, 64585, 65471, 64582, 64619, 64577, 64520, 64627, 64521, 64581, 64588};
        f25177e = (char) 51641;
    }

    private static void f(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f25174b;
        int i6 = 421932776;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = $10 + 19;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = o.d.d.a(i6);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(271 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), (KeyEvent.getMaxKeyCode() >> 16) + 11, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i6 = 421932776;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f25177e)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = '0';
        char c3 = '\f';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0') + 12, -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    i4 = 2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[c3] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        objA3 = o.d.d.a(TextUtils.indexOf("", "") + 825, (char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", c2, 0, 0) + 12, -611683395, false, $$c(b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 9))), b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            objA4 = o.d.d.a(217 - Process.getGidForName(""), (char) TextUtils.indexOf("", "", 0), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 212688716, false, $$c(b8, (byte) ((-1) - (((-1) - b8) & ((-1) - 7))), b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i10 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i10];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        int i11 = $11 + 3;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
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
                        int i17 = $11 + 103;
                        $10 = i17 % 128;
                        i4 = 2;
                        int i18 = i17 % 2;
                    }
                    i4 = 2;
                }
                hVar.f19926b += i4;
                c2 = '0';
                c3 = '\f';
            }
        }
        for (int i19 = 0; i19 < i2; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
        $$b = 113;
    }

    public final o.y.o b() {
        int i2 = 2 % 2;
        o.y.o oVar = new o.y.o(this.f25010g.g().b(), this.f25009a, this.f25010g.g().c());
        int i3 = f25176d + 17;
        f25175c = i3 % 128;
        if (i3 % 2 != 0) {
            return oVar;
        }
        throw null;
    }

    public final void c(Context context, final OperationCallback<List<VirtualCardNumber>> operationCallback) throws Throwable {
        Object obj;
        Object obj2;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        f(29 - View.resolveSize(0, 0), "\u0012\u0006\u0004\u0012\u0014!!\u0017\b\u0003\u0002\u001b\u0015\t\u0012!\u001a\u0005\u0012\u0015\u0017\u0016\n\u0017\u0012\t\"\u001d㙪", (byte) (KeyEvent.normalizeMetaState(0) + 107), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            f(21 - View.getDefaultSize(0, 0), "\u0004\u0017\b!!\u0017\b\u0003\u0002\u001b\u0015\t\u0012!\u001a\u0005\u0012\u0015\u0017\u0016㘊", (byte) (Drawable.resolveOpacity(0, 0) + 33), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = {this.f25009a};
        int i3 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i3;
        int i4 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i4;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i5 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i5;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr3, i4, iElapsedRealtime, i5, i3)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr4 = new Object[1];
            f(5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0015\t\u0012!", (byte) (99 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr4[0]).intern());
        }
        if (!c()) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr5 = new Object[1];
            f(23 - Process.getGidForName(""), "!\u001e\u001b\u000f\u0003\u0004\u001b\u000e\t\u001b#\u0018\u0005\u0014\u0015\u0017\u0017\t\u0017\u0016\u000b\u001e\"\u001c", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 122), objArr5);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr5[0]).intern());
        }
        o.eo.e eVarJ = o.en.b.c().j();
        List<o.ep.h> listC = eVarJ.e().c(this.f25009a.b());
        if (!listC.isEmpty()) {
            Long lG = eVarJ.e().g(this.f25009a.b());
            if (lG == null) {
                int i6 = f25176d + 65;
                f25175c = i6 % 128;
                int i7 = i6 % 2;
                if (o.ea.f.a()) {
                    Object[] objArr6 = new Object[1];
                    f((ViewConfiguration.getTapTimeout() >> 16) + 50, "\u0004\u0017\b!!\u0017\b\u0003\u0002\u001b\u0015\t\u0012!\u001a\u0005\u0012\u0015\u0017\u0016\u0007\u001c\u0001\u001f\u0015\u0000\n\u0015\u001d\u001f\u0007\u001c\u0001\u0003㘫㘫\u001f\u0001\r\u001a\u0013\u0000\u001b\u0013\u0017\u0010\u0016\u0017\u0010\u0016", (byte) (53 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr6);
                    o.ea.f.c(strIntern, ((String) objArr6[0]).intern());
                }
            } else {
                if (lG.longValue() >= System.currentTimeMillis() - 10000) {
                    if (o.ea.f.a()) {
                        int i8 = f25175c + 61;
                        f25176d = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr7 = new Object[1];
                        f(TextUtils.indexOf("", "") + 60, "\u0004\u0017\b!!\u0017\b\u0003\u0002\u001b\u0015\t\u0012!\u001a\u0005\u0012\u0015\u0017\u0016\u0007\u001c\u0001\u001f\u0019\u0005\u001b\u0013\u0017\u0010\u0016\u0017\u0010\u0016\u001b\u0007\u0007\u001f\u001f\u0000\u001f\u001b\u0016\u0017\b\u0003\u0012\u0003\u001a\u001d\u0003\u0014\u0016\u0017\u0003\u0006\u0018\u0007\u0018\u0004", (byte) (75 - Gravity.getAbsoluteGravity(0, 0)), objArr7);
                        o.ea.f.c(strIntern, ((String) objArr7[0]).intern());
                    }
                    Iterator<o.ep.h> it = listC.iterator();
                    while (it.hasNext()) {
                        int i10 = f25175c + 55;
                        f25176d = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr8 = {it.next()};
                        int i12 = o.ep.h.f24529j * (-1456136215);
                        o.ep.h.f24529j = i12;
                        int i13 = o.ep.h.f24527h * 389977318;
                        o.ep.h.f24527h = i13;
                        int i14 = o.ep.h.f24528i * (-407821031);
                        o.ep.h.f24528i = i14;
                        int i15 = o.ep.h.f24526f * (-2143292461);
                        o.ep.h.f24526f = i15;
                        if (((h.e) o.ep.h.c(-1791483773, i12, 1791483775, i13, objArr8, i14, i15)) == h.e.f24573e) {
                            int i16 = f25176d + 25;
                            f25175c = i16 % 128;
                            int i17 = i16 % 2;
                            it.remove();
                        }
                    }
                    ArrayList arrayList = new ArrayList(listC.size());
                    Iterator<o.ep.h> it2 = listC.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new VirtualCardNumber(this.f25009a, (a) this.f25009a.G(), it2.next()));
                    }
                    operationCallback.onSuccess(arrayList);
                    return;
                }
                if (o.ea.f.a()) {
                    int i18 = f25175c + 89;
                    f25176d = i18 % 128;
                    if (i18 % 2 != 0) {
                        Object[] objArr9 = new Object[1];
                        f(ViewConfiguration.getJumpTapTimeout() + 208, "\u0004\u0017\b!!\u0017\b\u0003\u0002\u001b\u0015\t\u0012!\u001a\u0005\u0012\u0015\u0017\u0016\u0007\u001c\u0001\u001f\u0005\u0004\u000b\n\u001b\u0013\u0015\n\u0017!\u0012\n\u0013\u001c\u0015\u0001\u000b\n\u001a\u0019㗴㗴㗴㗴\u0016\u000b", (byte) (66 >> Color.red(0)), objArr9);
                        obj2 = objArr9[0];
                    } else {
                        Object[] objArr10 = new Object[1];
                        f(50 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0004\u0017\b!!\u0017\b\u0003\u0002\u001b\u0015\t\u0012!\u001a\u0005\u0012\u0015\u0017\u0016\u0007\u001c\u0001\u001f\u0005\u0004\u000b\n\u001b\u0013\u0015\n\u0017!\u0012\n\u0013\u001c\u0015\u0001\u000b\n\u001a\u0019㗴㗴㗴㗴\u0016\u000b", (byte) (Color.red(0) + 74), objArr10);
                        obj2 = objArr10[0];
                    }
                    o.ea.f.c(strIntern, ((String) obj2).intern());
                }
            }
        } else if (o.ea.f.a()) {
            Object[] objArr11 = new Object[1];
            f(Color.red(0) + 45, "\u0004\u0017\b!!\u0017\b\u0003\u0002\u001b\u0015\t\u0012!\u001a\u0005\u0012\u0015\u0017\u0016\u0007\u001c\u0001\u001f\u0019\u0005\u0018\u001f\t\u000f\u0001\u001b \r\u0018\u0013\u0007\u001f\u0016\u0017\u000f\u0017\u001c\u0010㘎", (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27), objArr11);
            o.ea.f.c(strIntern, ((String) objArr11[0]).intern());
        }
        if (o.ea.f.a()) {
            int i19 = f25175c + 61;
            f25176d = i19 % 128;
            if (i19 % 2 != 0) {
                Object[] objArr12 = new Object[1];
                f('P' / AndroidCharacter.getMirror('P'), "\u0004\u0017\b!!\u0017\b\u0003\u0002\u001b\u0015\t\u0012!\u001a\u0005\u0012\u0015\u0017\u0016\u0007\u001c\u0001\u001f\u0013\u0000\u001b\u0013\u0017\u0010\u0016\u0017\u0010\u0016", (byte) (99 >> (ViewConfiguration.getMaximumDrawingCacheSize() << 84)), objArr12);
                obj = objArr12[0];
            } else {
                Object[] objArr13 = new Object[1];
                f(AndroidCharacter.getMirror('0') - 14, "\u0004\u0017\b!!\u0017\b\u0003\u0002\u001b\u0015\t\u0012!\u001a\u0005\u0012\u0015\u0017\u0016\u0007\u001c\u0001\u001f\u0013\u0000\u001b\u0013\u0017\u0010\u0016\u0017\u0010\u0016", (byte) (121 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr13);
                obj = objArr13[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        eVarJ.e(context, this.f25009a.b(), new e.d<o.ep.h>() { // from class: o.er.u.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static char[] f25180a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f25181b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f25182c = false;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static boolean f25183f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f25184g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static int f25185h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static long f25186i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f25187j = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(short r9, int r10, int r11) {
                /*
                    byte[] r8 = o.er.u.AnonymousClass1.$$a
                    int r3 = r11 * 3
                    int r2 = 1 - r3
                    int r0 = r9 + 67
                    int r1 = r10 * 2
                    int r7 = r1 + 4
                    byte[] r6 = new byte[r2]
                    r5 = 0
                    int r4 = 0 - r3
                    if (r8 != 0) goto L2e
                    r1 = r7
                    r2 = r4
                    r3 = r5
                L16:
                    int r7 = r7 + r2
                    int r1 = r1 + 1
                    r2 = r3
                    r0 = r7
                    r7 = r1
                L1c:
                    byte r1 = (byte) r0
                    r6[r2] = r1
                    int r3 = r2 + 1
                    if (r2 != r4) goto L29
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    return r0
                L29:
                    r2 = r8[r7]
                    r1 = r7
                    r7 = r0
                    goto L16
                L2e:
                    r2 = r5
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.u.AnonymousClass1.$$c(short, int, int):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f25185h = 1403038952;
                f25184g = 0;
                f25187j = 1;
                f25180a = new char[]{2559, 2550, 2531, 2529, 2363, 2532, 2546, 2548, 2530, 2535, 2558, 2533, 2542, 2545, 2338, 2361, 2305, 2329, 2555, 2553, 2557, 2549, 2552, 2324, 2544, 2556, 2330, 2554, 2334, 2547, 2350, 2323, 2327, 2326};
                f25181b = 2040400233;
                f25182c = true;
                f25183f = true;
                f25186i = -1537499538573186605L;
            }

            public static Object[] c(Context context2, int i20, int i21) {
                int i22 = 4;
                if (context2 == null) {
                    Object[] objArr14 = {new int[]{i ^ (i << 5)}, new int[]{i20}, null, new int[]{i20}};
                    int i23 = f25185h * 778777924;
                    f25185h = i23;
                    int i24 = ~i23;
                    int i25 = i21 + 25126609 + (((-1) - (((-1) - (~((i24 - 160729229) - (i24 & (-160729229))))) & ((-1) - 838877250))) * 220) + (((-1) - (((-1) - (~((-1) - (((-1) - i24) & ((-1) - (-167028894)))))) & ((-1) - 845176915))) * (-440)) + (((-1) - (((-1) - i23) & ((-1) - (-160729229)))) * 220);
                    int i26 = i25 ^ (i25 << 13);
                    int i27 = i26 ^ (i26 >>> 17);
                    return objArr14;
                }
                try {
                    Object[] objArr15 = new Object[1];
                    k(TextUtils.indexOf("", "", 0) + 127, null, null, "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u0085\u0090\u0090\u008f\u0084\u0085\u008e\u008c\u0089\u0082\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr15);
                    Object[] objArr16 = (Object[]) Array.newInstance(Class.forName(((String) objArr15[0]).intern()), 2);
                    Object[] objArr17 = new Object[1];
                    l("嚬囯◆ḡ\udfceꢡ苕は롦㐈촥醟讍ڴﰛꁨ鴥᧖\uebea仯\uec10\ue857饾嶥\ufff6滛衕氯석췄ꞧ竿탭\udc51唼", TextUtils.indexOf("", "", 0) + 1, objArr17);
                    try {
                        Object[] objArr18 = {((String) objArr17[0]).intern()};
                        Object[] objArr19 = new Object[1];
                        k((ViewConfiguration.getLongPressTimeout() >> 16) + 127, null, null, "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u0085\u0090\u0090\u008f\u0084\u0085\u008e\u008c\u0089\u0082\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr19);
                        objArr16[0] = Class.forName(((String) objArr19[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr18);
                        Object[] objArr20 = new Object[1];
                        l("\u2e7c⸿ꋊ饞핏ꉈ뿑൹샴덜잃겧\uf35a臋\uf6a0鵕\ue5f9麯\ue15a珝钢潚鏫悜蜬緱芡儿맀䫿괦䟏ꡢ嬎忡", 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr20);
                        try {
                            Object[] objArr21 = {((String) objArr20[0]).intern()};
                            Object[] objArr22 = new Object[1];
                            k(Drawable.resolveOpacity(0, 0) + 127, null, null, "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u0085\u0090\u0090\u008f\u0084\u0085\u008e\u008c\u0089\u0082\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr22);
                            objArr16[1] = Class.forName(((String) objArr22[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr21);
                            try {
                                Object[] objArr23 = new Object[1];
                                k((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, null, null, "\u008c\u0084\u0087\u008c\u0093\u0097\u0098\u0085\u008c\u0093\u0087\u008c\u0093\u0097\u0088\u0085\u0096\u008b\u0097\u008a\u0096\u0093\u0082", objArr23);
                                Class<?> cls = Class.forName(((String) objArr23[0]).intern());
                                Object[] objArr24 = new Object[1];
                                k(KeyEvent.normalizeMetaState(0) + 127, null, null, "\u008a\u0087\u0099\u0082\u0093\u0082\u009b\u0087\u0099\u0082\u009a\u0088\u0082\u0092\u008c\u0087\u0099", objArr24);
                                Object objInvoke = cls.getMethod(((String) objArr24[0]).intern(), null).invoke(context2, null);
                                try {
                                    Object[] objArr25 = new Object[1];
                                    k(127 - View.resolveSize(0, 0), null, null, "\u008c\u0084\u0087\u008c\u0093\u0097\u0098\u0085\u008c\u0093\u0087\u008c\u0093\u0097\u0088\u0085\u0096\u008b\u0097\u008a\u0096\u0093\u0082", objArr25);
                                    Class<?> cls2 = Class.forName(((String) objArr25[0]).intern());
                                    Object[] objArr26 = new Object[1];
                                    l("廮庉섡\ufaed\ue7a5邃铬♇뀫탃\uf51e螹菁\ue279쑗뙥镯ﴝ", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr26);
                                    try {
                                        Object[] objArr27 = {cls2.getMethod(((String) objArr26[0]).intern(), null).invoke(context2, null), 64};
                                        Object[] objArr28 = new Object[1];
                                        l("\u0be2ஃ깳閴ࠁ缷\ue7b8唱\ue529뾐᪥\uf480훉贪⯃씆쁫鉏㱽⯸넂揠任㣪ꊷ焊忚ॿ鱝䙐灐ᾃ跰埰芞氣纰", 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr28);
                                        Class<?> cls3 = Class.forName(((String) objArr28[0]).intern());
                                        Object[] objArr29 = new Object[1];
                                        l("ꐳꑔ췯\uf623⦋庭읉痢䫶\udc0d㬰퐜礜\ueeb7\u0a7e\ue5cf澹\uf1d9", ExpandableListView.getPackedPositionType(0L) + 1, objArr29);
                                        Object objInvoke2 = cls3.getMethod(((String) objArr29[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr27);
                                        Object[] objArr30 = new Object[1];
                                        k(127 - KeyEvent.keyCodeFromString(""), null, null, "\u0097\u009e\u0093\u009d\u0087\u0099\u0082\u009a\u0088\u0082\u0092\u0085\u009c\u0094\u0085\u008c\u0093\u0087\u008c\u0093\u0097\u0088\u0085\u0096\u008b\u0097\u008a\u0096\u0093\u0082", objArr30);
                                        Class<?> cls4 = Class.forName(((String) objArr30[0]).intern());
                                        char c2 = '0';
                                        Object[] objArr31 = new Object[1];
                                        k(AndroidCharacter.getMirror('0') + 'O', null, null, "\u0086\u0087\u008a\u0089\u008c\u0082\u0093\u0099\u008b\u0086", objArr31);
                                        Object[] objArr32 = (Object[]) cls4.getField(((String) objArr31[0]).intern()).get(objInvoke2);
                                        int length = objArr32.length;
                                        int i28 = 0;
                                        while (i28 < length) {
                                            Object obj3 = objArr32[i28];
                                            Object[] objArr33 = new Object[1];
                                            k(126 - TextUtils.lastIndexOf("", c2), null, null, "\u009f\u0090\u008f\u0085\u0091", objArr33);
                                            try {
                                                Object[] objArr34 = {((String) objArr33[0]).intern()};
                                                Object[] objArr35 = new Object[1];
                                                k((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, null, "\u008d\u008a\u0097\u008c\u0088\u0082 \u0087\u008c\u0082\u0088\u008b\u009e\u008b\u008c\u008a\u0087\u0098\u0085\u008c\u008a\u0087\u0088\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0083\u0082\u0081", objArr35);
                                                Class<?> cls5 = Class.forName(((String) objArr35[0]).intern());
                                                Object[] objArr36 = new Object[1];
                                                k((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, null, "\u0087\u0088\u0093\u0082\u008c\u0086\u0093\u009d\u008c\u0087\u0099", objArr36);
                                                Object objInvoke3 = cls5.getMethod(((String) objArr36[0]).intern(), String.class).invoke(null, objArr34);
                                                try {
                                                    Object[] objArr37 = new Object[1];
                                                    l("\ufafb漢䳔眓╙副ل듍ᐰ崷㟽ᕼ⟐澍ڛ⓺ㅲ烨ᄥ쨄䀛腇掣\ud915厦鎩犇\ue883浗ꓧ崷ﹻ", 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr37);
                                                    Class<?> cls6 = Class.forName(((String) objArr37[0]).intern());
                                                    Object[] objArr38 = new Object[1];
                                                    k(ExpandableListView.getPackedPositionGroup(0L) + 127, null, null, "\u008d\u0082\u008a\u008a¢\u0087\u008c\u008d¡\u0097\u008c", objArr38);
                                                    try {
                                                        Object[] objArr39 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr38[0]).intern(), null).invoke(obj3, null))};
                                                        Object[] objArr40 = new Object[1];
                                                        k((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, null, null, "\u008d\u008a\u0097\u008c\u0088\u0082 \u0087\u008c\u0082\u0088\u008b\u009e\u008b\u008c\u008a\u0087\u0098\u0085\u008c\u008a\u0087\u0088\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0083\u0082\u0081", objArr40);
                                                        Class<?> cls7 = Class.forName(((String) objArr40[0]).intern());
                                                        Object[] objArr41 = new Object[1];
                                                        l("凊冭\uf6e6촪㢓侯\uf46f䛱뼜\ue706⨭\ue70b賁햾ᭇ훆驏쫙\u0cf8㡵\ueb3b㭧縨", TextUtils.getOffsetBefore("", 0) + 1, objArr41);
                                                        Object objInvoke4 = cls7.getMethod(((String) objArr41[0]).intern(), InputStream.class).invoke(objInvoke3, objArr39);
                                                        int length2 = objArr16.length;
                                                        for (int i29 = 0; i29 < 2; i29++) {
                                                            Object obj4 = objArr16[i29];
                                                            try {
                                                                Object[] objArr42 = new Object[1];
                                                                k(127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, null, "\u0087\u008c\u0082\u0088\u008b\u009e\u008b\u008c\u008a\u0087\u0098\u009f\u0090\u008f\u0091\u0085\u008c\u008a\u0087\u0088\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0083\u0082\u0081", objArr42);
                                                                Class<?> cls8 = Class.forName(((String) objArr42[0]).intern());
                                                                Object[] objArr43 = new Object[1];
                                                                l("檽櫚⩋ᆇ適\ue74f퀮抆葬㮨苓썼랖ं뎍\uf2f0ꅡᘢꐡᰓ큄\ue7d0훎ཤ쏹\uf53b장", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr43);
                                                                if (obj4.equals(cls8.getMethod(((String) objArr43[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                    Object[] objArr44 = {new int[]{i ^ (i << 5)}, new int[]{i20}, null, new int[]{i20 ^ 1}};
                                                                    int i30 = ~((i20 - 283943722) - (i20 & (-283943722)));
                                                                    int i31 = i21 + 2001284651 + (((i30 + 273154569) - (i30 & 273154569)) * (-140)) + ((~(((-10789153) + i20) - ((-10789153) & i20))) * 70) + (((-1) - (((-1) - (~(i20 | 962091743))) & ((-1) - (-699726327)))) * 70) + 16;
                                                                    int i32 = i31 ^ (i31 << 13);
                                                                    int i33 = i32 ^ (i32 >>> 17);
                                                                    return objArr44;
                                                                }
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        i28++;
                                                        c2 = '0';
                                                        i22 = 4;
                                                    } catch (Throwable th2) {
                                                        Throwable cause2 = th2.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th3) {
                                                    Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        Throwable cause5 = th5.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable unused) {
                    i22 = 4;
                }
                Object[] objArr45 = new Object[i22];
                objArr45[0] = new int[1];
                objArr45[1] = new int[]{i20};
                objArr45[3] = new int[]{i20};
                objArr45[2] = null;
                int iNextInt = new Random().nextInt();
                int i34 = 312044723 + (((~((-429971127) | iNextInt)) | 287315456 | (~((-1) - (((-1) - 248176895) & ((-1) - iNextInt))))) * (-754));
                int i35 = ~(((-287315457) + iNextInt) - ((-287315457) & iNextInt));
                int i36 = ~iNextInt;
                int i37 = i21 + i34 + ((i35 | (~(535492351 | i36))) * (-754)) + (((i36 - 429971127) - (i36 & (-429971127))) * 754);
                int i38 = i37 ^ (i37 << 13);
                int i39 = i38 ^ (i38 >>> 17);
                ((int[]) objArr45[0])[0] = i39 ^ (i39 << 5);
                return objArr45;
            }

            static void init$0() {
                $$a = new byte[]{52, 50, -24, MessagePack.Code.MAP16};
                $$b = 38;
            }

            private static void k(int i20, String str, int[] iArr, String str2, Object[] objArr14) throws Throwable {
                String str3 = str;
                String str4 = str2;
                int i21 = 2;
                int i22 = 2 % 2;
                int i23 = $11 + 113;
                $10 = i23 % 128;
                int i24 = i23 % 2;
                Object bytes = str4;
                if (str4 != null) {
                    bytes = str4.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                o.a.f fVar = new o.a.f();
                char[] cArr2 = f25180a;
                long j2 = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i25 = 0;
                    while (i25 < length) {
                        int i26 = $10 + 121;
                        $11 = i26 % 128;
                        int i27 = i26 % i21;
                        try {
                            Object[] objArr15 = {Integer.valueOf(cArr2[i25])};
                            Object objA = o.d.d.a(1618406102);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a(Color.alpha(0) + 593, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13181), (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)) + 10, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i25] = ((Character) ((Method) objA).invoke(null, objArr15)).charValue();
                            i25++;
                            i21 = 2;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr16 = {Integer.valueOf(f25181b)};
                Object objA2 = o.d.d.a(-1503702982);
                if (objA2 == null) {
                    objA2 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 32, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 11 - View.resolveSize(0, 0), 1893380703, false, "F", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr16)).intValue();
                int i28 = 1540807955;
                if (f25183f) {
                    int i29 = $11 + 51;
                    $10 = i29 % 128;
                    int i30 = i29 % 2;
                    fVar.f19923e = bArr.length;
                    char[] cArr4 = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                    while (fVar.f19922a < fVar.f19923e) {
                        cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i20] - iIntValue);
                        Object[] objArr17 = {fVar, fVar};
                        Object objA3 = o.d.d.a(i28);
                        if (objA3 == null) {
                            int packedPositionChild = 457 - ExpandableListView.getPackedPositionChild(0L);
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int maximumDrawingCacheSize = 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int i31 = $$b;
                            byte b4 = (byte) 0;
                            objA3 = o.d.d.a(packedPositionChild, fadingEdgeLength, maximumDrawingCacheSize, -1923924106, false, $$c((byte) ((i31 + 31) - (i31 | 31)), b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr17);
                        i28 = 1540807955;
                    }
                    objArr14[0] = new String(cArr4);
                    return;
                }
                if (!f25182c) {
                    fVar.f19923e = iArr.length;
                    char[] cArr5 = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                    while (fVar.f19922a < fVar.f19923e) {
                        int i32 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        $10 = i32 % 128;
                        int i33 = i32 % 2;
                        cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i20] - iIntValue);
                        fVar.f19922a++;
                    }
                    objArr14[0] = new String(cArr5);
                    return;
                }
                fVar.f19923e = cArr.length;
                char[] cArr6 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i20] - iIntValue);
                    Object[] objArr18 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 458;
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i34 = 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        int i35 = $$b;
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a(minimumFlingVelocity, packedPositionType, i34, -1923924106, false, $$c((byte) ((i35 + 31) - (i35 | 31)), b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr18);
                }
                objArr14[0] = new String(cArr6);
            }

            private static void l(String str, int i20, Object[] objArr14) throws Throwable {
                Object charArray;
                String str2 = str;
                int i21 = 2 % 2;
                int i22 = $10 + 89;
                int i23 = i22 % 128;
                $11 = i23;
                int i24 = i22 % 2;
                if (str2 != null) {
                    int i25 = i23 + 109;
                    $10 = i25 % 128;
                    int i26 = i25 % 2;
                    charArray = str2.toCharArray();
                } else {
                    charArray = str2;
                }
                o.a.k kVar = new o.a.k();
                char[] cArrC = o.a.k.c(f25186i ^ (-5882309809461882246L), (char[]) charArray, i20);
                kVar.f19939c = 4;
                int i27 = $11 + 79;
                $10 = i27 % 128;
                int i28 = i27 % 2;
                while (kVar.f19939c < cArrC.length) {
                    int i29 = $11 + 7;
                    $10 = i29 % 128;
                    int i30 = i29 % 2;
                    kVar.f19938a = kVar.f19939c - 4;
                    int i31 = kVar.f19939c;
                    try {
                        Object[] objArr15 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25186i)};
                        Object objA = o.d.d.a(-1093976004);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a(Color.rgb(0, 0, 0) + 16777445, (char) (51004 - (Process.myTid() >> 22)), (ViewConfiguration.getEdgeSlop() >> 16) + 9, 1749983833, false, $$c((byte) ($$b + 2), b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrC[i31] = ((Character) ((Method) objA).invoke(null, objArr15)).charValue();
                        Object[] objArr16 = {kVar, kVar};
                        Object objA2 = o.d.d.a(-912105096);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            objA2 = o.d.d.a(674 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 11 - TextUtils.indexOf((CharSequence) "", '0'), 522683165, false, $$c((byte) ($$b | 9), b3, b3), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr16);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                String str3 = new String(cArrC, 4, cArrC.length - 4);
                int i32 = $10 + 5;
                $11 = i32 % 128;
                int i33 = i32 % 2;
                objArr14[0] = str3;
            }

            @Override // o.eo.e.d
            public final void a(o.by.c cVar) {
                int i20 = 2 % 2;
                int i21 = f25187j + 87;
                f25184g = i21 % 128;
                if (i21 % 2 != 0) {
                    operationCallback.onError(cVar.a());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                operationCallback.onError(cVar.a());
                int i22 = f25184g + 85;
                f25187j = i22 % 128;
                int i23 = i22 % 2;
            }

            @Override // o.eo.e.d
            public final void d(List<o.ep.h> list) {
                int i20 = 2 % 2;
                Iterator<o.ep.h> it3 = list.iterator();
                int i21 = f25184g + 87;
                f25187j = i21 % 128;
                int i22 = i21 % 2;
                while (it3.hasNext()) {
                    Object[] objArr14 = {it3.next()};
                    int i23 = o.ep.h.f24529j * (-1456136215);
                    o.ep.h.f24529j = i23;
                    int i24 = o.ep.h.f24527h * 389977318;
                    o.ep.h.f24527h = i24;
                    int i25 = o.ep.h.f24528i * (-407821031);
                    o.ep.h.f24528i = i25;
                    int i26 = o.ep.h.f24526f * (-2143292461);
                    o.ep.h.f24526f = i26;
                    if (((h.e) o.ep.h.c(-1791483773, i23, 1791483775, i24, objArr14, i25, i26)) == h.e.f24573e) {
                        int i27 = f25187j + 77;
                        f25184g = i27 % 128;
                        int i28 = i27 % 2;
                        it3.remove();
                    }
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                Iterator<o.ep.h> it4 = list.iterator();
                while (it4.hasNext()) {
                    try {
                        arrayList2.add(new VirtualCardNumber(u.this.f25009a, (a) u.this.f25009a.G(), it4.next()));
                    } catch (WalletValidationException e2) {
                        e2.printStackTrace();
                    }
                }
                operationCallback.onSuccess(arrayList2);
                int i29 = f25187j + 63;
                f25184g = i29 % 128;
                if (i29 % 2 != 0) {
                    throw null;
                }
            }
        });
    }

    @Override // o.er.h
    public final /* synthetic */ boolean c() {
        int i2 = 2 % 2;
        int i3 = f25175c + 39;
        f25176d = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = super.c();
        int i5 = f25175c + 121;
        f25176d = i5 % 128;
        if (i5 % 2 == 0) {
            return zC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.er.h
    public final c[] h() {
        int i2 = 2 % 2;
        int i3 = f25175c + 93;
        f25176d = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = {this.f25010g.f(), this.f25010g.g()};
        int i5 = f25176d + 103;
        f25175c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return cVarArr;
    }
}
