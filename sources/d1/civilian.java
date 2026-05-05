package d1;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.dynatrace.android.agent.AdkSettings;
import i1.muscle;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import y0.mile;
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

/* JADX INFO: loaded from: classes5.dex */
public final class civilian {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f18428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1.misplace f18429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final misplace f18430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final superior f18431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f18432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f18433f;

    public civilian(Application application, i1.misplace misplaceVar, misplace misplaceVar2) {
        superior superiorVar = new superior(application);
        tongue tongueVar = tongue.f18440a;
        apparatus apparatusVar = apparatus.f18427a;
        this.f18428a = application;
        this.f18429b = misplaceVar;
        this.f18430c = misplaceVar2;
        this.f18431d = superiorVar;
        this.f18432e = tongueVar;
        this.f18433f = apparatusVar;
    }

    public final void a() {
        Object obj;
        String string;
        byte[] bArrA;
        String strXd = C1561oA.Xd("(mc]occ_qthjx5Jtnkq\u0006;\u0007||", (short) (C1580rY.Xd() ^ (-18125)));
        short sXd = (short) (ZN.Xd() ^ 17448);
        int[] iArr = new int["s\u001c\u0014\u000f\u0013%".length()];
        QB qb = new QB("s\u001c\u0014\u000f\u0013%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Application application = this.f18428a;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("[g\\ie^X!U`^cS[`\u0019-XV[K]X", (short) (Od.Xd() ^ (-21916)), (short) (Od.Xd() ^ (-32597)))).getMethod(hg.Vd("\u0004\u0001\u000fZ\t\b\u0003~wt\u0007z\u007f}W{rz", (short) (OY.Xd() ^ 29000), (short) (OY.Xd() ^ 31884)), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(application, objArr);
                String strUd = C1561oA.ud("frgtpic,`kin^fk$ea!3a`[WPM_SXV0TKS", (short) (C1633zX.Xd() ^ (-11985)));
                String strYd = C1561oA.yd("QMcO-Q]", (short) (C1633zX.Xd() ^ (-28642)));
                try {
                    Class<?> cls = Class.forName(strUd);
                    Field field = 1 != 0 ? cls.getField(strYd) : cls.getDeclaredField(strYd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                File file = new File(((String) obj) + strXd);
                if (((Boolean) this.f18432e.invoke(file)).booleanValue()) {
                    Application application2 = this.f18428a;
                    Class<?> cls2 = Class.forName(C1561oA.Yd("\f\u001a\u0011 \u001e\u0019\u0015_\u0016##*\u001c&-g}++2$85", (short) (ZN.Xd() ^ 1898)));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(Xg.qd("B:P<\nI?MG\u000f5WVNTN", (short) (C1499aX.Xd() ^ (-17591)), (short) (C1499aX.Xd() ^ (-27504))));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr2 = {str, 0};
                    Method method2 = cls2.getMethod(Jg.Wd("\u0002h\u007fJWXUQK I)\")B=B )$", (short) (OY.Xd() ^ 28449), (short) (OY.Xd() ^ 14450)), clsArr);
                    try {
                        method2.setAccessible(true);
                        SharedPreferences sharedPreferences = (SharedPreferences) method2.invoke(application2, objArr2);
                        mile mileVar = null;
                        String string2 = sharedPreferences.getString(ZO.xd("GCi8mQS0E", (short) (C1607wl.Xd() ^ 21029), (short) (C1607wl.Xd() ^ 7022)), null);
                        if (string2 != null && (string = sharedPreferences.getString(C1626yg.Ud(".@\u0005x0SE\u001b\tz@!", (short) (FB.Xd() ^ 3511), (short) (FB.Xd() ^ 21985)), muscle.a(this.f18431d.f18438a))) != null) {
                            i1.misplace misplaceVar = this.f18429b;
                            misplaceVar.getClass();
                            try {
                                bArrA = misplaceVar.a(string, 2, (byte[]) misplaceVar.f19720d.invoke(string2));
                            } catch (Exception unused) {
                                bArrA = null;
                            }
                            if (bArrA != null) {
                                mileVar = (mile) this.f18433f.invoke(bArrA);
                            }
                        }
                        if (mileVar != null) {
                            a(mileVar);
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.clear();
                        editorEdit.commit();
                        if (!i1.pair.c()) {
                            file.delete();
                            return;
                        }
                        Application application3 = this.f18428a;
                        Class<?> cls3 = Class.forName(Ig.wd("\\\u00139i-QrjXSN<ab\u0007%\\\u001dR2K5!", (short) (C1607wl.Xd() ^ 15558)));
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[0] = Class.forName(EO.Od("b1\bSx[t*U\u0001{C\u0010x\u000e-", (short) (ZN.Xd() ^ 29979)));
                        Object[] objArr3 = {str};
                        Method method3 = cls3.getMethod(C1561oA.Qd("__e]k[H\\TdVT?`RRP\\NVJKX", (short) (Od.Xd() ^ (-12170))), clsArr2);
                        try {
                            method3.setAccessible(true);
                            method3.invoke(application3, objArr3);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Throwable unused2) {
        }
    }

    public final void a(mile mileVar) {
        String strA = mileVar.a();
        boolean zA = mileVar.b().a();
        if (strA != null) {
            this.f18430c.a("browser_id", strA);
        }
        this.f18430c.a("is_enabled", zA ? "1" : AdkSettings.PLATFORM_TYPE_MOBILE);
    }

    public final void b() {
        Object obj;
        byte[] bArrA;
        String strZd = C1593ug.zd("?ID^AHGQX", (short) (Od.Xd() ^ (-17368)), (short) (Od.Xd() ^ (-16041)));
        try {
            Application application = this.f18428a;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("YeZgc\\V\u001fS^\\aQY^\u0017+VTYI[V", (short) (C1499aX.Xd() ^ (-25965)))).getMethod(C1561oA.Kd("XWgDVYbY`_I]jc", (short) (FB.Xd() ^ 32676)), new Class[0]);
            try {
                method.setAccessible(true);
                String str = ((String) method.invoke(application, objArr)) + Wg.Zd("v\t7*X\u0018\u0012F{p /", (short) (ZN.Xd() ^ 11569), (short) (ZN.Xd() ^ 9445));
                Application application2 = this.f18428a;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Xd("3A8GE@<\u0007=JJQCMT\u000f%RRYK_\\", (short) (OY.Xd() ^ 10489))).getMethod(Wg.vd("\n\t\u0015b\u000f\u0010\t\u0007}|\r\u0003\u0006\u0006]\u0004x\u0003", (short) (OY.Xd() ^ 9961)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(application2, objArr2);
                    String strKd = Qg.kd("=I>KG@:\u00037B@E5=Bz<8w\n872.'$6*/-\u0007+\"*", (short) (C1499aX.Xd() ^ (-5470)), (short) (C1499aX.Xd() ^ (-11110)));
                    String strVd = hg.Vd("zv\ttVz\u0003", (short) (C1499aX.Xd() ^ (-5505)), (short) (C1499aX.Xd() ^ (-17983)));
                    try {
                        Class<?> cls = Class.forName(strKd);
                        Field field = 1 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                        field.setAccessible(true);
                        obj = field.get(applicationInfo);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    StringBuilder sbAppend = new StringBuilder().append((String) obj).append(C1561oA.ud("'j^VfXVP`aSS_\u001a", (short) (Od.Xd() ^ (-10056)))).append(str);
                    short sXd = (short) (ZN.Xd() ^ 8580);
                    int[] iArr = new int["a-##".length()];
                    QB qb = new QB("a-##");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                        i2++;
                    }
                    if (((Boolean) this.f18432e.invoke(new File(sbAppend.append(new String(iArr, 0, i2)).toString()))).booleanValue()) {
                        Application application3 = this.f18428a;
                        Class<?> cls2 = Class.forName(C1561oA.Yd("LZQ`^YU Vccj\\fm(>kkrdxu", (short) (C1499aX.Xd() ^ (-3252))));
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = Class.forName(Xg.qd("JBXD\u0012QGUO\u0017=_^V\\V", (short) (FB.Xd() ^ 21848), (short) (FB.Xd() ^ 30817)));
                        clsArr[1] = Integer.TYPE;
                        Object[] objArr3 = {str, 0};
                        Method method3 = cls2.getMethod(Jg.Wd("\u0014?cGrj\u0011\u001a\u001e\u0019AI_]\u0001x\u0017<Cf", (short) (Od.Xd() ^ (-30682)), (short) (Od.Xd() ^ (-566))), clsArr);
                        try {
                            method3.setAccessible(true);
                            SharedPreferences sharedPreferences = (SharedPreferences) method3.invoke(application3, objArr3);
                            mile mileVar = null;
                            String string = sharedPreferences.getString(strZd, null);
                            if (string != null) {
                                short sXd2 = (short) (C1499aX.Xd() ^ (-8826));
                                short sXd3 = (short) (C1499aX.Xd() ^ (-16009));
                                int[] iArr2 = new int["9[\u0005H_[Wsi\\?Y".length()];
                                QB qb2 = new QB("9[\u0005H_[Wsi\\?Y");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                                    i3++;
                                }
                                String string2 = sharedPreferences.getString(new String(iArr2, 0, i3), muscle.a(this.f18431d.f18438a));
                                if (string2 != null) {
                                    i1.misplace misplaceVar = this.f18429b;
                                    misplaceVar.getClass();
                                    try {
                                        bArrA = misplaceVar.a(string2, 2, (byte[]) misplaceVar.f19720d.invoke(string));
                                    } catch (Exception unused) {
                                        bArrA = null;
                                    }
                                    if (bArrA != null) {
                                        mileVar = (mile) this.f18433f.invoke(bArrA);
                                    }
                                }
                            }
                            if (mileVar != null) {
                                a(mileVar);
                            }
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.remove(strZd);
                            editorEdit.commit();
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Throwable unused2) {
        }
    }
}
