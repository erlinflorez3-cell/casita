package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLc\u0003\u0014Iي8\u000b<d\u0007\":\u001e\u007fјnjG6LeN/ZS8\u0018s{:$c$\bCCU ~*\t]UogtLb\u000bY\u000f\u000e\u0016~o2nkތ\u000e\u0012=1\u0003\u001dO7[pU9\u000ftF\u0017.6:F\n\u0007\u0011\u001aXK x\u000bCy\u000f(/nrJX\u0013M\u0013 *\u0006l%Ә\"^mUDP5jH9;\u0003\u0018K\u0015,ۢ4~S\u0017T_o\"\u0005n6+n:e\u00193T\u001b\u0007\u0001g\u0006\u0003ӭu?\u000bu55sZ\u0002aNX.\u0017=+}\u0010$\u0018͉`\u0007Wj\u001a6shq\\h\u000eV\u0001#{;H4\u0012\u0014(`.[*-\bԧ7vxdNbRrP\u0014\u0013ad\u0017[\u0004q/\u0010ӝpЂe?!P=\r\u0013 n5\u000f\u00059[\u0003#\u0017:qƿyΦ5UX?Nd\u0018p\u000e\u0010\u0012}z\u0010:\u0006@G.2\f\u0013>\u0017S:q8Q#\"\u0006\u0007H>Ѐ\u000f¾lWqTNM0\u0007fO8\u001a$Zrm;\u0001'ԑ\u001b¯\u0015W$V\r\u0012\u0016,8^}M/0``]r\u0002j{b@)\u0006ϑ9֍ro\u0016Y?hAO\"u\u001e}jvBBr\b[ׁh͞W\u0010r^.6@c"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\bu\u0013\u0014?S", "", "", ">/", "", "", ">0", "", ">1", "\nh]6g\u0005", "uZ1\u0019](OOb\u000f\nb3Fp+pU\f?1", "", "\u000fE01E,OS\"\u000fz=(\f\u0005", "u(I", "\u001aiPCTuGS(H]m;\bx\u001cL]2\u0005I\u0001\u0015&Ky\u0017\u0012", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "uKY.i(\b\\\u0019\u000eDA;\f\u0014\u001fRf\u0006\u0006I\n\u0017\u0015Vs\u0018ELh\u001c^y137\u001d*VE\u0005YC+\u0019qc\u000f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "", "5dc\u001fX=>\\)~", "uKY.i(\b\\\u0019\u000eDA;\f\u0014\u001fRf\u0006\u0006I\n\u0017\u0015Vs\u0018EL\nxN", ")A", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b{\u0013\u0014?S", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "u(;0b4\bO$\n\t_3\u0011\t</\u00041\u000b@\u000e \u0013N9i\u001dup:G\\\u0006\r", "\u001aiPCTuNb\u001d\u0006DF(\b^", "(", "\u0017", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/qT\u000e_3\u001fW\u0019\u0006yl\u001dx\u00103d"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AFc1dSDK {
    public int AFAdRevenueData;
    private final boolean getCurrencyIso4217Code;
    public Map<String, String> getMonetizationNetwork;
    public byte[] getRevenue;

    public AFc1dSDK(byte[] bArr, Map<String, String> map, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getRevenue = bArr;
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = i2;
        this.getCurrencyIso4217Code = true;
    }

    private static String getMonetizationNetwork(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream;
        try {
            errorStream = Callback.getInputStream((URLConnection) httpURLConnection);
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, message, th, false, false, false, false, 96, null);
            errorStream = Callback.getErrorStream(httpURLConnection);
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String strJoinToString$default = CollectionsKt.joinToString$default(TextStreamsKt.readLines(bufferedReader), null, null, null, 0, null, null, 63, null);
        bufferedReader.close();
        return strJoinToString$default == null ? "" : strJoinToString$default;
    }

    private final boolean getRevenue(HttpURLConnection httpURLConnection, long j2) throws Exception {
        httpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + Global.COLON + httpURLConnection.getURL());
        sb.append("\n length: ").append(new String(this.getRevenue, Charsets.UTF_8).length());
        Map<String, String> map = this.getMonetizationNetwork;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
        }
        String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb));
        if (getRevenue()) {
            AFLogger.afRDLog(strAFAdRevenueData);
        } else {
            AFLogger.afVerboseLog(strAFAdRevenueData);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFAdRevenueData);
        httpURLConnection.setConnectTimeout(this.AFAdRevenueData);
        httpURLConnection.addRequestProperty("Content-Type", getMediationNetwork().getCurrencyIso4217Code);
        Map<String, String> map2 = this.getMonetizationNetwork;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getRevenue.length));
        OutputStream outputStream = Callback.getOutputStream((URLConnection) httpURLConnection);
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getRevenue);
        bufferedOutputStream.close();
        String strAFAdRevenueData2 = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + ("response code:" + Callback.getResponseCode(httpURLConnection) + Global.BLANK + Callback.getResponseMessage(httpURLConnection) + "\n\tbody:" + getMonetizationNetwork(httpURLConnection) + "\n\ttook " + (System.currentTimeMillis() - j2) + "ms"));
        if (getRevenue()) {
            AFLogger.afRDLog(strAFAdRevenueData2);
        } else {
            AFLogger.afVerboseLog(strAFAdRevenueData2);
        }
        return AFd1qSDK.getCurrencyIso4217Code(httpURLConnection);
    }

    public abstract String AFAdRevenueData(String str);

    public final boolean AFAdRevenueData() {
        boolean revenue;
        HttpURLConnection httpURLConnection;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection2 = null;
        try {
            String currencyIso4217Code = getCurrencyIso4217Code();
            Intrinsics.checkNotNullParameter(currencyIso4217Code, "");
            URLConnection uRLConnectionOpenConnection = new URL(currencyIso4217Code).openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (Throwable th) {
            th = th;
        }
        try {
            revenue = getRevenue(httpURLConnection, jCurrentTimeMillis);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            try {
                revenue = false;
                String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + (httpURLConnection2 != null ? httpURLConnection2.hashCode() : 0) + "] " + ("error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage()));
                if (getRevenue()) {
                    AFLogger.afRDLog(strAFAdRevenueData);
                } else {
                    AFLogger.afVerboseLog(strAFAdRevenueData);
                }
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
        return revenue;
    }

    public abstract String getCurrencyIso4217Code();

    public abstract AFd1jSDK getMediationNetwork();

    public boolean getRevenue() {
        return this.getCurrencyIso4217Code;
    }
}
