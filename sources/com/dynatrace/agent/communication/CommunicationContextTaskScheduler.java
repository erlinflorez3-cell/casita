package com.dynatrace.agent.communication;

import com.dynatrace.agent.communication.CommunicationState;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\tnjO0L͜P.`S2şs{J$cҕyCQU\"}8\tWNmmtϺpŏs\u000f4\u00159\u0002<Mcxu\u0012=3RuE3[qU9\u000fwȥ\t\"8&F~M4(3`\u0010%\u0005sO\u001a\u001dH@\u001fF\u0003'[\u00122(\f=0\t.bwPFH\u001bgh>3\u0007yDd&\u000e/+[SϿù+\u000f|q,<\tBC'=S1\u0011\u0019¹ύ\u0007?wPM\u00125;CI\"afr\u000e!-AU\fmz6b\u0015Sp\fU5}r[T\u001e*\u000ey*\fj\u0012T\u0006όL.;//\u000e\u001cI\rr\u0002J\u0017\u0002/N\u000ezy6E&VĔ-ݰ\u001ffYĥ\f'\\9\u0014\u0005;!yЪpĲ_V\u0016`#!%\u0006_8iBSG|\u00120Ơyձtb\nÏ˟4^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBdm5]v:V;J:b@p@\u0014\u0011j\u0015N8b", "", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "AbW2W<EW\"\u0001ib4|", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7Cz\u0015SMJr8'^mrAPg5]v4PHUu;Rs9$\u0019ikX4\u001b\u0014fQ\"}ND\u0007\u00049O\u0002H>D|", "\u0018", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "AbW2W<ES\bz\td", "", "AsPAX", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "AbW2W<ES\bz\tdjz\u00137_~<\u0005<\u0010$\u0013Eo\b8x%>hw-7t\u0016*[C", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7s8UKKt8\u001c\u0011weC\u0010Q;J\u0006'\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015acx[", "As^=8?>Q)\u000e~h5", "As^=8?>Q)\u000e~h5;\u00079my'\u0010I|&$Cm\u000e6r'5b\r\u001aDm\u001d.IQ;", "AsP?g\u001bB[\u0019\f", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "As^=G0FS&", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CommunicationContextTaskScheduler {
    private Job job;
    private final long schedulingTime;
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationContextTaskScheduler$startTimer$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = CommunicationContextTaskScheduler.this.new AnonymousClass1(this.$block, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0043 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0041 -> B:29:0x0015). Please report as a decompilation issue!!! */
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
                if (r0 == 0) goto L44
                if (r0 == r4) goto L30
                if (r0 != r5) goto L4f
                java.lang.Object r3 = r7.L$0
                kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                kotlin.ResultKt.throwOnFailure(r8)
            L15:
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r3)
                if (r0 == 0) goto L4c
                com.dynatrace.agent.communication.CommunicationContextTaskScheduler r0 = com.dynatrace.agent.communication.CommunicationContextTaskScheduler.this
                long r1 = com.dynatrace.agent.communication.CommunicationContextTaskScheduler.access$getSchedulingTime$p(r0)
                r0 = r7
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r7.L$0 = r3
                r7.label = r4
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.m10472delayVtjQ1oo(r1, r0)
                if (r0 != r6) goto L2f
                return r6
            L2f:
                goto L37
            L30:
                java.lang.Object r3 = r7.L$0
                kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                kotlin.ResultKt.throwOnFailure(r8)
            L37:
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r7.$block
                r7.L$0 = r3
                r7.label = r5
                java.lang.Object r0 = r0.invoke(r7)
                if (r0 != r6) goto L15
                return r6
            L44:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r3 = r7.L$0
                kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                goto L15
            L4c:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L4f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.CommunicationContextTaskScheduler.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private CommunicationContextTaskScheduler(CoroutineScope scope, long j2) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.schedulingTime = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CommunicationContextTaskScheduler(CoroutineScope coroutineScope, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            Duration.Companion companion = Duration.Companion;
            j2 = DurationKt.toDuration(5, DurationUnit.MINUTES);
        }
        this(coroutineScope, j2, null);
    }

    public /* synthetic */ CommunicationContextTaskScheduler(CoroutineScope coroutineScope, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, j2);
    }

    private final void startTimer(Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        stopTimer();
        this.job = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(function1, null), 3, null);
    }

    private final void stopTimer() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
    }

    public final void scheduleTask$com_dynatrace_agent_release(CommunicationState state, Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.job == null && Intrinsics.areEqual(state, CommunicationState.Offline.INSTANCE)) {
            startTimer(block);
        } else {
            stopTimer();
        }
    }

    public final void stopExecution$com_dynatrace_agent_release() {
        stopTimer();
    }
}
