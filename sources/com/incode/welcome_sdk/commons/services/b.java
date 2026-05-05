package com.incode.welcome_sdk.commons.services;

import androidx.lifecycle.Observer;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkQuery;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.List;
import java.util.UUID;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5358a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5359b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5360c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5361d = 1;

    private b() {
    }

    static final class e extends Lambda implements Function1<List<WorkInfo>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5365a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5366e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ UUID f5367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ ObservableEmitter<WorkInfo> f5368c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(List<WorkInfo> list) {
            int i2 = 2 % 2;
            int i3 = f5365a + 65;
            f5366e = i3 % 128;
            int i4 = i3 % 2;
            e(list);
            Unit unit = Unit.INSTANCE;
            int i5 = f5365a + 45;
            f5366e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(List<WorkInfo> list) {
            int i2 = 2 % 2;
            List<WorkInfo> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                int i3 = f5366e + 63;
                f5365a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNull(list);
                UUID uuid = this.f5367b;
                ObservableEmitter<WorkInfo> observableEmitter = this.f5368c;
                for (WorkInfo workInfo : list) {
                    int i5 = f5365a + 41;
                    f5366e = i5 % 128;
                    int i6 = i5 % 2;
                    if (Intrinsics.areEqual(workInfo.getId(), uuid)) {
                        int i7 = f5365a + 83;
                        f5366e = i7 % 128;
                        if (i7 % 2 == 0) {
                            observableEmitter.onNext(workInfo);
                            if (workInfo.getState().isFinished()) {
                                observableEmitter.onComplete();
                            }
                        } else {
                            observableEmitter.onNext(workInfo);
                            workInfo.getState().isFinished();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(UUID uuid, ObservableEmitter<WorkInfo> observableEmitter) {
            super(1);
            this.f5367b = uuid;
            this.f5368c = observableEmitter;
        }
    }

    @JvmStatic
    public static final Observable<WorkInfo> a(final WorkManager workManager, final UUID uuid) {
        int i2 = 2 % 2;
        int i3 = f5358a + 7;
        f5360c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(workManager, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        final WorkQuery workQueryBuild = WorkQuery.Builder.fromIds(CollectionsKt.mutableListOf(uuid)).addStates(CollectionsKt.listOf((Object[]) new WorkInfo.State[]{WorkInfo.State.ENQUEUED, WorkInfo.State.RUNNING, WorkInfo.State.SUCCEEDED, WorkInfo.State.BLOCKED, WorkInfo.State.FAILED, WorkInfo.State.CANCELLED})).build();
        Intrinsics.checkNotNullExpressionValue(workQueryBuild, "");
        Observable<WorkInfo> observableCreate = Observable.create(new ObservableOnSubscribe() { // from class: com.incode.welcome_sdk.commons.services.b$$ExternalSyntheticLambda0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                b.b(workManager, workQueryBuild, uuid, observableEmitter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCreate, "");
        int i5 = f5358a + 109;
        f5360c = i5 % 128;
        int i6 = i5 % 2;
        return observableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(WorkManager workManager, WorkQuery workQuery, UUID uuid, ObservableEmitter observableEmitter) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(workManager, "");
        Intrinsics.checkNotNullParameter(workQuery, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(observableEmitter, "");
        workManager.getWorkInfosLiveData(workQuery).observeForever(new d(new e(uuid, observableEmitter)));
        int i3 = f5360c + 19;
        f5358a = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5362b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5363e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final /* synthetic */ Function1 f5364c;

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5363e + 57;
            f5362b = i3 % 128;
            int i4 = i3 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i4 != 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f5362b + 29;
            int i4 = i3 % 128;
            f5363e = i4;
            int i5 = i3 % 2;
            if (!(obj instanceof Observer)) {
                return false;
            }
            int i6 = i4 + 51;
            f5362b = i6 % 128;
            if (i6 % 2 != 0) {
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }
            boolean z2 = obj instanceof FunctionAdapter;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            int i2 = 2 % 2;
            int i3 = f5363e + 11;
            f5362b = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.f5364c;
            if (i4 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            int i2 = 2 % 2;
            int i3 = f5363e + 55;
            f5362b = i3 % 128;
            int i4 = i3 % 2;
            this.f5364c.invoke(obj);
            if (i4 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        d(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.f5364c = function1;
        }
    }

    static {
        new b();
        int i2 = f5361d + 79;
        f5359b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }
}
