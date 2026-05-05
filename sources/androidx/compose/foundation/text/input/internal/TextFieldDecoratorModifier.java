package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
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
/* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$i-yCAU\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[\u0006e\u0012\u001d˰JģG3[uEʠhtD\u0011(݅*8\b\u0005\t\u001a0H\u0018v\u0011CSÈ\u0018ؔF\u0007í\u0003\u0013]\u0007*\u00124>N\u007f^4wRDI\u0005]h13\u0007wEf'\u000e4\rQ\u001bKl';|q$9GO7+$\u0002\u000b\u0017ViH\u001b? G\u0015l52CI\"aF\\\u000e -+}\u001amx4j\u001dSv\u000bU:_gY`&(&\u0005\f\u0011J\u0015&\u0006UZͶ1\u001at\u001bV:\u0003\u0007k@~\u0004%ܐ\u0001ChD,=\u007fa=\u007fԘg\u001ahI/f7*\tS͗$Iu/rl\u000e\u000f\u001baǛx\u001a:_XUJd\t\bE4֑q+\t8\u001dHG.9BÀ/_,EuQ#OuHӉE0}\u0013{\u0001S\u0018_\u000fٚ#7\u001fEF!\u000epC\u0013\u00142ïU!3\u001fj4T5\bN˹!%gJ?=\u0010|и\u0019opMk\u000b=/\u00159\ntq\u000ee<v3cU\u0014\u0016gR\u0005\u0019W<\u0011\u000b\tnHS\u001aat*81vr@}\u0002D\\\u0015+2m{L:21'g-H1(rG\u0003\tmf\u0001\u0010-ac,\ti2\u0003!\u0003f[\u001f~\u0018~O,\u000bp:-o[e\u001f,U0yL|Q\u0019EΥ~\u0010mZfdlDu\u001c\u0010h'(Yi/k\u001d?\u00057S\u001a/[K!\b\u0018̾\u0013o\u0002\u000b\u001d';\u0017R.Ƥi93n\u0010bO\u0003=hօ];1\u0016\f\u0018y\u0010n+Kq}#[lI9\u0017\"F\\b\u0015\u0005MFM\u0001\u001eMCI}O5&.wB9k˘_ɳs.\u0002ʬ_4\u0003l\u001c.y\u0015\u001ej(Ϥ4֑<Ia˚\u000f.2}\u001bBv|N٧Dީ8\r;ǥ\u0012r~dPO!.,u]\u0530\u000f\u0080Z[Bܤ@\nB:w*\"PTй`ǜ)\u0011Uω8y{Vt\u000bx\u0019`Ν}ϥr\u0012$ܻpber!04}n݀Cވf\u0005Dɿt@:A \u000bqZ@е\u0012Ģ\u0004Fgʕg>PtSV<VOַX߃\t`MǷq6\u000f\u0002'3L|\f̐\u0007֪JT7Ѳҋ\u0005\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+;RpG!\u000ei\u0018[\u0013\u0017\u0004]B(nQ\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+;RpG!\u000ei\u0018[\u0013\u0017\u0004]B(nQ )\u0007,\u001f", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "BdgA90>Z\u0018lze,z\u00183o\t\u0016\u000b<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*z\u0005`A\"}HA(u;E\u0011;>", "4h[AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r\u001ft?.$Wn5\u0010q-X\u0004/C[R6e(", "3mP/_,=", "", "@dP1B5Eg", "9dh/b(KR\u0003\n\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u00159", "9dh/b(KRt|\nb6\u0006k+n~/{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r!kH\u001b\u001fdn8ba;R\u00010*HW+cR\u007f\u0013", "Ah]4_,%W\"~", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011z\u001f\u0006J(dU]i\u0003\u0011PEu9.\u0010h(lI\u0004(\u001d\u0001\u0019(qL5SjS$\u00029u{qW(hG Mm1-AxTI~+\u001e^Eu\u001c:c~9tv\u0005>:?c\u0001Zk\"G(\b\u0015?k\u000b+/AL\"\tOl\u0005lK\u0017d&+\u0016\u000ei5/(iol\u0012}\u0007p&<9af\u007f%R\r>G~\u00191OlQW\t\u0015^m vdVM\u001fS\u0014cnN*j\u001b\u0011\u00030\u0019&>\u001f<U\u001el4h\u0001\\\u0013\u001cw\u0002\u0010\u0005dS$:,\u0019x[\u0002Jdk-Dy\u001bV)/Z@\u0001[\u0019d\u0005|0\n\n\f'whUC4\u001d-0Gg8,a9\u001bpR\u001e(kB%h<1\u0015a\nT^\f$\u001fy\u001bgf lBB\u000bA\u00170f+;pU\t;m\u001c\u000e6U 9nt_Ce\u0004>Ij\u001d\u0004\u000e4B\"\u001c?5?K(r+>0q\f\u001el'+(\u007f4L%Q\u001dw+D#|b/\u0012e\u0017-d\u001eK\u000e3G9a\u0012t);\u0013\bb\u0006{YA\nl9v0%K\u001bO\fY\u0016\u001fR\u0017Y%}\u0002u\u0018\u0017q`\u001e\t{V#\u001f];\"4\u001e)\u0005_Ncu\u0013ab\nVo\u0007", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final InputTransformation filter;
    private final MutableInteractionSource interactionSource;
    private final KeyboardActionHandler keyboardActionHandler;
    private final KeyboardOptions keyboardOptions;
    private final boolean readOnly;
    private final boolean singleLine;
    private final TextFieldSelectionState textFieldSelectionState;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;

    private final TransformedTextFieldState component1() {
        return this.textFieldState;
    }

    private final MutableInteractionSource component10() {
        return this.interactionSource;
    }

    private final TextLayoutState component2() {
        return this.textLayoutState;
    }

    private final TextFieldSelectionState component3() {
        return this.textFieldSelectionState;
    }

    private final InputTransformation component4() {
        return this.filter;
    }

    private final boolean component5() {
        return this.enabled;
    }

    private final boolean component6() {
        return this.readOnly;
    }

    private final KeyboardOptions component7() {
        return this.keyboardOptions;
    }

    private final KeyboardActionHandler component8() {
        return this.keyboardActionHandler;
    }

    private final boolean component9() {
        return this.singleLine;
    }

    public static /* synthetic */ TextFieldDecoratorModifier copy$default(TextFieldDecoratorModifier textFieldDecoratorModifier, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((1 & i2) != 0) {
            transformedTextFieldState = textFieldDecoratorModifier.textFieldState;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            textLayoutState = textFieldDecoratorModifier.textLayoutState;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            textFieldSelectionState = textFieldDecoratorModifier.textFieldSelectionState;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            inputTransformation = textFieldDecoratorModifier.filter;
        }
        if ((16 & i2) != 0) {
            z2 = textFieldDecoratorModifier.enabled;
        }
        if ((32 & i2) != 0) {
            z3 = textFieldDecoratorModifier.readOnly;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            keyboardOptions = textFieldDecoratorModifier.keyboardOptions;
        }
        if ((128 & i2) != 0) {
            keyboardActionHandler = textFieldDecoratorModifier.keyboardActionHandler;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            z4 = textFieldDecoratorModifier.singleLine;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            mutableInteractionSource = textFieldDecoratorModifier.interactionSource;
        }
        return textFieldDecoratorModifier.copy(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z2, z3, keyboardOptions, keyboardActionHandler, z4, mutableInteractionSource);
    }

    public final TextFieldDecoratorModifier copy(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource) {
        return new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z2, z3, keyboardOptions, keyboardActionHandler, z4, mutableInteractionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return Intrinsics.areEqual(this.textFieldState, textFieldDecoratorModifier.textFieldState) && Intrinsics.areEqual(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && Intrinsics.areEqual(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && Intrinsics.areEqual(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && Intrinsics.areEqual(this.keyboardOptions, textFieldDecoratorModifier.keyboardOptions) && Intrinsics.areEqual(this.keyboardActionHandler, textFieldDecoratorModifier.keyboardActionHandler) && this.singleLine == textFieldDecoratorModifier.singleLine && Intrinsics.areEqual(this.interactionSource, textFieldDecoratorModifier.interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((this.textFieldState.hashCode() * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31;
        InputTransformation inputTransformation = this.filter;
        int iHashCode2 = (((((((iHashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.keyboardOptions.hashCode()) * 31;
        KeyboardActionHandler keyboardActionHandler = this.keyboardActionHandler;
        return ((((iHashCode2 + (keyboardActionHandler != null ? keyboardActionHandler.hashCode() : 0)) * 31) + Boolean.hashCode(this.singleLine)) * 31) + this.interactionSource.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.textFieldState + ", textLayoutState=" + this.textLayoutState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", filter=" + this.filter + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActionHandler=" + this.keyboardActionHandler + ", singleLine=" + this.singleLine + ", interactionSource=" + this.interactionSource + ')';
    }

    public TextFieldDecoratorModifier(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z2;
        this.readOnly = z3;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z4;
        this.interactionSource = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldDecoratorModifierNode create() {
        return new TextFieldDecoratorModifierNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        textFieldDecoratorModifierNode.updateNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource);
    }
}
