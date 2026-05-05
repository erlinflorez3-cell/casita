package kotlin.random;

import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;
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
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\r6B\u0015\"4\u0012}\bnjO0Le^.Zݷ2\u000fy\u0002<$a1yCQU\"}(\u000eWN}gvJ`\u000b[,\u0014ǝ\u0011jZH\u0006|k\u0012'2ppo7[qU9\u000fu|ӌڶ6$>|\u0013\u00052GV\u0015\u000fzqJ<\u0016>@\t:\u0001\u0013}\t(\u0014\u001e>N\u0007dձʄR8NskBG:\u0011rZNUiX|{\u0018vX5\u0019\u000faL8\u0007<߱\u0019%a\u0011\u001fkiH\u001b? G-hU2[M\u0002fNX.\u001e[0̠\u0011_x6j\u0016i\u000e\u001a0CO\u0012Ux\u000eV\u0003+\u007f\u001bK\u001c\u000e41x43\u001at\u001a&3#\u007f\u0004FV\u0002lU\u0018z\u0010C]*ő7-?/tfyJ'dO{3\u000eF#/yg`ڍ\u0012`#2l\u0011_Gi@kIv\n\bH\u001e\b~d\u001a*21\u000e\u0005\u009e\u007f\u00134/3PsZ17\u0004\u0002vE\u0010v3k\u0019WwR`@PoF;8\u000b$ZreKpÏXZ2+[7l\u001e\f\u001e+ \u000bxd!S\u001b~Sv\u0006\u0003M\f'k4Ϭ;Y|\n&fG}K5\u007fi8a\u0001\u0002ZDםf\u0005f\u0007Zl\u001ayt(P8pj>\u0003,H\\\u000e+2mwb9Ϝ5\u001bb6V%6cO\u001c!_\tn8~\u0003>T\u0007w$\r\t/V\rt}i\u0011IZ\u0003''έES;<4y:\u007fB\u001c;\u0007-y(G\u0016WwPz2\u000eU*E\\\u001f\u07fcU/K9ê\u0003P"}, d2 = {"1gT0^\u001c\"\\(kvg.|e9u\t'\n", "", "4q^:", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "Cmc6_", "1gT0^\u001c\"\\(kvg.|e9u\t'\n\beb~';j,", "uH8uI", "1gT0^\u001c%]\"\u0001gZ5~\t\fo\u00101zN", "\u001aj^A_0G\u001d\te\u0005g.R", "1gT0^\u001c%]\"\u0001gZ5~\t\fo\u00101zNH\u0017\u0014\u0015Np\u001cZ", "uI9uI", "<dgAH\tRb\u0019\r", "\u001aj^A_0G\u001d\t[\u000fm,X\u0016<a\u0014}", "\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "Ahi2", "", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tlz\u000bej", "/qa.l", "<dgAH\tRb\u0019\rB>\u001d~\n\u001eA[", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tl\r$3\u0004\u0019", "4q^:<5=S,", "Bn8;W,Q", "<dgAH\tRb\u0019\rBP=\n\u0018}BN", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tl\r$Sq\u007fl\u0002", "<dgAH\u0010Gb", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tlZ+", "<dgAH\u0010Gb`\u000bXZ:`h\u001f", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tlz\u000bS", "<dgAH\u0010Gb`zM=\nXX5", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tlz+3q", "@`]4X", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7h<\n\u0019\u0017\u001d", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tl}My\u001dCz.~fy)9m$w='Dz!\u001a\u001eja\u000fJG", "<dgAH\u0013H\\\u001b", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tlZ,", "<dgAH\u0013H\\\u001bFk*\u001f\u0001W0Y", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tl{\u000bT", "<dgAH\u0013H\\\u001bF\u007ff7xzvc", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tl{,3r", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}-| \u0019GE", "uKZ<g3B\\b\fvg+\u0007\u0011xR{1zJ\tl}My\u001dCz.~fy)9m$w=*Et6\u000b\u0011qc9\\'\u0011", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class URandomKt {
    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU */
    public static final void m10194checkUIntRangeBoundsJ1ME1BU(int i2, int i3) {
        if (Integer.compareUnsigned(i3, i2) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m9069boximpl(i2), UInt.m9069boximpl(i3)).toString());
        }
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI */
    public static final void m10195checkULongRangeBoundseb3DHEI(long j2, long j3) {
        if (Long.compareUnsigned(j3, j2) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m9148boximpl(j2), ULong.m9148boximpl(j3)).toString());
        }
    }

    public static final byte[] nextUBytes(Random random, int i2) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UByteArray.m9051constructorimpl(random.nextBytes(i2));
    }

    /* JADX INFO: renamed from: nextUBytes-EVgfTAA */
    public static final byte[] m10196nextUBytesEVgfTAA(Random nextUBytes, byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4 */
    public static final byte[] m10197nextUBytesWvrt4B4(Random nextUBytes, byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i2, i3);
        return array;
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default */
    public static /* synthetic */ byte[] m10198nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UByteArray.m9057getSizeimpl(bArr);
        }
        return m10197nextUBytesWvrt4B4(random, bArr, i2, i3);
    }

    public static final int nextUInt(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UInt.m9075constructorimpl(random.nextInt());
    }

    public static final int nextUInt(Random random, UIntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        return Integer.compareUnsigned(range.m10204getLastpVg5ArA(), -1) < 0 ? m10199nextUInta8DCA5k(random, range.m10203getFirstpVg5ArA(), UInt.m9075constructorimpl(range.m10204getLastpVg5ArA() + 1)) : Integer.compareUnsigned(range.m10203getFirstpVg5ArA(), 0) > 0 ? UInt.m9075constructorimpl(m10199nextUInta8DCA5k(random, UInt.m9075constructorimpl(range.m10203getFirstpVg5ArA() - 1), range.m10204getLastpVg5ArA()) + 1) : nextUInt(random);
    }

    /* JADX INFO: renamed from: nextUInt-a8DCA5k */
    public static final int m10199nextUInta8DCA5k(Random nextUInt, int i2, int i3) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m10194checkUIntRangeBoundsJ1ME1BU(i2, i3);
        return UInt.m9075constructorimpl(nextUInt.nextInt(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: nextUInt-qCasIEU */
    public static final int m10200nextUIntqCasIEU(Random nextUInt, int i2) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m10199nextUInta8DCA5k(nextUInt, 0, i2);
    }

    public static final long nextULong(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return ULong.m9154constructorimpl(random.nextLong());
    }

    public static final long nextULong(Random random, ULongRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compareUnsigned(range.m10213getLastsVKNKU(), -1L) < 0) {
            long j2 = 1;
            return m10202nextULongjmpaWc(random, range.m10212getFirstsVKNKU(), ULong.m9154constructorimpl(range.m10213getLastsVKNKU() + ULong.m9154constructorimpl((j2 + 4294967295L) - (j2 | 4294967295L))));
        }
        if (Long.compareUnsigned(range.m10212getFirstsVKNKU(), 0L) <= 0) {
            return nextULong(random);
        }
        long j3 = (-1) - (((-1) - ((long) 1)) | ((-1) - 4294967295L));
        return ULong.m9154constructorimpl(m10202nextULongjmpaWc(random, ULong.m9154constructorimpl(range.m10212getFirstsVKNKU() - ULong.m9154constructorimpl(j3)), range.m10213getLastsVKNKU()) + ULong.m9154constructorimpl(j3));
    }

    /* JADX INFO: renamed from: nextULong-V1Xi4fY */
    public static final long m10201nextULongV1Xi4fY(Random nextULong, long j2) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m10202nextULongjmpaWc(nextULong, 0L, j2);
    }

    /* JADX INFO: renamed from: nextULong-jmpaW-c */
    public static final long m10202nextULongjmpaWc(Random nextULong, long j2, long j3) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m10195checkULongRangeBoundseb3DHEI(j2, j3);
        return ULong.m9154constructorimpl(nextULong.nextLong(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
