package androidx.compose.animation.core;

import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
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
/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007ljA0ZeP.XZ2\u000fy\u0005<řc$\u007fّCU }*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4կ[}s܈74HģM2}uM;pt|\u0004N2bc\n\u000b\u0007\u001a8I(v)E[\u0012\u00180NsRR;Q\u0015 \u0018\u0006L%\u0019\u001e\u000bk^<Nlk@G#1pŌR'm8E^\u001bVl';\b\u0012$9RO7+$\u0002\u0016Mҏ[\b\tM\u0006U\u0005\u0017+m?\u0012\u001eeKp\u0006$\u0017;OSt!<|\u000bW_\u001a>SO\u0012c\u0001\u001e6\u0011\u0013\b\u001d>\u0014\u000e<ΩX0=\u001a-\u001f<M;\u0007$O^\u0007vB.~ˋ:\u001d-ĮK-?$t[2J'QO{3\u0011̷'\u0007vďsV\u0014k#%%\u0007_7i@kOݳ\u000e_EЧ\u001crh\u000e8\u0011\u0001^\u000e0\u0014\u0011\\\u0019ğ6ك߶\" Ƞ\u0006PLg\u0005\u0014xjYw`Rؚ\"w\u001e:0À(\tCl\u0005qoԢ\\G"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dkq7QK7z8(\u001eVl9\u00059", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~Gz\u0012=QMDH0,\u0015g=B\u000bk(]z1P:Y,Z(", ";nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk}8LC\u0011", "2ta.g0H\\\u0001\u0003\u0002e0\u000b", "", "2d[.l\u0014BZ \u0003\t", "3`b6a.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", "uH8\u0016?(GR&\t~]?F\u00079m\u000b2\n@J\u0013 Kw\nKz/>#{*Dm_\u000eIQ?t6s{nkH\u000eg5\u0018{8O\u0016R5kR\u007fF\u0010\u0019$lN,\t\u0015`P\u0002xME.\u0015<G\u0011Euh\b#\u00145wF\u0006G", "5dc\u0011X3:g\u0001\u0003\u0002e0\u000b", "u(8", "5dc\u0011h9:b\u001d\t\u0004F0\u0004\u00103s", "5dc\u0012T:B\\\u001b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001M\u0012<QL=A", "5dc\u001ab+>\u001b`Ri&\u0014\tW", "\u0017", "3pd._:", "", "=sW2e", "", "6`b566=S", "DdRAb9Bh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3|%u]H\u000bm5+r5GK*5`ZnL\u0018\u001cc{Y+\u000bZ", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "1n]CX9MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ArcAnimationSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delayMillis;
    private final int durationMillis;
    private final Easing easing;
    private final int mode;

    public /* synthetic */ ArcAnimationSpec(int i2, int i3, int i4, Easing easing, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, easing);
    }

    private ArcAnimationSpec(int i2, int i3, int i4, Easing easing) {
        this.mode = i2;
        this.durationMillis = i3;
        this.delayMillis = i4;
        this.easing = easing;
    }

    public /* synthetic */ ArcAnimationSpec(int i2, int i3, int i4, Easing easing, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 + 1) - (1 | i5) != 0 ? ArcMode.Companion.m488getArcBelow9TMq4() : i2, (2 & i5) != 0 ? 300 : i3, (i5 + 4) - (4 | i5) != 0 ? 0 : i4, (i5 & 8) != 0 ? EasingKt.getFastOutSlowInEasing() : easing, null);
    }

    /* JADX INFO: renamed from: getMode--9T-Mq4, reason: not valid java name */
    public final int m479getMode9TMq4() {
        return this.mode;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedKeyframesSpec(IntListKt.intListOf(0, this.durationMillis), IntObjectMapKt.emptyIntObjectMap(), this.durationMillis, this.delayMillis, this.easing, this.mode, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcAnimationSpec)) {
            return false;
        }
        ArcAnimationSpec arcAnimationSpec = (ArcAnimationSpec) obj;
        if (ArcMode.m483equalsimpl0(this.mode, arcAnimationSpec.mode) && this.durationMillis == arcAnimationSpec.durationMillis && this.delayMillis == arcAnimationSpec.delayMillis) {
            return Intrinsics.areEqual(this.easing, arcAnimationSpec.easing);
        }
        return false;
    }

    public int hashCode() {
        return (((((ArcMode.m484hashCodeimpl(this.mode) * 31) + this.durationMillis) * 31) + this.delayMillis) * 31) + this.easing.hashCode();
    }
}
