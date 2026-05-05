package o.cg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.a.k;
import o.a.n;
import o.a.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f22371e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22372f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f22373g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22374h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22375i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22376j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f22377k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22378a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<o.g.a> f22379b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22381d;

    public static final class e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f22382a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static char[] f22383b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static char f22384c = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f22385f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f22386g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f22387h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f22388i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f22389j = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o.ef.a f22390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[][] f22391e;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r8, short r9, int r10) {
            /*
                int r0 = r8 * 3
                int r8 = r0 + 1
                int r0 = 114 - r9
                int r1 = r10 * 4
                int r7 = 3 - r1
                byte[] r6 = o.cg.j.e.$$a
                byte[] r5 = new byte[r8]
                r4 = 0
                if (r6 != 0) goto L2b
                r2 = r8
                r1 = r7
                r3 = r4
            L14:
                int r7 = r7 + r2
                r2 = r3
                r0 = r7
                r7 = r1
            L18:
                int r3 = r2 + 1
                byte r1 = (byte) r0
                r5[r2] = r1
                int r1 = r7 + 1
                if (r3 != r8) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L27:
                r2 = r6[r1]
                r7 = r0
                goto L14
            L2b:
                r2 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cg.j.e.$$c(byte, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f22388i = 2061320819;
            f22387h = -110557067;
            f22385f = 252466041;
            f22386g = 0;
            f22389j = 1;
            f22383b = new char[]{64577, 64624, 64533, 65467, 64637, 64611, 65470, 64597, 65469, 65466, 64540, 64595, 64585, 64521, 64588, 64589, 64598, 64582, 64586, 64604, 64612, 64619, 65465, 64605, 64580, 64584, 64591, 64576, 64523, 64620, 65468, 64579, 64592, 64618, 64593, 64629, 64614, 64609, 64587, 64590, 64583, 64536, 64578, 64517, 64599, 64528, 64616, 65471, 64630};
            f22384c = (char) 51640;
            f22382a = 1280575808020965980L;
        }

        e(o.ef.a aVar, byte[][] bArr) {
            this.f22390d = aVar;
            this.f22391e = bArr;
        }

        public static Object[] e(Context context, int i2, int i3) {
            if (context == null) {
                Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
                int i4 = f22385f * 1406242711;
                f22385f = i4;
                int i5 = ~i4;
                int i6 = i3 + (-1389224671) + (((-1) - (((-1) - (~((-1) - (((-1) - 371565801) & ((-1) - i5))))) & ((-1) - 306582220))) * (-328)) + (((-1) - (((-1) - i4) & ((-1) - 306582220))) * 164) + (((-1) - (((-1) - ((-1) - (((-1) - (~((-1) - (((-1) - i4) & ((-1) - (-371565802)))))) & ((-1) - 302252232)))) & ((-1) - (~((-1) - (((-1) - i5) & ((-1) - 375895789))))))) * 164);
                int i7 = i6 ^ (i6 << 13);
                int i8 = i7 ^ (i7 >>> 17);
                return objArr;
            }
            try {
                long j2 = 0;
                Object[] objArr2 = new Object[1];
                k(39 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u001b\u0019\n\u0019\u0015\u001e\u0014\u0017\u0012\u001f*\u0010!\u0014\u001f\u0015!\u001c\u000e\u001d\u0018,㗋㗋 \u0000,\u0003\u0000%*\u0010-\u0018\u0015\u000e\u001a\n", (byte) (33 - Drawable.resolveOpacity(0, 0)), objArr2);
                Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
                Object[] objArr4 = new Object[1];
                k(((Process.getThreadPriority(0) + 20) >> 6) + 31, "#\u00160\u001b#\u0003.\u0010\u0015\u0007,$\u001a)\u001c.\f\"0\u001b#\u0003.\u0010\u0015\u0007\b)$\u0006㘽", (byte) (View.getDefaultSize(0, 0) + 116), objArr4);
                try {
                    Object[] objArr5 = {((String) objArr4[0]).intern()};
                    Object[] objArr6 = new Object[1];
                    k((-16777178) - Color.rgb(0, 0, 0), "\u001b\u0019\n\u0019\u0015\u001e\u0014\u0017\u0012\u001f*\u0010!\u0014\u001f\u0015!\u001c\u000e\u001d\u0018,㗋㗋 \u0000,\u0003\u0000%*\u0010-\u0018\u0015\u000e\u001a\n", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 33), objArr6);
                    objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                    Object[] objArr7 = new Object[1];
                    k(((byte) KeyEvent.getModifierMetaStateMask()) + 32, "%#\u0006+\f\"0\u001b#\u0003.\u0010\u0015\u0007\b)\u001b#\u0011)\u0002*\u0013\u000f\u0001*)\u0017'!㘜", (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31), objArr7);
                    try {
                        Object[] objArr8 = {((String) objArr7[0]).intern()};
                        Object[] objArr9 = new Object[1];
                        k((ViewConfiguration.getTouchSlop() >> 8) + 38, "\u001b\u0019\n\u0019\u0015\u001e\u0014\u0017\u0012\u001f*\u0010!\u0014\u001f\u0015!\u001c\u000e\u001d\u0018,㗋㗋 \u0000,\u0003\u0000%*\u0010-\u0018\u0015\u000e\u001a\n", (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33), objArr9);
                        objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                        try {
                            Object[] objArr10 = new Object[1];
                            k(23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u001f-\u0002*\u0013\u000f\u0007#\u0012\u0013)\u001f\u0018)\u001c\u001d'\u000f)\u001f\u0015\u0018㘴", (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 70), objArr10);
                            Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                            Object[] objArr11 = new Object[1];
                            k((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, "0\u0015\u001c)\u001f\u0018&\u00190\u0015-\u0019-\u001f0\u0015㙞", (byte) (Color.rgb(0, 0, 0) + 16777334), objArr11);
                            Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                            try {
                                Object[] objArr12 = new Object[1];
                                k(23 - TextUtils.getTrimmedLength(""), "\u001f-\u0002*\u0013\u000f\u0007#\u0012\u0013)\u001f\u0018)\u001c\u001d'\u000f)\u001f\u0015\u0018㘴", (byte) (ExpandableListView.getPackedPositionType(0L) + 70), objArr12);
                                Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                                char c2 = '0';
                                Object[] objArr13 = new Object[1];
                                k(AndroidCharacter.getMirror('0') - '\"', "0\u0015\u001c)\u001f\u0018&\u00190\u0015\u0016\u0019\u001a\u0015", (byte) (4 - View.combineMeasuredStates(0, 0)), objArr13);
                                try {
                                    Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                    Object[] objArr15 = new Object[1];
                                    k(KeyEvent.getDeadChar(0, 0) + 33, "\u001f-\u0002*\u0013\u000f\u0007#\u0012\u0013)\u001f\u0018)\u001c\u001d\u000b\u0015#*\u001f\u0018&\u00190\u0015-\u0019-\u001f0\u0015㘡", (byte) (57 - Color.red(0)), objArr15);
                                    Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                    Object[] objArr16 = new Object[1];
                                    l("ꋌꊫ\uefecឯ\uf4b5ҍ庐뚲䈵콲\u243a韻掛꺜䖀\uf75c͢踮", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr16);
                                    Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                    Object[] objArr17 = new Object[1];
                                    k(TextUtils.indexOf((CharSequence) "", '0', 0) + 31, "\u001f-\u0002*\u0013\u000f\u0007#\u0012\u0013)\u001f\u0018)\u001c\u001d\u000b\u0015#*\u001f\u0018&\u00190\u0015\u001f$ \u0011", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13), objArr17);
                                    Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                    Object[] objArr18 = new Object[1];
                                    l("욻웈ジ죷ꁟ側돽寡♂ွ烎窅߮燒", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr18);
                                    Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                    int length = objArr19.length;
                                    int i9 = 0;
                                    while (i9 < length) {
                                        Object obj = objArr19[i9];
                                        Object[] objArr20 = new Object[1];
                                        k(5 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0000 ,\u0003㘚", (byte) (119 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr20);
                                        try {
                                            Object[] objArr21 = {((String) objArr20[0]).intern()};
                                            Object[] objArr22 = new Object[1];
                                            k(38 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)), "\u001b\u0019\n\u0019\u001e\u000e\u0018\u0014\u001e.\u0014\u001c\u000e!\u0014\u00180\u001e\u001d#\u00170\u001c\u0014\u001c\u0011\u0018\u001f)\"\u0003\u001a\u0014\u001f\u0010.㘤", (byte) ('q' - AndroidCharacter.getMirror(c2)), objArr22);
                                            Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                            Object[] objArr23 = new Object[1];
                                            l("Ⲛ⳽㔛쵘衩硑ᖜﶧ챬ᖕ壹\udcf7\uedc4瑭㥰", (-1) - MotionEvent.axisFromString(""), objArr23);
                                            Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                            try {
                                                Object[] objArr24 = new Object[1];
                                                k((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28, "\u001f-\u0002*\u0013\u000f\u0007#\u0012\u0013)\u001f\u0018)\u001c\u001d\u000b\u0015\"*\u0015\u0000-\u001f\u001c!0\u0017", (byte) (ExpandableListView.getPackedPositionGroup(j2) + 124), objArr24);
                                                Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                                Object[] objArr25 = new Object[1];
                                                l("酙鄭膦积涚鶔媶늽熵ꄴ봿鏎倛샘\udc9f", TextUtils.getOffsetBefore("", 0), objArr25);
                                                try {
                                                    Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                    j2 = 0;
                                                    Object[] objArr27 = new Object[1];
                                                    k('U' - AndroidCharacter.getMirror('0'), "\u001b\u0019\n\u0019\u001e\u000e\u0018\u0014\u001e.\u0014\u001c\u000e!\u0014\u00180\u001e\u001d#\u00170\u001c\u0014\u001c\u0011\u0018\u001f)\"\u0003\u001a\u0014\u001f\u0010.㘤", (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 64), objArr27);
                                                    Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                    Object[] objArr28 = new Object[1];
                                                    l("飴颓絠蔣뱷䱕闋緜砞巼泧岤妇㰐൹㰝㥕Ძ⸊ᾒ\u1af5\uffd1캾", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr28);
                                                    Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                    int length2 = objArr3.length;
                                                    for (int i10 = 0; i10 < 2; i10++) {
                                                        Object obj2 = objArr3[i10];
                                                        try {
                                                            Object[] objArr29 = new Object[1];
                                                            l("猙獳♭\ude2a\ue3b6ᎌ\ue2e5\u0af6鎯ۧ㌷⮌뉜朎劣䬳튨䟪燁梺\uf10bꓘ鄴衯ᇔ蔄냋꧌レ\ue5ee퀞캎块숍\uf7a1\uee1e瞭⊩", MotionEvent.axisFromString("") + 1, objArr29);
                                                            Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                            Object[] objArr30 = new Object[1];
                                                            k(23 - (ViewConfiguration.getJumpTapTimeout() >> 16), "0\u0015)\u0006!'\u001b\u0015\u0014\u001f\u0003.㗧㗧%*\u0011#\u0012\u000f\n\u0015㘳", (byte) (KeyEvent.getDeadChar(0, 0) + 61), objArr30);
                                                            if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                                int i11 = f22387h * (-106027145);
                                                                f22387h = i11;
                                                                int i12 = ~i11;
                                                                int i13 = ~((957126807 + i12) - (957126807 & i12));
                                                                int i14 = i3 + 1039261485 + ((((-967637240) + i13) - ((-967637240) & i13)) * (-712)) + (((~((i11 - 10510433) - (i11 & (-10510433)))) | (~(i12 | 967637239))) * (-712)) + (((278978785 + i13) - (278978785 & i13)) * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT) + 16;
                                                                int i15 = i14 ^ (i14 << 13);
                                                                int i16 = i15 ^ (i15 >>> 17);
                                                                return objArr31;
                                                            }
                                                        } catch (Throwable th) {
                                                            Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    i9++;
                                                    c2 = '0';
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
            }
            Object[] objArr32 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
            int i17 = f22388i * 327704258;
            f22388i = i17;
            int i18 = 681548603 + (((-1) - (((-1) - (~i17)) & ((-1) - (-676038438)))) * 1444);
            int i19 = ~((-1) - (((-1) - 139697005) & ((-1) - i17)));
            int i20 = i3 + ((i18 + (((-1) - (((-1) - (~((-1) - (((-1) - i17) & ((-1) - 538451016))))) & ((-1) - ((i19 - 677093230) - (i19 & (-677093230)))))) * (-1444))) - 1526520230);
            int i21 = i20 ^ (i20 << 13);
            int i22 = i21 ^ (i21 >>> 17);
            return objArr32;
        }

        static void init$0() {
            $$a = new byte[]{113, 10, 2, -109};
            $$b = 181;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void k(int r28, java.lang.String r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 987
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cg.j.e.k(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        private static void l(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 49;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            Object charArray = str2;
            if (str2 != null) {
                charArray = str2.toCharArray();
            }
            k kVar = new k();
            char[] cArrC = k.c(f22382a ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            int i6 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            while (true) {
                $10 = i6 % 128;
                int i7 = i6 % 2;
                if (kVar.f19939c >= cArrC.length) {
                    objArr[0] = new String(cArrC, 4, cArrC.length - 4);
                    return;
                }
                kVar.f19938a = kVar.f19939c - 4;
                int i8 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22382a)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(229 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (51004 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.lastIndexOf("", '0') + 10, 1749983833, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 7))), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA2 = o.d.d.a(676 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), View.resolveSizeAndState(0, 0, 0) + 12, 522683165, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    i6 = $11 + 93;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        public final o.ef.a b() {
            int i2 = 2 % 2;
            int i3 = f22389j + 107;
            f22386g = i3 % 128;
            int i4 = i3 % 2;
            o.ef.a aVar = this.f22390d;
            if (i4 != 0) {
                int i5 = 88 / 0;
            }
            return aVar;
        }

        public final byte[][] d() {
            int i2 = 2 % 2;
            int i3 = f22386g;
            int i4 = i3 + 89;
            f22389j = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            byte[][] bArr = this.f22391e;
            int i5 = i3 + 1;
            f22389j = i5 % 128;
            int i6 = i5 % 2;
            return bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, byte r10, short r11) {
        /*
            int r0 = r11 * 2
            int r8 = 4 - r0
            int r7 = r9 + 99
            int r1 = r10 * 2
            int r0 = 1 - r1
            byte[] r6 = o.cg.j.$$a
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L2c
            r1 = r8
            r2 = r4
        L15:
            int r0 = -r8
            int r7 = r7 + r0
            int r8 = r1 + 1
            r1 = r2
        L1a:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r6[r8]
            r1 = r8
            r8 = r0
            goto L15
        L2c:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.j.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22372f = 0;
        f22377k = 1;
        f22374h = 0;
        f22375i = 1;
        a();
        AudioTrack.getMinVolume();
        ViewConfiguration.getMinimumFlingVelocity();
        AudioTrack.getMaxVolume();
        int i2 = f22377k + 19;
        f22372f = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public j(String str, o.i.d dVar) throws Throwable {
        this.f22381d = str;
        this.f22380c = dVar.b();
        for (o.g.a aVar : dVar.c()) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                l((char) ((Process.myPid() >> 22) + 4806), ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                m((Process.myTid() >> 22) + 52, "\u0007\u0006\u0007\u0014￥\u0014\u0007\u0015\ufff7\u0016\u0007\u0015ￂￜￂ\u000f\u0011\u0014\bￂ\u0015\u000e\u0003\u000b\u0016\u0010\u0007\u0006\u0007\u0014\u0005ￂ\t\u0010\u000b\u0006\u0003\u0011\u000eￂￏￂ\u0007\u0006\u0011\ufff0\u0015\u000e\u0003\u000b\u0016\u0010", true, ImageFormat.getBitsPerPixel(0) + 273, 12 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVar.b()).toString());
            }
            e(aVar);
        }
    }

    static void a() {
        f22371e = new char[]{34401, 52110, 7619, 28445, 45395, 683, 21735, 42543, 59417, 14923, 36762, 53758, 9017, 30061, 50873, 38022, 55618, 3856, 32204, 49625, 35844, 23134, 10379, 63225, 17723, 4986, 57774, 44947, 32200, 51222, 38514, 25787, 13027, 33046, 20254, 7516, 60309, 47615, 1057, 53858};
        f22373g = 1551718214315399483L;
        f22376j = -1270219351;
    }

    private void e(o.g.a aVar) {
        int i2 = 2 % 2;
        int i3 = f22374h + 31;
        f22375i = i3 % 128;
        if (i3 % 2 != 0 ? this.f22379b.size() == 10 : this.f22379b.size() == 20) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f22379b.add(aVar);
        int i4 = f22374h + 99;
        f22375i = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    static void init$0() {
        $$a = new byte[]{68, -108, -67, 58};
        $$b = 13;
    }

    private static void l(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $10 + 37;
            $11 = i6 % 128;
            if (i6 % i4 == 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f22371e[i2 >> i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(742 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    long jLongValue = ((Long) ((Method) objA).invoke(null, objArr2)).longValue();
                    long j2 = i7;
                    long j3 = f22373g;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c2);
                    objArr3[i4] = Long.valueOf(j3);
                    objArr3[1] = Long.valueOf(j2);
                    objArr3[0] = Long.valueOf(jLongValue);
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 765;
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12470);
                        int i9 = 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b4 = (byte) ($$b & 3);
                        byte b5 = (byte) (b4 - 1);
                        String str$$c = $$c(b4, b5, b5);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Long.TYPE;
                        clsArr[1] = Long.TYPE;
                        clsArr[i4] = Long.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA2 = o.d.d.a(i8, maximumDrawingCacheSize, i9, 1946853218, false, str$$c, clsArr);
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[i4];
                    objArr4[1] = oVar;
                    objArr4[0] = oVar;
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        int i10 = 388 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 18;
                        byte b6 = (byte) 0;
                        String str$$c2 = $$c((byte) ($$b >>> 1), b6, b6);
                        Class[] clsArr2 = new Class[i4];
                        clsArr2[0] = Object.class;
                        clsArr2[1] = Object.class;
                        objA3 = o.d.d.a(i10, packedPositionGroup, pressedStateDuration, 39570797, false, str$$c2, clsArr2);
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i11 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f22371e[i2 + i11])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 742, (char) TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 12, 632508977, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i11), Long.valueOf(f22373g), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    int iNormalizeMetaState = 766 - KeyEvent.normalizeMetaState(0);
                    char cGreen = (char) (Color.green(0) + 12470);
                    int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12;
                    byte b9 = (byte) ($$b & 3);
                    byte b10 = (byte) (b9 - 1);
                    objA5 = o.d.d.a(iNormalizeMetaState, cGreen, i12, 1946853218, false, $$c(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i11] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b11 = (byte) 0;
                    objA6 = o.d.d.a(TextUtils.getTrimmedLength("") + 387, (char) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 19, 39570797, false, $$c((byte) ($$b >>> 1), b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i13 = $11 + 41;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                objA7 = o.d.d.a(387 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 18 - ExpandableListView.getPackedPositionGroup(0L), 39570797, false, $$c((byte) ($$b >>> 1), b12, b12), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
            int i15 = $10 + 93;
            $11 = i15 % 128;
            int i16 = i15 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static void m(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f22376j)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(270 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, -2071844881, false, $$c((byte) ($$b + 3), b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(522 - TextUtils.indexOf("", ""), (char) Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 13, 627984172, false, $$c((byte) ($$b + 1), b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i9 = $11 + 13;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (!(!z2)) {
            int i11 = $11 + 73;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.VT, (char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, 627984172, false, $$c((byte) ($$b + 1), b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final List<o.m.i> b() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<o.g.a> it = this.f22379b.iterator();
        while (it.hasNext()) {
            int i3 = f22375i + 1;
            f22374h = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(it.next().b());
        }
        int i5 = f22375i + 53;
        f22374h = i5 % 128;
        int i6 = i5 % 2;
        return arrayList;
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f22374h + 5;
        f22375i = i3 % 128;
        int i4 = i3 % 2;
        Iterator<o.g.a> it = this.f22379b.iterator();
        while (it.hasNext()) {
            int i5 = f22375i + 75;
            f22374h = i5 % 128;
            int i6 = i5 % 2;
            byte[] bArrD = it.next().d();
            if (bArrD != null) {
                int i7 = f22374h + 19;
                f22375i = i7 % 128;
                int i8 = i7 % 2;
                Arrays.fill(bArrD, (byte) 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.cg.j.e e(int r24) throws o.ef.b {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.j.e(int):o.cg.j$e");
    }
}
