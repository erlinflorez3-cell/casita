package androidx.room.util;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: compiled from: FtsTableInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\rB4\u0012}\nnjG9LeN.ZS8\u0015s{:%a)\bّYcJ}P\b\bMu(\u0012Pn\u001bG\u001d\u0006.x\u0019-Y_\u0007_*\u0015BD\u007f?aN\u001e@Id\u0003:\u001d `#أ}\u0005\u000f\u001fjo z\tCc\f@1PzHT%S\u0015\u001c\"\u0006l!/!lq\\<`rm<?#1jpQϮc0\u000bTUWb/%v\u0010'[FE?-'i\u00025Q\"ρ\u0003\bwK\u0010\u0001'U7\u0010\b <f\r,\u0015YPSqC:j\u0007if\u001c);O\u0012L~\u0011^{QԐ\u000fʀ\b\u000e\u000eΩ\u0019<;\u001a~\b<4+v*ûRؿbB\bЭ2J%+\u00189;;+f\u007fbi\u001c\u0005;Rˤ\u000f̷'\u0001vďƥX\u001d"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E!\u0010%\u0006Cl\u0015<Z.6cS", "", "<`\\2", "", "1n[B`5L", "", "1qT.g,,_ ", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n#Y\ru\u001er\u0012?I\rBg= ^VpF\u000bl.$:\u0018", "=oc6b5L", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n#Y\ru\u001er\u0012?I\rKz8%^VaH\\'\u001d", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0011n\\=T5B]\"", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FtsTableInfo {
    public static final Companion Companion = new Companion(null);
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final Set<String> columns;
    public final String name;
    public final Set<String> options;

    @JvmStatic
    public static final Set<String> parseOptions(String str) {
        return Companion.parseOptions(str);
    }

    @JvmStatic
    public static final FtsTableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public FtsTableInfo(String name, Set<String> columns, Set<String> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(String name, Set<String> columns, String createSql) {
        this(name, columns, Companion.parseOptions(createSql));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(createSql, "createSql");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo = (FtsTableInfo) obj;
        if (Intrinsics.areEqual(this.name, ftsTableInfo.name) && Intrinsics.areEqual(this.columns, ftsTableInfo.columns)) {
            return Intrinsics.areEqual(this.options, ftsTableInfo.options);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.options.hashCode();
    }

    public String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }

    /* JADX INFO: compiled from: FtsTableInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\r.4\u0012}\u0007njGPLeN.ZS@\u000fsڔ<$q$yCAW ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jt]c}u\u0018\u001f4Rom6{um=n{N\u0005N5h=B\u001b\u000f\"BH>\u007f+GY\u0016*0n{jV\u001bY\u001d\u001a@\t\u0005%I:jtf<Xnm:]&1orR5iH|{\u0018vX5\u0019\u000faL.\u00077}13a\u001b\rb]O\u0003mtk\u000b\u0019+55as\u0006A\t\u0004\"!CO;`9&-\u0019_a$-;QsK~\u0011VyQԋ\u000fʀ\b\u0010\u000e'V2Ǐ\u001eu"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E!\u0010%\u0006Cl\u0015<Z.6c<}Au!*VGEt\n", "", "u(E", "\u0014SB,B\u0017-7\u0003gh", "", "", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", ">`a@X\u0016Ib\u001d\t\u0004l", "", "1qT.g,,b\u0015\u000ezf,\u0006\u0018", "@dP1", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E!\u0010%\u0006Cl\u0015<Z.6cS", "2`c.U(LS", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "B`Q9X\u0015:[\u0019", "@dP166Ec!\b\t", "@dP1B7MW#\b\t", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FtsTableInfo read(SupportSQLiteDatabase database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new FtsTableInfo(tableName, readColumns(database, tableName), readOptions(database, tableName));
        }

        private final Set<String> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
            try {
                Cursor cursor = cursorQuery;
                if (cursor.getColumnCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("name");
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(columnIndex);
                        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(nameIndex)");
                        setCreateSetBuilder.add(string);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
                return SetsKt.build(setCreateSetBuilder);
            } finally {
            }
        }

        private final Set<String> readOptions(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
            String sql;
            Cursor cursorQuery = supportSQLiteDatabase.query("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                Cursor cursor = cursorQuery;
                if (cursor.moveToFirst()) {
                    sql = cursor.getString(cursor.getColumnIndexOrThrow("sql"));
                } else {
                    sql = "";
                }
                CloseableKt.closeFinally(cursorQuery, null);
                Intrinsics.checkNotNullExpressionValue(sql, "sql");
                return parseOptions(sql);
            } finally {
            }
        }

        @JvmStatic
        public final Set<String> parseOptions(String createStatement) {
            Character ch;
            Intrinsics.checkNotNullParameter(createStatement, "createStatement");
            String str = createStatement;
            if (str.length() == 0) {
                return SetsKt.emptySet();
            }
            String strSubstring = createStatement.substring(StringsKt.indexOf$default((CharSequence) str, '(', 0, false, 6, (Object) null) + 1, StringsKt.lastIndexOf$default((CharSequence) str, ')', 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            String str2 = strSubstring;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < str2.length()) {
                char cCharAt = str2.charAt(i3);
                int i5 = i4 + 1;
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    } else {
                        Character ch2 = (Character) arrayDeque.peek();
                        if (ch2 != null && ch2.charValue() == cCharAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (cCharAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    }
                } else if (cCharAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                    String strSubstring2 = strSubstring.substring(i2 + 1, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    String str3 = strSubstring2;
                    int length = str3.length() - 1;
                    int i6 = 0;
                    boolean z2 = false;
                    while (i6 <= length) {
                        boolean z3 = Intrinsics.compare((int) str3.charAt(!z2 ? i6 : length), 32) <= 0;
                        if (z2) {
                            if (!z3) {
                                break;
                            }
                            length--;
                        } else if (z3) {
                            i6++;
                        } else {
                            z2 = true;
                        }
                    }
                    arrayList.add(str3.subSequence(i6, length + 1).toString());
                    i2 = i4;
                }
                i3++;
                i4 = i5;
            }
            String strSubstring3 = strSubstring.substring(i2 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(StringsKt.trim((CharSequence) strSubstring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str4 = (String) obj;
                String[] strArr = FtsTableInfo.FTS_OPTIONS;
                int length2 = strArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        break;
                    }
                    if (StringsKt.startsWith$default(str4, strArr[i7], false, 2, (Object) null)) {
                        arrayList2.add(obj);
                        break;
                    }
                    i7++;
                }
            }
            return CollectionsKt.toSet(arrayList2);
        }
    }
}
