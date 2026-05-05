package com.biocatch.client.android.sdk.collection.collectors.wifi;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.ApplicationCache;
import com.biocatch.client.android.sdk.core.hash.HashService;
import com.biocatch.client.android.sdk.core.permissions.PermissionService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\bCCU ~*\teNogtKb\u000bQ\u001b\u000e\u0016~k4Ikxe\u0012\u00152HģU\u074c}uM;ptd\u0005N1b[\n\t\u000f\u001bBH>x\u000bGY\u000f*0ntJV\u001bR\u001d\u001a@\fN$\u000f%tg|>Ղp]H8k\u000bwZf)u/+MSZ%9\u001b\u0001y\u001eYKm\nkȃUΫ\u000bVsA\tK\u007fJUz55CI\"fl-VЃ\u0017ۣS\u0011ut,l\u0013b1\u001852gcyXdߍyߡ\u007f\rDǉ^\u00185ZF-Hy>b\nϖtՂDT\u001a`H\u0014\tv\u0007#3\u0005K+g!=Ϣcޅ\u001dN?ަU\u0019,&\u0019nO_+טbڠ\u001fT\u007f\u0383\u0002]NS`N8p\u0014Ъ\u0006Ͳf\u00022ʶΫK\u0019"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cY9#\u0012h\u001d*)\u000b\u0005gO\u000fxH@.\u0016\nS\tBh~\u001b \u001b\u000b", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p1U-,dN{<q\u001ca\u0015N)\u001c\u000ff\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cY9#\u0012h\u001d*)\u000b\u0005gO\u000fxH@.\u0016\u0014S\u0001;oV", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", ">da:\\:LW#\bh^9\u000e\r-e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0017N\u0004/KZ\\0f[`=!#^\fN\u0001", "6`b5F,Kd\u001d|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wP?In}\u0001\u0011vd'\u0007p=Rt'\u001d", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"5*fZ<:\u0018\u001cX\n])\u0010NWH(nMFh\u00045H\u000fEl\u007fU$\r;4nLc\u0010\u0011\u0005\u0015\u0003I-vT]i\u0003U\u000b0b7l\u0010m+`DC\u0012\u0014~*\u001ffP\u0004py]\u0019<O}qeC(x;m<t_FN~\u001f8}&,U\u007fv[@Wztr7\u00114s9`\u0013N1z:l{\u0003,iR+$6\u0012y=Uk?iB\u0018f\u001bp\u0006\u0011,1:\u0018rogGX\u0005g\u001fc?jm\u007f=\u001c\u0004HRp\u0019)V\f>j}\u001f\u0012P\u0002wnJG\u001dd\u000e\u0016\u007fH,h}\u0003\u000ep& = Jmd,\u001b", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "EhU6@(GO\u001b~\b", "\u001a`]1e6BRb\bzmu\u000f\r0iI\u001a\u007fA\u0005~\u0013Pk\u0010<\u0004z", "@t]\u0010b3ES\u0017\u000e~h5", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LatestAccessPointsCollector extends OnDemandCollector<LatestAccessPointsModel> {
    private final ConfigurationRepository configurationRepository;
    private final HashService hashService;
    private final PermissionService permissionService;
    private final WifiManager wifiManager;

    public LatestAccessPointsCollector(ApplicationCache applicationCache, PermissionService permissionService, HashService hashService, ConfigurationRepository configurationRepository) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 32462);
        int[] iArr = new int["!1.+% \u001b/!($y\u0015\u0018\u001a\u0018".length()];
        QB qb = new QB("!1.+% \u001b/!($y\u0015\u0018\u001a\u0018");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(applicationCache, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(permissionService, C1561oA.Yd("ZP^ZWbcZaaGZhma\\_", (short) (C1607wl.Xd() ^ 24801)));
        Intrinsics.checkNotNullParameter(hashService, Xg.qd("lfyo[n|\u0002ups", (short) (C1499aX.Xd() ^ (-9879)), (short) (C1499aX.Xd() ^ (-4232))));
        Intrinsics.checkNotNullParameter(configurationRepository, Jg.Wd("YM]MqI\u0007m\u000eX\u001fN=:-q\"\u000e5\u001aD1I", (short) (C1499aX.Xd() ^ (-25471)), (short) (C1499aX.Xd() ^ (-11714))));
        this.permissionService = permissionService;
        this.hashService = hashService;
        this.configurationRepository = configurationRepository;
        Context applicationContext = applicationCache.get().getApplicationContext();
        Object[] objArr = {ZO.xd("\f2\" ", (short) (C1607wl.Xd() ^ 5469), (short) (C1607wl.Xd() ^ 24999))};
        Method method = Class.forName(C1626yg.Ud("Z7*N_&oE</\u001d\u001eR\ty\u0015?`Rwei\u0005", (short) (OY.Xd() ^ 18126), (short) (OY.Xd() ^ 923))).getMethod(EO.Od("x@]c#J/\u0010vAM<\u000b{Q6", (short) (C1607wl.Xd() ^ 32518)), Class.forName(Ig.wd("c\u0015\u001abtv\u0016 j\u0013<9\rs^3", (short) (Od.Xd() ^ (-28635)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(applicationContext, objArr);
            short sXd2 = (short) (C1499aX.Xd() ^ (-4646));
            int[] iArr2 = new int["\b\u000e\u0004\u00035wt\u0001\u007f\u007f\u0004.oq+mj{{&ys#ppn,lrhg\u001amqg[\u0015UaVc_XR\u001bZP^\u0017_PLN\u0012:KGI,?K=B?K".length()];
            QB qb2 = new QB("\b\u000e\u0004\u00035wt\u0001\u007f\u007f\u0004.oq+mj{{&ys#ppn,lrhg\u001amqg[\u0015UaVc_XR\u001bZP^\u0017_PLN\u0012:KGI,?K=B?K");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Intrinsics.checkNotNull(objInvoke, new String(iArr2, 0, i3));
            this.wifiManager = (WifiManager) objInvoke;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.LatestAccessPoints;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.enableLatestAccessPointsCollection;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "latest_access_points";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector
    public LatestAccessPointsModel runCollection() throws JSONException {
        if (!this.permissionService.hasPermission("android.permission.ACCESS_FINE_LOCATION")) {
            Log.Companion.getLogger().info("Application has no permission for ACCESS_FINE_LOCATION. Latest Access Points data will not be collected");
            return null;
        }
        List<ScanResult> scanResults = this.wifiManager.getScanResults();
        if (scanResults == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.configurationRepository.getInt(ConfigurationFields.ssidTruncationLength);
        for (ScanResult scanResult : scanResults) {
            JSONObject jSONObject = new JSONObject();
            HashService hashService = this.hashService;
            String str = scanResult.SSID;
            Intrinsics.checkNotNullExpressionValue(str, "accessPoint.SSID");
            String truncatedHash = hashService.getTruncatedHash(str, i2);
            jSONObject.put("level", scanResult.level);
            jSONObject.put("ssid", truncatedHash);
            jSONObject.put("bssid", scanResult.BSSID);
            arrayList.add(jSONObject);
        }
        return new LatestAccessPointsModel(arrayList);
    }
}
