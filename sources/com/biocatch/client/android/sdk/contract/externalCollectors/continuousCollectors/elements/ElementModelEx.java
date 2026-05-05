package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.elements;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r.4\u0012}\u000enjG9LeNWXݾ0%ӆ,4RZdUS?c\u001a\u0016\"7P^kupbZ9F\u001f\n$|\u0003,wX\ta \u0014JB\u001eBCQ}CQ`#7\u0015$@)Py3\u0002*.V\u0018\u000fzqL\u001c\u0016>I\t:\u0001\u000e]\t(\u001c\u001e>N\u0004.`uYNH\u001b`J31\u000f\u0002B|4o4\u000b[%F\u00034˼za,:\t>C<=S1\b\u0019Ā@KF\u007fe\u001dhU*qʥt =f),\u0015Y\\Sǥsnc\u0013{x\fU8\u0016ӱL\u0019\u00156#\u0013{;?Jف\u0007oO<Y2f6\u0011yІs\u001cG^/vB.}(ٮ\u0018m\u0007AYQ\u001b\u0015R(ީ\u001a\u0017>\n4%\u001eQ\u00025Ŗ\\\u001d\u0015nE3T&RwӌA\u0006O\\;q=\u001c\u00057Į\u0003r\u000b>y\u0018/*\u0014tЖ&\u007fم81T\u0004\u0002vֳ\u0018|\u000b`vS\u0002RvARt\u001c78\u000b$Zrg5qVTf0)MJW7\u0004\u000e\u0013.a\u0010<O(@TUhwpe]8&_l=Y|r&Wg_c;Wc\u001eijvB@lh\u000bXtKk\f\t]X(8Hx\u001a\u0010{rQ<\u00198?\u007f'L,_\u001c\r\u001bN\u0003,NY|7l\u000bn\u0016~bA<\u0003\u00181;֮\u007f\u0019m~$\u007fxw9-f0bYSK\u0018TThؒ5E*\u00155\f\u007fuh\u0013ݘK5\u001d\u0004\r\u0014 D\u001d\u007f\u05ee.\u000e+\u001d\u0003A200\u001cɪ~ϯUY\u001a\u05fd\u0013~\u007f\u001fIyNi\u000e|~?1\u0003XZl\u0017Py5з/ϋh\f\u0002ӓ^|Mwb\u001c{@O\b\u0011l\r]F|\u001d\u001fL&˽s(\u0005ކEE-3$\u000fd>#jui\u001e/ԃf\u0015.۩}\u00062{$\u00073ik@S8wfUН.ٝp\u000fJו\u0003y\u000eP\u0017M-5N[r\f'P[\u0011G}\u0015\b\u0003ݿ|Æ_F\u001b̊\u001664{8\u000bc\u007f\u001a{QCaeas\u0006myiaͮ\u001bϻ\u000f\b9ޫ*\u001eC?dp\u0003\u000b6&\u00023\u0007PId\u001d<7'Ҭ0B\u0010Ձ[Vo'\u001e\fPUm\u0019/2pvŌZ\u0014\\ۿtXN'nV198\b\u0017\u000fa\u001fO߽=ܭqR\\Џ{4\u0007v+ ;lU#tC{Sb>3(\u0007\u0004խIcK̲\u001a8\nl7~<~\u001a@0|KCɓ\u001f?YΙwx6\u0005\u0019l͍R\u001d"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005h\b\f\u001e\u000e>y~\f6\u0017G\u0002\u0015~P\u0011rEYfYZ\u0017", "", "6`b5", "", "B`V\u001bT4>", "", "3kT:X5M7w", "Bx_2", ":dUA", "Bn_", "EhSA[", "6dX4[;", "Bn^9g0I", "3kT:X5MD\u0015\u0006\u000b^", "@d\\<i,)`\u001d\u0010vm,[\u0005>a", "", "7rC2k;/W\u0019\u0011", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"2\u0010@6YB\u0010#VWU'\u0016\u0007#/3{H@!]\u0013N}LdJ\u0013\u0012\u001774^Qc\u0014P{jj6lY", "5dc\u0012_,FS\"\u000e^=", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012_,FS\"\u000e^=", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0012_,FS\"\u000ekZ3\r\t", "Adc\u0012_,FS\"\u000ekZ3\r\t", "5dc\u0015T:A", "u(8", "5dc\u0015X0@V(", "u(I", "Adc!X?MD\u001d~\r", "uY\u0018#", "5dc\u0019X-M", "Adc\u0019X-M", "uH\u0018#", "5dc\u001fX4Hd\u0019i\bb=x\u0018/D{7w", "Adc\u001fX4Hd\u0019i\bb=x\u0018/D{7w", "5dc!T.'O!~", "5dc!b6Eb\u001d\n", "5dc!b7", "Adc!b7", "5dc!l7>", "5dc$\\+MV", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementModelEx {
    private String elementID;
    private String elementValue;
    private final int hash;
    private final int height;
    private boolean isTextView;
    private int left;
    private boolean removePrivateData;
    private final String tagName;
    private final String tooltip;
    private int top;
    private final String type;
    private final int width;

    public ElementModelEx(int i2, String tagName, String elementID, String type, int i3, int i4, int i5, int i6, String tooltip, String elementValue, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(elementID, "elementID");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(elementValue, "elementValue");
        this.hash = i2;
        this.tagName = tagName;
        this.elementID = elementID;
        this.type = type;
        this.left = i3;
        this.top = i4;
        this.width = i5;
        this.height = i6;
        this.tooltip = tooltip;
        this.elementValue = elementValue;
        this.removePrivateData = z2;
        this.isTextView = z3;
    }

    public static /* synthetic */ ElementModelEx copy$default(ElementModelEx elementModelEx, int i2, String str, String str2, String str3, int i3, int i4, int i5, int i6, String str4, String str5, boolean z2, boolean z3, int i7, Object obj) {
        if ((i7 + 1) - (1 | i7) != 0) {
            i2 = elementModelEx.hash;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 2)) != 0) {
            str = elementModelEx.tagName;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 4)) != 0) {
            str2 = elementModelEx.elementID;
        }
        if ((i7 + 8) - (8 | i7) != 0) {
            str3 = elementModelEx.type;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 16)) != 0) {
            i3 = elementModelEx.left;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 32)) != 0) {
            i4 = elementModelEx.top;
        }
        if ((i7 + 64) - (64 | i7) != 0) {
            i5 = elementModelEx.width;
        }
        if ((128 & i7) != 0) {
            i6 = elementModelEx.height;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 256)) != 0) {
            str4 = elementModelEx.tooltip;
        }
        if ((512 & i7) != 0) {
            str5 = elementModelEx.elementValue;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 1024)) != 0) {
            z2 = elementModelEx.removePrivateData;
        }
        if ((i7 + 2048) - (i7 | 2048) != 0) {
            z3 = elementModelEx.isTextView;
        }
        return elementModelEx.copy(i2, str, str2, str3, i3, i4, i5, i6, str4, str5, z2, z3);
    }

    public final int component1() {
        return this.hash;
    }

    public final String component10() {
        return this.elementValue;
    }

    public final boolean component11() {
        return this.removePrivateData;
    }

    public final boolean component12() {
        return this.isTextView;
    }

    public final String component2() {
        return this.tagName;
    }

    public final String component3() {
        return this.elementID;
    }

    public final String component4() {
        return this.type;
    }

    public final int component5() {
        return this.left;
    }

    public final int component6() {
        return this.top;
    }

    public final int component7() {
        return this.width;
    }

    public final int component8() {
        return this.height;
    }

    public final String component9() {
        return this.tooltip;
    }

    public final ElementModelEx copy(int i2, String tagName, String elementID, String type, int i3, int i4, int i5, int i6, String tooltip, String elementValue, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(elementID, "elementID");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(elementValue, "elementValue");
        return new ElementModelEx(i2, tagName, elementID, type, i3, i4, i5, i6, tooltip, elementValue, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElementModelEx)) {
            return false;
        }
        ElementModelEx elementModelEx = (ElementModelEx) obj;
        return this.hash == elementModelEx.hash && Intrinsics.areEqual(this.tagName, elementModelEx.tagName) && Intrinsics.areEqual(this.elementID, elementModelEx.elementID) && Intrinsics.areEqual(this.type, elementModelEx.type) && this.left == elementModelEx.left && this.top == elementModelEx.top && this.width == elementModelEx.width && this.height == elementModelEx.height && Intrinsics.areEqual(this.tooltip, elementModelEx.tooltip) && Intrinsics.areEqual(this.elementValue, elementModelEx.elementValue) && this.removePrivateData == elementModelEx.removePrivateData && this.isTextView == elementModelEx.isTextView;
    }

    public final String getElementID() {
        return this.elementID;
    }

    public final String getElementValue() {
        return this.elementValue;
    }

    public final int getHash() {
        return this.hash;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final boolean getRemovePrivateData() {
        return this.removePrivateData;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public final String getTooltip() {
        return this.tooltip;
    }

    public final int getTop() {
        return this.top;
    }

    public final String getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((Integer.hashCode(this.hash) * 31) + this.tagName.hashCode()) * 31) + this.elementID.hashCode()) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.tooltip.hashCode()) * 31) + this.elementValue.hashCode()) * 31;
        boolean z2 = this.removePrivateData;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (iHashCode + r02) * 31;
        boolean z3 = this.isTextView;
        return i2 + (z3 ? 1 : z3);
    }

    public final boolean isTextView() {
        return this.isTextView;
    }

    public final void setElementID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.elementID = str;
    }

    public final void setElementValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.elementValue = str;
    }

    public final void setLeft(int i2) {
        this.left = i2;
    }

    public final void setRemovePrivateData(boolean z2) {
        this.removePrivateData = z2;
    }

    public final void setTextView(boolean z2) {
        this.isTextView = z2;
    }

    public final void setTop(int i2) {
        this.top = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ElementModelEx(hash=");
        sb.append(this.hash).append(", tagName=").append(this.tagName).append(", elementID=").append(this.elementID).append(", type=").append(this.type).append(", left=").append(this.left).append(", top=").append(this.top).append(", width=").append(this.width).append(", height=").append(this.height).append(", tooltip=").append(this.tooltip).append(", elementValue=").append(this.elementValue).append(", removePrivateData=").append(this.removePrivateData).append(", isTextView=");
        sb.append(this.isTextView).append(')');
        return sb.toString();
    }
}
