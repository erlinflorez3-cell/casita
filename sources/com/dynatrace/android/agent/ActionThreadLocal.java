package com.dynatrace.android.agent;

import com.dynatrace.android.agent.util.Utility;
import java.util.NoSuchElementException;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public final class ActionThreadLocal {
    private static final String LOGTAG = Global.LOG_PREFIX + "ActionThreadLocal";
    private static final ThreadLocal<Vector<DTXActionImpl>> tlVector = new ThreadLocal<Vector<DTXActionImpl>>() { // from class: com.dynatrace.android.agent.ActionThreadLocal.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Vector<DTXActionImpl> initialValue() {
            return new Vector<>();
        }
    };

    static final boolean addAction(DTXActionImpl dTXActionImpl) {
        trim();
        if (dTXActionImpl == null || dTXActionImpl.isFinalized()) {
            return false;
        }
        return tlVector.get().add(dTXActionImpl);
    }

    public static final synchronized void closeAll() {
        Vector vector;
        try {
            ThreadLocal<Vector<DTXActionImpl>> threadLocal = tlVector;
            synchronized (threadLocal) {
                vector = new Vector(threadLocal.get());
            }
            for (int i2 = 0; i2 < vector.size(); i2++) {
                DTXActionImpl dTXActionImpl = (DTXActionImpl) vector.get(i2);
                if (dTXActionImpl != null && !dTXActionImpl.isFinalized()) {
                    dTXActionImpl.leaveAction();
                }
            }
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "Expected exception? It depends on what you expect!", e2);
            }
        }
    }

    public static final DTXActionImpl getCurrentAction() {
        trim();
        try {
            return tlVector.get().lastElement();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    static final boolean removeAction(DTXActionImpl dTXActionImpl) {
        boolean zRemove = tlVector.get().remove(dTXActionImpl);
        trim();
        return zRemove;
    }

    static final synchronized void trim() {
        Vector vector = new Vector(tlVector.get());
        for (int i2 = 0; i2 < vector.size(); i2++) {
            try {
                ThreadLocal<Vector<DTXActionImpl>> threadLocal = tlVector;
                DTXActionImpl dTXActionImpl = threadLocal.get().get(i2);
                if (dTXActionImpl != null && dTXActionImpl.isFinalized()) {
                    threadLocal.get().remove(dTXActionImpl);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        vector.clear();
    }
}
