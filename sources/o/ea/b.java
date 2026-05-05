package o.ea;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.hardware.fingerprint.FingerprintManager;
import android.media.AudioTrack;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.pm.PackageInfoCompat;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.common.GoogleApiAvailability;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeoutException;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f23480a = 0;

    /* JADX INFO: renamed from: b */
    public static int f23481b = 0;

    /* JADX INFO: renamed from: c */
    public static int f23482c = 0;

    /* JADX INFO: renamed from: d */
    public static int f23483d = 0;

    /* JADX INFO: renamed from: e */
    public static int f23484e = 0;

    /* JADX INFO: renamed from: f */
    public static int f23485f = 0;

    /* JADX INFO: renamed from: g */
    public static int f23486g = 0;

    /* JADX INFO: renamed from: h */
    public static int f23487h = 0;

    /* JADX INFO: renamed from: i */
    public static int f23488i = 0;

    /* JADX INFO: renamed from: j */
    public static int f23489j = 0;

    /* JADX INFO: renamed from: k */
    private static int f23490k = 0;

    /* JADX INFO: renamed from: l */
    private static byte[] f23491l = null;

    /* JADX INFO: renamed from: m */
    private static int f23492m = 0;

    /* JADX INFO: renamed from: n */
    private static b f23493n = null;

    /* JADX INFO: renamed from: o */
    private static int f23494o = 0;

    /* JADX INFO: renamed from: p */
    private static char f23495p = 0;

    /* JADX INFO: renamed from: q */
    private static char f23496q = 0;

    /* JADX INFO: renamed from: r */
    private static short[] f23497r = null;

    /* JADX INFO: renamed from: s */
    private static char f23498s = 0;

    /* JADX INFO: renamed from: t */
    private static char f23499t = 0;

    /* JADX INFO: renamed from: u */
    private static int f23500u = 0;

    /* JADX INFO: renamed from: v */
    private static int f23501v = 0;

    /* JADX INFO: renamed from: w */
    private static int f23502w = 0;

    /* JADX INFO: renamed from: x */
    private static int f23503x = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, byte r10) {
        /*
            byte[] r7 = o.ea.b.$$a
            int r0 = r9 * 4
            int r6 = 1 - r0
            int r0 = r10 + 4
            int r5 = r8 + 69
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L27
            r5 = r6
            r1 = r0
            r2 = r3
        L12:
            int r0 = -r0
            int r5 = r5 + r0
            r0 = r1
        L15:
            byte r1 = (byte) r5
            r4[r2] = r1
            int r2 = r2 + 1
            int r1 = r0 + 1
            if (r2 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r7[r1]
            goto L12
        L27:
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.b.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23488i = 379154257;
        f23489j = 1986271174;
        f23486g = -1517225197;
        f23487h = 1421528263;
        f23485f = -1472667450;
        f23481b = 67040776;
        f23480a = -1679922719;
        f23483d = 399210664;
        f23482c = 1541475934;
        f23484e = -283909050;
        f23500u = 0;
        f23502w = 1;
        f23503x = 0;
        f23501v = 1;
        h();
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getScrollFriction();
        ExpandableListView.getPackedPositionForGroup(0);
        Process.myTid();
        ViewConfiguration.getFadingEdgeLength();
        Color.alpha(0);
        SystemClock.elapsedRealtimeNanos();
        ViewConfiguration.getGlobalActionKeyTimeout();
        Color.blue(0);
        TextUtils.lastIndexOf("", '0', 0);
        int i2 = f23502w + 37;
        f23500u = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
    }

    protected b() {
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) throws Throwable {
        Object obj;
        int i8 = ~i3;
        int i9 = (~i4) | i8;
        int i10 = ~i9;
        int i11 = ~(i8 | i7);
        int i12 = (i11 + i10) - (i11 & i10);
        int i13 = i8 | (~i7);
        int i14 = (-1) - (((-1) - (~((i13 + i4) - (i13 & i4)))) & ((-1) - (~(i9 | i7))));
        int i15 = i3 | i7;
        int i16 = i14 | (~((i15 + i4) - (i15 & i4)));
        int i17 = (-1) - (((-1) - (~((-1) - (((-1) - i4) & ((-1) - i3))))) & ((-1) - ((i7 + i10) - (i7 & i10))));
        int i18 = i3 + i7 + i2 + (5090439 * i6) + ((-1076018391) * i5);
        int i19 = i18 * i18;
        int i20 = ((1425068070 * i3) - 1475346432) + (1088368604 * i7) + (i12 * (-168349733)) + ((-168349733) * i16) + (168349733 * i17) + (1256718336 * i2) + (1616379904 * i6) + ((-1222115328) * i5) + (1028194304 * i19);
        int i21 = (i3 * (-1092730454)) + 799718796 + (i7 * (-1092731068)) + (i12 * (-307)) + (i16 * (-307)) + (i17 * 307) + (i2 * (-1092730761)) + (i6 * 1582232257) + (i5 * 741505039) + (i19 * (-1125187584));
        int i22 = i20 + (i21 * i21 * (-410583040));
        if (i22 == 1) {
            Context context = (Context) objArr[0];
            int i23 = 2 % 2;
            int i24 = f23503x + 111;
            f23501v = i24 % 128;
            int i25 = i24 % 2;
            String strWd = Ig.wd("晝貪녏婳즹꧳넌趕쇄姒", (short) (C1580rY.Xd() ^ (-17743)));
            short sXd = (short) (OY.Xd() ^ 30839);
            int[] iArr = new int["];ti7\u0006\u0013~ve\\F\u0006\u0013\u0007)\u00137p\r@\u0012a".length()];
            QB qb = new QB("];ti7\u0006\u0013~ve\\F\u0006\u0013\u0007)\u00137p\r@\u0012a");
            int i26 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i26] = xuXd.fK((C1561oA.Xd[i26 % C1561oA.Xd.length] ^ ((sXd + sXd) + i26)) + xuXd.CK(iKK));
                i26++;
            }
            Object[] objArr2 = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i26)).getMethod(C1561oA.Qd("\u0011\u000e\u001ci\u0015\u0013\u0018\b\u0010\u0015q\u0004\u0011\f\b\u0011~\u000b", (short) (ZN.Xd() ^ 8959)), new Class[0]);
            try {
                method.setAccessible(true);
                ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr2);
                if (i25 == 0) {
                    Object[] objArr3 = new Object[1];
                    z(strWd, View.MeasureSpec.getMode(0) * 30, objArr3);
                    obj = objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    z(strWd, 10 - View.MeasureSpec.getMode(0), objArr4);
                    obj = objArr4[0];
                }
                return Settings.Secure.getString(contentResolver, ((String) obj).intern());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (i22 == 2) {
            return b(objArr);
        }
        if (i22 == 3) {
            int i27 = 2 % 2;
            int i28 = f23503x + 73;
            f23501v = i28 % 128;
            int i29 = i28 % 2;
            String str = Build.MODEL;
            int i30 = f23501v + 71;
            f23503x = i30 % 128;
            int i31 = i30 % 2;
            return str;
        }
        if (i22 != 4) {
            return i22 != 5 ? a(objArr) : c(objArr);
        }
        Context context2 = (Context) objArr[0];
        int i32 = 2 % 2;
        int i33 = f23503x;
        int i34 = i33 + 23;
        f23501v = i34 % 128;
        int i35 = i34 % 2;
        if (context2 == null) {
            int i36 = i33 + 101;
            f23501v = i36 % 128;
            int i37 = i36 % 2;
            return false;
        }
        Object[] objArr5 = new Object[0];
        Method method2 = Class.forName(C1561oA.Yd("9G>MKFB\rCPPWISZ\u0015+XX_Qeb", (short) (C1607wl.Xd() ^ 3204))).getMethod(Xg.qd("xw\bdvy\u0003y\u0001\u007fh}\f\u007f\u0007\u0006\u0014", (short) (Od.Xd() ^ (-432)), (short) (Od.Xd() ^ (-16730))), new Class[0]);
        try {
            method2.setAccessible(true);
            PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr5);
            Object[] objArr6 = new Object[1];
            y((short) (AndroidCharacter.getMirror('0') - '0'), TextUtils.lastIndexOf("", '0') - 1757826252, TextUtils.indexOf("", "", 0, 0) + 1671384977, (-29) - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr6);
            String strIntern = ((String) objArr6[0]).intern();
            short sXd2 = (short) (ZN.Xd() ^ 10755);
            short sXd3 = (short) (ZN.Xd() ^ 24066);
            int[] iArr2 = new int["~Y)\t_\u001bo\u000byg@\u0018b-\r\u0018\u00142L<'zL\u0014S#tZA\u0006U%k".length()];
            QB qb2 = new QB("~Y)\t_\u001bo\u000byg@\u0018b-\r\u0018\u00142L<'zL\u0014S#tZA\u0006U%k");
            int i38 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i38] = xuXd2.fK(xuXd2.CK(iKK2) - ((i38 * sXd3) ^ sXd2));
                i38++;
            }
            Object[] objArr7 = {strIntern};
            Method method3 = Class.forName(new String(iArr2, 0, i38)).getMethod(C1626yg.Ud("#.\u0003\u0011\u0014tFse7\f\u0002\u001c(-n", (short) (C1499aX.Xd() ^ (-19093)), (short) (C1499aX.Xd() ^ (-5293))), Class.forName(ZO.xd("H;BHlRZ\"N\u0003k\u0006{\u0001\\\u0017", (short) (Od.Xd() ^ (-2366)), (short) (Od.Xd() ^ (-10175)))));
            try {
                method3.setAccessible(true);
                return Boolean.valueOf(((Boolean) method3.invoke(packageManager, objArr7)).booleanValue());
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23503x + 55;
        f23501v = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        if (i4 == 0) {
            int i5 = 67 / 0;
        }
        int i6 = f23501v + 97;
        f23503x = i6 % 128;
        if (i6 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static String a(Context context) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f23503x + 115;
        f23501v = i3 % 128;
        int i4 = i3 % 2;
        if (context == null) {
            return "";
        }
        short sXd = (short) (C1633zX.Xd() ^ (-20766));
        short sXd2 = (short) (C1633zX.Xd() ^ (-26144));
        int[] iArr = new int["%3*972.x/<<C5?F\u0001\u0017DDK=QN".length()];
        QB qb = new QB("%3*972.x/<<C5?F\u0001\u0017DDK=QN");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((xuXd.CK(iKK) - (sXd + i5)) - sXd2);
            i5++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(C1561oA.od("\t\u0006\u0014_\u000e\r\b\u0004|y\f\u007f\u0005\u0003\\\u0001w\u007f", (short) (C1580rY.Xd() ^ (-24458))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strKd = C1561oA.Kd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI\r\u000bL`\u0011\u0012\u000f\r\b\u0007\u001b\u0011\u0018\u0018s\u001a\u0013\u001d", (short) (C1499aX.Xd() ^ (-20263)));
            String strZd = Wg.Zd("oM\be\u001es\u0004\f,e\u007f8(\u001e,\\", (short) (C1580rY.Xd() ^ (-23489)), (short) (C1580rY.Xd() ^ (-17187)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 1 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            int i6 = m.f23563d * 691068131;
            m.f23563d = i6;
            int i7 = m.f23561b * (-1916120846);
            m.f23561b = i7;
            String str = (String) m.c(new Object[]{(String) obj}, (int) SystemClock.uptimeMillis(), i7, -327535505, i6, 327535505, Process.myUid());
            int i8 = f23503x + 75;
            f23501v = i8 % 128;
            int i9 = i8 % 2;
            return str;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static b a() {
        int i2 = 2 % 2;
        int i3 = f23501v + 17;
        f23503x = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f23493n == null) {
            f23493n = new c();
        }
        b bVar = f23493n;
        int i4 = f23503x + 79;
        f23501v = i4 % 128;
        int i5 = i4 % 2;
        return bVar;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23501v + 111;
        f23503x = i3 % 128;
        int i4 = i3 % 2;
        int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        int i5 = f23501v + 37;
        f23503x = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(iIsGooglePlayServicesAvailable);
        }
        throw null;
    }

    public static String b() {
        int i2 = 2 % 2;
        int i3 = f23501v + 69;
        f23503x = i3 % 128;
        int i4 = i3 % 2;
        String str = Build.VERSION.RELEASE;
        int i5 = f23501v + 115;
        f23503x = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x02a7, code lost:
    
        if (r0 == null) goto L177;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r15, java.lang.String r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.b.b(android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean b(Context context) {
        int iMyPid = Process.myPid();
        int i2 = (-1109751392) * f23486g;
        f23486g = i2;
        int i3 = f23489j * 110056700;
        f23489j = i3;
        int i4 = f23488i * 1232850784;
        f23488i = i4;
        return ((Boolean) a(i2, 1161837834, iMyPid, new Object[]{context}, i4, i3, -1161837830)).booleanValue();
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        o.ey.a.a();
        o.ey.c cVar = new o.ey.c(context);
        int i3 = f23503x + 7;
        f23501v = i3 % 128;
        if (i3 % 2 != 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0012, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0014, code lost:
    
        r1 = r1 + 39;
        o.ea.b.f23503x = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if ((r1 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x001d, code lost:
    
        r0 = 43 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0020, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0021, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0028, code lost:
    
        if (e(r4) == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r1 = o.ea.b.f23503x + 69;
        o.ea.b.f23501v = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.ea.b.f23503x
            int r0 = r0 + 69
            int r1 = r0 % 128
            o.ea.b.f23501v = r1
            int r0 = r0 % r3
            r2 = 0
            if (r0 != 0) goto L21
            r0 = 50
            int r0 = r0 / r2
            if (r4 != 0) goto L24
        L14:
            int r1 = r1 + 39
            int r0 = r1 % 128
            o.ea.b.f23503x = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L20
            r0 = 43
            int r0 = r0 / r2
        L20:
            return r2
        L21:
            if (r4 != 0) goto L24
            goto L14
        L24:
            android.nfc.NfcAdapter r0 = e(r4)
            if (r0 == 0) goto L35
            int r0 = o.ea.b.f23503x
            int r1 = r0 + 69
            int r0 = r1 % 128
            o.ea.b.f23501v = r0
            int r1 = r1 % r3
            r0 = 1
            return r0
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.b.c(android.content.Context):boolean");
    }

    public static String[] c() {
        int i2 = 2 % 2;
        int i3 = f23501v + 45;
        f23503x = i3 % 128;
        int i4 = i3 % 2;
        String[] strArr = fr.antelop.sdk.e.f19455a;
        int i5 = f23503x + 27;
        f23501v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return strArr;
    }

    public static int d() {
        int i2 = 2 % 2;
        int i3 = f23501v + 35;
        f23503x = i3 % 128;
        if (i3 % 2 != 0) {
            o.bp.d.d().a();
            throw null;
        }
        int iA = o.bp.d.d().a();
        int i4 = f23503x + 109;
        f23501v = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return iA;
    }

    public static String d(Context context) throws Throwable {
        int i2 = 2 % 2;
        if (context == null) {
            int i3 = f23503x + 95;
            f23501v = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int i5 = f23503x + 59;
            f23501v = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                y((short) ((-1) << (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-1757826372) % (ViewConfiguration.getScrollBarFadeDuration() - 27), 1671384928 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ExpandableListView.getPackedPositionGroup(0L), objArr);
                return ((String) objArr[0]).intern();
            }
            Object[] objArr2 = new Object[1];
            y((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-1757826372) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1671384928 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 30, (byte) ExpandableListView.getPackedPositionGroup(0L), objArr2);
            return ((String) objArr2[0]).intern();
        }
        Object[] objArr3 = new Object[1];
        z(C1593ug.zd("\ueb98ᒛ绣꼇\ue45a퐃", (short) (C1607wl.Xd() ^ 32432), (short) (C1607wl.Xd() ^ 15473)), (Process.myTid() >> 22) + 5, objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        short sXd = (short) (Od.Xd() ^ (-16064));
        int[] iArr = new int["`lanjc]&ZechX`e\u001e2][`Pb]".length()];
        QB qb = new QB("`lanjc]&ZechX`e\u001e2][`Pb]");
        int i6 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i6] = xuXd.fK(sXd + sXd + i6 + xuXd.CK(iKK));
            i6++;
        }
        Object[] objArr4 = {strIntern};
        Method method = Class.forName(new String(iArr, 0, i6)).getMethod(Wg.Zd("s!cqAj\u001f?~\u0014Y\u0016Ce\u0013D", (short) (FB.Xd() ^ 21321), (short) (FB.Xd() ^ 26386)), Class.forName(C1561oA.Kd("OG]I\u0017VLZT\u001cBdc[a[", (short) (C1499aX.Xd() ^ (-19142)))));
        try {
            method.setAccessible(true);
            TelephonyManager telephonyManager = (TelephonyManager) method.invoke(context, objArr4);
            if (telephonyManager == null) {
                if (f.a()) {
                    int i7 = f23501v + 7;
                    f23503x = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr5 = new Object[1];
                    y((short) Color.alpha(0), TextUtils.lastIndexOf("", '0', 0, 0) - 1757826356, 1671384946 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-29) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr5);
                    String strIntern2 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    z(C1561oA.Xd("僐燀ᆜﵲ逋뭐랗ꠥ밾荾\u0fdd펊缑ꠘ╚貎\udc87ꦌᾟ歅ᆥᶣ❣䐾ဲꢂᙓୌ춛벃", (short) (C1499aX.Xd() ^ (-18673))), 30 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr6);
                    f.c(strIntern2, ((String) objArr6[0]).intern());
                }
                return "";
            }
            String deviceId = telephonyManager.getDeviceId();
            if (deviceId.length() != 14) {
                return deviceId;
            }
            if (f.a()) {
                Object[] objArr7 = new Object[1];
                y((short) (ViewConfiguration.getFadingEdgeLength() >> 16), (-1757826357) - (ViewConfiguration.getWindowTouchSlop() >> 8), 1671384945 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getCapsMode("", 0, 0) - 29, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr7);
                String strIntern3 = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                y((short) TextUtils.indexOf("", "", 0, 0), (-1757826336) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1671384983 - ((Process.getThreadPriority(0) + 20) >> 6), (-29) - (Process.myTid() >> 22), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr8);
                f.c(strIntern3, ((String) objArr8[0]).intern());
            }
            int length = deviceId.length();
            int[] iArr2 = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = deviceId.charAt(i9);
                if (!Character.isDigit(deviceId.charAt(i9))) {
                    if (f.a()) {
                        Object[] objArr9 = new Object[1];
                        y((short) (ImageFormat.getBitsPerPixel(0) + 1), View.MeasureSpec.getMode(0) - 1757826357, (ViewConfiguration.getPressedStateDuration() >> 16) + 1671384945, (-30) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((-1) - MotionEvent.axisFromString("")), objArr9);
                        String strIntern4 = ((String) objArr9[0]).intern();
                        Object[] objArr10 = new Object[1];
                        y((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), View.combineMeasuredStates(0, 0) - 1757826306, 1671384983 - View.getDefaultSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 29, (byte) (TextUtils.lastIndexOf("", '0') + 1), objArr10);
                        f.d(strIntern4, ((String) objArr10[0]).intern());
                        int i10 = f23501v + 17;
                        f23503x = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    Object[] objArr11 = new Object[1];
                    y((short) ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1757826373, 1671384928 - (ViewConfiguration.getLongPressTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) - 29, (byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr11);
                    return ((String) objArr11[0]).intern();
                }
                iArr2[i9] = cCharAt - '0';
            }
            int iA = m.a(iArr2);
            char c2 = (char) (iA + 48);
            if (f.a()) {
                Object[] objArr12 = new Object[1];
                y((short) (ViewConfiguration.getFadingEdgeLength() >> 16), (-1757826357) - Color.blue(0), (KeyEvent.getMaxKeyCode() >> 16) + 1671384945, (-30) - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) ((Process.getThreadPriority(0) + 20) >> 6), objArr12);
                String strIntern5 = ((String) objArr12[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr13 = new Object[1];
                y((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1757826287) - TextUtils.indexOf((CharSequence) "", '0', 0), 1671384982 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) - 29, (byte) TextUtils.getTrimmedLength(""), objArr13);
                f.c(strIntern5, sb.append(((String) objArr13[0]).intern()).append(iA).toString());
            }
            return new StringBuilder().append(deviceId).append(c2).toString();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static NfcAdapter e(Context context) {
        int i2 = 2 % 2;
        int i3 = f23503x + 53;
        f23501v = i3 % 128;
        if (i3 % 2 != 0) {
            return NfcAdapter.getDefaultAdapter(context);
        }
        NfcAdapter.getDefaultAdapter(context);
        throw null;
    }

    public static String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23503x + 39;
        f23501v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        y((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (-1757826379) - View.MeasureSpec.getMode(0), 1671384945 + (ViewConfiguration.getMinimumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) - 29, (byte) Color.red(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f23503x + 3;
        f23501v = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public static byte[] e(Context context, String str) throws Throwable {
        Signature signature;
        int i2 = 2 % 2;
        Object obj = null;
        try {
            int i3 = Build.VERSION.SDK_INT;
            String strVd = Wg.vd("\ue9fdያ舸轵趶㍼憞硫\uf69cც胟呾鱡\u218d퓦珃噧敛촀쯷嵯⒭ꤊ璵舖\ude64ꥍ䦛尾\uda27鈅\ue0d5䋃⚬ಭ斓Ց\uf83aሥ뀇ꈌ\uf19a", (short) (ZN.Xd() ^ 4096));
            if (i3 >= 28) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(Qg.kd("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007", (short) (C1607wl.Xd() ^ 23903), (short) (C1607wl.Xd() ^ 10168))).getMethod(hg.Vd("GDR-=>E:?<#6B496B", (short) (C1580rY.Xd() ^ (-20734)), (short) (C1580rY.Xd() ^ (-24921))), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.ud("}\n~\f\b\u0001zCw\u0003\u0001\u0006u}\u0003;Ozx}m\u007fz", (short) (ZN.Xd() ^ 24790))).getMethod(C1561oA.yd(")(8\u0015\u001f\"+\"! \n\u001e#\u001c", (short) (C1580rY.Xd() ^ (-11859))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        String str2 = (String) method2.invoke(context, objArr2);
                        short sXd = (short) (ZN.Xd() ^ 25625);
                        int[] iArr = new int["BPGVTOK\u0016LYY`R\\c\u001ea_!DVYbY`_H]k_fes".length()];
                        QB qb = new QB("BPGVTOK\u0016LYY`R\\c\u001ea_!DVYbY`_H]k_fes");
                        int i4 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i4));
                            i4++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i4));
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = Class.forName(Xg.qd("wo\u0006q?~t\u0003|Dj\r\f\u0004\n\u0004", (short) (C1499aX.Xd() ^ (-28940)), (short) (C1499aX.Xd() ^ (-6826))));
                        clsArr[1] = Integer.TYPE;
                        Object[] objArr3 = {str2, 134217728};
                        Method method3 = cls.getMethod(Jg.Wd("\u0017vDf6~E\u0002F\u000b-\u0019O\u001f", (short) (ZN.Xd() ^ 14317), (short) (ZN.Xd() ^ 8462)), clsArr);
                        try {
                            method3.setAccessible(true);
                            SigningInfo signingInfo = ((PackageInfo) method3.invoke(packageManager, objArr3)).signingInfo;
                            if (signingInfo.hasMultipleSigners()) {
                                int i5 = f23503x + 101;
                                f23501v = i5 % 128;
                                if (i5 % 2 == 0) {
                                    f.a();
                                    throw null;
                                }
                                if (f.a()) {
                                    Object[] objArr4 = new Object[1];
                                    y((short) TextUtils.getOffsetAfter("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1757826358, 1671384945 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 29, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr4);
                                    String strIntern = ((String) objArr4[0]).intern();
                                    Object[] objArr5 = new Object[1];
                                    y((short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1757826197, 1671384983 - (KeyEvent.getMaxKeyCode() >> 16), Color.alpha(0) - 29, (byte) (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
                                    f.d(strIntern, ((String) objArr5[0]).intern());
                                }
                                return null;
                            }
                            int length = signingInfo.getSigningCertificateHistory().length;
                            if (length == 0) {
                                int i6 = f23503x + 49;
                                f23501v = i6 % 128;
                                if (i6 % 2 == 0) {
                                    f.a();
                                    obj.hashCode();
                                    throw null;
                                }
                                if (f.a()) {
                                    Object[] objArr6 = new Object[1];
                                    y((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1757826357, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1671384945, (-29) - (ViewConfiguration.getTouchSlop() >> 8), (byte) Color.red(0), objArr6);
                                    String strIntern2 = ((String) objArr6[0]).intern();
                                    Object[] objArr7 = new Object[1];
                                    z(strVd, View.resolveSize(0, 0) + 42, objArr7);
                                    f.d(strIntern2, ((String) objArr7[0]).intern());
                                }
                                return null;
                            }
                            signature = signingInfo.getSigningCertificateHistory()[length - 1];
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } else {
                Object[] objArr8 = new Object[0];
                Method method4 = Class.forName(ZO.xd("($<\f~\u0006KiY6\nQko1)wnImC?G", (short) (OY.Xd() ^ 30255), (short) (OY.Xd() ^ 9943))).getMethod(C1626yg.Ud("\u000b\u001bD\u001fd_\u0017?\t\u0013D9v&Lo$", (short) (C1499aX.Xd() ^ (-22589)), (short) (C1499aX.Xd() ^ (-15740))), new Class[0]);
                try {
                    method4.setAccessible(true);
                    PackageManager packageManager2 = (PackageManager) method4.invoke(context, objArr8);
                    Object[] objArr9 = new Object[0];
                    Method method5 = Class.forName(Ig.wd("J\u0007;c?cLtf!(JkpxJ\nN\u00144aGo", (short) (Od.Xd() ^ (-24405)))).getMethod(EO.Od("\u0019_\u0003\u0005o.\u0010p1Q:i$(", (short) (ZN.Xd() ^ 2121)), new Class[0]);
                    try {
                        method5.setAccessible(true);
                        String str3 = (String) method5.invoke(context, objArr9);
                        short sXd2 = (short) (ZN.Xd() ^ 16756);
                        int[] iArr2 = new int["R^S`\\UO\u0018LWUZJRW\u0010QM\r.>?F;@=$7C5:7C".length()];
                        QB qb2 = new QB("R^S`\\UO\u0018LWUZJRW\u0010QM\r.>?F;@=$7C5:7C");
                        int i7 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i7] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i7 + xuXd2.CK(iKK2));
                            i7++;
                        }
                        Class<?> cls2 = Class.forName(new String(iArr2, 0, i7));
                        Class<?>[] clsArr2 = new Class[2];
                        clsArr2[0] = Class.forName(C1593ug.zd("7/E1~>4B<\u0004*LKCIC", (short) (Od.Xd() ^ (-2460)), (short) (Od.Xd() ^ (-31257))));
                        clsArr2[1] = Integer.TYPE;
                        Object[] objArr10 = {str3, 64};
                        Method method6 = cls2.getMethod(C1561oA.od("\u0017\u0014\"|\r\u000e\u0015\n\u000f\fn\u0013\n\u0012", (short) (C1633zX.Xd() ^ (-6028))), clsArr2);
                        try {
                            method6.setAccessible(true);
                            PackageInfo packageInfo = (PackageInfo) method6.invoke(packageManager2, objArr10);
                            if (packageInfo.signatures.length == 0) {
                                if (f.a()) {
                                    Object[] objArr11 = new Object[1];
                                    y((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), KeyEvent.normalizeMetaState(0) - 1757826357, ExpandableListView.getPackedPositionChild(0L) + 1671384946, ImageFormat.getBitsPerPixel(0) - 28, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr11);
                                    String strIntern3 = ((String) objArr11[0]).intern();
                                    Object[] objArr12 = new Object[1];
                                    z(strVd, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, objArr12);
                                    f.d(strIntern3, ((String) objArr12[0]).intern());
                                }
                                return null;
                            }
                            signature = packageInfo.signatures[0];
                            int i8 = f23503x + 117;
                            f23501v = i8 % 128;
                            int i9 = i8 % 2;
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            }
            return o.eh.e.e(signature.toByteArray(), str);
        } catch (PackageManager.NameNotFoundException e8) {
            if (f.a()) {
                Object[] objArr13 = new Object[1];
                y((short) KeyEvent.normalizeMetaState(0), (-1757826357) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 1671384945, (-28) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr13);
                String strIntern4 = ((String) objArr13[0]).intern();
                Object[] objArr14 = new Object[1];
                z(C1561oA.Kd("誑ꮁ⋐』⹒찚慨驰靀ꦐↇ\ued28㴍먻疖ᑵ\ueefbﷱ涘沑\uf60b뵋錊䔳჻឴벭欝Ϗﯠ첣ភ誱ꮡ\u0a44鷎臭骎非ꦮ턣손翂铩瑰悼⬱\ue620", (short) (C1633zX.Xd() ^ (-20711))), 47 - KeyEvent.getDeadChar(0, 0), objArr14);
                f.e(strIntern4, ((String) objArr14[0]).intern(), e8);
            }
            int i10 = f23503x + 57;
            f23501v = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 16 / 0;
            }
            return null;
        }
    }

    public static long f() {
        int i2 = 2 % 2;
        long time = new Date().getTime() / 1000;
        int i3 = f23503x + 123;
        f23501v = i3 % 128;
        if (i3 % 2 != 0) {
            return time;
        }
        throw null;
    }

    public static String f(Context context) {
        int i2 = f23483d * (-465297448);
        f23483d = i2;
        int i3 = (-1596292587) * f23480a;
        f23480a = i3;
        return (String) a(i3, 1544988355, i2, new Object[]{context}, (int) Runtime.getRuntime().freeMemory(), Thread.activeCount(), -1544988354);
    }

    public static int g(Context context) throws TimeoutException {
        int i2 = 2 % 2;
        int i3 = f23501v + 1;
        f23503x = i3 % 128;
        int i4 = i3 % 2;
        int iA = o.bp.d.d().a(context) + (o.bp.b.a().a(context) * 1000000);
        int i5 = f23503x + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23501v = i5 % 128;
        int i6 = i5 % 2;
        return iA;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0020 A[PHI: r1 r2
  0x0020: PHI (r1v5 java.lang.Long) = (r1v2 java.lang.Long), (r1v6 java.lang.Long) binds: [B:22:0x003b, B:17:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0020: PHI (r2v2 long) = (r2v0 long), (r2v4 long) binds: [B:22:0x003b, B:17:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long g() {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.ea.b.f23501v
            int r1 = r0 + 97
            int r0 = r1 % 128
            o.ea.b.f23503x = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L2f
            long r2 = f()
            o.bt.e r0 = o.bt.e.c()
            java.lang.Long r1 = r0.d()
            r0 = 43
            int r0 = r0 / 0
            if (r1 == 0) goto L25
        L20:
            long r0 = r1.longValue()
            long r2 = r2 + r0
        L25:
            int r0 = o.ea.b.f23501v
            int r1 = r0 + 115
            int r0 = r1 % 128
            o.ea.b.f23503x = r0
            int r1 = r1 % r4
            return r2
        L2f:
            long r2 = f()
            o.bt.e r0 = o.bt.e.c()
            java.lang.Long r1 = r0.d()
            if (r1 == 0) goto L25
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.b.g():long");
    }

    static void h() {
        f23492m = 743719110;
        f23494o = 1150422417;
        f23490k = -655180451;
        f23491l = new byte[]{102, 118, 119, 112, -125, 123, MessagePack.Code.FIXSTR_PREFIX, 126, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, 119, -128, 120, -115, -126, 98, -106, 126, 118, 119, 112, -125, 123, MessagePack.Code.FIXSTR_PREFIX, 64, -100, -113, 98, 115, -116, -100, -84, -116, -122, -113, 115, -88, -87, 56, -123, 115, 112, -88, -82, 52, 116, -120, 123, -115, -121, -111, MessagePack.Code.FIXSTR_PREFIX, 126, -128, 58, -119, 117, -87, 88, -126, 115, 117, -119, 117, -87, -92, 52, 116, 114, 112, -106, -70, 126, -128, 58, -119, 117, -87, 88, -126, 115, -120, 126, -128, 33, -122, -113, 115, -88, -87, 56, -123, 115, 112, -88, -82, 49, 114, 124, 114, -120, -114, 115, -95, -82, 126, -128, 58, -119, 117, -87, 88, -126, 115, 113, -113, 118, -73, 70, 112, 117, MessagePack.Code.UINT16, 68, 126, -100, 103, -98, 127, -100, 116, -73, 71, 118, 119, 112, -125, 123, -128, 122, -114, 118, -98, 120, 122, -123, -91, 90, -110, 101, 116, -120, 118, -115, 116, -82, 82, -121, 127, 107, -105, 54, 117, -127, 126, MessagePack.Code.TRUE, 54, -113, 119, 126, -100, -116, -106, 114, 124, -113, -114, 114, -115, 118, -113, MessagePack.Code.MAP16, 33, -120, -116, MessagePack.Code.TRUE, 32, -121, MessagePack.Code.BIN8, 32, -116, -128, 122, -118, 115, -101, -66, 54, 116, 113, -118, 120, -123, 122, -91, MessagePack.Code.FIXSTR_PREFIX, 126, -128, 53, 120, -97, -108, 110, 126, 112, -116, -98, 126, -118, 115, -101, 110, -115, -94, 64, -126, 115, -105, -128, -114, 120, 117, -118, MessagePack.Code.TRUE, Utf8.REPLACEMENT_BYTE, 114, -117, 123, -116, -128, 98, MessagePack.Code.STR32, Base64.padSymbol, -115, -126, MessagePack.Code.UINT8, 33, -126, 115, MessagePack.Code.FLOAT32, 60, 118, MessagePack.Code.STR8, 54, 116, -121, -116, 126, -108, -72, 126, -128, 35, -128, -114, 120, 117, -86, 109, 114, -117, 123, -116, -128, -126, 107, -115, -94, 64, -126, 115, 126, 117, -119, 120, -123, -122, 113, -98, 99, 114, 127, -114, -126, 120, -118, 121, -123, 124, -116, 119, -85, -88, 74, 116, -128, 120, -77, 64, 102, -104, 122, 121, -116, 120, -95, 86, 120, -97, -108, 66, -120, -122, 120, -117, -124, -116, 118, -88, -116, -125, 114, 112, 118, -128, 121, MessagePack.Code.NIL, Utf8.REPLACEMENT_BYTE, -120, MessagePack.Code.BIN8, 49, 123, 116, -117, -124, MessagePack.Code.FLOAT64, 33, -120, -116, MessagePack.Code.TRUE, 32, MessagePack.Code.TRUE, -120, 50, 96, -98, 112, -114, 96, -126, 117, MessagePack.Code.NIL, 126, -128, 33, -116, -125, 114, 112, 118, -128, -103, 109, 115, 112, -95, 82, 116, -120, 122, 115, -84, 127, 96, -98, 112, -114, 96, -126, -107, 84, -126, 115, 97, -123, -113, 114, 122, 114, -122, 96};
        f23495p = (char) 61396;
        f23496q = (char) 52126;
        f23498s = (char) 44558;
        f23499t = (char) 8533;
    }

    public static boolean h(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23503x + 49;
        f23501v = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            y((short) (TextUtils.indexOf((CharSequence) "", '0') + 1), View.MeasureSpec.getMode(0) - 1757826357, 1671384945 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.rgb(0, 0, 0) + 16777187, (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            y((short) TextUtils.getTrimmedLength(""), (-1757826229) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.getSize(0) + 1671384985, Color.rgb(0, 0, 0) + 16777187, (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f23501v + 17;
            f23503x = i5 % 128;
            int i6 = i5 % 2;
        }
        return o.bp.e.a().a(context);
    }

    public static boolean i(Context context) throws Throwable {
        int i2 = 2 % 2;
        if (context != null) {
            int i3 = f23503x + 21;
            f23501v = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {FingerprintManager.class};
            Method method = Class.forName(Wg.Zd("}\tZ\u0007_uN\u0014gOjN[bD\u001a\rU24A2J", (short) (ZN.Xd() ^ OlympusCameraSettingsMakernoteDirectory.TagRollAngle), (short) (ZN.Xd() ^ 6208))).getMethod(Wg.vd("zy\ni\t\u0004\u0006w\to\u0003\u0011\u000e\u0002|\u007f", (short) (C1580rY.Xd() ^ (-1238))), Class.forName(C1561oA.Xd("3+A-z:0>8\u007f\u0016@6IJ", (short) (C1580rY.Xd() ^ (-11465)))));
            try {
                method.setAccessible(true);
                FingerprintManager fingerprintManager = (FingerprintManager) method.invoke(context, objArr);
                if (fingerprintManager != null && fingerprintManager.isHardwareDetected()) {
                    int i5 = f23501v + 17;
                    f23503x = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return false;
    }

    public static String[] i() {
        int i2 = 2 % 2;
        int i3 = f23501v + 71;
        f23503x = i3 % 128;
        int i4 = i3 % 2;
        String[] strArr = fr.antelop.sdk.e.f19456b;
        int i5 = f23503x + 47;
        f23501v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return strArr;
    }

    static void init$0() {
        $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
        $$b = 246;
    }

    public static String j() {
        int iMyPid = Process.myPid();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f23485f * (-1024127643);
        f23485f = i2;
        int i3 = f23487h * (-607832951);
        f23487h = i3;
        return (String) a(iElapsedRealtime, -545900019, iMyPid, new Object[0], i3, i2, 545900022);
    }

    public static boolean j(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23503x + 29;
        f23501v = i3 % 128;
        int i4 = i3 % 2;
        boolean zE = m.e(context);
        int i5 = f23501v + 51;
        f23503x = i5 % 128;
        int i6 = i5 % 2;
        return zE;
    }

    public static byte[] k(Context context) throws Throwable {
        String string;
        int i2 = 2 % 2;
        int i3 = f23501v + 35;
        f23503x = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT >= 32) {
            string = Build.MODEL;
        } else {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("2>3@<5/w,75:*27o\u0004/-2\"4/", (short) (FB.Xd() ^ 11595), (short) (FB.Xd() ^ 839))).getMethod(hg.Vd("vs\u0002Ozx}muzWivqmvdp", (short) (C1607wl.Xd() ^ 10453), (short) (C1607wl.Xd() ^ 29683)), new Class[0]);
            try {
                method.setAccessible(true);
                ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
                Object[] objArr2 = new Object[1];
                z(C1561oA.ud("壽殓䅴쉌䨆\uef4e갣푩霥哬䀼\ufaefब㑯", (short) (C1580rY.Xd() ^ (-17139))), 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                string = Settings.Secure.getString(contentResolver, ((String) objArr2[0]).intern());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            y((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-1757826357) + (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.resolveSize(0, 0) + 1671384945, TextUtils.lastIndexOf("", '0', 0, 0) - 28, (byte) (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = new Object[1];
            y((short) KeyEvent.keyCodeFromString(""), KeyEvent.keyCodeFromString("") - 1757826210, 1671384979 - TextUtils.indexOf((CharSequence) "", '0'), (-28) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr4);
            f.c(strIntern, sb.append(((String) objArr4[0]).intern()).append(string).toString());
        }
        if (string == null) {
            return null;
        }
        int i5 = f23501v + 73;
        f23503x = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArrD = o.eh.e.d(string);
        if (i6 != 0) {
            int i7 = 23 / 0;
        }
        int i8 = f23503x + 65;
        f23501v = i8 % 128;
        int i9 = i8 % 2;
        return bArrD;
    }

    public static long l(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23503x + 59;
        f23501v = i3 % 128;
        int i4 = i3 % 2;
        try {
            Class<?> cls = Class.forName(C1561oA.yd("bpcrtog2lyu|r|\u007f:T\u0002}\u0005z\u000f\b", (short) (C1633zX.Xd() ^ (-15095))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-25811));
            int[] iArr = new int["\u001f\u001e.\u000b\u001d ) '&\u000f$2&-,:".length()];
            QB qb = new QB("\u001f\u001e.\u000b\u001d ) '&\u000f$2&-,:");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i5));
                i5++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i5), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls2 = Class.forName(Xg.qd("O]Tca\\X#Yffm_ip+Annug{x", (short) (C1633zX.Xd() ^ (-20405)), (short) (C1633zX.Xd() ^ (-29456))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd2 = (short) (C1607wl.Xd() ^ 29049);
                short sXd3 = (short) (C1607wl.Xd() ^ 22711);
                int[] iArr2 = new int["Q\bZ8\u001c!k\u001e/o[9\u0014\u000b".length()];
                QB qb2 = new QB("Q\bZ8\u001c!k\u001e/o[9\u0014\u000b");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - ((i6 * sXd3) ^ sXd2));
                    i6++;
                }
                Method method2 = cls2.getMethod(new String(iArr2, 0, i6), clsArr2);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    Class<?> cls3 = Class.forName(ZO.xd("\f:\u0002eU5~Jk*Ol\u001dKBZrJ\u0017\u0015*j*{\r\u007f\u001eV,p\b\u0011=", (short) (C1633zX.Xd() ^ (-11556)), (short) (C1633zX.Xd() ^ (-14205))));
                    Class<?>[] clsArr3 = new Class[2];
                    clsArr3[0] = Class.forName(C1626yg.Ud("\u0017.o\u0003u!tD18re@h+:", (short) (ZN.Xd() ^ 9054), (short) (ZN.Xd() ^ 30445)));
                    clsArr3[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls3.getMethod(Ig.wd("\u001bE\u0001\u000fe\u0012@d#\u0004_p\u0019\u001e", (short) (C1607wl.Xd() ^ 6343)), clsArr3);
                    try {
                        method3.setAccessible(true);
                        return PackageInfoCompat.getLongVersionCode((PackageInfo) method3.invoke(packageManager, objArr3));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            if (f.a()) {
                Object[] objArr4 = new Object[1];
                y((short) Gravity.getAbsoluteGravity(0, 0), (-1757826358) + (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1671384944 - TextUtils.lastIndexOf("", '0', 0, 0), (-30) - TextUtils.lastIndexOf("", '0', 0), (byte) (KeyEvent.getMaxKeyCode() >> 16), objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                y((short) TextUtils.getTrimmedLength(""), KeyEvent.keyCodeFromString("") - 1757826141, 1671384983 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 30, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr5);
                f.e(strIntern, ((String) objArr5[0]).intern(), e5);
            }
            int i7 = f23501v + 23;
            f23503x = i7 % 128;
            int i8 = i7 % 2;
            return 0L;
        }
    }

    public static int m(Context context) {
        int priority = Thread.currentThread().getPriority();
        int iMyUid = Process.myUid();
        int i2 = f23481b * (-1773581773);
        f23481b = i2;
        return ((Integer) a(iMyUid, 1428818465, priority, new Object[]{context}, Thread.activeCount(), i2, -1428818463)).intValue();
    }

    public static int n(Context context) {
        int i2 = 2 % 2;
        int i3 = f23501v + 125;
        f23503x = i3 % 128;
        if (i3 % 2 != 0) {
            o.bp.a.b(context);
            throw null;
        }
        int iB = o.bp.a.b(context);
        int i4 = f23501v + 81;
        f23503x = i4 % 128;
        if (i4 % 2 == 0) {
            return iB;
        }
        throw null;
    }

    public static o.es.a o(Context context) {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        return (o.es.a) a((int) Runtime.getRuntime().freeMemory(), 2135872852, iElapsedRealtime, new Object[]{context}, Process.myUid(), Thread.activeCount(), -2135872847);
    }

    public static o.es.b p(Context context) {
        int i2 = 2 % 2;
        int i3 = f23503x + 89;
        f23501v = i3 % 128;
        int i4 = i3 % 2;
        fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.c.d();
        fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.a aVarE = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.a.e(context);
        int i5 = f23503x + 17;
        f23501v = i5 % 128;
        if (i5 % 2 != 0) {
            return aVarE;
        }
        throw null;
    }

    public static o.es.b q(Context context) {
        int i2 = 2 % 2;
        int i3 = f23503x + 59;
        f23501v = i3 % 128;
        int i4 = i3 % 2;
        fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.d dVarE = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.d.e(context);
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        int i6 = f23501v + 117;
        f23503x = i6 % 128;
        int i7 = i6 % 2;
        return dVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void y(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.b.y(short, int, int, int, byte, java.lang.Object[]):void");
    }

    private static void z(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 99;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i6 = $10 + 1;
            $11 = i6 % 128;
            int i7 = 58224;
            if (i6 % 2 == 0) {
                cArr3[1] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d];
            } else {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i7) ^ ((c3 << 4) + ((char) (((long) f23498s) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f23499t)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 269, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1995022631, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f23495p) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23496q)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(AndroidCharacter.getMirror('0') + 222, (char) View.resolveSize(0, 0), KeyEvent.keyCodeFromString("") + 11, -1995022631, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
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
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 3;
                byte b7 = (byte) (b6 - 3);
                objA3 = o.d.d.a(270 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2074123590, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2, 0, i2);
        int i9 = $11 + 15;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str3;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23503x + 73;
        f23501v = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        int i5 = f23501v + 83;
        f23503x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return zEquals;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23501v + 33;
        f23503x = i3 % 128;
        if (i3 % 2 != 0) {
            super.finalize();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.finalize();
        int i4 = f23501v + 41;
        f23503x = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String toString() {
        int i2 = f23484e * 1920444042;
        f23484e = i2;
        int iNextInt = new Random().nextInt(1982931028);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = 1135525414 * f23482c;
        f23482c = i3;
        return (String) a(iNextInt, 1044158135, i2, new Object[]{this}, i3, iMaxMemory, -1044158135);
    }
}
