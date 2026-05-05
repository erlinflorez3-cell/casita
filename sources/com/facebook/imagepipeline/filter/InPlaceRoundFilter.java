package com.facebook.imagepipeline.filter;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјl˘9FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006w)<h}-\u0001Q\u001f\u0019T?9k!(%q`\u001a\u000bj;N\u0004|", "", "u(E", "@nd;W\tBb!z\u0006B5g\u0010+c\u007f", "", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InPlaceRoundFilter {
    public static final InPlaceRoundFilter INSTANCE = new InPlaceRoundFilter();

    private InPlaceRoundFilter() {
    }

    @JvmStatic
    public static final void roundBitmapInPlace(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(width, height) / 2;
        int i2 = width / 2;
        int i3 = height / 2;
        if (iMin == 0) {
            return;
        }
        Preconditions.checkArgument(Boolean.valueOf(iMin >= 1));
        Preconditions.checkArgument(Boolean.valueOf(width > 0 && ((float) width) <= 2048.0f));
        Preconditions.checkArgument(Boolean.valueOf(height > 0 && ((float) height) <= 2048.0f));
        Preconditions.checkArgument(Boolean.valueOf(i2 > 0 && i2 < width));
        Preconditions.checkArgument(Boolean.valueOf(i3 > 0 && i3 < height));
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i4 = iMin - 1;
        Preconditions.checkArgument(Boolean.valueOf(i2 - i4 >= 0 && i3 - i4 >= 0 && i2 + i4 < width && i3 + i4 < height));
        int i5 = (-iMin) * 2;
        int[] iArr2 = new int[width];
        int i6 = i5 + 1;
        int i7 = 0;
        int i8 = 1;
        int i9 = 1;
        while (i4 >= i7) {
            int i10 = i2 + i4;
            int i11 = i2 - i4;
            int i12 = i2 + i7;
            int i13 = i2 - i7;
            int i14 = i3 + i4;
            int i15 = i3 - i4;
            int i16 = i3 + i7;
            int i17 = i3 - i7;
            Preconditions.checkArgument(Boolean.valueOf(i4 >= 0 && i12 < width && i13 >= 0 && i16 < height && i17 >= 0));
            int i18 = i16 * width;
            int i19 = width * i17;
            int i20 = i14 * width;
            int i21 = width * i15;
            System.arraycopy(iArr2, 0, iArr, i18, i11);
            System.arraycopy(iArr2, 0, iArr, i19, i11);
            System.arraycopy(iArr2, 0, iArr, i20, i13);
            System.arraycopy(iArr2, 0, iArr, i21, i13);
            int i22 = width - i10;
            System.arraycopy(iArr2, 0, iArr, i18 + i10, i22);
            System.arraycopy(iArr2, 0, iArr, i19 + i10, i22);
            int i23 = width - i12;
            System.arraycopy(iArr2, 0, iArr, i20 + i12, i23);
            System.arraycopy(iArr2, 0, iArr, i21 + i12, i23);
            if (i6 <= 0) {
                i7++;
                i9 += 2;
                i6 += i9;
            }
            if (i6 > 0) {
                i4--;
                i8 += 2;
                i6 += i8 + i5;
            }
        }
        for (int i24 = i3 - iMin; -1 < i24; i24--) {
            System.arraycopy(iArr2, 0, iArr, i24 * width, width);
        }
        for (int i25 = i3 + iMin; i25 < height; i25++) {
            System.arraycopy(iArr2, 0, iArr, i25 * width, width);
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }
}
