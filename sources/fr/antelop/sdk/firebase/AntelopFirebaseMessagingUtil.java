package fr.antelop.sdk.firebase;

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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.firebase.messaging.RemoteMessage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.k;
import o.a.n;
import o.bo.a;
import o.bo.b;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class AntelopFirebaseMessagingUtil {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f19478a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f19479b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f19480c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f19481d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f19482e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19483f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f19484g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f19485h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f19486i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f19487j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19488k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f19489o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, int r8, int r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r0 = r9 + 107
            byte[] r6 = fr.antelop.sdk.firebase.AntelopFirebaseMessagingUtil.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L25
            r3 = r8
            r2 = r4
        L11:
            int r8 = r8 + r0
            r1 = r2
        L13:
            byte r0 = (byte) r8
            int r3 = r3 + 1
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L22:
            r0 = r6[r3]
            goto L11
        L25:
            r1 = r4
            r3 = r8
            r8 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.firebase.AntelopFirebaseMessagingUtil.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f19488k = 1079270034;
        f19485h = 108856628;
        f19486i = -1618231116;
        f19482e = -1641633806;
        f19478a = -1906382157;
        f19481d = -1727978209;
        f19479b = -1039546585;
        f19480c = 1094682504;
        f19484g = 0;
        f19489o = 1;
        f19483f = -1270219508;
        f19487j = 2105626051260986634L;
    }

    public static Object[] d(Context context, int i2, int i3) {
        int i4 = 0;
        int i5 = 1;
        if (context == null) {
            Object[] objArr = {new int[]{(i + i) - (i | i)}, new int[]{i2}, null, new int[]{i2}};
            int i6 = 578616391 + (((-1) - (((-1) - (~((-1) - (((-1) - (-184972065)) & ((-1) - i2))))) & ((-1) - (-526874550)))) * (-502));
            int i7 = ~i2;
            int i8 = i6 + ((~(((-33698593) + i7) - ((-33698593) & i7))) * (-502)) + (((-1) - (((-1) - (-184972065)) & ((-1) - (~((-1) - (((-1) - (-493175958)) & ((-1) - i2))))))) * 502);
            int i9 = i8 * 193;
            int i10 = i3 * 193;
            int i11 = (i9 ^ i10) + (((i9 + i10) - (i9 | i10)) << 1);
            int i12 = ~i8;
            int i13 = ~(i12 | i3);
            int i14 = i7 ^ i13;
            int i15 = i13 & i7;
            int i16 = ((i15 + i14) - (i15 & i14)) * (-192);
            int i17 = ((i11 + i16) - (i11 | i16)) + ((i16 + i11) - (i16 & i11));
            int i18 = ~i3;
            int i19 = ~((-1) - (((-1) - (i12 ^ i18)) & ((-1) - (i12 & i18))));
            int i20 = i18 ^ i7;
            int i21 = i7 & i18;
            int i22 = ~((i21 + i20) - (i21 & i20));
            int i23 = (((-1) - (((-1) - i22) | ((-1) - i19))) | (i19 ^ i22)) * (-384);
            int i24 = ((i17 | i23) << 1) - (i23 ^ i17);
            int i25 = ~i3;
            int i26 = i12 ^ i25;
            int i27 = (i12 + i25) - (i12 | i25);
            int i28 = (i27 + i26) - (i27 & i26);
            int i29 = ~((-1) - (((-1) - (i28 & i2)) & ((-1) - (i28 ^ i2))));
            int i30 = ~i2;
            int i31 = (-1) - (((-1) - ((i25 + i30) - (i25 | i30))) & ((-1) - (i25 ^ i30)));
            int i32 = ~((i31 + i8) - (i31 & i8));
            int i33 = (i29 & i32) | (i29 ^ i32);
            int i34 = i8 ^ i3;
            int i35 = (-1) - (((-1) - i3) | ((-1) - i8));
            int i36 = ~(i2 | ((i35 + i34) - (i35 & i34)));
            int i37 = i24 + (((-1) - (((-1) - (i36 & i33)) & ((-1) - (i33 ^ i36)))) * 192);
            int i38 = i37 << 13;
            int i39 = ~i38;
            int i40 = (i39 + i37) - (i39 | i37);
            int i41 = (-1) - (((-1) - i38) | ((-1) - (~i37)));
            int i42 = (i41 + i40) - (i41 & i40);
            int i43 = i42 >>> 17;
            int i44 = (-1) - (((-1) - ((i42 + i43) - (i42 & i43))) | ((-1) - (~((i42 + i43) - (i42 | i43)))));
            int i45 = i44 << 5;
            int i46 = ~((i44 + i45) - (i44 | i45));
            int i47 = (i44 + i45) - (i44 & i45);
            return objArr;
        }
        try {
            int i48 = -((byte) KeyEvent.getModifierMetaStateMask());
            int i49 = f19480c * (-1915445996);
            f19480c = i49;
            int i50 = i48 * 50;
            int i51 = (((i50 - 3589) - ((-3589) & i50)) << 1) - (i50 ^ (-3589));
            int i52 = ~i49;
            int i53 = (-38) ^ i52;
            int i54 = ((-38) + i52) - ((-38) | i52);
            int i55 = ~((i53 + i54) - (i53 & i54));
            int i56 = ~(((-38) ^ i48) | ((-38) & i48));
            int i57 = (i51 - (~(((i56 + i55) - (i56 & i55)) * 98))) - 1;
            int i58 = ~((~i48) | i52);
            int i59 = (-1) - (((-1) - ((i58 - 38) - (i58 | (-38)))) & ((-1) - ((-38) ^ i58)));
            int i60 = ~((-1) - (((-1) - i48) & ((-1) - i49)));
            int i61 = (i57 - (~(-(-(((-1) - (((-1) - ((-1) - (((-1) - i59) | ((-1) - i60)))) & ((-1) - (i59 ^ i60)))) * (-49)))))) - 1;
            int i62 = ~((-1) - (((-1) - ((-38) ^ i49)) & ((-1) - ((i49 - 38) - (i49 | (-38))))));
            int i63 = i48 ^ 37;
            int i64 = (-1) - (((-1) - i48) | ((-1) - 37));
            int i65 = ~((i64 + i63) - (i64 & i63));
            int i66 = i62 ^ i65;
            int i67 = (-1) - (((-1) - i62) | ((-1) - i65));
            int i68 = -(-(((i67 + i66) - (i67 & i66)) * 49));
            int i69 = ((i61 + i68) - (i61 | i68)) + ((-1) - (((-1) - i68) & ((-1) - i61)));
            int maximumDrawingCacheSize = 114 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i70 = -Process.getGidForName("");
            int iMyTid = Process.myTid();
            int i71 = i70 * 450;
            int i72 = (i71 ^ (-4928)) + (((i71 - 4928) - (i71 | (-4928))) << 1);
            int i73 = ~i70;
            int i74 = ~((-1) - (((-1) - ((i73 + 11) - (i73 | 11))) & ((-1) - (i73 ^ 11))));
            int i75 = (-12) ^ i70;
            int i76 = (-12) & i70;
            int i77 = (i76 + i75) - (i76 & i75);
            int i78 = ~(((-1) - (((-1) - i77) | ((-1) - iMyTid))) | (i77 ^ iMyTid));
            int i79 = i74 ^ i78;
            int i80 = (-1) - (((-1) - i74) | ((-1) - i78));
            int i81 = -(-(((i80 + i79) - (i80 & i79)) * 449));
            int i82 = (i72 & i81) + ((-1) - (((-1) - i81) & ((-1) - i72)));
            int i83 = ~i70;
            int i84 = ((-1) - (((-1) - i83) | ((-1) - 11))) | (i83 ^ 11);
            int i85 = -(-((~i84) * (-1347)));
            int i86 = (i82 ^ i85) + (((i85 + i82) - (i85 | i82)) << 1);
            int i87 = ~i84;
            int i88 = ~iMyTid;
            int i89 = ((i88 - 12) - (i88 | (-12))) | ((-12) ^ i88);
            int i90 = ~((i70 + i89) - (i70 & i89));
            int i91 = -(-(((-1) - (((-1) - (i90 & i87)) & ((-1) - (i87 ^ i90)))) * 449));
            int i92 = (i86 ^ i91) + ((i91 & i86) << 1);
            Object[] objArr2 = new Object[1];
            l(i69, maximumDrawingCacheSize, i92, true, "\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019", objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            Object[] objArr4 = new Object[1];
            m("崯\uf1a5蒓歉嵬嚛쩎鵘삁등桁Ｖ曆ጱ໓嫝萊煷곆꒾⨃\uef9a䅎٘䦁䷱\ue741怶\uefc6꠱藟쏚\u0d52ـᯠ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                int i93 = -TextUtils.lastIndexOf("", '0', 0);
                Object[] objArr6 = new Object[1];
                l(((-1) - (((-1) - i93) | ((-1) - 37))) + ((-1) - (((-1) - i93) & ((-1) - 37))), View.MeasureSpec.getMode(0) + 114, 12 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), true, "\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019", objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                int i94 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i95 = (i94 * 273) - 8672;
                int i96 = ~i94;
                int i97 = (-1) - (((-1) - (i96 ^ (-33))) & ((-1) - ((-33) & i96)));
                int i98 = ~i2;
                int i99 = i97 ^ i98;
                int i100 = (-1) - (((-1) - i97) | ((-1) - i98));
                int i101 = ~((i99 + i100) - (i99 & i100));
                int i102 = (i94 ^ 32) | (32 & i94);
                int i103 = ~((i102 + i2) - (i102 & i2));
                int i104 = i101 ^ i103;
                int i105 = (-1) - (((-1) - i103) | ((-1) - i101));
                int i106 = ((i104 + i105) - (i104 & i105)) * (-272);
                int i107 = ~i94;
                int i108 = (((i95 ^ i106) + ((i95 & i106) << 1)) - (~(-(-(((-1) - (((-1) - (~((i107 + 32) - (i107 & 32)))) & ((-1) - (~((i96 + i2) - (i96 & i2)))))) * (-272)))))) - 1;
                int i109 = i94 ^ i2;
                int i110 = (-1) - (((-1) - i94) | ((-1) - i2));
                int i111 = ~((i110 + i109) - (i110 & i109));
                int i112 = -(-((((-1) - (((-1) - i111) | ((-1) - 32))) | (i111 ^ 32)) * 272));
                int i113 = (i108 ^ i112) + ((i112 & i108) << 1);
                int i114 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i115 = (i114 * 221) - 23433;
                int i116 = ~i114;
                int i117 = ~((-1) - (((-1) - (i116 & (-108))) & ((-1) - (i116 ^ (-108)))));
                int i118 = ~i2;
                int i119 = (i118 ^ i114) | (i118 & i114);
                int i120 = ~((-1) - (((-1) - (i119 ^ 107)) & ((-1) - (i119 & 107))));
                int i121 = i117 ^ i120;
                int i122 = (i117 + i120) - (i117 | i120);
                int i123 = ((i121 + i122) - (i121 & i122)) * 220;
                int i124 = (i115 ^ i123) + (((-1) - (((-1) - i115) | ((-1) - i123))) << 1);
                int i125 = ~((i98 + 107) - (i98 & 107));
                int i126 = -(-((((-1) - (((-1) - i125) | ((-1) - i114))) | (i114 ^ i125)) * (-440)));
                int i127 = ((i124 | i126) << 1) - (i126 ^ i124);
                int i128 = i114 ^ 107;
                int i129 = (i114 + 107) - (i114 | 107);
                int i130 = ((-1) - (((-1) - ((i129 + i128) - (i129 & i128))) & ((-1) - i2))) * 220;
                int i131 = ((i127 + i130) - (i127 | i130)) + ((i130 + i127) - (i130 & i127));
                int i132 = -View.resolveSizeAndState(0, 0, 0);
                Object[] objArr7 = new Object[1];
                l(i113, i131, (((i132 + 10) - (10 & i132)) << 1) - (i132 ^ 10), false, "\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012￮￨\u0000\ufffeￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮\ufff9￨￬\u0019\u000f", objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    int i133 = -(-Color.rgb(0, 0, 0));
                    int i134 = (i133 ^ 16777254) + (((-1) - (((-1) - i133) | ((-1) - 16777254))) << 1);
                    int i135 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i136 = f19479b * (-1366715299);
                    f19479b = i136;
                    int i137 = (i135 * 70) - 7752;
                    int i138 = ~i135;
                    int i139 = (-1) - (((-1) - (i138 ^ (-115))) & ((-1) - ((i138 - 115) - ((-115) | i138))));
                    int i140 = i139 ^ i136;
                    int i141 = i139 & i136;
                    int i142 = ~((i140 + i141) - (i140 & i141));
                    int i143 = (-1) - (((-1) - (i135 ^ 114)) & ((-1) - (114 & i135)));
                    int i144 = ~((i143 ^ i136) | ((-1) - (((-1) - i143) | ((-1) - i136))));
                    int i145 = ((i142 + i144) - (i142 & i144)) * 69;
                    int i146 = (((-1) - (((-1) - i137) & ((-1) - i145))) << 1) - (i145 ^ i137);
                    int i147 = ~((-1) - (((-1) - (~i135)) & ((-1) - 114)));
                    int i148 = i138 ^ i136;
                    int i149 = (-1) - (((-1) - i138) | ((-1) - i136));
                    int i150 = ~((i148 + i149) - (i148 & i149));
                    int i151 = ((i147 + i150) - (i147 | i150)) | (i147 ^ i150);
                    int i152 = i136 ^ 114;
                    int i153 = (-1) - (((-1) - i136) | ((-1) - 114));
                    int i154 = ~((i153 + i152) - (i153 & i152));
                    int i155 = i151 ^ i154;
                    int i156 = (i151 + i154) - (i151 | i154);
                    int i157 = ((i156 + i155) - (i156 & i155)) * (-69);
                    int i158 = (i146 ^ i157) + (((-1) - (((-1) - i157) | ((-1) - i146))) << 1);
                    int i159 = -(-((~((((-115) + i135) - ((-115) | i135)) | ((-115) ^ i135))) * 69));
                    Object[] objArr9 = new Object[1];
                    l(i134, (i158 ^ i159) + (((i159 + i158) - (i159 | i158)) << 1), 12 - (~(-(-ImageFormat.getBitsPerPixel(0)))), true, "\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019", objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        m("䴊䳊\ue845Ƥ䵫\uebd4ꛁ\uf786킥ওҁ閚盩깕手\u3000鐯찔쀑츚㩉動ⷋ沀妯\uf082讑", TextUtils.indexOf("", "", 0, 0), objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int i160 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                        int i161 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int i162 = (i161 ^ 5) + ((i161 & 5) << 1);
                        Object[] objArr11 = new Object[1];
                        l(i160, (iResolveSizeAndState ^ 123) + (((iResolveSizeAndState + 123) - (iResolveSizeAndState | 123)) << 1), i162, false, "\n�\u0003\u0001\u000e\u0003\u0001\u0010￬�\uffff\u0007�\u0003\u0001￩�", objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            m("䴊䳊\ue845Ƥ䵫\uebd4ꛁ\uf786킥ওҁ閚盩깕手\u3000鐯찔쀑츚㩉動ⷋ沀妯\uf082讑", View.MeasureSpec.makeMeasureSpec(0, 0), objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            m("꼷躢䵳쫼꽐⦷ϧ㳼㊖쯱ꆸ庍铐氷읝כֿ瘚\u0e77", ViewConfiguration.getLongPressTimeout() >> 16, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                int iMyUid = Process.myUid();
                                int i163 = minimumFlingVelocity * 193;
                                int i164 = ((-1) - (((-1) - i163) | ((-1) - 6369))) + ((-1) - (((-1) - i163) & ((-1) - 6369)));
                                int i165 = ~iMyUid;
                                int i166 = ~minimumFlingVelocity;
                                int i167 = ~((i166 ^ 33) | ((-1) - (((-1) - i166) | ((-1) - 33))));
                                int i168 = i165 ^ i167;
                                int i169 = (-1) - (((-1) - i167) | ((-1) - i165));
                                int i170 = -(-(((i168 + i169) - (i168 & i169)) * (-192)));
                                int i171 = (((-1) - (((-1) - i164) & ((-1) - i170))) << 1) - (i164 ^ i170);
                                int i172 = (i166 - 34) - (i166 & (-34));
                                int i173 = ~i172;
                                int i174 = ~(((-34) + i165) - ((-34) & i165));
                                int i175 = (i171 - (~(((i173 ^ i174) | (i174 & i173)) * (-384)))) - 1;
                                int i176 = ~((i172 ^ iMyUid) | (i172 & iMyUid));
                                int i177 = (i165 & (-34)) | ((-34) ^ i165);
                                int i178 = i177 ^ minimumFlingVelocity;
                                int i179 = (i177 + minimumFlingVelocity) - (i177 | minimumFlingVelocity);
                                int i180 = ~((i179 + i178) - (i179 & i178));
                                int i181 = ((i180 + i176) - (i180 | i176)) | (i176 ^ i180);
                                int i182 = ~((-1) - (((-1) - (((-1) - (((-1) - minimumFlingVelocity) | ((-1) - 33))) | (minimumFlingVelocity ^ 33))) & ((-1) - iMyUid)));
                                int i183 = -(-(((i182 & i181) | (i181 ^ i182)) * 192));
                                int i184 = ((i175 | i183) << 1) - (i175 ^ i183);
                                int i185 = -TextUtils.getCapsMode("", 0, 0);
                                int i186 = f19481d * (-626555048);
                                f19481d = i186;
                                int i187 = i185 * (-743);
                                int i188 = (i187 ^ (-89903)) + (((-1) - (((-1) - i187) | ((-1) - (-89903)))) << 1);
                                int i189 = (i185 ^ 121) | ((-1) - (((-1) - i185) | ((-1) - 121)));
                                int i190 = ~i189;
                                int i191 = ~((-1) - (((-1) - (i185 ^ i186)) & ((-1) - ((-1) - (((-1) - i185) | ((-1) - i186))))));
                                int i192 = (i190 ^ i191) | ((i190 + i191) - (i190 | i191));
                                int i193 = i186 ^ 121;
                                int i194 = (-1) - (((-1) - i186) | ((-1) - 121));
                                int i195 = ~((i193 + i194) - (i193 & i194));
                                int i196 = i192 ^ i195;
                                int i197 = (-1) - (((-1) - i192) | ((-1) - i195));
                                int i198 = ((i196 + i197) - (i196 & i197)) * (-744);
                                int i199 = (i188 ^ i198) + (((i198 + i188) - (i198 | i188)) << 1);
                                int i200 = ~i186;
                                int i201 = ~((-1) - (((-1) - (~i185)) & ((-1) - (-122))));
                                int i202 = i199 + ((((i201 + i200) - (i201 | i200)) | (i200 ^ i201)) * 744);
                                int i203 = -(-(((i189 ^ i186) | ((-1) - (((-1) - i186) | ((-1) - i189)))) * 744));
                                Object[] objArr15 = new Object[1];
                                l(i184, (((-1) - (((-1) - i202) & ((-1) - i203))) << 1) - (i203 ^ i202), Gravity.getAbsoluteGravity(0, 0) + 11, false, "\t\uffff\u0005\u0003￫\uffff\f\uffff\u0005\u0003\u0010\uffff\f\u0002\u0010\r\u0007\u0002ￌ\u0001\r\f\u0012\u0003\f\u0012ￌ\u000e\u000bￌ￮\uffff\u0001", objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                Object[] objArr16 = new Object[1];
                                l((iKeyCodeFromString ^ 14) + (((-1) - (((-1) - iKeyCodeFromString) | ((-1) - 14))) << 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 123, 3 - TextUtils.getOffsetAfter("", 0), true, "\u0010\u0001\u0003\u000b\u0002\n￥\u0001\u0003�\u0007\uffff�￬", objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int i204 = -Color.argb(0, 0, 0, 0);
                                int i205 = (((-1) - (((-1) - i204) & ((-1) - 30))) << 1) - (i204 ^ 30);
                                int i206 = -Color.alpha(0);
                                int i207 = ~i206;
                                int i208 = ~(((i207 + 120) - (i207 | 120)) | (i207 ^ 120));
                                int i209 = (-121) ^ i206;
                                int i210 = ((-121) + i206) - ((-121) | i206);
                                int i211 = (i210 + i209) - (i210 & i209);
                                int i212 = ((i206 * 477) - 57000) + ((i208 | (~((i211 + i2) - (i211 & i2)))) * (-476));
                                int i213 = i211 ^ i2;
                                int i214 = (i211 + i2) - (i211 | i2);
                                int i215 = (i212 - (~((~((i213 + i214) - (i213 & i214))) * 952))) - 1;
                                int i216 = ((-121) + i118) - ((-121) & i118);
                                int i217 = (i215 - (~(-(-((~((i206 & i216) | (i216 ^ i206))) * 476))))) - 1;
                                int i218 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int i219 = f19478a * 110278826;
                                f19478a = i219;
                                int i220 = (i218 * 302) + 15678;
                                int i221 = ~i218;
                                int i222 = ~i219;
                                int i223 = i221 ^ i222;
                                int i224 = (-1) - (((-1) - i221) | ((-1) - i222));
                                int i225 = ~((i224 + i223) - (i224 & i223));
                                int i226 = -(-(((-1) - (((-1) - ((i225 + 26) - (i225 | 26))) & ((-1) - (i225 ^ 26)))) * (-602)));
                                int i227 = (i220 & i226) + ((i220 + i226) - (i220 & i226));
                                int i228 = ~i218;
                                int i229 = ~((i228 - 27) - ((-27) & i228));
                                int i230 = ~(((-1) - (((-1) - i228) | ((-1) - i219))) | (i228 ^ i219));
                                int i231 = ((i230 + i229) - (i230 | i229)) | (i229 ^ i230);
                                int i232 = ~i219;
                                int i233 = i232 ^ i218;
                                int i234 = (-1) - (((-1) - i218) | ((-1) - i232));
                                int i235 = (i234 + i233) - (i234 & i233);
                                int i236 = ~((-1) - (((-1) - ((i235 + 26) - (i235 | 26))) & ((-1) - (i235 ^ 26))));
                                int i237 = -(-((((-1) - (((-1) - i236) | ((-1) - i231))) | (i231 ^ i236)) * (-301)));
                                Object[] objArr17 = new Object[1];
                                l(i205, i217, (i227 ^ i237) + (((i237 + i227) - (i237 | i227)) << 1) + ((~((i222 + 26) - (i222 & 26))) * 301), true, "\u0004\u0006\u0000\n\u0002\u0000\uffefￍ\f\u000fￍ\u0013\r\u0004\u0013\r\u000e\u0002ￍ\u0003\b\u000e\u0011\u0003\r\u0000\u000e\u0005\r￨", objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                m("亠暻\ue233\uee3e仓솢겴᠀팁⏿\u0ee6穜畅萸", (-2) - (~(-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))), objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i238 = 0;
                                while (i238 < length) {
                                    Object obj = objArr19[i238];
                                    Object[] objArr20 = new Object[i5];
                                    m("櫍\udfad쳪斐檕磳舿鏰\uf734", View.resolveSizeAndState(i4, i4, i4), objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[i4]};
                                        int iBlue = Color.blue(i4);
                                        int id = (int) Thread.currentThread().getId();
                                        int i239 = (iBlue * (-167)) - 6179;
                                        int i240 = ~iBlue;
                                        int i241 = i240 ^ (-38);
                                        int i242 = i240 & (-38);
                                        int i243 = ~((i241 + i242) - (i241 & i242));
                                        int i244 = ~id;
                                        int i245 = (-38) ^ i244;
                                        int i246 = (-1) - (((-1) - (-38)) | ((-1) - i244));
                                        int i247 = ~((i245 + i246) - (i245 & i246));
                                        int i248 = -(-(((-1) - (((-1) - (i243 ^ i247)) & ((-1) - ((-1) - (((-1) - i243) | ((-1) - i247)))))) * 168));
                                        int i249 = (((i239 + i248) - (i239 & i248)) << i5) - (i248 ^ i239);
                                        int i250 = (~((i240 ^ (-38)) | ((-1) - (((-1) - i240) | ((-1) - (-38)))) | id)) * 168;
                                        int i251 = (i249 & i250) + (i250 | i249);
                                        int i252 = ~iBlue;
                                        int i253 = ~id;
                                        int i254 = ~((i252 ^ i253) | ((-1) - (((-1) - i252) | ((-1) - i253))));
                                        int i255 = i240 ^ 37;
                                        int i256 = (i240 + 37) - (i240 | 37);
                                        int i257 = ~((i255 + i256) - (i255 & i256));
                                        int i258 = ((-1) - (((-1) - i254) | ((-1) - i257))) | (i254 ^ i257);
                                        int i259 = (iBlue - 38) - (iBlue & (-38));
                                        int i260 = ~((id + i259) - (id & i259));
                                        int i261 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                        int i262 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                        int i263 = ((i262 | 18) << i5) - (i262 ^ 18);
                                        Object[] objArr22 = new Object[i5];
                                        l(i251 + ((((-1) - (((-1) - i258) | ((-1) - i260))) | (i258 ^ i260)) * 168), (((-1) - (((-1) - i261) & ((-1) - 124))) << i5) - (i261 ^ 124), i263, true, "\u0010\u000e\u0001\uffffￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0015\u000e\u000b\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ", objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        Object[] objArr23 = new Object[i5];
                                        m("妻₻냐两姜螮﹄렽쐕旸射\uda55払숨㫕", View.resolveSize(0, 0), objArr23);
                                        String str = (String) objArr23[0];
                                        Class<?>[] clsArr = new Class[i5];
                                        clsArr[0] = String.class;
                                        Object objInvoke3 = cls5.getMethod(str, clsArr).invoke(null, objArr21);
                                        try {
                                            int touchSlop = 28 - (ViewConfiguration.getTouchSlop() >> 8);
                                            int i264 = -Color.blue(0);
                                            int i265 = (i264 * (-665)) - (-41082);
                                            int i266 = -(-((~i264) * (-333)));
                                            int i267 = (((i265 + i266) - (i265 & i266)) << 1) - (i265 ^ i266);
                                            int i268 = ~i264;
                                            int i269 = i268 ^ i118;
                                            int i270 = (-1) - (((-1) - i268) | ((-1) - i118));
                                            int i271 = ~((i269 + i270) - (i269 & i270));
                                            int i272 = ~((-1) - (((-1) - (i2 ^ 123)) & ((-1) - (123 & i2))));
                                            int i273 = ((i271 + i272) - (i271 & i272)) * 333;
                                            int i274 = i268 ^ i2;
                                            int i275 = i268 & i2;
                                            int i276 = ~((i275 + i274) - (i275 & i274));
                                            int i277 = ~((i118 ^ 123) | ((i118 + 123) - (123 | i118)));
                                            int i278 = ((((i267 + i273) - (i267 | i273)) + (i267 | i273)) - (~(-(-(((i276 ^ i277) | (i276 & i277)) * 333))))) - 1;
                                            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                                            Object[] objArr24 = new Object[i5];
                                            l(touchSlop, i278, (((-1) - (((-1) - iResolveSizeAndState2) & ((-1) - 1))) << i5) - (iResolveSizeAndState2 ^ i5), true, "�\u0001\u000e\u0011\u0010�\n\u0003\u0005\uffefￊ\t\fￊ\u0010\n\u0001\u0010\n\u000b\uffffￊ\u0000\u0005\u000b\u000e\u0000\n", objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            int i279 = -(ViewConfiguration.getTouchSlop() >> 8);
                                            int i280 = (i279 * (-183)) + 2035;
                                            int i281 = ~i279;
                                            int i282 = -(-(((i281 ^ 11) | ((-1) - (((-1) - i281) | ((-1) - 11)))) * (-368)));
                                            int i283 = (i280 & i282) + ((i282 + i280) - (i282 & i280));
                                            int i284 = (i279 ^ (-12)) | ((-12) & i279);
                                            int i285 = i284 ^ i118;
                                            int i286 = (i284 + i118) - (i284 | i118);
                                            int i287 = ((i286 + i285) - (i286 & i285)) * 184;
                                            int i288 = (i283 ^ i287) + (((i283 + i287) - (i283 | i287)) << i5);
                                            int i289 = ~i279;
                                            int i290 = ~((-1) - (((-1) - (i289 ^ (-12))) & ((-1) - ((-1) - (((-1) - i289) | ((-1) - (-12)))))));
                                            int i291 = ~((i118 ^ i279) | ((i118 + i279) - (i118 | i279)));
                                            int i292 = (-1) - (((-1) - (i290 ^ i291)) & ((-1) - ((i290 + i291) - (i290 | i291))));
                                            int i293 = ~((i279 ^ 11) | ((-1) - (((-1) - i279) | ((-1) - 11))));
                                            int i294 = (i288 - (~(-(-(((-1) - (((-1) - ((i292 + i293) - (i292 | i293))) & ((-1) - (i292 ^ i293)))) * 184))))) - 1;
                                            int i295 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            Object[] objArr25 = new Object[1];
                                            l(i294, (i295 ^ 127) + (((-1) - (((-1) - i295) | ((-1) - 127))) << 1), 2 - (~(-TextUtils.indexOf("", "", 0, 0))), false, "\u000b\ufffa\u0012\r\bￛ\u0012\r\ufffeￚ\u000b", objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                int i296 = -Process.getGidForName("");
                                                int i297 = (i296 & 36) + (i296 | 36);
                                                int offsetBefore = TextUtils.getOffsetBefore("", 0);
                                                int iNextInt = new Random().nextInt(1215285610);
                                                int i298 = offsetBefore * (-563);
                                                int i299 = ~offsetBefore;
                                                int i300 = ~iNextInt;
                                                int i301 = ~((-1) - (((-1) - ((-124) ^ i300)) & ((-1) - ((-1) - (((-1) - i300) | ((-1) - (-124)))))));
                                                int i302 = ((((-1) - (((-1) - i298) & ((-1) - 69495))) << 1) - (i298 ^ 69495)) + ((((-1) - (((-1) - ((i301 + i299) - (i301 | i299))) & ((-1) - (i299 ^ i301)))) | (~((-1) - (((-1) - iNextInt) & ((-1) - 123))))) * (-564));
                                                int i303 = (-1) - (((-1) - ((i299 + 123) - (i299 | 123))) & ((-1) - (i299 ^ 123)));
                                                int i304 = i303 ^ iNextInt;
                                                int i305 = (-1) - (((-1) - i303) | ((-1) - iNextInt));
                                                int i306 = (i302 - (~((~((i305 + i304) - (i305 & i304))) * 1128))) - 1;
                                                int i307 = ~offsetBefore;
                                                int i308 = ~iNextInt;
                                                int i309 = ~((i308 & i307) | (i307 ^ i308));
                                                int i310 = ~(((-1) - (((-1) - offsetBefore) | ((-1) - 123))) | (offsetBefore ^ 123));
                                                int i311 = i309 ^ i310;
                                                int i312 = (-1) - (((-1) - i309) | ((-1) - i310));
                                                int i313 = ((i312 + i311) - (i312 & i311)) * 564;
                                                int i314 = (i306 ^ i313) + ((i313 & i306) << 1);
                                                int i315 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                Object[] objArr27 = new Object[1];
                                                l(i297, i314, ((i315 + 19) - (19 | i315)) + ((-1) - (((-1) - i315) & ((-1) - 19))), true, "\u0010\u000e\u0001\uffffￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0015\u000e\u000b\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ", objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                int iAlpha = Color.alpha(0);
                                                int i316 = f19482e * 602798085;
                                                f19482e = i316;
                                                int i317 = ~iAlpha;
                                                int i318 = ~((-1) - (((-1) - i317) & ((-1) - (-20))));
                                                int i319 = (i316 ^ i318) | ((-1) - (((-1) - i318) | ((-1) - i316)));
                                                int i320 = iAlpha ^ 19;
                                                int i321 = (iAlpha + 19) - (19 | iAlpha);
                                                int i322 = (i320 + i321) - (i320 & i321);
                                                int i323 = ~i322;
                                                int i324 = (((iAlpha * (-375)) - 7125) - (~(((-1) - (((-1) - (i319 ^ i323)) & ((-1) - ((i323 + i319) - (i323 | i319))))) * IptcDirectory.TAG_ARM_IDENTIFIER))) - 1;
                                                int i325 = ~((~i316) | iAlpha);
                                                int i326 = ~i322;
                                                int i327 = ((i326 + i325) - (i326 & i325)) * (-376);
                                                int i328 = ((i324 + i327) - (i324 | i327)) + ((i327 + i324) - (i327 & i324));
                                                int i329 = ~((-1) - (((-1) - (i317 ^ i316)) & ((-1) - ((i316 + i317) - (i316 | i317)))));
                                                int i330 = -(-((((i329 + 19) - (i329 | 19)) | (i329 ^ 19)) * IptcDirectory.TAG_ARM_IDENTIFIER));
                                                int i331 = (i328 ^ i330) + ((i330 & i328) << 1);
                                                int i332 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                int i333 = ((i332 + 126) - (126 | i332)) + ((-1) - (((-1) - i332) & ((-1) - 126)));
                                                int i334 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                Object[] objArr28 = new Object[1];
                                                l(i331, i333, (i334 ^ 1) + (((-1) - (((-1) - i334) | ((-1) - 1))) << 1), true, "\u0000\ufffe\r\ufffa￼\u0002\uffff\u0002\r\u000b\ufffeￜ\ufffe\r\ufffa\u000b\ufffe\u0007\ufffe", objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i335 = 0; i335 < 2; i335 = (((i335 + 1) - (i335 | 1)) << 1) + (i335 ^ 1)) {
                                                    Object obj2 = objArr3[i335];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        m("妛\ueb6f΄ॼ姱䱾䴒ｍ쑵긬\uef41鴏扮৭覍㣘肢毱⯇욉⻩\uf56b왊摴䵮坯思ȯ\ueb7e닭ʐꇅঽᲶ鳇侍럯繺", Color.red(0), objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int i336 = 22 - (~(-KeyEvent.keyCodeFromString("")));
                                                        int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                                        int i337 = (doubleTapTimeout * 980) - 115404;
                                                        int i338 = -(-((~((-119) | (~iUptimeMillis))) * 979));
                                                        int i339 = (((i337 ^ i338) + (((i337 + i338) - (i337 | i338)) << 1)) - (~(-(-(((-1) - (((-1) - (doubleTapTimeout ^ iUptimeMillis)) & ((-1) - ((-1) - (((-1) - doubleTapTimeout) | ((-1) - iUptimeMillis)))))) * (-979)))))) - 1;
                                                        int i340 = ~((((-119) + iUptimeMillis) - ((-119) | iUptimeMillis)) | ((-119) ^ iUptimeMillis));
                                                        int i341 = ~iUptimeMillis;
                                                        int i342 = ~((doubleTapTimeout & i341) | (i341 ^ doubleTapTimeout));
                                                        int i343 = -(-(((i342 + i340) - (i342 & i340)) * 979));
                                                        int i344 = ((i339 | i343) << 1) - (i343 ^ i339);
                                                        int iAlpha2 = Color.alpha(0);
                                                        int i345 = f19486i * 1476379678;
                                                        f19486i = i345;
                                                        int i346 = iAlpha2 * (-1529);
                                                        int i347 = (i346 ^ (-764)) + (((i346 - 764) - (i346 | (-764))) << 1);
                                                        int i348 = ~iAlpha2;
                                                        int i349 = (i348 ^ (-2)) | ((-2) & i348);
                                                        int i350 = ~i345;
                                                        int i351 = ~((i349 ^ i350) | ((i349 + i350) - (i349 | i350)));
                                                        int i352 = ~iAlpha2;
                                                        int i353 = i352 ^ 1;
                                                        int i354 = 1 & i352;
                                                        int i355 = (i353 + i354) - (i353 & i354);
                                                        int i356 = ~((i355 + i345) - (i355 & i345));
                                                        int i357 = (-1) - (((-1) - ((-2) ^ iAlpha2)) & ((-1) - (((-2) + iAlpha2) - ((-2) | iAlpha2))));
                                                        int i358 = i347 + (((-1) - (((-1) - ((-1) - (((-1) - (i351 ^ i356)) & ((-1) - ((-1) - (((-1) - i356) | ((-1) - i351))))))) & ((-1) - (~((i357 ^ i345) | ((i357 + i345) - (i357 | i345))))))) * 765);
                                                        int i359 = i352 ^ (-2);
                                                        int i360 = (-1) - (((-1) - i352) | ((-1) - (-2)));
                                                        int i361 = ~((i359 + i360) - (i359 & i360));
                                                        int i362 = ~((i348 + i350) - (i348 & i350));
                                                        int i363 = (((i361 + i362) - (i361 | i362)) | (i361 ^ i362)) * 1530;
                                                        int i364 = ~((i352 & i345) | (i352 ^ i345));
                                                        int i365 = ~((-1) - (((-1) - (((-2) + i350) - ((-2) & i350))) & ((-1) - iAlpha2)));
                                                        int i366 = (((((-1) - (((-1) - i358) & ((-1) - i363))) << 1) - (i363 ^ i358)) - (~(-(-(((-1) - (((-1) - ((i364 + i365) - (i364 | i365))) & ((-1) - (i364 ^ i365)))) * 765))))) - 1;
                                                        Object[] objArr30 = new Object[1];
                                                        l(i336, i344, i366, false, "\r\b\u0006\u0015\ufff4\u0016\u0003\u000b\u0006\u0004\u0015\ufff9ￖ\uffd1\uffd1\ufff1\u0013\n\u000f\u0004\n\u0011\u0002", objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int i367 = f19488k * (-123920929);
                                                            f19488k = i367;
                                                            int i368 = (((-2086797644) + ((((-571027974) + i367) - ((-571027974) & i367)) * (-381))) + (((-1) - (((-1) - (~((~i367) | 98714992))) & ((-1) - (-661337910)))) * 381)) - 1481674383;
                                                            int i369 = f19485h * (-814127533);
                                                            f19485h = i369;
                                                            int i370 = -(-(i368 * (-987)));
                                                            int i371 = ((-1) - (((-1) - 15824) | ((-1) - i370))) + ((i370 + 15824) - (i370 & 15824));
                                                            int i372 = ~i368;
                                                            int i373 = ~i369;
                                                            int i374 = i372 ^ i373;
                                                            int i375 = (-1) - (((-1) - i372) | ((-1) - i373));
                                                            int i376 = (i375 + i374) - (i375 & i374);
                                                            int i377 = ~((i376 & 16) | (i376 ^ 16));
                                                            int i378 = ~(((-1) - (((-1) - (i368 ^ 16)) & ((-1) - ((-1) - (((-1) - i368) | ((-1) - 16)))))) | i369);
                                                            int i379 = (i371 - (~(((-1) - (((-1) - ((i377 + i378) - (i377 | i378))) & ((-1) - (i377 ^ i378)))) * 988))) - 1;
                                                            int i380 = ~i368;
                                                            int i381 = i380 ^ 16;
                                                            int i382 = (-1) - (((-1) - i380) | ((-1) - 16));
                                                            int i383 = (i379 - (~(-(-(((i381 + i382) - (i381 & i382)) * (-988)))))) - 1;
                                                            int i384 = (-17) ^ i380;
                                                            int i385 = (-1) - (((-1) - (-17)) | ((-1) - i380));
                                                            int i386 = (-1) - (((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - i380) | ((-1) - i369)))) & ((-1) - (i380 ^ i369)))))) & ((-1) - (~((i385 + i384) - (i385 & i384)))));
                                                            int i387 = ~i369;
                                                            int i388 = ~(((-1) - (((-1) - i387) | ((-1) - 16))) | (i387 ^ 16) | i368);
                                                            int i389 = (i3 - (~(-(-(i383 + ((((-1) - (((-1) - i388) | ((-1) - i386))) | (i386 ^ i388)) * 988)))))) - 1;
                                                            int i390 = i389 << 13;
                                                            int i391 = (-1) - (((-1) - (~i390)) | ((-1) - i389));
                                                            int i392 = (-1) - (((-1) - (~i389)) | ((-1) - i390));
                                                            int i393 = (i392 + i391) - (i392 & i391);
                                                            int i394 = i393 >>> 17;
                                                            int i395 = (~i394) & i393;
                                                            int i396 = (~i393) & i394;
                                                            int i397 = (i396 + i395) - (i396 & i395);
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
                                                i238 = (i238 & 1) + ((-1) - (((-1) - i238) & ((-1) - 1)));
                                                i4 = 0;
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
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i398 = (-441626791) + (((-1) - (((-1) - (~(((-648826514) + iUptimeMillis2) - ((-648826514) & iUptimeMillis2)))) & ((-1) - (-29321509)))) * (-948)) + ((~((~iUptimeMillis2) | (-11290625))) * (-948)) + 1206365016;
        int iNextInt2 = new Random().nextInt(2125199595);
        int i399 = -(-(i398 * 192));
        int i400 = (((i399 ^ 191) + (((i399 + 191) - (i399 | 191)) << 1)) - (~(-(-((~((-1) - (((-1) - (i398 ^ iNextInt2)) & ((-1) - ((-1) - (((-1) - i398) | ((-1) - iNextInt2))))))) * 191))))) - 1;
        int i401 = (-1) ^ i398;
        int i402 = ~((i401 + i398) - (i401 & i398));
        int i403 = ~iNextInt2;
        int i404 = ~((-1) - (((-1) - ((i403 + i398) - (i403 | i398))) & ((-1) - (i403 ^ i398))));
        int i405 = i402 ^ i404;
        int i406 = i404 & i402;
        int i407 = i400 + (((i406 + i405) - (i406 & i405)) * 191);
        int i408 = (i3 ^ i407) + (((-1) - (((-1) - i3) | ((-1) - i407))) << 1);
        int i409 = i408 << 13;
        int i410 = (-1) - (((-1) - ((-1) - (((-1) - i408) & ((-1) - i409)))) | ((-1) - (~(i408 & i409))));
        int i411 = i410 >>> 17;
        int i412 = ((i410 + i411) - (i410 & i411)) & (~(i410 & i411));
        int i413 = i412 << 5;
        int i414 = (-1) - (((-1) - (~i413)) | ((-1) - i412));
        int i415 = ~i412;
        ((int[]) objArr32[0])[0] = (-1) - (((-1) - ((i415 + i413) - (i415 | i413))) & ((-1) - i414));
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
        $$b = 177;
    }

    private static void l(int i2, int i3, int i4, boolean z2, String str, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 75;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else {
            if (str2 != null) {
            }
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i8 = $10 + 13;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f19483f)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = d.a(269 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) Color.alpha(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -2071844881, false, $$c(b2, b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 8)))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = d.a((Process.myTid() >> 22) + 522, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetAfter("", 0) + 12, 627984172, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) | ((-1) - 6)))), new Class[]{Object.class, Object.class});
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
                int i11 = $10 + 13;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr4[nVar.f19944a] = cArr2[(i2 << nVar.f19944a) + 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objA3 = d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 521, (char) TextUtils.indexOf("", "", 0), View.resolveSize(0, 0) + 12, 627984172, false, $$c(b6, b7, (byte) ((b7 + 6) - (6 | b7))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objA4 = d.a(522 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 627984172, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) | ((-1) - 6)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void m(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 91;
        $10 = i4 % 128;
        Object charArray = str2;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f19487j ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i5 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19487j)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 229, (char) (51004 - View.combineMeasuredStates(0, 0)), View.resolveSize(0, 0) + 9, 1749983833, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = d.a(675 - Color.blue(0), (char) (Process.myTid() >> 22), 11 - TextUtils.indexOf((CharSequence) "", '0', 0), 522683165, false, $$c(b4, b5, (byte) (7 & b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i6 = $10 + 91;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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

    public static boolean onMessageReceived(Context context, RemoteMessage remoteMessage) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19484g + 79;
        f19489o = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = a.c(context, b.d(remoteMessage));
        int i5 = f19484g + 31;
        f19489o = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    public static void onTokenRefresh(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19484g + 33;
        f19489o = i3 % 128;
        if (i3 % 2 != 0) {
            a.a(context);
            return;
        }
        a.a(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
