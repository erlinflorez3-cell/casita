package androidx.privacysandbox.ads.adservices.adid;

import android.content.Context;
import androidx.core.os.OutcomeReceiverKt;
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
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.Xg;
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
/* JADX INFO: compiled from: AdIdManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$26\u000eј\u0005oi0rd\u0001.VXj\u0014qڔČ([2q\fJc\u001b\u0016\"7Q\u0015˜&ŪIҙŲG\u000f\u0014\u0019ёj.QU~tܱ\u00138"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7j8\u001d^D`\u001d\u0006K(Wr)GY$", "", "u(E", "5dc\u000eW\u0010=", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7j8\u001d^D`\u001d\u00069", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "\u000foX\u007f&\fQbgb\u0003i3", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AdIdManager {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final AdIdManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object getAdId(Continuation<? super AdId> continuation);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AdIdManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fs{:&a%\bّkUH|b\u0016Ubwk|Jr\u000bq\u0010و\u001axx.\n`\ta \u0012JB\u001eCݯQoK>)\u0003D\u000b82P?*\t\u000f\"BH>\u007fAC\u0014\u001b :XphYS˷Cݾ\u0011ß̧$\u0001,g0]DT\u0005]h8iɉ(ƢMϋۢ4|[\u0018\u0017`5\u0010\u000faL/\u0017ʽ7չ)S\u000bޗѻ[A\u000b?wTބl4"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7j8\u001d^D`\u001d\u0006K(Wr)GY\r\bgV@\u000bs%i\\23\u0018\f/", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7j8\u001d^D`\u001d\u0006K(Wr)GY$", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";@S\u0016W\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E<\u007f\u001b\u0016\u0011K\r u\r1by\"7zk", "uKP;W9HW\u0018Hv]:|\u0016@i}(\n\n|\u0016\u001bF9i;Z$\u001dU\u0007\u001c9m#\u0004\u00114", "1n]CX9M@\u0019\r\u0006h5\u000b\t", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7j8\u001d^D`\u001d\u00069", "@db=b5LS", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6E<\u007f\u001b\u0016\u0011K\r uz", "5dc\u000eW\u0010=", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "5dc\u000eW\u0010=/'\u0013\u0004\\\u0010\u0006\u0018/r\t$\u0003", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Api33Ext4Impl extends AdIdManager {
        private final android.adservices.adid.AdIdManager mAdIdManager;

        public Api33Ext4Impl(android.adservices.adid.AdIdManager mAdIdManager) {
            Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
            this.mAdIdManager = mAdIdManager;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, hg.Vd("4?=B2D?", (short) (C1580rY.Xd() ^ (-21230)), (short) (C1580rY.Xd() ^ (-2413))));
            Object[] objArr = {android.adservices.adid.AdIdManager.class};
            Method method = Class.forName(C1561oA.ud("@LANJC=\u0006:ECH8@E}\u0012=;@0B=", (short) (C1580rY.Xd() ^ (-32600)))).getMethod(C1561oA.Yd("A@P0WRTFO6IW\\PKN", (short) (C1580rY.Xd() ^ (-30690))), Class.forName(C1561oA.yd("J@XB\nG?KO\u0015-UEVY", (short) (Od.Xd() ^ (-22352)))));
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                Intrinsics.checkNotNullExpressionValue(objInvoke, Xg.qd("\u0001\u000e\u000e\u0015\u0007\u001b\u0018R\r\f\u001c{#\u001e \u0012\u001b\u0002\u0015#(\u001c\u0017\u001aᙯp\u001b%\u001b./j( 6\"Kbcdefghijklmw", (short) (OY.Xd() ^ 27181), (short) (OY.Xd() ^ 25724)));
                this((android.adservices.adid.AdIdManager) objInvoke);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
        @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object getAdId(kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adid.AdId> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                if (r0 == 0) goto L41
                r4 = r6
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r4 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1) r4
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
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl) r0
                kotlin.ResultKt.throwOnFailure(r3)
            L2a:
                android.adservices.adid.AdId r3 = (android.adservices.adid.AdId) r3
                androidx.privacysandbox.ads.adservices.adid.AdId r0 = r0.convertResponse(r3)
                return r0
            L31:
                kotlin.ResultKt.throwOnFailure(r3)
                r4.L$0 = r5
                r4.label = r0
                java.lang.Object r3 = r5.getAdIdAsyncInternal(r4)
                if (r3 != r2) goto L3f
                return r2
            L3f:
                r0 = r5
                goto L2a
            L41:
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r4 = new androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                r4.<init>(r5, r6)
                goto L16
            L47:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl.getAdId(kotlin.coroutines.Continuation):java.lang.Object");
        }

        private final AdId convertResponse(android.adservices.adid.AdId adId) {
            String adId2 = adId.getAdId();
            Intrinsics.checkNotNullExpressionValue(adId2, "response.adId");
            return new AdId(adId2, adId.isLimitAdTrackingEnabled());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object getAdIdAsyncInternal(Continuation<? super android.adservices.adid.AdId> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.mAdIdManager.getAdId(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    /* JADX INFO: compiled from: AdIdManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7j8\u001d^D`\u001d\u0006K(Wr)GY\r\nfZ}9\u001d\u0016d\u0017$", "", "u(E", "=ac.\\5", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7j8\u001d^D`\u001d\u0006K(Wr)GY$", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdIdManager obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }
}
