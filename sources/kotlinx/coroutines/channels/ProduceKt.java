package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
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
@Metadata(bv = {}, d1 = {"Яb\u001d̉=!,i\bDZc|İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$i*yCQU\"}8\tWNu˧vJp\u000bK\u000f\f\u0016\u0001jBI]ތe\u0012%2JoU3UoK:htL\u0005(2(:\u0002\u0005\u0017\u001a2H\u0016v\u0013gYÈ*0nobV\u001dM\u000b\u001b@\u0006n,\u0007\u001ejhf<Xnm:]\"1k\tþeۢ4|[\u0010^55\u0011\u000fg.-P7{\u001bSX#\tX¹M\tgqk\f\u0019--+W{o6\u0007\tD\u001b1O\u001bg\u000b&\u000b\u0010\u0002\u000e\u0012&9P{rV\r8\u007f\u000b\u0002\u001d>\u0014\u000eL-v.=\"v\u000e\u001e5\u0005r\u0002?~\u000fnF\u0010|w5E3.?ڢ=\u001bl`(@ϭR7\n\u0015%̰\"\u000fr9ad\u0010p\u0015aZ&VQSF׀VT2Ykt4vh\u00028\fHG.8,\u00174\u00173As9Q,\u001c\bNDu\b\u001d`\u0017e\u001a}N@0\u0002.\\:\u001c\u001ckZc3\u0002ÏXb2(]\"Z\u001f\u000e\n\u0019&\u0003\u0011L#5\u0010|N~h\u0019bF\f;.EK\n\u001cq\re:vZ;Ps\u0018qX\u0007\u0016O<)\u000b\u0007fR[\u001c`l*22vi>\u0005\fH^\u000e)1m\u007fJ@Ϝ5\u0019b$\u000f\bٿFA\u000b#w˙g\u001e\u0003l94\u0005y$;\u000f/U|ruΟ\u0007OT|\u000f)]GW5'.m\"\u0017=-)\r~\u0002\n_gzR|r\u001cuc\u00178\u0016HU\u00025C\u0013\u001d\u0010A20?uwxe_`*L\u000b\u0010\n Qg\\}Űnz2wzPUl'$|d\u0019<\u0018f\u0010y\u0010E\u0011F\u0012is]THQ\u0017\niT7\u000b\u00067E+\u007f\u007f*\r;=E7\u001d\\}B/%imo\u007f0\nb=%#r\u00140s\u0018\u0006a\u007fk`GΒMY\u0005Mhغк\u0007BV\b͔\f`"}, d2 = {"/vP6g\nE]'~", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n f\b\u001fGk\u0016;;AEv4s{nkH\u000eg5\u0018{8O\u0016O<eP\u0002A\u001e\u001bhW/;\u0016\u0003hE.w\u000f\r\u0006\u000e6X\t?qJ\n \u001b?z\u007fF_\u0010UCr\u007fJ8lOi[\tKKN8mK\u0011[.X\u0004A \u001dsb\u0005eU.\b\u000b)", ">q^1h*>", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1`_.V0Mg", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\bUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchF\u001d\u0005,h4s\u0013c&o\u00048.!{)*lY.\u0018EQ\u0014n[\u0003gnUbg8\">qlF#rQE}'&!", "AsP?g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0013DU\u000b/\r", "=m2<`7ES(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d@\u0001.\u0018U\u0007\u001f>m#\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\bUJA.\u000f0R\u0015\u0005f\u000b\u0019 \u001eDnyBdY%\u0004\"\u007fQ8lOYM\tCNT8\u0011j\u0016n$`C\u0004)%yb\u001cxY,\u0019\u007f]\u001a\u0001\u001cZwpE(~B-\nCBLO~\\@}p$\\\u0004A\u0013Bar:x7\rBs\u0017t\u000eIv\u001cHgEjoCG15=@\u001cR\u0015a\u007fyH\u001ew#j\b\u001c,34\u0015nncO\u001dPJ\u0017Y5ep\u0001\u0015U\u0002GRo\u001c|", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\bUJA.\u000f0R\u0015\u0005f\u000b\u0019 \u001eDnyBdYE|\u0011~J)oT#<\nHBEo\u0014u\fl\u001ecDLyzw#*oT7\u001dEQ\u001b\u007f\\\nvkP\u0019\t\u0002\u0002HzeVTs^<b6\u001bX\u000bMx8b\u00042x6M9;>.\u0006[p\u0016Mb\u0003\u001e:&\"7/4K\u0017IT/KSD\u0018w&e\u0011WgF9bfulF\u001e\u000bg i~Bo\n5a\nHR<jj-\u0005Lj\u0001\u0019\u0012\u001amkoVM+c\u0005#pRk]\u0014~\fo\u0018#<_*Y\rh.p7+\u0016\u0005qA\f\u0003/", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ProduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ProduceKt$awaitClose$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ProduceKt.awaitClose(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitClose(kotlinx.coroutines.channels.ProducerScope<?> r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ProduceKt.AnonymousClass1
            if (r0 == 0) goto L2c
            r4 = r8
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r4 = (kotlinx.coroutines.channels.ProduceKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2c
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r1 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L3e
            if (r0 != r3) goto L36
            java.lang.Object r7 = r4.L$1
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            java.lang.Object r0 = r4.L$0
            kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
            goto L32
        L2c:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r4 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r4.<init>(r8)
            goto L16
        L32:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L89
            goto L83
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3e:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.coroutines.CoroutineContext r1 = r4.getContext()
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r1.get(r0)
            if (r0 != r6) goto L8e
            r4.L$0 = r6     // Catch: java.lang.Throwable -> L89
            r4.L$1 = r7     // Catch: java.lang.Throwable -> L89
            r4.label = r3     // Catch: java.lang.Throwable -> L89
            r0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0     // Catch: java.lang.Throwable -> L89
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L89
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L89
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L89
            r2.initCancellability()     // Catch: java.lang.Throwable -> L89
            r1 = r2
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1     // Catch: java.lang.Throwable -> L89
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch: java.lang.Throwable -> L89
            r6.mo10566invokeOnClose(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r1 = r2.getResult()     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L89
            if (r1 != r0) goto L80
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L89
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)     // Catch: java.lang.Throwable -> L89
        L80:
            if (r1 != r5) goto L83
            return r5
        L83:
            r7.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L89:
            r0 = move-exception
            r7.invoke()
            throw r0
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.awaitClose(kotlinx.coroutines.channels.ProducerScope, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object awaitClose$default(ProducerScope producerScope, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            function0 = new Function0() { // from class: kotlinx.coroutines.channels.ProduceKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return awaitClose(producerScope, function0, continuation);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return produce(coroutineScope, coroutineContext, i2, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, function2);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, CoroutineStart coroutineStart, Function1<? super Throwable, Unit> function1, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return produce(coroutineScope, coroutineContext, i2, BufferOverflow.SUSPEND, coroutineStart, function1, function2);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function1<? super Throwable, Unit> function1, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), ChannelKt.Channel$default(i2, bufferOverflow, null, 4, null));
        if (function1 != null) {
            producerCoroutine.invokeOnCompletion(function1);
        }
        producerCoroutine.start(coroutineStart, producerCoroutine, function2);
        return producerCoroutine;
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, Function2 function2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return produce(coroutineScope, coroutineContext, i2, function2);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i3, Object obj) {
        if ((1 & i3) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((2 & i3) != 0) {
            i2 = 0;
        }
        if ((4 & i3) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            function1 = null;
        }
        return produce(coroutineScope, coroutineContext, i2, coroutineStart, function1, function2);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i3 & 16) != 0) {
            function1 = null;
        }
        return produce(coroutineScope, coroutineContext, i2, bufferOverflow, coroutineStart, function1, function2);
    }
}
