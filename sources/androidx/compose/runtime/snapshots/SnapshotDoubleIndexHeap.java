package androidx.compose.runtime.snapshots;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
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
/* JADX INFO: compiled from: SnapshotDoubleIndexHeap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":%\u007f\u0007lrA0ReP.X_0ş\u0002ڔd$\n#2FтY\u001a\f\"Q[\\r\u007fnx\\;G\u001d\u0012.x\u0019.\u0012[\u0007j*\u000f`D6?{[}KQ`#E5$@2Py3\u0003`*\u0011\u001e\u0005\f[K:!`D~Lj\r{\u0007`\u0012NL.\u00146\\\u0016PfNr]HC;\u0003\u0018D\u00173mE\u0015M;U\u0005+\u001b\ty\u001eYB\u007fC#;k\u00035a\fC\u0011D\n=3jm'sW\u0002nNX.#E/]\u0012urT^KQ)\"5Cgcy_>,\u0006\u0014\u0014\rj\u0006>\n5bF-HhN\u000e{z\u0001nXP0m\t\u0005CwD3=\u007fa:i\u001ftcy;GPg\u007f\u0013\u00196#/pg`%\u001an\u00163T&S\b҈LףLN\u0012ԯ\u000ey\u0012sz\u0002X\b\u0007ϝ\f\u009e\u007f\u00116ϏuCi>;!\u001a\u0006\u001fֶsЛ\t`pׅ:nVG:nD9Z\r\u001a`\\d3m\u000f\u0015/\u0093\u001dܖ Z\u000fâ \u0015&d\u0006Eq1\u001eXgh\u0018n$έ\u0016ɻ3f?ժˍo+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-srq6\u000ec\u0010Wu'Z/N(g(", "", "u(E", "4ha@g\rKS\u0019avg+\u0004\t", "", "6`]1_,L", "", "7mS2k", "\nrTA \u0006\u0017", "Ahi2", "5dc \\A>", "u(8", "D`[BX:", "/cS", "D`[BX", "/k[<V(MS{z\u0004]3|", "3mbBe,", "", "/s;2T:M", "4qT2;(GR ~", "6`]1_,", ":nf2f;(`w~{Z<\u0004\u0018", "2dU.h3M", "@d\\<i,", "AgX3g\u000bHe\"", "AgX3g\u001cI", "AvP=", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "D`[6W(MS", "D`[6W(MS{z\u0004]3|", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private int[] values = new int[16];
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        this.handles = iArr;
    }

    public final int getSize() {
        return this.size;
    }

    public static /* synthetic */ int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(i2);
    }

    public final int lowestOrDefault(int i2) {
        return this.size > 0 ? this.values[0] : i2;
    }

    public final int add(int i2) {
        ensure(this.size + 1);
        int i3 = this.size;
        this.size = i3 + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i3] = i2;
        this.index[i3] = iAllocateHandle;
        this.handles[iAllocateHandle] = i3;
        shiftUp(i3);
        return iAllocateHandle;
    }

    public final void remove(int i2) {
        int i3 = this.handles[i2];
        swap(i3, this.size - 1);
        this.size--;
        shiftUp(i3);
        shiftDown(i3);
        freeHandle(i2);
    }

    public final void validate() {
        int i2 = this.size;
        int i3 = 1;
        while (i3 < i2) {
            int i4 = i3 + 1;
            int[] iArr = this.values;
            if (iArr[(i4 >> 1) - 1] > iArr[i3]) {
                throw new IllegalStateException(("Index " + i3 + " is out of place").toString());
            }
            i3 = i4;
        }
    }

    public final void validateHandle(int i2, int i3) {
        int i4 = this.handles[i2];
        if (this.index[i4] != i2) {
            throw new IllegalStateException(("Index for handle " + i2 + " is corrupted").toString());
        }
        if (this.values[i4] != i3) {
            throw new IllegalStateException(("Value for handle " + i2 + " was " + this.values[i4] + " but was supposed to be " + i3).toString());
        }
    }

    private final void shiftUp(int i2) {
        int[] iArr = this.values;
        int i3 = iArr[i2];
        while (i2 > 0) {
            int i4 = ((i2 + 1) >> 1) - 1;
            if (iArr[i4] <= i3) {
                return;
            }
            swap(i4, i2);
            i2 = i4;
        }
    }

    private final void shiftDown(int i2) {
        int i3;
        int[] iArr = this.values;
        int i4 = this.size >> 1;
        while (i2 < i4) {
            int i5 = (i2 + 1) << 1;
            int i6 = i5 - 1;
            if (i5 < this.size && (i3 = iArr[i5]) < iArr[i6]) {
                if (i3 < iArr[i2]) {
                    swap(i5, i2);
                    i2 = i5;
                } else {
                    return;
                }
            } else if (iArr[i6] < iArr[i2]) {
                swap(i6, i2);
                i2 = i6;
            } else {
                return;
            }
        }
    }

    private final void swap(int i2, int i3) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
        int i5 = iArr2[i2];
        iArr2[i2] = iArr2[i3];
        iArr2[i3] = i5;
        iArr3[iArr2[i2]] = i2;
        iArr3[iArr2[i3]] = i3;
    }

    private final void ensure(int i2) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (i2 <= length) {
            return;
        }
        int i3 = length * 2;
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        ArraysKt.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
        ArraysKt.copyInto$default(this.index, iArr3, 0, 0, 0, 14, (Object) null);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i2 = length * 2;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                iArr[i3] = i4;
                i3 = i4;
            }
            ArraysKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i5 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i5];
        return i5;
    }

    private final void freeHandle(int i2) {
        this.handles[i2] = this.firstFreeHandle;
        this.firstFreeHandle = i2;
    }
}
