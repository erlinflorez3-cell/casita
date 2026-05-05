package kotlinx.coroutines.rx2;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferedChannel;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0013\u007f\u0007|jA0ZeP\u008cZS8\u000fs{:+c$\u007fDC٥ }8ޛwPm˧|I\u000b\u0011S\u0011\u0016\u0016?iZI\u0006~m\u0014\u001f2\tnm4}uM;pt|\u0004N4b=ѩ\t\u0003 -V\u0014?\u0001QS$\u0012^I7L\u001b\u001b[\u000f2\u00124GP\u0005,g\u007fNdO3q\u0003G1\u000f\u0002B|0\u00106\u000bZ%HZ'CǸ(2ӡ?ʺ߱\u0019%a\u0011OjiN\u001b? F5n54CKyWlݙF(Ǽ*˽ոar4jMWn\u001c?+}l\u0012dV6\u0006\f\u0014\rj\r>\n5ZF-HyN\"\u0004\u0004\u0001XXX\u0012bR\u0002\u0011`d\u001eS\u0006\nڂ;ӘfSi;\u001f\u0006҂\u007f\u0019"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0014c`5\u007f\u000bJt29d\r$Avs1ILDk;s", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ Dm\u0015\fP?Dt4%j", "\u001ah^{e,:Q(\u0003\f^?Fr,s\u007f5\r@\u000el", "\u001ah^{e,:Q(\u0003\f^?Fp+y|(e=\u000f\u0017$Xo\u001b\u0012", "\nh]6g\u0005", "u(E", "-rd/f*KW$\u000e~h5", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "\u001ah^{e,:Q(\u0003\f^?F\b3s\u000b2\n<}\u001e\u0017U9l@\u00050?gy\u001d>mk", "=m29b:>R|}zf7\u0007\u0018/n\u000f", "", "=mBBU:<`\u001d{z", "AtQ", "=mBBV*>a'", "B", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "=m=2k;", "=m2<`7ES(~", "=m4?e6K", ExifInterface.GPS_MEASUREMENT_3D, "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class SubscriptionChannel<T> extends BufferedChannel<T> implements Observer<T>, MaybeObserver<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _subscription$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SubscriptionChannel.class, Object.class, "_subscription$volatile");
    private volatile /* synthetic */ Object _subscription$volatile;

    public SubscriptionChannel() {
        super(Integer.MAX_VALUE, null, 2, 0 == true ? 1 : 0);
    }

    private final /* synthetic */ Object get_subscription$volatile() {
        return this._subscription$volatile;
    }

    private final /* synthetic */ void set_subscription$volatile(Object obj) {
        this._subscription$volatile = obj;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void onClosedIdempotent() {
        Disposable disposable = (Disposable) _subscription$volatile$FU.getAndSet(this, null);
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        close(null);
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        close(th);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t2) {
        mo10484trySendJP2dKIU(t2);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        _subscription$volatile$FU.set(this, disposable);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t2) {
        mo10484trySendJP2dKIU(t2);
        close(null);
    }
}
