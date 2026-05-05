package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
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
/* JADX INFO: compiled from: LegacyAdaptingPlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.X^2\u000fy\u0005<řc$\u007fّC٥\"}0\u000fWȞog|VbŏK\u000f\u0014\u0016\u0001j2I]xs\u0012\u0017˰HĦEIݹ CIb\u000563 `!x\u0015\u0015\u0005(+`\u0010%|SO\u001a\u0015H@\u001f>b\u0011[\n2\u00124Dŋ\u0005\u001ejn\u0017=Vzu:]%IފC\u0017.m?\u0015M;J\u001bݒ\u000e?h,;X7c\u001bkڌ\u0004OwiP\u001b? ܵ5n-'9J\fWdZ0\u001a\u001b+]\u0010urT`5Wf\f50gcyVT\u0090vC\u0002\u001bN\u001c\u000e4'\u000fBu+t\u001b&3#\u0007\u0004F^\u0017vD\u0016y\u0010L]Բ\u0001{2G2~Q\u0010S_آ6D\f\u001b7;\u0001\u001d;\"ہ\r)#)o\u0010Q_mpAVk\"YkmJ\u0005+\f8\"HG.K$\u0011\\6kK,H1$\u0004\u0002vHϼz\u000bhåkkXPN+?%E+!\f\tF\u0081\tqXӹp.\u0017W*_W\r\u0016\u00188\\&BƼ)\u0016Vи\u0001kpYk\u0017ʁ3\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[(M(gavF\u0016|a\n],\u0017\u0012a0$\u0002S\u001b(\u0013<XiEg\u0005\r\u001a\u000eB@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[(M(gavF\u0016|a\n],\u0017\u0012a0$\u0002S\u001b(\u0013<XiEg\u0005\r\u001a\u000eBSzAVe", "AdaC\\*>/\u0018z\u0006m,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PJ,Pr%[7U(kS|J\u001c\u0001Z!]\u000f\u0016\u0010iP\u0012nQH#\u0006,%\u00017s\u0010\f#c", ":dV.V@-S,\u000e[b,\u0004\b\u001dt{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", "BdgA90>Z\u0018lze,z\u00183o\t\u0010wI|\u0019\u0017T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHgg,Uu\u0015GSN*kV|F{\u000ec\nP+\u001aZ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u0013Nx#E`93XasG!\u001aI\u000ea:p\u000edQ3\\DD0\f*I]:d\f\u001b\u0016\u001b\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bFl:m\u000b[,`DCm#q,*27.\fwQ%aR\rvHK\u0019\u00027\u0012MijF\u001bVQEs4)Oz\u000b[0b|6~;\u0004}+@t\u000eJc'Bh\u0002^;\\T6oD<\u001a?IryvGWW\u001ft\u0017nf58\u0018SejH\r\u0016a!d\u001d]h|9R\u0013\u0014\r`", "5dc\u0019X.:Q-mzq;]\r/l~\u0016\u000b<\u0010\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7|.O?9\u007f#\u001e(wB=\u0007j+<\u0006#VL$", "5dc X9OW\u0017~V](\b\u0018/r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju5v)CJb\u0017cN\u0002>\u001e\u001fb|N>\u001chbL4}27,\u00190G\u0002\u0017g|\u0017%\u000eB@", "5dc!X?M4\u001d~\u0002]\u001a|\u0010/c\u000f,\u0006Ih\u0013 Cq\u000eI", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2P9\u001ar\rRv.F:N3\\P\u0002A\u001e\u001bB\nW'\u000f\u0005f\u0017", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "1qT.g,", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class LegacyAdaptingPlatformTextInputModifier extends ModifierNodeElement<LegacyAdaptingPlatformTextInputModifierNode> {
    private final LegacyTextFieldState legacyTextFieldState;
    private final LegacyPlatformTextInputServiceAdapter serviceAdapter;
    private final TextFieldSelectionManager textFieldSelectionManager;

    public static /* synthetic */ LegacyAdaptingPlatformTextInputModifier copy$default(LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, int i2, Object obj) {
        if ((1 & i2) != 0) {
            legacyPlatformTextInputServiceAdapter = legacyAdaptingPlatformTextInputModifier.serviceAdapter;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            legacyTextFieldState = legacyAdaptingPlatformTextInputModifier.legacyTextFieldState;
        }
        if ((i2 & 4) != 0) {
            textFieldSelectionManager = legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager;
        }
        return legacyAdaptingPlatformTextInputModifier.copy(legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager);
    }

    public final LegacyPlatformTextInputServiceAdapter component1() {
        return this.serviceAdapter;
    }

    public final LegacyTextFieldState component2() {
        return this.legacyTextFieldState;
    }

    public final TextFieldSelectionManager component3() {
        return this.textFieldSelectionManager;
    }

    public final LegacyAdaptingPlatformTextInputModifier copy(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return new LegacyAdaptingPlatformTextInputModifier(legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.areEqual(this.serviceAdapter, legacyAdaptingPlatformTextInputModifier.serviceAdapter) && Intrinsics.areEqual(this.legacyTextFieldState, legacyAdaptingPlatformTextInputModifier.legacyTextFieldState) && Intrinsics.areEqual(this.textFieldSelectionManager, legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.serviceAdapter.hashCode() * 31) + this.legacyTextFieldState.hashCode()) * 31) + this.textFieldSelectionManager.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serviceAdapter + ", legacyTextFieldState=" + this.legacyTextFieldState + ", textFieldSelectionManager=" + this.textFieldSelectionManager + ')';
    }

    public final LegacyPlatformTextInputServiceAdapter getServiceAdapter() {
        return this.serviceAdapter;
    }

    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    public LegacyAdaptingPlatformTextInputModifier(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.serviceAdapter = legacyPlatformTextInputServiceAdapter;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LegacyAdaptingPlatformTextInputModifierNode create() {
        return new LegacyAdaptingPlatformTextInputModifierNode(this.serviceAdapter, this.legacyTextFieldState, this.textFieldSelectionManager);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode) {
        legacyAdaptingPlatformTextInputModifierNode.setServiceAdapter(this.serviceAdapter);
        legacyAdaptingPlatformTextInputModifierNode.setLegacyTextFieldState(this.legacyTextFieldState);
        legacyAdaptingPlatformTextInputModifierNode.setTextFieldSelectionManager(this.textFieldSelectionManager);
    }
}
