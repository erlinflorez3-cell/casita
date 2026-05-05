package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Upw-#\t\u0001`-&2Ocq3i]{\"/q\n\u0018u%XSJ(\"+S;\u007fE3\u001dr5n\u0012\u0002\u001e\bb+09|O\u0015hB21Z", "Upw-#\t\u0001`-&2Ocq3i]{\"/q\n\u0018u%XSJ(\"+S;\u007fE3\u001dr5n\u0012\u0002*\u0015_&/7}O\u0015hB21Z", "Upw-#\t\u0001`-&2Ocq3i]{\"/q\n\u0018u%XSJ(\"+S;\u007fE3\u001dr5n\u0012\u0002-\u0011Q2-<\bpfs=D1Z", "Upw-#\t\u0001`-&2Ocq3i]{\"/q\n\u0018u%XSJ(\"+S;\u007fE3\u001dr5n\u0012\u0002-\u0011Q2-<\bpm|B.ZO\\7)x.vg\u000eB]", "Upw-#\t\u0001`-&2Ocq3i]{\"/q\n\u0018u%XSJ(\"+S;\u007fE3\u001dr5n\u0012\u0002-\u0011Q2-<\bps{/AK1a"}, d2 = {}, k = 4, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapshotStateKt {
    public static final <T extends R, R> State<R> collectAsState(Flow<? extends T> flow, R r2, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(flow, r2, coroutineContext, composer, i2, i3);
    }

    public static final <T> State<T> collectAsState(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(stateFlow, coroutineContext, composer, i2, i3);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0<? extends T> function0) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, function0);
    }

    public static final <T> State<T> derivedStateOf(Function0<? extends T> function0) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(function0);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, KProperty<?> kProperty) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, kProperty);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(Pair<? extends K, ? extends V>... pairArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(pairArr);
    }

    public static final <T> MutableState<T> mutableStateOf(T t2, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t2, snapshotMutationPolicy);
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, Function0<? extends R> function0) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, function0);
    }

    public static final <T> State<T> produceState(T t2, Object obj, Object obj2, Object obj3, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t2, obj, obj2, obj3, function2, composer, i2);
    }

    public static final <T> State<T> produceState(T t2, Object obj, Object obj2, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t2, obj, obj2, function2, composer, i2);
    }

    public static final <T> State<T> produceState(T t2, Object obj, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t2, obj, function2, composer, i2);
    }

    public static final <T> State<T> produceState(T t2, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t2, function2, composer, i2);
    }

    public static final <T> State<T> produceState(T t2, Object[] objArr, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t2, objArr, (Function2) function2, composer, i2);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    public static final <T> State<T> rememberUpdatedState(T t2, Composer composer, int i2) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t2, composer, i2);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, KProperty<?> kProperty, T t2) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, kProperty, t2);
    }

    public static final <T> Flow<T> snapshotFlow(Function0<? extends T> function0) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(function0);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }
}
