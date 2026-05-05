package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
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
/* JADX INFO: compiled from: TopicsManagerImplCommon.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$q$yCAZ \u00138ޛ\u007fN\u0016f/Uj\u000fQ\u000f\u001e\u0016'k߽MU\u0007_Z\"@E\b?aQ AGe\r63&x0أ}\u0005\u0007!r[\u001e~\u0013Cy\u0015B4NzRR;XK܅Ū\n>&\rfsu[NH\u001bfj31\b\u0002B|-&ܶ;ת\fϿù+\r\u0005ofBNFM\u0015S^3\u000b`kW\u0003mu\u0004ݟ'Ӡ&ǢʁwWDiP #+g\r\fs|؛\u0007Ōd\f/˃ՕcMX\u000e.\u000fߧ\u007f\u001f"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+(\u0011n0L\u0005\u000fCUJ.\\_VE\u001f\u00198\u0018V3\u0017\u000e/", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+(\u0011n0L\u0005\u000fCUJ.\\_H", ";S^=\\*L;\u0015\bv`,\n", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6EO\u000b\"\u001bE}W+\u000109W\f\b3v\u00120MP\u0011", "uKP;W9HW\u0018Hv]:|\u0016@i}(\n\n\u0010!\"Km\u001c\u0006e/@]{.\u001fi\u001f*OCHAw\u000f", "1n]CX9M@\u0019\u000b\u000b^:\f", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6EO\u000b\"\u001bE}W\u001ev4$c\t$5{\u0003.YS;yCs", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+\u001b\u0007r\u001bX\u0002+EZ;,hbrK#g", "1n]CX9M@\u0019\u000b\u000b^:\fG+d\u000e\"w?\u000f\u0017$Xs\f<\u0005\u001fBY\u0005 3{\u0016", "1n]CX9M@\u0019\r\u0006h5\u000b\t", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+\u001b\u0007r\u001bX\u0002+EZ;,j]|F\"\u00120", "@db=b5LS", "\u001a`]1e6BRbzyl,\n\u001a3c\u007f6EO\u000b\"\u001bE}W\u001ev4$c\t$5{\u0003.[NEtB\u001ej", "1n]CX9M@\u0019\r\u0006h5\u000b\tma~6u<\u007f%\u0017T\u0001\u0012:v3/f}'7i$.", "5dc!b7BQ'", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005z>)\u0019fo\u0003hc;=\u00012KJ\\\u0019\\^\u0003=\"!0tT5\u001c\f]JmlND)\u0018;M\u000b;vJi \u0017DnyRR\u001fK\u0004\u001eK\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", "5dc!b7BQ'Z\tr5zl8t\u007f5\u0005<\b", "5dc!b7BQ'kzj<|\u0017>", "uKP;W9HW\u0018Hv]:|\u0016@i}(\n\n\u0010!\"Km\u001c\u0006X%DH\b+;k$\u001bMOKkB-jOgC\u0016j0W@%QYX<kV{=\"[8\u0018W:\u0011\u000ei=3rN@tK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class TopicsManagerImplCommon extends TopicsManager {
    private final android.adservices.topics.TopicsManager mTopicsManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 */
    /* JADX INFO: compiled from: TopicsManagerImplCommon.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039|\u007fw\u0006qt\f\u0007u\u0004zy\b\u0012H|\u0001\u0011L\u0001\u0005\u0015\b\u0016\u001b\u000f\n\r\u001cW\u001f\u001b\u001d\u0017\u0012#^\u0006\"$\u001e\u0019*\u0005\u001a(\u001c#\"0\b-1.\u000632366", f = "!;;3,;\u0014'3%*'3\t,.)~*'&'%c (", i = {}, l = {22}, m = "65E&BD>9J{LONLBLC)NRO", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return TopicsManagerImplCommon.getTopics$suspendImpl(TopicsManagerImplCommon.this, null, this);
        }
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    public Object getTopics(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        return getTopics$suspendImpl(this, getTopicsRequest, continuation);
    }

    public TopicsManagerImplCommon(android.adservices.topics.TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r5, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r6, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.AnonymousClass1
            if (r0 == 0) goto L43
            r4 = r7
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r4 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L43
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L49
            java.lang.Object r5 = r4.L$0
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r5 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) r5
            kotlin.ResultKt.throwOnFailure(r3)
        L2a:
            android.adservices.topics.GetTopicsResponse r3 = (android.adservices.topics.GetTopicsResponse) r3
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r0 = r5.convertResponse$ads_adservices_release(r3)
            return r0
        L31:
            kotlin.ResultKt.throwOnFailure(r3)
            android.adservices.topics.GetTopicsRequest r0 = r5.convertRequest$ads_adservices_release(r6)
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r3 = r5.getTopicsAsyncInternal(r0, r4)
            if (r3 != r2) goto L2a
            return r2
        L43:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r4 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r4.<init>(r7)
            goto L16
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(request.getAdsSdkName()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        for (android.adservices.topics.Topic topic : response.getTopics()) {
            arrayList.add(new Topic(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }

    public final Object getTopicsAsyncInternal(android.adservices.topics.GetTopicsRequest getTopicsRequest, Continuation<? super android.adservices.topics.GetTopicsResponse> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.mTopicsManager.getTopics(getTopicsRequest, new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
