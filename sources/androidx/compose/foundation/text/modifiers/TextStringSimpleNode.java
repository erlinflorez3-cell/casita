package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: TextStringSimpleNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яı\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ffxE8ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u0017XVʴonX`\u0013C\u0015\u0006\u001ex\u0001,QU~]\u001a\u000fHBwЀ;M}`A`\u000b6\r 8'@y\u001b\u0001\"*V/~zYK\u0014۵8@\u0007:Z҈U\u0005(\u0012\u000e>&\u0004&\\}N>HreB/9\u0003qĩV'u0\u0005ձ\u0015Fj'\u0015Ǹi\u001eA@?5\u001b'[\u0003\u001dRc?\u0019?y=\u001bh/ݐ3I\nW>X\u0006\u0018\u001bۀeՕ\u000erT[5Q\u000f\fW+}d{P<*0yFM\f\u0014\u0012\u0014*`.[\u001ev\f\u001c8\rr\u0002F`\u0006lI\u0018z\u0010>'+\u000639B3f\u007fkK\u001fT7\n\u0010%\u001eQ\r~'aT\u001cm-\u001b\u0003\u0006a7W@KWf\n\bK}\fvb\u0010:\u001c2]~]\r 2\u00173I$?1E\u0004\u0002vi.vM|vy\u0002RveRr$^B\t:fth\u0013\u0014hT\u00078AQ*}\u001f}6\u001fhj\u0006W9%>b\u007flw\u0015e]8Puf\u007f_|\u0018&Wg\u0004y5\u001aq\u001e\u000fjvBKlf\u0013\u0007~B\u0002\u0010!\\p8@w\u0003\u0010&\btT\u001aCJA\b\u001bb=a\u001dj\u001a`\u0003LH\n;\u0017\u0011rh>\u000b\u000572\b\u0002$#\u000f1Tj\u007f\bg'W\\\u0001n/EA\u007fCI*c-\u00014+/7\u0003\u0002\u0007_gzO|p$~m{N ؖ8֗ȠA\u0015\u001517eJ9S\u0001\u000be\u007fYB+\t\u007f\u0012\u000filvq\u0016 \t,\u000f\u0010rO\u0003Mh\u000b'|1?|\u007f(\u0007nzu\u001c\u001b\u001f$XW,\u001bYj\\`|3YN)\u000f+:|cis++S\u0010\u0014]#(q2\n<8z\u000fT\u0003\u000e\u0004Z\u001eFsp\ru2ity]\r}:$\u001b\u0011\t\\3\u001c\u0016\u0003!4;tpA\u00133\u0007<[FG}\u0015J\\\u0011~\u001bs:A5DH̖^͈ϵG\u007f\u001a%QlYga0\u0006myj3J=D;\u007f?**\u001ck\\\u0007[pFH\u0006\"&|U\u0004|\u0013\u0006!$b:d\b9}\u0005m\u0014K\u0013\u007ft\u001c?\u001b@\u0002\f;\u0005\u001c\u001b\r-dV\u0018xGv X\u0015U۳?\u038b|59܊>fbD{@\u0011U-\tI\u0002_\u0001v%YRj8I>/ۡ\u0017\u0558aIQ\u0379F\u0006MA{\u0005@\u0018F\u001f\u0015\u001dp qʆ]μcv8͜[grh|v@z\t\u000fxę\u0001Ҷ\u0001\u0012T\f\u0015&'kC{p:dN&E\u001aב\rӢH)\u000fљMoT*E\u0006c;\u0014ƙv͂+{_ė\f\u0012\u0016)8'2~wƻc̣eŊݺ\u001a9Ϧu\u0018j\u0002\u00170!.\u0012>bv\t\t\\\u0019\rС\u000eג\u0006\u0013f̏<\u0018/^??|\u000eRQxz\u001ac\u001b\u0005\u001du\u001b\u0005v1\u0005\u0006\u0005,~<_\u07b3Yܻ\u0017Xbϐa_.c)\u007fB!|̂Bʭf)\u0018˖4t~pg[;1\u0006շ6Հ50ZʴN+\bx\u001c*\u0003,k͊b؉Bd\u0011Ϟ=Pe0vl>c#/\u007fذ\t۫L^\u0019ӂ̍F{&g5ѐ5MZ\u0015Gf&ˀI\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHtr9R\u007f)5PV7cR[G\u0013\u00120", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{<~!>h\u0002\u001eEU -QD?kA\u0007\u001fga\u000f", "BdgA", "", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", "=uT?e0=Sv\t\u0002h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016Q;b}'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001.\b?XK<r\n\u001b_n?s\u007f#R\u0018K\u0001)4.)vP`pyT\u0017)W\u000eHr[&[GD(\u0013\u0005b\u0019rX9\u0014\nSZ\u0003VCitC$}<\"L79PLyb'\u00021\u001e[yw\u001f\b?z5\u00044\b=s;u\r\u0015k!M^\u0006\u001e(c\u000b\u0006&78#FZA\u007fuL\u001du/_\u0017\u0018o\u001d-&kep\u001eRw", "-kPFb<M1\u0015|}^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u007fdn5\tp(Yy\u000eC`X<k0n;\u0017\u00120", "0`b2_0GSvzxa,", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "5dc\u000fT:>Z\u001d\bz<(z\f/${1\u0005J\u0010\u0013&Ky\u0017J", "u(E", ":`h<h;\u001cO\u0017\u0002z", "5dc\u0019T@Hc(\\v\\/|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001e8LG<o4+#2L5\u0014_.[r2J3J@fb\u0002\u001b\u0010\u0010]\u000e$", "\u0017", "Ad\\.a;BQ'mzq;c\u0005Co\u00107h@\u000f'\u001eV", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "BdgAF<;a(\u0003\nn;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHtr9R\u007f)5PV7cR[G\u0013\u0012\u0019|N>\u001cri>2}HF/\u00170S\u000b,d\b\u001c\u0016c", "1kT.e\u001aNP'\u000e~m<\f\r9n", "", "2n8;i(EW\u0018z\nb6\u0006\u0017", "2qPD6/:\\\u001b~y", "BdgA6/:\\\u001b~y", ":`h<h;\u001cV\u0015\b|^+", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "7me._0=O(~[h9k\u0016+n\u000e/wO\u0001", "Adc h)Lb\u001d\u000e\u000bm0\u0007\u0012", "CoS.g,=B\u0019\u0012\n", "CoS.g,\u001d`\u0015\u0011", "1n[<e", "CoS.g,%O-\t\u000bm\u0019|\u0010+t\u007f'WM\u0003%", "CoS.g,%O-\t\u000bm\u0019|\u0010+t\u007f'WM\u0003%^*\u007fi9\n\t\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8DG\r4>mk\u001218\"g=\u001d\"re8\u001a-*X~2QZNulV<L\u0014%iWO5\u0016\u0014#\".wS\u0018\u001b\u00100P\u0016yU\u0001\u001a \u0015Fj}\u0018:S<", "CoS.g,-S,\u000e", "/o_9l\u001a>[\u0015\b\nb*\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "\"dgAF<;a(\u0003\nn;\u0001\u00138V{/\f@", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private ParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;
    private ColorProducer overrideColor;
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private String text;
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i2, z2, i3, i4, colorProducer);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i5 & 8) != 0 ? TextOverflow.Companion.m6576getClipgIe3tQ8() : i2, (i5 + 16) - (i5 | 16) != 0 ? true : z2, (i5 & 32) != 0 ? Integer.MAX_VALUE : i3, (-1) - (((-1) - i5) | ((-1) - 64)) == 0 ? i4 : 1, (-1) - (((-1) - i5) | ((-1) - 128)) != 0 ? null : colorProducer, null);
    }

    private TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i4;
        this.overrideColor = colorProducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new ParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        Intrinsics.checkNotNull(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    private final ParagraphLayoutCache getLayoutCache(Density density) {
        ParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.isShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        ParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle textStyle) {
        boolean zAreEqual = Intrinsics.areEqual(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (zAreEqual && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    public final boolean updateText(String str) {
        if (Intrinsics.areEqual(this.text, str)) {
            return false;
        }
        this.text = str;
        clearSubstitution();
        return true;
    }

    /* JADX INFO: renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m1660updateLayoutRelatedArgsHuAbxIM(TextStyle textStyle, int i2, int i3, boolean z2, FontFamily.Resolver resolver, int i4) {
        boolean z3 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (this.minLines != i2) {
            this.minLines = i2;
            z3 = true;
        }
        if (this.maxLines != i3) {
            this.maxLines = i3;
            z3 = true;
        }
        if (this.softWrap != z2) {
            this.softWrap = z2;
            z3 = true;
        }
        if (!Intrinsics.areEqual(this.fontFamilyResolver, resolver)) {
            this.fontFamilyResolver = resolver;
            z3 = true;
        }
        if (TextOverflow.m6569equalsimpl0(this.overflow, i4)) {
            return z3;
        }
        this.overflow = i4;
        return true;
    }

    public final void doInvalidations(boolean z2, boolean z3, boolean z4) {
        if (z3 || z4) {
            getLayoutCache().m1653updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (isAttached()) {
            if (z3 || (z2 && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z3 || z4) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (z2) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    /* JADX INFO: compiled from: TextStringSimpleNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u001b\u007fјnjO0LeNAZS8\u0015s{:$aҝwYП\u0006\u001a,!Ix^kunbZ9D\u001f\n$z\u0003,wV\tc\u0018\u000f@E\b?aQ\u007fE?`\u0003;\u001d\"H!f\u007fڱ\u0005\u001a8OX}\tWc\f@1\u0007È;\u001b\u0014[\u001a2\u00124?fӼ\u001f%n\\L`l\f>uޑ\u00042K\\>w2\u0013L;L\u001bݒ\u000e?\u0013,CX7cՖUY\t\u0007`[W\u0003mrm\u000bn'5-as\u00067\t\u0006\u001a\u00159R%]!*\r\rW`\u001a,CQyJ~\u0014nĂyD\u001eJ\u001d&\u0006UL^3(\u0001 \u0010Is!R\u0007ѧ\u0003'I\u000e\u0016y6EAFŨ*\u0002!tny;GO}\u0010U%,&\u0019nO_+לlڠ\u001f`\u007f\u0383ISF@VV*[Cv\u0012z3\u001c8\tHI\u0016.*\u0017\u0005ϖ1ھ_E+ܩ\u0004\u0004NOu\u0003%bn`w`\u0019O0n.7X\nɔ^Jlʍ\u0004RZg:!\u001e4b\t\u0016\bA!3ʃHƼ)\u001cVи\u0001kp^k\u001aE1lIg\u0002±\u0012u"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHtr9R\u007f)5PV7cR[G\u0013\u0012\u0019|N>\u001cri>2}HF/\u00170S\u000b,d\b\u001c\u0016c", "", "=qX4\\5:Z", "", "AtQ@g0Mc(\u0003\u0005g", "7rB5b>B\\\u001bl\u000b[:\f\r>u\u000f,\u0006I", "", ":`h<h;\u001cO\u0017\u0002z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u007fdn5\tp(Yy\u000eC`X<k0n;\u0017\u00120", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u0018:\r\u0018h\u000b,xC; \f,V\u0010\u0005S|\u0019\u0012\u0010Bf{E=\f[\u0004%\u0005\u001f%fIY5=8", "u(I", "Adc [6PW\"\u0001hn)\u000b\u00183t\u00107\u007fJ\n", "uY\u0018#", "5dc\u0019T@Hc(\\v\\/|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001e8LG<o4+#2L5\u0014_.[r2J3J@fb\u0002\u001b\u0010\u0010]\u000e$", "Adc\u0019T@Hc(\\v\\/|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001u -QD?kA,^S]F\u0003e9J\u0002*.Hb6laP9\u0012\u0015Zc\u0012\u001c", "5dc\u001ce0@W\"z\u0002", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc h)Lb\u001d\u000e\u000bm0\u0007\u0012", "Adc h)Lb\u001d\u000e\u000bm0\u0007\u0012", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;
        private ParagraphLayoutCache layoutCache;
        private final String original;
        private String substitution;

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, String str, String str2, boolean z2, ParagraphLayoutCache paragraphLayoutCache, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = textSubstitutionValue.original;
            }
            if ((2 & i2) != 0) {
                str2 = textSubstitutionValue.substitution;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                z2 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                paragraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(str, str2, z2, paragraphLayoutCache);
        }

        public final String component1() {
            return this.original;
        }

        public final String component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final ParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(String str, String str2, boolean z2, ParagraphLayoutCache paragraphLayoutCache) {
            return new TextSubstitutionValue(str, str2, z2, paragraphLayoutCache);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return Intrinsics.areEqual(this.original, textSubstitutionValue.original) && Intrinsics.areEqual(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && Intrinsics.areEqual(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return iHashCode + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public TextSubstitutionValue(String str, String str2, boolean z2, ParagraphLayoutCache paragraphLayoutCache) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z2;
            this.layoutCache = paragraphLayoutCache;
        }

        public /* synthetic */ TextSubstitutionValue(String str, String str2, boolean z2, ParagraphLayoutCache paragraphLayoutCache, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 + 4) - (4 | i2) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : paragraphLayoutCache);
        }

        public final String getOriginal() {
            return this.original;
        }

        public final String getSubstitution() {
            return this.substitution;
        }

        public final void setSubstitution(String str) {
            this.substitution = str;
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setShowingSubstitution(boolean z2) {
            this.isShowingSubstitution = z2;
        }

        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final void setLayoutCache(ParagraphLayoutCache paragraphLayoutCache) {
            this.layoutCache = paragraphLayoutCache;
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(String str) {
        Unit unit;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (Intrinsics.areEqual(str, textSubstitutionValue.getSubstitution())) {
                return false;
            }
            textSubstitutionValue.setSubstitution(str);
            ParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
            if (layoutCache != null) {
                layoutCache.m1653updateL6sJoHM(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            return unit != null;
        }
        TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, str, false, null, 12, null);
        ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        paragraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
        textSubstitutionValue2.setLayoutCache(paragraphLayoutCache);
        this.textSubstitution = textSubstitutionValue2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSubstitution() {
        this.textSubstitution = null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Function1<? super List<TextLayoutResult>, Boolean> function1 = this.semanticsTextLayoutResult;
        if (function1 == null) {
            function1 = new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(List<TextLayoutResult> list) {
                    ParagraphLayoutCache layoutCache = TextStringSimpleNode.this.getLayoutCache();
                    TextStyle textStyle = TextStringSimpleNode.this.style;
                    ColorProducer colorProducer = TextStringSimpleNode.this.overrideColor;
                    TextLayoutResult textLayoutResultSlowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull(TextStyle.m6143mergedA7vx0o$default(textStyle, colorProducer != null ? colorProducer.mo2078invoke0d7_KjU() : Color.Companion.m4214getUnspecified0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777214, null));
                    if (textLayoutResultSlowCreateTextLayoutResultOrNull != null) {
                        list.add(textLayoutResultSlowCreateTextLayoutResultOrNull);
                    } else {
                        textLayoutResultSlowCreateTextLayoutResultOrNull = null;
                    }
                    return Boolean.valueOf(textLayoutResultSlowCreateTextLayoutResultOrNull != null);
                }
            };
            this.semanticsTextLayoutResult = function1;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text, null, null, 6, null));
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, new AnnotatedString(textSubstitutionValue.getSubstitution(), null, null, 6, null));
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextStringSimpleNode.this.setSubstitution(annotatedString.getText());
                TextStringSimpleNode.this.invalidateForTranslate();
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new Function1<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final Boolean invoke(boolean z2) {
                if (TextStringSimpleNode.this.textSubstitution != null) {
                    TextSubstitutionValue textSubstitutionValue2 = TextStringSimpleNode.this.textSubstitution;
                    if (textSubstitutionValue2 != null) {
                        textSubstitutionValue2.setShowingSubstitution(z2);
                    }
                    TextStringSimpleNode.this.invalidateForTranslate();
                    return true;
                }
                return false;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.applySemantics.4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextStringSimpleNode.this.clearSubstitution();
                TextStringSimpleNode.this.invalidateForTranslate();
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, function1, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        ParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean zM1651layoutWithConstraintsK40F9xA = layoutCache.m1651layoutWithConstraintsK40F9xA(j2, measureScope.getLayoutDirection());
        layoutCache.getObserveFontChanges$foundation_release();
        Paragraph paragraph$foundation_release = layoutCache.getParagraph$foundation_release();
        Intrinsics.checkNotNull(paragraph$foundation_release);
        long jM1650getLayoutSizeYbymL2g$foundation_release = layoutCache.m1650getLayoutSizeYbymL2g$foundation_release();
        if (zM1651layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            LinkedHashMap linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(paragraph$foundation_release.getFirstBaseline())));
            linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(paragraph$foundation_release.getLastBaseline())));
            this.baselineCache = linkedHashMap;
        }
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.Companion.m6600fitPrioritizingWidthZbe2FdA(IntSize.m6808getWidthimpl(jM1650getLayoutSizeYbymL2g$foundation_release), IntSize.m6808getWidthimpl(jM1650getLayoutSizeYbymL2g$foundation_release), IntSize.m6807getHeightimpl(jM1650getLayoutSizeYbymL2g$foundation_release), IntSize.m6807getHeightimpl(jM1650getLayoutSizeYbymL2g$foundation_release)));
        int iM6808getWidthimpl = IntSize.m6808getWidthimpl(jM1650getLayoutSizeYbymL2g$foundation_release);
        int iM6807getHeightimpl = IntSize.m6807getHeightimpl(jM1650getLayoutSizeYbymL2g$foundation_release);
        Map<AlignmentLine, Integer> map = this.baselineCache;
        Intrinsics.checkNotNull(map);
        return measureScope.layout(iM6808getWidthimpl, iM6807getHeightimpl, map, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (isAttached()) {
            ParagraphLayoutCache layoutCache = getLayoutCache(contentDrawScope);
            Paragraph paragraph$foundation_release = layoutCache.getParagraph$foundation_release();
            if (paragraph$foundation_release == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')').toString());
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean didOverflow$foundation_release = layoutCache.getDidOverflow$foundation_release();
            if (didOverflow$foundation_release) {
                float fM6808getWidthimpl = IntSize.m6808getWidthimpl(layoutCache.m1650getLayoutSizeYbymL2g$foundation_release());
                float fM6807getHeightimpl = IntSize.m6807getHeightimpl(layoutCache.m1650getLayoutSizeYbymL2g$foundation_release());
                canvas.save();
                Canvas.m4150clipRectN_I0leg$default(canvas, 0.0f, 0.0f, fM6808getWidthimpl, fM6807getHeightimpl, 0, 16, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Fill drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    Paragraph.m5998painthn5TExg$default(paragraph$foundation_release, canvas, brush, this.style.getAlpha(), shadow, textDecoration, drawStyle, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long jMo2078invoke0d7_KjU = colorProducer != null ? colorProducer.mo2078invoke0d7_KjU() : Color.Companion.m4214getUnspecified0d7_KjU();
                    if (jMo2078invoke0d7_KjU == 16) {
                        if (this.style.m6153getColor0d7_KjU() != 16) {
                            jMo2078invoke0d7_KjU = this.style.m6153getColor0d7_KjU();
                        } else {
                            jMo2078invoke0d7_KjU = Color.Companion.m4204getBlack0d7_KjU();
                        }
                    }
                    Paragraph.m5996paintLG529CI$default(paragraph$foundation_release, canvas, jMo2078invoke0d7_KjU, shadow, textDecoration, drawStyle, 0, 32, null);
                }
            } finally {
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
            }
        }
    }
}
