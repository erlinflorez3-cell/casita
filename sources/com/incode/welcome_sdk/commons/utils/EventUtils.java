package com.incode.welcome_sdk.commons.utils;

import android.app.Activity;
import androidx.core.util.Pair;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.b;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.av;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity;
import com.incode.welcome_sdk.ui.tutorial.TutorialBackActivity;
import com.incode.welcome_sdk.ui.tutorial.TutorialDocumentScanActivity;
import com.incode.welcome_sdk.ui.tutorial.TutorialFrontActivity;
import com.incode.welcome_sdk.ui.tutorial.TutorialPassportActivity;
import com.incode.welcome_sdk.ui.tutorial.TutorialSelfieActivity;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class EventUtils {
    public static final int $stable = 0;
    public static final EventUtils INSTANCE = new EventUtils();

    /* JADX INFO: renamed from: b */
    private static int f6267b = 1;

    /* JADX INFO: renamed from: c */
    private static int f6268c = 1;

    /* JADX INFO: renamed from: d */
    private static int f6269d = 0;

    /* JADX INFO: renamed from: e */
    private static int f6270e = 0;

    private EventUtils() {
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final void sendEvent(IncodeWelcomeRepository incodeWelcomeRepository, Event event, Modules modules) {
        int i2 = 2 % 2;
        int i3 = f6269d + 111;
        f6268c = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            Intrinsics.checkNotNullParameter(event, "");
            sendEvent(incodeWelcomeRepository, event, modules, (HashMap<String, Object>) null);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(event, "");
        sendEvent(incodeWelcomeRepository, event, modules, (HashMap<String, Object>) null);
        int i4 = f6269d + 115;
        f6268c = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final void sendEvent(IncodeWelcomeRepository incodeWelcomeRepository, Event event, Modules modules, HashMap<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f6268c + 43;
        f6269d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            Intrinsics.checkNotNullParameter(event, "");
            supportSendEvent(incodeWelcomeRepository, event.getValue(), modules, map);
            incodeWelcomeRepository.onEvent(event, map);
            return;
        }
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(event, "");
        supportSendEvent(incodeWelcomeRepository, event.getValue(), modules, map);
        incodeWelcomeRepository.onEvent(event, map);
        throw null;
    }

    @JvmStatic
    public static final void sendEvent(IncodeWelcomeRepository incodeWelcomeRepository, Event event, Modules modules, ScreenName screenName) {
        int i2 = 2 % 2;
        int i3 = f6269d + 75;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(event, "");
        Intrinsics.checkNotNullParameter(modules, "");
        Intrinsics.checkNotNullParameter(screenName, "");
        supportSendEvent(incodeWelcomeRepository, event.getValue(), modules, MapsKt.hashMapOf(TuplesKt.to(EventValues.SCREEN_NAME.getValue(), screenName.name())));
        int i5 = f6269d + 93;
        f6268c = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class a extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f6271c = 1;

        /* JADX INFO: renamed from: e */
        private static int f6272e = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Event f6273b;

        private void c(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f6271c + 43;
            f6272e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            Timber.Forest.d("Events: " + this.f6273b + " sent: " + responseSuccess.isSuccess(), new Object[0]);
            int i5 = f6272e + 91;
            f6271c = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f6271c + 79;
            f6272e = i3 % 128;
            int i4 = i3 % 2;
            c(responseSuccess);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Event event) {
            super(1);
            this.f6273b = event;
        }
    }

    static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f6281c = 0;

        /* JADX INFO: renamed from: e */
        private static int f6282e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Event f6283b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6282e + 59;
            f6281c = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f6282e + 79;
            f6281c = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        private void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6281c + 117;
            f6282e = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.Forest.e(th, "Event: " + this.f6283b + " not sent", new Object[0]);
            } else {
                Timber.Forest.e(th, "Event: " + this.f6283b + " not sent", new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Event event) {
            super(1);
            this.f6283b = event;
        }
    }

    public static final void sendEventUsingCustomToken$lambda$0(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6268c + 29;
        f6269d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f6269d + 53;
        f6268c = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void sendEventUsingCustomToken$lambda$1(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6269d + 103;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f6269d + 81;
        f6268c = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void sendEventUsingCustomToken(String str, IncodeWelcomeRepository incodeWelcomeRepository, Event event, Modules modules, HashMap<String, Object> map) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(event, "");
        com.incode.welcome_sdk.c.b.d dVarCreateInterviewEvent = createInterviewEvent(map, modules, event.getValue());
        incodeWelcomeRepository.onInterviewEvent(dVarCreateInterviewEvent);
        Observable<ResponseSuccess> observableSubscribeOn = incodeWelcomeRepository.sendEvents(str, CollectionsKt.listOf(dVarCreateInterviewEvent)).subscribeOn(Schedulers.io());
        final a aVar = new a(event);
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EventUtils.sendEventUsingCustomToken$lambda$0(aVar, obj);
            }
        };
        final d dVar = new d(event);
        observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EventUtils.sendEventUsingCustomToken$lambda$1(dVar, obj);
            }
        });
        int i3 = f6269d + 85;
        f6268c = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final void supportSendEvent(IncodeWelcomeRepository incodeWelcomeRepository, String str, Modules modules, HashMap<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f6269d + 101;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(str, "");
        EventUtils eventUtils = INSTANCE;
        com.incode.welcome_sdk.c.b.d dVarCreateInterviewEvent = eventUtils.createInterviewEvent(map, modules, str);
        incodeWelcomeRepository.onInterviewEvent(dVarCreateInterviewEvent);
        eventUtils.sendEvents(incodeWelcomeRepository, CollectionsKt.listOf(dVarCreateInterviewEvent));
        int i5 = f6268c + 85;
        f6269d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final void sendSingleEvent(IncodeWelcomeRepository incodeWelcomeRepository, com.incode.welcome_sdk.c.b.d dVar) {
        int i2 = 2 % 2;
        int i3 = f6268c + 61;
        f6269d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        INSTANCE.sendEvents(incodeWelcomeRepository, CollectionsKt.listOf(dVar));
        int i5 = f6268c + 89;
        f6269d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final com.incode.welcome_sdk.c.b.d createInterviewEvent(HashMap<String, Object> map, Modules modules, String str) {
        String str2;
        if (map != null) {
            str2 = (String) map.get(EventValues.SCREEN_NAME.getValue());
            map.remove(EventValues.SCREEN_NAME.getValue());
        } else {
            str2 = null;
        }
        return new com.incode.welcome_sdk.c.b.d(str, modules != null ? modules.getModuleName() : null, str2, map, null, 16);
    }

    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f6274b = 0;

        /* JADX INFO: renamed from: c */
        private static int f6275c = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ List<com.incode.welcome_sdk.c.b.d> f6276e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6274b + 87;
            f6275c = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f6275c + 15;
            f6274b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6275c + 61;
            f6274b = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "Event: " + this.f6276e + " not sent", new Object[0]);
            int i5 = f6275c + 17;
            f6274b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<com.incode.welcome_sdk.c.b.d> list) {
            super(1);
            this.f6276e = list;
        }
    }

    static final class e extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f6284a = 0;

        /* JADX INFO: renamed from: b */
        private static int f6285b = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ List<com.incode.welcome_sdk.c.b.d> f6286c;

        private void e(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f6284a + 19;
            f6285b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            Timber.Forest.d("Events: " + this.f6286c + " sent: " + responseSuccess.isSuccess(), new Object[0]);
            int i5 = f6284a + 63;
            f6285b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 24 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f6284a + 107;
            f6285b = i3 % 128;
            int i4 = i3 % 2;
            e(responseSuccess);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f6285b + 105;
            f6284a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 34 / 0;
            }
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List<com.incode.welcome_sdk.c.b.d> list) {
            super(1);
            this.f6286c = list;
        }
    }

    public static final void sendEvents$lambda$2(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6269d + 63;
        f6268c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 34 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }
        int i5 = f6268c + 35;
        f6269d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void sendEvents$lambda$3(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6268c + 95;
        f6269d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
    }

    public final void sendEvents(IncodeWelcomeRepository incodeWelcomeRepository, List<com.incode.welcome_sdk.c.b.d> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(list, "");
        Observable<ResponseSuccess> observableSubscribeOn = incodeWelcomeRepository.sendEvents(list).subscribeOn(Schedulers.io());
        final e eVar = new e(list);
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EventUtils.sendEvents$lambda$2(eVar, obj);
            }
        };
        final b bVar = new b(list);
        observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EventUtils.sendEvents$lambda$3(bVar, obj);
            }
        });
        int i3 = f6268c + 57;
        f6269d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* synthetic */ class g extends FunctionReferenceImpl implements Function1<com.incode.welcome_sdk.c.b.e, com.incode.welcome_sdk.c.b.d> {

        /* JADX INFO: renamed from: a */
        private static int f6292a = 1;

        /* JADX INFO: renamed from: b */
        private static int f6293b = 1;

        /* JADX INFO: renamed from: c */
        private static int f6294c = 0;

        /* JADX INFO: renamed from: d */
        private static int f6295d = 0;

        /* JADX INFO: renamed from: e */
        public static final g f6296e = new g();

        private static com.incode.welcome_sdk.c.b.d c(com.incode.welcome_sdk.c.b.e eVar) {
            int i2 = 2 % 2;
            int i3 = f6293b + 3;
            f6294c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(eVar, "");
            com.incode.welcome_sdk.c.b.d dVarB = com.incode.welcome_sdk.c.b.b.b(eVar);
            int i5 = f6293b + 117;
            f6294c = i5 % 128;
            int i6 = i5 % 2;
            return dVarB;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.incode.welcome_sdk.c.b.d invoke(com.incode.welcome_sdk.c.b.e eVar) {
            int i2 = 2 % 2;
            int i3 = f6293b + 19;
            f6294c = i3 % 128;
            com.incode.welcome_sdk.c.b.e eVar2 = eVar;
            if (i3 % 2 == 0) {
                return c(eVar2);
            }
            c(eVar2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f6295d + 3;
            f6292a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 79 / 0;
            }
        }

        g() {
            super(1, com.incode.welcome_sdk.c.b.b.class, "toInterviewEvent", "toInterviewEvent(Lcom/incode/welcome_sdk/analytics/data/ExternalEvent;)Lcom/incode/welcome_sdk/analytics/data/InterviewEvent;", 1);
        }
    }

    public static final com.incode.welcome_sdk.c.b.d sendExternalEventsBatched$lambda$4(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6268c + 113;
        f6269d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        com.incode.welcome_sdk.c.b.d dVar = (com.incode.welcome_sdk.c.b.d) function1.invoke(obj);
        int i5 = f6269d + 17;
        f6268c = i5 % 128;
        if (i5 % 2 != 0) {
            return dVar;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class j extends Lambda implements Function1<List<? extends com.incode.welcome_sdk.c.b.d>, ObservableSource<? extends ResponseSuccess>> {

        /* JADX INFO: renamed from: b */
        private static int f6302b = 1;

        /* JADX INFO: renamed from: e */
        private static int f6303e = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ IncodeWelcomeRepository f6304d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ObservableSource<? extends ResponseSuccess> invoke(List<? extends com.incode.welcome_sdk.c.b.d> list) {
            int i2 = 2 % 2;
            int i3 = f6303e + 41;
            f6302b = i3 % 128;
            int i4 = i3 % 2;
            ObservableSource<? extends ResponseSuccess> observableSourceC = c(list);
            int i5 = f6303e + 89;
            f6302b = i5 % 128;
            int i6 = i5 % 2;
            return observableSourceC;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.utils.EventUtils$j$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<ResponseSuccess, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f6305a = 1;

            /* JADX INFO: renamed from: c */
            private static int f6306c = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ List<com.incode.welcome_sdk.c.b.d> f6307b;

            private void a(ResponseSuccess responseSuccess) {
                int i2 = 2 % 2;
                int i3 = f6306c + 33;
                f6305a = i3 % 128;
                int i4 = i3 % 2;
                Timber.Forest.d("ExternalEvents: " + list + ", sent:" + responseSuccess.isSuccess(), new Object[0]);
                int i5 = f6306c + 43;
                f6305a = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
                int i2 = 2 % 2;
                int i3 = f6306c + 71;
                f6305a = i3 % 128;
                int i4 = i3 % 2;
                a(responseSuccess);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = f6305a + 51;
                f6306c = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(List<com.incode.welcome_sdk.c.b.d> list) {
                super(1);
                list = list;
            }
        }

        public static final void a(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6303e + 45;
            f6302b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i5 = f6302b + 31;
            f6303e = i5 % 128;
            int i6 = i5 % 2;
        }

        private ObservableSource<? extends ResponseSuccess> c(List<com.incode.welcome_sdk.c.b.d> list) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            Observable<ResponseSuccess> observableSendEvents = this.f6304d.sendEvents(list);
            final AnonymousClass5 anonymousClass5 = new Function1<ResponseSuccess, Unit>() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils.j.5

                /* JADX INFO: renamed from: a */
                private static int f6305a = 1;

                /* JADX INFO: renamed from: c */
                private static int f6306c = 0;

                /* JADX INFO: renamed from: b */
                private /* synthetic */ List<com.incode.welcome_sdk.c.b.d> f6307b;

                private void a(ResponseSuccess responseSuccess) {
                    int i22 = 2 % 2;
                    int i3 = f6306c + 33;
                    f6305a = i3 % 128;
                    int i4 = i3 % 2;
                    Timber.Forest.d("ExternalEvents: " + list + ", sent:" + responseSuccess.isSuccess(), new Object[0]);
                    int i5 = f6306c + 43;
                    f6305a = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
                    int i22 = 2 % 2;
                    int i3 = f6306c + 71;
                    f6305a = i3 % 128;
                    int i4 = i3 % 2;
                    a(responseSuccess);
                    Unit unit = Unit.INSTANCE;
                    if (i4 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i5 = f6305a + 51;
                    f6306c = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(List<com.incode.welcome_sdk.c.b.d> list2) {
                    super(1);
                    list = list2;
                }
            };
            Observable<ResponseSuccess> observableDoOnNext = observableSendEvents.doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils$j$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    EventUtils.j.a(anonymousClass5, obj);
                }
            });
            int i3 = f6302b + 39;
            f6303e = i3 % 128;
            int i4 = i3 % 2;
            return observableDoOnNext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(IncodeWelcomeRepository incodeWelcomeRepository) {
            super(1);
            this.f6304d = incodeWelcomeRepository;
        }
    }

    public static final ObservableSource sendExternalEventsBatched$lambda$5(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6269d + 17;
        f6268c = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (ObservableSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class f extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f6287a = 0;

        /* JADX INFO: renamed from: b */
        public static final f f6288b = new f();

        /* JADX INFO: renamed from: c */
        private static int f6289c = 1;

        /* JADX INFO: renamed from: d */
        private static int f6290d = 1;

        /* JADX INFO: renamed from: e */
        private static int f6291e = 0;

        private static void b() {
            int i2 = 2 % 2;
            int i3 = f6289c + 85;
            f6291e = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.d("Subscribed to a list of unsent events", new Object[1]);
            } else {
                Timber.Forest.d("Subscribed to a list of unsent events", new Object[0]);
            }
            int i4 = f6291e + 29;
            f6289c = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f6289c + 65;
            f6291e = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            int i5 = f6289c + 117;
            f6291e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f6290d + 101;
            f6287a = i2 % 128;
            int i3 = i2 % 2;
        }

        f() {
            super(1);
        }
    }

    static final class i extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f6297a = 0;

        /* JADX INFO: renamed from: b */
        public static final i f6298b = new i();

        /* JADX INFO: renamed from: c */
        private static int f6299c = 0;

        /* JADX INFO: renamed from: d */
        private static int f6300d = 1;

        /* JADX INFO: renamed from: e */
        private static int f6301e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6301e + 115;
            f6297a = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f6301e + 27;
            f6297a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 60 / 0;
            }
            return unit;
        }

        private static void a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6301e + 11;
            f6297a = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.e(th, "Error while sending batched events.", new Object[0]);
            } else {
                Timber.Forest.e(th, "Error while sending batched events.", new Object[0]);
            }
        }

        static {
            int i2 = f6299c + 37;
            f6300d = i2 % 128;
            int i3 = i2 % 2;
        }

        i() {
            super(1);
        }
    }

    public static final void sendExternalEventsBatched$lambda$6(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6268c + 27;
        f6269d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f6268c + 117;
        f6269d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
    }

    public static final void sendExternalEventsBatched$lambda$7(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6269d + 77;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f6269d + 75;
        f6268c = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void sendExternalEventsBatched(IncodeWelcomeRepository incodeWelcomeRepository, List<com.incode.welcome_sdk.c.b.e> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(list, "");
        Timber.Forest.d("ExternalEvents sending %d events", Integer.valueOf(list.size()));
        Observable observableFromIterable = Observable.fromIterable(list);
        final g gVar = g.f6296e;
        Observable observable = observableFromIterable.map(new Function() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return EventUtils.sendExternalEventsBatched$lambda$4(gVar, obj);
            }
        }).toList().toObservable();
        final j jVar = new j(incodeWelcomeRepository);
        Observable observableSubscribeOn = observable.flatMap(new Function() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return EventUtils.sendExternalEventsBatched$lambda$5(jVar, obj);
            }
        }).subscribeOn(Schedulers.io());
        final f fVar = f.f6288b;
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EventUtils.sendExternalEventsBatched$lambda$6(fVar, obj);
            }
        };
        final i iVar = i.f6298b;
        observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.EventUtils$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EventUtils.sendExternalEventsBatched$lambda$7(iVar, obj);
            }
        });
        int i3 = f6269d + 13;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
    }

    @JvmStatic
    public static final void sendVideoSelfieQuestionAnsweredEvent(IncodeWelcomeRepository incodeWelcomeRepository, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), incodeWelcomeRepository.getCurrentScreenName().name());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, Event.VIDEO_SELFIE_QUESTION_X_ANSWERED.getValue(), Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        supportSendEvent(incodeWelcomeRepository, str, Modules.VIDEO_ONBOARDING, map);
        int i4 = f6268c + 45;
        f6269d = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void sendVideoSelfieProcessingEvent(IncodeWelcomeRepository incodeWelcomeRepository, Event event, Modules modules, List<String> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(event, "");
        HashMap map = new HashMap();
        if (list != null) {
            map.put(EventValues.ERROR_STATES.getValue(), new JSONArray((Collection) list));
            int i3 = f6268c + 69;
            f6269d = i3 % 128;
            int i4 = i3 % 2;
        }
        map.put(EventValues.SCREEN_NAME.getValue(), incodeWelcomeRepository.getCurrentScreenName().name());
        sendEvent(incodeWelcomeRepository, event, modules, (HashMap<String, Object>) map);
        int i5 = f6268c + 91;
        f6269d = i5 % 128;
        int i6 = i5 % 2;
    }

    @JvmStatic
    public static final void sendSdkInfoEvent(IncodeWelcomeRepository incodeWelcomeRepository, String str, String str2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put(EventValues.VERSION.getValue(), "5.40.3");
        String value = EventValues.VERSION_DETAILS.getValue();
        String strE = h.e(IncodeWelcome.Companion.getInstance().getApplication());
        Intrinsics.checkNotNullExpressionValue(strE, "");
        map2.put(value, strE);
        if (str != null) {
            int i3 = f6268c + 49;
            f6269d = i3 % 128;
            int i4 = i3 % 2;
            map2.put(EventValues.CONFIGURATION_NAME.getValue(), str);
        }
        if (str2 != null) {
            map2.put(EventValues.SECTION_NAME.getValue(), str2);
            int i5 = f6269d + 111;
            f6268c = i5 % 128;
            int i6 = i5 % 2;
        }
        sendEvent(incodeWelcomeRepository, Event.SDK_INFO, (Modules) null, (HashMap<String, Object>) map);
    }

    @JvmStatic
    public static final void sendHookDetectionDisabledEvent(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f6269d + 59;
        f6268c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            sendEvent(incodeWelcomeRepository, Event.HOOK_DETECTION_DISABLED, (Modules) null, (HashMap<String, Object>) null);
            int i4 = 57 / 0;
        } else {
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            sendEvent(incodeWelcomeRepository, Event.HOOK_DETECTION_DISABLED, (Modules) null, (HashMap<String, Object>) null);
        }
        int i5 = f6268c + 71;
        f6269d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
    }

    @JvmStatic
    public static final void sendEmulatorDetectionDisabledEvent(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f6269d + 23;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        sendEvent(incodeWelcomeRepository, Event.EMULATOR_DETECTION_DISABLED, (Modules) null, (HashMap<String, Object>) null);
        int i5 = f6268c + 7;
        f6269d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
    }

    @JvmStatic
    public static final void sendRootDetectionDisabledEvent(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f6268c + 87;
        f6269d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        sendEvent(incodeWelcomeRepository, Event.ROOT_DETECTION_DISABLED, (Modules) null, (HashMap<String, Object>) null);
        int i5 = f6268c + 33;
        f6269d = i5 % 128;
        int i6 = i5 % 2;
    }

    @JvmStatic
    public static final void sendVirtualEnvironmentDetectionDisabledEvent(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f6268c + 93;
        f6269d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            sendEvent(incodeWelcomeRepository, Event.VIRTUAL_ENVIRONMENT_DETECTION_DISABLED, (Modules) null, (HashMap<String, Object>) null);
            int i4 = 99 / 0;
        } else {
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            sendEvent(incodeWelcomeRepository, Event.VIRTUAL_ENVIRONMENT_DETECTION_DISABLED, (Modules) null, (HashMap<String, Object>) null);
        }
        int i5 = f6268c + 5;
        f6269d = i5 % 128;
        int i6 = i5 % 2;
    }

    @JvmStatic
    public static final void sendContinueEvent(IncodeWelcomeRepository incodeWelcomeRepository, Activity activity) {
        Modules module;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        String strName = null;
        if (!(activity instanceof BaseActivity)) {
            module = null;
        } else {
            int i3 = f6268c + 35;
            f6269d = i3 % 128;
            if (i3 % 2 != 0) {
                BaseActivity baseActivity = (BaseActivity) activity;
                baseActivity.getScreenName().name();
                baseActivity.getModule();
                strName.hashCode();
                throw null;
            }
            BaseActivity baseActivity2 = (BaseActivity) activity;
            strName = baseActivity2.getScreenName().name();
            module = baseActivity2.getModule();
        }
        if (strName == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), strName);
        sendEvent(incodeWelcomeRepository, Event.CONTINUE, module, (HashMap<String, Object>) map);
        int i4 = f6268c + 43;
        f6269d = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void sendTutorialShownEvent$default(IncodeWelcomeRepository incodeWelcomeRepository, Activity activity, IdCategory idCategory, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f6268c + 69;
        f6269d = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 4) != 0) {
            idCategory = null;
        }
        sendTutorialShownEvent(incodeWelcomeRepository, activity, idCategory);
        int i6 = f6269d + 83;
        f6268c = i6 % 128;
        int i7 = i6 % 2;
    }

    @JvmStatic
    public static final void sendTutorialShownEvent(IncodeWelcomeRepository incodeWelcomeRepository, Activity activity, IdCategory idCategory) {
        Event event;
        Modules module;
        int i2 = 2 % 2;
        int i3 = f6269d + 9;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        ScreenName screenName = null;
        if (activity instanceof TutorialFrontActivity) {
            event = idCategory == IdCategory.FIRST ? Event.TUTORIAL_FRONT_ID : Event.TUTORIAL_FRONT_SECOND_ID;
        } else if (activity instanceof TutorialBackActivity) {
            event = idCategory == IdCategory.FIRST ? Event.TUTORIAL_BACK_ID : Event.TUTORIAL_BACK_SECOND_ID;
        } else if (activity instanceof TutorialPassportActivity) {
            if (idCategory == IdCategory.FIRST) {
                int i5 = f6269d + 39;
                f6268c = i5 % 128;
                int i6 = i5 % 2;
                event = Event.TUTORIAL_PASSPORT;
            } else {
                event = Event.TUTORIAL_SECOND_PASSPORT;
            }
        } else if (activity instanceof TutorialSelfieActivity) {
            int i7 = f6268c + 21;
            f6269d = i7 % 128;
            int i8 = i7 % 2;
            event = Event.TUTORIAL_SELFIE;
        } else {
            event = activity instanceof TutorialDocumentScanActivity ? Event.TUTORIAL_DOCUMENT_VALIDATION : activity instanceof VideoSelfieChecksActivity ? Event.TUTORIAL_VIDEO_SELFIE : null;
        }
        if (event == null) {
            return;
        }
        if (activity instanceof BaseActivity) {
            int i9 = f6268c + 5;
            f6269d = i9 % 128;
            int i10 = i9 % 2;
            BaseActivity baseActivity = (BaseActivity) activity;
            module = baseActivity.getModule();
            screenName = baseActivity.getScreenName();
        } else {
            module = null;
        }
        HashMap map = new HashMap();
        if (screenName != null) {
            map.put(EventValues.SCREEN_NAME.getValue(), screenName.name());
        }
        supportSendEvent(incodeWelcomeRepository, event.getValue(), module, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e A[PHI: r1
  0x004e: PHI (r1v3 android.hardware.Camera$Parameters) = (r1v2 android.hardware.Camera$Parameters), (r1v7 android.hardware.Camera$Parameters) binds: [B:31:0x004b, B:26:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.Deprecated(message = "Use generic version with previewWidth, height, and autofocus parameters instead")
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void sendCameraOpenedEvent(com.incode.welcome_sdk.data.IncodeWelcomeRepository r11, com.incode.welcome_sdk.data.Event r12, com.incode.welcome_sdk.modules.Modules r13, com.incode.welcome_sdk.ScreenName r14, android.hardware.Camera r15) {
        /*
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.commons.utils.EventUtils.f6268c
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.EventUtils.f6269d = r0
            int r1 = r1 % r5
            r3 = 0
            r10 = 0
            java.lang.String r0 = ""
            r4 = r15
            r9 = r14
            r7 = r12
            r6 = r11
            if (r1 == 0) goto L3b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.hardware.Camera$Parameters r1 = com.incode.welcome_sdk.commons.utils.e.a(r4)
            r0 = 16
            int r0 = r0 / r3
            if (r1 != 0) goto L4e
        L2b:
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.String r1 = "Cannot send all data with the Camera Opened event with null Camera.Parameters"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2.w(r1, r0)
            r11 = r10
            r12 = r11
        L36:
            r8 = r13
            sendCameraOpenedEvent(r6, r7, r8, r9, r10, r11, r12)
            return
        L3b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.hardware.Camera$Parameters r1 = com.incode.welcome_sdk.commons.utils.e.a(r4)
            if (r1 != 0) goto L4e
            goto L2b
        L4e:
            android.hardware.Camera$Size r2 = r1.getPreviewSize()
            if (r2 == 0) goto L74
            int r0 = com.incode.welcome_sdk.commons.utils.EventUtils.f6268c
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.EventUtils.f6269d = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L76
            int r0 = r2.width
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            int r0 = r2.height
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L6b:
            boolean r0 = com.incode.welcome_sdk.commons.utils.e.c(r4)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            goto L36
        L74:
            r11 = r10
            goto L6b
        L76:
            int r0 = r2.width
            java.lang.Integer.valueOf(r0)
            int r0 = r2.height
            java.lang.Integer.valueOf(r0)
            r10.hashCode()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.EventUtils.sendCameraOpenedEvent(com.incode.welcome_sdk.data.IncodeWelcomeRepository, com.incode.welcome_sdk.data.Event, com.incode.welcome_sdk.modules.Modules, com.incode.welcome_sdk.ScreenName, android.hardware.Camera):void");
    }

    @JvmStatic
    public static final void sendCameraOpenedEvent(IncodeWelcomeRepository incodeWelcomeRepository, Event event, Modules modules, ScreenName screenName, Integer num, Integer num2, Boolean bool) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(event, "");
        Intrinsics.checkNotNullParameter(screenName, "");
        try {
            HashMap map = new HashMap();
            if (num != null) {
                int i3 = f6269d;
                int i4 = i3 + 99;
                f6268c = i4 % 128;
                int i5 = i4 % 2;
                if (num2 != null) {
                    int i6 = i3 + 85;
                    f6268c = i6 % 128;
                    int i7 = i6 % 2;
                    String value = EventValues.RESOLUTION.getValue();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format(Locale.US, "%dx%s", Arrays.copyOf(new Object[]{num, num2}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    map.put(value, str);
                }
            }
            if (bool != null) {
                int i8 = f6268c + 55;
                f6269d = i8 % 128;
                if (i8 % 2 != 0) {
                    map.put(EventValues.AUTO_FOCUS.getValue(), bool);
                    throw null;
                }
                map.put(EventValues.AUTO_FOCUS.getValue(), bool);
            }
            map.put(EventValues.SCREEN_NAME.getValue(), screenName.name());
            sendEvent(incodeWelcomeRepository, event, modules, (HashMap<String, Object>) map);
        } catch (RuntimeException e2) {
            Timber.Forest.e(e2);
        }
    }

    @JvmStatic
    public static final void sendSwitchToManualCaptureEvent(IncodeWelcomeRepository incodeWelcomeRepository, Event event, Modules modules, List<String> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(event, "");
        HashMap map = new HashMap();
        if (list != null) {
            map.put(EventValues.ERROR_STATES.getValue(), new JSONArray((Collection) list));
            int i3 = f6268c + 117;
            f6269d = i3 % 128;
            int i4 = i3 % 2;
        }
        map.put(EventValues.SCREEN_NAME.getValue(), incodeWelcomeRepository.getCurrentScreenName().name());
        sendEvent(incodeWelcomeRepository, event, modules, (HashMap<String, Object>) map);
    }

    @JvmStatic
    public static final void sendExitPromptEvent(IncodeWelcomeRepository incodeWelcomeRepository, String str, Modules modules) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(str, "");
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), str);
        sendEvent(incodeWelcomeRepository, Event.EXIT_CONFIRM, modules, (HashMap<String, Object>) map);
        int i3 = f6268c + 37;
        f6269d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final void sendExitConfirmedEvent(IncodeWelcomeRepository incodeWelcomeRepository, String str, Modules modules, String str2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put(EventValues.SCREEN_NAME.getValue(), str);
        map2.put(EventValues.ACTION.getValue(), str2);
        sendEvent(incodeWelcomeRepository, Event.EXIT_CTA_TAPPED, modules, (HashMap<String, Object>) map);
        int i3 = f6268c + 5;
        f6269d = i3 % 128;
        int i4 = i3 % 2;
    }

    @JvmStatic
    public static final void sendScreenOpened(IncodeWelcomeRepository incodeWelcomeRepository, ScreenName screenName, Modules modules) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(screenName, "");
        Intrinsics.checkNotNullParameter(modules, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put(EventValues.SCREEN_NAME.getValue(), screenName.name());
        map2.put(EventValues.MODULE.getValue(), modules.name());
        sendEvent(incodeWelcomeRepository, Event.SCREEN_OPENED, modules, (HashMap<String, Object>) map);
        int i3 = f6269d + 71;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
    }

    @JvmStatic
    public static final void sendScreenClosed(IncodeWelcomeRepository incodeWelcomeRepository, ScreenName screenName, Modules modules) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(screenName, "");
        Intrinsics.checkNotNullParameter(modules, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put(EventValues.SCREEN_NAME.getValue(), screenName.name());
        map2.put(EventValues.MODULE.getValue(), modules.name());
        sendEvent(incodeWelcomeRepository, Event.SCREEN_CLOSED, modules, (HashMap<String, Object>) map);
        int i3 = f6268c + 87;
        f6269d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x001d, code lost:
    
        if (r6 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001f, code lost:
    
        r1 = com.incode.welcome_sdk.commons.utils.EventUtils.f6269d + 35;
        com.incode.welcome_sdk.commons.utils.EventUtils.f6268c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0028, code lost:
    
        if ((r1 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        sendScreenClosed(r3, r4, r5);
        r0 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        sendScreenClosed(r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        if (r6 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        sendScreenOpened(r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void sendScreenEvent(com.incode.welcome_sdk.data.IncodeWelcomeRepository r3, com.incode.welcome_sdk.ScreenName r4, com.incode.welcome_sdk.modules.Modules r5, boolean r6) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.commons.utils.EventUtils.f6268c
            int r1 = r0 + 63
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.EventUtils.f6269d = r0
            int r1 = r1 % r2
            java.lang.String r0 = ""
            if (r1 == 0) goto L36
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 22
            int r0 = r0 / 0
            if (r6 == 0) goto L42
        L1f:
            int r0 = com.incode.welcome_sdk.commons.utils.EventUtils.f6269d
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.EventUtils.f6268c = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L32
            sendScreenClosed(r3, r4, r5)
            r0 = 25
            int r0 = r0 / 0
        L31:
            return
        L32:
            sendScreenClosed(r3, r4, r5)
            goto L31
        L36:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r6 == 0) goto L42
            goto L1f
        L42:
            sendScreenOpened(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.EventUtils.sendScreenEvent(com.incode.welcome_sdk.data.IncodeWelcomeRepository, com.incode.welcome_sdk.ScreenName, com.incode.welcome_sdk.modules.Modules, boolean):void");
    }

    @JvmStatic
    public static final void sendModuleOpenedEvent(IncodeWelcomeRepository incodeWelcomeRepository, Modules modules, HashMap<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f6268c + 65;
        f6269d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(modules, "");
        sendEvent(incodeWelcomeRepository, Event.MODULE_OPENED, modules, map);
        int i5 = f6268c + 27;
        f6269d = i5 % 128;
        int i6 = i5 % 2;
    }

    @JvmStatic
    public static final void sendModuleClosedEvent(IncodeWelcomeRepository incodeWelcomeRepository, Modules modules) {
        int i2 = 2 % 2;
        int i3 = f6268c + 43;
        f6269d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(modules, "");
        sendEvent(incodeWelcomeRepository, Event.MODULE_CLOSED, modules);
        int i5 = f6269d + 47;
        f6268c = i5 % 128;
        int i6 = i5 % 2;
    }

    @JvmStatic
    public static final void sendIdDetectedEvent(IncodeWelcomeRepository incodeWelcomeRepository, ScreenName screenName, String str) {
        int i2 = 2 % 2;
        int i3 = f6269d + 111;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(screenName, "");
        if (str == null) {
            int i5 = f6268c + 67;
            f6269d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), screenName.name());
        supportSendEvent(incodeWelcomeRepository, str, Modules.ID, map);
        int i6 = f6269d + 5;
        f6268c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 27 / 0;
        }
    }

    @JvmStatic
    public static final String validationStateToEvent(ValidationState validationState) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f6269d + 45;
        int i5 = i4 % 128;
        f6268c = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (validationState == null) {
            int i6 = i5 + 49;
            f6269d = i6 % 128;
            int i7 = i6 % 2;
            i2 = -1;
        } else {
            i2 = c.f6280d[validationState.ordinal()];
            int i8 = f6269d + 9;
            f6268c = i8 % 128;
            int i9 = i8 % 2;
        }
        switch (i2) {
            case 1:
                return "tooDark";
            case 2:
                return "blurred";
            case 3:
                return "tooSmall";
            case 4:
                return "tooLarge";
            case 5:
                return "backShownInsteadFront";
            case 6:
                return "frontShownInsteadBack";
            case 7:
                return "glareDetected";
            case 8:
                return "noIdDetected";
            default:
                return null;
        }
    }

    @JvmStatic
    public static final String faceProcessingStateToEvent(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f6269d;
        int i5 = i4 + 115;
        f6268c = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (faceProcessingState == null) {
            int i6 = i4 + 99;
            f6268c = i6 % 128;
            int i7 = i6 % 2;
            i2 = -1;
        } else {
            i2 = c.f6279c[faceProcessingState.ordinal()];
        }
        switch (i2) {
            case 1:
                return "faceDetectionNotActive";
            case 2:
                return "getReady";
            case 3:
                return "tooDark";
            case 4:
                return "blurred";
            case 5:
                int i8 = f6268c + 97;
                f6269d = i8 % 128;
                int i9 = i8 % 2;
                return "insufficientFaceSize";
            case 6:
                return "faceTooClose";
            case 7:
                return "faceNotInConstraint";
            case 8:
                return "multipleFacesDetected";
            case 9:
                return "eyesClosed";
            case 10:
                return "headCovered";
            case 11:
                return "faceTiltedLeft";
            case 12:
                return "faceTiltedRight";
            case 13:
                return "faceRotatedLeft";
            case 14:
                return "faceRotatedRight";
            case 15:
                return "noLandmarks";
            case 16:
                return "notReady";
            case 17:
                int i10 = f6268c + 21;
                f6269d = i10 % 128;
                if (i10 % 2 == 0) {
                    return "faceProcessingStarted";
                }
                throw null;
            case 18:
                return "faceDetected";
            case 19:
                return "noFaceDetected";
            case 20:
                return "lowImageQuality";
            default:
                int i11 = f6268c + 89;
                f6269d = i11 % 128;
                int i12 = i11 % 2;
                return null;
        }
    }

    @JvmStatic
    public static final void sendVideoUploadMetadataEvents(IncodeWelcomeRepository incodeWelcomeRepository, Pair<File, av> pair, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f6269d + 61;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Event event = Event.VIDEO_SELFIE_VIDEO_LINK_GENERATED;
        Modules modules = Modules.VIDEO_ONBOARDING;
        ScreenName currentScreenName = incodeWelcomeRepository.getCurrentScreenName();
        Intrinsics.checkNotNullExpressionValue(currentScreenName, "");
        sendEvent(incodeWelcomeRepository, event, modules, currentScreenName);
        File file = pair.first;
        an anVar = an.f6429c;
        Intrinsics.checkNotNull(file);
        long jC = an.c(file) / 1000;
        Timber.Forest.d("videoLengthInSeconds: %s", Long.valueOf(jC));
        an anVar2 = an.f6429c;
        boolean zBooleanValue = ((Boolean) an.b(b.d.e.c(), 35330034, new Object[]{file}, b.d.e.c(), b.d.e.c(), b.d.e.c(), -35330033)).booleanValue();
        Timber.Forest.d("videoHasAudioTrack: %s", Boolean.valueOf(zBooleanValue));
        Event event2 = Event.VIDEO_SELFIE_VIDEO_INFO;
        Modules modules2 = Modules.VIDEO_ONBOARDING;
        String value = EventValues.VIDEO_CODEC.getValue();
        an anVar3 = an.f6429c;
        sendEvent(incodeWelcomeRepository, event2, modules2, (HashMap<String, Object>) MapsKt.hashMapOf(TuplesKt.to(EventValues.SCREEN_NAME.getValue(), incodeWelcomeRepository.getCurrentScreenName().name()), TuplesKt.to(EventValues.UPLOAD_URL.getValue(), pair.second.a()), TuplesKt.to(EventValues.FILE_SIZE.getValue(), Long.valueOf(file.length())), TuplesKt.to(EventValues.VIDEO_LENGTH.getValue(), Long.valueOf(jC)), TuplesKt.to(value, an.b(file)), TuplesKt.to(EventValues.AUDIO_RECORDED.getValue(), Boolean.valueOf(zBooleanValue)), TuplesKt.to(EventValues.AUDIO_REQUESTED.getValue(), Boolean.valueOf(z2))));
        int i5 = f6268c + 61;
        f6269d = i5 % 128;
        int i6 = i5 % 2;
    }

    @JvmStatic
    public static final void sendFrameLogsEvent(IncodeWelcomeRepository incodeWelcomeRepository, Modules modules, JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = f6269d + 39;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(modules, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        sendEvent(incodeWelcomeRepository, Event.CAPTURE_ATTEMPT_FINISHED, modules, (HashMap<String, Object>) MapsKt.hashMapOf(TuplesKt.to(EventValues.LOGS.getValue(), jSONObject)));
        int i5 = f6268c + 47;
        f6269d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        private static int f6277a = 1;

        /* JADX INFO: renamed from: b */
        private static int f6278b = 0;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f6279c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f6280d;

        static {
            int[] iArr = new int[ValidationState.values().length];
            try {
                iArr[ValidationState.f11854n.ordinal()] = 1;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationState.f11858r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationState.f11855o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationState.f11851k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValidationState.f11865y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ValidationState.D.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ValidationState.f11860t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ValidationState.O.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f6280d = iArr;
            int[] iArr2 = new int[FaceProcessingUtils.FaceProcessingState.values().length];
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.EMPTY.ordinal()] = 1;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.GET_READY.ordinal()] = 2;
                int i4 = f6278b + 13;
                f6277a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 4;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.LIGHT_TOO_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.BLURRED_CROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.INSUFFICIENT_FACE_SIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.FACE_TOO_CLOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.FACE_NOT_IN_CONSTRAINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.MULTIPLE_FACES_DETECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.EYES_CLOSED.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.HEAD_COVERED.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.FACE_TILTED_LEFT.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.FACE_TILTED_RIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_LEFT.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_RIGHT.ordinal()] = 14;
                int i7 = f6278b + 113;
                f6277a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.NO_LANDMARKS.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.NOT_READY.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.FACE_PROCESSING_STARTED.ordinal()] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.FACE_DETECTED.ordinal()] = 18;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.NO_FACE.ordinal()] = 19;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[FaceProcessingUtils.FaceProcessingState.LOW_IMAGE_QUALITY.ordinal()] = 20;
            } catch (NoSuchFieldError unused28) {
            }
            f6279c = iArr2;
        }
    }

    static {
        int i2 = f6267b + 25;
        f6270e = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void sendTutorialShownEvent(IncodeWelcomeRepository incodeWelcomeRepository, Activity activity) {
        int i2 = 2 % 2;
        int i3 = f6269d + 51;
        f6268c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        sendTutorialShownEvent$default(incodeWelcomeRepository, activity, null, 4, null);
    }
}
