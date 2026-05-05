package o.er;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.digitalcard.DigitalCardServiceStatus;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.AndroidActivityResultCallback;
import fr.antelop.sdk.util.OperationCallback;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import o.eo.e;
import o.ep.i;
import o.es.c;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d<T extends o.es.c<?>> extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b */
    public static int f24831b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24832c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24833d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24834e = 0;

    /* JADX INFO: renamed from: f */
    private static int f24835f = 0;

    /* JADX INFO: renamed from: h */
    private static int f24836h = 0;

    /* JADX INFO: renamed from: i */
    private static byte[] f24837i = null;

    /* JADX INFO: renamed from: j */
    private static int f24838j = 0;

    /* JADX INFO: renamed from: l */
    private static short[] f24839l = null;

    /* JADX INFO: renamed from: m */
    private static int f24840m = 0;

    /* JADX INFO: renamed from: n */
    private static long f24841n = 0;

    /* JADX INFO: renamed from: o */
    private static int f24842o = 0;

    /* JADX INFO: renamed from: u */
    public static int f24843u = 0;

    /* JADX INFO: renamed from: v */
    public static int f24844v = 0;

    /* JADX INFO: renamed from: w */
    public static int f24845w = 0;

    /* JADX INFO: renamed from: o.er.d$1 */
    public class AnonymousClass1 implements c.a<c.e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f24846a = 0;

        /* JADX INFO: renamed from: b */
        private static long f24847b = 0;

        /* JADX INFO: renamed from: c */
        private static char[] f24848c = null;

        /* JADX INFO: renamed from: f */
        public static int f24849f = 0;

        /* JADX INFO: renamed from: g */
        public static int f24850g = 0;

        /* JADX INFO: renamed from: h */
        public static int f24851h = 0;

        /* JADX INFO: renamed from: j */
        private static int f24852j = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Activity f24853d;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r8, int r9, byte r10) {
            /*
                int r8 = r8 + 4
                byte[] r7 = o.er.d.AnonymousClass1.$$c
                int r0 = 105 - r9
                int r2 = r10 * 3
                int r1 = 1 - r2
                byte[] r6 = new byte[r1]
                r5 = 0
                int r4 = 0 - r2
                if (r7 != 0) goto L2a
                r2 = r4
                r3 = r5
            L13:
                int r0 = -r0
                int r0 = r0 + r2
                r2 = r3
            L16:
                byte r1 = (byte) r0
                r6[r2] = r1
                int r3 = r2 + 1
                if (r2 != r4) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L23:
                int r8 = r8 + 1
                r1 = r7[r8]
                r2 = r0
                r0 = r1
                goto L13
            L2a:
                r2 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass1.$$e(byte, int, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f24851h = 977982473;
            f24850g = -76166078;
            f24849f = 352107771;
            init$0();
            f24846a = 0;
            f24852j = 1;
            f24848c = new char[]{38043, 50158, 14952, 37594, 51500, 8620, 38927, 61596, 12271, 34407, 65255, 21848, 36264, 58431, 23685, 35600, 57974, 23240, 45400, 19049, 7440, 58537, 19495, 6091, 65371, 18147, 11857, 61705, 22667, 8204, 35774, 21320, 15048, 33387, 22008, 15499, 33843, 38035, 50163, 14920, 37581, 51489, 8624, 38924, 61653, 12261, 34406, 65162, 21875, 36259, 58419, 23701, 35604, 43596, 64895, 1220, 44125, 63472, 7971, 42652, 52760, 4469, 47329, 49241, 27529, 45875, 55973, 25107, 46487, 56564, 25619, 36825, 55084, 32430, 34331, 10624, 28916, 39020, 9115, 19270, 37539, 14901, 19842, 38148, 15484, 18423, 61299, 13993, 24124, 57758, 2315, 20604, 64504, 6282, 20452, 46666, 38109, 50157, 14942, 37584, 51501, 8694, 38939, 61570, 12281, 34362, 65231, 21842, 36276, 58431, 23685, 35615, 57901, 23243, 45384, 59837, 16447, 47242, 5917, 20052, 42751, 7499, 30165, 44069, 1210, 29444, 43924, 38083, 38109, 50158, 14933, 37580, 51553, 8626, 38925, 61577, 12260, 34416, 65224, 21784, 36258, 58420, 23682, 35590, 57957, 23170, 45384, 59837, 16447, 47242, 5905, 20069, 42749, 7434, 30144, 44085, 1207, 29442, 43929, 749, 31093, 53730, 2083, 24753};
            f24847b = -6827391567890693219L;
        }

        AnonymousClass1(Activity activity) {
            activity = activity;
        }

        private void b(c.e eVar) {
            int i2 = 2 % 2;
            int i3 = f24852j + 33;
            f24846a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass7.f24964b[eVar.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    d.this.b(activity).b(activity);
                    return;
                } else if (i5 != 3) {
                    return;
                }
            }
            int i6 = f24852j + 27;
            f24846a = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:232|155|(2:157|(4:160|229|161|162))(6:163|222|164|(1:166)(1:172)|167|(10:169|(2:174|181)(1:173)|231|182|(2:184|186)(1:185)|187|(4:189|236|190|191)(1:195)|(4:226|197|(2:199|206)(4:200|224|201|202)|(2:210|(2:212|213)))|208|209)(1:175))|159|231|182|(0)(0)|187|(0)(0)|(0)|208|209) */
        /* JADX WARN: Removed duplicated region for block: B:184:0x053c  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x053d  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x0546 A[Catch: Exception -> 0x0587, TRY_LEAVE, TryCatch #5 {Exception -> 0x0587, blocks: (B:182:0x050d, B:189:0x0546, B:191:0x0578, B:193:0x0580, B:194:0x0586, B:190:0x0550), top: B:231:0x050d, inners: #8 }] */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0587  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x058a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(int r34, int r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1744
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass1.d(int, int):java.lang.Object[]");
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void i(char r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 451
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass1.i(char, int, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
            $$b = PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        }

        static void init$1() {
            $$c = new byte[]{60, 66, -100, 104};
            $$d = 204;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void k(int r8, short r9, int r10, java.lang.Object[] r11) {
            /*
                int r0 = r10 * 4
                int r7 = r0 + 100
                byte[] r6 = o.er.d.AnonymousClass1.$$a
                int r5 = r8 + 4
                int r4 = r9 * 4
                int r0 = r4 + 1
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r6 != 0) goto L2a
                r1 = r2
                r0 = r5
            L13:
                int r5 = r5 + r7
                r7 = r5
                r5 = r0
            L16:
                byte r0 = (byte) r7
                r3[r1] = r0
                if (r1 != r4) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                r11[r2] = r0
                return
            L23:
                int r0 = r5 + 1
                int r1 = r1 + 1
                r5 = r6[r0]
                goto L13
            L2a:
                r1 = r2
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass1.k(int, short, int, java.lang.Object[]):void");
        }

        @Override // o.es.c.a
        public final /* synthetic */ void a(c.e eVar) {
            int i2 = 2 % 2;
            int i3 = f24852j + 99;
            f24846a = i3 % 128;
            int i4 = i3 % 2;
            b(eVar);
            if (i4 != 0) {
                int i5 = 1 / 0;
            }
        }

        @Override // o.es.c.a
        public final void d(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24852j + 37;
            f24846a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 85 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: o.er.d$2 */
    public class AnonymousClass2 implements c.a<c.e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: c */
        private static int f24855c = 0;

        /* JADX INFO: renamed from: f */
        private static byte[] f24856f = null;

        /* JADX INFO: renamed from: g */
        private static int f24857g = 0;

        /* JADX INFO: renamed from: h */
        private static int f24858h = 0;

        /* JADX INFO: renamed from: i */
        private static short[] f24859i = null;

        /* JADX INFO: renamed from: j */
        private static int f24860j = 0;

        /* JADX INFO: renamed from: k */
        public static int f24861k = 0;

        /* JADX INFO: renamed from: l */
        public static int f24862l = 0;

        /* JADX INFO: renamed from: m */
        public static int f24863m = 0;

        /* JADX INFO: renamed from: o */
        private static int f24864o = 0;

        /* JADX INFO: renamed from: a */
        final /* synthetic */ OperationCallback f24865a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ o.ea.j f24866b;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Activity f24868e;

        /* JADX INFO: renamed from: o.er.d$2$4 */
        public class AnonymousClass4 implements c.a<Object> {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;
            public static int A = 0;
            public static int B = 0;
            public static int C = 0;
            public static int D = 0;
            public static int E = 0;
            public static int F = 0;
            public static int G = 0;
            public static int H = 0;
            public static int I = 0;
            public static int J = 0;
            public static int K = 0;
            public static int L = 0;
            public static int M = 0;
            public static int N = 0;
            public static int O = 0;
            public static int P = 0;
            public static int Q = 0;
            public static int R = 0;
            public static int S = 0;
            public static int T = 0;
            public static int U = 0;
            public static int V = 0;
            public static int W = 0;
            public static int X = 0;
            public static int Y = 0;
            public static int Z = 0;

            /* JADX INFO: renamed from: a */
            private static int f24869a = 0;
            public static int aa = 0;
            public static int ab = 0;

            /* JADX INFO: renamed from: c */
            private static int f24870c = 0;

            /* JADX INFO: renamed from: d */
            private static byte[] f24871d = null;

            /* JADX INFO: renamed from: e */
            private static int f24872e = 0;

            /* JADX INFO: renamed from: f */
            private static int f24873f = 0;

            /* JADX INFO: renamed from: g */
            private static short[] f24874g = null;

            /* JADX INFO: renamed from: h */
            public static int f24875h = 0;

            /* JADX INFO: renamed from: i */
            private static int f24876i = 0;

            /* JADX INFO: renamed from: j */
            private static long f24877j = 0;

            /* JADX INFO: renamed from: k */
            public static int f24878k = 0;

            /* JADX INFO: renamed from: l */
            public static int f24879l = 0;

            /* JADX INFO: renamed from: m */
            public static int f24880m = 0;

            /* JADX INFO: renamed from: n */
            public static int f24881n = 0;

            /* JADX INFO: renamed from: o */
            public static int f24882o = 0;

            /* JADX INFO: renamed from: p */
            public static int f24883p = 0;

            /* JADX INFO: renamed from: q */
            public static int f24884q = 0;

            /* JADX INFO: renamed from: r */
            public static int f24885r = 0;

            /* JADX INFO: renamed from: s */
            public static int f24886s = 0;

            /* JADX INFO: renamed from: t */
            public static int f24887t = 0;

            /* JADX INFO: renamed from: u */
            public static int f24888u = 0;

            /* JADX INFO: renamed from: v */
            public static int f24889v = 0;

            /* JADX INFO: renamed from: w */
            public static int f24890w = 0;

            /* JADX INFO: renamed from: x */
            public static int f24891x = 0;

            /* JADX INFO: renamed from: y */
            public static int f24892y = 0;

            /* JADX INFO: renamed from: z */
            public static int f24893z = 0;

            /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(int r8, byte r9, int r10) {
                /*
                    int r0 = r8 * 2
                    int r8 = 1 - r0
                    int r0 = r10 * 2
                    int r7 = 3 - r0
                    byte[] r6 = o.er.d.AnonymousClass2.AnonymousClass4.$$c
                    int r0 = 114 - r9
                    byte[] r5 = new byte[r8]
                    r4 = 0
                    if (r6 != 0) goto L2b
                    r1 = r8
                    r2 = r7
                    r3 = r4
                L14:
                    int r0 = -r1
                    int r7 = r7 + r0
                    r0 = r7
                    r7 = r2
                L18:
                    int r2 = r7 + 1
                    byte r1 = (byte) r0
                    r5[r3] = r1
                    int r3 = r3 + 1
                    if (r3 != r8) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L27:
                    r1 = r6[r2]
                    r7 = r0
                    goto L14
                L2b:
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.AnonymousClass4.$$e(int, byte, int):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                ab = 293210089;
                aa = 522909786;
                Z = -967275777;
                Y = 408235578;
                X = -1314574856;
                W = 1749180554;
                V = 1682513726;
                U = -184443793;
                T = 863666394;
                S = -2145444700;
                R = 606641137;
                Q = 1914063032;
                P = -947800270;
                O = -358808596;
                N = -1822945934;
                M = 564244735;
                L = -1510271880;
                K = 2024382019;
                J = -605034629;
                I = -1132666707;
                H = -821480357;
                G = -488630647;
                F = -553910669;
                E = 826423998;
                D = 658566884;
                C = 1214461040;
                B = -2012550439;
                A = 2142103839;
                f24893z = 1904395441;
                f24892y = -27297133;
                f24891x = 474401505;
                f24890w = -336990909;
                f24889v = -1916054705;
                f24888u = 1834322622;
                f24887t = -1893062882;
                f24886s = 1077874875;
                f24885r = 2061320819;
                f24884q = 1114163379;
                f24883p = -1516046180;
                f24882o = -1861411244;
                f24881n = -445287052;
                f24880m = 1180629656;
                f24879l = -1417930749;
                f24878k = -117349553;
                f24875h = 1456153715;
                init$0();
                f24876i = 0;
                f24873f = 1;
                f24872e = -1063490180;
                f24870c = 1150422424;
                f24869a = -1022853115;
                f24871d = new byte[]{123, -128, 98, -103, 96, -127, 98, -118, 73, MessagePack.Code.UINT8, -114, -113, -124, 2, Ascii.DC4, 112, 96, -115, Ascii.SUB, 0, -114, -124, Ascii.US, 86, MessagePack.Code.FIXEXT2, 96, 33, 96, Ascii.FS, Ascii.DC4, -115, MessagePack.Code.UINT16, MessagePack.Code.FIXEXT4, Ascii.DC4, -124, -115, 91, 93, -119, 121, -120, 67, 89, -121, -115, 90, -97, 73, 118, 89, -119, 64, -124, MessagePack.Code.BIN16, 0, 121, 108, 121, 85, 93, -120, MessagePack.Code.EXT16, Ascii.US, 93, 124, 95, 59, 95, 66, 39, 121, 80, 50, 107, 80, 81, 116, 93, 64, 117, -99, -16, 119, -126, 35, -119, 77, 71, MessagePack.Code.BIN16, 59, -117, 49, 125, -109, -23, -105, -102, 124, 100, -113, -92, -116, -66, 96, -66, 118, -21, MessagePack.Code.FIXEXT16, 52, -24, -84, 99, -24, MessagePack.Code.INT64, Utf8.REPLACEMENT_BYTE, -24, MessagePack.Code.FIXEXT1, 60, MessagePack.Code.INT8, 33, -22, 120, MessagePack.Code.INT32, -97, Ascii.NAK, -26, 89, -10, 86, -21, 92, 116, -98, 97, -117, 97, -104, -103, 86, -107, 106, -107, -125, -107, 84, 96, MessagePack.Code.MAP16, 96, 91, 118, MessagePack.Code.ARRAY16, 37, 59, MessagePack.Code.EXT32, 37, 100, -125, 41, -77, 53, MessagePack.Code.INT16, 19, MessagePack.Code.TRUE, 41, MessagePack.Code.UINT8, 121, -67, MessagePack.Code.ARRAY16, -66, -76, MessagePack.Code.UINT64, MessagePack.Code.UINT64, -104, -85, 123, -98, MessagePack.Code.UINT64, -110, -99, MessagePack.Code.UINT8, MessagePack.Code.NEVER_USED, -110, MessagePack.Code.BIN16, -98, MessagePack.Code.UINT32, 119, -13, 64, Ascii.SI, -10, 64, Ascii.SO, 89, -7, 65, 66, Ascii.SI, 94, -13, 67, 116, -14, MessagePack.Code.FIXEXT16, 8, MessagePack.Code.NIL, MessagePack.Code.TRUE, Ascii.CR, -29, MessagePack.Code.MAP16, MessagePack.Code.ARRAY32, -16, MessagePack.Code.NEVER_USED, Ascii.FF, MessagePack.Code.ARRAY16, 122, 0, 92, 66, 118, 1, 75, 48, 64, 57, 93, -97, 123, -28, -22, Ascii.RS, -81, -31, MessagePack.Code.FIXEXT16, -24, MessagePack.Code.FIXEXT8, -21, 37, 122, 80, 86, -123, 36, -83, 103, 124, 108, 117, 81, 19, 123, Utf8.REPLACEMENT_BYTE, Base64.padSymbol, 81, -25, 33, 57, -84, 59, -107, -3, 125, -74, -80, -24, 119, 98, 51, 19, -24, 117, 8, Ascii.SI, -14, 1, -79, MessagePack.Code.TRUE, Ascii.SO, MessagePack.Code.MAP32, -2, Ascii.US, -118, MessagePack.Code.BIN8, 123, -91, MessagePack.Code.INT8, -81, MessagePack.Code.STR8, -84, -82, MessagePack.Code.INT16, MessagePack.Code.ARRAY32, -66, MessagePack.Code.BIN8, 127, 127, 51, 125, 52, 127, 53, -113, 104, 86, 106, 104, 106, 106, -115, 111, 104, 103, 44, -67, 98, 110, 47, -94, 107, 82, 126, 107, 87, 127, 118, 42, -26, -28, MessagePack.Code.FIXEXT16, 40, MessagePack.Code.NEGFIXINT_PREFIX, 45, Ascii.ETB, -24, -18, Base64.padSymbol, Ascii.RS, -8, 46, MessagePack.Code.FIXEXT4, 113, 120, -76, -74, -99, MessagePack.Code.NEGFIXINT_PREFIX, 122, -94, -87, -89, -70, -20, 121, -100, MessagePack.Code.FLOAT32, -84, -28, 113, MessagePack.Code.EXT16, -127, 80, 76, -124, -126, 94, 92, 48, -125, 85, 114, 66, -117, 95, Ascii.EM, 118, -85, -25, -31, 114, 19, -83, -101, 36, -86, MessagePack.Code.INT8, -101, -21, -126, -26, 36, -119, Ascii.DC2, 116, 121, 108, -76, 32, 110, 121, 102, -72, 33, 95, -95, 44, 110, 111, -73, 59, 97, 104, 120, 83, 119, -75, 117, 102, -94, MessagePack.Code.FIXSTR_PREFIX, 79, -18, 103, -87, 86, -90, 95, -93, -3, 124, 48, 120, 99, 114, MessagePack.Code.UINT64, 127, -85, -110, -91, -110, -82, 106, 125, -101, -82, -70, -98};
                f24877j = -6088389423577906933L;
            }

            AnonymousClass4() {
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void ac(short r7, byte r8, int r9, java.lang.Object[] r10) {
                /*
                    int r0 = r7 + 97
                    int r1 = r8 * 3
                    int r8 = 4 - r1
                    byte[] r7 = o.er.d.AnonymousClass2.AnonymousClass4.$$a
                    int r6 = r9 * 3
                    int r1 = r6 + 1
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    if (r7 != 0) goto L2b
                    r3 = r6
                    r2 = r4
                L13:
                    int r0 = -r0
                    int r0 = r0 + r3
                    int r8 = r8 + 1
                L17:
                    byte r1 = (byte) r0
                    r5[r2] = r1
                    if (r2 != r6) goto L24
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    r10[r4] = r0
                    return
                L24:
                    r1 = r7[r8]
                    int r2 = r2 + 1
                    r3 = r0
                    r0 = r1
                    goto L13
                L2b:
                    r2 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.AnonymousClass4.ac(short, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:110:0x01b0 A[PHI: r4
  0x01b0: PHI (r4v13 int) = (r4v3 int), (r4v16 int) binds: [B:113:0x01c6, B:109:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:115:0x01c9 A[PHI: r4
  0x01c9: PHI (r4v4 int) = (r4v3 int), (r4v16 int) binds: [B:113:0x01c6, B:109:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void ad(short r25, int r26, int r27, int r28, byte r29, java.lang.Object[] r30) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 720
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.AnonymousClass4.ad(short, int, int, int, byte, java.lang.Object[]):void");
            }

            private static void ae(String str, int i2, Object[] objArr) throws Throwable {
                Object obj;
                String str2 = str;
                int i3 = 2 % 2;
                if (str2 != null) {
                    char[] charArray = str2.toCharArray();
                    int i4 = $11 + 21;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    obj = charArray;
                } else {
                    obj = str2;
                }
                o.a.k kVar = new o.a.k();
                char[] cArrC = o.a.k.c(f24877j ^ (-5882309809461882246L), (char[]) obj, i2);
                kVar.f19939c = 4;
                while (kVar.f19939c < cArrC.length) {
                    int i6 = $11 + 21;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    kVar.f19938a = kVar.f19939c - 4;
                    int i8 = kVar.f19939c;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f24877j)};
                        Object objA = o.d.d.a(-1093976004);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 230, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51005), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9, 1749983833, false, $$e(b2, (byte) (7 | b2), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {kVar, kVar};
                        Object objA2 = o.d.d.a(-912105096);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA2 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 675, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) + 12, 522683165, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
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
                objArr[0] = new String(cArrC, 4, cArrC.length - 4);
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(Unknown Source)
                	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] e$4a7e738d(int r45, java.lang.Object r46) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 18086
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.AnonymousClass4.e$4a7e738d(int, java.lang.Object):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{35, 9, MessagePack.Code.STR32, -91};
                $$b = 11;
            }

            static void init$1() {
                $$c = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
                $$d = 42;
            }

            @Override // o.es.c.a
            public final void a(Object obj) {
                int i2 = 2 % 2;
                int i3 = f24876i + 73;
                f24873f = i3 % 128;
                int i4 = i3 % 2;
                operationCallback.onSuccess(null);
                int i5 = f24873f + 65;
                f24876i = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) {
                int i2 = 2 % 2;
                int i3 = f24876i + 53;
                f24873f = i3 % 128;
                if (i3 % 2 != 0) {
                    operationCallback.onError(cVar.a());
                } else {
                    operationCallback.onError(cVar.a());
                    throw null;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r6, int r7, byte r8) {
            /*
                int r7 = r7 * 4
                int r1 = r7 + 1
                int r0 = r8 * 4
                int r0 = 3 - r0
                int r6 = r6 + 103
                byte[] r5 = o.er.d.AnonymousClass2.$$c
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r5 != 0) goto L27
                r2 = r0
                r1 = r3
            L13:
                int r6 = r6 + r0
                r0 = r2
            L15:
                int r2 = r0 + 1
                byte r0 = (byte) r6
                r4[r1] = r0
                if (r1 != r7) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L22:
                int r1 = r1 + 1
                r0 = r5[r2]
                goto L13
            L27:
                r1 = r3
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.$$e(short, int, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f24863m = 1407037253;
            f24862l = 1084414753;
            f24861k = -125436321;
            init$0();
            f24858h = 0;
            f24864o = 1;
            f24855c = -416120942;
            f24860j = 1150422526;
            f24857g = 1712166891;
            f24856f = new byte[]{45, 114, 124, -100, 115, 122, -115, 114, -95, 92, -128, 115, -115, 127, -98, 112, -84, 92, -121, Ascii.DC2, -128, 115, -115, 127, -98, 112, -84, 95, -114, -92, 82, 116, -120, 120, -122, -123, 103, 16, 127, -98, 112, -84, -101, 54, -119, MessagePack.Code.UINT8, 71, 118, 119, 112, -125, 123, -128, 56, -128, -113, -113, 98, 115, -104, 102, -117, -124, 126, -115, 112, -97, -71, 69, 116, -120, -117, -113, 98, 115, MessagePack.Code.EXT16, 69, 127, -98, 112, -116, -72, 78, -118, 122, 113, -128, 119, -79, 49, 119, -117, MessagePack.Code.EXT32, Ascii.GS, -116, -116, 33, 114, 116, -121, -116, 126, -124, -117, 119, -113, -113, 98, 115, -125, -70, 78, -118, 122, 113, -128, 119, -79, 49, 119, -117, MessagePack.Code.EXT32, 65, 121, 112, -113, MessagePack.Code.UINT8, 3, 60, 114, -99, 117, 116, -120, -117, -113, 98, 115, MessagePack.Code.EXT16, 69, 116, -120, -117, -113, 98, 115, MessagePack.Code.EXT16, 69, 127, -98, 112, -116, -72, 78, -118, 122, 113, -128, 119, -79, 49, 119, -117, MessagePack.Code.EXT32};
        }

        AnonymousClass2(OperationCallback operationCallback, Activity activity, o.ea.j jVar) {
            operationCallback = operationCallback;
            activity = activity;
            jVar = jVar;
        }

        private void b(c.e eVar) {
            int i2 = 2 % 2;
            int i3 = f24864o + 15;
            f24858h = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = AnonymousClass7.f24964b[eVar.ordinal()];
                throw null;
            }
            int i5 = AnonymousClass7.f24964b[eVar.ordinal()];
            if (i5 == 1) {
                operationCallback.onSuccess(null);
                return;
            }
            if (i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                operationCallback.onError(new o.by.c(AntelopErrorCode.GooglePayWalletNotAvailable).a());
            } else {
                d.this.b(activity).d(activity, new AnonymousClass4(), jVar);
                int i6 = f24858h + 101;
                f24864o = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:118|(2:170|119)|(1:121)(4:122|171|123|(9:125|131|177|132|(1:134)(7:135|178|136|137|(4:175|143|(2:145|146)(4:154|173|155|156)|(2:(1:149)(1:153)|(2:151|152)))|160|161)|141|(0)|160|161)(1:126))|130|131|177|132|(0)(0)|141|(0)|160|161) */
        /* JADX WARN: Removed duplicated region for block: B:134:0x056a  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x056b A[Catch: Exception -> 0x05c7, TRY_LEAVE, TryCatch #5 {Exception -> 0x05c7, blocks: (B:132:0x0522, B:135:0x056b, B:137:0x05b8, B:139:0x05c0, B:140:0x05c6, B:136:0x0575), top: B:177:0x0522, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x05ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] e(int r29, int r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1912
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.e(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
            $$b = 31;
        }

        static void init$1() {
            $$c = new byte[]{94, -66, 120, 126};
            $$d = 230;
        }

        /* JADX WARN: Removed duplicated region for block: B:124:0x01b7 A[PHI: r4
  0x01b7: PHI (r4v16 int) = (r4v3 int), (r4v19 int) binds: [B:127:0x01cd, B:123:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01d0 A[PHI: r4
  0x01d0: PHI (r4v4 int) = (r4v3 int), (r4v19 int) binds: [B:127:0x01cd, B:123:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void n(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 749
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.n(short, int, int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void p(short r8, short r9, int r10, java.lang.Object[] r11) {
            /*
                int r7 = r9 + 4
                byte[] r6 = o.er.d.AnonymousClass2.$$a
                int r0 = r8 * 3
                int r5 = r0 + 1
                int r0 = r10 * 2
                int r4 = 100 - r0
                byte[] r3 = new byte[r5]
                r2 = 0
                if (r6 != 0) goto L29
                r0 = r4
                r1 = r2
                r4 = r5
            L14:
                int r4 = r4 + r0
            L15:
                byte r0 = (byte) r4
                r3[r1] = r0
                int r1 = r1 + 1
                if (r1 != r5) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                r11[r2] = r0
                return
            L24:
                int r7 = r7 + 1
                r0 = r6[r7]
                goto L14
            L29:
                r1 = r2
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.p(short, short, int, java.lang.Object[]):void");
        }

        @Override // o.es.c.a
        public final /* synthetic */ void a(c.e eVar) {
            int i2 = 2 % 2;
            int i3 = f24858h + 23;
            f24864o = i3 % 128;
            int i4 = i3 % 2;
            b(eVar);
            if (i4 == 0) {
                int i5 = 27 / 0;
            }
        }

        @Override // o.es.c.a
        public final void d(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24858h + 51;
            f24864o = i3 % 128;
            if (i3 % 2 != 0) {
                operationCallback.onError(cVar.a());
            } else {
                operationCallback.onError(cVar.a());
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: o.er.d$3 */
    final class AnonymousClass3 implements c.a<c.e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static long f24895a = 0;

        /* JADX INFO: renamed from: c */
        private static int f24896c = 0;

        /* JADX INFO: renamed from: g */
        private static int f24897g = 0;

        /* JADX INFO: renamed from: i */
        private static int f24898i = 0;

        /* JADX INFO: renamed from: j */
        private static char f24899j = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ o.es.c f24900b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ OperationCallback f24901d;

        /* JADX INFO: renamed from: o.er.d$3$5 */
        final class AnonymousClass5 implements c.a<List<o.es.e>> {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static int[] f24903a = null;

            /* JADX INFO: renamed from: b */
            private static int f24904b = 0;

            /* JADX INFO: renamed from: d */
            private static int f24905d = 0;

            /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0017). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(int r7, int r8, byte r9) {
                /*
                    int r0 = r8 * 2
                    int r8 = 121 - r0
                    int r2 = r9 * 2
                    int r1 = 1 - r2
                    int r0 = r7 * 2
                    int r7 = 4 - r0
                    byte[] r6 = o.er.d.AnonymousClass3.AnonymousClass5.$$a
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    int r3 = 0 - r2
                    if (r6 != 0) goto L2f
                    r2 = r4
                    r1 = r7
                L17:
                    int r7 = r7 + r8
                    int r0 = r1 + 1
                    r1 = r2
                    r8 = r7
                    r7 = r0
                L1d:
                    byte r0 = (byte) r8
                    r5[r1] = r0
                    int r2 = r1 + 1
                    if (r1 != r3) goto L2a
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L2a:
                    r0 = r6[r7]
                    r1 = r7
                    r7 = r0
                    goto L17
                L2f:
                    r1 = r4
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.AnonymousClass5.$$c(int, int, byte):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f24905d = 0;
                f24904b = 1;
                f24903a = new int[]{48671810, 1936437802, 1574723672, -950202625, -946716899, 1094138493, -1757708347, -1306263363, 1087724733, -818821012, 1475572466, 126245207, -1579010168, 1981941533, 2090396687, 1569749381, 68820207, 500068555};
            }

            AnonymousClass5() {
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x001c  */
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void a2(java.util.List<o.es.e> r16) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 648
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.AnonymousClass5.a2(java.util.List):void");
            }

            private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                o.a.l lVar = new o.a.l();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = f24903a;
                int i4 = 989264422;
                char c2 = 1;
                int i5 = 0;
                if (iArr2 != null) {
                    int i6 = $11 + 107;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                            Object objA = o.d.d.a(i4);
                            if (objA == null) {
                                int i9 = (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)) + 675;
                                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 12;
                                byte b2 = $$a[1];
                                byte b3 = b2;
                                objA = o.d.d.a(i9, cAxisFromString, pressedStateDuration, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                            i8++;
                            i4 = 989264422;
                            i5 = 0;
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
                int[] iArr5 = f24903a;
                long j2 = 0;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i10 = 0;
                    while (i10 < length3) {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 675;
                            char c3 = (char) (1 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)));
                            int iIndexOf = 12 - TextUtils.indexOf("", "", 0);
                            byte b4 = $$a[c2];
                            byte b5 = b4;
                            objA2 = o.d.d.a(i11, c3, iIndexOf, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                        i10++;
                        j2 = 0;
                        c2 = 1;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                lVar.f19941d = 0;
                int i12 = $11 + 47;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                while (lVar.f19941d < iArr.length) {
                    cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                    cArr[1] = (char) iArr[lVar.f19941d];
                    cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                    cArr[3] = (char) iArr[lVar.f19941d + 1];
                    lVar.f19942e = (cArr[0] << 16) + cArr[1];
                    lVar.f19940a = (cArr[2] << 16) + cArr[3];
                    o.a.l.a(iArr4);
                    int i14 = 0;
                    for (int i15 = 16; i14 < i15; i15 = 16) {
                        int i16 = $11 + 65;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            lVar.f19942e ^= iArr4[i14];
                            Object[] objArr4 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                            Object objA3 = o.d.d.a(2098218801);
                            if (objA3 == null) {
                                int iIndexOf2 = 300 - TextUtils.indexOf((CharSequence) "", '0');
                                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 52697);
                                int iIndexOf3 = 10 - TextUtils.indexOf((CharSequence) "", '0');
                                byte b6 = $$a[1];
                                byte b7 = b6;
                                objA3 = o.d.d.a(iIndexOf2, deadChar, iIndexOf3, -1416256172, false, $$c(b7, (byte) (b7 + 1), b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                            lVar.f19942e = lVar.f19940a;
                            lVar.f19940a = iIntValue;
                            i14 += 6;
                        } else {
                            lVar.f19942e ^= iArr4[i14];
                            Object[] objArr5 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                            Object objA4 = o.d.d.a(2098218801);
                            if (objA4 == null) {
                                int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 300;
                                char size = (char) (52697 - View.MeasureSpec.getSize(0));
                                int iBlue = 11 - Color.blue(0);
                                byte b8 = $$a[1];
                                byte b9 = b8;
                                objA4 = o.d.d.a(i17, size, iBlue, -1416256172, false, $$c(b9, (byte) (b9 + 1), b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                            lVar.f19942e = lVar.f19940a;
                            lVar.f19940a = iIntValue2;
                            i14++;
                        }
                    }
                    int i18 = lVar.f19942e;
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = i18;
                    lVar.f19940a ^= iArr4[16];
                    lVar.f19942e ^= iArr4[17];
                    int i19 = lVar.f19942e;
                    int i20 = lVar.f19940a;
                    cArr[0] = (char) (lVar.f19942e >>> 16);
                    cArr[1] = (char) lVar.f19942e;
                    cArr[2] = (char) (lVar.f19940a >>> 16);
                    cArr[3] = (char) lVar.f19940a;
                    o.a.l.a(iArr4);
                    cArr2[lVar.f19941d * 2] = cArr[0];
                    cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                    cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                    cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                    Object[] objArr6 = {lVar, lVar};
                    Object objA5 = o.d.d.a(986820978);
                    if (objA5 == null) {
                        int gidForName = 228 - Process.getGidForName("");
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 51005);
                        int iRgb = (-16777207) - Color.rgb(0, 0, 0);
                        byte b10 = $$a[1];
                        byte b11 = b10;
                        objA5 = o.d.d.a(gidForName, cIndexOf, iRgb, -330018025, false, $$c(b11, (byte) (b11 + 2), b10), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr2, 0, i2);
            }

            static void init$0() {
                $$a = new byte[]{88, 0, 126, -69};
                $$b = 94;
            }

            @Override // o.es.c.a
            public final /* bridge */ /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                int i2 = 2 % 2;
                int i3 = f24904b + 21;
                f24905d = i3 % 128;
                int i4 = i3 % 2;
                a2(list);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = f24905d + 69;
                f24904b = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0018  */
            @Override // o.es.c.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void d(o.by.c r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    r6 = 2
                    int r0 = r6 % r6
                    int r0 = o.er.d.AnonymousClass3.AnonymousClass5.f24905d
                    int r1 = r0 + 115
                    int r0 = r1 % 128
                    o.er.d.AnonymousClass3.AnonymousClass5.f24904b = r0
                    int r1 = r1 % r6
                    r5 = 0
                    if (r1 != 0) goto L6a
                    boolean r1 = o.ea.f.a()
                    r0 = 21
                    int r0 = r0 / r5
                    if (r1 == 0) goto L5e
                L18:
                    o.er.d$3 r0 = o.er.d.AnonymousClass3.this
                    o.er.d r0 = o.er.d.this
                    java.lang.String r4 = r0.a()
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    r0 = 36
                    int[] r2 = new int[r0]
                    r2 = {x0072: FILL_ARRAY_DATA , data: [-851106194, 1518176544, 565146921, -1892631401, 2098376998, -1465290929, 408057671, 743975803, 515122769, -509639021, 408718527, -179515435, 877277470, -701035922, -1970965751, 1157641081, -1261496158, 769178753, -745535183, 1397617458, 716519000, 974173941, -64679699, 527636799, -1554083, -766144111, -2070527643, 490698466, -1869065845, 87435243, 1728325703, 1172297662, 1410575183, 1992655049, -385100326, -994437579} // fill-array
                    java.lang.String r0 = ""
                    int r0 = android.os.Process.getGidForName(r0)
                    int r1 = 69 - r0
                    r0 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    f(r2, r1, r0)
                    r0 = r0[r5]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r0 = r0.intern()
                    java.lang.StringBuilder r1 = r3.append(r0)
                    fr.antelop.sdk.AntelopErrorCode r0 = r8.c()
                    java.lang.StringBuilder r0 = r1.append(r0)
                    java.lang.String r0 = r0.toString()
                    o.ea.f.d(r4, r0)
                    int r0 = o.er.d.AnonymousClass3.AnonymousClass5.f24904b
                    int r1 = r0 + 87
                    int r0 = r1 % 128
                    o.er.d.AnonymousClass3.AnonymousClass5.f24905d = r0
                    int r1 = r1 % r6
                L5e:
                    o.er.d$3 r0 = o.er.d.AnonymousClass3.this
                    fr.antelop.sdk.util.OperationCallback r1 = r2
                    fr.antelop.sdk.AntelopError r0 = r8.a()
                    r1.onError(r0)
                    return
                L6a:
                    boolean r0 = o.ea.f.a()
                    if (r0 == 0) goto L5e
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.AnonymousClass5.d(o.by.c):void");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:17:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r8, byte r9, byte r10) {
            /*
                int r2 = r10 + 4
                int r8 = r8 * 3
                int r1 = r8 + 1
                byte[] r7 = o.er.d.AnonymousClass3.$$a
                int r0 = 122 - r9
                byte[] r6 = new byte[r1]
                r5 = 0
                if (r7 != 0) goto L28
                r4 = r5
                r3 = r8
            L11:
                int r0 = -r0
                int r0 = r0 + r3
                r3 = r4
            L14:
                byte r1 = (byte) r0
                r6[r3] = r1
                int r4 = r3 + 1
                if (r3 != r8) goto L21
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L21:
                int r2 = r2 + 1
                r1 = r7[r2]
                r3 = r0
                r0 = r1
                goto L11
            L28:
                r3 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.$$c(short, byte, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24898i = 0;
            f24897g = 1;
            f24895a = 740602047300126166L;
            f24896c = 1564493270;
            f24899j = (char) 45647;
        }

        AnonymousClass3(OperationCallback operationCallback, o.es.c cVar) {
            operationCallback = operationCallback;
            cVar = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void d(o.es.c.e r13) throws java.lang.Throwable {
            /*
                r12 = this;
                r2 = 2
                int r0 = r2 % r2
                int r0 = o.er.d.AnonymousClass3.f24897g
                int r1 = r0 + 95
                int r0 = r1 % 128
                o.er.d.AnonymousClass3.f24898i = r0
                int r1 = r1 % r2
                o.es.c$e r0 = o.es.c.e.f25300d
                if (r13 == r0) goto L71
                int r0 = o.er.d.AnonymousClass3.f24897g
                int r1 = r0 + 13
                int r0 = r1 % 128
                o.er.d.AnonymousClass3.f24898i = r0
                int r1 = r1 % r2
                r5 = 0
                if (r1 == 0) goto L6a
                boolean r1 = o.ea.f.a()
                r0 = 35
                int r0 = r0 / r5
                if (r1 == 0) goto L55
            L25:
                o.er.d r0 = o.er.d.this
                java.lang.String r2 = r0.a()
                long r6 = android.widget.ExpandableListView.getPackedPositionForChild(r5, r5)
                r3 = 0
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                r0 = 63267(0xf723, float:8.8656E-41)
                int r0 = r0 - r1
                char r6 = (char) r0
                long r0 = android.widget.ExpandableListView.getPackedPositionForGroup(r5)
                int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                r0 = 1
                java.lang.Object[] r11 = new java.lang.Object[r0]
                java.lang.String r7 = "냺譌㮸皿࿓榡䤷郲噼\ue5e1ᑬ楽씵╌ᝡ\ue97d昗彣\uf58d䄶ߩ㠣诎摣屵յꯟ\uf21f⻊耏ⓣ\ud930⟥氼\ud89b\ud844犾䭖\ue280⥚\ue93e\uebec㩤呻\uf6bd뫦鮟出ᯪ糋矙瘾ꩼ咭奚\udd03"
                java.lang.String r8 = "\u0000\u0000\u0000\u0000"
                java.lang.String r9 = "⯖箸ⓣ퇷"
                f(r6, r7, r8, r9, r10, r11)
                r0 = r11[r5]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                o.ea.f.c(r2, r0)
            L55:
                fr.antelop.sdk.util.OperationCallback r2 = r2
                o.by.c r1 = new o.by.c
                o.er.d r0 = o.er.d.this
                fr.antelop.sdk.AntelopErrorCode r0 = r0.e()
                r1.<init>(r0)
                fr.antelop.sdk.AntelopError r0 = r1.a()
                r2.onError(r0)
                return
            L6a:
                boolean r0 = o.ea.f.a()
                if (r0 == 0) goto L55
                goto L25
            L71:
                o.es.c r1 = r3
                o.er.d$3$5 r0 = new o.er.d$3$5
                r0.<init>()
                r1.c(r0)
                int r0 = o.er.d.AnonymousClass3.f24898i
                int r1 = r0 + 29
                int r0 = r1 % 128
                o.er.d.AnonymousClass3.f24897g = r0
                int r1 = r1 % r2
                if (r1 == 0) goto L87
                return
            L87:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.d(o.es.c$e):void");
        }

        private static void f(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2 % 2;
            int i4 = $11 + 9;
            $10 = i4 % 128;
            Object obj = str6;
            if (i4 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (str6 != null) {
                char[] charArray = str6.toCharArray();
                int i5 = $10 + 61;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                obj = charArray;
            }
            char[] cArr = (char[]) obj;
            Object charArray2 = str5;
            if (str5 != null) {
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str4;
            if (str4 != null) {
                charArray3 = str4.toCharArray();
            }
            o.a.i iVar = new o.a.i();
            int length = cArr.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            int i7 = 0;
            System.arraycopy(cArr, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c2);
            cArr4[2] = (char) (cArr4[2] + ((char) i2));
            int length3 = ((char[]) charArray3).length;
            char[] cArr5 = new char[length3];
            iVar.f19932b = 0;
            while (iVar.f19932b < length3) {
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = o.d.d.a(540069882);
                    if (objA == null) {
                        int keyRepeatTimeout = 106 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        char size = (char) View.MeasureSpec.getSize(i7);
                        int iRgb = (-16777205) - Color.rgb(i7, i7, i7);
                        byte b2 = (byte) i7;
                        String str$$c = $$c(b2, (byte) (57 | b2), (byte) (-1));
                        Class[] clsArr = new Class[1];
                        clsArr[i7] = Object.class;
                        objA = o.d.d.a(keyRepeatTimeout, size, iRgb, -155898465, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b3 = (byte) i7;
                        objA2 = o.d.d.a((TypedValue.complexToFloat(i7) > 0.0f ? 1 : (TypedValue.complexToFloat(i7) == 0.0f ? 0 : -1)) + 847, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6487), 12 - TextUtils.getOffsetAfter("", i7), -694521287, false, $$c(b3, (byte) ((b3 + 54) - (54 & b3)), (byte) (-1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(457 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - View.getDefaultSize(0, 0), 1804962841, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 56))), (byte) (-1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 65100), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1636969060, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r7[iVar.f19932b])) ^ (f24895a ^ 740602047300126166L)) ^ ((long) ((int) (((long) f24896c) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f24899j) ^ 740602047300126166L))));
                    iVar.f19932b++;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr5);
        }

        static void init$0() {
            $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
            $$b = 69;
        }

        @Override // o.es.c.a
        public final /* synthetic */ void a(c.e eVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24898i + 65;
            f24897g = i3 % 128;
            int i4 = i3 % 2;
            d(eVar);
            int i5 = f24898i + 17;
            f24897g = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.es.c.a
        public final void d(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24897g + 101;
            f24898i = i3 % 128;
            if (i3 % 2 != 0) {
                operationCallback.onError(cVar.a());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            operationCallback.onError(cVar.a());
            int i4 = f24897g + 49;
            f24898i = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: o.er.d$4 */
    public class AnonymousClass4 implements c.a<c.e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: f */
        private static int f24907f = 0;

        /* JADX INFO: renamed from: g */
        public static int f24908g = 0;

        /* JADX INFO: renamed from: i */
        private static int f24909i = 0;

        /* JADX INFO: renamed from: j */
        private static char[] f24910j = null;

        /* JADX INFO: renamed from: k */
        public static int f24911k = 0;

        /* JADX INFO: renamed from: l */
        public static int f24912l = 0;

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o.eo.e f24913a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ OperationCallback f24914b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ o.es.c f24915c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f24916d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Context f24917e;

        /* JADX INFO: renamed from: o.er.d$4$5 */
        final class AnonymousClass5 implements c.a<List<o.es.e>> {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static long f24919a = 0;

            /* JADX INFO: renamed from: c */
            private static int f24920c = 0;

            /* JADX INFO: renamed from: d */
            private static int f24921d = 0;

            /* JADX INFO: renamed from: e */
            private static char[] f24922e = null;

            /* JADX INFO: renamed from: o.er.d$4$5$2 */
            public class AnonymousClass2 implements e.d<o.ep.i> {
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final byte[] $$d = null;
                private static final int $$e = 0;
                private static final int $$f = 0;
                private static int $10 = 0;
                private static int $11 = 0;
                public static int A = 0;
                public static int B = 0;
                public static int C = 0;
                public static int D = 0;
                public static int E = 0;
                public static int F = 0;
                public static int G = 0;
                public static int H = 0;

                /* JADX INFO: renamed from: a */
                private static long f24924a = 0;

                /* JADX INFO: renamed from: c */
                private static int f24925c = 0;

                /* JADX INFO: renamed from: d */
                private static int f24926d = 0;

                /* JADX INFO: renamed from: e */
                private static char[] f24927e = null;

                /* JADX INFO: renamed from: f */
                public static int f24928f = 0;

                /* JADX INFO: renamed from: g */
                public static int f24929g = 0;

                /* JADX INFO: renamed from: h */
                public static int f24930h = 0;

                /* JADX INFO: renamed from: i */
                public static int f24931i = 0;

                /* JADX INFO: renamed from: j */
                public static int f24932j = 0;

                /* JADX INFO: renamed from: k */
                public static int f24933k = 0;

                /* JADX INFO: renamed from: l */
                public static int f24934l = 0;

                /* JADX INFO: renamed from: m */
                public static int f24935m = 0;

                /* JADX INFO: renamed from: n */
                public static int f24936n = 0;

                /* JADX INFO: renamed from: o */
                public static int f24937o = 0;

                /* JADX INFO: renamed from: p */
                public static int f24938p = 0;

                /* JADX INFO: renamed from: q */
                public static int f24939q = 0;

                /* JADX INFO: renamed from: r */
                public static int f24940r = 0;

                /* JADX INFO: renamed from: s */
                public static int f24941s = 0;

                /* JADX INFO: renamed from: t */
                public static int f24942t = 0;

                /* JADX INFO: renamed from: u */
                public static int f24943u = 0;

                /* JADX INFO: renamed from: v */
                public static int f24944v = 0;

                /* JADX INFO: renamed from: w */
                public static int f24945w = 0;

                /* JADX INFO: renamed from: x */
                public static int f24946x = 0;

                /* JADX INFO: renamed from: y */
                public static int f24947y = 0;

                /* JADX INFO: renamed from: z */
                public static int f24948z = 0;

                /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0014). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$g(short r9, short r10, int r11) {
                    /*
                        byte[] r8 = o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.$$c
                        int r7 = r9 * 4
                        int r1 = r7 + 1
                        int r6 = 105 - r11
                        int r0 = r10 * 4
                        int r5 = 4 - r0
                        byte[] r4 = new byte[r1]
                        r3 = 0
                        if (r8 != 0) goto L2b
                        r2 = r7
                        r0 = r5
                        r1 = r3
                    L14:
                        int r5 = r5 + r2
                        int r0 = r0 + 1
                        r6 = r5
                        r5 = r0
                    L19:
                        byte r0 = (byte) r6
                        r4[r1] = r0
                        if (r1 != r7) goto L24
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        return r0
                    L24:
                        r2 = r8[r5]
                        int r1 = r1 + 1
                        r0 = r5
                        r5 = r6
                        goto L14
                    L2b:
                        r1 = r3
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.$$g(short, short, int):java.lang.String");
                }

                static {
                    init$2();
                    $10 = 0;
                    $11 = 1;
                    init$1();
                    H = -286996731;
                    G = 614495132;
                    F = -1131672825;
                    E = 635909963;
                    D = 211998065;
                    C = 526263993;
                    B = -157603599;
                    A = 479049460;
                    f24948z = -1538929677;
                    f24947y = 558071713;
                    f24946x = 1313811708;
                    f24945w = 1898373301;
                    f24944v = 1932047893;
                    f24943u = -804528149;
                    f24942t = -412716738;
                    f24941s = 491071215;
                    f24940r = -1102487025;
                    f24939q = -2013926664;
                    f24938p = -1692308737;
                    f24937o = 1664507465;
                    f24936n = -615686389;
                    f24935m = 2131591044;
                    f24934l = 2122480764;
                    f24933k = -1396983772;
                    f24932j = 958353266;
                    f24931i = -463970879;
                    f24930h = 1078576135;
                    f24929g = -776544085;
                    f24928f = -589035752;
                    init$0();
                    f24925c = 0;
                    f24926d = 1;
                    char[] cArr = new char[PhotoshopDirectory.TAG_MAC_NSPRINTINFO];
                    ByteBuffer.wrap("\u0094\u009b*²è×®\nlL\"iá\u0089§ùe.;\\ùz¸ª~õ<\u0000òh°nw»5±ËI\u0089\u001bOj\u000e´Ì÷\u0082\u000e@N\u0006hÅ°\u009b³Y\u0005\u001fTÝz\u009c»R²\u0010\u0015Ö[\u0094`+»éÃ¯@mE#oâ¿ Þf\u0006$Eúm¹½\u007fËf$Ø\r\u001ah\\µ\u009eóÐÖ\u00136UF\u0097\u0091Éã\u000bÅJ\u0015\u008cJÎ¿\u0000×BÑ\u0085\u0004Ç\u000e9ö{¤½Õü\u000b>Hp±²ñô×7\u000fi\f«ºíë/Ån\u0004 \râª$äfßÙ\u0004\u001b|]ÿ\u009fúÑÐ\u0010\u0000Ra\u0094¹Öú\bÒKG\u008dvÏ¼\u0001çC×\u0082\u0011Äc\u0006§x¯º\u0082ýE\u0094·*¬èá®\u0007l_\"yá¯§åe.;\\ùx¸¦~õ<\u0011òQ°`w¬\u0094\u0080* èç®\u001blh\"dá²§ãe\u001f;Xù`¸\u0086~ø<\u0013òQ°}w\u00ad5ÿË\t\u0089^O`\u000e©ÌÔ\u0082\u0002@N\u0006lÅ¿\u009bçY\u0003\u001fQÝ(\u009còR²\u0010\u0017Ö]\u0094y+ªéØ¯\u0001m[#Oâ· Úf\n$Dúj¹¶\u007fÂ=\u0007ó_±pp\u00986Áô\u0019\u008aUH=\u000fú\u0094\u0093*±èä®\u000elP\"i\u0094\u0086*®èÇ®\u001flL\"dá®§ð\u0094\u0080* èç®\u001blh\"dá²§ãe\u001f;Xù`¸\u0086~ø<\u0013òQ°}w\u00ad5ÿË\t\u0089^O`\u000e©ÌÔ\u0082\u0002@N\u0006lÅ¿\u009bçY\u0003\u001fQÝ(\u009còR²\u00106ÖU\u0094g+²éÈ¯\u0014m\u0017#dâ¶ ØfC$_úk¹±\u007fÛ=\u000bóP±hp²6Ôô\u0018\u008aTH'\u000fµÍÛ\u0083\\AA\u0007sÆ»\u0084ÆZ\u0016\u0018\\Þf\u009døS\u008b\u0011\r×&\u0095iT§b\u0099Ü·\u001e£X\u001a\u009aFÔf\u0017½Qù\u0093\u0012ÍR\u000fp\u0094\u0080* èú®\blV\"x¦@\u0018{Ú-\u009cÚ^\u008d\u0010±Óf\u0095*\u0094\u0080*®èº®\u001blL\"bá¤§âe\t;Mù\"¸®~÷<\u000bòM°iw£5òË\u0010\u0089NO|\u000e¸Ìâ\u0094\u0080*®èº®\u001blL\"bá¤§âe\t;Mù\"¸°~ï<\u0016òL°jw¯5¿Ë\t\u0089ZO`\u000e¨Ìö\u0082\u0006@Y\u0006}Å©\u009báY\u0003\u001fG\u0094Ý*¤èà®\bl\u0011\"dá®§þe\u001e;\u0016ù`¸¯~ý<\u0001ò\u0015°kw§5óË\u0011\u0089\\Oi\u000e¼Ìò\u0082\u000b@_\u0006'Å®\u009bð\u0094\u0080*®èº®\u000fl[\"oáµ§ðe\r;Xùn¸¯~ó\u0094Ã\u0094\u0093*¥èö®4lU\"há¹§ä:b\u0084BF\u0015\u0000óÂ¡\u008c\u009bVªè\u0090*Ýl$®gàC#\u0098\u0094\u0095*¥èö®\u0018l[\"\u007fá¶§òe\u0018\u0094\u009b*¥èø®\blR\"d\u009cï\"Ûà\u0089¦kdg*\u001déÑ¯\u0081mk3*ñV°Åv\u0081#\u009d\u009d¨_æ\u0019\u0002ÛH\u0094\u009b*±èñ®\u0019lX\">\u0094\u009b*¶\u0094\u009e*®èó®\u001bl[\"\u007fá³§þe\u0019;Mù\"¸°~â<\u0004òJ°{°\u0002\u000e2Ìo\u008a\u0083HÃ\u0006öÅ8\u0083%A\u0084\u001fÆ\u0094\u0082*³èû®\blL\"lá®§ü\u0094\u0082*³èû®\rl]\"bá¬§ûe\u000f;Zùx¸§§ô\u0019ÅÛ\u008d\u009d{_+\u0011\u0014ÒÚ\u0094\u008dVy\b,Ê\u000e\u008bÖM\u0094\u000f\u007f©®\u0017\u008aÕ×\u0093*Qe\u001fMÜ\u009a\u0094\u0081*©èû®\u001clS\"lá°\u008eü0Íò\u0085´\u007fv78\u0015û\u008e\u0094\u0081*²9\u009c\u0087¨Eè\u0003\u0004ÁW\u008fOLª\nãÈ\u0003\u0096LTN\u0015²Óä\u0091\u001b_N\u001dsÚ¸\u0098éf\u0017$Rº¢\u0004\u0096ÆÅ\u0080)B~\fK\u0094\u0081*´Æ\u0004x%º\u007fü\u0087>Ïpá³?õw7\u009di\u0091«úê2,rn\u0094 Èâù\u0014\u0085ª°hö.\u000bìX¢~a¢'àå\u0001A\u0099ÿ¬=ê{\u0017¹D÷b4¾rü°\u001dî\u0010\u0094\u0086*³èõ®\bl[\"\u007fá¯§âe\u001e;\\ù:\u0087¥9\u008dûÁ½ \u007fr1Kò½´Üv&(}êA\u0094\u0087*¯èã®\u0002lP\"iá\u009f§åe\u000f;^ùS¸ª~ø<\u0003òW\u0094\u0087*¯èã®\u0002lP\"iá\u009f§äe\u0013;Tùn¸¬~ú<\u0016*n\u0094\u0001V^\u0010«Òù\u009cÛ_\u001e\u0019\u000bÛ»\u0085ãGÑ\u0006_\u0094Ý*²èí®\u0018l\u0011\"ká³§¸e\u0019;\\ù`¸ª~ø<\u0010ò@° w§5ÿË\u0002\u0089TO|\u000e¾Ìõ{\u000fÅc\u00074AÖ\u0083\u008fÍð\u000eaH \u008aÔÔ\u008d\u0016ñWb\u00910ÓÖ\u001d\u009e_¨\u0098c\u0094Ý*¥èñ®\u001dÄÁz®¸ñþ\u0004<Vrt±±\u0094Ý*²èí®\u0018lJ\"há\u00ad§¸e\b;Pùb\u0094Ý*²èí®\u0018lJ\"há\u00ad§¸e\u0019;[ùe¸\u00adVöè\u0099*Æl3®aàC#\u0086e\u0093§9ùp;Nz\u0086pQÎ;\f}J\u0089\u0088ÖÆî\u0005>C4\u0081\u0084ßÜ\u001dî\u0094Ý*²èö®\u0002lP\u0094Ý*¤èà®\b\u0094\u0080*®èº®\tlK\"dá¬§óeD;Qùc¸°~â\u0005>»\u0017yZ?ªýþ³Åp\n6Vô¨ªùhÇ\u000fN±zs(5Ê÷Å¹«zc<!þ\u0091 \u009fb¬#Iå'§Ñi\u0088+·ìx®*\u0094\u0080*´èú®\u0005lW\"cá§Ö\u009eh¸ªúì\u0004.K`b£¨å¥'\u0005y\\»cúñ<ø~\u0016°Kòg5\u0081wì\u0089\u001bËD\rwL²\u008eÿ\u0094Ý*¥èõ®\u001fl_\"\"á¬§øe\t;Xù`¸ì\u0094Ý*¥èõ®\u001fl_\"\"á¬§øe\t;Xù`¸ì~ô<\fòV° \u0094Ý*¥èõ®\u001fl_\"\"á¬§øe\t;Xù`¸ì~î<\u0007òQ°awí,ó\u0092\u009cPØ\u0016,Ô~\u009a\fâq\\\u001e\u009eAØ´\u001aæTÄ\u0097\u0001Ñ\u0014\u0013¤Mü\u008fÎÎ@\b\u0014J¬\u0084ìÆ×\u0001A\u0094Ý*²èí®\u0018lJ\"há\u00ad§¸e\b;Pùb¸ì~ð<\u0004òQ°cw±5ðË\u0002\u0089^O!Y¾çÑ%\u008ec{¡)ï\u000b,ÎjÛ¨zö>4@uØ³\u0097ño?5}C\u0094Ý*²èí®\u0018lJ\"há\u00ad§¸e\u001f;Jù~¸ì~á<\u0000ò\u0015°aw§5ôË\u0000\u0089\u0016O|\u000e²Ìÿ\u0082\u0013@\u0015\u009c\u008d\"âà½¦Hd\u001a*8éý¯èmB3\u000bñ5°ývé\u0094Ý*´èç®\u0019l\u0011\"oá©§ùeEöqH\u001e\u008aMÌè\u000eð@È\u0083\u0002Å\u0014G«ùÇ;\u0090}r¿+ñT2Åt\u0084¶pè)*UkØ\u00ad\u008fïf! c\r¤Ç\u0094©*ñè¹®Rlc\"&\u0094Ý*±èæ®\u0004l]\"\"\u0094Ý*¬èû®\u001elP\"yá³B®üÁ>\u009exkºbô\u00187ÀqË³jí//\u0013nÙ¨\u008bêc$3fS¡Áã\u008d\u001d{_!\u0099\u001eØ×ªx\u0014\u0000ÖT\u0090¸R´\u001cÒß\u001c\u0099U[¦\u0005ïÇÂLSòk0)vÁ´Ûúª9j\u007f2½ÆãÜ!\u0093``¦/äË*\u0092h \u0094\u0081*µèõ®\u0019lJ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, PhotoshopDirectory.TAG_MAC_NSPRINTINFO);
                    f24927e = cArr;
                    f24924a = 596443147465665217L;
                }

                AnonymousClass2() {
                }

                private static void I(char c2, int i2, int i3, Object[] objArr) throws Throwable {
                    int i4 = 2 % 2;
                    o.a.o oVar = new o.a.o();
                    long[] jArr = new long[i3];
                    oVar.f19947b = 0;
                    int i5 = $11 + 99;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    while (oVar.f19947b < i3) {
                        int i7 = $11 + 47;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = oVar.f19947b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(f24927e[i2 + i9])};
                            Object objA = o.d.d.a(-214519724);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a(742 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 12, 632508977, false, $$g(b2, b3, (byte) ((b3 + 6) - (6 & b3))), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(f24924a), Integer.valueOf(c2)};
                            Object objA2 = o.d.d.a(-1567654649);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = o.d.d.a(765 - Process.getGidForName(""), (char) (12470 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, 1946853218, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i9] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {oVar, oVar};
                            Object objA3 = o.d.d.a(-723636472);
                            if (objA3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objA3 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 387, (char) Color.alpha(0), 17 - TextUtils.indexOf((CharSequence) "", '0'), 39570797, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
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
                    int i10 = $11 + 107;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    while (oVar.f19947b < i3) {
                        cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                        Object[] objArr5 = {oVar, oVar};
                        Object objA4 = o.d.d.a(-723636472);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objA4 = o.d.d.a(387 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "") + 18, 39570797, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr);
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:17:0x0016). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void J(short r8, int r9, int r10, java.lang.Object[] r11) {
                    /*
                        int r0 = r8 * 5
                        int r8 = r0 + 4
                        int r0 = r9 * 2
                        int r7 = r0 + 97
                        int r6 = r10 * 5
                        int r0 = r6 + 1
                        byte[] r5 = o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.$$d
                        byte[] r4 = new byte[r0]
                        r3 = 0
                        if (r5 != 0) goto L2e
                        r2 = r8
                        r1 = r6
                        r0 = r3
                    L16:
                        int r8 = r8 + r1
                        int r8 = r8 + (-5)
                        int r2 = r2 + 1
                        r1 = r0
                    L1c:
                        byte r0 = (byte) r8
                        r4[r1] = r0
                        int r0 = r1 + 1
                        if (r1 != r6) goto L2b
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        r11[r3] = r0
                        return
                    L2b:
                        r1 = r5[r2]
                        goto L16
                    L2e:
                        r1 = r3
                        r2 = r8
                        r8 = r7
                        goto L1c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.J(short, int, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0016). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void K(short r6, short r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r2 = r8 * 4
                        int r1 = 1 - r2
                        byte[] r8 = o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.$$a
                        int r7 = r7 + 97
                        int r0 = r6 * 2
                        int r6 = r0 + 4
                        byte[] r5 = new byte[r1]
                        r4 = 0
                        int r3 = 0 - r2
                        if (r8 != 0) goto L30
                        r0 = r7
                        r2 = r4
                        r1 = r6
                    L16:
                        int r0 = -r0
                        int r6 = r6 + r0
                        int r0 = r1 + 1
                        r7 = r6
                        r6 = r0
                    L1c:
                        byte r0 = (byte) r7
                        r5[r2] = r0
                        if (r2 != r3) goto L29
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        r9[r4] = r0
                        return
                    L29:
                        int r2 = r2 + 1
                        r0 = r8[r6]
                        r1 = r6
                        r6 = r7
                        goto L16
                    L30:
                        r2 = r4
                        goto L1c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.K(short, short, int, java.lang.Object[]):void");
                }

                public static void b(Context context, long j2, long j3) throws Throwable {
                    Class[] clsArr;
                    Object objInvoke;
                    Object[] objArr;
                    Method method;
                    int i2 = 2 % 2;
                    long j4 = j2 ^ (j3 << 32);
                    int i3 = f24925c + 97;
                    f24926d = i3 % 128;
                    int i4 = i3 % 2;
                    try {
                        Method method2 = o.ea.f.class.getMethod("a", null);
                        method2.setAccessible(true);
                        if (((Boolean) method2.invoke(null, null)).booleanValue()) {
                            int i5 = f24926d + 55;
                            f24925c = i5 % 128;
                            int i6 = i5 % 2;
                            Object[] objArr2 = new Object[1];
                            I((char) View.MeasureSpec.getSize(0), 105 - (ViewConfiguration.getFadingEdgeLength() >> 16), 17 - TextUtils.getCapsMode("", 0, 0), objArr2);
                            String strIntern = ((String) objArr2[0]).intern();
                            Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            Object objNewInstance = declaredConstructor.newInstance(null);
                            Object[] objArr3 = new Object[1];
                            I((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 122 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 57, objArr3);
                            Object[] objArr4 = {((String) objArr3[0]).intern()};
                            Object[] objArr5 = new Object[1];
                            I((char) (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 178, TextUtils.lastIndexOf("", '0', 0, 0) + 7, objArr5);
                            Method method3 = StringBuilder.class.getMethod(((String) objArr5[0]).intern(), String.class);
                            method3.setAccessible(true);
                            Object objInvoke2 = method3.invoke(objNewInstance, objArr4);
                            Object[] objArr6 = {Long.valueOf(j4)};
                            Object[] objArr7 = new Object[1];
                            I((char) ((-1) - Process.getGidForName("")), 179 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, objArr7);
                            Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), Long.TYPE);
                            method4.setAccessible(true);
                            Object objInvoke3 = method4.invoke(objInvoke2, objArr6);
                            Object[] objArr8 = new Object[1];
                            I((char) View.MeasureSpec.getMode(0), Drawable.resolveOpacity(0, 0) + 185, 8 - TextUtils.indexOf("", "", 0, 0), objArr8);
                            Method method5 = StringBuilder.class.getMethod(((String) objArr8[0]).intern(), null);
                            method5.setAccessible(true);
                            Object[] objArr9 = {strIntern, method5.invoke(objInvoke3, null)};
                            Method method6 = o.ea.f.class.getMethod("c", String.class, Object.class);
                            method6.setAccessible(true);
                            method6.invoke(null, objArr9);
                        }
                        byte[] bArr = $$d;
                        byte b2 = bArr[2];
                        byte b3 = (byte) (b2 + 1);
                        Object[] objArr10 = new Object[1];
                        J(b3, (byte) ((b3 + 7) - (7 & b3)), (byte) (-b2), objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        byte b4 = (byte) (-bArr[2]);
                        byte b5 = (byte) (b4 - 1);
                        Object[] objArr11 = new Object[1];
                        J(b4, b5, b5, objArr11);
                        Method method7 = cls.getMethod((String) objArr11[0], null);
                        method7.setAccessible(true);
                        Object objInvoke4 = method7.invoke(null, null);
                        int i7 = (int) j4;
                        byte b6 = bArr[2];
                        byte b7 = (byte) (b6 + 1);
                        Object[] objArr12 = new Object[1];
                        J(b7, (byte) ((b7 + 7) - (7 & b7)), (byte) (-b6), objArr12);
                        Class.forName((String) objArr12[0]).getField("b").setInt(objInvoke4, i7);
                        byte b8 = bArr[2];
                        byte b9 = (byte) (b8 + 1);
                        Object[] objArr13 = new Object[1];
                        J(b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 7))), (byte) (-b8), objArr13);
                        Class<?> cls2 = Class.forName((String) objArr13[0]);
                        byte b10 = (byte) (-bArr[2]);
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr14 = new Object[1];
                        J(b10, b11, b11, objArr14);
                        Method method8 = cls2.getMethod((String) objArr14[0], null);
                        method8.setAccessible(true);
                        Object objInvoke5 = method8.invoke(null, null);
                        byte b12 = bArr[2];
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr15 = new Object[1];
                        J(b13, (byte) (7 | b13), (byte) (-b12), objArr15);
                        Object objInvoke6 = context;
                        if (Class.forName((String) objArr15[0]).getField("d").getBoolean(objInvoke5)) {
                            return;
                        }
                        if (context == null) {
                            int i8 = f24926d + 115;
                            f24925c = i8 % 128;
                            if (i8 % 2 != 0) {
                                byte b14 = (byte) (-bArr[2]);
                                byte b15 = b14;
                                Object[] objArr16 = new Object[1];
                                J(b14, b15, (byte) (b15 - 1), objArr16);
                                Method method9 = o.en.b.class.getMethod((String) objArr16[0], null);
                                method9.setAccessible(false);
                                objInvoke = method9.invoke(null, null);
                                byte b16 = bArr[2];
                                Object[] objArr17 = new Object[1];
                                J((byte) (-b16), (byte) ((-1) - (((-1) - $$e) | ((-1) - 56))), (byte) (b16 + 1), objArr17);
                                objArr = null;
                                method = o.en.b.class.getMethod((String) objArr17[0], null);
                                method.setAccessible(true);
                            } else {
                                byte b17 = (byte) (-bArr[2]);
                                byte b18 = b17;
                                Object[] objArr18 = new Object[1];
                                J(b17, b18, (byte) (b18 - 1), objArr18);
                                Method method10 = o.en.b.class.getMethod((String) objArr18[0], null);
                                method10.setAccessible(true);
                                objInvoke = method10.invoke(null, null);
                                byte b19 = bArr[2];
                                Object[] objArr19 = new Object[1];
                                J((byte) (-b19), (byte) ((-1) - (((-1) - $$e) | ((-1) - 56))), (byte) (b19 + 1), objArr19);
                                objArr = null;
                                method = o.en.b.class.getMethod((String) objArr19[0], null);
                                method.setAccessible(true);
                            }
                            objInvoke6 = method.invoke(objInvoke, objArr);
                        }
                        if (objInvoke6 != null) {
                            byte b20 = (byte) (-bArr[2]);
                            byte b21 = b20;
                            Object[] objArr20 = new Object[1];
                            J(b20, b21, (byte) (b21 - 1), objArr20);
                            Method method11 = o.en.b.class.getMethod((String) objArr20[0], null);
                            method11.setAccessible(true);
                            Object objInvoke7 = method11.invoke(null, null);
                            byte b22 = (byte) (-bArr[2]);
                            byte b23 = (byte) (b22 - 1);
                            Object[] objArr21 = new Object[1];
                            J(b22, b23, b23, objArr21);
                            Method method12 = o.en.b.class.getMethod((String) objArr21[0], null);
                            method12.setAccessible(true);
                            if (((Boolean) method12.invoke(objInvoke7, null)).booleanValue()) {
                                int i9 = f24926d + 47;
                                f24925c = i9 % 128;
                                if (i9 % 2 == 0) {
                                    byte b24 = bArr[2];
                                    Object[] objArr22 = new Object[1];
                                    J((byte) (-b24), (byte) bArr.length, (byte) (b24 + 1), objArr22);
                                    clsArr = null;
                                    Method method13 = o.en.b.class.getMethod((String) objArr22[0], null);
                                    method13.setAccessible(true);
                                    if (!((Boolean) method13.invoke(objInvoke7, null)).booleanValue()) {
                                    }
                                    Method method14 = o.dc.d.class.getMethod("a", clsArr);
                                    method14.setAccessible(true);
                                    Object objInvoke8 = method14.invoke(clsArr, clsArr);
                                    Object[] objArr23 = {o.az.a.class.getField("b").get(clsArr), o.dd.g.class.getField("z").get(clsArr)};
                                    Constructor declaredConstructor2 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, o.dd.g.class);
                                    declaredConstructor2.setAccessible(true);
                                    Object[] objArr24 = {objInvoke6, declaredConstructor2.newInstance(objArr23), true};
                                    Method method15 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                                    method15.setAccessible(true);
                                    method15.invoke(objInvoke8, objArr24);
                                    byte b25 = bArr[2];
                                    byte b26 = (byte) (b25 + 1);
                                    Object[] objArr25 = new Object[1];
                                    J(b26, (byte) ((-1) - (((-1) - b26) & ((-1) - 7))), (byte) (-b25), objArr25);
                                    Class<?> cls3 = Class.forName((String) objArr25[0]);
                                    byte b27 = (byte) (-bArr[2]);
                                    byte b28 = (byte) (b27 - 1);
                                    Object[] objArr26 = new Object[1];
                                    J(b27, b28, b28, objArr26);
                                    Method method16 = cls3.getMethod((String) objArr26[0], null);
                                    method16.setAccessible(true);
                                    Object objInvoke9 = method16.invoke(null, null);
                                    byte b29 = bArr[2];
                                    byte b30 = (byte) (b29 + 1);
                                    Object[] objArr27 = new Object[1];
                                    J(b30, (byte) ((-1) - (((-1) - b30) & ((-1) - 7))), (byte) (-b29), objArr27);
                                    Class.forName((String) objArr27[0]).getField("d").setBoolean(objInvoke9, true);
                                    int i10 = f24925c + 41;
                                    f24926d = i10 % 128;
                                    int i11 = i10 % 2;
                                    return;
                                }
                                byte b31 = bArr[2];
                                Object[] objArr28 = new Object[1];
                                J((byte) (-b31), (byte) bArr.length, (byte) (b31 + 1), objArr28);
                                Method method17 = o.en.b.class.getMethod((String) objArr28[0], null);
                                method17.setAccessible(false);
                                if (((Boolean) method17.invoke(objInvoke7, null)).booleanValue()) {
                                    clsArr = null;
                                    Method method142 = o.dc.d.class.getMethod("a", clsArr);
                                    method142.setAccessible(true);
                                    Object objInvoke82 = method142.invoke(clsArr, clsArr);
                                    Object[] objArr232 = {o.az.a.class.getField("b").get(clsArr), o.dd.g.class.getField("z").get(clsArr)};
                                    Constructor declaredConstructor22 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, o.dd.g.class);
                                    declaredConstructor22.setAccessible(true);
                                    Object[] objArr242 = {objInvoke6, declaredConstructor22.newInstance(objArr232), true};
                                    Method method152 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                                    method152.setAccessible(true);
                                    method152.invoke(objInvoke82, objArr242);
                                    byte b252 = bArr[2];
                                    byte b262 = (byte) (b252 + 1);
                                    Object[] objArr252 = new Object[1];
                                    J(b262, (byte) ((-1) - (((-1) - b262) & ((-1) - 7))), (byte) (-b252), objArr252);
                                    Class<?> cls32 = Class.forName((String) objArr252[0]);
                                    byte b272 = (byte) (-bArr[2]);
                                    byte b282 = (byte) (b272 - 1);
                                    Object[] objArr262 = new Object[1];
                                    J(b272, b282, b282, objArr262);
                                    Method method162 = cls32.getMethod((String) objArr262[0], null);
                                    method162.setAccessible(true);
                                    Object objInvoke92 = method162.invoke(null, null);
                                    byte b292 = bArr[2];
                                    byte b302 = (byte) (b292 + 1);
                                    Object[] objArr272 = new Object[1];
                                    J(b302, (byte) ((-1) - (((-1) - b302) & ((-1) - 7))), (byte) (-b292), objArr272);
                                    Class.forName((String) objArr272[0]).getField("d").setBoolean(objInvoke92, true);
                                    int i102 = f24925c + 41;
                                    f24926d = i102 % 128;
                                    int i112 = i102 % 2;
                                    return;
                                }
                            }
                            o.ea.f.class.getMethod("a", null).setAccessible(true);
                            if (!(!((Boolean) r0.invoke(null, null)).booleanValue())) {
                                Object[] objArr29 = new Object[1];
                                I((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.green(0) + 105, KeyEvent.keyCodeFromString("") + 17, objArr29);
                                String strIntern2 = ((String) objArr29[0]).intern();
                                Object[] objArr30 = new Object[1];
                                I((char) View.MeasureSpec.getSize(0), 192 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 71, objArr30);
                                Object[] objArr31 = {strIntern2, ((String) objArr30[0]).intern()};
                                Method method18 = o.ea.f.class.getMethod("c", String.class, Object.class);
                                method18.setAccessible(true);
                                method18.invoke(null, objArr31);
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }

                /* JADX WARN: Can't wrap try/catch for region: R(6:1028|832|(2:834|(4:835|(1:837)(1:850)|838|(1:IC)(4:841|(2:843|(2:1041|845)(2:1044|849))(2:846|(1:1042)(2:1045|849))|(1:863)(1:867)|(2:865|866)(10:868|869|(1:871)|872|873|(1:875)(1:925)|(1:877)(8:885|886|(1:888)|889|890|(1:892)(1:896)|893|(3:895|879|(3:881|(1:883)|884)(6:926|927|(1:929)|930|931|(2:933|934)(6:935|936|(1:938)|939|940|(2:942|943)(7:944|945|(1:947)|948|949|(1:951)(1:955)|(2:953|954)(7:956|957|(1:959)|960|961|(1:963)(1:967)|(2:965|966)(6:968|969|(1:971)|972|973|(2:975|976)(6:977|978|(1:980)|981|982|(2:984|985)(8:986|987|(1:989)|990|1020|991|992|993))))))))(6:897|898|(1:900)(1:902)|901|903|(1:905)(6:906|907|(1:909)|910|911|(1:913)(6:914|915|(1:917)|918|919|(1:924)(1:923)))))|878|879|(0)(0)))))|1015|860|1043) */
                /* JADX WARN: Can't wrap try/catch for region: R(9:830|1026|831|(6:1028|832|(2:834|(4:835|(1:837)(1:850)|838|(1:IC)(4:841|(2:843|(2:1041|845)(2:1044|849))(2:846|(1:1042)(2:1045|849))|(1:863)(1:867)|(2:865|866)(10:868|869|(1:871)|872|873|(1:875)(1:925)|(1:877)(8:885|886|(1:888)|889|890|(1:892)(1:896)|893|(3:895|879|(3:881|(1:883)|884)(6:926|927|(1:929)|930|931|(2:933|934)(6:935|936|(1:938)|939|940|(2:942|943)(7:944|945|(1:947)|948|949|(1:951)(1:955)|(2:953|954)(7:956|957|(1:959)|960|961|(1:963)(1:967)|(2:965|966)(6:968|969|(1:971)|972|973|(2:975|976)(6:977|978|(1:980)|981|982|(2:984|985)(8:986|987|(1:989)|990|1020|991|992|993))))))))(6:897|898|(1:900)(1:902)|901|903|(1:905)(6:906|907|(1:909)|910|911|(1:913)(6:914|915|(1:917)|918|919|(1:924)(1:923)))))|878|879|(0)(0)))))|1015|860|1043)|848|1013|851|(0)(0)|(0)(0)) */
                /* JADX WARN: Removed duplicated region for block: B:581:0x080d  */
                /* JADX WARN: Removed duplicated region for block: B:591:0x0958  */
                /* JADX WARN: Removed duplicated region for block: B:653:0x168d  */
                /* JADX WARN: Removed duplicated region for block: B:750:0x22b2  */
                /* JADX WARN: Removed duplicated region for block: B:758:0x232d A[Catch: Exception -> 0x22b2, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x22b2, blocks: (B:729:0x21d9, B:736:0x2261, B:738:0x2298, B:741:0x22a1, B:758:0x232d, B:765:0x23bc, B:768:0x23ee, B:775:0x2487, B:777:0x248d, B:779:0x2492, B:781:0x2498, B:782:0x2499, B:784:0x249b, B:786:0x24a1, B:787:0x24a2, B:744:0x22a7, B:746:0x22ad, B:747:0x22ae, B:730:0x2207, B:732:0x2214, B:733:0x2255, B:769:0x2420, B:771:0x242d, B:772:0x2472, B:759:0x235b, B:761:0x2368, B:762:0x23b2), top: B:1017:0x21d9, inners: #2, #9, #11 }] */
                /* JADX WARN: Removed duplicated region for block: B:799:0x25bf  */
                /* JADX WARN: Removed duplicated region for block: B:863:0x2d57  */
                /* JADX WARN: Removed duplicated region for block: B:865:0x2d5a  */
                /* JADX WARN: Removed duplicated region for block: B:867:0x2de0  */
                /* JADX WARN: Removed duplicated region for block: B:868:0x2de3  */
                /* JADX WARN: Removed duplicated region for block: B:881:0x2f9d  */
                /* JADX WARN: Removed duplicated region for block: B:926:0x3680  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static java.lang.Object[] b$4a7e738d(int r42, java.lang.Object r43) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 17064
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.b$4a7e738d(int, java.lang.Object):java.lang.Object[]");
                }

                static void init$0() {
                    $$a = new byte[]{57, MessagePack.Code.BIN8, -70, 1};
                    $$b = 227;
                }

                static void init$1() {
                    $$d = new byte[]{Ascii.EM, -77, -1, MessagePack.Code.INT8, MessagePack.Code.BIN8, 57, 19, MessagePack.Code.TRUE, 60};
                    $$e = 143;
                }

                static void init$2() {
                    $$c = new byte[]{119, -27, 45, 98};
                    $$f = 223;
                }

                @Override // o.eo.e.d
                public final void a(o.by.c cVar) throws Throwable {
                    int i2 = 2 % 2;
                    int i3 = f24925c + 123;
                    f24926d = i3 % 128;
                    if (i3 % 2 == 0) {
                        o.ea.f.a();
                        throw null;
                    }
                    if (o.ea.f.a()) {
                        String strA = d.this.a();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr = new Object[1];
                        I((char) (62143 - (ViewConfiguration.getScrollBarSize() >> 8)), 49 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 56 - ExpandableListView.getPackedPositionChild(0L), objArr);
                        o.ea.f.d(strA, sb.append(((String) objArr[0]).intern()).append(cVar.c()).toString());
                    }
                    AnonymousClass4.this.f24914b.onError(cVar.a());
                    int i4 = f24925c + 109;
                    f24926d = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Override // o.eo.e.d
                public final void d(List<o.ep.i> list) throws Throwable {
                    String strA;
                    Object obj;
                    int i2 = 2 % 2;
                    if (o.ea.f.a()) {
                        int i3 = f24925c + 103;
                        f24926d = i3 % 128;
                        if (i3 % 2 == 0) {
                            strA = d.this.a();
                            Object[] objArr = new Object[1];
                            I((char) (ViewConfiguration.getKeyRepeatDelay() + 1), 1 >>> TextUtils.lastIndexOf("", '|', 0, 0), KeyEvent.normalizeMetaState(0) + 121, objArr);
                            obj = objArr[0];
                        } else {
                            strA = d.this.a();
                            Object[] objArr2 = new Object[1];
                            I((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 1, KeyEvent.normalizeMetaState(0) + 48, objArr2);
                            obj = objArr2[0];
                        }
                        o.ea.f.c(strA, ((String) obj).intern());
                        int i4 = f24926d + 5;
                        f24925c = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    d.this.d(AnonymousClass4.this.f24917e, AnonymousClass4.this.f24914b, true);
                    int i6 = f24925c + 65;
                    f24926d = i6 % 128;
                    if (i6 % 2 != 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0012). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(short r8, byte r9, int r10) {
                /*
                    int r7 = 105 - r10
                    byte[] r6 = o.er.d.AnonymousClass4.AnonymousClass5.$$a
                    int r0 = r8 * 4
                    int r5 = r0 + 1
                    int r4 = r9 + 4
                    byte[] r3 = new byte[r5]
                    r2 = 0
                    if (r6 != 0) goto L25
                    r0 = r7
                    r1 = r2
                    r7 = r5
                L12:
                    int r7 = r7 + r0
                L13:
                    byte r0 = (byte) r7
                    r3[r1] = r0
                    int r1 = r1 + 1
                    int r4 = r4 + 1
                    if (r1 != r5) goto L22
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    return r0
                L22:
                    r0 = r6[r4]
                    goto L12
                L25:
                    r1 = r2
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.$$c(short, byte, int):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f24920c = 0;
                f24921d = 1;
                char[] cArr = new char[1068];
                ByteBuffer.wrap("ß\u000eNÑü®jI\u0098\u0001\u0007Úµ°#jQ\u000bÀïn£\u009cy\n8¸\u0003'ñU\u008dÃNqRà\u0090\u000eØ¼t*/YåÇ¸uzã.\u0011E\u0080Ô.\u0084\\]Ê\u0014yÒçç\u0015d\u0083(2ü °Îv|0ê\n\u0019È\u0087Ê5F£\u0005ÒØ@¥îd\u001c?\u008bäÄ5Uêç\u0095qr\u0083:\u001cá®\u008b8QJ0ÛÔu\u0098\u0087B\u0011\u0003£8<ÊN¶Øujiû«\u0015ã§V1\u001aB\u0092Ü\u009bnKø\n\n;\u009bõ5ðG Ñtb§ü\u009a\u000eX\u0098\u001a)À»\u008d\u0094\u009b\u0005D·;!ÜÓ\u0094LOþ%hÿ\u001a\u009e\u008bz%6×ìA\u00adó\u0096ld\u001e\u0018\u0088Û:Ç«\u0005EM÷ða©\u0012y\u008c2>â¨ªZ\u0083ËAe^\u0017×\u0081\u008b2B¬7^ùÈøytë(\u0085«7»¡\u0090RVÌ\u0013~Åè\u0091\u0099\u000e\u000b;¥õWªÀ\"r%ìí\u009e¨\b\u0098¹\u001b+\u001dÅÅw\u008eàJ\u00924\fµ¾±/mÙdK³å\u0092\u0098A\t\u009e»á-\u0006ßN@\u0095òÿd%\u0016D\u0087 )ìÛ6MwÿL`¾\u0012Â\u0084\u00016\u001d§ßI\u0097û\"mn\u001eæ\u0080ÿ25¤cVCÇ\u008ciÁ\u001bY\u008dN>\u0092 ñRmÄvu¨ç÷\u00894;x\u00ad\u000b^\u0084ÀÀr\u000eäZ\u0095\u0097\u0007ý©+[gÌø~ôà<\u00927\u0004Hµ\u0088'ÁÉ\u0012{Dì\u0094\u009eæ\u0000o²g#¸ÕìG7éD\u009b\r\f\u008e¾Æ \u000fÒECÖõïg)\tbº³,ëÞ5@\u0005ò\u000ec\u0080\u0015Ù\u0087\u000f)VÚ×Løþ.`m\u0011¾\u0083þ5u§\u0018IJú\u0082lË\u001e\u001b\u0080@1 £\u00adU+Çthü\u001a«\u008cv£Î2\u0011\u0080n\u0016\u0089äÁ{\u001aÉp_ª-Ë¼/\u0012cà¹vøÄÃ[1)M¿\u008e\r\u0092\u009cPr\u0018À°Vá%$»q\tÿ\u009fþmÀü\u0016RB \u0095¶Ô\u0005\\\u009bwi£ÿôNhÜg²±\u0000ò\u0096Áe\u0001û\nI\u0091ßÕ®\u000f<c\u0092¢`ø÷2EvÛý©ñ?Í\u008eN\u001cMò\u009d@Ø×\u0013¥q;¡\u0089ç\u0018vîr|½Ò\u0095 Æ\u0094\u009b\u0005D·;!ÜÓ\u0094LOþ%hÿ\u001a\u009e\u008bz%6×ìA\u00adó\u0096ld\u001e\u0018\u0088Û:Ç«\u0005EM÷ûaº\u0012h\u008c\">â¨ïZ\u0096ËZe\u000b\u0017Í\u0081\u00802\t¬0^òÈ¬yjë#\u0085î7¢¡ÑR[Ì_~Äè\u008c\u0099]\u000b'¥õW·Àvrgìø\u009e¬\b\u008f¹\u001b+\u000bÅÀw\u0086àC\u00925\fá¾þ/wÙ+Kâå×\u0097\u0099\u0000\u0018²\u001c,ÈÞ\u008fO\fù>kô\u0005º¶  *ÒèL\u0093þ\u0080oQ\u0019\u0007\u008b\u0087%\u008cÖD@1òòl¨\u001d`\u008f&9¯«ÓE\u0094öL`\u0007\u0012\u0084\u008c\u009d=}¯<YýË³d&\u0016f\u0080²2\u0091¬\u008e]MÏ\u0015yÀìW}\u0088Ï÷Y\u0010«X4\u0083\u0086é\u00103bRó¶]ú¯ 9a\u008bZ\u0014¨fÔð\u0017B\u000bÓÉ=\u0081\u008f4\u0019xjðôàF'Ðw\"_³\u0091\u001d\u0092o\tùGJ\u0090Ôð&?°4\u0001³\u0093ïý3OwÙX*\u0093´Ý\u0006L\u0090Má\u008bsìÝ,/t¸ \nÿ\u0094dæqp[Á\u008eS\u0090½\u001a\u000fG\u0098\u008fêðt<ÆfWï¡ü3*\u009d\u0015ï^x\u009aÊÂTJ¦F7\u008e\u0081ù\u0013v}wÎ¥Xîª+4\u000b\u0086Y\u0017\u0099a\u008eó\b]E®\u00938þ\u008aw\u0014de¢÷íA&Ó\u0012=JÑ\u000e@Ñò®dI\u0096\u0001\tÚ»°-j_\u000bÎï`£\u0092y\u00048¶\u0003)ñ[\u008dÍN\u007fRî\u0090\u0000Ø²@$&WìÉ·{tíz\u001f\u0003\u008eÏ \u0099R\u0016Ä\u0018wØé¢\u001bl\u008d9<á®°À\u007fr5äD\u0017Ã\u0089\u008b;F\u00ad\u0004Ü\u009bN àn\u00129\u0085å7ò©mÛ9M\rü\u008en\u008d\u0080]2\u0018¥Ó×±Is\u008b3\u001aì¨\u0093>tÌ<Sçá\u008dwW\u00056\u0094Ò:\u009eÈD^\u0005ì>sÌ\u0001°\u0097s%o´\u00adZåèr~\u0012\rÇ\u0093\u009d!\u0002·\u0001E7Ôèz¤\b+\u009e<-à³\u0094A\u001f×\u001dfÔô\u009a\u009a@(\f¾uM²Ó»am÷9\u0086¡\u0014\u0088º\u001cH\u0003ßÏm\u0089óR\u0081\u0000\u0017-¦û4øÚ)h.ÿæ\u008d\u008b\u0013I¡V0ÙÆ\u0089TGúh\u0088:\u001fã\u00ad½3.Á*P÷æÙt\b\u001aW\u0094\u009b\u0005D·;!ÜÓ\u0094LOþ%hÿ\u001a\u009e\u008bz%6×ìA\u00adó\u0096ld\u001e\u0018\u0088Û:Ç«\u0005EM÷øa´\u0012<\u008c,>ë¨»Z\u0093Ë]e^\u0017Å\u0081\u008b2\\¬<^óÈøyjëi\u0085«7 ¡\u0090RIÌ\u000b~\u0080è\u0083\u0099A\u000b&¥æWùÀrr&ìæþúo%ÝZK½¹õ&.\u0094D\u0002\u009epÿá\u001bOW½\u008d+Ì\u0099÷\u0006\u0005tyâºP¦Ád/,\u009d\u0085\u000bßx\u001bæRT\u008eÂÝ0ù¡t\u000f~}®ë÷X-ÆR4\u0092¢À\u0013\\\u0081Wï\u008f]ßËö84¦l\u0014¬\u0082áó+a\u0012ÏØ=\u0086ªC\u0018@\u0086\u0088ôÀbäÓ?®H?\u0097\u008dè\u001b\u000féGv\u009cÄöR, M±©\u001fåí?{~ÉEV·$Ë²\b\u0000\u0014\u0091Ö\u007f\u009eÍ)[i(¼¶æ\u0004y\u0092x`Jñ\u0081_Ä-\u0004»V\b\u0096\u0096¡d'òjC¼Ññ¿x\rk\u009bMh\u0082öÉD\u001dÒ\u0016£\u008f1å\u009f!mxú´HçÖ3¤>2L\u0083\u009b\u0011\u008fÿ\u001dMLÚ\u0088¨ç6'\u0084y\u0015µãóqzß\u0002\u00adK:\u0086\u0088Þ\u0016\u0014äJu\u009aÃæQi?x\u008c¼\u001a¶è1v\u0001ÄSU\u008f#Â±\u0000\u001f\u001bì\u009azìÈ;V{'³µ÷\u0003(\u0091C\u007fVÌ\u008cZÉ(W¶M\u0007 \u0095èc'ñk^¡,¸º*\b\u0012\u0096Mg\u008dõÇC\u0013Ñ\u0011¾à\fõ\u009a/hwù¦GþÕ-£\r1A\u009e\u0081lÕúYHHÙ¬§í5(\u0083~\u0010¤\u0094\u009b\u0005D·;!ÜÓ\u0094LOþ%hÿ\u001a\u009e\u008bz%6×ìA\u00adó\u0096ld\u001e\u0018\u0088Û:Ç«\u0005EM÷úaº\u0012o\u008c5>ª¨«Z\u0099ËRe\u0017\u0017×\u0081\u00852E¬r^ôÈ¹yoë\"\u0085«7¸¡\u009eRQÌ\u001a~ÎèÅ\u0099\\\u000b6¥òW«Àgr4ìà\u009eí\b\u009f¹H+\\ÅÔw\u009aà\u000f\u0092$\fú¾þ/gÙ%Kýå×\u0097×\u0000[²\u0012,ËÞ\u009bOMù#kÿ\u0005»¶  1ÒáL\u0093þ\u0098oX\u0019\u0016\u008bÂ%\u009bÖY@vòÿlµ\u001dr\u008f>9î«ÞE\u0081ö\u001e`\u0013\u0012Å\u008c\u0090=2¯ YùË±dj\u0016.\u0080ø2\u0091¬\u008f]OÏ\u0004yÄë\u009a\u0084v6t ´RüÃ'}.ïì\u0099Ú\u000b\u0088¤Yndÿ»MÄÛ#)k¶°\u0004Ú\u0092\u0000àaq\u0085ßÉ-\u0013»R\ti\u0096\u009bäçr$À8Qú¿²\r\r\u009bMè\u0090vÊÄ\u0014R^ {1ê\u009fñí={bÈöVÚ¤\t2K\u0083\u008e\u0011Ü\u007f\u0000Í\u0013[z¨ª6ë\u0084:\u0012tcññÊ_\u000e\u00adR:\u009e\u0088Ð\u0016\u001ed\\ònCäÑå??\u008d|\u001a¼hÊö\u000eD\u0001ÕÆ#\u009b".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1068);
                f24922e = cArr;
                f24919a = -5546619103301532361L;
            }

            AnonymousClass5() {
            }

            /* JADX WARN: Removed duplicated region for block: B:203:0x02ab  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void b(java.util.List<o.es.e> r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1543
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.b(java.util.List):void");
            }

            private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                o.a.o oVar = new o.a.o();
                long[] jArr = new long[i3];
                oVar.f19947b = 0;
                while (oVar.f19947b < i3) {
                    int i5 = $10 + 27;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = oVar.f19947b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(f24922e[i2 + i7])};
                        Object objA = o.d.d.a(-214519724);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objA = o.d.d.a(Color.blue(0) + 742, (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getOffsetBefore("", 0) + 12, 632508977, false, $$c(b2, b3, (byte) ((b3 + 6) - (6 | b3))), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f24919a), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(-1567654649);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objA2 = o.d.d.a(TextUtils.indexOf("", "") + 766, (char) (12470 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Drawable.resolveOpacity(0, 0) + 12, 1946853218, false, $$c(b4, b5, (byte) (5 & b5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {oVar, oVar};
                        Object objA3 = o.d.d.a(-723636472);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 - 1);
                            objA3 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 386, (char) Color.green(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, 39570797, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
                int i8 = $11 + 15;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (oVar.f19947b < i3) {
                    int i10 = $11 + 25;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr5 = {oVar, oVar};
                    Object objA4 = o.d.d.a(-723636472);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objA4 = o.d.d.a(Color.blue(0) + 387, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 39570797, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr);
            }

            static void init$0() {
                $$a = new byte[]{39, 4, 32, -80};
                $$b = 40;
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                int i2 = 2 % 2;
                int i3 = f24921d + 49;
                f24920c = i3 % 128;
                int i4 = i3 % 2;
                b(list);
                int i5 = f24920c + 35;
                f24921d = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 0;
                }
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) throws Throwable {
                int i2 = 2 % 2;
                int i3 = f24920c + 65;
                f24921d = i3 % 128;
                if (i3 % 2 == 0) {
                    o.ea.f.a();
                    throw null;
                }
                if (o.ea.f.a()) {
                    String strA = d.this.a();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr = new Object[1];
                    f((char) (64255 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1005 - (KeyEvent.getMaxKeyCode() >> 16), 63 - TextUtils.getTrimmedLength(""), objArr);
                    o.ea.f.d(strA, sb.append(((String) objArr[0]).intern()).append(cVar.c()).toString());
                    int i4 = f24921d + 105;
                    f24920c = i4 % 128;
                    int i5 = i4 % 2;
                }
                AnonymousClass4.this.f24914b.onError(cVar.a());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r8, byte r9, short r10) {
            /*
                int r0 = r8 * 4
                int r8 = 120 - r0
                byte[] r7 = o.er.d.AnonymousClass4.$$c
                int r0 = r10 * 4
                int r6 = r0 + 4
                int r1 = r9 * 2
                int r0 = 1 - r1
                byte[] r5 = new byte[r0]
                r4 = 0
                int r3 = 0 - r1
                if (r7 != 0) goto L2c
                r2 = r6
                r0 = r4
            L17:
                int r8 = r8 + r6
                int r6 = r2 + 1
            L1a:
                byte r1 = (byte) r8
                r5[r0] = r1
                if (r0 != r3) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L25:
                r1 = r7[r6]
                int r0 = r0 + 1
                r2 = r6
                r6 = r1
                goto L17
            L2c:
                r0 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.$$e(short, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f24912l = 1057088318;
            f24911k = -106038079;
            f24908g = 958951405;
            init$0();
            f24907f = 0;
            f24909i = 1;
            f24910j = new char[]{56567, 56395, 56375, 56381, 56366, 56394, 56437, 56439, 56438, 56435, 56426, 56392, 56402, 56441, 56438, 56399, 56401, 56438, 56396, 56402, 56436, 56432, 56436, 56430, 56436, 56403, 56366, 56366, 56404, 56437, 56416, 56418, 56428, 56430, 56439, 56437, 56412, 56417, 56419, 56414, 56435, 56433, 56410, 56419, 56438, 56431, 56436, 56439, 56430, 56323, 56325, 56334, 56334, 56335, 56547, 56338, 56325, 56327, 56327, 56341, 56322, 56325, 56548, 56339, 56329, 56324, 56325, 56340, 56321, 56439, 56432, 56441, 56441, 56438, 56437, 56417, 56421, 56443, 56422, 56415, 56430, 56438, 56441, 56434, 56433, 56438, 56553, 56429, 56714, 56720, 56724, 56719, 56717, 56715, 56712, 56722, 56719, 56711, 56440, 56413, 56436, 56725, 56506, 56563, 56553, 56546, 56548, 56555, 56528, 56529, 56566, 56566, 56529, 56525, 56552, 56555, 56560, 56553, 56552, 56525, 56521, 56548, 56547, 56555, 56558, 56523, 56529, 56563, 56553, 56546, 56550, 56555, 56554, 56523, 56521, 56556, 56563, 56562, 56555, 56553, 56561, 56553, 56504, 56559, 56558, 56548, 56391, 56384, 56352, 56360, 56397, 56397, 56360, 56356, 56383, 56386, 56391, 56384, 56383, 56356, 56353, 56388, 56394, 56384, 56377, 56379, 56377, 56377, 56384, 56382, 56376, 56382, 56383, 56379, 56352, 56358, 56472, 56471, 56529, 56566, 56566, 56529, 56525, 56552, 56555, 56560, 56553, 56552, 56525, 56521, 56548, 56547, 56555, 56558, 56523, 56529, 56563, 56553, 56546, 56550, 56555, 56554, 56523, 56529, 56563, 56553, 56546, 56550, 56555, 56554, 56547, 56551, 56558};
        }

        AnonymousClass4(OperationCallback operationCallback, o.es.c cVar, o.eo.e eVar, boolean z2, Context context) {
            this.f24914b = operationCallback;
            this.f24915c = cVar;
            this.f24913a = eVar;
            this.f24916d = z2;
            this.f24917e = context;
        }

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x017c: ARITH (r9 I:??[int, boolean]) = (r8 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:134:0x017c */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v7 */
        public static Object[] b(int i2, int i3) throws Throwable {
            int i4;
            Object[] objArr;
            Object[] objArr2;
            int i5;
            String line;
            boolean zEquals;
            boolean zEquals2;
            File file;
            FileReader fileReader;
            BufferedReader bufferedReader;
            File file2;
            File file3;
            int i6 = 2 % 2;
            Object obj = null;
            try {
                i4 = i2;
                Object[] objArr3 = new Object[1];
                m(null, new int[]{49, 19, 32, 16}, true, objArr3);
                Object[] objArr4 = new Object[1];
                m("\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{68, 18, 139, 0}, false, objArr4);
                String[] strArr = {((String) objArr3[0]).intern(), ((String) objArr4[0]).intern()};
                for (int i7 = 0; i7 < 2; i7++) {
                    int i8 = f24909i + 23;
                    f24907f = i8 % 128;
                    if (i8 % 2 == 0) {
                        String str = strArr[i7];
                        Object[] objArr5 = new Object[1];
                        m("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{86, 16, 164, 8}, true, objArr5);
                        Class<?> cls = Class.forName(((String) objArr5[0]).intern());
                        if ((((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue() ? '!' : (char) 4) == '!') {
                            int i9 = f24909i + 71;
                            int i10 = i9 % 128;
                            f24907f = i10;
                            int i11 = i9 % 2;
                            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4 ^ 1}};
                            int i12 = f24911k * 165228167;
                            f24911k = i12;
                            int i13 = ~((-1) - (((-1) - (-630211842)) & ((-1) - i12)));
                            int i14 = 230924361 + ((33751620 | i13) * (-476)) + (i13 * 952);
                            int i15 = ~i12;
                            int i16 = i3 + i14 + ((~((i15 - 630211842) - (i15 & (-630211842)))) * 476) + 16;
                            int i17 = i16 ^ (i16 << 13);
                            int i18 = i17 ^ (i17 >>> 17);
                            int i19 = i10 + 111;
                            f24909i = i19 % 128;
                            int i20 = i19 % 2;
                            break;
                        }
                    } else {
                        String str2 = strArr[i7];
                        Object[] objArr6 = new Object[1];
                        m("\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{86, 16, 164, 8}, true, objArr6);
                        Class<?> cls2 = Class.forName(((String) objArr6[0]).intern());
                        if (((Boolean) cls2.getMethod(str2, new Class[0]).invoke(cls2, null)).booleanValue()) {
                            int i92 = f24909i + 71;
                            int i102 = i92 % 128;
                            f24907f = i102;
                            int i112 = i92 % 2;
                            objArr = new Object[]{new int[]{i18 ^ (i18 << 5)}, new int[]{i4}, null, new int[]{i4 ^ 1}};
                            int i122 = f24911k * 165228167;
                            f24911k = i122;
                            int i132 = ~((-1) - (((-1) - (-630211842)) & ((-1) - i122)));
                            int i142 = 230924361 + ((33751620 | i132) * (-476)) + (i132 * 952);
                            int i152 = ~i122;
                            int i162 = i3 + i142 + ((~((i152 - 630211842) - (i152 & (-630211842)))) * 476) + 16;
                            int i172 = i162 ^ (i162 << 13);
                            int i182 = i172 ^ (i172 >>> 17);
                            int i192 = i102 + 111;
                            f24909i = i192 % 128;
                            int i202 = i192 % 2;
                            break;
                        }
                    }
                }
                objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4}};
                int i21 = ~((-659792779) | i4);
                int i22 = (-1581569811) + (((i21 + 17825802) - (i21 & 17825802)) * IptcDirectory.TAG_TIME_SENT) + (((-1) - (((-1) - (-660322220)) & ((-1) - (~((-1) - (((-1) - i4) & ((-1) - 18355243))))))) * (-168));
                int i23 = ~i4;
                int i24 = i3 + i22 + (((-1) - (((-1) - (-659792779)) & ((-1) - (~((18355243 + i23) - (18355243 & i23)))))) * 168);
                int i25 = i24 ^ (i24 << 13);
                int i26 = i25 ^ (i25 >>> 17);
            } catch (Exception unused) {
                objArr = new Object[]{new int[1], new int[]{i4}, null, new int[]{i4 ^ 2}};
                int i27 = ~Process.myPid();
                int i28 = i3 + 1683208861 + (((-104862889) | i27) * 184) + (((~((i27 + 295297799) - (i27 & 295297799))) | (-122173354)) * 184) + 16;
                int i29 = i28 ^ (i28 << 13);
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr[0])[0] = i30 ^ (i30 << 5);
            }
            if (i4 != ((int[]) objArr[3])[0]) {
                int i31 = f24909i + 61;
                f24907f = i31 % 128;
                if (i31 % 2 == 0) {
                    return objArr;
                }
                obj.hashCode();
                throw null;
            }
            try {
                Object objA = o.d.d.a(26976634);
                if (objA == null) {
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + ExifDirectoryBase.TAG_TILE_LENGTH;
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 11;
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr7 = new Object[1];
                    n(b2, b3, b3, objArr7);
                    objA = o.d.d.a(scrollBarFadeDuration, modifierMetaStateMask, offsetAfter, -685882593, false, (String) objArr7[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objA).invoke(null, null)).longValue();
                long j2 = 410270763;
                long j3 = (((long) (-665)) * j2) + (((long) 334) * jLongValue);
                long j4 = -1;
                long j5 = j2 ^ j4;
                long j6 = 333;
                long j7 = i4;
                long j8 = j7 ^ j4;
                long j9 = j3 + (((long) (-333)) * j5) + (((((j5 + j8) - (j5 & j8)) ^ j4) | (((-1) - (((-1) - jLongValue) & ((-1) - j7))) ^ j4)) * j6) + (j6 * ((-1) - (((-1) - (j4 ^ ((-1) - (((-1) - j8) & ((-1) - jLongValue))))) & ((-1) - (((-1) - (((-1) - j7) & ((-1) - j5))) ^ j4))))) + ((long) (-948551921));
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i32 = ((int) (j9 >> 32)) & (384374654 + (((-1) - (((-1) - (~((-1) - (((-1) - (~elapsedCpuTime)) & ((-1) - (-1647115525)))))) & ((-1) - 1647073284))) * 446) + (((-1) - (((-1) - (~(elapsedCpuTime | (-42241)))) & ((-1) - (-1856962398)))) * 446) + 155277048);
                int i33 = (int) j9;
                int i34 = f24908g * 461480191;
                f24908g = i34;
                int i35 = ~i34;
                int i36 = ~((-1) - (((-1) - 417634090) & ((-1) - i35)));
                int i37 = (-434401142) + (((i36 + 1019592319) - (i36 & 1019592319)) * (-865)) + ((~((-1) - (((-1) - i34) & ((-1) - (-417634091))))) * 865) + (((~((1019592319 + i35) - (1019592319 & i35))) | (~(i35 | (-417634091)))) * 865);
                if ((i32 | ((i33 + i37) - (i33 | i37))) == 1) {
                    objArr2 = new Object[]{new int[1], new int[]{i4}, null, new int[]{i4 ^ 10}};
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i38 = i3 + 198317687 + (((~(iElapsedRealtime | 596415417)) | 81732604) * 191) + (((-1) - (((-1) - (~((-1) - (((-1) - (~iElapsedRealtime)) & ((-1) - 596415417))))) & ((-1) - 72556612))) * 191) + 16;
                    int i39 = i38 ^ (i38 << 13);
                    int i40 = i39 ^ (i39 >>> 17);
                    i5 = 0;
                    ((int[]) objArr2[0])[0] = i40 ^ (i40 << 5);
                } else {
                    objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4}};
                    int i41 = ~i4;
                    int i42 = (-676070959) + (((-1) - (((-1) - (~((-1) - (((-1) - 238447427) & ((-1) - i41))))) & ((-1) - 439700594))) * (-328)) + ((i4 | 439700594) * 164);
                    int i43 = ~((-238447428) | i4);
                    int i44 = i3 + i42 + (((-1) - (((-1) - (~((i41 + 506949491) - (i41 & 506949491)))) & ((-1) - ((i43 + 171198530) - (i43 & 171198530))))) * 164);
                    int i45 = i44 ^ (i44 << 13);
                    int i46 = i45 ^ (i45 >>> 17);
                    i5 = 0;
                }
                if (i4 != ((int[]) objArr2[3])[i5]) {
                    return objArr2;
                }
                try {
                    Object[] objArr8 = new Object[1];
                    m("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{102, 40, i5, 6}, i5, objArr8);
                    file3 = new File(((String) objArr8[i5]).intern());
                } catch (Exception unused2) {
                }
                if (file3.canRead()) {
                    fileReader = new FileReader(file3);
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        line = bufferedReader.readLine();
                        Object[] objArr9 = new Object[1];
                        m("\u0000\u0000\u0001", new int[]{142, 3, 0, 1}, false, objArr9);
                        if (line.equals(((String) objArr9[0]).intern())) {
                            fileReader.close();
                            bufferedReader.close();
                            line = null;
                        } else {
                            fileReader.close();
                            bufferedReader.close();
                        }
                    } finally {
                    }
                } else {
                    line = null;
                }
                try {
                    Object[] objArr10 = new Object[1];
                    m("\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{145, 31, 87, 29}, false, objArr10);
                    file2 = new File(((String) objArr10[0]).intern());
                } catch (Exception unused3) {
                }
                if (!(!file2.canRead())) {
                    fileReader = new FileReader(file2);
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        String line2 = bufferedReader.readLine();
                        Object[] objArr11 = new Object[1];
                        m("\u0001", new int[]{176, 1, 0, 1}, false, objArr11);
                        zEquals = line2.equals(((String) objArr11[0]).intern());
                        fileReader.close();
                        bufferedReader.close();
                    } finally {
                    }
                } else {
                    int i47 = f24907f + 59;
                    f24909i = i47 % 128;
                    zEquals = i47 % 2 == 0;
                }
                if (zEquals) {
                    char c2 = Typography.dollar;
                    try {
                        Object[] objArr12 = new Object[1];
                        m("\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{177, 36, 0, 0}, false, objArr12);
                        file = new File(((String) objArr12[0]).intern());
                    } catch (Exception unused4) {
                    }
                    if ((!file.canRead() ? (char) 20 : (char) 27) != 27) {
                        zEquals2 = false;
                    } else {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        try {
                            String line3 = bufferedReader.readLine();
                            Object[] objArr13 = new Object[1];
                            m("\u0001", new int[]{176, 1, 0, 1}, false, objArr13);
                            zEquals2 = line3.equals(((String) objArr13[0]).intern());
                            fileReader.close();
                            bufferedReader.close();
                        } finally {
                        }
                    }
                    if (zEquals2) {
                        if (line == null) {
                            c2 = '8';
                        }
                        if (c2 != '8') {
                            int i48 = f24907f + 3;
                            f24909i = i48 % 128;
                            int i49 = i48 % 2;
                            Object[] objArr14 = {new int[]{i ^ (i << 5)}, new int[]{i4}, line, new int[]{i4 ^ 20}};
                            int i50 = ~i4;
                            int i51 = i3 + 1130037894 + (((-1) - (((-1) - (~(((-252538520) + i50) - ((-252538520) & i50)))) & ((-1) - 425609502))) * (-90)) + (((-1) - (((-1) - (~((-252538520) | i4))) & ((-1) - (-526348192)))) * (-45)) + (((-1) - (((-1) - (~(i50 | 425609502))) & ((-1) - ((~((-1) - (((-1) - i4) & ((-1) - (-425609503))))) | (-252538520))))) * 45) + 16;
                            int i52 = i51 ^ (i51 << 13);
                            int i53 = i52 ^ (i52 >>> 17);
                            return objArr14;
                        }
                    }
                }
                Object[] objArr15 = {new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4}};
                int i54 = f24912l * 834425909;
                f24912l = i54;
                int i55 = ~i54;
                int i56 = (-2018260938) + (((~(((-594728518) + i55) - ((-594728518) & i55))) | 83419504) * (-602));
                int i57 = ~(i54 | (-594728518));
                int i58 = (i57 + 7389248) - (i57 & 7389248);
                int i59 = ~((-1) - (((-1) - 670758773) & ((-1) - i55)));
                int i60 = i3 + i56 + (((i58 + i59) - (i58 & i59)) * (-301)) + ((~(i55 | 83419504)) * 301);
                int i61 = i60 ^ (i60 << 13);
                int i62 = i61 ^ (i61 >>> 17);
                return objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        private void d(c.e eVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24907f + 63;
            f24909i = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                c.e eVar2 = c.e.f25300d;
                obj.hashCode();
                throw null;
            }
            if (eVar == c.e.f25300d) {
                this.f24915c.c(new c.a<List<o.es.e>>() { // from class: o.er.d.4.5
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10 = 0;
                    private static int $11 = 0;

                    /* JADX INFO: renamed from: a */
                    private static long f24919a = 0;

                    /* JADX INFO: renamed from: c */
                    private static int f24920c = 0;

                    /* JADX INFO: renamed from: d */
                    private static int f24921d = 0;

                    /* JADX INFO: renamed from: e */
                    private static char[] f24922e = null;

                    /* JADX INFO: renamed from: o.er.d$4$5$2 */
                    public class AnonymousClass2 implements e.d<o.ep.i> {
                        private static final byte[] $$a = null;
                        private static final int $$b = 0;
                        private static final byte[] $$c = null;
                        private static final byte[] $$d = null;
                        private static final int $$e = 0;
                        private static final int $$f = 0;
                        private static int $10 = 0;
                        private static int $11 = 0;
                        public static int A = 0;
                        public static int B = 0;
                        public static int C = 0;
                        public static int D = 0;
                        public static int E = 0;
                        public static int F = 0;
                        public static int G = 0;
                        public static int H = 0;

                        /* JADX INFO: renamed from: a */
                        private static long f24924a = 0;

                        /* JADX INFO: renamed from: c */
                        private static int f24925c = 0;

                        /* JADX INFO: renamed from: d */
                        private static int f24926d = 0;

                        /* JADX INFO: renamed from: e */
                        private static char[] f24927e = null;

                        /* JADX INFO: renamed from: f */
                        public static int f24928f = 0;

                        /* JADX INFO: renamed from: g */
                        public static int f24929g = 0;

                        /* JADX INFO: renamed from: h */
                        public static int f24930h = 0;

                        /* JADX INFO: renamed from: i */
                        public static int f24931i = 0;

                        /* JADX INFO: renamed from: j */
                        public static int f24932j = 0;

                        /* JADX INFO: renamed from: k */
                        public static int f24933k = 0;

                        /* JADX INFO: renamed from: l */
                        public static int f24934l = 0;

                        /* JADX INFO: renamed from: m */
                        public static int f24935m = 0;

                        /* JADX INFO: renamed from: n */
                        public static int f24936n = 0;

                        /* JADX INFO: renamed from: o */
                        public static int f24937o = 0;

                        /* JADX INFO: renamed from: p */
                        public static int f24938p = 0;

                        /* JADX INFO: renamed from: q */
                        public static int f24939q = 0;

                        /* JADX INFO: renamed from: r */
                        public static int f24940r = 0;

                        /* JADX INFO: renamed from: s */
                        public static int f24941s = 0;

                        /* JADX INFO: renamed from: t */
                        public static int f24942t = 0;

                        /* JADX INFO: renamed from: u */
                        public static int f24943u = 0;

                        /* JADX INFO: renamed from: v */
                        public static int f24944v = 0;

                        /* JADX INFO: renamed from: w */
                        public static int f24945w = 0;

                        /* JADX INFO: renamed from: x */
                        public static int f24946x = 0;

                        /* JADX INFO: renamed from: y */
                        public static int f24947y = 0;

                        /* JADX INFO: renamed from: z */
                        public static int f24948z = 0;

                        private static String $$g(short v2, short v3, int v4) {
                            /*
                                byte[] r8 = o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.$$c
                                int r7 = r9 * 4
                                int r1 = r7 + 1
                                int r6 = 105 - r11
                                int r0 = r10 * 4
                                int r5 = 4 - r0
                                byte[] r4 = new byte[r1]
                                r3 = 0
                                if (r8 != 0) goto L2b
                                r2 = r7
                                r0 = r5
                                r1 = r3
                            L14:
                                int r5 = r5 + r2
                                int r0 = r0 + 1
                                r6 = r5
                                r5 = r0
                            L19:
                                byte r0 = (byte) r6
                                r4[r1] = r0
                                if (r1 != r7) goto L24
                                java.lang.String r0 = new java.lang.String
                                r0.<init>(r4, r3)
                                return r0
                            L24:
                                r2 = r8[r5]
                                int r1 = r1 + 1
                                r0 = r5
                                r5 = r6
                                goto L14
                            L2b:
                                r1 = r3
                                goto L19
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.$$g(short, short, int):java.lang.String");
                        }

                        static {
                            init$2();
                            $10 = 0;
                            $11 = 1;
                            init$1();
                            H = -286996731;
                            G = 614495132;
                            F = -1131672825;
                            E = 635909963;
                            D = 211998065;
                            C = 526263993;
                            B = -157603599;
                            A = 479049460;
                            f24948z = -1538929677;
                            f24947y = 558071713;
                            f24946x = 1313811708;
                            f24945w = 1898373301;
                            f24944v = 1932047893;
                            f24943u = -804528149;
                            f24942t = -412716738;
                            f24941s = 491071215;
                            f24940r = -1102487025;
                            f24939q = -2013926664;
                            f24938p = -1692308737;
                            f24937o = 1664507465;
                            f24936n = -615686389;
                            f24935m = 2131591044;
                            f24934l = 2122480764;
                            f24933k = -1396983772;
                            f24932j = 958353266;
                            f24931i = -463970879;
                            f24930h = 1078576135;
                            f24929g = -776544085;
                            f24928f = -589035752;
                            init$0();
                            f24925c = 0;
                            f24926d = 1;
                            char[] cArr = new char[PhotoshopDirectory.TAG_MAC_NSPRINTINFO];
                            ByteBuffer.wrap("\u0094\u009b*²è×®\nlL\"iá\u0089§ùe.;\\ùz¸ª~õ<\u0000òh°nw»5±ËI\u0089\u001bOj\u000e´Ì÷\u0082\u000e@N\u0006hÅ°\u009b³Y\u0005\u001fTÝz\u009c»R²\u0010\u0015Ö[\u0094`+»éÃ¯@mE#oâ¿ Þf\u0006$Eúm¹½\u007fËf$Ø\r\u001ah\\µ\u009eóÐÖ\u00136UF\u0097\u0091Éã\u000bÅJ\u0015\u008cJÎ¿\u0000×BÑ\u0085\u0004Ç\u000e9ö{¤½Õü\u000b>Hp±²ñô×7\u000fi\f«ºíë/Ån\u0004 \râª$äfßÙ\u0004\u001b|]ÿ\u009fúÑÐ\u0010\u0000Ra\u0094¹Öú\bÒKG\u008dvÏ¼\u0001çC×\u0082\u0011Äc\u0006§x¯º\u0082ýE\u0094·*¬èá®\u0007l_\"yá¯§åe.;\\ùx¸¦~õ<\u0011òQ°`w¬\u0094\u0080* èç®\u001blh\"dá²§ãe\u001f;Xù`¸\u0086~ø<\u0013òQ°}w\u00ad5ÿË\t\u0089^O`\u000e©ÌÔ\u0082\u0002@N\u0006lÅ¿\u009bçY\u0003\u001fQÝ(\u009còR²\u0010\u0017Ö]\u0094y+ªéØ¯\u0001m[#Oâ· Úf\n$Dúj¹¶\u007fÂ=\u0007ó_±pp\u00986Áô\u0019\u008aUH=\u000fú\u0094\u0093*±èä®\u000elP\"i\u0094\u0086*®èÇ®\u001flL\"dá®§ð\u0094\u0080* èç®\u001blh\"dá²§ãe\u001f;Xù`¸\u0086~ø<\u0013òQ°}w\u00ad5ÿË\t\u0089^O`\u000e©ÌÔ\u0082\u0002@N\u0006lÅ¿\u009bçY\u0003\u001fQÝ(\u009còR²\u00106ÖU\u0094g+²éÈ¯\u0014m\u0017#dâ¶ ØfC$_úk¹±\u007fÛ=\u000bóP±hp²6Ôô\u0018\u008aTH'\u000fµÍÛ\u0083\\AA\u0007sÆ»\u0084ÆZ\u0016\u0018\\Þf\u009døS\u008b\u0011\r×&\u0095iT§b\u0099Ü·\u001e£X\u001a\u009aFÔf\u0017½Qù\u0093\u0012ÍR\u000fp\u0094\u0080* èú®\blV\"x¦@\u0018{Ú-\u009cÚ^\u008d\u0010±Óf\u0095*\u0094\u0080*®èº®\u001blL\"bá¤§âe\t;Mù\"¸®~÷<\u000bòM°iw£5òË\u0010\u0089NO|\u000e¸Ìâ\u0094\u0080*®èº®\u001blL\"bá¤§âe\t;Mù\"¸°~ï<\u0016òL°jw¯5¿Ë\t\u0089ZO`\u000e¨Ìö\u0082\u0006@Y\u0006}Å©\u009báY\u0003\u001fG\u0094Ý*¤èà®\bl\u0011\"dá®§þe\u001e;\u0016ù`¸¯~ý<\u0001ò\u0015°kw§5óË\u0011\u0089\\Oi\u000e¼Ìò\u0082\u000b@_\u0006'Å®\u009bð\u0094\u0080*®èº®\u000fl[\"oáµ§ðe\r;Xùn¸¯~ó\u0094Ã\u0094\u0093*¥èö®4lU\"há¹§ä:b\u0084BF\u0015\u0000óÂ¡\u008c\u009bVªè\u0090*Ýl$®gàC#\u0098\u0094\u0095*¥èö®\u0018l[\"\u007fá¶§òe\u0018\u0094\u009b*¥èø®\blR\"d\u009cï\"Ûà\u0089¦kdg*\u001déÑ¯\u0081mk3*ñV°Åv\u0081#\u009d\u009d¨_æ\u0019\u0002ÛH\u0094\u009b*±èñ®\u0019lX\">\u0094\u009b*¶\u0094\u009e*®èó®\u001bl[\"\u007fá³§þe\u0019;Mù\"¸°~â<\u0004òJ°{°\u0002\u000e2Ìo\u008a\u0083HÃ\u0006öÅ8\u0083%A\u0084\u001fÆ\u0094\u0082*³èû®\blL\"lá®§ü\u0094\u0082*³èû®\rl]\"bá¬§ûe\u000f;Zùx¸§§ô\u0019ÅÛ\u008d\u009d{_+\u0011\u0014ÒÚ\u0094\u008dVy\b,Ê\u000e\u008bÖM\u0094\u000f\u007f©®\u0017\u008aÕ×\u0093*Qe\u001fMÜ\u009a\u0094\u0081*©èû®\u001clS\"lá°\u008eü0Íò\u0085´\u007fv78\u0015û\u008e\u0094\u0081*²9\u009c\u0087¨Eè\u0003\u0004ÁW\u008fOLª\nãÈ\u0003\u0096LTN\u0015²Óä\u0091\u001b_N\u001dsÚ¸\u0098éf\u0017$Rº¢\u0004\u0096ÆÅ\u0080)B~\fK\u0094\u0081*´Æ\u0004x%º\u007fü\u0087>Ïpá³?õw7\u009di\u0091«úê2,rn\u0094 Èâù\u0014\u0085ª°hö.\u000bìX¢~a¢'àå\u0001A\u0099ÿ¬=ê{\u0017¹D÷b4¾rü°\u001dî\u0010\u0094\u0086*³èõ®\bl[\"\u007fá¯§âe\u001e;\\ù:\u0087¥9\u008dûÁ½ \u007fr1Kò½´Üv&(}êA\u0094\u0087*¯èã®\u0002lP\"iá\u009f§åe\u000f;^ùS¸ª~ø<\u0003òW\u0094\u0087*¯èã®\u0002lP\"iá\u009f§äe\u0013;Tùn¸¬~ú<\u0016*n\u0094\u0001V^\u0010«Òù\u009cÛ_\u001e\u0019\u000bÛ»\u0085ãGÑ\u0006_\u0094Ý*²èí®\u0018l\u0011\"ká³§¸e\u0019;\\ù`¸ª~ø<\u0010ò@° w§5ÿË\u0002\u0089TO|\u000e¾Ìõ{\u000fÅc\u00074AÖ\u0083\u008fÍð\u000eaH \u008aÔÔ\u008d\u0016ñWb\u00910ÓÖ\u001d\u009e_¨\u0098c\u0094Ý*¥èñ®\u001dÄÁz®¸ñþ\u0004<Vrt±±\u0094Ý*²èí®\u0018lJ\"há\u00ad§¸e\b;Pùb\u0094Ý*²èí®\u0018lJ\"há\u00ad§¸e\u0019;[ùe¸\u00adVöè\u0099*Æl3®aàC#\u0086e\u0093§9ùp;Nz\u0086pQÎ;\f}J\u0089\u0088ÖÆî\u0005>C4\u0081\u0084ßÜ\u001dî\u0094Ý*²èö®\u0002lP\u0094Ý*¤èà®\b\u0094\u0080*®èº®\tlK\"dá¬§óeD;Qùc¸°~â\u0005>»\u0017yZ?ªýþ³Åp\n6Vô¨ªùhÇ\u000fN±zs(5Ê÷Å¹«zc<!þ\u0091 \u009fb¬#Iå'§Ñi\u0088+·ìx®*\u0094\u0080*´èú®\u0005lW\"cá§Ö\u009eh¸ªúì\u0004.K`b£¨å¥'\u0005y\\»cúñ<ø~\u0016°Kòg5\u0081wì\u0089\u001bËD\rwL²\u008eÿ\u0094Ý*¥èõ®\u001fl_\"\"á¬§øe\t;Xù`¸ì\u0094Ý*¥èõ®\u001fl_\"\"á¬§øe\t;Xù`¸ì~ô<\fòV° \u0094Ý*¥èõ®\u001fl_\"\"á¬§øe\t;Xù`¸ì~î<\u0007òQ°awí,ó\u0092\u009cPØ\u0016,Ô~\u009a\fâq\\\u001e\u009eAØ´\u001aæTÄ\u0097\u0001Ñ\u0014\u0013¤Mü\u008fÎÎ@\b\u0014J¬\u0084ìÆ×\u0001A\u0094Ý*²èí®\u0018lJ\"há\u00ad§¸e\b;Pùb¸ì~ð<\u0004òQ°cw±5ðË\u0002\u0089^O!Y¾çÑ%\u008ec{¡)ï\u000b,ÎjÛ¨zö>4@uØ³\u0097ño?5}C\u0094Ý*²èí®\u0018lJ\"há\u00ad§¸e\u001f;Jù~¸ì~á<\u0000ò\u0015°aw§5ôË\u0000\u0089\u0016O|\u000e²Ìÿ\u0082\u0013@\u0015\u009c\u008d\"âà½¦Hd\u001a*8éý¯èmB3\u000bñ5°ývé\u0094Ý*´èç®\u0019l\u0011\"oá©§ùeEöqH\u001e\u008aMÌè\u000eð@È\u0083\u0002Å\u0014G«ùÇ;\u0090}r¿+ñT2Åt\u0084¶pè)*UkØ\u00ad\u008fïf! c\r¤Ç\u0094©*ñè¹®Rlc\"&\u0094Ý*±èæ®\u0004l]\"\"\u0094Ý*¬èû®\u001elP\"yá³B®üÁ>\u009exkºbô\u00187ÀqË³jí//\u0013nÙ¨\u008bêc$3fS¡Áã\u008d\u001d{_!\u0099\u001eØ×ªx\u0014\u0000ÖT\u0090¸R´\u001cÒß\u001c\u0099U[¦\u0005ïÇÂLSòk0)vÁ´Ûúª9j\u007f2½ÆãÜ!\u0093``¦/äË*\u0092h \u0094\u0081*µèõ®\u0019lJ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, PhotoshopDirectory.TAG_MAC_NSPRINTINFO);
                            f24927e = cArr;
                            f24924a = 596443147465665217L;
                        }

                        AnonymousClass2() {
                        }

                        private static void I(char c2, int i2, int i3, Object[] objArr) throws Throwable {
                            int i4 = 2 % 2;
                            o.a.o oVar = new o.a.o();
                            long[] jArr = new long[i3];
                            oVar.f19947b = 0;
                            int i5 = $11 + 99;
                            $10 = i5 % 128;
                            int i6 = i5 % 2;
                            while (oVar.f19947b < i3) {
                                int i7 = $11 + 47;
                                $10 = i7 % 128;
                                int i8 = i7 % 2;
                                int i9 = oVar.f19947b;
                                try {
                                    Object[] objArr2 = {Integer.valueOf(f24927e[i2 + i9])};
                                    Object objA = o.d.d.a(-214519724);
                                    if (objA == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objA = o.d.d.a(742 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 12, 632508977, false, $$g(b2, b3, (byte) ((b3 + 6) - (6 & b3))), new Class[]{Integer.TYPE});
                                    }
                                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(f24924a), Integer.valueOf(c2)};
                                    Object objA2 = o.d.d.a(-1567654649);
                                    if (objA2 == null) {
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objA2 = o.d.d.a(765 - Process.getGidForName(""), (char) (12470 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, 1946853218, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                    }
                                    jArr[i9] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                                    Object[] objArr4 = {oVar, oVar};
                                    Object objA3 = o.d.d.a(-723636472);
                                    if (objA3 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = b6;
                                        objA3 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 387, (char) Color.alpha(0), 17 - TextUtils.indexOf((CharSequence) "", '0'), 39570797, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
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
                            int i10 = $11 + 107;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            while (oVar.f19947b < i3) {
                                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                                Object[] objArr5 = {oVar, oVar};
                                Object objA4 = o.d.d.a(-723636472);
                                if (objA4 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objA4 = o.d.d.a(387 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "") + 18, 39570797, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objA4).invoke(null, objArr5);
                            }
                            objArr[0] = new String(cArr);
                        }

                        private static void J(short v2, int v3, int v4, Object[] v5) {
                            /*
                                int r0 = r8 * 5
                                int r8 = r0 + 4
                                int r0 = r9 * 2
                                int r7 = r0 + 97
                                int r6 = r10 * 5
                                int r0 = r6 + 1
                                byte[] r5 = o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.$$d
                                byte[] r4 = new byte[r0]
                                r3 = 0
                                if (r5 != 0) goto L2e
                                r2 = r8
                                r1 = r6
                                r0 = r3
                            L16:
                                int r8 = r8 + r1
                                int r8 = r8 + (-5)
                                int r2 = r2 + 1
                                r1 = r0
                            L1c:
                                byte r0 = (byte) r8
                                r4[r1] = r0
                                int r0 = r1 + 1
                                if (r1 != r6) goto L2b
                                java.lang.String r0 = new java.lang.String
                                r0.<init>(r4, r3)
                                r11[r3] = r0
                                return
                            L2b:
                                r1 = r5[r2]
                                goto L16
                            L2e:
                                r1 = r3
                                r2 = r8
                                r8 = r7
                                goto L1c
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.J(short, int, int, java.lang.Object[]):void");
                        }

                        private static void K(short v2, short v3, int v4, Object[] v5) {
                            /*
                                int r2 = r8 * 4
                                int r1 = 1 - r2
                                byte[] r8 = o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.$$a
                                int r7 = r7 + 97
                                int r0 = r6 * 2
                                int r6 = r0 + 4
                                byte[] r5 = new byte[r1]
                                r4 = 0
                                int r3 = 0 - r2
                                if (r8 != 0) goto L30
                                r0 = r7
                                r2 = r4
                                r1 = r6
                            L16:
                                int r0 = -r0
                                int r6 = r6 + r0
                                int r0 = r1 + 1
                                r7 = r6
                                r6 = r0
                            L1c:
                                byte r0 = (byte) r7
                                r5[r2] = r0
                                if (r2 != r3) goto L29
                                java.lang.String r0 = new java.lang.String
                                r0.<init>(r5, r4)
                                r9[r4] = r0
                                return
                            L29:
                                int r2 = r2 + 1
                                r0 = r8[r6]
                                r1 = r6
                                r6 = r7
                                goto L16
                            L30:
                                r2 = r4
                                goto L1c
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.K(short, short, int, java.lang.Object[]):void");
                        }

                        public static void b(Context context, long j2, long j3) throws Throwable {
                            Class[] clsArr;
                            Object objInvoke;
                            Object[] objArr;
                            Method method;
                            int i2 = 2 % 2;
                            long j4 = j2 ^ (j3 << 32);
                            int i3 = f24925c + 97;
                            f24926d = i3 % 128;
                            int i4 = i3 % 2;
                            try {
                                Method method2 = o.ea.f.class.getMethod("a", null);
                                method2.setAccessible(true);
                                if (((Boolean) method2.invoke(null, null)).booleanValue()) {
                                    int i5 = f24926d + 55;
                                    f24925c = i5 % 128;
                                    int i6 = i5 % 2;
                                    Object[] objArr2 = new Object[1];
                                    I((char) View.MeasureSpec.getSize(0), 105 - (ViewConfiguration.getFadingEdgeLength() >> 16), 17 - TextUtils.getCapsMode("", 0, 0), objArr2);
                                    String strIntern = ((String) objArr2[0]).intern();
                                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                                    declaredConstructor.setAccessible(true);
                                    Object objNewInstance = declaredConstructor.newInstance(null);
                                    Object[] objArr3 = new Object[1];
                                    I((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 122 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 57, objArr3);
                                    Object[] objArr4 = {((String) objArr3[0]).intern()};
                                    Object[] objArr5 = new Object[1];
                                    I((char) (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 178, TextUtils.lastIndexOf("", '0', 0, 0) + 7, objArr5);
                                    Method method3 = StringBuilder.class.getMethod(((String) objArr5[0]).intern(), String.class);
                                    method3.setAccessible(true);
                                    Object objInvoke2 = method3.invoke(objNewInstance, objArr4);
                                    Object[] objArr6 = {Long.valueOf(j4)};
                                    Object[] objArr7 = new Object[1];
                                    I((char) ((-1) - Process.getGidForName("")), 179 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, objArr7);
                                    Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), Long.TYPE);
                                    method4.setAccessible(true);
                                    Object objInvoke3 = method4.invoke(objInvoke2, objArr6);
                                    Object[] objArr8 = new Object[1];
                                    I((char) View.MeasureSpec.getMode(0), Drawable.resolveOpacity(0, 0) + 185, 8 - TextUtils.indexOf("", "", 0, 0), objArr8);
                                    Method method5 = StringBuilder.class.getMethod(((String) objArr8[0]).intern(), null);
                                    method5.setAccessible(true);
                                    Object[] objArr9 = {strIntern, method5.invoke(objInvoke3, null)};
                                    Method method6 = o.ea.f.class.getMethod("c", String.class, Object.class);
                                    method6.setAccessible(true);
                                    method6.invoke(null, objArr9);
                                }
                                byte[] bArr = $$d;
                                byte b2 = bArr[2];
                                byte b3 = (byte) (b2 + 1);
                                Object[] objArr10 = new Object[1];
                                J(b3, (byte) ((b3 + 7) - (7 & b3)), (byte) (-b2), objArr10);
                                Class<?> cls = Class.forName((String) objArr10[0]);
                                byte b4 = (byte) (-bArr[2]);
                                byte b5 = (byte) (b4 - 1);
                                Object[] objArr11 = new Object[1];
                                J(b4, b5, b5, objArr11);
                                Method method7 = cls.getMethod((String) objArr11[0], null);
                                method7.setAccessible(true);
                                Object objInvoke4 = method7.invoke(null, null);
                                int i7 = (int) j4;
                                byte b6 = bArr[2];
                                byte b7 = (byte) (b6 + 1);
                                Object[] objArr12 = new Object[1];
                                J(b7, (byte) ((b7 + 7) - (7 & b7)), (byte) (-b6), objArr12);
                                Class.forName((String) objArr12[0]).getField("b").setInt(objInvoke4, i7);
                                byte b8 = bArr[2];
                                byte b9 = (byte) (b8 + 1);
                                Object[] objArr13 = new Object[1];
                                J(b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 7))), (byte) (-b8), objArr13);
                                Class<?> cls2 = Class.forName((String) objArr13[0]);
                                byte b10 = (byte) (-bArr[2]);
                                byte b11 = (byte) (b10 - 1);
                                Object[] objArr14 = new Object[1];
                                J(b10, b11, b11, objArr14);
                                Method method8 = cls2.getMethod((String) objArr14[0], null);
                                method8.setAccessible(true);
                                Object objInvoke5 = method8.invoke(null, null);
                                byte b12 = bArr[2];
                                byte b13 = (byte) (b12 + 1);
                                Object[] objArr15 = new Object[1];
                                J(b13, (byte) (7 | b13), (byte) (-b12), objArr15);
                                Object objInvoke6 = context;
                                if (Class.forName((String) objArr15[0]).getField("d").getBoolean(objInvoke5)) {
                                    return;
                                }
                                if (context == null) {
                                    int i8 = f24926d + 115;
                                    f24925c = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        byte b14 = (byte) (-bArr[2]);
                                        byte b15 = b14;
                                        Object[] objArr16 = new Object[1];
                                        J(b14, b15, (byte) (b15 - 1), objArr16);
                                        Method method9 = o.en.b.class.getMethod((String) objArr16[0], null);
                                        method9.setAccessible(false);
                                        objInvoke = method9.invoke(null, null);
                                        byte b16 = bArr[2];
                                        Object[] objArr17 = new Object[1];
                                        J((byte) (-b16), (byte) ((-1) - (((-1) - $$e) | ((-1) - 56))), (byte) (b16 + 1), objArr17);
                                        objArr = null;
                                        method = o.en.b.class.getMethod((String) objArr17[0], null);
                                        method.setAccessible(true);
                                    } else {
                                        byte b17 = (byte) (-bArr[2]);
                                        byte b18 = b17;
                                        Object[] objArr18 = new Object[1];
                                        J(b17, b18, (byte) (b18 - 1), objArr18);
                                        Method method10 = o.en.b.class.getMethod((String) objArr18[0], null);
                                        method10.setAccessible(true);
                                        objInvoke = method10.invoke(null, null);
                                        byte b19 = bArr[2];
                                        Object[] objArr19 = new Object[1];
                                        J((byte) (-b19), (byte) ((-1) - (((-1) - $$e) | ((-1) - 56))), (byte) (b19 + 1), objArr19);
                                        objArr = null;
                                        method = o.en.b.class.getMethod((String) objArr19[0], null);
                                        method.setAccessible(true);
                                    }
                                    objInvoke6 = method.invoke(objInvoke, objArr);
                                }
                                if (objInvoke6 != null) {
                                    byte b20 = (byte) (-bArr[2]);
                                    byte b21 = b20;
                                    Object[] objArr20 = new Object[1];
                                    J(b20, b21, (byte) (b21 - 1), objArr20);
                                    Method method11 = o.en.b.class.getMethod((String) objArr20[0], null);
                                    method11.setAccessible(true);
                                    Object objInvoke7 = method11.invoke(null, null);
                                    byte b22 = (byte) (-bArr[2]);
                                    byte b23 = (byte) (b22 - 1);
                                    Object[] objArr21 = new Object[1];
                                    J(b22, b23, b23, objArr21);
                                    Method method12 = o.en.b.class.getMethod((String) objArr21[0], null);
                                    method12.setAccessible(true);
                                    if (((Boolean) method12.invoke(objInvoke7, null)).booleanValue()) {
                                        int i9 = f24926d + 47;
                                        f24925c = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            byte b24 = bArr[2];
                                            Object[] objArr22 = new Object[1];
                                            J((byte) (-b24), (byte) bArr.length, (byte) (b24 + 1), objArr22);
                                            clsArr = null;
                                            Method method13 = o.en.b.class.getMethod((String) objArr22[0], null);
                                            method13.setAccessible(true);
                                            if (!((Boolean) method13.invoke(objInvoke7, null)).booleanValue()) {
                                            }
                                            Method method142 = o.dc.d.class.getMethod("a", clsArr);
                                            method142.setAccessible(true);
                                            Object objInvoke82 = method142.invoke(clsArr, clsArr);
                                            Object[] objArr232 = {o.az.a.class.getField("b").get(clsArr), o.dd.g.class.getField("z").get(clsArr)};
                                            Constructor declaredConstructor22 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, o.dd.g.class);
                                            declaredConstructor22.setAccessible(true);
                                            Object[] objArr242 = {objInvoke6, declaredConstructor22.newInstance(objArr232), true};
                                            Method method152 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                                            method152.setAccessible(true);
                                            method152.invoke(objInvoke82, objArr242);
                                            byte b252 = bArr[2];
                                            byte b262 = (byte) (b252 + 1);
                                            Object[] objArr252 = new Object[1];
                                            J(b262, (byte) ((-1) - (((-1) - b262) & ((-1) - 7))), (byte) (-b252), objArr252);
                                            Class<?> cls32 = Class.forName((String) objArr252[0]);
                                            byte b272 = (byte) (-bArr[2]);
                                            byte b282 = (byte) (b272 - 1);
                                            Object[] objArr262 = new Object[1];
                                            J(b272, b282, b282, objArr262);
                                            Method method162 = cls32.getMethod((String) objArr262[0], null);
                                            method162.setAccessible(true);
                                            Object objInvoke92 = method162.invoke(null, null);
                                            byte b292 = bArr[2];
                                            byte b302 = (byte) (b292 + 1);
                                            Object[] objArr272 = new Object[1];
                                            J(b302, (byte) ((-1) - (((-1) - b302) & ((-1) - 7))), (byte) (-b292), objArr272);
                                            Class.forName((String) objArr272[0]).getField("d").setBoolean(objInvoke92, true);
                                            int i102 = f24925c + 41;
                                            f24926d = i102 % 128;
                                            int i112 = i102 % 2;
                                            return;
                                        }
                                        byte b31 = bArr[2];
                                        Object[] objArr28 = new Object[1];
                                        J((byte) (-b31), (byte) bArr.length, (byte) (b31 + 1), objArr28);
                                        Method method17 = o.en.b.class.getMethod((String) objArr28[0], null);
                                        method17.setAccessible(false);
                                        if (((Boolean) method17.invoke(objInvoke7, null)).booleanValue()) {
                                            clsArr = null;
                                            Method method1422 = o.dc.d.class.getMethod("a", clsArr);
                                            method1422.setAccessible(true);
                                            Object objInvoke822 = method1422.invoke(clsArr, clsArr);
                                            Object[] objArr2322 = {o.az.a.class.getField("b").get(clsArr), o.dd.g.class.getField("z").get(clsArr)};
                                            Constructor declaredConstructor222 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, o.dd.g.class);
                                            declaredConstructor222.setAccessible(true);
                                            Object[] objArr2422 = {objInvoke6, declaredConstructor222.newInstance(objArr2322), true};
                                            Method method1522 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                                            method1522.setAccessible(true);
                                            method1522.invoke(objInvoke822, objArr2422);
                                            byte b2522 = bArr[2];
                                            byte b2622 = (byte) (b2522 + 1);
                                            Object[] objArr2522 = new Object[1];
                                            J(b2622, (byte) ((-1) - (((-1) - b2622) & ((-1) - 7))), (byte) (-b2522), objArr2522);
                                            Class<?> cls322 = Class.forName((String) objArr2522[0]);
                                            byte b2722 = (byte) (-bArr[2]);
                                            byte b2822 = (byte) (b2722 - 1);
                                            Object[] objArr2622 = new Object[1];
                                            J(b2722, b2822, b2822, objArr2622);
                                            Method method1622 = cls322.getMethod((String) objArr2622[0], null);
                                            method1622.setAccessible(true);
                                            Object objInvoke922 = method1622.invoke(null, null);
                                            byte b2922 = bArr[2];
                                            byte b3022 = (byte) (b2922 + 1);
                                            Object[] objArr2722 = new Object[1];
                                            J(b3022, (byte) ((-1) - (((-1) - b3022) & ((-1) - 7))), (byte) (-b2922), objArr2722);
                                            Class.forName((String) objArr2722[0]).getField("d").setBoolean(objInvoke922, true);
                                            int i1022 = f24925c + 41;
                                            f24926d = i1022 % 128;
                                            int i1122 = i1022 % 2;
                                            return;
                                        }
                                    }
                                    o.ea.f.class.getMethod("a", null).setAccessible(true);
                                    if (!(!((Boolean) r0.invoke(null, null)).booleanValue())) {
                                        Object[] objArr29 = new Object[1];
                                        I((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.green(0) + 105, KeyEvent.keyCodeFromString("") + 17, objArr29);
                                        String strIntern2 = ((String) objArr29[0]).intern();
                                        Object[] objArr30 = new Object[1];
                                        I((char) View.MeasureSpec.getSize(0), 192 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 71, objArr30);
                                        Object[] objArr31 = {strIntern2, ((String) objArr30[0]).intern()};
                                        Method method18 = o.ea.f.class.getMethod("c", String.class, Object.class);
                                        method18.setAccessible(true);
                                        method18.invoke(null, objArr31);
                                    }
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(6:1028|832|(2:834|(4:835|(1:837)(1:850)|838|(1:IC)(4:841|(2:843|(2:1041|845)(2:1044|849))(2:846|(1:1042)(2:1045|849))|(1:863)(1:867)|(2:865|866)(10:868|869|(1:871)|872|873|(1:875)(1:925)|(1:877)(8:885|886|(1:888)|889|890|(1:892)(1:896)|893|(3:895|879|(3:881|(1:883)|884)(6:926|927|(1:929)|930|931|(2:933|934)(6:935|936|(1:938)|939|940|(2:942|943)(7:944|945|(1:947)|948|949|(1:951)(1:955)|(2:953|954)(7:956|957|(1:959)|960|961|(1:963)(1:967)|(2:965|966)(6:968|969|(1:971)|972|973|(2:975|976)(6:977|978|(1:980)|981|982|(2:984|985)(8:986|987|(1:989)|990|1020|991|992|993))))))))(6:897|898|(1:900)(1:902)|901|903|(1:905)(6:906|907|(1:909)|910|911|(1:913)(6:914|915|(1:917)|918|919|(1:924)(1:923)))))|878|879|(0)(0)))))|1015|860|1043) */
                        /* JADX WARN: Can't wrap try/catch for region: R(9:830|1026|831|(6:1028|832|(2:834|(4:835|(1:837)(1:850)|838|(1:IC)(4:841|(2:843|(2:1041|845)(2:1044|849))(2:846|(1:1042)(2:1045|849))|(1:863)(1:867)|(2:865|866)(10:868|869|(1:871)|872|873|(1:875)(1:925)|(1:877)(8:885|886|(1:888)|889|890|(1:892)(1:896)|893|(3:895|879|(3:881|(1:883)|884)(6:926|927|(1:929)|930|931|(2:933|934)(6:935|936|(1:938)|939|940|(2:942|943)(7:944|945|(1:947)|948|949|(1:951)(1:955)|(2:953|954)(7:956|957|(1:959)|960|961|(1:963)(1:967)|(2:965|966)(6:968|969|(1:971)|972|973|(2:975|976)(6:977|978|(1:980)|981|982|(2:984|985)(8:986|987|(1:989)|990|1020|991|992|993))))))))(6:897|898|(1:900)(1:902)|901|903|(1:905)(6:906|907|(1:909)|910|911|(1:913)(6:914|915|(1:917)|918|919|(1:924)(1:923)))))|878|879|(0)(0)))))|1015|860|1043)|848|1013|851|(0)(0)|(0)(0)) */
                        /* JADX WARN: Removed duplicated region for block: B:581:0x080d  */
                        /* JADX WARN: Removed duplicated region for block: B:591:0x0958  */
                        /* JADX WARN: Removed duplicated region for block: B:653:0x168d  */
                        /* JADX WARN: Removed duplicated region for block: B:750:0x22b2  */
                        /* JADX WARN: Removed duplicated region for block: B:758:0x232d A[Catch: Exception -> 0x22b2, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x22b2, blocks: (B:729:0x21d9, B:736:0x2261, B:738:0x2298, B:741:0x22a1, B:758:0x232d, B:765:0x23bc, B:768:0x23ee, B:775:0x2487, B:777:0x248d, B:779:0x2492, B:781:0x2498, B:782:0x2499, B:784:0x249b, B:786:0x24a1, B:787:0x24a2, B:744:0x22a7, B:746:0x22ad, B:747:0x22ae, B:730:0x2207, B:732:0x2214, B:733:0x2255, B:769:0x2420, B:771:0x242d, B:772:0x2472, B:759:0x235b, B:761:0x2368, B:762:0x23b2), top: B:1017:0x21d9, inners: #2, #9, #11 }] */
                        /* JADX WARN: Removed duplicated region for block: B:799:0x25bf  */
                        /* JADX WARN: Removed duplicated region for block: B:863:0x2d57  */
                        /* JADX WARN: Removed duplicated region for block: B:865:0x2d5a  */
                        /* JADX WARN: Removed duplicated region for block: B:867:0x2de0  */
                        /* JADX WARN: Removed duplicated region for block: B:868:0x2de3  */
                        /* JADX WARN: Removed duplicated region for block: B:881:0x2f9d  */
                        /* JADX WARN: Removed duplicated region for block: B:926:0x3680  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public static java.lang.Object[] b$4a7e738d(int r42, java.lang.Object r43) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 17064
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.AnonymousClass2.b$4a7e738d(int, java.lang.Object):java.lang.Object[]");
                        }

                        static void init$0() {
                            $$a = new byte[]{57, MessagePack.Code.BIN8, -70, 1};
                            $$b = 227;
                        }

                        static void init$1() {
                            $$d = new byte[]{Ascii.EM, -77, -1, MessagePack.Code.INT8, MessagePack.Code.BIN8, 57, 19, MessagePack.Code.TRUE, 60};
                            $$e = 143;
                        }

                        static void init$2() {
                            $$c = new byte[]{119, -27, 45, 98};
                            $$f = 223;
                        }

                        @Override // o.eo.e.d
                        public final void a(o.by.c cVar) throws Throwable {
                            int i2 = 2 % 2;
                            int i3 = f24925c + 123;
                            f24926d = i3 % 128;
                            if (i3 % 2 == 0) {
                                o.ea.f.a();
                                throw null;
                            }
                            if (o.ea.f.a()) {
                                String strA = d.this.a();
                                StringBuilder sb = new StringBuilder();
                                Object[] objArr = new Object[1];
                                I((char) (62143 - (ViewConfiguration.getScrollBarSize() >> 8)), 49 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 56 - ExpandableListView.getPackedPositionChild(0L), objArr);
                                o.ea.f.d(strA, sb.append(((String) objArr[0]).intern()).append(cVar.c()).toString());
                            }
                            AnonymousClass4.this.f24914b.onError(cVar.a());
                            int i4 = f24925c + 109;
                            f24926d = i4 % 128;
                            int i5 = i4 % 2;
                        }

                        @Override // o.eo.e.d
                        public final void d(List<o.ep.i> list) throws Throwable {
                            String strA;
                            Object obj;
                            int i2 = 2 % 2;
                            if (o.ea.f.a()) {
                                int i3 = f24925c + 103;
                                f24926d = i3 % 128;
                                if (i3 % 2 == 0) {
                                    strA = d.this.a();
                                    Object[] objArr = new Object[1];
                                    I((char) (ViewConfiguration.getKeyRepeatDelay() + 1), 1 >>> TextUtils.lastIndexOf("", '|', 0, 0), KeyEvent.normalizeMetaState(0) + 121, objArr);
                                    obj = objArr[0];
                                } else {
                                    strA = d.this.a();
                                    Object[] objArr2 = new Object[1];
                                    I((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 1, KeyEvent.normalizeMetaState(0) + 48, objArr2);
                                    obj = objArr2[0];
                                }
                                o.ea.f.c(strA, ((String) obj).intern());
                                int i4 = f24926d + 5;
                                f24925c = i4 % 128;
                                int i5 = i4 % 2;
                            }
                            d.this.d(AnonymousClass4.this.f24917e, AnonymousClass4.this.f24914b, true);
                            int i6 = f24925c + 65;
                            f24926d = i6 % 128;
                            if (i6 % 2 != 0) {
                                return;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }

                    private static String $$c(short v2, byte v3, int v4) {
                        /*
                            int r7 = 105 - r10
                            byte[] r6 = o.er.d.AnonymousClass4.AnonymousClass5.$$a
                            int r0 = r8 * 4
                            int r5 = r0 + 1
                            int r4 = r9 + 4
                            byte[] r3 = new byte[r5]
                            r2 = 0
                            if (r6 != 0) goto L25
                            r0 = r7
                            r1 = r2
                            r7 = r5
                        L12:
                            int r7 = r7 + r0
                        L13:
                            byte r0 = (byte) r7
                            r3[r1] = r0
                            int r1 = r1 + 1
                            int r4 = r4 + 1
                            if (r1 != r5) goto L22
                            java.lang.String r0 = new java.lang.String
                            r0.<init>(r3, r2)
                            return r0
                        L22:
                            r0 = r6[r4]
                            goto L12
                        L25:
                            r1 = r2
                            goto L13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.$$c(short, byte, int):java.lang.String");
                    }

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        f24920c = 0;
                        f24921d = 1;
                        char[] cArr = new char[1068];
                        ByteBuffer.wrap("ß\u000eNÑü®jI\u0098\u0001\u0007Úµ°#jQ\u000bÀïn£\u009cy\n8¸\u0003'ñU\u008dÃNqRà\u0090\u000eØ¼t*/YåÇ¸uzã.\u0011E\u0080Ô.\u0084\\]Ê\u0014yÒçç\u0015d\u0083(2ü °Îv|0ê\n\u0019È\u0087Ê5F£\u0005ÒØ@¥îd\u001c?\u008bäÄ5Uêç\u0095qr\u0083:\u001cá®\u008b8QJ0ÛÔu\u0098\u0087B\u0011\u0003£8<ÊN¶Øujiû«\u0015ã§V1\u001aB\u0092Ü\u009bnKø\n\n;\u009bõ5ðG Ñtb§ü\u009a\u000eX\u0098\u001a)À»\u008d\u0094\u009b\u0005D·;!ÜÓ\u0094LOþ%hÿ\u001a\u009e\u008bz%6×ìA\u00adó\u0096ld\u001e\u0018\u0088Û:Ç«\u0005EM÷ða©\u0012y\u008c2>â¨ªZ\u0083ËAe^\u0017×\u0081\u008b2B¬7^ùÈøytë(\u0085«7»¡\u0090RVÌ\u0013~Åè\u0091\u0099\u000e\u000b;¥õWªÀ\"r%ìí\u009e¨\b\u0098¹\u001b+\u001dÅÅw\u008eàJ\u00924\fµ¾±/mÙdK³å\u0092\u0098A\t\u009e»á-\u0006ßN@\u0095òÿd%\u0016D\u0087 )ìÛ6MwÿL`¾\u0012Â\u0084\u00016\u001d§ßI\u0097û\"mn\u001eæ\u0080ÿ25¤cVCÇ\u008ciÁ\u001bY\u008dN>\u0092 ñRmÄvu¨ç÷\u00894;x\u00ad\u000b^\u0084ÀÀr\u000eäZ\u0095\u0097\u0007ý©+[gÌø~ôà<\u00927\u0004Hµ\u0088'ÁÉ\u0012{Dì\u0094\u009eæ\u0000o²g#¸ÕìG7éD\u009b\r\f\u008e¾Æ \u000fÒECÖõïg)\tbº³,ëÞ5@\u0005ò\u000ec\u0080\u0015Ù\u0087\u000f)VÚ×Løþ.`m\u0011¾\u0083þ5u§\u0018IJú\u0082lË\u001e\u001b\u0080@1 £\u00adU+Çthü\u001a«\u008cv£Î2\u0011\u0080n\u0016\u0089äÁ{\u001aÉp_ª-Ë¼/\u0012cà¹vøÄÃ[1)M¿\u008e\r\u0092\u009cPr\u0018À°Vá%$»q\tÿ\u009fþmÀü\u0016RB \u0095¶Ô\u0005\\\u009bwi£ÿôNhÜg²±\u0000ò\u0096Áe\u0001û\nI\u0091ßÕ®\u000f<c\u0092¢`ø÷2EvÛý©ñ?Í\u008eN\u001cMò\u009d@Ø×\u0013¥q;¡\u0089ç\u0018vîr|½Ò\u0095 Æ\u0094\u009b\u0005D·;!ÜÓ\u0094LOþ%hÿ\u001a\u009e\u008bz%6×ìA\u00adó\u0096ld\u001e\u0018\u0088Û:Ç«\u0005EM÷ûaº\u0012h\u008c\">â¨ïZ\u0096ËZe\u000b\u0017Í\u0081\u00802\t¬0^òÈ¬yjë#\u0085î7¢¡ÑR[Ì_~Äè\u008c\u0099]\u000b'¥õW·Àvrgìø\u009e¬\b\u008f¹\u001b+\u000bÅÀw\u0086àC\u00925\fá¾þ/wÙ+Kâå×\u0097\u0099\u0000\u0018²\u001c,ÈÞ\u008fO\fù>kô\u0005º¶  *ÒèL\u0093þ\u0080oQ\u0019\u0007\u008b\u0087%\u008cÖD@1òòl¨\u001d`\u008f&9¯«ÓE\u0094öL`\u0007\u0012\u0084\u008c\u009d=}¯<YýË³d&\u0016f\u0080²2\u0091¬\u008e]MÏ\u0015yÀìW}\u0088Ï÷Y\u0010«X4\u0083\u0086é\u00103bRó¶]ú¯ 9a\u008bZ\u0014¨fÔð\u0017B\u000bÓÉ=\u0081\u008f4\u0019xjðôàF'Ðw\"_³\u0091\u001d\u0092o\tùGJ\u0090Ôð&?°4\u0001³\u0093ïý3OwÙX*\u0093´Ý\u0006L\u0090Má\u008bsìÝ,/t¸ \nÿ\u0094dæqp[Á\u008eS\u0090½\u001a\u000fG\u0098\u008fêðt<ÆfWï¡ü3*\u009d\u0015ï^x\u009aÊÂTJ¦F7\u008e\u0081ù\u0013v}wÎ¥Xîª+4\u000b\u0086Y\u0017\u0099a\u008eó\b]E®\u00938þ\u008aw\u0014de¢÷íA&Ó\u0012=JÑ\u000e@Ñò®dI\u0096\u0001\tÚ»°-j_\u000bÎï`£\u0092y\u00048¶\u0003)ñ[\u008dÍN\u007fRî\u0090\u0000Ø²@$&WìÉ·{tíz\u001f\u0003\u008eÏ \u0099R\u0016Ä\u0018wØé¢\u001bl\u008d9<á®°À\u007fr5äD\u0017Ã\u0089\u008b;F\u00ad\u0004Ü\u009bN àn\u00129\u0085å7ò©mÛ9M\rü\u008en\u008d\u0080]2\u0018¥Ó×±Is\u008b3\u001aì¨\u0093>tÌ<Sçá\u008dwW\u00056\u0094Ò:\u009eÈD^\u0005ì>sÌ\u0001°\u0097s%o´\u00adZåèr~\u0012\rÇ\u0093\u009d!\u0002·\u0001E7Ôèz¤\b+\u009e<-à³\u0094A\u001f×\u001dfÔô\u009a\u009a@(\f¾uM²Ó»am÷9\u0086¡\u0014\u0088º\u001cH\u0003ßÏm\u0089óR\u0081\u0000\u0017-¦û4øÚ)h.ÿæ\u008d\u008b\u0013I¡V0ÙÆ\u0089TGúh\u0088:\u001fã\u00ad½3.Á*P÷æÙt\b\u001aW\u0094\u009b\u0005D·;!ÜÓ\u0094LOþ%hÿ\u001a\u009e\u008bz%6×ìA\u00adó\u0096ld\u001e\u0018\u0088Û:Ç«\u0005EM÷øa´\u0012<\u008c,>ë¨»Z\u0093Ë]e^\u0017Å\u0081\u008b2\\¬<^óÈøyjëi\u0085«7 ¡\u0090RIÌ\u000b~\u0080è\u0083\u0099A\u000b&¥æWùÀrr&ìæþúo%ÝZK½¹õ&.\u0094D\u0002\u009epÿá\u001bOW½\u008d+Ì\u0099÷\u0006\u0005tyâºP¦Ád/,\u009d\u0085\u000bßx\u001bæRT\u008eÂÝ0ù¡t\u000f~}®ë÷X-ÆR4\u0092¢À\u0013\\\u0081Wï\u008f]ßËö84¦l\u0014¬\u0082áó+a\u0012ÏØ=\u0086ªC\u0018@\u0086\u0088ôÀbäÓ?®H?\u0097\u008dè\u001b\u000féGv\u009cÄöR, M±©\u001fåí?{~ÉEV·$Ë²\b\u0000\u0014\u0091Ö\u007f\u009eÍ)[i(¼¶æ\u0004y\u0092x`Jñ\u0081_Ä-\u0004»V\b\u0096\u0096¡d'òjC¼Ññ¿x\rk\u009bMh\u0082öÉD\u001dÒ\u0016£\u008f1å\u009f!mxú´HçÖ3¤>2L\u0083\u009b\u0011\u008fÿ\u001dMLÚ\u0088¨ç6'\u0084y\u0015µãóqzß\u0002\u00adK:\u0086\u0088Þ\u0016\u0014äJu\u009aÃæQi?x\u008c¼\u001a¶è1v\u0001ÄSU\u008f#Â±\u0000\u001f\u001bì\u009azìÈ;V{'³µ÷\u0003(\u0091C\u007fVÌ\u008cZÉ(W¶M\u0007 \u0095èc'ñk^¡,¸º*\b\u0012\u0096Mg\u008dõÇC\u0013Ñ\u0011¾à\fõ\u009a/hwù¦GþÕ-£\r1A\u009e\u0081lÕúYHHÙ¬§í5(\u0083~\u0010¤\u0094\u009b\u0005D·;!ÜÓ\u0094LOþ%hÿ\u001a\u009e\u008bz%6×ìA\u00adó\u0096ld\u001e\u0018\u0088Û:Ç«\u0005EM÷úaº\u0012o\u008c5>ª¨«Z\u0099ËRe\u0017\u0017×\u0081\u00852E¬r^ôÈ¹yoë\"\u0085«7¸¡\u009eRQÌ\u001a~ÎèÅ\u0099\\\u000b6¥òW«Àgr4ìà\u009eí\b\u009f¹H+\\ÅÔw\u009aà\u000f\u0092$\fú¾þ/gÙ%Kýå×\u0097×\u0000[²\u0012,ËÞ\u009bOMù#kÿ\u0005»¶  1ÒáL\u0093þ\u0098oX\u0019\u0016\u008bÂ%\u009bÖY@vòÿlµ\u001dr\u008f>9î«ÞE\u0081ö\u001e`\u0013\u0012Å\u008c\u0090=2¯ YùË±dj\u0016.\u0080ø2\u0091¬\u008f]OÏ\u0004yÄë\u009a\u0084v6t ´RüÃ'}.ïì\u0099Ú\u000b\u0088¤Yndÿ»MÄÛ#)k¶°\u0004Ú\u0092\u0000àaq\u0085ßÉ-\u0013»R\ti\u0096\u009bäçr$À8Qú¿²\r\r\u009bMè\u0090vÊÄ\u0014R^ {1ê\u009fñí={bÈöVÚ¤\t2K\u0083\u008e\u0011Ü\u007f\u0000Í\u0013[z¨ª6ë\u0084:\u0012tcññÊ_\u000e\u00adR:\u009e\u0088Ð\u0016\u001ed\\ònCäÑå??\u008d|\u001a¼hÊö\u000eD\u0001ÕÆ#\u009b".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1068);
                        f24922e = cArr;
                        f24919a = -5546619103301532361L;
                    }

                    AnonymousClass5() {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:203:0x02ab  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private void b(java.util.List<o.es.e> r26) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 1543
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.AnonymousClass5.b(java.util.List):void");
                    }

                    private static void f(char c2, int i22, int i32, Object[] objArr) throws Throwable {
                        int i4 = 2 % 2;
                        o.a.o oVar = new o.a.o();
                        long[] jArr = new long[i32];
                        oVar.f19947b = 0;
                        while (oVar.f19947b < i32) {
                            int i5 = $10 + 27;
                            $11 = i5 % 128;
                            int i6 = i5 % 2;
                            int i7 = oVar.f19947b;
                            try {
                                Object[] objArr2 = {Integer.valueOf(f24922e[i22 + i7])};
                                Object objA = o.d.d.a(-214519724);
                                if (objA == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = (byte) (b2 - 1);
                                    objA = o.d.d.a(Color.blue(0) + 742, (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getOffsetBefore("", 0) + 12, 632508977, false, $$c(b2, b3, (byte) ((b3 + 6) - (6 | b3))), new Class[]{Integer.TYPE});
                                }
                                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f24919a), Integer.valueOf(c2)};
                                Object objA2 = o.d.d.a(-1567654649);
                                if (objA2 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = (byte) (b4 - 1);
                                    objA2 = o.d.d.a(TextUtils.indexOf("", "") + 766, (char) (12470 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Drawable.resolveOpacity(0, 0) + 12, 1946853218, false, $$c(b4, b5, (byte) (5 & b5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                                Object[] objArr4 = {oVar, oVar};
                                Object objA3 = o.d.d.a(-723636472);
                                if (objA3 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = (byte) (b6 - 1);
                                    objA3 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 386, (char) Color.green(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, 39570797, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
                        char[] cArr = new char[i32];
                        oVar.f19947b = 0;
                        int i8 = $11 + 15;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        while (oVar.f19947b < i32) {
                            int i10 = $11 + 25;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                            Object[] objArr5 = {oVar, oVar};
                            Object objA4 = o.d.d.a(-723636472);
                            if (objA4 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 - 1);
                                objA4 = o.d.d.a(Color.blue(0) + 387, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 39570797, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA4).invoke(null, objArr5);
                        }
                        objArr[0] = new String(cArr);
                    }

                    static void init$0() {
                        $$a = new byte[]{39, 4, 32, -80};
                        $$b = 40;
                    }

                    @Override // o.es.c.a
                    public final /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                        int i22 = 2 % 2;
                        int i32 = f24921d + 49;
                        f24920c = i32 % 128;
                        int i4 = i32 % 2;
                        b(list);
                        int i5 = f24920c + 35;
                        f24921d = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 4 / 0;
                        }
                    }

                    @Override // o.es.c.a
                    public final void d(o.by.c cVar) throws Throwable {
                        int i22 = 2 % 2;
                        int i32 = f24920c + 65;
                        f24921d = i32 % 128;
                        if (i32 % 2 == 0) {
                            o.ea.f.a();
                            throw null;
                        }
                        if (o.ea.f.a()) {
                            String strA = d.this.a();
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr = new Object[1];
                            f((char) (64255 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1005 - (KeyEvent.getMaxKeyCode() >> 16), 63 - TextUtils.getTrimmedLength(""), objArr);
                            o.ea.f.d(strA, sb.append(((String) objArr[0]).intern()).append(cVar.c()).toString());
                            int i4 = f24921d + 105;
                            f24920c = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        AnonymousClass4.this.f24914b.onError(cVar.a());
                    }
                });
                int i4 = f24909i + 61;
                f24907f = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (o.ea.f.a()) {
                String strA = d.this.a();
                Object[] objArr = new Object[1];
                m("\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{0, 49, 136, 45}, true, objArr);
                o.ea.f.c(strA, ((String) objArr[0]).intern());
            }
            this.f24914b.onError(new o.by.c(d.this.e()).a());
        }

        static void init$0() {
            $$a = new byte[]{Ascii.NAK, 117, 119, 110};
            $$b = 126;
        }

        static void init$1() {
            $$c = new byte[]{98, -110, MessagePack.Code.BIN16, -94};
            $$d = 64;
        }

        /* JADX WARN: Removed duplicated region for block: B:129:0x012d A[PHI: r8
  0x012d: PHI (r8v5 char) = (r8v0 char), (r8v11 char) binds: [B:135:0x018e, B:128:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0191  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void m(java.lang.String r25, int[] r26, boolean r27, java.lang.Object[] r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 714
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass4.m(java.lang.String, int[], boolean, java.lang.Object[]):void");
        }

        private static void n(short s2, byte b2, short s3, Object[] objArr) {
            int i2 = 100 - (s2 * 3);
            byte[] bArr = $$a;
            int i3 = (b2 * 3) + 4;
            int i4 = s3 * 3;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                int i7 = -i3;
                i3++;
                i2 = i5 + i7;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i2;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3++;
                    i2 += -bArr[i3];
                }
            }
        }

        @Override // o.es.c.a
        public final /* synthetic */ void a(c.e eVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24909i + 125;
            f24907f = i3 % 128;
            int i4 = i3 % 2;
            d(eVar);
            if (i4 != 0) {
                throw null;
            }
            int i5 = f24907f + 11;
            f24909i = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 89 / 0;
            }
        }

        @Override // o.es.c.a
        public final void d(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24907f + 73;
            f24909i = i3 % 128;
            int i4 = i3 % 2;
            this.f24914b.onError(cVar.a());
            int i5 = f24909i + 89;
            f24907f = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: renamed from: o.er.d$5 */
    final class AnonymousClass5 implements c.a<c.e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static int f24950b = 0;

        /* JADX INFO: renamed from: d */
        private static int f24951d = 0;

        /* JADX INFO: renamed from: e */
        private static int f24952e = 0;

        /* JADX INFO: renamed from: g */
        private static byte[] f24953g = null;

        /* JADX INFO: renamed from: h */
        private static short[] f24954h = null;

        /* JADX INFO: renamed from: i */
        private static int f24955i = 0;

        /* JADX INFO: renamed from: j */
        private static int f24956j = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ OperationCallback f24958c;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r6, short r7, short r8) {
            /*
                int r3 = r8 * 4
                int r2 = 1 - r3
                int r8 = 104 - r7
                int r0 = r6 * 2
                int r1 = 3 - r0
                byte[] r7 = o.er.d.AnonymousClass5.$$a
                byte[] r6 = new byte[r2]
                r5 = 0
                int r4 = 0 - r3
                if (r7 != 0) goto L2c
                r3 = r5
                r0 = r1
            L15:
                int r1 = -r1
                int r1 = r1 + r8
                r2 = r3
                r8 = r1
                r1 = r0
            L1a:
                int r0 = r1 + 1
                byte r1 = (byte) r8
                r6[r2] = r1
                int r3 = r2 + 1
                if (r2 != r4) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L29:
                r1 = r7[r0]
                goto L15
            L2c:
                r2 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass5.$$c(int, short, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24956j = 0;
            f24955i = 1;
            f24951d = -612531271;
            f24952e = 1150422472;
            f24950b = -1047669973;
            f24953g = new byte[]{81, 3, 79, MessagePack.Code.FIXEXT16, 43, 36, 54, Ascii.CAN, 36, 118, Ascii.SYN, 56, MessagePack.Code.FIXEXT16, 37, 59, 39, 37, Ascii.ESC, 71, 0, 42, 122, Ascii.SYN, 56, MessagePack.Code.FIXEXT16, 43, 36, 54, Ascii.CAN, 68, 10, 58, 43, 67, -105, -103, -102, MessagePack.Code.EXT32, 99, -101, -21, -121, -87, 73, -104, -107, -89, -119, -75, 123, -85, -104};
        }

        AnonymousClass5(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        private void c(c.e eVar) throws Throwable {
            int i2 = 2 % 2;
            if (o.ea.f.a()) {
                String strA = d.this.a();
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                f((short) (88 - (ViewConfiguration.getTouchSlop() >> 8)), 1611690444 + (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2061509057 - Color.argb(0, 0, 0, 0), (-16777286) - Color.rgb(0, 0, 0), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                o.ea.f.c(strA, sb.append(((String) objArr[0]).intern()).append(eVar).toString());
            }
            int i3 = AnonymousClass7.f24964b[eVar.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    operationCallback.onSuccess(DigitalCardServiceStatus.NotSupportedByDevice);
                    return;
                } else if (d.this.c()) {
                    operationCallback.onSuccess(DigitalCardServiceStatus.NotConfiguredByUser);
                    return;
                } else {
                    operationCallback.onSuccess(DigitalCardServiceStatus.Disabled);
                    return;
                }
            }
            if (!(!d.this.c())) {
                int i4 = f24955i + 91;
                f24956j = i4 % 128;
                int i5 = i4 % 2;
                operationCallback.onSuccess(DigitalCardServiceStatus.Active);
                return;
            }
            operationCallback.onSuccess(DigitalCardServiceStatus.Disabled);
            int i6 = f24956j + 111;
            f24955i = i6 % 128;
            int i7 = i6 % 2;
        }

        private static void f(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            boolean z2;
            long j2;
            int i5;
            int length;
            byte[] bArr;
            int i6;
            int i7 = 2 % 2;
            o.a.j jVar = new o.a.j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f24952e)};
                Object objA = o.d.d.a(-727631768);
                long j3 = 0;
                if (objA == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA = o.d.d.a(TextUtils.getOffsetAfter("", 0) + 238, (char) (44531 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, 35969549, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i8 = $11 + 51;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    byte[] bArr2 = f24953g;
                    char c2 = '0';
                    if (bArr2 != null) {
                        int i10 = $11 + 21;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                            i6 = 1;
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                            i6 = 0;
                        }
                        while (i6 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 + 1);
                                objA2 = o.d.d.a(ExpandableListView.getPackedPositionChild(j3) + 629, (char) (28648 - TextUtils.indexOf("", c2, 0, 0)), View.combineMeasuredStates(0, 0) + 11, 1621469864, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i6] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i6++;
                            j3 = 0;
                            c2 = '0';
                        }
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        byte[] bArr3 = f24953g;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f24951d)};
                        Object objA3 = o.d.d.a(-727631768);
                        if (objA3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objA3 = o.d.d.a(237 - TextUtils.lastIndexOf("", '0', 0), (char) (44531 - (ViewConfiguration.getPressedStateDuration() >> 16)), ExpandableListView.getPackedPositionType(0L) + 11, 35969549, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f24952e) ^ (-7649639543924978291L))));
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f24954h[i2 + ((int) (((long) f24951d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f24952e) ^ (-7649639543924978291L))));
                    }
                } else {
                    j2 = -7649639543924978291L;
                }
                if (iIntValue > 0) {
                    int i11 = ((i2 + iIntValue) - 2) + ((int) (((long) f24951d) ^ j2));
                    if (z2) {
                        int i12 = $10 + 69;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jVar.f19936d = i11 + i5;
                    Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f24950b), sb};
                    Object objA4 = o.d.d.a(1819197256);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(ViewConfiguration.getEdgeSlop() >> 16, (char) (5357 - ((byte) KeyEvent.getModifierMetaStateMask())), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr4 = f24953g;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i14 = 0; i14 < length2; i14++) {
                            bArr5[i14] = (byte) (((long) bArr4[i14]) ^ (-7649639543924978291L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z3 = bArr4 != null;
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (z3) {
                            byte[] bArr6 = f24953g;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f24954h;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        }
                        sb.append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        jVar.f19934b++;
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

        static void init$0() {
            $$a = new byte[]{Ascii.EM, -93, 95, -122};
            $$b = 60;
        }

        @Override // o.es.c.a
        public final /* synthetic */ void a(c.e eVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24956j + 49;
            f24955i = i3 % 128;
            int i4 = i3 % 2;
            c(eVar);
            int i5 = f24956j + 35;
            f24955i = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.es.c.a
        public final void d(o.by.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24956j + 53;
            f24955i = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                o.ea.f.a();
                obj.hashCode();
                throw null;
            }
            if (o.ea.f.a()) {
                String strA = d.this.a();
                Object[] objArr = new Object[1];
                f((short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 24), 1611690477 - View.resolveSizeAndState(0, 0, 0), 2061509057 - Color.red(0), Color.rgb(0, 0, 0) + 16777146, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                o.ea.f.c(strA, ((String) objArr[0]).intern());
                int i4 = f24956j + 113;
                f24955i = i4 % 128;
                int i5 = i4 % 2;
            }
            operationCallback.onError(cVar.a());
            int i6 = f24956j + 99;
            f24955i = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: o.er.d$6 */
    final class AnonymousClass6 implements OperationCallback<Boolean> {

        /* JADX INFO: renamed from: d */
        private static int f24959d = 0;

        /* JADX INFO: renamed from: e */
        private static int f24960e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ OperationCallback f24961b;

        AnonymousClass6(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x001b A[PHI: r4
  0x001b: PHI (r4v3 fr.antelop.sdk.util.OperationCallback) = (r4v0 fr.antelop.sdk.util.OperationCallback), (r4v4 fr.antelop.sdk.util.OperationCallback) binds: [B:33:0x0050, B:24:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[PHI: r4
  0x0053: PHI (r4v1 fr.antelop.sdk.util.OperationCallback) = (r4v0 fr.antelop.sdk.util.OperationCallback), (r4v4 fr.antelop.sdk.util.OperationCallback) binds: [B:33:0x0050, B:24:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a(java.lang.Boolean r9) {
            /*
                r8 = this;
                r7 = 2
                int r0 = r7 % r7
                int r0 = o.er.d.AnonymousClass6.f24959d
                int r1 = r0 + 35
                int r0 = r1 % 128
                o.er.d.AnonymousClass6.f24960e = r0
                int r1 = r1 % r7
                r6 = 0
                r5 = 1
                if (r1 != 0) goto L4a
                fr.antelop.sdk.util.OperationCallback r4 = r2
                boolean r1 = r9.booleanValue()
                r0 = 98
                int r0 = r0 / r6
                if (r1 == r5) goto L53
            L1b:
                int r3 = o.er.d.AnonymousClass6.f24960e
                int r1 = r3 + 111
                int r0 = r1 % 128
                o.er.d.AnonymousClass6.f24959d = r0
                int r1 = r1 % r7
                if (r1 == 0) goto L48
            L26:
                r2 = r3 ^ 9
                r1 = 9
                int r0 = r3 + r1
                r3 = r3 | r1
                int r0 = r0 - r3
                int r0 = r0 << r5
                int r2 = r2 + r0
                int r0 = r2 % 128
                o.er.d.AnonymousClass6.f24959d = r0
                int r2 = r2 % r7
            L35:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
                r4.onSuccess(r0)
                int r0 = o.er.d.AnonymousClass6.f24960e
                int r1 = r0 + 69
                int r0 = r1 % 128
                o.er.d.AnonymousClass6.f24959d = r0
                int r1 = r1 % r7
                if (r1 != 0) goto L5d
                return
            L48:
                r6 = r5
                goto L26
            L4a:
                fr.antelop.sdk.util.OperationCallback r4 = r2
                boolean r0 = r9.booleanValue()
                if (r0 == r5) goto L53
                goto L1b
            L53:
                int r0 = o.er.d.AnonymousClass6.f24959d
                int r1 = r0 + 19
                int r0 = r1 % 128
                o.er.d.AnonymousClass6.f24960e = r0
                int r1 = r1 % r7
                goto L35
            L5d:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass6.a(java.lang.Boolean):void");
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public final void onError(AntelopError antelopError) {
            int i2 = 2 % 2;
            int i3 = f24960e + 103;
            f24959d = i3 % 128;
            if (i3 % 2 != 0) {
                operationCallback.onError(antelopError);
                int i4 = 7 / 0;
            } else {
                operationCallback.onError(antelopError);
            }
            int i5 = f24960e + 31;
            f24959d = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public final /* synthetic */ void onSuccess(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f24960e;
            int i4 = (i3 & 99) + ((-1) - (((-1) - i3) & ((-1) - 99)));
            f24959d = i4 % 128;
            int i5 = i4 % 2;
            a(bool);
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = f24959d + 51;
            f24960e = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX INFO: renamed from: o.er.d$7 */
    static /* synthetic */ class AnonymousClass7 {

        /* JADX INFO: renamed from: a */
        private static int f24963a = 0;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f24964b;

        /* JADX INFO: renamed from: c */
        private static int f24965c = 1;

        static {
            int[] iArr = new int[c.e.values().length];
            f24964b = iArr;
            try {
                iArr[c.e.f25300d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24964b[c.e.f25299c.ordinal()] = 2;
                int i2 = f24963a + 83;
                f24965c = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24964b[c.e.f25298b.ordinal()] = 3;
                int i5 = f24965c;
                int i6 = ((i5 + 41) - (41 | i5)) + ((-1) - (((-1) - i5) & ((-1) - 41)));
                f24963a = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: o.er.d$8 */
    final class AnonymousClass8 implements OperationCallback<Boolean> {

        /* JADX INFO: renamed from: b */
        private static int f24966b = 1;

        /* JADX INFO: renamed from: d */
        private static int f24967d = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ OperationCallback f24969e;

        AnonymousClass8(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        private void a(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f24966b + 35;
            f24967d = i3 % 128;
            int i4 = i3 % 2;
            OperationCallback operationCallback = operationCallback;
            boolean z2 = true;
            if (!(!bool.booleanValue())) {
                int i5 = f24966b + 43;
                f24967d = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 5;
                }
                z2 = false;
            } else {
                int i7 = f24966b + 95;
                f24967d = i7 % 128;
                int i8 = i7 % 2;
            }
            operationCallback.onSuccess(Boolean.valueOf(z2));
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public final void onError(AntelopError antelopError) {
            int i2 = 2 % 2;
            int i3 = f24967d;
            int i4 = (i3 ^ 11) + (((-1) - (((-1) - i3) | ((-1) - 11))) << 1);
            f24966b = i4 % 128;
            int i5 = i4 % 2;
            operationCallback.onError(antelopError);
            int i6 = f24966b;
            int i7 = (i6 ^ 63) + ((i6 & 63) << 1);
            f24967d = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public final /* synthetic */ void onSuccess(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f24966b;
            int i4 = ((51 | i3) << 1) - (i3 ^ 51);
            f24967d = i4 % 128;
            int i5 = i4 % 2;
            a(bool);
            int i6 = f24966b + 9;
            f24967d = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX INFO: renamed from: o.er.d$9 */
    public class AnonymousClass9 implements c.a<List<o.es.e>> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char f24970a = 0;

        /* JADX INFO: renamed from: d */
        private static long f24971d = 0;

        /* JADX INFO: renamed from: e */
        private static char[] f24972e = null;

        /* JADX INFO: renamed from: f */
        public static int f24973f = 0;

        /* JADX INFO: renamed from: g */
        private static int f24974g = 0;

        /* JADX INFO: renamed from: h */
        private static int f24975h = 0;

        /* JADX INFO: renamed from: i */
        public static int f24976i = 0;

        /* JADX INFO: renamed from: j */
        public static int f24977j = 0;

        /* JADX INFO: renamed from: k */
        public static int f24978k = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ OperationCallback f24980c;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r5, int r6, short r7) {
            /*
                int r0 = r7 * 2
                int r0 = 3 - r0
                int r2 = r6 * 4
                int r1 = 1 - r2
                int r7 = 111 - r5
                byte[] r6 = o.er.d.AnonymousClass9.$$c
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r6 != 0) goto L2a
                r2 = r0
                r1 = r4
            L15:
                int r0 = -r0
                int r7 = r7 + r0
                r0 = r2
            L18:
                int r2 = r0 + 1
                byte r0 = (byte) r7
                r5[r1] = r0
                if (r1 != r3) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L25:
                int r1 = r1 + 1
                r0 = r6[r2]
                goto L15
            L2a:
                r1 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass9.$$e(byte, int, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f24978k = -301336945;
            f24977j = 1780692732;
            f24976i = -1359803174;
            f24973f = 1698624876;
            init$0();
            f24975h = 0;
            f24974g = 1;
            f24972e = new char[]{64576, 64590, 64604, 64597, 64543, 64592, 64578, 64579, 64598, 64587, 64580, 64594, 64612, 64582, 64584, 65468, 64589, 65469, 64585, 64588, 65466, 64599, 64583, 64625, 64620, 64577, 65470, 65465, 64520, 65471, 64586, 65467, 64532, 64517, 64593, 64523};
            f24970a = (char) 51641;
            f24971d = 2629470337986654309L;
        }

        AnonymousClass9(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        private void b(List<o.es.e> list) throws Throwable {
            String strC;
            String strA;
            Object obj;
            int i2 = 2 % 2;
            if (o.ea.f.a()) {
                int i3 = f24975h + 87;
                f24974g = i3 % 128;
                if (i3 % 2 == 0) {
                    strA = d.this.a();
                    Object[] objArr = new Object[1];
                    l(119 - ((byte) KeyEvent.getModifierMetaStateMask()), "\f\u0006#\u0016\t\u0002\u0012#\u0002\u0001\u0006\u001b\u001b\u001f\u001b\"\u0006\u000b㙭㙭\u0004\u001e\"#\u001f\u0000\u0003\u0006\u001f\t\u0004\u001e\u000e\u0011\u0015\u0007\t\u001e\u000b\u0002㙰㙰\u0002\u0006㙠", (byte) (124 << TextUtils.getOffsetBefore("", 0)), objArr);
                    obj = objArr[0];
                } else {
                    strA = d.this.a();
                    Object[] objArr2 = new Object[1];
                    l(44 - ((byte) KeyEvent.getModifierMetaStateMask()), "\f\u0006#\u0016\t\u0002\u0012#\u0002\u0001\u0006\u001b\u001b\u001f\u001b\"\u0006\u000b㙭㙭\u0004\u001e\"#\u001f\u0000\u0003\u0006\u001f\t\u0004\u001e\u000e\u0011\u0015\u0007\t\u001e\u000b\u0002㙰㙰\u0002\u0006㙠", (byte) (119 - TextUtils.getOffsetBefore("", 0)), objArr2);
                    obj = objArr2[0];
                }
                o.ea.f.c(strA, ((String) obj).intern());
            }
            Iterator<o.es.e> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strC = null;
                    break;
                }
                o.es.e next = it.next();
                if (d.this.f25009a.s() != null) {
                    String strD = next.d();
                    Object[] objArr3 = {d.this.f25009a.s()};
                    int i4 = 574268897 * o.ep.c.f24438e;
                    o.ep.c.f24438e = i4;
                    int id = (int) Thread.currentThread().getId();
                    int i5 = o.ep.c.f24436c * 1169734117;
                    o.ep.c.f24436c = i5;
                    int i6 = (-2104816085) * o.ep.c.f24434a;
                    o.ep.c.f24434a = i6;
                    if (strD.equals((String) o.ep.c.c(i4, id, i6, 1241915024, objArr3, -1241915024, i5))) {
                        if (o.ea.f.a()) {
                            String strA2 = d.this.a();
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr4 = new Object[1];
                            m("﵍䷾鰼\uef6d㾝踯\ud958⦒磉쭶ᮮ櫸딂\u05f7咩ꝕ\uf65b䛋鄬\ue066ゕ菊퉲⋭淔밌ಢ御긒漏䧳頬\ueb7e㮚諄픹▭瓞윞ឹ暢", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45234, objArr4);
                            StringBuilder sbAppend = sb.append(((String) objArr4[0]).intern()).append(d.this.f25009a.b());
                            Object[] objArr5 = new Object[1];
                            l(19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u001f\u0015\t \u0006\u001f\u0003\u000b\u001b\u001f\u0015\u0007#\t\u0006\u0016\u0018\u0006㗷", (byte) (Color.argb(0, 0, 0, 0) + 9), objArr5);
                            o.ea.f.c(strA2, sbAppend.append(((String) objArr5[0]).intern()).toString());
                            int i7 = f24974g + 73;
                            f24975h = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        strC = next.c();
                    }
                }
                int i9 = f24975h + 81;
                f24974g = i9 % 128;
                int i10 = i9 % 2;
            }
            operationCallback.onSuccess(strC);
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] c(android.content.Context r23, int r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 1524
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass9.c(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{76, -80, -89, 46};
            $$b = 94;
        }

        static void init$1() {
            $$c = new byte[]{17, -84, -78, -70};
            $$d = 48;
        }

        private static void l(int i2, String str, byte b2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2 % 2;
            Object obj = str2;
            if (str2 != null) {
                char[] charArray = str2.toCharArray();
                int i5 = $10 + 61;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                obj = charArray;
            }
            char[] cArr = (char[]) obj;
            o.a.h hVar = new o.a.h();
            char[] cArr2 = f24972e;
            int i7 = 421932776;
            int i8 = 9;
            int i9 = 1;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i10 = 0;
                while (i10 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                        Object objA = o.d.d.a(i7);
                        if (objA == null) {
                            byte b3 = (byte) 0;
                            objA = o.d.d.a(270 - TextUtils.indexOf("", ""), (char) TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionChild(0L) + 12, -811348851, false, $$e((byte) i8, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i10++;
                        i7 = 421932776;
                        i8 = 9;
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
            Object[] objArr3 = {Integer.valueOf(f24970a)};
            Object objA2 = o.d.d.a(421932776);
            char c2 = 11;
            if (objA2 == null) {
                byte b4 = (byte) 0;
                objA2 = o.d.d.a(270 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.MeasureSpec.getSize(0), Color.red(0) + 11, -811348851, false, $$e((byte) 9, b4, b4), new Class[]{Integer.TYPE});
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
                    int i11 = $10 + 107;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    hVar.f19927c = cArr[hVar.f19926b];
                    hVar.f19925a = cArr[hVar.f19926b + i9];
                    if (hVar.f19927c == hVar.f19925a) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + i9] = (char) (hVar.f19925a - b2);
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = hVar;
                        objArr4[c2] = Integer.valueOf(cCharValue);
                        objArr4[10] = hVar;
                        objArr4[9] = hVar;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = hVar;
                        objArr4[6] = hVar;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = hVar;
                        objArr4[3] = hVar;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[i9] = hVar;
                        objArr4[0] = hVar;
                        Object objA3 = o.d.d.a(219124184);
                        if (objA3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA3 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 825, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 11 - TextUtils.getTrimmedLength(""), -611683395, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                            Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA4 = o.d.d.a(-634864343);
                            if (objA4 == null) {
                                int threadPriority = 218 - ((Process.getThreadPriority(0) + 20) >> 6);
                                char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iRgb = (-16777205) - Color.rgb(0, 0, 0);
                                byte b7 = (byte) 2;
                                byte b8 = (byte) (b7 - 2);
                                String str$$e = $$e(b7, b8, b8);
                                c2 = 11;
                                objA4 = o.d.d.a(threadPriority, c3, iRgb, 212688716, false, str$$e, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c2 = 11;
                            }
                            int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                            int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[iIntValue];
                            cArr4[hVar.f19926b + 1] = cArr2[i13];
                        } else {
                            c2 = 11;
                            if (hVar.f19928d == hVar.f19929e) {
                                hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                int i14 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[i14];
                                cArr4[hVar.f19926b + 1] = cArr2[i15];
                            } else {
                                int i16 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                int i17 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                cArr4[hVar.f19926b] = cArr2[i16];
                                i9 = 1;
                                cArr4[hVar.f19926b + 1] = cArr2[i17];
                            }
                        }
                        i9 = 1;
                    }
                    hVar.f19926b += 2;
                }
            }
            for (int i18 = 0; i18 < i2; i18++) {
                int i19 = $10 + 65;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        private static void m(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 75;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            o.a.q qVar = new o.a.q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i6 = $11 + 31;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(731 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7933), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, 355847088, false, $$e((byte) 40, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f24971d ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 836, (char) (27279 - TextUtils.getOffsetBefore("", 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -2145994442, false, $$e((byte) 33, b3, b3), new Class[]{Object.class, Object.class});
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
            int i9 = $11 + 1;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (qVar.f19948a < cArr.length) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(Process.getGidForName("") + 837, (char) (27278 - TextUtils.lastIndexOf("", '0')), Color.alpha(0) + 11, -2145994442, false, $$e((byte) 33, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void n(byte r9, short r10, int r11, java.lang.Object[] r12) {
            /*
                byte[] r8 = o.er.d.AnonymousClass9.$$a
                int r0 = r11 + 97
                int r1 = r9 * 3
                int r7 = 4 - r1
                int r1 = r10 * 2
                int r6 = r1 + 1
                byte[] r5 = new byte[r6]
                r4 = 0
                if (r8 != 0) goto L2c
                r2 = r6
                r3 = r4
            L13:
                int r7 = r7 + 1
                int r0 = -r0
                int r0 = r0 + r2
                r2 = r3
            L18:
                byte r1 = (byte) r0
                int r3 = r2 + 1
                r5[r2] = r1
                if (r3 != r6) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r12[r4] = r0
                return
            L27:
                r1 = r8[r7]
                r2 = r0
                r0 = r1
                goto L13
            L2c:
                r2 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass9.n(byte, short, int, java.lang.Object[]):void");
        }

        @Override // o.es.c.a
        public final /* synthetic */ void a(List<o.es.e> list) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24975h + 5;
            f24974g = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            b(list);
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f24974g + 103;
            f24975h = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.es.c.a
        public final void d(o.by.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24974g + 117;
            f24975h = i3 % 128;
            int i4 = i3 % 2;
            if (o.ea.f.a()) {
                String strA = d.this.a();
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                l(View.MeasureSpec.getSize(0) + 59, "\f\u0006#\u0016\t\u0002\u0012#\u0002\u0001\u0006\u001b\u001b\u001f\u001b\"\u001f\u0019\n \u000b\n#\"\u0004\t\u0003 \u0006\u000b㙕㙕\u0004\u001e\"#\u001f\u0000\u0003\u0006\u001f\t\u0004\u001e\u000e\u0011\u0015\u0007\t\u001e\b\u000b\u0014\u0013\u0001\u0018\"\u0003㘙", (byte) (95 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
                o.ea.f.d(strA, sb.append(((String) objArr[0]).intern()).append(cVar.c()).toString());
                int i5 = f24975h + 113;
                f24974g = i5 % 128;
                int i6 = i5 % 2;
            }
            operationCallback.onError(cVar.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, short r11) {
        /*
            int r8 = r11 + 71
            int r0 = r9 * 4
            int r7 = 3 - r0
            int r6 = r10 * 3
            int r0 = r6 + 1
            byte[] r5 = o.er.d.$$a
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r5 != 0) goto L2b
            r2 = r7
            r0 = r6
            r1 = r3
        L14:
            int r0 = -r0
            int r7 = r7 + r0
            r8 = r7
            r7 = r2
        L18:
            byte r0 = (byte) r8
            r4[r1] = r0
            int r2 = r7 + 1
            if (r1 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            int r1 = r1 + 1
            r0 = r5[r2]
            r7 = r8
            goto L14
        L2b:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.d.$$c(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24845w = -154814634;
        f24844v = -447564818;
        f24843u = -1736092575;
        f24833d = -97424277;
        f24832c = -816174942;
        f24834e = -1515560236;
        f24831b = -400547123;
        f24840m = 0;
        f24842o = 1;
        f24835f = -311564779;
        f24836h = 1150422478;
        f24838j = 422334765;
        f24837i = new byte[]{115, -116, -98, 96, -84, 82, -126, 115, 127, -100, -109, 122, -120, 112, -117, -115, -102, 91, -107, -100, 102, -113, 119, 126, -100, -84, 91, -88, 104, 127, -100, -109, 93, -121, 127, -98, 112, -84, -87, 49, 118, 119, 112, -125, 123, MessagePack.Code.FIXSTR_PREFIX, -119, 98, -122, -102, 69, 118, 119, 112, -125, 123, MessagePack.Code.FIXSTR_PREFIX, -119, 99, -82, 84, 115, -107, 119, 113, -98, 124, -117, 114, -95, -104, 55, -117, -124, 124, -117, 114, -127, -72, 71, 118, 119, 112, -125, 123, -128, -128, 115, -117, 126, -128, -103, 101, 115, -117, 123, -123, -113, -100, -81, 76, 112, MessagePack.Code.UINT64, 55, -117, -124, 124, -117, 114, -127, -72, 71, 118, 119, 112, -125, 123, -128, -118, -114, 118, -100, -113, -106, 108, 124, -98, 115, 119, -114, 112, 120, -113, -128, -81, -104, 55, -113, -128, -113, -72, 56, -120, -122, 122, 112, -97, 115, 127, MessagePack.Code.EXT16, 64, 102, -104, 122, -113, 120, -128, 96, -116, -120, -88, 88, -126, 115, -107, 98, -115, -68, 81, 124, 118, -70, 94, 118, 124, -98, 115, 119, -114, 112, 120, -113, -128, -81, -121, -124, 118, 80, -89, 55, -113, -128, -113, -72, 56, -120, -122, 122, 112, -97, 115, 127, MessagePack.Code.EXT16, 64, 102, -104, 122, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115};
        f24841n = -4323583545869960377L;
    }

    public d(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = (~((i8 + i3) - (i8 & i3))) | i5;
        int i10 = ((-1) - (((-1) - i3) & ((-1) - i5))) | i8;
        int i11 = i5 + i2 + i6 + (1159740906 * i4) + ((-617157175) * i7);
        int i12 = i11 * i11;
        int i13 = ((i5 * 934236018) - 2089811968) + (934236018 * i2) + (i9 * (-953110385)) + ((-953110385) * i10) + (953110385 * i8) + ((-18874368) * i6) + (1488977920 * i4) + (2111832064 * i7) + (2070937600 * i12);
        int i14 = (i5 * (-824977050)) + 1921657099 + (i2 * (-824977050)) + (i9 * (-923)) + (i10 * (-923)) + (i8 * 923) + (i6 * (-824977973)) + (i4 * (-135083378)) + (i7 * 1125239651) + (i12 * 298844160);
        return i13 + ((i14 * i14) * 2098200576) != 1 ? d(objArr) : c(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Context context = (Context) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        if (context == null) {
            Object[] objArr2 = {new int[]{i ^ (i << 5)}, new int[]{iIntValue}, null, new int[]{iIntValue}};
            int i2 = f24843u * 1546386818;
            f24843u = i2;
            int i3 = ~i2;
            int i4 = ~((-1) - (((-1) - (-285475271)) & ((-1) - i3)));
            int i5 = ~(((-111657) + i2) - ((-111657) & i2));
            int i6 = (i4 + i5) - (i4 & i5);
            int i7 = ~(((-107085826) + i2) - ((-107085826) & i2));
            int i8 = iIntValue2 + (-2139678818) + (((i6 + i7) - (i6 & i7)) * 765) + (((-1) - (((-1) - (~((-1) - (((-1) - (-285586927)) & ((-1) - i3))))) & ((-1) - 285475270))) * 1530) + (((~((-1) - (((-1) - i2) & ((-1) - (-285586927))))) | (~((i3 - 107085826) - (i3 & (-107085826))))) * 765);
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            return objArr2;
        }
        try {
            Object[] objArr3 = new Object[1];
            z("癢ɐ鸌⫂Ꚕ㌻켭寢힣恼ﱀ蠒Ӑ邔ⴸ뤾㗭솵婢혝戄ﺐ諞ܧ鍾⿁믷㐻쀄尭\ue8d4撆\uf146贲᧳閳\u2e6d멙", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29753, objArr3);
            Object[] objArr4 = (Object[]) Array.newInstance(Class.forName(((String) objArr3[0]).intern()), 2);
            Object[] objArr5 = new Object[1];
            z("癋渷䛗㼚អౙ\ue4dc\udd70뗩궕艂窗匡䯗⁓ᣰ\uf134\ue9c6쇇ꘪ麲眩濌䑀㳹ᕥ൞\ue5a0\uda69느ꭥ", (ViewConfiguration.getPressedStateDuration() >> 16) + 6257, objArr5);
            try {
                Object[] objArr6 = {((String) objArr5[0]).intern()};
                Object[] objArr7 = new Object[1];
                z("癢ɐ鸌⫂Ꚕ㌻켭寢힣恼ﱀ蠒Ӑ邔ⴸ뤾㗭솵婢혝戄ﺐ諞ܧ鍾⿁믷㐻쀄尭\ue8d4撆\uf146贲᧳閳\u2e6d멙", View.MeasureSpec.getMode(0) + 29753, objArr7);
                objArr4[0] = Class.forName(((String) objArr7[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr6);
                Object[] objArr8 = new Object[1];
                y((short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.rgb(0, 0, 0) + 1459623050, (-1572756573) - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) - 36, (byte) View.getDefaultSize(0, 0), objArr8);
                try {
                    Object[] objArr9 = {((String) objArr8[0]).intern()};
                    Object[] objArr10 = new Object[1];
                    z("癢ɐ鸌⫂Ꚕ㌻켭寢힣恼ﱀ蠒Ӑ邔ⴸ뤾㗭솵婢혝戄ﺐ諞ܧ鍾⿁믷㐻쀄尭\ue8d4撆\uf146贲᧳閳\u2e6d멙", Color.green(0) + 29753, objArr10);
                    objArr4[1] = Class.forName(((String) objArr10[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr9);
                    try {
                        char c2 = '0';
                        Object[] objArr11 = new Object[1];
                        y((short) (ViewConfiguration.getLongPressTimeout() >> 16), 1442845864 - Color.green(0), (-1572756544) - ExpandableListView.getPackedPositionChild(0L), (-44) - View.getDefaultSize(0, 0), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr11);
                        Class<?> cls = Class.forName(((String) objArr11[0]).intern());
                        Object[] objArr12 = new Object[1];
                        z("癯ꃐ\udb06\uf26fⲝ䟚縍ꥂ쎇靖ᔧ䱶暺釰젹\ue37eᶪ", 54973 - Color.red(0), objArr12);
                        Object objInvoke = cls.getMethod(((String) objArr12[0]).intern(), null).invoke(context, null);
                        try {
                            Object[] objArr13 = new Object[1];
                            y((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1442845864, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1572756544, (ViewConfiguration.getJumpTapTimeout() >> 16) - 44, (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr13);
                            Class<?> cls2 = Class.forName(((String) objArr13[0]).intern());
                            Object[] objArr14 = new Object[1];
                            z("癯濘䔖㭇Ⴝ\uf6e2\uec5d얚믇鄰睔沮䈙㡜", 6580 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr14);
                            try {
                                Object[] objArr15 = {cls2.getMethod(((String) objArr14[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr16 = new Object[1];
                                y((short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 1442845886 - View.MeasureSpec.getMode(0), (-1572756544) - ((byte) KeyEvent.getModifierMetaStateMask()), 14 - AndroidCharacter.getMirror('0'), (byte) (ViewConfiguration.getScrollBarSize() >> 8), objArr16);
                                Class<?> cls3 = Class.forName(((String) objArr16[0]).intern());
                                Object[] objArr17 = new Object[1];
                                z("癯筀氦凟䋝㞊㥭⩒ἇø\uf583\ue689\ue872\udd2e", 3372 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr17);
                                Object objInvoke2 = cls3.getMethod(((String) objArr17[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr15);
                                Object[] objArr18 = new Object[1];
                                z("癩뛝\uf71a㑋璋뗆\uf20e㌻玳냴\uf128㹵纩뼙ﱆ㳓緈먎ﬀ㮹磵뤼\ue671⚤柧ꐮ\ue4bf◟戚ꍈ", 49339 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr18);
                                Class<?> cls4 = Class.forName(((String) objArr18[0]).intern());
                                Object[] objArr19 = new Object[1];
                                z("登\uf6dc眕\uf451璝\uf5cd爓\uf351玅\uf0de", TextUtils.getOffsetAfter("", 0) + 32957, objArr19);
                                Object[] objArr20 = (Object[]) cls4.getField(((String) objArr19[0]).intern()).get(objInvoke2);
                                int length = objArr20.length;
                                int i11 = 0;
                                while (i11 < length) {
                                    Object obj = objArr20[i11];
                                    Object[] objArr21 = new Object[1];
                                    z("癐㕱\uf093밽筭", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17238, objArr21);
                                    try {
                                        Object[] objArr22 = {((String) objArr21[0]).intern()};
                                        Object[] objArr23 = new Object[1];
                                        y((short) (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 1442845918, (-1572756534) - (ViewConfiguration.getEdgeSlop() >> 16), (-30) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) Drawable.resolveOpacity(0, 0), objArr23);
                                        Class<?> cls5 = Class.forName(((String) objArr23[0]).intern());
                                        Object[] objArr24 = new Object[1];
                                        y((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.green(0) + 1442845954, (ViewConfiguration.getLongPressTimeout() >> 16) - 1572756537, (-56) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (TextUtils.lastIndexOf("", c2, 0) + 1), objArr24);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr24[0]).intern(), String.class).invoke(null, objArr22);
                                        try {
                                            Object[] objArr25 = new Object[1];
                                            z("癩䏑ᴂ흟ꂻ竲㐦ว\udbd3锈潀㢡\uf2f9찭虾原ⴈ\ue742냸諎䐭Ṭ\uebdcꔘ罔䢢ˬ\udc20", 13751 - Color.argb(0, 0, 0, 0), objArr25);
                                            Class<?> cls6 = Class.forName(((String) objArr25[0]).intern());
                                            short scrollBarSize = (short) (ViewConfiguration.getScrollBarSize() >> 8);
                                            int i12 = 1442845965 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            int i13 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1572756525;
                                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) - 56;
                                            byte bIndexOf = (byte) (TextUtils.indexOf("", c2, 0, 0) + 1);
                                            Object[] objArr26 = new Object[1];
                                            y(scrollBarSize, i12, i13, packedPositionGroup, bIndexOf, objArr26);
                                            try {
                                                Object[] objArr27 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr26[0]).intern(), null).invoke(obj, null))};
                                                Object[] objArr28 = new Object[1];
                                                y((short) (ViewConfiguration.getPressedStateDuration() >> 16), KeyEvent.getDeadChar(0, 0) + 1442845918, (-1572756535) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-30) - Drawable.resolveOpacity(0, 0), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr28);
                                                Class<?> cls7 = Class.forName(((String) objArr28[0]).intern());
                                                Object[] objArr29 = new Object[1];
                                                z("癯襰衜謺討跸賒辦躣蹨腘聃茽舗藷蓘螹蚑虧", View.resolveSize(0, 0) + 65309, objArr29);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr29[0]).intern(), InputStream.class).invoke(objInvoke3, objArr27);
                                                int length2 = objArr4.length;
                                                for (int i14 = 0; i14 < 2; i14++) {
                                                    Object obj2 = objArr4[i14];
                                                    try {
                                                        Object[] objArr30 = new Object[1];
                                                        y((short) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 1442845975, (-1572756534) - (KeyEvent.getMaxKeyCode() >> 16), MotionEvent.axisFromString("") - 32, (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr30);
                                                        Class<?> cls8 = Class.forName(((String) objArr30[0]).intern());
                                                        Object[] objArr31 = new Object[1];
                                                        z("癯離띢ퟶ\uf441ᒡ㔸善爓鍻돆퀘\uf08cᅻㆊ帛纑鼙뱥\udcfcﵔ᷒㨮", (Process.myPid() >> 22) + 57487, objArr31);
                                                        if (obj2.equals(cls8.getMethod(((String) objArr31[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr32 = {new int[]{i ^ (i << 5)}, new int[]{iIntValue}, null, new int[]{iIntValue ^ 1}};
                                                            int i15 = f24844v * 2146179767;
                                                            f24844v = i15;
                                                            int i16 = ~i15;
                                                            int i17 = (-1602072428) + ((i15 | 657744321) * (-859)) + (((~((i15 - 20201921) - (i15 & (-20201921)))) | (~(657744321 | i16))) * 859);
                                                            int i18 = ~(((-20403701) + i16) - ((-20403701) & i16));
                                                            int i19 = i17 + (((i18 + 201780) - (i18 & 201780)) * 859) + 16 + iIntValue2;
                                                            int i20 = (i19 << 13) ^ i19;
                                                            int i21 = i20 ^ (i20 >>> 17);
                                                            return objArr32;
                                                        }
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i11++;
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
        Object[] objArr33 = {new int[]{i ^ (i << 5)}, new int[]{iIntValue}, null, new int[]{iIntValue}};
        int i22 = f24845w * 947658533;
        f24845w = i22;
        int i23 = 675194884 + (((-339915050) | i22) * (-627)) + (((-1) - (((-1) - (~(((-169150087) + i22) - ((-169150087) & i22)))) & ((-1) - 508997935))) * (-627));
        int i24 = ~i22;
        int i25 = iIntValue2 + i23 + (((-1) - (((-1) - (~(i22 | 508997935))) & ((-1) - (~((i24 + 169150086) - (i24 & 169150086)))))) * IptcDirectory.TAG_SOURCE);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        return objArr33;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        d dVar = (d) objArr[0];
        Context context = (Context) objArr[1];
        OperationCallback operationCallback = (OperationCallback) objArr[2];
        int i2 = 2 % 2;
        int i3 = f24842o + 79;
        f24840m = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (!(!o.ea.f.a())) {
            String strA = dVar.a();
            Object[] objArr2 = new Object[1];
            y((short) View.MeasureSpec.getMode(0), 1442845811 - Color.blue(0), (-1572756536) + (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 43, (byte) TextUtils.indexOf("", ""), objArr2);
            o.ea.f.c(strA, ((String) objArr2[0]).intern());
            int i4 = f24842o + 3;
            f24840m = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr3 = {dVar.f25009a};
        int i6 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i6;
        int i7 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i7;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i8 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i8;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr3, i7, iElapsedRealtime, i8, i6)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr4 = new Object[1];
            y((short) (ViewConfiguration.getFadingEdgeLength() >> 16), 1442845808 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1572756574, (ViewConfiguration.getScrollBarSize() >> 8) - 63, (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr4[0]).intern());
        }
        if (!dVar.c()) {
            throw new WalletValidationException(WalletValidationErrorCode.WrongState, dVar.b());
        }
        o.es.c cVarB = dVar.b(context);
        cVarB.d(new c.a<c.e>() { // from class: o.er.d.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static long f24895a = 0;

            /* JADX INFO: renamed from: c */
            private static int f24896c = 0;

            /* JADX INFO: renamed from: g */
            private static int f24897g = 0;

            /* JADX INFO: renamed from: i */
            private static int f24898i = 0;

            /* JADX INFO: renamed from: j */
            private static char f24899j = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ o.es.c f24900b;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ OperationCallback f24901d;

            /* JADX INFO: renamed from: o.er.d$3$5 */
            final class AnonymousClass5 implements c.a<List<o.es.e>> {
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a */
                private static int[] f24903a = null;

                /* JADX INFO: renamed from: b */
                private static int f24904b = 0;

                /* JADX INFO: renamed from: d */
                private static int f24905d = 0;

                private static String $$c(int v2, int v3, byte v4) {
                    /*
                        int r0 = r8 * 2
                        int r8 = 121 - r0
                        int r2 = r9 * 2
                        int r1 = 1 - r2
                        int r0 = r7 * 2
                        int r7 = 4 - r0
                        byte[] r6 = o.er.d.AnonymousClass3.AnonymousClass5.$$a
                        byte[] r5 = new byte[r1]
                        r4 = 0
                        int r3 = 0 - r2
                        if (r6 != 0) goto L2f
                        r2 = r4
                        r1 = r7
                    L17:
                        int r7 = r7 + r8
                        int r0 = r1 + 1
                        r1 = r2
                        r8 = r7
                        r7 = r0
                    L1d:
                        byte r0 = (byte) r8
                        r5[r1] = r0
                        int r2 = r1 + 1
                        if (r1 != r3) goto L2a
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        return r0
                    L2a:
                        r0 = r6[r7]
                        r1 = r7
                        r7 = r0
                        goto L17
                    L2f:
                        r1 = r4
                        goto L1d
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.AnonymousClass5.$$c(int, int, byte):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f24905d = 0;
                    f24904b = 1;
                    f24903a = new int[]{48671810, 1936437802, 1574723672, -950202625, -946716899, 1094138493, -1757708347, -1306263363, 1087724733, -818821012, 1475572466, 126245207, -1579010168, 1981941533, 2090396687, 1569749381, 68820207, 500068555};
                }

                AnonymousClass5() {
                }

                /* JADX WARN: Removed duplicated region for block: B:48:0x001c  */
                /* JADX INFO: renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private void a2(java.util.List<o.es.e> r16) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 648
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.AnonymousClass5.a2(java.util.List):void");
                }

                private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
                    int i3 = 2 % 2;
                    o.a.l lVar = new o.a.l();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr2 = f24903a;
                    int i4 = 989264422;
                    char c2 = 1;
                    int i5 = 0;
                    if (iArr2 != null) {
                        int i6 = $11 + 107;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        int length = iArr2.length;
                        int[] iArr3 = new int[length];
                        int i8 = 0;
                        while (i8 < length) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                                Object objA = o.d.d.a(i4);
                                if (objA == null) {
                                    int i9 = (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)) + 675;
                                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 12;
                                    byte b2 = $$a[1];
                                    byte b3 = b2;
                                    objA = o.d.d.a(i9, cAxisFromString, pressedStateDuration, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                                i8++;
                                i4 = 989264422;
                                i5 = 0;
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
                    int[] iArr5 = f24903a;
                    long j2 = 0;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i10 = 0;
                        while (i10 < length3) {
                            Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                            Object objA2 = o.d.d.a(989264422);
                            if (objA2 == null) {
                                int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 675;
                                char c3 = (char) (1 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)));
                                int iIndexOf = 12 - TextUtils.indexOf("", "", 0);
                                byte b4 = $$a[c2];
                                byte b5 = b4;
                                objA2 = o.d.d.a(i11, c3, iIndexOf, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                            i10++;
                            j2 = 0;
                            c2 = 1;
                        }
                        iArr5 = iArr6;
                    }
                    System.arraycopy(iArr5, 0, iArr4, 0, length2);
                    lVar.f19941d = 0;
                    int i12 = $11 + 47;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    while (lVar.f19941d < iArr.length) {
                        cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                        cArr[1] = (char) iArr[lVar.f19941d];
                        cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                        cArr[3] = (char) iArr[lVar.f19941d + 1];
                        lVar.f19942e = (cArr[0] << 16) + cArr[1];
                        lVar.f19940a = (cArr[2] << 16) + cArr[3];
                        o.a.l.a(iArr4);
                        int i14 = 0;
                        for (int i15 = 16; i14 < i15; i15 = 16) {
                            int i16 = $11 + 65;
                            $10 = i16 % 128;
                            if (i16 % 2 != 0) {
                                lVar.f19942e ^= iArr4[i14];
                                Object[] objArr4 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                                Object objA3 = o.d.d.a(2098218801);
                                if (objA3 == null) {
                                    int iIndexOf2 = 300 - TextUtils.indexOf((CharSequence) "", '0');
                                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 52697);
                                    int iIndexOf3 = 10 - TextUtils.indexOf((CharSequence) "", '0');
                                    byte b6 = $$a[1];
                                    byte b7 = b6;
                                    objA3 = o.d.d.a(iIndexOf2, deadChar, iIndexOf3, -1416256172, false, $$c(b7, (byte) (b7 + 1), b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                                lVar.f19942e = lVar.f19940a;
                                lVar.f19940a = iIntValue;
                                i14 += 6;
                            } else {
                                lVar.f19942e ^= iArr4[i14];
                                Object[] objArr5 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                                Object objA4 = o.d.d.a(2098218801);
                                if (objA4 == null) {
                                    int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 300;
                                    char size = (char) (52697 - View.MeasureSpec.getSize(0));
                                    int iBlue = 11 - Color.blue(0);
                                    byte b8 = $$a[1];
                                    byte b9 = b8;
                                    objA4 = o.d.d.a(i17, size, iBlue, -1416256172, false, $$c(b9, (byte) (b9 + 1), b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                }
                                int iIntValue2 = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                                lVar.f19942e = lVar.f19940a;
                                lVar.f19940a = iIntValue2;
                                i14++;
                            }
                        }
                        int i18 = lVar.f19942e;
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = i18;
                        lVar.f19940a ^= iArr4[16];
                        lVar.f19942e ^= iArr4[17];
                        int i19 = lVar.f19942e;
                        int i20 = lVar.f19940a;
                        cArr[0] = (char) (lVar.f19942e >>> 16);
                        cArr[1] = (char) lVar.f19942e;
                        cArr[2] = (char) (lVar.f19940a >>> 16);
                        cArr[3] = (char) lVar.f19940a;
                        o.a.l.a(iArr4);
                        cArr2[lVar.f19941d * 2] = cArr[0];
                        cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                        cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                        cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                        Object[] objArr6 = {lVar, lVar};
                        Object objA5 = o.d.d.a(986820978);
                        if (objA5 == null) {
                            int gidForName = 228 - Process.getGidForName("");
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 51005);
                            int iRgb = (-16777207) - Color.rgb(0, 0, 0);
                            byte b10 = $$a[1];
                            byte b11 = b10;
                            objA5 = o.d.d.a(gidForName, cIndexOf, iRgb, -330018025, false, $$c(b11, (byte) (b11 + 2), b10), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA5).invoke(null, objArr6);
                    }
                    objArr[0] = new String(cArr2, 0, i2);
                }

                static void init$0() {
                    $$a = new byte[]{88, 0, 126, -69};
                    $$b = 94;
                }

                @Override // o.es.c.a
                public final /* bridge */ /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                    int i2 = 2 % 2;
                    int i3 = f24904b + 21;
                    f24905d = i3 % 128;
                    int i4 = i3 % 2;
                    a2(list);
                    if (i4 != 0) {
                        throw null;
                    }
                    int i5 = f24905d + 69;
                    f24904b = i5 % 128;
                    int i6 = i5 % 2;
                }

                @Override // o.es.c.a
                public final void d(o.by.c v2) throws Throwable {
                    /*
                        this = this;
                        r6 = 2
                        int r0 = r6 % r6
                        int r0 = o.er.d.AnonymousClass3.AnonymousClass5.f24905d
                        int r1 = r0 + 115
                        int r0 = r1 % 128
                        o.er.d.AnonymousClass3.AnonymousClass5.f24904b = r0
                        int r1 = r1 % r6
                        r5 = 0
                        if (r1 != 0) goto L6a
                        boolean r1 = o.ea.f.a()
                        r0 = 21
                        int r0 = r0 / r5
                        if (r1 == 0) goto L5e
                    L18:
                        o.er.d$3 r0 = o.er.d.AnonymousClass3.this
                        o.er.d r0 = o.er.d.this
                        java.lang.String r4 = r0.a()
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        r0 = 36
                        int[] r2 = new int[r0]
                        r2 = {x0072: FILL_ARRAY_DATA , data: [-851106194, 1518176544, 565146921, -1892631401, 2098376998, -1465290929, 408057671, 743975803, 515122769, -509639021, 408718527, -179515435, 877277470, -701035922, -1970965751, 1157641081, -1261496158, 769178753, -745535183, 1397617458, 716519000, 974173941, -64679699, 527636799, -1554083, -766144111, -2070527643, 490698466, -1869065845, 87435243, 1728325703, 1172297662, 1410575183, 1992655049, -385100326, -994437579} // fill-array
                        java.lang.String r0 = ""
                        int r0 = android.os.Process.getGidForName(r0)
                        int r1 = 69 - r0
                        r0 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        f(r2, r1, r0)
                        r0 = r0[r5]
                        java.lang.String r0 = (java.lang.String) r0
                        java.lang.String r0 = r0.intern()
                        java.lang.StringBuilder r1 = r3.append(r0)
                        fr.antelop.sdk.AntelopErrorCode r0 = r8.c()
                        java.lang.StringBuilder r0 = r1.append(r0)
                        java.lang.String r0 = r0.toString()
                        o.ea.f.d(r4, r0)
                        int r0 = o.er.d.AnonymousClass3.AnonymousClass5.f24904b
                        int r1 = r0 + 87
                        int r0 = r1 % 128
                        o.er.d.AnonymousClass3.AnonymousClass5.f24905d = r0
                        int r1 = r1 % r6
                    L5e:
                        o.er.d$3 r0 = o.er.d.AnonymousClass3.this
                        fr.antelop.sdk.util.OperationCallback r1 = r2
                        fr.antelop.sdk.AntelopError r0 = r8.a()
                        r1.onError(r0)
                        return
                    L6a:
                        boolean r0 = o.ea.f.a()
                        if (r0 == 0) goto L5e
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.AnonymousClass5.d(o.by.c):void");
                }
            }

            private static String $$c(short v2, byte v3, byte v4) {
                /*
                    int r2 = r10 + 4
                    int r8 = r8 * 3
                    int r1 = r8 + 1
                    byte[] r7 = o.er.d.AnonymousClass3.$$a
                    int r0 = 122 - r9
                    byte[] r6 = new byte[r1]
                    r5 = 0
                    if (r7 != 0) goto L28
                    r4 = r5
                    r3 = r8
                L11:
                    int r0 = -r0
                    int r0 = r0 + r3
                    r3 = r4
                L14:
                    byte r1 = (byte) r0
                    r6[r3] = r1
                    int r4 = r3 + 1
                    if (r3 != r8) goto L21
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    return r0
                L21:
                    int r2 = r2 + 1
                    r1 = r7[r2]
                    r3 = r0
                    r0 = r1
                    goto L11
                L28:
                    r3 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.$$c(short, byte, byte):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f24898i = 0;
                f24897g = 1;
                f24895a = 740602047300126166L;
                f24896c = 1564493270;
                f24899j = (char) 45647;
            }

            AnonymousClass3(OperationCallback operationCallback2, o.es.c cVarB2) {
                operationCallback = operationCallback2;
                cVar = cVarB2;
            }

            private void d(c.e v2) throws Throwable {
                /*
                    this = this;
                    r2 = 2
                    int r0 = r2 % r2
                    int r0 = o.er.d.AnonymousClass3.f24897g
                    int r1 = r0 + 95
                    int r0 = r1 % 128
                    o.er.d.AnonymousClass3.f24898i = r0
                    int r1 = r1 % r2
                    o.es.c$e r0 = o.es.c.e.f25300d
                    if (r13 == r0) goto L71
                    int r0 = o.er.d.AnonymousClass3.f24897g
                    int r1 = r0 + 13
                    int r0 = r1 % 128
                    o.er.d.AnonymousClass3.f24898i = r0
                    int r1 = r1 % r2
                    r5 = 0
                    if (r1 == 0) goto L6a
                    boolean r1 = o.ea.f.a()
                    r0 = 35
                    int r0 = r0 / r5
                    if (r1 == 0) goto L55
                L25:
                    o.er.d r0 = o.er.d.this
                    java.lang.String r2 = r0.a()
                    long r6 = android.widget.ExpandableListView.getPackedPositionForChild(r5, r5)
                    r3 = 0
                    int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    r0 = 63267(0xf723, float:8.8656E-41)
                    int r0 = r0 - r1
                    char r6 = (char) r0
                    long r0 = android.widget.ExpandableListView.getPackedPositionForGroup(r5)
                    int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    r0 = 1
                    java.lang.Object[] r11 = new java.lang.Object[r0]
                    java.lang.String r7 = "냺譌㮸皿࿓榡䤷郲噼\ue5e1ᑬ楽씵╌ᝡ\ue97d昗彣\uf58d䄶ߩ㠣诎摣屵յꯟ\uf21f⻊耏ⓣ\ud930⟥氼\ud89b\ud844犾䭖\ue280⥚\ue93e\uebec㩤呻\uf6bd뫦鮟出ᯪ糋矙瘾ꩼ咭奚\udd03"
                    java.lang.String r8 = "\u0000\u0000\u0000\u0000"
                    java.lang.String r9 = "⯖箸ⓣ퇷"
                    f(r6, r7, r8, r9, r10, r11)
                    r0 = r11[r5]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r0 = r0.intern()
                    o.ea.f.c(r2, r0)
                L55:
                    fr.antelop.sdk.util.OperationCallback r2 = r2
                    o.by.c r1 = new o.by.c
                    o.er.d r0 = o.er.d.this
                    fr.antelop.sdk.AntelopErrorCode r0 = r0.e()
                    r1.<init>(r0)
                    fr.antelop.sdk.AntelopError r0 = r1.a()
                    r2.onError(r0)
                    return
                L6a:
                    boolean r0 = o.ea.f.a()
                    if (r0 == 0) goto L55
                    goto L25
                L71:
                    o.es.c r1 = r3
                    o.er.d$3$5 r0 = new o.er.d$3$5
                    r0.<init>()
                    r1.c(r0)
                    int r0 = o.er.d.AnonymousClass3.f24898i
                    int r1 = r0 + 29
                    int r0 = r1 % 128
                    o.er.d.AnonymousClass3.f24897g = r0
                    int r1 = r1 % r2
                    if (r1 == 0) goto L87
                    return
                L87:
                    r0 = 0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass3.d(o.es.c$e):void");
            }

            private static void f(char c2, String str, String str2, String str3, int i22, Object[] objArr5) throws Throwable {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                int i32 = 2 % 2;
                int i42 = $11 + 9;
                $10 = i42 % 128;
                Object obj2 = str6;
                if (i42 % 2 != 0) {
                    Object obj22 = null;
                    obj22.hashCode();
                    throw null;
                }
                if (str6 != null) {
                    char[] charArray = str6.toCharArray();
                    int i52 = $10 + 61;
                    $11 = i52 % 128;
                    int i62 = i52 % 2;
                    obj2 = charArray;
                }
                char[] cArr = (char[]) obj2;
                Object charArray2 = str5;
                if (str5 != null) {
                    charArray2 = str5.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str4;
                if (str4 != null) {
                    charArray3 = str4.toCharArray();
                }
                o.a.i iVar = new o.a.i();
                int length = cArr.length;
                char[] cArr3 = new char[length];
                int length2 = cArr2.length;
                char[] cArr4 = new char[length2];
                int i72 = 0;
                System.arraycopy(cArr, 0, cArr3, 0, length);
                System.arraycopy(cArr2, 0, cArr4, 0, length2);
                cArr3[0] = (char) (cArr3[0] ^ c2);
                cArr4[2] = (char) (cArr4[2] + ((char) i22));
                int length3 = ((char[]) charArray3).length;
                char[] cArr5 = new char[length3];
                iVar.f19932b = 0;
                while (iVar.f19932b < length3) {
                    try {
                        Object[] objArr22 = {iVar};
                        Object objA = o.d.d.a(540069882);
                        if (objA == null) {
                            int keyRepeatTimeout = 106 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            char size = (char) View.MeasureSpec.getSize(i72);
                            int iRgb = (-16777205) - Color.rgb(i72, i72, i72);
                            byte b2 = (byte) i72;
                            String str$$c = $$c(b2, (byte) (57 | b2), (byte) (-1));
                            Class[] clsArr = new Class[1];
                            clsArr[i72] = Object.class;
                            objA = o.d.d.a(keyRepeatTimeout, size, iRgb, -155898465, false, str$$c, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr22)).intValue();
                        Object[] objArr32 = {iVar};
                        Object objA2 = o.d.d.a(2068572);
                        if (objA2 == null) {
                            byte b3 = (byte) i72;
                            objA2 = o.d.d.a((TypedValue.complexToFloat(i72) > 0.0f ? 1 : (TypedValue.complexToFloat(i72) == 0.0f ? 0 : -1)) + 847, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6487), 12 - TextUtils.getOffsetAfter("", i72), -694521287, false, $$c(b3, (byte) ((b3 + 54) - (54 & b3)), (byte) (-1)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr32)).intValue();
                        Object[] objArr42 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA3 = o.d.d.a(-1122996612);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            objA3 = o.d.d.a(457 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - View.getDefaultSize(0, 0), 1804962841, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 56))), (byte) (-1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objA3).invoke(null, objArr42);
                        Object[] objArr52 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA4 = o.d.d.a(-1223178239);
                        if (objA4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 65100), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1636969060, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr52)).charValue();
                        cArr3[iIntValue2] = iVar.f19933e;
                        cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r7[iVar.f19932b])) ^ (f24895a ^ 740602047300126166L)) ^ ((long) ((int) (((long) f24896c) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f24899j) ^ 740602047300126166L))));
                        iVar.f19932b++;
                        i72 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr5[0] = new String(cArr5);
            }

            static void init$0() {
                $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
                $$b = 69;
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(c.e eVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24898i + 65;
                f24897g = i32 % 128;
                int i42 = i32 % 2;
                d(eVar);
                int i52 = f24898i + 17;
                f24897g = i52 % 128;
                int i62 = i52 % 2;
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) {
                int i22 = 2 % 2;
                int i32 = f24897g + 101;
                f24898i = i32 % 128;
                if (i32 % 2 != 0) {
                    operationCallback.onError(cVar.a());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                operationCallback.onError(cVar.a());
                int i42 = f24897g + 49;
                f24898i = i42 % 128;
                int i52 = i42 % 2;
            }
        });
        return null;
    }

    public static Object[] e(Context context, int i2, int i3) {
        Object[] objArr = {context, Integer.valueOf(i2), Integer.valueOf(i3)};
        int i4 = f24834e * 452100274;
        f24834e = i4;
        int i5 = f24832c * (-135289739);
        f24832c = i5;
        int i6 = f24833d * (-1121633164);
        f24833d = i6;
        return (Object[]) a(-2041313942, i4, i6, objArr, 2041313943, i5, new Random().nextInt(1763419628));
    }

    static void init$0() {
        $$a = new byte[]{60, -17, 3, Ascii.NAK};
        $$b = 71;
    }

    private static void y(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        boolean z2;
        int i5 = 2 % 2;
        o.a.j jVar = new o.a.j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f24836h)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = o.d.d.a(238 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (44531 - (ViewConfiguration.getEdgeSlop() >> 16)), 11 - Color.argb(0, 0, 0, 0), 35969549, false, $$c(b3, b4, (byte) (33 | b4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if ((i6 ^ 1) != 1) {
                int i7 = $11;
                int i8 = i7 + 93;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = f24837i;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = i7 + 77;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    for (int i11 = 0; i11 < length; i11++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a(628 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 28650), 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1621469864, false, $$c(b5, b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 32)))), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $11 + 25;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr3 = f24837i;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f24835f)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(239 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (44531 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 35969549, false, $$c(b7, b8, (byte) (33 | b8)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f24836h) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) f24839l[i2 + ((int) (((long) f24835f) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f24836h) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f24835f) ^ (-7649639543924978291L))) + i6;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f24838j), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(TextUtils.getTrimmedLength(""), (char) (View.combineMeasuredStates(0, 0) + 5358), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f24837i;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z2 = true;
                } else {
                    int i15 = $11 + 55;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 2 % 5;
                    }
                    z2 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = f24837i;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f24839l;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
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

    private static void z(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        o.a.q qVar = new o.a.q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i4 = $10 + 49;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 730, (char) (7933 - ExpandableListView.getPackedPositionType(0L)), 11 - (Process.myPid() >> 22), 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f24841n ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(836 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 27279), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2145994442, false, $$c(b4, b5, (byte) ((b5 + 7) - (7 & b5))), new Class[]{Object.class, Object.class});
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
                objA3 = o.d.d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 836, (char) (27279 - TextUtils.indexOf("", "", 0)), 11 - Color.red(0), -2145994442, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 7)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2);
        int i7 = $10 + 103;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str3;
        } else {
            int i8 = 26 / 0;
            objArr[0] = str3;
        }
    }

    public abstract String a();

    public final void a(Activity activity) {
        int i2 = 2 % 2;
        b(activity).d(new c.a<c.e>() { // from class: o.er.d.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static int f24846a = 0;

            /* JADX INFO: renamed from: b */
            private static long f24847b = 0;

            /* JADX INFO: renamed from: c */
            private static char[] f24848c = null;

            /* JADX INFO: renamed from: f */
            public static int f24849f = 0;

            /* JADX INFO: renamed from: g */
            public static int f24850g = 0;

            /* JADX INFO: renamed from: h */
            public static int f24851h = 0;

            /* JADX INFO: renamed from: j */
            private static int f24852j = 0;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ Activity f24853d;

            private static String $$e(byte v2, int v3, byte v4) {
                /*
                    int r8 = r8 + 4
                    byte[] r7 = o.er.d.AnonymousClass1.$$c
                    int r0 = 105 - r9
                    int r2 = r10 * 3
                    int r1 = 1 - r2
                    byte[] r6 = new byte[r1]
                    r5 = 0
                    int r4 = 0 - r2
                    if (r7 != 0) goto L2a
                    r2 = r4
                    r3 = r5
                L13:
                    int r0 = -r0
                    int r0 = r0 + r2
                    r2 = r3
                L16:
                    byte r1 = (byte) r0
                    r6[r2] = r1
                    int r3 = r2 + 1
                    if (r2 != r4) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    return r0
                L23:
                    int r8 = r8 + 1
                    r1 = r7[r8]
                    r2 = r0
                    r0 = r1
                    goto L13
                L2a:
                    r2 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass1.$$e(byte, int, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f24851h = 977982473;
                f24850g = -76166078;
                f24849f = 352107771;
                init$0();
                f24846a = 0;
                f24852j = 1;
                f24848c = new char[]{38043, 50158, 14952, 37594, 51500, 8620, 38927, 61596, 12271, 34407, 65255, 21848, 36264, 58431, 23685, 35600, 57974, 23240, 45400, 19049, 7440, 58537, 19495, 6091, 65371, 18147, 11857, 61705, 22667, 8204, 35774, 21320, 15048, 33387, 22008, 15499, 33843, 38035, 50163, 14920, 37581, 51489, 8624, 38924, 61653, 12261, 34406, 65162, 21875, 36259, 58419, 23701, 35604, 43596, 64895, 1220, 44125, 63472, 7971, 42652, 52760, 4469, 47329, 49241, 27529, 45875, 55973, 25107, 46487, 56564, 25619, 36825, 55084, 32430, 34331, 10624, 28916, 39020, 9115, 19270, 37539, 14901, 19842, 38148, 15484, 18423, 61299, 13993, 24124, 57758, 2315, 20604, 64504, 6282, 20452, 46666, 38109, 50157, 14942, 37584, 51501, 8694, 38939, 61570, 12281, 34362, 65231, 21842, 36276, 58431, 23685, 35615, 57901, 23243, 45384, 59837, 16447, 47242, 5917, 20052, 42751, 7499, 30165, 44069, 1210, 29444, 43924, 38083, 38109, 50158, 14933, 37580, 51553, 8626, 38925, 61577, 12260, 34416, 65224, 21784, 36258, 58420, 23682, 35590, 57957, 23170, 45384, 59837, 16447, 47242, 5905, 20069, 42749, 7434, 30144, 44085, 1207, 29442, 43929, 749, 31093, 53730, 2083, 24753};
                f24847b = -6827391567890693219L;
            }

            AnonymousClass1(Activity activity2) {
                activity = activity2;
            }

            private void b(c.e eVar) {
                int i22 = 2 % 2;
                int i3 = f24852j + 33;
                f24846a = i3 % 128;
                int i4 = i3 % 2;
                int i5 = AnonymousClass7.f24964b[eVar.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        d.this.b(activity).b(activity);
                        return;
                    } else if (i5 != 3) {
                        return;
                    }
                }
                int i6 = f24852j + 27;
                f24846a = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(12:232|155|(2:157|(4:160|229|161|162))(6:163|222|164|(1:166)(1:172)|167|(10:169|(2:174|181)(1:173)|231|182|(2:184|186)(1:185)|187|(4:189|236|190|191)(1:195)|(4:226|197|(2:199|206)(4:200|224|201|202)|(2:210|(2:212|213)))|208|209)(1:175))|159|231|182|(0)(0)|187|(0)(0)|(0)|208|209) */
            /* JADX WARN: Removed duplicated region for block: B:184:0x053c  */
            /* JADX WARN: Removed duplicated region for block: B:185:0x053d  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x0546 A[Catch: Exception -> 0x0587, TRY_LEAVE, TryCatch #5 {Exception -> 0x0587, blocks: (B:182:0x050d, B:189:0x0546, B:191:0x0578, B:193:0x0580, B:194:0x0586, B:190:0x0550), top: B:231:0x050d, inners: #8 }] */
            /* JADX WARN: Removed duplicated region for block: B:195:0x0587  */
            /* JADX WARN: Removed duplicated region for block: B:226:0x058a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] d(int r34, int r35) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1744
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass1.d(int, int):java.lang.Object[]");
            }

            /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void i(char r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 451
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass1.i(char, int, int, java.lang.Object[]):void");
            }

            static void init$0() {
                $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
                $$b = PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            }

            static void init$1() {
                $$c = new byte[]{60, 66, -100, 104};
                $$d = 204;
            }

            private static void k(int v2, short v3, int v4, Object[] v5) {
                /*
                    int r0 = r10 * 4
                    int r7 = r0 + 100
                    byte[] r6 = o.er.d.AnonymousClass1.$$a
                    int r5 = r8 + 4
                    int r4 = r9 * 4
                    int r0 = r4 + 1
                    byte[] r3 = new byte[r0]
                    r2 = 0
                    if (r6 != 0) goto L2a
                    r1 = r2
                    r0 = r5
                L13:
                    int r5 = r5 + r7
                    r7 = r5
                    r5 = r0
                L16:
                    byte r0 = (byte) r7
                    r3[r1] = r0
                    if (r1 != r4) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    r11[r2] = r0
                    return
                L23:
                    int r0 = r5 + 1
                    int r1 = r1 + 1
                    r5 = r6[r0]
                    goto L13
                L2a:
                    r1 = r2
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass1.k(int, short, int, java.lang.Object[]):void");
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(c.e eVar) {
                int i22 = 2 % 2;
                int i3 = f24852j + 99;
                f24846a = i3 % 128;
                int i4 = i3 % 2;
                b(eVar);
                if (i4 != 0) {
                    int i5 = 1 / 0;
                }
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) {
                int i22 = 2 % 2;
                int i3 = f24852j + 37;
                f24846a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 85 / 0;
                }
            }
        });
        int i3 = f24840m + 31;
        f24842o = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void a(Context context, OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24840m + 99;
        f24842o = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f25009a};
        int i5 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i5;
        int i6 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i6;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i7 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i7;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr, i6, iElapsedRealtime, i7, i5)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            y((short) TextUtils.getOffsetAfter("", 0), 1442845808 - View.getDefaultSize(0, 0), (-1572756573) - (ViewConfiguration.getLongPressTimeout() >> 16), (-63) - ExpandableListView.getPackedPositionGroup(0L), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr2);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr2[0]).intern());
        }
        if (!c()) {
            throw new WalletValidationException(WalletValidationErrorCode.WrongState, b());
        }
        d(context, operationCallback, false);
        int i8 = f24842o + 121;
        f24840m = i8 % 128;
        int i9 = i8 % 2;
    }

    public abstract String b();

    public abstract T b(Context context);

    public final void b(Context context, OperationCallback<Boolean> operationCallback) throws WalletValidationException {
        int i2 = f24831b * 1411408100;
        f24831b = i2;
        int iNextInt = new Random().nextInt(837508811);
        a(-1035223737, i2, Process.myTid(), new Object[]{this, context, operationCallback}, 1035223737, iNextInt, Process.myTid());
    }

    @Deprecated
    public final AndroidActivityResultCallback c(Activity activity, OperationCallback<Void> operationCallback) {
        int i2 = 2 % 2;
        o.ea.j jVar = new o.ea.j();
        b(activity).d(new c.a<c.e>() { // from class: o.er.d.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: c */
            private static int f24855c = 0;

            /* JADX INFO: renamed from: f */
            private static byte[] f24856f = null;

            /* JADX INFO: renamed from: g */
            private static int f24857g = 0;

            /* JADX INFO: renamed from: h */
            private static int f24858h = 0;

            /* JADX INFO: renamed from: i */
            private static short[] f24859i = null;

            /* JADX INFO: renamed from: j */
            private static int f24860j = 0;

            /* JADX INFO: renamed from: k */
            public static int f24861k = 0;

            /* JADX INFO: renamed from: l */
            public static int f24862l = 0;

            /* JADX INFO: renamed from: m */
            public static int f24863m = 0;

            /* JADX INFO: renamed from: o */
            private static int f24864o = 0;

            /* JADX INFO: renamed from: a */
            final /* synthetic */ OperationCallback f24865a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ o.ea.j f24866b;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ Activity f24868e;

            /* JADX INFO: renamed from: o.er.d$2$4 */
            public class AnonymousClass4 implements c.a<Object> {
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final int $$d = 0;
                private static int $10 = 0;
                private static int $11 = 0;
                public static int A = 0;
                public static int B = 0;
                public static int C = 0;
                public static int D = 0;
                public static int E = 0;
                public static int F = 0;
                public static int G = 0;
                public static int H = 0;
                public static int I = 0;
                public static int J = 0;
                public static int K = 0;
                public static int L = 0;
                public static int M = 0;
                public static int N = 0;
                public static int O = 0;
                public static int P = 0;
                public static int Q = 0;
                public static int R = 0;
                public static int S = 0;
                public static int T = 0;
                public static int U = 0;
                public static int V = 0;
                public static int W = 0;
                public static int X = 0;
                public static int Y = 0;
                public static int Z = 0;

                /* JADX INFO: renamed from: a */
                private static int f24869a = 0;
                public static int aa = 0;
                public static int ab = 0;

                /* JADX INFO: renamed from: c */
                private static int f24870c = 0;

                /* JADX INFO: renamed from: d */
                private static byte[] f24871d = null;

                /* JADX INFO: renamed from: e */
                private static int f24872e = 0;

                /* JADX INFO: renamed from: f */
                private static int f24873f = 0;

                /* JADX INFO: renamed from: g */
                private static short[] f24874g = null;

                /* JADX INFO: renamed from: h */
                public static int f24875h = 0;

                /* JADX INFO: renamed from: i */
                private static int f24876i = 0;

                /* JADX INFO: renamed from: j */
                private static long f24877j = 0;

                /* JADX INFO: renamed from: k */
                public static int f24878k = 0;

                /* JADX INFO: renamed from: l */
                public static int f24879l = 0;

                /* JADX INFO: renamed from: m */
                public static int f24880m = 0;

                /* JADX INFO: renamed from: n */
                public static int f24881n = 0;

                /* JADX INFO: renamed from: o */
                public static int f24882o = 0;

                /* JADX INFO: renamed from: p */
                public static int f24883p = 0;

                /* JADX INFO: renamed from: q */
                public static int f24884q = 0;

                /* JADX INFO: renamed from: r */
                public static int f24885r = 0;

                /* JADX INFO: renamed from: s */
                public static int f24886s = 0;

                /* JADX INFO: renamed from: t */
                public static int f24887t = 0;

                /* JADX INFO: renamed from: u */
                public static int f24888u = 0;

                /* JADX INFO: renamed from: v */
                public static int f24889v = 0;

                /* JADX INFO: renamed from: w */
                public static int f24890w = 0;

                /* JADX INFO: renamed from: x */
                public static int f24891x = 0;

                /* JADX INFO: renamed from: y */
                public static int f24892y = 0;

                /* JADX INFO: renamed from: z */
                public static int f24893z = 0;

                private static String $$e(int v2, byte v3, int v4) {
                    /*
                        int r0 = r8 * 2
                        int r8 = 1 - r0
                        int r0 = r10 * 2
                        int r7 = 3 - r0
                        byte[] r6 = o.er.d.AnonymousClass2.AnonymousClass4.$$c
                        int r0 = 114 - r9
                        byte[] r5 = new byte[r8]
                        r4 = 0
                        if (r6 != 0) goto L2b
                        r1 = r8
                        r2 = r7
                        r3 = r4
                    L14:
                        int r0 = -r1
                        int r7 = r7 + r0
                        r0 = r7
                        r7 = r2
                    L18:
                        int r2 = r7 + 1
                        byte r1 = (byte) r0
                        r5[r3] = r1
                        int r3 = r3 + 1
                        if (r3 != r8) goto L27
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        return r0
                    L27:
                        r1 = r6[r2]
                        r7 = r0
                        goto L14
                    L2b:
                        r3 = r4
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.AnonymousClass4.$$e(int, byte, int):java.lang.String");
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    ab = 293210089;
                    aa = 522909786;
                    Z = -967275777;
                    Y = 408235578;
                    X = -1314574856;
                    W = 1749180554;
                    V = 1682513726;
                    U = -184443793;
                    T = 863666394;
                    S = -2145444700;
                    R = 606641137;
                    Q = 1914063032;
                    P = -947800270;
                    O = -358808596;
                    N = -1822945934;
                    M = 564244735;
                    L = -1510271880;
                    K = 2024382019;
                    J = -605034629;
                    I = -1132666707;
                    H = -821480357;
                    G = -488630647;
                    F = -553910669;
                    E = 826423998;
                    D = 658566884;
                    C = 1214461040;
                    B = -2012550439;
                    A = 2142103839;
                    f24893z = 1904395441;
                    f24892y = -27297133;
                    f24891x = 474401505;
                    f24890w = -336990909;
                    f24889v = -1916054705;
                    f24888u = 1834322622;
                    f24887t = -1893062882;
                    f24886s = 1077874875;
                    f24885r = 2061320819;
                    f24884q = 1114163379;
                    f24883p = -1516046180;
                    f24882o = -1861411244;
                    f24881n = -445287052;
                    f24880m = 1180629656;
                    f24879l = -1417930749;
                    f24878k = -117349553;
                    f24875h = 1456153715;
                    init$0();
                    f24876i = 0;
                    f24873f = 1;
                    f24872e = -1063490180;
                    f24870c = 1150422424;
                    f24869a = -1022853115;
                    f24871d = new byte[]{123, -128, 98, -103, 96, -127, 98, -118, 73, MessagePack.Code.UINT8, -114, -113, -124, 2, Ascii.DC4, 112, 96, -115, Ascii.SUB, 0, -114, -124, Ascii.US, 86, MessagePack.Code.FIXEXT2, 96, 33, 96, Ascii.FS, Ascii.DC4, -115, MessagePack.Code.UINT16, MessagePack.Code.FIXEXT4, Ascii.DC4, -124, -115, 91, 93, -119, 121, -120, 67, 89, -121, -115, 90, -97, 73, 118, 89, -119, 64, -124, MessagePack.Code.BIN16, 0, 121, 108, 121, 85, 93, -120, MessagePack.Code.EXT16, Ascii.US, 93, 124, 95, 59, 95, 66, 39, 121, 80, 50, 107, 80, 81, 116, 93, 64, 117, -99, -16, 119, -126, 35, -119, 77, 71, MessagePack.Code.BIN16, 59, -117, 49, 125, -109, -23, -105, -102, 124, 100, -113, -92, -116, -66, 96, -66, 118, -21, MessagePack.Code.FIXEXT16, 52, -24, -84, 99, -24, MessagePack.Code.INT64, Utf8.REPLACEMENT_BYTE, -24, MessagePack.Code.FIXEXT1, 60, MessagePack.Code.INT8, 33, -22, 120, MessagePack.Code.INT32, -97, Ascii.NAK, -26, 89, -10, 86, -21, 92, 116, -98, 97, -117, 97, -104, -103, 86, -107, 106, -107, -125, -107, 84, 96, MessagePack.Code.MAP16, 96, 91, 118, MessagePack.Code.ARRAY16, 37, 59, MessagePack.Code.EXT32, 37, 100, -125, 41, -77, 53, MessagePack.Code.INT16, 19, MessagePack.Code.TRUE, 41, MessagePack.Code.UINT8, 121, -67, MessagePack.Code.ARRAY16, -66, -76, MessagePack.Code.UINT64, MessagePack.Code.UINT64, -104, -85, 123, -98, MessagePack.Code.UINT64, -110, -99, MessagePack.Code.UINT8, MessagePack.Code.NEVER_USED, -110, MessagePack.Code.BIN16, -98, MessagePack.Code.UINT32, 119, -13, 64, Ascii.SI, -10, 64, Ascii.SO, 89, -7, 65, 66, Ascii.SI, 94, -13, 67, 116, -14, MessagePack.Code.FIXEXT16, 8, MessagePack.Code.NIL, MessagePack.Code.TRUE, Ascii.CR, -29, MessagePack.Code.MAP16, MessagePack.Code.ARRAY32, -16, MessagePack.Code.NEVER_USED, Ascii.FF, MessagePack.Code.ARRAY16, 122, 0, 92, 66, 118, 1, 75, 48, 64, 57, 93, -97, 123, -28, -22, Ascii.RS, -81, -31, MessagePack.Code.FIXEXT16, -24, MessagePack.Code.FIXEXT8, -21, 37, 122, 80, 86, -123, 36, -83, 103, 124, 108, 117, 81, 19, 123, Utf8.REPLACEMENT_BYTE, Base64.padSymbol, 81, -25, 33, 57, -84, 59, -107, -3, 125, -74, -80, -24, 119, 98, 51, 19, -24, 117, 8, Ascii.SI, -14, 1, -79, MessagePack.Code.TRUE, Ascii.SO, MessagePack.Code.MAP32, -2, Ascii.US, -118, MessagePack.Code.BIN8, 123, -91, MessagePack.Code.INT8, -81, MessagePack.Code.STR8, -84, -82, MessagePack.Code.INT16, MessagePack.Code.ARRAY32, -66, MessagePack.Code.BIN8, 127, 127, 51, 125, 52, 127, 53, -113, 104, 86, 106, 104, 106, 106, -115, 111, 104, 103, 44, -67, 98, 110, 47, -94, 107, 82, 126, 107, 87, 127, 118, 42, -26, -28, MessagePack.Code.FIXEXT16, 40, MessagePack.Code.NEGFIXINT_PREFIX, 45, Ascii.ETB, -24, -18, Base64.padSymbol, Ascii.RS, -8, 46, MessagePack.Code.FIXEXT4, 113, 120, -76, -74, -99, MessagePack.Code.NEGFIXINT_PREFIX, 122, -94, -87, -89, -70, -20, 121, -100, MessagePack.Code.FLOAT32, -84, -28, 113, MessagePack.Code.EXT16, -127, 80, 76, -124, -126, 94, 92, 48, -125, 85, 114, 66, -117, 95, Ascii.EM, 118, -85, -25, -31, 114, 19, -83, -101, 36, -86, MessagePack.Code.INT8, -101, -21, -126, -26, 36, -119, Ascii.DC2, 116, 121, 108, -76, 32, 110, 121, 102, -72, 33, 95, -95, 44, 110, 111, -73, 59, 97, 104, 120, 83, 119, -75, 117, 102, -94, MessagePack.Code.FIXSTR_PREFIX, 79, -18, 103, -87, 86, -90, 95, -93, -3, 124, 48, 120, 99, 114, MessagePack.Code.UINT64, 127, -85, -110, -91, -110, -82, 106, 125, -101, -82, -70, -98};
                    f24877j = -6088389423577906933L;
                }

                AnonymousClass4() {
                }

                private static void ac(short v2, byte v3, int v4, Object[] v5) {
                    /*
                        int r0 = r7 + 97
                        int r1 = r8 * 3
                        int r8 = 4 - r1
                        byte[] r7 = o.er.d.AnonymousClass2.AnonymousClass4.$$a
                        int r6 = r9 * 3
                        int r1 = r6 + 1
                        byte[] r5 = new byte[r1]
                        r4 = 0
                        if (r7 != 0) goto L2b
                        r3 = r6
                        r2 = r4
                    L13:
                        int r0 = -r0
                        int r0 = r0 + r3
                        int r8 = r8 + 1
                    L17:
                        byte r1 = (byte) r0
                        r5[r2] = r1
                        if (r2 != r6) goto L24
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        r10[r4] = r0
                        return
                    L24:
                        r1 = r7[r8]
                        int r2 = r2 + 1
                        r3 = r0
                        r0 = r1
                        goto L13
                    L2b:
                        r2 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.AnonymousClass4.ac(short, byte, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:110:0x01b0 A[PHI: r4
  0x01b0: PHI (r4v13 int) = (r4v3 int), (r4v16 int) binds: [B:113:0x01c6, B:109:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:115:0x01c9 A[PHI: r4
  0x01c9: PHI (r4v4 int) = (r4v3 int), (r4v16 int) binds: [B:113:0x01c6, B:109:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void ad(short r25, int r26, int r27, int r28, byte r29, java.lang.Object[] r30) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 720
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.AnonymousClass4.ad(short, int, int, int, byte, java.lang.Object[]):void");
                }

                private static void ae(String str, int i2, Object[] objArr) throws Throwable {
                    Object obj;
                    String str2 = str;
                    int i3 = 2 % 2;
                    if (str2 != null) {
                        char[] charArray = str2.toCharArray();
                        int i4 = $11 + 21;
                        $10 = i4 % 128;
                        int i5 = i4 % 2;
                        obj = charArray;
                    } else {
                        obj = str2;
                    }
                    o.a.k kVar = new o.a.k();
                    char[] cArrC = o.a.k.c(f24877j ^ (-5882309809461882246L), (char[]) obj, i2);
                    kVar.f19939c = 4;
                    while (kVar.f19939c < cArrC.length) {
                        int i6 = $11 + 21;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        kVar.f19938a = kVar.f19939c - 4;
                        int i8 = kVar.f19939c;
                        try {
                            Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f24877j)};
                            Object objA = o.d.d.a(-1093976004);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                objA = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 230, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51005), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9, 1749983833, false, $$e(b2, (byte) (7 | b2), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                            }
                            cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {kVar, kVar};
                            Object objA2 = o.d.d.a(-912105096);
                            if (objA2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objA2 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 675, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) + 12, 522683165, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
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
                    objArr[0] = new String(cArrC, 4, cArrC.length - 4);
                }

                /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                    java.util.NoSuchElementException
                    	at java.base/java.util.TreeMap.key(Unknown Source)
                    	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                    */
                public static java.lang.Object[] e$4a7e738d(int r45, java.lang.Object r46) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 18086
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.AnonymousClass4.e$4a7e738d(int, java.lang.Object):java.lang.Object[]");
                }

                static void init$0() {
                    $$a = new byte[]{35, 9, MessagePack.Code.STR32, -91};
                    $$b = 11;
                }

                static void init$1() {
                    $$c = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
                    $$d = 42;
                }

                @Override // o.es.c.a
                public final void a(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = f24876i + 73;
                    f24873f = i3 % 128;
                    int i4 = i3 % 2;
                    operationCallback.onSuccess(null);
                    int i5 = f24873f + 65;
                    f24876i = i5 % 128;
                    int i6 = i5 % 2;
                }

                @Override // o.es.c.a
                public final void d(o.by.c cVar) {
                    int i2 = 2 % 2;
                    int i3 = f24876i + 53;
                    f24873f = i3 % 128;
                    if (i3 % 2 != 0) {
                        operationCallback.onError(cVar.a());
                    } else {
                        operationCallback.onError(cVar.a());
                        throw null;
                    }
                }
            }

            private static String $$e(short v2, int v3, byte v4) {
                /*
                    int r7 = r7 * 4
                    int r1 = r7 + 1
                    int r0 = r8 * 4
                    int r0 = 3 - r0
                    int r6 = r6 + 103
                    byte[] r5 = o.er.d.AnonymousClass2.$$c
                    byte[] r4 = new byte[r1]
                    r3 = 0
                    if (r5 != 0) goto L27
                    r2 = r0
                    r1 = r3
                L13:
                    int r6 = r6 + r0
                    r0 = r2
                L15:
                    int r2 = r0 + 1
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    if (r1 != r7) goto L22
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L22:
                    int r1 = r1 + 1
                    r0 = r5[r2]
                    goto L13
                L27:
                    r1 = r3
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.$$e(short, int, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f24863m = 1407037253;
                f24862l = 1084414753;
                f24861k = -125436321;
                init$0();
                f24858h = 0;
                f24864o = 1;
                f24855c = -416120942;
                f24860j = 1150422526;
                f24857g = 1712166891;
                f24856f = new byte[]{45, 114, 124, -100, 115, 122, -115, 114, -95, 92, -128, 115, -115, 127, -98, 112, -84, 92, -121, Ascii.DC2, -128, 115, -115, 127, -98, 112, -84, 95, -114, -92, 82, 116, -120, 120, -122, -123, 103, 16, 127, -98, 112, -84, -101, 54, -119, MessagePack.Code.UINT8, 71, 118, 119, 112, -125, 123, -128, 56, -128, -113, -113, 98, 115, -104, 102, -117, -124, 126, -115, 112, -97, -71, 69, 116, -120, -117, -113, 98, 115, MessagePack.Code.EXT16, 69, 127, -98, 112, -116, -72, 78, -118, 122, 113, -128, 119, -79, 49, 119, -117, MessagePack.Code.EXT32, Ascii.GS, -116, -116, 33, 114, 116, -121, -116, 126, -124, -117, 119, -113, -113, 98, 115, -125, -70, 78, -118, 122, 113, -128, 119, -79, 49, 119, -117, MessagePack.Code.EXT32, 65, 121, 112, -113, MessagePack.Code.UINT8, 3, 60, 114, -99, 117, 116, -120, -117, -113, 98, 115, MessagePack.Code.EXT16, 69, 116, -120, -117, -113, 98, 115, MessagePack.Code.EXT16, 69, 127, -98, 112, -116, -72, 78, -118, 122, 113, -128, 119, -79, 49, 119, -117, MessagePack.Code.EXT32};
            }

            AnonymousClass2(OperationCallback operationCallback2, Activity activity2, o.ea.j jVar2) {
                operationCallback = operationCallback2;
                activity = activity2;
                jVar = jVar2;
            }

            private void b(c.e eVar) {
                int i22 = 2 % 2;
                int i3 = f24864o + 15;
                f24858h = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = AnonymousClass7.f24964b[eVar.ordinal()];
                    throw null;
                }
                int i5 = AnonymousClass7.f24964b[eVar.ordinal()];
                if (i5 == 1) {
                    operationCallback.onSuccess(null);
                    return;
                }
                if (i5 != 2) {
                    if (i5 != 3) {
                        return;
                    }
                    operationCallback.onError(new o.by.c(AntelopErrorCode.GooglePayWalletNotAvailable).a());
                } else {
                    d.this.b(activity).d(activity, new AnonymousClass4(), jVar);
                    int i6 = f24858h + 101;
                    f24864o = i6 % 128;
                    int i7 = i6 % 2;
                }
            }

            /* JADX WARN: Can't wrap try/catch for region: R(12:118|(2:170|119)|(1:121)(4:122|171|123|(9:125|131|177|132|(1:134)(7:135|178|136|137|(4:175|143|(2:145|146)(4:154|173|155|156)|(2:(1:149)(1:153)|(2:151|152)))|160|161)|141|(0)|160|161)(1:126))|130|131|177|132|(0)(0)|141|(0)|160|161) */
            /* JADX WARN: Removed duplicated region for block: B:134:0x056a  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x056b A[Catch: Exception -> 0x05c7, TRY_LEAVE, TryCatch #5 {Exception -> 0x05c7, blocks: (B:132:0x0522, B:135:0x056b, B:137:0x05b8, B:139:0x05c0, B:140:0x05c6, B:136:0x0575), top: B:177:0x0522, inners: #6 }] */
            /* JADX WARN: Removed duplicated region for block: B:175:0x05ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] e(int r29, int r30) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1912
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.e(int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
                $$b = 31;
            }

            static void init$1() {
                $$c = new byte[]{94, -66, 120, 126};
                $$d = 230;
            }

            /* JADX WARN: Removed duplicated region for block: B:124:0x01b7 A[PHI: r4
  0x01b7: PHI (r4v16 int) = (r4v3 int), (r4v19 int) binds: [B:127:0x01cd, B:123:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:129:0x01d0 A[PHI: r4
  0x01d0: PHI (r4v4 int) = (r4v3 int), (r4v19 int) binds: [B:127:0x01cd, B:123:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void n(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 749
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.n(short, int, int, int, byte, java.lang.Object[]):void");
            }

            private static void p(short v2, short v3, int v4, Object[] v5) {
                /*
                    int r7 = r9 + 4
                    byte[] r6 = o.er.d.AnonymousClass2.$$a
                    int r0 = r8 * 3
                    int r5 = r0 + 1
                    int r0 = r10 * 2
                    int r4 = 100 - r0
                    byte[] r3 = new byte[r5]
                    r2 = 0
                    if (r6 != 0) goto L29
                    r0 = r4
                    r1 = r2
                    r4 = r5
                L14:
                    int r4 = r4 + r0
                L15:
                    byte r0 = (byte) r4
                    r3[r1] = r0
                    int r1 = r1 + 1
                    if (r1 != r5) goto L24
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    r11[r2] = r0
                    return
                L24:
                    int r7 = r7 + 1
                    r0 = r6[r7]
                    goto L14
                L29:
                    r1 = r2
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass2.p(short, short, int, java.lang.Object[]):void");
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(c.e eVar) {
                int i22 = 2 % 2;
                int i3 = f24858h + 23;
                f24864o = i3 % 128;
                int i4 = i3 % 2;
                b(eVar);
                if (i4 == 0) {
                    int i5 = 27 / 0;
                }
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) {
                int i22 = 2 % 2;
                int i3 = f24858h + 51;
                f24864o = i3 % 128;
                if (i3 % 2 != 0) {
                    operationCallback.onError(cVar.a());
                } else {
                    operationCallback.onError(cVar.a());
                    throw null;
                }
            }
        });
        AndroidActivityResultCallback androidActivityResultCallbackB = jVar2.b();
        int i3 = f24842o + 91;
        f24840m = i3 % 128;
        if (i3 % 2 == 0) {
            return androidActivityResultCallbackB;
        }
        throw null;
    }

    public final void c(Context context, OperationCallback<DigitalCardServiceStatus> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24840m + 19;
            f24842o = i3 % 128;
            int i4 = i3 % 2;
            String strA = a();
            Object[] objArr = new Object[1];
            y((short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1442845800 - Color.alpha(0), (-1572756537) + TextUtils.getOffsetBefore("", 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 59, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr);
            o.ea.f.c(strA, ((String) objArr[0]).intern());
            int i5 = f24840m + 39;
            f24842o = i5 % 128;
            int i6 = i5 % 2;
        }
        b(context).d(new c.a<c.e>() { // from class: o.er.d.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: b */
            private static int f24950b = 0;

            /* JADX INFO: renamed from: d */
            private static int f24951d = 0;

            /* JADX INFO: renamed from: e */
            private static int f24952e = 0;

            /* JADX INFO: renamed from: g */
            private static byte[] f24953g = null;

            /* JADX INFO: renamed from: h */
            private static short[] f24954h = null;

            /* JADX INFO: renamed from: i */
            private static int f24955i = 0;

            /* JADX INFO: renamed from: j */
            private static int f24956j = 0;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ OperationCallback f24958c;

            private static String $$c(int v2, short v3, short v4) {
                /*
                    int r3 = r8 * 4
                    int r2 = 1 - r3
                    int r8 = 104 - r7
                    int r0 = r6 * 2
                    int r1 = 3 - r0
                    byte[] r7 = o.er.d.AnonymousClass5.$$a
                    byte[] r6 = new byte[r2]
                    r5 = 0
                    int r4 = 0 - r3
                    if (r7 != 0) goto L2c
                    r3 = r5
                    r0 = r1
                L15:
                    int r1 = -r1
                    int r1 = r1 + r8
                    r2 = r3
                    r8 = r1
                    r1 = r0
                L1a:
                    int r0 = r1 + 1
                    byte r1 = (byte) r8
                    r6[r2] = r1
                    int r3 = r2 + 1
                    if (r2 != r4) goto L29
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    return r0
                L29:
                    r1 = r7[r0]
                    goto L15
                L2c:
                    r2 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass5.$$c(int, short, short):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f24956j = 0;
                f24955i = 1;
                f24951d = -612531271;
                f24952e = 1150422472;
                f24950b = -1047669973;
                f24953g = new byte[]{81, 3, 79, MessagePack.Code.FIXEXT16, 43, 36, 54, Ascii.CAN, 36, 118, Ascii.SYN, 56, MessagePack.Code.FIXEXT16, 37, 59, 39, 37, Ascii.ESC, 71, 0, 42, 122, Ascii.SYN, 56, MessagePack.Code.FIXEXT16, 43, 36, 54, Ascii.CAN, 68, 10, 58, 43, 67, -105, -103, -102, MessagePack.Code.EXT32, 99, -101, -21, -121, -87, 73, -104, -107, -89, -119, -75, 123, -85, -104};
            }

            AnonymousClass5(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            private void c(c.e eVar) throws Throwable {
                int i22 = 2 % 2;
                if (o.ea.f.a()) {
                    String strA2 = d.this.a();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    f((short) (88 - (ViewConfiguration.getTouchSlop() >> 8)), 1611690444 + (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2061509057 - Color.argb(0, 0, 0, 0), (-16777286) - Color.rgb(0, 0, 0), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                    o.ea.f.c(strA2, sb.append(((String) objArr2[0]).intern()).append(eVar).toString());
                }
                int i32 = AnonymousClass7.f24964b[eVar.ordinal()];
                if (i32 != 1) {
                    if (i32 != 2) {
                        operationCallback.onSuccess(DigitalCardServiceStatus.NotSupportedByDevice);
                        return;
                    } else if (d.this.c()) {
                        operationCallback.onSuccess(DigitalCardServiceStatus.NotConfiguredByUser);
                        return;
                    } else {
                        operationCallback.onSuccess(DigitalCardServiceStatus.Disabled);
                        return;
                    }
                }
                if (!(!d.this.c())) {
                    int i42 = f24955i + 91;
                    f24956j = i42 % 128;
                    int i52 = i42 % 2;
                    operationCallback.onSuccess(DigitalCardServiceStatus.Active);
                    return;
                }
                operationCallback.onSuccess(DigitalCardServiceStatus.Disabled);
                int i62 = f24956j + 111;
                f24955i = i62 % 128;
                int i7 = i62 % 2;
            }

            private static void f(short s2, int i22, int i32, int i42, byte b2, Object[] objArr2) throws Throwable {
                boolean z2;
                long j2;
                int i52;
                int length;
                byte[] bArr;
                int i62;
                int i7 = 2 % 2;
                o.a.j jVar = new o.a.j();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr22 = {Integer.valueOf(i42), Integer.valueOf(f24952e)};
                    Object objA = o.d.d.a(-727631768);
                    long j3 = 0;
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(TextUtils.getOffsetAfter("", 0) + 238, (char) (44531 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, 35969549, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr22)).intValue();
                    if (iIntValue == -1) {
                        int i8 = $11 + 51;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        byte[] bArr2 = f24953g;
                        char c2 = '0';
                        if (bArr2 != null) {
                            int i10 = $11 + 21;
                            $10 = i10 % 128;
                            if (i10 % 2 != 0) {
                                length = bArr2.length;
                                bArr = new byte[length];
                                i62 = 1;
                            } else {
                                length = bArr2.length;
                                bArr = new byte[length];
                                i62 = 0;
                            }
                            while (i62 < length) {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i62])};
                                Object objA2 = o.d.d.a(-1239398195);
                                if (objA2 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = (byte) (b5 + 1);
                                    objA2 = o.d.d.a(ExpandableListView.getPackedPositionChild(j3) + 629, (char) (28648 - TextUtils.indexOf("", c2, 0, 0)), View.combineMeasuredStates(0, 0) + 11, 1621469864, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                                }
                                bArr[i62] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                                i62++;
                                j3 = 0;
                                c2 = '0';
                            }
                            bArr2 = bArr;
                        }
                        if (bArr2 != null) {
                            byte[] bArr3 = f24953g;
                            Object[] objArr4 = {Integer.valueOf(i22), Integer.valueOf(f24951d)};
                            Object objA3 = o.d.d.a(-727631768);
                            if (objA3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objA3 = o.d.d.a(237 - TextUtils.lastIndexOf("", '0', 0), (char) (44531 - (ViewConfiguration.getPressedStateDuration() >> 16)), ExpandableListView.getPackedPositionType(0L) + 11, 35969549, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f24952e) ^ (-7649639543924978291L))));
                            j2 = -7649639543924978291L;
                        } else {
                            j2 = -7649639543924978291L;
                            iIntValue = (short) (((short) (((long) f24954h[i22 + ((int) (((long) f24951d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f24952e) ^ (-7649639543924978291L))));
                        }
                    } else {
                        j2 = -7649639543924978291L;
                    }
                    if (iIntValue > 0) {
                        int i11 = ((i22 + iIntValue) - 2) + ((int) (((long) f24951d) ^ j2));
                        if (z2) {
                            int i12 = $10 + 69;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            i52 = 1;
                        } else {
                            i52 = 0;
                        }
                        jVar.f19936d = i11 + i52;
                        Object[] objArr5 = {jVar, Integer.valueOf(i32), Integer.valueOf(f24950b), sb};
                        Object objA4 = o.d.d.a(1819197256);
                        if (objA4 == null) {
                            objA4 = o.d.d.a(ViewConfiguration.getEdgeSlop() >> 16, (char) (5357 - ((byte) KeyEvent.getModifierMetaStateMask())), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        byte[] bArr4 = f24953g;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i14 = 0; i14 < length2; i14++) {
                                bArr5[i14] = (byte) (((long) bArr4[i14]) ^ (-7649639543924978291L));
                            }
                            bArr4 = bArr5;
                        }
                        boolean z3 = bArr4 != null;
                        jVar.f19934b = 1;
                        while (jVar.f19934b < iIntValue) {
                            if (z3) {
                                byte[] bArr6 = f24953g;
                                jVar.f19936d = jVar.f19936d - 1;
                                jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                            } else {
                                short[] sArr = f24954h;
                                jVar.f19936d = jVar.f19936d - 1;
                                jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                            }
                            sb.append(jVar.f19937e);
                            jVar.f19935c = jVar.f19937e;
                            jVar.f19934b++;
                        }
                    }
                    objArr2[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            static void init$0() {
                $$a = new byte[]{Ascii.EM, -93, 95, -122};
                $$b = 60;
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(c.e eVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24956j + 49;
                f24955i = i32 % 128;
                int i42 = i32 % 2;
                c(eVar);
                int i52 = f24956j + 35;
                f24955i = i52 % 128;
                int i62 = i52 % 2;
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24956j + 53;
                f24955i = i32 % 128;
                Object obj = null;
                if (i32 % 2 == 0) {
                    o.ea.f.a();
                    obj.hashCode();
                    throw null;
                }
                if (o.ea.f.a()) {
                    String strA2 = d.this.a();
                    Object[] objArr2 = new Object[1];
                    f((short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 24), 1611690477 - View.resolveSizeAndState(0, 0, 0), 2061509057 - Color.red(0), Color.rgb(0, 0, 0) + 16777146, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                    o.ea.f.c(strA2, ((String) objArr2[0]).intern());
                    int i42 = f24956j + 113;
                    f24955i = i42 % 128;
                    int i52 = i42 % 2;
                }
                operationCallback.onError(cVar.a());
                int i62 = f24956j + 99;
                f24955i = i62 % 128;
                if (i62 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
    }

    @Override // o.er.h
    public final /* bridge */ /* synthetic */ boolean c() {
        int i2 = 2 % 2;
        int i3 = f24840m + 27;
        f24842o = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = super.c();
        int i5 = f24842o + 55;
        f24840m = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    public abstract i.c d();

    public final void d(Context context, OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        a(context, new OperationCallback<Boolean>() { // from class: o.er.d.8

            /* JADX INFO: renamed from: b */
            private static int f24966b = 1;

            /* JADX INFO: renamed from: d */
            private static int f24967d = 0;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ OperationCallback f24969e;

            AnonymousClass8(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            private void a(Boolean bool) {
                int i22 = 2 % 2;
                int i3 = f24966b + 35;
                f24967d = i3 % 128;
                int i4 = i3 % 2;
                OperationCallback operationCallback2 = operationCallback;
                boolean z2 = true;
                if (!(!bool.booleanValue())) {
                    int i5 = f24966b + 43;
                    f24967d = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 % 5;
                    }
                    z2 = false;
                } else {
                    int i7 = f24966b + 95;
                    f24967d = i7 % 128;
                    int i8 = i7 % 2;
                }
                operationCallback2.onSuccess(Boolean.valueOf(z2));
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final void onError(AntelopError antelopError) {
                int i22 = 2 % 2;
                int i3 = f24967d;
                int i4 = (i3 ^ 11) + (((-1) - (((-1) - i3) | ((-1) - 11))) << 1);
                f24966b = i4 % 128;
                int i5 = i4 % 2;
                operationCallback.onError(antelopError);
                int i6 = f24966b;
                int i7 = (i6 ^ 63) + ((i6 & 63) << 1);
                f24967d = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final /* synthetic */ void onSuccess(Boolean bool) {
                int i22 = 2 % 2;
                int i3 = f24966b;
                int i4 = ((51 | i3) << 1) - (i3 ^ 51);
                f24967d = i4 % 128;
                int i5 = i4 % 2;
                a(bool);
                int i6 = f24966b + 9;
                f24967d = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i3 = f24842o + 65;
        f24840m = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void d(Context context, OperationCallback<Boolean> operationCallback, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24840m + 97;
        f24842o = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            String strA = a();
            Object[] objArr = new Object[1];
            z("癡㇢凉ꂢ栞᎑\udbd7草䪄\uf20c분旲ⵇ풨鰆䞞\u0fe1", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18328, objArr);
            o.ea.f.c(strA, ((String) objArr[0]).intern());
        }
        o.es.c cVarB = b(context);
        cVarB.d(new AnonymousClass4(operationCallback, cVarB, o.en.b.c().j(), z2, context));
        int i5 = f24840m + 55;
        f24842o = i5 % 128;
        int i6 = i5 % 2;
    }

    public abstract AntelopErrorCode e();

    public final void e(Context context, OperationCallback<Boolean> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        Object[] objArr = {this, context, new OperationCallback<Boolean>() { // from class: o.er.d.6

            /* JADX INFO: renamed from: d */
            private static int f24959d = 0;

            /* JADX INFO: renamed from: e */
            private static int f24960e = 1;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ OperationCallback f24961b;

            AnonymousClass6(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            private void a(Boolean v2) {
                /*
                    this = this;
                    r7 = 2
                    int r0 = r7 % r7
                    int r0 = o.er.d.AnonymousClass6.f24959d
                    int r1 = r0 + 35
                    int r0 = r1 % 128
                    o.er.d.AnonymousClass6.f24960e = r0
                    int r1 = r1 % r7
                    r6 = 0
                    r5 = 1
                    if (r1 != 0) goto L4a
                    fr.antelop.sdk.util.OperationCallback r4 = r2
                    boolean r1 = r9.booleanValue()
                    r0 = 98
                    int r0 = r0 / r6
                    if (r1 == r5) goto L53
                L1b:
                    int r3 = o.er.d.AnonymousClass6.f24960e
                    int r1 = r3 + 111
                    int r0 = r1 % 128
                    o.er.d.AnonymousClass6.f24959d = r0
                    int r1 = r1 % r7
                    if (r1 == 0) goto L48
                L26:
                    r2 = r3 ^ 9
                    r1 = 9
                    int r0 = r3 + r1
                    r3 = r3 | r1
                    int r0 = r0 - r3
                    int r0 = r0 << r5
                    int r2 = r2 + r0
                    int r0 = r2 % 128
                    o.er.d.AnonymousClass6.f24959d = r0
                    int r2 = r2 % r7
                L35:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
                    r4.onSuccess(r0)
                    int r0 = o.er.d.AnonymousClass6.f24960e
                    int r1 = r0 + 69
                    int r0 = r1 % 128
                    o.er.d.AnonymousClass6.f24959d = r0
                    int r1 = r1 % r7
                    if (r1 != 0) goto L5d
                    return
                L48:
                    r6 = r5
                    goto L26
                L4a:
                    fr.antelop.sdk.util.OperationCallback r4 = r2
                    boolean r0 = r9.booleanValue()
                    if (r0 == r5) goto L53
                    goto L1b
                L53:
                    int r0 = o.er.d.AnonymousClass6.f24959d
                    int r1 = r0 + 19
                    int r0 = r1 % 128
                    o.er.d.AnonymousClass6.f24960e = r0
                    int r1 = r1 % r7
                    goto L35
                L5d:
                    r0 = 0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass6.a(java.lang.Boolean):void");
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final void onError(AntelopError antelopError) {
                int i22 = 2 % 2;
                int i3 = f24960e + 103;
                f24959d = i3 % 128;
                if (i3 % 2 != 0) {
                    operationCallback.onError(antelopError);
                    int i4 = 7 / 0;
                } else {
                    operationCallback.onError(antelopError);
                }
                int i5 = f24960e + 31;
                f24959d = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final /* synthetic */ void onSuccess(Boolean bool) {
                int i22 = 2 % 2;
                int i3 = f24960e;
                int i4 = (i3 & 99) + ((-1) - (((-1) - i3) & ((-1) - 99)));
                f24959d = i4 % 128;
                int i5 = i4 % 2;
                a(bool);
                if (i5 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i6 = f24959d + 51;
                f24960e = i6 % 128;
                int i7 = i6 % 2;
            }
        }};
        int i3 = f24831b * 1411408100;
        f24831b = i3;
        a(-1035223737, i3, Process.myTid(), objArr, 1035223737, new Random().nextInt(837508811), Process.myTid());
        int i4 = f24842o + 115;
        f24840m = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void h(Context context, OperationCallback<String> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24842o + 109;
        f24840m = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.f25009a};
            int i4 = o.ep.d.f24461m * (-222457364);
            o.ep.d.f24461m = i4;
            int i5 = o.ep.d.f24462n * 325900588;
            o.ep.d.f24462n = i5;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i6 = o.ep.d.f24460l * 323941697;
            o.ep.d.f24460l = i6;
            CardStatus cardStatus = CardStatus.Active;
            throw null;
        }
        Object[] objArr2 = {this.f25009a};
        int i7 = o.ep.d.f24461m * (-222457364);
        o.ep.d.f24461m = i7;
        int i8 = o.ep.d.f24462n * 325900588;
        o.ep.d.f24462n = i8;
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int i9 = o.ep.d.f24460l * 323941697;
        o.ep.d.f24460l = i9;
        if (((CardStatus) o.ep.d.e(1555433584, -1555433578, objArr2, i8, iElapsedRealtime2, i9, i7)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            y((short) TextUtils.indexOf("", "", 0), 1442845808 - (ViewConfiguration.getTapTimeout() >> 16), (-1572756572) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) - 63, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr3);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr3[0]).intern());
        }
        if (!c()) {
            throw new WalletValidationException(WalletValidationErrorCode.WrongState, b());
        }
        b(context).c(new c.a<List<o.es.e>>() { // from class: o.er.d.9
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static char f24970a = 0;

            /* JADX INFO: renamed from: d */
            private static long f24971d = 0;

            /* JADX INFO: renamed from: e */
            private static char[] f24972e = null;

            /* JADX INFO: renamed from: f */
            public static int f24973f = 0;

            /* JADX INFO: renamed from: g */
            private static int f24974g = 0;

            /* JADX INFO: renamed from: h */
            private static int f24975h = 0;

            /* JADX INFO: renamed from: i */
            public static int f24976i = 0;

            /* JADX INFO: renamed from: j */
            public static int f24977j = 0;

            /* JADX INFO: renamed from: k */
            public static int f24978k = 0;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ OperationCallback f24980c;

            private static String $$e(byte v2, int v3, short v4) {
                /*
                    int r0 = r7 * 2
                    int r0 = 3 - r0
                    int r2 = r6 * 4
                    int r1 = 1 - r2
                    int r7 = 111 - r5
                    byte[] r6 = o.er.d.AnonymousClass9.$$c
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    int r3 = 0 - r2
                    if (r6 != 0) goto L2a
                    r2 = r0
                    r1 = r4
                L15:
                    int r0 = -r0
                    int r7 = r7 + r0
                    r0 = r2
                L18:
                    int r2 = r0 + 1
                    byte r0 = (byte) r7
                    r5[r1] = r0
                    if (r1 != r3) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L25:
                    int r1 = r1 + 1
                    r0 = r6[r2]
                    goto L15
                L2a:
                    r1 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass9.$$e(byte, int, short):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f24978k = -301336945;
                f24977j = 1780692732;
                f24976i = -1359803174;
                f24973f = 1698624876;
                init$0();
                f24975h = 0;
                f24974g = 1;
                f24972e = new char[]{64576, 64590, 64604, 64597, 64543, 64592, 64578, 64579, 64598, 64587, 64580, 64594, 64612, 64582, 64584, 65468, 64589, 65469, 64585, 64588, 65466, 64599, 64583, 64625, 64620, 64577, 65470, 65465, 64520, 65471, 64586, 65467, 64532, 64517, 64593, 64523};
                f24970a = (char) 51641;
                f24971d = 2629470337986654309L;
            }

            AnonymousClass9(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            private void b(List<o.es.e> list) throws Throwable {
                String strC;
                String strA;
                Object obj;
                int i22 = 2 % 2;
                if (o.ea.f.a()) {
                    int i32 = f24975h + 87;
                    f24974g = i32 % 128;
                    if (i32 % 2 == 0) {
                        strA = d.this.a();
                        Object[] objArr4 = new Object[1];
                        l(119 - ((byte) KeyEvent.getModifierMetaStateMask()), "\f\u0006#\u0016\t\u0002\u0012#\u0002\u0001\u0006\u001b\u001b\u001f\u001b\"\u0006\u000b㙭㙭\u0004\u001e\"#\u001f\u0000\u0003\u0006\u001f\t\u0004\u001e\u000e\u0011\u0015\u0007\t\u001e\u000b\u0002㙰㙰\u0002\u0006㙠", (byte) (124 << TextUtils.getOffsetBefore("", 0)), objArr4);
                        obj = objArr4[0];
                    } else {
                        strA = d.this.a();
                        Object[] objArr22 = new Object[1];
                        l(44 - ((byte) KeyEvent.getModifierMetaStateMask()), "\f\u0006#\u0016\t\u0002\u0012#\u0002\u0001\u0006\u001b\u001b\u001f\u001b\"\u0006\u000b㙭㙭\u0004\u001e\"#\u001f\u0000\u0003\u0006\u001f\t\u0004\u001e\u000e\u0011\u0015\u0007\t\u001e\u000b\u0002㙰㙰\u0002\u0006㙠", (byte) (119 - TextUtils.getOffsetBefore("", 0)), objArr22);
                        obj = objArr22[0];
                    }
                    o.ea.f.c(strA, ((String) obj).intern());
                }
                Iterator<o.es.e> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strC = null;
                        break;
                    }
                    o.es.e next = it.next();
                    if (d.this.f25009a.s() != null) {
                        String strD = next.d();
                        Object[] objArr32 = {d.this.f25009a.s()};
                        int i42 = 574268897 * o.ep.c.f24438e;
                        o.ep.c.f24438e = i42;
                        int id = (int) Thread.currentThread().getId();
                        int i52 = o.ep.c.f24436c * 1169734117;
                        o.ep.c.f24436c = i52;
                        int i62 = (-2104816085) * o.ep.c.f24434a;
                        o.ep.c.f24434a = i62;
                        if (strD.equals((String) o.ep.c.c(i42, id, i62, 1241915024, objArr32, -1241915024, i52))) {
                            if (o.ea.f.a()) {
                                String strA2 = d.this.a();
                                StringBuilder sb = new StringBuilder();
                                Object[] objArr42 = new Object[1];
                                m("﵍䷾鰼\uef6d㾝踯\ud958⦒磉쭶ᮮ櫸딂\u05f7咩ꝕ\uf65b䛋鄬\ue066ゕ菊퉲⋭淔밌ಢ御긒漏䧳頬\ueb7e㮚諄픹▭瓞윞ឹ暢", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45234, objArr42);
                                StringBuilder sbAppend = sb.append(((String) objArr42[0]).intern()).append(d.this.f25009a.b());
                                Object[] objArr5 = new Object[1];
                                l(19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u001f\u0015\t \u0006\u001f\u0003\u000b\u001b\u001f\u0015\u0007#\t\u0006\u0016\u0018\u0006㗷", (byte) (Color.argb(0, 0, 0, 0) + 9), objArr5);
                                o.ea.f.c(strA2, sbAppend.append(((String) objArr5[0]).intern()).toString());
                                int i72 = f24974g + 73;
                                f24975h = i72 % 128;
                                int i82 = i72 % 2;
                            }
                            strC = next.c();
                        }
                    }
                    int i92 = f24975h + 81;
                    f24974g = i92 % 128;
                    int i10 = i92 % 2;
                }
                operationCallback.onSuccess(strC);
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(Unknown Source)
                	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                */
            public static java.lang.Object[] c(android.content.Context r23, int r24, int r25, int r26) {
                /*
                    Method dump skipped, instruction units count: 1524
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass9.c(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{76, -80, -89, 46};
                $$b = 94;
            }

            static void init$1() {
                $$c = new byte[]{17, -84, -78, -70};
                $$d = 48;
            }

            private static void l(int i22, String str, byte b2, Object[] objArr4) throws Throwable {
                int i32;
                String str2 = str;
                int i42 = 2 % 2;
                Object obj = str2;
                if (str2 != null) {
                    char[] charArray = str2.toCharArray();
                    int i52 = $10 + 61;
                    $11 = i52 % 128;
                    int i62 = i52 % 2;
                    obj = charArray;
                }
                char[] cArr = (char[]) obj;
                o.a.h hVar = new o.a.h();
                char[] cArr2 = f24972e;
                int i72 = 421932776;
                int i82 = 9;
                int i92 = 1;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i10 = 0;
                    while (i10 < length) {
                        try {
                            Object[] objArr22 = {Integer.valueOf(cArr2[i10])};
                            Object objA = o.d.d.a(i72);
                            if (objA == null) {
                                byte b3 = (byte) 0;
                                objA = o.d.d.a(270 - TextUtils.indexOf("", ""), (char) TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionChild(0L) + 12, -811348851, false, $$e((byte) i82, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                            i10++;
                            i72 = 421932776;
                            i82 = 9;
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
                Object[] objArr32 = {Integer.valueOf(f24970a)};
                Object objA2 = o.d.d.a(421932776);
                char c2 = 11;
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = o.d.d.a(270 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.MeasureSpec.getSize(0), Color.red(0) + 11, -811348851, false, $$e((byte) 9, b4, b4), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr32)).charValue();
                char[] cArr4 = new char[i22];
                if (i22 % 2 != 0) {
                    i32 = i22 - 1;
                    cArr4[i32] = (char) (cArr[i32] - b2);
                } else {
                    i32 = i22;
                }
                if (i32 > 1) {
                    hVar.f19926b = 0;
                    while (hVar.f19926b < i32) {
                        int i11 = $10 + 107;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        hVar.f19927c = cArr[hVar.f19926b];
                        hVar.f19925a = cArr[hVar.f19926b + i92];
                        if (hVar.f19927c == hVar.f19925a) {
                            cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                            cArr4[hVar.f19926b + i92] = (char) (hVar.f19925a - b2);
                        } else {
                            Object[] objArr42 = new Object[13];
                            objArr42[12] = hVar;
                            objArr42[c2] = Integer.valueOf(cCharValue);
                            objArr42[10] = hVar;
                            objArr42[9] = hVar;
                            objArr42[8] = Integer.valueOf(cCharValue);
                            objArr42[7] = hVar;
                            objArr42[6] = hVar;
                            objArr42[5] = Integer.valueOf(cCharValue);
                            objArr42[4] = hVar;
                            objArr42[3] = hVar;
                            objArr42[2] = Integer.valueOf(cCharValue);
                            objArr42[i92] = hVar;
                            objArr42[0] = hVar;
                            Object objA3 = o.d.d.a(219124184);
                            if (objA3 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA3 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 825, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 11 - TextUtils.getTrimmedLength(""), -611683395, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objA3).invoke(null, objArr42)).intValue() == hVar.f19930g) {
                                Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                                Object objA4 = o.d.d.a(-634864343);
                                if (objA4 == null) {
                                    int threadPriority = 218 - ((Process.getThreadPriority(0) + 20) >> 6);
                                    char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int iRgb = (-16777205) - Color.rgb(0, 0, 0);
                                    byte b7 = (byte) 2;
                                    byte b8 = (byte) (b7 - 2);
                                    String str$$e = $$e(b7, b8, b8);
                                    c2 = 11;
                                    objA4 = o.d.d.a(threadPriority, c3, iRgb, 212688716, false, str$$e, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c2 = 11;
                                }
                                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                                int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[iIntValue];
                                cArr4[hVar.f19926b + 1] = cArr2[i13];
                            } else {
                                c2 = 11;
                                if (hVar.f19928d == hVar.f19929e) {
                                    hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                    hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                    int i14 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                    int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                    cArr4[hVar.f19926b] = cArr2[i14];
                                    cArr4[hVar.f19926b + 1] = cArr2[i15];
                                } else {
                                    int i16 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                    int i17 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                    cArr4[hVar.f19926b] = cArr2[i16];
                                    i92 = 1;
                                    cArr4[hVar.f19926b + 1] = cArr2[i17];
                                }
                            }
                            i92 = 1;
                        }
                        hVar.f19926b += 2;
                    }
                }
                for (int i18 = 0; i18 < i22; i18++) {
                    int i19 = $10 + 65;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                }
                objArr4[0] = new String(cArr4);
            }

            private static void m(String str, int i22, Object[] objArr4) throws Throwable {
                String str2 = str;
                int i32 = 2 % 2;
                int i42 = $10 + 75;
                $11 = i42 % 128;
                int i52 = i42 % 2;
                char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
                o.a.q qVar = new o.a.q();
                qVar.f19949d = i22;
                int length = cArr.length;
                long[] jArr = new long[length];
                qVar.f19948a = 0;
                while (qVar.f19948a < cArr.length) {
                    int i62 = $11 + 31;
                    $10 = i62 % 128;
                    int i72 = i62 % 2;
                    int i82 = qVar.f19948a;
                    try {
                        Object[] objArr22 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                        Object objA = o.d.d.a(-1011865131);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a(731 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7933), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, 355847088, false, $$e((byte) 40, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i82] = ((Long) ((Method) objA).invoke(null, objArr22)).longValue() ^ (f24971d ^ 4743694005979712847L);
                        Object[] objArr32 = {qVar, qVar};
                        Object objA2 = o.d.d.a(1452497747);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            objA2 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 836, (char) (27279 - TextUtils.getOffsetBefore("", 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -2145994442, false, $$e((byte) 33, b3, b3), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr32);
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
                int i92 = $11 + 1;
                $10 = i92 % 128;
                int i10 = i92 % 2;
                while (qVar.f19948a < cArr.length) {
                    cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                    Object[] objArr42 = {qVar, qVar};
                    Object objA3 = o.d.d.a(1452497747);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(Process.getGidForName("") + 837, (char) (27278 - TextUtils.lastIndexOf("", '0')), Color.alpha(0) + 11, -2145994442, false, $$e((byte) 33, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr42);
                }
                objArr4[0] = new String(cArr2);
            }

            private static void n(byte v2, short v3, int v4, Object[] v5) {
                /*
                    byte[] r8 = o.er.d.AnonymousClass9.$$a
                    int r0 = r11 + 97
                    int r1 = r9 * 3
                    int r7 = 4 - r1
                    int r1 = r10 * 2
                    int r6 = r1 + 1
                    byte[] r5 = new byte[r6]
                    r4 = 0
                    if (r8 != 0) goto L2c
                    r2 = r6
                    r3 = r4
                L13:
                    int r7 = r7 + 1
                    int r0 = -r0
                    int r0 = r0 + r2
                    r2 = r3
                L18:
                    byte r1 = (byte) r0
                    int r3 = r2 + 1
                    r5[r2] = r1
                    if (r3 != r6) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    r12[r4] = r0
                    return
                L27:
                    r1 = r8[r7]
                    r2 = r0
                    r0 = r1
                    goto L13
                L2c:
                    r2 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.er.d.AnonymousClass9.n(byte, short, int, java.lang.Object[]):void");
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24975h + 5;
                f24974g = i32 % 128;
                int i42 = i32 % 2;
                Object obj = null;
                b(list);
                if (i42 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i52 = f24974g + 103;
                f24975h = i52 % 128;
                if (i52 % 2 != 0) {
                    throw null;
                }
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24974g + 117;
                f24975h = i32 % 128;
                int i42 = i32 % 2;
                if (o.ea.f.a()) {
                    String strA = d.this.a();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr4 = new Object[1];
                    l(View.MeasureSpec.getSize(0) + 59, "\f\u0006#\u0016\t\u0002\u0012#\u0002\u0001\u0006\u001b\u001b\u001f\u001b\"\u001f\u0019\n \u000b\n#\"\u0004\t\u0003 \u0006\u000b㙕㙕\u0004\u001e\"#\u001f\u0000\u0003\u0006\u001f\t\u0004\u001e\u000e\u0011\u0015\u0007\t\u001e\b\u000b\u0014\u0013\u0001\u0018\"\u0003㘙", (byte) (95 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr4);
                    o.ea.f.d(strA, sb.append(((String) objArr4[0]).intern()).append(cVar.c()).toString());
                    int i52 = f24975h + 113;
                    f24974g = i52 % 128;
                    int i62 = i52 % 2;
                }
                operationCallback.onError(cVar.a());
            }
        });
        int i10 = f24840m + 93;
        f24842o = i10 % 128;
        int i11 = i10 % 2;
    }
}
