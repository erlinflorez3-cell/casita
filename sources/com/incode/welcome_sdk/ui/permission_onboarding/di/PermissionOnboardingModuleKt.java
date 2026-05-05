package com.incode.welcome_sdk.ui.permission_onboarding.di;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.b;
import com.incode.welcome_sdk.commons.g;
import com.incode.welcome_sdk.commons.h;
import com.incode.welcome_sdk.commons.n;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics;
import com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionOnboardingModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16497a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16498b = 1;

    static final class b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16499a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16500b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f16501c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16502d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16503e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Module module) {
            int i2 = 2 % 2;
            int i3 = f16503e + 67;
            f16499a = i3 % 128;
            int i4 = i3 % 2;
            b(module);
            Unit unit = Unit.INSTANCE;
            int i5 = f16503e + 125;
            f16499a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void b(Module module) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(module, "");
            Function2<Scope, ParametersHolder, PermissionViewModel> function2 = new Function2<Scope, ParametersHolder, PermissionViewModel>() { // from class: com.incode.welcome_sdk.ui.permission_onboarding.di.PermissionOnboardingModuleKt$permissionOnboardingModule$1$invoke$$inlined$viewModelOf$default$1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f16504b = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f16505e = 0;

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final PermissionViewModel invoke2(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    Object obj = scope.get(Reflection.getOrCreateKotlinClass(g.class), null, null);
                    Object obj2 = scope.get(Reflection.getOrCreateKotlinClass(IdCaptureAnalytics.class), null, null);
                    Object obj3 = scope.get(Reflection.getOrCreateKotlinClass(n.class), null, null);
                    Object obj4 = scope.get(Reflection.getOrCreateKotlinClass(b.class), null, null);
                    b bVar = (b) obj4;
                    n nVar = (n) obj3;
                    IdCaptureAnalytics idCaptureAnalytics = (IdCaptureAnalytics) obj2;
                    g gVar = (g) obj;
                    PermissionViewModel permissionViewModel = new PermissionViewModel(gVar, idCaptureAnalytics, nVar, bVar, (h) scope.get(Reflection.getOrCreateKotlinClass(h.class), null, null), (IncodeWelcome) scope.get(Reflection.getOrCreateKotlinClass(IncodeWelcome.class), null, null));
                    int i4 = f16504b + 1;
                    f16505e = i4 % 128;
                    int i5 = i4 % 2;
                    return permissionViewModel;
                }

                /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.ViewModel, com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionViewModel] */
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ PermissionViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    int i4 = f16504b + 29;
                    f16505e = i4 % 128;
                    Scope scope2 = scope;
                    ParametersHolder parametersHolder2 = parametersHolder;
                    if (i4 % 2 == 0) {
                        return invoke2(scope2, parametersHolder2);
                    }
                    invoke2(scope2, parametersHolder2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PermissionViewModel.class), null, function2, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory);
            OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), null);
            int i3 = f16503e + 15;
            f16499a = i3 % 128;
            int i4 = i3 % 2;
        }

        static {
            int i2 = f16502d + 41;
            f16500b = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        b() {
            super(1);
        }
    }

    public static final Module permissionOnboardingModule() {
        int i2 = 2 % 2;
        int i3 = f16498b + 7;
        f16497a = i3 % 128;
        int i4 = i3 % 2;
        return ModuleDSLKt.module$default(false, b.f16501c, 1, null);
    }
}
