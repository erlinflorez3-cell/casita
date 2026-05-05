package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: SnapshotIdSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000e^Lc\u0003\nIي8\u000b<I\u0007\"2\u0013\u007f\u0007t}A0JlP.hS2\u000f\u0002{<$a%yCIU\"Ԃ*\teNo˧vJh\u0014KƤ\u000e\u0016\u0007\u00114I[{e\u0012\u001d>JoE3SnSʠ~\u0017f\u000b0428(\u0005/\u0019bG27\"IK\u001c\u0016>A\t:\u0001\u000f]\t(\u0015\u001e>N\u0003.`uRNH\u001b]J51\b\u0002Dd&\u000e6ƊQ\rT[o\u0019\u0005i6+nʺe\u00193\\\u001b\u0007\u0001¹\b\u000fM{U\u0005\u0017ѧW/W|o6\u0007Ü\\!9Z%]!̦\r\t_l$'YO,\u0004^\u001b@w)Ԉ=@\u0012\u001c\u001e'v͓]?t\u0017&T\u0005\u0004cO~\u061cެF\n\u0001rF\u001d+\u0012C-?!\rdq=)Ne{\u0015\u000f.#/͙Ok\u001bלf]6b\fi1\u007fUmX\\ qI}\u0006\u0001b0*\u00142W\u007f]\u0011?E]\u00ad=$E19\u0004\u0002v]\u0018z\u0013l\u0001S\u0018R\u0011M0\t.=:\u000b\u001cZrd3\u0007\u0017ԐXt\u001d[8l\u0007,\bC$j\u0015T!S\u0010\u0017[v\b\u0003M\f܃U3t@qn\u001aލ ElRMQ\u0012߄\u0012V\u0005 W<\u0011\u0005!lPs$Z\u000bIhF\u0019x\u001e|\u0014Fd\u000bA8\u0016ڧ\u001eٜ01!¢eT\u0011\"ZA+\t6ʶjʐ\u0003T;ɴSu2w!\u0001~^Gהi֑M,\u0005ʠr9ORM\u0019TWx־6č'\u0007\u0007͞ûK\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "", "", "Co_2e\u001a>b", "", ":nf2e\u001a>b", ":nf2e\tHc\"}", "0d[<j\tHc\"}", "", "uI9\u0016N\u0010\u0002D", "/mS", "0hc@", "/mS\u001bb;", "1kT.e", "0hc", "4`bA96ER", "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/bR", "4`bA96K3\u0015|}", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "5dc", "", "7sT?T;H`", "", ":nf2f;", "2dU.h3M", "=q", "Adc", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapshotIdSet implements Iterable<Integer>, KMappedMarker {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    private SnapshotIdSet(long j2, long j3, int i2, int[] iArr) {
        this.upperSet = j2;
        this.lowerSet = j3;
        this.lowerBound = i2;
        this.belowBound = iArr;
    }

    public final boolean get(int i2) {
        int[] iArr;
        int i3 = i2 - this.lowerBound;
        if (i3 >= 0 && i3 < 64) {
            long j2 = 1 << i3;
            long j3 = this.lowerSet;
            return (j2 + j3) - (j2 | j3) != 0;
        }
        if (i3 >= 64 && i3 < 128) {
            return (-1) - (((-1) - (1 << (i3 - 64))) | ((-1) - this.upperSet)) != 0;
        }
        if (i3 <= 0 && (iArr = this.belowBound) != null) {
            return SnapshotIdSetKt.binarySearch(iArr, i2) >= 0;
        }
        return false;
    }

    public final SnapshotIdSet set(int i2) {
        int[] intArray;
        int i3 = this.lowerBound;
        int i4 = i2 - i3;
        long j2 = 0;
        if (i4 >= 0 && i4 < 64) {
            long j3 = 1 << i4;
            long j4 = this.lowerSet;
            if ((-1) - (((-1) - j4) | ((-1) - j3)) == 0) {
                return new SnapshotIdSet(this.upperSet, (-1) - (((-1) - j4) & ((-1) - j3)), i3, this.belowBound);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j5 = 1 << (i4 - 64);
            long j6 = this.upperSet;
            if ((-1) - (((-1) - j6) | ((-1) - j5)) == 0) {
                return new SnapshotIdSet((-1) - (((-1) - j6) & ((-1) - j5)), this.lowerSet, i3, this.belowBound);
            }
        } else if (i4 >= 128) {
            if (!get(i2)) {
                long j7 = this.upperSet;
                long j8 = this.lowerSet;
                int i5 = this.lowerBound;
                int i6 = ((i2 + 1) / 64) * 64;
                ArrayList arrayList = null;
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    if (j8 != j2) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            int[] iArr = this.belowBound;
                            if (iArr != null) {
                                for (int i7 : iArr) {
                                    arrayList.add(Integer.valueOf(i7));
                                }
                            }
                        }
                        for (int i8 = 0; i8 < 64; i8++) {
                            long j9 = 1 << i8;
                            if ((j9 + j8) - (j9 | j8) != 0) {
                                arrayList.add(Integer.valueOf(i8 + i5));
                            }
                        }
                        j2 = 0;
                    }
                    if (j7 == j2) {
                        i5 = i6;
                        j8 = j2;
                        break;
                    }
                    i5 += 64;
                    j8 = j7;
                    j7 = j2;
                }
                if (arrayList == null || (intArray = CollectionsKt.toIntArray(arrayList)) == null) {
                    intArray = this.belowBound;
                }
                return new SnapshotIdSet(j7, j8, i5, intArray).set(i2);
            }
        } else {
            int[] iArr2 = this.belowBound;
            if (iArr2 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, i3, new int[]{i2});
            }
            int iBinarySearch = SnapshotIdSetKt.binarySearch(iArr2, i2);
            if (iBinarySearch < 0) {
                int i9 = -(iBinarySearch + 1);
                int length = iArr2.length;
                int[] iArr3 = new int[length + 1];
                ArraysKt.copyInto(iArr2, iArr3, 0, 0, i9);
                ArraysKt.copyInto(iArr2, iArr3, i9 + 1, i9, length);
                iArr3[i9] = i2;
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr3);
            }
        }
        return this;
    }

    public final SnapshotIdSet clear(int i2) {
        int[] iArr;
        int iBinarySearch;
        int i3 = this.lowerBound;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.lowerSet;
            if ((j3 + j2) - (j3 | j2) != 0) {
                return new SnapshotIdSet(this.upperSet, j3 & (~j2), i3, this.belowBound);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.upperSet;
            if ((-1) - (((-1) - j5) | ((-1) - j4)) != 0) {
                return new SnapshotIdSet((-1) - (((-1) - j5) | ((-1) - (~j4))), this.lowerSet, i3, this.belowBound);
            }
        } else if (i4 < 0 && (iArr = this.belowBound) != null && (iBinarySearch = SnapshotIdSetKt.binarySearch(iArr, i2)) >= 0) {
            int length = iArr.length;
            int i5 = length - 1;
            if (i5 == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i5];
            if (iBinarySearch > 0) {
                ArraysKt.copyInto(iArr, iArr2, 0, 0, iBinarySearch);
            }
            if (iBinarySearch < i5) {
                ArraysKt.copyInto(iArr, iArr2, iBinarySearch, iBinarySearch + 1, length);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSetClear;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i2 = snapshotIdSet.lowerBound;
        int i3 = this.lowerBound;
        if (i2 == i3) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j2 = this.upperSet;
                long j3 = ~snapshotIdSet.upperSet;
                return new SnapshotIdSet((j2 + j3) - (j2 | j3), (-1) - (((-1) - this.lowerSet) | ((-1) - (~snapshotIdSet.lowerSet))), i3, iArr2);
            }
        }
        int[] iArr3 = snapshotIdSet.belowBound;
        if (iArr3 != null) {
            snapshotIdSetClear = this;
            for (int i4 : iArr3) {
                snapshotIdSetClear = snapshotIdSetClear.clear(i4);
            }
        } else {
            snapshotIdSetClear = this;
        }
        if (snapshotIdSet.lowerSet != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                long j4 = snapshotIdSet.lowerSet;
                long j5 = 1 << i5;
                if ((j4 + j5) - (j4 | j5) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(snapshotIdSet.lowerBound + i5);
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                long j6 = snapshotIdSet.upperSet;
                long j7 = 1 << i6;
                if ((j6 + j7) - (j6 | j7) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(i6 + 64 + snapshotIdSet.lowerBound);
                }
            }
        }
        return snapshotIdSetClear;
    }

    public final SnapshotIdSet and(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (Intrinsics.areEqual(snapshotIdSet, snapshotIdSet2) || Intrinsics.areEqual(this, snapshotIdSet2)) {
            return snapshotIdSet2;
        }
        int i2 = snapshotIdSet.lowerBound;
        int i3 = this.lowerBound;
        if (i2 == i3) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j2 = this.upperSet;
                long j3 = snapshotIdSet.upperSet;
                long j4 = j2 & j3;
                long j5 = this.lowerSet;
                long j6 = snapshotIdSet.lowerSet;
                return (j4 == 0 && (-1) - (((-1) - j5) | ((-1) - j6)) == 0 && iArr2 == null) ? snapshotIdSet2 : new SnapshotIdSet((j2 + j3) - (j2 | j3), j6 & j5, i3, iArr2);
            }
        }
        int i4 = 0;
        if (this.belowBound == null) {
            int[] iArr3 = this.belowBound;
            if (iArr3 != null) {
                for (int i5 : iArr3) {
                    if (snapshotIdSet.get(i5)) {
                        snapshotIdSet2 = snapshotIdSet2.set(i5);
                    }
                }
            }
            long j7 = 0;
            if (this.lowerSet != 0) {
                int i6 = 0;
                while (i6 < 64) {
                    if ((-1) - (((-1) - this.lowerSet) | ((-1) - (1 << i6))) != j7) {
                        int i7 = this.lowerBound + i6;
                        if (snapshotIdSet.get(i7)) {
                            snapshotIdSet2 = snapshotIdSet2.set(i7);
                        }
                    }
                    i6++;
                    j7 = 0;
                }
            }
            long j8 = 0;
            if (this.upperSet == 0) {
                return snapshotIdSet2;
            }
            while (i4 < 64) {
                if ((-1) - (((-1) - this.upperSet) | ((-1) - (1 << i4))) != j8) {
                    int i8 = i4 + 64 + this.lowerBound;
                    if (snapshotIdSet.get(i8)) {
                        snapshotIdSet2 = snapshotIdSet2.set(i8);
                    }
                }
                i4++;
                j8 = 0;
            }
            return snapshotIdSet2;
        }
        int[] iArr4 = snapshotIdSet.belowBound;
        if (iArr4 != null) {
            for (int i9 : iArr4) {
                if (get(i9)) {
                    snapshotIdSet2 = snapshotIdSet2.set(i9);
                }
            }
        }
        long j9 = 0;
        if (snapshotIdSet.lowerSet != 0) {
            int i10 = 0;
            while (i10 < 64) {
                long j10 = snapshotIdSet.lowerSet;
                long j11 = 1 << i10;
                if ((j10 + j11) - (j10 | j11) != j9) {
                    int i11 = snapshotIdSet.lowerBound + i10;
                    if (get(i11)) {
                        snapshotIdSet2 = snapshotIdSet2.set(i11);
                    }
                }
                i10++;
                j9 = 0;
            }
        }
        if (snapshotIdSet.upperSet == 0) {
            return snapshotIdSet2;
        }
        while (i4 < 64) {
            if ((-1) - (((-1) - snapshotIdSet.upperSet) | ((-1) - (1 << i4))) != 0) {
                int i12 = i4 + 64 + snapshotIdSet.lowerBound;
                if (get(i12)) {
                    snapshotIdSet2 = snapshotIdSet2.set(i12);
                }
            }
            i4++;
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet or(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        SnapshotIdSet snapshotIdSet3 = snapshotIdSet;
        SnapshotIdSet snapshotIdSet4 = EMPTY;
        if (snapshotIdSet3 == snapshotIdSet4) {
            return this;
        }
        if (this == snapshotIdSet4) {
            return snapshotIdSet3;
        }
        int i2 = snapshotIdSet3.lowerBound;
        int i3 = this.lowerBound;
        if (i2 == i3) {
            int[] iArr = snapshotIdSet3.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j2 = this.upperSet;
                long j3 = snapshotIdSet3.upperSet;
                long j4 = (j2 + j3) - (j2 & j3);
                long j5 = this.lowerSet;
                long j6 = snapshotIdSet3.lowerSet;
                return new SnapshotIdSet(j4, (j5 + j6) - (j5 & j6), i3, iArr2);
            }
        }
        int i4 = 0;
        if (this.belowBound == null) {
            int[] iArr3 = this.belowBound;
            if (iArr3 != null) {
                for (int i5 : iArr3) {
                    snapshotIdSet3 = snapshotIdSet3.set(i5);
                }
            }
            if (this.lowerSet != 0) {
                for (int i6 = 0; i6 < 64; i6++) {
                    long j7 = this.lowerSet;
                    long j8 = 1 << i6;
                    if ((j7 + j8) - (j7 | j8) != 0) {
                        snapshotIdSet3 = snapshotIdSet3.set(this.lowerBound + i6);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i4 < 64) {
                    if ((-1) - (((-1) - this.upperSet) | ((-1) - (1 << i4))) != 0) {
                        snapshotIdSet3 = snapshotIdSet3.set(i4 + 64 + this.lowerBound);
                    }
                    i4++;
                }
            }
            return snapshotIdSet3;
        }
        int[] iArr4 = snapshotIdSet3.belowBound;
        if (iArr4 != null) {
            snapshotIdSet2 = this;
            for (int i7 : iArr4) {
                snapshotIdSet2 = snapshotIdSet2.set(i7);
            }
        } else {
            snapshotIdSet2 = this;
        }
        if (snapshotIdSet3.lowerSet != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                long j9 = snapshotIdSet3.lowerSet;
                long j10 = 1 << i8;
                if ((j9 + j10) - (j9 | j10) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.set(snapshotIdSet3.lowerBound + i8);
                }
            }
        }
        if (snapshotIdSet3.upperSet != 0) {
            while (i4 < 64) {
                long j11 = snapshotIdSet3.upperSet;
                long j12 = 1 << i4;
                if ((j11 + j12) - (j11 | j12) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.set(i4 + 64 + snapshotIdSet3.lowerBound);
                }
                i4++;
            }
        }
        return snapshotIdSet2;
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004O\f>éFB-!T\u0018\b\tvjg1re\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fI\u0010\f\u007f\u0010\u0014\n\u0012\u0018\u0018Sy\u0016\n\u001a\u001e\u0014\u001c\"w\u0014\u0004\u0017'W\u001e*\u001c*\u001a.*.`n", f = " :,:<06:\u000e(\u0016'5m*2", i = {0, 0, 1, 1, 2, 2}, l = {295, 300, 307}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aULGOK8:?", "Q[nUi8Q\\D>", "\u0013jjOe\u001aULGOK8:?", "XdfKj", "\u0013jjOe\u001aULGOK8:?", "XdfKj"}, s = {"xQ^", "xQ_", "xQ^", "uQ^", "xQ^", "uQ^"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:8:0x0023). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005b -> B:8:0x0023). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0099 -> B:21:0x007e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c2 -> B:30:0x00b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00de -> B:30:0x00b1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return SequencesKt.sequence(new AnonymousClass1(null)).iterator();
    }

    public final void fastForEach(Function1<? super Integer, Unit> function1) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i2 : iArr) {
                function1.invoke(Integer.valueOf(i2));
            }
        }
        if (this.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                long j2 = this.lowerSet;
                long j3 = 1 << i3;
                if ((j2 + j3) - (j2 | j3) != 0) {
                    function1.invoke(Integer.valueOf(this.lowerBound + i3));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                long j4 = this.upperSet;
                long j5 = 1 << i4;
                if ((j4 + j5) - (j4 | j5) != 0) {
                    function1.invoke(Integer.valueOf(i4 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final int lowest(int i2) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j2 = this.lowerSet;
        if (j2 != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(j2);
        }
        long j3 = this.upperSet;
        return j3 != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(j3) : i2;
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder().append(super.toString()).append(" [");
        SnapshotIdSet snapshotIdSet = this;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotIdSet, 10));
        Iterator<Integer> it = snapshotIdSet.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        return sbAppend.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null)).append(AbstractJsonLexerKt.END_LIST).toString();
    }

    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u0016\"\nX~2CUR6e(", "", "u(E", "\u0013L?!L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "5dc\u0012@\u0017-G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwE8tc;$", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }

    public final SnapshotIdSet fastFold(SnapshotIdSet snapshotIdSet, Function2<? super SnapshotIdSet, ? super Integer, SnapshotIdSet> function2) {
        SnapshotIdSet snapshotIdSetInvoke = snapshotIdSet;
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i2 : iArr) {
                snapshotIdSetInvoke = function2.invoke(snapshotIdSetInvoke, Integer.valueOf(i2));
            }
        }
        if (this.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((-1) - (((-1) - this.lowerSet) | ((-1) - (1 << i3))) != 0) {
                    snapshotIdSetInvoke = function2.invoke(snapshotIdSetInvoke, Integer.valueOf(this.lowerBound + i3));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                long j2 = this.upperSet;
                long j3 = 1 << i4;
                if ((j2 + j3) - (j2 | j3) != 0) {
                    snapshotIdSetInvoke = function2.invoke(snapshotIdSetInvoke, Integer.valueOf(i4 + 64 + this.lowerBound));
                }
            }
        }
        return snapshotIdSetInvoke;
    }
}
