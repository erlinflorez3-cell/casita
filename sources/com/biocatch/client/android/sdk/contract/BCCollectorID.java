package com.biocatch.client.android.sdk.contract;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz?Gّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOC\u000bI\u0015n\u0016~q\u0015I[\u0001F\u0012\u0015;+oE=6oCDIt<\u0011\t2(Eb\u0005\u0007(\u0013H\u0016\u0006cCQ\u001cz0F\u0002#R\u0013_m\u001a\u0018\u0019' \u00072EgTK1lcP\u0018#\t\u0001+N-w\u0019|S&/T-'_a$F)7;1\u000eS\t$;[E!(qC$Q'-K2s]WA\u007f\u001a7\u0014O\u0013\u0001[&b):`\u0012L\u0014Oiq9\u000e.\u001fc{\u0013dl\u000e\fP1.3DO\b\u0014^]rYl9\u0002dohzgd\u007f%\u0006b\u00149!\u0017:aAJ77\u00027u\u001e)4W!a\tv`\u001bP=wWg:@C\u007f7\n_uV\u0004v\u001cj*\nj0\u007f57¦2S"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{rrh@\u0007a;X\u0004\u000b&\"", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u000fo_\u0019\\->Q-|\u0002^\f\u000e\t8t\u000e", "\u000fo_\u001bT4>", "\u000fo_#X9LW#\b", "\u0012de6V,\u001a^$\u0006~\\(\f\r9n\u000e", "\"d[2c/H\\-^\f^5\f\u0017", "\u0011kX=U6:`\u0018^\f^5\f\u0017", "\u000fmS?b0=7w", "\u0017r32i0<S\u0006\t\u0005m,{", "\u0012de6V,\u001fW\"\u0001zk7\n\r8t", "\u0012de6V,!O&}\rZ9|", "\u001b@2\u000eW+KS'\r", "\u0012de6V,&O\"\u000f{Z*\f\u0019<e\r", "\u0012de6V,&]\u0018~\u0002", "\u001cdcDb9D7\"\u000ezk-x\u0007/s", "\u0012de6V,(`\u001d~\u0004m(\f\r9n", "\u0012de6V,)`#}\u000b\\;", "#H49X4>\\(^\f^5\f\u0017", "#H49X4>\\(\r", "\u0017r32i0<Sx\u0007\u000be(\f\u0013<", "\u0014kX;Z\fOS\"\u000e\t", "\u001an]4C9>a'^\f^5\f\u0017", "\u001e`]\u0012i,Gb'", "\u001eh]0[\fOS\"\u000e\t", "\"`_\u0012i,Gb'", "\u0010`cAX9RA(z\nn:", "\u0011n];X*MS\u0018[\u0002n,\f\u00139t\u0003\u0007{Q\u0005\u0015\u0017U", "\u0012de6V,\u001c]&~\t", "\u0012de6V,&S!\t\br", "\u0012hb=_(R", "\u001anR._\u0010)", "\u0019dh/b(KR|\b\u0006n;\\\u001a/n\u000f6", "\u0012de6V,,])\fx^", "\u000fuP6_(;Z\u0019dzr)\u0007\u0005<d\u000e", "\u0011n]3\\.N`\u0019}aZ5~\u0019+g\u007f6", "\u001b`X;?(GU)z|^", "\"h\\2m6GS", "\u0012de6V,\u001dW'\n\u0002Z@e\u00057e", "\u001dR", "\u000fbR2_,K]!~\n^9\\\u001a/n\u000f6", "\u0015xa<f*H^\u0019^\f^5\f\u0017", "\u001ahV5g\u001a>\\'\t\b>=|\u0012>s", "\u001anR.g0H\\", " nc.g0H\\\u0007~\u0004l6\nh@e\t7\n", "\u001eq^E\\4Bb-lzg:\u0007\u0016\u000fv\u007f1\u000bN", "\u000fuP6_(;Z\u0019lzg:\u0007\u0016=", "!hV;\\-BQ\u0015\b\nF6\f\r9nm(\u0005N\u000b$vXo\u0017K\u0005", "!h\\\u0011T;:", "\u001bt[A\\\u001aB[wz\nZ", "\u0015k^/T3-])|}>=|\u0012>s", "%hU6<5?]", "\u0011n]3\\.N`\u0019}lb-\u0001q/t\u00122\tF\u000f", "\u001bnd@X\fOS\"\u000e\t", "\u001a`c2f;\u001aQ\u0017~\tl\u0017\u0007\r8t\u000e", "\u0017lT6", "\u000fbR2f:BP\u001d\u0006~m@\\\u001a/n\u000f6", "\u000fuP6_(;Z\u0019]~l7\u0004\u0005Cs", "\u0017lb6", "\u000ftS6b\u0010GT#", "$nX=6(EZ|\b{h", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public enum BCCollectorID {
    AppLifecycleEvents,
    AppName,
    AppVersion,
    DeviceApplications,
    TelephonyEvents,
    ClipboardEvents,
    AndroidID,
    IsDeviceRooted,
    DeviceFingerprint,
    DeviceHardware,
    MACAddress,
    DeviceManufacturer,
    DeviceModel,
    NetworkInterfaces,
    DeviceOrientation,
    DeviceProduct,
    UIElementEvents,
    UIElements,
    IsDeviceEmulator,
    FlingEvents,
    LongPressEvents,
    PanEvents,
    PinchEvents,
    TapEvents,
    BatteryStatus,
    ConnectedBluetoothDevices,
    DeviceCores,
    DeviceMemory,
    Display,
    LocalIP,
    KeyboardInputEvents,
    DeviceSource,
    AvailableKeyboards,
    ConfiguredLanguages,
    MainLanguage,
    Timezone,
    DeviceDisplayName,
    OS,
    AccelerometerEvents,
    GyroscopeEvents,
    LightSensorEvents,
    Location,
    RotationSensorEvents,
    ProximitySensorEvents,
    AvailableSensors,
    SignificantMotionSensorEvents,
    SimData,
    MultiSimData,
    GlobalTouchEvents,
    WifiInfo,
    ConfiguredWifiNetworks,
    MouseEvents,
    LatestAccessPoints,
    Imei,
    AccessibilityEvents,
    AvailableDisplays,
    Imsi,
    AudioInfo,
    VoipCallInfo
}
