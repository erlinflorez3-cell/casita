package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: TextFieldValue.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012}\bnjO0LeN;ZS8\u0018s{:$c$\u007fICU ~(\u000eeȞ\u0006\u0004\u001fJ\t\n{\u000e\"V\u001ep@Y[~] \u000fJB\u001e@CSu=Gb\r63#B*>y\u0013\u00052,^\u000f%}ŲO\f 5\u0001\u0012JV\u001bS\u001d\u001a@\rN&\u0007\u001ejif6vomB5#\u0011mZP=^^\u007f֔\u0011Fb/U%o0C@eߎE+Y\u0003\u0015Xs?1F\"C\u000bh5)CI\"Zf`\u0006\u0014#/g\u000fsqT_՝PӠВ+-UvYdVT\u0006\r\u0014\rjǉ>\n5HF-Hg8\u00149t\u0001UXP0ar\b\u0001aD\u001b=\u0002I*g\u001eȑPĥޅ\u001dP=\u000f\u0013\"f4\u000f\u00059[\u0003%\u0011\u001b)l\u0010SGPn<\u000fݧ\n\"C{\u001d\tb0DJD\u0010\u0006=\u0017).E&}o\n2/q\u001aHrnЛ\tfpׅ\u0002TNI0xfN8\r$\\Zc3nĥSАą\u0010LɟX\r\u0006ܱ+\"b\u0003J-u'\\Q\u0001i\u0019PУ\tɘĽe6֍rs\u0016WGmK7Wp\u001eo#\u0006\"?Tb3Y\u001d\u0007ΐ\u0010^t*(BV{ݛw\u0005LQ\u0012ưNmp$42Pǲ`2"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "", "BdgA", "", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "1n\\=b:Bb\u001d\t\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005z41$2P9\u001ar\u0019J\u007f)G\"52fayA\u001d[_\u001fVt\u0011\u000ehA1w@>hf,J}Ko\u0010i \u0017Cy}RT\u001fQ\u0007|qN/hS/#j", "/m]<g(MS\u0018l\nk0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0003{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u001dN>\u001cNHA7}13(\n,\u001fhAr\u0010\u0013\u001a\u0017~o\u0002J \u0014P\t\u0015\u0003J%o\u00108_zCQLq\bn\u0015m,iJ83\u001e~\u0001\u0017uV.\u0017Q\u0017\u0002", "5dc\u000ea5Hb\u0015\u000ez]\u001a\f\u00163n\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", "5dc\u0010b4I]'\u0003\nb6\u0006P\u0017z\u000e;\u007f-\\", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhj\u001c@o\u0016\u0004", "5dc X3>Q(\u0003\u0005gs{\\\u00191\b\b[", "u(9", "\u0018", "5dc!X?M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n_F", "1n_F yKM)ggJ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0003{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u001dN>\u001cNHA7}13(\n,\u001fE\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#nyZP\u000ff3o\u001cnfK:M3tu\u0019\"gA*\u0011\fSf", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005z41$2P9\u001ar\u0019J\u007f)G\"\u0012\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eG#Q;I\u0015J2\u0005\u0015!\u001eD4_Bi\u001f(}\u0015|@\u001adMi_O", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new Function2<SaverScope, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
            return CollectionsKt.arrayListOf(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m6111boximpl(textFieldValue.m6370getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope));
        }
    }, new Function1<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final TextFieldValue invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            TextRange textRangeRestore = null;
            AnnotatedString annotatedStringRestore = ((!Intrinsics.areEqual(obj2, (Object) false) || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
            Intrinsics.checkNotNull(annotatedStringRestore);
            Object obj3 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
            if ((!Intrinsics.areEqual(obj3, (Object) false) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
                textRangeRestore = saver.restore(obj3);
            }
            Intrinsics.checkNotNull(textRangeRestore);
            return new TextFieldValue(annotatedStringRestore, textRangeRestore.m6127unboximpl(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
    });
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2, textRange);
    }

    public /* synthetic */ TextFieldValue(String str, long j2, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, textRange);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m6129coerceIn8ffj60Q(j2, 0, getText().length());
        this.composition = textRange != null ? TextRange.m6111boximpl(TextRangeKt.m6129coerceIn8ffj60Q(textRange.m6127unboximpl(), 0, getText().length())) : null;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i2 + 2) - (2 | i2) != 0 ? TextRange.Companion.m6128getZerod9O1mEE() : j2, (i2 & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j2, TextRange textRange, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? "" : str, (i2 + 2) - (2 | i2) != 0 ? TextRange.Companion.m6128getZerod9O1mEE() : j2, (i2 + 4) - (i2 | 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    private TextFieldValue(String str, long j2, TextRange textRange) {
        this(new AnnotatedString(str, null, null, 6, null), j2, textRange, (DefaultConstructorMarker) null);
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE */
    public final long m6370getSelectiond9O1mEE() {
        return this.selection;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA */
    public final TextRange m6369getCompositionMzsxiRA() {
        return this.composition;
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default */
    public static /* synthetic */ TextFieldValue m6365copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j2, TextRange textRange, int i2, Object obj) {
        if ((1 & i2) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((2 & i2) != 0) {
            j2 = textFieldValue.selection;
        }
        if ((i2 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m6367copy3r_uNRQ(annotatedString, j2, textRange);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ */
    public final TextFieldValue m6367copy3r_uNRQ(AnnotatedString annotatedString, long j2, TextRange textRange) {
        return new TextFieldValue(annotatedString, j2, textRange, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default */
    public static /* synthetic */ TextFieldValue m6366copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j2, TextRange textRange, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = textFieldValue.selection;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m6368copy3r_uNRQ(str, j2, textRange);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ */
    public final TextFieldValue m6368copy3r_uNRQ(String str, long j2, TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, null, null, 6, null), j2, textRange, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.m6116equalsimpl0(this.selection, textFieldValue.selection) && Intrinsics.areEqual(this.composition, textFieldValue.composition) && Intrinsics.areEqual(this.annotatedString, textFieldValue.annotatedString);
    }

    public int hashCode() {
        int iHashCode = ((this.annotatedString.hashCode() * 31) + TextRange.m6124hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        return iHashCode + (textRange != null ? TextRange.m6124hashCodeimpl(textRange.m6127unboximpl()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m6126toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    /* JADX INFO: compiled from: TextFieldValue.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B^IV2\n2\u000b_N\u0016j~Lj\u000bq\u000e4\u0018ѱn2Qǁ\u0011_\u0018\u0013@GŌC9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h \u0017\u0011k7J\u007f+QU$", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }
    }
}
