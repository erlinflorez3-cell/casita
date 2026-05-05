package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DisposableHandle;
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
/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&˛\bDRш|\u0004G\b8\u000b<B\u0007\"2\u0013\u007f\u0007|jAӄLe^.ZS0\u000fq`Jř\u0004&wّITJ}P\t\u0018buk\u0007J\t\u0010s\u0013\u0014\u001c\u0011jbկ\u001c\u07b3\u001cܫ\u00132Pv\bM[wU9\u000f}f\u000f.<:>\n\u0007\u0011\u001a`Ϻ>\u0002AŶ\në\u00160N|\u000bd\u001bN\u001d\u001c(\u0005tĨWɍ^ʄR:`nc<=&ʾhĩú'c8~S,tSܴ\u0011\u0004Ү\"*"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8d#?d}u", "\"", "", ":`c2f;/O \u000fz", "5dc\u0019T;>a(ove<|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "3lXA", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "3lXAF6N`\u0017~", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "And?V,", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b(GN\nKrz\u001c_\b/>q\u001fwKMHuD-\u0019qaGPA6W\u0006+P\\J;`\\{\u0013Wx_\n_'V\fUJ&8.4$\b*XW", ":hU2V@<Z\u0019F\u0002b=|\b+t{\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface LiveDataScope<T> {
    Object emit(T t2, Continuation<? super Unit> continuation);

    Object emitSource(LiveData<T> liveData, Continuation<? super DisposableHandle> continuation);

    T getLatestValue();
}
