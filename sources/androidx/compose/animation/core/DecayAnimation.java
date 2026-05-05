package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN1ZS@\u000fs{:$c$\u007fJCU \u0007*\t]WogtS`\u0010YƤ.\u0018~̓:H}~c\u0011\u001d2jom4}{M;pt|\u00040428@\u0005/\u001cj\u007f\u0016\u000b\u000bMY\u000f*6PrJRC˟3\u001e\"\u0016L%\u0019*li^6~Ǎm<?#9hpT7c>\u0004e\r|Ö7\u0011\u0005i6+v6߱\u0019%a\fG\naS\u0013I\u007f@\u001dn7);I*Ɏd\\\u0010$#0g\u0019mt6\\;ĩp\u000e7+\u0006byV\u001e,\u0006\u0002\u0014\rrǉ\u001e\n5RF-PǑڿ\u00123\u0003}\u0014u`\flE\u0018\u0001q8'%62YE+v_fS%^9\f\u0005C̔3\u0003~!\u0012S<f%\u001fb~i1\b̵ML\\\u0012q=$\u0003Ͳf\u00028\u0011xZ\u000eP\u0014\u0011dϏU;i[;!\u001a\u0011\u000fXϼz\u0005n\f\u001c|`lX\"%\u0015g.\u0017.rD\u0013\u00142dԜ\\,\u001frlf\u0015\u0001 \u00190^\b<W$>Z&řkҷQ]\u0012ɘ\u007fzEg\u0007k<fo3\ņSӒ\u0014gZΘ,ABr\u0013i7Pa\u001er\\^!\tʎlݻ{}LN\u001a&\u0003P\u007f#L,gǉÅ\u0019P\u000b\u001ePW\u0015\u000benv%ObA;\u001biZs_əRʷtqoxW?Mq05YQk\u0018łY*p4\u000b6\u001f\u0001y\u0018U\u0001\u001dYZ\u0007.u\u0004\u0017vڝ\\\u07fcU5EП'\u0001/L\u0010I\u0016`\u0001\u0003iMH\u05fdQ۷{ӛ?p6g\u0016\u0001\t.f\tXd%50{v~3\nt\u007f0ӓV|Wc\u000b\n\nD Ζ\u0005ʾ@T@و\u001d!$D\u000f\u0010ݛ\u0001["}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj\u000f", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\n", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "7mXA\\(ED\u0015\u0006\u000b^", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d e}7\u0006M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0016m\u0014*a\u001fDo<\u001a$lkBtn,LL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#=-rL3.\f6RK9r\u000e\f_|Gtb>jmQ\u0003&uN8hS/F~CRA,1`\u0015afF7?$\u0012\u0001n\u0002dY-\u0017\u0006W\u0010\u0006\u001cwqoR#\t8m:v_NA~YF}p\u001dU\tw[\u000eax3p<\b>3'd\u0003Zq%\u0014\"i", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0016m\u0014*a\u001fDo<\u001a$lkBtn,LL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#=-rL3.\f6RK9r\u000e\f_|Gtb>jmQ\u0003&uN8hS/F~CRA,1`\u0015afF7?$\u0012\u0001n\u0002mL?\u0006EZ\r{TCQdL\u0019xGy\u0002^", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3|\u0015f]Mbl0Vr6KVW\u001agRp\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i(m\u0014=WP?\u00014\u001dsh_5\u001b?5R~#VPX5J]r;ixV\u0017M8\u0017\tXTmlN?*\u0012:IK7q\u0005\u0014\u0012\u001d9ty\fT\u001aTy^dS3ZBm=\u0004PREo9d\u00195\u0004a6K ]x\u0015$j\u001a\u0018\u0007\u0001S\u000f\u0002(`cpF&\u0005<#Q7YPMz_Jtp\u001bT\u007f\u007f\u000eA\\~4>+\u000eA*\u007f@\u000eOo\u0014Mb\u0003\u001e\u001d\\?60C\u0012V0", "2ta.g0H\\\u0002z\u0004h:", "", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "u(9", "3mS#X3HQ\u001d\u000e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "5dc\u0016a0MW\u0015\u0006kZ3\r\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "7mXA\\(ED\u0015\u0006\u000b^\u001d|\u0007>o\r", "5dc\u0016a0MW\u0015\u0006k^3\u0007\u00073t\u0014\u0019{>\u0010!$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u0002", "7r8;Y0GW(~", "", "u(I", "B`a4X;/O \u000fz", "5dc!T9@S(ove<|", "5dc!l7>1#\b\f^9\f\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\(8??OI>'&hnH\u0007p\u0002", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "uI\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "5dc#X3HQ\u001d\u000e\u000fO,z\u00189r`5\u0006Hi\u0013 Q}", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n| \u001bOk\u001d@\u0001.~W\b-77q7QK7z8(\u001eYa7\u0016m9$", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;
    private final VectorizedDecayAnimationSpec<V> animationSpec;
    private final long durationNanos;
    private final V endVelocity;
    private final T initialValue;
    private final V initialValueVector;
    private final V initialVelocityVector;
    private final boolean isInfinite;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;

    public DecayAnimation(VectorizedDecayAnimationSpec<V> vectorizedDecayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t2, V v2) {
        this.animationSpec = vectorizedDecayAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.initialValue = t2;
        V vInvoke = getTypeConverter().getConvertToVector().invoke(t2);
        this.initialValueVector = vInvoke;
        this.initialVelocityVector = (V) AnimationVectorsKt.copy(v2);
        this.targetValue = (T) getTypeConverter().getConvertFromVector().invoke(vectorizedDecayAnimationSpec.getTargetValue(vInvoke, v2));
        this.durationNanos = vectorizedDecayAnimationSpec.getDurationNanos(vInvoke, v2);
        V v3 = (V) AnimationVectorsKt.copy(vectorizedDecayAnimationSpec.getVelocityFromNanos(getDurationNanos(), vInvoke, v2));
        this.endVelocity = v3;
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v4 = this.endVelocity;
            v4.set$animation_core_release(i2, RangesKt.coerceIn(v4.get$animation_core_release(i2), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    public final V getInitialVelocityVector() {
        return this.initialVelocityVector;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.isInfinite;
    }

    public DecayAnimation(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t2, V v2) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t2, v2);
    }

    public DecayAnimation(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t2, T t3) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t2, twoWayConverter.getConvertToVector().invoke(t3));
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j2) {
        if (!isFinishedFromNanos(j2)) {
            return (T) getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j2, this.initialValueVector, this.initialVelocityVector));
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j2) {
        if (!isFinishedFromNanos(j2)) {
            return (V) this.animationSpec.getVelocityFromNanos(j2, this.initialValueVector, this.initialVelocityVector);
        }
        return this.endVelocity;
    }
}
