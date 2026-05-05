package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
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
/* JADX INFO: compiled from: CircularIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":%\u007f\u0007lpA0ReP.XX2\u000fy\u0005<$a)\bّkUH|b\u0018USwmtJh\u000b[\u000f4\u0017ѱn,WWAi \u001cJB\u001eMcQ}LQ`#7M,@2Py3\u000fJ.V\u001f\u000fzqLT\u0016>Q\t:\u0001\u001b\u0016\u000b($\u001e>N\u000fd\\0]D[\u0005]h0S\u0007wVf'\u000e1Cո\r\u000fX5\"\u000faLA\t;C,=S1\b\u001b_M\u001bWqk\u0006135Das\u0006D\t\u0004\"/CO;^;2j i`:5[Sqeh\u000eVxC\u007f\u001bX\u001c\u000e4(\u0019:;\u001d~\b<4KɄ_ĖT\u0002fۍP\u0007o:/%.8\u0002ݐ'ƻUaCϊ\u001fF\n\u000b%\u001eQ\u0002%eƟX\u0012x\u0017![\u0006Y\u0002]NF`N8Z\u0014Ъ\u0010Ͳf\u00022ʶ\u0001V\u000e9\u0014\u0011\\\u0018[{٦='9m\bSRoG\u0011ntki\u0001I\u0017̑zގ;*\u0011ȱʗH\u0002"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n^\u001b$E\u007f\u00158\u0004\t>hY-Di*\u0004", "", ";h]\u0010T7:Q\u001d\u000e\u000f", "", "uH\u0018#", "1`_.V0Mgu\u0003\nf(\u000b\u000f", "3kT:X5Ma", "", "4ha@g", "5dc\u0013\\9Lb", "u(8", "6dP1", ":`bA", "5dc\u0019T:M", "B`X9", "/cS\u0013\\9Lb", "", "3kT:X5M", "/cS\u0019T:M", "1kT.e", "2nd/_,\u001cO$zxb;\u0011", "5dc", "7mS2k", "7r4:c;R", "", ">n_\u0013\\9Lb", ">n_\u0019T:M", "@d\\<i,\u001f`#\u0007Zg+", "1nd;g", "@d\\<i,\u001f`#\u0007hm(\n\u0018", "Ahi2", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CircularIntArray {
    private int capacityBitmask;
    private int[] elements;
    private int head;
    private int tail;

    public CircularIntArray() {
        this(0, 1, null);
    }

    public CircularIntArray(int i2) {
        if (!(i2 >= 1)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i2 <= 1073741824)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.capacityBitmask = i2 - 1;
        this.elements = new int[i2];
    }

    public /* synthetic */ CircularIntArray(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 8 : i2);
    }

    private final void doubleCapacity() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i2 = this.head;
        int i3 = length - i2;
        int i4 = length << 1;
        if (i4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i4];
        ArraysKt.copyInto(iArr, iArr2, 0, i2, length);
        ArraysKt.copyInto(this.elements, iArr2, i3, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i4 - 1;
    }

    public final void addFirst(int i2) {
        int i3 = this.head - 1;
        int i4 = this.capacityBitmask;
        int i5 = (i3 + i4) - (i3 | i4);
        this.head = i5;
        this.elements[i5] = i2;
        if (i5 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(int i2) {
        int[] iArr = this.elements;
        int i3 = this.tail;
        iArr[i3] = i2;
        int i4 = (-1) - (((-1) - this.capacityBitmask) | ((-1) - (i3 + 1)));
        this.tail = i4;
        if (i4 == this.head) {
            doubleCapacity();
        }
    }

    public final int popFirst() {
        int i2 = this.head;
        if (i2 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.elements[i2];
        this.head = (-1) - (((-1) - (i2 + 1)) | ((-1) - this.capacityBitmask));
        return i3;
    }

    public final int popLast() {
        int i2 = this.head;
        int i3 = this.tail;
        if (i2 == i3) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = i3 - 1;
        int i5 = this.capacityBitmask;
        int i6 = (i5 + i4) - (i5 | i4);
        int i7 = this.elements[i6];
        this.tail = i6;
        return i7;
    }

    public final void clear() {
        this.tail = this.head;
    }

    public final void removeFromStart(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.head + i2;
        int i4 = this.capacityBitmask;
        this.head = (i4 + i3) - (i4 | i3);
    }

    public final void removeFromEnd(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.tail = this.capacityBitmask & (this.tail - i2);
    }

    public final int getFirst() {
        int i2 = this.head;
        if (i2 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.elements[i2];
    }

    public final int getLast() {
        int i2 = this.head;
        int i3 = this.tail;
        if (i2 == i3) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] iArr = this.elements;
        int i4 = i3 - 1;
        int i5 = this.capacityBitmask;
        return iArr[(i4 + i5) - (i4 | i5)];
    }

    public final int get(int i2) {
        if (i2 < 0 || i2 >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.elements[(-1) - (((-1) - this.capacityBitmask) | ((-1) - (this.head + i2)))];
    }

    public final int size() {
        int i2 = this.tail - this.head;
        int i3 = this.capacityBitmask;
        return (i2 + i3) - (i2 | i3);
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }
}
