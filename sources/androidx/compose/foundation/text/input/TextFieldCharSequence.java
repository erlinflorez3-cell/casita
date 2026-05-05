package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: TextFieldCharSequence.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eOLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007njO0LeN2ZS8\u0015s{:*c$\u007fLCU }*\t]Ȟo˧vJh\u0015K\u000f\f\u001b\u0001j:I]ތe\u0012\u001dIJoE5UoKEhҚ<ӌ6݅R8(\u0004AU:N\u0016v\tCc\f@/Pv@R\u001bN\u001d\u001a@\bN(\u0007\u001ejjf8^k\f<?7\tiPR?m@~]\rtZ7\u000f\u0007aL-V6c\u001aȏW\u0003\u0015Y$K\u0011T\n=3~W+9`\fWdWH%#Cg\r\f\tVb\u0013hx\u000e=*}|\u0012\u05cb\u000ep\u0007\t\u0016%<2)6+VJE\u001a\u0015\u0015Tޮt;YNm\u001a^p\rAu~\u001b3\u001eK+g1/goZ1Nez5\u0011,C\u0019nOh\u0005\u0012n63T&^we\taVp\"Yk\u00114tp&B\u0004^l03\n7F\u0017SD\f=1H\u0004\u0002vQ\u0018z\u0013\t\u0001S\u0018_\u0011F0\u0018.7X3Rn\u0015{\u0013nhVn+?OʵS͵ś\u0007\u0012ء`}Dƙ=\u0012TWvr;jk\u000e==v9in\u001a\u0014g;n3cSy\u000f\u0010Wλ\u0018EDϵ\u001dZlLa\u0017+n6.JH\u0019\u001d.P\u001b\u009f\u000eƱ6C\n\u001e::?(-,V\u00046Bo~ɺ^ʳՉ\u000f}Ձ7,\u000bi2\u0007!\u0003Vl~\u00018\bW,\u0015`P,ۮU;!ğm$nG\u000b7ȗ~|\bJm֘czk\u001eu[\u001b¶\u001aE"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "", "BdgA", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "1n\\=b:Bb\u001d\t\u0004", "6hV5_0@V(", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-wlc<\u000eg.Q\u0006\u0016[WN\u0002", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dTt8\u007f$Bc\u0002\u001fJ7\u00148UNEy4g%l+H\u0007v;\u0018e'Z[;(eTr\u0013z\u0018d\u001dU/\u0016ND=({\u001a\u001e%\u0012;P\u0006D2\u0006\u001d\u001eW9s\u007fBc\u0019C\u0001^TA*dV`nWQJSq7t\nn'i\"61\u001aq&p,A", "5dc\u0010b4I]'\u0003\nb6\u0006P\u0017z\u000e;\u007f-\\", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhj\u001c@o\u0016\u0004", "5dc\u0015\\.AZ\u001d\u0001}m", "u(;8b;EW\"HeZ0\n^", ":d]4g/", "", "5dc\u0019X5@b\u001c", "u(8", "5dc X3>Q(\u0003\u0005gs{\\\u00191\b\b[", "u(9", "\u0018", "5dc!X?M", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "1n]AX5M3%\u000fve:", "", "=sW2e", "3pd._:", "", "5dc", "", "7mS2k", "6`b566=S", "Ag^B_+,V#\u0011h^3|\u0007>i\n1", "AtQ X8NS\"|z", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "Bn25T9\u001a`&z\u000f", "", "2dbA\\5:b\u001d\t\u0004", "", "2dbA\\5:b\u001d\t\u0004H-}\u0017/t", "And?V,,b\u0015\f\nB5{\tB", "And?V,\u001e\\\u0018b\u0004],\u0010", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 8;
    private final TextRange composition;
    private final Pair<TextHighlightType, TextRange> highlight;
    private final long selection;
    private final CharSequence text;

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, Pair pair, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j2, textRange, pair);
    }

    private TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, Pair<TextHighlightType, TextRange> pair) {
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = TextRangeKt.m6129coerceIn8ffj60Q(j2, 0, charSequence.length());
        this.composition = textRange != null ? TextRange.m6111boximpl(TextRangeKt.m6129coerceIn8ffj60Q(textRange.m6127unboximpl(), 0, charSequence.length())) : null;
        this.highlight = pair != null ? Pair.copy$default(pair, null, TextRange.m6111boximpl(TextRangeKt.m6129coerceIn8ffj60Q(pair.getSecond().m6127unboximpl(), 0, charSequence.length())), 1, null) : null;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return get(i2);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, Pair pair, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? "" : charSequence, (2 & i2) != 0 ? TextRange.Companion.m6128getZerod9O1mEE() : j2, (4 & i2) != 0 ? null : textRange, (i2 + 8) - (i2 | 8) == 0 ? pair : null, null);
    }

    public int getLength() {
        return this.text.length();
    }

    public final CharSequence getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE */
    public final long m1446getSelectiond9O1mEE() {
        return this.selection;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA */
    public final TextRange m1445getCompositionMzsxiRA() {
        return this.composition;
    }

    public final Pair<TextHighlightType, TextRange> getHighlight() {
        return this.highlight;
    }

    public char get(int i2) {
        return this.text.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.text.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text.toString();
    }

    public final boolean contentEquals(CharSequence charSequence) {
        return StringsKt.contentEquals(this.text, charSequence);
    }

    public final void toCharArray(char[] cArr, int i2, int i3, int i4) {
        ToCharArray_androidKt.toCharArray(this.text, cArr, i2, i3, i4);
    }

    public final boolean shouldShowSelection() {
        return this.highlight == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        return TextRange.m6116equalsimpl0(this.selection, textFieldCharSequence.selection) && Intrinsics.areEqual(this.composition, textFieldCharSequence.composition) && Intrinsics.areEqual(this.highlight, textFieldCharSequence.highlight) && contentEquals(textFieldCharSequence.text);
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + TextRange.m6124hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        int iM6124hashCodeimpl = (iHashCode + (textRange != null ? TextRange.m6124hashCodeimpl(textRange.m6127unboximpl()) : 0)) * 31;
        Pair<TextHighlightType, TextRange> pair = this.highlight;
        return iM6124hashCodeimpl + (pair != null ? pair.hashCode() : 0);
    }
}
