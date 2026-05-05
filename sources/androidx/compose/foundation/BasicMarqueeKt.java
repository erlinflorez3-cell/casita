package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\f6B\u0015\"4\u0012\u0006\fnʑA0RkP.XV2\u000f\u0002{<$a%yCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0018\u0011\u0001:կmx\f\u0011?6PoW3{p\u00818śҽ:\u0007&40;\u0012K\u000f\u001eBN x\u000bCy\u0012@5ptHY%M3\"B\nL)\u0019\u001e\u000bm~:Vvu:]+3mPY?_^\u0005}\u0011T`?\r%bN/NDM\u0015SaI\u0007ӱZΪƄCsC\u0014v7?OW\u0005o<h\u0002$\u0015YU;o#*j\u0011i`:-[SqTh\u000eV}+\u007f\u001bG\u001c\u000e4/\u000f.Ejt\u001b&3#\u0007{@~\u0016\u000fH\u0006zo=/%.;[?!f_vS\u0019|M,\u000b\u0013\u001e1\u0018\u0007!\n\\>f\u001b\u001bb\u0002i1\u007fHmNT\ng=\u0006\u0004\u001fa20\n0U\fG{?/]*ܔZݽ؝%m\b`R\u0001ϻ\u0005epVoʏdn!ë\u001aQ"}, d2 = {"\u001b`a>h,>A$zxb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\r1f\n07m\u00049IA?t6s", "AoP0\\5@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u001b`a>h,>A$zxb5~Py6Rr\u0001:O", "uE\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#e\u001cDy&.M1Fg2\"\u001ej7", "1qT.g,&O&\u000b\u000b^,X\u00123m{7\u007fJ\n\u0005\"Gm", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "7sT?T;B]\"\r", "", "B`a4X;/O \u000fz", "7mXA\\(E2\u0019\u0006vr\u0014\u0001\u00106i\u000e", "2d[.l\u0014BZ \u0003\t", "Dd[<V0Mg", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1qT.g,&O&\u000b\u000b^,X\u00123m{7\u007fJ\n\u0005\"GmU1E\b#9n\f", "uH5\u0016<\r%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWL\u007f)D#\\ @{\u001a=a\u0019~R0'\u0014uk=\u0006vuL\u0001/RV\\,&N{A\u001c\u000ei\u0012X4V\u0003cN$8 @#\u0010(X\u0006Eqn\u0017\u0016\f\u000b", "Dd[<V0Mguz\t^+k\u001b/e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIm\u00167;N;i\n", "0`b6V\u0014:`%\u000fz^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "/mX:T;B]\"f\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\r1f\n07mq7QK7z8(\u001ePk8\u00079", "@d_2T;\u001dS z\u000fF0\u0004\u00103s", "0`b6V\u0014:`%\u000fz^sHp41g\u000f\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b=a\u0004\u001bT\u00127LPEo31^fkA\u0012m:N@(Q\\W+XavG\u001d[B\n[7\u001d\u0005Y//jB;(\n\u0002*E\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#G\u0004FEFf*qa", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BasicMarqueeKt {
    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw$default */
    public static /* synthetic */ Modifier m579basicMarquee1Mj1MLw$default(Modifier modifier, int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i2 = MarqueeDefaults.INSTANCE.getIterations();
        }
        if ((2 & i6) != 0) {
            i3 = MarqueeAnimationMode.Companion.m651getImmediatelyZbEOnfQ();
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            i4 = MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
        }
        if ((i6 + 8) - (8 | i6) != 0) {
            i5 = MarqueeAnimationMode.m647equalsimpl0(i3, MarqueeAnimationMode.Companion.m651getImmediatelyZbEOnfQ()) ? i4 : 0;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16)) != 0) {
            marqueeSpacing = MarqueeDefaults.INSTANCE.getSpacing();
        }
        if ((i6 + 32) - (i6 | 32) != 0) {
            f2 = MarqueeDefaults.INSTANCE.m653getVelocityD9Ej5fM();
        }
        return m578basicMarquee1Mj1MLw(modifier, i2, i3, i4, i5, marqueeSpacing, f2);
    }

    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw */
    public static final Modifier m578basicMarquee1Mj1MLw(Modifier modifier, int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        return modifier.then(new MarqueeModifierElement(i2, i3, i4, i5, marqueeSpacing, f2, null));
    }

    /* JADX INFO: renamed from: createMarqueeAnimationSpec-Z4HSEVQ */
    public static final AnimationSpec<Float> m580createMarqueeAnimationSpecZ4HSEVQ(int i2, float f2, int i3, int i4, float f3, Density density) {
        TweenSpec<Float> tweenSpecVelocityBasedTween = velocityBasedTween(Math.abs(density.mo710toPx0680j_4(f3)), f2, i4);
        long jM511constructorimpl$default = StartOffset.m511constructorimpl$default((-i4) + i3, 0, 2, null);
        return i2 == Integer.MAX_VALUE ? AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(tweenSpecVelocityBasedTween, null, jM511constructorimpl$default, 2, null) : AnimationSpecKt.m478repeatable91I0pcU$default(i2, tweenSpecVelocityBasedTween, null, jM511constructorimpl$default, 4, null);
    }

    private static final TweenSpec<Float> velocityBasedTween(float f2, float f3, int i2) {
        return AnimationSpecKt.tween((int) Math.ceil(f3 / (f2 / 1000.0f)), i2, EasingKt.getLinearEasing());
    }

    /* JADX INFO: renamed from: MarqueeSpacing-0680j_4 */
    public static final MarqueeSpacing m576MarqueeSpacing0680j_4(final float f2) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.BasicMarqueeKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(Density density, int i2, int i3) {
                return BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$1(f2, density, i2, i3);
            }
        };
    }

    public static final int MarqueeSpacing_0680j_4$lambda$1(float f2, Density density, int i2, int i3) {
        return density.mo704roundToPx0680j_4(f2);
    }
}
