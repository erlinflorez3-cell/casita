package com.biocatch.client.android.sdk.collection;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.TriggerEventListener;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":0\u007f\u0007tvA0JfP.`S2şs{J$cҕyCQU\"Ԃ*\t]To˧vJh\u001dK\u000f\f\u001b\u0001j:R]xs\u0012\u00172HpG3coE9f{<ӌ6݅@^*\u0005/\u0019bG67\u0006SO\u001a\u0012H@\u001f;ň\u0011M\u0013\u001cZ\u0012L(\u0019\u001e\u000bp~:Vvu:].KwPZ?aF{{\u001avX5\u001b\u000faL:\tMC%=S1\u0018\u0003aM\u0015WsS\u0004\u00178W/W\u0007o6\u0007\u0011\\+9c%]!7\r\t_r$'Y`\u0014Q^#@y\u0011z;ML!\u0014=`0C\u0019\u0015\u0017>7\u0003\u0001k@~\u0011ެF\u007f\tx~?3\u0018K+g4\u0017UoE1Ne\u00165\u0013,>\u0019p7Z\u0003\u001b\u0011\u0019)p\u0010Q_`pCVk\"[Sl2\u000f+*8#HG.H,\u0017<7=9q8Q2\u001c\u0006Ve\u007fv3o\u0019Wwt`@P}F=8,$\\Zc3|\u0019hfP)MJ]7\u0002\u0016\u001d8\\&GQ)\u001eigh\u0018w\u0016i\u0018JGfeb\u001fo\u001caQ^aO\"o\u001eajvB@\u0013ϸ\u0007ֽjB[ێ+q6%JNz\u0012\b{rS:\u0017h\u0004ۇ 8D3\u001fb#OҺ\"i"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u001aN\u00048KJN\u0002", "", ";`].Z,K", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$/k\u00178x%B/", "uKP;W9HW\u0018H}Z9{\u001b+r\u007fqi@\n%!TW\nEr'5fSc(", "At_=b9MS\u0018lzg:\u0007\u0016=", "", "", "5dc h7I]&\u000ez]\u001a|\u0012=o\r6", "u(;7T=:\u001d)\u000e~euc\r=tU", "1`]0X3-`\u001d\u0001|^9j\t8s\n5", "", ":hbAX5>`", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0017\tD\u0003\u0019\u0017TO\u001f<\u007f4\u001c]\f/7v\u0016;#", "5dc\u0011X-:c \u000eh^5\u000b\u0013<", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$\u001d", "Bx_2", "", "5dc\u001ce0>\\(z\nb6\u0006", "", "@nc.g0H\\", "=qX2a;:b\u001d\t\u0004", "5dc\u001fb;:b\u001d\t\u0004F(\f\u00163x`5\u0006Hq\u0017\u0015Vy\u001b", "DdRAb9", "5dc X5L]&f~g\u000b|\u0010+y", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV", "@dV6f;>`\u007f\u0003\tm,\u0006\t<", "", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$'\u0001\u000eE\u0006\f9g\r @m#\u0004", "Ad]@b9", "A`\\=_0GU\u0004~\bb6{", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "@d\\.c\nH]&}~g(\f\t\u001dy\u000e7{H", "7m_Bg", "F", "G", "=tc=h;", "@d`BX:MB&\u0003|`,\nv/n\u000e2\t", "Cma2Z0Lb\u0019\fab:\f\t8e\r", "\u0011n\\=T5B]\"", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SensorService {
    public static final int AXIS_MINUS_Y = 130;
    public static final int AXIS_X = 1;
    public static final Companion Companion = new Companion(null);
    public static final int SENSOR_DELAY_FASTEST = 0;
    private final SensorManager manager;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u001aN\u00048KJNj:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\u000fW8 R\u0014\"<\tltR", "", "\u000fW8 R\u001f", "!D= B\u001982xeVR&]d\u001dT_\u0016j", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SensorService(SensorManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.manager = manager;
    }

    public final void cancelTriggerSensor(TriggerEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.manager.cancelTriggerSensor(listener, null);
    }

    public final Sensor getDefaultSensor(int i2) {
        return this.manager.getDefaultSensor(i2);
    }

    public final float[] getOrientation(float[] fArr, float[] orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        SensorManager.getOrientation(fArr, orientation);
        return orientation;
    }

    public final float[] getRotationMatrixFromVector(float[] rotation, float[] fArr) {
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        SensorManager.getRotationMatrixFromVector(rotation, fArr);
        return rotation;
    }

    public final Integer getSensorMinDelay(int i2) {
        Sensor defaultSensor = this.manager.getDefaultSensor(i2);
        if (defaultSensor != null) {
            return Integer.valueOf(defaultSensor.getMinDelay());
        }
        return null;
    }

    public final List<String> getSupportedSensors() {
        List<Sensor> sensorList = this.manager.getSensorList(-1);
        ArrayList arrayList = new ArrayList();
        Iterator<Sensor> it = sensorList.iterator();
        while (it.hasNext()) {
            String name = it.next().getName();
            if (name == null || name.length() == 0) {
                name = "Unknown";
            }
            arrayList.add(name);
        }
        return arrayList;
    }

    public final boolean registerListener(SensorEventListener listener, Sensor sensor, int i2, Handler handler) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.manager.registerListener(listener, sensor, i2, handler);
    }

    public final boolean remapCoordinateSystem(float[] fArr, int i2, int i3, float[] fArr2) {
        return SensorManager.remapCoordinateSystem(fArr, i2, i3, fArr2);
    }

    public final void requestTriggerSensor(TriggerEventListener listener, Sensor sensor) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(sensor, "sensor");
        this.manager.requestTriggerSensor(listener, sensor);
    }

    public final void unregisterListener(SensorEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.manager.unregisterListener(listener);
    }
}
