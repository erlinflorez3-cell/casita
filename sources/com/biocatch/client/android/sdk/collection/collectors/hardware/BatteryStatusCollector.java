package com.biocatch.client.android.sdk.collection.collectors.hardware;

import android.content.Intent;
import android.content.IntentFilter;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.Group;
import com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.ApplicationCache;
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
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a%yCQU\"}(\nWNusvJ`\fK\u000f\u0014\u001b\u0001j2I]xk\u001b\u00172HoG3coE9ft>\u000562*8\u007f\u0005\u0007ɝ@Ϻ@|\u000bE[\f@0nozm\u001dQ\u0013\u001b*\u0006l\"\u0011\"jjf6vpm>=(\u001bipTϮc0\u000bTUTbC%v\u00109[DER-%\u0002!MR$G\u0011^\n?\u001bgU'q^DcDY\u0018\u0014C-&\u0558_ę*\\\rĩ1\u001e53gcyYD|Nߕ}Ɂ@\b&\b-R<8jx\u0016\u001aKt!`v%XޠDȸ~eN\u0019+\u000eA:\n'tTy;GR\u000eީ\u0007ڟ\"#\t͙qmb\u001ex\u0015Ie.&\bҜBףLR\"[C\u007f\u0012\u00043\u00128\u0018HI\u0016.*&\u0005ϒ1ھ_;+!y\u0018\u0019Tu\u000e\u001db~R\u0018j\u001fؚ.å\u001a92\t\u001as\u0015r\u0013\u0006hVn+?hr΄\u0013ą\f\u0013(οHH/*(N}n@җOύ\u000e%7ωƦ]\u000f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[7\n]:\r\u0012m/3jSG-e6P\t;f\u0010\u0016#c", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p1U-,dN{<q\u001ca\u0015N)\u001c\u000ff\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[7\n]:\r\u0012m/3jSG-o6H\u0002B>", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "4h[AX9", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&wKv\u001d<\u0004z", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"5(eQ\u007fG\u0018\u0011$\fX4\u001c\u0005bPmRMF\u001f\u0011;*\u0006Bw\u0001\u0019kt3tx\fS\u0014Qw\u0011\u0005?,2Bb^\u0007QED,(n\u0014g'eH9*]o#(h\u001a\u001e\u0019\u007fZ\u001fH\u0016j", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":`bA6/:`\u001b~a^=|\u0010", "", "\u001aiPCTuEO\"\u0001D?3\u0007\u0005>;", ":`bA6/:`\u001b\u0003\u0004`\u001a\f\u0005>u\u000e", "", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", ":`bAC6PS&l\u0005n9z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[E\u0018`+\u001arcQ1lD\r", "5dc\u001db>>`\u0007\t\u000bk*|", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "@t]\u0010b3ES\u0017\u000e~h5", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BatteryStatusCollector extends OnDemandCollector<BatteryStatusModel> {
    private final ApplicationCache applicationCache;
    private final IntentFilter filter;
    private Float lastChargeLevel;
    private Boolean lastChargingStatus;
    private PowerSource lastPowerSource;
    private final Utils utils;

    public BatteryStatusCollector(ApplicationCache applicationCache, IntentFilter filter, Utils utils) {
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.applicationCache = applicationCache;
        this.filter = filter;
        this.utils = utils;
    }

    private final PowerSource getPowerSource(Intent intent) {
        int intExtra = intent.getIntExtra("plugged", -1);
        return intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? PowerSource.UNKNOWN : PowerSource.WIRELESS : PowerSource.USB : PowerSource.AC;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.BatteryStatus;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isBatteryStatusEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return Group.BATTERYSTATUS;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector
    public BatteryStatusModel runCollection() {
        Intent intentRegisterReceiver = this.utils.isVersionGreaterOrEqualTo(33) ? this.applicationCache.get().registerReceiver(null, this.filter, 4) : this.applicationCache.get().registerReceiver(null, this.filter);
        if (intentRegisterReceiver == null) {
            Log.Companion.getLogger().info("Battery status is unavailable. Battery data will not be collected.");
            return null;
        }
        float intExtra = (intentRegisterReceiver.hasExtra("level") && intentRegisterReceiver.hasExtra("scale")) ? intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1) : -1.0f;
        int intExtra2 = intentRegisterReceiver.getIntExtra("status", -1);
        boolean z2 = intExtra2 == 2 || intExtra2 == 5;
        PowerSource powerSource = getPowerSource(intentRegisterReceiver);
        if (Intrinsics.areEqual(intExtra, this.lastChargeLevel) && Intrinsics.areEqual(Boolean.valueOf(z2), this.lastChargingStatus) && powerSource == this.lastPowerSource) {
            return null;
        }
        this.lastChargeLevel = Float.valueOf(intExtra);
        this.lastChargingStatus = Boolean.valueOf(z2);
        this.lastPowerSource = powerSource;
        return new BatteryStatusModel(getContextIDCache().get(), getCurrentEventId(), this.utils.currentTimeMillis(), intExtra, z2, powerSource);
    }
}
