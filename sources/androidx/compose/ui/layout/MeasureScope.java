package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:254)
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
/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@MeasureScopeMarker
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4\u0012}\u0007njGRLe^.Zݷ2\u000f\u0002{<$q$yCIU\"}8\tWȞog\u0005JbŏIt\u001cǝ)jZH\u001e[k\u0012'2ppo7[qU9\u000fwf\t.6:8(\b1,0H\u001e{\u0013O[\u000e\"0nwJT\u001dM3\u001d@\fn9\u0007\u001ejofIXnm:]-\u0013kRNUjF{{\u0016ТX'\u0013\u0003\u001239MOF%'c\u00035`kA\u0013? H3qҊ++O\u007f\u001eJ!E\"\u0015CO;^#*j\u0007i`:*[SqOh\u000eVz+\u000e\u0013<\u0012\u0013\u001e3X0=\u001a\u0015\u000f\u001e5\u0005r\u0002C~\b\u000fW\u000e\byG''\u00103YG+haai$|@߉\t\r$/G\u0003ƈZ٪ט`\u0019#V}p_P͞AWޑ\u000eZ"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "EhSA[", "", "6dX4[;", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X4>\\([\u0002h*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface MeasureScope extends IntrinsicMeasureScope {

    /* JADX INFO: compiled from: MeasureScope.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope measureScope) {
            return MeasureScope.super.isLookingAhead();
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public static int m5556roundToPxR2X_6o(MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo703roundToPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public static int m5557roundToPx0680j_4(MeasureScope measureScope, float f2) {
            return MeasureScope.super.mo704roundToPx0680j_4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public static float m5558toDpGaN1DYA(MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo705toDpGaN1DYA(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m5559toDpu2uoSUM(MeasureScope measureScope, float f2) {
            return MeasureScope.super.mo706toDpu2uoSUM(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m5560toDpu2uoSUM(MeasureScope measureScope, int i2) {
            return MeasureScope.super.mo707toDpu2uoSUM(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public static long m5561toDpSizekrfVVM(MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo708toDpSizekrfVVM(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public static float m5562toPxR2X_6o(MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo709toPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public static float m5563toPx0680j_4(MeasureScope measureScope, float f2) {
            return MeasureScope.super.mo710toPx0680j_4(f2);
        }

        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            return MeasureScope.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public static long m5564toSizeXkaWNTQ(MeasureScope measureScope, long j2) {
            return MeasureScope.super.mo711toSizeXkaWNTQ(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public static long m5565toSp0xMU5do(MeasureScope measureScope, float f2) {
            return MeasureScope.super.mo712toSp0xMU5do(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m5566toSpkPz2Gy4(MeasureScope measureScope, float f2) {
            return MeasureScope.super.mo713toSpkPz2Gy4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m5567toSpkPz2Gy4(MeasureScope measureScope, int i2) {
            return MeasureScope.super.mo714toSpkPz2Gy4(i2);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super Placeable.PlacementScope, Unit> function1) {
            return MeasureScope.super.layout(i2, i3, map, function1);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super RulerScope, Unit> function1, Function1<? super Placeable.PlacementScope, Unit> function12) {
            return MeasureScope.super.layout(i2, i3, map, function1, function12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i2, int i3, Map map, Function1 function1, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i4 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return measureScope.layout(i2, i3, map, function1);
    }

    default MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super Placeable.PlacementScope, Unit> function1) {
        return layout(i2, i3, map, null, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i2, int i3, Map map, Function1 function1, Function1 function12, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i4 + 4) - (4 | i4) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i4 & 8) != 0) {
            function1 = null;
        }
        return measureScope.layout(i2, i3, map, function1, function12);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.MeasureScope$layout$1 */
    /* JADX INFO: compiled from: MeasureScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я1\u001d̉=!4i\bӵLc\u0003&I\u0006F\u000b6B\r(4\u0012}\u000bnjO0Le^.ZS8\u000fs{J$c$wGcTڼ\u0004*\u001fѧ~g\u0016m\u0013`\u0019U'\u0006D\u00051@\u001as\u0007]*\u001bBD\u007f?aO\u007f?I`#93!\tŉ:ѩ\t\u0007\"ݒ`\u0012|~QP\\$>F\t:\u0001\u0010$Ŀ\u001cŪ\nD(ҵ6^mUDP=\u0003H8;\u0016yD^'\u000e;\rO\u001dF\u00033#u\u0010(ҋD7;\"{ٜ\u0005\u07baVaGšWsC\u0013v6w=W\u0004o6\u0007\u0003jƚ-̠\u0011cz̦t\u0007Wq\u001a/ˬSv"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EG|+!W~W$v!Ci\u000b %k 9M\u0002BgH(%w \u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "6dX4[;", "5dc\u0015X0@V(", "u(8", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fh3>`'", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "EhSA[", "5dc$\\+MV", ">kP0X\nAW }\b^5", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements MeasureResult {
        final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
        final /* synthetic */ int $width;
        private final Map<AlignmentLine, Integer> alignmentLines;
        private final int height;
        private final Function1<RulerScope, Unit> rulers;
        final /* synthetic */ MeasureScope this$0;
        private final int width;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super RulerScope, Unit> function1, MeasureScope measureScope, Function1<? super Placeable.PlacementScope, Unit> function12) {
            this.$width = i2;
            this.this$0 = measureScope;
            this.$placementBlock = function12;
            this.width = i2;
            this.height = i3;
            this.alignmentLines = map;
            this.rulers = function1;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public Map<AlignmentLine, Integer> getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public Function1<RulerScope, Unit> getRulers() {
            return this.rulers;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public void placeChildren() {
            MeasureScope measureScope = this.this$0;
            if (measureScope instanceof LookaheadCapablePlaceable) {
                this.$placementBlock.invoke(((LookaheadCapablePlaceable) measureScope).getPlacementScope());
            } else {
                this.$placementBlock.invoke(new SimplePlacementScope(this.$width, this.this$0.getLayoutDirection()));
            }
        }
    }

    default MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super RulerScope, Unit> function1, Function1<? super Placeable.PlacementScope, Unit> function12) {
        if (!((i2 + ViewCompat.MEASURED_STATE_MASK) - (i2 | ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i3) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i2, i3, map, function1, this, function12) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
            final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
            final /* synthetic */ int $width;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final Function1<RulerScope, Unit> rulers;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(int i22, int i32, Map<AlignmentLine, Integer> map2, Function1<? super RulerScope, Unit> function13, MeasureScope this, Function1<? super Placeable.PlacementScope, Unit> function122) {
                this.$width = i22;
                this.this$0 = this;
                this.$placementBlock = function122;
                this.width = i22;
                this.height = i32;
                this.alignmentLines = map2;
                this.rulers = function13;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Function1<RulerScope, Unit> getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                MeasureScope measureScope = this.this$0;
                if (measureScope instanceof LookaheadCapablePlaceable) {
                    this.$placementBlock.invoke(((LookaheadCapablePlaceable) measureScope).getPlacementScope());
                } else {
                    this.$placementBlock.invoke(new SimplePlacementScope(this.$width, this.this$0.getLayoutDirection()));
                }
            }
        };
    }
}
