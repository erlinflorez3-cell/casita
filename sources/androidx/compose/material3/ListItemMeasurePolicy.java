package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
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
/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0015\"4ߚ\u007f\u0007t\tA0ZeP.XS2\u000f\u0002{<$q$yّCU0}*\tUQog\u0005Jb\u000bY\u000f\u000e\u0016\u000fj4կ]xs\u0012\u00172HrE3cڎm9\u000fsv\bڶ6\"FyMU(+`\u0010%|kK:\u0015`P~>j\u0019]\r*\u0018\u0016@0\u0001Lb\u0016SdM\u001daH6;\u0003\u0018D~Qm8\u0015s\u001dHd';|q/;Oe7չ)]\t\u0011baE\u000eOsC\u000b\u000f.7-Ys\u00068\u0007\tЏ\u0019+U\u0019$rn1\u0013^x\fU-wcyS>8\u0006~\u0014\u0019L\f\u001e\f7J>-Hl6\u0013ay#WN^\u001a^p\u0002+\fD\u001f=&C-I\u001b\u0015WqL)]e}˿\u0011()\u000b~'a_\u001eb\u001b!z\u0006a3a@kJ|\u0013ՒAm\n|)\u0002r*>V\u0018/*\u0013V\u0017S:\fI1%\u0004\u000eXLw|\u0015bxS\u0018XvEPsF;8\u0010$ZrfK\u007f\u0019zf<)MJV/}6\u0016Pl\u0006@91 V_nyl]]8+]ke^\u001fo\u001ceQ^a7\u0018wX\u0012`\b,?jt-X\u0015U\u0004\u001ch`@.BPz\u0016\b}TN:'`D !d0?.t\u0015v\u0019dV̿{ȁރ^j\u0016\u0016bKl)w=\r\t/R\u0005p\u001ej)Y:\u0001x.=Ia;)(e\"\u0017:+(5\u0004$\u0004UndGzn\\\n\u001e\".029\u007f1e\u0013=\u0002YB\u00101]X\u0003maS\")\u000b|(\u0015im\\l8n~:xjxQ\u001b+Ǵvcz&\u000e\u070f\u001c(`è~b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006])Cha/7u}.IQKx4\t\u001foe7\u001b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^5<h\u0002}Av%.VR#k0,%ua$\u0011j0L\u000b|", "u(E", "1`[0h3:b\u0019b\u0004m9\u0001\u0012=i}\u000b{D\u0003\u001a&", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", "7mc?\\5LW\u0017fzZ:\r\u0016/", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1`[0h3:b\u0019b\u0004m9\u0001\u0012=i}\u001a\u007f?\u0010\u001a", "6dX4[;", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo966measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        int iMinIntrinsicWidth;
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        List<? extends Measurable> list5 = list.get(3);
        List<? extends Measurable> list6 = list.get(4);
        long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        float listItemStartPadding = ListItemKt.getListItemStartPadding();
        float listItemEndPadding = ListItemKt.getListItemEndPadding();
        int i2 = measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(listItemStartPadding + listItemEndPadding));
        Measurable measurable = (Measurable) CollectionsKt.firstOrNull((List) list5);
        int iMinIntrinsicWidth2 = measurable != null ? measurable.minIntrinsicWidth(Constraints.m6590getMaxHeightimpl(j2)) : 0;
        Measurable measurable2 = (Measurable) CollectionsKt.firstOrNull((List) list6);
        if (measurable2 != null) {
            iMinIntrinsicWidth = measurable2.minIntrinsicWidth(Constraints.m6590getMaxHeightimpl(j2));
        } else {
            iMinIntrinsicWidth = 0;
        }
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(Constraints.m6591getMaxWidthimpl(jM6582copyZbe2FdA$default), iMinIntrinsicWidth2 + iMinIntrinsicWidth + i2);
        Measurable measurable3 = (Measurable) CollectionsKt.firstOrNull((List) list4);
        float f2 = 2;
        long jM6610offsetNN6EwU = ConstraintsKt.m6610offsetNN6EwU(jM6582copyZbe2FdA$default, -i2, -measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(ListItemKt.m2221verticalPaddingyh95HIg(ListItemType.Companion.m2234invokeZLSjz4$material3_release(CollectionsKt.firstOrNull((List) list3) != null, CollectionsKt.firstOrNull((List) list4) != null, ListItemKt.isSupportingMultilineHeuristic(measureScope, measurable3 != null ? measurable3.minIntrinsicHeight(iSubtractConstraintSafely) : 0))) * f2)));
        Measurable measurable4 = (Measurable) CollectionsKt.firstOrNull((List) list5);
        Placeable placeableMo5514measureBRTryo0 = measurable4 != null ? measurable4.mo5514measureBRTryo0(jM6610offsetNN6EwU) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo5514measureBRTryo0);
        Measurable measurable5 = (Measurable) CollectionsKt.firstOrNull((List) list6);
        Placeable placeableMo5514measureBRTryo02 = measurable5 != null ? measurable5.mo5514measureBRTryo0(ConstraintsKt.m6611offsetNN6EwU$default(jM6610offsetNN6EwU, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo5514measureBRTryo02);
        Measurable measurable6 = (Measurable) CollectionsKt.firstOrNull((List) list2);
        Placeable placeableMo5514measureBRTryo03 = measurable6 != null ? measurable6.mo5514measureBRTryo0(ConstraintsKt.m6611offsetNN6EwU$default(jM6610offsetNN6EwU, -iWidthOrZero2, 0, 2, null)) : null;
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo5514measureBRTryo03);
        Measurable measurable7 = (Measurable) CollectionsKt.firstOrNull((List) list4);
        Placeable placeableMo5514measureBRTryo04 = measurable7 != null ? measurable7.mo5514measureBRTryo0(ConstraintsKt.m6610offsetNN6EwU(jM6610offsetNN6EwU, -iWidthOrZero2, -iHeightOrZero)) : null;
        int iHeightOrZero2 = iHeightOrZero + TextFieldImplKt.heightOrZero(placeableMo5514measureBRTryo04);
        boolean z2 = (placeableMo5514measureBRTryo04 == null || placeableMo5514measureBRTryo04.get(AlignmentLineKt.getFirstBaseline()) == placeableMo5514measureBRTryo04.get(AlignmentLineKt.getLastBaseline())) ? false : true;
        Measurable measurable8 = (Measurable) CollectionsKt.firstOrNull((List) list3);
        Placeable placeableMo5514measureBRTryo05 = measurable8 != null ? measurable8.mo5514measureBRTryo0(ConstraintsKt.m6610offsetNN6EwU(jM6610offsetNN6EwU, -iWidthOrZero2, -iHeightOrZero2)) : null;
        int iM2234invokeZLSjz4$material3_release = ListItemType.Companion.m2234invokeZLSjz4$material3_release(placeableMo5514measureBRTryo05 != null, placeableMo5514measureBRTryo04 != null, z2);
        float fM2221verticalPaddingyh95HIg = ListItemKt.m2221verticalPaddingyh95HIg(iM2234invokeZLSjz4$material3_release);
        MeasureScope measureScope2 = measureScope;
        return ListItemKt.place(measureScope, ListItemKt.m2220calculateWidthyeHjK3Y(measureScope2, TextFieldImplKt.widthOrZero(placeableMo5514measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo5514measureBRTryo02), TextFieldImplKt.widthOrZero(placeableMo5514measureBRTryo03), TextFieldImplKt.widthOrZero(placeableMo5514measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo5514measureBRTryo04), i2, j2), ListItemKt.m2219calculateHeightN4Jib3Y(measureScope2, TextFieldImplKt.heightOrZero(placeableMo5514measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo5514measureBRTryo02), TextFieldImplKt.heightOrZero(placeableMo5514measureBRTryo03), TextFieldImplKt.heightOrZero(placeableMo5514measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo5514measureBRTryo04), iM2234invokeZLSjz4$material3_release, measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(f2 * fM2221verticalPaddingyh95HIg)), j2), placeableMo5514measureBRTryo0, placeableMo5514measureBRTryo02, placeableMo5514measureBRTryo03, placeableMo5514measureBRTryo05, placeableMo5514measureBRTryo04, ListItemType.m2226equalsimpl0(iM2234invokeZLSjz4$material3_release, ListItemType.Companion.m2232getThreeLineAlXitO8()), measureScope.mo704roundToPx0680j_4(listItemStartPadding), measureScope.mo704roundToPx0680j_4(listItemEndPadding), measureScope.mo704roundToPx0680j_4(fM2221verticalPaddingyh95HIg));
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicHeight$1, reason: invalid class name */
    /* JADX INFO: compiled from: ListItem.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i2, AnonymousClass1.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ListItem.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C06601 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C06601 INSTANCE = new C06601();

        C06601() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i2, C06601.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ListItem.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C06611 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C06611 INSTANCE = new C06611();

        C06611() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i2, C06611.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ListItem.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C06621 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C06621 INSTANCE = new C06621();

        C06621() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i2, C06621.INSTANCE);
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        int iIntValue = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list6);
        int iIntValue2 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        int iIntValue3 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int iIntValue4 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        return ListItemKt.m2220calculateWidthyeHjK3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i2)).intValue() : 0, intrinsicMeasureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final int calculateIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        int iIntValue;
        int iIntValue2;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(i2, intrinsicMeasureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        if (intrinsicMeasurable != null) {
            iIntValue = function2.invoke(intrinsicMeasurable, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list6);
        if (intrinsicMeasurable2 != null) {
            iIntValue2 = function2.invoke(intrinsicMeasurable2, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int iIntValue3 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        int iIntValue4 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        int iIntValue5 = intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        int iM2234invokeZLSjz4$material3_release = ListItemType.Companion.m2234invokeZLSjz4$material3_release(iIntValue3 > 0, iIntValue5 > 0, ListItemKt.isSupportingMultilineHeuristic(intrinsicMeasureScope, iIntValue5));
        return ListItemKt.m2219calculateHeightN4Jib3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iM2234invokeZLSjz4$material3_release, intrinsicMeasureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(ListItemKt.m2221verticalPaddingyh95HIg(iM2234invokeZLSjz4$material3_release) * 2)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }
}
