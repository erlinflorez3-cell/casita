package kotlin;

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
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!,o\bDZc|\u0004G\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JeP.hS2\u000fq#L6iҕ\nCiTB}P\t\u0016Ȧm̊rL`\fQ\u0011\u001e(\u0007̓DI\u0004w\u0006\u0012=5\tīEݯQqC=nyN\u0017.݅:8(\u0004)\u001aXNV͔\u0001ŲO\u000e\u00187NxRd\u001b˟\u001d\u001a@\u0005f /'#ɩTɇLncD=.\u001b{PZ?_^{u\rtTmˡ|Ґ\"-FDC\u0017=e\u0011\u0013j[m\u0002gqk\b/ѯ-ȅMu]Df\u0005,'9[%]!%\u0005\u0005\u007ffRʴ1յgMV\u001d6\u007f\u0013\u000e\u001bH\u001c\u000e4&p.[#-ڤ\u0014\u07baxtYP^\rvT\u000e\fy6E$(3Y9aƠWň?\u001bTI\n\u0007%01\u0012\u0007!\nS6`C\u001e\u001bȵWśUBC[\\\u000fqO{\u0015\tb0),0u\u0006uɍ\u0017ѧ\u001b'=oG+9}\u0010Y\\g%\u0004\th\u0002r\u0019̺F̱r\u0018=?\u0017\u0017r^r\u001b\u0004P\u0003XT\u0011{\u001c\u0005\u000b\f\u001f+ \u000bv\u0003ơ+ŎRQn\u0002xfu$3E~7\bq\u0014\u000e\u0006<\u000f7Ch{\u0010\u0010Q=ܥEםf\u0007^\u0001Pn$tj>:2vp8w*J~\u0010!IWqJ3rփ\u001fÅ\u0019J\t:P^\u0015#mp\u0001\u0010-][$1rTx\u0017\u0018h\\\u001fn.նOض\u0001b(KOpM34u:hb|K\u0007-s0Kuc_L\u001b\u0015<ɥ\u0002°\u001a\u001c?r=V+)\rIJ\u0002[Htr\u0014T}\u00165\u0012\u0015y=:/ֳmŰnr2\u0003xegn%B\u000f^!)0d.\u007f\u0012J\t^{T9Z\u0005μxè]>T[\u000b\"783!\b\"+>UCU&F{\"F-a\fh6Ћ\u007fˏ\u0013(z\n\u0012K{(}\bi]`;`I\b~\u0005е*к\u0007DN\u0011\u0006/Z\u001bB2KHog\u0019VfPQɈ\u0004֨\u000b.\u0013\u0019d`R%}#L.\u000e0\u001cC,\u001a%ǁ+ݱQUm\u0017{ut\u001dX4\"\u000b*:\u0017\u0012JFfݐ]ť\r2\f\u001f&bYMp2T\tR4T<6\u000b\nҕoѕ\u0014|\u0006tm6/DP!SV<W!\\\u0005KKނKȚ%,\u0007.\u001d86\u000bC^\u001dmtZWc`\u0007\u001a\u0080\u000fƨnQ\u0005\u00173U\\fGH@X/\u0014m]qRHԕ\nھ-oq!\u001ad·\u0001O"}, d2 = {"1nd;g\u0013>O\u0018\u0003\u0004`!|\u00169B\u00047\n", "", "\u001aj^A_0G\u001d\t[\u000fm,R", "1nd;g\u0013>O\u0018\u0003\u0004`!|\u00169B\u00047\n\bR\u0013\"I=w,", "uA\u0018\u0016", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "1nd;g\u0013>O\u0018\u0003\u0004`!|\u00169B\u00047\n\br\fe3?vJ", "uH\u0018\u0016", "\u001aj^A_0G\u001d\te\u0005g.R", "1nd;g\u0013>O\u0018\u0003\u0004`!|\u00169B\u00047\n\bq|\f9\u007ft(", "uI\u0018\u0016", "\u001aj^A_0G\u001d\tl}h9\f^", "1nd;g\u0013>O\u0018\u0003\u0004`!|\u00169B\u00047\n\b\u0014\u001cc3RzN", "uR\u0018\u0016", "1nd;g\u0016GSu\u0003\nl", "1nd;g\u0016GSu\u0003\nlsN\u0005:gM\u0012k", "1nd;g\u0016GSu\u0003\nlsn}}QO\u0011\n", "1nd;g\u0016GSu\u0003\nlsmn$W\u0010\u000fg", "1nd;g\u0016GSu\u0003\nls\u0010\u000e{Qb\u0015\u000e", "1nd;g\u001bKO\u001d\u0006~g.q\t<o\\,\u000bN", "1nd;g\u001bKO\u001d\u0006~g.q\t<o\\,\u000bNHh\u0013Rq[&f", "1nd;g\u001bKO\u001d\u0006~g.q\t<o\\,\u000bNH\t\f\u0016[]%\u0005", "1nd;g\u001bKO\u001d\u0006~g.q\t<o\\,\u000bNH\b|<a\u001e#b", "1nd;g\u001bKO\u001d\u0006~g.q\t<o\\,\u000bNH*\u001c\u0014[p)\t", "@nc.g,%S\u001a\u000e", "0hc\u0010b<Gb", "@nc.g,%S\u001a\u000eBE?\u0006q8RN", "uA8u5", "@nc.g,%S\u001a\u000eBO}\u0010e}YN", "uH8u<", "@nc.g,%S\u001a\u000eBC\u001an\u0013\u00114J", "uI8u=", "@nc.g,%S\u001a\u000eBh3me\u0018xN", "uR8uF", "@nc.g,+W\u001b\u0002\n", "@nc.g,+W\u001b\u0002\n&\u0013\u0010\u0012\u0018nlv", "@nc.g,+W\u001b\u0002\n&\u001dN\u001c\f4sv", "@nc.g,+W\u001b\u0002\n&\u0011jz9GNr", "@nc.g,+W\u001b\u0002\n&6\u0004y\fN\u0013v", "B`Z2;0@V\u0019\r\nH5|e3t", "B`Z2;0@V\u0019\r\nH5|e3tGywK\u0003d\u00017", "uA\u0018\u000f", "B`Z2;0@V\u0019\r\nH5|e3tG\u001ap\u000flf\u007fU", "B`Z2;0@V\u0019\r\nH5|e3tG\u0019a5r'}3", "uI\u0018\u0017", "B`Z2;0@V\u0019\r\nH5|e3tG;\u0001\rly\u0004Y", "uR\u0018 ", "B`Z2?6PS'\u000edg,Y\r>", "B`Z2?6PS'\u000edg,Y\r>-Q$\u0007BN\u0001\u0007", "B`Z2?6PS'\u000edg,Y\r>-q\u001dJ,P\u007f%", "B`Z2?6PS'\u000edg,Y\r>-p\u000ep2\u0011}\u0003", "B`Z2?6PS'\u000edg,Y\r>-\u0013-H,c\u0004)", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UNumbersKt {
    /* JADX INFO: renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m9226countLeadingZeroBits7apg3OU(byte b2) {
        return Integer.numberOfLeadingZeros((-1) - (((-1) - b2) | ((-1) - 255))) - 24;
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m9227countLeadingZeroBitsVKZWuLQ(long j2) {
        return Long.numberOfLeadingZeros(j2);
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m9228countLeadingZeroBitsWZ4Q5Ns(int i2) {
        return Integer.numberOfLeadingZeros(i2);
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m9229countLeadingZeroBitsxj2QHRw(short s2) {
        return Integer.numberOfLeadingZeros(s2 & 65535) - 16;
    }

    /* JADX INFO: renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m9230countOneBits7apg3OU(byte b2) {
        return Integer.bitCount(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)));
    }

    /* JADX INFO: renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m9231countOneBitsVKZWuLQ(long j2) {
        return Long.bitCount(j2);
    }

    /* JADX INFO: renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m9232countOneBitsWZ4Q5Ns(int i2) {
        return Integer.bitCount(i2);
    }

    /* JADX INFO: renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m9233countOneBitsxj2QHRw(short s2) {
        return Integer.bitCount(UInt.m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))));
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m9234countTrailingZeroBits7apg3OU(byte b2) {
        return Integer.numberOfTrailingZeros((b2 + 256) - (b2 & 256));
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m9235countTrailingZeroBitsVKZWuLQ(long j2) {
        return Long.numberOfTrailingZeros(j2);
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m9236countTrailingZeroBitsWZ4Q5Ns(int i2) {
        return Integer.numberOfTrailingZeros(i2);
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m9237countTrailingZeroBitsxj2QHRw(short s2) {
        return Integer.numberOfTrailingZeros(s2 | 65536);
    }

    /* JADX INFO: renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m9238rotateLeftJSWoG40(long j2, int i2) {
        return ULong.m9154constructorimpl(Long.rotateLeft(j2, i2));
    }

    /* JADX INFO: renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m9239rotateLeftLxnNnR4(byte b2, int i2) {
        return UByte.m8998constructorimpl(NumbersKt.rotateLeft(b2, i2));
    }

    /* JADX INFO: renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m9240rotateLeftV7xB4Y4(int i2, int i3) {
        return UInt.m9075constructorimpl(Integer.rotateLeft(i2, i3));
    }

    /* JADX INFO: renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m9241rotateLeftolVBNx4(short s2, int i2) {
        return UShort.m9261constructorimpl(NumbersKt.rotateLeft(s2, i2));
    }

    /* JADX INFO: renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m9242rotateRightJSWoG40(long j2, int i2) {
        return ULong.m9154constructorimpl(Long.rotateRight(j2, i2));
    }

    /* JADX INFO: renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m9243rotateRightLxnNnR4(byte b2, int i2) {
        return UByte.m8998constructorimpl(NumbersKt.rotateRight(b2, i2));
    }

    /* JADX INFO: renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m9244rotateRightV7xB4Y4(int i2, int i3) {
        return UInt.m9075constructorimpl(Integer.rotateRight(i2, i3));
    }

    /* JADX INFO: renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m9245rotateRightolVBNx4(short s2, int i2) {
        return UShort.m9261constructorimpl(NumbersKt.rotateRight(s2, i2));
    }

    /* JADX INFO: renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m9246takeHighestOneBit7apg3OU(byte b2) {
        return UByte.m8998constructorimpl((byte) Integer.highestOneBit(b2 & 255));
    }

    /* JADX INFO: renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m9247takeHighestOneBitVKZWuLQ(long j2) {
        return ULong.m9154constructorimpl(Long.highestOneBit(j2));
    }

    /* JADX INFO: renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m9248takeHighestOneBitWZ4Q5Ns(int i2) {
        return UInt.m9075constructorimpl(Integer.highestOneBit(i2));
    }

    /* JADX INFO: renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m9249takeHighestOneBitxj2QHRw(short s2) {
        return UShort.m9261constructorimpl((short) Integer.highestOneBit((s2 + 65535) - (s2 | 65535)));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m9250takeLowestOneBit7apg3OU(byte b2) {
        return UByte.m8998constructorimpl((byte) Integer.lowestOneBit((-1) - (((-1) - b2) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m9251takeLowestOneBitVKZWuLQ(long j2) {
        return ULong.m9154constructorimpl(Long.lowestOneBit(j2));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m9252takeLowestOneBitWZ4Q5Ns(int i2) {
        return UInt.m9075constructorimpl(Integer.lowestOneBit(i2));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m9253takeLowestOneBitxj2QHRw(short s2) {
        return UShort.m9261constructorimpl((short) Integer.lowestOneBit((-1) - (((-1) - s2) | ((-1) - 65535))));
    }
}
