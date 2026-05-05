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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000e^Lc\u0003\u000bI\u00066\u00146B\r+4ߚ\u007f\u0007tʑAӄLeV4ZS0\u000fs{J$cҕyCIa\"}(\tUb}˧\r`\u000b\u0011S\u0011\u0016\u0016'jZH\u000ewsR,8ԏ\u007fCAN\b=g`\u0005:\u0013\"J\"fy\u0015\u0005(-`\u0010%zŲO\f 4\t\u0002H]%M3&B\fL-\u0019 rf|D\u000fǤ]\u000351\u0012\u0002B|7&DES\u001bWl';\u0003(2sGEG-%\u0002\u0016Mҏ[\b\tM\u0006U\u0005\u0017<m?\u001a\u0003e;p\u007fB\u0015ۣS\u0013eö>^\u000bWn\u0013w:]kcP<(Þ~\u0002\u0015ɝ\u001c\u0010\f0V5})t\u000b&3#rՂDV\nމZ\u0002\u0001kD\u001eԄ\u0004J"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0016o\t*fM\u000b\u0019$G}\u001c@\u0001.\u000b", "", "", "AsP?g", "3mS\u0016a*Ec'\u0003\f^", "AsT=", "uI9\u0017\u001c\u001d", "4ha@g", "5dc\u0013\\9Lb", "u(9", ":`bA", "5dc\u0019T:M", "5dc g,I", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "7r4:c;R", "7sT?T;H`", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u000b \u0019+~\u000eIr4?fS", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class LongProgression implements Iterable<Long>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0019\u007f\u0007lk?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004q(~:\t}P\u0018k|Mr\u000bq\u00136\u001a\u0007oDI\u0004|\u000e\u0016\u001d8Zom7ޢsD"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0016o\t*fM\u000b\u0019$G}\u001c@\u0001.s7\b(Bi\u001f2WL\u0011", "", "u(E", "4q^:63Ha\u0019}gZ5~\t", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0016o\t*fM\u000b\u0019$G}\u001c@\u0001.\u000b", "@`]4X\u001aMO&\u000e", "", "@`]4X\fGR", "AsT=", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LongProgression fromClosedRange(long j2, long j3, long j4) {
            return new LongProgression(j2, j3, j4);
        }
    }

    public LongProgression(long j2, long j3, long j4) {
        if (j4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j4 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j2;
        this.last = ProgressionUtilKt.getProgressionLastElement(j2, j3, j4);
        this.step = j4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongProgression) {
            if (!isEmpty() || !((LongProgression) obj).isEmpty()) {
                LongProgression longProgression = (LongProgression) obj;
                if (this.first != longProgression.first || this.last != longProgression.last || this.step != longProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getLast() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = 31;
        long j3 = this.first;
        long j4 = this.last;
        long j5 = j2 * (((j3 ^ (j3 >>> 32)) * j2) + (j4 ^ (j4 >>> 32)));
        long j6 = this.step;
        return (int) (j5 + (j6 ^ (j6 >>> 32)));
    }

    public boolean isEmpty() {
        long j2 = this.step;
        long j3 = this.first;
        long j4 = this.last;
        if (j2 > 0) {
            if (j3 > j4) {
                return true;
            }
        } else if (j3 < j4) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return new LongProgressionIterator(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sbAppend;
        long j2;
        if (this.step > 0) {
            sbAppend = new StringBuilder().append(this.first).append("..").append(this.last).append(" step ");
            j2 = this.step;
        } else {
            sbAppend = new StringBuilder().append(this.first).append(" downTo ").append(this.last).append(" step ");
            j2 = -this.step;
        }
        return sbAppend.append(j2).toString();
    }
}
