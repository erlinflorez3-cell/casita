package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<;!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0Le^.Zݷ2\u000f\u0002{<řc$\bCCU0}*\tUNog\u0005Jbŏ[v\u0014ǝ\u0011jrHu\u0001c܈\u001d1Xng3{oe9\u000fuf\r&20:\u0012\u0007\u0017\u0019XK@\u0007\u0001KY\u0010*:PrJR;S3\u001fz\u0006\u001d'1*bo\\>`rm<?#1rpSWs6\u0005[\u0017^b7\u000f\u0007aL6V6c\u001a\u000eU\u0019\u00061g\u0006ũEҵ<ݛص+'9V\f@Df\u0018\u001a%-_\r$qTk%Yfϯ5*ebsP<( z*\u000el\f\u0014\u00065JF/0e6\u0011c\u0005x[NT\u001ahR\u0002\u000bad\u001dS\u0005\u001c+\u0018\"\u0017]gC'VO\u0002\u0015\u000f.#/wO`\u0005\"f\u001d)^\u0010_ASP=vY Xkrlrx\u0001\t\u0010vϢ\u0006ôz߾ч\u0017*?^?ؔQ\u001a\u0001үHw"}, d2 = {"5dc g(MS\n\u0003zp\u0014\u0007\b/l", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "AsPAX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@33c\t \u0001J&7LJ;J4\u001f\u0019qeH\u000bm5$", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`(|\n>~%>hS\u0007Az\u0018wSM?t}\u001c\u001fua\u0003\u0013s(Uz(KL[uHbnD\u0018\u0013^\u000e[\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJs>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[D=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0001:H2c!=k\u0003\u0019+o\u000b.*7<\u0011SIju6/\u0012h1I\u0012\rb<\u0007", "AsPAX\u001dBS+f\u0005],\u0004", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FragmentStateVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.FragmentStateVMKt$stateViewModel$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u0016DLcz\u0004OيH\u000btA\u001f*2ߚ\u0006\u0006|ia0re\u000f6ʂW,\u0015l\n6"}, d2 = {"\n`]<a@F])\rS", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "7me<^,", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J\b\u001bG\u0002uFu%</"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2<T> extends Lambda implements Function0<T> {
        final /* synthetic */ Function0<ViewModelStoreOwner> $owner;
        final /* synthetic */ Function0<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ Function0<Bundle> $state;
        final /* synthetic */ Fragment $this_stateViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Fragment fragment, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ViewModelStoreOwner> function02, Function0<? extends ParametersHolder> function03) {
            super(0);
            this.$this_stateViewModel = fragment;
            this.$qualifier = qualifier;
            this.$state = function0;
            this.$owner = function02;
            this.$parameters = function03;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModel invoke() throws Throwable {
            Fragment fragment = this.$this_stateViewModel;
            Qualifier qualifier = this.$qualifier;
            Function0<Bundle> function0 = this.$state;
            Function0<ViewModelStoreOwner> function02 = this.$owner;
            Function0<ParametersHolder> function03 = this.$parameters;
            ViewModelStore viewModelStore = function02.invoke().getViewModelStore();
            CreationExtras extras = BundleExtKt.toExtras(function0.invoke(), fragment);
            if (extras == null) {
                extras = fragment.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(extras, "<get-defaultViewModelCreationExtras>(...)");
            }
            Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, extras, qualifier, koinScope, function03, 4, null);
        }
    }

    @Deprecated(message = "\u0018Y\u0001tW\u0007\u0016^eL6\u000f\u001e\u001c1bRU\u000e>qw\u0010W\u0003\u000e7*e}8n(Q|V_]{\u0013\u0006\u0001E?\u0013jU\t0=`Ow?G")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T extends ViewModel> T getStateViewModel(Fragment fragment, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends ParametersHolder> function0) throws Throwable {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewModelStore viewModelStore = owner.invoke().getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras(state.invoke(), fragment);
        if (extras == null) {
            extras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "<get-defaultViewModelCreationExtras>(...)");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, extras, qualifier, koinScope, function0, 4, null);
    }

    public static /* synthetic */ ViewModel getStateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 state, Function0 owner, Function0 function0, int i2, Object obj) throws Throwable {
        Qualifier qualifier2 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier2 = null;
        }
        if ((2 & i2) != 0) {
            state = ScopeExtKt.emptyState();
        }
        if ((4 & i2) != 0) {
            owner = new Function0<Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentStateVMKt.getStateViewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        Function0 function02 = (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? function0 : null;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) owner.invoke()).getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras((Bundle) state.invoke(), fragment);
        if (extras == null) {
            extras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "<get-defaultViewModelCreationExtras>(...)");
        }
        Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(fragment);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return GetViewModelKt.resolveViewModel$default(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStore, null, extras, qualifier2, koinScope, function02, 4, null);
    }

    @Deprecated(message = "\u0018Y\u0001tW\u0007\u0016^eL6\u000f\u001e+5Ss9\u0018+\ntS\u001b6]w~V4)~|^eU'\u001cKKK\u001fGC!d1\u00126jIN")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T extends ViewModel> Lazy<T> stateViewModel(Fragment fragment, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier, state, owner, function0));
    }

    public static /* synthetic */ Lazy stateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        Function0 owner = function02;
        Function0 state = function0;
        Qualifier qualifier2 = qualifier;
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier2 = null;
        }
        if ((2 & i2) != 0) {
            state = ScopeExtKt.emptyState();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            owner = new Function0<Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentStateVMKt.stateViewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        Function0 function04 = (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? function03 : null;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier2, state, owner, function04));
    }
}
