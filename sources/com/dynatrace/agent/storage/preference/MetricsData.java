package com.dynatrace.agent.storage.preference;

import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4D\u0007\":\u0016\u007f\u0007ljA0RqP.XS2\u000fy\u0005<$a&yCQU\"}(?Uȟm}ñzZ9BOٯ\u0015\tp2Icxu\u0012=3RuE3[qU9\u000fuF\u000b&20;\u0012\u0005/\u001b:N\u0016v\tGc\f@1Px@R\u001bR\u001d\u001c(\u0005l&\u0011&bg\\=`ns9])\u0013qHN5gH~c\ft]7\u0015|a,5X9K\u0014S\\\u0013\rX[M\u000eWqk\u0011x--+W\u0001o6\u0007\t$\u001d1O\u001bk\u000b(r\u0004\u007fi\u001c/1OqZh\u0010>v)\u0005\u001dD\n\u000e\u00147`0C\u0019\u0015\u0019\u001e9zraRh\u0002\rK\u0010\u0001g6%8\u00183YB+lWaI-f7*\u000e\u001d$)\u0001|6sT<l%!Zw_Gi@kTݳ\u000e[C\u0005\u0012\t+\t85HG.0BÄ/_,E\u000eQ#OlHӍE0}\u0013\u0014\u0001S\u0018S\u000fٞ#7\u001dE^!\f\tE+˔l\u0019bfa)O2S5\u0004N˽!Ϣ{</DX\\]\u001f\u0002lc\\8+uА8֍rk\u001cv\u0002gAlie&`\u0001\u007fZͺ=+\u000ef\u001fZU\"Y\u000b1hļI3\u0017\u00065\\N:\u001fxƴrd;:k1\\CQIڣC\n\u0006\u0017\u001brj&}\u0003<jҷjl}\u0017=h^\u0007n\u0016\u0002\u0010ٚ})+;~i7/%\u00043/ٛ}k\u000e\r2\u0018G\u0016U\u000eǉm^|c;8\u0016HB\u0018Ʉ>[\u0016\riJ\u0002[N\u0013Ȱf\u001aT h\u0013|(\u001b\u0002ģ/0\u000fx3D`\u0019V\u0016ݾ\u0018jտ]\u0001f d.ט\u0012L\u0001GqT#[lJ#\t_<\\:\u0015\u0005M\u001fU\u0007u\"\u000b8ECU\u001eF}\u001a/#eui\u001e/*j\u0015&\u0003j\u001c.y\u0015\u001eh\u0002e8;FPq\u0001T!Rr3JNj\u0006\u0010Z\u000bJ\faQqlvVFW#1\u0014e55=v\\[H\u001e\b}b:\u00100yC\f!vCS\u001a}[mm{Yt\r`\u000e8\u0014,9t\u0012*L8Xma796{\u001e6OKz\u0007R\bRE\\B\u000e\u000bQf\u0002\u0006>\u00040Le\u000f%EZsi_>Z~\\d\\\u001d`siQ0\u0007~\u001dH6xc=5sLT=yJ\u0001\u0002)Oǌiˍ\u0003f3o\reG`@X/\u0017ucQ\u0010\u001a8\u001aFWl2Ǩ\r\u0001\u001f\u000bdZ\u0018I:\u0018ϰ^?7lSmd|m=պe#]0)\u0017z+\u000fۖ\u000e\u0015\u0013ÿgtu{;f\u001f\u0007EE2\u0001EEͫ\u000b\u0012\u0005ݭ^\u001d3!CG\u000eXx\u0017?{\u0006Tȯ\u0002\u000e(é?\u0006z=jq^u\u0018a3:Drїf\b\u0011ސh\"\nKX\u000fC\u001d<\rNQ\u001820\u0019Ȩ]s\u007f!NGCn\f`Y\bI\u001dqs{pk\n1lܕZ\u0002v-^=!)SO!w+K\u001f[8Z'~B\u001eӔ#<\u0010ӳA\u0012U\u0006v\u0014<`i\u0017C1\u0002)\u0010:ëV$\u0006Υ\u0012w\nNbKeJdXVd7h\u05cfF]\u0016ߜ\u0003*j\u001a\u001aOd\f\rUv\u0011A=лv$lӵO\u001b%\u0003\u001bj1\u0018\u0012Sa(70\u0001Hװ;8\u0013 @x\u0017+H\u0006E\u00118Q!t\u0016fZ6ĘXC\"śq&s\u000e\u0011I\u001cVFR .'\r?@և<&Fю2\u001eA{Ali \u000f'P\u0006\u001e\u0010ص9pYƚ=,\u0007)\u000f0\u0010\t?~Rse{ܯ3\u0015wߦohARC\t\u001d6\u001a\u0016}J-V\u07b2Z\u0015iβa7KL\bx\u0011\u000f\u00184<$4\u0002¡\u0004K9\u05faBabod\u001a(\u00134@Nnr/ؼp~{ԁDk\u001e$r\u0002Ɏ8\u000b"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u0003r($", "", "2de6V,,Q&~zg\u001e\u0001\b>h", "", "2de6V,,Q&~zg\u000f|\r1h\u000f", "2de6V,(`\u001d~\u0004m(\f\r9n", "2de6V,\u001bO(\u000ezk@c\t@e\u0007", ":nR.g0H\\\u007fz\nb;\r\b/", "", ":nR.g0H\\\u007f\t\u0004`0\f\u0019.e", "2de6V,&O\"\u000f{Z*\f\u0019<e\r", "", "2de6V,&]\u0018~\u0002B+|\u0012>i\u0001,{M", "2de6V,\"a\u0006\t\u0005m,{", "", "=r=.`,", "=rE2e:B]\"", "0t]1_,", "/o_#X9LW#\b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u0001@dn D{\u001a8V\u0019", "7mbAT5<S|}", "Adb@\\6G7\u0018", "<dcDb9DB-\nz", "1qP@[\u0019>^#\f\nb5~r:tc1", "Adb@\\6G/\u0017\u000e~o,", "\nh]6g\u0005", "uH8\u0016<\u0013CO*zDe(\u0006\u000bxD\n8xG\u0001l}Lk\u001f8@,1b\u007fi\u0016w&+TC\u0011R9\u001a&d+@\u0003l.\u0018d6TPW.29w9%\u000e$\u0015J4\u000fNGP1rM9t|\u0013N}LdJ\u0013\u0012\u001774^Qc\u0014P{j\\F%yB#fuPC\u000fP9q\u0010h\u001f2!? %mb\"dY0Sib\u001ev[{=NE#\u0003\u0002#RvWURkS<>#!K\u0005\u0007[:X\u00048x+\u0012}\u0006AouKt&Bh\u0002j\u0013a=8\"\u007fC\u000fHM-c{K\u0012q!7n\u0013^F-blalJXtl$_>c5g<N\u0017:\u0013v\u00110HH0j\u0007\u0019\u0012\tybZ\r4", "5dc\u0011X=BQ\u0019lxk,|\u0012!i~7~", "u(8", "5dc\u0011X=BQ\u0019lxk,|\u0012\u0012e\u0004*~O", "5dc\u0011X=BQ\u0019h\bb,\u0006\u0018+t\u00042\u0005", "5dc\u0011X=BQ\u0019[vm;|\u0016CL\u007f9{G", "5dc\u0019b*:b\u001d\t\u0004E(\f\r>u~(", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "\u001aiPCTuEO\"\u0001D=6\r\u00066eU", "5dc\u0019b*:b\u001d\t\u0004E6\u0006\u000b3t\u0010'{", "5dc\u0011X=BQ\u0019fvg<}\u0005-t\u00105{M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0011X=BQ\u0019f\u0005],\u0004l.e\t7\u007fA\u0005\u0017$", "5dc\u0011X=BQ\u0019b\tK6\u0007\u0018/d", "u(I", "5dc\u001cf\u0015:[\u0019", "5dc\u001cf\u001d>`'\u0003\u0005g", "5dc\u000fh5=Z\u0019", "5dc\u000ec7/S&\r~h5", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u001fG~\u001b@t3~5\t+(m#<QMDA", "5dc\u0016a:MO\"|zB+", "5dc X:LW#\b^]", "5dc\u001bX;P]&\u0005ir7|", "5dc\u0010e(LV\u0006~\u0006h9\f\r8gi3\u000b$\n", "5dc X:LW#\bV\\;\u0001\u001a/", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(JH", "1n\\=b5>\\(JI", "1n\\=b5>\\(JJ", "1n\\=b5>\\(JK", "1n\\=b5>\\(JL", "1n\\=b5>\\(JM", "1n_F", "uH8\u0016<\u0013CO*zDe(\u0006\u000bxD\n8xG\u0001l}Lk\u001f8@,1b\u007fi\u0016w&+TC\u0011R9\u001a&d+@\u0003l.\u0018d6TPW.29w9%\u000e$\u0015J4\u000fNGP1rM9t|\u0013N}LdJ\u0013\u0012\u001774^Qc\u0014P{j\\F%yB#fuPC\u000fP9q\u0010h\u001f2!? %mb\"dY0Sib\u001ev[{=NE#\u0003\u0002#RvWURkS<>#!K\u0005\u0007[:X\u00048x+\u0012}\u0006AouKt&Bh\u0002j\u0013a=8\"\u007fC\u000fHM-c{K\u0012q!7n\u0013^F-blalJXtl$_>c5g<N\u0017:\u0013v\u00110HH0j\u0007\u0019\u0012\tybZ\r*\u0019^\tcoX+[ \u0010~d\u0018e*\u0018=b\u001e28nAZ\u000f\u000bh\u0002\u0017\tYD\u0015}H\u0019kK<CW~1:v\u001f(\u001dBG\u0012", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MetricsData {
    private final AppVersion appVersion;
    private final String bundle;
    private final boolean crashReportingOptIn;
    private final int deviceBatteryLevel;
    private final boolean deviceIsRooted;
    private final String deviceManufacturer;
    private final String deviceModelIdentifier;
    private final int deviceOrientation;
    private final int deviceScreenHeight;
    private final int deviceScreenWidth;
    private final String instanceId;
    private final Double locationLatitude;
    private final Double locationLongitude;
    private final String networkType;
    private final String osName;
    private final String osVersion;
    private final boolean sessionActive;
    private final String sessionId;

    public MetricsData() {
        this(0, 0, 0, 0, null, null, null, null, false, null, null, null, null, null, null, null, false, false, 262143, null);
    }

    public MetricsData(int i2, int i3, int i4, int i5, Double d2, Double d3, String str, String str2, boolean z2, String osName, String str3, String str4, AppVersion appVersion, String instanceId, String sessionId, String networkType, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(osName, "osName");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        this.deviceScreenWidth = i2;
        this.deviceScreenHeight = i3;
        this.deviceOrientation = i4;
        this.deviceBatteryLevel = i5;
        this.locationLatitude = d2;
        this.locationLongitude = d3;
        this.deviceManufacturer = str;
        this.deviceModelIdentifier = str2;
        this.deviceIsRooted = z2;
        this.osName = osName;
        this.osVersion = str3;
        this.bundle = str4;
        this.appVersion = appVersion;
        this.instanceId = instanceId;
        this.sessionId = sessionId;
        this.networkType = networkType;
        this.crashReportingOptIn = z3;
        this.sessionActive = z4;
    }

    public /* synthetic */ MetricsData(int i2, int i3, int i4, int i5, Double d2, Double d3, String str, String str2, boolean z2, String str3, String str4, String str5, AppVersion appVersion, String str6, String str7, String str8, boolean z3, boolean z4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 + 1) - (i6 | 1) != 0 ? -1 : i2, (i6 + 2) - (i6 | 2) != 0 ? -1 : i3, (-1) - (((-1) - i6) | ((-1) - 4)) != 0 ? -1 : i4, (i6 & 8) == 0 ? i5 : -1, (i6 & 16) != 0 ? null : d2, (i6 & 32) != 0 ? null : d3, (i6 & 64) != 0 ? null : str, (i6 & 128) != 0 ? null : str2, (i6 + 256) - (i6 | 256) != 0 ? false : z2, (-1) - (((-1) - i6) | ((-1) - 512)) != 0 ? EventMetricsAggregator.OS_NAME : str3, (i6 & 1024) != 0 ? null : str4, (-1) - (((-1) - i6) | ((-1) - 2048)) != 0 ? null : str5, (i6 & 4096) == 0 ? appVersion : null, (-1) - (((-1) - i6) | ((-1) - 8192)) != 0 ? "" : str6, (i6 + 16384) - (i6 | 16384) != 0 ? "" : str7, (i6 + 32768) - (i6 | 32768) == 0 ? str8 : "", (-1) - (((-1) - i6) | ((-1) - 65536)) != 0 ? false : z3, (i6 & 131072) != 0 ? false : z4);
    }

    public static /* synthetic */ MetricsData copy$default(MetricsData metricsData, int i2, int i3, int i4, int i5, Double d2, Double d3, String str, String str2, boolean z2, String str3, String str4, String str5, AppVersion appVersion, String str6, String str7, String str8, boolean z3, boolean z4, int i6, Object obj) {
        int i7 = i4;
        int i8 = i3;
        int i9 = i2;
        String str9 = str;
        Double d4 = d2;
        String str10 = str2;
        Double d5 = d3;
        int i10 = i5;
        AppVersion appVersion2 = appVersion;
        String str11 = str5;
        String str12 = str3;
        String str13 = str4;
        boolean z5 = z2;
        String str14 = str8;
        boolean z6 = z4;
        String str15 = str7;
        boolean z7 = z3;
        String str16 = str6;
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i9 = metricsData.deviceScreenWidth;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i8 = metricsData.deviceScreenHeight;
        }
        if ((i6 + 4) - (i6 | 4) != 0) {
            i7 = metricsData.deviceOrientation;
        }
        if ((i6 & 8) != 0) {
            i10 = metricsData.deviceBatteryLevel;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16)) != 0) {
            d4 = metricsData.locationLatitude;
        }
        if ((i6 & 32) != 0) {
            d5 = metricsData.locationLongitude;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 64)) != 0) {
            str9 = metricsData.deviceManufacturer;
        }
        if ((i6 & 128) != 0) {
            str10 = metricsData.deviceModelIdentifier;
        }
        if ((i6 + 256) - (i6 | 256) != 0) {
            z5 = metricsData.deviceIsRooted;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 512)) != 0) {
            str12 = metricsData.osName;
        }
        if ((i6 & 1024) != 0) {
            str13 = metricsData.osVersion;
        }
        if ((i6 + 2048) - (i6 | 2048) != 0) {
            str11 = metricsData.bundle;
        }
        if ((i6 + 4096) - (i6 | 4096) != 0) {
            appVersion2 = metricsData.appVersion;
        }
        if ((i6 + 8192) - (i6 | 8192) != 0) {
            str16 = metricsData.instanceId;
        }
        if ((i6 + 16384) - (i6 | 16384) != 0) {
            str15 = metricsData.sessionId;
        }
        if ((i6 & 32768) != 0) {
            str14 = metricsData.networkType;
        }
        if ((i6 + 65536) - (i6 | 65536) != 0) {
            z7 = metricsData.crashReportingOptIn;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 131072)) != 0) {
            z6 = metricsData.sessionActive;
        }
        int i11 = i10;
        Double d6 = d4;
        Double d7 = d5;
        return metricsData.copy(i9, i8, i7, i11, d6, d7, str9, str10, z5, str12, str13, str11, appVersion2, str16, str15, str14, z7, z6);
    }

    public final int component1() {
        return this.deviceScreenWidth;
    }

    public final String component10() {
        return this.osName;
    }

    public final String component11() {
        return this.osVersion;
    }

    public final String component12() {
        return this.bundle;
    }

    public final AppVersion component13() {
        return this.appVersion;
    }

    public final String component14() {
        return this.instanceId;
    }

    public final String component15() {
        return this.sessionId;
    }

    public final String component16() {
        return this.networkType;
    }

    public final boolean component17() {
        return this.crashReportingOptIn;
    }

    public final boolean component18() {
        return this.sessionActive;
    }

    public final int component2() {
        return this.deviceScreenHeight;
    }

    public final int component3() {
        return this.deviceOrientation;
    }

    public final int component4() {
        return this.deviceBatteryLevel;
    }

    public final Double component5() {
        return this.locationLatitude;
    }

    public final Double component6() {
        return this.locationLongitude;
    }

    public final String component7() {
        return this.deviceManufacturer;
    }

    public final String component8() {
        return this.deviceModelIdentifier;
    }

    public final boolean component9() {
        return this.deviceIsRooted;
    }

    public final MetricsData copy(int i2, int i3, int i4, int i5, Double d2, Double d3, String str, String str2, boolean z2, String osName, String str3, String str4, AppVersion appVersion, String instanceId, String sessionId, String networkType, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(osName, "osName");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        return new MetricsData(i2, i3, i4, i5, d2, d3, str, str2, z2, osName, str3, str4, appVersion, instanceId, sessionId, networkType, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricsData)) {
            return false;
        }
        MetricsData metricsData = (MetricsData) obj;
        return this.deviceScreenWidth == metricsData.deviceScreenWidth && this.deviceScreenHeight == metricsData.deviceScreenHeight && this.deviceOrientation == metricsData.deviceOrientation && this.deviceBatteryLevel == metricsData.deviceBatteryLevel && Intrinsics.areEqual((Object) this.locationLatitude, (Object) metricsData.locationLatitude) && Intrinsics.areEqual((Object) this.locationLongitude, (Object) metricsData.locationLongitude) && Intrinsics.areEqual(this.deviceManufacturer, metricsData.deviceManufacturer) && Intrinsics.areEqual(this.deviceModelIdentifier, metricsData.deviceModelIdentifier) && this.deviceIsRooted == metricsData.deviceIsRooted && Intrinsics.areEqual(this.osName, metricsData.osName) && Intrinsics.areEqual(this.osVersion, metricsData.osVersion) && Intrinsics.areEqual(this.bundle, metricsData.bundle) && Intrinsics.areEqual(this.appVersion, metricsData.appVersion) && Intrinsics.areEqual(this.instanceId, metricsData.instanceId) && Intrinsics.areEqual(this.sessionId, metricsData.sessionId) && Intrinsics.areEqual(this.networkType, metricsData.networkType) && this.crashReportingOptIn == metricsData.crashReportingOptIn && this.sessionActive == metricsData.sessionActive;
    }

    public final AppVersion getAppVersion() {
        return this.appVersion;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final boolean getCrashReportingOptIn() {
        return this.crashReportingOptIn;
    }

    public final int getDeviceBatteryLevel() {
        return this.deviceBatteryLevel;
    }

    public final boolean getDeviceIsRooted() {
        return this.deviceIsRooted;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModelIdentifier() {
        return this.deviceModelIdentifier;
    }

    public final int getDeviceOrientation() {
        return this.deviceOrientation;
    }

    public final int getDeviceScreenHeight() {
        return this.deviceScreenHeight;
    }

    public final int getDeviceScreenWidth() {
        return this.deviceScreenWidth;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final Double getLocationLatitude() {
        return this.locationLatitude;
    }

    public final Double getLocationLongitude() {
        return this.locationLongitude;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final boolean getSessionActive() {
        return this.sessionActive;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.deviceScreenWidth) * 31) + Integer.hashCode(this.deviceScreenHeight)) * 31) + Integer.hashCode(this.deviceOrientation)) * 31) + Integer.hashCode(this.deviceBatteryLevel)) * 31;
        Double d2 = this.locationLatitude;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.locationLongitude;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.deviceManufacturer;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceModelIdentifier;
        int iHashCode5 = (((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.deviceIsRooted)) * 31) + this.osName.hashCode()) * 31;
        String str3 = this.osVersion;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bundle;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AppVersion appVersion = this.appVersion;
        return ((((((((((iHashCode7 + (appVersion != null ? appVersion.hashCode() : 0)) * 31) + this.instanceId.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.networkType.hashCode()) * 31) + Boolean.hashCode(this.crashReportingOptIn)) * 31) + Boolean.hashCode(this.sessionActive);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MetricsData(deviceScreenWidth=");
        sb.append(this.deviceScreenWidth).append(", deviceScreenHeight=").append(this.deviceScreenHeight).append(", deviceOrientation=").append(this.deviceOrientation).append(", deviceBatteryLevel=").append(this.deviceBatteryLevel).append(", locationLatitude=").append(this.locationLatitude).append(", locationLongitude=").append(this.locationLongitude).append(", deviceManufacturer=").append(this.deviceManufacturer).append(", deviceModelIdentifier=").append(this.deviceModelIdentifier).append(", deviceIsRooted=").append(this.deviceIsRooted).append(", osName=").append(this.osName).append(", osVersion=").append(this.osVersion).append(", bundle=");
        sb.append(this.bundle).append(", appVersion=").append(this.appVersion).append(", instanceId=").append(this.instanceId).append(", sessionId=").append(this.sessionId).append(", networkType=").append(this.networkType).append(", crashReportingOptIn=").append(this.crashReportingOptIn).append(", sessionActive=").append(this.sessionActive).append(')');
        return sb.toString();
    }
}
