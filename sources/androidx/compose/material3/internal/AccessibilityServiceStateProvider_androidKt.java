package androidx.compose.material3.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;

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
/* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!,u\bӵLc\u0003\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0L͜P.hS2\u000fq{<$q$yCI^\"}(\u000bg\bug\u0007J\t\fs\u0013\u0014\u0018\u0011jZL\u0006\u000bc\u0012\u001d6Z{O5]ok?pvF\u0005N3P=*\u0011\u0007\u001a8O(|\u000bE[\f@1nx\u0001SҫQ\u0005(\u001b\u001ec.\u000b6bwPFH\u001bih:S\toB\\4w0+Y=LZ'\u001b\u0005y\u001eYL}4չ)S\u0011\u0016rgMšWqk\u0004?ѪyȅMs_̬ނ\u0004$"}, d2 = {"!vXAV/\u001aQ\u0017~\tl\bz\u00183v\u00047\u0010)|\u001f\u0017", "", "\u001dab2e=>A(z\n^", "", ":hU2V@<Z\u0019h\rg,\n", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "6`]1_,\u001ed\u0019\b\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "=m36f7Ha\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001a\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJs>-UhxTKIa=.\ni%gDH$]~)$wT6\nE1\u001bz]\u0004ugTn^\u001cg/", "@d\\2`)>`t|x^:\u000b\r,i\u0007,\u000bTn\u0017$Xs\f<d41h}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", ":hbAX5-]\b\t\u000b\\/\\\u001c:l\n5wO\u0005! 5~\nKv", ":hbAX5-]\u0007\u0011~m*\u007fd-c\u007f6\n.\u0010\u0013&G", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041'~R0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018\u0019\u001c\u0001hAy", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AccessibilityServiceStateProvider_androidKt {
    private static final String SwitchAccessActivityName = "SwitchAccess";

    public static final State<Boolean> rememberAccessibilityServiceState(boolean z2, boolean z3, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1771705152, C1561oA.yd("qU#\u0015\u0018\u000f\u001a\u000e\f\u0018i\u000b\u0006\u0007\u0018\u0017( *,$.6\u000f\u001c(/!\u0016\u0017\b(o\u0002u8Z1=4:<H8;:;OUIUQZKMPHaILI=IJ/ $'\u001f6$\u0018\u001c\u001e)\u001a\u0017\u0012\u001a0025,1-=.,-*D''!)\u0005\u000e\u0003\u0003{~\u0019~v|\u0003\t&%*7RGCIGCQU*;KN<5:'\"\u000e$\u0014y\u001b\u001b!\u000f\t\r\u0019O\u0002\u0012\u00070,)#g$0]#&\u0019+\u0018\u001c", (short) (C1633zX.Xd() ^ (-7066))));
        int i4 = 1;
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        if ((i3 & 2) != 0) {
            z3 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1771705152, i2, -1, C1561oA.Yd("y\b~\u000e\f\u0007\u0003\u0018N\u0005\u0012\u0011\u0015\u0015\u001a\rV\u0017\f \u0012 \u0018\u0011\u001dd`\u001d#*\u001c*'\u001b'i/#,%.$(6\u0006)*-<=4.6:8DJ%8FK?:=,N<PB}\u0007!DEHWXOIQUS_e@SafZUXGiWk]Iljrfbdr/cqhwupl7u\u007fFAD8", (short) (C1580rY.Xd() ^ (-27657))));
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        String strQd = Xg.qd(")*\",YX\\\\aXdZaa@dYXd'eo\u001f6gfjhr", (short) (C1633zX.Xd() ^ (-14795)), (short) (C1633zX.Xd() ^ (-11138)));
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, strQd);
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        Object[] objArr = {Jg.Wd("\u0012n\"W\u0016u#N\rG\u0019W\u0018", (short) (OY.Xd() ^ 20884), (short) (OY.Xd() ^ 16063))};
        Method method = Class.forName(ZO.xd("fniu~\u001fl4m\u0007P@O\u000f}V$9sx>Va", (short) (C1499aX.Xd() ^ (-29004)), (short) (C1499aX.Xd() ^ (-26783)))).getMethod(Ig.wd("\u0010A|\u0005\n/Vl.\u0006\u0010\t>-!\u0003", (short) (FB.Xd() ^ 19054)), Class.forName(C1626yg.Ud("\u0003w\u0018b\t(z<B|\u0017\u0005\u0004$Fl", (short) (OY.Xd() ^ 5585), (short) (OY.Xd() ^ 24882))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, EO.Od("|L\u0011tOPf3bSRcQb)NimF-A\u0010^1AhDc|!9\u0010t\u001bM\u0004U?AMcw\u001d:I\"I\u0016i\u0005G\u001e6X)\nuX.3 \u0012k\u0016a_\"\\DH1\ns/\u001awT\u000f\u0003vk8P}", (short) (Od.Xd() ^ (-29667))));
            final AccessibilityManager accessibilityManager = (AccessibilityManager) objInvoke;
            String strQd2 = C1561oA.Qd("\u0007\u0006i3%,#*\u001e ,aqw\u0019\u0018\u0019&%\u001a\u0012\u0018\u001a\u0016 $|\u000e\u001a\u001d\u000f\b\tu\u0016\u0002\u0014\u0004m\u000f\u000b\u0011\u0003||\tCu\u0002v\u0004\u007fxr;w\u007f-Bqnplt", (short) (Od.Xd() ^ (-24792)));
            ComposerKt.sourceInformationMarkerStart(composer, 18334252, strQd2);
            int i5 = (((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(z2)) && (6 & i2) != 4) ? 0 : 1;
            if (((((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changed(z3)) && (-1) - (((-1) - i2) | ((-1) - 48)) != 32) {
                i4 = 0;
            }
            int i6 = (-1) - (((-1) - i5) & ((-1) - i4));
            Object objRememberedValue = composer.rememberedValue();
            if (i6 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Listener(z2, z3);
                composer.updateRememberedValue(objRememberedValue);
            }
            final Listener listener = (Listener) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, strQd);
            Object objConsume2 = composer.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composer);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume2;
            ComposerKt.sourceInformationMarkerStart(composer, 18342335, strQd2);
            boolean zChanged = composer.changed(listener) | composer.changedInstance(accessibilityManager);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<Lifecycle.Event, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Lifecycle.Event event) throws Throwable {
                        invoke2(event);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Lifecycle.Event event) throws Throwable {
                        if (event == Lifecycle.Event.ON_RESUME) {
                            listener.register(accessibilityManager);
                        }
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 18347548, strQd2);
            boolean zChanged2 = composer.changed(listener);
            boolean zChangedInstance = composer.changedInstance(accessibilityManager);
            boolean z4 = ((zChanged2 ? 1 : 0) + (zChangedInstance ? 1 : 0)) - ((zChanged2 ? 1 : 0) & (zChangedInstance ? 1 : 0)) == 1;
            Object objRememberedValue3 = composer.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() throws Throwable {
                        listener.unregister(accessibilityManager);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ObserveState(lifecycleOwner, function1, (Function0) objRememberedValue3, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return listener;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ObserveState(final LifecycleOwner lifecycleOwner, Function1<? super Lifecycle.Event, Unit> function1, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        final AnonymousClass2 anonymousClass2 = function0;
        final AnonymousClass1 anonymousClass1 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1868327245);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ObserveState)P(1)75@2842L259,75@2809L292:AccessibilityServiceStateProvider.android.kt#mqatfk");
        if ((i3 + 1) - (1 | i3) != 0) {
            i4 = (i2 + 6) - (6 & i2);
        } else if ((i2 + 6) - (6 | i2) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(anonymousClass1) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(anonymousClass2) ? 256 : 128;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                anonymousClass1 = new Function1<Lifecycle.Event, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Lifecycle.Event event) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Lifecycle.Event event) {
                        invoke2(event);
                        return Unit.INSTANCE;
                    }
                };
            }
            if (i7 != 0) {
                anonymousClass2 = new Function0<Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1868327245, i4, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:74)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1591666214, "CC(remember):AccessibilityServiceStateProvider.android.kt#9igjgp");
            int i9 = ((-1) - (((-1) - ((112 & i4) == 32 ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 1 : 0)))) | ((896 & i4) == 256 ? 1 : 0);
            AccessibilityServiceStateProvider_androidKt$ObserveState$3$1 accessibilityServiceStateProvider_androidKt$ObserveState$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i9 != 0 || accessibilityServiceStateProvider_androidKt$ObserveState$3$1RememberedValue == Composer.Companion.getEmpty()) {
                accessibilityServiceStateProvider_androidKt$ObserveState$3$1RememberedValue = new AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(lifecycleOwner, anonymousClass1, anonymousClass2);
                composerStartRestartGroup.updateRememberedValue(accessibilityServiceStateProvider_androidKt$ObserveState$3$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) accessibilityServiceStateProvider_androidKt$ObserveState$3$1RememberedValue, composerStartRestartGroup, (i4 + 14) - (i4 | 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    Function1<Lifecycle.Event, Unit> function12 = anonymousClass1;
                    Function0<Unit> function02 = anonymousClass2;
                    int i11 = i2;
                    AccessibilityServiceStateProvider_androidKt.ObserveState(lifecycleOwner2, function12, function02, composer2, RecomposeScopeImplKt.updateChangedFlags((i11 + 1) - (i11 & 1)), i3);
                }
            });
        }
    }
}
