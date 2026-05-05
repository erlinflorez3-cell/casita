package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: CollectionInfo.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!,r\bDZc|\u0004G\u00078\u000b<`\u0007\"B\u0012\u007fјnjG0LeN.ZS@\u000fs{:%c$\bCCU }*\teNog\u0005Jb\u000bI\u000f\u001e*\u0007lDI\u0004w\u000e\u001c\u001d5ZuO5]ok>\u000fx|\u00058H0>\u0012\u0005/!ZL\u001e~\u0013Cy\u0011B4NyRR;WK܅*\u001cL+\u0019\u001e\u000bn~:Vtu:](3mPW?_^\u0007\u0014ε^^5\u0019\u000faL*h7c\u001akم\u001b\u0019`hW\u000b]\u0001e\u0007~&U9w\u0002\u007f6\u0007\u007fZ\u0015Ci\u001bm\u000b.z\u0014yb\"&Y`\u0012\\x\u000eV\n+\u007f\u001bO\u001c\u000e4,\u000f.M0tڜ&3#q{@~\u0002\u0015\u0003Vаcي\u001b)\u001851ݍ)gЈeO"}, d2 = {"7r;.m@\u001c] \u0006z\\;\u0001\u00138", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\b'>m\u0014=QMDO=\u001f\u001f>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#[*>t\u0016,\\GEt\u0018'\u0016r7|{", "1`[0h3:b\u0019b{A6\n\rDo\t7wG\b+\u0005Vk\fBv$", "7sT:f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "Adc\u0010b3ES\u0017\u000e~h5`\u00120o", "", "<nS2", "7mU<", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,2\u007f(Q*X4gN\u0002\u0013", "Adc\u0010b3ES\u0017\u000e~h5`\u0018/mc1|J", "6`b\u0010b3ES\u0017\u000e~h5`\u00120o", "Bn00V,La\u001d{~e0\f\u001d\ro\u0007/{>\u0010\u001b!PS\u0017=\u0001", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,2\u007f(Q*X4gN\u0002{q\u001ca\u0015N)\u001c\tcJ\bwEA|\u00124T}J>", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "Bn00V,La\u001d{~e0\f\u001d\ro\u0007/{>\u0010\u001b!PS\u001d<~\t>Z\b", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,2\u007f(Q*X4gN\u0002{q\u001ca\u0015N)\u001c\tcJ\b}D?\u0003\u0011-S_Ep\f\b%c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\b'>m\u0014=QMDOC\u001e\u001dLj:\u00119", "7sT:A6=S", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CollectionInfo_androidKt {
    public static final void setCollectionInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getCollectionInfo());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return;
        }
        boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(zCalculateIfHorizontallyStacked ? 1 : arrayList2.size(), zCalculateIfHorizontallyStacked ? arrayList2.size() : 1, false, 0));
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode));
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), SemanticsProperties.INSTANCE.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), SemanticsProperties.INSTANCE.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i3);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode$ui_release().getPlaceOrder$ui_release() < semanticsNode.getLayoutNode$ui_release().getPlaceOrder$ui_release()) {
                        i2++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            int i4 = zCalculateIfHorizontallyStacked ? 0 : i2;
            if (!zCalculateIfHorizontallyStacked) {
                i2 = 0;
            }
            AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfoCompatObtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i4, 1, i2, 1, false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return false;
                }
            })).booleanValue());
            if (collectionItemInfoCompatObtain != null) {
                accessibilityNodeInfoCompat.setCollectionItemInfo(collectionItemInfoCompatObtain);
            }
        }
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        return (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        ArrayList arrayListEmptyList;
        long jM3947unboximpl;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            arrayListEmptyList = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i2 = 0;
            while (i2 < lastIndex) {
                i2++;
                SemanticsNode semanticsNode2 = list.get(i2);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                arrayListEmptyList.add(Offset.m3926boximpl(OffsetKt.Offset(Math.abs(Offset.m3937getXimpl(semanticsNode4.getBoundsInRoot().m3967getCenterF1C5BW0()) - Offset.m3937getXimpl(semanticsNode3.getBoundsInRoot().m3967getCenterF1C5BW0())), Math.abs(Offset.m3938getYimpl(semanticsNode4.getBoundsInRoot().m3967getCenterF1C5BW0()) - Offset.m3938getYimpl(semanticsNode3.getBoundsInRoot().m3967getCenterF1C5BW0())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (arrayListEmptyList.size() == 1) {
            jM3947unboximpl = ((Offset) CollectionsKt.first(arrayListEmptyList)).m3947unboximpl();
        } else {
            if (arrayListEmptyList.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objFirst = CollectionsKt.first((List<? extends Object>) arrayListEmptyList);
            int lastIndex2 = CollectionsKt.getLastIndex(arrayListEmptyList);
            if (1 <= lastIndex2) {
                int i3 = 1;
                while (true) {
                    objFirst = Offset.m3926boximpl(Offset.m3942plusMKHz9U(((Offset) objFirst).m3947unboximpl(), ((Offset) arrayListEmptyList.get(i3)).m3947unboximpl()));
                    if (i3 == lastIndex2) {
                        break;
                    }
                    i3++;
                }
            }
            jM3947unboximpl = ((Offset) objFirst).m3947unboximpl();
        }
        return Offset.m3938getYimpl(jM3947unboximpl) < Offset.m3937getXimpl(jM3947unboximpl);
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), AnonymousClass1.INSTANCE)).booleanValue());
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1 */
    /* JADX INFO: compiled from: CollectionInfo.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return false;
        }
    }
}
