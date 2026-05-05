package o.ap;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.g;
import o.a.l;
import o.a.q;
import o.es.b;

/* JADX INFO: loaded from: classes6.dex */
public final class h<T extends o.es.b> implements o.ap.b<b, e> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f20522a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f20523c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f20524d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f20525e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int[] f20526f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f20527g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f20528h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f20529i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f20530j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f20531b;

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20544b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f20545c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20546a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f20547e;

        public b(String str, String str2) {
            this.f20546a = str;
            this.f20547e = str2;
        }

        public final String b() {
            int i2 = 2 % 2;
            int i3 = f20545c;
            int i4 = i3 + 93;
            f20544b = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.f20546a;
            int i5 = i3 + 81;
            f20544b = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String c() {
            String str;
            int i2 = 2 % 2;
            int i3 = f20544b;
            int i4 = (((i3 + 17) - (17 & i3)) << 1) - (i3 ^ 17);
            f20545c = i4 % 128;
            if (i4 % 2 == 0) {
                str = this.f20547e;
                int i5 = 58 / 0;
            } else {
                str = this.f20547e;
            }
            int i6 = i3 + 123;
            f20545c = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static long f20548c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int[] f20549e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f20550f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f20551g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f20552h = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20553j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20555b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f20556d;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r8, byte r9, short r10) {
            /*
                int r8 = 121 - r8
                byte[] r7 = o.ap.h.e.$$a
                int r0 = r9 * 4
                int r6 = 1 - r0
                int r0 = r10 * 2
                int r5 = r0 + 4
                byte[] r4 = new byte[r6]
                r3 = 0
                if (r7 != 0) goto L28
                r8 = r6
                r0 = r5
                r2 = r3
            L14:
                int r5 = r5 + 1
                int r8 = r8 + r0
                r1 = r2
            L18:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r4[r1] = r0
                if (r2 != r6) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                r0 = r7[r5]
                goto L14
            L28:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ap.h.e.$$c(int, byte, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20551g = -121658745;
            f20550f = -117433992;
            f20552h = 0;
            f20553j = 1;
            f20549e = new int[]{-1413322795, 1392740788, 328952803, 737625690, 1664825384, 392849930, 550992673, 982841304, 1821317204, -1250572088, 1196743262, -1758867525, -1427691154, -1927824926, -631817887, -17442177, 1802648555, 719878836};
            f20548c = -2409009534124227564L;
        }

        public e(String str, String str2, String str3) {
            this.f20556d = str;
            this.f20555b = str2;
            this.f20554a = str3;
        }

        public static Object[] e(Context context, int i2, int i3) {
            int i4 = 4;
            if (context == null) {
                Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
                int i5 = f20550f * 485333470;
                f20550f = i5;
                int i6 = ~i5;
                int i7 = (-340236613) + (((392378289 + i5) - (392378289 & i5)) * 614) + (((~((-1) - (((-1) - (-149378068)) & ((-1) - i6)))) | 6493201 | (~((528769954 + i6) - (528769954 & i6)))) * (-1228));
                int i8 = ~(((-142884867) + i6) - ((-142884867) & i6));
                int i9 = ~((i6 + 535263155) - (i6 & 535263155));
                int i10 = i3 + i7 + (((i9 + i8) - (i9 & i8)) * 614);
                int i11 = i10 ^ (i10 << 13);
                int i12 = i11 ^ (i11 >>> 17);
                return objArr;
            }
            try {
                Object[] objArr2 = new Object[1];
                i(new int[]{524860629, -1349021883, 1033132428, 802911559, -106202917, 625972637, -38516949, 1020196468, -837780901, -447905933, 154956943, 867589244, -181423079, -1809599575, 1273579590, -825665189, -528658366, -498406746, 2076263820, -2015494967}, TextUtils.indexOf("", "") + 38, objArr2);
                Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
                Object[] objArr4 = new Object[1];
                i(new int[]{534810252, 971707730, -1534108382, -1716141744, -1222388960, -1869331145, -991639458, 1109294122, -52782724, 1636411637, -1534108382, -1716141744, -1694485059, 315184863, -38347338, 273214476}, 31 - Gravity.getAbsoluteGravity(0, 0), objArr4);
                try {
                    Object[] objArr5 = {((String) objArr4[0]).intern()};
                    Object[] objArr6 = new Object[1];
                    i(new int[]{524860629, -1349021883, 1033132428, 802911559, -106202917, 625972637, -38516949, 1020196468, -837780901, -447905933, 154956943, 867589244, -181423079, -1809599575, 1273579590, -825665189, -528658366, -498406746, 2076263820, -2015494967}, Color.red(0) + 38, objArr6);
                    objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                    Object[] objArr7 = new Object[1];
                    k("घ궇䃌\ue7ab髳ㅱ퐠謽⸽싖秣Ჟ뎾噒ഹꀷ䜅ﮗ黈㖆\ue8ab轜≢\ud905簧ႂ럅檅ƥꑓ孢", 42209 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr7);
                    try {
                        Object[] objArr8 = {((String) objArr7[0]).intern()};
                        Object[] objArr9 = new Object[1];
                        i(new int[]{524860629, -1349021883, 1033132428, 802911559, -106202917, 625972637, -38516949, 1020196468, -837780901, -447905933, 154956943, 867589244, -181423079, -1809599575, 1273579590, -825665189, -528658366, -498406746, 2076263820, -2015494967}, 38 - View.MeasureSpec.getSize(0), objArr9);
                        objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                        try {
                            Object[] objArr10 = new Object[1];
                            i(new int[]{198748052, -1842128198, -863285716, 896744120, 1279445911, 1612841957, 209163409, 508097460, 239390651, -2141771188, 24033245, -1315263743}, 23 - ((Process.getThreadPriority(0) + 20) >> 6), objArr10);
                            Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                            Object[] objArr11 = new Object[1];
                            i(new int[]{480087571, -1649070732, 1331525186, 1436510870, -401220715, -656378779, 1296210994, 1498917588, -2073566761, 306766088}, 17 - Drawable.resolveOpacity(0, 0), objArr11);
                            Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                            try {
                                Object[] objArr12 = new Object[1];
                                i(new int[]{198748052, -1842128198, -863285716, 896744120, 1279445911, 1612841957, 209163409, 508097460, 239390651, -2141771188, 24033245, -1315263743}, 23 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr12);
                                Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                                Object[] objArr13 = new Object[1];
                                k("़ⲳ䈵禬鼎당\ue87e\u0fe1╔壋纗鐵쮪\ue117", 9613 - View.resolveSize(0, 0), objArr13);
                                try {
                                    Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                    Object[] objArr15 = new Object[1];
                                    i(new int[]{198748052, -1842128198, -863285716, 896744120, 1279445911, 1612841957, 209163409, 508097460, -1121488441, -1484370697, 1331525186, 1436510870, -401220715, -656378779, 1296210994, 1498917588, -2073566761, 306766088}, 34 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr15);
                                    Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                    Object[] objArr16 = new Object[1];
                                    i(new int[]{480087571, -1649070732, 1331525186, 1436510870, 1066482678, 1310869674, 538395909, -189489879}, ImageFormat.getBitsPerPixel(0) + 15, objArr16);
                                    Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                    Object[] objArr17 = new Object[1];
                                    i(new int[]{198748052, -1842128198, -863285716, 896744120, 1279445911, 1612841957, 209163409, 508097460, -1121488441, -1484370697, 1331525186, 1436510870, 1066482678, 1310869674, 538395909, -189489879}, 29 - Process.getGidForName(""), objArr17);
                                    Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                    Object[] objArr18 = new Object[1];
                                    k("न敏\uefda퍬쓶점붜ꄌ銦蘣", 62323 - Color.blue(0), objArr18);
                                    Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                    int length = objArr19.length;
                                    int i13 = 0;
                                    while (i13 < length) {
                                        Object obj = objArr19[i13];
                                        Object[] objArr20 = new Object[1];
                                        i(new int[]{-961023909, 1047981984, 1571438195, -1636035937}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, objArr20);
                                        try {
                                            Object[] objArr21 = {((String) objArr20[0]).intern()};
                                            Object[] objArr22 = new Object[1];
                                            i(new int[]{524860629, -1349021883, -1781722399, 531275476, 1971372430, 2049848148, 1157222822, 977220587, -1701125161, -1356645914, -465838376, 1373795396, -1249152786, 1689839671, 1554894843, 1000706089, -2021684743, 769194431, -350789302, 1678774258}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37, objArr22);
                                            Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                            Object[] objArr23 = new Object[1];
                                            k("़ቛ㿥嬽撡臑굱뛹툝ﾵᣌ", 7013 - KeyEvent.getDeadChar(0, 0), objArr23);
                                            Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                            try {
                                                Object[] objArr24 = new Object[1];
                                                i(new int[]{198748052, -1842128198, -863285716, 896744120, 1279445911, 1612841957, 209163409, 508097460, 356291769, -82835290, 529869640, -510673539, -826186870, -2109875662}, 'L' - AndroidCharacter.getMirror('0'), objArr24);
                                                Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                                Object[] objArr25 = new Object[1];
                                                k("य\udb4d귫繉䃋ᕣ\ue7cc졦髡潻㆘", 53881 - KeyEvent.getDeadChar(0, 0), objArr25);
                                                try {
                                                    Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                    Object[] objArr27 = new Object[1];
                                                    i(new int[]{524860629, -1349021883, -1781722399, 531275476, 1971372430, 2049848148, 1157222822, 977220587, -1701125161, -1356645914, -465838376, 1373795396, -1249152786, 1689839671, 1554894843, 1000706089, -2021684743, 769194431, -350789302, 1678774258}, 36 - TextUtils.lastIndexOf("", '0', 0), objArr27);
                                                    Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                    Object[] objArr28 = new Object[1];
                                                    k("़拑\udeeb䫳ꚕኑ躵覆噠쉙㹿ꩪ؆爞\uee20娹럊⏰鿰", TextUtils.getOffsetAfter("", 0) + 27631, objArr28);
                                                    Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                    int length2 = objArr3.length;
                                                    for (int i14 = 0; i14 < 2; i14++) {
                                                        Object obj2 = objArr3[i14];
                                                        try {
                                                            Object[] objArr29 = new Object[1];
                                                            k("ऱⲑ䉻砻鿙땿\ueb3cຕ⑶娪熜靶촦\ue0da٢㰻厙襴꽳슲\uf832Ṭ㗐歅脶꒚\uda71\uf03bញ䵭挲蚏뱏툵", 9643 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr29);
                                                            Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                            Object[] objArr30 = new Object[1];
                                                            k("़먁潑Ⴕ엒褂㩋\uef87郀䐘ॵ뫛澟ፘ쑹覘㫂\uee1a鍖䒟ে봑湝", TextUtils.lastIndexOf("", '0', 0) + 45888, objArr30);
                                                            if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                                int i15 = f20551g * (-1870421517);
                                                                f20551g = i15;
                                                                int i16 = ~i15;
                                                                int i17 = ~((-233857747) | i16);
                                                                int i18 = i3 + 565596381 + (((-1) - (((-1) - i15) & ((-1) - (-233857747)))) * 140) + (((i17 + 72352384) - (i17 & 72352384)) * (-280)) + (((-1) - (((-1) - (~((-1) - (((-1) - i15) & ((-1) - (-72352385)))))) & ((-1) - ((~((912005768 + i16) - (912005768 & i16))) | (-1073511131))))) * 140) + 16;
                                                                int i19 = i18 ^ (i18 << 13);
                                                                int i20 = i19 ^ (i19 >>> 17);
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
                                                    i13++;
                                                    i4 = 4;
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
                i4 = 4;
            }
            Object[] objArr32 = new Object[i4];
            objArr32[0] = new int[1];
            objArr32[1] = new int[]{i2};
            objArr32[3] = new int[]{i2};
            objArr32[2] = null;
            int iNextInt = new Random().nextInt();
            int i21 = ~iNextInt;
            int i22 = i3 + (-112585413) + (((-1) - (((-1) - (~((-1) - (((-1) - (-484469042)) & ((-1) - i21))))) & ((-1) - (~((-1) - (((-1) - (-193678981)) & ((-1) - iNextInt))))))) * Mp4VideoDirectory.TAG_COMPRESSION_TYPE) + (((-1) - (((-1) - (~(iNextInt | (-341844274)))) & ((-1) - (~(i21 | (-51054213)))))) * Mp4VideoDirectory.TAG_COMPRESSION_TYPE);
            int i23 = i22 ^ (i22 << 13);
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr32[0])[0] = i24 ^ (i24 << 5);
            return objArr32;
        }

        private static void i(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f20549e;
            int i4 = 989264422;
            char c2 = 3;
            int i5 = 0;
            if (iArr2 != null) {
                int i6 = $10 + 105;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objA = o.d.d.a(i4);
                        if (objA == null) {
                            int mode = View.MeasureSpec.getMode(0) + 675;
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int threadPriority = 12 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte b2 = (byte) ($$a[c2] + 1);
                            byte b3 = b2;
                            objA = o.d.d.a(mode, cNormalizeMetaState, threadPriority, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i8++;
                        i4 = 989264422;
                        c2 = 3;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f20549e;
            char c3 = '0';
            if (iArr5 != null) {
                int i9 = $11 + 21;
                int i10 = i9 % 128;
                $10 = i10;
                int i11 = i9 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = i10 + 115;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 0;
                while (i14 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i14])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        int mirror = AndroidCharacter.getMirror(c3) + 627;
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i5, i5) + 13;
                        byte b4 = (byte) ($$a[3] + 1);
                        byte b5 = b4;
                        objA2 = o.d.d.a(mirror, fadingEdgeLength, iIndexOf, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i14] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i14++;
                    c3 = '0';
                    i5 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i5, iArr4, i5, length2);
            lVar.f19941d = i5;
            while (lVar.f19941d < iArr.length) {
                cArr[i5] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i15 = 0;
                for (int i16 = 16; i15 < i16; i16 = 16) {
                    int i17 = $10 + 35;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        lVar.f19942e ^= iArr4[i15];
                        Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                        Object objA3 = o.d.d.a(2098218801);
                        if (objA3 == null) {
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 301;
                            char mode2 = (char) (52697 - View.MeasureSpec.getMode(0));
                            int defaultSize = View.getDefaultSize(0, 0) + 11;
                            byte b6 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 3)));
                            byte b7 = (byte) (b6 - 2);
                            objA3 = o.d.d.a(scrollDefaultDelay, mode2, defaultSize, -1416256172, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue;
                        i15 += 88;
                    } else {
                        lVar.f19942e ^= iArr4[i15];
                        Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                        Object objA4 = o.d.d.a(2098218801);
                        if (objA4 == null) {
                            int jumpTapTimeout = 301 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 52697);
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 11;
                            int i18 = $$b;
                            byte b8 = (byte) ((i18 + 3) - (i18 | 3));
                            byte b9 = (byte) (b8 - 2);
                            objA4 = o.d.d.a(jumpTapTimeout, scrollDefaultDelay2, packedPositionGroup, -1416256172, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue2;
                        i15++;
                    }
                }
                int i19 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i19;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i20 = lVar.f19942e;
                int i21 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr6 = {lVar, lVar};
                Object objA5 = o.d.d.a(986820978);
                if (objA5 == null) {
                    int keyRepeatDelay = 229 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 51004);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 10;
                    byte length4 = (byte) $$a.length;
                    byte b10 = (byte) (length4 - 4);
                    objA5 = o.d.d.a(keyRepeatDelay, jumpTapTimeout2, iLastIndexOf, -330018025, false, $$c(length4, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                i5 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        static void init$0() {
            $$a = new byte[]{Base64.padSymbol, 59, -113, -1};
            $$b = 62;
        }

        private static void k(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i4 = $11 + 35;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = qVar.f19948a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                        Object objA = o.d.d.a(-1011865131);
                        if (objA == null) {
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 731;
                            char cAlpha = (char) (7933 - Color.alpha(0));
                            int maxKeyCode = 11 - (KeyEvent.getMaxKeyCode() >> 16);
                            byte b2 = (byte) ($$b & 243);
                            byte b3 = (byte) ($$a[3] + 1);
                            objA = o.d.d.a(keyRepeatDelay, cAlpha, maxKeyCode, 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() * (f20548c & 4743694005979712847L);
                        Object[] objArr3 = {qVar, qVar};
                        Object objA2 = o.d.d.a(1452497747);
                        if (objA2 == null) {
                            int i6 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 837;
                            char offsetAfter = (char) (27279 - TextUtils.getOffsetAfter("", 0));
                            int iLastIndexOf = 10 - TextUtils.lastIndexOf("", '0', 0);
                            byte b4 = (byte) ($$a[3] + 1);
                            objA2 = o.d.d.a(i6, offsetAfter, iLastIndexOf, -2145994442, false, $$c((byte) 43, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i7 = qVar.f19948a;
                    Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA3 = o.d.d.a(-1011865131);
                    if (objA3 == null) {
                        int i8 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 730;
                        char cMyPid = (char) ((Process.myPid() >> 22) + 7933);
                        int mirror = ';' - AndroidCharacter.getMirror('0');
                        int i9 = $$b;
                        byte b5 = (byte) ($$a[3] + 1);
                        objA3 = o.d.d.a(i8, cMyPid, mirror, 355847088, false, $$c((byte) ((i9 + 243) - (i9 | 243)), b5, b5), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f20548c ^ 4743694005979712847L);
                    Object[] objArr5 = {qVar, qVar};
                    Object objA4 = o.d.d.a(1452497747);
                    if (objA4 == null) {
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 837;
                        char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 27279);
                        int i10 = 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b6 = (byte) ($$a[3] + 1);
                        objA4 = o.d.d.a(packedPositionChild, packedPositionGroup, i10, -2145994442, false, $$c((byte) 43, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr6 = {qVar, qVar};
                Object objA5 = o.d.d.a(1452497747);
                if (objA5 == null) {
                    int packedPositionGroup2 = 836 - ExpandableListView.getPackedPositionGroup(0L);
                    char packedPositionGroup3 = (char) (27279 - ExpandableListView.getPackedPositionGroup(0L));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 11;
                    byte b7 = (byte) ($$a[3] + 1);
                    objA5 = o.d.d.a(packedPositionGroup2, packedPositionGroup3, longPressTimeout, -2145994442, false, $$c((byte) 43, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                int i11 = $11 + 29;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        public final String a() {
            int i2 = 2 % 2;
            int i3 = f20553j;
            int i4 = i3 + 65;
            f20552h = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f20555b;
            int i6 = i3 + 61;
            f20552h = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String d() {
            int i2 = 2 % 2;
            int i3 = f20553j + 123;
            int i4 = i3 % 128;
            f20552h = i4;
            int i5 = i3 % 2;
            String str = this.f20554a;
            int i6 = i4 + 79;
            f20553j = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f20553j + 109;
            int i4 = i3 % 128;
            f20552h = i4;
            int i5 = i3 % 2;
            String str = this.f20556d;
            int i6 = i4 + 15;
            f20553j = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 27 / 0;
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, short r10) {
        /*
            int r8 = 121 - r8
            int r7 = r9 * 4
            int r1 = r7 + 1
            byte[] r6 = o.ap.h.$$a
            int r0 = r10 * 2
            int r0 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L29
            r8 = r7
            r1 = r0
            r3 = r4
        L14:
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L17:
            byte r1 = (byte) r8
            r5[r2] = r1
            int r1 = r0 + 1
            int r3 = r2 + 1
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r6[r1]
            goto L14
        L29:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ap.h.$$c(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20528h = 0;
        f20530j = 1;
        f20529i = 0;
        f20527g = 1;
        b();
        TextUtils.lastIndexOf("", '0', 0, 0);
        int i2 = f20528h + 35;
        f20530j = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public h(T t2) {
        this.f20531b = t2;
    }

    private static e b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20529i + 21;
        f20527g = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f20529i + 11;
            f20527g = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            k("㭧ℒ궪뢄⣖\uddca妉\ude77\ue1b5힄\uea84糩늳꒯Ü锯衊敔菬⡻磏뮏冧㼹", 23 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k("碁\ud81e⹓覽復䆅쏭濊↖ꍒ笭朙អ浔", (ViewConfiguration.getScrollBarSize() >> 8) + 13, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        k("\uf4fb䎙궪뢄⣖\uddca妉\ude77\ue1b5힄챔\uf659\uf7d8杹砕驅ꥹ헸䵎ٵ츖\ue4ebㄡ⤯냐쇁ԉ݊\ue22d領좍ᇎ", View.MeasureSpec.getSize(0) + 31, objArr3);
        Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
        int i7 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i7;
        String str = (String) o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i7, Thread.currentThread().getPriority());
        Object[] objArr5 = new Object[1];
        l(new int[]{1689827307, -994903686, 1311988310, -1988768400, 339532689, 1853504866, -732842058, 754786620, 436213696, -615682935, 1835822481, -1584155349}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, objArr5);
        Object[] objArr6 = {aVar, ((String) objArr5[0]).intern()};
        int i8 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i8;
        String str2 = (String) o.ef.a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority());
        if (o.ea.f.a()) {
            Object[] objArr7 = new Object[1];
            k("㭧ℒ궪뢄⣖\uddca妉\ude77\ue1b5힄\uea84糩늳꒯Ü锯衊敔菬⡻磏뮏冧㼹", Color.green(0) + 24, objArr7);
            String strIntern2 = ((String) objArr7[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr8 = new Object[1];
            k("碁\ud81e⹓覽復䆅쏭濊↖ꍒ笭朙ἣ䑅뒻샯풊\ud937\uf7d8杹砕驅ꥹ헸䵎ٵ츖\ue4ebㄡ⤯냐쇁ԉ݊\ue22d領ꛁ⫐≓뎨", 40 - (ViewConfiguration.getTapTimeout() >> 16), objArr8);
            StringBuilder sbAppend = sb.append(((String) objArr8[0]).intern()).append(str);
            Object[] objArr9 = new Object[1];
            k("쀱浛竲蠈넘\ue273譫멕奨\ue171랗私轵焚\ud842炒Ʃ躢샄o", Drawable.resolveOpacity(0, 0) + 19, objArr9);
            o.ea.f.c(strIntern2, sbAppend.append(((String) objArr9[0]).intern()).append(str2).toString());
        }
        Object[] objArr10 = new Object[1];
        k("\ue346\udcde칊㋂䔒㙋ᕽ腙", TextUtils.lastIndexOf("", '0', 0) + 8, objArr10);
        return new e(str, str2, ((String) objArr10[0]).intern());
    }

    static void b() {
        f20522a = (char) 10132;
        f20524d = (char) 33031;
        f20525e = (char) 52586;
        f20523c = (char) 57293;
        f20526f = new int[]{-467964199, 1884524547, -1812014391, -2018220502, 1960142022, -2102198268, -1737325805, 1212483801, 1864799358, 949362473, 2058064251, 656414775, 820019086, 1198267700, -670865008, -1947464594, -1231894353, -1122043458};
    }

    static void init$0() {
        $$a = new byte[]{8, -110, 120, 122};
        $$b = 20;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 123;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i6 = $11 + 67;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i8 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i8] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i9 = 58224;
            int i10 = i8;
            while (i10 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i8];
                int i11 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f20525e) ^ (-7511683281764982996L))));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f20523c);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i8] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 271;
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iMyPid = 11 - (Process.myPid() >> 22);
                        int i13 = $$b;
                        byte b2 = (byte) i8;
                        String str$$c = $$c((byte) ((i13 + 32) - (i13 & 32)), b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i8] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(packedPositionChild, scrollDefaultDelay, iMyPid, -1995022631, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i8]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f20522a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20524d)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        int keyRepeatTimeout = 270 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        char c4 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10;
                        int i15 = $$b;
                        byte b3 = (byte) ((i15 + 32) - (i15 & 32));
                        byte b4 = (byte) 0;
                        objA2 = o.d.d.a(keyRepeatTimeout, c4, i14, -1995022631, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i8 = 0;
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
                byte b5 = (byte) 0;
                objA3 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 270, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, -2074123590, false, $$c((byte) 49, b5, b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i8 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f20526f;
        float f2 = 0.0f;
        int i5 = 989264422;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 115;
                $11 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(675 - (Process.myPid() >> 22), (char) (1 - (AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1))), 12 - Color.argb(0, 0, 0, 0), -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i9++;
                    i3 = 2;
                    f2 = 0.0f;
                    i5 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f20526f;
        char c2 = '0';
        int i12 = 16;
        if (iArr5 != null) {
            int i13 = $11 + 105;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i15 = 0;
            while (i15 < length3) {
                int i16 = $11 + 37;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i15])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> i12) + 675;
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf("", c2));
                        int iIndexOf = 11 - TextUtils.indexOf("", c2, i6);
                        byte b4 = (byte) i6;
                        byte b5 = b4;
                        objA2 = o.d.d.a(pressedStateDuration, cIndexOf, iIndexOf, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i15] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i15])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 674, (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, -328001469, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i15] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i15++;
                }
                c2 = '0';
                i12 = 16;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        while (lVar.f19941d < iArr.length) {
            int i17 = $11 + 3;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i19 = 0;
            for (int i20 = 16; i19 < i20; i20 = 16) {
                lVar.f19942e ^= iArr4[i19];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 2;
                    byte b9 = (byte) (b8 - 2);
                    objA4 = o.d.d.a(301 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 52698), 11 - Gravity.getAbsoluteGravity(0, 0), -1416256172, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i19++;
            }
            int i21 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i21;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i22 = lVar.f19942e;
            int i23 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                int windowTouchSlop = 229 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 51005);
                int iBlue = 9 - Color.blue(0);
                byte length4 = (byte) $$a.length;
                byte b10 = (byte) (length4 - 4);
                objA5 = o.d.d.a(windowTouchSlop, cLastIndexOf, iBlue, -330018025, false, $$c(length4, b10, b10), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Override // o.ap.b
    public final /* synthetic */ e a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20527g + 1;
        f20529i = i3 % 128;
        int i4 = i3 % 2;
        e eVarB = b(aVar);
        int i5 = f20529i + 17;
        f20527g = i5 % 128;
        int i6 = i5 % 2;
        return eVarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        if (r2 != null) goto L20;
     */
    @Override // o.ap.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(o.ef.a r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ap.h.e(o.ef.a):void");
    }
}
