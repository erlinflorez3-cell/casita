package com.google.android.play.integrity.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
final class x extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f3494a;

    x(ae aeVar) {
        this.f3494a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f3494a.f3468g) {
            if (this.f3494a.f3474m.get() > 0 && this.f3494a.f3474m.decrementAndGet() > 0) {
                this.f3494a.f3464c.d(Ig.wd("\u0007ZB6n6Q 9\u0010\r';;\u0005$Vp'\u0012]\u0012c-cb\u0007gj~4\u0003x\u0019Lx3zI</\\(\u0019\u00060L%\u007f]J(", (short) (Od.Xd() ^ (-28569))), new Object[0]);
                return;
            }
            ae aeVar = this.f3494a;
            if (aeVar.f3476o != null) {
                aeVar.f3464c.d(EO.Od("\u000e\u0002w\u001f{\u00165d#D3MpVA-eS\u001f\u0002", (short) (OY.Xd() ^ 15123)), new Object[0]);
                ae aeVar2 = this.f3494a;
                Context context = aeVar2.f3463b;
                Object[] objArr = {aeVar2.f3475n};
                Method method = Class.forName(C1561oA.Qd("\u0004\u0010\u0005\u0012\u000e\u0007\u0001I}\t\u0007\f{\u0004\tAU\u0001~\u0004s\u0006\u0001", (short) (C1633zX.Xd() ^ (-6019)))).getMethod(C1561oA.od("yqdjncQbnqc\\]", (short) (ZN.Xd() ^ 24268)), Class.forName(C1593ug.zd(")7.=;62|3@@G9CJ\u0005+>LQE@C\"OOPHGYOVV", (short) (C1633zX.Xd() ^ (-32264)), (short) (C1633zX.Xd() ^ (-28803)))));
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    this.f3494a.f3469h = false;
                    this.f3494a.f3476o = null;
                    this.f3494a.f3475n = null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            this.f3494a.x();
        }
    }
}
