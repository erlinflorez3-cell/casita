package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: FlowLayoutOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\bnjO0L͜P.hS2şs{J$cҕyCQU\"}0\u0012WN}gvJ`$K\u000f\u001c\u0016\u0001j2Q]xk\u0012\u0017˰JoU3UڎE9vt>\u0005&5*8\u0010\u0005\t\u001a0I\u0018v\tOSÈ\u0018ؔF\u0007í\u0003\r{\u0004Z/\f̄0\u0005,\\\u007fNdI|aH1;\u0003\u0018E^+m4\u0015M;Iù+\r\u0005ff7NZM\u0015STIߘSÜC\u0003E\u0016\u0006\u0011vL?+wv\u001eͭYÿ\u0018\u00151uUi\u0001Mt\u0005\u007fcR˭,յgKV6p\u001d\t%%<2\u05fa6-N.;\u001a~\b<4%xY@^\u0004vB.}\u0012<\u001d%\u000e7C9Ii\u0018Ŭ:asE&\u001d\u000f4\"/\u001aQ_b:x\u0015Ib(U?~X=vQ:]K\u001c\u001cp\u0011\u0005pʶΥK\u007f5+YY%UO]O\"Ov2LR\u0014\u000f\u0005\u000fv\u0004m`uX\"\u001d\u0019g.\u0017:rD\u0013\b2¬ղW+ԃLȼΤ\u000b}\u000eDhm\u0006n9%>\\\u007fnw\u001ee_ $]e}ׁo4\u0015emv3cT*\u009a`\u001b+\"tTb3\u000f\u0017FaCr\\VZbNx.\u0010}ZM:\u001abE\u007f\"L.G\u0018\u000b\u001cx\u0007,{Y|7\u001a!Ӑ˦}Ԟտ(\u0005o_\u0003EI+j&\bg'\u007f\\\u0001nYEA\u007fmI*c[\u00014+]75\u0002\f_\u001a\\X\\{D\u0004ʀ\u007f*\u001c)IW5M#\u0011\u0005/X\u0013=V\\\u0002\u0014T̊\u00161\u0001\f\n\u0015Ax>i\u000ep\u0017ipnZQj\u0016P}\r\u007fiΨݦ~טӶJ|M\"bJ$rW(\u001bYj\u0005h\u0003\u0013=6'\u0017nP=e3Q-5\u0018\u000e\u0013]U\u0012aw1Fy\u0011\u001dVxs=DcD*)Гњ1ծΒM[\u0005y0f5\nP\f\u0003w6\u0007Oπ\f\u0004VOj\tXNL96Tֈ\u0013Ր\u0011p^ܪ\u000b!}\u0006L0u)\"LTйjǜ)\u0011Uω8\u0002{Ut\r`\u000e8\u0016Rυzޗ\u001bܻ\u05ebUVť\r0\u000e\u058chvOGz9L\u001a4CZJޭ\u000fMZx\u0016\u0016\u0001\u0010Va\u0015\u001dXS\u0004Lf\u001d\u0003{חZR\u000boUf':\u0011\u0001\u00159D\u000bE5\u0015o\\S]jH\u007f\u0002*_ƈvˍ\u0003f-Ľ\u0015lG.@X/\u000e\u001cؐO͕\u0006B\fڛAoq\u0004\u001aM8~#X&2\ni\u001fw\u000f0\r\u000e,̥ZЩz\u001enŚf$/\u0018\t\u0012.>\u0010)\u00190 \u0005}fEL|z\u000eƒ\u001cݨ\u001bJ1܍$~ia)BVG;?ajB*R\u07fbUȯ\u0002\u000e(é?\u0006z=jl^x\u0018o3:DtL!XƂ\u0015ц$\bFLz\u0010\u0018CXD] K\u0004)]\brN˽LӲ/l\u000eל\u001cv\u0007){nym\u0004\u0014YϢ=ٟ}n5Ǡm\u001d5mF\u0015nYh\u001c*ݳdԲ~Ǵߴ%\u001e߱\fb1ց uvp\u0004O\n\u000e\u0002ԛmˮe78ܼ6\u007f%\u001b\u0004&աT1\u001d>\\؈Z\u0013\bdlHvлb0"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u000195[J;\\(", "", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u00019\u00066_,iSyG&\u0001n\u0019N\u0001", ";h]\u0019\\5>a\b\tha6\u000ff9l\u0007$\u0007N\u0001", "", ";h]\u0010e6Lat\u0012~l\u001a\u0001\u001e/T\n\u0016~J\u0013t!Nv\nG\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u000fTMMR02\u001fxp#\u0018c9O}1Y\u000b8=\\_sD\u001e$I\"Y+bh=\u0005\u0015", "1n[9T7LS\u0001~vl<\n\u0005,l\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n[9T7LS\u0004\u0006v\\,x\u00066e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n[9T7LS\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &+x\u001d'r)B/", "5dc\u001ci,KT \t\rF,x\u0017?r{%\u0003@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7r4Ec(GR\u0015{\u0002^", "<n>3<;>['l}h>\u0006", "7sT:66N\\(", "5dc\u0016g,F1#\u000f\u0004mj}\u0013?n~$\u000bD\u000b \u0011Nk\"F\u00074/f}'7i$.", "u(8", "Adc\u0016g,F1#\u000f\u0004mj}\u0013?n~$\u000bD\u000b \u0011Nk\"F\u00074/f}'7i$.", "uH\u0018#", "7sT:F/He\"", "5dc\u0016g,FA\u001c\t\rgj}\u0013?n~$\u000bD\u000b \u0011Nk\"F\u00074/f}'7i$.", "Adc\u0016g,FA\u001c\t\rgj}\u0013?n~$\u000bD\u000b \u0011Nk\"F\u00074/f}'7i$.", "5dc\u001a\\5\u001c`#\r\t:?\u0001\u0017\u001di\u0015(jJn\u001a!YM\u0018C}!@g}^8w&7L?Jo>'\u000fo]M\u0011s;H\u0004'NLJ:\\", "5dc\u001a\\5%W\"~\tM6j\f9w]2\u0003G|\"%G.\u000fF\u0007.4U\r$Av\u00105IWE{C\u0018\"hh9\u0003q,", "5dc\u001bb\u0016?7(~\u0003l\u001a\u007f\u0013An>)\u0006P\n\u0016\u0013Vs\u0018Ep,1m\b0Fg#.TC7y4", "AdT\u001ab9>;\u0019z\tn9x\u00066e", "AdT\u001ab9>> zx^(y\u0010/", "AdT\u001ab9>A\u001d\u0014z", "5dc!l7>\u0012\u001a\t\u000bg+x\u00183o\t\"\u0003<\u0015!'Vi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w.JE}\u001b\u001a)rqHpt,[w.Q^\r\u0016mR\u007f>\u001b\u001cl|b6\rZ", "1n\\=b5>\\(J", "1n\\=b5>\\(J9_6\r\u0012.a\u000f,\u0006Iz\u001e\u0013[y\u001eKp25`}\u001cEm", "1n\\=b5>\\(K", "1n\\=b5>\\(K9_6\r\u0012.a\u000f,\u0006Iz\u001e\u0013[y\u001eKp25`}\u001cEm", "1n\\=b5>\\(L", "1n\\=b5>\\(L9_6\r\u0012.a\u000f,\u0006Iz\u001e\u0013[y\u001eKp25`}\u001cEm", "1n_F", "3k[6c:Ba|\b{h", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%w>I\u000bj+R\u007f)$SX*b`1/!\u000eemU2\u0011\u0010gE2RM8)]", "6`b\u001bX?M", ":h]2<5=S,", "Bnc._\nK]'\rVq0\u000bv3z\u007f", "3k[6c:Ba|\b{hj}\u0013?n~$\u000bD\u000b \u0011Nk\"F\u00074/f}'7i$.", "3k[6c:Ba\u0007\u0003\u0010^", "3k[6c:Ba\u0007\u0003\u0010^s]V~z\bo\u000e~\u0002!'Pn\nKz/>S\u0005\u001cKw&=GP;r4\u001a#h", "3pd._:", "=sW2e", "6`b566=S", "Adc\u001ci,KT \t\rF,x\u0017?r{%\u0003@\u000f", "", ";dP@h9>>#\u0006~\\@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001e|h]G\u0017p,9\u0001.KJb\u0002", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "Adc\u001ci,KT \t\rF,x\u0017?r{%\u0003@\u000f^^JL}?\u0002#sZ\b0@l\u0012=QMDe;\u001a)rqH\u0001p,Uv#UL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u000fTMMR8'\u0015Pa5\u0015s9Na1NPL@29nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\t7|\u000b\u001c%W\u001djlPf\u001dCv\u001cu\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018; \u0017|Z>\u0019E;\u0011n`\ntcD z\u000e\t\u0002^", "<t\\/X9(T|\u000ezf:j\f9w\t", "Adc\u001ci,KT \t\rF,x\u0017?r{%\u0003@\u000f^\b-V\u0011'g\u0019sZ\b0@l\u0012=QMDe;\u001a)rqH\u0001p,Uv#UL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u000fTMMR8'\u0015Pa5\u0015s9Na1NPL@27YC\u001e!a\u0012Wt\u0012\u0016a\u000b%~M5.\f6R\u0010\u0005I\u0011\u0015\u0014\u001d9ty\u000f,S8", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "7r7<e0S]\"\u000eve", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\t>h\u000b$@{\u001a,5C7yD+\u0011eh9\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N`=8xTFhk5X\u000f?q\u000f\u0010\u0014u5f~Rc\fD\u0001\u0015K6\u000e,7", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FlowLayoutOverflowState {
    public static final int $stable = 8;
    private Measurable collapseMeasurable;
    private Placeable collapsePlaceable;
    private IntIntPair collapseSize;
    private Function2<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable;
    private int itemCount;
    private int itemShown = -1;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private Measurable seeMoreMeasurable;
    private Placeable seeMorePlaceable;
    private IntIntPair seeMoreSize;
    private final FlowLayoutOverflow.OverflowType type;

    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ FlowLayoutOverflowState copy$default(FlowLayoutOverflowState flowLayoutOverflowState, FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            overflowType = flowLayoutOverflowState.type;
        }
        if ((i4 + 2) - (2 | i4) != 0) {
            i2 = flowLayoutOverflowState.minLinesToShowCollapse;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i3 = flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
        }
        return flowLayoutOverflowState.copy(overflowType, i2, i3);
    }

    public final FlowLayoutOverflow.OverflowType component1$foundation_layout_release() {
        return this.type;
    }

    public final int component2$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int component3$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final FlowLayoutOverflowState copy(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3) {
        return new FlowLayoutOverflowState(overflowType, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.minLinesToShowCollapse)) * 31) + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i2;
        this.minCrossAxisSizeToShowCollapse = i3;
    }

    public final FlowLayoutOverflow.OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    public final int getMinLinesToShowCollapse$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getNoOfItemsShown$foundation_layout_release() {
        int i2 = this.itemShown;
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    public final int getItemShown$foundation_layout_release() {
        return this.itemShown;
    }

    public final void setItemShown$foundation_layout_release(int i2) {
        this.itemShown = i2;
    }

    public final int getItemCount$foundation_layout_release() {
        return this.itemCount;
    }

    public final void setItemCount$foundation_layout_release(int i2) {
        this.itemCount = i2;
    }

    /* JADX INFO: renamed from: ellipsisSize-F35zm-w$foundation_layout_release */
    public final IntIntPair m946ellipsisSizeF35zmw$foundation_layout_release(boolean z2, int i2, int i3) {
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            return null;
        }
        if (i4 == 3) {
            if (z2) {
                return this.seeMoreSize;
            }
            return null;
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z2) {
            return this.seeMoreSize;
        }
        if (i2 + 1 < this.minLinesToShowCollapse || i3 < this.minCrossAxisSizeToShowCollapse) {
            return null;
        }
        return this.collapseSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x006d A[PHI: r1 r4
  0x006d: PHI (r1v4 androidx.collection.IntIntPair) = (r1v2 androidx.collection.IntIntPair), (r1v6 androidx.collection.IntIntPair) binds: [B:72:0x0066, B:58:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x006d: PHI (r4v5 androidx.compose.ui.layout.Measurable) = (r4v1 androidx.compose.ui.layout.Measurable), (r4v8 androidx.compose.ui.layout.Measurable) binds: [B:72:0x0066, B:58:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout_release(boolean r12, int r13, int r14) {
        /*
            r11 = this;
            androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r0 = r11.type
            int[] r1 = androidx.compose.foundation.layout.FlowLayoutOverflowState.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r1 = 1
            r3 = 0
            if (r2 == r1) goto L85
            r0 = 2
            if (r2 == r0) goto L85
            r0 = 3
            if (r2 == r0) goto L17
            r0 = 4
            if (r2 != r0) goto L6f
        L17:
            if (r12 == 0) goto L3e
            kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, ? extends androidx.compose.ui.layout.Measurable> r2 = r11.getOverflowMeasurable
            if (r2 == 0) goto L31
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r11.getNoOfItemsShown$foundation_layout_release()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r2.invoke(r1, r0)
            androidx.compose.ui.layout.Measurable r4 = (androidx.compose.ui.layout.Measurable) r4
            if (r4 != 0) goto L33
        L31:
            androidx.compose.ui.layout.Measurable r4 = r11.seeMoreMeasurable
        L33:
            androidx.collection.IntIntPair r1 = r11.seeMoreSize
            kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, ? extends androidx.compose.ui.layout.Measurable> r0 = r11.getOverflowMeasurable
            if (r0 != 0) goto L6d
            androidx.compose.ui.layout.Placeable r5 = r11.seeMorePlaceable
        L3b:
            if (r4 != 0) goto L75
            return r3
        L3e:
            int r0 = r11.minLinesToShowCollapse
            int r0 = r0 - r1
            if (r13 < r0) goto L6b
            int r0 = r11.minCrossAxisSizeToShowCollapse
            if (r14 < r0) goto L6b
            kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, ? extends androidx.compose.ui.layout.Measurable> r2 = r11.getOverflowMeasurable
            if (r2 == 0) goto L60
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            int r0 = r11.getNoOfItemsShown$foundation_layout_release()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r2.invoke(r1, r0)
            androidx.compose.ui.layout.Measurable r4 = (androidx.compose.ui.layout.Measurable) r4
            if (r4 != 0) goto L62
        L60:
            androidx.compose.ui.layout.Measurable r4 = r11.collapseMeasurable
        L62:
            androidx.collection.IntIntPair r1 = r11.collapseSize
            kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, ? extends androidx.compose.ui.layout.Measurable> r0 = r11.getOverflowMeasurable
            if (r0 != 0) goto L6d
            androidx.compose.ui.layout.Placeable r5 = r11.collapsePlaceable
            goto L3b
        L6b:
            r4 = r3
            goto L62
        L6d:
            r5 = r3
            goto L3b
        L6f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L75:
            androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapEllipsisInfo r3 = new androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapEllipsisInfo
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            long r6 = r1.m369unboximpl()
            r9 = 8
            r10 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r8, r9, r10)
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutOverflowState.ellipsisInfo$foundation_layout_release(boolean, int, int):androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapEllipsisInfo");
    }

    /* JADX INFO: renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release */
    public final void m948setOverflowMeasurableshBUhpc$foundation_layout_release(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, boolean z2, long j2) {
        long jM987constructorimpl = OrientationIndependentConstraints.m987constructorimpl(j2, z2 ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (intrinsicMeasurable != null) {
            int iMainAxisMin = FlowLayoutKt.mainAxisMin(intrinsicMeasurable, z2, Constraints.m6590getMaxHeightimpl(jM987constructorimpl));
            this.seeMoreSize = IntIntPair.m358boximpl(IntIntPair.m361constructorimpl(iMainAxisMin, FlowLayoutKt.crossAxisMin(intrinsicMeasurable, z2, iMainAxisMin)));
            this.seeMoreMeasurable = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (intrinsicMeasurable2 != null) {
            int iMainAxisMin2 = FlowLayoutKt.mainAxisMin(intrinsicMeasurable2, z2, Constraints.m6590getMaxHeightimpl(jM987constructorimpl));
            this.collapseSize = IntIntPair.m358boximpl(IntIntPair.m361constructorimpl(iMainAxisMin2, FlowLayoutKt.crossAxisMin(intrinsicMeasurable2, z2, iMainAxisMin2)));
            this.collapseMeasurable = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
            this.collapsePlaceable = null;
        }
    }

    /* JADX INFO: renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release */
    public final void m947setOverflowMeasurableshBUhpc$foundation_layout_release(final FlowLineMeasurePolicy flowLineMeasurePolicy, Measurable measurable, Measurable measurable2, long j2) {
        LayoutOrientation layoutOrientation = flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long jM1000toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m1000toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m989copyyUG9Ft0$default(OrientationIndependentConstraints.m987constructorimpl(j2, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (measurable != null) {
            FlowLayoutKt.m944measureAndCacherqJ1uqs(measurable, flowLineMeasurePolicy, jM1000toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                        iMainAxisSize = flowLineMeasurePolicy2.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy2.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.seeMoreSize = IntIntPair.m358boximpl(IntIntPair.m361constructorimpl(iMainAxisSize, iCrossAxisSize));
                    this.this$0.seeMorePlaceable = placeable;
                }
            });
            this.seeMoreMeasurable = measurable;
        }
        if (measurable2 != null) {
            FlowLayoutKt.m944measureAndCacherqJ1uqs(measurable2, flowLineMeasurePolicy, jM1000toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                        iMainAxisSize = flowLineMeasurePolicy2.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy2.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.collapseSize = IntIntPair.m358boximpl(IntIntPair.m361constructorimpl(iMainAxisSize, iCrossAxisSize));
                    this.this$0.collapsePlaceable = placeable;
                }
            });
            this.collapseMeasurable = measurable2;
        }
    }

    /* JADX INFO: renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout_release */
    public final void m949setOverflowMeasurablesVKLhPVY$foundation_layout_release(FlowLineMeasurePolicy flowLineMeasurePolicy, long j2, Function2<? super Boolean, ? super Integer, ? extends Measurable> function2) {
        this.itemShown = 0;
        this.getOverflowMeasurable = function2;
        m947setOverflowMeasurableshBUhpc$foundation_layout_release(flowLineMeasurePolicy, function2.invoke(true, 0), function2.invoke(false, 0), j2);
    }
}
