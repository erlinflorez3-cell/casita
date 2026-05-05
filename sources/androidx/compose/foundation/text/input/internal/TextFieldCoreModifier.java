package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
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
/* JADX INFO: compiled from: TextFieldCoreModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007\"2\u0012\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU }*\teNo˧vJp\u000bK\u000f\f\"\u0001j:կ]ތe\u0012\u001d8JģG3[{EʠhtD\u0005(2(8\u0002\u0005\u0017\u001a2Ϻ\u0016͍\u0001Yŷ<\u0018@B\u0001:\u0001\r{\u0004Z]\u0016B.\u00026\\\u0016PFLz`R/Q\u0005yF\\+w0+R\u001dJb-%v\u0010%;DE=-%\u0002\f\u0017ViI\u001b? H\u0015l53CI\"YF\\\u000e!-+}\u001bmv4k\u001dQ\u000f\u001cˏ/Oq\\\u0019\u00156\n\u0013{;>Jؽ\u0007oO<@2f6\u0010yЂs\u001cG^\u0016vB.\u007f(٪\u0018m\u0007A@Q\u001b\u0015X(ޥ\u001a\u0017>\n\u001b%\u001eQ\n5Œ\\\u001d\u0015n,3T&\\wӈA\u0006O\\\"q=\u001c\u00067Ī\u0003r\u000b>`\u0018/*\u001ftВ&\u007fbG=9k0X\u000bМwMBvn\u0002RvؗRt\u001c78\n$Zrf5qVTf/)MJV7\u0004\u000e\u0013.`\u0010<O*@TUhwpe]8,_l=Y|s&Wggc;Wc\u001ekjvBJlh\u000bXtNk\f\t^X(8Hx\u001d\u0010{r\\<\u00198?\u007f+L,_)#İGK$P]\u0015\t\u000eZ/$GeAA\u001biRv9\u0007^z\tq}wwKC˷#uH_U1&\u0004C/٫{k\u000e\r\u0016\u0018G\u0016o\u000eǙk^\u0004c 8\u0016H^\u00023K9'~W2HA\u000eV\u0001\riM@L#|(7\u0002|~s\u0016t\t,\u000fu!֥VЂ&vfаs\u0014r\u0003\u0012at|\u001eύVߏ_>QͿSeJOP|3!tݕ\u0003Ȟ&|=Ԇ\u00143+%\u0010\u0014]%8ӣkܓ2yjχv\u0001s\u0011DcD}9Ж_щ?8QʲOJ0,\u0005\u0003pQA̮\nɚ\r4\u0015Ή\u0019Mrvn8{\u0012\u0006̑h¡0\rx£,F!s\u00164\\d\u0001ϕE\u0382\u0018^KљaYas\u0006my^aͪ\u0011ϻ\u000f{9ޫ݇ f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+:\\\u007f={\u001cY\u0012O/\r\u0012/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+:\\\u007f={\u001cY\u0012O/\r\u0012BK#n\u001a", "7r5<V<LS\u0018", "", "7r3?T.!]*~\b^+", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgA90>Z\u0018lze,z\u00183o\t\u0016\u000b<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;>", "1ta@b9\u001b`)\r}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "EqXAX(;Z\u0019", "Aba<_3,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\r J|_2VNKz}\"\u001ewaF\u0010_3\u0018e'Z[5(p\\\u0003L\u0002!V\u001dN\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u000f?zyAR\u001fK\u0004\u001e?P){U#c\u0003RQT,.m\u001b_*e6Am\u0003~\u0015$vQ8\u0017\u0004S\u0010aR\rvHK\u0019\u00027\u0012MijF\u001bVQEs4)Oz\u000b[0b|6~;\u0004}+@t\u000eJc'Bh\u0002^;\\T6o:E\u001eOZ-yuM\u000eu(]\u000fWp58\u0019ctgR\u0018PL\u0017nDBc\u0001>Qs>Po\u00136J\tKI\t\u0011\u0018\u0007yTaRB(^\u0005\u0019\u0004\u000e i\u0019\u000e\rt\u0018e>\u001a\u0007[\u001cd5b;K!REE\u001c\n\\\u0019\nWD\u0019lX|_V\u0003m4\u0003\u0019T+AK\u0006w\\Sx\u000f\u0012C\u0005\u0015\bfagO\u0004=\u001a\u001349h88G+\u0014f`,\u001dfKe\u001d79\r\\Nn(x1%\u0007\rd\f\u0019gG\u0002\u00043OXz/<q\u0015nI^R\u0019;I$3j}k\u0006L", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {
    public static final int $stable = 0;
    private final Brush cursorBrush;
    private final boolean isDragHovered;
    private final boolean isFocused;
    private final Orientation orientation;
    private final ScrollState scrollState;
    private final TextFieldSelectionState textFieldSelectionState;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final boolean writeable;

    private final boolean component1() {
        return this.isFocused;
    }

    private final boolean component2() {
        return this.isDragHovered;
    }

    private final TextLayoutState component3() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component4() {
        return this.textFieldState;
    }

    private final TextFieldSelectionState component5() {
        return this.textFieldSelectionState;
    }

    private final Brush component6() {
        return this.cursorBrush;
    }

    private final boolean component7() {
        return this.writeable;
    }

    private final ScrollState component8() {
        return this.scrollState;
    }

    private final Orientation component9() {
        return this.orientation;
    }

    public static /* synthetic */ TextFieldCoreModifier copy$default(TextFieldCoreModifier textFieldCoreModifier, boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            z2 = textFieldCoreModifier.isFocused;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            z3 = textFieldCoreModifier.isDragHovered;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            textLayoutState = textFieldCoreModifier.textLayoutState;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            transformedTextFieldState = textFieldCoreModifier.textFieldState;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            textFieldSelectionState = textFieldCoreModifier.textFieldSelectionState;
        }
        if ((i2 + 32) - (32 | i2) != 0) {
            brush = textFieldCoreModifier.cursorBrush;
        }
        if ((64 & i2) != 0) {
            z4 = textFieldCoreModifier.writeable;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            scrollState = textFieldCoreModifier.scrollState;
        }
        if ((i2 & 256) != 0) {
            orientation = textFieldCoreModifier.orientation;
        }
        return textFieldCoreModifier.copy(z2, z3, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush, z4, scrollState, orientation);
    }

    public final TextFieldCoreModifier copy(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        return new TextFieldCoreModifier(z2, z3, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush, z4, scrollState, orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.isFocused == textFieldCoreModifier.isFocused && this.isDragHovered == textFieldCoreModifier.isDragHovered && Intrinsics.areEqual(this.textLayoutState, textFieldCoreModifier.textLayoutState) && Intrinsics.areEqual(this.textFieldState, textFieldCoreModifier.textFieldState) && Intrinsics.areEqual(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && Intrinsics.areEqual(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && Intrinsics.areEqual(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isFocused) * 31) + Boolean.hashCode(this.isDragHovered)) * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31) + this.cursorBrush.hashCode()) * 31) + Boolean.hashCode(this.writeable)) * 31) + this.scrollState.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", isDragHovered=" + this.isDragHovered + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ')';
    }

    public TextFieldCoreModifier(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        this.isFocused = z2;
        this.isDragHovered = z3;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z4;
        this.scrollState = scrollState;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldCoreModifierNode create() {
        return new TextFieldCoreModifierNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextFieldCoreModifierNode textFieldCoreModifierNode) {
        textFieldCoreModifierNode.updateNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }
}
