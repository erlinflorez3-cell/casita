package i1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class apparatus extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final apparatus f19712a = new apparatus();

    public apparatus() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Object[] objArr = {(byte[]) obj, 0};
        Method declaredMethod = Class.forName(Jg.Wd("0\u001amX\u0013iBh.\u000b\\=;-)!\u0011>\u001a", (short) (FB.Xd() ^ 21217), (short) (FB.Xd() ^ 2839))).getDeclaredMethod(ZO.xd("'\u00169\u000ew2\u0016,It.>Q4", (short) (C1607wl.Xd() ^ 5224), (short) (C1607wl.Xd() ^ 175)), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
