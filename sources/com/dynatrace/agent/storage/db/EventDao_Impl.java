package com.dynatrace.agent.storage.db;

import android.database.Cursor;
import androidx.core.app.NotificationCompat;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class EventDao_Impl implements EventDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<EventRecord> __deletionAdapterOfEventRecord;
    private final EntityInsertionAdapter<EventRecord> __insertionAdapterOfEventRecord;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteOutdated;

    public EventDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfEventRecord = new EntityInsertionAdapter<EventRecord>(__db) { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, EventRecord eventRecord) {
                supportSQLiteStatement.bindLong(1, eventRecord.getId());
                supportSQLiteStatement.bindString(2, eventRecord.getEvent());
                supportSQLiteStatement.bindLong(3, eventRecord.getTimestamp());
                supportSQLiteStatement.bindLong(4, eventRecord.isPriorityData() ? 1L : 0L);
                supportSQLiteStatement.bindLong(5, eventRecord.getEventSizeBytes());
            }

            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `events` (`id`,`event`,`timestamp`,`isPriorityData`,`eventSizeBytes`) VALUES (nullif(?, 0),?,?,?,?)";
            }
        };
        this.__deletionAdapterOfEventRecord = new EntityDeletionOrUpdateAdapter<EventRecord>(__db) { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final EventRecord entity) {
                statement.bindLong(1, entity.getId());
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `events` WHERE `id` = ?";
            }
        };
        this.__preparedStmtOfDeleteOutdated = new SharedSQLiteStatement(__db) { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM events WHERE ? < ? - timestamp";
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM events";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object delete(final List<EventRecord> eventRecords, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                EventDao_Impl.this.__db.beginTransaction();
                try {
                    EventDao_Impl.this.__deletionAdapterOfEventRecord.handleMultiple(eventRecords);
                    EventDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    EventDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object deleteAll(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = EventDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    EventDao_Impl.this.__db.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        EventDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        EventDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    EventDao_Impl.this.__preparedStmtOfDeleteAll.release(supportSQLiteStatementAcquire);
                }
            }
        }, $completion);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object deleteById(final List<Long> recordIds, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.12
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
                sbNewStringBuilder.append("DELETE FROM events WHERE id IN (");
                StringUtil.appendPlaceholders(sbNewStringBuilder, recordIds.size());
                sbNewStringBuilder.append(")");
                SupportSQLiteStatement supportSQLiteStatementCompileStatement = EventDao_Impl.this.__db.compileStatement(sbNewStringBuilder.toString());
                Iterator it = recordIds.iterator();
                int i2 = 1;
                while (it.hasNext()) {
                    supportSQLiteStatementCompileStatement.bindLong(i2, ((Long) it.next()).longValue());
                    i2++;
                }
                EventDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementCompileStatement.executeUpdateDelete();
                    EventDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    EventDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object deleteOutdated(final long now, final long retentionTime, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = EventDao_Impl.this.__preparedStmtOfDeleteOutdated.acquire();
                supportSQLiteStatementAcquire.bindLong(1, retentionTime);
                supportSQLiteStatementAcquire.bindLong(2, now);
                try {
                    EventDao_Impl.this.__db.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        EventDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        EventDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    EventDao_Impl.this.__preparedStmtOfDeleteOutdated.release(supportSQLiteStatementAcquire);
                }
            }
        }, $completion);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object fetchEventMetadata(boolean z2, int i2, Continuation<? super List<EventMetadata>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, timestamp, isPriorityData, eventSizeBytes FROM events WHERE isPriorityData = ? LIMIT ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, z2 ? 1L : 0L);
        roomSQLiteQueryAcquire.bindLong(2, i2);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<EventMetadata>>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.10
            @Override // java.util.concurrent.Callable
            public List<EventMetadata> call() throws Exception {
                Cursor cursorQuery = DBUtil.query(EventDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j2 = cursorQuery.getLong(0);
                        boolean z3 = true;
                        long j3 = cursorQuery.getLong(1);
                        if (cursorQuery.getInt(2) == 0) {
                            z3 = false;
                        }
                        arrayList.add(new EventMetadata(j2, j3, z3, cursorQuery.getInt(3)));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                    roomSQLiteQueryAcquire.release();
                }
            }
        }, continuation);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object fetchEventRecordByIds(final List<Long> recordIds, final Continuation<? super List<EventRecord>> $completion) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT * FROM events WHERE id IN (");
        int size = recordIds.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<Long> it = recordIds.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindLong(i2, it.next().longValue());
            i2++;
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<EventRecord>>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<EventRecord> call() throws Exception {
                Cursor cursorQuery = DBUtil.query(EventDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_EVENT);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isPriorityData");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventSizeBytes");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new EventRecord(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4) != 0, cursorQuery.getInt(columnIndexOrThrow5)));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                    roomSQLiteQueryAcquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object getAll(final Continuation<? super List<EventRecord>> $completion) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM events", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<EventRecord>>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<EventRecord> call() throws Exception {
                Cursor cursorQuery = DBUtil.query(EventDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_EVENT);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isPriorityData");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventSizeBytes");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new EventRecord(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4) != 0, cursorQuery.getInt(columnIndexOrThrow5)));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                    roomSQLiteQueryAcquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object put(final EventRecord eventRecord, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.5
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                EventDao_Impl.this.__db.beginTransaction();
                try {
                    EventDao_Impl.this.__insertionAdapterOfEventRecord.insert(eventRecord);
                    EventDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    EventDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }
}
