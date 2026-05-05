package androidx.compose.ui.window;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS8\u000fs{J$c$wICU(\u0004*\tUPog|Sb\u000bI$\u000e\u0016\u000fj4I[xc\u0012%˰rom2}ok9!\bF\t.3:8(\u0007\u0011\u001e8K(v)Gƚ\u0010\u0012>E9E`.e\u0005H\u001aLSŋ\u0005\u001ej\n\u0017iV\u0010u:]+3mPr?_^\u0014}\u0011Ty?\r%sN/N]M\u0015Se3\u000b`\u0003W\u0003m\u0004m\tvO?+w\u0006\u001eDݼ\u0004\u0014\u001bT\u0018(k\u001d>\\3Y\u0011\u00105Vgcyb>,\u0006'\u0014\rj\u0016T\u0014όL.3G/,\u001c@\rr\u0002H\u0001\u0006lp\u0018z\u0010eG4\u000e=CD+haai!|>߉\t\r$,ъr!i\u0005^ #%l\u0003a3a@kP|\u0011ՒAm\ny\u0013\u00118\nHR\u00101\f\u0011\\\u001fS>٦=#'t8\t\u0003(MݖªhרmbPB(}$GB\u000b\u0012eRp%mVaf:a_*e\u001f}6%V\u001dN˖#ٚ\u0014Rgjo}[qZ7={OY\u001d}D\u0018\u0010ӗ5̳Ug(cX\r\"S\r~\u0013p~B\u0002#\u000b`6(JH\u0019'6L\u001b\u009d\u0018Ʊ6EyʉL.72j/\u0019\u001b,]Y|7v1ӗ\u001cњX?,Ѱ\u0002&z%\u000fj|ru\u0005\u0007g|\u000fn%EA\u007f9oĶWɋl:\u0005Ƚ\u001f\u0001y\u001fU\b֟K}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006U)1`\b\"\u001ei*8]R\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011V\f/Di\u0014=+MCv>,\u0015Ye9\u00199", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006U)1`\b\")q\u001f-WU&x>/\u0019gaF\\", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Eh]1b>", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e\u0016", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001~\u001a._\r-o=\u001d\u001fz7|w", "\nrTA \u0006\u0017", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n]AX5M", "5dc\u0010b5MS\"\u000e", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u0010b5MS\"\u000e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "1n]AX5M\u0012\u0018~\u0002^.x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "2hb=_(R6\u0019\u0003|a;", "", "5dc\u0011\\:IZ\u0015\u0013]^0~\f>", "u(8", "2hb=_(RE\u001d}\na", "5dc\u0011\\:IZ\u0015\u0013lb+\f\f", "", "Ag^B_+\u001c`\u0019z\n^\n\u0007\u0011:o\u000e,\u000bD\u000b \u0001PK\u001dKr#8Y|\u000fA_\u001a7LMM", "5dc [6NZ\u0018\\\b^(\f\t\ro\b3\u0006N\u0005&\u001bQxwER4DU{#7l\u00058?GDj>0", "u(I", "CrT\u001d_(MT#\f\u0003=,}\u0005?l\u000f\u001a\u007f?\u0010\u001a", "5dc\"f,)Z\u0015\u000e{h9\u0005g/f{8\u0003Or\u001b\u0016Vr", "Adc\"f,)Z\u0015\u000e{h9\u0005g/f{8\u0003Or\u001b\u0016Vr", "uY\u0018#", "5dc$\\5=]+", "u(;.a+K]\u001d}Do0|\u001bxW\u00041zJ\u0013l", "\u0011n]AX5M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>", "7mc2e5:Z\u0003\baZ@\u0007\u0019>", "1gP;Z,=", ":dUA", "Bn_", "@hV5g", "0ncAb4", "7mc2e5:Z\u0003\baZ@\u0007\u0019>$\u0010,uM\u0001\u001e\u0017C}\u000e", "7mc2e5:Z\u0003\bb^(\u000b\u0019<e", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "7mc2e5:Z\u0003\bb^(\u000b\u0019<e>8\u007f:\u000e\u0017\u001eGk\u001c<", ">`a2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7+MDz41$>H?\u0011r3R\u007fpL]Vu]b{;#\u0016d\u0017\\tm\u0015b?3rN@k]o:", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {
    private final MutableState content$delegate;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m6895getLambda1$ui_release(), null, 2, null);
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content$delegate.getValue();
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content$delegate.setValue(function2);
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final void setUsePlatformDefaultWidth(boolean z2) {
        this.usePlatformDefaultWidth = z2;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        setParentCompositionContext(compositionContext);
        setContent(function2);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i2, int i3) {
        if (this.usePlatformDefaultWidth) {
            super.internalOnMeasure$ui_release(i2, i3);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z2, int i2, int i3, int i4, int i5) {
        View childAt;
        super.internalOnLayout$ui_release(z2, i2, i3, i4, i5);
        if (this.usePlatformDefaultWidth || (childAt = getChildAt(0)) == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    private final int getDisplayWidth() throws Throwable {
        Context context = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e", (short) (FB.Xd() ^ 6954), (short) (FB.Xd() ^ 28417))).getMethod(hg.Vd("ZWeBTa\\a]MN[", (short) (C1607wl.Xd() ^ 9884), (short) (C1607wl.Xd() ^ 493)), new Class[0]);
        try {
            method.setAccessible(true);
            float f2 = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
            Context context2 = getContext();
            Class<?> cls = Class.forName(C1561oA.ud("\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fWk\u0017\u0015\u001a\n\u001c\u0017", (short) (C1633zX.Xd() ^ (-19039))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (ZN.Xd() ^ 8363);
            int[] iArr = new int["\u007f|\u000bg\u0002\u000f\n\u000f\u0003rs\u0001".length()];
            QB qb = new QB("\u007f|\u000bg\u0002\u000f\n\u000f\u0003rs\u0001");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            try {
                cls.getMethod(new String(iArr, 0, i2), clsArr).setAccessible(true);
                return Math.round(((Resources) r1.invoke(context2, objArr2)).getConfiguration().screenWidthDp * f2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final int getDisplayHeight() throws Throwable {
        Context context = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017", (short) (ZN.Xd() ^ 3281))).getMethod(Wg.Zd("G\u0019;s\u0012{\u000bks\u007fUv", (short) (Od.Xd() ^ (-5513)), (short) (Od.Xd() ^ (-26841))), new Class[0]);
        try {
            method.setAccessible(true);
            float f2 = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
            Context context2 = getContext();
            Object[] objArr2 = new Object[0];
            try {
                Class.forName(C1561oA.Xd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (OY.Xd() ^ 6895))).getMethod(Wg.vd("ML\\;O^[b`RUd", (short) (OY.Xd() ^ 13815)), new Class[0]).setAccessible(true);
                return Math.round(((Resources) r1.invoke(context2, objArr2)).getConfiguration().screenHeightDp * f2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1735448596);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Content)281@11015L9:AndroidDialog.android.kt#2oxthz");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(this) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3)) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1735448596, i3, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)");
            }
            getContent().invoke(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.DialogLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    DialogLayout.this.Content(composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }
}
