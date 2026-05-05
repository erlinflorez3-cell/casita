package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000e^Lc\u0003\nI\u00066\u00146B\r+4ߚ\u007f\u0007tʑA0JfP.hS2şs{B0c$wCAi0Ԃ@\u001e\u007fTwi~J\t\u000bq\u000e>\u0015\u000e+IOǁ\ta \u0010JB\u001e?CQ}?Q`#6\u0015$@%Py3\u0001ʀ.H\u001ezCTY\u0017*0n|jX\u001bZ\u001d\u001c(\u0005l.GȽ\\0TDW\u0005]h/i\u00172H\\7w0+YSZ\u001d.\u001b\by\u001eYR}ߥ\u0015mY\u0011\u001aj[m\u0017\u0006\u0006\u000e\u0014v,?+wsɱ:^\bϬ--U\u0013kyvk\u0013Yx\fU+յgQXʫ@y\u0001\u0005\u001bCT\u001d\u0014*`.[\u001aǴ\f\u0014;ο\u000bUFZ\u0010e۶\u0004\u0011"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0013\tJ\u0003$\u0017U}\u0012F\u007fz", "", "", "AsP?g", "3mS\u0016a*Ec'\u0003\f^", "AsT=", "uH8\u0016\u001c\u001d", "4ha@g", "5dc\u0013\\9Lb", "u(8", ":`bA", "5dc\u0019T:M", "5dc g,I", "3pd._:", "", "=sW2e", "", "6`b566=S", "7r4:c;R", "7sT?T;H`", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E$\n&zVo\u001b8\u0006/B/", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class IntProgression implements Iterable<Integer>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final int first;
    private final int last;
    private final int step;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007lk?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004q(~:\t}P\u0018k|Mr\u000bq\u00136\u001a\u0007oDI\u0004|\u000e\u0016\u001d8Zom7ޢsD"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0013\tJ\u0003$\u0017U}\u0012F\u007fc\u0013c\u0006+3v\u001a8V\u0019", "", "u(E", "4q^:63Ha\u0019}gZ5~\t", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0013\tJ\u0003$\u0017U}\u0012F\u007fz", "@`]4X\u001aMO&\u000e", "", "@`]4X\fGR", "AsT=", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntProgression fromClosedRange(int i2, int i3, int i4) {
            return new IntProgression(i2, i3, i4);
        }
    }

    public IntProgression(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i2;
        this.last = ProgressionUtilKt.getProgressionLastElement(i2, i3, i4);
        this.step = i4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) obj).isEmpty()) {
                IntProgression intProgression = (IntProgression) obj;
                if (this.first != intProgression.first || this.last != intProgression.last || this.step != intProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final int getFirst() {
        return this.first;
    }

    public final int getLast() {
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
            if (this.first > this.last) {
                return true;
            }
        } else if (this.first < this.last) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new IntProgressionIterator(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sbAppend;
        int i2;
        if (this.step > 0) {
            sbAppend = new StringBuilder().append(this.first).append("..").append(this.last).append(" step ");
            i2 = this.step;
        } else {
            sbAppend = new StringBuilder().append(this.first).append(" downTo ").append(this.last).append(" step ");
            i2 = -this.step;
        }
        return sbAppend.append(i2).toString();
    }
}
