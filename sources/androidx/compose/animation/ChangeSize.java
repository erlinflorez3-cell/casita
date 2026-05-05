package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njO0LeN/ZS@\u000fsڔ<$i-yCAd\"}0\u000fWȞog|VbŏIƦ\f,ю\u001b,wT9&\"\u0013@B\b?aN\u007f^?`\u00038\u001d;B3H\t3\u0005ʀ.R\u0016{\u000bIQ\u0012\"2Fv`Y\u001dO\u0015\u001a@\nl#\u0011(jof<Xnm:]'1rRT-_>\u0007e\rt_ܮ\u0011vo*sGEJ-%\u0002\u0004Mҿ\\\b%M\bU x87:wwɱ:b\u0006\u0019%1U\u0013mt,b+Xp\u000e7+}gyST\u0090xC\t\u001bS\u001c\u0014\u0016)X.[\u001e\u0015\u0011Tߞu;ZNh\u001a^p\u000bA˯7_u\u000eLC9IƘ\u0002gA\u0019\\7\u0014\u0005;\u001fS\"t!iV&{%,d\u0007\u007f5ҨDGNS\u001a_Cs\u0014rh\bP\u000b@I\u0010/*\u0015\\\u001aUCa91)\u0004\bXFwv3d\u0017\\\u001aXN@0x.7X\u0014RʵC-\u0016yjlXZ\u001c}\"b\"\u0016\n)\u001f\u000bv\u0003ǰ&XU]\u0005\u0002j{zPʯ./>g\r\u0004\u000e\u0006X%ۿ4\"r\u001eajvB@םf\u000b`٨ZU\u0012gj6rGVr(}\fF^\fA6mzʬ829ǉt\u0017N\u0012,R\u0012\f\u0017irh>\nՁ7*\u000bǭ<v\u000f\u0012^nA\u001auzaG\rq2<oUڤ\u001d0['x:\u0003)\u0017\u0001y\u0006mn\\I\\lDy\u0004~°\u001a A֗G?\u0019\"\r=ɮ\u0006M"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006T(1b\u007f %q+.#", "", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "Ahi2", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4t[9F0SS", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "1kX=", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F_gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005d\n\u0010\u001e\nDnzK \u000eQ\u0007\u0015?\"-qJh_UPEM^9h\u0016h\u000bg:8y\t5\n", "5dc\u000e_0@\\!~\u0004m", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d", "5dc\u0010_0I", "u(I", "5dc \\A>", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ChangeSize {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;
    private final Function1<IntSize, IntSize> size;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            alignment = changeSize.alignment;
        }
        if ((2 & i2) != 0) {
            function1 = changeSize.size;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            z2 = changeSize.clip;
        }
        return changeSize.copy(alignment, function1, finiteAnimationSpec, z2);
    }

    public final Alignment component1() {
        return this.alignment;
    }

    public final Function1<IntSize, IntSize> component2() {
        return this.size;
    }

    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.clip;
    }

    public final ChangeSize copy(Alignment alignment, Function1<? super IntSize, IntSize> function1, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z2) {
        return new ChangeSize(alignment, function1, finiteAnimationSpec, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return Intrinsics.areEqual(this.alignment, changeSize.alignment) && Intrinsics.areEqual(this.size, changeSize.size) && Intrinsics.areEqual(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    public int hashCode() {
        return (((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31) + Boolean.hashCode(this.clip);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(Alignment alignment, Function1<? super IntSize, IntSize> function1, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z2) {
        this.alignment = alignment;
        this.size = function1;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z2;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.ChangeSize$1 */
    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJd\u0003İY\u0006^\n^F\r\"D\u0012&\u0006-r˱4FkI<T"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7s", "7me<^,\u0006[.kYc\fG", "uI\u0018\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<IntSize, IntSize> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m6800boximpl(m406invokemzRDjE0(intSize.m6812unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mzRDjE0 */
        public final long m406invokemzRDjE0(long j2) {
            return IntSizeKt.IntSize(0, 0);
        }
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public /* synthetic */ ChangeSize(Alignment alignment, AnonymousClass1 anonymousClass1, FiniteAnimationSpec finiteAnimationSpec, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, (2 & i2) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1, finiteAnimationSpec, (i2 + 8) - (i2 | 8) != 0 ? true : z2);
    }

    public final Function1<IntSize, IntSize> getSize() {
        return this.size;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }
}
