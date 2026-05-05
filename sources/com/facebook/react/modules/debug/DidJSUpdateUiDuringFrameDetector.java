package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import java.util.ArrayList;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012\u0006\u000enjO0LeN0ZS8\u0018s{:)c$\u007fCCU \u0001(ޛeȞ\u0018g\u001dI\u000b\u000bq\u000fF\u0019ѱn,WVAs \u001aJB\u001eIcQ}IQ`#:5$@/Py3\u0005`*\u0011$\u0005\t[K:\u001c`D~Ij\r{\tJ\u0016\u0014N8\u0001L`0TDY\u0005]hAi\u00172H\\:w0+_SZ\u001d-\u001b\u000by\u001eYR}I]+a\u0018\u001fR\nQIS:C\u0013~?'Y[:k\u0007t\u000e\u0016-;_\u000fmrT`3TI\u00127-_cyTl-N߁}Ɂ@\u0004\u0016ͺwd<32v\u0018\u0010Ct!WnSjdR\u0002\u000bad\u001b\u0004\u0005\nڂ;ӸjQiݢijE\u0003\u001d\u001d.%\u0011nO_\u0003\u0011I\u001b+V\bQ_U\u001fB\u001fݓ\fՒAm\f͏3\u001e8\fHW\u00101\f\u0011\\\u001bS:D?3#{\u0002vHF{[\u009ejרmRPؗrz$@B\t:d\u001bߢ\u0011\u07fbTT`\u008cҳQ3"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi\u0016q\u0015\u0013;3Fj0-\u0015Xe\u0018\u0017p0Wx\bTHV,;R\u0002=\u0012!d\u001b$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%\u00014$\\\u000b 3l\u0004*NC\u0018x8\u001d\u0017hE8\u000ec\u000bNs7I3R:kR{=!g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n4Yz097~8\\2>x4\u001a\u0014V]:\u0007T0N\t\nKL[(iPuQ\u0004\u001dY\n]+k\u0005VQ&UHE.\b5I\u000f\u0011", "u(E", "BqP;f0MW#\bih\t\r\u0017CE\u0011(\u0005O\u000f", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "BqP;f0MW#\bih\u0010{\u0010/E\u0011(\u0005O\u000f", "DhTD;0>`\u0015\fxa@l\u0014.a\u000f([I\r'\u0017Wo\r\u001c\b%>h\f", "DhTD;0>`\u0015\fxa@l\u0014.a\u000f(\\D\n\u001b%Jo\r\u001c\b%>h\f", "E`b\u0016W3>/(^\u0004]\u0016}o+s\u000f\t\t<\t\u0017", "", "2hS\u0012a+\u001f`\u0015\u0007zB+\u0004\t", "AsP?g\u001bB[\u0019", "3mS!\\4>", "5dc\u0011\\+#A{\u0003\n?9x\u0011/A\t'YG\u0001\u0013 Wz", "4qP:X\u001aMO&\u000eib4|q+n\n6", "4qP:X\fGR\b\u0003\u0003^\u0015x\u00129s", "=m1?\\+@Sw~\tm9\u0007\u001d/d", "", "=mC?T5LW(\u0003\u0005g\u001b\u0007e<i~*{\u001d\u0011%+", "=mC?T5LW(\u0003\u0005g\u001b\u0007e<i~*{$\u007f\u001e\u0017", "=mE6X>!W\u0019\fvk*\u007f\u001d\u001fp~$\u000b@` #Wo\u001e<u", "=mE6X>!W\u0019\fvk*\u007f\u001d\u001fp~$\u000b@a\u001b K}\u0011<u", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DidJSUpdateUiDuringFrameDetector implements NotThreadSafeBridgeIdleDebugListener, NotThreadSafeViewHierarchyUpdateDebugListener {
    private final ArrayList<Long> transitionToIdleEvents = new ArrayList<>(20);
    private final ArrayList<Long> transitionToBusyEvents = new ArrayList<>(20);
    private final ArrayList<Long> viewHierarchyUpdateEnqueuedEvents = new ArrayList<>(20);
    private final ArrayList<Long> viewHierarchyUpdateFinishedEvents = new ArrayList<>(20);
    private volatile boolean wasIdleAtEndOfLastFrame = true;

    private final boolean didEndFrameIdle(long j2, long j3) {
        long lastEventBetweenTimestamps = DidJSUpdateUiDuringFrameDetectorKt.getLastEventBetweenTimestamps(this.transitionToIdleEvents, j2, j3);
        long lastEventBetweenTimestamps2 = DidJSUpdateUiDuringFrameDetectorKt.getLastEventBetweenTimestamps(this.transitionToBusyEvents, j2, j3);
        return (lastEventBetweenTimestamps == -1 && lastEventBetweenTimestamps2 == -1) ? this.wasIdleAtEndOfLastFrame : lastEventBetweenTimestamps > lastEventBetweenTimestamps2;
    }

    public final synchronized boolean getDidJSHitFrameAndCleanup(long j2, long j3) {
        boolean z2;
        boolean zHasEventBetweenTimestamps = DidJSUpdateUiDuringFrameDetectorKt.hasEventBetweenTimestamps(this.viewHierarchyUpdateFinishedEvents, j2, j3);
        boolean zDidEndFrameIdle = didEndFrameIdle(j2, j3);
        z2 = true;
        if (!zHasEventBetweenTimestamps && (!zDidEndFrameIdle || DidJSUpdateUiDuringFrameDetectorKt.hasEventBetweenTimestamps(this.viewHierarchyUpdateEnqueuedEvents, j2, j3))) {
            z2 = false;
        }
        DidJSUpdateUiDuringFrameDetectorKt.cleanUp(this.transitionToIdleEvents, j3);
        DidJSUpdateUiDuringFrameDetectorKt.cleanUp(this.transitionToBusyEvents, j3);
        DidJSUpdateUiDuringFrameDetectorKt.cleanUp(this.viewHierarchyUpdateEnqueuedEvents, j3);
        DidJSUpdateUiDuringFrameDetectorKt.cleanUp(this.viewHierarchyUpdateFinishedEvents, j3);
        this.wasIdleAtEndOfLastFrame = zDidEndFrameIdle;
        return z2;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.transitionToBusyEvents.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.transitionToIdleEvents.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener
    public synchronized void onViewHierarchyUpdateEnqueued() {
        this.viewHierarchyUpdateEnqueuedEvents.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener
    public synchronized void onViewHierarchyUpdateFinished() {
        this.viewHierarchyUpdateFinishedEvents.add(Long.valueOf(System.nanoTime()));
    }
}
