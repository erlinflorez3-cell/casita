package fr.antelop.sdk.card;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
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
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopCallback;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.card.TermsAndConditions;
import fr.antelop.sdk.card.emvapplication.EmvApplicationGroup;
import fr.antelop.sdk.util.OperationCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.f;
import o.a.j;
import o.a.l;
import o.a.n;
import o.ep.c;
import o.ep.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class Card {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f18884a = 0;

    /* JADX INFO: renamed from: b */
    public static int f18885b = 0;

    /* JADX INFO: renamed from: c */
    public static int f18886c = 0;

    /* JADX INFO: renamed from: d */
    public static int f18887d = 0;

    /* JADX INFO: renamed from: e */
    public static int f18888e = 0;

    /* JADX INFO: renamed from: f */
    private static int f18889f = 0;

    /* JADX INFO: renamed from: g */
    public static int f18890g = 0;

    /* JADX INFO: renamed from: h */
    public static int f18891h = 0;

    /* JADX INFO: renamed from: i */
    public static int f18892i = 0;

    /* JADX INFO: renamed from: j */
    private static char[] f18893j = null;

    /* JADX INFO: renamed from: k */
    private static int f18894k = 0;

    /* JADX INFO: renamed from: l */
    private static int f18895l = 0;

    /* JADX INFO: renamed from: m */
    private static boolean f18896m = false;

    /* JADX INFO: renamed from: n */
    private static int f18897n = 0;

    /* JADX INFO: renamed from: o */
    private static boolean f18898o = false;

    /* JADX INFO: renamed from: p */
    public static int f18899p = 0;
    AccountInfo accountInfo;
    private CardDisplay cardDisplay;
    private CardInfo cardInfo;
    private final d innerCard;

    /* JADX INFO: renamed from: fr.antelop.sdk.card.Card$1 */
    public class AnonymousClass1 implements OperationCallback<Void> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static int f18900a = 0;

        /* JADX INFO: renamed from: b */
        public static int f18901b = 0;

        /* JADX INFO: renamed from: c */
        public static int f18902c = 0;

        /* JADX INFO: renamed from: d */
        public static int f18903d = 0;

        /* JADX INFO: renamed from: e */
        public static int f18904e = 0;

        /* JADX INFO: renamed from: f */
        public static int f18905f = 0;

        /* JADX INFO: renamed from: g */
        public static int f18906g = 0;

        /* JADX INFO: renamed from: h */
        private static int f18907h = 0;

        /* JADX INFO: renamed from: i */
        private static int f18908i = 0;

        /* JADX INFO: renamed from: j */
        private static int f18909j = 0;

        /* JADX INFO: renamed from: k */
        private static int[] f18910k = null;

        /* JADX INFO: renamed from: l */
        private static short[] f18911l = null;

        /* JADX INFO: renamed from: m */
        private static int f18912m = 0;

        /* JADX INFO: renamed from: n */
        private static int f18913n = 0;

        /* JADX INFO: renamed from: o */
        private static byte[] f18914o = null;
        final /* synthetic */ AntelopCallback val$callback;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r9, short r10, int r11) {
            /*
                byte[] r8 = fr.antelop.sdk.card.Card.AnonymousClass1.$$a
                int r0 = r9 * 2
                int r7 = 4 - r0
                int r6 = 121 - r10
                int r0 = r11 * 4
                int r5 = r0 + 1
                byte[] r4 = new byte[r5]
                r3 = 0
                if (r8 != 0) goto L2b
                r2 = r7
                r6 = r5
                r1 = r3
            L14:
                int r7 = r7 + r6
                int r0 = r2 + 1
                r6 = r7
                r7 = r0
            L19:
                byte r0 = (byte) r6
                r4[r1] = r0
                int r1 = r1 + 1
                if (r1 != r5) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L26:
                r0 = r8[r7]
                r2 = r7
                r7 = r0
                goto L14
            L2b:
                r1 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.Card.AnonymousClass1.$$c(int, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f18905f = 426374810;
            f18906g = 139336350;
            f18902c = 2062956196;
            f18904e = 1311238989;
            f18900a = -130347213;
            f18901b = -925377551;
            f18903d = 1954043053;
            f18913n = 0;
            f18912m = 1;
            f18907h = 1594633179;
            f18908i = 1150422483;
            f18909j = -1073162818;
            f18914o = new byte[]{69, 124, 102, 112, 113, 98, 114, 96, -107, -105, 119, 108, 74, -99, 105, 119, 108, 42, -67, 49, 99, 104, -125, -92, 34, 114, 124, 96, 106, -123, 105, 101, -78, 33, -128, 92, -126, 96, 76, 41, -117, 37, -128, 91, 36, 37, 46, -103, 33, 126, -105, 57, -116, 86, Base64.padSymbol, -100, 46, 114, 119, -17, 36, 37, 46, -103, 33, 126, -105, 56, -108, 62, MessagePack.Code.FIXARRAY_PREFIX, -31, -103, MessagePack.Code.INT32, MessagePack.Code.FIXARRAY_PREFIX, -117, -9, -31, -103, -23, -105, -99, -116, MessagePack.Code.TRUE, -106, -31, 78, 47, 124, 36, 121, 47, Ascii.SYN, 114, 124, 36, 116, Ascii.DC2, 40, Ascii.ESC, 72, 107, 127, -24, MessagePack.Code.FIXSTR_PREFIX, 36, 19, 123, 36, 125, 46, 55, 80, 97, 96, 127, 44, 116, 47, 42, MessagePack.Code.INT64, -31, -27, Ascii.SUB, 32, 56, 1, 73, 41, 53, 49, 81, -31, 79, Ascii.FS, 51, -30, -16, -20, MessagePack.Code.FALSE, -30, -18, -15, MessagePack.Code.STR8, MessagePack.Code.EXT16, 44, -16, -83, 53, -23, -28, -4, -23, -10, -29, -72, 37, -6, -11, -16, -31, -7, MessagePack.Code.NEGFIXINT_PREFIX, 56, 17, -73, 2, Ascii.RS, MessagePack.Code.EXT8, Ascii.GS, Ascii.NAK, MessagePack.Code.BIN32, MessagePack.Code.UINT16, -26, -30, 17, -73, 19, MessagePack.Code.UINT16, Ascii.ESC, MessagePack.Code.EXT32, 2, 73, MessagePack.Code.STR32, -7, MessagePack.Code.INT32, MessagePack.Code.FIXEXT4, 9, -17, MessagePack.Code.FIXEXT8, Ascii.SO, Ascii.US, 46, 6, 3, MessagePack.Code.INT16, MessagePack.Code.UINT64, 38, -106, Ascii.SO, Ascii.US, Ascii.SO, Ascii.ETB, -105, 7, 1, MessagePack.Code.FIXEXT2, -17, -2, MessagePack.Code.INT32, MessagePack.Code.MAP16, 71, MessagePack.Code.MAP32, -31, -9, MessagePack.Code.FIXEXT2, 52, Ascii.RS, 0, Ascii.DC2, 19, Ascii.FS, 44, 2, 55, 49, 17, Ascii.SO, -28, Ascii.CR, 32, Ascii.VT, Ascii.SO, Ascii.EM, -12, 55, -22, Ascii.SUB, Ascii.VT};
            f18910k = new int[]{148526209, 821657804, 277386293, -1047332158, -1715913607, 869565587, -1257677640, -1853958724, 475014886, 1821736184, 1604698333, -1649918701, -1757788736, -1898964964, -515215262, 1918690891, -1762884203, -831105119};
        }

        AnonymousClass1(AntelopCallback antelopCallback) {
            antelopCallback = antelopCallback;
        }

        public static Object[] e(Context context, int i2, int i3) {
            int i4 = 1;
            if (context == null) {
                Object[] objArr = {new int[1], new int[]{i2}, null, new int[]{i2}};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i5 = ~((-851199438) | elapsedCpuTime);
                int i6 = (-1955620623) + (((-1) - (((-1) - 34604037) & ((-1) - i5))) * (-280)) + (((-1) - (((-1) - i5) & ((-1) - (~((173051415 + elapsedCpuTime) - (173051415 & elapsedCpuTime)))))) * 140);
                int i7 = ~((-816595401) | elapsedCpuTime);
                int i8 = ~elapsedCpuTime;
                int i9 = i6 + (((~((-1) - (((-1) - i8) & ((-1) - 989646815)))) | i7 | (~((-34604038) | i8))) * 140);
                int iMyPid = Process.myPid();
                int i10 = ~i3;
                int i11 = ~((i10 & i9) | (i10 ^ i9));
                int i12 = ~i9;
                int i13 = (-1) - (((-1) - (i12 ^ i3)) & ((-1) - ((-1) - (((-1) - i12) | ((-1) - i3)))));
                int i14 = ~((-1) - (((-1) - ((i13 + iMyPid) - (i13 | iMyPid))) & ((-1) - (i13 ^ iMyPid))));
                int i15 = (i9 * (-500)) + (i3 * (-500)) + (((i11 + i14) - (i11 & i14)) * 501);
                int i16 = ~i3;
                int i17 = i12 ^ i16;
                int i18 = i16 & i12;
                int i19 = (~((i18 + i17) - (i18 & i17))) * 1002;
                int i20 = (i15 ^ i19) + ((i15 & i19) << 1);
                int i21 = ~iMyPid;
                int i22 = i12 ^ i21;
                int i23 = (i21 + i12) - (i21 | i12);
                int i24 = (i23 + i22) - (i23 & i22);
                int i25 = i24 ^ i3;
                int i26 = i24 & i3;
                int i27 = -(-((~((i26 + i25) - (i26 & i25))) * 501));
                int i28 = (((-1) - (((-1) - i20) & ((-1) - i27))) << 1) - (i27 ^ i20);
                int i29 = i28 << 13;
                int i30 = ((-1) - (((-1) - i29) & ((-1) - i28))) & (~((-1) - (((-1) - i28) | ((-1) - i29))));
                int i31 = i30 >>> 17;
                int i32 = (-1) - (((-1) - (~i31)) | ((-1) - i30));
                int i33 = ~i30;
                int i34 = ((i33 + i31) - (i33 | i31)) | i32;
                int i35 = i34 << 5;
                ((int[]) objArr[0])[0] = (-1) - (((-1) - ((i34 + i35) - (i34 & i35))) | ((-1) - (~(i34 & i35))));
                return objArr;
            }
            try {
                int i36 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                short s2 = (short) (((i36 + 16) - (16 | i36)) + ((i36 + 16) - (i36 & 16)));
                int iGreen = Color.green(0);
                int i37 = iGreen * (-183);
                int i38 = (((-1) - (((-1) - i37) & ((-1) - 17385))) << 1) - (i37 ^ 17385);
                int i39 = ~iGreen;
                int i40 = ~i2;
                int i41 = (i39 ^ i40) | ((i39 + i40) - (i39 | i40));
                int i42 = ~((i41 ^ (-95)) | ((i41 - 95) - (i41 | (-95))));
                int i43 = ~i2;
                int i44 = 94 ^ i43;
                int i45 = 94 & i43;
                int i46 = ~(((i44 + i45) - (i44 & i45)) | iGreen);
                int i47 = -(-(((i42 ^ i46) | (i42 & i46)) * (-184)));
                int i48 = (i38 ^ i47) + ((i47 & i38) << 1);
                int i49 = i39 ^ 94;
                int i50 = (i39 + 94) - (94 | i39);
                int i51 = ~((i49 + i50) - (i49 & i50));
                int i52 = ~(i39 | i43);
                int i53 = i51 ^ i52;
                int i54 = i51 & i52;
                int i55 = (i54 + i53) - (i54 & i53);
                int i56 = ~((94 ^ i40) | (94 & i40));
                int i57 = ((i55 ^ i56) | (i55 & i56)) * 184;
                int i58 = ((((i48 + i57) - (i48 & i57)) << 1) - (i57 ^ i48)) + (((-1) - (((-1) - iGreen) & ((-1) - (-95)))) * 184);
                byte minimumFlingVelocity = (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10);
                int i59 = 2070226999 - (~TextUtils.indexOf((CharSequence) "", '0'));
                int i60 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i61 = ((i60 | (-463349334)) << 1) - (i60 ^ (-463349334));
                Object[] objArr2 = new Object[1];
                p(s2, i58, minimumFlingVelocity, i59, i61, objArr2);
                Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
                short s3 = (short) ((-98) - (~TextUtils.indexOf((CharSequence) "", '0', 0)));
                int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                int i62 = maximumDrawingCacheSize * 370;
                int i63 = ((i62 - 35150) - (i62 | (-35150))) + (i62 | (-35150));
                int i64 = (-1) - (((-1) - (maximumDrawingCacheSize ^ (-95))) & ((-1) - ((maximumDrawingCacheSize - 95) - ((-95) | maximumDrawingCacheSize))));
                int i65 = -(-(((-1) - (((-1) - (i64 ^ i43)) & ((-1) - ((-1) - (((-1) - i64) | ((-1) - i43)))))) * (-369)));
                int i66 = ~maximumDrawingCacheSize;
                int i67 = ~((i66 ^ i43) | ((i66 + i43) - (i66 | i43)));
                int i68 = ((((i63 + i65) - (i63 & i65)) << 1) - (i63 ^ i65)) + (((-1) - (((-1) - (i67 ^ (-95))) & ((-1) - ((i67 - 95) - (i67 | (-95)))))) * (-369));
                int i69 = ~((94 ^ maximumDrawingCacheSize) | ((94 + maximumDrawingCacheSize) - (94 | maximumDrawingCacheSize)));
                int i70 = ~((-1) - (((-1) - (maximumDrawingCacheSize ^ i2)) & ((-1) - (maximumDrawingCacheSize & i2))));
                int i71 = i69 ^ i70;
                int i72 = (i70 + i69) - (i70 | i69);
                int i73 = (i71 + i72) - (i71 & i72);
                int i74 = (~maximumDrawingCacheSize) | i43;
                int i75 = ~((i74 - 95) - (i74 & (-95)));
                int i76 = i73 ^ i75;
                int i77 = (i75 + i73) - (i75 | i73);
                int i78 = -(-(((i77 + i76) - (i77 & i76)) * 369));
                byte b2 = (byte) ((-69) - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                int iRgb = Color.rgb(0, 0, 0);
                Object[] objArr4 = new Object[1];
                p(s3, (i68 ^ i78) + (((-1) - (((-1) - i68) | ((-1) - i78))) << 1), b2, ((iRgb | 2087004176) << 1) - (iRgb ^ 2087004176), (-463349296) - ExpandableListView.getPackedPositionGroup(0L), objArr4);
                try {
                    Object[] objArr5 = {(String) objArr4[0]};
                    int size = View.MeasureSpec.getSize(0);
                    int iNextInt = new Random().nextInt();
                    int i79 = (size * 960) - 30672;
                    int i80 = ~iNextInt;
                    int i81 = ~((-1) - (((-1) - ((-17) ^ i80)) & ((-1) - (((-17) + i80) - ((-17) | i80)))));
                    int i82 = ~((size ^ iNextInt) | ((-1) - (((-1) - size) | ((-1) - iNextInt))));
                    int i83 = ((-1) - (((-1) - (i81 ^ i82)) & ((-1) - ((i81 + i82) - (i81 | i82))))) * 959;
                    int i84 = ((i79 | i83) << 1) - (i83 ^ i79);
                    int i85 = (i84 ^ 16303) + (((i84 + 16303) - (i84 | 16303)) << 1);
                    int i86 = ~(((-1) - (((-1) - (-17)) | ((-1) - iNextInt))) | ((-17) ^ iNextInt));
                    int i87 = ~((-1) - (((-1) - (i80 & size)) & ((-1) - (i80 ^ size))));
                    int i88 = i86 ^ i87;
                    int i89 = (i87 + i86) - (i87 | i86);
                    short s4 = (short) ((i85 - (~(((i89 + i88) - (i89 & i88)) * 959))) - 1);
                    int i90 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                    int i91 = (i90 ^ (-95)) + (((-1) - (((-1) - i90) | ((-1) - (-95)))) << 1);
                    int threadPriority = Process.getThreadPriority(0);
                    int i92 = threadPriority * (-864);
                    int i93 = (((17320 ^ i92) + (((i92 + 17320) - (i92 | 17320)) << 1)) - (~(-(-(((~threadPriority) | (~(((-1) - (((-1) - (-21)) | ((-1) - i40))) | ((-21) ^ i40)))) * (-865)))))) - 1;
                    int i94 = (~((-1) - (((-1) - (i2 ^ 20)) & ((-1) - ((i2 + 20) - (20 | i2)))))) * 865;
                    int i95 = (i93 ^ i94) + (((i94 + i93) - (i94 | i93)) << 1);
                    int i96 = ~threadPriority;
                    int i97 = ~(((i96 + i43) - (i96 | i43)) | (i96 ^ i43));
                    int i98 = ~((-1) - (((-1) - ((i40 + 20) - (i40 | 20))) & ((-1) - (i40 ^ 20))));
                    int i99 = (i95 + ((((i98 + i97) - (i98 | i97)) | (i97 ^ i98)) * 865)) >> 6;
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i100 = i99 * 367;
                    int i101 = (i100 & 3670) + ((-1) - (((-1) - i100) & ((-1) - 3670)));
                    int i102 = ((i99 ^ 10) | ((-1) - (((-1) - i99) | ((-1) - 10)))) * (-366);
                    int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                    int i104 = -(-(((-1) - (((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - (-11)) | ((-1) - iMaxMemory)))) & ((-1) - ((-11) ^ iMaxMemory)))))) & ((-1) - i99))) * (-366)));
                    int i105 = (i103 & i104) + ((i103 + i104) - (i103 & i104));
                    int i106 = ~i99;
                    int i107 = ~((-1) - (((-1) - (i106 ^ 10)) & ((-1) - (i106 & 10))));
                    int i108 = (-11) ^ i99;
                    int i109 = (-1) - (((-1) - (-11)) | ((-1) - i99));
                    int i110 = (i108 + i109) - (i108 & i109);
                    int i111 = i110 ^ iMaxMemory;
                    int i112 = i110 & iMaxMemory;
                    int i113 = ~((i111 + i112) - (i111 & i112));
                    int i114 = i107 ^ i113;
                    int i115 = (-1) - (((-1) - i113) | ((-1) - i107));
                    int i116 = ((i115 + i114) - (i115 & i114)) * 366;
                    int i117 = -(ViewConfiguration.getEdgeSlop() >> 16);
                    Object[] objArr6 = new Object[1];
                    p(s4, i91, (byte) (((i105 + i116) - (i105 | i116)) + ((i116 + i105) - (i116 & i105))), (i117 ^ 2070226999) + (((i117 + 2070226999) - (i117 | 2070226999)) << 1), (-463349335) - (~(-(-Color.red(0)))), objArr6);
                    objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                    Object[] objArr7 = new Object[1];
                    q(new int[]{1113946465, 12028826, 1280353479, 1706052619, 399844660, 461632236, -2090306678, -510207077, -861310644, -2048268792, -1261900446, 762011191, -514869673, -942781716, 1580525149, 439453343}, 31 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr7);
                    try {
                        Object[] objArr8 = {(String) objArr7[0]};
                        int i118 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                        short s5 = (short) ((((-1) - (((-1) - i118) & ((-1) - 16))) << 1) - (i118 ^ 16));
                        int i119 = -AndroidCharacter.getMirror('0');
                        int i120 = f18903d * 1082196892;
                        f18903d = i120;
                        int i121 = (i119 * (-1939)) - 45637;
                        int i122 = 46 ^ i119;
                        int i123 = (-1) - (((-1) - 46) | ((-1) - i119));
                        int i124 = ~((i122 + i123) - (i122 & i123));
                        int i125 = ~i120;
                        int i126 = i125 ^ (-47);
                        int i127 = (i125 - 47) - (i125 | (-47));
                        int i128 = ~((i126 + i127) - (i126 & i127));
                        int i129 = i124 ^ i128;
                        int i130 = (i128 + i124) - (i128 | i124);
                        int i131 = -(-(((i129 + i130) - (i129 & i130)) * (-970)));
                        int i132 = (i121 ^ i131) + ((i121 & i131) << 1);
                        int i133 = ~i119;
                        int i134 = -(-((~((i133 ^ (-47)) | ((i133 - 47) - ((-47) | i133)))) * 1940));
                        int i135 = (((-1) - (((-1) - i132) & ((-1) - i134))) << 1) - (i134 ^ i132);
                        int i136 = i133 ^ 46;
                        int i137 = (-1) - (((-1) - i133) | ((-1) - 46));
                        int i138 = ~((i137 + i136) - (i137 & i136));
                        int i139 = ~i120;
                        int i140 = ~((i139 - 47) - (i139 & (-47)));
                        int i141 = i138 ^ i140;
                        int i142 = (-1) - (((-1) - i138) | ((-1) - i140));
                        int i143 = ((i142 + i141) - (i142 & i141)) * 970;
                        int i144 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr9 = new Object[1];
                        p(s5, (i135 ^ i143) + (((-1) - (((-1) - i143) | ((-1) - i135))) << 1), (byte) ((10 & i144) + ((i144 + 10) - (i144 & 10))), (ViewConfiguration.getPressedStateDuration() >> 16) + 2070226999, (-463349334) - (~TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr9);
                        objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                        try {
                            int i145 = -TextUtils.lastIndexOf("", '0', 0);
                            int i146 = (i145 ^ 22) + (((-1) - (((-1) - i145) | ((-1) - 22))) << 1);
                            Object[] objArr10 = new Object[1];
                            q(new int[]{902687048, -1829854023, -2079642387, 2117944624, 1786152699, 269641742, 2073830674, -457014042, -138556499, 680754373, 595323637, -1822333266}, i146, objArr10);
                            Class<?> cls = Class.forName((String) objArr10[0]);
                            short sIndexOf = (short) (64 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int iMakeMeasureSpec = (-95) - View.MeasureSpec.makeMeasureSpec(0, 0);
                            int i147 = -TextUtils.indexOf("", "", 0);
                            int i148 = f18901b * (-1330183842);
                            f18901b = i148;
                            int i149 = ~i147;
                            int i150 = ~((-84) | i149);
                            int i151 = ~(((-84) ^ i148) | ((-84) & i148));
                            int i152 = ((i147 * (-575)) - 47725) + (((-1) - (((-1) - (i150 ^ i151)) & ((-1) - ((i150 + i151) - (i150 | i151))))) * 576);
                            int i153 = ~((-1) - (((-1) - (~i147)) & ((-1) - 83)));
                            int i154 = ~i148;
                            int i155 = ((-84) ^ i154) | ((-1) - (((-1) - i154) | ((-1) - (-84))));
                            int i156 = i155 ^ i147;
                            int i157 = i155 & i147;
                            int i158 = ((-1) - (((-1) - i153) & ((-1) - (~((i157 + i156) - (i157 & i156)))))) * 576;
                            int i159 = (i152 ^ i158) + ((i158 & i152) << 1);
                            int i160 = i149 ^ (-84);
                            int i161 = (i149 - 84) - (i149 | (-84));
                            int i162 = -(-((~((i160 + i161) - (i160 & i161))) * 576));
                            byte b3 = (byte) ((i159 ^ i162) + (((-1) - (((-1) - i162) | ((-1) - i159))) << 1));
                            int gidForName = Process.getGidForName("");
                            int i163 = (gidForName ^ 2070226997) + (((gidForName + 2070226997) - (gidForName | 2070226997)) << 1);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                            int i164 = (iResolveOpacity * (-755)) - (-1936344099);
                            int i165 = ~iResolveOpacity;
                            int i166 = -(-((~((i165 ^ 463349264) | (463349264 & i165))) * 1512));
                            int i167 = (i164 ^ i166) + (((-1) - (((-1) - i164) | ((-1) - i166))) << 1);
                            int i168 = (iResolveOpacity & (-463349265)) | (iResolveOpacity ^ (-463349265));
                            int i169 = -(-(((-1) - (((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - 463349264) | ((-1) - i165)))) & ((-1) - (i165 ^ 463349264)))))) & ((-1) - (~((i168 ^ iElapsedRealtime) | (i168 & iElapsedRealtime)))))) * (-756)));
                            int i170 = (((i167 + i169) - (i167 & i169)) << 1) - (i167 ^ i169);
                            int i171 = ~iElapsedRealtime;
                            int i172 = i168 ^ i171;
                            int i173 = (-1) - (((-1) - i168) | ((-1) - i171));
                            Object[] objArr11 = new Object[1];
                            p(sIndexOf, iMakeMeasureSpec, b3, i163, i170 + (((i173 + i172) - (i173 & i172)) * 756), objArr11);
                            Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                            try {
                                int i174 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i175 = (((i174 + 23) - (23 & i174)) << 1) - (i174 ^ 23);
                                Object[] objArr12 = new Object[1];
                                q(new int[]{902687048, -1829854023, -2079642387, 2117944624, 1786152699, 269641742, 2073830674, -457014042, -138556499, 680754373, 595323637, -1822333266}, i175, objArr12);
                                Class<?> cls2 = Class.forName((String) objArr12[0]);
                                Object[] objArr13 = new Object[1];
                                q(new int[]{1523656635, 435430416, -1612181304, 1367106261, 2139406949, -860226828, -1144955578, 1538929588}, 14 - TextUtils.getOffsetAfter("", 0), objArr13);
                                try {
                                    Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                    int i176 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int i177 = f18900a * 396211126;
                                    f18900a = i177;
                                    int i178 = (i176 * 284) - 14664;
                                    int i179 = ~i176;
                                    int i180 = ~((i179 + 52) - (i179 & 52));
                                    int i181 = ~i176;
                                    int i182 = i181 ^ i177;
                                    int i183 = (i181 + i177) - (i181 | i177);
                                    int i184 = ~((i182 + i183) - (i182 & i183));
                                    int i185 = ((-1) - (((-1) - (i180 & i184)) & ((-1) - (i180 ^ i184)))) * (-283);
                                    int i186 = (((((i178 + i185) - (i178 & i185)) << 1) - (i178 ^ i185)) - (~((~((-1) - (((-1) - (i176 & (-53))) & ((-1) - ((-53) ^ i176))))) * 283))) - 1;
                                    int i187 = (-1) - (((-1) - (i181 ^ (-53))) & ((-1) - ((-1) - (((-1) - (-53)) | ((-1) - i181)))));
                                    int i188 = i187 ^ i177;
                                    int i189 = i187 & i177;
                                    int i190 = (~((i189 + i188) - (i189 & i188))) * 283;
                                    short s6 = (short) ((((-1) - (((-1) - i186) & ((-1) - i190))) << 1) - (i190 ^ i186));
                                    int i191 = -(-TextUtils.indexOf("", "", 0, 0));
                                    int i192 = (i191 ^ (-95)) + ((i191 & (-95)) << 1);
                                    byte windowTouchSlop = (byte) ((-37) - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                    int i193 = (iCombineMeasuredStates ^ 2070226990) + (((iCombineMeasuredStates + 2070226990) - (iCombineMeasuredStates | 2070226990)) << 1);
                                    int i194 = -View.resolveSizeAndState(0, 0, 0);
                                    int i195 = f18904e * 389443877;
                                    f18904e = i195;
                                    int i196 = i194 * 141;
                                    int i197 = (i196 ^ 425421312) + (((-1) - (((-1) - i196) | ((-1) - 425421312))) << 1) + (((-1) - (((-1) - (i195 ^ (-463349248))) & ((-1) - ((-1) - (((-1) - i195) | ((-1) - (-463349248))))))) * 140);
                                    int i198 = ~i194;
                                    int i199 = ~((-1) - (((-1) - (i198 ^ (-463349248))) & ((-1) - ((-1) - (((-1) - i198) | ((-1) - (-463349248)))))));
                                    int i200 = ~i195;
                                    int i201 = ~((-1) - (((-1) - (i200 ^ (-463349248))) & ((-1) - ((-1) - (((-1) - i200) | ((-1) - (-463349248)))))));
                                    int i202 = i199 ^ i201;
                                    int i203 = i201 & i199;
                                    int i204 = ((i202 + i203) - (i202 & i203)) * (-280);
                                    int i205 = (i197 ^ i204) + (((i204 + i197) - (i204 | i197)) << 1);
                                    int i206 = ~((-1) - (((-1) - 463349247) & ((-1) - i194)));
                                    int i207 = ~((i200 & i194) | (i200 ^ i194));
                                    int i208 = (-1) - (((-1) - (i207 & i206)) & ((-1) - (i206 ^ i207)));
                                    int i209 = ~i194;
                                    int i210 = (-1) - (((-1) - (i209 & (-463349248))) & ((-1) - (i209 ^ (-463349248))));
                                    int i211 = i210 ^ i195;
                                    int i212 = i210 & i195;
                                    int i213 = ~((i212 + i211) - (i212 & i211));
                                    int i214 = i208 ^ i213;
                                    int i215 = (-1) - (((-1) - i208) | ((-1) - i213));
                                    Object[] objArr15 = new Object[1];
                                    p(s6, i192, windowTouchSlop, i193, i205 + (((i215 + i214) - (i215 & i214)) * 140), objArr15);
                                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                                    Object[] objArr16 = new Object[1];
                                    q(new int[]{1523656635, 435430416, -1612181304, 1367106261, 1537523746, 113627054, -1443014586, 1773887149}, 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr16);
                                    Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                    Object[] objArr17 = new Object[1];
                                    q(new int[]{902687048, -1829854023, -2079642387, 2117944624, 1786152699, 269641742, 2073830674, -457014042, 1668677647, -470538674, -1612181304, 1367106261, 1537523746, 113627054, -1443014586, 1773887149}, 29 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr17);
                                    Class<?> cls4 = Class.forName((String) objArr17[0]);
                                    int i216 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    int i217 = (i216 ^ 10) + (((-1) - (((-1) - i216) | ((-1) - 10))) << 1);
                                    Object[] objArr18 = new Object[1];
                                    q(new int[]{1807018746, 1216024370, 503675106, -2117805537, 17030468, -687716227}, i217, objArr18);
                                    Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                    int length = objArr19.length;
                                    int i218 = 0;
                                    while (i218 < length) {
                                        Object obj = objArr19[i218];
                                        int i219 = -Process.getGidForName("");
                                        Object[] objArr20 = new Object[i4];
                                        p((short) ((((i219 + 20) - (20 & i219)) << i4) - (i219 ^ 20)), (-95) - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 122), 2070226980 - (~(ViewConfiguration.getFadingEdgeLength() >> 16)), (-463349216) - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8)))), objArr20);
                                        try {
                                            Object[] objArr21 = {(String) objArr20[0]};
                                            Object[] objArr22 = new Object[i4];
                                            q(new int[]{-1617669251, -752351625, -767483036, -238093637, 2046813102, -400015180, -1336514495, -551611543, -626024508, 914840523, -1186925132, -1749255241, 644495733, 705260414, 1461371517, -1557120290, -1128836544, 2022587006, 337313581, -1533942452}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, objArr22);
                                            Class<?> cls5 = Class.forName((String) objArr22[0]);
                                            short s7 = (short) ((-37) - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))));
                                            int capsMode = TextUtils.getCapsMode("", 0, 0);
                                            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                            int i220 = capsMode * (-1965);
                                            int i221 = ((((-1) - (((-1) - i220) & ((-1) - (-93480)))) << 1) - (i220 ^ (-93480))) + (((capsMode + 94) - (94 & capsMode)) * 983);
                                            int i222 = ~capsMode;
                                            int i223 = ~elapsedCpuTime2;
                                            int i224 = ~((94 + i223) - (94 & i223));
                                            int i225 = ((-1) - (((-1) - (i222 ^ i224)) & ((-1) - ((i224 + i222) - (i224 | i222))))) * (-983);
                                            int i226 = (i221 & i225) + ((-1) - (((-1) - i221) & ((-1) - i225)));
                                            int i227 = ~((-1) - (((-1) - (i223 & i222)) & ((-1) - (i222 ^ i223))));
                                            int i228 = ~(((i222 - 95) - (i222 | (-95))) | (i222 ^ (-95)));
                                            int i229 = -(-((((i227 + i228) - (i227 | i228)) | (i227 ^ i228)) * 983));
                                            int defaultSize = 2070226996 - View.getDefaultSize(0, 0);
                                            int i230 = -View.resolveSize(0, 0);
                                            int i231 = ((i230 - 463349210) - (i230 | (-463349210))) + ((i230 - 463349210) - (i230 & (-463349210)));
                                            Object[] objArr23 = new Object[1];
                                            p(s7, (i226 ^ i229) + (((i226 + i229) - (i226 | i229)) << 1), (byte) (TextUtils.getTrimmedLength("") - 110), defaultSize, i231, objArr23);
                                            Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                            try {
                                                int i232 = -KeyEvent.keyCodeFromString("");
                                                short s8 = (short) ((i232 ^ (-111)) + (((-1) - (((-1) - i232) | ((-1) - (-111)))) << 1));
                                                int i233 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                int iNextInt2 = new Random().nextInt(1366023990);
                                                int i234 = (((i233 * 758) + 71820) - (~(((-1) - (((-1) - (~iNextInt2)) & ((-1) - i233))) * (-757)))) - 1;
                                                int i235 = -(-((~((-1) - (((-1) - ((94 ^ i233) | ((-1) - (((-1) - 94) | ((-1) - i233))))) & ((-1) - iNextInt2)))) * 1514));
                                                int i236 = (i234 ^ i235) + ((i234 & i235) << 1);
                                                int i237 = ~i233;
                                                int i238 = i237 ^ 94;
                                                int i239 = i237 & 94;
                                                int i240 = ~((i238 + i239) - (i238 & i239));
                                                int i241 = ~iNextInt2;
                                                int i242 = 94 ^ i241;
                                                int i243 = 94 & i241;
                                                int i244 = ~((i242 + i243) - (i242 & i243));
                                                int i245 = (i240 ^ i244) | (i244 & i240);
                                                int i246 = ((-1) - (((-1) - i233) | ((-1) - (-95)))) | (i233 ^ (-95));
                                                int i247 = ~((-1) - (((-1) - ((i246 + iNextInt2) - (i246 | iNextInt2))) & ((-1) - (i246 ^ iNextInt2))));
                                                int i248 = ((-1) - (((-1) - ((-1) - (((-1) - i245) | ((-1) - i247)))) & ((-1) - (i245 ^ i247)))) * 757;
                                                int i249 = (i236 ^ i248) + (((-1) - (((-1) - i236) | ((-1) - i248))) << 1);
                                                int i250 = -TextUtils.getOffsetAfter("", 0);
                                                int i251 = f18902c * 1160092167;
                                                f18902c = i251;
                                                int i252 = i250 * 375;
                                                int i253 = ~i250;
                                                int i254 = ~((i253 - 13) - (i253 & (-13)));
                                                int i255 = ~i251;
                                                int i256 = i255 ^ i250;
                                                int i257 = i255 & i250;
                                                int i258 = ~((i256 + i257) - (i256 & i257));
                                                int i259 = ((((((-1) - (((-1) - i252) & ((-1) - 9711))) << 1) - (i252 ^ 9711)) + (((i254 + i258) - (i254 & i258)) * (-374))) - (~((~((-1) - (((-1) - (12 ^ i250)) & ((-1) - ((12 + i250) - (12 | i250)))))) * 748))) - 1;
                                                int i260 = ~i250;
                                                int i261 = ~((-1) - (((-1) - (i260 ^ 12)) & ((-1) - ((i260 + 12) - (i260 | 12)))));
                                                int i262 = i261 ^ i258;
                                                int i263 = (i261 + i258) - (i261 | i258);
                                                int i264 = -TextUtils.lastIndexOf("", '0');
                                                int i265 = ((i264 + 2070226989) - (i264 | 2070226989)) + ((i264 + 2070226989) - (i264 & 2070226989));
                                                int i266 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i267 = (i266 & (-463349199)) + ((i266 - 463349199) - (i266 & (-463349199)));
                                                Object[] objArr24 = new Object[1];
                                                p(s8, i249, (byte) (i259 + (((i263 + i262) - (i263 & i262)) * 374)), i265, i267, objArr24);
                                                Class<?> cls6 = Class.forName((String) objArr24[0]);
                                                int i268 = -TextUtils.lastIndexOf("", '0', 0);
                                                Object[] objArr25 = new Object[1];
                                                q(new int[]{-533816709, 441657359, 365893280, 2079948829, 658168904, -1867138738}, (i268 ^ 10) + ((i268 & 10) << 1), objArr25);
                                                try {
                                                    Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                    Object[] objArr27 = new Object[1];
                                                    q(new int[]{-1617669251, -752351625, -767483036, -238093637, 2046813102, -400015180, -1336514495, -551611543, -626024508, 914840523, -1186925132, -1749255241, 644495733, 705260414, 1461371517, -1557120290, -1128836544, 2022587006, 337313581, -1533942452}, 36 - (~(-(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))), objArr27);
                                                    Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                    int i269 = -Color.blue(0);
                                                    int i270 = f18906g * (-454550514);
                                                    f18906g = i270;
                                                    int i271 = i269 * 284;
                                                    int i272 = (i271 ^ 31020) + (((i271 + 31020) - (i271 | 31020)) << 1);
                                                    int i273 = ~i269;
                                                    int i274 = i273 ^ (-110);
                                                    int i275 = i273 & (-110);
                                                    int i276 = ~((i274 + i275) - (i274 & i275));
                                                    int i277 = ~i269;
                                                    int i278 = ~((-1) - (((-1) - (i277 ^ i270)) & ((-1) - (i277 & i270))));
                                                    int i279 = -(-(((i276 ^ i278) | ((i278 + i276) - (i278 | i276))) * (-283)));
                                                    int i280 = ((i272 + i279) - (i272 | i279)) + ((i279 + i272) - (i279 & i272));
                                                    int i281 = 109 ^ i269;
                                                    int i282 = (109 + i269) - (109 | i269);
                                                    int i283 = -(-((~((i282 + i281) - (i282 & i281))) * 283));
                                                    int i284 = ((-1) - (((-1) - i280) | ((-1) - i283))) + (i283 | i280);
                                                    int i285 = i277 | 109;
                                                    int i286 = (~(((-1) - (((-1) - i285) | ((-1) - i270))) | (i285 ^ i270))) * 283;
                                                    short s9 = (short) ((((i284 + i286) - (i284 & i286)) << 1) - (i286 ^ i284));
                                                    int threadPriority2 = Process.getThreadPriority(0);
                                                    int i287 = -((((threadPriority2 + 20) - (20 | threadPriority2)) + (threadPriority2 | 20)) >> 6);
                                                    int i288 = (i287 * 522) + 49400;
                                                    int i289 = ~((-1) - (((-1) - i43) & ((-1) - (-95))));
                                                    int i290 = ((i287 ^ i289) | ((-1) - (((-1) - i289) | ((-1) - i287)))) * (-1042);
                                                    int i291 = (((-1) - (((-1) - i288) & ((-1) - i290))) << 1) - (i288 ^ i290);
                                                    int i292 = -(-(((i2 - 95) - ((-95) & i2)) * 521));
                                                    int i293 = (i291 & i292) + ((-1) - (((-1) - i291) & ((-1) - i292)));
                                                    int i294 = ~i287;
                                                    int i295 = i294 ^ 94;
                                                    int i296 = i294 & 94;
                                                    int i297 = ~((i295 + i296) - (i295 & i296));
                                                    int i298 = ~i287;
                                                    int i299 = i298 ^ i2;
                                                    int i300 = i298 & i2;
                                                    int i301 = ~((i299 + i300) - (i299 & i300));
                                                    int i302 = i297 ^ i301;
                                                    int i303 = (i301 + i297) - (i301 | i297);
                                                    int i304 = (i302 + i303) - (i302 & i303);
                                                    int i305 = (i287 & i43) | (i43 ^ i287);
                                                    int i306 = ~((-1) - (((-1) - ((-1) - (((-1) - i305) | ((-1) - (-95))))) & ((-1) - (i305 ^ (-95)))));
                                                    int i307 = ((-1) - (((-1) - ((i306 + i304) - (i306 | i304))) & ((-1) - (i304 ^ i306)))) * 521;
                                                    int i308 = (i293 & i307) + (i293 | i307);
                                                    byte b4 = (byte) ((-34) - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))));
                                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2070226996;
                                                    int i309 = -View.MeasureSpec.getMode(0);
                                                    int iNextInt3 = new Random().nextInt();
                                                    int i310 = i309 * 673;
                                                    int i311 = (i310 ^ (-492321267)) + (((i310 - 492321267) - (i310 | (-492321267))) << 1);
                                                    int i312 = i309 ^ iNextInt3;
                                                    int i313 = i309 & iNextInt3;
                                                    int i314 = ~((i312 + i313) - (i312 & i313));
                                                    int i315 = ((-1) - (((-1) - (i314 ^ (-463349171))) & ((-1) - ((-1) - (((-1) - i314) | ((-1) - (-463349171))))))) * 672;
                                                    int i316 = (i311 & i315) + ((i311 + i315) - (i311 & i315));
                                                    int i317 = ~i309;
                                                    int i318 = ~iNextInt3;
                                                    int i319 = ~((-1) - (((-1) - (i317 ^ i318)) & ((-1) - (i317 & i318))));
                                                    int i320 = iNextInt3 ^ (-463349171);
                                                    int i321 = iNextInt3 & (-463349171);
                                                    int i322 = ~((i320 + i321) - (i320 & i321));
                                                    int i323 = i319 ^ i322;
                                                    int i324 = (-1) - (((-1) - i322) | ((-1) - i319));
                                                    int i325 = i316 + (((i323 + i324) - (i323 & i324)) * (-672));
                                                    int i326 = ~((463349170 + i318) - (463349170 & i318));
                                                    int i327 = ~((463349170 & i309) | (463349170 ^ i309));
                                                    int i328 = i326 ^ i327;
                                                    int i329 = (-1) - (((-1) - i326) | ((-1) - i327));
                                                    int i330 = -(-(((i329 + i328) - (i329 & i328)) * 672));
                                                    Object[] objArr28 = new Object[1];
                                                    p(s9, i308, b4, offsetBefore, ((i325 | i330) << 1) - (i325 ^ i330), objArr28);
                                                    Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                    int length2 = objArr3.length;
                                                    int i331 = 0;
                                                    while (i331 < 2) {
                                                        Object obj2 = objArr3[i331];
                                                        try {
                                                            int i332 = -TextUtils.getCapsMode("", 0, 0);
                                                            int i333 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                            int i334 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                            int i335 = -KeyEvent.normalizeMetaState(0);
                                                            Object[] objArr29 = new Object[1];
                                                            p((short) ((((i332 - 115) - ((-115) & i332)) << 1) - (i332 ^ (-115))), ((i333 - 94) - ((-94) | i333)) + ((i333 - 94) - (i333 & (-94))), (byte) ((((i334 + 18) - (18 & i334)) << 1) - (i334 ^ 18)), (i335 ^ 2070226999) + ((i335 & 2070226999) << 1), (-463349152) - (~(-(-TextUtils.lastIndexOf("", '0', 0, 0)))), objArr29);
                                                            Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                            int i336 = -TextUtils.indexOf("", "");
                                                            int i337 = f18905f * (-2098938712);
                                                            f18905f = i337;
                                                            int i338 = i336 * 69;
                                                            int i339 = ((-1) - (((-1) - i338) | ((-1) - (-7370)))) + ((-1) - (((-1) - i338) & ((-1) - (-7370))));
                                                            int i340 = ~i336;
                                                            int i341 = (i340 - 111) - ((-111) & i340);
                                                            int i342 = ~i337;
                                                            int i343 = ~((i341 ^ i342) | ((i341 + i342) - (i341 | i342)));
                                                            int i344 = i336 ^ 110;
                                                            int i345 = i336 & 110;
                                                            int i346 = ~((i344 + i345) - (i344 & i345));
                                                            int i347 = (-1) - (((-1) - (i343 ^ i346)) & ((-1) - ((-1) - (((-1) - i343) | ((-1) - i346)))));
                                                            int i348 = i337 ^ 110;
                                                            int i349 = (i337 + 110) - (i337 | 110);
                                                            int i350 = ((-1) - (((-1) - i347) & ((-1) - (~((i348 + i349) - (i348 & i349)))))) * (-68);
                                                            int i351 = (i339 ^ i350) + (((i350 + i339) - (i350 | i339)) << 1);
                                                            int i352 = ~i336;
                                                            int i353 = (-1) - (((-1) - ((-1) - (((-1) - i352) | ((-1) - i342)))) & ((-1) - (i352 ^ i342)));
                                                            int i354 = (i351 - (~(-(-((~((-1) - (((-1) - ((i353 + 110) - (i353 | 110))) & ((-1) - (i353 ^ 110))))) * (-68)))))) - 1;
                                                            int i355 = -(-(((~(((-111) & i342) | ((-111) ^ i342))) | i340) * 68));
                                                            int i356 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                            int i357 = -(-TextUtils.getCapsMode("", 0, 0));
                                                            int i358 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                            int i359 = (i358 ^ 2070226996) + (((i358 + 2070226996) - (i358 | 2070226996)) << 1);
                                                            int i360 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                            int i361 = (i360 ^ (-463349118)) + ((i360 & (-463349118)) << 1);
                                                            Object[] objArr30 = new Object[1];
                                                            p((short) ((i354 & i355) + ((-1) - (((-1) - i355) & ((-1) - i354)))), ((i356 | (-95)) << 1) - (i356 ^ (-95)), (byte) ((i357 ^ 10) + (((i357 + 10) - (i357 | 10)) << 1)), i359, i361, objArr30);
                                                            if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                                Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{(~((-1) - (((-1) - i2) | ((-1) - 1)))) & ((-1) - (((-1) - i2) & ((-1) - 1)))}};
                                                                int i362 = ~((-1) - (((-1) - (-908719574)) & ((-1) - i43)));
                                                                int i363 = (-1069547488) | i362;
                                                                int i364 = ~(908719573 | i2);
                                                                int i365 = ((((i363 + i364) - (i363 & i364)) * (-338)) - 51650059) + (((-1) - (((-1) - i362) & ((-1) - (~(((-160827915) + i2) - ((-160827915) & i2)))))) * ExifDirectoryBase.TAG_EXTRA_SAMPLES);
                                                                int i366 = (((i365 + 16) - (16 & i365)) << 1) - (i365 ^ 16);
                                                                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                                                int i367 = ((i366 * 477) - (~(i3 * (-475)))) - 1;
                                                                int i368 = ~((-1) - (((-1) - (~i366)) & ((-1) - i3)));
                                                                int i369 = ~i3;
                                                                int i370 = i369 ^ i366;
                                                                int i371 = i369 & i366;
                                                                int i372 = ~((-1) - (((-1) - ((i370 + i371) - (i370 & i371))) & ((-1) - iElapsedRealtime2)));
                                                                int i373 = (i367 - (~(((-1) - (((-1) - (i368 & i372)) & ((-1) - (i368 ^ i372)))) * (-476)))) - 1;
                                                                int i374 = (~i3) | i366;
                                                                int i375 = -(-((~((i374 & iElapsedRealtime2) | (i374 ^ iElapsedRealtime2))) * 952));
                                                                int i376 = (((((-1) - (((-1) - i373) & ((-1) - i375))) << 1) - (i373 ^ i375)) - (~(-(-((~((-1) - (((-1) - i366) & ((-1) - ((-1) - (((-1) - (~iElapsedRealtime2)) & ((-1) - i369))))))) * 476))))) - 1;
                                                                int i377 = i376 << 13;
                                                                int i378 = (~i377) & i376;
                                                                int i379 = ~i376;
                                                                int i380 = (-1) - (((-1) - ((i377 + i379) - (i377 | i379))) & ((-1) - i378));
                                                                int i381 = i380 >>> 17;
                                                                int i382 = (-1) - (((-1) - (i380 | i381)) | ((-1) - (~((-1) - (((-1) - i380) | ((-1) - i381))))));
                                                                ((int[]) objArr31[0])[0] = i382 ^ (i382 << 5);
                                                                return objArr31;
                                                            }
                                                            int i383 = i331 + 44;
                                                            i331 = (((-43) | i383) << 1) - (i383 ^ (-43));
                                                        } catch (Throwable th) {
                                                            Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    i218++;
                                                    i4 = 1;
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
            int[] iArr = new int[1];
            Object[] objArr32 = {iArr, new int[]{i2}, null, new int[]{i2}};
            int i384 = (-464127244) + ((~((-4526163) | i2)) * (-301)) + (((~((-1) - (((-1) - 390542167) & ((-1) - i2)))) | (~((-1) - (((-1) - (~i2)) & ((-1) - 1068690189))))) * (-301));
            int i385 = ~((i2 - 1068690190) - (i2 & (-1068690190)));
            int i386 = i384 + (((i385 + 390542167) - (i385 & 390542167)) * 301);
            int i387 = (((i3 + i386) - (i3 & i386)) << 1) - (i3 ^ i386);
            int i388 = i387 ^ (i387 << 13);
            int i389 = i388 >>> 17;
            int i390 = ~i389;
            int i391 = (i390 + i388) - (i390 | i388);
            int i392 = ~i388;
            int i393 = ((i392 + i389) - (i392 | i389)) | i391;
            int i394 = i393 << 5;
            int i395 = ~i394;
            iArr[0] = (-1) - (((-1) - ((~i393) & i394)) & ((-1) - ((i395 + i393) - (i395 | i393))));
            return objArr32;
        }

        static void init$0() {
            $$a = new byte[]{37, 121, MessagePack.Code.MAP32, 74};
            $$b = Mp4VideoDirectory.TAG_COMPRESSION_TYPE;
        }

        private static void p(short s2, int i2, byte b2, int i3, int i4, Object[] objArr) throws Throwable {
            int i5;
            int i6 = 2 % 2;
            j jVar = new j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(f18908i)};
                Object objA = o.d.d.a(-727631768);
                long j2 = 0;
                if (objA == null) {
                    byte b3 = (byte) 0;
                    objA = o.d.d.a(238 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (44532 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 12, 35969549, false, $$c(b3, (byte) (17 | b3), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                Object obj = null;
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                int i7 = iIntValue == -1 ? 1 : 0;
                if (i7 != 0) {
                    int i8 = $10 + 51;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    byte[] bArr = f18914o;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 11 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), 1621469864, false, $$c(b4, (byte) ((b4 + Ascii.DC2) - (b4 & Ascii.DC2)), b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i9++;
                            j2 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i10 = $10 + 21;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            byte[] bArr3 = f18914o;
                            Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(f18907h)};
                            Object objA3 = o.d.d.a(-727631768);
                            if (objA3 == null) {
                                byte b5 = (byte) 0;
                                objA3 = o.d.d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 238, (char) (KeyEvent.getDeadChar(0, 0) + 44531), Drawable.resolveOpacity(0, 0) + 11, 35969549, false, $$c(b5, (byte) (17 | b5), b5), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) >>> ((int) (((long) f18908i) * (-7649639543924978291L)));
                        } else {
                            byte[] bArr4 = f18914o;
                            Object[] objArr5 = {Integer.valueOf(i4), Integer.valueOf(f18907h)};
                            Object objA4 = o.d.d.a(-727631768);
                            if (objA4 == null) {
                                byte b6 = (byte) 0;
                                objA4 = o.d.d.a(238 - Color.red(0), (char) (44531 - (ViewConfiguration.getLongPressTimeout() >> 16)), Color.argb(0, 0, 0, 0) + 11, 35969549, false, $$c(b6, (byte) ((b6 + 17) - (17 & b6)), b6), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f18908i) ^ (-7649639543924978291L)));
                        }
                        iIntValue = (byte) i5;
                    } else {
                        iIntValue = (short) (((short) (((long) f18911l[i4 + ((int) (((long) f18907h) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f18908i) ^ (-7649639543924978291L))));
                    }
                }
                if (iIntValue > 0) {
                    int i11 = $11 + 67;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    jVar.f19936d = ((i4 + iIntValue) - 2) + ((int) (((long) f18907h) ^ (-7649639543924978291L))) + i7;
                    Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f18909j), sb};
                    Object objA5 = o.d.d.a(1819197256);
                    if (objA5 == null) {
                        objA5 = o.d.d.a(Color.alpha(0), (char) (5358 - Color.alpha(0)), 11 - (ViewConfiguration.getTapTimeout() >> 16), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr5 = f18914o;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            bArr6[i13] = (byte) (((long) bArr5[i13]) ^ (-7649639543924978291L));
                        }
                        int i14 = $11 + 1;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        bArr5 = bArr6;
                    }
                    boolean z2 = bArr5 != null;
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (z2) {
                            byte[] bArr7 = f18914o;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr7[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                            int i16 = $10 + 77;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                        } else {
                            short[] sArr = f18911l;
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

        private static void q(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i3;
            int i4 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = f18910k;
            int i5 = 989264422;
            int i6 = 0;
            if (iArr3 != null) {
                int i7 = $11 + 105;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i3 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(675 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i3++;
                        i5 = 989264422;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f18910k;
            if (iArr5 != null) {
                int i8 = $11 + 123;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = $11 + 31;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            byte b4 = (byte) i6;
                            byte b5 = b4;
                            objA2 = o.d.d.a(675 - TextUtils.getOffsetAfter("", i6), (char) Drawable.resolveOpacity(i6, i6), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                        Object objA3 = o.d.d.a(989264422);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 674, (char) (ViewConfiguration.getScrollBarSize() >> 8), 12 - (Process.myTid() >> 22), -328001469, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                        i10++;
                    }
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i6, iArr4, i6, length2);
            lVar.f19941d = i6;
            while (lVar.f19941d < iArr.length) {
                cArr[i6] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i12 = 0;
                for (int i13 = 16; i12 < i13; i13 = 16) {
                    lVar.f19942e ^= iArr4[i12];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 2);
                        objA4 = o.d.d.a(View.MeasureSpec.getMode(0) + 301, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 52696), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, -1416256172, false, $$c(b8, b9, (byte) (b9 - 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i12++;
                }
                int i14 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i14;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i15 = lVar.f19942e;
                int i16 = lVar.f19940a;
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
                    int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 228;
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 51005);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 9;
                    byte length4 = (byte) $$a.length;
                    objA5 = o.d.d.a(i17, cLastIndexOf, touchSlop, -330018025, false, $$c((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                i6 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public void onError(AntelopError antelopError) {
            int i2 = 2 % 2;
            int i3 = f18912m + 23;
            f18913n = i3 % 128;
            int i4 = i3 % 2;
            antelopCallback.onError(antelopError);
            int i5 = f18913n + 27;
            f18912m = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
        }

        @Override // fr.antelop.sdk.util.OperationCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r4) {
            int i2 = 2 % 2;
            int i3 = f18912m + 13;
            f18913n = i3 % 128;
            int i4 = i3 % 2;
            onSuccess2(r4);
            if (i4 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: onSuccess */
        public void onSuccess2(Void r5) {
            int i2 = 2 % 2;
            int i3 = f18913n + 39;
            f18912m = i3 % 128;
            if (i3 % 2 == 0) {
                antelopCallback.onSuccess();
                throw null;
            }
            antelopCallback.onSuccess();
            int i4 = f18913n + 39;
            f18912m = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, int r10, short r11) {
        /*
            byte[] r8 = fr.antelop.sdk.card.Card.$$a
            int r0 = r9 * 4
            int r7 = r0 + 1
            int r6 = r10 + 4
            int r0 = r11 * 2
            int r5 = r0 + 67
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r8 != 0) goto L2a
            r5 = r7
            r0 = r6
            r2 = r3
        L14:
            int r6 = r6 + r5
            r1 = r2
            r5 = r6
            r6 = r0
        L18:
            byte r0 = (byte) r5
            int r2 = r1 + 1
            r4[r1] = r0
            int r0 = r6 + 1
            if (r2 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r6 = r8[r0]
            goto L14
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.Card.$$c(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18899p = 1421528263;
        f18891h = 2122757183;
        f18892i = 325082501;
        f18890g = 1502628532;
        f18885b = -1481253070;
        f18888e = -2015520119;
        f18886c = 1020301022;
        f18884a = 2014699994;
        f18887d = 2079712773;
        f18897n = 0;
        f18894k = 1;
        f18893j = new char[]{2466, 2493, 2454, 2452, 2542, 2475, 2489, 2491, 2473, 2474, 2469, 2472, 2453, 2468, 2537, 2540, 2484, 2508, 2478, 2476, 2464, 2523, 2513, 2505, 2507, 2528, 2511, 2525, 2488, 2479, 2510, 2556, 2520, 2490, 2471, 2467, 2497, 2465, 2501, 2470, 2502, 2517};
        f18889f = 2040400156;
        f18898o = true;
        f18896m = true;
        f18895l = -1270219439;
    }

    public Card(d dVar) {
        this.innerCard = dVar;
    }

    public static Object[] a(Context context, int i2, int i3) {
        int i4 = 1;
        if (context == null) {
            Object[] objArr = {new int[1], new int[]{i2}, null, new int[]{i2}};
            int i5 = f18899p * (-607832951);
            f18899p = i5;
            int i6 = ~i5;
            int i7 = (-1433542448) + ((i5 | 215345787) * (-859)) + (((-1) - (((-1) - (~((-1) - (((-1) - i5) & ((-1) - (-144033851)))))) & ((-1) - (~((-1) - (((-1) - 215345787) & ((-1) - i6))))))) * 859);
            int i8 = ~((-1) - (((-1) - (-462802235)) & ((-1) - i6)));
            int i9 = i7 + (((i8 + 318768384) - (i8 & 318768384)) * 859);
            int i10 = f18887d * 367596682;
            f18887d = i10;
            int i11 = i9 * (-463);
            int i12 = ~i9;
            int i13 = ~i10;
            int i14 = ~(((-1) - (((-1) - i13) | ((-1) - i12))) | (i12 ^ i13));
            int i15 = ~i12;
            int i16 = (-1) - (((-1) - (i15 & i14)) & ((-1) - (i14 ^ i15)));
            int i17 = ~(~i10);
            int i18 = ((i16 & i17) | (i16 ^ i17)) * 464;
            int i19 = ((i11 + i18) - (i11 | i18)) + (i11 | i18);
            int i20 = (i10 ^ (-1)) | i10;
            int i21 = ~i9;
            int i22 = i20 ^ i21;
            int i23 = (i20 + i21) - (i20 | i21);
            int i24 = ((i23 + i22) - (i23 & i22)) * (-464);
            int i25 = ~i21;
            int i26 = ~i10;
            int i27 = ((((i19 | i24) << 1) - (i24 ^ i19)) - (~(-(-(((-1) - (((-1) - (i26 & i25)) & ((-1) - (i25 ^ i26)))) * 464))))) - 1;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i28 = (i27 * 69) + (i3 * (-67));
            int i29 = ~i27;
            int i30 = ~i3;
            int i31 = i29 ^ i30;
            int i32 = i29 & i30;
            int i33 = (i32 + i31) - (i32 & i31);
            int i34 = ~iMaxMemory;
            int i35 = ~((-1) - (((-1) - (i33 & i34)) & ((-1) - (i33 ^ i34))));
            int i36 = i27 ^ i3;
            int i37 = (-1) - (((-1) - i27) | ((-1) - i3));
            int i38 = i35 | (~((i36 + i37) - (i36 & i37)));
            int i39 = ~((-1) - (((-1) - i3) & ((-1) - iMaxMemory)));
            int i40 = i38 ^ i39;
            int i41 = (-1) - (((-1) - i38) | ((-1) - i39));
            int i42 = -(-(((i41 + i40) - (i41 & i40)) * (-68)));
            int i43 = (i28 & i42) + ((i28 + i42) - (i28 & i42));
            int i44 = ~i27;
            int i45 = ~iMaxMemory;
            int i46 = (i45 & i44) | (i44 ^ i45);
            int i47 = i46 ^ i3;
            int i48 = (-1) - (((-1) - i46) | ((-1) - i3));
            int i49 = -(-((~((i48 + i47) - (i48 & i47))) * (-68)));
            int i50 = (i43 & i49) + ((i49 + i43) - (i49 & i43));
            int i51 = ~i3;
            int i52 = ~((-1) - (((-1) - ((i51 + i34) - (i51 | i34))) & ((-1) - (i51 ^ i34))));
            int i53 = i50 + ((((i52 + i44) - (i52 | i44)) | (i44 ^ i52)) * 68);
            int i54 = (i53 << 13) ^ i53;
            int i55 = i54 >>> 17;
            int i56 = (-1) - (((-1) - ((i54 + i55) - (i54 & i55))) | ((-1) - (~((-1) - (((-1) - i54) | ((-1) - i55))))));
            ((int[]) objArr[0])[0] = i56 ^ (i56 << 5);
            return objArr;
        }
        try {
            int i57 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i58 = f18884a * 1818902954;
            f18884a = i58;
            int i59 = (i57 * (-1975)) + 124614;
            int i60 = ~i57;
            int i61 = ~((-1) - (((-1) - (i60 ^ 126)) & ((-1) - ((i60 + 126) - (i60 | 126)))));
            int i62 = ((-1) - (((-1) - (i58 ^ i61)) & ((-1) - ((-1) - (((-1) - i61) | ((-1) - i58)))))) * 988;
            int i63 = (i59 ^ i62) + ((i62 & i59) << 1);
            int i64 = ~((-127) | i57);
            int i65 = ~i58;
            int i66 = ~((-1) - (((-1) - (i65 ^ i57)) & ((-1) - ((i65 + i57) - (i65 | i57)))));
            int i67 = ((-1) - (((-1) - (i64 ^ i66)) & ((-1) - ((i64 + i66) - (i64 | i66))))) * (-1976);
            int i68 = (i63 ^ i67) + (((i63 + i67) - (i63 | i67)) << 1);
            int i69 = ~i57;
            int i70 = i69 ^ 126;
            int i71 = (-1) - (((-1) - i69) | ((-1) - 126));
            int i72 = ~((i71 + i70) - (i71 & i70));
            int i73 = ~((-1) - (((-1) - ((-127) ^ i58)) & ((-1) - (((-127) + i58) - ((-127) | i58)))));
            int i74 = (i72 ^ i73) | ((-1) - (((-1) - i72) | ((-1) - i73)));
            int i75 = ~i58;
            int i76 = (i74 | (~(((i75 + 126) - (i75 | 126)) | (i75 ^ 126)))) * 988;
            Object[] objArr2 = new Object[1];
            q(null, null, (((i68 + i76) - (i68 & i76)) << 1) - (i76 ^ i68), "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u0085\u0090\u0090\u008f\u0084\u0085\u008e\u008c\u0089\u0082\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            int offsetAfter = TextUtils.getOffsetAfter("", 0);
            int i77 = f18886c * 1431082009;
            f18886c = i77;
            int i78 = (offsetAfter * (-300)) + 9362;
            int i79 = (-1) - (((-1) - (offsetAfter ^ 31)) & ((-1) - ((-1) - (((-1) - offsetAfter) | ((-1) - 31)))));
            int i80 = i79 ^ i77;
            int i81 = (-1) - (((-1) - i79) | ((-1) - i77));
            int i82 = (~((i80 + i81) - (i80 & i81))) * (-301);
            int i83 = (i78 ^ i82) + (((-1) - (((-1) - i82) | ((-1) - i78))) << 1);
            int i84 = (-32) ^ i77;
            int i85 = (-32) & i77;
            int i86 = ~((i84 + i85) - (i84 & i85));
            int i87 = ~((~i77) | offsetAfter);
            int i88 = ((i86 ^ i87) | (i87 & i86)) * (-301);
            int i89 = (((-1) - (((-1) - i83) & ((-1) - i88))) << 1) - (i83 ^ i88);
            int i90 = ~offsetAfter;
            int i91 = ~((-1) - (((-1) - ((i90 + i77) - (i90 | i77))) & ((-1) - (i90 ^ i77))));
            int i92 = (-32) ^ i91;
            int i93 = ((-32) + i91) - ((-32) | i91);
            int i94 = -(-(((i93 + i92) - (i93 & i92)) * 301));
            int i95 = (((-1) - (((-1) - i89) & ((-1) - i94))) << 1) - (i94 ^ i89);
            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
            int i96 = maximumDrawingCacheSize * (-51);
            int i97 = ((i96 | 8427) << 1) - (i96 ^ 8427);
            int i98 = ~i2;
            int i99 = i98 ^ maximumDrawingCacheSize;
            int i100 = i98 & maximumDrawingCacheSize;
            int i101 = (i99 + i100) - (i99 & i100);
            int i102 = i101 ^ 159;
            int i103 = (i101 + 159) - (i101 | 159);
            int i104 = (~((i103 + i102) - (i103 & i102))) * 52;
            int i105 = (i97 ^ i104) + (((-1) - (((-1) - i97) | ((-1) - i104))) << 1);
            int i106 = ~(((-160) & i98) | ((-160) ^ i98));
            int i107 = ~(((-160) + maximumDrawingCacheSize) - ((-160) & maximumDrawingCacheSize));
            int i108 = (-1) - (((-1) - (i106 ^ i107)) & ((-1) - ((-1) - (((-1) - i106) | ((-1) - i107)))));
            int i109 = ~i2;
            int i110 = ~((-1) - (((-1) - (i109 ^ maximumDrawingCacheSize)) & ((-1) - ((-1) - (((-1) - i109) | ((-1) - maximumDrawingCacheSize))))));
            int i111 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i108) | ((-1) - i110)))) & ((-1) - (i108 ^ i110)))) * (-52)));
            int i112 = ((i105 + i111) - (i105 | i111)) + (i111 | i105);
            int i113 = ~maximumDrawingCacheSize;
            int i114 = ~((i113 ^ i98) | (i113 & i98));
            int i115 = ~((-1) - (((-1) - (i113 & 159)) & ((-1) - (i113 ^ 159))));
            int i116 = -(-((((-1) - (((-1) - i115) | ((-1) - i114))) | (i114 ^ i115)) * 52));
            int i117 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            Object[] objArr4 = new Object[1];
            r(i95, (i112 & i116) + ((-1) - (((-1) - i116) & ((-1) - i112))), ((-1) - (((-1) - i117) | ((-1) - 7))) + ((-1) - (((-1) - i117) & ((-1) - 7))), true, "\u001d\u000f\u0019￬￨\ufff9￮\ufffe\u0000￨￮ￗ\u000f\u0014\u001a\u001d\u000f\u0019￬￨\ufffaￗ\u0012 \r\u0010\uffefￋ\u000f\u0014\u001a", objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                int i118 = -Color.rgb(0, 0, 0);
                Object[] objArr6 = new Object[1];
                q(null, null, (((-1) - (((-1) - i118) & ((-1) - (-16777089)))) << 1) - (i118 ^ (-16777089)), "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u0085\u0090\u0090\u008f\u0084\u0085\u008e\u008c\u0089\u0082\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                q(null, null, 126 - Process.getGidForName(""), "£\u0089¢\u0087¡ \u009d\u008b\u009e\u008a\u009d\u0093\u009c\u0097\u009f\u0096\u009a\u009d\u008b\u009e\u008a\u009d\u0093\u009c\u0097\u009b\u009a\u0099\u0098\u0097\u0096", objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    int i119 = -(ViewConfiguration.getTouchSlop() >> 8);
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i120 = ~iUptimeMillis;
                    int i121 = (((i119 * 980) - 124206) - (~(-(-((~(((-128) ^ i120) | (((-128) + i120) - ((-128) | i120)))) * 979))))) - 1;
                    int i122 = i119 ^ iUptimeMillis;
                    int i123 = (i119 + iUptimeMillis) - (i119 | iUptimeMillis);
                    int i124 = -(-(((i122 + i123) - (i122 & i123)) * (-979)));
                    int i125 = (((-1) - (((-1) - i121) & ((-1) - i124))) << 1) - (i124 ^ i121);
                    int i126 = (-128) ^ iUptimeMillis;
                    int i127 = ((-128) + iUptimeMillis) - ((-128) | iUptimeMillis);
                    int i128 = (i125 - (~(((-1) - (((-1) - (~((i126 + i127) - (i126 & i127)))) & ((-1) - (~(((-1) - (((-1) - i119) | ((-1) - i120))) | (i120 ^ i119)))))) * 979))) - 1;
                    Object[] objArr9 = new Object[1];
                    q(null, null, i128, "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u0085\u0090\u0090\u008f\u0084\u0085\u008e\u008c\u0089\u0082\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        int i129 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                        Object[] objArr10 = new Object[1];
                        q(null, null, (((-1) - (((-1) - i129) & ((-1) - 127))) << 1) - (i129 ^ 127), "\u008c\u0084\u0087\u008c\u0093\u009e\u0096\u0085\u008c\u0093\u0087\u008c\u0093\u009e\u0088\u0085\u009d\u008b\u009e\u008a\u009d\u0093\u0082", objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int i130 = -(-Color.argb(0, 0, 0, 0));
                        Object[] objArr11 = new Object[1];
                        q(null, null, (i130 ^ 127) + (((i130 + 127) - (i130 | 127)) << 1), "\u008a\u0087£\u0082\u0093\u0082¥\u0087£\u0082¤\u0088\u0082\u0092\u008c\u0087£", objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            int i131 = -ExpandableListView.getPackedPositionType(0L);
                            Object[] objArr12 = new Object[1];
                            q(null, null, ((-1) - (((-1) - i131) | ((-1) - 127))) + (i131 | 127), "\u008c\u0084\u0087\u008c\u0093\u009e\u0096\u0085\u008c\u0093\u0087\u008c\u0093\u009e\u0088\u0085\u009d\u008b\u009e\u008a\u009d\u0093\u0082", objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            q(null, null, 126 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "\u0087¦\u0082\u009f\u0087£\u0082¤\u0088\u0082\u0092\u008c\u0087£", objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                int i132 = (iLastIndexOf * IptcDirectory.TAG_BY_LINE) - 20060;
                                int i133 = ~iLastIndexOf;
                                int i134 = i133 ^ 34;
                                int i135 = (-1) - (((-1) - i133) | ((-1) - 34));
                                int i136 = i132 + ((~((i134 + i135) - (i134 & i135))) * (-1182));
                                int i137 = (i133 ^ (-35)) | ((i133 - 35) - ((-35) | i133));
                                int i138 = ~(((i98 + i137) - (i98 | i137)) | (i137 ^ i98));
                                int i139 = ~(iLastIndexOf | 34);
                                int i140 = (i136 - (~(-(-(((i139 + i138) - (i139 & i138)) * (-591)))))) - 1;
                                int i141 = i2 ^ i133;
                                int i142 = i2 & i133;
                                int i143 = (i141 + i142) - (i141 & i142);
                                int i144 = ((i143 & (-35)) | (i143 ^ (-35))) * 591;
                                int i145 = ((-1) - (((-1) - i140) | ((-1) - i144))) + ((i144 + i140) - (i144 & i140));
                                int i146 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int iMyPid = Process.myPid();
                                int i147 = i146 * 677;
                                int i148 = ((i147 | (-116100)) << 1) - (i147 ^ (-116100));
                                int i149 = (-1) - (((-1) - i146) & ((-1) - iMyPid));
                                int i150 = i149 ^ (-173);
                                int i151 = i149 & (-173);
                                int i152 = -(-(((i151 + i150) - (i151 & i150)) * (-676)));
                                int i153 = (i148 & i152) + (i152 | i148);
                                int i154 = (-173) ^ i146;
                                int i155 = (-173) & i146;
                                int i156 = ~((i154 + i155) - (i154 & i155));
                                int i157 = ~iMyPid;
                                int i158 = i157 ^ i146;
                                int i159 = (-1) - (((-1) - i157) | ((-1) - i146));
                                int i160 = ~((i159 + i158) - (i159 & i158));
                                int i161 = i153 + (((-1) - (((-1) - (i156 & i160)) & ((-1) - (i156 ^ i160)))) * 676);
                                int i162 = ~i146;
                                int i163 = ~((i162 & (-173)) | (i162 ^ (-173)));
                                int i164 = ~iMyPid;
                                int i165 = ~((-1) - (((-1) - (i164 & (-173))) & ((-1) - ((-173) ^ i164))));
                                int i166 = i163 ^ i165;
                                int i167 = (-1) - (((-1) - i163) | ((-1) - i165));
                                int i168 = (i167 + i166) - (i167 & i166);
                                int i169 = ((i146 + 172) - (i146 | 172)) | (i146 ^ 172);
                                int i170 = i169 ^ iMyPid;
                                int i171 = i169 & iMyPid;
                                int i172 = ~((i171 + i170) - (i171 & i170));
                                int i173 = -(-((((-1) - (((-1) - i172) | ((-1) - i168))) | (i168 ^ i172)) * 676));
                                int i174 = (((-1) - (((-1) - i161) & ((-1) - i173))) << 1) - (i173 ^ i161);
                                int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                int i175 = f18888e * 1089991652;
                                f18888e = i175;
                                int i176 = (longPressTimeout * 217) - 4945;
                                int i177 = -(-((~((longPressTimeout ^ i175) | (longPressTimeout & i175))) * JfifUtil.MARKER_SOI));
                                int i178 = ((i176 + i177) - (i176 | i177)) + (i176 | i177);
                                int i179 = (-1) - (((-1) - (longPressTimeout ^ (-24))) & ((-1) - ((-1) - (((-1) - longPressTimeout) | ((-1) - (-24))))));
                                int i180 = ~i175;
                                int i181 = i179 ^ i180;
                                int i182 = i179 & i180;
                                int i183 = (i178 - (~(((i182 + i181) - (i182 & i181)) * (-216)))) - 1;
                                int i184 = ~((-1) - (((-1) - longPressTimeout) & ((-1) - i180)));
                                int i185 = ((-1) - (((-1) - (i184 & 23)) & ((-1) - (i184 ^ 23)))) * JfifUtil.MARKER_SOI;
                                Object[] objArr15 = new Object[1];
                                r(i145, i174, ((-1) - (((-1) - i183) | ((-1) - i185))) + ((i185 + i183) - (i185 & i183)), true, "\t\u0001\uffff￮ￌ\u000b\u000eￌ\u0012\f\u0003\u0012\f\r\u0001ￌ\u0002\u0007\r\u0010\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff￫\u0003\u0005\uffff", objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int i186 = -View.getDefaultSize(0, 0);
                                Object[] objArr16 = new Object[1];
                                q(null, null, (((i186 + 127) - (127 & i186)) << 1) - (i186 ^ 127), "\u009e¨\u0093§\u0087£\u0082¤\u0088\u0082\u0092\u008c\u0087£", objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int i187 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int i188 = (i187 ^ 30) + (((i187 + 30) - (i187 | 30)) << 1);
                                int threadPriority = Process.getThreadPriority(0);
                                int i189 = ((threadPriority ^ 20) + (((-1) - (((-1) - threadPriority) | ((-1) - 20))) << 1)) >> 6;
                                int i190 = (i189 ^ 171) + (((-1) - (((-1) - i189) | ((-1) - 171))) << 1);
                                int i191 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                int i192 = (i191 * 398) - 3960;
                                int i193 = ~i191;
                                int i194 = ~elapsedCpuTime;
                                int i195 = ~(((i193 + i194) - (i193 | i194)) | (i193 ^ i194));
                                int i196 = ~i191;
                                int i197 = i196 ^ 10;
                                int i198 = i196 & 10;
                                int i199 = ~((i197 + i198) - (i197 & i198));
                                int i200 = (-1) - (((-1) - (i195 & i199)) & ((-1) - (i195 ^ i199)));
                                int i201 = ~elapsedCpuTime;
                                int i202 = ~((-1) - (((-1) - ((i201 + 10) - (i201 | 10))) & ((-1) - (i201 ^ 10))));
                                int i203 = i200 ^ i202;
                                int i204 = i200 & i202;
                                int i205 = -(-(((i204 + i203) - (i204 & i203)) * (-397)));
                                int i206 = (((i192 + i205) - (i192 & i205)) << 1) - (i192 ^ i205);
                                int i207 = ~((i196 + 10) - (i196 & 10));
                                int i208 = i207 * (-397);
                                int i209 = (i206 ^ i208) + ((i208 & i206) << 1);
                                int i210 = (-1) - (((-1) - (elapsedCpuTime & i207)) & ((-1) - (elapsedCpuTime ^ i207)));
                                int i211 = ~((-1) - (((-1) - ((i191 - 11) - (i191 | (-11)))) & ((-1) - ((-11) ^ i191))));
                                int i212 = (((-1) - (((-1) - i211) | ((-1) - i210))) | (i210 ^ i211)) * 397;
                                Object[] objArr17 = new Object[1];
                                r(i188, i190, (i209 ^ i212) + (((i212 + i209) - (i212 | i209)) << 1), true, "\u000e\u0002ￍ\u0003\b\u000e\u0011\u0003\r\u0000\u000e\u0005\r￨\u0004\u0006\u0000\n\u0002\u0000\uffefￍ\f\u000fￍ\u0013\r\u0004\u0013\r", objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                int i213 = -(-Color.red(0));
                                int i214 = (i213 ^ 10) + (((i213 + 10) - (i213 | 10)) << 1);
                                int i215 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int iMyTid = Process.myTid();
                                int i216 = (i215 * (-518)) - 94794;
                                int i217 = ~i215;
                                int i218 = ~iMyTid;
                                int i219 = i217 ^ i218;
                                int i220 = (i218 + i217) - (i218 | i217);
                                int i221 = ~((i220 + i219) - (i220 & i219));
                                int i222 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i221) | ((-1) - 183)))) & ((-1) - (i221 ^ 183)))) * 519));
                                int i223 = (i216 & i222) + ((i216 + i222) - (i216 & i222));
                                int i224 = ~iMyTid;
                                int i225 = (-1) - (((-1) - ((-1) - (((-1) - i224) | ((-1) - i217)))) & ((-1) - (i217 ^ i224)));
                                int i226 = ~((-1) - (((-1) - (i225 & 183)) & ((-1) - (i225 ^ 183))));
                                int i227 = (i215 + 183) - (183 & i215);
                                int i228 = ~(((i227 + iMyTid) - (i227 | iMyTid)) | (i227 ^ iMyTid));
                                int i229 = i223 + (((-1) - (((-1) - ((-1) - (((-1) - i226) | ((-1) - i228)))) & ((-1) - (i226 ^ i228)))) * (-519));
                                int i230 = ~((-1) - (((-1) - ((iMyTid + 183) - (iMyTid | 183))) & ((-1) - (iMyTid ^ 183))));
                                int i231 = -(-(((-1) - (((-1) - (i215 & i230)) & ((-1) - (i215 ^ i230)))) * 519));
                                int i232 = -Gravity.getAbsoluteGravity(0, 0);
                                int i233 = (i232 ^ 5) + (((-1) - (((-1) - i232) | ((-1) - 5))) << 1);
                                Object[] objArr18 = new Object[1];
                                r(i214, ((i229 | i231) << 1) - (i231 ^ i229), i233, true, "\ufff4\u0001\ufffa￼\u0006\u0006\ufff8\u0005\b\u0007", objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i234 = 0;
                                while (i234 < length) {
                                    Object obj = objArr19[i234];
                                    int i235 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4;
                                    int i236 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i237 = i236 * 495;
                                    int i238 = (((i237 ^ (-65569)) + ((i237 & (-65569)) << i4)) - (~(-(-(((i236 - 134) - ((-134) & i236)) * (-988)))))) - i4;
                                    int i239 = ~i236;
                                    int i240 = i239 ^ 133;
                                    int i241 = (i239 + 133) - (133 | i239);
                                    int i242 = (i241 + i240) - (i241 & i240);
                                    int i243 = i242 ^ i109;
                                    int i244 = (i242 + i109) - (i242 | i109);
                                    int i245 = i238 + (((i244 + i243) - (i244 & i243)) * 494);
                                    int i246 = ~((-1) - (((-1) - (i239 ^ (-134))) & ((-1) - ((-1) - (((-1) - i239) | ((-1) - (-134)))))));
                                    int i247 = i109 ^ 133;
                                    int i248 = (i109 + 133) - (133 | i109);
                                    int i249 = i246 | (~((i247 + i248) - (i247 & i248)));
                                    int i250 = i236 ^ 133;
                                    int i251 = (-1) - (((-1) - i236) | ((-1) - 133));
                                    int i252 = ~((i251 + i250) - (i251 & i250));
                                    int i253 = (i245 - (~(-(-((((-1) - (((-1) - i249) | ((-1) - i252))) | (i249 ^ i252)) * 494))))) - 1;
                                    int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                    Object[] objArr20 = new Object[i4];
                                    r(i235, i253, (maximumFlingVelocity ^ 1) + (((maximumFlingVelocity + i4) - (maximumFlingVelocity | i4)) << i4), false, "\uffff\u001e\ufff4\ufffb\ufff6", objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        int i254 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        int i255 = f18885b * (-749622919);
                                        f18885b = i255;
                                        int i256 = (i254 * 483) + 30976;
                                        int i257 = ~i254;
                                        int i258 = i257 ^ (-129);
                                        int i259 = i257 & (-129);
                                        int i260 = ~((i258 + i259) - (i258 & i259));
                                        int i261 = ~i255;
                                        int i262 = ~((i257 ^ i261) | ((i257 + i261) - (i257 | i261)));
                                        int i263 = ((i260 ^ i262) | ((i260 + i262) - (i260 | i262))) * (-241);
                                        int i264 = (i256 ^ i263) + ((i263 & i256) << 1);
                                        int i265 = ((i254 ^ 128) | (128 & i254)) * (-482);
                                        int i266 = ((-1) - (((-1) - i264) | ((-1) - i265))) + ((i265 + i264) - (i265 & i264));
                                        int i267 = ~((-1) - (((-1) - ((-129) & i254)) & ((-1) - ((-129) ^ i254))));
                                        int i268 = (i261 + i257) - (i261 & i257);
                                        Object[] objArr22 = new Object[1];
                                        q(null, null, (i266 - (~(-(-(((-1) - (((-1) - i267) & ((-1) - (~((-1) - (((-1) - ((i268 + 128) - (i268 | 128))) & ((-1) - (i268 ^ 128)))))))) * 241))))) - 1, "\u008d\u008a\u009e\u008c\u0088\u0082©\u0087\u008c\u0082\u0088\u008b¨\u008b\u008c\u008a\u0087\u0096\u0085\u008c\u008a\u0087\u0088\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0083\u0082\u0081", objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        Object[] objArr23 = new Object[1];
                                        q(null, null, 127 - Drawable.resolveOpacity(0, 0), "\u0087\u0088\u0093\u0082\u008c\u0086\u0093§\u008c\u0087£", objArr23);
                                        Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                        try {
                                            int i269 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i270 = f18890g * (-1843265284);
                                            f18890g = i270;
                                            int i271 = (-1) - (((-1) - (i269 ^ 127)) & ((-1) - ((i269 + 127) - (127 | i269))));
                                            int i272 = ~i271;
                                            int i273 = ~(i269 | i270);
                                            int i274 = ((i269 * (-743)) - 94361) + (((-1) - (((-1) - ((-1) - (((-1) - (i272 ^ i273)) & ((-1) - (i273 & i272))))) & ((-1) - (~((-1) - (((-1) - (i270 ^ 127)) & ((-1) - ((-1) - (((-1) - i270) | ((-1) - 127)))))))))) * (-744));
                                            int i275 = ~i270;
                                            int i276 = ~i269;
                                            int i277 = ~((-1) - (((-1) - ((i276 - 128) - (i276 | (-128)))) & ((-1) - (i276 ^ (-128)))));
                                            int i278 = i275 ^ i277;
                                            int i279 = (i275 + i277) - (i275 | i277);
                                            int i280 = ((i274 + (((i279 + i278) - (i279 & i278)) * 744)) - (~(-(-(((-1) - (((-1) - (i271 ^ i270)) & ((-1) - ((-1) - (((-1) - i270) | ((-1) - i271)))))) * 744))))) - 1;
                                            Object[] objArr24 = new Object[1];
                                            q(null, null, i280, "\u0087\u008a\u0089\u008c\u0082\u0093£\u008b\u0099\u0085¦\u0094\u0085\u008c\u0093\u0087\u008c\u0093\u009e\u0088\u0085\u009d\u008b\u009e\u008a\u009d\u0093\u0082", objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                            int i281 = f18892i * 1467423814;
                                            f18892i = i281;
                                            int i282 = ~maxKeyCode;
                                            int i283 = ~i281;
                                            int i284 = ~((-1) - (((-1) - (i282 ^ i283)) & ((-1) - ((i282 + i283) - (i282 | i283)))));
                                            int i285 = i284 ^ 11;
                                            int i286 = (i284 + 11) - (i284 | 11);
                                            int i287 = (((maxKeyCode * 302) + 6633) - (~(((i285 + i286) - (i285 & i286)) * (-602)))) - 1;
                                            int i288 = ~((-12) | i282);
                                            int i289 = ~((i281 + i282) - (i281 & i282));
                                            int i290 = ((i288 + i289) - (i288 | i289)) | (i288 ^ i289);
                                            int i291 = ~((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - maxKeyCode) | ((-1) - i283)))) & ((-1) - (i283 ^ maxKeyCode))))) & ((-1) - 11)));
                                            int i292 = i290 ^ i291;
                                            int i293 = (i290 + i291) - (i290 | i291);
                                            int i294 = -(-(((i293 + i292) - (i293 & i292)) * (-301)));
                                            int i295 = (((i287 ^ i294) + (((i294 + i287) - (i294 | i287)) << 1)) - (~(-(-((~((i283 ^ 11) | ((-1) - (((-1) - i283) | ((-1) - 11))))) * 301))))) - 1;
                                            int iBlue = Color.blue(0);
                                            int i296 = f18891h * (-1577174677);
                                            f18891h = i296;
                                            int i297 = iBlue * 868;
                                            int i298 = (i297 ^ 153636) + (((-1) - (((-1) - i297) | ((-1) - 153636))) << 1);
                                            int i299 = ~iBlue;
                                            int i300 = ~i296;
                                            int i301 = ~((-1) - (((-1) - (i299 ^ i300)) & ((-1) - ((i299 + i300) - (i299 | i300)))));
                                            int i302 = ~(((-178) ^ i300) | ((-1) - (((-1) - (-178)) | ((-1) - i300))));
                                            int i303 = i301 ^ i302;
                                            int i304 = (-1) - (((-1) - i302) | ((-1) - i301));
                                            int i305 = i298 + (((i303 + i304) - (i303 & i304)) * (-867));
                                            int i306 = i299 ^ (-178);
                                            int i307 = (-178) & i299;
                                            int i308 = (i306 + i307) - (i306 & i307);
                                            int i309 = (-1) - (((-1) - (~((i299 ^ i296) | (i299 & i296)))) & ((-1) - (~i308)));
                                            int i310 = (-178) ^ i296;
                                            int i311 = (-178) & i296;
                                            int i312 = ~((i310 + i311) - (i310 & i311));
                                            int i313 = i305 + (((i309 ^ i312) | (i309 & i312)) * (-1734));
                                            int i314 = ~i296;
                                            int i315 = i308 ^ i314;
                                            int i316 = (i314 + i308) - (i314 | i308);
                                            int i317 = (-1) - (((-1) - ((i299 + 177) - (i299 | 177))) & ((-1) - (i299 ^ 177)));
                                            int i318 = (~((-1) - (((-1) - ((i317 + i296) - (i317 | i296))) & ((-1) - (i317 ^ i296))))) | (~((i316 + i315) - (i316 & i315)));
                                            int i319 = (-178) ^ iBlue;
                                            int i320 = (-1) - (((-1) - (-178)) | ((-1) - iBlue));
                                            int i321 = (i320 + i319) - (i320 & i319);
                                            int i322 = i321 ^ i296;
                                            int i323 = (-1) - (((-1) - i296) | ((-1) - i321));
                                            int i324 = ~((i323 + i322) - (i323 & i322));
                                            int i325 = -(-((((-1) - (((-1) - i324) | ((-1) - i318))) | (i318 ^ i324)) * 867));
                                            int i326 = (i313 & i325) + ((i325 + i313) - (i325 & i313));
                                            int i327 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                            int i328 = ~iElapsedRealtime;
                                            int i329 = ~((-1) - (((-1) - (-7)) & ((-1) - i328)));
                                            int i330 = ~i327;
                                            int i331 = i330 ^ iElapsedRealtime;
                                            int i332 = (i330 + iElapsedRealtime) - (i330 | iElapsedRealtime);
                                            int i333 = ~((i331 + i332) - (i331 & i332));
                                            int i334 = i329 ^ i333;
                                            int i335 = (i333 + i329) - (i333 | i329);
                                            int i336 = (i334 + i335) - (i334 & i335);
                                            int i337 = ~iElapsedRealtime;
                                            int i338 = ~((-1) - (((-1) - (i337 ^ i327)) & ((-1) - (i337 & i327))));
                                            int i339 = i336 ^ i338;
                                            int i340 = (-1) - (((-1) - i336) | ((-1) - i338));
                                            int i341 = ((i327 * (-958)) - 5748) + (((i339 + i340) - (i339 & i340)) * 959);
                                            int i342 = i327 ^ 6;
                                            int i343 = (-1) - (((-1) - i327) | ((-1) - 6));
                                            int i344 = (i341 - (~((~((i342 + i343) - (i342 & i343))) * (-959)))) - 1;
                                            int i345 = i330 ^ i328;
                                            int i346 = (i330 + i328) - (i330 | i328);
                                            int i347 = ~((i346 + i345) - (i346 & i345));
                                            int i348 = ~((-1) - (((-1) - (((-7) + iElapsedRealtime) - ((-7) | iElapsedRealtime))) & ((-1) - ((-7) ^ iElapsedRealtime))));
                                            int i349 = (-1) - (((-1) - ((-1) - (((-1) - i347) | ((-1) - i348)))) & ((-1) - (i347 ^ i348)));
                                            int i350 = ~((-1) - (((-1) - ((i327 + iElapsedRealtime) - (i327 | iElapsedRealtime))) & ((-1) - (i327 ^ iElapsedRealtime))));
                                            int i351 = i344 + (((-1) - (((-1) - (i350 & i349)) & ((-1) - (i349 ^ i350)))) * 959);
                                            Object[] objArr25 = new Object[1];
                                            r(i295, i326, i351, false, "ￚ\u000b\u000b\ufffa\u0012\r\bￛ\u0012\r\ufffe", objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                int i352 = -(-Color.rgb(0, 0, 0));
                                                Object[] objArr27 = new Object[1];
                                                q(null, null, (i352 ^ 16777343) + (((i352 + 16777343) - (i352 | 16777343)) << 1), "\u008d\u008a\u009e\u008c\u0088\u0082©\u0087\u008c\u0082\u0088\u008b¨\u008b\u008c\u008a\u0087\u0096\u0085\u008c\u008a\u0087\u0088\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0083\u0082\u0081", objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                int i353 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                int i354 = (((i353 + 19) - (19 & i353)) << 1) - (i353 ^ 19);
                                                int iIndexOf = TextUtils.indexOf("", "");
                                                Object[] objArr28 = new Object[1];
                                                r(i354, ((iIndexOf | 177) << 1) - (iIndexOf ^ 177), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, true, "\r\u000b\ufffeￜ\ufffe\r\ufffa\u000b\ufffe\u0007\ufffe\u0000\ufffe\r\ufffa￼\u0002\uffff\u0002", objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i355 = 0; i355 < 2; i355++) {
                                                    Object obj2 = objArr3[i355];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        q(null, null, 126 - (~(ViewConfiguration.getEdgeSlop() >> 16)), "\u0087\u008c\u0082\u0088\u008b¨\u008b\u008c\u008a\u0087\u0096ª\u0090\u008f\u0091\u0085\u008c\u008a\u0087\u0088\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0083\u0082\u0081", objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int i356 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                        Object[] objArr30 = new Object[1];
                                                        q(null, null, (i356 ^ 128) + (((-1) - (((-1) - i356) | ((-1) - 128))) << 1), "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u008c\u0088\u0087\u0081¢\u0089\u0099\u008c\u0087£", objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            int i357 = ~((i2 + 1) - (1 | i2));
                                                            int i358 = 1 | i2;
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{(i357 + i358) - (i357 | i358)}};
                                                            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                            int i359 = (-1129769427) + (((~(114101473 | elapsedCpuTime2)) | 691060758) * 104);
                                                            int i360 = ~elapsedCpuTime2;
                                                            int i361 = i359 + ((~((i360 - 12912737) - (i360 & (-12912737)))) * (-104)) + (((elapsedCpuTime2 + 792249495) - (elapsedCpuTime2 & 792249495)) * 104);
                                                            int i362 = (i361 ^ 16) + (((-1) - (((-1) - i361) | ((-1) - 16))) << 1) + i3;
                                                            int i363 = i362 << 13;
                                                            int i364 = (-1) - (((-1) - (~i363)) | ((-1) - i362));
                                                            int i365 = (-1) - (((-1) - (~i362)) | ((-1) - i363));
                                                            int i366 = (i365 + i364) - (i365 & i364);
                                                            int i367 = i366 >>> 17;
                                                            int i368 = ~i367;
                                                            int i369 = (i368 + i366) - (i368 | i366);
                                                            int i370 = ~i366;
                                                            int i371 = (i370 + i367) - (i370 | i367);
                                                            int i372 = (i371 + i369) - (i371 & i369);
                                                            int i373 = i372 << 5;
                                                            ((int[]) objArr31[0])[0] = ((-1) - (((-1) - i372) & ((-1) - i373))) & (~(i372 & i373));
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
                                                i234 = ((i234 & 1) << 1) + (i234 ^ 1);
                                                i4 = 1;
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
        Object[] objArr32 = {new int[1], new int[]{i2}, null, new int[]{i2}};
        int i374 = ((~((i2 + 551487785) - (i2 & 551487785))) * 420) + 815371133;
        int i375 = ~i2;
        int i376 = i374 + (((~(551487785 | i375)) | 9177096) * 420);
        int i377 = i376 * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION;
        int i378 = (i377 << 1) - i377;
        int i379 = ~i376;
        int i380 = ~i379;
        int i381 = ~(~i2);
        int i382 = -(-((((-1) - (((-1) - i380) | ((-1) - i381))) | (i380 ^ i381)) * (-712)));
        int i383 = ((i378 + i382) - (i378 | i382)) + ((i378 + i382) - (i378 & i382));
        int i384 = i379 ^ i375;
        int i385 = i379 & i375;
        int i386 = ~((i385 + i384) - (i385 & i384));
        int i387 = i376 ^ i2;
        int i388 = (i2 + i376) - (i2 | i376);
        int i389 = ~((i388 + i387) - (i388 & i387));
        int i390 = i386 ^ i389;
        int i391 = i389 & i386;
        int i392 = ((i391 + i390) - (i391 & i390)) * (-712);
        int i393 = (((-1) - (((-1) - i383) & ((-1) - i392))) << 1) - (i392 ^ i383);
        int i394 = ~i376;
        int i395 = ~i375;
        int i396 = i394 ^ i395;
        int i397 = (i394 + i395) - (i394 | i395);
        int i398 = -(-(((i397 + i396) - (i397 & i396)) * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT));
        int i399 = (i393 & i398) + ((-1) - (((-1) - i398) & ((-1) - i393)));
        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
        int i400 = i399 * (-115);
        int i401 = -(-(i3 * (-115)));
        int i402 = (i400 ^ i401) + ((i400 & i401) << 1);
        int i403 = (~iMaxMemory2) | i399;
        int i404 = i402 + ((~((i403 & i3) | (i403 ^ i3))) * (-116));
        int i405 = i399 ^ iMaxMemory2;
        int i406 = (i399 + iMaxMemory2) - (i399 | iMaxMemory2);
        int i407 = i404 + (((i405 + i406) - (i405 & i406)) * 116);
        int i408 = ~i399;
        int i409 = ~i3;
        int i410 = ~(i408 | i409);
        int i411 = ~(((iMaxMemory2 + i409) - (iMaxMemory2 | i409)) | (i409 ^ iMaxMemory2));
        int i412 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i411) | ((-1) - i410)))) & ((-1) - (i410 ^ i411)))) * 116));
        int i413 = (i407 ^ i412) + (((-1) - (((-1) - i412) | ((-1) - i407))) << 1);
        int i414 = (i413 << 13) ^ i413;
        int i415 = i414 >>> 17;
        int i416 = ((-1) - (((-1) - i414) & ((-1) - i415))) & (~(i414 & i415));
        int i417 = i416 << 5;
        ((int[]) objArr32[0])[0] = ((~i416) & i417) | ((-1) - (((-1) - (~i417)) | ((-1) - i416)));
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.CR, MessagePack.Code.FALSE, -97, -84};
        $$b = 77;
    }

    private static void q(int[] iArr, String str, int i2, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            int i4 = $11 + 3;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f18893j;
        int i6 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(593 - KeyEvent.getDeadChar(i6, i6), (char) (Color.red(i6) + 13181), MotionEvent.axisFromString("") + 12, -1225586509, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $11 + 19;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f18889f)};
        Object objA2 = o.d.d.a(-1503702982);
        long j2 = 0;
        if (objA2 == null) {
            objA2 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31, (char) View.combineMeasuredStates(0, 0), KeyEvent.keyCodeFromString("") + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f18896m) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA3 = o.d.d.a(TextUtils.indexOf("", "", 0) + 458, (char) View.combineMeasuredStates(0, 0), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1923924106, false, $$c(b4, b5, (byte) (b5 + 4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i10 = 0;
        if (f18898o) {
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA4 = o.d.d.a(457 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), AndroidCharacter.getMirror('0') - '%', -1923924106, false, $$c(b6, b7, (byte) (b7 + 4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                j2 = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i10;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i10 = fVar.f19922a + 1;
            }
        }
    }

    private static void r(int i2, int i3, int i4, boolean z2, String str, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i6 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(f18895l)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(269 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 11 - (ViewConfiguration.getTapTimeout() >> 16), -2071844881, false, $$c(b2, b3, (byte) (24 & b3)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(522 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 627984172, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) | ((-1) - 23)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i7 = $10 + 65;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            int i9 = $10 + 47;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i11 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a((ViewConfiguration.getScrollBarSize() >> 8) + 522, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 12 - (ViewConfiguration.getEdgeSlop() >> 16), 627984172, false, $$c(b6, b7, (byte) (23 & b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final int countGroups() {
        int i2 = 2 % 2;
        int i3 = f18897n + 111;
        f18894k = i3 % 128;
        int i4 = i3 % 2;
        d dVar = this.innerCard;
        if (i4 != 0) {
            return dVar.t();
        }
        dVar.t();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public final void delete(Context context, AntelopCallback antelopCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18897n + 33;
        f18894k = i3 % 128;
        AnonymousClass1 anonymousClass1 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (antelopCallback != null) {
            anonymousClass1 = new OperationCallback<Void>() { // from class: fr.antelop.sdk.card.Card.1
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a */
                public static int f18900a = 0;

                /* JADX INFO: renamed from: b */
                public static int f18901b = 0;

                /* JADX INFO: renamed from: c */
                public static int f18902c = 0;

                /* JADX INFO: renamed from: d */
                public static int f18903d = 0;

                /* JADX INFO: renamed from: e */
                public static int f18904e = 0;

                /* JADX INFO: renamed from: f */
                public static int f18905f = 0;

                /* JADX INFO: renamed from: g */
                public static int f18906g = 0;

                /* JADX INFO: renamed from: h */
                private static int f18907h = 0;

                /* JADX INFO: renamed from: i */
                private static int f18908i = 0;

                /* JADX INFO: renamed from: j */
                private static int f18909j = 0;

                /* JADX INFO: renamed from: k */
                private static int[] f18910k = null;

                /* JADX INFO: renamed from: l */
                private static short[] f18911l = null;

                /* JADX INFO: renamed from: m */
                private static int f18912m = 0;

                /* JADX INFO: renamed from: n */
                private static int f18913n = 0;

                /* JADX INFO: renamed from: o */
                private static byte[] f18914o = null;
                final /* synthetic */ AntelopCallback val$callback;

                private static String $$c(int v2, short v3, int v4) {
                    /*
                        byte[] r8 = fr.antelop.sdk.card.Card.AnonymousClass1.$$a
                        int r0 = r9 * 2
                        int r7 = 4 - r0
                        int r6 = 121 - r10
                        int r0 = r11 * 4
                        int r5 = r0 + 1
                        byte[] r4 = new byte[r5]
                        r3 = 0
                        if (r8 != 0) goto L2b
                        r2 = r7
                        r6 = r5
                        r1 = r3
                    L14:
                        int r7 = r7 + r6
                        int r0 = r2 + 1
                        r6 = r7
                        r7 = r0
                    L19:
                        byte r0 = (byte) r6
                        r4[r1] = r0
                        int r1 = r1 + 1
                        if (r1 != r5) goto L26
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        return r0
                    L26:
                        r0 = r8[r7]
                        r2 = r7
                        r7 = r0
                        goto L14
                    L2b:
                        r1 = r3
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.Card.AnonymousClass1.$$c(int, short, int):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f18905f = 426374810;
                    f18906g = 139336350;
                    f18902c = 2062956196;
                    f18904e = 1311238989;
                    f18900a = -130347213;
                    f18901b = -925377551;
                    f18903d = 1954043053;
                    f18913n = 0;
                    f18912m = 1;
                    f18907h = 1594633179;
                    f18908i = 1150422483;
                    f18909j = -1073162818;
                    f18914o = new byte[]{69, 124, 102, 112, 113, 98, 114, 96, -107, -105, 119, 108, 74, -99, 105, 119, 108, 42, -67, 49, 99, 104, -125, -92, 34, 114, 124, 96, 106, -123, 105, 101, -78, 33, -128, 92, -126, 96, 76, 41, -117, 37, -128, 91, 36, 37, 46, -103, 33, 126, -105, 57, -116, 86, Base64.padSymbol, -100, 46, 114, 119, -17, 36, 37, 46, -103, 33, 126, -105, 56, -108, 62, MessagePack.Code.FIXARRAY_PREFIX, -31, -103, MessagePack.Code.INT32, MessagePack.Code.FIXARRAY_PREFIX, -117, -9, -31, -103, -23, -105, -99, -116, MessagePack.Code.TRUE, -106, -31, 78, 47, 124, 36, 121, 47, Ascii.SYN, 114, 124, 36, 116, Ascii.DC2, 40, Ascii.ESC, 72, 107, 127, -24, MessagePack.Code.FIXSTR_PREFIX, 36, 19, 123, 36, 125, 46, 55, 80, 97, 96, 127, 44, 116, 47, 42, MessagePack.Code.INT64, -31, -27, Ascii.SUB, 32, 56, 1, 73, 41, 53, 49, 81, -31, 79, Ascii.FS, 51, -30, -16, -20, MessagePack.Code.FALSE, -30, -18, -15, MessagePack.Code.STR8, MessagePack.Code.EXT16, 44, -16, -83, 53, -23, -28, -4, -23, -10, -29, -72, 37, -6, -11, -16, -31, -7, MessagePack.Code.NEGFIXINT_PREFIX, 56, 17, -73, 2, Ascii.RS, MessagePack.Code.EXT8, Ascii.GS, Ascii.NAK, MessagePack.Code.BIN32, MessagePack.Code.UINT16, -26, -30, 17, -73, 19, MessagePack.Code.UINT16, Ascii.ESC, MessagePack.Code.EXT32, 2, 73, MessagePack.Code.STR32, -7, MessagePack.Code.INT32, MessagePack.Code.FIXEXT4, 9, -17, MessagePack.Code.FIXEXT8, Ascii.SO, Ascii.US, 46, 6, 3, MessagePack.Code.INT16, MessagePack.Code.UINT64, 38, -106, Ascii.SO, Ascii.US, Ascii.SO, Ascii.ETB, -105, 7, 1, MessagePack.Code.FIXEXT2, -17, -2, MessagePack.Code.INT32, MessagePack.Code.MAP16, 71, MessagePack.Code.MAP32, -31, -9, MessagePack.Code.FIXEXT2, 52, Ascii.RS, 0, Ascii.DC2, 19, Ascii.FS, 44, 2, 55, 49, 17, Ascii.SO, -28, Ascii.CR, 32, Ascii.VT, Ascii.SO, Ascii.EM, -12, 55, -22, Ascii.SUB, Ascii.VT};
                    f18910k = new int[]{148526209, 821657804, 277386293, -1047332158, -1715913607, 869565587, -1257677640, -1853958724, 475014886, 1821736184, 1604698333, -1649918701, -1757788736, -1898964964, -515215262, 1918690891, -1762884203, -831105119};
                }

                AnonymousClass1(AntelopCallback antelopCallback2) {
                    antelopCallback = antelopCallback2;
                }

                public static Object[] e(Context context2, int i22, int i32) {
                    int i4 = 1;
                    if (context2 == null) {
                        Object[] objArr = {new int[1], new int[]{i22}, null, new int[]{i22}};
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i5 = ~((-851199438) | elapsedCpuTime);
                        int i6 = (-1955620623) + (((-1) - (((-1) - 34604037) & ((-1) - i5))) * (-280)) + (((-1) - (((-1) - i5) & ((-1) - (~((173051415 + elapsedCpuTime) - (173051415 & elapsedCpuTime)))))) * 140);
                        int i7 = ~((-816595401) | elapsedCpuTime);
                        int i8 = ~elapsedCpuTime;
                        int i9 = i6 + (((~((-1) - (((-1) - i8) & ((-1) - 989646815)))) | i7 | (~((-34604038) | i8))) * 140);
                        int iMyPid = Process.myPid();
                        int i10 = ~i32;
                        int i11 = ~((i10 & i9) | (i10 ^ i9));
                        int i12 = ~i9;
                        int i13 = (-1) - (((-1) - (i12 ^ i32)) & ((-1) - ((-1) - (((-1) - i12) | ((-1) - i32)))));
                        int i14 = ~((-1) - (((-1) - ((i13 + iMyPid) - (i13 | iMyPid))) & ((-1) - (i13 ^ iMyPid))));
                        int i15 = (i9 * (-500)) + (i32 * (-500)) + (((i11 + i14) - (i11 & i14)) * 501);
                        int i16 = ~i32;
                        int i17 = i12 ^ i16;
                        int i18 = i16 & i12;
                        int i19 = (~((i18 + i17) - (i18 & i17))) * 1002;
                        int i20 = (i15 ^ i19) + ((i15 & i19) << 1);
                        int i21 = ~iMyPid;
                        int i222 = i12 ^ i21;
                        int i23 = (i21 + i12) - (i21 | i12);
                        int i24 = (i23 + i222) - (i23 & i222);
                        int i25 = i24 ^ i32;
                        int i26 = i24 & i32;
                        int i27 = -(-((~((i26 + i25) - (i26 & i25))) * 501));
                        int i28 = (((-1) - (((-1) - i20) & ((-1) - i27))) << 1) - (i27 ^ i20);
                        int i29 = i28 << 13;
                        int i30 = ((-1) - (((-1) - i29) & ((-1) - i28))) & (~((-1) - (((-1) - i28) | ((-1) - i29))));
                        int i31 = i30 >>> 17;
                        int i322 = (-1) - (((-1) - (~i31)) | ((-1) - i30));
                        int i33 = ~i30;
                        int i34 = ((i33 + i31) - (i33 | i31)) | i322;
                        int i35 = i34 << 5;
                        ((int[]) objArr[0])[0] = (-1) - (((-1) - ((i34 + i35) - (i34 & i35))) | ((-1) - (~(i34 & i35))));
                        return objArr;
                    }
                    try {
                        int i36 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                        short s2 = (short) (((i36 + 16) - (16 | i36)) + ((i36 + 16) - (i36 & 16)));
                        int iGreen = Color.green(0);
                        int i37 = iGreen * (-183);
                        int i38 = (((-1) - (((-1) - i37) & ((-1) - 17385))) << 1) - (i37 ^ 17385);
                        int i39 = ~iGreen;
                        int i40 = ~i22;
                        int i41 = (i39 ^ i40) | ((i39 + i40) - (i39 | i40));
                        int i42 = ~((i41 ^ (-95)) | ((i41 - 95) - (i41 | (-95))));
                        int i43 = ~i22;
                        int i44 = 94 ^ i43;
                        int i45 = 94 & i43;
                        int i46 = ~(((i44 + i45) - (i44 & i45)) | iGreen);
                        int i47 = -(-(((i42 ^ i46) | (i42 & i46)) * (-184)));
                        int i48 = (i38 ^ i47) + ((i47 & i38) << 1);
                        int i49 = i39 ^ 94;
                        int i50 = (i39 + 94) - (94 | i39);
                        int i51 = ~((i49 + i50) - (i49 & i50));
                        int i52 = ~(i39 | i43);
                        int i53 = i51 ^ i52;
                        int i54 = i51 & i52;
                        int i55 = (i54 + i53) - (i54 & i53);
                        int i56 = ~((94 ^ i40) | (94 & i40));
                        int i57 = ((i55 ^ i56) | (i55 & i56)) * 184;
                        int i58 = ((((i48 + i57) - (i48 & i57)) << 1) - (i57 ^ i48)) + (((-1) - (((-1) - iGreen) & ((-1) - (-95)))) * 184);
                        byte minimumFlingVelocity = (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10);
                        int i59 = 2070226999 - (~TextUtils.indexOf((CharSequence) "", '0'));
                        int i60 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i61 = ((i60 | (-463349334)) << 1) - (i60 ^ (-463349334));
                        Object[] objArr2 = new Object[1];
                        p(s2, i58, minimumFlingVelocity, i59, i61, objArr2);
                        Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
                        short s3 = (short) ((-98) - (~TextUtils.indexOf((CharSequence) "", '0', 0)));
                        int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int i62 = maximumDrawingCacheSize * 370;
                        int i63 = ((i62 - 35150) - (i62 | (-35150))) + (i62 | (-35150));
                        int i64 = (-1) - (((-1) - (maximumDrawingCacheSize ^ (-95))) & ((-1) - ((maximumDrawingCacheSize - 95) - ((-95) | maximumDrawingCacheSize))));
                        int i65 = -(-(((-1) - (((-1) - (i64 ^ i43)) & ((-1) - ((-1) - (((-1) - i64) | ((-1) - i43)))))) * (-369)));
                        int i66 = ~maximumDrawingCacheSize;
                        int i67 = ~((i66 ^ i43) | ((i66 + i43) - (i66 | i43)));
                        int i68 = ((((i63 + i65) - (i63 & i65)) << 1) - (i63 ^ i65)) + (((-1) - (((-1) - (i67 ^ (-95))) & ((-1) - ((i67 - 95) - (i67 | (-95)))))) * (-369));
                        int i69 = ~((94 ^ maximumDrawingCacheSize) | ((94 + maximumDrawingCacheSize) - (94 | maximumDrawingCacheSize)));
                        int i70 = ~((-1) - (((-1) - (maximumDrawingCacheSize ^ i22)) & ((-1) - (maximumDrawingCacheSize & i22))));
                        int i71 = i69 ^ i70;
                        int i72 = (i70 + i69) - (i70 | i69);
                        int i73 = (i71 + i72) - (i71 & i72);
                        int i74 = (~maximumDrawingCacheSize) | i43;
                        int i75 = ~((i74 - 95) - (i74 & (-95)));
                        int i76 = i73 ^ i75;
                        int i77 = (i75 + i73) - (i75 | i73);
                        int i78 = -(-(((i77 + i76) - (i77 & i76)) * 369));
                        byte b2 = (byte) ((-69) - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                        int iRgb = Color.rgb(0, 0, 0);
                        Object[] objArr4 = new Object[1];
                        p(s3, (i68 ^ i78) + (((-1) - (((-1) - i68) | ((-1) - i78))) << 1), b2, ((iRgb | 2087004176) << 1) - (iRgb ^ 2087004176), (-463349296) - ExpandableListView.getPackedPositionGroup(0L), objArr4);
                        try {
                            Object[] objArr5 = {(String) objArr4[0]};
                            int size = View.MeasureSpec.getSize(0);
                            int iNextInt = new Random().nextInt();
                            int i79 = (size * 960) - 30672;
                            int i80 = ~iNextInt;
                            int i81 = ~((-1) - (((-1) - ((-17) ^ i80)) & ((-1) - (((-17) + i80) - ((-17) | i80)))));
                            int i82 = ~((size ^ iNextInt) | ((-1) - (((-1) - size) | ((-1) - iNextInt))));
                            int i83 = ((-1) - (((-1) - (i81 ^ i82)) & ((-1) - ((i81 + i82) - (i81 | i82))))) * 959;
                            int i84 = ((i79 | i83) << 1) - (i83 ^ i79);
                            int i85 = (i84 ^ 16303) + (((i84 + 16303) - (i84 | 16303)) << 1);
                            int i86 = ~(((-1) - (((-1) - (-17)) | ((-1) - iNextInt))) | ((-17) ^ iNextInt));
                            int i87 = ~((-1) - (((-1) - (i80 & size)) & ((-1) - (i80 ^ size))));
                            int i88 = i86 ^ i87;
                            int i89 = (i87 + i86) - (i87 | i86);
                            short s4 = (short) ((i85 - (~(((i89 + i88) - (i89 & i88)) * 959))) - 1);
                            int i90 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                            int i91 = (i90 ^ (-95)) + (((-1) - (((-1) - i90) | ((-1) - (-95)))) << 1);
                            int threadPriority = Process.getThreadPriority(0);
                            int i92 = threadPriority * (-864);
                            int i93 = (((17320 ^ i92) + (((i92 + 17320) - (i92 | 17320)) << 1)) - (~(-(-(((~threadPriority) | (~(((-1) - (((-1) - (-21)) | ((-1) - i40))) | ((-21) ^ i40)))) * (-865)))))) - 1;
                            int i94 = (~((-1) - (((-1) - (i22 ^ 20)) & ((-1) - ((i22 + 20) - (20 | i22)))))) * 865;
                            int i95 = (i93 ^ i94) + (((i94 + i93) - (i94 | i93)) << 1);
                            int i96 = ~threadPriority;
                            int i97 = ~(((i96 + i43) - (i96 | i43)) | (i96 ^ i43));
                            int i98 = ~((-1) - (((-1) - ((i40 + 20) - (i40 | 20))) & ((-1) - (i40 ^ 20))));
                            int i99 = (i95 + ((((i98 + i97) - (i98 | i97)) | (i97 ^ i98)) * 865)) >> 6;
                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                            int i100 = i99 * 367;
                            int i101 = (i100 & 3670) + ((-1) - (((-1) - i100) & ((-1) - 3670)));
                            int i102 = ((i99 ^ 10) | ((-1) - (((-1) - i99) | ((-1) - 10)))) * (-366);
                            int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                            int i104 = -(-(((-1) - (((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - (-11)) | ((-1) - iMaxMemory)))) & ((-1) - ((-11) ^ iMaxMemory)))))) & ((-1) - i99))) * (-366)));
                            int i105 = (i103 & i104) + ((i103 + i104) - (i103 & i104));
                            int i106 = ~i99;
                            int i107 = ~((-1) - (((-1) - (i106 ^ 10)) & ((-1) - (i106 & 10))));
                            int i108 = (-11) ^ i99;
                            int i109 = (-1) - (((-1) - (-11)) | ((-1) - i99));
                            int i110 = (i108 + i109) - (i108 & i109);
                            int i111 = i110 ^ iMaxMemory;
                            int i112 = i110 & iMaxMemory;
                            int i113 = ~((i111 + i112) - (i111 & i112));
                            int i114 = i107 ^ i113;
                            int i115 = (-1) - (((-1) - i113) | ((-1) - i107));
                            int i116 = ((i115 + i114) - (i115 & i114)) * 366;
                            int i117 = -(ViewConfiguration.getEdgeSlop() >> 16);
                            Object[] objArr6 = new Object[1];
                            p(s4, i91, (byte) (((i105 + i116) - (i105 | i116)) + ((i116 + i105) - (i116 & i105))), (i117 ^ 2070226999) + (((i117 + 2070226999) - (i117 | 2070226999)) << 1), (-463349335) - (~(-(-Color.red(0)))), objArr6);
                            objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                            Object[] objArr7 = new Object[1];
                            q(new int[]{1113946465, 12028826, 1280353479, 1706052619, 399844660, 461632236, -2090306678, -510207077, -861310644, -2048268792, -1261900446, 762011191, -514869673, -942781716, 1580525149, 439453343}, 31 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr7);
                            try {
                                Object[] objArr8 = {(String) objArr7[0]};
                                int i118 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                short s5 = (short) ((((-1) - (((-1) - i118) & ((-1) - 16))) << 1) - (i118 ^ 16));
                                int i119 = -AndroidCharacter.getMirror('0');
                                int i120 = f18903d * 1082196892;
                                f18903d = i120;
                                int i121 = (i119 * (-1939)) - 45637;
                                int i122 = 46 ^ i119;
                                int i123 = (-1) - (((-1) - 46) | ((-1) - i119));
                                int i124 = ~((i122 + i123) - (i122 & i123));
                                int i125 = ~i120;
                                int i126 = i125 ^ (-47);
                                int i127 = (i125 - 47) - (i125 | (-47));
                                int i128 = ~((i126 + i127) - (i126 & i127));
                                int i129 = i124 ^ i128;
                                int i130 = (i128 + i124) - (i128 | i124);
                                int i131 = -(-(((i129 + i130) - (i129 & i130)) * (-970)));
                                int i132 = (i121 ^ i131) + ((i121 & i131) << 1);
                                int i133 = ~i119;
                                int i134 = -(-((~((i133 ^ (-47)) | ((i133 - 47) - ((-47) | i133)))) * 1940));
                                int i135 = (((-1) - (((-1) - i132) & ((-1) - i134))) << 1) - (i134 ^ i132);
                                int i136 = i133 ^ 46;
                                int i137 = (-1) - (((-1) - i133) | ((-1) - 46));
                                int i138 = ~((i137 + i136) - (i137 & i136));
                                int i139 = ~i120;
                                int i140 = ~((i139 - 47) - (i139 & (-47)));
                                int i141 = i138 ^ i140;
                                int i142 = (-1) - (((-1) - i138) | ((-1) - i140));
                                int i143 = ((i142 + i141) - (i142 & i141)) * 970;
                                int i144 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                Object[] objArr9 = new Object[1];
                                p(s5, (i135 ^ i143) + (((-1) - (((-1) - i143) | ((-1) - i135))) << 1), (byte) ((10 & i144) + ((i144 + 10) - (i144 & 10))), (ViewConfiguration.getPressedStateDuration() >> 16) + 2070226999, (-463349334) - (~TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr9);
                                objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                                try {
                                    int i145 = -TextUtils.lastIndexOf("", '0', 0);
                                    int i146 = (i145 ^ 22) + (((-1) - (((-1) - i145) | ((-1) - 22))) << 1);
                                    Object[] objArr10 = new Object[1];
                                    q(new int[]{902687048, -1829854023, -2079642387, 2117944624, 1786152699, 269641742, 2073830674, -457014042, -138556499, 680754373, 595323637, -1822333266}, i146, objArr10);
                                    Class<?> cls = Class.forName((String) objArr10[0]);
                                    short sIndexOf = (short) (64 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                    int iMakeMeasureSpec = (-95) - View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int i147 = -TextUtils.indexOf("", "", 0);
                                    int i148 = f18901b * (-1330183842);
                                    f18901b = i148;
                                    int i149 = ~i147;
                                    int i150 = ~((-84) | i149);
                                    int i151 = ~(((-84) ^ i148) | ((-84) & i148));
                                    int i152 = ((i147 * (-575)) - 47725) + (((-1) - (((-1) - (i150 ^ i151)) & ((-1) - ((i150 + i151) - (i150 | i151))))) * 576);
                                    int i153 = ~((-1) - (((-1) - (~i147)) & ((-1) - 83)));
                                    int i154 = ~i148;
                                    int i155 = ((-84) ^ i154) | ((-1) - (((-1) - i154) | ((-1) - (-84))));
                                    int i156 = i155 ^ i147;
                                    int i157 = i155 & i147;
                                    int i158 = ((-1) - (((-1) - i153) & ((-1) - (~((i157 + i156) - (i157 & i156)))))) * 576;
                                    int i159 = (i152 ^ i158) + ((i158 & i152) << 1);
                                    int i160 = i149 ^ (-84);
                                    int i161 = (i149 - 84) - (i149 | (-84));
                                    int i162 = -(-((~((i160 + i161) - (i160 & i161))) * 576));
                                    byte b3 = (byte) ((i159 ^ i162) + (((-1) - (((-1) - i162) | ((-1) - i159))) << 1));
                                    int gidForName = Process.getGidForName("");
                                    int i163 = (gidForName ^ 2070226997) + (((gidForName + 2070226997) - (gidForName | 2070226997)) << 1);
                                    int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                    int i164 = (iResolveOpacity * (-755)) - (-1936344099);
                                    int i165 = ~iResolveOpacity;
                                    int i166 = -(-((~((i165 ^ 463349264) | (463349264 & i165))) * 1512));
                                    int i167 = (i164 ^ i166) + (((-1) - (((-1) - i164) | ((-1) - i166))) << 1);
                                    int i168 = (iResolveOpacity & (-463349265)) | (iResolveOpacity ^ (-463349265));
                                    int i169 = -(-(((-1) - (((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - 463349264) | ((-1) - i165)))) & ((-1) - (i165 ^ 463349264)))))) & ((-1) - (~((i168 ^ iElapsedRealtime) | (i168 & iElapsedRealtime)))))) * (-756)));
                                    int i170 = (((i167 + i169) - (i167 & i169)) << 1) - (i167 ^ i169);
                                    int i171 = ~iElapsedRealtime;
                                    int i172 = i168 ^ i171;
                                    int i173 = (-1) - (((-1) - i168) | ((-1) - i171));
                                    Object[] objArr11 = new Object[1];
                                    p(sIndexOf, iMakeMeasureSpec, b3, i163, i170 + (((i173 + i172) - (i173 & i172)) * 756), objArr11);
                                    Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context2, null);
                                    try {
                                        int i174 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i175 = (((i174 + 23) - (23 & i174)) << 1) - (i174 ^ 23);
                                        Object[] objArr12 = new Object[1];
                                        q(new int[]{902687048, -1829854023, -2079642387, 2117944624, 1786152699, 269641742, 2073830674, -457014042, -138556499, 680754373, 595323637, -1822333266}, i175, objArr12);
                                        Class<?> cls2 = Class.forName((String) objArr12[0]);
                                        Object[] objArr13 = new Object[1];
                                        q(new int[]{1523656635, 435430416, -1612181304, 1367106261, 2139406949, -860226828, -1144955578, 1538929588}, 14 - TextUtils.getOffsetAfter("", 0), objArr13);
                                        try {
                                            Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context2, null), 64};
                                            int i176 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int i177 = f18900a * 396211126;
                                            f18900a = i177;
                                            int i178 = (i176 * 284) - 14664;
                                            int i179 = ~i176;
                                            int i180 = ~((i179 + 52) - (i179 & 52));
                                            int i181 = ~i176;
                                            int i182 = i181 ^ i177;
                                            int i183 = (i181 + i177) - (i181 | i177);
                                            int i184 = ~((i182 + i183) - (i182 & i183));
                                            int i185 = ((-1) - (((-1) - (i180 & i184)) & ((-1) - (i180 ^ i184)))) * (-283);
                                            int i186 = (((((i178 + i185) - (i178 & i185)) << 1) - (i178 ^ i185)) - (~((~((-1) - (((-1) - (i176 & (-53))) & ((-1) - ((-53) ^ i176))))) * 283))) - 1;
                                            int i187 = (-1) - (((-1) - (i181 ^ (-53))) & ((-1) - ((-1) - (((-1) - (-53)) | ((-1) - i181)))));
                                            int i188 = i187 ^ i177;
                                            int i189 = i187 & i177;
                                            int i190 = (~((i189 + i188) - (i189 & i188))) * 283;
                                            short s6 = (short) ((((-1) - (((-1) - i186) & ((-1) - i190))) << 1) - (i190 ^ i186));
                                            int i191 = -(-TextUtils.indexOf("", "", 0, 0));
                                            int i192 = (i191 ^ (-95)) + ((i191 & (-95)) << 1);
                                            byte windowTouchSlop = (byte) ((-37) - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                            int i193 = (iCombineMeasuredStates ^ 2070226990) + (((iCombineMeasuredStates + 2070226990) - (iCombineMeasuredStates | 2070226990)) << 1);
                                            int i194 = -View.resolveSizeAndState(0, 0, 0);
                                            int i195 = f18904e * 389443877;
                                            f18904e = i195;
                                            int i196 = i194 * 141;
                                            int i197 = (i196 ^ 425421312) + (((-1) - (((-1) - i196) | ((-1) - 425421312))) << 1) + (((-1) - (((-1) - (i195 ^ (-463349248))) & ((-1) - ((-1) - (((-1) - i195) | ((-1) - (-463349248))))))) * 140);
                                            int i198 = ~i194;
                                            int i199 = ~((-1) - (((-1) - (i198 ^ (-463349248))) & ((-1) - ((-1) - (((-1) - i198) | ((-1) - (-463349248)))))));
                                            int i200 = ~i195;
                                            int i201 = ~((-1) - (((-1) - (i200 ^ (-463349248))) & ((-1) - ((-1) - (((-1) - i200) | ((-1) - (-463349248)))))));
                                            int i202 = i199 ^ i201;
                                            int i203 = i201 & i199;
                                            int i204 = ((i202 + i203) - (i202 & i203)) * (-280);
                                            int i205 = (i197 ^ i204) + (((i204 + i197) - (i204 | i197)) << 1);
                                            int i206 = ~((-1) - (((-1) - 463349247) & ((-1) - i194)));
                                            int i207 = ~((i200 & i194) | (i200 ^ i194));
                                            int i208 = (-1) - (((-1) - (i207 & i206)) & ((-1) - (i206 ^ i207)));
                                            int i209 = ~i194;
                                            int i210 = (-1) - (((-1) - (i209 & (-463349248))) & ((-1) - (i209 ^ (-463349248))));
                                            int i211 = i210 ^ i195;
                                            int i212 = i210 & i195;
                                            int i213 = ~((i212 + i211) - (i212 & i211));
                                            int i214 = i208 ^ i213;
                                            int i215 = (-1) - (((-1) - i208) | ((-1) - i213));
                                            Object[] objArr15 = new Object[1];
                                            p(s6, i192, windowTouchSlop, i193, i205 + (((i215 + i214) - (i215 & i214)) * 140), objArr15);
                                            Class<?> cls3 = Class.forName((String) objArr15[0]);
                                            Object[] objArr16 = new Object[1];
                                            q(new int[]{1523656635, 435430416, -1612181304, 1367106261, 1537523746, 113627054, -1443014586, 1773887149}, 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr16);
                                            Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                            Object[] objArr17 = new Object[1];
                                            q(new int[]{902687048, -1829854023, -2079642387, 2117944624, 1786152699, 269641742, 2073830674, -457014042, 1668677647, -470538674, -1612181304, 1367106261, 1537523746, 113627054, -1443014586, 1773887149}, 29 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr17);
                                            Class<?> cls4 = Class.forName((String) objArr17[0]);
                                            int i216 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            int i217 = (i216 ^ 10) + (((-1) - (((-1) - i216) | ((-1) - 10))) << 1);
                                            Object[] objArr18 = new Object[1];
                                            q(new int[]{1807018746, 1216024370, 503675106, -2117805537, 17030468, -687716227}, i217, objArr18);
                                            Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                            int length = objArr19.length;
                                            int i218 = 0;
                                            while (i218 < length) {
                                                Object obj = objArr19[i218];
                                                int i219 = -Process.getGidForName("");
                                                Object[] objArr20 = new Object[i4];
                                                p((short) ((((i219 + 20) - (20 & i219)) << i4) - (i219 ^ 20)), (-95) - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 122), 2070226980 - (~(ViewConfiguration.getFadingEdgeLength() >> 16)), (-463349216) - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8)))), objArr20);
                                                try {
                                                    Object[] objArr21 = {(String) objArr20[0]};
                                                    Object[] objArr22 = new Object[i4];
                                                    q(new int[]{-1617669251, -752351625, -767483036, -238093637, 2046813102, -400015180, -1336514495, -551611543, -626024508, 914840523, -1186925132, -1749255241, 644495733, 705260414, 1461371517, -1557120290, -1128836544, 2022587006, 337313581, -1533942452}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, objArr22);
                                                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                                                    short s7 = (short) ((-37) - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))));
                                                    int capsMode = TextUtils.getCapsMode("", 0, 0);
                                                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                    int i220 = capsMode * (-1965);
                                                    int i221 = ((((-1) - (((-1) - i220) & ((-1) - (-93480)))) << 1) - (i220 ^ (-93480))) + (((capsMode + 94) - (94 & capsMode)) * 983);
                                                    int i2222 = ~capsMode;
                                                    int i223 = ~elapsedCpuTime2;
                                                    int i224 = ~((94 + i223) - (94 & i223));
                                                    int i225 = ((-1) - (((-1) - (i2222 ^ i224)) & ((-1) - ((i224 + i2222) - (i224 | i2222))))) * (-983);
                                                    int i226 = (i221 & i225) + ((-1) - (((-1) - i221) & ((-1) - i225)));
                                                    int i227 = ~((-1) - (((-1) - (i223 & i2222)) & ((-1) - (i2222 ^ i223))));
                                                    int i228 = ~(((i2222 - 95) - (i2222 | (-95))) | (i2222 ^ (-95)));
                                                    int i229 = -(-((((i227 + i228) - (i227 | i228)) | (i227 ^ i228)) * 983));
                                                    int defaultSize = 2070226996 - View.getDefaultSize(0, 0);
                                                    int i230 = -View.resolveSize(0, 0);
                                                    int i231 = ((i230 - 463349210) - (i230 | (-463349210))) + ((i230 - 463349210) - (i230 & (-463349210)));
                                                    Object[] objArr23 = new Object[1];
                                                    p(s7, (i226 ^ i229) + (((i226 + i229) - (i226 | i229)) << 1), (byte) (TextUtils.getTrimmedLength("") - 110), defaultSize, i231, objArr23);
                                                    Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                                    try {
                                                        int i232 = -KeyEvent.keyCodeFromString("");
                                                        short s8 = (short) ((i232 ^ (-111)) + (((-1) - (((-1) - i232) | ((-1) - (-111)))) << 1));
                                                        int i233 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                        int iNextInt2 = new Random().nextInt(1366023990);
                                                        int i234 = (((i233 * 758) + 71820) - (~(((-1) - (((-1) - (~iNextInt2)) & ((-1) - i233))) * (-757)))) - 1;
                                                        int i235 = -(-((~((-1) - (((-1) - ((94 ^ i233) | ((-1) - (((-1) - 94) | ((-1) - i233))))) & ((-1) - iNextInt2)))) * 1514));
                                                        int i236 = (i234 ^ i235) + ((i234 & i235) << 1);
                                                        int i237 = ~i233;
                                                        int i238 = i237 ^ 94;
                                                        int i239 = i237 & 94;
                                                        int i240 = ~((i238 + i239) - (i238 & i239));
                                                        int i241 = ~iNextInt2;
                                                        int i242 = 94 ^ i241;
                                                        int i243 = 94 & i241;
                                                        int i244 = ~((i242 + i243) - (i242 & i243));
                                                        int i245 = (i240 ^ i244) | (i244 & i240);
                                                        int i246 = ((-1) - (((-1) - i233) | ((-1) - (-95)))) | (i233 ^ (-95));
                                                        int i247 = ~((-1) - (((-1) - ((i246 + iNextInt2) - (i246 | iNextInt2))) & ((-1) - (i246 ^ iNextInt2))));
                                                        int i248 = ((-1) - (((-1) - ((-1) - (((-1) - i245) | ((-1) - i247)))) & ((-1) - (i245 ^ i247)))) * 757;
                                                        int i249 = (i236 ^ i248) + (((-1) - (((-1) - i236) | ((-1) - i248))) << 1);
                                                        int i250 = -TextUtils.getOffsetAfter("", 0);
                                                        int i251 = f18902c * 1160092167;
                                                        f18902c = i251;
                                                        int i252 = i250 * 375;
                                                        int i253 = ~i250;
                                                        int i254 = ~((i253 - 13) - (i253 & (-13)));
                                                        int i255 = ~i251;
                                                        int i256 = i255 ^ i250;
                                                        int i257 = i255 & i250;
                                                        int i258 = ~((i256 + i257) - (i256 & i257));
                                                        int i259 = ((((((-1) - (((-1) - i252) & ((-1) - 9711))) << 1) - (i252 ^ 9711)) + (((i254 + i258) - (i254 & i258)) * (-374))) - (~((~((-1) - (((-1) - (12 ^ i250)) & ((-1) - ((12 + i250) - (12 | i250)))))) * 748))) - 1;
                                                        int i260 = ~i250;
                                                        int i261 = ~((-1) - (((-1) - (i260 ^ 12)) & ((-1) - ((i260 + 12) - (i260 | 12)))));
                                                        int i262 = i261 ^ i258;
                                                        int i263 = (i261 + i258) - (i261 | i258);
                                                        int i264 = -TextUtils.lastIndexOf("", '0');
                                                        int i265 = ((i264 + 2070226989) - (i264 | 2070226989)) + ((i264 + 2070226989) - (i264 & 2070226989));
                                                        int i266 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i267 = (i266 & (-463349199)) + ((i266 - 463349199) - (i266 & (-463349199)));
                                                        Object[] objArr24 = new Object[1];
                                                        p(s8, i249, (byte) (i259 + (((i263 + i262) - (i263 & i262)) * 374)), i265, i267, objArr24);
                                                        Class<?> cls6 = Class.forName((String) objArr24[0]);
                                                        int i268 = -TextUtils.lastIndexOf("", '0', 0);
                                                        Object[] objArr25 = new Object[1];
                                                        q(new int[]{-533816709, 441657359, 365893280, 2079948829, 658168904, -1867138738}, (i268 ^ 10) + ((i268 & 10) << 1), objArr25);
                                                        try {
                                                            Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                            Object[] objArr27 = new Object[1];
                                                            q(new int[]{-1617669251, -752351625, -767483036, -238093637, 2046813102, -400015180, -1336514495, -551611543, -626024508, 914840523, -1186925132, -1749255241, 644495733, 705260414, 1461371517, -1557120290, -1128836544, 2022587006, 337313581, -1533942452}, 36 - (~(-(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))), objArr27);
                                                            Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                            int i269 = -Color.blue(0);
                                                            int i270 = f18906g * (-454550514);
                                                            f18906g = i270;
                                                            int i271 = i269 * 284;
                                                            int i272 = (i271 ^ 31020) + (((i271 + 31020) - (i271 | 31020)) << 1);
                                                            int i273 = ~i269;
                                                            int i274 = i273 ^ (-110);
                                                            int i275 = i273 & (-110);
                                                            int i276 = ~((i274 + i275) - (i274 & i275));
                                                            int i277 = ~i269;
                                                            int i278 = ~((-1) - (((-1) - (i277 ^ i270)) & ((-1) - (i277 & i270))));
                                                            int i279 = -(-(((i276 ^ i278) | ((i278 + i276) - (i278 | i276))) * (-283)));
                                                            int i280 = ((i272 + i279) - (i272 | i279)) + ((i279 + i272) - (i279 & i272));
                                                            int i281 = 109 ^ i269;
                                                            int i282 = (109 + i269) - (109 | i269);
                                                            int i283 = -(-((~((i282 + i281) - (i282 & i281))) * 283));
                                                            int i284 = ((-1) - (((-1) - i280) | ((-1) - i283))) + (i283 | i280);
                                                            int i285 = i277 | 109;
                                                            int i286 = (~(((-1) - (((-1) - i285) | ((-1) - i270))) | (i285 ^ i270))) * 283;
                                                            short s9 = (short) ((((i284 + i286) - (i284 & i286)) << 1) - (i286 ^ i284));
                                                            int threadPriority2 = Process.getThreadPriority(0);
                                                            int i287 = -((((threadPriority2 + 20) - (20 | threadPriority2)) + (threadPriority2 | 20)) >> 6);
                                                            int i288 = (i287 * 522) + 49400;
                                                            int i289 = ~((-1) - (((-1) - i43) & ((-1) - (-95))));
                                                            int i290 = ((i287 ^ i289) | ((-1) - (((-1) - i289) | ((-1) - i287)))) * (-1042);
                                                            int i291 = (((-1) - (((-1) - i288) & ((-1) - i290))) << 1) - (i288 ^ i290);
                                                            int i292 = -(-(((i22 - 95) - ((-95) & i22)) * 521));
                                                            int i293 = (i291 & i292) + ((-1) - (((-1) - i291) & ((-1) - i292)));
                                                            int i294 = ~i287;
                                                            int i295 = i294 ^ 94;
                                                            int i296 = i294 & 94;
                                                            int i297 = ~((i295 + i296) - (i295 & i296));
                                                            int i298 = ~i287;
                                                            int i299 = i298 ^ i22;
                                                            int i300 = i298 & i22;
                                                            int i301 = ~((i299 + i300) - (i299 & i300));
                                                            int i302 = i297 ^ i301;
                                                            int i303 = (i301 + i297) - (i301 | i297);
                                                            int i304 = (i302 + i303) - (i302 & i303);
                                                            int i305 = (i287 & i43) | (i43 ^ i287);
                                                            int i306 = ~((-1) - (((-1) - ((-1) - (((-1) - i305) | ((-1) - (-95))))) & ((-1) - (i305 ^ (-95)))));
                                                            int i307 = ((-1) - (((-1) - ((i306 + i304) - (i306 | i304))) & ((-1) - (i304 ^ i306)))) * 521;
                                                            int i308 = (i293 & i307) + (i293 | i307);
                                                            byte b4 = (byte) ((-34) - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))));
                                                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2070226996;
                                                            int i309 = -View.MeasureSpec.getMode(0);
                                                            int iNextInt3 = new Random().nextInt();
                                                            int i310 = i309 * 673;
                                                            int i311 = (i310 ^ (-492321267)) + (((i310 - 492321267) - (i310 | (-492321267))) << 1);
                                                            int i312 = i309 ^ iNextInt3;
                                                            int i313 = i309 & iNextInt3;
                                                            int i314 = ~((i312 + i313) - (i312 & i313));
                                                            int i315 = ((-1) - (((-1) - (i314 ^ (-463349171))) & ((-1) - ((-1) - (((-1) - i314) | ((-1) - (-463349171))))))) * 672;
                                                            int i316 = (i311 & i315) + ((i311 + i315) - (i311 & i315));
                                                            int i317 = ~i309;
                                                            int i318 = ~iNextInt3;
                                                            int i319 = ~((-1) - (((-1) - (i317 ^ i318)) & ((-1) - (i317 & i318))));
                                                            int i320 = iNextInt3 ^ (-463349171);
                                                            int i321 = iNextInt3 & (-463349171);
                                                            int i3222 = ~((i320 + i321) - (i320 & i321));
                                                            int i323 = i319 ^ i3222;
                                                            int i324 = (-1) - (((-1) - i3222) | ((-1) - i319));
                                                            int i325 = i316 + (((i323 + i324) - (i323 & i324)) * (-672));
                                                            int i326 = ~((463349170 + i318) - (463349170 & i318));
                                                            int i327 = ~((463349170 & i309) | (463349170 ^ i309));
                                                            int i328 = i326 ^ i327;
                                                            int i329 = (-1) - (((-1) - i326) | ((-1) - i327));
                                                            int i330 = -(-(((i329 + i328) - (i329 & i328)) * 672));
                                                            Object[] objArr28 = new Object[1];
                                                            p(s9, i308, b4, offsetBefore, ((i325 | i330) << 1) - (i325 ^ i330), objArr28);
                                                            Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                            int length2 = objArr3.length;
                                                            int i331 = 0;
                                                            while (i331 < 2) {
                                                                Object obj2 = objArr3[i331];
                                                                try {
                                                                    int i332 = -TextUtils.getCapsMode("", 0, 0);
                                                                    int i333 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                    int i334 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                                    int i335 = -KeyEvent.normalizeMetaState(0);
                                                                    Object[] objArr29 = new Object[1];
                                                                    p((short) ((((i332 - 115) - ((-115) & i332)) << 1) - (i332 ^ (-115))), ((i333 - 94) - ((-94) | i333)) + ((i333 - 94) - (i333 & (-94))), (byte) ((((i334 + 18) - (18 & i334)) << 1) - (i334 ^ 18)), (i335 ^ 2070226999) + ((i335 & 2070226999) << 1), (-463349152) - (~(-(-TextUtils.lastIndexOf("", '0', 0, 0)))), objArr29);
                                                                    Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                                    int i336 = -TextUtils.indexOf("", "");
                                                                    int i337 = f18905f * (-2098938712);
                                                                    f18905f = i337;
                                                                    int i338 = i336 * 69;
                                                                    int i339 = ((-1) - (((-1) - i338) | ((-1) - (-7370)))) + ((-1) - (((-1) - i338) & ((-1) - (-7370))));
                                                                    int i340 = ~i336;
                                                                    int i341 = (i340 - 111) - ((-111) & i340);
                                                                    int i342 = ~i337;
                                                                    int i343 = ~((i341 ^ i342) | ((i341 + i342) - (i341 | i342)));
                                                                    int i344 = i336 ^ 110;
                                                                    int i345 = i336 & 110;
                                                                    int i346 = ~((i344 + i345) - (i344 & i345));
                                                                    int i347 = (-1) - (((-1) - (i343 ^ i346)) & ((-1) - ((-1) - (((-1) - i343) | ((-1) - i346)))));
                                                                    int i348 = i337 ^ 110;
                                                                    int i349 = (i337 + 110) - (i337 | 110);
                                                                    int i350 = ((-1) - (((-1) - i347) & ((-1) - (~((i348 + i349) - (i348 & i349)))))) * (-68);
                                                                    int i351 = (i339 ^ i350) + (((i350 + i339) - (i350 | i339)) << 1);
                                                                    int i352 = ~i336;
                                                                    int i353 = (-1) - (((-1) - ((-1) - (((-1) - i352) | ((-1) - i342)))) & ((-1) - (i352 ^ i342)));
                                                                    int i354 = (i351 - (~(-(-((~((-1) - (((-1) - ((i353 + 110) - (i353 | 110))) & ((-1) - (i353 ^ 110))))) * (-68)))))) - 1;
                                                                    int i355 = -(-(((~(((-111) & i342) | ((-111) ^ i342))) | i340) * 68));
                                                                    int i356 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                                    int i357 = -(-TextUtils.getCapsMode("", 0, 0));
                                                                    int i358 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                                    int i359 = (i358 ^ 2070226996) + (((i358 + 2070226996) - (i358 | 2070226996)) << 1);
                                                                    int i360 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                    int i361 = (i360 ^ (-463349118)) + ((i360 & (-463349118)) << 1);
                                                                    Object[] objArr30 = new Object[1];
                                                                    p((short) ((i354 & i355) + ((-1) - (((-1) - i355) & ((-1) - i354)))), ((i356 | (-95)) << 1) - (i356 ^ (-95)), (byte) ((i357 ^ 10) + (((i357 + 10) - (i357 | 10)) << 1)), i359, i361, objArr30);
                                                                    if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                                        Object[] objArr31 = {new int[1], new int[]{i22}, null, new int[]{(~((-1) - (((-1) - i22) | ((-1) - 1)))) & ((-1) - (((-1) - i22) & ((-1) - 1)))}};
                                                                        int i362 = ~((-1) - (((-1) - (-908719574)) & ((-1) - i43)));
                                                                        int i363 = (-1069547488) | i362;
                                                                        int i364 = ~(908719573 | i22);
                                                                        int i365 = ((((i363 + i364) - (i363 & i364)) * (-338)) - 51650059) + (((-1) - (((-1) - i362) & ((-1) - (~(((-160827915) + i22) - ((-160827915) & i22)))))) * ExifDirectoryBase.TAG_EXTRA_SAMPLES);
                                                                        int i366 = (((i365 + 16) - (16 & i365)) << 1) - (i365 ^ 16);
                                                                        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                                                        int i367 = ((i366 * 477) - (~(i32 * (-475)))) - 1;
                                                                        int i368 = ~((-1) - (((-1) - (~i366)) & ((-1) - i32)));
                                                                        int i369 = ~i32;
                                                                        int i370 = i369 ^ i366;
                                                                        int i371 = i369 & i366;
                                                                        int i372 = ~((-1) - (((-1) - ((i370 + i371) - (i370 & i371))) & ((-1) - iElapsedRealtime2)));
                                                                        int i373 = (i367 - (~(((-1) - (((-1) - (i368 & i372)) & ((-1) - (i368 ^ i372)))) * (-476)))) - 1;
                                                                        int i374 = (~i32) | i366;
                                                                        int i375 = -(-((~((i374 & iElapsedRealtime2) | (i374 ^ iElapsedRealtime2))) * 952));
                                                                        int i376 = (((((-1) - (((-1) - i373) & ((-1) - i375))) << 1) - (i373 ^ i375)) - (~(-(-((~((-1) - (((-1) - i366) & ((-1) - ((-1) - (((-1) - (~iElapsedRealtime2)) & ((-1) - i369))))))) * 476))))) - 1;
                                                                        int i377 = i376 << 13;
                                                                        int i378 = (~i377) & i376;
                                                                        int i379 = ~i376;
                                                                        int i380 = (-1) - (((-1) - ((i377 + i379) - (i377 | i379))) & ((-1) - i378));
                                                                        int i381 = i380 >>> 17;
                                                                        int i382 = (-1) - (((-1) - (i380 | i381)) | ((-1) - (~((-1) - (((-1) - i380) | ((-1) - i381))))));
                                                                        ((int[]) objArr31[0])[0] = i382 ^ (i382 << 5);
                                                                        return objArr31;
                                                                    }
                                                                    int i383 = i331 + 44;
                                                                    i331 = (((-43) | i383) << 1) - (i383 ^ (-43));
                                                                } catch (Throwable th) {
                                                                    Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            i218++;
                                                            i4 = 1;
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
                    int[] iArr = new int[1];
                    Object[] objArr32 = {iArr, new int[]{i22}, null, new int[]{i22}};
                    int i384 = (-464127244) + ((~((-4526163) | i22)) * (-301)) + (((~((-1) - (((-1) - 390542167) & ((-1) - i22)))) | (~((-1) - (((-1) - (~i22)) & ((-1) - 1068690189))))) * (-301));
                    int i385 = ~((i22 - 1068690190) - (i22 & (-1068690190)));
                    int i386 = i384 + (((i385 + 390542167) - (i385 & 390542167)) * 301);
                    int i387 = (((i32 + i386) - (i32 & i386)) << 1) - (i32 ^ i386);
                    int i388 = i387 ^ (i387 << 13);
                    int i389 = i388 >>> 17;
                    int i390 = ~i389;
                    int i391 = (i390 + i388) - (i390 | i388);
                    int i392 = ~i388;
                    int i393 = ((i392 + i389) - (i392 | i389)) | i391;
                    int i394 = i393 << 5;
                    int i395 = ~i394;
                    iArr[0] = (-1) - (((-1) - ((~i393) & i394)) & ((-1) - ((i395 + i393) - (i395 | i393))));
                    return objArr32;
                }

                static void init$0() {
                    $$a = new byte[]{37, 121, MessagePack.Code.MAP32, 74};
                    $$b = Mp4VideoDirectory.TAG_COMPRESSION_TYPE;
                }

                private static void p(short s2, int i22, byte b2, int i32, int i4, Object[] objArr) throws Throwable {
                    int i5;
                    int i6 = 2 % 2;
                    j jVar = new j();
                    StringBuilder sb = new StringBuilder();
                    try {
                        Object[] objArr2 = {Integer.valueOf(i22), Integer.valueOf(f18908i)};
                        Object objA = o.d.d.a(-727631768);
                        long j2 = 0;
                        if (objA == null) {
                            byte b3 = (byte) 0;
                            objA = o.d.d.a(238 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (44532 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 12, 35969549, false, $$c(b3, (byte) (17 | b3), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        int i7 = iIntValue == -1 ? 1 : 0;
                        if (i7 != 0) {
                            int i8 = $10 + 51;
                            $11 = i8 % 128;
                            if (i8 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            byte[] bArr = f18914o;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                int i9 = 0;
                                while (i9 < length) {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                    Object objA2 = o.d.d.a(-1239398195);
                                    if (objA2 == null) {
                                        byte b4 = (byte) 0;
                                        objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 11 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), 1621469864, false, $$c(b4, (byte) ((b4 + Ascii.DC2) - (b4 & Ascii.DC2)), b4), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                                    i9++;
                                    j2 = 0;
                                }
                                bArr = bArr2;
                            }
                            if (bArr != null) {
                                int i10 = $10 + 21;
                                $11 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    byte[] bArr3 = f18914o;
                                    Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(f18907h)};
                                    Object objA3 = o.d.d.a(-727631768);
                                    if (objA3 == null) {
                                        byte b5 = (byte) 0;
                                        objA3 = o.d.d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 238, (char) (KeyEvent.getDeadChar(0, 0) + 44531), Drawable.resolveOpacity(0, 0) + 11, 35969549, false, $$c(b5, (byte) (17 | b5), b5), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    i5 = ((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) >>> ((int) (((long) f18908i) * (-7649639543924978291L)));
                                } else {
                                    byte[] bArr4 = f18914o;
                                    Object[] objArr5 = {Integer.valueOf(i4), Integer.valueOf(f18907h)};
                                    Object objA4 = o.d.d.a(-727631768);
                                    if (objA4 == null) {
                                        byte b6 = (byte) 0;
                                        objA4 = o.d.d.a(238 - Color.red(0), (char) (44531 - (ViewConfiguration.getLongPressTimeout() >> 16)), Color.argb(0, 0, 0, 0) + 11, 35969549, false, $$c(b6, (byte) ((b6 + 17) - (17 & b6)), b6), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    i5 = ((byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f18908i) ^ (-7649639543924978291L)));
                                }
                                iIntValue = (byte) i5;
                            } else {
                                iIntValue = (short) (((short) (((long) f18911l[i4 + ((int) (((long) f18907h) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f18908i) ^ (-7649639543924978291L))));
                            }
                        }
                        if (iIntValue > 0) {
                            int i11 = $11 + 67;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            jVar.f19936d = ((i4 + iIntValue) - 2) + ((int) (((long) f18907h) ^ (-7649639543924978291L))) + i7;
                            Object[] objArr6 = {jVar, Integer.valueOf(i32), Integer.valueOf(f18909j), sb};
                            Object objA5 = o.d.d.a(1819197256);
                            if (objA5 == null) {
                                objA5 = o.d.d.a(Color.alpha(0), (char) (5358 - Color.alpha(0)), 11 - (ViewConfiguration.getTapTimeout() >> 16), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                            jVar.f19935c = jVar.f19937e;
                            byte[] bArr5 = f18914o;
                            if (bArr5 != null) {
                                int length2 = bArr5.length;
                                byte[] bArr6 = new byte[length2];
                                for (int i13 = 0; i13 < length2; i13++) {
                                    bArr6[i13] = (byte) (((long) bArr5[i13]) ^ (-7649639543924978291L));
                                }
                                int i14 = $11 + 1;
                                $10 = i14 % 128;
                                int i15 = i14 % 2;
                                bArr5 = bArr6;
                            }
                            boolean z2 = bArr5 != null;
                            jVar.f19934b = 1;
                            while (jVar.f19934b < iIntValue) {
                                if (z2) {
                                    byte[] bArr7 = f18914o;
                                    jVar.f19936d = jVar.f19936d - 1;
                                    jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr7[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                                    int i16 = $10 + 77;
                                    $11 = i16 % 128;
                                    int i17 = i16 % 2;
                                } else {
                                    short[] sArr = f18911l;
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

                private static void q(int[] iArr, int i22, Object[] objArr) throws Throwable {
                    int length;
                    int[] iArr2;
                    int i32;
                    int i4 = 2 % 2;
                    l lVar = new l();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr3 = f18910k;
                    int i5 = 989264422;
                    int i6 = 0;
                    if (iArr3 != null) {
                        int i7 = $11 + 105;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            length = iArr3.length;
                            iArr2 = new int[length];
                            i32 = 1;
                        } else {
                            length = iArr3.length;
                            iArr2 = new int[length];
                            i32 = 0;
                        }
                        while (i32 < length) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(iArr3[i32])};
                                Object objA = o.d.d.a(i5);
                                if (objA == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objA = o.d.d.a(675 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                iArr2[i32] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                                i32++;
                                i5 = 989264422;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        iArr3 = iArr2;
                    }
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = f18910k;
                    if (iArr5 != null) {
                        int i8 = $11 + 123;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i10 = 0;
                        while (i10 < length3) {
                            int i11 = $11 + 31;
                            $10 = i11 % 128;
                            if (i11 % 2 != 0) {
                                Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                                Object objA2 = o.d.d.a(989264422);
                                if (objA2 == null) {
                                    byte b4 = (byte) i6;
                                    byte b5 = b4;
                                    objA2 = o.d.d.a(675 - TextUtils.getOffsetAfter("", i6), (char) Drawable.resolveOpacity(i6, i6), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                            } else {
                                Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                                Object objA3 = o.d.d.a(989264422);
                                if (objA3 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objA3 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 674, (char) (ViewConfiguration.getScrollBarSize() >> 8), 12 - (Process.myTid() >> 22), -328001469, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                                }
                                iArr6[i10] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                                i10++;
                            }
                            i6 = 0;
                        }
                        iArr5 = iArr6;
                    }
                    System.arraycopy(iArr5, i6, iArr4, i6, length2);
                    lVar.f19941d = i6;
                    while (lVar.f19941d < iArr.length) {
                        cArr[i6] = (char) (iArr[lVar.f19941d] >> 16);
                        cArr[1] = (char) iArr[lVar.f19941d];
                        cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                        cArr[3] = (char) iArr[lVar.f19941d + 1];
                        lVar.f19942e = (cArr[0] << 16) + cArr[1];
                        lVar.f19940a = (cArr[2] << 16) + cArr[3];
                        l.a(iArr4);
                        int i12 = 0;
                        for (int i13 = 16; i12 < i13; i13 = 16) {
                            lVar.f19942e ^= iArr4[i12];
                            Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                            Object objA4 = o.d.d.a(2098218801);
                            if (objA4 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 + 2);
                                objA4 = o.d.d.a(View.MeasureSpec.getMode(0) + 301, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 52696), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, -1416256172, false, $$c(b8, b9, (byte) (b9 - 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                            lVar.f19942e = lVar.f19940a;
                            lVar.f19940a = iIntValue;
                            i12++;
                        }
                        int i14 = lVar.f19942e;
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = i14;
                        lVar.f19940a ^= iArr4[16];
                        lVar.f19942e ^= iArr4[17];
                        int i15 = lVar.f19942e;
                        int i16 = lVar.f19940a;
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
                            int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 228;
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 51005);
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 9;
                            byte length4 = (byte) $$a.length;
                            objA5 = o.d.d.a(i17, cLastIndexOf, touchSlop, -330018025, false, $$c((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA5).invoke(null, objArr6);
                        i6 = 0;
                    }
                    objArr[0] = new String(cArr2, 0, i22);
                }

                @Override // fr.antelop.sdk.util.OperationCallback
                public void onError(AntelopError antelopError) {
                    int i22 = 2 % 2;
                    int i32 = f18912m + 23;
                    f18913n = i32 % 128;
                    int i4 = i32 % 2;
                    antelopCallback.onError(antelopError);
                    int i5 = f18913n + 27;
                    f18912m = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 56 / 0;
                    }
                }

                @Override // fr.antelop.sdk.util.OperationCallback
                public /* bridge */ /* synthetic */ void onSuccess(Void r4) {
                    int i22 = 2 % 2;
                    int i32 = f18912m + 13;
                    f18913n = i32 % 128;
                    int i4 = i32 % 2;
                    onSuccess2(r4);
                    if (i4 != 0) {
                        throw null;
                    }
                }

                /* JADX INFO: renamed from: onSuccess */
                public void onSuccess2(Void r5) {
                    int i22 = 2 % 2;
                    int i32 = f18913n + 39;
                    f18912m = i32 % 128;
                    if (i32 % 2 == 0) {
                        antelopCallback.onSuccess();
                        throw null;
                    }
                    antelopCallback.onSuccess();
                    int i4 = f18913n + 39;
                    f18912m = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                }
            };
            int i4 = f18897n + 117;
            f18894k = i4 % 128;
            int i5 = i4 % 2;
        }
        this.innerCard.d(context, anonymousClass1);
    }

    public final void delete(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18894k + 83;
        f18897n = i3 % 128;
        int i4 = i3 % 2;
        this.innerCard.d(context, operationCallback);
        int i5 = f18897n + 117;
        f18894k = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AccountInfo getAccountInfo() {
        int i2 = 2 % 2;
        int i3 = f18897n + 23;
        f18894k = i3 % 128;
        int i4 = i3 % 2;
        if (this.innerCard.r() == null) {
            return null;
        }
        if (this.accountInfo == null) {
            this.accountInfo = new AccountInfo(this.innerCard.r());
        }
        AccountInfo accountInfo = this.accountInfo;
        int i5 = f18897n + 25;
        f18894k = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return accountInfo;
    }

    public final int getAvailablePaymentKeyNumber() {
        int i2 = 2 % 2;
        int i3 = f18897n + 33;
        f18894k = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerCard};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i4 = d.f24457i * (-1048349694);
            d.f24457i = i4;
            int iMyUid = Process.myUid();
            int i5 = d.f24456h * 1809045599;
            d.f24456h = i5;
            ((Integer) d.e(-1115375899, 1115375903, objArr, i4, iMyUid, i5, iUptimeMillis)).intValue();
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerCard};
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i6 = d.f24457i * (-1048349694);
        d.f24457i = i6;
        int iMyUid2 = Process.myUid();
        int i7 = d.f24456h * 1809045599;
        d.f24456h = i7;
        int iIntValue = ((Integer) d.e(-1115375899, 1115375903, objArr2, i6, iMyUid2, i7, iUptimeMillis2)).intValue();
        int i8 = f18897n + 69;
        f18894k = i8 % 128;
        if (i8 % 2 != 0) {
            return iIntValue;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        if (r5.innerCard.s() != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x001b, code lost:
    
        r2 = r5.innerCard.s().b();
        r1 = fr.antelop.sdk.card.Card.f18894k + 43;
        fr.antelop.sdk.card.Card.f18897n = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if ((r1 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        if (r5.innerCard.s() != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        return null;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getBin() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = fr.antelop.sdk.card.Card.f18897n
            int r1 = r0 + 49
            int r0 = r1 % 128
            fr.antelop.sdk.card.Card.f18894k = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 != 0) goto L31
            o.ep.d r0 = r5.innerCard
            o.ep.c r1 = r0.s()
            r0 = 32
            int r0 = r0 / 0
            if (r1 == 0) goto L3b
        L1b:
            o.ep.d r0 = r5.innerCard
            o.ep.c r0 = r0.s()
            java.lang.String r2 = r0.b()
            int r0 = fr.antelop.sdk.card.Card.f18894k
            int r1 = r0 + 43
            int r0 = r1 % 128
            fr.antelop.sdk.card.Card.f18897n = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L3a
            return r2
        L31:
            o.ep.d r0 = r5.innerCard
            o.ep.c r0 = r0.s()
            if (r0 == 0) goto L3b
            goto L1b
        L3a:
            throw r3
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.Card.getBin():java.lang.String");
    }

    public final CardInfo getCardInfo() {
        int i2 = 2 % 2;
        if (this.innerCard.s() != null) {
            if (this.cardInfo == null) {
                this.cardInfo = new CardInfo(this.innerCard.s());
            }
            return this.cardInfo;
        }
        int i3 = f18894k + 7;
        int i4 = i3 % 128;
        f18897n = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i4 + 57;
        f18894k = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final Short getCountryCodeNumber() {
        Short shM;
        int i2 = 2 % 2;
        int i3 = f18894k + 65;
        f18897n = i3 % 128;
        if (i3 % 2 != 0) {
            shM = this.innerCard.m();
            int i4 = 32 / 0;
        } else {
            shM = this.innerCard.m();
        }
        int i5 = f18897n + 91;
        f18894k = i5 % 128;
        int i6 = i5 % 2;
        return shM;
    }

    public final String getDefaultGroupId() {
        int i2 = 2 % 2;
        int i3 = f18897n + 121;
        f18894k = i3 % 128;
        int i4 = i3 % 2;
        d dVar = this.innerCard;
        if (i4 != 0) {
            return dVar.w();
        }
        dVar.w();
        throw null;
    }

    @Deprecated
    public final CardDisplay getDisplay() {
        int i2 = 2 % 2;
        if (this.cardDisplay == null) {
            int i3 = f18894k + 63;
            f18897n = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                this.innerCard.s();
                obj.hashCode();
                throw null;
            }
            if (this.innerCard.s() == null) {
                int i4 = f18897n + 105;
                f18894k = i4 % 128;
                if (i4 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            Object[] objArr = {this.innerCard.s()};
            int i5 = (-581252450) * c.f24440h;
            c.f24440h = i5;
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = c.f24441i * 151058815;
            c.f24441i = i7;
            int i8 = (-518773767) * c.f24439f;
            c.f24439f = i8;
            this.cardDisplay = (CardDisplay) c.c(i5, i6, i8, -465660215, objArr, 465660217, i7);
        }
        return this.cardDisplay;
    }

    @Deprecated
    public final Date getExpiryDate() {
        int i2 = 2 % 2;
        int i3 = f18897n + 23;
        f18894k = i3 % 128;
        int i4 = i3 % 2;
        if (this.innerCard.s() == null) {
            return null;
        }
        int i5 = f18894k + 89;
        f18897n = i5 % 128;
        if (i5 % 2 == 0) {
            return this.innerCard.s().c();
        }
        this.innerCard.s().c();
        throw null;
    }

    public final EmvApplicationGroup getGroup(String str) {
        int i2 = 2 % 2;
        int i3 = f18894k + 97;
        f18897n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerCard, str};
        int id = (int) Thread.currentThread().getId();
        int i5 = d.f24453e * 1386187316;
        d.f24453e = i5;
        int i6 = d.f24454f * 464282923;
        d.f24454f = i6;
        EmvApplicationGroup emvApplicationGroup = (EmvApplicationGroup) d.e(324309083, -324309080, objArr, i5, i6, (int) Runtime.getRuntime().totalMemory(), id);
        int i7 = f18897n + 71;
        f18894k = i7 % 128;
        int i8 = i7 % 2;
        return emvApplicationGroup;
    }

    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f18894k + 123;
        f18897n = i3 % 128;
        int i4 = i3 % 2;
        String strB = this.innerCard.b();
        int i5 = f18894k + 43;
        f18897n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return strB;
    }

    @Deprecated
    public final String getIssuerCardId() {
        int i2 = 2 % 2;
        if (this.innerCard.s() != null) {
            return this.innerCard.s().a();
        }
        Object obj = null;
        if (this.innerCard.r() != null) {
            int i3 = f18897n + 63;
            f18894k = i3 % 128;
            if (i3 % 2 != 0) {
                return this.innerCard.r().b();
            }
            this.innerCard.r().b();
            obj.hashCode();
            throw null;
        }
        if (!this.innerCard.C()) {
            int i4 = f18894k + 105;
            f18897n = i4 % 128;
            int i5 = i4 % 2;
            return this.innerCard.n();
        }
        int i6 = f18897n + 65;
        f18894k = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final String getIssuerData() {
        int i2 = 2 % 2;
        int i3 = f18897n + 117;
        f18894k = i3 % 128;
        int i4 = i3 % 2;
        String strO = this.innerCard.o();
        int i5 = f18894k + 45;
        f18897n = i5 % 128;
        if (i5 % 2 == 0) {
            return strO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLanguages() {
        int i2 = 2 % 2;
        int i3 = f18897n + 47;
        f18894k = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerCard.B();
            throw null;
        }
        String strB = this.innerCard.B();
        int i4 = f18894k + 77;
        f18897n = i4 % 128;
        int i5 = i4 % 2;
        return strB;
    }

    @Deprecated
    public final String getLastDigits() {
        int i2 = 2 % 2;
        int i3 = f18894k + 91;
        f18897n = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.innerCard.s();
            obj.hashCode();
            throw null;
        }
        if (this.innerCard.s() == null) {
            int i4 = f18894k + 57;
            f18897n = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        Object[] objArr = {this.innerCard.s()};
        int i6 = 574268897 * c.f24438e;
        c.f24438e = i6;
        int id = (int) Thread.currentThread().getId();
        int i7 = c.f24436c * 1169734117;
        c.f24436c = i7;
        int i8 = (-2104816085) * c.f24434a;
        c.f24434a = i8;
        return (String) c.c(i6, id, i8, 1241915024, objArr, -1241915024, i7);
    }

    public final String getNextTransactionGroupId() {
        int i2 = 2 % 2;
        int i3 = f18897n + 83;
        f18894k = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerCard};
        int id = (int) Thread.currentThread().getId();
        int iMyUid = Process.myUid();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = d.f24464p * 734577306;
        d.f24464p = i5;
        String str = (String) d.e(-198342416, 198342424, objArr, iMyUid, iFreeMemory, i5, id);
        int i6 = f18897n + 23;
        f18894k = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
        return str;
    }

    public final CardStatus getStatus() {
        int i2 = 2 % 2;
        int i3 = f18894k + 61;
        f18897n = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerCard};
            int i4 = d.f24461m * (-222457364);
            d.f24461m = i4;
            int i5 = d.f24462n * 325900588;
            d.f24462n = i5;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i6 = d.f24460l * 323941697;
            d.f24460l = i6;
            return (CardStatus) d.e(1555433584, -1555433578, objArr, i5, iElapsedRealtime, i6, i4);
        }
        Object[] objArr2 = {this.innerCard};
        int i7 = d.f24461m * (-222457364);
        d.f24461m = i7;
        int i8 = d.f24462n * 325900588;
        d.f24462n = i8;
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int i9 = d.f24460l * 323941697;
        d.f24460l = i9;
        int i10 = 33 / 0;
        return (CardStatus) d.e(1555433584, -1555433578, objArr2, i8, iElapsedRealtime2, i9, i7);
    }

    public final TermsAndConditions getTermsAndConditions(Context context) {
        int i2 = 2 % 2;
        int i3 = f18894k + 33;
        f18897n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerCard};
        int i5 = (int) Runtime.getRuntime().totalMemory();
        int i6 = d.f24451c * (-406850263);
        d.f24451c = i6;
        if (((o.dx.f) d.e(-268701458, 268701459, objArr, i6, new Random().nextInt(559253932), new Random().nextInt(), i5)) == null) {
            int i7 = f18897n + 49;
            f18894k = i7 % 128;
            int i8 = i7 % 2;
            return null;
        }
        Object[] objArr2 = {this.innerCard};
        int i9 = (int) Runtime.getRuntime().totalMemory();
        int i10 = d.f24451c * (-406850263);
        d.f24451c = i10;
        URI uriE = ((o.dx.f) d.e(-268701458, 268701459, objArr2, i10, new Random().nextInt(559253932), new Random().nextInt(), i9)).e(context);
        if (uriE != null) {
            return new TermsAndConditions(this.innerCard.k().b().e(), uriE, TermsAndConditions.FileType.extractFromExtensionFile(this.innerCard.k().b().a()), this.innerCard);
        }
        int i11 = f18894k + 123;
        f18897n = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    public final Map<String, EmvApplicationGroup> groups() {
        int i2 = 2 % 2;
        int i3 = f18894k + 87;
        f18897n = i3 % 128;
        int i4 = i3 % 2;
        d dVar = this.innerCard;
        if (i4 == 0) {
            return dVar.v();
        }
        dVar.v();
        throw null;
    }

    public final boolean isProvisioned() {
        int i2 = 2 % 2;
        int i3 = f18897n + 93;
        f18894k = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = this.innerCard.C();
        int i5 = f18897n + 93;
        f18894k = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    public final void resetNextTransactionGroup() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18894k + 21;
        f18897n = i3 % 128;
        int i4 = i3 % 2;
        this.innerCard.x();
        int i5 = f18897n + 45;
        f18894k = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setDefaultGroup(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18897n + 103;
        f18894k = i3 % 128;
        int i4 = i3 % 2;
        this.innerCard.d(str);
        int i5 = f18894k + 61;
        f18897n = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setNextTransactionGroup(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18894k + 81;
        f18897n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerCard, str};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iNextInt = new Random().nextInt(447334669);
        int i5 = d.f24450b * (-374828056);
        d.f24450b = i5;
        d.e(1214821643, -1214821641, objArr, iNextInt, i5, Process.myUid(), iUptimeMillis);
        int i6 = f18894k + 113;
        f18897n = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
    }

    public final String toString() {
        String bin;
        Object expiryDate;
        String issuerData;
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder("Card{id='").append(getId()).append("', bin='");
        Object status = "";
        if (getBin() == null) {
            bin = "";
        } else {
            bin = getBin();
            int i3 = f18897n + 93;
            f18894k = i3 % 128;
            int i4 = i3 % 2;
        }
        StringBuilder sbAppend2 = sbAppend.append(bin).append("', expiryDate=");
        if (getExpiryDate() == null) {
            int i5 = f18894k + 31;
            f18897n = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            expiryDate = "";
        } else {
            expiryDate = getExpiryDate();
            int i7 = f18894k + 91;
            f18897n = i7 % 128;
            int i8 = i7 % 2;
        }
        StringBuilder sbAppend3 = sbAppend2.append(expiryDate).append(", lastDigits='").append(getLastDigits() == null ? "" : getLastDigits()).append("', issuerData='");
        if (getIssuerData() == null) {
            issuerData = "";
        } else {
            issuerData = getIssuerData();
            int i9 = f18894k + 77;
            f18897n = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 / 2;
            }
        }
        StringBuilder sbAppend4 = sbAppend3.append(issuerData).append("', issuerCardId='").append(getIssuerCardId() == null ? "" : getIssuerCardId()).append("', languages=").append(getLanguages() == null ? "" : getLanguages()).append(", countryCodeNumber=").append(getCountryCodeNumber() == null ? "" : getCountryCodeNumber()).append(", status=");
        if (getStatus() == null) {
            int i11 = f18894k + 107;
            f18897n = i11 % 128;
            if (i11 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            status = getStatus();
        }
        return sbAppend4.append(status).append(", availablePaymentKeyNumber=").append(getAvailablePaymentKeyNumber()).append(", cardDisplay").append(getDisplay()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
