package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005&4\u0012\u0006\u0013nj?1LeV7ZS0\u000fs{B(c$wIAڭ\u001a\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\t:Qmx\f\u001b?6PyW3{xm=n\u007fN\u0005N4R<\b\u0011\u0019\u001aXUV{CaY\u001a*0nyjV\u001b\\\u001d\u001a@\u0016n$\u000f/tg|CxpkLG#1v\tSoy>\u0010e\rtVW\u0013\u0005u6-V6c\u001eUY\u0011\u001cj]U\u0002mz\u0004\n1?5Aas\u0006?\t\u0006\"\u001fCQ#\\!/\r\t_w$'YQ*P!\u001a6x\u0013{;>Z\u05fdXόL.5Կ7\u0014\u001c6\rr\u0002B'؟1۰\u0004ziاg1\u000e7C9Ih(Ĩ\u000eϭR7\u0004˜]*1\u0006\u0007!\nVd֮gôXwYĸ\"LKNf\n\b?DՑCĊ\u0006*\f\u0382\u0018\f=\u0003).E'\u000eن\f؝%k\n҆לk\u000f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\f/r\b(\n\n\u0011 \u001bEy\r<@\u0001>X\u000b*;l\u00067QAEj4\u000e$lhG\\", "", "u(E", "\u0014NA\u001aR\n", "", "\u0014NA\u001aR\u000b", "\u0014NA\u001aR\u0012\u001c", "\u0014NA\u001aR\u0012\u001d", "\"@A\u00148\u001b8:\u0003pZK\nXv\u000f", "\"@A\u00148\u001b8C\u0004iZK\nXv\u000f", "1n]CX9MB#\\vl,", "", "7m_Bg", "B`a4X;\u001cO'~", "CrT\u0010h9KS\"\u000eah*x\u0010/", "", "2`c296K[\u0015\u000e", "CmXEg0FS\u0001\r", "", "4na:T;\u001dO(~", "4na:T;-W!~", ":nR._,\u001c]!\nvk,", ":dUA", "@hV5g", "<na:T3Bh\u0019", "4na:", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AndroidUnicodeUtils {
    private static final int FORM_C = 0;
    private static final int FORM_D = 1;
    private static final int FORM_KC = 2;
    private static final int FORM_KD = 3;
    public static final AndroidUnicodeUtils INSTANCE = new AndroidUnicodeUtils();
    private static final int TARGET_LOWERCASE = 1;
    private static final int TARGET_UPPERCASE = 0;

    private AndroidUnicodeUtils() {
    }

    @JvmStatic
    public static final String convertToCase(String input, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(input, "input");
        Locale locale = z2 ? Locale.getDefault() : Locale.ENGLISH;
        if (i2 == 0) {
            Intrinsics.checkNotNull(locale);
            String upperCase = input.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (i2 != 1) {
            throw new IllegalStateException("Invalid target case".toString());
        }
        Intrinsics.checkNotNull(locale);
        String lowerCase = input.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @JvmStatic
    public static final String dateFormat(double d2, boolean z2, boolean z3) {
        DateFormat timeInstance;
        if (z2 && z3) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z2) {
            timeInstance = DateFormat.getDateInstance(2);
        } else {
            if (!z3) {
                throw new IllegalStateException("Bad dateFormat configuration".toString());
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) d2)).toString();
    }

    @JvmStatic
    public static final int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @JvmStatic
    public static final String normalize(String str, int i2) {
        if (i2 == 0) {
            String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
            Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
            return strNormalize;
        }
        if (i2 == 1) {
            String strNormalize2 = Normalizer.normalize(str, Normalizer.Form.NFD);
            Intrinsics.checkNotNullExpressionValue(strNormalize2, "normalize(...)");
            return strNormalize2;
        }
        if (i2 == 2) {
            String strNormalize3 = Normalizer.normalize(str, Normalizer.Form.NFKC);
            Intrinsics.checkNotNullExpressionValue(strNormalize3, "normalize(...)");
            return strNormalize3;
        }
        if (i2 != 3) {
            throw new IllegalStateException("Invalid form".toString());
        }
        String strNormalize4 = Normalizer.normalize(str, Normalizer.Form.NFKD);
        Intrinsics.checkNotNullExpressionValue(strNormalize4, "normalize(...)");
        return strNormalize4;
    }
}
