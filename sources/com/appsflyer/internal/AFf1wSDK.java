package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1rSDK;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLc\u0003\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNog\u0005Jb\u000bI\u0010\u000e\u0016\u0007q4I[|e\u0012\u001d;JoEBStSʠ\u0011zF\u000702P8(\u0004Ae:L\u001ex\u0013Cy\r\"4NtRR;P\u0015\u001e \fV /#lk\\>`l\fA?'\u0011sZNUh@\u0001[\u0019^TU\u0018\u0007s$+NFM!5U\u0013\u0007\u0001iO\u0005Oqk\u0005\u00174ݳ/KygDiH!#>g\r\f\u0005lnԇUb\u0012:9c,X^#@w)\nSOǬ\u0012\b-]<Cbs\u0016%Kt!S\u0007bؿbD\u0006\u0012oN_2\u000eMC9I\u007f\u0018sޅ\u001dP=\u0016\u0013(n5\u000f\r9[\u0003\u0011\u0017\u0019qƠyΦ5UH?Nj\u0018v\u000e\u007f\u0012\u000bz\u0002X\u000bfKV\u0083} 2\u001b-9aX1A<\u0014VW\u007fv3a\u001fW@ɵJغ&r\u001e90*\u001a|\u0015v\u0013\u0003hT\u00075GQrΉ\tą\f\u0017(^}_/I``]}\u0002j{b@)\u0006ϑ9֍ro\u0016Y?\u0004A[\"\u0002\u001e\u0001j\u0003$ALb3fvDc\f\t\\V/hLAݠyԞHR\u0014\u00158f\u007fD\u0005>?5t\u0015v\u000eTF\u0018ҙ\u000bރ^l\u0018\u0001Z\\2-"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000f\b\t\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b~\u0013\u0014?S", "", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b\u0004\u0013\u0014?S", ">/", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", ">0", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", ">1", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\by\u0013\u0014?S", ">2", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\b\u007f\u0013\u0014?S", ">3", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000f\bv\u0013\u0014?S", ">4", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b\u0007\u0013\u0014?S", ">5", "\nh]6g\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn<B2#8cu\u001er\u0012?I\rKz8%^fkB\u0005s9[v0V\u0016.?\\P\u0003L\u001e\u001f0tL5\u0015NUL/|E>3\b9\u0013\u0006Dw\u0001\u0019\u001f\n<4L#T[Qgs[\u0017\u0010fPa)uRLSc1x\flf`CI$!z\u0015\"2,\u000f\bGV~Q8ONeQ!D4/I{\\MYob\u0006x0.K\t\u0001\u000e9\"P\fvx\r\"\t\u001c:kIq \bZ\u0004 :]H;&C\u0006\u0017HZc\u0003u:\u00152zB\tYb#\u0010~;LiR\u001e\u000ea %:rgJ8b\u000f<Xs\u001f0TH#k\u0003\u0013\u0018\u000b.v1\u001f\u0007\f", "", "\u000fE01E,OS\"\u000fz=(\f\u0005", "u(9", "5dc\u001fX=>\\)~", "u(;0b4\bO$\n\t_3\u0011\t</\u00041\u000b@\u000e \u0013N9i\u001dvpEG\\\u0006\r", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "u(E", "", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "u(I", "1n\\=b5>\\(L", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "1n\\=b5>\\(M", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\by\u0013\u0014?S", "1n\\=b5>\\(K", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b\u0004\u0013\u0014?S", "/qT\u000e_3\u001fW\u0019\u0006yl\u001dx\u00103d", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0010\b\u007f\u0013\u0014?S", "1n\\=b5>\\(J", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", "3pd._:", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0001/", "BnBAe0GU", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000f\bv\u0013\u0014?S"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFf1wSDK extends AFe1mSDK<Unit> {
    public AFg1nSDK areAllFieldsValid;
    public AFc1oSDK component1;
    public AFe1rSDK component2;
    public Executor component3;
    public AFc1hSDK component4;
    public Function1<AFe1uSDK, Unit> equals;
    public AFf1eSDK toString;

    public static final class AFa1uSDK implements OutcomeReceiver<Object, Exception> {
        private /* synthetic */ Ref.ObjectRef<AFe1uSDK> AFAdRevenueData;
        private /* synthetic */ CountDownLatch getCurrencyIso4217Code;
        private /* synthetic */ AFf1wSDK getRevenue;

        AFa1uSDK(Ref.ObjectRef<AFe1uSDK> objectRef, CountDownLatch countDownLatch, AFf1wSDK aFf1wSDK) {
            this.AFAdRevenueData = objectRef;
            this.getCurrencyIso4217Code = countDownLatch;
            this.getRevenue = aFf1wSDK;
        }

        @Override // android.os.OutcomeReceiver
        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1wSDK.getMediationNetwork(exc);
            this.getCurrencyIso4217Code.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1uSDK] */
        @Override // android.os.OutcomeReceiver
        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.AFAdRevenueData.element = AFe1uSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.getCurrencyIso4217Code.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFf1wSDK(AFe1rSDK aFe1rSDK, Executor executor, AFc1oSDK aFc1oSDK, AFc1hSDK aFc1hSDK, AFg1nSDK aFg1nSDK, AFf1eSDK aFf1eSDK, Function1<? super AFe1uSDK, Unit> function1) {
        super(AFe1pSDK.REGISTER_TRIGGER, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.component2 = aFe1rSDK;
        this.component3 = executor;
        this.component1 = aFc1oSDK;
        this.component4 = aFc1hSDK;
        this.areAllFieldsValid = aFg1nSDK;
        this.toString = aFf1eSDK;
        this.equals = function1;
        if (aFe1rSDK instanceof AFe1rSDK.AFa1tSDK) {
            this.AFAdRevenueData.add(AFe1pSDK.CONVERSION);
        }
        if (this.component2 instanceof AFe1rSDK.AFa1uSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        }
        if (this.component2 instanceof AFe1rSDK.AFa1zSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.INAPP);
        }
    }

    public static final /* synthetic */ void getMediationNetwork(Throwable th) {
        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFe1uSDK aFe1uSDK = this.getMonetizationNetwork;
        if (aFe1uSDK != null) {
            this.equals.invoke(aFe1uSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1uSDK] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, com.appsflyer.internal.AFe1uSDK] */
    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1uSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.component4.getMonetizationNetwork;
            if (context != null) {
                Class<?> cls = Class.forName(C1561oA.Kd("UcZigb^)_llseov1Gtt{m\u0002~", (short) (C1499aX.Xd() ^ (-14023))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (C1607wl.Xd() ^ 691);
                short sXd2 = (short) (C1607wl.Xd() ^ 17583);
                int[] iArr = new int["^8qxR}F F)BH,\u0007\u001f".length()];
                QB qb = new QB("^8qxR}F F)BH,\u0007\u001f");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                Object[] objArr = {MeasurementManager.class};
                Method method = cls.getMethod(C1561oA.Xd("\"!1\u0011835'0\u0017*8=1,/", (short) (FB.Xd() ^ 22777)), clsArr);
                try {
                    method.setAccessible(true);
                    MeasurementManager measurementManager = (MeasurementManager) method.invoke(context, objArr);
                    if (measurementManager != null) {
                        new AFj1cSDK(this.component1, null, 2, 0 == true ? 1 : 0);
                        Uri.Builder builderBuildUpon = Uri.parse(AFj1cSDK.getMediationNetwork()).buildUpon();
                        String strAreAllFieldsValid = this.component1.areAllFieldsValid();
                        if (strAreAllFieldsValid == null) {
                            strAreAllFieldsValid = "";
                        }
                        Pair[] pairArr = new Pair[8];
                        pairArr[0] = TuplesKt.to(Wg.vd("\\lZboYgYlc", (short) (FB.Xd() ^ 22831)), this.component2.getRevenue);
                        String strKd = Qg.kd("1?>,5/", (short) (C1607wl.Xd() ^ 9592), (short) (C1607wl.Xd() ^ 15397));
                        Context context2 = this.component1.getCurrencyIso4217Code.getMonetizationNetwork;
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(hg.Vd("\u001f+ -)\"\u001cd\u0019$\"'\u0017\u001f$\\p\u001c\u001a\u001f\u000f!\u001c", (short) (C1607wl.Xd() ^ 26122), (short) (C1607wl.Xd() ^ 18051))).getMethod(C1561oA.ud("63A\u001c,-4).+\u0013%0'", (short) (C1633zX.Xd() ^ (-15047))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            pairArr[1] = TuplesKt.to(strKd, (String) method2.invoke(context2, objArr2));
                            short sXd3 = (short) (C1633zX.Xd() ^ (-21611));
                            int[] iArr2 = new int["!1.\u001e2\",.!($".length()];
                            QB qb2 = new QB("!1.\u001e2\",.!($");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                                i3++;
                            }
                            pairArr[2] = TuplesKt.to(new String(iArr2, 0, i3), this.component1.n_().versionName);
                            pairArr[3] = TuplesKt.to(C1561oA.Yd("D6>3K;IKBII", (short) (FB.Xd() ^ 22891)), AFc1oSDK.getMonetizationNetwork());
                            pairArr[4] = TuplesKt.to(Xg.qd("O_YPhXfh_ff", (short) (C1499aX.Xd() ^ (-6180)), (short) (C1499aX.Xd() ^ (-4162))), AFc1oSDK.getCurrencyIso4217Code());
                            pairArr[5] = TuplesKt.to(Jg.Wd("%SRV0\u001c%^l", (short) (C1633zX.Xd() ^ (-28852)), (short) (C1633zX.Xd() ^ (-3801))), String.valueOf(this.areAllFieldsValid.getCurrencyIso4217Code()));
                            pairArr[6] = TuplesKt.to(ZO.xd("OkFI~\u0019:\u0016p\u007f", (short) (Od.Xd() ^ (-8432)), (short) (Od.Xd() ^ (-28144))), AFc1oSDK.getMediationNetwork());
                            pairArr[7] = TuplesKt.to(C1626yg.Ud("1~[6", (short) (Od.Xd() ^ (-18687)), (short) (Od.Xd() ^ (-6202))), strAreAllFieldsValid);
                            Map mapMutableMapOf = MapsKt.mutableMapOf(pairArr);
                            String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component1.getMediationNetwork);
                            if (currencyIso4217Code != null) {
                                mapMutableMapOf.put(Ig.wd("F|nQDjY,m\u0011\u00176", (short) (C1580rY.Xd() ^ (-26598))), currencyIso4217Code);
                            }
                            Long monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork();
                            if (monetizationNetwork != null) {
                                mapMutableMapOf.put(EO.Od("c0\tp(_i7\u0017\u001e\"6", (short) (OY.Xd() ^ 8773)), String.valueOf(monetizationNetwork.longValue()));
                            }
                            AFe1rSDK aFe1rSDK = this.component2;
                            if (aFe1rSDK instanceof AFe1rSDK.AFa1zSDK) {
                                Float f2 = ((AFe1rSDK.AFa1zSDK) aFe1rSDK).getCurrencyIso4217Code;
                                if (f2 != null) {
                                    float fFloatValue = f2.floatValue();
                                    short sXd4 = (short) (C1633zX.Xd() ^ (-13134));
                                    int[] iArr3 = new int["iygot^pbr`hn]".length()];
                                    QB qb3 = new QB("iygot^pbr`hn]");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                                        i4++;
                                    }
                                    mapMutableMapOf.put(new String(iArr3, 0, i4), String.valueOf(fFloatValue));
                                }
                                Integer num = ((AFe1rSDK.AFa1zSDK) this.component2).AFAdRevenueData;
                                if (num != null) {
                                    mapMutableMapOf.put(C1593ug.zd("PbR\\cOTahbi", (short) (OY.Xd() ^ 3281), (short) (OY.Xd() ^ 10892)), String.valueOf(num.intValue()));
                                }
                            }
                            for (Map.Entry entry : mapMutableMapOf.entrySet()) {
                                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                            }
                            Uri uriBuild = builderBuildUpon.build();
                            Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                            measurementManager.registerTrigger(uriBuild, this.component3, new AFa1uSDK(objectRef, countDownLatch, this));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            objectRef.element = AFe1uSDK.TIMEOUT;
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PRIVACY_SANDBOX;
            String message = th.getMessage();
            short sXd5 = (short) (FB.Xd() ^ 17959);
            int[] iArr4 = new int["w$#\u001f!M\u001c\u000f\u000e\u001f\u001b\u001a\f\n^C".length()];
            QB qb4 = new QB("w$#\u001f!M\u001c\u000f\u000e\u001f\u001b\u001a\f\n^C");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(sXd5 + sXd5 + i5 + xuXd4.CK(iKK4));
                i5++;
            }
            aFLogger.e(aFg1cSDK, new String(iArr4, 0, i5) + message, th, false, false, false, true);
        }
        return (AFe1uSDK) objectRef.element;
    }
}
