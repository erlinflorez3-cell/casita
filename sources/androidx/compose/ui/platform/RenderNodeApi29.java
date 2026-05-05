package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: RenderNodeApi29.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*, |\u000ffp<8DsN6RY2\u0017k\n=,[*wK;k\u001a\u0006\"\u000fZVg}nRZ\u0011Q\u0017\u0006,xr,Op\u0001] \u0016:BuB;M}=A`z6\r H\"@ц\r\u00010*P\u0010|zKK\"\u00128@vBZ\rc\u0005\"Ň\u000e>6\u0001&ձoNLHt]P/+\u0003oCV'u0\u0005M\u0013FZ&#Ǹ\u0012\u001eY?w@%)a\u0003\u001fR\n@ƄCqK\u00071-5\fas\u0006\u0018\u001f\u0014\\#92%]!\b\r\t_D$'Y4*_\u0019\u00146]\u0013{;#J\"N5V\u0016E\u001a\u0015i>7\u0003[k@~k%VH\to!/%.\u0015[=)Oiai\u0003\u0015KD\u0010\u001b\n;\u0001\u001d6\"٪\u05f8d\u0015!A@\\??X=vcPԯǀq\u0004vQJ8\u0012 _\u007f]]A2%\u0016O[g-g\u007fJVRY\u000f\u0005\u000fJ\u0004m`9X\"\u001d }>Q8h7|\u0005\u001a2\u0005\\:\u0005e\u001c\u0003{.\u000e!\u0016tyR S\u0007~_va\u0003Ym\f5/\u00151ip{\u000e\u0006\u001b\r,{e,\u001eoM\u000f\u0014mQ\u0013\tfRZS:o#<jBVf(w*&~\u0012!/Ws23Z/_p]o\u0011ٝAY|7t\u000bl\u001e,l3R\r\u001a(\u0003[\u0019P\u000bz k\u0007\bD|\u000f,]E_E1&\u0004,/HME\u0015\u0004\f\u007fuk|KZo.u\u0004\u007fVjX\u000e(ȔIт\u0013\tA4\b3SS\u0013gWU 0K\u001f\b\u001aSh\\q8n~/xjxY\u000bk`K5ч/ϋh\n\u0012cL\u0007Upt\raLW\u0002SkJ^P|3)TyWȒ$Ŀ91[)#'\u0006!\u007f7oo\u0002o\\}\u0013\u00134w}\u0004ZgLD!&4нGΒMc\u0017@(7z\nbJp\f\u0016KYV\u001bI`A\u0013\u0006\u0007<[\u000eG}\u0015\u001cba/+2Ƽ\u001f̭\u0002>Fa0\u000bQ\u00164`I>\u001fg$\n{\tc\\9_?\u000e\u0019~In@1st\u0015,9ו<Ӓw\"NCA~\u0013T)&:IJ\"[kb\t\u001e\u0010)\u001evc\u001d\u001aJB\"Y\rb\u0013M3ƞTЬ_Ѥɰ )ܣ\u0003\u0019K ~U?\u0012\u000eHZPqAQu++3j}\u0003\u0017)9Gl9I,\u000fUI\u001a4ŴUΜ:\u000e_+s\u000f}\u0013X\u001a\u0003AP!kK_6wv^sA*;͆fʝ\u0016jjP(O\r\u0013M J1'\u000bGY)D9ιNϸ{;[\u001c\u0007?R6W \u000b\r^\u001b[$\fφIȏi̟זzVĺ?\u007f\u0010 .QT\u0003/\bo\u0010|\t\fG\u0011φ}їf\u0002\u0011ސ!2\u0012[bt!\u0014d\\\rе\u0004ג\u0006\u0017v[q&/Mw:z\u0006ZK\u0017yƠgrkߛm\r\t\u0016?\u0007J\u0011;\u00025\tUQ^\u0017f]R\u0011\u0002$\u000fe>hkӈ+߱\flA\u0012U\u0016vw\fQa@98<LoeHRL\u0002O}\u0004\u0007BTV\u0019q+\f\u0013;Ԏh\u05cfFa&`p]r{,+\u001a3\rQ/7!k^t4c]cI%i\u0010_b\u001d\u0003su\\uo'\u0016פCכ\u000fy@x\u0017;H\u001c\u0015\u00020|\u0017.Ps:i^TkW}ڕ&މh\u0003.ɔ\u0016JPFD\u0011<\u001be/\u000fԣ@ѱ\u001e SS9\u0001'\u001eQ7FF\b\u0007G9\u001bUa(B\u0001+\u0005C\u00148\u0006B¶\u007f٥v-G\u0011u\\em[';(Z0\\$s\u000e\u0017M\u0012Z?e:LMEL}\f\u0015>^u\u00910Թy-\u0018G7\r8f|B\\9e\rvLD5\\#up)w\u0018/\u0002\u0018\"h\u00126r\u0016Q\u0083%ܵB4En\r\r[o\u001a\rJUS\u001d\b1\u0014rK\u0017+\u0014\u007fuN.ar{3\u00132zgJ̳Fߴe@\u0012IF$8\rM\u0014Z/xs>sm\\P\u0012;\u00114{?Ux\u007f\u000f!N{\nK\u001dմhܱQKz\rF\\2eND\u0012Y\u0014\u001f~j%Q\u0016J\u000f\u001fC7UvYG@`2u[e2݀\u0012ɚkt_A[BfJY5\u0011?Xg\u0006wjWm!ynaiVԄ-ʜKZV\u001c0,\u0014\u001b\u0016\u0007Vd\\xr,\u001e4>3h~\tG\u0014UZs\u0014\u058c!\u05ca\u0003<z9a:\u001f2WYt)c,}\u001b\u0010Z(AG\u0017;\"a<J#\"\u0011g\u0013:\\3ƊaߑqS(\u0005g#/6&A5\u001bYu'wMso?-gV{zʾ\u0015ۄfk+k\u0014~m`\u001dHd\b`K\b\u001b\u001d\u0017Aٔ|ȁ\u00102$:[eK\u0013\u0089b%=>eްH\\o\u0011GU\nʡ.ڞn"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\"Y\u0007\u001f7z~8LC\u0017v8jh>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y\u000f$5m\u0003.VB;x\u001d(\u0014h7", "=v]2e\u001dBS+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u00199o?", "D`[BX", "", "/k_5T", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "", "/lQ6X5MA\u001czyh>Z\u00136o\r", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006M", "u(8", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006M", "uH\u0018#", "0ncAb4", "5dc\u000fb;M]!", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "", "1kX=G6\u001b])\byl", "5dc\u0010_0IB#[\u0005n5{\u0017", "u(I", "Adc\u0010_0IB#[\u0005n5{\u0017", "uY\u0018#", "1kX=G6(c(\u0006~g,", "5dc\u0010_0IB#h\u000bm3\u0001\u0012/", "Adc\u0010_0IB#h\u000bm3\u0001\u0012/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0006+A{\u001a=QL=YC+\u0011wa;\u001b9", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^^0|n,d\t", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u0013&LwAT\u0005", "3kTCT;B]\"", "5dc\u0012_,OO(\u0003\u0005g", "Adc\u0012_,OO(\u0003\u0005g", "6`b\u0011\\:IZ\u0015\u0013ab:\f", "5dc\u0015T:\u001dW'\n\u0002Z@c\r=t", "6dX4[;", "5dc\u0015X0@V(", "7mc2e5:Zv\t\u0003i6\u000b\r>i\t*iO\u000e\u0013&Gq\"", "\u0017", "7mc2e5:Z\u0006~\u0004],\nh0f\u007f&\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", ":dUA", "5dc\u0019X-M", "5dc\u001cj5>`\n\u0003zp", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L!Es?(#hR=\u0007u\u0002", ">he<g\u001f", "5dc\u001d\\=Hb\f", "Adc\u001d\\=Hb\f", ">he<g ", "5dc\u001d\\=Hb\r", "Adc\u001d\\=Hb\r", "@d]1X9\u001eT\u001a~xm", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@d]1X9']\u0018~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{I\u007f\u0017$0y\r<L", "@hV5g", "5dc\u001f\\.Ab", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\r", "Adc c6MA\u001czyh>Z\u00136o\r", "Bn_", "5dc!b7", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "CmX>h,\"R", "", "5dc\"a0Jc\u0019by", "u(9", "EhSA[", "5dc$\\+MV", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f", "", "2qPD<5M]", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2t\\=E,GR\u0019\fch+|g+t{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y\u000f$5m\u0003.VB;x\u001d(\u0014h@5\u0016_\u0002", "5dc\u0016a=>`'~bZ;\n\rB", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "5dc\u001aT;KW,", "6`b\u001ci,KZ\u0015\n\u0006b5~u/n~(\tD\n\u0019", "6`b\u001ci,KZ\u0015\n\u0006b5~u/n~(\tD\n\u0019UWs\bIv,5U\f ", "7rD@\\5@1#\u0007\u0006h:\u0001\u00183n\u0002\u000fwT\u0001$", "7rD@\\5@1#\u0007\u0006h:\u0001\u00183n\u0002\u000fwT\u0001$UWs\bIv,5U\f ", "=eU@X;%S\u001a\u000eVg+i\r1h\u000f", "=eU@X;", "=eU@X;-]$Z\u0004]\t\u0007\u0018>o\b", "@dR<e+", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "1kX=C(MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "Adc\u0015T:(d\u0019\f\u0002Z7\b\r8gl(\u0005?\u0001$\u001bPq", "Adc\u001ch;EW\"~", "=tc9\\5>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", "Adc\u001db:Bb\u001d\t\u0004", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RenderNodeApi29 implements DeviceRenderNode {
    public static final int $stable = 8;
    private RenderEffect internalRenderEffect;
    private final AndroidComposeView ownerView;
    private final RenderNode renderNode = new RenderNode("Compose");
    private int internalCompositingStrategy = CompositingStrategy.Companion.m4267getAutoNrFUSI();

    public RenderNodeApi29(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        return this.renderNode.getUseCompositingLayer();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.renderNode.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.renderNode.getLeft();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.renderNode.getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.renderNode.getRight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.renderNode.getBottom();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.renderNode.getWidth();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.renderNode.getHeight();
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
        return this.renderNode.getAmbientShadowColor();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i2) {
        this.renderNode.setAmbientShadowColor(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        return this.renderNode.getSpotShadowColor();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i2) {
        this.renderNode.setSpotShadowColor(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.renderNode.getRotationZ();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f2) {
        this.renderNode.setRotationZ(f2);
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
        return this.renderNode.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f2) {
        this.renderNode.setCameraDistance(f2);
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
        return this.renderNode.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z2) {
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
    public RenderEffect getRenderEffect() {
        return this.internalRenderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(RenderEffect renderEffect) {
        this.internalRenderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeApi29VerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI */
    public int mo5864getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE */
    public void mo5865setCompositingStrategyaDBOjCE(int i2) {
        RenderNode renderNode = this.renderNode;
        if (CompositingStrategy.m4263equalsimpl0(i2, CompositingStrategy.Companion.m4269getOffscreenNrFUSI())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m4263equalsimpl0(i2, CompositingStrategy.Companion.m4268getModulateAlphaNrFUSI())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int i2, int i3, int i4, int i5) {
        return this.renderNode.setPosition(i2, i3, i4, i5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i2) {
        this.renderNode.offsetLeftAndRight(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i2) {
        this.renderNode.offsetTopAndBottom(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(CanvasHolder canvasHolder, Path path, Function1<? super Canvas, Unit> function1) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
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
        this.renderNode.endRecording();
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
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z2) {
        return this.renderNode.setHasOverlappingRendering(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(this.renderNode.getUniqueId(), this.renderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getRight(), this.renderNode.getBottom(), this.renderNode.getWidth(), this.renderNode.getHeight(), this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), this.renderNode.getAmbientShadowColor(), this.renderNode.getSpotShadowColor(), this.renderNode.getRotationZ(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), this.renderNode.getClipToBounds(), this.renderNode.getAlpha(), this.internalRenderEffect, this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }
}
