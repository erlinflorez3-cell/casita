package com.braze.ui.support;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bDJc|\u0004W\u00068é6B\r'4\u0012}\u0007njG7L͜P.`\\2\u000fq\u007fLHi%\nCiWJ\u00020\fgN\u0016k\u001fNh\u0010[\u000f4\u001a)n:Omx\f\u0019?6PwW3{xU]n~N\u0005N4R<\b\u0010\u0019\u001aXL@z\tOc\f@4ptHX%M3!B\nL(\u0019\u001e\u000bpfRVyu:]%3mP\\?_^~}\u0011TZ?\r%hN/N?M\u0015S\\#\u0013`¹W\u0003mp\u0014ݞjҊ++Q֕wBf\u007f,\u0015YNcơt͉`\u0005YӠИ+:"}, d2 = {"/bR2_,KO(~^g;|\u0016:o\u0007$\u000bJ\u000e", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `+x\u001d<\u00040?`y/Azk", "2dR2_,KO(~^g;|\u0016:o\u0007$\u000bJ\u000e", "1qT.g,!]&\u0003\u0010h5\f\u00056A\t,\u0004<\u0010\u001b!P", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007u", "4q^:K", "", "BnG", "2ta.g0H\\", "", "/bR2_,KO(~", "", "1qT.g,/S&\u000e~\\(\u0004d8i\b$\u000bD\u000b ", "4q^:L", "BnH", "Adc\u000ea0FO(\u0003\u0005g\u0017x\u0016+m\u000e", "/mX:T;B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationUtils {
    private static final Interpolator accelerateInterpolator = new AccelerateInterpolator();
    private static final Interpolator decelerateInterpolator = new DecelerateInterpolator();

    public static final Animation createHorizontalAnimation(float f2, float f3, long j2, boolean z2) {
        return setAnimationParams(new TranslateAnimation(1, f2, 1, f3, 2, 0.0f, 2, 0.0f), j2, z2);
    }

    public static final Animation createVerticalAnimation(float f2, float f3, long j2, boolean z2) {
        return setAnimationParams(new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, f2, 1, f3), j2, z2);
    }

    public static final Animation setAnimationParams(Animation animation, long j2, boolean z2) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        animation.setDuration(j2);
        if (z2) {
            animation.setInterpolator(accelerateInterpolator);
        } else {
            animation.setInterpolator(decelerateInterpolator);
        }
        return animation;
    }
}
