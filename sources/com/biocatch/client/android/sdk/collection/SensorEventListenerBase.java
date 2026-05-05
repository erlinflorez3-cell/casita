package com.biocatch.client.android.sdk.collection;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import androidx.compose.animation.core.AnimationKt;
import androidx.exifinterface.media.ExifInterface;
import com.biocatch.android.commonsdk.backend.CollectionItem;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.collection.collectors.sensors.SensorCollectorSettings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$wCCU(\u0004*ޛWN}gvJ`\fK\u000f\u0014\u001f\u0001j2I]xk\u0019\u00172HtG3[{E9f\u0005>\u0005.2*\u0600\u0002\u0005\u0017\u001a2H\u0016v\u0003CY\r\u001a0FpBR#M\r\u001a\u0018\u0006F \u0017\u001edgT;N\u000bsŽ_)\u0013kRNU_^{}\rtUg0\u0007e,-X7c\u00185W\u0011\u000bj[m\bOuK\u000b\u0001'U2Ywe>p\u007fB\u001eۣS\rk|nj\u0013\u0001x\fU[\u007fgY\u0002&(&-B!\u0005\u0012\u001c9?H\\]Jj\u0016BKt!\t\u0007PJlP6\u0013adGU\u0004AbQ\u001b\u0015\n(]adE5\u001d\rLS1r/\u0016l\u000e\u000fPKX\u0006\u000eIQnI\u000fbRgK+\u001cp\u00112Z\b>~\u0018/*It+m=iw;!\u001a2\u000fD0\u0005\u0013 \u0001S\u0018dxD0&.7XARl\rj\u0013,hT\u0007\\WadZ\u0015? \u0013N\r>Pq1\u001eYgh\u0018v$έLɻ3f?ժ?{\u001cdQ^aC(Ӗ\u0012уVz,ABq\u0013h7Qa\u001dr\\V4h\rн\u0014{\u0014FT\u001d!E\u0010}*HD1GqkȀ\u000fٿFA\u0005ȁ0fv&\u0017Ta0Yǰ0ڲ\r\u0001XʔA\bu\u0010a,+uxΏMپ9%.Ş:j:\u00151 \u001fu\u0006aug\u0018Xz\u001c\u000eU*'l֠;ֺ3=\u001bÁO;@\u001eEGbq\u0014n$ɡ)ϸ\u0001}'=nLu';\t:\u0001\u0003J}`mǶ\u0003݈v/\u0010ۭ\u0018{gg\ti\u0004V\u0011~LmC\u0015g>f8+\buǌ'˽s(\u0005ކEE-B$\u001ed;#eui\u001e3Pʯ\u0011֑xe\fϺ4&}\ni]`G\u000fգ[˽B&<n\tjV\rH\u001aP2L\u000fIGo\u0002Gޮ:Ԫ\u000f3\u0016h\rV\u001b\u0010'sH\u001b\b}b76͍\u007fʸ\u0002 fƹ=\u0013S~u\u001a\u000eMb8X=Ё\u000f>"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\f_v0V3R:kR{=!nV\u001cN\u0001", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$'\u0001\u000eE\u0006\f9g\r @m#\u0004", "Ad]@b9,S&\u0010~\\,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u001aN\u00048KJN\u0002", "Ad]@b9-V&~v]\u000fx\u0012.l\u007f5", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "Ad]@b9\u001c] \u0006z\\;\u0007\u0016\u001de\u000f7\u007fI\u0003%", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u007fZ\u0017\\5\u001abcH+nBF)\u0015\u001aI\u0011Jl\n\u000e$c", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^VaB\u0015m9<v4XPL,29nF\u0013\u001fd\u0012Mt\u0017\u0013#$ wC>\u001f\u0015\u00020\u007fEpJ\t\u001a\u00183f\u007f@YYE\u0001\u0019uJ82Bb^\u0007QED,8c\u0012)\u001bfAA$\u0012\u0001\u001d%q\u001a,\u0014\u0003Z\u0011pa\u0004tu\u0011'zA2Hzi\u00103o^J~4|U\u0003~\u00120g~8b-\u0013C.?f\u0013!N\u0016HfB\u00120f?#54?\\;Tb\u0003vB\r2\u001dk\u0010\u0016l>?\u0018k/aR\u001c\u0007'\u0007j9hmVzC", "\u0011N= 8\n.B|oZX\fiu\u0019Rm\"j#mv\u0005*Yt\u001b", "", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "7rB2a:H`\u0007\u000f\u0006i6\n\u0018/d", "", "u(I", ":`bAF(F^ ~", "", "<t\\/X9(Tv\t\u0004l,z\u0019>i\u0011(fM\u000b\u0015\u0017U}\u0012Ex\u0005Bf\b-E", "A`\\=_,)S&\u0003\u0005]", "5dc T4IZ\u0019izk0\u0007\b", "u(9", "Adc T4IZ\u0019izk0\u0007\b", "uI\u0018#", "Ad]@b9\u001f`\u001d~\u0004]3\u0011q+m\u007f", "", "5dc X5L]&_\bb,\u0006\b6yh$\u0004@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ad]@b9+S\u001b\u0003\tm9x\u00183o\t\u0007{G|+", "5dc X5L]&kz`0\u000b\u0018<a\u000f,\u0006I_\u0017\u001eC\u0004", "u(8", "Adc X5L]&kz`0\u000b\u0018<a\u000f,\u0006I_\u0017\u001eC\u0004", "uH\u0018#", "5dc X5L]&lzk=\u0001\u0007/", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2O9\u0010q6[d'T]R*\\(", "Ad]@b9-g$~", "5dc X5L]&m\u000fi,", "Ad]@b9-g$~hm9\u0001\u00121", "5dc X5L]&m\u000fi,j\u0018<i\t*", "5dc\"g0Ea", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w#.\u00173Jo;,j", "Adc\"g0Ea", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBsXY", "1n]3\\.N`\u0019", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "6`]1_,)`#|zl:\u0001\u00121E\r5\u0006M", ExifInterface.GPS_MEASUREMENT_3D, "", "6`]1_,,S\"\r\u0005k\n\u007f\u00058g\u007f", "3uT;g", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$'\u0001\u000eE\u0006z", "=m00V<KO\u0017\u0013Xa(\u0006\u000b/d", "Ad]@b9", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$\u001d", "/bRBe(<g", "=mB2a:H`v\u0002vg.|\b", "@db2g\u0017K]\u0017~\tl0\u0006\u000b\u000fr\r2\t\u001e\u000b' Vo\u001b", "Ag^B_++S\u0017\t\b]\u001ax\u0011:l\u007f", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class SensorEventListenerBase extends ContinuousCollector<CollectionItem> implements SensorEventListener {
    private final int CONSECUTIVE_ERRORS_THRESHOLD;
    private long lastSample;
    private int numberOfConsecutiveProcessingErrors;
    private long samplePeriod;
    private final SensorCollectorSettings sensorCollectorSettings;
    private int sensorRegistrationDelay;
    private final SensorService sensorService;
    private final Handler sensorThreadHandler;
    private Utils utils;

    public SensorEventListenerBase(SensorService sensorService, Handler sensorThreadHandler, SensorCollectorSettings sensorCollectorSettings, Utils utils) {
        Intrinsics.checkNotNullParameter(sensorService, "sensorService");
        Intrinsics.checkNotNullParameter(sensorThreadHandler, "sensorThreadHandler");
        Intrinsics.checkNotNullParameter(sensorCollectorSettings, "sensorCollectorSettings");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.sensorService = sensorService;
        this.sensorThreadHandler = sensorThreadHandler;
        this.sensorCollectorSettings = sensorCollectorSettings;
        this.utils = utils;
        this.CONSECUTIVE_ERRORS_THRESHOLD = 10;
        this.samplePeriod = sensorCollectorSettings.getSamplePeriod() * ((long) 1000000);
        Integer sensorMinDelay = sensorService.getSensorMinDelay(getSensorType());
        this.sensorRegistrationDelay = sensorMinDelay != null ? sensorMinDelay.intValue() : sensorCollectorSettings.getSensorRegistrationDelay();
        this.numberOfConsecutiveProcessingErrors = 0;
    }

    private final void handleProcessingError(Throwable th) {
        this.numberOfConsecutiveProcessingErrors++;
        Log.Companion companion = Log.Companion;
        Log logger = companion.getLogger();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("An error has occurred while processing %s sensor data. This is the %s consecutive error.", Arrays.copyOf(new Object[]{getFriendlyName(), Integer.valueOf(this.numberOfConsecutiveProcessingErrors)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        logger.error(str, th);
        if (this.numberOfConsecutiveProcessingErrors >= this.CONSECUTIVE_ERRORS_THRESHOLD) {
            Log logger2 = companion.getLogger();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("An error has occurred for the %s consecutive time while processing %s sensor data. Disabling the sensor processing.", Arrays.copyOf(new Object[]{Integer.valueOf(this.CONSECUTIVE_ERRORS_THRESHOLD), getFriendlyName()}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            logger2.error(str2, th);
            stop();
        }
    }

    private final void resetProcessingErrorCounter() {
        this.numberOfConsecutiveProcessingErrors = 0;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public synchronized void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        super.configure(configurationRepository);
        this.sensorRegistrationDelay = this.sensorCollectorSettings.getSensorRegistrationDelay();
        this.samplePeriod = this.sensorCollectorSettings.getSamplePeriod() * AnimationKt.MillisToNanos;
        Sensor defaultSensor = this.sensorService.getDefaultSensor(getSensorType());
        if (defaultSensor != null) {
            this.sensorService.unregisterListener(this);
            this.sensorService.registerListener(this, defaultSensor, this.sensorRegistrationDelay, this.sensorThreadHandler);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public abstract ConfigKeys getConfigKey();

    protected final long getSamplePeriod() {
        return this.samplePeriod;
    }

    protected abstract String getSensorFriendlyName();

    protected final int getSensorRegistrationDelay() {
        return this.sensorRegistrationDelay;
    }

    protected final SensorService getSensorService() {
        return this.sensorService;
    }

    protected abstract int getSensorType();

    protected abstract String getSensorTypeString();

    protected final Utils getUtils() {
        return this.utils;
    }

    protected abstract void handleSensorChange(SensorEvent sensorEvent);

    public final boolean isSensorSupported() {
        return this.sensorService.getDefaultSensor(getSensorType()) != null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public synchronized void onSensorChanged(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            if (shouldRecordSample(event)) {
                this.lastSample = event.timestamp;
                handleSensorChange(event);
                resetProcessingErrorCounter();
            }
        } catch (Throwable th) {
            handleProcessingError(th);
        }
    }

    protected final void setSamplePeriod(long j2) {
        this.samplePeriod = j2;
    }

    protected final void setSensorRegistrationDelay(int i2) {
        this.sensorRegistrationDelay = i2;
    }

    protected final void setUtils(Utils utils) {
        Intrinsics.checkNotNullParameter(utils, "<set-?>");
        this.utils = utils;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected synchronized boolean shouldRecordSample(android.hardware.SensorEvent r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch: java.lang.Throwable -> L2a
            float[] r0 = r6.values     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L21
            android.hardware.Sensor r0 = r6.sensor     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L21
            int r1 = r0.getType()     // Catch: java.lang.Throwable -> L2a
            int r0 = r5.getSensorType()     // Catch: java.lang.Throwable -> L2a
            if (r1 != r0) goto L21
            long r3 = r6.timestamp     // Catch: java.lang.Throwable -> L2a
            long r0 = r5.lastSample     // Catch: java.lang.Throwable -> L2a
            long r3 = r3 - r0
            long r1 = r5.samplePeriod     // Catch: java.lang.Throwable -> L2a
            goto L23
        L21:
            r0 = 0
            goto L28
        L23:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L21
            r0 = 1
        L28:
            monitor-exit(r5)
            return r0
        L2a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.biocatch.client.android.sdk.collection.SensorEventListenerBase.shouldRecordSample(android.hardware.SensorEvent):boolean");
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        Sensor defaultSensor = this.sensorService.getDefaultSensor(getSensorType());
        if (defaultSensor != null) {
            this.sensorService.registerListener(this, defaultSensor, this.sensorRegistrationDelay, this.sensorThreadHandler);
            setStarted(true);
            return;
        }
        Log logger = Log.Companion.getLogger();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s sensor is not available on the device. Sensor type name: %s. Sensor type %s", Arrays.copyOf(new Object[]{getSensorFriendlyName(), getSensorTypeString(), Integer.valueOf(getSensorType())}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        logger.info(str);
        stop();
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        this.sensorService.unregisterListener(this);
        setStarted(false);
    }
}
