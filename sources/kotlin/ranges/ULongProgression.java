package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ULong;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000e^Lc\u000b\u0004I\u00066\f6B\r)4\u0012}\u000enjG9L͜P.`ݷ2şs{B*c$wCCU($*ޛWNusvJ`\u000bI$\u001cǝ\u0017\u0003\\Oezm\u0012=2pnw2e0Z?ś\u0005:\u0013!J\"fy\u0015\u0005(,`\u0010%zSO\u001a\u0015H@\u001f>ň\u0011M\u0013\u001fZ\u0017L-\u0019\u001e\u000bu~<V{u<E\"1y\tĎ'(6\u000b^%F\u00039S\u000b*$9SO5C3\u001a\u0017O_iS\u001bE\u0002?\u0015hU'Y^:ɕ6!\u0006\"+CO;t9:-\u0019_f$'YOԣJִˎ,\u007f\u0003{\u001bE\u001c\u0010\f.V6}.t\u0012&3#r֘?АؿbJ\bzo?/'\u0006>9Aku_dS\u0019|;߉\t\u0013&ŀ\u0019p'gb\u0016֮\u0015\u001d\\wWPҮDV"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}+\u000e!\u0019To\u001cJz/>/", "", "\u001aj^A_0G\u001d\te\u0005g.R", "AsP?g", "3mS\u0016a*Ec'\u0003\f^", "AsT=", "", "uI9\u0017?2Hb \u0003\u0004(1\u000e\u0011xi\t7{M\n\u0013\u001e\u0011N\u000e=r5<h[*@{%;]AJuA\u0006\u0011ug9\u00149o?", "4ha@g", "5dc\u0013\\9Lb`\rBO\u0012en\u001f", "u(9", "\u0018", ":`bA", "5dc\u0019T:M\u001b'FkD\u0015bx", "5dc g,I", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "7r4:c;R", "7sT?T;H`", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ULongProgression implements Iterable<ULong>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RlP.XT0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\u000b|Kr\u000bq\u00116\u001a\u0007mDI\u0004|\u000e\u0016\u001d7Zom7}sK?xtd\fڶ6$>\u0002\u0013\nʆ.R"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}+\u000e!\u0019To\u001cJz/>\u0018[*?x\u00127QMDA", "", "u(E", "4q^:63Ha\u0019}gZ5~\t", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}+\u000e!\u0019To\u001cJz/>/", "@`]4X\u001aMO&\u000e", "\u001aj^A_0G\u001d\te\u0005g.R", "@`]4X\fGR", "AsT=", "", "4q^:63Ha\u0019}gZ5~\tv7\u00017X3K\u0019", "uI9\u0017\u001c\u0013D](\u0006~gu\n\u00058g\u007f6E0g! IZ\u001bFx25g\f$Avk", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: fromClosedRange-7ftBX0g */
        public final ULongProgression m10214fromClosedRange7ftBX0g(long j2, long j3, long j4) {
            return new ULongProgression(j2, j3, j4, null);
        }
    }

    private ULongProgression(long j2, long j3, long j4) {
        if (j4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j4 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j2;
        this.last = UProgressionUtilKt.m10188getProgressionLastElement7ftBX0g(j2, j3, j4);
        this.step = j4;
    }

    public /* synthetic */ ULongProgression(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) obj).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) obj;
                if (this.first != uLongProgression.first || this.last != uLongProgression.last || this.step != uLongProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-s-VKNKU */
    public final long m10212getFirstsVKNKU() {
        return this.first;
    }

    /* JADX INFO: renamed from: getLast-s-VKNKU */
    public final long m10213getLastsVKNKU() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = this.first;
        int iM9154constructorimpl = ((int) ULong.m9154constructorimpl(j2 ^ ULong.m9154constructorimpl(j2 >>> 32))) * 31;
        long j3 = this.last;
        int iM9154constructorimpl2 = (iM9154constructorimpl + ((int) ULong.m9154constructorimpl(j3 ^ ULong.m9154constructorimpl(j3 >>> 32)))) * 31;
        long j4 = this.step;
        return iM9154constructorimpl2 + ((int) ((j4 >>> 32) ^ j4));
    }

    public boolean isEmpty() {
        long j2 = this.step;
        long j3 = this.first;
        long j4 = this.last;
        if (j2 > 0) {
            if (Long.compareUnsigned(j3, j4) > 0) {
                return true;
            }
        } else if (Long.compareUnsigned(j3, j4) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.first, this.last, this.step, null);
    }

    public String toString() {
        StringBuilder sbAppend;
        long j2;
        if (this.step > 0) {
            sbAppend = new StringBuilder().append((Object) ULong.m9200toStringimpl(this.first)).append("..").append((Object) ULong.m9200toStringimpl(this.last)).append(" step ");
            j2 = this.step;
        } else {
            sbAppend = new StringBuilder().append((Object) ULong.m9200toStringimpl(this.first)).append(" downTo ").append((Object) ULong.m9200toStringimpl(this.last)).append(" step ");
            j2 = -this.step;
        }
        return sbAppend.append(j2).toString();
    }
}
