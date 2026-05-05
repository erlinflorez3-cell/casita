package com.dynatrace.agent.events.enrichment;

import com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImplKt;
import com.dynatrace.agent.common.connectivity.NetworkType;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.agent.storage.preference.MetricsData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":0\u007f\u0007|jAӄLeV.ZS8.s{:'aҕ\bّkUH|b\u0016_Rug\u0007J\t\fß\u0013\b\u001czx/\u0012a\u0007a*\u0015BD\u007f?aS\u001eB\u007ft=F\u0013'J\"f\u0002-\u0007*,X\u0010%\u0001qTR\u0012xP~Dj\r{\rB\u0018\u0016@0\u0001Lb\u0016W|H5mH:;\u0003\u0018Jv-o2\rM;L\u00030Sv*.9LO5C-{\t\u0017Tk?1E FKho79V\fWd`(\u001a%-_\r\fxTeKQ1\u00185+gcyQdߍyߡ\u007f\rDǉأ\n5"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017!7i7\u001e\u0014PaH\u0014g*\\d7RWU0\\_H", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017 7y4\u0006\u0015wn=\u0005q\u001a^\u00022NPN92", ";dc?\\*L1\u0015|}^", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u0003r($", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn@f}!7z\u00167KC\u0005S4-\"l_Ge_;JLj8", "At_=_@", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Dx8\u001c\u0018paB\u0016?;]\u0004+D\\],2", "/cS\u0011X=BQ\u0019fzm9\u0001\u0007=", "", "", "/cS\u001cf\u0014>b&\u0003xl", "/cS\u000ec7&S(\f~\\:", "/cS\u0014X6%]\u0017z\nb6\u0006p/t\r,yN", "/cS\u001bX;P]&\u0005ir7|", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CachedMetricsSupplier extends BaseMetricsSupplier {
    private final MetricsData metricsCache;

    public CachedMetricsSupplier(MetricsData metricsCache) {
        Intrinsics.checkNotNullParameter(metricsCache, "metricsCache");
        this.metricsCache = metricsCache;
    }

    private final void addAppMetrics(List<EnrichmentAttribute> list) {
        AppVersion appVersion = this.metricsCache.getAppVersion();
        if (appVersion != null) {
            AttributeSupplierKt.addAttribute(list, EventKeys.APP.VERSION, String.valueOf(appVersion.getVersionCode()));
            AttributeSupplierKt.addAttribute(list, EventKeys.APP.SHORT_VERSION, appVersion.getVersionName());
        }
        AttributeSupplierKt.addAttribute(list, EventKeys.APP.BUNDLE, this.metricsCache.getBundle());
    }

    private final void addDeviceMetrics(List<EnrichmentAttribute> list) {
        Integer numValidScreenDimensionOrNull$com_dynatrace_agent_release = validScreenDimensionOrNull$com_dynatrace_agent_release(this.metricsCache.getDeviceScreenWidth());
        Integer numValidScreenDimensionOrNull$com_dynatrace_agent_release2 = validScreenDimensionOrNull$com_dynatrace_agent_release(this.metricsCache.getDeviceScreenHeight());
        if (numValidScreenDimensionOrNull$com_dynatrace_agent_release2 != null && numValidScreenDimensionOrNull$com_dynatrace_agent_release != null) {
            AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.SCREEN_WIDTH, numValidScreenDimensionOrNull$com_dynatrace_agent_release);
            AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.SCREEN_HEIGHT, numValidScreenDimensionOrNull$com_dynatrace_agent_release2);
        }
        String deviceManufacturer = this.metricsCache.getDeviceManufacturer();
        if (deviceManufacturer == null) {
            deviceManufacturer = "unknown";
        }
        AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.MANUFACTURER, deviceManufacturer);
        String deviceModelIdentifier = this.metricsCache.getDeviceModelIdentifier();
        AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.MODEL_IDENTIFIER, deviceModelIdentifier != null ? deviceModelIdentifier : "unknown");
        AttributeSupplierKt.addAttribute(list, EventKeys.DEVICE.IS_ROOTED, Boolean.valueOf(this.metricsCache.getDeviceIsRooted()));
        AttributeSupplierKt.addAttributeIfValueNotNull(list, EventKeys.DEVICE.ORIENTATION, toDeviceOrientation$com_dynatrace_agent_release(this.metricsCache.getDeviceOrientation()));
        AttributeSupplierKt.addAttributeIfValueNotNull(list, EventKeys.DEVICE.BATTERY_LEVEL, validBatteryLevelOrNull$com_dynatrace_agent_release(Integer.valueOf(this.metricsCache.getDeviceBatteryLevel())));
    }

    private final void addGeoLocationMetrics(List<EnrichmentAttribute> list) {
        Double locationLatitude = this.metricsCache.getLocationLatitude();
        Double locationLongitude = this.metricsCache.getLocationLongitude();
        if (locationLatitude == null || locationLongitude == null) {
            return;
        }
        AttributeSupplierKt.addAttribute(list, EventKeys.GEO.LOCATION_LAT, Double.valueOf(new BigDecimal(locationLatitude.doubleValue()).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        AttributeSupplierKt.addAttribute(list, EventKeys.GEO.LOCATION_LON, Double.valueOf(new BigDecimal(locationLongitude.doubleValue()).setScale(2, RoundingMode.HALF_UP).doubleValue()));
    }

    private final void addNetworkType(List<EnrichmentAttribute> list) {
        NetworkType networkTypeOrNull = NetworkConnectivityCheckerImplKt.toNetworkTypeOrNull(this.metricsCache.getNetworkType());
        AttributeSupplierKt.addAttributeIfValueNotNull(list, EventKeys.NETWORK.CONNECTION_TYPE, networkTypeOrNull != null ? NetworkTypeExtensionsKt.getStringRepresentation(networkTypeOrNull) : null);
    }

    private final void addOsMetrics(List<EnrichmentAttribute> list) {
        AttributeSupplierKt.addAttribute(list, EventKeys.OS.NAME, this.metricsCache.getOsName());
        String osVersion = this.metricsCache.getOsVersion();
        if (osVersion == null) {
            osVersion = "unknown";
        }
        AttributeSupplierKt.addAttribute(list, EventKeys.OS.VERSION, osVersion);
    }

    @Override // com.dynatrace.agent.events.enrichment.AttributeSupplier
    public List<EnrichmentAttribute> supply() {
        List<EnrichmentAttribute> listCreateListBuilder = CollectionsKt.createListBuilder();
        addDeviceMetrics(listCreateListBuilder);
        addOsMetrics(listCreateListBuilder);
        addAppMetrics(listCreateListBuilder);
        addGeoLocationMetrics(listCreateListBuilder);
        addNetworkType(listCreateListBuilder);
        return CollectionsKt.build(listCreateListBuilder);
    }
}
