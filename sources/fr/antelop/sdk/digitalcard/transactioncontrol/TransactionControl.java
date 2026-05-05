package fr.antelop.sdk.digitalcard.transactioncontrol;

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
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Random;
import o.ex.a;
import o.ex.b;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class TransactionControl<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f19337a = 0;

    /* JADX INFO: renamed from: b */
    public static int f19338b = 0;

    /* JADX INFO: renamed from: c */
    public static int f19339c = 0;

    /* JADX INFO: renamed from: d */
    public static int f19340d = 0;

    /* JADX INFO: renamed from: e */
    public static int f19341e = 0;

    /* JADX INFO: renamed from: f */
    public static int f19342f = 0;

    /* JADX INFO: renamed from: g */
    private static long f19343g = 0;

    /* JADX INFO: renamed from: h */
    public static int f19344h = 0;

    /* JADX INFO: renamed from: i */
    public static int f19345i = 0;

    /* JADX INFO: renamed from: j */
    public static int f19346j = 0;

    /* JADX INFO: renamed from: k */
    private static int f19347k = 0;

    /* JADX INFO: renamed from: l */
    private static int f19348l = 0;

    /* JADX INFO: renamed from: m */
    private static int f19349m = 0;

    /* JADX INFO: renamed from: n */
    private static int f19350n = 0;

    /* JADX INFO: renamed from: o */
    private static char f19351o = 0;

    /* JADX INFO: renamed from: p */
    private static byte[] f19352p = null;

    /* JADX INFO: renamed from: q */
    public static int f19353q = 0;

    /* JADX INFO: renamed from: r */
    private static int f19354r = 0;

    /* JADX INFO: renamed from: s */
    private static short[] f19355s = null;

    /* JADX INFO: renamed from: t */
    private static int f19356t = 0;

    /* JADX INFO: renamed from: u */
    public static int f19357u = 0;
    private final b<T> innerTransactionControl;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, byte r8, int r9) {
        /*
            int r0 = r7 * 2
            int r0 = 4 - r0
            int r8 = r8 + 65
            byte[] r7 = fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControl.$$a
            int r2 = r9 * 3
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2c
            r3 = r5
            r2 = r0
        L15:
            int r1 = -r0
            int r1 = r1 + r8
            int r0 = r2 + 1
            r8 = r1
        L1a:
            byte r1 = (byte) r8
            r6[r3] = r1
            if (r3 != r4) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L25:
            r1 = r7[r0]
            int r3 = r3 + 1
            r2 = r0
            r0 = r1
            goto L15
        L2c:
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControl.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f19357u = 892232599;
        f19353q = -781783032;
        f19346j = 1794415292;
        f19345i = 1394004772;
        f19344h = 830630755;
        f19342f = -1771794098;
        f19338b = 769884892;
        f19340d = -393199987;
        f19339c = -163409256;
        f19337a = -1109601132;
        f19341e = -1469124572;
        f19354r = 0;
        f19356t = 1;
        f19343g = -2611173746364573951L;
        f19350n = 1564493270;
        f19351o = (char) 17878;
        f19348l = -792017924;
        f19347k = 1150422412;
        f19349m = -559332928;
        f19352p = new byte[]{121, -104, 114, -82, -85, 51, 112, 113, 114, -99, 117, -94, -117, 124, -128, -108, 71, 112, 113, 114, -99, 117, -94, -117, 125, -88, 86, -115, -105, 113, MessagePack.Code.BIN8, -19, -77, MessagePack.Code.MAP16, MessagePack.Code.NEVER_USED, -12, -17, -118, MessagePack.Code.MAP16, MessagePack.Code.STR32, -77, MessagePack.Code.MAP16, MessagePack.Code.NEVER_USED, MessagePack.Code.FIXEXT1, Ascii.SI, -102, MessagePack.Code.BIN16, MessagePack.Code.FLOAT32, MessagePack.Code.EXT8, MessagePack.Code.FIXEXT4, MessagePack.Code.UINT32, MessagePack.Code.FIXEXT8, MessagePack.Code.STR32, MessagePack.Code.FLOAT32, MessagePack.Code.FALSE, -79, MessagePack.Code.STR32, MessagePack.Code.INT8, -68, MessagePack.Code.FLOAT32, MessagePack.Code.FALSE, -78, MessagePack.Code.ARRAY16, MessagePack.Code.BIN32, MessagePack.Code.FIXEXT8, -26, -121, MessagePack.Code.FLOAT64, 6, -114, MessagePack.Code.FALSE, MessagePack.Code.MAP32, -73, MessagePack.Code.FALSE, MessagePack.Code.BIN16, MessagePack.Code.FIXEXT16, -13, -98, MessagePack.Code.EXT32, MessagePack.Code.UINT32, MessagePack.Code.FLOAT64, MessagePack.Code.STR16, -78, MessagePack.Code.STR32, -104, -119, -68, 125, -121, -97, -113, -103, -125, MessagePack.Code.FIXARRAY_PREFIX, 101, -106, -121, 95, 73, 93, Ascii.DC2, Ascii.SUB, Ascii.RS, 6, 44, Ascii.US, 38, -4, Ascii.FF, 46, 3, 7, Ascii.RS, 0, 8, Ascii.US, 16, Utf8.REPLACEMENT_BYTE, 40, MessagePack.Code.EXT8, Ascii.US, 16, Ascii.US, 72, MessagePack.Code.EXT16, Ascii.CAN, Ascii.SYN, 10, 0, 47, 3, Ascii.SI, 88, MessagePack.Code.INT8, -10, 40, 10, 19, Ascii.FS, 36, 4, 16, 44, 76, -4, 38, Ascii.ETB, -12, MessagePack.Code.ARRAY32, -20, Ascii.US, -80, MessagePack.Code.MAP32, MessagePack.Code.INT16, Ascii.NAK, -71, MessagePack.Code.INT16, -115, -115, -115, -115, -115, -115, -115, -115};
    }

    public TransactionControl(b<T> bVar) {
        this.innerTransactionControl = bVar;
    }

    public static Object[] e(Context context, int i2, int i3) {
        int i4 = 1;
        if (context == null) {
            Object[] objArr = {new int[1], new int[]{i2}, null, new int[]{i2}};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i5 = ~iElapsedRealtime;
            int i6 = (-1581569811) + (((-1) - (((-1) - (~(((-445753813) + i5) - ((-445753813) & i5)))) & ((-1) - 143657408))) * 168) + ((~(((-143657409) + iElapsedRealtime) - ((-143657409) & iElapsedRealtime))) * 168) + (((~((iElapsedRealtime - 302096405) - (iElapsedRealtime & (-302096405)))) | ((-1) - (((-1) - (~((i5 - 232394210) - (i5 & (-232394210))))) & ((-1) - 88736801)))) * 168);
            int i7 = f19341e * (-2117881089);
            f19341e = i7;
            int i8 = (i6 * (-1529)) + (i3 * (-764));
            int i9 = ~i6;
            int i10 = ~i3;
            int i11 = (-1) - (((-1) - i9) & ((-1) - i10));
            int i12 = ~i7;
            int i13 = ~(((-1) - (((-1) - i11) | ((-1) - i12))) | (i11 ^ i12));
            int i14 = ~i6;
            int i15 = ~((i14 & i3) | (i14 ^ i3) | i7);
            int i16 = (-1) - (((-1) - ((i13 + i15) - (i13 | i15))) & ((-1) - (i13 ^ i15)));
            int i17 = ~i3;
            int i18 = (i17 ^ i6) | ((i17 + i6) - (i17 | i6));
            int i19 = ~((-1) - (((-1) - (i18 & i7)) & ((-1) - (i18 ^ i7))));
            int i20 = -(-(((i16 + i19) - (i16 & i19)) * 765));
            int i21 = (((-1) - (((-1) - i8) & ((-1) - i20))) << 1) - (i8 ^ i20);
            int i22 = ~((i17 + i9) - (i17 & i9));
            int i23 = ~((i9 ^ i12) | ((-1) - (((-1) - i9) | ((-1) - i12))));
            int i24 = ((-1) - (((-1) - (i22 & i23)) & ((-1) - (i22 ^ i23)))) * 1530;
            int i25 = (((i21 + i24) - (i21 & i24)) << 1) - (i24 ^ i21);
            int i26 = i9 ^ i7;
            int i27 = (-1) - (((-1) - i9) | ((-1) - i7));
            int i28 = ~((i26 + i27) - (i26 & i27));
            int i29 = ~i7;
            int i30 = ((-1) - (((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - i29) | ((-1) - i10)))) & ((-1) - (i10 ^ i29))))) & ((-1) - i6))))) & ((-1) - i28))) * 765;
            int i31 = (i25 ^ i30) + ((i30 & i25) << 1);
            int i32 = i31 << 13;
            int i33 = ~i32;
            int i34 = (i32 & (~i31)) | ((i33 + i31) - (i33 | i31));
            int i35 = i34 >>> 17;
            int i36 = (-1) - (((-1) - ((i34 + i35) - (i34 & i35))) | ((-1) - (~((i34 + i35) - (i34 | i35)))));
            int i37 = i36 << 5;
            ((int[]) objArr[0])[0] = (i36 | i37) & (~((i36 + i37) - (i36 | i37)));
            return objArr;
        }
        try {
            Object[] objArr2 = new Object[1];
            v((char) ((-TextUtils.lastIndexOf("", '0', 0, 0)) - 1), "䶧\ude79飠Ḳ", ViewConfiguration.getPressedStateDuration() >> 16, "勗걝\u1aec톄", "얯\ud834엷橏횻嫗鉑錤픾\u20c9쟋禲鉽౧뒽괱ጯ譕ᐹᓜࣸ⼡\u0e7c禶́鞀\u0c75㏰⧴ఀ仹끊㯲錕ṩ悴툱詔", objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
            char c2 = (char) ((((-1) - (((-1) - scrollBarSize) & ((-1) - 15481))) << 1) - (scrollBarSize ^ 15481));
            int i38 = -View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr4 = new Object[1];
            v(c2, "꼧沗礦㌼", (i38 & 644650927) + ((i38 + 644650927) - (i38 & 644650927)), "勗걝\u1aec톄", "慆죕蹋掇㐒ꈡʐ䚺욫扁쭄坌솚䌆❭諒䐵卂捓荠䋙베㔗벆赉ꦞ㝋㟃㝧钶㞄", objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int i39 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i40 = (((-1) - (((-1) - i39) & ((-1) - 1))) << 1) - (i39 ^ 1);
                Object[] objArr6 = new Object[1];
                v(deadChar, "䶧\ude79飠Ḳ", i40, "勗걝\u1aec톄", "얯\ud834엷橏횻嫗鉑錤픾\u20c9쟋禲鉽౧뒽괱ጯ譕ᐹᓜࣸ⼡\u0e7c禶́鞀\u0c75㏰⧴ఀ仹끊㯲錕ṩ悴툱詔", objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                int i41 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                short s2 = (short) ((i41 ^ (-2)) + (((-1) - (((-1) - i41) | ((-1) - (-2)))) << 1));
                char mirror = AndroidCharacter.getMirror('0');
                int i42 = ((mirror | (-18)) << 1) - (mirror ^ (-18));
                byte windowTouchSlop = (byte) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i43 = -TextUtils.lastIndexOf("", '0');
                int i44 = (((i43 + 1707389941) - (i43 & 1707389941)) << 1) - (i43 ^ 1707389941);
                int i45 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i46 = (((-1) - (((-1) - i45) & ((-1) - 1806119311))) << 1) - (i45 ^ 1806119311);
                Object[] objArr7 = new Object[1];
                w(s2, i42, windowTouchSlop, i44, i46, objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    Object[] objArr9 = new Object[1];
                    v((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "䶧\ude79飠Ḳ", ExpandableListView.getPackedPositionGroup(0L), "勗걝\u1aec톄", "얯\ud834엷橏횻嫗鉑錤픾\u20c9쟋禲鉽౧뒽괱ጯ譕ᐹᓜࣸ⼡\u0e7c禶́鞀\u0c75㏰⧴ఀ仹끊㯲錕ṩ悴툱詔", objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        w((short) ((-78) - (~ExpandableListView.getPackedPositionGroup(0L))), 22 - View.combineMeasuredStates(0, 0), (byte) (Process.myPid() >> 22), 1707389972 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1806119341 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int i47 = -ExpandableListView.getPackedPositionType(0L);
                        Object[] objArr11 = new Object[1];
                        v((char) (((i47 | 7720) << 1) - (i47 ^ 7720)), "懜\ud8d0⣣ञ", (-472330144) - (~(-View.combineMeasuredStates(0, 0))), "勗걝\u1aec톄", "缷䪞蕗䰜㕕ٖ\uf3ae蟡\uf734山㭾ᷲ嵲詁\ue118\uf5ab\ue100", objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                            int i48 = f19337a * (-1392404936);
                            f19337a = i48;
                            int i49 = (pressedStateDuration * (-947)) - 73073;
                            int i50 = ~pressedStateDuration;
                            int i51 = 76 ^ i48;
                            int i52 = 76 & i48;
                            int i53 = ~((i51 + i52) - (i51 & i52));
                            int i54 = -(-(((i50 ^ i53) | (i53 & i50)) * (-948)));
                            int i55 = (i49 & i54) + ((i49 + i54) - (i49 & i54));
                            int i56 = i50 ^ 76;
                            int i57 = (-1) - (((-1) - i50) | ((-1) - 76));
                            int i58 = (i56 + i57) - (i56 & i57);
                            int i59 = ~i48;
                            int i60 = i58 ^ i59;
                            int i61 = i58 & i59;
                            int i62 = i55 + ((~((i61 + i60) - (i61 & i60))) * (-948));
                            int i63 = pressedStateDuration ^ 76;
                            int i64 = (pressedStateDuration + 76) - (pressedStateDuration | 76);
                            int i65 = -(-(((i63 + i64) - (i63 & i64)) * 948));
                            short s3 = (short) ((i62 ^ i65) + (((i62 + i65) - (i62 | i65)) << 1));
                            int i66 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i67 = i2 ^ 21;
                            int i68 = (i2 + 21) - (21 | i2);
                            int i69 = (i66 * (-419)) + 8841 + ((~((i67 + i68) - (i67 & i68))) * 420);
                            int i70 = ~i66;
                            int i71 = i69 + (((-1) - (((-1) - (i70 ^ 21)) & ((-1) - ((-1) - (((-1) - i70) | ((-1) - 21)))))) * (-420));
                            int i72 = ~((-1) - (((-1) - i70) & ((-1) - (-22))));
                            int i73 = ~i2;
                            int i74 = ~((i73 ^ 21) | (21 & i73));
                            int i75 = (i71 - (~(-(-(((i72 ^ i74) | ((i72 + i74) - (i72 | i74))) * 420))))) - 1;
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                            int i76 = f19339c * (-1957443300);
                            f19339c = i76;
                            int i77 = iLastIndexOf * 370;
                            int i78 = (((i77 + 370) - (370 & i77)) << 1) - (i77 ^ 370);
                            int i79 = iLastIndexOf ^ 1;
                            int i80 = 1 & iLastIndexOf;
                            int i81 = (i79 + i80) - (i79 & i80);
                            int i82 = ~i76;
                            int i83 = i81 ^ i82;
                            int i84 = i81 & i82;
                            int i85 = (i78 - (~(((i83 + i84) - (i83 & i84)) * (-369)))) - 1;
                            int i86 = ~iLastIndexOf;
                            int i87 = ~((-1) - (((-1) - (i86 ^ i82)) & ((-1) - ((i82 + i86) - (i82 | i86)))));
                            int i88 = -(-(((i87 ^ 1) | (i87 & 1)) * (-369)));
                            int i89 = (i85 ^ i88) + ((i88 & i85) << 1);
                            int i90 = ~(((-2) ^ iLastIndexOf) | ((-2) & iLastIndexOf));
                            int i91 = ~((-1) - (((-1) - iLastIndexOf) & ((-1) - i76)));
                            int i92 = (-1) - (((-1) - (i91 & i90)) & ((-1) - (i90 ^ i91)));
                            int i93 = ~i76;
                            int i94 = i86 ^ i93;
                            int i95 = (-1) - (((-1) - i93) | ((-1) - i86));
                            int i96 = (i95 + i94) - (i95 & i94);
                            int i97 = i96 ^ 1;
                            int i98 = i96 & 1;
                            int i99 = ~((i98 + i97) - (i98 & i97));
                            int i100 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i92) | ((-1) - i99)))) & ((-1) - (i92 ^ i99)))) * 369));
                            int packedPositionGroup = 1707389972 - ExpandableListView.getPackedPositionGroup(0L);
                            int i101 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                            int i102 = (i101 ^ 1806119341) + (((i101 + 1806119341) - (i101 | 1806119341)) << 1);
                            Object[] objArr12 = new Object[1];
                            w(s3, i75, (byte) ((i89 ^ i100) + ((i89 & i100) << 1)), packedPositionGroup, i102, objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            int i103 = -KeyEvent.getDeadChar(0, 0);
                            Object[] objArr13 = new Object[1];
                            v((char) (((i103 + 22208) - (22208 | i103)) + ((-1) - (((-1) - i103) & ((-1) - 22208)))), "狼鶴쀹\uf056", ViewConfiguration.getMaximumFlingVelocity() >> 16, "勗걝\u1aec톄", "䯻ꬽ㑏렲찖睞죖헥狗Ω㫟\udb90룠됽", objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                int i104 = -(Process.myTid() >> 22);
                                short s4 = (short) ((i104 ^ (-73)) + (((i104 - 73) - (i104 | (-73))) << 1));
                                int i105 = 31 - (~(-(-(ViewConfiguration.getPressedStateDuration() >> 16))));
                                int threadPriority = Process.getThreadPriority(0);
                                byte b2 = (byte) (((threadPriority ^ 20) + (((threadPriority + 20) - (threadPriority | 20)) << 1)) >> 6);
                                int i106 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i107 = ((i106 | 1707389972) << 1) - (i106 ^ 1707389972);
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                                int i108 = (int) Runtime.getRuntime().totalMemory();
                                int i109 = ~(((-1806119365) ^ iIndexOf) | (((-1806119365) + iIndexOf) - ((-1806119365) | iIndexOf)));
                                int i110 = ~i108;
                                int i111 = (((iIndexOf * (-1939)) + 1395245676) - (~(((-1) - (((-1) - (~((-1) - (((-1) - i110) & ((-1) - 1806119364))))) & ((-1) - i109))) * (-970)))) - 1;
                                int i112 = ~iIndexOf;
                                int i113 = (~((i112 ^ 1806119364) | ((i112 + 1806119364) - (i112 | 1806119364)))) * 1940;
                                int i114 = ((i111 | i113) << 1) - (i113 ^ i111);
                                int i115 = ~((-1) - (((-1) - i112) & ((-1) - (-1806119365))));
                                int i116 = ~(((-1) - (((-1) - i110) | ((-1) - 1806119364))) | (i110 ^ 1806119364));
                                Object[] objArr15 = new Object[1];
                                w(s4, i105, b2, i107, i114 + (((i116 + i115) - (i116 & i115)) * 970), objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int i117 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int i118 = f19340d * 1538350482;
                                f19340d = i118;
                                int i119 = (i117 * 471) - 6123;
                                int i120 = i117 ^ (-13);
                                int i121 = (i117 - 13) - ((-13) | i117);
                                int i122 = ((i120 + i121) - (i120 & i121)) * (-470);
                                int i123 = (((-1) - (((-1) - i119) & ((-1) - i122))) << 1) - (i119 ^ i122);
                                int i124 = ~i117;
                                int i125 = ~((i124 & 12) | (i124 ^ 12));
                                int i126 = 12 ^ i118;
                                int i127 = (-1) - (((-1) - 12) | ((-1) - i118));
                                int i128 = ~((i126 + i127) - (i126 & i127));
                                int i129 = i125 ^ i128;
                                int i130 = (-1) - (((-1) - i125) | ((-1) - i128));
                                int i131 = (i129 + i130) - (i129 & i130);
                                int i132 = ~i118;
                                int i133 = (-1) - (((-1) - (i132 ^ i117)) & ((-1) - ((-1) - (((-1) - i132) | ((-1) - i117)))));
                                int i134 = ~((-1) - (((-1) - (i133 ^ (-13))) & ((-1) - ((i133 - 13) - (i133 | (-13))))));
                                int i135 = i131 ^ i134;
                                int i136 = i131 & i134;
                                int i137 = -(-(((i135 + i136) - (i135 & i136)) * (-470)));
                                int i138 = (i123 ^ i137) + (((i137 + i123) - (i137 | i123)) << 1);
                                int i139 = 12 ^ i117;
                                int i140 = (12 + i117) - (12 | i117);
                                int i141 = (i139 + i140) - (i139 & i140);
                                int i142 = i141 ^ i118;
                                int i143 = (-1) - (((-1) - i118) | ((-1) - i141));
                                int i144 = ~((i143 + i142) - (i143 & i142));
                                int i145 = ~(((-1) - (((-1) - i117) & ((-1) - i132))) | (-13));
                                int i146 = ((i145 & i144) | (i144 ^ i145)) * 470;
                                short s5 = (short) (((i138 | i146) << 1) - (i146 ^ i138));
                                int i147 = -(-TextUtils.lastIndexOf("", '0'));
                                int i148 = ((i147 | 14) << 1) - (i147 ^ 14);
                                int i149 = -AndroidCharacter.getMirror('0');
                                byte b3 = (byte) (((48 | i149) << 1) - (i149 ^ 48));
                                int i150 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i151 = f19338b * 1691223845;
                                f19338b = i151;
                                int i152 = i150 * 829;
                                int i153 = ((i152 | (-1912916747)) << 1) - (i152 ^ (-1912916747));
                                int i154 = ~i150;
                                int i155 = i154 ^ (-1707389978);
                                int i156 = (i154 - 1707389978) - (i154 | (-1707389978));
                                int i157 = ~((i155 + i156) - (i155 & i156));
                                int i158 = ~i151;
                                int i159 = ~(((-1) - (((-1) - (i158 ^ i150)) & ((-1) - (i158 & i150)))) | 1707389977);
                                int i160 = ((i157 ^ i159) | ((i157 + i159) - (i157 | i159))) * (-828);
                                int i161 = (((i153 + i160) - (i153 & i160)) << 1) - (i160 ^ i153);
                                int i162 = i150 ^ 1707389977;
                                int i163 = i150 & 1707389977;
                                int i164 = (i162 + i163) - (i162 & i163);
                                int i165 = ~i151;
                                int i166 = ((-1) - (((-1) - (i165 & i164)) & ((-1) - (i164 ^ i165)))) * (-828);
                                int i167 = (((-1) - (((-1) - i161) & ((-1) - i166))) << 1) - (i166 ^ i161);
                                int i168 = (~((i150 + 1707389977) - (i150 & 1707389977))) * 828;
                                Object[] objArr16 = new Object[1];
                                w(s5, i148, b3, (i167 ^ i168) + ((i168 & i167) << 1), 1806119394 - (~(ViewConfiguration.getFadingEdgeLength() >> 16)), objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int i169 = -ImageFormat.getBitsPerPixel(0);
                                Object[] objArr17 = new Object[1];
                                v((char) ((((-1) - (((-1) - i169) & ((-1) - 34647))) << 1) - (i169 ^ 34647)), "몾ˎ塧袇", ViewConfiguration.getTapTimeout() >> 16, "勗걝\u1aec톄", "灑\uebea푘錑蓉⡟몢ạ䲯夡⣿猾㪷㣟坋촆⽝崫韉\uf584鿥佂測簋\udafa\ue22c\ud7fe酫ꈔ⭘", objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                v((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u09d9ೆථ䙛", KeyEvent.getDeadChar(0, 0), "勗걝\u1aec톄", "\ue1d0\uf86a൲Ƕ갂蜢\uebd0뵫㉎\uf1dd", objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i170 = 0;
                                while (i170 < length) {
                                    Object obj = objArr19[i170];
                                    int i171 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                    int i172 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    int i173 = (i172 & 4) + ((i172 + 4) - (i172 & 4));
                                    byte bResolveOpacity = (byte) Drawable.resolveOpacity(0, 0);
                                    int i174 = -(-TextUtils.getTrimmedLength(""));
                                    Object[] objArr20 = new Object[i4];
                                    w((short) (((-1) - (((-1) - i171) | ((-1) - 55))) + (i171 | 55)), i173, bResolveOpacity, (i174 ^ 1707389963) + (((-1) - (((-1) - i174) | ((-1) - 1707389963))) << i4), 1806119407 - (~(-Color.green(0))), objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        int i175 = -Color.red(0);
                                        short s6 = (short) ((i175 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) + ((i175 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i175 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
                                        int i176 = -Color.blue(0);
                                        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                        int i177 = i176 * 1773;
                                        int i178 = (i177 ^ (-31860)) + (((i177 - 31860) - (i177 | (-31860))) << i4);
                                        int i179 = ~((~i176) | (-37));
                                        int i180 = ~(((-37) ^ iElapsedRealtime2) | ((-37) & iElapsedRealtime2));
                                        int i181 = (i179 ^ i180) | ((-1) - (((-1) - i180) | ((-1) - i179)));
                                        int i182 = ~iElapsedRealtime2;
                                        int i183 = (i182 ^ i176) | ((-1) - (((-1) - i182) | ((-1) - i176)));
                                        int i184 = i183 ^ 36;
                                        int i185 = (i183 + 36) - (36 | i183);
                                        int i186 = -(-(((-1) - (((-1) - (~((i184 + i185) - (i184 & i185)))) & ((-1) - i181))) * 886));
                                        int i187 = ((-1) - (((-1) - i178) | ((-1) - i186))) + (i186 | i178);
                                        int i188 = ~((-1) - (((-1) - (i182 ^ 36)) & ((-1) - (i182 & 36))));
                                        int i189 = i176 ^ i188;
                                        int i190 = (i188 + i176) - (i188 | i176);
                                        int i191 = -(-(((i190 + i189) - (i190 & i189)) * (-1772)));
                                        int i192 = -TextUtils.indexOf("", "");
                                        int i193 = f19342f * (-230259628);
                                        f19342f = i193;
                                        int i194 = (i192 * 673) - (-487791581);
                                        int i195 = ~((-1) - (((-1) - (i192 ^ i193)) & ((-1) - (i192 & i193))));
                                        int i196 = -(-(((-1) - (((-1) - (i195 ^ 1707389981)) & ((-1) - ((-1) - (((-1) - i195) | ((-1) - 1707389981)))))) * 672));
                                        int i197 = (i194 ^ i196) + (((i194 + i196) - (i194 | i196)) << 1);
                                        int i198 = ~i192;
                                        int i199 = ~i193;
                                        int i200 = ~((-1) - (((-1) - (i198 ^ i199)) & ((-1) - ((-1) - (((-1) - i198) | ((-1) - i199))))));
                                        int i201 = i193 ^ 1707389981;
                                        int i202 = (-1) - (((-1) - i193) | ((-1) - 1707389981));
                                        int i203 = ~((i201 + i202) - (i201 & i202));
                                        int i204 = ((i203 & i200) | (i200 ^ i203)) * (-672);
                                        int i205 = (i197 ^ i204) + (((-1) - (((-1) - i197) | ((-1) - i204))) << 1);
                                        int i206 = ~((-1) - (((-1) - ((-1) - (((-1) - i199) | ((-1) - (-1707389982))))) & ((-1) - ((-1707389982) ^ i199))));
                                        int i207 = ~((-1) - (((-1) - (i192 & (-1707389982))) & ((-1) - ((-1707389982) ^ i192))));
                                        int i208 = (i205 - (~(((-1) - (((-1) - ((-1) - (((-1) - i207) | ((-1) - i206)))) & ((-1) - (i206 ^ i207)))) * 672))) - 1;
                                        int i209 = -TextUtils.lastIndexOf("", '0');
                                        int i210 = f19344h * 1208161816;
                                        f19344h = i210;
                                        int i211 = i209 * (-183);
                                        int i212 = ((i211 | 192629579) << 1) - (i211 ^ 192629579);
                                        int i213 = ~i209;
                                        int i214 = ~i210;
                                        int i215 = i213 | i214;
                                        int i216 = ~((i215 ^ 1806119411) | ((-1) - (((-1) - i215) | ((-1) - 1806119411))));
                                        int i217 = ~i210;
                                        int i218 = (-1) - (((-1) - ((-1806119412) ^ i217)) & ((-1) - ((-1806119412) & i217)));
                                        int i219 = ~((i218 ^ i209) | ((-1) - (((-1) - i218) | ((-1) - i209))));
                                        int i220 = i212 + (((i219 + i216) - (i219 & i216)) * (-184));
                                        int i221 = i213 ^ i217;
                                        int i222 = (i217 + i213) - (i217 | i213);
                                        int i223 = (-1) - (((-1) - (~((-1806119412) | i213))) & ((-1) - (~((i221 + i222) - (i221 & i222)))));
                                        int i224 = ~((-1) - (((-1) - ((-1806119412) ^ i214)) & ((-1) - (((-1806119412) + i214) - ((-1806119412) | i214)))));
                                        int i225 = -(-((((-1) - (((-1) - i223) | ((-1) - i224))) | (i223 ^ i224)) * 184));
                                        int i226 = (i220 ^ i225) + (((i220 + i225) - (i220 | i225)) << 1);
                                        int i227 = -(-(((-1) - (((-1) - (i209 ^ 1806119411)) & ((-1) - (i209 & 1806119411)))) * 184));
                                        Object[] objArr22 = new Object[1];
                                        w(s6, ((-1) - (((-1) - i187) | ((-1) - i191))) + (i191 | i187) + ((~i183) * 886), (byte) ((-TextUtils.lastIndexOf("", '0', 0)) - 1), i208, (i226 ^ i227) + (((-1) - (((-1) - i227) | ((-1) - i226))) << 1), objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        int i228 = -Color.red(0);
                                        short s7 = (short) (((i228 + 100) - (100 | i228)) + ((i228 + 100) - (i228 & 100)));
                                        int i229 = -TextUtils.getOffsetAfter("", 0);
                                        int i230 = (((i229 + 10) - (10 & i229)) << 1) - (i229 ^ 10);
                                        byte b4 = (byte) (0 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))));
                                        int i231 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int i232 = ((-1) - (((-1) - i231) | ((-1) - 1707389978))) + ((-1) - (((-1) - i231) & ((-1) - 1707389978)));
                                        int i233 = -TextUtils.getTrimmedLength("");
                                        int iMyTid = Process.myTid();
                                        int i234 = (i233 * (-958)) - (-609389104);
                                        int i235 = ~iMyTid;
                                        int i236 = ~((-1) - (((-1) - (-1806119449)) & ((-1) - i235)));
                                        int i237 = ~i233;
                                        int i238 = -(-((((-1) - (((-1) - i236) & ((-1) - (~((i237 ^ iMyTid) | ((i237 + iMyTid) - (i237 | iMyTid))))))) | (~((-1) - (((-1) - (~iMyTid)) & ((-1) - i233))))) * 959));
                                        int i239 = (((-1) - (((-1) - i234) & ((-1) - i238))) << 1) - (i238 ^ i234);
                                        int i240 = i233 ^ 1806119448;
                                        int i241 = (-1) - (((-1) - 1806119448) | ((-1) - i233));
                                        int i242 = i239 + ((~((i241 + i240) - (i241 & i240))) * (-959));
                                        int i243 = ~i233;
                                        int i244 = ~((-1) - (((-1) - (i243 & i235)) & ((-1) - (i243 ^ i235))));
                                        int i245 = ~(((-1) - (((-1) - (-1806119449)) | ((-1) - iMyTid))) | ((-1806119449) ^ iMyTid));
                                        int i246 = (-1) - (((-1) - ((i244 + i245) - (i244 | i245))) & ((-1) - (i244 ^ i245)));
                                        int i247 = ~((-1) - (((-1) - ((i233 + iMyTid) - (i233 | iMyTid))) & ((-1) - (i233 ^ iMyTid))));
                                        int i248 = i246 ^ i247;
                                        int i249 = i246 & i247;
                                        int i250 = ((i249 + i248) - (i249 & i248)) * 959;
                                        Object[] objArr23 = new Object[1];
                                        w(s7, i230, b4, i232, ((i242 | i250) << 1) - (i250 ^ i242), objArr23);
                                        Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            v((char) (22313 - ExpandableListView.getPackedPositionChild(0L)), "캂镫⨽蹗", Color.argb(0, 0, 0, 0), "勗걝\u1aec톄", "㙤끻\uf351饌滟랼턳瀥伊\ue276\ue67a폇돝즸Ƕᇥ镮脶ƒ媒歸郌诣꽦㩊䝤ᾊ\uf1d3", objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            int i251 = -View.getDefaultSize(0, 0);
                                            int i252 = i251 * IptcDirectory.TAG_ORIGINAL_TRANSMISSION_REFERENCE;
                                            int i253 = ((-1) - (((-1) - i252) | ((-1) - 59461))) + ((-1) - (((-1) - i252) & ((-1) - 59461)));
                                            int i254 = ~i251;
                                            int i255 = (-1) - (((-1) - (i254 ^ (-97))) & ((-1) - ((-1) - (((-1) - i254) | ((-1) - (-97))))));
                                            int i256 = ~i255;
                                            int i257 = i2 ^ i256;
                                            int i258 = (-1) - (((-1) - i256) | ((-1) - i2));
                                            int i259 = (i258 + i257) - (i258 & i257);
                                            int i260 = 96 ^ i251;
                                            int i261 = 96 & i251;
                                            int i262 = ~((i261 + i260) - (i261 & i260));
                                            int i263 = i253 + (((i259 & i262) | (i259 ^ i262)) * 614);
                                            int i264 = ~i2;
                                            int i265 = ~((-1) - (((-1) - (i254 ^ i264)) & ((-1) - ((-1) - (((-1) - i254) | ((-1) - i264))))));
                                            int i266 = ~i255;
                                            int i267 = ((i266 + i265) - (i266 | i265)) | (i265 ^ i266);
                                            int i268 = ~((i73 ^ (-97)) | ((-97) & i73));
                                            int i269 = ((i267 + i268) - (i267 & i268)) * (-1228);
                                            int i270 = (i263 ^ i269) + ((i269 & i263) << 1);
                                            int i271 = i254 | 96;
                                            int i272 = ~(((-1) - (((-1) - i271) | ((-1) - i264))) | (i271 ^ i264));
                                            int i273 = i264 ^ i251;
                                            int i274 = (i251 + i264) - (i251 | i264);
                                            int i275 = (i274 + i273) - (i274 & i273);
                                            int i276 = ~((i275 - 97) - (i275 & (-97)));
                                            int i277 = i272 ^ i276;
                                            int i278 = (-1) - (((-1) - i276) | ((-1) - i272));
                                            short s8 = (short) ((i270 - (~(-(-(((i278 + i277) - (i278 & i277)) * 614))))) - 1);
                                            int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            byte packedPositionType = (byte) ExpandableListView.getPackedPositionType(0L);
                                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1707389992;
                                            int iGreen = Color.green(0);
                                            Object[] objArr25 = new Object[1];
                                            w(s8, maximumDrawingCacheSize, packedPositionType, iIndexOf2, (((-1) - (((-1) - iGreen) & ((-1) - 1806119458))) << 1) - (1806119458 ^ iGreen), objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                int i279 = -Drawable.resolveOpacity(0, 0);
                                                int i280 = (i279 * 50) - 10864;
                                                int i281 = ~((-1) - (((-1) - ((-1) - (((-1) - (-113)) | ((-1) - i73)))) & ((-1) - ((-113) ^ i73))));
                                                int i282 = ~((-113) | i279);
                                                int i283 = i281 ^ i282;
                                                int i284 = (i281 + i282) - (i281 | i282);
                                                int i285 = ((i284 + i283) - (i284 & i283)) * 98;
                                                int i286 = (i280 ^ i285) + ((i280 & i285) << 1);
                                                int i287 = ~i279;
                                                int i288 = (-1) - (((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - i287) | ((-1) - i264)))) & ((-1) - (i287 ^ i264)))))) & ((-1) - (-113)));
                                                int i289 = ~((i279 ^ i2) | (i279 & i2));
                                                int i290 = i288 ^ i289;
                                                int i291 = (-1) - (((-1) - i288) | ((-1) - i289));
                                                int i292 = ((i291 + i290) - (i291 & i290)) * (-49);
                                                int i293 = ((i286 | i292) << 1) - (i292 ^ i286);
                                                int i294 = (-113) ^ i2;
                                                int i295 = ((-113) + i2) - ((-113) | i2);
                                                int i296 = ~((i294 + i295) - (i294 & i295));
                                                int i297 = ~(((-1) - (((-1) - i279) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | (i279 ^ PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
                                                int i298 = (((i297 + i296) - (i297 | i296)) | (i296 ^ i297)) * 49;
                                                short s9 = (short) (((-1) - (((-1) - i293) | ((-1) - i298))) + ((-1) - (((-1) - i298) & ((-1) - i293))));
                                                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                int i299 = f19345i * (-623863076);
                                                f19345i = i299;
                                                int i300 = keyRepeatTimeout * ExifDirectoryBase.TAG_PRIMARY_CHROMATICITIES;
                                                int i301 = ((i300 | (-11412)) << 1) - (i300 ^ (-11412));
                                                int i302 = ~keyRepeatTimeout;
                                                int i303 = ~(((i302 + i299) - (i302 | i299)) | (i302 ^ i299));
                                                int i304 = -(-((((-37) & i303) | ((-37) ^ i303)) * (-318)));
                                                int i305 = ((-1) - (((-1) - i301) | ((-1) - i304))) + ((-1) - (((-1) - i304) & ((-1) - i301)));
                                                int i306 = ~((-1) - (((-1) - ((-37) ^ i299)) & ((-1) - ((-1) - (((-1) - (-37)) | ((-1) - i299))))));
                                                int i307 = ~i299;
                                                int i308 = (-1) - (((-1) - (i307 & keyRepeatTimeout)) & ((-1) - (i307 ^ keyRepeatTimeout)));
                                                int i309 = ~(((-1) - (((-1) - i308) | ((-1) - 36))) | (i308 ^ 36));
                                                int i310 = i306 ^ i309;
                                                int i311 = i306 & i309;
                                                int i312 = (i305 - (~(((i311 + i310) - (i311 & i310)) * 318))) - 1;
                                                int i313 = ~i299;
                                                int i314 = (-37) ^ i313;
                                                int i315 = (-1) - (((-1) - i313) | ((-1) - (-37)));
                                                int i316 = (i315 + i314) - (i315 & i314);
                                                int i317 = ~((-1) - (((-1) - ((i316 + keyRepeatTimeout) - (i316 | keyRepeatTimeout))) & ((-1) - (i316 ^ keyRepeatTimeout))));
                                                int i318 = ((-1) - (((-1) - keyRepeatTimeout) | ((-1) - 36))) | (keyRepeatTimeout ^ 36);
                                                int i319 = i318 ^ i299;
                                                int i320 = (-1) - (((-1) - i318) | ((-1) - i299));
                                                int i321 = ((~((i320 + i319) - (i320 & i319))) | i317) * 318;
                                                int i322 = (i312 ^ i321) + (((i321 + i312) - (i321 | i312)) << 1);
                                                byte bResolveSize = (byte) View.resolveSize(0, 0);
                                                int i323 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                int id = (int) Thread.currentThread().getId();
                                                int i324 = ~i323;
                                                int i325 = ~((-1) - (((-1) - (i324 ^ 1707389981)) & ((-1) - ((i324 + 1707389981) - (1707389981 | i324)))));
                                                int i326 = (-1707389982) ^ i323;
                                                int i327 = (-1707389982) & i323;
                                                int i328 = (i326 + i327) - (i326 & i327);
                                                int i329 = i328 ^ id;
                                                int i330 = (-1) - (((-1) - i328) | ((-1) - id));
                                                int i331 = ~((i329 + i330) - (i329 & i330));
                                                int i332 = i325 ^ i331;
                                                int i333 = i331 & i325;
                                                int i334 = ((i323 * 450) - 406532800) + (((i332 + i333) - (i332 & i333)) * 449) + ((~(i324 | 1707389981)) * (-1347));
                                                int i335 = ~i323;
                                                int i336 = ~(((i335 + 1707389981) - (i335 | 1707389981)) | (i335 ^ 1707389981));
                                                int i337 = ~id;
                                                int i338 = ((i337 - 1707389982) - (i337 | (-1707389982))) | ((-1707389982) ^ i337);
                                                int i339 = ~((-1) - (((-1) - ((i323 + i338) - (i323 | i338))) & ((-1) - (i338 ^ i323))));
                                                int i340 = i334 + (((-1) - (((-1) - ((i339 + i336) - (i339 | i336))) & ((-1) - (i336 ^ i339)))) * 449);
                                                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0');
                                                int i341 = (iIndexOf3 * (-167)) - 974231251;
                                                int i342 = ~iIndexOf3;
                                                int i343 = i342 ^ (-1806119414);
                                                int i344 = (-1) - (((-1) - i342) | ((-1) - (-1806119414)));
                                                int i345 = ~((i344 + i343) - (i344 & i343));
                                                int i346 = ~(((-1806119414) & i2) | ((-1806119414) ^ i2));
                                                int i347 = -(-(((i345 & i346) | (i345 ^ i346)) * IptcDirectory.TAG_TIME_SENT));
                                                int i348 = (((i341 + i347) - (i341 & i347)) << 1) - (i341 ^ i347);
                                                int i349 = iIndexOf3 ^ 1806119413;
                                                int i350 = 1806119413 & iIndexOf3;
                                                int i351 = (i348 - (~(-(-(((~((i350 + i349) - (i350 & i349))) | (~((iIndexOf3 + i2) - (iIndexOf3 & i2)))) * (-168)))))) - 1;
                                                int i352 = ~((i73 ^ iIndexOf3) | ((-1) - (((-1) - iIndexOf3) | ((-1) - i73))));
                                                int i353 = (-1806119414) ^ i352;
                                                int i354 = (i352 - 1806119414) - (i352 | (-1806119414));
                                                int i355 = ((i354 + i353) - (i354 & i353)) * 168;
                                                int i356 = (i351 ^ i355) + (((-1) - (((-1) - i355) | ((-1) - i351))) << 1);
                                                Object[] objArr27 = new Object[1];
                                                w(s9, i322, bResolveSize, i340, i356, objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                int i357 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                char c3 = (char) (((i357 | 47614) << 1) - (i357 ^ 47614));
                                                int i358 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int iNextInt = new Random().nextInt(1842509220);
                                                int i359 = ~iNextInt;
                                                int i360 = ~((-1) - (((-1) - ((1502551860 + i359) - (1502551860 | i359))) & ((-1) - (1502551860 ^ i359))));
                                                int i361 = ~((-1) - (((-1) - (~i358)) & ((-1) - iNextInt)));
                                                int i362 = (((i358 * (-949)) - 7426183) - (~(((i360 ^ i361) | ((-1) - (((-1) - i360) | ((-1) - i361)))) * 1900))) - 1;
                                                int i363 = ~iNextInt;
                                                int i364 = ~((-1) - (((-1) - (i363 & i358)) & ((-1) - (i363 ^ i358))));
                                                int i365 = iNextInt ^ (-1502551861);
                                                int i366 = iNextInt & (-1502551861);
                                                int i367 = ~((i365 + i366) - (i365 & i366));
                                                int i368 = i364 ^ i367;
                                                int i369 = i364 & i367;
                                                int i370 = (i362 - (~(-(-(((i368 + i369) - (i368 & i369)) * (-950)))))) - 1;
                                                int i371 = ~((-1) - (((-1) - ((i359 - 1502551861) - (i359 | (-1502551861)))) & ((-1) - (i359 ^ (-1502551861)))));
                                                int i372 = ~((iNextInt + i358) - (iNextInt & i358));
                                                int i373 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i372) | ((-1) - i371)))) & ((-1) - (i371 ^ i372)))) * 950));
                                                Object[] objArr28 = new Object[1];
                                                v(c3, "쯡烠ﾦ涹", (((-1) - (((-1) - i370) & ((-1) - i373))) << 1) - (i373 ^ i370), "勗걝\u1aec톄", "롤㇐颗芜᪾྇ꈳꄛ끷쵊쎌䮪\ud9ac贍ꨤ㛖鯏懔吟", objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i374 = 0; i374 < 2; i374 = (((-1) - (((-1) - i374) & ((-1) - 1))) << 1) - (i374 ^ 1)) {
                                                    Object obj2 = objArr3[i374];
                                                    try {
                                                        int i375 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                        int i376 = (i375 * (-1939)) + 971;
                                                        int i377 = (-2) ^ i375;
                                                        int i378 = (-2) & i375;
                                                        int i379 = ~((i377 + i378) - (i377 & i378));
                                                        int i380 = ~(1 | i264);
                                                        int i381 = i379 ^ i380;
                                                        int i382 = (i379 + i380) - (i379 | i380);
                                                        int i383 = -(-(((i382 + i381) - (i382 & i381)) * (-970)));
                                                        int i384 = ((-1) - (((-1) - i376) | ((-1) - i383))) + ((-1) - (((-1) - i376) & ((-1) - i383)));
                                                        int i385 = ~i375;
                                                        int i386 = -(-((~((i385 ^ 1) | ((i385 + 1) - (1 | i385)))) * 1940));
                                                        int i387 = (i384 ^ i386) + (((-1) - (((-1) - i386) | ((-1) - i384))) << 1);
                                                        int i388 = ~((-1) - (((-1) - ((i385 - 2) - (i385 | (-2)))) & ((-1) - (i385 ^ (-2)))));
                                                        int i389 = (i264 + 1) - (1 | i264);
                                                        int i390 = ~((i264 ^ 1) | i389);
                                                        Object[] objArr29 = new Object[1];
                                                        v((char) ((i387 - (~(-(-((((i388 + i390) - (i388 | i390)) | (i388 ^ i390)) * 970))))) - 1), "ඵ䅥劲ꪮ", Drawable.resolveOpacity(0, 0), "勗걝\u1aec톄", "ꛔ抔导ಞ衕砬놋\uee8b꜎꿜籗ꋝ衊멶꽋隘劘苫휬ꆍ䤹춳㠇൧\uf8c7덠፟\ued21媕쁬뇧\udf4fꥑ\udde5", objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0);
                                                        Object[] objArr30 = new Object[1];
                                                        v((char) ((((iIndexOf4 + 1) - (1 & iIndexOf4)) << 1) - (iIndexOf4 ^ 1)), "ᆢ罜쐤ୂ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 612326416, "勗걝\u1aec톄", "岗㞎䤒册鰜继컀䅜㴫\uf64e椘樮\uf718挜ў홴ꃶ啠룄þ潰皖什", objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[]{(i + i) - (i & i)}, new int[]{i2}, null, new int[]{((i2 - 2) - ((-2) | i2)) | i389}};
                                                            int i391 = f19353q * (-1627921994);
                                                            f19353q = i391;
                                                            int i392 = ~i391;
                                                            int i393 = ~((i392 - 276612896) - (i392 & (-276612896)));
                                                            int i394 = 1000617102 + (((i393 + 401535126) - (i393 & 401535126)) * (-235)) + (((~((-1) - (((-1) - (-276612896)) & ((-1) - i391)))) | 401535126) * (-470)) + (((-1) - (((-1) - (~(i391 | (-1050378)))) & ((-1) - 125972608))) * 235);
                                                            int i395 = (i394 ^ 16) + (((i394 + 16) - (i394 | 16)) << 1);
                                                            int i396 = f19346j * 754462112;
                                                            f19346j = i396;
                                                            int i397 = i395 * 55;
                                                            int i398 = i3 * (-107);
                                                            int i399 = (((i397 + i398) - (i397 & i398)) << 1) - (i397 ^ i398);
                                                            int i400 = ~i395;
                                                            int i401 = ~(((-1) - (((-1) - i400) | ((-1) - i3))) | (i400 ^ i3));
                                                            int i402 = ~i396;
                                                            int i403 = i402 ^ i3;
                                                            int i404 = i402 & i3;
                                                            int i405 = ~((i404 + i403) - (i404 & i403));
                                                            int i406 = -(-((((-1) - (((-1) - i401) | ((-1) - i405))) | (i401 ^ i405)) * (-108)));
                                                            int i407 = ((i399 + i406) - (i399 | i406)) + ((i406 + i399) - (i406 & i399));
                                                            int i408 = ~((~i395) | i396);
                                                            int i409 = ~((~i3) | i395);
                                                            int i410 = i408 ^ i409;
                                                            int i411 = i408 & i409;
                                                            int i412 = (i411 + i410) - (i411 & i410);
                                                            int i413 = ~((-1) - (((-1) - (~i396)) & ((-1) - i395)));
                                                            int i414 = i412 ^ i413;
                                                            int i415 = i412 & i413;
                                                            int i416 = (i407 - (~(((i415 + i414) - (i415 & i414)) * 54))) - 1;
                                                            int i417 = ~i3;
                                                            int i418 = (i416 - (~(((~((i395 + i417) - (i395 & i417))) | i396) * 54))) - 1;
                                                            int i419 = i418 << 13;
                                                            int i420 = ~((-1) - (((-1) - i418) | ((-1) - i419)));
                                                            int i421 = (i419 + i418) - (i419 & i418);
                                                            int i422 = (i421 + i420) - (i421 | i420);
                                                            int i423 = i422 ^ (i422 >>> 17);
                                                            int i424 = i423 << 5;
                                                            int i425 = (~i424) & i423;
                                                            int i426 = (-1) - (((-1) - (~i423)) | ((-1) - i424));
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
                                                int i427 = (i170 ^ 46) + (((-1) - (((-1) - i170) | ((-1) - 46))) << 1);
                                                i170 = (i427 ^ (-45)) + ((i427 & (-45)) << 1);
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
        Object[] objArr32 = {new int[]{(-1) - (((-1) - ((~i) & i)) & ((-1) - ((-1) - (((-1) - (~i)) | ((-1) - i)))))}, new int[]{i2}, null, new int[]{i2}};
        int i428 = f19357u * 838836914;
        f19357u = i428;
        int i429 = ~i428;
        int i430 = ~((-295791182) | i429);
        int i431 = ~(((-382356841) + i429) - ((-382356841) & i429));
        int i432 = 221962676 + (((i430 + i431) - (i430 & i431)) * (-867));
        int i433 = ~((-1) - (((-1) - (-295791182)) & ((-1) - i428)));
        int i434 = i432 + ((((i433 + 276842568) - (i433 & 276842568)) | (~((-382356841) | i428))) * (-1734));
        int i435 = (-1) - (((-1) - (~((-1) - (((-1) - i429) & ((-1) - (-276842569)))))) & ((-1) - (~((-18948614) | i428))));
        int i436 = ~(i428 | (-105514273));
        int i437 = -(-(i434 + (((i436 + i435) - (i436 & i435)) * 867)));
        int i438 = ((i3 | i437) << 1) - (i437 ^ i3);
        int i439 = i438 << 13;
        int i440 = (i439 | i438) & (~(i438 & i439));
        int i441 = i440 >>> 17;
        int i442 = ~(i440 & i441);
        int i443 = (-1) - (((-1) - i440) & ((-1) - i441));
        int i444 = (i443 + i442) - (i443 | i442);
        int i445 = i444 << 5;
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{47, MessagePack.Code.BIN8, Ascii.FS, 43};
        $$b = 34;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void v(char r21, java.lang.String r22, int r23, java.lang.String r24, java.lang.String r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControl.v(char, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01ae A[PHI: r1
  0x01ae: PHI (r1v47 int) = (r1v4 int), (r1v50 int) binds: [B:117:0x01c3, B:113:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c6 A[PHI: r1
  0x01c6: PHI (r1v5 int) = (r1v4 int), (r1v50 int) binds: [B:117:0x01c3, B:113:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(short r27, int r28, byte r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControl.w(short, int, byte, int, int, java.lang.Object[]):void");
    }

    public final T getValue() {
        int i2 = 2 % 2;
        Object obj = null;
        if (this.innerTransactionControl == null) {
            int i3 = f19356t + 11;
            f19354r = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        if (!(!r0.b().booleanValue())) {
            return this.innerTransactionControl.a();
        }
        int i4 = f19356t + 115;
        f19354r = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final Boolean isSupported() {
        int i2 = 2 % 2;
        int i3 = f19354r;
        int i4 = i3 + 117;
        f19356t = i4 % 128;
        int i5 = i4 % 2;
        b<T> bVar = this.innerTransactionControl;
        if (bVar != null) {
            Boolean boolB = bVar.b();
            int i6 = f19356t + 99;
            f19354r = i6 % 128;
            int i7 = i6 % 2;
            return boolB;
        }
        int i8 = i3 + 61;
        f19356t = i8 % 128;
        if (i8 % 2 != 0) {
            return Boolean.FALSE;
        }
        Boolean bool = Boolean.FALSE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionControlUpdate<T> setValue(T t2) {
        int i2 = 2 % 2;
        int i3 = f19356t;
        int i4 = i3 + 9;
        f19354r = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        b<T> bVar = this.innerTransactionControl;
        if (bVar == null) {
            int i5 = i3 + 49;
            f19354r = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (bVar.b().booleanValue()) {
            return new TransactionControlUpdate<>(new a(t2, this.innerTransactionControl));
        }
        int i6 = f19356t + 105;
        f19354r = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
