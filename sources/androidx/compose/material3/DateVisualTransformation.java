package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я-\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007fјnj?3Le^.Zݷ2\u000f\u0002{<ř\u0004#wI;kڼ.\"7N\u000frwrXZ#C=\u0007Ȁ|j:K\u001e\u0007k\u001c'2pzo7[{U9\u000f\u0002|\u0019p>0;\u0012\u0005/\u001e\u0001Ͻ\u0012ͯ~CSÈb<NpRR;N[܈\u0014ĂB \tȦ-u\\;`l\f@\u0006ݍ\u0005ݦFP/_>\u0004\u001e\u0019T\\?\r%etѫB˝9\u0015-مS\u0013`dW\u0003mu\u0014ݞjҊ++Q֕ɷ:f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYn$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", "2`c2<5Ic(_\u0005k4x\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rIR;O=)%wBC\u0014k(]L", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw,?Jk\u0018' xp\u001a\u0011p4J\u0006|\u000b=", "2`c296K[\u0015\u000ea^5~\u00182", "", "2`c2B-?a\u0019\u000eik(\u0006\u00176a\u000f2\t", "/mS?b0=fb|\u0005f7\u0007\u0017//\b$\u000b@\u000e\u001b\u0013N=W\u001br45J\u0002.Gi\u001d\u001dZ?Dy5(\"p]H\u000bm5\ru#VL8-]`rL\u0003\u001fV\u0017\\2\t\u0014cNb:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYn$E}\u00125<P7tB\u001f\u001fui5\u0016g6W5&C[N\u0016]S\u0001=#\u0001g\nW9\u0014\u0001hK1-\u0010\r", "4ha@g\u000b>Z\u001d\u0007~m,\nr0f\u000e(\u000b", "AdR<a+\u001dS \u0003\u0003b;|\u0016\u0019f\u00016{O", "4h[AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l-3v$/WPCk3\r\u0015{p\u000f", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DateVisualTransformation implements VisualTransformation {
    private final int dateFormatLength;
    private final DateInputFormat dateInputFormat;
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i2) {
            if (i2 >= this.this$0.firstDelimiterOffset) {
                if (i2 < this.this$0.secondDelimiterOffset) {
                    return i2 + 1;
                }
                if (i2 > this.this$0.dateFormatLength) {
                    i2 = this.this$0.dateFormatLength;
                }
                return i2 + 2;
            }
            return i2;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i2) {
            if (i2 <= this.this$0.firstDelimiterOffset - 1) {
                return i2;
            }
            return i2 <= this.this$0.secondDelimiterOffset + (-1) ? i2 - 1 : i2 <= this.this$0.dateFormatLength + 1 ? i2 - 2 : this.this$0.dateFormatLength;
        }
    };
    private final int firstDelimiterOffset;
    private final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = StringsKt.indexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.secondDelimiterOffset = StringsKt.lastIndexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        String text;
        int i2 = 0;
        if (annotatedString.getText().length() > this.dateFormatLength) {
            text = StringsKt.substring(annotatedString.getText(), RangesKt.until(0, this.dateFormatLength));
        } else {
            text = annotatedString.getText();
        }
        String str = text;
        String str2 = "";
        int i3 = 0;
        while (i2 < str.length()) {
            int i4 = i3 + 1;
            str2 = str2 + str.charAt(i2);
            if (i4 == this.firstDelimiterOffset || i3 + 2 == this.secondDelimiterOffset) {
                str2 = str2 + this.dateInputFormat.getDelimiter();
            }
            i2++;
            i3 = i4;
        }
        return new TransformedText(new AnnotatedString(str2, null, null, 6, null), this.dateOffsetTranslator);
    }
}
