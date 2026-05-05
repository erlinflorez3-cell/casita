package kotlinx.coroutines.reactive;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDRш|\u0004W\u00068é6B\r(4ߚ\u007f\u0007|jAӄLeV5ZS0\u0010s{J$cҕyCQU\"}(\nWNugvJ`\u000eK\u000f\u0014\u0017\u0001j2L[xs܈78HģM2uok9\u0011zF\u000702h7(\u0006A7:L\u001ex\u0013Cy\u000f\"4NtRR;R\u0015\u001e \fV /%֔kP<Pzf\u0003=1\u0011\u0002Dd&\u0016ܞCոKТX'\u001b\u0006*19PO5C6\u0004\u0007\u0015ds?9ӊ8Qݾl'5>\u0012yeJp\u007fB&qcUm\u0001;t\u0005\u007fq<-9e{Mf\rV\u000fA\u0010UJ\u0012&\u001e'v?]\u001et!&3#}\u001aT\u0019\u0006l\\\u0018z\u0010G_)\u000eNC9Iw\"mI\u001ff7*\fc̗%ъr!c٪^l#%lw\u007f<(̸i˓R\naƝ>\u0016~n\u001a0\u00142W\u007feɅ?;m©9٦=#)ǽɞL`"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0001\u0013\u0015Vs\u001f<@\u00125U{/;~\u0016\u001c]@IiA\"\u0012hn\u000f", "\"", "", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@s%B/", "1`_.V0Mg", "", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "@d`BX:MA\u001d\u0014z", "", "\nh]6g\u0005", "uH;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0015\u001aCx\u0017<}3~6\u000e!8m#\u0018^CHl;('>F|w", "AtQ@V9B^(\u0003\u0005g", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@\u000249c\u0007u", "1gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "B`Z2A,Qb\u0003\fcn3\u0004", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "=m=2k;", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "=m2<`7ES(~", "=m4?e6K", "B", "", "=mBBU:<`\u001d{z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ";`Z2E,Jc\u0019\r\n", "1`]0X3", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\t@|\u0015&K\u0001\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class ReactiveSubscriber<T> implements Subscriber<T> {
    private final Channel<T> channel;
    private final long requestSize;
    private Subscription subscription;

    /* JADX INFO: renamed from: kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ReactiveSubscriber<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReactiveSubscriber<T> reactiveSubscriber, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = reactiveSubscriber;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return this.this$0.takeNextOrNull(this);
        }
    }

    public ReactiveSubscriber(int i2, BufferOverflow bufferOverflow, long j2) {
        this.requestSize = j2;
        this.channel = kotlinx.coroutines.channels.ChannelKt.Channel$default(i2 == 0 ? 1 : i2, bufferOverflow, null, 4, null);
    }

    public final void cancel() {
        Subscription subscription = this.subscription;
        if (subscription == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscription");
            subscription = null;
        }
        subscription.cancel();
    }

    public final void makeRequest() {
        Subscription subscription = this.subscription;
        if (subscription == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscription");
            subscription = null;
        }
        subscription.request(this.requestSize);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        SendChannel.DefaultImpls.close$default(this.channel, null, 1, null);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.channel.close(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t2) {
        if (!ChannelResult.m10509isSuccessimpl(this.channel.mo10484trySendJP2dKIU(t2))) {
            throw new IllegalArgumentException(("Element " + t2 + " was not added to channel because it was full, " + this.channel).toString());
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        makeRequest();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object takeNextOrNull(kotlin.coroutines.Continuation<? super T> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.reactive.ReactiveSubscriber.AnonymousClass1
            if (r0 == 0) goto L4c
            r4 = r6
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r4 = (kotlinx.coroutines.reactive.ReactiveSubscriber.AnonymousClass1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L4c
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L3e
            if (r0 != r1) goto L53
            kotlin.ResultKt.throwOnFailure(r3)
            kotlinx.coroutines.channels.ChannelResult r3 = (kotlinx.coroutines.channels.ChannelResult) r3
            java.lang.Object r1 = r3.m10511unboximpl()
        L2f:
            java.lang.Throwable r0 = kotlinx.coroutines.channels.ChannelResult.m10503exceptionOrNullimpl(r1)
            if (r0 != 0) goto L52
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r0 == 0) goto L3d
            kotlinx.coroutines.channels.ChannelResult.m10503exceptionOrNullimpl(r1)
            r1 = 0
        L3d:
            return r1
        L3e:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlinx.coroutines.channels.Channel<T> r0 = r5.channel
            r4.label = r1
            java.lang.Object r1 = r0.mo10491receiveCatchingJP2dKIU(r4)
            if (r1 != r2) goto L2f
            return r2
        L4c:
            kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1 r4 = new kotlinx.coroutines.reactive.ReactiveSubscriber$takeNextOrNull$1
            r4.<init>(r5, r6)
            goto L19
        L52:
            throw r0
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.ReactiveSubscriber.takeNextOrNull(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
