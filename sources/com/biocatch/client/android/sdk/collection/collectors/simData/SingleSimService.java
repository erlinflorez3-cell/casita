package com.biocatch.client.android.sdk.collection.collectors.simData;

import android.app.Application;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.biocatch.android.commonsdk.core.Utils;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şs{J$cҕyCI^\"Ԃ*\t]To˧tϺpŏs\u000f4\u00159\u0006<Mcxu\u0012=3RsM5eok<pxD\t82P=ѩ\t\u0001(0\u0011\u001e\u0005\u0004[K:\u001c`Fv:`\u0018e\u0005H\u001eNB.\u000e6\\\u0016\\\u0007Tz]R/Q\u0004@ĬPϮc0\u0005ձ]Rb.%v\u0010&\u0002«9߱\u0019%[ΈW^iC\u001b? B[ؕ)ݳ/I{Ɏ͕\\\u000f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0017P2\rr]I\u0012nQH#\u0006,\u001f", "", "Ah\\ X9OW\u0017~", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016<+\u001a\u0016]?$D", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016\\0d1nL\u0010[H\u0012V\u0019\r\u0012jE\"n\u001a\u001e\u001b\u0011+V\f?gJ\b!\u0019~F{M]\u0014Eu$yK2>-Wi\u0002\u0011>Il(`\u001b] &6C#!{\u001d\u001a2N8\u0012\u0004]\u001a\u0001Q\u007f1eQ&z\u0002\u0014MqbT\u001b3F", "Bd[2c/H\\-fvg(~\t<", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qj@\b\u0017\"Jy\u0017P^!>U\u007f DC", "1n[9X*MA\u001d\u0007YZ;xp9d\u007f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016-'\u001c\u0001AK#nK\r", "0tX9W\u001aMO(\u0003x", "", "Bnc._\u001aB[v\t\u000bg;]\u0013<S\u00041}G\u0001z Hy", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SingleSimService {
    private final SimService simService;
    private final TelephonyManager telephonyManager;
    private final Utils utils;

    public SingleSimService(SimService simService, Application application, Utils utils) {
        Intrinsics.checkNotNullParameter(simService, "simService");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.simService = simService;
        this.utils = utils;
        Object systemService = application.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        this.telephonyManager = (TelephonyManager) systemService;
    }

    public static /* synthetic */ SimDataModel collectSimDataModel$default(SingleSimService singleSimService, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return singleSimService.collectSimDataModel(z2);
    }

    public final SimDataModel collectSimDataModel(boolean z2) {
        String iso = this.telephonyManager.getSimCountryIso();
        String simOperator = this.telephonyManager.getSimOperator();
        String operatorName = this.telephonyManager.getSimOperatorName();
        String mcc = this.simService.getMcc(simOperator);
        String mnc = this.simService.getMnc(simOperator);
        SimService simService = this.simService;
        Intrinsics.checkNotNullExpressionValue(operatorName, "operatorName");
        Intrinsics.checkNotNullExpressionValue(iso, "iso");
        return simService.buildSimDataModel(operatorName, iso, mcc, mnc, z2);
    }

    public final int totalSimCountForSingleInfo() {
        if (this.utils.isVersionGreaterOrEqualTo(30)) {
            return this.telephonyManager.getSupportedModemCount();
        }
        if (this.utils.isVersionGreaterOrEqualTo(23)) {
            return this.telephonyManager.getPhoneCount();
        }
        return 1;
    }
}
