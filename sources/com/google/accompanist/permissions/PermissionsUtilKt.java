package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.accompanist.permissions.PermissionStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!,r\bDZc|\u0004G\u000b8\u000b<B\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XT2\u000fy\u001a<$a$yCQU\"Ԃ*\t]Zo˧vJp\u000bKƤ\u001e3\u0007qDI\u0004\u0001\u000e\u0016\u001d;Zom=}uC9n\u007fN\u0005N>h7ѩ\t\u0001(7`3\u0005\t[K:\u001a`J~Ij\u0013]\u0007*\u00124HN\u0011NbmNDS\u0005]h;i\u0002ݦFN5pH\u000f[\u001f^TU\f\u001faL>p;C)=S1\u001c\u0019¹W\rM\bU\u0005\u0017>O+w\u0007\u001e̬p\u0012\"\u0019CO;\\\u001b&\u000b\u001c\u0002d\u001a;CO\u0012`\u0017ʫH\u0014\tԈ%<2\r.'v.c^=ڤ\u0010\u07bax|cBV\u0003lD\u0018|gا%( O9=3f\u007f`c\u0019|72Ic̜%ъr+kV\u0014e#\u001dlyW7_CשLf"}, d2 = {"7r6?T5MS\u0018", "", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r<\\L", "7r6?T5MS\u0018=vg5\u0007\u0018+t\u00042\u0005N", "uKR<`u@]#\u0001\u0002^ux\u0007-o\b3wI\u0005%&\u0011z\u000eI~)Cg\u0002*@{_\u0019MPCoB,\u0019rj'\u0016_;^\u0005|\u000b=", "uKR<`u@]#\u0001\u0002^ux\u0007-o\b3wI\u0005%&\u0011z\u000eI~)Cg\u0002*@{_\u0019MPCoB,\u0019rj'\u0016_;^\u0005|\u000bA", "Ag^B_+,V#\u0011gZ;\u0001\u00138a\u0007(", "5dc [6NZ\u0018l}h>i\u0005>i\n1wG\u0001U\u0013Px\u0018Kr49c\u0007.", "5dc [6NZ\u0018l}h>i\u0005>i\n1wG\u0001", "\u001eda:\\:LW#\bab-|\u0007Cc\u0007(YC\u0001\u0015\u001dG|m=w%3h", "", ">da:\\:LW#\bhm(\f\t", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7}>\\?8r4\t\u0015ui=\u0015q0X\u007f\u0015VH],2", ":hU2V@<Z\u0019^\f^5\f", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "uKR<`u@]#\u0001\u0002^ux\u0007-o\b3wI\u0005%&\u0011z\u000eI~)Cg\u0002*@{_\u0016]R7h;\u001e\u007fhnA\u000bq:R\u000105[J;\\(Y9\u001d\u0011g\u0018R* N`E%nBK\u001d\u000f,\u0013h?i\u0001\n*\f<j/\"g\u0010P\tj\\=2gSccxZ\u000bCl2o\u0016m\u001d&GJ-#u!\u001b2.8\u0012\u0007]\u001fr_OKK\u000b\n", "\u001eda:\\:LW#\b\tE0}\t-y}/{\u001e\u0004\u0017\u0015Mo\u001b\u001cw&5W\r", ">da:\\:LW#\b\t", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f$\u0005?\u000e!\u001bF\u0003WCz&5W\u0012\u001e>m_\u0015QD;iH\u001c\u001ch \u0019\u0018c5]L\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#N4wS;'\bu'\fCs\u000b\u001a\u0016\u001b\u000bNT\u0006G", "1gT0^\u0017>`!\u0003\tl0\u0007\u0012", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">da:\\:LW#\b", "", "4h]14*MW*\u0003\nr", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PermissionsUtilKt {

    /* JADX INFO: renamed from: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!4i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u00050?gy\u001d>mu/NC9z!\u001e#xhH\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u00050?gy\u001d>mu/NC9z\"\u001c\u001fsa\u000f", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        final /* synthetic */ LifecycleEventObserver $permissionCheckerObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LifecycleEventObserver lifecycleEventObserver) {
            super(1);
            lifecycleEventObserver = lifecycleEventObserver;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            lifecycle.addObserver(lifecycleEventObserver);
            final Lifecycle lifecycle = lifecycle;
            final LifecycleEventObserver lifecycleEventObserver = lifecycleEventObserver;
            return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lifecycle.removeObserver(lifecycleEventObserver);
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$2 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Lifecycle.Event $lifecycleEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Lifecycle.Event event, int i2, int i3) {
            super(2);
            event = event;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            MutablePermissionState mutablePermissionState = mutablePermissionState;
            Lifecycle.Event event = event;
            int i3 = i;
            PermissionsUtilKt.PermissionLifecycleCheckerEffect(mutablePermissionState, event, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!4i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u00050?gy\u001d>mu/NC9z!\u001e#xhH\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u00050?gy\u001d>mu/NC9z\"\u001c\u001fsa\u000f", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C11521 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        final /* synthetic */ LifecycleEventObserver $permissionsCheckerObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11521(LifecycleEventObserver lifecycleEventObserver) {
            super(1);
            lifecycleEventObserver = lifecycleEventObserver;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            lifecycle.addObserver(lifecycleEventObserver);
            final Lifecycle lifecycle = lifecycle;
            final LifecycleEventObserver lifecycleEventObserver = lifecycleEventObserver;
            return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lifecycle.removeObserver(lifecycleEventObserver);
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$2 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C11532 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Lifecycle.Event $lifecycleEvent;
        final /* synthetic */ List<MutablePermissionState> $permissions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11532(List<MutablePermissionState> list, Lifecycle.Event event, int i2, int i3) {
            super(2);
            list = list;
            event = event;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            PermissionsUtilKt.PermissionsLifecycleCheckerEffect(list, event, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    public static final void PermissionLifecycleCheckerEffect(final MutablePermissionState permissionState, final Lifecycle.Event event, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(permissionState, "permissionState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1770945943);
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((14 & i2) == 0) {
            int i5 = composerStartRestartGroup.changed(permissionState) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 2) - (2 | i3);
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(event) ? 32 : 16)));
        }
        if ((i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                event = Lifecycle.Event.ON_RESUME;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1770945943, i4, -1, "com.google.accompanist.permissions.PermissionLifecycleCheckerEffect (PermissionsUtil.kt:75)");
            }
            composerStartRestartGroup.startReplaceableGroup(-899069773);
            boolean z2 = (-1) - (((-1) - i4) | ((-1) - 14)) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$$ExternalSyntheticLambda0
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                        PermissionsUtilKt.PermissionLifecycleCheckerEffect$lambda$1$lambda$0(event, permissionState, lifecycleOwner, event2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Lifecycle lifecycle = ((LifecycleOwner) objConsume).getLifecycle();
            EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionLifecycleCheckerEffect.1
                final /* synthetic */ LifecycleEventObserver $permissionCheckerObserver;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LifecycleEventObserver lifecycleEventObserver2) {
                    super(1);
                    lifecycleEventObserver = lifecycleEventObserver2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    lifecycle.addObserver(lifecycleEventObserver);
                    final Lifecycle lifecycle2 = lifecycle;
                    final LifecycleEventObserver lifecycleEventObserver2 = lifecycleEventObserver;
                    return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            lifecycle2.removeObserver(lifecycleEventObserver2);
                        }
                    };
                }
            }, composerStartRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionLifecycleCheckerEffect.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Lifecycle.Event $lifecycleEvent;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(final Lifecycle.Event event2, int i22, int i32) {
                    super(2);
                    event = event2;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    MutablePermissionState mutablePermissionState = mutablePermissionState;
                    Lifecycle.Event event2 = event;
                    int i32 = i;
                    PermissionsUtilKt.PermissionLifecycleCheckerEffect(mutablePermissionState, event2, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    public static final void PermissionLifecycleCheckerEffect$lambda$1$lambda$0(Lifecycle.Event event, MutablePermissionState permissionState, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        Intrinsics.checkNotNullParameter(permissionState, "$permissionState");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event2, "event");
        if (event2 != event || Intrinsics.areEqual(permissionState.getStatus(), PermissionStatus.Granted.INSTANCE)) {
            return;
        }
        permissionState.refreshPermissionStatus$permissions_release();
    }

    public static final void PermissionsLifecycleCheckerEffect(final List<MutablePermissionState> permissions, final Lifecycle.Event event, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Composer composerStartRestartGroup = composer.startRestartGroup(1533427666);
        if ((i3 + 2) - (2 | i3) != 0) {
            event = Lifecycle.Event.ON_RESUME;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1533427666, i2, -1, "com.google.accompanist.permissions.PermissionsLifecycleCheckerEffect (PermissionsUtil.kt:105)");
        }
        composerStartRestartGroup.startReplaceableGroup(-1664752182);
        boolean zChanged = composerStartRestartGroup.changed(permissions);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$$ExternalSyntheticLambda1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    PermissionsUtilKt.PermissionsLifecycleCheckerEffect$lambda$3$lambda$2(event, permissions, lifecycleOwner, event2);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Lifecycle lifecycle = ((LifecycleOwner) objConsume).getLifecycle();
        EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionsLifecycleCheckerEffect.1
            final /* synthetic */ LifecycleEventObserver $permissionsCheckerObserver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11521(LifecycleEventObserver lifecycleEventObserver2) {
                super(1);
                lifecycleEventObserver = lifecycleEventObserver2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                lifecycle.addObserver(lifecycleEventObserver);
                final Lifecycle lifecycle2 = lifecycle;
                final LifecycleEventObserver lifecycleEventObserver2 = lifecycleEventObserver;
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        lifecycle2.removeObserver(lifecycleEventObserver2);
                    }
                };
            }
        }, composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionsLifecycleCheckerEffect.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Lifecycle.Event $lifecycleEvent;
                final /* synthetic */ List<MutablePermissionState> $permissions;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11532(final List<MutablePermissionState> permissions2, final Lifecycle.Event event2, int i22, int i32) {
                    super(2);
                    list = permissions2;
                    event = event2;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    PermissionsUtilKt.PermissionsLifecycleCheckerEffect(list, event, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    public static final void PermissionsLifecycleCheckerEffect$lambda$3$lambda$2(Lifecycle.Event event, List permissions, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event2, "event");
        if (event2 == event) {
            Iterator it = permissions.iterator();
            while (it.hasNext()) {
                MutablePermissionState mutablePermissionState = (MutablePermissionState) it.next();
                if (!Intrinsics.areEqual(mutablePermissionState.getStatus(), PermissionStatus.Granted.INSTANCE)) {
                    mutablePermissionState.refreshPermissionStatus$permissions_release();
                }
            }
        }
    }

    public static final boolean checkPermission(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public static final Activity findActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean getShouldShowRationale(PermissionStatus permissionStatus) {
        Intrinsics.checkNotNullParameter(permissionStatus, "<this>");
        if (Intrinsics.areEqual(permissionStatus, PermissionStatus.Granted.INSTANCE)) {
            return false;
        }
        if (permissionStatus instanceof PermissionStatus.Denied) {
            return ((PermissionStatus.Denied) permissionStatus).getShouldShowRationale();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void getShouldShowRationale$annotations(PermissionStatus permissionStatus) {
    }

    public static final boolean isGranted(PermissionStatus permissionStatus) {
        Intrinsics.checkNotNullParameter(permissionStatus, "<this>");
        return Intrinsics.areEqual(permissionStatus, PermissionStatus.Granted.INSTANCE);
    }

    public static /* synthetic */ void isGranted$annotations(PermissionStatus permissionStatus) {
    }

    public static final boolean shouldShowRationale(Activity activity, String permission) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
    }
}
