package com.biocatch.client.android.sdk.collection.collectors.sensors.gyroscope;

import android.hardware.SensorEvent;
import android.os.Handler;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.DataQueue;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent;
import com.biocatch.client.android.sdk.collection.SensorGateKeeper;
import com.biocatch.client.android.sdk.collection.SensorService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.EventsSubscriber;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
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
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HpG3[{E9fu>\u0005.6*8\u007f\b\t\u001a8N\u0018v\u0001GS\f 0H\u0081BR#M\r\u001a\u0018\u0006F \u0017\u001edɡV6Vue:5$\t݃X÷We@~]\rtTU\f7\u001d./N8M\u0015SU\u0013\u000b`^W\u0003muM\tv,?+wyg:f\u0007,\u0015YW\u001da\u0001/t\u0005\u007fj\u001c+9Z{K~\u001a8{\t\t%<2\u001cΝ+H<<bt\u00167Kt!}pT\u0010\nZ\u007f)\u000e|+m\u000eAXQ\u001b\u0015{\u0012?'|O{3<d7I|/\fl\u000e\u000fFKX\u0006\u007fIQnl\u000fbR_K \u001cp\u0011,p\u0018xM\u000eb\u0014\u0011\\AkK,K11\u0004\u0002vU\u001eK[²jרmV`B(\u0001$Jz\u001b\u001an\\d3\u0001\u0007)/£\u0013ܖ X\u001f\u007f\u000e).sHN/=(N}\u0002 ?$ρ\fɻ3jO[t\u0006\u001cr\njABic>o)Λ\u0016͖@b\r֚7Na(r\\V?\tʎvݻ{{L\u0088\\\u001f@]\n\u001cbI\bǌhČL\u0003&Փ\u0012\t\u0017~rh>\u001c+՟0ғm$|էQbj\u0011\bg'bbO7Ċ/ۮU91([CvOM5\u0015!\f\u007fu\u000b\u0003\u001a#̓\u0018\u0091Y\u007f8\u0018 ]_T\u000e%\u001d%A20F{\u001fIϡS̊\u0016+\u0013~\u007f6I\u0004~s\u0016\u0013\t,\u000f\b!֥`Ђ&vfаץ\f\u0019"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0014n\u001bX9\u000b\u000fdAmPXD)\u0016*S\r;F\u000b\u0013\u001d\u000e3yzO,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gxqp9\u0014_*]z1P9N3XavN\u0014\u007fZ\u0017\\5\u001adjA-}\u001a", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0014n\u001bX9\u000b\u000fdAmPXD)\u0016*S\r;H\u0012\f\u001f\u001d\u001dtoB]e", "Ad]@b9,S&\u0010~\\,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u001aN\u00048KJN\u0002", "Ad]@b9-V&~v]\u000fx\u0012.l\u007f5", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "Ad]@b9 O(~`^,\b\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u000eJ\u0006'-LN7\\_H", "6hbAb9R0)\u007f{^9", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NL", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "3uT;g:,c\u0016\rxk0y\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001b|4'$vOI\u0004q*[z$GY$", "5xa<f*H^\u0019lzm;\u0001\u00121s", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0014n\u001bX9\u000b\u000fdAmPXD)\u0016*S\r;F\u000b\u0013\u001d\u000e3yzOD\u0010V\t\u0019~C7>", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^VaB\u0015m9<v4XPL,29nF\u0013\u001fd\u0012Mt\u0017\u0013#$ wC>\u001f\u0015\u00020\u007fEpJ\t\u001a\u00183f\u007f@YYE\u0001\u0019uJ82Bb^\u0007QED,8c\u0012)\u001bfAA$\u0012\u0001\u001d%q\u001a\u001c\n\u0005a\u001b\u007f4uvg-\u0019zC$KCBDOw\u001f9x1\u001dG\u000bu\u0015{T}*\u00027\b3s4n\rSq!L]~^*fH.&4K\u0017IT-ThM\nT/a\u0018\u000e8\u001c/#m/`L\u0019\u0005Y&Y8+[\n6_\u0010BH9\u00131N\u0007Ld\b\u0014\u000fP\"wrI\r\u000bc\u0005!~\u001a\t]\u001b\u000bLc\u001c&,\u0012LW\u00122(f;M\u001c\u001824\u0015zfM\u0019o\u0012\u001elQ<[ho-E\u0007Z)23TK\u0005@Sl\u001e\u0014A\u0005\b~*IP@\u0004>\\\")GW4q^2TeZ&\u0019pGe\u001b60\u000f\\Dm(\u0006&\u001bG\fr\u0004\u001c]<G\u0006=J\u0013h,CjK\u0003Kd_\u001eu[\u00158n~#P%uIWx\u001c}\u000e6x\\}@3\u007fU\u001dq&/D\u0016\u0013\u0011o\u001b>%\u000eFN%\\\u0017wJVoAL", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":`bAK", "", ":`bAL", ":`bAM", "Ad]@b9\u001f`\u001d~\u0004]3\u0011q+m\u007f", "5dc X5L]&_\bb,\u0006\b6yh$\u0004@", "Ad]@b9-g$~", "", "5dc X5L]&m\u000fi,", "u(8", "Ad]@b9-g$~hm9\u0001\u00121", "5dc X5L]&m\u000fi,j\u0018<i\t*", "Bga2f/HZ\u0018", "1n]3\\.N`\u0019", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "6`]1_,,S\"\r\u0005k\n\u007f\u00058g\u007f", "3uT;g", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$'\u0001\u000eE\u0006z", "Ag^B_++S\u0017\t\b]\u001ax\u0011:l\u007f", "", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class GyroscopeCollector extends InteractionRelativeSensorEvent<GyroscopeEventModel> {
    private final GyroscopeCollectorSettings gyroscopeSettings;
    private double lastX;
    private double lastY;
    private double lastZ;
    private double threshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GyroscopeCollector(SensorService sensorService, Handler sensorThreadHandler, SensorGateKeeper sensorGateKeeper, DataQueue historyBuffer, Utils utils, EventsSubscriber eventsSubscriber, GyroscopeCollectorSettings gyroscopeSettings) {
        super(historyBuffer, sensorService, sensorGateKeeper, sensorThreadHandler, utils, eventsSubscriber, gyroscopeSettings);
        Intrinsics.checkNotNullParameter(sensorService, "sensorService");
        Intrinsics.checkNotNullParameter(sensorThreadHandler, "sensorThreadHandler");
        Intrinsics.checkNotNullParameter(sensorGateKeeper, "sensorGateKeeper");
        Intrinsics.checkNotNullParameter(historyBuffer, "historyBuffer");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(eventsSubscriber, "eventsSubscriber");
        Intrinsics.checkNotNullParameter(gyroscopeSettings, "gyroscopeSettings");
        this.gyroscopeSettings = gyroscopeSettings;
        this.threshold = gyroscopeSettings.getThreshold();
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.Collector
    public synchronized void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        super.configure(configurationRepository);
        this.threshold = this.gyroscopeSettings.getThreshold();
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.GyroscopeEvents;
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isGyroEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "gyroEvents";
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected String getSensorFriendlyName() {
        return "Gyroscope";
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected int getSensorType() {
        return 4;
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected String getSensorTypeString() {
        return "android.sensor.gyroscope";
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    public synchronized void handleSensorChange(SensorEvent event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        float[] fArr = event.values;
        float f2 = fArr[0];
        float f3 = fArr[1];
        double d2 = f2;
        double d3 = f3;
        double d4 = fArr[2];
        double dSqrt = Math.sqrt(Math.pow(d2 - this.lastX, 2.0d) + Math.pow(d3 - this.lastY, 2.0d) + Math.pow(d4 - this.lastZ, 2.0d));
        this.lastX = d2;
        this.lastY = d3;
        this.lastZ = d4;
        double dTruncate = getUtils().truncate(Math.toDegrees(d2), getSensorPrecision());
        double dTruncate2 = getUtils().truncate(Math.toDegrees(d3), getSensorPrecision());
        double dTruncate3 = getUtils().truncate(Math.toDegrees(d4), getSensorPrecision());
        if (dSqrt >= this.threshold) {
            addToBuffer(new GyroscopeEventModel(getContextIDCache().get(), getCurrentEventId(), getUtils().upTimeToEpoch(event.timestamp), dTruncate, dTruncate2, dTruncate3));
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    public boolean shouldRecordSample(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.shouldRecordSample(event) && event.values.length == 3;
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Gyroscope events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Gyroscope events collector is already started. Aborting the start operation.");
        }
        super.start();
        setStarted(true);
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        super.stop();
        setStarted(false);
    }
}
