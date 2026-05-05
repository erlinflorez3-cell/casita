package com.facebook.imagepipeline.filter;

import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0018\u007f\u0007llA0ReP\u008cZS@\u000fs{:'c$\u007fVCU \u0005(ߢOdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e\u0017k\u0015'2pso7[tU9\u000fxf\t.8:8(\t1\u001e8O(v)G\u0012\fZNNxRR;V5\u001e \u0010V /)\rk\\B`l\f>_'\u0011vZNUcv\u0002\u0016+Tb?\r%jN/NAM\u0015S^3\u000b`gW\u0003mum\tv4?+ww\u001e6!6\"$CO;f#*j\u0015i`:8[Sq]h\u000eV\t+\u007f\u001bO\u001c\u000e4+x2;.~\b<7%vaUh\u0002\rF0~oL/%.Dq9c%_xS\u0019|@,\t\u001b.;\u0001\u001d2\fX\u001cx-\u001b\u0003\t\u00025_SUH|\u000e\nA{\u000b\tb0.44U\u0019G{?2G)EpQ#Oo2LR}\u000f\u0005\u000fy\u001ai#TN#\u0007\u0016e,_ȴ-ֈh\u0005s¬Ԣ\\F"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006w)<h}-\u0001Q%.Z?JoE\u001eqrt\u0016\u000es9/z.VL[\u0002", "", "u(E", "\"@6", "", "0nd;W", "", "F", Global.COLON, "6", "0ng\u000f_<K0\u001d\u000e\u0003Z7`\u0012\u001al{&{", "", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "7sT?T;B]\"\r", "@`S6h:", "4`bA56Q0 \u000f\b", "7mc2e5:Z{\t\bbA\u0007\u0012>a\u0007\u0005\u0003P\u000e", ">hg2_:", "", "=tc\u001fb>", ExifInterface.LONGITUDE_EAST, "@nf", "2hP:X;>`", "2he", "7mc2e5:Z\n~\bm0z\u00056B\u00078\t", "=tc\u0010b3", "1n[", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IterativeBoxBlurFilter {
    public static final IterativeBoxBlurFilter INSTANCE = new IterativeBoxBlurFilter();
    private static final String TAG = "IterativeBoxBlurFilter";

    private IterativeBoxBlurFilter() {
    }

    private final int bound(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    @JvmStatic
    public static final void boxBlurBitmapInPlace(Bitmap bitmap, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Preconditions.checkArgument(Boolean.valueOf(bitmap.isMutable()));
        Preconditions.checkArgument(Boolean.valueOf(((float) bitmap.getHeight()) <= 2048.0f));
        Preconditions.checkArgument(Boolean.valueOf(((float) bitmap.getWidth()) <= 2048.0f));
        Preconditions.checkArgument(Boolean.valueOf(i3 > 0 && i3 <= 25));
        Preconditions.checkArgument(Boolean.valueOf(i2 > 0));
        try {
            INSTANCE.fastBoxBlur(bitmap, i2, i3);
        } catch (OutOfMemoryError e2) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(null, "OOM: %d iterations on %dx%d with %d radius", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i3)}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            FLog.e(TAG, str);
            throw e2;
        }
    }

    private final void fastBoxBlur(Bitmap bitmap, int i2, int i3) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i4 = i3 + 1;
        int i5 = i4 + i3;
        int[] iArr2 = new int[i5 * 256];
        int i6 = 1;
        while (true) {
            if (i6 >= 256) {
                break;
            }
            for (int i7 = 0; i7 < i5; i7++) {
                iArr2[i4] = i6;
                i4++;
            }
            i6++;
        }
        int[] iArr3 = new int[Math.max(width, height)];
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = 0;
            while (i9 < height) {
                int i10 = i9;
                internalHorizontalBlur(iArr, iArr3, width, i9, i5, iArr2);
                System.arraycopy(iArr3, 0, iArr, i10 * width, width);
                i9 = i10 + 1;
            }
            int i11 = 0;
            while (i11 < width) {
                int i12 = i11;
                internalVerticalBlur(iArr, iArr3, width, height, i11, i5, iArr2);
                int i13 = i12;
                for (int i14 = 0; i14 < height; i14++) {
                    iArr[i13] = iArr3[i14];
                    i13 += width;
                }
                i11 = i12 + 1;
            }
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    private final void internalHorizontalBlur(int[] iArr, int[] iArr2, int i2, int i3, int i4, int[] iArr3) {
        int i5 = i2 * i3;
        int i6 = ((i3 + 1) * i2) - 1;
        int i7 = i4 >> 1;
        int i8 = i2 + i7;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = -i7; i13 < i8; i13++) {
            int i14 = iArr[bound(i5 + i13, i5, i6)];
            int i15 = i14 >> 16;
            i9 += (i15 + 255) - (i15 | 255);
            i10 += (i14 >> 8) & 255;
            i11 += (i14 + 255) - (255 | i14);
            i12 += i14 >>> 24;
            if (i13 >= i7) {
                int i16 = iArr3[i12] << 24;
                int i17 = iArr3[i9] << 16;
                iArr2[i13 - i7] = ((-1) - (((-1) - ((i16 + i17) - (i16 & i17))) & ((-1) - (iArr3[i10] << 8)))) | iArr3[i11];
                int i18 = iArr[bound((i13 - (i4 - 1)) + i5, i5, i6)];
                i9 -= (i18 >> 16) & 255;
                i10 -= (-1) - (((-1) - (i18 >> 8)) | ((-1) - 255));
                i11 -= (i18 + 255) - (255 | i18);
                i12 -= i18 >>> 24;
            }
        }
    }

    private final void internalVerticalBlur(int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5, int[] iArr3) {
        int i6 = ((i3 - 1) * i2) + i4;
        int i7 = (i5 >> 1) * i2;
        int i8 = (i5 - 1) * i2;
        int i9 = i4 - i7;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i9 <= i6 + i7) {
            int i15 = iArr[bound(i9, i4, i6)];
            int i16 = i15 >> 16;
            i10 += (i16 + 255) - (i16 | 255);
            i11 += (-1) - (((-1) - (i15 >> 8)) | ((-1) - 255));
            i12 += 255 & i15;
            i13 += i15 >>> 24;
            if (i9 - i7 >= i4) {
                iArr2[i14] = (-1) - (((-1) - ((-1) - (((-1) - ((iArr3[i13] << 24) | (iArr3[i10] << 16))) & ((-1) - (iArr3[i11] << 8))))) & ((-1) - iArr3[i12]));
                i14++;
                int i17 = iArr[bound(i9 - i8, i4, i6)];
                i10 -= (-1) - (((-1) - (i17 >> 16)) | ((-1) - 255));
                i11 -= (i17 >> 8) & 255;
                i12 -= 255 & i17;
                i13 -= i17 >>> 24;
            }
            i9 += i2;
        }
    }
}
