package com.biocatch.client.android.sdk.core;

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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":!\u007f\u0007lr?ԅD{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>ˮAН^\u000bKƤV-\u0007mDOezm\u0012=4psУ7Uw=Gg\r8\u000b%@(\t\u0011\u0013\t20X\u0012\u0007zqM:\u0016ضDxBR\u001bT\u001d\u001c\u0018\u000fL&Q5jqf<Xnm:]%1mŌR/g0\u000bT%HZ2\u001b|259LO;%'c\u00035T\nCƄCyE\u0005v.?-O\u0001e<ނ\u0004\""}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w:MEz\u0012!\u0015fg\u0017\u0011l:]r0VZ$", "", "u(E", "\u0010H=\u000eE 8A\t", "", "9m^Da\u000b:\\\u001b~\bh<\u000bd:p\u000e\u0013w>\u0007\u0013\u0019G}", "", "5dc\u0018a6P\\wz\u0004`,\n\u0013?s[3\u0007Nk\u0013\u0015Mk\u0010<\u0005", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "9m^Da\u0019H](Z\u0006i:g\u0005-k{*{N", "5dc\u0018a6P\\\u0006\t\u0005m\b\b\u0014=P{&\u0002<\u0003\u0017%", ">`c5f\u001bAO(l}h<\u0004\b\u0018o\u000f\u0005{2\u000e\u001b&Cl\u0015<", "5dc\u001dT;Aa\b\u0002vm\u001a\u007f\u0013?l~\u0011\u0006O]\u0017\tTs\u001d8s,5", "At?.g/L", "5dc h\u0017:b\u001c\r", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class RootCheckConstants {
    public static final String BINARY_SU = "su";
    public static final RootCheckConstants INSTANCE = new RootCheckConstants();
    private static final String[] knownRootAppsPackages = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
    private static final String[] knownDangerousAppsPackages = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};
    private static final String[] suPaths = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/sbin/su", "/su/bin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/system/xbin/su", "/cache/su", "/data/su", "/dev/su"};
    private static final String[] pathsThatShouldNotBeWritable = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    private RootCheckConstants() {
    }

    public final String[] getKnownDangerousAppsPackages() {
        return knownDangerousAppsPackages;
    }

    public final String[] getKnownRootAppsPackages() {
        return knownRootAppsPackages;
    }

    public final String[] getPathsThatShouldNotBeWritable() {
        return pathsThatShouldNotBeWritable;
    }

    public final String[] getSuPaths() {
        return suPaths;
    }
}
