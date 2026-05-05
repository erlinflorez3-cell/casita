package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import yg.InterfaceC1492Gx;

/* JADX INFO: Add missing generic type declarations: [K] */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я3\u001d̉=!,\u000b\bӵLc\u0003\nI\u00066\f6B\r+4\u0012}\tnjGLL͜P.`S2\u000fq}<$iKyCAWB|̝\u000fWdʴ\u0018tZ\\\u001bCEإDw3?WY\u0011]@\u0014bF}EKM&މ\u007ftҽ:\u0005.9jL\b\r\u0019\u001aXM@\u0001\tLc\u0012\"2Pppĥ;WK.Z\fL+\u0019\u001e\u000bs\u0015J\u0011\u0001kGG#1nrR5eH|\u0004ε\rí'˼za,2\tKC#=S1\f\u0003eM\fWwM\u0007x']Ǣw}\u001eJ!\u0006\"$CO;b9:%\u0012_p$-;QsK\u0007ʫV\tAԟ\r\u0005\u0017\u001c\u0018?H\\2Jj\u0016\u0014Kt)ԟ\u0007dؿbB\u000e\u0002*J%8\u00183Y>Kp_jS\u001f^9\f\u0005C̔Q\u000b55$h\u001ct-\u001b\u0003|\u0002;_IUN^\fi=$Վ\u001flH>TBU\u007fG{?/My\u000eٚ;؝%o\u001aJJi\u0005\bÄlh"}, d2 = {"/mS?b0=fb|\u0005e3|\u0007>i\n1E(\u0011&\u0013Dv\u000e*t!Dh}-\u001fi!l5SJg1%\u0015P]Dxp(Y\u0002'T\u000bT,p`1\t", "", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "7r4:c;R", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@dc.\\5\u001aZ ", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableScatterMap$MutableMapWrapper$keys$1<K> implements Set<K>, KMutableSet {
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

    MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
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
    public Iterator<K> iterator() {
        return new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(this.this$0);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends K> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k2) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        boolean z2 = false;
        if (length >= 0) {
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                long j2 = jArr[i2];
                if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.contains(elements, mutableScatterMap.keys[i5])) {
                                mutableScatterMap.removeValueAt(i5);
                                z3 = true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return z3;
                    }
                }
                if (i2 == length) {
                    z2 = z3;
                    break;
                }
                i2++;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        boolean z2 = false;
        if (length >= 0) {
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                long j2 = jArr[i2];
                long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
                if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (CollectionsKt.contains(elements, mutableScatterMap.keys[i5])) {
                                mutableScatterMap.removeValueAt(i5);
                                z3 = true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return z3;
                    }
                }
                if (i2 == length) {
                    z2 = z3;
                    break;
                }
                i2++;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (((-1) - (((-1) - (r4 & ((~r4) << 6))) | ((-1) - (-9187201950435737472L)))) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(java.lang.Object r21) {
        /*
            r20 = this;
            r9 = r20
            androidx.collection.MutableScatterMap<K, V> r8 = r9.this$0
            androidx.collection.ScatterMap r8 = (androidx.collection.ScatterMap) r8
            r10 = r21
            if (r10 == 0) goto Lac
            int r2 = r10.hashCode()
        Le:
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r0
            int r0 = r2 << 16
            r2 = r2 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r1 = (-1) - r2
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r7 = (-1) - r1
            int r6 = r8._capacity
            int r19 = r2 >>> 7
            r19 = r19 & r6
            r18 = 0
        L26:
            long[] r3 = r8.metadata
            int r2 = r19 >> 3
            r0 = 7
            r0 = r19 & r0
            int r1 = r0 << 3
            r15 = r3[r2]
            long r15 = r15 >>> r1
            r17 = 1
            int r2 = r2 + r17
            r13 = r3[r2]
            int r0 = 64 - r1
            long r13 = r13 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            r4 = -1
            long r11 = r4 - r13
            long r2 = r4 - r0
            long r11 = r11 | r2
            long r4 = r4 - r11
            long r4 = r4 | r15
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r13 = r2 - r0
            long r0 = ~r2
            long r11 = r0 + r13
            long r0 = r0 | r13
            long r11 = r11 - r0
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r15
        L5e:
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L8b
            int r0 = java.lang.Long.numberOfTrailingZeros(r11)
            int r0 = r0 >> 3
            int r0 = r0 + r19
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            java.lang.Object[] r0 = r8.keys
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r10)
            if (r0 == 0) goto L85
        L7d:
            if (r1 < 0) goto Laf
            androidx.collection.MutableScatterMap<K, V> r0 = r9.this$0
            r0.removeValueAt(r1)
            return r17
        L85:
            r2 = 1
            long r0 = r11 - r2
            long r11 = r11 & r0
            goto L5e
        L8b:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            r11 = -1
            long r2 = r11 - r4
            long r0 = r11 - r15
            long r2 = r2 | r0
            long r11 = r11 - r2
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L9d
            r1 = -1
            goto L7d
        L9d:
            r0 = 0
            int r18 = r18 + 8
            int r19 = r19 + r18
            int r0 = r19 + r6
            r19 = r19 | r6
            int r0 = r0 - r19
            r19 = r0
            goto L26
        Lac:
            r2 = 0
            goto Le
        Laf:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1.remove(java.lang.Object):boolean");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
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
            if (!mutableScatterMap.containsKey((K) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.this$0.containsKey((K) obj);
    }
}
