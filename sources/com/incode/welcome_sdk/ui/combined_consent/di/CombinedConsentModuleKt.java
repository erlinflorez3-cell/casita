package com.incode.welcome_sdk.ui.combined_consent.di;

import com.incode.welcome_sdk.ui.combined_consent.CombinedConsentViewModel;
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
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes5.dex */
public final class CombinedConsentModuleKt {

    /* JADX INFO: renamed from: a */
    private static int f12926a = 1;

    /* JADX INFO: renamed from: b */
    private static int f12927b = 0;

    static final class c extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f12928a = 0;

        /* JADX INFO: renamed from: b */
        private static int f12929b = 0;

        /* JADX INFO: renamed from: c */
        public static final c f12930c = new c();

        /* JADX INFO: renamed from: d */
        private static int f12931d = 1;

        /* JADX INFO: renamed from: e */
        private static int f12932e = 1;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.combined_consent.di.CombinedConsentModuleKt$c$4 */
        static final class AnonymousClass4 extends Lambda implements Function2<Scope, ParametersHolder, CombinedConsentViewModel> {

            /* JADX INFO: renamed from: a */
            private static int f12933a = 0;

            /* JADX INFO: renamed from: b */
            private static int f12934b = 1;

            /* JADX INFO: renamed from: c */
            private static int f12935c = 0;

            /* JADX INFO: renamed from: d */
            private static int f12936d = 1;

            /* JADX INFO: renamed from: e */
            public static final AnonymousClass4 f12937e = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ CombinedConsentViewModel invoke(Scope scope, ParametersHolder parametersHolder) throws DefinitionParameterException {
                int i2 = 2 % 2;
                int i3 = f12933a + 49;
                f12936d = i3 % 128;
                int i4 = i3 % 2;
                CombinedConsentViewModel combinedConsentViewModelD = d(scope, parametersHolder);
                int i5 = f12936d + 71;
                f12933a = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 56 / 0;
                }
                return combinedConsentViewModelD;
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
            
                if (r7 != null) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
            
                r7 = (com.incode.welcome_sdk.modules.CombinedConsent) r7;
                r8 = r14.getOrNull(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.commons.n.class));
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
            
                if (r8 == null) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
            
                r8 = (com.incode.welcome_sdk.commons.n) r8;
                r9 = r14.getOrNull(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.commons.b.class));
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
            
                if (r9 == null) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
            
                r6 = new com.incode.welcome_sdk.ui.combined_consent.CombinedConsentViewModel(r7, r8, (com.incode.welcome_sdk.commons.b) r9, r10, (com.incode.welcome_sdk.commons.utils.aa) r13.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.commons.utils.aa.class), null, null), null, 32, null);
                r1 = com.incode.welcome_sdk.ui.combined_consent.di.CombinedConsentModuleKt.c.AnonymousClass4.f12936d + 45;
                com.incode.welcome_sdk.ui.combined_consent.di.CombinedConsentModuleKt.c.AnonymousClass4.f12933a = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
            
                return r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
            
                if (r7 != null) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
            
                throw new org.koin.core.error.DefinitionParameterException(new java.lang.StringBuilder("No value found for type '").append(org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.commons.b.class))).append('\'').toString());
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
            
                throw new org.koin.core.error.DefinitionParameterException(new java.lang.StringBuilder("No value found for type '").append(org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.commons.n.class))).append('\'').toString());
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
            
                throw new org.koin.core.error.DefinitionParameterException(new java.lang.StringBuilder("No value found for type '").append(org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.modules.CombinedConsent.class))).append('\'').toString());
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static com.incode.welcome_sdk.ui.combined_consent.CombinedConsentViewModel d(org.koin.core.scope.Scope r13, org.koin.core.parameter.ParametersHolder r14) throws org.koin.core.error.DefinitionParameterException {
                /*
                    Method dump skipped, instruction units count: 246
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.combined_consent.di.CombinedConsentModuleKt.c.AnonymousClass4.d(org.koin.core.scope.Scope, org.koin.core.parameter.ParametersHolder):com.incode.welcome_sdk.ui.combined_consent.CombinedConsentViewModel");
            }

            static {
                int i2 = f12935c + 123;
                f12934b = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass4() {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Module module) {
            int i2 = 2 % 2;
            int i3 = f12929b + 11;
            f12931d = i3 % 128;
            int i4 = i3 % 2;
            d(module);
            Unit unit = Unit.INSTANCE;
            int i5 = f12931d + 85;
            f12929b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void d(Module module) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(module, "");
            AnonymousClass4 anonymousClass4 = AnonymousClass4.f12937e;
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CombinedConsentViewModel.class), null, anonymousClass4, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory);
            new KoinDefinition(module, factoryInstanceFactory);
            int i3 = f12931d + 105;
            f12929b = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        static {
            int i2 = f12928a + 101;
            f12932e = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
            super(1);
        }
    }

    public static final Module combinedConsentModule() {
        int i2 = 2 % 2;
        int i3 = f12926a + 3;
        f12927b = i3 % 128;
        int i4 = i3 % 2;
        Module moduleModule$default = ModuleDSLKt.module$default(false, c.f12930c, 1, null);
        int i5 = f12927b + 5;
        f12926a = i5 % 128;
        int i6 = i5 % 2;
        return moduleModule$default;
    }
}
