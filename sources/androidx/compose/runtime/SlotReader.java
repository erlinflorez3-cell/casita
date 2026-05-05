package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007lkA0RkP.XY2\u000f\u0002{<$a5yCIh\"}(\u001dWNuvvJ`\fK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172XoG3SrE9nt>\u0005&5*8\b$\t\u001a@H\u0018v\u0001OS\f <Hp@S\u0013˟\u001b܅B\u0006l\u001fA)lk\\6`l\f;ǥ'\u0003wD\u00175mv\u0015M;\b\u0005-\u0013voeC@e=])aK\u001fR\n\tKC\u007f\b\u001dhUpsU\u0002#NX.\u0018E/]TurTdMUnX?+}-\u0014T\u001cu\u0010z*V\u0005\u000e\u001cT?N>/*f6^aD;aN\"\u001a`X~)`f\u001b3GK+g#/_oN1PMz3\fN'\u000f69[\u0003\u0016)!)j\u0010Q_YpAV\u0016\"YkuL~pTB\u0006FF..,\u0015<^=7\nAk7yT`F}u3_\u0019Ww&`@PvF;8P$ZrlMw^lp,?ULX\u0015D \u0013N\u001e@H/=(N}p\u001an[%\"%]n\u007fg|\b&YO]a4\u0002g\u001e)jvBG\u0005n\u0013v~B\u0002\u0014\u000b`6iJH\u0019\u0018@\bR#$\u0013`C\" BsI\u0019\u000b\u001d\u0011\u000f,kY|7c\u000bl\u001eFl3R\u000b20\u00037\u0019P\u000bt k\u0007\u0011D|\u000f*uG_\u000b1(k!\u00173E1\u0015U\f\u0002]fzF|p$=m{N\u001ebE_^U\u0013=\u0007Y6\u0010t]L!m\u001aY X\u0013|(\u0017kl</ j\u001f4)vX'l\u0017P~\u000fv1O|\u007f(i\u000f\u0007U<l\u000b\n\byv\u0011!TNf\u0005M+,~\u0019oPFe1Qn5\u0016&\u001cw\u0019o8\u0002o\\\u0002+\u00134P}\u0004Z-^sp.u2i\u0002\u0012]\r\u001c:$\u001bL\u000bNxV B7\u0014SG\u0011UrQn:c\n]|\u000f\u0007Z2!Zi\u0002+o,<t_r\bQT,`Y$?L{g\u001c\u0013{`\u0019\u0012'\n9\u0004wnZ0K\u0002nYx\b^\u0005\u001c\u0018dfkf\u0013\u0004!$b4\u0003\b[_bn\u001e\u0010)\u0004vc\u001d\u001aJB\"?\u0015N+܆hƪL\u000bhѤx#0\u0007\r\u0016\u0004:\u0007>I\u0005\u001cN\u00053q5\u0019SK\u0011Y+&Ʋrު/J\\ڣ3*^\u000b\u0019P._W\u000eN\u0004u1\u001eo}\u000fP\u0018+%\u0001Xqʊ]μc|8͜#Wj[r\u0002br`\\:)-\u0003SɝH\u009f\u0013\u000b!ۚC{p<dN&?\u001aב\rӢH)\u000fљMoT+E\u0006c>\u0014ƙl͂+{_ė\f\n\u001628'2|wƻcˍj\neͩ\u000b'\u007f)z\u0004\u001f\u0012~\u001f:rؠxv\"0\u000eJ]\u0017\u0004\u0011!tqk&)vk߿p\nZMn\u0010\u0018n=r|m#\u0003\u00159\r>ӊ1T5\u000b-f<\u001e)kH+k\"n\u0010.\u0013Kj̢:\fz+\u0016jq}A|]w%-EjX`gtݟ\"\u00027{{!8ix$Ite>\u0013\u0011\u00131ܣ[\u0012vl.\u0004\u0003\u0017y#\u000b\u001f`^?\u001bj\u000bޔ\"hG9\u001f@i\u0018\u0018o\u0015&]IT)g\u0017̫\u001f;J\ruK\u0005\u001cSFp\u0019\u0018*p.Iψiǋ1F\\شj3gJ\u0006d1.\"Ԛ:ܥ\f,\u0019ÀaKh_8>\u000b\u001eL?_6Y\u0019?\u0005Sx\\˖\u0013ص9pYƚ=,\u0007%\u000f\u0014\u0010\t?\u0015RsevYsތs\u001fohAOCl\u001d6\u001a-}J-Q\u001a\u001bւe0a7KJ\b\\\u0011\u000f\u0018L<$4yYDӽ5LBabmdz(\u00134XNnr'}1Րw\u000eDk\u001e\"rb2CO*,\u0019rF`qď\u000bIej\u007f;R\u0018\u00160E@\u001e)a\u001f-\u0014]tX+wz\fo3ѵH\u038bw\nBߑy8\u007fyNdz\u0015;Elc\u0019r$\u0016̼\u0014<*\u000f\u00138\u0006<#o\u000e\u00165\u0018US-\u000bր`|eChAN\u001atm<y$\u000b4\u001ed\rǩ\u0006\u0002bb\u001bKARDPUKn{O%G \u074c\n)\u007flMyc|)SGn#uZ\\Egr\u0004\u0004 y!\u0002ۥ\u0002Ԑ/0OVLWzd\u0014L]dv\u0018\u001bѐFڍq08ߣ!+h\u0003u!,!MUC'\u000f4r7\n''*e\u0018W`e%=x0D C)\u00139`i8\u0011fJԟ=Ĩ\u007f\bdų&\u000f{I(\u0003\u0010KwǓ\bܽ3GSАngE]e\u0005נ\u0010\u0003"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014\"Yy\u001f7zk", "", "B`Q9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DHy\u001d>mkq>", "\nrTA \u0006\u0017", "", "1k^@X+", "5dc\u0010_6LS\u0018", "u(I", "", "1ta?X5M3\"}", "5dc\u0010h9KS\"\u000eZg+", "u(8", "1ta?X5M5&\t\u000bi", "5dc\u0010h9KS\"\u000e\\k6\r\u0014", "1ta?X5MA \t\n", "1ta?X5MA \t\n>5{", "1ta?X5MA \t\nL;x\u00075", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9qE\u0006\u0013DU{&\r", "3l_Al\nHc\"\u000e", "5q^Bc\bNf", "5dc\u0014e6N^t\u000f\u000e", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5q^Bc\fGR", "5dc\u0014e6N^x\by", "5q^Bc\u0012>g", "5dc\u0014e6N^~~\u000f", "5q^Bc\u0015HR\u0019", "5dc\u0014e6N^\u0002\ty^", "5q^Bc\u0016;X\u0019|\nD,\u0011", "5dc\u0014e6N^\u0003{\u007f^*\fn/y", "5q^Bc\u001aBh\u0019", "5dc\u0014e6N^\u0007\u0003\u0010^", "5q^Bc\u001aE](\\\u0005n5\f", "5dc\u0014e6N^\u0007\u0006\u0005m\n\u0007\u00198t", "5q^Bc\u001aE](b\u0004],\u0010", "5dc\u0014e6N^\u0007\u0006\u0005m\u0010\u0006\b/x", "5q^Bc:", "", "5q^Bc:,W.~", "6`S\u001bX?M", "5dc\u0015T+'S,\u000e", "6`b\u001cU1>Q(dzr", "5dc\u0015T:(P\u001e~xm\u0012|\u001d", "7m4:c;R", "5dc\u0016a\fF^(\u0013", "7r6?b<I3\"}", "7r=<W,", "<nS266N\\(", "5dc\u001bb+>1#\u000f\u0004m", ">`a2a;", "5dc\u001dT9>\\(", ">`a2a;']\u0018~\t", "5dc\u001dT9>\\(g\u0005],\u000b", "@d\\.\\5B\\\u001bl\u0002h;\u000b", "5dc\u001fX4:W\"\u0003\u0004`\u001a\u0004\u0013>s", "Ahi2", "5dc \\A>", "Ak^A", "5dc _6M", "Ak^Af", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "Ak^Af\u001aBh\u0019", "And?V,\"\\\u001a\t\bf(\f\r9ng$\u0007", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9oI\u00015@G\b0Dk\u0016\u0012VDEx<\u001a$lkB\\", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "5dc!T)ESW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d,?hl\u001c4t\u0016\u0004", "/mR5b9", "7mS2k", "0dV6a\fF^(\u0013", "", "1k^@X", "1n]AT0Ga\u0001z\bd", "3mS\u0012`7Mg", "3mS\u0014e6N^", "3wc?T*M9\u0019\u0013\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9s<\u000b\t>Z\bu", "5dc", "5q^Bc\u000e>b", "5q^Bc", "6`b\u001aT9D", "<dgA", "<nS2", ">`a2a;(T", "@d_<f0MW#\b", "@dbAb9>>\u0015\fzg;", "AjX=:9Hc$", "AjX=G6 `#\u000f\u0006>5{", "AsP?g\u000eK])\n", "AsP?g\u0015HR\u0019", "BnBAe0GU", "", "/tg", "=aY2V;$S-", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack currentSlotStack;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private boolean hadNext;
    private int parent;
    private final Object[] slots;
    private final int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final int parent(int i2) {
        return SlotTableKt.parentAnchor(this.groups, i2);
    }

    public final boolean isNode() {
        return SlotTableKt.isNode(this.groups, this.currentGroup);
    }

    public final boolean isNode(int i2) {
        return SlotTableKt.isNode(this.groups, i2);
    }

    public final int getNodeCount() {
        return SlotTableKt.nodeCount(this.groups, this.currentGroup);
    }

    public final int nodeCount(int i2) {
        return SlotTableKt.nodeCount(this.groups, i2);
    }

    public final Object node(int i2) {
        if (SlotTableKt.isNode(this.groups, i2)) {
            return node(this.groups, i2);
        }
        return null;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.currentGroup);
    }

    public final int groupSize(int i2) {
        return SlotTableKt.groupSize(this.groups, i2);
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int groupEnd(int i2) {
        return i2 + SlotTableKt.groupSize(this.groups, i2);
    }

    public final int getGroupKey() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return SlotTableKt.key(this.groups, i2);
        }
        return 0;
    }

    public final int groupKey(int i2) {
        return SlotTableKt.key(this.groups, i2);
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean hasObjectKey(int i2) {
        return SlotTableKt.hasObjectKey(this.groups, i2);
    }

    public final boolean getHasObjectKey() {
        int i2 = this.currentGroup;
        return i2 < this.currentEnd && SlotTableKt.hasObjectKey(this.groups, i2);
    }

    public final Object getGroupObjectKey() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return objectKey(this.groups, i2);
        }
        return null;
    }

    public final Object groupObjectKey(int i2) {
        return objectKey(this.groups, i2);
    }

    public final Object getGroupAux() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return aux(this.groups, i2);
        }
        return 0;
    }

    public final Object groupAux(int i2) {
        return aux(this.groups, i2);
    }

    public final Object getGroupNode() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return node(this.groups, i2);
        }
        return null;
    }

    public final int groupKey(Anchor anchor) {
        if (anchor.getValid()) {
            return SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        }
        return 0;
    }

    public final boolean hasMark(int i2) {
        return SlotTableKt.hasMark(this.groups, i2);
    }

    public final boolean containsMark(int i2) {
        return SlotTableKt.containsMark(this.groups, i2);
    }

    public final int getParentNodes() {
        int i2 = this.parent;
        if (i2 >= 0) {
            return SlotTableKt.nodeCount(this.groups, i2);
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.currentSlotEnd - this.currentSlot;
    }

    public final int parentOf(int i2) {
        if (!(i2 >= 0 && i2 < this.groupsSize)) {
            PreconditionsKt.throwIllegalArgumentException("Invalid group index " + i2);
        }
        return SlotTableKt.parentAnchor(this.groups, i2);
    }

    public final int getGroupSlotCount() {
        int i2 = this.currentGroup;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
        int i3 = i2 + 1;
        return (i3 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i3) : this.slotsSize) - iSlotAnchor;
    }

    public final Object get(int i2) {
        int i3 = this.currentSlot + i2;
        return i3 < this.currentSlotEnd ? this.slots[i3] : Composer.Companion.getEmpty();
    }

    public final Object groupGet(int i2) {
        return groupGet(this.currentGroup, i2);
    }

    public final Object groupGet(int i2, int i3) {
        int iDataAnchor;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
        int i4 = i2 + 1;
        if (i4 < this.groupsSize) {
            iDataAnchor = SlotTableKt.dataAnchor(this.groups, i4);
        } else {
            iDataAnchor = this.slotsSize;
        }
        int i5 = iSlotAnchor + i3;
        return i5 < iDataAnchor ? this.slots[i5] : Composer.Companion.getEmpty();
    }

    public final Object next() {
        int i2;
        if (this.emptyCount > 0 || (i2 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.Companion.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i2 + 1;
        return objArr[i2];
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void endEmpty() {
        if (!(this.emptyCount > 0)) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, this.sourceInformationMap);
    }

    public final void startGroup() {
        int iDataAnchor;
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i2 = this.parent;
            int i3 = this.currentGroup;
            if (!(SlotTableKt.parentAnchor(this.groups, i3) == i2)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            if (map != null && (groupSourceInformation = map.get(anchor(i2))) != null) {
                groupSourceInformation.reportGroup(this.table, i3);
            }
            IntStack intStack = this.currentSlotStack;
            int i4 = this.currentSlot;
            int i5 = this.currentSlotEnd;
            if (i4 == 0 && i5 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i4);
            }
            this.parent = i3;
            this.currentEnd = SlotTableKt.groupSize(this.groups, i3) + i3;
            int i6 = i3 + 1;
            this.currentGroup = i6;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i3);
            if (i3 < this.groupsSize - 1) {
                iDataAnchor = SlotTableKt.dataAnchor(this.groups, i6);
            } else {
                iDataAnchor = this.slotsSize;
            }
            this.currentSlotEnd = iDataAnchor;
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!SlotTableKt.isNode(this.groups, this.currentGroup)) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    public final int skipGroup() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int iNodeCount = SlotTableKt.isNode(this.groups, this.currentGroup) ? 1 : SlotTableKt.nodeCount(this.groups, this.currentGroup);
        int i2 = this.currentGroup;
        this.currentGroup = i2 + SlotTableKt.groupSize(this.groups, i2);
        return iNodeCount;
    }

    public final void skipToGroupEnd() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void reposition(int i2) {
        int iParentAnchor;
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = i2;
        if (i2 < this.groupsSize) {
            iParentAnchor = SlotTableKt.parentAnchor(this.groups, i2);
        } else {
            iParentAnchor = -1;
        }
        this.parent = iParentAnchor;
        if (iParentAnchor >= 0) {
            this.currentEnd = iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
        } else {
            this.currentEnd = this.groupsSize;
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int i2) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, i2) + i2;
        int i3 = this.currentGroup;
        if (!(i3 >= i2 && i3 <= iGroupSize)) {
            ComposerKt.composeImmediateRuntimeError("Index " + i2 + " is not a parent of " + i3);
        }
        this.parent = i2;
        this.currentEnd = iGroupSize;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void endGroup() {
        int iGroupSize;
        int iDataAnchor;
        if (this.emptyCount == 0) {
            if (!(this.currentGroup == this.currentEnd)) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int iParentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
            this.parent = iParentAnchor;
            if (iParentAnchor >= 0) {
                iGroupSize = SlotTableKt.groupSize(this.groups, iParentAnchor) + iParentAnchor;
            } else {
                iGroupSize = this.groupsSize;
            }
            this.currentEnd = iGroupSize;
            int iPop = this.currentSlotStack.pop();
            if (iPop < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
                return;
            }
            this.currentSlot = iPop;
            if (iParentAnchor < this.groupsSize - 1) {
                iDataAnchor = SlotTableKt.dataAnchor(this.groups, iParentAnchor + 1);
            } else {
                iDataAnchor = this.slotsSize;
            }
            this.currentSlotEnd = iDataAnchor;
        }
    }

    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int iGroupSize = this.currentGroup;
        int i2 = 0;
        while (iGroupSize < this.currentEnd) {
            arrayList.add(new KeyInfo(SlotTableKt.key(this.groups, iGroupSize), objectKey(this.groups, iGroupSize), iGroupSize, SlotTableKt.isNode(this.groups, iGroupSize) ? 1 : SlotTableKt.nodeCount(this.groups, iGroupSize), i2));
            iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            i2++;
        }
        return arrayList;
    }

    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = slotReader.currentGroup;
        }
        return slotReader.anchor(i2);
    }

    public final Anchor anchor(int i2) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int iSearch = SlotTableKt.search(anchors$runtime_release, i2, this.groupsSize);
        if (iSearch >= 0) {
            return anchors$runtime_release.get(iSearch);
        }
        Anchor anchor = new Anchor(i2);
        anchors$runtime_release.add(-(iSearch + 1), anchor);
        return anchor;
    }

    private final Object node(int[] iArr, int i2) {
        return SlotTableKt.isNode(iArr, i2) ? this.slots[SlotTableKt.nodeIndex(iArr, i2)] : Composer.Companion.getEmpty();
    }

    private final Object aux(int[] iArr, int i2) {
        return SlotTableKt.hasAux(iArr, i2) ? this.slots[SlotTableKt.auxIndex(iArr, i2)] : Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i2) {
        if (SlotTableKt.hasObjectKey(iArr, i2)) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i2)];
        }
        return null;
    }
}
