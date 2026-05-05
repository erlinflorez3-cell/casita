package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
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
/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\":0\u007f\u0007|jAӄLeV4Zݷ2\u000fy\u0005<$a(yCQU\"}(\tWN}gvJp\u000bK\u000f\f\u001e\u0001jBI]xs\u0012\u0017˰JoU3UڎE9vt>\u0005&3(\u0600\u0010ڎ1\u001aXG@v)C\f3\"@NqR^\u001dU\u0015 \"\bN /\"\u000bj|8Xpk?G#1oRR5fH|{\u0015ТX'\u001b\u007f*B9]O5CC{\u00035q\fC\u0011_\n=3\nW+9k\fWd{F(Ǽ*˽ոat,\u0001\u0013v1$52gcyXdߑ\u0004ߡ\u007f\u0019Dǉ&\b-R<8:h\u000e\u001aA\u0002CgN^\u001a`X~)p\rА1Ƨ2ٿ߆\u001aeЂe;!\u05cb\b\u0010\u0013\u001d6%\u0017mOj+טl۶\u001aƘʦP0ҨD=PݐZsK~\u001c~r\u0004:\u0004^V\u00101\f\u0011\\*;6\nKyܬwɘLDoϸUxvX\u0002RvFxÉ\"֖.\u0015\u0014ɮ\\f\u000b\u007f^ix.\u0017c*kW\"\u0016\u00148h\bD1+ P_h\u0018n{`8'\u0006ϐC֍rw\u0016ãQ`9M_|0cX\u0011\"Z\r|\u0013t~Pc\u000ej\\V1BJz\u0010&\u000fZM:%\tŰ}ʬ8,9ǉ¥\u0015Q\u000b!H˨\u00197^bh\u0016\u001eՇ7J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2=\u0007\u001f;k\u0012=WP%l5,\u0015wJC\u0006c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "B`Q\u001db:Bb\u001d\t\u0004l\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2D\b.;|\u001a8V\u0019", "Ad[2V;>R\bzwB5{\tB", "", "4n[9b>\u001c]\"\u000ezg;j\rDe", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*\u0006!DYS\u0004,1\u0007", "5dc\u0013b3E]+\\\u0005g;|\u0012>S\u0004={", "u(I", "Adc\u0013b3E]+\\\u0005g;|\u0012>S\u0004={", "uY\u0018#", "7mXA\\(E=\u001a\u007f\t^;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "7mXA\\(EE\u001d}\na", "=eU@X;\u001a\\\u001d\u0007vm(y\u0010/", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "5dc X3>Q(~yM(yl8d\u007f;", "u(8", "Adc X3>Q(~yM(yl8d\u007f;", "uH\u0018#", "5dc!T))]'\u0003\nb6\u0006\u0017\u001dt{7{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d41h}u", "Adc!T))]'\u0003\nb6\u0006\u0017\u001dt{7{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*\u0006!DYSc(", "EhSA[\bGW!z\nZ)\u0004\t", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private boolean followContentSize;
    private Dp initialOffset;
    private Dp initialWidth;
    private Animatable<Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;
    private State<? extends List<TabPosition>> tabPositionsState;
    private Animatable<Dp, AnimationVector1D> widthAnimatable;

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    public final void setTabPositionsState(State<? extends List<TabPosition>> state) {
        this.tabPositionsState = state;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final void setSelectedTabIndex(int i2) {
        this.selectedTabIndex = i2;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final void setFollowContentSize(boolean z2) {
        this.followContentSize = z2;
    }

    public TabIndicatorOffsetNode(State<? extends List<TabPosition>> state, int i2, boolean z2) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i2;
        this.followContentSize = z2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j2) {
        if (this.tabPositionsState.getValue().isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$1
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
        float fM2600getContentWidthD9Ej5fM = this.followContentSize ? this.tabPositionsState.getValue().get(this.selectedTabIndex).m2600getContentWidthD9Ej5fM() : this.tabPositionsState.getValue().get(this.selectedTabIndex).m2603getWidthD9Ej5fM();
        if (this.initialWidth == null) {
            this.initialWidth = Dp.m6636boximpl(fM2600getContentWidthD9Ej5fM);
        } else {
            Animatable<Dp, AnimationVector1D> animatable = this.widthAnimatable;
            if (animatable == null) {
                Dp dp = this.initialWidth;
                Intrinsics.checkNotNull(dp);
                animatable = new Animatable<>(dp, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                this.widthAnimatable = animatable;
            }
            if (!Dp.m6643equalsimpl0(fM2600getContentWidthD9Ej5fM, animatable.getTargetValue().m6652unboximpl())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, fM2600getContentWidthD9Ej5fM, null), 3, null);
            }
        }
        final float fM2601getLeftD9Ej5fM = this.tabPositionsState.getValue().get(this.selectedTabIndex).m2601getLeftD9Ej5fM();
        if (this.initialOffset == null) {
            this.initialOffset = Dp.m6636boximpl(fM2601getLeftD9Ej5fM);
        } else {
            Animatable<Dp, AnimationVector1D> animatable2 = this.offsetAnimatable;
            if (animatable2 == null) {
                Dp dp2 = this.initialOffset;
                Intrinsics.checkNotNull(dp2);
                animatable2 = new Animatable<>(dp2, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                this.offsetAnimatable = animatable2;
            }
            if (!Dp.m6643equalsimpl0(fM2601getLeftD9Ej5fM, animatable2.getTargetValue().m6652unboximpl())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(animatable2, fM2601getLeftD9Ej5fM, null), 3, null);
            }
        }
        if (measureScope.getLayoutDirection() == LayoutDirection.Ltr) {
            Animatable<Dp, AnimationVector1D> animatable3 = this.offsetAnimatable;
            if (animatable3 != null) {
                fM2601getLeftD9Ej5fM = animatable3.getValue().m6652unboximpl();
            }
        } else {
            Animatable<Dp, AnimationVector1D> animatable4 = this.offsetAnimatable;
            if (animatable4 != null) {
                fM2601getLeftD9Ej5fM = animatable4.getValue().m6652unboximpl();
            }
            fM2601getLeftD9Ej5fM = Dp.m6638constructorimpl(-fM2601getLeftD9Ej5fM);
        }
        Animatable<Dp, AnimationVector1D> animatable5 = this.widthAnimatable;
        if (animatable5 != null) {
            fM2600getContentWidthD9Ej5fM = animatable5.getValue().m6652unboximpl();
        }
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, measureScope.mo704roundToPx0680j_4(fM2600getContentWidthD9Ej5fM), measureScope.mo704roundToPx0680j_4(fM2600getContentWidthD9Ej5fM), 0, 0, 12, null));
        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$4
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, measureScope.mo704roundToPx0680j_4(fM2601getLeftD9Ej5fM), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
