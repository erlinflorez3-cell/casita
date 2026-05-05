package androidx.work;

import androidx.work.WorkRequest;
import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: PeriodicWorkRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0015ӬJ\u0016(\u0007\u0015iq0Gi\t;Xݷ:\u0013y{L$\n%ڱG;c\u001cԫ&\u000e"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\u001ae\r,\u0006?\u0005\u0015\tQ|\u0014)v1EY\f/\r", "\u001a`]1e6BR,H\rh9\u0003R!o\r.h@\r'\u0017U~c", "0tX9W,K", "\u001a`]1e6BR,H\rh9\u0003R\u001ae\r,\u0006?\u0005\u0015\tQ|\u0014)v1EY\f/uJ&2TB;x\n", "uKP;W9HW\u0018\u0012Dp6\n\u000fxP\u007f5\u007fJ\u007f\u001b\u00159y\u001bBc%Ai}.F,r>QJ:kAsXY", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class PeriodicWorkRequest extends WorkRequest {
    public static final Companion Companion = new Companion(null);
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicWorkRequest(Builder builder) {
        super(builder.getId$work_runtime_release(), builder.getWorkSpec$work_runtime_release(), builder.getTags$work_runtime_release());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    /* JADX INFO: compiled from: PeriodicWorkRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007fјnjG7L͜P.hS2şs{J$c$wLQ٥J\n2\u000b_N\u0016˧~Lj\u000bq\u000f4\u00159\u00122]e\u0007k\u0013'<RuE2]qS8\u000fwd\u0007060<\u0012\u0005/\u001f:L\u001e|\u0013Cy\u0013ܘ4@~B\u0013*S\u001a*\u001e\u0014?8\t.`mMFH\u001b`h13\u0007wFf'\u000e9ƊQ\rT^gD|u.9N8M\u001f5Y\t\u0006b]U\u0002mtk\u0007x+5/as\u0006;h\u0004\"\u001bCO;d\u0003*j\u0010i`:,;SqWh\u000eV~ߡ\u007f\rJ\u0011N--]>;(g \u0018CzxRPR\u0018]p\u0003)cF\u001b3\u0004K+g$vUoF1Ne\u0005˿\u0011\u001e1\u000f7,if&`C\u001b\u001b\u0006Φ5QFP\u0019`\u0018hUm2͏\u0019P\u0001ˇ2Ͻ\u00043\u0014\u00134'3H٬=7"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\u001ae\r,\u0006?\u0005\u0015\tQ|\u0014)v1EY\f/uJ&2TB;x\n", "\u001a`]1e6BR,H\rh9\u0003R!o\r.h@\r'\u0017U~L\u0019\u0007)<X}-\r", "\u001a`]1e6BR,H\rh9\u0003R\u001ae\r,\u0006?\u0005\u0015\tQ|\u0014)v1EY\f/\r", "Ena8X9\u001cZ\u0015\r\t", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,H\rh9\u0003R\u0016i\u000e7{I|\u0014\u001eGa\u0018I|%B/", "@d_2T;\"\\(~\bo(\u0004", "", "@d_2T;\"\\(~\bo(\u0004w3m\u007f\u0018\u0005D\u0010", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\rbE|(\u0013\u0011\u007f\u001d@}n3c\u0007\u001eGz#.VR\u0005Z8&\u0015Xj=\u00169o?", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000f\u0001<\u0012\u0013`Vs\u0016<@\u0004Efy/;w\u001f\u0004\u00114", "4kTE<5MS&\u0010ve", "4kTE<5MS&\u0010ve\u001b\u0001\u0011/U\t,\u000b", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\rbE|(\u0013\u0011\u007f\u001d@}n3c\u0007\u001eGz#.VR\u0005Z8&\u0015Xj=\u00169\u00115{#XH\u0018<kVy\u0007\u0012\u001cc\f^8\u001a\u0005bPm]H?\u001fw5M\u0011\u0011,q", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000f\u0001<\u0012\u0013`Vs\u0016<@\u0004Efy/;w\u001f\u00044H7|0g$li9PB<[r6KVW\u0002 C", "BgX@B)CS\u0017\u000e", "5dc![0L=\u0016\u0004z\\;;\u001b9r\u0006\"\tP\n&\u001bOo\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/j(\tD\u000b\u0016\u001bEa\u0018I|\u00125e\u000e E|T\u000b]GBj4+j", "0tX9W\u0010Gb\u0019\f\u0004Z3", "0tX9W\u0010Gb\u0019\f\u0004Z3;\u001b9r\u0006\"\tP\n&\u001bOo\bIv,5U\f ", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        @Override // androidx.work.WorkRequest.Builder
        public Builder getThisObject$work_runtime_release() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass, long j2, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass, Duration repeatInterval) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass, long j2, TimeUnit repeatIntervalTimeUnit, long j3, TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            Intrinsics.checkNotNullParameter(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j2), flexIntervalTimeUnit.toMillis(j3));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass, Duration repeatInterval, Duration flexInterval) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            Intrinsics.checkNotNullParameter(flexInterval, "flexInterval");
            getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval), DurationApi26Impl.toMillisCompat(flexInterval));
        }

        @Override // androidx.work.WorkRequest.Builder
        public PeriodicWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet$work_runtime_release() && getWorkSpec$work_runtime_release().constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (getWorkSpec$work_runtime_release().expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
            }
            return new PeriodicWorkRequest(this);
        }
    }

    /* JADX INFO: compiled from: PeriodicWorkRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00052i%\nCiWP\u0002xޣ\"ɁkgvϺ+\u0019Q\u0012\u001e\u0016'lbM,ޔ0ܫ\u00132JģЩ7Q"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\u001ae\r,\u0006?\u0005\u0015\tQ|\u0014)v1EY\f/uK 6X?Do>'j", "", "u(E", "\u001bH=,C\f+7\u0003]^<&]o\u000fXy\u0010_'gz\u0005", "", "\u001bH=,C\f+7\u0003]^<&`q\u001eEl\u0019W'z~z.Vq*", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
