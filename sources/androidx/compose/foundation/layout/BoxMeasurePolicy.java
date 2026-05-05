package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r+4\u0012}\u000bnjGӄL͜P.`Y2şs{B0cҕyCQU\"}8\tWȞog|hb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0013\u0015˳H\u0006ЀcM\u001e<ys\u0005:\u0013 J\"fz\u0015\u0005(,`\u0010%}ŲO\f 4\twHW%M3\u001bXĢ?h\b,b\u007fNdK3Ӛ;w>\u0011pZNUڿ`\u0003S\rTT?\r%bN1F7C\u0017=S1\n\u0019Ā>KP\u007fE\u001dhU*[O\u0002`NZ\u0016\u0013C5\u0016֬^;-j\u0010i`:3q֩b\u0014W\u001c5\u0010z*\u001b\u0003Ƞ\rNQV=E\u001a\u0015\u001863#\u0004\u0004J^\u0014vH\u0010|q6E9.F[=){iai/\u0015K\u009e\u0004ټ̷'\u0003t8il^l#\u001blw\u007f2(̸?˓R\naƝ>\u0010~d\u001a*23\u001eČ1ɨ\u0015.\u001f¦ڞ[>+$qɗdrfС\ty"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7r8`+;gB.\"hLC\u000eg*bL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", ">q^=T.:b\u0019f~g\n\u0007\u0012=t\r$\u007fI\u0010%", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D/rc(", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class BoxMeasurePolicy implements MeasurePolicy {
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    private final Alignment component1() {
        return this.alignment;
    }

    private final boolean component2() {
        return this.propagateMinConstraints;
    }

    public static /* synthetic */ BoxMeasurePolicy copy$default(BoxMeasurePolicy boxMeasurePolicy, Alignment alignment, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            alignment = boxMeasurePolicy.alignment;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = boxMeasurePolicy.propagateMinConstraints;
        }
        return boxMeasurePolicy.copy(alignment, z2);
    }

    public final BoxMeasurePolicy copy(Alignment alignment, boolean z2) {
        return new BoxMeasurePolicy(alignment, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return Intrinsics.areEqual(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }

    public BoxMeasurePolicy(Alignment alignment, boolean z2) {
        this.alignment = alignment;
        this.propagateMinConstraints = z2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo375measure3p2s80s(final MeasureScope measureScope, final List<? extends Measurable> list, long j2) {
        final int iM6593getMinWidthimpl;
        final int iM6592getMinHeightimpl;
        final Placeable placeableMo5514measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m6593getMinWidthimpl(j2), Constraints.m6592getMinHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        long jM6582copyZbe2FdA$default = this.propagateMinConstraints ? j2 : Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            final Measurable measurable = list.get(0);
            if (!BoxKt.getMatchesParentSize(measurable)) {
                placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(jM6582copyZbe2FdA$default);
                iM6593getMinWidthimpl = Math.max(Constraints.m6593getMinWidthimpl(j2), placeableMo5514measureBRTryo0.getWidth());
                iM6592getMinHeightimpl = Math.max(Constraints.m6592getMinHeightimpl(j2), placeableMo5514measureBRTryo0.getHeight());
            } else {
                iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
                iM6592getMinHeightimpl = Constraints.m6592getMinHeightimpl(j2);
                placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.Companion.m6601fixedJhjzzOo(Constraints.m6593getMinWidthimpl(j2), Constraints.m6592getMinHeightimpl(j2)));
            }
            return MeasureScope.layout$default(measureScope, iM6593getMinWidthimpl, iM6592getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    BoxKt.placeInBox(placementScope, placeableMo5514measureBRTryo0, measurable, measureScope.getLayoutDirection(), iM6593getMinWidthimpl, iM6592getMinHeightimpl, this.alignment);
                }
            }, 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = Constraints.m6593getMinWidthimpl(j2);
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = Constraints.m6592getMinHeightimpl(j2);
        int size = list.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable2 = list.get(i2);
            if (BoxKt.getMatchesParentSize(measurable2)) {
                z2 = true;
            } else {
                Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(jM6582copyZbe2FdA$default);
                placeableArr[i2] = placeableMo5514measureBRTryo02;
                intRef.element = Math.max(intRef.element, placeableMo5514measureBRTryo02.getWidth());
                intRef2.element = Math.max(intRef2.element, placeableMo5514measureBRTryo02.getHeight());
            }
        }
        if (z2) {
            long jConstraints = ConstraintsKt.Constraints(intRef.element != Integer.MAX_VALUE ? intRef.element : 0, intRef.element, intRef2.element != Integer.MAX_VALUE ? intRef2.element : 0, intRef2.element);
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Measurable measurable3 = list.get(i3);
                if (BoxKt.getMatchesParentSize(measurable3)) {
                    placeableArr[i3] = measurable3.mo5514measureBRTryo0(jConstraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, intRef.element, intRef2.element, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr2 = placeableArr;
                List<Measurable> list2 = list;
                MeasureScope measureScope2 = measureScope;
                Ref.IntRef intRef3 = intRef;
                Ref.IntRef intRef4 = intRef2;
                BoxMeasurePolicy boxMeasurePolicy = this;
                int length = placeableArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    Placeable placeable = placeableArr2[i4];
                    Intrinsics.checkNotNull(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    BoxKt.placeInBox(placementScope, placeable, list2.get(i5), measureScope2.getLayoutDirection(), intRef3.element, intRef4.element, boxMeasurePolicy.alignment);
                    i4++;
                    i5++;
                }
            }
        }, 4, null);
    }
}
