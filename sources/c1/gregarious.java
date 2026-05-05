package c1;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class gregarious extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ skate f2497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZipFile f2498b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gregarious(skate skateVar, ZipFile zipFile) {
        super(1);
        this.f2497a = skateVar;
        this.f2498b = zipFile;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM8980constructorimpl;
        String strSubstring;
        ZipEntry zipEntry = (ZipEntry) obj;
        skate skateVar = this.f2497a;
        ZipFile zipFile = this.f2498b;
        skateVar.getClass();
        try {
            Result.Companion companion = Result.Companion;
            y0.gregarious gregariousVarA = y0.fabricate.a();
            Class<?> cls = Class.forName(C1626yg.Ud(":\u00069Wjb(\u000e5gNS\u0015Ih3]h]Sz\u0005", (short) (C1499aX.Xd() ^ (-11247)), (short) (C1499aX.Xd() ^ (-28109))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-29290));
            int[] iArr = new int["^/PA,k7".length()];
            QB qb = new QB("^/PA,k7");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) method.invoke(zipEntry, objArr), File.pathSeparator, 0, false, 6, (Object) null);
                if (iLastIndexOf$default >= 0) {
                    Class<?> cls2 = Class.forName(EO.Od("\u000f=\u0003\u0007N[H~Y(x\u0004V\f:d\u0019\u0006hh\u001eZ", (short) (Od.Xd() ^ (-1721))));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd2 = (short) (ZN.Xd() ^ 1098);
                    int[] iArr2 = new int["VSa:LWN".length()];
                    QB qb2 = new QB("VSa:LWN");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                    try {
                        method2.setAccessible(true);
                        strSubstring = ((String) method2.invoke(zipEntry, objArr2)).substring(iLastIndexOf$default + 1);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    short sXd3 = (short) (C1580rY.Xd() ^ (-10961));
                    short sXd4 = (short) (C1580rY.Xd() ^ (-5753));
                    int[] iArr3 = new int["\"\u001a0\u001ci22(,n<,4r 08\u000e8?>F".length()];
                    QB qb3 = new QB("\"\u001a0\u001ci22(,n<,4r 08\u000e8?>F");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
                        i4++;
                    }
                    Class<?> cls3 = Class.forName(new String(iArr3, 0, i4));
                    Object[] objArr3 = new Object[0];
                    Method method3 = cls3.getMethod(C1561oA.od("FCQ*<G>", (short) (FB.Xd() ^ 1615)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        strSubstring = (String) method3.invoke(zipEntry, objArr3);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                int iLastIndexOf$default2 = StringsKt.lastIndexOf$default((CharSequence) strSubstring, C1561oA.Kd("\t", (short) (Od.Xd() ^ (-11659))), 0, false, 6, (Object) null);
                if (iLastIndexOf$default2 > 0 && iLastIndexOf$default2 + 2 < strSubstring.length()) {
                    strSubstring = strSubstring.substring(0, iLastIndexOf$default2);
                }
                y0.gregarious gregariousVarB = gregariousVarA.b(strSubstring);
                Class<?> cls4 = Class.forName(Wg.Zd("T\u0018G\u001fJ^7XrngV*b;\u0001\"$&uI", (short) (ZN.Xd() ^ 27546), (short) (ZN.Xd() ^ 14520)));
                Class<?>[] clsArr3 = new Class[1];
                clsArr3[0] = Class.forName(C1561oA.Xd("\u0019\u0011'\u0013`))\u001f#e3#+i\u0017'/\u0005/65=", (short) (C1607wl.Xd() ^ 15755)));
                Object[] objArr4 = {zipEntry};
                Method method4 = cls4.getMethod(Wg.vd("\u000b\n\u001ao\u000e\u0011\u0017\u0017n\u0011\u0010\u0004x\u0006", (short) (ZN.Xd() ^ 25299)), clsArr3);
                try {
                    method4.setAccessible(true);
                    InputStream inputStream = (InputStream) method4.invoke(zipFile, objArr4);
                    try {
                        String str = (String) skateVar.f2511e.invoke(inputStream);
                        CloseableKt.closeFinally(inputStream, null);
                        objM8980constructorimpl = Result.m8980constructorimpl((y0.fabricate) gregariousVarB.a(str).build());
                    } finally {
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        return (y0.fabricate) (Result.m8986isFailureimpl(objM8980constructorimpl) ? null : objM8980constructorimpl);
    }
}
