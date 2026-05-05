package androidx.compose.ui.graphics;

import kotlin.Metadata;
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
    	... 4 more
    */
/* JADX INFO: compiled from: IntervalTree.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDRш|İI\u0006>\u00106B\u0005*4\u0012\u0006\u0010nj?2LeV4ZS0\u000fs{B0cҕwXQ٥B\u007f(ޛ]M\u0018g\u001dJ\u001b*S\u0013\u0014\u0017\u0011jZKe|k\u0015'2pqO;SoK=xvL\u0004V݅ŕ<y\u0013\u0006b9V\u001c\u000fzqX<\u0016>N\t:\u0001\u000f\u0014į\u001aZ\u0017L/\u0019\u001e\u000bt~<V|u<E\"1i\tĎ'(6\u000b^%F\u00039S\u000b*09SO5C2\u0004\r\u0015bsE\u0013A\u0002=;ؒUݐs]\u0002jNX.!E/]\u000eurT^5Un\u000f?+}e\u0014V\u001c<\u0010z*\"\u0003\u0018^\u00195LF/0e>Ԅ\u07baxz[@^\nvD\u0006\u0001o=g4\u000e6C9IhЂeA!\u05cbO}\u000b\u0016,-Q}/\\l\u000e\u000f\u0017ôX}YĸiBCS\\\u0014\u0558A\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125#", "\"", "", "AsP?g", "", "3mS", "2`c.", "uE5\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\b", "5dc\u0011T;:", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc\u0012a+", "u(5", "5dc g(Kb", "1n]AT0Ga", "", "D`[BX", "3pd._:", "=sW2e", "6`b566=S", "", "=uT?_(Ia", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class Interval<T> {
    private final T data;
    private final float end;
    private final float start;

    public Interval(float f2, float f3, T t2) {
        this.start = f2;
        this.end = f3;
        this.data = t2;
    }

    public /* synthetic */ Interval(float f2, float f3, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, (i2 + 4) - (i2 | 4) != 0 ? null : obj);
    }

    public final T getData() {
        return this.data;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public final boolean overlaps(Interval<T> interval) {
        return this.start <= interval.end && this.end >= interval.start;
    }

    public final boolean overlaps(float f2, float f3) {
        return this.start <= f3 && this.end >= f2;
    }

    public final boolean contains(float f2) {
        return f2 <= this.end && this.start <= f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end && Intrinsics.areEqual(this.data, interval.data);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.start) * 31) + Float.hashCode(this.end)) * 31;
        T t2 = this.data;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Interval(start=" + this.start + ", end=" + this.end + ", data=" + this.data + ')';
    }
}
