package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: SnapshotDoubleState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Upw-#\t\u0001`-&2Ocq3i]{\"/q\n\u0018u%XSJ(\"+S;p@G\u000byOM'\u0004N\b;6\u00193kj\u0002wA5UZ18Nk.rW\tX]\u0010\u0013H"}, d2 = {}, k = 4, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, KProperty<?> kProperty) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue(doubleState, obj, kProperty);
    }

    public static final MutableDoubleState mutableDoubleStateOf(double d2) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(d2);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, KProperty<?> kProperty, double d2) {
        SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue(mutableDoubleState, obj, kProperty, d2);
    }
}
