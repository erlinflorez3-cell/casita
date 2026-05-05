package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: SnapshotLongState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Upw-#\t\u0001`-&2Ocq3i]{\"/q\n\u0018u%XSJ(\"+S;x@@\u0010`^['\b%\u0017O!\rByl\u0014o=A2U[0,}#\u0002i_k"}, d2 = {}, k = 4, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, KProperty<?> kProperty) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, kProperty);
    }

    public static final MutableLongState mutableLongStateOf(long j2) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j2);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, KProperty<?> kProperty, long j2) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, kProperty, j2);
    }
}
