package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: TextFieldTextLayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u0018sڔ<$q$yCQU\"}8\tWN}gvJp\u000bK\u000f\f\u0016\u0001j:I]xs\u0012\u00172HwG3[ڎEʠhtD\u000b(݅*8\b\u0011\t\u001a0I\u0018v\u0011CSÈ\u0018ؔF\u0007í\u0003\u0013]\u0007*\u00124>N\u007f^8wRDI\u0005]h13\u0007wEf'\u000e4\rQ\u001bKl';|q\"9GO5C-c7\u0015[so\u0013A\u0002=3s7@;`\u0004[FZ\u0016\u0013C8}\u0019ǁv0b\u0013af\u00126;QiQv\u001e8y\u000b{;M\u001a\r41ρ2- xڿ\u00123\u0003\u0006\u001cG^\u0016vB.|(٪\u0018m\u0007A@Q\u001b\u0015U(ޥ\u001a\u0017>\n\u001b%\u001eQ\u00075Œ\\\u001d\u0015n,3T&YwӈA\u0006\u007f\\\"qm}\u0006\u0001b05\u0014IW\u0017?\u007f!0-$ehg/\u074co\fNRw|\u000boxUoXnP2p&7X\u001a\"YrnʰoPZjrӍNd>\u0015\u0017 \u0013Nο(B'%\u001eOgh\u0018l}c\u0010%=iOY\u001do>]?^A:ic>g\u0003|\u001a?Ji\u001dX\u0015J\u0004B`\\6+Jxz\u0012\b{rY\u001c,BV\u0002 D.G\u0018\u000b\"v\u000fٿFK\u0003\u0017o`n\u001f\u000fV9*)y4v\u0019\u0001~m\u0007n\u0016\u0003ͅ0|f4sܒP}\u001f4o:hb|i\u001bG\u0005\u000eb\u007fLuT\u001d\u001c\u0004q\u0014\",\u0019gnu̢\u0014W\u00067P\u001a-sk9УP\u0016\u00195\u001b\u0015y=\\/\u0602fPx~Nxjx`\u0005\u001b0\u001avrQ\b+\u0014BkT\u001f_c\u0003\u001c\u0004>w\u0018Im\r\u000bF\u0006\u001dO.'\u0011oP\bEFS>-\u001a\b\u0016E\u0014\u0010j\u0018{Ц}l\u00154\u0005k\n;s\u0018uhwmB=HI\b\u0010T!RvúFHp\n^Ⱥ\u000bΌ\u00113PШ5|d?e\u000b]\u0006=\u0081.ޛtVcƥc{\f7F_Xw\u001a͢\u0016ڎG%\u0019\u07bd$s{nc\\9Leϛ\r֭5n\u001aΒ\u000e,d\\z\t^\fJ̻8װ?b\rµʨ(Z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+KR\u0006Lz\u000en\u0018^:t\u000fXE%rDDt", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+KR\u0006Lz\u000en\u0018^:t\u000fXE%rDD\b\u0012+IW", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "Ah]4_,%W\"~", "", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "5dc\u001fX:NZ(", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001bN\n6.Hb6la`L\u0010!Zc5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\r \u001e>ilQZ\u001aPC$uT82Jbj\nV\u000bIk9d\u0019h\u0019c\u0004)1\u0010z'\u001cr]6\nzB\u0011\u0006aZkgN\u0018hG Mm1-AxTI~+\u001e^Eu\u001c:c~9tv\u00148sEd\u0018Z1\u0007>q\b\u0003;pH'{+#\u0019IZjyu\b\u0013y'+\t\u001ek3@\u001donq\u0012o\u0017f\u0015j9khM\r\u0016v", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldTextLayoutModifier extends ModifierNodeElement<TextFieldTextLayoutModifierNode> {
    public static final int $stable = 0;
    private final Function2<Density, Function0<TextLayoutResult>, Unit> onTextLayout;
    private final boolean singleLine;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final TextStyle textStyle;

    private final TextLayoutState component1() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component2() {
        return this.textFieldState;
    }

    private final TextStyle component3() {
        return this.textStyle;
    }

    private final boolean component4() {
        return this.singleLine;
    }

    private final Function2<Density, Function0<TextLayoutResult>, Unit> component5() {
        return this.onTextLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextFieldTextLayoutModifier copy$default(TextFieldTextLayoutModifier textFieldTextLayoutModifier, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            textLayoutState = textFieldTextLayoutModifier.textLayoutState;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            transformedTextFieldState = textFieldTextLayoutModifier.textFieldState;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            textStyle = textFieldTextLayoutModifier.textStyle;
        }
        if ((8 & i2) != 0) {
            z2 = textFieldTextLayoutModifier.singleLine;
        }
        if ((i2 & 16) != 0) {
            function2 = textFieldTextLayoutModifier.onTextLayout;
        }
        return textFieldTextLayoutModifier.copy(textLayoutState, transformedTextFieldState, textStyle, z2, function2);
    }

    public final TextFieldTextLayoutModifier copy(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2) {
        return new TextFieldTextLayoutModifier(textLayoutState, transformedTextFieldState, textStyle, z2, function2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return Intrinsics.areEqual(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && Intrinsics.areEqual(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && Intrinsics.areEqual(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.singleLine == textFieldTextLayoutModifier.singleLine && Intrinsics.areEqual(this.onTextLayout, textFieldTextLayoutModifier.onTextLayout);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((((this.textLayoutState.hashCode() * 31) + this.textFieldState.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
        Function2<Density, Function0<TextLayoutResult>, Unit> function2 = this.onTextLayout;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", onTextLayout=" + this.onTextLayout + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTextLayoutModifier(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2) {
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textStyle = textStyle;
        this.singleLine = z2;
        this.onTextLayout = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldTextLayoutModifierNode create() {
        return new TextFieldTextLayoutModifierNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode) {
        textFieldTextLayoutModifierNode.updateNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }
}
