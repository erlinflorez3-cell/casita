package c1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.ZipEntry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.Od;
import yg.Xg;

/* JADX INFO: loaded from: classes4.dex */
public final class slide extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final slide f2513a = new slide();

    public slide() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        ZipEntry zipEntry = (ZipEntry) obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("/'=)v??59{I9A\u007f-=E\u001bELKS", (short) (C1580rY.Xd() ^ (-30111)))).getMethod(C1561oA.Yd("\u0004\u0003\u0013m\u0002\u000f\b", (short) (Od.Xd() ^ (-19772))), new Class[0]);
        try {
            method.setAccessible(true);
            return Boolean.valueOf(Intrinsics.areEqual(StringsKt.substringAfterLast((String) method.invoke(zipEntry, objArr), '.', ""), Xg.qd("cey", (short) (C1633zX.Xd() ^ (-17948)), (short) (C1633zX.Xd() ^ (-26181)))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
