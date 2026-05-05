package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005&4\u0012\u0006\u001anʑA0ReP.XT2\u000fy\u0005<$a-\bّYnJ}P\b\bM\u0001(qН^\u000bQ\u000fN\u001a\u0007tDI\u0004\u0004&!\u001d>Zom5}sKFxtd\u0007f\u074c\"\u0001\u0006\u0013\u000f2*v\u001f'~Q[$\u0012^O9>`\u001ee\u0005H\u0014NJ.\u00136\\\u0016PfLzmR/Q\u00052N\\:w0+O=Jb7%v\u0010 sLEI-%\u0002\u00127ViL\u001b? ?Mt5<CI\"bf\\\u000e*-+}Օ&\n4c\u001dQ\u000fϯW/]pcP<*(~\n$T\u0004<\bmΥ.u\u001et &3#t$O^\u0003vB.|\u0018zа)\u0004K-?\u001etU2J'SO{3\u000fTgъr%sV\u0014f#\u001f%\u0004_8i@kJ%˦eǀq\u0004xçR6\u00128_\u007f]\u0005gч\u0019É;[A\u05faݒo\u001c"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`5o\u001dKz.7gS", "", "u(E", "6dP1X9-O\u0016\u0006zL0\u0012\t", "", "5dc\u0015X(=S&mv[3|v3z\u007f", "u(8", "7mXA\\(EE\u001d\byh>j\rDe", "5dc\u0016a0MW\u0015\u0006lb5{\u0013AS\u0004={", "Adc", "D`[BX:", "", "1kT.e", "", "5dc", "7c", "5dc\u0012a(;Z\u0019i\u000bl/", "", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u001aT?\u001c]\"|\u000bk9|\u0012>S\u000f5{<\t%", "5dc\u001aT?\u001f`\u0015\u0007zL0\u0012\t", "5dc\u001aT?!S\u0015}zk\u0013\u0001\u0017>S\u0004={", "7rB2g", ";da4X", "=sW2e", "D`[BX", "Ahi2", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Settings {
    public static final int COUNT = 10;
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005(2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕ɷ:b"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`5o\u001dKz.7g<}Au!*VGEt\n", "", "u(E", "\u0011ND\u001bG", "", "\u0012D5\u000eH\u0013-M|g^M\u0010Xo)Wc\u0011Z*r\u0011\u0005+dm", "\u0013M0\u000f?\f8>\tl]", "\u0016D0\u00118\u00198Bt[a>&jl$E", "\u0017M8!<\b%M\u000bbc=\u0016n\u0003\u001dIt\b", "\u001b@G,6\u0016'1\tkg>\u0015k\u0003\u001dTl\bW(n", "\u001b@G,9\u0019\u001a;xxhB!\\", "\u001b@G,;\f\u001a2xktE\u0010jw)Sc\u001d[", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void clear() {
        this.set = 0;
        ArraysKt.fill$default(this.values, 0, 0, 0, 6, (Object) null);
    }

    public final int get(int i2) {
        return this.values[i2];
    }

    public final boolean getEnablePush(boolean z2) {
        return (this.set & 4) != 0 ? this.values[2] == 1 : z2;
    }

    public final int getHeaderTableSize() {
        int i2 = this.set;
        if ((i2 + 2) - (i2 | 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        int i2 = this.set;
        if ((i2 + 128) - (i2 | 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    public final int getMaxConcurrentStreams() {
        int i2 = this.set;
        if ((i2 + 16) - (i2 | 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int i2) {
        return (this.set & 32) != 0 ? this.values[5] : i2;
    }

    public final int getMaxHeaderListSize(int i2) {
        return (-1) - (((-1) - this.set) | ((-1) - 64)) != 0 ? this.values[6] : i2;
    }

    public final boolean isSet(int i2) {
        int i3 = 1 << i2;
        int i4 = this.set;
        return (i3 + i4) - (i3 | i4) != 0;
    }

    public final void merge(Settings other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (other.isSet(i2)) {
                set(i2, other.get(i2));
            }
        }
    }

    public final Settings set(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.values;
            if (i2 < iArr.length) {
                int i4 = 1 << i2;
                int i5 = this.set;
                this.set = (i4 + i5) - (i4 & i5);
                iArr[i2] = i3;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
