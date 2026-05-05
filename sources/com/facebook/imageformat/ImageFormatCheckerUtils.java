package com.facebook.imageformat;

import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001b6Ȑ\u0007\":\u001e\u007fјnjG9LeN/ZS8\u0015s{:'aӜqYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001d\u0014\u0017\u0011jZK\u0006|k\u0015'2ps\u00068\u0016\u000eK>xtd\u000bP60?\u0012\u0005/\u001cZL\u001e~\u0013Cy\u000eB4NyRR;WK\u001fZ,L+\u0019\u001e\u000bq~:Vsu:]%3mPZ?_^\u0007}\u0011T\\?\r%cN/NDM\u0015S]I\f\u001bqM\u0011Wqk\u000b\u0019+52as\u00068\t\u0004\"\u001dCO;_9+ف\t`"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\fPC9q4+\u0005we@\u00159", "", "u(E", "/rR6\\\tRb\u0019\r", "", "D`[BX", "", "6`b\u001dT;MS&\bVm", "", "0xc249KO-", ">`cAX9G", "=eU@X;", "", "7mS2k\u0016?>\u0015\u000e\n^9\u0006", "0xc249KO-ezg", ">`cAX9G:\u0019\b", "AsP?g:0W(\u0002eZ;\f\t<n", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageFormatCheckerUtils {
    public static final ImageFormatCheckerUtils INSTANCE = new ImageFormatCheckerUtils();

    private ImageFormatCheckerUtils() {
    }

    @JvmStatic
    public static final byte[] asciiBytes(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Charset charsetForName = Charset.forName(HTTP.ASCII);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
            byte[] bytes = value.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    @JvmStatic
    public static final boolean hasPatternAt(byte[] byteArray, byte[] pattern, int i2) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (pattern.length + i2 > byteArray.length) {
            return false;
        }
        Iterable indices = ArraysKt.getIndices(pattern);
        if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                if (byteArray[i2 + iNextInt] != pattern[iNextInt]) {
                    return false;
                }
            }
        }
        return true;
    }

    @JvmStatic
    public static final int indexOfPattern(byte[] byteArray, int i2, byte[] pattern, int i3) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (i3 > i2) {
            return -1;
        }
        int i4 = 0;
        byte b2 = pattern[0];
        int i5 = i2 - i3;
        while (i4 <= i5) {
            if (byteArray[i4] != b2) {
                do {
                    i4++;
                    if (i4 > i5) {
                        break;
                    }
                } while (byteArray[i4] != b2);
            }
            if (i4 <= i5) {
                int i6 = i4 + 1;
                int i7 = (i6 + i3) - 1;
                for (int i8 = 1; i6 < i7 && byteArray[i6] == pattern[i8]; i8++) {
                    i6++;
                }
                if (i6 == i7) {
                    return i4;
                }
            }
            i4++;
        }
        return -1;
    }

    @JvmStatic
    public static final boolean startsWithPattern(byte[] byteArray, byte[] pattern) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return hasPatternAt(byteArray, pattern, 0);
    }
}
