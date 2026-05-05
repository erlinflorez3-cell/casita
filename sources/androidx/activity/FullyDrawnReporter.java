package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012\u0006\u0007nj?0LeV7ZS0\u0010s{BCc$wCCU0}*\tUNog|Pb\u000bI\u0015\u001cǝ)jZH\u0016\u0012m\u0016\u001d2Zom4]yK;xzF\u000702P<(\bв\u001e*V\u0015?\rQ]$\u0012^D!D` e\u000b*\u0014\u0016>N\u0005L_0RD\\\u0005]h3k\twWf'\u000e4CRULb=%v\u0010\"q@\u007fG#<k\u00035V\fI\u0011R\nC\u0015j7'YM\"Z~\\\u000e,-+}\u0011.~4\\\u001dQ\u000f\r}ˆQӍOP\u0016ߊH\n\n\u0013T\u0004<\r]\rͶ1\u001e~\n\u00149\u0003z$L^\u000bvB.y8ت\u0019Ӿ\u000433ݍk\u0001_kS%^?\f\u000b\u001d 3\u0001\u001d%\nW<kK\u001b+ȱSśU@Eʰ\u001f\u001cg?\u0006\n\u0001d\u0012*24u\u0003\u0006Ɉ\u0013ѧ\u001b%?ك\n3/w\u001aHrn-\u0005\u001fh*֣^͕D\"vݫ\b6\u0017\u0019rD\u0013\u0013B¯Vг0\u0011Uȼ%\u0017\f\u0017+ \u000b~r!c\u0010%мtȬnMe܃u?tGqn\u001a\u001f\u000e9\u001d3\fȥoߧeR~ܝ͜@{"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\\P\b\u001e+&|\nN\u007f\u00125d\b-Fm#\u0004", "", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "@d_<e;\u001fc \u0006\u000f=9x\u001b8", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`vZo\fL\u0006/B/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F^g\u001e~", "7r5B_3R2&z\rg\u0019|\u00149r\u000f(z", "", "u(I", ":nR8", "=mA2c6Kbvz\u0002e)x\u00075s", "", "@d_<e;)]'\u000ez]", "@d_<e;+c\"\bv[3|", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "@d_<e;>Ry\u000f\u0002e@[\u0016+w\t", "@d_<e;>`v\t\u000bg;", "", "/cS\u001ca\u0019>^#\f\n=9x\u001b8L\u00046\u000b@\n\u0017$", "1`[9U(<Y", "/cS\u001fX7H`(~\b", "4t[9l\u000bKO+\bg^7\u0007\u0016>e~", ">nbAJ/>\\\u0006~\u0006h9\f\t<s[5{\u001f\u000b \u0017", "@d\\<i,(\\\u0006~\u0006h9\fg<a\u00121bD\u000f&\u0017Po\u001b", "@d\\<i,+S$\t\bm,\n", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;
    private final List<Function0<Unit>> onReportCallbacks;
    private final Function0<Unit> reportFullyDrawn;
    private boolean reportPosted;
    private final Runnable reportRunnable;
    private boolean reportedFullyDrawn;
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, Function0<Unit> reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.FullyDrawnReporter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.reportRunnable$lambda$2(this.f$0);
            }
        };
    }

    public final boolean isFullyDrawnReported() {
        boolean z2;
        synchronized (this.lock) {
            z2 = this.reportedFullyDrawn;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.lock) {
            this$0.reportPosted = false;
            if (this$0.reporterCount == 0 && !this$0.reportedFullyDrawn) {
                this$0.reportFullyDrawn.invoke();
                this$0.fullyDrawnReported();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.reporterCount++;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeReporter() {
        int i2;
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn && (i2 = this.reporterCount) > 0) {
                this.reporterCount = i2 - 1;
                postWhenReportersAreDone();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void addOnReportDrawnListener(Function0<Unit> callback) {
        boolean z2;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z2 = true;
            } else {
                this.onReportCallbacks.add(callback);
                z2 = false;
            }
        }
        if (z2) {
            callback.invoke();
        }
    }

    public final void removeOnReportDrawnListener(Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(callback);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            this.reportedFullyDrawn = true;
            Iterator<T> it = this.onReportCallbacks.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
            this.onReportCallbacks.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }
}
