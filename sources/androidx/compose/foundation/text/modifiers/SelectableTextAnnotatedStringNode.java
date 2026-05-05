package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
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
/* JADX INFO: compiled from: SelectableTextAnnotatedStringNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĳ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]\u001a\u0014\"\u0011O\\goñRZ!C\u0017إ\u001exx5Qǁ\u0001] \u0015:Bu?;M}[A`\u000b6\r H\"@ц\r\u00010*PƵ~zYK\u0014۵8@\u0007:Z҈U\u00050\u0012\u000e>&\u0001&\\}N>Hr]B/9\u0003qBT*g0\u0013M\u0015Ͽ\\'#viӜ3@M5\u001d%Y\u0005\u000fRq?\u000b?\b=\rh='3ɞ{WLX\b\u0014\u001b.UՕsöV\\3P\u0011\fU+\u007fcyQ>(&|<ɤ;\u0014\u0012\u0014*`.[\u001ev\f\u001c8\rr\u0002F`\u0006lI\u0018z\u0010>'9\u000639B3tacK\u0019|B\f\u0007\u001d\u001eQ\r\u0005 \n^\u001ef\u001b\u001bb\u0005i1\u007fNMNT\ngL\u0006\u0004\u001fr\u00120\n0U\u0011G{?@'+=[G69k0ZT{|\u0005n|kwbPP(~\u0018G*7#\tZz\u0004\u001aedt2\u0011[4l\u001d\u000e\u0012#(l{L#;\u000f|h\u0017~zOm\nS;|6\bx{\u0016]9lMMSy\u000f\u0010m\u0007\u001cE<p!phXR:wl<(2V\t(\u0006\fF^\fAQOs,4Z=/[CRҴ\"BO\u001dQmh\f(~\u0003?T\u0007wH\r\t/u#\u00058φwWR\u0015`P9qUC\u001c>UPld\u00011\f\u0017s.M\u0018^U`\u0005$\u0006]\f&&\u001cIQ]TA%\u0015(`\u0017]IZ\u0006}Q{$W~\u000b\u000b';\u0017@\u0018\fx\u007fD`\u0019Z\u007fX%)\u000f^!+8h\u000e\u0007yF)U\u0014f\u0019dVW\u0003\u0005i<|C\r\u0007/\u001eS\r\u0006!+?]]55.\u000e$9%imm\u007f0\u0010a=?#z\u0014.s\u0016\u001eng\\`EhOg\u0019V$:k1]xp\u0006/Z\u000bJ\faeҡcݥެ<O\u0011W\f\u0010O6\u001b\u001bn[h\u001f\u0018}bY&><]\f@vCS#uS\u0016\u001b\u001eOj9b\u000f8:,5|B4=Nh\u001evQJ\u0014%06oM\u000b\u0005j6T8:j \u000bq\u0004\u001a\n\u001e-\u0018F\u000e!]F\u000b\u0018I\n&T'\u0011~H3\u0016ud/X\u0019~=iN|Ch\u001dmt\ruwӛ\u007fҵ\u009b\r\u001dp\t\r!mER\u0010Q\u001bVj)\u000bs\u000bsM\u0010d\u001cGW\u001d\u001cs\u001ah0|KT^/\u0002k\u001f\u001c\u000f0\r\u001d}d|\u0012'\u0016t\u0001f\"W.+\u0001\u001cn\"\u000f9+\u0016\u0007@n;mfweep݈\u0019ؐ-\u0007\u0014ű4`)K\u001eC=?YjBF\fYc;,\u00146\u001fU\u000eKըh߉\u0012f\u0012܁kH$\f.d\u0018\bAkvɏ:ؠxr\u0012ڔý6T\n6\bդz\bj֕%}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003hh9\u0005r(K}'6La;8[{G#\u000ei\u000eM\u0019\u001c\u0012]J&WN6\u001f]", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9oC\u0001\"1`h*Eq%2WL\u0017}0+\u0015Pk8\u000bd0N\u0004\u0010QKN\u0002", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "=m?9T*>V#\u0006y^9c\u0005Co\u00107", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "Ad[2V;B]\"\\\u0005g;\n\u00136l\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003hh9\u0005r0X\u007f\u0005QU]9fYy=!g", "=uT?e0=Sv\t\u0002h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "=mB5b>-`\u0015\b\te(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHbl5X\u0006#VLM\u001ak_vF\u0016zd\rNi{\u0005lP\u0012~AE.\f;Y\u0011?r\n|\u0012\u0015EjF", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2UYr\t\u0011BOk9.li&k\u001b6,\u0018x-YUP<\u0014\u0003d\u0011\u007f(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u007f\u007f\u001aYh/N\u001d:ot^<kE.o\u001d@!N!J{vM\u0015l(+\r\u001fj~2)ncrL\u0019\u0010k`<Ej]\u0010;\\\u000f\n\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u0002$\u0001M![ \u0007\roa+.)L#\u0017r)c8Q\u0013\u0016v\u0002y{`C\u0013\u007fL\u001av)|df|.=\u007f\u0011Vv\u001aGEu_Ms\u000f)}~\u0015\u0007(}wBCF\u0017n'JUCed-\u001911, qE\u0007,70\u0012P@{4^-\u001f\r\u0015l\u0006^bO@K4QRh1@mT\u0013\u0006;b\u0019*\\\u00199i@k)a}DQr\u0017I\t<\u0001\\ 55uT(c\"xE\f\r\u0006\u007f$>x\u000ba\\%Z#lWR'eW<\u000b\u0010/\u001c,\u0006", "2d[2Z(MS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHbl5X\u0006#VLM\u001ak_vF\u0016zd\rN\u0001", "=m69b):Z \u0013eh:\u0001\u00183o\t(z", "1n^?W0GO(~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "CoS.g,", "1n[<e", "CoS.g,\u0006:cR^r~\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020\u00077y|U&\u001d9q:)Z\u001eVOxY6\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;(\u001b{_w\u000b\u0006\\ <3\u0004pv(\u0015\u0003<+R,HFSy\\Mt4t/b}\u001cA_x4>2\u0015<s7t\u000eIv\u001cHg\u0007^\rlJ%5:F\u001c\u000b!J{vM\u0015l(+\r\u001fj~2)ncrL\u0019\u0010k`<Ej]\u0010;\\\u000f\n\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u0002$\u0001M![ \u0007\roa+.)L#\u0017r)c8Q\u0013\u0016v\u0002y{`C\u0013\u007fL\u001av)|df|.=\u007f\u0011Vv\u001aGEu_Ms\u000f)}~\u0015\u0007(}wBCF\u0017n'JUCed-\u001911, qE\u0007,70\u0012P@{4;\u0018", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private final TextAnnotatedStringNode delegate;
    private Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> onShowTranslation;
    private SelectionController selectionController;

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, function13);
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i5 + 8) - (i5 | 8) != 0 ? null : function1, (i5 + 16) - (i5 | 16) != 0 ? TextOverflow.Companion.m6576getClipgIe3tQ8() : i2, (i5 & 32) != 0 ? true : z2, (i5 & 64) != 0 ? Integer.MAX_VALUE : i3, (-1) - (((-1) - i5) | ((-1) - 128)) == 0 ? i4 : 1, (i5 & 256) != 0 ? null : list, (i5 & 512) != 0 ? null : function12, (i5 & 1024) != 0 ? null : selectionController, (i5 + 2048) - (i5 | 2048) != 0 ? null : colorProducer, (i5 + 4096) - (i5 | 4096) == 0 ? function13 : null, null);
    }

    private SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1<? super TextLayoutResult, Unit> function1, int i2, boolean z2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer, Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function13) {
        this.selectionController = selectionController;
        this.onShowTranslation = function13;
        this.delegate = (TextAnnotatedStringNode) delegate(new TextAnnotatedStringNode(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, this.selectionController, colorProducer, this.onShowTranslation, null));
        if (this.selectionController == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.updateGlobalPosition(layoutCoordinates);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.delegate.drawNonExtension(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        return this.delegate.m1658measureNonExtension3p2s80s(measureScope, measurable, j2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.delegate.minIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.delegate.minIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.delegate.maxIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.delegate.maxIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    /* JADX INFO: renamed from: update-L09Iy8E, reason: not valid java name */
    public final void m1657updateL09Iy8E(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, int i3, boolean z2, FontFamily.Resolver resolver, int i4, Function1<? super TextLayoutResult, Unit> function1, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer) {
        TextAnnotatedStringNode textAnnotatedStringNode = this.delegate;
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(colorProducer, textStyle), this.delegate.updateText$foundation_release(annotatedString), this.delegate.m1659updateLayoutRelatedArgsMPT68mk(textStyle, list, i2, i3, z2, resolver, i4), this.delegate.updateCallbacks(function1, function12, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
