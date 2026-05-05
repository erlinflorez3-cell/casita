package com.biocatch.client.android.sdk.web;

import android.os.Handler;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.web.KeepAliveTimer;
import com.biocatch.client.android.sdk.web.WebViewConnection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.InterfaceC1492Gx;
import yg.OY;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0003<$a$yCI^\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0016\u0001j:I]xc\u0014\u0015˰Xģo3{n}hpxD\u000582P9\n\t\u000f\u001cBH>y\u000bKY\u0010*4nu\u000bR;N\u0015\u001e \fV /%lk\\>`l\fCǥ'\u0003wL\u0017-mA\u0015M;T\u001b'Uzo0C@eH]3a\u0017\u001fR\nR3Ew=\u0013}?'YU<[Dn\u0018\u0014C> \u0019kt>\\3T7ϲ)˦ScSִ^4\u0006\u0006\u0014\rj\u0010dͽ3ρ2-\"ǑX\u001cA\u0002\u000bUVO0l\u0019Ș\u0007ˋ:\u0017-Į\u00047G#~Q\u0010Do\u05ce9߉\t\r&ŀQz/al\u000e\u000f\u001cqƛyΦ5QH׀\u0019Z\u0018hUm2\u00019̦6˙4G\b\u07fcL!<\u001b=;\n>s!\u001a\u0003\u001fֶiЛ\t`pׅ:^V@:nD8\u0001¡\u000eʑHd\rߘÕXo"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0014MCFG;\"&hP=\u000fc9$", "", "EdQ#\\,P1#\b\u0004^*\f\r9n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u001d", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "EdQ\u001aX:LO\u001b~eh9\fz<a\u000b3{M", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u0006>N)DR\u0001K\u0010\u0014ZxX8\u001cvf=/yDDt", "Bh\\2e", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<;", "AkPCX\u0012>S$Z\u0002b=|l8t\u007f5\r<\b", "", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIm\u0013w?C8\\8\u001e'FkB\u0010c*]z1P\"5(eQ\u007fG\u0018\u0011$\u0018\\to\u0001b@+nQ\r\u0006\u00066QK8l\u000b\n\u0012\u001d3m:@]\u0014G\u0003$?=2gSccx\u0011ODhsv\f\\fN:7\u0015\u0018q+xrY7\nyb\u0015|[8YgD\u0001zF2:o[1O|d.\u0002#*V{\u0005g\u0019]p<pv\u0014C.=.sOo\u0018K4]X\u001d", "7rC6`,K1\u0015\bx^3|\b", "", "@dR<a5>Q(l\u0002Z=|w+s\u0006", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<T{6\u0002\u0016", "Bh\\2e\b<Q\u0019\r\tE6z\u000f", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "1qT.g,+S\u0017\t\u0004g,z\u0018\u001ea\u000e.", "@db2g", "", "AbW2W<ES\u0006~xh5\u0006\t-t", "Ag^B_+)c&\u0001z", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class KeepAliveTimer {
    private final Handler handler;
    private boolean isTimerCanceled;
    private TimerTask reconnectSlaveTask;
    private final long slaveKeepAliveInterval;
    private final Timer timer;
    private Object timerAccessLock;
    private final WebViewConnection.WebMessagePortWrapper webMessagePortWrapper;
    private final WebViewConnection webViewConnection;

    /* JADX INFO: renamed from: com.biocatch.client.android.sdk.web.KeepAliveTimer$createReconnectTask$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"1n\\{U0HQ\u0015\u000exauz\u00103e\t7E<\n\u0016$Qs\r\u0006\u0005$;#\u0010 47{.MN\u0017r8/\u0015WeA\u0007pjL\u0004'C[N\u0019\\P|F\u001d\u0012X\u001d='\u001b\u000b\u0018\r", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<T{6\u0002\u0016", "@t]", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends TimerTask {
        AnonymousClass1() {
        }

        /* JADX INFO: renamed from: run$lambda-0 */
        public static final void m7045run$lambda0(KeepAliveTimer this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.webMessagePortWrapper.setConnected(false);
            this$0.webViewConnection.connect();
            Log.Companion.getLogger().info("Slave is not available, trying to reconnect.");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() throws Throwable {
            Handler handler = KeepAliveTimer.this.handler;
            final KeepAliveTimer keepAliveTimer = KeepAliveTimer.this;
            Object[] objArr = {new Runnable() { // from class: com.biocatch.client.android.sdk.web.KeepAliveTimer$createReconnectTask$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveTimer.AnonymousClass1.m7045run$lambda0(keepAliveTimer);
                }
            }};
            Method method = Class.forName(C1561oA.Qd("\u0001\r\u0002\u000f\u000b\u0004}F\u0007\nC\\t\u0001u|t\u0001", (short) (C1580rY.Xd() ^ (-28876)))).getMethod(C1561oA.od("\u0006\u0004\u0007\u0007", (short) (OY.Xd() ^ 24175)), Class.forName(C1593ug.zd("\"\u001a0\u001ci)\u001f-'n\u0014823')4.", (short) (OY.Xd() ^ 27834), (short) (OY.Xd() ^ 9640))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public KeepAliveTimer(WebViewConnection webViewConnection, Handler handler, WebViewConnection.WebMessagePortWrapper webMessagePortWrapper, Timer timer, long j2) {
        Intrinsics.checkNotNullParameter(webViewConnection, "webViewConnection");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(webMessagePortWrapper, "webMessagePortWrapper");
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.webViewConnection = webViewConnection;
        this.handler = handler;
        this.webMessagePortWrapper = webMessagePortWrapper;
        this.timer = timer;
        this.slaveKeepAliveInterval = j2;
        this.timerAccessLock = new Object();
    }

    private final TimerTask createReconnectTask() {
        return new AnonymousClass1();
    }

    public static /* synthetic */ void scheduleReconnect$default(KeepAliveTimer keepAliveTimer, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        keepAliveTimer.scheduleReconnect(z2);
    }

    public final void reset() {
        TimerTask timerTask = this.reconnectSlaveTask;
        Intrinsics.checkNotNull(timerTask);
        timerTask.cancel();
        scheduleReconnect(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x000e A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:22:0x0005, B:23:0x000a, B:25:0x000e, B:26:0x001b), top: B:32:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void scheduleReconnect(boolean r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.timerAccessLock
            monitor-enter(r4)
            if (r6 == 0) goto La
            java.util.Timer r0 = r5.timer     // Catch: java.lang.Throwable -> L1f
            r0.purge()     // Catch: java.lang.Throwable -> L1f
        La:
            boolean r0 = r5.isTimerCanceled     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1b
            java.util.TimerTask r3 = r5.createReconnectTask()     // Catch: java.lang.Throwable -> L1f
            r5.reconnectSlaveTask = r3     // Catch: java.lang.Throwable -> L1f
            java.util.Timer r2 = r5.timer     // Catch: java.lang.Throwable -> L1f
            long r0 = r5.slaveKeepAliveInterval     // Catch: java.lang.Throwable -> L1f
            r2.schedule(r3, r0)     // Catch: java.lang.Throwable -> L1f
        L1b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            return
        L1f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.biocatch.client.android.sdk.web.KeepAliveTimer.scheduleReconnect(boolean):void");
    }

    public final void stop() {
        synchronized (this.timerAccessLock) {
            this.timer.cancel();
            this.isTimerCanceled = true;
            Unit unit = Unit.INSTANCE;
        }
    }
}
