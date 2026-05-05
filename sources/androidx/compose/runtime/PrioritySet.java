package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O%8\u000b<H\u0007\"2\u0012\u007f\u0007tjA0JeP.`\\2\u000fq~:řqҕ\"CiTZ\u00112\u0015UNug\u0007Pj\rS\u000f4\u0018'k߽MU\u0007`Z\u001b@F\b?aR AGf\r63\"z&F\u0001\u001d\u0001H2\u0011\u0014\u0005\u0004[K:\u001axD~Dj\r{\u0007b\u0016\u0014I8\u0001L^0RDT\u0005]h4s\u0015wBf-o2\rM;H\u0003(cǻcӿ/@?ߎտ)`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xIz/B]\r4%m%\u0004", "", ":hbA", "", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "/cS", "", "D`[BX", "7r4:c;R", "", "7r=<g\fF^(\u0013", ">dT8", "B`Z2@(Q", "D`[6W(MS{~vi", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PrioritySet {
    public static final int $stable = 8;
    private final List<Integer> list;

    public PrioritySet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PrioritySet(List<Integer> list) {
        this.list = list;
    }

    public /* synthetic */ PrioritySet(ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? new ArrayList() : arrayList);
    }

    public final void add(int i2) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() == i2) {
                return;
            }
            if (this.list.get(r1.size() - 1).intValue() == i2) {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(i2));
        while (size > 0) {
            int i3 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.list.get(i3).intValue();
            if (i2 <= iIntValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(iIntValue));
            size = i3;
        }
        this.list.set(size, Integer.valueOf(i2));
    }

    public final boolean isEmpty() {
        return this.list.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.list.isEmpty();
    }

    public final int peek() {
        return ((Number) CollectionsKt.first((List) this.list)).intValue();
    }

    public final int takeMax() {
        int iIntValue;
        if (!(this.list.size() > 0)) {
            ComposerKt.composeImmediateRuntimeError("Set is empty");
        }
        int iIntValue2 = this.list.get(0).intValue();
        while (!this.list.isEmpty() && this.list.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.list;
            list.set(0, (Integer) CollectionsKt.last((List) list));
            List<Integer> list2 = this.list;
            list2.remove(list2.size() - 1);
            int size = this.list.size();
            int size2 = this.list.size() >>> 1;
            int i2 = 0;
            while (i2 < size2) {
                int iIntValue3 = this.list.get(i2).intValue();
                int i3 = (i2 + 1) * 2;
                int i4 = i3 - 1;
                int iIntValue4 = this.list.get(i4).intValue();
                if (i3 >= size || (iIntValue = this.list.get(i3).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.list.set(i2, Integer.valueOf(iIntValue4));
                        this.list.set(i4, Integer.valueOf(iIntValue3));
                        i2 = i4;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.list.set(i2, Integer.valueOf(iIntValue));
                    this.list.set(i3, Integer.valueOf(iIntValue3));
                    i2 = i3;
                }
            }
        }
        return iIntValue2;
    }

    public final void validateHeap() {
        int size = this.list.size();
        int i2 = size / 2;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            int i5 = i4 * 2;
            boolean z2 = true;
            if (!(this.list.get(i3).intValue() >= this.list.get(i5 + (-1)).intValue())) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if (i5 < size && this.list.get(i3).intValue() < this.list.get(i5).intValue()) {
                z2 = false;
            }
            if (!z2) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            i3 = i4;
        }
    }
}
