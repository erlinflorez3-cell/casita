package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u000e\u0007njO0L͜P.hS2şs{J$c$\bCCU(~*\teNogtJb\u000bQ\u000f\u000eǝ\u0001jBI]xs\u0012\u00172XoG3[ڎE9vt>\u0005&2:h\bڎ\u0019 :J vACy\u000b22F\u0081HR5S\u0015\u001c\"\u0006\u0005 /\u001f\rmT6Vnu:]&3oHN5cH|{\u0012\rY?˵uoӜCFG7%%\u001a\u00035Q{A\tӊ\u007f=-hU-[OyWD_\u0018\u0014C3\u007f\u0013cr4^\u001dQ\u000f\u000fW1UcYT&(&\u007f,8B\u0004\u001c\u000f?m>@*w\u001e\ra\u0001ɤWJV\u000fnH\u0006\tq8\u001d+&B;;+f\u007fqQ\u0018|Bd\u0007#\u001d\u0002\u000b\u001fNaS\u001cq-BZva9aFMJ^\n =\u001c\u0017\u0001j\u00120\u00142W\u007f]\f?B')G]O\"O\u00010Zזkv\u000bv/XׂVHN9ë\u001aO"}, d2 = {"0q^.W*:a(", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002Bcy\u001f5i$=+F7t=\u001e\u001c>", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "1`_.V0Mg", "", "AsP?g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0013DU\u000b/\r", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "=m2<`7ES(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d@\u0001.\u0018U\u0007\u001f>m#\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\bUJA.\u000f0R\u0015\u0005f\u000b\u0019 \u001eDnyBdY%\u0004\"\u007fQ8lOYM\tCNT8\u0011j\u0016n$`C\u0004)%yb\u001cxY,\u0019\u007f]\u001a\u0001\u001cZwpE(~B-\nCBLO~\\@}p$\\\u0004A\u0013Bar:x7\rBs\u0017t\u000eIv\u001cHgEjoCG15=@\u001cR\u0015a\u007fyH\u001ew#j\b\u001c,34\u0015nncO\u001dP:$e1`]|EacAEx\u001e'MT", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class BroadcastKt {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastKt$broadcast$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001Tp\u0017"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $channel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ReceiveChannel<? extends E> receiveChannel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$channel = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:7:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r7.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L51
                if (r0 == r4) goto L2a
                if (r0 != r5) goto L5f
                java.lang.Object r3 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r2 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r8)
            L19:
                r0 = r7
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r7.L$0 = r2
                r7.L$1 = r3
                r7.label = r4
                java.lang.Object r8 = r3.hasNext(r0)
                if (r8 != r6) goto L29
                return r6
            L29:
                goto L35
            L2a:
                java.lang.Object r3 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                java.lang.Object r2 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.ResultKt.throwOnFailure(r8)
            L35:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r0 = r8.booleanValue()
                if (r0 == 0) goto L67
                java.lang.Object r1 = r3.next()
                r0 = r7
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r7.L$0 = r2
                r7.L$1 = r3
                r7.label = r5
                java.lang.Object r0 = r2.send(r1, r0)
                if (r0 != r6) goto L19
                return r6
            L51:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r2 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r7.$channel
                kotlinx.coroutines.channels.ChannelIterator r3 = r0.iterator()
                goto L19
            L5f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L67:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0005X\u000b6uw\u0016jl*0{^#1Z\u001cU\u001cf\tm\u001cd{Io~Sxcov\fxJR\u001cn:\\-HLQeR9\u0015`IMjB\u001a\u001e\u001b^SE)zs\u000b\u0006K}F[W\r\nd'\u001a;[%O\u000bP@<6W")
    @InterfaceC1492Gx
    public static final <E> BroadcastChannel<E> broadcast(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, CoroutineStart coroutineStart, Function1<? super Throwable, Unit> function1, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        BroadcastChannel BroadcastChannel = BroadcastChannelKt.BroadcastChannel(i2);
        LazyBroadcastCoroutine lazyBroadcastCoroutine = coroutineStart.isLazy() ? new LazyBroadcastCoroutine(coroutineContextNewCoroutineContext, BroadcastChannel, function2) : new BroadcastCoroutine(coroutineContextNewCoroutineContext, BroadcastChannel, true);
        if (function1 != null) {
            lazyBroadcastCoroutine.invokeOnCompletion(function1);
        }
        lazyBroadcastCoroutine.start(coroutineStart, lazyBroadcastCoroutine, function2);
        return lazyBroadcastCoroutine;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0005X\u000b6uw\u0016jl*0{^#1Z\u001cU\u001cf\tm\u001cd{Io~Sxcov\fxJR\u001cn:\\-HLQeR9\u0015`IMjB\u001a\u001e\u001b^SE)zs\u000b\u0006K}F[W\r\nd'\u001a;[%O\u000bP@<6W")
    @InterfaceC1492Gx
    public static final <E> BroadcastChannel<E> broadcast(final ReceiveChannel<? extends E> receiveChannel, int i2, CoroutineStart coroutineStart) {
        return broadcast$default(CoroutineScopeKt.plus(CoroutineScopeKt.plus(GlobalScope.INSTANCE, Dispatchers.getUnconfined()), new BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)), null, i2, coroutineStart, new Function1() { // from class: kotlinx.coroutines.channels.BroadcastKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BroadcastKt.broadcast$lambda$1(receiveChannel, (Throwable) obj);
            }
        }, new AnonymousClass2(receiveChannel, null), 1, null);
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i3, Object obj) {
        if ((1 & i3) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = 1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            function1 = null;
        }
        return broadcast(coroutineScope, coroutineContext, i2, coroutineStart, function1, function2);
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(ReceiveChannel receiveChannel, int i2, CoroutineStart coroutineStart, int i3, Object obj) {
        if ((1 & i3) != 0) {
            i2 = 1;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return broadcast(receiveChannel, i2, coroutineStart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit broadcast$lambda$1(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt.cancelConsumed(receiveChannel, th);
        return Unit.INSTANCE;
    }
}
