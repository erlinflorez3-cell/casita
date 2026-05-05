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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&˛\bDZc|İI\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fs{:-c$\u007fLC٥\"}0ޛWNmgvJp\u000bKƤ\u000e\u0016\u000fj4կ]xs\u0012\u0017˰HtU\u074cuqCʠnsf\u000b0428@\u0004/\u001ajm\u0016\f\u000bGY\r*0nrJ\\\u001bP\u001d \"\bN 7Ȧ\u000bk^<Nlk?G#1oŌR'm7=z\u001dJb(%v\u0010 ;JE8-+c\u0005\u0017R\u0012Ϊ1C\u0002C\u000bh5,CI\"]F^\u0006\u0014#3g\r\f{͉`\u0005_jT89c{K~#X}\t\u0012%>\u001a\r4>\u000fͪ-bl\u0016&Kt!U\u0007dJ\tP\u0019\u0013gF\u00195\u007fyFg5\u0007Wg:'i_{3)N3\u000f\f9gd\u0010p\u0015QƘ\bSAQ\u0007XvlPm\u000e\u0003\u0012sz\b:\u0006@G6\u07fc*\u0015ѧ\u001b+?كQ%'v\u0010T\u0015~\u0005\rxh\u0002r˦Gؗ·m\u0015֖.\u0011\u0014ZRs\u001dmVaf:a\\*U\u001f}6\u0015ء`}Dƙ=\u0012T_vz;\\k\u000f=/\u0015=֍rq\u0016ãQ`9G_v߇a[~\u0017Eל~3WnBY+ɀ`G"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\r7x\u0016*\\?8r4\f h_\u000f", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "7sT?T;B]\"\r", "", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~Gz\u0012=QMDH0,\u0015g=B\u000bk(]z1P:Y,Z(", "@d_2T;&]\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\r7x\u0016*\\+Ej4s", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001L&;IR?u=z\u0011va8bl0Vr6KVW\u001agRp\u0013z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013}Dl\t\b%\u0012?s:@`\u001dGC\u0002uL)dUAixG\u0017\tS", "7mXA\\(EA(z\bm\u0016}\n=e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eFi#=7D<y4-j", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001L&;IR?u=z\u0011va8bl0Vr6KVW\u001agRp\u0013z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013}Dl\t\b%\u0012?s:@`\u001dGC\u0002uL)dUAixG\u0017*I0n\u001bf!e\u0004?5\u001c;\u001d$wP;\u0013wZZQRzcwN(XB-L|hVC~_I\\#,Q{\u0005guI", "5dc\u000ea0FO(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001L&;IR?u=z\u0011va8bl0Vr6KVW\u001agRp\u0013", "5dc\u0016a0MW\u0015\u0006hm(\n\u0018\u0019f\u00016{OH\u0004\u001fMt#DE", "u(9", "\u0018", "5dc\u0016g,KO(\u0003\u0005g:", "u(8", "5dc\u001fX7>O(f\u0005],", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001Z\u00169M?JS>\u001d\u0015>", "3pd._:", "", "=sW2e", "", "6`b566=S", "DdRAb9Bh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3~\u0019qeH\u0007?5R~#VPX5J]r;i", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "1n]CX9MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final int iterations;
    private final RepeatMode repeatMode;

    public /* synthetic */ RepeatableSpec(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, durationBasedAnimationSpec, repeatMode, j2);
    }

    private RepeatableSpec(int i2, DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.iterations = i2;
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j2;
    }

    public final int getIterations() {
        return this.iterations;
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    public /* synthetic */ RepeatableSpec(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, durationBasedAnimationSpec, (i3 + 4) - (4 | i3) != 0 ? RepeatMode.Restart : repeatMode, (-1) - (((-1) - i3) | ((-1) - 8)) != 0 ? StartOffset.m511constructorimpl$default(0, 0, 2, null) : j2, (DefaultConstructorMarker) null);
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m506getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public /* synthetic */ RepeatableSpec(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, durationBasedAnimationSpec, (i3 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cT\n:Dj\u0011W\u0005\u0006ro^\u0007)ii`iF")
    @InterfaceC1492Gx
    public /* synthetic */ RepeatableSpec(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i2, durationBasedAnimationSpec, repeatMode, StartOffset.m511constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedRepeatableSpec(this.iterations, this.animation.vectorize((TwoWayConverter) twoWayConverter), this.repeatMode, this.initialStartOffset, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RepeatableSpec)) {
            return false;
        }
        RepeatableSpec repeatableSpec = (RepeatableSpec) obj;
        return repeatableSpec.iterations == this.iterations && Intrinsics.areEqual(repeatableSpec.animation, this.animation) && repeatableSpec.repeatMode == this.repeatMode && StartOffset.m513equalsimpl0(repeatableSpec.initialStartOffset, this.initialStartOffset);
    }

    public int hashCode() {
        return (((((this.iterations * 31) + this.animation.hashCode()) * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m516hashCodeimpl(this.initialStartOffset);
    }
}
