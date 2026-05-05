package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.WeakReference;
import defpackage.Architecture;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: SnapshotWeakSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<U\u0007\"2\u0015\u007f\u0007tpA0JhP.`b2\u000f\u0002{<$a(yCI^\"}(\u0013WNugvϺb\u000bY\u000f\u000eǝ~̓Bկ}~c܈\u001d1jom3}ok9!wȥ\t @#\u0001\u000b\u0013\u00172*v''~Qc$\u0012fϋ¤>R\u001bfM5  V /'\rk\\N`l\u0014Ž_'\u0011\u0005ZNUhv|֔\u0011FbCU\u001ao;C@e>E)a!\u001fR\nH3C\u007fU\u001dh]ݐ[M\u0002vNX.\u001d[+̠\u0011]\u0001F%\u0010_\u0002$'Yf*Jח\u0012(}\u001dD(J'&\u0006Ul^=(\f \u001aCv\u0003SvА\u0012`R\u007f)xd=kĵ9{Q)hiai\u001c%њ\b˿\u0011*+Ч\u0007#aX\u001ce5\u001dZ}_8\"XKPf\n\bFDՏ|Ċ\u00066\f\u0382_\u00025\u0006\u001f97'=gG0q\u0014\u0010V\\u\u0007\u000fppckbHv̎\u0005\u0015e:7\u001b1զpʰo^\\X:&e\u001eZ\u0018\f\u001a3\"b\u000bJ5٠\u0014u"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0007h]?tc;$", "\"", "", "u(E", "6`b5X:", "", "5dc\u0015T:AS'=\bn5\f\r7ey5{G\u0001\u0013%G", "u(J\u0016", "Adc\u0015T:AS'=\bn5\f\r7ey5{G\u0001\u0013%G", "uZ8uI", "Ahi2", "", "5dc \\A>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "u(8", "Adc \\A>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "uH\u0018#", "D`[BX:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u007f<r+\"Y~ Dm\u001f,M\u0019", "5dc#T3NS'=\bn5\f\r7ey5{G\u0001\u0013%G", "u(J\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u00175U\u0004\r7n\u0016;ML9k\n", "Adc#T3NS'=\bn5\f\r7ey5{G\u0001\u0013%G", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006h%1_j 8m#.VA;Aw\u000f", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW.v!;F}!7z\u00167KC\u0011", "/cS", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "4h]1", "6`b5", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_\u0004d", "4h]18?:Q(b\u0004],\u0010", ";hS\u0016a+>f", "D`[BX\u000f:a\u001c", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$Dz", "7rE._0=", "7rE._0=\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "@d\\<i,\"T", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;
    private int[] hashes = new int[16];
    private WeakReference<T>[] values = new WeakReference[16];

    public final int getSize$runtime_release() {
        return this.size;
    }

    public final void setSize$runtime_release(int i2) {
        this.size = i2;
    }

    public final int[] getHashes$runtime_release() {
        return this.hashes;
    }

    public final void setHashes$runtime_release(int[] iArr) {
        this.hashes = iArr;
    }

    public final WeakReference<T>[] getValues$runtime_release() {
        return this.values;
    }

    public final void setValues$runtime_release(WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }

    public final boolean add(T t2) {
        int iFind;
        int i2 = this.size;
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(t2);
        if (i2 > 0) {
            iFind = find(t2, iIdentityHashCode);
            if (iFind >= 0) {
                return false;
            }
        } else {
            iFind = -1;
        }
        int i3 = -(iFind + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i2 == length) {
            int i4 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i4];
            int[] iArr = new int[i4];
            int i5 = i3 + 1;
            ArraysKt.copyInto(weakReferenceArr, weakReferenceArr2, i5, i3, i2);
            ArraysKt.copyInto$default(this.values, weakReferenceArr2, 0, 0, i3, 6, (Object) null);
            ArraysKt.copyInto(this.hashes, iArr, i5, i3, i2);
            ArraysKt.copyInto$default(this.hashes, iArr, 0, 0, i3, 6, (Object) null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i6 = i3 + 1;
            ArraysKt.copyInto(weakReferenceArr, weakReferenceArr, i6, i3, i2);
            int[] iArr2 = this.hashes;
            ArraysKt.copyInto(iArr2, iArr2, i6, i3, i2);
        }
        this.values[i3] = new WeakReference<>(t2);
        this.hashes[i3] = iIdentityHashCode;
        this.size++;
        return true;
    }

    public final void removeIf(Function1<? super T, Boolean> function1) {
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= size$runtime_release) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime_release()[i2];
            Architecture architecture = weakReference != null ? (Object) weakReference.get() : null;
            if (architecture != null && !function1.invoke(architecture).booleanValue()) {
                if (i3 != i2) {
                    getValues$runtime_release()[i3] = weakReference;
                    getHashes$runtime_release()[i3] = getHashes$runtime_release()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < size$runtime_release; i4++) {
            getValues$runtime_release()[i4] = null;
            getHashes$runtime_release()[i4] = 0;
        }
        if (i3 != size$runtime_release) {
            setSize$runtime_release(i3);
        }
    }

    private final int find(T t2, int i2) {
        int i3 = this.size - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = this.hashes[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    WeakReference<T> weakReference = this.values[i5];
                    return t2 == (weakReference != null ? weakReference.get() : null) ? i5 : findExactIndex(i5, t2, i2);
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r4.hashes[r2] == r7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return -(r2 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r0 = r4.values[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r0 != r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        r2 = r4.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        r2 = r5 + 1;
        r1 = r4.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r2 >= r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int findExactIndex(int r5, T r6, int r7) {
        /*
            r4 = this;
            int r1 = r5 + (-1)
        L2:
            r3 = 0
            r0 = -1
            if (r0 >= r1) goto Lc
            int[] r0 = r4.hashes
            r0 = r0[r1]
            if (r0 == r7) goto L31
        Lc:
            int r2 = r5 + 1
            int r1 = r4.size
        L10:
            if (r2 >= r1) goto L2e
            int[] r0 = r4.hashes
            r0 = r0[r2]
            if (r0 == r7) goto L1c
        L18:
            int r0 = r2 + 1
            int r0 = -r0
            return r0
        L1c:
            androidx.compose.runtime.WeakReference<T>[] r0 = r4.values
            r0 = r0[r2]
            if (r0 == 0) goto L29
            java.lang.Object r0 = r0.get()
        L26:
            if (r0 != r6) goto L2b
            return r2
        L29:
            r0 = r3
            goto L26
        L2b:
            int r2 = r2 + 1
            goto L10
        L2e:
            int r2 = r4.size
            goto L18
        L31:
            androidx.compose.runtime.WeakReference<T>[] r0 = r4.values
            r0 = r0[r1]
            if (r0 == 0) goto L3b
            java.lang.Object r3 = r0.get()
        L3b:
            if (r3 != r6) goto L3e
            return r1
        L3e:
            int r1 = r1 + (-1)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotWeakSet.findExactIndex(int, java.lang.Object, int):int");
    }

    public final boolean isValid$runtime_release() {
        WeakReference<T> weakReference;
        int i2 = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i2 > length) {
            return false;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = iArr[i4];
            if (i5 < i3 || (weakReference = weakReferenceArr[i4]) == null) {
                return false;
            }
            Object obj = weakReference.get();
            if (obj != null && i5 != ActualJvm_jvmKt.identityHashCode(obj)) {
                return false;
            }
            i4++;
            i3 = i5;
        }
        while (i2 < length) {
            if (iArr[i2] != 0 || weakReferenceArr[i2] != null) {
                return false;
            }
            i2++;
        }
        return true;
    }
}
