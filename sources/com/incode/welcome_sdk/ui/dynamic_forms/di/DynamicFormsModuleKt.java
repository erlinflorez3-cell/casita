package com.incode.welcome_sdk.ui.dynamic_forms.di;

import android.content.Context;
import com.incode.welcome_sdk.commons.b;
import com.incode.welcome_sdk.commons.utils.v;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.DynamicForms;
import com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicFormsModuleKt {

    /* JADX INFO: renamed from: a */
    private static int f13285a = 1;

    /* JADX INFO: renamed from: b */
    private static int f13286b = 0;

    static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f13287a = 0;

        /* JADX INFO: renamed from: b */
        private static int f13288b = 0;

        /* JADX INFO: renamed from: c */
        public static final a f13289c = new a();

        /* JADX INFO: renamed from: d */
        private static int f13290d = 1;

        /* JADX INFO: renamed from: e */
        private static int f13291e = 1;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.dynamic_forms.di.DynamicFormsModuleKt$a$1 */
        static final class AnonymousClass1 extends Lambda implements Function2<Scope, ParametersHolder, DynamicFormsViewModel> {

            /* JADX INFO: renamed from: a */
            public static final AnonymousClass1 f13292a = ;

            /* JADX INFO: renamed from: b */
            private static int f13293b = 0;

            /* JADX INFO: renamed from: c */
            private static int f13294c = 0;

            /* JADX INFO: renamed from: d */
            private static int f13295d = 1;

            /* JADX INFO: renamed from: e */
            private static int f13296e = 1;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ DynamicFormsViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
                int i2 = 2 % 2;
                int i3 = f13294c + 5;
                f13296e = i3 % 128;
                Scope scope2 = scope;
                ParametersHolder parametersHolder2 = parametersHolder;
                if (i3 % 2 == 0) {
                    b(scope2, parametersHolder2);
                    throw null;
                }
                DynamicFormsViewModel dynamicFormsViewModelB = b(scope2, parametersHolder2);
                int i4 = f13296e + 101;
                f13294c = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 52 / 0;
                }
                return dynamicFormsViewModelB;
            }

            private static DynamicFormsViewModel b(Scope scope, ParametersHolder parametersHolder) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(scope, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                DynamicForms dynamicForms = (DynamicForms) parametersHolder.get(0);
                DynamicFormsViewModel dynamicFormsViewModel = new DynamicFormsViewModel((b) parametersHolder.get(1), dynamicForms, (IncodeWelcomeRepository) scope.get(Reflection.getOrCreateKotlinClass(IncodeWelcomeRepository.class), null, null), (List) scope.get(Reflection.getOrCreateKotlinClass(List.class), null, null), (PhoneNumberUtil) scope.get(Reflection.getOrCreateKotlinClass(PhoneNumberUtil.class), null, null), (String) scope.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("defaultCountryCode"), null), null, null, 192, null);
                int i3 = f13296e + 87;
                f13294c = i3 % 128;
                int i4 = i3 % 2;
                return dynamicFormsViewModel;
            }

            static {
                int i2 = f13293b + 99;
                f13295d = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 42 / 0;
                }
            }

            AnonymousClass1() {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Module module) {
            int i2 = 2 % 2;
            int i3 = f13290d + 71;
            f13287a = i3 % 128;
            int i4 = i3 % 2;
            c(module);
            Unit unit = Unit.INSTANCE;
            int i5 = f13290d + 13;
            f13287a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 72 / 0;
            }
            return unit;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.dynamic_forms.di.DynamicFormsModuleKt$a$3 */
        static final class AnonymousClass3 extends Lambda implements Function2<Scope, ParametersHolder, String> {

            /* JADX INFO: renamed from: a */
            private static int f13297a = 1;

            /* JADX INFO: renamed from: b */
            public static final AnonymousClass3 f13298b = ;

            /* JADX INFO: renamed from: c */
            private static int f13299c = 0;

            /* JADX INFO: renamed from: d */
            private static int f13300d = 1;

            /* JADX INFO: renamed from: e */
            private static int f13301e = 0;

            private static String e(Scope scope, ParametersHolder parametersHolder) {
                int i2 = 2 % 2;
                int i3 = f13301e + 35;
                f13300d = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    v vVar = v.f6649b;
                    Context applicationContext = ModuleExtKt.androidApplication(scope).getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    return v.e(applicationContext);
                }
                Intrinsics.checkNotNullParameter(scope, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                v vVar2 = v.f6649b;
                Context applicationContext2 = ModuleExtKt.androidApplication(scope).getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                v.e(applicationContext2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ String invoke(Scope scope, ParametersHolder parametersHolder) {
                int i2 = 2 % 2;
                int i3 = f13301e + 113;
                f13300d = i3 % 128;
                Scope scope2 = scope;
                ParametersHolder parametersHolder2 = parametersHolder;
                if (i3 % 2 != 0) {
                    return e(scope2, parametersHolder2);
                }
                e(scope2, parametersHolder2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                int i2 = f13299c + 55;
                f13297a = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass3() {
            }
        }

        private static void c(Module module) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(module, "");
            AnonymousClass1 anonymousClass1 = AnonymousClass1.f13292a;
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DynamicFormsViewModel.class), null, anonymousClass1, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory);
            new KoinDefinition(module, factoryInstanceFactory);
            StringQualifier stringQualifierNamed = QualifierKt.named("defaultCountryCode");
            AnonymousClass3 anonymousClass3 = AnonymousClass3.f13298b;
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, anonymousClass3, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
            module.indexPrimaryType(singleInstanceFactory2);
            if (module.get_createdAtStart()) {
                int i3 = f13287a + 53;
                f13290d = i3 % 128;
                if (i3 % 2 == 0) {
                    module.prepareForCreationAtStart(singleInstanceFactory);
                    throw null;
                }
                module.prepareForCreationAtStart(singleInstanceFactory);
            }
            new KoinDefinition(module, singleInstanceFactory2);
            int i4 = f13290d + 45;
            f13287a = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        static {
            int i2 = f13288b + 11;
            f13291e = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 34 / 0;
            }
        }

        a() {
            super(1);
        }
    }

    public static final Module dynamicFormsModule() {
        int i2 = 2 % 2;
        int i3 = f13286b + 93;
        f13285a = i3 % 128;
        Module moduleModule$default = i3 % 2 == 0 ? ModuleDSLKt.module$default(false, a.f13289c, 0, null) : ModuleDSLKt.module$default(false, a.f13289c, 1, null);
        int i4 = f13285a + 41;
        f13286b = i4 % 128;
        if (i4 % 2 == 0) {
            return moduleModule$default;
        }
        throw null;
    }
}
