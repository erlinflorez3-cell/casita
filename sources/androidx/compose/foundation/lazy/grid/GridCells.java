package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O$8\u000b<H\u0007\"B\u0012\u007f\u0007ln?\u0016Z͜x.\u0001Rb\u0010q\u0003<l{2q[Ae\u001c\u000e\"7Q|h\u0010nx];G\u001d\n.x\u0019.yY\u0007b*\u000f`D6c߅Lڎތ9d|8\u000b?`!ة}\u000eѐ\u001e)"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3{\u0015ohG\\", "", "1`[0h3:b\u0019\\\bh:\u000bdBi\u000e\u0006{G\b\u0005\u001b\\o\u001c", "", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "/uP6_(;Z\u0019l~s,", "AoP0\\5@", "\u000fcP=g0OS", "\u0014hg2W", "\u0014hg2W\u001aBh\u0019", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface GridCells {
    List<Integer> calculateCrossAxisCellSizes(Density density, int i2, int i3);

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\":\u001b\u007fјnjGӄLeN.ZS8-s{J$c$wDAZ0ԂR\t}M(r~Nh\u000b[\u000f4\u0017ѱn,WWAn \u0012JB\u001eCcS}BQb\u000b53&xŉ8B\u000b\u000f!BH>wAW\u0014, 8XvJT\u001dM3\u001b@\u000ff /(\rk\\A`l\f;_'\u0011uZNU`v\u0011\u001e\u0019TT?\r%btѫB˝9\u0015-مα\u000b_"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3{\u0015ohGED0av&\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3{\u0015ohG\\", "1nd;g", "", "uH\u0018#", "3pd._:", "", "=sW2e", "", "6`b566=S", "1`[0h3:b\u0019\\\bh:\u000bdBi\u000e\u0006{G\b\u0005\u001b\\o\u001c", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "/uP6_(;Z\u0019l~s,", "AoP0\\5@", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Fixed implements GridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i2) {
            this.count = i2;
            if (i2 <= 0) {
                throw new IllegalArgumentException(("Provided count " + i2 + " should be larger than zero").toString());
            }
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i2, int i3) {
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i2, this.count, i3);
        }

        public int hashCode() {
            return -this.count;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Fixed) && this.count == ((Fixed) obj).count;
        }
    }

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{BBc$\bCCU ~(\u000eeȞ\u0018g\u001dI\u001b\u0016S\u0013\u0014\u0016\u0011jZJǤ|] \u0011zS}CKM\u001eBif\u0003<\u001d\"H!f\u0001KЦ\u001arN\u001e~\u0013Cy\u0015XD\t\u0011H\\%S\u0015\u001c\"\u0006l)/)\u0005g|BxpkGG#1rrR5mH|{\u0016\rhw!\u0005a6+n8\fՙ'ھ\u0002ޗӱZ>ƄCsE\u0005v*ݓ+R{Z<ݻ\u001cB\u00143O\u0013|ğ*k"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3{\u0015ohGE?+J\u00026K]N\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3{\u0015ohG\\", ";h] \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "uE;8b;EW\"H\u007fo4F\r8t\u007f5\u0005<\b`uGp\nL}4\u0013c\u0007.Fz&,\\MHS0+\u001bhn\u000fJT", "\u0014", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "1`[0h3:b\u0019\\\bh:\u000bdBi\u000e\u0006{G\b\u0005\u001b\\o\u001c", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "/uP6_(;Z\u0019l~s,", "AoP0\\5@", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Adaptive implements GridCells {
        public static final int $stable = 0;
        private final float minSize;

        public /* synthetic */ Adaptive(float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2);
        }

        private Adaptive(float f2) {
            this.minSize = f2;
            if (Dp.m6637compareTo0680j_4(f2, Dp.m6638constructorimpl(0)) <= 0) {
                throw new IllegalArgumentException(("Provided min size " + ((Object) Dp.m6649toStringimpl(f2)) + " should be larger than zero.").toString());
            }
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i2, int i3) {
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i2, Math.max((i2 + i3) / (density.mo704roundToPx0680j_4(this.minSize) + i3), 1), i3);
        }

        public int hashCode() {
            return Dp.m6644hashCodeimpl(this.minSize);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Adaptive) && Dp.m6643equalsimpl0(this.minSize, ((Adaptive) obj).minSize);
        }
    }

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{BBc$\bCCU ~(\u000eeȞ\u0018g\u001dI\u001b\u0016S\u0013\u0014\u0016\u0011jZJǤ|] \u0011zS}CKM\u001eBif\u0003<\u001d\"H!f\u0001KЦ\u001arN\u001e~\u0013Cy\u0015XD\t\u0011H\\%S\u0015\u001c\"\u0006l)/)\u0005g|BxpkGG#1rrR5mH|{\u0016\rhw!\u0005a6+n8\fՙ'ھ\u0002ޗӱZ>ƄCsE\u0005v*ݓ+R{Z<ݻ\u001cB\u00143O\u0013|ğ*k"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3{\u0015ohGED0av&5Pc,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3{\u0015ohG\\", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "uE;8b;EW\"H\u007fo4F\r8t\u007f5\u0005<\b`uGp\nL}4\u0013c\u0007.Fz&,\\MHS0+\u001bhn\u000fJT", "\u0014", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "1`[0h3:b\u0019\\\bh:\u000bdBi\u000e\u0006{G\b\u0005\u001b\\o\u001c", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "/uP6_(;Z\u0019l~s,", "AoP0\\5@", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class FixedSize implements GridCells {
        public static final int $stable = 0;
        private final float size;

        public /* synthetic */ FixedSize(float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2);
        }

        private FixedSize(float f2) {
            this.size = f2;
            if (Dp.m6637compareTo0680j_4(f2, Dp.m6638constructorimpl(0)) <= 0) {
                throw new IllegalArgumentException(("Provided size " + ((Object) Dp.m6649toStringimpl(f2)) + " should be larger than zero.").toString());
            }
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i2, int i3) {
            int iMo704roundToPx0680j_4 = density.mo704roundToPx0680j_4(this.size);
            int i4 = iMo704roundToPx0680j_4 + i3;
            int i5 = i3 + i2;
            if (i4 < i5) {
                int i6 = i5 / i4;
                ArrayList arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 < i6; i7++) {
                    arrayList.add(Integer.valueOf(iMo704roundToPx0680j_4));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(Integer.valueOf(i2));
            return arrayList2;
        }

        public int hashCode() {
            return Dp.m6644hashCodeimpl(this.size);
        }

        public boolean equals(Object obj) {
            return (obj instanceof FixedSize) && Dp.m6643equalsimpl0(this.size, ((FixedSize) obj).size);
        }
    }
}
