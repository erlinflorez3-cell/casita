package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.Soundex;
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
/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\r(4\u0012}\tnjO0LeN.ZS@\u000fs{:%c$\u007fOCU ~*\teNogtXb\u000bY\u000f\u000e\u0016~j4Ikxe\u0012\u00153JoM<UoC:fҚLӌP2P7:8\u0011\u001e8H(v)D[\u0010 2XphU\u001dQ\u0013\u001e*\u0006l#\u0011\"jlf6vom>=)\u001bipQ7c>\u0004e\rt\\ܮ\u0011vo'sLEX-%\u0002'7Vid\u001b? @M|5MCI\"~f\\\u000e<-+}\u0010\u000ev4\u0006\u001dQ\u000f\u000fo7]\u000ecP<S(~\n9T\u0004<ͺoN<Z2f6\u001dy\tCeNZ\u001a^p\u000b1\"\rА'ő7/Q\u001dl]oHi]E\n\u001d\rL273Ĳ_X&b\u001b+b\t\"@_RUH|\u001d\u0010\u0002ъ\btz\u00040\u0018>\\P>\n\u0016F\u0017S:٦=))ǽ\u001aJJ}\u0005\u001c1waojHn%å\u001a=2\u009e$\\J|\u0013\u0003!cf0)MJWΘ\u0002\u000e\u001b\u05fetyB:3'\u001f^vi\u0003M\f\u000bɻ3l?ժ\u0007m\u0014qGy\u0004D_e(a\u0001y݀CBjڳphHo\u001aq-:0O`j>\u00032\u0005%ۿ\u0015\u0558Cu462O'ieW\u0011%ZA+\u0011ރ^n\u0018зl5*\"wDE\u0018\u000fqtp\u001ej/\u000eض\u0001d:/GsC0ňYP"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'+UO62", "", "Ad[2V;:P ~^]", "", "Ak^A", "", "@`f g(Kb{z\u0004]3|r0f\u000e(\u000b", "@`f\u0012a+!O\"}\u0002^\u0016}\n=e\u000f", "@`f\u001de,OW#\u000f\tA(\u0006\b6ei)|N\u0001&", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "uI8\u0016<\u0010%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWKv8D#l J||*aMKz!\u001e#xhH\\'\u001d", "3mS\u001fh5\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "5dc\u0012a++c\"]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i$m$8TT;j#\u001e(w@=\u0014c*]z1P\"", "7m_Bg\u001b>f(", "", "5dc\u0016a7Nb\b~\u000em", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "@`f\u0010e6La\u0007\u000evm<\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=grukG\u0015Q;J\u00067U\"", "5dc\u001fT>\u001c`#\r\tL;x\u0018?s", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2?F\u0011q:<\u0006#V\\\\\u0002", "5dc\u001fT>\u001e\\\u0018avg+\u0004\t\u0019f\u00016{O", "u(8", "5dc\u001fT>)`\u0019\u0010~h<\u000bk+n~/{*\u0002\u0018%G~", "5dc\u001fT>,b\u0015\f\nA(\u0006\b6ei)|N\u0001&", "5dc X3>Q(zwe,`\b", "u(9", "5dc _6M", "AsP?g\u0019N\\w\u0003\b^*\f\r9n", "5dc g(Kb\u0006\u000f\u0004=0\n\t-t\u00042\u0005", "5dc!X?M:\u0015\u0013\u0005n;i\t=u\u00077", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=:CI{;-j", "BdgA?,GU(\u0002", "5dc!X?M:\u0019\b|m/", "/mR5b9\u001f]&h{_:|\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007fe#UL/f_VF\u0015\u001c0", "=eU@X;", ";`Z2F0GU ~aZ@\u0007\u0019>S\u007f/{>\u0010\u001b!P", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "AsP?g", "3mS", "Ag^B_++S\u0017\t\u0003i<\f\t\u001de\u0007(yO\u0005! ", "", "=sW2e", "BnBAe0GU", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectableInfo {
    public static final int $stable = TextLayoutResult.$stable;
    private final int rawEndHandleOffset;
    private final int rawPreviousHandleOffset;
    private final int rawStartHandleOffset;
    private final long selectableId;
    private final int slot;
    private final TextLayoutResult textLayoutResult;

    public SelectableInfo(long j2, int i2, int i3, int i4, int i5, TextLayoutResult textLayoutResult) {
        this.selectableId = j2;
        this.slot = i2;
        this.rawStartHandleOffset = i3;
        this.rawEndHandleOffset = i4;
        this.rawPreviousHandleOffset = i5;
        this.textLayoutResult = textLayoutResult;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final String getInputText() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    public final int getTextLength() {
        return getInputText().length();
    }

    public final CrossStatus getRawCrossStatus() {
        int i2 = this.rawStartHandleOffset;
        int i3 = this.rawEndHandleOffset;
        if (i2 < i3) {
            return CrossStatus.NOT_CROSSED;
        }
        if (i2 > i3) {
            return CrossStatus.CROSSED;
        }
        return CrossStatus.COLLAPSED;
    }

    private final ResolvedTextDirection getStartRunDirection() {
        return SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawStartHandleOffset);
    }

    private final ResolvedTextDirection getEndRunDirection() {
        return SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawEndHandleOffset);
    }

    public final boolean shouldRecomputeSelection(SelectableInfo selectableInfo) {
        return (this.selectableId == selectableInfo.selectableId && this.rawStartHandleOffset == selectableInfo.rawStartHandleOffset && this.rawEndHandleOffset == selectableInfo.rawEndHandleOffset) ? false : true;
    }

    public final Selection.AnchorInfo anchorForOffset(int i2) {
        return new Selection.AnchorInfo(SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, i2), i2, this.selectableId);
    }

    public final Selection makeSingleLayoutSelection(int i2, int i3) {
        return new Selection(anchorForOffset(i2), anchorForOffset(i3), i2 > i3);
    }

    public String toString() {
        return "SelectionInfo(id=" + this.selectableId + ", range=(" + this.rawStartHandleOffset + Soundex.SILENT_MARKER + getStartRunDirection() + AbstractJsonLexerKt.COMMA + this.rawEndHandleOffset + Soundex.SILENT_MARKER + getEndRunDirection() + "), prevOffset=" + this.rawPreviousHandleOffset + ')';
    }
}
