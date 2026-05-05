package fr.antelop.sdk.card;

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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import o.a.g;
import o.a.n;
import o.d.d;
import o.ep.e;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class EcomStaticTokenDisplay implements ICardDisplay {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f18934a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f18935b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f18936c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f18937d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f18938e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f18939f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18940g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f18941h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f18942i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f18943j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f18944k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f18945l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f18946m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char f18947n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f18948o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f18949p = 0;
    private final e innerEcomStaticToken;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            int r0 = r7 * 4
            int r7 = r0 + 4
            int r2 = 115 - r6
            byte[] r6 = fr.antelop.sdk.card.EcomStaticTokenDisplay.$$a
            int r5 = r8 * 3
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r6 != 0) goto L27
            r2 = r7
            r0 = r5
            r1 = r3
        L14:
            int r7 = r7 + 1
            int r2 = r2 + r0
        L17:
            byte r0 = (byte) r2
            r4[r1] = r0
            if (r1 != r5) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            r0 = r6[r7]
            int r1 = r1 + 1
            goto L14
        L27:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.EcomStaticTokenDisplay.$$c(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18949p = 432796035;
        f18940g = 840679107;
        f18942i = 2022650906;
        f18941h = 525041707;
        f18938e = -230927522;
        f18935b = -534383999;
        f18937d = -1836170826;
        f18934a = 1819606595;
        f18936c = 1752705414;
        f18945l = 0;
        f18946m = 1;
        f18939f = (char) 50806;
        f18943j = (char) 11123;
        f18947n = (char) 53275;
        f18948o = (char) 11023;
        f18944k = -1270219501;
    }

    public EcomStaticTokenDisplay(e eVar) {
        this.innerEcomStaticToken = eVar;
    }

    public static Object[] b(Context context, int i2, int i3) {
        int i4 = 0;
        int i5 = 1;
        if (context == null) {
            int[] iArr = new int[1];
            Object[] objArr = {iArr, new int[]{i2}, null, new int[]{i2}};
            int i6 = f18949p * 723597476;
            f18949p = i6;
            int i7 = ~(((-254208829) + i6) - ((-254208829) & i6));
            int i8 = ~i6;
            int i9 = (((i7 + 375531333) - (i7 & 375531333)) * 262) + 480144681 + (((~((i8 - 254208829) - (i8 & (-254208829)))) | 375531333) * 262);
            int i10 = (i9 << 1) - i9;
            int i11 = i10 * 569;
            int i12 = i3 * 569;
            int i13 = (i11 & i12) + (i11 | i12);
            int i14 = ~i10;
            int i15 = ~i3;
            int i16 = i14 ^ i15;
            int i17 = (i14 + i15) - (i14 | i15);
            int i18 = ~((i16 + i17) - (i16 & i17));
            int i19 = ~i2;
            int i20 = i14 ^ i19;
            int i21 = (i14 + i19) - (i14 | i19);
            int i22 = ~((i20 + i21) - (i20 & i21));
            int i23 = i18 ^ i22;
            int i24 = (-1) - (((-1) - i18) | ((-1) - i22));
            int i25 = (i24 + i23) - (i24 & i23);
            int i26 = i15 ^ i19;
            int i27 = i15 & i19;
            int i28 = ~((i26 + i27) - (i26 & i27));
            int i29 = ((-1) - (((-1) - ((-1) - (((-1) - i25) | ((-1) - i28)))) & ((-1) - (i25 ^ i28)))) * (-1136);
            int i30 = (((i13 + i29) - (i13 & i29)) << 1) - (i13 ^ i29);
            int i31 = ~((-1) - (((-1) - (i14 & i2)) & ((-1) - (i14 ^ i2))));
            int i32 = ~i3;
            int i33 = ~((i32 + i2) - (i32 & i2));
            int i34 = i31 ^ i33;
            int i35 = i31 & i33;
            int i36 = (i35 + i34) - (i35 & i34);
            int i37 = ~i2;
            int i38 = ((-1) - (((-1) - i37) | ((-1) - i10))) | (i37 ^ i10);
            int i39 = ~((-1) - (((-1) - (i38 & i3)) & ((-1) - (i38 ^ i3))));
            int i40 = i36 ^ i39;
            int i41 = (i36 + i39) - (i36 | i39);
            int i42 = i30 + (((i41 + i40) - (i41 & i40)) * (-568));
            int i43 = ~((i19 ^ i10) | ((i19 + i10) - (i19 | i10)));
            int i44 = i19 ^ i3;
            int i45 = (i3 + i19) - (i3 | i19);
            int i46 = ~((i45 + i44) - (i45 & i44));
            int i47 = ((-1) - (((-1) - i46) | ((-1) - i43))) | (i43 ^ i46);
            int i48 = ~i10;
            int i49 = i48 ^ i15;
            int i50 = i48 & i15;
            int i51 = (i50 + i49) - (i50 & i49);
            int i52 = i51 ^ i2;
            int i53 = i2 & i51;
            int i54 = ~((i53 + i52) - (i53 & i52));
            int i55 = ((-1) - (((-1) - ((i54 + i47) - (i54 | i47))) & ((-1) - (i47 ^ i54)))) * 568;
            int i56 = (i42 ^ i55) + (((-1) - (((-1) - i55) | ((-1) - i42))) << 1);
            int i57 = i56 << 13;
            int i58 = (-1) - (((-1) - ((-1) - (((-1) - i57) & ((-1) - i56)))) | ((-1) - (~((-1) - (((-1) - i56) | ((-1) - i57))))));
            int i59 = i58 ^ (i58 >>> 17);
            int i60 = i59 << 5;
            int i61 = ~i60;
            iArr[0] = (-1) - (((-1) - ((~i59) & i60)) & ((-1) - ((i61 + i59) - (i61 | i59))));
            return objArr;
        }
        try {
            int i62 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
            int i63 = i62 * 673;
            int i64 = (i63 & (-51034)) + ((i63 - 51034) - (i63 & (-51034)));
            int i65 = i62 ^ i2;
            int i66 = i62 & i2;
            int i67 = ~((i65 + i66) - (i65 & i66));
            int i68 = i67 ^ 38;
            int i69 = (-1) - (((-1) - i67) | ((-1) - 38));
            int i70 = i64 + (((i69 + i68) - (i69 & i68)) * 672);
            int i71 = ~i62;
            int i72 = ~i2;
            int i73 = ~((-1) - (((-1) - (i71 & i72)) & ((-1) - (i71 ^ i72))));
            int i74 = ~((-1) - (((-1) - (i2 ^ 38)) & ((-1) - ((i2 + 38) - (38 | i2)))));
            int i75 = i73 ^ i74;
            int i76 = (i73 + i74) - (i73 | i74);
            int i77 = (i70 - (~(-(-(((i75 + i76) - (i75 & i76)) * (-672)))))) - 1;
            int i78 = ~((-39) | i72);
            int i79 = (-39) ^ i62;
            int i80 = (-1) - (((-1) - i62) | ((-1) - (-39)));
            int i81 = ~((i79 + i80) - (i79 & i80));
            Object[] objArr2 = new Object[1];
            q("欳\udfc1꽐椴냊勚帤\ue75c蒦曯⿎ꓝ㫻쒀ୟ蟎\uef08듟鶺澹姜Ⅵִ３ꁏắ\uda8f\u0ace쳭﹙⿎ꓝ핱훰ﲛⅮ\uf6cd頓", i77 + ((((i81 + i78) - (i81 | i78)) | (i78 ^ i81)) * 672), objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            int iGreen = Color.green(0);
            Object[] objArr4 = new Object[1];
            q("넏隞桓㖺৸֡艞뼌砃≞氋묄❔삭䘊楇즣佹桓㖺৸֡艞뼌砃≞㯚旛翟뗢枧쌗", (iGreen ^ 31) + ((iGreen & 31) << 1), objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                Object[] objArr6 = new Object[1];
                q("欳\udfc1꽐椴냊勚帤\ue75c蒦曯⿎ꓝ㫻쒀ୟ蟎\uef08듟鶺澹姜Ⅵִ３ꁏắ\uda8f\u0ace쳭﹙⿎ꓝ핱훰ﲛⅮ\uf6cd頓", 38 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                int i82 = -View.resolveSize(0, 0);
                int i83 = -(ViewConfiguration.getScrollBarSize() >> 8);
                Object[] objArr7 = new Object[1];
                r((i82 ^ 31) + ((i82 & 31) << 1), (i83 ^ 93) + (((i83 + 93) - (i83 | 93)) << 1), 24 - (~(-(-Color.alpha(0)))), false, "￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮\ufff9￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012￮￨\u0000\ufffeￗ\ufffa", objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    int i84 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                    Object[] objArr9 = new Object[1];
                    q("欳\udfc1꽐椴냊勚帤\ue75c蒦曯⿎ꓝ㫻쒀ୟ蟎\uef08듟鶺澹姜Ⅵִ３ꁏắ\uda8f\u0ace쳭﹙⿎ꓝ핱훰ﲛⅮ\uf6cd頓", (i84 ^ 38) + (((i84 + 38) - (i84 | 38)) << 1), objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        int i85 = -Color.blue(0);
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i86 = i85 * (-919);
                        int i87 = (((i86 - 21137) - ((-21137) & i86)) << 1) - (i86 ^ (-21137));
                        int i88 = ~i85;
                        int i89 = (i88 ^ (-24)) | ((-1) - (((-1) - i88) | ((-1) - (-24))));
                        int i90 = i89 ^ iFreeMemory;
                        int i91 = (i89 + iFreeMemory) - (i89 | iFreeMemory);
                        int i92 = ~((i90 + i91) - (i90 & i91));
                        int i93 = ~iFreeMemory;
                        int i94 = ~((-1) - (((-1) - (((-24) ^ i93) | ((-24) & i93))) & ((-1) - i85)));
                        int i95 = i92 ^ i94;
                        int i96 = i92 & i94;
                        int i97 = -(-(((i95 + i96) - (i95 & i96)) * 920));
                        int i98 = (i87 ^ i97) + (((i97 + i87) - (i97 | i87)) << 1);
                        int i99 = ~i85;
                        int i100 = -(-(((-1) - (((-1) - (~((-1) - (((-1) - (i88 ^ i93)) & ((-1) - ((-1) - (((-1) - i93) | ((-1) - i88)))))))) & ((-1) - (~((-24) | i99))))) * 920));
                        int i101 = (i98 ^ i100) + (((-1) - (((-1) - i100) | ((-1) - i98))) << 1);
                        int i102 = i99 ^ (-24);
                        int i103 = (-1) - (((-1) - i99) | ((-1) - (-24)));
                        int i104 = (i103 + i102) - (i103 & i102);
                        int i105 = ~iFreeMemory;
                        int i106 = ~((-1) - (((-1) - ((-1) - (((-1) - i104) | ((-1) - i105)))) & ((-1) - (i104 ^ i105))));
                        int i107 = (-1) - (((-1) - (i88 ^ 23)) & ((-1) - ((i88 + 23) - (i88 | 23))));
                        int i108 = ~((-1) - (((-1) - (i107 & iFreeMemory)) & ((-1) - (i107 ^ iFreeMemory))));
                        int i109 = ((i106 + i108) - (i106 | i108)) | (i106 ^ i108);
                        int i110 = ~((-1) - (((-1) - (((-24) + i85) - ((-24) & i85))) & ((-1) - iFreeMemory)));
                        int i111 = ((-1) - (((-1) - ((i110 + i109) - (i110 | i109))) & ((-1) - (i109 ^ i110)))) * 920;
                        int i112 = (i101 ^ i111) + (((i111 + i101) - (i111 | i101)) << 1);
                        int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                        int i113 = scrollDefaultDelay * (-495);
                        int i114 = (i113 & (-53955)) + ((i113 - 53955) - (i113 & (-53955)));
                        int i115 = ~scrollDefaultDelay;
                        int i116 = ~((-1) - (((-1) - (i115 ^ (-110))) & ((-1) - ((-1) - (((-1) - i115) | ((-1) - (-110)))))));
                        int i117 = ~scrollDefaultDelay;
                        int i118 = -(-((i116 | (~((-1) - (((-1) - (i117 ^ i2)) & ((-1) - ((-1) - (((-1) - i117) | ((-1) - i2)))))))) * 992));
                        int i119 = (((-1) - (((-1) - i114) & ((-1) - i118))) << 1) - (i118 ^ i114);
                        int i120 = ~((i117 ^ (-110)) | ((-1) - (((-1) - i117) | ((-1) - (-110)))));
                        int i121 = i115 ^ i2;
                        int i122 = (-1) - (((-1) - i115) | ((-1) - i2));
                        int i123 = ~((i122 + i121) - (i122 & i121));
                        int i124 = (-1) - (((-1) - (i123 & i120)) & ((-1) - (i120 ^ i123)));
                        int i125 = (-1) - (((-1) - ((scrollDefaultDelay + i72) - (scrollDefaultDelay | i72))) & ((-1) - (i72 ^ scrollDefaultDelay)));
                        int i126 = i125 ^ 109;
                        int i127 = (i125 + 109) - (i125 | 109);
                        int i128 = -(-(((-1) - (((-1) - (~((i127 + i126) - (i127 & i126)))) & ((-1) - i124))) * (-496)));
                        int i129 = (i119 ^ i128) + ((i128 & i119) << 1);
                        int i130 = -(-(((-1) - (((-1) - i2) & ((-1) - 109))) * 496));
                        Object[] objArr10 = new Object[1];
                        r(i112, (i129 ^ i130) + (((i130 + i129) - (i130 | i129)) << 1), TextUtils.getOffsetBefore("", 0) + 3, false, "\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f", objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int i131 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr11 = new Object[1];
                        q("ꐭ椦⓪\ud95c֒齇Ｈ⫳ꐭ椦篦㡞⮝쟛ꐭ椦溵这", ((i131 + 17) - (17 | i131)) + ((-1) - (((-1) - i131) & ((-1) - 17))), objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            int i132 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i133 = (((-1) - (((-1) - i132) & ((-1) - 24))) << 1) - (i132 ^ 24);
                            int i134 = 107 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
                            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                            int i135 = ~jumpTapTimeout;
                            int i136 = (((jumpTapTimeout * (-209)) - 627) - (~((~((-1) - (((-1) - (i135 ^ (-4))) & ((-1) - ((i135 - 4) - ((-4) | i135)))))) * Mp4VideoDirectory.TAG_COMPRESSION_TYPE))) - 1;
                            int i137 = ~((-1) - (((-1) - (-4)) & ((-1) - i72)));
                            int i138 = ~((i135 ^ i2) | ((-1) - (((-1) - i135) | ((-1) - i2))));
                            int i139 = -(-(((i137 ^ i138) | ((i138 + i137) - (i138 | i137))) * Mp4VideoDirectory.TAG_COMPRESSION_TYPE));
                            int i140 = ((i136 | i139) << 1) - (i139 ^ i136);
                            int i141 = i135 | i72;
                            int i142 = ~((-1) - (((-1) - (i141 & 3)) & ((-1) - (i141 ^ 3))));
                            int i143 = (jumpTapTimeout - 4) - (jumpTapTimeout & (-4));
                            int i144 = ~(((-1) - (((-1) - i143) | ((-1) - i2))) | (i143 ^ i2));
                            int i145 = (((i144 + i142) - (i144 | i142)) | (i142 ^ i144)) * Mp4VideoDirectory.TAG_COMPRESSION_TYPE;
                            int i146 = ((i140 | i145) << 1) - (i145 ^ i140);
                            Object[] objArr12 = new Object[1];
                            r(i133, i134, i146, false, "\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f", objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            q("ꐭ椦⓪\ud95c֒齇Ｈ⫳ꐭ椦䫬ꁮ궺㊞", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                int i147 = 32 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0))));
                                int i148 = -Process.getGidForName("");
                                Object[] objArr15 = new Object[1];
                                r(i147, (i148 ^ 105) + (((-1) - (((-1) - i148) | ((-1) - 105))) << 1), 14 - (~(-(-Color.green(0)))), false, "ￌ￮\uffff\u0001\t\uffff\u0005\u0003￫\uffff\f\uffff\u0005\u0003\u0010\uffff\f\u0002\u0010\r\u0007\u0002ￌ\u0001\r\f\u0012\u0003\f\u0012ￌ\u000e\u000b", objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int i149 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                Object[] objArr16 = new Object[1];
                                q("ꐭ椦⓪\ud95c֒齇Ｈ⫳ꐭ椦얉醫喧꿹", ((-1) - (((-1) - i149) | ((-1) - 14))) + (i149 | 14), objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                int i150 = (((-1) - (((-1) - maximumFlingVelocity) & ((-1) - 30))) << 1) - (maximumFlingVelocity ^ 30);
                                int i151 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                int i152 = ((i151 | 105) << 1) - (i151 ^ 105);
                                int i153 = -((byte) KeyEvent.getModifierMetaStateMask());
                                int i154 = f18936c * (-1455477210);
                                f18936c = i154;
                                int i155 = (((i153 * 141) - 279) - (~(((i154 ^ 1) | ((-1) - (((-1) - i154) | ((-1) - 1)))) * 140))) - 1;
                                int i156 = ~i153;
                                int i157 = i156 ^ 1;
                                int i158 = (i156 + 1) - (i156 | 1);
                                int i159 = ~((i158 + i157) - (i158 & i157));
                                int i160 = ~i154;
                                int i161 = ~((i160 ^ 1) | (1 & i160));
                                int i162 = i159 ^ i161;
                                int i163 = (-1) - (((-1) - i159) | ((-1) - i161));
                                int i164 = (i155 - (~(((i163 + i162) - (i163 & i162)) * (-280)))) - 1;
                                int i165 = ~(((-2) ^ i153) | (((-2) + i153) - ((-2) | i153)));
                                int i166 = ~((-1) - (((-1) - i160) & ((-1) - i153)));
                                int i167 = -(-(((~(((-1) - (((-1) - (~i153)) & ((-1) - 1))) | i154)) | ((-1) - (((-1) - ((i166 + i165) - (i166 | i165))) & ((-1) - (i165 ^ i166))))) * 140));
                                Object[] objArr17 = new Object[1];
                                r(i150, i152, (i164 ^ i167) + (((i167 + i164) - (i167 | i164)) << 1), false, "\u0005\u000e\u0000\r\u0003\u0011\u000e\b\u0003ￍ\u0002\u000e\r\u0013\u0004\r\u0013ￍ\u000f\fￍ\uffef\u0000\u0002\n\u0000\u0006\u0004￨\r", objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                int i168 = -KeyEvent.getDeadChar(0, 0);
                                int i169 = f18934a * 1855194831;
                                f18934a = i169;
                                int i170 = i168 * 46;
                                int i171 = ((-1) - (((-1) - i170) | ((-1) - 460))) + (i170 | 460);
                                int i172 = ~i169;
                                int i173 = ~((-11) | i172);
                                int i174 = i168 ^ i173;
                                int i175 = i173 & i168;
                                int i176 = -(-(((i174 + i175) - (i174 & i175)) * (-90)));
                                int i177 = ((i171 | i176) << 1) - (i176 ^ i171);
                                int i178 = ~((-1) - (((-1) - ((-11) ^ i169)) & ((-1) - ((-11) & i169))));
                                int i179 = ~((i168 ^ 10) | ((-1) - (((-1) - i168) | ((-1) - 10))));
                                int i180 = (i177 - (~(((-1) - (((-1) - (i178 ^ i179)) & ((-1) - ((i179 + i178) - (i179 | i178))))) * (-45)))) - 1;
                                int i181 = ~i168;
                                int i182 = -(-((((-1) - (((-1) - (-11)) & ((-1) - (~((-1) - (((-1) - ((i181 + i169) - (i181 | i169))) & ((-1) - (i181 ^ i169)))))))) | (~((i168 & i172) | (i172 ^ i168)))) * 45));
                                Object[] objArr18 = new Object[1];
                                q("렌ﶞ꒬婻먢픢硇⍕\ue896陃", (i180 ^ i182) + (((i180 + i182) - (i180 | i182)) << 1), objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                while (i4 < length) {
                                    Object obj = objArr19[i4];
                                    int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                                    int iMyUid = Process.myUid();
                                    int i183 = tapTimeout * (-1975);
                                    int i184 = (((i183 + 4945) - (4945 & i183)) << i5) - (i183 ^ 4945);
                                    int i185 = ~((~tapTimeout) | 5);
                                    int i186 = iMyUid ^ i185;
                                    int i187 = i185 & iMyUid;
                                    int i188 = (i184 - (~(((i186 + i187) - (i186 & i187)) * 988))) - i5;
                                    int i189 = ~(((-6) ^ tapTimeout) | ((-6) & tapTimeout));
                                    int i190 = ~iMyUid;
                                    int i191 = ~((-1) - (((-1) - (i190 ^ tapTimeout)) & ((-1) - ((i190 + tapTimeout) - (i190 | tapTimeout)))));
                                    int i192 = -(-(((-1) - (((-1) - (i189 ^ i191)) & ((-1) - ((-1) - (((-1) - i191) | ((-1) - i189)))))) * (-1976)));
                                    int i193 = (i188 ^ i192) + ((i192 & i188) << i5);
                                    int i194 = ~tapTimeout;
                                    int i195 = ~((-1) - (((-1) - (i194 & 5)) & ((-1) - (i194 ^ 5))));
                                    int i196 = (-6) ^ iMyUid;
                                    int i197 = (-6) & iMyUid;
                                    int i198 = ~((i197 + i196) - (i197 & i196));
                                    int i199 = (-1) - (((-1) - ((i195 + i198) - (i195 | i198))) & ((-1) - (i195 ^ i198)));
                                    int i200 = i190 ^ 5;
                                    int i201 = i190 & 5;
                                    int i202 = ~((i201 + i200) - (i201 & i200));
                                    int i203 = -(-(((-1) - (((-1) - (i199 & i202)) & ((-1) - (i199 ^ i202)))) * 988));
                                    int i204 = (i193 ^ i203) + (((i203 + i193) - (i203 | i193)) << i5);
                                    int i205 = -Color.green(0);
                                    int i206 = f18937d * 976174721;
                                    f18937d = i206;
                                    int i207 = i205 * 217;
                                    int i208 = (((-1) - (((-1) - i207) & ((-1) - (-14190)))) << i5) - (i207 ^ (-14190));
                                    int i209 = (~((i205 ^ i206) | (i205 & i206))) * JfifUtil.MARKER_SOI;
                                    int i210 = (((-1) - (((-1) - i208) & ((-1) - i209))) << i5) - (i209 ^ i208);
                                    int i211 = (i205 ^ (-67)) | ((-1) - (((-1) - i205) | ((-1) - (-67))));
                                    int i212 = ~i206;
                                    int i213 = i211 ^ i212;
                                    int i214 = (i211 + i212) - (i211 | i212);
                                    int i215 = -(-(((i214 + i213) - (i214 & i213)) * (-216)));
                                    int i216 = (i210 ^ i215) + (((-1) - (((-1) - i215) | ((-1) - i210))) << i5);
                                    int i217 = -(-(((~((i205 & i212) | (i212 ^ i205))) | 66) * JfifUtil.MARKER_SOI));
                                    int i218 = (i216 & i217) + (i217 | i216);
                                    int i219 = -(ViewConfiguration.getTapTimeout() >> 16);
                                    int i220 = f18935b * (-1930116556);
                                    f18935b = i220;
                                    int i221 = ~i219;
                                    int i222 = ~((-1) - (((-1) - (i221 ^ 1)) & ((-1) - ((-1) - (((-1) - i221) | ((-1) - 1))))));
                                    int i223 = ~i220;
                                    int i224 = ~((-1) - (((-1) - i223) & ((-1) - i219)));
                                    int i225 = i222 ^ i224;
                                    int i226 = (-1) - (((-1) - i222) | ((-1) - i224));
                                    int i227 = ((i219 * 375) - 747) + (((i225 + i226) - (i225 & i226)) * (-374));
                                    int i228 = (-2) ^ i219;
                                    int i229 = ((-2) + i219) - ((-2) | i219);
                                    int i230 = (~((i228 + i229) - (i228 & i229))) * 748;
                                    int i231 = (i227 ^ i230) + (((-1) - (((-1) - i227) | ((-1) - i230))) << i5);
                                    int i232 = i221 ^ (-2);
                                    int i233 = i221 & (-2);
                                    int i234 = ~((i232 + i233) - (i232 & i233));
                                    int i235 = ~((-1) - (((-1) - (i219 & i223)) & ((-1) - (i223 ^ i219))));
                                    int i236 = i231 + (((-1) - (((-1) - ((-1) - (((-1) - i235) | ((-1) - i234)))) & ((-1) - (i234 ^ i235)))) * 374);
                                    Object[] objArr20 = new Object[i5];
                                    r(i204, i218, i236, true, "\u001e\uffff\ufff6\ufffb\ufff4", objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                        int i237 = f18938e * (-412400920);
                                        f18938e = i237;
                                        int i238 = (pressedStateDuration * (-103)) - 3811;
                                        int i239 = ~pressedStateDuration;
                                        int i240 = ~((-1) - (((-1) - (i239 ^ (-38))) & ((-1) - (i239 & (-38)))));
                                        int i241 = ~((-1) - (((-1) - ((-38) ^ i237)) & ((-1) - (((-38) + i237) - ((-38) | i237)))));
                                        int i242 = ((-1) - (((-1) - (i240 ^ i241)) & ((-1) - ((-1) - (((-1) - i241) | ((-1) - i240)))))) * 104;
                                        int i243 = (i238 ^ i242) + ((i238 & i242) << i5);
                                        int i244 = ~i237;
                                        int i245 = ((-1) - (((-1) - i244) | ((-1) - pressedStateDuration))) | (i244 ^ pressedStateDuration);
                                        int i246 = (~(((i245 + 37) - (i245 | 37)) | (i245 ^ 37))) * (-104);
                                        int i247 = (((i243 | i246) << i5) - (i246 ^ i243)) + ((((pressedStateDuration + i237) - (pressedStateDuration | i237)) | (pressedStateDuration ^ i237)) * 104);
                                        int i248 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        int i249 = (((i248 * 217) - 23435) - (~((~((-1) - (((-1) - (i248 ^ i2)) & ((-1) - ((-1) - (((-1) - i248) | ((-1) - i2))))))) * JfifUtil.MARKER_SOI))) - i5;
                                        int i250 = (-1) - (((-1) - i248) & ((-1) - (-110)));
                                        int i251 = ~i2;
                                        int i252 = i250 ^ i251;
                                        int i253 = i250 & i251;
                                        int i254 = -(-(((i253 + i252) - (i253 & i252)) * (-216)));
                                        int i255 = (i249 ^ i254) + ((i249 & i254) << i5);
                                        int i256 = i72 ^ i248;
                                        int i257 = i248 & i72;
                                        int i258 = ~((i257 + i256) - (i257 & i256));
                                        int i259 = ((-1) - (((-1) - ((i258 + 109) - (i258 | 109))) & ((-1) - (i258 ^ 109)))) * JfifUtil.MARKER_SOI;
                                        int i260 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                        int i261 = ((i260 + 29) - (29 | i260)) + ((i260 + 29) - (i260 & 29));
                                        Object[] objArr22 = new Object[i5];
                                        r(i247, (((i255 + i259) - (i255 & i259)) << i5) - (i259 ^ i255), i261, false, "\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff", objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        int i262 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i263 = (((i262 + 12) - (12 & i262)) << i5) - (i262 ^ 12);
                                        Object[] objArr23 = new Object[i5];
                                        q("ꐭ椦\ua8da＂驼續飔♇핱훰膣〓", i263, objArr23);
                                        String str = (String) objArr23[0];
                                        Class<?>[] clsArr = new Class[i5];
                                        clsArr[0] = String.class;
                                        Object objInvoke3 = cls5.getMethod(str, clsArr).invoke(null, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[i5];
                                            q("㥤橴퍘꜆햻퉲싯彳\ue6cb⫌\u0cceʌ魙余⫼\udd3cᓁ챮欉䷛腟쬿⮝쟛렢Ʂﮧ㫧", 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            int i264 = -Process.getGidForName("");
                                            int i265 = i264 * 302;
                                            int i266 = (i265 ^ 6030) + ((i265 & 6030) << i5);
                                            int i267 = ~i264;
                                            int i268 = i267 ^ i72;
                                            int i269 = (-1) - (((-1) - i267) | ((-1) - i72));
                                            int i270 = (i266 - (~(((-1) - (((-1) - (~((i268 + i269) - (i268 & i269)))) & ((-1) - 10))) * (-602)))) - 1;
                                            int i271 = ~((-1) - (((-1) - i267) & ((-1) - (-11))));
                                            int i272 = ~i264;
                                            int i273 = i272 ^ i2;
                                            int i274 = (i272 + i2) - (i272 | i2);
                                            int i275 = (~((i273 + i274) - (i273 & i274))) | i271;
                                            int i276 = (-1) - (((-1) - (i264 & i72)) & ((-1) - (i72 ^ i264)));
                                            int i277 = i270 + ((i275 | (~(((i276 + 10) - (i276 | 10)) | (i276 ^ 10)))) * (-301)) + ((~((-1) - (((-1) - i72) & ((-1) - 10)))) * 301);
                                            int i278 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int i279 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            Object[] objArr25 = new Object[1];
                                            r(i277, ((i278 + 111) - (111 | i278)) + ((-1) - (((-1) - i278) & ((-1) - 111))), (((i279 + 10) - (10 & i279)) << 1) - (i279 ^ 10), true, "\ufffa\u000b\u000bￚ\ufffe\r\u0012ￛ\b\r\u0012", objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                                int i280 = ((longPressTimeout | 37) << 1) - (longPressTimeout ^ 37);
                                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 108;
                                                int i281 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                Object[] objArr27 = new Object[1];
                                                r(i280, scrollBarSize, ((i281 + 28) - (28 | i281)) + ((-1) - (((-1) - i281) & ((-1) - 28))), false, "\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff", objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                int i282 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                                                Object[] objArr28 = new Object[1];
                                                q("ꐭ椦窸癍蕾펙㸟輧髇섪ꨝ\uda14⎎霒죽쾶먢픢膣〓", (i282 ^ 19) + (((-1) - (((-1) - i282) | ((-1) - 19))) << 1), objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                int i283 = 0;
                                                while (i283 < 2) {
                                                    Object obj2 = objArr3[i283];
                                                    try {
                                                        int i284 = -(-AndroidCharacter.getMirror('0'));
                                                        int i285 = ((i284 - 14) - ((-14) | i284)) + ((i284 - 14) - (i284 & (-14)));
                                                        int i286 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                                        int i287 = (i286 * (-1965)) + 101352;
                                                        int i288 = i286 ^ (-104);
                                                        int i289 = (-1) - (((-1) - i286) | ((-1) - (-104)));
                                                        int i290 = ((i288 + i289) - (i288 & i289)) * 983;
                                                        int i291 = (((-1) - (((-1) - i287) & ((-1) - i290))) << 1) - (i287 ^ i290);
                                                        int i292 = ~i286;
                                                        int i293 = ~iUptimeMillis;
                                                        int i294 = (-104) ^ i293;
                                                        int i295 = (-1) - (((-1) - (-104)) | ((-1) - i293));
                                                        int i296 = ~((i294 + i295) - (i294 & i295));
                                                        int i297 = i292 ^ i296;
                                                        int i298 = (i296 + i292) - (i296 | i292);
                                                        int i299 = i291 + (((i297 + i298) - (i297 & i298)) * (-983));
                                                        int i300 = ~i286;
                                                        int i301 = ~iUptimeMillis;
                                                        int i302 = ~((-1) - (((-1) - (i300 & i301)) & ((-1) - (i300 ^ i301))));
                                                        int i303 = i292 ^ 103;
                                                        int i304 = (i292 + 103) - (i292 | 103);
                                                        int i305 = ~((i303 + i304) - (i303 & i304));
                                                        int i306 = i302 ^ i305;
                                                        int i307 = (-1) - (((-1) - i302) | ((-1) - i305));
                                                        int i308 = -(-(((i307 + i306) - (i307 & i306)) * 983));
                                                        Object[] objArr29 = new Object[1];
                                                        r(i285, (i299 & i308) + ((-1) - (((-1) - i308) & ((-1) - i299))), 31 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), false, "ￏ\u0014\u0006\u0004\u0016\u0013\n\u0015\u001aￏ\u0004\u0006\u0013\u0015ￏ\ufff9ￖ\uffd1ￚ￤\u0006\u0013\u0015\n\u0007\n\u0004\u0002\u0015\u0006\u000b\u0002\u0017\u0002", objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int size = View.MeasureSpec.getSize(0);
                                                        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                                        int i309 = size * (-494);
                                                        int i310 = size ^ 23;
                                                        int i311 = size & 23;
                                                        int i312 = ((((-1) - (((-1) - i309) & ((-1) - (-11362)))) << 1) - (i309 ^ (-11362))) + ((~((i310 + i311) - (i310 & i311))) * (-495));
                                                        int i313 = ~iUptimeMillis2;
                                                        int i314 = size ^ i313;
                                                        int i315 = (-1) - (((-1) - size) | ((-1) - i313));
                                                        int i316 = i312 + (((i314 + i315) - (i314 & i315)) * 495);
                                                        int i317 = ~size;
                                                        int i318 = i317 ^ (-24);
                                                        int i319 = i317 & (-24);
                                                        int i320 = ~((i318 + i319) - (i318 & i319));
                                                        int i321 = ~((-1) - (((-1) - (i313 ^ size)) & ((-1) - ((-1) - (((-1) - i313) | ((-1) - size))))));
                                                        int i322 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i321) | ((-1) - i320)))) & ((-1) - (i320 ^ i321)))) * 495));
                                                        int i323 = (i316 ^ i322) + (((-1) - (((-1) - i322) | ((-1) - i316))) << 1);
                                                        int i324 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                        int i325 = f18941h * (-453033804);
                                                        f18941h = i325;
                                                        int i326 = (((i324 * (-419)) - (-43784)) - (~(-(-((~((-1) - (((-1) - i325) & ((-1) - 104)))) * 420))))) - 1;
                                                        int i327 = ~i324;
                                                        int i328 = ((i327 ^ 104) | ((i327 + 104) - (i327 | 104))) * (-420);
                                                        int i329 = ((i326 | i328) << 1) - (i328 ^ i326);
                                                        int i330 = ~i324;
                                                        int i331 = ~(((-1) - (((-1) - i330) | ((-1) - (-105)))) | (i330 ^ (-105)));
                                                        int i332 = ~i325;
                                                        int i333 = ~((i332 + 104) - (i332 & 104));
                                                        int i334 = i331 ^ i333;
                                                        int i335 = (-1) - (((-1) - i331) | ((-1) - i333));
                                                        int i336 = -(-(((i335 + i334) - (i335 & i334)) * 420));
                                                        int i337 = (i329 ^ i336) + (((i329 + i336) - (i329 | i336)) << 1);
                                                        char mirror = AndroidCharacter.getMirror('0');
                                                        int i338 = f18942i * 1196304861;
                                                        f18942i = i338;
                                                        int i339 = mirror * 530;
                                                        int i340 = (((i339 | PhotoshopDirectory.TAG_EXIF_DATA_1) << 1) - (i339 ^ PhotoshopDirectory.TAG_EXIF_DATA_1)) - 23320;
                                                        int i341 = ~i338;
                                                        int i342 = i341 ^ mirror;
                                                        int i343 = i341 & mirror;
                                                        int i344 = -(-(((-1) - (((-1) - (~((mirror - ',') - (mirror & (-44))))) & ((-1) - (~((i342 + i343) - (i342 & i343)))))) * 529));
                                                        int i345 = ((i340 | i344) << 1) - (i344 ^ i340);
                                                        int i346 = ~((-1) - (((-1) - (mirror ^ i338)) & ((-1) - ((mirror + i338) - (mirror | i338)))));
                                                        int i347 = -(-(((-1) - (((-1) - (i346 & 43)) & ((-1) - (43 ^ i346)))) * 529));
                                                        Object[] objArr30 = new Object[1];
                                                        r(i323, i337, ((-1) - (((-1) - i345) | ((-1) - i347))) + ((i347 + i345) - (i347 & i345)), false, "\n\u0011\u0002\r\b\u0006\u0015\ufff4\u0016\u0003\u000b\u0006\u0004\u0015\ufff9ￖ\uffd1\uffd1\ufff1\u0013\n\u000f\u0004", objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{(-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - (-2))))) & ((-1) - ((i72 + 1) - (1 | i72))))}};
                                                            int i348 = ~((-528975207) | i2);
                                                            int i349 = (-1984092087) + ((386106656 | i348) * (-280)) + ((i348 | (~((-1) - (((-1) - (-149172816)) & ((-1) - i2))))) * 140);
                                                            int i350 = ~((-142868551) | i2);
                                                            int i351 = ~((-386106657) | i72);
                                                            int i352 = i349 + ((((i350 + i351) - (i350 & i351)) | (~((-6304266) | i72))) * 140);
                                                            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                                            int i353 = ~i352;
                                                            int i354 = (((-3344) + (i352 * (-209))) - (~(-(-((~((-1) - (((-1) - ((-17) & i353)) & ((-1) - ((-17) ^ i353))))) * Mp4VideoDirectory.TAG_COMPRESSION_TYPE))))) - 1;
                                                            int i355 = ~iFreeMemory2;
                                                            int i356 = ~((i355 + i353) - (i355 & i353));
                                                            int i357 = ~((-17) | iFreeMemory2);
                                                            int i358 = i354 + ((((-1) - (((-1) - i356) | ((-1) - i357))) | (i356 ^ i357)) * Mp4VideoDirectory.TAG_COMPRESSION_TYPE);
                                                            int i359 = ~iFreeMemory2;
                                                            int i360 = ((-1) - (((-1) - i359) | ((-1) - (-17)))) | ((-17) ^ i359);
                                                            int i361 = i360 ^ i352;
                                                            int i362 = (-1) - (((-1) - i352) | ((-1) - i360));
                                                            int i363 = ~((i362 + i361) - (i362 & i361));
                                                            int i364 = ((-1) - (((-1) - i353) | ((-1) - 16))) | (i353 ^ 16);
                                                            int i365 = ~((iFreeMemory2 & i364) | (i364 ^ iFreeMemory2));
                                                            int i366 = ((i365 & i363) | (i363 ^ i365)) * Mp4VideoDirectory.TAG_COMPRESSION_TYPE;
                                                            int i367 = (((-1) - (((-1) - i358) & ((-1) - i366))) << 1) - (i366 ^ i358);
                                                            int i368 = ((-1) - (((-1) - i3) | ((-1) - i367))) + (i367 | i3);
                                                            int i369 = i368 << 13;
                                                            int i370 = ((~i368) & i369) | ((-1) - (((-1) - (~i369)) | ((-1) - i368)));
                                                            int i371 = i370 >>> 17;
                                                            int i372 = ~((-1) - (((-1) - i370) | ((-1) - i371)));
                                                            int i373 = i370 | i371;
                                                            int i374 = (i373 + i372) - (i373 | i372);
                                                            int i375 = i374 << 5;
                                                            int i376 = (~i375) & i374;
                                                            int i377 = ~i374;
                                                            int i378 = (i377 + i375) - (i377 | i375);
                                                            ((int[]) objArr31[0])[0] = (i378 + i376) - (i378 & i376);
                                                            return objArr31;
                                                        }
                                                        int i379 = i283 + 28;
                                                        i283 = (((i379 - 27) - (i379 | (-27))) << 1) + (i379 ^ (-27));
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i4++;
                                                i5 = 1;
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
        int id = (int) Thread.currentThread().getId();
        int i380 = ~id;
        int i381 = 1061445052 + (((id + 826793405) - (id & 826793405)) * (-859)) + (((-1) - (((-1) - (~((id - 822335929) - (id & (-822335929))))) & ((-1) - (~((-1) - (((-1) - 826793405) & ((-1) - i380))))))) * 859) + (((~(148645383 | i380)) | (-970981312)) * 859);
        int i382 = ~i2;
        int i383 = ((i381 * (-1527)) - (~(((~i382) | i381) * 764))) - 1;
        int i384 = ~i2;
        int i385 = -(-((~(((-1) - (((-1) - i384) | ((-1) - i381))) | (i384 ^ i381))) * (-1528)));
        int i386 = ((i383 + i385) - (i383 | i385)) + ((i385 + i383) - (i385 & i383));
        int i387 = ~(~i381);
        int i388 = ~i382;
        int i389 = (i386 - (~(((i387 & i388) | (i387 ^ i388)) * 764))) - 1;
        int i390 = f18940g * (-1687691842);
        f18940g = i390;
        int i391 = (i389 * 85) + (i3 * 85);
        int i392 = ~((~i389) | (~i3));
        int i393 = ~i389;
        int i394 = ~i390;
        int i395 = i393 ^ i394;
        int i396 = (-1) - (((-1) - i393) | ((-1) - i394));
        int i397 = i392 | (~((i396 + i395) - (i396 & i395)));
        int i398 = ~i3;
        int i399 = ~((~i390) | i398);
        int i400 = (-1) - (((-1) - (i397 & i399)) & ((-1) - (i397 ^ i399)));
        int i401 = (-1) - (((-1) - (i389 ^ i3)) & ((-1) - ((i389 + i3) - (i389 | i3))));
        int i402 = ~((-1) - (((-1) - (i401 ^ i390)) & ((-1) - ((i401 + i390) - (i401 | i390)))));
        int i403 = (((i400 + i402) - (i400 | i402)) | (i400 ^ i402)) * (-84);
        int i404 = ((-1) - (((-1) - i391) | ((-1) - i403))) + ((-1) - (((-1) - i391) & ((-1) - i403)));
        int i405 = ~(((-1) - (((-1) - i390) | ((-1) - i398))) | (i398 ^ i390));
        int i406 = ((-1) - (((-1) - i405) | ((-1) - i389))) | (i389 ^ i405);
        int i407 = ~((-1) - (((-1) - (i394 ^ i3)) & ((-1) - ((-1) - (((-1) - i394) | ((-1) - i3))))));
        int i408 = i406 ^ i407;
        int i409 = (i406 + i407) - (i406 | i407);
        int i410 = ((i409 + i408) - (i409 & i408)) * (-84);
        int i411 = (i404 ^ i410) + ((i410 & i404) << 1);
        int i412 = ~((-1) - (((-1) - (i394 ^ i3)) & ((-1) - ((i3 + i394) - (i3 | i394)))));
        int i413 = ~i401;
        int i414 = (((i412 + i413) - (i412 | i413)) | (i412 ^ i413)) * 84;
        int i415 = ((-1) - (((-1) - i411) | ((-1) - i414))) + ((-1) - (((-1) - i414) & ((-1) - i411)));
        int i416 = i415 << 13;
        int i417 = ~i416;
        int i418 = (i417 + i415) - (i417 | i415);
        int i419 = ~i415;
        int i420 = ((i416 + i419) - (i416 | i419)) | i418;
        int i421 = i420 ^ (i420 >>> 17);
        int i422 = i421 << 5;
        int i423 = ~i422;
        int i424 = (i423 + i421) - (i423 | i421);
        int i425 = ~i421;
        int i426 = (i425 + i422) - (i425 | i422);
        ((int[]) objArr32[0])[0] = (i426 + i424) - (i426 & i424);
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88};
        $$b = 86;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = 0;
        Object charArray = str2;
        if (str2 != null) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 45 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        int i7 = $11 + 77;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (gVar.f19924d < cArr.length) {
            cArr3[i4] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i9 = 58224;
            int i10 = i4;
            while (i10 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i9) ^ ((c3 << 4) + ((char) (((long) f18947n) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f18948o)};
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = d.a(271 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Gravity.getAbsoluteGravity(0, 0) + 11, -1995022631, false, $$c((byte) 46, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f18939f) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f18943j)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = d.a(270 - Color.blue(0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, -1995022631, false, $$c((byte) 46, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i4 = 0;
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
            Object objA3 = d.a(1390051551);
            if (objA3 == null) {
                byte b4 = (byte) 0;
                objA3 = d.a(269 - Process.getGidForName(""), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 12, -2074123590, false, $$c((byte) ($$b >>> 1), b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void r(int i2, int i3, int i4, boolean z2, String str, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 93;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f18944k)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(269 - TextUtils.lastIndexOf("", '0'), (char) TextUtils.indexOf("", "", 0), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 522;
                    char cAlpha = (char) Color.alpha(0);
                    int minimumFlingVelocity = 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i9 = $$b;
                    byte b4 = (byte) ((i9 + 11) - (i9 | 11));
                    byte b5 = (byte) (b4 - 2);
                    objA2 = d.a(pressedStateDuration, cAlpha, minimumFlingVelocity, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            int i10 = $11 + 69;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i12 = $10 + 91;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i14 = $11 + 111;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr4[nVar.f19944a] = cArr2[nVar.f19944a * i2];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = d.a(-202660535);
                    if (objA3 == null) {
                        int i15 = 523 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int longPressTimeout = 12 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b6 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 11)));
                        byte b7 = (byte) (b6 - 2);
                        objA3 = d.a(i15, scrollBarSize, longPressTimeout, 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = d.a(-202660535);
                    if (objA4 == null) {
                        int i16 = 523 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int trimmedLength = TextUtils.getTrimmedLength("") + 12;
                        byte b8 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 11)));
                        byte b9 = (byte) (b8 - 2);
                        objA4 = d.a(i16, cKeyCodeFromString, trimmedLength, 627984172, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final String getDescription() {
        int i2 = 2 % 2;
        int i3 = f18945l + 45;
        f18946m = i3 % 128;
        int i4 = i3 % 2;
        String strD = this.innerEcomStaticToken.d();
        int i5 = f18946m + 51;
        f18945l = i5 % 128;
        int i6 = i5 % 2;
        return strD;
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final String getForegroundColor() {
        int i2 = 2 % 2;
        int i3 = f18946m;
        int i4 = i3 + 3;
        f18945l = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 3;
        f18945l = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final Drawable getGraphicResource(Context context) {
        int i2 = 2 % 2;
        int i3 = f18945l + 73;
        f18946m = i3 % 128;
        int i4 = i3 % 2;
        if (this.innerEcomStaticToken.b() == null) {
            return null;
        }
        Drawable drawableE = this.innerEcomStaticToken.b().e(context);
        int i5 = f18945l + 95;
        f18946m = i5 % 128;
        int i6 = i5 % 2;
        return drawableE;
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final String getLabel() {
        int i2 = 2 % 2;
        int i3 = f18946m + 57;
        f18945l = i3 % 128;
        int i4 = i3 % 2;
        String strD = this.innerEcomStaticToken.d();
        int i5 = f18946m + 77;
        f18945l = i5 % 128;
        if (i5 % 2 == 0) {
            return strD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final String getLayoutDescription() {
        int i2 = 2 % 2;
        int i3 = f18945l + 55;
        int i4 = i3 % 128;
        f18946m = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = i4 + 117;
        f18945l = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
