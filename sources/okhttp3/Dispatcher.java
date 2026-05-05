package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4E\u0007\"B\u0012\u007f\u0007lnA0RkP.XY2\u000f\u0002{<$q$yCQU\"}(\nWNugvJ`\u0011K\u000f\u0014\"\u0001j2J]xs\u0012\u00172HpG3[xEʠhtD#(288\u0002\u0005\u0007\u001c@Ϻ@v)B\f\u0019\u0018DPtHR%M3\u001bŪ\n>.\u0003^_ʄR6Vo&>=?\u001bipkov>\u001be\rtqW\u0015\u0005\u00016/nO\u0006\u0015SlIޗқ_?\t_:P\u0013\n?'Yf$[Dw\u0018\u0014CD\u0016Օǁv&b'\u001ak\u001a'CO\u0012L\u0017\u0013߭{z\u00020\u0005\u0018\u001c*?ND,H~X\u000ea\u000e#WNu\u001a^p&Aa~>3'K+g8\u0007Sgݢ'vg\u0006\u001366)\u0011p1[\u001b6\u000f?KX\u0006pIQ\u0007e\u000fN̆]={/9u\u0010Q\u001c0u\u001d_\u007f\u001fM/%et\u007f\u05fa\u074co\u0002Np0\u000e\u0013\b\u0001S\u0018oxH0\u000e.;X!\\Zr}KߘÏXX2=\u0016\"b4\u0016\bAN#w\u0005+3?fUxkzM\f;S_/;g!\u0004\u000e\u0006G'=C\u0005{\u0016qT\u0007\u0014mm\u00115!jP\b$Z\u000b6rAVj(w*E\u0005QƱ6C\n\u001e:,?\u001d-#V\b6DW{7`1ӓ\u001cњX3,Ѱ:L\u0003\u0011\u0019Rro\u001en)O:\u0003x$C@\u007f<Oj\u0014f?؛\tɠ\u000b\u000b{Ò_iRPZv6w[\u0007.\"j]_<U\u0013=\rY6\u0010:]L!s\b\u0012PkQۧ\u0006ӛ?t6Ԗ lv;nzjQZ(0\t/\u00171\u001b|\u007f(ov~Uvl\u000b\nL\u007f7A\u001e\u0013҅D٫\t+&ݒ\u0019q(\u0011C=c)#+\u0006&\u007f+os\u0002y>\u007fr\u0013T\r6\u0004Z|D\u00079Ж_щ?8QʲOT0>\u0005\rRNz{6ZY4;LvX;ݨXиQ\u000b7̎7\u0019:(\t\\k<#o,M\\v\u0001ϕE\u0382\u0018^KљݷQ\t"}, d2 = {"\u001anZ5g;I!b]~l7x\u0018-h\u007f5Q", "", "3wT0h;H`\u0007~\bo0z\t", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012#Y\u000b1;k\u0016\u0004", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`vZo\fL\u0006/BG}-Hq\u0014.#\u0007,", "u(E", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`'\u0003\u000e:\u00074?fk D~\u001a,M\u0019", "3wT0h;H`\u0007~\bo0z\t\u0019rh8\u0003G", "\nrTA \u0006\u0017", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "7c[26(EZ\u0016zxd", "5dc\u0016W3>1\u0015\u0006\u0002[(z\u000f", "u(;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V", "Adc\u0016W3>1\u0015\u0006\u0002[(z\u000f", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016D\b", ";`g\u001fX8NS'\u000e\t", "", "5dc\u001aT?+S%\u000fzl;\u000b", "u(8", "Adc\u001aT?+S%\u000fzl;\u000b", "uH\u0018#", ";`g\u001fX8NS'\u000e\tI,\nk9s\u000f", "5dc\u001aT?+S%\u000fzl;\u000bs/rb2\nO", "Adc\u001aT?+S%\u000fzl;\u000bs/rb2\nO", "@dP1l\bLg\"|XZ3\u0004\u0017", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CD\u007f4\f@V", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001dl)QOt2{\u0011oh\u000f", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001d\u0004", "@t];\\5@/'\u0013\u0004\\\nx\u00106s", "@t];\\5@A-\bx<(\u0004\u0010=", "1`]0X3\u001aZ ", "", "3m`BX<>", "1`[9", "3m`BX<>\u0012#\u0005}m;\b", "3wT0h;>R", "3wT0h;>RW\t\u0001a;\f\u0014", "zcT=e,<O(~yX,\u0010\t-u\u000f2\t.\u0001$(Km\u000e", "4h]18?Ba(\u0003\u0004`\nx\u00106W\u00047~#\u000b%&", "6nbA", "", "4h]6f/>R", "\"", "1`[9f", "\u001aiPCTuNb\u001d\u0006D=,\t\u0019/;", "uKY.i(\bc(\u0003\u0002(\u000b|\u0015?eU\u000f\u0001<\u0012\u0013`Nk\u0017>@\u000f2^}\u001eFCY\u001f", "4h]6f/>RW\t\u0001a;\f\u0014", ">q^:b;>/\"}Zq,z\u0019>e", "", "?tTBX+\u001cO \u0006\t", "", "\u001anZ5g;I!b\\ve3R", "?tTBX+\u001cO \u0006\t<6\r\u0012>", "@t];\\5@1\u0015\u0006\u0002l", "@t];\\5@1\u0015\u0006\u0002l\n\u0007\u00198t", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
            if (Intrinsics.areEqual(asyncCall.getHost(), str)) {
                return asyncCall;
            }
        }
        for (RealCall.AsyncCall asyncCall2 : this.readyAsyncCalls) {
            if (Intrinsics.areEqual(asyncCall2.getHost(), str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t2) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t2)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            Unit unit = Unit.INSTANCE;
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean promoteAndExecute() {
        int i2;
        boolean z2;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.AsyncCall asyncCall = it.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                }
                if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    it.remove();
                    asyncCall.getCallsPerHost().incrementAndGet();
                    Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.runningAsyncCalls.add(asyncCall);
                }
            }
            z2 = runningCallsCount() > 0;
            Unit unit = Unit.INSTANCE;
        }
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((RealCall.AsyncCall) arrayList.get(i2)).executeOn(executorService());
        }
        return z2;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "executorService", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m10699deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getCall().cancel();
        }
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getCall().cancel();
        }
        Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall call) {
        RealCall.AsyncCall asyncCallFindExistingCallWithHost;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(call);
            if (!call.getCall().getForWebSocket() && (asyncCallFindExistingCallWithHost = findExistingCallWithHost(call.getHost())) != null) {
                call.reuseCallsPerHostFrom(asyncCallFindExistingCallWithHost);
            }
            Unit unit = Unit.INSTANCE;
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.runningSyncCalls.add(call);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(Util.okHttpName + " Dispatcher", false));
        }
        executorService = this.executorServiceOrNull;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, call);
    }

    public final void finished$okhttp(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        finished(this.runningSyncCalls, call);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> listUnmodifiableList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayDeque, 10));
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> listUnmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayDeque2, 10));
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.plus((Collection) arrayDeque, (Iterable) arrayList));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i2).toString());
        }
        synchronized (this) {
            this.maxRequests = i2;
            Unit unit = Unit.INSTANCE;
        }
        promoteAndExecute();
    }

    public final void setMaxRequestsPerHost(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i2).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i2;
            Unit unit = Unit.INSTANCE;
        }
        promoteAndExecute();
    }
}
