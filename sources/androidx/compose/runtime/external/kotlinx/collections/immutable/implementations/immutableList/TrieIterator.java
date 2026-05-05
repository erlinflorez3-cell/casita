package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
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
/* JADX INFO: compiled from: TrieIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDZc|İI\u0006>\u001a6B\rӬ4ߚ\u007f\u0007tpA0JgP.`\\2\u000fq~<$i$yCA[ Ԃ8ޛwRm˧|Ix\ns\u0015\u0016\u0018\tjrH\u0004x\u001e=\u001f>PpW;]sM;vsd\bN42<\b\t\u0019\u001aXM z\tIc\f@5PtHY%M3\u001fŪ\n>.\tfgu[NH#җ\u0001/ݭ\u0007iP\\ou>\fe\rtdW\u0011\u0005e6+n<e\u00193d\u001b\u0007\u0001`\u0006\u0003\b\u007fK\u0017\u0001'U;yweIp\u007fB\u001aqOUi\u0001:t\u0005\bӠR˃+յgK^\u001cp\u0003\t\u0011%<:\u05faL;ρ2-(tPCA\u000b\u000bSn`2jP\u0001\u0013iF\u001b5\u0002I*g\u001e\u0015S\u0012?'RO{3\u0012N'\u000ft9[\u0003\u0013\u0011\u0019)[\u0010Q_V\u0007׀˓R\f_T{\fAn\u00101\u001c0u\u0005\u0006Ɉ\u001dѧ\u001b%?ك\n//t\u001aHrqMݖlĈWiZ̲\u00118|!O2\u0019\u0010jFz\u0004\u001aS\u0003Z\u0003ҍYɟX\t\u0006\b!,Ϩ{T"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVC\u0004\u0003E)LUYluVKR8", "\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp)Z\u001eVCprO8uBWn`KOTF9d\u0019[,fG\u0010", "@n^A", "", "", "7mS2k", "", "Ahi2", "6dX4[;", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dzZ8", "7r8;E0@V(^y`,", "", ">`c5", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "3kT:X5M/(\\\u000bk9|\u0012>I\t'{S", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "4h[9C(MV", "", "AsP?g\u0013>d\u0019\u0006", "4h[9C(MV|\u007fc^,{\t.", "7mS2k\u0017KS\u0018\u0003xZ;|", "<dgA", ">qTC\\6Na", "@db2g", "@db2gjKc\"\u000e~f,v\u0016/l\u007f$\n@", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TrieIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 8;
    private int height;
    private boolean isInRightEdge;
    private Object[] path;

    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public TrieIterator(Object[] objArr, int i2, int i3, int i4) {
        super(i2, i3);
        this.height = i4;
        Object[] objArr2 = new Object[i4];
        this.path = objArr2;
        ?? r02 = i2 == i3 ? 1 : 0;
        this.isInRightEdge = r02;
        objArr2[0] = objArr;
        fillPath(i2 - r02, 1);
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final void reset$runtime_release(Object[] objArr, int i2, int i3, int i4) {
        setIndex(i2);
        setSize(i3);
        this.height = i4;
        if (this.path.length < i4) {
            this.path = new Object[i4];
        }
        this.path[0] = objArr;
        ?? r1 = i2 == i3 ? 1 : 0;
        this.isInRightEdge = r1;
        fillPath(i2 - r1, 1);
    }

    private final void fillPath(int i2, int i3) {
        int i4 = (this.height - i3) * 5;
        while (i3 < this.height) {
            Object[] objArr = this.path;
            Object obj = objArr[i3 - 1];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i3] = ((Object[]) obj)[UtilsKt.indexSegment(i2, i4)];
            i4 -= 5;
            i3++;
        }
    }

    private final void fillPathIfNeeded(int i2) {
        int i3 = 0;
        while (UtilsKt.indexSegment(getIndex(), i3) == i2) {
            i3 += 5;
        }
        if (i3 > 0) {
            fillPath(getIndex(), ((this.height - 1) - (i3 / 5)) + 1);
        }
    }

    private final E elementAtCurrentIndex() {
        int index = (-1) - (((-1) - getIndex()) | ((-1) - 31));
        Object obj = this.path[this.height - 1];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[index];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eElementAtCurrentIndex = elementAtCurrentIndex();
        setIndex(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.isInRightEdge = true;
            return eElementAtCurrentIndex;
        }
        fillPathIfNeeded(0);
        return eElementAtCurrentIndex;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        setIndex(getIndex() - 1);
        if (this.isInRightEdge) {
            this.isInRightEdge = false;
            return elementAtCurrentIndex();
        }
        fillPathIfNeeded(31);
        return elementAtCurrentIndex();
    }
}
