package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class u30 implements ReadWriteProperty {

    /* JADX INFO: renamed from: a */
    public Object f1909a;

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object thisRef, KProperty property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f1909a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object thisRef, KProperty property, Object obj) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj2 = this.f1909a;
        if (obj2 == null) {
            this.f1909a = obj;
        } else {
            if (Intrinsics.areEqual(obj2, obj)) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new t30(obj, property), 7, (Object) null);
        }
    }
}
