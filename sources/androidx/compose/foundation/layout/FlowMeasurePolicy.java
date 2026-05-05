package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĉ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.P\b*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*%k\u0004é,[:qK;[\u001a\u0006\"\u0017UVgmnRZ!C\u0017\u0006\u001c~r,_U\u0001](\u000f:B\u0006?;MuVA`\u0003Ȃ\r 8#@y\u0013\u001f\"*N\u0016~zQW\u0014۵8@\u0007:Z\rS\u0006\"\u0012\u001c>(\u00014\\oNLHtҗB/9\u0003qBT*eܡ\u0003cεvTU\f'aL+\u0001\u0003E\u00193T\u001b\u0007\u0001]O\u0007MtU\u0005\u0017+7/Wxo6\u0007\u0006$\u00199V%]!.l\t_i$'YYsO^\u0019@w)\u0004\u001d@\u0012\u001a\u001e'v;=\u001et\u0016&3#\u007fcD^\u0011vB.\u000bˋ:\u00173\u0011{2GA~Q\u0010=_ؒ8D\f\u001bE;\u0001\u001d%\"ڱ\u000f)\u001c)|\u0010Q_W\u0007؇I\u0017\u001egf\u0006\u0004\u001fjHĒ\u0005ϻF~ôz߾ѧ\u001b'=\u0006GNir\u0010t\\g%\u000f'ĬT2fVm:nD?pá\r˧Cc̆j¬Ԝ\\.\u0017{*\u007fO\u0005\u0016B8\\&Igٺ\u0011\u0017Vv\u001a\u0003M\f\u0017kćg\u007f`|\u001d&Wgny͓R,{o\u0005\u000f\u0014mֺ\u0013\u000b^fPT$Z\u000b*R8Nj\u001ez\u0014D|\u0010C8Eq*9D1GbEN\t\u001ePH\u0015\t\u000eb\u0019\u0016\u0005TA-\u001biR~9\u0007V\\~z\u007fxw4-f(-O]M\u0019TbRn:|1\u0015\u0017s.T\u0018RMLz%\u000eU*0\\פ8ؐ.ˋт\u0013\u0001/e\u0010a\u000e]\u0001\u001biM@)+\u0003\bESjDf6\"7ޱa3Q]\r/\"%k9ؓ\u0007-B\b\u001b^zup\u0005\u0015ixax\u0013[LNf\u00173ZN)\u000f,:|c:s++\u001d\u0010\u0014]\"\u0012aw-Fy\u0011\u001cVxs\u0010DcD|\u0013Uk@S8wf/B03\u0005\u0003pX3\u001a\u0016\u0001!4;@xKr+n>]\r?}\u0015!ZH!Ziy+o,A^c84[}Bk\fg\u001f\u000fkg\u001cz{f\u0019\u0005'\u0010\u001b}An@6k[\u0007[pKH\u0006\"%fEIi\u001d<71d0JE#C\u0003v6\u0014\t\f^_=$bF\u0002In\u000e\u0003\u0006\rZV\u0014xE\u000f1r\b\rRK\u001e'ywݡl\u000fz=)J\u0001\u0002*1\u001b\u0019\u0016/v3e\\`I#8^\u0011\rU]qc0q2\u0003Yqy7$8F\ncV`AG\u001a)_%=\u0007\u000b\u0004+~t\u0005L~^^*9\u0005\u000b~\u001e<8)9T}. f;\ffweP`\u0015_t7P$|\u0012\u0011C-4\u0001]MW%,3\f_cA\u000e\n0 UP#\\\u000b\u0013>j\u0018+3:D@\\vר\bސц$\u00064\u001a\u0003CRT\u0016\bg\u0002a\u000f;^\b2(1NaCx\u0016J[n\t\fsl\u0012\t\u0004F1\"aZ\b6EPK\u0016mav9f-R\u0011\u0002-\u0001\u0011.ZE6-p n9\u0018_ixr{O\n'Yj\u001ae\u00125>\u00126}M\u0007<\u0018zf6\u001eSV{H;Ԏ^\u05cfF]\u0016ߜ\u0003*j\u0007\u001a<d\u0011\rSv\u0011A<\u001dݴ Ԅ.Юژ\u001eZǏKb\u000f\u0004S]v3?UW\u001be6a·*϶\u0015\tBŇ\r\u00020W\u0017\tPy:.^Tk\u001c}ک&މh\t.ɔ]:H\t:(^%=aP ldpˤ=ɔ2߿͋\u0010\u007fͤ<\bw\u0007'I;}a=B\u001e\r\u0003\u001d?(K{<\u00047!0?\u0011\u007f\u001b\u0006sK'Eez4:\u001bʩN~S~ȡ\u0013g4ݹMG$\u0016c]P\u0016-0<\u0006$0Vӝ3؝._dǾ'\u007fe\u0012>*d{\u001bïIـ|s\u0012\u07bf:D\u0002\u0003s~DC\u000b\u0014G^N,=l5R]j\n\u000br\u001aU\u0016G\u000f46a0ϧ\u0014Ow[\u0557MxUҍt_B2\u0002!\u000b^oV\u0012dP[:\u0006[,dezj\u001c^o\u0012H\u0012;\u001a\u0014yAR\u000f\r\u000f6Ȥ+K|aր`~Uکz\rF02{~n\u001a-\u001e3>J'\u0002,dp\u0017#3u\u0001QI\"V*.-\u0013k%42\u0016\u0004ߒCUwsؐ=9\u0013ǋbZ;\tj\"&-YsC\u0015.z\u0002ɼIݭB\u001a2ӅV Si`\u0010r~\u001bځoԊ46XڄrEc%*D\u07baU\u001em\u00028ıS\nc\u0019+=vׂV)"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU#k0,%ua$\u0011j0L\u000b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^5<h\u0002}Av%.VR#k0,%ua$\u0011j0L\u000b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001e|h]G\u0017p,9\u0001.KJb\u0002", "7r7<e0S]\"\u000eve", "", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1q^@f\bQW'Z\u0002b.\u0006\u0011/n\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s;WQIGG\"#Dh=\tl4N\u007f6\u001d", "1q^@f\bQW'Z\bk(\u0006\u000b/m\u007f1\u000b.\f\u0013\u0015Kx\u0010", ";`g\u0016g,Fa|\bbZ0\u0006dBi\u000e", "", ";`g\u0019\\5>a", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u000195[J;\\(", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XYH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:IR$Q\n$?\u001d6uBbayOANqhU\fl,`86+iR\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p&G\u0010\u0002\"A\"R8~;\u0012\u0010=:r`Rk\u001aGfx\u001e;2\"\u000b\n\u001d8\u001c>XmykQWf)i\u0013\u0018p5z\u001aoulG\u000b\u0016a!d~h[\u0015Ab\u0015\b*v\u001f9-zVe\n$r\u0018$zfPM-B\u0010\u0016\u007fDwF\u0017\r\u0012m\u001c%w\u001bNaXl3n7Z\u001c\u0005o\u0002j{Z?%wWmwT\u0001jd\u007f\"E\u0003\u001e1\u001d@Q<\u0004(\u0007`", "5dc\u0010e6Lat\u0012~l\b\u0004\r1n\b(\u0005O", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w+PEyBy(lo\u0015\u000eg.W~'P[$", "\u0014", "5dc\u0015b9Bh#\b\nZ3X\u0016<a\t*{H\u0001 &", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XYH", "u(I", ";`g\u0010e6Lat\u0012~l\u0010\u0006\u0018<i\t6\u007f>d&\u0017O]\u0012Qv", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001aT?\u001c`#\r\t:?\u0001\u0017\u0013n\u000f5\u007fI\u000f\u001b\u0015+~\u000eDd)JY", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKu", ";`g\u001aT0G/,\u0003\tB5\f\u00163n\u000e,y$\u0010\u0017\u001f5s#<", "5dc\u001aT?&O\u001d\bVq0\u000bl8t\r,\u0005N\u0005\u0015zVo\u0016*z:5", ";h]\u0010e6Lat\u0012~l\u0010\u0006\u0018<i\t6\u007f>d&\u0017O]\u0012Qv", "5dc\u001a\\5\u001c`#\r\t:?\u0001\u0017\u0013n\u000f5\u007fI\u000f\u001b\u0015+~\u000eDd)JY", ";h]\u001aT0G/,\u0003\tB5\f\u00163n\u000e,y$\u0010\u0017\u001f5s#<", "5dc\u001a\\5&O\u001d\bVq0\u000bl8t\r,\u0005N\u0005\u0015zVo\u0016*z:5", "5dc#X9MW\u0017z\u0002:9\n\u00058g\u007f0{I\u0010", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u001dN\u00046KJJ32", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(MB=\u007f\\\u000e~fg", "u(5", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(OB=\u007f\\\u000e~fg", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "1n_F \u0018Ngv]\u000fJ", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XYH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:IR$Q\n$?\u001d6uBbayOANqhU\fl,`86+iR\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p&G\u0010\u0002\"A\"R8~;\u0012\u0010=:r`Rk\u001aGfx\u001e;2\"\u000b\n\u001d8\u001c>XmykQWf)i\u0013\u0018p5z\u001aoulG\u000b\u0016a!d~h[\u0015Ab\u0015\b*v\u001f9-zVe\n$r\u0018$zfPM-B\u0010\u0016\u007fDw#w~\fe%&2\u0015P#\rr2jA[\u0013RiB\u001c\u0005X?$tR\u00197Rnoa\u007f3\u007fY\u0018S3\u001bK8\u0005bPoz ;\u0005\t\u0013r", "3pd._:", "=sW2e", "", "6`b566=S", "7mc?\\5LW\u0017\\\bh:\u000bdBi\u000e\u0016\u007fU\u0001", ";dP@h9:P ~\t", "", ";`X;4?Bat\u0010vb3x\u00066e", "1q^@f\bQW'l\u0006Z*\u0001\u00121", ";`g\u0016a;KW\"\r~\\\u0014x\r8A\u0013,\n.\u0005,\u0017", "6dX4[;", "/qa.a.>[\u0019\b\nL7x\u00073n\u0002", ";h]\u0016a;KW\"\r~\\\u0014x\r8A\u0013,\n.\u0005,\u0017", "1q^@f\bQW'Z\fZ0\u0004\u0005,l\u007f", "BnBAe0GU", "", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final float mainAxisSpacing;
    private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;
    private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;
    private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;
    private final FlowLayoutOverflowState overflow;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, flowLayoutOverflowState);
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m962component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m963component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.maxItemsInMainAxis;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final FlowLayoutOverflowState component9() {
        return this.overflow;
    }

    /* JADX INFO: renamed from: copy-QuyCDyQ$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasurePolicy m964copyQuyCDyQ$default(FlowMeasurePolicy flowMeasurePolicy, boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            z2 = flowMeasurePolicy.isHorizontal;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            horizontal = flowMeasurePolicy.horizontalArrangement;
        }
        if ((i4 + 4) - (4 | i4) != 0) {
            vertical = flowMeasurePolicy.verticalArrangement;
        }
        if ((8 & i4) != 0) {
            f2 = flowMeasurePolicy.mainAxisSpacing;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            crossAxisAlignment = flowMeasurePolicy.crossAxisAlignment;
        }
        if ((32 & i4) != 0) {
            f3 = flowMeasurePolicy.crossAxisArrangementSpacing;
        }
        if ((64 & i4) != 0) {
            i2 = flowMeasurePolicy.maxItemsInMainAxis;
        }
        if ((i4 + 128) - (128 | i4) != 0) {
            i3 = flowMeasurePolicy.maxLines;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
            flowLayoutOverflowState = flowMeasurePolicy.overflow;
        }
        return flowMeasurePolicy.m965copyQuyCDyQ(z2, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, flowLayoutOverflowState);
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

    /* JADX INFO: renamed from: copy-QuyCDyQ, reason: not valid java name */
    public final FlowMeasurePolicy m965copyQuyCDyQ(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        return new FlowMeasurePolicy(z2, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, flowLayoutOverflowState, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && Intrinsics.areEqual(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && Dp.m6643equalsimpl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && Intrinsics.areEqual(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && Dp.m6643equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && Intrinsics.areEqual(this.overflow, flowMeasurePolicy.overflow);
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.m6644hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m6644hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) Dp.m6649toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) Dp.m6649toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    private FlowMeasurePolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z2;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f2;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f3;
        this.maxItemsInMainAxis = i2;
        this.maxLines = i3;
        this.overflow = flowLayoutOverflowState;
        this.maxMainAxisIntrinsicItemSize = isHorizontal() ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4, int i5) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i5));
            }
        } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4, int i5) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i5));
            }
        };
        this.maxCrossAxisIntrinsicItemSize = isHorizontal() ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4, int i5) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i5));
            }
        } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4, int i5) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i5));
            }
        };
        this.minCrossAxisIntrinsicItemSize = isHorizontal() ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4, int i5) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i5));
            }
        } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4, int i5) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i5));
            }
        };
        this.minMainAxisIntrinsicItemSize = isHorizontal() ? new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4, int i5) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i5));
            }
        } : new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i4, int i5) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i5));
            }
        };
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

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo966measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        LayoutOrientation layoutOrientation;
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (Constraints.m6590getMaxHeightimpl(j2) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
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
        List list2 = (List) CollectionsKt.first((List) list);
        if (list2.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$2
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
        List list3 = (List) CollectionsKt.getOrNull(list, 1);
        Measurable measurable = list3 != null ? (Measurable) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.getOrNull(list, 2);
        Measurable measurable2 = list4 != null ? (Measurable) CollectionsKt.firstOrNull(list4) : null;
        this.overflow.setItemCount$foundation_layout_release(list2.size());
        FlowMeasurePolicy flowMeasurePolicy = this;
        this.overflow.m947setOverflowMeasurableshBUhpc$foundation_layout_release(flowMeasurePolicy, measurable, measurable2, j2);
        Iterator it = list2.iterator();
        float f2 = this.mainAxisSpacing;
        float f3 = this.crossAxisArrangementSpacing;
        if (isHorizontal()) {
            layoutOrientation = LayoutOrientation.Horizontal;
        } else {
            layoutOrientation = LayoutOrientation.Vertical;
        }
        return FlowLayoutKt.m943breakDownItemsdi9J0FM(measureScope, flowMeasurePolicy, it, f2, f3, OrientationIndependentConstraints.m987constructorimpl(j2, layoutOrientation), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m948setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return minIntrinsicMainAxisSize(listEmptyList, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo704roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return intrinsicCrossAxisSize(listEmptyList2, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo704roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m948setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return intrinsicCrossAxisSize(listEmptyList, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo704roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return minIntrinsicMainAxisSize(listEmptyList2, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo704roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m948setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return intrinsicCrossAxisSize(listEmptyList, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo704roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return maxIntrinsicMainAxisSize(listEmptyList2, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.mainAxisSpacing));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m948setOverflowMeasurableshBUhpc$foundation_layout_release(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        if (isHorizontal()) {
            List<? extends IntrinsicMeasurable> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return maxIntrinsicMainAxisSize(listEmptyList, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.mainAxisSpacing));
        }
        List<? extends IntrinsicMeasurable> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return intrinsicCrossAxisSize(listEmptyList2, i2, intrinsicMeasureScope.mo704roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo704roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        return FlowLayoutKt.minIntrinsicMainAxisSize(list, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i2, i3, i4, i5, i6, flowLayoutOverflowState);
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i2, int i3) {
        return FlowLayoutKt.maxIntrinsicMainAxisSize(list, this.maxMainAxisIntrinsicItemSize, i2, i3, this.maxItemsInMainAxis);
    }

    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        return IntIntPair.m365getFirstimpl(FlowLayoutKt.intrinsicCrossAxisSize((List<? extends IntrinsicMeasurable>) list, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minMainAxisIntrinsicItemSize, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minCrossAxisIntrinsicItemSize, i2, i3, i4, i5, i6, flowLayoutOverflowState));
    }

    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
        return this.maxMainAxisIntrinsicItemSize;
    }

    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
        return this.maxCrossAxisIntrinsicItemSize;
    }

    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
        return this.minCrossAxisIntrinsicItemSize;
    }

    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
        return this.minMainAxisIntrinsicItemSize;
    }
}
