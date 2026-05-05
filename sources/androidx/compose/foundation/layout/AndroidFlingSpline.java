package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":$\u007f\u0007ljA0RiP\u008cZS8\u0014s{:$c$\bCCU \u0001(ߞOdʴ\u0018nxYCB\u001fF\u001b~j߽MU\u0007]Z#@H\b?aT AGh\r63)b&F\u0004\u001d\u0001H3\u0011)\u0005\u0006[K:\u001e`D~Gj\r{\u000eݾ\u0011ßͽ\u001f\u007fɉ`iTDV{.F=$\u001bipP}ۂ\u0003ƊQ\rNÖw\u0019\u0005d6+n;\fՙ'٨\u0007\u0007Z¹\u0010\u000fMvU\u0005\u0017+}ǥKָ[6`Üϯ\u00154W\rc\u0012._\u000bŋ|:&ˬSt"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q7LPEo3~\u001clj;tn3R\u007f'\u001d", "", "u(E", "\u001caB.`7ES'", "", "!o[6a,)]'\u0003\nb6\u0006\u0017", "", "!o[6a,-W!~\t", "2dR2_,KO(\u0003\u0005g", "", "Dd[<V0Mg", "", "4qX0g0H\\", "4kX;Z\u0017Ha\u001d\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q7LPEo3~\u001clj;tn3R\u007f'\u0006-U0eT_=\"\"a\u001d$", "Bh\\2", "4kX;Z\u0017Ha\u001d\u000e~h5Do0o\u0013\u0016i$", "uE\u0018\u0017", "\u0014kX;Z\u0019>a)\u0006\n", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class AndroidFlingSpline {
    private static final int NbSamples = 100;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final float[] SplinePositions = new float[101];
    private static final float[] SplineTimes = new float[101];

    private AndroidFlingSpline() {
    }

    static {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i2 = 0; i2 < 100; i2++) {
            float f12 = i2 / 100;
            float f13 = 1.0f;
            while (true) {
                f2 = ((f13 - f10) / 2.0f) + f10;
                f3 = 1.0f - f2;
                f4 = f2 * 3.0f * f3;
                f5 = f2 * f2 * f2;
                float f14 = (((f3 * 0.175f) + (f2 * 0.35000002f)) * f4) + f5;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                } else if (f14 > f12) {
                    f13 = f2;
                } else {
                    f10 = f2;
                }
            }
            float f15 = 0.5f;
            SplinePositions[i2] = (f4 * ((f3 * 0.5f) + f2)) + f5;
            float f16 = 1.0f;
            while (true) {
                f6 = ((f16 - f11) / 2.0f) + f11;
                f7 = 1.0f - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f17 = (((f7 * f15) + f6) * f8) + f9;
                if (Math.abs(f17 - f12) >= 1.0E-5d) {
                    if (f17 > f12) {
                        f16 = f6;
                    } else {
                        f11 = f6;
                    }
                    f15 = 0.5f;
                }
            }
            SplineTimes[i2] = (f8 * ((f7 * 0.175f) + (f6 * 0.35000002f))) + f9;
        }
        SplineTimes[100] = 1.0f;
        SplinePositions[100] = 1.0f;
    }

    /* JADX INFO: renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m888flingPositionLfoxSSI(float f2) {
        float f3;
        float f4;
        float f5 = 100;
        int i2 = (int) (f5 * f2);
        if (i2 < 100) {
            float f6 = i2 / f5;
            int i3 = i2 + 1;
            float f7 = i3 / f5;
            float[] fArr = SplinePositions;
            float f8 = fArr[i2];
            f4 = (fArr[i3] - f8) / (f7 - f6);
            f3 = f8 + ((f2 - f6) * f4);
        } else {
            f3 = 1.0f;
            f4 = 0.0f;
        }
        return FlingResult.m890constructorimpl((-1) - (((-1) - ((-1) - (((-1) - ((long) Float.floatToRawIntBits(f4))) | ((-1) - 4294967295L)))) & ((-1) - (((long) Float.floatToRawIntBits(f3)) << 32))));
    }

    public final double deceleration(float f2, float f3) {
        return Math.log(((double) (Math.abs(f2) * 0.35f)) / ((double) f3));
    }

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0017\u007f\u0007lmA0RnP.XU2\u000fy\u0002<$a%yCIa\"}(\nUȦ&}ñzZ9BO\u0013&|x,aU'^ܫ\u00134HqM6\u0016\bKCxtd\u0010P80D\u0012\u0007\u0017\u0019XGVΣ{ŲO\u000e\u0018=N~\u0003`\u001b\\\u001d\u001a@\u0016\u0005ſ\u007fɉ`iTGV~&H=6\u001bipbmܖ/ƊQ\u000fLi5#Gp,/X7c\u001a[\u0018Ϋ\u000bVsA\tE\u007fDUt5'CI\"X\rݜ\u0002Џ\u0019+WՕ.\u00024d\u001dQ\u000f\u0011]oյgOh\u0010.\u0001\t\u0003ȧ;\u0004؍\u0005'v/Ǐ\u001e}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q7LPEo3~\u001clj;tn3R\u007f'\u0006-U0eT_=\"\"a\u001d$", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "2hbAT5<Sv\tz_-\u0001\u00073e\t7", "", "5dc\u0011\\:MO\"|z<6|\n0i},{I\u0010^\u001bOz\u0015", "uI\u0018\u0013", "Dd[<V0Mgv\tz_-\u0001\u00073e\t7", "5dc#X3HQ\u001d\u000e\u000f<6|\n0i},{I\u0010^\u001bOz\u0015", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class FlingResult {
        private final long packedValue;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m889boximpl(long j2) {
            return new FlingResult(j2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m890constructorimpl(long j2) {
            return j2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m891equalsimpl(long j2, Object obj) {
            return (obj instanceof FlingResult) && j2 == ((FlingResult) obj).m897unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m892equalsimpl0(long j2, long j3) {
            return j2 == j3;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m895hashCodeimpl(long j2) {
            return Long.hashCode(j2);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m896toStringimpl(long j2) {
            return "FlingResult(packedValue=" + j2 + ')';
        }

        public boolean equals(Object obj) {
            return m891equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m895hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m896toStringimpl(this.packedValue);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m897unboximpl() {
            return this.packedValue;
        }

        private /* synthetic */ FlingResult(long j2) {
            this.packedValue = j2;
        }

        /* JADX INFO: renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m893getDistanceCoefficientimpl(long j2) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }

        /* JADX INFO: renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m894getVelocityCoefficientimpl(long j2) {
            return Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L))));
        }
    }
}
