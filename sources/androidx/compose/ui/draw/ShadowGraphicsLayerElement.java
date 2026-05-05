package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RnP\u008cZS@\u000fs{:<c$\bCCU0}*\t]Nog\u0005Jb\u000bI\u000f\u000e\u0016\u0007̓4կ]xk\u0018\u0017˰JoM?UoC:htL\u0005(݅(\u0601\u007f\u001bЏJ0X\u0012\u0007zqK:\u0011pk\u0001>`\u000ee\u0005H\u0014\u0016B.\u00046\\\u0016RFLzbR/Q\tyF\\.w0+U\u001dJb0%v\u0010&ҋD7C\u001fmg\u0011\u001dj[m\u0005\u0006҃>ߔg&߉*ɞָ[8^\u0017\"&sV\u001bu\u000b&\u000b\t\u0018ԧ\ro2]|cP<.>\u0084|UP\u0012(\u001e'v6sֆgܕ\r2иqԟĖT\u0004d]\u000e\u0007*J%A\u00183YAaǟRƞ:\u0018ل6ަ˿\u0011 )\u001e|-$\u0018\u001c~-\u001b\u0003ȭ\u00027W@KIf\n\b?\u001e\nvb\u0010-\u001c0u\u0004_\u0002\u0017.%*O[g)Qq\bHRn\u000f\u0005\u000fp\u0004oXHN+\u0007\u0016e2OɸYמcʍ\u07fbTV^K\u001fmdZ\u0015\u001f \u0013N\\>Pi<\u001epgyyl]]8I?hGY\u001d\u0011<zߍb3;w*\u0010*c\u0005;W<\u0011\u000b\tlP{$\\r'P[\u000fѱ\u0011@\u0003Rx$\u0013`j8ˠ3t8'\t-H1K\t̝{Qmh\u0017(~\u0003XT\u0007wS\r\t/P#\u00058q\u0007yD|\u000fGUA\u007ff_:&9v;\u0015#5\u0007ϗ~øҾKFƥp\u001e}U\n-.\u001c?\\=Ic\u001e\r.J\u0002[KʆvkY˧*)\u0001\u000b\b\u001e\f\u007f<h j\u001f.Äi\u07ba؛S\u0016Ȕzfz#\u0016v\u0018{gV\tX4c\u0019^VI!\u0007ʾ@T@و\u001d!$8\u000f\u0004r\u0014C6['K\u001eÈ\u0013٬؋`\\ɳs6\u0002b\u001d3\rg\nAq\"˴bZe5AΑe\b}F\"*\fĀFz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9{?r$?k_-3x\u00192KQ\"gH\u001e\"Hh9\u000fc5]L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`\b\u001e=O#*XF?iB\u0005\u0011|aFnm+Rw+GY$", "3kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1kX=", "", "/lQ6X5M1#\u0006\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Ao^A66E]&", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004B( R:($oeBPh=V@+P[N9eNy\u0007r\u0012[\n^2\u001cbcJ2}QG\u001d\u00176Vi7u\u0007\f#cx[", "5dc\u000e`)BS\"\u000eXh3\u0007\u0016v0~yu&\u0006\u0007", "u(9", "\u0018", "5dc\u0010_0I", "u(I", "5dc\u0012_,OO(\u0003\u0005gs[\\\u000fjO)c", "u(5", "\u0014", "5dc [(IS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", "5dc c6M1#\u0006\u0005ksG\b\u0001_e-k", "1n\\=b5>\\(J", "1n\\=b5>\\(JB=\u007f\\\u000e~fg", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(MB)+N\u0003\u0015jo", "1n\\=b5>\\(N", "1n\\=b5>\\(NB)+N\u0003\u0015jo", "1n_F", "1n_F .';,[`B", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004B( /\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0011g\n`tz\bU@.\u0001&D\u001b\u0013/M\u007fIO| \u0016\u001b\u0015qpJV\u0019VO", "1qT.g,", "1qT.g,\u001bZ#|\u0001", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;
    private final Shape shape;
    private final long spotColor;

    public /* synthetic */ ShadowGraphicsLayerElement(float f2, Shape shape, boolean z2, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, shape, z2, j2, j3);
    }

    /* JADX INFO: renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m3833copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f2, Shape shape, boolean z2, long j2, long j3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = shadowGraphicsLayerElement.elevation;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            shape = shadowGraphicsLayerElement.shape;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = shadowGraphicsLayerElement.clip;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            j2 = shadowGraphicsLayerElement.ambientColor;
        }
        if ((i2 & 16) != 0) {
            j3 = shadowGraphicsLayerElement.spotColor;
        }
        return shadowGraphicsLayerElement.m3837copygNMxBKI(f2, shape, z2, j2, j3);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m3834component1D9Ej5fM() {
        return this.elevation;
    }

    public final Shape component2() {
        return this.shape;
    }

    public final boolean component3() {
        return this.clip;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m3835component40d7_KjU() {
        return this.ambientColor;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m3836component50d7_KjU() {
        return this.spotColor;
    }

    /* JADX INFO: renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m3837copygNMxBKI(float f2, Shape shape, boolean z2, long j2, long j3) {
        return new ShadowGraphicsLayerElement(f2, shape, z2, j2, j3, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return Dp.m6643equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && Intrinsics.areEqual(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m4179equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m4179equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m6644hashCodeimpl(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + Color.m4185hashCodeimpl(this.ambientColor)) * 31) + Color.m4185hashCodeimpl(this.spotColor);
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) Dp.m6649toStringimpl(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) Color.m4186toStringimpl(this.ambientColor)) + ", spotColor=" + ((Object) Color.m4186toStringimpl(this.spotColor)) + ')';
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m3839getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m3838getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    /* JADX INFO: renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m3840getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    private ShadowGraphicsLayerElement(float f2, Shape shape, boolean z2, long j2, long j3) {
        this.elevation = f2;
        this.shape = shape;
        this.clip = z2;
        this.ambientColor = j2;
        this.spotColor = j3;
    }

    private final Function1<GraphicsLayerScope, Unit> createBlock() {
        return new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.ShadowGraphicsLayerElement.createBlock.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo710toPx0680j_4(ShadowGraphicsLayerElement.this.m3839getElevationD9Ej5fM()));
                graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
                graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
                graphicsLayerScope.mo4368setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.m3838getAmbientColor0d7_KjU());
                graphicsLayerScope.mo4370setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.m3840getSpotColor0d7_KjU());
            }
        };
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(createBlock());
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        inspectorInfo.getProperties().set("elevation", Dp.m6636boximpl(this.elevation));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("ambientColor", Color.m4168boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m4168boximpl(this.spotColor));
    }
}
