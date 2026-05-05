package com.ts.coresdk.logger.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.braze.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends a {
    private final RoomDatabase bI;
    private final EntityInsertionAdapter<TSLogEntity> bJ;
    private final EntityDeletionOrUpdateAdapter<TSLogEntity> bK;
    private final EntityDeletionOrUpdateAdapter<TSLogEntity> bL;

    public c(RoomDatabase roomDatabase) {
        this.bI = roomDatabase;
        this.bJ = new EntityInsertionAdapter<TSLogEntity>(roomDatabase) { // from class: com.ts.coresdk.logger.db.c.1
            @Override // androidx.room.EntityInsertionAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TSLogEntity tSLogEntity) {
                supportSQLiteStatement.bindLong(1, tSLogEntity.r());
                if (tSLogEntity.s() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, tSLogEntity.s());
                }
                if (tSLogEntity.t() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, tSLogEntity.t());
                }
                if (tSLogEntity.u() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, tSLogEntity.u());
                }
                if (tSLogEntity.v() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, tSLogEntity.v());
                }
                if (tSLogEntity.w() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, tSLogEntity.w());
                }
                supportSQLiteStatement.bindLong(7, tSLogEntity.x());
            }

            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `te` (`s`,`cn`,`mn`,`t`,`pn`,`ssn`,`timestamp`) VALUES (?,?,?,?,?,?,?)";
            }
        };
        this.bK = new EntityDeletionOrUpdateAdapter<TSLogEntity>(roomDatabase) { // from class: com.ts.coresdk.logger.db.c.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TSLogEntity tSLogEntity) {
                supportSQLiteStatement.bindLong(1, tSLogEntity.x());
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `te` WHERE `timestamp` = ?";
            }
        };
        this.bL = new EntityDeletionOrUpdateAdapter<TSLogEntity>(roomDatabase) { // from class: com.ts.coresdk.logger.db.c.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TSLogEntity tSLogEntity) {
                supportSQLiteStatement.bindLong(1, tSLogEntity.r());
                if (tSLogEntity.s() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, tSLogEntity.s());
                }
                if (tSLogEntity.t() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, tSLogEntity.t());
                }
                if (tSLogEntity.u() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, tSLogEntity.u());
                }
                if (tSLogEntity.v() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, tSLogEntity.v());
                }
                if (tSLogEntity.w() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, tSLogEntity.w());
                }
                supportSQLiteStatement.bindLong(7, tSLogEntity.x());
                supportSQLiteStatement.bindLong(8, tSLogEntity.x());
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `te` SET `s` = ?,`cn` = ?,`mn` = ?,`t` = ?,`pn` = ?,`ssn` = ?,`timestamp` = ? WHERE `timestamp` = ?";
            }
        };
    }

    private TSLogEntity a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
        int columnIndex2 = cursor.getColumnIndex("cn");
        int columnIndex3 = cursor.getColumnIndex("mn");
        int columnIndex4 = cursor.getColumnIndex("t");
        int columnIndex5 = cursor.getColumnIndex("pn");
        int columnIndex6 = cursor.getColumnIndex("ssn");
        int columnIndex7 = cursor.getColumnIndex("timestamp");
        int i2 = columnIndex == -1 ? 0 : cursor.getInt(columnIndex);
        String string = null;
        String string2 = (columnIndex2 == -1 || cursor.isNull(columnIndex2)) ? null : cursor.getString(columnIndex2);
        String string3 = (columnIndex3 == -1 || cursor.isNull(columnIndex3)) ? null : cursor.getString(columnIndex3);
        String string4 = (columnIndex4 == -1 || cursor.isNull(columnIndex4)) ? null : cursor.getString(columnIndex4);
        String string5 = (columnIndex5 == -1 || cursor.isNull(columnIndex5)) ? null : cursor.getString(columnIndex5);
        if (columnIndex6 != -1 && !cursor.isNull(columnIndex6)) {
            string = cursor.getString(columnIndex6);
        }
        return new TSLogEntity(i2, string2, string3, string4, string5, string, columnIndex7 == -1 ? 0L : cursor.getLong(columnIndex7));
    }

    public static List<Class<?>> q() {
        return Collections.emptyList();
    }

    @Override // com.ts.coresdk.TSBaseDao
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public long insertData$core_android_sdk_release(TSLogEntity tSLogEntity) {
        this.bI.assertNotSuspendingTransaction();
        this.bI.beginTransaction();
        try {
            long jInsertAndReturnId = this.bJ.insertAndReturnId(tSLogEntity);
            this.bI.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.bI.endTransaction();
        }
    }

    @Override // com.ts.coresdk.TSBaseDao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void deleteData$core_android_sdk_release(TSLogEntity tSLogEntity) {
        this.bI.assertNotSuspendingTransaction();
        this.bI.beginTransaction();
        try {
            this.bK.handle(tSLogEntity);
            this.bI.setTransactionSuccessful();
        } finally {
            this.bI.endTransaction();
        }
    }

    @Override // com.ts.coresdk.TSBaseDao
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void updateData$core_android_sdk_release(TSLogEntity tSLogEntity) {
        this.bI.assertNotSuspendingTransaction();
        this.bI.beginTransaction();
        try {
            this.bL.handle(tSLogEntity);
            this.bI.setTransactionSuccessful();
        } finally {
            this.bI.endTransaction();
        }
    }

    @Override // com.ts.coresdk.TSBaseDao
    public int deleteAll$core_android_sdk_release(SupportSQLiteQuery supportSQLiteQuery) {
        this.bI.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.bI, supportSQLiteQuery, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // com.ts.coresdk.TSBaseDao
    public void deleteData$core_android_sdk_release(List<? extends TSLogEntity> list) {
        this.bI.assertNotSuspendingTransaction();
        this.bI.beginTransaction();
        try {
            this.bK.handleMultiple(list);
            this.bI.setTransactionSuccessful();
        } finally {
            this.bI.endTransaction();
        }
    }

    @Override // com.ts.coresdk.logger.db.a
    public int g(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM te  WHERE ssn LIKE ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.bI.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.bI, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.ts.coresdk.TSBaseDao
    public List<TSLogEntity> getEntities$core_android_sdk_release(SupportSQLiteQuery supportSQLiteQuery) {
        this.bI.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.bI, supportSQLiteQuery, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(a(cursorQuery));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // com.ts.coresdk.TSBaseDao
    public long[] insertData$core_android_sdk_release(List<? extends TSLogEntity> list) {
        this.bI.assertNotSuspendingTransaction();
        this.bI.beginTransaction();
        try {
            long[] jArrInsertAndReturnIdsArray = this.bJ.insertAndReturnIdsArray(list);
            this.bI.setTransactionSuccessful();
            return jArrInsertAndReturnIdsArray;
        } finally {
            this.bI.endTransaction();
        }
    }

    @Override // com.ts.coresdk.TSBaseDao
    public void updateData$core_android_sdk_release(List<? extends TSLogEntity> list) {
        this.bI.assertNotSuspendingTransaction();
        this.bI.beginTransaction();
        try {
            this.bL.handleMultiple(list);
            this.bI.setTransactionSuccessful();
        } finally {
            this.bI.endTransaction();
        }
    }
}
