package androidx.compose.runtime.collection;

import android.util.SparseArray;
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
/* JADX INFO: compiled from: ActualIntMap.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDRш|İI\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nj?3LeV.Zݷ2\u000fy\u0005<$a,wّQ٥B\u007f(ޛ]M\u0018g\u001dJ\u001b\u001aI#\u0016\u001c~j:Jmx\f\u0014Ƥ6B}Bs`u=Ij\u0003:\u001d&B$Hy;ЏH/Н\u0014v\tI\u0014\u0010 :Xph]U\\\u0013&*\u0006l-1\"juf6vn$Ƅ/k\u0019wQf)u/3ձ=Jb5%v\u0010 q¯7߱\u0019%a\u0013OkiN\u001b?(ܵ5l55CI\"Yf\\\u000e%-+\u0006Օǁv&j\u0017\u001al\u001a:CO\u0012V\u0001\u00126\u0006\u0013{;>L*\u0014;`.[%\u0017\f\u001cA\rr\u0002B\u0001\u0006lW\u0018z\u0018ا]Ӣ\u007fĴ/9)|\"pI f7*\u0007Cbţ\u0005r9]Z\u0016n\u001ekf\u0006UIWP?XN@ԯkrZ͒d͆.\u00048ϚĲ3\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0012VR#g?s", "\u0013", "", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "AoP?f,\u001a`&z\u000f", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "uKP;W9HW\u0018H\u000bm0\u0004R\u001dp{5\n@\\$$C\u0004c\u007fg", "Ahi2", "5dc \\A>", "u(8", "1kT.e", "", "1n]AT0Ga", "", "9dh", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "D`[BX\u0010?/\u0016\rzg;", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "@d\\<i,", "Adc", "D`[BX", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntMap<E> {
    public static final int $stable = 8;
    private final SparseArray<E> sparseArray;

    private IntMap(SparseArray<E> sparseArray) {
        this.sparseArray = sparseArray;
    }

    public IntMap(int i2) {
        this(new SparseArray(i2));
    }

    public /* synthetic */ IntMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 10 : i2);
    }

    public final boolean contains(int i2) {
        return this.sparseArray.indexOfKey(i2) >= 0;
    }

    public final E get(int i2) {
        return this.sparseArray.get(i2);
    }

    public final E get(int i2, E e2) {
        return this.sparseArray.get(i2, e2);
    }

    public final void set(int i2, E e2) {
        this.sparseArray.put(i2, e2);
    }

    public final void remove(int i2) {
        this.sparseArray.remove(i2);
    }

    public final void clear() {
        this.sparseArray.clear();
    }

    public final int getSize() {
        return this.sparseArray.size();
    }
}
