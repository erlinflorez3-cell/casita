package com.biocatch.client.android.sdk.collection.collectors.simData;

import android.app.Application;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.client.android.sdk.core.permissions.PermissionService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCI^\"}(\nWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:h]xs\u0012\u0017˰JoM?UڎE9vt>\u0005&3*8\b\u000b\t\u001a0H\u0016͌\u0011ŏ{\f@/\u0001\u001cJV\u001bM\u001d\u001a@\u0007N$\u000f tg|9Xpk>G#1nRR5eH|{\u0014VX5\u0015\u000faL4Ë;5#/\u001c\u0007\u0015cs?1Q:I\u0013{?-;K\u0004Wdm.([,\u0018\u001bk\t>\\3h\u0011\u00105CgcyiT)@\t\n'T\u0004<\u001dWL<E2f6'yu;_Nk\u001adR\u0002\u000bad,S\u0014y+\u0002!tmy;Gk}\u0001M\u0013,A\u0019nOx\u001b\u000e1!)T\u0010Q_R\u0017׃Jݳ\u000eYEЧT\u007fp\rB\u0004^S6sɨ\u00152/'=hG1qw\u0010L\\g%\n7èUׂVHH̎?\"E2!\f\tM;ʐmÏXX4Ҋ\u001e(b\r\u0016\bA'3ɿ>Ƽ)\u0010Vи9{x\\u\f;.\u0015G\u0010n*\u000e.ޮjۋ9Qk߄2^\u0005\u0016W<\u0011\b/٫Dΐ\u0010Zd̥Ϙ6g"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]yj\u0015]/z\ta/${U;\u001d\b\u0002", "", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", ">da:\\:LW#\bh^9\u000e\r-e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wXCHs8,#lkB\u0015-\u0017N\u0004/KZ\\0f[`=!#^\fN\u0001", "Ah]4_,,W!lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0017P2\rr]I\u0012nQH#\u0006,\u001f", "Ah\\ X9OW\u0017~", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016<+\u001a\u0016]?$D", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEt:\u0001-~V\u0002*5i%,P\r7t3+\u001fl`\u0003\u0005m4V\u00010UKTuZ\\\u007f=]\u0002i\u0012U9bkWK,8A;)\u0006(X\u007f>2~\u0013\u001a\u000e>y:>_\u000fT\u0004\u0019t\u000b7gL#]\u0004TA\u000fm*q\u0014c+j>D-\";\u0004\u001buX2\u0018\nW\u001b{@ytxK\u0017z\u000e\u000b<wc\u0010Bs_:p6\u001dNEu\u00196X}:>)\r37@h\u0004\u0015u\u0017D(v\u001f3cA%5:F\u001c\tIm|s>\fw)n\u0016Wp99wat_\u0012|\u000bf\u0019b5Oc\t%R\u0013OMm\u0015|-|LcC\u0012\r\u0011\"itGFdR\b\u001epM1)\r\f\u0002s\" -_KX\u00152(i>T\u0013\u0007w<\u0016\u0005#A\u001fwO\u0010kZ|he92:\u0001oE0/\u0015*zZ1o\u001d'8~\u000bT`d", "6`b\u001dX9FW'\r~h5", "", "5dc\u0015T:)S&\u0007~l:\u0001\u00138", "u(I", "AtQ@V9B^(\u0003\u0005g\u0014x\u0012+g\u007f5", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qiP}%\u0015Ts\u0019Kz/>Ay)3o\u0016;#", "1n[9X*M;)\u0006\nb\u001a\u0001\u0011\u000ea\u000f$cJ\u007f\u0017\u001e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]yj\u0015]/z\ta  }@\u001f)\u0007,PW", "1n[9X*M;)\u0006\nb\u001a\u0001\u0011\u0013n\u00012", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016-'\u001c\u0001AK#nK\r", "5dc\u001aV*,b&", "", "7mU<", "\u001a`]1e6BRb\u000eze,\b\f9n\u0014qiP}%\u0015Ts\u0019Kz/>=\u0007!AC", "5dc\u001aa*,b&", "5dc \\4\"\\\u001a\tab:\f", "5dc!b;:Z\u0007\u0003\u0003<6\r\u0012>", "", "5dc!b;:Z\u0007\u0003\u0003L0\u0012\t", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class MultiSimService {
    private final Application application;
    private final PermissionService permissionService;
    private final SimService simService;
    private final SingleSimService singleSimService;
    private SubscriptionManager subscriptionManager;
    private final Utils utils;

    public MultiSimService(Application application, Utils utils, PermissionService permissionService, SingleSimService singleSimService, SimService simService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(permissionService, "permissionService");
        Intrinsics.checkNotNullParameter(singleSimService, "singleSimService");
        Intrinsics.checkNotNullParameter(simService, "simService");
        this.application = application;
        this.utils = utils;
        this.permissionService = permissionService;
        this.singleSimService = singleSimService;
        this.simService = simService;
        if (utils.isVersionGreaterOrEqualTo(22)) {
            Object systemService = application.getSystemService("telephony_subscription_service");
            this.subscriptionManager = systemService instanceof SubscriptionManager ? (SubscriptionManager) systemService : null;
        }
    }

    private final List<SimDataModel> collectMultiSimInfo() {
        ArrayList arrayList = new ArrayList();
        SubscriptionManager subscriptionManager = this.subscriptionManager;
        if (subscriptionManager != null) {
            for (SubscriptionInfo info : subscriptionManager.getActiveSubscriptionInfoList()) {
                String string = info.getCarrierName().toString();
                String countryIso = info.getCountryIso();
                Intrinsics.checkNotNullExpressionValue(info, "info");
                String mccStr = getMccStr(info);
                String mncStr = getMncStr(info);
                SimService simService = this.simService;
                Intrinsics.checkNotNullExpressionValue(countryIso, "countryIso");
                arrayList.add(simService.buildSimDataModel(string, countryIso, mccStr, mncStr, false));
            }
        }
        return arrayList;
    }

    private final String getMccStr(SubscriptionInfo subscriptionInfo) {
        if (!this.utils.isVersionGreaterOrEqualTo(29)) {
            return String.valueOf(subscriptionInfo.getMcc());
        }
        String mccString = subscriptionInfo.getMccString();
        return mccString == null ? "-1" : mccString;
    }

    private final String getMncStr(SubscriptionInfo subscriptionInfo) {
        if (!this.utils.isVersionGreaterOrEqualTo(29)) {
            return String.valueOf(subscriptionInfo.getMnc());
        }
        String mncString = subscriptionInfo.getMncString();
        return mncString == null ? "-1" : mncString;
    }

    private final List<SimDataModel> getSimInfoList() {
        return getHasPermission() ? collectMultiSimInfo() : CollectionsKt.mutableListOf(this.singleSimService.collectSimDataModel(false));
    }

    private final int getTotalSimSize() {
        return getHasPermission() ? getTotalSimCount() : this.singleSimService.totalSimCountForSingleInfo();
    }

    public final MultiSimDataModel collectMultiSimDataModel() {
        List<SimDataModel> simInfoList = getSimInfoList();
        return new MultiSimDataModel(this.simService.getSimCardType(getTotalSimSize(), simInfoList.size()), simInfoList);
    }

    public final boolean getHasPermission() {
        return this.utils.isVersionGreaterOrEqualTo(22) && this.subscriptionManager != null && this.permissionService.hasPermission("android.permission.READ_PHONE_STATE", this.application);
    }

    public final int getTotalSimCount() {
        SubscriptionManager subscriptionManager = this.subscriptionManager;
        if (subscriptionManager != null) {
            return subscriptionManager.getActiveSubscriptionInfoCountMax();
        }
        return 0;
    }
}
