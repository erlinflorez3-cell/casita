package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
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
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: MultiParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\n=,Ӌ,qQA]\u001a\u0004\"\u0011O\\\u0006on`Z\u0013C%\u0006\u001exp.QU\u000f]\u001a\u000f8Fw?IMwމA`\u000b6\r 8\"@y\u001b\u0001\"*N\u0012~zYK\u0014\u00126@x:h\rU\u0005 \u0016\u000e>6\u0001&ձoNLHt]@3+\u0003wBV'e?\u0003ձ#Ͽ\u0005';u\"y;DE5-%\u0002\u0004\u0017ViA\u001b? @\u0015l5+CI\"\\F^\u0006\u0014#1g\r\fy6b\u000bQn\u0014?+}l[V\u0014(\u0006\u0005\u0014\rj\u000f\u001e\f-H<92f6\u0019C\txSN]\u001alR\b\u000bgF\u00195\u007fa;g*|P\u0010IϭR7\n\u0016U21-\u0007!\n_>d#Hlw\u007f<\u0002DKvf\n\bY6$~\u0012\u001a*2`w\u0004=-).EWg_GQ9k0d\u000bgѱ\u0004\u009bĈWkX{NV74E_!\f\tM\u0015\ty\u0002lXZC} b5\u0016\bA<иv˓Ƽ)\u0012T\u0006v!3SkB=/\u0015p n4\u001aesv3c\\\u0014\u0014o\u0001\u000f\u0014mX+\u001df\"ZS:e\r,0c`j>*BDā\u000bƎ\u0558Cs\"p:nah#\u0007\u001b\u001epL-\rm\t\u0001\u0010-p{2\u0011)<t7*\u0001`~\u001e\u007fxwHC`jUO{M\u0019TvRlB+;\u0007-\u00100Ku\r_L\u001bH&Y\na.\u001ag\u0002u=Ҙ\u000eȯȞ6\u00043\bZ6..[V?z+3??v.\u007f\b\u0019q\\dxLgTE%'b\u0001' d.~\u0012J\tM{T9bnM\u0001\u000bq<|A-\t-(=\u0001\u001e--9;O?\u001dD\u0003DA#nuw\u007f6\nh\u001f(\u0005e2<\u0012%\u0006a\u007fkҟ:ͯա]\u0001Dg23KhV2\u0010\bp\u0012\\\u000fIGo\u0006!ZF~#/,\u001970\u001b\u001fn[h/6}ԧ-ɾͫwE\u0004\\l\ru\u001d[e\u007fm\u001cV3֨V؝\u000e\u000b\u0004ς?\u001e*P8V\u0006m_ݸ\u0012֯\u001c6Iݥ3+J\u001f<6B;6 sZw\u001a(|\u0016E\u000e$Up\u0019ƾGټ\u0012`\u0001ִnJ\u000bwSxA,\u0007\u0018\u001dMn\u0005C5\u001dmtY\u0006ѵ>ݏW\u001d\u0011ƅ;]\r\u0002=-ZSg7~߳\rխI]K̲RJ\u0012dAm\u001a\u000ebՇ$ն\u001c\u00adʩ\u001a8ݔ\u0015a~0l*&r\\\u0005\u000f\u0014|Q|C\u007fͩ\u0007է\u0012<\u0012ۇ[*]\u0015\bdCK|\u0019m\bױ\u0005\u001b\\+\r/\u000b\b\u0017);+M/SH\u0019:}ضcĺ?}\u0010¶p3\u0012~9\\\u0006\u0019=ōiΌ>\u0016yд3\u000e\u0017\u001fh 29!Ɩ~˹2\b>ОRG\u0010\u0019vY\u001a~w̻3ÔkݩٕJgǰ\u000eetc||[\u0011tYn{\u0005,~F_\u07b3Yܻ\u0017Xbϐam.e)\u000e$\u001d6%F\nr)>_\u0012w\u0007j}icĎ;֗.a9È#*\f'\u0012u23+Ӓ!ͪZMFĹYhzDo\u000e\rm~˲\u0001צ-\u0014\u0005ۈ\u0019j\u001f\u0013LF!\u001f;ӸCق#[\u0015ӑ1\u0016\u0012oa&OR\t\u0004װ;6#q.\"\u001f'̏b}\b-H֞\u000f.f4-Lsٝ\u001eq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg|xhH\u000bN([r)THY/CN\u0007G$!8\nL.\rZ", "", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2UYr\t\u0011BOk9.li&k\u001b6,\u0018x-YUP<\u0014\u0003d\u0011\u007f(]\\K+\u007f\u007f45:7kUIv\u001f#x5.!b}\u001cA_x4>2\u0015<s:m\u0014Kt!:eBs,]=7-E\u001a\u001dHYr\u0003|<\u001dr,I\u0004\u001bh5>n)V", "1`R5X+\"\\(\f~g:\u0001\u0007\u0012e\u0004*~O", "1`R5X+\"\\(\f~g:\u0001\u0007\u0012e\u0004*~Od \"W~\u007f@u48", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2d]@\\;R", "5dc\u0011X5LW(\u00139_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u00139_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "7mc?\\5LW\u0017\raZ@\u0007\u0019>D\u00045{>\u0010\u001b!P", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`bA7,Ga\u001d\u000e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBgxqh=\u0010c\u000bN\u007f5K[b\u0002", "\u0018", ":`h<h;\u001cO\u0017\u0002z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", ":`h<h;(`\u0002\u000f\u0002e", "5dc\u0019T@Hc(h\bG<\u0004\u0010", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=:CI{;-j", ";LX;?0GS'\\\u0005g:\f\u0016+i\t(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg|lj \u000bl,\\T1PZ]9XV{=!g", "\u0017", ">`a.Z9:^\u001cb\u0004m9\u0001\u0012=i}6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u001ftC+\u0019qo=\u0005q\u0002", "BdgA?(R])\u000eg^:\r\u0010>", "5dc!X?M:\u0015\u0013\u0005n;i\t=u\u00077", "7mc?\\5LW\u0017azb.\u007f\u0018", "EhSA[", ":`h<h;\u001dW&~xm0\u0007\u0012", ":`h<h;-S,\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u0011", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":`h<h;-S,\u000eBDzGi\u0003x[", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=sXO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#)4uS;\n\u00049E\u0004Hd\f\u000fk", ":`h<h;0W(\u0002Xh5\u000b\u0018<a\u00041\u000bN", ":`h<h;0W(\u0002Xh5\u000b\u0018<a\u00041\u000bNH|e\u0012PaOR", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=sX]", ";`a870Kb-", "", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", ";`g$\\+MV", ";`g$\\+MV`[gM9\u0011\u0013y", "uI\u0018\u0016", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "Adc\u0019T@Hc(]~k,z\u00183o\t", "4h]._\nH\\'\u000e\bZ0\u0006\u0018=", ";t[A\\\u0017:`\u0015\u0001\bZ7\u007f", "BdgA?(R])\u000eg^:\r\u0010>-p\u000ebCk\b\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\n\u0003{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u001dN>\u001cNAQ+}H\"\u001b\u0015(K\u000f7s\u0004aYt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\f\\MI\u000b\u0010\u0006#+w=.\u0018\fZ H", "CoS.g,", "CoS.g,\u0006H\u0002\u000bZR\u0010z", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2UYr\t\u0011BOk9.li&k\u001b6,\u0018x-YUP<\u0014\u0003d\u0011\u007f(]\\K+\u007f\u007f45:7kUIv\u001f#x5.!?h", "<df\u0019T@Hc(p~e3Y\t\u000ei\u0001){M\u0001 &", "<df\u0019T@Hc(p~e3Y\t\u000ei\u0001){M\u0001 &\u000f`s#y\u0010&M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u001bMQKrCsyO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W^4\u0011\u0014#( \u0003NG.f0V\u00029w\u0005\u0016\u001fcx_", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultiParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private TextLayoutResult layoutCache;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, i2, z2, i3, i4, list);
    }

    private MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i4;
        this.placeholders = list;
        this.lastDensity = InlineDensity.Companion.m1636getUnspecifiedL26CHvs();
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i5 & 8) != 0 ? TextOverflow.Companion.m6576getClipgIe3tQ8() : i2, (-1) - (((-1) - i5) | ((-1) - 16)) != 0 ? true : z2, (-1) - (((-1) - i5) | ((-1) - 32)) != 0 ? Integer.MAX_VALUE : i3, (i5 & 64) == 0 ? i4 : 1, (i5 & 128) != 0 ? null : list, null);
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

    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final TextLayoutResult getLayoutOrNull() {
        return this.layoutCache;
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m1646layoutWithConstraintsK40F9xA(long j2, LayoutDirection layoutDirection) {
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
        if (!m1644newLayoutWillBeDifferentVKLhPVY(this.layoutCache, j2, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            Intrinsics.checkNotNull(textLayoutResult);
            if (Constraints.m6584equalsimpl0(j2, textLayoutResult.getLayoutInput().m6091getConstraintsmsEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            Intrinsics.checkNotNull(textLayoutResult2);
            this.layoutCache = m1645textLayoutResultVKLhPVY(layoutDirection, j2, textLayoutResult2.getMultiParagraph());
            return true;
        }
        this.layoutCache = m1645textLayoutResultVKLhPVY(layoutDirection, j2, m1642layoutTextK40F9xA(j2, layoutDirection));
        return true;
    }

    /* JADX INFO: renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    private final TextLayoutResult m1645textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j2, MultiParagraph multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List<AnnotatedString.Range<Placeholder>> listEmptyList = this.placeholders;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        int i2 = this.maxLines;
        boolean z2 = this.softWrap;
        int i3 = this.overflow;
        Density density = this.density;
        Intrinsics.checkNotNull(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, listEmptyList, i2, z2, i3, density, layoutDirection, this.fontFamilyResolver, j2, (DefaultConstructorMarker) null), multiParagraph, ConstraintsKt.m6605constrain4WqzIAM(j2, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(fMin), TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()))), null);
    }

    public final int intrinsicHeight(int i2, LayoutDirection layoutDirection) {
        int i3 = this.cachedIntrinsicHeightInputWidth;
        int i4 = this.cachedIntrinsicHeight;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(m1642layoutTextK40F9xA(ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = i2;
        this.cachedIntrinsicHeight = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* JADX INFO: renamed from: update-ZNqEYIc, reason: not valid java name */
    public final void m1647updateZNqEYIc(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i4;
        this.placeholders = list;
        markDirty();
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            List<AnnotatedString.Range<Placeholder>> listEmptyList = this.placeholders;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyleResolveDefaults, listEmptyList, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m1642layoutTextK40F9xA(long j2, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return new MultiParagraph(layoutDirection2, LayoutUtilsKt.m1637finalConstraintstfFHcEY(j2, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m1638finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m6569equalsimpl0(this.overflow, TextOverflow.Companion.m6577getEllipsisgIe3tQ8()), null);
    }

    /* JADX INFO: renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m1644newLayoutWillBeDifferentVKLhPVY(TextLayoutResult textLayoutResult, long j2, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m6584equalsimpl0(j2, textLayoutResult.getLayoutInput().m6091getConstraintsmsEJaDk())) {
            return false;
        }
        return Constraints.m6591getMaxWidthimpl(j2) != Constraints.m6591getMaxWidthimpl(textLayoutResult.getLayoutInput().m6091getConstraintsmsEJaDk()) || ((float) Constraints.m6590getMaxHeightimpl(j2)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    /* JADX INFO: renamed from: maxWidth-BRTryo0, reason: not valid java name */
    private final int m1643maxWidthBRTryo0(long j2) {
        boolean z2 = this.softWrap;
        int i2 = this.overflow;
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        Intrinsics.checkNotNull(multiParagraphIntrinsics);
        return LayoutUtilsKt.m1639finalMaxWidthtfFHcEY(j2, z2, i2, multiParagraphIntrinsics.getMaxIntrinsicWidth());
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }
}
