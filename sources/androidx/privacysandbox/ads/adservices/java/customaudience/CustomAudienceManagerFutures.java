package androidx.privacysandbox.ads.adservices.java.customaudience;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010q Jřy-\"CiTR}*\u0012\u0010Sm˧ĔNZ\u0019CW\u001a$y\u00032YW\t]@\u0012`D CAQ\b=ge;[M4@(P\u007f\u0015\u0003**v\u0013%|sO\u001a\u0016H@\u001fA\u00192̈\t$"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^fqG\u0016m4J\u0007&KLW*\\\u001cPM\"!d\u0016*;\f\tYJ\"n,3(\u0004.I\u000f\u001cx\u0010\u001c#\u000eC@", "", "u(E", "8nX;6<Lb#\u0007Vn+\u0001\t8c\u007f\u0004\nT\n\u0015", "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", "", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u00111X0e0\u0003K#\u001cbi^*\u0011\u0005b?$[DC/\b:XW", ":dPCX\nNa(\t\u0003:<{\r/n}(WN\u0015 \u0015", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u00113N(mRPM\"!d\u0016*;\f\tYJ\"n17+\u0018,W\u0011\u0011", "\u000foX\u007f&\fQbgcvo(`\u0011:l", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000bP4a\u0011$uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class CustomAudienceManagerFutures {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final CustomAudienceManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract ListenableFuture<Unit> joinCustomAudienceAsync(JoinCustomAudienceRequest joinCustomAudienceRequest);

    public abstract ListenableFuture<Unit> leaveCustomAudienceAsync(LeaveCustomAudienceRequest leaveCustomAudienceRequest);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007tjAӄLe^.Zݷ2\u000f\u0002{<řa$\bّkUH|b\u0016_Tug\u0007Lp\nq\u0010و\u001axx.\u0012i\u0007`*\u0015BD\u007f?aR\u001eAid\u0003<\u001d `)~\u000fM\u0015(2`\u0016\u0007|SK:\u0017^D!>`\u0013e\u0005H\u001bLSp\u000f,\\\u007fPLG\u001b^\u0011ǅ%ɨmBVϋۨ4\u0007"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^fqG\u0016m4J\u0007&KLW*\\\u001cPM\"!d\u0016*;\f\tYJ\"n,3(\u0004.I\u000f\u001cx\u0010\u001c#\u000eC)LMZ]\u0015Y(\u0005\u0010\u000edWUC\u0002RH\u001b", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^fqG\u0016m4J\u0007&KLW*\\\u001cPM\"!d\u0016*;\f\tYJ\"n,3(\u0004.I\u000f\u001cx\u0010\u001c#\u000eC@", ";Bd@g6F/)}~^5z\t\u0017a\t$}@\u000e", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rlUJ pDDt", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005iD,$ri5\u0017b0N\u007f%G\u0016,<ja|Eo\"Y\u0012N4\u000b\u0005A=-jF7,]o:", "8nX;6<Lb#\u0007Vn+\u0001\t8c\u007f\u0004\nT\n\u0015", "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", "", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u00111X0e0\u0003K#\u001cbi^*\u0011\u0005b?$[DC/\b:XW", ":dPCX\nNa(\t\u0003:<{\r/n}(WN\u0015 \u0015", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u00113N(mRPM\"!d\u0016*;\f\tYJ\"n17+\u0018,W\u0011\u0011", "/cbyT+LS&\u0010~\\,\u000bP4a\u0011$uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        private final CustomAudienceManager mCustomAudienceManager;

        public Api33Ext4JavaImpl(CustomAudienceManager customAudienceManager) {
            this.mCustomAudienceManager = customAudienceManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public ListenableFuture<Unit> joinCustomAudienceAsync(JoinCustomAudienceRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, request, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public ListenableFuture<Unit> leaveCustomAudienceAsync(LeaveCustomAudienceRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^fqG\u0016m4J\u0007&KLW*\\\u001cPM\"!d\u0016*;\f\tYJ\"n,3(\u0004.I\u000f\u001cx\u0010\u001c#\u000eC)NL^\u001bC\u0003\u0019\u007fJ~", "", "u(E", "4q^:", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^fqG\u0016m4J\u0007&KLW*\\\u001cPM\"!d\u0016*;\f\tYJ\"n,3(\u0004.I\u000f\u001cx\u0010\u001c#\u000eC@", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/cbyT+LS&\u0010~\\,\u000bP4a\u0011$uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CustomAudienceManagerFutures from(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            CustomAudienceManager customAudienceManagerObtain = CustomAudienceManager.Companion.obtain(context);
            return customAudienceManagerObtain != null ? new Api33Ext4JavaImpl(customAudienceManagerObtain) : null;
        }
    }
}
