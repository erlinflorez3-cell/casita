package com.dynatrace.android.agent.db;

import android.content.Context;
import android.database.Cursor;
import com.dynatrace.android.agent.BasicSegment;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.comm.MonitoringDataPacket;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class DataAccessObject {
    private static final String TAG = Global.LOG_PREFIX + "DataAccessObject";
    private final EventsDbHelper eventsHelper;

    public DataAccessObject(Context context) {
        this(new EventsDbHelper(context));
    }

    public DataAccessObject(EventsDbHelper eventsDbHelper) {
        this.eventsHelper = eventsDbHelper;
    }

    public boolean deleteAllEvents() {
        try {
            return this.eventsHelper.deleteAllEvents();
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogE(TAG, Global.DB_ERROR, e2);
            }
            return false;
        }
    }

    public synchronized void deleteEventsFromVisit(long j2, int i2) {
        try {
            this.eventsHelper.deleteEventsFromVisit(j2, i2);
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, Global.DB_ERROR, e2);
            }
        }
    }

    public synchronized void deleteEventsWithMismatchAppId(String str) {
        try {
            this.eventsHelper.deleteEventsWithMismatchAppId(str);
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, Global.DB_ERROR, e2);
            }
        }
    }

    public synchronized void deleteOldCrashes(int i2) {
        try {
            this.eventsHelper.deleteEventsByEventId(EventsDbHelper.CRASH_EVENT_ID, i2);
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogE(TAG, Global.DB_ERROR, e2);
            }
        }
    }

    public synchronized void deleteOldEvents(long j2, boolean z2) {
        try {
            this.eventsHelper.deleteEventsByDate(j2 - 540000, z2);
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogE(TAG, Global.DB_ERROR, e2);
            }
        }
    }

    public synchronized void deleteSentEvents(MonitoringDataEntity monitoringDataEntity) {
        try {
            this.eventsHelper.deleteSentEvents(monitoringDataEntity.visitorId, monitoringDataEntity.sessionId, monitoringDataEntity.sequenceNumber, monitoringDataEntity.serverId, monitoringDataEntity.lastRowId);
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, Global.DB_ERROR, e2);
            }
        }
    }

    public MonitoringDataEntity fetchEvents(long j2, BasicSegment.UpdatableDataGenerator updatableDataGenerator, long j3) {
        Cursor cursorFetchEvents = this.eventsHelper.fetchEvents();
        String str = null;
        if (cursorFetchEvents == null) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "null cursor for fetchEvents");
            }
            return null;
        }
        if (!cursorFetchEvents.moveToFirst()) {
            cursorFetchEvents.close();
            return null;
        }
        int columnIndexOrThrow = cursorFetchEvents.getColumnIndexOrThrow("id");
        int columnIndexOrThrow2 = cursorFetchEvents.getColumnIndexOrThrow("visitor_id");
        int columnIndexOrThrow3 = cursorFetchEvents.getColumnIndexOrThrow("session_id");
        int columnIndexOrThrow4 = cursorFetchEvents.getColumnIndexOrThrow("sequence_nr");
        int columnIndexOrThrow5 = cursorFetchEvents.getColumnIndexOrThrow("basic_segment");
        int columnIndexOrThrow6 = cursorFetchEvents.getColumnIndexOrThrow("event_segment");
        int columnIndexOrThrow7 = cursorFetchEvents.getColumnIndexOrThrow("event_id");
        int columnIndexOrThrow8 = cursorFetchEvents.getColumnIndexOrThrow("session_start");
        cursorFetchEvents.getColumnIndexOrThrow("event_start");
        int columnIndexOrThrow9 = cursorFetchEvents.getColumnIndexOrThrow("multiplicity");
        int columnIndexOrThrow10 = cursorFetchEvents.getColumnIndexOrThrow("server_id");
        int columnIndexOrThrow11 = cursorFetchEvents.getColumnIndexOrThrow("sr_param");
        ArrayList arrayList = new ArrayList();
        int length = "&".length();
        boolean z2 = false;
        long j4 = 0;
        long j5 = -1;
        int i2 = 0;
        int i3 = 0;
        int length2 = 0;
        int i4 = 0;
        while (true) {
            long j6 = cursorFetchEvents.getLong(columnIndexOrThrow2);
            int i5 = cursorFetchEvents.getInt(columnIndexOrThrow3);
            int i6 = cursorFetchEvents.getInt(columnIndexOrThrow4);
            String string = cursorFetchEvents.getString(columnIndexOrThrow6);
            cursorFetchEvents.getInt(columnIndexOrThrow7);
            int i7 = cursorFetchEvents.getInt(columnIndexOrThrow10);
            if (str == null) {
                str = cursorFetchEvents.getString(columnIndexOrThrow5) + updatableDataGenerator.generateUpdatableData(cursorFetchEvents.getLong(columnIndexOrThrow8), cursorFetchEvents.getInt(columnIndexOrThrow9), cursorFetchEvents.isNull(columnIndexOrThrow11) ? null : cursorFetchEvents.getString(columnIndexOrThrow11));
                arrayList.add(string);
                length2 = str.length() + length + string.length();
                j5 = cursorFetchEvents.getLong(columnIndexOrThrow);
                i3 = i5;
                i2 = i6;
                j4 = j6;
                i4 = i7;
            } else {
                length2 = length2 + length + string.length();
                if (j4 != j6 || i3 != i5 || i2 != i6 || i4 != i7 || length2 > j2) {
                    break;
                }
                arrayList.add(string);
                j5 = cursorFetchEvents.getLong(columnIndexOrThrow);
            }
            if (!cursorFetchEvents.moveToNext()) {
                z2 = true;
                break;
            }
        }
        cursorFetchEvents.close();
        return new MonitoringDataEntity(j4, i3, i2, i4, j5, new MonitoringDataPacket(str, arrayList), z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0023, code lost:
    
        r3.eventsHelper.deleteEventsByEventId(com.dynatrace.android.agent.db.EventsDbHelper.CRASH_EVENT_ID, r5.getMaxCachedCrashesCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002f, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0032, code lost:
    
        if (com.dynatrace.android.agent.Global.DEBUG != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0034, code lost:
    
        com.dynatrace.android.agent.util.Utility.zlogD(com.dynatrace.android.agent.db.DataAccessObject.TAG, com.dynatrace.android.agent.Global.DB_ERROR, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void insertBatchEvents(java.util.LinkedList<com.dynatrace.android.agent.db.DatabaseWriteQueue.DatabaseRecord> r4, com.dynatrace.android.agent.conf.ServerConfiguration r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.dynatrace.android.agent.db.EventsDbHelper r0 = r3.eventsHelper     // Catch: java.lang.Throwable -> L3d
            r0.insertBatch(r4)     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r5.isCachingCrashes()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3b
            r2 = 0
        Ld:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L3d
            if (r2 >= r0) goto L3b
            java.lang.Object r0 = r4.get(r2)     // Catch: java.lang.Throwable -> L3d
            com.dynatrace.android.agent.db.DatabaseWriteQueue$DatabaseRecord r0 = (com.dynatrace.android.agent.db.DatabaseWriteQueue.DatabaseRecord) r0     // Catch: java.lang.Throwable -> L3d
            int r1 = r0.eventId     // Catch: java.lang.Throwable -> L3d
            int r0 = com.dynatrace.android.agent.db.EventsDbHelper.CRASH_EVENT_ID     // Catch: java.lang.Throwable -> L3d
            if (r1 != r0) goto L20
            goto L23
        L20:
            int r2 = r2 + 1
            goto Ld
        L23:
            com.dynatrace.android.agent.db.EventsDbHelper r2 = r3.eventsHelper     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3d
            int r1 = com.dynatrace.android.agent.db.EventsDbHelper.CRASH_EVENT_ID     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3d
            int r0 = r5.getMaxCachedCrashesCount()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3d
            r2.deleteEventsByEventId(r1, r0)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3d
            goto L3b
        L2f:
            r2 = move-exception
            boolean r0 = com.dynatrace.android.agent.Global.DEBUG     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3b
            java.lang.String r1 = com.dynatrace.android.agent.db.DataAccessObject.TAG     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "Database error."
            com.dynatrace.android.agent.util.Utility.zlogD(r1, r0, r2)     // Catch: java.lang.Throwable -> L3d
        L3b:
            monitor-exit(r3)
            return
        L3d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.db.DataAccessObject.insertBatchEvents(java.util.LinkedList, com.dynatrace.android.agent.conf.ServerConfiguration):void");
    }

    public synchronized boolean updateSessionProperties(Session session) {
        try {
        } catch (Exception e2) {
            if (!Global.DEBUG) {
                return false;
            }
            Utility.zlogE(TAG, "can't update multiplicity", e2);
            return false;
        }
        return this.eventsHelper.updateSrAndMultiplicity(session);
    }
}
