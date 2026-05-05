package com.ticnow.sdk.idnowonboarding.steps.helper.compression.constraint;

import android.graphics.Bitmap;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d̉=!,i\bDZc|İI\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nj?0\\\u0016V\u008cjSX\u000e\u0014{b$\f*wCIV2}P\u000b\u007fTmg|Mr\u000bq\u00116\u001c~j:Mmx\f\u0017?8HoM9eok;Ƅx="}, d2 = {"2dU.h3M", "", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^fkA\u0012p,\\\u0005+QU\u0018*f[\u0001L!\u000e^\u0017]tj\u000faL1nRE#\u00125\u001f", "EhSA[", "", "6dX4[;", "4na:T;", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018D\u000225g\f\u0001Az\u001e*\\\u0019", "?tP9\\;R", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 2, mv = {1, 1, 16}, pn = "", xs = "")
public final class DefaultConstraintKt {
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final void m8771default(Compression compression, int i2, int i3, Bitmap.CompressFormat format, int i4) {
        Intrinsics.checkParameterIsNotNull(compression, "$this$default");
        Intrinsics.checkParameterIsNotNull(format, "format");
        compression.constraint(new DefaultConstraint(i2, i3, format, i4));
    }

    public static /* synthetic */ void default$default(Compression compression, int i2, int i3, Bitmap.CompressFormat compressFormat, int i4, int i5, Object obj) {
        if ((1 & i5) != 0) {
            i2 = 612;
        }
        if ((2 & i5) != 0) {
            i3 = LeicaMakernoteDirectory.TAG_CCD_VERSION;
        }
        if ((4 & i5) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i5 & 8) != 0) {
            i4 = 80;
        }
        m8771default(compression, i2, i3, compressFormat, i4);
    }
}
