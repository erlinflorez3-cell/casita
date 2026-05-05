package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LazyLayoutBeyondBoundsInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tpA0JiP.`\\2şs{B$c$wDA٥0ԂR\t}M f~\u000b]ŲG\u000f\u0014\u0016A~:Smx\f\u0015?6PwW3{tm=nxN\u0005N7j<\b\u0010\u0019\u001aXTX\u0003\tPc\f@>ptHa%M3\u001db\u0018L!\u0019$li^6vo\f<\u0006ݍ\u0005ݦFN/ڿ\u0001\f[\u0011^TU\u0012-&ӿ/DO7\u001b+a\nWaiG\u001b? B;-Ҋ+/au]?f\u0007Е\u0019<"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"uc\u000fX\u0001", "", "u(E", "0dh<a+\u001b])\byl\u0010\f\t7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"uc\u000fXip\u000ehA1\u007f@>t", "3mS", "", "5dc\u0012a+", "u(8", "AsP?g", "5dc g(Kb", "/cS\u0016a;>`*z\u0002", "6`b\u0016a;>`*z\u0002l", "", "@d\\<i,\"\\(~\bo(\u0004", "", "7mc2e=:Z", "\u0017mc2e=:Z", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutBeyondBoundsInfo {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    public final Interval addInterval(int i2, int i3) {
        Interval interval = new Interval(i2, i3);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final void removeInterval(Interval interval) {
        this.beyondBoundsItems.remove(interval);
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.isNotEmpty();
    }

    public final int getStart() {
        int start = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                Interval interval = content[i2];
                if (interval.getStart() < start) {
                    start = interval.getStart();
                }
                i2++;
            } while (i2 < size);
        }
        if (start >= 0) {
            return start;
        }
        throw new IllegalArgumentException("negative minIndex".toString());
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                Interval interval = content[i2];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i2++;
            } while (i2 < size);
        }
        return end;
    }

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsInfo.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4I\u0007\":\u001b\u007f\u0007lkA0RqP\u008cXݸ0%ӆ,4RZd\u0005S?c\u001a\u0016\"7P^kupbZ9DǇ\n\u0016\u0007mtPc\u007fu\u0012=3\tŪ@{T}EQ`#7Kۚ3jS\b\u000e\u0019\u001aXϺ@|\u0001CY\f*0nqjX\u0013M\u0013\u001c*\u0006l!Gɭ[0_DR\u0005]h:S\twNf)u/+LSіUo\u0014\u0005n6+n8{֭$\u001c\n\u0015`s?1N8ތ\u0004965-as\u00067ݼ\u0004\u001a\u001dۀg\u000fcv4aU`n\f?+}dׂT\u00140»\u0013}\u0013B\u0012\u0013Σ+X"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"uc\u000fXip\u000ehA1\u007f@>t", "", "AsP?g", "", "3mS", "uH8uI", "5dc\u0012a+", "u(8", "5dc g(Kb", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Interval {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public static /* synthetic */ Interval copy$default(Interval interval, int i2, int i3, int i4, Object obj) {
            if ((i4 + 1) - (1 | i4) != 0) {
                i2 = interval.start;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                i3 = interval.end;
            }
            return interval.copy(i2, i3);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final Interval copy(int i2, int i3) {
            return new Interval(i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }

        public Interval(int i2, int i3) {
            this.start = i2;
            this.end = i3;
            if (i2 < 0) {
                throw new IllegalArgumentException("negative start index".toString());
            }
            if (i3 < i2) {
                throw new IllegalArgumentException("end index greater than start".toString());
            }
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }
    }
}
