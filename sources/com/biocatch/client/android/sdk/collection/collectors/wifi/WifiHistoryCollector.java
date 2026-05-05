package com.biocatch.client.android.sdk.collection.collectors.wifi;

import android.app.Application;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.permissions.PermissionService;
import com.biocatch.client.android.sdk.techicalServices.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u0015sڔ<$q$yCAU\"}8\tWNmhvJp\u000bK\u000f\f\u0017\u0001j:U]xc\u0013\u00172XoG\u074cUoK9hҚ>\u000562*8\u007f\u0006\u0007ɝ@Ϻ@|\u000bE[\f@0norQ,\u000e0*\u0016\u0014?8\u0001L^wRDK\u0005]h33\u0007wGf'\u000e6\rQ\u001bMl';~q\"9IO5C/٨\u0007\u0007`f\b\u0011M\fU\u0005\u0017BW/W\u0010o6\u0007\u001dZ)sW\u001b{\u000b(r\u0004\u007f`R<{[qPh\u000eV}Qԋ\u000fʀ\b\u000e\u000eΩ\u0019@;&~\b<@+G*ĊRؿbF\u0018|gD%4PE9I3f\u007frqm%Ѱ}˿\u0011\";\u0003t3ig^r#/lw\u007fF\b\u0015\u0014ˇP̆]A\u0006\u0006vx\u0010AT<U\u0007G{?6m©C٦=#)ǽRTRj\u000f\u0005\u000fl*֢T͕D\"vݫ\b6\u0017\u0015rD\u0013\u000fB¯Vг0\u0011Uȼ%\u0013\f + \u000b\u0011\u0013Ɯ'ŎROpȉҽQ}"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016=\u0012\\:\u0017\u0012m\u001f.uK7\u001d\u00176VW", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p1U-,dN{<q\u001ca\u0015N)\u001c\u000ff\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016=\u0012\\:\u0017\u0012m).mD>t", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", ">da:\\:LW#\bh^9\u000e\r-e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0017N\u0004/KZ\\0f[`=!#^\fN\u0001", "1n[9X*MW#\b\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\nX}.GJ]0f[\u0001\u0013", "6hbAb9R1#\u000f\u0004m", "", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEt:\u0001-~V\u0002*5i%,P\r9r8\u001e\u001ew+5\u0010b9Xz&\u0011ZM2&P|J\u0014[e\u000e[3\u0011\u0013gE.wR\u0001\n\b9Q\u0006Iv\u0005\u0016\u001f{5w\u0002FT\u0010\u001d`\u0013\u007fIreJc]uV?H,(k\u0010_&k\u00046-\u0013~#\u001fg\u001a<\t\u0002\u001d rP|keC h81OqYFS93F{.\u001fI\u000b{\u001c;fJ\u000f[+\u000e<s3h\u000fIc'<aB\u00115[N1*5\u0006\u0011ISk\u007fuL\rnh_\u0012\u001bb~!(ilq\u001eRw", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "EhU6@(GO\u001b~\b", "\u001a`]1e6BRb\bzmu\u000f\r0iI\u001a\u007fA\u0005~\u0013Pk\u0010<\u0004z", "1n]3\\.N`\u0019", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "@t]\u0010b3ES\u0017\u000e~h5", "\u001cdcDb9D1#\u0007\u0006Z9x\u00189r", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WifiHistoryCollector extends OnDemandCollector<WifiHistoryModel> {
    private final Collections collections;
    private int historyCount;
    private final PermissionService permissionService;
    private final Utils utils;
    private final WifiManager wifiManager;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r(4\u0012}\b|ʑi6TgX.\u0001SX\u000e,~Č([2r\fQc\u001c\u0016\"7R~kurbZ9C?\n$}\u0003,wU?qܱ\u00138"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016=\u0012\\:\u0017\u0012m\u001f.uK7\u001d\u00176V@$h\u0010\u001e \u001b;HzJa\fTu$\u007fN~", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001a`]1e6BRb\bzmu\u000f\r0iI\u001a\u007fA\u0005t!Pp\u0012>\u000721h\u0002*@C", "u(E", "1n\\=T9>", "", "=0", "=1", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class NetworkComparator implements Comparator<WifiConfiguration> {
        @Override // java.util.Comparator
        public int compare(WifiConfiguration o1, WifiConfiguration o2) {
            Intrinsics.checkNotNullParameter(o1, "o1");
            Intrinsics.checkNotNullParameter(o2, "o2");
            return o2.networkId - o1.networkId;
        }
    }

    public WifiHistoryCollector(Application application, PermissionService permissionService, Collections collections, int i2, Utils utils) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(permissionService, "permissionService");
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.permissionService = permissionService;
        this.collections = collections;
        this.historyCount = i2;
        this.utils = utils;
        Object systemService = application.getSystemService("wifi");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        this.wifiManager = (WifiManager) systemService;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        super.configure(configurationRepository);
        this.historyCount = configurationRepository.getInt("wifiHistoryCount", this.historyCount);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.WifiHistory;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isWifiHistory;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "wifi_history";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector
    public WifiHistoryModel runCollection() {
        List<WifiConfiguration> configuredNetworks;
        if (!this.permissionService.hasPermission("android.permission.ACCESS_FINE_LOCATION") || !this.permissionService.hasPermission("android.permission.ACCESS_WIFI_STATE")) {
            Log.Companion.getLogger().info("Application has no permission to access WIFI data. WIFI History data will not be collected");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.utils.isVersionLessOrEqualTo(28) || (configuredNetworks = this.wifiManager.getConfiguredNetworks()) == null) {
            return null;
        }
        this.collections.sort(configuredNetworks, new NetworkComparator());
        int iMin = Math.min(this.historyCount, configuredNetworks.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            String str = configuredNetworks.get(i2).SSID;
            Intrinsics.checkNotNullExpressionValue(str, "history[i].SSID");
            arrayList.add(StringsKt.replace$default(str, "\"", "", false, 4, (Object) null));
        }
        return new WifiHistoryModel(arrayList);
    }
}
