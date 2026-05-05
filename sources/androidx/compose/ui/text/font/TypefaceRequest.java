package androidx.compose.ui.text.font;

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
/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0$s{B-c$wCCU(\u0004*ޛWNusvϺ`ŐI%إFx\u0019+\n\u0005\tc \u000fJD\u0006>aN\u007fAGb\r63#B&F}\u001d\u0001H/X\u0014\u0005\u0001[K:\u0019@F~Bj\u000fc\u0004H\u0011ĂB \u000f'%p\\J`ns9]$IފC\u0017.mE\u0015M;I\u001bݒ\u000e?u,AX7c\u001akڌ\u0004\u008fQZУ\u0002ӊџA\u0007n>58\u0012\beNp\u007fB\u001cq̈́\u000eȗq%ڑ\u0004ĩԃ\u0010)1hqX\u0019\u00176\u0012\u0013}#;2\rLϰIvt(\u0002 \u000eaο#[FP\u0010^Z\u0002\u0011`d\u0018U\u00069+G\u001d~Q\u0010>IT={\u0013\u00116#/sQaZ\u000en\u001b3T&XaYF=VV\"[Sl2o)ͪ)̯/ϚĬ3}\u0017J%B\u007flGA9k0gtm\u0005%xjih\u0001G\u0007ͥo^>8*$Zr\u0007K®O\u001d_:4e\u001c\u0003+Dވ\u0012pm\u0006<9'&M}iȬnSe܃=1lAgy<%e=v3cVԨ\u000fР٥u\u0013͖@j\rXtPk\u000e`h6/\u0003_x\u0016\u0010{rUݵ\u0012ԵǦp\u001bٜ09!\\#V\u001b HP\u000b\u00160iv\u0012\u0017Ta'ғm*|է\u0019Rb\u0001}xIZ:\u0005x$C@\u007f4Ԋ*[*ֻL~)\u0019\r\u0007ÕGpTJR̠2$T\u0004 \u001c9\u0081UT"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;wD\u001e#w7", "", "4n]A9(FW \u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "4n]AF@Gb\u001c~\tb:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "@db<h9<S\u007f\tv],\nf+c\u0003(a@\u0015", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007f\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0006cJ38%A(\u0017\u001eI\u0006=k\u0010ayq\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d(Kl9k\u0010hfaKBm\u0018z(\u001buY*\u0011E2\u0011sN\nnv%#\u0004F3K}YUO|=8\u0002-\u001fXQ;\u0003", "5dc\u0013b5M4\u0015\u0007~e@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rHs", "5dc\u0013b5MA(\u0013\u0002^svP\u0016C~:W", "u(8", "\u0017", "5dc\u0013b5MA-\b\na,\u000b\r=-a\u0019l\u001cMv\u0007", "5dc\u0013b5ME\u0019\u0003|a;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCs", "5dc\u001fX:Hc&|zE6x\b/r]$yC\u0001|\u0017[", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(LBXscf.w[", "1n\\=b5>\\(M", "1n\\=b5>\\(MB@\u001dmd{Eo", "1n\\=b5>\\(N", "1n_F", "1n_F ,\n>\nkK)", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007f\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0006cJ38%A(\u0017\u001eI\u0006=k\u0010ayq\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d\u0005,^3c\u0019i![M\u0004\"\u001ey$%vPw\u001a\u007f\u001d re\t1hQ\"\n\u0002\u0013Rx[GAmU)t3/K\n\u0007g", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TypefaceRequest {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    private final FontWeight fontWeight;
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, fontWeight, i2, i3, obj);
    }

    /* JADX INFO: renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m6274copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj, int i4, Object obj2) {
        if ((i4 + 1) - (1 | i4) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i2 = typefaceRequest.fontStyle;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            i3 = typefaceRequest.fontSynthesis;
        }
        if ((i4 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        return typefaceRequest.m6277copye1PVR60(fontFamily, fontWeight, i2, i3, obj);
    }

    public final FontFamily component1() {
        return this.fontFamily;
    }

    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m6275component3_LCdwA() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: component4-GVVA2EU, reason: not valid java name */
    public final int m6276component4GVVA2EU() {
        return this.fontSynthesis;
    }

    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    /* JADX INFO: renamed from: copy-e1PVR60, reason: not valid java name */
    public final TypefaceRequest m6277copye1PVR60(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj) {
        return new TypefaceRequest(fontFamily, fontWeight, i2, i3, obj, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return Intrinsics.areEqual(this.fontFamily, typefaceRequest.fontFamily) && Intrinsics.areEqual(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m6233equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m6244equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && Intrinsics.areEqual(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int iHashCode = (((((((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + FontStyle.m6234hashCodeimpl(this.fontStyle)) * 31) + FontSynthesis.m6245hashCodeimpl(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m6235toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m6248toStringimpl(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i2;
        this.fontSynthesis = i3;
        this.resourceLoaderCacheKey = obj;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m6278getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m6279getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }
}
