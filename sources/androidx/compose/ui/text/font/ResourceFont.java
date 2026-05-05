package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004O\f8é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a4yCI^\"Ԃ*\t]ȞogtJb\u000bQ\u001b\u000eǝ~oBկ\u0006x\f\u0011OgHģO7[oU9\u000fuF\u000b&20:\u0012\u0005/\u001d:N\u0016v\tGc\f@5Pv@S\u001bS\u001d\u001a@\rN&\u0007\u001ejof6vuҺ>/1\r2n\\=w0+ձ=LZ'\u001bvy\u001eYAg;\u001b%a\u0005\u001fR\nB3Ew=\u0013l?'YN؎V̬ݼ\u0004\u0016\u001bB]%&54r\u001dQ\u000fϯW1UcYP&(&{,\u0013B\u0004\u001c\b?H\\0Jl\u000e\u000eAx\u000bSnU2dH\u007f\tiN\u0017S\tc1?\u001btWy;GU}\u0001͕\f̔ţ\u0005p'tb()&)o\u0010Q_mpCVk\"[Sl2\u000f)̺*L6U\u001fG{?/]9\u007faGC9k0i\u000b{G'npki\u0001QvwEރ9Ӡ\bȱ˧Ccʰo^\\X: ]\u001eZ\u0012\f\u0014+\"b\u0005J/u\u001f\\O\u0001i\u0019Nύ\u000e+7ωO[t{\u001ce\nxA9ic>f)ί\u0016ά;ϵܬWe͞W\u0014b\\61JJp!\u0006\n\u0015_\u001a\u0019J? #j1֞\u001db\u001dǽ\u001b HS\u000b\u001c0lv\u0012\u0017Ta'YȄ&ڲ\r\u0007Xʔ\tqm\rWAʌ`+5DWڣ5TT*h:\u001cɦ\u000b!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~F}.A}#,M$EtCs", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "@db\u0016W", "", "EdX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "D`a6T;B]\"lzm;\u0001\u00121s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", ":nP1\\5@A(\fvm,~\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FT *LGDm\"-\"dp9\tw\u0002", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCsxO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125Xr7u\u0005\b%\u0012?s/0V\u001fV}\u001ewO~L-_i\tNEN,/u\u0014)!eI:1\u001dm dGP/\u0006\fZ P\\\u0003uvT)xG.KUWSKob\u00128\u0018", "5dc\u0019b(=W\"\u0001hm9x\u0018/g\u0014of&i\u0004}([L8\u007f.?hy/;w\u001f<", "u(E", "5dc\u0019b(=W\"\u0001hm9x\u0018/g\u0014of&i\u0004}([", "u(8", "\u0017", "5dc\u001fX:\"R", "5dc g@ES`xBE\n{\u001b\u000b", "5dc#T9BO(\u0003\u0005g\u001a|\u0018>i\t*\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u001fIP?gC\"\u001fq '\u0007r;R\u007f)U\"", "5dc$X0@V(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCs", "1n_F", "1n_F \u0019>b\u0003\u0003^`", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCsx,H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018:\r\u0018h\u000b%xMFht,W\fKu~\fv\u0018>yF", "1n_F \r\f\\\u007fQ\u0001d", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCsxLH5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018:\r\u0018h\u000b%xMFhh6R\u0011,d\u000e\u0010\u0012\u001d9ty\u0001D\u0010V\t\u0019~C7>\n@[\u0003FNOf)wU]'dED2\u0014;)\u001f2_.\u001d\u000b\u001d\u0012|[\t1TG'\u0005H1<m<PN~+", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, fontWeight, i3, settings, i4);
    }

    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m6271getLoadingStrategyPKNRLFQ$annotations() {
    }

    private ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4) {
        this.resId = i2;
        this.weight = fontWeight;
        this.style = i3;
        this.variationSettings = settings;
        this.loadingStrategy = i4;
    }

    public final int getResId() {
        return this.resId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int i6 = i4;
        FontVariation.Settings settings2 = settings;
        int iM6240getNormal_LCdwA = i3;
        FontWeight normal = (i5 + 2) - (2 | i5) != 0 ? FontWeight.Companion.getNormal() : fontWeight;
        iM6240getNormal_LCdwA = (i5 + 4) - (4 | i5) != 0 ? FontStyle.Companion.m6240getNormal_LCdwA() : iM6240getNormal_LCdwA;
        this(i2, normal, iM6240getNormal_LCdwA, (i5 + 8) - (8 | i5) != 0 ? FontVariation.INSTANCE.m6255Settings6EWAqTQ(normal, iM6240getNormal_LCdwA, new FontVariation.Setting[0]) : settings2, (i5 + 16) - (i5 | 16) != 0 ? FontLoadingStrategy.Companion.m6224getAsyncPKNRLFQ() : i6, null);
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public int mo6188getStyle_LCdwA() {
        return this.style;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo6180getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    /* JADX INFO: renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m6270copyRetOiIg$default(ResourceFont resourceFont, int i2, FontWeight fontWeight, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i2 = resourceFont.resId;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i4 & 4) != 0) {
            i3 = resourceFont.mo6188getStyle_LCdwA();
        }
        return resourceFont.m6273copyRetOiIg(i2, fontWeight, i3);
    }

    /* JADX INFO: renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m6273copyRetOiIg(int i2, FontWeight fontWeight, int i3) {
        return m6269copyF3nL8kk$default(this, i2, fontWeight, i3, mo6180getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    /* JADX INFO: renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m6269copyF3nL8kk$default(ResourceFont resourceFont, int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 1)) != 0) {
            i2 = resourceFont.resId;
        }
        if ((i5 + 2) - (2 | i5) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            i3 = resourceFont.mo6188getStyle_LCdwA();
        }
        if ((i5 + 8) - (8 | i5) != 0) {
            i4 = resourceFont.mo6180getLoadingStrategyPKNRLFQ();
        }
        if ((i5 + 16) - (i5 | 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        return resourceFont.m6272copyF3nL8kk(i2, fontWeight, i3, i4, settings);
    }

    /* JADX INFO: renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m6272copyF3nL8kk(int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings) {
        return new ResourceFont(i2, fontWeight, i3, settings, i4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.resId == resourceFont.resId && Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && FontStyle.m6233equalsimpl0(mo6188getStyle_LCdwA(), resourceFont.mo6188getStyle_LCdwA()) && Intrinsics.areEqual(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m6220equalsimpl0(mo6180getLoadingStrategyPKNRLFQ(), resourceFont.mo6180getLoadingStrategyPKNRLFQ());
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m6234hashCodeimpl(mo6188getStyle_LCdwA())) * 31) + FontLoadingStrategy.m6221hashCodeimpl(mo6180getLoadingStrategyPKNRLFQ())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m6235toStringimpl(mo6188getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m6222toStringimpl(mo6180getLoadingStrategyPKNRLFQ())) + ')';
    }
}
