package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
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
/* JADX INFO: compiled from: MeasurementManagerFutures.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r\"4ߚ\u007f\u0007|jAӄLeV4ZS0\u000fs{J$cҕyCQU\"}(\u000bWN}gvϺb\u000bY\u000f\u000e\u0016~k2mkތ{'?2pnw3a\u0005}>fҚȥ\t @\"\u0001\u000e\u0013\u000220X\u0012\u0007zqN:\u0014`D~>j\r{\n`6NJ.\u00076bwPFH\u001bdh1i(2`\\/w6\rO\u001dF\u0003*;x\u0012\"9IO5C/\u0004\t\u0015]sA\u0019> IK\u000eo;9V\f]FZ\u0010\u0014C.}\u000f\u000ev4j\u001dQ\u000f\u0016mP\u0018wY_&.\b|\f\rj\u0007<\bWL<=2f6\u001fy\u001a;gNb\u001adR\u0002\u000bad\u001aS\u0002c/G+~Q\u0010N_s҂\u007f\u001b"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^pa5\u0015s9N~'P[\u0018\u0014\\N\u0001M!\u0012b\u000eW:t\u0001b=&nQ\u0018/\u0017<V\u0002I>", "", "u(E", "2d[2g,+S\u001b\u0003\tm9x\u00183o\t6WN\u0015 \u0015", "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", "", "2d[2g0H\\\u0006~\u0007n,\u000b\u0018", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]\u0001", "5dc\u001aX(Lc&~\u0003^5\fd:im7wO\u0011%rU\u0004\u0017:", "", "@dV6f;>`\u0007\t\u000bk*|d=y\t&", "/sc?\\)Nb\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BRb\bzmul\u00163;", "7m_Bg\fOS\"\u000e", "\u001a`]1e6BRb\u0010~^>Fl8p\u00107[Q\u0001 &\u001d", "@dV6f;>`\b\f~`.|\u0016\u000bs\u00141y", "BqX4Z,K", "@dV6f;>`\u000b~wL6\r\u0016-e[6\u0010I~", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr*\u0014\u0014^\u001c]8\t\u0014]K-[DC/\b:XW", "@dV6f;>`\u000b~wM9\u0001\u000b1e\r\u0004\nT\n\u0015", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D;[0^TrJ\u0001\u0012\\\u0012\\:\u001a\u0001hE.w17+\u0018,W\u0011\u0011", "\u000foX\u007f&\fQbhcvo(`\u0011:l", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000bP4a\u0011$uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class MeasurementManagerFutures {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final MeasurementManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract ListenableFuture<Unit> deleteRegistrationsAsync(DeletionRequest deletionRequest);

    public abstract ListenableFuture<Integer> getMeasurementApiStatusAsync();

    public abstract ListenableFuture<Unit> registerSourceAsync(Uri uri, InputEvent inputEvent);

    public abstract ListenableFuture<Unit> registerTriggerAsync(Uri uri);

    public abstract ListenableFuture<Unit> registerWebSourceAsync(WebSourceRegistrationRequest webSourceRegistrationRequest);

    public abstract ListenableFuture<Unit> registerWebTriggerAsync(WebTriggerRegistrationRequest webTriggerRegistrationRequest);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007tjAӄLe^.Zݷ2\u000fy\u0002<$a$yCQU\"Ԃ*\teNogtLb\u000bY\u000f\u000eǝ\u0001jBI]ތc\u0012%˰rom2\u000ezM=ntN\u0005N3ŕ<y\u0013\u0003b>V\u0013\u000f\u0001SM\u001c\u0012^E\u001f>\u0003\u0011[\u000b2\u00124Ef\u0016fhuVNN|_J/Q\f\u0018F\u0015<(N\u000bW%Ld)\u001dv\u0010#YDg9#0k\u00035^\fE\u0011L\n?\u001bgU5q^<kDg\u0018\u001a%-_\r\fwT`5Un\u001c?+}o\u0012eV<\u0006\f\u0014\u0013L\u0006\u001e\u0006UM\\1Jj\u0016 Kt!f\u0007eJrP\u0014\u0013gF\u00195\u007fa0g\u001f\u0017UoM1Ne\u0011K\"n/\u000fn9[\u0003\u000f7ڀ\u001dƻ{Q9҅͞A^"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^pa5\u0015s9N~'P[\u0018\u0014\\N\u0001M!\u0012b\u000eW:t\u0001b=&nQ\u0018/\u0017<V\u0002I'\\\u0017\u001a[\u0003J\u0004Q&tC\u000b\u0011YI4o\u001c", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^pa5\u0015s9N~'P[\u0018\u0014\\N\u0001M!\u0012b\u000eW:t\u0001b=&nQ\u0018/\u0017<V\u0002I>", ";LT.f<KS!~\u0004m\u0014x\u0012+g\u007f5", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018^'CZ^9\\ZrF#yV\u0017J-\r\u0012/", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005s4\u001a#xn9\u000fc5]@\u000fGH\\<iRz=\u001d!B\nW'\u000f\u0005f\u0017g_", "2d[2g,+S\u001b\u0003\tm9x\u00183o\t6WN\u0015 \u0015", "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", "", "2d[2g0H\\\u0006~\u0007n,\u000b\u0018", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]\u0001", "5dc\u001aX(Lc&~\u0003^5\fd:im7wO\u0011%rU\u0004\u0017:", "", "@dV6f;>`\u0007\t\u000bk*|d=y\t&", "/sc?\\)Nb\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BRb\bzmul\u00163;", "7m_Bg\fOS\"\u000e", "\u001a`]1e6BRb\u0010~^>Fl8p\u00107[Q\u0001 &\u001d", "@dV6f;>`\b\f~`.|\u0016\u000bs\u00141y", "BqX4Z,K", "@dV6f;>`\u000b~wL6\r\u0016-e[6\u0010I~", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr*\u0014\u0014^\u001c]8\t\u0014]K-[DC/\b:XW", "@dV6f;>`\u000b~wM9\u0001\u000b1e\r\u0004\nT\n\u0015", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D;[0^TrJ\u0001\u0012\\\u0012\\:\u001a\u0001hE.w17+\u0018,W\u0011\u0011", "/cbyT+LS&\u0010~\\,\u000bP4a\u0011$uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {
        private final MeasurementManager mMeasurementManager;

        public Api33Ext5JavaImpl(MeasurementManager mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture<Unit> deleteRegistrationsAsync(DeletionRequest deletionRequest) {
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1(this, deletionRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture<Unit> registerSourceAsync(Uri attributionSource, InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture<Unit> registerTriggerAsync(Uri trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, trigger, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture<Unit> registerWebSourceAsync(WebSourceRegistrationRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this, request, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture<Unit> registerWebTriggerAsync(WebTriggerRegistrationRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1(this, request, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public ListenableFuture<Integer> getMeasurementApiStatusAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: MeasurementManagerFutures.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^pa5\u0015s9N~'P[\u0018\u0014\\N\u0001M!\u0012b\u000eW:t\u0001b=&nQ\u0018/\u0017<V\u0002I'^\u0016\u001e\u00191stL_e", "", "u(E", "4q^:", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r@gE\u001a^pa5\u0015s9N~'P[\u0018\u0014\\N\u0001M!\u0012b\u000eW:t\u0001b=&nQ\u0018/\u0017<V\u0002I>", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/cbyT+LS&\u0010~\\,\u000bP4a\u0011$uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MeasurementManagerFutures from(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            MeasurementManager measurementManagerObtain = MeasurementManager.Companion.obtain(context);
            return measurementManagerObtain != null ? new Api33Ext5JavaImpl(measurementManagerObtain) : null;
        }
    }
}
