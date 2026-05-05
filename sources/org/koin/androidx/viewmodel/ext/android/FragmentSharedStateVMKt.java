package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
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
import kotlin.reflect.KClass;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<;!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0Le^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWN}gvJ`\fK\u000f\u001c\u0016\u0001̓D9cތu\u0012U1buE\u074c[ne9\u000ft^\u0005N3R@\u007f\u0005\u000f\u001cBJ&u)F{\u001c\u00180NtR\\\u001dO\u0015\u001a@\fl%i\u001e;n~BNlkBG)\u0013kRNUh^\u0002}\u0017T^?\u0013\u0007c.+\u00076c Ug\t\u0007`gW\u0011OsM\u0005\u00174=*wx@8n~r#qTոar4k\u001d9nϯ?+\u0016bkX\u0014ߊ\u0006y\u0012\fd\u0004<\u0006OH\\.Jn\u000e\u000eAv\u000bUVO0ar\u0010\u0001iD\u001b=\nC-I\u001b\u0015W\u0010@\u0002N\u0016\u00035\u0019$+\u000fv9ad\u0010p\u0015I]&VaeFEVZ\"gMo\u0014p\u0011\u000f@\u0003^Lh1\u0012\u0010\r%kڣa߶\"ܩȠ\u0006HRw\u000funykobJP\"5\u0015e<)\u0012`եr\u0004\u0014P\u0003XT\u0011{\u001d\u0005\u000f\u0004\b!\"tyR S\u0013~_nixQu\u001451v7\bt\u001a\u0013@9=:e]i\u0010oZ\u000f\u001aO>r\u0005\u0007opX<dj2:8Xl wBC|\u0017CFEq*@D?)^%H1+X@+\u000eH\\~\u000f]by)\u001bR2\u0006!\u0007`^\u0001o.ww>\u001dh(ΊOPK\u0018NUPh\\|Q\b/{\u0006GuN_N\u0003\u0015$X,0\u001c\"GUGG#\u0011\u000f)`\b[J5rDX}\u001e-\u0003\u000b\u0002'Ax0w\b\u0019yZe\u001b^U\\%.\u000fl\u0003%\u0018d.\u0007wE)LLV!Z\u001dW9Í_ÚM˻ً\u0005$&(\u0007ȕR+4ԯG:"}, d2 = {"5dc [(KS\u0018l\nZ;|y3e\u0012\u0010\u0006?\u0001\u001e", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "?tP9\\-BS&", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "AsPAX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "\u001ana4\"2HW\"Hvg+\n\u00133d\u0013q\rD\u0001)\u001fQn\u000eC@33c\t \u0001J&7LJ;J4\u001f\u0019qeH\u000bm5$", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}\u0013Dc\u000b !\u007f\u001f.Z\u0019", "1kPGm", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EL\u0016/QL?z8(\u001e>", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`(|\n>~%>hS\u0007Az\u0018wSM?t}\u001c\u001fua\u0003\u0013s(Uz(KL[uHbnD\u0018\u0013^\u000e[\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJs>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[D=NM#\n?(G7hFFvU:\u0004p\u0005)\u0003s @.[1~<\u000b83\u007fi\u0016S1\u0019Ngv$0fJ5o\u0017L\u001c=Zg\u007fu\tc,\u0006]\u0011\ro?5\u0018x/jL\u0010\u0007[+Y<a)q;R\u0018&Sn\u0015.\u001c", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`(|\n>~%>hS\u0007Az\u0018wSM?t}\u001c\u001fua\u0003\u0013s(Uz(KL[uHbnD\u0018\u0013^\u000e[\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJs>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[D=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0001:H2c!=k\u0003\u0019+o\u000b.*7<\u0011SIju6/\u0012h1I\u0012\rb<\u0007", "AgP?X+,b\u0015\u000ezO0|\u001b\u0017o~(\u0003", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "9nX; (GR&\t~]&\n\t6e{6{"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FragmentSharedStateVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt$sharedStateViewModel$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<;!&i\u0016DLcz\u0004OيH\u000btA\u001f*2ߚ\u0006\u0006|ia0re\u000f6ʂW,\u0015l\n6"}, d2 = {"\n`]<a@F])\rS", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "7me<^,", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J\b\u001bG\u0002uFu%</"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 176, xs = "")
    public static final class C14712<T> extends Lambda implements Function0<T> {
        final /* synthetic */ Function0<ViewModelStoreOwner> $owner;
        final /* synthetic */ Function0<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ Function0<Bundle> $state;
        final /* synthetic */ Fragment $this_sharedStateViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14712(Fragment fragment, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ViewModelStoreOwner> function02, Function0<? extends ParametersHolder> function03) {
            super(0);
            this.$this_sharedStateViewModel = fragment;
            this.$qualifier = qualifier;
            this.$state = function0;
            this.$owner = function02;
            this.$parameters = function03;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModel invoke() throws Throwable {
            Fragment fragment = this.$this_sharedStateViewModel;
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

    @Deprecated(message = "\u0018Y\u0001tW\u0007\u0016^eL6\u000f\u001e\u001c1b=O\u001d0\u001bq klOs\u0002;\u0004(kt\u0014-\u0002de|A\u0006#KN$W_Sa;Z@fR=!\u001a,,X-wG")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T extends ViewModel> T getSharedStateViewModel(Fragment fragment, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends ParametersHolder> function0) throws Throwable {
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

    @Deprecated(message = "\u0018Y\u0001tW\u0007\u0016^eL6\u000f\u001e\u001c1b=O\u001d0\u001bq klOs\u0002;\u0004(kt\u0014-\u0002de|A\u0006#KN$W_Sa;Z@fR=!\u001a,,X-wG")
    @InterfaceC1492Gx
    public static final <T extends ViewModel> T getSharedStateViewModel(Fragment fragment, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ViewModelStoreOwner> owner, KClass<T> clazz, Function0<? extends ParametersHolder> function0) throws Throwable {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ViewModelStore viewModelStore = owner.invoke().getViewModelStore();
        CreationExtras extras = BundleExtKt.toExtras(state.invoke(), fragment);
        if (extras == null) {
            extras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(extras, "<get-defaultViewModelCreationExtras>(...)");
        }
        return (T) GetViewModelKt.resolveViewModel$default(clazz, viewModelStore, null, extras, qualifier, AndroidKoinScopeExtKt.getKoinScope(fragment), function0, 4, null);
    }

    public static /* synthetic */ ViewModel getSharedStateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 state, Function0 owner, Function0 function0, int i2, Object obj) throws Throwable {
        Qualifier qualifier2 = qualifier;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            qualifier2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            state = ScopeExtKt.emptyState();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            owner = new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt.getSharedStateViewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final FragmentActivity invoke() {
                    FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    return fragmentActivityRequireActivity;
                }
            };
        }
        Function0 function02 = (i2 & 8) == 0 ? function0 : null;
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

    public static /* synthetic */ ViewModel getSharedStateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function02, KClass kClass, Function0 function03, int i2, Object obj) {
        Function0 function04 = function02;
        Function0 function0EmptyState = function0;
        Qualifier qualifier2 = qualifier;
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier2 = null;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            function0EmptyState = ScopeExtKt.emptyState();
        }
        if ((4 & i2) != 0) {
            function04 = new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt.getSharedStateViewModel.2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final FragmentActivity invoke() {
                    FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    return fragmentActivityRequireActivity;
                }
            };
        }
        return getSharedStateViewModel(fragment, qualifier2, function0EmptyState, function04, kClass, (i2 + 16) - (i2 | 16) == 0 ? function03 : null);
    }

    @Deprecated(message = "\u0018Y\u0001tW\u0007\u0016^eL6\u000f\u001e\u0016/beb\u0012;\u001e^\u0015W\u000e3}nS\u0001k/(cmVU\u001cmQZ04Mk\u0016/\f'Y\\DtL\u0019* Y\u0015W")
    @InterfaceC1492Gx
    public static final /* synthetic */ <T extends ViewModel> Lazy<T> sharedStateViewModel(Fragment fragment, Qualifier qualifier, Function0<Bundle> state, Function0<? extends ViewModelStoreOwner> owner, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C14712(fragment, qualifier, state, owner, function0));
    }

    @Deprecated(message = "\u0018Y\u0001tW\u0007\u0016^eL6\u000f\u001e\u0016/beb\u0012;\u001e^\u0015W\u000e3}nS\u0001k/(cmVU\u001cmQZ04Mk\u0016/\f'Y\\DtL\u0019* Y\u0015W")
    @InterfaceC1492Gx
    public static final <T extends ViewModel> Lazy<T> sharedStateViewModel(final Fragment fragment, final Qualifier qualifier, final Function0<Bundle> state, final Function0<? extends ViewModelStoreOwner> owner, final KClass<T> clazz, final Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt.sharedStateViewModel.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                return FragmentSharedStateVMKt.getSharedStateViewModel(fragment, qualifier, state, owner, clazz, function0);
            }
        });
    }

    public static /* synthetic */ Lazy sharedStateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        Function0 owner = function02;
        Function0 state = function0;
        Qualifier qualifier2 = qualifier;
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier2 = null;
        }
        if ((2 & i2) != 0) {
            state = ScopeExtKt.emptyState();
        }
        if ((4 & i2) != 0) {
            owner = new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt.sharedStateViewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final FragmentActivity invoke() {
                    FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    return fragmentActivityRequireActivity;
                }
            };
        }
        Function0 function04 = (i2 + 8) - (i2 | 8) == 0 ? function03 : null;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(owner, "owner");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C14712(fragment, qualifier2, state, owner, function04));
    }

    public static /* synthetic */ Lazy sharedStateViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function02, KClass kClass, Function0 function03, int i2, Object obj) {
        Function0 function0EmptyState = function0;
        Function0 function04 = function02;
        Qualifier qualifier2 = qualifier;
        if ((i2 + 1) - (1 | i2) != 0) {
            qualifier2 = null;
        }
        if ((2 & i2) != 0) {
            function0EmptyState = ScopeExtKt.emptyState();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function04 = new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt.sharedStateViewModel.3
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final FragmentActivity invoke() {
                    FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    return fragmentActivityRequireActivity;
                }
            };
        }
        return sharedStateViewModel(fragment, qualifier2, function0EmptyState, function04, kClass, (i2 & 16) == 0 ? function03 : null);
    }
}
