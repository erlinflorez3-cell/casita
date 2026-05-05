package w0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import yg.C1561oA;
import yg.OY;

/* JADX INFO: loaded from: classes2.dex */
public final class clean extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final clean f28376a = new clean();

    public clean() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Kd("6.D0}D76IG?KQ\u0007-@?RPD2BPGSR", (short) (OY.Xd() ^ 32415))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            return (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
