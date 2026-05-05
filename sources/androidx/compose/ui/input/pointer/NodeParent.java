package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
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
/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjG9L͜P.hS2\u000f\u0002{<řc$\bCC٥\"}8\tWNmgvJh\u000bK\u000f\f\u001b\u0001j:P]ތe\u0012%2JģEAcڎm9\u000fsv\bڶ6\"FyM-(0`\u0010%\u0002sU\u001a\u001aHF\u0001<b\r{\u000fH\u001b6B.\f6\\\u0016ZfLzjR/Q\u0011\u001aF\\6w0+TSZ\u001d5\u001b\u0007y\u001eYQg9#2k\u00035`\"SKC\u007fO\u001dhU8sO\u0002jNX.%[?\u0018\u001bk\u0007>\\3X\u0011\u001058gcy^T<@'\n\"T\u0004<\rWR<52l\u0018\u0010Ct!]nY2bP\u000b\u0013ad#U\u0004A8Q\u001b\u0015_\u0012?']O{3\u0014d7Ir/ql\u000e\u000f&cp\u0006hIQnNxR\u0018qUm2\n\u0013\f8\u001eHM\u00101\f\u0011\\\u001aSR\"Ms6y\u0003`Jwx\u0015`\u0017V\u0018T͕D(vݫO,\u000f\u0010hI\u0087\t\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001V -M.7x4'$>", "", "u(E", "1gX9W9>\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001V -M\u0019", "5dc\u0010[0ER&~\u0004", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006t/<`}\u001eFq 7\u0017+Kz0\u001b\u001chR9\u0005r6[L", "0tX9W\n:Q\u001c~", "", "1gP;Z,L", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u00198\u0004355\u000b-3\u0002k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", ">`a2a;\u001c]#\fyb5x\u0018/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "7mc2e5:Z\u0004\t~g;|\u0016\u000fv\u007f1\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001Q\u001f=MPDg;\t\u001fljH\u0007p\f_v0V\"", "7r8;56N\\\u0018\r", "1kT.a\u001cI6\u001d\u000e\t", "", "1kT.e", "2hb=T;<Vvz\u0004\\,\u0004", "2hb=T;<Vy\u0003\u0004Z3\\\u001a/n\u000f\u0013wN\u000f", "2hb=T;<V\u0001z~g\f\u000e\t8tj$\nN", "@d\\<i,\u001dS(zxa,{s9i\t7{Md \"W~uFu)6]}- w\u0015.[", "@d\\<i,\"\\*z\u0002b+g\u00133n\u000f(\t$\u007f%rPnk?r.7Y\f", ">nX;g,K7\u0018ove<|", "", "6hc\u001bb+>a", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class NodeParent {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);

    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public boolean buildCache(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z2) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i2 = 0;
        boolean z3 = false;
        do {
            z3 = content[i2].buildCache(longSparseArray, layoutCoordinates, internalPointerEvent, z2) || z3;
            i2++;
        } while (i2 < size);
        return z3;
    }

    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> longSparseArray, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z2) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i2 = 0;
        boolean z3 = false;
        do {
            z3 = content[i2].dispatchMainEventPass(longSparseArray, layoutCoordinates, internalPointerEvent, z2) || z3;
            i2++;
        } while (i2 < size);
        return z3;
    }

    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        boolean z2 = false;
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i2 = 0;
            boolean z3 = false;
            do {
                z3 = content[i2].dispatchFinalEventPass(internalPointerEvent) || z3;
                i2++;
            } while (i2 < size);
            z2 = z3;
        }
        cleanUpHits(internalPointerEvent);
        return z2;
    }

    public void dispatchCancel() {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                content[i2].dispatchCancel();
                i2++;
            } while (i2 < size);
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void removeInvalidPointerIdsAndChanges(long j2, MutableObjectList<Node> mutableObjectList) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                content[i2].removeInvalidPointerIdsAndChanges(j2, mutableObjectList);
                i2++;
            } while (i2 < size);
        }
    }

    public final void removeDetachedPointerInputModifierNodes() {
        int i2 = 0;
        while (i2 < this.children.getSize()) {
            Node node = this.children.getContent()[i2];
            if (!node.getModifierNode().isAttached()) {
                node.dispatchCancel();
                this.children.removeAt(i2);
            } else {
                i2++;
                node.removeDetachedPointerInputModifierNodes();
            }
        }
    }

    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        for (int size = this.children.getSize() - 1; -1 < size; size--) {
            if (this.children.getContent()[size].getPointerIds().isEmpty()) {
                this.children.removeAt(size);
            }
        }
    }
}
