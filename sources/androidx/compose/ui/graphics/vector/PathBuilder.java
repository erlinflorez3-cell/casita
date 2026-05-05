package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;
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
/* JADX INFO: compiled from: PathBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0R\u0004P.XU2\u000fy\u0001<$a%yCI^\"}(-eȞ\u0018g\u001dI\u001b\u000eß\u0013\u0006$x3hW^\u0011]@ƁbF}IKM\u001eHid\u0003B\u001d `-h}\u0013\u000e2*v\u001b'~QY$\u0012^O!>`\u001de\u0005H!6B.\u00126\\\u0016YfLzoR/Q\u000e2~\\:w0+ձ=Jb;%v\u0010)[DEJ-%\u0002\u000e7ViL\u001b? H5l55CI\"ff\\\u000e$-+}\u001c\u000ev4r\u001dQ\u000f\u0017W/]zcP<3@~\n%T\u0004<ͺo|<F2f6Ԅcx\u0001dXP0ir\u0004\tsN\u0017S\u000bc/G5~Q\u0010FIRE\u0017\u001d\rL.1r/wl\u000e\u000f KX\u0006nIQnH\u0011\u0003\u0018wUm2͏\u0013\u00068\u001aHG.:,\u0015<.=7\nDS%y!`D\u0016\u00025dvs\u0002RvKRr$XB\t:eth\u0013\u000ehT\u00077YY*w\u001f}6ʶP`\u0006`9%>Y\u0018tw\u0010e]8ɘ_jE\u007f\u0007k<b\u0002rA\\ic>Р\u0003z\"cTb3c\u0017Fa4r\\V-z\\x9\u0010{r\u0088<\u0017@e\n\u001cb7a\u001dj?`\u0003LM\n\u0011\u0017\u000brh>з\u000572'\u0002$#\u00141Tj\u0019\bg'Tt\u0011nNEA\u007fځI*cH\u00014+.7\u0003\u0002*_gzR\u0015\u0011$#m{NچJ=_@U\u0013=\nY6\u0010?]L!p\u0002Q A\u0013|(\u001akl<\u0003 j\u001f7)\u000fX}l\u0017PԮ\u000fv1\u001e|\u007f(lv~Uzl\u000b\nIyv\u0011xTNf\b5#,E\u0019oP\b}QQV5\u0016&ҡ_\u0019on\u0002o\\\u0005\u0013\u00134\u0007}\u0004ZnFspku2iCy]\rY:$\u001b\u000e\u000blx( B7ͩ=7VW|p\u0005C}\u000f=\u0015~\u0007Z\u0018!ZiY+o,?^c8\u0014[}Bi\f9\u001f~kg\u001cޮ{`\u0019['\n9\u0007ar .U \u0005b+\u001d>8\f\u0018d\u05cdkf\u0013R!$b7l\f\u0019Zli4\u001bC\fT\u0013'\u0017`߿$?d6lx\u000ba\u0011\u0011nyx!X܀/\u0013AH\u00115_\u0010>bb0{B\u0011U-\tIm}\u0001O+;Fd9I+7\u0005aԸ_ƀM\u0002>ߤ\u0018>{p\b\u0012H\u001a\r\u001dp\u001bI?\bUچz4v\r[k\\lʣ\u0016\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>HD\"\u001cgaF\\", "", "u(E", "-m^1X:", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "<nS2f", "", "5dc\u001bb+>a", "u(;7T=:\u001d)\u000e~euc\r=tU", "/qR!b", "6na6m6Gb\u0015\u0006Ze3\u0001\u0014=el$zD\u0011%", "", "DdaA\\*:Zx\u0006\u0002b7\u000b\t\u001ca~,\fN", "BgTAT", "7r<<e,-V\u0015\b]Z3}", "", "7r?<f0MW*~Vk*", "F0", "G0", "/qR!b\u0019>Z\u0015\u000e~o,", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "2w ", "2x ", "1k^@X", "1taCX\u001bH", "F1", "G1", "F2", "G2", "1taCX\u001bH@\u0019\u0006vm0\u000e\t", "2w!", "2x!", "2w\"", "2x\"", "6na6m6Gb\u0015\u0006ab5|w9", "F", "6na6m6Gb\u0015\u0006ab5|w9R\u007f/wO\u0005(\u0017", "2w", ":h]2G6", "G", ":h]2G6+S z\nb=|", "2x", ";ne2G6", ";ne2G6+S z\nb=|", "?tP1G6", "?tP1G6+S z\nb=|", "@dU9X*MW*~Xn9\u000e\t\u001eo", "@dU9X*MW*~Xn9\u000e\t\u001eol(\u0003<\u0010\u001b(G", "@dU9X*MW*~fn({w9", "@dU9X*MW*~fn({w9R\u007f/wO\u0005(\u0017", "DdaA\\*:Z\u007f\u0003\u0004^\u001b\u0007", "DdaA\\*:Z\u007f\u0003\u0004^\u001b\u0007u/l{7\u007fQ\u0001", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathBuilder {
    private final ArrayList<PathNode> _nodes = new ArrayList<>(32);

    public final List<PathNode> getNodes() {
        return this._nodes;
    }

    public final PathBuilder close() {
        this._nodes.add(PathNode.Close.INSTANCE);
        return this;
    }

    public final PathBuilder moveTo(float f2, float f3) {
        this._nodes.add(new PathNode.MoveTo(f2, f3));
        return this;
    }

    public final PathBuilder moveToRelative(float f2, float f3) {
        this._nodes.add(new PathNode.RelativeMoveTo(f2, f3));
        return this;
    }

    public final PathBuilder lineTo(float f2, float f3) {
        this._nodes.add(new PathNode.LineTo(f2, f3));
        return this;
    }

    public final PathBuilder lineToRelative(float f2, float f3) {
        this._nodes.add(new PathNode.RelativeLineTo(f2, f3));
        return this;
    }

    public final PathBuilder horizontalLineTo(float f2) {
        this._nodes.add(new PathNode.HorizontalTo(f2));
        return this;
    }

    public final PathBuilder horizontalLineToRelative(float f2) {
        this._nodes.add(new PathNode.RelativeHorizontalTo(f2));
        return this;
    }

    public final PathBuilder verticalLineTo(float f2) {
        this._nodes.add(new PathNode.VerticalTo(f2));
        return this;
    }

    public final PathBuilder verticalLineToRelative(float f2) {
        this._nodes.add(new PathNode.RelativeVerticalTo(f2));
        return this;
    }

    public final PathBuilder curveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        this._nodes.add(new PathNode.CurveTo(f2, f3, f4, f5, f6, f7));
        return this;
    }

    public final PathBuilder curveToRelative(float f2, float f3, float f4, float f5, float f6, float f7) {
        this._nodes.add(new PathNode.RelativeCurveTo(f2, f3, f4, f5, f6, f7));
        return this;
    }

    public final PathBuilder reflectiveCurveTo(float f2, float f3, float f4, float f5) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder reflectiveCurveToRelative(float f2, float f3, float f4, float f5) {
        this._nodes.add(new PathNode.RelativeReflectiveCurveTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder quadTo(float f2, float f3, float f4, float f5) {
        this._nodes.add(new PathNode.QuadTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder quadToRelative(float f2, float f3, float f4, float f5) {
        this._nodes.add(new PathNode.RelativeQuadTo(f2, f3, f4, f5));
        return this;
    }

    public final PathBuilder reflectiveQuadTo(float f2, float f3) {
        this._nodes.add(new PathNode.ReflectiveQuadTo(f2, f3));
        return this;
    }

    public final PathBuilder reflectiveQuadToRelative(float f2, float f3) {
        this._nodes.add(new PathNode.RelativeReflectiveQuadTo(f2, f3));
        return this;
    }

    public final PathBuilder arcTo(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
        this._nodes.add(new PathNode.ArcTo(f2, f3, f4, z2, z3, f5, f6));
        return this;
    }

    public final PathBuilder arcToRelative(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
        this._nodes.add(new PathNode.RelativeArcTo(f2, f3, f4, z2, z3, f5, f6));
        return this;
    }
}
