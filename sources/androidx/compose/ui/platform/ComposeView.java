package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpA0JeP.hS2\u000f\u0002{<$i$yCQU\"Ԃ*\t]WogtPb\u000bQ\u001a\u000e\u0016~k2Nkތ\u000e\u0012=1\u0003\u0013E8]sK9xtd\u00060:(8\b\u0007\u0019\u001c@G>y\u000bIQ\f 4XphWҫQ\u0005(\u0018NI.\u00146\\\u0016X|]ǰa:=7KoPc?_^\u0013\u0014!\u000fp5$\u000faL5pFC\u001c=^\u0013\tb[m\rmzݘ\th-2ȅMseN)\u001f\"\u001cCb\u001dl\u00033l\u0007a`:1AN\u0012Tח\u0012(}\u0006*\u0015\u0013ǌ\u0010Ν+H6Ʀj\t\u0016\u001cKt!`pT\u0010jZ\u007f)ntg{Ń?ڢ='nϟq=\u001f]E\f\u001d\u000f$4\u000f\u0001ĸ_m"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013c\u0006+A{\u0016\u001fQCMA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011V\f/Di\u0014=+MCv>,\u0015Ye9\u00199", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "2dU g@ESt\u000e\nk", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]L\u000b\u000b=", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\nrTA \u0006\u0017", "", "Ag^B_+\u001c`\u0019z\n^\n\u0007\u0011:o\u000e,\u000bD\u000b \u0001PK\u001dKr#8Y|\u000fA_\u001a7LMM", "5dc [6NZ\u0018\\\b^(\f\t\ro\b3\u0006N\u0005&\u001bQxwER4DU{#7l\u00058?GDj>0SdjB\u0011r(]z1PZ", "u(E", "5dc [6NZ\u0018\\\b^(\f\t\ro\b3\u0006N\u0005&\u001bQxwER4DU{#7l\u00058?GDj>0", "u(I", "\u0011n]AX5M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>", "5dc\u000eV*>a'\u0003wb3\u0001\u0018CC\u0007$\nNi\u0013\u001fG", "", "Adc\u0010b5MS\"\u000e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    private final MutableState<Function2<Composer, Integer, Unit>> content;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (2 & i3) != 0 ? null : attributeSet, (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? 0 : i2);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(420213850);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Content):ComposeView.android.kt#itgzvw");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(this) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i3 + 3) - (3 | i3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(420213850, i3, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            Function2<Composer, Integer, Unit> value = this.content.getValue();
            if (value == null) {
                composerStartRestartGroup.startReplaceGroup(358373017);
            } else {
                composerStartRestartGroup.startReplaceGroup(150107752);
                ComposerKt.sourceInformation(composerStartRestartGroup, "440@18080L8");
                value.invoke(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.ComposeView.Content.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposeView composeView = ComposeView.this;
                    int i6 = i2;
                    composeView.Content(composer2, RecomposeScopeImplKt.updateChangedFlags((i6 + 1) - (i6 & 1)));
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(function2);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }
}
