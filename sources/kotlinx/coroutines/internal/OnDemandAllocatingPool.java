package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDRш|İI\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007lkA0ZeP\u008cZS@\u000fs{:$c$\u007fLCU }*\t]lo˧vJh\u0017K\u000f\f\u0017~̓Bկ}zc܈\u001d1rom3\u000e\u0011M=nuN\u0005N42H\b\b\u0019&:J v)E[\u000e\"0v\u0081hVҫQ\u0007 \u0017\u0014Dh\b,g\u007fNdJ3Қ@w.\u0011uZNUlX|{\u000f\rÙ-Uzo,C@eB]/a\u0012\u001fXkA\u0013?(ܵ3xo29Z\fWdjFϬƦ/O\u0013p;,j\u0019i`:9qc4W^\u000f@w)}cɠ\u0006؝\n'P͓}2t\u000b&?\u0005tc@~\u0004nD\u0010z\u0018اE)VĔ-ݰ\u001ffYĥ\f \\>\u0014\u0005;&yЪpqjb\u0017x\u001d+X\bSGPv׀vX`Բ?ѐ\b\u0006"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u000f>8}(3v\u0015\nTJEi0-\u0019qc$\u0011m3$", "\"", "", ";`g\u0010T7:Q\u001d\u000e\u000f", "", "1qT.g,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\nh]6g\u0005", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuz^", "1n]Ae6EA(z\n^", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "3kT:X5Ma", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015#|\u001b8\u000bz", "Bqh\u0013b9;W\u0018gzp\f\u0004\t7e\t7\n", "7r29b:>R", "", "/k[<V(MS", "1k^@X", "", "AsPAX\u0019>^&~\t^5\f\u0005>i\n1", "", "AsPAX\u0019>^&~\t^5\f\u0005>i\n1:F\u000b&\u001eKx!6t/Bc\u000e/;v\u0016<GAEx4", "BnBAe0GU", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;
    private final Function1<Integer, T> create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandAllocatingPool(int i2, Function1<? super Integer, ? extends T> function1) {
        this.maxCapacity = i2;
        this.create = function1;
        this.elements = new AtomicReferenceArray(i2);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final boolean isClosed(int i2) {
        return (i2 + Integer.MIN_VALUE) - (i2 | Integer.MIN_VALUE) != 0;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i2) {
        this.controlState$volatile = i2;
    }

    private final int tryForbidNewElements() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i2, Integer.MIN_VALUE | i2));
        return i2;
    }

    public final boolean allocate() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE + i2) - (Integer.MIN_VALUE | i2) != 0) {
                return false;
            }
            if (i2 >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i2, i2 + 1));
        getElements().set(i2, this.create.invoke(Integer.valueOf(i2)));
        return true;
    }

    public final List<T> close() {
        int i2;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        while (true) {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 - Integer.MIN_VALUE) - (i2 | Integer.MIN_VALUE) != 0) {
                i2 = 0;
                break;
            }
            if (controlState$volatile$FU.compareAndSet(this, i2, Integer.MIN_VALUE | i2)) {
                break;
            }
        }
        IntRange intRangeUntil = RangesKt.until(0, i2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            do {
                andSet = getElements().getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i2 = controlState$volatile$FU.get(this);
        IntRange intRangeUntil = RangesKt.until(0, (-1) - (((-1) - Integer.MAX_VALUE) | ((-1) - i2)));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getElements().get(((IntIterator) it).nextInt()));
        }
        return arrayList.toString() + ((-1) - (((-1) - i2) | ((-1) - Integer.MIN_VALUE)) != 0 ? "[closed]" : "");
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
