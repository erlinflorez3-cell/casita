package com.ticnow.sdk.idnowonboarding.model.customization;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005:4\u0012\u0006\rnj?FZ͜x.\u0001Rj\u0012ө\u007f42[t\u0010Q<m\u001c\u0014!7Q\u0005k&r!ҡ\u0017ß\u0013\u0012\u001eю\u0003.OX\u0007a2\u00118G}E\u0004k}DQb\u000b53\"h&v}[З&ݵL\u001c~ٙ[M\u0012\u001a>D\u0011<X\u0016[\u000bj0\u0014H8\u00034[\u0016PlL+a\u0011Ǌ/ɨmNVϋw2\u0003X\u001bJt)\u0013\u0003o${^EB-'i\u00025T\u0012CACHܽ\u0011ص+33ɞ\fY<f\u000e\u00185-U\u001ckxvz\u0013ax\u000e=*}e\u0002TL,N߆\bɁ@\u0010\u0016ͺ?J4>(j(\u00109\u0007\u0001Y\u0011n\u0010qZ\u0002\u0011`d\u0019[\u0004q/\u0010ӝrЂeG!\u05cbO}\u000b!,'!p'pb\u001413)j\u0010SGPn?~RH]\u0014Я\u0010Ͳf\u000e2ʶHI\u0006F\n\u0015N\u0019+Oi?s?y\u001b`F}u3b\u001fW(V\u001f؟.å\u001aC2\u009e$\\J~\u0013opV^G\u001fSlt\u0015\u001a \u00156[&YW)NR&ŞuҷQk\u0012%=\tO[t\n\u001cvY`9U_\u0005`\u0002`\u001a,ARa3u\u001dF\u0012\u00101٪4ϒ6Vr\u0010\u0006\u001e\\P\u00127@^\u0012\u001e:Q?:-3V)6DW{7a\u0011lN\u0003+դ0ғm0|է\u0019Rb\u0018}k\u0019K2%n(}__^1(k!\u001763'E\u0003JÚSѨPST˾.w[&.\u001a:;WZK\u0019_\u001f7^\u001a/[K!\u0003\bQP+Qۨ\u0006ӛ?v6g\u0016\r\t.f\u0018Xnt\u0019(%l\u0014s&r/\u0012c\\yue\u000b\u000f\u001aB ·\u000fʾ@Z@و\u001d!$U\u000fsB~;^Q-m4\u0006FG\u0017w\\\u0018qd}!\u0013|۱qנ0o\u001e˱zSceI<i[\u0005r0*р\u0007w"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\nl`\u0002G\u001c\u0016o\n]/\u0017\u000e/", "", "u(E", "0`R866E]&", "", "5dc\u000fT*D1#\u0006\u0005k", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*D1#\u0006\u0005k", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0`R8Z9Hc\"}Xh3\u0007\u0016", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "0tcAb5\u001dW'zwe,{f9l\n5", "5dc\u000fh;M]\"]~l(y\u0010/d]2\u0003J\u000e", "Adc\u000fh;M]\"]~l(y\u0010/d]2\u0003J\u000e", "0tcAb5\u001dW'zwe,{w/x\u000f\u0006\u0006G\u000b$", "5dc\u000fh;M]\"]~l(y\u0010/dn(\u000fO^!\u001eQ|", "Adc\u000fh;M]\"]~l(y\u0010/dn(\u000fO^!\u001eQ|", "0tcAb5\u001e\\\u0015{\u0002^+Z\u00136o\r", "5dc\u000fh;M]\"^\u0004Z)\u0004\t.C\n/\u0006M", "Adc\u000fh;M]\"^\u0004Z)\u0004\t.C\n/\u0006M", "0tcAb5\u001e\\\u0015{\u0002^+k\tBt]2\u0003J\u000e", "5dc\u000fh;M]\"^\u0004Z)\u0004\t.T\u007f;\u000b\u001e\u000b\u001e!T", "Adc\u000fh;M]\"^\u0004Z)\u0004\t.T\u007f;\u000b\u001e\u000b\u001e!T", "1k^@X\nHZ#\f", "5dc\u0010_6LSv\t\u0002h9", "Adc\u0010_6LSv\t\u0002h9", "2db0e0Ib\u001d\t\u0004<6\u0004\u0013<", "5dc\u0011X:<`\u001d\n\nb6\u0006f9l\n5", "Adc\u0011X:<`\u001d\n\nb6\u0006f9l\n5", "3mc2e7KW'~ah.\u0007", "", "5dc\u0012a;>`$\f~l,c\u00131o", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0012a;>`$\f~l,c\u00131o", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "4`X9X+\"Q#\b", "5dc\u0013T0ES\u0018bxh5", "Adc\u0013T0ES\u0018bxh5", "6h]AG,Qbv\t\u0002h9", "5dc\u0015\\5MB\u0019\u0012\n<6\u0004\u0013<", "Adc\u0015\\5MB\u0019\u0012\n<6\u0004\u0013<", "7m_Bg\nHZ#\f", "5dc\u0016a7Nbv\t\u0002h9", "Adc\u0016a7Nbv\t\u0002h9", "AtR2f:\"Q#\b", "5dc h*>a'bxh5", "Adc h*>a'bxh5", "Ata3T*>1#\u0006\u0005k", "5dc h9?O\u0017~Xh3\u0007\u0016", "Adc h9?O\u0017~Xh3\u0007\u0016", "BhcA_,\u001c] \t\b", "5dc!\\;MZ\u0019\\\u0005e6\n", "Adc!\\;MZ\u0019\\\u0005e6\n", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IdNowCustomization {

    @SerializedName(alternate = {}, value = "\t\u0007\b\u000fe\u0011\r\u000f\u0011")
    @InterfaceC1492Gx
    private String backColor;

    @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b")
    @InterfaceC1492Gx
    private String backgroundColor;

    @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010d\t\u0012~~\b\u007f}[\u0007\u0003\u0005\u0007")
    @InterfaceC1492Gx
    private String buttonDisabledColor;

    @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010d\t\u0012~~\b\u007f}l|\u000f\nW\u0003~\u0001\u0003")
    @InterfaceC1492Gx
    private String buttonDisabledTextColor;

    @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010e\u000e\u007f\u007f\t\u0001~\\\b\u0004\u0006\b")
    @InterfaceC1492Gx
    private String buttonEnabledColor;

    @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010e\u000e\u007f\u007f\t\u0001~m}\u0010\u000bX\u0004\u007f\u0002\u0004")
    @InterfaceC1492Gx
    private String buttonEnabledTextColor;

    @SerializedName(alternate = {}, value = "\n\u0012\u0014\u0017\bd\u0010\f\u000e\u0010")
    @InterfaceC1492Gx
    private String closeColor;

    @SerializedName(alternate = {}, value = "\u000b\u000b\u0018\u0007\u0015\u000b\u0011\u0014\b\r\u000b^\n\u0006\b\n")
    @InterfaceC1492Gx
    private String descriptionColor;

    @SerializedName(alternate = {}, value = "\f\u0014\u0019\t\u0015\u0012\u0013\t\u0012\u0003h\u000b\u0002\t")
    @InterfaceC1492Gx
    private Integer enterpriseLogo;

    @SerializedName(alternate = {}, value = "\r\u0007\u000e\u0010\b\u0006i\u0003\u000e\f")
    @InterfaceC1492Gx
    private Integer failedIcon;

    @SerializedName(alternate = {}, value = "\u000f\u000f\u0013\u0018v\u0007\u0019\u0014a\r\t\u000b\r")
    @InterfaceC1492Gx
    private String hintTextColor;

    @SerializedName(alternate = {}, value = "\u0010\u0014\u0015\u0019\u0017d\u0010\f\u000e\u0010")
    @InterfaceC1492Gx
    private String inputColor;

    @SerializedName(alternate = {}, value = "\u001a\u001b\b\t\u0016\u0015i\u0003\u000e\f")
    @InterfaceC1492Gx
    private Integer sucessIcon;

    @SerializedName(alternate = {}, value = "\u001a\u001b\u0017\n\u0004\u0005\u0006b\u000e\n\f\u000e")
    @InterfaceC1492Gx
    private String surfaceColor;

    @SerializedName(alternate = {}, value = "\u001b\u000f\u0019\u0018\u000f\u0007c\u000f\u000b\r\u000f")
    @InterfaceC1492Gx
    private String tittleColor;

    public final String getBackColor() {
        return this.backColor;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getButtonDisabledColor() {
        return this.buttonDisabledColor;
    }

    public final String getButtonDisabledTextColor() {
        return this.buttonDisabledTextColor;
    }

    public final String getButtonEnabledColor() {
        return this.buttonEnabledColor;
    }

    public final String getButtonEnabledTextColor() {
        return this.buttonEnabledTextColor;
    }

    public final String getCloseColor() {
        return this.closeColor;
    }

    public final String getDescriptionColor() {
        return this.descriptionColor;
    }

    public final Integer getEnterpriseLogo() {
        return this.enterpriseLogo;
    }

    public final Integer getFailedIcon() {
        return this.failedIcon;
    }

    public final String getHintTextColor() {
        return this.hintTextColor;
    }

    public final String getInputColor() {
        return this.inputColor;
    }

    public final Integer getSucessIcon() {
        return this.sucessIcon;
    }

    public final String getSurfaceColor() {
        return this.surfaceColor;
    }

    public final String getTittleColor() {
        return this.tittleColor;
    }

    public final void setBackColor(String str) {
        this.backColor = str;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setButtonDisabledColor(String str) {
        this.buttonDisabledColor = str;
    }

    public final void setButtonDisabledTextColor(String str) {
        this.buttonDisabledTextColor = str;
    }

    public final void setButtonEnabledColor(String str) {
        this.buttonEnabledColor = str;
    }

    public final void setButtonEnabledTextColor(String str) {
        this.buttonEnabledTextColor = str;
    }

    public final void setCloseColor(String str) {
        this.closeColor = str;
    }

    public final void setDescriptionColor(String str) {
        this.descriptionColor = str;
    }

    public final void setEnterpriseLogo(Integer num) {
        this.enterpriseLogo = num;
    }

    public final void setFailedIcon(Integer num) {
        this.failedIcon = num;
    }

    public final void setHintTextColor(String str) {
        this.hintTextColor = str;
    }

    public final void setInputColor(String str) {
        this.inputColor = str;
    }

    public final void setSucessIcon(Integer num) {
        this.sucessIcon = num;
    }

    public final void setSurfaceColor(String str) {
        this.surfaceColor = str;
    }

    public final void setTittleColor(String str) {
        this.tittleColor = str;
    }
}
