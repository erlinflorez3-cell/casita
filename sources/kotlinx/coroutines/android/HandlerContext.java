package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonDisposableHandle;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0013nʑA0RnP.XY2\u000f\u0002{<řc$\u007fCC٥\"}8\tWN}gvJ`\fK\u000f\u0014\u001d\u0001̓4Ikxe܈\u00172XoG3SrE9nҚ>ӌ(20>\u0002ڎ\u0007ɝ@Ϻ@v)B{\f@0\u0001\u0012@R\u001dQ\u0013\u001b*\u0006l\"\u0011$jjf8^k\f>?'\u0011nZNUe݁\u0001O\u0013Mb/M\u0012g2;DE6-%\u0002\u0005\u0017Za?\u0011B\n?\u001bgU+ȅMu]=f\t\\#9\\%]!,\r\t_n$'Y^*_\u0019-6\b\u0013{;M4\u0012\u00145`.[)\u0017\u0010\u001cE\rv\u0002T9\u0002=UF\u000fˋ:\u00173\u0015{GG1~Q\u0010LIRE\u0013\u001d\rL;1x/tl\u0014p\u0017+T&b_k\u0007Q\u0011u\u0018tUm2\r\u0013\u00068\u001bHG.G,\u0019<)=;\nM\f!J\u0015xHu\u0005\u001d`\u0017b0f͕D\"|3\u007fI\u0017*rD\u0013\u0016\u001cTbfD\u0011{+\u0005\u000f\f\u001a+$\u000b\f%!\u0004#\u0015OŹmj[rR+=\u0006OY\u001doTk\u0002oAUic>g\u0003|\"`Td\u001bW\u0015d\u001aۥZ%.0U`j>\u001cBX\u001f\u0018!3WqJ6\u0003վ\u001bÅ\u0019H\u000bٜ\u0013O\u000b\fw\\~\u000f-X\nɷ\u0005Ȑ(t\u0011ɖ!h~t\u007fxw2Sʣ$έEQ=ӧvg0rL|QȔU͵\u0002ěkROƂ\u0005\u0018{`\n,گ\u001e^"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E<\n\u0016$Qs\r\u0006Y!>X\u0005 DK 7\\CNz\n", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E<\n\u0016$Qs\r\u0006Y!>X\u0005 DL\u001a<X?Ji7\u001e\">", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u001e\u0013[E", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "<`\\2", "", "7me<^,\"[!~yb(\f\t6y", "", "\nh]6g\u0005", "uKP;W9HW\u0018H\u0005lu_\u00058d\u0007(\t\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#8~\\", "uKP;W9HW\u0018H\u0005lu_\u00058d\u0007(\t\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#\u0007,", "7l\\2W0:b\u0019", "5dc\u0016`4>R\u001dz\n^", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0013 F|\u0018@un\u0018U\u0007\u001f>m#\fWLJkG-j", "7r36f7:b\u0017\u0002c^,{\t.", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "2hb=T;<V", "", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015R?Lg}%\u0011qc\u0003ss5Wr$NL$oM", "AbW2W<ES\u0006~\tn4|d0t\u007f5Z@\b\u0013+", "Bh\\2@0EZ\u001d\r", "", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "7me<^,(\\\b\u0003\u0003^6\r\u0018", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "uI;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005I>+\u001fxp=\u0010c\nX\u007f6G_]\u0002 9xG#\u0019^\u0017at\u000b\u000ffK4}H@\u001f\u0016u(\u0006Is\u000b\u001a\u0012\u000b<jS>_\u000fNyj", "1`]0X3(\\\u0006~\u007f^*\f\r9n", "BnBAe0GU", "3pd._:", "=sW2e", "", "6`b566=S", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eowI\u007f$!Kn"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class HandlerContext extends HandlerDispatcher implements Delay {
    private final Handler handler;
    private final HandlerContext immediate;
    private final boolean invokeImmediately;
    private final String name;

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : str);
    }

    private HandlerContext(Handler handler, String str, boolean z2) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z2;
        this.immediate = z2 ? this : new HandlerContext(handler, str, true);
    }

    private final void cancelOnRejection(CoroutineContext coroutineContext, Runnable runnable) {
        JobKt.cancel(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.getIO().mo10550dispatch(coroutineContext, runnable);
    }

    public static final void invokeOnTimeout$lambda$3(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.handler.removeCallbacks(runnable);
    }

    public static final Unit scheduleResumeAfterDelay$lambda$2(HandlerContext handlerContext, Runnable runnable, Throwable th) {
        handlerContext.handler.removeCallbacks(runnable);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo10550dispatch(CoroutineContext coroutineContext, Runnable runnable) throws Throwable {
        Handler handler = this.handler;
        Object[] objArr = {runnable};
        Method method = Class.forName(C1561oA.ud("O[P]YRL\u0015UX\u0012+CODKCO", (short) (Od.Xd() ^ (-20)))).getMethod(C1561oA.Yd("\u0003\u0003\b\n", (short) (C1580rY.Xd() ^ (-32434))), Class.forName(C1561oA.yd("\u001c\u0012*\u0014c!\u0019%!f\u000e0,+!!\u000e\u0006", (short) (C1499aX.Xd() ^ (-6179)))));
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(handler, objArr)).booleanValue()) {
                return;
            }
            cancelOnRejection(coroutineContext, runnable);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof HandlerContext) {
            HandlerContext handlerContext = (HandlerContext) obj;
            if (handlerContext.handler == this.handler && handlerContext.invokeImmediately == this.invokeImmediately) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    public HandlerContext getImmediate() {
        return this.immediate;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j2, final Runnable runnable, CoroutineContext coroutineContext) throws Throwable {
        Handler handler = this.handler;
        long jCoerceAtMost = RangesKt.coerceAtMost(j2, DurationKt.MAX_MILLIS);
        Class<?> cls = Class.forName(Xg.qd("~\r\u0004\u0013\u0011\f\bR\u0015\u001aUp\u000b\u0019\u0010\u0019\u0013!", (short) (OY.Xd() ^ 27078), (short) (OY.Xd() ^ 12298)));
        Class<?>[] clsArr = {Class.forName(Jg.Wd("O\u0016am0!+:IA[!OAJ\r-\u0018", (short) (C1633zX.Xd() ^ (-9185)), (short) (C1633zX.Xd() ^ (-23459)))), Long.TYPE};
        Object[] objArr = {runnable, Long.valueOf(jCoerceAtMost)};
        Method method = cls.getMethod(ZO.xd("\u00039x\u001fc \u0004mL~f", (short) (ZN.Xd() ^ 16483), (short) (ZN.Xd() ^ 31245)), clsArr);
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(handler, objArr)).booleanValue()) {
                return new DisposableHandle() { // from class: kotlinx.coroutines.android.HandlerContext$$ExternalSyntheticLambda0
                    @Override // kotlinx.coroutines.DisposableHandle
                    public final void dispose() {
                        HandlerContext.invokeOnTimeout$lambda$3(this.f$0, runnable);
                    }
                };
            }
            cancelOnRejection(coroutineContext, runnable);
            return NonDisposableHandle.INSTANCE;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return (this.invokeImmediately && Intrinsics.areEqual(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo10551scheduleResumeAfterDelay(long j2, final CancellableContinuation<? super Unit> cancellableContinuation) throws Throwable {
        final Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                cancellableContinuation.resumeUndispatched(this, Unit.INSTANCE);
            }
        };
        Handler handler = this.handler;
        long jCoerceAtMost = RangesKt.coerceAtMost(j2, DurationKt.MAX_MILLIS);
        Class<?> cls = Class.forName(C1626yg.Ud("p2+@c>0ie2@C9YJ.63", (short) (C1580rY.Xd() ^ (-6401)), (short) (C1580rY.Xd() ^ (-3907))));
        Class<?>[] clsArr = {Class.forName(Ig.wd("n\u001ddgd}N,qx#$IS:\u001aZi", (short) (C1499aX.Xd() ^ (-4741)))), Long.TYPE};
        Object[] objArr = {runnable, Long.valueOf(jCoerceAtMost)};
        Method method = cls.getMethod(EO.Od("\u0016e}\u0019Z(~\u0003f\"\u001f", (short) (Od.Xd() ^ (-7320))), clsArr);
        try {
            method.setAccessible(true);
            if (((Boolean) method.invoke(handler, objArr)).booleanValue()) {
                cancellableContinuation.invokeOnCancellation(new Function1() { // from class: kotlinx.coroutines.android.HandlerContext$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HandlerContext.scheduleResumeAfterDelay$lambda$2(this.f$0, runnable, (Throwable) obj);
                    }
                });
            } else {
                cancelOnRejection(cancellableContinuation.getContext(), runnable);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        String string = this.name;
        if (string == null) {
            string = this.handler.toString();
        }
        return this.invokeImmediately ? string + ".immediate" : string;
    }
}
