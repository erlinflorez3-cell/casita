package kotlin;

import com.dynatrace.android.agent.Global;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007tʑA0ZeP.XU2\u000f\u0002{<$a'yCQU\"}(\u000eWNugvJ`\u000eK\u000f\u001c\u0016\u0001j2I[xs܈74HģM2uqC8ntf\u00110428@\u0004\u0011\u001c:HVv)D{\u0012\"2Pp\u0001R;OE`\"=L#\u0019Qbf^DXxm<?#9݃RP7_f{{\u000eVV7\r-ѭ.3P=E\u00175S9\u0006\u0001]O\u0007OsS\u0004\u0017,U/ʁwW<^\u0010\u0018#2g\r\u0014ö͉`\u0005_hT;9b{K\u0007\rX{\t\u0003%<:\u05faLπ\u0007Ͷ1\u001at\u001cV\u0012\u0003\bkH`\u0006nD\u0016y\u0010;E'0j9O3\u001aW`K#^?\f\u0005\u0013\u001f3\u0001t\"\nU\u001ed%\u001djv\u007f6aJMP^\u000ei?\u0004\u0003\u001fg0,\u00144W\u0002Ez?3E)ھ_9)'\u001c\u000eVM\u007f~\u0015dxU\u007fQvEPp\\7Ҋ\r\fh[-\u001eyhlXZ*}&b\u0017\u0016\u000e#\"lwr S!\u0015cŹmj[wR.=\u0002OY%jް[9lO}\u0002q#yR=1_>h\u0005f\u0005bU\u0012[jEJ>Xl wBb^\u000e#2\u0006\u000fJS\\5'c-HI<\t˝;ȤcZv0OjA-\u001bs4x\u0019\u0003f[\u001ft}ww.Sʣ.έEQ=ӧvg0rL|Q\u00125HVďi֙KP\u0005\u0018{a\n-f[G_Gp\u0019\u000e\u000f3B\n=ERsuQS\u0013U{\r}\u001f=~-\u0016\rzz<hzN_V-!%c!%\u0018h\u0010{wE)L\u0012Xߏ_>OxYʞHҡ<~\r\u001f,4Q\t0\rM5S+-\u0018\u000e\u0013]\u001a\u0010n@۳:ՙaχ֑xg\f,q(@p_dJ=NH\b\u0004\u0015а0к\u0007BP۳̮\bD\u00114\u0013RȎE\u0006"}, d2 = {"\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@n\u0015!RoqD\u0002,\u000b", "\"", Global.BLANK, "\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@n\u0015!Roc", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "D`[BX", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002\u0012g", "1n]A", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0010b5MS,\u000e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "4t]0g0H\\", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "@dbB_;", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "1`[9E,<c&\r~o,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "1q^@f\rN\\\u0017\u000e~h5Z\u00137p\u0007(\u000bD\u000b ", "1ta?X5M4)\bxm0\u0007\u0012", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q51\u0017\u0014`E-8BA,\u0012<X\u0006Dh\u000fUs\u0018>ytKf\fV}\u001f~\u0017", "@dbB`,0W(\u0002", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "@t]\u0010T3E:#\t\u0006", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "!", "#", "\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@a' E~\u0012F\u007fz", "uKZ<g3B\\b]z^7i\t-u\r6\u007fQ\u0001w'Pm\u001d@\u0001.\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\J2X\u0006.KU\u0018*f_|M#\u0016c\u000e\\tj\u000fbP(wT3.\f6RW~O\u0006\b'\n~qlKXY1v\u001au?8>", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class DeepRecursiveScopeImpl<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {
    private Continuation<Object> cont;
    private Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function;
    private Object result;
    private Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeepRecursiveScopeImpl(Function3<? super DeepRecursiveScope<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block, T t2) {
        super(null);
        Intrinsics.checkNotNullParameter(block, "block");
        this.function = block;
        this.value = t2;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = this;
        this.result = DeepRecursiveKt.UNDEFINED_RESULT;
    }

    private final Continuation<Object> crossFunctionCompletion(final Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function3, final Continuation<Object> continuation) {
        final EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        return new Continuation<Object>() { // from class: kotlin.DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1
            @Override // kotlin.coroutines.Continuation
            public CoroutineContext getContext() {
                return emptyCoroutineContext;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object obj) {
                this.function = function3;
                this.cont = continuation;
                this.result = obj;
            }
        };
    }

    @Override // kotlin.DeepRecursiveScope
    public Object callRecursive(T t2, Continuation<? super R> continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = continuation;
        this.value = t2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.DeepRecursiveScope
    public <U, S> Object callRecursive(DeepRecursiveFunction<U, S> deepRecursiveFunction, U u2, Continuation<? super S> continuation) {
        Function3<DeepRecursiveScope<U, S>, U, Continuation<? super S>, Object> block$kotlin_stdlib = deepRecursiveFunction.getBlock$kotlin_stdlib();
        Intrinsics.checkNotNull(block$kotlin_stdlib, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function3 = this.function;
        if (block$kotlin_stdlib != function3) {
            this.function = block$kotlin_stdlib;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.cont = crossFunctionCompletion(function3, continuation);
        } else {
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.cont = continuation;
        }
        this.value = u2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.cont = null;
        this.result = obj;
    }

    public final R runCallLoop() {
        while (true) {
            R r2 = (R) this.result;
            Continuation<Object> continuation = this.cont;
            if (continuation == null) {
                ResultKt.throwOnFailure(r2);
                return r2;
            }
            if (Result.m8982equalsimpl0(DeepRecursiveKt.UNDEFINED_RESULT, r2)) {
                try {
                    Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function3 = this.function;
                    Object obj = this.value;
                    Object objWrapWithContinuationImpl = !(function3 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function3, this, obj, continuation) : ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(this, obj, continuation);
                    if (objWrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        Result.Companion companion = Result.Companion;
                        continuation.resumeWith(Result.m8980constructorimpl(objWrapWithContinuationImpl));
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    continuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(th)));
                }
            } else {
                this.result = DeepRecursiveKt.UNDEFINED_RESULT;
                continuation.resumeWith(r2);
            }
        }
    }
}
