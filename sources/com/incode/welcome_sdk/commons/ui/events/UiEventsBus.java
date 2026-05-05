package com.incode.welcome_sdk.commons.ui.events;

import androidx.lifecycle.Lifecycle;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.a;
import com.incode.welcome_sdk.commons.b.b;
import com.incode.welcome_sdk.commons.f;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UiEventsBus {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5935c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5936d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f5937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PublishSubject<UiEvent> f5938b;

    public UiEventsBus(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "");
        this.f5937a = fVar;
        PublishSubject<UiEvent> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "");
        this.f5938b = publishSubjectCreate;
    }

    public final void c(UiEvent uiEvent) {
        int i2 = 2 % 2;
        int i3 = f5935c + 91;
        f5936d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uiEvent, "");
            this.f5938b.onNext(uiEvent);
            throw null;
        }
        Intrinsics.checkNotNullParameter(uiEvent, "");
        this.f5938b.onNext(uiEvent);
        int i4 = f5935c + 69;
        f5936d = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5935c + 79;
        f5936d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i4 = f5935c + 91;
        f5936d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return bool;
    }

    private Observable<? extends UiEvent> e() {
        int i2 = 2 % 2;
        int i3 = f5936d + 61;
        f5935c = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Observable<UiEvent> observableHide = this.f5938b.hide();
            Observable<Lifecycle.Event> observableB = this.f5937a.b();
            final UiEventsBus$safeUiEvents$1 uiEventsBus$safeUiEvents$1 = new Function1<Lifecycle.Event, Boolean>() { // from class: com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f5939a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f5940b = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f5942d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f5943e = 1;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Boolean invoke(Lifecycle.Event event) {
                    int i4 = 2 % 2;
                    int i5 = f5940b + 45;
                    f5939a = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolB = b(event);
                    int i7 = f5940b + 51;
                    f5939a = i7 % 128;
                    int i8 = i7 % 2;
                    return boolB;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.Boolean b(androidx.lifecycle.Lifecycle.Event r4) {
                    /*
                        r3 = 2
                        int r0 = r3 % r3
                        int r0 = com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.f5939a
                        int r1 = r0 + 117
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.f5940b = r0
                        int r1 = r1 % r3
                        java.lang.String r0 = ""
                        r2 = 1
                        if (r1 != 0) goto L2c
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                        int[] r1 = com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.WhenMappings.f5946d
                        int r0 = r4.ordinal()
                        r0 = r1[r0]
                        if (r0 != r2) goto L3a
                    L1e:
                        int r0 = com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.f5940b
                        int r1 = r0 + 41
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.f5939a = r0
                        int r1 = r1 % r3
                    L27:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                        return r0
                    L2c:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                        int[] r1 = com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.WhenMappings.f5946d
                        int r0 = r4.ordinal()
                        r0 = r1[r0]
                        if (r0 != r2) goto L3a
                        goto L1e
                    L3a:
                        r2 = 0
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.b(androidx.lifecycle.Lifecycle$Event):java.lang.Boolean");
                }

                public /* synthetic */ class WhenMappings {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f5944a = 1;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f5945c = 0;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public static final /* synthetic */ int[] f5946d;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                            int i2 = f5944a + 81;
                            f5945c = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i3 = 2 % 2;
                            }
                        } catch (NoSuchFieldError unused) {
                        }
                        f5946d = iArr;
                        int i4 = f5945c + 21;
                        f5944a = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 61 / 0;
                        }
                    }
                }

                static {
                    int i4 = f5943e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f5942d = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            Intrinsics.checkNotNullExpressionValue(observableHide.compose(b.a(observableB.map(new Function() { // from class: com.incode.welcome_sdk.commons.ui.events.UiEventsBus$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    return UiEventsBus.b(uiEventsBus$safeUiEvents$1, obj2);
                }
            }))), "");
            obj.hashCode();
            throw null;
        }
        Observable<UiEvent> observableHide2 = this.f5938b.hide();
        Observable<Lifecycle.Event> observableB2 = this.f5937a.b();
        final UiEventsBus$safeUiEvents$1 uiEventsBus$safeUiEvents$12 = new Function1<Lifecycle.Event, Boolean>() { // from class: com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5939a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5940b = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5942d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f5943e = 1;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Boolean invoke(Lifecycle.Event event) {
                int i4 = 2 % 2;
                int i5 = f5940b + 45;
                f5939a = i5 % 128;
                int i6 = i5 % 2;
                Boolean boolB = b(event);
                int i7 = f5940b + 51;
                f5939a = i7 % 128;
                int i8 = i7 % 2;
                return boolB;
            }

            private static Boolean b(Lifecycle.Event v2) {
                /*
                    r3 = 2
                    int r0 = r3 % r3
                    int r0 = com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.f5939a
                    int r1 = r0 + 117
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.f5940b = r0
                    int r1 = r1 % r3
                    java.lang.String r0 = ""
                    r2 = 1
                    if (r1 != 0) goto L2c
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    int[] r1 = com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.WhenMappings.f5946d
                    int r0 = r4.ordinal()
                    r0 = r1[r0]
                    if (r0 != r2) goto L3a
                L1e:
                    int r0 = com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.f5940b
                    int r1 = r0 + 41
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.f5939a = r0
                    int r1 = r1 % r3
                L27:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                L2c:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    int[] r1 = com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.WhenMappings.f5946d
                    int r0 = r4.ordinal()
                    r0 = r1[r0]
                    if (r0 != r2) goto L3a
                    goto L1e
                L3a:
                    r2 = 0
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.events.UiEventsBus$safeUiEvents$1.b(androidx.lifecycle.Lifecycle$Event):java.lang.Boolean");
            }

            public /* synthetic */ class WhenMappings {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f5944a = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f5945c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ int[] f5946d;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                        int i2 = f5944a + 81;
                        f5945c = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = 2 % 2;
                        }
                    } catch (NoSuchFieldError unused) {
                    }
                    f5946d = iArr;
                    int i4 = f5945c + 21;
                    f5944a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 61 / 0;
                    }
                }
            }

            static {
                int i4 = f5943e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f5942d = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        Observable observableCompose = observableHide2.compose(b.a(observableB2.map(new Function() { // from class: com.incode.welcome_sdk.commons.ui.events.UiEventsBus$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return UiEventsBus.b(uiEventsBus$safeUiEvents$12, obj2);
            }
        })));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "");
        int i4 = f5936d + 103;
        f5935c = i4 % 128;
        if (i4 % 2 != 0) {
            return observableCompose;
        }
        obj.hashCode();
        throw null;
    }

    public final Observable<a> c() {
        int i2 = 2 % 2;
        int i3 = f5935c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5936d = i3 % 128;
        int i4 = i3 % 2;
        Observable observableOfType = e().ofType(a.class);
        Intrinsics.checkNotNull(observableOfType);
        int i5 = f5935c + 57;
        f5936d = i5 % 128;
        int i6 = i5 % 2;
        return observableOfType;
    }
}
