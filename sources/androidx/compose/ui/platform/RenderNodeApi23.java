package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.core.view.ViewCompat;
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
/* JADX INFO: compiled from: RenderNodeApi23.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*, |\u000ffp<8DsN6RY3\u0017k\n=,[*wK;k\u001a\u0006\"\u000feVg}nRZ\u0011F\u0017\u0006,xr,Or\u0001] \u0016:BuB;M}=A`z7\r H\"@ц\r\u00010*P\u0010|zKK\"\u00128@vBZ\rc\u0005\"Ň\u000e>6\u0001&ձoNLHt]P/+\u0003oCV'u0\u0005M\u0013HZ&#Ǹ\u007fӣ*p7c\u0014]SΏ\u0006\u0013fO\u0007MqU\u0005\u0017(ݳ/I\u0002Y~^\u000ew-+}q$\u0007nb\u00137x\fU\u0010\u0016c\u0014^\u001c\u000f\u0010z*ql\b\u001cm?H\\\u0016`zP\u0014A^\u000bSn;Hr\u000b\u000e\tMN\u0017Sdc/G\b~Q\u0010)_b\u007f\u0007\u0013{6#/xgżڍ\u0012`\u001b\u000b\u001d\u0006_\"i@k-~\u000eg*\u0006\u0004\u001fPH>L;UqG{?D]¦ھ_9)\u00144\u0010V8\u007fv3E\u0019WwG`@Px\\Kr\u0017\u001aP\\d3P\u0001Xf!)MJ^M\u0012P?.S\u0010<O\n@R]`\u0002j{V:+=`O[\u0005j<RinA1io cbvB=Ld\u0015X\u0015'\u0002\t!pp1@ʌi(w*Z~\u0010!$WqJJrEao#ǿ\u00026Boa9ghӓ\u000f\u0017WI#1Ǳ#;\u001dIwjʞn\u007fxwB-d0YYQc#VY0=L|Q\u0011/w\u000e\u0007\u007fLuV\u001d\u001a\u0004e\u0014 D$\u007fewL!Ç}A20\u0012uP\u0001#iM@eA|J1ImFg6n!0nmbO\u0003\u001bXK\u001dGyοpѣ}k^|Mib\u0012{@Oz\u0011b\rpF\b\u001d\u001fL/1s0\u007fM-q1Sj6h\u0006֩mԃmyF{h\u001b4\u0002\u0006\u00062q$~3ikBS8wcUЭ.ٝp\u000fJו\u0003y\u000eS\u0017A-5NSr\u007f'Z[\u001eG}\u0015\u000b\\\u0011~Ys:As4\tl4\u0001ϩO\u0382\u0018h['\u0017aan\u000eoQq\u0019S_,\u0019\u0013In@2m$dZz\t^\u001c2l\rפGك\tH\u0011ӗL.B \u0019\\tk\f*\t\u001b\u0017\u0002\u001d3JB\"Q\u0007\u0012b{tVv\u001b\u0017\u001a\u001fu\u0001ܗ\u000bܓ7(\u001177\"{_t1iP\u000fnm1)\u000bg~\u0015D[Hb<3(\u0007 A\u001a\u001c\u0018 ΐBÜFӣ֏jnɒ<\"\u0015\u001fH9)Fq\u0013e\u0019>m[wrq|v@j\u0003R0,\u0017z+\u0012r^M_o۱~ƚf7dP}[Q!!\u0019JN\u0015\u0015MuTAE\u0006cCs\u001eA̶)ٖ[WS\u007f\u000eG.@T\u0007/\u0005o\u000e\u0015\u0014\u0014o\u0011Ϛsїf\u0006!\u0015VI\u0012;\u001b\t\u00014F\bdnXֲ\u000eֻ]̏ǎv ͛+-t\u0006Pv9\u0011\u0018\u0010\u0005c\u001d_aӝrܕZ\u0006v߲h\u001f\u000fT[;3Z`h\u001fbpg\u001f\u007f,\u0015T ߱\fh1ցgen y\u007f,/9`\u0004*\u00105`V,\u00017y$\b`)fi\u0012܅Y̡h\u0013tnH\n\u001ce\u000b*j(\u001a2d\u001f\r|v\u0011A8vv,gG7G#\u0012a\u00065]ʮQõ*+ITEPE9+q.-\u001f\f\u000b|\u00037BD\u001fq. \u0003߷RÊA&/ڒ<oj<4\u0006e:HC:M^\u001d=\u0018P l\u001bpˤ=Ǿ7A!ֆQ-FE\b\u0007G?Aܥ_К.\r\u0005ӕ%A\u007fqyG\u00149xd=\u001e@=e)S%ci|+\u001a\u0005}J-Q\u001a+M6\u0003ސA¹\"\u0004mB\u0006M-+D\b{g\u000eN\u0002j8%t@\u0005w\b\b4-Nnr'}A7H`ߖu҅wnsc:\b\t\u001b9FDq;uWg[1\u0012\u000br\u0011u\u0018E\u0012\u001e)a\u001b3d\u000eF\u0017ՋU\u05ffQ9t_B\\\u0002\u000bZ4g\u0001\bP\u0011{8QE\u0012\u0003g\u001bn{Tw\u0010f\u0016CaBL\b؆lڞd'0)QCT=|zS\u000fp\u0014\u001112-FB:\u000f6\u001a<K/\u0002,N\u0017iQ\b\u001eتMۊ\u0016`\u0014##`i,&'m;UH&\u0014f\u000fQ39wz\\Cht\u0005\u0004+\u00029iiVԄ7ʜK`V\u001c0+\u0014\u001befNcR\b\u0015@{\u0005H0~\t1׃iԀ +Eյ-g\u0005\bpD{f\u0017\u0002Ef?tczEx0\u0007@E'\u0016#\u001e\u0002=hw2a\bĜ\bţ`Sm~s\"\u001e\n\u0002L'\t\u0014H\u007fcYGnem\u001d\bC\r\u000f8'R\nIx!<iق\u001aݤc\rd8\\\u0005VRy\u0013l\u001fx\u0018K\u0007\u001a\f$8\u0004dsZgߡ\u001eް?cX.4P\u0017( |\n\f}o\u0015~\u0010\"\u001cΥw֟B5\n\u0013i2m!\u05ecQe`A\u001dЌBn\u0012\n\u001a#Eɨ\u007fţ("}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\"Y\u0007\u001f7z~8LC\u0017v8jb>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y\u000f$5m\u0003.VB;x\u001d(\u0014h7", "=v]2e\u001dBS+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u00199o?", "D`[BX", "", "/k_5T", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "", "/lQ6X5MA\u001czyh>Z\u00136o\r", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006M", "u(8", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006M", "uH\u0018#", "0ncAb4", "5dc\u000fb;M]!", "Adc\u000fb;M]!", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "", "1kX=G6\u001b])\byl", "5dc\u0010_0IB#[\u0005n5{\u0017", "u(I", "Adc\u0010_0IB#[\u0005n5{\u0017", "uY\u0018#", "1kX=G6(c(\u0006~g,", "5dc\u0010_0IB#h\u000bm3\u0001\u0012/", "Adc\u0010_0IB#h\u000bm3\u0001\u0012/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0006+A{\u001a=QL=YC+\u0011wa;\u001b9", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^^0|n,d\t", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u0013&LwAT\u0005", "3kTCT;B]\"", "5dc\u0012_,OO(\u0003\u0005g", "Adc\u0012_,OO(\u0003\u0005g", "6`b\u0011\\:IZ\u0015\u0013ab:\f", "5dc\u0015T:\u001dW'\n\u0002Z@c\r=t", "6dX4[;", "5dc\u0015X0@V(", "7mc2e5:Zv\t\u0003i6\u000b\r>i\t*iO\u000e\u0013&Gq\"", "\u0017", ":dUA", "5dc\u0019X-M", "Adc\u0019X-M", "5dc\u001cj5>`\n\u0003zp", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L!Es?(#hR=\u0007u\u0002", ">he<g\u001f", "5dc\u001d\\=Hb\f", "Adc\u001d\\=Hb\f", ">he<g ", "5dc\u001d\\=Hb\r", "Adc\u001d\\=Hb\r", "@d]1X9\u001eT\u001a~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@d]1X9']\u0018~", "\u001a`]1e6BRb\u0010~^>Fu/n~(\t)\u000b\u0016\u0017\u001d", "@hV5g", "5dc\u001f\\.Ab", "Adc\u001f\\.Ab", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\r", "Adc c6MA\u001czyh>Z\u00136o\r", "Bn_", "5dc!b7", "Adc!b7", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "CmX>h,\"R", "", "5dc\"a0Jc\u0019by", "u(9", "EhSA[", "5dc$\\+MV", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f", "", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f\f\u0005O\u0001$ Cv", "2qPD<5M]", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2t\\=E,GR\u0019\fch+|g+t{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y\u000f$5m\u0003.VB;x\u001d(\u0014h@5\u0016_\u0002", "5dc\u0016a=>`'~bZ;\n\rB", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "5dc\u0019T@>`\b\u0013\u0006^", "5dc\u0019T@>`\b\u0013\u0006^j\r\r)r\u007f/{<\u000f\u0017", "5dc\u001aT;KW,", "6`b\u001ci,KZ\u0015\n\u0006b5~u/n~(\tD\n\u0019", "6`b\u001ci,KZ\u0015\n\u0006b5~u/n~(\tD\n\u0019UWs\bIv,5U\f ", "=eU@X;%S\u001a\u000eVg+i\r1h\u000f", "=eU@X;", "=eU@X;-]$Z\u0004]\t\u0007\u0018>o\b", "@dR<e+", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "1kX=C(MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "Adc\u0015T:(d\u0019\f\u0002Z7\b\r8gl(\u0005?\u0001$\u001bPq", "Adc\u001ch;EW\"~", "=tc9\\5>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", "Adc\u001db:Bb\u001d\t\u0004", "Dda6Y@,V\u0015}\u0005p\n\u0007\u00109rj5\u0006K\u0001$&Ko\u001c", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RenderNodeApi23 implements DeviceRenderNode {
    private static boolean testFailCreateRenderNode = false;
    private int bottom;
    private boolean clipToBounds;
    private int internalCompositingStrategy;
    private int left;
    private final AndroidComposeView ownerView;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
    private int right;
    private int top;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static boolean needToValidateAccess = true;

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return 0L;
    }

    public RenderNodeApi23(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.renderNode = renderNodeCreate;
        this.internalCompositingStrategy = CompositingStrategy.Companion.m4267getAutoNrFUSI();
        if (needToValidateAccess) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            verifyShadowColorProperties(renderNodeCreate);
            discardDisplayListInternal();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            needToValidateAccess = false;
        }
        if (testFailCreateRenderNode) {
            throw new NoClassDefFoundError();
        }
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.left;
    }

    public void setLeft(int i2) {
        this.left = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.top;
    }

    public void setTop(int i2) {
        this.top = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.right;
    }

    public void setRight(int i2) {
        this.right = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.bottom;
    }

    public void setBottom(int i2) {
        this.bottom = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return getRight() - getLeft();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.renderNode.getScaleX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f2) {
        this.renderNode.setScaleX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.renderNode.getScaleY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f2) {
        this.renderNode.setScaleY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.renderNode.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f2) {
        this.renderNode.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.renderNode.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f2) {
        this.renderNode.setTranslationY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f2) {
        this.renderNode.setElevation(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        return Build.VERSION.SDK_INT >= 28 ? RenderNodeVerificationHelper28.INSTANCE.getAmbientShadowColor(this.renderNode) : ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, i2);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        return Build.VERSION.SDK_INT >= 28 ? RenderNodeVerificationHelper28.INSTANCE.getSpotShadowColor(this.renderNode) : ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, i2);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.renderNode.getRotation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f2) {
        this.renderNode.setRotation(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.renderNode.getRotationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f2) {
        this.renderNode.setRotationX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.renderNode.getRotationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f2) {
        this.renderNode.setRotationY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return -this.renderNode.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f2) {
        this.renderNode.setCameraDistance(-f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotX() {
        return this.renderNode.getPivotX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f2) {
        this.renderNode.setPivotX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.renderNode.getPivotY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f2) {
        this.renderNode.setPivotY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z2) {
        this.renderNode.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z2) {
        this.clipToBounds = z2;
        this.renderNode.setClipToBounds(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f2) {
        this.renderNode.setAlpha(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI */
    public int mo5864getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE */
    public void mo5865setCompositingStrategyaDBOjCE(int i2) {
        if (CompositingStrategy.m4263equalsimpl0(i2, CompositingStrategy.Companion.m4269getOffscreenNrFUSI())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m4263equalsimpl0(i2, CompositingStrategy.Companion.m4268getModulateAlphaNrFUSI())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i2;
    }

    public final int getLayerType$ui_release() {
        return CompositingStrategy.m4263equalsimpl0(this.internalCompositingStrategy, CompositingStrategy.Companion.m4269getOffscreenNrFUSI()) ? 2 : 0;
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.renderNode.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int i2, int i3, int i4, int i5) {
        setLeft(i2);
        setTop(i3);
        setRight(i4);
        setBottom(i5);
        return this.renderNode.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i2) {
        setLeft(getLeft() + i2);
        setRight(getRight() + i2);
        this.renderNode.offsetLeftAndRight(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i2) {
        setTop(getTop() + i2);
        setBottom(getBottom() + i2);
        this.renderNode.offsetTopAndBottom(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(CanvasHolder canvasHolder, Path path, Function1<? super Canvas, Unit> function1) {
        DisplayListCanvas displayListCanvasStart = this.renderNode.start(getWidth(), getHeight());
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas((android.graphics.Canvas) displayListCanvasStart);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (path != null) {
            androidCanvas.save();
            Canvas.m4149clipPathmtrdDE$default(androidCanvas, path, 0, 2, null);
        }
        function1.invoke(androidCanvas);
        if (path != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.renderNode.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(Matrix matrix) {
        this.renderNode.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(android.graphics.Canvas canvas) {
        Intrinsics.checkNotNull(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z2) {
        return this.renderNode.setHasOverlappingRendering(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), this.renderNode.getRotation(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), getClipToBounds(), this.renderNode.getAlpha(), getRenderEffect(), this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        discardDisplayListInternal();
    }

    private final void discardDisplayListInternal() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(renderNode, RenderNodeVerificationHelper28.INSTANCE.getAmbientShadowColor(renderNode));
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(renderNode, RenderNodeVerificationHelper28.INSTANCE.getSpotShadowColor(renderNode));
        }
    }

    /* JADX INFO: compiled from: RenderNodeApi23.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005&2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅ.\u07beSNo˧?bh\u000e[\u000f4\u0018O̔8֒Y\u0005e܈'4HsM8mqC?n{ȫ\t("}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\"Y\u0007\u001f7z~8LC\u0017v8jb'?C\u000fn(Wz1P\"", "", "u(E", "<dT1G6/O \u0003yZ;|d-c\u007f6\n", "", "BdbA9(BZv\fzZ;|u/n~(\t)\u000b\u0016\u0017", "5dc!X:M4\u0015\u0003\u0002<9|\u0005>el(\u0005?\u0001$\u007fQn\u000ez\u0007)/f}'7i$.", "u(I", "Adc!X:M4\u0015\u0003\u0002<9|\u0005>el(\u0005?\u0001$\u007fQn\u000ez\u0007)/f}'7i$.", "uY\u0018#", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getTestFailCreateRenderNode$ui_release() {
            return RenderNodeApi23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z2) {
            RenderNodeApi23.testFailCreateRenderNode = z2;
        }
    }
}
