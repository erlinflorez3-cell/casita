package com.incode.welcome_sdk.c;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.c.e;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.am;
import com.incode.welcome_sdk.data.remote.beans.az;
import io.github.muddz.quickshot.QuickShot;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends com.incode.welcome_sdk.c.c implements QuickShot.QuickShotListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f4533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f4535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f4536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<com.incode.welcome_sdk.c.b.e> f4537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<String> f4538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f4539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f4540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4542j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f4543n;

    public final IncodeWelcomeRepository a() {
        return this.f4536d;
    }

    public e(IncodeWelcomeRepository incodeWelcomeRepository, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f4536d = incodeWelcomeRepository;
        this.f4534b = z2;
        this.f4535c = z3;
        this.f4537e = new ArrayList();
        this.f4533a = new LinkedHashMap();
        this.f4538f = new LinkedHashSet();
        this.f4543n = new c();
    }

    public static final class c extends FragmentManager.FragmentLifecycleCallbacks {
        c() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentResumed(fragmentManager, fragment);
            e.a(e.this);
            if (e.d(e.this, fragment) && e.this.f4541i) {
                String simpleName = fragment.getClass().getSimpleName();
                e eVar = e.this;
                Intrinsics.checkNotNull(simpleName);
                eVar.d(simpleName);
                e.this.b();
                e.this.f4540h = simpleName;
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentPaused(fragmentManager, fragment);
            String simpleName = fragment.getClass().getSimpleName();
            if (StringsKt.equals$default(e.this.f4540h, simpleName, false, 2, null) && e.this.f4541i && e.this.f4542j) {
                e eVar = e.this;
                View viewRequireView = fragment.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "");
                Intrinsics.checkNotNull(simpleName);
                eVar.b(viewRequireView, simpleName);
            }
        }
    }

    @Override // com.incode.welcome_sdk.c.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityStarted(activity);
        if (c(activity) && (activity instanceof AppCompatActivity)) {
            ((AppCompatActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.f4543n, true);
        }
    }

    @Override // com.incode.welcome_sdk.c.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityResumed(activity);
        this.f4541i = this.f4534b;
        this.f4542j = this.f4535c;
        if (c(activity) && this.f4541i) {
            String simpleName = activity.getClass().getSimpleName();
            Intrinsics.checkNotNull(simpleName);
            d(simpleName);
            b();
            this.f4539g = simpleName;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityPostResumed(activity);
        Timber.Forest.d("PostResumed Activity: " + activity.getClass().getSimpleName(), new Object[0]);
    }

    @Override // com.incode.welcome_sdk.c.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityPaused(activity);
        String simpleName = activity.getClass().getSimpleName();
        if (StringsKt.equals$default(this.f4539g, simpleName, false, 2, null) && this.f4541i && this.f4542j) {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "");
            Intrinsics.checkNotNull(simpleName);
            b(rootView, simpleName);
        }
    }

    @Override // com.incode.welcome_sdk.c.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityStopped(activity);
        String canonicalName = activity.getClass().getCanonicalName();
        if ((canonicalName == null || !StringsKt.startsWith$default(canonicalName, "com.incode.welcome_sdk", false, 2, (Object) null)) && (activity instanceof AppCompatActivity)) {
            ((AppCompatActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.f4543n);
        }
    }

    public final void b() {
        if (!i() || this.f4537e.isEmpty()) {
            return;
        }
        if (this.f4542j) {
            e();
        } else {
            c();
        }
    }

    private final void e() {
        ArrayList arrayList = new ArrayList(this.f4537e);
        this.f4537e.clear();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        Observable observableFromIterable = Observable.fromIterable(arrayList);
        final a aVar = a.f4544e;
        Observable map = observableFromIterable.map(new Function() { // from class: com.incode.welcome_sdk.c.e$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.b(aVar, obj);
            }
        });
        final C0209e c0209e = new C0209e();
        Observable observableSubscribeOn = map.flatMap(new Function() { // from class: com.incode.welcome_sdk.c.e$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.e(c0209e, obj);
            }
        }).subscribeOn(Schedulers.io());
        final d dVar = d.f4546a;
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.c.e$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                e.a(dVar, obj);
            }
        };
        final b bVar = new b(Timber.Forest);
        compositeDisposable.add(observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.c.e$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                e.d(bVar, obj);
            }
        }));
    }

    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<com.incode.welcome_sdk.c.b.e, com.incode.welcome_sdk.c.b.d> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f4544e = new a();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.incode.welcome_sdk.c.b.d invoke(com.incode.welcome_sdk.c.b.e eVar) {
            com.incode.welcome_sdk.c.b.e eVar2 = eVar;
            Intrinsics.checkNotNullParameter(eVar2, "");
            return com.incode.welcome_sdk.c.b.b.b(eVar2);
        }

        a() {
            super(1, com.incode.welcome_sdk.c.b.b.class, "toInterviewEvent", "toInterviewEvent(Lcom/incode/welcome_sdk/analytics/data/ExternalEvent;)Lcom/incode/welcome_sdk/analytics/data/InterviewEvent;", 1);
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.c.e$e, reason: collision with other inner class name */
    static final class C0209e extends Lambda implements Function1<com.incode.welcome_sdk.c.b.d, ObservableSource<? extends az>> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ObservableSource<? extends az> invoke(com.incode.welcome_sdk.c.b.d dVar) {
            final com.incode.welcome_sdk.c.b.d dVar2 = dVar;
            Intrinsics.checkNotNullParameter(dVar2, "");
            Observable<az> observableSendEvent = e.this.a().sendEvent(dVar2);
            final e eVar = e.this;
            final Function1<az, Unit> function1 = new Function1<az, Unit>() { // from class: com.incode.welcome_sdk.c.e.e.2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(az azVar) {
                    az azVar2 = azVar;
                    Intrinsics.checkNotNullParameter(azVar2, "");
                    String strB = azVar2.b();
                    Timber.Forest.d("ExternalEvent: %s, eventId: %s", dVar2.toString(), strB);
                    String strB2 = dVar2.b();
                    if (strB2 != null) {
                        eVar.f4533a.put(strB2, strB);
                        Timber.Forest.d("EventId added to map: %s", strB);
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            return observableSendEvent.doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.c.e$e$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    e.C0209e.a(function1, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }

        C0209e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.incode.welcome_sdk.c.b.d b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return (com.incode.welcome_sdk.c.b.d) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource e(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return (ObservableSource) function1.invoke(obj);
    }

    static final class d extends Lambda implements Function1<az, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4546a = new d();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(az azVar) {
            Timber.Forest.d("Event uploaded with Id: %s", azVar.d());
            return Unit.INSTANCE;
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            ((Timber.Forest) this.receiver).e(th);
            return Unit.INSTANCE;
        }

        b(Object obj) {
            super(1, obj, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    private final void c() {
        ArrayList arrayList = new ArrayList(this.f4537e);
        this.f4537e.clear();
        EventUtils.INSTANCE.sendExternalEventsBatched(this.f4536d, arrayList);
    }

    public final void d() {
        HashMap map = new HashMap();
        map.put(EventValues.TIMESTAMP.getValue(), Long.valueOf(System.currentTimeMillis()));
        this.f4537e.add(new com.incode.welcome_sdk.c.b.e(Event.EXTERNAL_APP_SESSION_START, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str) {
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put(EventValues.SCREEN_NAME.getValue(), str);
        map2.put(EventValues.TIMESTAMP.getValue(), Long.valueOf(System.currentTimeMillis()));
        this.f4537e.add(new com.incode.welcome_sdk.c.b.e(Event.EXTERNAL_SCREEN_VIEWED, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(View view, String str) {
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            QuickShot.of(view).enableLogging().setResultListener(this).setPath(this.f4536d.getInternalImagesDirectory().getPath()).setFilename(str).toJPG().save();
        } else {
            Timber.Forest.w("The view of " + str + " disappeared before a screenshot could be taken!", new Object[0]);
        }
    }

    private final boolean c(Activity activity) {
        Class<?> cls = activity.getClass();
        Intrinsics.checkNotNull(cls, "");
        String canonicalName = cls.getCanonicalName();
        return ((canonicalName != null && StringsKt.startsWith$default(canonicalName, "com.incode.welcome_sdk", false, 2, (Object) null)) || cls.getSimpleName().equals(this.f4539g) || IncodeWelcome.Companion.getInstance().isDelayedMode()) ? false : true;
    }

    private final boolean i() {
        String token = this.f4536d.getToken();
        return (token == null || token.length() == 0) ? false : true;
    }

    @Override // io.github.muddz.quickshot.QuickShot.QuickShotListener
    public final void onQuickShotSuccess(String str) {
        Timber.Forest.d("External screenshot saved at: " + str, new Object[0]);
        if (i()) {
            if (!this.f4537e.isEmpty()) {
                e();
                return;
            }
            Set set = CollectionsKt.toSet(this.f4533a.keySet());
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (!this.f4538f.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            Observable observableFromIterable = Observable.fromIterable(arrayList);
            final h hVar = new h();
            Observable observableObserveOn = observableFromIterable.flatMap(new Function() { // from class: com.incode.welcome_sdk.c.e$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    return e.c(hVar, obj2);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            final j jVar = new j();
            compositeDisposable.add(observableObserveOn.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.c.e$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    e.j(jVar, obj2);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.c.e$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    e.c(this.f$0, obj2);
                }
            }));
        }
    }

    static final class h extends Lambda implements Function1<String, ObservableSource<? extends ResponseBody>> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ObservableSource<? extends ResponseBody> invoke(String str) {
            String str2 = str;
            Intrinsics.checkNotNullParameter(str2, "");
            e.this.f4538f.add(str2);
            Object obj = e.this.f4533a.get(str2);
            Intrinsics.checkNotNull(obj);
            String str3 = (String) obj;
            Observable<am> externalScreenshotUploadUrl = e.this.a().getExternalScreenshotUploadUrl(str3);
            final AnonymousClass5 anonymousClass5 = new AnonymousClass5(e.this, str2, str3);
            return externalScreenshotUploadUrl.flatMap(new Function() { // from class: com.incode.welcome_sdk.c.e$h$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    return e.h.d(anonymousClass5, obj2);
                }
            });
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.c.e$h$5, reason: invalid class name */
        static final class AnonymousClass5 extends Lambda implements Function1<am, ObservableSource<? extends ResponseBody>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ e f4551b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ String f4552d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ String f4553e;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ ObservableSource<? extends ResponseBody> invoke(am amVar) {
                Observable<ResponseBody> observableDoOnNext;
                am amVar2 = amVar;
                Intrinsics.checkNotNullParameter(amVar2, "");
                final File file = new File(this.f4551b.a().getInternalImagesDirectory().getPath() + RemoteSettings.FORWARD_SLASH_STRING + this.f4553e + ".jpg");
                if (!file.exists()) {
                    Timber.Forest.w("Can't upload screenshot of " + this.f4553e + " as there's no file of it!", new Object[0]);
                    this.f4551b.f4533a.remove(this.f4552d);
                    this.f4551b.f4538f.remove(this.f4553e);
                    observableDoOnNext = Observable.empty();
                } else {
                    Observable<ResponseBody> observableUploadExternalScreenshot = this.f4551b.a().uploadExternalScreenshot(amVar2.c(), file);
                    final String str = this.f4552d;
                    final e eVar = this.f4551b;
                    final String str2 = this.f4553e;
                    final Function1<ResponseBody, Unit> function1 = new Function1<ResponseBody, Unit>() { // from class: com.incode.welcome_sdk.c.e.h.5.3
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ Unit invoke(ResponseBody responseBody) throws IOException {
                            Timber.Forest.d("Response for screenshot upload for " + str + ":\n" + responseBody.string(), new Object[0]);
                            eVar.f4533a.remove(str);
                            eVar.f4538f.remove(str2);
                            file.delete();
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    observableDoOnNext = observableUploadExternalScreenshot.doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.c.e$h$5$$ExternalSyntheticLambda0
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            e.h.AnonymousClass5.b(function1, obj);
                        }
                    });
                }
                return observableDoOnNext;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(Function1 function1, Object obj) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke(obj);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(e eVar, String str, String str2) {
                super(1);
                this.f4551b = eVar;
                this.f4553e = str;
                this.f4552d = str2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ObservableSource d(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (ObservableSource) function1.invoke(obj);
        }

        h() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource c(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return (ObservableSource) function1.invoke(obj);
    }

    static final class j extends Lambda implements Function1<ResponseBody, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseBody responseBody) {
            Timber.Forest.d("Screenshot uploads remaining: " + e.this.f4533a.size(), new Object[0]);
            return Unit.INSTANCE;
        }

        j() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(e eVar, Object obj) {
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNull(obj, "");
        Timber.Forest.e("Error uploading screenshot: " + ((Throwable) obj).getMessage(), new Object[0]);
        eVar.f4538f.clear();
    }

    @Override // io.github.muddz.quickshot.QuickShot.QuickShotListener
    public final void onQuickShotFailed(String str, String str2) {
        Timber.Forest.e("Failed to save external screenshot at " + str + " because: " + str2 + "!", new Object[0]);
    }

    public static final /* synthetic */ void a(e eVar) {
        eVar.f4541i = eVar.f4534b;
        eVar.f4542j = eVar.f4535c;
    }

    public static final /* synthetic */ boolean d(e eVar, Fragment fragment) {
        Class<?> cls = fragment.getClass();
        Intrinsics.checkNotNull(cls, "");
        String canonicalName = cls.getCanonicalName();
        return ((canonicalName != null && StringsKt.startsWith$default(canonicalName, "com.incode.welcome_sdk", false, 2, (Object) null)) || cls.getSimpleName().equals(eVar.f4540h) || IncodeWelcome.Companion.getInstance().isDelayedMode()) ? false : true;
    }
}
