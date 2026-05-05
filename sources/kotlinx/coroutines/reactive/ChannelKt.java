package kotlinx.coroutines.reactive;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.reactivestreams.Publisher;
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
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄLeV4ZS0\u000f\u0004,Břs$ B[W Ԃ0\twTwi~J!\u000bq\u00106&\u0007lDUezm\u0012U2RqO3{nk<'ҡ|ӯ$20<\u0012+\u000f\u001fBN x\u000bC\u0012\f@6`r@ĥ\u001bM- \"\bN G\u001e\u000bh~<NlkAG#1q\tM?\u0006>\u0006e\u0013VV7\r=aL1`9;Ֆ3S+\rb]O\u0003\u0006qk\u0006\u0019--+Wzo6\u0007\bZ\u001a۩S\u0017"}, d2 = {"1n[9X*M", "", "\"", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nk'\u0014Ns\u001c?v2\u000b", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uK^?ZuKS\u0015|\nb=|\u0017>r\u007f$\u0004NJ\u0002'Dv\u0012Jy%B/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F_gA\u0014X:\u0014\tb\u000b\"xQA/\u00170R\u0002I2^\u0016\u001f\u001d9s\u0001>e\u0014Q\u0003j9(.dWU)\u0001CJG,\u0014a\u0011_\u001bk\u0010", "Bn25T5GS ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "@d`BX:M", "", "=oT;F<;a\u0017\f~i;\u0001\u00138", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\t@|\u0015&K\u0001\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ChannelKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.ChannelKt$collect$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelKt.collect(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[Catch: all -> 0x007e, TryCatch #4 {all -> 0x007e, blocks: (B:22:0x0060, B:24:0x0068, B:25:0x0070), top: B:45:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:22:0x0060, B:24:0x0068, B:25:0x0070), top: B:45:0x0060 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005d -> B:45:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object collect(org.reactivestreams.Publisher<T> r7, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.reactive.ChannelKt.AnonymousClass1
            if (r0 == 0) goto L31
            r6 = r9
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r6 = (kotlinx.coroutines.reactive.ChannelKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L31
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r0 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 != r3) goto L3d
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r2 = r6.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            goto L37
        L31:
            kotlinx.coroutines.reactive.ChannelKt$collect$1 r6 = new kotlinx.coroutines.reactive.ChannelKt$collect$1
            r6.<init>(r9)
            goto L16
        L37:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L3b
            goto L60
        L3b:
            r1 = move-exception
            goto L83
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L45:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = 0
            kotlinx.coroutines.channels.ReceiveChannel r2 = toChannel$default(r7, r0, r3, r4)
            kotlinx.coroutines.channels.ChannelIterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L82
        L51:
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L80
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L80
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L80
            r6.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r1.hasNext(r6)     // Catch: java.lang.Throwable -> L80
            if (r0 != r5) goto L60
            return r5
        L60:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L70
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L7e
            r8.invoke(r0)     // Catch: java.lang.Throwable -> L7e
            goto L51
        L70:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7e
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r4)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L7e:
            r1 = move-exception
            goto L83
        L80:
            r1 = move-exception
            goto L83
        L82:
            r1 = move-exception
        L83:
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ChannelKt.collect(org.reactivestreams.Publisher, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final <T> Object collect$$forInline(Publisher<T> publisher, Function1<? super T, Unit> function1, Continuation<? super Unit> continuation) {
        ReceiveChannel channel$default = toChannel$default(publisher, 0, 1, null);
        try {
            ReceiveChannel receiveChannel = channel$default;
            ChannelIterator it = channel$default.iterator();
            while (true) {
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                Object objHasNext = it.hasNext(null);
                InlineMarker.mark(1);
                if (!((Boolean) objHasNext).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                    ChannelsKt.cancelConsumed(channel$default, null);
                    InlineMarker.finallyEnd(1);
                    Unit unit2 = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
                function1.invoke((Object) it.next());
            }
        } finally {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017X|C\u0005z$ieP6\u0002\u0010%APhU\u001c/\nzKf\u0006\u0006qrO\u00032kt\fmU\r`mIX#6;&[PEam[@%?Gw\u0018V+\fc6=\u0010\u0006 t8 ")
    @InterfaceC1492Gx
    public static final /* synthetic */ ReceiveChannel openSubscription(Publisher publisher, int i2) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel(i2);
        publisher.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static /* synthetic */ ReceiveChannel openSubscription$default(Publisher publisher, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = 1;
        }
        return openSubscription(publisher, i2);
    }

    public static final <T> ReceiveChannel<T> toChannel(Publisher<T> publisher, int i2) {
        SubscriptionChannel subscriptionChannel = new SubscriptionChannel(i2);
        publisher.subscribe(subscriptionChannel);
        return subscriptionChannel;
    }

    public static /* synthetic */ ReceiveChannel toChannel$default(Publisher publisher, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = 1;
        }
        return toChannel(publisher, i2);
    }
}
