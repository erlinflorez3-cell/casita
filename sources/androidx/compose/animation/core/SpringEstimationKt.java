package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: SpringEstimation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!,p\bDJc|\u0004O\n8\u000b4G\u0007\":\u0017\u007f\u0007ljA0ZeP.X[2\u000f\u0002{<$a$yCI^\"Ԃ:7]N\u007fg\u001dI\u000b\u000fQ\u0010\u001e\u0016'l\\Mc{u\u0012=4rsM7eok;\u0011xD\n82P:*\t\u000f BH>xAHcB 0XphQ=Q\u0013!*\u0006l\"1\"jof6vn\u000e>=,\u001bipPWc>\u0001e\rtVW\u0011\u0005f6+n9e\u00193Y\u001b\u0007\u0001]\u0006\bW K\u0005\u0001'U*ywe7p\u007fB\u001f[S\u001b`\u000b&\u000b\u000f\u0002d\u001a+CO\u0012U\u0001\u00126|\u0013{;F4\u0012\u0014-`.[$-\r&Y\u0003}k@~\u0004\u000fF\u000e\u0007y6E2079G3f\u007fck\u001d\\F\u0014\u0005; S\u0005|'sT<b[\u001bl._Ai@kG~\u000egI\u0006\u0004\u001fo2.\u0012A_\u007f]\tA2%(O[g%Qo\u0010L\\g%\u0007\u0011la{jHn$\u001f\u001aE0!\f\tF+\u0005\u0004~bkD\u0011{\u001e\u0005\u000b\f\u0014+ \u000b\u0005l%3!fO\u0017v\u001bQk\u0018=/\u00159\nry\u001do9\r5eUq\u0016yR%\u0016\u0006<z+fzZS:\\\r,0>`j>\u0005,H\\\u001a+2msL8:@1\\CJ3\"PG\u0015\t\u000e\\/\u0010\u0017\fA9\u001biRv9\u0005^r\to\u0016zy<\u000bw:9QSE\u0019TW2jD|Q\t-\f0Wue_X|\u0018\u0006U*\"&\u001cIQ]?A'EǾ8\u001a8Sf\u000be\u007fh:')~@һA\t:uō\u0003pZ_A\u07bd\"ݚ\u001b\"~ܥљ'$"}, d2 = {"\u001b@G,?\u0016'5\u0013f^E\u0013`v", "", "3rc6`(MSt\b~f(\f\r9n^8\t<\u0010\u001b!PW\u0012C})C", "AsX3Y5>a'", "", "2`\\=\\5@@\u0015\u000e~h", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "7mXA\\(E2\u001d\r\u0006e(z\t7e\t7", "2d[AT", "Aoa6a.\u001c]\"\r\nZ5\f", "2`\\=\\5@1#~{_0z\r/n\u000f", ";`b@", "", "3rc6`(MSv\f~m0z\u00056l\u0014\u0007wH\f\u0017\u0016", "4ha@g\u0019H](", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG}Au!5MV\u001auD\u001b\u001ch7", ">/", "D/", "3rc6`(MSw\u000f\bZ;\u0001\u00138I\t7{M\n\u0013\u001e", "AdR<a++]#\u000e", "7mXA\\(E>#\r~m0\u0007\u0012", "3rc6`(MS\u0003\u0010zk\u000bx\u0011:e~", "3rc6`(MS\t\by^9[\u00057p\u007f'", "7sT?T;><\u0019\u0011\nh5\u000bp/t\u00032z", "F", "4m", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4m??\\4>", "7r=<g\rB\\\u001d\u000ez", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    public static final long estimateAnimationDurationMillis(float f2, float f3, float f4, float f5, float f6) {
        return f3 == 0.0f ? MAX_LONG_MILLIS : estimateAnimationDurationMillis(f2, f3, f4, f5, f6);
    }

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6) {
        double dSqrt = 2.0d * d3 * Math.sqrt(d2);
        double d7 = (dSqrt * dSqrt) - (4.0d * d2);
        double d8 = -dSqrt;
        ComplexDouble complexDoubleComplexSqrt = ComplexDoubleKt.complexSqrt(d7);
        complexDoubleComplexSqrt._real += d8;
        complexDoubleComplexSqrt._real *= 0.5d;
        complexDoubleComplexSqrt._imaginary *= 0.5d;
        ComplexDouble complexDoubleComplexSqrt2 = ComplexDoubleKt.complexSqrt(d7);
        double d9 = -1;
        complexDoubleComplexSqrt2._real *= d9;
        complexDoubleComplexSqrt2._imaginary *= d9;
        complexDoubleComplexSqrt2._real += d8;
        complexDoubleComplexSqrt2._real *= 0.5d;
        complexDoubleComplexSqrt2._imaginary *= 0.5d;
        return estimateDurationInternal(complexDoubleComplexSqrt, complexDoubleComplexSqrt2, d3, d4, d5, d6);
    }

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6, double d7) {
        double dSqrt = d3 / (Math.sqrt(d2 * d4) * 2.0d);
        double d8 = (d3 * d3) - ((4.0d * d4) * d2);
        double d9 = 1.0d / (2.0d * d4);
        double d10 = -d3;
        ComplexDouble complexDoubleComplexSqrt = ComplexDoubleKt.complexSqrt(d8);
        complexDoubleComplexSqrt._real += d10;
        complexDoubleComplexSqrt._real *= d9;
        complexDoubleComplexSqrt._imaginary *= d9;
        ComplexDouble complexDoubleComplexSqrt2 = ComplexDoubleKt.complexSqrt(d8);
        double d11 = -1;
        complexDoubleComplexSqrt2._real *= d11;
        complexDoubleComplexSqrt2._imaginary *= d11;
        complexDoubleComplexSqrt2._real += d10;
        complexDoubleComplexSqrt2._real *= d9;
        complexDoubleComplexSqrt2._imaginary *= d9;
        return estimateDurationInternal(complexDoubleComplexSqrt, complexDoubleComplexSqrt2, dSqrt, d5, d6, d7);
    }

    private static final double estimateUnderDamped(ComplexDouble complexDouble, double d2, double d3, double d4) {
        double real = complexDouble.getReal();
        double imaginary = (d3 - (real * d2)) / complexDouble.getImaginary();
        return Math.log(d4 / Math.sqrt((d2 * d2) + (imaginary * imaginary))) / real;
    }

    private static final double estimateCriticallyDamped(ComplexDouble complexDouble, double d2, double d3, double d4) {
        double d5 = d4;
        double real = complexDouble.getReal();
        double d6 = real * d2;
        double d7 = d3 - d6;
        double dLog = Math.log(Math.abs(d5 / d2)) / real;
        double dLog2 = Math.log(Math.abs(d5 / d7));
        double dLog3 = dLog2;
        for (int i2 = 0; i2 < 6; i2++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / real));
        }
        double d8 = dLog3 / real;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d8;
        } else if ((Double.isInfinite(d8) || Double.isNaN(d8)) ? false : true) {
            dLog = Math.max(dLog, d8);
        }
        double d9 = (-(d6 + d7)) / (real * d7);
        double d10 = real * d9;
        double dExp = (Math.exp(d10) * d2) + (d7 * d9 * Math.exp(d10));
        if (Double.isNaN(d9) || d9 <= 0.0d) {
            d5 = -d5;
        } else if (d9 <= 0.0d || (-dExp) >= d5) {
            dLog = (-(2.0d / real)) - (d2 / d7);
        } else {
            if (d7 < 0.0d && d2 > 0.0d) {
                dLog = 0.0d;
            }
            d5 = -d5;
        }
        double dAbs = Double.MAX_VALUE;
        int i3 = 0;
        while (dAbs > 0.001d && i3 < 100) {
            i3++;
            double d11 = real * dLog;
            double dExp2 = dLog - ((((d2 + (d7 * dLog)) * Math.exp(d11)) + d5) / ((((((double) 1) + d11) * d7) + d6) * Math.exp(d11)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
        }
        return dLog;
    }

    private static final double estimateOverDamped(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d2, double d3, double d4) {
        double d5 = d4;
        double real = complexDouble.getReal();
        double real2 = complexDouble2.getReal();
        double d6 = real - real2;
        double d7 = ((real * d2) - d3) / d6;
        double d8 = d2 - d7;
        double dLog = Math.log(Math.abs(d5 / d8)) / real;
        double dLog2 = Math.log(Math.abs(d5 / d7)) / real2;
        int i2 = 0;
        if ((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true) {
            if ((Double.isInfinite(dLog2) || Double.isNaN(dLog2)) ? false : true) {
                dLog = Math.max(dLog, dLog2);
            }
            dLog2 = dLog;
        }
        double d9 = d8 * real;
        double dLog3 = Math.log(d9 / ((-d7) * real2)) / (real2 - real);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d5 = -d5;
        } else if (dLog3 <= 0.0d || (-estimateOverDamped$xInflection(d8, real, dLog3, d7, real2)) >= d5) {
            dLog2 = Math.log((-((d7 * real2) * real2)) / (d9 * real)) / d6;
        } else {
            if (d7 > 0.0d && d8 < 0.0d) {
                dLog2 = 0.0d;
            }
            d5 = -d5;
        }
        double d10 = d7 * real2;
        if (Math.abs((Math.exp(real * dLog2) * d9) + (Math.exp(real2 * dLog2) * d10)) < 1.0E-4d) {
            return dLog2;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i2 < 100) {
            i2++;
            double d11 = real * dLog2;
            double d12 = real2 * dLog2;
            double dExp = dLog2 - ((((Math.exp(d11) * d8) + (Math.exp(d12) * d7)) + d5) / ((Math.exp(d11) * d9) + (Math.exp(d12) * d10)));
            dAbs = Math.abs(dLog2 - dExp);
            dLog2 = dExp;
        }
        return dLog2;
    }

    private static final double estimateOverDamped$xInflection(double d2, double d3, double d4, double d5, double d6) {
        return (d2 * Math.exp(d3 * d4)) + (d5 * Math.exp(d6 * d4));
    }

    private static final long estimateDurationInternal(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d2, double d3, double d4, double d5) {
        double dEstimateCriticallyDamped;
        double d6 = d3;
        if (d4 == 0.0d && d6 == 0.0d) {
            return 0L;
        }
        if (d4 < 0.0d) {
            d6 = -d6;
        }
        double dAbs = Math.abs(d4);
        if (d2 > 1.0d) {
            dEstimateCriticallyDamped = estimateOverDamped(complexDouble, complexDouble2, dAbs, d6, d5);
        } else if (d2 < 1.0d) {
            dEstimateCriticallyDamped = estimateUnderDamped(complexDouble, dAbs, d6, d5);
        } else {
            dEstimateCriticallyDamped = estimateCriticallyDamped(complexDouble, dAbs, d6, d5);
        }
        return (long) (dEstimateCriticallyDamped * 1000.0d);
    }

    private static final double iterateNewtonsMethod(double d2, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d2 - (function1.invoke(Double.valueOf(d2)).doubleValue() / function12.invoke(Double.valueOf(d2)).doubleValue());
    }

    private static final boolean isNotFinite(double d2) {
        return !((Double.isInfinite(d2) || Double.isNaN(d2)) ? false : true);
    }
}
