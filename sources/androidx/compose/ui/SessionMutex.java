package androidx.compose.ui;

import com.dynatrace.android.agent.Global;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
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
/* JADX INFO: compiled from: SessionMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&˛\bDRш|\u0004G\u00078\u000bDB\u0007\"B\u0012\u007f\u0007|jA0JhP.`\\2\u000fq}<$i*yCAV\"}0\u0015WNmjvJp\u000bK\u000f\u001c\u0016\u0001̓4Ikxe\u0012%2JoE3UoS9ht<\u0007&ݍ`Nц-\u0003 ݒV\u000f'zqKD\u0011U\u0001w@fҫQ\u0007 \u0013\u0014@`0$\\wrDK\u0005}J93\u000byD^'\u0016ܞ\u0013L;K\u0003+u\u0005q(;HG7%%\nΈ\u001dQ\nDaEџA\u0007n(52\u0012\feAp\u007fB![U\u001bj\u000b(r\u0004\u007f`R̃,յgMV\u001c6\u0007C\n\u001bL\u001c\u000e48\u000fΪ,բj\n\u0014E\u0003\u0006\u001cN^\u0016vB.\u0010(پ\u0016Ӿ\u000451O)}\u001a=I1f7B\u001e- )\u007f|:\fd\u001cz-'dya1\u007f\\MJ^\n\u0010Ɲ\u001c\u001f!\u0012\u0010G\u001c[M~?\r!=M¦ھ_C)@{\bNdwx\u000bf\u000ftyZXF2p&7p\":|Th\u0015mfS\u0007,?kbΈEą\f\u0015&\u007f\u0006`q6\u001eVgj\u007fi\u0004Ϊ@içj;qpq\u0017eC/_CT{0q\\\u0007\u001cO>r\u0005\u000f٨XR:_\u000b,\u000b@Xt \u007f\fF^\fIԵUpJ9\u000b7o¥\u0017Ƞ\u0007\u001eJˆҚ\bbˆg0\u000f^C,\u0013k4tO\u007ff[\u001ft\u0016|2:\rj25QSE\u0019lT8gb\u0002\u0002\rґw&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nn\u0017%Us\u0018E^5DY\u0011u", "\"", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u001bMD;x4'\u0013h7", "1ta?X5MA\u0019\r\tb6\u0006k9l~(\t", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nn\u0017%Us\u0018E^5DY\u0011^%m$<QMDA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\&!Os\f)v&5f})5mk", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>% \f_=J@7VPUuZ\\{;$\u001fg\u000eW:V\u0001hK,rB\u0001z\u00176Q\u00069U\u0001\r\u0016\u001b5snB,", "1ta?X5MA\u0019\r\tb6\u0006", "5dc\u0010h9KS\"\u000eh^:\u000b\r9nG,\u0004K\b", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>% \f_=J@.CUPuFOw=\u0012!0", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001e\u0003", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>%\u001d", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>% \f_=J@.CUPuJa\u007fA\u001d\u00140", "Ehc5F,La\u001d\t\u0004<(\u0006\u0007/l\u0007,\u0005Bk$\u0017Xs\u0018L\u0005", Global.BLANK, "Adb@\\6G7\"\u0003\nb(\u0004\rDe\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "Adb@\\6G", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2`c.", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "Ehc5F,La\u001d\t\u0004<(\u0006\u0007/l\u0007,\u0005Bk$\u0017Xs\u0018L\u0005l9a\t'", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>H?\u0011r3R\u007fpL]Vu]b{;#\u0016d\u0017\\tm\u0015b?3rN@j]\u0013O\fJo\u0005\u0015_\u0013Fr:Cf\u0019E\t\u0019\u007fJ72'ihwVEOkv:re'kA>-]o#(r`=\u000e\u0005S\u001f<0\u0004pvK\"\u000b43Bwd\u001c\tVZ8\u0006#hRw\u0001\u0014{Bq0t+\u0013\n", "!db@\\6G", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class SessionMutex<T> {
    private final AtomicReference<Session<T>> currentSessionHolder;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ SessionMutex m3785boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    /* JADX INFO: renamed from: constructor-impl */
    private static <T> AtomicReference<Session<T>> m3787constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m3788equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && Intrinsics.areEqual(atomicReference, ((SessionMutex) obj).m3794unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m3789equalsimpl0(AtomicReference<Session<T>> atomicReference, AtomicReference<Session<T>> atomicReference2) {
        return Intrinsics.areEqual(atomicReference, atomicReference2);
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m3791hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m3792toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    public boolean equals(Object obj) {
        return m3788equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m3791hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m3792toStringimpl(this.currentSessionHolder);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ AtomicReference m3794unboximpl() {
        return this.currentSessionHolder;
    }

    private /* synthetic */ SessionMutex(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static <T> AtomicReference<Session<T>> m3786constructorimpl() {
        return m3787constructorimpl(new AtomicReference(null));
    }

    /* JADX INFO: renamed from: getCurrentSession-impl */
    public static final T m3790getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: withSessionCancellingPrevious-impl */
    public static final <R> Object m3793withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, Function1<? super CoroutineScope, ? extends T> function1, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new SessionMutex$withSessionCancellingPrevious$2(function1, atomicReference, function2, null), continuation);
    }

    /* JADX INFO: compiled from: SessionMutex.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\u0005(2\u0012\u000eј\u000fl?/Rdx.\u0001Sj\"{\u007fB%s$ EKY(\u0001:\t\u0006M˗knX^[R\u001d\u0007.x\u0019.֒Y~e܈'4HtM9\u001e\u0001K<xtl\u0004ڶ6*@y\u0013\n2,N\u0017\u0005\u0003ŸO\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nn\u0017%Us\u0018E^5DY\u0011^%m$<QMDA", "\"", "", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "D`[BX", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\ne!\u0014\u001dV\u00138\b!~`y)97\u007f+RC9z\na\u0006", "5dc\u0017b)", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ{!DE", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Session<T> {
        private final Job job;
        private final T value;

        public Session(Job job, T t2) {
            this.job = job;
            this.value = t2;
        }

        public final Job getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }
    }
}
