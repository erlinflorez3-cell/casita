package com.google.android.play.core.ktx;

import android.app.Activity;
import com.google.android.gms.common.annotation.NoNullnessRewrite;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
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
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!4i\bDZc|\u0004G\u00068\u000b<B\u0007Ӭ4\u0012\u000e\u0007nj?3Le^.Zݷ2\u000f\u0002{<$a$yCI^\"Ԃ*\teNogtKr\u001bQƤ\u001e\u0016'iTI\u0004x$\u070fM̓FoM4e\u0010K;xtd\bH2P8*\t\u000f\u001eBH>{+GY\u0012*0no\u0001ĬK̂\t\u001a \rVP\u000f&tg\u0015?hncŽ=,3sPX?e@~]\r\r]U\u0018'm$+NCM\u001b5U\u0013\u0007\u0001^m\u0010\u0006н{ݾl'59a\u0019eEp\u007fB%KQ\u0013ƞ\u00017\u0005\u000bab\u001c'q`\u0012]\u0001\u0014.v\t\u000f%<J\u001fLΩρ2-(zۅ\u0012H"}, d2 = {"@d`BX:M@\u0019\u0010~^>", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EK\b\u0013+\u0011m\u0018IvnBY\u000f$7\u007f_\u001bMT?kF\u0002\u001eik\u000f", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EK\b\u0013+\u0011m\u0018IvnBY\u000f$7\u007f_\u001bMT?kF\u0006\u0011q];\u0007p\u0002", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\f\u001e\u0013[9\fF\u0004%~f}1;m(w:CLo40|dj5\tc9$]-Q[U0e\u001cpG!\u001cj\u001dR4\r\u0013#\u001f.wS;(\u0018(X\u0006EqVO|\u00131{l\f]\fP{^_>.hDh5", ":`d;V/+S*\u0003zp", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@de6X>\"\\\u001a\t", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\f\u001e\u0013[9\fF\u0004%~f}1;m(w:CLo40|dj5\tc9$]#PK[6`Q<9\u001f\u001d$iL:\u0011\u0016]P8D+5)\u0010uK\fEj\b\f_\n>i}LZ\u000f\u0011\u0005\u001cqUrfPf_CTAVf*vUL\u001dm>:6wz\u001a%>74\u0014\u000bZ\u0015{\u001cwqtQ)\n<->{%$Oxd@}7\u001bZ\u007f\u0002\u001b\b\u001c[0p>\u007f}12m\u0007\u0015Q\u0015C^v$\u0002", "@t]!T:D", "\"", "B`b8", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Vk\u001cB\u0005n$U\f&\r", "=m2.a*>Z\u0019}", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\u0003\u001f%\u0011~\nJ|3~Hy.=C|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u0019\u0001s\u000bcP+rM\u0001\u001d\u00129S\u0012Jl\n\f$W\u0013tyQZ\u0019Wu$yK2>\n@duX=\u000fi&m\u000e)\u0007Y?:\"#G", "Bqh\u001cY->`", "", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "3kT:X5M", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n#Y\u0007\u001f\u0015p\u00127VCBA\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(62", "8`e.!*H[a\u0001\u0005h.\u0004\twa\t'\tJ\u0005\u0016_Cz\u0019J?0<U\u0012hE| ;M\fIj:f\"hr=\u0007utT\u0006:AWU(pP|J\u0014\fg\u000e_/\r\u0017SG3\u0002"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ReviewManagerKtxKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewManagerKtxKt.requestReview(null, this);
        }
    }

    public static final Object launchReview(ReviewManager reviewManager, Activity activity, ReviewInfo reviewInfo, Continuation<? super Unit> continuation) {
        Task<Void> taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity, reviewInfo);
        Intrinsics.checkNotNullExpressionValue(taskLaunchReviewFlow, "launchReviewFlow(...)");
        Object objRunTask$default = runTask$default(taskLaunchReviewFlow, null, continuation, 2, null);
        return objRunTask$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunTask$default : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object requestReview(com.google.android.play.core.review.ReviewManager r5, kotlin.coroutines.Continuation<? super com.google.android.play.core.review.ReviewInfo> r6) {
        /*
            boolean r0 = r6 instanceof com.google.android.play.core.ktx.ReviewManagerKtxKt.AnonymousClass1
            if (r0 == 0) goto L41
            r4 = r6
            com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 r4 = (com.google.android.play.core.ktx.ReviewManagerKtxKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L41
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r2 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L47
            kotlin.ResultKt.throwOnFailure(r2)
        L26:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            return r2
        L2a:
            kotlin.ResultKt.throwOnFailure(r2)
            com.google.android.gms.tasks.Task r2 = r5.requestReviewFlow()
            java.lang.String r0 = "requestReviewFlow(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r4.label = r1
            r1 = 0
            r0 = 2
            java.lang.Object r2 = runTask$default(r2, r1, r4, r0, r1)
            if (r2 != r3) goto L26
            return r3
        L41:
            com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 r4 = new com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1
            r4.<init>(r6)
            goto L16
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.ReviewManagerKtxKt.requestReview(com.google.android.play.core.review.ReviewManager, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object runTask(Task<T> task, final Function0<Unit> function0, Continuation<? super T> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                function0.invoke();
            }
        });
        if (!task.isComplete()) {
            final Function1<T, Unit> function1 = new Function1<T, Unit>() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t2) {
                    cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(t2));
                }
            };
            task.addOnSuccessListener(new OnSuccessListener(function1) { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$sam$com_google_android_gms_tasks_OnSuccessListener$0
                private final /* synthetic */ Function1 function;

                {
                    Intrinsics.checkNotNullParameter(function1, "function");
                    this.function = function1;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(@NoNullnessRewrite(reason = "Can be null for Task<Void> but this is uncommon.") Object obj) {
                    this.function.invoke(obj);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(exception)));
                }
            });
        } else if (task.isSuccessful()) {
            cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(task.getResult()));
        } else {
            Exception exception = task.getException();
            Intrinsics.checkNotNull(exception);
            cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(exception)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ Object runTask$default(Task task, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function0 = new Function0<Unit>() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt.runTask.2
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return runTask(task, function0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(SendChannel<? super E> sendChannel, E e2) {
        Intrinsics.checkNotNullParameter(sendChannel, "<this>");
        return ChannelResult.m10509isSuccessimpl(sendChannel.mo10484trySendJP2dKIU(e2));
    }
}
