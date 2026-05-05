package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import com.incode.core_light.R;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.recogkitandroid.RecogKitInitException;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import org.msgpack.core.MessagePack;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class p {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4948a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f4949b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f4950c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f4951d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f4952e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f4953f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static short[] f4954g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f4955h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f4956i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static byte[] f4957j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f4958k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f4959l = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f4960o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, int r9, byte r10) {
        /*
            int r7 = r9 * 2
            int r1 = r7 + 1
            byte[] r6 = com.incode.welcome_sdk.commons.e.p.$$a
            int r0 = r10 * 2
            int r5 = 3 - r0
            int r4 = r8 + 65
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r6 != 0) goto L26
            r0 = r7
            r1 = r2
        L13:
            int r4 = r4 + r0
        L14:
            int r5 = r5 + 1
            byte r0 = (byte) r4
            r3[r1] = r0
            if (r1 != r7) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L21:
            int r1 = r1 + 1
            r0 = r6[r5]
            goto L13
        L26:
            r1 = r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.e.p.$$c(int, int, byte):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{55, 117, 51, -11};
        $$b = 184;
    }

    @Provides
    final IdCaptureKitAndroid a(Application application, SharedPreferences sharedPreferences) throws Throwable {
        File filesDir;
        IdCaptureKitAndroid idCaptureKitAndroid;
        int i2 = 2 % 2;
        int i3 = f4953f + 123;
        f4959l = i3 % 128;
        int i4 = i3 % 2;
        int iMax = Math.max(Runtime.getRuntime().availableProcessors() - 4, 2);
        Object[] objArr = new Object[1];
        m("鎽棦䅋ꕊ䩫쑾醜\ue164핗䬭鵔ꕅ湸遯", (ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr);
        Timber.d(((String) objArr[0]).intern(), Integer.valueOf(iMax));
        if (com.incode.welcome_sdk.commons.utils.l.b()) {
            filesDir = application.getExternalFilesDir(null);
        } else {
            filesDir = application.getFilesDir();
        }
        Object[] objArr2 = new Object[1];
        n((ViewConfiguration.getJumpTapTimeout() >> 16) - 1769953767, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1057457128 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 114, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        m("汑뱝撓庁쟆Ϯ\udddd놄棼钥鵉넚鎇\uf8f8͍\ue128Ɦⵠړ矆䲉质쨬\ufdce킥琸죨\uf18f큼ᇖ\ue710ꢗ\u0fee䌛Ꝩ决뒲ವ䠥ꪎ\ueffa놪ࡲ\uabff䠥ꪎ\uda65ꛛ㫓븺\udddd놄撓庁샍蘔緹堠ء㬼䂯咍駣佸", Gravity.getAbsoluteGravity(0, 0) + 64, objArr3);
        File file = (File) com.incode.welcome_sdk.commons.utils.l.a(FormsSelectInputScreenKt.h.b(), new Object[]{application, filesDir, strIntern, ((String) objArr3[0]).intern(), Integer.valueOf(R.raw.id_segmentation_v3_1_0_f16)}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), -1252974840, 1252974842, FormsSelectInputScreenKt.h.b());
        if (!file.exists()) {
            return null;
        }
        try {
            idCaptureKitAndroid = new IdCaptureKitAndroid(file.getPath(), 0.7f, 0.8f, 0.5f, 0.5f);
        } catch (RecogKitInitException e2) {
            e = e2;
            idCaptureKitAndroid = null;
        }
        try {
            idCaptureKitAndroid.setNumThreads(iMax, 0);
            d(sharedPreferences, filesDir);
            if (IncodeWelcome.getInstance().isEnabledInstallSizeOptimization()) {
                Object[] objArr4 = new Object[1];
                n(Color.green(0) - 1769953767, (byte) ((-16777175) - Color.rgb(0, 0, 0)), (short) TextUtils.getTrimmedLength(""), 1057457129 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-114) - KeyEvent.keyCodeFromString(""), objArr4);
                boolean zBooleanValue = ((Boolean) com.incode.welcome_sdk.commons.utils.l.a(FormsSelectInputScreenKt.h.b(), new Object[]{filesDir, ((String) objArr4[0]).intern()}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, FormsSelectInputScreenKt.h.b())).booleanValue();
                Object[] objArr5 = new Object[1];
                m("궗圕\u058b\u0a57兇Ṉ盈\ude08㨦⭣\ue5c8鯂佉䨾⢾瞗ʑ桿\ue674\ue40c\u202d쓰싇徻皑㎤\ufdd8\udd27滍⛦蹑뙟涤捩㜽\udc9a傈︗鲥镁Ꚅ儔\ue290\ue52dᢞ즋\uda6a䁋랓ᡣӝ茓紝㎩鶤∕Z뙉", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 58, objArr5);
                Timber.d(((String) objArr5[0]).intern(), Boolean.valueOf(zBooleanValue));
                int i5 = f4959l + 63;
                f4953f = i5 % 128;
                int i6 = i5 % 2;
                return idCaptureKitAndroid;
            }
            return idCaptureKitAndroid;
        } catch (RecogKitInitException e3) {
            e = e3;
            Object[] objArr6 = new Object[1];
            n(View.MeasureSpec.getMode(0) - 1769953728, (byte) (KeyEvent.getDeadChar(0, 0) - 45), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1057457089 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) - 113, objArr6);
            Timber.e(e, ((String) objArr6[0]).intern(), new Object[0]);
            return idCaptureKitAndroid;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IdCaptureKitAndroid d(Lazy lazy) throws Exception {
        int i2 = 2 % 2;
        int i3 = f4959l + 41;
        f4953f = i3 % 128;
        int i4 = i3 % 2;
        IdCaptureKitAndroid idCaptureKitAndroid = (IdCaptureKitAndroid) lazy.get();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f4959l + 65;
        f4953f = i5 % 128;
        int i6 = i5 % 2;
        return idCaptureKitAndroid;
    }

    @Provides
    final Observable<IdCaptureKitAndroid> c(final Lazy<IdCaptureKitAndroid> lazy) {
        int i2 = 2 % 2;
        int i3 = f4953f + 77;
        f4959l = i3 % 128;
        int i4 = i3 % 2;
        Observable<IdCaptureKitAndroid> observableObserveOn = Observable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.commons.e.p$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p.d(lazy);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        int i5 = f4959l + 111;
        f4953f = i5 % 128;
        if (i5 % 2 == 0) {
            return observableObserveOn;
        }
        throw null;
    }

    private static void d(SharedPreferences sharedPreferences, File file) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f4953f + 57;
        f4959l = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Object[] objArr = new Object[1];
        m("ⰱ⎽薀⋣\uf860皠嘒\uf1f9滍⛦蹑뙟ℬ醑赮\ueeddꑆ᯳ꪌ蛜", 19 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        editorEdit.remove(((String) objArr[0]).intern()).apply();
        Object[] objArr2 = new Object[1];
        m("桲喩\ue15cᥕ싇徻쀜ꢫ鋄퇦㫎䎸䵃룙⬧趺郻ăࢁ讶⮹\ue101쇨咬ᝏ⃦", 26 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
        ((Boolean) com.incode.welcome_sdk.commons.utils.l.a(FormsSelectInputScreenKt.h.b(), new Object[]{file, ((String) objArr2[0]).intern()}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, FormsSelectInputScreenKt.h.b())).booleanValue();
        Object[] objArr3 = new Object[1];
        n((-1769953695) - KeyEvent.getDeadChar(0, 0), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 2), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") + 1057457133, (-16777330) - Color.rgb(0, 0, 0), objArr3);
        ((Boolean) com.incode.welcome_sdk.commons.utils.l.a(FormsSelectInputScreenKt.h.b(), new Object[]{file, ((String) objArr3[0]).intern()}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, FormsSelectInputScreenKt.h.b())).booleanValue();
        Object[] objArr4 = new Object[1];
        n(TextUtils.indexOf("", "", 0) - 1769953647, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3), (short) View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0', 0, 0) + 1057457129, (-114) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        ((Boolean) com.incode.welcome_sdk.commons.utils.l.a(FormsSelectInputScreenKt.h.b(), new Object[]{file, ((String) objArr4[0]).intern()}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, FormsSelectInputScreenKt.h.b())).booleanValue();
        Object[] objArr5 = new Object[1];
        m("͢稔絋퀝\u2d2c建\ueda4⫕滝鯗洠딾ꑆ᯳蓺\u2e7b趜⓮ᦚ\udf88\udc1a\ue9a3쇨咬뒮ᛱ늏箪\ue952墘ⳑ\u0d0d桲喩\u202d쓰兎䁙퇌읺", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 39, objArr5);
        ((Boolean) com.incode.welcome_sdk.commons.utils.l.a(FormsSelectInputScreenKt.h.b(), new Object[]{file, ((String) objArr5[0]).intern()}, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, FormsSelectInputScreenKt.h.b())).booleanValue();
        int i5 = f4959l + 109;
        f4953f = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(java.lang.String r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.e.p.m(java.lang.String, int, java.lang.Object[]):void");
    }

    private static void n(int i2, byte b2, short s2, int i3, int i4, Object[] objArr) throws Throwable {
        long j2;
        int i5;
        boolean z2;
        int i6 = 2 % 2;
        com.c.a.l lVar = new com.c.a.l();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f4955h)};
            Object objC = com.c.a.e.e.c(1394921452);
            if (objC == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objC = com.c.a.e.e.e((char) (7674 - (ViewConfiguration.getScrollBarSize() >> 8)), 27 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 527 - (ViewConfiguration.getTouchSlop() >> 8), 1405013397, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
            boolean z3 = iIntValue == -1;
            int i7 = 3;
            if (z3) {
                byte[] bArr = f4957j;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objC2 = com.c.a.e.e.c(-713221154);
                        if (objC2 == null) {
                            byte b5 = (byte) i7;
                            byte b6 = (byte) (b5 - 3);
                            objC2 = com.c.a.e.e.e((char) (65414 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 261 - (ViewConfiguration.getPressedStateDuration() >> 16), -706274905, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objC2).invoke(null, objArr3)).byteValue();
                        i8++;
                        i7 = 3;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f4957j;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f4948a)};
                    Object objC3 = com.c.a.e.e.c(1394921452);
                    if (objC3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objC3 = com.c.a.e.e.e((char) (KeyEvent.getDeadChar(0, 0) + 7674), (-16777189) - Color.rgb(0, 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 527, 1405013397, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objC3).invoke(null, objArr4)).intValue()]) ^ 8033500363701343155L)) + ((int) (((long) f4955h) ^ 8033500363701343155L)));
                    j2 = 8033500363701343155L;
                } else {
                    j2 = 8033500363701343155L;
                    iIntValue = (short) (((short) (((long) f4954g[i2 + ((int) (((long) f4948a) ^ 8033500363701343155L))]) ^ 8033500363701343155L)) + ((int) (((long) f4955h) ^ 8033500363701343155L)));
                }
            } else {
                j2 = 8033500363701343155L;
            }
            if (iIntValue > 0) {
                int i9 = ((i2 + iIntValue) - 2) + ((int) (((long) f4948a) ^ j2));
                if (z3) {
                    int i10 = $11 + 27;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                lVar.f2775b = i9 + i5;
                Object[] objArr5 = {lVar, Integer.valueOf(i3), Integer.valueOf(f4956i), sb};
                Object objC4 = com.c.a.e.e.c(-893097792);
                if (objC4 == null) {
                    byte b9 = (byte) 1;
                    byte b10 = (byte) (b9 - 1);
                    objC4 = com.c.a.e.e.e((char) (MotionEvent.axisFromString("") + 19418), 20 - Color.blue(0), Color.argb(0, 0, 0, 0) + PhotoshopDirectory.TAG_ALTERNATE_SPOT_COLORS, -899781959, false, $$c(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objC4).invoke(null, objArr5)).append(lVar.f2776c);
                lVar.f2774a = lVar.f2776c;
                byte[] bArr4 = f4957j;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i12 = $10 + 107;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 4 / 4;
                    }
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 8033500363701343155L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $11 + 69;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                lVar.f2777d = 1;
                while (lVar.f2777d < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = f4957j;
                        lVar.f2775b = lVar.f2775b - 1;
                        lVar.f2776c = (char) (lVar.f2774a + (((byte) (((byte) (((long) bArr6[r3]) ^ 8033500363701343155L)) + s2)) ^ b2));
                    } else {
                        short[] sArr = f4954g;
                        lVar.f2775b = lVar.f2775b - 1;
                        lVar.f2776c = (char) (lVar.f2774a + (((short) (((short) (((long) sArr[r3]) ^ 8033500363701343155L)) + s2)) ^ b2));
                        int i17 = $11 + 11;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    sb.append(lVar.f2776c);
                    lVar.f2774a = lVar.f2776c;
                    lVar.f2777d++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void d() {
        f4949b = (char) 10704;
        f4951d = (char) 17391;
        f4950c = (char) 50181;
        f4952e = (char) 13952;
        f4948a = 270305876;
        f4955h = 2036585410;
        f4956i = -1180979406;
        f4957j = new byte[]{5, 38, MessagePack.Code.FIXARRAY_PREFIX, -99, -101, 111, -104, 101, -102, -111, 111, -109, -83, 98, -97, 81, -99, -75, 75, -76, 72, -74, 39, -115, 107, 101, -100, 111, -119, 119, -100, -109, 98, -100, -104, 104, -114, 97, 97, 3, -101, -102, -99, 110, -106, 77, -83, 107, 126, -122, -109, -99, 97, 100, 111, 126, -65, 123, 73, MessagePack.Code.UINT8, 107, -101, 101, 41, MessagePack.Code.UINT8, 45, MessagePack.Code.STR8, 106, -104, -105, 102, 76, Ascii.FF, -15, 71, 74, 76, -72, 79, -78, 77, 70, -72, 68, 122, -75, 72, 76, -78, -78, 77, 79, -77, -98, 100, 72, -122, 74, -94, 77, -80, 95, -94, 75, 64, 103, -101, 98, -100, 96, -15, 79, 66, -70, 68, -76, 78, 74, -66, 79, 5, Ascii.CR, -69, -74, -80, 68, -77, 78, -79, -70, 68, -72, -122, 73, -76, 122, -74, -100, 98, -98, 96, -97, 10, -90, 64, 78, -73, 68, -94, 92, -73, -72, 73, -73, -77, 67, -91, 74, 74};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f4960o = 0;
        f4958k = 1;
        f4953f = 0;
        f4959l = 1;
        d();
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getJumpTapTimeout();
        ViewConfiguration.getMaximumFlingVelocity();
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getWindowTouchSlop();
        int i2 = f4960o + 21;
        f4958k = i2 % 128;
        int i3 = i2 % 2;
    }
}
