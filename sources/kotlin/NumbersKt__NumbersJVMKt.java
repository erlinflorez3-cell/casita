package kotlin;

import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,o\bDRj|\u0004G\u00078\u000b<F\u0007\"B\u0012\u007fјnjG5Le^.Zݷ2\u000fy\u0005<$a,\nNI٥2}P\bwN\u0016f5Ђ`#N\u001dإ.x\u0019+qU']XƉ8ZzM4eok8\ttd\u0004fݍ(P\u0005\u0013\u00022*v\u000f\u001fzqKR۽6X{HT%M3\u0019:\u0006l\u001fGȮb\u007fYDJ\u0005]h.K\u0003\u0018B\u0015ϓeH\u0010[\u0010^TU\u0011\u001faL0p;C\u001b=S1\u0007\u0019ÁE\u001bR\u007f@\u001dhU.SI\"_f\\\u000e\u001a-+}\f$þ,t\u0010_i$'YY\fK~\u0012nÃ\u0001\u0014\u0018J\r&\u0006URV-HmNԌ9\r}aKh\u0002\rL(z\u0010:]ӣ\u0006K6G&~Q\u0010EANe\u0003Kڄ$;\f|-sT<j=\u001b\u0003{\u0018ŀWXHVZ\"Ykw,p\u0011\tpʾ6_\u0013=\t).E$_[g\"Qo\u0010V\\g%\u0004'íY\u0002eVM:nD7R\t:Zth\u0013yhT\u0007+Wۻ\"l\u001a\f\u0017+ \u000bvd!S\u000f~Svw\u0003M\f\tkÌlOl|z&Wg^[5\u007fc@e`\u0005,?jaK֢lZ^\u001ajt(P1pj>vBͱT$\u001e@O\n\u001cb,Y\u0019\u000b\u0015\u000fҙ$ZL\u000b\u001awZ\u0017\u000f'Ta#Iǵ*\r\u0014\u000fatp\u001eg!IZ|'ý3Y\\C+>UPh\\|Q\u000bEͦ\u0006_rZYdlDt}{N\u001d`ߡWGH!\"\u0017)`\u0002UEzv,ˀS*2\t\u0010\u0012\u000figVg6q7ݢfʭNc"}, d2 = {"1nd;g\u0013>O\u0018\u0003\u0004`!|\u00169B\u00047\n", "", "", "1nd;g\u0016GSu\u0003\nl", "1nd;g\u001bKO\u001d\u0006~g.q\t<o\\,\u000bN", "4q^:50Ma", "", "\u001aj^A_0G\u001dw\t\u000b[3|G\ro\b3wI\u0005! \u001d", "0hc@", "", "\u001aj^A_0G\u001dy\u0006\u0005Z;;f9m\u000b$\u0005D\u000b l", "7r56a0MS", "", "7r8;Y0GW(~", "7r=.A", "@nc.g,%S\u001a\u000e", "0hc\u0010b<Gb", "@nc.g,+W\u001b\u0002\n", "B`Z2;0@V\u0019\r\nH5|e3t", "B`Z2?6PS'\u000edg,Y\r>", "Bn16g:", "BnA.j\tBb'", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{\u001a@7+-99\u00108")
class NumbersKt__NumbersJVMKt extends NumbersKt__FloorDivModKt {
    private static final int countLeadingZeroBits(int i2) {
        return Integer.numberOfLeadingZeros(i2);
    }

    private static final int countLeadingZeroBits(long j2) {
        return Long.numberOfLeadingZeros(j2);
    }

    private static final int countOneBits(int i2) {
        return Integer.bitCount(i2);
    }

    private static final int countOneBits(long j2) {
        return Long.bitCount(j2);
    }

    private static final int countTrailingZeroBits(int i2) {
        return Integer.numberOfTrailingZeros(i2);
    }

    private static final int countTrailingZeroBits(long j2) {
        return Long.numberOfTrailingZeros(j2);
    }

    private static final double fromBits(DoubleCompanionObject doubleCompanionObject, long j2) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return Double.longBitsToDouble(j2);
    }

    private static final float fromBits(FloatCompanionObject floatCompanionObject, int i2) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return Float.intBitsToFloat(i2);
    }

    private static final boolean isFinite(double d2) {
        return (Double.isInfinite(d2) || Double.isNaN(d2)) ? false : true;
    }

    private static final boolean isFinite(float f2) {
        return (Float.isInfinite(f2) || Float.isNaN(f2)) ? false : true;
    }

    private static final boolean isInfinite(double d2) {
        return Double.isInfinite(d2);
    }

    private static final boolean isInfinite(float f2) {
        return Float.isInfinite(f2);
    }

    private static final boolean isNaN(double d2) {
        return Double.isNaN(d2);
    }

    private static final boolean isNaN(float f2) {
        return Float.isNaN(f2);
    }

    private static final int rotateLeft(int i2, int i3) {
        return Integer.rotateLeft(i2, i3);
    }

    private static final long rotateLeft(long j2, int i2) {
        return Long.rotateLeft(j2, i2);
    }

    private static final int rotateRight(int i2, int i3) {
        return Integer.rotateRight(i2, i3);
    }

    private static final long rotateRight(long j2, int i2) {
        return Long.rotateRight(j2, i2);
    }

    private static final int takeHighestOneBit(int i2) {
        return Integer.highestOneBit(i2);
    }

    private static final long takeHighestOneBit(long j2) {
        return Long.highestOneBit(j2);
    }

    private static final int takeLowestOneBit(int i2) {
        return Integer.lowestOneBit(i2);
    }

    private static final long takeLowestOneBit(long j2) {
        return Long.lowestOneBit(j2);
    }

    private static final int toBits(float f2) {
        return Float.floatToIntBits(f2);
    }

    private static final long toBits(double d2) {
        return Double.doubleToLongBits(d2);
    }

    private static final int toRawBits(float f2) {
        return Float.floatToRawIntBits(f2);
    }

    private static final long toRawBits(double d2) {
        return Double.doubleToRawLongBits(d2);
    }
}
