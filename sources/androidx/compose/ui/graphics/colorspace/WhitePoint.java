package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: WhitePoint.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4M\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ<$i6yCAU ԉ(\u001fѧ~g\u0016m\u000bw\u0011W\u001f\n$x\u0003,wV\ta \u0011JB\u001e@CQ}@Q`#7ӯ$20<:*\u0007*:L\u001ev\u0013Cy\r\"4NrRR;N\u0015\u001e \tV /\u001flk\\;`l\f;ǥ'\u0003wH\u000f:o4\u000bM%F\u0003(\u001dzo C@e6չ)S\u0011\u000e\u001bbM\u000eWqk\u0006/Ү(sP\u0002cNX.\u0015[܇PUx\u00013t\u0005\u007fӠ<-1OqKh\u000eVx+\u0002\u0013<\u0012\u0010\u001e'v/sֆeP\u001fA\u0003\u000bSn_2dP\u0010\u0013cL\u0016S~yۖ:cm_rS\u0019|IB̳\ff*\u000f\u00029[\u0003\"'۔\u001a\u001d\u0003_Fi@k^\u0015\tՒAm\n\b3\u00118\u0004HG.0ɨ\u00154\u001f¦O]?+/tRWRi\u000f\u0005\u000fiרmXPؗ:p\u001cA8\u0012ɚ^\\"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005]7\"$hLC\u000bl;$", "", "F", "", "G", "H", "uE5\u0013\u001c\u001d", "At\\", "uE5\u00139o/", "uE5uI", "5dc%", "u(5", "5dc&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "BnGFm", "", "BnGFmjNW\u0013\u0001\bZ7\u007f\r-sy5{G\u0001\u0013%G", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WhitePoint {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f109x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f110y;

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = whitePoint.f109x;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f3 = whitePoint.f110y;
        }
        return whitePoint.copy(f2, f3);
    }

    public final float component1() {
        return this.f109x;
    }

    public final float component2() {
        return this.f110y;
    }

    public final WhitePoint copy(float f2, float f3) {
        return new WhitePoint(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.f109x, whitePoint.f109x) == 0 && Float.compare(this.f110y, whitePoint.f110y) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f109x) * 31) + Float.hashCode(this.f110y);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f109x + ", y=" + this.f110y + ')';
    }

    public WhitePoint(float f2, float f3) {
        this.f109x = f2;
        this.f110y = f3;
    }

    public final float getX() {
        return this.f109x;
    }

    public final float getY() {
        return this.f110y;
    }

    public WhitePoint(float f2, float f3, float f4) {
        this(f2, f3, f4, f2 + f3 + f4);
    }

    private WhitePoint(float f2, float f3, float f4, float f5) {
        this(f2 / f5, f3 / f5);
    }

    public final float[] toXyz$ui_graphics_release() {
        float f2 = this.f109x;
        float f3 = this.f110y;
        return new float[]{f2 / f3, 1.0f, ((1.0f - f2) - f3) / f3};
    }
}
