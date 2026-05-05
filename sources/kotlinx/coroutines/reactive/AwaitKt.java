package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import org.reactivestreams.Publisher;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<;!&i\u0016DLcz\tI\u0006F\u000b6B\u0005(4\u0012\u000e\u0007nj?0LeV.Zݷ2\u000f\u0002{<řc$\u007fOCU }:%]Ȟ\u007fg5Iz\rIƤ\u0014\u0015!p<Kex$\u0011=2\tĪ}ݯQoK:x\u0019D\u000782h7\u001a\u0007\u0007ɝ8G8|\u000bE[\fX/npjV\u001bP\u001d\u001aX\u0005\u0005į?ɉ`g\\:`\u000bk?G%\u0019h\tMGa6ŧ[\fnZ7\u000f\u0007ad*n7{՝c٨\u0007\u0007`\\W-MwU\u0005/&G-O֕e5\u0001\u0006$\u0017;OS\\!&\r\u000f_g$-;QsK\u0017\rV\u007fAԏKʀ\b\u000e\u00140`J;$~\bT2\u0015tYó^\u0001\u0007H\u0010|q6]$.3qݔYƻUaI\u001afS\n\u0010%\u001ei\u007f\u000f#a٪\u001c_=!dya1\u0018?kH\u0015˪\u0018ǀq\u0004~c\u001aN\u0012<_\u007fuz10\u001d¦EZa)1m\u0012H\u000bf%\u0005\u0011laljH\u0007!5ݳuҊ\r\fhH|#y]lZB\u0010\u0014\u001bt\t\u0004ܱ!\u001f\u0005}L#5\u0010\u0015N\u0017i1ܜ\u001cܦ)/t8q\u0019y\u001co9%2USi߄oQ\u001f\u001aO>r\u0005\u001fepS<dj/:8Xl wBC|\u0014YԽ}ۇ 4::1\r#W\u001b\u001e\t@\u001d\u000beʳv\u000f'ZC&\u0013ijs7\u0001\u0001`~\u007f\u007fxw=-h(-OTM\u001b<Thgzíaȷ\u0003s\u000eY\u007fbU_\u0005\u0016$i,$$/QQ]SC\u0013\r@J\u0002[]\u0013r}g[+?z+\u000e??vC\u007f\b\u0019\u0007\\dxZgTE3=^љ'\""}, d2 = {"/vP6g\rB`'\u000e", "\"", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nk'\u0014Ns\u001c?v2\u000b", "uK^?ZuKS\u0015|\nb=|\u0017>r\u007f$\u0004NJ\u0002'Dv\u0012Jy%B/d&A|\u001d2V\r9uA(%weB\u0007qu,\u00010VPW<XavG\u001dg\u001etS'\u001e\u0001#H wF\u0001\t\u00051I\u007fJ>", "/vP6g\rB`'\u000edk\u000b|\n+u\u00077", "2dU.h3M", "uK^?ZuKS\u0015|\nb=|\u0017>r\u007f$\u0004NJ\u0002'Dv\u0012Jy%B/d%3~\u0012wT?Dm}\b\u0012ma7\u00169\u0013T\u00016NPWuZ\\\u007fG$!^\u0017N9VbcJ3rMG\u001b\u00170S\u000b\u0011,g\u0011\u0012\u001f14w>_\u0012\u0011c\u0012zA'w\u001c", "/vP6g\rB`'\u000edk\u0015\r\u00106", "/vP6g\rB`'\u000edk\f\u0004\u0017/", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uK^?ZuKS\u0015|\nb=|\u0017>r\u007f$\u0004NJ\u0002'Dv\u0012Jy%B/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F^gA\u0014X:\u0014\tb\u000b\"xQA/\u00170R\u0002I2^\u0016\u001f\u001d9s\u0001>e\u0014Q\u0003j9(.dWU)\u0001CJG,\u0014a\u0011_\u001bk\u0010", "/vP6g\u0013:a(", "/vP6g\u001aB\\\u001b\u0006z", "/vP6g\u001aB\\\u001b\u0006zH9[\t0a\u0010/\u000b", "/vP6g\u001aB\\\u001b\u0006zH9e\u00196l", "/vP6g\u001aB\\\u001b\u0006zH9\\\u0010=e", "/vP6g\u0016GS", ";nS2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0001\u0013\u0015Vs\u001f<@\r?X}u", "uK^?ZuKS\u0015|\nb=|\u0017>r\u007f$\u0004NJ\u0002'Dv\u0012Jy%B/d&A|\u001d2VV\u0005i>+\u001fxp=\u0010c:\u0018\u0004'CJ]0mR<%\u001e\u0011Zc50\t\u0016U\u000b+jM9hq)N\u00029wVr\u001c\u0018DqtK \u000eQ\u0007\u001f\u0006P-qFg)WQJTf3t\bn!fC\u0010gzv\u0015,d\u001a5\u0006\u0005UZ\\O~geVn", "5nc \\.GO b\u0004M,\n\u00113n{/iO|&\u0017'\u0003\f<\u000249c\u0007", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "AhV;T3'O!~", "", ";na2G/:\\\u0003\bzO(\u0004\u0019/P\r2\rD\u007f\u0017\u0016'\u0003\f<\u000249c\u0007", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\t@|\u0015&K\u0001\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class AwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitKt.awaitFirstOrElse(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14411<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C14411(Continuation<? super C14411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return AwaitKt.awaitSingleOrElse(null, null, this);
        }
    }

    public static final <T> Object awaitFirst(Publisher<T> publisher, Continuation<? super T> continuation) {
        return awaitOne$default(publisher, Mode.FIRST, null, continuation, 2, null);
    }

    public static final <T> Object awaitFirstOrDefault(Publisher<T> publisher, T t2, Continuation<? super T> continuation) {
        return awaitOne(publisher, Mode.FIRST_OR_DEFAULT, t2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object awaitFirstOrElse(org.reactivestreams.Publisher<T> r9, kotlin.jvm.functions.Function0<? extends T> r10, kotlin.coroutines.Continuation<? super T> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.reactive.AwaitKt.AnonymousClass1
            if (r0 == 0) goto L45
            r6 = r11
            kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1 r6 = (kotlinx.coroutines.reactive.AwaitKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L45
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r3 = r6.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L4b
            java.lang.Object r10 = r6.L$0
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            kotlin.ResultKt.throwOnFailure(r3)
        L2a:
            if (r3 != 0) goto L30
            java.lang.Object r3 = r10.invoke()
        L30:
            return r3
        L31:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlinx.coroutines.reactive.Mode r4 = kotlinx.coroutines.reactive.Mode.FIRST_OR_DEFAULT
            r6.L$0 = r10
            r6.label = r0
            r5 = 0
            r7 = 2
            r8 = 0
            r3 = r9
            java.lang.Object r3 = awaitOne$default(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L2a
            return r2
        L45:
            kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1 r6 = new kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1
            r6.<init>(r11)
            goto L16
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.AwaitKt.awaitFirstOrElse(org.reactivestreams.Publisher, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object awaitFirstOrNull(Publisher<T> publisher, Continuation<? super T> continuation) {
        return awaitOne$default(publisher, Mode.FIRST_OR_DEFAULT, null, continuation, 2, null);
    }

    public static final <T> Object awaitLast(Publisher<T> publisher, Continuation<? super T> continuation) {
        return awaitOne$default(publisher, Mode.LAST, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitOne(Publisher<T> publisher, Mode mode, T t2, Continuation<? super T> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ReactiveFlowKt.injectCoroutineContext(publisher, cancellableContinuationImpl2.getContext()).subscribe(new AwaitKt$awaitOne$2$1(cancellableContinuationImpl2, mode, t2));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object awaitOne$default(Publisher publisher, Mode mode, Object obj, Continuation continuation, int i2, Object obj2) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            obj = null;
        }
        return awaitOne(publisher, mode, obj, continuation);
    }

    public static final <T> Object awaitSingle(Publisher<T> publisher, Continuation<? super T> continuation) {
        return awaitOne$default(publisher, Mode.SINGLE, null, continuation, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "\u0007K\fGvw\u0016k]Kg\u0012Y)4]q`H(Dz\u0011b\u0003Gqo[y2z(PyG\rpwxO2Fy WY~aaV>tPF\u0017\u000f[ ]ZyC\u0010\t\u0011\t@*R=\u0010e'G}M\u0018@\u0011J=:~\u0013_GX\u001d\u0002\u0001_x1R#/\u0003 'JNe\u001b.&}8|{ :'Dhp_ .4EEsl)\u0001")
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitSingleOrElse(org.reactivestreams.Publisher r9, kotlin.jvm.functions.Function0 r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.reactive.AwaitKt.C14411
            if (r0 == 0) goto L42
            r6 = r11
            kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1 r6 = (kotlinx.coroutines.reactive.AwaitKt.C14411) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L42
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r3 = r6.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L48
            java.lang.Object r10 = r6.L$0
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            kotlin.ResultKt.throwOnFailure(r3)
        L27:
            if (r3 != 0) goto L2d
            java.lang.Object r3 = r10.invoke()
        L2d:
            return r3
        L2e:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlinx.coroutines.reactive.Mode r4 = kotlinx.coroutines.reactive.Mode.SINGLE_OR_DEFAULT
            r6.L$0 = r10
            r6.label = r0
            r5 = 0
            r7 = 2
            r8 = 0
            r3 = r9
            java.lang.Object r3 = awaitOne$default(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L27
            return r2
        L42:
            kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1 r6 = new kotlinx.coroutines.reactive.AwaitKt$awaitSingleOrElse$1
            r6.<init>(r11)
            goto L13
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.AwaitKt.awaitSingleOrElse(org.reactivestreams.Publisher, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gotSignalInTerminalStateException(CoroutineContext coroutineContext, String str) {
        CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, new IllegalStateException("'" + str + "' was called after the publisher already signalled being in a terminal state"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moreThanOneValueProvidedException(CoroutineContext coroutineContext, Mode mode) {
        CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, new IllegalStateException("Only a single value was requested in '" + mode + "', but the publisher provided more"));
    }
}
