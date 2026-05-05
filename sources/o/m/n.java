package o.m;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.authentication.prompt.ScreenUnlockCustomerAuthenticationPrompt;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o.g.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends k<o.t.e> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char[] f26551a = null;

    /* JADX INFO: renamed from: b */
    private static int f26552b = 0;

    /* JADX INFO: renamed from: c */
    private static char[] f26553c = null;

    /* JADX INFO: renamed from: d */
    private static long f26554d = 0;

    /* JADX INFO: renamed from: e */
    private static int f26555e = 0;

    /* JADX INFO: renamed from: f */
    private static int f26556f = 0;

    /* JADX INFO: renamed from: j */
    private static int f26557j = 0;

    /* JADX INFO: renamed from: p */
    public static int f26558p = 0;

    /* JADX INFO: renamed from: o.m.n$2 */
    final class AnonymousClass2 implements o.ca.e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: c */
        private static char f26559c = 0;

        /* JADX INFO: renamed from: e */
        private static char f26560e = 0;

        /* JADX INFO: renamed from: f */
        private static char f26561f = 0;

        /* JADX INFO: renamed from: g */
        private static char f26562g = 0;

        /* JADX INFO: renamed from: h */
        private static int f26563h = 0;

        /* JADX INFO: renamed from: i */
        private static int f26564i = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ AtomicBoolean f26565a;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ CountDownLatch f26567d;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r9, short r10, int r11) {
            /*
                int r0 = r11 * 3
                int r8 = r0 + 1
                byte[] r7 = o.m.n.AnonymousClass2.$$a
                int r0 = r9 * 3
                int r6 = 72 - r0
                int r0 = r10 * 3
                int r0 = 3 - r0
                byte[] r5 = new byte[r8]
                r4 = 0
                if (r7 != 0) goto L2b
                r1 = r0
                r6 = r8
                r3 = r4
            L16:
                int r6 = r6 + r0
                r0 = r1
                r2 = r3
            L19:
                byte r1 = (byte) r6
                int r3 = r2 + 1
                r5[r2] = r1
                int r1 = r0 + 1
                if (r3 != r8) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L28:
                r0 = r7[r1]
                goto L16
            L2b:
                r2 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.m.n.AnonymousClass2.$$c(byte, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f26564i = 0;
            f26563h = 1;
            f26560e = (char) 21860;
            f26559c = (char) 48622;
            f26562g = (char) 38409;
            f26561f = (char) 10646;
        }

        AnonymousClass2(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            atomicBoolean = atomicBoolean;
            countDownLatch = countDownLatch;
        }

        static void init$0() {
            $$a = new byte[]{80, 70, 7, 82};
            $$b = 70;
        }

        private static void j(String str, int i2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2 % 2;
            int i5 = $11 + 97;
            int i6 = i5 % 128;
            $10 = i6;
            int i7 = i5 % 2;
            Object charArray = str2;
            if (str2 != null) {
                int i8 = i6 + 31;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            o.a.g gVar = new o.a.g();
            char[] cArr2 = new char[cArr.length];
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            while (gVar.f19924d < cArr.length) {
                int i10 = $10 + 9;
                $11 = i10 % 128;
                int i11 = 58224;
                if (i10 % 2 == 0) {
                    cArr3[0] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d / 0];
                    i3 = 1;
                } else {
                    cArr3[0] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d + 1];
                    i3 = 0;
                }
                while (i3 < 16) {
                    int i12 = $10 + 49;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i11) ^ ((c3 << 4) + ((char) (((long) f26562g) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f26561f)};
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            byte b2 = (byte) 1;
                            byte b3 = (byte) (b2 - 1);
                            objA = o.d.d.a(270 - Color.alpha(0), (char) (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) + 12, -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i11) ^ ((cCharValue << 4) + ((char) (((long) f26560e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f26559c)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            byte b4 = (byte) 1;
                            byte b5 = (byte) (b4 - 1);
                            objA2 = o.d.d.a(AndroidCharacter.getMirror('0') + 222, (char) View.resolveSize(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i11 -= 40503;
                        i3++;
                        int i14 = $10 + 11;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 3 / 4;
                        }
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
                    objA3 = o.d.d.a(Process.getGidForName("") + 271, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - Color.blue(0), -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        @Override // o.ca.e
        public final void b(i iVar) throws Throwable {
            String strIntern;
            Object obj;
            int i2 = 2 % 2;
            if (o.ea.f.a()) {
                int i3 = f26564i + 67;
                f26563h = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    j("䈪䍲栃䲺\ue41d滃貃ց阑\uf8de跭딑㝶ⓜ㖿Ⓒ\u1758\u191f풪쳩쁆蚮䍌葩\ue41d滃옕몋搕\ue091옕몋ﬔ噕ᚈ⯖䍌葩⹒勎", 30 / TextUtils.indexOf("", "", 0, 0), objArr);
                    strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    j("阑\uf8deᔜ쾁\ue522胋圱霖\ue41d滃옕몋ᔎ㐠ഒ㷑\ueeed\uea5f둬짟꽰㲁\ue41d滃爝\ud949췯\u1a1d继퍴섞ᡠ籒\ud8ca栃䲺襱\uf30d沑☭芺\u001b췯\u1a1d继퍴섞ᡠ\uf174裡❕⊝㧨줙풎ླྀ胋᷺", 52 >>> (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    j("䈪䍲栃䲺\ue41d滃貃ց阑\uf8de跭딑㝶ⓜ㖿Ⓒ\u1758\u191f풪쳩쁆蚮䍌葩\ue41d滃옕몋搕\ue091옕몋ﬔ噕ᚈ⯖䍌葩⹒勎", 40 - TextUtils.indexOf("", "", 0, 0), objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    j("阑\uf8deᔜ쾁\ue522胋圱霖\ue41d滃옕몋ᔎ㐠ഒ㷑\ueeed\uea5f둬짟꽰㲁\ue41d滃爝\ud949췯\u1a1d继퍴섞ᡠ籒\ud8ca栃䲺襱\uf30d沑☭芺\u001b췯\u1a1d继퍴섞ᡠ\uf174裡❕⊝㧨줙풎ླྀ胋᷺", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 57, objArr4);
                    obj = objArr4[0];
                }
                o.ea.f.c(strIntern, ((String) obj).intern());
            }
            atomicBoolean.set(true);
            countDownLatch.countDown();
            int i4 = f26563h + 111;
            f26564i = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.ca.e
        public final void d(i iVar, o.j.b bVar) throws Throwable {
            int i2 = 2 % 2;
            if (o.ea.f.a()) {
                int i3 = f26563h + 53;
                f26564i = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                j("䈪䍲栃䲺\ue41d滃貃ց阑\uf8de跭딑㝶ⓜ㖿Ⓒ\u1758\u191f풪쳩쁆蚮䍌葩\ue41d滃옕몋搕\ue091옕몋ﬔ噕ᚈ⯖䍌葩⹒勎", 41 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                j("阑\uf8deᔜ쾁\ue522胋圱霖\ue41d滃옕몋ᔎ㐠ഒ㷑\ueeed\uea5f둬짟꽰㲁\ue41d滃爝\ud949췯\u1a1d继퍴섞ᡠ籒\ud8ca魘깦㾢ⰷ꽰㲁\ue41d滃鲯\uf670\udc91⫃阑\uf8de跭딑㴆⯄풪쳩視\uf503꜂⑹圱霖", (ViewConfiguration.getLongPressTimeout() >> 16) + 60, objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            countDownLatch.countDown();
            int i5 = f26564i + 45;
            f26563h = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r9, short r10, short r11) {
        /*
            int r0 = r10 * 3
            int r8 = 1 - r0
            byte[] r7 = o.m.n.$$c
            int r0 = 120 - r11
            int r1 = r9 * 4
            int r6 = r1 + 4
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L2a
            r2 = r8
            r3 = r4
        L13:
            int r0 = -r0
            int r6 = r6 + 1
            int r0 = r0 + r2
            r2 = r3
        L18:
            int r3 = r2 + 1
            byte r1 = (byte) r0
            r5[r2] = r1
            if (r3 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r1 = r7[r6]
            r2 = r0
            r0 = r1
            goto L13
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.n.$$j(int, short, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f26558p = -1165543971;
        init$0();
        f26557j = 0;
        f26556f = 1;
        f26555e = 0;
        f26552b = 1;
        b();
        int i2 = f26556f + 101;
        f26557j = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public n() {
        super(i.f26493a, new o.t.e());
    }

    static void b() {
        f26551a = new char[]{56569, 56430, 56432, 56436, 56414, 56415, 56432, 56435, 56442, 56445, 56429, 56391, 56407, 56440, 56405, 56400, 56429, 56435, 56439, 56434, 56432, 56430, 56498, 56548, 56553, 56537, 56533, 56557, 56554, 56532, 56544, 56566, 56558, 56558, 56561, 56553, 56548, 56550, 56471, 56528, 56556, 56549, 56548, 56550, 56559, 56564, 56555, 56540, 56550, 56557, 56536, 56543, 56545, 56543, 56551, 56550, 56554, 56535, 56539, 56556, 56552, 56556, 56550, 56540, 56514, 56521, 56555, 56553, 56546, 56551, 56550, 56554, 56558, 56552, 56552, 56550, 56521, 56524, 56551, 56555, 56528, 56527, 56559, 56557, 56552, 56556, 56561, 56551, 56503, 56558, 56556, 56558, 56554, 56546, 56550, 56558, 56561, 56553, 56550, 56558, 56564, 56539, 56537, 56555, 56553, 56558, 56561, 56563, 56564, 56540, 56535, 56551, 56553, 56557, 56557, 56545, 56545, 56553, 56549, 56555, 56554, 56539, 56539, 56553, 56555, 56558, 56556, 56537, 56507, 56555, 56550, 56554, 56550, 56546, 56554, 56556, 56532, 56538, 56555, 56548, 56548, 56553, 56561, 56558, 56549, 56550, 56559, 56521, 56486, 56486, 56501, 56536, 56559, 56566, 56563, 56561, 56560, 56555, 56533, 56542, 56557, 56548, 56554, 56562, 56558, 56556, 56502, 56557, 56552, 56546, 56531, 56538, 56555, 56548, 56548, 56553, 56561, 56558, 56549, 56550, 56559, 56540, 56540, 56560, 56558, 56543, 56539, 56548, 56548, 56553, 56561, 56548, 56545, 56557, 56557, 56553, 56551, 56517, 56493, 56493, 56521, 56555, 56548, 56548, 56553, 56561, 56522, 56522, 56561, 56557, 56557, 56553, 56551, 56517, 56513, 56549, 56550, 56548, 56551, 56554, 56555, 56554, 56515, 56516, 56555, 56561, 56556, 56555, 56562, 56563, 56562, 56562, 56556, 56548, 56480, 56539, 56564, 56558, 56550, 56553, 56561, 56558, 56550, 56546, 56554, 56558, 56556, 56558, 56543, 56545, 56560, 56558, 56558, 56562, 56539, 56540, 56564, 56563, 56561, 56558, 56553, 56555, 56322, 56705, 56441, 56433, 56441, 56443, 56419, 56427, 56704, 56431, 56427, 56443, 56707, 56445, 56442, 56441, 56444, 56408, 56373, 56373, 56399, 56442, 56707, 56445, 56437, 56440, 56704, 56445, 56437, 56433, 56441, 56445, 56443, 56445, 56406, 56401, 56443, 56706, 56440, 56441, 56445, 56443, 56445, 56406, 56403, 56435, 56441, 56408, 56400, 56434, 56436, 56440, 56406, 56409, 56705, 56441, 56433, 56441, 56443, 56435, 56559, 56409, 56367, 56366, 56405, 56406, 56403, 56408, 56415, 56411, 56404, 56366, 56365, 56399, 56407, 56405, 56406, 56410, 56409, 56406, 56397, 56363, 56372, 56409, 56367, 56365, 56406, 56411, 56412, 56414, 56417, 56410, 56403, 56368, 56337, 56337, 56372, 56408, 56405, 56406, 56409, 56415, 56407, 56391, 56395, 56412, 56391, 56383, 56407, 56405, 56397, 56405, 56413, 56349, 56759, 56751, 56743, 56751, 56753, 56729, 56737, 56758, 56741, 56737, 56753, 56761, 56755, 56752, 56751, 56754};
        f26553c = new char[]{38039, 8935, 63585, 47081, 19813, 1226, 53824, 27119, 10079, 65234, 46116, 17333, 6455, 53434, 28169, 38040, 8938, 63606, 47096, 19768, 1219, 53829, 27091, 10077, 65181, 46107, 17336, 6445, 53411, 28169, 9608, 16848, 63394, 11628, 25272, 38965, 53699, 51930, 31924, 42546, 59822, 4908, 23184, 35854, 14214, 31015, 41119, 60019, 7675, 18277, 36583, 12358, 31698, 44381, 54473, 7773, 16503, 35829, 15713, 25791, 44544, 53649, 6927, 17094, 62471, 16369, 24938, 43170, 53866, 1529, 20289, 63190, 14402, 25542, 38309, 57139, 1696, 18469, 62393, 9491, 27803, 38464, 55748, 818, 19176, 64633, 10225, 27002, 37086, 55894, 3526, 46858, 63792, 8358, 27192, 40354, 50986, 3742, 45069, 64395, 11530, 21632, 40550, 63696, 20158, 37944, 56228, 8486, 26778, 48644, 1420, 19245, 37525, 55417, 12273, 30063, 48365, 588, 18904, 40791, 59075, 11351, 29309, 47615, 3947, 22197, 39946, 58267, 10501, 28876, 50701, 3579, 21344, 39592, 57455, 14313, 32075, 50324, 2636, 20951, 42927, 60728, 13484, 31264, 49587, 5909, 24214, 41995, 60311, 12669, 30965, 52790, 5538, 23332, 41683, 59485, 16351, 34048, 52010, 4795, 22563, 44984, 62764, 15508, 33300, 51656, 7938, 26260, 44154, 62448, 14696, 33004, 54863, 7641, 25416, 43714, 61524, 18246, 61736, 11199, 25635, 40612, 55081, 384, 47620, 62593, 11541, 26602, 36919, 51877, 801, 48595, 63069, 8386, 22860, 37834, 52662, 1588, 45289, 59649, 9102, 23567, 38529, 52993, 31114, 45693, 60643, 9547, 24566, 34928, 49877, 31571, 46529, 61012, 6192, 21169, 35626, 50616, 32300, 43153, 57625, 7096, 21523, 36597, 51070, 29156, 43641, 58534, 7503, 22466, 32838, 15060, 29874, 44344, 59312, 4138};
        f26554d = 7902322564046004875L;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
        $$b = 60;
    }

    static void init$1() {
        $$d = new byte[]{7, -110, 9, 72, Ascii.FF, -68, 51, Ascii.CR, 6, -15, 7, 3, 1, -66, 69, -15, 7, MessagePack.Code.TRUE, 51, Ascii.DC4, -1, -12, -3, 9, 6, -11, -6, -2, 19, -11, 6, -1, MessagePack.Code.NIL, 66, 2, -3, -2, 3, 4, -70, 37, 16, Ascii.SI, -13, 0, 9, -25, Ascii.EM, -2, 3, -12, 8, MessagePack.Code.FIXEXT16, 50, -2, 1, -5, -2, -8, Ascii.CR, MessagePack.Code.UINT64, 52, -1, -12, -3, 9, 6, -11, -6, -2, 19, -11, 6, -1, -30, 34, -3, -2, 3, 4};
        $$e = 145;
    }

    static void init$2() {
        $$c = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
        $$i = 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void t(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r3 = r7 * 3
            int r2 = 1 - r3
            int r8 = 98 - r8
            int r0 = r6 * 3
            int r1 = 3 - r0
            byte[] r7 = o.m.n.$$a
            byte[] r6 = new byte[r2]
            r5 = 0
            int r4 = 0 - r3
            if (r7 != 0) goto L2e
            r3 = r5
            r0 = r1
        L15:
            int r1 = -r1
            int r1 = r1 + r8
            r2 = r3
            r8 = r1
            r1 = r0
        L1a:
            byte r0 = (byte) r8
            r6[r2] = r0
            int r3 = r2 + 1
            if (r2 != r4) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r9[r5] = r0
            return
        L29:
            int r0 = r1 + 1
            r1 = r7[r0]
            goto L15
        L2e:
            r2 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.n.t(byte, short, byte, java.lang.Object[]):void");
    }

    private static void u(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            int i4 = $11 + 13;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        o.a.m mVar = new o.a.m();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = f26551a;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        objA = o.d.d.a(View.resolveSizeAndState(i5, i5, i5) + 249, (char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.keyCodeFromString("") + 11, 1376582792, false, $$j(b2, b2, (byte) $$c.length), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i7) {
                int i11 = $10 + 65;
                $11 = i11 % 128;
                if (i11 % 2 != 0 ? bArr[mVar.f19943d] != 1 : bArr[mVar.f19943d] != 1) {
                    int i12 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(1632715197);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA2 = o.d.d.a(836 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (27278 - ((byte) KeyEvent.getModifierMetaStateMask())), 11 - View.getDefaultSize(0, 0), -1210801192, false, $$j(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = $11 + 39;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(120026474);
                        if (objA3 == null) {
                            objA3 = o.d.d.a(11 - Gravity.getAbsoluteGravity(0, 0), (char) Color.alpha(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i15 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = o.d.d.a(120026474);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(11 - View.getDefaultSize(0, 0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = o.d.d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20, (char) (35715 - TextUtils.getTrimmedLength("")), 11 - (ViewConfiguration.getTouchSlop() >> 8), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            int i16 = $11 + 47;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr5 = new char[i7];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i18 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i18, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i18);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i7];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i7) {
                    break;
                }
                int i19 = $11 + 57;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                cArr6[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i21 = 0;
            while (true) {
                mVar.f19943d = i21;
                if (mVar.f19943d >= i7) {
                    break;
                }
                int i22 = $10 + 105;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[4]);
                    i21 = mVar.f19943d;
                } else {
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                    i21 = mVar.f19943d + 1;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void v(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o.a.o oVar = new o.a.o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 37;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f26553c[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - (Process.myPid() >> 22), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12 - (ViewConfiguration.getTapTimeout() >> 16), 632508977, false, $$j(b2, b3, (byte) ((b3 + Ascii.NAK) - (21 & b3))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f26554d), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 765, (char) (12470 - (ViewConfiguration.getPressedStateDuration() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 12, 1946853218, false, $$j(b4, b5, (byte) (20 | b5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(TextUtils.getOffsetAfter("", 0) + 387, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 18 - TextUtils.getOffsetAfter("", 0), 39570797, false, $$j(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 15)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 5;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(387 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) Drawable.resolveOpacity(0, 0), Color.blue(0) + 18, 39570797, false, $$j(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 15)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i9 = 37 / 0;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr6 = {oVar, oVar};
                Object objA5 = o.d.d.a(-723636472);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 386, (char) Color.argb(0, 0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, 39570797, false, $$j(b10, b11, (byte) (15 | b11)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r2 = r9 * 76
            int r1 = 77 - r2
            int r0 = r7 * 4
            int r7 = 102 - r0
            byte[] r6 = o.m.n.$$d
            int r5 = r8 + 4
            byte[] r4 = new byte[r1]
            int r3 = 76 - r2
            r2 = 0
            if (r6 != 0) goto L2c
            r1 = r7
            r7 = r3
            r0 = r2
        L16:
            int r7 = r7 + r1
            r1 = r0
        L18:
            int r5 = r5 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r3) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2)
            r10[r2] = r0
            return
        L29:
            r1 = r6[r5]
            goto L16
        L2c:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.n.w(short, int, short, java.lang.Object[]):void");
    }

    @Override // o.m.h
    public final void d(int i2) {
        int i3 = 2 % 2;
        int i4 = f26555e + 77;
        f26552b = i4 % 128;
        int i5 = i4 % 2;
        super.d(i2);
        l().d(i2);
        int i6 = f26555e + 57;
        f26552b = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0228  */
    @Override // o.m.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r28, o.g.a r29, o.j.e r30, o.m.a r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.n.d(android.content.Context, o.g.a, o.j.e, o.m.a, boolean):void");
    }

    @Override // o.m.h
    protected final o.l.c e(Context context, CustomerAuthenticationPrompt customerAuthenticationPrompt) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26555e + 59;
        f26552b = i3 % 128;
        int i4 = i3 % 2;
        byte b2 = $$d[44];
        Object[] objArr = new Object[1];
        w(b2, r3[20], b2, objArr);
        if (Class.forName((String) objArr[0]).isInstance(customerAuthenticationPrompt)) {
            ScreenUnlockCustomerAuthenticationPrompt screenUnlockCustomerAuthenticationPrompt = (ScreenUnlockCustomerAuthenticationPrompt) customerAuthenticationPrompt;
            o.r.a aVar = new o.r.a(context, screenUnlockCustomerAuthenticationPrompt.getTitle(), screenUnlockCustomerAuthenticationPrompt.getSubtitle(), this);
            int i5 = f26555e + 7;
            f26552b = i5 % 128;
            if (i5 % 2 != 0) {
                return aVar;
            }
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            u("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{88, 40, 0, 34}, true, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            v((char) (((byte) KeyEvent.getModifierMetaStateMask()) + MessagePack.Code.FIXEXT8), TextUtils.indexOf("", "") + 177, (Process.myTid() >> 22) + 59, objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.InvalidFormat;
        Object[] objArr4 = new Object[1];
        u("\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{234, 28, 0, 20}, false, objArr4);
        throw new WalletValidationException(walletValidationErrorCode, ((String) objArr4[0]).intern());
    }

    @Override // o.m.h
    final void e(Context context, h hVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26552b + 117;
        f26555e = i3 % 128;
        if (i3 % 2 != 0) {
            Integer numJ = j();
            super.e(context, hVar);
            int i4 = 42 / 0;
            if (Objects.equals(numJ, j())) {
                return;
            }
        } else {
            Integer numJ2 = j();
            super.e(context, hVar);
            if (Objects.equals(numJ2, j())) {
                return;
            }
        }
        int i5 = f26555e + 105;
        f26552b = i5 % 128;
        int i6 = i5 % 2;
        if (j() != null) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                u("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{88, 40, 0, 34}, true, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                u("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{262, 60, 143, 0}, false, objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            l().d(j().intValue());
            if (l().e()) {
                int i7 = f26555e + 103;
                f26552b = i7 % 128;
                int i8 = i7 % 2;
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    u("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{88, 40, 0, 34}, true, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    u("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{ExifDirectoryBase.TAG_TILE_WIDTH, 53, 107, 0}, true, objArr4);
                    o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                try {
                    k();
                } catch (e e2) {
                    if (o.ea.f.a()) {
                        Object[] objArr5 = new Object[1];
                        u("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{88, 40, 0, 34}, true, objArr5);
                        String strIntern3 = ((String) objArr5[0]).intern();
                        Object[] objArr6 = new Object[1];
                        u("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{375, 17, 197, 0}, false, objArr6);
                        o.ea.f.e(strIntern3, ((String) objArr6[0]).intern(), e2);
                    }
                }
                Object[] objArr7 = {o.en.b.c()};
                int i9 = o.en.b.f24090e * (-1580596594);
                o.en.b.f24090e = i9;
                int i10 = o.en.b.f24087b * (-2071415875);
                o.en.b.f24087b = i10;
                e(context, ((o.fr.e) o.en.b.a(342371170, i9, objArr7, i10, -342371167, Process.myUid(), new Random().nextInt(460146032))).c().b(d()));
            }
        }
    }

    public final boolean e(Context context, o.i.c cVar, o.i.d dVar) {
        int i2 = 2 % 2;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        cVar.a(context, dVar, new o.g.g(a.b.f26176d, new Date(), new o.g.d(new byte[0])), new o.ca.e() { // from class: o.m.n.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: c */
            private static char f26559c = 0;

            /* JADX INFO: renamed from: e */
            private static char f26560e = 0;

            /* JADX INFO: renamed from: f */
            private static char f26561f = 0;

            /* JADX INFO: renamed from: g */
            private static char f26562g = 0;

            /* JADX INFO: renamed from: h */
            private static int f26563h = 0;

            /* JADX INFO: renamed from: i */
            private static int f26564i = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ AtomicBoolean f26565a;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ CountDownLatch f26567d;

            private static String $$c(byte v2, short v3, int v4) {
                /*
                    int r0 = r11 * 3
                    int r8 = r0 + 1
                    byte[] r7 = o.m.n.AnonymousClass2.$$a
                    int r0 = r9 * 3
                    int r6 = 72 - r0
                    int r0 = r10 * 3
                    int r0 = 3 - r0
                    byte[] r5 = new byte[r8]
                    r4 = 0
                    if (r7 != 0) goto L2b
                    r1 = r0
                    r6 = r8
                    r3 = r4
                L16:
                    int r6 = r6 + r0
                    r0 = r1
                    r2 = r3
                L19:
                    byte r1 = (byte) r6
                    int r3 = r2 + 1
                    r5[r2] = r1
                    int r1 = r0 + 1
                    if (r3 != r8) goto L28
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L28:
                    r0 = r7[r1]
                    goto L16
                L2b:
                    r2 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.m.n.AnonymousClass2.$$c(byte, short, int):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f26564i = 0;
                f26563h = 1;
                f26560e = (char) 21860;
                f26559c = (char) 48622;
                f26562g = (char) 38409;
                f26561f = (char) 10646;
            }

            AnonymousClass2(AtomicBoolean atomicBoolean2, CountDownLatch countDownLatch2) {
                atomicBoolean = atomicBoolean2;
                countDownLatch = countDownLatch2;
            }

            static void init$0() {
                $$a = new byte[]{80, 70, 7, 82};
                $$b = 70;
            }

            private static void j(String str, int i22, Object[] objArr) throws Throwable {
                int i3;
                String str2 = str;
                int i4 = 2 % 2;
                int i5 = $11 + 97;
                int i6 = i5 % 128;
                $10 = i6;
                int i7 = i5 % 2;
                Object charArray = str2;
                if (str2 != null) {
                    int i8 = i6 + 31;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                o.a.g gVar = new o.a.g();
                char[] cArr2 = new char[cArr.length];
                gVar.f19924d = 0;
                char[] cArr3 = new char[2];
                while (gVar.f19924d < cArr.length) {
                    int i10 = $10 + 9;
                    $11 = i10 % 128;
                    int i11 = 58224;
                    if (i10 % 2 == 0) {
                        cArr3[0] = cArr[gVar.f19924d];
                        cArr3[1] = cArr[gVar.f19924d / 0];
                        i3 = 1;
                    } else {
                        cArr3[0] = cArr[gVar.f19924d];
                        cArr3[1] = cArr[gVar.f19924d + 1];
                        i3 = 0;
                    }
                    while (i3 < 16) {
                        int i12 = $10 + 49;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        char c2 = cArr3[1];
                        char c3 = cArr3[0];
                        try {
                            Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i11) ^ ((c3 << 4) + ((char) (((long) f26562g) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f26561f)};
                            Object objA = o.d.d.a(1603517628);
                            if (objA == null) {
                                byte b2 = (byte) 1;
                                byte b3 = (byte) (b2 - 1);
                                objA = o.d.d.a(270 - Color.alpha(0), (char) (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) + 12, -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i11) ^ ((cCharValue << 4) + ((char) (((long) f26560e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f26559c)};
                            Object objA2 = o.d.d.a(1603517628);
                            if (objA2 == null) {
                                byte b4 = (byte) 1;
                                byte b5 = (byte) (b4 - 1);
                                objA2 = o.d.d.a(AndroidCharacter.getMirror('0') + 222, (char) View.resolveSize(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            i11 -= 40503;
                            i3++;
                            int i14 = $10 + 11;
                            $11 = i14 % 128;
                            if (i14 % 2 == 0) {
                                int i15 = 3 / 4;
                            }
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
                        objA3 = o.d.d.a(Process.getGidForName("") + 271, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - Color.blue(0), -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2, 0, i22);
            }

            @Override // o.ca.e
            public final void b(i iVar) throws Throwable {
                String strIntern;
                Object obj;
                int i22 = 2 % 2;
                if (o.ea.f.a()) {
                    int i3 = f26564i + 67;
                    f26563h = i3 % 128;
                    if (i3 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        j("䈪䍲栃䲺\ue41d滃貃ց阑\uf8de跭딑㝶ⓜ㖿Ⓒ\u1758\u191f풪쳩쁆蚮䍌葩\ue41d滃옕몋搕\ue091옕몋ﬔ噕ᚈ⯖䍌葩⹒勎", 30 / TextUtils.indexOf("", "", 0, 0), objArr);
                        strIntern = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        j("阑\uf8deᔜ쾁\ue522胋圱霖\ue41d滃옕몋ᔎ㐠ഒ㷑\ueeed\uea5f둬짟꽰㲁\ue41d滃爝\ud949췯\u1a1d继퍴섞ᡠ籒\ud8ca栃䲺襱\uf30d沑☭芺\u001b췯\u1a1d继퍴섞ᡠ\uf174裡❕⊝㧨줙풎ླྀ胋᷺", 52 >>> (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                        obj = objArr2[0];
                    } else {
                        Object[] objArr3 = new Object[1];
                        j("䈪䍲栃䲺\ue41d滃貃ց阑\uf8de跭딑㝶ⓜ㖿Ⓒ\u1758\u191f풪쳩쁆蚮䍌葩\ue41d滃옕몋搕\ue091옕몋ﬔ噕ᚈ⯖䍌葩⹒勎", 40 - TextUtils.indexOf("", "", 0, 0), objArr3);
                        strIntern = ((String) objArr3[0]).intern();
                        Object[] objArr4 = new Object[1];
                        j("阑\uf8deᔜ쾁\ue522胋圱霖\ue41d滃옕몋ᔎ㐠ഒ㷑\ueeed\uea5f둬짟꽰㲁\ue41d滃爝\ud949췯\u1a1d继퍴섞ᡠ籒\ud8ca栃䲺襱\uf30d沑☭芺\u001b췯\u1a1d继퍴섞ᡠ\uf174裡❕⊝㧨줙풎ླྀ胋᷺", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 57, objArr4);
                        obj = objArr4[0];
                    }
                    o.ea.f.c(strIntern, ((String) obj).intern());
                }
                atomicBoolean.set(true);
                countDownLatch.countDown();
                int i4 = f26563h + 111;
                f26564i = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            @Override // o.ca.e
            public final void d(i iVar, o.j.b bVar) throws Throwable {
                int i22 = 2 % 2;
                if (o.ea.f.a()) {
                    int i3 = f26563h + 53;
                    f26564i = i3 % 128;
                    int i4 = i3 % 2;
                    Object[] objArr = new Object[1];
                    j("䈪䍲栃䲺\ue41d滃貃ց阑\uf8de跭딑㝶ⓜ㖿Ⓒ\u1758\u191f풪쳩쁆蚮䍌葩\ue41d滃옕몋搕\ue091옕몋ﬔ噕ᚈ⯖䍌葩⹒勎", 41 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    j("阑\uf8deᔜ쾁\ue522胋圱霖\ue41d滃옕몋ᔎ㐠ഒ㷑\ueeed\uea5f둬짟꽰㲁\ue41d滃爝\ud949췯\u1a1d继퍴섞ᡠ籒\ud8ca魘깦㾢ⰷ꽰㲁\ue41d滃鲯\uf670\udc91⫃阑\uf8de跭딑㴆⯄풪쳩視\uf503꜂⑹圱霖", (ViewConfiguration.getLongPressTimeout() >> 16) + 60, objArr2);
                    o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                }
                countDownLatch.countDown();
                int i5 = f26564i + 45;
                f26563h = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        try {
            countDownLatch2.await();
        } catch (InterruptedException unused) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                u("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{88, 40, 0, 34}, true, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                u("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{166, 68, 0, 0}, false, objArr2);
                o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
                int i3 = f26555e + 39;
                f26552b = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return atomicBoolean2.get();
    }
}
