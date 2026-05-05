package com.ticnow.sdk.idnowonboarding.steps.helper.compression;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1561oA;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я@\u001d̉=!,u\bDJd|\u0004W\u00068é6B\r(4ߚ\u007f\u0007|jA0JfP.hS2\u000fq{<$q$yCAX\"}8\tWNmgvJh\u000bK\u000f\f\u0018\u0011x:Jmx\f\u0011?6PqW3{r\u00049x\u0011D\t82P=*\t\u000f BH>}+GY\u0014*0nujV\u001bV\u001d\u001a@\u000bV6\u000f(tg|Axpk<G#1lrR5kH|{\u0018\rÖ?)\u0005n6+nEe\u00193_\u001b\u0007\u0001fo\u0007MyU\u0005\u0017,W/W|o6\u0007\u0005,)9^%]!4\r\t_l$'YZ\u0014O^\u001e@w)\n%H\u0012\u001f\u001e'v<]\u001et\u0014&3#}kh^\u0014vB.\u0006\u0012:%1\u00183YDKj_qS\u0019|E,\u000b\u0013\u001e1\u0014\u0007!\nh>f\u001b\u001bb\ri1\u007fEUp\\ q=\u001c\u001b!f\u0010:\u001c0u\u000e_\u007f\u001fF/%efi)'k\u0010[\\g%\u0019\u0011nYi`]X\"\u001d\u001bO2\u0017%rD\u0013\u0019\u0014P\u0003cD\u0019[6l\u0007,\u0007; \u000b\f\\53īfW\u0007i\u0013Os\tS.\u001560ʧmް[9fڨ̹U~"}, d2 = {"Ad_.e(M]&", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "1`R5X\u0017:b\u001c", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1`[0h3:b\u0019b\u0004L(\u0005\u00146em,\u0011@", "", "=oc6b5L", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"(k\fK\u00012I\u0018g+Fq 7[\u0019", "@d`$\\+MV", "@d`\u0015X0@V(", "1n_FG6\u001cO\u0017\u0002z", "\u001aiPCTuB]b_~e,R", "7lP4X\rBZ\u0019", "2dR<W,,O!\n\u0002^+Y\r>m{3\\M\u000b\u001fwKv\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "2dc2e4B\\\u0019b\u0003Z.|u9t{7\u007fJ\n", "0hc:T7", ":nP150M[\u0015\n", "=uT?J9Bb\u0019", "4na:T;", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018D\u000225g\f\u0001Az\u001e*\\\u0019", "?tP9\\;R", "A`e250M[\u0015\n", "", "2dbA\\5:b\u001d\t\u0004", "1n\\=e,Lay\t\bf(\f", "3wc2a:B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 2, mv = {1, 1, 16}, pn = "", xs = "")
public final class UtilKt {
    private static final String separator = File.separator;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
        }
    }

    private static final String cachePath(Context context) throws Throwable {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = Class.forName(Qg.kd("\u001c(\u001d*&\u001f\u0019a\u0016!\u001f$\u0014\u001c!Ym\u0019\u0017\u001c\f\u001e\u0019", (short) (OY.Xd() ^ 10260), (short) (OY.Xd() ^ 29673)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 16815);
        short sXd2 = (short) (C1607wl.Xd() ^ 27631);
        int[] iArr = new int["%\"0}\u001b\u001c \u001cy\u001e&".length()];
        QB qb = new QB("%\"0}\u001b\u001c \u001cy\u001e&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            Intrinsics.checkExpressionValueIsNotNull(file, C1561oA.ud("R][`Pb]\u0016JGHLH&JR", (short) (C1607wl.Xd() ^ 22111)));
            StringBuilder sbAppend = sb.append(file.getPath());
            String str = separator;
            return sbAppend.append(str).append(C1561oA.yd("Vc^bi]hijn", (short) (Od.Xd() ^ (-17289)))).append(str).toString();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final int calculateInSampleSize(BitmapFactory.Options options, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(options, "options");
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        int i4 = 1;
        if (iIntValue > i3 || iIntValue2 > i2) {
            int i5 = iIntValue / 2;
            int i6 = iIntValue2 / 2;
            while (i5 / i4 >= i3 && i6 / i4 >= i2) {
                i4 *= 2;
            }
        }
        return i4;
    }

    public static final Bitmap.CompressFormat compressFormat(File compressFormat) {
        Intrinsics.checkParameterIsNotNull(compressFormat, "$this$compressFormat");
        String extension = FilesKt.getExtension(compressFormat);
        if (extension == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = extension.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 111145) {
            if (iHashCode == 3645340 && lowerCase.equals("webp")) {
                return Bitmap.CompressFormat.WEBP;
            }
        } else if (lowerCase.equals("png")) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public static final File copyToCache(Context context, File imageFile) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return FilesKt.copyTo$default(imageFile, new File(cachePath(context) + imageFile.getName()), true, 0, 4, null);
    }

    public static final Bitmap decodeSampledBitmapFromFile(File imageFile, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        options.inSampleSize = calculateInSampleSize(options, i2, i3);
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "BitmapFactory.decodeFile…eFile.absolutePath, this)");
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "BitmapFactory.Options().…absolutePath, this)\n    }");
        return bitmapDecodeFile;
    }

    public static final Bitmap determineImageRotation(File imageFile, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        int attributeInt = new ExifInterface(imageFile.getAbsolutePath()).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
        Matrix matrix = new Matrix();
        if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else if (attributeInt == 8) {
            matrix.postRotate(270.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkExpressionValueIsNotNull(bitmapCreateBitmap, "Bitmap.createBitmap(bitm…map.height, matrix, true)");
        return bitmapCreateBitmap;
    }

    public static final String extension(Bitmap.CompressFormat extension) {
        Intrinsics.checkParameterIsNotNull(extension, "$this$extension");
        int i2 = WhenMappings.$EnumSwitchMapping$0[extension.ordinal()];
        return i2 != 1 ? i2 != 2 ? "jpg" : "webp" : "png";
    }

    public static final Bitmap loadBitmap(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath());
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "this");
        return determineImageRotation(imageFile, bitmapDecodeFile);
    }

    public static final File overWrite(File imageFile, Bitmap bitmap, Bitmap.CompressFormat format, int i2) throws Throwable {
        File file;
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(format, "format");
        if (format == compressFormat(imageFile)) {
            file = imageFile;
        } else {
            StringBuilder sb = new StringBuilder();
            String absolutePath = imageFile.getAbsolutePath();
            Intrinsics.checkExpressionValueIsNotNull(absolutePath, "imageFile.absolutePath");
            file = new File(sb.append(StringsKt.substringBeforeLast$default(absolutePath, ".", (String) null, 2, (Object) null)).append('.').append(extension(format)).toString());
        }
        imageFile.delete();
        saveBitmap(bitmap, file, format, i2);
        return file;
    }

    public static /* synthetic */ File overWrite$default(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i2, int i3, Object obj) {
        if ((i3 + 4) - (4 | i3) != 0) {
            compressFormat = compressFormat(file);
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            i2 = 100;
        }
        return overWrite(file, bitmap, compressFormat, i2);
    }

    public static final void saveBitmap(Bitmap bitmap, File destination, Bitmap.CompressFormat format, int i2) throws Throwable {
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(format, "format");
        File parentFile = destination.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(destination.getAbsolutePath());
            try {
                bitmap.compress(format, i2, fileOutputStream2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ void saveBitmap$default(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i2, int i3, Object obj) throws Throwable {
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            compressFormat = compressFormat(file);
        }
        if ((i3 & 8) != 0) {
            i2 = 100;
        }
        saveBitmap(bitmap, file, compressFormat, i2);
    }
}
