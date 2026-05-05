package androidx.sqlite.db;

import java.io.Closeable;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: SupportSQLiteProgram.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004O\u00068é6B\r(4ߚ\u007f\u0007tzAӄLeV2Zݷ2\u000fy\u0003<$a$yCIa\"}(\tU3}˧\u001fJ\t\n\f%\u0014\u0016\u0011jZJ\u0006|k\u0014'2pro7[sU9\u000fy|)hH0>\u0012\u0005/\u001bZL\u001ex\u0013Cy\u000fB4NtRR;TK>Z\u001cL(\u0019\u001e\u000bh~:Vnu:]&3mPR?_^\u0006\u00141\u000fb5\u0017\u000faL,p;C\u0017=S1\n\u0019\u007f\b\u0019M|U\u0005\u0017(W/Wuo6\u0007\u0003D\u00199S%]!2#)\u001af\u001a4CO\u0012L\u00172Âv\u07beԋ\r@\f\u0010\fFv-Ǐ\u001et\u06dd\u00122"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000bDw\u0018;IK\u0011", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "0h]153HP", "", "7mS2k", "", "D`[BX", "", "0h]176NP ~", "", "0h]1?6GU", "", "0h]1A<EZ", "0h]1F;KW\"\u0001", "", "1kT.e\tB\\\u0018\u0003\u0004`:", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SupportSQLiteProgram extends Closeable {
    void bindBlob(int i2, byte[] bArr);

    void bindDouble(int i2, double d2);

    void bindLong(int i2, long j2);

    void bindNull(int i2);

    void bindString(int i2, String str);

    void clearBindings();
}
