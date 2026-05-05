package fr.antelop.sdk.digitalcard.transactioncontrol;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.TimePeriod;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.util.TimeZone;
import o.a.g;
import o.a.h;
import o.a.j;
import o.a.k;
import o.a.q;
import o.ex.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class TransactionControls {
    private final Date creationDate;
    private final GlobalControls globalControls;
    private final String id;
    private final d innerTransactionControlUpdateRegister;
    private final MerchantTypeControls merchantTypeControls;
    private final TransactionGeolocationControls transactionGeolocationControls;
    private final TransactionTypeControls transactionTypeControls;
    private final VelocityControls velocityControls;

    public static final class GlobalControls {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f19402a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f19403b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static long f19404c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f19405d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static long f19406e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f19407f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f19408g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f19409h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f19410i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f19411j = 0;
        private final TransactionControl<BigDecimal> alertThreshold;
        private final TransactionControl<Boolean> blockAll;
        private final TransactionControl<BigDecimal> declineThreshold;
        private final TransactionControl<Boolean> tokenizedOnly;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r6, byte r7, short r8) {
            /*
                int r8 = r8 * 3
                int r1 = r8 + 1
                int r0 = r6 * 7
                int r0 = 78 - r0
                int r7 = r7 + 4
                byte[] r6 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.GlobalControls.$$c
                byte[] r5 = new byte[r1]
                r4 = 0
                if (r6 != 0) goto L2a
                r2 = r7
                r3 = r4
            L13:
                int r0 = -r0
                int r0 = r0 + r7
                r7 = r2
            L16:
                int r2 = r7 + 1
                byte r1 = (byte) r0
                r5[r3] = r1
                if (r3 != r8) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L23:
                r1 = r6[r2]
                int r3 = r3 + 1
                r7 = r0
                r0 = r1
                goto L13
            L2a:
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.GlobalControls.$$e(short, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f19411j = 1699887152;
            f19410i = -2129931234;
            f19409h = -810863716;
            f19407f = 1599716346;
            init$0();
            f19403b = 0;
            f19408g = 1;
            f19402a = 0;
            f19405d = 1;
            b();
            f19404c = -5107285832793836739L;
            int i2 = f19408g + 19;
            f19403b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 7 / 0;
            }
        }

        public GlobalControls(TransactionControl<Boolean> transactionControl, TransactionControl<BigDecimal> transactionControl2, TransactionControl<BigDecimal> transactionControl3, TransactionControl<Boolean> transactionControl4) {
            this.blockAll = transactionControl;
            this.declineThreshold = transactionControl2;
            this.alertThreshold = transactionControl3;
            this.tokenizedOnly = transactionControl4;
        }

        static void b() {
            f19406e = 7435393933678175198L;
        }

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x010b: ARITH (r10 I:??[int, boolean]) = (r8 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:10:0x010b */
        public static Object[] d(int i2, int i3) throws Throwable {
            int i4;
            Object[] objArr;
            Object[] objArr2;
            char c2;
            String line;
            boolean zEquals;
            boolean zEquals2;
            File file;
            FileReader fileReader;
            BufferedReader bufferedReader;
            File file2;
            File file3;
            int i5 = 2 % 2;
            int i6 = f19402a + 29;
            f19405d = i6 % 128;
            int i7 = i6 % 2;
            try {
                i4 = i2;
                Object[] objArr3 = new Object[1];
                k("滸壁ʓ첝뙿恋⨤ᐃ\udfec觘玌㵿\ue75b털鬞䋿ೕ\uf6a7ꂃ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13859, objArr3);
                Object[] objArr4 = new Object[1];
                k("滦\ue4ab穎\uf1f4䞔\udd38僔ꚪ㰦돐ज़鼝\u12b7桻︌疣쭄廨", 35419 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
                String[] strArr = {(String) objArr3[0], (String) objArr4[0]};
                int i8 = 0;
                while (true) {
                    if (i8 >= 2) {
                        objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4}};
                        int i9 = (~i4) | 252554921;
                        int i10 = (-1440206292) + (i9 * 495);
                        int i11 = ~i9;
                        int i12 = i3 + i10 + (((i11 + 151783432) - (i11 & 151783432)) * 495);
                        int i13 = i12 ^ (i12 << 13);
                        int i14 = i13 ^ (i13 >>> 17);
                        break;
                    }
                    String str = strArr[i8];
                    Object[] objArr5 = new Object[1];
                    k("滰䕲㧯\uec44샊뜹殻幤㊖\ue917\udd3d뇚摨壚དྷ\ue3b5", 11149 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
                    Class<?> cls = Class.forName((String) objArr5[0]);
                    if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                        objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4 ^ 1}};
                        int i15 = f19409h * (-1399543051);
                        f19409h = i15;
                        int i16 = i3 + ((((-1) - (((-1) - (~((-939513664) | i15))) & ((-1) - 127145737))) * (-283)) - 1994314072) + ((~(i15 | (-812367927))) * 283) + 16;
                        int i17 = i16 ^ (i16 << 13);
                        int i18 = i17 ^ (i17 >>> 17);
                        break;
                    }
                    i8++;
                }
            } catch (Exception unused) {
                objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4 ^ 2}};
                int i19 = f19410i * 2051566442;
                f19410i = i19;
                int i20 = i3 + 1575830672 + ((~((-1) - (((-1) - 408944495) & ((-1) - i19)))) * (-301)) + (((-1) - (((-1) - (~((-1) - (((-1) - (~i19)) & ((-1) - 408927815))))) & ((-1) - (~((-269220207) | i19))))) * (-301)) + (((~((-1) - (((-1) - (-408927816)) & ((-1) - i19)))) | (-269220207)) * 301) + 16;
                int i21 = i20 ^ (i20 << 13);
                int i22 = i21 ^ (i21 >>> 17);
            }
            if (i4 != ((int[]) objArr[3])[0]) {
                int i23 = f19405d;
                int i24 = i23 + 55;
                f19402a = i24 % 128;
                int i25 = i24 % 2;
                int i26 = i23 + 31;
                f19402a = i26 % 128;
                int i27 = i26 % 2;
                return objArr;
            }
            try {
                Object objA = o.d.d.a(26976634);
                if (objA == null) {
                    int i28 = 322 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int i29 = 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    l(b2, b3, b3, objArr6);
                    objA = o.d.d.a(i28, mode, i29, -685882593, false, (String) objArr6[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objA).invoke(null, null)).longValue();
                long j2 = 1284647735;
                long j3 = (((long) (-300)) * j2) + (((long) 302) * jLongValue);
                long j4 = -301;
                long j5 = (-1) - (((-1) - j2) & ((-1) - jLongValue));
                long jMyPid = Process.myPid();
                long j6 = -1;
                long j7 = jLongValue ^ j6;
                long j8 = ((j7 + jMyPid) - (j7 & jMyPid)) ^ j6;
                long j9 = ((-1) - (((-1) - (jMyPid ^ j6)) & ((-1) - j2))) ^ j6;
                long j10 = j3 + (((j5 | jMyPid) ^ j6) * j4) + (j4 * ((j8 + j9) - (j8 & j9))) + (((long) 301) * (((jMyPid | (j2 ^ j6)) ^ j6) | j7)) + ((long) (-1822928893));
                int i30 = (int) (j10 >> 32);
                int i31 = f19407f * 574355371;
                f19407f = i31;
                int i32 = ~((-1861744159) | i31);
                int i33 = (-1675927802) + (((i32 + 424517747) - (i32 & 424517747)) * (-318));
                int i34 = ~((424517747 + i31) - (424517747 & i31));
                int i35 = ~i31;
                int i36 = ~((-1) - (((-1) - i35) & ((-1) - (-285737058))));
                int i37 = i33 + (((i34 + i36) - (i34 & i36)) * 318);
                int i38 = ~((-1) - (((-1) - 2147481215) & ((-1) - i35)));
                int i39 = ~(i31 | (-285737058));
                int i40 = i37 + (((i39 + i38) - (i39 & i38)) * 318);
                int i41 = (i30 + i40) - (i30 | i40);
                int i42 = (int) j10;
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i43 = (-492306909) + ((((-1) - (((-1) - (~((-1) - (((-1) - 888873893) & ((-1) - iMaxMemory))))) & ((-1) - 266240))) | (~(((-548352517) + iMaxMemory) - ((-548352517) & iMaxMemory)))) * (-754));
                int i44 = ~((-266241) | iMaxMemory);
                int i45 = ~iMaxMemory;
                int i46 = i43 + ((i44 | (~((-1) - (((-1) - (-548086277)) & ((-1) - i45))))) * (-754)) + (((-1) - (((-1) - i45) & ((-1) - 888873893))) * 754);
                if ((i41 | ((i42 + i46) - (i42 | i46))) == 1) {
                    objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4 ^ 10}};
                    int i47 = i3 + (-1129769427) + (((-1) - (((-1) - (~((-175372627) | i4))) & ((-1) - 141801538))) * 104) + ((~((~i4) | 536346483)) * (-104)) + (((-1) - (((-1) - 502775395) & ((-1) - i4))) * 104) + 16;
                    int i48 = i47 ^ (i47 << 13);
                    int i49 = i48 ^ (i48 >>> 17);
                    c2 = 0;
                } else {
                    objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4}};
                    int i50 = ~((182371802 + i4) - (182371802 & i4));
                    int i51 = (i50 + 822097920) - (i50 & 822097920);
                    int i52 = ~i4;
                    int i53 = ~((-1) - (((-1) - (-143949899)) & ((-1) - i52)));
                    int i54 = i3 + (-821453721) + (((i51 + i53) - (i51 & i53)) * 886) + (((-1) - (((-1) - (~(((-182371803) + i52) - ((-182371803) & i52)))) & ((-1) - 860519824))) * (-1772)) + ((~((-1) - (((-1) - i52) & ((-1) - 860519824)))) * 886);
                    int i55 = i54 ^ (i54 << 13);
                    int i56 = i55 ^ (i55 >>> 17);
                    c2 = 0;
                }
                if (i4 != ((int[]) objArr2[3])[c2]) {
                    return objArr2;
                }
                try {
                    Object[] objArr7 = new Object[1];
                    k("溾হꁞ壳\uf3d2樽˖붞吧쳇杳ṗ뚱八젉悱ᭆ뎵⪃씢緬ᒅ輪⟒\ude7e祝ᇌ衽⌗\udbac牞\ueafa薅㱵퓳侒\ue63c黕㥶퀾", 26459 - (ViewConfiguration.getTapTimeout() >> 16), objArr7);
                    file3 = new File((String) objArr7[0]);
                } catch (Exception unused2) {
                }
                if ((!file3.canRead() ? 'P' : '6') != '6') {
                    line = null;
                } else {
                    fileReader = new FileReader(file3);
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        line = bufferedReader.readLine();
                        Object[] objArr8 = new Object[1];
                        k("滿跇ꢓ", 58169 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
                        if (line.equals((String) objArr8[0])) {
                            fileReader.close();
                            bufferedReader.close();
                            line = null;
                        } else {
                            fileReader.close();
                            bufferedReader.close();
                        }
                    } finally {
                    }
                }
                try {
                    Object[] objArr9 = new Object[1];
                    k("溾벘쨑ᦕ✖狣耴꾧ﴪࣿ噀旇덏\udeda\uec6a㯪䤮链ꉧ\uf018ᾄⴟ碒蘑햬\ue32e຺尰毁륁쓛", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 53880, objArr9);
                    file2 = new File((String) objArr9[0]);
                } catch (Exception unused3) {
                    zEquals = false;
                }
                if (file2.canRead()) {
                    fileReader = new FileReader(file2);
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        String line2 = bufferedReader.readLine();
                        Object[] objArr10 = new Object[1];
                        m("㹃", 36761 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
                        zEquals = line2.equals(((String) objArr10[0]).intern());
                        fileReader.close();
                        bufferedReader.close();
                    } finally {
                    }
                } else {
                    int i57 = f19402a + 47;
                    f19405d = i57 % 128;
                    int i58 = i57 % 2;
                    zEquals = false;
                }
                if (zEquals) {
                    try {
                        Object[] objArr11 = new Object[1];
                        k("溾줏Ⅎ餥\uf10a⥛腺輦冗覡\ue1bf妑뇩\ue9fd䀅렇ဦ䠃ꁏᡴ灴ꢃ¦碴탎࢛惷\udb1c㌜欫쌾㭌鍖쭃⎄鮘", (ViewConfiguration.getEdgeSlop() >> 16) + 42989, objArr11);
                        file = new File((String) objArr11[0]);
                    } catch (Exception unused4) {
                        zEquals2 = false;
                    }
                    if (file.canRead()) {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        try {
                            String line3 = bufferedReader.readLine();
                            Object[] objArr12 = new Object[1];
                            m("㹃", 36761 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr12);
                            zEquals2 = line3.equals(((String) objArr12[0]).intern());
                            fileReader.close();
                            bufferedReader.close();
                        } finally {
                        }
                    } else {
                        zEquals2 = false;
                    }
                    if ((zEquals2 ? (char) 21 : (char) 14) != 14) {
                        if ((line != null ? '7' : 'R') == '7') {
                            Object[] objArr13 = {new int[1], new int[]{i4}, line, new int[]{i4 ^ 20}};
                            int iActiveCount = Thread.activeCount();
                            int i59 = i3 + ((((-355731735) + (((-1) - (((-1) - (~((121322740 + iActiveCount) - (121322740 & iActiveCount)))) & ((-1) - (-799470763)))) * (-948))) + ((~((~iActiveCount) | (-679788555))) * (-948))) - 755704664);
                            int i60 = i59 ^ (i59 << 13);
                            int i61 = i60 ^ (i60 >>> 17);
                            ((int[]) objArr13[0])[0] = i61 ^ (i61 << 5);
                            return objArr13;
                        }
                    }
                }
                Object[] objArr14 = {new int[]{i ^ (i << 5)}, new int[]{i4}, null, new int[]{i4}};
                int i62 = f19411j * (-1309962585);
                f19411j = i62;
                int i63 = ~(((-104710269) + i62) - ((-104710269) & i62));
                int i64 = ~i62;
                int i65 = (-1) - (((-1) - i63) & ((-1) - (~((573437753 + i64) - (573437753 & i64)))));
                int i66 = ~(104710268 | i64);
                int i67 = (-667065663) + ((i65 | i66) * (-516));
                int i68 = ~(i62 | (-36552761));
                int i69 = ~(((-536884994) + i64) - ((-536884994) & i64));
                int i70 = i3 + i67 + (((i68 + i69) - (i68 & i69)) * 516) + ((536884993 | i66) * 516);
                int i71 = i70 ^ (i70 << 13);
                int i72 = i71 ^ (i71 >>> 17);
                return objArr14;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        static void init$0() {
            $$a = new byte[]{Ascii.CR, Ascii.ESC, 39, 17};
            $$b = 101;
        }

        static void init$1() {
            $$c = new byte[]{91, 84, -6, Ascii.ETB};
            $$d = 68;
        }

        private static void k(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 31;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
                charArray = str2 != null ? str2.toCharArray() : str2;
            } else {
                if (str2 != null) {
                }
            }
            char[] cArr = (char[]) charArray;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i6 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (-b2);
                        objA = o.d.d.a(731 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7933), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), 355847088, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f19406e ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(837 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (Color.red(0) + 27279), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, -2145994442, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
                int i7 = $11 + 113;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                    Object[] objArr4 = {qVar, qVar};
                    Object objA3 = o.d.d.a(1452497747);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(836 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ImageFormat.getBitsPerPixel(0) + 27280), 11 - TextUtils.getOffsetBefore("", 0), -2145994442, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    throw null;
                }
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objA4 = o.d.d.a(835 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (27280 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 11 - TextUtils.getOffsetBefore("", 0), -2145994442, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            String str3 = new String(cArr2);
            int i8 = $10 + 95;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            objArr[0] = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void l(short r8, short r9, int r10, java.lang.Object[] r11) {
            /*
                int r2 = r8 * 2
                int r1 = 1 - r2
                int r0 = r10 * 3
                int r8 = 100 - r0
                byte[] r7 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.GlobalControls.$$a
                int r0 = r9 * 4
                int r6 = r0 + 4
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r7 != 0) goto L31
                r2 = r8
                r1 = r4
                r0 = r6
            L18:
                int r6 = r6 + r2
                int r0 = r0 + 1
                r8 = r6
                r6 = r0
            L1d:
                byte r0 = (byte) r8
                r5[r1] = r0
                if (r1 != r3) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r11[r4] = r0
                return
            L2a:
                int r1 = r1 + 1
                r2 = r7[r6]
                r0 = r6
                r6 = r8
                goto L18
            L31:
                r1 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.GlobalControls.l(short, short, int, java.lang.Object[]):void");
        }

        private static void m(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            if (str2 != null) {
                int i4 = $11 + 75;
                $10 = i4 % 128;
                int i5 = i4 % 2;
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
            while (qVar.f19948a < cArr.length) {
                int i6 = $10 + 39;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (-b2);
                        objA = o.d.d.a(730 - ImageFormat.getBitsPerPixel(0), (char) (Color.blue(0) + 7933), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, 355847088, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f19404c ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(836 - Color.alpha(0), (char) (27279 - View.resolveSize(0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, -2145994442, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 836, (char) (Color.rgb(0, 0, 0) + 16804495), (ViewConfiguration.getTouchSlop() >> 8) + 11, -2145994442, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        public final TransactionControl<Boolean> getAllowOnlyTokenizedTransactionsControl() {
            int i2 = 2 % 2;
            int i3 = f19405d + 67;
            f19402a = i3 % 128;
            int i4 = i3 % 2;
            TransactionControl<Boolean> transactionControl = this.tokenizedOnly;
            if (i4 != 0) {
                int i5 = 35 / 0;
            }
            return transactionControl;
        }

        public final TransactionControl<Boolean> getBlockAllTransactionsControl() {
            int i2 = 2 % 2;
            int i3 = f19402a + 17;
            int i4 = i3 % 128;
            f19405d = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TransactionControl<Boolean> transactionControl = this.blockAll;
            int i5 = i4 + 121;
            f19402a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 53 / 0;
            }
            return transactionControl;
        }

        public final TransactionControl<BigDecimal> getTransactionAlertThresholdControl() {
            int i2 = 2 % 2;
            int i3 = f19405d + 19;
            int i4 = i3 % 128;
            f19402a = i4;
            int i5 = i3 % 2;
            TransactionControl<BigDecimal> transactionControl = this.alertThreshold;
            int i6 = i4 + 79;
            f19405d = i6 % 128;
            if (i6 % 2 != 0) {
                return transactionControl;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final TransactionControl<BigDecimal> getTransactionDeclineThresholdControl() {
            TransactionControl<BigDecimal> transactionControl;
            int i2 = 2 % 2;
            int i3 = f19402a;
            int i4 = i3 + 43;
            f19405d = i4 % 128;
            if (i4 % 2 == 0) {
                transactionControl = this.declineThreshold;
                int i5 = 26 / 0;
            } else {
                transactionControl = this.declineThreshold;
            }
            int i6 = i3 + 125;
            f19405d = i6 % 128;
            int i7 = i6 % 2;
            return transactionControl;
        }
    }

    public static final class MerchantTypeControls {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f19412a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f19413b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f19414c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f19415d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f19416e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f19417f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f19418g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f19419h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f19420i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f19421j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f19422k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static int f19423l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static byte[] f19424m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static short[] f19425n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static long f19426o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static int f19427p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static int f19428q = 0;
        private final TransactionControl<Boolean> alertAll;
        private final TransactionControl<Boolean> blockAll;
        private final TransactionControl<String[]> types;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r6, byte r7, byte r8) {
            /*
                int r3 = r8 * 4
                int r2 = 1 - r3
                int r0 = 104 - r6
                byte[] r8 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.MerchantTypeControls.$$a
                int r1 = r7 * 3
                int r7 = 3 - r1
                byte[] r6 = new byte[r2]
                r5 = 0
                int r4 = 0 - r3
                if (r8 != 0) goto L2d
                r2 = r7
                r1 = r4
                r3 = r5
            L16:
                int r0 = -r1
                int r7 = r7 + r0
                r0 = r7
                r7 = r2
            L1a:
                int r2 = r7 + 1
                byte r1 = (byte) r0
                r6[r3] = r1
                if (r3 != r4) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L27:
                r1 = r8[r2]
                int r3 = r3 + 1
                r7 = r0
                goto L16
            L2d:
                r3 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.MerchantTypeControls.$$c(int, byte, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f19427p = 126755239;
            f19420i = -996919319;
            f19421j = 815520114;
            f19419h = 1527476962;
            f19413b = 8736211;
            f19412a = 147835086;
            f19415d = 44371535;
            f19414c = -712305810;
            f19416e = -581216911;
            f19422k = 0;
            f19428q = 1;
            f19418g = -2135189372;
            f19417f = 1150422524;
            f19423l = 2052730934;
            f19424m = new byte[]{56, -122, 124, -118, -117, 120, -120, 122, -81, -83, -115, 118, 80, -89, 115, -115, 118, 48, MessagePack.Code.EXT8, 75, 121, 114, -103, -66, 56, -120, -122, 122, 112, -97, 115, 127, MessagePack.Code.EXT16, 59, -102, 102, -104, 122, 35, 127, -98, 112, -84, -87, 49, 118, 119, 112, -125, 123, MessagePack.Code.FIXSTR_PREFIX, -119, 98, -122, -102, 69, 118, 119, 112, -125, 123, MessagePack.Code.FIXSTR_PREFIX, -119, 99, -82, 84, 115, -107, 119, 43, 113, -98, 124, -117, 114, -95, -104, 55, -117, -124, 124, -117, 114, -127, -72, 71, 118, 119, 112, -125, 123, -128, 16, 117, -127, -98, 100, 115, -117, 123, -123, -113, -100, 81, -126, 115, Ascii.DC4, -125, 126, 112, -116, -98, 126, -118, 115, 123, 47, 124, -98, 115, 119, -114, 112, 120, -113, -128, -81, 83, 124, -98, 98, -128, 122, -124, 115, 43, -122, 124, -118, -117, 120, -120, 122, -81, -83, -115, 118, 80, 105, -100, 115, 118, -123, 96, -81, 82, -126, 115};
            f19426o = -8113129122656085903L;
        }

        public MerchantTypeControls(TransactionControl<Boolean> transactionControl, TransactionControl<Boolean> transactionControl2, TransactionControl<String[]> transactionControl3) {
            this.blockAll = transactionControl;
            this.alertAll = transactionControl2;
            this.types = transactionControl3;
        }

        public static Object[] c(Context context, int i2, int i3) {
            Object[] objArr;
            Object[] objArr2;
            Object[] objArr3;
            short jumpTapTimeout;
            int i4;
            byte bIndexOf;
            int i5;
            int i6;
            if (context == null) {
                Object[] objArr4 = {new int[]{(i + i) - (i & i)}, new int[]{i2}, null, new int[]{i2}};
                int i7 = ~i2;
                int i8 = (-389061477) + (((-1) - (((-1) - ((-1) - (((-1) - (~((i7 - 103267013) - (i7 & (-103267013))))) & ((-1) - 2394244)))) & ((-1) - (~((-680542267) | i2))))) * 717);
                int i9 = ~((-1) - (((-1) - i7) & ((-1) - (-680542267))));
                int i10 = (i9 + 2394244) - (i9 & 2394244);
                int i11 = ~((i2 - 103267013) - (i2 & (-103267013)));
                int i12 = i8 + (((i11 + i10) - (i11 & i10)) * 717);
                int i13 = f19416e * (-144708529);
                f19416e = i13;
                int i14 = i12 * (-1965);
                int i15 = -(-(i3 * 984));
                int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                int i17 = ~i3;
                int i18 = ((i12 ^ i17) | ((i12 + i17) - (i12 | i17))) * 983;
                int i19 = (i16 & i18) + ((i18 + i16) - (i18 & i16));
                int i20 = ~i12;
                int i21 = ~i13;
                int i22 = i17 ^ i21;
                int i23 = (i17 + i21) - (i17 | i21);
                int i24 = ~((i23 + i22) - (i23 & i22));
                int i25 = i20 ^ i24;
                int i26 = i24 & i20;
                int i27 = (i19 - (~(((i26 + i25) - (i26 & i25)) * (-983)))) - 1;
                int i28 = ~i12;
                int i29 = i28 ^ i21;
                int i30 = (-1) - (((-1) - i21) | ((-1) - i28));
                int i31 = ~((i30 + i29) - (i30 & i29));
                int i32 = ~((i3 + i20) - (i3 & i20));
                int i33 = i27 + (((i31 & i32) | (i31 ^ i32)) * 983);
                int i34 = i33 << 13;
                int i35 = ((-1) - (((-1) - i34) & ((-1) - i33))) & (~((-1) - (((-1) - i33) | ((-1) - i34))));
                int i36 = i35 >>> 17;
                int i37 = (-1) - (((-1) - (~i36)) | ((-1) - i35));
                int i38 = ~i35;
                int i39 = (i38 + i36) - (i38 | i36);
                int i40 = (i39 + i37) - (i39 & i37);
                int i41 = i40 << 5;
                int i42 = (~i41) & i40;
                int i43 = (-1) - (((-1) - (~i40)) | ((-1) - i41));
                return objArr4;
            }
            try {
                short trimmedLength = (short) TextUtils.getTrimmedLength("");
                int i44 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i45 = (i44 ^ (-113)) + (((-1) - (((-1) - i44) | ((-1) - (-113)))) << 1);
                int i46 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b2 = (byte) (((1 | i46) << 1) - (i46 ^ 1));
                int offsetAfter = TextUtils.getOffsetAfter("", 0);
                int i47 = f19414c * 1251279069;
                f19414c = i47;
                int i48 = -(-(offsetAfter * 306));
                int i49 = (i48 ^ TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + ((i48 & TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1);
                int i50 = (i49 ^ (-190401234)) + ((i49 & (-190401234)) << 1);
                int i51 = ~((((-1053310289) + offsetAfter) - ((-1053310289) | offsetAfter)) | (offsetAfter ^ (-1053310289)));
                int i52 = offsetAfter ^ i47;
                int i53 = (-1) - (((-1) - offsetAfter) | ((-1) - i47));
                int i54 = ~((i52 + i53) - (i52 & i53));
                int i55 = ((-1) - (((-1) - (i51 ^ i54)) & ((-1) - ((-1) - (((-1) - i51) | ((-1) - i54)))))) * 305;
                int i56 = (i50 ^ i55) + ((i50 & i55) << 1);
                int i57 = ~i47;
                int i58 = ~((i57 + offsetAfter) - (i57 & offsetAfter));
                int i59 = 1053310288 ^ i58;
                int i60 = (i58 + 1053310288) - (i58 | 1053310288);
                int i61 = -(-(((i60 + i59) - (i60 & i59)) * 305));
                int i62 = (((i56 + i61) - (i56 & i61)) << 1) - (i61 ^ i56);
                int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i63 = packedPositionType * (-523);
                int i64 = (i63 ^ 2034754497) + ((i63 & 2034754497) << 1);
                int i65 = ~packedPositionType;
                int i66 = i65 ^ 1003907831;
                int i67 = (i65 + 1003907831) - (i65 | 1003907831);
                int i68 = ~((i66 + i67) - (i66 & i67));
                int i69 = ((-1003907832) ^ packedPositionType) | ((-1003907832) & packedPositionType);
                int i70 = (~i69) | i68;
                int i71 = (-1003907832) ^ iElapsedRealtime;
                int i72 = (-1) - (((-1) - (-1003907832)) | ((-1) - iElapsedRealtime));
                int i73 = ~((i71 + i72) - (i71 & i72));
                int i74 = -(-(((-1) - (((-1) - (i70 ^ i73)) & ((-1) - ((-1) - (((-1) - i70) | ((-1) - i73)))))) * 262));
                int i75 = ((i64 | i74) << 1) - (i64 ^ i74);
                int i76 = -(-((~i69) * (-786)));
                int i77 = (i75 & i76) + (i76 | i75);
                int i78 = (~((-1) - (((-1) - (-1003907832)) & ((-1) - (~iElapsedRealtime))))) | (~((i65 + 1003907831) - (i65 & 1003907831)));
                int i79 = (-1003907832) ^ packedPositionType;
                int i80 = (-1) - (((-1) - (-1003907832)) | ((-1) - packedPositionType));
                int i81 = ~((i80 + i79) - (i80 & i79));
                int i82 = i78 ^ i81;
                int i83 = (-1) - (((-1) - i81) | ((-1) - i78));
                int i84 = ((i83 + i82) - (i83 & i82)) * 262;
                int i85 = (i77 ^ i84) + (((i84 + i77) - (i84 | i77)) << 1);
                Object[] objArr5 = new Object[1];
                r(trimmedLength, i45, b2, i62, i85, objArr5);
                objArr = (Object[]) Array.newInstance(Class.forName((String) objArr5[0]), 2);
                int i86 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i87 = ~i86;
                int i88 = ~(((-1) - (((-1) - (-65004)) | ((-1) - i87))) | (i87 ^ (-65004)));
                int i89 = iMaxMemory ^ i88;
                int i90 = i88 & iMaxMemory;
                int i91 = (i90 + i89) - (i90 & i89);
                int i92 = ~((-1) - (((-1) - (i86 ^ 65003)) & ((-1) - ((-1) - (((-1) - i86) | ((-1) - 65003))))));
                int i93 = (((i86 * (-375)) - 24376125) - (~((((i91 + i92) - (i91 | i92)) | (i91 ^ i92)) * IptcDirectory.TAG_ARM_IDENTIFIER))) - 1;
                int i94 = ~iMaxMemory;
                int i95 = i94 ^ i86;
                int i96 = (i94 + i86) - (i94 | i86);
                int i97 = ~((i96 + i95) - (i96 & i95));
                int i98 = ~((-1) - (((-1) - i86) & ((-1) - 65003)));
                int i99 = i93 + ((((-1) - (((-1) - i98) | ((-1) - i97))) | (i97 ^ i98)) * (-376));
                int i100 = ~((-1) - (((-1) - i87) & ((-1) - iMaxMemory)));
                int i101 = i100 ^ 65003;
                int i102 = (-1) - (((-1) - i100) | ((-1) - 65003));
                int i103 = ((i102 + i101) - (i102 & i101)) * IptcDirectory.TAG_ARM_IDENTIFIER;
                int i104 = (i99 & i103) + (i103 | i99);
                objArr2 = new Object[1];
                s("ᕽ\ue89b\ueed5\uecbe\ue2fc\ue0cd\ue6ce\ue43c﨏\uf819︰ﱣ\uf25f\uf1b3\uf791\uf59c쮢짪쾅촎쌌석읾알\ue7ea9\udccc튴킷훴퓧", i104, objArr2);
            } catch (Throwable unused) {
            }
            try {
                Object[] objArr6 = {(String) objArr2[0]};
                int i105 = -(-TextUtils.lastIndexOf("", '0', 0));
                short s2 = (short) (((1 | i105) << 1) - (i105 ^ 1));
                int iRgb = Color.rgb(0, 0, 0);
                int priority = Thread.currentThread().getPriority();
                int i106 = iRgb * (-515);
                int i107 = ((i106 + 83827142) - (i106 | 83827142)) + ((-1) - (((-1) - i106) & ((-1) - 83827142)));
                int i108 = (-16777103) ^ priority;
                int i109 = (-16777103) & priority;
                int i110 = ~((i109 + i108) - (i109 & i108));
                int i111 = ~((-1) - (((-1) - (~priority)) & ((-1) - iRgb)));
                int i112 = i110 ^ i111;
                int i113 = i110 & i111;
                int i114 = (i113 + i112) - (i113 & i112);
                int i115 = ~priority;
                int i116 = (i107 - (~(((-1) - (((-1) - i114) & ((-1) - (~((-1) - (((-1) - i115) & ((-1) - 16777102))))))) * (-516)))) - 1;
                int i117 = ~iRgb;
                int i118 = (i117 ^ (-16777103)) | ((-16777103) & i117);
                int i119 = ~((-1) - (((-1) - (i118 ^ priority)) & ((-1) - (priority & i118))));
                int i120 = ~iRgb;
                int i121 = (-1) - (((-1) - ((i120 + i115) - (i120 | i115))) & ((-1) - (i120 ^ i115)));
                int i122 = i121 ^ 16777102;
                int i123 = (-1) - (((-1) - i121) | ((-1) - 16777102));
                int i124 = ~((i123 + i122) - (i123 & i122));
                int i125 = ((-1) - (((-1) - ((-1) - (((-1) - i119) | ((-1) - i124)))) & ((-1) - (i119 ^ i124)))) * 516;
                int i126 = ~((-1) - (((-1) - (i117 ^ 16777102)) & ((-1) - (i117 & 16777102))));
                int i127 = ~((-1) - (((-1) - (i115 ^ 16777102)) & ((-1) - (i115 & 16777102))));
                int i128 = (((i116 & i125) + (i125 | i116)) - (~(((-1) - (((-1) - ((i126 + i127) - (i126 | i127))) & ((-1) - (i126 ^ i127)))) * 516))) - 1;
                byte scrollDefaultDelay = (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i129 = -TextUtils.lastIndexOf("", '0', 0, 0);
                Object[] objArr7 = new Object[1];
                r(s2, i128, scrollDefaultDelay, (i129 & (-1053310290)) + ((-1) - (((-1) - i129) & ((-1) - (-1053310290)))), 1003907830 - (~View.MeasureSpec.getMode(0)), objArr7);
                objArr[0] = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                short size = (short) View.MeasureSpec.getSize(0);
                int i130 = -(ViewConfiguration.getTouchSlop() >> 8);
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int i131 = i130 * (-716);
                int i132 = ~i130;
                int i133 = (((i131 | (-163590)) << 1) - (i131 ^ (-163590))) + (((-114) | i132) * (-1434));
                int i134 = ~((-1) - (((-1) - (~iElapsedRealtime2)) & ((-1) - (-114))));
                int i135 = (i130 ^ (-114)) | ((-114) & i130);
                int i136 = ~i135;
                int i137 = i134 ^ i136;
                int i138 = i134 & i136;
                int i139 = (i138 + i137) - (i138 & i137);
                int i140 = ~i130;
                int i141 = i140 ^ 113;
                int i142 = i140 & 113;
                int i143 = (i142 + i141) - (i142 & i141);
                int i144 = ~(((i143 + iElapsedRealtime2) - (i143 | iElapsedRealtime2)) | (i143 ^ iElapsedRealtime2));
                int i145 = -(-(((i144 + i139) - (i144 & i139)) * 717));
                int i146 = (((i133 + i145) - (i133 & i145)) << 1) - (i145 ^ i133);
                int i147 = i132 | 113;
                int i148 = ~iElapsedRealtime2;
                int i149 = ~((-1) - (((-1) - ((i147 + i148) - (i147 | i148))) & ((-1) - (i147 ^ i148))));
                int i150 = ~i135;
                int i151 = (i149 + i150) - (i149 & i150);
                int i152 = ~((iElapsedRealtime2 & (-114)) | (iElapsedRealtime2 ^ (-114)));
                int i153 = i151 ^ i152;
                int i154 = (-1) - (((-1) - i151) | ((-1) - i152));
                int i155 = -(-(((i154 + i153) - (i154 & i153)) * 717));
                int i156 = ((-1) - (((-1) - i146) | ((-1) - i155))) + ((i155 + i146) - (i155 & i146));
                int i157 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int i158 = ~i157;
                int i159 = (((i157 * (-665)) - 334) - (~(-(-(i158 * (-333)))))) - 1;
                int i160 = ~i2;
                int i161 = ~((-1) - (((-1) - (i158 & i160)) & ((-1) - (i158 ^ i160))));
                int i162 = ~((-1) - (((-1) - (i2 ^ (-1))) & ((-1) - i2)));
                int i163 = i161 ^ i162;
                int i164 = (i161 + i162) - (i161 | i162);
                int i165 = -(-(((i164 + i163) - (i164 & i163)) * 333));
                int i166 = (i159 ^ i165) + (((i159 + i165) - (i159 | i165)) << 1);
                int i167 = ~i157;
                int i168 = ~(((-1) - (((-1) - i167) | ((-1) - i2))) | (i167 ^ i2));
                int i169 = ~((~i160) | i160);
                int i170 = (((i168 + i169) - (i168 | i169)) | (i168 ^ i169)) * 333;
                byte b3 = (byte) (((i166 + i170) - (i166 | i170)) + ((i170 + i166) - (i170 & i166)));
                int iMyTid = Process.myTid() >> 22;
                int i171 = (((-1) - (((-1) - iMyTid) & ((-1) - (-1053310328)))) << 1) - (iMyTid ^ (-1053310328));
                int offsetBefore = TextUtils.getOffsetBefore("", 0);
                int i172 = f19415d * 208298182;
                f19415d = i172;
                int i173 = offsetBefore * 450;
                int i174 = (i173 ^ 1220840768) + (((-1) - (((-1) - i173) | ((-1) - 1220840768))) << 1);
                int i175 = ~offsetBefore;
                int i176 = i175 ^ 1003907869;
                int i177 = (i175 + 1003907869) - (i175 | 1003907869);
                int i178 = ~((i176 + i177) - (i176 & i177));
                int i179 = ((-1003907870) ^ offsetBefore) | (((-1003907870) + offsetBefore) - ((-1003907870) | offsetBefore));
                int i180 = i179 ^ i172;
                int i181 = (-1) - (((-1) - i179) | ((-1) - i172));
                int i182 = ~((i180 + i181) - (i180 & i181));
                int i183 = -(-(((i178 + i182) - (i178 & i182)) * 449));
                int i184 = ((-1) - (((-1) - i174) | ((-1) - i183))) + (i174 | i183);
                int i185 = (i175 ^ 1003907869) | ((-1) - (((-1) - i175) | ((-1) - 1003907869)));
                int i186 = (~i185) * (-1347);
                int i187 = (i184 ^ i186) + ((i186 & i184) << 1);
                int i188 = ~i185;
                int i189 = ~i172;
                int i190 = (-1003907870) ^ i189;
                int i191 = (-1003907870) & i189;
                int i192 = (i191 + i190) - (i191 & i190);
                int i193 = i192 ^ offsetBefore;
                int i194 = (-1) - (((-1) - i192) | ((-1) - offsetBefore));
                int i195 = ~((i194 + i193) - (i194 & i193));
                int i196 = i188 ^ i195;
                int i197 = (i195 + i188) - (i195 | i188);
                Object[] objArr8 = new Object[1];
                r(size, i156, b3, i171, (i187 - (~(-(-(((i197 + i196) - (i197 & i196)) * 449))))) - 1, objArr8);
                try {
                    objArr3 = new Object[]{(String) objArr8[0]};
                    jumpTapTimeout = (short) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    i4 = (-115) - (~(-View.combineMeasuredStates(0, 0)));
                    bIndexOf = (byte) TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                    int i198 = f19412a * 1960881994;
                    f19412a = i198;
                    int i199 = (iIndexOf * 85) - (-662938736);
                    int i200 = ~iIndexOf;
                    int i201 = ~((-1) - (((-1) - (i200 ^ 1053310287)) & ((-1) - ((i200 + 1053310287) - (1053310287 | i200)))));
                    int i202 = ~i198;
                    int i203 = ~((i200 ^ i202) | ((-1) - (((-1) - i200) | ((-1) - i202))));
                    int i204 = i201 ^ i203;
                    int i205 = i203 & i201;
                    int i206 = (i205 + i204) - (i205 & i204);
                    int i207 = ~i198;
                    int i208 = ~((1053310287 + i207) - (1053310287 & i207));
                    int i209 = (i208 & i206) | (i206 ^ i208);
                    int i210 = iIndexOf | (-1053310288);
                    int i211 = i210 ^ i198;
                    int i212 = i210 & i198;
                    int i213 = ~((i211 + i212) - (i211 & i212));
                    int i214 = ((-1) - (((-1) - (i209 ^ i213)) & ((-1) - ((i209 + i213) - (i209 | i213))))) * (-84);
                    int i215 = (((-1) - (((-1) - i199) & ((-1) - i214))) << 1) - (i214 ^ i199);
                    int i216 = 1053310287 ^ i198;
                    int i217 = 1053310287 & i198;
                    int i218 = ~((i217 + i216) - (i217 & i216));
                    int i219 = iIndexOf ^ i218;
                    int i220 = i218 & iIndexOf;
                    int i221 = (i220 + i219) - (i220 & i219);
                    int i222 = i207 ^ (-1053310288);
                    int i223 = (-1) - (((-1) - i207) | ((-1) - (-1053310288)));
                    int i224 = ~((i222 + i223) - (i222 & i223));
                    i5 = i215 + (((-1) - (((-1) - ((i221 + i224) - (i221 | i224))) & ((-1) - (i221 ^ i224)))) * (-84));
                    int i225 = ~(i207 | (-1053310288));
                    int i226 = ~((iIndexOf ^ (-1053310288)) | ((-1) - (((-1) - iIndexOf) | ((-1) - (-1053310288)))));
                    int i227 = i225 ^ i226;
                    int i228 = (-1) - (((-1) - i225) | ((-1) - i226));
                    i6 = -(-(((i228 + i227) - (i228 & i227)) * 84));
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    Object[] objArr9 = new Object[1];
                    r(jumpTapTimeout, i4, bIndexOf, (((i5 + i6) - (i5 & i6)) << 1) - (i6 ^ i5), 1003907831 - Color.green(0), objArr9);
                    objArr[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                    try {
                        short keyRepeatDelay = (short) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i229 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i230 = i229 * IptcDirectory.TAG_OBJECT_PREVIEW_DATA;
                        int i231 = ((i230 + 81880) - (i230 | 81880)) + ((i230 + 81880) - (i230 & 81880));
                        int i232 = ~i229;
                        int i233 = ~((-1) - (((-1) - (i232 & i160)) & ((-1) - (i232 ^ i160))));
                        int i234 = ~i229;
                        int i235 = ~((i234 - 115) - (i234 & (-115)));
                        int i236 = (-1) - (((-1) - ((-1) - (((-1) - i233) | ((-1) - i235)))) & ((-1) - (i233 ^ i235)));
                        int i237 = 114 ^ i229;
                        int i238 = i229 & 114;
                        int i239 = (i238 + i237) - (i238 & i237);
                        int i240 = i239 ^ i2;
                        int i241 = (-1) - (((-1) - i239) | ((-1) - i2));
                        int i242 = ~((i241 + i240) - (i241 & i240));
                        int i243 = i236 ^ i242;
                        int i244 = i236 & i242;
                        int i245 = -(-(((i244 + i243) - (i244 & i243)) * (-713)));
                        int i246 = (i231 ^ i245) + (((-1) - (((-1) - i245) | ((-1) - i231))) << 1);
                        int i247 = i242 * 1426;
                        int i248 = (i246 ^ i247) + (((-1) - (((-1) - i247) | ((-1) - i246))) << 1);
                        int i249 = ~i2;
                        int i250 = (~(((-1) - (((-1) - 114) | ((-1) - i249))) | (114 ^ i249))) * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION;
                        int i251 = (((-1) - (((-1) - i248) | ((-1) - i250))) << 1) + (i248 ^ i250);
                        byte scrollDefaultDelay2 = (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i252 = (-1053310298) - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                        int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                        int i253 = doubleTapTimeout * 1773;
                        int i254 = (((i253 + 599738772) - (i253 & 599738772)) << 1) - (i253 ^ 599738772);
                        int i255 = ~doubleTapTimeout;
                        int i256 = i255 ^ (-1003907901);
                        int i257 = i255 & (-1003907901);
                        int i258 = ~((i257 + i256) - (i257 & i256));
                        int i259 = (-1003907901) ^ i2;
                        int i260 = (-1) - (((-1) - (-1003907901)) | ((-1) - i2));
                        int i261 = ~((i260 + i259) - (i260 & i259));
                        int i262 = i258 ^ i261;
                        int i263 = (-1) - (((-1) - i258) | ((-1) - i261));
                        int i264 = (i263 + i262) - (i263 & i262);
                        int i265 = ~((-1) - (((-1) - ((i160 + doubleTapTimeout) - (i160 & doubleTapTimeout))) & ((-1) - 1003907900)));
                        int i266 = i254 + (((i264 ^ i265) | ((i264 + i265) - (i264 | i265))) * 886);
                        int i267 = i249 ^ 1003907900;
                        int i268 = (-1) - (((-1) - i249) | ((-1) - 1003907900));
                        int i269 = ~((i267 + i268) - (i267 & i268));
                        int i270 = doubleTapTimeout ^ i269;
                        int i271 = i269 & doubleTapTimeout;
                        int i272 = ((i271 + i270) - (i271 & i270)) * (-1772);
                        int i273 = ((i266 + i272) - (i266 | i272)) + (i272 | i266);
                        int i274 = (~((-1) - (((-1) - ((i249 + doubleTapTimeout) - (i249 | doubleTapTimeout))) & ((-1) - (i249 ^ doubleTapTimeout))))) * 886;
                        Object[] objArr10 = new Object[1];
                        r(keyRepeatDelay, i251, scrollDefaultDelay2, i252, (i273 ^ i274) + ((i274 & i273) << 1), objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        s("ᕙ㥴䴔釣ꗣ즶ᱏ‖琡飼겥\uf35aݤ⬼翋莚ힼ", 11311 - (~(-(-TextUtils.indexOf((CharSequence) "", '0', 0)))), objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            int i275 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i276 = i275 * 375;
                            int i277 = (((i276 + 747) - (747 & i276)) << 1) - (i276 ^ 747);
                            int i278 = ~i275;
                            int i279 = (~((-1) - (((-1) - (i160 ^ i275)) & ((-1) - (i160 & i275))))) * (-374);
                            int i280 = (((i277 ^ i279) + (((i277 + i279) - (i277 | i279)) << 1)) - (~(-(-((~i275) * 748))))) - 1;
                            int i281 = ~i278;
                            int i282 = i160 ^ i275;
                            int i283 = (i275 + i160) - (i275 | i160);
                            int i284 = ((-1) - (((-1) - (~((i283 + i282) - (i283 & i282)))) & ((-1) - i281))) * 374;
                            int i285 = -(-Color.green(0));
                            int i286 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int threadPriority = Process.getThreadPriority(0);
                            int i287 = -(((threadPriority ^ 20) + (((-1) - (((-1) - threadPriority) | ((-1) - 20))) << 1)) >> 6);
                            int iResolveSize = View.resolveSize(0, 0);
                            Object[] objArr12 = new Object[1];
                            r((short) ((i280 ^ i284) + ((i284 & i280) << 1)), (((-1) - (((-1) - i285) & ((-1) - (-114)))) << 1) - (i285 ^ (-114)), (byte) ((i286 ^ (-1)) + (i286 << 1)), ((i287 - 1053310298) - (i287 | (-1053310298))) + ((-1) - (((-1) - i287) & ((-1) - (-1053310298)))), ((iResolveSize + 1003907900) - (iResolveSize | 1003907900)) + ((-1) - (((-1) - 1003907900) & ((-1) - iResolveSize))), objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            int i288 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            short s3 = (short) (((i288 + 1) - (1 | i288)) + ((-1) - (((-1) - i288) & ((-1) - 1))));
                            int i289 = -Gravity.getAbsoluteGravity(0, 0);
                            int i290 = i289 * 784;
                            int i291 = ((i290 ^ 89148) + (((i290 + 89148) - (i290 | 89148)) << 1)) - 88479;
                            int i292 = ~i289;
                            int i293 = i292 ^ i160;
                            int i294 = (i292 + i160) - (i292 | i160);
                            int i295 = (i293 + i294) - (i293 & i294);
                            int i296 = (i291 - (~(-(-((~((i295 & (-114)) | (i295 ^ (-114)))) * (-783)))))) - 1;
                            int i297 = ~((i160 ^ (-114)) | ((-114) & i160));
                            int i298 = i296 + (((i292 & i297) | (i292 ^ i297)) * 783);
                            byte windowTouchSlop = (byte) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i299 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            Object[] objArr13 = new Object[1];
                            r(s3, i298, windowTouchSlop, ((i299 - 1053310291) - (i299 | (-1053310291))) + ((i299 - 1053310291) - (i299 & (-1053310291))), 1003907922 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                int defaultSize = View.getDefaultSize(0, 0);
                                int i300 = f19413b * 196936811;
                                f19413b = i300;
                                int i301 = (defaultSize * (-1975)) + 54176431;
                                int i302 = ~defaultSize;
                                int i303 = (-1) - (((-1) - ((i302 + 54779) - (i302 | 54779))) & ((-1) - (i302 ^ 54779)));
                                int i304 = -(-(((~i303) | i300) * 988));
                                int i305 = (i301 & i304) + (i301 | i304);
                                int i306 = ~(((-54780) & defaultSize) | ((-54780) ^ defaultSize));
                                int i307 = ~i300;
                                int i308 = ((-1) - (((-1) - (~((-1) - (((-1) - defaultSize) & ((-1) - i307))))) & ((-1) - i306))) * (-1976);
                                int i309 = ((i305 + i308) - (i305 | i308)) + ((i308 + i305) - (i308 & i305));
                                int i310 = ~i303;
                                int i311 = ~((i300 - 54780) - (i300 & (-54780)));
                                int i312 = (-1) - (((-1) - ((i311 + i310) - (i311 | i310))) & ((-1) - (i310 ^ i311)));
                                int i313 = i307 ^ 54779;
                                int i314 = (i307 + 54779) - (i307 | 54779);
                                int i315 = ~((i313 + i314) - (i313 & i314));
                                Object[] objArr15 = new Object[1];
                                s("ᕟ삫뺬钽䊽㢰ᚸ쳍명邂亞⒃ኟ죯꛰鲥䫾\u20f8Ặ\uf4cfꋃ飊盇Ⳓ\u1ad1\uf0d8긍萦爤⠰سﰾꨬ", i309 + ((((i312 + i315) - (i312 | i315)) | (i312 ^ i315)) * 988), objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int i316 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                Object[] objArr16 = new Object[1];
                                s("ᕙ仸ꈌއ篓\udf72ょ鐪졁ⷠ脩\ue551廼눖", (((-1) - (((-1) - i316) & ((-1) - 23459))) << 1) - (i316 ^ 23459), objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int i317 = -KeyEvent.getDeadChar(0, 0);
                                int iMyTid2 = Process.myTid();
                                int i318 = i317 * (-496);
                                int i319 = ~i317;
                                int i320 = (((i318 | (-5264048)) << 1) - (i318 ^ (-5264048))) + ((~((-1) - (((-1) - (i319 ^ (-10614))) & ((-1) - ((-10614) & i319))))) * 497);
                                int i321 = ~i317;
                                int i322 = i321 ^ (-10614);
                                int i323 = i321 & (-10614);
                                int i324 = (i322 + i323) - (i322 & i323);
                                int i325 = ~((-1) - (((-1) - ((-1) - (((-1) - i324) | ((-1) - iMyTid2)))) & ((-1) - (i324 ^ iMyTid2))));
                                int i326 = ~iMyTid2;
                                int i327 = ((i326 - 10614) - (i326 | (-10614))) | ((-10614) ^ i326);
                                int i328 = ~(((-1) - (((-1) - i327) | ((-1) - i317))) | (i327 ^ i317));
                                int i329 = i320 + (((-1) - (((-1) - (i325 & i328)) & ((-1) - (i325 ^ i328)))) * 497);
                                int i330 = ~iMyTid2;
                                int i331 = ~(((i321 + i330) - (i321 | i330)) | (i321 ^ i330));
                                int i332 = ~(i319 | 10613);
                                int i333 = i331 ^ i332;
                                int i334 = i332 & i331;
                                int i335 = (i334 + i333) - (i334 & i333);
                                int i336 = (-10614) ^ i317;
                                int i337 = (i317 - 10614) - (i317 | (-10614));
                                int i338 = (i337 + i336) - (i337 & i336);
                                int i339 = -(-(((~((-1) - (((-1) - ((-1) - (((-1) - i338) | ((-1) - iMyTid2)))) & ((-1) - (i338 ^ iMyTid2))))) | i335) * 497));
                                int i340 = (i329 & i339) + ((-1) - (((-1) - i339) & ((-1) - i329)));
                                Object[] objArr17 = new Object[1];
                                s("ᕟ㰥䞰椓낅\uda1e\uede4㜣廵恌诂\udd4d\ue427ྡ儬磋舞햖Ｊہ⡻珄蕛곜\uf7a1ᤶₕ䨇鶔꜐", i340, objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                short mode = (short) View.MeasureSpec.getMode(0);
                                int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                                byte packedPositionGroup = (byte) ExpandableListView.getPackedPositionGroup(0L);
                                int i341 = -KeyEvent.keyCodeFromString("");
                                int i342 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                Object[] objArr18 = new Object[1];
                                r(mode, (tapTimeout ^ (-114)) + (((-1) - (((-1) - tapTimeout) | ((-1) - (-114)))) << 1), packedPositionGroup, (((-1) - (((-1) - i341) & ((-1) - (-1053310280)))) << 1) - (i341 ^ (-1053310280)), (((-1) - (((-1) - i342) & ((-1) - 1003907936))) << 1) - (i342 ^ 1003907936), objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i343 = 0;
                                while (i343 < length) {
                                    Object obj = objArr19[i343];
                                    int scrollDefaultDelay3 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                    int i344 = f19419h * (-1642264361);
                                    f19419h = i344;
                                    int i345 = scrollDefaultDelay3 * 51;
                                    int i346 = (i345 ^ (-843143)) + ((i345 & (-843143)) << 1);
                                    int i347 = -(-(((-1) - (((-1) - (scrollDefaultDelay3 ^ i344)) & ((-1) - (scrollDefaultDelay3 & i344)))) * (-50)));
                                    int i348 = (i346 ^ i347) + ((i347 & i346) << 1);
                                    int i349 = ~scrollDefaultDelay3;
                                    int i350 = (-1) - (((-1) - ((i349 - 17208) - (i349 | (-17208)))) & ((-1) - (i349 ^ (-17208))));
                                    int i351 = i350 ^ i344;
                                    int i352 = (i350 + i344) - (i350 | i344);
                                    int i353 = ~((i352 + i351) - (i352 & i351));
                                    int i354 = ~i344;
                                    int i355 = (-17208) ^ i354;
                                    int i356 = (-17208) & i354;
                                    int i357 = ~((-1) - (((-1) - ((i355 + i356) - (i355 & i356))) & ((-1) - scrollDefaultDelay3)));
                                    int i358 = ((-1) - (((-1) - (i353 ^ i357)) & ((-1) - ((-1) - (((-1) - i353) | ((-1) - i357)))))) * 50;
                                    int i359 = ((-1) - (((-1) - i348) | ((-1) - i358))) + ((i358 + i348) - (i358 & i348));
                                    int i360 = ~((-1) - (((-1) - (((-17208) + i354) - ((-17208) | i354))) & ((-1) - ((-17208) ^ i354))));
                                    int i361 = ~((-1) - (((-1) - ((-17208) & scrollDefaultDelay3)) & ((-1) - ((-17208) ^ scrollDefaultDelay3))));
                                    int i362 = ((i360 + i361) - (i360 | i361)) | (i360 ^ i361);
                                    int i363 = i354 ^ scrollDefaultDelay3;
                                    int i364 = (scrollDefaultDelay3 + i354) - (scrollDefaultDelay3 | i354);
                                    int i365 = ~((i364 + i363) - (i364 & i363));
                                    int i366 = ((-1) - (((-1) - (i365 & i362)) & ((-1) - (i362 ^ i365)))) * 50;
                                    Object[] objArr20 = new Object[1];
                                    s("ᕦ嘧鍥\udcab\u19db", (i359 & i366) + (i366 | i359), objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        int i367 = -(Process.myTid() >> 22);
                                        int i368 = (((i367 + 40867) - (i367 & 40867)) << 1) - (i367 ^ 40867);
                                        Object[] objArr22 = new Object[1];
                                        s("ᕔ諼⨎쮶殜ୢꢉ䠨\ue853觷⤉쥋滣๗꾷俖\uef7c貙ⱦ챤淧ഓ굈䋲\ue210莼⏓썮悞,ꁢ䇢\ue13d腉⛷옅枫", i368, objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        int iMyPid = Process.myPid() >> 22;
                                        int i369 = f19421j * 1924197053;
                                        f19421j = i369;
                                        int i370 = iMyPid * 141;
                                        int i371 = ((i370 | (-358481)) << 1) - (i370 ^ (-358481));
                                        int i372 = ~iMyPid;
                                        int i373 = ~(((i372 + 2579) - (2579 | i372)) | (i372 ^ 2579));
                                        int i374 = ~((-1) - (((-1) - (i372 ^ i369)) & ((-1) - ((-1) - (((-1) - i372) | ((-1) - i369))))));
                                        int i375 = ((i373 ^ i374) | ((-1) - (((-1) - i373) | ((-1) - i374)))) * (-280);
                                        int i376 = (i371 ^ i375) + ((i371 & i375) << 1);
                                        int i377 = ~((-2580) | i369);
                                        int i378 = i374 ^ i377;
                                        int i379 = (-1) - (((-1) - i377) | ((-1) - i374));
                                        int i380 = ((i378 + i379) - (i378 & i379)) * 140;
                                        int i381 = (i376 ^ i380) + (((i376 + i380) - (i376 | i380)) << 1);
                                        int i382 = (-1) - (((-1) - ((-1) - (((-1) - i372) | ((-1) - (-2580))))) & ((-1) - (i372 ^ (-2580))));
                                        int i383 = ~(((-1) - (((-1) - i382) | ((-1) - i369))) | (i382 ^ i369));
                                        int i384 = ~i369;
                                        int i385 = i372 ^ i384;
                                        int i386 = (i384 + i372) - (i384 | i372);
                                        int i387 = (i385 + i386) - (i385 & i386);
                                        int i388 = ~((i387 + 2579) - (i387 & 2579));
                                        int i389 = (i383 & i388) | (i383 ^ i388);
                                        int i390 = ~i369;
                                        int i391 = (i390 - 2580) - (i390 & (-2580));
                                        int i392 = ~((iMyPid & i391) | (i391 ^ iMyPid));
                                        int i393 = (i381 - (~(((-1) - (((-1) - (i389 & i392)) & ((-1) - (i389 ^ i392)))) * 140))) - 1;
                                        Object[] objArr23 = new Object[1];
                                        s("ᕙὈŬ\u0b4e㴜✒⤸叚䗈俶燥", i393, objArr23);
                                        Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                        try {
                                            int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                            Object[] objArr24 = new Object[1];
                                            s("ᕟ\ue6ab\uf2ac캽\udabd횰ꊸ뻍誅蚂銞溃窟盯䋰庥⫾⛸㊶໌᫋ᛎ\ue2c2ﻒ쫂웈툲긢", ((scrollBarFadeDuration + 62459) - (scrollBarFadeDuration | 62459)) + ((-1) - (((-1) - scrollBarFadeDuration) & ((-1) - 62459))), objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            Object[] objArr25 = new Object[1];
                                            s("ᕊ삎뻂铚䈶㠀ᙅ챕뮴醈俱", 54750 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))))), objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                int i394 = -ExpandableListView.getPackedPositionGroup(0L);
                                                Object[] objArr27 = new Object[1];
                                                s("ᕔ諼⨎쮶殜ୢꢉ䠨\ue853觷⤉쥋滣๗꾷俖\uef7c貙ⱦ챤淧ഓ굈䋲\ue210莼⏓썮悞,ꁢ䇢\ue13d腉⛷옅枫", (((i394 + 40867) - (i394 & 40867)) << 1) - (i394 ^ 40867), objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                short sMyTid = (short) (Process.myTid() >> 22);
                                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) - 114;
                                                byte bIndexOf2 = (byte) TextUtils.indexOf("", "", 0, 0);
                                                int offsetAfter2 = TextUtils.getOffsetAfter("", 0);
                                                Object[] objArr28 = new Object[1];
                                                r(sMyTid, iCombineMeasuredStates, bIndexOf2, ((-1) - (((-1) - offsetAfter2) | ((-1) - (-1053310292)))) + (offsetAfter2 | (-1053310292)), View.MeasureSpec.getMode(0) + 1003907947, objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr.length;
                                                int i395 = 0;
                                                for (int i396 = 2; i395 < i396; i396 = 2) {
                                                    Object obj2 = objArr[i395];
                                                    try {
                                                        int i397 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int i398 = (i397 ^ 54829) + ((i397 & 54829) << 1);
                                                        Object[] objArr29 = new Object[1];
                                                        s("ᕔ썲뤒韘䶤㮬ၕ칦ꐣ鋙䢕⚥Ὓ\uf559ꌫ駸瞜\u2db7ᨺ\uf031꺏蒿狙⭶ţＩ험菨禴噎ఛ館탪躖", i398, objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        short scrollDefaultDelay4 = (short) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                        int i399 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                        int i400 = (i399 ^ (-114)) + ((i399 & (-114)) << 1);
                                                        byte mode2 = (byte) View.MeasureSpec.getMode(0);
                                                        int i401 = -KeyEvent.keyCodeFromString("");
                                                        int i402 = i401 * 375;
                                                        int i403 = (i402 ^ 843772956) + (((i402 + 843772956) - (i402 | 843772956)) << 1);
                                                        int i404 = ~i401;
                                                        int i405 = ~((i404 ^ (-1053310292)) | ((-1053310292) & i404));
                                                        int i406 = ~(i160 | i401);
                                                        int i407 = i405 ^ i406;
                                                        int i408 = (i406 + i405) - (i406 | i405);
                                                        int i409 = i403 + (((i407 + i408) - (i407 & i408)) * (-374));
                                                        int i410 = 1053310291 ^ i401;
                                                        int i411 = 1053310291 & i401;
                                                        int i412 = i409 + ((~((i411 + i410) - (i411 & i410))) * 748);
                                                        int i413 = ~((-1) - (((-1) - ((1053310291 + i404) - (1053310291 | i404))) & ((-1) - (i404 ^ 1053310291))));
                                                        int i414 = ~(((-1) - (((-1) - i401) | ((-1) - i160))) | (i160 ^ i401));
                                                        int i415 = i412 + (((-1) - (((-1) - (i413 & i414)) & ((-1) - (i413 ^ i414)))) * 374);
                                                        int i416 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                        Object[] objArr30 = new Object[1];
                                                        r(scrollDefaultDelay4, i400, mode2, i415, ((i416 | 1003907966) << 1) - (i416 ^ 1003907966), objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            int i417 = ~(1 & i2);
                                                            int i418 = 1 | i2;
                                                            int[] iArr = new int[1];
                                                            Object[] objArr31 = {iArr, new int[]{i2}, null, new int[]{(i417 + i418) - (i417 | i418)}};
                                                            int i419 = f19427p * 881874077;
                                                            f19427p = i419;
                                                            int i420 = ~((-1) - (((-1) - (-1030108522)) & ((-1) - (~i419))));
                                                            int i421 = (((((-1040088572) + i420) - ((-1040088572) & i420)) | (~((1030108521 + i419) - (1030108521 & i419)))) * (-338)) + 1315528957 + (((~((-1) - (((-1) - i419) & ((-1) - (-9980051))))) | i420) * ExifDirectoryBase.TAG_EXTRA_SAMPLES) + 16;
                                                            int i422 = f19420i * 602472583;
                                                            f19420i = i422;
                                                            int i423 = (i421 * 141) + (i3 * (-139));
                                                            int i424 = ~i421;
                                                            int i425 = ~((-1) - (((-1) - (i424 ^ i3)) & ((-1) - (i424 & i3))));
                                                            int i426 = ~i421;
                                                            int i427 = ~((-1) - (((-1) - i426) & ((-1) - i422)));
                                                            int i428 = i425 ^ i427;
                                                            int i429 = (i425 + i427) - (i425 | i427);
                                                            int i430 = -(-(((i429 + i428) - (i429 & i428)) * (-280)));
                                                            int i431 = (i423 ^ i430) + (((-1) - (((-1) - i423) | ((-1) - i430))) << 1);
                                                            int i432 = ~((-1) - (((-1) - (i424 ^ i422)) & ((-1) - ((-1) - (((-1) - i424) | ((-1) - i422))))));
                                                            int i433 = ~i3;
                                                            int i434 = i433 ^ i422;
                                                            int i435 = (i433 + i422) - (i433 | i422);
                                                            int i436 = ~((i435 + i434) - (i435 & i434));
                                                            int i437 = i432 ^ i436;
                                                            int i438 = (-1) - (((-1) - i432) | ((-1) - i436));
                                                            int i439 = i431 + (((i438 + i437) - (i438 & i437)) * 140);
                                                            int i440 = ~i3;
                                                            int i441 = (-1) - (((-1) - i426) & ((-1) - i440));
                                                            int i442 = ~((-1) - (((-1) - ((-1) - (((-1) - i441) | ((-1) - i422)))) & ((-1) - (i441 ^ i422))));
                                                            int i443 = (-1) - (((-1) - (~i422)) & ((-1) - i426));
                                                            int i444 = ~(((i443 + i3) - (i443 | i3)) | (i443 ^ i3));
                                                            int i445 = (i442 & i444) | (i442 ^ i444);
                                                            int i446 = ~i422;
                                                            int i447 = (-1) - (((-1) - ((i446 + i440) - (i446 | i440))) & ((-1) - (i440 ^ i446)));
                                                            int i448 = ~(((-1) - (((-1) - i447) | ((-1) - i421))) | (i447 ^ i421));
                                                            int i449 = i439 + (((-1) - (((-1) - (i448 & i445)) & ((-1) - (i445 ^ i448)))) * 140);
                                                            int i450 = i449 << 13;
                                                            int i451 = (~i450) & i449;
                                                            int i452 = i450 & (~i449);
                                                            int i453 = (i452 + i451) - (i452 & i451);
                                                            int i454 = i453 >>> 17;
                                                            int i455 = ~i454;
                                                            int i456 = (i455 + i453) - (i455 | i453);
                                                            int i457 = ~i453;
                                                            int i458 = (i457 + i454) - (i457 | i454);
                                                            int i459 = (i458 + i456) - (i458 & i456);
                                                            int i460 = i459 << 5;
                                                            int i461 = (-1) - (((-1) - (~i460)) | ((-1) - i459));
                                                            int i462 = ~i459;
                                                            int i463 = (i462 + i460) - (i462 | i460);
                                                            iArr[0] = (i463 + i461) - (i463 & i461);
                                                            return objArr31;
                                                        }
                                                        i395++;
                                                    } catch (Throwable th2) {
                                                        Throwable cause = th2.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                                int i464 = ((i343 - 32) - (i343 | (-32))) + (i343 | (-32));
                                                i343 = ((-1) - (((-1) - i464) | ((-1) - 33))) + ((i464 + 33) - (i464 & 33));
                                            } catch (Throwable th3) {
                                                Throwable cause2 = th3.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause3 = th4.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th4;
                                        }
                                    } catch (Throwable th5) {
                                        Throwable cause4 = th5.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th5;
                                    }
                                }
                                Object[] objArr32 = {new int[1], new int[]{i2}, null, new int[]{i2}};
                                int id = (int) Thread.currentThread().getId();
                                int i465 = ~id;
                                int i466 = (~((309967828 + i465) - (309967828 & i465))) | (-989723615);
                                int i467 = ~((i465 + 988115850) - (i465 & 988115850));
                                int i468 = 1693553637 + (((i467 + i466) - (i467 & i466)) * 464) + ((((-679755787) + id) - ((-679755787) & id)) * (-464));
                                int i469 = ~((id + 988115850) - (id & 988115850));
                                int i470 = (i3 - (~(i468 + (((i469 - 989723615) - (i469 & (-989723615))) * 464)))) - 1;
                                int i471 = i470 << 13;
                                int i472 = (~i471) & i470;
                                int i473 = ~i470;
                                int i474 = (-1) - (((-1) - ((i473 + i471) - (i473 | i471))) & ((-1) - i472));
                                int i475 = i474 ^ (i474 >>> 17);
                                int i476 = i475 << 5;
                                int i477 = ~i476;
                                int i478 = (i477 + i475) - (i477 | i475);
                                int i479 = ~i475;
                                ((int[]) objArr32[0])[0] = (-1) - (((-1) - ((i479 + i476) - (i479 | i476))) & ((-1) - i478));
                                return objArr32;
                            } catch (Throwable th6) {
                                Throwable cause5 = th6.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th6;
                            }
                        } catch (Throwable th7) {
                            Throwable cause6 = th7.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        Throwable cause7 = th8.getCause();
                        if (cause7 != null) {
                            throw cause7;
                        }
                        throw th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    Throwable cause8 = th.getCause();
                    if (cause8 != null) {
                        throw cause8;
                    }
                    throw th;
                }
            } catch (Throwable th10) {
                Throwable cause9 = th10.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th10;
            }
        }

        static void init$0() {
            $$a = new byte[]{3, 32, 122, 114};
            $$b = 36;
        }

        private static void r(short s2, int i2, byte b2, int i3, int i4, Object[] objArr) throws Throwable {
            long j2;
            int i5;
            boolean z2;
            int length;
            byte[] bArr;
            int i6;
            int length2;
            byte[] bArr2;
            int i7 = 2 % 2;
            j jVar = new j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(f19417f)};
                Object objA = o.d.d.a(-727631768);
                if (objA == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA = o.d.d.a(238 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.getCapsMode("", 0, 0) + 44531), 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 35969549, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                boolean z3 = iIntValue == -1;
                if (z3) {
                    byte[] bArr3 = f19424m;
                    if (bArr3 != null) {
                        int i8 = $11 + 33;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            length2 = bArr3.length;
                            bArr2 = new byte[length2];
                        } else {
                            length2 = bArr3.length;
                            bArr2 = new byte[length2];
                        }
                        for (int i9 = 0; i9 < length2; i9++) {
                            Object[] objArr3 = {Integer.valueOf(bArr3[i9])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 1;
                                byte b6 = (byte) (b5 - 1);
                                objA2 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28649), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), 1621469864, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        }
                        bArr3 = bArr2;
                    }
                    if (bArr3 != null) {
                        int i10 = $11 + 55;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            byte[] bArr4 = f19424m;
                            Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(f19418g)};
                            Object objA3 = o.d.d.a(-727631768);
                            if (objA3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objA3 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 238, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 44532), (ViewConfiguration.getEdgeSlop() >> 16) + 11, 35969549, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            long j3 = bArr4[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()];
                            i6 = ((byte) ((j3 - 7649639543924978291L) - (j3 & (-7649639543924978291L)))) >>> ((int) (((long) f19417f) * (-7649639543924978291L)));
                        } else {
                            byte[] bArr5 = f19424m;
                            Object[] objArr5 = {Integer.valueOf(i4), Integer.valueOf(f19418g)};
                            Object objA4 = o.d.d.a(-727631768);
                            if (objA4 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objA4 = o.d.d.a(238 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (44530 - ImageFormat.getBitsPerPixel(0)), MotionEvent.axisFromString("") + 12, 35969549, false, $$c(b9, b10, b10), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i6 = ((byte) (((long) bArr5[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f19417f) ^ (-7649639543924978291L)));
                        }
                        iIntValue = (byte) i6;
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f19425n[i4 + ((int) (((long) f19418g) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f19417f) ^ (-7649639543924978291L))));
                    }
                } else {
                    j2 = -7649639543924978291L;
                }
                if (iIntValue > 0) {
                    int i11 = ((i4 + iIntValue) - 2) + ((int) (((long) f19418g) ^ j2));
                    if (z3) {
                        int i12 = $11 + 13;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jVar.f19936d = i11 + i5;
                    Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f19423l), sb};
                    Object objA5 = o.d.d.a(1819197256);
                    if (objA5 == null) {
                        objA5 = o.d.d.a(Process.myPid() >> 22, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 5358), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr6 = f19424m;
                    if (bArr6 != null) {
                        int i14 = $11 + 71;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            length = bArr6.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr6.length;
                            bArr = new byte[length];
                        }
                        for (int i15 = 0; i15 < length; i15++) {
                            bArr[i15] = (byte) (((long) bArr6[i15]) ^ (-7649639543924978291L));
                        }
                        bArr6 = bArr;
                    }
                    if (bArr6 != null) {
                        int i16 = $10 + 41;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (z2) {
                            byte[] bArr7 = f19424m;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr7[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f19425n;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
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

        private static void s(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i4 = $11 + 121;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = qVar.f19948a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                        Object objA = o.d.d.a(-1011865131);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a(730 - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 7933), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, 355847088, false, $$c((byte) ($$b - 3), b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f19426o - 4743694005979712847L);
                        Object[] objArr3 = {qVar, qVar};
                        Object objA2 = o.d.d.a(1452497747);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            objA2 = o.d.d.a(836 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (27278 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, -2145994442, false, $$c((byte) 26, b3, b3), new Class[]{Object.class, Object.class});
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
                    int i6 = qVar.f19948a;
                    Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA3 = o.d.d.a(-1011865131);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 731, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7933), 11 - TextUtils.indexOf("", ""), 355847088, false, $$c((byte) ($$b - 3), b4, b4), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f19426o ^ 4743694005979712847L);
                    Object[] objArr5 = {qVar, qVar};
                    Object objA4 = o.d.d.a(1452497747);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a(KeyEvent.keyCodeFromString("") + 836, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 27279), TextUtils.indexOf("", "") + 11, -2145994442, false, $$c((byte) 26, b5, b5), new Class[]{Object.class, Object.class});
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
                    byte b6 = (byte) 0;
                    objA5 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 836, (char) (Color.blue(0) + 27279), 11 - View.MeasureSpec.getSize(0), -2145994442, false, $$c((byte) 26, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            String str3 = new String(cArr2);
            int i7 = $11 + 57;
            $10 = i7 % 128;
            if (i7 % 2 == 0) {
                objArr[0] = str3;
            } else {
                int i8 = 47 / 0;
                objArr[0] = str3;
            }
        }

        public final TransactionControl<Boolean> getAlertAllTransactionsControl() {
            int i2 = 2 % 2;
            int i3 = f19422k + 87;
            int i4 = i3 % 128;
            f19428q = i4;
            int i5 = i3 % 2;
            TransactionControl<Boolean> transactionControl = this.alertAll;
            int i6 = i4 + 23;
            f19422k = i6 % 128;
            int i7 = i6 % 2;
            return transactionControl;
        }

        public final TransactionControl<String[]> getBlacklistedMerchantTypes() {
            int i2 = 2 % 2;
            int i3 = f19428q;
            int i4 = i3 + 105;
            f19422k = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TransactionControl<String[]> transactionControl = this.types;
            int i5 = i3 + 67;
            f19422k = i5 % 128;
            int i6 = i5 % 2;
            return transactionControl;
        }

        public final TransactionControl<Boolean> getBlockAllTransactionsControl() {
            int i2 = 2 % 2;
            int i3 = f19428q;
            int i4 = i3 + 109;
            f19422k = i4 % 128;
            int i5 = i4 % 2;
            TransactionControl<Boolean> transactionControl = this.blockAll;
            int i6 = i3 + 73;
            f19422k = i6 % 128;
            int i7 = i6 % 2;
            return transactionControl;
        }
    }

    public static final class TransactionGeolocationControls {
        private final TransactionControl<Boolean> alertAll;
        private final TransactionControl<Boolean> blockAll;
        private final TransactionControl<Integer[]> countriesWhitelist;
        private final TransactionControl<String[]> statesWhitelist;

        public TransactionGeolocationControls(TransactionControl<Boolean> transactionControl, TransactionControl<Boolean> transactionControl2, TransactionControl<Integer[]> transactionControl3, TransactionControl<String[]> transactionControl4) {
            this.blockAll = transactionControl;
            this.alertAll = transactionControl2;
            this.countriesWhitelist = transactionControl3;
            this.statesWhitelist = transactionControl4;
        }

        public final TransactionControl<Boolean> getAlertAllTransactionsControl() {
            return this.alertAll;
        }

        public final TransactionControl<Boolean> getBlockAllTransactionsControl() {
            return this.blockAll;
        }

        public final TransactionControl<Integer[]> getWhitelistedCountriesControl() {
            return this.countriesWhitelist;
        }

        public final TransactionControl<String[]> getWhitelistedStatesControl() {
            return this.statesWhitelist;
        }
    }

    public static final class TransactionTypeControls {
        private final AtmTransactionControls atmTransactionControls;
        private final BrickAndMortarTransactionControls brickAndMortarTransactionControls;
        private final ContactlessTransactionControls contactlessTransactionControls;
        private final CrossBorderTransactionControls crossBorderTransactionControls;
        private final EcommerceTransactionControls ecommerceTransactionControls;
        private final RecurringTransactionControls recurringTransactionControls;

        public static final class AtmTransactionControls {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f19429a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f19430b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f19431c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static int f19432d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static int f19433e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f19434f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f19435g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static char[] f19436h = null;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static long f19437i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static char f19438j = 0;
            private final TransactionControl<Boolean> alertAll;
            private final TransactionControl<Boolean> blockAll;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(int r9, byte r10, byte r11) {
                /*
                    int r0 = r11 * 4
                    int r8 = 1 - r0
                    byte[] r7 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.TransactionTypeControls.AtmTransactionControls.$$a
                    int r6 = r10 + 102
                    int r0 = r9 * 3
                    int r5 = 3 - r0
                    byte[] r4 = new byte[r8]
                    r3 = 0
                    if (r7 != 0) goto L28
                    r0 = r6
                    r6 = r8
                    r2 = r3
                L14:
                    int r6 = r6 + r0
                    r1 = r2
                L16:
                    int r2 = r1 + 1
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    int r5 = r5 + 1
                    if (r2 != r8) goto L25
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
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.TransactionTypeControls.AtmTransactionControls.$$c(int, byte, byte):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f19433e = 1359030421;
                f19432d = -104991708;
                f19430b = -2141362692;
                f19429a = 899516302;
                f19431c = -1134743834;
                f19435g = 0;
                f19434f = 1;
                f19437i = 7132764123244223195L;
                f19436h = new char[]{64598, 64630, 64589, 64594, 64578, 64584, 64591, 64582, 64581, 64576, 64585, 64528, 64583, 64523, 64540, 64599, 64620, 64616, 64619, 64596, 64587, 64593, 64586, 64577, 64595, 64590, 64637, 64604, 64629, 64533, 64579, 64588, 64597, 64592, 64580, 64614};
                f19438j = (char) 51641;
            }

            public AtmTransactionControls(TransactionControl<Boolean> transactionControl, TransactionControl<Boolean> transactionControl2) {
                this.blockAll = transactionControl;
                this.alertAll = transactionControl2;
            }

            public static Object[] a(Context context, int i2, int i3) {
                if (context == null) {
                    int[] iArr = new int[1];
                    Object[] objArr = {iArr, new int[]{i2}, null, new int[]{i2}};
                    int i4 = (((((-1023245528) + r2) - ((-1023245528) & r2)) * (-196)) - 2137928515) + (((-1) - (((-1) - (~(((-344814738) + i2) - ((-344814738) & i2)))) & ((-1) - 678430790))) * 196);
                    int i5 = i4 * (-755);
                    int i6 = -(-(i3 * (-755)));
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = ~i4;
                    int i9 = ~i3;
                    int i10 = i8 ^ i9;
                    int i11 = (i9 + i8) - (i9 | i8);
                    int i12 = -(-((~((i11 + i10) - (i11 & i10))) * 1512));
                    int i13 = (i7 & i12) + ((-1) - (((-1) - i12) & ((-1) - i7)));
                    int i14 = ~i3;
                    int i15 = ~((-1) - (((-1) - ((i8 + i14) - (i8 | i14))) & ((-1) - (i8 ^ i14))));
                    int i16 = (i4 ^ i3) | ((-1) - (((-1) - i4) | ((-1) - i3)));
                    int i17 = i16 ^ i2;
                    int i18 = i16 & i2;
                    int i19 = ~((i18 + i17) - (i18 & i17));
                    int i20 = i15 ^ i19;
                    int i21 = (-1) - (((-1) - i15) | ((-1) - i19));
                    int i22 = ((i21 + i20) - (i21 & i20)) * (-756);
                    int i23 = (i13 ^ i22) + (((i22 + i13) - (i22 | i13)) << 1);
                    int i24 = (i3 + i4) - (i3 & i4);
                    int i25 = ~i2;
                    int i26 = -(-(((-1) - (((-1) - (i25 & i24)) & ((-1) - (i24 ^ i25)))) * 756));
                    int i27 = (i23 ^ i26) + (((i26 + i23) - (i26 | i23)) << 1);
                    int i28 = (i27 << 13) ^ i27;
                    int i29 = i28 ^ (i28 >>> 17);
                    int i30 = i29 << 5;
                    iArr[0] = (-1) - (((-1) - (i29 | i30)) | ((-1) - (~(i29 & i30))));
                    return objArr;
                }
                try {
                    int i31 = -(ViewConfiguration.getTapTimeout() >> 16);
                    Object[] objArr2 = new Object[1];
                    k("걣갉蝚⑹靐侚躟땍꒑۸닐컒\ue908䉆捵偐쮛翎䶭\u0fdc☆ᵟ깷ⴏ\u008f㪚被좕捕\ud87b픢\ue619巏\uf5f7㟡藄렭錸၆ꂡ骦낳", (((-1) - (((-1) - i31) & ((-1) - 1))) << 1) - (i31 ^ 1), objArr2);
                    Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
                    int i32 = -(-KeyEvent.getDeadChar(0, 0));
                    Object[] objArr4 = new Object[1];
                    k("暷更疁悠\uf2e5뵮䑝\uf1df嘯䉫흏ꭇ⏖낣➵㗨Ş贡।橏\uec8b\uef90\ueab0䣵쩍젿챻굟꧆⪳醩菿霖܆獒", ((-1) - (((-1) - i32) | ((-1) - 1))) + ((-1) - (((-1) - i32) & ((-1) - 1))), objArr4);
                    try {
                        Object[] objArr5 = {(String) objArr4[0]};
                        int trimmedLength = TextUtils.getTrimmedLength("");
                        int i33 = trimmedLength * 55;
                        int i34 = (i33 & (-107)) + ((-1) - (((-1) - i33) & ((-1) - (-107))));
                        int i35 = ~trimmedLength;
                        int i36 = ~((-1) - (((-1) - (i35 ^ 1)) & ((-1) - ((i35 + 1) - (i35 | 1)))));
                        int i37 = ~i2;
                        int i38 = -(-(((~((i37 + 1) - (1 & i37))) | i36) * (-108)));
                        int i39 = ((i34 + i38) - (i34 | i38)) + ((-1) - (((-1) - i38) & ((-1) - i34)));
                        int i40 = ~trimmedLength;
                        int i41 = ~((-1) - (((-1) - ((-1) - (((-1) - i40) | ((-1) - i2)))) & ((-1) - (i40 ^ i2))));
                        int i42 = (-2) ^ trimmedLength;
                        int i43 = (-1) - (((-1) - (-2)) | ((-1) - trimmedLength));
                        int i44 = ~((i42 + i43) - (i42 & i43));
                        int i45 = (-1) - (((-1) - (i41 ^ i44)) & ((-1) - (i41 & i44)));
                        int i46 = ~i2;
                        int i47 = i46 ^ trimmedLength;
                        int i48 = (-1) - (((-1) - i46) | ((-1) - trimmedLength));
                        int i49 = -(-(((-1) - (((-1) - i45) & ((-1) - (~((i47 + i48) - (i47 & i48)))))) * 54));
                        int i50 = ~(((-2) ^ trimmedLength) | ((trimmedLength - 2) - (trimmedLength | (-2))));
                        int i51 = ((((i39 + i49) - (i39 & i49)) << 1) - (i49 ^ i39)) + ((((-1) - (((-1) - i50) | ((-1) - i2))) | (i2 ^ i50)) * 54);
                        Object[] objArr6 = new Object[1];
                        k("걣갉蝚⑹靐侚躟땍꒑۸닐컒\ue908䉆捵偐쮛翎䶭\u0fdc☆ᵟ깷ⴏ\u008f㪚被좕捕\ud87b픢\ue619巏\uf5f7㟡藄렭錸၆ꂡ骦낳", i51, objArr6);
                        objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        int i52 = windowTouchSlop * ExifDirectoryBase.TAG_PRIMARY_CHROMATICITIES;
                        int i53 = ((i52 - 317) - ((-317) | i52)) + ((-1) - (((-1) - i52) & ((-1) - (-317))));
                        int i54 = ~windowTouchSlop;
                        int i55 = ~((-1) - (((-1) - (i54 ^ iMaxMemory)) & ((-1) - ((-1) - (((-1) - i54) | ((-1) - iMaxMemory))))));
                        int i56 = -(-(((i55 - 2) - (i55 & (-2))) * (-318)));
                        int i57 = ((-1) - (((-1) - i53) | ((-1) - i56))) + ((i56 + i53) - (i56 & i53));
                        int i58 = (-2) ^ iMaxMemory;
                        int i59 = (-2) & iMaxMemory;
                        int i60 = ~((i58 + i59) - (i58 & i59));
                        int i61 = ~iMaxMemory;
                        int i62 = (i61 ^ windowTouchSlop) | ((-1) - (((-1) - i61) | ((-1) - windowTouchSlop)));
                        int i63 = ~((-1) - (((-1) - (i62 ^ 1)) & ((-1) - ((i62 + 1) - (i62 | 1)))));
                        int i64 = i57 + (((-1) - (((-1) - (i60 ^ i63)) & ((-1) - ((-1) - (((-1) - i63) | ((-1) - i60)))))) * 318);
                        int i65 = (-2) ^ i61;
                        int i66 = ((-2) + i61) - ((-2) | i61);
                        int i67 = ~(((i65 + i66) - (i65 & i66)) | windowTouchSlop);
                        int i68 = (-1) - (((-1) - (windowTouchSlop & 1)) & ((-1) - (windowTouchSlop ^ 1)));
                        Object[] objArr7 = new Object[1];
                        k("畈甋⭷┸檞\ue3eb埠됯ࢁߔ伈㌮〮\uee26戗궪ክ펢䳍\uf202６녧꼼킳\ud9b8隬視㔰먴瑲퐱᮰蒶妣㚖", (i64 - (~(-(-(((-1) - (((-1) - (~((-1) - (((-1) - ((i68 + iMaxMemory) - (i68 | iMaxMemory))) & ((-1) - (i68 ^ iMaxMemory)))))) & ((-1) - i67))) * 318))))) - 1, objArr7);
                        try {
                            Object[] objArr8 = {(String) objArr7[0]};
                            int i69 = -TextUtils.getCapsMode("", 0, 0);
                            int id = (int) Thread.currentThread().getId();
                            int i70 = ~i69;
                            int i71 = (-1) - (((-1) - (i70 ^ (-2))) & ((-1) - ((-1) - (((-1) - i70) | ((-1) - (-2))))));
                            int i72 = ~id;
                            int i73 = ~((i72 + i71) - (i72 & i71));
                            int i74 = ~i69;
                            int i75 = (-1) - (((-1) - (i74 ^ 1)) & ((-1) - (1 & i74)));
                            int i76 = i75 ^ id;
                            int i77 = (-1) - (((-1) - i75) | ((-1) - id));
                            int i78 = ~((i76 + i77) - (i76 & i77));
                            int i79 = i73 ^ i78;
                            int i80 = (-1) - (((-1) - i73) | ((-1) - i78));
                            int i81 = (i79 + i80) - (i79 & i80);
                            int i82 = (-2) ^ i69;
                            int i83 = (-1) - (((-1) - (-2)) | ((-1) - i69));
                            int i84 = (i82 + i83) - (i82 & i83);
                            int i85 = ~((-1) - (((-1) - (i84 ^ id)) & ((-1) - ((i84 + id) - (i84 | id)))));
                            int i86 = (((i69 * (-1529)) - 764) - (~(((-1) - (((-1) - (i81 ^ i85)) & ((-1) - ((i81 + i85) - (i81 | i85))))) * 765))) - 1;
                            int i87 = i74 ^ (-2);
                            int i88 = i74 & (-2);
                            int i89 = ~((i87 + i88) - (i87 & i88));
                            int i90 = ~id;
                            int i91 = ~((i70 + i90) - (i70 & i90));
                            int i92 = i89 ^ i91;
                            int i93 = (i89 + i91) - (i89 | i91);
                            int i94 = ((i92 + i93) - (i92 & i93)) * 1530;
                            int i95 = (i86 & i94) + ((i94 + i86) - (i94 & i86));
                            int i96 = ~((-1) - (((-1) - ((id + i70) - (id | i70))) & ((-1) - (i70 ^ id))));
                            int i97 = ((-2) ^ i90) | ((-1) - (((-1) - (-2)) | ((-1) - i90)));
                            int i98 = ((-1) - (((-1) - (~((i69 + i97) - (i69 & i97)))) & ((-1) - i96))) * 765;
                            int i99 = (i95 ^ i98) + (((-1) - (((-1) - i98) | ((-1) - i95))) << 1);
                            Object[] objArr9 = new Object[1];
                            k("걣갉蝚⑹靐侚躟땍꒑۸닐컒\ue908䉆捵偐쮛翎䶭\u0fdc☆ᵟ깷ⴏ\u008f㪚被좕捕\ud87b픢\ue619巏\uf5f7㟡藄렭錸၆ꂡ骦낳", i99, objArr9);
                            objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                            try {
                                int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                int i100 = f19431c * (-966748625);
                                f19431c = i100;
                                int i101 = (scrollDefaultDelay * 399) + 399;
                                int i102 = ~scrollDefaultDelay;
                                int i103 = ~(((-1) - (((-1) - i102) | ((-1) - 1))) | (i102 ^ 1));
                                int i104 = ~((-1) - (((-1) - ((-2) ^ scrollDefaultDelay)) & ((-1) - ((-2) & scrollDefaultDelay))));
                                int i105 = (i103 & i104) | (i103 ^ i104);
                                int i106 = ~(((-2) + i100) - ((-2) & i100));
                                int i107 = i105 ^ i106;
                                int i108 = (i105 + i106) - (i105 | i106);
                                int i109 = -(-(((i108 + i107) - (i108 & i107)) * 398));
                                int i110 = ((i101 + i109) - (i101 | i109)) + ((-1) - (((-1) - i101) & ((-1) - i109)));
                                int i111 = scrollDefaultDelay ^ 1;
                                int i112 = (-1) - (((-1) - scrollDefaultDelay) | ((-1) - 1));
                                int i113 = -(-(((i111 + i112) - (i111 & i112)) * (-1194)));
                                int i114 = ((i110 + i113) - (i110 | i113)) + ((i113 + i110) - (i113 & i110));
                                int i115 = ~((~i100) | (-2));
                                int i116 = ~scrollDefaultDelay;
                                int i117 = ~((-1) - (((-1) - (i116 & 1)) & ((-1) - (i116 ^ 1))));
                                int i118 = -(-(((-1) - (((-1) - (~((scrollDefaultDelay & (-2)) | ((-2) ^ scrollDefaultDelay)))) & ((-1) - ((i115 & i117) | (i115 ^ i117))))) * 398));
                                int i119 = (i114 & i118) + ((-1) - (((-1) - i118) & ((-1) - i114)));
                                Object[] objArr10 = new Object[1];
                                k("\uda62\uda03ꡲ잕\ue56c悽\uf889嚳诱\ue511살볽鼉浻肗≢붋僾급綼倱㉣䶏彺皓ᗰ欑", i119, objArr10);
                                Class<?> cls = Class.forName((String) objArr10[0]);
                                int i120 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int i121 = f19429a * (-1898619820);
                                f19429a = i121;
                                int i122 = ~i120;
                                int i123 = (i120 * (-665)) + 5678 + (i122 * (-333));
                                int i124 = ~i120;
                                int i125 = ~i121;
                                int i126 = ~((i124 & i125) | (i124 ^ i125));
                                int i127 = i121 ^ 17;
                                int i128 = (-1) - (((-1) - i121) | ((-1) - 17));
                                int i129 = i123 + ((i126 | (~((i127 + i128) - (i127 & i128)))) * 333);
                                int i130 = i122 ^ i121;
                                int i131 = (i122 + i121) - (i122 | i121);
                                int i132 = ~((i130 + i131) - (i130 & i131));
                                int i133 = ~i121;
                                int i134 = ~((-1) - (((-1) - (i133 & 17)) & ((-1) - (i133 ^ 17))));
                                Object[] objArr11 = new Object[1];
                                l("\u0003\n\u0016\u001b\u001f\n\u001c\u001f\u0003\n\u0010#\u0016 \u0003\n㗼", (i129 - (~((((-1) - (((-1) - i132) | ((-1) - i134))) | (i132 ^ i134)) * 333))) - 1, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 21), objArr11);
                                Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                                try {
                                    Object[] objArr12 = new Object[1];
                                    k("\uda62\uda03ꡲ잕\ue56c悽\uf889嚳诱\ue511살볽鼉浻肗≢붋僾급綼倱㉣䶏彺皓ᗰ欑", -TextUtils.indexOf((CharSequence) "", '0'), objArr12);
                                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                                    int i135 = 13 - (~(-(-Color.blue(0))));
                                    int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                    int iMyTid = Process.myTid();
                                    int i136 = maxKeyCode * 55;
                                    int i137 = (i136 ^ (-12733)) + (((-1) - (((-1) - i136) | ((-1) - (-12733)))) << 1);
                                    int i138 = ~maxKeyCode;
                                    int i139 = ~((i138 ^ PanasonicMakernoteDirectory.TAG_BURST_SPEED) | ((i138 + PanasonicMakernoteDirectory.TAG_BURST_SPEED) - (119 | i138)));
                                    int i140 = ~iMyTid;
                                    int i141 = ((-1) - (((-1) - (~((-1) - (((-1) - i140) & ((-1) - PanasonicMakernoteDirectory.TAG_BURST_SPEED))))) & ((-1) - i139))) * (-108);
                                    int i142 = ((i137 | i141) << 1) - (i141 ^ i137);
                                    int i143 = ~((i138 ^ iMyTid) | ((-1) - (((-1) - i138) | ((-1) - iMyTid))));
                                    int i144 = (-120) ^ maxKeyCode;
                                    int i145 = (-120) & maxKeyCode;
                                    int i146 = (i145 + i144) - (i145 & i144);
                                    int i147 = ~i146;
                                    int i148 = (i143 + i147) - (i143 & i147);
                                    int i149 = ~((-1) - (((-1) - ((-1) - (((-1) - i140) | ((-1) - maxKeyCode)))) & ((-1) - (i140 ^ maxKeyCode))));
                                    int i150 = -(-(((-1) - (((-1) - (i149 & i148)) & ((-1) - (i148 ^ i149)))) * 54));
                                    int i151 = ~i146;
                                    byte b2 = (byte) ((((i142 ^ i150) + (((-1) - (((-1) - i150) | ((-1) - i142))) << 1)) - (~(-(-(((-1) - (((-1) - (i151 & iMyTid)) & ((-1) - (iMyTid ^ i151)))) * 54))))) - 1);
                                    Object[] objArr13 = new Object[1];
                                    l("\u0003\n\u0016\u001b\u001f\n\u001c\u001f\u0003\n\u0016\u001e\u0003\u000b", i135, b2, objArr13);
                                    try {
                                        Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                        int i152 = -Color.red(0);
                                        Object[] objArr15 = new Object[1];
                                        l(" \u0016\u0015\u0011\u0013\"\u0013\u0011\n\u0013\u0015\u0016\b\u0015\u0013\u000f#\u0002\u0010\u0019\u001f\n\u001c\u001f\u0003\n\u0010#\u0016 \u0003\n㘘", ((-1) - (((-1) - i152) | ((-1) - 33))) + ((i152 + 33) - (i152 & 33)), (byte) (47 - TextUtils.lastIndexOf("", '0', 0)), objArr15);
                                        Class<?> cls3 = Class.forName((String) objArr15[0]);
                                        int i153 = -TextUtils.getCapsMode("", 0, 0);
                                        int i154 = (i153 ^ 1) + (((-1) - (((-1) - i153) | ((-1) - 1))) << 1);
                                        Object[] objArr16 = new Object[1];
                                        k("\ued68\ued0fᒞ\uf419꒾\udc5a쾍支㜜횂脋ﴍꠇ톖댬授誂\uec18", i154, objArr16);
                                        Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                        Object[] objArr17 = new Object[1];
                                        k("綯緎銖騩ꯁ婙彄ଏ넕뢭踙\uf250㣄垟\udd2b泏ᩆ樚\uf3b5㌑\uf7cfࢅၳᇳ텚⼏㚲\uf446닐춅欜\udac5豕\ue00b", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr17);
                                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                        int i155 = (iResolveSizeAndState * (-575)) - 575;
                                        int i156 = ~iResolveSizeAndState;
                                        int i157 = ~((-1) - (((-1) - i156) & ((-1) - (-2))));
                                        int i158 = (-2) ^ i2;
                                        int i159 = (-1) - (((-1) - (-2)) | ((-1) - i2));
                                        int i160 = ~((i158 + i159) - (i158 & i159));
                                        int i161 = -(-(((i157 & i160) | (i157 ^ i160)) * 576));
                                        int i162 = (i155 ^ i161) + ((i155 & i161) << 1);
                                        int i163 = ~((-1) - (((-1) - (~iResolveSizeAndState)) & ((-1) - 1)));
                                        int i164 = ((-2) ^ i37) | (((-2) + i37) - ((-2) | i37));
                                        int i165 = ~((-1) - (((-1) - ((-1) - (((-1) - iResolveSizeAndState) | ((-1) - i164)))) & ((-1) - (i164 ^ iResolveSizeAndState))));
                                        int i166 = -(-(((-1) - (((-1) - (i163 & i165)) & ((-1) - (i163 ^ i165)))) * 576));
                                        int i167 = (i162 ^ i166) + ((i166 & i162) << 1);
                                        int i168 = i156 ^ (-2);
                                        int i169 = (i156 - 2) - (i156 | (-2));
                                        int i170 = -(-((~((i168 + i169) - (i168 & i169))) * 576));
                                        int i171 = ((i167 + i170) - (i167 | i170)) + ((i170 + i167) - (i170 & i167));
                                        Object[] objArr18 = new Object[1];
                                        k("\uec7e\uec0d뤌ᖈ䨮燄캛蒭骕㜞澶Ꭳꤓ簞", i171, objArr18);
                                        Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                        int length = objArr19.length;
                                        for (int i172 = 0; i172 < length; i172 = ((i172 & 1) << 1) + (i172 ^ 1)) {
                                            Object obj = objArr19[i172];
                                            int i173 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                            int id2 = (int) Thread.currentThread().getId();
                                            int i174 = i173 * 868;
                                            int i175 = (i174 & 868) + ((i174 + 868) - (i174 & 868));
                                            int i176 = ~i173;
                                            int i177 = ~id2;
                                            int i178 = ~((-1) - (((-1) - i176) & ((-1) - i177)));
                                            int i179 = ~((-1) - (((-1) - ((-2) ^ i177)) & ((-1) - ((-2) & i177))));
                                            int i180 = -(-(((i178 ^ i179) | (i178 & i179)) * (-867)));
                                            int i181 = (((i175 + i180) - (i175 & i180)) << 1) - (i175 ^ i180);
                                            int i182 = ~i173;
                                            int i183 = ~((-1) - (((-1) - i182) & ((-1) - (-2))));
                                            int i184 = i182 ^ id2;
                                            int i185 = (i182 + id2) - (i182 | id2);
                                            int i186 = ~((i184 + i185) - (i184 & i185));
                                            int i187 = i183 ^ i186;
                                            int i188 = (i186 + i183) - (i186 | i183);
                                            int i189 = (i187 + i188) - (i187 & i188);
                                            int i190 = (-2) ^ id2;
                                            int i191 = (-1) - (((-1) - (-2)) | ((-1) - id2));
                                            int i192 = ~((i190 + i191) - (i190 & i191));
                                            int i193 = -(-(((i189 ^ i192) | (i189 & i192)) * (-1734)));
                                            int i194 = (((i181 + i193) - (i181 & i193)) << 1) - (i193 ^ i181);
                                            int i195 = (i176 - 2) - ((-2) & i176);
                                            int i196 = ~(((i195 + i177) - (i195 | i177)) | (i195 ^ i177));
                                            int i197 = ~(((-1) - (((-1) - ((-1) - (((-1) - i176) | ((-1) - 1)))) & ((-1) - (i176 ^ 1)))) | id2);
                                            int i198 = i196 ^ i197;
                                            int i199 = i197 & i196;
                                            int i200 = (i199 + i198) - (i199 & i198);
                                            int i201 = (i173 - 2) - (i173 & (-2));
                                            Object[] objArr20 = new Object[1];
                                            k("ꛚꚂ\ud8c3\uf2a8宐၌葧揟Ƀ", i194 + (((~((i201 + id2) - (i201 & id2))) | i200) * 867), objArr20);
                                            try {
                                                Object[] objArr21 = {(String) objArr20[0]};
                                                Object[] objArr22 = new Object[1];
                                                k("膪臀鶃멠섎啃ꌀ⭔븕飷\ue488颌쓗墘ﵷؓ\ue65f敀폹妆ைކ〨笼ⵛ\u2004ᛶ麒仔슓䭭뀖灂\uef1b꧌펒闩觶蹙\uf6fd띷", 1 - Color.alpha(0), objArr22);
                                                Class<?> cls5 = Class.forName((String) objArr22[0]);
                                                int iIndexOf = TextUtils.indexOf("", "", 0, 0);
                                                int i202 = (int) Runtime.getRuntime().totalMemory();
                                                int i203 = (iIndexOf * 530) + 6888;
                                                int i204 = ~((~i202) | iIndexOf);
                                                int i205 = ~((-1) - (((-1) - (iIndexOf ^ 11)) & ((-1) - ((iIndexOf + 11) - (11 | iIndexOf)))));
                                                int i206 = -(-(((-1) - (((-1) - (i204 ^ i205)) & ((-1) - ((i205 + i204) - (i205 | i204))))) * 529));
                                                int i207 = (i203 ^ i206) + ((i206 & i203) << 1);
                                                int i208 = iIndexOf ^ i202;
                                                int i209 = (-1) - (((-1) - i202) | ((-1) - iIndexOf));
                                                int i210 = ~((i209 + i208) - (i209 & i208));
                                                int i211 = (((-1) - (((-1) - i210) | ((-1) - (-12)))) | ((-12) ^ i210)) * 529;
                                                int i212 = -TextUtils.getTrimmedLength("");
                                                Object[] objArr23 = new Object[1];
                                                l("\u0003\n\u0016\u000f\u0012\u0002\u0016!\u0013\b㙗", (((i207 + i211) - (i207 & i211)) << 1) - (i211 ^ i207), (byte) ((i212 & 88) + ((i212 + 88) - (i212 & 88))), objArr23);
                                                Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                                try {
                                                    int i213 = 27 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16))));
                                                    int i214 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    int i215 = f19430b * 370459417;
                                                    f19430b = i215;
                                                    int i216 = (i214 * IptcDirectory.TAG_ORIGINAL_TRANSMISSION_REFERENCE) - 33102;
                                                    int i217 = ~i214;
                                                    int i218 = i217 ^ 54;
                                                    int i219 = 54 & i217;
                                                    int i220 = (i218 + i219) - (i218 & i219);
                                                    int i221 = (-1) - (((-1) - (~i220)) & ((-1) - i215));
                                                    int i222 = ~(((-55) ^ i214) | ((-55) & i214));
                                                    int i223 = i216 + (((i221 ^ i222) | ((i221 + i222) - (i221 | i222))) * 614);
                                                    int i224 = ~i215;
                                                    int i225 = ~((i217 ^ i224) | ((-1) - (((-1) - i217) | ((-1) - i224))));
                                                    int i226 = ~i220;
                                                    int i227 = ((-1) - (((-1) - i226) | ((-1) - i225))) | (i225 ^ i226);
                                                    int i228 = ~((-1) - (((-1) - i224) & ((-1) - 54)));
                                                    int i229 = i227 ^ i228;
                                                    int i230 = (-1) - (((-1) - i227) | ((-1) - i228));
                                                    int i231 = ((i230 + i229) - (i230 & i229)) * (-1228);
                                                    int i232 = (i223 ^ i231) + ((i231 & i223) << 1);
                                                    int i233 = ~i214;
                                                    int i234 = i233 ^ (-55);
                                                    int i235 = i233 & (-55);
                                                    int i236 = (i235 + i234) - (i235 & i234);
                                                    int i237 = ~i215;
                                                    int i238 = ~((i236 + i237) - (i236 & i237));
                                                    int i239 = ~((-1) - (((-1) - ((-1) - (((-1) - i237) & ((-1) - i214)))) & ((-1) - 54)));
                                                    int i240 = (((i238 + i239) - (i238 | i239)) | (i238 ^ i239)) * 614;
                                                    byte b3 = (byte) ((i232 ^ i240) + (((i240 + i232) - (i240 | i232)) << 1));
                                                    Object[] objArr24 = new Object[1];
                                                    l(" \u0016\u0015\u0011\u0013\"\u0013\u0011\n\u0013\u0015\u0016\b\u0015\u0013\u000f#\u0002\u0013\u0007\"\u0001\u0016 \u001b\u0003\u0015\u000f", i213, b3, objArr24);
                                                    Class<?> cls6 = Class.forName((String) objArr24[0]);
                                                    Object[] objArr25 = new Object[1];
                                                    k("顳頇\udc1e裱ꎼᓐ몃᧱ﾐꩶ蘳都\udd09ᤘ쿂", 0 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr25);
                                                    try {
                                                        Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                        int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                        int i241 = ((windowTouchSlop2 + 1) - (1 | windowTouchSlop2)) + ((-1) - (((-1) - windowTouchSlop2) & ((-1) - 1)));
                                                        Object[] objArr27 = new Object[1];
                                                        k("膪臀鶃멠섎啃ꌀ⭔븕飷\ue488颌쓗墘ﵷؓ\ue65f敀폹妆ைކ〨笼ⵛ\u2004ᛶ麒仔슓䭭뀖灂\uef1b꧌펒闩觶蹙\uf6fd띷", i241, objArr27);
                                                        Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                        Object[] objArr28 = new Object[1];
                                                        k("齁鼦\ue1c2\uebd9슾⤆붷竵쉂쥇\ue73a鬸\uda0aⓊ곍֧\uf8a4᥍艒娴ᔰ篃懂", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr28);
                                                        Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                        int length2 = objArr3.length;
                                                        int i242 = 0;
                                                        while (i242 < 2) {
                                                            Object obj2 = objArr3[i242];
                                                            try {
                                                                int i243 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                                                int i244 = (i243 * 595) - 39171;
                                                                int i245 = ~i243;
                                                                int i246 = i245 ^ 33;
                                                                int i247 = (-1) - (((-1) - i245) | ((-1) - 33));
                                                                int i248 = ~((i246 + i247) - (i246 & i247));
                                                                int i249 = ~((-1) - (((-1) - (i37 ^ 33)) & ((-1) - ((i37 + 33) - (33 | i37)))));
                                                                int i250 = ((i248 & i249) | (i248 ^ i249)) * (-1188);
                                                                int i251 = ((i244 + i250) - (i244 | i250)) + ((i244 + i250) - (i244 & i250));
                                                                int i252 = ~((-1) - (((-1) - i245) & ((-1) - 33)));
                                                                int i253 = ~(((-34) + i2) - ((-34) & i2));
                                                                int i254 = (-1) - (((-1) - ((i252 + i253) - (i252 | i253))) & ((-1) - (i252 ^ i253)));
                                                                int i255 = ~((i46 ^ i243) | ((i46 + i243) - (i46 | i243)));
                                                                int i256 = i254 ^ i255;
                                                                int i257 = (i254 + i255) - (i254 | i255);
                                                                int i258 = ((i257 + i256) - (i257 & i256)) * 594;
                                                                int i259 = ((-1) - (((-1) - i251) | ((-1) - i258))) + ((-1) - (((-1) - i258) & ((-1) - i251)));
                                                                int i260 = ~((-1) - (((-1) - ((-34) ^ i37)) & ((-1) - ((-34) & i37))));
                                                                int i261 = ~((-1) - (((-1) - ((-1) - (((-1) - (-34)) | ((-1) - i243)))) & ((-1) - ((-34) ^ i243))));
                                                                int i262 = i260 ^ i261;
                                                                int i263 = (-1) - (((-1) - i261) | ((-1) - i260));
                                                                int i264 = -(-(((-1) - (((-1) - (~(((i243 + i37) - (i243 | i37)) | (i37 ^ i243)))) & ((-1) - ((i263 + i262) - (i263 & i262))))) * 594));
                                                                int i265 = (((-1) - (((-1) - i259) & ((-1) - i264))) << 1) - (i264 ^ i259);
                                                                int i266 = -View.getDefaultSize(0, 0);
                                                                int i267 = (int) Runtime.getRuntime().totalMemory();
                                                                int i268 = ~i267;
                                                                int i269 = (-71) ^ i268;
                                                                int i270 = i268 & (-71);
                                                                int i271 = ~((i270 + i269) - (i270 & i269));
                                                                int i272 = ~(((-71) + i266) - ((-71) & i266));
                                                                int i273 = i271 ^ i272;
                                                                int i274 = (i271 + i272) - (i271 | i272);
                                                                int i275 = ((i266 * 50) - 6790) + (((i273 + i274) - (i273 & i274)) * 98);
                                                                int i276 = ~i266;
                                                                int i277 = ~i267;
                                                                int i278 = ~((i276 ^ i277) | ((i276 + i277) - (i276 | i277)));
                                                                int i279 = i266 ^ i267;
                                                                int i280 = (-1) - (((-1) - i266) | ((-1) - i267));
                                                                int i281 = -(-(((-1) - (((-1) - (((-1) - (((-1) - i278) | ((-1) - (-71)))) | ((-71) ^ i278))) & ((-1) - (~((i279 + i280) - (i279 & i280)))))) * (-49)));
                                                                int i282 = ((-1) - (((-1) - i275) | ((-1) - i281))) + (i275 | i281);
                                                                int i283 = ~((-1) - (((-1) - i267) & ((-1) - (-71))));
                                                                int i284 = i266 ^ 70;
                                                                int i285 = (-1) - (((-1) - i266) | ((-1) - 70));
                                                                int i286 = ~((i285 + i284) - (i285 & i284));
                                                                int i287 = i283 ^ i286;
                                                                int i288 = (i286 + i283) - (i286 | i283);
                                                                int i289 = ((i288 + i287) - (i288 & i287)) * 49;
                                                                Object[] objArr29 = new Object[1];
                                                                l("\n\u001e\u001c\u001e\f\u0001\n\b\u0003\u0015!\u0013\u0019\u000f\b\n\u0015\u001b\u000e\u0019\u0011#\u0011 \u000f\u0015\u0013!\u001f \n\u001f\u001b\u000f", i265, (byte) (((i282 + i289) - (i282 | i289)) + ((i289 + i282) - (i289 & i282))), objArr29);
                                                                Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                                Object[] objArr30 = new Object[1];
                                                                k("ᭀᬧ钫څ胚屯㦱鞳뜨␟ꕨ\ud96a師冲䆡䞴糼汲漭ᡷ鄹ະ貂㫰랤⤻ꨉ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr30);
                                                                if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                                    int i290 = ~((-1) - (((-1) - i2) | ((-1) - 1)));
                                                                    int i291 = (-1) - (((-1) - i2) & ((-1) - 1));
                                                                    Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{(i290 + i291) - (i290 | i291)}};
                                                                    int i292 = (int) Runtime.getRuntime().totalMemory();
                                                                    int i293 = ~i292;
                                                                    int i294 = (-913455853) + (((-1) - (((-1) - (~((-298479990) | i293))) & ((-1) - 268575009))) * (-1188));
                                                                    int i295 = (-1) - (((-1) - (~((i292 + 298479989) - (i292 & 298479989)))) & ((-1) - 268575009));
                                                                    int i296 = ~((976628011 + i293) - (976628011 & i293));
                                                                    int i297 = i294 + (((-1) - (((-1) - i295) & ((-1) - i296))) * 594) + (((-1) - (((-1) - ((-1) - (((-1) - (~(298479989 | i293))) & ((-1) - (-1006532992))))) & ((-1) - i296))) * 594);
                                                                    int i298 = f19432d * 1833249340;
                                                                    f19432d = i298;
                                                                    int i299 = -(-(i297 * (-622)));
                                                                    int i300 = ((9984 + i299) - (9984 | i299)) + (i299 | 9984);
                                                                    int i301 = ~i297;
                                                                    int i302 = i300 + ((~(((i301 + 16) - (i301 & 16)) | i298)) * 623);
                                                                    int i303 = ~i298;
                                                                    int i304 = (-17) ^ i297;
                                                                    int i305 = (-17) & i297;
                                                                    int i306 = ~((i305 + i304) - (i305 & i304));
                                                                    int i307 = i303 ^ i306;
                                                                    int i308 = (-1) - (((-1) - i303) | ((-1) - i306));
                                                                    int i309 = ((i308 + i307) - (i308 & i307)) * (-623);
                                                                    int i310 = ((i302 + i309) - (i302 | i309)) + ((-1) - (((-1) - i309) & ((-1) - i302)));
                                                                    int i311 = ~i297;
                                                                    int i312 = ~((-1) - (((-1) - (i311 ^ 16)) & ((-1) - (16 & i311))));
                                                                    int i313 = ~(((i311 + i298) - (i311 | i298)) | (i311 ^ i298));
                                                                    int i314 = (-1) - (((-1) - ((-1) - (((-1) - i313) | ((-1) - i312)))) & ((-1) - (i312 ^ i313)));
                                                                    int i315 = ~((i298 & 16) | (i298 ^ 16));
                                                                    int i316 = -(-((i310 - (~(((-1) - (((-1) - ((i315 + i314) - (i315 | i314))) & ((-1) - (i314 ^ i315)))) * 623))) - 1));
                                                                    int i317 = ((i3 + i316) - (i3 | i316)) + ((-1) - (((-1) - i3) & ((-1) - i316)));
                                                                    int i318 = i317 << 13;
                                                                    int i319 = (-1) - (((-1) - (~i318)) | ((-1) - i317));
                                                                    int i320 = ~i317;
                                                                    int i321 = (-1) - (((-1) - ((i318 + i320) - (i318 | i320))) & ((-1) - i319));
                                                                    int i322 = i321 >>> 17;
                                                                    int i323 = ~i322;
                                                                    int i324 = ((-1) - (((-1) - (~i321)) | ((-1) - i322))) | ((i323 + i321) - (i323 | i321));
                                                                    int i325 = i324 << 5;
                                                                    ((int[]) objArr31[0])[0] = (-1) - (((-1) - ((-1) - (((-1) - i324) & ((-1) - i325)))) | ((-1) - (~(i324 & i325))));
                                                                    return objArr31;
                                                                }
                                                                int i326 = (((i242 - 37) - ((-37) & i242)) << 1) - (i242 ^ (-37));
                                                                i242 = ((-1) - (((-1) - i326) | ((-1) - 38))) + (i326 | 38);
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        }
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
                int[] iArr2 = new int[1];
                Object[] objArr32 = {iArr2, new int[]{i2}, null, new int[]{i2}};
                int i327 = ~((~i2) | 69526744);
                int i328 = ~((i2 + 69526744) - (i2 & 69526744));
                int i329 = (-1967726558) + (((i327 - 750058719) - (i327 & (-750058719))) * (-245)) + (i328 * (-245)) + (((-1) - (((-1) - i328) & ((-1) - 747674766))) * 245);
                int i330 = f19433e * (-1777486813);
                f19433e = i330;
                int i331 = (-1) - (~(i329 * (-167)));
                int i332 = ~i329;
                int i333 = ~(((-1) ^ i332) | i332);
                int i334 = ~(((-1) - (((-1) - i332) | ((-1) - i330))) | (i332 ^ i330));
                int i335 = -(-(((-1) - (((-1) - ((i333 + i334) - (i333 | i334))) & ((-1) - (i333 ^ i334)))) * IptcDirectory.TAG_TIME_SENT));
                int i336 = ~i329;
                int i337 = ~i330;
                int i338 = (i331 ^ i335) + ((i331 & i335) << 1) + (((i336 & i337) | (i336 ^ i337)) * (-168));
                int i339 = ~i329;
                int i340 = ~(~i330);
                int i341 = (((-1) - (((-1) - i340) | ((-1) - i339))) | (i339 ^ i340)) * 168;
                int i342 = (i3 - (~(-(-((((-1) - (((-1) - i338) & ((-1) - i341))) << 1) - (i341 ^ i338)))))) - 1;
                int i343 = i342 << 13;
                int i344 = ~i343;
                int i345 = (i344 + i342) - (i344 | i342);
                int i346 = ~i342;
                int i347 = ((i346 + i343) - (i346 | i343)) | i345;
                int i348 = i347 >>> 17;
                int i349 = ((-1) - (((-1) - i347) & ((-1) - i348))) & (~((i347 + i348) - (i347 | i348)));
                int i350 = i349 << 5;
                iArr2[0] = (-1) - (((-1) - ((-1) - (((-1) - (~i349)) | ((-1) - i350)))) & ((-1) - ((~i350) & i349)));
                return objArr32;
            }

            static void init$0() {
                $$a = new byte[]{60, -92, 19, MessagePack.Code.MAP16};
                $$b = 55;
            }

            private static void k(String str, int i2, Object[] objArr) throws Throwable {
                String str2 = str;
                int i3 = 2 % 2;
                int i4 = $11 + 57;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                Object charArray = str2 != null ? str2.toCharArray() : str2;
                k kVar = new k();
                char[] cArrC = k.c(f19437i ^ (-5882309809461882246L), (char[]) charArray, i2);
                kVar.f19939c = 4;
                while (kVar.f19939c < cArrC.length) {
                    kVar.f19938a = kVar.f19939c - 4;
                    int i6 = kVar.f19939c;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19437i)};
                        Object objA = o.d.d.a(-1093976004);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 5);
                            objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 230, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 51004), MotionEvent.axisFromString("") + 10, 1749983833, false, $$c(b2, b3, (byte) (b3 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrC[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {kVar, kVar};
                        Object objA2 = o.d.d.a(-912105096);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            objA2 = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 676, (char) (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 12, 522683165, false, $$c(b4, (byte) ((b4 + Ascii.FF) - (12 & b4)), b4), new Class[]{Object.class, Object.class});
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
                String str3 = new String(cArrC, 4, cArrC.length - 4);
                int i7 = $10 + 65;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                objArr[0] = str3;
            }

            private static void l(String str, int i2, byte b2, Object[] objArr) throws Throwable {
                int i3;
                int length;
                char[] cArr;
                int i4;
                String str2 = str;
                int i5 = 2 % 2;
                int i6 = $10 + 35;
                $11 = i6 % 128;
                Object charArray = str2;
                if (i6 % 2 == 0) {
                    throw null;
                }
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr2 = (char[]) charArray;
                h hVar = new h();
                char[] cArr3 = f19436h;
                int i7 = 421932776;
                if (cArr3 != null) {
                    int i8 = $10 + 15;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        length = cArr3.length;
                        cArr = new char[length];
                        i4 = 1;
                    } else {
                        length = cArr3.length;
                        cArr = new char[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                            Object objA = o.d.d.a(i7);
                            if (objA == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objA = o.d.d.a(270 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 11 - (ViewConfiguration.getTapTimeout() >> 16), -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr[i4] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i4++;
                            i7 = 421932776;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr;
                }
                Object[] objArr3 = {Integer.valueOf(f19438j)};
                Object objA2 = o.d.d.a(421932776);
                if (objA2 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + 270, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 11 - Color.alpha(0), -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i2];
                if (i2 % 2 != 0) {
                    i3 = i2 - 1;
                    cArr4[i3] = (char) (cArr2[i3] - b2);
                } else {
                    i3 = i2;
                }
                if (i3 > 1) {
                    hVar.f19926b = 0;
                    while (hVar.f19926b < i3) {
                        hVar.f19927c = cArr2[hVar.f19926b];
                        hVar.f19925a = cArr2[hVar.f19926b + 1];
                        if (hVar.f19927c == hVar.f19925a) {
                            cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                            cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                        } else {
                            Object[] objArr4 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA3 = o.d.d.a(219124184);
                            if (objA3 == null) {
                                byte b7 = (byte) 0;
                                objA3 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 825, (char) View.resolveSizeAndState(0, 0, 0), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -611683395, false, $$c(b7, (byte) ((b7 + 9) - (9 & b7)), b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                                Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                                Object objA4 = o.d.d.a(-634864343);
                                if (objA4 == null) {
                                    byte b8 = (byte) 0;
                                    objA4 = o.d.d.a(219 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), AndroidCharacter.getMirror('0') - '%', 212688716, false, $$c(b8, (byte) (7 | b8), b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                                int i9 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr3[iIntValue];
                                cArr4[hVar.f19926b + 1] = cArr3[i9];
                            } else if (hVar.f19928d == hVar.f19929e) {
                                int i10 = $10 + 83;
                                $11 = i10 % 128;
                                int i11 = i10 % 2;
                                hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                int i12 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr3[i12];
                                cArr4[hVar.f19926b + 1] = cArr3[i13];
                            } else {
                                int i14 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                int i15 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                cArr4[hVar.f19926b] = cArr3[i14];
                                cArr4[hVar.f19926b + 1] = cArr3[i15];
                            }
                        }
                        hVar.f19926b += 2;
                    }
                }
                for (int i16 = 0; i16 < i2; i16++) {
                    cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            public final TransactionControl<Boolean> getAlertAllTransactionsControl() {
                int i2 = 2 % 2;
                int i3 = f19434f;
                int i4 = i3 + 53;
                f19435g = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                TransactionControl<Boolean> transactionControl = this.alertAll;
                int i5 = i3 + 59;
                f19435g = i5 % 128;
                if (i5 % 2 == 0) {
                    return transactionControl;
                }
                throw null;
            }

            public final TransactionControl<Boolean> getBlockAllTransactionsControl() {
                TransactionControl<Boolean> transactionControl;
                int i2 = 2 % 2;
                int i3 = f19434f;
                int i4 = i3 + 39;
                f19435g = i4 % 128;
                if (i4 % 2 != 0) {
                    transactionControl = this.blockAll;
                    int i5 = 92 / 0;
                } else {
                    transactionControl = this.blockAll;
                }
                int i6 = i3 + 55;
                f19435g = i6 % 128;
                if (i6 % 2 == 0) {
                    return transactionControl;
                }
                throw null;
            }
        }

        public static final class BrickAndMortarTransactionControls {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static char f19439a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char f19440b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static char f19441c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static char f19442d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static char[] f19443e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f19444f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f19445g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static char f19446h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f19447i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f19448j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static int f19449k = 0;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static int f19450l = 0;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static int f19451m = 0;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static int f19452n = 0;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static int f19453o = 0;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static int f19454p = 0;
            private final TransactionControl<Boolean> alertAll;
            private final TransactionControl<Boolean> blockAll;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0012). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(byte r8, byte r9, int r10) {
                /*
                    int r8 = r8 + 4
                    byte[] r7 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.TransactionTypeControls.BrickAndMortarTransactionControls.$$c
                    int r6 = r9 * 2
                    int r1 = r6 + 1
                    int r0 = r10 + 69
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    if (r7 != 0) goto L27
                    r3 = r8
                    r0 = r6
                    r2 = r4
                L12:
                    int r0 = -r0
                    int r8 = r8 + r0
                    r1 = r2
                L15:
                    byte r0 = (byte) r8
                    r5[r1] = r0
                    int r2 = r1 + 1
                    if (r1 != r6) goto L22
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L22:
                    int r3 = r3 + 1
                    r0 = r7[r3]
                    goto L12
                L27:
                    r1 = r4
                    r3 = r8
                    r8 = r0
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.TransactionTypeControls.BrickAndMortarTransactionControls.$$e(byte, byte, int):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f19454p = 13195615;
                f19453o = -145594647;
                f19452n = -576053173;
                f19451m = -1456136215;
                f19450l = -1253836036;
                f19449k = -1314919886;
                init$0();
                f19444f = 0;
                f19445g = 1;
                f19447i = 0;
                f19448j = 1;
                e();
                f19443e = new char[]{64532};
                f19442d = (char) 51646;
                int i2 = f19444f + 73;
                f19445g = i2 % 128;
                int i3 = i2 % 2;
            }

            public BrickAndMortarTransactionControls(TransactionControl<Boolean> transactionControl, TransactionControl<Boolean> transactionControl2) {
                this.blockAll = transactionControl;
                this.alertAll = transactionControl2;
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(Unknown Source)
                	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] b(android.content.Context r27, int r28, int r29, int r30) {
                /*
                    Method dump skipped, instruction units count: 1614
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.TransactionTypeControls.BrickAndMortarTransactionControls.b(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void e() {
                f19439a = (char) 43973;
                f19440b = (char) 59748;
                f19441c = (char) 37998;
                f19446h = (char) 14526;
            }

            static void init$0() {
                $$a = new byte[]{96, -118, -108, -83};
                $$b = 47;
            }

            static void init$1() {
                $$c = new byte[]{45, 78, -5, 117};
                $$d = 18;
            }

            private static void q(String str, int i2, Object[] objArr) throws Throwable {
                String str2 = str;
                int i3 = 2 % 2;
                char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
                g gVar = new g();
                char[] cArr2 = new char[cArr.length];
                gVar.f19924d = 0;
                char[] cArr3 = new char[2];
                while (gVar.f19924d < cArr.length) {
                    cArr3[0] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d + 1];
                    int i4 = $10 + 95;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 58224;
                    for (int i7 = 0; i7 < 16; i7++) {
                        char c2 = cArr3[1];
                        char c3 = cArr3[0];
                        try {
                            Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) f19441c) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f19446h)};
                            Object objA = o.d.d.a(1603517628);
                            if (objA == null) {
                                byte b2 = (byte) (-1);
                                byte b3 = (byte) (b2 + 1);
                                objA = o.d.d.a(271 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), 10 - Process.getGidForName(""), -1995022631, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) f19439a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19440b)};
                            Object objA2 = o.d.d.a(1603517628);
                            if (objA2 == null) {
                                byte b4 = (byte) (-1);
                                byte b5 = (byte) (b4 + 1);
                                objA2 = o.d.d.a((ViewConfiguration.getTapTimeout() >> 16) + 270, (char) (ViewConfiguration.getEdgeSlop() >> 16), 11 - Gravity.getAbsoluteGravity(0, 0), -1995022631, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
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
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(270 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.getOffsetBefore("", 0), Color.red(0) + 11, -2074123590, false, $$e(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                String str3 = new String(cArr2, 0, i2);
                int i8 = $10 + 27;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                objArr[0] = str3;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void r(byte r8, int r9, int r10, java.lang.Object[] r11) {
                /*
                    int r7 = r10 + 97
                    int r0 = r8 * 3
                    int r6 = 4 - r0
                    byte[] r5 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.TransactionTypeControls.BrickAndMortarTransactionControls.$$a
                    int r0 = r9 * 2
                    int r4 = r0 + 1
                    byte[] r3 = new byte[r4]
                    r2 = 0
                    if (r5 != 0) goto L28
                    r0 = r6
                    r1 = r2
                L13:
                    int r6 = r6 + 1
                    int r7 = r7 + r0
                L16:
                    byte r0 = (byte) r7
                    r3[r1] = r0
                    int r1 = r1 + 1
                    if (r1 != r4) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    r11[r2] = r0
                    return
                L25:
                    r0 = r5[r6]
                    goto L13
                L28:
                    r1 = r2
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.TransactionTypeControls.BrickAndMortarTransactionControls.r(byte, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void s(int r25, java.lang.String r26, byte r27, java.lang.Object[] r28) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 975
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls.TransactionTypeControls.BrickAndMortarTransactionControls.s(int, java.lang.String, byte, java.lang.Object[]):void");
            }

            public final TransactionControl<Boolean> getAlertAllTransactionsControl() {
                int i2 = 2 % 2;
                int i3 = f19448j;
                int i4 = i3 + 77;
                f19447i = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                TransactionControl<Boolean> transactionControl = this.alertAll;
                int i5 = i3 + 35;
                f19447i = i5 % 128;
                if (i5 % 2 == 0) {
                    return transactionControl;
                }
                obj.hashCode();
                throw null;
            }

            public final TransactionControl<Boolean> getBlockAllTransactionsControl() {
                int i2 = 2 % 2;
                int i3 = f19448j;
                int i4 = i3 + 105;
                f19447i = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                TransactionControl<Boolean> transactionControl = this.blockAll;
                int i5 = i3 + 5;
                f19447i = i5 % 128;
                if (i5 % 2 == 0) {
                    return transactionControl;
                }
                throw null;
            }
        }

        public static final class ContactlessTransactionControls {
            private final TransactionControl<Boolean> alertAll;
            private final TransactionControl<Boolean> blockAll;

            public ContactlessTransactionControls(TransactionControl<Boolean> transactionControl, TransactionControl<Boolean> transactionControl2) {
                this.blockAll = transactionControl;
                this.alertAll = transactionControl2;
            }

            public final TransactionControl<Boolean> getAlertAllTransactionsControl() {
                return this.alertAll;
            }

            public final TransactionControl<Boolean> getBlockAllTransactionsControl() {
                return this.blockAll;
            }
        }

        public static final class CrossBorderTransactionControls {
            private final TransactionControl<Boolean> alertAll;
            private final TransactionControl<Boolean> blockAll;

            public CrossBorderTransactionControls(TransactionControl<Boolean> transactionControl, TransactionControl<Boolean> transactionControl2) {
                this.blockAll = transactionControl;
                this.alertAll = transactionControl2;
            }

            public final TransactionControl<Boolean> getAlertAllTransactionsControl() {
                return this.alertAll;
            }

            public final TransactionControl<Boolean> getBlockAllTransactionsControl() {
                return this.blockAll;
            }
        }

        public static final class EcommerceTransactionControls {
            private final TransactionControl<Boolean> alertAll;
            private final TransactionControl<Boolean> blockAll;

            public EcommerceTransactionControls(TransactionControl<Boolean> transactionControl, TransactionControl<Boolean> transactionControl2) {
                this.blockAll = transactionControl;
                this.alertAll = transactionControl2;
            }

            public final TransactionControl<Boolean> getAlertAllTransactionsControl() {
                return this.alertAll;
            }

            public final TransactionControl<Boolean> getBlockAllTransactionsControl() {
                return this.blockAll;
            }
        }

        public static final class RecurringTransactionControls {
            private final TransactionControl<Boolean> alertAll;
            private final TransactionControl<Boolean> blockAll;

            public RecurringTransactionControls(TransactionControl<Boolean> transactionControl, TransactionControl<Boolean> transactionControl2) {
                this.blockAll = transactionControl;
                this.alertAll = transactionControl2;
            }

            public final TransactionControl<Boolean> getAlertAllTransactionsControl() {
                return this.alertAll;
            }

            public final TransactionControl<Boolean> getBlockAllTransactionsControl() {
                return this.blockAll;
            }
        }

        public TransactionTypeControls(AtmTransactionControls atmTransactionControls, RecurringTransactionControls recurringTransactionControls, BrickAndMortarTransactionControls brickAndMortarTransactionControls, CrossBorderTransactionControls crossBorderTransactionControls, EcommerceTransactionControls ecommerceTransactionControls, ContactlessTransactionControls contactlessTransactionControls) {
            this.atmTransactionControls = atmTransactionControls;
            this.recurringTransactionControls = recurringTransactionControls;
            this.brickAndMortarTransactionControls = brickAndMortarTransactionControls;
            this.crossBorderTransactionControls = crossBorderTransactionControls;
            this.ecommerceTransactionControls = ecommerceTransactionControls;
            this.contactlessTransactionControls = contactlessTransactionControls;
        }

        public final AtmTransactionControls getAtmTransactionControls() {
            return this.atmTransactionControls;
        }

        public final BrickAndMortarTransactionControls getBrickAndMortarTransactionControls() {
            return this.brickAndMortarTransactionControls;
        }

        public final ContactlessTransactionControls getContactlessTransactionControls() {
            return this.contactlessTransactionControls;
        }

        public final CrossBorderTransactionControls getCrossBorderTransactionControls() {
            return this.crossBorderTransactionControls;
        }

        public final EcommerceTransactionControls getEcommerceTransactionControls() {
            return this.ecommerceTransactionControls;
        }

        public final RecurringTransactionControls getRecurringTransactionControls() {
            return this.recurringTransactionControls;
        }
    }

    public static final class VelocityControls {
        private final TransactionControl<BigDecimal> alertThreshold;
        private final TransactionControl<BigDecimal> blockThreshold;
        private final TransactionControl<TimePeriod> period;
        private final TransactionControl<TimeZone> timeZone;

        public VelocityControls(TransactionControl<TimePeriod> transactionControl, TransactionControl<BigDecimal> transactionControl2, TransactionControl<BigDecimal> transactionControl3, TransactionControl<TimeZone> transactionControl4) {
            this.period = transactionControl;
            this.blockThreshold = transactionControl2;
            this.alertThreshold = transactionControl3;
            this.timeZone = transactionControl4;
        }

        public final TransactionControl<BigDecimal> getAlertThreshold() {
            return this.alertThreshold;
        }

        public final TransactionControl<BigDecimal> getBlockThreshold() {
            return this.blockThreshold;
        }

        public final TransactionControl<TimePeriod> getPeriod() {
            return this.period;
        }

        public final TransactionControl<TimeZone> getTimeZone() {
            return this.timeZone;
        }
    }

    public TransactionControls(String str, Date date, d dVar, GlobalControls globalControls, TransactionTypeControls transactionTypeControls, TransactionGeolocationControls transactionGeolocationControls, MerchantTypeControls merchantTypeControls, VelocityControls velocityControls) {
        this.id = str;
        this.creationDate = date;
        this.innerTransactionControlUpdateRegister = dVar;
        this.globalControls = globalControls;
        this.transactionTypeControls = transactionTypeControls;
        this.transactionGeolocationControls = transactionGeolocationControls;
        this.merchantTypeControls = merchantTypeControls;
        this.velocityControls = velocityControls;
    }

    public final Date getCreationDate() {
        return this.creationDate;
    }

    public final GlobalControls getGlobalControls() {
        return this.globalControls;
    }

    public final String getId() {
        return this.id;
    }

    public final MerchantTypeControls getMerchantTypeControls() {
        return this.merchantTypeControls;
    }

    public final TransactionControlUpdateRegister getTransactionControlUpdateRegister() {
        return new TransactionControlUpdateRegister(this.innerTransactionControlUpdateRegister);
    }

    public final TransactionGeolocationControls getTransactionGeolocationControls() {
        return this.transactionGeolocationControls;
    }

    public final TransactionTypeControls getTransactionTypeControls() {
        return this.transactionTypeControls;
    }

    public final VelocityControls getVelocityControls() {
        return this.velocityControls;
    }
}
