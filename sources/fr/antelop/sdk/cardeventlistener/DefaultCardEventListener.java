package fr.antelop.sdk.cardeventlistener;

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
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.l;
import o.a.n;
import o.d.d;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public class DefaultCardEventListener implements CardEventListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static final String TAG = "DefaultCardEventListener";

    /* JADX INFO: renamed from: a */
    private static int f18989a = 0;

    /* JADX INFO: renamed from: b */
    private static int f18990b = 0;

    /* JADX INFO: renamed from: c */
    public static int f18991c = 0;

    /* JADX INFO: renamed from: d */
    public static int f18992d = 0;

    /* JADX INFO: renamed from: e */
    private static int[] f18993e = null;

    /* JADX INFO: renamed from: f */
    private static int f18994f = 0;

    /* JADX INFO: renamed from: g */
    public static int f18995g = 0;

    /* JADX INFO: renamed from: h */
    public static int f18996h = 0;

    /* JADX INFO: renamed from: i */
    public static int f18997i = 0;

    /* JADX INFO: renamed from: j */
    public static int f18998j = 0;

    private static String $$g(byte b2, int i2, short s2) {
        int i3 = i2 * 3;
        int i4 = 121 - (s2 * 2);
        byte[] bArr = $$c;
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + (-i4);
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i5 + 1;
            i4 += -bArr[i7];
            i5 = i7;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18998j = -1030368893;
        f18997i = -1652543364;
        f18996h = 1213296122;
        f18995g = 713828993;
        init$0();
        f18992d = -2071803200;
        f18991c = -1681158061;
        f18989a = 0;
        f18994f = 1;
        f18993e = new int[]{1258406322, 2033641946, 1836861981, 67466472, 2114478472, -1454224765, -1271893273, -427998872, 150355104, 782024273, 1559561710, -2098017680, 912455642, -151466024, -212755217, -1065901190, 46187456, -280134721};
        f18990b = -1270219450;
    }

    public static Object[] b(Context context, int i2, int i3) {
        if (context == null) {
            Object[] objArr = {new int[]{(i + i) - (i & i)}, new int[]{i2}, null, new int[]{i2}};
            int i4 = f18996h * (-1421853541);
            f18996h = i4;
            int i5 = (-1514908214) + ((~(((-526433) + i4) - ((-526433) & i4))) * (-301));
            int i6 = ~((378018656 + i4) - (378018656 & i4));
            int i7 = ~i4;
            int i8 = i5 + (((-1) - (((-1) - i6) & ((-1) - (~((i7 + 1056166678) - (i7 & 1056166678)))))) * (-301));
            int i9 = ~(i4 | (-1056166679));
            int i10 = i8 + (((i9 + 378018656) - (i9 & 378018656)) * 301);
            int i11 = i10 * HttpStatus.SC_REQUEST_TIMEOUT;
            int i12 = (i11 << 1) - i11;
            int i13 = ~i10;
            int i14 = ~i13;
            int i15 = ~i2;
            int i16 = ((-1) - (((-1) - ((-1) - (((-1) - i14) | ((-1) - i15)))) & ((-1) - (i14 ^ i15)))) * (-814);
            int i17 = ~((-1) - (((-1) - i13) & ((-1) - (~i2))));
            int i18 = (i12 & i16) + ((-1) - (((-1) - i12) & ((-1) - i16))) + (((-1) - (((-1) - ((i17 + i15) - (i17 | i15))) & ((-1) - (i17 ^ i15)))) * HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED);
            int i19 = ~(((-1) ^ i10) | i10);
            int i20 = (-1) ^ i2;
            int i21 = ~((i20 + i2) - (i20 & i2));
            int i22 = i19 ^ i21;
            int i23 = (-1) - (((-1) - i21) | ((-1) - i19));
            int i24 = (i23 + i22) - (i23 & i22);
            int i25 = ~((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - i10)))) & ((-1) - (i10 ^ i2))));
            int i26 = ((-1) - (((-1) - ((-1) - (((-1) - i25) | ((-1) - i24)))) & ((-1) - (i24 ^ i25)))) * HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED;
            int i27 = i3 + (i18 ^ i26) + ((i26 & i18) << 1);
            int i28 = i27 << 13;
            int i29 = ~((-1) - (((-1) - i27) | ((-1) - i28)));
            int i30 = (-1) - (((-1) - i27) & ((-1) - i28));
            int i31 = (i30 + i29) - (i30 | i29);
            int i32 = i31 >>> 17;
            int i33 = ~i32;
            int i34 = ((~i31) & i32) | ((i33 + i31) - (i33 | i31));
            int i35 = i34 << 5;
            int i36 = ~i35;
            int i37 = (i36 + i34) - (i36 | i34);
            int i38 = ~i34;
            int i39 = (i38 + i35) - (i38 | i35);
            return objArr;
        }
        try {
            int i40 = -ExpandableListView.getPackedPositionChild(0L);
            int iMyPid = Process.myPid();
            int i41 = i40 * 758;
            int i42 = (i41 ^ (-27972)) + (((-1) - (((-1) - i41) | ((-1) - (-27972)))) << 1);
            int i43 = ~iMyPid;
            int i44 = i40 ^ i43;
            int i45 = (i40 + i43) - (i40 | i43);
            int i46 = ((i44 + i45) - (i44 & i45)) * (-757);
            int i47 = (i42 ^ i46) + (((-1) - (((-1) - i42) | ((-1) - i46))) << 1);
            int i48 = (-38) ^ i40;
            int i49 = (-38) & i40;
            int i50 = (i48 + i49) - (i48 & i49);
            int i51 = (~((-1) - (((-1) - (i50 ^ iMyPid)) & ((-1) - ((-1) - (((-1) - i50) | ((-1) - iMyPid))))))) * 1514;
            int i52 = (i47 ^ i51) + (((-1) - (((-1) - i47) | ((-1) - i51))) << 1);
            int i53 = ~i40;
            int i54 = ~((i53 ^ (-38)) | ((i53 - 38) - (i53 | (-38))));
            int i55 = ~(((-38) ^ i43) | (i43 & (-38)));
            int i56 = (-1) - (((-1) - ((-1) - (((-1) - i55) | ((-1) - i54)))) & ((-1) - (i54 ^ i55)));
            int i57 = ~(i40 | 37 | iMyPid);
            int i58 = (((-1) - (((-1) - i57) | ((-1) - i56))) | (i56 ^ i57)) * 757;
            int i59 = (i52 ^ i58) + (((i52 + i58) - (i52 | i58)) << 1);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 185;
            int i60 = -Color.alpha(0);
            int i61 = (int) Runtime.getRuntime().totalMemory();
            int i62 = (i60 * (-947)) + 31317;
            int i63 = ~i60;
            int i64 = ~((-1) - (((-1) - ((-34) ^ i61)) & ((-1) - (((-34) + i61) - ((-34) | i61)))));
            int i65 = i63 ^ i64;
            int i66 = (i64 + i63) - (i64 | i63);
            int i67 = -(-(((i65 + i66) - (i65 & i66)) * (-948)));
            int i68 = ((-1) - (((-1) - i62) | ((-1) - i67))) + ((i67 + i62) - (i67 & i62));
            int i69 = (~i60) | (-34);
            int i70 = ~i61;
            int i71 = i69 ^ i70;
            int i72 = (-1) - (((-1) - i69) | ((-1) - i70));
            int i73 = (~((i72 + i71) - (i72 & i71))) * (-948);
            int i74 = (((-1) - (((-1) - i68) & ((-1) - i73))) << 1) - (i73 ^ i68);
            int i75 = (i60 | (-34)) * 948;
            int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
            Object[] objArr2 = new Object[1];
            n(i59, iLastIndexOf, i76, true, "\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b", objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            int iIndexOf = TextUtils.indexOf("", "", 0);
            int iMyUid = Process.myUid();
            int i77 = iIndexOf * 284;
            int i78 = (i77 & (-8742)) + ((-1) - (((-1) - i77) & ((-1) - (-8742))));
            int i79 = ~iIndexOf;
            int i80 = ~((-1) - (((-1) - (i79 & 31)) & ((-1) - (i79 ^ 31))));
            int i81 = ~iIndexOf;
            int i82 = i78 + ((i80 | (~((-1) - (((-1) - i81) & ((-1) - iMyUid))))) * (-283));
            int i83 = -(-((~((-1) - (((-1) - (iIndexOf & (-32))) & ((-1) - ((-32) ^ iIndexOf))))) * 283));
            int i84 = (i82 ^ i83) + (((i83 + i82) - (i83 | i82)) << 1);
            int i85 = i81 ^ (-32);
            int i86 = i81 & (-32);
            int i87 = (i85 + i86) - (i85 & i86);
            int i88 = i87 ^ iMyUid;
            int i89 = (i87 + iMyUid) - (i87 | iMyUid);
            int i90 = -(-((~((i89 + i88) - (i89 & i88))) * 283));
            int i91 = (i84 ^ i90) + (((-1) - (((-1) - i90) | ((-1) - i84))) << 1);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
            int i92 = f18991c * (-2111577670);
            f18991c = i92;
            int i93 = ~((-1) - (((-1) - iCombineMeasuredStates) & ((-1) - i92)));
            int i94 = (((iCombineMeasuredStates * 673) - 239054) - (~(-(-(((-1) - (((-1) - ((-1) - (((-1) - i93) | ((-1) - 178)))) & ((-1) - (i93 ^ 178)))) * 672))))) - 1;
            int i95 = ~iCombineMeasuredStates;
            int i96 = ~i92;
            int i97 = ~((i95 ^ i96) | ((i95 + i96) - (i95 | i96)));
            int i98 = ~((-1) - (((-1) - i92) & ((-1) - 178)));
            int i99 = (i94 - (~(-(-(((i97 ^ i98) | (i98 & i97)) * (-672)))))) - 1;
            int i100 = (-179) ^ i96;
            int i101 = (-1) - (((-1) - (-179)) | ((-1) - i96));
            int i102 = ~((i101 + i100) - (i101 & i100));
            int i103 = ~((-179) | iCombineMeasuredStates);
            int i104 = i102 ^ i103;
            int i105 = (-1) - (((-1) - i103) | ((-1) - i102));
            int i106 = ((i105 + i104) - (i105 & i104)) * 672;
            Object[] objArr4 = new Object[1];
            n(i91, ((i99 | i106) << 1) - (i106 ^ i99), 4 - (~(-(-Color.argb(0, 0, 0, 0)))), false, "ￗ￮￨\u0000\ufffe￮\ufff9￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012ￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000f", objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                int i107 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i108 = (i107 ^ 38) + ((i107 & 38) << 1);
                int i109 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 185;
                int i110 = -MotionEvent.axisFromString("");
                int i111 = i110 * 673;
                int i112 = (((-1) - (((-1) - i111) & ((-1) - (-42976)))) << 1) - (i111 ^ (-42976));
                int i113 = ~((-1) - (((-1) - (i110 ^ i2)) & ((-1) - ((-1) - (((-1) - i110) | ((-1) - i2))))));
                int i114 = -(-(((-1) - (((-1) - ((i113 + 32) - (i113 | 32))) & ((-1) - (i113 ^ 32)))) * 672));
                int i115 = (i112 & i114) + ((i112 + i114) - (i112 & i114));
                int i116 = ~i110;
                int i117 = ~i2;
                int i118 = ~((i116 + i117) - (i116 & i117));
                int i119 = ~((-1) - (((-1) - i2) & ((-1) - 32)));
                int i120 = i115 + (((-1) - (((-1) - (i118 ^ i119)) & ((-1) - ((-1) - (((-1) - i119) | ((-1) - i118)))))) * (-672));
                int i121 = ~i2;
                int i122 = ~(((-33) ^ i121) | (((-33) + i121) - ((-33) | i121)));
                int i123 = ~(((-33) ^ i110) | ((-33) & i110));
                int i124 = i122 ^ i123;
                int i125 = (-1) - (((-1) - i123) | ((-1) - i122));
                int i126 = ((i124 + i125) - (i124 & i125)) * 672;
                int i127 = (i120 ^ i126) + (((i126 + i120) - (i126 | i120)) << 1);
                Object[] objArr6 = new Object[1];
                n(i108, i109, i127, true, "\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b", objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                int i128 = 30 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                int i129 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                int i130 = i129 * 70;
                int i131 = (i130 ^ (-12104)) + (((i130 - 12104) - (i130 | (-12104))) << 1);
                int i132 = ~i129;
                int i133 = (i132 - 179) - ((-179) & i132);
                int i134 = ~((-1) - (((-1) - (i133 ^ i2)) & ((-1) - ((-1) - (((-1) - i133) | ((-1) - i2))))));
                int i135 = i129 ^ 178;
                int i136 = (-1) - (((-1) - i129) | ((-1) - 178));
                int i137 = (i135 + i136) - (i135 & i136);
                int i138 = i137 ^ i2;
                int i139 = i137 & i2;
                int i140 = ~((i139 + i138) - (i139 & i138));
                int i141 = i131 + ((((i140 + i134) - (i140 | i134)) | (i134 ^ i140)) * 69);
                int i142 = i132 ^ 178;
                int i143 = (i132 + 178) - (178 | i132);
                int i144 = ~((i142 + i143) - (i142 & i143));
                int i145 = i132 ^ i2;
                int i146 = (i132 + i2) - (i132 | i2);
                int i147 = ~((i145 + i146) - (i145 & i146));
                int i148 = i144 ^ i147;
                int i149 = (i144 + i147) - (i144 | i147);
                int i150 = (i149 + i148) - (i149 & i148);
                int i151 = ~((-1) - (((-1) - (i2 ^ 178)) & ((-1) - ((-1) - (((-1) - i2) | ((-1) - 178))))));
                int i152 = (-179) ^ i129;
                int i153 = (-179) & i129;
                int i154 = ((i141 - (~((((-1) - (((-1) - i150) | ((-1) - i151))) | (i150 ^ i151)) * (-69)))) - 1) + ((~((i153 + i152) - (i153 & i152))) * 69);
                int i155 = -Drawable.resolveOpacity(0, 0);
                int i156 = (i155 * (-518)) - 7252;
                int i157 = ~i155;
                int i158 = ~(((-1) - (((-1) - i157) | ((-1) - i121))) | (i157 ^ i121));
                int i159 = ((i158 + 14) - (i158 & 14)) * 519;
                int i160 = (i156 ^ i159) + (((i156 + i159) - (i156 | i159)) << 1);
                int i161 = ~i155;
                int i162 = (i161 & i117) | (i161 ^ i117);
                int i163 = i162 ^ 14;
                int i164 = i162 & 14;
                int i165 = ~((i164 + i163) - (i164 & i163));
                int i166 = (-1) - (((-1) - (i155 ^ 14)) & ((-1) - (14 & i155)));
                int i167 = i166 ^ i2;
                int i168 = (i166 + i2) - (i166 | i2);
                int i169 = ~((i168 + i167) - (i168 & i167));
                int i170 = i165 ^ i169;
                int i171 = (-1) - (((-1) - i165) | ((-1) - i169));
                int i172 = -(-(((i171 + i170) - (i171 & i170)) * (-519)));
                int i173 = (i160 ^ i172) + ((i172 & i160) << 1);
                int i174 = i2 ^ 14;
                int i175 = (i2 + 14) - (14 | i2);
                int i176 = ~((i174 + i175) - (i174 & i175));
                int i177 = ((i155 + i176) - (i155 & i176)) * 519;
                Object[] objArr7 = new Object[1];
                n(i128, i154, ((-1) - (((-1) - i173) | ((-1) - i177))) + ((i177 + i173) - (i177 & i173)), false, "￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012￮￨\u0000\ufffeￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮\ufff9", objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    int i178 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38;
                    int i179 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i180 = (i179 ^ 185) + (((-1) - (((-1) - i179) | ((-1) - 185))) << 1);
                    int i181 = -ExpandableListView.getPackedPositionGroup(0L);
                    int i182 = i181 * 765;
                    int i183 = (i182 ^ (-50391)) + (((-1) - (((-1) - i182) | ((-1) - (-50391)))) << 1);
                    int i184 = ~((int) Runtime.getRuntime().maxMemory());
                    int i185 = ~((i184 ^ i181) | ((i184 + i181) - (i184 | i181)));
                    int i186 = ((i185 ^ 33) | ((i185 + 33) - (33 | i185))) * 764;
                    int i187 = (i183 & i186) + ((-1) - (((-1) - i186) & ((-1) - i183)));
                    int i188 = ~i181;
                    int i189 = ~((-1) - (((-1) - ((-1) - (((-1) - i188) | ((-1) - 33)))) & ((-1) - (i188 ^ 33))));
                    int i190 = i184 ^ 33;
                    int i191 = (i184 + 33) - (i184 | 33);
                    int i192 = ~((i191 + i190) - (i191 & i190));
                    int i193 = (((-1) - (((-1) - i192) | ((-1) - i189))) | (i189 ^ i192)) * (-1528);
                    int i194 = ((-1) - (((-1) - i187) | ((-1) - i193))) + (i187 | i193);
                    int i195 = ~i181;
                    int i196 = ~((i195 & 33) | (i195 ^ 33));
                    int i197 = ~((-1) - (((-1) - i181) & ((-1) - (-34))));
                    int i198 = (i197 & i196) | (i196 ^ i197);
                    int i199 = i198 ^ i185;
                    int i200 = (-1) - (((-1) - i198) | ((-1) - i185));
                    int i201 = -(-(((i200 + i199) - (i200 & i199)) * 764));
                    Object[] objArr9 = new Object[1];
                    n(i178, i180, (i194 ^ i201) + (((i201 + i194) - (i201 | i194)) << 1), true, "\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b", objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        l(new int[]{-701590391, 277543290, -1975856770, -1739017852, 1573027383, 1751137777, -1808114160, 106237406, -979980269, 1117704457, 312417891, 1907052739}, TextUtils.lastIndexOf("", '0', 0, 0) + 24, objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int i202 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i203 = ((-1) - (((-1) - i202) | ((-1) - 17))) + ((i202 + 17) - (i202 & 17));
                        int i204 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i205 = ((i204 + 193) - (193 | i204)) + ((i204 + 193) - (i204 & 193));
                        int i206 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        Object[] objArr11 = new Object[1];
                        n(i203, i205, (((-1) - (((-1) - i206) & ((-1) - 12))) << 1) - (i206 ^ 12), true, "\n�￩\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003\u000e\u0001\u0003�", objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                            int i207 = f18992d * (-1202767555);
                            f18992d = i207;
                            int i208 = ~iCombineMeasuredStates2;
                            int i209 = i208 ^ (-24);
                            int i210 = (i208 - 24) - (i208 | (-24));
                            int i211 = (i209 + i210) - (i209 & i210);
                            int i212 = ~i207;
                            int i213 = i211 ^ i212;
                            int i214 = (-1) - (((-1) - i211) | ((-1) - i212));
                            int i215 = (iCombineMeasuredStates2 * (-519)) + 11983 + (((~((i207 ^ 23) | ((-1) - (((-1) - i207) | ((-1) - 23))))) | (~((i213 + i214) - (i213 & i214)))) * 520);
                            int i216 = ~((-24) | i212);
                            int i217 = ~((iCombineMeasuredStates2 ^ i207) | ((i207 + iCombineMeasuredStates2) - (i207 | iCombineMeasuredStates2)));
                            int i218 = i216 ^ i217;
                            int i219 = i216 & i217;
                            int i220 = -(-(((i218 + i219) - (i218 & i219)) * (-1040)));
                            int i221 = (i215 ^ i220) + (((i215 + i220) - (i215 | i220)) << 1);
                            int i222 = ~iCombineMeasuredStates2;
                            int i223 = i222 ^ i212;
                            int i224 = i212 & i222;
                            int i225 = ~((i224 + i223) - (i224 & i223));
                            int i226 = ~((-1) - (((-1) - ((-24) & iCombineMeasuredStates2)) & ((-1) - ((-24) ^ iCombineMeasuredStates2))));
                            int i227 = (i226 + i225) - (i226 & i225);
                            Object[] objArr12 = new Object[1];
                            l(new int[]{-701590391, 277543290, -1975856770, -1739017852, 1573027383, 1751137777, -1808114160, 106237406, -979980269, 1117704457, 312417891, 1907052739}, (i221 - (~(-(-((((i227 + i217) - (i227 | i217)) | (i227 ^ i217)) * 520))))) - 1, objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                            int i228 = (keyRepeatTimeout ^ 14) + ((keyRepeatTimeout & 14) << 1);
                            int i229 = -(-TextUtils.getOffsetAfter("", 0));
                            int i230 = ((i229 | 192) << 1) - (i229 ^ 192);
                            int i231 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr13 = new Object[1];
                            n(i228, i230, (i231 & 1) + (i231 | 1), false, "\n\u0002\u0004\u0002\u0011￭\ufffe\u0000\b\ufffe\u0004\u0002￫\ufffe", objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                int i232 = ~(((-34) ^ i117) | ((-1) - (((-1) - (-34)) | ((-1) - i117))));
                                int i233 = ~((packedPositionType ^ i2) | ((-1) - (((-1) - packedPositionType) | ((-1) - i2))));
                                int i234 = (((packedPositionType * 960) - 63261) - (~((((i232 + i233) - (i232 | i233)) | (i232 ^ i233)) * 959))) + 32605;
                                int i235 = ~((-1) - (((-1) - ((-34) ^ i2)) & ((-1) - ((-34) & i2))));
                                int i236 = ~(((packedPositionType + i121) - (packedPositionType | i121)) | (i121 ^ packedPositionType));
                                int i237 = i235 ^ i236;
                                int i238 = i236 & i235;
                                int i239 = (i234 - (~(-(-(((i238 + i237) - (i238 & i237)) * 959))))) - 1;
                                int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                Object[] objArr15 = new Object[1];
                                n(i239, ((touchSlop + 191) - (191 | touchSlop)) + (touchSlop | 191), 22 - (~(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), true, "\uffff\t\u0001\uffff￮ￌ\u000b\u000eￌ\u0012\f\u0003\u0012\f\r\u0001ￌ\u0002\u0007\r\u0010\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff￫\u0003\u0005", objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int i240 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                Object[] objArr16 = new Object[1];
                                l(new int[]{-215065868, -592495712, 642614118, 236914565, 1321950798, 1514210649, 898019790, 678466707}, ((i240 + 13) - (13 | i240)) + ((-1) - (((-1) - i240) & ((-1) - 13))), objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                l(new int[]{-701590391, 277543290, -1975856770, -1739017852, 1573027383, 1751137777, -1808114160, 106237406, -1194616852, -919941874, 642614118, 236914565, 1321950798, 1514210649, 898019790, 678466707}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                int iBlue = Color.blue(0);
                                Object[] objArr18 = new Object[1];
                                l(new int[]{-1347576303, 970232229, -1567408486, -124323778, -1293590538, -433774259}, (((-1) - (((-1) - iBlue) & ((-1) - 10))) << 1) - (iBlue ^ 10), objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                for (int i241 = 0; i241 < length; i241 = ((-1) - (((-1) - i241) | ((-1) - 1))) + ((i241 + 1) - (i241 & 1))) {
                                    Object obj = objArr19[i241];
                                    int i242 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    int i243 = ((i242 + 5) - (5 | i242)) + ((i242 + 5) - (i242 & 5));
                                    int i244 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                    int i245 = i244 * 503;
                                    int i246 = i244 | 151;
                                    int i247 = ((i245 + 75953) - (i245 | 75953)) + (i245 | 75953) + (i246 * (-502));
                                    int i248 = ~i244;
                                    int i249 = ~((-152) | i248);
                                    int i250 = ~iElapsedRealtime;
                                    int i251 = i248 ^ i250;
                                    int i252 = (i250 + i248) - (i250 | i248);
                                    int i253 = (i251 + i252) - (i251 & i252);
                                    int i254 = i249 | (~i253);
                                    int i255 = ~((i246 + iElapsedRealtime) - (i246 & iElapsedRealtime));
                                    int i256 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i254) | ((-1) - i255)))) & ((-1) - (i254 ^ i255)))) * (-502)));
                                    int i257 = (i247 ^ i256) + ((i256 & i247) << 1);
                                    int i258 = ~((i253 & 151) | (i253 ^ 151));
                                    int i259 = (i244 ^ 151) | ((i244 + 151) - (i244 | 151));
                                    int i260 = i257 + (((-1) - (((-1) - i258) & ((-1) - (~(((i259 + iElapsedRealtime) - (i259 | iElapsedRealtime)) | (i259 ^ iElapsedRealtime)))))) * 502);
                                    int i261 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i262 = i261 * 868;
                                    int i263 = (i262 ^ 868) + ((i262 & 868) << 1);
                                    int i264 = ~i261;
                                    int i265 = (-2) ^ i117;
                                    int i266 = (-1) - (((-1) - (-2)) | ((-1) - i117));
                                    int i267 = ((-1) - (((-1) - (~((-1) - (((-1) - (i264 ^ i117)) & ((-1) - ((-1) - (((-1) - i264) | ((-1) - i117)))))))) & ((-1) - (~((i266 + i265) - (i266 & i265)))))) * (-867);
                                    int i268 = ((i263 | i267) << 1) - (i263 ^ i267);
                                    int i269 = ~((i264 ^ (-2)) | ((-2) & i264));
                                    int i270 = ~i261;
                                    int i271 = ~((i270 + i2) - (i270 & i2));
                                    int i272 = i269 ^ i271;
                                    int i273 = (i269 + i271) - (i269 | i271);
                                    int i274 = (i273 + i272) - (i273 & i272);
                                    int i275 = ~(((-2) ^ i2) | ((-1) - (((-1) - (-2)) | ((-1) - i2))));
                                    int i276 = ((-1) - (((-1) - (i274 ^ i275)) & ((-1) - (i274 & i275)))) * (-1734);
                                    int i277 = (i268 ^ i276) + (((-1) - (((-1) - i276) | ((-1) - i268))) << 1);
                                    int i278 = i264 ^ (-2);
                                    int i279 = i264 & (-2);
                                    int i280 = ~((-1) - (((-1) - ((i279 + i278) - (i279 & i278))) & ((-1) - i117)));
                                    int i281 = (i270 ^ 1) | ((-1) - (((-1) - i270) | ((-1) - 1)));
                                    int i282 = ~(((-1) - (((-1) - i281) | ((-1) - i2))) | (i281 ^ i2));
                                    int i283 = ((-1) - (((-1) - i280) | ((-1) - i282))) | (i280 ^ i282);
                                    int i284 = ((-1) - (((-1) - i261) | ((-1) - (-2)))) | ((-2) ^ i261);
                                    int i285 = i284 ^ i2;
                                    int i286 = (-1) - (((-1) - i284) | ((-1) - i2));
                                    int i287 = ~((i286 + i285) - (i286 & i285));
                                    int i288 = -(-((((-1) - (((-1) - i283) | ((-1) - i287))) | (i283 ^ i287)) * 867));
                                    Object[] objArr20 = new Object[1];
                                    n(i243, i260, ((i277 | i288) << 1) - (i288 ^ i277), false, "\uffff\u001e\ufff4\ufffb\ufff6", objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        int i289 = -(-View.resolveSize(0, 0));
                                        int i290 = (i289 ^ 37) + (((i289 + 37) - (i289 | 37)) << 1);
                                        int i291 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int iNextInt = new Random().nextInt(2137311993);
                                        int i292 = i291 * (-518);
                                        int i293 = ((i292 | (-99974)) << 1) - (i292 ^ (-99974));
                                        int i294 = ~i291;
                                        int i295 = ~iNextInt;
                                        int i296 = ~((i294 + i295) - (i294 & i295));
                                        int i297 = i293 + (((i296 + 193) - (i296 & 193)) * 519);
                                        int i298 = (-1) - (((-1) - (~i291)) & ((-1) - (~iNextInt)));
                                        int i299 = i298 ^ 193;
                                        int i300 = (i298 + 193) - (i298 | 193);
                                        int i301 = ~((i300 + i299) - (i300 & i299));
                                        int i302 = (-1) - (((-1) - ((-1) - (((-1) - i291) | ((-1) - 193)))) & ((-1) - (i291 ^ 193)));
                                        int i303 = ~((-1) - (((-1) - (i302 & iNextInt)) & ((-1) - (i302 ^ iNextInt))));
                                        int i304 = i301 ^ i303;
                                        int i305 = (i303 + i301) - (i303 | i301);
                                        int i306 = i297 + (((i305 + i304) - (i305 & i304)) * (-519));
                                        int i307 = iNextInt ^ 193;
                                        int i308 = (-1) - (((-1) - iNextInt) | ((-1) - 193));
                                        int i309 = ~((i307 + i308) - (i307 & i308));
                                        int i310 = -(-(((-1) - (((-1) - (i291 & i309)) & ((-1) - (i291 ^ i309)))) * 519));
                                        int i311 = (i306 ^ i310) + (((-1) - (((-1) - i310) | ((-1) - i306))) << 1);
                                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                        int i312 = iIndexOf2 * 70;
                                        int i313 = ((i312 - 2040) - ((-2040) | i312)) + (i312 | (-2040));
                                        int i314 = ~iIndexOf2;
                                        int i315 = ((-1) - (((-1) - i314) | ((-1) - (-31)))) | (i314 ^ (-31));
                                        int i316 = ~((i315 + iUptimeMillis) - (i315 & iUptimeMillis));
                                        int i317 = (-1) - (((-1) - (iIndexOf2 ^ 30)) & ((-1) - ((-1) - (((-1) - iIndexOf2) | ((-1) - 30)))));
                                        int i318 = i317 ^ iUptimeMillis;
                                        int i319 = (-1) - (((-1) - i317) | ((-1) - iUptimeMillis));
                                        int i320 = ~((i319 + i318) - (i319 & i318));
                                        int i321 = (i313 - (~(((-1) - (((-1) - ((-1) - (((-1) - i316) | ((-1) - i320)))) & ((-1) - (i316 ^ i320)))) * 69))) - 1;
                                        int i322 = ~iIndexOf2;
                                        int i323 = ~((i322 ^ 30) | ((-1) - (((-1) - i322) | ((-1) - 30))));
                                        int i324 = ~((-1) - (((-1) - ((-1) - (((-1) - i322) | ((-1) - iUptimeMillis)))) & ((-1) - (i322 ^ iUptimeMillis))));
                                        int i325 = (i324 & i323) | (i323 ^ i324);
                                        int i326 = ~((-1) - (((-1) - (iUptimeMillis & 30)) & ((-1) - (iUptimeMillis ^ 30))));
                                        int i327 = -(-(((-1) - (((-1) - ((i326 + i325) - (i326 | i325))) & ((-1) - (i325 ^ i326)))) * (-69)));
                                        Object[] objArr22 = new Object[1];
                                        n(i290, i311, ((i321 + i327) - (i321 | i327)) + ((i327 + i321) - (i327 & i321)) + ((~(((-31) & iIndexOf2) | ((-31) ^ iIndexOf2))) * 69), false, "\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff", objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        int i328 = -TextUtils.indexOf((CharSequence) "", '0');
                                        Object[] objArr23 = new Object[1];
                                        l(new int[]{1923268118, -532003228, -659595831, -226059459, -1209223156, 1708218683}, (i328 & 10) + ((-1) - (((-1) - i328) & ((-1) - 10))), objArr23);
                                        Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                        try {
                                            int i329 = -TextUtils.getCapsMode("", 0, 0);
                                            Object[] objArr24 = new Object[1];
                                            l(new int[]{-701590391, 277543290, -1975856770, -1739017852, 1573027383, 1751137777, -1808114160, 106237406, 147903756, 1796302172, -114737080, 1858023790, -37929095, -1941543012}, ((-1) - (((-1) - i329) | ((-1) - 28))) + ((i329 + 28) - (i329 & 28)), objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            int i330 = -View.combineMeasuredStates(0, 0);
                                            int i331 = ((-1) - (((-1) - i330) | ((-1) - 11))) + ((-1) - (((-1) - i330) & ((-1) - 11)));
                                            Object[] objArr25 = new Object[1];
                                            l(new int[]{1680935237, 832736389, 2067381310, 1657684035, -1429781511, 451140336}, i331, objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                int iMyPid2 = Process.myPid();
                                                int i332 = keyRepeatTimeout2 * (-515);
                                                int i333 = (((i332 + 19129) - (19129 & i332)) << 1) - (i332 ^ 19129);
                                                int i334 = (-38) ^ iMyPid2;
                                                int i335 = ((-38) + iMyPid2) - ((-38) | iMyPid2);
                                                int i336 = ~((i335 + i334) - (i335 & i334));
                                                int i337 = ~iMyPid2;
                                                int i338 = i336 | (~((i337 ^ keyRepeatTimeout2) | ((i337 + keyRepeatTimeout2) - (i337 | keyRepeatTimeout2))));
                                                int i339 = ~iMyPid2;
                                                int i340 = i339 ^ 37;
                                                int i341 = (i339 + 37) - (i339 | 37);
                                                int i342 = (i340 + i341) - (i340 & i341);
                                                int i343 = ~i342;
                                                int i344 = (i333 - (~(((-1) - (((-1) - (i338 ^ i343)) & ((-1) - ((-1) - (((-1) - i343) | ((-1) - i338)))))) * (-516)))) - 1;
                                                int i345 = ~keyRepeatTimeout2;
                                                int i346 = ((-1) - (((-1) - i345) | ((-1) - (-38)))) | (i345 ^ (-38));
                                                int i347 = ~((i346 & iMyPid2) | (i346 ^ iMyPid2));
                                                int i348 = ~keyRepeatTimeout2;
                                                int i349 = (-1) - (((-1) - i348) & ((-1) - i337));
                                                int i350 = ~((-1) - (((-1) - ((i349 + 37) - (i349 | 37))) & ((-1) - (i349 ^ 37))));
                                                int i351 = ((-1) - (((-1) - ((i347 + i350) - (i347 | i350))) & ((-1) - (i347 ^ i350)))) * 516;
                                                int i352 = (((i344 + i351) - (i344 & i351)) << 1) - (i351 ^ i344);
                                                int i353 = ~((-1) - (((-1) - i348) & ((-1) - 37)));
                                                int i354 = ~i342;
                                                int i355 = (((-1) - (((-1) - i353) | ((-1) - i354))) | (i353 ^ i354)) * 516;
                                                int i356 = (i352 ^ i355) + ((i355 & i352) << 1);
                                                int i357 = 192 - (~(KeyEvent.getMaxKeyCode() >> 16));
                                                int i358 = -Color.rgb(0, 0, 0);
                                                Object[] objArr27 = new Object[1];
                                                n(i356, i357, ((i358 - 16777187) - (i358 | (-16777187))) + (i358 | (-16777187)), false, "\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff", objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                int i359 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                                Object[] objArr28 = new Object[1];
                                                l(new int[]{-1593034054, -1075235362, 1645282956, -35109365, 1069599901, 119516553, 966812650, 1401160111, 1677697425, 16251588}, (i359 ^ 20) + (((i359 + 20) - (i359 | 20)) << 1), objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                int i360 = 0;
                                                while (i360 < 2) {
                                                    Object obj2 = objArr3[i360];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        l(new int[]{-107177949, -1535035645, -1355503614, 1119245503, 404181797, -1537796900, 1058453756, 1788655067, 456280524, -1129333183, 427793200, 1438563933, 995309680, 163508093, 1815295234, 1921220849, -1796192084, 176496310}, 33 - (~(-(KeyEvent.getMaxKeyCode() >> 16))), objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int i361 = -(-View.combineMeasuredStates(0, 0));
                                                        int i362 = (i361 ^ 23) + (((-1) - (((-1) - i361) | ((-1) - 23))) << 1);
                                                        int i363 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                        int iActiveCount = Thread.activeCount();
                                                        int i364 = (i363 * (-381)) - (-36288);
                                                        int i365 = ~i363;
                                                        int i366 = -(-(i365 * (-191)));
                                                        int i367 = ((-1) - (((-1) - i364) | ((-1) - i366))) + ((i366 + i364) - (i366 & i364));
                                                        int i368 = iActiveCount ^ 189;
                                                        int i369 = iActiveCount & 189;
                                                        int i370 = ~((i368 + i369) - (i368 & i369));
                                                        int i371 = i363 ^ i370;
                                                        int i372 = (-1) - (((-1) - i363) | ((-1) - i370));
                                                        int i373 = i367 + (((i372 + i371) - (i372 & i371)) * 191);
                                                        int i374 = i365 ^ 189;
                                                        int i375 = (-1) - (((-1) - i365) | ((-1) - 189));
                                                        int i376 = ~((i374 + i375) - (i374 & i375));
                                                        int i377 = ~iActiveCount;
                                                        int i378 = i377 ^ 189;
                                                        int i379 = i377 & 189;
                                                        int i380 = ~((i379 + i378) - (i379 & i378));
                                                        int i381 = i376 ^ i380;
                                                        int i382 = (i376 + i380) - (i376 | i380);
                                                        Object[] objArr30 = new Object[1];
                                                        n(i362, i373 + (((i382 + i381) - (i382 & i381)) * 191), 7 - (~(-TextUtils.indexOf("", "", 0))), true, "\u0006\u000b\u0003\u0016\ufff4\u0015\u0006\b\r\u0002\u0011\n\u0004\u000f\n\u0013\ufff1\uffd1\uffd1ￖ\ufff9\u0015\u0004", objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[]{((~i) & i) | ((i + i) - (i | i))}, new int[]{i2}, null, new int[]{(-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - (-2))))) & ((-1) - (i117 & 1)))}};
                                                            int i383 = f18997i * (-1981213670);
                                                            f18997i = i383;
                                                            int i384 = (-1676109331) + (((-1) - (((-1) - (~((-1) - (((-1) - (-184142995)) & ((-1) - i383))))) & ((-1) - (-494005028)))) * (-964)) + (((-1) - (((-1) - (~((~i383) | (-184142995)))) & ((-1) - 42468496))) * (-964));
                                                            int i385 = -(-(i384 * (-103)));
                                                            int i386 = (((-1) - (((-1) - (-1648)) & ((-1) - i385))) << 1) - (i385 ^ (-1648));
                                                            int i387 = ~i384;
                                                            int i388 = ~(((-1) - (((-1) - i387) | ((-1) - (-17)))) | ((-17) ^ i387));
                                                            int i389 = ~i384;
                                                            int i390 = ~((i389 & i2) | (i389 ^ i2));
                                                            int i391 = (-1) - (((-1) - (i121 ^ 16)) & ((-1) - ((-1) - (((-1) - i121) | ((-1) - 16)))));
                                                            int i392 = i391 ^ i384;
                                                            int i393 = i391 & i384;
                                                            int i394 = (((i386 - (~(((-1) - (((-1) - ((-1) - (((-1) - i388) | ((-1) - i390)))) & ((-1) - (i388 ^ i390)))) * 104))) - 1) - (~((~((i393 + i392) - (i393 & i392))) * (-104)))) - 1;
                                                            int i395 = -(-(((-1) - (((-1) - i2) & ((-1) - 16))) * 104));
                                                            int i396 = (((-1) - (((-1) - i394) & ((-1) - i395))) << 1) - (i395 ^ i394);
                                                            int i397 = (i396 * (-381)) + (i3 * 192);
                                                            int i398 = (~i396) * (-191);
                                                            int i399 = (i397 ^ i398) + ((i397 & i398) << 1);
                                                            int i400 = -(-(((~((i3 ^ i2) | ((-1) - (((-1) - i3) | ((-1) - i2))))) | i396) * 191));
                                                            int i401 = (((-1) - (((-1) - i399) & ((-1) - i400))) << 1) - (i400 ^ i399);
                                                            int i402 = ~i396;
                                                            int i403 = i402 ^ i3;
                                                            int i404 = (-1) - (((-1) - i402) | ((-1) - i3));
                                                            int i405 = ~((i404 + i403) - (i404 & i403));
                                                            int i406 = ~((i121 ^ i3) | (i121 & i3));
                                                            int i407 = i405 ^ i406;
                                                            int i408 = (-1) - (((-1) - i405) | ((-1) - i406));
                                                            int i409 = (i401 - (~(-(-(((i408 + i407) - (i408 & i407)) * 191))))) - 1;
                                                            int i410 = i409 << 13;
                                                            int i411 = (-1) - (((-1) - (~i410)) | ((-1) - i409));
                                                            int i412 = ~i409;
                                                            int i413 = (-1) - (((-1) - ((i410 + i412) - (i410 | i412))) & ((-1) - i411));
                                                            int i414 = i413 >>> 17;
                                                            int i415 = ~(i413 & i414);
                                                            int i416 = i413 | i414;
                                                            int i417 = (i416 + i415) - (i416 | i415);
                                                            int i418 = i417 << 5;
                                                            int i419 = ~i418;
                                                            return objArr31;
                                                        }
                                                        int i420 = (((-1) - (((-1) - i360) & ((-1) - 83))) << 1) - (i360 ^ 83);
                                                        i360 = (((-82) | i420) << 1) - (i420 ^ (-82));
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
        Object[] objArr32 = {new int[]{(i + i) - (i & i)}, new int[]{i2}, null, new int[]{i2}};
        int i421 = f18998j * 1728064961;
        f18998j = i421;
        int i422 = ((((5288352 + r2) - (5288352 & r2)) * (-196)) - 721177427) + (((~(i421 | 39629218)) | 34340866) * 196);
        int i423 = ((i422 << 1) - i422) + i3;
        int i424 = i423 << 13;
        int i425 = (~i424) & i423;
        int i426 = ~i423;
        int i427 = ((i426 + i424) - (i426 | i424)) | i425;
        int i428 = i427 >>> 17;
        int i429 = (-1) - (((-1) - (i427 | i428)) | ((-1) - (~((-1) - (((-1) - i427) | ((-1) - i428))))));
        int i430 = i429 << 5;
        int i431 = (-1) - (((-1) - (~i430)) | ((-1) - i429));
        int i432 = (-1) - (((-1) - (~i429)) | ((-1) - i430));
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{84, 109, 90, 4};
        $$b = 72;
    }

    static void init$1() {
        $$d = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS, -11, 69, MessagePack.Code.UINT32, -12, -5, 16, -6, -2, 0, 67, -68, 16, -6, 62, MessagePack.Code.FLOAT64, -4, 3, -1, -10, Ascii.DC4, -10, 10, 3, -16, Ascii.SI, 55, -69, 3, Ascii.DC2, -12, -4, 19, -1, -16, Ascii.FF, -5, 2, Ascii.FF, -11, 2, -5, 3, 4, 4, Utf8.REPLACEMENT_BYTE, MessagePack.Code.STR32, -29, Ascii.DC2, -12, -4, 19, -1, -16, Ascii.FF, -5, 2, 44, MessagePack.Code.FIXEXT2, 2, -5, 3, 4, 4};
        $$e = 83;
    }

    static void init$2() {
        $$c = new byte[]{108, -115, 75, MessagePack.Code.EXT32};
        $$f = 59;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(byte r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            int r0 = r10 * 4
            int r8 = 1 - r0
            byte[] r7 = fr.antelop.sdk.cardeventlistener.DefaultCardEventListener.$$a
            int r0 = r9 * 4
            int r6 = 4 - r0
            int r5 = 100 - r11
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L2d
            r2 = r3
            r1 = r6
        L13:
            int r6 = r6 + r5
            int r0 = r1 + 1
            r1 = r2
            r5 = r6
            r6 = r0
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r8) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L28:
            r0 = r7[r6]
            r1 = r6
            r6 = r0
            goto L13
        L2d:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.cardeventlistener.DefaultCardEventListener.k(byte, int, int, java.lang.Object[]):void");
    }

    private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f18993e;
        long j2 = 0;
        int i4 = 989264422;
        int i5 = -1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objA = d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 + 1);
                        objA = d.a(675 - Gravity.getAbsoluteGravity(i6, i6), (char) ExpandableListView.getPackedPositionGroup(j2), TextUtils.indexOf("", "") + 12, -328001469, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    j2 = 0;
                    i4 = 989264422;
                    i5 = -1;
                    i6 = 0;
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
        int[] iArr5 = f18993e;
        char c2 = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objA2 = d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = d.a(675 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.lastIndexOf("", c2, 0) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 12, -328001469, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i8++;
                c2 = '0';
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i9 = $11 + 23;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $11 + 105;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                lVar.f19942e ^= iArr4[i11];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA3 = d.a(Color.rgb(0, 0, 0) + 16777517, (char) (52697 - KeyEvent.keyCodeFromString("")), 11 - (KeyEvent.getMaxKeyCode() >> 16), -1416256172, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i11++;
            }
            int i15 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i15;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i16 = lVar.f19942e;
            int i17 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 1);
                objA4 = d.a(228 - ExpandableListView.getPackedPositionChild(0L), (char) (51004 - View.resolveSize(0, 0)), '9' - AndroidCharacter.getMirror('0'), -330018025, false, $$g(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void m(byte b2, byte b3, int i2, Object[] objArr) {
        int i3 = (i2 * 63) + 4;
        int i4 = b3 * 63;
        int i5 = 102 - b2;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[64 - i4];
        int i6 = 63 - i4;
        int i7 = -1;
        if (bArr == null) {
            int i8 = i6 + (-i3);
            i3++;
            i5 = i8 + 1;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i5 = i5 + (-bArr[i3]) + 1;
            }
        }
    }

    private static void n(int i2, int i3, int i4, boolean z2, String str, Object[] objArr) throws Throwable {
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
        int i6 = $11 + 57;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 % 5;
        }
        while (nVar.f19944a < i2) {
            int i8 = $10 + 121;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f18990b)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = d.a(270 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), (KeyEvent.getMaxKeyCode() >> 16) + 11, -2071844881, false, $$g(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    objA2 = d.a(523 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 627984172, false, $$g(b4, (byte) (b4 + 1), (byte) $$c.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i11 = $10 + 9;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 2 / 4;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            int i13 = $11 + 33;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i15 = $11 + 29;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i17 = $11 + 57;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = d.a(-202660535);
                if (objA3 == null) {
                    byte b5 = (byte) (-1);
                    objA3 = d.a(522 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getScrollBarSize() >> 8), 12 - ((Process.getThreadPriority(0) + 20) >> 6), 627984172, false, $$g(b5, (byte) (b5 + 1), (byte) $$c.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x025d  */
    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCardActivated(android.content.Context r27, java.lang.String r28, java.lang.String r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.cardeventlistener.DefaultCardEventListener.onCardActivated(android.content.Context, java.lang.String, java.lang.String):void");
    }

    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    public void onCardActivating(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f18989a + 11;
        f18994f = i3 % 128;
        int i4 = i3 % 2;
        "onCardActivating : ".concat(String.valueOf(str));
        int i5 = f18994f + 89;
        f18989a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    public void onCardActivationRequired(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f18994f + 97;
        f18989a = i3 % 128;
        int i4 = i3 % 2;
        "onCardActivationRequired : ".concat(String.valueOf(str));
        int i5 = f18989a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18994f = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    public void onCardDeleted(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f18994f + 1;
        f18989a = i3 % 128;
        if (i3 % 2 != 0) {
            "onCardDeleted : ".concat(String.valueOf(str));
            int i4 = 85 / 0;
        } else {
            "onCardDeleted : ".concat(String.valueOf(str));
        }
        int i5 = f18989a + 73;
        f18994f = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    public void onCardDisplayUpdated(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f18994f + 61;
        f18989a = i3 % 128;
        if (i3 % 2 != 0) {
            "onCardDisplayUpdated : ".concat(String.valueOf(str));
            throw null;
        }
        "onCardDisplayUpdated : ".concat(String.valueOf(str));
        int i4 = f18989a + 111;
        f18994f = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    public void onCardLocked(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f18989a + 57;
        f18994f = i3 % 128;
        if (i3 % 2 != 0) {
            "onCardLocked : ".concat(String.valueOf(str));
            return;
        }
        "onCardLocked : ".concat(String.valueOf(str));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    public void onCardPaymentInformationUpdated(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f18994f + 39;
        f18989a = i3 % 128;
        if (i3 % 2 != 0) {
            "onCardPaymentInformationUpdated : ".concat(String.valueOf(str));
            throw null;
        }
        "onCardPaymentInformationUpdated : ".concat(String.valueOf(str));
        int i4 = f18994f + 61;
        f18989a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    public void onCardPaymentKeysRefreshed(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f18994f + 35;
        f18989a = i3 % 128;
        if (i3 % 2 == 0) {
            "onCardPaymentKeysRefreshed : ".concat(String.valueOf(str));
        } else {
            "onCardPaymentKeysRefreshed : ".concat(String.valueOf(str));
            throw null;
        }
    }

    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    public void onCardRedigitized(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f18994f + 37;
        f18989a = i3 % 128;
        if (i3 % 2 == 0) {
            "onCardRedigitized : ".concat(String.valueOf(str));
        } else {
            "onCardRedigitized : ".concat(String.valueOf(str));
            int i4 = 78 / 0;
        }
    }

    @Override // fr.antelop.sdk.cardeventlistener.CardEventListener
    public void onCardTermsAndConditionsApprovalRequired(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f18994f + 19;
        f18989a = i3 % 128;
        int i4 = i3 % 2;
        "onCardTermsAndConditionsApprovalRequired : ".concat(String.valueOf(str));
        int i5 = f18994f + 101;
        f18989a = i5 % 128;
        int i6 = i5 % 2;
    }
}
