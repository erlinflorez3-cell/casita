package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
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
/* JADX INFO: compiled from: ContextualFlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я~\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCI[\"}(\nWN}gvϺb\u000bQ-\u000e\u0016\u000fj4Icxe\u0012%2JģG3coE9vt>\u0005&2*8\u0010\u0005\t\u001a0f\u0018v\tŏSÈ\u001a0VpBR#M\r\u001a(\u0006F \u0007\u001edg\\BPlc=5ݍ\t\u007fĩ~'\u000e/=֝\fVX5\r\u000faL,P;C\u0017=S1\nb_M\u0007Wqk\nx+51as\u0006=h\u0004\"\u001dCO;f\u0003*j\u000fi`:.;SqVh\u000eV\u0004\u000b\u007f\u001bI\u001c\u000e43X2;(~\b<?\u0005vaOh\u0002\rR\u0010\u0010oG/6\u0010@;D+haai-|J߉\t\r$8/\u00011\u0015b$xJ+e\b`_]͘ART\"iCs\u001d\u0001d\b0*JW\u0011?\u000b?Iϲ)AaQ3'q\u001bXFm|+|xUyRvTP\u0006ގ;*\u000f!ʑHd\u0013\t\u0019[fS)MJUMĩ\t['j T!S \u0015ѻi2\u0003[\u0007\"6?sGd~m\u001eWgraHɄg\u0010gg%&\u0006\u05fdcM\u001atlkAjm81`Tн\u0014\u0002\u0002\\^\u0012\u0019KOs\":RK)m%W19նE\u0007\u000fwjn\u0016\u0018d5*\t\u0010@\u0005\u000b\u0011P\u000b\u0005\u001e~֑M,\u0003uhύBپ9\u00194\u0001joB);\u0007-vFĿh\u0015NZ\u001a.u\u0004\u0001fۍ\u001b\u0002e=k+\u000f-0xŋ.ןKqхP˧ɟ+|\u0003)\u001dk15u9\u0003pZi1\u0080P\u001d+0)vrQ\u000f+҃zՌEyūbҺߏ_@O&\u0011\n\u0005UF1\u001d\u001fL1GȾ#E<;x?\u001dD\u0004Zگ\u0016*dw&Fy\u0011\u001blܬfLьb$'zQ\fЦk>OY\r>:$\u001b\u0004rNpw\u0016D!4;6xGjpd<e\u000b]\u0003\u0017\r2\r~\\s:Av.:4_8{[}Bgs+\u0017Maq\u0006myc;P\u0015\n\u0019\u0007In@(m&\\Wp\u0016H\u0006\"$fGAb\u0013J!$b8l\u000e\u0011Cbx\u001e\u0010)\u0010vv\u0015\u0017@S\fLf\u001bd\u0004lXX\u0005\u000fY\u000f4Ǆ\u0005~\u0015HL\u000bel\u000bmTjG\u0019B\u0012c,7'˥S\tl=;JZR+*^\u00071_mTY\u0011d\u001fھ-wq\b\u001c>\u001e\u0016-D\u001e!_m!a\u00070\r\u001f\u0004{͒hv\u0018{\u0019ǐ!Ə}ғէ\u0012>\u0010G\u0019R\u0018\u0004}\u001dEL|xgI(</F?\u0006:9*́\u001cu\u001cCjU[z\u00167{\u0006\u0012K\u007f\u0018 Nf\u0014v1\\\u0006N\u0015!&\"HW\n\u0016\u0011\u000eOߧOh\u000b<\r\rr8qN̝NJO\u0010WvY\u001a8I@Ui\u001d\nP\u0011\u0001x8#3cÓT̃өj3\\@|t!/\u0017/e.Aa1ϧ\u0013\u05c9$^\u0019֧,\u0017,=D'3=\u001eY{h\u001fr&܃\u000fƄ.մ̈́`0ëV \u0006\u001f\b\u0016Tmb>-pf^Ns7h\u05cfFa\u0014vz.j\u000e\u001c+\u001a\u0003%bn\"#Ct\u000e۠h9=1/a\u0013`p\t\nKoB13b?IK`\"Ã,v\u0017\u0018\u0011Ŋvʷ.D\u0011r\u000e\t|?TVU\u001aU\\zݽf݁*QMЯZ\n23\u001c4\u007flF V\\H\u001d\u0012ǲ5¡\u001d\u0017\t́P\bu\u0007'Y;]a0B\u0001+\rcׇ{܊o:{قC7=\u0015\b\u001b\u0006m\u0012ç7؆Kھ۽\u0001dڧ\u0003OkV\u001d\u0002|UCS6y\u0004LVʬ!\u009d(\u0006}߿PQ?UB_\u000bL-؞Yǋ**>˔\u0015/U{\u0011s8<@ѥu\u008c_a<СK1'UV;=y\u0017P]j\n\u000br!s'ʁ\u0013\u0006/HE\u000ffބŝ/Izى\u007fnk@+s2?\tݚ8̹KFaآ\u001e/\u0018yq\u0011ݚmZg\u0013>ݘ);\u0003\u007f1X\u007fڤde"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU#k0,%ua \u0003x@9\u0001.KJb\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001e|h]G\u0017p,9\u0001.KJb\u0002", "7r7<e0S]\"\u000eve", "", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1q^@f\bQW'Z\u0002b.\u0006\u0011/n\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "1q^@f\bQW'Z\bk(\u0006\u000b/m\u007f1\u000b.\f\u0013\u0015Kx\u0010", "7sT:66N\\(", "", ";`g\u0019\\5>a", ";`g\u0016g,Fa|\bbZ0\u0006dBi\u000e", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u000195[J;\\(", "=uT?Y3Hev\t\u0003i6\u000b\u0005,l\u007f6", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "5dc\u0010b4I]'zwe,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001exqbC\\", "7mU<", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XYH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:IR$Q\n$?\u001d6uBbayOANqhU\fl,`86+iR\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p&G\u0010\u0002\"A\"R8~;\u0012\u0010=:r`Rk\u001aGfx\u001e;2\"\u000b\n\u001a#\u000fHJp\u007fp=!2\u001dk\u0010\u0019lC1bfosQ\u000e\u0003l\u001be>+f|K\\\u0016M\u0013P\u001c1Xe>o\u0004%\u0018p5mrJJ%fn)lS\"5w\b~w\u0014e>%A`XO.mF#y\u000frG\u0013\u007fb\r\u001a\u0002PYn[{Yfs.?\u0007Z*1<IKz\\L>e|:\u000b\u001a\u0006!|3G\u000b>\\).LYEk\\6TFS#\u0015w?+|7:\u0010aM~\\\u00071\"e\nu\u0003\u0015j\u0014{r", "5dc\u0010e6Lat\u0012~l\b\u0004\r1n\b(\u0005O", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w+PEyBy(lo\u0015\u000eg.W~'P[$", "\u0014", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0004/", "5dc\u0015b9Bh#\b\nZ3X\u0016<a\t*{H\u0001 &", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XYH", "u(I", "5dc#X9MW\u0017z\u0002:9\n\u00058g\u007f0{I\u0010", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u001dN\u00046KJJ32", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bLu", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(MB=\u007f\\\u000e~fg", "u(5", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(OB=\u007f\\\u000e~fg", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "1n_F \f\r?l\u0006y`", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XYH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:IR$Q\n$?\u001d6uBbayOANqhU\fl,`86+iR\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p&G\u0010\u0002\"A\"R8~;\u0012\u0010=:r`Rk\u001aGfx\u001e;2\"\u000b\n\u001a#\u000fHJp\u007fp=!2\u001dk\u0010\u0019lC1bfosQ\u000e\u0003l\u001be>+f|K\\\u0016M\u0013P\u001c1Xe>o\u0004%\u0018p5mrJJ%fn)lS\"5w\b~w\u0014e>%A`XO.mF#y\u000frG\u0013\u007fb\r\u001a\u0002PYn[{Yfs.?\u0007Z*1<IKz\\L>eY\u001b|\u0014}*}mA\r\u007f\u0011/-HcFb*0\u0015w\\!\u0015v<&(v8}fJ~mA\b\u001c\b P|\u0011kNE\u0002\u001a=^~\rFjO\u0003P0", "3pd._:", "=sW2e", "", "5dc\u001aX(Lc&~eh3\u0001\u0007C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.5C7yD+\u0015V_C\u0012c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "6`b566=S", "BnBAe0GU", "", ";dP@h9>", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bc\u0005aj\t\t\u001b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0013EV{*?x <M+;gB.\"hO7\u0011n,$[j.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b4r\u000e>\u001b\u001c6Y\u0011\u0005P\u0001\b$\u001eBj]Bd N\tj", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> getComposable;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final int itemCount;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final List<Function2<Composer, Integer, Unit>> overflowComposables;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List list, Function4 function4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, i4, flowLayoutOverflowState, list, function4);
    }

    private final FlowLayoutOverflowState component10() {
        return this.overflow;
    }

    private final List<Function2<Composer, Integer, Unit>> component11() {
        return this.overflowComposables;
    }

    private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> component12() {
        return this.getComposable;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m956component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m957component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.itemCount;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final int component9() {
        return this.maxItemsInMainAxis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-E4Q9ldg$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasureLazyPolicy m958copyE4Q9ldg$default(FlowMeasureLazyPolicy flowMeasureLazyPolicy, boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List list, Function4 function4, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 1)) != 0) {
            z2 = flowMeasureLazyPolicy.isHorizontal;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            horizontal = flowMeasureLazyPolicy.horizontalArrangement;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            vertical = flowMeasureLazyPolicy.verticalArrangement;
        }
        if ((8 & i5) != 0) {
            f2 = flowMeasureLazyPolicy.mainAxisSpacing;
        }
        if ((16 & i5) != 0) {
            crossAxisAlignment = flowMeasureLazyPolicy.crossAxisAlignment;
        }
        if ((32 & i5) != 0) {
            f3 = flowMeasureLazyPolicy.crossAxisArrangementSpacing;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 64)) != 0) {
            i2 = flowMeasureLazyPolicy.itemCount;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 128)) != 0) {
            i3 = flowMeasureLazyPolicy.maxLines;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 256)) != 0) {
            i4 = flowMeasureLazyPolicy.maxItemsInMainAxis;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 512)) != 0) {
            flowLayoutOverflowState = flowMeasureLazyPolicy.overflow;
        }
        if ((1024 & i5) != 0) {
            list = flowMeasureLazyPolicy.overflowComposables;
        }
        if ((i5 & 2048) != 0) {
            function4 = flowMeasureLazyPolicy.getComposable;
        }
        return flowMeasureLazyPolicy.m960copyE4Q9ldg(z2, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, i4, flowLayoutOverflowState, list, function4);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    /* JADX INFO: renamed from: copy-E4Q9ldg, reason: not valid java name */
    public final FlowMeasureLazyPolicy m960copyE4Q9ldg(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4) {
        return new FlowMeasureLazyPolicy(z2, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, i4, flowLayoutOverflowState, list, function4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) obj;
        return this.isHorizontal == flowMeasureLazyPolicy.isHorizontal && Intrinsics.areEqual(this.horizontalArrangement, flowMeasureLazyPolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalArrangement, flowMeasureLazyPolicy.verticalArrangement) && Dp.m6643equalsimpl0(this.mainAxisSpacing, flowMeasureLazyPolicy.mainAxisSpacing) && Intrinsics.areEqual(this.crossAxisAlignment, flowMeasureLazyPolicy.crossAxisAlignment) && Dp.m6643equalsimpl0(this.crossAxisArrangementSpacing, flowMeasureLazyPolicy.crossAxisArrangementSpacing) && this.itemCount == flowMeasureLazyPolicy.itemCount && this.maxLines == flowMeasureLazyPolicy.maxLines && this.maxItemsInMainAxis == flowMeasureLazyPolicy.maxItemsInMainAxis && Intrinsics.areEqual(this.overflow, flowMeasureLazyPolicy.overflow) && Intrinsics.areEqual(this.overflowComposables, flowMeasureLazyPolicy.overflowComposables) && Intrinsics.areEqual(this.getComposable, flowMeasureLazyPolicy.getComposable);
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.m6644hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m6644hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.itemCount)) * 31) + Integer.hashCode(this.maxLines)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + this.overflow.hashCode()) * 31) + this.overflowComposables.hashCode()) * 31) + this.getComposable.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasureLazyPolicy(isHorizontal=");
        sb.append(this.isHorizontal).append(", horizontalArrangement=").append(this.horizontalArrangement).append(", verticalArrangement=").append(this.verticalArrangement).append(", mainAxisSpacing=").append((Object) Dp.m6649toStringimpl(this.mainAxisSpacing)).append(", crossAxisAlignment=").append(this.crossAxisAlignment).append(", crossAxisArrangementSpacing=").append((Object) Dp.m6649toStringimpl(this.crossAxisArrangementSpacing)).append(", itemCount=").append(this.itemCount).append(", maxLines=").append(this.maxLines).append(", maxItemsInMainAxis=").append(this.maxItemsInMainAxis).append(", overflow=").append(this.overflow).append(", overflowComposables=").append(this.overflowComposables).append(", getComposable=");
        sb.append(this.getComposable).append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4) {
        this.isHorizontal = z2;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f2;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f3;
        this.itemCount = i2;
        this.maxLines = i3;
        this.maxItemsInMainAxis = i4;
        this.overflow = flowLayoutOverflowState;
        this.overflowComposables = list;
        this.getComposable = function4;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> getMeasurePolicy() {
        return new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy.getMeasurePolicy.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                return m961invoke0kLqBqw(subcomposeMeasureScope, constraints.m6597unboximpl());
            }

            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final MeasureResult m961invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
                return FlowMeasureLazyPolicy.this.m959measure0kLqBqw(subcomposeMeasureScope, j2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
    public final MeasureResult m959measure0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
        LayoutOrientation layoutOrientation;
        if (this.itemCount <= 0 || this.maxLines == 0 || this.maxItemsInMainAxis == 0 || (Constraints.m6590getMaxHeightimpl(j2) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(subcomposeMeasureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(this.itemCount, new Function2<Integer, FlowLineInfo, List<? extends Measurable>>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ List<? extends Measurable> invoke(Integer num, FlowLineInfo flowLineInfo) {
                return invoke(num.intValue(), flowLineInfo);
            }

            public final List<Measurable> invoke(final int i2, final FlowLineInfo flowLineInfo) {
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                Integer numValueOf = Integer.valueOf(i2);
                final FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
                return subcomposeMeasureScope2.subcompose(numValueOf, ComposableLambdaKt.composableLambdaInstance(-195060736, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i3) {
                        ComposerKt.sourceInformation(composer, "C452@17604L26:ContextualFlowLayout.kt#2w3rfo");
                        if ((i3 & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-195060736, i3, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:452)");
                        }
                        flowMeasureLazyPolicy.getComposable.invoke(Integer.valueOf(i2), flowLineInfo, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        });
        this.overflow.setItemCount$foundation_layout_release(this.itemCount);
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
        this.overflow.m949setOverflowMeasurablesVKLhPVY$foundation_layout_release(flowMeasureLazyPolicy, j2, new Function2<Boolean, Integer, Measurable>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Measurable invoke(Boolean bool, Integer num) {
                return invoke(bool.booleanValue(), num.intValue());
            }

            public final Measurable invoke(boolean z2, int i2) {
                Function2<? super Composer, ? super Integer, Unit> function2 = (Function2) CollectionsKt.getOrNull(this.this$0.overflowComposables, !z2 ? 1 : 0);
                if (function2 == null) {
                    return null;
                }
                return (Measurable) CollectionsKt.getOrNull(subcomposeMeasureScope.subcompose(new StringBuilder().append(z2).append(this.this$0.itemCount).append(i2).toString(), function2), 0);
            }
        });
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        ContextualFlowItemIterator contextualFlowItemIterator2 = contextualFlowItemIterator;
        float f2 = this.mainAxisSpacing;
        float f3 = this.crossAxisArrangementSpacing;
        if (isHorizontal()) {
            layoutOrientation = LayoutOrientation.Horizontal;
        } else {
            layoutOrientation = LayoutOrientation.Vertical;
        }
        return FlowLayoutKt.m943breakDownItemsdi9J0FM(subcomposeMeasureScope2, flowMeasureLazyPolicy, contextualFlowItemIterator2, f2, f3, OrientationIndependentConstraints.m987constructorimpl(j2, layoutOrientation), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }
}
