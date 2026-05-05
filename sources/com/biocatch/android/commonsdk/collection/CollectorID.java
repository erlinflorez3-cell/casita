package com.biocatch.android.commonsdk.collection;

import com.biocatch.android.commonsdk.collection.exceptions.MissingStaticFieldNameException;
import com.biocatch.android.commonsdk.core.consent.Consent;
import com.biocatch.client.android.sdk.core.Constants;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.OperatingSystem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ApplicationEvents' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eRLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007f\u0007l:?ӋC{߉^Xc,\u001fk*éRZd\u001fI;e\u001e\f\"!O|hwvPZ\u0019E'\b,w\u0019-YY\u0007`*\u000f`F\u007fG9M}BQb\u000b53!ݨ&8\b\u000bQ)8K(v)Gƚ\u0010\u00188ϋ\t<X\u0014[\rj#\u0014C8\u00034[\u0016OɇLreŽG%\trPXwm>~e\u000f\\SU\u000eMѰ ҋD7=Ֆub\u0011\u0007j[m\u0004ӭuC\rؒ?)1T\u0002a\u0007g\u000e -+}\u000e\u00147͉`\tib\u001249YLKV\u001c\u0011w\u0001\u000bu<\n\u001en'N?\u0016\u001al\u001av3z\u0006<@V\u0016GB\u0006\u0010J6\u001d;h31P\u0004fWy$\u0019TPd\u0005\u00138\f\u0001t<DT\u0014|}\u001bZ\u0015:1W^&HT)B=s$Yb\bKl0M\"\u0018{\u0017Q\u007f%=\u007f\"#'\u0011jHJ\u000e_\u0005f\u0010<iXp)\"t? *\u000f6CDj0TPZ\u0005\u0015\u0011SI=\u0007\u00046{ b'%!+@7On\u001bSMc<\u000e/ljBnqB@9dh\u001eQiFJR|K(<h=AfH\rtZbb\u000b2N&xw\u0002\u00017\f\u0019o(q\"r\u00151\u001f\u001c}H\t^+A\u0003JHZnRgT9gki*9q\u0001V\"Yom?2,\u0003(\u000b-G\u001a\u001e\u0019,\u001f\u000bh:G\f\u0007\u0005?hGm\u00190Lrc^U\u0002n~\u001a?!\u0018=\u0019_g)8S\u0016ERENQSe\u0010z\u0003Nӡ?>"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "", "5q^Bc\u0015:[\u0019", "", "4hT9W\u0015:[\u0019", "1n[9X*MW#\bbh+|", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r0X\u007f\u000fQKN\u0002", "1n]@X5M", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"5*fZ<:\u0018\u001cX\n])\u0010NUJ#{N;\u001eQ*S\nCr\n\u001a\u0015\u0014~hzI]\u0010E\t\u0019\u007fJrFP`fyEPIl3L\u0016^\u001d2!? %mb\"dY0Sib\u001ev[{=+8", "5dc\u0010b3ES\u0017\u000e~h5d\u0013.e", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]z1P4X+\\(", "5dc\u0010b5LS\"\u000e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0014e6N^\u0002z\u0003^", "AsPA\\*\u001fW\u0019\u0006yG(\u0005\t", "5dc g(MW\u0017_~^3{q+m\u007f", "\u000fo_9\\*:b\u001d\t\u0004>=|\u0012>s", "\u000fo_9\\*:b\u001d\t\u0004G(\u0005\t", "\u000fo_9\\*:b\u001d\t\u0004O,\n\u00173o\t", "\u0012de6V,\u001a^$\u0006~\\(\f\r9n\u000e", "\u0011`[9<5?]", "\u0011kX=U6:`\u0018", "\u0011n]AX?M1\u001cz\u0004`,", "\u000fmS?b0=7w", "\u0018`X9U9>O\u001f", "\u0012de6V,\u001fW\"\u0001zk7\n\r8t", "\u0012de6V,!O&}\rZ9|", "\u001b@2\u000eW+KS'\r", "\u0012de6V,&O\"\u000f{Z*\f\u0019<e\r", "\u0012de6V,&]\u0018~\u0002", "\u001bT8\u0011", "\u001cdcDb9D7\"\u000ezk-x\u0007/s", "\u0012de6V,(`\u001d~\u0004m(\f\r9n", "\u0012de6V,)`#}\u000b\\;", "\u0013kT:X5M3*~\u0004m:", "\u0013kT:X5Ma", "\u0013kT:X5M6\u001d~\bZ9z\fC", "\u0013ld9T;H`", "\u0014kX;Z\fOS\"\u000e\t", "\u001an]4C9>a'^\f^5\f\u0017", "\u001e`]\u0012i,Gb'", "\u001eh]0[\fOS\"\u000e\t", "\"`_\u0012i,Gb'", "\u0010`cAX9RA(z\nn:", "\u0010kd2g6Hb\u001c", "\u0012de6V,\u001c]&~\t", "\u0012de6V,&S!\t\br", "\u0012hb=_(R", "\u001anR._\u0010)", "\u0019dh\u0012i,Gb'", "\u001ahQ?T9RD\u0019\f\tb6\u0006", "\u0012de6V,,])\fx^", "\u0019dh/b(KR'", "\u001a`]4h(@S", "\u001b`X;?(GU)z|^", "\"h\\2m6GS", "\u0011kX2a;)Z\u0015\u000e{h9\u0005", "\u001dR", "\u000fbR2_,K]!~\n^9\\\u001a/n\u000f6", "\u0015xa<f*H^\u0019^\f^5\f\u0017", "\u001ahV5g\fOS\"\u000e\t", "\u001anR.g0H\\", "\u001dqX2a;:b\u001d\t\u0004>=|\u0012>s", "\u001eq^E\\4Bb-", "!d]@b9%W'\u000e", "!hV;\\-BQ\u0015\b\nF6\f\r9n", "!h\\\u0011T;:", "!h\\\u0012k;\u001dO(z", "\"nd0[\fOS\"\u000e\t", "%hU6<5?]", "%hU6;0Lb#\f\u000f", "\u001bnd@X\fOS\"\u000e\t", "\u001a`c2f;\u001aQ\u0017~\tl\u0017\u0007\r8t\u000e", "\u0017lT6", "\u000fbR2f:BP\u001d\u0006~m@\\\u001a/n\u000f6", "\u0012hb=_(Ra", "\u0017lb6", "\u000ftS6b\u0010GT#", "$nX=", "\u0018dc=T*D1#\u0007\u0006h:|h6e\b(\u0005O\u000f", "\u0018dc=T*D1#\u0007\u0006h:|h6e\b(\u0005O`(\u0017P~\u001c", "\u0018dc=T*D1#\u0007\u0006h:|n/y_9{I\u0010%", "\u0018dc=T*D1#\u0007\u0006h:|w9u}+[Q\u0001 &U", "\u0014kdAg,K3 ~\u0003^5\f\u0017", "\u0014kdAg,K3 ~\u0003^5\fh@e\t7\n", "\u0014kdAg,K9\u0019\u0013Zo,\u0006\u0018=", "\u0014kdAg,KB#\u000fxa\f\u000e\t8t\u000e", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class CollectorID {
    private static final /* synthetic */ CollectorID[] $VALUES;
    public static final CollectorID AccelerometerEvents;
    public static final CollectorID AccessibilityEvents;
    public static final CollectorID AndroidID;
    public static final CollectorID ApplicationEvents;
    public static final CollectorID ApplicationName;
    public static final CollectorID ApplicationVersion;
    public static final CollectorID AudioInfo;
    public static final CollectorID BatteryStatus;
    public static final CollectorID Bluetooth;
    public static final CollectorID CallInfo;
    public static final CollectorID ClientPlatform;
    public static final CollectorID Clipboard;
    public static final CollectorID ContextChange;
    public static final CollectorID DeviceApplications;
    public static final CollectorID DeviceCores;
    public static final CollectorID DeviceFingerprint;
    public static final CollectorID DeviceHardware;
    public static final CollectorID DeviceManufacturer;
    public static final CollectorID DeviceMemory;
    public static final CollectorID DeviceModel;
    public static final CollectorID DeviceOrientation;
    public static final CollectorID DeviceProduct;
    public static final CollectorID DeviceSource;
    public static final CollectorID Display;
    public static final CollectorID Displays;
    public static final CollectorID ElementEvents;
    public static final CollectorID ElementHierarchy;
    public static final CollectorID Elements;
    public static final CollectorID Emulator;
    public static final CollectorID FlingEvents;
    public static final CollectorID FlutterElementEvents;
    public static final CollectorID FlutterElements;
    public static final CollectorID FlutterKeyEvents;
    public static final CollectorID FlutterTouchEvents;
    public static final CollectorID GyroscopeEvents;
    public static final CollectorID Imei;
    public static final CollectorID Imsi;
    public static final CollectorID Jailbreak;
    public static final CollectorID JetpackComposeElementEvents;
    public static final CollectorID JetpackComposeElements;
    public static final CollectorID JetpackComposeKeyEvents;
    public static final CollectorID JetpackComposeTouchEvents;
    public static final CollectorID KeyEvents;
    public static final CollectorID Keyboards;
    public static final CollectorID Language;
    public static final CollectorID LatestAccessPoints;
    public static final CollectorID LibraryVersion;
    public static final CollectorID LightEvents;
    public static final CollectorID LocalIP;
    public static final CollectorID Location;
    public static final CollectorID LongPressEvents;
    public static final CollectorID MACAddress;
    public static final CollectorID MUID;
    public static final CollectorID MainLanguage;
    public static final CollectorID MouseEvents;
    public static final CollectorID NetworkInterfaces;
    public static final CollectorID OS;
    public static final CollectorID OrientationEvents;
    public static final CollectorID PanEvents;
    public static final CollectorID PinchEvents;
    public static final CollectorID Proximity;
    public static final CollectorID SensorList;
    public static final CollectorID SignificantMotion;
    public static final CollectorID SimData;
    public static final CollectorID SimExtData;
    public static final CollectorID TapEvents;
    public static final CollectorID Timezone;
    public static final CollectorID TouchEvents;
    public static final CollectorID Voip;
    public static final CollectorID WifiHistory;
    public static final CollectorID WifiInfo;
    private final CollectionMode collectionMode;
    private final String consent;
    private final String fieldName;
    private final String groupName;

    private static final /* synthetic */ CollectorID[] $values() {
        return new CollectorID[]{ApplicationEvents, ApplicationName, ApplicationVersion, DeviceApplications, CallInfo, Clipboard, ContextChange, AndroidID, Jailbreak, DeviceFingerprint, DeviceHardware, MACAddress, DeviceManufacturer, DeviceModel, MUID, NetworkInterfaces, DeviceOrientation, DeviceProduct, ElementEvents, Elements, ElementHierarchy, Emulator, FlingEvents, LongPressEvents, PanEvents, PinchEvents, TapEvents, BatteryStatus, Bluetooth, DeviceCores, DeviceMemory, Display, LocalIP, KeyEvents, LibraryVersion, DeviceSource, Keyboards, Language, MainLanguage, Timezone, ClientPlatform, OS, AccelerometerEvents, GyroscopeEvents, LightEvents, Location, OrientationEvents, Proximity, SensorList, SignificantMotion, SimData, SimExtData, TouchEvents, WifiInfo, WifiHistory, MouseEvents, LatestAccessPoints, Imei, AccessibilityEvents, Displays, Imsi, AudioInfo, Voip, JetpackComposeElements, JetpackComposeElementEvents, JetpackComposeKeyEvents, JetpackComposeTouchEvents, FlutterElements, FlutterElementEvents, FlutterKeyEvents, FlutterTouchEvents};
    }

    static {
        CollectionMode collectionMode = CollectionMode.Continuous;
        ApplicationEvents = new CollectorID("ApplicationEvents", 0, Group.APPLICATIONEVENTS, null, collectionMode, null, 10, null);
        CollectionMode collectionMode2 = CollectionMode.OncePerSession;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ApplicationName = new CollectorID("ApplicationName", 1, Group.STATIC, "application_name", collectionMode2, null, 8, defaultConstructorMarker);
        ApplicationVersion = new CollectorID("ApplicationVersion", 2, Group.STATIC, "application_version", collectionMode2, Consent.QUERY_PACKAGES);
        CollectionMode collectionMode3 = CollectionMode.ContinuousPerSession;
        DeviceApplications = new CollectorID("DeviceApplications", 3, Group.DEVICEAPPLICATIONS, null, collectionMode3, Consent.QUERY_PACKAGES, 2, defaultConstructorMarker);
        CallInfo = new CollectorID("CallInfo", 4, Group.CALLINFO, null, collectionMode3, null, 10, null);
        int i2 = 10;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str = null;
        String str2 = null;
        Clipboard = new CollectorID("Clipboard", 5, Group.CLIPBOARDEVENTS, str, collectionMode, str2, i2, defaultConstructorMarker2);
        ContextChange = new CollectorID("ContextChange", 6, Group.CONTEXTCHANGE, str, collectionMode, str2, i2, defaultConstructorMarker2);
        int i3 = 8;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        AndroidID = new CollectorID("AndroidID", 7, Group.STATIC, "android_id", collectionMode2, null, i3, defaultConstructorMarker3);
        Jailbreak = new CollectorID("Jailbreak", 8, Group.STATIC, "rooted_info", collectionMode2, Consent.QUERY_PACKAGES);
        String str3 = null;
        DeviceFingerprint = new CollectorID("DeviceFingerprint", 9, Group.STATIC, "device_fingerprint", collectionMode2, str3, i3, defaultConstructorMarker3);
        DeviceHardware = new CollectorID("DeviceHardware", 10, Group.STATIC, "device_hardware", collectionMode2, str3, i3, defaultConstructorMarker3);
        MACAddress = new CollectorID("MACAddress", 11, Group.STATIC, "mac_address", collectionMode2, str3, i3, defaultConstructorMarker3);
        DeviceManufacturer = new CollectorID("DeviceManufacturer", 12, Group.STATIC, ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER, collectionMode2, str3, i3, defaultConstructorMarker3);
        DeviceModel = new CollectorID("DeviceModel", 13, Group.STATIC, ProfilingTraceData.JsonKeys.DEVICE_MODEL, collectionMode2, str3, i3, defaultConstructorMarker3);
        MUID = new CollectorID("MUID", 14, Group.STATIC, Constants.MUID, collectionMode2, str3, i3, defaultConstructorMarker3);
        NetworkInterfaces = new CollectorID("NetworkInterfaces", 15, Group.STATIC, "network_interfaces", collectionMode2, str3, i3, defaultConstructorMarker3);
        DeviceOrientation = new CollectorID("DeviceOrientation", 16, Group.DEVICEORIENTATION, null, collectionMode3, str3, 10, defaultConstructorMarker3);
        DeviceProduct = new CollectorID("DeviceProduct", 17, Group.STATIC, "device_product", collectionMode2, str3, 8, defaultConstructorMarker3);
        int i4 = 10;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        String str4 = null;
        String str5 = null;
        ElementEvents = new CollectorID("ElementEvents", 18, Group.ELEMENTEVENTS, str4, collectionMode, str5, i4, defaultConstructorMarker4);
        Elements = new CollectorID("Elements", 19, Group.ELEMENTS, str4, collectionMode, str5, i4, defaultConstructorMarker4);
        ElementHierarchy = new CollectorID("ElementHierarchy", 20, Group.ELEMENTSHIERARCHY, str4, collectionMode, str5, i4, defaultConstructorMarker4);
        Emulator = new CollectorID("Emulator", 21, Group.STATIC, "is_emulator", collectionMode2, null, 8, null);
        int i5 = 10;
        DefaultConstructorMarker defaultConstructorMarker5 = null;
        String str6 = null;
        String str7 = null;
        FlingEvents = new CollectorID("FlingEvents", 22, Group.FLINGEVENTS, str6, collectionMode, str7, i5, defaultConstructorMarker5);
        LongPressEvents = new CollectorID("LongPressEvents", 23, Group.LONGPRESSEVENTS, str6, collectionMode, str7, i5, defaultConstructorMarker5);
        PanEvents = new CollectorID("PanEvents", 24, Group.PANEVENTS, str6, collectionMode, str7, i5, defaultConstructorMarker5);
        PinchEvents = new CollectorID("PinchEvents", 25, Group.PINCHEVENTS, str6, collectionMode, str7, i5, defaultConstructorMarker5);
        TapEvents = new CollectorID("TapEvents", 26, Group.TAPEVENTS, str6, collectionMode, str7, i5, defaultConstructorMarker5);
        BatteryStatus = new CollectorID("BatteryStatus", 27, Group.BATTERYSTATUS, str6, collectionMode, str7, i5, defaultConstructorMarker5);
        int i6 = 8;
        DefaultConstructorMarker defaultConstructorMarker6 = null;
        String str8 = null;
        Bluetooth = new CollectorID("Bluetooth", 28, Group.STATIC, "bluetooth", collectionMode2, str8, i6, defaultConstructorMarker6);
        DeviceCores = new CollectorID("DeviceCores", 29, Group.STATIC, "cores", collectionMode2, str8, i6, defaultConstructorMarker6);
        DeviceMemory = new CollectorID("DeviceMemory", 30, Group.STATIC, "device_memory", collectionMode2, str8, i6, defaultConstructorMarker6);
        Display = new CollectorID("Display", 31, Group.STATIC, "display", collectionMode2, str8, i6, defaultConstructorMarker6);
        LocalIP = new CollectorID("LocalIP", 32, Group.STATIC, "l_ips", collectionMode2, str8, i6, defaultConstructorMarker6);
        KeyEvents = new CollectorID("KeyEvents", 33, Group.KEYS, null, collectionMode, null, 10, null);
        int i7 = 8;
        DefaultConstructorMarker defaultConstructorMarker7 = null;
        String str9 = null;
        LibraryVersion = new CollectorID("LibraryVersion", 34, Group.STATIC, "version_client", collectionMode2, str9, i7, defaultConstructorMarker7);
        DeviceSource = new CollectorID("DeviceSource", 35, Group.STATIC, "device_source", collectionMode2, str9, i7, defaultConstructorMarker7);
        Keyboards = new CollectorID("Keyboards", 36, Group.STATIC, "keyboards", collectionMode2, str9, i7, defaultConstructorMarker7);
        Language = new CollectorID("Language", 37, Group.STATIC, "languages", collectionMode2, str9, i7, defaultConstructorMarker7);
        MainLanguage = new CollectorID("MainLanguage", 38, Group.STATIC, "main_lang", collectionMode2, str9, i7, defaultConstructorMarker7);
        Timezone = new CollectorID("Timezone", 39, Group.STATIC, "time_zone", collectionMode2, str9, i7, defaultConstructorMarker7);
        ClientPlatform = new CollectorID("ClientPlatform", 40, Group.STATIC, "client_platform", collectionMode2, str9, i7, defaultConstructorMarker7);
        OS = new CollectorID("OS", 41, Group.STATIC, OperatingSystem.TYPE, collectionMode2, str9, i7, defaultConstructorMarker7);
        int i8 = 10;
        DefaultConstructorMarker defaultConstructorMarker8 = null;
        String str10 = null;
        String str11 = null;
        AccelerometerEvents = new CollectorID("AccelerometerEvents", 42, Group.ACCELEROMETER, str10, collectionMode, str11, i8, defaultConstructorMarker8);
        GyroscopeEvents = new CollectorID("GyroscopeEvents", 43, Group.GYROSCOPE, str10, collectionMode, str11, i8, defaultConstructorMarker8);
        LightEvents = new CollectorID("LightEvents", 44, Group.LIGHTNEVENTS, str10, collectionMode, str11, i8, defaultConstructorMarker8);
        Location = new CollectorID("Location", 45, Group.LOCATIONEVENTS, null, collectionMode3, null, 10, null);
        int i9 = 10;
        DefaultConstructorMarker defaultConstructorMarker9 = null;
        String str12 = null;
        String str13 = null;
        OrientationEvents = new CollectorID("OrientationEvents", 46, Group.ORIENTATION, str12, collectionMode, str13, i9, defaultConstructorMarker9);
        Proximity = new CollectorID("Proximity", 47, Group.PROXIMITYEVENTS, str12, collectionMode, str13, i9, defaultConstructorMarker9);
        SensorList = new CollectorID("SensorList", 48, Group.STATIC, "sensor_list", collectionMode2, null, 8, null);
        SignificantMotion = new CollectorID("SignificantMotion", 49, Group.SIGNIFICANT_MOTION, null, collectionMode, null, 10, null);
        int i10 = 8;
        DefaultConstructorMarker defaultConstructorMarker10 = null;
        String str14 = null;
        SimData = new CollectorID("SimData", 50, Group.STATIC, "sim_data", collectionMode2, str14, i10, defaultConstructorMarker10);
        SimExtData = new CollectorID("SimExtData", 51, Group.STATIC, "sim_ext_data", collectionMode2, str14, i10, defaultConstructorMarker10);
        TouchEvents = new CollectorID("TouchEvents", 52, Group.TOUCH, null, collectionMode, null, 10, null);
        DefaultConstructorMarker defaultConstructorMarker11 = null;
        String str15 = null;
        WifiInfo = new CollectorID("WifiInfo", 53, Group.WIFIINFO, null, collectionMode3, str15, 10, defaultConstructorMarker11);
        WifiHistory = new CollectorID("WifiHistory", 54, Group.STATIC, "wifi_history", collectionMode2, str15, 8, defaultConstructorMarker11);
        MouseEvents = new CollectorID("MouseEvents", 55, Group.MOUSEREVENTS, null, collectionMode, null, 10, null);
        int i11 = 8;
        DefaultConstructorMarker defaultConstructorMarker12 = null;
        String str16 = null;
        LatestAccessPoints = new CollectorID("LatestAccessPoints", 56, Group.STATIC, "latest_access_points", collectionMode2, str16, i11, defaultConstructorMarker12);
        Imei = new CollectorID("Imei", 57, Group.STATIC, "imei", collectionMode2, str16, i11, defaultConstructorMarker12);
        AccessibilityEvents = new CollectorID("AccessibilityEvents", 58, Group.ACCESSIBILITYEVENTS, null, collectionMode, null, 10, null);
        int i12 = 8;
        DefaultConstructorMarker defaultConstructorMarker13 = null;
        String str17 = null;
        Displays = new CollectorID("Displays", 59, Group.STATIC, "displays", collectionMode2, str17, i12, defaultConstructorMarker13);
        Imsi = new CollectorID("Imsi", 60, Group.STATIC, "imsi", collectionMode2, str17, i12, defaultConstructorMarker13);
        int i13 = 8;
        DefaultConstructorMarker defaultConstructorMarker14 = null;
        String str18 = null;
        AudioInfo = new CollectorID("AudioInfo", 61, Group.AUDIO, Group.AUDIO, collectionMode, str18, i13, defaultConstructorMarker14);
        Voip = new CollectorID("Voip", 62, Group.VOIP, Group.VOIP, collectionMode, str18, i13, defaultConstructorMarker14);
        int i14 = 10;
        String str19 = null;
        JetpackComposeElements = new CollectorID("JetpackComposeElements", 63, Group.ELEMENTS, str19, collectionMode, str18, i14, defaultConstructorMarker14);
        JetpackComposeElementEvents = new CollectorID("JetpackComposeElementEvents", 64, Group.ELEMENTEVENTS, str19, collectionMode, str18, i14, defaultConstructorMarker14);
        JetpackComposeKeyEvents = new CollectorID("JetpackComposeKeyEvents", 65, Group.KEYS, str19, collectionMode, str18, i14, defaultConstructorMarker14);
        JetpackComposeTouchEvents = new CollectorID("JetpackComposeTouchEvents", 66, Group.TOUCH, str19, collectionMode, str18, i14, defaultConstructorMarker14);
        FlutterElements = new CollectorID("FlutterElements", 67, Group.ELEMENTS, str19, collectionMode, str18, i14, defaultConstructorMarker14);
        FlutterElementEvents = new CollectorID("FlutterElementEvents", 68, Group.ELEMENTEVENTS, str19, collectionMode, str18, i14, defaultConstructorMarker14);
        FlutterKeyEvents = new CollectorID("FlutterKeyEvents", 69, Group.KEYS, str19, collectionMode, str18, i14, defaultConstructorMarker14);
        FlutterTouchEvents = new CollectorID("FlutterTouchEvents", 70, Group.TOUCH, str19, collectionMode, str18, i14, defaultConstructorMarker14);
        $VALUES = $values();
    }

    private CollectorID(String str, int i2, String str2, String str3, CollectionMode collectionMode, String str4) {
        this.groupName = str2;
        this.fieldName = str3;
        this.collectionMode = collectionMode;
        this.consent = str4;
    }

    /* synthetic */ CollectorID(String str, int i2, String str2, String str3, CollectionMode collectionMode, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i2, str2, (2 & i3) != 0 ? null : str3, collectionMode, (i3 & 8) == 0 ? str4 : null);
    }

    public static CollectorID valueOf(String str) {
        return (CollectorID) Enum.valueOf(CollectorID.class, str);
    }

    public static CollectorID[] values() {
        return (CollectorID[]) $VALUES.clone();
    }

    public final CollectionMode getCollectionMode() {
        return this.collectionMode;
    }

    public final String getConsent() {
        return this.consent;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getStaticFieldName() throws MissingStaticFieldNameException {
        String str = this.fieldName;
        if (str != null) {
            return str;
        }
        throw new MissingStaticFieldNameException("Missing static field name for " + name());
    }
}
