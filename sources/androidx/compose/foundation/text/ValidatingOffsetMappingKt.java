package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: ValidatingOffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!4i\bDJd|\u0004O\u00068é6B\r(4\u0012}\u000bnjO0Le^.Zݷ2\u000f\u0002{<$a%\naIW2}P\f\u007fRuk\u0007J\t\u0010s\u0013\u0014\u001c\u0011jZN\u0006|k\u0019'2pt\u00063e\u000eKAxtd\bP60A\u0012\u0005/\u001fZL\u001e\u0001\u0013Cy\u0011B4NwRR;RK\u001a*\u0018L+\u0019\u001e\u000bsv6vy\u000e>=1\u001bip]mڿH\u0019[\u001d^TU\u0010\u001faL7p;C\u001f=S1\f\u0003aE\u0003M\u0003U\u0005\u0017,m*i\u0006e̬p\u007fB\u0014\u0002˾\u000fǁv,dӤib\u0012'9PӓOb"}, d2 = {"$`[6W(MW\"\u0001Zf7\f\u001d\u0019f\u00016{Oh\u0013\"Rs\u0017>Z$5b\r$F\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "5dc#T3BR\u0015\u000e~g.\\\u0011:t\u0014\u0012|A\u000f\u0017&/k\u0019Gz.7=| @|\u001a=a", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri!n\u0017<MR#g?)\u0019qc\u000f", "D`[6W(MS\u0003\f~`0\u0006\u00056T\n\u0017\t<\n%\u0018Q|\u0016<u", "", "BqP;f-H`!~yH-}\u0017/t", "", "BqP;f-H`!~yE,\u0006\u000b>h", "=eU@X;", "D`[6W(MS\b\fvg:}\u0013<m\u007f'jJj$\u001bIs\u00178}", "=qX4\\5:Z\u0003\u007f{l,\f", "=qX4\\5:Z\u007f~\u0004`;\u007f", "4h[AX90W(\u0002kZ3\u0001\b+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l-3v$/WPCk3\r\u0015{p\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Bga<j\u0010?<#\u000ekZ3\u0001\b\u001er{1\nA\u000b$\u001f", ":h\\6g", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ValidatingOffsetMappingKt {
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.Companion.getIdentity(), 0, 0);

    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    public static final TransformedText filterWithValidation(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        TransformedText transformedTextFilter = visualTransformation.filter(annotatedString);
        throwIfNotValidTransform$default(transformedTextFilter, annotatedString.length(), 0, 2, null);
        return new TransformedText(transformedTextFilter.getText(), new ValidatingOffsetMapping(transformedTextFilter.getOffsetMapping(), annotatedString.length(), transformedTextFilter.getText().length()));
    }

    public static /* synthetic */ void throwIfNotValidTransform$default(TransformedText transformedText, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 100;
        }
        throwIfNotValidTransform(transformedText, i2, i3);
    }

    public static final void throwIfNotValidTransform(TransformedText transformedText, int i2, int i3) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i2, i3);
        for (int i4 = 0; i4 < iMin; i4++) {
            validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i4), length, i4);
        }
        validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i2), length, i2);
        int iMin2 = Math.min(length, i3);
        for (int i5 = 0; i5 < iMin2; i5++) {
            validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(i5), i2, i5);
        }
        validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(length), i2, length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateTransformedToOriginal(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i4 + " -> " + i2 + " is not in range of original text [0, " + i3 + AbstractJsonLexerKt.END_LIST).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOriginalToTransformed(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i4 + " -> " + i2 + " is not in range of transformed text [0, " + i3 + AbstractJsonLexerKt.END_LIST).toString());
        }
    }
}
