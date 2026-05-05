package x0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import yg.C1607wl;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public final class superior extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final superior f28455a = new superior();

    public superior() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM8980constructorimpl;
        byte[] bArr = (byte[]) obj;
        try {
            Result.Companion companion = Result.Companion;
            Class<?> cls = Class.forName(Wg.Zd("|\u0003k\u0013\u001b\u000e\u001cxUCUg\u001daw\u0003 hz", (short) (ZN.Xd() ^ 10178), (short) (ZN.Xd() ^ 3541)));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE};
            Object[] objArr = {bArr, 0};
            short sXd = (short) (C1607wl.Xd() ^ 17766);
            int[] iArr = new int["OQP]SU".length()];
            QB qb = new QB("OQP]SU");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                objM8980constructorimpl = Result.m8980constructorimpl((byte[]) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m8979boximpl(objM8980constructorimpl);
    }
}
