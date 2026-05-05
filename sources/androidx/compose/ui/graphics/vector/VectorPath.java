package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
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
/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r@4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$i)yCAW\"}8\tWȞog\u0005Jb\u000bI'\u000e\u0016\u0007s4կ]xk܈\u0017˰JoM9UڎC>vҚf\u0005N1bؚx\u000bЏ*0N\u0010\u0005z[K:\u0013@J~<j\u0013]\u0007*\u00124BN\u0004.`uSNH\u001bcJ7)\u0003wIf)u/+U\u001dLZ'\u001b\u007fy\u001eYJG=\u001b%a\u000e\u001fTq>1G\u0002C\u000bh53CI\"aF^\u0006\u0014#8g\r\f|6b\u000bQn\u001a?+}r[V\u0014(\u0006\u000b\u0014\rj\u0015\u001e\f-H<?2f6\u0018CzxSNc\u001a^p\n\u000bg<\u00173\u0014K+g%vWg;'cO{3\u0017̷'\u0001|7$e\u001c\f-\u001b\u0003$\u00027_mUJd\t\bk4եp+\b83HG._B%~(3>s;9 \u001a\nҩHm~ݓxjY\u0001``\u00111|\u001fO*7\u0016ʑHj\rߘhV^E\u001fglc\u0015} \u0013N]ʟ@'-īfQn\u0005xi.\u001f31~=ip{\u000e\u0006=\r6̳Ui\u0018Рjx\u001a\\J\u0001UotGk\f\tbΞ!ȭi\u000fȑ\u007fLV\f!SWs\"S:Qim#S\u001b X@+\u0011ރ^n\u0018зl5*%w<E\u0018\u000f\\tp\u001eq֑M2\u0005ʠ:/GtC3vl0vL|Q\u0016ӡrÒűfKܤPt\u001euc\u001d8\u0018 ]_O\u000e*\u001d\u000fA20>ןKǩхPLɟ+\u0003\u0005y\u001d\\\u00010m-x\u0011|ox\\gTE,Ցbx+Ψ|\u0002\u007f\bT\u0015\u0018rb\u0018s>w|è]BV˻\u0015\u0007%E3\u001b@1\u000bIECU'ə{\u001a7֒y_o\u0018<\u00143\u001e4\n}\u0004Zm݁shYϡJ=>rg\u0019\u000f12\u007f\u001bBvt͎\fH\u0011ͩ%5Nkr\u000bތ8V\u00132\u0004֧#Z\fxVaYݍs/"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\u0011wd\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\u0007\u001fga\u000f", "<`\\2", "", ">`c57(MO", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", ">`c590EZ\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0018q\u001d5<WFk\n", "4h[9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "4h[943IV\u0015", "", "Asa<^,", "Asa<^,\u001aZ$\u0002v", "Asa<^,%W\"~lb+\f\f", "Asa<^,%W\"~XZ7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "Asa<^,%W\"~_h0\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "Asa<^,%W\"~bb;|\u0016", "BqX:C(MV\u0007\u000evk;", "BqX:C(MVx\by", "BqX:C(MV\u0003\u007f{l,\f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rQ|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.iN}@\u0018\u0010hW+8\u001d\u0013\\\u0017\u0005U@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)VTQSe\u007fElC\u0001=\u001b\u001b\u0005zw#*oT7S\u0001d\u0019<V\u0003vgT\"v?m\u001dm\\BUvd\u001a~0-Z\t\b\u0010Ab\u0002\u0013p:\n47\f(u", "5dc\u0013\\3E", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004", "5dc\u0013\\3E/ \n}Z", "u(5", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001dT;A2\u0015\u000ev", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001dT;A4\u001d\u0006\u0002M@\b\tvR\u0002o\u0002\fj%", "u(8", "\u0017", "5dc g9HY\u0019", "5dc g9HY\u0019Z\u0002i/x", "5dc g9HY\u0019e~g,Z\u0005:-e$f#\u0007x)", "5dc g9HY\u0019e~g,a\u00133nG\u000f\u000f!]\u001f\u001d\u001a", "5dc g9HY\u0019e~g,d\r>e\r", "5dc g9HY\u0019e~g,n\r.t\u0003", "5dc!e0F>\u0015\u000e}>5{", "5dc!e0F>\u0015\u000e}H-}\u0017/t", "5dc!e0F>\u0015\u000e}L;x\u0016>", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;
    private final Brush fill;
    private final float fillAlpha;
    private final String name;
    private final List<PathNode> pathData;
    private final int pathFillType;
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    public /* synthetic */ VectorPath(String str, List list, int i2, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i2, brush, f2, brush2, f3, f4, i3, i4, f5, f6, f7, f8);
    }

    public /* synthetic */ VectorPath(String str, List list, int i2, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, list, i2, (-1) - (((-1) - i5) | ((-1) - 8)) != 0 ? null : brush, (i5 & 16) != 0 ? 1.0f : f2, (-1) - (((-1) - i5) | ((-1) - 32)) == 0 ? brush2 : null, (-1) - (((-1) - i5) | ((-1) - 64)) != 0 ? 1.0f : f3, (i5 & 128) != 0 ? 0.0f : f4, (-1) - (((-1) - i5) | ((-1) - 256)) != 0 ? VectorKt.getDefaultStrokeLineCap() : i3, (-1) - (((-1) - i5) | ((-1) - 512)) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i4, (i5 & 1024) != 0 ? 4.0f : f5, (i5 & 2048) != 0 ? 0.0f : f6, (i5 + 4096) - (i5 | 4096) == 0 ? f7 : 1.0f, (i5 + 8192) - (i5 | 8192) == 0 ? f8 : 0.0f, null);
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* JADX INFO: renamed from: getPathFillType-Rg-k1Os */
    public final int m4899getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* JADX INFO: renamed from: getStrokeLineCap-KaPHkGw */
    public final int m4900getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-LxFBmk8 */
    public final int m4901getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VectorPath(String str, List<? extends PathNode> list, int i2, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i2;
        this.fill = brush;
        this.fillAlpha = f2;
        this.stroke = brush2;
        this.strokeAlpha = f3;
        this.strokeLineWidth = f4;
        this.strokeLineCap = i3;
        this.strokeLineJoin = i4;
        this.strokeLineMiter = f5;
        this.trimPathStart = f6;
        this.trimPathEnd = f7;
        this.trimPathOffset = f8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            return Intrinsics.areEqual(this.name, vectorPath.name) && Intrinsics.areEqual(this.fill, vectorPath.fill) && this.fillAlpha == vectorPath.fillAlpha && Intrinsics.areEqual(this.stroke, vectorPath.stroke) && this.strokeAlpha == vectorPath.strokeAlpha && this.strokeLineWidth == vectorPath.strokeLineWidth && StrokeCap.m4527equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) && StrokeJoin.m4537equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin) && this.strokeLineMiter == vectorPath.strokeLineMiter && this.trimPathStart == vectorPath.trimPathStart && this.trimPathEnd == vectorPath.trimPathEnd && this.trimPathOffset == vectorPath.trimPathOffset && PathFillType.m4456equalsimpl0(this.pathFillType, vectorPath.pathFillType) && Intrinsics.areEqual(this.pathData, vectorPath.pathData);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        Brush brush = this.fill;
        int iHashCode2 = (((iHashCode + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        Brush brush2 = this.stroke;
        return ((((((((((((((((((iHashCode2 + (brush2 != null ? brush2.hashCode() : 0)) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + StrokeCap.m4528hashCodeimpl(this.strokeLineCap)) * 31) + StrokeJoin.m4538hashCodeimpl(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + PathFillType.m4457hashCodeimpl(this.pathFillType);
    }
}
