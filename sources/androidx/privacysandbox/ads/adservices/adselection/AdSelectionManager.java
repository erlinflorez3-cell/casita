package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.content.Context;
import android.net.Uri;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.ZN;
import yg.ZO;

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
/* JADX INFO: compiled from: AdSelectionManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:&aH\bّYaJ}P\b\bNrs/O`ŏß\u0013\u0006$x3CWV\u0011]@\u0011bF}BKM\u001eA\u007fƃ3ɻ\u0004ړݨ&8\b\nI18N(v)J{\u0010 8Xph[ṠCݾ\u0011ß̧$\u0001,fɤN8PlcQǫ'\u0010"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dyV\u0017J-\r\u0012/", "", "u(E", "@d_<e;\"[$\fzl:\u0001\u00138", "", "@d_<e;\"[$\fzl:\u0001\u00138R\u007f4\f@\u000f&", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018c'RV[;@Z}J\u0014 h\u0012X4y\u0005eQ$|S\r", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005g3,\u0015oa7\u0016g6W@\u0014GWX9k6zH!\u0012h\u001cR5\u0016qYM4nRFtn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "Ad[2V;\u001aR'", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001d{j\u001dL5\u0015\u0005/", "/cB2_,<b\u001d\t\u0004<6\u0006\n3g", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dod\u0017O/\u000fZ", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005g3,\u0015oa7\u0016g6W@\u0003F:N3\\P\u0002A\u001e\u001b8\u0018W,\u0011\u0007/(*xS>#\u0011uG\fHr\u0011\u001b\u001a\u00175x: `\u0019V}\u001e\u0006=8lPb5=.FAs&.\u0013[&^\u0004$!\u0019q\u0017*>", "\u000foX\u007f&\fQbgb\u0003i3", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AdSelectionManager {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final AdSelectionManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object reportImpression(ReportImpressionRequest reportImpressionRequest, Continuation<? super Unit> continuation);

    public abstract Object selectAds(AdSelectionConfig adSelectionConfig, Continuation<? super AdSelectionOutcome> continuation);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AdSelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$q$yCQU\"Ԃ*\t]mog\u0005JbŏK\u000f\u00144\u0001jBI]ތe\u0012\u001dTJģG3coE9vt>ӌ(288\u0002ڎ\t\u001a@H\u0018͌\u0003CY\f\u001a0Fv@S#˟5\u001a@\u0005~-\u00072lk\\6`l\f;ǥ'\u0003wD\u000f2o4\u000bP%F\u0003+˼za,0\tEC\u001b=S1\u000e\u0003_M\u000bWqk\u000e/'o9W}o6\u0007\u000bD\u00199W%]!2#\u0005\u001az\u001a4CUsM`\u000eV\u0007)\n=F\u0012\u001e\u001e-X0=\u001a\u0015\u001a<D;r\u001ch^\u0015vP\u0010|q6E4\u00107;;1e\u007fli-~G\n\r%*3\u0003~!\nf\u001eb%\u001b\u0003\u0004\u007fE\u0018@\u0006V\\\u001fq=\u001c\u001a!f\u00102\u001c0u\u0017u{Y<%=O[g<Qo\u0010b\\g% 'h\u001c\u0001`dX\"\u001d3g.\u0017*rD\u0013\u001c2Ä\u0013҉+Ҋܖ T\u0015\u001dP*.|\u0010<O>@R]\n\u0002j{fPɰmт6ժˇo\u000ee['JCt{\u0010\u0010m'\u0018M]z\u0005\u0007m\tͱJʐ[̥ϒ6Hx4H\bRQ$\u0013`CHʌ6Ϝ5\u0019déȀ\u0003 JA\u0003 މ^\u000e"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dyV\u0017J-\r\u0012\u0018\u001d/r\u0012\u0005~\u001b;\u0018eCs\ba", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dyV\u0017J-\r\u0012/", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";@S X3>Q(\u0003\u0005g\u0014x\u0012+g\u007f5", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E<\u007f%\u0017No\fKz/>#Y\u001f%m\u001d.KR?u=\u0006\u0011q];\u0007p\u0002", "uKP;W9HW\u0018Hv]:|\u0016@i}(\n\n|\u0016%Gv\u000e:\u0006)?bG{6[\u00165MAJo>'|dj5\tc9$:\u0018", "1n]CX9M/\u0018lze,z\u00183o\t\u0006\u0006I\u0002\u001b\u0019", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E<\u007f%\u0017No\fKz/>#Y\u001f%m\u001d.KR?u={\u001fqb=\t9", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dod\u0017O/\u000fZ", "1n]CX9M/\u0018lze,z\u00183o\t\u0016\u007fB\n\u0013\u001eU", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u000b\u001f\u001fQxW\u0018u\u00135`}\u001eFq 7;G=t0%#>", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006Q,Uv%VPX5JVtF\u0010\u0019hc", "1n]CX9M0)\u0013zk:", "", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E>\u000b\u001f\u001fQxW\u0018u\u00145W\u0001\u00046m\u001f=QD?kAs", "0th2e:", "", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006R,Ly\u000bFLW;`Sv=!g", "1n]CX9M>\u0019\fWn@|\u0016\u001di\u00021wG\u000f", "", "1n]CX9M@\u0019\n\u0005k;`\u0011:r\u007f6\nD\u000b \u0004G{\u001e<\u00054", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E<\u007f%\u0017No\fKz/>#j Bw#=1KFx4,#lkBsc8^v5V\"", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018c'RV[;@Z}J\u0014 h\u0012X4y\u0005eQ$|S\r", "1n]CX9M@\u0019\r\u0006h5\u000b\t", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001d{j\u001dL5\u0015\u0005/", "@db=b5LS", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E<\u007f%\u0017No\fKz/>#Y\u001f%m\u001d.KR?u=\b%w_C\u000fc\u0002", "@d_<e;\"[$\fzl:\u0001\u00138", "", "@d_<e;\"[$\fzl:\u0001\u00138R\u007f4\f@\u000f&", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005g3,\u0015oa7\u0016g6W@\u0014GWX9k6zH!\u0012h\u001cR5\u0016qYM4nRFtn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "Ad[2V;\u001aR'", "/cB2_,<b\u001d\t\u0004<6\u0006\n3g", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005g3,\u0015oa7\u0016g6W@\u0003F:N3\\P\u0002A\u001e\u001b8\u0018W,\u0011\u0007/(*xS>#\u0011uG\fHr\u0011\u001b\u001a\u00175x: `\u0019V}\u001e\u0006=8lPb5=.FAs&.\u0013[&^\u0004$!\u0019q\u0017*>", "Ad[2V;\u001aR'b\u0004m,\n\u0012+l", "uKP;W9HW\u0018Hv]:|\u0016@i}(\n\n|\u0016%Gv\u000e:\u0006)?bG{6[\u00165MAJo>'rrj:\u000be\u00025|1VSR5&P|J\u001e\"i\u0012W+\u001bN7K-}H@/\u0004;M\fD>Dr\u001b\nFf:IR\u0019IC~rF)fU/", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Api33Ext4Impl extends AdSelectionManager {
        private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

        public Api33Ext4Impl(android.adservices.adselection.AdSelectionManager mAdSelectionManager) {
            Intrinsics.checkNotNullParameter(mAdSelectionManager, "mAdSelectionManager");
            this.mAdSelectionManager = mAdSelectionManager;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, Jg.Wd("Sq\u0005.1x\b", (short) (Od.Xd() ^ (-20366)), (short) (Od.Xd() ^ (-240))));
            Object[] objArr = {android.adservices.adselection.AdSelectionManager.class};
            Method method = Class.forName(ZO.xd("Shbt`&.\u001b3ix\u0001>\u0010CtFANiP\u0015[", (short) (C1607wl.Xd() ^ 23482), (short) (C1607wl.Xd() ^ 3265))).getMethod(Ig.wd("o\u001d*e,Py\u000bO&B%YJD!", (short) (Od.Xd() ^ (-24373))), Class.forName(C1626yg.Ud("<\u0007`\t\u001eb\u0006\r#T\"\u000b\u000b\u0004}", (short) (ZN.Xd() ^ 20165), (short) (ZN.Xd() ^ 16788))));
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                Intrinsics.checkNotNullExpressionValue(objInvoke, EO.Od("\u0014O<+{S{=M\u0010!YJ:o;o[&[\u00161\r\u0013쩗RZ\u0014v7c8\r*(]$VweayLJ)=\"i{-", (short) (Od.Xd() ^ (-26953))));
                this((android.adservices.adselection.AdSelectionManager) objInvoke);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig r6, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                if (r0 == 0) goto L48
                r4 = r7
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r4 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1) r4
                int r0 = r4.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = (-1) - r0
                int r0 = (-1) - r2
                r1 = r1 | r0
                int r0 = (-1) - r1
                if (r0 == 0) goto L48
                int r0 = r4.label
                int r0 = r0 - r2
                r4.label = r0
            L19:
                java.lang.Object r3 = r4.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L34
                if (r0 != r1) goto L4e
                java.lang.Object r0 = r4.L$0
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl) r0
                kotlin.ResultKt.throwOnFailure(r3)
            L2d:
                android.adservices.adselection.AdSelectionOutcome r3 = (android.adservices.adselection.AdSelectionOutcome) r3
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r0 = r0.convertResponse(r3)
                return r0
            L34:
                kotlin.ResultKt.throwOnFailure(r3)
                android.adservices.adselection.AdSelectionConfig r0 = r5.convertAdSelectionConfig(r6)
                r4.L$0 = r5
                r4.label = r1
                java.lang.Object r3 = r5.selectAdsInternal(r0, r4)
                if (r3 != r2) goto L46
                return r2
            L46:
                r0 = r5
                goto L2d
            L48:
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r4 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                r4.<init>(r5, r7)
                goto L19
            L4e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private final android.adservices.adselection.AdSelectionConfig convertAdSelectionConfig(AdSelectionConfig adSelectionConfig) {
            android.adservices.adselection.AdSelectionConfig adSelectionConfigBuild = new AdSelectionConfig.Builder().setAdSelectionSignals(convertAdSelectionSignals(adSelectionConfig.getAdSelectionSignals())).setCustomAudienceBuyers(convertBuyers(adSelectionConfig.getCustomAudienceBuyers())).setDecisionLogicUri(adSelectionConfig.getDecisionLogicUri()).setSeller(AdTechIdentifier.fromString(adSelectionConfig.getSeller().getIdentifier())).setPerBuyerSignals(convertPerBuyerSignals(adSelectionConfig.getPerBuyerSignals())).setSellerSignals(convertAdSelectionSignals(adSelectionConfig.getSellerSignals())).setTrustedScoringSignalsUri(adSelectionConfig.getTrustedScoringSignalsUri()).build();
            Intrinsics.checkNotNullExpressionValue(adSelectionConfigBuild, "Builder()\n              …\n                .build()");
            return adSelectionConfigBuild;
        }

        private final AdSelectionSignals convertAdSelectionSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            AdSelectionSignals adSelectionSignalsFromString = AdSelectionSignals.fromString(adSelectionSignals.getSignals());
            Intrinsics.checkNotNullExpressionValue(adSelectionSignalsFromString, "fromString(request.signals)");
            return adSelectionSignalsFromString;
        }

        private final List<AdTechIdentifier> convertBuyers(List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> it = list.iterator();
            while (it.hasNext()) {
                AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(it.next().getIdentifier());
                Intrinsics.checkNotNullExpressionValue(adTechIdentifierFromString, "fromString(buyer.identifier)");
                arrayList.add(adTechIdentifierFromString);
            }
            return arrayList;
        }

        private final Map<AdTechIdentifier, AdSelectionSignals> convertPerBuyerSignals(Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> map) {
            AdSelectionSignals adSelectionSignalsConvertAdSelectionSignals;
            HashMap map2 = new HashMap();
            for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : map.keySet()) {
                AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
                Intrinsics.checkNotNullExpressionValue(adTechIdentifierFromString, "fromString(key.identifier)");
                if (map.get(adTechIdentifier) != null) {
                    androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals = map.get(adTechIdentifier);
                    Intrinsics.checkNotNull(adSelectionSignals);
                    adSelectionSignalsConvertAdSelectionSignals = convertAdSelectionSignals(adSelectionSignals);
                } else {
                    adSelectionSignalsConvertAdSelectionSignals = null;
                }
                map2.put(adTechIdentifierFromString, adSelectionSignalsConvertAdSelectionSignals);
            }
            return map2;
        }

        private final AdSelectionOutcome convertResponse(android.adservices.adselection.AdSelectionOutcome adSelectionOutcome) {
            long adSelectionId = adSelectionOutcome.getAdSelectionId();
            Uri renderUri = adSelectionOutcome.getRenderUri();
            Intrinsics.checkNotNullExpressionValue(renderUri, "response.renderUri");
            return new AdSelectionOutcome(adSelectionId, renderUri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest reportImpressionRequest) {
            return new android.adservices.adselection.ReportImpressionRequest(reportImpressionRequest.getAdSelectionId(), convertAdSelectionConfig(reportImpressionRequest.getAdSelectionConfig()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, Continuation<? super android.adservices.adselection.AdSelectionOutcome> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mAdSelectionManager.selectAds(adSelectionConfig, new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        public Object reportImpression(ReportImpressionRequest reportImpressionRequest, Continuation<? super Unit> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mAdSelectionManager.reportImpression(convertReportImpressionRequest(reportImpressionRequest), new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AdSelectionManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dyV\u0017J-\r\u0012\u0018\u001f.vO3(\f6RW", "", "u(E", "=ac.\\5", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dyV\u0017J-\r\u0012/", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdSelectionManager obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }
}
