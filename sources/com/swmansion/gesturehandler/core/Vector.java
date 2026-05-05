package com.swmansion.gesturehandler.core;

import android.view.VelocityTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\n8\u000b4L\u0007\":\u001b\u007f\u0007lkOӄbux.\u0001Rb\u000e{<G4_2q[;\u0004\u001b\u000e&\u0017Qfg\u0016oН^\u000bQ\u0012N$\u0007uDI\u0004y\u000e\u0016\u001d>Zom\u074c\u0014o\u0006Mn\u0002N\u0005N@R<\b\u0011\u0019\u001aXϺ@z\tRc\f@1\u0011\u007fHV%M3\u001bŪ\nD(ҵ6^mSDN=iH6;\u0003\u0018C%ώa݁\u0001M\u0015Ͽ%3\u001b~y\u001eYA\u000eߑ\u0017ȏW\u0003\u000fѸ,N\u0011?\n=3iҊ+1Q֕o8^\t\"\u001b{^\u001b_\u000b&\u000b\u0006Ōd\u0012/˃geQZ\u001c.ä~\r"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001^\u0016,\\MHA", "", "F", "", "G", "uC3uI", ";`V;\\;NR\u0019", "5dc\u001aT.GW(\u000fy^", "u(3", "CmXAK", "CmXAL", "5dc%", "5dc&", "1n\\=h;>A\u001d\u0007~e(\n\r>y", "DdRAb9", "7rB6`0EO&", "", "Bga2f/HZ\u0018", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Vector {
    private static final double MINIMAL_RECOGNIZABLE_MAGNITUDE = 0.1d;
    private final double magnitude;
    private final double unitX;
    private final double unitY;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f18210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f18211y;
    public static final Companion Companion = new Companion(null);
    private static final Vector VECTOR_LEFT = new Vector(-1.0d, 0.0d);
    private static final Vector VECTOR_RIGHT = new Vector(1.0d, 0.0d);
    private static final Vector VECTOR_UP = new Vector(0.0d, -1.0d);
    private static final Vector VECTOR_DOWN = new Vector(0.0d, 1.0d);
    private static final Vector VECTOR_RIGHT_UP = new Vector(1.0d, -1.0d);
    private static final Vector VECTOR_RIGHT_DOWN = new Vector(1.0d, 1.0d);
    private static final Vector VECTOR_LEFT_UP = new Vector(-1.0d, -1.0d);
    private static final Vector VECTOR_LEFT_DOWN = new Vector(-1.0d, 1.0d);
    private static final Vector VECTOR_ZERO = new Vector(0.0d, 0.0d);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0007\"B\u0012\u007f\u0007lrA0RkP.XS2\u000f\u0002{<řaҜrYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001b\u0014#\u0011jZM\u0006|k '2p~\b?[\u007fU9\u000fxf\t.C:8(\u0017Q&8I(v)E\"ËdضDpBĥ]Y\u0013\u001d*\u0006l$Wȩ^ʄR6PǍ.F=(\u001bipR}ۂ2ƊQ\rNÖw\u0019\u0005g6+n;\fՙ'٨\u0007\u0007Z¹\u0010\u000fMxU\u0005\u0017+}ǥKָ[6`Üd!9W%]!*3ӧSԃ\u0010'3Ւ4W^\u0017@w)\u007fcɠ\u0006؝\n'P͓}&t\u0012&3#v*öRؿbB\bЭ2B%0\u00183Y=qƛSň?\u0019VљL\u0011\u001b*;\u0001\u001d%2٭\u0010\u05ce\u0019\u001b\\ȭά5d"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001^\u0016,\\MH*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u001bH=\u0016@\b%M\u0006^XH\u000eel$A\\\u000f[:hrx0S|,U\u0005", "", "$D2!B\u001982\u0003pc", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001^\u0016,\\MHA", "$D2!B\u00198:x_i", "$D2!B\u00198:x_iX\u000bfz\u0018", "$D2!B\u00198:x_iX\u001cg", "$D2!B\u00198@|`]M", "$D2!B\u00198@|`]M&[r!N", "$D2!B\u00198@|`]M&ls", "$D2!B\u00198C\u0004", "$D2!B\u00198Hxkd", "4q^:70KS\u0017\u000e~h5", "2ha2V;B]\"", "", "4q^:I,E]\u0017\u0003\nr", "BqP0^,K", "\u001a`]1e6BRb\u0010~^>Fy/l\n&\u007fO\u0015\u0006$Cm\u0014<\u0004z", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Vector fromDirection(int i2) {
            switch (i2) {
                case 1:
                    return Vector.VECTOR_RIGHT;
                case 2:
                    return Vector.VECTOR_LEFT;
                case 3:
                case 7:
                default:
                    return Vector.VECTOR_ZERO;
                case 4:
                    return Vector.VECTOR_UP;
                case 5:
                    return Vector.VECTOR_RIGHT_UP;
                case 6:
                    return Vector.VECTOR_LEFT_UP;
                case 8:
                    return Vector.VECTOR_DOWN;
                case 9:
                    return Vector.VECTOR_RIGHT_DOWN;
                case 10:
                    return Vector.VECTOR_LEFT_DOWN;
            }
        }

        public final Vector fromVelocity(VelocityTracker tracker) {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            tracker.computeCurrentVelocity(1000);
            return new Vector(tracker.getXVelocity(), tracker.getYVelocity());
        }
    }

    public Vector(double d2, double d3) {
        this.f18210x = d2;
        this.f18211y = d3;
        double dHypot = Math.hypot(d2, d3);
        this.magnitude = dHypot;
        boolean z2 = dHypot > 0.1d;
        this.unitX = z2 ? d2 / dHypot : 0.0d;
        this.unitY = z2 ? d3 / dHypot : 0.0d;
    }

    private final double computeSimilarity(Vector vector) {
        return (this.unitX * vector.unitX) + (this.unitY * vector.unitY);
    }

    public final double getMagnitude() {
        return this.magnitude;
    }

    public final double getX() {
        return this.f18210x;
    }

    public final double getY() {
        return this.f18211y;
    }

    public final boolean isSimilar(Vector vector, double d2) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return computeSimilarity(vector) > d2;
    }
}
