package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0RlP.XS2\u000fy\u0005<$a?yCIa\"Ԃ(\u000eeȞ\u0010itϺh\nk\u0015\f\u0015\u0007jTI\u0004y\u000e\u0018\u001f4Ro\u00062{q}\u0003p\u0005D\b8>2:\n\u00057ɝ:J v1By\u0010\"4NuRRC˟\u0015\"\u0018\u0006L&\u0019 rf\u00055Xrc:=*\u001bipV7e6|[\u0016^TU\u0015\u0007g$+NAM\u0015S^Ϋ\u000bRiKKE\u007fe\u001dhUPq]D{Da\u0018\u0014C3\u007f\u0011k\u007f>\\3Y\u0017Pei&ұWח\u00124\u007f\u07be\u0014\u000fB\u0012\u001c\u0015GJ4=(wX0A~\u000bSn[2bP\r\u0013ad\"c>\nچEӸj]iݢ1P=\u0006\u0013\u001f>%\u0007\u0002/o%2n\u001c3T&YaUNJ`N8as2B/9̪6˙4S\b\u07fc\u0014\u00134,3F{;)7y\u0013\u0019_uy\u001dlxUyR~ؗ2p&7`\b:^ֈh\u000bs¬lZ2([4%0\f!+ \u0013ɼl%3\u001dfO\u001fȉ!\"\u001cX{ÛϘ7֍r{\u0016Y?|ATie\u0016{`\u00124AB~\u0013u7Qa,r\\^ίh\rн\u0014{\u0014FT-!M\u0010\u0016*VD1O[EL\u0011+ZA3\b\u001e\u0019?ɴ\u000bՁ72\u000bi2\u001c!\u0003V\u007f~\u0014\bzOQ\u000b\u0007Ğ1k"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"-\u0011wa\u000f", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "7mXA\\(ED\u0015\u0006\u000b^", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d e}7\u0006M", ":`bA99:[\u0019m~f,e\u00058o\u000e", "", "4h]6f/>R\b\u0003\u0003^\u0015x\u00129s", "7rABa5B\\\u001b", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&\u007f  IW\u0019u=/\u0015up9\u00149\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\n>nx>e\u0014Q\u0003^sK6h\u00105h}O=Tf4m|_\u001bkDGyxV\u000e^Y", "\nrTA \u0006\u0017", "5dc\u0013\\5Ba\u001c~yM0\u0005\t\u0018a\t2\n", "u(9", "Adc\u0013\\5Ba\u001c~yM0\u0005\t\u0018a\t2\n~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "uI\u0018#", "u(I", "Adc\u001fh5GW\"\u00019Z5\u0001\u0011+t\u00042\u0005:~!$Gi\u001b<}%1g}", "uY\u0018#", "5dc\u0019T:M4&z\u0003^\u001b\u0001\u0011/N{1\u0006N", "Adc\u0019T:M4&z\u0003^\u001b\u0001\u0011/N{1\u0006N?\u0013 Kw\nKz/>S{*Dm\u0010;MJ;gB\u001e", "5dc!l7>1#\b\f^9\f\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\(8??OI>'&hnH\u0007p\u0002", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc#T3NSWz\u0004b4x\u00183o\t\"yJ\u000e\u0017\u0011To\u0015<r35", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "D`[BXj=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "Dd[<V0Mg", "5dc#X3HQ\u001d\u000e\u000f", "Dd[<V0Mg\n~xm6\n", "5dc#X3HQ\u001d\u000e\u000fO,z\u00189r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u0002", "Adc#X3HQ\u001d\u000e\u000fO,z\u00189r>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149o?", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "BnBAe0GU", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    public static final int $stable = 0;
    private long finishedTimeNanos;
    private boolean isRunning;
    private long lastFrameTimeNanos;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    public AnimationState(TwoWayConverter<T, V> twoWayConverter, T t2, V v2, long j2, long j3, boolean z2) {
        V v3;
        this.typeConverter = twoWayConverter;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
        this.velocityVector = (v2 == null || (v3 = (V) AnimationVectorsKt.copy(v2)) == null) ? (V) AnimationStateKt.createZeroVectorFrom(twoWayConverter, t2) : v3;
        this.lastFrameTimeNanos = j2;
        this.finishedTimeNanos = j3;
        this.isRunning = z2;
    }

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(twoWayConverter, obj, (i2 & 4) != 0 ? null : animationVector, (i2 & 8) != 0 ? Long.MIN_VALUE : j2, (i2 + 16) - (i2 | 16) == 0 ? j3 : Long.MIN_VALUE, (i2 + 32) - (i2 | 32) != 0 ? false : z2);
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value$delegate.getValue();
    }

    public void setValue$animation_core_release(T t2) {
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
        return this.isRunning;
    }

    public final void setRunning$animation_core_release(boolean z2) {
        this.isRunning = z2;
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }
}
