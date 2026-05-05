package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
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
/* JADX INFO: compiled from: DeviceRenderNode.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4E\u0007\":\u0018\u007f\u0007lrA0RnP.XY2\u000f\u0002{<$a4yCQU\"}((WNunvJ`\u000eK\u000f\u0014\u0016\u0001j2I]xs\u0012\u0017˰JoU3UoC9htL\u0005(2(<\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CSÈ\u001a0VpBR#M\r\u001a\u0018\bF \u0017\u001edgT6NKsŽ_#1h\u000bT55H|{c\rxo\u001b\u000596+n\u000ee\u00193,\u001b\u0007\u00015\u0006'\bwK_\u0001'U\u0007\u0010\u0018 Df\\,\u0015Y&=a\u0001\u0004t\u0005\u007f?RKs]q+h\u000eVN+\u007f\u001b\u001a\u001c\u000e4\u0006\u000fRu(th&3#I\u0004D^cvB.\u0002(Z_3\u000e\u0016C9I=\u0002eIzf7*\fSBk-|\u0005sT<7E\u001fb\\i1\u007f&mN\\pq?\u0004\u0003\u001fJ2:\u0012\u0019_\f?}!.E\u0010G]I#OB02\u000b\f?\u0013nTki\u0001Zp&|\u0003O*7\u001e!h-\u0015y>lXZg}\"bu\u0016\n)\u001f\u000bg\u0003Em6\\@\u0001i\u0019_\u000e\u000e3T~7\bu\u001c\u0012e\u0001v3cX\u0014\u0014o\u0006\u000f\u0014mC\u0013\tfrZS:a#LrHVj(w*E%ܣ\u001f\u0558C{4623'_5J\t\"PFM\u001fm`\u0001\u0010-[\nʛ\u000fȐ(~!\u0003Vd~x\bzO6\u000bkr=O]M\u0019T\\xע6č'\u000b\u0017u\u0006TuU\u0018bz$\u000eU*!lׄEֺ3G+\u0011\u00058@\u0005MGR\u0003sV\u001e(5\f\u0015y=M?גsŰnzDbp]]h7$|s\u00019Xz\u000e\u0011yF)Y:ӡ\u0017ИBS\u000b\u0005_T\\L\u001d\u0007%73\u0017@>\u000bOECU8l߷ ۥ\u0014˕ՙhnЦ}l'(z\u0002\u00125\u0004\u0018u\u007f_h\u0003QFgq~l#zо\u000f\u074cLt\u0010\nH(B\u0010SJG\u0005~[\t]\u0019P\u0016f5>c\u0084Xݍ>\u0017\b\u007f:Pm>DS\f7vCS\u0018$ϰiƽqOt\rP3\u0018\u0014LA|74=N].ũ\u000bޘ\nw08Gap\u000e\r\u001f2[D<6\f\u001aҴuѕ\u0014\u0005\u0018He7%5buA\u007f\u001cYIrdr\u001d`sawǈ\r϶\u0013=6z;\\\u0013pfV5\u0010@\u0006$5\u0017H\u0003Q\u0015eSY\u001bțEЬ,b\u0019\rK\rQy\"8\nx7 <\u007f\u001ak0|KInî;ݔ\u0015c\u000f2d?cm\u001fz\u0005G~R|#\u007f\u038d\u0007է\u0012F\"\u0011\u0011O]u\u0010d3\u0004\\|\bY(9/DW\bbƘo̍\u001f7\u001e73vWm4)\u0002\u0012a@N\u001e.[?\u0004#\"3ߍ\u001aҁ\u000eg3<\u001c.$e\"\u000b\u0019\u000e.\t~`\u00031\".67&\u05f5?ě\u0017hqm}`N*Kn\f\u0003YmI q.{n\u0004\fYІ=ٟ}xER#K5PN\u0015^\u001eH\u0016$6fU\u0018\u0014C-uߵ\u0014Ԗ-\u001agen6yX{\u000f1uy52A>\u001a6}M\u0001Lĉ,ķ,\u0019SXS\u0007r\u0012-\u0003P!&^\u0019);í\u0018ì\u0018\u0007\u0017Jd[!7ft$0=<i5iY_`5\u0005\u001cù2Ж5\\W\u001d=\u007f\u0019rHx\u0017QHgE\u00108\u0012!r.8\u0003\u0086HÊA\u001e?[*?rUv[S\fZ\bZ\u0018dŘ1և<$V^ pIZº@\u0019։\u0001$@\tu߀5ciYS+I\t~\u0007,mxܐo,ު;q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y\u000f$5m\u0003.VB;x\u001d(\u0014h7", "", "/k_5T", "", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "/lQ6X5MA\u001czyh>Z\u00136o\r", "", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006M", "u(8", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006M", "uH\u0018#", "0ncAb4", "5dc\u000fb;M]!", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "1kX=G6\u001b])\byl", "", "5dc\u0010_0IB#[\u0005n5{\u0017", "u(I", "Adc\u0010_0IB#[\u0005n5{\u0017", "uY\u0018#", "1kX=G6(c(\u0006~g,", "5dc\u0010_0IB#h\u000bm3\u0001\u0012/", "Adc\u0010_0IB#h\u000bm3\u0001\u0012/", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0006+A{\u001a=QL=YC+\u0011wa;\u001b9", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^^0|n,d\t", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u0013&LwAT\u0005", "3kTCT;B]\"", "5dc\u0012_,OO(\u0003\u0005g", "Adc\u0012_,OO(\u0003\u0005g", "6`b\u0011\\:IZ\u0015\u0013ab:\f", "5dc\u0015T:\u001dW'\n\u0002Z@c\r=t", "6dX4[;", "5dc\u0015X0@V(", ":dUA", "5dc\u0019X-M", ">he<g\u001f", "5dc\u001d\\=Hb\f", "Adc\u001d\\=Hb\f", ">he<g ", "5dc\u001d\\=Hb\r", "Adc\u001d\\=Hb\r", "@d]1X9\u001eT\u001a~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@hV5g", "5dc\u001f\\.Ab", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\r", "Adc c6MA\u001czyh>Z\u00136o\r", "Bn_", "5dc!b7", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "CmX>h,\"R", "", "5dc\"a0Jc\u0019by", "u(9", "EhSA[", "5dc$\\+MV", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f", "", "2qPD<5M]", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2t\\=E,GR\u0019\fch+|g+t{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y\u000f$5m\u0003.VB;x\u001d(\u0014h@5\u0016_\u0002", "5dc\u0016a=>`'~bZ;\n\rB", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "5dc\u001aT;KW,", "=eU@X;%S\u001a\u000eVg+i\r1h\u000f", "=eU@X;", "=eU@X;-]$Z\u0004]\t\u0007\u0018>o\b", "@dR<e+", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "1kX=C(MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "Adc\u0015T:(d\u0019\f\u0002Z7\b\r8gl(\u0005?\u0001$\u001bPq", "6`b\u001ci,KZ\u0015\n\u0006b5~u/n~(\tD\n\u0019", "Adc\u001ch;EW\"~", "=tc9\\5>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", "Adc\u001db:Bb\u001d\t\u0004", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(Canvas canvas);

    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo5864getCompositingStrategyNrFUSI();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(Matrix matrix);

    int getLeft();

    void getMatrix(Matrix matrix);

    float getPivotX();

    float getPivotY();

    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i2);

    void offsetTopAndBottom(int i2);

    void record(CanvasHolder canvasHolder, Path path, Function1<? super androidx.compose.ui.graphics.Canvas, Unit> function1);

    void setAlpha(float f2);

    void setAmbientShadowColor(int i2);

    void setCameraDistance(float f2);

    void setClipToBounds(boolean z2);

    void setClipToOutline(boolean z2);

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo5865setCompositingStrategyaDBOjCE(int i2);

    void setElevation(float f2);

    boolean setHasOverlappingRendering(boolean z2);

    void setOutline(Outline outline);

    void setPivotX(float f2);

    void setPivotY(float f2);

    boolean setPosition(int i2, int i3, int i4, int i5);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f2);

    void setRotationY(float f2);

    void setRotationZ(float f2);

    void setScaleX(float f2);

    void setScaleY(float f2);

    void setSpotShadowColor(int i2);

    void setTranslationX(float f2);

    void setTranslationY(float f2);
}
