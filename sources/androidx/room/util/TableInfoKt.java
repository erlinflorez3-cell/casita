package androidx.room.util;

import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import io.sentry.Session;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: TableInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d̉=!,\f\bDRo|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njGNLe^.Zݷ2\u000f\u0002{<řc$\u007fcCU0}*ޛWN}gvJ`\u000bK\u000f\u0014\u001f\u0001j2I]xs\u0012\u0017˰Z\u0012M\u074ce{M;ptd\u00050428(\u0006/\u0019ZL\u001ex\u0013Cy\u000fB4NtRR;MK\u001a*\u001aL%\u0019$li^6vs\f@_'\u0011qZNUhv|e)T^?\u0013\u0007c.+nCc UW\u0011\tj[m\u0006ouK\t\u0001'U+\u0010soVf\r,\u0017AN;k#*j\u0007i`:*[SqZh\u000eVw+\u007f\u001bL\u001c\u000e48\u000f.E8t\u001a&;\u0005tc@~\u0010tA.\u0006\u0012:%'\u00183Y<Kj_eS\u0019|7B\u0005%41\u0014\u0007!\nh>d#\u001dlw\u007f4\u0002DKLf\n\b=4Վ\u0378f\u0017"}, d2 = {"@dP166Ec!\b\t", "", "", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0013c\u00050?vk", "2`c.U(LS", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "B`Q9X\u0015:[\u0019", "@dP196KS\u001d\u0001\u0004D,\u0011i3e\u0007'c<\f\"\u001bPq\u001c", "", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0016c\u000b ;o\u001f\u0014MW-oC!\u0003hmI\u0007l*NL", "1ta@b9", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "@dP196KS\u001d\u0001\u0004D,\u0011\u0017", "", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0016c\u000b ;o\u001f\u0014MW\u0011", "@dP1<5=S,", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0019b| JC", "<`\\2", "CmX>h,", "", "@dP1<5=W\u0017~\t", "@dP1G(;Z\u0019b\u0004_6", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001z", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TableInfoKt {
    public static final TableInfo readTableInfo(SupportSQLiteDatabase database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new TableInfo(tableName, readColumns(database, tableName), readForeignKeys(database, tableName), readIndices(database, tableName));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            int columnIndex = cursor.getColumnIndex("id");
            int columnIndex2 = cursor.getColumnIndex(Session.JsonKeys.SEQ);
            int columnIndex3 = cursor.getColumnIndex("table");
            int columnIndex4 = cursor.getColumnIndex("on_delete");
            int columnIndex5 = cursor.getColumnIndex("on_update");
            List<TableInfo.ForeignKeyWithSequence> foreignKeyFieldMappings = readForeignKeyFieldMappings(cursor);
            cursor.moveToPosition(-1);
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) == 0) {
                    int i2 = cursor.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<TableInfo.ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : foreignKeyFieldMappings) {
                        if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i2) {
                            arrayList3.add(obj);
                        }
                    }
                    for (TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    String string = cursor.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursor.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursor.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    setCreateSetBuilder.add(new TableInfo.ForeignKey(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> setBuild = SetsKt.build(setCreateSetBuilder);
            CloseableKt.closeFinally(cursorQuery, null);
            return setBuild;
        } finally {
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex(Session.JsonKeys.SEQ);
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex(TypedValues.TransitionType.S_TO);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(columnIndex);
            int i3 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            listCreateListBuilder.add(new TableInfo.ForeignKeyWithSequence(i2, i3, string, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build(listCreateListBuilder));
    }

    private static final Map<String, TableInfo.Column> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            if (cursor.getColumnCount() <= 0) {
                Map<String, TableInfo.Column> mapEmptyMap = MapsKt.emptyMap();
                CloseableKt.closeFinally(cursorQuery, null);
                return mapEmptyMap;
            }
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("notnull");
            int columnIndex4 = cursor.getColumnIndex("pk");
            int columnIndex5 = cursor.getColumnIndex("dflt_value");
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            while (cursor.moveToNext()) {
                String name = cursor.getString(columnIndex);
                String type = cursor.getString(columnIndex2);
                boolean z2 = cursor.getInt(columnIndex3) != 0;
                int i2 = cursor.getInt(columnIndex4);
                String string = cursor.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                mapCreateMapBuilder.put(name, new TableInfo.Column(name, type, z2, i2, string, 2));
            }
            Map<String, TableInfo.Column> mapBuild = MapsKt.build(mapCreateMapBuilder);
            CloseableKt.closeFinally(cursorQuery, null);
            return mapBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursorQuery, th);
                throw th2;
            }
        }
    }

    private static final Set<TableInfo.Index> readIndices(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("origin");
            int columnIndex3 = cursor.getColumnIndex("unique");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                CloseableKt.closeFinally(cursorQuery, null);
                return null;
            }
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            while (cursor.moveToNext()) {
                if (Intrinsics.areEqual("c", cursor.getString(columnIndex2))) {
                    String name = cursor.getString(columnIndex);
                    boolean z2 = cursor.getInt(columnIndex3) == 1;
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    TableInfo.Index index = readIndex(supportSQLiteDatabase, name, z2);
                    if (index == null) {
                        CloseableKt.closeFinally(cursorQuery, null);
                        return null;
                    }
                    setCreateSetBuilder.add(index);
                }
            }
            Set<TableInfo.Index> setBuild = SetsKt.build(setCreateSetBuilder);
            CloseableKt.closeFinally(cursorQuery, null);
            return setBuild;
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z2) throws IOException {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex("cid");
            int columnIndex3 = cursor.getColumnIndex("name");
            int columnIndex4 = cursor.getColumnIndex("desc");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
                CloseableKt.closeFinally(cursorQuery, null);
                return null;
            }
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) >= 0) {
                    int i2 = cursor.getInt(columnIndex);
                    String columnName = cursor.getString(columnIndex3);
                    String str2 = cursor.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                    Integer numValueOf = Integer.valueOf(i2);
                    Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                    treeMap.put(numValueOf, columnName);
                    treeMap2.put(Integer.valueOf(i2), str2);
                }
            }
            Collection collectionValues = treeMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
            List list = CollectionsKt.toList(collectionValues);
            Collection collectionValues2 = treeMap2.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
            TableInfo.Index index = new TableInfo.Index(str, z2, list, CollectionsKt.toList(collectionValues2));
            CloseableKt.closeFinally(cursorQuery, null);
            return index;
        } finally {
        }
    }
}
