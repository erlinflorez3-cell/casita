package i1;

import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class muscle {
    public static String a(Application application) {
        Class<?> cls = Class.forName(C1561oA.Qd("\u001d)\u001e+' \u001ab\u0017\" %\u0015\u001d\"Zn\u001a\u0018\u001d\r\u001f\u001a", (short) (C1607wl.Xd() ^ 21402)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-32253));
        short sXd2 = (short) (Od.Xd() ^ (-13639));
        int[] iArr = new int["\u0016\u0015%t\"\")\u001b%,\u000b\u001f.+)4$2".length()];
        QB qb = new QB("\u0016\u0015%t\"\")\u001b%,\u000b\u001f.+)4$2");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            String string = Settings.Secure.getString((ContentResolver) method.invoke(application, objArr), C1561oA.od("`lanjc]W`Z", (short) (C1499aX.Xd() ^ (-2801))));
            return string == null ? "" : string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static List b(Application application) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-2798));
        int[] iArr = new int["R`Wfd_[&\\iipbls.Dqqxj~{".length()];
        QB qb = new QB("R`Wfd_[&\\iipbls.Dqqxj~{");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("09+\u001e\\8Xd2j\\:\u0005\fK\u001a;\\", (short) (C1580rY.Xd() ^ (-20918)), (short) (C1580rY.Xd() ^ (-5801))), new Class[0]);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(application, objArr);
            short sXd2 = (short) (C1633zX.Xd() ^ (-10278));
            int[] iArr2 = new int["\u0010\u001a\u000e\u0010\u001b\u0015\u0015\u0011!#)\u001f\u001d!\u001c\u001b/%,,\u001e,*57)3+9;".length()];
            QB qb2 = new QB("\u0010\u001a\u000e\u0010\u001b\u0015\u0015\u0011!#)\u001f\u001d!\u001c\u001b/%,,\u001e,*57)3+9;");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                i3++;
            }
            String string = Settings.Secure.getString(contentResolver, new String(iArr2, 0, i3));
            if (string == null) {
                string = "";
            }
            return StringsKt.split$default((CharSequence) string, new String[]{Wg.vd("D", (short) (FB.Xd() ^ 23487))}, false, 0, 6, (Object) null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
