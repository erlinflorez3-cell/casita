package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<G\u0007\"2\u001a\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\bCC٥\"}8\tWNmgvJp\u000bK\u000f\f*\u0001jBI]xs\u0012\u00172PoG3coE9f\u0013>\u0005.>*\u0600\u0002\u0005\u0017\u001a2H&v\u0003ŏS\f(0H\u0081BR#M\r\u001a\u0018\u0007D \u0017Ȧ\rg|5xl\f:oݜ\u0002yF\\(w0+O\u001dJb*%v\u0010 ;DE9-%\u0002\u0005\u0017ViD\u001b? ?\u0015l5-CI\"YF\\\u000e\u001b-+}\u000fmv4d\u001dQ\u000f\u000e7/]lcP<*\b~\n\u0017T\u0004<\b7L<82f6\u0010Cx\u0001_XP0kR\u0004\toN\u0017S\u000fC/G+~Q\u0010L)TE\u000e\u001d\u000f4\"/\u00021_b\"x\u0015Ii\bU?gX=vc\u001a_Cm\u0012\bz\u0002X\u001cΥK\u007f=\u0015Y2%vO[gTiq\u0010\u001b\\g%X'|\u001c\u000e`\u001dX\"\u001dk_*7b\u000bHr\\\u0004P\u00031\\\u0015[ul\u0007,bY4иv˓Ƽ)\u0012T+vF;ek\u000e=/\u001590ʫwް[EfڨMSi*om\u0017\u0016EXp\")\u0007Pg$Z\u000b=xüTғ\u000fǮմCMܟ\u0017@Gq*VD3\u001fz#g# Ha\u000b*0rv\u001b\u0017Ta&YǴ0ڲ\r\rXʔ\tqm\u001cWG\u001db(QOn\u000614e:hb\u000eyț\u000b\u0381\u0004Soն_Nr;\u0004{\u001c\"\u001cAGy\u007f]!&\u0017)`\u001a\u0004խXɢdʸ͠\u0011&ϸ\u0001\b\u0017;v[\u007f\np\u001a:\u000b\u000bLU\u007f%NG{\u0001Q u\u0010{qF)wsV\u001b[lz!2ʾ@N>/[ȗ*ݵ\u0005o*Ĝ\u0006GQ95\u0018\u000e\u0013](8ӧuܓ2\u0006jχ>vk7:\u00186qh\u0007kh\fPWa\u0017>P&CÞN\u05f8n\u0004\u0010ȷ!6\u0013jV\\\u0005r\\p[(\u007f\u0016t\u0010D\r\u001fX2Ƭ\u001f̭\u0002@6ɾBuI7\"yc'\u0017\ba\u0005>\u0006Yf#J=\fa֑=ߎ\u0016(EղnYhD>!\u0014\u001a<}I\u007fUT\u0017%L,j\na͖`Ɏ\n\u001c\u0003Ĕ^a\u0015T@]\u0014=\\Lb\u0016-nV\bxE\u000f#\u0001܇\u000bܓ7*\u0001߶I\u0007s\u0006bJ\u00044\u0007\u0014+&k\u0003]\u0006~%YF+ڪ'Ϝ\\\r\u0013ԵuEOCD\u001fg+s.})\t0\u000b+Z\u0018IH(Πk۞4j\u0013ٝ|Pj: +rP(n\rAM JQ'\u000bG`)D9ιNϸ{;[\u001c\u0007_ROW,\u000by^\u001b[\u001b\fϊIȏi̟זzVĺ?\f\u0010 .I\u001cv'&e-\u0007\fceH7B6p\u000e!\u0013~-Z˿VȌq˖܍\u00075с\u0006A\n\u0013l{\u0004y'\f5J\r\bH\u0018v\u001aZ{zh\u0007U9\u0005=۹bӖr9Xȿ!)S{!sz<\u0017\".ua\u0018\"\u001b>\u001fd\n9ϱ\u001c˹gtxաg]\u0013z=\u0007Jc7\u0001`;ݜ\u001f\u0003}\u00070ĶDC:^MD\u0004Ԡ`J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#]\u0006+>mw;IN>o2,{du9\u0014K6Mz(KL[\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "AbP9X\u001f", "", "AbP9X ", "/k_5T", "BqP;f3:b\u001d\t\u0004Q", "BqP;f3:b\u001d\t\u0004R", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "@nc.g0H\\\f", "@nc.g0H\\\r", "@nc.g0H\\\u000e", "1`\\2e(\u001dW'\u000evg*|", "BqP;f-H`!h\bb.\u0001\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1kX=", "", "@d]1X9\u001eT\u001a~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "/lQ6X5MA\u001czyh>Z\u00136o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0006+A{\u001a=QL=YC+\u0011wa;\u001b9", "uE5\u00139\r\u001f4y_[C\u0013x\u0012.r\n,zSJ\u0015!Oz\u0018JvnE]G\"Di!1QAI5\"!\u0011sa\u000f{J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N[N yG;\u001d\u0016u6\u0002Dg\u0001\u0019u\u000f6jnQ,t,]{{K8oJb)~XI\u000ff3s\fl&XA\u0004\u0003\u0014r\u0015+o_\f\u0014\u0005a \u007fbwvqT\u0001vE*>z1\n6", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHa\u0016\u0019isAf", "u(9", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHi\u0011\u001a;\u0015CR", "uI\u0018#", "\u0018", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "5dc\u0010_0I", "u(I", "Adc\u0010_0I", "uY\u0018#", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^^0|n,d\t", "u(8", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u0013&LwAT\u0005", "uH\u0018#", "\u0017", ":`h2e\tE]\u0017\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "5dc V(ES\f", "Adc V(ES\f", "5dc V(ES\r", "Adc V(ES\r", "5dc [(=]+^\u0002^=x\u00183o\t", "Adc [(=]+^\u0002^=x\u00183o\t", "5dc [(IS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", "Adc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001cBmkq>", "Ag^B_+\u001ac(\t^g=x\u00103d{7{", "5dc [6NZ\u0018Z\u000bm6`\u0012@a\u0007,z<\u0010\u0017", "5dc c6MA\u001czyh>Z\u00136o\roF?R\u0011|L_", "Adc c6MA\u001czyh>Z\u00136o\roN:Sb\u001eNK", "5dc!e(Ga\u001a\t\bf\u0016\n\r1i\toiUe\u0017bC[", "Adc!e(Ga\u001a\t\bf\u0016\n\r1i\tou:`*\u000b%[", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "7me._0=O(~aZ@|\u0016\fl\n&\u0002", "BnBAe0GU", "", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    private float alpha;
    private long ambientShadowColor;
    private float cameraDistance;
    private boolean clip;
    private int compositingStrategy;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private Shape shape;
    private long spotShadowColor;
    private long transformOrigin;
    private float translationX;
    private float translationY;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, j3, j4, i2);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final void setScaleX(float f2) {
        this.scaleX = f2;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final void setScaleY(float f2) {
        this.scaleY = f2;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f2) {
        this.alpha = f2;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final void setTranslationX(float f2) {
        this.translationX = f2;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void setTranslationY(float f2) {
        this.translationY = f2;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final void setShadowElevation(float f2) {
        this.shadowElevation = f2;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final void setRotationX(float f2) {
        this.rotationX = f2;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final void setRotationY(float f2) {
        this.rotationY = f2;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void setRotationZ(float f2) {
        this.rotationZ = f2;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final void setCameraDistance(float f2) {
        this.cameraDistance = f2;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m4508getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    /* JADX INFO: renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    public final void m4512setTransformOrigin__ExYCQ(long j2) {
        this.transformOrigin = j2;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape shape) {
        this.shape = shape;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final void setClip(boolean z2) {
        this.clip = z2;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4505getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m4509setAmbientShadowColor8_81llA(long j2) {
        this.ambientShadowColor = j2;
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4507getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m4511setSpotShadowColor8_81llA(long j2) {
        this.spotShadowColor = j2;
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, j3, j4, (i3 + 65536) - (i3 | 65536) != 0 ? CompositingStrategy.Companion.m4267getAutoNrFUSI() : i2, null);
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m4506getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m4510setCompositingStrategyaDBOjCE(int i2) {
        this.compositingStrategy = i2;
    }

    private SimpleGraphicsLayerModifier(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
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
        this.layerBlock = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
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
                graphicsLayerScope.setScaleX(this.this$0.getScaleX());
                graphicsLayerScope.setScaleY(this.this$0.getScaleY());
                graphicsLayerScope.setAlpha(this.this$0.getAlpha());
                graphicsLayerScope.setTranslationX(this.this$0.getTranslationX());
                graphicsLayerScope.setTranslationY(this.this$0.getTranslationY());
                graphicsLayerScope.setShadowElevation(this.this$0.getShadowElevation());
                graphicsLayerScope.setRotationX(this.this$0.getRotationX());
                graphicsLayerScope.setRotationY(this.this$0.getRotationY());
                graphicsLayerScope.setRotationZ(this.this$0.getRotationZ());
                graphicsLayerScope.setCameraDistance(this.this$0.getCameraDistance());
                graphicsLayerScope.mo4371setTransformOrigin__ExYCQ(this.this$0.m4508getTransformOriginSzJe1aQ());
                graphicsLayerScope.setShape(this.this$0.getShape());
                graphicsLayerScope.setClip(this.this$0.getClip());
                graphicsLayerScope.setRenderEffect(this.this$0.getRenderEffect());
                graphicsLayerScope.mo4368setAmbientShadowColor8_81llA(this.this$0.m4505getAmbientShadowColor0d7_KjU());
                graphicsLayerScope.mo4370setSpotShadowColor8_81llA(this.this$0.m4507getSpotShadowColor0d7_KjU());
                graphicsLayerScope.mo4369setCompositingStrategyaDBOjCE(this.this$0.m4506getCompositingStrategyNrFUSI());
            }
        };
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator wrapped$ui_release = DelegatableNodeKt.m5636requireCoordinator64DMado(this, NodeKind.m5749constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.layerBlock, true);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo5514measureBRTryo0, 0, 0, 0.0f, this.layerBlock, 4, (Object) null);
            }
        }, 4, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.scaleX).append(", scaleY=").append(this.scaleY).append(", alpha = ").append(this.alpha).append(", translationX=").append(this.translationX).append(", translationY=").append(this.translationY).append(", shadowElevation=").append(this.shadowElevation).append(", rotationX=").append(this.rotationX).append(", rotationY=").append(this.rotationY).append(", rotationZ=").append(this.rotationZ).append(", cameraDistance=").append(this.cameraDistance).append(", transformOrigin=").append((Object) TransformOrigin.m4567toStringimpl(this.transformOrigin)).append(", shape=");
        sb.append(this.shape).append(", clip=").append(this.clip).append(", renderEffect=").append(this.renderEffect).append(", ambientShadowColor=").append((Object) Color.m4186toStringimpl(this.ambientShadowColor)).append(", spotShadowColor=").append((Object) Color.m4186toStringimpl(this.spotShadowColor)).append(", compositingStrategy=").append((Object) CompositingStrategy.m4265toStringimpl(this.compositingStrategy)).append(')');
        return sb.toString();
    }
}
