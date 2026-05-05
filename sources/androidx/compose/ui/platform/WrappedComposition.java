package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionServiceKey;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0ZeP\u008cZS8\u0018s{:'c$\bCCU(}*\teNogtQb\u000bY\u000f\u000e\u0016~k4Ikxe܈\u00172XoG3SqC9vҚf\u0005N1R8(\u00051\u001aXIP\n\u000bGY\u000e*0nsJV\u001bQ\u001d\u001a@\u0005̧$\u0001,a0TD_\u0005]h?i\u00172c\\?w2\u0013LS_t)\u0013Ǹo7[JEO-+c\u0005\u0017R\"X1Z8Qݾl'5G\u0012\neSp\u007fB%[S\u001b{\u000b&\u000b$\u0002d\u001aGCO\u0012l\u0017\"p\u0016\t\u001e%<2\u001e66VQE%v\n\u001e3#\u0003\u0002Oг\u0006^H\u0011Auي\u001b%\u000eW{G)licQ\u0018|>R˟\u0019̷'\u0001vď,`\u001ch-\u001b\u0003\u0001(Ļ]͘AHVˣ*O{\u000e\tb03:\u0005\u001eĠ1ɨ\u00152/'=fG/q}\u0010U\\g%\u000e\u0017=*ֶT͕D&\u0007\u0018=7\u0017\u0018+]r\u0013\u0004[dZ<\u0011{,\u0003\u0016ą\f\u0013&mN˖-ٚ\u0014PWhw|\u001el\u0018)GfeXˇo\u0014_ުv5;dq$2a\u0005\u0016W<\u0011\bֽjH[ێr^.7@^у\u0014\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n'fy+Bm\u0015\fWKFuB\"$lkB\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0004", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u0005FY\u0007/!j$.ZT;x\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u001cMPLo2\u001e#>", "=v]2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "=qX4\\5:Z", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u00199\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001|\u00124T\fIl\u0010\u0010 \u0017\u000b.a", "/cS2W\u001bH:\u001d\u007fz\\@z\u0010/", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "2hb=b:>R", "", "6`b\u0016a=:Z\u001d}vm0\u0007\u0012=", "5dc\u0015T:\"\\*z\u0002b+x\u00183o\t6", "u(I", "7r36f7Ha\u0019}", ":`bA66Gb\u0019\b\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "5dc\u001ce0@W\"z\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V\u0019", "5dc\u001cj5>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L!Es?(#hR=\u0007u\u0002", "2hb=b:>", "5dc\u0010b4I]'\u0003\nb6\u0006v/r\u0011,y@", "\"", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u001cMPLo2\u001ezhu\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7;CH|8\u001c\u0015NaM\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "=mBAT;>1\u001cz\u0004`,{", "And?V,", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "3uT;g", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "Adc\u0010b5MS\"\u000e", "1n]AX5M", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {
    private Lifecycle addedToLifecycle;
    private boolean disposed;
    private Function2<? super Composer, ? super Integer, Unit> lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m5857getLambda1$ui_release();
    private final Composition original;
    private final AndroidComposeView owner;

    public WrappedComposition(AndroidComposeView androidComposeView, Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    public final Composition getOriginal() {
        return this.original;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(final Function2<? super Composer, ? super Integer, Unit> function2) {
        this.owner.setOnViewTreeOwnersAvailable(new Function1<AndroidComposeView.ViewTreeOwners, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                invoke2(viewTreeOwners);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                if (!WrappedComposition.this.disposed) {
                    Lifecycle lifecycle = viewTreeOwners.getLifecycleOwner().getLifecycle();
                    WrappedComposition.this.lastContent = function2;
                    if (WrappedComposition.this.addedToLifecycle == null) {
                        WrappedComposition.this.addedToLifecycle = lifecycle;
                        lifecycle.addObserver(WrappedComposition.this);
                    } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                        Composition original = WrappedComposition.this.getOriginal();
                        final WrappedComposition wrappedComposition = WrappedComposition.this;
                        final Function2<Composer, Integer, Unit> function22 = function2;
                        original.setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i2) {
                                ComposerKt.sourceInformation(composer, "C146@6196L99,146@6174L121,149@6342L100,149@6320L122,153@6541L103,153@6468L176:Wrapper.android.kt#itgzvw");
                                if ((i2 + 3) - (3 | i2) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2000640158, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
                                    }
                                    Object tag = wrappedComposition.getOwner().getTag(R.id.inspection_slot_table_set);
                                    Set<CompositionData> set = TypeIntrinsics.isMutableSet(tag) ? (Set) tag : null;
                                    if (set == null) {
                                        Object parent = wrappedComposition.getOwner().getParent();
                                        View view = parent instanceof View ? (View) parent : null;
                                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                                        set = TypeIntrinsics.isMutableSet(tag2) ? (Set) tag2 : null;
                                    }
                                    if (set != null) {
                                        set.add(composer.getCompositionData());
                                        composer.collectParameterInformation();
                                    }
                                    AndroidComposeView owner = wrappedComposition.getOwner();
                                    ComposerKt.sourceInformationMarkerStart(composer, 828769887, "CC(remember):Wrapper.android.kt#9igjgp");
                                    boolean zChangedInstance = composer.changedInstance(wrappedComposition);
                                    WrappedComposition wrappedComposition2 = wrappedComposition;
                                    WrappedComposition$setContent$1$1$1$1 wrappedComposition$setContent$1$1$1$1RememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || wrappedComposition$setContent$1$1$1$1RememberedValue == Composer.Companion.getEmpty()) {
                                        wrappedComposition$setContent$1$1$1$1RememberedValue = new WrappedComposition$setContent$1$1$1$1(wrappedComposition2, null);
                                        composer.updateRememberedValue(wrappedComposition$setContent$1$1$1$1RememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    EffectsKt.LaunchedEffect(owner, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) wrappedComposition$setContent$1$1$1$1RememberedValue, composer, 0);
                                    AndroidComposeView owner2 = wrappedComposition.getOwner();
                                    ComposerKt.sourceInformationMarkerStart(composer, 828774560, "CC(remember):Wrapper.android.kt#9igjgp");
                                    boolean zChangedInstance2 = composer.changedInstance(wrappedComposition);
                                    WrappedComposition wrappedComposition3 = wrappedComposition;
                                    WrappedComposition$setContent$1$1$2$1 wrappedComposition$setContent$1$1$2$1RememberedValue = composer.rememberedValue();
                                    if (zChangedInstance2 || wrappedComposition$setContent$1$1$2$1RememberedValue == Composer.Companion.getEmpty()) {
                                        wrappedComposition$setContent$1$1$2$1RememberedValue = new WrappedComposition$setContent$1$1$2$1(wrappedComposition3, null);
                                        composer.updateRememberedValue(wrappedComposition$setContent$1$1$2$1RememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    EffectsKt.LaunchedEffect(owner2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) wrappedComposition$setContent$1$1$2$1RememberedValue, composer, 0);
                                    ProvidedValue<Set<CompositionData>> providedValueProvides = InspectionTablesKt.getLocalInspectionTables().provides(set);
                                    final WrappedComposition wrappedComposition4 = wrappedComposition;
                                    final Function2<Composer, Integer, Unit> function23 = function22;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-1193460702, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Throwable {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i3) throws Throwable {
                                            ComposerKt.sourceInformation(composer2, "C154@6571L47:Wrapper.android.kt#itgzvw");
                                            if ((-1) - (((-1) - i3) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1193460702, i3, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                                            }
                                            AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(wrappedComposition4.getOwner(), function23, composer2, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer, 54), composer, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        }));
                    }
                }
            }
        });
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        Composition composition = this.original;
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }
}
