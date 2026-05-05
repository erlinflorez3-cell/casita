package com.facebook.react.common;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.firebase.sessions.settings.RemoteSettings;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4\u0012}\u0007njG5LeN/ZS8\u0016s{:%c$\bCC٥\"}0\u0012WNmgvJh\u000bK\u000f\f\u0017\u0001jBI]xc\u0013\u00172XoG3SuSʠ\u0011td\u0004X1Dx\u0011\u000b\u0006*.V\u0010\u000fzqL\u001c\u00186@~<j\r{\bܨ\u0016\u0006L$I,jvf6v|\u000e>=4\u001bipTm_x\u000b[\u001f^TU 'e,?X7c\u001fkSK\u001d`pW\u0003m\u0005m\tv=?+w\u000b\b:f\u0018,\u0015YRSq;4j\u001ei`::[Sqeh\u000eV\u0013A\u0010UJ\u0012*\u001e'vA]\u001et%&3#|\u001a@\u0019\bl`\u0018z\u0010I]%H?9X3f\u007ftk\u001d\\W\u0014\u0005;,k\u0005|BsT<se'b|i1\u007fF\u0014ʳZ̆]=uՎAn\u00101\u001c0u\u0006\u0006Ɉ\u001dѧ\u001b%?ك\n//s\u001aHrmMݖlĈWiZ̲\u0011.|\u001fO*7\u00161ըpʰoP\\А|\u001d['l\u0007,\u0012i\u0601hʟ@!-ī\u001f[vk\u0003M\f\r{ÇhƠ]nsލ(El?MQ\u0012\u00138ׯ\u0003݀C<jڳ)tP`$\\r'P@\u001fН\u001cȑ\u007fDVۼc>Mq44Z2o¥\u0017Ƞ\u0007\u001eJˆҺ\r\u0003"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW*y!;Y\\ Fm\u0014=WP\u0011", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$'\u0001\u000eE\u0006\f9g\r @m#\u0004", "AgP8X\u0013Ba(~\u0004^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW*y!;Y\\ Fm\u0014=WPyY7\u001a\u001bhH=\u0015r,Wv4\u001d", ";h]\u001bh4,V\u0015\u0005zl", "", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n~!\u001fOy\u0017\u0006d(1_}~7|\u0016,\\MH*\"!\u0011na \u000bq;N\u007f'T\"2oM", "/bR2_,KO(\u0003\u0005g\u001f", "", "/bR2_,KO(\u0003\u0005g ", "/bR2_,KO(\u0003\u0005g!", ":`bAF/:Y\u0019m~f,\u000b\u0018+m\u000b", "", ":`bAG0FS'\u000evf7", "<t\\ [(DS'", "Ad]@b9&O\"z|^9", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$/k\u00178x%B/", "/s;2T:M@\u0019\u000b\u000bb9|\b\u0010o\r&{", "", RemoteSettings.FORWARD_SLASH_STRING, ";`h/X\u000bBa$z\n\\/j\f+k\u007f", "", "1ta?X5MB\u001d\u0007zl;x\u0011:", "=m00V<KO\u0017\u0013Xa(\u0006\u000b/d", "Ad]@b9", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$\u001d", "7", "=mB2a:H`v\u0002vg.|\b", "Ad]@b9\u001ed\u0019\b\n", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$'\u0001\u000eE\u0006z", "@dR<e+,V\u0015\u0005z", "Bh\\2f;:[$", "@db2g", "AsP?g", ";`].Z,K", "As^=", "!gP8X\u0013Ba(~\u0004^9", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ShakeDetector implements SensorEventListener {
    private float accelerationX;
    private float accelerationY;
    private float accelerationZ;
    private long lastShakeTimestamp;
    private long lastTimestamp;
    private final int minNumShakes;
    private int numShakes;
    private SensorManager sensorManager;
    private final ShakeListener shakeListener;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLш|\u0004O\u00068é4ɷպ!Bߚ(\u0007\u0015i\u00026Re`.\u0001Tp3ԿzéŜ[(yEAtH|͆\rQɟkf"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW*y!;Y\\ Fm\u0014=WPyY7\u001a\u001bhH=\u0015r,Wv4\u001d", "", "=mB5T2>", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface ShakeListener {
        void onShake();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShakeDetector(ShakeListener shakeListener) {
        this(shakeListener, 0, 2, null);
        Intrinsics.checkNotNullParameter(shakeListener, "shakeListener");
    }

    public ShakeDetector(ShakeListener shakeListener, int i2) {
        Intrinsics.checkNotNullParameter(shakeListener, "shakeListener");
        this.shakeListener = shakeListener;
        this.minNumShakes = i2;
    }

    public /* synthetic */ ShakeDetector(ShakeListener shakeListener, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(shakeListener, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? 1 : i2);
    }

    private final boolean atLeastRequiredForce(float f2) {
        return Math.abs(f2) > 13.042845f;
    }

    private final void maybeDispatchShake(long j2) {
        if (this.numShakes >= this.minNumShakes * 8) {
            reset();
            this.shakeListener.onShake();
        }
        if (j2 - this.lastShakeTimestamp > ShakeDetectorKt.SHAKING_WINDOW_NS) {
            reset();
        }
    }

    private final void recordShake(long j2) {
        this.lastShakeTimestamp = j2;
        this.numShakes++;
    }

    private final void reset() {
        this.numShakes = 0;
        this.accelerationX = 0.0f;
        this.accelerationY = 0.0f;
        this.accelerationZ = 0.0f;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        Intrinsics.checkNotNullParameter(sensorEvent, "sensorEvent");
        if (sensorEvent.timestamp - this.lastTimestamp < ShakeDetectorKt.MIN_TIME_BETWEEN_SAMPLES_NS) {
            return;
        }
        float f2 = sensorEvent.values[0];
        float f3 = sensorEvent.values[1];
        float f4 = sensorEvent.values[2] - 9.80665f;
        this.lastTimestamp = sensorEvent.timestamp;
        if (atLeastRequiredForce(f2) && this.accelerationX * f2 <= 0.0f) {
            recordShake(sensorEvent.timestamp);
            this.accelerationX = f2;
        } else if (atLeastRequiredForce(f3) && this.accelerationY * f3 <= 0.0f) {
            recordShake(sensorEvent.timestamp);
            this.accelerationY = f3;
        } else if (atLeastRequiredForce(f4) && this.accelerationZ * f4 <= 0.0f) {
            recordShake(sensorEvent.timestamp);
            this.accelerationZ = f4;
        }
        maybeDispatchShake(sensorEvent.timestamp);
    }

    public final void start(SensorManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Sensor defaultSensor = manager.getDefaultSensor(1);
        if (defaultSensor == null) {
            return;
        }
        this.sensorManager = manager;
        this.lastTimestamp = -1L;
        manager.registerListener(this, defaultSensor, 2);
        this.lastShakeTimestamp = 0L;
        reset();
    }

    public final void stop() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.sensorManager = null;
    }
}
