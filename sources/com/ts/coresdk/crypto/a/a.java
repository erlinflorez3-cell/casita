package com.ts.coresdk.crypto.a;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<Params, Result> {
    public static final ExecutorService bi = Executors.newCachedThreadPool();
    private static final Handler bj;
    private EnumC0318a bk = EnumC0318a.Idle;

    /* JADX INFO: renamed from: com.ts.coresdk.crypto.a.a$a, reason: collision with other inner class name */
    enum EnumC0318a {
        Idle,
        Busy,
        Done
    }

    static {
        short sXd = (short) (C1633zX.Xd() ^ (-13109));
        int[] iArr = new int["\u0011\u001f\u0016%#\u001e\u001ad',g\u0007+,.$2".length()];
        QB qb = new QB("\u0011\u001f\u0016%#\u001e\u001ad',g\u0007+,.$2");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Wg.vd("li{SbiqN|{\u007fs{", (short) (C1607wl.Xd() ^ 27808)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            bj = new Handler((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected abstract Result a(Params... paramsArr);

    protected void a(Result result) {
    }

    public final synchronized void b(final Params... paramsArr) {
        if (this.bk != EnumC0318a.Idle) {
            throw new IllegalStateException("Task is busy or done");
        }
        this.bk = EnumC0318a.Busy;
        g();
        bi.execute(new Runnable() { // from class: com.ts.coresdk.crypto.a.a.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                final Object objA = a.this.a(paramsArr);
                Handler handler = a.bj;
                Object[] objArr = {new Runnable() { // from class: com.ts.coresdk.crypto.a.a.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(objA);
                        a.this.bk = EnumC0318a.Done;
                    }
                }};
                Method method = Class.forName(C1561oA.ud("XdYfb[U\u001e^a\u001b4LXMTLX", (short) (C1580rY.Xd() ^ (-13915)))).getMethod(C1561oA.Yd("[[`b", (short) (C1499aX.Xd() ^ (-2188))), Class.forName(C1561oA.yd("KCUA\u000bJ<J@\b)MCD46]W", (short) (OY.Xd() ^ 16422))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        });
    }

    protected void g() {
    }
}
