package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4M\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:#qҕ\"CiTZ)2\r]N\u007fg\u001dKj\u000fQ\u0011\u001e\u0016'k<Mc{u\u0012=3RsM7eok:pxD\n82P9ѩ\t\u0001(0\u0011!\u0005\t[K:!`F~Jj\u000fc\u0004H\u0011L̛ I$jxf6v~$Nw)\u0011|ZNUsv\u0011\u001e$TT?\r%bՕ*¨̳4\u0014ȏW\u000b\u000fRiH\u001bAwD\u0013pw>9N\fWdYŕ\u0013ƃܹN\fǁv.d\u0005_i$)1YqS!%6{\u0013{;=ɂ\rͺТG-ǉ\u001en\u0010\u000eA}\u000bUF[\u0010f\u0013\u0017\tdN\u0017S\u0001Ɗ*ݍՎePň?!V7\n\u000e% )\r|),k\u001cb-\u001b\u0003xϼ0҅ή<Gݳ\u000eaEm\u0012yz\u00040\u0011>OČ/\u0005\u00191\u001dÈS\n8+!q!үH|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r J|\u001e.VS\u0005I>'$htHnc5^T1NV[:2", "", "0`R8Z9Hc\"}Xh3\u0007\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "BdgA66E]&", "7b^;66E]&", "2hb.U3>R\b~\u000em\n\u0007\u00109r", "2hb.U3>R||\u0005g\n\u0007\u00109r", "uI9\u0017=\u0011%Y#\u000e\u0002b5F\u000e@mI,\u0005O\u0001$ CvW\u001bv&1i\u0005/\u0015w\u001f<\\PKiC(\"P]F\rc9$:\u0018", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\roF?R\u0011|L_", "u(9", "\u0018", "5dc\u0011\\::P ~yB*\u0007\u0012\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\u0011\\::P ~yM,\u0010\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\u0016V6G1#\u0006\u0005ksG\b\u0001_e-k", "5dc!X?M1#\u0006\u0005ksG\b\u0001_e-k", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextMenuColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long iconColor;
    private final long textColor;

    public /* synthetic */ ContextMenuColors(long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6);
    }

    private ContextMenuColors(long j2, long j3, long j4, long j5, long j6) {
        this.backgroundColor = j2;
        this.textColor = j3;
        this.iconColor = j4;
        this.disabledTextColor = j5;
        this.disabledIconColor = j6;
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m676getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m680getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m679getIconColor0d7_KjU() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m678getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m677getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
        return Color.m4179equalsimpl0(this.backgroundColor, contextMenuColors.backgroundColor) && Color.m4179equalsimpl0(this.textColor, contextMenuColors.textColor) && Color.m4179equalsimpl0(this.iconColor, contextMenuColors.iconColor) && Color.m4179equalsimpl0(this.disabledTextColor, contextMenuColors.disabledTextColor) && Color.m4179equalsimpl0(this.disabledIconColor, contextMenuColors.disabledIconColor);
    }

    public int hashCode() {
        return (((((((Color.m4185hashCodeimpl(this.backgroundColor) * 31) + Color.m4185hashCodeimpl(this.textColor)) * 31) + Color.m4185hashCodeimpl(this.iconColor)) * 31) + Color.m4185hashCodeimpl(this.disabledTextColor)) * 31) + Color.m4185hashCodeimpl(this.disabledIconColor);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) Color.m4186toStringimpl(this.backgroundColor)) + ", textColor=" + ((Object) Color.m4186toStringimpl(this.textColor)) + ", iconColor=" + ((Object) Color.m4186toStringimpl(this.iconColor)) + ", disabledTextColor=" + ((Object) Color.m4186toStringimpl(this.disabledTextColor)) + ", disabledIconColor=" + ((Object) Color.m4186toStringimpl(this.disabledIconColor)) + ')';
    }
}
