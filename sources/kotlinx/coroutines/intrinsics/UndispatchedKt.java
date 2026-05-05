package kotlinx.coroutines.intrinsics;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.ThreadContextKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!,i\bDJc|\u0004W\u00068\u000bDB\u0007\":ߚ\u007f\u0007llA0ZeP\u008cZS@\u000fs{:&c$\bCCU(~*\t]Wo˧vJp\u000bKƤ\u001ec\u0007̓DI\u0004w}\u0014\u0015˰Po_5SnK:\t\u0011<\u00040428@\u0005\u0011\":N x\u000bC\u0012\r@3PtJT#L3\u001e@\bn$\u000f#tg\u00156xvk@G)\u0013kRNm`^\u007f\u0014εТX'\u001b}yr9HO7+$\u0002\u0007'TaΪ\u0011@\u0012?\u000bg5'SO\u0004YFXF\u0015C4\u007f\u0011kw>\\KQ\u0011155g\u0005QO\u001e*\bzB\rL\f\u001e\f7J>-`g6\u0011Cx\u0003UVO0bp\u0002ѐe6\u001d0Fđڢ=\u001bt]y\u0010'[O}\u001b\fL'!p'żb\u000f\u0001\u0017!S\u0006QYWP?XNPZkv4tp\u0007B\u0004vG0T\n\u001bF8+6k;3!2\u0002XLw|\u0015bxS0SvC2r&9@\b:^rfʰoPZcrҊܖ T\u0015\n P.j\u0010>7$>RojoҔ[^2+?hGY5l<`inADio cbvBPLd\u0015X\u0015T\u0002\u001c\u000bh65JPz\u0014\b}ZM:\u0017`S8ʌ:Ϣ5."}, d2 = {"AsP?g\nH`#\u000f\nb5|x8d\u00046\u0007<\u0010\u0015\u001aGn", "", Global.BLANK, "\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "@dR2\\=>`", "1n\\=_,MW#\b", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007<i'*\u0017J7t6g~ef9\u0005r\u00025|1VSR5&P|J\u001e\"i\u0012W+\u001bN7K-}H@/\u0004;M\fD>D|", "AsP?g\u001cGR\u001d\r\u0006Z;z\f/di5h@\u0010'$P", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00133c\t \u0015w#8]R?t4s", "0k^0^", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n#W\b+7K ;WSJo=\u001ejOf5\u0018_uUr0I\u00168)aRpLix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014OX\\F%yB#fuPC\u000fL'i\f],2", "AsP?g\u001cGR\u001d\r\u0006Z;z\f/di5h@\u0010'$PS\u0010E\u000125H\u0002(7w&=", "CmS6f7:b\u0017\u0002z]\u0019|\u0017?l\u000f", "Ag^B_+-V&\t\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "AsP?g\tE]\u0017\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UndispatchedKt {
    public static final <R, T> void startCoroutineUndispatched(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r2, Continuation<? super T> continuation) {
        Continuation continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext context = continuationProbeCoroutineCreated.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
            try {
                DebugProbesKt.probeCoroutineResumed(continuationProbeCoroutineCreated);
                Object objWrapWithContinuationImpl = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r2, continuationProbeCoroutineCreated) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r2, continuationProbeCoroutineCreated);
                if (objWrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    Result.Companion companion = Result.Companion;
                    continuationProbeCoroutineCreated.resumeWith(Result.m8980constructorimpl(objWrapWithContinuationImpl));
                }
            } finally {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            continuationProbeCoroutineCreated.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public static final <T, R> Object startUndispatchedOrReturn(ScopeCoroutine<? super T> scopeCoroutine, R r2, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object completedExceptionally;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r2, scopeCoroutine) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r2, scopeCoroutine);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if (!(objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                return JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
            }
            CompletedExceptionally completedExceptionally2 = (CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core;
            Throwable th2 = completedExceptionally2.cause;
            Throwable th3 = completedExceptionally2.cause;
            Continuation<? super T> continuation = scopeCoroutine.uCont;
            if (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) {
                throw StackTraceRecoveryKt.recoverFromStackFrame(th3, (CoroutineStackFrame) continuation);
            }
            throw th3;
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(ScopeCoroutine<? super T> scopeCoroutine, R r2, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) throws Throwable {
        Object completedExceptionally;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, r2, scopeCoroutine) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r2, scopeCoroutine);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if (!(objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                return JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
            }
            CompletedExceptionally completedExceptionally2 = (CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core;
            Throwable th2 = completedExceptionally2.cause;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != scopeCoroutine) {
                Throwable th3 = completedExceptionally2.cause;
                Continuation<? super T> continuation = scopeCoroutine.uCont;
                if (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) {
                    throw StackTraceRecoveryKt.recoverFromStackFrame(th3, (CoroutineStackFrame) continuation);
                }
                throw th3;
            }
            if (!(completedExceptionally instanceof CompletedExceptionally)) {
                return completedExceptionally;
            }
            Throwable th4 = ((CompletedExceptionally) completedExceptionally).cause;
            Continuation<? super T> continuation2 = scopeCoroutine.uCont;
            if (DebugKt.getRECOVER_STACK_TRACES() && (continuation2 instanceof CoroutineStackFrame)) {
                throw StackTraceRecoveryKt.recoverFromStackFrame(th4, (CoroutineStackFrame) continuation2);
            }
            throw th4;
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    private static final <T> Object undispatchedResult(ScopeCoroutine<? super T> scopeCoroutine, Function1<? super Throwable, Boolean> function1, Function0<? extends Object> function0) throws Throwable {
        Object completedExceptionally;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = function0.invoke();
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if (!(objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                return JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
            }
            CompletedExceptionally completedExceptionally2 = (CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core;
            if (function1.invoke(completedExceptionally2.cause).booleanValue()) {
                Throwable th2 = completedExceptionally2.cause;
                Continuation<? super T> continuation = scopeCoroutine.uCont;
                if (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) {
                    throw StackTraceRecoveryKt.recoverFromStackFrame(th2, (CoroutineStackFrame) continuation);
                }
                throw th2;
            }
            if (!(completedExceptionally instanceof CompletedExceptionally)) {
                return completedExceptionally;
            }
            Throwable th3 = ((CompletedExceptionally) completedExceptionally).cause;
            Continuation<? super T> continuation2 = scopeCoroutine.uCont;
            if (DebugKt.getRECOVER_STACK_TRACES() && (continuation2 instanceof CoroutineStackFrame)) {
                throw StackTraceRecoveryKt.recoverFromStackFrame(th3, (CoroutineStackFrame) continuation2);
            }
            throw th3;
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
