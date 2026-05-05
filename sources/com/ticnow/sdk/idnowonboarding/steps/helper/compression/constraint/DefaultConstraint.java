package com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint;

import android.graphics.Bitmap;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.ticnow.sdk.idnowonboarding.steps.helper.compression.UtilKt;
import java.io.File;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007lkA0RnP.XS2\u000f\u0002{<$a$\bّkUH|b4_Tmg|Jr\u000bq\u0010\u0016\u001c~j:Kmx\f\u0013\u001f8HoM6eok=pz<\u0005.7:8(\u0006в\u001e*V\u0016?\tQT$\u0012^H!>`\u0017e\u0005H\u001dLRh\u000f,h\u007fNdS\u001daH9;\u0003\u0018M\u0015;0<\u000bP%F\u0003+cǻcӿ/@?ߎe1a\u0005\u001fR\n@YӍsݘ\th/ݐ{U\u0002^NX.\u001ckۃ[ոar.ؘU]n\u0011?+}d\"ַ\u0010߭{z\u0004Ȟ\r\u0010\u001c\u0006?H\\.pǔ\nԧ7tzԟĜT\u000f"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^fkA\u0012p,\\\u0005+QU\u0018*f[\u0001L!\u000e^\u0017]tk\u0005Z=4uS\u0015)\u0011:X\u000f7l\n\u001bk", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^fkA\u0012p,\\\u0005+QU\u0018*f[\u0001L!\u000e^\u0017]tj\u000fbO3{@;(\u0017\u0002", "EhSA[", "", "6dX4[;", "4na:T;", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018D\u000225g\f\u0001Az\u001e*\\\u0019", "?tP9\\;R", "uH8\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\n]\u001b&Ok\u0019zT/=d\u000b E{v8ZK7z\n\u0002XY", "7rA2f6Ed\u0019}", "", "7rB.g0LT\u001d~y", "7lP4X\rBZ\u0019", "\u001aiPCTuB]b_~e,R", "A`c6f-R", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class DefaultConstraint implements Constraint {
    private final Bitmap.CompressFormat format;
    private final int height;
    private boolean isResolved;
    private final int quality;
    private final int width;

    public DefaultConstraint() {
        this(0, 0, null, 0, 15, null);
    }

    public DefaultConstraint(int i2, int i3, Bitmap.CompressFormat format, int i4) {
        Intrinsics.checkParameterIsNotNull(format, "format");
        this.width = i2;
        this.height = i3;
        this.format = format;
        this.quality = i4;
    }

    public /* synthetic */ DefaultConstraint(int i2, int i3, Bitmap.CompressFormat compressFormat, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i5) | ((-1) - 1)) != 0 ? 612 : i2, (-1) - (((-1) - i5) | ((-1) - 2)) != 0 ? LeicaMakernoteDirectory.TAG_CCD_VERSION : i3, (-1) - (((-1) - i5) | ((-1) - 4)) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat, (i5 + 8) - (i5 | 8) != 0 ? 80 : i4);
    }

    @Override // com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Constraint
    public boolean isSatisfied(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return this.isResolved;
    }

    @Override // com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint.Constraint
    public File satisfy(File imageFile) throws Throwable {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        File fileOverWrite = UtilKt.overWrite(imageFile, UtilKt.determineImageRotation(imageFile, UtilKt.decodeSampledBitmapFromFile(imageFile, this.width, this.height)), this.format, this.quality);
        this.isResolved = true;
        return fileOverWrite;
    }
}
