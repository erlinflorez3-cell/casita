package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4F\u0007\"B\u0012\u007f\u0007lkA0ZeP.XS2\u000fy\u0003<$a%yCQU\"Ԃ*\t]To˧vJp\u000bK\u000f\f\u0019\u0001j:R]ތe\u0012%2JoEVUoK9ht<\t&ݍ(Nц#IJ*v\u000f/{\f\u0015VREF\u0005JV\u001bM\u001d\u001a@\u0007N$\u000f tg|7Ղp]H2c\u0018oV^+m4\u0015M;Gd+\u001b{y\u001eY¨˝9\u00153YCߣQkC\u0011?\n=3i7-1I\u0002^NX.\u001c%/]\u0016urT]\u0015Yf\f55geaO<)\b\u0001\u0002\rJ\u000f&\u0006UT>3 f\u0016\u001bKt!_PV\b^P\u000e\u0013ad&5\u00069+G+~Q\u0010J)T={\u0013\u001e6#/}1aZ\u000en'3T&dAWF>Vb\"Yk\u0003\u0014vh\u00028\u001aHG.F\f\u00174\u00173Os9Q0{\bNDu\u0010\u001d`\u0017byXN@0\t.7X\u0018\u001c`Jd\u0013\u0007hT\u0007;!S\"T\u0015\u001a \u0013Ny\bB'%\u001elgh\u0018\n]c\u0010%=\u0007OY\u001d\u0001\u001e]?^AVic>v؏z\u0014M^+\tf\u0012ZS:i%/0^`j>xBΰOT\u001a@l\n\u001cb?wȐ]]O\u0011LZA+\u001e&˺iX\u0006bb<\u0003\u0018;;֮\u0002\u0019c~ \u007fxw;C˧#uH_f1&\u00041/ٛ}k\u000e\r&\u0018G\u0016[\u000eǉm^|c/8\u0016HH\u0018Ʉ>[\u0016\r]J\u0002[b\u0013Ȱf\u001aT \\\u0013|(.\u0002ģ/0\u000fx'D`\u0019_\u0016ݾ\u0018j}l*;\b\u0013\b@ԚGCNq\r#[l^9ČZ\u0005UF6\u001d\u001fL&Gɂ#E>;}?\u001f,vB0[̜^2v<5z\u000fT\u0001,\u0604-,\u001d}\u001fi]`G~օZGE0a\u0005\u0003pW1Ͳ\t\u000b\u0010BKKHos7ߐ9\u0016\u0012==~\u0007Z\u001c7ê\\\u0003ݸn\ftF_Xϒs\u0004\u001a^Q%)M\u0002h\u001esQ\\\u0019Q'\n9\u0004at\u0018\u001cK)nW\u0011\n`\u000ey\u0018DKSd\u001b;7%d2B\b\u0019Nli4\u001c+\u0006L_\u001d$JB\"G\u0007\u0014Zxjd`\u0005\u000fT\u0011'0\u0001\r\u001fK\u001e'Da\u000bsFb@{2/bM\u000f!j]\u0011~%YW\u0005?!)f\u0015#E\fXy\b<\u0004U?\u0006k\u001e#h\u001e\u0003\u001dP039\u007f \u0010|6^\u0019n|N\u0013\u0006BlXN0C\u0017z+\u001dl\u0010\u0015\u000b'j\u000bo\u0011<|T}7Q6\u0019\u0017rF7\u0012\u0003cT9E\u0006cLmOp\u00145\u001coSi\u00138&&'\u0012\u00169\\\u0006#-Ƒ\\cK$3.b0&CV.\tFL\u000bq8-N̝PJ7\u0010UvY\u001a\u0015iG5n\u0005\u0006p`/Ȥ\t,xq3m\u000b1,aZ\b\u0007EPK\u0018oY<YpZhV\u0004$f!\u0018\u0014C5gJ\u0016)A\u0010})\u0019ty_s\rY>\u001c.oBHRL\rg\u007f\u0004KBTV\u0016\u0002j\u001eNr!tlpfDb),;Î\u0018ì\u0018|\u0007Ĝ/!!J^rL{e;W#2ƴSֿ\u000b\u0004MÒv1?dW\u001beEAsfzgܣFŪx\u007f2ХY\u0003\u000e\u0004D-tqs\u001ee]zݮp݁*KMЯ\u0013\u0018:\"&\u0011]in$|`p˩GǾ7A!ֆQ)F'\b\u0007GJ!U*Ͽ,ʫ\u0001\u0007\u0015ׄ\u00123q]\u0002[C1=\u000f\b\u001b\u0006gq)\f֕Nۡ\u0010\u0002mڄO]qd'aZXkI\\},ʶ\fˌ#$,ԖF3\u000ePIHXk\u0013D\u0015w.ư2ń:nLì\u0018~\u0007}\".\u007f\u0017\"e\u0012erEQߵ%ܵB*5ìWU[x\u0012\u000br\u001c{\u0018u\u0013\\ԅ?ٽ\u0001\u0010Wƀ\u0011:W\u0018e/\u000bzrWű\b>Jc<\u001fUf*9\u0014T*T\u0012\b!2̌c\u0014P\u0014\u00134\u0012\u001e\u0002bn\u0019x\u001dF6\u0002z\u0005:3ܖYیf\u000bHǃtn<\\$\u000b4%dLU\u0006T߇lū\u00173Oؓ\u0012W t\u0014!K0\u0012)D)>\u07fbSˇYq`\u05ed\nC\u0019zbXcq\u0013\t\u0014%\"߅7܅\u0004j3ɹ\u0018rL:BX4#{h\u0007\u0014\u001bѕPڍq<8ߣh\u0001`kk%<!C~#\u0010OBpKsd?@m[-V,Ʋ9ӟ\u0006\u0003\u0018Ýi#\u00199k9`2*\u0011oBRňhƖY|u۞`\u0013oQ9/4GeE\np-̶K϶[?\u0007ǋp72\u000f+$\u0011hImL&6̤XݜZ)PÁç\u00152"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\r", "", "7c", "", "Ena8X9\u001cZ\u0015\r\tG(\u0005\t)", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "<df\u0016W", "=sW2e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@7?f\u0004i;u!5\u0017KEj4%^ZkF\rQ7Nt|\u000b=", "AsPAX", "\u001a`]1e6BR,H\rh9\u0003R!o\r._I\u0002!U5~\nKvz", "Ena8X9\u001cZ\u0015\r\tG(\u0005\t", "7m_Bg\u0014>`\u001b~\b<3x\u0017=N{0{", "7m_Bg", "\u001a`]1e6BR,H\rh9\u0003R\u000ea\u000f$Q", "=tc=h;", "7mXA\\(E2\u0019\u0006vr", "", "7mc2e=:Zw\u000f\bZ;\u0001\u00138", "4kTE7<KO(\u0003\u0005g", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}c", "@t]\u000eg;>[$\u000eXh<\u0006\u0018", "", "0`R8b-?>#\u0006~\\@", "\u001a`]1e6BR,H\rh9\u0003R\fa}.\u0006A\u0002\u0002!Ns\fPL", "0`R8b-?2\u0019\u0006vr\u000b\r\u0016+t\u00042\u0005", ":`bA85Jc\u0019\u000fzM0\u0005\t", ";h]6`<F@\u0019\u000ezg;\u0001\u00138D\u00105wO\u0005! ", "AbW2W<ES\u0006~\u0007n,\u000b\u0018/d[7", "3w_2W0MS\u0018", "", "=tc\u001cY\u0018N](zeh3\u0001\u0007C", "\u001a`]1e6BR,H\rh9\u0003R\u0019u\u000f\u0012|,\u0011!&CZ\u0018Cz#I/", ">da6b+\u001c])\b\n", "5d]2e(MW#\b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@7?f\u0004i)w#41L<ur\f$dp9\\J1J\b#\u0011SJ5^\u001c`L!\u0016c\u0010$\u0012\u0012\u0001j=mu@@!Q\u001aX\u000f?q\u0003a|\n>i}LZ\u000fZC'\u007fN/2%Unu\u001d(Ak)q\u0016c\u001co\u0004L.!wbyd_*_`8uYN\u0003ftQ\u001dyKmPwhL\u000fM_E\u00036,G\u007f\u0001!@.X\u0012p6\u0003A4:c\u0018\u0015y\"KdBq(ZG1'7'\u001dFOa\nB#rM\u0004Vn\nk4>#idv\u0012!\u0011j\u001d%\u001fqnj8>\u0016HXk\u007f1M\u0003@oOxlJ\u0015", "5dc\u0014X5>`\u0015\u000e~h5", "u(8", "7r1.V2>R\u0003\u007f{", "u(I", "7r?2e0HR\u001d|", "5dc\u001dX9B]\u0018\\\u0005n5\f", "Adc\u001dX9B]\u0018\\\u0005n5\f", "uH\u0018#", "1`[0h3:b\u0019gzq;i\u00198T\u00040{", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(JH", "1n\\=b5>\\(JI", "1n\\=b5>\\(JJ", "1n\\=b5>\\(JK", "1n\\=b5>\\(JL", "1n\\=b5>\\(JM", "1n\\=b5>\\(JN", "1n\\=b5>\\(K", "1n\\=b5>\\(KE", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "3pd._:", "6`b\u0010b5Lb&z~g;\u000b", "6`b566=S", "Adc\u000fT*D]\u001a\u007fY^3x\u001d\u000eu\r$\u000bD\u000b ", "", "Adc\u001dX9B]\u0018\u0003x", "BnBAe0GU", "\u0011n\\=T5B]\"", "\u0017c0;W\u001aMO(~", "%na8<5?]\u0004\t\u007fh", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WorkSpec {
    public static final Companion Companion = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;
    public long backoffDelayDuration;
    public BackoffPolicy backoffPolicy;
    public Constraints constraints;
    public boolean expedited;
    public long flexDuration;
    private final int generation;
    public final String id;
    public long initialDelay;
    public Data input;
    public String inputMergerClassName;
    public long intervalDuration;
    public long lastEnqueueTime;
    public long minimumRetentionDuration;
    public OutOfQuotaPolicy outOfQuotaPolicy;
    public Data output;
    private int periodCount;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public WorkInfo.State state;
    public String workerClassName;

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, long j7, long j8, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i3, int i4, int i5, Object obj) {
        Constraints constraints2 = constraints;
        long j9 = j3;
        long j10 = j2;
        String str4 = str;
        Data data3 = data;
        String str5 = str2;
        long j11 = j4;
        Data data4 = data2;
        WorkInfo.State state2 = state;
        String str6 = str3;
        int i6 = i4;
        int i7 = i3;
        OutOfQuotaPolicy outOfQuotaPolicy2 = outOfQuotaPolicy;
        long j12 = j8;
        BackoffPolicy backoffPolicy2 = backoffPolicy;
        long j13 = j5;
        long j14 = j7;
        boolean z3 = z2;
        long j15 = j6;
        int i8 = i2;
        if ((-1) - (((-1) - i5) | ((-1) - 1)) != 0) {
            str4 = workSpec.id;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            state2 = workSpec.state;
        }
        if ((i5 + 4) - (i5 | 4) != 0) {
            str5 = workSpec.workerClassName;
        }
        if ((i5 + 8) - (i5 | 8) != 0) {
            str6 = workSpec.inputMergerClassName;
        }
        if ((i5 + 16) - (i5 | 16) != 0) {
            data3 = workSpec.input;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 32)) != 0) {
            data4 = workSpec.output;
        }
        if ((i5 & 64) != 0) {
            j10 = workSpec.initialDelay;
        }
        if ((i5 + 128) - (i5 | 128) != 0) {
            j9 = workSpec.intervalDuration;
        }
        if ((i5 & 256) != 0) {
            j11 = workSpec.flexDuration;
        }
        if ((i5 + 512) - (i5 | 512) != 0) {
            constraints2 = workSpec.constraints;
        }
        if ((i5 & 1024) != 0) {
            i8 = workSpec.runAttemptCount;
        }
        if ((i5 & 2048) != 0) {
            backoffPolicy2 = workSpec.backoffPolicy;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4096)) != 0) {
            j13 = workSpec.backoffDelayDuration;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8192)) != 0) {
            j15 = workSpec.lastEnqueueTime;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 16384)) != 0) {
            j14 = workSpec.minimumRetentionDuration;
        }
        if ((i5 & 32768) != 0) {
            j12 = workSpec.scheduleRequestedAt;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 65536)) != 0) {
            z3 = workSpec.expedited;
        }
        if ((-1) - (((-1) - 131072) | ((-1) - i5)) != 0) {
            outOfQuotaPolicy2 = workSpec.outOfQuotaPolicy;
        }
        if ((i5 + 262144) - (i5 | 262144) != 0) {
            i7 = workSpec.periodCount;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 524288)) != 0) {
            i6 = workSpec.generation;
        }
        boolean z4 = z3;
        OutOfQuotaPolicy outOfQuotaPolicy3 = outOfQuotaPolicy2;
        int i9 = i7;
        int i10 = i6;
        return workSpec.copy(str4, state2, str5, str6, data3, data4, j10, j9, j11, constraints2, i8, backoffPolicy2, j13, j15, j14, j12, z4, outOfQuotaPolicy3, i9, i10);
    }

    public final String component1() {
        return this.id;
    }

    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.periodCount;
    }

    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.generation;
    }

    public final String component3() {
        return this.workerClassName;
    }

    public final String component4() {
        return this.inputMergerClassName;
    }

    public final Data component5() {
        return this.input;
    }

    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String id, WorkInfo.State state, String workerClassName, String str, Data input, Data output, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, long j7, long j8, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i3, int i4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id, state, workerClassName, str, input, output, j2, j3, j4, constraints, i2, backoffPolicy, j5, j6, j7, j8, z2, outOfQuotaPolicy, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return Intrinsics.areEqual(this.id, workSpec.id) && this.state == workSpec.state && Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && Intrinsics.areEqual(this.input, workSpec.input) && Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v43 */
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31;
        boolean z2 = this.expedited;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        return ((((((iHashCode2 + r02) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation);
    }

    public WorkSpec(String id, WorkInfo.State state, String workerClassName, String str, Data input, Data output, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, long j7, long j8, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i3, int i4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = str;
        this.input = input;
        this.output = output;
        this.initialDelay = j2;
        this.intervalDuration = j3;
        this.flexDuration = j4;
        this.constraints = constraints;
        this.runAttemptCount = i2;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j5;
        this.lastEnqueueTime = j6;
        this.minimumRetentionDuration = j7;
        this.scheduleRequestedAt = j8;
        this.expedited = z2;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i3;
        this.generation = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j2, long j3, long j4, Constraints constraints, int i2, BackoffPolicy backoffPolicy, long j5, long j6, long j7, long j8, boolean z2, OutOfQuotaPolicy outOfQuotaPolicy, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int i6 = i3;
        OutOfQuotaPolicy outOfQuotaPolicy2 = outOfQuotaPolicy;
        long j9 = j6;
        long j10 = j5;
        Constraints constraints2 = constraints;
        long j11 = j4;
        long j12 = j3;
        Data EMPTY = data;
        long j13 = j2;
        String str4 = str3;
        boolean z3 = z2;
        BackoffPolicy backoffPolicy2 = backoffPolicy;
        Data EMPTY2 = data2;
        long j14 = j8;
        int i7 = i2;
        WorkInfo.State state2 = (i5 & 2) != 0 ? WorkInfo.State.ENQUEUED : state;
        str4 = (i5 & 8) != 0 ? null : str4;
        if ((i5 & 16) != 0) {
            EMPTY = Data.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        if ((-1) - (((-1) - i5) | ((-1) - 32)) != 0) {
            EMPTY2 = Data.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
        }
        this(str, state2, str2, str4, EMPTY, EMPTY2, (i5 + 64) - (i5 | 64) != 0 ? 0L : j13, (i5 + 128) - (i5 | 128) != 0 ? 0L : j12, (i5 + 256) - (i5 | 256) != 0 ? 0L : j11, (-1) - (((-1) - i5) | ((-1) - 512)) != 0 ? Constraints.NONE : constraints2, (i5 & 1024) != 0 ? 0 : i7, (i5 + 2048) - (i5 | 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy2, (-1) - (((-1) - i5) | ((-1) - 4096)) != 0 ? 30000L : j10, (i5 + 8192) - (i5 | 8192) != 0 ? 0L : j9, (-1) - (((-1) - i5) | ((-1) - 16384)) == 0 ? j7 : 0L, (32768 & i5) != 0 ? -1L : j14, (65536 + i5) - (65536 | i5) != 0 ? false : z3, (131072 + i5) - (131072 | i5) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy2, (262144 + i5) - (262144 | i5) != 0 ? 0 : i6, (-1) - (((-1) - i5) | ((-1) - 524288)) == 0 ? i4 : 0);
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final void setPeriodCount(int i2) {
        this.periodCount = i2;
    }

    public final int getGeneration() {
        return this.generation;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String newId, WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new Data(other.input), new Data(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new Constraints(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }

    public final void setBackoffDelayDuration(long j2) {
        if (j2 > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j2 < 10000) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = RangesKt.coerceIn(j2, 10000L, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final void setPeriodic(long j2) {
        if (j2 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(RangesKt.coerceAtLeast(j2, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), RangesKt.coerceAtLeast(j2, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public final void setPeriodic(long j2, long j3) {
        if (j2 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = RangesKt.coerceAtLeast(j2, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (j3 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j3 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j2);
        }
        this.flexDuration = RangesKt.coerceIn(j3, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, this.intervalDuration);
    }

    public final long calculateNextRunTime() {
        if (isBackedOff()) {
            return this.lastEnqueueTime + RangesKt.coerceAtMost(this.backoffPolicy == BackoffPolicy.LINEAR ? this.backoffDelayDuration * ((long) this.runAttemptCount) : (long) Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1), WorkRequest.MAX_BACKOFF_MILLIS);
        }
        if (isPeriodic()) {
            int i2 = this.periodCount;
            long j2 = this.lastEnqueueTime;
            if (i2 == 0) {
                j2 += this.initialDelay;
            }
            long j3 = this.flexDuration;
            long j4 = this.intervalDuration;
            if (j3 != j4) {
                j = i2 == 0 ? ((long) (-1)) * j3 : 0L;
                j2 += j4;
            } else if (i2 != 0) {
                j = j4;
            }
            return j2 + j;
        }
        long jCurrentTimeMillis = this.lastEnqueueTime;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        return jCurrentTimeMillis + this.initialDelay;
    }

    public final boolean hasConstraints() {
        return !Intrinsics.areEqual(Constraints.NONE, this.constraints);
    }

    public String toString() {
        return "{WorkSpec: " + this.id + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: compiled from: WorkSpec.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012}\nnjG9LeN.ZS8\u0015s{:$aҜwYП\u0006\u001a,!Ib^kunbZ9D\u001f\n$z\u0003,wXޯa\u0012\u001d6\u000bvM8eok:'ӡ7M'@(Py3\u0004`ޙIX\u0012\tJc\f@ؓpv@R\u001bM\u001d\u001a@\u0007n&\u0007\u001ejif6vo$Ǆ.k\u0014wJf'\u000e9-S\u001bPl)#u\u0010\u001dqÿ8}\u001c3^\u001b\u0007\u0001g\u0006Ƹ>:D\u0013u?'YJ:ʥ5)\u0010\"\u0015CO;^)*\u001b\t(Ө\u0018ˏ/Ok֟!\u001e6y\u0013{;?:\u0012D+\u001f͛9բj\b\u0016ޗϨva"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001euQ\u0015\nVB)z0-\u0015>", "", "7c", "", "AsPAX", "\u001a`]1e6BR,H\rh9\u0003R!o\r._I\u0002!U5~\nKvz", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@7?f\u0004i)w#41L<ur\f$dp9\\'\u001d", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class IdAndState {
        public String id;
        public WorkInfo.State state;

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = idAndState.id;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final IdAndState copy(String id, WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            return new IdAndState(id, state);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return Intrinsics.areEqual(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }

        public IdAndState(String id, WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.id = id;
            this.state = state;
        }
    }

    /* JADX INFO: compiled from: WorkSpec.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV4ZS0\u000fs{BBc$wcCU(\u0007*\tUPog\u0005JbŏIƫ\f,ю\u001b,wT9%\"\u0013@B\b?aN\u007fAGb\r63#B&F}\u001d\u0001H/X\u0014\u0005\u0001[K:\u0019@D~Bj\r{\f*\u001c\u0014G8\u0007.^wNdI\u001bgJ91\u000e\u0002H^)o0+R;Pù+\r\u0005mf2N[M\u0015STIߞS$F\u0011d\n=3kmޗ,\u0012ze\\p\u007fB\u001aq̈́\u000e&y4\u0004\u001dQ\u000f\u0013m̊P,R^6@w)\u0003Sʤ\u0005V\u00135qF3*h\u0018\u000eau!]\u0007ї\u0003'O\u000e%y<''\u00103Y>Ip\u0018Ŭ<a(E'\u001d\rLŀ1t'[b\u000ex\u0015IU(W7QN?`N8\\ms\npp\u0006B\u0004^L05\u0002\u0011<\u001d=7\n@S'q\u0002VL\u007fv3g\u0019_oRVI:t&9:\t:[rn5wVTf7)S,V\u0017}6\u0018Nf>̚ m!\\{\u0001i\u0019z\u000e\u00103]~9om\u001a\r\u001e\u0080_{<_\u0013(a\u0001}ZΊ;+\ff\u0017ZS:[#ͼ!zLxA\u0010{r\u0001\\'@G\n\u001cb3g\u001d3ñJҴ\"HIґ!a`u\u001e\r%O2\u0003\u0002$#\n7T\u001btFΧ\u0005ͅ0\thõECWD'6u$nE\u000b5W\u001b\u0002\u0004_gzL\u0003pTy,ݰ,ک\u001eEYǽU\u0015\u0015\u00127F\"/Ka\u0001{\"o 2\u0013\u0003\n\u0011Kh\\l6t'0\u001fn!֪`Ђ&\u0003fа;\nj\u0017\byf|M|b%,ZWx\u001bYjUn\u0001C#tݚ\rȞ&\t=Ԇ[)#1\u0006\"O\u0017gyw\r~\u0016p\u0011>t\u0014\u0007bgTs9Лiщ?DQʲ\u0017@(Bz\"bJp\u0018\u0016cYV\u001b<`Gtrf8{\f]\b\u001d\u000bj\u0011G«gǈ\u0017{\u0006ҮFa0\u0016Q\u00164`IH\u001fgϲk!"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001eu_ ;S'Dl>\t\u001fmk\u000f", "", "7c", "", "AsPAX", "\u001a`]1e6BR,H\rh9\u0003R!o\r._I\u0002!U5~\nKvz", "=tc=h;", "\u001a`]1e6BR,H\rh9\u0003R\u000ea\u000f$Q", "@t]\u000eg;>[$\u000eXh<\u0006\u0018", "", "5d]2e(MW#\b", "B`V@", "", ">q^4e,La", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@7?f\u0004i)w#41L<ur\f$dp9\\J(Wu4QPM?&d|J\u001a[9\n]'bh=()jU3h\u0018;M\t\u0005O\u0005\u001a%c\u001colSRYW\t\u0019|\u000b\u0010lTh5=8", "5dc\u0014X5>`\u0015\u000e~h5", "u(8", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0016W", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001ch;Ic(", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/^$\u000b<V", "Adc\u001ch;Ic(", "uKP;W9HW\u0018\u0012Dp6\n\u000fxD{7w\u0016D\b", "5dc\u001de6@`\u0019\r\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u001de6@`\u0019\r\t", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u001fh5\u001ab(~\u0003i;Z\u0013?n\u000f", "Adc\u001fh5\u001ab(~\u0003i;Z\u0013?n\u000f", "uH\u0018#", "5dc g(MS", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/q2\tFd \u0018Q.{Kr45/", "Adc g(MS", "uKP;W9HW\u0018\u0012Dp6\n\u000fxW\n5\u0002$\n\u0018!\u0006]\u001d8\u0006%\u000b\u001dn", "5dc!T.L", "Adc!T.L", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "BnF<e2\"\\\u001a\t", "\u001a`]1e6BR,H\rh9\u0003R!o\r._I\u0002!l", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class WorkInfoPojo {
        private final int generation;
        private String id;
        private Data output;
        private List<Data> progress;
        private int runAttemptCount;
        private WorkInfo.State state;
        private List<String> tags;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, Data data, int i2, int i3, List list, List list2, int i4, Object obj) {
            if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
                str = workInfoPojo.id;
            }
            if ((2 & i4) != 0) {
                state = workInfoPojo.state;
            }
            if ((i4 + 4) - (4 | i4) != 0) {
                data = workInfoPojo.output;
            }
            if ((i4 + 8) - (8 | i4) != 0) {
                i2 = workInfoPojo.runAttemptCount;
            }
            if ((i4 + 16) - (16 | i4) != 0) {
                i3 = workInfoPojo.generation;
            }
            if ((32 & i4) != 0) {
                list = workInfoPojo.tags;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                list2 = workInfoPojo.progress;
            }
            return workInfoPojo.copy(str, state, data, i2, i3, list, list2);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final Data component3() {
            return this.output;
        }

        public final int component4() {
            return this.runAttemptCount;
        }

        public final int component5() {
            return this.generation;
        }

        public final List<String> component6() {
            return this.tags;
        }

        public final List<Data> component7() {
            return this.progress;
        }

        public final WorkInfoPojo copy(String id, WorkInfo.State state, Data output, int i2, int i3, List<String> tags, List<Data> progress) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new WorkInfoPojo(id, state, output, i2, i3, tags, progress);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return Intrinsics.areEqual(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && Intrinsics.areEqual(this.output, workInfoPojo.output) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.generation == workInfoPojo.generation && Intrinsics.areEqual(this.tags, workInfoPojo.tags) && Intrinsics.areEqual(this.progress, workInfoPojo.progress);
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + Integer.hashCode(this.generation)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        public WorkInfoPojo(String id, WorkInfo.State state, Data output, int i2, int i3, List<String> tags, List<Data> progress) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.id = id;
            this.state = state;
            this.output = output;
            this.runAttemptCount = i2;
            this.generation = i3;
            this.tags = tags;
            this.progress = progress;
        }

        public final String getId() {
            return this.id;
        }

        public final void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        public final WorkInfo.State getState() {
            return this.state;
        }

        public final void setState(WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.state = state;
        }

        public final Data getOutput() {
            return this.output;
        }

        public final void setOutput(Data data) {
            Intrinsics.checkNotNullParameter(data, "<set-?>");
            this.output = data;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public final void setRunAttemptCount(int i2) {
            this.runAttemptCount = i2;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final void setTags(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.tags = list;
        }

        public final List<Data> getProgress() {
            return this.progress;
        }

        public final void setProgress(List<Data> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.progress = list;
        }

        public final WorkInfo toWorkInfo() {
            return new WorkInfo(UUID.fromString(this.id), this.state, this.output, this.tags, !this.progress.isEmpty() ? this.progress.get(0) : Data.EMPTY, this.runAttemptCount, this.generation);
        }
    }

    /* JADX INFO: compiled from: WorkSpec.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u001e\u007fјnjO0LeVLZS@\u000fs{J$cҕw٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fV\"\u0007kDI\u0004z4\u070fa̓FoG\u074c\u001e{K<xtd\tv݈$أ}\u0005\tɝzn\u001e{\u0013[[\u0014\"6PrJR;U3!\"\u000eN&\u0011 lg|?vs\f@e'Y\u074bDĚ+_8ŧ֚\u0011P"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001euK 6X?Do>'j", "", "u(E", "!B7\u00127\u001c%3\u0013gdM&ih\u001bU_\u0016j _\u0011\u000b'^", "", "\"@6", "", "%NA\u0018R\u0010'4\u0003xb:\u0017gh\u001c", "\u001a`]1e6BR,Hvk*\u007fR-o\r(EP\u0010\u001b\u001e\u0011P\u001eEt49c\u0007u", "", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001eu_ ;S'Dl>\t\u001fmk\u000f", "\u001a`]1e6BR,H\rh9\u0003R!o\r._I\u0002!l", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = strTagWithPrefix;
        WORK_INFO_MAPPER = new Function() { // from class: androidx.work.impl.model.WorkSpec$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
            }
            return arrayList;
        }
        return null;
    }
}
