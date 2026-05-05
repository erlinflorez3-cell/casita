package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d̉=!4i\bDJe|\u0004O\u00128\u000b4B\u0007\":\u0017\u007f\u0007lmA0ZeP.XS2\u000f\u0002{<$a&yCQU\"}(\tWN}gvJ`\u0012K\u000f\u00144\u0001jBI]xc\u0014\u00172XoG3coE9nt>\u000562*8\u007f\u0006\t\u001a8Q\u0018v\u0001ES\f(0H\u0081Rx\u001bs\u001d \"\bN /A\u000b\n~KV\u0014uK?%\u0013ipw7a@|{7t|ܮ\u0011vgIq¯=M)3\u007f\u001b\rb]O\u0003m\u0015k'\u0019-5Xaum5\u0007\u0004,19}%]!U\u0005\u0005\u007fx<+9\u007f{K~&n»¶zȞʀ\b\u0010\fXV`E&t;&3#\"{Bf\u0001\rvFЭ\u0002G%ӛ\u00183Y8ӸjYi;'PO}\u000b\r,$!z/^l\u000e\u000f\u0019qƟJΦ5QH׀hZ\u0018^Um2t9̪|˙4G\b\u07fc\u001c\u001d<\u001d=7\n@yܰ>ɘLDoϸ%lv[\u0002RvGxÉh֖.\t\u0014ɮdp\u0013thT\u00073gۺnΤ\u000b}\u0010ʶ@h\u0006F9%>U&ŝ<ҷQ]\u0012ɘOrEd\u0007k<^\u0010ӛ\u0006̳Uc\u0018Рr\b\"KTb3eڋF[\u0014Zj*:4Nx\u001ex\u001cU\\\u001b+2m\u0002ʬ849\u0019j\u0017`\u0005$SO})khz(~\u0003:zѷ<˨x\t\tˆ||}z\u0011IZ\u00047ü\u007fۮU5!ğu3vH\u0015#5\u0014\u0381\u0004OoLUN\u0005\u0018{k\n!6+GhG=A'ɒ-:\n-Sg\u000bgWf A\u001b\t\b+Sh\\n^υCݽdjR֢t#0\u0014vrQ\u000f;чLӶJzOϊt\u0017i\\ar1`\u0013҅\u000b٫\t\u001f&ݒ!{0\u001cM-q.sȽJӄ3\u0015iӠ\n{<\u001az\u000fT{<ׄ~І\u001aojГ}GIYa_\u000f@2$\u001b&pjܖ{\u000eJކL\u000f9lO\nݨV=U\u000e5̰\u00035+ޡt\f"}, d2 = {"\u0012dU.h3M4\u001d\u0006\u0002M@\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0018q\u001d5<WFk\n", "5dc\u0011X-:c \u000e[b3\u0004wCp\u007f", "u(8", "\u0017", "\u0012dU.h3M5&\t\u000bi\u0015x\u0011/", "", "\u0012dU.h3M>\u0015\u000e}G(\u0005\t", "\u0012dU.h3M>\u001d\u0010\u0005m\u001f", "", "\u0012dU.h3M>\u001d\u0010\u0005m ", "\u0012dU.h3M@#\u000evm0\u0007\u0012", "\u0012dU.h3MA\u0017z\u0002^\u001f", "\u0012dU.h3MA\u0017z\u0002^ ", "\u0012dU.h3MA(\f\u0005d,c\r8e]$\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "5dc\u0011X-:c \u000ehm9\u0007\u000f/L\u00041{\u001e|\"", "\u0012dU.h3MA(\f\u0005d,c\r8ed2\u007fI", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "5dc\u0011X-:c \u000ehm9\u0007\u000f/L\u00041{%\u000b\u001b ", "\u0012dU.h3MA(\f\u0005d,c\r8eg,\u000b@\u000e", "\u0012dU.h3MA(\f\u0005d,c\r8eq,zO\u0004", "\u0012dU.h3MB\u001d\b\n;3|\u0012.M\n'{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "5dc\u0011X-:c \u000eib5\fe6e\t'cJ\u007f\u0017", "\u0012dU.h3MB\u001d\b\n<6\u0004\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0011X-:c \u000eib5\ff9l\n5", "u(9", "\u0018", "\u0012dU.h3MB&z\u0004l3x\u00183o\t\u001b", "\u0012dU.h3MB&z\u0004l3x\u00183o\t\u001c", "\u0012dU.h3MB&\u0003\u0003I(\f\f\u000fn~", "\u0012dU.h3MB&\u0003\u0003I(\f\f\u0019f\u00016{O", "\u0012dU.h3MB&\u0003\u0003I(\f\f\u001dt{5\u000b", "\u0013l_Al\u0017:b\u001c", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "5dc\u0012`7Mg\u0004z\na", "u(;7T=:\u001d)\u000e~euc\r=tU", "\u001e`c57(MO", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>HD\"\u001cgaF\\", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "/cS\u001dT;A<#}zl", ">`c5F;K", "@fQ\u0012d<:Z", "", "=sW2e", "@fQ\u0012d<:Z`FdP1c\u000e\u0013", "uI9uM", "Bh]AT)ES\u000b\u0003\na\b\u0004\u00142ag$\nF", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorKt {
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;
    private static final List<PathNode> EmptyPath = CollectionsKt.emptyList();
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m4531getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m4542getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.Companion.m4118getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m4213getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.Companion.m4461getNonZeroRgk1Os();

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final List<PathNode> PathData(Function1<? super PathBuilder, Unit> function1) {
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    public static final List<PathNode> addPathNodes(String str) {
        return str == null ? EmptyPath : new PathParser().parsePathString(str).toNodes();
    }

    /* JADX INFO: renamed from: rgbEqual--OWjLjI */
    public static final boolean m4886rgbEqualOWjLjI(long j2, long j3) {
        return Color.m4184getRedimpl(j2) == Color.m4184getRedimpl(j3) && Color.m4183getGreenimpl(j2) == Color.m4183getGreenimpl(j3) && Color.m4181getBlueimpl(j2) == Color.m4181getBlueimpl(j3);
    }

    public static final boolean tintableWithAlphaMask(ColorFilter colorFilter) {
        if (colorFilter instanceof BlendModeColorFilter) {
            BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
            if (BlendMode.m4089equalsimpl0(blendModeColorFilter.m4122getBlendMode0nO6VwU(), BlendMode.Companion.m4118getSrcIn0nO6VwU()) || BlendMode.m4089equalsimpl0(blendModeColorFilter.m4122getBlendMode0nO6VwU(), BlendMode.Companion.m4120getSrcOver0nO6VwU())) {
                return true;
            }
        } else if (colorFilter == null) {
            return true;
        }
        return false;
    }
}
