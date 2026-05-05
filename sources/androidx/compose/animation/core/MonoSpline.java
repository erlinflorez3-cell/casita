package androidx.compose.animation.core;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
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
/* JADX INFO: compiled from: MonoSpline.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00188é6B\r14ߚ\u007f\u0007toA0JeP.`\\2\u000fq\u0007<$i$yّCU0}*ޛWNumvJ`\u0012I\u000e\u001cǝ)jZH\u0016\u001am\u0016\u001d2Zom4]yK;xzF\u000702P9(\b\u0011\u001e8L(v)Hƚ\u0010\u0012>F9p`\u001be\u0005H\u00176B.\u00106\\\u0016SfLzmR/Q\b\u001aF\\8w0+R=Jb9%v\u0010#[DEH-%\u0002\b7ViS\u001b? BKhoE9^\fWdn0\u0018#+g\r\fwV`\u0013hx\fUC\u007fiQP\u001cA\u0010z*'\u0005\u0018\u001c\u001b?H\\2Jj\u0016)Kt!XpT\u0010zZ\u007f){~53\u001dK+g1\u0017Uo;1Ne\u00015\u0011,:\u0019nOs\u0005\u0014f\u0015)m\u0010Q_k\tQVk\"Yk\u00044tp\u0002B\u0004^L03\n(F\u0017S8$O1>\u0004\u0002vI\u0018z\u0013`\u0001S\u0018WxD0\u000b.7X#RZ\r\u001b\u0013\nhT\u00071AQ*c\u001f}6\u0018P`\u0006L9%>S\u007flw{e]8*_jEk\u0007k<\\ibAHic>f\u0003z\"STb3]-B\u001c-h{@(BJz\u0010&|rQ<\u0017@_\n\u001cbFa\u001dj6`\u0003L\\\b|ȤcZv2O`A+\u001biR|_ə\u0013ʷtooծ\u001a8\u000bi:-oR\fӪ(Ɓ&h<ês\u001b\r}\u0018MwNWL\u001b\u0017$XR\u0090\u0018׀=S7=!\u001aO5@\u000eEEzs<ʻOɟ+z\u0005Ȫ_Ov;\u007f\u000ezr<`\u0019K}WmǴx݈v%\u0010d\u000e\u0005ӼJ\u001e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bAv \u001cXJ?t4s", "", "Bh\\2", "", "G", "", ">da6b+BQu\u0003vl", "", "uZ5(N\r\u001f\u0017\n", "7r4Eg9:^#\u0006vm,", "", "Ak^=X\u001b>[$", "B`]4X5Ma", ")Z5", "Bh\\2C6B\\(\r", "D`[BX:", "2hU3", "6", "F", "G0", "G1", "B0", "B1", "5dc\u001db:", "", "D", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "7mS2k", "", "B", "8", "5dc _6IS", "7mc2e7HZ\u0015\u000ez", ";`Z293HO(Z\bk(\u0011", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "uH8uN\"\u001f", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MonoSpline {
    public static final int $stable = 8;
    private final boolean isExtrapolate = true;
    private final float[] slopeTemp;
    private final float[][] tangents;
    private final float[] timePoints;
    private final float[][] values;

    private final float diff(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f3 * f3;
        float f9 = 6;
        float f10 = f9 * f3;
        float f11 = (((((-6) * f8) * f5) + (f5 * f10)) + ((f9 * f8) * f4)) - (f10 * f4);
        float f12 = 3 * f2;
        return ((((f11 + ((f12 * f7) * f8)) + ((f12 * f6) * f8)) - (((2 * f2) * f7) * f3)) - (((4 * f2) * f6) * f3)) + (f2 * f6);
    }

    private final float interpolate(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f3 * f3;
        float f9 = f8 * f3;
        float f10 = 3 * f8;
        float f11 = 2;
        float f12 = f7 * f2;
        float f13 = f2 * f6;
        return (((((((((((-2) * f9) * f5) + (f5 * f10)) + ((f11 * f9) * f4)) - (f10 * f4)) + f4) + (f12 * f9)) + (f9 * f13)) - (f12 * f8)) - (((f11 * f2) * f6) * f8)) + (f13 * f3);
    }

    public MonoSpline(float[] fArr, float[][] fArr2, float f2) {
        int length = fArr.length;
        int i2 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i3 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i3, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i4 = 0; i4 < length2; i4++) {
            int i5 = 0;
            while (i5 < i3) {
                int i6 = i5 + 1;
                float f3 = fArr[i6] - fArr[i5];
                float[] fArr3 = fArrMakeFloatArray[i5];
                float f4 = (fArr2[i6][i4] - fArr2[i5][i4]) / f3;
                fArr3[i4] = f4;
                if (i5 == 0) {
                    fArrMakeFloatArray2[i5][i4] = f4;
                } else {
                    fArrMakeFloatArray2[i5][i4] = (fArrMakeFloatArray[i5 - 1][i4] + f4) * 0.5f;
                }
                i5 = i6;
            }
            fArrMakeFloatArray2[i3][i4] = fArrMakeFloatArray[length - 2][i4];
        }
        if (!Float.isNaN(f2)) {
            for (int i7 = 0; i7 < length2; i7++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f5 = fArr4[i7] * (1 - f2);
                float[] fArr5 = fArrMakeFloatArray[0];
                float f6 = f5 + (fArr5[i7] * f2);
                fArr5[i7] = f6;
                fArr4[i7] = f6;
                fArrMakeFloatArray2[i3][i7] = f6;
                fArrMakeFloatArray2[0][i7] = f6;
            }
        }
        int i8 = 0;
        while (i8 < i3) {
            while (i2 < length2) {
                float f7 = fArrMakeFloatArray[i8][i2];
                if (f7 == 0.0f) {
                    fArrMakeFloatArray2[i8][i2] = 0.0f;
                    fArrMakeFloatArray2[i8 + 1][i2] = 0.0f;
                } else {
                    float f8 = fArrMakeFloatArray2[i8][i2] / f7;
                    int i9 = i8 + 1;
                    float f9 = fArrMakeFloatArray2[i9][i2] / f7;
                    float fHypot = (float) Math.hypot(f8, f9);
                    if (fHypot > 9.0d) {
                        float f10 = 3.0f / fHypot;
                        float[] fArr6 = fArrMakeFloatArray2[i8];
                        float[] fArr7 = fArrMakeFloatArray[i8];
                        fArr6[i2] = f8 * f10 * fArr7[i2];
                        fArrMakeFloatArray2[i9][i2] = f10 * f9 * fArr7[i2];
                    }
                }
                i2++;
            }
            i8++;
            i2 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrMakeFloatArray2;
    }

    private final float[][] makeFloatArray(int i2, int i3) {
        float[][] fArr = new float[i2][];
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4] = new float[i3];
        }
        return fArr;
    }

    public final float getPos(float f2, int i2) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i3 = 0;
        if (this.isExtrapolate) {
            float f3 = fArr[0];
            if (f2 <= f3) {
                return this.values[0][i2] + ((f2 - f3) * getSlope(f3, i2));
            }
            int i4 = length - 1;
            float f4 = fArr[i4];
            if (f2 >= f4) {
                return this.values[i4][i2] + ((f2 - f4) * getSlope(f4, i2));
            }
        } else {
            if (f2 <= fArr[0]) {
                return this.values[0][i2];
            }
            int i5 = length - 1;
            if (f2 >= fArr[i5]) {
                return this.values[i5][i2];
            }
        }
        int i6 = length - 1;
        while (i3 < i6) {
            float[] fArr2 = this.timePoints;
            float f5 = fArr2[i3];
            if (f2 == f5) {
                return this.values[i3][i2];
            }
            int i7 = i3 + 1;
            float f6 = fArr2[i7];
            if (f2 < f6) {
                float f7 = f6 - f5;
                float f8 = (f2 - f5) / f7;
                float[][] fArr3 = this.values;
                float f9 = fArr3[i3][i2];
                float f10 = fArr3[i7][i2];
                float[][] fArr4 = this.tangents;
                return interpolate(f7, f8, f9, f10, fArr4[i3][i2], fArr4[i7][i2]);
            }
            i3 = i7;
        }
        return 0.0f;
    }

    public static /* synthetic */ void getPos$default(MonoSpline monoSpline, float f2, AnimationVector animationVector, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i2 = 0;
        }
        monoSpline.getPos(f2, animationVector, i2);
    }

    public final void getPos(float f2, AnimationVector animationVector, int i2) {
        int i3 = i2;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i4 = 0;
        int length2 = this.values[0].length;
        if (this.isExtrapolate) {
            float f3 = fArr[0];
            if (f2 <= f3) {
                getSlope(f3, this.slopeTemp);
                for (int i5 = 0; i5 < length2; i5++) {
                    animationVector.set$animation_core_release(i5, this.values[0][i5] + ((f2 - this.timePoints[0]) * this.slopeTemp[i5]));
                }
                return;
            }
            int i6 = length - 1;
            float f4 = fArr[i6];
            if (f2 >= f4) {
                getSlope(f4, this.slopeTemp);
                while (i4 < length2) {
                    animationVector.set$animation_core_release(i4, this.values[i6][i4] + ((f2 - this.timePoints[i6]) * this.slopeTemp[i4]));
                    i4++;
                }
                return;
            }
        } else {
            if (f2 <= fArr[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    animationVector.set$animation_core_release(i7, this.values[0][i7]);
                }
                return;
            }
            int i8 = length - 1;
            if (f2 >= fArr[i8]) {
                while (i4 < length2) {
                    animationVector.set$animation_core_release(i4, this.values[i8][i4]);
                    i4++;
                }
                return;
            }
        }
        int i9 = length - 1;
        while (i3 < i9) {
            if (f2 == this.timePoints[i3]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    animationVector.set$animation_core_release(i10, this.values[i3][i10]);
                }
            }
            float[] fArr2 = this.timePoints;
            int i11 = i3 + 1;
            float f5 = fArr2[i11];
            if (f2 < f5) {
                float f6 = fArr2[i3];
                float f7 = f5 - f6;
                float f8 = (f2 - f6) / f7;
                while (i4 < length2) {
                    float[][] fArr3 = this.values;
                    float f9 = fArr3[i3][i4];
                    float f10 = fArr3[i11][i4];
                    float[][] fArr4 = this.tangents;
                    animationVector.set$animation_core_release(i4, interpolate(f7, f8, f9, f10, fArr4[i3][i4], fArr4[i11][i4]));
                    i4++;
                }
                return;
            }
            i3 = i11;
        }
    }

    public final void getSlope(float f2, float[] fArr) {
        float[] fArr2 = this.timePoints;
        int length = fArr2.length;
        int length2 = this.values[0].length;
        float f3 = fArr2[0];
        if (f2 > f3) {
            f3 = fArr2[length - 1];
            if (f2 < f3) {
                f3 = f2;
            }
        }
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i2) {
            float[] fArr3 = this.timePoints;
            int i4 = i3 + 1;
            float f4 = fArr3[i4];
            if (f3 <= f4) {
                float f5 = fArr3[i3];
                float f6 = f4 - f5;
                float f7 = (f3 - f5) / f6;
                for (int i5 = 0; i5 < length2; i5++) {
                    float[][] fArr4 = this.values;
                    float f8 = fArr4[i3][i5];
                    float f9 = fArr4[i4][i5];
                    float[][] fArr5 = this.tangents;
                    fArr[i5] = diff(f6, f7, f8, f9, fArr5[i3][i5], fArr5[i4][i5]) / f6;
                }
                return;
            }
            i3 = i4;
        }
    }

    public static /* synthetic */ void getSlope$default(MonoSpline monoSpline, float f2, AnimationVector animationVector, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        monoSpline.getSlope(f2, animationVector, i2);
    }

    public final void getSlope(float f2, AnimationVector animationVector, int i2) {
        int i3 = i2;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i4 = 0;
        int length2 = this.values[0].length;
        if (f2 <= fArr[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                animationVector.set$animation_core_release(i5, this.tangents[0][i5]);
            }
            return;
        }
        int i6 = length - 1;
        if (f2 >= fArr[i6]) {
            while (i4 < length2) {
                animationVector.set$animation_core_release(i4, this.tangents[i6][i4]);
                i4++;
            }
            return;
        }
        while (i3 < i6) {
            float[] fArr2 = this.timePoints;
            int i7 = i3 + 1;
            float f3 = fArr2[i7];
            if (f2 <= f3) {
                float f4 = fArr2[i3];
                float f5 = f3 - f4;
                float f6 = (f2 - f4) / f5;
                while (i4 < length2) {
                    float[][] fArr3 = this.values;
                    float f7 = fArr3[i3][i4];
                    float f8 = fArr3[i7][i4];
                    float[][] fArr4 = this.tangents;
                    animationVector.set$animation_core_release(i4, diff(f5, f6, f7, f8, fArr4[i3][i4], fArr4[i7][i4]) / f5);
                    i4++;
                }
                return;
            }
            i3 = i7;
        }
    }

    private final float getSlope(float f2, int i2) {
        float f3 = f2;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i3 = 0;
        float f4 = fArr[0];
        if (f3 < f4) {
            f3 = f4;
        } else {
            float f5 = fArr[length - 1];
            if (f3 >= f5) {
                f3 = f5;
            }
        }
        int i4 = length - 1;
        while (i3 < i4) {
            float[] fArr2 = this.timePoints;
            int i5 = i3 + 1;
            float f6 = fArr2[i5];
            if (f3 <= f6) {
                float f7 = fArr2[i3];
                float f8 = f6 - f7;
                float f9 = (f3 - f7) / f8;
                float[][] fArr3 = this.values;
                float f10 = fArr3[i3][i2];
                float f11 = fArr3[i5][i2];
                float[][] fArr4 = this.tangents;
                return diff(f8, f9, f10, f11, fArr4[i3][i2], fArr4[i5][i2]) / f8;
            }
            i3 = i5;
        }
        return 0.0f;
    }
}
