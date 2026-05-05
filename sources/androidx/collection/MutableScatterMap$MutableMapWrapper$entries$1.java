package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import yg.InterfaceC1492Gx;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я7\u001d̉=!,\u000b\bDR\t|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0010nj?1LeVJZݷ2\u000fy{<$a&yCI|\"}(\u000bwMʴmv`ҙ;U\u001f\u0014&\u0005z.YU/ز\"\u0011BB&>aM\u001e<\u0002z\u0003;\u001d `(h\n\u0013\b26X\u0012\u0007zyŷ\u001c\u0014@@'9\u0001\r\u0014\u0019b2\u0014F8\u0001Lb\u0018dDQ\u0005oJ=3\u000fyD^'\u0016ܞ\rO\u001dF\u000b&;v\u0010(qT\u007f;#0k\u00035^\"SKZ\u007fJ\u001dhU-[Y\u0002^Nd\u0010\u0016%+\u0006Օmt6\\;P\u000f\fm˚O,k^\u001c@w)\u0002=R\u0012\u0017\u001e9X<=&v\n\u001e3+ɁcB`\u0002\u0015A.z\u0010@]9H99H3f\u007fg\u0002-\u0017P\n\u0015%03\u000f~-kV\u001e`KÑdya1\b?kH|\u001b ƴmL\u000bp\u0014B\u0004^M0?\n\u0018F#59k9Yܩ{\u0004XD\u001eu3`/g2rVS:nD=Z\u001f\u001ac\\v\u0015y``h.!MR\u0381\u0017\u007f\u0018\u0013V[&<O/Vb\u0018\tw~e]8+_|Eb\u0007}\u001eeIjC7acFРbx$?ra3X\u0015L\u001a +n6#JH\u0019\u0012.P\u001b\u009f\u000eƱ6C\n\u001e:/?\u001dË\u0019]"}, d2 = {"/mS?b0=fb|\u0005e3|\u0007>i\n1E(\u0011&\u0013Dv\u000e*t!Dh}-\u001fi!l5SJg1%\u0015P]Dxp(Y\u0002'T\u000bN5k_v=\"P&", "", "", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "7r4:c;R", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@dc.\\5\u001aZ ", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableScatterMap$MutableMapWrapper$entries$1<K, V> implements Set<Map.Entry<K, V>>, KMutableSet {
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.this$0._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(this.this$0);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!Intrinsics.areEqual(mutableScatterMap.get((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(this.this$0.get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Iterator<? extends Object> it = elements.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (Intrinsics.areEqual(entry.getKey(), mutableScatterMap.keys[i6]) && Intrinsics.areEqual(entry.getValue(), mutableScatterMap.values[i6])) {
                                    break;
                                }
                            } else {
                                mutableScatterMap.removeValueAt(i6);
                                z2 = true;
                                break;
                            }
                        }
                        i3 = 8;
                    }
                    j2 >>= i3;
                }
                if (i4 != i3) {
                    return z2;
                }
            }
            if (i2 == length) {
                return z2;
            }
            i2++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Iterator<? extends Object> it = elements.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (Intrinsics.areEqual(entry.getKey(), mutableScatterMap.keys[i6]) && Intrinsics.areEqual(entry.getValue(), mutableScatterMap.values[i6])) {
                                mutableScatterMap.removeValueAt(i6);
                                z2 = true;
                                break;
                            }
                        }
                        i3 = 8;
                    }
                    j2 >>= i3;
                }
                if (i4 != i3) {
                    return z2;
                }
            }
            if (i2 == length) {
                return z2;
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
    
        r4 = r4 & ((~r4) << 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c1, code lost:
    
        if (((r4 - 9187201950435737472L) - (r4 | (-9187201950435737472L))) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c3, code lost:
    
        r2 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(java.util.Map.Entry<K, V> r21) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1.remove(java.util.Map$Entry):boolean");
    }
}
