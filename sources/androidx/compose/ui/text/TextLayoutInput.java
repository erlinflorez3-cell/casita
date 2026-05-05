package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007t\tA0ZeP.hS2şs{B*cҕyCI^\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4կ]xs\u0012\u0017˰JoU3UoC9htL\u0005(2(Y\u0002\u0005\u000f&2Ϻ\u0016{\u0011ŏ{\f@/\u0001R@g\u001dQ\u0013\u001a*\u0006l!\u0011\"jif6vomJ='\u001buRV7e@~]\rt[U\u0013%f./N?M\u0015S\\\u0013\u000b`eW\u0003m|M\tv3?+w\u0001g:f\u000e,\u0015Y^\u001da\u00016t\u0005\u007fq\u001c+9a{K~!8{\t\u0010%<2#Ν+H<CZH\u000e\"Cx\u0001SXP0_R\u0004\tcN\u0017S\u0003C;G\u001f~]qC)TG}\u0015\rL*/tO`d\u0012n\u001d3T&ZAUNG`N8dMq\u0012|z\u0002X\u0011@K\u000e=\u0014\u0011\\&5;iI;!\u001a\u0013XHu\u000e\u001d`\u0017kyVVT:nDLҊ\r\fh]%pqPd\\:\u0011e\u001c\u0003\b\u000e\f!\"twj$5 \\S\u0001uzUm\u001051v7\bu\u001a\u0014\u0006>n7CY{\u0010\u0010[\u0007\u0018MFz\u0005\u0007qRW\u001aft(P?Xn\u001e\u0006\u0014D|\u001b#6M\u000244ZB)b#Z\u001b X@+\u001co^v'\u0017Ta<\u0013m2\t!\u0001~qʼsg\u0007ctʌ_0bYQcӧV[(hB|;\u0007-t0MmLUN\u0005\u0016$X,2\u001c\u001aGUGI#\u0017\u000f/B\u0004=Ezy\u0014W{\u0017W\u0001\u0003y\u001dC\u0001.\u0016\u0011\u001bv2`xTgTE-'dx#\u0016p\u0018y\u0010S+MiT\u0019iVI!\u0012\nBT8\u000b\u00157\u001eS\u0012 (\u00035;U?\u001dD\u000bD5\u001bak}\b.(wU+ݢdֽНg\u0018u\u0019_\u0015zLF\u0002q~l-Tr\u0011{`l\u000e\u0007p\bzٖ3\u0011Gr+n8{\u0014u\u0012/\r:H\tV\nvY\u0004NB<zBuY|Bq\u001aќ\u001dߠWguޮ\u001cs\u0019^'\n9\u0011лmܞЋ<\u001fݫ[j\u00110\u0014\u001208GWp\"\r\u00182BD<6\u001aͲXo\u000e؋\u0013\u0002L~\u001d7\u0003Q\u0002Rn\u000e\u0003\u0011חZN\rݺ]b'K\u000f!_B,\tM13~ܑX5kѢ\u0019U#,)\u000f \u000et-CD\u0003BЬ,^\tՊ]_In\u0010\\T^7y\u0004o:Eć{܈Ħ\u0017\u001aʦU\u0019gv>\u0007#Wjur\u001db\u0002`R:5\u000f\u0003\r\u0014L\f\u001f\u000bGV!u\u00112ٮR}?Ƒ2\u0003\u001dm71\\\u0015qX3-4Hc\u0002 ݥ\u0016ր\u007fac=\u00043.L?\u0006zNj\u0006^u\u0018g3:D|їf\b\u0011ސh\"\n]X%C\u0019<\nNO06ě\u0017daŕ\u0010#FX9\u001fVQYh\u0011\n\u0012m̼r[\u0013ӆ~3\\-|aǣ\u001d\u0012/P4\u009ft\t9\u0019S&wӢ\u0004Q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|y7XSJA", "", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", ";`g\u0019\\5>a", "", "AnUAJ9:^", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "@db<h9<S\u007f\tv],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,\u0003.[MKx2\u001e{r]8\u0007p\u0002", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020\u00077y|U&\u001d9q:)Z\u001eVOxj%\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;)$l_wh{\\\u001fva\u000e=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\f{[Bax:>\u0014\u007fH4FscOt\u0018<m|\u001f52(#/5I\u001dCJv?jH\u0016s)o\bWr9z(exr\u0012\u0010\u0011f&%\u0016kh\u0010u?\u0006LS\u007f\"%FeLWx\u0015\u0016\\\tTkSR\"X\ncuU*)\u0015\f\u0012f%%*\u001d\u00078\u000fi&o>\\p\u0013qF\u001b\tiA$zUwiXx[dEg'", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020\u00077y|U&\u001d9q:)Z\u001eVOxj%\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;)$l_wh{\\\u001fva\u000e=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\f{[Bax:>\u0014\u007fH4FscOt\u0018<m|\u001f52(#/5I\u001dCJv?jH\u0016s)o\bWr9z(exr\u0012\u0010\u0011f&%\u0016kh\u0010\u0018N\u000eBP\u0004S\u0014F\rLb\u000b\u0015\u0016\\\tTkSR\"X\ncuU*)\u0015\f\u0012f%%*\u001d\u00078\u000fi&o>\\p\u0013qF\u001b\tiA$zUwiXx[dEg'", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020\u00077y|U&\u001d9q:)Z\u001eVOxj%\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;)$l_wh{\\\u001fva\u000e=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\f{[Bax:>\u0014\u007fH4FscOt\u0018<m|\u001f52(#/5I\u001dCJv?jH\u0016s)o\bWr9z(exr\u0012\u0010\u0011f&%\u0016kh\u0010u?\u0006LS\u007f\"%FeLWx\u0015\u0016\\\u000binHP%X\u007f-:B,g\u001c\r\u0011fa,2_LY\"ws`AV\"RIB\u0015\u000b:?\u001dtO$,8riav56\u0006f.d$", "-cTCX3H^\u0019\fhn7\b\u00103e~\u0015{N\u000b'$EotFr$5f", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "\u0018", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "5dc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rH\\\u0002hoC\u000et,[L", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "5dc\u001aT?%W\"~\t", "u(8", "5dc\u001ci,KT \t\r&.`\t|tkz", "\u0017", "5dc\u001d_(<S\u001c\t\u0002],\n\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001fX:Hc&|zE6x\b/r>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "u(E", "5dc\u001fX:Hc&|zE6x\b/r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%l:CIuD+\u0013hHC\u0003b,[L", "5dc b-ME&z\u0006", "u(I", "5dc g@ES", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhk/Kt\u0016\u0004", "5dc!X?M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", "1n_F", "1n_F /N\u001bdr{h", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:VsYT3\\SK&\b\u00020\u00077y|U&\u001d9q:)Z\u001eVOxj%\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;)$l_wh{\\\u001fva\u000e=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\f{[Bax:>\u0014\u007fH4FscOt\u0018<m|\u001f52(#/5I\u001dCJv?jH\u0016s)o\bWr9z(exr\u0012\u0010\u0011f&%\u0016kh\u0010u?\u0006LS\u007f\"%FeLWx\u0015\u0016\\\t1LEL\u001aa\u000b\u001eoWk]\u001b\u000b\u000ep&\u001cw&A#\u001eh=n\u0001<\u0013\u001cw\u001f\b\u0010cS$TQ\u001b}ZH", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextLayoutInput {
    public static final int $stable = 8;
    private Font.ResourceLoader _developerSuppliedResourceLoader;
    private final long constraints;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    @Deprecated(message = "\tU\nI?f\u001ajg\\:}U\u0001;O`Q\u001bf\u000e{Kd{VzkQy(&\u007fUxJ\rBwGZ\u00044G\u001bbeG\u0014][JqT9$", replaceWith = @ReplaceWith(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    @InterfaceC1492Gx
    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i2, z2, i3, density, layoutDirection, resourceLoader, j2);
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i2, z2, i3, density, layoutDirection, resolver, j2);
    }

    @Deprecated(message = "\u0015K\fArw\u001a[\u0018^1\u000fXT\u0012]j`n(\u0012q\u0018kD8s}]\u0001:kz", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getResourceLoader$annotations() {
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j2) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i2;
        this.softWrap = z2;
        this.overflow = i3;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = resolver;
        this.constraints = j2;
        this._developerSuppliedResourceLoader = resourceLoader;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8 */
    public final int m6092getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public final long m6091getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this._developerSuppliedResourceLoader;
        return resourceLoader == null ? DeprecatedBridgeFontResourceLoader.Companion.from(this.fontFamilyResolver) : resourceLoader;
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j2) {
        this(annotatedString, textStyle, list, i2, z2, i3, density, layoutDirection, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j2);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        this(annotatedString, textStyle, list, i2, z2, i3, density, layoutDirection, (Font.ResourceLoader) null, resolver, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-hu-1Yfo$default */
    public static /* synthetic */ TextLayoutInput m6089copyhu1Yfo$default(TextLayoutInput textLayoutInput, AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j2, int i4, Object obj) {
        if ((1 & i4) != 0) {
            annotatedString = textLayoutInput.text;
        }
        if ((2 & i4) != 0) {
            textStyle = textLayoutInput.style;
        }
        if ((i4 + 4) - (4 | i4) != 0) {
            list = textLayoutInput.placeholders;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            i2 = textLayoutInput.maxLines;
        }
        if ((16 & i4) != 0) {
            z2 = textLayoutInput.softWrap;
        }
        if ((i4 + 32) - (32 | i4) != 0) {
            i3 = textLayoutInput.overflow;
        }
        if ((i4 + 64) - (64 | i4) != 0) {
            density = textLayoutInput.density;
        }
        if ((i4 + 128) - (128 | i4) != 0) {
            layoutDirection = textLayoutInput.layoutDirection;
        }
        if ((256 & i4) != 0) {
            resourceLoader = textLayoutInput.getResourceLoader();
        }
        if ((i4 + 512) - (i4 | 512) != 0) {
            j2 = textLayoutInput.constraints;
        }
        return textLayoutInput.m6090copyhu1Yfo(annotatedString, textStyle, list, i2, z2, i3, density, layoutDirection, resourceLoader, j2);
    }

    @Deprecated(message = "\tU\nI?f\u001ajg\\:}U\u0001;O`Q\u001bf\u000e{KV{V\u0001oQu8kl", replaceWith = @ReplaceWith(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-hu-1Yfo */
    public final TextLayoutInput m6090copyhu1Yfo(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j2) {
        return new TextLayoutInput(annotatedString, textStyle, list, i2, z2, i3, density, layoutDirection, resourceLoader, this.fontFamilyResolver, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        return Intrinsics.areEqual(this.text, textLayoutInput.text) && Intrinsics.areEqual(this.style, textLayoutInput.style) && Intrinsics.areEqual(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m6569equalsimpl0(this.overflow, textLayoutInput.overflow) && Intrinsics.areEqual(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && Intrinsics.areEqual(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m6584equalsimpl0(this.constraints, textLayoutInput.constraints);
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + TextOverflow.m6570hashCodeimpl(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + Constraints.m6594hashCodeimpl(this.constraints);
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m6571toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m6596toStringimpl(this.constraints)) + ')';
    }
}
