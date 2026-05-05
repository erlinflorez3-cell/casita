package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
/* JADX INFO: compiled from: Serializer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&˛\bDRш|\u0004G\t8\u000bDB\u0007\"2\u0012\u007f\u0007tjA0JeP.hS2\u000fq{:\tqҕ\u001aEA٥(|R\t}N0~|Nr\u000byƤ6\u001a\u0007oDI\u0004~$ܯMͩAģУ7M}D\u0002\u007f\u0003>\u001d `+h}\u0013\u000b2*~Ƶ'~QV$\u0012^L7Ĕ\u0011ԁLĨܨ\u0016\u0006L-Q.jhf6~Ǎ4Ƥ1ݭ\u0007mZP-a>\u007fմ\rH\\'\u0013\u000eҖ\"9"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u000eIz!<]\u0013 DC", "\"", "", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u0011X-:c \u000ekZ3\r\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@dP199H[", "7m_Bg", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "uKY.i(\bW#H^g7\r\u0018\u001dt\r(wHV}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005I>'$ljI\u0003r0X\u007f|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "EqXAX\u001bH", "", "B", "=tc=h;", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011s\u0018\u0006`5Dd\u000e/%|#.IK\u0011R:($oeBPa6[\u00017VPW,j\u001cPG\u001d!^\u0017^'\u001c\tcJy2+<\u001b\u0019(\u0013\t7q\u0003U\u007f\u000b:jnQ,", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, Continuation<? super T> continuation);

    Object writeTo(T t2, OutputStream outputStream, Continuation<? super Unit> continuation);
}
