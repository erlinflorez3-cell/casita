package com.incode.welcome_sdk.ui.id_capture.di;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.incode.camera.IncodeCamera;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentAnalyzer;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.b;
import com.incode.welcome_sdk.commons.h;
import com.incode.welcome_sdk.commons.j;
import com.incode.welcome_sdk.commons.n;
import com.incode.welcome_sdk.commons.o;
import com.incode.welcome_sdk.commons.utils.ak;
import com.incode.welcome_sdk.commons.utils.d;
import com.incode.welcome_sdk.commons.utils.k;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.a.e;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.ui.camera.IncodeCameraProvider;
import com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler;
import com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureFrameLogger;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.CaptureResultHolder;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.InitIdCaptureViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;
import org.koin.ext.KClassExtKt;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureModuleKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14932c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14933d = 1;

    static final class c extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14934a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14935b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14936c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14937d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14938e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Module module) {
            int i2 = 2 % 2;
            int i3 = f14937d + 79;
            f14938e = i3 % 128;
            int i4 = i3 % 2;
            c(module);
            Unit unit = Unit.INSTANCE;
            int i5 = f14938e + 77;
            f14937d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 34 / 0;
            }
            return unit;
        }

        private static void c(Module module) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(module, "");
            Function2<Scope, ParametersHolder, InitIdCaptureViewModel> function2 = new Function2<Scope, ParametersHolder, InitIdCaptureViewModel>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt$idCaptureModule$1$invoke$$inlined$viewModelOf$default$1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f14976b = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f14977d = 0;

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final InitIdCaptureViewModel invoke2(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    Object obj = scope.get(Reflection.getOrCreateKotlinClass(h.class), null, null);
                    Object obj2 = scope.get(Reflection.getOrCreateKotlinClass(IdCaptureAnalytics.class), null, null);
                    Object obj3 = scope.get(Reflection.getOrCreateKotlinClass(IncodeWelcomeRepository.class), null, null);
                    Object obj4 = scope.get(Reflection.getOrCreateKotlinClass(IncodeWelcome.class), null, null);
                    IncodeWelcome incodeWelcome = (IncodeWelcome) obj4;
                    IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) obj3;
                    IdCaptureAnalytics idCaptureAnalytics = (IdCaptureAnalytics) obj2;
                    h hVar = (h) obj;
                    InitIdCaptureViewModel initIdCaptureViewModel = new InitIdCaptureViewModel(hVar, idCaptureAnalytics, incodeWelcomeRepository, incodeWelcome, (n) scope.get(Reflection.getOrCreateKotlinClass(n.class), null, null), (IdScan) scope.get(Reflection.getOrCreateKotlinClass(IdScan.class), null, null));
                    int i4 = f14977d + 35;
                    f14976b = i4 % 128;
                    if (i4 % 2 != 0) {
                        return initIdCaptureViewModel;
                    }
                    throw null;
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.ViewModel, com.incode.welcome_sdk.ui.id_capture.viewmodel.InitIdCaptureViewModel] */
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ InitIdCaptureViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    int i4 = f14976b + 121;
                    f14977d = i4 % 128;
                    int i5 = i4 % 2;
                    ?? Invoke2 = invoke2(scope, parametersHolder);
                    int i6 = f14976b + 35;
                    f14977d = i6 % 128;
                    if (i6 % 2 == 0) {
                        return Invoke2;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(InitIdCaptureViewModel.class), null, function2, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory);
            OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory), null);
            AnonymousClass4 anonymousClass4 = new Function2<Scope, ParametersHolder, IdCaptureViewModel>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt.c.4

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f14954a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f14955b = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f14957d = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f14958e = 0;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ IdCaptureViewModel invoke(Scope scope, ParametersHolder parametersHolder) throws DefinitionParameterException {
                    int i3 = 2 % 2;
                    int i4 = f14955b + 27;
                    f14958e = i4 % 128;
                    Scope scope2 = scope;
                    ParametersHolder parametersHolder2 = parametersHolder;
                    if (i4 % 2 == 0) {
                        return a(scope2, parametersHolder2);
                    }
                    a(scope2, parametersHolder2);
                    throw null;
                }

                private static IdCaptureViewModel a(Scope scope, final ParametersHolder parametersHolder) throws DefinitionParameterException {
                    int i3 = 2 % 2;
                    int i4 = f14958e + 29;
                    f14955b = i4 % 128;
                    Object obj = null;
                    if (i4 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(scope, "");
                        Intrinsics.checkNotNullParameter(parametersHolder, "");
                        parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(IdScan.class));
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    IdCaptureRepository idCaptureRepository = (IdCaptureRepository) scope.get(Reflection.getOrCreateKotlinClass(IdCaptureRepository.class), null, null);
                    Object orNull = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(IdScan.class));
                    if (orNull == null) {
                        throw new DefinitionParameterException(new StringBuilder("No value found for type '").append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(IdScan.class))).append('\'').toString());
                    }
                    IdScan idScan = (IdScan) orNull;
                    Object orNull2 = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(o.class));
                    if (orNull2 == null) {
                        throw new DefinitionParameterException(new StringBuilder("No value found for type '").append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(o.class))).append('\'').toString());
                    }
                    o oVar = (o) orNull2;
                    Object orNull3 = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(IncodeCamera.class));
                    if (orNull3 == null) {
                        throw new DefinitionParameterException(new StringBuilder("No value found for type '").append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(IncodeCamera.class))).append('\'').toString());
                    }
                    IncodeCamera incodeCamera = (IncodeCamera) orNull3;
                    Object orNull4 = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(IdScan.IdType.class));
                    if (orNull4 == null) {
                        throw new DefinitionParameterException(new StringBuilder("No value found for type '").append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(IdScan.IdType.class))).append('\'').toString());
                    }
                    IdScan.IdType idType = (IdScan.IdType) orNull4;
                    Object orNull5 = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(b.class));
                    if (orNull5 == null) {
                        throw new DefinitionParameterException(new StringBuilder("No value found for type '").append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(b.class))).append('\'').toString());
                    }
                    b bVar = (b) orNull5;
                    Object orNull6 = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(AudioPermissionHandler.class));
                    if (orNull6 == null) {
                        throw new DefinitionParameterException(new StringBuilder("No value found for type '").append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(AudioPermissionHandler.class))).append('\'').toString());
                    }
                    CaptureResultHolder captureResultHolder = null;
                    CoroutineDispatcher coroutineDispatcher = null;
                    IdCaptureViewModel idCaptureViewModel = new IdCaptureViewModel(idCaptureRepository, incodeCamera, oVar, idType, idScan, bVar, (AudioPermissionHandler) orNull6, (IdCaptureAnalytics) scope.get(Reflection.getOrCreateKotlinClass(IdCaptureAnalytics.class), null, null), captureResultHolder, coroutineDispatcher, (j) scope.get(Reflection.getOrCreateKotlinClass(j.class), null, null), (IdCaptureFrameLogger) scope.get(Reflection.getOrCreateKotlinClass(IdCaptureFrameLogger.class), null, null), (ak) scope.get(Reflection.getOrCreateKotlinClass(ak.class), null, null), (AutoCaptureTimeoutHandler) scope.get(Reflection.getOrCreateKotlinClass(AutoCaptureTimeoutHandler.class), null, new Function0<ParametersHolder>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt.c.4.1

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f14959b = 0;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f14960e = 1;

                        private ParametersHolder b() {
                            int i5 = 2 % 2;
                            int i6 = f14959b;
                            int i7 = i6 + 17;
                            f14960e = i7 % 128;
                            int i8 = i7 % 2;
                            ParametersHolder parametersHolder2 = parametersHolder;
                            int i9 = i6 + 123;
                            f14960e = i9 % 128;
                            int i10 = i9 % 2;
                            return parametersHolder2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ ParametersHolder invoke() {
                            int i5 = 2 % 2;
                            int i6 = f14959b + 77;
                            f14960e = i6 % 128;
                            int i7 = i6 % 2;
                            ParametersHolder parametersHolderB = b();
                            int i8 = f14959b + 25;
                            f14960e = i8 % 128;
                            int i9 = i8 % 2;
                            return parametersHolderB;
                        }

                        {
                            super(0);
                        }
                    }), (List) scope.get(Reflection.getOrCreateKotlinClass(List.class), null, null), 768, null);
                    int i5 = f14958e + 83;
                    f14955b = i5 % 128;
                    if (i5 % 2 != 0) {
                        return idCaptureViewModel;
                    }
                    obj.hashCode();
                    throw null;
                }

                static {
                    int i3 = f14954a + 97;
                    f14957d = i3 % 128;
                    int i4 = i3 % 2;
                }
            };
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IdCaptureViewModel.class), null, anonymousClass4, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory2);
            new KoinDefinition(module, factoryInstanceFactory2);
            AnonymousClass3 anonymousClass3 = new Function2<Scope, ParametersHolder, AutoCaptureTimeoutHandler>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt.c.3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f14949a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f14950b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f14951c = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f14953e = 1;

                private static AutoCaptureTimeoutHandler b(Scope scope, ParametersHolder parametersHolder) throws DefinitionParameterException {
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    Object orNull = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(IdScan.class));
                    if (orNull != null) {
                        return new AutoCaptureTimeoutHandler((IdScan) orNull, (IdCaptureAnalytics) scope.get(Reflection.getOrCreateKotlinClass(IdCaptureAnalytics.class), null, null), null, (IdCaptureRepository) scope.get(Reflection.getOrCreateKotlinClass(IdCaptureRepository.class), null, null), 4, null);
                    }
                    throw new DefinitionParameterException(new StringBuilder("No value found for type '").append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(IdScan.class))).append('\'').toString());
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ AutoCaptureTimeoutHandler invoke(Scope scope, ParametersHolder parametersHolder) throws DefinitionParameterException {
                    int i3 = 2 % 2;
                    int i4 = f14953e + 73;
                    f14949a = i4 % 128;
                    Scope scope2 = scope;
                    ParametersHolder parametersHolder2 = parametersHolder;
                    if (i4 % 2 != 0) {
                        b(scope2, parametersHolder2);
                        throw null;
                    }
                    AutoCaptureTimeoutHandler autoCaptureTimeoutHandlerB = b(scope2, parametersHolder2);
                    int i5 = f14953e + 107;
                    f14949a = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 56 / 0;
                    }
                    return autoCaptureTimeoutHandlerB;
                }

                static {
                    int i3 = f14951c + 37;
                    f14950b = i3 % 128;
                    int i4 = i3 % 2;
                }
            };
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AutoCaptureTimeoutHandler.class), null, anonymousClass3, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory3);
            new KoinDefinition(module, factoryInstanceFactory3);
            AnonymousClass5 anonymousClass5 = new Function2<Scope, ParametersHolder, IdCaptureRepository>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt.c.5

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f14962a = 1;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f14963b = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f14965d = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f14966e = 0;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ IdCaptureRepository invoke(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    int i4 = f14966e + 61;
                    f14965d = i4 % 128;
                    Scope scope2 = scope;
                    ParametersHolder parametersHolder2 = parametersHolder;
                    if (i4 % 2 != 0) {
                        return d(scope2, parametersHolder2);
                    }
                    d(scope2, parametersHolder2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static IdCaptureRepository d(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    IdScan idScan = (IdScan) scope.get(Reflection.getOrCreateKotlinClass(IdScan.class), null, null);
                    IncodeWelcome incodeWelcome = (IncodeWelcome) scope.get(Reflection.getOrCreateKotlinClass(IncodeWelcome.class), null, null);
                    ak akVar = (ak) scope.get(Reflection.getOrCreateKotlinClass(ak.class), null, null);
                    com.incode.welcome_sdk.c cVar = (com.incode.welcome_sdk.c) scope.get(Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.c.class), null, null);
                    e eVar = (e) scope.get(Reflection.getOrCreateKotlinClass(e.class), null, null);
                    IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) scope.get(Reflection.getOrCreateKotlinClass(IncodeWelcomeRepository.class), null, null);
                    k kVar = (k) scope.get(Reflection.getOrCreateKotlinClass(k.class), null, null);
                    d dVar = (d) scope.get(Reflection.getOrCreateKotlinClass(d.class), null, null);
                    com.incode.welcome_sdk.e.e eVar2 = com.incode.welcome_sdk.e.e.f10222b;
                    IdCaptureRepository idCaptureRepository = new IdCaptureRepository(idScan, incodeWelcome, akVar, cVar, eVar, incodeWelcomeRepository, kVar, dVar, (CoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), com.incode.welcome_sdk.e.e.d(), null));
                    int i4 = f14965d + 95;
                    f14966e = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 86 / 0;
                    }
                    return idCaptureRepository;
                }

                static {
                    int i3 = f14962a + 65;
                    f14963b = i3 % 128;
                    int i4 = i3 % 2;
                }
            };
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IdCaptureRepository.class), null, anonymousClass5, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory4);
            new KoinDefinition(module, factoryInstanceFactory4);
            Function2<Scope, ParametersHolder, IdCaptureAnalytics> function22 = new Function2<Scope, ParametersHolder, IdCaptureAnalytics>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt$idCaptureModule$1$invoke$$inlined$factoryOf$default$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f14972a = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f14973c = 1;

                /* JADX WARN: Type inference failed for: r2v0, types: [com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ IdCaptureAnalytics invoke(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    int i4 = f14973c + 111;
                    f14972a = i4 % 128;
                    int i5 = i4 % 2;
                    ?? Invoke2 = invoke2(scope, parametersHolder);
                    int i6 = f14973c + 7;
                    f14972a = i6 % 128;
                    int i7 = i6 % 2;
                    return Invoke2;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final IdCaptureAnalytics invoke2(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    IdCaptureAnalytics idCaptureAnalytics = new IdCaptureAnalytics((IncodeWelcomeRepository) scope.get(Reflection.getOrCreateKotlinClass(IncodeWelcomeRepository.class), null, null), (n) scope.get(Reflection.getOrCreateKotlinClass(n.class), null, null));
                    int i4 = f14972a + 103;
                    f14973c = i4 % 128;
                    int i5 = i4 % 2;
                    return idCaptureAnalytics;
                }
            };
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IdCaptureAnalytics.class), null, function22, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory5);
            OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory5), null);
            AnonymousClass1 anonymousClass1 = new Function2<Scope, ParametersHolder, IdCaptureKitAndroid>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt.c.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f14939a = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f14941c = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f14942d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f14943e = 0;

                private static IdCaptureKitAndroid e(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    int i4 = f14943e + 39;
                    f14941c = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    IdCaptureKitAndroid idCaptureKitAndroid = IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getIdCaptureKitAndroid();
                    int i6 = f14941c + 61;
                    f14943e = i6 % 128;
                    int i7 = i6 % 2;
                    return idCaptureKitAndroid;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ IdCaptureKitAndroid invoke(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    int i4 = f14943e + 17;
                    f14941c = i4 % 128;
                    int i5 = i4 % 2;
                    IdCaptureKitAndroid idCaptureKitAndroidE = e(scope, parametersHolder);
                    int i6 = f14941c + 9;
                    f14943e = i6 % 128;
                    int i7 = i6 % 2;
                    return idCaptureKitAndroidE;
                }

                static {
                    int i3 = f14939a + 17;
                    f14942d = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IdCaptureKitAndroid.class), null, anonymousClass1, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory6);
            new KoinDefinition(module, factoryInstanceFactory6);
            AnonymousClass2 anonymousClass2 = new Function2<Scope, ParametersHolder, DocumentAnalyzer>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt.c.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f14944a = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f14946c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f14947d = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f14948e = 1;

                private static DocumentAnalyzer c(Scope scope, ParametersHolder parametersHolder) throws DefinitionParameterException {
                    int i3 = 2 % 2;
                    int i4 = f14948e + 31;
                    f14944a = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    DocumentAnalyzer.Companion companion = DocumentAnalyzer.INSTANCE;
                    IdCaptureKitAndroid idCaptureKitAndroid = (IdCaptureKitAndroid) scope.get(Reflection.getOrCreateKotlinClass(IdCaptureKitAndroid.class), null, null);
                    Object orNull = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(DocumentAnalyzer.Config.class));
                    if (orNull == null) {
                        throw new DefinitionParameterException(new StringBuilder("No value found for type '").append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(DocumentAnalyzer.Config.class))).append('\'').toString());
                    }
                    DocumentAnalyzer documentAnalyzerInitOrNull = companion.initOrNull(idCaptureKitAndroid, (DocumentAnalyzer.Config) orNull);
                    int i6 = f14944a + 69;
                    f14948e = i6 % 128;
                    int i7 = i6 % 2;
                    return documentAnalyzerInitOrNull;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ DocumentAnalyzer invoke(Scope scope, ParametersHolder parametersHolder) throws DefinitionParameterException {
                    int i3 = 2 % 2;
                    int i4 = f14948e + 91;
                    f14944a = i4 % 128;
                    int i5 = i4 % 2;
                    DocumentAnalyzer documentAnalyzerC = c(scope, parametersHolder);
                    int i6 = f14944a + 109;
                    f14948e = i6 % 128;
                    int i7 = i6 % 2;
                    return documentAnalyzerC;
                }

                static {
                    int i3 = f14946c + 95;
                    f14947d = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                }
            };
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DocumentAnalyzer.class), null, anonymousClass2, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory7);
            new KoinDefinition(module, factoryInstanceFactory7);
            AnonymousClass9 anonymousClass9 = new Function2<Scope, ParametersHolder, IncodeCamera<DocumentAnalysisEvent>>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt.c.9

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f14967a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f14968b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f14969c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f14971e = 1;

                private static IncodeCamera<DocumentAnalysisEvent> c(Scope scope, ParametersHolder parametersHolder) throws DefinitionParameterException {
                    int i3 = 2 % 2;
                    int i4 = f14967a + 89;
                    f14969c = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    IncodeCameraProvider incodeCameraProvider = IncodeCameraProvider.f11485d;
                    Context context = (Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) scope.get(Reflection.getOrCreateKotlinClass(LifecycleOwner.class), null, null);
                    Object orNull = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(DocumentAnalyzer.class));
                    if (orNull == null) {
                        throw new DefinitionParameterException(new StringBuilder("No value found for type '").append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(DocumentAnalyzer.class))).append('\'').toString());
                    }
                    IncodeCamera<DocumentAnalysisEvent> incodeCameraGenerateIncodeCameraForDocumentCapture = incodeCameraProvider.generateIncodeCameraForDocumentCapture(context, lifecycleOwner, (DocumentAnalyzer) orNull);
                    int i6 = f14967a + 115;
                    f14969c = i6 % 128;
                    int i7 = i6 % 2;
                    return incodeCameraGenerateIncodeCameraForDocumentCapture;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ IncodeCamera<DocumentAnalysisEvent> invoke(Scope scope, ParametersHolder parametersHolder) throws DefinitionParameterException {
                    int i3 = 2 % 2;
                    int i4 = f14969c + 11;
                    f14967a = i4 % 128;
                    Scope scope2 = scope;
                    ParametersHolder parametersHolder2 = parametersHolder;
                    if (i4 % 2 != 0) {
                        c(scope2, parametersHolder2);
                        throw null;
                    }
                    IncodeCamera<DocumentAnalysisEvent> incodeCameraC = c(scope2, parametersHolder2);
                    int i5 = f14969c + 55;
                    f14967a = i5 % 128;
                    int i6 = i5 % 2;
                    return incodeCameraC;
                }

                static {
                    int i3 = f14971e + 49;
                    f14968b = i3 % 128;
                    int i4 = i3 % 2;
                }
            };
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IncodeCamera.class), null, anonymousClass9, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory8);
            new KoinDefinition(module, factoryInstanceFactory8);
            Function2<Scope, ParametersHolder, IdCaptureFrameLogger> function23 = new Function2<Scope, ParametersHolder, IdCaptureFrameLogger>() { // from class: com.incode.welcome_sdk.ui.id_capture.di.IdCaptureModuleKt$idCaptureModule$1$invoke$$inlined$factoryOf$default$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f14974b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f14975c = 0;

                /* JADX WARN: Type inference failed for: r2v0, types: [com.incode.welcome_sdk.ui.id_capture.IdCaptureFrameLogger, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ IdCaptureFrameLogger invoke(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    int i4 = f14975c + 109;
                    f14974b = i4 % 128;
                    int i5 = i4 % 2;
                    ?? Invoke2 = invoke2(scope, parametersHolder);
                    int i6 = f14974b + 7;
                    f14975c = i6 % 128;
                    if (i6 % 2 == 0) {
                        return Invoke2;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final IdCaptureFrameLogger invoke2(Scope scope, ParametersHolder parametersHolder) {
                    int i3 = 2 % 2;
                    Intrinsics.checkNotNullParameter(scope, "");
                    Intrinsics.checkNotNullParameter(parametersHolder, "");
                    Object obj = scope.get(Reflection.getOrCreateKotlinClass(IncodeWelcomeRepository.class), null, null);
                    Object obj2 = scope.get(Reflection.getOrCreateKotlinClass(IdScan.class), null, null);
                    IdScan idScan = (IdScan) obj2;
                    IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) obj;
                    IdCaptureFrameLogger idCaptureFrameLogger = new IdCaptureFrameLogger(incodeWelcomeRepository, idScan, (DocumentAnalyzer.Config) scope.get(Reflection.getOrCreateKotlinClass(DocumentAnalyzer.Config.class), null, null), (IdCaptureKitAndroid) scope.get(Reflection.getOrCreateKotlinClass(IdCaptureKitAndroid.class), null, null));
                    int i4 = f14974b + 35;
                    f14975c = i4 % 128;
                    int i5 = i4 % 2;
                    return idCaptureFrameLogger;
                }
            };
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IdCaptureFrameLogger.class), null, function23, Kind.Factory, CollectionsKt.emptyList()));
            module.indexPrimaryType(factoryInstanceFactory9);
            OptionDSLKt.onOptions(new KoinDefinition(module, factoryInstanceFactory9), null);
            int i3 = f14937d + 53;
            f14938e = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        static {
            int i2 = f14934a + 3;
            f14936c = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        c() {
            super(1);
        }
    }

    public static final Module idCaptureModule() {
        int i2 = 2 % 2;
        int i3 = f14933d + 59;
        f14932c = i3 % 128;
        int i4 = i3 % 2;
        Module moduleModule$default = ModuleDSLKt.module$default(false, c.f14935b, 1, null);
        int i5 = f14932c + 1;
        f14933d = i5 % 128;
        int i6 = i5 % 2;
        return moduleModule$default;
    }
}
