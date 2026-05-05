package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import yg.C1499aX;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
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
/* JADX INFO: compiled from: CustomAudienceManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.XU03\u0002ڔR.\f$ BsU#\bb\u000eUȞ˗knXZSZ\u001d\u0007.x\u0019.yY\u0007`*\u000f`F6Шq߲nމ˃dtD\nhI0>\u0012\u0005/\u001cZL\u001ey\u0013Cy\u0013Xػ~ú9ĥҫQ\u0005(\u001aâ>\"\t\u001eb~ߗ:S"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rlUJ pDDt", "", "u(E", "8nX;6<Lb#\u0007Vn+\u0001\t8c\u007f", "", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u00111X0e0\u0003K#\u001cbi^*\u0011\u0005b?$[DC/\b:XW", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005iD,$ri5\u0017b0N\u007f%G\u001636`[PM\"!d\u0016*;\f\tYJ\"n17+\u0018,W\u0011\u0011O\u0007\u0016%\u00159s:@`\u001dQ\n$yJ)v\u00107i\u0003VENr&s\u0010i&2}!)\u0010\u0003\u0015doL7\fE=\u000ewRwv=", ":dPCX\nNa(\t\u0003:<{\r/n}(", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u00113N(mRPM\"!d\u0016*;\f\tYJ\"n17+\u0018,W\u0011\u0011", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005iD,$ri5\u0017b0N\u007f%G\u00165,Xcr\u001b$ i\u0018V\u0007\u001d\u0004]A-lD$\u001f\u0014<I\u0010J>g\u0012 \u001d<ny\fT\u001aT\u0004%\u0005E2hT#=\u0004PPIk:`\u001bc'e\u0010}\u000b\u0019m*\u00172W*\u0013}\u001dzoWyev\u001d", "\u000foX\u007f&\fQbgb\u0003i3", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class CustomAudienceManager {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final CustomAudienceManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, Continuation<? super Unit> continuation);

    public abstract Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation<? super Unit> continuation);

    /* JADX INFO: compiled from: CustomAudienceManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0R\u0004P.hS2şs{J$cҕyCQU\"}8\tWȞog\u0005Jb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JģG3coE9vt>ӌ(288\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f(0H\u0081BR\u001bM\r\u001a\u0018\bD!\u0017Ȧ\rg|5\tycN?'\u0011iZNU`݁\u0001M\u001bH\u00152\u001dzo!C@e9չ)S\u0011\f\u001buM\tWwM\u0007x'U3wz\b@f\t,\u001b;Q\u001d]!0\u000b\f\u0018`T59Z{K~\u001aX{\t\u0005%<2\u001bL'\u0011@;(~\n$2#\u0002\u0004F^\u000bvD\u0016y\u0010F]%HA9J3f\u007fsk\u001d\\J\u0014\u0005;2i\u00017/ii&`C1\u0005{_Di@k_\u0015\n\"K{\u001c\tb0C44U\u0013G{?H]%\u007fmG>9m\u0018Gr\u0004'\u000bnqkkhGn?5\u0016\u007fA\u0017*rD\u0013$\u001cTbkD\u0011{3\u001b\u038d<ު\u0012\u05feϢ{</EXe]\n\u0002j{|:)=yOY\u001d\u0006TûwՍ2̐Ʉg\u0010otG M?z\u0005\u0007j\u0019Ͱ\u000eȺ`(*õʎj\u0012\u007f{Jeܥ\u0017U"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rlUJ pDD]c7MO\tH\u0014\u001bdq=uw\u0018", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rlUJ pDDt", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "1tbAb4\u001ac\u0018\u0003zg*|p+n{*{M", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u0011%&Qw\nLu)5b{ \u0001K&<\\MCGD\u001d\u0019hj7\u0007K(Wr)GY$", "uKP;W9HW\u0018Hv]:|\u0016@i}(\n\n~'%Vy\u00168\u0007$9Y\u0007\u001e77s>[REs\u0010.\u0014laB\u0005c\u0014J\u007f#IL[\u0002 C", "1n]CX9M/\u0018]vm(", "", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u000b\u001f\u001fQxW\u0018u\u00041hyu", "7m_Bg", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006B(]r|", "1n]CX9M/\u0018mz\\/`\b/n\u000f,|D\u0001$", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u000b\u001f\u001fQxW\u0018u\u00145W\u0001\u00046m\u001f=QD?kAs", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006R,Ly\u000bFLW;`Sv=!g", "1n]CX9M0\u001d}yb5~v3g\t$\u0003N", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u000b\u001f\u001fQxW\u0018u\u00135`}\u001eFq 7;G=t0%#>", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006Q,Uv%VPX5JVtF\u0010\u0019hc", "1n]CX9M1)\r\nh4X\u0019.i\u007f1y@", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u0011%&Qw\nLu)5b{ \u0001K&<\\MCGD\u001d\u0019hj7\u00079", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rZ", "1n]CX9M8#\u0003\u0004K,\t\u0019/s\u000f", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u0011%&Qw\nLu)5b{ \u0001R 2V!KyC(\u001dDq8\u000bc5Lv\u0014GX^,jaH", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u00111X0e0\u0003K#\u001cbi^*\u0011\u0005b?$[DC/\b:XW", "1n]CX9M:\u0019z\f^\u0019|\u0015?e\u000e7", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u0011%&Qw\nLu)5b{ \u0001T\u0016*^C\u0019{B-\u001fp=I\u0006g,Wt'4LZ<\\`\u0002\u0013", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u00113N(mRPM\"!d\u0016*;\f\tYJ\"n17+\u0018,W\u0011\u0011", "1n]CX9MB&\u000f\tm,{v3g\t$\u0003N", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u0011%&Qw\nLu)5b{ \u0001\\#>[R;j\u0011\"\u0014geB\tB(]r|", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011;[<jar<p\u0016Y\rR4\u000fcUP D", "8nX;6<Lb#\u0007Vn+\u0001\t8c\u007f", "", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005iD,$ri5\u0017b0N\u007f%G\u001636`[PM\"!d\u0016*;\f\tYJ\"n17+\u0018,W\u0011\u0011O\u0007\u0016%\u00159s:@`\u001dQ\n$yJ)v\u00107i\u0003VENr&s\u0010i&2}!)\u0010\u0003\u0015doL7\fE=\u000ewRwv=", ":dPCX\nNa(\t\u0003:<{\r/n}(", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005iD,$ri5\u0017b0N\u007f%G\u00165,Xcr\u001b$ i\u0018V\u0007\u001d\u0004]A-lD$\u001f\u0014<I\u0010J>g\u0012 \u001d<ny\fT\u001aT\u0004%\u0005E2hT#=\u0004PPIk:`\u001bc'e\u0010}\u000b\u0019m*\u00172W*\u0013}\u001dzoWyev\u001d", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Api33Ext4Impl extends CustomAudienceManager {
        private final android.adservices.customaudience.CustomAudienceManager customAudienceManager;

        public Api33Ext4Impl(android.adservices.customaudience.CustomAudienceManager customAudienceManager) {
            Intrinsics.checkNotNullParameter(customAudienceManager, "customAudienceManager");
            this.customAudienceManager = customAudienceManager;
        }

        public Api33Ext4Impl(Context context) throws Throwable {
            short sXd = (short) (C1499aX.Xd() ^ (-26229));
            int[] iArr = new int["MZZaSgd".length()];
            QB qb = new QB("MZZaSgd");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
            Object[] objArr = {android.adservices.customaudience.CustomAudienceManager.class};
            Method method = Class.forName(Wg.vd("u\u0002z\b\u007fxv?oz|\u0002mu~7Grtyewv", (short) (ZN.Xd() ^ 23250))).getMethod(hg.Vd("}z\tf\f\u0005\u0005t{`q}\u0001rkl", (short) (C1499aX.Xd() ^ (-18952)), (short) (C1499aX.Xd() ^ (-28889))), Class.forName(Qg.kd("&\u001c0\u001ae#\u0017#\u001b`t\u001d\u0011\"!", (short) (C1607wl.Xd() ^ 30371), (short) (C1607wl.Xd() ^ 12641))));
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                short sXd2 = (short) (OY.Xd() ^ 14349);
                int[] iArr2 = new int["\u001c'%*\u001a,'_\u0018\u0015#\u0001&\u001f\u001f\u000f\u0016z\f\u0018\u001b\r\u0006\u0007\ue729Y\u0002\n}\u000f\u000eG\u0003x\rv\u001e3210/.-,+*)(0".length()];
                QB qb2 = new QB("\u001c'%*\u001a,'_\u0018\u0015#\u0001&\u001f\u001f\u000f\u0016z\f\u0018\u001b\r\u0006\u0007\ue729Y\u0002\n}\u000f\u000eG\u0003x\rv\u001e3210/.-,+*)(0");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Intrinsics.checkNotNullExpressionValue(objInvoke, new String(iArr2, 0, i3));
                this((android.adservices.customaudience.CustomAudienceManager) objInvoke);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public final android.adservices.customaudience.JoinCustomAudienceRequest convertJoinRequest(JoinCustomAudienceRequest joinCustomAudienceRequest) {
            android.adservices.customaudience.JoinCustomAudienceRequest joinCustomAudienceRequestBuild = new JoinCustomAudienceRequest.Builder().setCustomAudience(convertCustomAudience(joinCustomAudienceRequest.getCustomAudience())).build();
            Intrinsics.checkNotNullExpressionValue(joinCustomAudienceRequestBuild, "Builder()\n              …\n                .build()");
            return joinCustomAudienceRequestBuild;
        }

        public final android.adservices.customaudience.LeaveCustomAudienceRequest convertLeaveRequest(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            android.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequestBuild = new LeaveCustomAudienceRequest.Builder().setBuyer(convertAdTechIdentifier(leaveCustomAudienceRequest.getBuyer())).setName(leaveCustomAudienceRequest.getName()).build();
            Intrinsics.checkNotNullExpressionValue(leaveCustomAudienceRequestBuild, "Builder()\n              …\n                .build()");
            return leaveCustomAudienceRequestBuild;
        }

        private final android.adservices.customaudience.CustomAudience convertCustomAudience(CustomAudience customAudience) {
            android.adservices.customaudience.CustomAudience customAudienceBuild = new CustomAudience.Builder().setActivationTime(customAudience.getActivationTime()).setAds(convertAdData(customAudience.getAds())).setBiddingLogicUri(customAudience.getBiddingLogicUri()).setBuyer(convertAdTechIdentifier(customAudience.getBuyer())).setDailyUpdateUri(customAudience.getDailyUpdateUri()).setExpirationTime(customAudience.getExpirationTime()).setName(customAudience.getName()).setTrustedBiddingData(convertTrustedSignals(customAudience.getTrustedBiddingSignals())).setUserBiddingSignals(convertBiddingSignals(customAudience.getUserBiddingSignals())).build();
            Intrinsics.checkNotNullExpressionValue(customAudienceBuild, "Builder()\n              …\n                .build()");
            return customAudienceBuild;
        }

        private final List<AdData> convertAdData(List<androidx.privacysandbox.ads.adservices.common.AdData> list) {
            ArrayList arrayList = new ArrayList();
            for (androidx.privacysandbox.ads.adservices.common.AdData adData : list) {
                AdData adDataBuild = new AdData.Builder().setMetadata(adData.getMetadata()).setRenderUri(adData.getRenderUri()).build();
                Intrinsics.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                arrayList.add(adDataBuild);
            }
            return arrayList;
        }

        private final AdTechIdentifier convertAdTechIdentifier(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier) {
            AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
            Intrinsics.checkNotNullExpressionValue(adTechIdentifierFromString, "fromString(input.identifier)");
            return adTechIdentifierFromString;
        }

        private final android.adservices.customaudience.TrustedBiddingData convertTrustedSignals(TrustedBiddingData trustedBiddingData) {
            if (trustedBiddingData == null) {
                return null;
            }
            return new TrustedBiddingData.Builder().setTrustedBiddingKeys(trustedBiddingData.getTrustedBiddingKeys()).setTrustedBiddingUri(trustedBiddingData.getTrustedBiddingUri()).build();
        }

        private final AdSelectionSignals convertBiddingSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            if (adSelectionSignals == null) {
                return null;
            }
            return AdSelectionSignals.fromString(adSelectionSignals.getSignals());
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        public Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, Continuation<? super Unit> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.customAudienceManager.joinCustomAudience(convertJoinRequest(joinCustomAudienceRequest), new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        public Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation<? super Unit> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.customAudienceManager.leaveCustomAudience(convertLeaveRequest(leaveCustomAudienceRequest), new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CustomAudienceManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rlUJ pDD]e6Q\r7q\u0005\u0016\u001fc", "", "u(E", "=ac.\\5", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rlUJ pDDt", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CustomAudienceManager obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }
}
