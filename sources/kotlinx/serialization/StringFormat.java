package kotlinx.serialization;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u001e\u007f\u0007lkA0ZeP.XT0s\u0002ڔd$\n#:jIU2}h\noPm˧|K\u000b\u0015Q\u0011\u001e\u001c\tl<I\u001cy\f\u0015?6PsW3{t\u0004]žx6\u0013&zIF\u0001\u001d\u0001H/h\u0012|ٙQL<\u001c>H\t@b\u000f]\u0005`\u00134GP\u0005,f\u007fN|I3\u0002Ơ3#\u0011tŒR3"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005V|\u0012Ex\u0006?f\u0006\u001cFC", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128}\u0006?f\u0006\u001cFC", "2dR<W,\u001f`#\u0007hm9\u0001\u00121", "\"", "2db2e0:Z\u001d\u0014zk", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "Asa6a.", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `&o\u001c<\u0004)1`\u000253|\u001a8V1Jx0-\u0015ju\u000fmh(_rpNHW.&@\u0002J\u0018\u001b\\c\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "3mR<W,-]\u0007\u000e\bb5~", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `5o\u001b@r,9ny/;w\u001f\u001c\\P7z4 )>H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001etS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface StringFormat extends SerialFormat {
    <T> T decodeFromString(DeserializationStrategy<? extends T> deserializationStrategy, String str);

    <T> String encodeToString(SerializationStrategy<? super T> serializationStrategy, T t2);
}
