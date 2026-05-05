package androidx.compose.animation.core;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.XZ2\u000fy\u0005<řc$\u007fّC٥\"}0\u000fWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00157Xģg5SڎK8\u0011zF\u000702h7(\u0005A70] \u0001\tDc\u0012\"2Pppĥ;O\u0015 \u0018\u0006L#\u0019\u001e\u000bkߑ:HzbzT3\rwCf-o2\rMCϿ\u0003)\u001d|g\u001e9CO5C)c\t\rRiE\u001b? Dݾl'53\u0012\u0005eFp\u007fB&[U\u001bo\u000b(r\u0004\u007fsR˃+\u0018iYd&(&\u0010B!\u0005.\u001c\u001c?N>/*fN&a\f\u0013YFO\u0010vj\u007f)zf'3\u001aK7I\u001dvQ\u0018ݢ)PG{K%L>G\u0003qpb\u000fx\u001b+V\bQg҅n?˓R\u0010aƝ\u0006\u0006vk\u00104TGU\u0006G{?5ш$ڛڼ8\"\u074co\nPDu\u0004\u001dbn^w^\u0019O0q.7X\rɔ^Jlʍ\u0004RZf: ۶\u001c]\u000f\u0001\u000e˘<\u000bvD!+/˃S\u0005"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0004@n\u001a7QR;X4)\u0015dp5\u0004j,<\u0002'E\"", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~Gz\u0012=QMDH0,\u0015g=B\u000bk(]z1P:Y,Z(", "@d_2T;&]\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\r7x\u0016*\\+Ej4s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0016}#*\\GEt\u0011\u001a#h`\u0015\u0010g4J\u0006+QU<7\\PH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buE\u000b?p|\u001b\u001a\u0018>4nLc\u0010\u0011f\u0015\u0001A%w.c^y\u001d\u00056", "7mXA\\(EA(z\bm\u0016}\n=e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eFi#=7D<y4-j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0016}#*\\GEt\u0011\u001a#h`\u0015\u0010g4J\u0006+QU<7\\PH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buE\u000b?p|\u001b\u001a\u0018>4nLc\u0010\u0011f\u0015\u0001A%w.c^y\u001d&,h4s\u0013c&&?K,]u\"*h]7\u0006\u0003\u001dorSuwnVv\u0005A2MzkDTyb$p4%K\tMU#", "5dc\u000ea0FO(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001L&;IR?u=z\u0011va8bl0Vr6KVW\u001agRp\u0013", "5dc\u0016a0MW\u0015\u0006hm(\n\u0018\u0019f\u00016{OH\u0004\u001fMt#DE", "u(9", "\u0018", "5dc\u001fX7>O(f\u0005],", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001Z\u00169M?JS>\u001d\u0015>", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "DdRAb9Bh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3y\u001eli5\u0016g6Wd2GJ$", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "1n]CX9MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {
    public static final int $stable = 8;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final RepeatMode repeatMode;

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, repeatMode, j2);
    }

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j2;
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? RepeatMode.Restart : repeatMode, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? StartOffset.m511constructorimpl$default(0, 0, 2, null) : j2, (DefaultConstructorMarker) null);
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m491getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cT\n:Dj\u0011W\u0005\u0006ro^\u0007)ii`iF")
    @InterfaceC1492Gx
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        this(durationBasedAnimationSpec, repeatMode, StartOffset.m511constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedInfiniteRepeatableSpec(this.animation.vectorize((TwoWayConverter) twoWayConverter), this.repeatMode, this.initialStartOffset, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InfiniteRepeatableSpec)) {
            return false;
        }
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
        return Intrinsics.areEqual(infiniteRepeatableSpec.animation, this.animation) && infiniteRepeatableSpec.repeatMode == this.repeatMode && StartOffset.m513equalsimpl0(infiniteRepeatableSpec.initialStartOffset, this.initialStartOffset);
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m516hashCodeimpl(this.initialStartOffset);
    }
}
