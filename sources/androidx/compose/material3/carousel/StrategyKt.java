package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Strategy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!4i\bDJc|\u0004O\u000b8\u000b4C\u0007\"B\u0012\u007fјnjG6L͜P.`q2\u000fq~<$q$yCAU\"}8\tWNmnvJh\u0014K\u000f\f\u001e\u0001j:h]ތuH\u001d˰Zom2}sK9xtd\u0004P609\u0012\u0005/\u001cZL\u001ey\u0013Cy\u000eB4NtRR;O5\u001e \u000bV /$\rk\\=`l\fBu#\u001b\u0016PW?e@~]\rtSU\u0017'e,6X7c\u0014UW\u0011\bj[m\u0005ouK\b\u0001'U-yweBp\u007fB\u0017qO%y\u00013t\u0005\u007fb<19]{Q`\u00108w)z;F4\u0012\u00143`.[\u001c-\b&Q\u0003\u0002k@~\u0012\u000fF\u000e\fy6E-079K3f\u007ftk\u001d\\K\u0014\u0005; i\u0001\u0007Mii&f%\u001ddw\u007f0\u007fJmL\\\u0015q=\u001c\u0003!f\u0010+\u001c0u\u0002_\u007f\u001f1/%e]i'/\u0002\u001aHri=\u0005x\u0005a\u0001jHn$\u001f EB!\u0012jFt\u0005\u001aO\u0003b\\\u0015[2l\u0007,\nY t\u001cJ:=\u0010|b\u0019mxgu\nS1\u0017Ag\n\u0004\u0014g;n3cP\u0012\u001a\u0012V\u00050W<\u0011\"\u001ffZ\u0002\u001axt(P4xn\u001e\u0017\u0014D|\u000eC6M\u001244Z3I`#i\u001b\u001epC-\rm|\u0001\u0010-Vc(\u0011\r<t7\u0003\u0017\\\t\u001eu\u001da,+_R1OQM\u0019TTRlB\";\u0007-{0Kur_L\u001b\u001e&Y\n!.\u001agS_A!\u0012\u0017)`\u0004sEd\u0019sxe\u00187|\ry=A\u0017V\u0010\u000ezr<`\u0019P}|G&\u0005\u0004\u000b#6l0}ol\u0013G\u0012\\Q[ƕM\u001c"}, d2 = {"1qT.g,,V\u001d\u007f\n^+b\tCl\u00041{'\u0005%&(y\u001b\u001a\u0001.DY\u0007/\"i\u0015-QL=", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loH\\", "4q^:", "1`a<h:>Z\u0001z~g\b\u0010\r=S\u0004={", "", "7sT:F7:Q\u001d\b|", "1n]AX5M>\u0015}yb5~", ">he<g", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001ej", ">he<g\u0010GR\u0019\u0012", "", "5dc\u0012a+$S-\u0006~g,j\u0018/p\u000e", "", "2dU.h3M9\u0019\u0013\u0002b5|\u0017", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "5dc\u0012a+,V\u001d\u007f\n=0\u000b\u0018+n}(", "3mS\u0018X@EW\"~hm,\b\u0017", "5dc [0?b\u0004\t~g;i\u00058g\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u001cPG<z\u001f(\u0019qp&\u0003l.NL", "AsT=f\nHc\"\u000e", "AgX3g\u0017HW\"\u000e", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~t@\u00054\u000b", "7mc2e7HZ\u0015\u000e~h5", "5dc g(Kb~~\u000fe0\u0006\t\u001dt\u007f3\n", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "5dc g(Kb\u0007\u0002~_;[\r=t{1y@", "AsP?g\u0012>g \u0003\u0004^\u001a\f\t:s", "5dc g,I7\"\u000ezk7\u0007\u0010+t\u00042\u0005+\u000b\u001b V}", "Bnc._\u001aAW\u001a\u000eYb:\f\u00058c\u007f", "AsT=f", "7rB5\\-MW\"\u0001a^-\f", "", ":da=", "=tc=h;&W\"", "=tc=h;&O,", "7m_Bg\u0014B\\", "7m_Bg\u0014:f", "D`[BX", ";ne2>,RZ\u001d\bz:5{f<e{7{.\u0004\u001b\u0018Vo\r\"v9<]\u0007 \u001eq$=", "AqR\u0016a+>f", "2rc\u0016a+>f", ";ne2", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StrategyKt {
    public static final float getStartShiftDistance(List<KeylineList> list, float f2) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) CollectionsKt.first((List) CollectionsKt.last((List) list))).getUnadjustedOffset() - ((Keyline) CollectionsKt.first((List) CollectionsKt.first((List) list))).getUnadjustedOffset(), f2);
    }

    public static final float getEndShiftDistance(List<KeylineList> list, float f2) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) CollectionsKt.last((List) CollectionsKt.first((List) list))).getUnadjustedOffset() - ((Keyline) CollectionsKt.last((List) CollectionsKt.last((List) list))).getUnadjustedOffset(), f2);
    }

    public static final List<KeylineList> getStartKeylineSteps(KeylineList keylineList, float f2, float f3, float f4) {
        if (keylineList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isFirstFocalItemAtStartOfContainer()) {
            if (f4 != 0.0f) {
                arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f2, f3, f4, keylineList.getFirstFocal(), keylineList.getFirstFocalIndex()));
            }
            return arrayList;
        }
        int firstNonAnchorIndex = keylineList.getFirstNonAnchorIndex();
        int firstFocalIndex = keylineList.getFirstFocalIndex() - firstNonAnchorIndex;
        if (firstFocalIndex <= 0 && keylineList.getFirstFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f2, f3));
            return arrayList;
        }
        for (int i2 = 0; i2 < firstFocalIndex; i2++) {
            KeylineList keylineList2 = (KeylineList) CollectionsKt.last((List) arrayList);
            int i3 = firstNonAnchorIndex + i2;
            int lastIndex = CollectionsKt.getLastIndex(keylineList);
            if (i3 > 0) {
                lastIndex = keylineList2.firstIndexAfterFocalRangeWithSize(keylineList.get(i3 - 1).getSize()) - 1;
            }
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getFirstNonAnchorIndex(), lastIndex, f2, f3));
        }
        if (f4 != 0.0f) {
            arrayList.set(CollectionsKt.getLastIndex(arrayList), createShiftedKeylineListForContentPadding((KeylineList) CollectionsKt.last((List) arrayList), f2, f3, f4, ((KeylineList) CollectionsKt.last((List) arrayList)).getFirstFocal(), ((KeylineList) CollectionsKt.last((List) arrayList)).getFirstFocalIndex()));
        }
        return arrayList;
    }

    public static final List<KeylineList> getEndKeylineSteps(KeylineList keylineList, float f2, float f3, float f4) {
        if (keylineList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isLastFocalItemAtEndOfContainer(f2)) {
            if (f4 != 0.0f) {
                arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f2, f3, -f4, keylineList.getLastFocal(), keylineList.getLastFocalIndex()));
            }
            return arrayList;
        }
        int lastFocalIndex = keylineList.getLastFocalIndex();
        int lastNonAnchorIndex = keylineList.getLastNonAnchorIndex();
        int i2 = lastNonAnchorIndex - lastFocalIndex;
        if (i2 <= 0 && keylineList.getLastFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f2, f3));
            return arrayList;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            KeylineList keylineList2 = (KeylineList) CollectionsKt.last((List) arrayList);
            int i4 = lastNonAnchorIndex - i3;
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getLastNonAnchorIndex(), i4 < CollectionsKt.getLastIndex(keylineList) ? keylineList2.lastIndexBeforeFocalRangeWithSize(keylineList.get(i4 + 1).getSize()) + 1 : 0, f2, f3));
        }
        if (f4 != 0.0f) {
            arrayList.set(CollectionsKt.getLastIndex(arrayList), createShiftedKeylineListForContentPadding((KeylineList) CollectionsKt.last((List) arrayList), f2, f3, -f4, ((KeylineList) CollectionsKt.last((List) arrayList)).getLastFocal(), ((KeylineList) CollectionsKt.last((List) arrayList)).getLastFocalIndex()));
        }
        return arrayList;
    }

    private static final KeylineList createShiftedKeylineListForContentPadding(final KeylineList keylineList, float f2, float f3, float f4, Keyline keyline, int i2) {
        KeylineList keylineList2 = keylineList;
        ArrayList arrayList = new ArrayList(keylineList2.size());
        int size = keylineList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Keyline keyline2 = keylineList2.get(i3);
            if (!keyline2.isAnchor()) {
                arrayList.add(keyline2);
            }
        }
        final float size2 = f4 / arrayList.size();
        KeylineList keylineListKeylineListOf = KeylineListKt.keylineListOf(f2, f3, i2, (keyline.getOffset() - (size2 / 2.0f)) + f4, new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                invoke2(keylineListScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeylineListScope keylineListScope) {
                KeylineList keylineList3 = keylineList;
                float f5 = size2;
                int size3 = keylineList3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Keyline keyline3 = keylineList3.get(i4);
                    keylineListScope.add(keyline3.getSize() - Math.abs(f5), keyline3.isAnchor());
                }
            }
        });
        ArrayList arrayList2 = new ArrayList(keylineListKeylineListOf.size());
        int size3 = keylineListKeylineListOf.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList2.add(Keyline.copy$default(keylineListKeylineListOf.get(i4), 0.0f, 0.0f, keylineList.get(i4).getUnadjustedOffset(), false, false, false, 0.0f, 123, null));
        }
        return new KeylineList(arrayList2);
    }

    private static final KeylineList moveKeylineAndCreateShiftedKeylineList(KeylineList keylineList, int i2, int i3, float f2, float f3) {
        int i4 = i2 > i3 ? 1 : -1;
        return KeylineListKt.keylineListOf(f2, f3, keylineList.getPivotIndex() + i4, keylineList.getPivot().getOffset() + (((keylineList.get(i2).getSize() - keylineList.get(i2).getCutoff()) + f3) * i4), new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.StrategyKt.moveKeylineAndCreateShiftedKeylineList.1
            final /* synthetic */ int $dstIndex;
            final /* synthetic */ int $srcIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(int i22, int i32) {
                super(1);
                i = i22;
                i = i32;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                invoke2(keylineListScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(KeylineListScope keylineListScope) {
                List listMove = StrategyKt.move(CollectionsKt.toMutableList((Collection) keylineList), i, i);
                int size = listMove.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Keyline keyline = (Keyline) listMove.get(i5);
                    keylineListScope.add(keyline.getSize(), keyline.isAnchor());
                }
            }
        });
    }

    /* JADX INFO: renamed from: androidx.compose.material3.carousel.StrategyKt$moveKeylineAndCreateShiftedKeylineList$1 */
    /* JADX INFO: compiled from: Strategy.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\u0014MWBo=\u001e{loHta6Yv|", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<KeylineListScope, Unit> {
        final /* synthetic */ int $dstIndex;
        final /* synthetic */ int $srcIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i22, int i32) {
            super(1);
            i = i22;
            i = i32;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
            invoke2(keylineListScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(KeylineListScope keylineListScope) {
            List listMove = StrategyKt.move(CollectionsKt.toMutableList((Collection) keylineList), i, i);
            int size = listMove.size();
            for (int i5 = 0; i5 < size; i5++) {
                Keyline keyline = (Keyline) listMove.get(i5);
                keylineListScope.add(keyline.getSize(), keyline.isAnchor());
            }
        }
    }

    public static final FloatList getStepInterpolationPoints(float f2, List<KeylineList> list, boolean z2) {
        float unadjustedOffset;
        MutableFloatList mutableFloatListMutableFloatListOf = FloatListKt.mutableFloatListOf(0.0f);
        if (f2 == 0.0f || list.isEmpty()) {
            return mutableFloatListMutableFloatListOf;
        }
        IntRange intRangeUntil = RangesKt.until(1, list.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            int i2 = iNextInt - 1;
            KeylineList keylineList = list.get(i2);
            KeylineList keylineList2 = list.get(iNextInt);
            if (z2) {
                unadjustedOffset = ((Keyline) CollectionsKt.first((List) keylineList2)).getUnadjustedOffset() - ((Keyline) CollectionsKt.first((List) keylineList)).getUnadjustedOffset();
            } else {
                unadjustedOffset = ((Keyline) CollectionsKt.last((List) keylineList)).getUnadjustedOffset() - ((Keyline) CollectionsKt.last((List) keylineList2)).getUnadjustedOffset();
            }
            arrayList.add(Boolean.valueOf(mutableFloatListMutableFloatListOf.add(iNextInt == CollectionsKt.getLastIndex(list) ? 1.0f : mutableFloatListMutableFloatListOf.get(i2) + (unadjustedOffset / f2))));
        }
        return mutableFloatListMutableFloatListOf;
    }

    public static final ShiftPointRange getShiftPointRange(int i2, FloatList floatList, float f2) {
        float f3 = floatList.get(0);
        Iterator<Integer> it = RangesKt.until(1, i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            float f4 = floatList.get(iNextInt);
            if (f2 <= f4) {
                return new ShiftPointRange(iNextInt - 1, iNextInt, lerp(0.0f, 1.0f, f3, f4, f2));
            }
            f3 = f4;
        }
        return new ShiftPointRange(0, 0, 0.0f);
    }

    public static final List<Keyline> move(List<Keyline> list, int i2, int i3) {
        Keyline keyline = list.get(i2);
        list.remove(i2);
        list.add(i3, keyline);
        return list;
    }

    public static final float lerp(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : MathHelpersKt.lerp(f2, f3, (f6 - f4) / (f5 - f4));
    }
}
