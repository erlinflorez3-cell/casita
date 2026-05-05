package androidx.compose.foundation.gestures;

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
/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0007I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0L͜N\\hݷZ\u000f\u001azl&\\&tG{Z \u007f̀\rO\\g˪mL_\u0011J\u0017َ\u001a\u0002"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qp\u000f", "", "u(E", "\u0012qP46(GQ\u0019\u0006\u0002^+", "\u0012qP47,Eb\u0015", "\u0012qP4F;:`(~y", "\u0012qP4F;H^$~y", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(PT#PJN3cRq\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(PU'N[J\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(Pd6CY],[(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(Pd6QWY,[(", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class DragEvent {
    public static final int $stable = 0;

    public /* synthetic */ DragEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4E\u0005'Bߚ(\u0007\u0015iy;TiV.jSX\u0010ө\u007f42]t\tQ;m\u001a,#\u0093NȞ̭fmН^\u0013K\u000f\u0014\u001b\u0011l2Lc|ص\u0012\u0018:EuТO{nE9f\u0014ȫ\t&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(Pd6CY],[(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qp\u000f", "AsP?g\u0017HW\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "uI;8b;EW\"H\u007fo4F\r8t\u007f5\u0005<\b`uGp\nL}4\u0013c\u0007.Fz&,\\MHS0+\u001bhn\u000fJT", "5dc g(Kb\u0004\t~g;DizCO\u0005m\u000b", "u(9", "\u0018", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        public /* synthetic */ DragStarted(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        private DragStarted(long j2) {
            super(null);
            this.startPoint = j2;
        }

        /* JADX INFO: renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m743getStartPointF1C5BW0() {
            return this.startPoint;
        }
    }

    private DragEvent() {
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4E\u0005'Bߚ(\u0007\u0015iy;TiV.jSX\u0010ө\u007f42]t\tQ;m\u001a,#\u0093NȞ̭fmН^\u0013K\u000f\u0014\u001b\u0011l2Lc|ص\u0012\u0018:EuТO{nE9f\u0014ȫ\t&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(Pd6QWY,[(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qp\u000f", "Dd[<V0Mg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "uI;8b;EW\"H\u007fo4F\r8t\u007f5\u0005<\b`uGp\nL}4\u0013c\u0007.Fz&,\\MHS0+\u001bhn\u000fJT", "5dc#X3HQ\u001d\u000e\u000f&\u007fl\u001c\u0017QR\u0010", "u(9", "\u0018", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final long velocity;

        public /* synthetic */ DragStopped(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        private DragStopped(long j2) {
            super(null);
            this.velocity = j2;
        }

        /* JADX INFO: renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
        public final long m744getVelocity9UxMQ8M() {
            return this.velocity;
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004Gڒ0!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(PT#PJN3cRq\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qp\u000f", "u(E", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4E\u0005'Bߚ(\u0007\u0015iy;TiV.jSX\u0010ө\u007f42]t\tQ;m\u001a,#\u0093NȞ̭fmН^\u0013K\u000f\u0014\u001b\u0011l2Lc|ص\u0012\u0018:EuТO{nE9f\u0014ȫ\t&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(PU'N[J\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qp\u000f", "2d[AT", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "uI;8b;EW\"H\u007fo4F\r8t\u007f5\u0005<\b`uGp\nL}4\u0013c\u0007.Fz&,\\MHS0+\u001bhn\u000fJT", "5dc\u0011X3MO`_F<{Yzy", "u(9", "\u0018", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final long delta;

        public /* synthetic */ DragDelta(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        private DragDelta(long j2) {
            super(null);
            this.delta = j2;
        }

        /* JADX INFO: renamed from: getDelta-F1C5BW0, reason: not valid java name */
        public final long m742getDeltaF1C5BW0() {
            return this.delta;
        }
    }
}
