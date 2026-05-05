package s;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class misplace {

    /* JADX INFO: renamed from: a */
    public static final misplace f28282a = new misplace();

    /* JADX INFO: renamed from: b */
    public static Class f28283b = null;

    /* JADX INFO: renamed from: c */
    public static Method f28284c = null;

    public static String a() {
        try {
            String strB = b();
            NetworkInterface byName = NetworkInterface.getByName(strB);
            if (byName == null) {
                throw new civilian("Unable to find interface '" + strB + "'");
            }
            byte[] hardwareAddress = byName.getHardwareAddress();
            if (hardwareAddress != null) {
                return ArraysKt.joinToString$default(hardwareAddress, (CharSequence) Global.COLON, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) taste.f28287a, 30, (Object) null);
            }
            throw new civilian("Interface '" + byName.getName() + "' do not have an hardware address");
        } catch (Throwable th) {
            String str = "Unable to get MAC address. Exception: " + th;
            return "02:00:00:00:00:00";
        }
    }

    public static String b() {
        try {
            Class<?> cls = f28283b;
            if (cls == null) {
                cls = Class.forName("android.os.SystemProperties");
            }
            f28283b = cls;
            Method method = f28284c;
            if (method == null) {
                method = cls.getMethod("get", String.class);
            }
            f28284c = method;
            Object objInvoke = method != null ? method.invoke(f28283b, "wifi.interface") : null;
            String str = objInvoke instanceof String ? (String) objInvoke : null;
            return str == null ? "" : str;
        } catch (Throwable unused) {
            return "wlan0";
        }
    }
}
