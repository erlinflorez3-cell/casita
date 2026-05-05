package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.List;
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
/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\":0\u007f\u0007|jAӄLeV4Zݷ2\u000fy\u0005<$a0yCI٥\"}(\tWNusvϺb\u000bQ\u000f\u000e\u0016~j4Ikxe܈\u0015˱H\u0006ЀcS\u007f?I`#63\u001frIH\n\u0013\u000226X\u0018\u0007\u0001SM\u001c\u0012^D\u001f=\u0001\u000f]\t(\u0017\u001e>N\u0007.`uUNH\u001beƠ3#\u0011r\u000ba5oH\t]\u0015VZ7\u000f\u0007aL/n:c\u0017kڌ\u0004OYiP\u001b? CKٙ(o2W\u0006o6\u0007\bZǊ,\u0018>k\u0006>\\3ĩ\u0011\u001e-+]dc\\\u001e0\b\u0001\f\u000fL\u0004<\nUK\\/Jl\u000e\u000eAy\u000bSnV2dH\u007f\thN\u0017S\byۆ8cl_uS\u0019|7B\u0019U/1\u0016\u0007!\n\\>f#1lyg0\u007fW\u0004̇OR`K\u0006\u001cp\u0011\bp̍/\u0010\u0007=\u0015).E?}ښ8k/y\u001d`D\u0016\u00135dvp\u0002Rv@h\u0003^A8'$Zr\u0001-k~s\u001f@a\\*[\u001f}6\u001bء`}Dƙ=\u0012TYvt;\\k\u000f=/\u0015=֍rq\u0016ãQ`9A_p`|`w,KLj\u0015^vDc\f\t`V%`Jн\u0014}\u0004ͩf\u000e\u0019@M\u0001ʲ8L"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2=\u0007\u001f;k\u0012=WP#u3\"\u0016laF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2=\u0007\u001f;k\u0012=WP%l5,\u0015wJC\u0006c\u0002", "B`Q\u001db:Bb\u001d\t\u0004l\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2D\b.;|\u001a8V\u0019", "Ad[2V;>R\bzwB5{\tB", "", "4n[9b>\u001c]\"\u000ezg;j\rDe", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*\u0006!DYS\u0004,1\u0007", "5dc\u0013b3E]+\\\u0005g;|\u0012>S\u0004={", "u(I", "5dc X3>Q(~yM(yl8d\u007f;", "u(8", "5dc!T))]'\u0003\nb6\u0006\u0017\u001dt{7{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d41h}u", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TabIndicatorModifier extends ModifierNodeElement<TabIndicatorOffsetNode> {
    public static final int $stable = 0;
    private final boolean followContentSize;
    private final int selectedTabIndex;
    private final State<List<TabPosition>> tabPositionsState;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabIndicatorModifier copy$default(TabIndicatorModifier tabIndicatorModifier, State state, int i2, boolean z2, int i3, Object obj) {
        if ((1 & i3) != 0) {
            state = tabIndicatorModifier.tabPositionsState;
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            i2 = tabIndicatorModifier.selectedTabIndex;
        }
        if ((i3 & 4) != 0) {
            z2 = tabIndicatorModifier.followContentSize;
        }
        return tabIndicatorModifier.copy(state, i2, z2);
    }

    public final State<List<TabPosition>> component1() {
        return this.tabPositionsState;
    }

    public final int component2() {
        return this.selectedTabIndex;
    }

    public final boolean component3() {
        return this.followContentSize;
    }

    public final TabIndicatorModifier copy(State<? extends List<TabPosition>> state, int i2, boolean z2) {
        return new TabIndicatorModifier(state, i2, z2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return Intrinsics.areEqual(this.tabPositionsState, tabIndicatorModifier.tabPositionsState) && this.selectedTabIndex == tabIndicatorModifier.selectedTabIndex && this.followContentSize == tabIndicatorModifier.followContentSize;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.tabPositionsState.hashCode() * 31) + Integer.hashCode(this.selectedTabIndex)) * 31) + Boolean.hashCode(this.followContentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.tabPositionsState + ", selectedTabIndex=" + this.selectedTabIndex + ", followContentSize=" + this.followContentSize + ')';
    }

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(State<? extends List<TabPosition>> state, int i2, boolean z2) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i2;
        this.followContentSize = z2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TabIndicatorOffsetNode create() {
        return new TabIndicatorOffsetNode(this.tabPositionsState, this.selectedTabIndex, this.followContentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TabIndicatorOffsetNode tabIndicatorOffsetNode) {
        tabIndicatorOffsetNode.setTabPositionsState(this.tabPositionsState);
        tabIndicatorOffsetNode.setSelectedTabIndex(this.selectedTabIndex);
        tabIndicatorOffsetNode.setFollowContentSize(this.followContentSize);
    }
}
