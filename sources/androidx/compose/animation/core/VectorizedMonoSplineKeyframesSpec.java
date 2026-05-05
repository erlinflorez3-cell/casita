package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: VectorizedMonoSplineKeyframesSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.hS2şs{B*c$wCCU(\u0003*\tUTog\u0005JbŏK\u000f\u0014(\u0001j2I]xk!\u00172HvG3[vE9fx>\u0005.2*8\u007f\u0005\u0007\u0019@Ϻ8|\u0001ŏY\u000b:0npjX\u001dO\u0015\u001aX\u0005l!A[lk\\8`l\f=?9\u0011mZ`7m@\t]\u000fVT]˙\u0007c.+n>c\u001bSX\u0013\u000b`cW\u0003mzM\tv1?+w|g:f\u000b,\u0015Y[ոar4iM_n)?+}l{T\u001cF\u0010z*\u0016\u0003\u0004V\u001c5gF-Hr8\u0012A\u0015\u000bSnY2bP\u001e\u0013ad k\u007f{9G<~Q\u0010BIRE\u001c\u001d\rL,Gni\u0007b0x\u0015QƘ(U?tX=vr:]K\u0013\u001cp\u0019̣Z\b>m\u0018/2߾^\u001b3^s9Yܩ2\u0016ҩHg\u0005-)\u0014a\u0013jHv̎\u001f\u001aEM!\f\th\u0015\tyulXbҊ} b-\u0016\bI\u05fe\r{JH=\u0010\u0005и/}ҷQ]\u0018Mw\nE\u0004\u0007k<\u0003ibAZicFР\u0003z\"eTb;֚\u0017Fa3r\\^ίxHн\u0014w\np\u001f\u001e!<WqJ=\u0003֒\u001bÅ\u0019N\u000bٜZC\u0003\u0017mi9\"\r\\K$1rzڦ\u000bɹTbxב\u007fzO<\u000borKOUM+6c2tD~3\u00075͞\u0010IwLuS\u001b\u001c$ZR\u0090\u0018׀=Q7ˋc\u001f\r:J\u0004CD\u0003ǩ<ʻYɟ+|\u0005y\u001dM9>u\u001b\u0003rB_!\u07ba&ܺ#Ȕz`z#\u0016vP\u0006oZ\u0013G\u0012iaϸjϗv\u0003aߢ\u001fD\u000b\u00107\u001eS\rFܵ~ީ1C/ݴf\u0004\"E-a\f\u0001FІ&ˏ\u0013&|ЁT8q\u0018\bb\u007f`\tձ:ա]~FЭtz\u0011Z`j.٤\u0019މ`٢7JId~h\ta\u0019H\u0016l\u0017.\u001dp\u0005rh-Fϛ`ˀc,{C\f//Q3-eS\u001eƚDй\t\u05c8N\u0011\u0012\u000b\nCߔ\u0016I"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3\u0006\u001fqk'\u0012j0Wv\rG`O9XZrK\u0002\u001dZ\f$", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3|%u]H\u000bm5+r5GK*5`ZnL\u0018\u001cc{Y+\u000bZ", "Bh\\2f;:[$\r", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "9dh3e(FS'", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &1l\u0013<t4\u001dU\tu", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", "2ta.g0H\\\u0001\u0003\u0002e0\u000b", "", "2d[.l\u0014BZ \u0003\t", ">da6b+BQu\u0003vl", "", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJz VV\u0012J\u0006z\u001cU\u0007\u001fDw\u001a-`\r9u;%\u0015fp=\u0011lu2\u007f61IS,ZaZ9\u001fg>q/n}", "5dc\u0011X3:g\u0001\u0003\u0002e0\u000b", "u(8", "5dc\u0011h9:b\u001d\t\u0004F0\u0004\u00103s", ":`bA<5Bb\u001dz\u0002O(\u0004\u0019/", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", ":`bAG(KU\u0019\u000ekZ3\r\t", ";n]<F7EW\"~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bAv \u001cXJ?t4s", "Bh\\2f", "", "D`[BX\u001d>Q(\t\b", "D`[BX:", "", ")Z5", "Dd[<V0Mg\n~xm6\n", "4h]185M`-_\u0005k\u001b\u0001\u0011/M\u0004/\u0003D\u000f", "Bh\\2@0EZ\u001d\r", "5dc\u0012T:>R\b\u0003\u0003^\r\n\u00137I\t'{S", "7mS2k", "5dc\u0012T:B\\\u001b", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJg\u001f\u0012=f\u007fF`\u00198y\u0013\u0005K6>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1#\"~@ MqeO6oSK~4t\u000fbs\u001b1e~/s@M24>o\u000fYga:g|\u001d(kE1/\u007f:\u001dLK-QuB\u0016d.e\u0012\u0017S5/(or9", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "7mXA", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~OBb^\u0007QEDusb\u0016g(fH:m\u0010z\u001d#d_2\u0014\u0005\u001d\u000f|_y1CP\u001d\u000343Bwd7EmdF\u0002|b<", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final IntObjectMap<Pair<V, Easing>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private float[][] values;
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(IntList intList, IntObjectMap<Pair<V, Easing>> intObjectMap, int i2, int i3, float f2) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.periodicBias = f2;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    private final void init(V v2, V v3, V v4) {
        float[] fArr;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v2);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v4);
            int size = this.timestamps.getSize();
            float[] fArr2 = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                fArr2[i2] = this.timestamps.get(i2) / 1000;
            }
            this.times = fArr2;
        }
        if (this.monoSpline != null && Intrinsics.areEqual(this.lastInitialValue, v2) && Intrinsics.areEqual(this.lastTargetValue, v3)) {
            return;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.lastInitialValue, v2);
        boolean zAreEqual2 = Intrinsics.areEqual(this.lastTargetValue, v3);
        this.lastInitialValue = v2;
        this.lastTargetValue = v3;
        int size$animation_core_release = v2.getSize$animation_core_release();
        float[][] fArr3 = null;
        if (this.values == null) {
            int size2 = this.timestamps.getSize();
            float[][] fArr4 = new float[size2][];
            for (int i3 = 0; i3 < size2; i3++) {
                int i4 = this.timestamps.get(i3);
                if (i4 == 0) {
                    if (!this.keyframes.contains(i4)) {
                        fArr = new float[size$animation_core_release];
                        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
                            fArr[i5] = v2.get$animation_core_release(i5);
                        }
                    } else {
                        fArr = new float[size$animation_core_release];
                        Pair<V, Easing> pair = this.keyframes.get(i4);
                        Intrinsics.checkNotNull(pair);
                        V first = pair.getFirst();
                        for (int i6 = 0; i6 < size$animation_core_release; i6++) {
                            fArr[i6] = first.get$animation_core_release(i6);
                        }
                    }
                } else if (i4 == getDurationMillis()) {
                    if (!this.keyframes.contains(i4)) {
                        fArr = new float[size$animation_core_release];
                        for (int i7 = 0; i7 < size$animation_core_release; i7++) {
                            fArr[i7] = v3.get$animation_core_release(i7);
                        }
                    } else {
                        fArr = new float[size$animation_core_release];
                        Pair<V, Easing> pair2 = this.keyframes.get(i4);
                        Intrinsics.checkNotNull(pair2);
                        V first2 = pair2.getFirst();
                        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
                            fArr[i8] = first2.get$animation_core_release(i8);
                        }
                    }
                } else {
                    fArr = new float[size$animation_core_release];
                    Pair<V, Easing> pair3 = this.keyframes.get(i4);
                    Intrinsics.checkNotNull(pair3);
                    V first3 = pair3.getFirst();
                    for (int i9 = 0; i9 < size$animation_core_release; i9++) {
                        fArr[i9] = first3.get$animation_core_release(i9);
                    }
                }
                fArr4[i3] = fArr;
            }
            this.values = fArr4;
        } else {
            if (!zAreEqual && !this.keyframes.contains(0)) {
                float[][] fArr5 = this.values;
                if (fArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("values");
                    fArr5 = null;
                }
                int iBinarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, 0, 0, 0, 6, null);
                float[] fArr6 = new float[size$animation_core_release];
                for (int i10 = 0; i10 < size$animation_core_release; i10++) {
                    fArr6[i10] = v2.get$animation_core_release(i10);
                }
                fArr5[iBinarySearch$default] = fArr6;
            }
            if (!zAreEqual2 && !this.keyframes.contains(getDurationMillis())) {
                float[][] fArr7 = this.values;
                if (fArr7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("values");
                    fArr7 = null;
                }
                int iBinarySearch$default2 = IntListExtensionKt.binarySearch$default(this.timestamps, getDurationMillis(), 0, 0, 6, null);
                float[] fArr8 = new float[size$animation_core_release];
                for (int i11 = 0; i11 < size$animation_core_release; i11++) {
                    fArr8[i11] = v3.get$animation_core_release(i11);
                }
                fArr7[iBinarySearch$default2] = fArr8;
            }
        }
        float[] fArr9 = this.times;
        if (fArr9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("times");
            fArr9 = null;
        }
        float[][] fArr10 = this.values;
        if (fArr10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("values");
        } else {
            fArr3 = fArr10;
        }
        this.monoSpline = new MonoSpline(fArr9, fArr3, this.periodicBias);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v2, V v3, V v4) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j2 / AnimationKt.MillisToNanos);
        if (this.keyframes.containsKey(iClampPlayTime)) {
            Pair<V, Easing> pair = this.keyframes.get(iClampPlayTime);
            Intrinsics.checkNotNull(pair);
            return pair.getFirst();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return v3;
        }
        if (iClampPlayTime <= 0) {
            return v2;
        }
        init(v2, v3, v4);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline = null;
        }
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime);
        V v5 = this.valueVector;
        if (v5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v5 = null;
        }
        monoSpline.getPos(easedTimeFromIndex, v5, iFindEntryForTimeMillis);
        V v6 = this.valueVector;
        if (v6 != null) {
            return v6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v2, V v3, V v4) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j2 / AnimationKt.MillisToNanos);
        if (iClampPlayTime < 0) {
            return v4;
        }
        init(v2, v3, v4);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline = null;
        }
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime);
        V v5 = this.velocityVector;
        if (v5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v5 = null;
        }
        monoSpline.getSlope(easedTimeFromIndex, v5, iFindEntryForTimeMillis);
        V v6 = this.velocityVector;
        if (v6 != null) {
            return v6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    private final Easing getEasing(int i2) {
        Easing second;
        Pair<V, Easing> pair = this.keyframes.get(this.timestamps.get(i2));
        return (pair == null || (second = pair.getSecond()) == null) ? EasingKt.getLinearEasing() : second;
    }

    private final float getEasedTimeFromIndex(int i2, int i3) {
        float f2;
        if (i2 >= this.timestamps._size - 1) {
            f2 = i3;
        } else {
            int i4 = this.timestamps.get(i2);
            int i5 = this.timestamps.get(i2 + 1);
            if (i3 != i4) {
                float f3 = i5 - i4;
                return ((f3 * getEasing(i2).transform((i3 - i4) / f3)) + i4) / 1000;
            }
            f2 = i4;
        }
        return f2 / 1000;
    }

    private final int findEntryForTimeMillis(int i2) {
        int iBinarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, i2, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }
}
