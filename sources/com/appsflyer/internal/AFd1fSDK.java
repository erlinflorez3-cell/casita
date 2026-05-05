package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLc\u0003\u0010Iي8\u000b<d\u0007Ӭ4\u0012\u0006\u0017nj?0LeV7ZS0\u0011\u0002ڔR/\f$ BsT%>e\u000fO^kuobZ9C\u001f\u0016${\u00038YW\t]@\u000fBD\u007f?aM\u001e?Ihz6\u0013%J$Nx3\u0005*0N\u0010\u0005\u0001[K:\u0012@Fv:`\u0015e\u0005H\u0019ĂB\"\u0007'jq"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\bw\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\bs\u0013\u0014?S", "", ">/", "", ">0", "", ">1", ">2", "", ">3", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tu-J|3IT75;\u001a\u001ej+'\u0016p0Wx|<\u0010?", "\u000fEP}h\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFd1fSDK extends AFd1bSDK {
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005)2ߡx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%$_\u007fKSYB}P\u000b}P\u0018k|Mr\u000bq\u00116\u001a\u0007nDI\u0004z\u000e\u0018\u001d7ZqU2{qm=nzN\u0005N4R<\b\f\u0019\u001aXJV{ټGM\u0012\u001a>I9a`\u0017e\u0005H\u00146B.\u00046\\\u0016PfNzaR19\u0002\u0018D~+m5\u0015M;H\u001b'˼zc$5NB"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\bw\u0013\u0014?<{\u0018ia>;\"!A", "", "\nh]6g\u0005", "u(E", "", ">/", ">0", ">1", ">2", ">3", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyUI30\u0004uP}DjJy%\u001b9sr\u0018\u001avLu&q\u000b0dO[)gVNIk,:", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u001051Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static String getMediationNetwork(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str5, str3, str + str2}), str4);
        }

        static String getMonetizationNetwork(String str, String str2, String str3) {
            return String.format(AFd1nSDK.getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()) + str + str3 + "?device_id=" + str2;
        }
    }

    private AFd1fSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z2) {
        super(str, bArr, str2, map, z2);
    }

    /* synthetic */ AFd1fSDK(String str, Map map, byte[] bArr, String str2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (4 & i2) != 0 ? null : bArr, (i2 + 8) - (8 | i2) != 0 ? "GET" : str2, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? false : z2);
    }

    @JvmStatic
    public static final AFd1fSDK getRevenue(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String monetizationNetwork = AFa1uSDK.getMonetizationNetwork(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFd1fSDK aFd1fSDK = new AFd1fSDK(monetizationNetwork, MapsKt.mapOf(TuplesKt.to("Connection", "close"), TuplesKt.to("af_request_epoch_ms", strValueOf), TuplesKt.to("af_sig", AFa1uSDK.getMediationNetwork(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
        aFd1fSDK.component4 = 10000;
        return aFd1fSDK;
    }
}
