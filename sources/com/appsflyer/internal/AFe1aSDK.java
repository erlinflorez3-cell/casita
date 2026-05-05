package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLc\u0003\u0010I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"}(\nWN}gvJ`\u000bK\u000f\u0014\u001d\u0001̓4Ikxe\u0012\u00152JoM<UoCFvҚf\u000b0428(\u0005/\u0019j\u0002\u0016{\u000bGY\u000e*0nqJV\u001bQ\u001d\u001a@\tN$\u000f$tg|;XpkBG#1pRR5iH|{\u0016VZ-\r\u0005m6+nB߱\u0019'Y\u0010\u0015`$\\\u0011O\nE\u0015j7'YI\nVdg0\u0018#-g\r\frloԇUb\u001279`,X^\u001e@w)\u000eSNǬ\u0012\b-X<@bu\u0016#Kv\tRndHq۰\u0004|gK%;H@9Q3f\u007fx\u0002+\u05ee;}\u000b%,<I{/ul\u000e\u000f,afɐU3WZKa\u001f\u001cgZ\u0006\u0004\u001fk8*ZΆIĬ3\u007f\u00190\u001d@Ew\n5/\u000b\u001aHrr-\t7íUׂVLH$t+EHY\u001ehf|\u0005\u001aW\u000bX\u0003ҎOɟX\u000b\u0006\n\u0019@j\u0019\r33 fO\u0017l!M4܇'çj;apq1e]/ECk{\u0010\u0010S-\u0014\u0016־dۖ\\jJU\u0012\u007fjN"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\br\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\bw\u0013\u0014?S", "", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0012\by\u0013\u0014?S", ">/", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", ">0", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b\f\u0013\u0014?S", ">1", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\b\u007f\u0013\u0014?S", ">2", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\by\u0013\u0014?S", ">3", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\bz\u0013\u0014?S", ">4", "\nh]6g\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn@B(#8cu\u001ek 6\u0017?FvB\u001f\u001c|aFPg5]v4PHUu83p\t\u001e\u007f9s$\u0012\u000b\u000fa\u000b yOE \u000f@I\u000f\u0005l\n\u001b\u0016\u001b>fw\f2pFE*c \u000f>-Wi\u0002\u0011=Pm8e\u0013s\u001di\u0004>-#q&$dWwe\\U\\{@XM=.\u0017\u0005@m:xfTFvi<\u0002p#T\u000bw\u001f;T{tP\u000e\u0002\u007f-$Cj!N\u0016HfB\u00117gO(-J< \tOl\u0005lK\u0017d&+cne\u00015\u0007DK9\f\u007f", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\by\u0013\u0014?S", "\u000fE01E,OS\"\u000fz=(\f\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011k\u0019G\u0005&<m}-\u0001q\u001f=MPDg;gpI`\u0005\nQ\u000b4L", "", "u(9", "\u001ab^:\"(I^'\u007f\u0002r,\nR+t\u000f5\u007f=\u0011&\u001bQxW\u0018\u00020C:\u000547z\u0003.YS;yC\u0005\u0019vp9\u0010c9$", "1n\\=b5>\\(K", "u(;0b4\bO$\n\t_3\u0011\t</{7\u000bM\u0005\u0014'Vs\u0018E@\u0001@d\f\u0001>\u0002\u0016;:CG{4,$OeG\u0016c5N\u0004|", "", "1n_FW,?O)\u0006\n", "u(I", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "3pd._:", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\by\u0013\u0014?S", "5dc\u001fX=>\\)~", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\bz\u0013\u0014?S", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "BnBAe0GU", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\b\u007f\u0013\u0014?S", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "1n_F", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", "6`b566=S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0012\by\u0013\u0014?S"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFe1aSDK extends AFe1fSDK<String> {
    public AFh1iSDK component2;
    private final AFc1oSDK copy;
    private final AFc1hSDK equals;
    private final AFi1hSDK hashCode;
    private final AFg1nSDK toString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1aSDK(AFi1hSDK aFi1hSDK, AFc1oSDK aFc1oSDK, AFd1zSDK aFd1zSDK, AFg1nSDK aFg1nSDK, AFc1hSDK aFc1hSDK) {
        this(aFi1hSDK, aFc1oSDK, aFd1zSDK, aFg1nSDK, aFc1hSDK, null, 32, null);
        Intrinsics.checkNotNullParameter(aFi1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1aSDK(AFi1hSDK aFi1hSDK, AFc1oSDK aFc1oSDK, AFd1zSDK aFd1zSDK, AFg1nSDK aFg1nSDK, AFc1hSDK aFc1hSDK, AFh1iSDK aFh1iSDK) {
        super(AFe1pSDK.PLAY_INTEGRITY_API, new AFe1pSDK[]{AFe1pSDK.CONVERSION}, aFd1zSDK, "PIA");
        Intrinsics.checkNotNullParameter(aFi1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFh1iSDK, "");
        this.hashCode = aFi1hSDK;
        this.copy = aFc1oSDK;
        this.toString = aFg1nSDK;
        this.equals = aFc1hSDK;
        this.component2 = aFh1iSDK;
        this.AFAdRevenueData.add(AFe1pSDK.CONVERSION);
    }

    public /* synthetic */ AFe1aSDK(AFi1hSDK aFi1hSDK, AFc1oSDK aFc1oSDK, AFd1zSDK aFd1zSDK, AFg1nSDK aFg1nSDK, AFc1hSDK aFc1hSDK, AFh1iSDK aFh1iSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1hSDK, aFc1oSDK, aFd1zSDK, aFg1nSDK, aFc1hSDK, (i2 & 32) != 0 ? new AFh1iSDK() : aFh1iSDK);
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return TimeUnit.MINUTES.toMillis(1L);
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AFd1hSDK<String> AFAdRevenueData(String str) throws Throwable {
        AFd1bSDK aFd1bSDK;
        String str2;
        LinkedHashMap linkedHashMap;
        String strZd = C1593ug.zd("hb[", (short) (C1607wl.Xd() ^ 8399), (short) (C1607wl.Xd() ^ 2961));
        String strOd = C1561oA.od("&\u001e\u0015\u0012& \u001b\u0014\u001c", (short) (C1607wl.Xd() ^ 5196));
        Intrinsics.checkNotNullParameter(str, "");
        AFh1iSDK aFh1iSDK = this.component2;
        Map<String, Object> map = aFh1iSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        Context context = this.copy.getCurrencyIso4217Code.getMonetizationNetwork;
        Class<?> cls = Class.forName(C1561oA.Kd("r\u0001w\u0007\u0005\u007f{F|\n\n\u0011\u0003\r\u0014Nd\u0012\u0012\u0019\u000b\u001f\u001c", (short) (FB.Xd() ^ 3376)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 20452);
        short sXd2 = (short) (FB.Xd() ^ 25147);
        int[] iArr = new int["N*7q@\u001f%x>\u001a\u007fp:\u0011".length()];
        QB qb = new QB("N*7q@\u001f%x>\u001a\u007fp:\u0011");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            map.put(C1561oA.Xd("gwxhso", (short) (C1499aX.Xd() ^ (-21392))), (String) method.invoke(context, objArr));
            map.put(Wg.vd("+\u001b!\u0014*\u0018$$\u0019\u001e\u001c", (short) (C1580rY.Xd() ^ (-4191))), AFc1oSDK.getMonetizationNetwork());
            map.put(Qg.kd("\u0017%$\u0012(\u0016\"\"\u0017\u001c\u001a\n\u0018\n\u0015\f", (short) (C1633zX.Xd() ^ (-12579)), (short) (C1633zX.Xd() ^ (-31620))), this.copy.n_().versionName);
            this.toString.AFAdRevenueData(map);
            try {
                AFi1jSDK mediationNetwork = this.hashCode.getMediationNetwork();
                if (mediationNetwork != null) {
                    linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    short sXd3 = (short) (C1499aX.Xd() ^ (-17860));
                    short sXd4 = (short) (C1499aX.Xd() ^ (-25592));
                    int[] iArr2 = new int["ld[Xl`cZggS^`".length()];
                    QB qb2 = new QB("ld[Xl`cZggS^`");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                        i3++;
                    }
                    linkedHashMap2.put(new String(iArr2, 0, i3), Long.valueOf(mediationNetwork.getMediationNetwork));
                    linkedHashMap2.put(C1561oA.ud("A@=)6132.7", (short) (Od.Xd() ^ (-16760))), Long.valueOf(mediationNetwork.getCurrencyIso4217Code));
                    if (mediationNetwork.getRevenue != null) {
                        linkedHashMap2.put(strOd, mediationNetwork.getRevenue);
                    }
                    if (mediationNetwork.AFAdRevenueData != null) {
                        short sXd5 = (short) (ZN.Xd() ^ 5000);
                        int[] iArr3 = new int["9GHFJ8=J02".length()];
                        QB qb3 = new QB("9GHFJ8=J02");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd5 ^ i4));
                            i4++;
                        }
                        linkedHashMap2.put(new String(iArr3, 0, i4), mediationNetwork.AFAdRevenueData);
                    }
                    linkedHashMap.put(strZd, linkedHashMap2);
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    aFh1iSDK.AFAdRevenueData(linkedHashMap);
                }
                if (!this.hashCode.AFAdRevenueData()) {
                    Map<String, Object> map2 = aFh1iSDK.AFAdRevenueData;
                    Intrinsics.checkNotNullExpressionValue(map2, "");
                    Map<String, Object> mapAFAdRevenueData = AFj1aSDK.AFAdRevenueData(map2);
                    short sXd6 = (short) (C1580rY.Xd() ^ (-30819));
                    int[] iArr4 = new int["tngflr}lnyss".length()];
                    QB qb4 = new QB("tngflr}lnyss");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd6 + sXd6) + sXd6) + i5));
                        i5++;
                    }
                    mapAFAdRevenueData.put(new String(iArr4, 0, i5), Boolean.TRUE);
                }
            } catch (Throwable th) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.PLAY_INTEGRITY_API;
                short sXd7 = (short) (Od.Xd() ^ (-26562));
                short sXd8 = (short) (Od.Xd() ^ (-16388));
                int[] iArr5 = new int["Hvwuy(\u0001rtxr.ptu{\u0002{5f`Y9~|\u0011~>\u0014\u0010A\u0013\u0005\u001e\u0012\u0016\t\r".length()];
                QB qb5 = new QB("Hvwuy(\u0001rtxr.ptu{\u0002{5f`Y9~|\u0011~>\u0014\u0010A\u0013\u0005\u001e\u0012\u0016\t\r");
                int i6 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd7 + i6)) + sXd8);
                    i6++;
                }
                AFh1ySDK.e$default(aFLogger, aFg1cSDK, new String(iArr5, 0, i6), th, true, false, false, false, 96, null);
            }
            AFd1hSDK<String> currencyIso4217Code = ((AFe1fSDK) this).component4.getCurrencyIso4217Code(this.component2, ((AFe1fSDK) this).component1.getMediationNetwork(), this.equals);
            Map<String, Object> map3 = this.component2.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map3, "");
            if (currencyIso4217Code != null && (aFd1bSDK = currencyIso4217Code.getMonetizationNetwork) != null && (str2 = aFd1bSDK.getMediationNetwork) != null) {
                JSONObject jSONObject = new JSONObject(map3);
                if (jSONObject.has(strZd)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(strZd);
                    if (jSONObject2.has(strOd)) {
                        jSONObject2.put(strOd, AFg1aSDK.getCurrencyIso4217Code(jSONObject2.getString(strOd)));
                    }
                }
                AFg1aSDK.getRevenue(toString() + Jg.Wd("?{n\f!AT\u0001Zu\u0014fNa\u0016]\u0018\u0015", (short) (OY.Xd() ^ 22538), (short) (OY.Xd() ^ 1322)), jSONObject);
                AFd1oSDK aFd1oSDK = this.component3;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                aFd1oSDK.getRevenue(str2, string);
            }
            return currencyIso4217Code;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }
}
