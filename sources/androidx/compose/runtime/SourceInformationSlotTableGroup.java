package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLc\u0003\u001eIي8\u000bDB\u0007Ӭ4\u0012\u0006\rnʑA0ZeP\u008cZS@\u000fs{:'c$\u007fّCU \u0003*\t]WogtPb\u000bQ\u001b\u000e\u0016~o4Ic\u001fe܈\u00152Xģo3{nm?pvF\u0005N1P8:(\u0011\u001e8I(v)E[\u0010 3XphV\u001dQ\u0013\u001f*\u0006l&\u0011\"jnf6vtҺ>/1\f2O\\Mw6\rO\u001dF\u0003&;\u001e(ӳ+\u0011OC\u001f=Y\u0013\tb[m\u0002mq\u0014ݲjҊ+1Q֕o8^\u000b\"!{i\u001bj\u000b.l\tab\"&Y]\u0012K\u0007b~Ò|ԫ\u0011@\u001c\u0010\f6V:},t\u0018&3#\u0001\n\u0015'س`۰\u0004~y8\u001d6\u000eE{H)miai!\u05ee;\u0002\rټ6%\u0007\u0002/o% n*3T&gg&\u0017חJݳ\u000e]Uo\n\u0006p\u0019z\u0016>_\u0018/*\u001f\u0005Ϧ'ھ_?+ܩ\u0004\u0004N]u\tUtvm\u0002T^?P|L\f\u0001µ\u000eʑHh\u001dmVof>a\\*W\u001f}6\u0017ء`}Dƙ=\u0012Tkv\u0007;ak(=1|6\b\u000e\"b.߁`ۋ9U{\u0012gr\u00055\u0010Kp\npfpY۱^b0ίJJp2\u0006\u001f\u0015]\u001a\u0014J? \u001eٜ07!¢-J\tBPfҺ\r\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{F\u000723Ya)8w#6IR?u=\f\u001crp(\u0003`3NX4Q\\Y\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eJnC\u0017n\u0002", "", "B`Q9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", ">`a2a;", "", "And?V,\"\\\u001a\t\bf(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9oI\u00015@G\b0Dk\u0016\u0012VDEx<\u001a$lkB\\", "7cT;g0Mg\u0004z\na", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{F\u000723Ya)8w#6IR?u=\u007f\"rqDq_;QL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DHy\u001d>mk\u00124?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016[<eavE\u0014[<\u001bX;\u0018rcQ1lD\u001b(\t6V\n7w\u0005\u0016\u001fc\u001cfyAc\u001aKx(??3pQcmy\u0011NUk9h\u0014_fJDJ1\u0012q|$iZ;\u0012wb\u0015|[[tqW$e43AC\u001f7", "1n\\=b:Bb\u001d\t\u0004@9\u0007\u0019:s", "5dc\u0010b4I]'\u0003\nb6\u0006j<o\u00103\n", "u(;7T=:\u001d z\u0004`u`\u0018/r{%\u0003@V", "2`c.", "", "5dc\u0011T;:", "7cT;g0Mg", "5dc\u0016W,Gb\u001d\u000e\u000f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u0016W,Gb\u001d\u000e\u000fI(\f\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d/Ef{ \u001bv\u00178ZK7z8(\u001eJnC\u0017n\u0017J\u0006*\u001d", "7r4:c;R", "", "u(I", "9dh", "5dc\u0018X@", "<nS2", "5dc\u001bb+>", "5dc\u001dT9>\\(", "u(8", "And?V,\"\\\u001a\t", "", "5dc b<KQ\u0019b\u0004_6", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc b<KQ\u0019b\u0004_6\n\u0011+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006X2?i\t\u000eA}#,M'Dl>+\u001ddp=\u0011l\u0002", "5dc!T)ES", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d,?hl\u001c4t\u0016\u0004", "7sT?T;H`", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
    private final Iterable<CompositionGroup> compositionGroups = this;
    private final SourceInformationGroupPath identityPath;
    private final Object key;
    private final int parent;
    private final GroupSourceInformation sourceInformation;
    private final SlotTable table;

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        return null;
    }

    public SourceInformationSlotTableGroup(SlotTable slotTable, int i2, GroupSourceInformation groupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.table = slotTable;
        this.parent = i2;
        this.sourceInformation = groupSourceInformation;
        this.identityPath = sourceInformationGroupPath;
        this.key = Integer.valueOf(groupSourceInformation.getKey());
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int getParent() {
        return this.parent;
    }

    public final GroupSourceInformation getSourceInformation() {
        return this.sourceInformation;
    }

    public final SourceInformationGroupPath getIdentityPath() {
        return this.identityPath;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        return this.sourceInformation.getSourceInformation();
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable<Object> getData() {
        return new SourceInformationGroupDataIterator(this.table, this.parent, this.sourceInformation);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this.compositionGroups;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        return this.identityPath.getIdentity(this.table);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        ArrayList<Object> groups = this.sourceInformation.getGroups();
        boolean z2 = false;
        if (groups != null && !groups.isEmpty()) {
            z2 = true;
        }
        return !z2;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new SourceInformationGroupIterator(this.table, this.parent, this.sourceInformation, this.identityPath);
    }
}
