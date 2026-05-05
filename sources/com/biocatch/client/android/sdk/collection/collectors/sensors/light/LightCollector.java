package com.biocatch.client.android.sdk.collection.collectors.sensors.light;

import android.hardware.SensorEvent;
import android.os.Handler;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.collection.SensorEventListenerBase;
import com.biocatch.client.android.sdk.collection.SensorService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$c$wDCU0}*\tUOog|Vb\u000bI\u0012\u000e\u0016\u0007p4I[{e\u0012\u001d2JģG3coEʠhtD\u000e(2(9\u007fڎ\u0017ɝZH>u;f[\u0010 0XphS\u001dQ\u0013\u001c*\u0006l#\u0011\"jkf6vqm>=)\u001bipUϮc0\u000bUUTbD%v\u0010<[DET-%\u0002#Mf$M\u0011`\n=3\u000bW+9h\fWdxF(]1]0urTzKe)\u00125OgcynT<H\r\n\u0016T\u0004<\u0010]\u001d\u0005ƽ\u001cǴ\f\u0012Kvx^N\\RpP\r\u0013ad%[T\nږ;ӸjUy=\u001f]E\fU\u001f,4\u0019nOm\u000bb7ڔ\u001dƻ{UISFPVbZkK\u0003\u001cp\u0011\u0014`V\u0007ϯ\u0002\u009e\u007f\u0015F\u0019+MiMs3y\u0019`D\u0016\u000f;3?ךkʐLD:p\u001cP8#\\lR\u007f\u001dk~f\u000f~g܈\u001eΤ\u000b\u0002 \u0015&x\u0006Pǂ)5"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0019^\u0010Q:Vk]C'}\"A&\u000f,G\u0011EuV", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\f_v0V3R:kR{=!nV\u001cN\u0001", "Ad]@b9,S&\u0010~\\,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u001aN\u00048KJN\u0002", "Ad]@b9-V&~v]\u000fx\u0012.l\u007f5", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", ":hV5g\nHZ ~xm6\nv/t\u000f,\u0005B\u000f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0019^\u0010Q:Vk]C'}\"A&\u000f,G\u0011Eun\f%\u001d9srP,", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^VaB\u0015m9<v4XPL,29nF\u0013\u001fd\u0012Mt\u0017\u0013#$ wC>\u001f\u0015\u00020\u007fEpJ\t\u001a\u00183f\u007f@YYE\u0001\u0019uJ82Bb^\u0007QED,8c\u0012)\u001bfAA$\u0012\u0001\u001d%q\u001a,\u0014\u0003Z\u0011pa\u0004tu\u0011'zA2Hzi\u0010LsW?\u0004p\u0006O}z!\u0010b{2t+\u0013>7$d\u0014Zk!@lN{*fIp#:F\u0011;Zax6:\u0017g,k\f\r,3;!molV\u000e\r'\u0015eBa)pFV\rL\u001f3\u0006", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ad]@b9\u001f`\u001d~\u0004]3\u0011q+m\u007f", "5dc X5L]&_\bb,\u0006\b6yh$\u0004@", "Ad]@b9-g$~", "", "5dc X5L]&m\u000fi,", "u(8", "Ad]@b9-g$~hm9\u0001\u00121", "5dc X5L]&m\u000fi,j\u0018<i\t*", "6`]1_,,S\"\r\u0005k\n\u007f\u00058g\u007f", "", "3uT;g", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$'\u0001\u000eE\u0006z", "Ag^B_++S\u0017\t\b]\u001ax\u0011:l\u007f", "", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LightCollector extends SensorEventListenerBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightCollector(SensorService sensorService, Handler sensorThreadHandler, LightCollectorSettings lightCollectorSettings, Utils utils) {
        super(sensorService, sensorThreadHandler, lightCollectorSettings, utils);
        Intrinsics.checkNotNullParameter(sensorService, "sensorService");
        Intrinsics.checkNotNullParameter(sensorThreadHandler, "sensorThreadHandler");
        Intrinsics.checkNotNullParameter(lightCollectorSettings, "lightCollectorSettings");
        Intrinsics.checkNotNullParameter(utils, "utils");
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.LightEvents;
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isLightEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "lightEvents";
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected String getSensorFriendlyName() {
        return "Light";
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected int getSensorType() {
        return 5;
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected String getSensorTypeString() {
        return "android.sensor.light";
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    public synchronized void handleSensorChange(SensorEvent event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        addToQueue(new LightEventModel(getContextIDCache().get(), getCurrentEventId(), getUtils().upTimeToEpoch(event.timestamp), event.values[0]));
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    public boolean shouldRecordSample(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!super.shouldRecordSample(event)) {
            return false;
        }
        float[] fArr = event.values;
        Intrinsics.checkNotNullExpressionValue(fArr, "event.values");
        return !(fArr.length == 0);
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Light events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Light events collector is already started. Aborting the start operation.");
        }
        super.start();
        setStarted(true);
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        super.stop();
        setStarted(false);
    }
}
