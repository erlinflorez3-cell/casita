package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
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
/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN0ZS@\u000fs{:$c$\u007fJCU \n*\t]Wogt\\b\u000bQ\u001b\u000eǝ~oBկ}zc܈\u001d1juE2[oe9\u000fuf\u00110428@\u0004\u0011\u001c:HVv)E\fO\u0018DPzHU%S\u0015\u001c\"\u0006tĨ/\"lw\\;`xm<?#9݃RP7_f{{\u0013VX5\u0014\u000faTѨP;C\u001d=S9ޗbcE\u0003MzU\u0007~&]*ʁwWDb@W\u001bۀ_\u0017ku>b\u0015Sp\f]*}n[`\u001c-\u0010\u0007\f\u000fL\u0004Dͺ7J>-Pe6\u0014Cx\u0001ZXP8މR\u0004\tiN\u0017[ĮC3?\u001btZy=/Mmz˿\u0011\u001e1\r74i\u0001&`KÑ\u0005{_^i@kV\u0015\u001eՒAm\u0012\u001f+\u001583HG6.,\u0015<D=7\nGi5Ƞ\u0006HR\u0018?\u000bn\u001aki\u0001z\u00076?\"E7!\f\tR;ʐwÏXX4Ҋ\u001e,b\u0016\u0016\n)\u001f\u0013v\u0013Ɯ1ŎRQpix].\"32~=ip{\u000e\u000e8\r>\fȢeߧeX~ܝW>h\u0016fx\u0013e\u001amt(P@~?fȅ}ΌR\u0010+4E\u0006*I|C'r-H9\u001dx\u0002SȄa˖l\u0014\u0017V9;\u0011\u0002t\u0004\u0017\bh\\'ב\u001e=ͅ0\u0001x$3Z_Oi4c=\u000143\"]ѫ\u007fõKiTGZ|f\u0004c\u00058\u0016P8(Ȁ?т\u0013\u000112\u0010=\u0016^\u0001\u0002iM@D1QPӏ=ÿ2k lvHn\t\u001bsb7:v\u0015аS\fr\u001f\u0012a|ک\u0006\"+ޭgƏM\u0001\u000bYJrP~\u000b@,?!q(\u001fCP\u0014K+;\u0010\u0014e֒\u0012aw\u000fFy\u0019χd3<־8І\u001a}jQkVS:O\u007f\rXB&r*Pk;\n\u0016J!4CΉ~\u0016;ݼXиQ\u000fG\u007fl/:'Adic+o43\u0005ʁ6ϵG\u007f\u001c^Q5akal\u0006y[^\u001bJEϘ\u001b}AnH\u001bk&-͇dס4\f{̸NCA\r\u0013gʨ(g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000f3z\u0018.\\ 7y4\u001dpqeA\u0003r0X\u007f|", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\n", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d e}7\u0006M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f h_\u000fm_5M\u00041KKauZ\\zH\u001e ZWJ4\u0011\rUP(xM\u0001\u001d\u00129IK*z\u000b}\u0012\"\u0013tySV\u001dVy\"K(.dWU)\u0001CJG,\u0014a\u0011_\u001bk\u0010!)\u0010\u0003\u0015doL7\fE=\u000ewRwv=.\u0015\u000471HqZY\u000fm_D\u007f1-KEs\u001b6`p:x7\r}(@q\u0005\u0015C!Bft$0fJ\u0018&4K\u001dL!'f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3y\u001eli5\u0016g6Wd2GJ$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i(m\u0014=WP?\u00014\u001dpqeA\u0003r0X\u007f\u0015RLL\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001\u001b\u00110Q}Jl\u000b\u0015_\f?wp\fE\"Qk\u0011\n\u001f3qWYl\tGN\u001bI/`\u001d[fc6C&][\u0016 hN=_bX\r\u0004NCncP\u001bD\"!CmYU\u001bVQEs4)Oz\u000b[0b|6~;\u0004}&?h\rGv\u001cHgB\u00136iAp\u0002?@\u001b;Zg\u007fu/\u000ef.k\u0015c&&", "-cd?T;B]\"gvg6\u000b", "", "-d]1I,E]\u0017\u0003\nr", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-${1\u007fH|&\u001bQx\b:\u000125S\u000b >m\u0012<M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001^\u0016,\\MHoI\u001e\u0014Dj=\u000f_;R\u000105WN*2", "2ta.g0H\\\u0002z\u0004h:", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "u(9", "3mS#X3HQ\u001d\u000e\u000f", "5dc\u0012a+/S \txb;\u0011", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u0002", "5dc\u0016a0MW\u0015\u0006kZ3\r\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7mXA\\(ED\u0015\u0006\u000b^\u001d|\u0007>o\r", "7r8;Y0GW(~", "", "u(I", "D`[BX", ";tc.U3>7\"\u0003\nb(\u0004y+l\u0010(", "5dc\u001ah;:P ~^g0\f\r+lp$\u0003P\u0001U\u0013Ps\u00168\u0006)?bw\u001eAz\u0016(ZCBk0,\u0015", "Adc\u001ah;:P ~^g0\f\r+lp$\u0003P\u0001U\u0013Ps\u00168\u0006)?bw\u001eAz\u0016(ZCBk0,\u0015", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", ";tc.U3>B\u0015\f|^;m\u00056u\u007f", "5dc\u001ah;:P ~iZ9~\t>V{/\f@?\u0013 Kw\nKz/>S{*Dm\u0010;MJ;gB\u001e", "Adc\u001ah;:P ~iZ9~\t>V{/\f@?\u0013 Kw\nKz/>S{*Dm\u0010;MJ;gB\u001e", "5dc!T9@S(ove<|", "B`a4X;/O \u000fzO,z\u00189r", "5dc!l7>1#\b\f^9\f\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\(8??OI>'&hnH\u0007p\u0002", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "uI\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "5dc#X3HQ\u001d\u000e\u000fO,z\u00189r`5\u0006Hi\u0013 Q}", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n| \u001bOk\u001d@\u0001.~W\b-77q7QK7z8(\u001eYa7\u0016m9$", "BnBAe0GU", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 8;
    private long _durationNanos;
    private V _endVelocity;
    private final VectorizedAnimationSpec<V> animationSpec;
    private V initialValueVector;
    private final V initialVelocityVector;
    private T mutableInitialValue;
    private T mutableTargetValue;
    private V targetValueVector;
    private final TwoWayConverter<T, V> typeConverter;

    public TargetBasedAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t2, T t3, V v2) {
        V v3;
        this.animationSpec = vectorizedAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.mutableTargetValue = t3;
        this.mutableInitialValue = t2;
        this.initialValueVector = getTypeConverter().getConvertToVector().invoke(t2);
        this.targetValueVector = getTypeConverter().getConvertToVector().invoke(t3);
        this.initialVelocityVector = (v2 == null || (v3 = (V) AnimationVectorsKt.copy(v2)) == null) ? (V) AnimationVectorsKt.newInstance(getTypeConverter().getConvertToVector().invoke(t2)) : v3;
        this._durationNanos = -1L;
    }

    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((VectorizedAnimationSpec<AnimationVector>) vectorizedAnimationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i2 & 16) != 0 ? null : animationVector);
    }

    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core_release() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getMutableTargetValue$animation_core_release() {
        return this.mutableTargetValue;
    }

    public final void setMutableTargetValue$animation_core_release(T t2) {
        if (Intrinsics.areEqual(this.mutableTargetValue, t2)) {
            return;
        }
        this.mutableTargetValue = t2;
        this.targetValueVector = getTypeConverter().getConvertToVector().invoke(t2);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final T getMutableInitialValue$animation_core_release() {
        return this.mutableInitialValue;
    }

    public final void setMutableInitialValue$animation_core_release(T t2) {
        if (Intrinsics.areEqual(t2, this.mutableInitialValue)) {
            return;
        }
        this.mutableInitialValue = t2;
        this.initialValueVector = getTypeConverter().getConvertToVector().invoke(t2);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final T getInitialValue() {
        return this.mutableInitialValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.mutableTargetValue;
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((AnimationSpec<Object>) animationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i2 + 16) - (i2 | 16) != 0 ? null : animationVector);
    }

    public TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t2, T t3, V v2) {
        this(animationSpec.vectorize(twoWayConverter), twoWayConverter, t2, t3, v2);
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j2) {
        if (!isFinishedFromNanos(j2)) {
            AnimationVector valueFromNanos = this.animationSpec.getValueFromNanos(j2, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
            int size$animation_core_release = valueFromNanos.getSize$animation_core_release();
            for (int i2 = 0; i2 < size$animation_core_release; i2++) {
                if (Float.isNaN(valueFromNanos.get$animation_core_release(i2))) {
                    PreconditionsKt.throwIllegalStateException("AnimationVector cannot contain a NaN. " + valueFromNanos + ". Animation: " + this + ", playTimeNanos: " + j2);
                }
            }
            return (T) getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        if (this._durationNanos < 0) {
            this._durationNanos = this.animationSpec.getDurationNanos(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this._durationNanos;
    }

    private final V getEndVelocity() {
        V v2 = this._endVelocity;
        if (v2 != null) {
            return v2;
        }
        V v3 = (V) this.animationSpec.getEndVelocity(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = v3;
        return v3;
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j2) {
        return !isFinishedFromNanos(j2) ? (V) this.animationSpec.getVelocityFromNanos(j2, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : (V) getEndVelocity();
    }

    public String toString() {
        return "TargetBasedAnimation: " + getInitialValue() + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.animationSpec;
    }
}
