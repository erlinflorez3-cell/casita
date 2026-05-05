package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0004o\u0005`\u000f<B\u0017\"Z\u0011>ѣ%"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "Dd[<V0Mg"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU{\r\u001d\u001b\u0019\u001a\u0018\u001e\u0018}\"\u001b\u001e\u0019Z''}-\u001d$\u00113/12((h6,:/9=9\u0013:8>8u\u0004", f = " /=954((1)p-5", i = {0, 1, 1, 2, 2}, l = {745, 748, 751}, m = "8>GA>9(KJH>H?", n = {"e[nUU_V`", "e[nUU_V`", "PlcO^WDS;", "e[nUU_V`", "e[nUU_V`\"?L>"}, s = {"vQ^", "vQ^", "vQ_", "vQ^", "vQ_"})
final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).m6884unboximpl();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m837invokesFctU(velocity.m6884unboximpl(), continuation);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m837invokesFctU(long j2, Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m6866boximpl(j2), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r7 = r16
            r6 = r15
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r8 = 3
            r9 = 2
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 == r4) goto L48
            if (r0 == r9) goto L69
            if (r0 != r8) goto L91
            long r2 = r6.J$1
            long r0 = r6.J$0
            kotlin.ResultKt.throwOnFailure(r7)
        L1b:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r4 = r7.m6884unboximpl()
            long r2 = androidx.compose.ui.unit.Velocity.m6878minusAH228Gc(r2, r4)
            long r0 = androidx.compose.ui.unit.Velocity.m6878minusAH228Gc(r0, r2)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6866boximpl(r0)
            return r0
        L2e:
            kotlin.ResultKt.throwOnFailure(r7)
            long r0 = r6.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r2 = r6.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r3 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r2)
            r2 = r6
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r6.J$0 = r0
            r6.label = r4
            java.lang.Object r7 = r3.m5263dispatchPreFlingQWom1Mo(r0, r2)
            if (r7 != r5) goto L47
            return r5
        L47:
            goto L4d
        L48:
            long r0 = r6.J$0
            kotlin.ResultKt.throwOnFailure(r7)
        L4d:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r2 = r7.m6884unboximpl()
            long r3 = androidx.compose.ui.unit.Velocity.m6878minusAH228Gc(r0, r2)
            androidx.compose.foundation.gestures.ScrollingLogic r7 = r6.this$0
            r2 = r6
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r6.J$0 = r0
            r6.J$1 = r3
            r6.label = r9
            java.lang.Object r7 = r7.m830doFlingAnimationQWom1Mo(r3, r2)
            if (r7 != r5) goto L70
            return r5
        L69:
            long r3 = r6.J$1
            long r0 = r6.J$0
            kotlin.ResultKt.throwOnFailure(r7)
        L70:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r12 = r7.m6884unboximpl()
            androidx.compose.foundation.gestures.ScrollingLogic r2 = r6.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r9 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r2)
            long r10 = androidx.compose.ui.unit.Velocity.m6878minusAH228Gc(r3, r12)
            r14 = r6
            kotlin.coroutines.Continuation r14 = (kotlin.coroutines.Continuation) r14
            r6.J$0 = r0
            r6.J$1 = r12
            r6.label = r8
            r2 = r12
            java.lang.Object r7 = r9.m5261dispatchPostFlingRZ2iAVY(r10, r12, r14)
            if (r7 != r5) goto L1b
            return r5
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
