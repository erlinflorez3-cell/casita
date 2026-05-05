package com.biocatch.client.android.sdk.collection.collectors.sensors.significantMotion;

import android.hardware.Sensor;
import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.collection.SensorService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.core.permissions.PermissionService;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a%yCQU\"}(\nWNusvJ`\fK\u000f\u0014\u001f\u0001j2I]xk\u0018\u00172HpG3coEʠhtL\u0005(݅*8\b\u0005\t\u001a0I\u0016͌\u0011ŏ{\u0012\"2PphR;L=\u00194FY0\u0005,]\u007fNdJ|aH2;\u0003\u0018F^+m5\u0015M;Lù+\r\u0005hf3NTM\u0017;R1%\u0019[\b\tM\u0011U\u0005\u0017Gm?\u0012yeWp\u007fB5qc]o\u0001.t\u0005\u007fiB{\u0002թeׂT\u0012@y\u0001\u0006\u001bGT \u00143`.['\u001d\\dޮvɤWDh\u0004dP\u000e\n2H%5\u00183YJQ;(ļ=ϭR;\u0014\u0007\u001301\u0014?3ih&`C0\u000bL(ŏS͘ALf\f_Q{\u001aAn\u0010/\u001c0u\u0006\u0006Ɉ\u0013ѧ\u001b%?ك\n//l\u001aHriMݖbĈWiZ̲\u00114|-O*7$\u0011\u0005;ʐmÏX\\D\u0013S5b!N\u0016!;tyR S,%лtȬnMe܃u;t:qn\u001a\u0012.ޭ`ۋ9Qk߄щV\u001a"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK] ^\u0010W/\u000e\tW=-},A.\f6RK)l\u0003\u0015\u001a\u000f9hlKewQ\t\u0019\u007fJ\u0007rM`_wVKR8", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK] ^\u0010W/\u000e\tW=-},A.\f6RK)l\u0003\u0015\u001a\u000f9hlKewQ\t\u0019\u007fJ\tyFbnaQ@Ei\u007f", "Ad]@b9,S&\u0010~\\,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u001aN\u00048KJN\u0002", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", ">da:\\:LW#\bh^9\u000e\r-e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0017N\u0004/KZ\\0f[`=!#^\fN\u0001", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^VaB\u0015m9<v4XPL,29pG\u001c[W\u0012X)\t\u0014WDmjM6,\u00120HK9r\t\u0014 \u0017Civ\fT\u001aTy^eP-oT/FwQI\u000f_.n\n[,Z=\u0004\"\u001bu\u0019$w\u001a*\u0013z`\u001bvQCufMbxB1>7fFRwYJ\u0003+)T\nA|2e|/\u0003;\b>3$d\u0012\\k\u0016>4<\u0006", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7rBBc7H`(~y", "", "u(I", "Ad]@b9-g$~", "", "5dc X5L]&m\u000fi,", "u(8", "BqX4Z,K3*~\u0004m\u0013\u0001\u0017>e\t(\t", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0017\tD\u0003\u0019\u0017TO\u001f<\u007f4\u001c]\f/7v\u0016;#", "5dc X5L]&", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0016{I\u000f!$\u001d", "AsP?g", "", "As^=", "\"qX4Z,K:\u001d\r\n^5|\u0016", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SignificantMotionCollector extends ContinuousCollector<SignificantMotionEventModel> {
    private final PermissionService permissionService;
    private final SensorService sensorService;
    private TriggerEventListener triggerEventListener;
    private final Utils utils;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ;FǏ\u0016H\\Q\u0014-Ƃo{B$$2\u007fDSUH\u007fR\r]Q\u007fg\u001dN!\u001få\u0013\u000b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK] ^\u0010W/\u000e\tW=-},A.\f6RK)l\u0003\u0015\u001a\u000f9hlKewQ\t\u0019\u007fJ\u0007rM`_wVKR!\u0019q\u0010a\u001f\\G!(\"\u0001\u0019$h]\u0004", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0017\tD\u0003\u0019\u0017TO\u001f<\u007f4\u001c]\f/7v\u0016;#", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016\\,e`|J\"[h\u0012P4\u0011\u0006]? wS\u001f)\u00170S\u000b\u0005V\u0005\u000e\u001f\u00126nn>_\u001f/\u0004$yK2FP`fyEPOo\u007f(|", "=mC?\\.@S&", "", "3uT;g", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI\u0017\tD\u0003\u0019\u0017TO\u001f<\u007f4\u000b", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class TriggerListener extends TriggerEventListener {
        public TriggerListener() {
        }

        @Override // android.hardware.TriggerEventListener
        public void onTrigger(TriggerEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Sensor sensor = event.sensor;
            if (sensor == null) {
                sensor = SignificantMotionCollector.this.getSensor();
            }
            if (sensor != null) {
                SignificantMotionCollector.this.sensorService.requestTriggerSensor(this, sensor);
            } else {
                Log.Companion.getLogger().error("Unable to resubscribe for significant motion events. Sensor is unavailable.");
            }
            float[] fArr = event.values;
            if (fArr != null) {
                Intrinsics.checkNotNullExpressionValue(fArr, "event.values");
                if (fArr.length != 0) {
                    try {
                        if (event.values[0] == 1.0f) {
                            long jUpTimeToEpoch = SignificantMotionCollector.this.utils.upTimeToEpoch(event.timestamp);
                            SignificantMotionCollector.this.addToQueue(new SignificantMotionEventModel(SignificantMotionCollector.this.getContextIDCache().get(), SignificantMotionCollector.this.getCurrentEventId(), jUpTimeToEpoch));
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        Log.Companion.getLogger().error("Failed collecting significant motion event.", e2);
                        return;
                    }
                }
            }
            Log.Companion.getLogger().warning("Received an invalid significant motion event with no values. Discarding event.");
        }
    }

    public SignificantMotionCollector(SensorService sensorService, Utils utils, PermissionService permissionService) {
        Intrinsics.checkNotNullParameter(sensorService, "sensorService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(permissionService, "permissionService");
        this.sensorService = sensorService;
        this.utils = utils;
        this.permissionService = permissionService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sensor getSensor() {
        return this.sensorService.getDefaultSensor(getSensorType());
    }

    private final int getSensorType() {
        return 17;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.SignificantMotion;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isSignificantMotionEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "significantMotionEvents";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public boolean isSupported() {
        return getSensor() != null;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Significant motion events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Significant motion events collector is already started. Aborting the start operation.");
        }
        if (this.utils.isVersionGreaterOrEqualTo(31) && !this.permissionService.hasPermission("android.permission.HIGH_SAMPLING_RATE_SENSORS")) {
            Log.Companion.getLogger().info("Application has no permission to register to high sampling rate sensors. Significant motion events will not be collected.");
            return;
        }
        TriggerListener triggerListener = new TriggerListener();
        Sensor sensor = getSensor();
        if (sensor == null) {
            Log.Companion.getLogger().error("Significant Motion sensor is unavailable. Sensor will not be collected.");
            throw new InvalidOperationException("Significant Motion sensor is unavailable. Sensor will not be collected.");
        }
        this.sensorService.requestTriggerSensor(triggerListener, sensor);
        this.triggerEventListener = triggerListener;
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        TriggerEventListener triggerEventListener = this.triggerEventListener;
        if (triggerEventListener == null) {
            return;
        }
        this.sensorService.cancelTriggerSensor(triggerEventListener);
        setStarted(false);
    }
}
