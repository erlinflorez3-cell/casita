package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Random;
import o.ap.e;
import o.ap.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    public static int f26992k = 0;

    /* JADX INFO: renamed from: l */
    public static int f26993l = 0;

    /* JADX INFO: renamed from: m */
    public static int f26994m = 0;

    /* JADX INFO: renamed from: o */
    public static int f26995o = 0;

    /* JADX INFO: renamed from: p */
    public static int f26996p = 0;

    /* JADX INFO: renamed from: q */
    public static int f26997q = 0;

    /* JADX INFO: renamed from: s */
    public static int f26998s = 0;

    /* JADX INFO: renamed from: u */
    private static int f26999u = 0;

    /* JADX INFO: renamed from: v */
    private static int f27000v = 0;

    /* JADX INFO: renamed from: w */
    private static long f27001w = 0;

    /* JADX INFO: renamed from: x */
    private static int f27002x = 0;

    /* JADX INFO: renamed from: y */
    private static int f27003y = 0;

    /* JADX INFO: renamed from: n */
    boolean f27004n;

    /* JADX INFO: renamed from: t */
    private final boolean f27005t;

    /* JADX INFO: renamed from: o.y.a$3 */
    final class AnonymousClass3 implements f.a<e.C0332e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: d */
        private static int f27006d = 0;

        /* JADX INFO: renamed from: e */
        private static char[] f27007e = null;

        /* JADX INFO: renamed from: g */
        private static boolean f27008g = false;

        /* JADX INFO: renamed from: h */
        private static int f27009h = 0;

        /* JADX INFO: renamed from: i */
        private static boolean f27010i = false;

        /* JADX INFO: renamed from: j */
        private static int f27011j = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Context f27012a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ o.en.b f27013b;

        /* JADX INFO: renamed from: o.y.a$3$1 */
        public class AnonymousClass1 implements OperationCallback<Void> {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static char f27015a = 0;

            /* JADX INFO: renamed from: c */
            private static char f27016c = 0;

            /* JADX INFO: renamed from: d */
            private static long f27017d = 0;

            /* JADX INFO: renamed from: e */
            private static char f27018e = 0;

            /* JADX INFO: renamed from: f */
            public static int f27019f = 0;

            /* JADX INFO: renamed from: g */
            private static int f27020g = 0;

            /* JADX INFO: renamed from: h */
            public static int f27021h = 0;

            /* JADX INFO: renamed from: i */
            private static int f27022i = 0;

            /* JADX INFO: renamed from: j */
            private static char f27023j = 0;

            /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:17:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(byte r8, int r9, int r10) {
                /*
                    byte[] r7 = o.y.a.AnonymousClass3.AnonymousClass1.$$a
                    int r6 = r9 + 69
                    int r5 = r8 * 3
                    int r1 = r5 + 1
                    int r0 = r10 * 2
                    int r4 = r0 + 4
                    byte[] r3 = new byte[r1]
                    r2 = 0
                    if (r7 != 0) goto L26
                    r0 = r5
                    r1 = r2
                L13:
                    int r6 = r6 + r0
                    int r4 = r4 + 1
                L16:
                    byte r0 = (byte) r6
                    r3[r1] = r0
                    if (r1 != r5) goto L21
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    return r0
                L21:
                    r0 = r7[r4]
                    int r1 = r1 + 1
                    goto L13
                L26:
                    r1 = r2
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.a.AnonymousClass3.AnonymousClass1.$$c(byte, int, int):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f27021h = 853991012;
                f27019f = 178318512;
                f27022i = 0;
                f27020g = 1;
                f27017d = -4526899827246189901L;
                f27016c = (char) 38281;
                f27018e = (char) 62251;
                f27015a = (char) 20824;
                f27023j = (char) 53925;
            }

            AnonymousClass1() {
            }

            private void a() {
                int i2 = 2 % 2;
                int i3 = f27020g + 23;
                f27022i = i3 % 128;
                int i4 = i3 % 2;
                if (a.e(a.this) != null) {
                    int i5 = f27020g + 21;
                    f27022i = i5 % 128;
                    int i6 = i5 % 2;
                    a.b(a.this).onProcessSuccess();
                }
                int i7 = f27022i + 89;
                f27020g = i7 % 128;
                int i8 = i7 % 2;
            }

            public static Object[] e(Context context, int i2, int i3) {
                if (context == null) {
                    Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
                    int i4 = f27019f * 1166025484;
                    f27019f = i4;
                    int i5 = ~i4;
                    int i6 = (-969392014) | i5;
                    int i7 = (291243991 + i5) - (291243991 & i5);
                    int i8 = 452963741 + (((~((i5 + 970964959) - (i5 & 970964959))) | (~(((-289671046) + i5) - ((-289671046) & i5)))) * (-184));
                    int i9 = ~i6;
                    int i10 = i3 + ((i8 + ((((679720968 + i9) - (679720968 & i9)) | (~i7)) * 184)) - 289422248);
                    int i11 = i10 ^ (i10 << 13);
                    int i12 = i11 ^ (i11 >>> 17);
                    return objArr;
                }
                try {
                    Object[] objArr2 = new Object[1];
                    k("뾖◼譈炾혀밷⇉蜾沗틠롄ᶾ茄楨캜됲ᦙ\ufff9敆쫡뀐ᘼﮚ慻웊곝ሓ\uf7f7嵐썑꣐ส\uf3b2夞㽷\ua4cfਹ\uef95", 39521 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
                    Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
                    long j2 = 0;
                    Object[] objArr4 = new Object[1];
                    k("뾿녩ꉷ錬蓾\uf5df\ue6ac\ud86e쥍㨫⭒᳑ෝ纁灳慎剠䌸뒧ꗼ階衯樂\uea3e\udb1d쳻㷮⺦‵ᅦȅ", ExpandableListView.getPackedPositionChild(0L) + 3804, objArr4);
                    try {
                        Object[] objArr5 = {((String) objArr4[0]).intern()};
                        Object[] objArr6 = new Object[1];
                        k("뾖◼譈炾혀밷⇉蜾沗틠롄ᶾ茄楨캜됲ᦙ\ufff9敆쫡뀐ᘼﮚ慻웊곝ሓ\uf7f7嵐썑꣐ส\uf3b2夞㽷\ua4cfਹ\uef95", 39521 - (Process.myPid() >> 22), objArr6);
                        objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                        Object[] objArr7 = new Object[1];
                        k("뾿쳌妳\ue688珤胲ඏ髦⟺듭섌东\udb09栱\uf566ɼ轢ᰜ\ua957㙥䊜쾟岍\ue9be皠莙ც鷆⫲런쐝", 29453 - ExpandableListView.getPackedPositionGroup(0L), objArr7);
                        try {
                            Object[] objArr8 = {((String) objArr7[0]).intern()};
                            Object[] objArr9 = new Object[1];
                            k("뾖◼譈炾혀밷⇉蜾沗틠롄ᶾ茄楨캜됲ᦙ\ufff9敆쫡뀐ᘼﮚ慻웊곝ሓ\uf7f7嵐썑꣐ส\uf3b2夞㽷\ua4cfਹ\uef95", View.combineMeasuredStates(0, 0) + 39521, objArr9);
                            objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                            try {
                                Object[] objArr10 = new Object[1];
                                k("뾝訳퓚Ὥ椗뎰﹞좵ኗ崺Ꟙ\uf263㰕ڿ兆鮽\ue5af〢竀䕻輍\ud9b1\u245e", 13729 - TextUtils.getOffsetAfter("", 0), objArr10);
                                Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                                Object[] objArr11 = new Object[1];
                                l("状\ud8b2蓝耒ᄎ哀岡傖状\ud8b2\u0eff≑픽띑状\ud8b2۠琉", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, objArr11);
                                Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                                try {
                                    Object[] objArr12 = new Object[1];
                                    k("뾝訳퓚Ὥ椗뎰﹞좵ኗ崺Ꟙ\uf263㰕ڿ兆鮽\ue5af〢竀䕻輍\ud9b1\u245e", (ViewConfiguration.getScrollBarSize() >> 8) + 13729, objArr12);
                                    Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                                    Object[] objArr13 = new Object[1];
                                    l("状\ud8b2蓝耒ᄎ哀岡傖状\ud8b2࿂譨껤燻", 14 - View.resolveSizeAndState(0, 0, 0), objArr13);
                                    try {
                                        Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                        Object[] objArr15 = new Object[1];
                                        l("糯蟁\uf611阏쾀ﵬ犦뚲믏쐬ାዿ\ueb33\uf4c0맜綊핒喁ꌳ羇ᄎ哀岡傖状\ud8b2\u0eff≑픽띑状\ud8b2۠琉", 32 - TextUtils.indexOf((CharSequence) "", '0'), objArr15);
                                        Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                        Object[] objArr16 = new Object[1];
                                        k("뾛亞嶆油箁઼ᦽ⢬㞣욦헳\ue4df\uf3ce苈", 61703 - TextUtils.indexOf("", ""), objArr16);
                                        Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                        Object[] objArr17 = new Object[1];
                                        l("糯蟁\uf611阏쾀ﵬ犦뚲믏쐬ାዿ\ueb33\uf4c0맜綊핒喁ꌳ羇ᄎ哀岡傖状\ud8b2撶超繹磯", 30 - (ViewConfiguration.getScrollBarSize() >> 8), objArr17);
                                        Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                        Object[] objArr18 = new Object[1];
                                        k("뾏泖ᤝ왛\uf291鿇䰛祛▁틔", Drawable.resolveOpacity(0, 0) + 54083, objArr18);
                                        for (Object obj : (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2)) {
                                            Object[] objArr19 = new Object[1];
                                            l("႔ႛ凇앳蔲崥", (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)) + 4, objArr19);
                                            try {
                                                Object[] objArr20 = {((String) objArr19[0]).intern()};
                                                Object[] objArr21 = new Object[1];
                                                k("뾖汔᠘쓆\uf0f6鵢䤯痠⇁춟祐ꘫ勩继⭡흞茞꿑寰ࡔ㐭\ue0f3賎뢚敂ᄴ㷵\ue9ae陴䉜渴᫊욿\uf361鼡䯵矁", 54217 - Color.red(0), objArr21);
                                                Class<?> cls5 = Class.forName(((String) objArr21[0]).intern());
                                                Object[] objArr22 = new Object[1];
                                                k("뾛\u218e莦旰쟎ꧼଂ\ued3c伪ㅐ鍿", 40471 - Drawable.resolveOpacity(0, 0), objArr22);
                                                Object objInvoke3 = cls5.getMethod(((String) objArr22[0]).intern(), String.class).invoke(null, objArr20);
                                                try {
                                                    Object[] objArr23 = new Object[1];
                                                    l("糯蟁\uf611阏쾀ﵬ犦뚲믏쐬ାዿ\ueb33\uf4c0맜綊핒喁퍭蒥\ud9d2花픽띑洽େ弿턋", View.combineMeasuredStates(0, 0) + 28, objArr23);
                                                    Class<?> cls6 = Class.forName(((String) objArr23[0]).intern());
                                                    Object[] objArr24 = new Object[1];
                                                    k("뾈\ue478ࡨ걄퀤琎頿㳣惖蓞⢫", 23531 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr24);
                                                    try {
                                                        Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr24[0]).intern(), null).invoke(obj, null))};
                                                        Object[] objArr26 = new Object[1];
                                                        k("뾖汔᠘쓆\uf0f6鵢䤯痠⇁춟祐ꘫ勩继⭡흞茞꿑寰ࡔ㐭\ue0f3賎뢚敂ᄴ㷵\ue9ae陴䉜渴᫊욿\uf361鼡䯵矁", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 54218, objArr26);
                                                        Class<?> cls7 = Class.forName(((String) objArr26[0]).intern());
                                                        Object[] objArr27 = new Object[1];
                                                        k("뾛牤⑨홮衺멬汦Ṳ큗艼둬晗ᡉ쩃ﱃ까恍ቅ쑓", 52733 - Color.argb(0, 0, 0, 0), objArr27);
                                                        Object objInvoke4 = cls7.getMethod(((String) objArr27[0]).intern(), InputStream.class).invoke(objInvoke3, objArr25);
                                                        int length = objArr3.length;
                                                        for (int i13 = 0; i13 < 2; i13++) {
                                                            Object obj2 = objArr3[i13];
                                                            try {
                                                                Object[] objArr28 = new Object[1];
                                                                l("虮迂\uf5e7緦칖帍\ue92f諧璂䠞\udcb5ޟ諪뚰灝靉༦㨳㰐漐凇앳耆盗ᥡ瘝伅ꅍ쿂\uf374䌴裫祕᧗", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33, objArr28);
                                                                Class<?> cls8 = Class.forName(((String) objArr28[0]).intern());
                                                                Object[] objArr29 = new Object[1];
                                                                l("状\ud8b2ﳮ壕㬧ठ\ue21e봃ि얹㝺籬䟴蒹\ue4e6ﭞ㻮浺㬍ᇍ⮚佧븟䉆", 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr29);
                                                                if (obj2.equals(cls8.getMethod(((String) objArr29[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                    Object[] objArr30 = {new int[1], new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                                    int iActiveCount = Thread.activeCount();
                                                                    int i14 = 2108735429 + (((-1) - (((-1) - (~((-9451523) | (~iActiveCount)))) & ((-1) - (~((-1) - (((-1) - 668696499) & ((-1) - iActiveCount))))))) * (-272)) + (((-1) - (((-1) - (~((-1) - (((-1) - (-10107028)) & ((-1) - iActiveCount))))) & ((-1) - 655505))) * (-272));
                                                                    int i15 = ~((-1) - (((-1) - iActiveCount) & ((-1) - 10107027)));
                                                                    int i16 = i3 + i14 + (((i15 + 668040994) - (i15 & 668040994)) * 272) + 16;
                                                                    int i17 = i16 ^ (i16 << 13);
                                                                    int i18 = i17 ^ (i17 >>> 17);
                                                                    ((int[]) objArr30[0])[0] = i18 ^ (i18 << 5);
                                                                    return objArr30;
                                                                }
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        j2 = 0;
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
                Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
                int i19 = f27021h * (-594051392);
                f27021h = i19;
                int i20 = 2007807508 + (((-1) - (((-1) - (~((-1) - (((-1) - (-682475521)) & ((-1) - i19))))) & ((-1) - (~((-4327499) | i19))))) * 69);
                int i21 = ~(((-1002291205) + i19) - ((-1002291205) & i19));
                int i22 = i3 + ((i20 + (((~((i19 - 324143183) - (i19 & (-324143183)))) | ((i21 + 319815684) - (i21 & 319815684))) * (-69))) - 737213771);
                int i23 = i22 ^ (i22 << 13);
                int i24 = i23 ^ (i23 >>> 17);
                return objArr31;
            }

            static void init$0() {
                $$a = new byte[]{90, -4, -67, Ascii.NAK};
                $$b = 12;
            }

            private static void k(String str, int i2, Object[] objArr) throws Throwable {
                Object charArray;
                String str2 = str;
                int i3 = 2 % 2;
                if (str2 != null) {
                    int i4 = $10 + 103;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    charArray = str2.toCharArray();
                } else {
                    charArray = str2;
                }
                char[] cArr = (char[]) charArray;
                o.a.q qVar = new o.a.q();
                qVar.f19949d = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                qVar.f19948a = 0;
                int i6 = $10 + 105;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                while (qVar.f19948a < cArr.length) {
                    int i8 = qVar.f19948a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                        Object objA = o.d.d.a(-1011865131);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 2);
                            objA = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 731, (char) (7934 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 11 - TextUtils.indexOf("", "", 0, 0), 355847088, false, $$c(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f27017d ^ 4743694005979712847L);
                        Object[] objArr3 = {qVar, qVar};
                        Object objA2 = o.d.d.a(1452497747);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + 836, (char) (27279 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.resolveSizeAndState(0, 0, 0) + 11, -2145994442, false, $$c(b4, (byte) (9 | b4), b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr2 = new char[length];
                qVar.f19948a = 0;
                while (qVar.f19948a < cArr.length) {
                    int i9 = $10 + 117;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                        Object[] objArr4 = {qVar, qVar};
                        Object objA3 = o.d.d.a(1452497747);
                        if (objA3 == null) {
                            byte b5 = (byte) 0;
                            objA3 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 837, (char) ((-16749937) - Color.rgb(0, 0, 0)), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2145994442, false, $$c(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 9))), b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                        throw null;
                    }
                    cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                    Object[] objArr5 = {qVar, qVar};
                    Object objA4 = o.d.d.a(1452497747);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        objA4 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 836, (char) (ExpandableListView.getPackedPositionGroup(0L) + 27279), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -2145994442, false, $$c(b6, (byte) (9 | b6), b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
            }

            private static void l(String str, int i2, Object[] objArr) throws Throwable {
                String str2 = str;
                int i3 = 2 % 2;
                Object obj = str2;
                if (str2 != null) {
                    char[] charArray = str2.toCharArray();
                    int i4 = $10 + 81;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    obj = charArray;
                }
                char[] cArr = (char[]) obj;
                o.a.g gVar = new o.a.g();
                char[] cArr2 = new char[cArr.length];
                gVar.f19924d = 0;
                char[] cArr3 = new char[2];
                while (gVar.f19924d < cArr.length) {
                    int i6 = $11 + 47;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr3[0] = cArr[gVar.f19924d];
                        cArr3[0] = cArr[gVar.f19924d % 0];
                    } else {
                        cArr3[0] = cArr[gVar.f19924d];
                        cArr3[1] = cArr[gVar.f19924d + 1];
                    }
                    int i7 = $10 + 35;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 58224;
                    for (int i10 = 0; i10 < 16; i10++) {
                        char c2 = cArr3[1];
                        char c3 = cArr3[0];
                        try {
                            Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i9) ^ ((c3 << 4) + ((char) (((long) f27015a) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f27023j)};
                            Object objA = o.d.d.a(1603517628);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a(270 - TextUtils.indexOf("", "", 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 12, -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f27016c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f27018e)};
                            Object objA2 = o.d.d.a(1603517628);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 270, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - View.getDefaultSize(0, 0), -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            i9 -= 40503;
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
                        byte b7 = (byte) (b6 + 3);
                        objA3 = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0'), (char) View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.getDeadChar(0, 0) + 11, -2074123590, false, $$c(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2, 0, i2);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                int i2 = 2 % 2;
                int i3 = f27022i + 33;
                f27020g = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    a.c(a.this);
                    obj.hashCode();
                    throw null;
                }
                if (a.c(a.this) != null) {
                    a.d(a.this).onError(new o.by.c(antelopError.getCode(), antelopError.getMessage()));
                }
                int i4 = f27022i + 69;
                f27020g = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public /* synthetic */ void onSuccess(Void r4) {
                int i2 = 2 % 2;
                int i3 = f27020g + 53;
                f27022i = i3 % 128;
                int i4 = i3 % 2;
                a();
                int i5 = f27022i + 35;
                f27020g = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r8, int r9, short r10) {
            /*
                byte[] r7 = o.y.a.AnonymousClass3.$$a
                int r6 = r8 + 4
                int r0 = r9 * 6
                int r0 = r0 + 67
                int r5 = r10 * 2
                int r1 = r5 + 1
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r7 != 0) goto L27
                r2 = r6
                r1 = r3
            L13:
                int r0 = -r0
                int r6 = r6 + r0
            L15:
                byte r0 = (byte) r6
                r4[r1] = r0
                int r2 = r2 + 1
                if (r1 != r5) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L22:
                int r1 = r1 + 1
                r0 = r7[r2]
                goto L13
            L27:
                r1 = r3
                r2 = r6
                r6 = r0
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.a.AnonymousClass3.$$c(short, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f27009h = 0;
            f27011j = 1;
            f27007e = new char[]{2116, 2081, 2104, 2093, 2122, 2106, 2088, 2138, 2108, 2107, 2127, 2090, 2087, 2123, 2094, 2113, 2105, 2102, 2083, 2091, 2175, 2144, 2086, 2120, 2068, 2112, 2140, 2137, 2084};
            f27006d = 2040400287;
            f27010i = true;
            f27008g = true;
        }

        AnonymousClass3(o.en.b bVar, Context context) {
            bVar = bVar;
            context = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(o.ap.e.C0332e r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 720
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.a.AnonymousClass3.e(o.ap.e$e):void");
        }

        private static void f(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            char[] cArr;
            String str3 = str;
            String str4 = str2;
            int i3 = 2 % 2;
            Object obj = null;
            Object obj2 = str4;
            if (str4 != null) {
                int i4 = $11 + 121;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    str4.getBytes("ISO-8859-1");
                    obj.hashCode();
                    throw null;
                }
                byte[] bytes = str4.getBytes("ISO-8859-1");
                int i5 = $11 + 17;
                $10 = i5 % 128;
                obj2 = bytes;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 3;
                    obj2 = bytes;
                }
            }
            byte[] bArr = (byte[]) obj2;
            Object charArray = str3;
            if (str3 != null) {
                int i7 = $11 + 47;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                charArray = str3.toCharArray();
            }
            char[] cArr2 = (char[]) charArray;
            o.a.f fVar = new o.a.f();
            char[] cArr3 = f27007e;
            char c2 = '0';
            int i9 = -1;
            int i10 = 0;
            if (cArr3 != null) {
                int i11 = $11 + 77;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i13 = 0;
                while (i13 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i13])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) i9;
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a(Color.argb(i10, i10, i10, i10) + 593, (char) (13180 - TextUtils.indexOf("", c2)), 11 - (ViewConfiguration.getTouchSlop() >> 8), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i13++;
                        c2 = '0';
                        i9 = -1;
                        i10 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i14 = $10 + 39;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 2 / 2;
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(f27006d)};
            Object objA2 = o.d.d.a(-1503702982);
            if (objA2 == null) {
                objA2 = o.d.d.a(31 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            if (f27008g) {
                int i16 = $11 + 77;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    fVar.f19923e = bArr.length;
                    cArr = new char[fVar.f19923e];
                    fVar.f19922a = 1;
                } else {
                    fVar.f19923e = bArr.length;
                    cArr = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                }
                while (fVar.f19922a < fVar.f19923e) {
                    cArr[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (-b4);
                        objA3 = o.d.d.a(459 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), Process.getGidForName("") + 12, -1923924106, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = 0;
            if (f27010i) {
                fVar.f19923e = cArr2.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    int i18 = $11 + 85;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr5[fVar.f19922a] = (char) (cArr3[cArr2[fVar.f19923e + fVar.f19922a] >>> i2] - iIntValue);
                        Object[] objArr5 = {fVar, fVar};
                        Object objA4 = o.d.d.a(1540807955);
                        if (objA4 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (-b6);
                            objA4 = o.d.d.a(458 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1923924106, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    } else {
                        cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                        Object[] objArr6 = {fVar, fVar};
                        Object objA5 = o.d.d.a(1540807955);
                        if (objA5 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (-b8);
                            objA5 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 458, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, -1923924106, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA5).invoke(null, objArr6);
                    }
                }
                objArr[0] = new String(cArr5);
                return;
            }
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            while (true) {
                fVar.f19922a = i17;
                if (fVar.f19922a >= fVar.f19923e) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i19 = $10 + 3;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i17 = fVar.f19922a + 1;
            }
        }

        static void init$0() {
            $$a = new byte[]{113, 60, -124, 107};
            $$b = 88;
        }

        @Override // o.ap.f.a
        public final void a(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            if (!(!o.ea.f.a())) {
                Object[] objArr = new Object[1];
                f((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u0094\u0083\u0093\u0093\u0089\u0092\u0086\u0091\u0090\u0084\u0083\u0087\u008c\u008c\u0081\u008f\u008e\u008d\u008c\u0087\u008b\u008a\u0084\u0089\u0088\u0083\u0084\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, "\u0083\u0084\u0087\u0093\u009d\u0089\u009c\u008a\u0084\u0089\u0088\u008d\u008c\u0087\u008b\u0082\u008f", objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            if (cVar.c() != o.bg.a.az) {
                if (a.g(a.this) != null) {
                    o.by.c cVarB = o.by.c.b(cVar);
                    Object[] objArr3 = {a.this};
                    int i3 = a.f26998s * (-723081141);
                    a.f26998s = i3;
                    int iNextInt = new Random().nextInt(565139963);
                    int iMyUid = Process.myUid();
                    int i4 = a.f26996p * (-1732862413);
                    a.f26996p = i4;
                    ((o.x.f) a.b(objArr3, -1405726115, iMyUid, i4, iNextInt, i3, 1405726117)).onError(cVarB);
                    return;
                }
                return;
            }
            int i5 = f27009h + 11;
            f27011j = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr4 = {a.this};
            int iActiveCount = Thread.activeCount();
            int i7 = a.f26995o * (-1595870100);
            a.f26995o = i7;
            if (((o.x.f) a.b(objArr4, -1644868891, Process.myTid(), Process.myPid(), i7, iActiveCount, 1644868891)) != null) {
                a.f(a.this).onAuthenticationDeclined();
                int i8 = f27009h + 97;
                f27011j = i8 % 128;
                int i9 = i8 % 2;
            }
        }

        @Override // o.ap.f.a
        public final /* synthetic */ void b(e.C0332e c0332e) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f27011j + 49;
            f27009h = i3 % 128;
            int i4 = i3 % 2;
            e(c0332e);
            if (i4 != 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: o.y.a$4 */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f27025a;

        /* JADX INFO: renamed from: b */
        private static int f27026b = 0;

        /* JADX INFO: renamed from: e */
        private static int f27027e = 1;

        static {
            int[] iArr = new int[e.C0332e.EnumC0333e.values().length];
            f27025a = iArr;
            try {
                iArr[e.C0332e.EnumC0333e.f20489a.ordinal()] = 1;
                int i2 = f27026b + 55;
                f27027e = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27025a[e.C0332e.EnumC0333e.f20490b.ordinal()] = 2;
                int i4 = f27026b + 5;
                f27027e = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r9, int r10, short r11) {
        /*
            int r0 = r11 * 7
            int r8 = 78 - r0
            byte[] r7 = o.y.a.$$d
            int r0 = r9 * 2
            int r6 = 1 - r0
            int r5 = r10 + 4
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L28
            r0 = r8
            r2 = r3
            r8 = r6
        L14:
            int r8 = r8 + r0
            r1 = r2
        L16:
            int r5 = r5 + 1
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
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.a.$$j(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26996p = 300221126;
        f26998s = 447908187;
        f26997q = -1616723254;
        f26992k = -237461276;
        f26994m = 1695618781;
        f26993l = -580324774;
        f26995o = -270762473;
        f27003y = 0;
        f27002x = 1;
        f27000v = 0;
        f26999u = 1;
        o();
        ExpandableListView.getPackedPositionForGroup(0);
        int i2 = f27002x + 79;
        f27003y = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(String str, o.ep.d dVar, boolean z2) {
        super(str, dVar);
        this.f27004n = false;
        this.f27005t = z2;
    }

    private static void B(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 43;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        o.a.q qVar = new o.a.q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        int i6 = $10 + 35;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (qVar.f19948a < cArr.length) {
            int i8 = $11 + 79;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(730 - TextUtils.lastIndexOf("", '0', 0), (char) (7932 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (Process.myTid() >> 22) + 11, 355847088, false, $$j(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i10] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f27001w ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(835 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((Process.myTid() >> 22) + 27279), TextUtils.indexOf("", "", 0, 0) + 11, -2145994442, false, $$j(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i11 = $10 + 103;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                objA3 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + 836, (char) (TextUtils.indexOf("", "", 0) + 27279), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2145994442, false, $$j(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2);
        int i13 = $10 + 97;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    static /* synthetic */ o.x.f a(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26999u + 109;
        f27000v = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = aVar.i();
        int i5 = f26999u + 23;
        f27000v = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f27000v + 33;
        f26999u = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = aVar.i();
        if (i4 == 0) {
            int i5 = 20 / 0;
        }
        int i6 = f26999u + 103;
        f27000v = i6 % 128;
        int i7 = i6 % 2;
        return fVarI;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        Object obj;
        int i8 = ~(i7 | i6);
        int i9 = (i2 + i8) - (i2 & i8);
        int i10 = ~i2;
        int i11 = (~((i6 + i10) - (i6 & i10))) | i7;
        int i12 = i7 + i2 + i5 + ((-1932811043) * i3) + (1521317780 * i4);
        int i13 = i12 * i12;
        int i14 = ((i7 * (-919556932)) - 154402816) + ((-919556932) * i2) + ((-1121407813) * i8) + (i9 * 1121407813) + (1121407813 * i11) + (201850880 * i5) + ((-2098724864) * i3) + ((-1398800384) * i4) + ((-1444151296) * i13);
        int i15 = (i7 * 1794637580) + 2133191799 + (i2 * 1794637580) + (i8 * (-161)) + (i9 * 161) + (i11 * 161) + (i5 * 1794637741) + (i3 * (-1844343719)) + (i4 * (-1188939004)) + (i13 * (-394526720));
        int i16 = i14 + (i15 * i15 * 821297152);
        if (i16 != 1) {
            return i16 != 2 ? e(objArr) : b(objArr);
        }
        int i17 = 2 % 2;
        int i18 = f26999u + 33;
        f27000v = i18 % 128;
        if (i18 % 2 != 0) {
            Object[] objArr2 = new Object[1];
            B("蚔\ue841孢쨛㴹곍ῖ躓\uf1ad捘퉉䕳됐✨雹痢梾\udba7䵂뱫⼞鸪ċ烄\ue3ec劻얨㝚ꙿक砩", 25347 - TextUtils.lastIndexOf("", '|'), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            B("蚔\ue841孢쨛㴹곍ῖ躓\uf1ad捘퉉䕳됐✨雹痢梾\udba7䵂뱫⼞鸪ċ烄\ue3ec劻얨㝚ꙿक砩", 28386 - TextUtils.lastIndexOf("", '0'), objArr3);
            obj = objArr3[0];
        }
        return ((String) obj).intern();
    }

    static /* synthetic */ o.x.f b(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26999u + 1;
        f27000v = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            aVar.i();
            obj.hashCode();
            throw null;
        }
        o.x.f fVarI = aVar.i();
        int i4 = f26999u + 77;
        f27000v = i4 % 128;
        if (i4 % 2 == 0) {
            return fVarI;
        }
        throw null;
    }

    static /* synthetic */ o.x.f c(a aVar) {
        int i2 = 2 % 2;
        int i3 = f27000v + 49;
        f26999u = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            aVar.i();
            obj.hashCode();
            throw null;
        }
        o.x.f fVarI = aVar.i();
        int i4 = f26999u + 107;
        f27000v = i4 % 128;
        if (i4 % 2 == 0) {
            return fVarI;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ o.x.f d(a aVar) {
        int i2 = 2 % 2;
        int i3 = f27000v + 21;
        f26999u = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar.i();
        }
        aVar.i();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f27000v + 117;
        f26999u = i3 % 128;
        if (i3 % 2 == 0) {
            aVar.i();
            throw null;
        }
        o.x.f fVarI = aVar.i();
        int i4 = f27000v + 19;
        f26999u = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return fVarI;
    }

    static /* synthetic */ o.x.f e(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26999u + 99;
        f27000v = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = aVar.i();
        int i5 = f27000v + 117;
        f26999u = i5 % 128;
        if (i5 % 2 != 0) {
            return fVarI;
        }
        throw null;
    }

    static /* synthetic */ o.x.f f(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26999u + 7;
        f27000v = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = aVar.i();
        int i5 = f26999u + 121;
        f27000v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return fVarI;
    }

    static /* synthetic */ o.x.f g(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26999u + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f27000v = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = aVar.i();
        int i5 = f26999u + 87;
        f27000v = i5 % 128;
        if (i5 % 2 == 0) {
            return fVarI;
        }
        throw null;
    }

    static /* synthetic */ o.x.f h(a aVar) {
        int i2 = f26998s * (-723081141);
        f26998s = i2;
        int iNextInt = new Random().nextInt(565139963);
        int iMyUid = Process.myUid();
        int i3 = f26996p * (-1732862413);
        f26996p = i3;
        return (o.x.f) b(new Object[]{aVar}, -1405726115, iMyUid, i3, iNextInt, i2, 1405726117);
    }

    static /* synthetic */ o.x.f i(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26999u + 53;
        f27000v = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = aVar.i();
        if (i4 != 0) {
            int i5 = 54 / 0;
        }
        int i6 = f27000v + 99;
        f26999u = i6 % 128;
        int i7 = i6 % 2;
        return fVarI;
    }

    static void init$0() {
        $$d = new byte[]{93, -2, -4, -85};
        $$e = 166;
    }

    static /* synthetic */ o.x.f j(a aVar) {
        int iActiveCount = Thread.activeCount();
        int i2 = f26995o * (-1595870100);
        f26995o = i2;
        return (o.x.f) b(new Object[]{aVar}, -1644868891, Process.myTid(), Process.myPid(), i2, iActiveCount, 1644868891);
    }

    static void o() {
        f27001w = 1488494017807092616L;
    }

    public final void a(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f27000v + 111;
        int i4 = i3 % 128;
        f26999u = i4;
        if (i3 % 2 == 0) {
            this.f27004n = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.f27004n = z2;
        int i5 = i4 + 65;
        f27000v = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26999u + 25;
        int i4 = i3 % 128;
        f27000v = i4;
        int i5 = i3 % 2;
        if (this.f27005t) {
            int i6 = i4 + 63;
            f26999u = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr = new Object[1];
        B("蚔\ue841孢쨛㴹곍ῖ躓\uf1ad捘퉉䕳됐✨雹痢梾\udba7䵂뱫⼞鸪ċ烄\ue3ec劻얨㝚ꙿक砩", View.resolveSizeAndState(0, 0, 0) + 28387, objArr);
        String strIntern = ((String) objArr[0]).intern();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        B("蚓⍌쵤睎ᄏ믁旲ྛꦫ剝ﱵꙅ䀂\uea32铉㺪\ud897", 42467 - (Process.myTid() >> 22), objArr2);
        StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(((c) this).f27088r.b());
        Object[] objArr3 = new Object[1];
        B("蚧過꯱앓\udc06\uf7f9đᠶ㏠䵂摽翷襞ꀢ뮉핏\uec25ފᄅ⠼䎆嵩琩迈饫뀩쯍\ue57dﳈទⅼ㣕厕洮蓛龺ꥠ삊\udba6\uf519ೃ➺ㄘ䣐", 5801 - View.MeasureSpec.getSize(0), objArr3);
        throw new WalletValidationException(walletValidationErrorCode, strIntern, sbAppend.append(((String) objArr3[0]).intern()).toString());
    }

    @Override // o.x.i
    public final String c() {
        int i2 = f26993l * 850650972;
        f26993l = i2;
        int i3 = f26994m * (-1781105305);
        f26994m = i3;
        int i4 = 2125400782 * f26992k;
        f26992k = i4;
        int i5 = 34109223 * f26997q;
        f26997q = i5;
        return (String) b(new Object[]{this}, 1641077032, i4, i5, i3, i2, -1641077031);
    }

    @Override // o.x.i
    public final void c(Context context, o.en.b bVar, o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27000v;
        int i4 = i3 + 13;
        f26999u = i4 % 128;
        int i5 = i4 % 2;
        if (context != null) {
            new o.ap.f(context, new f.a<e.C0332e>() { // from class: o.y.a.3
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: d */
                private static int f27006d = 0;

                /* JADX INFO: renamed from: e */
                private static char[] f27007e = null;

                /* JADX INFO: renamed from: g */
                private static boolean f27008g = false;

                /* JADX INFO: renamed from: h */
                private static int f27009h = 0;

                /* JADX INFO: renamed from: i */
                private static boolean f27010i = false;

                /* JADX INFO: renamed from: j */
                private static int f27011j = 0;

                /* JADX INFO: renamed from: a */
                private /* synthetic */ Context f27012a;

                /* JADX INFO: renamed from: b */
                private /* synthetic */ o.en.b f27013b;

                /* JADX INFO: renamed from: o.y.a$3$1 */
                public class AnonymousClass1 implements OperationCallback<Void> {
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10 = 0;
                    private static int $11 = 0;

                    /* JADX INFO: renamed from: a */
                    private static char f27015a = 0;

                    /* JADX INFO: renamed from: c */
                    private static char f27016c = 0;

                    /* JADX INFO: renamed from: d */
                    private static long f27017d = 0;

                    /* JADX INFO: renamed from: e */
                    private static char f27018e = 0;

                    /* JADX INFO: renamed from: f */
                    public static int f27019f = 0;

                    /* JADX INFO: renamed from: g */
                    private static int f27020g = 0;

                    /* JADX INFO: renamed from: h */
                    public static int f27021h = 0;

                    /* JADX INFO: renamed from: i */
                    private static int f27022i = 0;

                    /* JADX INFO: renamed from: j */
                    private static char f27023j = 0;

                    private static String $$c(byte v2, int v3, int v4) {
                        /*
                            byte[] r7 = o.y.a.AnonymousClass3.AnonymousClass1.$$a
                            int r6 = r9 + 69
                            int r5 = r8 * 3
                            int r1 = r5 + 1
                            int r0 = r10 * 2
                            int r4 = r0 + 4
                            byte[] r3 = new byte[r1]
                            r2 = 0
                            if (r7 != 0) goto L26
                            r0 = r5
                            r1 = r2
                        L13:
                            int r6 = r6 + r0
                            int r4 = r4 + 1
                        L16:
                            byte r0 = (byte) r6
                            r3[r1] = r0
                            if (r1 != r5) goto L21
                            java.lang.String r0 = new java.lang.String
                            r0.<init>(r3, r2)
                            return r0
                        L21:
                            r0 = r7[r4]
                            int r1 = r1 + 1
                            goto L13
                        L26:
                            r1 = r2
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.y.a.AnonymousClass3.AnonymousClass1.$$c(byte, int, int):java.lang.String");
                    }

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        f27021h = 853991012;
                        f27019f = 178318512;
                        f27022i = 0;
                        f27020g = 1;
                        f27017d = -4526899827246189901L;
                        f27016c = (char) 38281;
                        f27018e = (char) 62251;
                        f27015a = (char) 20824;
                        f27023j = (char) 53925;
                    }

                    AnonymousClass1() {
                    }

                    private void a() {
                        int i2 = 2 % 2;
                        int i3 = f27020g + 23;
                        f27022i = i3 % 128;
                        int i4 = i3 % 2;
                        if (a.e(a.this) != null) {
                            int i5 = f27020g + 21;
                            f27022i = i5 % 128;
                            int i6 = i5 % 2;
                            a.b(a.this).onProcessSuccess();
                        }
                        int i7 = f27022i + 89;
                        f27020g = i7 % 128;
                        int i8 = i7 % 2;
                    }

                    public static Object[] e(Context context, int i2, int i3) {
                        if (context == null) {
                            Object[] objArr = {new int[]{i12 ^ (i12 << 5)}, new int[]{i2}, null, new int[]{i2}};
                            int i4 = f27019f * 1166025484;
                            f27019f = i4;
                            int i5 = ~i4;
                            int i6 = (-969392014) | i5;
                            int i7 = (291243991 + i5) - (291243991 & i5);
                            int i8 = 452963741 + (((~((i5 + 970964959) - (i5 & 970964959))) | (~(((-289671046) + i5) - ((-289671046) & i5)))) * (-184));
                            int i9 = ~i6;
                            int i10 = i3 + ((i8 + ((((679720968 + i9) - (679720968 & i9)) | (~i7)) * 184)) - 289422248);
                            int i11 = i10 ^ (i10 << 13);
                            int i12 = i11 ^ (i11 >>> 17);
                            return objArr;
                        }
                        try {
                            Object[] objArr2 = new Object[1];
                            k("뾖◼譈炾혀밷⇉蜾沗틠롄ᶾ茄楨캜됲ᦙ\ufff9敆쫡뀐ᘼﮚ慻웊곝ሓ\uf7f7嵐썑꣐ส\uf3b2夞㽷\ua4cfਹ\uef95", 39521 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
                            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
                            long j2 = 0;
                            Object[] objArr4 = new Object[1];
                            k("뾿녩ꉷ錬蓾\uf5df\ue6ac\ud86e쥍㨫⭒᳑ෝ纁灳慎剠䌸뒧ꗼ階衯樂\uea3e\udb1d쳻㷮⺦‵ᅦȅ", ExpandableListView.getPackedPositionChild(0L) + 3804, objArr4);
                            try {
                                Object[] objArr5 = {((String) objArr4[0]).intern()};
                                Object[] objArr6 = new Object[1];
                                k("뾖◼譈炾혀밷⇉蜾沗틠롄ᶾ茄楨캜됲ᦙ\ufff9敆쫡뀐ᘼﮚ慻웊곝ሓ\uf7f7嵐썑꣐ส\uf3b2夞㽷\ua4cfਹ\uef95", 39521 - (Process.myPid() >> 22), objArr6);
                                objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                                Object[] objArr7 = new Object[1];
                                k("뾿쳌妳\ue688珤胲ඏ髦⟺듭섌东\udb09栱\uf566ɼ轢ᰜ\ua957㙥䊜쾟岍\ue9be皠莙ც鷆⫲런쐝", 29453 - ExpandableListView.getPackedPositionGroup(0L), objArr7);
                                try {
                                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                                    Object[] objArr9 = new Object[1];
                                    k("뾖◼譈炾혀밷⇉蜾沗틠롄ᶾ茄楨캜됲ᦙ\ufff9敆쫡뀐ᘼﮚ慻웊곝ሓ\uf7f7嵐썑꣐ส\uf3b2夞㽷\ua4cfਹ\uef95", View.combineMeasuredStates(0, 0) + 39521, objArr9);
                                    objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                                    try {
                                        Object[] objArr10 = new Object[1];
                                        k("뾝訳퓚Ὥ椗뎰﹞좵ኗ崺Ꟙ\uf263㰕ڿ兆鮽\ue5af〢竀䕻輍\ud9b1\u245e", 13729 - TextUtils.getOffsetAfter("", 0), objArr10);
                                        Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                                        Object[] objArr11 = new Object[1];
                                        l("状\ud8b2蓝耒ᄎ哀岡傖状\ud8b2\u0eff≑픽띑状\ud8b2۠琉", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, objArr11);
                                        Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                                        try {
                                            Object[] objArr12 = new Object[1];
                                            k("뾝訳퓚Ὥ椗뎰﹞좵ኗ崺Ꟙ\uf263㰕ڿ兆鮽\ue5af〢竀䕻輍\ud9b1\u245e", (ViewConfiguration.getScrollBarSize() >> 8) + 13729, objArr12);
                                            Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                                            Object[] objArr13 = new Object[1];
                                            l("状\ud8b2蓝耒ᄎ哀岡傖状\ud8b2࿂譨껤燻", 14 - View.resolveSizeAndState(0, 0, 0), objArr13);
                                            try {
                                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                                Object[] objArr15 = new Object[1];
                                                l("糯蟁\uf611阏쾀ﵬ犦뚲믏쐬ାዿ\ueb33\uf4c0맜綊핒喁ꌳ羇ᄎ哀岡傖状\ud8b2\u0eff≑픽띑状\ud8b2۠琉", 32 - TextUtils.indexOf((CharSequence) "", '0'), objArr15);
                                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                                Object[] objArr16 = new Object[1];
                                                k("뾛亞嶆油箁઼ᦽ⢬㞣욦헳\ue4df\uf3ce苈", 61703 - TextUtils.indexOf("", ""), objArr16);
                                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                                Object[] objArr17 = new Object[1];
                                                l("糯蟁\uf611阏쾀ﵬ犦뚲믏쐬ାዿ\ueb33\uf4c0맜綊핒喁ꌳ羇ᄎ哀岡傖状\ud8b2撶超繹磯", 30 - (ViewConfiguration.getScrollBarSize() >> 8), objArr17);
                                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                                Object[] objArr18 = new Object[1];
                                                k("뾏泖ᤝ왛\uf291鿇䰛祛▁틔", Drawable.resolveOpacity(0, 0) + 54083, objArr18);
                                                for (Object obj : (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2)) {
                                                    Object[] objArr19 = new Object[1];
                                                    l("႔ႛ凇앳蔲崥", (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)) + 4, objArr19);
                                                    try {
                                                        Object[] objArr20 = {((String) objArr19[0]).intern()};
                                                        Object[] objArr21 = new Object[1];
                                                        k("뾖汔᠘쓆\uf0f6鵢䤯痠⇁춟祐ꘫ勩继⭡흞茞꿑寰ࡔ㐭\ue0f3賎뢚敂ᄴ㷵\ue9ae陴䉜渴᫊욿\uf361鼡䯵矁", 54217 - Color.red(0), objArr21);
                                                        Class<?> cls5 = Class.forName(((String) objArr21[0]).intern());
                                                        Object[] objArr22 = new Object[1];
                                                        k("뾛\u218e莦旰쟎ꧼଂ\ued3c伪ㅐ鍿", 40471 - Drawable.resolveOpacity(0, 0), objArr22);
                                                        Object objInvoke3 = cls5.getMethod(((String) objArr22[0]).intern(), String.class).invoke(null, objArr20);
                                                        try {
                                                            Object[] objArr23 = new Object[1];
                                                            l("糯蟁\uf611阏쾀ﵬ犦뚲믏쐬ାዿ\ueb33\uf4c0맜綊핒喁퍭蒥\ud9d2花픽띑洽େ弿턋", View.combineMeasuredStates(0, 0) + 28, objArr23);
                                                            Class<?> cls6 = Class.forName(((String) objArr23[0]).intern());
                                                            Object[] objArr24 = new Object[1];
                                                            k("뾈\ue478ࡨ걄퀤琎頿㳣惖蓞⢫", 23531 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr24);
                                                            try {
                                                                Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr24[0]).intern(), null).invoke(obj, null))};
                                                                Object[] objArr26 = new Object[1];
                                                                k("뾖汔᠘쓆\uf0f6鵢䤯痠⇁춟祐ꘫ勩继⭡흞茞꿑寰ࡔ㐭\ue0f3賎뢚敂ᄴ㷵\ue9ae陴䉜渴᫊욿\uf361鼡䯵矁", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 54218, objArr26);
                                                                Class<?> cls7 = Class.forName(((String) objArr26[0]).intern());
                                                                Object[] objArr27 = new Object[1];
                                                                k("뾛牤⑨홮衺멬汦Ṳ큗艼둬晗ᡉ쩃ﱃ까恍ቅ쑓", 52733 - Color.argb(0, 0, 0, 0), objArr27);
                                                                Object objInvoke4 = cls7.getMethod(((String) objArr27[0]).intern(), InputStream.class).invoke(objInvoke3, objArr25);
                                                                int length = objArr3.length;
                                                                for (int i13 = 0; i13 < 2; i13++) {
                                                                    Object obj2 = objArr3[i13];
                                                                    try {
                                                                        Object[] objArr28 = new Object[1];
                                                                        l("虮迂\uf5e7緦칖帍\ue92f諧璂䠞\udcb5ޟ諪뚰灝靉༦㨳㰐漐凇앳耆盗ᥡ瘝伅ꅍ쿂\uf374䌴裫祕᧗", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33, objArr28);
                                                                        Class<?> cls8 = Class.forName(((String) objArr28[0]).intern());
                                                                        Object[] objArr29 = new Object[1];
                                                                        l("状\ud8b2ﳮ壕㬧ठ\ue21e봃ि얹㝺籬䟴蒹\ue4e6ﭞ㻮浺㬍ᇍ⮚佧븟䉆", 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr29);
                                                                        if (obj2.equals(cls8.getMethod(((String) objArr29[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                            Object[] objArr30 = {new int[1], new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                                            int iActiveCount = Thread.activeCount();
                                                                            int i14 = 2108735429 + (((-1) - (((-1) - (~((-9451523) | (~iActiveCount)))) & ((-1) - (~((-1) - (((-1) - 668696499) & ((-1) - iActiveCount))))))) * (-272)) + (((-1) - (((-1) - (~((-1) - (((-1) - (-10107028)) & ((-1) - iActiveCount))))) & ((-1) - 655505))) * (-272));
                                                                            int i15 = ~((-1) - (((-1) - iActiveCount) & ((-1) - 10107027)));
                                                                            int i16 = i3 + i14 + (((i15 + 668040994) - (i15 & 668040994)) * 272) + 16;
                                                                            int i17 = i16 ^ (i16 << 13);
                                                                            int i18 = i17 ^ (i17 >>> 17);
                                                                            ((int[]) objArr30[0])[0] = i18 ^ (i18 << 5);
                                                                            return objArr30;
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        Throwable cause = th.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                j2 = 0;
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
                        Object[] objArr31 = {new int[]{i24 ^ (i24 << 5)}, new int[]{i2}, null, new int[]{i2}};
                        int i19 = f27021h * (-594051392);
                        f27021h = i19;
                        int i20 = 2007807508 + (((-1) - (((-1) - (~((-1) - (((-1) - (-682475521)) & ((-1) - i19))))) & ((-1) - (~((-4327499) | i19))))) * 69);
                        int i21 = ~(((-1002291205) + i19) - ((-1002291205) & i19));
                        int i22 = i3 + ((i20 + (((~((i19 - 324143183) - (i19 & (-324143183)))) | ((i21 + 319815684) - (i21 & 319815684))) * (-69))) - 737213771);
                        int i23 = i22 ^ (i22 << 13);
                        int i24 = i23 ^ (i23 >>> 17);
                        return objArr31;
                    }

                    static void init$0() {
                        $$a = new byte[]{90, -4, -67, Ascii.NAK};
                        $$b = 12;
                    }

                    private static void k(String str, int i2, Object[] objArr) throws Throwable {
                        Object charArray;
                        String str2 = str;
                        int i3 = 2 % 2;
                        if (str2 != null) {
                            int i4 = $10 + 103;
                            $11 = i4 % 128;
                            int i5 = i4 % 2;
                            charArray = str2.toCharArray();
                        } else {
                            charArray = str2;
                        }
                        char[] cArr = (char[]) charArray;
                        o.a.q qVar = new o.a.q();
                        qVar.f19949d = i2;
                        int length = cArr.length;
                        long[] jArr = new long[length];
                        qVar.f19948a = 0;
                        int i6 = $10 + 105;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        while (qVar.f19948a < cArr.length) {
                            int i8 = qVar.f19948a;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                                Object objA = o.d.d.a(-1011865131);
                                if (objA == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = (byte) (b2 + 2);
                                    objA = o.d.d.a(ExpandableListView.getPackedPositionGroup(0L) + 731, (char) (7934 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 11 - TextUtils.indexOf("", "", 0, 0), 355847088, false, $$c(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE, Object.class, Object.class});
                                }
                                jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f27017d ^ 4743694005979712847L);
                                Object[] objArr3 = {qVar, qVar};
                                Object objA2 = o.d.d.a(1452497747);
                                if (objA2 == null) {
                                    byte b4 = (byte) 0;
                                    objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + 836, (char) (27279 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.resolveSizeAndState(0, 0, 0) + 11, -2145994442, false, $$c(b4, (byte) (9 | b4), b4), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objA2).invoke(null, objArr3);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        char[] cArr2 = new char[length];
                        qVar.f19948a = 0;
                        while (qVar.f19948a < cArr.length) {
                            int i9 = $10 + 117;
                            $11 = i9 % 128;
                            if (i9 % 2 == 0) {
                                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                                Object[] objArr4 = {qVar, qVar};
                                Object objA3 = o.d.d.a(1452497747);
                                if (objA3 == null) {
                                    byte b5 = (byte) 0;
                                    objA3 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 837, (char) ((-16749937) - Color.rgb(0, 0, 0)), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2145994442, false, $$c(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 9))), b5), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objA3).invoke(null, objArr4);
                                throw null;
                            }
                            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                            Object[] objArr5 = {qVar, qVar};
                            Object objA4 = o.d.d.a(1452497747);
                            if (objA4 == null) {
                                byte b6 = (byte) 0;
                                objA4 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 836, (char) (ExpandableListView.getPackedPositionGroup(0L) + 27279), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -2145994442, false, $$c(b6, (byte) (9 | b6), b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA4).invoke(null, objArr5);
                        }
                        objArr[0] = new String(cArr2);
                    }

                    private static void l(String str, int i2, Object[] objArr) throws Throwable {
                        String str2 = str;
                        int i3 = 2 % 2;
                        Object obj = str2;
                        if (str2 != null) {
                            char[] charArray = str2.toCharArray();
                            int i4 = $10 + 81;
                            $11 = i4 % 128;
                            int i5 = i4 % 2;
                            obj = charArray;
                        }
                        char[] cArr = (char[]) obj;
                        o.a.g gVar = new o.a.g();
                        char[] cArr2 = new char[cArr.length];
                        gVar.f19924d = 0;
                        char[] cArr3 = new char[2];
                        while (gVar.f19924d < cArr.length) {
                            int i6 = $11 + 47;
                            $10 = i6 % 128;
                            if (i6 % 2 != 0) {
                                cArr3[0] = cArr[gVar.f19924d];
                                cArr3[0] = cArr[gVar.f19924d % 0];
                            } else {
                                cArr3[0] = cArr[gVar.f19924d];
                                cArr3[1] = cArr[gVar.f19924d + 1];
                            }
                            int i7 = $10 + 35;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            int i9 = 58224;
                            for (int i10 = 0; i10 < 16; i10++) {
                                char c2 = cArr3[1];
                                char c3 = cArr3[0];
                                try {
                                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i9) ^ ((c3 << 4) + ((char) (((long) f27015a) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f27023j)};
                                    Object objA = o.d.d.a(1603517628);
                                    if (objA == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objA = o.d.d.a(270 - TextUtils.indexOf("", "", 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 12, -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                    }
                                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                                    cArr3[1] = cCharValue;
                                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f27016c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f27018e)};
                                    Object objA2 = o.d.d.a(1603517628);
                                    if (objA2 == null) {
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objA2 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 270, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - View.getDefaultSize(0, 0), -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                                    i9 -= 40503;
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
                                byte b7 = (byte) (b6 + 3);
                                objA3 = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0'), (char) View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.getDeadChar(0, 0) + 11, -2074123590, false, $$c(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr4);
                        }
                        objArr[0] = new String(cArr2, 0, i2);
                    }

                    @Override // fr.antelop.sdk.util.OperationCallback
                    public void onError(AntelopError antelopError) {
                        int i2 = 2 % 2;
                        int i3 = f27022i + 33;
                        f27020g = i3 % 128;
                        Object obj = null;
                        if (i3 % 2 == 0) {
                            a.c(a.this);
                            obj.hashCode();
                            throw null;
                        }
                        if (a.c(a.this) != null) {
                            a.d(a.this).onError(new o.by.c(antelopError.getCode(), antelopError.getMessage()));
                        }
                        int i4 = f27022i + 69;
                        f27020g = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                    }

                    @Override // fr.antelop.sdk.util.OperationCallback
                    public /* synthetic */ void onSuccess(Void r4) {
                        int i2 = 2 % 2;
                        int i3 = f27020g + 53;
                        f27022i = i3 % 128;
                        int i4 = i3 % 2;
                        a();
                        int i5 = f27022i + 35;
                        f27020g = i5 % 128;
                        if (i5 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                private static String $$c(short v2, int v3, short v4) {
                    /*
                        byte[] r7 = o.y.a.AnonymousClass3.$$a
                        int r6 = r8 + 4
                        int r0 = r9 * 6
                        int r0 = r0 + 67
                        int r5 = r10 * 2
                        int r1 = r5 + 1
                        byte[] r4 = new byte[r1]
                        r3 = 0
                        if (r7 != 0) goto L27
                        r2 = r6
                        r1 = r3
                    L13:
                        int r0 = -r0
                        int r6 = r6 + r0
                    L15:
                        byte r0 = (byte) r6
                        r4[r1] = r0
                        int r2 = r2 + 1
                        if (r1 != r5) goto L22
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        return r0
                    L22:
                        int r1 = r1 + 1
                        r0 = r7[r2]
                        goto L13
                    L27:
                        r1 = r3
                        r2 = r6
                        r6 = r0
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.y.a.AnonymousClass3.$$c(short, int, short):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f27009h = 0;
                    f27011j = 1;
                    f27007e = new char[]{2116, 2081, 2104, 2093, 2122, 2106, 2088, 2138, 2108, 2107, 2127, 2090, 2087, 2123, 2094, 2113, 2105, 2102, 2083, 2091, 2175, 2144, 2086, 2120, 2068, 2112, 2140, 2137, 2084};
                    f27006d = 2040400287;
                    f27010i = true;
                    f27008g = true;
                }

                AnonymousClass3(o.en.b bVar2, Context context2) {
                    bVar = bVar2;
                    context = context2;
                }

                /* JADX WARN: Removed duplicated region for block: B:55:0x004f  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private void e(o.ap.e.C0332e r24) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 720
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.y.a.AnonymousClass3.e(o.ap.e$e):void");
                }

                private static void f(int i22, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
                    char[] cArr;
                    String str3 = str;
                    String str4 = str2;
                    int i32 = 2 % 2;
                    Object obj = null;
                    Object obj2 = str4;
                    if (str4 != null) {
                        int i42 = $11 + 121;
                        $10 = i42 % 128;
                        if (i42 % 2 != 0) {
                            str4.getBytes("ISO-8859-1");
                            obj.hashCode();
                            throw null;
                        }
                        byte[] bytes = str4.getBytes("ISO-8859-1");
                        int i52 = $11 + 17;
                        $10 = i52 % 128;
                        obj2 = bytes;
                        if (i52 % 2 != 0) {
                            int i6 = 5 / 3;
                            obj2 = bytes;
                        }
                    }
                    byte[] bArr = (byte[]) obj2;
                    Object charArray = str3;
                    if (str3 != null) {
                        int i7 = $11 + 47;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        charArray = str3.toCharArray();
                    }
                    char[] cArr2 = (char[]) charArray;
                    o.a.f fVar = new o.a.f();
                    char[] cArr3 = f27007e;
                    char c2 = '0';
                    int i9 = -1;
                    int i10 = 0;
                    if (cArr3 != null) {
                        int i11 = $11 + 77;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        int length = cArr3.length;
                        char[] cArr4 = new char[length];
                        int i13 = 0;
                        while (i13 < length) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr3[i13])};
                                Object objA = o.d.d.a(1618406102);
                                if (objA == null) {
                                    byte b2 = (byte) i9;
                                    byte b3 = (byte) (b2 + 1);
                                    objA = o.d.d.a(Color.argb(i10, i10, i10, i10) + 593, (char) (13180 - TextUtils.indexOf("", c2)), 11 - (ViewConfiguration.getTouchSlop() >> 8), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                cArr4[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                                i13++;
                                c2 = '0';
                                i9 = -1;
                                i10 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        int i14 = $10 + 39;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 2 / 2;
                        }
                        cArr3 = cArr4;
                    }
                    Object[] objArr3 = {Integer.valueOf(f27006d)};
                    Object objA2 = o.d.d.a(-1503702982);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(31 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    if (f27008g) {
                        int i16 = $11 + 77;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            fVar.f19923e = bArr.length;
                            cArr = new char[fVar.f19923e];
                            fVar.f19922a = 1;
                        } else {
                            fVar.f19923e = bArr.length;
                            cArr = new char[fVar.f19923e];
                            fVar.f19922a = 0;
                        }
                        while (fVar.f19922a < fVar.f19923e) {
                            cArr[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i22] - iIntValue);
                            Object[] objArr4 = {fVar, fVar};
                            Object objA3 = o.d.d.a(1540807955);
                            if (objA3 == null) {
                                byte b4 = (byte) (-1);
                                byte b5 = (byte) (-b4);
                                objA3 = o.d.d.a(459 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), Process.getGidForName("") + 12, -1923924106, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr4);
                        }
                        objArr[0] = new String(cArr);
                        return;
                    }
                    int i17 = 0;
                    if (f27010i) {
                        fVar.f19923e = cArr2.length;
                        char[] cArr5 = new char[fVar.f19923e];
                        fVar.f19922a = 0;
                        while (fVar.f19922a < fVar.f19923e) {
                            int i18 = $11 + 85;
                            $10 = i18 % 128;
                            if (i18 % 2 != 0) {
                                cArr5[fVar.f19922a] = (char) (cArr3[cArr2[fVar.f19923e + fVar.f19922a] >>> i22] - iIntValue);
                                Object[] objArr5 = {fVar, fVar};
                                Object objA4 = o.d.d.a(1540807955);
                                if (objA4 == null) {
                                    byte b6 = (byte) (-1);
                                    byte b7 = (byte) (-b6);
                                    objA4 = o.d.d.a(458 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1923924106, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objA4).invoke(null, objArr5);
                            } else {
                                cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i22] - iIntValue);
                                Object[] objArr6 = {fVar, fVar};
                                Object objA5 = o.d.d.a(1540807955);
                                if (objA5 == null) {
                                    byte b8 = (byte) (-1);
                                    byte b9 = (byte) (-b8);
                                    objA5 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 458, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, -1923924106, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objA5).invoke(null, objArr6);
                            }
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    fVar.f19923e = iArr.length;
                    char[] cArr6 = new char[fVar.f19923e];
                    while (true) {
                        fVar.f19922a = i17;
                        if (fVar.f19922a >= fVar.f19923e) {
                            objArr[0] = new String(cArr6);
                            return;
                        }
                        int i19 = $10 + 3;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i22] - iIntValue);
                        i17 = fVar.f19922a + 1;
                    }
                }

                static void init$0() {
                    $$a = new byte[]{113, 60, -124, 107};
                    $$b = 88;
                }

                @Override // o.ap.f.a
                public final void a(o.bg.c cVar) throws Throwable {
                    int i22 = 2 % 2;
                    if (!(!o.ea.f.a())) {
                        Object[] objArr = new Object[1];
                        f((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u0094\u0083\u0093\u0093\u0089\u0092\u0086\u0091\u0090\u0084\u0083\u0087\u008c\u008c\u0081\u008f\u008e\u008d\u008c\u0087\u008b\u008a\u0084\u0089\u0088\u0083\u0084\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
                        String strIntern = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        f(128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, "\u0083\u0084\u0087\u0093\u009d\u0089\u009c\u008a\u0084\u0089\u0088\u008d\u008c\u0087\u008b\u0082\u008f", objArr2);
                        o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                    }
                    if (cVar.c() != o.bg.a.az) {
                        if (a.g(a.this) != null) {
                            o.by.c cVarB = o.by.c.b(cVar);
                            Object[] objArr3 = {a.this};
                            int i32 = a.f26998s * (-723081141);
                            a.f26998s = i32;
                            int iNextInt = new Random().nextInt(565139963);
                            int iMyUid = Process.myUid();
                            int i42 = a.f26996p * (-1732862413);
                            a.f26996p = i42;
                            ((o.x.f) a.b(objArr3, -1405726115, iMyUid, i42, iNextInt, i32, 1405726117)).onError(cVarB);
                            return;
                        }
                        return;
                    }
                    int i52 = f27009h + 11;
                    f27011j = i52 % 128;
                    int i6 = i52 % 2;
                    Object[] objArr4 = {a.this};
                    int iActiveCount = Thread.activeCount();
                    int i7 = a.f26995o * (-1595870100);
                    a.f26995o = i7;
                    if (((o.x.f) a.b(objArr4, -1644868891, Process.myTid(), Process.myPid(), i7, iActiveCount, 1644868891)) != null) {
                        a.f(a.this).onAuthenticationDeclined();
                        int i8 = f27009h + 97;
                        f27011j = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }

                @Override // o.ap.f.a
                public final /* synthetic */ void b(e.C0332e c0332e) throws Throwable {
                    int i22 = 2 % 2;
                    int i32 = f27011j + 49;
                    f27009h = i32 % 128;
                    int i42 = i32 % 2;
                    e(c0332e);
                    if (i42 != 0) {
                        throw null;
                    }
                }
            }, bVar2, new o.ap.e(new e.b())).b(dVar, g(), ((c) this).f27088r.b());
            return;
        }
        int i6 = i3 + 109;
        f26999u = i6 % 128;
        if (i6 % 2 == 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            B("蚎ឪ꒯㖫승厛\ue0b0熱ສ龮Ⲽ붥䪂\udb92梉了隂➇뒙䖪튔掱\uf0f6臱Ỻ꿩㳻췘嫵\uebf3磊৻ꛋ㟈쓄嗚", 37123 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            B("蚵\uea9b廻심㘑驥๒玽\ue7fc䯅뽽〈霋\uf8b1沖탎䐣ꠛᱝ膸\uf5d3姴촴\u3104ꕳᛪ竍\ueef5務옍⩻鹄", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27690, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (i() != null) {
            i().onError(new o.by.c(AntelopErrorCode.InternalError));
        }
    }

    public final void d(Context context, o.x.f fVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f27000v + 61;
        f26999u = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f27000v + 109;
            f26999u = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                B("蚎ឪ꒯㖫승厛\ue0b0熱ສ龮Ⲽ붥䪂\udb92梉了隂➇뒙䖪튔掱\uf0f6臱Ỻ꿩㳻췘嫵\uebf3磊৻ꛋ㟈쓄嗚", ExifDirectoryBase.TAG_COMPRESSED_AVERAGE_BITS_PER_PIXEL % (ExpandableListView.getPackedPositionForChild(1, 1) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 1L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                B("蚫죹ᨌ涴뿘Ŵ傭ꈫ\uf45d䟼褘\ud8b1", Gravity.getAbsoluteGravity(1, 0) + 24053, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                B("蚎ឪ꒯㖫승厛\ue0b0熱ສ龮Ⲽ붥䪂\udb92梉了隂➇뒙䖪튔掱\uf0f6臱Ỻ꿩㳻췘嫵\uebf3磊৻ꛋ㟈쓄嗚", ExifDirectoryBase.TAG_COMPRESSED_AVERAGE_BITS_PER_PIXEL - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                B("蚫죹ᨌ涴뿘Ŵ傭ꈫ\uf45d䟼褘\ud8b1", 20063 - Gravity.getAbsoluteGravity(0, 0), objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        b(context, fVar);
        int i6 = f27000v + 23;
        f26999u = i6 % 128;
        int i7 = i6 % 2;
    }
}
