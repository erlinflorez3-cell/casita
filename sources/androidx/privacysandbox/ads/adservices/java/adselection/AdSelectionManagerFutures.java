package androidx.privacysandbox.ads.adservices.java.adselection;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
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
/* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a%wgQ٥8\tR\t}M gxU\u001b\u0010IƤو\u001axx,\u0012i\u0007^*\u0015BD\u007f?aP\u001e?id\u0003:\u001d `'~\u001fM\u0015(0`\u0016\u0007|SK:\u0019^B!>`\u0015e\u0005H\u001bLcő\u0005*"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^d`G\u0007j,L\u0006+QU\u0018\b[@rD\u0014\u0010i\u0012X4t\u0001b=&nQ\u0018/\u0017<V\u0002I>", "", "u(E", "@d_<e;\"[$\fzl:\u0001\u00138A\u000e<\u0005>", "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", "", "@d_<e;\"[$\fzl:\u0001\u00138R\u007f4\f@\u000f&", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018c'RV[;@Z}J\u0014 h\u0012X4y\u0005eQ$|S\r", "Ad[2V;\u001aR'Z\tr5z", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001d{j\u001dL5\u0015\u0005/", "/cB2_,<b\u001d\t\u0004<6\u0006\n3g", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dod\u0017O/\u000fZ", "\u000foX\u007f&\fQbgcvo(`\u0011:l", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000bP4a\u0011$uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AdSelectionManagerFutures {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final AdSelectionManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract ListenableFuture<Unit> reportImpressionAsync(ReportImpressionRequest reportImpressionRequest);

    public abstract ListenableFuture<AdSelectionOutcome> selectAdsAsync(AdSelectionConfig adSelectionConfig);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007tjAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥ }8ޛ\u007fN\u0016f/Wj\u0011Q\u000f\u001e\u0018\u000fiZJǤ|] \u0011zV}BKS\u007f?I`#;3$b&F\u007f\u001d\u0001H1\u000f%?\u000fQS$\u0018@B\u0001:\u0001\u0016{\tJ\u0016\u0014H8\u0001Lg.c\u0007Vz]R19\u0002\u0018C%ώa݁\u0001M\u0015Ͽÿ+\u0019"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^d`G\u0007j,L\u0006+QU\u0018\b[@rD\u0014\u0010i\u0012X4t\u0001b=&nQ\u0018/\u0017<V\u0002I'\\\u0017\u001a[\u0003J\u0004Q%tC\u000b\u0011YI4o\u001c", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^d`G\u0007j,L\u0006+QU\u0018\b[@rD\u0014\u0010i\u0012X4t\u0001b=&nQ\u0018/\u0017<V\u0002I>", ";@S X3>Q(\u0003\u0005g\u0014x\u0012+g\u007f5", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dyV\u0017J-\r\u0012/", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005g3,\u0015oa7\u0016g6W@\u0003F:N3\\P\u0002A\u001e\u001bB\nW'\u000f\u0005f\u0017g_", "@d_<e;\"[$\fzl:\u0001\u00138A\u000e<\u0005>", "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", "", "@d_<e;\"[$\fzl:\u0001\u00138R\u007f4\f@\u000f&", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018c'RV[;@Z}J\u0014 h\u0012X4y\u0005eQ$|S\r", "Ad[2V;\u001aR'Z\tr5z", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001d{j\u001dL5\u0015\u0005/", "/cB2_,<b\u001d\t\u0004<6\u0006\n3g", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dod\u0017O/\u000fZ", "/cbyT+LS&\u0010~\\,\u000bP4a\u0011$uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {
        private final AdSelectionManager mAdSelectionManager;

        public Api33Ext4JavaImpl(AdSelectionManager adSelectionManager) {
            this.mAdSelectionManager = adSelectionManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public ListenableFuture<AdSelectionOutcome> selectAdsAsync(AdSelectionConfig adSelectionConfig) {
            Intrinsics.checkNotNullParameter(adSelectionConfig, "adSelectionConfig");
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public ListenableFuture<Unit> reportImpressionAsync(ReportImpressionRequest reportImpressionRequest) {
            Intrinsics.checkNotNullParameter(reportImpressionRequest, "reportImpressionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this, reportImpressionRequest, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^d`G\u0007j,L\u0006+QU\u0018\b[@rD\u0014\u0010i\u0012X4t\u0001b=&nQ\u0018/\u0017<V\u0002I'^\u0016\u001e\u00191stL_e", "", "u(E", "4q^:", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^d`G\u0007j,L\u0006+QU\u0018\b[@rD\u0014\u0010i\u0012X4t\u0001b=&nQ\u0018/\u0017<V\u0002I>", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/cbyT+LS&\u0010~\\,\u000bP4a\u0011$uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdSelectionManagerFutures from(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AdSelectionManager adSelectionManagerObtain = AdSelectionManager.Companion.obtain(context);
            return adSelectionManagerObtain != null ? new Api33Ext4JavaImpl(adSelectionManagerObtain) : null;
        }
    }
}
