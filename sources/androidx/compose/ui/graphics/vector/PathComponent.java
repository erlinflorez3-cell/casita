package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\fnj?4LeV7ZS0\u000fs{B0c$wGCU0}*\t]log\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4I[}e\u0012%2JoE<UoS9ht<\u0006(288\u0002\u0005\u0007\"2H&v\u0003CQ\u0015\u001a0NpBR\u0013M\r\u001a(\u0006FĨ\u0007Ȧrɡ~6vk\u001e=ǥ'\u0003wB\u0017-m~\u0015M;X\u001b;U|omC@e\u0006[%\u001c\t\u0015$s?1\u00108=Mr5yCI\"(^X.g[? 3ku>^\u001bP\u000f\u000eW1]dcR$'&|:Q\u0013ǐ\u001aΝ+T6Ʀ2h\u000e\u0012Ay\u0013UFV\u0010e\u0013\"\tjN\u0017S\bc/G\u001c~Q\u0010CW\u0013\u000eޭ\u0011ڟ\"/\t͙9]Z\u0018n ;V}]?^\u0011IV\\\"Yk|Z͒n͆.\u00048ϚP;\n!F\u0017SF2ހ/\u074co\u0002Pֳ8\u0003\u0013q\u0001S\u0018a\u001fؚ.å\u001a72\u009e\\|Rw\u001dk~f\t0\u001fN4T5\u0010FWvφ\u0004˶%1\u0018ʚgjo~[r*'5|Ep?w\u001coQ^aN(Ҳ\u0012уVv\u001c̳\r\u0011\u0013t~Hc\u000ej\\V=`b\u001b\u001a\u0006|\\T\u001c\u0015B? 7bFo]3ðTҴ\"NIґ!a`\u0006\u001e\u001dt5*\"wDE3\u000frtp\u001e\t)M:}x\"[b\u0010yoĦaʡgؔţ\"\u0006ҋw\u000eOgZndn\u001c\u0019c @\u0018 ^_U\u000e,\u001d'A20V{\rIϏʽMɟ+\u0005\u0005{\u0015gv[\u007f\np\u001b:\f;V]\u0003/\"%wIֿ\u0014ܐ\u0004yi¿Kmq\u0004#]TH!\u0005\nB\\9\u0015\u00075\u001dS\u0003.fSލ9ϡ+)\u001eߐ,1\u001b\u0012kn\u00100\u007f\u0014\u001d-E\b\u0012^{\u0016\u001ej\u0002a@<PI\b\u0007|fzО\u000f\u074cLv\u007f٤Z\u000b:@ASafv\u000bFZ[Y\f\u001d\u001f,;&\u0007_H\u0014\b}bc\u001enJʜ\nү]ƹӒ\u0010LϬk{uKj2b\u0011\u0010B\nU\u000f\u0014\"u.|(\r\u0017j\u001esFoq?p\u0006T\tRmj\u0001^ՈOԆhвڄy~ʮc\u001d\u001f2P\u001bSX\u0014\u0010\u0007\u0001vJ\u000b\u001dS\u0007qL\u000f<'3L\u0001e5\u0013n^T]kpE*\u0000\u0015ƨn[\u0007ܺ=-J\u0013G&HZ\u0007JSj\u0014k\u0010v\u001cGWu\u001cs\u001a90|KJV_\u0010ܸ\u001dچz<fΗmfT&\u0005\u001d\u0007TTd7\fK\u000b\u001c\u007f\"\u0011!\u0018}7F۱9ٮRw?Ƒj#%\nA\u0007:\u0005\u0014J).\u001e5[E\b/jդ\b\u009cWG\u0006И8\"-J\u0003,|Y\u0014.\u0018jk\\$:.b0\u0011CT.\u0005FJ#zHr^ˍ[ױ7\u000e\u001bȅqm}jN2Kn\f\rYuI,q8{n\u0004\u00133j?W\u0012n[X[M}Ӕ: \\fBÎk\"^]\u000e\u001f5(%\u0004\u0016oϭ\u0010Xkkvփk\n\f3/qIՆ5\u0005"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>I>& rj9\u0010r\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001f6M:k\n", "u(E", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "4h[9", "5dc\u0013\\3E", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004", "Adc\u0013\\3E", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epkq>", "", "4h[943IV\u0015", "5dc\u0013\\3E/ \n}Z", "u(5", "Adc\u0013\\3E/ \n}Z", "uE\u0018#", "7r?.g/\u001dW&\u000e\u000f", "", "7rBAe6DSw\u0003\bm@", "7rC?\\4)O(\u0002Yb9\f\u001d", "", "<`\\2", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001bT4>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", ">`c57(MO", "5dc\u001dT;A2\u0015\u000ev", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u001dT;A2\u0015\u000ev", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0018q\u001d5<WFk\n", ">`c590EZ\b\u0013\u0006^", "5dc\u001dT;A4\u001d\u0006\u0002M@\b\tvR\u0002o\u0002\fj%", "u(8", "Adc\u001dT;A4\u001d\u0006\u0002M@\b\tvokznEO\u0007", "uH\u0018#", "\u0017", ">`c5@,:a)\fz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u001fm\u0012<]P;A", "5dc\u001dT;A;\u0019z\tn9|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001cFp}.IQKx4s", ">`c5@,:a)\fz\u001d+|\u0010/g{7{", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "@d]1X9)O(\u0002", "Asa<^,", "5dc g9HY\u0019", "Adc g9HY\u0019", "Asa<^,\u001aZ$\u0002v", "5dc g9HY\u0019Z\u0002i/x", "Adc g9HY\u0019Z\u0002i/x", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "Asa<^,%W\"~XZ7", "5dc g9HY\u0019e~g,Z\u0005:-e$f#\u0007x)", "Adc g9HY\u0019e~g,Z\u0005:-\\(a\u0012dzv", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "Asa<^,%W\"~_h0\u0006", "5dc g9HY\u0019e~g,a\u00133nG\u000f\u000f!]\u001f\u001d\u001a", "Adc g9HY\u0019e~g,a\u00133nG\u001a\u000e\u0014ac\u001f3", "Asa<^,%W\"~bb;|\u0016", "5dc g9HY\u0019e~g,d\r>e\r", "Adc g9HY\u0019e~g,d\r>e\r", "Asa<^,%W\"~lb+\f\f", "5dc g9HY\u0019e~g,n\r.t\u0003", "Adc g9HY\u0019e~g,n\r.t\u0003", "Asa<^,,b-\u0006z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r)zA(\u001bh7", "BqX:C(MVx\by", "5dc!e0F>\u0015\u000e}>5{", "Adc!e0F>\u0015\u000e}>5{", "BqX:C(MV\u0003\u007f{l,\f", "5dc!e0F>\u0015\u000e}H-}\u0017/t", "Adc!e0F>\u0015\u000e}H-}\u0017/t", "BqX:C(MV\u0007\u000evk;", "5dc!e0F>\u0015\u000e}L;x\u0016>", "Adc!e0F>\u0015\u000e}L;x\u0016>", "BnBAe0GU", "CoS.g,)O(\u0002", "", "CoS.g,+S\"}zk\u0017x\u00182", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathComponent extends VNode {
    public static final int $stable = 8;
    private Brush fill;
    private float fillAlpha;
    private boolean isPathDirty;
    private boolean isStrokeDirty;
    private boolean isTrimPathDirty;
    private String name;
    private final Path path;
    private List<? extends PathNode> pathData;
    private int pathFillType;
    private final Lazy pathMeasure$delegate;
    private Path renderPath;
    private Brush stroke;
    private float strokeAlpha;
    private int strokeLineCap;
    private int strokeLineJoin;
    private float strokeLineMiter;
    private float strokeLineWidth;
    private Stroke strokeStyle;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;

    public PathComponent() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = VectorKt.getDefaultFillType();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.getDefaultStrokeLineCap();
        this.strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        Path Path = AndroidPath_androidKt.Path();
        this.path = Path;
        this.renderPath = Path;
        this.pathMeasure$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<PathMeasure>() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PathMeasure invoke() {
                return AndroidPathMeasure_androidKt.PathMeasure();
            }
        });
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final void setFill(Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final void setFillAlpha(float f2) {
        this.fillAlpha = f2;
        invalidate();
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    public final void setPathData(List<? extends PathNode> list) {
        this.pathData = list;
        this.isPathDirty = true;
        invalidate();
    }

    /* JADX INFO: renamed from: getPathFillType-Rg-k1Os */
    public final int m4873getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    /* JADX INFO: renamed from: setPathFillType-oQ8Xj4U */
    public final void m4876setPathFillTypeoQ8Xj4U(int i2) {
        this.pathFillType = i2;
        this.renderPath.mo4071setFillTypeoQ8Xj4U(i2);
        invalidate();
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    public final void setStrokeAlpha(float f2) {
        this.strokeAlpha = f2;
        invalidate();
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final void setStrokeLineWidth(float f2) {
        this.strokeLineWidth = f2;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final void setStroke(Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    /* JADX INFO: renamed from: getStrokeLineCap-KaPHkGw */
    public final int m4874getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: setStrokeLineCap-BeK7IIE */
    public final void m4877setStrokeLineCapBeK7IIE(int i2) {
        this.strokeLineCap = i2;
        this.isStrokeDirty = true;
        invalidate();
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-LxFBmk8 */
    public final int m4875getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    /* JADX INFO: renamed from: setStrokeLineJoin-Ww9F2mQ */
    public final void m4878setStrokeLineJoinWw9F2mQ(int i2) {
        this.strokeLineJoin = i2;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final void setStrokeLineMiter(float f2) {
        this.strokeLineMiter = f2;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void setTrimPathStart(float f2) {
        this.trimPathStart = f2;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final void setTrimPathEnd(float f2) {
        this.trimPathEnd = f2;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final void setTrimPathOffset(float f2) {
        this.trimPathOffset = f2;
        this.isTrimPathDirty = true;
        invalidate();
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure) this.pathMeasure$delegate.getValue();
    }

    private final void updatePath() {
        PathParserKt.toPath(this.pathData, this.path);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (Intrinsics.areEqual(this.renderPath, this.path)) {
            this.renderPath = AndroidPath_androidKt.Path();
        } else {
            int iMo4069getFillTypeRgk1Os = this.renderPath.mo4069getFillTypeRgk1Os();
            this.renderPath.rewind();
            this.renderPath.mo4071setFillTypeoQ8Xj4U(iMo4069getFillTypeRgk1Os);
        }
        getPathMeasure().setPath(this.path, false);
        float length = getPathMeasure().getLength();
        float f2 = this.trimPathStart;
        float f3 = this.trimPathOffset;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.trimPathEnd + f3) % 1.0f) * length;
        if (f4 > f5) {
            getPathMeasure().getSegment(f4, length, this.renderPath, true);
            getPathMeasure().getSegment(0.0f, f5, this.renderPath, true);
        } else {
            getPathMeasure().getSegment(f4, f5, this.renderPath, true);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        if (this.isPathDirty) {
            updatePath();
        } else if (this.isTrimPathDirty) {
            updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            DrawScope.m4723drawPathGBMwjPU$default(drawScope, this.renderPath, brush, this.fillAlpha, null, null, 0, 56, null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke = this.strokeStyle;
            if (this.isStrokeDirty || stroke == null) {
                stroke = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke;
                this.isStrokeDirty = false;
            }
            DrawScope.m4723drawPathGBMwjPU$default(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    public String toString() {
        return this.path.toString();
    }
}
