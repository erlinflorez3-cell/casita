package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class MoreExecutors {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ ListenableFuture val$future;
        final /* synthetic */ BlockingQueue val$queue;

        AnonymousClass1(final BlockingQueue val$queue, final ListenableFuture val$future) {
            val$queue = val$queue;
            val$future = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            val$queue.add(val$future);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$2 */
    class AnonymousClass2 implements Executor {
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ Supplier val$nameSupplier;

        AnonymousClass2(final Executor val$executor, final Supplier val$nameSupplier) {
            val$executor = val$executor;
            val$nameSupplier = val$nameSupplier;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            val$executor.execute(Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier));
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$3 */
    class AnonymousClass3 extends WrappingExecutorService {
        final /* synthetic */ Supplier val$nameSupplier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ExecutorService delegate, final Supplier val$nameSupplier) {
            super(delegate);
            val$nameSupplier = val$nameSupplier;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected Runnable wrapTask(Runnable command) {
            return Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier);
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected <T> Callable<T> wrapTask(Callable<T> callable) {
            return Callables.threadRenaming(callable, (Supplier<String>) val$nameSupplier);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$4 */
    class AnonymousClass4 extends WrappingScheduledExecutorService {
        final /* synthetic */ Supplier val$nameSupplier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ScheduledExecutorService delegate, final Supplier val$nameSupplier) {
            super(delegate);
            val$nameSupplier = val$nameSupplier;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected Runnable wrapTask(Runnable command) {
            return Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier);
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected <T> Callable<T> wrapTask(Callable<T> callable) {
            return Callables.threadRenaming(callable, (Supplier<String>) val$nameSupplier);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$5 */
    class AnonymousClass5 implements Executor {
        final /* synthetic */ Executor val$delegate;
        final /* synthetic */ AbstractFuture val$future;

        AnonymousClass5(final Executor val$delegate, final AbstractFuture val$future) {
            val$delegate = val$delegate;
            val$future = val$future;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            try {
                val$delegate.execute(command);
            } catch (RejectedExecutionException e2) {
                val$future.setException(e2);
            }
        }
    }

    static class Application {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1 */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ ExecutorService val$service;
            final /* synthetic */ long val$terminationTimeout;
            final /* synthetic */ TimeUnit val$timeUnit;

            AnonymousClass1(final Application this$0, final ExecutorService val$service, final long val$terminationTimeout, final TimeUnit val$timeUnit) {
                val$service = val$service;
                val$terminationTimeout = val$terminationTimeout;
                val$timeUnit = val$timeUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    val$service.shutdown();
                    val$service.awaitTermination(val$terminationTimeout, val$timeUnit);
                } catch (InterruptedException unused) {
                }
            }
        }

        Application() {
        }

        final void addDelayedShutdownHook(final ExecutorService service, final long terminationTimeout, final TimeUnit timeUnit) {
            Preconditions.checkNotNull(service);
            Preconditions.checkNotNull(timeUnit);
            addShutdownHook(MoreExecutors.newThread("DelayedShutdownHook-for-" + service, new Runnable(this) { // from class: com.google.common.util.concurrent.MoreExecutors.Application.1
                final /* synthetic */ ExecutorService val$service;
                final /* synthetic */ long val$terminationTimeout;
                final /* synthetic */ TimeUnit val$timeUnit;

                AnonymousClass1(Application this, final ExecutorService service2, final long terminationTimeout2, final TimeUnit timeUnit2) {
                    val$service = service2;
                    val$terminationTimeout = terminationTimeout2;
                    val$timeUnit = timeUnit2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        val$service.shutdown();
                        val$service.awaitTermination(val$terminationTimeout, val$timeUnit);
                    } catch (InterruptedException unused) {
                    }
                }
            }));
        }

        void addShutdownHook(Thread hook) {
            Runtime.getRuntime().addShutdownHook(hook);
        }

        final ExecutorService getExitingExecutorService(ThreadPoolExecutor executor) {
            return getExitingExecutorService(executor, 120L, TimeUnit.SECONDS);
        }

        final ExecutorService getExitingExecutorService(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            MoreExecutors.useDaemonThreadFactory(executor);
            ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(executor);
            addDelayedShutdownHook(executor, terminationTimeout, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor) {
            return getExitingScheduledExecutorService(executor, 120L, TimeUnit.SECONDS);
        }

        final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            MoreExecutors.useDaemonThreadFactory(executor);
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(executor);
            addDelayedShutdownHook(executor, terminationTimeout, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }
    }

    private static final class DirectExecutorService extends AbstractListeningExecutorService {
        private final Object lock;
        private int runningTasks;
        private boolean shutdown;

        private DirectExecutorService() {
            this.lock = new Object();
            this.runningTasks = 0;
            this.shutdown = false;
        }

        /* synthetic */ DirectExecutorService(AnonymousClass1 anonymousClass1) {
            this();
        }

        private void endTask() {
            synchronized (this.lock) {
                int i2 = this.runningTasks - 1;
                this.runningTasks = i2;
                if (i2 == 0) {
                    this.lock.notifyAll();
                }
            }
        }

        private void startTask() {
            synchronized (this.lock) {
                if (this.shutdown) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.runningTasks++;
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            long nanos = unit.toNanos(timeout);
            synchronized (this.lock) {
                while (true) {
                    if (this.shutdown && this.runningTasks == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.lock, nanos);
                    nanos -= System.nanoTime() - jNanoTime;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            startTask();
            try {
                command.run();
            } finally {
                endTask();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z2;
            synchronized (this.lock) {
                z2 = this.shutdown;
            }
            return z2;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z2;
            synchronized (this.lock) {
                z2 = this.shutdown && this.runningTasks == 0;
            }
            return z2;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.lock) {
                this.shutdown = true;
                if (this.runningTasks == 0) {
                    this.lock.notifyAll();
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }
    }

    private static class ListeningDecorator extends AbstractListeningExecutorService {
        private final ExecutorService delegate;

        ListeningDecorator(ExecutorService delegate) {
            this.delegate = (ExecutorService) Preconditions.checkNotNull(delegate);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            return this.delegate.awaitTermination(timeout, unit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable command) {
            this.delegate.execute(command);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.delegate.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.delegate.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.delegate.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.delegate.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.delegate + "]";
        }
    }

    private static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {
        final ScheduledExecutorService delegate;

        private static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {
            private final ScheduledFuture<?> scheduledDelegate;

            public ListenableScheduledTask(ListenableFuture<V> listenableDelegate, ScheduledFuture<?> scheduledDelegate) {
                super(listenableDelegate);
                this.scheduledDelegate = scheduledDelegate;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean mayInterruptIfRunning) {
                boolean zCancel = super.cancel(mayInterruptIfRunning);
                if (zCancel) {
                    this.scheduledDelegate.cancel(mayInterruptIfRunning);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            public int compareTo(Delayed other) {
                return this.scheduledDelegate.compareTo(other);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit unit) {
                return this.scheduledDelegate.getDelay(unit);
            }
        }

        private static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {
            private final Runnable delegate;

            public NeverSuccessfulListenableFutureTask(Runnable delegate) {
                this.delegate = (Runnable) Preconditions.checkNotNull(delegate);
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            protected String pendingToString() {
                return "task=[" + this.delegate + "]";
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.delegate.run();
                } catch (Error | RuntimeException e2) {
                    setException(e2);
                    throw e2;
                }
            }
        }

        ScheduledListeningDecorator(ScheduledExecutorService delegate) {
            super(delegate);
            this.delegate = (ScheduledExecutorService) Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
            TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(command, null);
            return new ListenableScheduledTask(trustedListenableFutureTaskCreate, this.delegate.schedule(trustedListenableFutureTaskCreate, delay, unit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
            TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(callable);
            return new ListenableScheduledTask(trustedListenableFutureTaskCreate, this.delegate.schedule(trustedListenableFutureTaskCreate, delay, unit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(command);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, initialDelay, period, unit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(command);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, initialDelay, delay, unit));
        }
    }

    private MoreExecutors() {
    }

    public static void addDelayedShutdownHook(ExecutorService service, long terminationTimeout, TimeUnit timeUnit) {
        new Application().addDelayedShutdownHook(service, terminationTimeout, timeUnit);
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor executor) {
        return new Application().getExitingExecutorService(executor);
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new Application().getExitingExecutorService(executor, terminationTimeout, timeUnit);
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor) {
        return new Application().getExitingScheduledExecutorService(executor);
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new Application().getExitingScheduledExecutorService(executor, terminationTimeout, timeUnit);
    }

    @ParametricNullness
    static <T> T invokeAnyImpl(ListeningExecutorService listeningExecutorService, Collection<? extends Callable<T>> collection, boolean z2, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long jNanoTime;
        long jNanoTime2;
        Preconditions.checkNotNull(listeningExecutorService);
        Preconditions.checkNotNull(timeUnit);
        int size = collection.size();
        Preconditions.checkArgument(size > 0);
        ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(size);
        LinkedBlockingQueue linkedBlockingQueueNewLinkedBlockingQueue = Queues.newLinkedBlockingQueue();
        long nanos = timeUnit.toNanos(j2);
        if (z2) {
            try {
                jNanoTime = System.nanoTime();
            } finally {
                Iterator it = arrayListNewArrayListWithCapacity.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
            }
        } else {
            jNanoTime = 0;
        }
        Iterator<? extends Callable<T>> it2 = collection.iterator();
        arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
        int i2 = size - 1;
        int i3 = 1;
        ExecutionException e2 = null;
        while (true) {
            Future future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.poll();
            if (future != null) {
                jNanoTime2 = jNanoTime;
            } else {
                if (i2 > 0) {
                    i2--;
                    arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
                    i3++;
                } else {
                    if (i3 == 0) {
                        if (e2 == null) {
                            throw new ExecutionException((Throwable) null);
                        }
                        throw e2;
                    }
                    if (z2) {
                        future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.poll(nanos, TimeUnit.NANOSECONDS);
                        if (future == null) {
                            throw new TimeoutException();
                        }
                        jNanoTime2 = System.nanoTime();
                        nanos -= jNanoTime2 - jNanoTime;
                    } else {
                        future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.take();
                    }
                }
                jNanoTime2 = jNanoTime;
            }
            if (future != null) {
                i3--;
                try {
                    return (T) future.get();
                } catch (RuntimeException e3) {
                    e2 = new ExecutionException(e3);
                    jNanoTime = jNanoTime2;
                } catch (ExecutionException e4) {
                    e2 = e4;
                    jNanoTime = jNanoTime2;
                }
            }
            jNanoTime = jNanoTime2;
        }
    }

    private static boolean isAppEngineWithApiClasses() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static ListeningExecutorService listeningDecorator(ExecutorService delegate) {
        if (delegate instanceof ListeningExecutorService) {
            return (ListeningExecutorService) delegate;
        }
        return delegate instanceof ScheduledExecutorService ? new ScheduledListeningDecorator((ScheduledExecutorService) delegate) : new ListeningDecorator(delegate);
    }

    public static ListeningScheduledExecutorService listeningDecorator(ScheduledExecutorService delegate) {
        return delegate instanceof ListeningScheduledExecutorService ? (ListeningScheduledExecutorService) delegate : new ScheduledListeningDecorator(delegate);
    }

    public static ListeningExecutorService newDirectExecutorService() {
        return new DirectExecutorService();
    }

    public static Executor newSequentialExecutor(Executor delegate) {
        return new SequentialExecutor(delegate);
    }

    static Thread newThread(String name, Runnable runnable) {
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(runnable);
        Thread thread = (Thread) Objects.requireNonNull(platformThreadFactory().newThread(runnable));
        try {
            thread.setName(name);
        } catch (SecurityException unused) {
        }
        return thread;
    }

    public static ThreadFactory platformThreadFactory() {
        if (!isAppEngineWithApiClasses()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e4);
        } catch (InvocationTargetException e5) {
            throw Throwables.propagate(e5.getCause());
        }
    }

    static Executor rejectionPropagatingExecutor(final Executor delegate, final AbstractFuture<?> future) {
        Preconditions.checkNotNull(delegate);
        Preconditions.checkNotNull(future);
        return delegate == directExecutor() ? delegate : new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.5
            final /* synthetic */ Executor val$delegate;
            final /* synthetic */ AbstractFuture val$future;

            AnonymousClass5(final Executor delegate2, final AbstractFuture future2) {
                val$delegate = delegate2;
                val$future = future2;
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable command) {
                try {
                    val$delegate.execute(command);
                } catch (RejectedExecutionException e2) {
                    val$future.setException(e2);
                }
            }
        };
    }

    static Executor renamingDecorator(final Executor executor, final Supplier<String> nameSupplier) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(nameSupplier);
        return new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.2
            final /* synthetic */ Executor val$executor;
            final /* synthetic */ Supplier val$nameSupplier;

            AnonymousClass2(final Executor executor2, final Supplier nameSupplier2) {
                val$executor = executor2;
                val$nameSupplier = nameSupplier2;
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable command) {
                val$executor.execute(Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier));
            }
        };
    }

    static ExecutorService renamingDecorator(final ExecutorService service, final Supplier<String> nameSupplier) {
        Preconditions.checkNotNull(service);
        Preconditions.checkNotNull(nameSupplier);
        return new WrappingExecutorService(service) { // from class: com.google.common.util.concurrent.MoreExecutors.3
            final /* synthetic */ Supplier val$nameSupplier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(final ExecutorService service2, final Supplier nameSupplier2) {
                super(service2);
                val$nameSupplier = nameSupplier2;
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected Runnable wrapTask(Runnable command) {
                return Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected <T> Callable<T> wrapTask(Callable<T> callable) {
                return Callables.threadRenaming(callable, (Supplier<String>) val$nameSupplier);
            }
        };
    }

    static ScheduledExecutorService renamingDecorator(final ScheduledExecutorService service, final Supplier<String> nameSupplier) {
        Preconditions.checkNotNull(service);
        Preconditions.checkNotNull(nameSupplier);
        return new WrappingScheduledExecutorService(service) { // from class: com.google.common.util.concurrent.MoreExecutors.4
            final /* synthetic */ Supplier val$nameSupplier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(final ScheduledExecutorService service2, final Supplier nameSupplier2) {
                super(service2);
                val$nameSupplier = nameSupplier2;
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected Runnable wrapTask(Runnable command) {
                return Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected <T> Callable<T> wrapTask(Callable<T> callable) {
                return Callables.threadRenaming(callable, (Supplier<String>) val$nameSupplier);
            }
        };
    }

    public static boolean shutdownAndAwaitTermination(ExecutorService service, long timeout, TimeUnit unit) {
        long nanos = unit.toNanos(timeout) / 2;
        service.shutdown();
        try {
            if (!service.awaitTermination(nanos, TimeUnit.NANOSECONDS)) {
                service.shutdownNow();
                service.awaitTermination(nanos, TimeUnit.NANOSECONDS);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            service.shutdownNow();
        }
        return service.isTerminated();
    }

    private static <T> ListenableFuture<T> submitAndAddQueueListener(ListeningExecutorService executorService, Callable<T> task, final BlockingQueue<Future<T>> queue) {
        ListenableFuture<T> listenableFutureSubmit = executorService.submit((Callable) task);
        listenableFutureSubmit.addListener(new Runnable() { // from class: com.google.common.util.concurrent.MoreExecutors.1
            final /* synthetic */ ListenableFuture val$future;
            final /* synthetic */ BlockingQueue val$queue;

            AnonymousClass1(final BlockingQueue queue2, ListenableFuture listenableFutureSubmit2) {
                val$queue = queue2;
                val$future = listenableFutureSubmit2;
            }

            @Override // java.lang.Runnable
            public void run() {
                val$queue.add(val$future);
            }
        }, directExecutor());
        return listenableFutureSubmit2;
    }

    public static void useDaemonThreadFactory(ThreadPoolExecutor executor) {
        executor.setThreadFactory(new ThreadFactoryBuilder().setDaemon(true).setThreadFactory(executor.getThreadFactory()).build());
    }
}
