package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":$\u007f\u0007ljA0RiP\u008cZS8\u0014s{:$c$\bCCU ~(ߜOdʴ\u0018nxYCB\u001dF\u001b~j߽MU\u0007]Z#@H\b?aT AGh\r63)b&F\u0004\u001d\u0001H3\u0011\u001c\u0005\u0006[K:\u001e`D~Gj\r{\u000ej\u001e\u0014?8\u0001L^>ޱ\tՂp]Bǂs\u000fwEf'\u000e4Sմ\u000fТX'\u0015Ǹ2*9EO5C)*\u038b\tқ_?\u000bӊѥA\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.4f\b$6N\u001d2VE)v;\"\u001eh7", "", "u(E", "\u001caB.`7ES'", "", "!o[6a,)]'\u0003\nb6\u0006\u0017", "", "!o[6a,-W!~\t", "2dR2_,KO(\u0003\u0005g", "", "Dd[<V0Mg", "", "4qX0g0H\\", "4kX;Z\u0017Ha\u001d\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.4f\b$6N\u001d2VE)v;\"\u001eh \u001a\u000eg5Pc'U\\U;2", "Bh\\2", "\u0014kX;Z\u0019>a)\u0006\n", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidFlingSpline {
    public static final int $stable;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final int NbSamples = 100;
    private static final float[] SplinePositions;
    private static final float[] SplineTimes;

    private AndroidFlingSpline() {
    }

    static {
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        SplineTimes = fArr2;
        SplineBasedDecayKt.computeSplineInfo(fArr, fArr2, 100);
        $stable = 8;
    }

    public final FlingResult flingPosition(float f2) {
        float f3 = 0.0f;
        float f4 = 1.0f;
        float fCoerceIn = RangesKt.coerceIn(f2, 0.0f, 1.0f);
        float f5 = 100;
        int i2 = (int) (f5 * fCoerceIn);
        if (i2 < 100) {
            float f6 = i2 / f5;
            int i3 = i2 + 1;
            float[] fArr = SplinePositions;
            float f7 = fArr[i2];
            f3 = (fArr[i3] - f7) / ((i3 / f5) - f6);
            f4 = ((fCoerceIn - f6) * f3) + f7;
        }
        return new FlingResult(f4, f3);
    }

    public final double deceleration(float f2, float f3) {
        return Math.log(((double) (Math.abs(f2) * 0.35f)) / ((double) f3));
    }

    /* JADX INFO: compiled from: SplineBasedDecay.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:ša:ڎs;\u0004\u0019>5\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-֒Yxk\u0015W9PvW3{p\u0004˧a==\u0013(J\"fzKі\u001brc\u001e\u007f\u0013CyÈB6FpHR%M3\u001bB\fD \u000f tg|7\u000fȔ\\\u0003@1\r\u0002B|2\u00106\u000bY%Hj&;u(Գ,\t>C\"=S1\u0015\u0019Đ>KF\u007fL\u001dhU7qʵr(Ef\u007f,\u0015YPոax.ؘ\u001dSf\u001050 rYR&(&{ԫ\u0011B\f\u05fa\u001e)N4;\u001fǺ\f\u001f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.4f\b$6N\u001d2VE)v;\"\u001eh \u001a\u000eg5Pc'U\\U;2", "", "2hbAT5<Sv\tz_-\u0001\u00073e\t7", "", "Dd[<V0Mgv\tz_-\u0001\u00073e\t7", "uE5uI", "5dc\u0011\\:MO\"|z<6|\n0i},{I\u0010", "u(5", "5dc#X3HQ\u001d\u000e\u000f<6|\n0i},{I\u0010", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class FlingResult {
        public static final int $stable = 0;
        private final float distanceCoefficient;
        private final float velocityCoefficient;

        public static /* synthetic */ FlingResult copy$default(FlingResult flingResult, float f2, float f3, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = flingResult.distanceCoefficient;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                f3 = flingResult.velocityCoefficient;
            }
            return flingResult.copy(f2, f3);
        }

        public final float component1() {
            return this.distanceCoefficient;
        }

        public final float component2() {
            return this.velocityCoefficient;
        }

        public final FlingResult copy(float f2, float f3) {
            return new FlingResult(f2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.distanceCoefficient) * 31) + Float.hashCode(this.velocityCoefficient);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
        }

        public FlingResult(float f2, float f3) {
            this.distanceCoefficient = f2;
            this.velocityCoefficient = f3;
        }

        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }
    }
}
