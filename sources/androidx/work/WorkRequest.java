package androidx.work;

import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
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
/* JADX INFO: compiled from: WorkRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007t\u000bA0RqP.X^03\u0002ڔR6\f$ BsU+\u0010b,UȞwk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004{m\u001c\u001d6ZuO5]ok?\u000fyȥ\t @)\t\f\u0013\u00012*v\u0011MٰEƚ\u0010\u00188ϋ\t<X\u0015[\u000ej!\u0014H8\u0001Lb\u001e\u0014ɇLpu<5.\u0011u\u0013e5cH\u0003]\u000fVTU\u0013%fT0Ë;;\u001dǬk\u0005\r_iMSP\u007f?\u001dhU*aNָ[<`Ü,\u00171^\u001bmğ*o"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R!o\r.h@\r'\u0017U~c", "", "7c", "\u001aiPCTuNb\u001d\u0006DN\u001c`g\u0005", "Ena8F7>Q", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\r", "B`V@", "", "", "uKY.i(\bc(\u0003\u0002(\u001cll\u000e;f$\u0005?\u000e!\u001bF\u0003WN\u00012;#\u0002(Bt_6WB;r}\u0010\u001fug'\u0012c*$],C]JulavD]\u007fZ\u001d$n}", "5dc\u0016W", "u(;7T=:\u001d)\u000e~eulx\u0013DU", "Asa6a.\"R", "5dc g9B\\\u001bby", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!T.L", "u(;7T=:\u001d)\u000e~euj\t>;", "5dc$b9DA$~x", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/\u00040\u0007GJ\u001f!Fo\u0015\u0006h/B_k+7kk", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class WorkRequest {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final UUID id;
    private final Set<String> tags;
    private final WorkSpec workSpec;

    public WorkRequest(UUID id, WorkSpec workSpec, Set<String> tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.id = id;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    public UUID getId() {
        return this.id;
    }

    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public final String getStringId() {
        String string = getId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        return string;
    }

    /* JADX INFO: compiled from: WorkRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яč\u0014D57\u001eq\u007fJDkt\u001aA\u000e0\u0019ǞJչ*,(w\u000ff\u000198DkH6Ra3\u0017k\u00027,[:qK;[\u001d\u0006\"\u0017pVguzRZ\u0011G\u0017\u0006,xr,Ob\u0001](\u000f:ԏw?ATwމA`\u000b6\r 8#@y\u001b\u0001\"*N\u0013~zYK\u0014\u00126Ax:h\rU\u0005 \u0016\u000e>.\u0007&\\mO>H\u0003]B/)\u0004qBd'g0\u0003Q\u0013jj܋5\u0007gӜ9?_?%'c\u0003MQk?\t@ ܵ-n-&9I\u001cWdY0\u0014C-\u0010\"cö6h\u0013Tx\u00147/Ub[P<-&~ԫ\u0011<\u0012\u0014N8VQE\u001a\u001dڜ>7\u0003\u0017k@~\u0017ެF\u007f\t\u0007~ 3&K+o\u001aƻUaI@\u0017D\n-%\u001eY\u007f5?ƟX\u0010f>){@d?{X=~ݐ:]K\u0019\u001cp\u0011.p\tΥK\u007f=)YG%OO[o\u05faQo\u0010s\\g%3\u0011la\u0019jHnRå\u001a78:TuR\u0017\u001dk\u0007ӹ\t0\u001f\u00014T528\u0017.\b\u0010<OQVSћlix\u0003&+3a~7\u0010ʤ\u001c\u0012elv3c\u0006\u0014\u0014o\t\u000f\u0014mj\u0013\tf\u0016ZS:\u000bڅ,\"@\u007f3!\u00064\\NBƎbC\u007fUL,_SÅ\u0019H\u0011Y\u000bT\u000bEwZ\u001fɭ/XAa\u001biR3O\u0016˩`p}'AZ:=x\"cۋ\u00029'3m\"\u0017Bč'\u0007\r5HZu\u000f_L#ֵ&Y\nK.\u001ag}uRт\u0013~7_JHS\u000f\u000be\b˧B+\t(\u0012\u000fi\u0017^k\u0016\u001a\t,\u000f\u001b\u0011cݚ\u001b\"\u0005\u0010;6\u0016(\u0018y\u0018¿+Kq\u0019#[l\u000f9\bʾ@NFCM2,l\u0019oXĜe1Qo5\u0016&]u\u001a˸ai}xBs\u001dq\re:Ϻ\u0014\u001a}/i]`\tΒMY\r\rj?zRZH!̫8F\u0017\u0005%3vo\u0015tdge\u000b].-\fՐ\u0011pd\r\u0003.}OL.\u0016͈$G\ffvCS?}Wu\u001d\u0006K\u000b;\u0011\u0014ϻ\u000f{? b4K'nW\u0011\u0011\u0007Ұ\u007f͛:MCؠ\u001d>\u000f-B6\\\n\u0011NbuV(\t\r^_=%\t\u0000\u007fŌZ\u001a\\ۿtXN\u0014nU\u0001#0\u0012\r!\u00046\u0007HI\u000b}Hd/\u0012G/gs̀\u001d˥S\u0005nއCFZO)?)\u0011\u0019]uC\u007f\u0379\r\u0084IԆqo\b\u000e>1\u000b7\u00130)Ti\u0011\u000e\u0013\u0007͝\u0017ڀhZlɺ*hXk0G\u001f|\u0003-J*_%'R\u000bwr1RM\b7q\u001f/\u001b\u001b͉\tѼ\u0001iNɑE\b;NKkކ\u0018z"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R!o\r.h@\r'\u0017U~L\u0019\u0007)<X}-\r", "\u0010", "%", "\u001a`]1e6BR,H\rh9\u0003R!o\r.h@\r'\u0017U~c", "", "Ena8X9\u001cZ\u0015\r\t", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,H\rh9\u0003R\u0016i\u000e7{I|\u0014\u001eGa\u0018I|%B/", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkl", "0`R8b-?1&\u0003\n^9\u0001\u0005\u001de\u000f", "", "5dc\u000fT*D]\u001a\u007fXk0\f\t<i{\u0016{O?)!Tu\bI\u0007.D]\u0006 1z\u00165M?Ik", "u(I", "Adc\u000fT*D]\u001a\u007fXk0\f\t<i{\u0016{O?)!Tu\bI\u0007.D]\u0006 1z\u00165M?Ik", "uY\u0018#", "7c", "\u001aiPCTuNb\u001d\u0006DN\u001c`g\u0005", "5dc\u0016WjP]&\u0005tk<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;7T=:\u001d)\u000e~eulx\u0013DU", "Adc\u0016WjP]&\u0005tk<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "uKY.i(\bc(\u0003\u0002(\u001cll\u000e;C\u0019", "B`V@", "", "", "5dc!T.L\u0012+\t\bd&\n\u00198t\u00040{:\u000e\u0017\u001eGk\u001c<", "u(;7T=:\u001d)\u000e~euj\t>;", "BgX@B)CS\u0017\u000e", "5dc![0L=\u0016\u0004z\\;;\u001b9r\u0006\"\tP\n&\u001bOo\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/q2\tFm\u0017#Wo\u001cK5\u0002E]\u0005\u001f7zk", "Ena8F7>Q", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\r", "5dc$b9DA$~x\u001d>\u0007\u00165_\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/\u00040\u0007GJ\u001f!Fo\u0015\u0006h/B_k+7kk", "Adc$b9DA$~x\u001d>\u0007\u00165_\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "uKP;W9HW\u0018\u0012Dp6\n\u000fxi\b3\u0003\n\t!\u0016GvW.\u00012;G\t 5CY\u001f", "5dc$b9DS&\\\u0002Z:\u000bGAo\r.uM\u0011 &Kw\u000e6\u0004%<Yy.7", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "/cS!T.", "B`V", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'| \u0016Ty\u0012;\nnGc\u000b&\u0001_ ;S0;wD\u001e#w \u0016\u0017g3Mv4\u001d", "0tX9W", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/q2\tFm\u0017#Wo\u001cKL", "0tX9W\u0010Gb\u0019\f\u0004Z3", "0tX9W\u0010Gb\u0019\f\u0004Z3;\u001b9r\u0006\"\tP\n&\u001bOo\bIv,5U\f ", "9dT=E,Lc \u000e\t?6\nd>L\u007f$\nO", "2ta.g0H\\", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "uKY.i(\bb\u001d\u0007z(\u000b\r\u0016+t\u00042\u0005\u0016D}\u0013Pn\u001bFz$H#\u0010*Ds_ WPAX4*%hoHE@<R}&GY$", "", "Bh\\2H5Bb", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "uI;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`6s\u0016<f.9hSc\u001ei\u001f-ZM?jGg'rn?PU6[|\u0014GX^,ja1\u001a$\u0016a\rN8b", "Adc\u000fT*D]\u001a\u007fXk0\f\t<i{", "0`R8b-?>#\u0006~\\@", "\u001a`]1e6BR,H\rh9\u0003R\fa}.\u0006A\u0002\u0002!Ns\fPL", "uKP;W9HW\u0018\u0012Dp6\n\u000fxB{&\u0002J\u0002\u0018\u0002Qv\u0012:\u000bz\u001c^y137%2UC\u0005JD+\u0011weC\u00109o5r0FYX0[e<O\u001e\u001f`W@5\u001a\u000bFA0~DE.F\tY\u0006Bg\u0001\u0019k", "0`R8b-?2\u0019\u0006vr", "uKP;W9HW\u0018\u0012Dp6\n\u000fxB{&\u0002J\u0002\u0018\u0002Qv\u0012:\u000bz\u001a@\u0003\u001cHi_>\\GB52(\u001efqF\u0014c5]@\u0016KTN\u001ceV\u0002\u0013WxV\u0017M8\u0017\tXTm\u0001ND%Q\u001eS\u000fAU\u0001\u0018&\u000eCy/\u001ff\u0014Nx\u0015\u0003\u0017", "Adc\u0010b5Lb&z~g;\u000b", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}c", "uKP;W9HW\u0018\u0012Dp6\n\u000fxC\n1\nO\u000e\u0013\u001bP~\u001c\u0012:\f1b|-Aq\u0015A\u0017UEx:g\u0007rn?sc8^v5V\u000b+<`Yq=!g", "Adc\u0012k7>R\u001d\u000ez]", ">n[6V@", "\u001a`]1e6BR,H\rh9\u0003R\u0019u\u000f\u0012|,\u0011!&CZ\u0018Cz#I/", "uKP;W9HW\u0018\u0012Dp6\n\u000fxO\u00107eAl'!VkxF})3mSc\u001ei\u001f-ZM?jGg'rn?PU6[|\u0014GX^,ja1\u001a$\u0016a\rN8b", "Adc\u0016W", "uKY.i(\bc(\u0003\u0002(\u001cll\u000e;C\u000fwI\u007f$!Kn!\u0006\t/B_G\u0012Az\u001c\u001bMOKkB-SEq=\u000eb,[L", "Adc\u0016a0MW\u0015\u0006Y^3x\u001d", "Adc\u0016a0MW\u0015\u0006gn5X\u0018>e\b3\u000b\u001e\u000b' V", "@t]\u000eg;>[$\u000eXh<\u0006\u0018", "", "uH\u0018\u0019T5=`#\u0003yqu\u000f\u0013<kI\u001a\u0006M\u0007\u0004\u0017S\u007f\u000eJ\u0006c\u0012i\u0002'6m#\u0004", "Adc\u0016a0MW\u0015\u0006hm(\f\t", "AsPAX", "\u001a`]1e6BR,H\rh9\u0003R!o\r._I\u0002!U5~\nKvz", "uKP;W9HW\u0018\u0012Dp6\n\u000fxW\n5\u0002$\n\u0018!\u0006]\u001d8\u0006%\u000b\u001dd\u001c@l#8QBN5F(\"n++\u0011p2;v3WL\\;\u001b/\u0003A\u001b\u0011Z\u001b$", "Adc\u0016a7Nbwz\nZ", "7m_Bg\u000b:b\u0015", "\u001a`]1e6BR,H\rh9\u0003R\u000ea\u000f$Q", "uKP;W9HW\u0018\u0012Dp6\n\u000fxD{7w\u0016D}\u0013Pn\u001bFz$H#\u0010*Ds_ WPAX4*%hoHE@<R}&GY$", "Adc\u0019T:M3\"\u000b\u000b^<|w3m\u007f", ">da6b+,b\u0015\f\nM0\u0005\t", "Adc V/>R)\u0006zK,\t\u0019/s\u000f(z\u001c\u0010", "AbW2W<ES\u0006~\u0007n,\u000b\u0018/d[7", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        private UUID id;
        private final Set<String> tags;
        private WorkSpec workSpec;
        private final Class<? extends ListenableWorker> workerClass;

        public abstract W buildInternal$work_runtime_release();

        public abstract B getThisObject$work_runtime_release();

        public Builder(Class<? extends ListenableWorker> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.workerClass = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            this.id = uuidRandomUUID;
            String string = this.id.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.workSpec = new WorkSpec(string, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.tags = SetsKt.mutableSetOf(name2);
        }

        public final Class<? extends ListenableWorker> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        public final boolean getBackoffCriteriaSet$work_runtime_release() {
            return this.backoffCriteriaSet;
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z2) {
            this.backoffCriteriaSet = z2;
        }

        public final UUID getId$work_runtime_release() {
            return this.id;
        }

        public final void setId$work_runtime_release(UUID uuid) {
            Intrinsics.checkNotNullParameter(uuid, "<set-?>");
            this.id = uuid;
        }

        public final WorkSpec getWorkSpec$work_runtime_release() {
            return this.workSpec;
        }

        public final void setWorkSpec$work_runtime_release(WorkSpec workSpec) {
            Intrinsics.checkNotNullParameter(workSpec, "<set-?>");
            this.workSpec = workSpec;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        public final B setId(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            String string = id.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            this.workSpec = new WorkSpec(string, this.workSpec);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, long j2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            this.workSpec.backoffPolicy = backoffPolicy;
            this.workSpec.setBackoffDelayDuration(timeUnit.toMillis(j2));
            return (B) getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, Duration duration) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.backoffCriteriaSet = true;
            this.workSpec.backoffPolicy = backoffPolicy;
            this.workSpec.setBackoffDelayDuration(DurationApi26Impl.toMillisCompat(duration));
            return (B) getThisObject$work_runtime_release();
        }

        public final B setConstraints(Constraints constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.workSpec.constraints = constraints;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setInputData(Data inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.workSpec.input = inputData;
            return (B) getThisObject$work_runtime_release();
        }

        public final B addTag(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.tags.add(tag);
            return (B) getThisObject$work_runtime_release();
        }

        public final B keepResultsForAtLeast(long j2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.minimumRetentionDuration = timeUnit.toMillis(j2);
            return (B) getThisObject$work_runtime_release();
        }

        public final B keepResultsForAtLeast(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.workSpec.minimumRetentionDuration = DurationApi26Impl.toMillisCompat(duration);
            return (B) getThisObject$work_runtime_release();
        }

        public B setInitialDelay(long j2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(j2);
            if (Long.MAX_VALUE - System.currentTimeMillis() <= this.workSpec.initialDelay) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
            }
            return (B) getThisObject$work_runtime_release();
        }

        public B setInitialDelay(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.workSpec.initialDelay = DurationApi26Impl.toMillisCompat(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() <= this.workSpec.initialDelay) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
            }
            return (B) getThisObject$work_runtime_release();
        }

        public B setExpedited(OutOfQuotaPolicy policy) {
            Intrinsics.checkNotNullParameter(policy, "policy");
            this.workSpec.expedited = true;
            this.workSpec.outOfQuotaPolicy = policy;
            return (B) getThisObject$work_runtime_release();
        }

        public final W build() {
            W w2 = (W) buildInternal$work_runtime_release();
            Constraints constraints = this.workSpec.constraints;
            boolean z2 = constraints.hasContentUriTriggers() || constraints.requiresBatteryNotLow() || constraints.requiresCharging() || constraints.requiresDeviceIdle();
            if (this.workSpec.expedited) {
                if (z2) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (this.workSpec.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            setId(uuidRandomUUID);
            return w2;
        }

        public final B setInitialState(WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.workSpec.state = state;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setInitialRunAttemptCount(int i2) {
            this.workSpec.runAttemptCount = i2;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setLastEnqueueTime(long j2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.lastEnqueueTime = timeUnit.toMillis(j2);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setScheduleRequestedAt(long j2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.scheduleRequestedAt = timeUnit.toMillis(j2);
            return (B) getThisObject$work_runtime_release();
        }
    }

    /* JADX INFO: compiled from: WorkRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Xh\u000e[\u000f4\u0018/n\u0003շ(ޯa\u0012\u0017˰\u0013}M7eok;\u0017x\rӔrݨ&8\u0002ڎи\u001e/"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R!o\r.h@\r'\u0017U~L\u001a\u0001-@U\u0007$Avk", "", "u(E", "\u0012D5\u000eH\u0013-MuZXD\u0016]i)D_\u000fW4z~z.Vq*", "", "\u001b@G,5\b\u001c9\u0003_[X\u0014`o\u0016Im", "\u001bH=,5\b\u001c9\u0003_[X\u0014`o\u0016Im", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
