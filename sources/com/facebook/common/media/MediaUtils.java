package com.facebook.common.media;

import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>-6B\r.4\u0012}\tnjG9LeN1X\u07be*%ӆ,4RZdvI;ڈ\u001e}0\t\u0018`uk\u0007Lp\nq\u00126\u001c~i:Nmx\f\u0015U2\u000b\u0002M9eqS8\u000fwf\u000b&10=\u0012\u0005/\u001dpMX\u0007\tJc\f@8pv@Q\u001bV\u001d\u001a@\t\u0005%I.jqf6vt\u000e@=,\u001bkXMUbv\u0002\u0016\u001dT_?\r%iN1N@M\u0017;R1\n\u0019`\b\u0013M}U\u0005\u0017/W1W|o8n~B\u0018qT]w\u0001't\u0011ab\u001c'YRsM`\u000eVz)}C@Z\u0602\bόL.5ԿǺ\f\u001b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u0016KkW$v$9Um/;t$\u0004", "", "u(E", "\u000fC3\u0016G\u0010(<tet:\u0013cr!E^\"c$hv\u00116cx\u001cd", "", "", "3wc?T*M3,\u000ezg:\u0001\u00138", ">`c5", "3wc?T*M;\u001d\u0007z", "7r=<a\u0015:b\u001d\u0010zL<\b\u00149r\u000f(z(\u0005\u001f\u00176\u0004\u0019<", "", ";h\\2G@IS", "7r?5b;H", "7rC5e,>2", "7rE6W,H", "4aR<e,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MediaUtils {
    public static final MediaUtils INSTANCE = new MediaUtils();
    public static final Map<String, String> ADDITIONAL_ALLOWED_MIME_TYPES = MapsKt.mapOf(TuplesKt.to("mkv", "video/x-matroska"), TuplesKt.to("glb", "model/gltf-binary"));

    private MediaUtils() {
    }

    private final String extractExtension(String str) {
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null);
        if (iLastIndexOf$default < 0 || iLastIndexOf$default == str.length() - 1) {
            return null;
        }
        String strSubstring = str.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @JvmStatic
    public static final String extractMime(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String strExtractExtension = INSTANCE.extractExtension(path);
        if (strExtractExtension == null) {
            return null;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strExtractExtension.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase == null) {
            return null;
        }
        String mimeTypeFromExtension = MimeTypeMapWrapper.getMimeTypeFromExtension(lowerCase);
        return mimeTypeFromExtension == null ? ADDITIONAL_ALLOWED_MIME_TYPES.get(lowerCase) : mimeTypeFromExtension;
    }

    @JvmStatic
    public static final boolean isNonNativeSupportedMimeType(String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return ADDITIONAL_ALLOWED_MIME_TYPES.containsValue(mimeType);
    }

    @JvmStatic
    public static final boolean isPhoto(String str) {
        if (str != null) {
            return StringsKt.startsWith$default(str, "image/", false, 2, (Object) null);
        }
        return false;
    }

    @JvmStatic
    public static final boolean isThreeD(String str) {
        return Intrinsics.areEqual(str, "model/gltf-binary");
    }

    @JvmStatic
    public static final boolean isVideo(String str) {
        if (str != null) {
            return StringsKt.startsWith$default(str, "video/", false, 2, (Object) null);
        }
        return false;
    }
}
