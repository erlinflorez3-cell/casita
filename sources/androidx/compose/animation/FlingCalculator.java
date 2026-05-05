package androidx.compose.animation;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: FlingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\u000b8é6B\u0015\"4\u0012}\rnjG7L͜P.hS2şs{B(c$wCA٥0ԂR\t}M f\u007f\u000bm\u001bG\u001d\u0006.x\u0019-YY\u0007_*\u000f`EņC3[s\u0006Gn|N\u0005N3R<\b\u0007\u0019\u001aXKVvCOY\u0015*0nqjV\u001bW\u001d\u001a@\u0007\u0007,\u000f)tg|BxpkDG#1j\u000bZ5lH|{\u001bvX5\u0017\u000faL,\tEC$=S1\u0017\u0003_M\rWqk\u0006/'w:Wuo6\u0007\u0003Џ\u00191WՕut,a\u0013W1\u00185+gcyQdߍyߡ\u007f\rDǉ^\u00125OF-Hg^ԇ5ϢvSHАمbT"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006W,9b\u007f}3t\u0014>T?JuAs", "", "4qX0g0H\\", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KCY\u001f", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", ";`V6V\u0017Ag'\u0003xZ3Z\u0013/f\u0001,yD\u0001 &", "1n\\=h;>2\u0019|ze,\n\u0005>i\n1", "4kX;Z\u000bBa(z\u0004\\,", "Dd[<V0Mg", "4kX;Z\u000bN`\u0015\u000e~h5", "", "4kX;Z\u0010GT#", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006W,9b\u007f}3t\u0014>T?JuA\\uoeB\tG5O\u0001|", "5dc c3B\\\u0019]z\\,\u0004\t<a\u000f,\u0006I", "", "\u0014kX;Z\u0010GT#", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FlingCalculator {
    public static final int $stable = 0;
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    public FlingCalculator(float f2, Density density) {
        this.friction = f2;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    public final Density getDensity() {
        return this.density;
    }

    private final float computeDeceleration(Density density) {
        return FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
    }

    private final double getSplineDeceleration(float f2) {
        return AndroidFlingSpline.INSTANCE.deceleration(f2, this.friction * this.magicPhysicalCoefficient);
    }

    public final long flingDuration(float f2) {
        return (long) (Math.exp(getSplineDeceleration(f2) / (((double) FlingCalculatorKt.DecelerationRate) - 1.0d)) * 1000.0d);
    }

    public final float flingDistance(float f2) {
        return (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) FlingCalculatorKt.DecelerationRate) / (((double) FlingCalculatorKt.DecelerationRate) - 1.0d)) * getSplineDeceleration(f2)));
    }

    public final FlingInfo flingInfo(float f2) {
        double splineDeceleration = getSplineDeceleration(f2);
        double d2 = ((double) FlingCalculatorKt.DecelerationRate) - 1.0d;
        return new FlingInfo(f2, (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) FlingCalculatorKt.DecelerationRate) / d2) * splineDeceleration)), (long) (Math.exp(splineDeceleration / d2) * 1000.0d));
    }

    /* JADX INFO: compiled from: FlingCalculator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4B\u0007\":\u0019\u007f\u0007lsA0RnP.XS2\u000fy\u0002<$a%yCIa\"}(\tUȦm}ñzZ9BO!&|x,aU'^\"\u0013@D\b?aN\u007fAGc\r63$ݨ&8\b\nI!8S(v)D\u0012ď\u0013xG~Fj\r{\u0006`Ǝ\u0007\u0007'\u000f+tg|:\u000fȔ^\u0003T1\u0011\u0002B|ϋ\u00106\u0003M\u001bFl';w\u0012$1@E7-%\u0002\u00047Xa?\u0011B\n=3lmޗ*\u0012\u0005eEp\u007fB%[U\u001bn\u000b(r\u0004\u007f_R̃,\u0018jYb&(&\u000eBɵ;L\u001a\u0014;`.[\u001b\u0017\f\u001cH\rr\u0002D\u0019\tlX\u0018z\u0010M]Բ~{7G3~Q\u0010<IRE\u0011\u001d\rL'Q}/]l\u000e\u000f\u0016ôX}YĸiBCN\\\u0011*L{\u0007\tb0.˙4M\b\u07fc\u0014\u00134\u001f3@,H1!\u0004\u0002vEϼz\u000bhåkkXRN)ë\u001aP"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006W,9b\u007f}3t\u0014>T?JuA\\uoeB\tG5O\u0001|", "", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "", "2hbAT5<S", "2ta.g0H\\", "", "uE5\u0017\u001c\u001d", "5dc\u0011\\:MO\"|z", "u(5", "5dc\u0011h9:b\u001d\t\u0004", "u(9", "5dc\u0016a0MW\u0015\u0006k^3\u0007\u00073t\u0014", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", ">nb6g0H\\", "Bh\\2", "BnBAe0GU", "", "Dd[<V0Mg", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f2, float f3, long j2, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = flingInfo.initialVelocity;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                f3 = flingInfo.distance;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                j2 = flingInfo.duration;
            }
            return flingInfo.copy(f2, f3, j2);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        public final FlingInfo copy(float f2, float f3, long j2) {
            return new FlingInfo(f2, f3, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public int hashCode() {
            return (((Float.hashCode(this.initialVelocity) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.duration);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public FlingInfo(float f2, float f3, long j2) {
            this.initialVelocity = f2;
            this.distance = f3;
            this.duration = j2;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float position(long j2) {
            long j3 = this.duration;
            return this.distance * Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(j3 > 0 ? j2 / j3 : 1.0f).getDistanceCoefficient();
        }

        public final float velocity(long j2) {
            long j3 = this.duration;
            return (((AndroidFlingSpline.INSTANCE.flingPosition(j3 > 0 ? j2 / j3 : 1.0f).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        }
    }
}
