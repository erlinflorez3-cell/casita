package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0013\u007f\u0007tsA0JfP.hS2\u000fq|<$q$yّS\u007f(Ԃ:\t}M\bitϺh\u000bk\u0015\u0016\u0018\tjrI\u0004y\u000e\u001c\u001d4ZuO5]o\u00049\u000fw|ӓ^ݨ&8\b\t\u0019N8M(v)Bk\u000e\u0018ؓNpbX\u001dO\u0015\u001aX\u0006l!1(jif<Xnm:u#1lrR5eH|{\u0014\rÙe˼zc$3N@M/3]\u001b\rb]O\u0003\u0006qk\u0010\t)-ǢWs\u007f<h\u0002$\u0015qO;`\u000b@j\u0011if\u001c);O*K~\u0019Hy\u0001Ԉ\u001b<,\u0014\u0016)X.s\u001a\u0015\u000b&U\u0003\u007fkF`\u0004nBFz\u001097'\u0006đ99ClacK\u0019\u00157*\u0010=\"1\u000f\u0007!\nc\u05fed%"}, d2 = {"3lXA43E", "", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "1gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019\"q>-\u001cljLPa6[\u00017VPW,j\u001cp@\u0010\u001bc\u000eU9VqY?$rU7|\u000b(R\u000b;oVr\u001c\u0018DqtK \u000eQ\u0007\u001f\u0006P-qFg)WQJTf3t\bn!fC\u0010gzv\u0015,d\u001a5\u0006\u0005UZ\\O~geVn", "3lXA43E7!\n\u0002", "1n]@h4>", "", "3lXA43E7!\n\u0002\u001d\r\u0004\u0013AK\u000f\"u\u001e\u0004\u0013 Po\u0015J\\4", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019\"q>-\u001cljLPa6[\u00017VPW,j\u001cp@\u0010\u001bc\u000eU9VqY?$rU7|\u000b(R\u000b;oV\u0001|\u0014?ywF_YE\u0004\"\u007fQ8lOYmC%KNq.m\u001c[,`DCyWX\u001e\u0017yLw\u0011w\\\u0013<<vlgE(P", "@dR2\\=>/'_\u0002h>", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "1n]@h4>/'_\u0002h>", ">q^1h*>7\"", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
final /* synthetic */ class FlowKt__ChannelsKt {
    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return new ChannelAsFlow(receiveChannel, true, null, 0, null, 28, null);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, Continuation<? super Unit> continuation) {
        Object objEmitAllImpl$FlowKt__ChannelsKt = emitAllImpl$FlowKt__ChannelsKt(flowCollector, receiveChannel, true, continuation);
        return objEmitAllImpl$FlowKt__ChannelsKt == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmitAllImpl$FlowKt__ChannelsKt : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:13:0x0039, B:19:0x005e, B:24:0x0073, B:26:0x007b, B:23:0x0070, B:18:0x005a), top: B:41:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008d -> B:29:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector<? super T> r7, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L33
            r6 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r6 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L33
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L54
            if (r1 == r3) goto L45
            if (r1 != r4) goto L3d
            boolean r9 = r6.Z$0
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r8 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            goto L39
        L33:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r6 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r6.<init>(r10)
            goto L13
        L39:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L9a
            goto L90
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L45:
            boolean r9 = r6.Z$0
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r8 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            goto L70
        L54:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.flow.FlowKt.ensureActive(r7)
            kotlinx.coroutines.channels.ChannelIterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L9a
        L5e:
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L9a
            r6.L$1 = r8     // Catch: java.lang.Throwable -> L9a
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L9a
            r6.Z$0 = r9     // Catch: java.lang.Throwable -> L9a
            r6.label = r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r1.hasNext(r6)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r5) goto L6f
            goto L91
        L6f:
            goto L73
        L70:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L9a
        L73:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L92
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L9a
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L9a
            r6.L$1 = r8     // Catch: java.lang.Throwable -> L9a
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L9a
            r6.Z$0 = r9     // Catch: java.lang.Throwable -> L9a
            r6.label = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r7.emit(r0, r6)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r5) goto L90
            return r5
        L90:
            goto L5e
        L91:
            return r5
        L92:
            if (r9 == 0) goto L97
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r2)
        L97:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9a:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            if (r9 == 0) goto La2
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r1)
        La2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return ChannelFlowKt.asChannelFlow(flow).produceImpl(coroutineScope);
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return new ChannelAsFlow(receiveChannel, false, null, 0, null, 28, null);
    }
}
