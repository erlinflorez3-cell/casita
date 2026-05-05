package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: AndroidPathEffect.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!4i\bDJe|\u0004O\u000b8\u000b4B\u0007\":$\u007f\u0007lkA0ZeP.XS2\u000f\u0002{<$a%yCQU\"Ԃ*\teNogtLr!QƤ\u001e\u0016'i\\Mcxu\u0012=1rsM4eok8'ҚN\u0013.4:8(\u00041\u001e8K(v)G\u0012È*FNuRR;L5\u001e \fV /%\rk\\>`l\f>u݊\u001b\u001aPW?_^{}\u0011T^?\r%lN/NCM\u0015SW3\u000b`cW\u0003mum\tv4?+w\u0002\u001e̬ߒ~ϬƦ/Q\u0013l\u00016t\r_q$'Ya\fK~\r@\f\t\u000f%<2\".'v<sԿɊ\u0007Ԅ\u07baxtYU^\u0018vJ\u000e\u0012y6E$(3YKӘfVi>\u001f\u05edS*\u0004ڥ\";"}, d2 = {"/bcBT3\u001cV\u0015\u0003\u0004I(\f\f\u000ff\u0001(yO", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0017n\u0017.KR\u0011", "=tc2e", "7m]2e", "/bcBT3\u001c]&\bzk\u0017x\u00182E\u0001){>\u0010", "@`S6h:", "", "/bcBT3\u001dO'\u0002eZ;\u007fh0f\u007f&\u000b", "7mc2e=:Z'", "", ">gP@X", "/bcBT3,b\u0015\u0007\u0006^+g\u0005>h_)|@~&", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "/ce.a*>", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#hy(Bm\u0015\u0019IR>K5\u001f\u0015fp'\u0016w3NL", "/bcBT3,b\u0015\u0007\u0006^+g\u0005>h_)|@~&^\u0019kl\bU\u000f;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Cv\u000f1\u0007\"g=\u001d\"re8\u001a-*X~2QZNulV<?!\u000ee\u0011R)\u001bND=3q$8 \b*XW", "/r0;W9HW\u0018ivm/\\\n0e}7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004v\u0018Ho\fKL", "Bn0;W9HW\u0018ivm/[\u0005=hj$\u000bC`\u0018\u0018Gm\u001d*\u00069<Y", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004u\u0013Urx8\u0006(\u0015Z~ 5|T\u001c\\WBk\n", "Bn0;W9HW\u0018ivm/[\u0005=hj$\u000bC`\u0018\u0018Gm\u001d*\u00069<YE*#~fA=M", "uH\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nk\u0013&JN\nJy\u00101h\u0001\u007f8n\u0016,\\\u0002)zH%\u0015>", "Bn2<`7Ha\u0019ivm/\\\n0e}7", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidPathEffect_androidKt {
    public static final android.graphics.PathEffect asAndroidPathEffect(PathEffect pathEffect) {
        Intrinsics.checkNotNull(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    public static final PathEffect toComposePathEffect(android.graphics.PathEffect pathEffect) {
        return new AndroidPathEffect(pathEffect);
    }

    public static final PathEffect actualCornerPathEffect(float f2) {
        return new AndroidPathEffect(new CornerPathEffect(f2));
    }

    public static final PathEffect actualDashPathEffect(float[] fArr, float f2) {
        return new AndroidPathEffect(new DashPathEffect(fArr, f2));
    }

    public static final PathEffect actualChainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
        Intrinsics.checkNotNull(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        android.graphics.PathEffect nativePathEffect = ((AndroidPathEffect) pathEffect).getNativePathEffect();
        Intrinsics.checkNotNull(pathEffect2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new AndroidPathEffect(new ComposePathEffect(nativePathEffect, ((AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    /* JADX INFO: renamed from: actualStampedPathEffect-7aD1DOk */
    public static final PathEffect m4074actualStampedPathEffect7aD1DOk(Path path, float f2, float f3, int i2) {
        if (path instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) path).getInternalPath(), f2, f3, m4075toAndroidPathDashPathEffectStyleoQv6xUo(i2)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo */
    public static final PathDashPathEffect.Style m4075toAndroidPathDashPathEffectStyleoQv6xUo(int i2) {
        return StampedPathEffectStyle.m4517equalsimpl0(i2, StampedPathEffectStyle.Companion.m4521getMorphYpspkwk()) ? PathDashPathEffect.Style.MORPH : StampedPathEffectStyle.m4517equalsimpl0(i2, StampedPathEffectStyle.Companion.m4522getRotateYpspkwk()) ? PathDashPathEffect.Style.ROTATE : StampedPathEffectStyle.m4517equalsimpl0(i2, StampedPathEffectStyle.Companion.m4523getTranslateYpspkwk()) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }
}
