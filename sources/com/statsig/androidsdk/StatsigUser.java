package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4I\u0007\":4\u007f\u0007l\u0007A0RnP.XZ2\u000fy\u0002<$a&w٘Akڼ.\"7N\u000fvwvPZ\u0019C'\b,w\u0019-֒Yxk\u0014W;P\u0017W5cnk:'ӡ7M3@JPy3ЏJ2N\u0010\u0005z[M\"\u0011^A7ĴQU^\u0013C*\u0006lJ1$j\u0013f8^k\f9uޡ\u00042F\\Sw0+NUQbT%v\u0010\u001fq?˝9\u0015+\u0002K\u0012`\u000bW\u0003mм\u0004ݛص+'1y<bD\n\u0018\u0014Cۀ\u0016Օǁv&b7\u001ag\u001aZCO\u0012\u007f\u0017̂'@\u0006\nBT\u0004<\u0007mΞͶ1\u001al>V:\u0003*k@~\u0003%ܤ~K\u007fD\u001a=\u0002I*g\u001c\u001dU ?oדC߉\t\u0019&ŀ\u0019p'_b\u0013\u0001\u0017!Z\u0006S\u0002oND`P Xkn:t!\u0006\u0001ʾ<Ͻ\u0004;\u0004߾F\u0019+?i>C#q\u000bVF8!\u0013j\u0001ayTX@Po&9:\t:YZc3v\u0007X\u00170gۻ(Τ\u000b\n\u0010ʶ8^}H/20PUvwy\u001e\b\u00185GtG[~k<XI`C5\u007fd&`\u0001\u0002JCzf[֢r͞W\u0018b٢@$8Yx\u001d\u0018}J`\u001a\"\u0003]\u007f/L.G\u0018\u000b\u0016~\u0007\\F\u0018ҙ\u0015ރ^t\u0018зl5*\u0017w)\u0015\u000b\u0007ejr@\u0006\u0007_D~v![B\b9W*,Ȱtط\u0001/\u000fѨ\f\u0002M~ZLln\u001c\u000ec}p4(Ri1S\u0012=\u007f_6@1\u001cɫ~ϯUY\u001a\u05fd\u0013~\u007f)ImNi\u000e\u0006~.1\u0015Xkl%2xnrQ\tt\u0002\naty]b\u0003\u0016\u0012B\bvYʣHҡ<\t\rȔ6'\u0007\r0\nU/IE+%H>=4ykyq>y\u0011\u00106vu\u0004Zd,n\u0011\\\u0014Цyͯ ʴ\u000bй&0t×ZJp\u0018\u0016O)6\u0013TVP5\u000fdZe\rE|\u0015\bb\u0011/Z2ƭ\u001f̭\u0002@6ɾBuI!\"cc'\u0017qai>\fY\\#L%\t9|grP \u0014պb͓f\u00158ү\f\u001a<fIg%>\u000fJB.ѭ\fC"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "", "CrT?<\u000b", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "/o_#X9LW#\b", "5dc\u000ec7/S&\r~h5", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000ec7/S&\r~h5", "1nd;g9R", "5dc\u0010b<Gb&\u0013", "Adc\u0010b<Gb&\u0013", "1tbAb4", "", "5dc\u0010h:M]!", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc\u0010h:M]!", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "1tbAb4\"2'", "5dc\u0010h:M]!bYl", "Adc\u0010h:M]!bYl", "3lP6_", "5dc\u0012`(BZ", "Adc\u0012`(BZ", "7o", "5dc\u0016c", "Adc\u0016c", ":nR._,", "5dc\u0019b*:Z\u0019", "Adc\u0019b*:Z\u0019", ">qXCT;>/(\u000e\bb)\r\u0018/s", "5dc\u001de0OO(~Vm;\n\r,u\u000f(\n", "Adc\u001de0OO(~Vm;\n\r,u\u000f(\n", "AsPAf0@3\"\u0010~k6\u0006\u0011/n\u000f", "5dc g(Ma\u001d\u0001Zg=\u0001\u00169n\b(\u0005O?\u0013 F|\u0018@u\u001fCX\u0004\u001aDm\u001d.IQ;", "Adc g(Ma\u001d\u0001Zg=\u0001\u00169n\b(\u0005O?\u0013 F|\u0018@u\u001fCX\u0004\u001aDm\u001d.IQ;", "CrT?4.>\\(", "5dc\"f,K/\u001b~\u0004m", "Adc\"f,K/\u001b~\u0004m", "5dc\"f,K7w", "Adc\"f,K7w", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "5dc\u0010T*AS~~\u000f", "5dc\u0010T*AS~~\u000f=\fgu\u000fC[\u0017[\u001f", "5dc\u0010T*AS~~\u000f=\fgu\u000fC[\u0017[\u001f?\u0013 F|\u0018@u\u001fCX\u0004\u001aDm\u001d.IQ;", "5dc\u0010b7R4#\fZo(\u0004\u0019+t\u00042\u0005", "5dc\u0010b7R4#\fZo(\u0004\u0019+t\u00042\u0005~| \u0016Ty\u0012;p34_w-7t\u0016*[C", "5dc\u0010b7R4#\fah.~\r8g", "5dc\u0010b7R4#\fah.~\r8g>$\u0005?\u000e!\u001bFi\u001c;|\u001fBY\u0005 3{\u0016", "6`b566=S", "", "Bn7.f/,b&\u0003\u0004`", "Bn7.f/,b&\u0003\u0004`jx\u0012.r\n,z:\u000f\u0016\u001dA|\u000eCv!CY", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigUser {

    @SerializedName(alternate = {}, value = "\b\u0016\u0015y\b\u0014\u0014\t\u000e\f")
    @InterfaceC1492Gx
    private String appVersion;

    @SerializedName(alternate = {}, value = "\n\u0015\u001a\u0012\u0017\u0014\u001a")
    @InterfaceC1492Gx
    private String country;

    @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000f")
    @InterfaceC1492Gx
    private Map<String, ? extends Object> custom;

    @SerializedName(alternate = {}, value = "\n\u001b\u0018\u0018\u0012\u000fic\u0012")
    @InterfaceC1492Gx
    private Map<String, String> customIDs;

    @SerializedName(alternate = {}, value = "\f\u0013\u0006\r\u000f")
    @InterfaceC1492Gx
    private String email;

    @SerializedName(alternate = {}, value = "\u0010\u0016")
    @InterfaceC1492Gx
    private String ip;

    @SerializedName(alternate = {}, value = "\u0013\u0015\b\u0005\u000f\u0007")
    @InterfaceC1492Gx
    private String locale;

    @SerializedName(alternate = {}, value = "\u0017\u0018\u000e\u001a\u0004\u0016\u0006`\u0013\u0012\u000f\u0005|\u000f\r|\n")
    @InterfaceC1492Gx
    private Map<String, ? extends Object> privateAttributes;

    @SerializedName(alternate = {}, value = "\u001a\u001a\u0006\u0018\u0016\u000b\bd\r\u0014\u0006\u000e\n\b\u0006|\u0005\n")
    @InterfaceC1492Gx
    private Map<String, String> statsigEnvironment;

    @SerializedName(alternate = {}, value = "\u001c\u0019\n\u0016c\t\u0006\u000e\u0013")
    @InterfaceC1492Gx
    private String userAgent;

    @SerializedName(alternate = {}, value = "\u001c\u0019\n\u0016ke")
    @InterfaceC1492Gx
    private String userID;

    public StatsigUser() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StatsigUser(String str) {
        this.userID = str;
    }

    public /* synthetic */ StatsigUser(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? null : str);
    }

    public static /* synthetic */ StatsigUser copy$default(StatsigUser statsigUser, String str, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = statsigUser.userID;
        }
        return statsigUser.copy(str);
    }

    public final String component1() {
        return this.userID;
    }

    public final StatsigUser copy(String str) {
        return new StatsigUser(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatsigUser) && Intrinsics.areEqual(this.userID, ((StatsigUser) obj).userID);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getCacheKey() {
        String str = this.userID;
        if (str == null) {
            str = StatsigUserKt.STATSIG_NULL_USER;
        }
        Map<String, String> mapEmptyMap = this.customIDs;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        for (Map.Entry<String, String> entry : mapEmptyMap.entrySet()) {
            str = str + entry.getKey() + AbstractJsonLexerKt.COLON + entry.getValue();
        }
        return str;
    }

    @Deprecated(message = "\u0007K\fGvw\u0016kaU/:S\u0016/Va\f\u0014,\u001e(\u001b`6Or}", replaceWith = @ReplaceWith(expression = "getCacheKeyWithSDKKey", imports = {}))
    @InterfaceC1492Gx
    public final String getCacheKeyDEPRECATED$android_sdk_release() {
        String str = this.userID;
        if (str == null) {
            str = StatsigUserKt.STATSIG_NULL_USER;
        }
        Map<String, String> map = this.customIDs;
        if (map == null) {
            return str;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str + entry.getKey() + AbstractJsonLexerKt.COLON + entry.getValue();
        }
        return str;
    }

    public final StatsigUser getCopyForEvaluation$android_sdk_release() {
        StatsigUser statsigUser = new StatsigUser(this.userID);
        statsigUser.email = this.email;
        statsigUser.ip = this.ip;
        statsigUser.userAgent = this.userAgent;
        statsigUser.country = this.country;
        statsigUser.locale = this.locale;
        statsigUser.appVersion = this.appVersion;
        Map<String, ? extends Object> map = this.custom;
        statsigUser.custom = map == null ? null : MapsKt.toMap(map);
        Map<String, String> map2 = this.statsigEnvironment;
        statsigUser.statsigEnvironment = map2 == null ? null : MapsKt.toMap(map2);
        Map<String, String> map3 = this.customIDs;
        statsigUser.customIDs = map3 == null ? null : MapsKt.toMap(map3);
        Map<String, ? extends Object> map4 = this.privateAttributes;
        statsigUser.privateAttributes = map4 != null ? MapsKt.toMap(map4) : null;
        return statsigUser;
    }

    public final StatsigUser getCopyForLogging$android_sdk_release() {
        StatsigUser statsigUser = new StatsigUser(this.userID);
        statsigUser.email = this.email;
        statsigUser.ip = this.ip;
        statsigUser.userAgent = this.userAgent;
        statsigUser.country = this.country;
        statsigUser.locale = this.locale;
        statsigUser.appVersion = this.appVersion;
        statsigUser.custom = this.custom;
        statsigUser.statsigEnvironment = this.statsigEnvironment;
        statsigUser.customIDs = this.customIDs;
        statsigUser.privateAttributes = null;
        return statsigUser;
    }

    public final String getCountry() {
        return this.country;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final Map<String, String> getCustomIDs() {
        return this.customIDs;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final Map<String, Object> getPrivateAttributes() {
        return this.privateAttributes;
    }

    public final Map<String, String> getStatsigEnvironment$android_sdk_release() {
        return this.statsigEnvironment;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        String str = this.userID;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setCustom(Map<String, ? extends Object> map) {
        this.custom = map;
    }

    public final void setCustomIDs(Map<String, String> map) {
        this.customIDs = map;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setIp(String str) {
        this.ip = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setPrivateAttributes(Map<String, ? extends Object> map) {
        this.privateAttributes = map;
    }

    public final void setStatsigEnvironment$android_sdk_release(Map<String, String> map) {
        this.statsigEnvironment = map;
    }

    public final void setUserAgent(String str) {
        this.userAgent = str;
    }

    public final void setUserID(String str) {
        this.userID = str;
    }

    public final String toHashString$android_sdk_release() {
        Hashing hashing = Hashing.INSTANCE;
        String json = StatsigUtil.INSTANCE.getGson$android_sdk_release().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "StatsigUtil.getGson().toJson(this)");
        return hashing.getHashedString(json, HashAlgorithm.DJB2);
    }

    public String toString() {
        return "StatsigUser(userID=" + ((Object) this.userID) + ')';
    }
}
