package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
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
/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u0006\u000enj?1Le^.ZS0\u000fs{J$c$wCCU(}*\tUQog\u0005Jb\u000bI\u0013\f\u001b\u000f̓\\I\u0004w\u001e\u0015Ƥ6B}?{k}OQ`#I5$@6Py3\nJ.V%\u000fzqMŁ\u0011ؓϮt<X#[\u001cb#\u0014V8\u0001Lu˚M5֘kҗƠ3%\t\u0004PRou>\u0015e\rtmW\u0011\u0005|6+nPÆ\u0014Ǭ٨\u0007\tXwM \buK#\u0001'U>\u001a\u0014e7p\u007fB\u0017\u0002˾\u0019ȗq̦ڑ\u0004Pԃ\u001053OqRh\u0010.z\t\u007f->\n\u0013\u0014-\u0019F;\"~\b<<Kɂ_ĖT\u000efۍ\u0018|g@%) 51D)l\"sI%f7*\u0012c̗%ъr'c٪\u001eb\u001b)bw\"=_OUH|\u001a0Ơoձtb\nÏT<U\u0011G{?>m©9٦=#)ǽȸHMoy\u000b½\u0005\u0002hZHFAë\u001aV"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r,k;(\u0013lpMup(L|'T\"", "", "u(E", "1ta?X5M>#\u0003\u0004m,\ns9s\u00047\u007fJ\nr\u0015E\u007f\u0016L}!Dc\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u0010h9KS\"\u000eeh0\u0006\u0018/rj2\nD\u0010\u001b!PK\f:\u0007-E`y/Az]\u000f\u0019!\u000bH&hSxe3\u0014c3Nr5G", "u(9", "Adc\u0010h9KS\"\u000eeh0\u0006\u0018/rj2\nD\u0010\u001b!PK\f:\u0007-E`y/Az]4\u0015\u0012BW~\u0006Sxe3\u0014c3Nr5G", "uI\u0018#", "\u0018", ":`bA@6OSx\u0010zg;k\r7em7wH\f", "", "5dc\u0019T:M;#\u0010z>=|\u0012>T\u00040{.\u0010\u0013\u001fR.\u001e@p25`}\u001cEm", "Adc\u0019T:M;#\u0010z>=|\u0012>T\u00040{.\u0010\u0013\u001fR.\u001e@p25`}\u001cEm", "Asa.g,@g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r,k;(\u0013lpMup(L|'T\u0018-jJa\u007f9#\u0012\\\"$", "5dc g9:b\u0019\u0001\u000f\u001d(\u0006\u00129t{7\u007fJ\n%", "FUT9b*Bb-m\bZ*\u0003\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r,k;(\u0013lpMup(L|'T\u0018-\u0002", "GUT9b*Bb-m\bZ*\u0003\t<", "/cS\u001db:Bb\u001d\t\u0004", "", "Bh\\2@0EZ\u001d\r", ">nb6g0H\\", "/cS\u001db:Bb\u001d\t\u0004&\u001c\u000e[:0h\u0004", "uI9uI", "1`[0h3:b\u0019oze6z\r>y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "1`[0h3:b\u0019oze6z\r>yG{kSh\u0003i/", ";`g6`<FD\u0019\u0006\u0005\\0\f\u001d", "1`[0h3:b\u0019oze6z\r>yG\u0004^\rMixE", "uI\u0018\u0017", "@db2g\u001bKO\u0017\u0005~g.", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VelocityTracker {
    public static final int $stable = 8;
    private long currentPointerPositionAccumulator;
    private long lastMoveEventTimeStamp;
    private final VelocityTracker1D.Strategy strategy;
    private final VelocityTracker1D xVelocityTracker;
    private final VelocityTracker1D yVelocityTracker;

    private static /* synthetic */ void getStrategy$annotations() {
    }

    public VelocityTracker() {
        VelocityTracker1D.Strategy strategy;
        if (VelocityTrackerKt.getVelocityTrackerStrategyUseImpulse()) {
            strategy = VelocityTracker1D.Strategy.Impulse;
        } else {
            strategy = VelocityTracker1D.Strategy.Lsq2;
        }
        this.strategy = strategy;
        this.xVelocityTracker = new VelocityTracker1D(false, strategy, 1, null);
        this.yVelocityTracker = new VelocityTracker1D(false, strategy, 1, null);
        this.currentPointerPositionAccumulator = Offset.Companion.m3953getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release, reason: not valid java name */
    public final long m5486getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.currentPointerPositionAccumulator;
    }

    /* JADX INFO: renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m5487setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j2) {
        this.currentPointerPositionAccumulator = j2;
    }

    public final long getLastMoveEventTimeStamp$ui_release() {
        return this.lastMoveEventTimeStamp;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long j2) {
        this.lastMoveEventTimeStamp = j2;
    }

    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m5483addPositionUv8p0NA(long j2, long j3) {
        this.xVelocityTracker.addDataPoint(j2, Offset.m3937getXimpl(j3));
        this.yVelocityTracker.addDataPoint(j2, Offset.m3938getYimpl(j3));
    }

    /* JADX INFO: renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m5484calculateVelocity9UxMQ8M() {
        return m5485calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* JADX INFO: renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m5485calculateVelocityAH228Gc(long j2) {
        if (!(Velocity.m6875getXimpl(j2) > 0.0f && Velocity.m6876getYimpl(j2) > 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m6882toStringimpl(j2)));
        }
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m6875getXimpl(j2)), this.yVelocityTracker.calculateVelocity(Velocity.m6876getYimpl(j2)));
    }

    public final void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }
}
