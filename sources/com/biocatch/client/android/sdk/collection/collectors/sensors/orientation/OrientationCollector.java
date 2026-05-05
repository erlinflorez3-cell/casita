package com.biocatch.client.android.sdk.collection.collectors.sensors.orientation;

import android.hardware.SensorEvent;
import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.DataQueue;
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
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvJ`\u000bK\u000f\u0014'\u0001̓4Ikxe\u0012\u00153JoU3UoC:htD\u0011(2(9\u0002\u0005\u000f,2H\u0016x\u0003CY\u0012\u001a0FtBR\u001bM\r܅\u001a\u0006T \t\u001ebhTȤ^Ǎ\u000e@?%\u0013ipNU^p8]\u0011TU?\r%c./N:M\u0015SW\u0013\u000b``W\u0003mwM\tv.?+w{g:f\t,\u0015YY\u001da\u00011t\u0005\u007fl\u001c+9\\{K~\u001c߭{z\n\u001c\u0005\u0012\u001c0?H\\XJj\u0016:Kt!\u0001\u0007dJdP.\u0013adBk\u0014{1GJ~Q\u0010f_b\b\b\u0013\u001d6#/\u007fwſ`\u05f8d\u0015#ƘHc?cX=va@.\u0014о\u0006Ͳf\u0006B\u00066[\u000eDL#<-=7\nPYuBɌJזkz\u001dbnkwk\u0019R0\t.7X$B/\u001b߶\u0007\u07fbTXp.\u0017i*qW\n\u001618\\&[wغ\u001cʽShqҔ\u001ei\u0018EGfexE\u008b\u001aĆ=^;̐\"u\u001e\u0003jvBZr5[֯h͞W\u0010r^.D@e;\"\u0006\u001f\\N:7h\u0012Hʞ6Ϝ5\u001dt\u0017N(,h\u0012\u000f\u0017\u0007rh>\u001a\u000b\u0006z҅k˨x\r\u0019Rb\u0019}\u0005IW:&x$C@\u007fToĢaɋl4\u0005ȽȽ\u0003$"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u001cg\u0012N4\u001c\u0001hE.w\u000e!,\f,R\u00117w\u0005\u0016\u001fk?qwBT\u001fQ\u0007j", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gxqp9\u0014_*]z1P9N3XavN\u0014\u007fZ\u0017\\5\u001adjA-}\u001a", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u001cg\u0012N4\u001c\u0001hE.w\u000e!,\f,R\u00117w\u0005\u0016\u001fmFjyQ>\u001aFy\u001cK", "=qX2a;:b\u001d\t\u0004L,\f\u00183n\u00026", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u001cg\u0012N4\u001c\u0001hE.w\u000e!,\f,R\u00117w\u0005\u0016\u001fk?qwBT\u001fQ\u0007\u0003uP8lO[mO", "Ad]@b9,S&\u0010~\\,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u001aN\u00048KJN\u0002", "Ad]@b9-V&~v]\u000fx\u0012.l\u007f5", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "Ad]@b9 O(~`^,\b\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u000eJ\u0006'-LN7\\_H", "6hbAb9R0)\u007f{^9", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NL", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "3uT;g:,c\u0016\rxk0y\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001b|4'$vOI\u0004q*[z$GY$", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016\\,e`|J\"[d\u001bR+\u0016\u0014UP(xM\u0001\t\u00150I\u000bJd\u0010\u0010 \u0017\u0013twIV\u000eV\u0004\"cA8wJba\b\u001d(Cl2.\tc'Z6I\"\u0017;\u0017\"lP7\u0019EO\u001aq_\u0004kf\u0011'y>m<wbMEmd@~0h9{\u0001 <eb+\u0002>\b2*\fK\u0001Tf%Hbw^6j\u000b\n\"?;\u001a?X9\\jH\u00162\u001ce\u0012\f^D/\u001c/cjL\u000f\u0010l`W>`l\u000b;QOLHu^%P\u0006I[w$\r\u0011-7SIL)^\u000e{lS\"E\u0011\u0003\u000ef%q\u0015\u0014GaXe.i5I\"\u0007k\u0002\b\u0005XP\u001ftGYkUzcax25~ZG+:R<taGy\u0019_\u0013|\u001az\t\u0004iRy\fy#/E#5fj-\u0007vQ%bcA\u001b,75\u0001\u001c>xf\u007f1\u001e\f\rnF\u0013gK8K#PMq0\u0012JI\u000fD$O\u00146K\u0011>^w_@bw5S}W{\r*\u0006\u001d +o\u0004F%1\u001b@f\u0015\u001b\u00189|@\u001b\ng\\\u0004]\u0010|FU\u001ez[<ZS\u0013", "/mV9X:", "", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "=qX2a;:b\u001d\t\u0004", "", "@nc.g0H\\\u0001z\nk0\u0010", "Ad]@b9\u001f`\u001d~\u0004]3\u0011q+m\u007f", "5dc X5L]&_\bb,\u0006\b6yh$\u0004@", "Ad]@b9-g$~", "", "5dc X5L]&m\u000fi,", "u(8", "Ad]@b9-g$~hm9\u0001\u00121", "5dc X5L]&m\u000fi,j\u0018<i\t*", "Bqd;V(MS\u0018k\u0005m(\f\r9np(yO\u000b$", "6`]1_,,S\"\r\u0005k\n\u007f\u00058g\u007f", "", "3uT;g", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$'\u0001\u000eE\u0006z", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class OrientationCollector extends InteractionRelativeSensorEvent<OrientationEventModel> {
    private double[] angles;
    private float[] orientation;
    private float[] rotationMatrix;
    private float[] truncatedRotationVector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationCollector(OrientationCollectorSettings orientationSettings, SensorService sensorService, Handler sensorThreadHandler, SensorGateKeeper sensorGateKeeper, DataQueue historyBuffer, Utils utils, EventsSubscriber eventsSubscriber) {
        super(historyBuffer, sensorService, sensorGateKeeper, sensorThreadHandler, utils, eventsSubscriber, orientationSettings);
        Intrinsics.checkNotNullParameter(orientationSettings, "orientationSettings");
        Intrinsics.checkNotNullParameter(sensorService, "sensorService");
        Intrinsics.checkNotNullParameter(sensorThreadHandler, "sensorThreadHandler");
        Intrinsics.checkNotNullParameter(sensorGateKeeper, "sensorGateKeeper");
        Intrinsics.checkNotNullParameter(historyBuffer, "historyBuffer");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(eventsSubscriber, "eventsSubscriber");
        this.rotationMatrix = new float[16];
        this.orientation = new float[3];
        this.angles = new double[3];
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.OrientationEvents;
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isOrientationEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "orientationEvents";
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected String getSensorFriendlyName() {
        return ExifInterface.TAG_ORIENTATION;
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected int getSensorType() {
        return 11;
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected String getSensorTypeString() {
        return "android.sensor.rotation_vector";
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    public synchronized void handleSensorChange(SensorEvent event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        float[] fArr = event.values;
        if (fArr.length > 4) {
            if (this.truncatedRotationVector == null) {
                this.truncatedRotationVector = new float[4];
            }
            float[] fArr2 = this.truncatedRotationVector;
            Intrinsics.checkNotNull(fArr2);
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.rotationMatrix = getSensorService().getRotationMatrixFromVector(this.rotationMatrix, this.truncatedRotationVector);
        } else {
            this.rotationMatrix = getSensorService().getRotationMatrixFromVector(this.rotationMatrix, event.values);
        }
        SensorService sensorService = getSensorService();
        float[] fArr3 = this.rotationMatrix;
        if (sensorService.remapCoordinateSystem(fArr3, 130, 1, fArr3)) {
            this.orientation = getSensorService().getOrientation(this.rotationMatrix, this.orientation);
            this.angles = getUtils().quaternionToAngle(this.orientation, this.angles);
            long jUpTimeToEpoch = getUtils().upTimeToEpoch(event.timestamp);
            addToBuffer(new OrientationEventModel(getContextIDCache().get(), getCurrentEventId(), jUpTimeToEpoch, getUtils().truncate(this.angles[0], getSensorPrecision()), getUtils().truncate(this.angles[1], getSensorPrecision()), getUtils().truncate(this.angles[2], getSensorPrecision())));
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent, com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Orientation events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Orientation events collector is already started. Aborting the start operation.");
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
