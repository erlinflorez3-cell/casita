package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!4i\bӵLc\u0003\rIي8\u000bDB\u0007\":\u0015\u007fјnjO0LeV8Zݷ2\u000f\u0002{<$i(yّCU0}*\t]So˧vJp\u000bK\u000f\u0014\u001c\u0001̓4Ikxe\u0012\u001d9JģG3coE9n|>ӌ8@0\u0600\u0012\u0005/\u0019ZL\u001ev\u0013Cy\rX/X~HT%M3\u001dB\nL \u0019\u001e\u000bk\u00155`zk?G#1orR5_H|{\u0014\rS?\u001b\u0005i6+n@e\u00193S\u001b\u0007\u0001e\u0006\u0002W\u007fK\u0010\u0001'U7ywe6p\u007fB\"qN%k\u00014t\u0005\u007fo<+9O{K~\u001env\u0013\n\u001bM\u001c\u000e49x2;\u001a~\b<F;qkN^\u0016vB.\u0010\u0012:%%\u00183YOaeЈeR"}, d2 = {"0ng\u000fb6ES\u0015\b", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", ">qX:\\;Bd\u0019", "", "0ng\u000fl;>", "\u001aiPCTuEO\"\u0001D;@\f\t\u0005", "", "0ng\u0010[(K", "\u001aiPCTuEO\"\u0001D</x\u0016+c\u000f(\t\u0016", "", "0ng\u0011b<;Z\u0019", "\u001aiPCTuEO\"\u0001D=6\r\u00066eU", "", "0ng\u0013_6:b", "\u001aiPCTuEO\"\u0001D?3\u0007\u0005>;", "", "0ng\u0016a;", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "", "0ng\u0019b5@", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "", "0ng [6Kb", "\u001aiPCTuEO\"\u0001DL/\u0007\u0016>;", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Boxing {
    public static final Boolean boxBoolean(boolean z2) {
        return Boolean.valueOf(z2);
    }

    public static final Byte boxByte(byte b2) {
        return Byte.valueOf(b2);
    }

    public static final Character boxChar(char c2) {
        return new Character(c2);
    }

    public static final Double boxDouble(double d2) {
        return new Double(d2);
    }

    public static final Float boxFloat(float f2) {
        return new Float(f2);
    }

    public static final Integer boxInt(int i2) {
        return new Integer(i2);
    }

    public static final Long boxLong(long j2) {
        return new Long(j2);
    }

    public static final Short boxShort(short s2) {
        return new Short(s2);
    }
}
