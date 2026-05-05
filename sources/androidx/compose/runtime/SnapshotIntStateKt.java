package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: SnapshotIntState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Upw-#\t\u0001`-&2Ocq3i]{\"/q\n\u0018u%XSJ(\"+S;u?F{\u0002Kn\u0018mN\u0002O\u0015(5\to\tvB\u0016TZ@=:}'Xx"}, d2 = {}, k = 4, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, KProperty<?> kProperty) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, kProperty);
    }

    public static final MutableIntState mutableIntStateOf(int i2) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i2);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, KProperty<?> kProperty, int i2) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, kProperty, i2);
    }
}
