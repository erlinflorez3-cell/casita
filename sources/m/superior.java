package m;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import androidx.core.content.ContextCompat;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import d0.tongue;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
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
public final class superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f19864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleafyConfiguration f19865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19867d = "";

    public superior(Application application, CleafyConfiguration cleafyConfiguration, boolean z2) {
        this.f19864a = application;
        this.f19865b = cleafyConfiguration;
        this.f19866c = z2;
    }

    public final tongue a(k0.pair pairVar) {
        String string;
        String str = Build.MODEL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = Build.VERSION.RELEASE;
        int i2 = Build.VERSION.SDK_INT;
        boolean zA = h1.pair.a(this.f19864a, i2 >= 31 ? Wg.Zd("uD36,\f\u0014B='.*\u000f\u000e\u00073&*Rk_Y\u0012\u0006yoqZj3\nyb^E\\", (short) (C1580rY.Xd() ^ (-1753)), (short) (C1580rY.Xd() ^ (-18900))) : C1561oA.Xd("gul{ytp;~t\u0003~{\u0007\b~\u0006\u0006F[fpaqmnti", (short) (OY.Xd() ^ 31605)));
        BluetoothManager bluetoothManager = (BluetoothManager) ContextCompat.getSystemService(this.f19864a, BluetoothManager.class);
        BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        String name = (adapter == null || !zA) ? "" : adapter.getName();
        Application application = this.f19864a;
        short sXd = (short) (ZN.Xd() ^ 19472);
        int[] iArr = new int["\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fWk\u0017\u0015\u001a\n\u001c\u0017".length()];
        QB qb = new QB("\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fWk\u0017\u0015\u001a\n\u001c\u0017");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Qg.kd("OLZ(SQVFNS0BOJFO=I", (short) (OY.Xd() ^ 5248), (short) (OY.Xd() ^ 17176)), new Class[0]);
        try {
            method.setAccessible(true);
            String string2 = Settings.Secure.getString((ContentResolver) method.invoke(application, objArr), hg.Vd("\u000e\u001a\u000f\u001c\u0018\u0011\u000b\u0005\u000e\b", (short) (FB.Xd() ^ 6599), (short) (FB.Xd() ^ 19611)));
            if (string2 == null) {
                string2 = "";
            }
            String str4 = Build.MANUFACTURER;
            String str5 = str4 == null ? "" : str4;
            if (this.f19866c && i2 < 29) {
                try {
                    str2 = Build.SERIAL;
                } catch (SecurityException unused) {
                }
            }
            String strYd = Intrinsics.areEqual(str4, C1561oA.ud("\u001bF9QEC", (short) (C1607wl.Xd() ^ 28146))) ? C1561oA.yd("\u0015 \u0013+'%b\u001b\u0015\u001d\u000f\u0018#", (short) (C1580rY.Xd() ^ (-26454))) : C1561oA.Yd(")WN][VR", (short) (OY.Xd() ^ 26100));
            if (Intrinsics.areEqual(pairVar.f19829a, this.f19867d)) {
                string = Xg.qd("KN", (short) (C1633zX.Xd() ^ (-27882)), (short) (C1633zX.Xd() ^ (-8870)));
            } else {
                this.f19867d = pairVar.f19829a;
                CleafyConfiguration cleafyConfiguration = this.f19865b;
                a1.tongue tongueVar = a1.tongue.f92a;
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                try {
                    tongueVar.a(cleafyConfiguration, jsonWriter);
                    string = stringWriter.toString();
                    CloseableKt.closeFinally(jsonWriter, null);
                } finally {
                }
            }
            Application application2 = this.f19864a;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("v\u001d,c\u0018+O23Xp\u001eHj\u001a\u0007E\u000b#pz'N", (short) (OY.Xd() ^ 20079), (short) (OY.Xd() ^ 2763))).getMethod(ZO.xd("S\u0015Vp!z\u0003WA^e+p&'\u0012Z0", (short) (FB.Xd() ^ OlympusCameraSettingsMakernoteDirectory.TagPictureModeBWFilter), (short) (FB.Xd() ^ 24703)), new Class[0]);
            try {
                method2.setAccessible(true);
                return new tongue(str, name, string2, str5, str2, strYd, string, Settings.Global.getInt((ContentResolver) method2.invoke(application2, objArr2), C1626yg.Ud("in\u0016{+ )\u0015hPk5\u0013\u001fW\u0018V<}\t\u0012%O#~1j\b", (short) (Od.Xd() ^ (-2143)), (short) (Od.Xd() ^ (-31276))), 0) != 0);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
