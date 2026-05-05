package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
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
/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007tkA0ReP\u008cZS@\u000fsڔ<$q$yCAV\"}8\tWȞog\u0005Jb\u000bI\u0011\fǝ\u000f̓TK[ތk\u0011?2po\u007f\u0018]sK:xtd\u00070D0;\u0012\u0013\u0011\u001e:J&u)H[\u000e\"0nvhV\u001de\u0013!*\u001aN\"\u0011\u001e\u0013ɡ^:Xns9](\u0013kRNUe^\u0005]-T]?)|`.-P7kՖ5[\u0013\rb]O\u0003mwk\u000fx+7-_r\u00066\u0007\bѥ\u0014ۀ̠\u0011]\u00011%\u0016_q$'YU\u0014O^ @w1ԈɁ@\u0004\u001c\u0019wu<62\u0003\u000e\rCv\u0003SvА\u0012fR\u0006\u000bcF\u0017S\u0006a5I\u001fvSw:GNe\u0004[ٿ ƹ\u007f͙Ĳ_V\u0016`#'%\n_>iFMJ^\n\u0010Ɲ\u001c\u0012Gê\u0004ò\b0Oĉ\u007f\b\u001f=/%ek\u0010\u05fd#Ƞ\u0006HLϙG\u0011niki\u0001J\u0017̑pގ;*\u0011ȱɱDf\rkVkй0%"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u0012D\u0002,55{/Azk", "\"", "", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "=m2<`7ES(~", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "=mD;W,EW*~\b^+\\\u0010/m\u007f1\u000b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "1n]@h4>;\u0019\r\tZ.|", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001a\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJu>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[F=+8", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", ";db@T.>?)~\u000b^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "@d\\.\\5B\\\u001bfzl:x\u000b/s", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Q\u001f=ME;x\n", "=eU2e", ";rV", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class SimpleActor<T> {
    private final Function2<T, Continuation<? super Unit>, Object> consumeMessage;
    private final Channel<T> messageQueue;
    private final AtomicInteger remainingMessages;
    private final CoroutineScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(CoroutineScope scope, final Function1<? super Throwable, Unit> onComplete, final Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInteger(0);
        Job job = (Job) scope.getCoroutineContext().get(Job.Key);
        if (job == null) {
            return;
        }
        job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Unit unit;
                onComplete.invoke(th);
                ((SimpleActor) this).messageQueue.close(th);
                do {
                    Object objM10504getOrNullimpl = ChannelResult.m10504getOrNullimpl(((SimpleActor) this).messageQueue.mo10492tryReceivePtdJZtk());
                    if (objM10504getOrNullimpl == null) {
                        unit = null;
                    } else {
                        onUndeliveredElement.invoke((T) objM10504getOrNullimpl, th);
                        unit = Unit.INSTANCE;
                    }
                } while (unit != null);
            }
        });
    }

    public final void offer(T t2) {
        Object obj = this.messageQueue.mo10484trySendJP2dKIU(t2);
        if (obj instanceof ChannelResult.Closed) {
            Throwable thM10503exceptionOrNullimpl = ChannelResult.m10503exceptionOrNullimpl(obj);
            if (thM10503exceptionOrNullimpl != null) {
                throw thM10503exceptionOrNullimpl;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ChannelResult.m10509isSuccessimpl(obj)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass2(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2, reason: invalid class name */
    /* JADX INFO: compiled from: SimpleActor.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\u000b\u000f\f\u0006b\u0006\u0018\u0014\u0018J\u0017\u000f\u0010\u0010\u001eP_", f = " 58:5-\b)935o,4", i = {}, l = {122, 122}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SimpleActor<T> simpleActor, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = simpleActor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:7:0x0011). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L20
                if (r0 == r2) goto L57
                if (r0 != r3) goto L6a
                kotlin.ResultKt.throwOnFailure(r7)
            L11:
                androidx.datastore.core.SimpleActor<T> r0 = r6.this$0
                java.util.concurrent.atomic.AtomicInteger r0 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r0)
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L32
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L20:
                kotlin.ResultKt.throwOnFailure(r7)
                androidx.datastore.core.SimpleActor<T> r0 = r6.this$0
                java.util.concurrent.atomic.AtomicInteger r0 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r0)
                int r0 = r0.get()
                if (r0 <= 0) goto L55
                r0 = r2
            L30:
                if (r0 == 0) goto L72
            L32:
                androidx.datastore.core.SimpleActor<T> r0 = r6.this$0
                kotlinx.coroutines.CoroutineScope r0 = androidx.datastore.core.SimpleActor.access$getScope$p(r0)
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r0)
                androidx.datastore.core.SimpleActor<T> r0 = r6.this$0
                kotlin.jvm.functions.Function2 r5 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r0)
                androidx.datastore.core.SimpleActor<T> r0 = r6.this$0
                kotlinx.coroutines.channels.Channel r1 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r0)
                r0 = r6
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r6.L$0 = r5
                r6.label = r2
                java.lang.Object r7 = r1.receive(r0)
                if (r7 != r4) goto L5e
                return r4
            L55:
                r0 = 0
                goto L30
            L57:
                java.lang.Object r5 = r6.L$0
                kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                kotlin.ResultKt.throwOnFailure(r7)
            L5e:
                r0 = 0
                r6.L$0 = r0
                r6.label = r3
                java.lang.Object r0 = r5.invoke(r7, r6)
                if (r0 != r4) goto L11
                return r4
            L6a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L72:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
