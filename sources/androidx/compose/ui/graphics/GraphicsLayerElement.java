package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.facebook.react.uimanager.ViewProps;
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
/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<G\u0007\"2\u001a\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\bCC٥\"}8\tWNmgvJp\u000bK\u000f\fI\u0001j:կ]ތe\u0012\u001d8JģG3[{EʠhtD\u0005(2(8\u0002\u0005\u0017\u001a2Ϻ\u0016͏\u0001Yŷ<\u0018@B\u0001:\u0001\r{\u0004Zŗ\u0005N$\u000f\u001ftg|8Xpk=G#1kRR5cH|{\u000fVX5\u0012\u000faL-P;C\u001b=S1\tb_M\nWqk\u0007x+53as\u00068h\u0004\"\u001eCO;_\u0003*j\u000fi`:);SqVh\u000eVy\u000b\u007f\u001bH\u001c\u000e44X2;(~\b<B\u0005vaPh\u0002\rS\u0010\u0001oH/'\u00162YL+j_uS\u0019|L\f\t\u001b4;\u0001\u001d6kX\u001cw-\u001b\u0003\u0010Φ5QNV\u0011U\u0018\rUm2r)ͪ+L7U4G{?0]í8$M1V\u0004\u0002vQ.п\u0006ĔgRؘQ̲غ&p\u001cm8&TaR\u001c\u001dk~c\u001fÓ\u0012\u0016#b?\u0016\bA1#˃=i.\u001e\bgj\u007fi{pPʟ0/Kg)\u0004\u000e\u0006N%ۯ6ʚb\u000fҙQΘ݀C>h@f\u0004\u000bg\u001a\u0017t(PG\u000fѡ\u0011ɧzCā\u000bƎ\u0558Cs\"q:Nap#\u0007\u001b\u001epYCɈ`̬g\u000fҰS՜ʗ\u0007k*4\u0017$\u0019c~0\u007fxw.C˧#uH_v1&\u0004$/ٛ}k\u000e\r6\u0018G\u0016N\u000eǉm^|c?8\u0016H;\u0018Ʉ>[\u0016\rmJ\u0002[G\u0013Ȱf\u001aT l\u0013|(\u0011\u0002ģ/0\u000fx7D`\u0019L\u0016ݾ\u0018j}l:;\b\u0013\u0002@ԚGCĲbbSs>wͿ3_BNF}\u001d\u001fL'1u(|C0['K\u0018(\u001a5\u0015oa\u0002o\\{\u0013\u0015,ts\tDcDq\u0013Wc2I>aY-@R*r\u0003PO\u0003w6D9:\u00133VI|p\u0005:}\u00115}t\u0010D\r\u001fX\f@\u0019o\f>F_Xus\u0004\u001a^Q0)M\u0002i\u001esQ\\\u0019V'\n9\tat\u0018\u001cK.nW\u0011\u0018`\fy\u0018DQSb3M9,:,J\u001a#Ejh4#+\u0006L_\u001d+JB\"P\u0007\u0014Zxjl`\u0005\u000fZ\u0011'0\u0001\r&K\u001e'MwݑlݧSЏҕ6\u0003Yf\u0017e3U\r2=+rT\u007f/pi\u000fW]]qZ2<\u0012\u0015Ao\u0002n:\u0007^Ք\u001e\u000b\u001f)\ti\u0011\u000eGvγ\n\u001ek\\6\u000f\u0012\u0015%\u0015Ĵ(G\t\u000baT\n=_IS\u0001Ez-zN>K\f$\u000fm\\)5`%ctrs\u001a\u0006<KM\u0003\u0014U}\u009cWA\u0006И8\"-\u001e\u0003<-n\u001cz\"]IOмpдʁ\u0001\b\u07b3T(\f.X\u0013\u000b\f4$DlRB\u0010\u001evY\u001ay̝D-3ˊ\u001eDQ\b\u0007%4{q~m\u000b1wܕZ\u007fv߲h\u001f\u000fG[OcohQ)SNpԲ~Ǵߴ%\u001e߱\fj1\u0010]\b\u0001rqqi0{@y<y3FQL\u0011ψ}{\f՞l*\u001b`ds\u000fs\u0017d\u0005B\u0006\u0010߿n.lÆ$+\u001a$\rc/ !=^rLfԘ;\u001f'ʺ%If/\u0012`\u001a5/;j?I9כ\u000fu0ϓ)\u0005@\f\u0003\u001bzQ\u0017s\u0018gZ/ĘXC\"śq&s\u000f\u0011A\u001cTFE ,?\u0010Ŕ3`@ԌV^ GIl\u0004P'\u0018\u0019\u0015f\b˲\u000b\u001f=շiU+V\u000f\u0018Q\u001cM\bIkh\u0003٥v)7ݩ\b\u001d]\u0014IS\u0006|Z=$\u0002\u0014_զLޏɷ\u000e`ϕM=M\u001e\bsX\u0002\u0010N2AV\r1\f]1v7ڜ[ǾӫrVǋ*2>nRA_n~$\u0018I:'\u0002isabC˒\u0018\u001fLëB/r8Sh9\t\u0019J%EB9ʷ\n/;ٚ\u0015\u0012U$NFߓrV7_cڌ/\"\u0003B2gU̿K\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA}\u001chi9\u0010r\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#]\u0006+>mw;IN>o2,{du9\u0014K6Mz(KL[\u0002", "AbP9X\u001f", "", "AbP9X ", "/k_5T", "BqP;f3:b\u001d\t\u0004Q", "BqP;f3:b\u001d\t\u0004R", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "@nc.g0H\\\f", "@nc.g0H\\\r", "@nc.g0H\\\u000e", "1`\\2e(\u001dW'\u000evg*|", "BqP;f-H`!h\bb.\u0001\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1kX=", "", "@d]1X9\u001eT\u001a~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "/lQ6X5MA\u001czyh>Z\u00136o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0006+A{\u001a=QL=YC+\u0011wa;\u001b9", "uE5\u00139\r\u001f4y_[C\u0013x\u0012.r\n,zSJ\u0015!Oz\u0018JvnE]G\"Di!1QAI5\"!\u0011sa\u000f{J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N[N yG;\u001d\u0016u6\u0002Dg\u0001\u0019u\u000f6jnQ,t,]{{K8oJb)~XI\u000ff3s\fl&XA\u0004\u0003\u0014r\u0015+o_\f\u0014\u0005a \u007fbwvqT\u0001vE*>z1\n6", "5dc\u000e_7AO", "u(5", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHa\u0016\u0019isAf", "u(9", "\u0018", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "5dc\u0010_0I", "u(I", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^^0|n,d\t", "u(8", "\u0017", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "5dc\u001fb;:b\u001d\t\u0004Q", "5dc\u001fb;:b\u001d\t\u0004R", "5dc\u001fb;:b\u001d\t\u0004S", "5dc V(ES\f", "5dc V(ES\r", "5dc [(=]+^\u0002^=x\u00183o\t", "5dc [(IS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", "5dc c6MA\u001czyh>Z\u00136o\roF?R\u0011|L_", "5dc!e(Ga\u001a\t\bf\u0016\n\r1i\toiUe\u0017bC[", "5dc!e(Ga z\nb6\u0006{", "5dc!e(Ga z\nb6\u0006|", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JF&\u001a\u0012m/1{\u0014", "1n\\=b5>\\(JG", "1n\\=b5>\\(JH", "1n\\=b5>\\(JI", "1n\\=b5>\\(JJ", "1n\\=b5>\\(JJ&v{Z)K\u0005\u0018", "1n\\=b5>\\(JK", "1n\\=b5>\\(JK&v{Z)K\u0005\u0018", "1n\\=b5>\\(JL", "1n\\=b5>\\(JL&se\u0016\u0010Um\f", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "1n_F \u0011/d\u0003rcJ", "uE5\u00139\r\u001f4y_[C\u0013x\u0012.r\n,zSJ\u0015!Oz\u0018JvnE]G\"Di!1QAI5\"!\u0011sa\u000f{J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N[N yG;\u001d\u0016u6\u0002Dg\u0001\u0019u\u000f6jnQ,t,]X\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m\u0016~\u0015&kT,\u0018E5\u001en]|keU\u007fvL$KMbFMo^KJ", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final int compositingStrategy;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ GraphicsLayerElement(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, j3, j4, i2);
    }

    /* JADX INFO: renamed from: copy-JVvOYNQ$default, reason: not valid java name */
    public static /* synthetic */ GraphicsLayerElement m4326copyJVvOYNQ$default(GraphicsLayerElement graphicsLayerElement, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, int i3, Object obj) {
        float f12 = f7;
        float f13 = f2;
        float f14 = f6;
        float f15 = f5;
        float f16 = f3;
        float f17 = f4;
        long j5 = j2;
        Shape shape2 = shape;
        float f18 = f10;
        float f19 = f11;
        float f20 = f9;
        float f21 = f8;
        int i4 = i2;
        long j6 = j4;
        RenderEffect renderEffect2 = renderEffect;
        long j7 = j3;
        boolean z3 = z2;
        if ((i3 & 1) != 0) {
            f13 = graphicsLayerElement.scaleX;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            f16 = graphicsLayerElement.scaleY;
        }
        if ((i3 & 4) != 0) {
            f17 = graphicsLayerElement.alpha;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            f15 = graphicsLayerElement.translationX;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            f14 = graphicsLayerElement.translationY;
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            f12 = graphicsLayerElement.shadowElevation;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            f21 = graphicsLayerElement.rotationX;
        }
        if ((i3 + 128) - (i3 | 128) != 0) {
            f20 = graphicsLayerElement.rotationY;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            f18 = graphicsLayerElement.rotationZ;
        }
        if ((i3 & 512) != 0) {
            f19 = graphicsLayerElement.cameraDistance;
        }
        if ((i3 & 1024) != 0) {
            j5 = graphicsLayerElement.transformOrigin;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2048)) != 0) {
            shape2 = graphicsLayerElement.shape;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4096)) != 0) {
            z3 = graphicsLayerElement.clip;
        }
        if ((i3 & 8192) != 0) {
            renderEffect2 = graphicsLayerElement.renderEffect;
        }
        if ((i3 & 16384) != 0) {
            j7 = graphicsLayerElement.ambientShadowColor;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32768)) != 0) {
            j6 = graphicsLayerElement.spotShadowColor;
        }
        if ((i3 & 65536) != 0) {
            i4 = graphicsLayerElement.compositingStrategy;
        }
        float f22 = f20;
        float f23 = f18;
        float f24 = f19;
        Shape shape3 = shape2;
        return graphicsLayerElement.m4331copyJVvOYNQ(f13, f16, f17, f15, f14, f12, f21, f22, f23, f24, j5, shape3, z3, renderEffect2, j7, j6, i4);
    }

    public final float component1() {
        return this.scaleX;
    }

    public final float component10() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: component11-SzJe1aQ, reason: not valid java name */
    public final long m4327component11SzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape component12() {
        return this.shape;
    }

    public final boolean component13() {
        return this.clip;
    }

    public final RenderEffect component14() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m4328component150d7_KjU() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m4329component160d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: component17--NrFUSI, reason: not valid java name */
    public final int m4330component17NrFUSI() {
        return this.compositingStrategy;
    }

    public final float component2() {
        return this.scaleY;
    }

    public final float component3() {
        return this.alpha;
    }

    public final float component4() {
        return this.translationX;
    }

    public final float component5() {
        return this.translationY;
    }

    public final float component6() {
        return this.shadowElevation;
    }

    public final float component7() {
        return this.rotationX;
    }

    public final float component8() {
        return this.rotationY;
    }

    public final float component9() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: copy-JVvOYNQ, reason: not valid java name */
    public final GraphicsLayerElement m4331copyJVvOYNQ(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
        return new GraphicsLayerElement(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, j3, j4, i2, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && TransformOrigin.m4563equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && Intrinsics.areEqual(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && Intrinsics.areEqual(this.renderEffect, graphicsLayerElement.renderEffect) && Color.m4179equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m4179equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && CompositingStrategy.m4263equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + TransformOrigin.m4566hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((((((iHashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + Color.m4185hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m4185hashCodeimpl(this.spotShadowColor)) * 31) + CompositingStrategy.m4264hashCodeimpl(this.compositingStrategy);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.scaleX).append(", scaleY=").append(this.scaleY).append(", alpha=").append(this.alpha).append(", translationX=").append(this.translationX).append(", translationY=").append(this.translationY).append(", shadowElevation=").append(this.shadowElevation).append(", rotationX=").append(this.rotationX).append(", rotationY=").append(this.rotationY).append(", rotationZ=").append(this.rotationZ).append(", cameraDistance=").append(this.cameraDistance).append(", transformOrigin=").append((Object) TransformOrigin.m4567toStringimpl(this.transformOrigin)).append(", shape=");
        sb.append(this.shape).append(", clip=").append(this.clip).append(", renderEffect=").append(this.renderEffect).append(", ambientShadowColor=").append((Object) Color.m4186toStringimpl(this.ambientShadowColor)).append(", spotShadowColor=").append((Object) Color.m4186toStringimpl(this.spotShadowColor)).append(", compositingStrategy=").append((Object) CompositingStrategy.m4265toStringimpl(this.compositingStrategy)).append(')');
        return sb.toString();
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m4335getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4332getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4334getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m4333getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    private GraphicsLayerElement(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
        this.scaleX = f2;
        this.scaleY = f3;
        this.alpha = f4;
        this.translationX = f5;
        this.translationY = f6;
        this.shadowElevation = f7;
        this.rotationX = f8;
        this.rotationY = f9;
        this.rotationZ = f10;
        this.cameraDistance = f11;
        this.transformOrigin = j2;
        this.shape = shape;
        this.clip = z2;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j3;
        this.spotShadowColor = j4;
        this.compositingStrategy = i2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        simpleGraphicsLayerModifier.setScaleX(this.scaleX);
        simpleGraphicsLayerModifier.setScaleY(this.scaleY);
        simpleGraphicsLayerModifier.setAlpha(this.alpha);
        simpleGraphicsLayerModifier.setTranslationX(this.translationX);
        simpleGraphicsLayerModifier.setTranslationY(this.translationY);
        simpleGraphicsLayerModifier.setShadowElevation(this.shadowElevation);
        simpleGraphicsLayerModifier.setRotationX(this.rotationX);
        simpleGraphicsLayerModifier.setRotationY(this.rotationY);
        simpleGraphicsLayerModifier.setRotationZ(this.rotationZ);
        simpleGraphicsLayerModifier.setCameraDistance(this.cameraDistance);
        simpleGraphicsLayerModifier.m4512setTransformOrigin__ExYCQ(this.transformOrigin);
        simpleGraphicsLayerModifier.setShape(this.shape);
        simpleGraphicsLayerModifier.setClip(this.clip);
        simpleGraphicsLayerModifier.setRenderEffect(this.renderEffect);
        simpleGraphicsLayerModifier.m4509setAmbientShadowColor8_81llA(this.ambientShadowColor);
        simpleGraphicsLayerModifier.m4511setSpotShadowColor8_81llA(this.spotShadowColor);
        simpleGraphicsLayerModifier.m4510setCompositingStrategyaDBOjCE(this.compositingStrategy);
        simpleGraphicsLayerModifier.invalidateLayerBlock();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set(ViewProps.TRANSFORM_ORIGIN, TransformOrigin.m4556boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m4168boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m4168boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m4260boximpl(this.compositingStrategy));
    }
}
