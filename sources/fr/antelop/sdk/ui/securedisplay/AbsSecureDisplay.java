package fr.antelop.sdk.ui.securedisplay;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.encoding.Base64;
import o.a.j;
import o.a.n;
import o.ea.f;
import o.eb.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbsSecureDisplay<P> implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f19590a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f19591b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f19592c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f19593d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f19594e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19595f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f19596g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19597h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f19598i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f19599j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f19600k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static byte[] f19601l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f19602m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f19603n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static short[] f19604o = null;
    protected final String TAG = "AbsSecureDisplay";

    private static String $$c(short s2, byte b2, int i2) {
        int i3 = s2 + 103;
        byte[] bArr = $$a;
        int i4 = i2 * 3;
        int i5 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i3 += -i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i5];
            i5++;
            i3 += -b3;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f19598i = 2119673470;
        f19599j = -2144118662;
        f19594e = 2004284337;
        f19593d = 1643052297;
        f19591b = 844554912;
        f19590a = 1564758627;
        f19592c = -1451142331;
        f19603n = 0;
        f19600k = 1;
        f19597h = -1270219351;
        f19596g = 34088037;
        f19595f = 1150422417;
        f19602m = 2013420733;
        f19601l = new byte[]{-114, Base64.padSymbol, -121, 33, -118, 55, 38, 33, 32, -115, 37, 80, 123, 45, 94, 56, 41, -114, 32, 92, 91, -29, 38, 33, 32, -115, 37, 80, 123, Ascii.DC2, 118, -114, 10, 101, Ascii.SI, 91, 84, MessagePack.Code.UINT8, Ascii.CR, -14, Ascii.SI, 126, 6, 95, 116, Ascii.EM, 125, 97, 32, Ascii.CR, -14, Ascii.SI, 126, 6, 95, 116, Ascii.RS, 85, 19, Ascii.SO, 80, -14, 127, MessagePack.Code.INT32, -66, MessagePack.Code.EXT8, MessagePack.Code.ARRAY32, -24, -80, MessagePack.Code.NEGFIXINT_PREFIX, -94, -76, MessagePack.Code.BIN16, Ascii.SO, -69, -24, -120, -105, -90, -82, -67, -105, -100, -72, -90, -82, -66, -104, -110, -125, 114, MessagePack.Code.INT64, -89, 82, -22, -82, -101, -93, -82, -95, -108, 127, MessagePack.Code.STR16, -91, -86, -89, -106, -66, -105, 100, MessagePack.Code.UINT64, Base64.padSymbol, -71, 8, -124, -97, -101, -93, -123, -104, -125, -75, -91, -117, -92, MessagePack.Code.FIXSTR_PREFIX, -101, -95, -87, -104, -111, 120, -119, MessagePack.Code.NEGFIXINT_PREFIX, -104, -111, -104, 105, -23, -103, -109, -81, -95, -120, -92, -88, 89, MessagePack.Code.INT16, -77, -119, -81, -115, MessagePack.Code.INT64, -19, -95, -77, MessagePack.Code.INT64, -89, -20, -76, -123, -31, -19, 96, 40, -92, -71, MessagePack.Code.INT16, -92, -17, -94, -107, -8, -21, -24, -19, -68, MessagePack.Code.FIXEXT1, -67, 122, -8, 90, -31, -3, 106, -28, -4, 101, 84, 69, 1, -8, 90, -10, 84, -2, 80, -31, -117, MessagePack.Code.FIXEXT4, 48, -17, -21, 32, MessagePack.Code.INT32, MessagePack.Code.STR16, 35, 34, 3, 59, 62, -24, -14, Ascii.ESC, -85, 35, 34, 35, Ascii.SUB, -102, 42, 56, MessagePack.Code.FIXEXT1, MessagePack.Code.INT32, 51, -17, MessagePack.Code.INT64, 106, -30, MessagePack.Code.FIXEXT16, 58, MessagePack.Code.FIXEXT1};
    }

    public AbsSecureDisplay(String str, int i2, d<P> dVar) throws Throwable {
        if (f.a()) {
            f.d("AbsSecureDisplay", "AbsSecureDisplay - Not supported : Feature SCA Disabled");
        }
    }

    public static Object[] a(Context context, int i2, int i3) {
        int i4 = 1;
        if (context == null) {
            Object[] objArr = {new int[1], new int[]{i2}, null, new int[]{i2}};
            int id = (int) Thread.currentThread().getId();
            int i5 = ~id;
            int i6 = 1356832976 + (((~(14870470 | i5)) | 693018492) * 226);
            int i7 = (-1) - (((-1) - (~((-693018493) | id))) & ((-1) - 4360004));
            int i8 = ~((i5 + 703528958) - (i5 & 703528958));
            int i9 = i6 + (((i8 + i7) - (i8 & i7)) * (-113)) + ((~((id + 14870470) - (id & 14870470))) * 113);
            int i10 = (i9 << 1) - i9;
            int i11 = (i3 & i10) + ((-1) - (((-1) - i3) & ((-1) - i10)));
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 >>> 17;
            int i14 = (~i13) & i12;
            int i15 = ~i12;
            int i16 = ((i15 + i13) - (i15 | i13)) | i14;
            int i17 = i16 << 5;
            ((int[]) objArr[0])[0] = (-1) - (((-1) - ((-1) - (((-1) - i16) & ((-1) - i17)))) | ((-1) - (~(i16 & i17))));
            return objArr;
        }
        try {
            int i18 = -TextUtils.indexOf("", "", 0, 0);
            int i19 = (i18 ^ 38) + ((i18 & 38) << 1);
            int i20 = 268 - (~(-TextUtils.getOffsetAfter("", 0)));
            int i21 = -(-TextUtils.indexOf("", "", 0));
            Object[] objArr2 = new Object[1];
            p(i19, i20, (i21 ^ 12) + (((-1) - (((-1) - i21) | ((-1) - 12))) << 1), true, "\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019", objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            short s2 = (short) ((-82) - (~TextUtils.getCapsMode("", 0, 0)));
            int iIndexOf = TextUtils.indexOf("", "");
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i22 = (iIndexOf * (-103)) + 2987;
            int i23 = ~iIndexOf;
            int i24 = -(-(((~((-1) - (((-1) - ((-1) - (((-1) - i23) | ((-1) - 28)))) & ((-1) - (i23 ^ 28))))) | (~((-1) - (((-1) - (28 ^ iElapsedRealtime)) & ((-1) - ((28 + iElapsedRealtime) - (28 | iElapsedRealtime))))))) * 104));
            int i25 = (i22 ^ i24) + ((i22 & i24) << 1);
            int i26 = ~iElapsedRealtime;
            int i27 = ((i26 + iIndexOf) - (i26 | iIndexOf)) | (i26 ^ iIndexOf);
            int i28 = (~(((-1) - (((-1) - i27) | ((-1) - (-29)))) | (i27 ^ (-29)))) * (-104);
            int i29 = (((-1) - (((-1) - i25) & ((-1) - i28))) << 1) - (i28 ^ i25);
            int i30 = iIndexOf ^ iElapsedRealtime;
            int i31 = (-1) - (((-1) - iIndexOf) | ((-1) - iElapsedRealtime));
            int i32 = i29 + (((i31 + i30) - (i31 & i30)) * 104);
            int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
            int i33 = f19592c * (-1550501578);
            f19592c = i33;
            int i34 = pressedStateDuration * (-947);
            int i35 = ~pressedStateDuration;
            int i36 = ~((-1) - (((-1) - (94 ^ i33)) & ((-1) - ((-1) - (((-1) - 94) | ((-1) - i33))))));
            int i37 = ((((-1) - (((-1) - i34) | ((-1) - (-90155)))) + ((-1) - (((-1) - i34) & ((-1) - (-90155))))) - (~(((-1) - (((-1) - (i35 ^ i36)) & ((-1) - ((-1) - (((-1) - i36) | ((-1) - i35)))))) * (-948)))) - 1;
            int i38 = ~pressedStateDuration;
            int i39 = i38 ^ 94;
            int i40 = (i38 + 94) - (i38 | 94);
            int i41 = (~((-1) - (((-1) - ((i40 + i39) - (i40 & i39))) & ((-1) - (~i33))))) * (-948);
            int i42 = (i37 ^ i41) + (((-1) - (((-1) - i37) | ((-1) - i41))) << 1);
            int i43 = -(-(((-1) - (((-1) - (pressedStateDuration ^ 94)) & ((-1) - ((-1) - (((-1) - pressedStateDuration) | ((-1) - 94)))))) * 948));
            byte b2 = (byte) ((i42 ^ i43) + (((i43 + i42) - (i43 | i42)) << 1));
            int i44 = -(ViewConfiguration.getEdgeSlop() >> 16);
            int i45 = -(ViewConfiguration.getEdgeSlop() >> 16);
            Object[] objArr4 = new Object[1];
            q(s2, i32, b2, (i44 ^ (-1016090861)) + ((i44 & (-1016090861)) << 1), (((i45 - 1184508392) - (i45 & (-1184508392))) << 1) - (i45 ^ (-1184508392)), objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                int i46 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                Object[] objArr6 = new Object[1];
                p(((i46 + 37) - (37 | i46)) + ((i46 + 37) - (i46 & 37)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 268, 11 - (~(-View.resolveSize(0, 0))), true, "\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019", objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                int i47 = -(-Color.alpha(0));
                short s3 = (short) ((i47 ^ (-61)) + (((-1) - (((-1) - i47) | ((-1) - (-61)))) << 1));
                int iIndexOf2 = TextUtils.indexOf("", "") - 29;
                int i48 = -(-TextUtils.lastIndexOf("", '0', 0));
                byte b3 = (byte) (((i48 | (-71)) << 1) - (i48 ^ (-71)));
                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                int i49 = (windowTouchSlop & (-1016090861)) + ((-1) - (((-1) - windowTouchSlop) & ((-1) - (-1016090861))));
                int i50 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr7 = new Object[1];
                q(s3, iIndexOf2, b3, i49, (((i50 - 1184508361) - (i50 & (-1184508361))) << 1) - (i50 ^ (-1184508361)), objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    int i51 = -Color.rgb(0, 0, 0);
                    int i52 = f19590a * (-1100846045);
                    f19590a = i52;
                    int i53 = (i51 * (-183)) - 1224743722;
                    int i54 = ~i51;
                    int i55 = ~i52;
                    int i56 = (i54 ^ i55) | ((-1) - (((-1) - i54) | ((-1) - i55)));
                    int i57 = (i55 + 16777177) - (i55 & 16777177);
                    int i58 = i57 ^ i51;
                    int i59 = (i57 + i51) - (i57 | i51);
                    int i60 = -(-(((~((i58 + i59) - (i58 & i59))) | (~((-1) - (((-1) - (i56 ^ (-16777178))) & ((-1) - ((-1) - (((-1) - i56) | ((-1) - (-16777178))))))))) * (-184)));
                    int i61 = ((i53 | i60) << 1) - (i60 ^ i53);
                    int i62 = ~((-1) - (((-1) - i54) & ((-1) - 16777177)));
                    int i63 = ~i56;
                    int i64 = (-1) - (((-1) - ((-1) - (((-1) - i62) | ((-1) - i63)))) & ((-1) - (i62 ^ i63)));
                    int i65 = ~i52;
                    int i66 = 16777177 ^ i65;
                    int i67 = i65 & 16777177;
                    int i68 = ~((i67 + i66) - (i67 & i66));
                    int i69 = i61 + ((((i64 + i68) - (i64 | i68)) | (i64 ^ i68)) * 184);
                    int i70 = i51 ^ (-16777178);
                    int i71 = i51 & (-16777178);
                    int i72 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Object[] objArr9 = new Object[1];
                    p(i69 + (((i70 + i71) - (i70 & i71)) * 184), (i72 ^ 270) + (((-1) - (((-1) - i72) | ((-1) - 270))) << 1), TextUtils.lastIndexOf("", '0', 0, 0) + 13, true, "\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019", objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        int iIndexOf3 = TextUtils.indexOf("", "", 0);
                        int i73 = (((iIndexOf3 + 23) - (23 & iIndexOf3)) << 1) - (iIndexOf3 ^ 23);
                        int i74 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i75 = i74 * (-381);
                        int i76 = ((-1) - (((-1) - i75) | ((-1) - 53376))) + (i75 | 53376);
                        int i77 = ~i74;
                        int i78 = i77 * (-191);
                        int i79 = ((i76 + i78) - (i76 | i78)) + (i78 | i76);
                        int i80 = ~((-1) - (((-1) - (i2 ^ 278)) & ((-1) - (278 & i2))));
                        int i81 = (i79 - (~(-(-((((i74 + i80) - (i74 | i80)) | (i74 ^ i80)) * 191))))) - 1;
                        int i82 = i77 ^ 278;
                        int i83 = i77 & 278;
                        int i84 = ~((i82 + i83) - (i82 & i83));
                        int i85 = ~i2;
                        int i86 = ~((i85 ^ 278) | ((-1) - (((-1) - i85) | ((-1) - 278))));
                        int i87 = (i81 - (~(-(-(((-1) - (((-1) - (i84 & i86)) & ((-1) - (i84 ^ i86)))) * 191))))) - 1;
                        int i88 = -KeyEvent.normalizeMetaState(0);
                        int i89 = f19591b * (-1842686577);
                        f19591b = i89;
                        int i90 = i88 * 51;
                        int i91 = (i90 & (-294)) + (i90 | (-294));
                        int i92 = i88 ^ i89;
                        int i93 = (-1) - (((-1) - i88) | ((-1) - i89));
                        int i94 = (i91 - (~(((i92 + i93) - (i92 & i93)) * (-50)))) - 1;
                        int i95 = ~i88;
                        int i96 = (i95 - 7) - (i95 & (-7));
                        int i97 = i96 ^ i89;
                        int i98 = i96 & i89;
                        int i99 = ~((i98 + i97) - (i98 & i97));
                        int i100 = ~i89;
                        int i101 = (-7) ^ i100;
                        int i102 = (-1) - (((-1) - (-7)) | ((-1) - i100));
                        int i103 = ~(((i101 + i102) - (i101 & i102)) | i88);
                        int i104 = i94 + (((i103 + i99) - (i103 & i99)) * 50);
                        int i105 = ~((-7) | i100);
                        int i106 = ~(((-7) ^ i88) | (((-7) + i88) - ((-7) | i88)));
                        int i107 = (-1) - (((-1) - ((-1) - (((-1) - i105) | ((-1) - i106)))) & ((-1) - (i105 ^ i106)));
                        int i108 = ~i89;
                        int i109 = ~(((i88 + i108) - (i88 | i108)) | (i108 ^ i88));
                        int i110 = ((-1) - (((-1) - ((-1) - (((-1) - i109) | ((-1) - i107)))) & ((-1) - (i107 ^ i109)))) * 50;
                        Object[] objArr10 = new Object[1];
                        p(i73, i87, (((-1) - (((-1) - i104) & ((-1) - i110))) << 1) - (i110 ^ i104), true, "\u0004\n\r\uffff\t￼\u000f\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff", objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                        int i111 = (scrollBarSize * 659) - 11169;
                        int i112 = ~scrollBarSize;
                        int i113 = ~((-1) - (((-1) - (i112 & 17)) & ((-1) - (i112 ^ 17))));
                        int i114 = ~(((-18) & scrollBarSize) | ((-18) ^ scrollBarSize));
                        int i115 = (i113 + i114) - (i113 & i114);
                        int i116 = (-1) - (((-1) - (scrollBarSize ^ i2)) & ((-1) - ((scrollBarSize + i2) - (scrollBarSize | i2))));
                        int i117 = -(-((i115 | (~i116)) * (-658)));
                        int i118 = (((i111 + i117) - (i111 & i117)) << 1) - (i111 ^ i117);
                        int i119 = -(-((~(((-18) + scrollBarSize) - ((-18) & scrollBarSize))) * 658));
                        int i120 = (i118 ^ i119) + (((-1) - (((-1) - i119) | ((-1) - i118))) << 1);
                        int i121 = ~((-1) - (((-1) - (scrollBarSize & (-18))) & ((-1) - ((-18) ^ scrollBarSize))));
                        int i122 = ~i116;
                        Object[] objArr11 = new Object[1];
                        p((i120 - (~(-(-(((-1) - (((-1) - (i121 & i122)) & ((-1) - (i121 ^ i122)))) * 658))))) - 1, 229 - (~(-(-AndroidCharacter.getMirror('0')))), 14 - (~(ViewConfiguration.getTapTimeout() >> 16)), true, "\u0003�\n�￩\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003\u000e\u0001", objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            p(22 - (~(-(-View.resolveSize(0, 0)))), 278 - (~(-View.combineMeasuredStates(0, 0))), (-43) - (~(-(-AndroidCharacter.getMirror('0')))), true, "\u0004\n\r\uffff\t￼\u000f\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff", objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            short s4 = (short) (96 - (~(-AndroidCharacter.getMirror('0'))));
                            int i123 = (-30) - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0))));
                            byte bIndexOf = (byte) (103 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int i124 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                            int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                            Object[] objArr13 = new Object[1];
                            q(s4, i123, bIndexOf, ((-1) - (((-1) - i124) | ((-1) - (-1016090826)))) + (i124 | (-1016090826)), ((-1) - (((-1) - scrollDefaultDelay) | ((-1) - (-1184508330)))) + ((-1) - (((-1) - scrollDefaultDelay) & ((-1) - (-1184508330)))), objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                short sLastIndexOf = (short) ((-38) - TextUtils.lastIndexOf("", '0'));
                                int i125 = (-28) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int i126 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                byte b4 = (byte) (((i126 | (-8)) << 1) - (i126 ^ (-8)));
                                int i127 = -TextUtils.getOffsetAfter("", 0);
                                int iActiveCount = Thread.activeCount();
                                int i128 = ~iActiveCount;
                                int i129 = ~i127;
                                int i130 = ~((-1) - (((-1) - (i129 ^ (-1016090831))) & ((-1) - (i129 & (-1016090831)))));
                                int i131 = (((i127 * 193) - (-1462965233)) - (~(((i128 ^ i130) | ((-1) - (((-1) - i130) | ((-1) - i128)))) * (-192)))) - 1;
                                int i132 = ~i127;
                                int i133 = i132 ^ 1016090830;
                                int i134 = (-1) - (((-1) - i132) | ((-1) - 1016090830));
                                int i135 = ~((i133 + i134) - (i133 & i134));
                                int i136 = ~iActiveCount;
                                int i137 = ~((1016090830 ^ i136) | (1016090830 & i136));
                                int i138 = i131 + (((i135 ^ i137) | ((-1) - (((-1) - i137) | ((-1) - i135)))) * (-384));
                                int i139 = (i129 + 1016090830) - (i129 & 1016090830);
                                int i140 = ~((-1) - (((-1) - (i139 & iActiveCount)) & ((-1) - (i139 ^ iActiveCount))));
                                int i141 = ((1016090830 + i128) - (1016090830 | i128)) | (1016090830 ^ i128);
                                int i142 = ~((-1) - (((-1) - (i141 & i127)) & ((-1) - (i141 ^ i127))));
                                int i143 = (i142 + i140) - (i142 & i140);
                                int i144 = i127 ^ (-1016090831);
                                int i145 = (-1) - (((-1) - i127) | ((-1) - (-1016090831)));
                                int i146 = (i144 + i145) - (i144 & i145);
                                int i147 = ~((i146 & iActiveCount) | (i146 ^ iActiveCount));
                                int i148 = i143 ^ i147;
                                int i149 = (-1) - (((-1) - i143) | ((-1) - i147));
                                int i150 = i138 + (((i149 + i148) - (i149 & i148)) * 192);
                                int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                int i151 = ~maxKeyCode;
                                int i152 = ~i2;
                                int i153 = ~((i151 + i152) - (i151 & i152));
                                int i154 = ~(1184508315 | maxKeyCode);
                                int i155 = maxKeyCode ^ i2;
                                int i156 = maxKeyCode & i2;
                                int i157 = (((maxKeyCode * (-337)) - 2116360596) - (~(((-1) - (((-1) - ((i153 & i154) | (i153 ^ i154))) & ((-1) - (~((i155 + i156) - (i155 & i156)))))) * (-338)))) - 1;
                                int i158 = ~maxKeyCode;
                                int i159 = -(-((~((-1) - (((-1) - (i158 ^ (-1184508316))) & ((-1) - (i158 & (-1184508316)))))) * ExifDirectoryBase.TAG_EXTRA_SAMPLES));
                                int i160 = (((-1) - (((-1) - i157) & ((-1) - i159))) << 1) - (i157 ^ i159);
                                int i161 = ~(i158 | i85);
                                int i162 = (maxKeyCode & (-1184508316)) | (maxKeyCode ^ (-1184508316));
                                int i163 = i162 ^ i2;
                                int i164 = (-1) - (((-1) - i162) | ((-1) - i2));
                                int i165 = ~((i164 + i163) - (i164 & i163));
                                int i166 = (i160 - (~(-(-(((i165 & i161) | (i161 ^ i165)) * ExifDirectoryBase.TAG_EXTRA_SAMPLES))))) - 1;
                                Object[] objArr15 = new Object[1];
                                q(sLastIndexOf, i125, b4, i150, i166, objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int i167 = -(Process.myPid() >> 22);
                                int i168 = ((i167 | 14) << 1) - (i167 ^ 14);
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ETB;
                                int deadChar = KeyEvent.getDeadChar(0, 0);
                                Object[] objArr16 = new Object[1];
                                p(i168, modifierMetaStateMask, ((deadChar + 14) - (14 | deadChar)) + (deadChar | 14), false, "\u0003\u0001\u0010￬�\uffff\u0007�\u0003\u0001￥\n\u0002\u000b", objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int i169 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                Object[] objArr17 = new Object[1];
                                p(((i169 + 29) - (29 | i169)) + ((i169 + 29) - (i169 & 29)), ((doubleTapTimeout + 275) - (275 | doubleTapTimeout)) + ((-1) - (((-1) - doubleTapTimeout) & ((-1) - 275))), 1 - (~(-(-TextUtils.indexOf("", "", 0, 0)))), true, "\r\u0000\u000e\u0005\r￨\u0004\u0006\u0000\n\u0002\u0000\uffefￍ\f\u000fￍ\u0013\r\u0004\u0013\r\u000e\u0002ￍ\u0003\b\u000e\u0011\u0003", objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                int i170 = -Color.alpha(0);
                                int i171 = ((i170 | 10) << 1) - (i170 ^ 10);
                                int i172 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i173 = ((i172 + OlympusImageProcessingMakernoteDirectory.TagWbGLevel) - (287 | i172)) + (i172 | OlympusImageProcessingMakernoteDirectory.TagWbGLevel);
                                int maxKeyCode2 = KeyEvent.getMaxKeyCode() >> 16;
                                Object[] objArr18 = new Object[1];
                                p(i171, i173, (maxKeyCode2 ^ 9) + (((-1) - (((-1) - maxKeyCode2) | ((-1) - 9))) << 1), true, "\ufff8\u0005\b\u0007\ufff4\u0001\ufffa￼\u0006\u0006", objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i174 = 0;
                                while (i174 < length) {
                                    Object obj = objArr19[i174];
                                    int threadPriority = Process.getThreadPriority(0);
                                    int i175 = -(-(((threadPriority & 20) + (threadPriority | 20)) >> 6));
                                    short s5 = (short) ((((-1) - (((-1) - i175) & ((-1) - 12))) << i4) - (i175 ^ 12));
                                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0);
                                    int i176 = f19593d * 2111050920;
                                    f19593d = i176;
                                    int i177 = (iIndexOf4 * (-183)) + FujifilmMakernoteDirectory.TAG_MIN_FOCAL_LENGTH;
                                    int i178 = ~iIndexOf4;
                                    int i179 = ~i176;
                                    int i180 = i178 ^ i179;
                                    int i181 = i178 & i179;
                                    int i182 = (i180 + i181) - (i180 & i181);
                                    int i183 = (-1) - (((-1) - (27 ^ i179)) & ((-1) - ((27 + i179) - (27 | i179))));
                                    int i184 = ((~((-1) - (((-1) - (i183 ^ iIndexOf4)) & ((-1) - ((-1) - (((-1) - i183) | ((-1) - iIndexOf4))))))) | (~((-1) - (((-1) - (i182 ^ (-28))) & ((-1) - ((i182 - 28) - (i182 | (-28)))))))) * (-184);
                                    int i185 = ~((i178 ^ 27) | ((i178 + 27) - (27 | i178)));
                                    int i186 = ~((-1) - (((-1) - (i178 ^ i179)) & ((-1) - (i178 & i179))));
                                    int i187 = (-1) - (((-1) - ((i185 + i186) - (i185 | i186))) & ((-1) - (i185 ^ i186)));
                                    int i188 = ~((-1) - (((-1) - i179) & ((-1) - 27)));
                                    int i189 = (((i177 ^ i184) + (((-1) - (((-1) - i184) | ((-1) - i177))) << 1)) - (~(((-1) - (((-1) - ((i187 + i188) - (i187 | i188))) & ((-1) - (i187 ^ i188)))) * 184))) - 1;
                                    int i190 = -(-(((-1) - (((-1) - iIndexOf4) & ((-1) - (-28)))) * 184));
                                    int i191 = (((i189 + i190) - (i189 & i190)) << 1) - (i189 ^ i190);
                                    byte b5 = (byte) (71 - (~(-(-TextUtils.indexOf((CharSequence) "", '0', 0)))));
                                    int i192 = (-1016090840) - (~TextUtils.lastIndexOf("", '0'));
                                    int i193 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    Object[] objArr20 = new Object[1];
                                    q(s5, i191, b5, i192, (((-1) - (((-1) - i193) & ((-1) - (-1184508283)))) << 1) - (i193 ^ (-1184508283)), objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        int iAlpha = Color.alpha(0);
                                        int i194 = iAlpha * IptcDirectory.TAG_ORIGINAL_TRANSMISSION_REFERENCE;
                                        int i195 = ((i194 | 20229) << 1) - (i194 ^ 20229);
                                        int i196 = ~iAlpha;
                                        int i197 = ~((i196 - 33) - ((-33) & i196));
                                        int i198 = ((i197 + i2) - (i197 | i2)) | (i2 ^ i197);
                                        int i199 = 32 ^ iAlpha;
                                        int i200 = 32 & iAlpha;
                                        int i201 = ~((i200 + i199) - (i200 & i199));
                                        int i202 = -(-(((i198 + i201) - (i198 & i201)) * 614));
                                        int i203 = (i195 ^ i202) + (((-1) - (((-1) - i195) | ((-1) - i202))) << 1);
                                        int i204 = ~(i196 | i85);
                                        int i205 = ~((-1) - (((-1) - (~iAlpha)) & ((-1) - (-33))));
                                        int i206 = (i204 & i205) | (i204 ^ i205);
                                        int i207 = i85 ^ (-33);
                                        int i208 = (-1) - (((-1) - i85) | ((-1) - (-33)));
                                        int i209 = ~((i207 + i208) - (i207 & i208));
                                        int i210 = -(-((((i206 + i209) - (i206 | i209)) | (i206 ^ i209)) * (-1228)));
                                        int i211 = (i203 ^ i210) + (((i210 + i203) - (i210 | i203)) << 1);
                                        int i212 = i196 ^ 32;
                                        int i213 = (i196 + 32) - (i196 | 32);
                                        int i214 = (i213 + i212) - (i213 & i212);
                                        int i215 = i214 ^ i152;
                                        int i216 = (i214 + i152) - (i214 | i152);
                                        int i217 = ~((i216 + i215) - (i216 & i215));
                                        int i218 = (-1) - (((-1) - ((-1) - (((-1) - iAlpha) | ((-1) - i85)))) & ((-1) - (i85 ^ iAlpha)));
                                        int i219 = ~((i218 & (-33)) | (i218 ^ (-33)));
                                        short s6 = (short) (i211 + (((i217 + i219) - (i217 & i219)) * 614));
                                        int i220 = -(-Color.blue(0));
                                        int i221 = (((-1) - (((-1) - i220) & ((-1) - (-29)))) << 1) - (i220 ^ (-29));
                                        int i222 = -Color.alpha(0);
                                        byte b6 = (byte) ((((i222 - 10) - ((-10) & i222)) << 1) - (i222 ^ (-10)));
                                        int i223 = -View.MeasureSpec.getSize(0);
                                        int iMyTid = Process.myTid();
                                        int i224 = ~((i223 ^ iMyTid) | (i223 & iMyTid));
                                        int i225 = ((i223 * 673) - 1189626182) + (((-1) - (((-1) - (i224 ^ (-1016090822))) & ((-1) - ((-1) - (((-1) - i224) | ((-1) - (-1016090822))))))) * 672);
                                        int i226 = ~i223;
                                        int i227 = ~iMyTid;
                                        int i228 = ~(i226 | i227);
                                        int i229 = ~((-1) - (((-1) - (iMyTid ^ (-1016090822))) & ((-1) - (iMyTid & (-1016090822)))));
                                        int i230 = i225 + (((i228 ^ i229) | (i229 & i228)) * (-672)) + (((~((-1) - (((-1) - i227) & ((-1) - 1016090821)))) | (~((-1) - (((-1) - ((-1) - (((-1) - i223) | ((-1) - 1016090821)))) & ((-1) - (1016090821 ^ i223)))))) * 672);
                                        int i231 = -ExpandableListView.getPackedPositionChild(0L);
                                        int i232 = f19594e * (-193408334);
                                        f19594e = i232;
                                        int i233 = i231 * (-167);
                                        int i234 = (i233 ^ 244386977) + ((i233 & 244386977) << 1);
                                        int i235 = ~i231;
                                        int i236 = i235 ^ 1184508278;
                                        int i237 = 1184508278 & i235;
                                        int i238 = ~((i236 + i237) - (i236 & i237));
                                        int i239 = ~i232;
                                        int i240 = i234 + (((~((-1) - (((-1) - (1184508278 ^ i239)) & ((-1) - ((1184508278 + i239) - (1184508278 | i239)))))) | i238) * 168);
                                        int i241 = ~i231;
                                        int i242 = (-1) - (((-1) - 1184508278) & ((-1) - i241));
                                        int i243 = (i240 - (~(-(-((~((-1) - (((-1) - (i242 ^ i232)) & ((-1) - ((i242 + i232) - (i242 | i232)))))) * 168))))) - 1;
                                        int i244 = ~i232;
                                        int i245 = i235 ^ i244;
                                        int i246 = (i235 + i244) - (i235 | i244);
                                        int i247 = ~((i245 + i246) - (i245 & i246));
                                        int i248 = ~((i241 ^ (-1184508279)) | ((i241 - 1184508279) - (i241 | (-1184508279))));
                                        int i249 = (-1) - (((-1) - (i248 & i247)) & ((-1) - (i247 ^ i248)));
                                        int i250 = ((1184508278 + i231) - (1184508278 | i231)) | (1184508278 ^ i231);
                                        int i251 = i250 ^ i232;
                                        int i252 = (i250 + i232) - (i250 | i232);
                                        int i253 = ~((i252 + i251) - (i252 & i251));
                                        int i254 = -(-(((-1) - (((-1) - (i253 & i249)) & ((-1) - (i249 ^ i253)))) * 168));
                                        int i255 = (i243 ^ i254) + (((i243 + i254) - (i243 | i254)) << 1);
                                        Object[] objArr22 = new Object[1];
                                        q(s6, i221, b6, i230, i255, objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        int i256 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        int i257 = (((i256 + 12) - (12 & i256)) << 1) - (i256 ^ 12);
                                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                        int i258 = f19599j * 1918088106;
                                        f19599j = i258;
                                        int i259 = absoluteGravity * (-433);
                                        int i260 = ((i259 - 60696) - (i259 | (-60696))) + ((-1) - (((-1) - i259) & ((-1) - (-60696))));
                                        int i261 = ~absoluteGravity;
                                        int i262 = ~i258;
                                        int i263 = ~((-1) - (((-1) - ((i262 + i261) - (i262 | i261))) & ((-1) - (i261 ^ i262))));
                                        int i264 = ~((-1) - (((-1) - (-282)) & ((-1) - i258)));
                                        int i265 = ((i264 + i263) - (i264 & i263)) * 217;
                                        int i266 = ((i260 + i265) - (i260 | i265)) + (i265 | i260);
                                        int i267 = ~((i261 ^ (-282)) | ((-282) & i261));
                                        int i268 = ~((-1) - (((-1) - i261) & ((-1) - i258)));
                                        int i269 = i267 ^ i268;
                                        int i270 = (i267 + i268) - (i267 | i268);
                                        int i271 = ((i270 + i269) - (i270 & i269)) * 217;
                                        int i272 = ((-1) - (((-1) - i266) | ((-1) - i271))) + ((i271 + i266) - (i271 & i266));
                                        int i273 = ~i258;
                                        int i274 = ~((-1) - (((-1) - ((-1) - (((-1) - i273) | ((-1) - (-282))))) & ((-1) - ((-282) ^ i273))));
                                        int i275 = absoluteGravity ^ i274;
                                        int i276 = i274 & absoluteGravity;
                                        int i277 = i272 + (((i276 + i275) - (i276 & i275)) * 217);
                                        int i278 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        int i279 = f19598i * (-1642242111);
                                        f19598i = i279;
                                        int i280 = (i278 * (-813)) + LeicaMakernoteDirectory.TAG_CCD_VERSION;
                                        int i281 = ~((((-3) + i278) - ((-3) | i278)) | ((-3) ^ i278));
                                        int i282 = (-1) - (((-1) - (i278 ^ i279)) & ((-1) - ((i278 + i279) - (i278 | i279))));
                                        int i283 = ~i282;
                                        int i284 = ((i281 + i283) - (i281 & i283)) * (-814);
                                        int i285 = (i280 ^ i284) + ((i280 & i284) << 1);
                                        int i286 = ~i279;
                                        int i287 = ~((-1) - (((-1) - ((-1) - (((-1) - i286) | ((-1) - (-3))))) & ((-1) - ((-3) ^ i286))));
                                        int i288 = ~i278;
                                        int i289 = ~((i288 ^ 2) | ((i288 + 2) - (2 | i288)));
                                        int i290 = (i287 + i289) - (i287 & i289);
                                        int i291 = ~i282;
                                        int i292 = -(-(((-1) - (((-1) - (i290 & i291)) & ((-1) - (i290 ^ i291)))) * HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED));
                                        int i293 = (i285 ^ i292) + ((i292 & i285) << 1);
                                        int i294 = ~i278;
                                        int i295 = ~((-1) - (((-1) - ((-1) - (((-1) - i294) | ((-1) - 2)))) & ((-1) - (i294 ^ 2))));
                                        int i296 = i288 ^ i279;
                                        int i297 = i288 & i279;
                                        int i298 = ~((i296 + i297) - (i296 & i297));
                                        int i299 = ((i295 + i298) - (i295 | i298)) | (i295 ^ i298);
                                        int i300 = i279 ^ 2;
                                        int i301 = (-1) - (((-1) - i279) | ((-1) - 2));
                                        int i302 = (i299 | (~((i301 + i300) - (i301 & i300)))) * HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED;
                                        Object[] objArr23 = new Object[1];
                                        p(i257, i277, (((i293 + i302) - (i293 & i302)) << 1) - (i302 ^ i293), false, "\u0007￼\ufffe\u0000\ufffe\r￢\u0007\f\r\ufffa", objArr23);
                                        Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                        try {
                                            int i303 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            int i304 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 30;
                                            int offsetAfter = TextUtils.getOffsetAfter("", 0);
                                            Object[] objArr24 = new Object[1];
                                            q((short) ((i303 & 58) + ((i303 + 58) - (i303 & 58))), i304, (byte) ((((-1) - (((-1) - offsetAfter) & ((-1) - 100))) << 1) - (offsetAfter ^ 100)), KeyEvent.getDeadChar(0, 0) - 1016090831, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1184508242, objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            int i305 = -MotionEvent.axisFromString("");
                                            int i306 = ((i305 + 10) - (10 | i305)) + ((-1) - (((-1) - i305) & ((-1) - 10)));
                                            int i307 = 280 - (~(-ExpandableListView.getPackedPositionType(0L)));
                                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
                                            Object[] objArr25 = new Object[1];
                                            p(i306, i307, ((absoluteGravity2 + 10) - (10 | absoluteGravity2)) + ((-1) - (((-1) - absoluteGravity2) & ((-1) - 10))), false, "\bￛ\u0012\r\ufffeￚ\u000b\u000b\ufffa\u0012\r", objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                short sMakeMeasureSpec = (short) ((-33) - View.MeasureSpec.makeMeasureSpec(0, 0));
                                                int i308 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                int i309 = ~i308;
                                                int i310 = ~((i309 + 28) - (i309 & 28));
                                                int i311 = ~((28 ^ i2) | ((28 + i2) - (28 | i2)));
                                                int i312 = (-1) - (((-1) - (i310 & i311)) & ((-1) - (i310 ^ i311)));
                                                int i313 = ~((i85 ^ i308) | ((i85 + i308) - (i85 | i308)) | (-29));
                                                int i314 = (((i308 * 1773) + 25665) - (~(-(-((((i312 + i313) - (i312 | i313)) | (i312 ^ i313)) * 886))))) - 1;
                                                int i315 = ~((i85 ^ (-29)) | ((-29) & i85));
                                                int i316 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i315) | ((-1) - i308)))) & ((-1) - (i308 ^ i315)))) * (-1772)));
                                                int i317 = (i314 ^ i316) + (((i314 + i316) - (i314 | i316)) << 1);
                                                int i318 = i85 ^ i308;
                                                int i319 = i308 & i85;
                                                int i320 = -(-((~((i319 + i318) - (i319 & i318))) * 886));
                                                int i321 = (i317 ^ i320) + (((-1) - (((-1) - i320) | ((-1) - i317))) << 1);
                                                byte bGreen = (byte) ((-10) - Color.green(0));
                                                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                int id2 = (int) Thread.currentThread().getId();
                                                int i322 = (keyRepeatTimeout * 495) - 1578398386;
                                                int i323 = -(-((1016090821 | keyRepeatTimeout) * (-988)));
                                                int i324 = (((-1) - (((-1) - i322) & ((-1) - i323))) << 1) - (i322 ^ i323);
                                                int i325 = ~keyRepeatTimeout;
                                                int i326 = ~id2;
                                                int i327 = i324 + (((-1) - (((-1) - ((i325 ^ (-1016090822)) | ((-1) - (((-1) - i325) | ((-1) - (-1016090822)))))) & ((-1) - i326))) * 494);
                                                int i328 = ~keyRepeatTimeout;
                                                int i329 = ~((i328 ^ 1016090821) | (i328 & 1016090821));
                                                int i330 = i326 ^ (-1016090822);
                                                int i331 = i326 & (-1016090822);
                                                int i332 = ~((i330 + i331) - (i330 & i331));
                                                int i333 = (-1) - (((-1) - (i329 ^ i332)) & ((-1) - ((i332 + i329) - (i332 | i329))));
                                                int i334 = keyRepeatTimeout ^ (-1016090822);
                                                int i335 = keyRepeatTimeout & (-1016090822);
                                                int i336 = ~((i335 + i334) - (i335 & i334));
                                                int i337 = i333 ^ i336;
                                                int i338 = (i336 + i333) - (i336 | i333);
                                                int i339 = ((i338 + i337) - (i338 & i337)) * 494;
                                                int i340 = (i327 ^ i339) + ((i339 & i327) << 1);
                                                int i341 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                int i342 = (i341 ^ (-1184508278)) + ((i341 & (-1184508278)) << 1);
                                                Object[] objArr27 = new Object[1];
                                                q(sMakeMeasureSpec, i321, bGreen, i340, i342, objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                int i343 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                int i344 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                int i345 = ((-1) - (((-1) - i344) | ((-1) - (-29)))) + ((-1) - (((-1) - i344) & ((-1) - (-29))));
                                                int i346 = -Color.red(0);
                                                int i347 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0);
                                                Object[] objArr28 = new Object[1];
                                                q((short) (((-1) - (((-1) - i343) | ((-1) - 86))) + (i343 | 86)), i345, (byte) (((i346 + 61) - (61 | i346)) + ((i346 + 61) - (i346 & 61))), (i347 ^ (-1016090826)) + (((-1) - (((-1) - i347) | ((-1) - (-1016090826)))) << 1), ((iIndexOf5 | (-1184508212)) << 1) - ((-1184508212) ^ iIndexOf5), objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                int i348 = 0;
                                                for (int i349 = 2; i348 < i349; i349 = 2) {
                                                    Object obj2 = objArr3[i348];
                                                    try {
                                                        int threadPriority2 = Process.getThreadPriority(0);
                                                        int priority = Thread.currentThread().getPriority();
                                                        int i350 = 5680 + (threadPriority2 * (-282));
                                                        int i351 = (-21) ^ threadPriority2;
                                                        int i352 = (-1) - (((-1) - (-21)) | ((-1) - threadPriority2));
                                                        int i353 = ~((i351 + i352) - (i351 & i352));
                                                        int i354 = ~((-1) - (((-1) - ((-1) - (((-1) - (-21)) | ((-1) - priority)))) & ((-1) - ((-21) ^ priority))));
                                                        int i355 = ((i354 + i353) - (i354 & i353)) * (-283);
                                                        int i356 = ((((i350 + i355) - (i350 | i355)) + ((-1) - (((-1) - i355) & ((-1) - i350)))) - (~(-(-((~((-1) - (((-1) - (~threadPriority2)) & ((-1) - 20)))) * 283))))) - 1;
                                                        int i357 = ~threadPriority2;
                                                        int i358 = (~((-1) - (((-1) - priority) & ((-1) - ((i357 & (-21)) | ((-21) ^ i357)))))) * 283;
                                                        int i359 = -(((i356 & i358) + ((-1) - (((-1) - i358) & ((-1) - i356)))) >> 6);
                                                        short s7 = (short) (((-1) - (((-1) - i359) | ((-1) - (-7)))) + ((-1) - (((-1) - i359) & ((-1) - (-7)))));
                                                        int i360 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                        int i361 = (((i360 - 29) - ((-29) & i360)) << 1) - (i360 ^ (-29));
                                                        int i362 = -Color.argb(0, 0, 0, 0);
                                                        byte b7 = (byte) (((-91) & i362) + ((-1) - (((-1) - i362) & ((-1) - (-91)))));
                                                        int i363 = -(-TextUtils.getOffsetBefore("", 0));
                                                        int i364 = (i363 ^ (-1016090822)) + (((i363 - 1016090822) - (i363 | (-1016090822))) << 1);
                                                        int i365 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                        int iMyTid2 = Process.myTid();
                                                        int i366 = i365 * (-751);
                                                        int i367 = (((-1) - (((-1) - i366) & ((-1) - 507422671))) << 1) - (i366 ^ 507422671);
                                                        int i368 = ~i365;
                                                        int i369 = ~((-1) - (((-1) - (i368 ^ 1184508192)) & ((-1) - ((i368 + 1184508192) - (1184508192 | i368)))));
                                                        int i370 = ~i365;
                                                        int i371 = ~((i370 ^ iMyTid2) | (i370 & iMyTid2));
                                                        int i372 = (i367 - (~(-(-(((-1) - (((-1) - (i369 ^ i371)) & ((-1) - ((-1) - (((-1) - i371) | ((-1) - i369)))))) * 1504))))) - 1;
                                                        int i373 = i368 ^ (-1184508193);
                                                        int i374 = (i368 - 1184508193) - (i368 | (-1184508193));
                                                        int i375 = (i373 + i374) - (i373 & i374);
                                                        int i376 = (i372 - (~((~((-1) - (((-1) - ((-1) - (((-1) - i375) | ((-1) - iMyTid2)))) & ((-1) - (i375 ^ iMyTid2))))) * (-1504)))) - 1;
                                                        int i377 = i370 ^ (-1184508193);
                                                        int i378 = (-1) - (((-1) - (-1184508193)) | ((-1) - i370));
                                                        int i379 = ~((i378 + i377) - (i378 & i377));
                                                        int i380 = ~(((-1) - (((-1) - i365) | ((-1) - 1184508192))) | (1184508192 ^ i365));
                                                        int i381 = (i376 - (~(-(-(((-1) - (((-1) - ((-1) - (((-1) - i380) | ((-1) - i379)))) & ((-1) - (i379 ^ i380)))) * 752))))) - 1;
                                                        Object[] objArr29 = new Object[1];
                                                        q(s7, i361, b7, i364, i381, objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int i382 = 22 - (~Color.red(0));
                                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                                                        int i383 = ~iLastIndexOf;
                                                        int i384 = i383 ^ (-275);
                                                        int i385 = (i383 - 275) - ((-275) | i383);
                                                        int i386 = ~((i384 + i385) - (i384 & i385));
                                                        int i387 = ~((-1) - (((-1) - i383) & ((-1) - i85)));
                                                        int i388 = ((-1) - (((-1) - i387) | ((-1) - i386))) | (i386 ^ i387);
                                                        int i389 = (-275) ^ i152;
                                                        int i390 = ((-275) + i152) - ((-275) | i152);
                                                        int i391 = ~((i390 + i389) - (i390 & i389));
                                                        int i392 = i388 ^ i391;
                                                        int i393 = i388 & i391;
                                                        int i394 = (i393 + i392) - (i393 & i392);
                                                        int i395 = (iLastIndexOf ^ 274) | ((iLastIndexOf + 274) - (274 | iLastIndexOf));
                                                        int i396 = i395 ^ i2;
                                                        int i397 = i395 & i2;
                                                        int i398 = ~((i396 + i397) - (i396 & i397));
                                                        int i399 = i394 ^ i398;
                                                        int i400 = (i394 + i398) - (i394 | i398);
                                                        int i401 = (iLastIndexOf * 85) + 23290 + (((i400 + i399) - (i400 & i399)) * (-84));
                                                        int i402 = (-275) ^ i2;
                                                        int i403 = (-1) - (((-1) - (-275)) | ((-1) - i2));
                                                        int i404 = ~((i403 + i402) - (i403 & i402));
                                                        int i405 = iLastIndexOf ^ i404;
                                                        int i406 = (iLastIndexOf + i404) - (iLastIndexOf | i404);
                                                        int i407 = (i406 + i405) - (i406 & i405);
                                                        int i408 = ~((-1) - (((-1) - (i85 ^ 274)) & ((-1) - (i85 & 274))));
                                                        int i409 = i407 ^ i408;
                                                        int i410 = i407 & i408;
                                                        int i411 = (i401 - (~(-(-(((i410 + i409) - (i410 & i409)) * (-84)))))) - 1;
                                                        int i412 = i152 ^ 274;
                                                        int i413 = i152 & 274;
                                                        Object[] objArr30 = new Object[1];
                                                        p(i382, i411 + (((~((i412 + i413) - (i412 & i413))) | (~i395)) * 84), 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, "\uffd1\ufff1\u0013\n\u000f\u0004\n\u0011\u0002\r\b\u0006\u0015\ufff4\u0016\u0003\u000b\u0006\u0004\u0015\ufff9ￖ\uffd1", objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            int i414 = (i2 - 2) - ((-2) | i2);
                                                            int i415 = (-1) - (((-1) - i85) | ((-1) - 1));
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{(i414 + i415) - (i414 & i415)}};
                                                            int iMyPid = Process.myPid();
                                                            int i416 = ~iMyPid;
                                                            int i417 = ~((-533429399) | i416);
                                                            int i418 = ~((-144718624) | iMyPid);
                                                            int i419 = 682622471 + (((i417 + i418) - (i417 & i418)) * 1900) + (((-1) - (((-1) - (~((-1) - (((-1) - i416) & ((-1) - 144718623))))) & ((-1) - (~(iMyPid | 533429398))))) * (-950)) + (((~((iMyPid + 144718623) - (iMyPid & 144718623))) | (~((-1) - (((-1) - i416) & ((-1) - 533429398))))) * 950);
                                                            int i420 = (((-1) - (((-1) - i419) & ((-1) - 16))) << 1) - (i419 ^ 16);
                                                            int i421 = ((i3 + i420) - (i3 | i420)) + ((-1) - (((-1) - i3) & ((-1) - i420)));
                                                            int i422 = i421 << 13;
                                                            int i423 = ((i422 + i421) - (i422 & i421)) & (~(i421 & i422));
                                                            int i424 = i423 >>> 17;
                                                            int i425 = ~((-1) - (((-1) - i423) | ((-1) - i424)));
                                                            int i426 = (-1) - (((-1) - i423) & ((-1) - i424));
                                                            int i427 = (i426 + i425) - (i426 | i425);
                                                            ((int[]) objArr31[0])[0] = i427 ^ (i427 << 5);
                                                            return objArr31;
                                                        }
                                                        i348++;
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i174 = (i174 ^ 1) + (((-1) - (((-1) - i174) | ((-1) - 1))) << 1);
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
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int i428 = ~iElapsedRealtime2;
        int i429 = i3 + 421382461 + (((-1) - (((-1) - (~((338376278 + i428) - (338376278 & i428)))) & ((-1) - 4227337))) * 184) + (((iElapsedRealtime2 + 2831872) - (iElapsedRealtime2 & 2831872)) * (-184)) + ((~((-1) - (((-1) - (-339771744)) & ((-1) - i428)))) * 184);
        int i430 = i429 << 13;
        int i431 = (i429 | i430) & (~((-1) - (((-1) - i429) | ((-1) - i430))));
        int i432 = i431 ^ (i431 >>> 17);
        int i433 = i432 << 5;
        int i434 = (~i433) & i432;
        int i435 = (-1) - (((-1) - (~i432)) | ((-1) - i433));
        ((int[]) objArr32[0])[0] = (i435 + i434) - (i435 & i434);
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{37, 121, MessagePack.Code.MAP32, 74};
        $$b = 238;
    }

    private static void p(int i2, int i3, int i4, boolean z2, String str, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10;
        int i7 = i6 + 17;
        $11 = i7 % 128;
        Object charArray = str2;
        if (i7 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            int i8 = i6 + 35;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f19597h)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(270 - View.MeasureSpec.getSize(0), (char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.indexOf("", "", 0) + 11, -2071844881, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 29))), b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(522 - Color.argb(0, 0, 0, 0), (char) View.getDefaultSize(0, 0), Color.argb(0, 0, 0, 0) + 12, 627984172, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 27))), b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i11 = $11 + 79;
                $10 = i11 % 128;
                int i12 = i11 % 2;
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
            int i13 = $10 + 43;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i15 = $10 + 13;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr4[nVar.f19944a] = cArr2[(i2 << nVar.f19944a) << 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 521, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12, 627984172, false, $$c((byte) ($$b & 27), b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a(522 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getScrollBarSize() >> 8), 627984172, false, $$c((byte) ($$b & 27), b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void q(short s2, int i2, byte b2, int i3, int i4, Object[] objArr) throws Throwable {
        long j2;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(f19595f)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 1;
                byte b4 = (byte) (b3 - 1);
                objA = o.d.d.a(238 - (Process.myPid() >> 22), (char) (44531 - TextUtils.getTrimmedLength("")), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, 35969549, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i8 = iIntValue == -1 ? 1 : 0;
            long j3 = 0;
            if (i8 == 0) {
                j2 = -7649639543924978291L;
            } else {
                byte[] bArr2 = f19601l;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $11 + 5;
                        $10 = i10 % 128;
                        if (i10 % i6 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - Gravity.getAbsoluteGravity(0, 0)), ExpandableListView.getPackedPositionType(j3) + 11, 1621469864, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr3[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i9])};
                            Object objA3 = o.d.d.a(-1239398195);
                            if (objA3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objA3 = o.d.d.a(628 - TextUtils.getCapsMode("", 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28648), 11 - TextUtils.getTrimmedLength(""), 1621469864, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE});
                            }
                            bArr3[i9] = ((Byte) ((Method) objA3).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i6 = 2;
                        j3 = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = f19601l;
                    Object[] objArr5 = {Integer.valueOf(i4), Integer.valueOf(f19596g)};
                    Object objA4 = o.d.d.a(-727631768);
                    if (objA4 == null) {
                        byte b9 = (byte) 1;
                        byte b10 = (byte) (b9 - 1);
                        objA4 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 239, (char) (44530 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 11, 35969549, false, $$c(b9, b10, b10), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f19595f) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f19604o[i4 + ((int) (((long) f19596g) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f19595f) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i4 + iIntValue) - 2) + ((int) (((long) f19596g) ^ j2)) + i8;
                Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f19602m), sb};
                Object objA5 = o.d.d.a(1819197256);
                if (objA5 == null) {
                    objA5 = o.d.d.a(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (5359 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 11 - Gravity.getAbsoluteGravity(0, 0), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr5 = f19601l;
                if (bArr5 != null) {
                    int i11 = $11 + 101;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr[i5] = (byte) (((long) bArr5[i5]) ^ (-7649639543924978291L));
                        i5++;
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = f19601l;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f19604o;
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

    protected o.x.f buildProcessCallback(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f19603n + 85;
            f19600k = i3 % 128;
            int i4 = i3 % 2;
            f.d("AbsSecureDisplay", "InnerCustomerAuthenticatedProcessCallback - Not supported : Feature SCA Disabled");
        }
        int i5 = f19600k + 49;
        f19603n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public List<CustomerAuthenticationMethodType> getAuthenticatedMethods() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19603n + 117;
        f19600k = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f19600k + 117;
            f19603n = i5 % 128;
            int i6 = i5 % 2;
            f.d("AbsSecureDisplay", "getAuthenticatedMethods - Not supported : Feature SCA Disabled");
        }
        int i7 = f19600k + 125;
        f19603n = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    @Deprecated
    public String getAuthenticationPatternName() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19600k + 95;
        f19603n = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            f.d("AbsSecureDisplay", "getAuthenticationPatternName - Not supported : Feature SCA Disabled");
        }
        int i4 = f19603n + 33;
        f19600k = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public String getCustomerAuthenticationPatternName() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19603n + 117;
        f19600k = i3 % 128;
        int i4 = i3 % 2;
        if (!f.a()) {
            return "";
        }
        int i5 = f19600k + 17;
        f19603n = i5 % 128;
        if (i5 % 2 == 0) {
            f.d("AbsSecureDisplay", "getCustomerAuthenticationPatternName - Not supported : Feature SCA Disabled");
            return "";
        }
        f.d("AbsSecureDisplay", "getCustomerAuthenticationPatternName - Not supported : Feature SCA Disabled");
        int i6 = 38 / 0;
        return "";
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public String getMessage() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19600k + 63;
        f19603n = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f19603n + 45;
            f19600k = i5 % 128;
            if (i5 % 2 == 0) {
                f.d("AbsSecureDisplay", "getMessage - Not supported : Feature SCA Disabled");
                int i6 = 79 / 0;
            } else {
                f.d("AbsSecureDisplay", "getMessage - Not supported : Feature SCA Disabled");
            }
        }
        int i7 = f19600k + 97;
        f19603n = i7 % 128;
        if (i7 % 2 == 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19603n + 51;
        f19600k = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
            if (!f.a()) {
                return;
            }
        } else if (!f.a()) {
            return;
        }
        int i5 = f19603n + 113;
        f19600k = i5 % 128;
        if (i5 % 2 != 0) {
            f.d("AbsSecureDisplay", "setCustomerCredentials - Not supported : Feature SCA Disabled");
        } else {
            f.d("AbsSecureDisplay", "setCustomerCredentials - Not supported : Feature SCA Disabled");
            int i6 = 19 / 0;
        }
    }
}
