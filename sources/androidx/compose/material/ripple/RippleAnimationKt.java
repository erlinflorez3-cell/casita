package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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
/* JADX INFO: compiled from: RippleAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!4i\bDJc|\u0004O\f8\u000b4C\u0007\":\u0017\u007fјnjO0LeN/ZS@\u000fsڔ<$i-yCAV2\u00160\u000egN\u0016m\u001fNh\u0012[\u000f4\u001e?̓ÒHǁޯa\u0014\u0015;PyWW[zU9\u000fz^\u0005N>R<\b\u0012\u0019\u001aXV@z\tJc\f@8\u0007\u0081ŦQ҈̂\t\u001c\u0018\u0015L0!,jɡf6vk4ƀ1ݭ\u0007kJN5_P\t[\u000e^TU\u000fMѰpҋD7=ՖE_\u0011\nj[m\u0005\u0016п\u0010ݾl'/Ǣi\u007fe:p\u007fB\u0017\u0002̀_ǁv&dӤĬ`\u0011/.Uӌg~\r߳{\f"}, d2 = {"\u0010nd;W,=@\u001d\n\u0006e,\\\u001c>r{\u0015w?\u0005'%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0014`S2<5\u001dc&z\nb6\u0006", "", "\u0014`S2B<M2)\fvm0\u0007\u0012", " `S6h:\u001dc&z\nb6\u0006", "5dc\u001f\\7IZ\u0019l\nZ9\fu+d\u00048\n", "", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u001f\\7IZ\u0019l\nZ9\fu+d\u00048\n\b\u0011(+;M\u0013B", "uI\u0018\u0013", "5dc\u001f\\7IZ\u0019^\u0004]\u0019x\b3u\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "0nd;W,=", "", "5dc\u001f\\7IZ\u0019^\u0004]\u0019x\b3u\u000eoy.\u0013 \u001e\\K", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rbzq.", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m6638constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* JADX INFO: renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m1757getRippleStartRadiusuvyYCjk(long j2) {
        return Math.max(Size.m4006getWidthimpl(j2), Size.m4003getHeightimpl(j2)) * 0.3f;
    }

    /* JADX INFO: renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m1756getRippleEndRadiuscSwnlzA(Density density, boolean z2, long j2) {
        float fM3935getDistanceimpl = Offset.m3935getDistanceimpl(OffsetKt.Offset(Size.m4006getWidthimpl(j2), Size.m4003getHeightimpl(j2))) / 2.0f;
        return z2 ? fM3935getDistanceimpl + density.mo710toPx0680j_4(BoundedRippleExtraRadius) : fM3935getDistanceimpl;
    }
}
