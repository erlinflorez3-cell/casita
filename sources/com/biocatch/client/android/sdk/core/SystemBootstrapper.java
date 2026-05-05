package com.biocatch.client.android.sdk.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.CollectorRepository;
import com.biocatch.android.commonsdk.collection.CollectorService;
import com.biocatch.android.commonsdk.collection.DataQueue;
import com.biocatch.android.commonsdk.collection.DataQueueService;
import com.biocatch.android.commonsdk.collection.collectors.Collector;
import com.biocatch.android.commonsdk.collection.collectors.touch.TouchSettings;
import com.biocatch.android.commonsdk.collection.focusManager.IFocusManager;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.configuration.ConfigurationService;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.core.consent.ConsentRepository;
import com.biocatch.android.commonsdk.core.context.IContextIDCache;
import com.biocatch.android.commonsdk.core.masking.CoordinatesMaskingService;
import com.biocatch.android.commonsdk.core.masking.TextMaskingService;
import com.biocatch.android.commonsdk.core.performance.PerfCounter;
import com.biocatch.android.commonsdk.core.performance.PerfCounterEntryFactory;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.logging.ServerLogClient;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.android.commonsdk.wrappers.JsonFactory;
import com.biocatch.client.android.sdk.BuildConfig;
import com.biocatch.client.android.sdk.backend.BackendBootstrapper;
import com.biocatch.client.android.sdk.backend.BackendService;
import com.biocatch.client.android.sdk.collection.CollectionControlBoard;
import com.biocatch.client.android.sdk.collection.CollectorIDMapperKt;
import com.biocatch.client.android.sdk.collection.CollectorsController;
import com.biocatch.client.android.sdk.collection.DataHarvester;
import com.biocatch.client.android.sdk.collection.ElementViewGroupChangeObserver;
import com.biocatch.client.android.sdk.collection.SensorGateKeeper;
import com.biocatch.client.android.sdk.collection.SensorService;
import com.biocatch.client.android.sdk.collection.collectors.accessibility.AccessibilityEventsCollector;
import com.biocatch.client.android.sdk.collection.collectors.application.ApplicationEventsCollector;
import com.biocatch.client.android.sdk.collection.collectors.application.ApplicationNameCollector;
import com.biocatch.client.android.sdk.collection.collectors.application.ApplicationVersionCollector;
import com.biocatch.client.android.sdk.collection.collectors.application.ApplicationsService;
import com.biocatch.client.android.sdk.collection.collectors.application.DeviceApplicationsCollector;
import com.biocatch.client.android.sdk.collection.collectors.application.InstalledApplicationsRepository;
import com.biocatch.client.android.sdk.collection.collectors.callInfo.CallInfoCollector;
import com.biocatch.client.android.sdk.collection.collectors.callInfo.ITelephonyListener;
import com.biocatch.client.android.sdk.collection.collectors.callInfo.TelephonyProvider;
import com.biocatch.client.android.sdk.collection.collectors.clipboard.ClipBoardCollector;
import com.biocatch.client.android.sdk.collection.collectors.context.ContextChangeCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.androidID.AndroidIDCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.audio.AudioCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.fingerprint.DeviceFingerprintCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.hardware.DeviceHardwareCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.macAddress.MACAddressCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.manufacturer.DeviceManufacturerCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.model.DeviceModelCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.muid.MuidCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.network.NetworkInterfacesCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.orientation.DeviceOrientationCollector;
import com.biocatch.client.android.sdk.collection.collectors.device.product.DeviceProductCollector;
import com.biocatch.client.android.sdk.collection.collectors.elements.DFSViewEnumerator;
import com.biocatch.client.android.sdk.collection.collectors.elements.ElementEventsCollector;
import com.biocatch.client.android.sdk.collection.collectors.elements.ElementsCollector;
import com.biocatch.client.android.sdk.collection.collectors.elements.ElementsHierarchyCollector;
import com.biocatch.client.android.sdk.collection.collectors.elements.ElementsService;
import com.biocatch.client.android.sdk.collection.collectors.elements.FocusChange;
import com.biocatch.client.android.sdk.collection.collectors.elements.InputEvents;
import com.biocatch.client.android.sdk.collection.collectors.elements.ViewElementsMapper;
import com.biocatch.client.android.sdk.collection.collectors.emulator.EmulatorCollector;
import com.biocatch.client.android.sdk.collection.collectors.gestures.FlingEventCollector;
import com.biocatch.client.android.sdk.collection.collectors.gestures.GestureDispatcher;
import com.biocatch.client.android.sdk.collection.collectors.gestures.LongPressEventCollector;
import com.biocatch.client.android.sdk.collection.collectors.gestures.PanEventCollector;
import com.biocatch.client.android.sdk.collection.collectors.gestures.PinchEventCollector;
import com.biocatch.client.android.sdk.collection.collectors.gestures.TapEventCollector;
import com.biocatch.client.android.sdk.collection.collectors.hardware.BatteryStatusCollector;
import com.biocatch.client.android.sdk.collection.collectors.hardware.BluetoothCollector;
import com.biocatch.client.android.sdk.collection.collectors.hardware.DeviceCoresCollector;
import com.biocatch.client.android.sdk.collection.collectors.hardware.DisplayCollector;
import com.biocatch.client.android.sdk.collection.collectors.hardware.DisplaysCollector;
import com.biocatch.client.android.sdk.collection.collectors.hardware.ImeiCollector;
import com.biocatch.client.android.sdk.collection.collectors.hardware.MemoryCollector;
import com.biocatch.client.android.sdk.collection.collectors.hybrid.MouseEventsCollector;
import com.biocatch.client.android.sdk.collection.collectors.imsi.ImsiCollector;
import com.biocatch.client.android.sdk.collection.collectors.ip.LocalIPCollector;
import com.biocatch.client.android.sdk.collection.collectors.jailbreak.JailbreakCollector;
import com.biocatch.client.android.sdk.collection.collectors.key.KeyEventsCollector;
import com.biocatch.client.android.sdk.collection.collectors.library.LibraryVersionCollector;
import com.biocatch.client.android.sdk.collection.collectors.library.SourceCollector;
import com.biocatch.client.android.sdk.collection.collectors.os.ClientPlatformCollector;
import com.biocatch.client.android.sdk.collection.collectors.os.OSCollector;
import com.biocatch.client.android.sdk.collection.collectors.os.keyboard.KeyboardCollector;
import com.biocatch.client.android.sdk.collection.collectors.os.language.LanguageCollector;
import com.biocatch.client.android.sdk.collection.collectors.os.mainLanguage.MainLanguageCollector;
import com.biocatch.client.android.sdk.collection.collectors.os.timezone.TimeZoneCollector;
import com.biocatch.client.android.sdk.collection.collectors.sensors.accelerometer.AccelerometerCollector;
import com.biocatch.client.android.sdk.collection.collectors.sensors.accelerometer.AccelerometerCollectorSettings;
import com.biocatch.client.android.sdk.collection.collectors.sensors.gyroscope.GyroscopeCollector;
import com.biocatch.client.android.sdk.collection.collectors.sensors.gyroscope.GyroscopeCollectorSettings;
import com.biocatch.client.android.sdk.collection.collectors.sensors.light.LightCollector;
import com.biocatch.client.android.sdk.collection.collectors.sensors.light.LightCollectorSettings;
import com.biocatch.client.android.sdk.collection.collectors.sensors.location.LocationCollector;
import com.biocatch.client.android.sdk.collection.collectors.sensors.location.LocationCollectorSettings;
import com.biocatch.client.android.sdk.collection.collectors.sensors.orientation.OrientationCollector;
import com.biocatch.client.android.sdk.collection.collectors.sensors.orientation.OrientationCollectorSettings;
import com.biocatch.client.android.sdk.collection.collectors.sensors.proximity.ProximityCollector;
import com.biocatch.client.android.sdk.collection.collectors.sensors.proximity.ProximityCollectorSettings;
import com.biocatch.client.android.sdk.collection.collectors.sensors.sensorlist.SensorListCollector;
import com.biocatch.client.android.sdk.collection.collectors.sensors.significantMotion.SignificantMotionCollector;
import com.biocatch.client.android.sdk.collection.collectors.simData.MultiSimDataCollector;
import com.biocatch.client.android.sdk.collection.collectors.simData.MultiSimService;
import com.biocatch.client.android.sdk.collection.collectors.simData.SimDataCollector;
import com.biocatch.client.android.sdk.collection.collectors.simData.SimService;
import com.biocatch.client.android.sdk.collection.collectors.simData.SingleSimService;
import com.biocatch.client.android.sdk.collection.collectors.touch.TouchEventCollector;
import com.biocatch.client.android.sdk.collection.collectors.voip.VoipCallCollector;
import com.biocatch.client.android.sdk.collection.collectors.wifi.LatestAccessPointsCollector;
import com.biocatch.client.android.sdk.collection.collectors.wifi.WifiHistoryCollector;
import com.biocatch.client.android.sdk.collection.collectors.wifi.WifiInfoCollector;
import com.biocatch.client.android.sdk.collection.collectors.wifi.WifiProvider;
import com.biocatch.client.android.sdk.contract.BCCollectorID;
import com.biocatch.client.android.sdk.contract.events.wupInfoEvent.WupInfoEventHandler;
import com.biocatch.client.android.sdk.contract.externalCollectors.group.ElementGroup;
import com.biocatch.client.android.sdk.contract.externalCollectors.group.ExternalCollectorsGroupService;
import com.biocatch.client.android.sdk.contract.externalCollectors.group.GroupType;
import com.biocatch.client.android.sdk.core.accessibility.AccessibilityService;
import com.biocatch.client.android.sdk.core.brand.BrandService;
import com.biocatch.client.android.sdk.core.context.ContextService;
import com.biocatch.client.android.sdk.core.device.HardwareService;
import com.biocatch.client.android.sdk.core.device.bluetooth.BluetoothService;
import com.biocatch.client.android.sdk.core.device.network.NetworkDetectorFactory;
import com.biocatch.client.android.sdk.core.device.network.NetworkService;
import com.biocatch.client.android.sdk.core.dialogs.DialogEventsDetector;
import com.biocatch.client.android.sdk.core.display.DisplaysService;
import com.biocatch.client.android.sdk.core.externalModules.ExternalModuleUtils;
import com.biocatch.client.android.sdk.core.externalModules.ExternalModulesDiscoveryService;
import com.biocatch.client.android.sdk.core.hash.HashService;
import com.biocatch.client.android.sdk.core.jailbreak.JailbreakService;
import com.biocatch.client.android.sdk.core.jailbreak.JailbreakWrapper;
import com.biocatch.client.android.sdk.core.lifecycle.State;
import com.biocatch.client.android.sdk.core.lifecycle.StateService;
import com.biocatch.client.android.sdk.core.masking.CoordinatesMaskingConfigurationUpdater;
import com.biocatch.client.android.sdk.core.permissions.PermissionService;
import com.biocatch.client.android.sdk.core.permissions.RuntimePermissionService;
import com.biocatch.client.android.sdk.core.session.CsidCache;
import com.biocatch.client.android.sdk.core.session.CsidService;
import com.biocatch.client.android.sdk.core.session.SessionInfoService;
import com.biocatch.client.android.sdk.core.session.SessionService;
import com.biocatch.client.android.sdk.di.SdkInjectorKt;
import com.biocatch.client.android.sdk.events.ActivityChangedEventHandler;
import com.biocatch.client.android.sdk.events.ApplicationMaximizingEventHandler;
import com.biocatch.client.android.sdk.events.ApplicationMinimizedEventHandler;
import com.biocatch.client.android.sdk.events.ConfigurationLoadedEventHandler;
import com.biocatch.client.android.sdk.events.EventsSubscriber;
import com.biocatch.client.android.sdk.events.FragmentChangedEventHandler;
import com.biocatch.client.android.sdk.events.NewSessionStartedEventHandler;
import com.biocatch.client.android.sdk.events.StateChangedEventHandler;
import com.biocatch.client.android.sdk.techicalServices.Collections;
import com.biocatch.client.android.sdk.techicalServices.MainThreadVerifier;
import com.biocatch.client.android.sdk.techicalServices.SingleThreadExecutor;
import com.biocatch.client.android.sdk.techicalServices.events.ClientEventService;
import com.biocatch.client.android.sdk.web.GroupNameToCollectorIDMapper;
import com.biocatch.client.android.sdk.web.IWebViewService;
import com.biocatch.client.android.sdk.web.WebViewConnectionFactory;
import com.biocatch.client.android.sdk.web.WebViewDetector;
import com.biocatch.client.android.sdk.web.WebViewService;
import com.biocatch.client.android.sdk.web.WebViewsRepository;
import com.biocatch.client.android.sdk.web.handlers.DataHandler;
import com.biocatch.client.android.sdk.web.handlers.DummyHandler;
import com.biocatch.client.android.sdk.web.handlers.GetConfigurationHandler;
import com.biocatch.client.android.sdk.web.handlers.HybridDataHandler;
import com.biocatch.client.android.sdk.web.handlers.LogHandler;
import com.biocatch.client.android.sdk.web.handlers.UpdateContextHandler;
import com.biocatch.client.android.sdk.wrappers.BuildInfo;
import com.biocatch.client.android.sdk.wrappers.FocusChangeWrapperFactory;
import com.biocatch.client.android.sdk.wrappers.Locale;
import com.biocatch.client.android.sdk.wrappers.MotionEventFactory;
import com.biocatch.client.android.sdk.wrappers.NetworkInterfaceFactory;
import com.biocatch.client.android.sdk.wrappers.Pattern;
import com.biocatch.client.android.sdk.wrappers.SystemProperties;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.greenrobot.eventbus.EventBus;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"Яƅ\u0015D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aw\rfr9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006̝\u0011OdgoñRZ!C\u0017\u0006\u001cyr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=Aś|6\u001b :Ĳ@y\u001b\u0001\"ݒP\u0010\rzKŷ\u0014\u0012F@xíZ\rc\u0005\"\u0012\f?(\u00014\\oN<It]P/+ɅqBd'g0\u0003N\u0015Fj'\u0015vg\u001f3@M5\u001dǬ[\u0003\u001dRcΪ\u000b?\b=\rؒ/'AI{Ɏ>X\u0016\u0014\u001dۀW\rsr.ؘ\rQv\f/˃WcaP\u0016ߊ\u007fz\u0012\rD\u0004\u0014\u0007/HD-\"Ǒ\u0010\u000eItzԟHP\u0018^Jȕ\u0003aL\u0017-Į;+O\u001bnϟi;/N?ަ\r\r4#\t͙)[j\u000eh\u0015!U\u007fQGQH=NO\u0012YSm\f͏j\u0002@\u00048Ϛ\b/\u0012\u00116Ϗ-7q9+ܩs\u0002^Doϸ\r`~SqɭP@0n\u001eճ2\t\"ZLd\u000bkXTf8\u0019M\"V\u000f}\u00161(\\\u000e<)ط\u0018NehqҔU] %7ω?Y\u0005k\u0016W?^;5gc\u0018РZv*?Dϵ\rX|B[ێb\\>\":ʋr\u0010\u000e{L\u0088\u0014\u0013H?y\u001c:.7ǉréx\u0003LA\u0002\u0010\u0019chh(~\u000344\u0007w&\r\t/Sʷtou|\u0012B\u000bJ:-o<e\u001d4p:hb\u0019S\u000b\r_\u0018G\u00169\u000eL5h\u0004C\u0014 D\u0005iU=,+\u000f-\u0019b\b;6dt{P{\u0002W~\u000bk';\u0017\u001e\u0018\u000excDb\u0001I}DG,\u0005R\u000b)\u0018f\u0010y\u0010<)<\u0014X\u0019RVI!z\n@\\1\u0015\u0005M\u0018U\u0007}\u001d\u00157CBU\u0019\\w\\ٳ\u0014oZ\u0002o\\d\u0013\u00134\f}\u0004Z{Fsp1u2i\u0019y^\r<:%\u001bØAxp\u0006٦A!5;ΌGqh~OPM9).j\u0015\n%p\u0005:j\u0019}Ϝ3F`XϗB.\u001alƿ$)N\u0002ܑl\u001eQj֭I'\u000b9֓0\u001f\u001c*18\\gd\u001904iF+qGpŧ;!+D/L\t9͚S\u0018z@\u0006\u000eʗ^'\u001dBD\u0004;\u0005}\u0003m#V\u0011Vnѱ_9*/i?7,gM13]vZ=TJ\u0003i\u001c7\u000b\u001bS\rX=+rDi!6K\u0019\r[\\q92@\u0012;As{q\u001c8FrK7H\u001fGH)_%(\u000f\u000fc]fd%\f\u0017X\\\u001dA\u0001\u0011{<8R\u0014\u0019čN\u000bo\u0011\u0018\u001dZ\u0006<[\u001a/\u001d\u001b͋\u0013Ѽ\u0001cNɑ}\u0012C4UI\u0019\u001c}ضcĺ?}\u0010¶p3\u0012}9\\\u0006\u0018=ō_Ό>\u0016yд3\u000e\u0017\u001eh 2:!Ɩt˹2\b>ОR?\u0010 vY\u001a\u0006w̻3߿p\u0006JŮ9\b\u0018r\u0005c\u001de̦\u0007l9ؼ\u0012p3a+\u001bwY<\u0013pZh\u0012*ݳZӜ\u0004\u0014\u001dұoB\u0016uA\u0010}w?ҷmϪ_\r3Ԛ<6oFHRL\u0014uݚwą.T0ֽ\fb[U|\t\u000b\u0005\u0019ģ\u0010߿n(lÆ\\5\"\u0016\u0017H\r+i̍Hޔ\"d7Юi+i(_`5 \u001cÕ(Ж5RG\u05cd\b@\u0019\r@x'\u0002h\u0001Kʗ6ш\rr\bל|9TsU\u001aUyzݩf݁*KMЯ\u0013\u0017:2&\u0011]|ߣ$Ddӊ4=WVO=a\u0010#]\u001eo5?ǝnW[ϷB\u0003\u0003(\u001bgJ=yc\f7!M\u0006ݬq\u0088[fCä\u0006tZR$\u0002\u0014vԐQi^՟y.ObSLJdN/\"\u001fRTԹy)\bӚIJ0\u0011jr'\u007fe7>*d#\u001bïIـ|s\u0012\u07bf:&\u0002\u001ascJ@)JoܕJЃ1l\u000fŵ\u001et\bB\\\rsL\u000eʗ\bԠ7\u0017\u0005Ә }Ndar{i3ѱ>\u038bw\u0004Bߑ2B\b\u0003XYXB\u0004\u009dVŀnju˩0\u001cFO%\r26\bײbڞd\u001d ñ\u001c\u0003Tutx{\u00029ޔLǦ(^6˷\\\u0019\u0014WFJ-\u0001,\r7ŋ\u001fчKsIڧbe\nd5\u0011\ni͘)mrޯWWw\u001eK\u007f\u0004\u0017{\u0012p5\u0014%[Ǽ#ʢh+\u001dɸ;9<\u0011n@0)\u0007Pdȍpэ\u0014D\u0001ؤxy>{HP-'\u001aל\r\u0097#=]ǝ6\u000b@0O[\u0013_\u0002ŎYּVU+يI\u000e\u0011_Y\u0019A[tҐ;ߊ's\u0015Г\u000f\n\u0016.aW\u0013lwbYʴVħ3\u0006Gć\u0012WzX}?GZ\u0016ֺ\u000eԯ+$\u000e٠tnuf\u0002\u000eP4YԘ8̨-HS¾auP@'z#b˻\u0010>]\u0381U\b\u0017:*\u000e\fnN\u0006Fp7\"ۅn\u00022ڜ\bhz5[\"{\u0004'\u001cIs'b}>j\u05ec]Ƥ\\>\u001fϪvN!a2\u001f<`*)\u007fܩ#ƬgmrԔ%l\u001f;Lk^GPۻhΆBcF̡\u0019z'Jg\u007f1PrG_ȥ|זE\u0010j۪|5D.\u0003\u001b\u0017\u007fyHm֒Cޑz#oʨ\u000b0o\nk_;FxndÑmߢ\u0019{eեΔ\u0011Ѵ+"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w;WIz4&qrkH\u0015r9J\u00022GY$", "", "1kX2a;\u001ed\u0019\b\nL,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-,_v0VZ\u0018\ncVrF#qk\u000eW:z\u0005fR(lD\r", "AdaCX9%]\u001b\\\u0002b,\u0006\u0018", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r)kA/\u0015uHC\tA3Rv0V\"", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iFm\u00141QA7r\"\u001e\"ye7\u0007quN\b'P[\\u:Yv=\u001d!:\u001fN4\u001crYN5rB7tn*S\n\u0005e\u0005\u0016\u0014\nDhs\fR\u0019F\u0007\u001fy@rfPag\u0004PODhsk\u0016a\u001f`C<m\u0002q&,h]\u0015\u0014}1\u0018vR\u0003v=\u000b\n", "/bc6i0Mgvzxa,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)AJoE\"$|?5\u0005f,$", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "/o_9\\*:b\u001d\t\u0004l\u0019|\u00149s\u00047\u0006M\u0015", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u000f\u0016\u0013h=+uD6z\u00137P\u00069d\u0010\u0010 \u0017CWpM`\u001eK\t\u001f\u0003U~", "/o_9\\*:b\u001d\t\u0004l\u001a|\u0016@i}(", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011:7\u0002Hy\u0005\n\u0016c", "0`R8X5=0#\t\nl;\n\u0005:p\u007f5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8cm6]\u00056THY7\\_H", "0qP;W\u001a>`*\u0003x^", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wJP7t3gqu]B\u0006Q,[\b+EL$", "5dc\u000fe(GR\u0007~\bo0z\t", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k ;M\r8x0'\u00142>F\u0003l+<v4XPL,2", "1n[9X*MW#\bXh5\f\u00169l\\2wM\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=grrh@\u0007a;R\u00010%VW;i\\y\u001a\u001e\u000eg\r$", "1n[9X*M]&kzi6\u000b\r>o\r<", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[c'RV\\0k\\\u007fQi", "1n[9X*M]&lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[d'T]R*\\(", "1n[9X*M]&\rXh5\f\u00169l\u0007(\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=grrh@\u0007a;X\u00045%VW;i\\yD\u0014\u001f0", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "1n]3\\.N`\u0015\u000e~h5j\t<v\u0004&{", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e@rJ%\u0016X\u000e$", "1n]AX?M7w\\v\\/|", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLJkG-^L?C\u0010r,a\u0006\u000b&*J*_RH", "1n]AX?MA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wKMDz41$2?C\u0010r,a\u0006\u0015GY_0ZRH", "5dc\u0010b5MS,\u000eh^9\u000e\r-e", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k ;M\r9u=-\u0015{p\u0003dm5]v:V:N9mVp=i", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0006\u0006I\u0002\u001b\u0019W|\nKz/>I\t\u001f3|\u0016;", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wU?Iq8'\u00172?C\u0011p+R\u007f#VL\\\u0014X`xA\u001d\u00148\u0018W,\u0011\u0007iN }HA(w7H}Jh\u000ea", "5dc\u0010b6KR\u001d\bvm,\u000bp+s\u0006,\u0005B^! Hs\u0010L\u0004!D]\b)'x\u0015*\\CH", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k ;M\rCgB$\u0019qc\u0003dm6[u+PH],j:nK\u001a\u0016c\u0010,5\u0016\u0006]C4{@F#\u001259\r:d\u0010\f#c", "1rX16(<V\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w[CIy8(\u001e2?G\u000bb\nJt*G\"", "1rX1F,Kd\u001d|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w[CIy8(\u001e2?G\u000bb\u001aN\u00048KJN\u0002", "5dc\u0010f0=A\u0019\f\fb*|", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k ;M\rIkB,\u0019rj\u0003dq0Md'T]R*\\(", "2`c.;(Kd\u0019\r\n^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gsdp5i_9_v5VL[\u0002", "5dc\u0011T;:6\u0015\f\f^:\f\t<", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2@5\u0016_\u000fJ\u00048GZ],i(", "2`c.D<>c\u0019lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nd'T]R*\\(", "2hP9b.\u001ed\u0019\b\nl\u000b|\u0018/c\u000f2\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLG7r> #2@=\u0003j6PV8GU]:;R\u0002=\u0012!d\u001b$", "3kT:X5M5&\t\u000bi", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<?!\u001cj\u0019\u0018\u000b\u0014\u0005aA-}&D)\u00187\u001f", "3kT:X5MD\u001d~\r@9\u0007\u0019:C\u0003$\u0005B\u0001\u0001\u0014Uo\u001bMv2", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gtoaA\u0007l;?z'Y.[6l]P@\u0010\u001b\\\u000e8(\u001b\u0005fR${\u001a", "3kT:X5Ma\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000ehO\u0012nQH#\u0006,\u001f", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "3uT;g:,c\u0016\rxk0y\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001b|4'$vOI\u0004q*[z$GY$", "3wc2e5:Z\u0001\tyn3|\u0017\u000ei\u000e&\u0006Q\u0001$+5o\u001bMz#5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wMVJkA'\u0011oIC\u0006s3N\u0005p'_],i[nD{\u001cY\u001eU+\u001bc]O\"xU7,\u001c\u001aI\u000fLl~\fk", "5q^Bc\u001a>`*\u0003x^", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<?!\u001cj\u0019\u0018\u000b \u0014YN-jK\u0015)\u000f3I\u007fJr\u000e\u001aw\u001b?z{0V\u001dX}\u0013u\u0017", "5dc\u0014e6N^\u0007~\bo0z\t", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 7\\P7iCg\u0015{p9\u0014l(UT1NSN*k\\\u007fK]\u0014g\u0018^6VdlP${M3&e6P\t;f\u0010\u0016#\u001c\u0017wzRa}G\u0007&y?)>", "6`b5F,Kd\u001d|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wP?In}\u0001\u0011vd'\u0007p=Rt'\u001d", "<dcDb9DA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLCLo2\u001e^qaH\u0019m9T@\u0010G[`6iX`=!#^\fN\u0001", ">da366N\\(~\b", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_9MP<uA&\u0011q_9PN,[w\u0005Q\\W;\\_H", ">da:\\:LW#\bh^9\u000e\r-e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0017N\u0004/KZ\\0f[`=!#^\fN\u0001", "Ad]@b9 O(~`^,\b\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u000eJ\u0006'-LN7\\_H", "Ad]@b9L>&\tx^:\u000b\r8gn+\t@|\u0016", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5jC\u000e\u0017\u0013FE", "Adb@\\6G7\"\u007f\u0005L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w[CIy8(\u001e2O9\u0015q0X\u007f\u000bPMX\u001a\\_\u0004A\u0012\u00120", "Adb@\\6GA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w[CIy8(\u001e2O9\u0015q0X\u007f\u0015GY_0ZRH", "5dc X:LW#\bh^9\u000e\r-e", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k ;M\rIkB,\u0019rj\u0003tc:\\z1P:N9mVp=i", "AsPAX\u001a>`*\u0003x^", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wTG<k22\u0013oa\u0003tr(]v\u0015GY_0ZRH", "5dc g(MS\u0007~\bo0z\t", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k ;M\rBo5\u001e\u0013|_@\u0007-\u001a]r6G:N9mVp=i", "BdgA@(LY\u001d\b|L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", "Ch<.a(@S&", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w='#g=\u001a\u0017hn\u000f", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "EdQ#\\,P2\u0019\u000ez\\;\u0007\u0016", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40shp9\u0005r6[L", "EdQ#\\,PA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0012?C8\\8\u001e'VaF\u0018g*NL", "Eh]1b>\u001cO \u0006wZ*\u0003\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w?GDj>0rdh@\u0004_*T\u0005|", "1qT.g,0S\u0016\\\u0005f7\u0007\u0012/n\u000f6", "", "5q^Bc\u0015:[\u0019m\u0005=(\f\u0005\u001ey\u000b(c<\f\"\u0017T", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0010ZMKv\u001d\u001a\u001dhPCdm3Uv%VV[\u0010;:nH\u001f\u0012gc", ":nP1", "Et_ X9OS&n\be", "", ":nV X9OS&_~q,{x<l", "1hS", "1rX1", "3wc2e5:Zv\t\u0002e,z\u00189r\u000e", "", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "3wc2a+>R\u0003\n\nb6\u0006\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w-VJk=\u001d\u0015gKD\u0016g6W\u0005|", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "1ta?X5M/\u0017\u000e~o0\f\u001d", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", ":nP166EZ\u0019|\nh9\u000b", ">q^0X:LW\"\u0001ia9|\u0005.", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", ";tX166EZ\u0019|\nh9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011KN=`Pr\u0007\u001c\"^\r\u0018\u0013\u001d\tX\u001f.uK7\u001d\u00176VW", "4nRBf\u0014:\\\u0015\u0001zk", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001f\u001ffqGn_5Jx'T\u00162\rfP\u0003K{\u000ec\nP+\u001aZ", "Ah\\ X9OW\u0017~", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016<+\u001a\u0016]?$D", "Ah]4_,,W!lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0017P2\rr]I\u0012nQH#\u0006,\u001f", "2hb.U3>Rv\t\u0002e,z\u00189r\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{rrh@\u0007a;X\u0004\u000b&\"", "3w_9\\*Bb\u0006~\u0007n0\n\t.C\n1\n@\n&%", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SystemBootstrapper {
    private ActivityCache activityCache;
    private ApplicationCache applicationCache;
    private final InstalledApplicationsRepository applicationsRepository;
    private final ApplicationsService applicationsService;
    private BackendBootstrapper backendBootstrapper;
    private final BrandService brandService;
    private final ClientEventService clientEventService;
    private final CollectionControlBoard collectionControlBoard;
    private final CollectorRepository collectorRepository;
    private final CollectorService collectorService;
    private final CollectorsController collectorsController;
    private final ConfigurationRepository configurationRepository;
    private ConfigurationService configurationService;
    private final IContextIDCache contextIDCache;
    private final ContextService contextService;
    private final CoordinatesMaskingConfigurationUpdater coordinatesMaskingConfigurationUpdater;
    private final CsidCache csidCache;
    private final CsidService csidService;
    private final DataHarvester dataHarvester;
    private final DataQueueService dataQueueService;
    private DialogEventsDetector dialogEventsDetector;
    private final ElementGroup elementGroup;
    private final ElementViewGroupChangeObserver elementViewGroupChangeObserver;
    private final ElementsService elementsService;
    private final EventBusService eventBusService;
    private EventsSubscriber eventsSubscriber;
    private ExternalModulesDiscoveryService externalModulesDiscoveryService;
    private final ExternalCollectorsGroupService groupService;
    private final HashService hashService;
    private NetworkService networkService;
    private PerfCounter perfCounter;
    private final PermissionService permissionService;
    private final SensorGateKeeper sensorGateKeeper;
    private HandlerThread sensorsProcessingThread;
    private final ServerLogClient serverLogClient;
    private final SessionInfoService sessionInfoService;
    private final SessionService sessionService;
    private final StateService stateService;
    private TextMaskingService textMaskingService;
    private UIManager uiManager;
    private final Utils utils;
    private WebViewDetector webViewDetector;
    private IWebViewService webViewService;
    private WindowCallbacks windowCallbacks;

    public SystemBootstrapper(ClientEventService clientEventService, ServerLogClient serverLogClient) {
        Intrinsics.checkNotNullParameter(clientEventService, "clientEventService");
        Intrinsics.checkNotNullParameter(serverLogClient, "serverLogClient");
        this.clientEventService = clientEventService;
        this.serverLogClient = serverLogClient;
        InstalledApplicationsRepository installedApplicationsRepository = new InstalledApplicationsRepository();
        this.applicationsRepository = installedApplicationsRepository;
        CollectorRepository collectorRepository = new CollectorRepository();
        this.collectorRepository = collectorRepository;
        CollectionControlBoard collectionControlBoard = new CollectionControlBoard();
        this.collectionControlBoard = collectionControlBoard;
        Utils utilsProvideUtils = SdkInjectorKt.getSdkInjector().provideUtils();
        this.utils = utilsProvideUtils;
        this.dataQueueService = SdkInjectorKt.getSdkInjector().provideDataQueueService();
        IContextIDCache iContextIDCacheProvideContextIDCache = SdkInjectorKt.getSdkInjector().provideContextIDCache();
        this.contextIDCache = iContextIDCacheProvideContextIDCache;
        ConfigurationRepository configurationRepositoryProvideConfigurationRepository = SdkInjectorKt.getSdkInjector().provideConfigurationRepository();
        this.configurationRepository = configurationRepositoryProvideConfigurationRepository;
        HashService hashServiceProvideHashService$sdk_3_3_0_936_release = SdkInjectorKt.getSdkInjector().provideHashService$sdk_3_3_0_936_release();
        this.hashService = hashServiceProvideHashService$sdk_3_3_0_936_release;
        ConsentRepository consentRepositoryProvideConsentRepository = SdkInjectorKt.getSdkInjector().provideConsentRepository();
        this.perfCounter = new PerfCounter(new PerfCounterEntryFactory(), utilsProvideUtils, Log.Companion.getLogger());
        EventBusService eventBusService = new EventBusService(new EventBus());
        this.eventBusService = eventBusService;
        this.coordinatesMaskingConfigurationUpdater = new CoordinatesMaskingConfigurationUpdater(configurationRepositoryProvideConfigurationRepository);
        this.applicationCache = new ApplicationCache();
        this.activityCache = new ActivityCache();
        this.backendBootstrapper = new BackendBootstrapper(configurationRepositoryProvideConfigurationRepository, utilsProvideUtils, serverLogClient, hashServiceProvideHashService$sdk_3_3_0_936_release);
        DataHarvester dataHarvester = new DataHarvester(new SingleThreadExecutor("BC_DataHarvesterThread"), collectorRepository, collectionControlBoard, this.backendBootstrapper.getBackendService(), configurationRepositoryProvideConfigurationRepository);
        this.dataHarvester = dataHarvester;
        CollectorService collectorService = new CollectorService(collectorRepository, configurationRepositoryProvideConfigurationRepository);
        this.collectorService = collectorService;
        CollectorsController collectorsController = new CollectorsController(collectorService, collectorRepository, collectionControlBoard, dataHarvester, configurationRepositoryProvideConfigurationRepository, this.applicationCache, consentRepositoryProvideConsentRepository);
        this.collectorsController = collectorsController;
        ElementViewGroupChangeObserver elementViewGroupChangeObserver = new ElementViewGroupChangeObserver();
        this.elementViewGroupChangeObserver = elementViewGroupChangeObserver;
        this.elementsService = new ElementsService(eventBusService, new DFSViewEnumerator(), elementViewGroupChangeObserver);
        this.contextService = new ContextService(this.activityCache, iContextIDCacheProvideContextIDCache, this.backendBootstrapper.getBackendService(), eventBusService);
        this.stateService = new StateService(eventBusService, collectorsController, this.backendBootstrapper.getBackendService());
        this.brandService = new BrandService(this.backendBootstrapper.getBackendService());
        ElementGroup elementGroup = new ElementGroup(GroupType.Element, GroupCollectors.INSTANCE.getElementsGroupIds());
        this.elementGroup = elementGroup;
        this.groupService = new ExternalCollectorsGroupService(CollectionsKt.listOf(elementGroup));
        this.eventsSubscriber = new EventsSubscriber(eventBusService);
        CsidCache csidCache = new CsidCache();
        this.csidCache = csidCache;
        this.csidService = new CsidService(csidCache, this.backendBootstrapper.getBackendService());
        SessionInfoService sessionInfoService = new SessionInfoService();
        this.sessionInfoService = sessionInfoService;
        this.sessionService = new SessionService(this.backendBootstrapper.getBackendService(), eventBusService);
        this.permissionService = new PermissionService(this.applicationCache);
        this.sensorGateKeeper = new SensorGateKeeper(sessionInfoService, configurationRepositoryProvideConfigurationRepository);
        this.applicationsService = new ApplicationsService(this.applicationCache, installedApplicationsRepository);
        consentRepositoryProvideConsentRepository.subscribeConsentStatusChangedListener(new ConsentRepository.ConsentStatusChangedListener() { // from class: com.biocatch.client.android.sdk.core.SystemBootstrapper.1
            @Override // com.biocatch.android.commonsdk.core.consent.ConsentRepository.ConsentStatusChangedListener
            public void onConsentStatusChanged(String consentType, int i2) {
                Intrinsics.checkNotNullParameter(consentType, "consentType");
                SystemBootstrapper.this.collectorsController.onConsentStatusChanged(consentType, i2, SystemBootstrapper.this.getStateService().getState());
            }
        });
    }

    private final void createWebComponents(ConfigurationRepository configurationRepository, GroupNameToCollectorIDMapper groupNameToCollectorIDMapper) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-30643));
        int[] iArr = new int["4@5B>71y:=v\u0014655)5".length()];
        QB qb = new QB("4@5B>71y:=v\u0014655)5");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (-1060));
        int[] iArr2 = new int["EBT,;BJ'EDH<D".length()];
        QB qb2 = new QB("EBT,;BJ'EDH<D");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            HybridDataHandler hybridDataHandler = new HybridDataHandler(new HashMap());
            WebViewService webViewService = new WebViewService(new WebViewConnectionFactory(handler, hybridDataHandler, this.configurationRepository, this.utils), new WebViewsRepository(), configurationRepository, this.utils);
            this.webViewService = webViewService;
            Intrinsics.checkNotNull(webViewService);
            hybridDataHandler.addHandler(new GetConfigurationHandler(configurationRepository, webViewService));
            JsonFactory jsonFactory = new JsonFactory();
            hybridDataHandler.addHandler(new DataHandler(this.dataQueueService, jsonFactory, this.contextIDCache, groupNameToCollectorIDMapper, this.backendBootstrapper.getBackendService()));
            hybridDataHandler.addHandler(new LogHandler(Log.Companion.getLogger(), new PerfCounterEntryFactory(), jsonFactory));
            hybridDataHandler.addHandler(new UpdateContextHandler());
            hybridDataHandler.addHandler(new DummyHandler());
            EventBusService eventBusService = this.eventBusService;
            IWebViewService iWebViewService = this.webViewService;
            Intrinsics.checkNotNull(iWebViewService);
            this.webViewDetector = new WebViewDetector(eventBusService, iWebViewService);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void load(String str, String str2, String str3, String str4, List<? extends Collector> list, ExtendedOptions extendedOptions, Application application, Activity activity) throws Throwable {
        Log.Companion companion = Log.Companion;
        Log logger = companion.getLogger();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str5 = String.format("Android SDK version: %s", Arrays.copyOf(new Object[]{BuildConfig.VERSION_NAME}, 1));
        Intrinsics.checkNotNullExpressionValue(str5, "format(format, *args)");
        logger.info(str5);
        this.perfCounter.startCounter("timeTillDataCollect");
        this.perfCounter.startCounter("timeTillServerConfig");
        this.configurationRepository.set(ConfigurationFields.enableHybridSolution, extendedOptions.getEnableHybridSolution());
        this.configurationRepository.set(ConfigurationFields.enableCoordinatesMasking, extendedOptions.getEnableCoordinatesMasking());
        this.configurationRepository.set(ConfigurationFields.enableAutoContext, extendedOptions.getEnableAutoContext());
        this.configurationRepository.set(ConfigurationFields.enableGlobalTouchCollectionMode, extendedOptions.getEnableGlobalTouchCollectionMode());
        this.configurationRepository.set(ConfigurationFields.restrictedViewGroupList, extendedOptions.getRestrictedViewGroupList());
        this.configurationRepository.set(ConfigurationFields.enableElementValuesMasking, extendedOptions.getEnableElementValuesMasking());
        this.configurationRepository.set(ConfigurationFields.elementValuesMaskingList, extendedOptions.getElementValuesMaskingList());
        this.configurationRepository.set(ConfigurationFields.elementValuesDisableMaskingList, extendedOptions.getElementValuesDisableMaskingList());
        this.configurationRepository.set(ConfigurationFields.isAppUsingRengwuxianLibraryCustomComponents, extendedOptions.isAppUsingRengwuxianLibraryCustomComponents());
        this.configurationRepository.set(ConfigurationFields.enableWupMessagesHashing, extendedOptions.getEnableWupMessagesHashing());
        this.elementViewGroupChangeObserver.updateConfiguration(this.configurationRepository);
        if (this.elementGroup.isAllGroupExist(list)) {
            this.elementsService.stopHierarchyChangeListener();
        }
        this.applicationCache.set(application);
        GroupNameToCollectorIDMapper groupNameToCollectorIDMapper = new GroupNameToCollectorIDMapper();
        ExternalModuleUtils externalModuleUtils = new ExternalModuleUtils();
        IFocusManager iFocusManagerProvideFocusManager = SdkInjectorKt.getSdkInjector().provideFocusManager();
        ExternalModulesDiscoveryService externalModulesDiscoveryService = new ExternalModulesDiscoveryService(this.dataQueueService, groupNameToCollectorIDMapper, this.configurationRepository, this.collectorService, externalModuleUtils, iFocusManagerProvideFocusManager, this.contextIDCache);
        this.externalModulesDiscoveryService = externalModulesDiscoveryService;
        Intrinsics.checkNotNull(externalModulesDiscoveryService);
        externalModulesDiscoveryService.loadAndInitializeModules(application, extendedOptions.getExternalModulesList(), activity);
        NetworkService networkService = new NetworkService(new NetworkDetectorFactory(this.utils, this.applicationCache));
        this.networkService = networkService;
        networkService.start();
        this.textMaskingService = SdkInjectorKt.getSdkInjector().provideTextMaskingService();
        RuntimePermissionService runtimePermissionService = new RuntimePermissionService(this.permissionService, this.utils);
        ApplicationCache applicationCache = this.applicationCache;
        ActivityCache activityCache = this.activityCache;
        Lifecycle lifecycle = ProcessLifecycleOwner.get().getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "get().lifecycle");
        this.uiManager = new UIManager(applicationCache, activityCache, lifecycle, this.eventBusService, this.utils, this.configurationRepository, runtimePermissionService);
        HandlerThread handlerThread = new HandlerThread("BC_ProcessingThread");
        this.sensorsProcessingThread = handlerThread;
        Intrinsics.checkNotNull(handlerThread);
        handlerThread.start();
        HandlerThread handlerThread2 = this.sensorsProcessingThread;
        Intrinsics.checkNotNull(handlerThread2);
        Handler handler = new Handler(handlerThread2.getLooper());
        MuidCollector muidCollector = new MuidCollector(this.applicationCache, this.utils);
        this.csidCache.set(str4);
        this.backendBootstrapper.start(str, str2, str3, extendedOptions, muidCollector.getMuid());
        this.eventsSubscriber.subscribe(new StateChangedEventHandler(this.clientEventService));
        this.eventsSubscriber.subscribe(new ApplicationMinimizedEventHandler(this.stateService));
        this.eventsSubscriber.subscribe(new ApplicationMaximizingEventHandler(this.stateService));
        this.eventsSubscriber.subscribe(new ActivityChangedEventHandler(this.contextService, this.configurationRepository, this.elementsService));
        this.eventsSubscriber.subscribe(new FragmentChangedEventHandler(this.elementsService));
        this.stateService.updateState(State.STARTING);
        this.configurationService = new ConfigurationService(this.backendBootstrapper.getBackendService(), this.eventBusService);
        createWebComponents(this.configurationRepository, groupNameToCollectorIDMapper);
        this.dialogEventsDetector = new DialogEventsDetector(this.eventBusService, new DFSViewEnumerator());
        SimService simService = new SimService();
        SingleSimService singleSimService = new SingleSimService(simService, application, this.utils);
        CollectorService collectorService = this.collectorService;
        UIManager uIManager = this.uiManager;
        Intrinsics.checkNotNull(uIManager);
        TextMaskingService textMaskingService = this.textMaskingService;
        Intrinsics.checkNotNull(textMaskingService);
        loadCollectors(collectorService, uIManager, handler, muidCollector, application, textMaskingService, iFocusManagerProvideFocusManager, simService, singleSimService, list, extendedOptions.getDisabledCollectors(), extendedOptions.getExplicitRequiredConsents());
        WebViewDetector webViewDetector = this.webViewDetector;
        Intrinsics.checkNotNull(webViewDetector);
        webViewDetector.start();
        DialogEventsDetector dialogEventsDetector = this.dialogEventsDetector;
        Intrinsics.checkNotNull(dialogEventsDetector);
        dialogEventsDetector.start();
        this.collectorsController.onSdkStarting();
        EventsSubscriber eventsSubscriber = this.eventsSubscriber;
        CollectorsController collectorsController = this.collectorsController;
        PerfCounter perfCounter = this.perfCounter;
        StateService stateService = this.stateService;
        BackendService backendService = this.backendBootstrapper.getBackendService();
        IWebViewService iWebViewService = this.webViewService;
        Intrinsics.checkNotNull(iWebViewService);
        SensorGateKeeper sensorGateKeeper = this.sensorGateKeeper;
        TextMaskingService textMaskingService2 = this.textMaskingService;
        Intrinsics.checkNotNull(textMaskingService2);
        eventsSubscriber.subscribe(new ConfigurationLoadedEventHandler(this, collectorsController, perfCounter, stateService, backendService, iWebViewService, sensorGateKeeper, textMaskingService2));
        this.eventsSubscriber.subscribe(new NewSessionStartedEventHandler(this.clientEventService, this.collectorsController, this.applicationsService, this.sessionInfoService, this.brandService));
        this.eventsSubscriber.subscribe(new WupInfoEventHandler(this.clientEventService));
        UIManager uIManager2 = this.uiManager;
        Intrinsics.checkNotNull(uIManager2);
        uIManager2.start();
        UIManager uIManager3 = this.uiManager;
        Intrinsics.checkNotNull(uIManager3);
        uIManager3.registerObserver(companion.getLogger());
        if (activity != null) {
            UIManager uIManager4 = this.uiManager;
            Intrinsics.checkNotNull(uIManager4);
            uIManager4.onActivityResumed(activity);
        }
        this.perfCounter.stopCounter("timeTillDataCollect");
        this.sessionService.startNewSession(str4);
    }

    private final void loadCollectors(CollectorService collectorService, UIManager uIManager, Handler handler, MuidCollector muidCollector, Application application, TextMaskingService textMaskingService, IFocusManager iFocusManager, SimService simService, SingleSimService singleSimService, List<? extends Collector> list, List<? extends BCCollectorID> list2, List<String> list3) throws Throwable {
        Object systemService = application.getSystemService(C1561oA.Yd("\u0016\t\u0013\u0019\u0016\u001a", (short) (C1633zX.Xd() ^ (-27638))));
        Intrinsics.checkNotNull(systemService, Xg.qd("\u001e&\u001e\u001fS\u0018\u0017%&(.Z\u001e\"]\"!46b84e577v9A9:nDJB8s6D;JHC?\nE?QDXCUI\u00139LV\\Y]9N\\PWVd", (short) (ZN.Xd() ^ 25745), (short) (ZN.Xd() ^ 1795)));
        SensorService sensorService = new SensorService((SensorManager) systemService);
        ContextChangeCollector contextChangeCollector = new ContextChangeCollector(this.utils, this.eventBusService);
        CoordinatesMaskingService coordinatesMaskingServiceProvideCoordinatesMaskingService = SdkInjectorKt.getSdkInjector().provideCoordinatesMaskingService();
        int i2 = this.configurationRepository.getInt(Jg.Wd("8\u0010\u0001lXBG.$\u0002\u0013\u0011q>eE9\u0004\u0005PZW5", (short) (C1499aX.Xd() ^ (-1793)), (short) (C1499aX.Xd() ^ (-28622))));
        GestureDispatcher gestureDispatcher = new GestureDispatcher();
        GestureDetector gestureDetector = new GestureDetector(application, gestureDispatcher, handler);
        FocusChange focusChange = new FocusChange(this.eventBusService, this.utils, new FocusChangeWrapperFactory(this.configurationRepository), iFocusManager);
        InputEvents inputEvents = new InputEvents(this.eventBusService, textMaskingService, null, 4, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Collector) it.next()).getCollectorID().name());
        }
        PinchEventCollector pinchEventCollector = CollectorIDMapperKt.shouldCreateCollector(CollectorID.PinchEvents.name(), arrayList, list2, BCCollectorID.PinchEvents) ? new PinchEventCollector(this.utils, coordinatesMaskingServiceProvideCoordinatesMaskingService) : null;
        ClipBoardCollector clipBoardCollector = CollectorIDMapperKt.shouldCreateCollector(CollectorID.Clipboard.name(), arrayList, list2, BCCollectorID.ClipboardEvents) ? new ClipBoardCollector(application, this.utils, iFocusManager, textMaskingService) : null;
        this.windowCallbacks = new WindowCallbacks(clipBoardCollector, gestureDetector, pinchEventCollector != null ? new ScaleGestureDetector(application, pinchEventCollector) : null, this.eventBusService);
        Context applicationContext = application.getApplicationContext();
        String strXd = ZO.xd("6y\u0002\r$", (short) (OY.Xd() ^ 4474), (short) (OY.Xd() ^ 29456));
        Class<?> cls = Class.forName(C1626yg.Ud(",\u0004\n\u000ef\u000eSO\u00180m\t$5\u001fM#&|2QN\u0006", (short) (Od.Xd() ^ (-15361)), (short) (Od.Xd() ^ (-11891))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (FB.Xd() ^ 6325);
        int[] iArr = new int["a\u001eQ\\qj;Afix4\u0003\b\\o".length()];
        QB qb = new QB("a\u001eQ\\qj;Afix4\u0003\b\\o");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i3));
        Object[] objArr = {strXd};
        short sXd2 = (short) (C1499aX.Xd() ^ (-25422));
        int[] iArr2 = new int["\u001ag\u0005\u0007\u000e\\}\u0007U\u001c0\u001bib0\r".length()];
        QB qb2 = new QB("\u001ag\u0005\u0007\u000e\\}\u0007U\u001c0\u001bib0\r");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i4)) + xuXd2.CK(iKK2));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(applicationContext, objArr);
            Intrinsics.checkNotNull(objInvoke, C1561oA.Qd("y\u007fut'ifrqqu ac\u001d_\\mm\u0018ke\u0015bb`\u001e^dZY\f_cYM\u0007GSHUQJD\rRBH@JAGEO\u0003(8>6@7=;E\u0018+7).+7", (short) (Od.Xd() ^ (-31753))));
            BuildInfo buildInfo = new BuildInfo();
            ITelephonyListener telephonyInstance = new TelephonyProvider(this.utils).getTelephonyInstance();
            NetworkInterfaceFactory networkInterfaceFactory = new NetworkInterfaceFactory();
            HardwareService hardwareService = new HardwareService(this.utils, this.applicationCache);
            PermissionService permissionService = this.permissionService;
            Context applicationContext2 = application.getApplicationContext();
            String strZd = C1593ug.zd("~\u000f\u0010\r\u000b\u0006\u0005\u0019\u000f\u0016\u0016V\u000b\u001b\u001c\u0019\u0017\u0012\u0011%\u001b\"\"w%%,\u001e2/", (short) (C1580rY.Xd() ^ (-11850)), (short) (C1580rY.Xd() ^ (-8441)));
            Intrinsics.checkNotNullExpressionValue(applicationContext2, strZd);
            BluetoothService bluetoothService = new BluetoothService(permissionService, applicationContext2, this.utils);
            AccessibilityService accessibilityService = new AccessibilityService(this.applicationCache);
            JailbreakWrapper jailbreakWrapper = new JailbreakWrapper();
            PackageManager packageManager = application.getPackageManager();
            String strOd = C1561oA.od("\u000e\u001c\u001b\u0016\u0012\u000b\b\u001a\u000e\u0013\u0011O\u0011\u0001\u0002\t}\u0003\u007ffy\u0006w|y\u0006", (short) (C1499aX.Xd() ^ (-27229)));
            Intrinsics.checkNotNullExpressionValue(packageManager, strOd);
            JailbreakService jailbreakService = new JailbreakService(buildInfo, jailbreakWrapper, packageManager, this.utils);
            NetworkRequest.Builder networkRequestBuilder = new WifiProvider(this.utils).getNetworkRequestBuilder();
            WindowCallbacks windowCallbacks = this.windowCallbacks;
            Intrinsics.checkNotNull(windowCallbacks);
            uIManager.registerObserver(windowCallbacks);
            collectorService.setExplicitRequiredConsents(list3);
            Collector[] collectorArr = new Collector[63];
            collectorArr[0] = new ElementsCollector(this.eventBusService, this.utils, textMaskingService, this.configurationRepository, coordinatesMaskingServiceProvideCoordinatesMaskingService);
            collectorArr[1] = new BluetoothCollector(this.eventBusService, bluetoothService, this.hashService, this.configurationRepository);
            ApplicationCache applicationCache = this.applicationCache;
            PackageManager packageManager2 = application.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager2, strOd);
            collectorArr[2] = new ApplicationNameCollector(applicationCache, packageManager2);
            collectorArr[3] = new ClientPlatformCollector(buildInfo);
            collectorArr[4] = new ApplicationVersionCollector(this.applicationCache);
            collectorArr[5] = new OSCollector(buildInfo);
            collectorArr[6] = new DeviceCoresCollector(hardwareService);
            collectorArr[7] = new MemoryCollector(hardwareService);
            collectorArr[8] = new KeyboardCollector(application);
            EventBusService eventBusService = this.eventBusService;
            Utils utils = this.utils;
            PermissionService permissionService2 = this.permissionService;
            Context applicationContext3 = application.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, strZd);
            collectorArr[9] = new CallInfoCollector(eventBusService, (TelephonyManager) objInvoke, utils, telephonyInstance, permissionService2, applicationContext3);
            collectorArr[10] = new BatteryStatusCollector(this.applicationCache, new IntentFilter(C1561oA.Kd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0019\u001f&\u0018\")c\u0018\u001b-#**j\u007f\u007f\u0014\u0015\u0007\u0015\u001d$\t\u000f\t\u0017\u0011\u0010\u0010", (short) (C1499aX.Xd() ^ (-4209)))), this.utils);
            collectorArr[11] = new EmulatorCollector(buildInfo, new Pattern(), new SystemProperties());
            collectorArr[12] = new DeviceOrientationCollector(this.applicationCache, this.utils);
            ApplicationCache applicationCache2 = this.applicationCache;
            short sXd3 = (short) (Od.Xd() ^ (-14749));
            short sXd4 = (short) (Od.Xd() ^ (-23202));
            int[] iArr3 = new int["\u0006icV'\u0018\u0002$D2%C\u007fH51\u0016\u0013\u0016fN3@{`YA\u0016\u0011".length()];
            QB qb3 = new QB("\u0006icV'\u0018\u0002$D2%C\u007fH51\u0016\u0013\u0016fN3@{`YA\u0016\u0011");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(((i5 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                i5++;
            }
            collectorArr[13] = new WifiInfoCollector(applicationCache2, new IntentFilter(new String(iArr3, 0, i5)), this.utils, this.hashService, this.configurationRepository, networkRequestBuilder);
            collectorArr[14] = new LanguageCollector(application, this.utils);
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, C1561oA.Xd("ZYi:\\^Zogp%'", (short) (C1499aX.Xd() ^ (-27728))));
            collectorArr[15] = new TimeZoneCollector(new com.biocatch.client.android.sdk.wrappers.TimeZone(timeZone), this.utils);
            collectorArr[16] = new SimDataCollector(singleSimService);
            collectorArr[17] = new MultiSimDataCollector(new MultiSimService(application, this.utils, this.permissionService, singleSimService, simService));
            collectorArr[18] = new WifiHistoryCollector(application, this.permissionService, new Collections(), i2, this.utils);
            collectorArr[19] = new MainLanguageCollector(new Locale());
            collectorArr[20] = new LibraryVersionCollector(Wg.vd("\u001f\u0019\u001d\u0017\u0018\u0015\u001f\u0018*", (short) (Od.Xd() ^ (-30323))));
            collectorArr[21] = new SourceCollector(Qg.kd("\n\u0016\u000b\u0018\u0014\r\u0007", (short) (ZN.Xd() ^ 3621), (short) (ZN.Xd() ^ 18077)));
            Utils utils2 = this.utils;
            String strVd = hg.Vd("\t|p|=", (short) (C1633zX.Xd() ^ (-6745)), (short) (C1633zX.Xd() ^ (-25410)));
            collectorArr[22] = new MACAddressCollector(strVd, networkInterfaceFactory, utils2);
            collectorArr[23] = new NetworkInterfacesCollector(networkInterfaceFactory, this.utils);
            collectorArr[24] = new LocalIPCollector(strVd, new NetworkInterfaceFactory());
            collectorArr[25] = new AndroidIDCollector(this.applicationCache);
            collectorArr[26] = new JailbreakCollector(jailbreakService);
            collectorArr[27] = new DisplayCollector(this.activityCache);
            collectorArr[28] = new ApplicationEventsCollector(this.eventBusService, this.utils);
            collectorArr[29] = new DeviceApplicationsCollector(this.eventBusService, this.applicationsService, this.utils, this.configurationRepository.getLong(C1561oA.ud("PP`RKL'UT%CDKFPLQI>\u001d=C7N!<>=9B", (short) (C1580rY.Xd() ^ (-1134)))));
            collectorArr[30] = contextChangeCollector;
            collectorArr[31] = new ElementsHierarchyCollector(this.eventBusService, new ViewElementsMapper(), this.activityCache, this.utils);
            collectorArr[32] = new TouchEventCollector(this.eventBusService, this.utils, new TouchSettings(this.configurationRepository), coordinatesMaskingServiceProvideCoordinatesMaskingService);
            collectorArr[33] = new KeyEventsCollector(this.eventBusService, this.utils, textMaskingService);
            collectorArr[34] = new ElementEventsCollector(this.utils, inputEvents, focusChange);
            collectorArr[35] = new AccelerometerCollector(sensorService, handler, this.sensorGateKeeper, new DataQueue(this.configurationRepository.getInt(C1561oA.yd("PSPSWQ[Yd]i[e9gWmtpQ\\iiflXjxlse", (short) (C1499aX.Xd() ^ (-29526))))), this.utils, this.eventsSubscriber, new AccelerometerCollectorSettings(this.configurationRepository));
            collectorArr[36] = new GyroscopeCollector(sensorService, handler, this.sensorGateKeeper, new DataQueue(this.configurationRepository.getInt(C1561oA.Yd("dwqoFxhryyZivzwq]s\u0002y\u0001v", (short) (ZN.Xd() ^ 9789)))), this.utils, this.eventsSubscriber, new GyroscopeCollectorSettings(this.configurationRepository));
            collectorArr[37] = new OrientationCollector(new OrientationCollectorSettings(this.configurationRepository), sensorService, handler, this.sensorGateKeeper, new DataQueue(this.configurationRepository.getInt(Xg.qd("\u001f#\u001b\u0018\")\u0017+!((\u007f2\",33\u0014#041+\u0017-;3:0", (short) (OY.Xd() ^ 18719), (short) (OY.Xd() ^ 13991)))), this.utils, this.eventsSubscriber);
            LocationCollectorSettings locationCollectorSettings = new LocationCollectorSettings(this.configurationRepository);
            Utils utils3 = this.utils;
            Context applicationContext4 = application.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, strZd);
            collectorArr[38] = new LocationCollector(locationCollectorSettings, utils3, applicationContext4);
            collectorArr[39] = new TapEventCollector(this.utils, gestureDispatcher, coordinatesMaskingServiceProvideCoordinatesMaskingService);
            collectorArr[40] = new LongPressEventCollector(this.utils, gestureDispatcher);
            collectorArr[41] = new PanEventCollector(this.utils, new MotionEventFactory(), gestureDispatcher, coordinatesMaskingServiceProvideCoordinatesMaskingService);
            collectorArr[42] = pinchEventCollector;
            collectorArr[43] = new FlingEventCollector(this.utils, gestureDispatcher);
            collectorArr[44] = clipBoardCollector;
            collectorArr[45] = new LightCollector(sensorService, handler, new LightCollectorSettings(this.configurationRepository), this.utils);
            collectorArr[46] = new ProximityCollector(sensorService, handler, this.utils, new ProximityCollectorSettings(this.configurationRepository));
            collectorArr[47] = muidCollector;
            collectorArr[48] = new MouseEventsCollector();
            collectorArr[49] = new SensorListCollector(sensorService);
            collectorArr[50] = new SignificantMotionCollector(sensorService, this.utils, this.permissionService);
            collectorArr[51] = new DeviceHardwareCollector(buildInfo);
            collectorArr[52] = new DeviceFingerprintCollector(buildInfo);
            collectorArr[53] = new DeviceManufacturerCollector(buildInfo);
            collectorArr[54] = new DeviceModelCollector(buildInfo);
            collectorArr[55] = new DeviceProductCollector(buildInfo);
            collectorArr[56] = new ImeiCollector(hardwareService, this.permissionService, this.utils);
            collectorArr[57] = new AccessibilityEventsCollector(accessibilityService, this.utils);
            collectorArr[58] = new LatestAccessPointsCollector(this.applicationCache, this.permissionService, this.hashService, this.configurationRepository);
            collectorArr[59] = new DisplaysCollector(this.hashService, this.configurationRepository, this.utils, new DisplaysService(this.applicationCache));
            collectorArr[60] = new ImsiCollector(application, this.permissionService, this.utils);
            collectorArr[61] = new AudioCollector(application, this.utils, this.configurationRepository, new Timer());
            Utils utils4 = this.utils;
            Context applicationContext5 = application.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext5, strZd);
            collectorArr[62] = new VoipCallCollector(utils4, applicationContext5);
            Object[] array = ArraysKt.filterNotNull(collectorArr).toArray(new Collector[0]);
            Intrinsics.checkNotNull(array, Jg.Wd("M/~'#KaW I!t\u007fk>f-gA\u0013,\u0010X\u0010Y|\u0014}K+?[x&u\u000f\u0012<hF\u0013(\u0016.Y_\u0006M>\u0019\u0016:\"qSqNkL\u001e;S1\u0016g}_6_)W/\r_MgoG8VvH\frXrKbCa\u0011\u0006\u0003igIX{9CB\u001euzp\u0019`a.", (short) (FB.Xd() ^ 7499), (short) (FB.Xd() ^ 2753)));
            collectorService.addCollectors((Collector[]) array);
            collectorService.replaceCollectors(list);
            collectorService.removeCollectors(SystemBootstrapperKt.filterNotOverlapping(list2, arrayList));
            Unit unit = Unit.INSTANCE;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final BrandService getBrandService() {
        return this.brandService;
    }

    public final ContextService getContextService() {
        return this.contextService;
    }

    public final CoordinatesMaskingConfigurationUpdater getCoordinatesMaskingConfigurationUpdater() {
        return this.coordinatesMaskingConfigurationUpdater;
    }

    public final CsidService getCsidService() {
        return this.csidService;
    }

    public final DataHarvester getDataHarvester() {
        return this.dataHarvester;
    }

    public final ExternalCollectorsGroupService getGroupService() {
        return this.groupService;
    }

    public final SessionService getSessionService() {
        return this.sessionService;
    }

    public final StateService getStateService() {
        return this.stateService;
    }

    public final void start(String wupServerUrl, String str, String cid, String str2, List<? extends Collector> externalCollectors, ExtendedOptions extendedOptions, Application application, Activity activity) throws Throwable {
        Intrinsics.checkNotNullParameter(wupServerUrl, "wupServerUrl");
        Intrinsics.checkNotNullParameter(cid, "cid");
        Intrinsics.checkNotNullParameter(externalCollectors, "externalCollectors");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        Intrinsics.checkNotNullParameter(application, "application");
        MainThreadVerifier.verify();
        load(wupServerUrl, str, cid, str2, externalCollectors, extendedOptions, application, activity);
    }

    public final void stop() {
        WindowCallbacks windowCallbacks;
        MainThreadVerifier.verify();
        Log.Companion.getLogger().info("Stopping the SDK");
        if (this.windowCallbacks != null && this.activityCache.get() != null && (windowCallbacks = this.windowCallbacks) != null) {
            windowCallbacks.detach(this.activityCache.get());
        }
        this.collectorsController.onSdkStopped();
        this.backendBootstrapper.destroy();
        NetworkService networkService = this.networkService;
        if (networkService != null) {
            networkService.stop();
        }
        WebViewDetector webViewDetector = this.webViewDetector;
        if (webViewDetector != null) {
            webViewDetector.stop();
        }
        IWebViewService iWebViewService = this.webViewService;
        if (iWebViewService != null) {
            iWebViewService.stop();
        }
        DialogEventsDetector dialogEventsDetector = this.dialogEventsDetector;
        if (dialogEventsDetector != null) {
            dialogEventsDetector.stop();
        }
        UIManager uIManager = this.uiManager;
        if (uIManager != null) {
            uIManager.stop();
        }
        HandlerThread handlerThread = this.sensorsProcessingThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        Collector.Companion.resetEventCounter();
        this.stateService.updateState(State.STOPPED);
        this.brandService.reset();
        this.eventsSubscriber.unsubscribeAll();
        this.contextIDCache.reset();
    }
}
