package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\":\u0018\u007f\u0007llA0RnP\u008cZS@\u000fsڔ<$q$yCAV Չ\"\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jtWc~u\u0012=6rsM:eok='y~\u001f.::8(\u000e1 8R(x\u0011By\u0017B6N|RT#L3'X\u000b\u0007@\u000f&tg|?xpkHG#1mrR5nH|{\u0011vZ5\u0019\u000fc4*nD{\u001au_\u0011\bj[m\u0005\u0016у\u0010ݾl'/Ǣ\u001a\u007fe9p\u007fB\u0019\u0002̀_ǁv&dӤ\"l\u001a,CO\u0012O'ʮzÞ~{\u0015ɝǲ\u0012\u0016"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w<FKs1'\u0011lh'\u000bx,,y'ERN92", "", "u(E", "\u000fB2\u0012C\u001b\u001a0\u007f^tK\fhx\u000fSn\bZ:o\u0001\u0011#M|,R\f/Ga\u0015\u0017g\u0003\n<'%", "", " NC\u000eG\f\u001dMlIt=\f^u\u000fEm\"Y'jt|9S{\u001c", "", " NC\u000eG\f\u001dMlIt=\f^u\u000fEm\"Y*p\u007f\u0006'\\\b\u001a]\u000f\u0013?o\u0004%M", "5dc\u000eV*>^(zwe,j\rDe", "Ahi2", "7r8:T.>0\u001d\u0001Zg6\r\u000b2", "", "3mR<W,=7!z|^", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "@db6m,(^(\u0003\u0005g:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjG\\", "EhSA[", "6dX4[;", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ThumbnailSizeChecker {
    public static final float ACCEPTABLE_REQUESTED_TO_ACTUAL_SIZE_RATIO = 1.3333334f;
    public static final ThumbnailSizeChecker INSTANCE = new ThumbnailSizeChecker();
    private static final int ROTATED_90_DEGREES_CLOCKWISE = 90;
    private static final int ROTATED_90_DEGREES_COUNTER_CLOCKWISE = 270;

    private ThumbnailSizeChecker() {
    }

    @JvmStatic
    public static final int getAcceptableSize(int i2) {
        return (int) (i2 * 1.3333334f);
    }

    @JvmStatic
    public static final boolean isImageBigEnough(int i2, int i3, ResizeOptions resizeOptions) {
        if (resizeOptions == null) {
            if (getAcceptableSize(i2) >= 2048.0f && getAcceptableSize(i3) >= 2048) {
                return true;
            }
        } else if (getAcceptableSize(i2) >= resizeOptions.width && getAcceptableSize(i3) >= resizeOptions.height) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean isImageBigEnough(EncodedImage encodedImage, ResizeOptions resizeOptions) {
        if (encodedImage == null) {
            return false;
        }
        int rotationAngle = encodedImage.getRotationAngle();
        return (rotationAngle == 90 || rotationAngle == 270) ? isImageBigEnough(encodedImage.getHeight(), encodedImage.getWidth(), resizeOptions) : isImageBigEnough(encodedImage.getWidth(), encodedImage.getHeight(), resizeOptions);
    }
}
