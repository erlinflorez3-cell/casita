package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.TransformOrigin;
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
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u000b8é6B\u0015\"4ߚ\u007f\u0007|jA0JsP.`\\2\u000fq{<$i*yّCU(\n*ޛUȠm}ñzZ9BO'&|x,aU'^\"\u0013@D\b?aP\u007fGGd\r<\u0015\"B\"fz3\u0006ʀ.H\u001e|CJY\u001a*0nq\u0001Ŭ\u000e\u0016\u0019(!\u001e>N\u0004dָh¦5GɆ\\Žǥ'\u0005oR\\3(=\u000b^%Ld)\u001dv\u0010\u001fYE}\u0094\u0016m\t\u0011\u0019j[mšowC\u0005v'?+wt\b<^\u007f\"\u0017CO;`#2b\u0005_d$-;QsK~\u000fV|AՏ\f˖\u0003\u05faΝ+J4@(zP\u001fA\n\u000bSnf2dP\u0017\u0013cL\u0016S~yۖ:cm_yS\u0019|PB̳\ff*\u000f\t9[\u0003)'۔\u001a%\r_5iFMJ^\n\b>\u001c\tͲf\b2ʶHI\u00066\n\u0019~&37s9Q\"Ƞ\u0006NLϙ\u000f\u0007fqas#_N$\u0007\u0016e-ė\u000bɮמc\u0004\u07fbT\\`,\u001fZ4V\r\t\u0016\u001f\u0601\\\u0001D$+ōj}gqjS|ܬ)K"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d#1`}u", "", "AbP9X", "", "BqP;f-H`!h\bb.\u0001\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "uE9\u0019T5=`#\u0003yquz\u00137p\n6{\n| \u001bOk\u001d@\u0001.~W\b-77v2VGJk\u0010'\u0019p]H\u000bm5<\u0002'E\"52fayA\u001d[_\u001fVt\u0011\u000ehA1w@>hf,J}Ko\u0010i \u0017Cy}RT\u001fQ\u0007|qN/hS/#j", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d", "5dc V(ES", "u(5", "5dc!e(Ga\u001a\t\bf\u0016\n\r1i\toiUe\u0017bC[", "u(9", "\u0018", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(KBLAa\tzak", "1n\\=b5>\\(L", "1n_F", "1n_F )G<\u0018\\Id", "uE9\u0019T5=`#\u0003yquz\u00137p\n6{\n| \u001bOk\u001d@\u0001.~W\b-77v2VGJk\u0010'\u0019p]H\u000bm5<\u0002'E\"\u0012\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000e3(\f4E\u0011?r\nU\u0004\f1qp\u0018", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Scale {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<Float> animationSpec;
    private final float scale;
    private final long transformOrigin;

    public /* synthetic */ Scale(float f2, long j2, FiniteAnimationSpec finiteAnimationSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, j2, finiteAnimationSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-bnNdC4k$default */
    public static /* synthetic */ Scale m436copybnNdC4k$default(Scale scale, float f2, long j2, FiniteAnimationSpec finiteAnimationSpec, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = scale.scale;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = scale.transformOrigin;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            finiteAnimationSpec = scale.animationSpec;
        }
        return scale.m438copybnNdC4k(f2, j2, finiteAnimationSpec);
    }

    public final float component1() {
        return this.scale;
    }

    /* JADX INFO: renamed from: component2-SzJe1aQ */
    public final long m437component2SzJe1aQ() {
        return this.transformOrigin;
    }

    public final FiniteAnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: copy-bnNdC4k */
    public final Scale m438copybnNdC4k(float f2, long j2, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new Scale(f2, j2, finiteAnimationSpec, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.scale, scale.scale) == 0 && TransformOrigin.m4563equalsimpl0(this.transformOrigin, scale.transformOrigin) && Intrinsics.areEqual(this.animationSpec, scale.animationSpec);
    }

    public int hashCode() {
        return (((Float.hashCode(this.scale) * 31) + TransformOrigin.m4566hashCodeimpl(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) TransformOrigin.m4567toStringimpl(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }

    private Scale(float f2, long j2, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.scale = f2;
        this.transformOrigin = j2;
        this.animationSpec = finiteAnimationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ */
    public final long m439getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }
}
