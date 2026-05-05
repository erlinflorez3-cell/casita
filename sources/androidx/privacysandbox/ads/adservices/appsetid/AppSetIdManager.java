package androidx.privacysandbox.ads.adservices.appsetid;

import android.content.Context;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

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
/* JADX INFO: compiled from: AppSetIdManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$26\u000eј\u0005oi0rd\u0001.VXj\u0014qڔČ([2q\fJc\u001b\u0016\"7Q\u0015˛&ŪIҙŲG\u000f\u0014\u0019ёj.QU~tܱ\u00138"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7v?,\u0015we8P?7Yd'V0M\u0014X[n?\u0014\u001f0", "", "u(E", "5dc\u000ec7,S(by", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7v?,\u0015we8P?7Yd'V0M\u0002", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "\u000foX\u007f&\fQbgb\u0003i3", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AppSetIdManager {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final AppSetIdManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object getAppSetId(Continuation<? super AppSetId> continuation);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AppSetIdManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:&a%\bّkUH|b\u0016Ubwk|Jr\u000bq\u0010و\u001axx.\n`\ta \u0012JB\u001eCݯQoK>)\u0003D\u000b82P?*\t\u000f\"BH>\u007fAC\u0014\u001b :XphYS˷Cݾ\u0011ß̧$\u0001,g0]DT\u0005]h8iɈ(ƢMϋۢ4|[\u0018\u0017`5\u0010\u000faL/\u0017ʽ7չ)S\u000bޗѻ[A\u000b?wTބl4"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7v?,\u0015we8P?7Yd'V0M\u0014X[n?\u0014\u001f\u0019iY/ZR9T3=(?*\u000f\u0002", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7v?,\u0015we8P?7Yd'V0M\u0014X[n?\u0014\u001f0", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";@_=F,M7\u0018fvg(~\t<", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E<\f\"%G~\u0012;@\u0001@dk FQ\u0015\u0016IL7m4+j", "uKP;W9HW\u0018Hv]:|\u0016@i}(\n\n|\"\"Uo\u001d@un\u0011d\t\u000e7|y-5?Dg6\u001e\">%*", "1n]CX9M@\u0019\r\u0006h5\u000b\t", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7v?,\u0015we8P?7Yd'V0M\u0002", "@db=b5LS", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E<\f\"%G~\u0012;@\u0001@dk FQ\u0015\u0004", "5dc\u000ec7,S(by", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "5dc\u000ec7,S(by::\u0011\u0012-I\t7{M\n\u0013\u001e", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Api33Ext4Impl extends AppSetIdManager {
        private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

        public Api33Ext4Impl(android.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
            Intrinsics.checkNotNullParameter(mAppSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = mAppSetIdManager;
        }

        public Api33Ext4Impl(Context context) throws Throwable {
            short sXd = (short) (FB.Xd() ^ 23552);
            int[] iArr = new int["\u0015 \u001e#\u0013% ".length()];
            QB qb = new QB("\u0015 \u001e#\u0013% ");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
            Object[] objArr = {android.adservices.appsetid.AppSetIdManager.class};
            Method method = Class.forName(C1593ug.zd("DRIXVQM\u0018N[[bT^e 6ccj\\pm", (short) (C1580rY.Xd() ^ (-19881)), (short) (C1580rY.Xd() ^ (-13739)))).getMethod(C1561oA.Kd("~}\u000em\u0015\u0010\u0012\u0004\rs\u0007\u0015\u001a\u000e\t\f", (short) (Od.Xd() ^ (-10137))), Class.forName(C1561oA.od("5+?)t2&2*o\u0004, 10", (short) (FB.Xd() ^ 19495))));
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                short sXd2 = (short) (OY.Xd() ^ 13646);
                short sXd3 = (short) (OY.Xd() ^ 23934);
                int[] iArr2 = new int["Am5\u0011\n}Q\u0013%x\u0018O=_)gHF0\u0006\u001ar5O鱰L\u000e\\*\\$7;X>r1 w\u0006N8>\u0017f|U\u001fu\u001f".length()];
                QB qb2 = new QB("Am5\u0011\n}Q\u0013%x\u0018O=_)gHF0\u0006\u001ar5O鱰L\u000e\\*\\$7;X>r1 w\u0006N8>\u0017f|U\u001fu\u001f");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i3++;
                }
                Intrinsics.checkNotNullExpressionValue(objInvoke, new String(iArr2, 0, i3));
                this((android.adservices.appsetid.AppSetIdManager) objInvoke);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
        @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object getAppSetId(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetId> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1
                if (r0 == 0) goto L41
                r4 = r6
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1 r4 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                int r0 = r2 + r1
                r2 = r2 | r1
                int r0 = r0 - r2
                if (r0 == 0) goto L41
                int r0 = r4.label
                int r0 = r0 - r1
                r4.label = r0
            L16:
                java.lang.Object r3 = r4.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r0 = 1
                if (r1 == 0) goto L31
                if (r1 != r0) goto L47
                java.lang.Object r0 = r4.L$0
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl) r0
                kotlin.ResultKt.throwOnFailure(r3)
            L2a:
                android.adservices.appsetid.AppSetId r3 = (android.adservices.appsetid.AppSetId) r3
                androidx.privacysandbox.ads.adservices.appsetid.AppSetId r0 = r0.convertResponse(r3)
                return r0
            L31:
                kotlin.ResultKt.throwOnFailure(r3)
                r4.L$0 = r5
                r4.label = r0
                java.lang.Object r3 = r5.getAppSetIdAsyncInternal(r4)
                if (r3 != r2) goto L3f
                return r2
            L3f:
                r0 = r5
                goto L2a
            L41:
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1 r4 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1
                r4.<init>(r5, r6)
                goto L16
            L47:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl.getAppSetId(kotlin.coroutines.Continuation):java.lang.Object");
        }

        private final AppSetId convertResponse(android.adservices.appsetid.AppSetId appSetId) {
            if (appSetId.getScope() == 1) {
                String id = appSetId.getId();
                Intrinsics.checkNotNullExpressionValue(id, "response.id");
                return new AppSetId(id, 1);
            }
            String id2 = appSetId.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "response.id");
            return new AppSetId(id2, 2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object getAppSetIdAsyncInternal(Continuation<? super android.adservices.appsetid.AppSetId> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mAppSetIdManager.getAppSetId(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    /* JADX INFO: compiled from: AppSetIdManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7v?,\u0015we8P?7Yd'V0M\u0014X[n?\u0014\u001f\u0019kX3\u0018\u0001bE.w\u001a", "", "u(E", "=ac.\\5", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7v?,\u0015we8P?7Yd'V0M\u0014X[n?\u0014\u001f0", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppSetIdManager obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }
}
