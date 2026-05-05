package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0011\u0007 \u0017\u001e\u001eXw\u000e(({\u0012+\"))~+\u001d&z)%*\u001f3)00f%3/4)=/\u001b8.14=6@G\u0018:BK9|\u000b", f = "\u0019-EC\u0015)@5:8\f6&-\u007f,&)\u001c.\"'%c (", i = {0}, l = {151, 158}, m = "8>GA>9(KJH>H?", n = {"U_pG^IRL9"}, s = {"xQ^"})
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j2, Continuation<? super LazyLayoutItemAnimation$animatePlacementDelta$1> continuation) {
        super(2, continuation);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r15.label
            r6 = 2
            r4 = 1
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L18
            if (r0 != r6) goto L10
            goto Lae
        L10:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L18:
            java.lang.Object r9 = r15.L$0
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            goto L65
        L1d:
            kotlin.ResultKt.throwOnFailure(r16)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r15.this$0     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r0)     // Catch: java.util.concurrent.CancellationException -> Lbc
            boolean r0 = r0.isRunning()     // Catch: java.util.concurrent.CancellationException -> Lbc
            if (r0 == 0) goto L61
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> r9 = r15.$spec     // Catch: java.util.concurrent.CancellationException -> Lbc
            boolean r0 = r9 instanceof androidx.compose.animation.core.SpringSpec     // Catch: java.util.concurrent.CancellationException -> Lbc
            if (r0 == 0) goto L5c
            androidx.compose.animation.core.SpringSpec r9 = (androidx.compose.animation.core.SpringSpec) r9     // Catch: java.util.concurrent.CancellationException -> Lbc
        L34:
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9     // Catch: java.util.concurrent.CancellationException -> Lbc
        L36:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r15.this$0     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r0)     // Catch: java.util.concurrent.CancellationException -> Lbc
            boolean r0 = r0.isRunning()     // Catch: java.util.concurrent.CancellationException -> Lbc
            if (r0 != 0) goto L71
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r15.this$0     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.animation.core.Animatable r2 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r0)     // Catch: java.util.concurrent.CancellationException -> Lbc
            long r0 = r15.$totalDelta     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.ui.unit.IntOffset r1 = androidx.compose.ui.unit.IntOffset.m6757boximpl(r0)     // Catch: java.util.concurrent.CancellationException -> Lbc
            r0 = r15
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0     // Catch: java.util.concurrent.CancellationException -> Lbc
            r15.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> Lbc
            r15.label = r4     // Catch: java.util.concurrent.CancellationException -> Lbc
            java.lang.Object r0 = r2.snapTo(r1, r0)     // Catch: java.util.concurrent.CancellationException -> Lbc
            if (r0 != r3) goto L68
            goto L64
        L5c:
            androidx.compose.animation.core.SpringSpec r9 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt.access$getInterruptionSpec$p()     // Catch: java.util.concurrent.CancellationException -> Lbc
            goto L34
        L61:
            androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> r9 = r15.$spec     // Catch: java.util.concurrent.CancellationException -> Lbc
            goto L36
        L64:
            return r3
        L65:
            kotlin.ResultKt.throwOnFailure(r16)     // Catch: java.util.concurrent.CancellationException -> Lbc
        L68:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r15.this$0     // Catch: java.util.concurrent.CancellationException -> Lbc
            kotlin.jvm.functions.Function0 r0 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getOnLayerPropertyChanged$p(r0)     // Catch: java.util.concurrent.CancellationException -> Lbc
            r0.invoke()     // Catch: java.util.concurrent.CancellationException -> Lbc
        L71:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r15.this$0     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r0)     // Catch: java.util.concurrent.CancellationException -> Lbc
            java.lang.Object r0 = r0.getValue()     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.ui.unit.IntOffset r0 = (androidx.compose.ui.unit.IntOffset) r0     // Catch: java.util.concurrent.CancellationException -> Lbc
            long r4 = r0.m6775unboximpl()     // Catch: java.util.concurrent.CancellationException -> Lbc
            long r0 = r15.$totalDelta     // Catch: java.util.concurrent.CancellationException -> Lbc
            long r0 = androidx.compose.ui.unit.IntOffset.m6769minusqkQi6aY(r4, r0)     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r2 = r15.this$0     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.animation.core.Animatable r7 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getPlacementDeltaAnimation$p(r2)     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.ui.unit.IntOffset r8 = androidx.compose.ui.unit.IntOffset.m6757boximpl(r0)     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.animation.core.AnimationSpec r9 = (androidx.compose.animation.core.AnimationSpec) r9     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1 r11 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r2 = r15.this$0     // Catch: java.util.concurrent.CancellationException -> Lbc
            r11.<init>()     // Catch: java.util.concurrent.CancellationException -> Lbc
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11     // Catch: java.util.concurrent.CancellationException -> Lbc
            r12 = r15
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12     // Catch: java.util.concurrent.CancellationException -> Lbc
            r0 = 0
            r15.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> Lbc
            r15.label = r6     // Catch: java.util.concurrent.CancellationException -> Lbc
            r10 = 0
            r13 = 4
            r14 = 0
            java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.util.concurrent.CancellationException -> Lbc
            if (r0 != r3) goto Lb1
            return r3
        Lae:
            kotlin.ResultKt.throwOnFailure(r16)     // Catch: java.util.concurrent.CancellationException -> Lbc
        Lb1:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r15.this$0     // Catch: java.util.concurrent.CancellationException -> Lbc
            r1 = 0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setPlacementAnimationInProgress(r0, r1)     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r15.this$0     // Catch: java.util.concurrent.CancellationException -> Lbc
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setRunningMovingAwayAnimation$p(r0, r1)     // Catch: java.util.concurrent.CancellationException -> Lbc
        Lbc:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
