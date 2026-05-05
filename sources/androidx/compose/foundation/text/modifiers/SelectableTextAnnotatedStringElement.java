package androidx.compose.foundation.text.modifiers;

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
/* JADX INFO: compiled from: SelectableTextAnnotatedStringElement.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{J$c$\u007fCC٥\"}8\tWȞog|SbŏK\u000f\u0014\u001c\u0001j2I]xk0\u00172XoG3coEʠhtL\u0005(݅*8\u0010\u0005\tɝ2H&v\u0003CQ \u001a0N\u0081BR\u0013M\r\u001a \u0012F \u0007\u001fdgd6PǍcž59Ʌ\u001aH^)o0+M;E\u0015ܹ\f\u0007e,,X7c\u00175W\u0011\nj[m\u0007OuK\n\u0001'U1Y\b]6f\u0007,#;Q\u001d]!/l\u0007a`:1AN\u0012S`\u0014.w\t\u0007%<2\u001a\u0016-N.;'~\b<A\u0005xY@^\u0011vB.\u000bq<\u001d%\u000eDC9IvauA\u0019\\I\u0014\u0013\u001d&3\u0007~#kT<uC/jv\u007fDa\\CH\\ qS}\u000e\u0001j\u0012.\u00142]~]\u0013?A''G[g-7j0PTo|\u0005n\u0001kkhGn;~\u001e=*\u0017&rFz\u0004\u001akԜ\\,\u001fid[\u0015\u001c \u0013N^>̖\"m-\\n\u0001\u007fzWm\u001253v9om\u001a%\u0006Ln5EQ\u0012\u001awQ%\u001c\u0006\u05fdcMatbk\u000ep[V;xˎkX\u0001\nef\u000e)1m\rbټ-y j7`\u0003LF\bӔ\n(av3\u0017Ta*IȰ%=\u001e\u000ftt~\u007fi\tIZ\u0006p$=A\u007f?/%\u0004*/ٗ}k\u001b\r\u0019\u0018G\u0016X\u000eǅmخtTߡ\u001fچ׀=S5c!6G0@*EEz\u0001,˻NZ.\t&\u0012\u000fixtՙ\t3w:\u000b\u0003J}d]ȴw'\b13|\u000e\niV\u0001Wed\u000b\nSw\u0007\u0019Xja~ڋ\u0006gȉ$\u000f\u001c:|cԆs-#\u0016\u0006\u0015G\u0015\u0010_\u001au4yp\u0012>t\u0014\b\\i\u001copVu2i>ym\u0005>0+\u0005\u0011RJzw6K\u00196\u001d3vKzo\u0005@}\u00115}t\u0012D\r\u001fb\f@\u0019o\fAF_X\u0002s\u0004\u001a^Q4)M\u0002w\u001esQ\\\u0019['\n9\fa\u0003\u0018\u001cK2ner\u0011@\f\u0004\u001aFAiw3P\u001f#b?l$\u0011Cb\u007f\u001e&\u000b\nVg\u001f\u001bBD\n:\u0005%\u0003\flXX\u0005\u000fOv X\t/\u00179\u001e\u0007MI\u0007\u0004E\u0003H\u0014:\u0007S+#3le}\u0015@qأSܜ\u001aι\u0092\u0005\rK\u000bQwJ<\u0012vAm\u001aoRL`\u000e+r0\u001bg_Ae\u0005av\rkc|\u0017=Ժf\u001bT0\\\u0017z+\u001e\u0003\u001eW\u0012'\u0004\u000bo\u0011b\u0013Ьv\u007fQ(7/DW\u0011<\u0001q}3-45sQ\u0012t\"_\u0014W\u0002E&\bNYm\u0018E/jq&h \\IUlލ\u0018ȫ\u0006\t\u001bУp\u0010<O\rr84^ˉQױ7\u0002\u001bȅ*w\u00060X'Y|\\ןMи|\nkؙ4zc\u001c\u001bf_fPҪ/ȃ!\t/Ӎ~5fpR'c*h\u0019\u0010\u0018%(556yW#_exp\u001aYq\fY7Bˎcʘ4R&ݙo\u0014\u0004\u000bBb8\u0017KV{Gt\u000bllpa$]\u00190;É\u000eì\u0018|\u0007Ĝ/%!?^rLp\u0006б\u001b\u074bZƬՊ_\u0006ʺIK.!?o\u00105ED#}8~!\tJd\u0005\u007fXW7\u0007\u0016fZ@\u001dª?Ն+Y,ݦ5\u00114c]:X\u0007Z*dĴ1և< Fюj(I^KAG\u001fẄ́:۰s\u0007!ƺ;]a(B\u0001+\u0005cׇ{܊o:{قC/=\u0010\b\u001b\u0006h\u0012ç7ְP'\u0014\u058bʉJ\bUf\\ց}ZH=E$\u0019ߣD:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003hh9\u0005r(K}'6La;8[{G#\u000ei\u000eM\u0019\u001c\u0012]J&NK7'\b5XW", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003hh9\u0005r(K}'6La;8[{G#\u000ei\u000eM\u0019\u001c\u0012]J&WN6\u001f]", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "=m?9T*>V#\u0006y^9c\u0005Co\u00107", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "Ad[2V;B]\"\\\u0005g;\n\u00136l\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003hh9\u0005r0X\u007f\u0005QU]9fYy=!g", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2UYr\t\u0011BOk9.li&k\u001b6,\u0018x-YUP<\u0014\u0003d\u0011\u007f(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u007f\u007f\u001aYh/N\u001d:ot^<kE.o\u001d@!N!J{vM\u0015l(+\r\u001fj~2)ncrL\u0019\u0010k`<Ej]\u0010;\\\u000f\n\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u0002$\u0001M![ \u0007\roa+.)L#\u0017r)c8Q\u0013\u0016v\u0002y{`C\u0013\u007fL\u001av)|df|.=\u007f\u0011Vv\u001aGEu_Ms\u000f)}~\u0015\u0007(}wBCF\u0017n'JUCed-\u001911, qE\u0007,70\u0012P@{4^-\u001f\r\u0015l\u0006^bO@K7JXj/E_RN\u001bZS\f<T$\rj}$Qh\u00043Yx\u001bg\u007f8~\u0013)\u0002if", "\u0017", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(NB`\u0010|V>QR", "u(8", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "1n_F \u001dAQ*ke1", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2UYr\t\u0011BOk9.li&k\u001b6,\u0018x-YUP<\u0014\u0003d\u0011\u007f(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u007f\u007f\u001aYh/N\u001d:ot^<kE.o\u001d@!N!J{vM\u0015l(+\r\u001fj~2)ncrL\u0019\u0010k`<Ej]\u0010;\\\u000f\n\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u0002$\u0001M![ \u0007\roa+.)L#\u0017r)c8Q\u0013\u0016v\u0002y{`C\u0013\u007fL\u001av)|df|.=\u007f\u0011Vv\u001aGEu_Ms\u000f)}~\u0015\u0007(}wBCF\u0017n'JUCed-\u001911, qE\u0007,70\u0012P@{4;\u000e\u0011\u0007\ru\u0007\u0019\\Q\u0002\u007f=ITt0<-L\u000fLcQ\f;Q\u001f8*\u0004\u0016Uj==Tm\u0012\u0001\b+\u0006!e\u001a&|G\u001dv\u0017,m\fz\n\u0003,\u000b$\nb]\u0012\\\u0013m6W'\u0002d1d\u0017\"Nh\u001e[V", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final Function1<List<Rect>, Unit> onPlaceholderLayout;
    private final Function1<TextLayoutResult, Unit> onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer);
    }

    private final AnnotatedString component1() {
        return this.text;
    }

    private final Function1<List<Rect>, Unit> component10() {
        return this.onPlaceholderLayout;
    }

    private final SelectionController component11() {
        return this.selectionController;
    }

    private final ColorProducer component12() {
        return this.color;
    }

    private final TextStyle component2() {
        return this.style;
    }

    private final FontFamily.Resolver component3() {
        return this.fontFamilyResolver;
    }

    private final Function1<TextLayoutResult, Unit> component4() {
        return this.onTextLayout;
    }

    /* JADX INFO: renamed from: component5-gIe3tQ8, reason: not valid java name */
    private final int m1654component5gIe3tQ8() {
        return this.overflow;
    }

    private final boolean component6() {
        return this.softWrap;
    }

    private final int component7() {
        return this.maxLines;
    }

    private final int component8() {
        return this.minLines;
    }

    private final List<AnnotatedString.Range<Placeholder>> component9() {
        return this.placeholders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-VhcvRP8$default, reason: not valid java name */
    public static /* synthetic */ SelectableTextAnnotatedStringElement m1655copyVhcvRP8$default(SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement, AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 1)) != 0) {
            annotatedString = selectableTextAnnotatedStringElement.text;
        }
        if ((2 & i5) != 0) {
            textStyle = selectableTextAnnotatedStringElement.style;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            resolver = selectableTextAnnotatedStringElement.fontFamilyResolver;
        }
        if ((8 & i5) != 0) {
            function1 = selectableTextAnnotatedStringElement.onTextLayout;
        }
        if ((16 & i5) != 0) {
            i2 = selectableTextAnnotatedStringElement.overflow;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 32)) != 0) {
            z2 = selectableTextAnnotatedStringElement.softWrap;
        }
        if ((64 & i5) != 0) {
            i3 = selectableTextAnnotatedStringElement.maxLines;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 128)) != 0) {
            i4 = selectableTextAnnotatedStringElement.minLines;
        }
        if ((256 & i5) != 0) {
            list = selectableTextAnnotatedStringElement.placeholders;
        }
        if ((i5 + 512) - (512 | i5) != 0) {
            function12 = selectableTextAnnotatedStringElement.onPlaceholderLayout;
        }
        if ((i5 + 1024) - (1024 | i5) != 0) {
            selectionController = selectableTextAnnotatedStringElement.selectionController;
        }
        if ((i5 & 2048) != 0) {
            colorProducer = selectableTextAnnotatedStringElement.color;
        }
        return selectableTextAnnotatedStringElement.m1656copyVhcvRP8(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer);
    }

    /* JADX INFO: renamed from: copy-VhcvRP8, reason: not valid java name */
    public final SelectableTextAnnotatedStringElement m1656copyVhcvRP8(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1<? super TextLayoutResult, Unit> function1, int i2, boolean z2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer) {
        return new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SelectableTextAnnotatedStringElement(text=");
        sb.append((Object) this.text).append(", style=").append(this.style).append(", fontFamilyResolver=").append(this.fontFamilyResolver).append(", onTextLayout=").append(this.onTextLayout).append(", overflow=").append((Object) TextOverflow.m6571toStringimpl(this.overflow)).append(", softWrap=").append(this.softWrap).append(", maxLines=").append(this.maxLines).append(", minLines=").append(this.minLines).append(", placeholders=").append(this.placeholders).append(", onPlaceholderLayout=").append(this.onPlaceholderLayout).append(", selectionController=").append(this.selectionController).append(", color=");
        sb.append(this.color).append(')');
        return sb.toString();
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i5 & 8) != 0 ? null : function1, (-1) - (((-1) - i5) | ((-1) - 16)) != 0 ? TextOverflow.Companion.m6576getClipgIe3tQ8() : i2, (i5 & 32) != 0 ? true : z2, (i5 & 64) != 0 ? Integer.MAX_VALUE : i3, (-1) - (((-1) - i5) | ((-1) - 128)) == 0 ? i4 : 1, (i5 + 256) - (i5 | 256) != 0 ? null : list, (-1) - (((-1) - i5) | ((-1) - 512)) != 0 ? null : function12, (-1) - (((-1) - i5) | ((-1) - 1024)) != 0 ? null : selectionController, (-1) - (((-1) - i5) | ((-1) - 2048)) == 0 ? colorProducer : null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1<? super TextLayoutResult, Unit> function1, int i2, boolean z2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer) {
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
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SelectableTextAnnotatedStringNode create() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null, 4096, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SelectableTextAnnotatedStringNode selectableTextAnnotatedStringNode) {
        selectableTextAnnotatedStringNode.m1657updateL09Iy8E(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return Intrinsics.areEqual(this.color, selectableTextAnnotatedStringElement.color) && Intrinsics.areEqual(this.text, selectableTextAnnotatedStringElement.text) && Intrinsics.areEqual(this.style, selectableTextAnnotatedStringElement.style) && Intrinsics.areEqual(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && Intrinsics.areEqual(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && TextOverflow.m6569equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && Intrinsics.areEqual(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
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
        return iHashCode5 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }
}
