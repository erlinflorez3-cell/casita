package com.biocatch.client.android.sdk.collection.collectors.hardware;

import android.bluetooth.BluetoothClass;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.device.bluetooth.BluetoothDeviceWrapper;
import com.biocatch.client.android.sdk.core.device.bluetooth.BluetoothService;
import com.biocatch.client.android.sdk.core.hash.HashService;
import com.biocatch.client.android.sdk.events.PermissionsGrantedEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\bCCU ~*\teNogtKb\u000bQ\u001b\u000e\u0016~l4Ic~e܈\u00172PoG\u074cUoS9ht<\u0005&݅8\u0600*\u000b\u0011\u001c:H>v)B\f/\"4NqRR;O\u0015\u001e \tV /\"lk\\;`l\f@?'\u0011pZNUg݁\u0001M\u001bO\u001d3\u001b\ry\u001eYSg9#<k\u00035j$M\u0011X\n=3\u0003W+9d\fWdtF\u0019]3]*ut<[3Q' w7]fcP<,N߁}Ɂ@\u0004\u0016ͺwZ<72f6\u0019iIIԶBг\u0006bZ\u0002\u0001mD$u\u0012A9Q\u001b\u0015`\u0018\u0010oע9߉\t\u00116%\u0007~/l%\u001an\u001c3T&Y\b҈BףLN\u0012ԯ\u000ey\u0012qz\u0002X\u0006\u0007ϝ\u0002\u009e\u007f\u00116ϏuIiK;!\u001a\u0015~\u0019>Џ\u0007¾lW\u0002TNT0\u0004fC8\u000e$Zrj[ߛRԜ\\,\u0019۳ɥX%"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[7\u0015^+\u001c\u000fcP'LN>&\b*X\fH>", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p1U-,dN{<q\u001ca\u0015N)\u001c\u000ff\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[7\u0015^+\u001c\u000fcP'VN6\u001f\u000f\u0002", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "0kd2g6Hb\u001clzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^ehI\u0007r6X\u0006*\u0011)U<\\a|G#\u0015H\u000e[<\u0011\u0003Y\u0017", "6`b5F,Kd\u001d|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wP?In}\u0001\u0011vd'\u0007p=Rt'\u001d", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~hwFV\u0019VC\u0011~@6rJX)\bFG\u000f`4q\f)\u001c\\K>\"\u0014;\u0016\"xP=\u0014\u0006b\u0014</\u0001wgV#\u0005G',mhWImU\u0012[%)SEt\u0016<Vp:r0M21:d\u000eZ1\u0014G]\u0006\u001f0[\u000b5%<\u0006\u0011IXc?o:\u001ckhD\u0004\u001ce#1&viaHdm[!c~^c\u000b5N\u0015<L9\u00110E\fL_x^\u0007\u0011,uoRQ\u001aZJ\u0018zM#c\u0013\u0013\u0010b' 8\u001f\u00077\u0019q+c9] \u0005w<\u0016\u0005FC zV\u0014|U\u007fo-3\u0015", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u000f_<>b#\t\na\n\u0004\u0005=sh$\u0004@", "2de6V,\u001cZ\u0015\r\t", "", "6`]1_,", "", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r&kA&\u0019vo=\u0011l:0\u0004#P[N+<crF#g", "@t]\u0010b3ES\u0017\u000e~h5", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BluetoothCollector extends OnDemandCollector<BluetoothModel> {
    private final BluetoothService bluetoothService;
    private final ConfigurationRepository configurationRepository;
    private final EventBusService eventBusService;
    private final HashService hashService;

    public BluetoothCollector(EventBusService eventBusService, BluetoothService bluetoothService, HashService hashService, ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(bluetoothService, "bluetoothService");
        Intrinsics.checkNotNullParameter(hashService, "hashService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.eventBusService = eventBusService;
        this.bluetoothService = bluetoothService;
        this.hashService = hashService;
        this.configurationRepository = configurationRepository;
        eventBusService.subscribe(this);
    }

    public final String getBluetoothClassName(int i2) {
        Field[] fields = BluetoothClass.Device.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "Device::class.java.fields");
        for (Field field : fields) {
            try {
                int modifiers = field.getModifiers();
                if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && i2 == field.getInt(null)) {
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "field.name");
                    return name;
                }
            } catch (IllegalAccessException e2) {
                Log.Companion.getLogger().error("error retrieving bluetooth device field", e2);
            }
        }
        return "";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.Bluetooth;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isBluetooth;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "bluetooth";
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle(PermissionsGrantedEvent event) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getPermissionsGranted().contains("android.permission.BLUETOOTH_CONNECT")) {
            this.bluetoothService.createBluetoothAdapterWrapper();
            runCollection();
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector
    public BluetoothModel runCollection() throws JSONException {
        Log logger;
        String str;
        if (this.bluetoothService.getHasPermission()) {
            this.eventBusService.unsubscribe(this);
            Log.Companion companion = Log.Companion;
            companion.getLogger().debug("collecting " + getFriendlyName());
            ArrayList arrayList = new ArrayList();
            if (this.bluetoothService.isBluetoothAvailable()) {
                int i2 = this.configurationRepository.getInt(ConfigurationFields.bluetoothNameTruncationLength);
                for (BluetoothDeviceWrapper bluetoothDeviceWrapper : this.bluetoothService.getBoundedDevices()) {
                    String bluetoothClassName = getBluetoothClassName(bluetoothDeviceWrapper.getDeviceClass());
                    String truncatedHash = this.hashService.getTruncatedHash(bluetoothDeviceWrapper.getName(), i2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", truncatedHash);
                    jSONObject.put("deviceType", bluetoothClassName);
                    arrayList.add(jSONObject);
                }
                return new BluetoothModel(arrayList);
            }
            logger = companion.getLogger();
            str = "Bluetooth is unavailable on the device and will not be collected.";
        } else {
            logger = Log.Companion.getLogger();
            str = "Application has no permission to access Bluetooth data. Bluetooth data will not be collected";
        }
        logger.info(str);
        return null;
    }
}
