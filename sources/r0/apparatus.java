package r0;

import android.app.Application;
import i1.close;
import i1.muscle;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus {

    /* JADX INFO: renamed from: a */
    public final String f28259a;

    /* JADX INFO: renamed from: b */
    public final superior f28260b;

    /* JADX INFO: renamed from: c */
    public String f28261c;

    /* JADX INFO: renamed from: d */
    public String f28262d;

    /* JADX INFO: renamed from: e */
    public String f28263e;

    /* JADX INFO: renamed from: f */
    public final String f28264f;

    /* JADX INFO: renamed from: g */
    public final String f28265g;

    public apparatus(Application application, civilian civilianVar) {
        superior superiorVar = new PropertyReference0Impl() { // from class: r0.superior
            public superior() {
                close closeVar = close.f19714a;
            }

            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                ((close) this.receiver).getClass();
                return close.a();
            }
        };
        String strA = muscle.a(application);
        tongue tongueVar = new tongue();
        this.f28259a = strA;
        this.f28260b = superiorVar;
        this.f28261c = "";
        this.f28262d = "";
        this.f28263e = "";
        this.f28264f = civilianVar.a();
        this.f28265g = (String) tongueVar.invoke(strA);
    }
}
