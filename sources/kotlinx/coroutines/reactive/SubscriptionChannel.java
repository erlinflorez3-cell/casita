package kotlinx.coroutines.reactive;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferedChannel;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDZc|\u0004W\u00068é6B\r(4\u0012}\bnjO0Le^.Zݷ2\u000f\u0002{<řc$\u007fCCU \u0006*\t]Oo˧tJpŏk\u0011\fǝ\u0007i\\Oezm\u0012U1poo9]qM9'sd\u0006`?2<\b\u0007\u0019\u001aXKǘz|IO\u001a\u0017xF~Ej\r{\u0011`$ND.\u000e6\\\u0016Z|Z5cH=;\u0003\u0018N\u00159(>\u000b\\%F\u00033=zo.C@e=[9\u001c\u0016\u0015cs?1K\"A\u0013z?'aɞ:k͏\\\u007f\"(sU\u001bq\u000b&\u000b\u0011\u0018tT59d{K~\u001aX{\t\u0012%<2%L;\u0019:;\u001c~\b<6KɄUĖT\u0002fۍP\no</-\u00107;;1e\u007fii %ќ}U\u0014,,\u0019nOe+טbڦ\u001fl"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0001\u0013\u0015Vs\u001f<@\u0013EV\f\u001eDq!=QMDI7\u001a\u001eqa@\\", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ Dm\u0015\fP?Dt4%j", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@s%B/", "@d`BX:M", "", "\nh]6g\u0005", "uH\u0018#", "-rd/f*KW$\u000e~h5", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nn'\u0014Um\u001b@\u000249c\u0007u", "-qT>h,Lb\u0019}", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "=mA2V,Bd\u0019^\u0004j<|\u0019/d", "", "=mA2V,Bd\u0019]zj<|\u0019/d", "=m29b:>R|}zf7\u0007\u0018/n\u000f", "=mBBU:<`\u001d{z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "=m=2k;", "B", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "=m2<`7ES(~", "=m4?e6K", ExifInterface.GPS_MEASUREMENT_3D, "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\t@|\u0015&K\u0001\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class SubscriptionChannel<T> extends BufferedChannel<T> implements Subscriber<T> {
    private volatile /* synthetic */ int _requested$volatile;
    private volatile /* synthetic */ Object _subscription$volatile;
    private final int request;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _subscription$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SubscriptionChannel.class, Object.class, "_subscription$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _requested$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SubscriptionChannel.class, "_requested$volatile");

    public SubscriptionChannel(int i2) {
        super(Integer.MAX_VALUE, null, 2, 0 == true ? 1 : 0);
        this.request = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid request size: " + i2).toString());
        }
    }

    private final /* synthetic */ int get_requested$volatile() {
        return this._requested$volatile;
    }

    private final /* synthetic */ Object get_subscription$volatile() {
        return this._subscription$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void set_requested$volatile(int i2) {
        this._requested$volatile = i2;
    }

    private final /* synthetic */ void set_subscription$volatile(Object obj) {
        this._subscription$volatile = obj;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void onClosedIdempotent() {
        Subscription subscription = (Subscription) _subscription$volatile$FU.getAndSet(this, null);
        if (subscription != null) {
            subscription.cancel();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        close(null);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        close(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t2) {
        _requested$volatile$FU.decrementAndGet(this);
        mo10484trySendJP2dKIU(t2);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void onReceiveDequeued() {
        _requested$volatile$FU.incrementAndGet(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r3.request(r6.request - r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onReceiveEnqueued() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = get_requested$volatile$FU()
        L4:
            int r4 = r5.get(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_subscription$volatile$FU()
            java.lang.Object r3 = r0.get(r6)
            org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
            int r2 = r4 + (-1)
            if (r3 == 0) goto L29
            if (r2 >= 0) goto L29
            int r0 = r6.request
            if (r4 == r0) goto L34
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = get_requested$volatile$FU()
            int r0 = r6.request
            boolean r0 = r1.compareAndSet(r6, r4, r0)
            if (r0 != 0) goto L34
            goto L4
        L29:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_requested$volatile$FU()
            boolean r0 = r0.compareAndSet(r6, r4, r2)
            if (r0 == 0) goto L4
            return
        L34:
            int r0 = r6.request
            int r0 = r0 - r2
            long r0 = (long) r0
            r3.request(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.SubscriptionChannel.onReceiveEnqueued():void");
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        _subscription$volatile$FU.set(this, subscription);
        while (!isClosedForSend()) {
            int i2 = _requested$volatile$FU.get(this);
            if (i2 >= this.request) {
                return;
            }
            if (_requested$volatile$FU.compareAndSet(this, i2, this.request)) {
                subscription.request(this.request - i2);
                return;
            }
        }
        subscription.cancel();
    }
}
