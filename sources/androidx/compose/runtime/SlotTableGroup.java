package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u0003\u001eIي8\u000bDB\u0007Ӭ4\u0012\u0006\rnj?4LeV\u008cZS0\u0016s{B-c$wICU(\n*\tUTog|pbŏK\u000f\u0014\u0016\u0001̓2Ikތ\u000e\u0012=1ruO5]ok8\u000ftv\"0609\u0012\u0005/\u001c:L\u001ey\u0013Cy\u0010\"6FpHW%M3\u001eŪ\n>.\u0007flurNJ\u0003\\h.S\u0007wgf'\u000e;CaUSbM%|q ;@e4CL\u001aΟ\u0007\u001baM+Wqk./'wCWzo<h\u0002$\u0015YN;])z3ӻSԃ\u0010+CQiS^\u0017x\u0012\t\u0006%D\u0014\u0012\u0016)^-[%\u0015\bD\bKɘUĖT\u0006vD\u0006\u0007o?g4\u000e6C9IjЂeA!\u05cbO}\u000b\u001a,1Q\u0001/jl\u000e\u000f\u0019Q)NΚ3ҨDA`P\u0010iK{T\u0003p\u0013B\u0004^R6\u0004R\u00940ϲ);s;)3y\u0015\u0019Vu\u000b\u001d`\u0017h '\u001fخ$å\u001a;B\u000b\u0012nRzU}^kp,?XR)]ù\n˙$`\u0010>'=\u001ea |w\u0004e_ $]qm.E\u009f\u0010Ć=bK7W}\u001et#\t\"ZTb3\\\u001d\u0017*ۥ\\څ,&JJp,\u0006\n\u0015b\u001a0JA\b\u001bbJgm3ĀJҴ\"FY~\u000f~h\t`\u000eb4<\u0003\u0018&ڲ\r\u0007Xʔ\tqm\u001aWNMo02YQc\u001dłY(pؔ\u0015%\r\"\u0002\u000eġkv"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7O#8]N\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eJnC\u0017n\u0002", "", "B`Q9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "5q^Bc", "", "Dda@\\6G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DHy\u001d>mk\u00121\u0007,", "1n\\=b:Bb\u001d\t\u0004@9\u0007\u0019:s", "5dc\u0010b4I]'\u0003\nb6\u0006j<o\u00103\n", "u(;7T=:\u001d z\u0004`u`\u0018/r{%\u0003@V", "2`c.", "", "5dc\u0011T;:", "5dc\u0014e6N^", "u(8", "5q^Bc\u001aBh\u0019", "5dc\u0014e6N^\u0007\u0003\u0010^", "7cT;g0Mg", "5dc\u0016W,Gb\u001d\u000e\u000f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7r4:c;R", "", "u(I", "9dh", "5dc\u0018X@", "<nS2", "5dc\u001bb+>", "Ak^Af\u001aBh\u0019", "5dc _6Ma\u0007\u0003\u0010^", "And?V,\"\\\u001a\t", "", "5dc b<KQ\u0019b\u0004_6", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!T)ES", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d,?hl\u001c4t\u0016\u0004", "5dc#X9LW#\b", "4h]1", "7cT;g0Mg\b\t[b5{", "7sT?T;H`", "", "D`[6W(MS\u0006~v]", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
    private final int group;
    private final SlotTable table;
    private final int version;

    public SlotTableGroup(SlotTable slotTable, int i2, int i3) {
        this.table = slotTable;
        this.group = i2;
        this.version = i3;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int getGroup() {
        return this.group;
    }

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(slotTable, i2, (i4 + 4) - (i4 | 4) != 0 ? slotTable.getVersion$runtime_release() : i3);
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return SlotTableKt.groupSize(this.table.getGroups(), this.group) == 0;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        if (SlotTableKt.hasObjectKey(this.table.getGroups(), this.group)) {
            Object obj = this.table.getSlots()[SlotTableKt.objectKeyIndex(this.table.getGroups(), this.group)];
            Intrinsics.checkNotNull(obj);
            return obj;
        }
        return Integer.valueOf(SlotTableKt.key(this.table.getGroups(), this.group));
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        if (SlotTableKt.hasAux(this.table.getGroups(), this.group)) {
            Object obj = this.table.getSlots()[SlotTableKt.auxIndex(this.table.getGroups(), this.group)];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        GroupSourceInformation groupSourceInformationSourceInformationOf = this.table.sourceInformationOf(this.group);
        if (groupSourceInformationSourceInformationOf != null) {
            return groupSourceInformationSourceInformationOf.getSourceInformation();
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        if (SlotTableKt.isNode(this.table.getGroups(), this.group)) {
            return this.table.getSlots()[SlotTableKt.nodeIndex(this.table.getGroups(), this.group)];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable<Object> getData() {
        GroupSourceInformation groupSourceInformationSourceInformationOf = this.table.sourceInformationOf(this.group);
        return groupSourceInformationSourceInformationOf != null ? new SourceInformationGroupDataIterator(this.table, this.group, groupSourceInformationSourceInformationOf) : new DataIterator(this.table, this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        validateRead();
        SlotReader slotReaderOpenReader = this.table.openReader();
        try {
            return slotReaderOpenReader.anchor(this.group);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        validateRead();
        GroupSourceInformation groupSourceInformationSourceInformationOf = this.table.sourceInformationOf(this.group);
        if (groupSourceInformationSourceInformationOf != null) {
            return new SourceInformationGroupIterator(this.table, this.group, groupSourceInformationSourceInformationOf, new AnchoredGroupPath(this.group));
        }
        SlotTable slotTable = this.table;
        int i2 = this.group;
        return new GroupIterator(slotTable, i2 + 1, i2 + SlotTableKt.groupSize(slotTable.getGroups(), this.group));
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        return SlotTableKt.groupSize(this.table.getGroups(), this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int slotsSize;
        int groupSize = this.group + getGroupSize();
        if (groupSize < this.table.getGroupsSize()) {
            slotsSize = SlotTableKt.dataAnchor(this.table.getGroups(), groupSize);
        } else {
            slotsSize = this.table.getSlotsSize();
        }
        return slotsSize - SlotTableKt.dataAnchor(this.table.getGroups(), this.group);
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    private static final CompositionGroup find$findAnchoredGroup(SlotTableGroup slotTableGroup, Anchor anchor) {
        int iAnchorIndex;
        int i2;
        if (!slotTableGroup.table.ownsAnchor(anchor) || (iAnchorIndex = slotTableGroup.table.anchorIndex(anchor)) < (i2 = slotTableGroup.group) || iAnchorIndex - i2 >= SlotTableKt.groupSize(slotTableGroup.table.getGroups(), slotTableGroup.group)) {
            return null;
        }
        return new SlotTableGroup(slotTableGroup.table, iAnchorIndex, slotTableGroup.version);
    }

    private static final CompositionGroup find$findRelativeGroup(CompositionGroup compositionGroup, int i2) {
        return (CompositionGroup) CollectionsKt.firstOrNull(CollectionsKt.drop(compositionGroup.getCompositionGroups(), i2));
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        if (obj instanceof Anchor) {
            return find$findAnchoredGroup(this, (Anchor) obj);
        }
        if (!(obj instanceof SourceInformationSlotTableGroupIdentity)) {
            return null;
        }
        SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
        CompositionGroup compositionGroupFind = find(sourceInformationSlotTableGroupIdentity.getParentIdentity());
        if (compositionGroupFind != null) {
            return find$findRelativeGroup(compositionGroupFind, sourceInformationSlotTableGroupIdentity.getIndex());
        }
        return null;
    }
}
