package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000e^Lc\u000b\u0004I\u00066\f6B\r(4\u0012}\u000enjG9L͜P.`ݷ2\u000fq|<$iJyّCU(\n*\tUNm|\u0005Ϻx\"s\u0015\u0016\u0018\tjZI\u0004w\u0016\u0011&r_uЀCQ}>Q`#6\u0015$@$Py3\u0001*.V\u0013\u000fzqOë\u00160Nu\u0003c\u001bZ\u001d\u001a@\u0014n&\u000f-tid5v|$Ɣ/k\twSf'\u000e4CaULb9%v\u0010,qT\u007fB#8k\t\u0017Tk?1? QKؙ'o1W\to6\u0007\u0016Z){c\u001bc\u000b&\u000b\u0005Ƣ_ϯˏ/WkK^\u0017@y\u0001\u0003\u001bDT\"\u00141`.[\u001aɊ\u0007Ԅ\u07baxz[@^\u000bvD\u0006\u0006o>g4\u000e6C9IjЂeA!\u05cbO}\u000b\u0019,+Ъn#cT\u0014\u007fڦ\u001fl"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7fM\u000b\u0019$G}\u001c@\u0001.\u000b", "", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "AsP?g", "3mS\u0016a*Ec'\u0003\f^", "AsT=", "", "uH8\u0016?2Hb \u0003\u0004(1\u000e\u0011xi\t7{M\n\u0013\u001e\u0011N\u000e=r5<h[*@{%;]AJuA\u0006\u0011ug9\u00149o?", "4ha@g", "5dc\u0013\\9Lb`\nk`{X\u0016\u000b", "u(8", "\u0017", ":`bA", "5dc\u0019T:M\u001b$o|.\b\nd", "5dc g,I", "3pd._:", "", "=sW2e", "", "6`b566=S", "7r4:c;R", "7sT?T;H`", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class UIntProgression implements Iterable<UInt>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final int first;
    private final int last;
    private final int step;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RkP.XT0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\u000b|Kr\u000bq\u00116\u001a\u0007mDI\u0004|\u000e\u0016\u001d7Zom7}sK?xtd\fڶ6$>\u0002\u0013\nʆ.R"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7fM\u000b\u0019$G}\u001c@\u0001.s7\b(Bi\u001f2WL\u0011", "", "u(E", "4q^:63Ha\u0019}gZ5~\t", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7fM\u000b\u0019$G}\u001c@\u0001.\u000b", "@`]4X\u001aMO&\u000e", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "@`]4X\fGR", "AsT=", "", "4q^:63Ha\u0019}gZ5~\tvN\u0006+H\u0013^%", "uH8\u0016\u001c\u0013D](\u0006~gu\n\u00058g\u007f6E0d &2|\u0018>\u0004%Cg\u0002*@C", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: fromClosedRange-Nkh28Cs */
        public final UIntProgression m10205fromClosedRangeNkh28Cs(int i2, int i3, int i4) {
            return new UIntProgression(i2, i3, i4, null);
        }
    }

    private UIntProgression(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i2;
        this.last = UProgressionUtilKt.m10189getProgressionLastElementNkh28Cs(i2, i3, i4);
        this.step = i4;
    }

    public /* synthetic */ UIntProgression(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) obj).isEmpty()) {
                UIntProgression uIntProgression = (UIntProgression) obj;
                if (this.first != uIntProgression.first || this.last != uIntProgression.last || this.step != uIntProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-pVg5ArA */
    public final int m10203getFirstpVg5ArA() {
        return this.first;
    }

    /* JADX INFO: renamed from: getLast-pVg5ArA */
    public final int m10204getLastpVg5ArA() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            if (Integer.compareUnsigned(this.first, this.last) > 0) {
                return true;
            }
        } else if (Integer.compareUnsigned(this.first, this.last) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.first, this.last, this.step, null);
    }

    public String toString() {
        StringBuilder sbAppend;
        int i2;
        if (this.step > 0) {
            sbAppend = new StringBuilder().append((Object) UInt.m9121toStringimpl(this.first)).append("..").append((Object) UInt.m9121toStringimpl(this.last)).append(" step ");
            i2 = this.step;
        } else {
            sbAppend = new StringBuilder().append((Object) UInt.m9121toStringimpl(this.first)).append(" downTo ").append((Object) UInt.m9121toStringimpl(this.last)).append(" step ");
            i2 = -this.step;
        }
        return sbAppend.append(i2).toString();
    }
}
