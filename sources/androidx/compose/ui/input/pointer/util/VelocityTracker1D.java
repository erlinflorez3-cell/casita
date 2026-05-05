package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007ljA0RkP.XT2\u000fy\u000e<$a%yCId\"}8\tWNmgvJh\u000bKƤ\u000e\u0016\u0007q4կ]xk\u0017\u00172HvE8cڎm9\u000fsn\u0004?r/>\u000e\u0015\u0005(*`\u0010%{ŲO\f 2\u0001\n@ĥ\u001dS\u000b\u001a \u0006V /\u001flmT6Vou:]'ɨmB\\,(D\u000b_%F\u0003:=zo2C@eJE)a\u0019\u001fR\nVK]\u007fU\u001dhU>[M\u0002pNX.\u001fE/]'urTg5Un'?+}j\u0012PV,\u0006\u0017\u0014\rj\u001bV\u00125dF-H}8\u0012A\u0012\u000bSngJbP\u001e\u0013ad*u\fA1Q\u001b\u0015X8ݥ%\u05ee;{\rټn2\u000fn9[\u0003\u000f\u05ce\u0019!\\ȭi3W@KP\u001f\u0016gF\u0006\u0004\u001fiXÒ\u0006ΥK\u007f7Ʌa:%/O[g.wȀ\u0004ҩHg~ݓ1taujHn-Eݮ9Ҋ\r\fbե5\u0011y]lXZ\u001c$ȿVΘ\u0002\b\u001b\u05fe-\u000eJ/=\u0018^Sxk\u0001L\f\u001aS>=ƀ[ˇo\u0010_9lD\u0006]q\u0013yR%\u0018\u0016ֽdۖ\\fJͭ۷^|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r,k;(\u0013lpMup(L|'T\u0018-\u0002", "", "7r3.g(\u001dW\u001a\u007fzk,\u0006\u00183a\u0007", "", "uY\u0018#", "Asa.g,@g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r,k;(\u0013lpMup(L|'T\u0018-jJa\u007f9#\u0012\\\"$", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_>\\GB5%\u001e\u001cr_=\u0016w\u001b[r%ML[w;\u0011`L!\u000ei\u000eP?bHJ", "7mS2k", "", "u(I", ";h] T4IZ\u0019l~s,", "@dd@T)ESwz\nZ\u0017\u0007\r8t\u000e\u0004\tM|+", "", "@dd@T)ES\b\u0003\u0003^\b\n\u0016+y", "@dd@T)ES\n~\u0002h*\u0001\u0018CC\n(|A\u0005\u0015\u001bGx\u001dJ", "A`\\=_,L", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r\u001agC\u001a\u007freB\u0016?;=z/G\"", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7&=QJ\u0005J0-\u0011Sk=\u0010r\b]e+OL$", "/cS\u0011T;:>#\u0003\u0004m", "", "Bh\\2@0EZ\u001d\r", "", "2`c.C6B\\(", "", "1`[0h3:b\u0019ezZ:\fv;u{5{Nq\u0017\u001eQm\u0012K\u000b", "2`c.C6B\\(\r", "Bh\\2", "A`\\=_,\u001c])\b\n", "1`[0h3:b\u0019oze6z\r>y", ";`g6`<FD\u0019\u0006\u0005\\0\f\u001d", "@db2g\u001bKO\u0017\u0005~g.", "!sa.g,@g", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VelocityTracker1D {
    public static final int $stable = 8;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;
    private final float[] reusableDataPointsArray;
    private final float[] reusableTimeArray;
    private final float[] reusableVelocityCoefficients;
    private final DataPointAtTime[] samples;
    private final Strategy strategy;

    /* JADX INFO: compiled from: VelocityTracker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0006Gً/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wEшY\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r,k;(\u0013lpMup(L|'T\u0018-jJa\u007f9#\u0012\\\"$", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001ar`~", "\u0017l_B_:>", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum Strategy {
        Lsq2,
        Impulse
    }

    /* JADX INFO: compiled from: VelocityTracker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public VelocityTracker1D(boolean z2, Strategy strategy) {
        this.isDataDifferential = z2;
        this.strategy = strategy;
        if (z2 && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 3;
        }
        this.minSampleSize = i3;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public final boolean isDataDifferential() {
        return this.isDataDifferential;
    }

    public /* synthetic */ VelocityTracker1D(boolean z2, Strategy strategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2, (i2 + 2) - (i2 | 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(boolean z2) {
        this(z2, Strategy.Impulse);
    }

    public final void addDataPoint(long j2, float f2) {
        int i2 = (this.index + 1) % 20;
        this.index = i2;
        VelocityTrackerKt.set(this.samples, i2, j2, f2);
    }

    public final float calculateVelocity() {
        float fCalculateImpulseVelocity;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i2 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i2];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i3 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        do {
            DataPointAtTime dataPointAtTime3 = this.samples[i2];
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            dataPointAtTime2 = (this.strategy == Strategy.Lsq2 || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i3] = dataPointAtTime3.getDataPoint();
            fArr2[i3] = -time;
            if (i2 == 0) {
                i2 = 20;
            }
            i2--;
            i3++;
        } while (i3 < 20);
        if (i3 < this.minSampleSize) {
            return 0.0f;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i4 == 1) {
            fCalculateImpulseVelocity = VelocityTrackerKt.calculateImpulseVelocity(fArr, fArr2, i3, this.isDataDifferential);
        } else if (i4 == 2) {
            fCalculateImpulseVelocity = calculateLeastSquaresVelocity(fArr, fArr2, i3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return fCalculateImpulseVelocity * 1000;
    }

    public final float calculateVelocity(float f2) {
        if (!(f2 > 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + f2);
        }
        float fCalculateVelocity = calculateVelocity();
        if (fCalculateVelocity == 0.0f || Float.isNaN(fCalculateVelocity)) {
            return 0.0f;
        }
        if (fCalculateVelocity > 0.0f) {
            return RangesKt.coerceAtMost(fCalculateVelocity, f2);
        }
        return RangesKt.coerceAtLeast(fCalculateVelocity, -f2);
    }

    public final void resetTracking() {
        ArraysKt.fill$default(this.samples, (Object) null, 0, 0, 6, (Object) null);
        this.index = 0;
    }

    private final float calculateLeastSquaresVelocity(float[] fArr, float[] fArr2, int i2) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(fArr2, fArr, i2, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }
}
