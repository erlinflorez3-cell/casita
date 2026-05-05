package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!4i\bӵLc\u0003\"I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007t\rA0RnP.`S2\u000fq{<$q$yCAU290ޛgN\u0016f\u001fTh\u000b[\u0015\u0016\u0018\tjZK\u0004y\u000e0\u00152PrWK]}MEpvF\u0005N42:\n\u0005/ XM x\u000bCy\u0013@4\u0007oĐV\r[\r21\u0014G8\u0007.^wNdR\u001b^j91\u0003\u0002H^)o0+O;G\u001b(˼za,6Ñ;A"}, d2 = {"@d\\2`)>`\u0001\u000f\nZ)\u0004\t\u0017u\u00077\u007fK\b\u0017\u0002G|\u0016@\u000539c\u0007.%|\u0012=M", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7}>TR?v;\u001e\u007fhnA\u000bq:R\u00010U:](kRH", ">da:\\:LW#\b\t", "", "", "=m?2e4Ba'\u0003\u0005g:i\t=u\u00077", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0005\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000e\u0015)\u00107S\u0010;uVoyQ\u001chzJ \u0012Q\u0004\u0017|ArdDWi\u0002R=Nf8sUj\u001diB>2\"u#$v\u001a\u0016\u001a\u0003b\u0015}YyRgT!~F2BwdT3~QKt|", "@d\\2`)>`\u0001\u000f\nZ)\u0004\t\u001ae\r0\u007fN\u000f\u001b!P}{Kr45", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7}>\\?8r4\t\u0015ui=\u0015q0X\u007f\u0015VH],2", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f$\u0005?\u000e!\u001bF\u0003W:\u0001-@c\f \u0001z&7\\GCk}{\u001fplC\u0015c9$Zj.QJ=X\u001c\u0003L\u0018\u0019$tR9\u001cZ", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MutableMultiplePermissionsStateKt {
    public static final MultiplePermissionsState rememberMutableMultiplePermissionsState(List<String> permissions, final Function1<? super Map<String, Boolean>, Unit> function1, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        composer.startReplaceableGroup(-2044770427);
        if ((i3 + 2) - (i3 | 2) != 0) {
            function1 = new Function1<Map<String, ? extends Boolean>, Unit>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt.rememberMutableMultiplePermissionsState.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Boolean> map) {
                    invoke2((Map<String, Boolean>) map);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, Boolean> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2044770427, i2, -1, "com.google.accompanist.permissions.rememberMutableMultiplePermissionsState (MutableMultiplePermissionsState.kt:45)");
        }
        List<MutablePermissionState> listRememberMutablePermissionsState = rememberMutablePermissionsState(permissions, composer, 8);
        PermissionsUtilKt.PermissionsLifecycleCheckerEffect(listRememberMutablePermissionsState, null, composer, 8, 2);
        composer.startReplaceableGroup(-1585748799);
        boolean zChanged = composer.changed(permissions);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new MutableMultiplePermissionsState(listRememberMutablePermissionsState);
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableMultiplePermissionsState mutableMultiplePermissionsState = (MutableMultiplePermissionsState) objRememberedValue;
        composer.endReplaceableGroup();
        ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
        composer.startReplaceableGroup(-1585748493);
        int i4 = (-1) - (((-1) - ((((((i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2)) ^ 48) <= 32 || !composer.changedInstance(function1)) && (i2 + 48) - (i2 | 48) != 32) ? 0 : 1)) & ((-1) - (composer.changed(mutableMultiplePermissionsState) ? 1 : 0)));
        Object objRememberedValue2 = composer.rememberedValue();
        if (i4 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function1) new Function1<Map<String, Boolean>, Unit>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, Boolean> map) {
                    invoke2(map);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, Boolean> permissionsResult) {
                    Intrinsics.checkNotNullParameter(permissionsResult, "permissionsResult");
                    mutableMultiplePermissionsState.updatePermissionsStatus$permissions_release(permissionsResult);
                    function1.invoke(permissionsResult);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions, (Function1) objRememberedValue2, composer, 8);
        EffectsKt.DisposableEffect(mutableMultiplePermissionsState, managedActivityResultLauncherRememberLauncherForActivityResult, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt.rememberMutableMultiplePermissionsState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                mutableMultiplePermissionsState.setLauncher$permissions_release(managedActivityResultLauncherRememberLauncherForActivityResult);
                final MutableMultiplePermissionsState mutableMultiplePermissionsState2 = mutableMultiplePermissionsState;
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        mutableMultiplePermissionsState2.setLauncher$permissions_release(null);
                    }
                };
            }
        }, composer, ManagedActivityResultLauncher.$stable << 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableMultiplePermissionsState;
    }

    private static final List<MutablePermissionState> rememberMutablePermissionsState(List<String> list, Composer composer, int i2) {
        composer.startReplaceableGroup(992349447);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(992349447, i2, -1, "com.google.accompanist.permissions.rememberMutablePermissionsState (MutableMultiplePermissionsState.kt:76)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        Activity activityFindActivity = PermissionsUtilKt.findActivity(context);
        composer.startReplaceableGroup(-1458104306);
        boolean zChanged = composer.changed(list);
        ArrayList arrayListRememberedValue = composer.rememberedValue();
        if (zChanged || arrayListRememberedValue == Composer.Companion.getEmpty()) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new MutablePermissionState((String) it.next(), context, activityFindActivity));
            }
            arrayListRememberedValue = arrayList;
            composer.updateRememberedValue(arrayListRememberedValue);
        }
        List<MutablePermissionState> list3 = (List) arrayListRememberedValue;
        composer.endReplaceableGroup();
        for (final MutablePermissionState mutablePermissionState : list3) {
            composer.startMovableGroup(-1458104076, mutablePermissionState.getPermission());
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            composer.startReplaceableGroup(-1458103836);
            boolean zChanged2 = composer.changed(mutablePermissionState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z2) {
                        mutablePermissionState.refreshPermissionStatus$permissions_release();
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) objRememberedValue, composer, 8);
            EffectsKt.DisposableEffect(managedActivityResultLauncherRememberLauncherForActivityResult, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt.rememberMutablePermissionsState.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    mutablePermissionState.setLauncher$permissions_release(managedActivityResultLauncherRememberLauncherForActivityResult);
                    final MutablePermissionState mutablePermissionState2 = mutablePermissionState;
                    return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            mutablePermissionState2.setLauncher$permissions_release(null);
                        }
                    };
                }
            }, composer, ManagedActivityResultLauncher.$stable);
            composer.endMovableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return list3;
    }
}
