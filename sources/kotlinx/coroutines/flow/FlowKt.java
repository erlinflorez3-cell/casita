package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\t\":>\rr\\m}\u0017", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\n\u00152@\u0017rVm}\u0017", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\n\u001c=>\u000ep^E'", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\n\u001c=>\u000ep^c\"\u0011%\u0017", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\n\u001c?F\u000e\u0006^E'", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\n\u001cF@\u001dX^", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\u000b\u0012=3\"X^", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\u000b\u0016DF\u0012{Mn}\u0017", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\f\u001a:F\u001dr\\m}\u0017", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\f\u001fCA\u001b\u00015n", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\u0013\u0016>;\u001dX^", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\u0014\u0012C9\u000eX^", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\u0014\u00168D\n\u0002Si!mN", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\u0019\u00125G\fr5n", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\u001a\u00152D\u000eX^", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C\u001b\u001f2@\u001csYl mN", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|['i\u0010\"?<qT`\u0003#\"C!\u0016A\u001d\u001d"}, d2 = {}, k = 4, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class FlowKt {
    public static final String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.asFlow(iterable);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it) {
        return FlowKt__BuildersKt.asFlow(it);
    }

    public static final <T> Flow<T> asFlow(Function0<? extends T> function0) {
        return FlowKt__BuildersKt.asFlow(function0);
    }

    public static final <T> Flow<T> asFlow(Function1<? super Continuation<? super T>, ? extends Object> function1) {
        return FlowKt__BuildersKt.asFlow(function1);
    }

    public static final Flow<Integer> asFlow(IntRange intRange) {
        return FlowKt__BuildersKt.asFlow(intRange);
    }

    public static final Flow<Long> asFlow(LongRange longRange) {
        return FlowKt__BuildersKt.asFlow(longRange);
    }

    public static final <T> Flow<T> asFlow(Sequence<? extends T> sequence) {
        return FlowKt__BuildersKt.asFlow(sequence);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return FlowKt__BuildersKt.asFlow(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return FlowKt__BuildersKt.asFlow(jArr);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return FlowKt__BuildersKt.asFlow(tArr);
    }

    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> mutableSharedFlow) {
        return FlowKt__ShareKt.asSharedFlow(mutableSharedFlow);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> mutableStateFlow) {
        return FlowKt__ShareKt.asStateFlow(mutableStateFlow);
    }

    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i2, BufferOverflow bufferOverflow) {
        return FlowKt__ContextKt.buffer(flow, i2, bufferOverflow);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\f(\bp\u0011\u001a?\r.sa4jypMvG6j/x]'GBQkZ\u0006+eQOjBs$\u0011W E465\u0010vK6J0L\u0010\u0010b&GX\b\u0003G{S768F\u0004<e0s\u007fma#^\u00192\u0018aT\fKY'-$LK,", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.cache(flow);
    }

    public static final <T> Flow<T> callbackFlow(Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.callbackFlow(function2);
    }

    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return FlowKt__ContextKt.cancellable(flow);
    }

    /* JADX INFO: renamed from: catch */
    public static final <T> Flow<T> m10520catch(Flow<? extends T> flow, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__ErrorsKt.m10533catch(flow, function3);
    }

    public static final <T> Object catchImpl(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, Continuation<? super Throwable> continuation) {
        return FlowKt__ErrorsKt.catchImpl(flow, flowCollector, continuation);
    }

    public static final <T> Flow<T> channelFlow(Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.channelFlow(function2);
    }

    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i2) {
        return FlowKt__TransformKt.chunked(flow, i2);
    }

    public static final Object collect(Flow<?> flow, Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.collect(flow, continuation);
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, Function3<? super Integer, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.collectIndexed(flow, function3, continuation);
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.collectLatest(flow, function2, continuation);
    }

    public static final <T> Object collectWhile(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        return FlowKt__LimitKt.collectWhile(flow, function2, continuation);
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__ZipKt.combine(flow, flow2, function3);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, function4);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, function5);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, flow5, function6);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\f6\u0012j\u0015`{2o~S\b8-(Uw\u0002\u0014_wFH'A?X", replaceWith = @ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    @InterfaceC1492Gx
    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, function3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\f6\u0012j\u0015`{2o~S\b8-(Uw\u0002\u0014_wFH'A?X", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    @InterfaceC1492Gx
    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, function4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\f6\u0012j\u0015`{2o~S\b8-(Uw\u0002\u0014_wFH'A?X", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @InterfaceC1492Gx
    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, function5);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\f6\u0012j\u0015`{2o~S\b8-(Uw\u0002\u0014_wFH'A?X", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @InterfaceC1492Gx
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, flow5, function6);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function4<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, function4);
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Function5<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super Unit>, ? extends Object> function5) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, function5);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Function6<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super Unit>, ? extends Object> function6) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, function6);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, Function7<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super Unit>, ? extends Object> function7) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, flow5, function7);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\f6\u0012x\u001be{\r.sa4jrm`+", replaceWith = @ReplaceWith(expression = "let(transformer)", imports = {}))
    @InterfaceC1492Gx
    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, Function1<? super Flow<? extends T>, ? extends Flow<? extends R>> function1) {
        return FlowKt__MigrationKt.compose(flow, function1);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\f6\u0013k\rfcG~1\u000e}7&/RpCaIiI)-A=\u0013j\u0013", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @InterfaceC1492Gx
    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, Function1<? super T, ? extends Flow<? extends R>> function1) {
        return FlowKt__MigrationKt.concatMap(flow, function1);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\f6\u0013k\rfmO\u0003r\u00154-y(\u0013sP0kuIR#GC!d\u0013GaM[@%\u0005C nV!T'{H\u000b\u0002\u001a/R[P\u000b\u0005qi\u001e|T%DC\u0001Kn", replaceWith = @ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t2) {
        return FlowKt__MigrationKt.concatWith(flow, t2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\f6\u0013k\rfmO\u0003r\u00154-y(\u0013sP0kuIR#GC!d\u0013GaM[@%\u0005C nV!T'{H\u000b\u0002\u001a/R[T\u0004;%+\u001c;%l~\tV:4y\u0013tH\\0O\b,=1X\u0018+\u0011cT(\u007f", replaceWith = @ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.concatWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return FlowKt__ContextKt.conflate(flow);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.consumeAsFlow(receiveChannel);
    }

    public static final <T> Object count(Flow<? extends T> flow, Continuation<? super Integer> continuation) {
        return FlowKt__CountKt.count(flow, continuation);
    }

    public static final <T> Object count(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Integer> continuation) {
        return FlowKt__CountKt.count(flow, function2, continuation);
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, long j2) {
        return FlowKt__DelayKt.debounce(flow, j2);
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, Function1<? super T, Long> function1) {
        return FlowKt__DelayKt.debounce(flow, function1);
    }

    /* JADX INFO: renamed from: debounce-HG0u8IE */
    public static final <T> Flow<T> m10521debounceHG0u8IE(Flow<? extends T> flow, long j2) {
        return FlowKt__DelayKt.m10525debounceHG0u8IE(flow, j2);
    }

    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, Function1<? super T, Duration> function1) {
        return FlowKt__DelayKt.debounceDuration(flow, function1);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t8\u0004#<YJ0:kT0ShM\"n\u0019q\u0019WcOzvW\bl&\u0006\u0013", replaceWith = @ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j2) {
        return FlowKt__MigrationKt.delayEach(flow, j2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t8\u0004#JlH:\u000f\u00100kRaX\n@L|\u0015_{3wvZ}7/(i+", replaceWith = @ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j2) {
        return FlowKt__MigrationKt.delayFlow(flow, j2);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, Function2<? super T, ? super T, Boolean> function2) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow, function2);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, Function1<? super T, ? extends K> function1) {
        return FlowKt__DistinctKt.distinctUntilChangedBy(flow, function1);
    }

    public static final <T> Flow<T> drop(Flow<? extends T> flow, int i2) {
        return FlowKt__LimitKt.drop(flow, i2);
    }

    public static final <T> Flow<T> dropWhile(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.dropWhile(flow, function2);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, Continuation<? super Unit> continuation) {
        return FlowKt__ChannelsKt.emitAll(flowCollector, receiveChannel, continuation);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.emitAll(flowCollector, flow, continuation);
    }

    public static final <T> Flow<T> emptyFlow() {
        return FlowKt__BuildersKt.emptyFlow();
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        FlowKt__EmittersKt.ensureActive(flowCollector);
    }

    public static final <T> Flow<T> filter(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__TransformKt.filter(flow, function2);
    }

    public static final <R> Flow<R> filterIsInstance(Flow<?> flow, KClass<R> kClass) {
        return FlowKt__TransformKt.filterIsInstance(flow, kClass);
    }

    public static final <T> Flow<T> filterNot(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__TransformKt.filterNot(flow, function2);
    }

    public static final <T> Flow<T> filterNotNull(Flow<? extends T> flow) {
        return FlowKt__TransformKt.filterNotNull(flow);
    }

    public static final <T> Object first(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.first(flow, continuation);
    }

    public static final <T> Object first(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.first(flow, function2, continuation);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.firstOrNull(flow, continuation);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.firstOrNull(flow, function2, continuation);
    }

    public static final ReceiveChannel<Unit> fixedPeriodTicker(CoroutineScope coroutineScope, long j2) {
        return FlowKt__DelayKt.fixedPeriodTicker(coroutineScope, j2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT5a\u001c\u0013\u000f3\u0006|xS\u0007)}xQu8-", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @InterfaceC1492Gx
    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt__MigrationKt.flatMap(flow, function2);
    }

    public static final <T, R> Flow<R> flatMapConcat(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt__MergeKt.flatMapConcat(flow, function2);
    }

    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt__MergeKt.flatMapLatest(flow, function2);
    }

    public static final <T, R> Flow<R> flatMapMerge(Flow<? extends T> flow, int i2, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt__MergeKt.flatMapMerge(flow, i2, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u000f3\u0006| W\u0005\r.sa4jltMxVRjKHT!4NX", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.flatten(flow);
    }

    public static final <T> Flow<T> flattenConcat(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MergeKt.flattenConcat(flow);
    }

    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i2) {
        return FlowKt__MergeKt.flattenMerge(flow, i2);
    }

    public static final <T> Flow<T> flow(Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.flow(function2);
    }

    public static final <T1, T2, R> Flow<R> flowCombine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__ZipKt.flowCombine(flow, flow2, function3);
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function4<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return FlowKt__ZipKt.flowCombineTransform(flow, flow2, function4);
    }

    public static final <T> Flow<T> flowOf(T t2) {
        return FlowKt__BuildersKt.flowOf(t2);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return FlowKt__BuildersKt.flowOf((Object[]) tArr);
    }

    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__ContextKt.flowOn(flow, coroutineContext);
    }

    public static final <T, R> Object fold(Flow<? extends T> flow, R r2, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        return FlowKt__ReduceKt.fold(flow, r2, function3, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u000f6\u0017M\rU~\r.sa4jiwXpGPp/", replaceWith = @ReplaceWith(expression = "collect(action)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> void forEach(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        FlowKt__MigrationKt.forEach(flow, function2);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return FlowKt__MergeKt.getDEFAULT_CONCURRENCY();
    }

    public static final <T> Object last(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.last(flow, continuation);
    }

    public static final <T> Object lastOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.lastOrNull(flow, continuation);
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__CollectKt.launchIn(flow, coroutineScope);
    }

    public static final <T, R> Flow<R> map(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt__TransformKt.map(flow, function2);
    }

    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt__MergeKt.mapLatest(flow, function2);
    }

    public static final <T, R> Flow<R> mapNotNull(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt__TransformKt.mapNotNull(flow, function2);
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return FlowKt__MergeKt.merge(iterable);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u0016,\u0017o\u0011\u00196O\u0002*\u0015z0g|`iP0kv<G2y", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.merge(flow);
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        return FlowKt__MergeKt.merge(flowArr);
    }

    public static final Void noImpl() {
        return FlowKt__MigrationKt.noImpl();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0006U\bAvw)\u0017^S7\u0012\u0010\u001e:\u000epT\u000ef\tm\u001f[\tKr*Q\u00042zmdx\u0002Vj{MK\u001f7")
    @InterfaceC1492Gx
    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.observeOn(flow, coroutineContext);
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__EmittersKt.onCompletion(flow, function3);
    }

    public static final <T> Flow<T> onEach(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__TransformKt.onEach(flow, function2);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__EmittersKt.onEmpty(flow, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u00185iz\u001ea\t>\u0007\u0003\u00154-y(\u0013gCa_p\u007f\u0014](M\u0017\u0016\u0013|#lKC%Ys\u0017\u0019P(%'\u0003{\bs\u0018{9\u001dN\tD\u001d?N", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResume(flow, flow2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u00185iz\u001ea\t>\u0007\u0003\u00154-y(\u0013gCa_p\u007f\u0014](M\u0017\u0016\u0013|#lKC%Ys\u0017\u0019P(%'\u0003{\bs\u0018{9\u001dN\tD\u001d?N", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResumeNext(flow, flow2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u00185iz\u001ea\t>\u0007\u0003\u00154-y(\u0013gCa_p\u007f\u0014](M\u0017\u0016\u0013|#lKC%Ys\u0017\u0019P(\f!w@\u000et\rrBd\u000b\u001bB", replaceWith = @ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t2) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u00185iz\u001ea\t>\u0007\u0003\u00154-y(\u0013gCa_p\u007f\u0014](M\u0017\u0016\u0013|#lKC%Ys\u0017K\u0014q\u0004$|sI\u0003\u001et;%N~\u0010bi\rD\u0011OD\bJBo7T{GU\u001dq\u0007h5'P#+>/\u001d\u001dHiQ%^[}", replaceWith = @ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t2, Function1<? super Throwable, Boolean> function1) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t2, function1);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__EmittersKt.onStart(flow, function2);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> sharedFlow, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__ShareKt.onSubscription(sharedFlow, function2);
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__ChannelsKt.produceIn(flow, coroutineScope);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u0019<\u0007t\u0015e~\u000e71\u000e}7&/_lC_aQG\rkrc\"kN\u0006+kP\u0003.\f7!\u001aU\u0019G/>|A{\u001f/K$P=\u007fb(\t\u0011T$~\u000eU@)EXvT\u0013c|\u000b_z:X\"'>\u001e\u0016\u0017E\u0012\u001b3^L<j~\u001c*\n\u0007\u0016\u0007[F\u001e[BEvl)\u0001\u0019\u0015\u0019\u0013\u0012sy&IZkQga\u000fJ}b\u0010\u0003E2.\u000e(\u0005Y\u001f'A oz o\u001cmE\u000eU|imW*NY]\u001al<$d\u0013#\r[:Teh\u001bL26b-\u000euv\u0002'\u001bc\u0005(@\\G\u001c1nK1\n(\u000b\u000e\u0017\u0012GE\u000et{CE\".W`\u001fwN1\u001a\u0014Bh6\u000f\u0015,d3QW7 \rq^,\u001fMgl\u0017$fM<d\u0003%1u:(s]\u0017@K%\u0002B\b`.c\u0013r;\u0010og\be+)c", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.publish(flow);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u0019<\u0007t\u0015e~\u000ep\u007fTz)x[U~G\u0016#(BY]y<'\\R~4\u001f\bAtJ@!#L\u0018\u0004\u001d\u0010sH\u0006\u0014pI!4\fB+a1\f]\u0012K\u0004T6oy!rJa*s~4=j\u0004\u00199>/\u001d\u0010xV\u0017& SCy:*:S<jbRJ[\u0017GA.*xG*\u0001D\u00070pwWMj\u0017\u0018$'~=\u0001\u001dH6m.>|ty]g(vYo} yz=v\\gw|#\u0017[[xJ'm4 tJJKU@\b\u00135oL2CR$HD\")orex4;FH\u0015{:\u0003#R\u000e)\u0019\u000b\u0010LD\u00056y8Y! YsV2d\u0002\u001b\u0007\u000f+6\u0003[b\u001e@R\u001e=o/wqa^~t\f\u00041gE8t:Ah\u0001=bG[).Z'}DB9&\u000eT4L\u0007vYmt\u001e'*k\u0018 s%\u001bL3YyXFq\u001e>d\u0017O\u001a\u0013^\u0002zb.~tDMp8", replaceWith = @ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i2) {
        return FlowKt__MigrationKt.publish(flow, i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0006U\bAvw)\u0017^S7\u0012\u0010\u001e:\u000epT\u000ef\tm\u001f[\tKr*Q\u00042zmdx\u0002Vj{MK\u001f7")
    @InterfaceC1492Gx
    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.publishOn(flow, coroutineContext);
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.receiveAsFlow(receiveChannel);
    }

    public static final <S, T extends S> Object reduce(Flow<? extends T> flow, Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3, Continuation<? super S> continuation) {
        return FlowKt__ReduceKt.reduce(flow, function3, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u001b,\u0015t\rk>\u000f5*W\bc-{TeTREv\u007f\u00065<N\u001a\u0016a\b.aUDyC8Q\u001eL$P\u001c\u0010\u0002A\u001c\u001etG(L\u0017C&o\u000b\u000bV\u001eD}Uupp\\\u0003zg$s;$z(E%2\u0013Z(\u001fKS&%&Wv-\t&eFSjoLp\u001fPE>..sr&\u0005\n\b4h4c\u0004\u0001i\u000f/.{QD\u001dJwY28]w~XdcBS7( |\u0019<{Zc\tmn\u000e0V&\u0010,n)1tJ;K\u001ep;T#mT.6@4\nyv;k??p@=_MZ)'\u0010&\u001a/-\r\u0016Or'W:w=E-b\u0014-\u001dwAT\u0015\u001a\u00116jCS.b/[+fa.npY*N @\u00167UKKe9m\u0006,!+\u0002Z\u001e;O\u0006\rA\u0015pk\u001f\u001a*B\u0007tWmu\u001f(\u0019x\u001dT\u0002!Y\tt&eh:\u0004\u0019:p&\u0019", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.replay(flow);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u001b,\u0015t\rk>H\u0004pTy6Yqfi\u000b\u0014\u001cqL\u0006dFB\u0013hQb0\u001f\bRnR<Q O\u0019\u0004.\u00079\u0005{\u0012x< \u000b\u0010\u0001m.\t\u0015\b @\rB;-EX\u0002\t\u0013E\u0001\u00010\u0002#]WnL\u001e$\u0019GW\u00154f\u0007vn\u000eV:I@\u0016aP7\u001ddEF.8tE\u0019\u0014\n\u000bH$3&S\u0017\\\"34{w\u007fU\t\u0003\u0004'<:vuOce2T:(5|\u001d>tO{<1)O1[u,(h6$cY~T\u0001EZM0nW!CR3H{qu.\u0005gp8HX8SFep'\u000641\r\tvG~WIl5\u0012\u007f\u001ceh\u0017\f\u00021\u0007\u0017\n70\u007f\".\u001cmv*_p&jva^\rr~\t\u0006cNEt|vh\u0001@$\u000f[!.\\\u0018\f\u007f\u0017k&a_G;\u0010|W~ yT\tn\u0015d\u0006+\u00193Bgvj8rY,j\u001bWW=-D\rS9riDC$36AqVw~d[N&\n", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i2) {
        return FlowKt__MigrationKt.replay(flow, i2);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j2, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__ErrorsKt.retry(flow, j2, function2);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, Function4<? super FlowCollector<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return FlowKt__ErrorsKt.retryWhen(flow, function4);
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r2, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__TransformKt.runningFold(flow, r2, function3);
    }

    public static final <T> Flow<T> runningReduce(Flow<? extends T> flow, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return FlowKt__TransformKt.runningReduce(flow, function3);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j2) {
        return FlowKt__DelayKt.sample(flow, j2);
    }

    /* JADX INFO: renamed from: sample-HG0u8IE */
    public static final <T> Flow<T> m10522sampleHG0u8IE(Flow<? extends T> flow, long j2) {
        return FlowKt__DelayKt.m10526sampleHG0u8IE(flow, j2);
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r2, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__TransformKt.scan(flow, r2, function3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1|\u0016j\u0018S-\u000ecTBSnN\u0018:\n(ReyG|1\u000e\b,uz`gWa", replaceWith = @ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    @InterfaceC1492Gx
    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r2, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__MigrationKt.scanFold(flow, r2, function3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "iY~6\u007ff\u001a[mJ-A\u0010,-a\u001c^\u000e5\u0006u\u0011V6Z}*\u0015\u00079tvUrI?alNI#yy&e\f{'\u0018KJsQ=% L\"XZ\u000e=\u0016zKZF0W\u0007\n\u001d5\u001c|V\u0014@\rEm4:U\u0002<e5", replaceWith = @ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return FlowKt__MigrationKt.scanReduce(flow, function3);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i2) {
        return FlowKt__ShareKt.shareIn(flow, coroutineScope, sharingStarted, i2);
    }

    public static final <T> Object single(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.single(flow, continuation);
    }

    public static final <T> Object singleOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.singleOrNull(flow, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u001c2\u000exR\u0012\u007fY.1R\u00073v/", replaceWith = @ReplaceWith(expression = "drop(count)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i2) {
        return FlowKt__MigrationKt.skip(flow, i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u001c;\u0006z I\u007fZv1\u000e}7&/[r5a]zM\rkr/%[\f@1f;OfPHQ'\u0007\u0019Q$\u000b{\u0018s\u0018\u0005<d\u000b\u001bB", replaceWith = @ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t2) {
        return FlowKt__MigrationKt.startWith(flow, t2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010UT;T\u001c\u0013\u001c;\u0006z I\u007fZv1\u000e}7&/[r5a]zM\rkr/%[\f@1f;OfPHQ'\u0007\u0019Q$\u000b\u0015\u000e~S~K$P\u0010D\u001d?N", replaceWith = @ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    @InterfaceC1492Gx
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.startWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> Object stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, Continuation<? super StateFlow<? extends T>> continuation) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, continuation);
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t2) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, sharingStarted, t2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t8\u0001\u0016lfJ0c^[kee`\u0011fKw\u001a7wIv1\u001a4juv/sO]hmMO-A\u0001QWZ}a\u001fK<yA<XKP\"W/{5\u0006")
    @InterfaceC1492Gx
    public static final <T> void subscribe(Flow<? extends T> flow) {
        FlowKt__MigrationKt.subscribe(flow);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t8\u0001\u0016lfJ0c^[kee`\u0011fKw\u001a7wIv1\u001a4juv/sO]hmMO-A\u0001QWZ}a\u001fK<yA<XKP\"W/{5\u0006")
    @InterfaceC1492Gx
    public static final <T> void subscribe(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        FlowKt__MigrationKt.subscribe(flow, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t8\u0001\u0016lfJ0c^[kee`\u0011fKw\u001a7wIv1\u001a4juv/sO]hmMO-A\u0001QWZ}a\u001fK<yA<XKP\"W/{5\u0006")
    @InterfaceC1492Gx
    public static final <T> void subscribe(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function22) {
        FlowKt__MigrationKt.subscribe(flow, function2, function22);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t8z!fo66A\u0010\u001e:apQ\n+")
    @InterfaceC1492Gx
    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.subscribeOn(flow, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\tR\u000bL1u#XdV/\u0010U(k]b\fO:\u001cq U~3oz\u00154%xm\f+V_]vLL-EG}W`~5l\u000f\u0007%\u0005:\u001e\r[\u0001E+b5\u0016w\u001f\u0004}[L\f\u007f\u001dh\u0015|X{@\u000fFA<w", replaceWith = @ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    @InterfaceC1492Gx
    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt__MigrationKt.switchMap(flow, function2);
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i2) {
        return FlowKt__LimitKt.take(flow, i2);
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.takeWhile(flow, function2);
    }

    /* JADX INFO: renamed from: timeout-HG0u8IE */
    public static final <T> Flow<T> m10523timeoutHG0u8IE(Flow<? extends T> flow, long j2) {
        return FlowKt__DelayKt.m10527timeoutHG0u8IE(flow, j2);
    }

    public static final <T, C extends Collection<? super T>> Object toCollection(Flow<? extends T> flow, C c2, Continuation<? super C> continuation) {
        return FlowKt__CollectionKt.toCollection(flow, c2, continuation);
    }

    public static final <T> Object toList(Flow<? extends T> flow, List<T> list, Continuation<? super List<? extends T>> continuation) {
        return FlowKt__CollectionKt.toList(flow, list, continuation);
    }

    public static final <T> Object toSet(Flow<? extends T> flow, Set<T> set, Continuation<? super Set<? extends T>> continuation) {
        return FlowKt__CollectionKt.toSet(flow, set, continuation);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__EmittersKt.transform(flow, function3);
    }

    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__MergeKt.transformLatest(flow, function3);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3) {
        return FlowKt__LimitKt.transformWhile(flow, function3);
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__EmittersKt.unsafeTransform(flow, function3);
    }

    public static final <T> Flow<IndexedValue<T>> withIndex(Flow<? extends T> flow) {
        return FlowKt__TransformKt.withIndex(flow);
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__ZipKt.zip(flow, flow2, function3);
    }
}
