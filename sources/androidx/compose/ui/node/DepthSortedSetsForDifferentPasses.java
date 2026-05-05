package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
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
/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007ljA0ReP\u008cZS@\u000fs{:)c$\bCCU0}*\tUOm˧\u0005Ϻ\u000b\u000bq\u000eF!\tn:Imx\f\u0013Ƥ6B}A{a}CQ`#=5$@*Py3\nJ.V\u001a\u000fzqLT\u001e>K\t:\u0001\u000e}\t(\u001a\u001e>N\nfpuYNH\u001b^j31\u000b\u0002B|0\u00104\u000bW%F\u0003(Uzo*C@e6]1a\u000f\u001fR\n@3C\u007fG\u001dhU(sM\u0002dNX.\u0015]/]\u001burTeM\u0013n\u001b?+}j{\u0007\u0014*\u0006\u000b\u0014=L\u0015\u001e\u0015UQͶ1$l\u001a\u001e9z\u0006cBV\b\u0005J\u0010\fqEE&ő75?-vWgN)P=\u0002+\u0017.%\u0011nOb\u0003\u001f'ڄ!\u001d\u0004_Ei@kI~\u000egE\u0006\u0004\u001fkJ>\u0012D_\u007f]|A2%-O[g,Qo\u0010R\\g%\u00061taljHn&Eݮ9Ҋ\r\fbե5\u0011yUlXZ\u0015$ȿVΘ\u0002\b\u001b\u05feϨ{Q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<\u000248G\b-Fm\u0015\u001cMRIL>+slb:\u0007p,W\u0006\u0012CZ\\,j(", "", "3wc?T\bLa\u0019\f\nb6\u0006\u0017", "", "uY\u0018#", ":n^8T/>O\u0018lzm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<\u000248G\b-Fm\u0015\u001cMR\u0011", "Adc", "/cS", "", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "/eU2V;L:#\t\u0001Z/|\u0005.", "1n]AT0Ga", "7r4:c;R", "7r=<g\fF^(\u0013", ">n_", ">n_\u0012T*A", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@d\\<i,", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;
    private final DepthSortedSet lookaheadSet;
    private final DepthSortedSet set;

    public DepthSortedSetsForDifferentPasses(boolean z2) {
        this.lookaheadSet = new DepthSortedSet(z2);
        this.set = new DepthSortedSet(z2);
    }

    public final boolean contains(LayoutNode layoutNode, boolean z2) {
        boolean zContains = this.lookaheadSet.contains(layoutNode);
        if (z2) {
            return zContains;
        }
        return zContains || this.set.contains(layoutNode);
    }

    public final boolean contains(LayoutNode layoutNode) {
        return this.lookaheadSet.contains(layoutNode) || this.set.contains(layoutNode);
    }

    public final void add(LayoutNode layoutNode, boolean z2) {
        if (z2) {
            this.lookaheadSet.add(layoutNode);
            this.set.add(layoutNode);
        } else if (!this.lookaheadSet.contains(layoutNode)) {
            this.set.add(layoutNode);
        }
    }

    public final boolean remove(LayoutNode layoutNode, boolean z2) {
        return z2 ? this.lookaheadSet.remove(layoutNode) : this.set.remove(layoutNode);
    }

    public final boolean remove(LayoutNode layoutNode) {
        return this.set.remove(layoutNode) || this.lookaheadSet.remove(layoutNode);
    }

    public final LayoutNode pop() {
        if (!this.lookaheadSet.isEmpty()) {
            return this.lookaheadSet.pop();
        }
        return this.set.pop();
    }

    public final void popEach(Function2<? super LayoutNode, ? super Boolean, Unit> function2) {
        while (isNotEmpty()) {
            boolean zIsEmpty = this.lookaheadSet.isEmpty();
            function2.invoke((!zIsEmpty ? this.lookaheadSet : this.set).pop(), Boolean.valueOf(!zIsEmpty));
        }
    }

    public final boolean isEmpty() {
        return this.set.isEmpty() && this.lookaheadSet.isEmpty();
    }

    public final boolean isEmpty(boolean z2) {
        return (z2 ? this.lookaheadSet : this.set).isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }
}
