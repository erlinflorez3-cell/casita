package com.google.android.gms.internal.mlkit_vision_barcode;

import com.dynatrace.android.agent.Global;
import com.facebook.hermes.intl.Constants;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzdz<V> extends zzex implements zzet<V> {
    static final boolean zza;
    static final zzes zzb;
    private static final zza zzc;
    private static final Object zzd;

    @CheckForNull
    private volatile zzd listeners;

    @CheckForNull
    private volatile Object value;

    @CheckForNull
    private volatile zzj waiters;

    abstract class zza {
        /* synthetic */ zza(zzdy zzdyVar) {
        }

        abstract zzd zza(zzdz zzdzVar, zzd zzdVar);

        abstract zzj zzb(zzdz zzdzVar, zzj zzjVar);

        abstract void zzc(zzj zzjVar, @CheckForNull zzj zzjVar2);

        abstract void zzd(zzj zzjVar, Thread thread);

        abstract boolean zze(zzdz zzdzVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        abstract boolean zzf(zzdz zzdzVar, @CheckForNull Object obj, Object obj2);

        abstract boolean zzg(zzdz zzdzVar, @CheckForNull zzj zzjVar, @CheckForNull zzj zzjVar2);
    }

    final class zzb {

        @CheckForNull
        static final zzb zza;

        @CheckForNull
        static final zzb zzb;
        final boolean zzc;

        @CheckForNull
        final Throwable zzd;

        static {
            if (zzdz.zza) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        zzb(boolean z2, @CheckForNull Throwable th) {
            this.zzc = z2;
            this.zzd = th;
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc.1
            AnonymousClass1(String str) {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        /* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode.zzdz$zzc$1 */
        class AnonymousClass1 extends Throwable {
            AnonymousClass1(String str) {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();

        @CheckForNull
        zzd next;

        @CheckForNull
        final Runnable zzb;

        @CheckForNull
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzj, Thread> zza;
        final AtomicReferenceFieldUpdater<zzj, zzj> zzb;
        final AtomicReferenceFieldUpdater<? super zzdz<?>, zzj> zzc;
        final AtomicReferenceFieldUpdater<? super zzdz<?>, zzd> zzd;
        final AtomicReferenceFieldUpdater<? super zzdz<?>, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final zzd zza(zzdz zzdzVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzdzVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final zzj zzb(zzdz zzdzVar, zzj zzjVar) {
            return this.zzc.getAndSet(zzdzVar, zzjVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzc(zzj zzjVar, @CheckForNull zzj zzjVar2) {
            this.zzb.lazySet(zzjVar, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzd(zzj zzjVar, Thread thread) {
            this.zza.lazySet(zzjVar, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zze(zzdz zzdzVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzea.zza(this.zzd, zzdzVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzf(zzdz zzdzVar, @CheckForNull Object obj, Object obj2) {
            return zzea.zza(this.zze, zzdzVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzg(zzdz zzdzVar, @CheckForNull zzj zzjVar, @CheckForNull zzj zzjVar2) {
            return zzea.zza(this.zzc, zzdzVar, zzjVar, zzjVar2);
        }
    }

    final class zzf<V> implements Runnable {
        final zzdz<V> zza;
        final zzet<? extends V> zzb;

        zzf(zzdz zzdzVar, zzet zzetVar) {
            this.zza = zzdzVar;
            this.zzb = zzetVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzdz) this.zza).value != this) {
                return;
            }
            zzet<? extends V> zzetVar = this.zzb;
            if (zzdz.zzc.zzf(this.zza, this, zzdz.zzq(zzetVar))) {
                zzdz.zzv(this.zza, false);
            }
        }
    }

    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        /* synthetic */ zzg(zzeb zzebVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final zzd zza(zzdz zzdzVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzdzVar) {
                zzdVar2 = zzdzVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzdzVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final zzj zzb(zzdz zzdzVar, zzj zzjVar) {
            zzj zzjVar2;
            synchronized (zzdzVar) {
                zzjVar2 = zzdzVar.waiters;
                if (zzjVar2 != zzjVar) {
                    zzdzVar.waiters = zzjVar;
                }
            }
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzc(zzj zzjVar, @CheckForNull zzj zzjVar2) {
            zzjVar.next = zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzd(zzj zzjVar, Thread thread) {
            zzjVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zze(zzdz zzdzVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzdzVar) {
                if (zzdzVar.listeners != zzdVar) {
                    return false;
                }
                zzdzVar.listeners = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzf(zzdz zzdzVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzdzVar) {
                if (zzdzVar.value != obj) {
                    return false;
                }
                zzdzVar.value = obj2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzg(zzdz zzdzVar, @CheckForNull zzj zzjVar, @CheckForNull zzj zzjVar2) {
            synchronized (zzdzVar) {
                if (zzdzVar.waiters != zzjVar) {
                    return false;
                }
                zzdzVar.waiters = zzjVar2;
                return true;
            }
        }
    }

    interface zzh<V> extends zzet<V> {
    }

    final class zzi extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        /* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode.zzdz$zzi$1 */
        class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
            AnonymousClass1() {
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzi.1
                        AnonymousClass1() {
                        }

                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("value"));
                    zze = unsafe.objectFieldOffset(zzj.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzj.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        private zzi() {
            throw null;
        }

        /* synthetic */ zzi(zzed zzedVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final zzd zza(zzdz zzdzVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzdzVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzdzVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final zzj zzb(zzdz zzdzVar, zzj zzjVar) {
            zzj zzjVar2;
            do {
                zzjVar2 = zzdzVar.waiters;
                if (zzjVar == zzjVar2) {
                    break;
                }
            } while (!zzg(zzdzVar, zzjVar2, zzjVar));
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzc(zzj zzjVar, @CheckForNull zzj zzjVar2) {
            zza.putObject(zzjVar, zzf, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzd(zzj zzjVar, Thread thread) {
            zza.putObject(zzjVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zze(zzdz zzdzVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzec.zza(zza, zzdzVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzf(zzdz zzdzVar, @CheckForNull Object obj, Object obj2) {
            return zzec.zza(zza, zzdzVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzg(zzdz zzdzVar, @CheckForNull zzj zzjVar, @CheckForNull zzj zzjVar2) {
            return zzec.zza(zza, zzdzVar, zzc, zzjVar, zzjVar2);
        }
    }

    final class zzj {
        static final zzj zza = new zzj(false);

        @CheckForNull
        volatile zzj next;

        @CheckForNull
        volatile Thread thread;

        zzj() {
            zzdz.zzc.zzd(this, Thread.currentThread());
        }

        zzj(boolean z2) {
        }
    }

    static {
        boolean z2;
        zza zzgVar;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", Constants.CASEFIRST_FALSE));
        } catch (SecurityException unused) {
            z2 = false;
        }
        zza = z2;
        zzb = new zzes(zzdz.class);
        Throwable th = null;
        try {
            zzgVar = new zzi(null);
            e = null;
            th = null;
        } catch (Error | Exception e2) {
            e = e2;
            try {
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzj.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzj.class, zzj.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, zzj.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, Object.class, "value"));
            } catch (Error | Exception e3) {
                zzgVar = new zzg(null);
                th = e3;
            }
        }
        zzc = zzgVar;
        if (th != null) {
            zzes zzesVar = zzb;
            zzesVar.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", e);
            zzesVar.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzd = new Object();
    }

    protected zzdz() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzq(zzet zzetVar) {
        Throwable thZzg;
        if (zzetVar instanceof zzh) {
            Object zzbVar = ((zzdz) zzetVar).value;
            if (zzbVar instanceof zzb) {
                zzb zzbVar2 = (zzb) zzbVar;
                if (zzbVar2.zzc) {
                    Throwable th = zzbVar2.zzd;
                    zzbVar = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            return Objects.requireNonNull(zzbVar);
        }
        if ((zzetVar instanceof zzex) && (thZzg = ((zzex) zzetVar).zzg()) != null) {
            return new zzc(thZzg);
        }
        boolean zIsCancelled = zzetVar.isCancelled();
        if ((!zza) && zIsCancelled) {
            return Objects.requireNonNull(zzb.zzb);
        }
        try {
            Object objZzr = zzr(zzetVar);
            if (!zIsCancelled) {
                return objZzr == null ? zzd : objZzr;
            }
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(zzetVar)));
        } catch (Error e2) {
            e = e2;
            return new zzc(e);
        } catch (CancellationException e3) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(zzetVar))), e3)) : new zzb(false, e3);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(zzetVar))), e4)) : new zzc(e4.getCause());
        } catch (Exception e5) {
            e = e5;
            return new zzc(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    private static Object zzr(Future future) throws ExecutionException {
        boolean z2 = false;
        ?? r1 = future;
        while (true) {
            try {
                r1 = r1.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
                r1 = r1;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return r1;
    }

    private final void zzs(StringBuilder sb) {
        try {
            Object objZzr = zzr(this);
            sb.append("SUCCESS, result=[");
            if (objZzr == null) {
                sb.append("null");
            } else if (objZzr == this) {
                sb.append("this future");
            } else {
                sb.append(objZzr.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objZzr)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzt(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzu(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                strConcat = zzba.zza(zzf());
            } catch (Exception | StackOverflowError e2) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e2.getClass())));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzs(sb);
        }
    }

    private final void zzu(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    public static void zzv(zzdz zzdzVar, boolean z2) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            for (zzj zzjVarZzb = zzc.zzb(zzdzVar, zzj.zza); zzjVarZzb != null; zzjVarZzb = zzjVarZzb.next) {
                Thread thread = zzjVarZzb.thread;
                if (thread != null) {
                    zzjVarZzb.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzdzVar.zzm();
            zzd zzdVarZza = zzc.zza(zzdzVar, zzd.zza);
            while (zzdVarZza != null) {
                zzd zzdVar3 = zzdVarZza.next;
                zzdVarZza.next = zzdVar2;
                zzdVar2 = zzdVarZza;
                zzdVarZza = zzdVar3;
            }
            while (zzdVar2 != null) {
                Runnable runnable = zzdVar2.zzb;
                zzdVar = zzdVar2.next;
                Runnable runnable2 = (Runnable) Objects.requireNonNull(runnable);
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzdzVar = zzfVar.zza;
                    if (zzdzVar.value == zzfVar) {
                        if (zzc.zzf(zzdzVar, zzfVar, zzq(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    zzw(runnable2, (Executor) Objects.requireNonNull(zzdVar2.zzc));
                }
                zzdVar2 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private static void zzw(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e2);
        }
    }

    private final void zzx(zzj zzjVar) {
        zzjVar.thread = null;
        while (true) {
            zzj zzjVar2 = this.waiters;
            if (zzjVar2 != zzj.zza) {
                zzj zzjVar3 = null;
                while (zzjVar2 != null) {
                    zzj zzjVar4 = zzjVar2.next;
                    if (zzjVar2.thread != null) {
                        zzjVar3 = zzjVar2;
                    } else if (zzjVar3 != null) {
                        zzjVar3.next = zzjVar4;
                        if (zzjVar3.thread == null) {
                            break;
                        }
                    } else if (!zzc.zzg(this, zzjVar2, zzjVar4)) {
                        break;
                    }
                    zzjVar2 = zzjVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzy(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzd) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object objRequireNonNull;
        Object obj = this.value;
        if ((-1) - (((-1) - (obj instanceof zzf ? 1 : 0)) & ((-1) - (obj == null ? 1 : 0))) == 0) {
            return false;
        }
        if (zza) {
            objRequireNonNull = new zzb(z2, new CancellationException("Future.cancel() was called."));
        } else {
            objRequireNonNull = Objects.requireNonNull(z2 ? zzb.zza : zzb.zzb);
        }
        zzdz<V> zzdzVar = this;
        boolean z3 = false;
        while (true) {
            if (zzc.zzf(zzdzVar, obj, objRequireNonNull)) {
                zzv(zzdzVar, z2);
                if (!(obj instanceof zzf)) {
                    break;
                }
                zzet<? extends V> zzetVar = ((zzf) obj).zzb;
                if (!(zzetVar instanceof zzh)) {
                    zzetVar.cancel(z2);
                    break;
                }
                zzdzVar = (zzdz) zzetVar;
                obj = zzdzVar.value;
                int i2 = obj == null ? 1 : 0;
                boolean z4 = obj instanceof zzf;
                if ((i2 + (z4 ? 1 : 0)) - (i2 & (z4 ? 1 : 0)) == 0) {
                    break;
                }
                z3 = true;
            } else {
                obj = zzdzVar.value;
                if (!(obj instanceof zzf)) {
                    return z3;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        int i2;
        int i3;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        int i4 = obj2 != null ? 1 : 0;
        int i5 = !(obj2 instanceof zzf) ? 1 : 0;
        if ((i4 + i5) - (i4 | i5) != 0) {
            return zzy(obj2);
        }
        zzj zzjVar = this.waiters;
        if (zzjVar != zzj.zza) {
            zzj zzjVar2 = new zzj();
            do {
                zza zzaVar = zzc;
                zzaVar.zzc(zzjVar2, zzjVar);
                if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzx(zzjVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                        i2 = obj != null ? 1 : 0;
                        i3 = !(obj instanceof zzf) ? 1 : 0;
                    } while ((i2 + i3) - (i2 | i3) == 0);
                    return zzy(obj);
                }
                zzjVar = this.waiters;
            } while (zzjVar != zzj.zza);
        }
        return zzy(Objects.requireNonNull(this.value));
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z2 = true;
        if ((obj != null) && (!(obj instanceof zzf))) {
            return zzy(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzj zzjVar = this.waiters;
            if (zzjVar != zzj.zza) {
                zzj zzjVar2 = new zzj();
                do {
                    zza zzaVar = zzc;
                    zzaVar.zzc(zzjVar2, zzjVar);
                    if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzx(zzjVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((-1) - (((-1) - (obj2 != null ? 1 : 0)) | ((-1) - (!(obj2 instanceof zzf) ? 1 : 0))) != 0) {
                                return zzy(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzx(zzjVar2);
                    } else {
                        zzjVar = this.waiters;
                    }
                } while (zzjVar != zzj.zza);
            }
            return zzy(Objects.requireNonNull(this.value));
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            int i2 = obj3 != null ? 1 : 0;
            int i3 = !(obj3 instanceof zzf) ? 1 : 0;
            if ((i2 + i3) - (i2 | i3) != 0) {
                return zzy(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j2 + Global.BLANK + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z2 = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + Global.BLANK + lowerCase;
                if (z2) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(Global.BLANK);
            }
            if (z2) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        boolean z2 = obj instanceof zzf;
        int i2 = obj != null ? 1 : 0;
        int i3 = !z2 ? 1 : 0;
        return (i2 + i3) - (i2 | i3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.value instanceof zzb) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzs(sb);
        } else {
            zzt(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    protected String zzf() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzex
    @CheckForNull
    protected final Throwable zzg() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzet
    public final void zzl(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzaz.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzc.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzw(runnable, executor);
    }

    protected void zzm() {
    }

    protected final boolean zzn(Throwable th) {
        if (!zzc.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzv(this, false);
        return true;
    }

    protected final boolean zzo(zzet zzetVar) {
        zzc zzcVar;
        zzetVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (zzetVar.isDone()) {
                if (!zzc.zzf(this, null, zzq(zzetVar))) {
                    return false;
                }
                zzv(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, zzetVar);
            if (zzc.zzf(this, null, zzfVar)) {
                try {
                    zzetVar.zzl(zzfVar, zzee.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzc.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzetVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    protected final boolean zzp() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }
}
