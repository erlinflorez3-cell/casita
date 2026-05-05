package androidx.work.impl.utils;

import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CancelWorkRunnable implements Runnable {
    private final OperationImpl mOperation = new OperationImpl();

    abstract void runInternal();

    public Operation getOperation() {
        return this.mOperation;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            runInternal();
            this.mOperation.markState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.markState(new Operation.State.FAILURE(th));
        }
    }

    void cancel(WorkManagerImpl workManagerImpl, String workSpecId) {
        iterativelyCancelWorkAndDependents(workManagerImpl.getWorkDatabase(), workSpecId);
        workManagerImpl.getProcessor().stopAndCancelWork(workSpecId);
        Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(workSpecId);
        }
    }

    void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String workSpecId) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            WorkInfo.State state = workSpecDao.getState(str);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setState(WorkInfo.State.CANCELLED, str);
            }
            linkedList.addAll(dependencyDao.getDependentWorkIds(str));
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$1 */
    class AnonymousClass1 extends CancelWorkRunnable {
        final /* synthetic */ UUID val$id;

        AnonymousClass1(final UUID val$id) {
            val$id = val$id;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        void runInternal() {
            WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                cancel(val$workManagerImpl, val$id.toString());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                reschedulePendingWorkers(val$workManagerImpl);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public static CancelWorkRunnable forId(final UUID id, final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.1
            final /* synthetic */ UUID val$id;

            AnonymousClass1(final UUID id2) {
                val$id = id2;
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void runInternal() {
                WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    cancel(val$workManagerImpl, val$id.toString());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(val$workManagerImpl);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$2 */
    class AnonymousClass2 extends CancelWorkRunnable {
        final /* synthetic */ String val$tag;

        AnonymousClass2(final String val$tag) {
            val$tag = val$tag;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        void runInternal() {
            WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(val$tag).iterator();
                while (it.hasNext()) {
                    cancel(val$workManagerImpl, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                reschedulePendingWorkers(val$workManagerImpl);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public static CancelWorkRunnable forTag(final String tag, final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.2
            final /* synthetic */ String val$tag;

            AnonymousClass2(final String tag2) {
                val$tag = tag2;
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void runInternal() {
                WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(val$tag).iterator();
                    while (it.hasNext()) {
                        cancel(val$workManagerImpl, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(val$workManagerImpl);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$3 */
    class AnonymousClass3 extends CancelWorkRunnable {
        final /* synthetic */ boolean val$allowReschedule;
        final /* synthetic */ String val$name;

        AnonymousClass3(final String val$name, final boolean val$allowReschedule) {
            val$name = val$name;
            val$allowReschedule = val$allowReschedule;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        void runInternal() {
            WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(val$name).iterator();
                while (it.hasNext()) {
                    cancel(val$workManagerImpl, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (val$allowReschedule) {
                    reschedulePendingWorkers(val$workManagerImpl);
                }
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public static CancelWorkRunnable forName(final String name, final WorkManagerImpl workManagerImpl, final boolean allowReschedule) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.3
            final /* synthetic */ boolean val$allowReschedule;
            final /* synthetic */ String val$name;

            AnonymousClass3(final String name2, final boolean allowReschedule2) {
                val$name = name2;
                val$allowReschedule = allowReschedule2;
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void runInternal() {
                WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(val$name).iterator();
                    while (it.hasNext()) {
                        cancel(val$workManagerImpl, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (val$allowReschedule) {
                        reschedulePendingWorkers(val$workManagerImpl);
                    }
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$4 */
    class AnonymousClass4 extends CancelWorkRunnable {
        AnonymousClass4() {
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        void runInternal() {
            WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                while (it.hasNext()) {
                    cancel(val$workManagerImpl, it.next());
                }
                new PreferenceUtils(val$workManagerImpl.getWorkDatabase()).setLastCancelAllTimeMillis(System.currentTimeMillis());
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    public static CancelWorkRunnable forAll(final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.4
            AnonymousClass4() {
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void runInternal() {
                WorkDatabase workDatabase = val$workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                    while (it.hasNext()) {
                        cancel(val$workManagerImpl, it.next());
                    }
                    new PreferenceUtils(val$workManagerImpl.getWorkDatabase()).setLastCancelAllTimeMillis(System.currentTimeMillis());
                    workDatabase.setTransactionSuccessful();
                } finally {
                    workDatabase.endTransaction();
                }
            }
        };
    }
}
