package com.incode.welcome_sdk.e;

import android.app.Activity;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.c;
import com.incode.welcome_sdk.commons.n;
import com.incode.welcome_sdk.commons.utils.aa;
import com.incode.welcome_sdk.commons.utils.ak;
import com.incode.welcome_sdk.commons.utils.k;
import com.incode.welcome_sdk.commons.utils.o;
import com.incode.welcome_sdk.commons.utils.v;
import com.incode.welcome_sdk.commons.utils.x;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    public static final class b extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: b */
        public static final b f10203b = new b();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "");
            C0240a c0240a = new C0240a();
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.commons.utils.d.class), null, c0240a, Kind.Factory, CollectionsKt.emptyList()));
            module2.indexPrimaryType(factoryInstanceFactory);
            OptionDSLKt.onOptions(new KoinDefinition(module2, factoryInstanceFactory), null);
            d dVar = new d();
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(o.class), null, dVar, Kind.Factory, CollectionsKt.emptyList()));
            module2.indexPrimaryType(factoryInstanceFactory2);
            OptionDSLKt.onOptions(new KoinDefinition(module2, factoryInstanceFactory2), null);
            e eVar = new e();
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.commons.g.class), null, eVar, Kind.Factory, CollectionsKt.emptyList()));
            module2.indexPrimaryType(factoryInstanceFactory3);
            OptionDSLKt.onOptions(new KoinDefinition(module2, factoryInstanceFactory3), null);
            c cVar = new c();
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ak.class), null, cVar, Kind.Factory, CollectionsKt.emptyList()));
            module2.indexPrimaryType(factoryInstanceFactory4);
            OptionDSLKt.onOptions(new KoinDefinition(module2, factoryInstanceFactory4), null);
            C0241b c0241b = new C0241b();
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.commons.j.class), null, c0241b, Kind.Factory, CollectionsKt.emptyList()));
            module2.indexPrimaryType(factoryInstanceFactory5);
            OptionDSLKt.onOptions(new KoinDefinition(module2, factoryInstanceFactory5), null);
            AnonymousClass6 anonymousClass6 = AnonymousClass6.f10211b;
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IncodeWelcome.InternalConfig.class), null, anonymousClass6, Kind.Factory, CollectionsKt.emptyList()));
            module2.indexPrimaryType(factoryInstanceFactory6);
            new KoinDefinition(module2, factoryInstanceFactory6);
            AnonymousClass8 anonymousClass8 = AnonymousClass8.f10213a;
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(VideoStreamingManager.class), null, anonymousClass8, Kind.Factory, CollectionsKt.emptyList()));
            module2.indexPrimaryType(factoryInstanceFactory7);
            new KoinDefinition(module2, factoryInstanceFactory7);
            AnonymousClass12 anonymousClass12 = AnonymousClass12.f10206b;
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AccessibilityManager.class), null, anonymousClass12, Kind.Factory, CollectionsKt.emptyList()));
            module2.indexPrimaryType(factoryInstanceFactory8);
            new KoinDefinition(module2, factoryInstanceFactory8);
            g gVar = new g();
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(k.class), null, gVar, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
            module2.indexPrimaryType(singleInstanceFactory2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory);
            }
            OptionDSLKt.onOptions(new KoinDefinition(module2, singleInstanceFactory2), null);
            h hVar = new h();
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(aa.class), null, hVar, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory4 = singleInstanceFactory3;
            module2.indexPrimaryType(singleInstanceFactory4);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory3);
            }
            OptionDSLKt.onOptions(new KoinDefinition(module2, singleInstanceFactory4), null);
            i iVar = new i();
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.commons.h.class), null, iVar, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory6 = singleInstanceFactory5;
            module2.indexPrimaryType(singleInstanceFactory6);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory5);
            }
            OptionDSLKt.onOptions(new KoinDefinition(module2, singleInstanceFactory6), null);
            j jVar = new j();
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(n.class), null, jVar, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory8 = singleInstanceFactory7;
            module2.indexPrimaryType(singleInstanceFactory8);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory7);
            }
            OptionDSLKt.onOptions(new KoinDefinition(module2, singleInstanceFactory8), null);
            f fVar = new f();
            SingleInstanceFactory<?> singleInstanceFactory9 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(x.class), null, fVar, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory10 = singleInstanceFactory9;
            module2.indexPrimaryType(singleInstanceFactory10);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory9);
            }
            OptionDSLKt.onOptions(new KoinDefinition(module2, singleInstanceFactory10), null);
            AnonymousClass3 anonymousClass3 = AnonymousClass3.f10208a;
            SingleInstanceFactory<?> singleInstanceFactory11 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IncodeWelcome.class), null, anonymousClass3, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory12 = singleInstanceFactory11;
            module2.indexPrimaryType(singleInstanceFactory12);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory11);
            }
            new KoinDefinition(module2, singleInstanceFactory12);
            AnonymousClass5 anonymousClass5 = AnonymousClass5.f10210c;
            SingleInstanceFactory<?> singleInstanceFactory13 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IncodeWelcomeRepository.class), null, anonymousClass5, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory14 = singleInstanceFactory13;
            module2.indexPrimaryType(singleInstanceFactory14);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory13);
            }
            new KoinDefinition(module2, singleInstanceFactory14);
            AnonymousClass2 anonymousClass2 = AnonymousClass2.f10207b;
            SingleInstanceFactory<?> singleInstanceFactory15 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.data.local.a.e.class), null, anonymousClass2, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory16 = singleInstanceFactory15;
            module2.indexPrimaryType(singleInstanceFactory16);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory15);
            }
            new KoinDefinition(module2, singleInstanceFactory16);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.f10204a;
            SingleInstanceFactory<?> singleInstanceFactory17 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.c.class), null, anonymousClass1, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory18 = singleInstanceFactory17;
            module2.indexPrimaryType(singleInstanceFactory18);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory17);
            }
            new KoinDefinition(module2, singleInstanceFactory18);
            AnonymousClass4 anonymousClass4 = AnonymousClass4.f10209c;
            SingleInstanceFactory<?> singleInstanceFactory19 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PhoneNumberUtil.class), null, anonymousClass4, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory20 = singleInstanceFactory19;
            module2.indexPrimaryType(singleInstanceFactory20);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory19);
            }
            new KoinDefinition(module2, singleInstanceFactory20);
            AnonymousClass10 anonymousClass10 = AnonymousClass10.f10205b;
            SingleInstanceFactory<?> singleInstanceFactory21 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), null, anonymousClass10, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory22 = singleInstanceFactory21;
            module2.indexPrimaryType(singleInstanceFactory22);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory21);
            }
            new KoinDefinition(module2, singleInstanceFactory22);
            AnonymousClass9 anonymousClass9 = AnonymousClass9.f10214b;
            SingleInstanceFactory<?> singleInstanceFactory23 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(List.class), null, anonymousClass9, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory24 = singleInstanceFactory23;
            module2.indexPrimaryType(singleInstanceFactory24);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory23);
            }
            new KoinDefinition(module2, singleInstanceFactory24);
            com.incode.welcome_sdk.e.e eVar2 = com.incode.welcome_sdk.e.e.f10222b;
            StringQualifier stringQualifierD = com.incode.welcome_sdk.e.e.d();
            AnonymousClass7 anonymousClass7 = AnonymousClass7.f10212a;
            SingleInstanceFactory<?> singleInstanceFactory25 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CoroutineScope.class), stringQualifierD, anonymousClass7, Kind.Singleton, CollectionsKt.emptyList()));
            SingleInstanceFactory<?> singleInstanceFactory26 = singleInstanceFactory25;
            module2.indexPrimaryType(singleInstanceFactory26);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactory25);
            }
            new KoinDefinition(module2, singleInstanceFactory26);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$6 */
        static final class AnonymousClass6 extends Lambda implements Function2<Scope, ParametersHolder, IncodeWelcome.InternalConfig> {

            /* JADX INFO: renamed from: b */
            public static final AnonymousClass6 f10211b = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ IncodeWelcome.InternalConfig invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return ((IncodeWelcome) scope2.get(Reflection.getOrCreateKotlinClass(IncodeWelcome.class), null, null)).getInternalConfig();
            }

            AnonymousClass6() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$8 */
        static final class AnonymousClass8 extends Lambda implements Function2<Scope, ParametersHolder, VideoStreamingManager> {

            /* JADX INFO: renamed from: a */
            public static final AnonymousClass8 f10213a = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ VideoStreamingManager invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return ((IncodeWelcome) scope2.get(Reflection.getOrCreateKotlinClass(IncodeWelcome.class), null, null)).getVideoStreamingManager();
            }

            AnonymousClass8() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$12 */
        static final class AnonymousClass12 extends Lambda implements Function2<Scope, ParametersHolder, AccessibilityManager> {

            /* JADX INFO: renamed from: b */
            public static final AnonymousClass12 f10206b = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ AccessibilityManager invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                Object systemService = ((Context) scope2.get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).getSystemService("accessibility");
                Intrinsics.checkNotNull(systemService, "");
                return (AccessibilityManager) systemService;
            }

            AnonymousClass12() {
            }
        }

        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, x> {
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ x invoke(Scope scope, ParametersHolder parametersHolder) {
                Intrinsics.checkNotNullParameter(scope, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return new x();
            }

            public f() {
                super(2);
            }
        }

        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, n> {
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ n invoke(Scope scope, ParametersHolder parametersHolder) {
                Intrinsics.checkNotNullParameter(scope, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return new n();
            }

            public j() {
                super(2);
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$3 */
        static final class AnonymousClass3 extends Lambda implements Function2<Scope, ParametersHolder, IncodeWelcome> {

            /* JADX INFO: renamed from: a */
            public static final AnonymousClass3 f10208a = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ IncodeWelcome invoke(Scope scope, ParametersHolder parametersHolder) {
                Intrinsics.checkNotNullParameter(scope, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return IncodeWelcome.Companion.getInstance();
            }

            AnonymousClass3() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$5 */
        static final class AnonymousClass5 extends Lambda implements Function2<Scope, ParametersHolder, IncodeWelcomeRepository> {

            /* JADX INFO: renamed from: c */
            public static final AnonymousClass5 f10210c = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ IncodeWelcomeRepository invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return ((IncodeWelcome) scope2.get(Reflection.getOrCreateKotlinClass(IncodeWelcome.class), null, null)).getIncodeWelcomeRepositoryComponent().getIncodeRepository();
            }

            AnonymousClass5() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$a */
        public static final class C0240a extends Lambda implements Function2<Scope, ParametersHolder, com.incode.welcome_sdk.commons.utils.d> {
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ com.incode.welcome_sdk.commons.utils.d invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return new com.incode.welcome_sdk.commons.utils.d((Context) scope2.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }

            public C0240a() {
                super(2);
            }
        }

        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, com.incode.welcome_sdk.commons.g> {
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ com.incode.welcome_sdk.commons.g invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return new com.incode.welcome_sdk.commons.g((Activity) scope2.get(Reflection.getOrCreateKotlinClass(Activity.class), null, null));
            }

            public e() {
                super(2);
            }
        }

        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, aa> {

            /* JADX INFO: renamed from: c */
            public static int f10215c = 0;

            /* JADX INFO: renamed from: e */
            public static int f10216e = 0;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ aa invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return new aa((Context) scope2.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }

            public static int b() {
                int i2 = f10215c;
                int i3 = i2 % 8922004;
                f10215c = i2 + 1;
                if (i3 != 0) {
                    return f10216e;
                }
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                f10216e = iMaxMemory;
                return iMaxMemory;
            }

            public h() {
                super(2);
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$2 */
        static final class AnonymousClass2 extends Lambda implements Function2<Scope, ParametersHolder, com.incode.welcome_sdk.data.local.a.e> {

            /* JADX INFO: renamed from: b */
            public static final AnonymousClass2 f10207b = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ com.incode.welcome_sdk.data.local.a.e invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return ((IncodeWelcome) scope2.get(Reflection.getOrCreateKotlinClass(IncodeWelcome.class), null, null)).getDelayedOnboardingRepositoryComponent().a();
            }

            AnonymousClass2() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$1 */
        static final class AnonymousClass1 extends Lambda implements Function2<Scope, ParametersHolder, com.incode.welcome_sdk.c> {

            /* JADX INFO: renamed from: a */
            public static final AnonymousClass1 f10204a = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ com.incode.welcome_sdk.c invoke(Scope scope, ParametersHolder parametersHolder) {
                Intrinsics.checkNotNullParameter(scope, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                c.b bVar = com.incode.welcome_sdk.c.f4426a;
                return c.b.d();
            }

            AnonymousClass1() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$4 */
        static final class AnonymousClass4 extends Lambda implements Function2<Scope, ParametersHolder, PhoneNumberUtil> {

            /* JADX INFO: renamed from: c */
            public static final AnonymousClass4 f10209c = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ PhoneNumberUtil invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return PhoneNumberUtil.createInstance(ModuleExtKt.androidApplication(scope2).getApplicationContext());
            }

            AnonymousClass4() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$10 */
        static final class AnonymousClass10 extends Lambda implements Function2<Scope, ParametersHolder, String> {

            /* JADX INFO: renamed from: b */
            public static final AnonymousClass10 f10205b = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ String invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                v vVar = v.f6649b;
                Context applicationContext = ModuleExtKt.androidApplication(scope2).getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                return v.e(applicationContext);
            }

            AnonymousClass10() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$9 */
        static final class AnonymousClass9 extends Lambda implements Function2<Scope, ParametersHolder, List<? extends com.incode.welcome_sdk.data.local.a>> {

            /* JADX INFO: renamed from: b */
            public static final AnonymousClass9 f10214b = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ List<? extends com.incode.welcome_sdk.data.local.a> invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                com.incode.welcome_sdk.data.local.e eVar = com.incode.welcome_sdk.data.local.e.f8575b;
                return com.incode.welcome_sdk.data.local.e.a(ModuleExtKt.androidContext(scope2));
            }

            AnonymousClass9() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$7 */
        static final class AnonymousClass7 extends Lambda implements Function2<Scope, ParametersHolder, CoroutineScope> {

            /* JADX INFO: renamed from: a */
            public static final AnonymousClass7 f10212a = ;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ CoroutineScope invoke(Scope scope, ParametersHolder parametersHolder) {
                Intrinsics.checkNotNullParameter(scope, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
            }

            AnonymousClass7() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.e.a$b$b */
        public static final class C0241b extends Lambda implements Function2<Scope, ParametersHolder, com.incode.welcome_sdk.commons.j> {
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ com.incode.welcome_sdk.commons.j invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return new com.incode.welcome_sdk.commons.j((IncodeWelcome) scope2.get(Reflection.getOrCreateKotlinClass(IncodeWelcome.class), null, null), (VideoStreamingManager) scope2.get(Reflection.getOrCreateKotlinClass(VideoStreamingManager.class), null, null));
            }

            public C0241b() {
                super(2);
            }
        }

        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, ak> {
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ ak invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return new ak((AccessibilityManager) scope2.get(Reflection.getOrCreateKotlinClass(AccessibilityManager.class), null, null), (Context) scope2.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }

            public c() {
                super(2);
            }
        }

        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, k> {
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ k invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return new k((IncodeWelcome.InternalConfig) scope2.get(Reflection.getOrCreateKotlinClass(IncodeWelcome.InternalConfig.class), null, null), (Context) scope2.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }

            public g() {
                super(2);
            }
        }

        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, com.incode.welcome_sdk.commons.h> {
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ com.incode.welcome_sdk.commons.h invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                return new com.incode.welcome_sdk.commons.h((Context) scope2.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (IncodeWelcomeRepository) scope2.get(Reflection.getOrCreateKotlinClass(IncodeWelcomeRepository.class), null, null));
            }

            public i() {
                super(2);
            }
        }

        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, o> {
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ o invoke(Scope scope, ParametersHolder parametersHolder) {
                Scope scope2 = scope;
                Intrinsics.checkNotNullParameter(scope2, "");
                Intrinsics.checkNotNullParameter(parametersHolder, "");
                Object obj = scope2.get(Reflection.getOrCreateKotlinClass(IncodeWelcomeRepository.class), null, null);
                return new o((IncodeWelcomeRepository) obj, (n) scope2.get(Reflection.getOrCreateKotlinClass(n.class), null, null), (Modules) scope2.get(Reflection.getOrCreateKotlinClass(Modules.class), null, null));
            }

            public d() {
                super(2);
            }
        }

        b() {
            super(1);
        }
    }
}
