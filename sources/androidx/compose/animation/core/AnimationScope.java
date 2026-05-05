package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>é6B\u0005\"4\u0012\u000e\u0007nj?0LeV5ZS0\u0010s{B-cҕyCQU\"}0\tWNm\tvJp\u000bKƤ\f\u001b\u000f̓TK[ތk\u001178HnM3uok:\u0011td\u0007`\n(\u0600\n\t\u000f\u001dBHF͌\u000bSY\u0010*<PrJRC˟\u0015\u001c\"\u0006t\u001f/#lk\\<`l\u00149?'\u0011pZNUg@\u0001[\u0016^T]˙\u0007e,5X7c\u001d5W\u0011\u0012j[m\u000fO{K\u0012\u0001-7-Ys\u0006E\u0007\u000eЏ\u0019+]\u001d&v4\u000e\u001dQ\u000f\u001bo;]\u0016c\\\u001e*\bz2ȞL\u0006\u001e\u0006]G\\`j\u000b\u0016 Kt![pT\u0010oZ\u007f)il[c>\nچEӸj]iݢ1P=\u000f\u0013!>%\u0007\u0004/q%7n 3T&]aUNN`N8es2B/9̪Þ\u0004ΥK\u00107}\u0017H%@O]?./\u0003\"JJ\u007f\u0005\u001e1\rapjHn*\u001f\u001aE;!\f\tL\u001bI*\u000f+З8ҭQ(\\͵\u0016\n\u0019<j\f\\#+-\\e9{xZu\u001051v7\b}\u001a\u001c.ޭ`ۋ9Qk߄2a\u0005\u001eW<\u0011\rֽjH[ێr^.@@\\;!\u0006\u0005\\NBƎ\u0558Cy$4:R1^\u001bg\u0011>\u0013\\\u000b\rwfx\u0012\u000fTiɴ\u0013k4t?\u007f~aʼsm\u0001̢D~fD;d\"^'Jm\"\u001fؔ-'\u0015\u0010\f\u007f}х\u0003\f\u000b+l߶ɬ{°\u001a*AS5e!*\u0017+8';eltkw[9w\n\u000b#';\u001f֫\u001eLϡt0xlPyb7r\u001bl\u001e;\b\u001b~*eT\f_c\u000b\n\u001a| Ά\u000fʾ@\\@|\u0013O6'\u0007\u001c0*U/IU+E߹\u0018c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "", "7mXA\\(ED\u0015\u0006\u000b^", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d e}7\u0006M", ":`bA99:[\u0019m~f,e\u00058o\u000e", "", "B`a4X;/O \u000fz", "AsP?g\u001bB[\u0019gvg6\u000b", "7rABa5B\\\u001b", "", "=m2.a*>Z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018e9Q>J@:\\{N\u0014\u001fi\u000e[\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\n>nx>e\u0014Q\u0003^sK6h\u00105h}O=Tf4m|_\u001bkDGyxX\u001e\u0017yLw\u0011w\\\u0013<<vlgE(P\u001d\u0019%seULs^\u0006y8'\u0015|\b\u001b0gx5};M\u0015:?b\u0014Oq!\t4<\u0006", "\nrTA \u0006\u0017", "4h]6f/>R\b\u0003\u0003^\u0015x\u00129s", "5dc\u0013\\5Ba\u001c~yM0\u0005\t\u0018a\t2\n", "u(9", "Adc\u0013\\5Ba\u001c~yM0\u0005\t\u0018a\t2\n~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "uI\u0018#", "u(I", "Adc\u001fh5GW\"\u00019Z5\u0001\u0011+t\u00042\u0005:~!$Gi\u001b<}%1g}", "uY\u0018#", "7rABa5B\\\u001b=y^3|\u000b+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u0019T:M4&z\u0003^\u001b\u0001\u0011/N{1\u0006N", "Adc\u0019T:M4&z\u0003^\u001b\u0001\u0011/N{1\u0006N?\u0013 Kw\nKz/>S{*Dm\u0010;MJ;gB\u001e", "5dc g(Kb\b\u0003\u0003^\u0015x\u00129s", "5dc!T9@S(ove<|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc!l7>1#\b\f^9\f\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\(8??OI>'&hnH\u0007p\u0002", "D`[BX", "5dc#T3NS", "Adc#T3NSWz\u0004b4x\u00183o\t\"yJ\u000e\u0017\u0011To\u0015<r35", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "D`[BXj=S ~|Z;|", "Dd[<V0Mg", "5dc#X3HQ\u001d\u000e\u000f", "Dd[<V0Mg\n~xm6\n", "5dc#X3HQ\u001d\u000e\u000fO,z\u00189r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u0002", "Adc#X3HQ\u001d\u000e\u000fO,z\u00189r>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149o?", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "1`]0X3\u001a\\\u001d\u0007vm0\u0007\u0012", "Bn0;\\4:b\u001d\t\u0004L;x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"-\u0011wa\u000f", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationScope<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private long finishedTimeNanos = Long.MIN_VALUE;
    private final MutableState isRunning$delegate;
    private long lastFrameTimeNanos;
    private final Function0<Unit> onCancel;
    private final long startTimeNanos;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    public AnimationScope(T t2, TwoWayConverter<T, V> twoWayConverter, V v2, long j2, T t3, long j3, boolean z2, Function0<Unit> function0) {
        this.typeConverter = twoWayConverter;
        this.targetValue = t3;
        this.startTimeNanos = j3;
        this.onCancel = function0;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
        this.velocityVector = (V) AnimationVectorsKt.copy(v2);
        this.lastFrameTimeNanos = j2;
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getTargetValue() {
        return this.targetValue;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T getValue() {
        return this.value$delegate.getValue();
    }

    public final void setValue$animation_core_release(T t2) {
        this.value$delegate.setValue(t2);
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final void setVelocityVector$animation_core_release(V v2) {
        this.velocityVector = v2;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j2) {
        this.lastFrameTimeNanos = j2;
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j2) {
        this.finishedTimeNanos = j2;
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setRunning$animation_core_release(boolean z2) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z2));
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.onCancel.invoke();
    }

    public final AnimationState<T, V> toAnimationState() {
        return new AnimationState<>(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
    }
}
