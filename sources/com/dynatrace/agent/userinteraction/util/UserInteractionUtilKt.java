package com.dynatrace.agent.userinteraction.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsProperties;
import com.dynatrace.agent.userinteraction.model.DTBasicTextModifier;
import com.dynatrace.agent.userinteraction.model.DTUserInteractionsModifier;
import com.dynatrace.agent.userinteraction.model.TouchAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,\n\bDRo|\u0004G\u00078\u000bDB\u0007\"B\u0012\u007fјnjG6LeN.ZS8\u0018sڔ<$q$yCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u001a\u0011\u0005:Lmx\f\u001672pto7[uU9\u000f{f\t.::8(\fGɝBb\u001e\u007f\u0013Cy\u0016:0ntjV\u001bS\u001d\u001a@\rn$\u000f&tg|=\u000fluD=.\u001bipZO_^\n\u0014ε^`5\u001b\u000fc4*n7]\u0015SbIޗjeM\u0013Wqk\u0016\u0011'U:\u0010֕o@f\u0012,\u0015YY5]!5#\u0005il\u001a:CQyJ~\u000ePw)\u000bSɝ\u001c\u001a\u0014;`0C\u0019\u0015\b63#\u0002\u001aóh\u000elW\u0018|w5E%(3YHaƘikI/f7*\u000f5\u001eQ\u00105ď{l\u001c֫-!dya1\u007f@kG%ˤ[ǀq\nxç\u001a,\n1U\u0002¤\u007f("}, d2 = {"\u0011K8\u0010>\b\u001b:xxbH\u000b`i\u0013El\"d\u001chv\u0005", "", "", "5dc\u0010?\u0010\u001c9t[a>&dr\u000eI`\f[-z\u007fr/O{", "u(;7T=:\u001d)\u000e~euj\t>;", "4h]1G6ID\u001d~\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "F", "", "G", "7r?<\\5M7\"[\u0005n5{\u0017", "", "5dc\u000eV;B]\"gvf,", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<ba;R\u00010\u001d", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "5dc\u0010h:M]!by", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "5dc\u000ee,:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "7rE._0=", "5dc\u0010h:M]!gvf,", "5dc!X?M", "5dc\u001fb3>", "7r29\\*DO\u0016\u0006z", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UserInteractionUtilKt {
    private static final Set<String> CLICKABLE_MODIFIER_NAMES = SetsKt.setOf((Object[]) new String[]{"androidx.compose.foundation.ClickableElement", "androidx.compose.foundation.CombinedClickableElement"});

    public static final View findTopView(ViewGroup viewGroup, int i2, int i3) {
        View childAt;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        ViewGroup viewGroup2 = viewGroup;
        if (!isPointInBounds(viewGroup2, i2, i3)) {
            return viewGroup2;
        }
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (-1 >= childCount) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            Intrinsics.checkNotNull(childAt);
            if (!isPointInBounds(childAt, i2, i3)) {
                childCount--;
            } else if (childAt instanceof ViewGroup) {
                childAt = findTopView((ViewGroup) childAt, i2, i3);
            }
        }
        return childAt == null ? viewGroup2 : childAt;
    }

    public static final TouchAction getActionName(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        int action = motionEvent.getAction();
        return action != 0 ? action != 1 ? action != 2 ? action != 5 ? action != 6 ? TouchAction.UNKNOWN : TouchAction.POINTER_UP : TouchAction.POINTER_DOWN : TouchAction.MOVE : TouchAction.UP : TouchAction.DOWN;
    }

    public static final Rect getArea(LayoutInfo layoutInfo) {
        Intrinsics.checkNotNullParameter(layoutInfo, "<this>");
        return !isValid(layoutInfo) ? Rect.Companion.getZero() : LayoutCoordinatesKt.boundsInWindow(layoutInfo.getCoordinates());
    }

    public static final Set<String> getCLICKABLE_MODIFIER_NAMES() {
        return CLICKABLE_MODIFIER_NAMES;
    }

    public static final String getCustomId(LayoutInfo layoutInfo) {
        Object next;
        Intrinsics.checkNotNullParameter(layoutInfo, "<this>");
        List<ModifierInfo> modifierInfo = layoutInfo.getModifierInfo();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(modifierInfo, 10));
        Iterator<T> it = modifierInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(((ModifierInfo) it.next()).getModifier());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof DTUserInteractionsModifier) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((DTUserInteractionsModifier) next).getCustomId() != null) {
                break;
            }
        }
        DTUserInteractionsModifier dTUserInteractionsModifier = (DTUserInteractionsModifier) next;
        if (dTUserInteractionsModifier != null) {
            return dTUserInteractionsModifier.getCustomId();
        }
        return null;
    }

    public static final String getCustomName(LayoutInfo layoutInfo) {
        Object next;
        Intrinsics.checkNotNullParameter(layoutInfo, "<this>");
        List<ModifierInfo> modifierInfo = layoutInfo.getModifierInfo();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(modifierInfo, 10));
        Iterator<T> it = modifierInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(((ModifierInfo) it.next()).getModifier());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof DTUserInteractionsModifier) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((DTUserInteractionsModifier) next).getCustomName() != null) {
                break;
            }
        }
        DTUserInteractionsModifier dTUserInteractionsModifier = (DTUserInteractionsModifier) next;
        if (dTUserInteractionsModifier != null) {
            return dTUserInteractionsModifier.getCustomName();
        }
        return null;
    }

    public static final String getRole(LayoutInfo layoutInfo) {
        Intrinsics.checkNotNullParameter(layoutInfo, "<this>");
        Sequence sequenceFilter = SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(layoutInfo.getModifierInfo()), new Function1() { // from class: com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserInteractionUtilKt.getRole$lambda$6((ModifierInfo) obj);
            }
        }), new Function1<Object, Boolean>() { // from class: com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt$getRole$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof SemanticsModifier);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        String str = (String) SequencesKt.firstOrNull(SequencesKt.map(SequencesKt.filter(sequenceFilter, new Function1() { // from class: com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UserInteractionUtilKt.getRole$lambda$7((SemanticsModifier) obj));
            }
        }), new Function1() { // from class: com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserInteractionUtilKt.getRole$lambda$8((SemanticsModifier) obj);
            }
        }));
        if (str != null) {
            return str;
        }
        if (getText(layoutInfo) != null) {
            return "Text";
        }
        return null;
    }

    public static final Modifier getRole$lambda$6(ModifierInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getModifier();
    }

    public static final boolean getRole$lambda$7(SemanticsModifier it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSemanticsConfiguration().contains(SemanticsProperties.INSTANCE.getRole());
    }

    public static final String getRole$lambda$8(SemanticsModifier it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Role.m5931toStringimpl(((Role) it.getSemanticsConfiguration().get(SemanticsProperties.INSTANCE.getRole())).m5932unboximpl());
    }

    public static final String getText(LayoutInfo layoutInfo) {
        Object next;
        Intrinsics.checkNotNullParameter(layoutInfo, "<this>");
        if (layoutInfo.getModifierInfo().isEmpty()) {
            return null;
        }
        Iterator<T> it = layoutInfo.getModifierInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ModifierInfo) next).getModifier() instanceof DTBasicTextModifier) {
                break;
            }
        }
        ModifierInfo modifierInfo = (ModifierInfo) next;
        if (modifierInfo == null) {
            return null;
        }
        Modifier modifier = modifierInfo.getModifier();
        Intrinsics.checkNotNull(modifier, "null cannot be cast to non-null type com.dynatrace.agent.userinteraction.model.DTBasicTextModifier");
        return ((DTBasicTextModifier) modifier).getText();
    }

    public static final boolean isClickable(LayoutInfo layoutInfo) {
        Intrinsics.checkNotNullParameter(layoutInfo, "<this>");
        List<ModifierInfo> modifierInfo = layoutInfo.getModifierInfo();
        if ((modifierInfo instanceof Collection) && modifierInfo.isEmpty()) {
            return false;
        }
        Iterator<T> it = modifierInfo.iterator();
        while (it.hasNext()) {
            String string = ((ModifierInfo) it.next()).getModifier().toString();
            Set<String> set = CLICKABLE_MODIFIER_NAMES;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (StringsKt.contains$default((CharSequence) string, (CharSequence) it2.next(), false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean isPointInBounds(View view, int i2, int i3) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        return i2 >= i4 && i2 <= i4 + view.getWidth() && i3 >= i5 && i3 <= i5 + view.getHeight();
    }

    private static final boolean isValid(LayoutInfo layoutInfo) {
        return layoutInfo.isAttached() && layoutInfo.isPlaced() && layoutInfo.getWidth() > 0 && layoutInfo.getHeight() > 0 && layoutInfo.getCoordinates().isAttached();
    }
}
