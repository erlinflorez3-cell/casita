package fr.antelop.sdk.card;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.f;
import o.a.q;
import o.ep.d;

/* JADX INFO: loaded from: classes5.dex */
public final class CardDisplay implements ICardDisplay {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f18915a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f18916b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f18917c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f18918d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f18919e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f18920f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18921g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f18922h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f18923i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f18924j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18925k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f18926l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f18927n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f18928o = 0;
    private final d innerCard;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, short r10) {
        /*
            byte[] r7 = fr.antelop.sdk.card.CardDisplay.$$a
            int r2 = r8 * 3
            int r1 = 1 - r2
            int r0 = r9 * 4
            int r6 = r0 + 4
            int r5 = 78 - r10
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r7 != 0) goto L29
            r5 = r2
            r0 = r6
            r1 = r3
        L16:
            int r6 = r6 + 1
            int r5 = r5 + r0
        L19:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r7[r6]
            goto L16
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.CardDisplay.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18925k = -1564449644;
        f18921g = 80476846;
        f18917c = -407503452;
        f18918d = 1822623605;
        f18915a = 2067197083;
        f18916b = -301111644;
        f18919e = -904082002;
        f18926l = 0;
        f18928o = 1;
        f18923i = new char[]{2088, 2083, 2076, 2074, 2132, 2065, 2095, 2081, 2079, 2064, 2091, 2078, 2075, 2090, 2143, 2130, 2106, 2098, 2068, 2066, 2070, 2113, 2119, 2111, 2097, 2134, 2101, 2115, 2094, 2069, 2100, 2146, 2126, 2080, 2093, 2139, 2123, 2112};
        f18922h = 2040400258;
        f18920f = true;
        f18924j = true;
        f18927n = 71980462940225881L;
    }

    public CardDisplay(d dVar) {
        this.innerCard = dVar;
    }

    public static Object[] e(Context context, int i2, int i3) {
        char c2 = 0;
        int i4 = 1;
        if (context == null) {
            Object[] objArr = {new int[]{((~i) & i) | ((-1) - (((-1) - (~i)) | ((-1) - i)))}, new int[]{i2}, null, new int[]{i2}};
            int i5 = (((-1) - (((-1) - (~(((-265552050) + i2) - ((-265552050) & i2)))) & ((-1) - 121634993))) * (-566)) + 804077323 + ((~((i2 - 143917057) - (i2 & (-143917057)))) * 566);
            int i6 = f18919e * 1235470677;
            f18919e = i6;
            int i7 = i5 * 165;
            int i8 = i3 * (-163);
            int i9 = (((-1) - (((-1) - i7) & ((-1) - i8))) << 1) - (i7 ^ i8);
            int i10 = ~i6;
            int i11 = ~((-1) - (((-1) - (i10 & i3)) & ((-1) - (i10 ^ i3))));
            int i12 = -(-(((-1) - (((-1) - ((i11 + i5) - (i11 | i5))) & ((-1) - (i5 ^ i11)))) * (-328)));
            int i13 = ((((-1) - (((-1) - i9) & ((-1) - i12))) << 1) - (i12 ^ i9)) + (((i5 ^ i6) | ((-1) - (((-1) - i5) | ((-1) - i6)))) * 164);
            int i14 = ~((~i5) | (~i3));
            int i15 = ~i3;
            int i16 = i15 ^ i6;
            int i17 = i15 & i6;
            int i18 = ~((i17 + i16) - (i17 & i16));
            int i19 = i14 ^ i18;
            int i20 = (-1) - (((-1) - i14) | ((-1) - i18));
            int i21 = (i20 + i19) - (i20 & i19);
            int i22 = ~i6;
            int i23 = i22 ^ i5;
            int i24 = i22 & i5;
            int i25 = (i24 + i23) - (i24 & i23);
            int i26 = ~((-1) - (((-1) - ((i25 + i3) - (i25 | i3))) & ((-1) - (i25 ^ i3))));
            int i27 = -(-(((-1) - (((-1) - (i26 & i21)) & ((-1) - (i21 ^ i26)))) * 164));
            int i28 = (i13 ^ i27) + (((i27 + i13) - (i27 | i13)) << 1);
            int i29 = i28 << 13;
            int i30 = ~((-1) - (((-1) - i28) | ((-1) - i29)));
            int i31 = (-1) - (((-1) - i29) & ((-1) - i28));
            int i32 = (i31 + i30) - (i31 | i30);
            int i33 = i32 >>> 17;
            int i34 = ((-1) - (((-1) - i32) & ((-1) - i33))) & (~((-1) - (((-1) - i32) | ((-1) - i33))));
            int i35 = i34 << 5;
            return objArr;
        }
        try {
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
            int i36 = f18916b * 1726533409;
            f18916b = i36;
            int i37 = (-1) - (((-1) - (iResolveSizeAndState ^ 127)) & ((-1) - (127 & iResolveSizeAndState)));
            int i38 = ~i36;
            int i39 = (((iResolveSizeAndState * 370) - (-46990)) - (~(((-1) - (((-1) - (i37 ^ i38)) & ((-1) - ((i37 + i38) - (i37 | i38))))) * (-369)))) - 1;
            int i40 = ~iResolveSizeAndState;
            int i41 = ~((-1) - (((-1) - (i40 ^ i38)) & ((-1) - ((-1) - (((-1) - i40) | ((-1) - i38))))));
            int i42 = -(-(((i41 + 127) - (i41 & 127)) * (-369)));
            int i43 = (i39 ^ i42) + ((i39 & i42) << 1);
            int i44 = ~((-1) - (((-1) - ((-128) ^ iResolveSizeAndState)) & ((-1) - (((-128) + iResolveSizeAndState) - ((-128) | iResolveSizeAndState)))));
            int i45 = ~((-1) - (((-1) - i36) & ((-1) - iResolveSizeAndState)));
            int i46 = i44 ^ i45;
            int i47 = (-1) - (((-1) - i45) | ((-1) - i44));
            int i48 = (i46 + i47) - (i46 & i47);
            int i49 = (-1) - (((-1) - (~iResolveSizeAndState)) & ((-1) - i38));
            int i50 = ~((-1) - (((-1) - ((-1) - (((-1) - i49) | ((-1) - 127)))) & ((-1) - (i49 ^ 127))));
            int i51 = i48 ^ i50;
            int i52 = i50 & i48;
            Object[] objArr2 = new Object[1];
            m(null, null, i43 + (((i52 + i51) - (i52 & i51)) * 369), "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u0085\u0090\u0090\u008f\u0084\u0085\u008e\u008c\u0089\u0082\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            int i53 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i54 = (i53 * (-375)) - 7711500;
            int i55 = ~i53;
            int i56 = i55 ^ (-20565);
            int i57 = (i55 - 20565) - (i55 | (-20565));
            int i58 = (~((i57 + i56) - (i57 & i56))) | i2;
            int i59 = ~((-1) - (((-1) - (i53 ^ 20564)) & ((-1) - ((-1) - (((-1) - i53) | ((-1) - 20564))))));
            int i60 = -(-(((i58 & i59) | (i58 ^ i59)) * IptcDirectory.TAG_ARM_IDENTIFIER));
            int i61 = (((i54 + i60) - (i54 & i60)) << 1) - (i60 ^ i54);
            int i62 = ~i2;
            int i63 = ~((-1) - (((-1) - (i62 ^ i53)) & ((-1) - ((-1) - (((-1) - i62) | ((-1) - i53))))));
            int i64 = -(-(((i63 ^ i59) | ((i59 + i63) - (i59 | i63))) * (-376)));
            int i65 = ((-1) - (((-1) - i61) | ((-1) - i64))) + ((-1) - (((-1) - i64) & ((-1) - i61)));
            int i66 = ~i53;
            int i67 = ~((-1) - (((-1) - ((i66 + i2) - (i66 | i2))) & ((-1) - (i66 ^ i2))));
            int i68 = i67 ^ 20564;
            int i69 = (-1) - (((-1) - i67) | ((-1) - 20564));
            int i70 = -(-(((i69 + i68) - (i69 & i68)) * IptcDirectory.TAG_ARM_IDENTIFIER));
            int i71 = ((i65 | i70) << 1) - (i70 ^ i65);
            Object[] objArr4 = new Object[1];
            p("ౕ尋겍ﲮ䴴鷭\ued96㸼軧\ude99⼈翃쾗ᡃ棩뢬ऊ姚ꧽ奄䨄骽\ueb46㬌讷푩\u2454璔씿ᔤ旿", i71, objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                Object[] objArr6 = new Object[1];
                m(null, null, ((scrollBarFadeDuration + 127) - (127 | scrollBarFadeDuration)) + ((scrollBarFadeDuration + 127) - (scrollBarFadeDuration & 127)), "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u0085\u0090\u0090\u008f\u0084\u0085\u008e\u008c\u0089\u0082\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                int i72 = -KeyEvent.keyCodeFromString("");
                int i73 = f18915a * (-1923759925);
                f18915a = i73;
                int i74 = i72 * 221;
                int i75 = (i74 ^ (-27813)) + ((i74 & (-27813)) << 1);
                int i76 = ~i72;
                int i77 = ~((-1) - (((-1) - ((-1) - (((-1) - i76) | ((-1) - (-128))))) & ((-1) - (i76 ^ (-128)))));
                int i78 = ~i73;
                int i79 = (i78 ^ i72) | ((i78 + i72) - (i78 | i72));
                int i80 = ~((-1) - (((-1) - (i79 ^ 127)) & ((-1) - ((i79 + 127) - (i79 | 127)))));
                int i81 = i77 ^ i80;
                int i82 = (i77 + i80) - (i77 | i80);
                int i83 = -(-(((i81 + i82) - (i81 & i82)) * 220));
                int i84 = ((i75 | i83) << 1) - (i83 ^ i75);
                int i85 = ~i73;
                int i86 = ~(((i85 + 127) - (i85 | 127)) | (i85 ^ 127));
                int i87 = i72 ^ i86;
                int i88 = (i86 + i72) - (i86 | i72);
                int i89 = (-1) - (((-1) - i72) & ((-1) - 127));
                int i90 = ((i84 - (~(-(-(((i88 + i87) - (i88 & i87)) * (-440)))))) - 1) + (((-1) - (((-1) - ((-1) - (((-1) - i89) | ((-1) - i73)))) & ((-1) - (i89 ^ i73)))) * 220);
                Object[] objArr7 = new Object[1];
                m(null, null, i90, "£\u0089¢\u0087¡ \u009d\u008b\u009e\u008a\u009d\u0093\u009c\u0097\u009f\u0096\u009a\u009d\u008b\u009e\u008a\u009d\u0093\u009c\u0097\u009b\u009a\u0099\u0098\u0097\u0096", objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    Object[] objArr9 = new Object[1];
                    m(null, null, 127 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), "\u0095\u0082\u0094\u008b\u0088\u0093\u008b\u008a\u0092\u0090\u0090\u008f\u0091\u0085\u0090\u0090\u008f\u0084\u0085\u008e\u008c\u0089\u0082\u0085\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i91 = (((absoluteGravity * (-1965)) + 33870264) - (~(((absoluteGravity - 34422) - (absoluteGravity & (-34422))) * 983))) - 1;
                        int i92 = ~absoluteGravity;
                        int i93 = ~iFreeMemory;
                        int i94 = (-34422) ^ i93;
                        int i95 = (-1) - (((-1) - (-34422)) | ((-1) - i93));
                        int i96 = ~((i94 + i95) - (i94 & i95));
                        int i97 = ((-1) - (((-1) - (i92 ^ i96)) & ((-1) - ((-1) - (((-1) - i96) | ((-1) - i92)))))) * (-983);
                        int i98 = ((i91 | i97) << 1) - (i91 ^ i97);
                        int i99 = ~absoluteGravity;
                        int i100 = ~((i99 + i93) - (i99 & i93));
                        int i101 = ~((-1) - (((-1) - ((-1) - (((-1) - 34421) | ((-1) - i92)))) & ((-1) - (i92 ^ 34421))));
                        int i102 = i100 ^ i101;
                        int i103 = i100 & i101;
                        int i104 = ((i103 + i102) - (i103 & i102)) * 983;
                        Object[] objArr10 = new Object[1];
                        p("౷訍\u0098鼻ᖭ갶⫌ꄋ㿝뙤䳪쭥䄏\udf89嘄\uece3欅\ue1bc硂\uf6cd赗௷艬", ((-1) - (((-1) - i98) | ((-1) - i104))) + ((i98 + i104) - (i98 & i104)), objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int i105 = -TextUtils.getOffsetBefore("", 0);
                        int i106 = f18918d * 30106483;
                        f18918d = i106;
                        int i107 = i105 * IptcDirectory.TAG_BY_LINE;
                        int i108 = ((i107 - 16327070) - (i107 | (-16327070))) + ((-1) - (((-1) - i107) & ((-1) - (-16327070))));
                        int i109 = ~i105;
                        int i110 = (~(27673 | i109)) * (-1182);
                        int i111 = (((-1) - (((-1) - i108) & ((-1) - i110))) << 1) - (i108 ^ i110);
                        int i112 = (i109 & (-27674)) | (i109 ^ (-27674));
                        int i113 = ~i106;
                        int i114 = i112 ^ i113;
                        int i115 = (i112 + i113) - (i112 | i113);
                        int i116 = ~((i114 + i115) - (i114 & i115));
                        int i117 = ~((-1) - (((-1) - ((i105 + 27673) - (27673 | i105))) & ((-1) - (i105 ^ 27673))));
                        int i118 = i116 ^ i117;
                        int i119 = (-1) - (((-1) - i117) | ((-1) - i116));
                        int i120 = ((i119 + i118) - (i119 & i118)) * (-591);
                        int i121 = (((i111 + i120) - (i111 & i120)) << 1) - (i111 ^ i120);
                        int i122 = ~i105;
                        int i123 = i106 ^ i122;
                        int i124 = (-1) - (((-1) - i122) | ((-1) - i106));
                        int i125 = (i124 + i123) - (i124 & i123);
                        Object[] objArr11 = new Object[1];
                        p("\u0c71恪푐䠍밓ဈ蓫\uf8d8油삒㒡ꥤᵔ焲\ue52f处췴", i121 + (((-1) - (((-1) - ((-1) - (((-1) - i125) | ((-1) - (-27674))))) & ((-1) - (i125 ^ (-27674))))) * 591), objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            p("౷訍\u0098鼻ᖭ갶⫌ꄋ㿝뙤䳪쭥䄏\udf89嘄\uece3欅\ue1bc硂\uf6cd赗௷艬", 34420 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            int i126 = -(-TextUtils.indexOf("", "", 0, 0));
                            int i127 = (i126 ^ 35407) + (((i126 + 35407) - (i126 | 35407)) << 1);
                            Object[] objArr13 = new Object[1];
                            p("\u0c71蘼\u18fc銫╋뿾ㆧ쑞帉킴歎ﴒ矏ੰ", i127, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
                                int i128 = f18917c * 503730619;
                                f18917c = i128;
                                int i129 = absoluteGravity2 * (-716);
                                int i130 = (i129 ^ 32966255) + ((i129 & 32966255) << 1);
                                int i131 = ~absoluteGravity2;
                                int i132 = i130 + ((((-1) - (((-1) - i131) | ((-1) - 22973))) | (i131 ^ 22973)) * (-1434));
                                int i133 = ~i128;
                                int i134 = ~(((-1) - (((-1) - i133) | ((-1) - 22973))) | (i133 ^ 22973));
                                int i135 = ~((-1) - (((-1) - (22973 & absoluteGravity2)) & ((-1) - (absoluteGravity2 ^ 22973))));
                                int i136 = (i134 & i135) | (i134 ^ i135);
                                int i137 = ~absoluteGravity2;
                                int i138 = i137 ^ (-22974);
                                int i139 = i137 & (-22974);
                                int i140 = (i139 + i138) - (i139 & i138);
                                int i141 = ~((-1) - (((-1) - (i140 ^ i128)) & ((-1) - ((-1) - (((-1) - i140) | ((-1) - i128))))));
                                int i142 = i136 ^ i141;
                                int i143 = (-1) - (((-1) - i136) | ((-1) - i141));
                                int i144 = ((i142 + i143) - (i142 & i143)) * 717;
                                int i145 = ((i132 + i144) - (i132 | i144)) + ((i144 + i132) - (i144 & i132));
                                int i146 = ~i128;
                                int i147 = i140 ^ i146;
                                int i148 = (-1) - (((-1) - i140) | ((-1) - i146));
                                int i149 = ~((i148 + i147) - (i148 & i147));
                                int i150 = ((-1) - (((-1) - (((i149 + i135) - (i149 | i135)) | (i149 ^ i135))) & ((-1) - (~((-1) - (((-1) - (i128 ^ 22973)) & ((-1) - (i128 & 22973)))))))) * 717;
                                Object[] objArr15 = new Object[1];
                                p("౷嗅뼈œ檍쳎ᘜ砓솝⯜贚흽㢯苡\ue434丫鞶臨䍲ꕁຳ僴멃Ό旉켆ᅩ窘\udcd4☞街톐㯄", (i145 ^ i150) + (((i150 + i145) - (i150 | i145)) << 1), objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                Object[] objArr16 = new Object[1];
                                p("\u0c71\uf8ea\ue550톍\ude13쪈럫뱘ꢹ锒膥軫筜枼", 62617 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int iAxisFromString = MotionEvent.axisFromString("");
                                int i151 = (iAxisFromString * (-958)) - 7399592;
                                int i152 = ~((-1) - (((-1) - (-7725)) & ((-1) - i62)));
                                int i153 = ~iAxisFromString;
                                int i154 = (-1) - (((-1) - i152) & ((-1) - (~((-1) - (((-1) - (i153 & i2)) & ((-1) - (i153 ^ i2)))))));
                                int i155 = ~i2;
                                int i156 = i155 ^ iAxisFromString;
                                int i157 = i155 & iAxisFromString;
                                int i158 = ~((i156 + i157) - (i156 & i157));
                                int i159 = (((-1) - (((-1) - i154) | ((-1) - i158))) | (i154 ^ i158)) * 959;
                                int i160 = ((i151 + i159) - (i151 | i159)) + ((i151 + i159) - (i151 & i159));
                                int i161 = -(-((~((-1) - (((-1) - iAxisFromString) & ((-1) - 7724)))) * (-959)));
                                int i162 = ((-1) - (((-1) - i160) | ((-1) - i161))) + (i161 | i160);
                                int i163 = ~iAxisFromString;
                                int i164 = ~((-1) - (((-1) - (i163 & i62)) & ((-1) - (i163 ^ i62))));
                                int i165 = ~((-1) - (((-1) - (((-7725) + i2) - ((-7725) | i2))) & ((-1) - ((-7725) ^ i2))));
                                int i166 = ((~((-1) - (((-1) - ((-1) - (((-1) - iAxisFromString) | ((-1) - i2)))) & ((-1) - (iAxisFromString ^ i2))))) | ((-1) - (((-1) - ((i164 + i165) - (i164 | i165))) & ((-1) - (i164 ^ i165))))) * 959;
                                Object[] objArr17 = new Object[1];
                                p("౷ቓ〤囥瓕骨륰\udf15ﴭϺ⇖䞻晷著\uaa38좽\ueed6ಠጾㅷ圫痲鯏릪\ud879﹀ᰁ⋱䃄暦", ((-1) - (((-1) - i162) | ((-1) - i166))) + (i166 | i162), objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                int i167 = -((byte) KeyEvent.getModifierMetaStateMask());
                                int i168 = i167 * (-183);
                                int i169 = (i168 ^ (-23058)) + (((i168 - 23058) - (i168 | (-23058))) << 1);
                                int i170 = ~i167;
                                int i171 = (-1) - (((-1) - (i170 ^ i155)) & ((-1) - ((-1) - (((-1) - i170) | ((-1) - i155)))));
                                int i172 = ~((-1) - (((-1) - ((i171 + 126) - (i171 | 126))) & ((-1) - (i171 ^ 126))));
                                int i173 = (-1) - (((-1) - ((-127) ^ i155)) & ((-1) - (((-127) + i155) - ((-127) | i155))));
                                int i174 = i173 ^ i167;
                                int i175 = (-1) - (((-1) - i173) | ((-1) - i167));
                                int i176 = ((-1) - (((-1) - i172) & ((-1) - (~((i174 + i175) - (i174 & i175)))))) * (-184);
                                int i177 = (i169 ^ i176) + (((i169 + i176) - (i169 | i176)) << 1);
                                int i178 = ~((i170 & (-127)) | (i170 ^ (-127)));
                                int i179 = ~((~i167) | i155);
                                int i180 = ((i178 + i179) - (i178 | i179)) | (i178 ^ i179);
                                int i181 = (-127) ^ i62;
                                int i182 = ((-127) + i62) - ((-127) | i62);
                                int i183 = ~((i182 + i181) - (i182 & i181));
                                int i184 = i177 + (((-1) - (((-1) - (i180 & i183)) & ((-1) - (i180 ^ i183)))) * 184) + (((-1) - (((-1) - ((i167 + 126) - (i167 | 126))) & ((-1) - (i167 ^ 126)))) * 184);
                                Object[] objArr18 = new Object[1];
                                m(null, null, i184, "\u0086\u0087\u008a\u0089\u008c\u0082\u0093£\u008b\u0086", objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i185 = 0;
                                while (i185 < length) {
                                    Object obj = objArr19[i185];
                                    Object[] objArr20 = new Object[i4];
                                    m(null, null, TextUtils.getTrimmedLength("") + 127, "¤\u0090\u008f\u0085\u0091", objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[c2]};
                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                        int i186 = f18921g * 1506300668;
                                        f18921g = i186;
                                        int i187 = (packedPositionChild * 253) - (-3886080);
                                        int i188 = ~((~packedPositionChild) | (-15361));
                                        int i189 = ~i186;
                                        int i190 = ((-15361) ^ i189) | ((-1) - (((-1) - (-15361)) | ((-1) - i189)));
                                        int i191 = ~i190;
                                        int i192 = (-1) - (((-1) - (i188 ^ i191)) & ((-1) - (i191 & i188)));
                                        int i193 = (15360 & packedPositionChild) | (packedPositionChild ^ 15360);
                                        int i194 = ~(((-1) - (((-1) - i193) | ((-1) - i186))) | (i193 ^ i186));
                                        int i195 = -(-(((-1) - (((-1) - ((i192 + i194) - (i192 | i194))) & ((-1) - (i192 ^ i194)))) * (-252)));
                                        int i196 = ((((-1) - (((-1) - i187) & ((-1) - i195))) << 1) - (i195 ^ i187)) + ((15360 | packedPositionChild) * (-252));
                                        int i197 = ~((-1) - (((-1) - i190) & ((-1) - packedPositionChild)));
                                        int i198 = -(-(((-1) - (((-1) - (i197 & i194)) & ((-1) - (i197 ^ i194)))) * 252));
                                        Object[] objArr22 = new Object[1];
                                        p("౼㞈箞뾊\ue3c4➞殉꾌펛ន安龗쎛ߋ䮇辂뎔\uf78d㯖羸ꎟ\ue78f⮈澖鎘힘ᮓ徒莆자ல侖玕랽ﮧ㾹掳", (i196 ^ i198) + ((i198 & i196) << 1), objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        int i199 = -View.MeasureSpec.getMode(0);
                                        int i200 = ((-1) - (((-1) - i199) | ((-1) - 127))) + ((-1) - (((-1) - i199) & ((-1) - 127)));
                                        Object[] objArr23 = new Object[1];
                                        m(null, null, i200, "\u0087\u0088\u0093\u0082\u008c\u0086\u0093¥\u008c\u0087£", objArr23);
                                        Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                        try {
                                            int i201 = -View.resolveSize(0, 0);
                                            int i202 = i201 * 221;
                                            int i203 = ((-1) - (((-1) - i202) | ((-1) - (-1935741)))) + ((-1) - (((-1) - i202) & ((-1) - (-1935741))));
                                            int i204 = ~i201;
                                            int i205 = i204 ^ (-8840);
                                            int i206 = (i204 - 8840) - (i204 | (-8840));
                                            int i207 = ~((i206 + i205) - (i206 & i205));
                                            int i208 = i155 ^ i201;
                                            int i209 = i155 & i201;
                                            int i210 = (i208 + i209) - (i208 & i209);
                                            int i211 = ~((i210 & 8839) | (i210 ^ 8839));
                                            int i212 = i207 ^ i211;
                                            int i213 = (i207 + i211) - (i207 | i211);
                                            int i214 = i203 + (((i213 + i212) - (i213 & i212)) * 220);
                                            int i215 = ~((-1) - (((-1) - i62) & ((-1) - 8839)));
                                            int i216 = -(-((((-1) - (((-1) - i215) | ((-1) - i201))) | (i201 ^ i215)) * (-440)));
                                            int i217 = (i214 ^ i216) + (((i216 + i214) - (i216 | i214)) << 1);
                                            int i218 = i201 ^ 8839;
                                            int i219 = (i201 + 8839) - (i201 | 8839);
                                            int i220 = (i219 + i218) - (i219 & i218);
                                            int i221 = -(-(((-1) - (((-1) - ((i220 + i2) - (i220 | i2))) & ((-1) - (i220 ^ i2)))) * 220));
                                            int i222 = ((-1) - (((-1) - i217) | ((-1) - i221))) + ((i221 + i217) - (i221 & i217));
                                            Object[] objArr24 = new Object[1];
                                            p("౷\u2eff䥼毱虥ꃜ썘ﶉᡍ㫆唾瞯鈧첣\uef00\u09d1␖䚌慆鱀뻳\ud962ﯢᙖナ卌跒ꡎ", i222, objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            int iMyTid = Process.myTid() >> 22;
                                            int i223 = iMyTid * 371;
                                            int i224 = (i223 ^ 47117) + ((i223 & 47117) << 1);
                                            int i225 = ~(((-128) ^ i62) | (((-128) + i62) - ((-128) | i62)));
                                            int i226 = ~iMyTid;
                                            int i227 = ~(i226 | i2);
                                            int i228 = ((-1) - (((-1) - (i225 & i227)) & ((-1) - (i225 ^ i227)))) * (-370);
                                            int i229 = (i224 & i228) + ((i228 + i224) - (i228 & i224));
                                            int i230 = ~((-1) - (((-1) - (i226 ^ i62)) & ((-1) - ((i226 + i62) - (i226 | i62)))));
                                            int i231 = ~(((-128) ^ i2) | ((-128) & i2));
                                            int i232 = (-1) - (((-1) - (i230 & i231)) & ((-1) - (i230 ^ i231)));
                                            int i233 = iMyTid ^ 127;
                                            int i234 = iMyTid & 127;
                                            int i235 = (i234 + i233) - (i234 & i233);
                                            int i236 = i229 + ((i232 | (~i235)) * (-370));
                                            int i237 = (~i235) * 370;
                                            int i238 = (((-1) - (((-1) - i236) & ((-1) - i237))) << 1) - (i237 ^ i236);
                                            Object[] objArr25 = new Object[1];
                                            m(null, null, i238, "\u008d\u0082\u008a\u008a\u009c\u0087\u008c\u008d¦\u009e\u008c", objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                Object[] objArr27 = new Object[1];
                                                p("౼㞈箞뾊\ue3c4➞殉꾌펛ន安龗쎛ߋ䮇辂뎔\uf78d㯖羸ꎟ\ue78f⮈澖鎘힘ᮓ徒莆자ல侖玕랽ﮧ㾹掳", 15358 - (~(Process.myPid() >> 22)), objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                int deadChar = KeyEvent.getDeadChar(0, 0);
                                                Object[] objArr28 = new Object[1];
                                                p("\u0c71푐밾萚注㓘Ჰ\ue486쵍镈紺䗣ⷛ\uf5b7\udd95ꙸ蹇嘱㸅", (deadChar ^ 55331) + (((deadChar + 55331) - (deadChar | 55331)) << 1), objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                int i239 = 0;
                                                for (int i240 = 2; i239 < i240; i240 = 2) {
                                                    Object obj2 = objArr3[i239];
                                                    try {
                                                        int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                                        Object[] objArr29 = new Object[1];
                                                        p("౼\uf258\uf03e\uf6fa\uf484搜數＼ﴛ\ue3c3\ue1a9\ue067\ue65b\ue45b\ueae7\ue8b2\uee94\ued7d퍶턳힏헽퐥\uda6c\u16ef3\udca4슊셔윬엷쯆즂졼", (((scrollBarSize + 65071) - (scrollBarSize & 65071)) << 1) - (scrollBarSize ^ 65071), objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int i241 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                        int i242 = (i241 * 450) - 2666944;
                                                        int i243 = ~i241;
                                                        int i244 = i243 ^ 5953;
                                                        int i245 = (-1) - (((-1) - i243) | ((-1) - 5953));
                                                        int i246 = (i244 + i245) - (i244 & i245);
                                                        int i247 = ~i246;
                                                        int i248 = ((-5954) ^ i241) | ((-5954) & i241);
                                                        int i249 = ~((-1) - (((-1) - (i248 ^ elapsedCpuTime)) & ((-1) - (i248 & elapsedCpuTime))));
                                                        int i250 = -(-(((-1) - (((-1) - (i247 ^ i249)) & ((-1) - ((-1) - (((-1) - i249) | ((-1) - i247)))))) * 449));
                                                        int i251 = (((i242 + i250) - (i242 & i250)) << 1) - (i250 ^ i242);
                                                        int i252 = ~i241;
                                                        int i253 = i252 ^ 5953;
                                                        int i254 = (i252 + 5953) - (i252 | 5953);
                                                        int i255 = -(-((~((i254 + i253) - (i254 & i253))) * (-1347)));
                                                        int i256 = ((i251 + i255) - (i251 | i255)) + (i255 | i251);
                                                        int i257 = ~i246;
                                                        int i258 = ~elapsedCpuTime;
                                                        int i259 = (-5954) ^ i258;
                                                        int i260 = (-1) - (((-1) - i258) | ((-1) - (-5954)));
                                                        int i261 = (i260 + i259) - (i260 & i259);
                                                        int i262 = i261 ^ i241;
                                                        int i263 = i241 & i261;
                                                        int i264 = ~((i263 + i262) - (i263 & i262));
                                                        int i265 = ((-1) - (((-1) - (i257 & i264)) & ((-1) - (i257 ^ i264)))) * 449;
                                                        int i266 = (i256 ^ i265) + ((i265 & i256) << 1);
                                                        Object[] objArr30 = new Object[1];
                                                        p("\u0c71ᬲ⋠䦆內砱蟺꺴뙽\udd2b\ue4c4\uf3e8ᬪ≫䧈傫硯蜩껧떬\udd72\ue422\uf3ec", i266, objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int i267 = f18925k * (-1468887922);
                                                            f18925k = i267;
                                                            int i268 = ~i267;
                                                            int i269 = ~(((-95561499) + i268) - ((-95561499) & i268));
                                                            int i270 = -(-((-353929523) + (((i269 + 68158992) - (i269 & 68158992)) * 184) + (((-1) - (((-1) - i267) & ((-1) - (-801112027)))) * (-184)) + ((~((-1) - (((-1) - (-773709521)) & ((-1) - i268)))) * 184) + 16));
                                                            int i271 = ((i3 + i270) - (i3 | i270)) + (i270 | i3);
                                                            int i272 = i271 << 13;
                                                            int i273 = (-1) - (((-1) - ((-1) - (((-1) - i272) | ((-1) - (~i271))))) & ((-1) - ((-1) - (((-1) - (~i272)) | ((-1) - i271)))));
                                                            int i274 = i273 >>> 17;
                                                            int i275 = ~((i273 + i274) - (i273 | i274));
                                                            int i276 = i273 | i274;
                                                            int i277 = (i276 + i275) - (i276 | i275);
                                                            return objArr31;
                                                        }
                                                        int i278 = i239 + 7;
                                                        i239 = (((i278 - 6) - (i278 | (-6))) << 1) + (i278 ^ (-6));
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i185++;
                                                c2 = 0;
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
        int iActiveCount = Thread.activeCount();
        int i279 = ~iActiveCount;
        int i280 = 2033549173 + (((-1) - (((-1) - 198153) & ((-1) - i279))) * (-192)) + (((-1) - (((-1) - (~((-607416567) | i279))) & ((-1) - 70533302))) * (-384));
        int i281 = ~(((-70533303) + iActiveCount) - ((-70533303) & iActiveCount));
        int i282 = ~(i279 | (-536883265));
        int i283 = i280 + (((~((-1) - (((-1) - iActiveCount) & ((-1) - 607614719)))) | ((i282 + i281) - (i282 & i281))) * 192);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i284 = i283 * 85;
        int i285 = i3 * 85;
        int i286 = (i284 ^ i285) + ((i284 & i285) << 1);
        int i287 = ~i283;
        int i288 = ~i3;
        int i289 = i287 ^ i288;
        int i290 = (-1) - (((-1) - i287) | ((-1) - i288));
        int i291 = ~((i290 + i289) - (i290 & i289));
        int i292 = ~i283;
        int i293 = ~iUptimeMillis;
        int i294 = ~(i292 | i293);
        int i295 = (i291 + i294) - (i291 & i294);
        int i296 = ~i3;
        int i297 = ~(((i296 + i293) - (i296 | i293)) | (i296 ^ i293));
        int i298 = (-1) - (((-1) - (i295 & i297)) & ((-1) - (i295 ^ i297)));
        int i299 = (i283 ^ i3) | ((-1) - (((-1) - i283) | ((-1) - i3)));
        int i300 = ((-1) - (((-1) - i298) & ((-1) - (~((i299 + iUptimeMillis) - (i299 & iUptimeMillis)))))) * (-84);
        int i301 = (i286 ^ i300) + ((i300 & i286) << 1);
        int i302 = i288 ^ iUptimeMillis;
        int i303 = (iUptimeMillis + i288) - (iUptimeMillis | i288);
        int i304 = ~((i303 + i302) - (i303 & i302));
        int i305 = ((i304 + i283) - (i304 | i283)) | (i283 ^ i304);
        int i306 = ~((-1) - (((-1) - (i293 ^ i3)) & ((-1) - (i293 & i3))));
        int i307 = -(-(((-1) - (((-1) - ((i305 + i306) - (i305 | i306))) & ((-1) - (i305 ^ i306)))) * (-84)));
        int i308 = ~(i293 | i3);
        int i309 = ~i299;
        int i310 = ((i301 + i307) - (i301 | i307)) + (i307 | i301) + ((((i308 + i309) - (i308 | i309)) | (i308 ^ i309)) * 84);
        int i311 = i310 << 13;
        int i312 = ~i311;
        int i313 = (i311 & (~i310)) | ((i312 + i310) - (i312 | i310));
        int i314 = i313 >>> 17;
        int i315 = (-1) - (((-1) - ((-1) - (((-1) - (~i313)) | ((-1) - i314)))) & ((-1) - ((~i314) & i313)));
        ((int[]) objArr32[0])[0] = i315 ^ (i315 << 5);
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.SYN, -5, 39, 97};
        $$b = 72;
    }

    private static void m(int[] iArr, String str, int i2, String str2, Object[] objArr) throws Throwable {
        int i3;
        String str3 = str;
        String str4 = str2;
        int i4 = 2;
        int i5 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            int i6 = $10 + 23;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 13 / 0;
                bytes = str4.getBytes("ISO-8859-1");
            } else {
                bytes = str4.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f18923i;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 63;
                $10 = i9 % 128;
                if (i9 % i4 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(593 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13181), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -1225586509, false, $$c(b2, b3, (byte) (11 | b3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objA2 = o.d.d.a(1618406102);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + IptcDirectory.TAG_BY_LINE, (char) (13181 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -1225586509, false, $$c(b4, b5, (byte) (11 | b5)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i4 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f18922h)};
        Object objA3 = o.d.d.a(-1503702982);
        if (objA3 == null) {
            objA3 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + 32, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
        if (f18924j) {
            int i10 = $10 + 111;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    objA4 = o.d.d.a(458 - Color.green(0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, -1923924106, false, $$c(b6, b6, (byte) (-$$a[1])), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (f18920f) {
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    byte b7 = (byte) 0;
                    objA5 = o.d.d.a(457 - ImageFormat.getBitsPerPixel(0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - (KeyEvent.getMaxKeyCode() >> 16), -1923924106, false, $$c(b7, b7, (byte) (-$$a[1])), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i12 = $11 + 13;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e >> 1) + fVar.f19922a] >> i2] << iIntValue);
                i3 = fVar.f19922a;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i3 = fVar.f19922a + 1;
            }
            fVar.f19922a = i3;
        }
        objArr[0] = new String(cArr6);
    }

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        int i4 = $10 + 117;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (qVar.f19948a < cArr.length) {
            int i6 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(731 - TextUtils.getOffsetAfter("", 0), (char) (7933 - View.getDefaultSize(0, 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, 355847088, false, $$c(b2, b3, (byte) ((b3 + 7) - (7 & b3))), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f18927n ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(836 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (27280 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), -2145994442, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 37;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(836 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 27279), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, -2145994442, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2);
        int i9 = $11 + 99;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str3;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final String getDescription() {
        int i2 = 2 % 2;
        int i3 = f18928o + 27;
        f18926l = i3 % 128;
        int i4 = i3 % 2;
        d dVar = this.innerCard;
        if (i4 == 0) {
            return dVar.h();
        }
        dVar.h();
        throw null;
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final String getForegroundColor() {
        int i2 = 2 % 2;
        int i3 = f18928o + 29;
        f18926l = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerCard.g();
            throw null;
        }
        String strG = this.innerCard.g();
        int i4 = f18928o + 93;
        f18926l = i4 % 128;
        int i5 = i4 % 2;
        return strG;
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final Drawable getGraphicResource(Context context) {
        int i2 = 2 % 2;
        int i3 = f18928o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18926l = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawableA = this.innerCard.a(context);
        int i5 = f18926l + 79;
        f18928o = i5 % 128;
        int i6 = i5 % 2;
        return drawableA;
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final String getLabel() {
        int i2 = 2 % 2;
        int i3 = f18926l + 65;
        f18928o = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.innerCard.j();
            obj.hashCode();
            throw null;
        }
        String strJ = this.innerCard.j();
        int i4 = f18928o + 39;
        f18926l = i4 % 128;
        if (i4 % 2 == 0) {
            return strJ;
        }
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.card.ICardDisplay
    public final String getLayoutDescription() {
        int i2 = 2 % 2;
        int i3 = f18928o + 21;
        f18926l = i3 % 128;
        int i4 = i3 % 2;
        String strF = this.innerCard.f();
        int i5 = f18926l + 69;
        f18928o = i5 % 128;
        int i6 = i5 % 2;
        return strF;
    }

    public final String toString() {
        String label;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder("CardDisplay{label=");
        if (getLabel() == null) {
            int i3 = f18926l + 83;
            f18928o = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            label = "";
        } else {
            label = getLabel();
        }
        String string = sb.append(label).append(", foregroundColor=").append(getForegroundColor() == null ? "" : getForegroundColor()).append(", layoutDescription=").append(getLayoutDescription() == null ? "" : getLayoutDescription()).append(", description=").append(getDescription() != null ? getDescription() : "").append(AbstractJsonLexerKt.END_OBJ).toString();
        int i4 = f18928o + 87;
        f18926l = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
