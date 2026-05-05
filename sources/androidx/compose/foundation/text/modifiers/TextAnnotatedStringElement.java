package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
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
/* JADX INFO: compiled from: TextAnnotatedStringElement.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{J$c$\u007fCC٥\"}8\tWȞog|SbŏK\u000f\u0014\u001c\u0001j2I]xk0\u00172XoG3coEʠhtL\u0005(݅*8\u0010\u0005\tɝ2H&v\u0003ŏS\f(0Hp@U\u0015M\u0013܅\u001a\u0006D\"\t\u001ergVȤNǍsŽ_)\u0013kRNU_^{\u000eϻEd+\u001bwy\u001eYBG9#(k\u00035VkC\u0011D\n=3n7;1I\u0002^Nf\u0010\u0016%+}\u0016mt6\\3[v\u000bU3_iQP\u001c3\u0010z*\u0019L\n\u0014\u00065UF-Ht\u0018\u00149t\u0001bXP0nR\u0006\u0001aD(=\u007fa;I/lQoM1\\G\u0004\u0015\u0013.%\u0011nOp\u0003\"v\u0014Ig\bm7QNS`d\u001acMu\u0014tr\u0004@\u0003^^.B\f\u0013>\u0017SAq8Q){\nNDu\u000f\u001db~R\u0018kXH(n$QB\u000b\"Yr\u007f\u0015\u007fVTfH)[,V\u0017}600^\b<O/&M}pȬnMk(m5tWqn\u001a\u000e\u001eM'DCr{\u0010\u0010`'\u001aM^z\u0007nepvRȮ\\p(@l\u0003\u0010&\f\u000bbT!@d\n\u001cb6a\u001dj;`\u0003LB\b\u0011Qih\u0010(~\u0003=L\u0003\u0018L;\u001dQ^j\u000b\bi\u000fHZ\u00187ø/ۮU5!ğ&.v9\u0015#5\u0005JÕIѨPGT˾f\u0002c\u000b8\u0016HI(Ȁ?т\u0013~1ɅR9S]\u000be\u007f]h\u0600|܃}\u000fCÜ~\n\u0016\u0001\tBptZWd\u001b2xtqQ\u001f\u0013\u0013\ncVzumj\n\nF \u0382\u0005ʾ@N@وU9,A\u0019}2~E-qD-\u0018\b\u0014]\u001fw\\\u0018w\u0005ӣdϪ*tmֽ|}$vz_m4K8wb\u000f@2$\u001b\rXG\u0019\u007f^Ⱥ\u000bΌ\u00113PШ5\u0005dCe\u000b]\n=\u0081.߱o£ޣ9\u0012̭\u000266_8\u0013\u0014\u0018\"p[3!Ucm}o[\\9_=\u001e!z_\u0002hΕ?֕ZWj־\u0001\u0014\u00020NCQa3U_Ӛ6ʙ@\b\u0013͏%u\u0014\u001d\u0013\u007ftmeĢ4¡w;^Օ%\u0005jY`\u0005\u000fI7ԣ,ܣ\u0003\u000f;ͨIA?\u0006\u0006F\u00031:ѥ\u0003Ә!\t#˂ʭ~o-.JȖUI'`\u0001\u0011dظGr"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHbl5X\u0006#VLM\u001ak_vF\u0016qa\u000eV+\u0016\u0014/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHbl5X\u0006#VLM\u001ak_vF\u0016zd\rN\u0001", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "=m?9T*>V#\u0006y^9c\u0005Co\u00107", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "Ad[2V;B]\"\\\u0005g;\n\u00136l\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003hh9\u0005r0X\u007f\u0005QU]9fYy=!g", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "=mB5b>-`\u0015\b\te(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0004htHbl5X\u0006#VLM\u001ak_vF\u0016zd\rNi{\u0005lP\u0012~AE.\f;Y\u0011?r\n|\u0012\u0015EjF", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2UYr\t\u0011BOk9.li&k\u001b6,\u0018x-YUP<\u0014\u0003d\u0011\u007f(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u007f\u007f\u001aYh/N\u001d:ot^<kE.o\u001d@!N!J{vM\u0015l(+\r\u001fj~2)ncrL\u0019\u0010k`<Ej]\u0010;\\\u000f\n\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u0002$\u0001M![ \u0007\roa+.)L#\u0017r)c8Q\u0013\u0016v\u0002y{`C\u0013\u007fL\u001av)|df|.=\u007f\u0011Vv\u001aGEu_Ms\u000f)}~\u0015\u0007(}wBCF\u0017n'JUCed-\u001911, qE\u0007,70\u0012P@{4^-\u001f\r\u0015l\u0006^bO@K4QRh1@mT\u0013\u0006;b\u0019*\\\u00199i@k)a}DQr\u0017I\t<\u0001\\ 55uT(c\"xE\f\r\u0006\u007f$>x\u000ba\\%Z#lWR'eW<\u000b\u0010/\u001c,\u0006", "\u0017", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final Function1<List<Rect>, Unit> onPlaceholderLayout;
    private final Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit> onShowTranslation;
    private final Function1<TextLayoutResult, Unit> onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, function13);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i5 & 8) != 0 ? null : function1, (-1) - (((-1) - i5) | ((-1) - 16)) != 0 ? TextOverflow.Companion.m6576getClipgIe3tQ8() : i2, (i5 & 32) != 0 ? true : z2, (-1) - (((-1) - i5) | ((-1) - 64)) != 0 ? Integer.MAX_VALUE : i3, (i5 & 128) == 0 ? i4 : 1, (-1) - (((-1) - i5) | ((-1) - 256)) != 0 ? null : list, (i5 & 512) != 0 ? null : function12, (i5 + 1024) - (i5 | 1024) != 0 ? null : selectionController, (-1) - (((-1) - i5) | ((-1) - 2048)) != 0 ? null : colorProducer, (i5 + 4096) - (i5 | 4096) == 0 ? function13 : null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1<? super TextLayoutResult, Unit> function1, int i2, boolean z2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer, Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function13) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = function1;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i4;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = selectionController;
        this.color = colorProducer;
        this.onShowTranslation = function13;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.onShowTranslation, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(this.color, this.style), textAnnotatedStringNode.updateText$foundation_release(this.text), textAnnotatedStringNode.m1659updateLayoutRelatedArgsMPT68mk(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), textAnnotatedStringNode.updateCallbacks(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.areEqual(this.color, textAnnotatedStringElement.color) && Intrinsics.areEqual(this.text, textAnnotatedStringElement.text) && Intrinsics.areEqual(this.style, textAnnotatedStringElement.style) && Intrinsics.areEqual(this.placeholders, textAnnotatedStringElement.placeholders) && Intrinsics.areEqual(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && TextOverflow.m6569equalsimpl0(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && Intrinsics.areEqual(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        Function1<TextLayoutResult, Unit> function1 = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + TextOverflow.m6570hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<Rect>, Unit> function12 = this.onPlaceholderLayout;
        int iHashCode4 = (iHashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31;
        SelectionController selectionController = this.selectionController;
        int iHashCode5 = (iHashCode4 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.color;
        int iHashCode6 = (iHashCode5 + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31;
        Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit> function13 = this.onShowTranslation;
        return iHashCode6 + (function13 != null ? function13.hashCode() : 0);
    }
}
