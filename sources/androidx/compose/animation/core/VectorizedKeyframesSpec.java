package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
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
/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&˛\bDZc|\u0004W\u00068é6B\rD4\u0012\u0006\rnjO0Le^.ZS0\u0011s{J$c$\bCCU0}*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[~e\u0012\u001dEJģG3[\u0002E9fy>\u0005.7*8\u007f\u0006\t\u001a8Q\u0018v\u0001CS\f 7Hp@V\u0015M\u0013\u001a\u001a\u0006D \u0007#rɡv<NǍk9W#1irT7a@|\u0014\ftUgD|u.GN9M-5U\u0013\u0007\u0001_O\u0011O}M\u0007x']ǢYug6\u0007\u0006B\u001aYR\u001da\u0001-t\u0005\u007fd\u001c-1OqSh\u000eV{ߡ\u007f\rJ\rNG-Ξ>1(p \u000ea\u007f\u0003cNR\u001ajR\b\u000bgF\u00195\u007fiٿg(\u0015]q?'UO{3\u0011.'\u000fv9[\u0003\u0012p\u0019)b\u0010Q_WPAV]\"Yk}ձtb\u0010;L>U#G{?2G)E\u007fQ#OoHH\ru\u0005*xh\u0002\u0010\u0003LNF\u0007\u0016e.O\f#br,\u0004P\u0003~\\\u0015[Dl\u0007,\fC$j\u001cT!S\u0014~Sv\u0013\u0003M\f4k//bg\u001a\u0004\u000e\u000eު\u000f7C}{\u0010\u0010\u007f'\u0018Mjz\u0005\u000f٨rW\u001a\nt(Xõxn\u001e(\u0014D\u0005ۼYFƐu\u001cB]yDjG`\u0003TՓq\u0001\u0017\frh>,\u0005721\u0002$+է1Tj \bg/̢\\\u0001nREA\bځ_:Ɓ&hB.k*\r'\u0018G\u0016\u0001wPzD\u000eU2\u008dF\u001eG\u0001G=IÁ/-@2EE\u0003ǩ,Q̊\u0016'\t2J\u001bIzFg6}Gݝ\rʧNO\\ϟr\u0003l\u0001;\b\u0013\u0006PӖHیKc\\ެ,PWz\u001bYjR\u000fٟ\u0007ȷ\"+\tǻ:~;AQ<m(\u0006\u001bG\u0015\u0010a@܇0ԃf\u0015.۩}\u00062y$\u00053ekAS8wiUЙ$ڳk×ޢGi͎\fD\u00114\u001bJ\u0019YrrnD]\u0013?\u0004v\t<\r'£\nGA{Tұ0ʡ.sK͟dlQ=)M\n܊Dޱwů\u000fL\u0017\n\u0019\u0015\u0002| 6U \r̰9ׁ\\Ӓw\u001a>AI{UH\u0017?L,j$a͒\u0001Ɏ\n\u0010\u0003Ĕ\u0017k\u001d4JB\"Y-\u0558\u0001ܢ`VPγ1Qn@B\u0001--\nͫ%\u00985\u0005uۮ%;qR\u0019SK'q˅{ǎj%3ל%E)2p\u00019P4ŠKΜ:\u0004Oӣ>y}-P\u00183܈\u0019ȳGʦU\u0013gv>w[crp|vHצ)ƌNĹ\u0003|\u0005\u000eJ#ۊ\u000b\"WuuܐIzM\u007f7I9ݮ\u001bz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3\u0004\u0015|bF\u0003k,\\d2GJ$", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3|%u]H\u000bm5+r5GK*5`ZnL\u0018\u001cc{Y+\u000bZ", "9dh3e(FS'", "", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", "2ta.g0H\\\u0001\u0003\u0002e0\u000b", "2d[.l\u0014BZ \u0003\t", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005Ickl", "Bh\\2f;:[$\r", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &1l\u0013<t4\u001dU\tu", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3\u0004\u0015|bF\u0003k,<\u0002'E,U,dR{Lw\u001b[\u0018$", "2dU.h3M3\u0015\r~g.", "7mXA\\(E/&|bh+|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk}8LC\u0011", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJz VV\u0012J\u0006z\u001cU\u0007\u001fDw\u001a-`\r9u;%\u0015fp=\u0011lu2\u007f61IS,ZaZ9\u001fg>q5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\b\u001f\u0012=f\u007fF`\u0019\u0011w\u001f\u0003ArHBgc\u0003I\u0017)I0n\u001bf!e\u0004?5\u001c;\u001d$wP;\u0013wZZQRzcwN(XB-L|hVC~_I\\#,Q{\u0005guI", "/qR c3B\\\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk\u00049TGDk\n", "5dc\u0011X3:g\u0001\u0003\u0002e0\u000b", "u(8", "5dc\u0011h9:b\u001d\t\u0004F0\u0004\u00103s", "\u0017", ":`bA<5Bb\u001dz\u0002O(\u0004\u0019/", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", ":`bAG(KU\u0019\u000ekZ3\r\t", ";nS2f", "", ">nb\u000ee9:g", "", "Ak^=X\bK`\u0015\u0013", "Bh\\2f", "D`[BX\u001d>Q(\t\b", "Dd[<V0Mg\n~xm6\n", "4h]185M`-_\u0005k\u001b\u0001\u0011/M\u0004/\u0003D\u000f", "Bh\\2@0EZ\u001d\r", "5dc\u0012T:>R\b\u0003\u0003^", "", "5dc\u0012T:>R\b\u0003\u0003^\r\n\u00137I\t'{S", "7mS2k", "/r5?T*MW#\b", "", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJg\u001f\u0012=f\u007fF`\u00198y\u0013\u0005K6>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1#\"~@ MqeO6oSK~4t\u000fbs\u001b1e~/s@M24>o\u000fYga:g|\u001d(kE1/\u007f:\u001dLK-QuB\u0016d.e\u0012\u0017S5/(or9", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "7mXA", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~OBb^\u0007QEDusb\u0016g(fH:m\u0010z\u001d#d_2\u0014\u0005\u001d\u000f|_y1CP\u001d\u000343Bwd7EmdF\u0002|b<", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private ArcSpline arcSpline;
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;
    private final IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private int[] modes;
    private float[] posArray;
    private float[] slopeArray;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private V velocityVector;

    public /* synthetic */ VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i2, int i3, Easing easing, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(intList, intObjectMap, i2, i3, easing, i4);
    }

    private VectorizedKeyframesSpec(IntList intList, IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> intObjectMap, int i2, int i3, Easing easing, int i4) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.defaultEasing = easing;
        this.initialArcMode = i4;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public VectorizedKeyframesSpec(Map<Integer, ? extends Pair<? extends V, ? extends Easing>> map, int i2, int i3) {
        MutableIntList mutableIntList = new MutableIntList(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            mutableIntList.add(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!map.containsKey(Integer.valueOf(i2))) {
            mutableIntList.add(i2);
        }
        mutableIntList.sort();
        MutableIntList mutableIntList2 = mutableIntList;
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        for (Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<? extends V, ? extends Easing> value = entry.getValue();
            mutableIntObjectMap.set(iIntValue, new VectorizedKeyframeSpecElementInfo(value.getFirst(), value.getSecond(), ArcMode.Companion.m489getArcLinear9TMq4(), null));
        }
        this(mutableIntList2, mutableIntObjectMap, i2, i3, EasingKt.getLinearEasing(), ArcMode.Companion.m489getArcLinear9TMq4(), null);
    }

    private final void init(V v2, V v3, V v4) {
        float[] fArr;
        boolean z2 = this.arcSpline != null;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v2);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v4);
            int size = this.timestamps.getSize();
            float[] fArr2 = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                fArr2[i2] = this.timestamps.get(i2) / 1000;
            }
            this.times = fArr2;
            int size2 = this.timestamps.getSize();
            int[] iArr = new int[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(this.timestamps.get(i3));
                int iM543getArcMode9TMq4 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.m543getArcMode9TMq4() : this.initialArcMode;
                if (!ArcMode.m483equalsimpl0(iM543getArcMode9TMq4, ArcMode.Companion.m489getArcLinear9TMq4())) {
                    z2 = true;
                }
                iArr[i3] = iM543getArcMode9TMq4;
            }
            this.modes = iArr;
        }
        if (z2) {
            float[] fArr3 = null;
            if (this.arcSpline != null) {
                V v5 = this.lastInitialValue;
                if (v5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastInitialValue");
                    v5 = null;
                }
                if (Intrinsics.areEqual(v5, v2)) {
                    V v6 = this.lastTargetValue;
                    if (v6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("lastTargetValue");
                        v6 = null;
                    }
                    if (Intrinsics.areEqual(v6, v3)) {
                        return;
                    }
                }
            }
            this.lastInitialValue = v2;
            this.lastTargetValue = v3;
            int size$animation_core_release = (v2.getSize$animation_core_release() % 2) + v2.getSize$animation_core_release();
            this.posArray = new float[size$animation_core_release];
            this.slopeArray = new float[size$animation_core_release];
            int size3 = this.timestamps.getSize();
            float[][] fArr4 = new float[size3][];
            for (int i4 = 0; i4 < size3; i4++) {
                int i5 = this.timestamps.get(i4);
                if (i5 == 0) {
                    if (!this.keyframes.contains(i5)) {
                        fArr = new float[size$animation_core_release];
                        for (int i6 = 0; i6 < size$animation_core_release; i6++) {
                            fArr[i6] = v2.get$animation_core_release(i6);
                        }
                    } else {
                        fArr = new float[size$animation_core_release];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(i5);
                        Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo2);
                        AnimationVector vectorValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
                        for (int i7 = 0; i7 < size$animation_core_release; i7++) {
                            fArr[i7] = vectorValue.get$animation_core_release(i7);
                        }
                    }
                } else if (i5 == getDurationMillis()) {
                    if (!this.keyframes.contains(i5)) {
                        fArr = new float[size$animation_core_release];
                        for (int i8 = 0; i8 < size$animation_core_release; i8++) {
                            fArr[i8] = v3.get$animation_core_release(i8);
                        }
                    } else {
                        fArr = new float[size$animation_core_release];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(i5);
                        Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo3);
                        AnimationVector vectorValue2 = vectorizedKeyframeSpecElementInfo3.getVectorValue();
                        for (int i9 = 0; i9 < size$animation_core_release; i9++) {
                            fArr[i9] = vectorValue2.get$animation_core_release(i9);
                        }
                    }
                } else {
                    fArr = new float[size$animation_core_release];
                    VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo4 = this.keyframes.get(i5);
                    Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo4);
                    AnimationVector vectorValue3 = vectorizedKeyframeSpecElementInfo4.getVectorValue();
                    for (int i10 = 0; i10 < size$animation_core_release; i10++) {
                        fArr[i10] = vectorValue3.get$animation_core_release(i10);
                    }
                }
                fArr4[i4] = fArr;
            }
            int[] iArr2 = this.modes;
            if (iArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("modes");
                iArr2 = null;
            }
            float[] fArr5 = this.times;
            if (fArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("times");
            } else {
                fArr3 = fArr5;
            }
            this.arcSpline = new ArcSpline(iArr2, fArr3, fArr4);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v2, V v3, V v4) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j2 / AnimationKt.MillisToNanos);
        if (this.keyframes.contains(iClampPlayTime)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(iClampPlayTime);
            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo);
            return (V) vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return v3;
        }
        if (iClampPlayTime <= 0) {
            return v2;
        }
        init(v2, v3, v4);
        int i2 = 0;
        if (this.arcSpline != null) {
            float easedTime = getEasedTime(iClampPlayTime);
            ArcSpline arcSpline = this.arcSpline;
            if (arcSpline == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
                arcSpline = null;
            }
            float[] fArr = this.posArray;
            if (fArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("posArray");
                fArr = null;
            }
            arcSpline.getPos(easedTime, fArr);
            float[] fArr2 = this.posArray;
            if (fArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("posArray");
                fArr2 = null;
            }
            int length = fArr2.length;
            while (i2 < length) {
                V v5 = this.valueVector;
                if (v5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                    v5 = null;
                }
                float[] fArr3 = this.posArray;
                if (fArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("posArray");
                    fArr3 = null;
                }
                v5.set$animation_core_release(i2, fArr3[i2]);
                i2++;
            }
            V v6 = this.valueVector;
            if (v6 != null) {
                return v6;
            }
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime, true);
        int i3 = this.timestamps.get(iFindEntryForTimeMillis);
        if (this.keyframes.contains(i3)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(i3);
            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo2);
            v2 = (V) vectorizedKeyframeSpecElementInfo2.getVectorValue();
        }
        int i4 = this.timestamps.get(iFindEntryForTimeMillis + 1);
        if (this.keyframes.contains(i4)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(i4);
            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo3);
            v3 = (V) vectorizedKeyframeSpecElementInfo3.getVectorValue();
        }
        V v7 = this.valueVector;
        if (v7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v7 = null;
        }
        int size$animation_core_release = v7.getSize$animation_core_release();
        while (i2 < size$animation_core_release) {
            V v8 = this.valueVector;
            if (v8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v8 = null;
            }
            v8.set$animation_core_release(i2, VectorConvertersKt.lerp(v2.get$animation_core_release(i2), v3.get$animation_core_release(i2), easedTimeFromIndex));
            i2++;
        }
        V v9 = this.valueVector;
        if (v9 != null) {
            return v9;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v2, V v3, V v4) {
        long jClampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j2 / AnimationKt.MillisToNanos);
        if (jClampPlayTime < 0) {
            return v4;
        }
        init(v2, v3, v4);
        int i2 = 0;
        if (this.arcSpline != null) {
            float easedTime = getEasedTime((int) jClampPlayTime);
            ArcSpline arcSpline = this.arcSpline;
            if (arcSpline == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
                arcSpline = null;
            }
            float[] fArr = this.slopeArray;
            if (fArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                fArr = null;
            }
            arcSpline.getSlope(easedTime, fArr);
            float[] fArr2 = this.slopeArray;
            if (fArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                fArr2 = null;
            }
            int length = fArr2.length;
            while (i2 < length) {
                V v5 = this.velocityVector;
                if (v5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                    v5 = null;
                }
                float[] fArr3 = this.slopeArray;
                if (fArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                    fArr3 = null;
                }
                v5.set$animation_core_release(i2, fArr3[i2]);
                i2++;
            }
            V v6 = this.velocityVector;
            if (v6 != null) {
                return v6;
            }
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        VectorizedKeyframesSpec<V> vectorizedKeyframesSpec = this;
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, jClampPlayTime - 1, v2, v3, v4);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, jClampPlayTime, v2, v3, v4);
        int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
        while (i2 < size$animation_core_release) {
            V v7 = this.velocityVector;
            if (v7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v7 = null;
            }
            v7.set$animation_core_release(i2, (valueFromMillis.get$animation_core_release(i2) - valueFromMillis2.get$animation_core_release(i2)) * 1000.0f);
            i2++;
        }
        V v8 = this.velocityVector;
        if (v8 != null) {
            return v8;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    private final float getEasedTime(int i2) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(i2), i2, false);
    }

    private final float getEasedTimeFromIndex(int i2, int i3, boolean z2) {
        Easing easing;
        float f2;
        if (i2 >= this.timestamps._size - 1) {
            f2 = i3;
        } else {
            int i4 = this.timestamps.get(i2);
            int i5 = this.timestamps.get(i2 + 1);
            if (i3 == i4) {
                f2 = i4;
            } else {
                int i6 = i5 - i4;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(i4);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f3 = i6;
                float fTransform = easing.transform((i3 - i4) / f3);
                if (z2) {
                    return fTransform;
                }
                f2 = (f3 * fTransform) + i4;
            }
        }
        return f2 / 1000;
    }

    private final int findEntryForTimeMillis(int i2) {
        int iBinarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, i2, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }
}
