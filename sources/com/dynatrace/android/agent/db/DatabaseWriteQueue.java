package com.dynatrace.android.agent.db;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class DatabaseWriteQueue extends Thread {
    private static final long POLL_BATCH_TIME = 250;
    private static final int STOP_THREAD_WAIT_TIME = 1000;
    private static final String TAG = Global.LOG_PREFIX + "DatabaseWriteQueue";
    private static AtomicBoolean active = new AtomicBoolean(false);
    private static volatile DatabaseWriteQueue theInstance = null;
    private BlockingQueue<DatabaseRecord> queue = new LinkedBlockingQueue();

    public static class DatabaseRecord {
        public String appId;
        public int eventId;
        public long eventStart;
        public String sOa;
        public String sObvc;
        public int serverId;
        public Session session;

        public DatabaseRecord(String str, String str2, Session session, int i2, long j2, int i3, String str3) {
            this.sObvc = str;
            this.sOa = str2;
            this.session = session;
            this.eventId = i2;
            this.eventStart = j2;
            this.serverId = i3;
            this.appId = str3;
        }
    }

    private DatabaseWriteQueue() {
        setName(TAG);
    }

    public static DatabaseWriteQueue getInstance() {
        if (theInstance == null) {
            synchronized (DatabaseWriteQueue.class) {
                if (theInstance == null) {
                    theInstance = new DatabaseWriteQueue();
                }
            }
        }
        return theInstance;
    }

    public void accept(DatabaseRecord databaseRecord) {
        this.queue.add(databaseRecord);
    }

    public synchronized void flushQueue() {
        LinkedList<DatabaseRecord> linkedList = new LinkedList<>();
        DatabaseRecord databaseRecordPoll = this.queue.poll();
        while (databaseRecordPoll != null) {
            linkedList.add(databaseRecordPoll);
            databaseRecordPoll = this.queue.poll();
        }
        if (!linkedList.isEmpty()) {
            Core.dao.insertBatchEvents(linkedList, AdkSettings.getInstance().getServerConfiguration());
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Database write queue running ...");
        }
        while (active.get()) {
            try {
                Thread.sleep(POLL_BATCH_TIME);
                flushQueue();
            } catch (Exception e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, e2.toString(), e2);
                    return;
                }
                return;
            }
        }
    }

    @Override // java.lang.Thread
    public void start() {
        if (active.get()) {
            return;
        }
        active.set(true);
        super.start();
    }

    public void stopThread() {
        active.set(false);
        synchronized (DatabaseWriteQueue.class) {
            theInstance = null;
        }
        if (isAlive()) {
            try {
                join(1000L);
            } catch (InterruptedException e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(TAG, e2.toString());
                }
            }
            if (isAlive() && Global.DEBUG) {
                Utility.zlogD(TAG, "could not stop thread " + getName());
            }
        }
    }
}
