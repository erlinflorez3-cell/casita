package androidx.work;

import androidx.work.Operation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDZc|\u0004G\u0006H\u001e<Ȑ\u0017\"Z\u0011 \u0007\u0015j\u007fӋ\u000bϕG\u008cʂW*\u001dlڗ4&c$wZшY\u001c"}, d2 = {"/vP6g", "\u001a`]1e6BR,H\rh9\u0003R\u0019p\u007f5wO\u0005! \u0006]\u001d8\u0006%sGm}\u0015M\u0004\u001c#", "\u001a`]1e6BR,H\rh9\u0003R\u0019p\u007f5wO\u0005! \u001d", "uKP;W9HW\u0018\u0012Dp6\n\u000fxO\u000b(\t<\u0010\u001b!PEtB\u00014<]\u0007i5w#8]R?t4,^FkB\u0016g5^r6KVW\u0002 9w9%\u000e$\u0015J4\u000fNC>)nBFt", "Ena8 9N\\(\u0003\u0003^s\u0003\u0018B_\r(\u0003@|%\u0017"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class OperationKt {

    /* JADX INFO: renamed from: androidx.work.OperationKt$await$1, reason: invalid class name */
    /* JADX INFO: compiled from: Operation.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 7, 1}, pn = "", xi = 176, xs = "")
    @DebugMetadata(c = "drixvqm\u00039\u0004|\u0001z>`\u0003x\u0007v\u000b\u0001\b\be\u0010", f = "\u001c<0<*<053q.6", i = {0}, l = {39}, m = "0G2;G", n = {"\u0013jjOe\u001aC^7CZm@P"}, s = {"xQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object await(androidx.work.Operation r7, kotlin.coroutines.Continuation<? super androidx.work.Operation.State.SUCCESS> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.work.OperationKt.AnonymousClass1
            if (r0 == 0) goto L84
            r6 = r8
            androidx.work.OperationKt$await$1 r6 = (androidx.work.OperationKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L84
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r2 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L8a
            java.lang.Object r0 = r6.L$0
            com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0
            kotlin.ResultKt.throwOnFailure(r2)
        L2a:
            java.lang.String r0 = "result.await()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
        L31:
            kotlin.ResultKt.throwOnFailure(r2)
            com.google.common.util.concurrent.ListenableFuture r4 = r7.getResult()
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L49
            java.lang.Object r2 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L92
            goto L2a
        L49:
            r6.L$0 = r4
            r6.label = r1
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
            r3.<init>(r0, r1)
            r3.initCancellability()
            r2 = r3
            kotlinx.coroutines.CancellableContinuation r2 = (kotlinx.coroutines.CancellableContinuation) r2
            androidx.work.ListenableFutureKt$await$2$1 r1 = new androidx.work.ListenableFutureKt$await$2$1
            r1.<init>(r2, r4)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            androidx.work.DirectExecutor r0 = androidx.work.DirectExecutor.INSTANCE
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r4.addListener(r1, r0)
            androidx.work.ListenableFutureKt$await$2$2 r0 = new androidx.work.ListenableFutureKt$await$2$2
            r0.<init>(r4)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r2.invokeOnCancellation(r0)
            java.lang.Object r2 = r3.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L81
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L81:
            if (r2 != r5) goto L2a
            return r5
        L84:
            androidx.work.OperationKt$await$1 r6 = new androidx.work.OperationKt$await$1
            r6.<init>(r8)
            goto L16
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L92:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            if (r0 != 0) goto L9c
            r0 = r1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L9c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, Continuation<? super Operation.State.SUCCESS> continuation) throws Throwable {
        Object result;
        ListenableFuture<Operation.State.SUCCESS> result2 = operation.getResult();
        Intrinsics.checkNotNullExpressionValue(result2, "result");
        if (result2.isDone()) {
            try {
                result = result2.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e2;
            }
        } else {
            InlineMarker.mark(0);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            result2.addListener(new ListenableFutureKt$await$2$1(cancellableContinuationImpl2, result2), DirectExecutor.INSTANCE);
            cancellableContinuationImpl2.invokeOnCancellation(new ListenableFutureKt$await$2$2(result2));
            Unit unit = Unit.INSTANCE;
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            InlineMarker.mark(1);
        }
        Intrinsics.checkNotNullExpressionValue(result, "result.await()");
        return result;
    }
}
