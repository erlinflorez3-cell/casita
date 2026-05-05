package androidx.graphics.path;

import android.graphics.PointF;
import java.util.Arrays;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: PathSegment.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r14\u0012\u000e\u0007nʑA0RjP.XZ2\u000fy\u0005<$a$yCI[\"Ԃ*\t]ZogtJpŏs\u000f4\u00151iB\nx~ز\"\u0013@B\b?aN\u007fGGb\r<\u0015\"B\"f}3\u0004*.V\u0015\u000fzqQë\u00160Nw\u0003c\u001b\\\u001d\u001a@\u0016n&\u000f/tid5vk$Ɣ/k\twTf'\u000eCCaULb;%v\u00103qT\bL#'k\t\u0017Tk?1C @ݾl//+W}o8^\b\"\u001e{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQ[\u001c4H\n\n\u0012T\u0004<\fόL45Կ~\n\u0014@\u0003\u0001ՈDg"}, d2 = {"\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?d%7a})FC", "", "Bx_2", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?d%7a})F,\u0005BXC\u0011", ">nX;g:", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", "EdX4[;", "", "uKP;W9HW\u0018\u0012D`9x\u00142i}6EK|&\u001a\u0011Z\nKy\u00135[\u0006 @|T\u001daN;A*\u0005\u0011q`F\u0011g+\u0018x4CWQ0Z`<(\u001e\u0016c\u001d/\u0001mHJ", "5dc\u001db0Gb'", "u(J\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nk!\u001bP~n\u0012", ")KP;W9HW\u0018H|k(\b\f3c\u000eqfJ\u0005 &(E", "5dc!l7>", "u(;.a+K]\u001d}\u000e(.\n\u0005:h\u0004&\n\n\f\u0013&J9x8\u0006(#Y\u007f(7v%l<WFk\n", "5dc$X0@V(", "u(5", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "\"x_2", "5qP=[0<a`\nvm/v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathSegment {
    private final PointF[] points;
    private final Type type;
    private final float weight;

    /* JADX INFO: compiled from: PathSegment.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u000bGّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOC\u000bI\u0015n\u0016~q\u0082M]"}, d2 = {"\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?d%7a})F,\u0005BXC\u0011", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001bne2", "\u001ah]2", "\u001ftP1e(MW\u0017", "\u0011n]6V", "\u0011tQ6V", "\u0011k^@X", "\u0012n]2", "5qP=[0<a`\nvm/v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public PathSegment(Type type, PointF[] points, float f2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(points, "points");
        this.type = type;
        this.points = points;
        this.weight = f2;
    }

    public final Type getType() {
        return this.type;
    }

    public final PointF[] getPoints() {
        return this.points;
    }

    public final float getWeight() {
        return this.weight;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        PathSegment pathSegment = (PathSegment) obj;
        return this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Arrays.hashCode(this.points)) * 31) + Float.hashCode(this.weight);
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder("PathSegment(type=").append(this.type).append(", points=");
        String string = Arrays.toString(this.points);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        return sbAppend.append(string).append(", weight=").append(this.weight).append(')').toString();
    }
}
