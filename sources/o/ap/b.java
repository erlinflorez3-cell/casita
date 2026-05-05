package o.ap;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import o.a.q;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public interface b<Request, Response> {

    public static final class e extends Exception {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f20437a = 0;

        /* JADX INFO: renamed from: b */
        private static int f20438b = 0;

        /* JADX INFO: renamed from: d */
        private static long f20439d = 0;

        /* JADX INFO: renamed from: e */
        private static long f20440e = 0;

        /* JADX INFO: renamed from: f */
        public static int f20441f = 0;

        /* JADX INFO: renamed from: c */
        private final o.by.c f20442c;

        private static String $$c(short s2, short s3, int i2) {
            int i3 = 4 - (s3 * 4);
            int i4 = i2 + 71;
            byte[] bArr = $$a;
            int i5 = s2 * 2;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            int i7 = -1;
            if (bArr == null) {
                i3++;
                i4 += i3;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                byte b2 = bArr[i3];
                i3++;
                i4 += b2;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20441f = 1542988624;
            f20437a = 0;
            f20438b = 1;
            f20440e = 7103528860481001127L;
            f20439d = 8018997549840185476L;
        }

        public e(o.by.c cVar) {
            super(cVar.d());
            this.f20442c = cVar;
        }

        public static Object[] a(Context context, int i2, int i3) {
            Object obj = null;
            if (context == null) {
                Object[] objArr = {new int[1], new int[]{i2}, null, new int[]{i2}};
                int i4 = (int) Runtime.getRuntime().totalMemory();
                int i5 = ~i4;
                int i6 = i3 + 221962676 + (((~((-1) - (((-1) - (-808545096)) & ((-1) - i5)))) | (~((-1) - (((-1) - 130397073) & ((-1) - i5))))) * (-867)) + ((((-1) - (((-1) - (~(((-808545096) + i4) - ((-808545096) & i4)))) & ((-1) - 808470598))) | (~(130397073 | i4))) * (-1734)) + (((-1) - (((-1) - (~(i4 | 938867671))) & ((-1) - ((~((i5 - 808470599) - (i5 & (-808470599)))) | (~((-74498) | i4)))))) * 867);
                int i7 = i6 ^ (i6 << 13);
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                return objArr;
            }
            try {
                Object[] objArr2 = new Object[1];
                g("鮂ሜ袴ܶ뷄㐯ꋥ增휣䶠쑈狦\ue960最ᷠ鐲ˍ륹㟺귉\u2434틤䤖잻績\uf43d拿\u196f鞔๙蓬㊊ꤦ➾\ude4b哇썽礍", (ViewConfiguration.getFadingEdgeLength() >> 16) + 35221, objArr2);
                Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
                Object[] objArr4 = new Object[1];
                g("鮫ꦏﾇි匢慁띬쒘ૉ壽湒뱯쉡ស▣毨륔켞ᴷ⊢炲蛑퐜ᨨ⡙綍菮퇸\ue7a9㔘筵", 12841 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
                try {
                    Object[] objArr5 = {((String) objArr4[0]).intern()};
                    Object[] objArr6 = new Object[1];
                    g("鮂ሜ袴ܶ뷄㐯ꋥ增휣䶠쑈狦\ue960最ᷠ鐲ˍ륹㟺귉\u2434틤䤖잻績\uf43d拿\u196f鞔๙蓬㊊ꤦ➾\ude4b哇썽礍", 35221 - Color.argb(0, 0, 0, 0), objArr6);
                    objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                    float f2 = 0.0f;
                    Object[] objArr7 = new Object[1];
                    g("鮫꜈\ue207\u2d2c械꯶\uf6fbㆢ絮롉טּ۸䇝貵쿒\u0b58噶酸\udc23ῡ嫈斻ꅹ\uec5a⼴橝뗞\uf0c2㎦纔멩", 15581 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                    try {
                        Object[] objArr8 = {((String) objArr7[0]).intern()};
                        Object[] objArr9 = new Object[1];
                        g("鮂ሜ袴ܶ뷄㐯ꋥ增휣䶠쑈狦\ue960最ᷠ鐲ˍ륹㟺귉\u2434틤䤖잻績\uf43d拿\u196f鞔๙蓬㊊ꤦ➾\ude4b哇썽礍", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35221, objArr9);
                        objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                        try {
                            Object[] objArr10 = new Object[1];
                            h("әҸ觜緆ᠯ꽎痓⧎ꍌ둻⡞半颧⇍藜䀹ݔ跄燎ᱫꭺ秽ⷬꠉ彤◢駾", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr10);
                            Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                            Object[] objArr11 = new Object[1];
                            h("殹毞脖뙡ꀗ쀠紘\ue276ꮍమ\ue3e9㰮₽⤆么\uf836栿蔊멪ꐺ쐫", ViewConfiguration.getFadingEdgeLength() >> 16, objArr11);
                            Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                            try {
                                Object[] objArr12 = new Object[1];
                                h("әҸ觜緆ᠯ꽎痓⧎ꍌ둻⡞半颧⇍藜䀹ݔ跄燎ᱫꭺ秽ⷬꠉ彤◢駾", Color.green(0), objArr12);
                                Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                                Object[] objArr13 = new Object[1];
                                h("풓퓴뺪흕ↄ缊䊤荂鐱趽苝茄ꄮᚺ⽿禥휖몲", Color.rgb(0, 0, 0) + 16777216, objArr13);
                                try {
                                    Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                    Object[] objArr15 = new Object[1];
                                    g("鮉\uec9d疺ﻋ䟫젆儮\uda7b⍓둴㲈薵້韙ᣦ慓\uea28獎쐠䲹햕庼ꟑ⣤넇㨮茛ᑐ鵲\ue586溥\uf7c8磺", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30490, objArr15);
                                    Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                    Object[] objArr16 = new Object[1];
                                    g("鮏\uf8e0嵆뇿ᘽ檪켍Ⱳ胧\ue558秣\ude29㊒霎", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 25453, objArr16);
                                    Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                    Object[] objArr17 = new Object[1];
                                    h("憴懕\ue4d4Ꮆ\udd5a쨣ᣛ䞾칄焎䘮㘧巒䳅\uebac蕌戹\ue0ccι\ud91e츤ᓷ䏜浘㨍䣱\uf791腡昃ﳯ᮫핶툚ჭ", ImageFormat.getBitsPerPixel(0) + 1, objArr17);
                                    Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                    Object[] objArr18 = new Object[1];
                                    g("鮛붺ퟹ\ue937ͥⒻ绿逇꩕쎈", 9787 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr18);
                                    Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                    int length = objArr19.length;
                                    int i9 = 0;
                                    while (i9 < length) {
                                        Object obj2 = objArr19[i9];
                                        Object[] objArr20 = new Object[1];
                                        g("鮰㐻쐧鐯␥", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45053, objArr20);
                                        try {
                                            Object[] objArr21 = {((String) objArr20[0]).intern()};
                                            Object[] objArr22 = new Object[1];
                                            g("鮂␎\ue490ꔜ旚☸\ue6a7Ꜻ枥‥\ue0c7ꅑ懅∝\ue2e9ꍤ揪Ⱬ\uecb8겮洁ⶉ\uee06꺠漦⾮\ue83dꢴ楘⧆\uea7c\uaad0歫⯻\uf469듯畭", 49032 - (AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1)), objArr22);
                                            Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                            Object[] objArr23 = new Object[1];
                                            g("鮏并ၪ쩐豪䙼㡾\uf254둞湘⁃", TextUtils.lastIndexOf("", '0', 0) + 50684, objArr23);
                                            Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(obj, objArr21);
                                            try {
                                                Object[] objArr24 = new Object[1];
                                                h("鮄鯥贻\u0c52ᓑ〓焴塚Ɜ뢅姊찗鑙┪\uf448䳇頉褣Z႕㐔紘尸ꓐ쀵ℚ\ue870䣪鰠锐Ѵᳶ", MotionEvent.axisFromString("") + 1, objArr24);
                                                Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                                Object[] objArr25 = new Object[1];
                                                h("䔈䕼늶픃뇺\uee84亴脈頧᷹肽ኊㅹ᪨\u2d28", Color.blue(0), objArr25);
                                                try {
                                                    Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj2, null))};
                                                    Object[] objArr27 = new Object[1];
                                                    g("鮂␎\ue490ꔜ旚☸\ue6a7Ꜻ枥‥\ue0c7ꅑ懅∝\ue2e9ꍤ揪Ⱬ\uecb8겮洁ⶉ\uee06꺠漦⾮\ue83dꢴ楘⧆\uea7c\uaad0歫⯻\uf469듯畭", 49031 - View.MeasureSpec.getMode(0), objArr27);
                                                    Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                    Object[] objArr28 = new Object[1];
                                                    h("䭤䬃匿뼮胚\ue0ee꼳\ueb3c禤Ⳓ\ueabc᳗Eאָ䜢\ud8db䣥圤댱蓄\ue4e5ꌎ\uef05", Process.myPid() >> 22, objArr28);
                                                    Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                    int length2 = objArr3.length;
                                                    for (int i10 = 0; i10 < 2; i10++) {
                                                        Object obj3 = objArr3[i10];
                                                        try {
                                                            Object[] objArr29 = new Object[1];
                                                            h("鬈魢ᰐ擝䄣マ\ue00aテ㚏\ued29ㅗ첍솸됓鳒ᤦ颙ᡇ棐䔿㒚\uec25㒥\uf13a샥끩肺ᴩ鲽г泯䤛⢦\ue820㣰\uf51b쒼뱔", TextUtils.getOffsetAfter("", 0), objArr29);
                                                            Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                            Object[] objArr30 = new Object[1];
                                                            g("鮏謐몦ꩬ\ud9e9좛\uf82c\uefc6ὣน㶒ⵢ岄䰡献抩鉑臫낁ꀦퟜ읨\uf6fa", 4253 - (ViewConfiguration.getEdgeSlop() >> 16), objArr30);
                                                            if (obj3.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                                int i11 = f20441f * 62261178;
                                                                f20441f = i11;
                                                                int i12 = 678180941 + ((~(i11 | 567741327)) * JfifUtil.MARKER_SOI);
                                                                int i13 = ~i11;
                                                                int i14 = i3 + i12 + (((-100705313) | i13) * (-216)) + (((~(i13 | 567741327)) | 110406694) * JfifUtil.MARKER_SOI) + 16;
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
                                                    obj = null;
                                                    f2 = 0.0f;
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
            int i17 = i3 + 906911861 + (((-1) - (((-1) - (~((-1) - (((-1) - (-271489282)) & ((-1) - i2))))) & ((-1) - 271325184))) * 576) + (((-1) - (((-1) - (~((-1) - (((-1) - (~i2)) & ((-1) - (-164098)))))) & ((-1) - 135333556))) * 576) + 1664483328;
            int i18 = i17 ^ (i17 << 13);
            int i19 = i18 ^ (i18 >>> 17);
            return objArr32;
        }

        private static void g(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            if (str2 != null) {
                int i4 = $10 + 123;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    str2.toCharArray();
                    throw null;
                }
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            char[] cArr = (char[]) charArray;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            int i5 = $11 + 9;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (qVar.f19948a < cArr.length) {
                int i7 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(731 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 7933), KeyEvent.normalizeMetaState(0) + 11, 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f20440e ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(836 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (27278 - ImageFormat.getBitsPerPixel(0)), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2145994442, false, $$c(b4, b5, (byte) (7 | b5)), new Class[]{Object.class, Object.class});
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
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(837 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27278), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -2145994442, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 7)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            String str3 = new String(cArr2);
            int i8 = $11 + 111;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            objArr[0] = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void h(java.lang.String r20, int r21, java.lang.Object[] r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ap.b.e.h(java.lang.String, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
            $$b = 51;
        }

        public final o.by.c d() {
            int i2 = 2 % 2;
            int i3 = f20438b + 25;
            f20437a = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f20442c;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    Response a(o.ef.a aVar) throws o.ef.b;

    void e(o.ef.a aVar) throws e, o.ef.b;
}
