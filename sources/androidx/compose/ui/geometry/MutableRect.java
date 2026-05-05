package androidx.compose.ui.geometry;

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
/* JADX INFO: compiled from: MutableRect.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4K\u0007\":\u001b\u007f\u0007lnA0ZeP.XY2\u000f\u0002{<$a%yCIU\"}(\tWNusvϺ`\u0010YƤ6\u0016'ille|k\u0012'2ppO7[qU9\u000fuF\t.5:8(\u0006\u0011\u001e8L(v)Dƚ\u0010\u0012>E9S`(e\u0005H\u001f6B.\u001d6\\\u0016k|ԦlԐ9ǂݭ\u0007kHl5~x#[-^TU.'e,+X7c\u0016UW\u0011\tj[m\u0004ouK\b\u0001'U,ywe:p\u007fB\u0016qTU\u0002\u0001Ht\u0005\u007f\u0002<+9O{K~\u000fX{\t}%<2\u000f6+V1E\u001a\u0015\t>7\u0003vk@~\u0003'H\u000e\u001ey6EIFG{Q)jiai\u001a%Ѡ\b˿\u0011*+Ч\u0007#aZ\u001cg5\u001dZ\u007f_:\"PKRf\n\b>$֕pĊ\u0006.\u001c2M\u000b=\u0003a=%1O[g0W0ɘLH\u007fx\u000blva:jV@:nD8\u0001¥\u0018ʑHp\rߘhV^;\u001fT<V\r\u000e\u0016\u001cpt\u0006?9%>O&ŝuҷQi\u0012ɘGh=j|r.Y?pA>\"x\u001etjvBSr'ܬW٨δR\u000bȺ`,:4N\u007f\u001e\u000eL\\\\\u000e+2mrrـ8֞\u001dh\u001dǽ\u001b HX\u000b\u0010\u007f\\n(\r]\u00044\u0011\u0003<t7\u0002\u0007˛p״k|a.\u0003z04ێQ>!)[Ɋ\u0005b{+\u0007\u0005\u0013ûK\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001di\r\u001c4t\u0016\u001bMAJA", "", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "uE5\u00139o/", "5dc\u000fb;M]!", "u(5", "Adc\u000fb;M]!", "uE\u0018#", "6dX4[;", "5dc\u0015X0@V(", "7r4:c;R", "", "u(I", "5dc\u0019X-M", "Adc\u0019X-M", "5dc\u001f\\.Ab", "Adc\u001f\\.Ab", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc \\A>\u001b\u0002aBc)i\u0007", "u(9", "5dc!b7", "Adc!b7", "EhSA[", "5dc$\\+MV", "1n]AT0Ga", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1n]AT0Ga`\u0005B-3hS\u0017", "uI\u0018'", "7mc2e:>Q(", "", "Adc", "BnBAe0GU", "", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
    }

    public final float getLeft() {
        return this.left;
    }

    public final void setLeft(float f2) {
        this.left = f2;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setTop(float f2) {
        this.top = f2;
    }

    public final float getRight() {
        return this.right;
    }

    public final void setRight(float f2) {
        this.right = f2;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final void setBottom(float f2) {
        this.bottom = f2;
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final void intersect(float f2, float f3, float f4, float f5) {
        this.left = Math.max(f2, this.left);
        this.top = Math.max(f3, this.top);
        this.right = Math.min(f4, this.right);
        this.bottom = Math.min(f5, this.bottom);
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m3924containsk4lQ0M(long j2) {
        return Offset.m3937getXimpl(j2) >= this.left && Offset.m3937getXimpl(j2) < this.right && Offset.m3938getYimpl(j2) >= this.top && Offset.m3938getYimpl(j2) < this.bottom;
    }

    public final void set(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
    }

    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m3925getSizeNHjbRc() {
        return SizeKt.Size(getRight() - getLeft(), getBottom() - getTop());
    }
}
