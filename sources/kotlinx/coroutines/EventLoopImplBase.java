package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\u0015\"4\u0012\u0006јnʑA0ZeP\u008cZS@\u000fsڔ<$i-yCAY\"}0\u0010WNmhvJh\u000bK\u000f\f\u0017\u0001jBI]ތe\u0012%2JģG3coE9vt>\u0005&4*8\u0010\u0005\t\u001a0S\u0018v\u0011CS\f\u00180HpHX\u0015M\u000b\u001f\u0018$TĨ1\u001e\u000bf~6vl\u0016<g\\=%\u0003SϮc2\u0003N\u001bH\u001d-\u001b\fy\u001eYV}I]Aa\u001a\u001fR\nU3C\u007fU\u001dhU9[S\u0002pN^\u0010\u0016%+}#\f\rlpMpn'?+}\u007f{T\u001c@\u0010z*\u001fl\f\u001c#?L\\L\u0003ff,yvɤW@^\"'H\u000e\u001cy6E7FGsV)\tiai/~;\n(%\u001eQ%\u001f)iq&dC:=w0OҨD=VsRpK\u0014\u001cp\u0011\u0018Z\f>n\u00183*0\u0017\u0017\u0004U\"M؝%k\u0010p\r~\u0005.xh\u0002t\u0003PNI\u0007\u001aeIq\f9b+\u0005\u07fbTTfVY`*\u007f\u001f\u0006\u001e\u0012N{`>7$nl\u0016hȬnMk6m5tdqn\u001a$\u001e9'9C\u007f{\u0010\u0010h=\u0014\bPp4pfpi<^jX:2v|@{\nuf\fAd\b\u007f*gD1GgEL\u0011EZA+;&Z1&\r\tK$1\u001fTx\u00171h\\\u001f\u0002\u0018|W]\u0015`P_\bQ}\u001f4\f:hb\u0013i\tGy\u000e~\u007fLub3\u0016Fd\n#.\"IU??)\u000e-.`\u0006\u0004թNCt_S*/\u000b\u0001\n\u0011Qg\\n6nGݝb;Q]\\/\"%gIֿ\n5\"\bm^zun\u0005\u000fiHar1dr\u000fv=[ȗ*ݵ\u0005y:~;9Q4=\u0018}\"=$2ow\u007fFy\u0011\u001a\\G<ג.І\u001aszScBIE\u001ak\rO:$\u001b\u0015x\u001bÀ\nɚ\r8%5NTr\u0005\u07b2<\n"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016\u0004", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005\u000b>i%/WPCA", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u001e\u0013[E", "\nh]6g\u0005", "u(E", "-pd2h,", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "", "-cT9T@>R", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014W]G\rO<N\u0007'\u001d", "-hb\u0010b4IZ\u0019\u000ez]", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015$y\u0018Cv!>/", "D`[BX", "", "7r2<`7ES(~y", "u(I", "Adc\u0010b4IZ\u0019\u000ez]", "uY\u0018#", "7r4:c;R", "<dgAG0FS", "", "5dc\u001bX?MB\u001d\u0007z", "u(9", "AgdAW6P\\", "", "AbW2W<ES\u0006~\tn4|d0t\u007f5Z@\b\u0013+", "Bh\\2@0EZ\u001d\r", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "AbW2W<ES|\b\fh2|r8T\u00040{J\u0011&", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uI;7T=:\u001d z\u0004`ui\u00198n{%\u0003@VZ}My\u001dCz.H#{*Dw&=QL;y}|\u0019vlC\u0015_)Uv\nCUM3\\(", ">q^0X:L<\u0019\u0012\n>=|\u0012>", "2hb=T;<V", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015R?Lg}%\u0011qc\u0003ss5Wr$NL$oM", "3m`BX<>", "B`b8", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016D\b", "3m`BX<>7!\n\u0002", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016D\f", "2d`BX<>", "u(;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V", "3m`BX<>2\u0019\u0006vr,{w+s\u00066", "1k^@X\u0018NS)~", "AbW2W<ES", "<nf", "2d[.l,=B\u0015\r\u0001", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014W]G\r9", "Ag^B_+.\\$z\bd", "AbW2W<ES|\u0007\u0006e", "", "@db2g\bEZ", "@db0[,=c ~Ve3[\t6a\u0014(z", "\u0012d[.l,=B\u0015\r\u0001", "\u0012d[.l,=@\u0019\r\u000bf,k\u0005=k", "\u0012d[.l,=@)\b\u0004Z)\u0004\t\u001ea\u000e.", "\u0012d[.l,=B\u0015\r\u0001J<|\u0019/", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _queue$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _delayed$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _isCompleted$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted$volatile");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004O\r8é6B\u0015\"4\u0012\u0006\u0007nj?2LeV:Zݷ0Ţm\u0012éT[Rp\u0004Ve\u001e\f\"!O|hwxX\\#I\u001f\b&x\u00190wXޯa\u0014\u00157Pu\b9[vU9\u000fx|\u0019h80@\u0012\u0005/#p\\`\t\tEc\u0012\"2PphV;P[܈\u0014ĂB \tȦ֚kX"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014UaG\u0017k,=r5M\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014W]G\r9", "<`]<G0FS", "", "1n]A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n`(\u0017P~tF\u00010\u0019a\t'\u0014i$.#(\"q>-\u001cljLPa6[\u00017VPW,j\u001cP9\u001d\u0010Z\u0015U'\n\fY\u001f.wS;(\u0018(X\u0006EqVO\u0007", "@t]", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class DelayedResumeTask extends DelayedTask {
        private final CancellableContinuation<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public DelayedResumeTask(long j2, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(j2);
            this.cont = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.resumeUndispatched(EventLoopImplBase.this, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004O\r8é6B\u0015\"4\u0012\u000e\u0007nj?2LeV.Zݷ2\u000fy\b<řa$\bّkUH|b\"_Rug\u0007J\t\fS\u0017\u0014\u0018\u0011nZM>x<\u0015Ƥ6DuDAS8CGh\r63)x6\u0001\u007f\u0013\u000b2*v\u001b=\u000f\u0014]\u001a\u0014HD\u001f>;\r,\bpŊ\b̧$\u0003&\\uUɍLx"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014UqB\u0010_)Uv\u0016CZT\u0002", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014W]G\r9", "<`]<G0FS", "", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "\nh]6g\u0005", "uI;7T=:\u001d z\u0004`ui\u00198n{%\u0003@VZ\b", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "@t]", "", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class DelayedRunnableTask extends DelayedTask {
        private final Runnable block;

        public DelayedRunnableTask(long j2, Runnable runnable) {
            super(j2);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.block;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u00186B\u0015\"4\u0012\u000e\u0007njO0LeV\u008cZݷ2\u000fy\u0003<$a&yCQU\"}(\rWNumvJ`\u0010K\u000f\u0014\u001f\u0001j2J]xs\u0012\u0017˰JoU3UڎE9nt>ӌ(20D\u0002ڎ\u00078@Ϻ@z)C4\fp/pvJT\u001dM3܅@\u0007n / \rg|9xp\f?\u0018#am\u0003[7c>\u0003e\rt[ܮ\u0011xg&9I\u007fD#=k\u00035e\fC\u0011X\n=3ؒmݧ+\u0012\u007fePp\u007fB0[S\u001by\u000b&\u000b\f\u001a|\u001aDCO\u0012^\u0001\u00126\u0014\u0013{;C4\u0012\u0014E`.[9\u0017\f\u001cS\rr\u0002a\u0019\u0006ld\u0018z\u0010Y_+\u000eWC9I\f\u0018u\f)\\=\u0014\u0005;%Y\u0005-%2ٲ\u001a\u05ce\u0019\u001b\\ȭ\"?_JUJd\t\bBDՑ|Ċ\u0006*\f\u0382\u0018.=\t)4'%=\\O\"Ow2RRr\u000f\u000bphYjhGn.%ju~_Ɉfֈh\u000f\u0004RZf: m\u001eZ\u0017\f\u0019c8j\nT!S#%яtȬnYe܃=1lKg\u0004\f\u0010]OlJ̹U\n"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014W]G\r9", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00148f}\u001c6[\u0012/M&;g?\u0007\u001fga\u000f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Ib{#Dw\u001f2bC:U1#\u0015fp\u000f", "", "<`]<G0FS", "", "\nh]6g\u0005", "uI\u0018#", "-gT.c", "D`[BX", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00148f}\u001c6[\u0012/M&;g?s", "6dP=", "5dc\u0015X(I", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u001b Vo\u001bEr,~H\u0001-7i\u0015\u001cID;N4\u001a >", "Adc\u0015X(I", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n$\\\u000b 3l\u0004*NC\u001ek0)j,R", "7mS2k", "", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "1n\\=T9>B#", "=sW2e", "Bh\\2G6\u001ef\u0019|\u000bm,", "", "<nf", "AbW2W<ES\bz\td", "2d[.l,=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014W]G\rO<N\u0007'\u001d", "3uT;g\u0013H]$", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016\u0004", "2hb=b:>", "", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {
        private volatile Object _heap;
        private int index = -1;
        public long nanoTime;

        public DelayedTask(long j2) {
            this.nanoTime = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(DelayedTask delayedTask) {
            long j2 = this.nanoTime - delayedTask.nanoTime;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == EventLoop_commonKt.DISPOSED_TASK) {
                    return;
                }
                DelayedTaskQueue delayedTaskQueue = obj instanceof DelayedTaskQueue ? (DelayedTaskQueue) obj : null;
                if (delayedTaskQueue != null) {
                    delayedTaskQueue.remove(this);
                }
                this._heap = EventLoop_commonKt.DISPOSED_TASK;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public ThreadSafeHeap<?> getHeap() {
            Object obj = this._heap;
            if (obj instanceof ThreadSafeHeap) {
                return (ThreadSafeHeap) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
            return this.index;
        }

        public final int scheduleTask(long j2, DelayedTaskQueue delayedTaskQueue, EventLoopImplBase eventLoopImplBase) {
            synchronized (this) {
                if (this._heap == EventLoop_commonKt.DISPOSED_TASK) {
                    return 2;
                }
                DelayedTaskQueue delayedTaskQueue2 = delayedTaskQueue;
                synchronized (delayedTaskQueue2) {
                    DelayedTask delayedTaskFirstImpl = delayedTaskQueue2.firstImpl();
                    if (eventLoopImplBase.isCompleted()) {
                        return 1;
                    }
                    if (delayedTaskFirstImpl == null) {
                        delayedTaskQueue.timeNow = j2;
                    } else {
                        long j3 = delayedTaskFirstImpl.nanoTime;
                        if (j3 - j2 < 0) {
                            j2 = j3;
                        }
                        if (j2 - delayedTaskQueue.timeNow > 0) {
                            delayedTaskQueue.timeNow = j2;
                        }
                    }
                    if (this.nanoTime - delayedTaskQueue.timeNow < 0) {
                        this.nanoTime = delayedTaskQueue.timeNow;
                    }
                    delayedTaskQueue2.addImpl(this);
                    return 0;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(ThreadSafeHeap<?> threadSafeHeap) {
            if (this._heap == EventLoop_commonKt.DISPOSED_TASK) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = threadSafeHeap;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int i2) {
            this.index = i2;
        }

        public final boolean timeToExecute(long j2) {
            return j2 - this.nanoTime >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + AbstractJsonLexerKt.END_LIST;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<I\u0007\"2\u0013}ј|ʑi6TgX.\u0001SX\u000e,\tD(i%\nCiW۟\u0002$\u000fR\\k8~X[#C=\bL|)0 ǉ\u0005ٕ\u0016\u000f:ԏŌC8"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014W]G\rO<N\u0007'\u001d", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00148f}\u001c6[\u0012/M&;g?s", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014W]G\r9", "Bh\\2A6P", "", "\nh]6g\u0005", "uI\u0018#", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long j2) {
            this.timeNow = j2;
        }
    }

    private final void closeQueue() {
        if (DebugKt.getASSERTIONS_ENABLED() && !isCompleted()) {
            throw new AssertionError();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_queue$volatile$FU, this, null, EventLoop_commonKt.CLOSED_EMPTY)) {
                    return;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                ((LockFreeTaskQueueCore) obj).close();
                return;
            } else {
                if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                    return;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                lockFreeTaskQueueCore.addLast((Runnable) obj);
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_queue$volatile$FU, this, obj, lockFreeTaskQueueCore)) {
                    return;
                }
            }
        }
    }

    private final Runnable dequeue() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof LockFreeTaskQueueCore) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                Object objRemoveFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
                if (objRemoveFirstOrNull != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                    return (Runnable) objRemoveFirstOrNull;
                }
                AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_queue$volatile$FU, this, obj, lockFreeTaskQueueCore.next());
            } else {
                if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                    return null;
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_queue$volatile$FU, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void enqueueDelayedTasks() {
        DelayedTask delayedTaskRemoveAtImpl;
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$volatile$FU.get(this);
        if (delayedTaskQueue == null || delayedTaskQueue.isEmpty()) {
            return;
        }
        AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
        long jNanoTime = abstractTimeSource != null ? abstractTimeSource.nanoTime() : System.nanoTime();
        do {
            DelayedTaskQueue delayedTaskQueue2 = delayedTaskQueue;
            synchronized (delayedTaskQueue2) {
                DelayedTask delayedTaskFirstImpl = delayedTaskQueue2.firstImpl();
                if (delayedTaskFirstImpl != null) {
                    DelayedTask delayedTask = delayedTaskFirstImpl;
                    delayedTaskRemoveAtImpl = delayedTask.timeToExecute(jNanoTime) ? enqueueImpl(delayedTask) : false ? delayedTaskQueue2.removeAtImpl(0) : null;
                }
            }
        } while (delayedTaskRemoveAtImpl != null);
    }

    private final boolean enqueueImpl(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_queue$volatile$FU, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                int iAddLast = lockFreeTaskQueueCore.addLast(runnable);
                if (iAddLast == 0) {
                    return true;
                }
                if (iAddLast == 1) {
                    AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_queue$volatile$FU, this, obj, lockFreeTaskQueueCore.next());
                } else if (iAddLast == 2) {
                    return false;
                }
            } else {
                if (obj == EventLoop_commonKt.CLOSED_EMPTY) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new LockFreeTaskQueueCore(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                lockFreeTaskQueueCore2.addLast((Runnable) obj);
                lockFreeTaskQueueCore2.addLast(runnable);
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_queue$volatile$FU, this, obj, lockFreeTaskQueueCore2)) {
                    return true;
                }
            }
        }
    }

    private final /* synthetic */ Object get_delayed$volatile() {
        return this._delayed$volatile;
    }

    private final /* synthetic */ int get_isCompleted$volatile() {
        return this._isCompleted$volatile;
    }

    private final /* synthetic */ Object get_queue$volatile() {
        return this._queue$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return _isCompleted$volatile$FU.get(this) != 0;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void rescheduleAllDelayed() {
        DelayedTask delayedTaskRemoveFirstOrNull;
        AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
        long jNanoTime = abstractTimeSource != null ? abstractTimeSource.nanoTime() : System.nanoTime();
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$volatile$FU.get(this);
            if (delayedTaskQueue == null || (delayedTaskRemoveFirstOrNull = delayedTaskQueue.removeFirstOrNull()) == null) {
                return;
            } else {
                reschedule(jNanoTime, delayedTaskRemoveFirstOrNull);
            }
        }
    }

    private final int scheduleImpl(long j2, DelayedTask delayedTask) {
        if (isCompleted()) {
            return 1;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$volatile$FU.get(this);
        if (delayedTaskQueue == null) {
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_delayed$volatile$FU, this, null, new DelayedTaskQueue(j2));
            Object obj = _delayed$volatile$FU.get(this);
            Intrinsics.checkNotNull(obj);
            delayedTaskQueue = (DelayedTaskQueue) obj;
        }
        return delayedTask.scheduleTask(j2, delayedTaskQueue, this);
    }

    private final void setCompleted(boolean z2) {
        _isCompleted$volatile$FU.set(this, z2 ? 1 : 0);
    }

    private final /* synthetic */ void set_delayed$volatile(Object obj) {
        this._delayed$volatile = obj;
    }

    private final /* synthetic */ void set_isCompleted$volatile(int i2) {
        this._isCompleted$volatile = i2;
    }

    private final /* synthetic */ void set_queue$volatile(Object obj) {
        this._queue$volatile = obj;
    }

    private final boolean shouldUnpark(DelayedTask delayedTask) {
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$volatile$FU.get(this);
        return (delayedTaskQueue != null ? delayedTaskQueue.peek() : null) == delayedTask;
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0012Y)4]q`H9\nx\u0018SyK{o\\\tcg{\feP\revMK0A;\u001e\u0016Y~6`W?%L9(\u0011YSM)\u000b9\u0010v\u0011sv\"Z\u0010;m7\n\bQ\u0013~\u0010T3")
    @InterfaceC1492Gx
    public Object delay(long j2, Continuation<? super Unit> continuation) {
        return Delay.DefaultImpls.delay(this, j2, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo10550dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        enqueue(runnable);
    }

    public void enqueue(Runnable runnable) {
        enqueueDelayedTasks();
        if (enqueueImpl(runnable)) {
            unpark();
        } else {
            DefaultExecutor.INSTANCE.enqueue(runnable);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    protected long getNextTime() {
        DelayedTask delayedTaskPeek;
        if (super.getNextTime() == 0) {
            return 0L;
        }
        Object obj = _queue$volatile$FU.get(this);
        if (obj != null) {
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                return obj == EventLoop_commonKt.CLOSED_EMPTY ? Long.MAX_VALUE : 0L;
            }
            if (!((LockFreeTaskQueueCore) obj).isEmpty()) {
                return 0L;
            }
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$volatile$FU.get(this);
        if (delayedTaskQueue == null || (delayedTaskPeek = delayedTaskQueue.peek()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = delayedTaskPeek.nanoTime;
        AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
        return RangesKt.coerceAtLeast(j2 - (abstractTimeSource != null ? abstractTimeSource.nanoTime() : System.nanoTime()), 0L);
    }

    public DisposableHandle invokeOnTimeout(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return Delay.DefaultImpls.invokeOnTimeout(this, j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.EventLoop
    protected boolean isEmpty() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) _delayed$volatile$FU.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.isEmpty()) {
            return false;
        }
        Object obj = _queue$volatile$FU.get(this);
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                return ((LockFreeTaskQueueCore) obj).isEmpty();
            }
            if (obj != EventLoop_commonKt.CLOSED_EMPTY) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
        if (processUnconfinedEvent()) {
            return 0L;
        }
        enqueueDelayedTasks();
        Runnable runnableDequeue = dequeue();
        if (runnableDequeue == null) {
            return getNextTime();
        }
        runnableDequeue.run();
        return 0L;
    }

    protected final void resetAll() {
        _queue$volatile$FU.set(this, null);
        _delayed$volatile$FU.set(this, null);
    }

    public final void schedule(long j2, DelayedTask delayedTask) {
        int iScheduleImpl = scheduleImpl(j2, delayedTask);
        if (iScheduleImpl == 0) {
            if (shouldUnpark(delayedTask)) {
                unpark();
            }
        } else if (iScheduleImpl == 1) {
            reschedule(j2, delayedTask);
        } else if (iScheduleImpl != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    protected final DisposableHandle scheduleInvokeOnTimeout(long j2, Runnable runnable) {
        long jDelayToNanos = EventLoop_commonKt.delayToNanos(j2);
        if (jDelayToNanos >= DurationKt.MAX_MILLIS) {
            return NonDisposableHandle.INSTANCE;
        }
        AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
        long jNanoTime = abstractTimeSource != null ? abstractTimeSource.nanoTime() : System.nanoTime();
        DelayedRunnableTask delayedRunnableTask = new DelayedRunnableTask(jDelayToNanos + jNanoTime, runnable);
        schedule(jNanoTime, delayedRunnableTask);
        return delayedRunnableTask;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo10551scheduleResumeAfterDelay(long j2, CancellableContinuation<? super Unit> cancellableContinuation) {
        long jDelayToNanos = EventLoop_commonKt.delayToNanos(j2);
        if (jDelayToNanos < DurationKt.MAX_MILLIS) {
            AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
            long jNanoTime = abstractTimeSource != null ? abstractTimeSource.nanoTime() : System.nanoTime();
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(jDelayToNanos + jNanoTime, cancellableContinuation);
            schedule(jNanoTime, delayedResumeTask);
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuation, delayedResumeTask);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadLocalEventLoop.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        setCompleted(true);
        closeQueue();
        while (processNextEvent() <= 0) {
        }
        rescheduleAllDelayed();
    }
}
