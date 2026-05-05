package com.biocatch.android.commonsdk.collection;

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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcziGّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOC\u000bI\u0015n\u0016~q\u0015I[\u0001F\u0012\u0015;+oE=6oCDIt<\u0011\t2(Eb\u0005\u0007(\u0013H\u0016\u0006cCQ\u001cz0F\u0002#R\u0013_m\u001a\u0018\u0019' \u00072EgTK1lcP\u0018#\t\u0001+N-w\u0019|S&/T-'_a$F)7;1\u000eS\t$;[E!(qC$Q'-K2s]WA\u007f\u001a7\u0014O\u0013\u0001[&b):`\u0012L\u0014Oiq9\u000e.\u001fc{\u0013dl\u000e\fP1.3DO\b\u0014^]rYl9\u0002dohzgd\u007f%\u0006b\u00149!\u0017:aAJ77\u00027u\u001e)4W!a\tv`\u001bP=wWg:@C\u007f7\n_uV\u0004v\u001cj*\nj0\u007f57y.\u001da [?`\nk\b\u0007-g|DIhY*;HFcW\u0016=lq\f`\bM\u0005q\u0015=X2V6\u001cZMf\b\u0019gEwBi\u000e\u0010T\u0019Qip\u0018F\n+zO7_;T\u000e]\u0007G3; L\u0010g\"_\u0014E\rK\u0005^8+S\u0012-E((\u00061j\u0016LdDTa{2EH\u000542\t\u0002\\\u001b!k\u001eH\u001be\te5Q\u0010\u00050\u001c$\tF\rt\u000f^9\\vNPxO\fe`(\u000e*Q;z\u000fU(K\u001d|)jgs\u0006,PLM2̧\u001a\\"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "<n]2", "7r?9h.B\\'", "7r62f;N`\u0019^\f^5\f\u0017", "7rI<b4%S*~\u0002", "7r01i(GQ\u0019}Wk6\u000f\u0017/rj5\u0006K\u0001$&Ko\u001c", "7r36f7EO-_zZ;\r\u0016/", "7r5<a;L", "7r3<`\fES!~\u0004m\u001a\f\u0005>s", "7rE\u001a7,MS\u0017\u000e~h5", "7r=2g>H`\u001fZ\u0006b", "7r??\\=:b\u0019[\bh>\u000b\r8g", "7r8=66EZ\u0019|\nb6\u0006", "7r?2e-H`!z\u0004\\,i\t=o\u00105y@", "7r2._*\u001cO\u0017\u0002z", "7r4AT.", "7r2._*\u001f^'", "7r<<h:>3*~\u0004m:", "7r:2l\fOS\"\u000e\t", "7rF6a+Hex\u0010zg;\u000b", "7r49X4>\\(\rZo,\u0006\u0018=", "7r49X4>\\(\r]b,\n\u0005<c\u0003<", "7r5<e4\u001ed\u0019\b\nl", "7r49X4>\\(\reh:\u0001\u00183o\t", "7r49X4>\\(\rhbA|", "7r49X4>\\(\rXe(\u000b\u0017\u0018a\b(", "7r49X4>\\(\r]k,}", "7r49X4>\\(\rib;\u0004\t", "7r29\\7;]\u0015\fy>=|\u0012>s", "7rC<h*A3*~\u0004m:", "7rB0e0Ibx\u0012z\\<\f\t", "7r6Fe6\u001ed\u0019\b\nl", "7r>?\\,Gb\u0015\u000e~h5\\\u001a/n\u000f6", "7r00V,ES&\t\u0003^;|\u0016\u000fv\u007f1\u000bN", "7rB6Z5BT\u001d|vg;d\u0013>i\n1[Q\u0001 &U", "7r?2e-H`!z\u0004\\,i\t=o\u00105y@n\u001e!Vr", "7r59T:A;)\u0003y", "7r5<a;L4 z\ta", "7r<Bg(MW#\bd[:|\u0016@e\r", "7rA2f,M3*~\br\u0013\u0007\u0005.", "7rB0e0Ibx\u0012z\\<\f\t\u000fv\u007f", "7rB0e0Ib'_zZ;\r\u0016/", "7rB0e6EZv\t\u0002e,z\u0018", "7rD;f<I^#\f\n^+i\t:o\r7", "7rD@\\5@1'\u0003y", "7rD@\\5@@\u0019\rzm\u001a\u0001\b", "7r2<a;>f(\\}Z5~\t", "7r49X4>\\(\r", "7r;<V(MW#\bZo,\u0006\u0018=", "7rF6Y0!W'\u000e\u0005k@", "7r00V,La\u001d{~e0\f\u001d\u000fv\u007f1\u000bN", "7rC.c\fOS\"\u000e\t", "7r;<a.)`\u0019\r\t>=|\u0012>s", "7r?.a\fOS\"\u000e\t", "7r?6a*A3*~\u0004m:", "7r59\\5@3*~\u0004m:", "7r;6Z/M3*~\u0004m:", "7r??b?B[\u001d\u000e\u000f>=|\u0012>s", "7rF6Y0\"\\\u001a\tZo,\u0006\u0018=", "7r32i0<S\u0003\f~^5\f\u0005>i\n1[Q\u0001 &U", "7r0=c3BQ\u0015\u000e~h5\\\u001a/n\u000f6", "7r1.g;>`-l\nZ;\r\u0017\u000fv\u007f1\u000bN", "3mP/_,\u001dS*\u0003x^\b\b\u00146i}$\u000bD\u000b %%y\u0015Cv#D]\b)", "7r19h,M]#\u000e}", "7r2._3\"\\\u001a\t", "7rB2a:H`\u007f\u0003\tm", "7rE<\\7", "3mP/_,\u001dW'\n\u0002Z@]\t+t\u00105{", "3mP/_,&S!\t\br\r|\u0005>u\r(", "3mP/_,&c\u001d}[^(\f\u0019<e", "3mP/_,+S%\u000fzl;`g\u0010e{7\fM\u0001", "3mP/_,\u001c]&~\t?,x\u0018?r\u007f", "3mP/_,/S&\r~h5]\t+t\u00105{", "3mP/_,$S-{\u0005Z9{\u0017\u0010e{7\fM\u0001", "3mP/_,\u001e[)\u0006vm6\ng/t\u007f&\u000bJ\u000ew\u0017C~\u001eIv", "3mP/_,\u001dS*\u0003x^\u000fx\u0016.w{5{!\u0001\u0013&W|\u000e", "3mP/_,\u001dS*\u0003x^\r\u0001\u00121e\r3\tD\n&wGk\u001dL\u0004%", "3mP/_,\u001dS*\u0003x^\u0014x\u0012?f{&\u000bP\u000e\u0017$(o\nK\u000725", "3mP/_,\u001dS*\u0003x^\u0014\u0007\b/l`(wO\u0011$\u0017", "3mP/_,\u001dS*\u0003x^\u0017\n\u0013.u}7\\@|&'To", "3mP/_,,W!]vm(]\t+t\u00105{", "3mP/_,&c \u000e~L0\u0005g+t{\t{<\u0010'$G", "3mP/_,(A\n~\bl0\u0007\u0012\u0010e{7\fM\u0001", "3mP/_,)Z\u0015\u000e{h9\u0005i/a\u000f8\t@", "3mP/_,\u001a^$\u0006~\\(\f\r9np(\tN\u0005! ", "3mP/_,\u001a^$\u0006~\\(\f\r9nh$\u0004@a\u0017\u0013V\u007f\u001b<", "3mP/_,&O\u001d\baZ5~\u0019+g\u007f\t{<\u0010'$G", "3mP/_,,])\fx^\r|\u0005>u\r(", "3mP/_,&/vZy]9|\u0017=F\u007f$\u000bP\u000e\u0017", "3mP/_,'S(\u0011\u0005k2`\u0012>e\r)w>\u0001%wGk\u001dL\u0004%", "3mP/_,\u001a\\\u0018\f\u0005b+`g\u0010e{7\fM\u0001", "3mP/_,#O\u001d\u0006wk,x\u000f\ro\u0007/{>\u0010\u001b!P", "3mP/_,%]\u0017z\u0002B\u0017X\b.r\u007f6\n!\u0001\u0013&W|\u000e", "3mP/_,%O\"\u0001\u000bZ.|\u0017\u0010e{7\fM\u0001", "3mP/_,-W!~oh5|i/a\u000f8\t@", "3mP/_,&])\rz>=|\u0012>s`(wO\u0011$\u0017", "6xQ?\\+,] \u000f\nb6\u0006wCp\u007f", "3mP/_,%O(~\tm\bz\u0007/s\u000e\u0013\u0006D\n&%%y\u0015Cv#D]\b)", "3mP/_,\"[\u0019\u0003Xh3\u0004\t-t\u00042\u0005", "3mP/_,\u001dW'\n\u0002Z@\u000bf9l\u0007(yO\u0005! ", "3mP/_,\"['\u0003Xh3\u0004\t-t\u00042\u0005", "3mP/_,\u001ac\u0018\u0003\u0005B5}\u0013\u0010e{7\fM\u0001", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public enum ConfigKeys {
    none,
    isPlugins,
    isGestureEvents,
    isZoomLevel,
    isAdvancedBrowserProperties,
    isDisplayFeature,
    isFonts,
    isDomElementStats,
    isVMDetection,
    isNetworkApi,
    isPrivateBrowsing,
    isIpCollection,
    isPerformanceResource,
    isCalcCache,
    isEtag,
    isCalcFps,
    isMouseEvents,
    isKeyEvents,
    isWindowEvents,
    isElementsEvents,
    isElementsHierarchy,
    isFormEvents,
    isElementsPosition,
    isElementsSize,
    isElementsClassName,
    isElementsHref,
    isElementsTitle,
    isClipboardEvents,
    isTouchEvents,
    isScriptExecute,
    isGyroEvents,
    isOrientationEvents,
    isAccelerometerEvents,
    isSignificantMotionEvents,
    isPerformanceResourceSloth,
    isFlashMuid,
    isFontsFlash,
    isMutationObserver,
    isResetEveryLoad,
    isScriptExecuteEve,
    isScriptsFeature,
    isScrollCollect,
    isUnsupportedReport,
    isUsingCsid,
    isUsingResetSid,
    isContextChange,
    isElements,
    isLocationEvents,
    isWifiHistory,
    isAccessibilityEvents,
    isTapEvents,
    isLongPressEvents,
    isPanEvents,
    isPinchEvents,
    isFlingEvents,
    isLightEvents,
    isProximityEvents,
    isWifiInfoEvents,
    isDeviceOrientationEvents,
    isApplicationEvents,
    isBatteryStatusEvents,
    enableDeviceApplicationsCollection,
    isBluetooth,
    isCallInfo,
    isSensorList,
    isVoip,
    enableDisplayFeature,
    enableMemoryFeature,
    enableMuidFeature,
    enableRequestIDFeature,
    enableCoresFeature,
    enableVersionFeature,
    enableKeyboardsFeature,
    enableEmulatorDetectorFeature,
    enableDeviceHardwareFeature,
    enableDeviceFingerprintFeature,
    enableDeviceManufacturerFeature,
    enableDeviceModelFeature,
    enableDeviceProductFeature,
    enableSimDataFeature,
    enableMultiSimDataFeature,
    enableOSVersionFeature,
    enablePlatformFeature,
    enableApplicationVersion,
    enableApplicationNameFeature,
    enableMainLanguageFeature,
    enableSourceFeature,
    enableMACAddressFeature,
    enableNetworkInterfacesFeature,
    enableAndroidIDFeature,
    enableJailbreakCollection,
    enableLocalIPAddressFeature,
    enableLanguagesFeature,
    enableTimeZoneFeature,
    enableMouseEventsFeature,
    hybridSolutionType,
    enableLatestAccessPointsCollection,
    enableImeiCollection,
    enableDisplaysCollection,
    enableImsiCollection,
    enableAudioInfoFeature
}
