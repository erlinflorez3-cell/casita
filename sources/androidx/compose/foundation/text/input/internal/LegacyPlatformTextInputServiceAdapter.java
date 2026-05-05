package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
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
/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u0006\u0007nj?5J\u0004^\u008c\u0003SX\u000e$zAd^ҸuCIUb\u00020\u000fgN\u0016n7Vh\u0013[\u000f4\u001d)n:Rmx\f\u0014W6PyW3{v\u0006?n\u007fN\u0005N9h\\B\u0011\u000f&BH>}+GY\u0015*0nr\u000br\u001bP\u001d\u001c(\u0005l\"1$jhf8^k\f<mcY݈NĚ+e8ŧe\u000fLX5\u0012ȡe,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[7U(kS|J\u001c\u0001Z!]\u000f\u0016\u0010iP\u0012nQH#\u0006,%\u00017s\u0010\f#c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h'3|\u00178ZK*kG-xqlI\u0016Q,[\b+EL$", "u(E", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[7U(kS|J\u001c\u0001Z!]\u000f\u0016\u0010iP\u0012nQH#\u0006,%\u00017s\u0010\f#L\u001cjr>T$2\u0001\u0011\u0005B3uNH_\rV%Nm:sti\u001c\\\u0010", "BdgA<5Ic(f\u0005]0}\r/rh2z@", "5dc!X?M7\"\n\u000bm\u0014\u0007\b3f\u0004(\t)\u000b\u0016\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju5v)CJb\u0017cN\u0002>\u001e\u001fb|N>\u001chbL4}27,\u00190G\u0002\u0017g|\u0017%\u000eB)WBX\fE\u000e\u007f|=8iPfghGTTF3o\u001cn\u0006f9:y", "6hS2F6?b+z\b^\u0012|\u001d,o{5z", "", "@dV6f;>`\u0001\tyb-\u0001\t<", "<nS2", "Ag^DF6?b+z\b^\u0012|\u001d,o{5z", "AsP?g\u001aMg \u000f\tA(\u0006\bAr\u00047\u007fI\u0003", "Cma2Z0Lb\u0019\fbh+\u0001\n3e\r", "\u001adV.V@)Z\u0015\u000e{h9\u0005w/x\u000f\f\u0005K\u0011&\u007fQn\u000e", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {
    public static final int $stable = 8;
    private LegacyPlatformTextInputNode textInputModifierNode;

    /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkA0ZeP.XT2\u000f\u0002{<$a%yCQU\"}(\nWN}gvϺb\u000bY\u000f\u000e\u0016\u000fj4Ikxe\u0012\u001d1JoU3UoC9fYLӌP2P7B;\u000f.BJ&u)X{1 FX\u0012@Q\u001dO\u0015\u001a@\u001eN(\u0011$li^6v\u0007\fS?'\u0013kXMU^^\u0014֔\u0011FZBS\u001bҐ\"+NS\u0006'3S\u001b\thZm\u0004\u0016ѣ?ݾl+?-Oue9)\u0012\"\u0019CQ#\\!+3ԋSԃ\u0010+CQiQ^\u0015x\n\t\u0004%>\u001a\r40\u001fͺ/բj\f&5z|aK!\u0014lN\u0018|w5E2Vĸ-ݰ\u001fjicA'\\FL\u0015\u001b.;\u0001\u001d22ڑ\u0010\u05ce\u0019\u001flyWC_SعGݐ˦YAu\u0006v\u00020)˟4dŊ3z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[7U(kS|J\u001c\u0001Z!]\u000f\u0016\u0010iP\u0012nQH#\u0006,%\u00017s\u0010\f#L\u001cjr>T$2\u0001\u0011\u0005B3uNH_\rV%Nm:sti\u001c\\\u0010", "", ":`h<h;\u001c]#\fyb5x\u0018/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u0019T@Hc(\\\u0005h9{\r8a\u000f(\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", ":dV.V@-S,\u000e[b,\u0004\b\u001dt{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", "5dc\u0019X.:Q-mzq;]\r/l~\u0016\u000b<\u0010\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7|.O?9\u007f#\u001e(wB=\u0007j+<\u0006#VL$", "AnUAj(KS~~\u000f[6x\u0016.C\n1\u000bM\u000b\u001e\u001eG|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#c~/Ii#.3COh>\u001a\"g?C\u0010r9X}.GY$", "5dc b-Me\u0015\fzD,\u0011\u00069a\r'YJ\n&$Qv\u0015<\u0004", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#k*8|(*ZC!kH\u001b\u001fdn8dm5]\u00041NSN92", "BdgA90>Z\u0018lze,z\u00183o\t\u0010wI|\u0019\u0017T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHgg,Uu\u0015GSN*kV|F{\u000ec\nP+\u001aZ", "5dc!X?M4\u001d~\u0002]\u001a|\u0010/c\u000f,\u0006Ih\u0013 Cq\u000eI", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2P9\u001ar\rRv.F:N3\\P\u0002A\u001e\u001bB\nW'\u000f\u0005f\u0017", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", ":`d;V/-S,\u000e^g7\r\u0018\u001de\u000e6\u007fJ\n", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp'\u0007q:R\u00010\u001d", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc\u001es =TGD~}\u001c\u001fukI\u0016g5N\u0005p,VK\u0002", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface LegacyPlatformTextInputNode {
        LayoutCoordinates getLayoutCoordinates();

        LegacyTextFieldState getLegacyTextFieldState();

        SoftwareKeyboardController getSoftwareKeyboardController();

        TextFieldSelectionManager getTextFieldSelectionManager();

        ViewConfiguration getViewConfiguration();

        Job launchTextInputSession(Function2<? super PlatformTextInputSession, ? super Continuation<?>, ? extends Object> function2);
    }

    public abstract void startStylusHandwriting();

    protected final LegacyPlatformTextInputNode getTextInputModifierNode() {
        return this.textInputModifierNode;
    }

    public final void registerModifier(LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (this.textInputModifierNode != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null".toString());
        }
        this.textInputModifierNode = legacyPlatformTextInputNode;
    }

    public final void unregisterModifier(LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (this.textInputModifierNode != legacyPlatformTextInputNode) {
            throw new IllegalStateException(("Expected textInputModifierNode to be " + legacyPlatformTextInputNode + " but was " + this.textInputModifierNode).toString());
        }
        this.textInputModifierNode = null;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }
}
