package androidx.room;

import androidx.room.InvalidationTracker;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class RxRoom {
    public static final Object NOTHING = new Object();

    /* JADX INFO: renamed from: androidx.room.RxRoom$1 */
    class AnonymousClass1 implements FlowableOnSubscribe<Object> {
        final /* synthetic */ RoomDatabase val$database;
        final /* synthetic */ String[] val$tableNames;

        AnonymousClass1(String[] strArr, RoomDatabase roomDatabase) {
            strArr = strArr;
            roomDatabase = roomDatabase;
        }

        /* JADX INFO: renamed from: androidx.room.RxRoom$1$1 */
        class C01371 extends InvalidationTracker.Observer {
            final /* synthetic */ FlowableEmitter val$emitter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01371(String[] strArr, FlowableEmitter flowableEmitter) {
                super(strArr);
                flowableEmitter = flowableEmitter;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> set) {
                if (flowableEmitter.isCancelled()) {
                    return;
                }
                flowableEmitter.onNext(RxRoom.NOTHING);
            }
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter<Object> flowableEmitter) throws Exception {
            C01371 c01371 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom.1.1
                final /* synthetic */ FlowableEmitter val$emitter;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01371(String[] strArr, FlowableEmitter flowableEmitter2) {
                    super(strArr);
                    flowableEmitter = flowableEmitter2;
                }

                @Override // androidx.room.InvalidationTracker.Observer
                public void onInvalidated(Set<String> set) {
                    if (flowableEmitter.isCancelled()) {
                        return;
                    }
                    flowableEmitter.onNext(RxRoom.NOTHING);
                }
            };
            if (!flowableEmitter2.isCancelled()) {
                roomDatabase.getInvalidationTracker().addObserver(c01371);
                flowableEmitter2.setDisposable(Disposables.fromAction(new Action() { // from class: androidx.room.RxRoom.1.2
                    final /* synthetic */ InvalidationTracker.Observer val$observer;

                    AnonymousClass2(InvalidationTracker.Observer c013712) {
                        observer = c013712;
                    }

                    @Override // io.reactivex.functions.Action
                    public void run() throws Exception {
                        roomDatabase.getInvalidationTracker().removeObserver(observer);
                    }
                }));
            }
            if (flowableEmitter2.isCancelled()) {
                return;
            }
            flowableEmitter2.onNext(RxRoom.NOTHING);
        }

        /* JADX INFO: renamed from: androidx.room.RxRoom$1$2 */
        class AnonymousClass2 implements Action {
            final /* synthetic */ InvalidationTracker.Observer val$observer;

            AnonymousClass2(InvalidationTracker.Observer c013712) {
                observer = c013712;
            }

            @Override // io.reactivex.functions.Action
            public void run() throws Exception {
                roomDatabase.getInvalidationTracker().removeObserver(observer);
            }
        }
    }

    public static Flowable<Object> createFlowable(RoomDatabase roomDatabase, String... strArr) {
        return Flowable.create(new FlowableOnSubscribe<Object>() { // from class: androidx.room.RxRoom.1
            final /* synthetic */ RoomDatabase val$database;
            final /* synthetic */ String[] val$tableNames;

            AnonymousClass1(String[] strArr2, RoomDatabase roomDatabase2) {
                strArr = strArr2;
                roomDatabase = roomDatabase2;
            }

            /* JADX INFO: renamed from: androidx.room.RxRoom$1$1 */
            class C01371 extends InvalidationTracker.Observer {
                final /* synthetic */ FlowableEmitter val$emitter;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01371(String[] strArr, FlowableEmitter flowableEmitter2) {
                    super(strArr);
                    flowableEmitter = flowableEmitter2;
                }

                @Override // androidx.room.InvalidationTracker.Observer
                public void onInvalidated(Set<String> set) {
                    if (flowableEmitter.isCancelled()) {
                        return;
                    }
                    flowableEmitter.onNext(RxRoom.NOTHING);
                }
            }

            @Override // io.reactivex.FlowableOnSubscribe
            public void subscribe(FlowableEmitter flowableEmitter2) throws Exception {
                InvalidationTracker.Observer c013712 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom.1.1
                    final /* synthetic */ FlowableEmitter val$emitter;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01371(String[] strArr2, FlowableEmitter flowableEmitter22) {
                        super(strArr2);
                        flowableEmitter = flowableEmitter22;
                    }

                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> set) {
                        if (flowableEmitter.isCancelled()) {
                            return;
                        }
                        flowableEmitter.onNext(RxRoom.NOTHING);
                    }
                };
                if (!flowableEmitter22.isCancelled()) {
                    roomDatabase.getInvalidationTracker().addObserver(c013712);
                    flowableEmitter22.setDisposable(Disposables.fromAction(new Action() { // from class: androidx.room.RxRoom.1.2
                        final /* synthetic */ InvalidationTracker.Observer val$observer;

                        AnonymousClass2(InvalidationTracker.Observer c0137122) {
                            observer = c0137122;
                        }

                        @Override // io.reactivex.functions.Action
                        public void run() throws Exception {
                            roomDatabase.getInvalidationTracker().removeObserver(observer);
                        }
                    }));
                }
                if (flowableEmitter22.isCancelled()) {
                    return;
                }
                flowableEmitter22.onNext(RxRoom.NOTHING);
            }

            /* JADX INFO: renamed from: androidx.room.RxRoom$1$2 */
            class AnonymousClass2 implements Action {
                final /* synthetic */ InvalidationTracker.Observer val$observer;

                AnonymousClass2(InvalidationTracker.Observer c0137122) {
                    observer = c0137122;
                }

                @Override // io.reactivex.functions.Action
                public void run() throws Exception {
                    roomDatabase.getInvalidationTracker().removeObserver(observer);
                }
            }
        }, BackpressureStrategy.LATEST);
    }

    @Deprecated
    public static <T> Flowable<T> createFlowable(RoomDatabase roomDatabase, String[] strArr, Callable<T> callable) {
        return createFlowable(roomDatabase, false, strArr, callable);
    }

    public static <T> Flowable<T> createFlowable(RoomDatabase roomDatabase, boolean z2, String[] strArr, Callable<T> callable) {
        Scheduler schedulerFrom = Schedulers.from(getExecutor(roomDatabase, z2));
        return (Flowable<T>) createFlowable(roomDatabase, strArr).subscribeOn(schedulerFrom).unsubscribeOn(schedulerFrom).observeOn(schedulerFrom).flatMapMaybe(new Function<Object, MaybeSource<T>>() { // from class: androidx.room.RxRoom.2
            AnonymousClass2() {
            }

            @Override // io.reactivex.functions.Function
            public MaybeSource<T> apply(Object obj) throws Exception {
                return maybe;
            }
        });
    }

    /* JADX INFO: renamed from: androidx.room.RxRoom$2 */
    class AnonymousClass2<T> implements Function<Object, MaybeSource<T>> {
        AnonymousClass2() {
        }

        @Override // io.reactivex.functions.Function
        public MaybeSource<T> apply(Object obj) throws Exception {
            return maybe;
        }
    }

    /* JADX INFO: renamed from: androidx.room.RxRoom$3 */
    class AnonymousClass3 implements ObservableOnSubscribe<Object> {
        final /* synthetic */ RoomDatabase val$database;
        final /* synthetic */ String[] val$tableNames;

        AnonymousClass3(String[] strArr, RoomDatabase roomDatabase) {
            strArr = strArr;
            roomDatabase = roomDatabase;
        }

        /* JADX INFO: renamed from: androidx.room.RxRoom$3$1 */
        class AnonymousClass1 extends InvalidationTracker.Observer {
            final /* synthetic */ ObservableEmitter val$emitter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String[] strArr, ObservableEmitter observableEmitter) {
                super(strArr);
                observableEmitter = observableEmitter;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> set) {
                observableEmitter.onNext(RxRoom.NOTHING);
            }
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Object> observableEmitter) throws Exception {
            AnonymousClass1 anonymousClass1 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom.3.1
                final /* synthetic */ ObservableEmitter val$emitter;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String[] strArr, ObservableEmitter observableEmitter2) {
                    super(strArr);
                    observableEmitter = observableEmitter2;
                }

                @Override // androidx.room.InvalidationTracker.Observer
                public void onInvalidated(Set<String> set) {
                    observableEmitter.onNext(RxRoom.NOTHING);
                }
            };
            roomDatabase.getInvalidationTracker().addObserver(anonymousClass1);
            observableEmitter2.setDisposable(Disposables.fromAction(new Action() { // from class: androidx.room.RxRoom.3.2
                final /* synthetic */ InvalidationTracker.Observer val$observer;

                AnonymousClass2(InvalidationTracker.Observer anonymousClass12) {
                    observer = anonymousClass12;
                }

                @Override // io.reactivex.functions.Action
                public void run() throws Exception {
                    roomDatabase.getInvalidationTracker().removeObserver(observer);
                }
            }));
            observableEmitter2.onNext(RxRoom.NOTHING);
        }

        /* JADX INFO: renamed from: androidx.room.RxRoom$3$2 */
        class AnonymousClass2 implements Action {
            final /* synthetic */ InvalidationTracker.Observer val$observer;

            AnonymousClass2(InvalidationTracker.Observer anonymousClass12) {
                observer = anonymousClass12;
            }

            @Override // io.reactivex.functions.Action
            public void run() throws Exception {
                roomDatabase.getInvalidationTracker().removeObserver(observer);
            }
        }
    }

    public static Observable<Object> createObservable(RoomDatabase roomDatabase, String... strArr) {
        return Observable.create(new ObservableOnSubscribe<Object>() { // from class: androidx.room.RxRoom.3
            final /* synthetic */ RoomDatabase val$database;
            final /* synthetic */ String[] val$tableNames;

            AnonymousClass3(String[] strArr2, RoomDatabase roomDatabase2) {
                strArr = strArr2;
                roomDatabase = roomDatabase2;
            }

            /* JADX INFO: renamed from: androidx.room.RxRoom$3$1 */
            class AnonymousClass1 extends InvalidationTracker.Observer {
                final /* synthetic */ ObservableEmitter val$emitter;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String[] strArr, ObservableEmitter observableEmitter2) {
                    super(strArr);
                    observableEmitter = observableEmitter2;
                }

                @Override // androidx.room.InvalidationTracker.Observer
                public void onInvalidated(Set<String> set) {
                    observableEmitter.onNext(RxRoom.NOTHING);
                }
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter observableEmitter2) throws Exception {
                InvalidationTracker.Observer anonymousClass12 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom.3.1
                    final /* synthetic */ ObservableEmitter val$emitter;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(String[] strArr2, ObservableEmitter observableEmitter22) {
                        super(strArr2);
                        observableEmitter = observableEmitter22;
                    }

                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> set) {
                        observableEmitter.onNext(RxRoom.NOTHING);
                    }
                };
                roomDatabase.getInvalidationTracker().addObserver(anonymousClass12);
                observableEmitter22.setDisposable(Disposables.fromAction(new Action() { // from class: androidx.room.RxRoom.3.2
                    final /* synthetic */ InvalidationTracker.Observer val$observer;

                    AnonymousClass2(InvalidationTracker.Observer anonymousClass122) {
                        observer = anonymousClass122;
                    }

                    @Override // io.reactivex.functions.Action
                    public void run() throws Exception {
                        roomDatabase.getInvalidationTracker().removeObserver(observer);
                    }
                }));
                observableEmitter22.onNext(RxRoom.NOTHING);
            }

            /* JADX INFO: renamed from: androidx.room.RxRoom$3$2 */
            class AnonymousClass2 implements Action {
                final /* synthetic */ InvalidationTracker.Observer val$observer;

                AnonymousClass2(InvalidationTracker.Observer anonymousClass122) {
                    observer = anonymousClass122;
                }

                @Override // io.reactivex.functions.Action
                public void run() throws Exception {
                    roomDatabase.getInvalidationTracker().removeObserver(observer);
                }
            }
        });
    }

    @Deprecated
    public static <T> Observable<T> createObservable(RoomDatabase roomDatabase, String[] strArr, Callable<T> callable) {
        return createObservable(roomDatabase, false, strArr, callable);
    }

    public static <T> Observable<T> createObservable(RoomDatabase roomDatabase, boolean z2, String[] strArr, Callable<T> callable) {
        Scheduler schedulerFrom = Schedulers.from(getExecutor(roomDatabase, z2));
        return (Observable<T>) createObservable(roomDatabase, strArr).subscribeOn(schedulerFrom).unsubscribeOn(schedulerFrom).observeOn(schedulerFrom).flatMapMaybe(new Function<Object, MaybeSource<T>>() { // from class: androidx.room.RxRoom.4
            AnonymousClass4() {
            }

            @Override // io.reactivex.functions.Function
            public MaybeSource<T> apply(Object obj) throws Exception {
                return maybe;
            }
        });
    }

    /* JADX INFO: renamed from: androidx.room.RxRoom$4 */
    class AnonymousClass4<T> implements Function<Object, MaybeSource<T>> {
        AnonymousClass4() {
        }

        @Override // io.reactivex.functions.Function
        public MaybeSource<T> apply(Object obj) throws Exception {
            return maybe;
        }
    }

    /* JADX INFO: renamed from: androidx.room.RxRoom$5 */
    class AnonymousClass5<T> implements SingleOnSubscribe<T> {
        final /* synthetic */ Callable val$callable;

        AnonymousClass5(Callable callable) {
            callable = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.SingleOnSubscribe
        public void subscribe(SingleEmitter<T> singleEmitter) throws Exception {
            try {
                singleEmitter.onSuccess(callable.call());
            } catch (EmptyResultSetException e2) {
                singleEmitter.tryOnError(e2);
            }
        }
    }

    public static <T> Single<T> createSingle(Callable<? extends T> callable) {
        return Single.create(new SingleOnSubscribe<T>() { // from class: androidx.room.RxRoom.5
            final /* synthetic */ Callable val$callable;

            AnonymousClass5(Callable callable2) {
                callable = callable2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.SingleOnSubscribe
            public void subscribe(SingleEmitter<T> singleEmitter) throws Exception {
                try {
                    singleEmitter.onSuccess(callable.call());
                } catch (EmptyResultSetException e2) {
                    singleEmitter.tryOnError(e2);
                }
            }
        });
    }

    private static Executor getExecutor(RoomDatabase roomDatabase, boolean z2) {
        if (z2) {
            return roomDatabase.getTransactionExecutor();
        }
        return roomDatabase.getQueryExecutor();
    }

    @Deprecated
    public RxRoom() {
    }
}
