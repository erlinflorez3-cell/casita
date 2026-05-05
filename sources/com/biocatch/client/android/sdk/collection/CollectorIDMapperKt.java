package com.biocatch.client.android.sdk.collection;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.client.android.sdk.contract.BCCollectorID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<`\u0007\"2\u0012\u007f\u0007tsA0RqP.XUB\u001dyڔL$\n#\"GIU2}P\n\u0016N\u007f\u007f|Lr\u0011S\u0011\u0016\u0016'iZL\u0006\u0003k\u0016'8RqO3{pk<x!D\n82P>\"\u0005/!ZR\u001e~\u0013I[\u000e\"0nwhU=W\u0013#*\fN\"\u0011\u001e\u000bh|9xpkDG#1jŒR2"}, d2 = {"5dc\u0016a;>`\"z\u0002<6\u0004\u0010/c\u000f2\t$\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "1n[9X*M]&^\u000em,\n\u0012+lc'", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{rrh@\u0007a;X\u0004\u000b&\"", ";`_\u0012k;>`\"z\u0002M6`\u0012>e\r1wG^!\u001eNo\fK\u00012C=|.", "", "1n[9X*M]&\rZq;|\u00168a\u0007\fzN", "Ag^B_+\u001c`\u0019z\n^\n\u0007\u00106e}7\u0006M", "", "", "3wc2e5:Zv\t\u0002e,z\u00189r\u000e\u0011wH\u0001%", "2hb.U3>Rv\t\u0002e,z\u00189r\u000e", "7c", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class CollectorIDMapperKt {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BCCollectorID.values().length];
            iArr[BCCollectorID.AppLifecycleEvents.ordinal()] = 1;
            iArr[BCCollectorID.AppName.ordinal()] = 2;
            iArr[BCCollectorID.AppVersion.ordinal()] = 3;
            iArr[BCCollectorID.DeviceApplications.ordinal()] = 4;
            iArr[BCCollectorID.TelephonyEvents.ordinal()] = 5;
            iArr[BCCollectorID.ClipboardEvents.ordinal()] = 6;
            iArr[BCCollectorID.AndroidID.ordinal()] = 7;
            iArr[BCCollectorID.IsDeviceRooted.ordinal()] = 8;
            iArr[BCCollectorID.DeviceFingerprint.ordinal()] = 9;
            iArr[BCCollectorID.DeviceHardware.ordinal()] = 10;
            iArr[BCCollectorID.MACAddress.ordinal()] = 11;
            iArr[BCCollectorID.DeviceManufacturer.ordinal()] = 12;
            iArr[BCCollectorID.DeviceModel.ordinal()] = 13;
            iArr[BCCollectorID.NetworkInterfaces.ordinal()] = 14;
            iArr[BCCollectorID.DeviceOrientation.ordinal()] = 15;
            iArr[BCCollectorID.DeviceProduct.ordinal()] = 16;
            iArr[BCCollectorID.UIElementEvents.ordinal()] = 17;
            iArr[BCCollectorID.UIElements.ordinal()] = 18;
            iArr[BCCollectorID.IsDeviceEmulator.ordinal()] = 19;
            iArr[BCCollectorID.FlingEvents.ordinal()] = 20;
            iArr[BCCollectorID.LongPressEvents.ordinal()] = 21;
            iArr[BCCollectorID.PanEvents.ordinal()] = 22;
            iArr[BCCollectorID.PinchEvents.ordinal()] = 23;
            iArr[BCCollectorID.TapEvents.ordinal()] = 24;
            iArr[BCCollectorID.BatteryStatus.ordinal()] = 25;
            iArr[BCCollectorID.ConnectedBluetoothDevices.ordinal()] = 26;
            iArr[BCCollectorID.DeviceCores.ordinal()] = 27;
            iArr[BCCollectorID.DeviceMemory.ordinal()] = 28;
            iArr[BCCollectorID.Display.ordinal()] = 29;
            iArr[BCCollectorID.LocalIP.ordinal()] = 30;
            iArr[BCCollectorID.KeyboardInputEvents.ordinal()] = 31;
            iArr[BCCollectorID.DeviceSource.ordinal()] = 32;
            iArr[BCCollectorID.AvailableKeyboards.ordinal()] = 33;
            iArr[BCCollectorID.ConfiguredLanguages.ordinal()] = 34;
            iArr[BCCollectorID.MainLanguage.ordinal()] = 35;
            iArr[BCCollectorID.Timezone.ordinal()] = 36;
            iArr[BCCollectorID.DeviceDisplayName.ordinal()] = 37;
            iArr[BCCollectorID.OS.ordinal()] = 38;
            iArr[BCCollectorID.AccelerometerEvents.ordinal()] = 39;
            iArr[BCCollectorID.GyroscopeEvents.ordinal()] = 40;
            iArr[BCCollectorID.LightSensorEvents.ordinal()] = 41;
            iArr[BCCollectorID.Location.ordinal()] = 42;
            iArr[BCCollectorID.RotationSensorEvents.ordinal()] = 43;
            iArr[BCCollectorID.ProximitySensorEvents.ordinal()] = 44;
            iArr[BCCollectorID.AvailableSensors.ordinal()] = 45;
            iArr[BCCollectorID.SignificantMotionSensorEvents.ordinal()] = 46;
            iArr[BCCollectorID.SimData.ordinal()] = 47;
            iArr[BCCollectorID.MultiSimData.ordinal()] = 48;
            iArr[BCCollectorID.GlobalTouchEvents.ordinal()] = 49;
            iArr[BCCollectorID.WifiInfo.ordinal()] = 50;
            iArr[BCCollectorID.ConfiguredWifiNetworks.ordinal()] = 51;
            iArr[BCCollectorID.MouseEvents.ordinal()] = 52;
            iArr[BCCollectorID.LatestAccessPoints.ordinal()] = 53;
            iArr[BCCollectorID.Imei.ordinal()] = 54;
            iArr[BCCollectorID.AccessibilityEvents.ordinal()] = 55;
            iArr[BCCollectorID.AvailableDisplays.ordinal()] = 56;
            iArr[BCCollectorID.Imsi.ordinal()] = 57;
            iArr[BCCollectorID.AudioInfo.ordinal()] = 58;
            iArr[BCCollectorID.VoipCallInfo.ordinal()] = 59;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final CollectorID getInternalCollectorId(BCCollectorID bCCollectorID) {
        switch (WhenMappings.$EnumSwitchMapping$0[bCCollectorID.ordinal()]) {
            case 1:
                return CollectorID.ApplicationEvents;
            case 2:
                return CollectorID.ApplicationName;
            case 3:
                return CollectorID.ApplicationVersion;
            case 4:
                return CollectorID.DeviceApplications;
            case 5:
                return CollectorID.CallInfo;
            case 6:
                return CollectorID.Clipboard;
            case 7:
                return CollectorID.AndroidID;
            case 8:
                return CollectorID.Jailbreak;
            case 9:
                return CollectorID.DeviceFingerprint;
            case 10:
                return CollectorID.DeviceHardware;
            case 11:
                return CollectorID.MACAddress;
            case 12:
                return CollectorID.DeviceManufacturer;
            case 13:
                return CollectorID.DeviceModel;
            case 14:
                return CollectorID.NetworkInterfaces;
            case 15:
                return CollectorID.DeviceOrientation;
            case 16:
                return CollectorID.DeviceProduct;
            case 17:
                return CollectorID.ElementEvents;
            case 18:
                return CollectorID.Elements;
            case 19:
                return CollectorID.Emulator;
            case 20:
                return CollectorID.FlingEvents;
            case 21:
                return CollectorID.LongPressEvents;
            case 22:
                return CollectorID.PanEvents;
            case 23:
                return CollectorID.PinchEvents;
            case 24:
                return CollectorID.TapEvents;
            case 25:
                return CollectorID.BatteryStatus;
            case 26:
                return CollectorID.Bluetooth;
            case 27:
                return CollectorID.DeviceCores;
            case 28:
                return CollectorID.DeviceMemory;
            case 29:
                return CollectorID.Display;
            case 30:
                return CollectorID.LocalIP;
            case 31:
                return CollectorID.KeyEvents;
            case 32:
                return CollectorID.DeviceSource;
            case 33:
                return CollectorID.Keyboards;
            case 34:
                return CollectorID.Language;
            case 35:
                return CollectorID.MainLanguage;
            case 36:
                return CollectorID.Timezone;
            case 37:
                return CollectorID.ClientPlatform;
            case 38:
                return CollectorID.OS;
            case 39:
                return CollectorID.AccelerometerEvents;
            case 40:
                return CollectorID.GyroscopeEvents;
            case 41:
                return CollectorID.LightEvents;
            case 42:
                return CollectorID.Location;
            case 43:
                return CollectorID.OrientationEvents;
            case 44:
                return CollectorID.Proximity;
            case 45:
                return CollectorID.SensorList;
            case 46:
                return CollectorID.SignificantMotion;
            case 47:
                return CollectorID.SimData;
            case 48:
                return CollectorID.SimExtData;
            case 49:
                return CollectorID.TouchEvents;
            case 50:
                return CollectorID.WifiInfo;
            case 51:
                return CollectorID.WifiHistory;
            case 52:
                return CollectorID.MouseEvents;
            case 53:
                return CollectorID.LatestAccessPoints;
            case 54:
                return CollectorID.Imei;
            case 55:
                return CollectorID.AccessibilityEvents;
            case 56:
                return CollectorID.Displays;
            case 57:
                return CollectorID.Imsi;
            case 58:
                return CollectorID.AudioInfo;
            case 59:
                return CollectorID.Voip;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List<CollectorID> mapExternalToInternalCollectorsIds(List<? extends BCCollectorID> collectorsExternalIds) {
        Intrinsics.checkNotNullParameter(collectorsExternalIds, "collectorsExternalIds");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectorsExternalIds.iterator();
        while (it.hasNext()) {
            arrayList.add(getInternalCollectorId((BCCollectorID) it.next()));
        }
        return arrayList;
    }

    public static final boolean shouldCreateCollector(String str, List<String> externalCollectorsNames, List<? extends BCCollectorID> disabledCollectors, BCCollectorID id) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(externalCollectorsNames, "externalCollectorsNames");
        Intrinsics.checkNotNullParameter(disabledCollectors, "disabledCollectors");
        Intrinsics.checkNotNullParameter(id, "id");
        return (externalCollectorsNames.contains(str) || disabledCollectors.contains(id)) ? false : true;
    }
}
