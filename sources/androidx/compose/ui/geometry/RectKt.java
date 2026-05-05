package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
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
/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000e6B\u0015\"4\u0012}\bnjG5LeN3js8ş\u0004{b#\f(\u007fCSUH~R\r]P\u007fg\u001dK!\u0010ĵ\u000eإȀ|l2Lc|u2\u001d˰Zom2}sK>xtd\u0006P60>\u0012\u0005/!pMȮuٙŲO\u000e\u00188NtRr\u001b˟\u001d\u001a@\u0005n$\u000f'tg|7xpkDG#1t\tSф^ܞƊQ\u000fL`5\u001a\u000f\u007f,9X7c\u0014UW\u0011\u0016j[m\u0002ouK\u0015\u0001'U*yweGp\u007fB qT\u0558]w._\u000bŋ|:&ˬSu"}, d2 = {" dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "Bn_\u0019X-M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "0ncAb4+W\u001b\u0002\n", " dRA v:'\r\fKh", "uI9u?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011q\u000eF~%Df\u0012i$m\u0014=#", "=eU@X;", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", " dRA ;S%j\u0004fp", "1d]AX9", "@`S6h:", "", " dRA y&[\u0019fKd", "uI5u?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011q\u000eF~%Df\u0012i$m\u0014=#", ":da=", "AsP?g", "As^=", "4qP0g0H\\", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RectKt {
    /* JADX INFO: renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m3977Recttz77jQw(long j2, long j3) {
        return new Rect(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), Offset.m3937getXimpl(j2) + Size.m4006getWidthimpl(j3), Offset.m3938getYimpl(j2) + Size.m4003getHeightimpl(j3));
    }

    /* JADX INFO: renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m3975Rect0a9Yr6o(long j2, long j3) {
        return new Rect(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3));
    }

    /* JADX INFO: renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m3976Rect3MmeM6k(long j2, float f2) {
        return new Rect(Offset.m3937getXimpl(j2) - f2, Offset.m3938getYimpl(j2) - f2, Offset.m3937getXimpl(j2) + f2, Offset.m3938getYimpl(j2) + f2);
    }

    public static final Rect lerp(Rect rect, Rect rect2, float f2) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f2), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f2), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f2), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f2));
    }
}
