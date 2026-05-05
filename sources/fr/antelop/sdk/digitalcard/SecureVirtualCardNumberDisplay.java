package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import cz.msebera.android.httpclient.HttpStatus;
import fr.antelop.sdk.CancellationSignal;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.n;
import o.d.d;
import o.eb.b;
import o.x.i;
import o.x.j;
import o.y.m;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureVirtualCardNumberDisplay implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f19241a = 0;

    /* JADX INFO: renamed from: b */
    public static int f19242b = 0;

    /* JADX INFO: renamed from: c */
    public static int f19243c = 0;

    /* JADX INFO: renamed from: d */
    public static int f19244d = 0;

    /* JADX INFO: renamed from: e */
    public static int f19245e = 0;

    /* JADX INFO: renamed from: f */
    public static int f19246f = 0;

    /* JADX INFO: renamed from: g */
    private static int f19247g = 0;

    /* JADX INFO: renamed from: h */
    private static int f19248h = 0;

    /* JADX INFO: renamed from: i */
    private static int f19249i = 0;

    /* JADX INFO: renamed from: j */
    private static char[] f19250j = null;
    private CustomerAuthenticatedProcessActivityCallback activityCallback;
    private Drawable cardDrawable = null;
    private Integer cardForegroundColor = null;
    private final m innerSecureDigitalCardVcnDisplayProcess;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, short r8, byte r9) {
        /*
            int r2 = r7 * 4
            int r1 = 1 - r2
            int r7 = r9 + 113
            byte[] r6 = fr.antelop.sdk.digitalcard.SecureVirtualCardNumberDisplay.$$a
            int r0 = r8 * 2
            int r5 = r0 + 4
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L29
            r0 = r2
            r1 = r3
        L15:
            int r0 = -r0
            int r7 = r7 + r0
            int r5 = r5 + 1
        L19:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r6[r5]
            goto L15
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureVirtualCardNumberDisplay.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f19246f = 563505672;
        f19245e = -1794432923;
        f19244d = -1228100222;
        f19242b = 636410866;
        f19243c = -1960261993;
        f19241a = 1898690398;
        f19247g = 0;
        f19249i = 1;
        f19250j = new char[]{56518, 56328, 56334, 56334, 56335, 56566, 56563, 56335, 56327, 56335, 56342, 56336, 56337, 56345, 56566, 56554, 56334, 56343, 56337, 56558, 56566, 56569, 56533, 56531, 56530, 56550, 56553, 56533, 56531, 56547, 56324, 56336, 56334, 56331, 56329, 56335, 56331, 56329, 56516, 56330, 56322, CharCompanionObject.MIN_LOW_SURROGATE, 56325, 56322, 56557, 56524, 56549, 56325, 56573, CharCompanionObject.MIN_LOW_SURROGATE, 56325, 56322, 56573, 56540, 56541, 56570, CharCompanionObject.MIN_LOW_SURROGATE, 56324, 56575, 56573, 56571, 56499, 56550, 56556, 56546, 56536, 56546, 56551, 56550, 56548, 56550, 56537, 56535, 56551, 56553, 56505, 56555, 56550, 56548, 56551, 56551, 56535, 56537, 56550, 56548, 56550, 56551, 56546, 56536, 56511, 56525, 56558, 56527, 56529, 56561, 56553, 56556, 56561, 56558, 56553, 56520, 56521, 56550, 56556, 56560, 56555, 56553, 56551, 56556, 56403, 56397, 56399, 56396, 56399, 56409, 56408, 56400, 56401, 56501, 56549, 56555, 56555, 56519, 56528, 56556, 56548, 56556, 56563, 56557, 56558, 56566, 56531, 56520, 56548, 56555, 56563, 56529, 56504, 56532, 56555, 56563, 56558, 56551, 56551, 56550, 56546, 56554, 56556, 56533, 56531, 56546, 56555, 56561, 56560, 56565, 56498, 56548, 56552, 56551, 56554, 56563, 56560, 56539, 56542, 56556, 56550, 56503, 56558, 56553, 56520, 56521, 56550, 56556, 56560, 56555, 56553, 56551, 56547, 56555, 56563, 56564, 56554, 56551, 56554, 56552, 56542, 56512, 56525, 56558, 56527, 56529, 56561, 56553, 56556, 56573, 56439, 56429, 56404, 56410, 56435, 56426, 56430, 56439, 56434, 56409, 56499, 56550, 56553, 56553, 56555, 56553, 56554, 56556, 56532, 56532, 56555, 56563, 56558, 56551, 56551, 56550, 56546, 56554, 56556, 56501, 56549, 56555, 56555, 56519, 56528, 56556, 56548, 56556, 56563, 56557, 56558, 56566, 56531, 56520, 56548, 56555, 56563, 56529, 56515, 56518, 56498, 56500, 56510, 56532, 56555, 56563, 56558, 56551, 56551, 56550, 56546, 56554, 56556};
        f19248h = -1270219380;
    }

    public SecureVirtualCardNumberDisplay(m mVar) {
        this.innerSecureDigitalCardVcnDisplayProcess = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v79 */
    public static Object[] a(Context context, int i2, int i3) {
        int i4 = 1;
        if (context == null) {
            Object[] objArr = {new int[1], new int[]{i2}, null, new int[]{i2}};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i5 = 1354864828 + (((~((-1) - (((-1) - iMaxMemory) & ((-1) - 859424141)))) | 147195986) * 305) + (((-1) - (((-1) - (~((-1) - (((-1) - (~iMaxMemory)) & ((-1) - 859424141))))) & ((-1) - 181276119))) * 305);
            int i6 = (((i3 + i5) - (i3 & i5)) << 1) - (i3 ^ i5);
            int i7 = i6 ^ (i6 << 13);
            int i8 = i7 ^ (i7 >>> 17);
            int i9 = i8 << 5;
            ((int[]) objArr[0])[0] = (-1) - (((-1) - ((i8 + i9) - (i8 & i9))) | ((-1) - (~((-1) - (((-1) - i8) | ((-1) - i9))))));
            return objArr;
        }
        try {
            Object[] objArr2 = new Object[1];
            k(new int[]{0, 38, 35, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false, objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName((String) objArr2[0]), 2);
            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            int i10 = f19241a * (-1685436510);
            f19241a = i10;
            int i11 = (minimumFlingVelocity * (-405)) + 12617;
            int i12 = ~((-1) - (((-1) - (-32)) & ((-1) - i10)));
            int i13 = ~i10;
            int i14 = (-1) - (((-1) - (i13 ^ minimumFlingVelocity)) & ((-1) - ((i13 + minimumFlingVelocity) - (i13 | minimumFlingVelocity))));
            int i15 = i14 ^ 31;
            int i16 = (i14 + 31) - (i14 | 31);
            int i17 = ~((i15 + i16) - (i15 & i16));
            int i18 = -(-(((i12 ^ i17) | ((i12 + i17) - (i12 | i17))) * (-406)));
            int i19 = (((i11 + i18) - (i11 & i18)) << 1) - (i11 ^ i18);
            int i20 = (-32) | i13;
            int i21 = i20 ^ minimumFlingVelocity;
            int i22 = i20 & minimumFlingVelocity;
            int i23 = (~((i22 + i21) - (i22 & i21))) * (-406);
            int i24 = ((i19 + i23) - (i19 | i23)) + ((-1) - (((-1) - i23) & ((-1) - i19)));
            int i25 = ~minimumFlingVelocity;
            int i26 = ~(((-1) - (((-1) - i25) | ((-1) - i10))) | (i25 ^ i10));
            int i27 = ~i10;
            int i28 = i27 ^ 31;
            int i29 = i27 & 31;
            int i30 = -(-((i26 | (~((i29 + i28) - (i29 & i28)))) * HttpStatus.SC_NOT_ACCEPTABLE));
            int i31 = (((i24 + i30) - (i24 & i30)) << 1) - (i30 ^ i24);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
            int i32 = f19243c * 2112841455;
            f19243c = i32;
            int i33 = iCombineMeasuredStates * 85;
            int i34 = (i33 ^ 20060) + (((-1) - (((-1) - i33) | ((-1) - 20060))) << 1);
            int i35 = ~iCombineMeasuredStates;
            int i36 = ~(((-1) - (((-1) - i35) | ((-1) - (-237)))) | (i35 ^ (-237)));
            int i37 = ~iCombineMeasuredStates;
            int i38 = ~i32;
            int i39 = ~((i37 ^ i38) | (i37 & i38));
            int i40 = i36 ^ i39;
            int i41 = i36 & i39;
            int i42 = (i40 + i41) - (i40 & i41);
            int i43 = ~(((-237) ^ i38) | (((-237) + i38) - ((-237) | i38)));
            int i44 = i42 ^ i43;
            int i45 = i42 & i43;
            int i46 = (i44 + i45) - (i44 & i45);
            int i47 = (iCombineMeasuredStates & 236) | (iCombineMeasuredStates ^ 236);
            int i48 = i47 ^ i32;
            int i49 = (-1) - (((-1) - i47) | ((-1) - i32));
            int i50 = ~((i48 + i49) - (i48 & i49));
            int i51 = ((-1) - (((-1) - (i46 ^ i50)) & ((-1) - (i46 & i50)))) * (-84);
            int i52 = ((i34 + i51) - (i34 | i51)) + ((i51 + i34) - (i51 & i34));
            int i53 = ~(((-237) ^ i32) | ((-237) & i32));
            int i54 = (iCombineMeasuredStates & i53) | (iCombineMeasuredStates ^ i53);
            int i55 = ~i32;
            int i56 = ~((-1) - (((-1) - ((i55 + 236) - (i55 | 236))) & ((-1) - (i55 ^ 236))));
            int i57 = i54 ^ i56;
            int i58 = (-1) - (((-1) - i54) | ((-1) - i56));
            int i59 = -(-(((i58 + i57) - (i58 & i57)) * (-84)));
            int i60 = (i52 ^ i59) + (((-1) - (((-1) - i59) | ((-1) - i52))) << 1);
            int i61 = ~((-1) - (((-1) - i38) & ((-1) - 236)));
            int i62 = ~i47;
            int i63 = i61 ^ i62;
            int i64 = (i61 + i62) - (i61 | i62);
            int i65 = (i60 - (~(((i64 + i63) - (i64 & i63)) * 84))) - 1;
            int i66 = -(-MotionEvent.axisFromString(""));
            Object[] objArr4 = new Object[1];
            l(i31, i65, ((i66 + 29) - (29 | i66)) + (i66 | 29), false, "￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012ￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮￨\u0000\ufffe￮\ufff9￨", objArr4);
            try {
                Object[] objArr5 = {(String) objArr4[0]};
                Object[] objArr6 = new Object[1];
                k(new int[]{0, 38, 35, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false, objArr6);
                objArr3[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                int i67 = -(-(Process.myPid() >> 22));
                int i68 = (i67 & 31) + ((-1) - (((-1) - i67) & ((-1) - 31)));
                int i69 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iActiveCount = Thread.activeCount();
                int i70 = (-237) ^ iActiveCount;
                int i71 = (-237) & iActiveCount;
                int i72 = ~((i70 + i71) - (i70 & i71));
                int i73 = ~iActiveCount;
                int i74 = (-1) - (((-1) - i72) & ((-1) - (~(i73 | i69))));
                int i75 = i73 ^ 236;
                int i76 = (-1) - (((-1) - i73) | ((-1) - 236));
                int i77 = ~((i76 + i75) - (i76 & i75));
                int i78 = (i69 * (-515)) + 122012 + (((-1) - (((-1) - (i74 & i77)) & ((-1) - (i74 ^ i77)))) * (-516));
                int i79 = ~i69;
                int i80 = (-1) - (((-1) - (i79 ^ (-237))) & ((-1) - ((i79 - 237) - ((-237) | i79))));
                int i81 = ~((-1) - (((-1) - ((-1) - (((-1) - i80) | ((-1) - iActiveCount)))) & ((-1) - (i80 ^ iActiveCount))));
                int i82 = ~i69;
                int i83 = ~iActiveCount;
                int i84 = i82 ^ i83;
                int i85 = i82 & i83;
                int i86 = (i85 + i84) - (i85 & i84);
                int i87 = i86 ^ 236;
                int i88 = i86 & 236;
                int i89 = ~((i88 + i87) - (i88 & i87));
                int i90 = i78 + (((-1) - (((-1) - ((i89 + i81) - (i89 | i81))) & ((-1) - (i81 ^ i89)))) * 516);
                int i91 = ~((-1) - (((-1) - (i79 ^ 236)) & ((-1) - ((-1) - (((-1) - i79) | ((-1) - 236))))));
                int i92 = ~((-1) - (((-1) - (i83 & 236)) & ((-1) - (i83 ^ 236))));
                int i93 = i91 ^ i92;
                int i94 = (-1) - (((-1) - i91) | ((-1) - i92));
                Object[] objArr7 = new Object[1];
                l(i68, i90 + (((i94 + i93) - (i94 & i93)) * 516), 5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, "\ufffe\u0000￨￮\u0012 \r\u0010\uffefￋ\u000f\u0014\u001a\u001d\u000f\u0019￬￨\ufff9￮ￗ\u000f\u0014\u001a\u001d\u000f\u0019￬￨\ufffaￗ", objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    Object[] objArr9 = new Object[1];
                    k(new int[]{0, 38, 35, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false, objArr9);
                    objArr3[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        k(new int[]{38, 23, 20, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        int i95 = -Color.alpha(0);
                        int i96 = (i95 ^ 17) + (((-1) - (((-1) - i95) | ((-1) - 17))) << 1);
                        int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                        int priority = Thread.currentThread().getPriority();
                        int i97 = touchSlop * (-919);
                        int i98 = (i97 ^ (-230669)) + (((i97 - 230669) - (i97 | (-230669))) << 1);
                        int i99 = ~touchSlop;
                        int i100 = (-1) - (((-1) - i99) & ((-1) - (-252)));
                        int i101 = i100 ^ priority;
                        int i102 = i100 & priority;
                        int i103 = ~((i102 + i101) - (i102 & i101));
                        int i104 = ~priority;
                        int i105 = ~(((-1) - (((-1) - (-252)) & ((-1) - i104))) | touchSlop);
                        int i106 = i103 ^ i105;
                        int i107 = (-1) - (((-1) - i105) | ((-1) - i103));
                        int i108 = ((i106 + i107) - (i106 & i107)) * 920;
                        int i109 = (i98 ^ i108) + ((i108 & i98) << 1);
                        int i110 = ~touchSlop;
                        int i111 = ~(((-1) - (((-1) - i110) | ((-1) - (-252)))) | (i110 ^ (-252)));
                        int i112 = ~((i110 ^ i104) | ((i104 + i110) - (i104 | i110)));
                        int i113 = (((i111 + i112) - (i111 | i112)) | (i111 ^ i112)) * 920;
                        int i114 = ((i109 + i113) - (i109 | i113)) + (i113 | i109);
                        int i115 = (-1) - (((-1) - (i110 & (-252))) & ((-1) - (i110 ^ (-252))));
                        int i116 = ~priority;
                        int i117 = i115 ^ i116;
                        int i118 = (i115 + i116) - (i115 | i116);
                        int i119 = ~((i118 + i117) - (i118 & i117));
                        int i120 = (i99 & 251) | (i99 ^ 251);
                        int i121 = i120 ^ priority;
                        int i122 = (-1) - (((-1) - i120) | ((-1) - priority));
                        int i123 = ~((i122 + i121) - (i122 & i121));
                        int i124 = (i119 & i123) | (i119 ^ i123);
                        int i125 = (touchSlop & (-252)) | ((-252) ^ touchSlop);
                        int i126 = i125 ^ priority;
                        int i127 = i125 & priority;
                        int i128 = ~((i127 + i126) - (i127 & i126));
                        int i129 = (((i124 + i128) - (i124 | i128)) | (i124 ^ i128)) * 920;
                        int i130 = (i114 ^ i129) + (((-1) - (((-1) - i129) | ((-1) - i114))) << 1);
                        int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                        int i131 = f19242b * (-469429370);
                        f19242b = i131;
                        int i132 = maxKeyCode * 980;
                        int i133 = (i132 ^ (-12714)) + (((i132 - 12714) - (i132 | (-12714))) << 1);
                        int i134 = ~i131;
                        int i135 = -(-((~((-1) - (((-1) - ((-1) - (((-1) - i134) | ((-1) - (-14))))) & ((-1) - ((-14) ^ i134))))) * 979));
                        int i136 = (((-1) - (((-1) - i133) & ((-1) - i135))) << 1) - (i135 ^ i133);
                        int i137 = -(-(((-1) - (((-1) - (maxKeyCode ^ i131)) & ((-1) - ((-1) - (((-1) - maxKeyCode) | ((-1) - i131)))))) * (-979)));
                        int i138 = ((i136 + i137) - (i136 | i137)) + ((i137 + i136) - (i137 & i136));
                        int i139 = ~((-1) - (((-1) - ((-14) ^ i131)) & ((-1) - ((-14) & i131))));
                        int i140 = ~i131;
                        int i141 = ((~(((-1) - (((-1) - maxKeyCode) | ((-1) - i140))) | (i140 ^ maxKeyCode))) | i139) * 979;
                        Object[] objArr11 = new Object[1];
                        l(i96, i130, (((-1) - (((-1) - i138) & ((-1) - i141))) << 1) - (i141 ^ i138), true, "\n�￩\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003\u000e\u0001\u0003�", objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            k(new int[]{38, 23, 20, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            k(new int[]{61, 14, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                k(new int[]{75, 33, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                int i142 = -Color.red(0);
                                int i143 = ((i142 + 14) - (14 | i142)) + ((-1) - (((-1) - i142) & ((-1) - 14)));
                                int iAlpha = Color.alpha(0);
                                int i144 = (iAlpha ^ 251) + ((iAlpha & 251) << 1);
                                int capsMode = TextUtils.getCapsMode("", 0, 0);
                                int iMyTid = Process.myTid();
                                int i145 = capsMode * (-1939);
                                int i146 = (((i145 + 4855) - (4855 & i145)) << 1) - (i145 ^ 4855);
                                int i147 = ~((-6) | capsMode);
                                int i148 = ~iMyTid;
                                int i149 = ~((-1) - (((-1) - ((i148 + 5) - (i148 | 5))) & ((-1) - (i148 ^ 5))));
                                int i150 = -(-((((-1) - (((-1) - i147) | ((-1) - i149))) | (i147 ^ i149)) * (-970)));
                                int i151 = ((((-1) - (((-1) - i146) | ((-1) - i150))) + ((-1) - (((-1) - i150) & ((-1) - i146)))) - (~(-(-((~((~capsMode) | 5)) * 1940))))) - 1;
                                int i152 = ~capsMode;
                                int i153 = ~((-1) - (((-1) - (i152 & (-6))) & ((-1) - (i152 ^ (-6)))));
                                int i154 = ~iMyTid;
                                int i155 = i154 ^ 5;
                                int i156 = i154 & 5;
                                int i157 = ~((i156 + i155) - (i156 & i155));
                                Object[] objArr16 = new Object[1];
                                l(i143, i144, (i151 - (~(-(-(((i157 + i153) - (i157 & i153)) * 970))))) - 1, false, "\u0001￥\n\u0002\u000b\u0003\u0001\u0010￬�\uffff\u0007�\u0003", objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 31;
                                int gidForName = Process.getGidForName("");
                                int i158 = f19244d * 795024956;
                                f19244d = i158;
                                int i159 = (gidForName * 522) - 129480;
                                int i160 = ~i158;
                                int i161 = i160 ^ 249;
                                int i162 = i160 & 249;
                                int i163 = ~((i161 + i162) - (i161 & i162));
                                int i164 = ((i163 & gidForName) | (gidForName ^ i163)) * (-1042);
                                int i165 = (i159 ^ i164) + (((i159 + i164) - (i159 | i164)) << 1);
                                int i166 = ((-1) - (((-1) - (i158 ^ 249)) & ((-1) - ((-1) - (((-1) - i158) | ((-1) - 249)))))) * 521;
                                int i167 = ((i165 + i166) - (i165 | i166)) + ((i166 + i165) - (i166 & i165));
                                int i168 = ~gidForName;
                                int i169 = ~(((i168 - 250) - (i168 | (-250))) | (i168 ^ (-250)));
                                int i170 = ~gidForName;
                                int i171 = i170 ^ i158;
                                int i172 = (-1) - (((-1) - i158) | ((-1) - i170));
                                int i173 = ~((i172 + i171) - (i172 & i171));
                                int i174 = ((i173 + i169) - (i173 | i169)) | (i169 ^ i173);
                                int i175 = ((gidForName + i160) - (gidForName | i160)) | (i160 ^ gidForName);
                                int i176 = i175 ^ 249;
                                int i177 = i175 & 249;
                                int i178 = ~((i177 + i176) - (i177 & i176));
                                int i179 = i167 + (((i178 & i174) | (i174 ^ i178)) * 521);
                                int i180 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i181 = i180 * 450;
                                int i182 = ((i181 | (-12544)) << 1) - (i181 ^ (-12544));
                                int i183 = ~i180;
                                int i184 = i183 ^ 28;
                                int i185 = i183 & 28;
                                int i186 = (i185 + i184) - (i185 & i184);
                                int i187 = ~i186;
                                int i188 = ((-29) + i180) - ((-29) & i180);
                                int i189 = ~((-1) - (((-1) - ((-1) - (((-1) - i188) | ((-1) - i2)))) & ((-1) - (i188 ^ i2))));
                                int i190 = i187 ^ i189;
                                int i191 = i187 & i189;
                                int i192 = -(-(((i191 + i190) - (i191 & i190)) * 449));
                                int i193 = (i182 ^ i192) + (((i182 + i192) - (i182 | i192)) << 1) + ((~i186) * (-1347));
                                int i194 = ~((~i180) | 28);
                                int i195 = ~i2;
                                int i196 = (-1) - (((-1) - (i195 & (-29))) & ((-1) - ((-29) ^ i195)));
                                int i197 = ~((-1) - (((-1) - ((-1) - (((-1) - i180) | ((-1) - i196)))) & ((-1) - (i196 ^ i180))));
                                int i198 = ((-1) - (((-1) - (i197 & i194)) & ((-1) - (i194 ^ i197)))) * 449;
                                Object[] objArr17 = new Object[1];
                                l(iLastIndexOf, i179, (i193 ^ i198) + (((i198 + i193) - (i198 | i193)) << 1), false, "\u0011\u000e\b\u0003ￍ\u0002\u000e\r\u0013\u0004\r\u0013ￍ\u000f\fￍ\uffef\u0000\u0002\n\u0000\u0006\u0004￨\r\u0005\u000e\u0000\r\u0003", objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                k(new int[]{108, 10, 101, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i199 = 0;
                                while (i199 < length) {
                                    Object obj = objArr19[i199];
                                    int i200 = -TextUtils.getOffsetBefore("", 0);
                                    int i201 = ((i200 + 5) - (5 | i200)) + ((-1) - (((-1) - i200) & ((-1) - 5)));
                                    int i202 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i203 = (((i202 + Mp4VideoDirectory.TAG_DEPTH) - (209 & i202)) << i4) - (i202 ^ Mp4VideoDirectory.TAG_DEPTH);
                                    int i204 = -(Process.myPid() >> 22);
                                    Object[] objArr20 = new Object[i4];
                                    l(i201, i203, ((i204 + 4) - (4 | i204)) + (i204 | 4), true, "\ufff6\ufffb\ufff4\u001e\uffff", objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        Object[] objArr22 = new Object[i4];
                                        k(new int[]{118, 37, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", false, objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        Object[] objArr23 = new Object[i4];
                                        k(new int[]{155, 11, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", i4, objArr23);
                                        String str = (String) objArr23[0];
                                        Class<?>[] clsArr = new Class[i4];
                                        clsArr[0] = String.class;
                                        Object objInvoke3 = cls5.getMethod(str, clsArr).invoke(null, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[i4];
                                            k(new int[]{166, 28, 0, 11}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", i4, objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            Object[] objArr25 = new Object[i4];
                                            k(new int[]{194, 11, 129, 8}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001", false, objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                Object[] objArr27 = new Object[i4];
                                                k(new int[]{118, 37, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", false, objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                Object[] objArr28 = new Object[i4];
                                                k(new int[]{205, 19, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false, objArr28);
                                                String str2 = (String) objArr28[0];
                                                Class<?>[] clsArr2 = new Class[i4];
                                                clsArr2[0] = InputStream.class;
                                                Object objInvoke4 = cls7.getMethod(str2, clsArr2).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                int i205 = 0;
                                                int i206 = 2;
                                                int i207 = i4;
                                                while (i205 < i206) {
                                                    Object obj2 = objArr3[i205];
                                                    try {
                                                        Object[] objArr29 = new Object[i207];
                                                        k(new int[]{CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, 34, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false, objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int i208 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                        int i209 = i208 * 495;
                                                        int i210 = (((i209 ^ (-10846)) + (((-1) - (((-1) - i209) | ((-1) - (-10846)))) << i207)) - (~(-(-(((-1) - (((-1) - (i208 ^ (-23))) & ((-1) - ((-1) - (((-1) - i208) | ((-1) - (-23))))))) * (-988)))))) - i207;
                                                        int i211 = ~i208;
                                                        int i212 = i211 ^ 22;
                                                        int i213 = 22 & i211;
                                                        int i214 = (i212 + i213) - (i212 & i213);
                                                        int i215 = ~i2;
                                                        int i216 = ((i214 ^ i215) | (i214 & i215)) * 494;
                                                        int i217 = (((i210 + i216) - (i210 & i216)) << 1) - (i210 ^ i216);
                                                        int i218 = ~((-1) - (((-1) - i211) & ((-1) - (-23))));
                                                        int i219 = i215 ^ 22;
                                                        int i220 = (-1) - (((-1) - i215) | ((-1) - 22));
                                                        int i221 = ~((i220 + i219) - (i220 & i219));
                                                        int i222 = ((-1) - (((-1) - i221) | ((-1) - i218))) | (i218 ^ i221);
                                                        int i223 = ~((i208 & 22) | (i208 ^ 22));
                                                        int i224 = i222 ^ i223;
                                                        int i225 = i222 & i223;
                                                        int i226 = ((i225 + i224) - (i225 & i224)) * 494;
                                                        int i227 = (((i217 + i226) - (i217 & i226)) << 1) - (i217 ^ i226);
                                                        int i228 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                        int i229 = ((-1) - (((-1) - i228) | ((-1) - 246))) + ((i228 + 246) - (i228 & 246));
                                                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                                                        int iMyUid = Process.myUid();
                                                        int i230 = iCombineMeasuredStates2 * (-830);
                                                        int i231 = (i230 ^ FujifilmMakernoteDirectory.TAG_FACES_DETECTED) + (((i230 + FujifilmMakernoteDirectory.TAG_FACES_DETECTED) - (i230 | FujifilmMakernoteDirectory.TAG_FACES_DETECTED)) << 1);
                                                        int i232 = ~iMyUid;
                                                        int i233 = ~((-1) - (((-1) - ((-21) ^ i232)) & ((-1) - ((i232 - 21) - (i232 | (-21))))));
                                                        int i234 = iCombineMeasuredStates2 ^ 20;
                                                        int i235 = (iCombineMeasuredStates2 + 20) - (20 | iCombineMeasuredStates2);
                                                        int i236 = (i234 + i235) - (i234 & i235);
                                                        int i237 = ~((i236 ^ iMyUid) | ((-1) - (((-1) - i236) | ((-1) - iMyUid))));
                                                        int i238 = i233 ^ i237;
                                                        int i239 = (i233 + i237) - (i233 | i237);
                                                        int i240 = -(-(((i238 + i239) - (i238 & i239)) * (-831)));
                                                        int i241 = (i231 & i240) + ((i240 + i231) - (i240 & i231));
                                                        int i242 = ((-21) & iCombineMeasuredStates2) | ((-21) ^ iCombineMeasuredStates2);
                                                        int i243 = i242 ^ iMyUid;
                                                        int i244 = (i242 + iMyUid) - (i242 | iMyUid);
                                                        int i245 = (~((i244 + i243) - (i244 & i243))) * (-1662);
                                                        int i246 = (((i241 + i245) - (i241 & i245)) << 1) - (i245 ^ i241);
                                                        int i247 = ~((~iCombineMeasuredStates2) | (~iMyUid));
                                                        int i248 = iCombineMeasuredStates2 ^ iMyUid;
                                                        int i249 = (-1) - (((-1) - iCombineMeasuredStates2) | ((-1) - iMyUid));
                                                        int i250 = ~((i249 + i248) - (i249 & i248));
                                                        int i251 = i246 + (((~(((-1) - (((-1) - iMyUid) | ((-1) - 20))) | (iMyUid ^ 20))) | ((i250 + i247) - (i250 | i247)) | (i247 ^ i250)) * 831);
                                                        Object[] objArr30 = new Object[1];
                                                        l(i227, i229, i251, true, "\n\u0004\u000f\n\u0013\ufff1\uffd1\uffd1ￖ\ufff9\u0015\u0004\u0006\u000b\u0003\u0016\ufff4\u0015\u0006\b\r\u0002\u0011", objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            int i252 = ~((-1) - (((-1) - i2) | ((-1) - 1)));
                                                            int i253 = 1 | i2;
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{(i252 + i253) - (i252 | i253)}};
                                                            int i254 = (int) Runtime.getRuntime().totalMemory();
                                                            int i255 = 447952357 + (((-1) - (((-1) - ((-1) - (((-1) - (~((-459332475) | i254))) & ((-1) - 151050298)))) & ((-1) - (~((-218815548) | i254))))) * (-880));
                                                            int i256 = ~i254;
                                                            int i257 = (~(((-459332475) + i256) - ((-459332475) & i256))) | 218815547;
                                                            int i258 = ~(i254 | 459332474);
                                                            int i259 = i255 + ((i257 | i258) * (-880)) + (i258 * 880);
                                                            int iNextInt = new Random().nextInt(607590080);
                                                            int i260 = 12079 - (~(i259 * (-753)));
                                                            int i261 = ~(((-17) + i259) - ((-17) & i259));
                                                            int i262 = (-17) ^ iNextInt;
                                                            int i263 = (-17) & iNextInt;
                                                            int i264 = ~((i262 + i263) - (i262 & i263));
                                                            int i265 = i261 ^ i264;
                                                            int i266 = i261 & i264;
                                                            int i267 = (i266 + i265) - (i266 & i265);
                                                            int i268 = ~((-1) - (((-1) - (i259 ^ iNextInt)) & ((-1) - (i259 & iNextInt))));
                                                            int i269 = i267 ^ i268;
                                                            int i270 = (i267 + i268) - (i267 | i268);
                                                            int i271 = (i260 - (~(((i270 + i269) - (i270 & i269)) * (-754)))) - 1;
                                                            int i272 = (-17) ^ i259;
                                                            int i273 = ((-17) + i259) - ((-17) | i259);
                                                            int i274 = ~((-1) - (((-1) - ((i273 + i272) - (i273 & i272))) & ((-1) - iNextInt)));
                                                            int i275 = ~iNextInt;
                                                            int i276 = i275 ^ 16;
                                                            int i277 = (i275 + 16) - (i275 | 16);
                                                            int i278 = ~(i259 | ((i277 + i276) - (i277 & i276)));
                                                            int i279 = i274 ^ i278;
                                                            int i280 = i274 & i278;
                                                            int i281 = ((i280 + i279) - (i280 & i279)) * (-754);
                                                            int i282 = ~iNextInt;
                                                            int i283 = ((((-1) - (((-1) - i271) | ((-1) - i281))) + ((-1) - (((-1) - i271) & ((-1) - i281)))) - (~(-(-(((i282 & (-17)) | ((-17) ^ i282)) * 754))))) - 1;
                                                            int i284 = f19245e * 1541490148;
                                                            f19245e = i284;
                                                            int i285 = (i283 * 595) + (i3 * (-1187));
                                                            int i286 = ~i283;
                                                            int i287 = ~(((i286 + i3) - (i286 | i3)) | (i286 ^ i3));
                                                            int i288 = ~i284;
                                                            int i289 = ~((-1) - (((-1) - (i288 ^ i3)) & ((-1) - (i288 & i3))));
                                                            int i290 = ((-1) - (((-1) - ((-1) - (((-1) - i289) | ((-1) - i287)))) & ((-1) - (i287 ^ i289)))) * (-1188);
                                                            int i291 = ((i285 | i290) << 1) - (i285 ^ i290);
                                                            int i292 = ~i3;
                                                            int i293 = ~((i292 + i284) - (i292 & i284));
                                                            int i294 = i287 ^ i293;
                                                            int i295 = (i293 + i287) - (i293 | i287);
                                                            int i296 = (i295 + i294) - (i295 & i294);
                                                            int i297 = ~((-1) - (((-1) - (i288 ^ i283)) & ((-1) - (i288 & i283))));
                                                            int i298 = i291 + (((-1) - (((-1) - ((-1) - (((-1) - i296) | ((-1) - i297)))) & ((-1) - (i296 ^ i297)))) * 594);
                                                            int i299 = ~i3;
                                                            int i300 = ~i284;
                                                            int i301 = i299 ^ i300;
                                                            int i302 = (i300 + i299) - (i300 | i299);
                                                            int i303 = ~((i302 + i301) - (i302 & i301));
                                                            int i304 = ~(i299 | i283);
                                                            int i305 = ((i303 + i304) - (i303 | i304)) | (i303 ^ i304);
                                                            int i306 = ~((i288 + i283) - (i288 & i283));
                                                            int i307 = (((-1) - (((-1) - i305) | ((-1) - i306))) | (i305 ^ i306)) * 594;
                                                            int i308 = ((-1) - (((-1) - i298) | ((-1) - i307))) + (i307 | i298);
                                                            int i309 = i308 << 13;
                                                            int i310 = ~((-1) - (((-1) - i308) | ((-1) - i309)));
                                                            int i311 = i309 | i308;
                                                            int i312 = (i311 + i310) - (i311 | i310);
                                                            int i313 = i312 ^ (i312 >>> 17);
                                                            ((int[]) objArr31[0])[0] = i313 ^ (i313 << 5);
                                                            return objArr31;
                                                        }
                                                        int i314 = (i205 ^ 111) + (((-1) - (((-1) - i205) | ((-1) - 111))) << 1);
                                                        i205 = ((i314 - 110) - ((-110) | i314)) + (i314 | (-110));
                                                        i206 = 2;
                                                        i207 = 1;
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                int i315 = (i199 & 96) + (i199 | 96);
                                                i199 = (((-1) - (((-1) - i315) & ((-1) - (-95)))) << 1) - (i315 ^ (-95));
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
        int iMyUid2 = Process.myUid();
        int i316 = ~iMyUid2;
        int i317 = 2033549173 + (((-1) - (((-1) - 269034661) & ((-1) - i316))) * (-192)) + (((~((-1) - (((-1) - 269317367) & ((-1) - i316)))) | 678430728) * (-384));
        int i318 = (~((-1) - (((-1) - i316) & ((-1) - 947748095)))) | (~(((-678430729) + iMyUid2) - ((-678430729) & iMyUid2)));
        int i319 = ~((iMyUid2 - 282707) - (iMyUid2 & (-282707)));
        int i320 = i317 + (((i319 + i318) - (i319 & i318)) * 192);
        int i321 = f19246f * (-1346188373);
        f19246f = i321;
        int i322 = (i320 * (-300)) + (i3 * 302);
        int i323 = i320 ^ i3;
        int i324 = (-1) - (((-1) - i320) | ((-1) - i3));
        int i325 = (i323 + i324) - (i323 & i324);
        int i326 = i325 ^ i321;
        int i327 = i325 & i321;
        int i328 = (~((i327 + i326) - (i327 & i326))) * (-301);
        int i329 = (((i322 + i328) - (i322 & i328)) << 1) - (i322 ^ i328);
        int i330 = ~i3;
        int i331 = ~(i330 | i321);
        int i332 = ~i321;
        int i333 = (i331 | (~((i332 + i320) - (i332 & i320)))) * (-301);
        int i334 = ~i320;
        int i335 = ~(((i321 + i334) - (i321 | i334)) | (i334 ^ i321));
        int i336 = ((((i329 | i333) << 1) - (i333 ^ i329)) - (~(((-1) - (((-1) - ((-1) - (((-1) - i335) | ((-1) - i330)))) & ((-1) - (i330 ^ i335)))) * 301))) - 1;
        int i337 = i336 << 13;
        int i338 = ~((i336 + i337) - (i336 | i337));
        int i339 = (-1) - (((-1) - i337) & ((-1) - i336));
        int i340 = (i339 + i338) - (i339 | i338);
        int i341 = i340 >>> 17;
        int i342 = ~((i340 + i341) - (i340 | i341));
        int i343 = i340 | i341;
        int i344 = (i343 + i342) - (i343 | i342);
        int i345 = i344 << 5;
        int i346 = ~i345;
        int i347 = (i346 + i344) - (i346 | i344);
        int i348 = (~i344) & i345;
        ((int[]) objArr32[0])[0] = (i348 + i347) - (i348 & i347);
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{93, -2, -4, -85};
        $$b = 16;
    }

    private static void k(int[] iArr, String str, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            int i5 = $10 + 31;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        o.a.m mVar = new o.a.m();
        int i7 = 0;
        int i8 = iArr[0];
        int i9 = 1;
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        char[] cArr2 = f19250j;
        if (cArr2 != null) {
            int i13 = $10 + 89;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i9 = 0;
            }
            while (i9 < length) {
                int i14 = $11 + 99;
                $10 = i14 % 128;
                int i15 = i14 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i7;
                        byte b3 = b2;
                        objA = d.a(Process.getGidForName("") + 250, (char) (ViewConfiguration.getTouchSlop() >> 8), 11 - View.MeasureSpec.getMode(i7), 1376582792, false, $$c(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    int i16 = $11 + 85;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    i3 = 2;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i10];
        System.arraycopy(cArr2, i8, cArr3, 0, i10);
        if (bArr != null) {
            char[] cArr4 = new char[i10];
            mVar.f19943d = 0;
            int i18 = $10 + 99;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            char c2 = 0;
            while (mVar.f19943d < i10) {
                if (bArr[mVar.f19943d] == 1) {
                    int i20 = $11 + 19;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        int i21 = mVar.f19943d;
                        Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA2 = d.a(120026474);
                        if (objA2 == null) {
                            objA2 = d.a(View.resolveSizeAndState(0, 0, 0) + 11, (char) TextUtils.indexOf("", ""), View.resolveSizeAndState(0, 0, 0) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr4[i21] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i22 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = d.a(120026474);
                    if (objA3 == null) {
                        objA3 = d.a(11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0') + 11, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i22] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                } else {
                    int i23 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = d.a(1632715197);
                    if (objA4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA4 = d.a(836 - View.resolveSizeAndState(0, 0, 0), (char) (27278 - TextUtils.lastIndexOf("", '0', 0, 0)), 11 - View.resolveSizeAndState(0, 0, 0), -1210801192, false, $$c(b4, b5, (byte) (7 | b5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i23] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = d.a(20 - MotionEvent.axisFromString(""), (char) (35715 - TextUtils.indexOf("", "")), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i12 > 0) {
            char[] cArr5 = new char[i10];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i10);
            int i24 = i10 - i12;
            System.arraycopy(cArr5, 0, cArr3, i24, i12);
            System.arraycopy(cArr5, i12, cArr3, 0, i24);
        } else {
            i2 = 0;
        }
        int i25 = 1;
        if (z2) {
            char[] cArr6 = new char[i10];
            mVar.f19943d = i2;
            while (mVar.f19943d < i10) {
                cArr6[mVar.f19943d] = cArr3[(i10 - mVar.f19943d) - i25];
                mVar.f19943d += i25;
                i25 = 1;
            }
            cArr3 = cArr6;
        }
        if (i11 > 0) {
            int i26 = $10 + 23;
            $11 = i26 % 128;
            int i27 = i26 % 2;
            mVar.f19943d = 0;
            int i28 = $10 + 93;
            $11 = i28 % 128;
            int i29 = i28 % 2;
            while (mVar.f19943d < i10) {
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                mVar.f19943d++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void l(int i2, int i3, int i4, boolean z2, String str, Object[] objArr) throws Throwable {
        Object charArray;
        char[] cArr;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $10 + 35;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr2 = (char[]) charArray;
        n nVar = new n();
        char[] cArr3 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr2[nVar.f19944a];
            cArr3[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(f19248h)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(270 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 11, -2071844881, false, $$c(b2, b2, (byte) (-$$a[1])), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA2 = d.a(521 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, 627984172, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
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
            int i9 = $10 + 17;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr4, nVar.f19945b, cArr3, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i11 = $10 + 65;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr = new char[i2];
                nVar.f19944a = 1;
            } else {
                cArr = new char[i2];
                nVar.f19944a = 0;
            }
            while (nVar.f19944a < i2) {
                cArr[nVar.f19944a] = cArr3[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = d.a(-202660535);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = d.a(522 - Gravity.getAbsoluteGravity(0, 0), (char) TextUtils.getOffsetBefore("", 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, 627984172, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr3 = cArr;
        }
        objArr[0] = new String(cArr3);
    }

    public final void display(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerSecureDigitalCardVcnDisplayProcess.a(context, new o.x.d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardVcnDisplayProcess), new b());
        int i3 = f19249i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f19247g = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void display(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerSecureDigitalCardVcnDisplayProcess.a(context, new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardVcnDisplayProcess), new b());
        int i3 = f19249i + 1;
        f19247g = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        List<CustomerAuthenticationMethodType> listB;
        int i2 = 2 % 2;
        int i3 = f19247g + 101;
        f19249i = i3 % 128;
        if (i3 % 2 == 0) {
            listB = o.ea.m.b(this.innerSecureDigitalCardVcnDisplayProcess.d());
            int i4 = 59 / 0;
        } else {
            listB = o.ea.m.b(this.innerSecureDigitalCardVcnDisplayProcess.d());
        }
        int i5 = f19247g + 47;
        f19249i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return listB;
    }

    public final CancellationSignal getCancellationSignal() {
        int i2 = 2 % 2;
        int i3 = f19247g + 53;
        f19249i = i3 % 128;
        int i4 = i3 % 2;
        CancellationSignal cancellationSignalN = this.innerSecureDigitalCardVcnDisplayProcess.n();
        int i5 = f19249i + 7;
        f19247g = i5 % 128;
        int i6 = i5 % 2;
        return cancellationSignalN;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        int i2 = 2 % 2;
        int i3 = f19247g + 57;
        f19249i = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerSecureDigitalCardVcnDisplayProcess.g();
            throw null;
        }
        String strG = this.innerSecureDigitalCardVcnDisplayProcess.g();
        int i4 = f19247g + 69;
        f19249i = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return strG;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f19249i + 5;
        f19247g = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        int i2 = 2 % 2;
        int i3 = f19249i + 75;
        f19247g = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerSecureDigitalCardVcnDisplayProcess};
            int i4 = i.f26925h * 601961010;
            i.f26925h = i4;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iNextInt = new Random().nextInt(1592817291);
            int i5 = i.f26927j * 826423998;
            i.f26927j = i5;
            int i6 = 28 / 0;
            if (!((Boolean) i.c(-571425008, i4, 571425009, iFreeMemory, i5, iNextInt, objArr)).booleanValue()) {
                return true;
            }
        } else {
            Object[] objArr2 = {this.innerSecureDigitalCardVcnDisplayProcess};
            int i7 = i.f26925h * 601961010;
            i.f26925h = i7;
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int iNextInt2 = new Random().nextInt(1592817291);
            int i8 = i.f26927j * 826423998;
            i.f26927j = i8;
            if (!((Boolean) i.c(-571425008, i7, 571425009, iFreeMemory2, i8, iNextInt2, objArr2)).booleanValue()) {
                return true;
            }
        }
        int i9 = f19247g + 17;
        f19249i = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final SecureVirtualCardNumberDisplay setActivityCallback(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) {
        int i2 = 2 % 2;
        int i3 = f19249i;
        int i4 = i3 + 97;
        f19247g = i4 % 128;
        int i5 = i4 % 2;
        this.activityCallback = customerAuthenticatedProcessActivityCallback;
        int i6 = i3 + 63;
        f19247g = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final SecureVirtualCardNumberDisplay setCardBackground(Drawable drawable) {
        int i2 = 2 % 2;
        int i3 = f19249i;
        int i4 = i3 + 67;
        f19247g = i4 % 128;
        int i5 = i4 % 2;
        this.cardDrawable = drawable;
        int i6 = i3 + 87;
        f19247g = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SecureVirtualCardNumberDisplay setCardForegroundColor(Integer num) {
        int i2 = 2 % 2;
        int i3 = f19247g + 67;
        int i4 = i3 % 128;
        f19249i = i4;
        int i5 = i3 % 2;
        this.cardForegroundColor = num;
        int i6 = i4 + 5;
        f19247g = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19247g + 99;
        f19249i = i3 % 128;
        int i4 = i3 % 2;
        this.innerSecureDigitalCardVcnDisplayProcess.e(context, customerAuthenticationCredentials);
        int i5 = f19249i + 37;
        f19247g = i5 % 128;
        int i6 = i5 % 2;
    }
}
