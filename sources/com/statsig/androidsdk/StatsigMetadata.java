package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4t\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u000fs{:%aҖwYП\u0006\u001a,!IѻMwotJh\u000b[\u0011\u001c\u0015'k<Q[xk\u0014'4Xnm4]wC9nwN\u000761P9\n\u000b\u0007\u001a8L(v)D[\u0014\u00180NuRT#L3\u001b\"\u000eD \u000f$tid5vmmB5#\u0011pZP=^^}]\u0015LT5\u0015\u000fc4*n8E\u001d+S\u0011\u0010j]U\u0002mrM\rn'55aum5\u0007\u0001$\u001d1O\u001bh\u000b(r\u0004\u007fa\u001c/1OqWh\u0010>v)|Ɂ@\u0004\u001c\u0013oQ<U2h\u001e\rau9զA\u0019\u000blk\u0018|w5E&FŘ,\u0002$t{y=/Me|Kۃ\u001fk\n|LsV$_C\u001c\u001bɴRyZNi`P XknJΖcJ3\u0012]_\u0002Ez?/]í8$@1O\u0004\u0002vE.п\u0006)qa\u0019jJV!\u001d\u0017}Ү\nTcR\u0015\u001dmfS\u0007-Wܺ\u001d\u001d\u0010\f9+\"rvj\"kŲO\u0018qw\u001de_ $]g}ֱo4\u0017elv5KP\u0012\u0011(سw\\͋;p9pfpͭ<bb(02`l&v*E~\u0014\u00192Ms46B0G]EP\t\u001ePD\u0015\u000buY\u0017\u0011/Z9$\u0011m<t7\u0002\u0001dvou}a.\u0013_P.qY;\u00194[:jJ{Q\b/{\u0006GuS_N\u0003\u0015$V,(\u001c\u001aGYG?)\u000e-*b\n3EZ{}Sc\u0011U{-\u0002\u0015;v8\u007f\n\u0001oZa\u001bRUT%-\u000f`\t\"6e0\u0002gF\tS{V!ZlJ9ČX\u0005_F2\u001d\u001fL[1u04M/Y&K\u0015>Ӹ0]hk\"\b.(\u001cUׅs.\u0019:\u001e.o\u0011\r\u000e8Ira[\u0015=P%3×\u074cLj}D\u000b\u0010BJKHoe7ߠ7\u001e)=\u0003~\tB\f\u001fW\u0012>QsTҶ:ʡ.\u007fK͟,`I3\u001f\\sis}Ym[h\u001d\u0010#}Gm@\u001ds$\u0015[9׆<Ӓw$>\u05cdSd\u000bN\u00173T.B\u001b\u0019T%\b\u0014\u0017\u0013\u0002\\^=\u0018hF2?-՝`ܢ`bPγxGf58\u0010\u001f\u001193\u0007F\u0002#{Nl1y1/TS\rYn&Ƴrު/P\\ڣ3*^\u0017\u0019T}EO\u0019D\u0015\u0018G{u\b\u000eN\u0017+\u001ex\u001cY=(Ρk۞4j\u0013ٝ|Pj\u000f urP(B\r\fM,J\u0013'\r/N!p\u00191\u000bRṄOױ\u0005#L͈\u001f\u000e\u0003}T*M\b;HKZ;25}oUQ|6!V+Bxwǀcˍj\u0016eͩR\u0018w2p\u0011)\u0015V=\u0012?\u001b\u0013\u0001\rF\nLN048\u0017\u001d]Bմ-͛+7tݩZMn\u0017\u0018r\rett\u0019\u00147Md}\u0007-~\u001e?+\f2iͅfϳ\u0015_(ǅ)\u0002\u001a54.V\nhJ\u001e`4\u0007~kg]#*]l`eo4)ʼ\nψ}\u0002\f՞l*\u001b]d\\^f\u000f\u007fzS(,lv@f\u000b\u000bW\u00153\u0003\u0007bgӊ@лv*lӵO\u001b%\u007f\u001bV\u0001\t\njW7qO`J39H\n\u001e)-\u0015A>9ߕ\f̂F\u0015zυ\u007f.3lbL:)_K{u݇*\n"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7A}/3l\u0012=I\u0019", "", "AsP/_,\"2", "", "AcZ!l7>", "AcZ#X9LW#\b", "Adb@\\6G7w", "/o_\u0016W,Gb\u001d\u007f~^9", "/o_#X9LW#\b", "2de6V,&]\u0018~\u0002", "2de6V,(A", ":nR._,", ":`]4h(@S", "AxbAX4/S&\r~h5", "AxbAX4'O!~", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyUI30\u0004uP}DjJy%\u001b9sr\u0018=\u0015C\u000b\u0011?H%qH#M\tTENd\u007fK\u0011[.X\u0004A \u001dsb\tw]2\u0013})wwN\u000bc1N\u0015\u0004:m,|hJNq+#y#0GE~\u000e;Z>\u0019\u0004:\b=,\fK\nGx\u0014\bet\u001e.&/63:E\u0015\u00152hq}:Wo\u001bj\nWPD>\u001dng9/\u0014\u0003n\u0013%<]h\u0003\u0001@\u0015KMx\u0017|\no", "5dc\u000ec7\"R\u0019\b\nb-\u0001\t<", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000ec7\"R\u0019\b\nb-\u0001\t<", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u000ec7/S&\r~h5", "Adc\u000ec7/S&\r~h5", "5dc\u0011X=BQ\u0019f\u0005],\u0004", "Adc\u0011X=BQ\u0019f\u0005],\u0004", "5dc\u0011X=BQ\u0019hh", "Adc\u0011X=BQ\u0019hh", "5dc\u0019T5@c\u0015\u0001z", "Adc\u0019T5@c\u0015\u0001z", "5dc\u0019b*:Z\u0019", "Adc\u0019b*:Z\u0019", "5dc W2-g$~", "Adc W2-g$~", "5dc W2/S&\r~h5", "Adc W2/S&\r~h5", "5dc X:LW#\b^=", "Adc X:LW#\b^=", "5dc g(;Z\u0019bY", "Adc g(;Z\u0019bY", "5dc l:MS!gvf,", "Adc l:MS!gvf,", "5dc l:MS!ozk:\u0001\u00138", "Adc l:MS!ozk:\u0001\u00138", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "=uT?e0=S\u0007\u000ev[3|l\u000e", "", "=uT?e0=S\u0007\u000ev[3|l\u000e${1zM\u000b\u001b\u0016A}\rBp25`}\u001cEm", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigMetadata {

    @SerializedName(alternate = {}, value = "\b\u0016\u0015l\u0007\u0007\u000f\u0014\b\u0004\u0006\u0001\r")
    @InterfaceC1492Gx
    private String appIdentifier;

    @SerializedName(alternate = {}, value = "\b\u0016\u0015y\b\u0014\u0014\t\u000e\f")
    @InterfaceC1492Gx
    private String appVersion;

    @SerializedName(alternate = {}, value = "\u000b\u000b\u001b\r\u0006\u0007m\u000f\u0003\u0003\t")
    @InterfaceC1492Gx
    private String deviceModel;

    @SerializedName(alternate = {}, value = "\u000b\u000b\u001b\r\u0006\u0007or")
    @InterfaceC1492Gx
    private String deviceOS;

    @SerializedName(alternate = {}, value = "\u0013\u0007\u0013\u000b\u0018\u0003\b\u0005")
    @InterfaceC1492Gx
    private String language;

    @SerializedName(alternate = {}, value = "\u0013\u0015\b\u0005\u000f\u0007")
    @InterfaceC1492Gx
    private String locale;

    @SerializedName(alternate = {}, value = "\u001a\n\u0010w\u001c\u0012\u0006")
    @InterfaceC1492Gx
    private String sdkType;

    @SerializedName(alternate = {}, value = "\u001a\n\u0010y\b\u0014\u0014\t\u000e\f")
    @InterfaceC1492Gx
    private String sdkVersion;

    @SerializedName(alternate = {}, value = "\u001a\u000b\u0018\u0017\f\u0011\u000fhb")
    @InterfaceC1492Gx
    private String sessionID;

    @SerializedName(alternate = {}, value = "\u001a\u001a\u0006\u0006\u000f\u0007ic")
    @InterfaceC1492Gx
    private String stableID;

    @SerializedName(alternate = {}, value = "\u001a\u001f\u0018\u0018\b\u000fn\u0001\f\u0003")
    @InterfaceC1492Gx
    private String systemName;

    @SerializedName(alternate = {}, value = "\u001a\u001f\u0018\u0018\b\u000fv\u0005\u0011\u0011\u0006\u000b\t")
    @InterfaceC1492Gx
    private String systemVersion;

    public StatsigMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public StatsigMetadata(String str, String str2, String str3, String sessionID, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        this.stableID = str;
        this.sdkType = str2;
        this.sdkVersion = str3;
        this.sessionID = sessionID;
        this.appIdentifier = str4;
        this.appVersion = str5;
        this.deviceModel = str6;
        this.deviceOS = str7;
        this.locale = str8;
        this.language = str9;
        this.systemVersion = str10;
        this.systemName = str11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StatsigMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str13 = str9;
        String str14 = str8;
        String str15 = str7;
        String str16 = str6;
        String str17 = str3;
        String str18 = str10;
        String str19 = str5;
        String string = str4;
        String str20 = str11;
        String str21 = str2;
        String str22 = (i2 & 1) != 0 ? null : str;
        str21 = (i2 + 2) - (i2 | 2) != 0 ? "android-client" : str21;
        str17 = (i2 + 4) - (i2 | 4) != 0 ? BuildConfig.VERSION_NAME : str17;
        if ((i2 & 8) != 0) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        }
        this(str22, str21, str17, string, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : str19, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? null : str16, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? null : str15, (i2 + 128) - (i2 | 128) != 0 ? null : str14, (-1) - (((-1) - i2) | ((-1) - 256)) != 0 ? null : str13, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? null : str18, (i2 + 1024) - (i2 | 1024) != 0 ? null : str20, (i2 & 2048) == 0 ? str12 : null);
    }

    public static /* synthetic */ StatsigMetadata copy$default(StatsigMetadata statsigMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = statsigMetadata.stableID;
        }
        if ((2 & i2) != 0) {
            str2 = statsigMetadata.sdkType;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str3 = statsigMetadata.sdkVersion;
        }
        if ((8 & i2) != 0) {
            str4 = statsigMetadata.sessionID;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            str5 = statsigMetadata.appIdentifier;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            str6 = statsigMetadata.appVersion;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            str7 = statsigMetadata.deviceModel;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            str8 = statsigMetadata.deviceOS;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            str9 = statsigMetadata.locale;
        }
        if ((512 & i2) != 0) {
            str10 = statsigMetadata.language;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1024)) != 0) {
            str11 = statsigMetadata.systemVersion;
        }
        if ((i2 + 2048) - (i2 | 2048) != 0) {
            str12 = statsigMetadata.systemName;
        }
        return statsigMetadata.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public final String component1() {
        return this.stableID;
    }

    public final String component10() {
        return this.language;
    }

    public final String component11() {
        return this.systemVersion;
    }

    public final String component12() {
        return this.systemName;
    }

    public final String component2() {
        return this.sdkType;
    }

    public final String component3() {
        return this.sdkVersion;
    }

    public final String component4() {
        return this.sessionID;
    }

    public final String component5() {
        return this.appIdentifier;
    }

    public final String component6() {
        return this.appVersion;
    }

    public final String component7() {
        return this.deviceModel;
    }

    public final String component8() {
        return this.deviceOS;
    }

    public final String component9() {
        return this.locale;
    }

    public final StatsigMetadata copy(String str, String str2, String str3, String sessionID, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        return new StatsigMetadata(str, str2, str3, sessionID, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsigMetadata)) {
            return false;
        }
        StatsigMetadata statsigMetadata = (StatsigMetadata) obj;
        return Intrinsics.areEqual(this.stableID, statsigMetadata.stableID) && Intrinsics.areEqual(this.sdkType, statsigMetadata.sdkType) && Intrinsics.areEqual(this.sdkVersion, statsigMetadata.sdkVersion) && Intrinsics.areEqual(this.sessionID, statsigMetadata.sessionID) && Intrinsics.areEqual(this.appIdentifier, statsigMetadata.appIdentifier) && Intrinsics.areEqual(this.appVersion, statsigMetadata.appVersion) && Intrinsics.areEqual(this.deviceModel, statsigMetadata.deviceModel) && Intrinsics.areEqual(this.deviceOS, statsigMetadata.deviceOS) && Intrinsics.areEqual(this.locale, statsigMetadata.locale) && Intrinsics.areEqual(this.language, statsigMetadata.language) && Intrinsics.areEqual(this.systemVersion, statsigMetadata.systemVersion) && Intrinsics.areEqual(this.systemName, statsigMetadata.systemName);
    }

    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getSdkType() {
        return this.sdkType;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final String getStableID() {
        return this.stableID;
    }

    public final String getSystemName() {
        return this.systemName;
    }

    public final String getSystemVersion() {
        return this.systemVersion;
    }

    public int hashCode() {
        String str = this.stableID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdkType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkVersion;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.sessionID.hashCode()) * 31;
        String str4 = this.appIdentifier;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appVersion;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceModel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deviceOS;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.locale;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.language;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.systemVersion;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.systemName;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void overrideStableID$android_sdk_release(String str) {
        if (str == null || Intrinsics.areEqual(str, this.stableID)) {
            return;
        }
        this.stableID = str;
    }

    public final void setAppIdentifier(String str) {
        this.appIdentifier = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public final void setDeviceOS(String str) {
        this.deviceOS = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setSdkType(String str) {
        this.sdkType = str;
    }

    public final void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public final void setSessionID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionID = str;
    }

    public final void setStableID(String str) {
        this.stableID = str;
    }

    public final void setSystemName(String str) {
        this.systemName = str;
    }

    public final void setSystemVersion(String str) {
        this.systemVersion = str;
    }

    public String toString() {
        return "StatsigMetadata(stableID=" + ((Object) this.stableID) + ", sdkType=" + ((Object) this.sdkType) + ", sdkVersion=" + ((Object) this.sdkVersion) + ", sessionID=" + this.sessionID + ", appIdentifier=" + ((Object) this.appIdentifier) + ", appVersion=" + ((Object) this.appVersion) + ", deviceModel=" + ((Object) this.deviceModel) + ", deviceOS=" + ((Object) this.deviceOS) + ", locale=" + ((Object) this.locale) + ", language=" + ((Object) this.language) + ", systemVersion=" + ((Object) this.systemVersion) + ", systemName=" + ((Object) this.systemName) + ')';
    }
}
