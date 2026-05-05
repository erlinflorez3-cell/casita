package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import fr.antelop.sdk.CancellationSignal;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.m;
import o.a.n;
import o.d.d;
import o.eb.b;
import o.x.i;
import o.x.j;
import o.y.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class VirtualCardNumberGenerator implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f19293a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f19294b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f19295c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f19296d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f19297e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f19298f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f19299g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f19300h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f19301i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f19302j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19303k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f19304l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f19305m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f19306n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f19307o = 0;
    private CustomerAuthenticatedProcessActivityCallback activityCallback;
    private Drawable cardDrawable = null;
    private Integer cardForegroundColor = null;
    private final o innerSecureDigitalCardVcnGeneratorProcess;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r0 = r7 * 2
            int r7 = 3 - r0
            int r0 = r6 * 3
            int r6 = r0 + 1
            byte[] r5 = fr.antelop.sdk.digitalcard.VirtualCardNumberGenerator.$$c
            int r0 = 120 - r8
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L26
            r2 = r7
            r1 = r3
        L13:
            int r7 = r7 + r0
        L14:
            int r2 = r2 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            r0 = r5[r2]
            goto L13
        L26:
            r1 = r3
            r2 = r7
            r7 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumberGenerator.$$g(byte, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f19307o = 673595890;
        f19303k = -1616376974;
        init$0();
        f19300h = -1574604607;
        f19301i = -639170620;
        f19302j = 416412364;
        f19299g = -1939357862;
        f19295c = 932728790;
        f19293a = 311036942;
        f19297e = 1282124067;
        f19294b = -1848230024;
        f19296d = -1702886488;
        f19306n = 0;
        f19304l = 1;
        f19298f = new char[]{56481, 56535, 56557, 56553, 56551, 56550, 56551, 56553, 56555, 56560, 56556, 56550, 56521, 56526, 56561, 56528, 56512, 56550, 56566, 56563, 56556, 56553, 56506, 56561, 56564, 56571, 56574, 56558, 56520, 56530, 56562, 56559, 56558, 56533, 56527, 56563, 56563, 56557, 56504, 56556, 56550, 56552, 56555, 56557, 56545, 56512, 56496, 56498, 56518, 56515, 56495, 56496, 56498, 56534, 56531, 56523, 56558, 56564, 56555, 56519, 56531, 56566, 56558, 56557, 56563, 56556, 56548, 56556, 56528, 56531, 56556, 56555, 56555, 56549, 56555, 56550, 56499, 56558, 56555, 56547, 56532, 56498, 56514, 56550, 56556, 56560, 56555, 56553, 56535, 56511, 56517, 56520, 56503, 56520, 56550, 56556, 56560, 56555, 56553, 56535, 56511, 56518, 56509, 56511, 56532, 56521, 56512, 56542, 56380, 56386, 56376, 56366, 56376, 56381, 56380, 56378, 56380, 56367, 56365, 56381, 56383, 56507, 56561, 56561, 56546, 56542, 56557, 56555, 56557, 56558, 56553, 56543, 56518, 56532, 56565, 56534, 56536, 56568, 56560, 56563, 56568, 56565, 56560, 56527, 56528, 56557, 56563, 56567, 56562, 56560, 56558, 56496, 56551, 56554, 56552, 56558, 56563, 56556, 56555, 56563, 56564, 56492, 56520, 56500, 56498, 56497, 56356, 56371, 56376, 56321, 56366, 56371, 56376, 56352, 56369, 56369, CharCompanionObject.MIN_LOW_SURROGATE, 56498, 56556, 56554, 56546, 56550, 56551, 56551, 56558, 56563, 56555, 56532, 56532, 56556, 56554, 56553, 56555, 56553, 56553, 56550};
        f19305m = -1270219361;
    }

    public VirtualCardNumberGenerator(o oVar) {
        this.innerSecureDigitalCardVcnGeneratorProcess = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v96 */
    public static Object[] b(Context context, int i2, int i3) {
        int i4 = 1;
        if (context == null) {
            Object[] objArr = {new int[1], new int[]{i2}, null, new int[]{i2}};
            int i5 = ((((608772864 + r6) - (608772864 & r6)) * (-970)) - 738796639) + (((-1) - (((-1) - (~((~Thread.currentThread().getPriority()) | 643392322))) & ((-1) - 34619458))) * 970);
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = -(-(i5 * (-112)));
            int i8 = -(-((~((-1) - (((-1) - (~i5)) & ((-1) - (~i6))))) * 226));
            int i9 = (i7 & i8) + ((i7 + i8) - (i7 & i8));
            int i10 = ~((-1) - (((-1) - ((-1) ^ i5)) & ((-1) - i5)));
            int i11 = ~((-1) - (((-1) - ((-1) ^ i6)) & ((-1) - i6)));
            int i12 = i10 ^ i11;
            int i13 = i10 & i11;
            int i14 = (i13 + i12) - (i13 & i12);
            int i15 = ~i5;
            int i16 = ~i6;
            int i17 = ~((i16 + i15) - (i16 & i15));
            int i18 = ((-1) - (((-1) - ((-1) - (((-1) - i14) | ((-1) - i17)))) & ((-1) - (i14 ^ i17)))) * (-113);
            int i19 = (i9 ^ i18) + ((i18 & i9) << 1) + ((~((-1) - (((-1) - ((i6 + i15) - (i6 | i15))) & ((-1) - (i15 ^ i6))))) * 113);
            int i20 = f19296d * (-757395653);
            f19296d = i20;
            int i21 = (-1) - (((-1) - (i19 ^ i3)) & ((-1) - ((i19 + i3) - (i19 | i3))));
            int i22 = ((((i19 * 503) - (~(i3 * 503))) - 1) - (~(-(-(i21 * (-502)))))) - 1;
            int i23 = ~i19;
            int i24 = ~i3;
            int i25 = i23 ^ i24;
            int i26 = (-1) - (((-1) - i24) | ((-1) - i23));
            int i27 = ~((i26 + i25) - (i26 & i25));
            int i28 = ~i19;
            int i29 = ~i20;
            int i30 = ~((i28 + i29) - (i28 & i29));
            int i31 = (-1) - (((-1) - (i30 & i27)) & ((-1) - (i27 ^ i30)));
            int i32 = i21 ^ i20;
            int i33 = i20 & i21;
            int i34 = ~((i33 + i32) - (i33 & i32));
            int i35 = i22 + (((i31 ^ i34) | ((-1) - (((-1) - i31) | ((-1) - i34)))) * (-502));
            int i36 = (-1) - (((-1) - (i23 ^ i29)) & ((-1) - (i23 & i29)));
            int i37 = ~((-1) - (((-1) - ((i3 + i36) - (i3 | i36))) & ((-1) - (i36 ^ i3))));
            int i38 = ((-1) - (((-1) - ((-1) - (((-1) - i34) | ((-1) - i37)))) & ((-1) - (i37 ^ i34)))) * 502;
            int i39 = ((i35 | i38) << 1) - (i38 ^ i35);
            int i40 = i39 << 13;
            int i41 = (i40 & (~i39)) | ((-1) - (((-1) - (~i40)) | ((-1) - i39)));
            int i42 = i41 >>> 17;
            int i43 = (-1) - (((-1) - (i41 | i42)) | ((-1) - (~(i41 & i42))));
            ((int[]) objArr[0])[0] = i43 ^ (i43 << 5);
            return objArr;
        }
        try {
            Object[] objArr2 = new Object[1];
            q(new int[]{38, 38, 0, 36}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true, objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            int i44 = -((byte) KeyEvent.getModifierMetaStateMask());
            int i45 = (i44 ^ 30) + ((i44 & 30) << 1);
            int i46 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iNextInt = new Random().nextInt(90239985);
            int i47 = i46 * (-665);
            int i48 = (i47 ^ 72478) + ((i47 & 72478) << 1);
            int i49 = (~i46) * (-333);
            int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
            int i51 = ~i46;
            int i52 = ~iNextInt;
            int i53 = ~((-1) - (((-1) - (i51 ^ i52)) & ((-1) - (i52 & i51))));
            int i54 = iNextInt ^ 217;
            int i55 = (-1) - (((-1) - iNextInt) | ((-1) - 217));
            int i56 = ~((i54 + i55) - (i54 & i55));
            int i57 = ((i56 & i53) | (i53 ^ i56)) * 333;
            int i58 = ((-1) - (((-1) - i50) | ((-1) - i57))) + (i50 | i57);
            int i59 = ~((-1) - (((-1) - ((-1) - (((-1) - i51) | ((-1) - iNextInt)))) & ((-1) - (i51 ^ iNextInt))));
            int i60 = ~iNextInt;
            int i61 = ~((-1) - (((-1) - ((-1) - (((-1) - i60) | ((-1) - 217)))) & ((-1) - (i60 ^ 217))));
            int i62 = i59 ^ i61;
            int i63 = i61 & i59;
            int i64 = i58 + (((i63 + i62) - (i63 & i62)) * 333);
            int i65 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i66 = f19294b * 64658845;
            f19294b = i66;
            int i67 = i65 * (-433);
            int i68 = (i67 & (-1728)) + ((-1) - (((-1) - i67) & ((-1) - (-1728))));
            int i69 = ~i65;
            int i70 = ~i66;
            int i71 = i69 ^ i70;
            int i72 = (i70 + i69) - (i70 | i69);
            int i73 = (i68 - (~(((-1) - (((-1) - (~((i71 + i72) - (i71 & i72)))) & ((-1) - (~((-1) - (((-1) - ((-9) ^ i66)) & ((-1) - (((-9) + i66) - ((-9) | i66))))))))) * 217))) - 1;
            int i74 = ~((i69 ^ (-9)) | ((i69 - 9) - ((-9) | i69)));
            int i75 = ~(i69 | i66);
            int i76 = -(-((((i75 + i74) - (i75 | i74)) | (i74 ^ i75)) * 217));
            int i77 = ((i73 + i76) - (i73 | i76)) + ((i76 + i73) - (i76 & i73));
            int i78 = ~i66;
            int i79 = (-9) ^ i78;
            int i80 = (-1) - (((-1) - (-9)) | ((-1) - i78));
            Object[] objArr4 = new Object[1];
            r(i45, i64, (i77 - (~((i65 | (~((i80 + i79) - (i80 & i79)))) * 217))) - 1, true, "\u001a\u001d\u000f\u0019￬￨\ufff9￮\ufffe\u0000￨￮ￗ\u000f\u0014\u001a\u001d\u000f\u0019￬￨\ufffaￗ\u0012 \r\u0010\uffefￋ\u000f\u0014", objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                Object[] objArr6 = new Object[1];
                q(new int[]{38, 38, 0, 36}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true, objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                q(new int[]{76, 31, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    Object[] objArr9 = new Object[1];
                    q(new int[]{38, 38, 0, 36}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true, objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        int i81 = -TextUtils.indexOf("", "", 0);
                        int i82 = (i81 ^ 23) + (((-1) - (((-1) - i81) | ((-1) - 23))) << 1);
                        int gidForName = Process.getGidForName("");
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i83 = gidForName * (-716);
                        int i84 = ((-1) - (((-1) - i83) | ((-1) - 335790))) + ((-1) - (((-1) - i83) & ((-1) - 335790)));
                        int i85 = ~gidForName;
                        int i86 = ((-1) - (((-1) - (i85 ^ 234)) & ((-1) - (234 & i85)))) * (-1434);
                        int i87 = (((i84 + i86) - (i84 & i86)) << 1) - (i86 ^ i84);
                        int i88 = ~iFreeMemory;
                        int i89 = i88 ^ 234;
                        int i90 = i88 & 234;
                        int i91 = ~((i90 + i89) - (i90 & i89));
                        int i92 = ~((gidForName ^ 234) | ((-1) - (((-1) - gidForName) | ((-1) - 234))));
                        int i93 = ((-1) - (((-1) - i91) | ((-1) - i92))) | (i91 ^ i92);
                        int i94 = (i85 - 235) - ((-235) & i85);
                        int i95 = ~((i94 + iFreeMemory) - (i94 & iFreeMemory));
                        int i96 = i93 ^ i95;
                        int i97 = i93 & i95;
                        int i98 = -(-(((i97 + i96) - (i97 & i96)) * 717));
                        int i99 = ((-1) - (((-1) - i87) | ((-1) - i98))) + (i98 | i87);
                        int i100 = ((i85 - 235) - (i85 | (-235))) | (i85 ^ (-235));
                        int i101 = ~iFreeMemory;
                        int i102 = ~((-1) - (((-1) - ((-1) - (((-1) - i100) | ((-1) - i101)))) & ((-1) - (i100 ^ i101))));
                        int i103 = ~(gidForName | 234);
                        int i104 = (-1) - (((-1) - (i103 & i102)) & ((-1) - (i102 ^ i103)));
                        int i105 = ~((-1) - (((-1) - ((-1) - (((-1) - iFreeMemory) | ((-1) - 234)))) & ((-1) - (iFreeMemory ^ 234))));
                        int i106 = -(-(((i104 + i105) - (i104 & i105)) * 717));
                        int i107 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        Object[] objArr10 = new Object[1];
                        r(i82, ((i99 | i106) << 1) - (i106 ^ i99), (((-1) - (((-1) - i107) & ((-1) - 15))) << 1) - (i107 ^ 15), true, "\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼\u000f\u0013\u0000\u000f\t\n\uffde\uffc9", objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int i108 = -TextUtils.getOffsetBefore("", 0);
                        int i109 = f19297e * (-130374891);
                        f19297e = i109;
                        int i110 = i108 * 495;
                        int i111 = (i110 ^ (-8381)) + (((-1) - (((-1) - i110) | ((-1) - (-8381)))) << 1);
                        int i112 = ((-1) - (((-1) - (i108 ^ (-18))) & ((-1) - ((-1) - (((-1) - i108) | ((-1) - (-18))))))) * (-988);
                        int i113 = (i111 & i112) + ((i112 + i111) - (i112 & i111));
                        int i114 = (-1) - (((-1) - (~i108)) & ((-1) - 17));
                        int i115 = ~i109;
                        int i116 = -(-((((-1) - (((-1) - i114) | ((-1) - i115))) | (i114 ^ i115)) * 494));
                        int i117 = ((i113 + i116) - (i113 | i116)) + ((-1) - (((-1) - i116) & ((-1) - i113)));
                        int i118 = ~i108;
                        int i119 = i118 ^ (-18);
                        int i120 = (i118 - 18) - (i118 | (-18));
                        int i121 = ~((i120 + i119) - (i120 & i119));
                        int i122 = ~((-1) - (((-1) - i115) & ((-1) - 17)));
                        int i123 = i117 + (((~(((-1) - (((-1) - i108) | ((-1) - 17))) | (i108 ^ 17))) | (i122 & i121) | (i121 ^ i122)) * 494);
                        int i124 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i125 = ((i124 | 232) << 1) - (i124 ^ 232);
                        int i126 = -(-ExpandableListView.getPackedPositionChild(0L));
                        int i127 = (((i126 + 14) - (14 & i126)) << 1) - (i126 ^ 14);
                        Object[] objArr11 = new Object[1];
                        r(i123, i125, i127, true, "\n�￩\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003\u000e\u0001\u0003�", objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            int i128 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i129 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            int i130 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                            Object[] objArr12 = new Object[1];
                            r((i128 ^ 23) + (((i128 + 23) - (i128 | 23)) << 1), (i129 & 233) + ((-1) - (((-1) - i129) & ((-1) - 233))), (((-1) - (((-1) - i130) & ((-1) - 15))) << 1) - (i130 ^ 15), true, "\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼\u000f\u0013\u0000\u000f\t\n\uffde\uffc9", objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            q(new int[]{107, 14, 86, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                int iMyPid = Process.myPid() >> 22;
                                int iNextInt2 = new Random().nextInt();
                                int i131 = (iMyPid * (-433)) - 7128;
                                int i132 = ~iMyPid;
                                int i133 = ~iNextInt2;
                                int i134 = ~((-1) - (((-1) - (i132 ^ i133)) & ((-1) - (i132 & i133))));
                                int i135 = ~((-1) - (((-1) - ((-34) ^ iNextInt2)) & ((-1) - ((-1) - (((-1) - (-34)) | ((-1) - iNextInt2))))));
                                int i136 = ((i134 ^ i135) | ((i134 + i135) - (i134 | i135))) * 217;
                                int i137 = (i131 ^ i136) + (((i136 + i131) - (i136 | i131)) << 1);
                                int i138 = ~iMyPid;
                                int i139 = ~((-1) - (((-1) - ((-1) - (((-1) - i138) | ((-1) - (-34))))) & ((-1) - (i138 ^ (-34)))));
                                int i140 = i132 ^ iNextInt2;
                                int i141 = (iNextInt2 + i132) - (iNextInt2 | i132);
                                int i142 = (i137 - (~(((~((i141 + i140) - (i141 & i140))) | i139) * 217))) - 1;
                                int i143 = ~((-1) - (((-1) - (-34)) & ((-1) - i133)));
                                int i144 = -(-((((-1) - (((-1) - iMyPid) | ((-1) - i143))) | (iMyPid ^ i143)) * 217));
                                int i145 = ((-1) - (((-1) - i142) | ((-1) - i144))) + ((-1) - (((-1) - i144) & ((-1) - i142)));
                                int i146 = -Color.red(0);
                                int i147 = f19293a * 900066296;
                                f19293a = i147;
                                int i148 = i146 * IptcDirectory.TAG_OBJECT_PREVIEW_DATA;
                                int i149 = (i148 ^ (-163760)) + ((i148 & (-163760)) << 1);
                                int i150 = ~i146;
                                int i151 = ~i147;
                                int i152 = ~((i150 + i151) - (i150 & i151));
                                int i153 = ~((-1) - (((-1) - ((-1) - (((-1) - i150) | ((-1) - 230)))) & ((-1) - (i150 ^ 230))));
                                int i154 = ((i153 + i152) - (i153 | i152)) | (i152 ^ i153);
                                int i155 = ((-231) ^ i146) | ((-1) - (((-1) - (-231)) | ((-1) - i146)));
                                int i156 = i155 ^ i147;
                                int i157 = (i155 + i147) - (i155 | i147);
                                int i158 = ~((i156 + i157) - (i156 & i157));
                                int i159 = i154 ^ i158;
                                int i160 = (i154 + i158) - (i154 | i158);
                                int i161 = i149 + (((i159 + i160) - (i159 & i160)) * (-713));
                                int i162 = (-231) ^ i146;
                                int i163 = (i146 - 231) - (i146 | (-231));
                                int i164 = (i163 + i162) - (i163 & i162);
                                int i165 = i164 ^ i147;
                                int i166 = (-1) - (((-1) - i164) | ((-1) - i147));
                                int i167 = i161 + ((~((i166 + i165) - (i166 & i165))) * 1426);
                                int i168 = -(-((~((-1) - (((-1) - ((-231) ^ i151)) & ((-1) - (((-231) + i151) - ((-231) | i151)))))) * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION));
                                int i169 = (((i167 + i168) - (i167 & i168)) << 1) - (i168 ^ i167);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                                int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                int i170 = iLastIndexOf * 569;
                                int i171 = (i170 & 15932) + ((-1) - (((-1) - i170) & ((-1) - 15932)));
                                int i172 = ~iLastIndexOf;
                                int i173 = ~((i172 ^ (-29)) | ((-29) & i172));
                                int i174 = ~iLastIndexOf;
                                int i175 = ~iFreeMemory2;
                                int i176 = (-1) - (((-1) - i173) & ((-1) - (~((-1) - (((-1) - i174) & ((-1) - i175))))));
                                int i177 = ~iFreeMemory2;
                                int i178 = (-29) ^ i177;
                                int i179 = ((-29) + i177) - ((-29) | i177);
                                int i180 = ~((i178 + i179) - (i178 & i179));
                                int i181 = i176 ^ i180;
                                int i182 = (-1) - (((-1) - i180) | ((-1) - i176));
                                int i183 = i171 + (((i181 + i182) - (i181 & i182)) * (-1136));
                                int i184 = ~((-1) - (((-1) - i172) & ((-1) - iFreeMemory2)));
                                int i185 = ~(((-29) ^ iFreeMemory2) | (((-29) + iFreeMemory2) - ((-29) | iFreeMemory2)));
                                int i186 = (i184 ^ i185) | ((-1) - (((-1) - i184) | ((-1) - i185)));
                                int i187 = i175 ^ iLastIndexOf;
                                int i188 = (i175 + iLastIndexOf) - (i175 | iLastIndexOf);
                                int i189 = (i187 + i188) - (i187 & i188);
                                int i190 = ~((-1) - (((-1) - (i189 ^ 28)) & ((-1) - ((i189 + 28) - (i189 | 28)))));
                                int i191 = (i183 - (~(((i186 + i190) - (i186 & i190)) * (-568)))) - 1;
                                int i192 = i177 ^ iLastIndexOf;
                                int i193 = (-1) - (((-1) - iLastIndexOf) | ((-1) - i177));
                                int i194 = ~((i193 + i192) - (i193 & i192));
                                int i195 = ~((i175 ^ 28) | (i175 & 28));
                                int i196 = i194 ^ i195;
                                int i197 = (i194 + i195) - (i194 | i195);
                                int i198 = (i197 + i196) - (i197 & i196);
                                int i199 = i174 ^ (-29);
                                int i200 = (-1) - (((-1) - (-29)) | ((-1) - i174));
                                int i201 = (i199 + i200) - (i199 & i200);
                                int i202 = ~((-1) - (((-1) - ((-1) - (((-1) - iFreeMemory2) | ((-1) - i201)))) & ((-1) - (i201 ^ iFreeMemory2))));
                                int i203 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i198) | ((-1) - i202)))) & ((-1) - (i198 ^ i202)))) * 568));
                                Object[] objArr15 = new Object[1];
                                r(i145, i169, (i191 & i203) + ((i203 + i191) - (i203 & i191)), true, "￫\u0003\u0005\uffff\t\u0001\uffff￮ￌ\u000b\u000eￌ\u0012\f\u0003\u0012\f\r\u0001ￌ\u0002\u0007\r\u0010\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff", objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 14;
                                int i204 = -KeyEvent.normalizeMetaState(0);
                                int i205 = ((i204 + 232) - (232 | i204)) + ((i204 + 232) - (i204 & 232));
                                int i206 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i207 = f19295c * (-912041998);
                                f19295c = i207;
                                int i208 = i206 * (-405);
                                int i209 = (i208 ^ 5698) + ((i208 & 5698) << 1);
                                int i210 = ~(((-15) + i207) - ((-15) & i207));
                                int i211 = ~i207;
                                int i212 = i211 ^ i206;
                                int i213 = i211 & i206;
                                int i214 = (i213 + i212) - (i213 & i212);
                                int i215 = ~((-1) - (((-1) - ((-1) - (((-1) - i214) | ((-1) - 14)))) & ((-1) - (i214 ^ 14))));
                                int i216 = i210 ^ i215;
                                int i217 = i210 & i215;
                                int i218 = (i209 - (~(((i217 + i216) - (i217 & i216)) * (-406)))) - 1;
                                int i219 = ~i207;
                                int i220 = ((-1) - (((-1) - (-15)) | ((-1) - i219))) | ((-15) ^ i219);
                                int i221 = i220 ^ i206;
                                int i222 = (-1) - (((-1) - i220) | ((-1) - i206));
                                int i223 = (~((i222 + i221) - (i222 & i221))) * (-406);
                                int i224 = (((-1) - (((-1) - i218) & ((-1) - i223))) << 1) - (i223 ^ i218);
                                int i225 = ~i206;
                                int i226 = ~((i225 & i207) | (i225 ^ i207));
                                int i227 = ~((-1) - (((-1) - (i219 ^ 14)) & ((-1) - ((14 + i219) - (14 | i219)))));
                                int i228 = (i224 - (~((((-1) - (((-1) - i226) | ((-1) - i227))) | (i226 ^ i227)) * HttpStatus.SC_NOT_ACCEPTABLE))) - 1;
                                Object[] objArr16 = new Object[1];
                                r(iIndexOf, i205, i228, false, "\u0003\u0001\u0010￬�\uffff\u0007�\u0003\u0001￥\n\u0002\u000b", objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                q(new int[]{121, 30, 7, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                int i229 = 5;
                                Object[] objArr18 = new Object[1];
                                q(new int[]{151, 10, 0, 5}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001", true, objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i230 = 0;
                                while (i230 < length) {
                                    Object obj = objArr19[i230];
                                    Object[] objArr20 = new Object[i4];
                                    q(new int[]{161, i229, 0, i4}, "\u0000\u0001\u0001\u0001\u0001", i4, objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        int deadChar = KeyEvent.getDeadChar(0, 0) + 37;
                                        int i231 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int id = (int) Thread.currentThread().getId();
                                        int i232 = (i231 * (-183)) + 42920;
                                        int i233 = ~i231;
                                        int i234 = i233 ^ 232;
                                        int i235 = (-1) - (((-1) - i233) | ((-1) - 232));
                                        int i236 = ~((i235 + i234) - (i235 & i234));
                                        int i237 = ~id;
                                        int i238 = ~((i237 + 232) - (232 & i237));
                                        int i239 = ((-1) - (((-1) - (i236 ^ i238)) & ((-1) - (i238 & i236)))) * 184;
                                        int i240 = (i232 & i239) + ((-1) - (((-1) - i239) & ((-1) - i232)));
                                        int i241 = ~(((-233) + i231) - ((-233) & i231));
                                        int i242 = (i240 - (~((((-1) - (((-1) - i241) | ((-1) - id))) | (id ^ i241)) * (-184)))) - i4;
                                        int i243 = ~i231;
                                        int i244 = (~((-1) - (((-1) - ((i243 + i237) - (i243 | i237))) & ((-1) - (i243 ^ i237))))) * 184;
                                        int i245 = ((-1) - (((-1) - i242) | ((-1) - i244))) + ((-1) - (((-1) - i244) & ((-1) - i242)));
                                        int i246 = -TextUtils.indexOf("", "");
                                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                        int i247 = (i246 * 530) + PhotoshopDirectory.TAG_EXIF_DATA_1;
                                        int i248 = (((i247 + 2650) - (2650 & i247)) << i4) - (i247 ^ 2650);
                                        int i249 = ~iMaxMemory;
                                        int i250 = i249 ^ i246;
                                        int i251 = (-1) - (((-1) - i249) | ((-1) - i246));
                                        int i252 = ~((i251 + i250) - (i251 & i250));
                                        int i253 = ~((-1) - (((-1) - (i246 ^ 5)) & ((-1) - (5 & i246))));
                                        int i254 = (i248 - (~((((i252 + i253) - (i252 | i253)) | (i252 ^ i253)) * 529))) - i4;
                                        int i255 = ~((-1) - (((-1) - i246) & ((-1) - iMaxMemory)));
                                        int i256 = ((i255 - 6) - (i255 & (-6))) * 529;
                                        int i257 = (i254 & i256) + (i256 | i254);
                                        Object[] objArr22 = new Object[i4];
                                        r(deadChar, i245, i257, true, "ￊ�\u0012�\u0006\u0015\u000e\u000b\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ\u0010\u000e\u0001\uffffￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000f", objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        int i258 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                        int i259 = (i258 & 10) + ((i258 + 10) - (i258 & 10));
                                        int i260 = 236 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i261 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                        int i262 = (i261 * (-1965)) + 9840;
                                        int i263 = ((i261 ^ (-11)) | ((-11) & i261)) * 983;
                                        int i264 = (i262 ^ i263) + ((i262 & i263) << i4);
                                        int i265 = ~i261;
                                        int i266 = ~elapsedCpuTime;
                                        int i267 = ~((-1) - (((-1) - (-11)) & ((-1) - i266)));
                                        int i268 = i265 ^ i267;
                                        int i269 = (i267 + i265) - (i267 | i265);
                                        int i270 = i264 + (((i268 + i269) - (i268 & i269)) * (-983));
                                        int i271 = ~i261;
                                        int i272 = ~((i271 & i266) | (i271 ^ i266));
                                        int i273 = i265 ^ 10;
                                        int i274 = (i265 + 10) - (i265 | 10);
                                        int i275 = ~((i273 + i274) - (i273 & i274));
                                        int i276 = ((-1) - (((-1) - ((i272 + i275) - (i272 | i275))) & ((-1) - (i272 ^ i275)))) * 983;
                                        int i277 = (i270 ^ i276) + ((i270 & i276) << i4);
                                        Object[] objArr23 = new Object[i4];
                                        r(i259, i260, i277, false, "\ufffe\r￢\u0007\f\r\ufffa\u0007￼\ufffe\u0000", objArr23);
                                        String str = (String) objArr23[0];
                                        Class<?>[] clsArr = new Class[i4];
                                        clsArr[0] = String.class;
                                        Object objInvoke3 = cls5.getMethod(str, clsArr).invoke(null, objArr21);
                                        try {
                                            int i278 = -(-(Process.myPid() >> 22));
                                            int i279 = (((-1) - (((-1) - i278) & ((-1) - 28))) << i4) - (i278 ^ 28);
                                            int threadPriority = Process.getThreadPriority(0);
                                            Object[] objArr24 = new Object[i4];
                                            r(i279, 232 - ((((threadPriority | 20) << i4) - (threadPriority ^ 20)) >> 6), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, "\u0001�\n\u0000\u000e\u000b\u0005\u0000ￊ\uffff\u000b\n\u0010\u0001\n\u0010ￊ\f\tￊ\uffef\u0005\u0003\n�\u0010\u0011\u000e", objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            Object[] objArr25 = new Object[i4];
                                            q(new int[]{166, 11, 63, 6}, null, i4, objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                int i280 = 36 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                                                int i281 = -Color.alpha(0);
                                                int i282 = ((i281 + 232) - (232 | i281)) + (i281 | 232);
                                                int i283 = -TextUtils.getCapsMode("", 0, 0);
                                                Object[] objArr27 = new Object[i4];
                                                r(i280, i282, (i283 ^ 5) + ((i283 & 5) << i4), true, "ￊ�\u0012�\u0006\u0015\u000e\u000b\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ\u0010\u000e\u0001\uffffￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000f", objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                Object[] objArr28 = new Object[i4];
                                                q(new int[]{177, 19, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", i4, objArr28);
                                                String str2 = (String) objArr28[0];
                                                Class<?>[] clsArr2 = new Class[i4];
                                                clsArr2[0] = InputStream.class;
                                                Object objInvoke4 = cls7.getMethod(str2, clsArr2).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                int i284 = 0;
                                                int i285 = 2;
                                                int i286 = i4;
                                                while (i284 < i285) {
                                                    Object obj2 = objArr3[i284];
                                                    try {
                                                        int i287 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                                        int i288 = (((i287 + 34) - (34 & i287)) << i286) - (i287 ^ 34);
                                                        int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                                        int i289 = f19299g * 1077997580;
                                                        f19299g = i289;
                                                        int i290 = (touchSlop * ExifDirectoryBase.TAG_PRIMARY_CHROMATICITIES) - 71959;
                                                        int i291 = ~((~touchSlop) | i289);
                                                        int i292 = i290 + (((-1) - (((-1) - ((-228) ^ i291)) & ((-1) - ((-1) - (((-1) - (-228)) | ((-1) - i291)))))) * (-318));
                                                        int i293 = ~(((-228) ^ i289) | ((-228) & i289));
                                                        int i294 = ~i289;
                                                        int i295 = (-1) - (((-1) - (i294 ^ touchSlop)) & ((-1) - ((i294 + touchSlop) - (i294 | touchSlop))));
                                                        int i296 = ~((i295 ^ 227) | ((i295 + 227) - (i295 | 227)));
                                                        int i297 = -(-(((-1) - (((-1) - (i296 & i293)) & ((-1) - (i293 ^ i296)))) * 318));
                                                        int i298 = (i292 ^ i297) + (((-1) - (((-1) - i297) | ((-1) - i292))) << 1);
                                                        int i299 = ~((-1) - (((-1) - (((-228) ^ i294) | ((-228) & i294))) & ((-1) - touchSlop)));
                                                        int i300 = (touchSlop + 227) - (touchSlop & 227);
                                                        int i301 = i300 ^ i289;
                                                        int i302 = i300 & i289;
                                                        int i303 = ~((i302 + i301) - (i302 & i301));
                                                        int i304 = -(-(((i299 & i303) | (i299 ^ i303)) * 318));
                                                        int i305 = (i298 ^ i304) + (((-1) - (((-1) - i304) | ((-1) - i298))) << 1);
                                                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                                        int i306 = ~i2;
                                                        int i307 = (-17) ^ i306;
                                                        int i308 = (i306 - 17) - (i306 | (-17));
                                                        int i309 = ((((bitsPerPixel * 980) - 15648) + ((~((i308 + i307) - (i308 & i307))) * 979)) - (~(((bitsPerPixel ^ i2) | ((bitsPerPixel + i2) - (bitsPerPixel | i2))) * (-979)))) - 1;
                                                        int i310 = (-17) ^ i2;
                                                        int i311 = ((-17) + i2) - ((-17) | i2);
                                                        int i312 = ~((i310 + i311) - (i310 & i311));
                                                        int i313 = ~i2;
                                                        int i314 = ~(((-1) - (((-1) - bitsPerPixel) | ((-1) - i313))) | (i313 ^ bitsPerPixel));
                                                        int i315 = i312 ^ i314;
                                                        int i316 = (i314 + i312) - (i314 | i312);
                                                        int i317 = ((i316 + i315) - (i316 & i315)) * 979;
                                                        int i318 = (i309 ^ i317) + ((i317 & i309) << 1);
                                                        Object[] objArr29 = new Object[1];
                                                        r(i288, i305, i318, false, "\ufff9ￖ\uffd1ￚ￤\u0006\u0013\u0015\n\u0007\n\u0004\u0002\u0015\u0006\u000b\u0002\u0017\u0002ￏ\u0014\u0006\u0004\u0016\u0013\n\u0015\u001aￏ\u0004\u0006\u0013\u0015ￏ", objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                                                        int i319 = (((tapTimeout + 23) - (23 & tapTimeout)) << 1) - (tapTimeout ^ 23);
                                                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                                        int i320 = f19302j * 201233756;
                                                        f19302j = i320;
                                                        int i321 = iNormalizeMetaState * 483;
                                                        int i322 = (i321 ^ 54934) + ((i321 & 54934) << 1);
                                                        int i323 = ~iNormalizeMetaState;
                                                        int i324 = ~((-1) - (((-1) - (i323 ^ (-228))) & ((-1) - ((i323 - 228) - ((-228) | i323)))));
                                                        int i325 = ~iNormalizeMetaState;
                                                        int i326 = ~i320;
                                                        int i327 = ~((i325 ^ i326) | ((i325 + i326) - (i325 | i326)));
                                                        int i328 = -(-(((i324 + i327) - (i324 & i327)) * (-241)));
                                                        int i329 = (((((-1) - (((-1) - i322) & ((-1) - i328))) << 1) - (i328 ^ i322)) - (~((227 | iNormalizeMetaState) * (-482)))) - 1;
                                                        int i330 = ~((-1) - (((-1) - ((iNormalizeMetaState - 228) - (iNormalizeMetaState | (-228)))) & ((-1) - ((-228) ^ iNormalizeMetaState))));
                                                        int i331 = ((i326 + i323) - (i326 | i323)) | (i323 ^ i326);
                                                        int i332 = ~((i331 & 227) | (i331 ^ 227));
                                                        int i333 = (i329 - (~((((-1) - (((-1) - i332) | ((-1) - i330))) | (i330 ^ i332)) * 241))) - 1;
                                                        int i334 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i335 = f19301i * (-700225299);
                                                        f19301i = i335;
                                                        int i336 = ~i334;
                                                        int i337 = ~i335;
                                                        int i338 = ~(((-8) ^ i337) | (((-8) + i337) - ((-8) | i337)));
                                                        int i339 = i336 ^ i338;
                                                        int i340 = (-1) - (((-1) - i338) | ((-1) - i336));
                                                        int i341 = (i339 + i340) - (i339 & i340);
                                                        int i342 = ~((i335 ^ 7) | ((i335 + 7) - (7 | i335)));
                                                        int i343 = (i334 * (-563)) + 3955 + (((i342 + i341) - (i342 & i341)) * (-564));
                                                        int i344 = ~i334;
                                                        int i345 = ((i344 + 7) - (i344 | 7)) | (i344 ^ 7);
                                                        int i346 = (i343 - (~(-(-((~((-1) - (((-1) - (i345 & i335)) & ((-1) - (i345 ^ i335))))) * 1128))))) - 1;
                                                        int i347 = ~i335;
                                                        int i348 = ~(((-1) - (((-1) - i347) | ((-1) - i336))) | (i336 ^ i347));
                                                        int i349 = ~((-1) - (((-1) - (i334 & 7)) & ((-1) - (i334 ^ 7))));
                                                        int i350 = i348 ^ i349;
                                                        int i351 = i348 & i349;
                                                        Object[] objArr30 = new Object[1];
                                                        r(i319, i333, (i346 - (~(-(-(((i351 + i350) - (i351 & i350)) * 564))))) - 1, true, "\u000b\u0003\u0016\ufff4\u0015\u0006\b\r\u0002\u0011\n\u0004\u000f\n\u0013\ufff1\uffd1\uffd1ￖ\ufff9\u0015\u0004\u0006", objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int iMyPid2 = Process.myPid();
                                                            int i352 = ~iMyPid2;
                                                            int i353 = 656643305 + (((-1) - (((-1) - (~((509366936 + i352) - (509366936 & i352)))) & ((-1) - 168781085))) * (-328)) + ((iMyPid2 | 168781085) * 164);
                                                            int i354 = (-1) - (((-1) - (~(iMyPid2 | (-509366937)))) & ((-1) - 168575000));
                                                            int i355 = ~(i352 | 509573021);
                                                            int i356 = i353 + (((i354 + i355) - (i354 & i355)) * 164);
                                                            int i357 = (i356 ^ 16) + (((-1) - (((-1) - i356) | ((-1) - 16))) << 1) + i3;
                                                            int i358 = i357 << 13;
                                                            int i359 = ~(i357 & i358);
                                                            int i360 = (i357 + i358) - (i357 & i358);
                                                            int i361 = (i360 + i359) - (i360 | i359);
                                                            int i362 = i361 >>> 17;
                                                            int i363 = ((i361 + i362) - (i361 & i362)) & (~((-1) - (((-1) - i361) | ((-1) - i362))));
                                                            int i364 = i363 << 5;
                                                            ((int[]) objArr31[0])[0] = (i363 | i364) & (~(i363 & i364));
                                                            return objArr31;
                                                        }
                                                        int i365 = i284 - 35;
                                                        i284 = ((i365 | 36) << 1) - (i365 ^ 36);
                                                        i285 = 2;
                                                        i286 = 1;
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i230 = (i230 | 1) + (i230 & 1);
                                                i229 = 5;
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
        Object[] objArr32 = {new int[]{((i + i) - (i | i)) | i}, new int[]{i2}, null, new int[]{i2}};
        int i366 = f19307o * 971560854;
        f19307o = i366;
        int i367 = ((((~((-1) - (((-1) - (-619265851)) & ((-1) - i366)))) | 661342017) * 262) - 174304435) + (((~((-1) - (((-1) - (~i366)) & ((-1) - (-619265851))))) | 661342017) * 262);
        int i368 = i367 * (-949);
        int i369 = ~i367;
        int i370 = ~i2;
        int i371 = (~(i369 | i370)) * 1900;
        int i372 = (((i368 + i371) - (i368 & i371)) << 1) - (i368 ^ i371);
        int i373 = ~i370;
        int i374 = ~((-1) - (((-1) - (i367 ^ i2)) & ((-1) - ((-1) - (((-1) - i367) | ((-1) - i2))))));
        int i375 = i373 ^ i374;
        int i376 = i373 & i374;
        int i377 = ((i376 + i375) - (i376 & i375)) * (-950);
        int i378 = ((i372 | i377) << 1) - (i377 ^ i372);
        int i379 = -(-(((~i2) | (~((i370 ^ i367) | ((-1) - (((-1) - i367) | ((-1) - i370)))))) * 950));
        int i380 = (((-1) - (((-1) - i378) & ((-1) - i379))) << 1) - (i379 ^ i378);
        int i381 = f19300h * 547267842;
        f19300h = i381;
        int i382 = (i380 * 69) + (i3 * (-67));
        int i383 = ~i380;
        int i384 = ~i3;
        int i385 = (-1) - (((-1) - (i383 ^ i384)) & ((-1) - ((-1) - (((-1) - i383) | ((-1) - i384)))));
        int i386 = ~i381;
        int i387 = (-1) - (((-1) - (~(((-1) - (((-1) - i380) | ((-1) - i3))) | (i380 ^ i3)))) & ((-1) - (~((-1) - (((-1) - ((i385 + i386) - (i385 | i386))) & ((-1) - (i385 ^ i386)))))));
        int i388 = ~((i381 & i3) | (i3 ^ i381));
        int i389 = i387 ^ i388;
        int i390 = (i388 + i387) - (i388 | i387);
        int i391 = -(-(((i390 + i389) - (i390 & i389)) * (-68)));
        int i392 = ((-1) - (((-1) - i382) | ((-1) - i391))) + ((-1) - (((-1) - i391) & ((-1) - i382)));
        int i393 = (-1) - (((-1) - (i383 ^ i386)) & ((-1) - ((-1) - (((-1) - i383) | ((-1) - i386)))));
        int i394 = -(-((~(((-1) - (((-1) - i393) | ((-1) - i3))) | (i393 ^ i3))) * (-68)));
        int i395 = (i392 & i394) + ((i394 + i392) - (i394 & i392));
        int i396 = -(-(((~((-1) - (((-1) - i384) & ((-1) - i386)))) | i383) * 68));
        int i397 = (i395 ^ i396) + ((i396 & i395) << 1);
        int i398 = (i397 << 13) ^ i397;
        int i399 = i398 ^ (i398 >>> 17);
        int i400 = i399 << 5;
        int i401 = (~i400) & i399;
        int i402 = ~i399;
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{84, 109, 90, 4};
        $$b = 200;
    }

    static void init$1() {
        $$d = new byte[]{85, MessagePack.Code.BIN32, -28, 50, -65, 64, MessagePack.Code.NIL, 51, MessagePack.Code.TRUE, 17};
        $$e = Mp4VideoDirectory.TAG_OPCOLOR;
    }

    static void init$2() {
        $$c = new byte[]{120, -15, 89, -97};
        $$f = 115;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r2 = r8 + 4
            int r0 = r6 * 5
            int r0 = 106 - r0
            byte[] r8 = fr.antelop.sdk.digitalcard.VirtualCardNumberGenerator.$$a
            int r1 = r7 * 4
            int r7 = 1 - r1
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L2c
            r4 = r5
            r3 = r7
        L13:
            int r0 = -r0
            int r0 = r0 + r3
            r3 = r4
        L16:
            int r4 = r3 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            int r2 = r2 + 1
            if (r4 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r9[r5] = r0
            return
        L27:
            r1 = r8[r2]
            r3 = r0
            r0 = r1
            goto L13
        L2c:
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumberGenerator.p(byte, int, byte, java.lang.Object[]):void");
    }

    private static void q(int[] iArr, String str, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr;
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = f19298f;
        long j2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = $10 + 9;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 % 5;
            }
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                    Object objA = d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = d.a(248 - TextUtils.indexOf((CharSequence) "", '0'), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 1376582792, false, $$g(b2, b2, (byte) $$c.length), new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    j2 = 0;
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
        char[] cArr4 = new char[i6];
        char c2 = 0;
        System.arraycopy(cArr2, i5, cArr4, 0, i6);
        if (bArr != null) {
            int i12 = $10 + 73;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr = new char[i6];
                mVar.f19943d = 0;
            } else {
                cArr = new char[i6];
                mVar.f19943d = 0;
                c2 = 0;
            }
            while (mVar.f19943d < i6) {
                int i13 = $10 + 37;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                if (bArr[mVar.f19943d] == 1) {
                    int i15 = $10 + 93;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = d.a(120026474);
                    if (objA2 == null) {
                        objA2 = d.a(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, (char) View.MeasureSpec.getMode(0), 10 - Color.argb(0, 0, 0, 0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i17] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i3 = 2;
                } else {
                    int i18 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = d.a(1632715197);
                    if (objA3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA3 = d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 836, (char) (TextUtils.indexOf("", "", 0, 0) + 27279), 11 - (KeyEvent.getMaxKeyCode() >> 16), -1210801192, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i18] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    int i19 = $11 + 39;
                    $10 = i19 % 128;
                    i3 = 2;
                    if (i19 % 2 != 0) {
                        int i20 = 3 % 3;
                    }
                }
                c2 = cArr[mVar.f19943d];
                Object[] objArr5 = new Object[i3];
                objArr5[1] = mVar;
                objArr5[0] = mVar;
                Object objA4 = d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = d.a(MotionEvent.axisFromString("") + 22, (char) (35716 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i8 > 0) {
            int i21 = $11 + 57;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            char[] cArr5 = new char[i6];
            i2 = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i6);
            int i23 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr4, i23, i8);
            System.arraycopy(cArr5, i8, cArr4, 0, i23);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i6];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr4[(i6 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr4 = cArr6;
        }
        if (i7 > 0) {
            int i24 = 0;
            while (true) {
                mVar.f19943d = i24;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i25 = $11 + 77;
                $10 = i25 % 128;
                int i26 = i25 % 2;
                cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                i24 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static void r(int i2, int i3, int i4, boolean z2, String str, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 103;
        int i7 = i6 % 128;
        $10 = i7;
        if (i6 % 2 != 0) {
            int i8 = 54 / 0;
            if (str2 != null) {
                int i9 = i7 + 99;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
        } else {
            if (str2 != null) {
                int i92 = i7 + 99;
                $11 = i92 % 128;
                int i102 = i92 % 2;
                charArray = str2.toCharArray();
            }
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i11 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i11]), Integer.valueOf(f19305m)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 270, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 12, -2071844881, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(View.getDefaultSize(0, 0) + 522, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, 627984172, false, $$g(b4, b5, (byte) ((b5 + 7) - (7 & b5))), new Class[]{Object.class, Object.class});
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
            int i12 = $11 + 33;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i14 = $11 + 39;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = d.a(522 - KeyEvent.keyCodeFromString(""), (char) TextUtils.getTrimmedLength(""), 12 - (KeyEvent.getMaxKeyCode() >> 16), 627984172, false, $$g(b6, b7, (byte) (7 | b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            int i16 = $11 + 89;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void s(byte b2, int i2, byte b3, Object[] objArr) {
        int i3 = i2 * 6;
        int i4 = 10 - (b3 * 6);
        byte[] bArr = $$d;
        int i5 = (b2 * 10) + 101;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i5 += i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b4 = bArr[i4];
                i4++;
                i5 += b4;
            }
        }
    }

    public final void create(Context context, VirtualCardNumberOption virtualCardNumberOption, boolean z2, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        this.innerSecureDigitalCardVcnGeneratorProcess.e(context, virtualCardNumberOption, z2, new b(), new o.x.d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardVcnGeneratorProcess));
        int i3 = f19304l + 111;
        f19306n = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void create(Context context, VirtualCardNumberOption virtualCardNumberOption, boolean z2, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        int i2 = 2 % 2;
        this.innerSecureDigitalCardVcnGeneratorProcess.e(context, virtualCardNumberOption, z2, new b(), new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardVcnGeneratorProcess));
        int i3 = f19304l + 41;
        f19306n = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        int i2 = 2 % 2;
        int i3 = f19304l + 67;
        f19306n = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.m.b(this.innerSecureDigitalCardVcnGeneratorProcess.d());
            throw null;
        }
        List<CustomerAuthenticationMethodType> listB = o.ea.m.b(this.innerSecureDigitalCardVcnGeneratorProcess.d());
        int i4 = f19304l + 27;
        f19306n = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return listB;
    }

    public final CancellationSignal getCancellationSignal() {
        int i2 = 2 % 2;
        int i3 = f19306n + 89;
        f19304l = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.innerSecureDigitalCardVcnGeneratorProcess.m();
            obj.hashCode();
            throw null;
        }
        CancellationSignal cancellationSignalM = this.innerSecureDigitalCardVcnGeneratorProcess.m();
        int i4 = f19306n + 101;
        f19304l = i4 % 128;
        if (i4 % 2 != 0) {
            return cancellationSignalM;
        }
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        String strG;
        int i2 = 2 % 2;
        int i3 = f19304l + 67;
        f19306n = i3 % 128;
        if (i3 % 2 != 0) {
            strG = this.innerSecureDigitalCardVcnGeneratorProcess.g();
            int i4 = 40 / 0;
        } else {
            strG = this.innerSecureDigitalCardVcnGeneratorProcess.g();
        }
        int i5 = f19306n + 101;
        f19304l = i5 % 128;
        int i6 = i5 % 2;
        return strG;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f19306n;
        int i4 = i3 + 115;
        f19304l = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 123;
        f19304l = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        int i2 = 2 % 2;
        int i3 = f19306n + 79;
        f19304l = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerSecureDigitalCardVcnGeneratorProcess};
        int i5 = i.f26925h * 601961010;
        i.f26925h = i5;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt(1592817291);
        int i6 = i.f26927j * 826423998;
        i.f26927j = i6;
        if (((Boolean) i.c(-571425008, i5, 571425009, iFreeMemory, i6, iNextInt, objArr)).booleanValue()) {
            return false;
        }
        int i7 = f19306n;
        int i8 = i7 + 123;
        f19304l = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 35;
        f19304l = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public final VirtualCardNumberGenerator setActivityCallback(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) {
        int i2 = 2 % 2;
        int i3 = f19306n;
        int i4 = i3 + 83;
        f19304l = i4 % 128;
        int i5 = i4 % 2;
        this.activityCallback = customerAuthenticatedProcessActivityCallback;
        int i6 = i3 + 91;
        f19304l = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VirtualCardNumberGenerator setCardBackground(Drawable drawable) {
        int i2 = 2 % 2;
        int i3 = f19304l;
        int i4 = i3 + 75;
        f19306n = i4 % 128;
        int i5 = i4 % 2;
        this.cardDrawable = drawable;
        int i6 = i3 + 79;
        f19306n = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.digitalcard.VirtualCardNumberGenerator setCardForegroundColor(java.lang.Integer r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumberGenerator.setCardForegroundColor(java.lang.Integer):fr.antelop.sdk.digitalcard.VirtualCardNumberGenerator");
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19306n + 45;
        f19304l = i3 % 128;
        int i4 = i3 % 2;
        this.innerSecureDigitalCardVcnGeneratorProcess.e(context, customerAuthenticationCredentials);
        int i5 = f19304l + 15;
        f19306n = i5 % 128;
        int i6 = i5 % 2;
    }
}
