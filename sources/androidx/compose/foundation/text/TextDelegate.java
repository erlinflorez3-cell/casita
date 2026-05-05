package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: TextDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpA0JeP.`\\2şs{J$cҕyCQU\"Ԃ*\teNo˧vJh)K\u000f\u001c\u0016\u0001jBI]xc\u0016\u00172XoG3SyE9vt>\u0005&A*8\u0010\u0005\tɝ2H&v\u0003CQ\u000f\u001a0NpBĥ\u0015M\u001b\u001a\u001a\u0006D\"\u0007\u001drɡl{xl\f9g\"H*$^+m0\u0015M;Gd+\u001bxy\u001eYCG;\u001b%a\u0007\u001fR\nD\u0013Ew=\u0013n?'YN\u0004]<X\u000e\u001b-+}\u0015mx,\\\u0013Zx\fU5_gY[&(&\u0007\f\u0011J\u0011&\u0006UV>? f\u0016\u001dK\u0001\u0003[PV\u0012`R\u007f)sd(S\u0010Ĵ/9)y\u001a\fIPf7*==\"1:\u0007!\n\u000f>d#Vlw\u007fJ\u0002HCH\\Fq?\u0004\u0003\u001f\u001bΜ)ʶΥK\u000259\u001fl_1E\u001bQ#O,2LR#\u000f\u0005\u000f\u0002\u001c\n`\nX\"\u001dXg.\u0017ErD\u0013?\u001cTb\u0014D\u0011{5\u001b\u0007ś\u0007ʶء`yBd3T\u001f^vt\u0003M\f\u0016ɻ3l?ժ\u0007m\u0014kGs\u0004D_p(a\u0001\u0005݀CBjڳphHi\u001aq-B0J`l&v*]%۽\u001f\u0558C}$عD3\u001fv#c# H]\u000b&0iv.\u0017Ta)9.˨x\r\u0019Rb\u0010}\bIX:\u0001x\"[Fپ9\u001f.Ş:j:\u001e1'O\u0003\u000ei\u007fLuQ#Z\u0091Y\u007f8\u0018 \\_O\u000e\"\u001d\u0005A202։Pxmʸe\u0014-\u001f\u000b\u001a_MvS\u007f\b\u0019\u0017b!A\u07bdQݚ\u001b&\u000f`xJ\u0016\rP\u0011oO\u0013G\u0012^¤ZŬЭq\u0002ʾ@V@|\u0013I6'\u0007\u00190\u001d\u0006GQR5\u0018\u000e\u0013];8ӡuܓ2\u0006jχ>vk0:\f6qh~k`\fSWh\u0017J2,|\tRJzw6T7E;CȈEjxމPO\u0011^\f\u0017W;\u001bwn[h\u001b̭\u0002:6ɾBuI/\"\u0011\u00144\u001fOkg\u001cpљ`\u0011R\u05fa\"\r\u0002d|FlL.Vob71Ӓw\u001e>\u05cdSd\u000bq\u0017ZҌ,E\u0010\u000eIү\u00064\u000f\u0003\u007fL~ʾ\u001bx"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,CBk6\u001a$h7", "", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", "AnUAJ9:^", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u0002-e0Lg\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCWJIqsC\fh+`INyzm\"\u001auZ2\t\u000f\u001d\u000f|Z\u0005quGb\u000b<mMmnU\u000fp_E\u0004p\u007fU\u0005\u0007r.`x2\tkp48@k\u0016Ktm%ct&(&Q6*=\u0006yCYrKSD\u0018w&e\u0011WgF9binrH\u001c\u0010Y\u001e%\u0014a`|GY\u0015\u001cSx#6S\u000f@j\u0004\"p\u00031seV\u0019^E", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "5dc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rH\\\u0002hoC\u000et,[L", "7mc?\\5LW\u0017\raZ@\u0007\u0019>D\u00045{>\u0010\u001b!P", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0016a;KW\"\r~\\:c\u0005Co\u00107ZD\u000e\u0017\u0015Vs\u0018E5&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0016a;KW\"\r~\\:c\u0005Co\u00107ZD\u000e\u0017\u0015Vs\u0018E5&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001aT?\"\\(\f~g:\u0001\u0007!i~7~", "u(8", "5dc\u001aT?%W\"~\t", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001a\\5\"\\(\f~g:\u0001\u0007!i~7~", "5dc\u001a\\5%W\"~\t", "<n]\u001bh3E7\"\u000e\bb5\u000b\r-s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u001ftC+\u0019qo=\u0005q\u0002", "5dc\u001bb5'c \u0006^g;\n\r8s\u0004&\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006^5<h\u0002\u000b3z\u00120Z?Fn\u0018'$ueB\u0015g*\\L", "5dc\u001ci,KT \t\r&.`\t|tkz", "\u0017", ">`a.Z9:^\u001cb\u0004m9\u0001\u0012=i}6", "5dc\u001dT9:U&z\u0006a\u0010\u0006\u0018<i\t6\u007f>\u000fU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "Adc\u001dT9:U&z\u0006a\u0010\u0006\u0018<i\t6\u007f>\u000fU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W$\u0007,D]h\u001cDi\u0018;IN>O=-\"ljG\u000ba:$:\u0018", "5dc\u001d_(<S\u001c\t\u0002],\n\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc b-ME&z\u0006", "u(I", "5dc g@ES", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhk/Kt\u0016\u0004", "5dc!X?M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":`h<h;\u001dW&~xm0\u0007\u0012", ">qTCE,Lc \u000e", ":`h<h;\u0006<\u0002OZpsl", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u001dN>\u001cNHA7}+33\u0012<Xn;v\u0011\u0013%cxQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bUfss\fr,&):7#X\u0015/r`=v{a!yaO", ":`h<h;\"\\(\f~g:\u0001\u0007=", "", ":`h<h;-S,\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u0011", ":`h<h;-S,\u000eBDzGi\u0003x[", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=sXO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#)4uS;\n\u00049E\u0004Hd\f\u000fk", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z2, int i4, Density density, FontFamily.Resolver resolver, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i2, i3, z2, i4, density, resolver, list);
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z2, int i4, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i2;
        this.minLines = i3;
        this.softWrap = z2;
        this.overflow = i4;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (i2 <= 0) {
            throw new IllegalArgumentException("no maxLines".toString());
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("no minLines".toString());
        }
        if (i3 > i2) {
            throw new IllegalArgumentException("minLines greater than maxLines".toString());
        }
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinLines() {
        return this.minLines;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z2, int i4, Density density, FontFamily.Resolver resolver, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (i5 + 4) - (i5 | 4) != 0 ? Integer.MAX_VALUE : i2, (i5 & 8) != 0 ? 1 : i3, (i5 & 16) == 0 ? z2 : true, (i5 + 32) - (i5 | 32) != 0 ? TextOverflow.Companion.m6576getClipgIe3tQ8() : i4, density, resolver, (i5 + 256) - (i5 | 256) != 0 ? CollectionsKt.emptyList() : list, null);
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m1391getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.paragraphIntrinsics;
    }

    public final void setParagraphIntrinsics$foundation_release(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.intrinsicsLayoutDirection;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m1390layoutTextK40F9xA(long j2, LayoutDirection layoutDirection) {
        layoutIntrinsics(layoutDirection);
        int iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
        int iM6591getMaxWidthimpl = ((this.softWrap || TextOverflow.m6569equalsimpl0(this.overflow, TextOverflow.Companion.m6577getEllipsisgIe3tQ8())) && Constraints.m6587getHasBoundedWidthimpl(j2)) ? Constraints.m6591getMaxWidthimpl(j2) : Integer.MAX_VALUE;
        int i2 = (this.softWrap || !TextOverflow.m6569equalsimpl0(this.overflow, TextOverflow.Companion.m6577getEllipsisgIe3tQ8())) ? this.maxLines : 1;
        if (iM6593getMinWidthimpl != iM6591getMaxWidthimpl) {
            iM6591getMaxWidthimpl = RangesKt.coerceIn(getMaxIntrinsicWidth(), iM6593getMinWidthimpl, iM6591getMaxWidthimpl);
        }
        return new MultiParagraph(getNonNullIntrinsics(), Constraints.Companion.m6600fitPrioritizingWidthZbe2FdA(0, iM6591getMaxWidthimpl, 0, Constraints.m6590getMaxHeightimpl(j2)), i2, TextOverflow.m6569equalsimpl0(this.overflow, TextOverflow.Companion.m6577getEllipsisgIe3tQ8()), null);
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m1389layoutNN6EwU$default(TextDelegate textDelegate, long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m1392layoutNN6EwU(j2, layoutDirection, textLayoutResult);
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m1392layoutNN6EwU(long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
        if (textLayoutResult != null && TextLayoutHelperKt.m1425canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j2)) {
            return textLayoutResult.m6094copyO0kMr_c(new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.style, textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m6092getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j2, (DefaultConstructorMarker) null), ConstraintsKt.m6605constrain4WqzIAM(j2, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        MultiParagraph multiParagraphM1390layoutTextK40F9xA = m1390layoutTextK40F9xA(j2, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j2, (DefaultConstructorMarker) null), multiParagraphM1390layoutTextK40F9xA, ConstraintsKt.m6605constrain4WqzIAM(j2, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(multiParagraphM1390layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(multiParagraphM1390layoutTextK40F9xA.getHeight()))), null);
    }

    /* JADX INFO: compiled from: TextDelegate.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u001d]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8ԸsF"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,CBk6\u001a$h \u0017\u0011k7J\u007f+QU$", "", "u(E", ">`X;g", "", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }
    }
}
