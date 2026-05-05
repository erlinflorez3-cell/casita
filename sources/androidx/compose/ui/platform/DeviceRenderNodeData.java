package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
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
/* JADX INFO: compiled from: DeviceRenderNode.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\r(4\u0012}\u000bnjG5LeN9ZS8\u0018s{:%c$\bCC٥\"}8\tWNm=vJh\u0017KƤ\fǞ~\u0001ߚyU'\\RǑ1RsM3eok:pxD\u000782P;\n\t\u000f\u001eBH>y\u000bGY\u0011*0nsJV\u001bS\u001d\u001a@\tN$\u000f%tg|9XpkBG#1lRR5hH|{\u0017VX5\u0018\u000faL5P;C!=S1\u0011b_M\u0010Wqk\u000fx+59as\u0006@h\u0004\"$CO;`\u0003*j\u0015i`:*;Sq\\h\u000eV\u0002\u000b\u007f\u001bN\u001c\u000e41X2;-~\b<=\u0005vaTh\u0002\rL\u0010~oK/%.=;=)|iai#^;\n\u001c%\u001eQ\u0019~%im&`C3d{_Ki@kR^\u0010gX\u0006\u0006\u0007a0F\u00144U\u001dG{?Lϲ)7iXk(yW`D\u0016wKâi\u001cp`\u001fX\"\u001d }Ү\nTaR<\u001dk~^\u001fÓ\u0012\u0016#b_\u0016\bA*#˃=i,\u001e(gh\u0018m\u0014ϱ\u000bm6t\u0012qn\u001a\u0011\u001e߱_{<_?(a\u0001\u0001Zͺ=+\ffCZS:d#ͬ#zOxm\u0010{rXRǕ3\bx*\u0013D1Gf[Ʉ\u0004fIO\\!_\trVѾU{+\u0011J<t7\u0004\u0017˛q8n\u0007+D|\u000f,sܒR} 48:hb\u0015iɛ\u007f<\u0007UKdGz\u0005\\µVD'$~QQ]GYĈ\u007fq;\u0010\u0013]N\td\u007fiXل{E\u000e\u001d\"\u0001.\u0016&1Ҹ-ÄiI؛SϟȔz`x\u000b\u0016\nH\u0001o/\u0013G\u0012WQм?\u0012y\u0011CTNf\u007fKɛ\u001fm\b}\r\u00155[Fm\u07bb\u0017@\u001b=\u0001y]\u0018rtԧcW-\u0003R\u001c,\u0012\u00196ͬR&9I&aY-HhځmKIVY\u0010\bp\u0013zچ4\u0011иd~FPM9ɀ.l\r,\u001bpn[h\u0014 \u0004:.m,\fC,\u0017\u000fI+\u0011[W\u007fm\u001cN\r\u0011P\u000f\u0018\u0010\u00141\u001d\u0015LC&Veh!04vH<G;p\fT\tR7\\B\u000e\u000bQ\\\u0002\u0006>}0Le\u000f%;Zsi`>Z~\\dS\u001d`sjQ0\u0007~\u001d?6xc;5sLT=pJ\u0001\u0002'9!pO\rt=+r^i!.X\u000f\u001a]]qL2<\nG7}\u0004o:;H\u0003#B&,QQ?i'6d\u000bcvfd%\u001c\u0017XT\"7\u0012\u0013|<F:\u0015\u0011\u0019]\u0007\bb[V~}=C(\u0016/DW\u0011<\u0003iF)C\u001e5[Gyp\u001a'\nnk;, P&-\u0004\u0003:tW<~:c!:$\f.b0\u0013CX&\u0004<e\rt -6R\u007f\b9\u0002!{qk&?\u0007Ԗ*̓\u0005לƑlz\u0010TzU7f\u0019u~1\u0005\u0012\u001f3^\u0011!)c-AW!Ч\u0012\u001c'f\u0006\u0018\u0014C)e¤\u0007+0\u001eE{h\u001fb\u0016ݗ\f{GyDy1^\\tݠ+ݺy\u00102Ĕ@\u0017Av[_\u0005\u000bb\u000fPz^vx7|t:,jΠ\u000bĿb\u001d\u001b̊^t$\t=\\9!a3U\bW\u0013SO>!_U̫\u001f=:У\b*|9\u0011_3\r\u000e>Z\t!\n>Ư9ĘXI\"śq&s\u000e\u0011GkG>l\u0016Oa&\u001fHr8NV3ӑ(ՀU?I˒)\u0003\u001bc\u0014\u001c'\u001b;\u0018_\u0002uB\u000f\u0014\u0019\rm\u0012\bːFތ;~+˄'q!\u0007tgE7k|5:R\u0006X\u001cec\u0005-8ιU̸DɊĒT?·\u000e-,$\u0014);\u0002KbVO\u007f^F\t\u0002~T>8D\u0007DQQCԴ\u007fԤ0u ĵ|]ghO\u001c4\u001bJs8P=\u0016SU\u0001y9G՜I\u001a?ʔ\u001e+9M\u000b5 \u0001N-ar{2ۺaB\u001bŎ\u001c<8\u0019D\u001f\u0018Xg?\u001e-@^:ÌvҦUk\u0018ؾ*\u000f\u0013<\u0006Rrb\u0006\u001a+;wc\u0005\\N\\'W\u0018ǚ\u0017ڝ\u00130fܻZ\u000e\u0011@$Oh\u0019\b9X\u0004e-Ab\fC]\u0011\u0005\u0018w͟\u001dئ)\u0012-٠\u0003IE\u0012\u007f\u0016];9I{\n)Dsa\u001dUONߠ/\u001b\bӭC0M\u0017L?zp\u0014 ]dv\u001a\u001bєPڍq<8ߣh\u0001`\u0005k\"<!C\u0018#\tOJpJsd?5\u000eǡzדY/5Ҽ\u001a\u0005\u0016\u0005'4+ Y}@FD%?O\u0014\b\u000bS,\u07b5y܁\u0014\u000fiĮ91\f\u0005=bkn\\,M<(W\r\u00158'R\u0010iڨnԝ\u0017u\u0016݁w\u0005R}dJhM_Yte;'\t\u007f$.:B,ΈI۠\u0015n$ލSaFu<\u0012)IU5\nM6\bt\u0005qMs.LփJқu\u001dkٔw\u0016t\u001dj}^\u0019]rN:R)+*y{v,݉\u001b[kݗ\u0003uZ.\u001f~\u0005\u0004>p\u0012r\u0015n\u0015͛J̈́Lx!ʠg\u007f! R\u0004)bv\u0018O33\u0005:4NH\u0019#W\u0382Wڼ\u001b ?ݮ\u000f%m\u0004HC\u0002$Y/3j\u001b\u0015\u001cjywC|ׁ7<\u0015ѥD~\u001bWL:C\u0013z\fe02nΘ6Lbݰ4/`{{\u000eǜ*\u0017\u0014\u007f\u000b؝\u000b\u0002QYu%\u0012յ\u0003\u001b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y\u000f$5m\u0003.VB;x\u001d(\u0014h@5\u0016_\u0002", "", "CmX>h,\"R", "", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "EhSA[", "6dX4[;", "AbP9X\u001f", "", "AbP9X ", "BqP;f3:b\u001d\t\u0004Q", "BqP;f3:b\u001d\t\u0004R", "3kTCT;B]\"", "/lQ6X5MA\u001czyh>Z\u00136o\r", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "@nc.g0H\\\u000e", "@nc.g0H\\\f", "@nc.g0H\\\r", "1`\\2e(\u001dW'\u000evg*|", ">he<g\u001f", ">he<g ", "1kX=G6(c(\u0006~g,", "", "1kX=G6\u001b])\byl", "/k_5T", "@d]1X9\u001eT\u001a~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0006+A{\u001a=QL=YC+\u0011wa;\u001b9", "uI8\u0016<\u0010\"7y_[?\r`l\u0010F`\t\\!u\fw.k\u0017;\u0004/9X\u0011i5w\u001e9WQ;5D\"^jn5\u0012f0L\u0005p4LW+\\_R>\u0015\u0012X\u001d$\u000fs\u000bcP+rM\u0001$\u00194\u0013\u0006Dw\u0001\u0019\u001f\n<4OBW\fW\u0001$SK2vUfowVKRJ&q\u0012_*2}+", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006M", "u(8", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006M", "uH\u0018#", "5dc\u000fb;M]!", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "5dc\u0010_0IB#[\u0005n5{\u0017", "u(I", "Adc\u0010_0IB#[\u0005n5{\u0017", "uY\u0018#", "5dc\u0010_0IB#h\u000bm3\u0001\u0012/", "Adc\u0010_0IB#h\u000bm3\u0001\u0012/", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^^0|n,d\t", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u0013&LwAT\u0005", "\u0017", "5dc\u0012_,OO(\u0003\u0005g", "Adc\u0012_,OO(\u0003\u0005g", "5dc\u0015X0@V(", "5dc\u0019X-M", "5dc\u001d\\=Hb\f", "Adc\u001d\\=Hb\f", "5dc\u001d\\=Hb\r", "Adc\u001d\\=Hb\r", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "5dc\u001f\\.Ab", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "5dc V(ES\f", "Adc V(ES\f", "5dc V(ES\r", "Adc V(ES\r", "5dc c6MA\u001czyh>Z\u00136o\r", "Adc c6MA\u001czyh>Z\u00136o\r", "5dc!b7", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "5dc\"a0Jc\u0019by", "u(9", "5dc$\\+MV", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(JH", "1n\\=b5>\\(JI", "1n\\=b5>\\(JJ", "1n\\=b5>\\(JK", "1n\\=b5>\\(JL", "1n\\=b5>\\(JM", "1n\\=b5>\\(JN", "1n\\=b5>\\(K", "1n\\=b5>\\(KE", "1n\\=b5>\\(KF", "1n\\=b5>\\(KG", "1n\\=b5>\\(KH", "1n\\=b5>\\(KI", "1n\\=b5>\\(KJ", "1n\\=b5>\\(KJ&se\u0016\u0010Um\f", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "1n_F -N1\u0016oJ\\", "uI8\u0016<\u0010\"7y_[?\r`l\u0010F`\t\\!u\fw.k\u0017;\u0004/9X\u0011i5w\u001e9WQ;5D\"^jn5\u0012f0L\u0005p4LW+\\_R>\u0015\u0012X\u001d$\u000fPkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WEn:M]\fVz\u001f\u0003IrGFjcwG.Ek)d\u0019H'[:\u0019 #mn", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    public /* synthetic */ DeviceRenderNodeData(long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, int i8, int i9, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, boolean z3, float f13, RenderEffect renderEffect, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, i2, i3, i4, i5, i6, i7, f2, f3, f4, f5, f6, i8, i9, f7, f8, f9, f10, f11, f12, z2, z3, f13, renderEffect, i10);
    }

    /* JADX INFO: renamed from: copy-fuCbV5c$default, reason: not valid java name */
    public static /* synthetic */ DeviceRenderNodeData m5866copyfuCbV5c$default(DeviceRenderNodeData deviceRenderNodeData, long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, int i8, int i9, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, boolean z3, float f13, RenderEffect renderEffect, int i10, int i11, Object obj) {
        float f14 = f6;
        float f15 = f5;
        float f16 = f2;
        int i12 = i7;
        float f17 = f3;
        int i13 = i3;
        int i14 = i6;
        int i15 = i4;
        float f18 = f4;
        int i16 = i2;
        int i17 = i5;
        long j3 = j2;
        int i18 = i10;
        boolean z4 = z3;
        float f19 = f7;
        float f20 = f12;
        float f21 = f13;
        int i19 = i9;
        float f22 = f11;
        float f23 = f10;
        float f24 = f9;
        boolean z5 = z2;
        RenderEffect renderEffect2 = renderEffect;
        float f25 = f8;
        int i20 = i8;
        if ((-1) - (((-1) - i11) | ((-1) - 1)) != 0) {
            j3 = deviceRenderNodeData.uniqueId;
        }
        if ((i11 + 2) - (i11 | 2) != 0) {
            i16 = deviceRenderNodeData.left;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 4)) != 0) {
            i13 = deviceRenderNodeData.top;
        }
        if ((i11 + 8) - (i11 | 8) != 0) {
            i15 = deviceRenderNodeData.right;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 16)) != 0) {
            i17 = deviceRenderNodeData.bottom;
        }
        if ((i11 & 32) != 0) {
            i14 = deviceRenderNodeData.width;
        }
        if ((i11 & 64) != 0) {
            i12 = deviceRenderNodeData.height;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 128)) != 0) {
            f16 = deviceRenderNodeData.scaleX;
        }
        if ((i11 + 256) - (i11 | 256) != 0) {
            f17 = deviceRenderNodeData.scaleY;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 512)) != 0) {
            f18 = deviceRenderNodeData.translationX;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 1024)) != 0) {
            f15 = deviceRenderNodeData.translationY;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 2048)) != 0) {
            f14 = deviceRenderNodeData.elevation;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 4096)) != 0) {
            i20 = deviceRenderNodeData.ambientShadowColor;
        }
        if ((i11 & 8192) != 0) {
            i19 = deviceRenderNodeData.spotShadowColor;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 16384)) != 0) {
            f19 = deviceRenderNodeData.rotationZ;
        }
        if ((i11 + 32768) - (i11 | 32768) != 0) {
            f25 = deviceRenderNodeData.rotationX;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 65536)) != 0) {
            f24 = deviceRenderNodeData.rotationY;
        }
        if ((i11 & 131072) != 0) {
            f23 = deviceRenderNodeData.cameraDistance;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 262144)) != 0) {
            f22 = deviceRenderNodeData.pivotX;
        }
        if ((-1) - (((-1) - i11) | ((-1) - 524288)) != 0) {
            f20 = deviceRenderNodeData.pivotY;
        }
        if ((i11 & 1048576) != 0) {
            z5 = deviceRenderNodeData.clipToOutline;
        }
        if ((i11 + 2097152) - (i11 | 2097152) != 0) {
            z4 = deviceRenderNodeData.clipToBounds;
        }
        if ((i11 & 4194304) != 0) {
            f21 = deviceRenderNodeData.alpha;
        }
        if ((i11 + 8388608) - (i11 | 8388608) != 0) {
            renderEffect2 = deviceRenderNodeData.renderEffect;
        }
        if ((i11 + 16777216) - (i11 | 16777216) != 0) {
            i18 = deviceRenderNodeData.compositingStrategy;
        }
        return deviceRenderNodeData.m5868copyfuCbV5c(j3, i16, i13, i15, i17, i14, i12, f16, f17, f18, f15, f14, i20, i19, f19, f25, f24, f23, f22, f20, z5, z4, f21, renderEffect2, i18);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    public final RenderEffect component24() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component25--NrFUSI, reason: not valid java name */
    public final int m5867component25NrFUSI() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: copy-fuCbV5c, reason: not valid java name */
    public final DeviceRenderNodeData m5868copyfuCbV5c(long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, int i8, int i9, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, boolean z3, float f13, RenderEffect renderEffect, int i10) {
        return new DeviceRenderNodeData(j2, i2, i3, i4, i5, i6, i7, f2, f3, f4, f5, f6, i8, i9, f7, f8, f9, f10, f11, f12, z2, z3, f13, renderEffect, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && Intrinsics.areEqual(this.renderEffect, deviceRenderNodeData.renderEffect) && CompositingStrategy.m4263equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.uniqueId) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.elevation)) * 31) + Integer.hashCode(this.ambientShadowColor)) * 31) + Integer.hashCode(this.spotShadowColor)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Boolean.hashCode(this.clipToOutline)) * 31) + Boolean.hashCode(this.clipToBounds)) * 31) + Float.hashCode(this.alpha)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((iHashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + CompositingStrategy.m4264hashCodeimpl(this.compositingStrategy);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceRenderNodeData(uniqueId=");
        sb.append(this.uniqueId).append(", left=").append(this.left).append(", top=").append(this.top).append(", right=").append(this.right).append(", bottom=").append(this.bottom).append(", width=").append(this.width).append(", height=").append(this.height).append(", scaleX=").append(this.scaleX).append(", scaleY=").append(this.scaleY).append(", translationX=").append(this.translationX).append(", translationY=").append(this.translationY).append(", elevation=");
        sb.append(this.elevation).append(", ambientShadowColor=").append(this.ambientShadowColor).append(", spotShadowColor=").append(this.spotShadowColor).append(", rotationZ=").append(this.rotationZ).append(", rotationX=").append(this.rotationX).append(", rotationY=").append(this.rotationY).append(", cameraDistance=").append(this.cameraDistance).append(", pivotX=").append(this.pivotX).append(", pivotY=").append(this.pivotY).append(", clipToOutline=").append(this.clipToOutline).append(", clipToBounds=").append(this.clipToBounds).append(", alpha=").append(this.alpha);
        sb.append(", renderEffect=").append(this.renderEffect).append(", compositingStrategy=").append((Object) CompositingStrategy.m4265toStringimpl(this.compositingStrategy)).append(')');
        return sb.toString();
    }

    private DeviceRenderNodeData(long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, int i8, int i9, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, boolean z3, float f13, RenderEffect renderEffect, int i10) {
        this.uniqueId = j2;
        this.left = i2;
        this.top = i3;
        this.right = i4;
        this.bottom = i5;
        this.width = i6;
        this.height = i7;
        this.scaleX = f2;
        this.scaleY = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.elevation = f6;
        this.ambientShadowColor = i8;
        this.spotShadowColor = i9;
        this.rotationZ = f7;
        this.rotationX = f8;
        this.rotationY = f9;
        this.cameraDistance = f10;
        this.pivotX = f11;
        this.pivotY = f12;
        this.clipToOutline = z2;
        this.clipToBounds = z3;
        this.alpha = f13;
        this.renderEffect = renderEffect;
        this.compositingStrategy = i10;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
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

    public final float getElevation() {
        return this.elevation;
    }

    public final void setElevation(float f2) {
        this.elevation = f2;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final void setAmbientShadowColor(int i2) {
        this.ambientShadowColor = i2;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void setSpotShadowColor(int i2) {
        this.spotShadowColor = i2;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void setRotationZ(float f2) {
        this.rotationZ = f2;
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

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final void setCameraDistance(float f2) {
        this.cameraDistance = f2;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final void setPivotX(float f2) {
        this.pivotX = f2;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final void setPivotY(float f2) {
        this.pivotY = f2;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final void setClipToOutline(boolean z2) {
        this.clipToOutline = z2;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final void setClipToBounds(boolean z2) {
        this.clipToBounds = z2;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f2) {
        this.alpha = f2;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m5869getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m5870setCompositingStrategyaDBOjCE(int i2) {
        this.compositingStrategy = i2;
    }
}
