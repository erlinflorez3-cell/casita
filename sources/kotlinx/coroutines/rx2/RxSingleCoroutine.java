package kotlinx.coroutines.rx2;

import io.reactivex.SingleEmitter;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&˛\bDRш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.`S2\u000fq}<$i%yّCU(\u0007*ޛUN}˧\u0017P`ŏQ\u000e.\u0016'j\\Oezm\u0012U1pp\u007fN]sK;xtd\b0<0<\u0012\u000b\u0011\u001c:HF͌)Hƚ\u0010\u00146F~A\u001b [\r2\u00124GP\u0005,f\u007fNlԟ3oƠ3#\u0011t\u000bd5kH|{\u0016vX5\u001a\u000faL9p;C$=S1\u0017\u0019m\u0010\u0015MuU\u000bx)7+\u007f֕\u0006;/ß\u0016Ʀ/O\u0015ƞğ*m"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0014c`4\u0003{@\u007f'<Y[*Dw&=QL;A", "\"", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c}%&Tk\fKT/Bc\u000e/;v\u0016\u0004", ">`a2a;\u001c]\"\u000ezq;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "AtQ@V9BP\u0019\f", "\u001ah^{e,:Q(\u0003\f^?Fv3n\u0002/{ \t\u001b&Vo\u001b\u0012", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015QM\u0005x4\u001a\u0013weJ\u0007vu<z0ISN\fdV\u0002L\u0014\u001f0Q?", "=m2<`7ES(~y", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "=m2.a*>Z ~y", "1`d@X", "", "6`]1_,=", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class RxSingleCoroutine<T> extends AbstractCoroutine<T> {
    private final SingleEmitter<T> subscriber;

    public RxSingleCoroutine(CoroutineContext coroutineContext, SingleEmitter<T> singleEmitter) {
        super(coroutineContext, false, true);
        this.subscriber = singleEmitter;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable th, boolean z2) {
        try {
            if (this.subscriber.tryOnError(th)) {
                return;
            }
        } catch (Throwable th2) {
            ExceptionsKt.addSuppressed(th, th2);
        }
        RxCancellableKt.handleUndeliverableException(th, getContext());
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCompleted(T t2) {
        try {
            this.subscriber.onSuccess(t2);
        } catch (Throwable th) {
            RxCancellableKt.handleUndeliverableException(th, getContext());
        }
    }
}
