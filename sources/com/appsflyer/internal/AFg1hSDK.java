package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjG9L͜P.`S2\u000fq{<$i%yCA\\\"}8\tWNmo\u0005Ϻx*s\u000f4\u00151iK\nZޯa\u0014\u00152Pp\bX[xU9\u000f|f\t.5:8(\u00071\u001e8M(v)G{\u0010 7XphXSaŋ\u001e\u0014\fG.\u000bf\"u^NH\u001bej31\u0006\u0002B|)\u00104\u000bR%F\u0003+=zo%C@e@E)a\u000f\u001fR\nE3C\u007fJ\u001dhU-[M\u0002eNX.\u001aE/]\u001curTbKeԃ\u0010)1_q\\\u0019+6\n\u0013{;D4\u0012\u0014*`.[\u001c\u0017\f\u001c8\rr\u0002D\u0017\u0016ެF\u0002\u0001sD*m%A?Q\u001b\u0015Y\u0012?'QO{3\u000fN'\u000fs9[\u0003\u0012\u0011\u0019)[\u0010Q_W\u0007Q˓R\f_Q{\u000e9\u0012\u0010@\u001c0u\b_\u007f\u001f1/%epi'/p\u001aHri'\tnoki\u0001Lp(|\"O,\u001f\u000b\tO+\u0005\u07fbTV^B\u001fddi\u0015\u0016 \u0013Nb(@/((N}}0jܷa\f+GtP\"\u0014y(o9\r;eUq\u0013yR%\u0016o@p\npfpW<^j/:2vpV\fԞHP\u0012-@I:ABGI\u0019\u000b\u001dx\u0007,EY|7a\u000bl\u001e\u0004l3R\u0007\u001a(\u0003\u0010\u0019P\u000bv6{֑M.\u0003{07\u0012cC7>UPnjRyȫ\u0001\u0381\u0004K\u007fNMhz3"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\by\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u000b\u0013\u0014?S", "\nh]6g\u0005", "u(E", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\bt\u0013\u0014?S", ">/", "", ">0", "", ">1", "", ExifInterface.GPS_MEASUREMENT_2D, "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn>B##8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$kj8", "", ">2", ">3", ">4", ">5", ExifInterface.GPS_MEASUREMENT_3D, "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn>B##8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$],C]JucN{?]\u0001]\u001bX=\t\u0002`Ayc9,\u0014K\u001d", "4na0X", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn>B##8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$:\u0018", "7", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bFf2}B\u0001$U.y\u0010#v65`S", "5dc\u001fX=>\\)~", "uKR<`u:^$\r{e@|\u0016xA`\u000f\u0006B\u0003\u0017$\u0006V\u0018>]%FY\u0005u\u001ek 6\u0017?FvB\u001f\u001c|aFPg5]v4PHUu83t\t\u0012\u007f9s$\u0012\u0012\u0001j=mu@@!Q\u001aX\u000f?q\u0003a|\u00131{l\f]\fP{^dD6rXU\\\u0001G\u0017\tS", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "uKR<`u:^$\r{e@|\u0016xA`\u000f\u0006B\u0003\u0017$\u0006V\u0018>]%FY\u0005uzb", "D", ExifInterface.LONGITUDE_EAST, "5dc [6NZ\u0018^\u000em,\u0006\b\u0017s\u0002", "u(I", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u000fEP}m\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFg1hSDK extends AFh1ySDK {
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getRevenue = iArr;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gّ1!Ǟr~P+R~\rfʴ=2JeV/"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\by\u0013\u0014?<{\u0018iaC;\"!A", "", "\nh]6g\u0005", "u(E"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static boolean getMediationNetwork(AFLogger.LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void getRevenue(AFLogger.LogLevel logLevel, AFg1cSDK aFg1cSDK, String str, Throwable th) {
        if (getMediationNetwork(logLevel)) {
            getMediationNetwork(str, aFg1cSDK);
            int i2 = AFa1vSDK.getRevenue[logLevel.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3 || i2 != 4) {
            }
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z3) {
            getRevenue(AFLogger.LogLevel.ERROR, aFg1cSDK, str, th);
        } else if (z2) {
            getRevenue(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        withTag$SDK_prodRelease(str, aFg1cSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.INFO, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.VERBOSE, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getRevenue(AFLogger.LogLevel.WARNING, aFg1cSDK, str, null);
    }
}
