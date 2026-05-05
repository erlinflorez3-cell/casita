package androidx.compose.runtime;

import androidx.compose.animation.core.AnimationKt;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!4i\bDZc|\u0004G\u000b8\u000bDB\u0007\":\u0019\u007f\u0007|jA0Jj`c`XB\u000f2\u0002T&aҕ\u007fIkt(\u0005:$__wv\u001dSҼ\u000fM\u0015\u0010&~p7YW~c8\u001bBD\u007f?yS\u001eE\u007fŢ3ȥ\t @/P/\u0013\u000f2*\u000f\u0016\u0017|Iŷ\u001a\u0018`_~Aj(]\u0016*!4Gŋ\u0005(bq^<Nwm<5))xRP7_v\u0003{\u0015\rÝe˼za,8XrC\u001a=SI\rr]EšMwe\u0005\u0017&WLOue=p\u001b$&;^;fę*f\u000b[p\u0012-6_eQV44\b|\f\r\u0003\n<\u000emΥtǉ\u001ef\u0016\u001eS\u0011\u0001ԟXP0]j\u007f)al[{Ķ5ڢ=%vSg<'PO}\u000b\u0010,'ѐr2"}, d2 = {";n]<g6GW\u0017_\bZ4|f6o}.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\u007f/Dc\u0007$5N#*UC\u0019r>\u001c\u001b>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u001ab5Hb#\b~\\\r\n\u00057e]/\u0006>\u0007U\u0013Px\u0018Kr49c\u0007.", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|kq>", "5dc\u001ab5Hb#\b~\\\r\n\u00057e]/\u0006>\u0007", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|kq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[B\u0018W5\u001c\u000fbE\"OQ3'\b\nP\f9nV", "Ehc599:[\u0019f~e3\u0001\u0017", Global.BLANK, "=m5?T4>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4qP:X\u001bB[\u0019f~e3\u0001\u0017", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "Ehc599:[\u0019gvg6\u000b", "4qP:X\u001bB[\u0019gvg6\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW$\u0001.?h\b);kv;IK;I;(\u0013n7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(S\u00020\bEw\b\u0010\u001fW3t}Lf\u001fK\u0003\u0015\u0004\u000b\u0007rOhc\u0003W=Tf4ma#\u0004a6K ]x\u0015$j\u001a\u0018\u0007\u0001S\u000f\u0002(", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MonotonicFrameClockKt {
    public static /* synthetic */ void getMonotonicFrameClock$annotations(CoroutineContext coroutineContext) {
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2, reason: invalid class name */
    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;\"&i\u000eKLcz\u0004OيH\u000btA\u001f$2ߚ\u0006\u0006\u0017nG0\\ev/\u0019[֖\u0013m\u000262^"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "7s", "", "7me<^,", "uI\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2<R> extends Lambda implements Function1<Long, R> {
        final /* synthetic */ Function1<Long, R> $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Long, ? extends R> function1) {
            super(1);
            this.$onFrame = function1;
        }

        public final R invoke(long j2) {
            return this.$onFrame.invoke(Long.valueOf(j2 / AnimationKt.MillisToNanos));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long l2) {
            return invoke(l2.longValue());
        }
    }

    public static final <R> Object withFrameMillis(MonotonicFrameClock monotonicFrameClock, Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return monotonicFrameClock.withFrameNanos(new AnonymousClass2(function1), continuation);
    }

    private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock monotonicFrameClock, Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(function1);
        InlineMarker.mark(0);
        Object objWithFrameNanos = monotonicFrameClock.withFrameNanos(anonymousClass2, continuation);
        InlineMarker.mark(1);
        return objWithFrameNanos;
    }

    public static final <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return getMonotonicFrameClock(continuation.getContext()).withFrameNanos(function1, continuation);
    }

    public static final <R> Object withFrameMillis(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return getMonotonicFrameClock(continuation.getContext()).withFrameNanos(new AnonymousClass2(function1), continuation);
    }

    public static final MonotonicFrameClock getMonotonicFrameClock(CoroutineContext coroutineContext) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}
