package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import fr.antelop.sdk.exception.WalletValidationException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.n;
import o.a.q;
import o.d.d;
import o.er.g;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class CardDisplayService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f18999a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f19000b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f19001c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f19002d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f19003e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19004f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f19005g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19006h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19007i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f19008j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19009k = 0;
    private final g innerCardDisplayService;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, byte r11) {
        /*
            byte[] r8 = fr.antelop.sdk.digitalcard.CardDisplayService.$$a
            int r1 = r10 + 71
            int r2 = r9 + 4
            int r7 = r11 * 4
            int r0 = r7 + 1
            byte[] r6 = new byte[r0]
            r5 = 0
            if (r8 != 0) goto L28
            r0 = r2
            r4 = r7
            r3 = r5
        L12:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L15:
            int r0 = r2 + 1
            byte r2 = (byte) r1
            r6[r3] = r2
            if (r3 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L22:
            int r3 = r3 + 1
            r2 = r8[r0]
            r4 = r1
            goto L12
        L28:
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.CardDisplayService.$$c(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f19009k = -1727729505;
        f19008j = 243416390;
        f19003e = -80254852;
        f19001c = -2106347528;
        f19002d = -911513097;
        f19000b = 1393920928;
        f18999a = 1261874227;
        f19006h = 0;
        f19007i = 1;
        f19005g = 1202157676835671753L;
        f19004f = -1270219368;
    }

    public CardDisplayService(g gVar) {
        this.innerCardDisplayService = gVar;
    }

    public static Object[] b(Context context, int i2, int i3) {
        int i4 = 1;
        if (context == null) {
            Object[] objArr = {new int[]{(i + i) - (i & i)}, new int[]{i2}, null, new int[]{i2}};
            int i5 = f19008j * (-1090343617);
            f19008j = i5;
            int i6 = ~i5;
            int i7 = ~((-476082176) | i6);
            int i8 = 1356832976 + (((i7 + 202065846) - (i7 & 202065846)) * 226) + (((~((-1) - (((-1) - i6) & ((-1) - (-274737226))))) | ((-1) - (((-1) - (~((-1) - (((-1) - (-202065847)) & ((-1) - i5))))) & ((-1) - 720896)))) * (-113)) + ((~(i5 | (-476082176))) * 113);
            int i9 = f18999a * 644246316;
            f18999a = i9;
            int i10 = ~i8;
            int i11 = ~i9;
            int i12 = ~(((-1) - (((-1) - i10) | ((-1) - i11))) | (i10 ^ i11));
            int i13 = (-1) ^ i9;
            int i14 = ~((i13 + i9) - (i13 & i9));
            int i15 = (-1) - (((-1) - (i12 & i14)) & ((-1) - (i12 ^ i14)));
            int i16 = ~i11;
            int i17 = i15 ^ i16;
            int i18 = i15 & i16;
            int i19 = (i8 * (-958)) + (((i18 + i17) - (i18 & i17)) * 959) + ((~i8) * (-959));
            int i20 = ~((-1) - (((-1) - ((-1) ^ i11)) & ((-1) - i11)));
            int i21 = ~i8;
            int i22 = ~((-1) - (((-1) - ((i21 + i9) - (i21 | i9))) & ((-1) - (i21 ^ i9))));
            int i23 = i20 ^ i22;
            int i24 = i20 & i22;
            int i25 = (i24 + i23) - (i24 & i23);
            int i26 = ~i9;
            int i27 = i3 + i19 + (((i26 & i25) | (i25 ^ i26)) * 959);
            int i28 = i27 << 13;
            int i29 = ~((i27 + i28) - (i27 | i28));
            int i30 = i27 | i28;
            int i31 = (i30 + i29) - (i30 | i29);
            int i32 = i31 >>> 17;
            int i33 = ~((-1) - (((-1) - i31) | ((-1) - i32)));
            int i34 = (i31 + i32) - (i31 & i32);
            int i35 = (i34 + i33) - (i34 | i33);
            int i36 = i35 << 5;
            int i37 = ~i36;
            int i38 = (i37 + i35) - (i37 | i35);
            int i39 = ~i35;
            int i40 = (i39 + i36) - (i39 | i36);
            return objArr;
        }
        try {
            int i41 = -(-ExpandableListView.getPackedPositionGroup(0L));
            Object[] objArr2 = new Object[1];
            l("菬譤鋶驮ꇲꤧ냧롶쟽콨훪\ude4e\ue5d6\ued58\uf482ﱊ\u0bc3ፁ\u1ad8∑⧂ㄌ㣴䁳俠圕廽晧淢甁粮萲鎈鬆ꊉꨟ놋뤅", (i41 & 2179) + ((-1) - (((-1) - i41) & ((-1) - 2179))), objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            int i42 = 32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i43 = 215 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16)));
            int i44 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i45 = i44 * (-183);
            int i46 = (((i45 - 2379) - ((-2379) & i45)) << 1) - (i45 ^ (-2379));
            int i47 = ~i44;
            int i48 = ~i2;
            int i49 = (i47 + i48) - (i47 & i48);
            int i50 = ~((-1) - (((-1) - (i49 ^ 13)) & ((-1) - ((i49 + 13) - (i49 | 13)))));
            int i51 = ~i2;
            int i52 = (-1) - (((-1) - (-14)) & ((-1) - i51));
            int i53 = ~((i52 ^ i44) | ((-1) - (((-1) - i52) | ((-1) - i44))));
            int i54 = -(-(((-1) - (((-1) - (i50 ^ i53)) & ((-1) - ((i53 + i50) - (i53 | i50))))) * (-184)));
            int i55 = (((i46 + i54) - (i46 & i54)) << 1) - (i54 ^ i46);
            int i56 = ~i44;
            int i57 = i56 ^ (-14);
            int i58 = (-1) - (((-1) - i56) | ((-1) - (-14)));
            int i59 = (-1) - (((-1) - (~((i58 + i57) - (i58 & i57)))) & ((-1) - (~((i47 & i51) | (i47 ^ i51)))));
            int i60 = (-14) ^ i48;
            int i61 = ((-14) + i48) - ((-14) | i48);
            int i62 = ~((i60 + i61) - (i60 & i61));
            int i63 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i59) | ((-1) - i62)))) & ((-1) - (i59 ^ i62)))) * 184));
            int i64 = (i55 ^ i63) + ((i63 & i55) << 1);
            int i65 = -(-(((i44 ^ 13) | ((i44 + 13) - (i44 | 13))) * 184));
            Object[] objArr4 = new Object[1];
            m(i42, i43, (i64 ^ i65) + (((i65 + i64) - (i65 | i64)) << 1), false, "￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮￨\u0000\ufffe￮\ufff9￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012ￗ\ufffa", objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                int i66 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i67 = f19000b * (-294774693);
                f19000b = i67;
                int i68 = (i66 * (-432)) - (-945686);
                int i69 = ~i66;
                int i70 = ~i67;
                int i71 = i69 ^ i70;
                int i72 = (-1) - (((-1) - i70) | ((-1) - i69));
                int i73 = (i72 + i71) - (i72 & i71);
                int i74 = (~((-1) - (((-1) - ((i73 + 2179) - (i73 | 2179))) & ((-1) - (i73 ^ 2179))))) * 433;
                int i75 = ((i68 | i74) << 1) - (i68 ^ i74);
                int i76 = -(-(((~(((-2180) + i67) - ((-2180) & i67))) | i69) * (-433)));
                int i77 = (i75 & i76) + ((i76 + i75) - (i76 & i75));
                int i78 = ~(i67 | (~i66));
                int i79 = ~((-1) - (((-1) - ((-1) - (((-1) - i66) | ((-1) - 2179)))) & ((-1) - (i66 ^ 2179))));
                int i80 = i78 ^ i79;
                int i81 = i79 & i78;
                int i82 = ((i81 + i80) - (i81 & i80)) * 433;
                int i83 = (i77 & i82) + ((-1) - (((-1) - i82) & ((-1) - i77)));
                Object[] objArr6 = new Object[1];
                l("菬譤鋶驮ꇲꤧ냧롶쟽콨훪\ude4e\ue5d6\ued58\uf482ﱊ\u0bc3ፁ\u1ad8∑⧂ㄌ㣴䁳俠圕廽晧淢甁粮萲鎈鬆ꊉꨟ놋뤅", i83, objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                int iRgb = (-16777185) - Color.rgb(0, 0, 0);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + JfifUtil.MARKER_SOI;
                int threadPriority = Process.getThreadPriority(0);
                int iNextInt = new Random().nextInt();
                int i84 = threadPriority * (-115);
                int i85 = ((-2300) ^ i84) + (((i84 - 2300) - (i84 | (-2300))) << 1);
                int i86 = (~iNextInt) | 20;
                int i87 = (~((-1) - (((-1) - (i86 & threadPriority)) & ((-1) - (i86 ^ threadPriority))))) * (-116);
                int i88 = (i85 ^ i87) + (((-1) - (((-1) - i87) | ((-1) - i85))) << 1);
                int i89 = iNextInt ^ 20;
                int i90 = (-1) - (((-1) - iNextInt) | ((-1) - 20));
                int i91 = ~threadPriority;
                int i92 = ((i88 + (((i89 + i90) - (i89 & i90)) * 116)) + (((~((-1) - (((-1) - ((-1) - (((-1) - i91) | ((-1) - iNextInt)))) & ((-1) - (i91 ^ iNextInt))))) | (~((-1) - (((-1) - (((-21) + i91) - ((-21) | i91))) & ((-1) - ((-21) ^ i91)))))) * 116)) >> 6;
                int iNextInt2 = new Random().nextInt();
                int i93 = ~i92;
                int i94 = ~iNextInt2;
                int i95 = ~((i93 ^ i94) | (i94 & i93));
                int i96 = i95 ^ 7;
                int i97 = i95 & 7;
                int i98 = (((i92 * (-518)) - 3626) - (~(-(-(((i96 + i97) - (i96 & i97)) * 519))))) - 1;
                int i99 = ~iNextInt2;
                int i100 = (-1) - (((-1) - (i93 ^ i99)) & ((-1) - ((-1) - (((-1) - i93) | ((-1) - i99)))));
                int i101 = i100 ^ 7;
                int i102 = (i100 + 7) - (i100 | 7);
                int i103 = ~((i102 + i101) - (i102 & i101));
                int i104 = (i92 + 7) - (7 & i92);
                int i105 = ~((-1) - (((-1) - (i104 ^ iNextInt2)) & ((-1) - ((i104 + iNextInt2) - (i104 | iNextInt2)))));
                int i106 = i103 ^ i105;
                int i107 = i103 & i105;
                int i108 = (i98 - (~(-(-(((i106 + i107) - (i106 & i107)) * (-519)))))) - 1;
                int i109 = ~((-1) - (((-1) - ((iNextInt2 + 7) - (iNextInt2 | 7))) & ((-1) - (iNextInt2 ^ 7))));
                int i110 = i92 ^ i109;
                int i111 = i92 & i109;
                Object[] objArr7 = new Object[1];
                m(iRgb, keyRepeatTimeout, (i108 - (~(((i111 + i110) - (i111 & i110)) * 519))) - 1, true, "￨\ufffaￗ\ufffe\u0000￨￮\u0012 \r\u0010\uffefￋ\u000f\u0014\u001a\u001d\u000f\u0019￬￨\ufff9￮ￗ\u000f\u0014\u001a\u001d\u000f\u0019￬", objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    int i112 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int iNextInt3 = new Random().nextInt(204598247);
                    int i113 = i112 * 881;
                    int i114 = (((-1) - (((-1) - i113) & ((-1) - 1920580))) << 1) - (i113 ^ 1920580);
                    int i115 = ~i112;
                    int i116 = ~((-1) - (((-1) - (i115 ^ (-2181))) & ((-1) - ((i115 - 2181) - ((-2181) | i115)))));
                    int i117 = i115 ^ iNextInt3;
                    int i118 = (i115 + iNextInt3) - (i115 | iNextInt3);
                    int i119 = ~((i118 + i117) - (i118 & i117));
                    int i120 = (-1) - (((-1) - (i119 & i116)) & ((-1) - (i116 ^ i119)));
                    int i121 = ~((-1) - (((-1) - ((-1) - (((-1) - (-2181)) | ((-1) - iNextInt3)))) & ((-1) - ((-2181) ^ iNextInt3))));
                    int i122 = (i114 - (~(-(-(((i120 + i121) - (i120 & i121)) * (-880)))))) - 1;
                    int i123 = ~i112;
                    int i124 = ~iNextInt3;
                    int i125 = i123 ^ i124;
                    int i126 = i123 & i124;
                    int i127 = ~((i126 + i125) - (i126 & i125));
                    int i128 = (i127 & 2180) | (i127 ^ 2180);
                    int i129 = i112 ^ iNextInt3;
                    int i130 = i112 & iNextInt3;
                    int i131 = ~((i129 + i130) - (i129 & i130));
                    int i132 = i128 ^ i131;
                    int i133 = i128 & i131;
                    int i134 = -(-(((i133 + i132) - (i133 & i132)) * (-880)));
                    int i135 = (i122 ^ i134) + ((i134 & i122) << 1);
                    int i136 = (~(i112 | iNextInt3)) * 880;
                    Object[] objArr9 = new Object[1];
                    l("菬譤鋶驮ꇲꤧ냧롶쟽콨훪\ude4e\ue5d6\ued58\uf482ﱊ\u0bc3ፁ\u1ad8∑⧂ㄌ㣴䁳俠圕廽晧淢甁粮萲鎈鬆ꊉꨟ놋뤅", (((-1) - (((-1) - i135) & ((-1) - i136))) << 1) - (i136 ^ i135), objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        int i137 = -TextUtils.indexOf("", "", 0, 0);
                        Object[] objArr10 = new Object[1];
                        l("菧\ud83d㑈邋\uecbd䣆ꔜŻ嵍릔ᖺ燕츟⨹虔\ue2d3㺕髌\uf712匽꽇இ枼", (i137 & 23509) + ((i137 + 23509) - (i137 & 23509)), objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int i138 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        Object[] objArr11 = new Object[1];
                        l("菡붔＜㢳稻뮶\uf527㚦灙뇌\uf36d⳺湼꿬\ue963⬚撄", (((-1) - (((-1) - i138) & ((-1) - 15991))) << 1) - (i138 ^ 15991), objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            int iMyTid = Process.myTid() >> 22;
                            int i139 = iMyTid * 784;
                            int i140 = ((i139 - 18384038) - (i139 | (-18384038))) + (i139 | (-18384038));
                            int i141 = (i140 ^ 18408330) + (((-1) - (((-1) - 18408330) | ((-1) - i140))) << 1);
                            int i142 = ~iMyTid;
                            int i143 = (i142 ^ i51) | ((i142 + i51) - (i142 | i51));
                            int i144 = (~((-1) - (((-1) - ((-1) - (((-1) - i143) | ((-1) - 23509)))) & ((-1) - (i143 ^ 23509))))) * (-783);
                            int i145 = (((-1) - (((-1) - i141) & ((-1) - i144))) << 1) - (i144 ^ i141);
                            int i146 = ~((i51 ^ 23509) | ((-1) - (((-1) - i51) | ((-1) - 23509))));
                            int i147 = (((-1) - (((-1) - i142) | ((-1) - i146))) | (i142 ^ i146)) * 783;
                            Object[] objArr12 = new Object[1];
                            l("菧\ud83d㑈邋\uecbd䣆ꔜŻ嵍릔ᖺ燕츟⨹虔\ue2d3㺕髌\uf712匽꽇இ枼", ((-1) - (((-1) - i145) | ((-1) - i147))) + (i147 | i145), objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            int deadChar = KeyEvent.getDeadChar(0, 0);
                            int i148 = (deadChar * (-1529)) - 28994564;
                            int i149 = ~deadChar;
                            int i150 = (i149 + 37951) - (37951 & i149);
                            int i151 = (-1) - (((-1) - (~((-1) - (((-1) - (i150 ^ i2)) & ((-1) - (i150 & i2)))))) & ((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - (i149 ^ (-37952))) & ((-1) - (i149 & (-37952)))))) & ((-1) - i48))))));
                            int i152 = ~((-1) - (((-1) - (((-37952) + deadChar) - ((-37952) & deadChar))) & ((-1) - i2)));
                            int i153 = -(-(((i151 + i152) - (i151 & i152)) * 765));
                            int i154 = ((i148 | i153) << 1) - (i148 ^ i153);
                            int i155 = ~deadChar;
                            int i156 = ((~((i155 ^ i48) | (i155 & i48))) | (~((i155 ^ (-37952)) | ((-1) - (((-1) - i155) | ((-1) - (-37952))))))) * 1530;
                            int i157 = (-37952) ^ i51;
                            int i158 = (-1) - (((-1) - (-37952)) | ((-1) - i51));
                            int i159 = (i158 + i157) - (i158 & i157);
                            int i160 = (i154 & i156) + ((-1) - (((-1) - i156) & ((-1) - i154))) + (((~(((deadChar + i159) - (deadChar | i159)) | (i159 ^ deadChar))) | (~((i149 ^ i2) | (i149 & i2)))) * 765);
                            Object[] objArr13 = new Object[1];
                            l("菡ៜꮌ㽫팛曞流蹞∙뗔䦾\udd52焟Ӑ", i160, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                int i161 = -TextUtils.getTrimmedLength("");
                                int i162 = (((-1) - (((-1) - i161) & ((-1) - 33))) << 1) - (i161 ^ 33);
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 230;
                                int iAlpha = Color.alpha(0);
                                int id = (int) Thread.currentThread().getId();
                                int i163 = iAlpha * (-244);
                                int i164 = (i163 & 3444) + (i163 | 3444);
                                int i165 = ~id;
                                int i166 = (-15) ^ i165;
                                int i167 = (i165 - 15) - (i165 | (-15));
                                int i168 = ((-1) - (((-1) - (~((i167 + i166) - (i167 & i166)))) & ((-1) - (~(((-1) - (((-1) - (-15)) | ((-1) - iAlpha))) | ((-15) ^ iAlpha)))))) * (-245);
                                int i169 = (((-1) - (((-1) - i164) & ((-1) - i168))) << 1) - (i168 ^ i164);
                                int i170 = ((-1) - (((-1) - id) | ((-1) - (-15)))) | ((-15) ^ id);
                                int i171 = i169 + ((~i170) * (-245));
                                int i172 = ~i170;
                                int i173 = ((i172 & iAlpha) | (iAlpha ^ i172)) * 245;
                                Object[] objArr15 = new Object[1];
                                m(i162, packedPositionChild, (i171 ^ i173) + ((i173 & i171) << 1), false, "￮\uffff\u0001\t\uffff\u0005\u0003￫\uffff\f\uffff\u0005\u0003\u0010\uffff\f\u0002\u0010\r\u0007\u0002ￌ\u0001\r\f\u0012\u0003\f\u0012ￌ\u000e\u000bￌ", objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14;
                                int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                int i174 = f19002d * 338251505;
                                f19002d = i174;
                                int i175 = (jumpTapTimeout * (-344)) - 79464;
                                int i176 = ~jumpTapTimeout;
                                int i177 = i176 ^ (-232);
                                int i178 = (i176 - 232) - ((-232) | i176);
                                int i179 = ~((i177 + i178) - (i177 & i178));
                                int i180 = ~jumpTapTimeout;
                                int i181 = ~((-1) - (((-1) - (i180 ^ i174)) & ((-1) - (i180 & i174))));
                                int i182 = i179 ^ i181;
                                int i183 = (-1) - (((-1) - i179) | ((-1) - i181));
                                int i184 = ((i182 + i183) - (i182 & i183)) * 345;
                                int i185 = (((i175 + i184) - (i175 & i184)) << 1) - (i175 ^ i184);
                                int i186 = ~i174;
                                int i187 = i176 ^ i186;
                                int i188 = i186 & i176;
                                int i189 = i185 + (((-1) - (((-1) - (~(jumpTapTimeout | (-232)))) & ((-1) - (~((i188 + i187) - (i188 & i187)))))) * 345);
                                int i190 = i180 ^ (-232);
                                int i191 = (-1) - (((-1) - i180) | ((-1) - (-232)));
                                int i192 = (i190 + i191) - (i190 & i191);
                                int i193 = i192 ^ i174;
                                int i194 = i192 & i174;
                                int i195 = i189 + ((~((i194 + i193) - (i194 & i193))) * 345);
                                int i196 = -View.MeasureSpec.getMode(0);
                                Object[] objArr16 = new Object[1];
                                m(scrollDefaultDelay, i195, (i196 ^ 13) + (((-1) - (((-1) - i196) | ((-1) - 13))) << 1), true, "\u0002\n￥\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003\u000b", objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                Object[] objArr17 = new Object[1];
                                l("菧镻껄쁍\ud9a5\uf330Ґᶭ㝽䣂扖箣贇ꚟ뿸턵\ueac6ﰨᗾ⼿䂛姪獏蓒鸩랸줡\ue269ﯴൎ", (((iNormalizeMetaState + 5779) - (5779 & iNormalizeMetaState)) << 1) - (iNormalizeMetaState ^ 5779), objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr18 = new Object[1];
                                l("菵졂ᒻ惯굓煉䗽鉏\ude8b⫠", (iResolveSizeAndState ^ 19373) + (((iResolveSizeAndState + 19373) - (iResolveSizeAndState | 19373)) << 1), objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i197 = 0;
                                while (i197 < length) {
                                    Object obj = objArr19[i197];
                                    int iRgb2 = Color.rgb(0, 0, 0);
                                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                    int i198 = iRgb2 * (-300);
                                    int i199 = (i198 ^ 772936682) + (((-1) - (((-1) - i198) | ((-1) - 772936682))) << i4);
                                    int i200 = iRgb2 ^ 16781139;
                                    int i201 = (16781139 + iRgb2) - (16781139 | iRgb2);
                                    int i202 = (i199 - (~((~(((i201 + i200) - (i201 & i200)) | iFreeMemory)) * (-301)))) - i4;
                                    int i203 = ~(((-16781140) & iFreeMemory) | ((-16781140) ^ iFreeMemory));
                                    int i204 = ~iFreeMemory;
                                    int i205 = i204 ^ iRgb2;
                                    int i206 = (-1) - (((-1) - i204) | ((-1) - iRgb2));
                                    int i207 = ~((i205 + i206) - (i205 & i206));
                                    int i208 = (i202 - (~(((i203 + i207) - (i203 & i207)) * (-301)))) - i4;
                                    int i209 = ~iRgb2;
                                    int i210 = ~((-1) - (((-1) - ((iFreeMemory + i209) - (iFreeMemory | i209))) & ((-1) - (i209 ^ iFreeMemory))));
                                    Object[] objArr20 = new Object[i4];
                                    l("菞賻鴕깏뻳", (i208 - (~(((i210 & (-16781140)) | ((-16781140) ^ i210)) * 301))) - i4, objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        int i211 = -TextUtils.lastIndexOf("", '0');
                                        int i212 = (i211 & 36) + (i211 | 36);
                                        int i213 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i214 = (((i213 + 231) - (231 & i213)) << i4) - (i213 ^ 231);
                                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                        int i215 = iKeyCodeFromString * (-755);
                                        int i216 = (((i215 - 25670) - ((-25670) & i215)) << i4) - (i215 ^ (-25670));
                                        int i217 = ~iKeyCodeFromString;
                                        int i218 = i216 + ((~((-1) - (((-1) - i217) & ((-1) - (-35))))) * 1512);
                                        int i219 = ~((-1) - (((-1) - ((i217 - 35) - (i217 | (-35)))) & ((-1) - (i217 ^ (-35)))));
                                        int i220 = (iKeyCodeFromString & 34) | (iKeyCodeFromString ^ 34);
                                        int i221 = ~(i220 | i2);
                                        int i222 = i218 + ((((i219 + i221) - (i219 | i221)) | (i219 ^ i221)) * (-756));
                                        int i223 = -(-((((-1) - (((-1) - i220) | ((-1) - i51))) | (i220 ^ i51)) * 756));
                                        Object[] objArr22 = new Object[i4];
                                        m(i212, i214, (((i222 + i223) - (i222 & i223)) << i4) - (i223 ^ i222), true, "\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ\u0010\u000e\u0001\uffffￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0015\u000e\u000b", objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        int i224 = -View.combineMeasuredStates(0, 0);
                                        int i225 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        Object[] objArr23 = new Object[i4];
                                        m((((i224 + 11) - (11 & i224)) << i4) - (i224 ^ 11), ((i225 + 233) - (233 | i225)) + ((i225 + 233) - (i225 & 233)), 9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, "\r￢\u0007\f\r\ufffa\u0007￼\ufffe\u0000\ufffe", objArr23);
                                        String str = (String) objArr23[0];
                                        Class<?>[] clsArr = new Class[i4];
                                        clsArr[0] = String.class;
                                        Object objInvoke3 = cls5.getMethod(str, clsArr).invoke(null, objArr21);
                                        try {
                                            int i226 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                            Object[] objArr24 = new Object[i4];
                                            l("菧훯⧬糡ퟵ⫌緈킙⯝绖톮Ⓙ羷튳▐磁펆⚜秖챐❣穲쵲⁆筚친⅂瑞", ((i226 + 21767) - (21767 | i226)) + (i226 | 21767), objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                            int i227 = ((-1) - (((-1) - keyRepeatDelay) | ((-1) - 11))) + ((-1) - (((-1) - keyRepeatDelay) & ((-1) - 11)));
                                            int i228 = 233 - (~(-TextUtils.getOffsetAfter("", 0)));
                                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                            int i229 = f19001c * (-38488305);
                                            f19001c = i229;
                                            int i230 = (iIndexOf * 868) + 6076;
                                            int i231 = ~iIndexOf;
                                            int i232 = ~i229;
                                            int i233 = i231 ^ i232;
                                            int i234 = (i231 + i232) - (i231 | i232);
                                            int i235 = ~((i233 + i234) - (i233 & i234));
                                            int i236 = ~(((-8) ^ i232) | ((-1) - (((-1) - (-8)) | ((-1) - i232))));
                                            int i237 = i235 ^ i236;
                                            int i238 = (-1) - (((-1) - i236) | ((-1) - i235));
                                            int i239 = -(-(((i237 + i238) - (i237 & i238)) * (-867)));
                                            int i240 = (i230 ^ i239) + (((i239 + i230) - (i239 | i230)) << 1);
                                            int i241 = ~iIndexOf;
                                            int i242 = i241 ^ (-8);
                                            int i243 = (i241 - 8) - ((-8) | i241);
                                            int i244 = ~((i242 + i243) - (i242 & i243));
                                            int i245 = ~((i241 + i229) - (i241 & i229));
                                            int i246 = (-1) - (((-1) - (i244 ^ i245)) & ((-1) - (i245 & i244)));
                                            int i247 = ~((-1) - (((-1) - ((-8) ^ i229)) & ((-1) - ((-8) & i229))));
                                            int i248 = i246 ^ i247;
                                            int i249 = (-1) - (((-1) - i246) | ((-1) - i247));
                                            int i250 = (i240 - (~(((i248 + i249) - (i248 & i249)) * (-1734)))) - 1;
                                            int i251 = i231 ^ (-8);
                                            int i252 = (-8) & i231;
                                            int i253 = (i251 + i252) - (i251 & i252);
                                            int i254 = ~i229;
                                            int i255 = ~((i253 + i254) - (i253 & i254));
                                            int i256 = i231 ^ 7;
                                            int i257 = (i231 + 7) - (i231 | 7);
                                            int i258 = (i257 + i256) - (i257 & i256);
                                            int i259 = i258 ^ i229;
                                            int i260 = i258 & i229;
                                            int i261 = ~((i260 + i259) - (i260 & i259));
                                            int i262 = i255 ^ i261;
                                            int i263 = (-1) - (((-1) - i261) | ((-1) - i255));
                                            int i264 = (i263 + i262) - (i263 & i262);
                                            int i265 = (-1) - (((-1) - ((-1) - (((-1) - (-8)) | ((-1) - iIndexOf)))) & ((-1) - ((-8) ^ iIndexOf)));
                                            int i266 = i265 ^ i229;
                                            int i267 = (i265 + i229) - (i265 | i229);
                                            int i268 = (i264 | (~((i267 + i266) - (i267 & i266)))) * 867;
                                            Object[] objArr25 = new Object[1];
                                            m(i227, i228, ((i250 + i268) - (i250 | i268)) + ((-1) - (((-1) - i268) & ((-1) - i250))), true, "\ufffe\r\u0012ￛ\b\r\u0012\ufffa\u000b\u000bￚ", objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                int gidForName = 230 - Process.getGidForName("");
                                                int i269 = -ExpandableListView.getPackedPositionGroup(0L);
                                                Object[] objArr27 = new Object[1];
                                                m((packedPositionGroup & 37) + ((-1) - (((-1) - packedPositionGroup) & ((-1) - 37))), gidForName, ((-1) - (((-1) - i269) | ((-1) - 34))) + (i269 | 34), true, "\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ\u0010\u000e\u0001\uffffￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0015\u000e\u000b", objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                int iMyTid2 = Process.myTid() >> 22;
                                                int i270 = iMyTid2 ^ 56359;
                                                int i271 = (iMyTid2 + 56359) - (iMyTid2 | 56359);
                                                int i272 = (((iMyTid2 * 471) + 26545089) - (~(-(-(((i270 + i271) - (i270 & i271)) * (-470)))))) - 1;
                                                int i273 = ~iMyTid2;
                                                int i274 = ~(((-1) - (((-1) - i273) | ((-1) - (-56360)))) | (i273 ^ (-56360)));
                                                int i275 = ~((-1) - (((-1) - ((-56360) ^ i2)) & ((-1) - (((-56360) + i2) - ((-56360) | i2)))));
                                                int i276 = i274 ^ i275;
                                                int i277 = (-1) - (((-1) - i274) | ((-1) - i275));
                                                int i278 = (i277 + i276) - (i277 & i276);
                                                int i279 = i48 ^ iMyTid2;
                                                int i280 = (-1) - (((-1) - i48) | ((-1) - iMyTid2));
                                                int i281 = -(-(((-1) - (((-1) - i278) & ((-1) - (~((-1) - (((-1) - ((i279 + i280) - (i279 & i280))) & ((-1) - 56359))))))) * (-470)));
                                                int i282 = ((i272 + i281) - (i272 | i281)) + (i272 | i281);
                                                int i283 = (-56360) ^ iMyTid2;
                                                int i284 = (-56360) & iMyTid2;
                                                int i285 = (i283 + i284) - (i283 & i284);
                                                int i286 = ~(((-1) - (((-1) - i285) | ((-1) - i2))) | (i285 ^ i2));
                                                int i287 = (-1) - (((-1) - (iMyTid2 & i51)) & ((-1) - (i51 ^ iMyTid2)));
                                                int i288 = ~(((-1) - (((-1) - i287) | ((-1) - 56359))) | (i287 ^ 56359));
                                                Object[] objArr28 = new Object[1];
                                                l("菡忄㮦ព\uf368켤\uab18蛲拽㺼ᩲ\uf65f툻긛觍斬䆗ᵥ諾", (i282 - (~(-(-(((i288 + i286) - (i288 & i286)) * 470))))) - 1, objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i289 = 0; i289 < 2; i289++) {
                                                    Object obj2 = objArr3[i289];
                                                    try {
                                                        int i290 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33;
                                                        int i291 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        int id2 = (int) Thread.currentThread().getId();
                                                        int i292 = i291 * (-665);
                                                        int i293 = (i292 ^ 75484) + (((-1) - (((-1) - i292) | ((-1) - 75484))) << 1);
                                                        int i294 = (~i291) * (-333);
                                                        int i295 = (i293 & i294) + ((-1) - (((-1) - i294) & ((-1) - i293)));
                                                        int i296 = ~i291;
                                                        int i297 = ~id2;
                                                        int i298 = ~((-1) - (((-1) - (i296 ^ i297)) & ((-1) - ((i296 + i297) - (i296 | i297)))));
                                                        int i299 = ~(((-1) - (((-1) - id2) | ((-1) - 226))) | (id2 ^ 226));
                                                        int i300 = i295 + ((((i299 + i298) - (i299 | i298)) | (i298 ^ i299)) * 333);
                                                        int i301 = ~((i296 & id2) | (i296 ^ id2));
                                                        int i302 = ~((-1) - (((-1) - (i297 ^ 226)) & ((-1) - ((i297 + 226) - (i297 | 226)))));
                                                        int i303 = i301 ^ i302;
                                                        int i304 = i301 & i302;
                                                        int i305 = (i300 - (~(-(-(((i304 + i303) - (i304 & i303)) * 333))))) - 1;
                                                        int i306 = -TextUtils.indexOf("", "", 0);
                                                        int iMyUid = Process.myUid();
                                                        int i307 = i306 * 881;
                                                        int i308 = (i307 ^ 29954) + (((i307 + 29954) - (i307 | 29954)) << 1);
                                                        int i309 = ~i306;
                                                        int i310 = i309 ^ (-35);
                                                        int i311 = i309 & (-35);
                                                        int i312 = ~((i310 + i311) - (i310 & i311));
                                                        int i313 = ~((-1) - (((-1) - i309) & ((-1) - iMyUid)));
                                                        int i314 = (-1) - (((-1) - ((i312 + i313) - (i312 | i313))) & ((-1) - (i312 ^ i313)));
                                                        int i315 = ~(((-35) & iMyUid) | ((-35) ^ iMyUid));
                                                        int i316 = i314 ^ i315;
                                                        int i317 = (-1) - (((-1) - i314) | ((-1) - i315));
                                                        int i318 = i308 + (((i317 + i316) - (i317 & i316)) * (-880));
                                                        int i319 = ~iMyUid;
                                                        int i320 = ~(((-1) - (((-1) - i309) | ((-1) - i319))) | (i309 ^ i319));
                                                        int i321 = ((-1) - (((-1) - i320) | ((-1) - 34))) | (i320 ^ 34);
                                                        int i322 = i306 ^ iMyUid;
                                                        int i323 = (i306 + iMyUid) - (i306 | iMyUid);
                                                        int i324 = (i323 + i322) - (i323 & i322);
                                                        int i325 = ~i324;
                                                        int i326 = -(-(((-1) - (((-1) - ((i325 + i321) - (i325 | i321))) & ((-1) - (i321 ^ i325)))) * (-880)));
                                                        int i327 = (((-1) - (((-1) - i318) & ((-1) - i326))) << 1) - (i326 ^ i318);
                                                        int i328 = (~i324) * 880;
                                                        Object[] objArr29 = new Object[1];
                                                        m(i290, i305, (((-1) - (((-1) - i327) & ((-1) - i328))) << 1) - (i328 ^ i327), false, "\u000b\u0002\u0017\u0002ￏ\u0014\u0006\u0004\u0016\u0013\n\u0015\u001aￏ\u0004\u0006\u0013\u0015ￏ\ufff9ￖ\uffd1ￚ￤\u0006\u0013\u0015\n\u0007\n\u0004\u0002\u0015\u0006", objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int i329 = -View.resolveSizeAndState(0, 0, 0);
                                                        int i330 = ((-1) - (((-1) - i329) | ((-1) - 23))) + ((i329 + 23) - (i329 & 23));
                                                        int modifierMetaStateMask = 225 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                        int i331 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                        int i332 = (i331 * 989) - 2961;
                                                        int i333 = ~elapsedCpuTime;
                                                        int i334 = (-4) | i333;
                                                        int i335 = ~((-1) - (((-1) - (i334 ^ i331)) & ((-1) - (i334 & i331))));
                                                        int i336 = (-1) - (((-1) - i331) & ((-1) - 3));
                                                        int i337 = -(-(((-1) - (((-1) - i335) & ((-1) - (~((i336 + elapsedCpuTime) - (i336 & elapsedCpuTime)))))) * 988));
                                                        int i338 = ((((i332 + i337) - (i332 | i337)) + (i337 | i332)) - (~(-(-(((-1) - (((-1) - (i331 ^ (-4))) & ((-1) - ((-4) & i331)))) * (-988)))))) - 1;
                                                        int i339 = ~i331;
                                                        int i340 = (-1) - (((-1) - (~((-1) - (((-1) - (i339 & (-4))) & ((-1) - (i339 ^ (-4))))))) & ((-1) - (~(((-1) - (((-1) - (-4)) | ((-1) - elapsedCpuTime))) | ((-4) ^ elapsedCpuTime)))));
                                                        int i341 = i333 ^ i331;
                                                        int i342 = i331 & i333;
                                                        int i343 = (i342 + i341) - (i342 & i341);
                                                        int i344 = i343 ^ 3;
                                                        int i345 = i343 & 3;
                                                        int i346 = ~((i345 + i344) - (i345 & i344));
                                                        int i347 = i340 ^ i346;
                                                        int i348 = (i340 + i346) - (i340 | i346);
                                                        Object[] objArr30 = new Object[1];
                                                        m(i330, modifierMetaStateMask, (i338 - (~(((i348 + i347) - (i348 & i347)) * 988))) - 1, true, "\u0015\u0006\b\r\u0002\u0011\n\u0004\u000f\n\u0013\ufff1\uffd1\uffd1ￖ\ufff9\u0015\u0004\u0006\u000b\u0003\u0016\ufff4", objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{(-1) - (((-1) - (i2 & (-2))) & ((-1) - (1 & i51)))}};
                                                            int iNextInt4 = new Random().nextInt();
                                                            int i349 = (-1378644383) + (((-1) - (((-1) - (~(iNextInt4 | 401149956))) & ((-1) - 276998065))) * 191) + (((~((-1) - (((-1) - (~iNextInt4)) & ((-1) - 401149956)))) | 174001) * 191);
                                                            int i350 = ~i349;
                                                            int i351 = ~((-1) - (((-1) - ((-1) - (((-1) - i350) | ((-1) - 16)))) & ((-1) - (i350 ^ 16))));
                                                            int i352 = (-17) ^ i349;
                                                            int i353 = (-1) - (((-1) - (-17)) | ((-1) - i349));
                                                            int i354 = (-8000) + (i349 * (-500)) + ((i351 | (~((-1) - (((-1) - ((i352 + i353) - (i352 & i353))) & ((-1) - i2))))) * 501) + ((~((-1) - (((-1) - (~i349)) & ((-1) - (-17))))) * 1002);
                                                            int i355 = (-17) ^ i51;
                                                            int i356 = ((-17) + i51) - ((-17) | i51);
                                                            int i357 = (i355 + i356) - (i355 & i356);
                                                            int i358 = -(-((i354 - (~((~(((-1) - (((-1) - i357) | ((-1) - i349))) | (i357 ^ i349))) * 501))) - 1));
                                                            int i359 = ((i3 + i358) - (i3 | i358)) + ((-1) - (((-1) - i3) & ((-1) - i358)));
                                                            int i360 = (i359 << 13) ^ i359;
                                                            int i361 = i360 >>> 17;
                                                            int i362 = (-1) - (((-1) - ((-1) - (((-1) - (~i360)) | ((-1) - i361)))) & ((-1) - ((-1) - (((-1) - (~i361)) | ((-1) - i360)))));
                                                            int i363 = i362 << 5;
                                                            ((int[]) objArr31[0])[0] = (-1) - (((-1) - ((i362 + i363) - (i362 & i363))) | ((-1) - (~(i362 & i363))));
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
                                                i197++;
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
        Object[] objArr32 = {new int[]{(-1) - (((-1) - (i | i)) | ((-1) - (~(i & i))))}, new int[]{i2}, null, new int[]{i2}};
        int i364 = f19009k * 645430631;
        f19009k = i364;
        int i365 = ~i364;
        int i366 = 612448640 + (((~((i365 - 566836155) - (i365 & (-566836155)))) | 558432256) * (-245));
        int i367 = ~(i364 | (-566836155));
        int i368 = i366 + (i367 * (-245)) + (((i367 + 111311867) - (i367 & 111311867)) * 245);
        int i369 = f19003e * (-1609129777);
        f19003e = i369;
        int i370 = ((-1) - (~(i368 * 471))) + (i368 * (-470));
        int i371 = ~i368;
        int i372 = ~((-1) - (((-1) - (i371 ^ i369)) & ((-1) - (i371 & i369))));
        int i373 = ~i369;
        int i374 = ~((-1) - (((-1) - (i373 & i368)) & ((-1) - (i373 ^ i368))));
        int i375 = -(-((((-1) - (((-1) - i372) | ((-1) - i374))) | (i372 ^ i374)) * (-470)));
        int i376 = (i370 & i375) + ((i370 + i375) - (i370 & i375));
        int i377 = i371 ^ i369;
        int i378 = i371 & i369;
        int i379 = ~((i378 + i377) - (i378 & i377));
        int i380 = ~i369;
        int i381 = ~(((-1) - (((-1) - i380) | ((-1) - i368))) | (i380 ^ i368));
        int i382 = ((-1) - (((-1) - ((i381 + i379) - (i381 | i379))) & ((-1) - (i379 ^ i381)))) * 470;
        int i383 = -(-((i376 ^ i382) + (((-1) - (((-1) - i382) | ((-1) - i376))) << 1)));
        int i384 = (i3 ^ i383) + (((-1) - (((-1) - i3) | ((-1) - i383))) << 1);
        int i385 = (i384 << 13) ^ i384;
        int i386 = i385 >>> 17;
        int i387 = ~i386;
        int i388 = ((-1) - (((-1) - (~i385)) | ((-1) - i386))) | ((i387 + i385) - (i387 | i385));
        int i389 = i388 << 5;
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{85, MessagePack.Code.BIN32, -28, 50};
        $$b = 98;
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 75;
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i7 = i5 + 9;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 43 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i9 = $10 + 57;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = d.a(TextUtils.lastIndexOf("", '0', 0) + 732, (char) (Color.rgb(0, 0, 0) + 16785149), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i11] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f19005g ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    objA2 = d.a(836 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.getOffsetAfter("", 0) + 27279), TextUtils.indexOf("", "", 0) + 11, -2145994442, false, $$c(b4, (byte) (7 & b4), (byte) 0), new Class[]{Object.class, Object.class});
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
        int i12 = $10 + 69;
        $11 = i12 % 128;
        while (true) {
            int i13 = i12 % 2;
            if (qVar.f19948a >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = d.a(1452497747);
            if (objA3 == null) {
                byte b5 = (byte) (-1);
                objA3 = d.a(836 - Color.argb(0, 0, 0, 0), (char) (Color.alpha(0) + 27279), 10 - TextUtils.lastIndexOf("", '0', 0, 0), -2145994442, false, $$c(b5, (byte) (7 & b5), (byte) 0), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i12 = $10 + 93;
            $11 = i12 % 128;
        }
    }

    private static void m(int i2, int i3, int i4, boolean z2, String str, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 31;
        int i7 = i6 % 128;
        $11 = i7;
        int i8 = i6 % 2;
        if (str2 != null) {
            int i9 = i7 + 121;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f19004f)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    objA = d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 270, (char) TextUtils.indexOf("", "", 0), 11 - (ViewConfiguration.getTapTimeout() >> 16), -2071844881, false, $$c(b2, (byte) (44 & b2), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    objA2 = d.a(View.MeasureSpec.getMode(0) + 522, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12 - View.resolveSizeAndState(0, 0, 0), 627984172, false, $$c(b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 42))), (byte) 0), new Class[]{Object.class, Object.class});
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
            int i11 = $11 + 71;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i13 = $10 + 73;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i15 = $11 + 95;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr4[nVar.f19944a] = cArr2[(i2 / nVar.f19944a) % 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = d.a(-202660535);
                    if (objA3 == null) {
                        byte b4 = (byte) (-1);
                        objA3 = d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 522, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 13, 627984172, false, $$c(b4, (byte) (42 & b4), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = d.a(-202660535);
                    if (objA4 == null) {
                        byte b5 = (byte) (-1);
                        objA4 = d.a(522 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 12, 627984172, false, $$c(b5, (byte) ((-1) - (((-1) - b5) | ((-1) - 42))), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                int i16 = $10 + 77;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final SecureCardDisplay getSecureCardDisplay() throws WalletValidationException {
        int i2 = 2 % 2;
        SecureCardDisplay secureCardDisplay = new SecureCardDisplay(this.innerCardDisplayService.d());
        int i3 = f19007i + 65;
        f19006h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
        return secureCardDisplay;
    }

    public final DigitalCardServiceStatus getStatus() {
        int i2 = 2 % 2;
        int i3 = f19006h + 17;
        f19007i = i3 % 128;
        int i4 = i3 % 2;
        if (!this.innerCardDisplayService.c()) {
            return DigitalCardServiceStatus.Disabled;
        }
        DigitalCardServiceStatus digitalCardServiceStatus = DigitalCardServiceStatus.Active;
        int i5 = f19006h + 43;
        f19007i = i5 % 128;
        if (i5 % 2 != 0) {
            return digitalCardServiceStatus;
        }
        throw null;
    }
}
