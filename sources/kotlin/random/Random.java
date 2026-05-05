package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006\u0010nʑA0RuP.XV2\u000fy\u007f<$a%yCIZ\"}(\tWNunvJ`\u000bI4\u001cǝ\u0017\u007f\\I\u0004w\u0016\u0011$rEņC3[o\u0006GnuN\u0005N4R<\b\b\u0019\u001aXJV\u001bCIY\u0010*0nu\u0001fU[\u0013 *\u0006l'1\"jof6vs$NwE\u0011oZNUf`\u0001[\u0015^TU\u0014'g$+N@M\u0015SU3\rX[M\rWqk\u0007/;o9Wyo6\u0007\u0007D\u00199Z%]!(#\u0019\u001af\u001a3CO\u0012X\u0017\"p\u0006\t\b%<2\u001b6+V<E\u001a\u0015\u0015TG=\taLh\u0002\rO0~oE/%.@[=)tiai&\u0015KD\u000b\u001b.;\u0001\u001d2\"hVf#-lw\u007f3\u0018T\u0006V\\\u001cq=\u001c\u0006!f\u00108\u001c0u\u0002u\u0010YD%7O[g%Qo\u0010W\\g%\u0007\u0011lawjHn$5*\u007f0\u0017\u001frD\u0013\u00192d\u001df:$e\u001c\u0003\u001b.\f!.twj5k$\u0017ev|\u0003M\f\u001eU3tFqn\u001a\"\b=lAMQ\u0012$(fρ\u0018U"}, d2 = {"\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "", "u(E", "<dgA50Ma", "", "0hc\u0010b<Gb", "<dgA56HZ\u0019z\u0004", "", "<dgA5@MS'", "", "/qa.l", "4q^:<5=S,", "Bn8;W,Q", "Ahi2", "<dgA76NP ~", "", "Cmc6_", "4q^:", "<dgA93HO(", "", "<dgA<5M", "<dgA?6GU", "", "\u0012dU.h3M", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class Random {
    public static final Default Default = new Default(null);
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\rnj?0LeV7Zݷ2\u000fy\f<$a'yCIY\"}(\nWNulvJ`\u000bK\u000f\u0014\u001d\u0001̓4Icތe\u0012\u00152HĪ@Iݹ =g_%:3 \u001b\"\u0017z=\u007f4jM\u0016vټGK\u001a\u0014xN~>j\r{\nJ\u0016\u0014D8\u0001La.b~NzdR/Q\u000b0V\u00175m9\u0015M;P\u0005+\u001b\u0002y\u001eYJ}I]Ca\f\u001fR\nI3C\u007fH\u001dhU1[M\u0002cNX.\u0019E/]\u001aurTaKe)\u001a54gcyZ>,\u0006\t\u0014\rj\tT\u001aoN<<2f6\u001ey\t;aN_\u001a^p\u0010+eD(=\u007fa;\u007f//goJ1Ne\f5\u0011,5\u0019nOk\u0005\u0012n&3T&awe\tCVa\"Yk\u0002J\u0005+\b8\u0019HG.4B%v%3Ls9Q&\u001c\u0006VU\u007fv3e/g2hVU:nD<Z\r\u001al\\d3p\u0001Xf=)MJYM\u0012P\u0019.r\u0010<O<Vb\u0018vw\u0001e]8<_jEj\u0007k<n\u007fr{K_y(a\u0001\u000eDCJt\u001dX\u0015Y\u0004\u0010hm@\"`_1$@\u0002Rf$\u0013`X8\u001c\u00058?\u001ct\u0015v\u0002tՖCҴ\r_bӐʖ\u0003o"}, d2 = {"\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006H?u\u0017Hk\u001eC\u0006z", "\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", "u(E", "2dU.h3M@\u0015\byh4", "<dgA50Ma", "", "0hc\u0010b<Gb", "<dgA56HZ\u0019z\u0004", "", "<dgA5@MS'", "", "/qa.l", "4q^:<5=S,", "Bn8;W,Q", "Ahi2", "<dgA76NP ~", "", "Cmc6_", "4q^:", "<dgA93HO(", "", "<dgA<5M", "<dgA?6GU", "", "EqXAX\u0019>^ zx^", "", "!da6T3Bh\u0019}", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Default extends Random implements Serializable {

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r)4ߚ\u007f\u0007tʑAӄJΟHDɟ\u0004.=jd4\u0003[dvI;ڈ\u001e}0\n\u0018Tuk\u0007J\t\u0010\n\u000fV\"\u0007lDI\u0004{4܋a̓FoG\u074cޢsC"}, d2 = {"\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006H?u\u0017Hk\u001eC\u0006c#Y\u000b$3t\u001aCMB\u0011", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", "u(E", "Ada6T3/S&\r~h5ll\u000e", "", "@dP1E,L] \u0010z", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        private static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i2) {
            return Random.defaultRandom.nextBits(i2);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int i2) {
            return Random.defaultRandom.nextBytes(i2);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array, int i2, int i3) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array, i2, i3);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d2) {
            return Random.defaultRandom.nextDouble(d2);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d2, double d3) {
            return Random.defaultRandom.nextDouble(d2, d3);
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public int nextInt(int i2) {
            return Random.defaultRandom.nextInt(i2);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i2, int i3) {
            return Random.defaultRandom.nextInt(i2, i3);
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        @Override // kotlin.random.Random
        public long nextLong(long j2) {
            return Random.defaultRandom.nextLong(j2);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j2, long j3) {
            return Random.defaultRandom.nextLong(j2, j3);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((2 & i4) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bArr.length;
        }
        return random.nextBytes(bArr, i2, i3);
    }

    public abstract int nextBits(int i2);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public byte[] nextBytes(int i2) {
        return nextBytes(new byte[i2]);
    }

    public byte[] nextBytes(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!new IntRange(0, array.length).contains(i2) || !new IntRange(0, array.length).contains(i3)) {
            throw new IllegalArgumentException(("fromIndex (" + i2 + ") or toIndex (" + i3 + ") are out of range: 0.." + array.length + '.').toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(("fromIndex (" + i2 + ") must be not greater than toIndex (" + i3 + ").").toString());
        }
        int i4 = (i3 - i2) / 4;
        for (int i5 = 0; i5 < i4; i5++) {
            int iNextInt = nextInt();
            array[i2] = (byte) iNextInt;
            array[i2 + 1] = (byte) (iNextInt >>> 8);
            array[i2 + 2] = (byte) (iNextInt >>> 16);
            array[i2 + 3] = (byte) (iNextInt >>> 24);
            i2 += 4;
        }
        int i6 = i3 - i2;
        int iNextBits = nextBits(i6 * 8);
        for (int i7 = 0; i7 < i6; i7++) {
            array[i2 + i7] = (byte) (iNextBits >>> (i7 * 8));
        }
        return array;
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public double nextDouble(double d2) {
        return nextDouble(0.0d, d2);
    }

    public double nextDouble(double d2, double d3) {
        double dNextDouble;
        RandomKt.checkRangeBounds(d2, d3);
        double d4 = d3 - d2;
        if (!Double.isInfinite(d4) || Double.isInfinite(d2) || Double.isNaN(d2) || Double.isInfinite(d3) || Double.isNaN(d3)) {
            dNextDouble = d2 + (nextDouble() * d4);
        } else {
            double d5 = 2;
            double dNextDouble2 = nextDouble() * ((d3 / d5) - (d2 / d5));
            dNextDouble = d2 + dNextDouble2 + dNextDouble2;
        }
        return dNextDouble >= d3 ? Math.nextAfter(d3, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int i2) {
        return nextInt(0, i2);
    }

    public int nextInt(int i2, int i3) {
        int iNextInt;
        int iNextBits;
        RandomKt.checkRangeBounds(i2, i3);
        int i4 = i3 - i2;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            int i5 = -i4;
            if ((i5 + i4) - (i5 | i4) == i4) {
                iNextBits = nextBits(RandomKt.fastLog2(i4));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    iNextBits = iNextInt % i4;
                } while ((iNextInt - iNextBits) + (i4 - 1) < 0);
            }
            return i2 + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (i2 <= iNextInt2 && iNextInt2 < i3) {
                return iNextInt2;
            }
        }
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public long nextLong(long j2) {
        return nextLong(0L, j2);
    }

    public long nextLong(long j2, long j3) {
        long jNextLong;
        long jNextBits;
        int iNextInt;
        RandomKt.checkRangeBounds(j2, j3);
        long j4 = j3 - j2;
        if (j4 > 0) {
            long j5 = -j4;
            if ((j5 + j4) - (j5 | j4) == j4) {
                int i2 = (int) j4;
                int i3 = (int) (j4 >>> 32);
                if (i2 != 0) {
                    iNextInt = nextBits(RandomKt.fastLog2(i2));
                } else if (i3 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (((long) nextBits(RandomKt.fastLog2(i3))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                jNextBits = ((long) iNextInt) & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    jNextBits = jNextLong % j4;
                } while ((jNextLong - jNextBits) + (j4 - 1) < 0);
            }
            return j2 + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (j2 <= jNextLong2 && jNextLong2 < j3) {
                return jNextLong2;
            }
        }
    }
}
