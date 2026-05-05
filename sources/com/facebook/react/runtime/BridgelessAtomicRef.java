package com.facebook.react.runtime;

import com.facebook.infer.annotation.Assertions;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class BridgelessAtomicRef<T> {
    private volatile String failureMessage;
    T mInitialValue;
    volatile T mValue;
    private volatile State state;

    interface Provider<T> {
        T get();
    }

    enum State {
        Init,
        Creating,
        Success,
        Failure
    }

    public BridgelessAtomicRef() {
        this(null);
    }

    public BridgelessAtomicRef(T t2) {
        this.mValue = t2;
        this.mInitialValue = t2;
        this.state = State.Init;
        this.failureMessage = "";
    }

    public synchronized T get() {
        return (T) Assertions.assertNotNull(this.mValue);
    }

    public synchronized T getAndReset() {
        T t2;
        t2 = get();
        reset();
        return t2;
    }

    public synchronized T getNullable() {
        return this.mValue;
    }

    public T getOrCreate(Provider<T> provider) {
        boolean z2;
        T t2;
        T t3;
        synchronized (this) {
            if (this.state == State.Success) {
                return get();
            }
            if (this.state == State.Failure) {
                throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
            }
            boolean z3 = false;
            if (this.state != State.Creating) {
                this.state = State.Creating;
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                synchronized (this) {
                    while (this.state == State.Creating) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    if (this.state == State.Failure) {
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
                    }
                    t3 = get();
                }
                return t3;
            }
            try {
                this.mValue = provider.get();
                synchronized (this) {
                    this.state = State.Success;
                    notifyAll();
                    t2 = get();
                }
                return t2;
            } catch (RuntimeException e2) {
                synchronized (this) {
                    this.state = State.Failure;
                    this.failureMessage = Objects.toString(e2.getMessage(), "null");
                    notifyAll();
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e2);
                }
            }
        }
    }

    public synchronized void reset() {
        this.mValue = this.mInitialValue;
        this.state = State.Init;
        this.failureMessage = "";
    }
}
