package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
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
/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV4ZS0\u000fs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4կ]xk\u001b\u00172HoG3[\u000eE9vt>\u000562*\u0600\u0002\u0005\u0017\u001a2H\u0016z\u0003CY\u0018\u001a0Fr@W#˟#?B\u0006l\u001f9\u001d\u0002(sFLz]R/Q\u0004yF\\)w0+P\u001dJb+%v\u0010#;F=5#+k\u00035YÜC\u0003My\u0006ݦg52CI\"cf\\\u000e!-+}\u001b\u000ex,\\\u0013`x\fU;\u007fiQP\u001c9\u0010z*\u001fl\n\u0014\u00065[F-Hz8\u00149t\u0001hXP0er\u0012\u0001aD-=\fC3I!vSq;Gge\u00143$N)\u0007n/ul\u000e\u000f0KZ}Q?mX=vS:_Cm\u0012\u000ez\u0002X\u0007`M\u0006/\n/F\u0017S8\f?)!y!`D\u0016\u000bKeŞR֟ʐLB(\u000f$Xr{\u001ae\\d3w\u0001Xf9)MJv7\u0004\u000e\u0013.k\u0010<O5@TUhw{e]87_l=Y|~&Wgrc;Wc\u001evjvBFlh\u000bXt\\k\f\twX(8Hx,\u0010{rS<\u00198?\u007f9L,_\u001c\r\u001bN\u0003,`Y|7`\u000bn\u0016~bR<\u0003\u00188;\u000eˏOʔʼsi~l:!1.;Gi5G-,ȫjط\u0001#\u000fѨD\fUidGzol߲Wދ$\u0016\"ߙ\";K\u0013'~W3XΒGʆveY˧b3\t\u0001\u0012\u000fim\u0005ԙ\nϡt,hʄ\u001b]b :xtqQ\u0012;у{ӶJzOϊҽ\u000b`FLxçujM̤\u0001+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001dYy.Gz\u0016;#", "", "2dU.h3M4#\b\n?(\u0005\r6yl(\nJ\b(\u0017T", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "2dU.h3M2\u0019\b\tb;\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2dU.h3M:\u0015\u0013\u0005n;[\r<e}7\u007fJ\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1`R5X\u001aBh\u0019", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007fr\u000b\u0015vk@\u0018c9$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNiEm~M;.Q\u000bI\u000bIl\u0010 kt1soO`\u0014F\r^sK1sPg_CWE\u000fr3h\u001b)\u0004XND4#P\u001d(hN=\u000e\u0006\\fV\u0016j", "BdgA?(R])\u000eXZ*\u007f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|s*KF;A", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":`h<h;\u001dW&~xm0\u0007\u0012", "2d]@\\;R", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "AjX=6(<V\u0019", ";dP@h9>\u001b,]\u0006s{\u0012|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u0002-v\u001fO\u0006\b'\n~z\u007fF]Y.}#\u0005\u0017\u000eOBb^\u0007QEDusb\u0016g(fH:m$ub+qT=SbO%|b\tFkT\u0019xG(Hv1-AxTI~+\u001e^Eu\u001c:c~9tv\u00148sFm\tZ1v>g\u0007\u0019;p\u0017\u000e\"?; IOb\t6<\u0018p*k\u0016\u000e,E5btevWX\bg j~Bi\nF3\u0002FMv)e3~Pe\u0001&\t\u0014yb)0?$S\u000e$tC5)\u000f\r\u000bq\"*._M]Xw*rF\u0017\u0002\t{GrwmM%\u007f5\u0010{[yj-", "", ";dP@h9>\u001b+gjR\u001a\nS", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016Q;b}'\u001d0C\u0010A9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0012Dl\u0010U|\nIt\u0001Q5\u0014Ty\u0013\u0005E3q\u001c@[\u0003FNOf)wU]'dED2\u0014;)\u001f2`7\u000e\u000b\u001dor[\bkv[na4-=zeJD\u0003\u001f:~/*U\nw[B\\>:t@\u0013}+@m\u0014\u0015H\"GmY\u00114`H;d#<!IRtuy\u0014\u0003,\u0006]\u0011\ro?5\u0018x/aR\u0017\u0012g%[~qcJFR\u0019M\u0013^\u0015:Ue>o\u0004%\u0018s${uPRp", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextMeasurer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int cacheSize;
    private final Density defaultDensity;
    private final FontFamily.Resolver defaultFontFamilyResolver;
    private final LayoutDirection defaultLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i2) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i2;
        this.textLayoutCache = i2 > 0 ? new TextLayoutCache(i2) : null;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i3 & 8) != 0 ? TextMeasurerKt.DefaultCacheSize : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m6099measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i2, boolean z2, int i3, List list, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z3, int i4, Object obj) {
        boolean z4 = z3;
        TextStyle textStyle2 = textStyle;
        Density density2 = density;
        LayoutDirection layoutDirection2 = layoutDirection;
        long jConstraints$default = j2;
        List listEmptyList = list;
        int i5 = i3;
        FontFamily.Resolver resolver2 = resolver;
        int iM6576getClipgIe3tQ8 = i2;
        boolean z5 = z2;
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
        }
        if ((i4 & 8) != 0) {
            z5 = true;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        }
        if ((i4 + 128) - (i4 | 128) != 0) {
            layoutDirection2 = textMeasurer.defaultLayoutDirection;
        }
        if ((i4 & 256) != 0) {
            density2 = textMeasurer.defaultDensity;
        }
        if ((i4 & 512) != 0) {
            resolver2 = textMeasurer.defaultFontFamilyResolver;
        }
        if ((i4 + 1024) - (i4 | 1024) != 0) {
            z4 = false;
        }
        return textMeasurer.m6101measurexDpz5zY(annotatedString, textStyle2, iM6576getClipgIe3tQ8, z5, i5, listEmptyList, jConstraints$default, layoutDirection2, density2, resolver2, z4);
    }

    /* JADX INFO: renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m6101measurexDpz5zY(AnnotatedString annotatedString, TextStyle textStyle, int i2, boolean z2, int i3, List<AnnotatedString.Range<Placeholder>> list, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z3) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list, i3, z2, i2, density, layoutDirection, resolver, j2, (DefaultConstructorMarker) null);
        TextLayoutResult textLayoutResult = (z3 || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m6094copyO0kMr_c(textLayoutInput, ConstraintsKt.m6605constrain4WqzIAM(j2, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        TextLayoutResult textLayoutResultLayout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, textLayoutResultLayout);
            return textLayoutResultLayout;
        }
        return textLayoutResultLayout;
    }

    /* JADX INFO: renamed from: measure-wNUYSr0$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m6098measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i2, boolean z2, int i3, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z3, int i4, Object obj) {
        boolean z4 = z3;
        LayoutDirection layoutDirection2 = layoutDirection;
        Density density2 = density;
        boolean z5 = z2;
        long jConstraints$default = j2;
        FontFamily.Resolver resolver2 = resolver;
        TextStyle textStyle2 = textStyle;
        int i5 = i3;
        int iM6576getClipgIe3tQ8 = i2;
        if ((i4 & 2) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        }
        if ((i4 & 4) != 0) {
            iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
        }
        if ((i4 & 8) != 0) {
            z5 = true;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        }
        if ((i4 & 64) != 0) {
            layoutDirection2 = textMeasurer.defaultLayoutDirection;
        }
        if ((i4 + 128) - (i4 | 128) != 0) {
            density2 = textMeasurer.defaultDensity;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
            resolver2 = textMeasurer.defaultFontFamilyResolver;
        }
        if ((i4 & 512) != 0) {
            z4 = false;
        }
        return textMeasurer.m6100measurewNUYSr0(str, textStyle2, iM6576getClipgIe3tQ8, z5, i5, jConstraints$default, layoutDirection2, density2, resolver2, z4);
    }

    /* JADX INFO: renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m6100measurewNUYSr0(String str, TextStyle textStyle, int i2, boolean z2, int i3, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z3) {
        return m6099measurexDpz5zY$default(this, new AnnotatedString(str, null, null, 6, null), textStyle, i2, z2, i3, null, j2, layoutDirection, density, resolver, z3, 32, null);
    }

    /* JADX INFO: compiled from: TextMeasurer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʒ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u000fَ\u001a}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001dYy.Gz\u0016;\f!Es?\u001a\u001elkB\\", "", "u(E", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "BdgA?(R])\u000e^g7\r\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|y7XSJA", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(textLayoutInput.m6091getConstraintsmsEJaDk());
            int iM6591getMaxWidthimpl = ((textLayoutInput.getSoftWrap() || TextOverflow.m6569equalsimpl0(textLayoutInput.m6092getOverflowgIe3tQ8(), TextOverflow.Companion.m6577getEllipsisgIe3tQ8())) && Constraints.m6587getHasBoundedWidthimpl(textLayoutInput.m6091getConstraintsmsEJaDk())) ? Constraints.m6591getMaxWidthimpl(textLayoutInput.m6091getConstraintsmsEJaDk()) : Integer.MAX_VALUE;
            int maxLines = (textLayoutInput.getSoftWrap() || !TextOverflow.m6569equalsimpl0(textLayoutInput.m6092getOverflowgIe3tQ8(), TextOverflow.Companion.m6577getEllipsisgIe3tQ8())) ? textLayoutInput.getMaxLines() : 1;
            if (iM6593getMinWidthimpl != iM6591getMaxWidthimpl) {
                iM6591getMaxWidthimpl = RangesKt.coerceIn(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), iM6593getMinWidthimpl, iM6591getMaxWidthimpl);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.m6600fitPrioritizingWidthZbe2FdA(0, iM6591getMaxWidthimpl, 0, Constraints.m6590getMaxHeightimpl(textLayoutInput.m6091getConstraintsmsEJaDk())), maxLines, TextOverflow.m6569equalsimpl0(textLayoutInput.m6092getOverflowgIe3tQ8(), TextOverflow.Companion.m6577getEllipsisgIe3tQ8()), null), ConstraintsKt.m6605constrain4WqzIAM(textLayoutInput.m6091getConstraintsmsEJaDk(), IntSizeKt.IntSize((int) Math.ceil(r7.getWidth()), (int) Math.ceil(r7.getHeight()))), null);
        }
    }
}
