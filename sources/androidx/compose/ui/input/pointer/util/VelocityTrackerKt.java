package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d̉=!,o\bӵLc\u0003\tI\u00066\f6B\r+4\u0012}\u0011njG?LeV@ZS@\u000fs{:2c$\u007fCCU0}*ޛWN}gvJ`\u000eK\u000f\u001c\u0016\u0001j2N]xs\u0012\u0017˰JoM:UoC;x\u001bD\u00168<2>\n\t/-\u0013Hn\u000b)U{\u0010 EXphQ=Q\u00130*\u0006l\u001fGȩbʄR6V\u0004u`=;\u001bipOWc>\u0016e\rtgW\u0011\u0005{6+nJe\u00193n\u001b\u0007\u0001Zo\u0007M\u000eU\u0005\u0017,m+a\u0003eSp\u007fB\u0016[S\u001b{\u000b&\u000b\u0006\u0018ӣ\u0012?[]\u0003cP<;(~\n-T\u0004<\u0019WL<N2f6!cx\u0001nXP0]r\u0004\t\u0004N\u0017S~c1?\u001btty;Ga}ަ\u001d\u001d,G\u0019nO\u0001|\u000e\u000f;KX\u0006xIQne``\u0018\u0003Um2\u0016\u000b\u0002X*`K\u000eV\u0014\u0011\\?k7sK1K\u0004\u0002vi\u0010v3\u0007\u0019Wwy`@P\u0017\\7B\u001b\u001a\u0006\\d3lxT\u0007?AQ*\u0001\u001f}6&f\\\u0010f/R(N}i\u0012t]_\u001a%]yekWkl\u0006ibAdic>`\u0003z\"oTb3W-̾[۱^\\6SJSxB\u0010{rO4\u0013`R8ʌ:Dc'\u0010-H1CjK\r\u000boZ\u0017#-f\u001c$a\u0018Tx\u00170h\\\u001fn\u0018|W\\\u0015`P,qUCM>UPizí+ȷ\u0003s\u000e|\u007f{U\u007f\u0005\u0016$z$(&\u001eISE<AE-;b\u0006;|dr\u0014P}\u00165\u0015\u0015y=s\u00192uA\u0003pZa1JׅX\u001701~~1Ψ|\u007f(`\u001dڬ\u001aϭX\u000bcŬi~\u0011YTNf}[ȗpݵ\u0005o*ĜU9Q)5\u0016&\u0013\u0006֕4ԃmo6Ӡ\u0003\u001b4w}\u0004Zbl˴5жa2Cͯi\u0004\rD:$\u001b\brLx{ B79Cx\u0007\u0007;ݭbиQ\u001d7̎v\t2\u0014~^s<\u0019x\f>Na0~Q\n4\tQ2)M\u0002l\u001eqY`#J=\u000fAAo4hΚI֕Zij־@\by&DISd\u000bK\u0017.T.B\u0018\u0019O|\u007f\f\u0010\t\u0011fe\u001f\u0019BB\"N\u0005 \u0005~lXX\u0005\u000fX\u000f3R\u000b\u0005\u000fAY\u00195_\u0018\u001eF\u0003Bқ6="}, d2 = {"\u000frbB`,)]\u001d\b\n^9d\u0013@em7\u0006K\f\u0017\u0016/s\u0015Cz35W\b)6{", "", "\u0012dU.h3ME\u0019\u0003|a;", "", "\u0016hbAb9RA\u001d\u0014z", "\u0016na6m6G;\u001d\u0006\u0002b:|\u00079n~6", "\nrTA \u0006\u0017", "", "$d[<V0Mg\b\fv\\2|\u0016\u000bd~\u0013\u0006D\n&%(s!", "5dc#X3HQ\u001d\u000e\u000fM9x\u00075e\r\u0004z?k!\u001bP~\u001c\u001dz8sU\u0007)A|\u0012=QMDy", "u(E", "5dc#X3HQ\u001d\u000e\u000fM9x\u00075e\r\u0004z?k!\u001bP~\u001c\u001dz8", "u(I", "Adc#X3HQ\u001d\u000e\u000fM9x\u00075e\r\u0004z?k!\u001bP~\u001c\u001dz8", "uY\u0018#", "$d[<V0Mg\b\fv\\2|\u0016\u001dt\r$\u000b@\u0003+\u0007UoqD\u00025<g}", "5dc#X3HQ\u001d\u000e\u000fM9x\u00075e\r\u0016\u000bM|&\u0017I\u0004}Jv\t=d\u000e'EmT*VLEz0-\u0019rjG", "5dc#X3HQ\u001d\u000e\u000fM9x\u00075e\r\u0016\u000bM|&\u0017I\u0004}Jv\t=d\u000e'Em", "Adc#X3HQ\u001d\u000e\u000fM9x\u00075e\r\u0016\u000bM|&\u0017I\u0004}Jv\t=d\u000e'Em", "\u001b`c?\\?", "", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r,k2-\u001fu7", "@nf@", "1n[@", "uH8uN\"\u001f", "1`[0h3:b\u0019b\u0003i<\u0004\u0017/V\u007f/\u0006>\u0005&+", "2`c.C6B\\(\r", "Bh\\2", "A`\\=_,\u001c])\b\n", "7r3.g(\u001dW\u001a\u007fzk,\u0006\u00183a\u0007", "9h]2g0<3\"~\b`@k\u0013 e\u00072yD\u0010+", "9h]2g0<3\"~\b`@", ">n[F90M:\u0019z\tm\u001a\t\u0019+r\u007f6", "F", "G", "2dV?X,", "1nT3Y0<W\u0019\b\nl", "/cS\u001db0Gb\u0019\f^g7\r\u0018\rh{1}@", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r,k;(\u0013lpMup(L|'T\"", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "/cS\u001db0Gb\u0019\f^g7\r\u0018\rh{1}@g\u0017\u0019Cm\"", "/cS\u001db0Gb\u0019\f^g7\r\u0018\rh{1}@r\u001b&JP\u0012O", "2nc", RemoteSettings.FORWARD_SLASH_STRING, "5dc", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r#gC+\u0019{7", "@nf", "1n[", "uZJ\u0013<\u0010\u00024", "<na:", "Adc", "D`[BX", "uZJ\u0013<\u0010\u001f\u0017\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001}%2T\r\u001agC\u001a\u007freB\u0016?;=z/G\"", "7mS2k", "", "2`c.C6B\\(", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_>\\GB5\u0013\u001a$dLC\u000bl;*\u0006\u0016KTN\u0002@7S\u0001\u0005", "$dRAb9", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static boolean VelocityTrackerAddPointsFix = true;
    private static boolean VelocityTrackerStrategyUseImpulse = false;

    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }

    public static /* synthetic */ void getVelocityTrackerStrategyUseImpulse$annotations() {
    }

    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i2, long j2, float f2) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i2] = new DataPointAtTime(j2, f2);
        } else {
            dataPointAtTime.setTime(j2);
            dataPointAtTime.setDataPoint(f2);
        }
    }

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (VelocityTrackerAddPointsFix) {
            addPointerInputChangeWithFix(velocityTracker, pointerInputChange);
        } else {
            addPointerInputChangeLegacy(velocityTracker, pointerInputChange);
        }
    }

    private static final void addPointerInputChangeLegacy(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m5487setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.m5385getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long jM5386getPreviousPositionF1C5BW0 = pointerInputChange.m5386getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        for (int i2 = 0; i2 < size; i2++) {
            HistoricalChange historicalChange = historical.get(i2);
            long jM3941minusMKHz9U = Offset.m3941minusMKHz9U(historicalChange.m5311getPositionF1C5BW0(), jM5386getPreviousPositionF1C5BW0);
            jM5386getPreviousPositionF1C5BW0 = historicalChange.m5311getPositionF1C5BW0();
            velocityTracker.m5487setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m3942plusMKHz9U(velocityTracker.m5486getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), jM3941minusMKHz9U));
            velocityTracker.m5483addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m5486getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
        }
        velocityTracker.m5487setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m3942plusMKHz9U(velocityTracker.m5486getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m3941minusMKHz9U(pointerInputChange.m5385getPositionF1C5BW0(), jM5386getPreviousPositionF1C5BW0)));
        velocityTracker.m5483addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.m5486getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i2 = 0; i2 < size; i2++) {
                HistoricalChange historicalChange = historical.get(i2);
                velocityTracker.m5483addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.m5310getOriginalEventPositionF1C5BW0$ui_release());
            }
            velocityTracker.m5483addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.m5384getOriginalEventPositionF1C5BW0$ui_release());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp$ui_release() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i2, int i3, float[] fArr3, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            fArr3 = new float[RangesKt.coerceAtLeast(i3 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i2, i3, fArr3);
    }

    public static final float[] polyFitLeastSquares(float[] fArr, float[] fArr2, int i2, int i3, float[] fArr3) {
        int i4 = i3;
        if (i4 < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i2 == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i4 >= i2) {
            i4 = i2 - 1;
        }
        int i5 = i4 + 1;
        float[][] fArr4 = new float[i5][];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr4[i6] = new float[i2];
        }
        for (int i7 = 0; i7 < i2; i7++) {
            fArr4[0][i7] = 1.0f;
            for (int i8 = 1; i8 < i5; i8++) {
                fArr4[i8][i7] = fArr4[i8 - 1][i7] * fArr[i7];
            }
        }
        float[][] fArr5 = new float[i5][];
        for (int i9 = 0; i9 < i5; i9++) {
            fArr5[i9] = new float[i2];
        }
        float[][] fArr6 = new float[i5][];
        for (int i10 = 0; i10 < i5; i10++) {
            fArr6[i10] = new float[i5];
        }
        int i11 = 0;
        while (i11 < i5) {
            float[] fArr7 = fArr5[i11];
            ArraysKt.copyInto(fArr4[i11], fArr7, 0, 0, i2);
            for (int i12 = 0; i12 < i11; i12++) {
                float[] fArr8 = fArr5[i12];
                float fDot = dot(fArr7, fArr8);
                for (int i13 = 0; i13 < i2; i13++) {
                    fArr7[i13] = fArr7[i13] - (fArr8[i13] * fDot);
                }
            }
            float fSqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f2 = 1.0f / fSqrt;
            for (int i14 = 0; i14 < i2; i14++) {
                fArr7[i14] = fArr7[i14] * f2;
            }
            float[] fArr9 = fArr6[i11];
            int i15 = 0;
            while (i15 < i5) {
                fArr9[i15] = i15 < i11 ? 0.0f : dot(fArr7, fArr4[i15]);
                i15++;
            }
            i11++;
        }
        for (int i16 = i4; -1 < i16; i16--) {
            float fDot2 = dot(fArr5[i16], fArr2);
            float[] fArr10 = fArr6[i16];
            int i17 = i16 + 1;
            if (i17 <= i4) {
                int i18 = i4;
                while (true) {
                    fDot2 -= fArr10[i18] * fArr3[i18];
                    if (i18 != i17) {
                        i18--;
                    }
                }
            }
            fArr3[i16] = fDot2 / fArr10[i16];
        }
        return fArr3;
    }

    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i2, boolean z2) {
        float f2;
        int i3 = i2 - 1;
        float f3 = fArr2[i3];
        float fSignum = 0.0f;
        int i4 = i3;
        while (i4 > 0) {
            int i5 = i4 - 1;
            float f4 = fArr2[i5];
            if (f3 != f4) {
                if (z2) {
                    f2 = -fArr[i5];
                } else {
                    f2 = fArr[i4] - fArr[i5];
                }
                float f5 = f2 / (f3 - f4);
                fSignum += (f5 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f5);
                if (i4 == i3) {
                    fSignum *= 0.5f;
                }
            }
            i4--;
            f3 = f4;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    private static final float kineticEnergyToVelocity(float f2) {
        return Math.signum(f2) * ((float) Math.sqrt(2 * Math.abs(f2)));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f2 += fArr[i2] * fArr2[i2];
        }
        return f2;
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    private static final float[][] Matrix(int i2, int i3) {
        float[][] fArr = new float[i2][];
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4] = new float[i3];
        }
        return fArr;
    }

    private static final float get(float[][] fArr, int i2, int i3) {
        return fArr[i2][i3];
    }

    private static final void set(float[][] fArr, int i2, int i3, float f2) {
        fArr[i2][i3] = f2;
    }

    public static final boolean getVelocityTrackerAddPointsFix() {
        return VelocityTrackerAddPointsFix;
    }

    public static final void setVelocityTrackerAddPointsFix(boolean z2) {
        VelocityTrackerAddPointsFix = z2;
    }

    public static final boolean getVelocityTrackerStrategyUseImpulse() {
        return VelocityTrackerStrategyUseImpulse;
    }

    public static final void setVelocityTrackerStrategyUseImpulse(boolean z2) {
        VelocityTrackerStrategyUseImpulse = z2;
    }
}
