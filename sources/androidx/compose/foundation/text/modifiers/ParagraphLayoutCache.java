package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: ParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\u007fICU \u0001*\teNogtSb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u00172XoG3SrE9vt>ӌ(208\u0002\u0005\u0007\u001c2H&v\u0003CQ\u000f\u001a0VpBĥ\u0015M\u001b\u001a\u001a\u0006D/\t\u001ergV6NocŽE݊3ipMg#@\u0001[\r^TU\u000e\u0007e,-X7c\u00185W\u0011\u000bj[m\bOwC\u0005v-?+wzg<^\u007f\"\u001dCO;f\u0003,b\u0005_j$'YZsQV\u000e6\u0004\u0013{;GǬ\u0012\u00065UvA(\u001f \u000ea\u007f#WN\n\u001a^p\u000b+eDQ=\u007faH\u0002;t\ry;G}g\u007f\u0013I6#/&Q_bHx\u0015Iq>QƱP̵ףLP\u0010\u0017K,L\u000fpAB\u0004^P03\nMF\u0017Sn\f=1[\u0004\u0002vaђuݓ¾lUo\u0013V\u0002jt$yB\t:\u0005\u000bdMw^\u0018p,?XLX\u00158 \u0013Ny@H/i(N}s\u001an[\u0018\"%]\u0004\u007fy|1&Wggc9_ (a\u0001.DCJ\u001d\u001dX\u0015_\u001a\fʐ[̥ϒ6JpV\u0006=\r\\\u001aZJ? Qd0?St\u0015v dB\n\u000b\u0017(rj&}\u0003|T\u0007w&\r\t/S%v}2\u0011IZ}'6u\b_\u00011&\u0004L\u00198\u000b#\u001f~\"\u0001wkZIdlDx\u0006\u007f.\u001a29\u007f4m\u0017\u001d\u0005A204uP\u0001miM@0+\u0001\b\u0019Sh\\r8n~8xjxZް\u0016ǱՑbt)TrMJmT\t_c\u0003\u00162ůU\u03a2\u0007YDѾ\t\t\u0013.6%/zxğAԩG'%ȶH:='y_\u007fn\\\u000b\u0013\u00154\u0005}\u0006BbD\u0001!\u00104ЧGΒMe\u0007Ж:&r\u0016P\\\u000by\u000eW\u0017J]KVX|p\u0005A$ߓ;̱j\u00134ݸ\tXaR!\t\u001e64y8\u000f\u0014\n\"b[%?R*܍yߑO\\\u0013ͧ_\u0018\u0019\u0018Ip(\u001bk=-̳nס4\u0006{̸\u0007UI\u0001\u001d<7C\u000bɹH\u0082\n͏Ԇh\u0005خ~\u0002N_\u001d7\u0003b\u0002\\n\u000e\u0003\u001b3ƈTЬ_Ѥɰ )ܣ\u0003\u001d;\u001e\u0007UI\u0007sibS\u00044\u0007x+/kx]&~'AC\u0003aqμd܁\u000fEeŝ\u001a\u000eD\u000e_)\u001cvFȲD±\u0001\u001dJȰkE_\u001dwv^ia٠p͒hv\u001aצ#`0R\u0017z+8rHeԦ\u001b۽vsz/Ry\u0006c\u0014.\u000f\u001d\\)5\u0013SݰRˊ,ݢُ,<ƹn\u0016/{e\u0001\f\u0018\u0016N8)\u001asO\f.ʫrŭa'Bσ\n\u0018h2\u0017Dp\"\n`X(C\u0018<<NQ\u001820H5̒w֏%@/ߜ=\u001aP\u0002\u0001x8\u001bC̜zТ\nӆј0UӖr/X\u001d\u0017G\u001e:!`r:?\\vǈ\u001d\u05ca\u0018\u0015.˿\u0007\u0014p+(O\u0012kGդ[ܣ\u0011+7մzm?0j\u001e, PǤ\u0010ցX(\u001d͇۱MGl\fb\u05ce^\u0006\rfj.\u0004ï\u0010w"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u007fdn5\tp(Yy\u000eC`X<k0n;\u0017\u00120", "", "BdgA", "", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016Q;b}'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001.\b?XK<r\n\u001b_n?s\u007f#R\u0018K\u0001)4.)vP`pyT\u0017)W\u000eHre'kA>-]v*#2T7\u0019{`\u001anYCFgH\u0015\u000b?3\u001cwdTT|e:\u00041,3w\u0005\u00182eJne", "1`R5X+\"\\(\f~g:\u0001\u0007\u0012e\u0004*~O", "1`R5X+\"\\(\f~g:\u0001\u0007\u0012e\u0004*~Od \"W~\u007f@u48", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2d]@\\;R", "5dc\u0011X5LW(\u00139_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u00139_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "2hS\u001ci,KT \t\r", "5dc\u0011\\+(d\u0019\f{e6\u000fG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "u(I", "Adc\u0011\\+(d\u0019\f{e6\u000fG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "uY\u0018#", "7mc?\\5LW\u0017\raZ@\u0007\u0019>D\u00045{>\u0010\u001b!P", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`bA7,Ga\u001d\u000e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBgxqh=\u0010c\u000bN\u007f5K[b\u0002", "\u0018", ":`h<h;,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc\u0019T@Hc(l~s,D|,y\b\u000fHB?\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "u(9", "Adc\u0019T@Hc(l~s,D\u0013Dm\u0015\u001df$?\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "uI\u0018#", ";LX;?0GS'\\\u0005g:\f\u0016+i\t(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg|lj \u000bl,\\T1PZ]9XV{=!g", "=ab2e=>4#\b\n</x\u00121e\u000e", "", "5dc\u001cU:>`*~[h5\ff2a\t*{N?\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "u(;8b;EW\"Hjg0\f^", "\u0017", ">`a.Z9:^\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:C", "5dc\u001dT9:U&z\u0006aj}\u0013?n~$\u000bD\u000b \u0011To\u0015<r35", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006a!BU\u007f-3x\u0019\u0004", "Adc\u001dT9:U&z\u0006aj}\u0013?n~$\u000bD\u000b \u0011To\u0015<r35", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W'r21[\u000b\u001cBpkq>", ">`a.Z9:^\u001cb\u0004m9\u0001\u0012=i}6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f=ZGDy8\u001c#>", ">qTC66Ga(\fvb5\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "7mc?\\5LW\u0017azb.\u007f\u0018", "EhSA[", ":`h<h;\u001dW&~xm0\u0007\u0012", ":`h<h;-S,\u000e", "1n]@g9:W\"\u000e\t", ":`h<h;-S,\u000eBDzGi\u0003x[", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=sXO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#, {@9,\u00047LW", ":`h<h;0W(\u0002Xh5\u000b\u0018<a\u00041\u000bN", ":`h<h;0W(\u0002Xh5\u000b\u0018<a\u00041\u000bNH|e\u0012PaOR", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=sX]", ";`a870Kb-", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "<df\u0019T@Hc(p~e3Y\t\u000ei\u0001){M\u0001 &", "<df\u0019T@Hc(p~e3Y\t\u000ei\u0001){M\u0001 &\u000fU\\\u0007WxH5", "Adc\u0019T@Hc(]~k,z\u00183o\t", "Ak^D69>O(~i^?\fo+y\n8\u000b-\u0001%'N~wI_5<`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "BnBAe0GU", "CoS.g,", "CoS.g,\u0006:i\r_h\u000fd", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016Q;b}'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001.\b?XK<r\n\u001b_n?s\u007f#R\u0018K\u0001)4.)vP`pyT\u0017)W\u000eHOP", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private boolean didOverflow;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private Paragraph paragraph;
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i2, z2, i3, i4);
    }

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i4;
        this.lastDensity = InlineDensity.Companion.m1636getUnspecifiedL26CHvs();
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.prevConstraints = Constraints.Companion.m6601fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (-1) - (((-1) - i5) | ((-1) - 8)) != 0 ? TextOverflow.Companion.m6576getClipgIe3tQ8() : i2, (i5 & 16) != 0 ? true : z2, (-1) - (((-1) - i5) | ((-1) - 32)) != 0 ? Integer.MAX_VALUE : i3, (i5 + 64) - (i5 | 64) == 0 ? i4 : 1, null);
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final void setDensity$foundation_release(Density density) {
        Density density2 = this.density;
        long jM1628constructorimpl = density != null ? InlineDensity.m1628constructorimpl(density) : InlineDensity.Companion.m1636getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jM1628constructorimpl;
        } else if (density == null || !InlineDensity.m1630equalsimpl0(this.lastDensity, jM1628constructorimpl)) {
            this.density = density;
            this.lastDensity = jM1628constructorimpl;
            markDirty();
        }
    }

    public final Unit getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return Unit.INSTANCE;
    }

    public final Paragraph getParagraph$foundation_release() {
        return this.paragraph;
    }

    public final void setParagraph$foundation_release(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.didOverflow;
    }

    public final void setDidOverflow$foundation_release(boolean z2) {
        this.didOverflow = z2;
    }

    /* JADX INFO: renamed from: getLayoutSize-YbymL2g$foundation_release */
    public final long m1650getLayoutSizeYbymL2g$foundation_release() {
        return this.layoutSize;
    }

    /* JADX INFO: renamed from: setLayoutSize-ozmzZPI$foundation_release */
    public final void m1652setLayoutSizeozmzZPI$foundation_release(long j2) {
        this.layoutSize = j2;
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA */
    public final boolean m1651layoutWithConstraintsK40F9xA(long j2, LayoutDirection layoutDirection) {
        boolean z2 = true;
        if (this.minLines > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
            MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
            this.mMinLinesConstrainer = minLinesConstrainerFrom;
            j2 = minLinesConstrainerFrom.m1640coerceMinLinesOh53vG4$foundation_release(j2, this.minLines);
        }
        boolean z3 = false;
        if (!m1649newLayoutWillBeDifferentK40F9xA(j2, layoutDirection)) {
            if (!Constraints.m6584equalsimpl0(j2, this.prevConstraints)) {
                Paragraph paragraph = this.paragraph;
                Intrinsics.checkNotNull(paragraph);
                this.layoutSize = ConstraintsKt.m6605constrain4WqzIAM(j2, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())), TextDelegateKt.ceilToIntPx(paragraph.getHeight())));
                if (TextOverflow.m6569equalsimpl0(this.overflow, TextOverflow.Companion.m6578getVisiblegIe3tQ8()) || (IntSize.m6808getWidthimpl(r3) >= paragraph.getWidth() && IntSize.m6807getHeightimpl(r3) >= paragraph.getHeight())) {
                    z2 = false;
                }
                this.didOverflow = z2;
                this.prevConstraints = j2;
            }
            return false;
        }
        Paragraph paragraphM1648layoutTextK40F9xA = m1648layoutTextK40F9xA(j2, layoutDirection);
        this.prevConstraints = j2;
        this.layoutSize = ConstraintsKt.m6605constrain4WqzIAM(j2, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraphM1648layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(paragraphM1648layoutTextK40F9xA.getHeight())));
        if (!TextOverflow.m6569equalsimpl0(this.overflow, TextOverflow.Companion.m6578getVisiblegIe3tQ8()) && (IntSize.m6808getWidthimpl(r3) < paragraphM1648layoutTextK40F9xA.getWidth() || IntSize.m6807getHeightimpl(r3) < paragraphM1648layoutTextK40F9xA.getHeight())) {
            z3 = true;
        }
        this.didOverflow = z3;
        this.paragraph = paragraphM1648layoutTextK40F9xA;
        return true;
    }

    public final int intrinsicHeight(int i2, LayoutDirection layoutDirection) {
        int i3 = this.cachedIntrinsicHeightInputWidth;
        int i4 = this.cachedIntrinsicHeight;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(m1648layoutTextK40F9xA(ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = i2;
        this.cachedIntrinsicHeight = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* JADX INFO: renamed from: update-L6sJoHM */
    public final void m1653updateL6sJoHM(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i4;
        markDirty();
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsicsParagraphIntrinsics$default = this.paragraphIntrinsics;
        if (paragraphIntrinsicsParagraphIntrinsics$default == null || layoutDirection != this.intrinsicsLayoutDirection || paragraphIntrinsicsParagraphIntrinsics$default.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            paragraphIntrinsicsParagraphIntrinsics$default = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, textStyleResolveDefaults, (List) null, (List) null, density, this.fontFamilyResolver, 12, (Object) null);
        }
        this.paragraphIntrinsics = paragraphIntrinsicsParagraphIntrinsics$default;
        return paragraphIntrinsicsParagraphIntrinsics$default;
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA */
    private final Paragraph m1648layoutTextK40F9xA(long j2, LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m6007Paragraph_EkL_Y(layoutDirection2, LayoutUtilsKt.m1637finalConstraintstfFHcEY(j2, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m1638finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m6569equalsimpl0(this.overflow, TextOverflow.Companion.m6577getEllipsisgIe3tQ8()));
    }

    /* JADX INFO: renamed from: newLayoutWillBeDifferent-K40F9xA */
    private final boolean m1649newLayoutWillBeDifferentK40F9xA(long j2, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m6584equalsimpl0(j2, this.prevConstraints)) {
            return false;
        }
        return Constraints.m6591getMaxWidthimpl(j2) != Constraints.m6591getMaxWidthimpl(this.prevConstraints) || ((float) Constraints.m6590getMaxHeightimpl(j2)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m6601fixedJhjzzOo(0, 0);
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.didOverflow = false;
    }

    public final TextLayoutResult slowCreateTextLayoutResultOrNull(TextStyle textStyle) {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(this.prevConstraints, 0, 0, 0, 0, 10, null);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, CollectionsKt.emptyList(), this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, jM6582copyZbe2FdA$default, (DefaultConstructorMarker) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) CollectionsKt.emptyList(), density, this.fontFamilyResolver), jM6582copyZbe2FdA$default, this.maxLines, TextOverflow.m6569equalsimpl0(this.overflow, TextOverflow.Companion.m6577getEllipsisgIe3tQ8()), null), this.layoutSize, null);
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public String toString() {
        return "ParagraphLayoutCache(paragraph=" + (this.paragraph != null ? "<paragraph>" : "null") + ", lastDensity=" + ((Object) InlineDensity.m1634toStringimpl(this.lastDensity)) + ')';
    }
}
