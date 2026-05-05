package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.View;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: PrefetchScheduler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq{<$i+yّCU(\u0007*ޛWN}gvJp\u000bK\u000f\f\u0016\u0001j:I]xc\u001a\u00151Xģ]M}ok8\u0011td\u0005P2P9*\u0005/\u001cbH*\u0012;N[\u0010 3XphVҫQ\u0005(\u0017NL.\u00126\\\u0016`fLzpR/Q\r0V\u0017-mD\u0015M;X\u001b;U|o3C@eG[9\u001c\t\u0015hs?1Q8QMn5>CI\"i|lH\"#Cg\r\f\u0005V`\u0013jx\fU:\u0016w\u001cd\u001c.\u0010\u0003\u001a\u0015d\u0006$\u0005UO\\4pǔ\nԧ7tzԟ\u0011\\\u0010gZ\u007f)k\rА1ő7+Aӕ7]oF1Ne\b[ٿ*ţ\u0005n)ż% n\"3Z\bSAQnLv\\`Բ?ъ\bpj̣z\u0010>W\u0018/*\u001d\u0005ϒ1ھ_9+ܩ<\u000eVG\u007fv3d?\u05c8kʐL@*Âޔ;F"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005G=\u001d\"re8qp,Ov6EO<*_RqM\u001b\u0012gc", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nQ*Qv&WSN92", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001bzW21a}}3t\u001d+IAAA", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004q", "1g^?X6@`\u0015\n}^9", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001b\u0012", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "4qP:X\u001aMO&\u000eib4|q+n\n6", "", "7r00g0OS", "", ">qT3X;<V\u0006~\u0007n,\u000b\u0018=", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nP,Z\u0007'U[$", ">qT3X;<V\u0007|}^+\r\u0010/d", "2n5?T4>", "", "4qP:X\u001bB[\u0019gvg6\u000b", "=m0/T5=]\"~y", "=m5<e.Hb(~\u0004", "=mA2`,FP\u0019\fz]", "@t]", "AbW2W<ES\u0004\fz_,\f\u00072", ">qT3X;<V\u0006~\u0007n,\u000b\u0018", "\u0011n\\=T5B]\"", "\u001eqT3X;<V\u0006~\u0007n,\u000b\u0018\u001dc\n3{$\t\"\u001e", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidPrefetchScheduler implements PrefetchScheduler, RememberObserver, Runnable, Choreographer.FrameCallback {
    private static long frameIntervalNs = 0;
    private long frameStartTimeNanos;
    private boolean isActive;
    private boolean prefetchScheduled;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final MutableVector<PrefetchRequest> prefetchRequests = new MutableVector<>(new PrefetchRequest[16], 0);
    private final Choreographer choreographer = Choreographer.getInstance();

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    public AndroidPrefetchScheduler(View view) {
        this.view = view;
        Companion.calculateFrameIntervalIfNeeded(view);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.isEmpty() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        PrefetchRequestScopeImpl prefetchRequestScopeImpl = new PrefetchRequestScopeImpl(this.frameStartTimeNanos + frameIntervalNs);
        boolean z2 = false;
        while (this.prefetchRequests.isNotEmpty() && !z2) {
            if (prefetchRequestScopeImpl.availableTimeNanos() <= 0 || this.prefetchRequests.getContent()[0].execute(prefetchRequestScopeImpl)) {
                z2 = true;
            } else {
                this.prefetchRequests.removeAt(0);
            }
        }
        if (z2) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        if (this.isActive) {
            this.frameStartTimeNanos = j2;
            this.view.post(this);
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
    public void schedulePrefetch(PrefetchRequest prefetchRequest) {
        this.prefetchRequests.add(prefetchRequest);
        if (this.prefetchScheduled) {
            return;
        }
        this.prefetchScheduled = true;
        this.view.post(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.isActive = true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.isActive = false;
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    /* JADX INFO: compiled from: PrefetchScheduler.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004O\r8\u000b4C\u0005'Bߚ(\u0007\u0015iy;TiV.jSX\u0010ө\u007f42]lwQ>m\u001a,#Oc\u001fsunbZ9Deب\u0018ѱn,Qǁ\u07b5a\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005G=\u001d\"re8qp,Ov6EO<*_RqM\u001b\u0012gL98\r\u0006YP\"q17+\u0018,W\u0011)f\u000b\u0017\u0016q=uw\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nP,Z\u0007'U[<*f]r\u0013", "<dgA99:[\u0019m~f,e\u0017", "", "uI\u0018#", "/uP6_(;Z\u0019m~f,e\u00058o\u000e", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PrefetchRequestScopeImpl implements PrefetchRequestScope {
        public static final int $stable = 0;
        private final long nextFrameTimeNs;

        public PrefetchRequestScopeImpl(long j2) {
            this.nextFrameTimeNs = j2;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequestScope
        public long availableTimeNanos() {
            return Math.max(0L, this.nextFrameTimeNs - System.nanoTime());
        }
    }

    /* JADX INFO: compiled from: PrefetchScheduler.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u0012\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u0017]Q\u007fg\u001dN\u000b\u000fQ\u0014\u001e\u0016'prI&\u0005k\u0013'2pq\u0016ݏYڱA9hҚȫ\t'"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005G=\u001d\"re8qp,Ov6EO<*_RqM\u001b\u0012gL,5\u0015\u0010UJ(xM\r", "", "u(E", "4qP:X\u0010Gb\u0019\f\fZ3e\u0017", "", "1`[0h3:b\u0019_\bZ4|l8t\u007f5\r<\bz\u00180o\u000e;v$", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void calculateFrameIntervalIfNeeded(android.view.View r6) {
            /*
                r5 = this;
                long r3 = androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.access$getFrameIntervalNs$cp()
                r1 = 0
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto L29
                android.view.Display r1 = r6.getDisplay()
                boolean r0 = r6.isInEditMode()
                if (r0 != 0) goto L2a
                if (r1 == 0) goto L2a
                float r1 = r1.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 < 0) goto L2a
            L20:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r1
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.access$setFrameIntervalNs$cp(r0)
            L29:
                return
            L2a:
                r1 = 1114636288(0x42700000, float:60.0)
                goto L20
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.Companion.calculateFrameIntervalIfNeeded(android.view.View):void");
        }
    }
}
