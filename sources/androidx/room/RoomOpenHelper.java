package androidx.room;

import android.database.Cursor;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: RoomOpenHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tvA0JgP.`S2şs{J$c$wFCU(\u0004*\tUTm|\u0005Ϻx\"s\u000f4\u00151kCan9z\u0018#BF}?KM\u001e>Id\u00038\u001d `%H}\u0013\u00052*v\u0015ͯ~CY\u0012RSPtHR%M3\u001b\"\nL\"\u0019\u001e\u000bj^:Vsu:](\u0013mPR?_^\u0002֔\u0011Fb/U\u0005o'C@e?E)a\u000e\u001fR\nKI?:K\u0013u?'YS$[Dc\u0018\u0014C7\u0016\r&\u00014j\u001dQ\u000f\u0016W/]ncP<4>\u000fD\u001bJ\u0013&\u0006UR^1(q \u000ea\u00019g\tn\u0010nZ\u007f)kf\u001b3\u000bK+g'\u0017UoL1Ne\u000e5\u0011,6\u0019nOm\u001b\")#)h\u0010Q_[pAVY\"YkyJ\u0005+ 8\u0019HG.9,\u0015<\"=7\nES%y\u0013`D\u0016\t5dvf\u0002RvRh\u0003^E8\u001f$Zrn5o^_p,?YbTW\f\u0016\u00138^\u000e;O&fʝ[ŹmjUΪZ1=hOY\u001dndæ;ӷ75Yү`m`},?jg[֝h͞W\fb٢x.@L\u0003\u0010&\u0001\u001b\u008b\u000eƱ6?yʉ٢0K"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0eK\u0001 yGv\u0019<\u0004z", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rdh@\u0004_*TL", "1n]3\\.N`\u0015\u000e~h5", "\u001a`]1e6BR,H\bh6\u0005R\u000ea\u000f$x<\u000f\u0017tQx\u000f@x5BU\r$Avk", "2d[2Z(MS", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0eK\u0001 yGv\u0019<\u0004c\u0014Y\u0005 9i%.#", ":dV.V@!O'\u0002", "", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xD{7w=|%\u0017%y\u0017=z'Efy/;w\u001f\u00044?DjA(\u0019gt\u0003\u0014m6V@\u0014QVV\u0016gR{ \u0014\u0019e\u000e[ik\u0005`A&jS7tn1E\u001372\b\b\u001f\u0010~X\u007fOZ\u0019IOXf", "7cT;g0Mg{z\ta", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xD{7w=|%\u0017%y\u0017=z'Efy/;w\u001f\u00044?DjA(\u0019gt\u0003\u0014m6V@\u0014QVV\u0016gR{ \u0014\u0019e\u000e[ik\u0005`A&jS7tn1E\u001372\b\b\u001f\u0010~X\u007fOZ\u0019IO{z=:d\u0010`[\u0003I\u000b3q7h\u0015ar +", "1gT0^\u0010=S\"\u000e~m@", "", "2a", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "1qT.g,&O'\u000ezk\u001bx\u00066ec)dJ\u0010v*K}\u001dJ", "=m2<a-BU)\fz", "=m2?X(MS", "=m3<j5@`\u0015}z", "=kS#X9LW#\b", "", "<df#X9LW#\b", "=m>=X5", "=mD=Z9:R\u0019", "CoS.g,\"R\u0019\b\nb;\u0011", "\u0011n\\=T5B]\"", "\u0012d[2Z(MS", "$`[6W(MW#\bg^:\r\u0010>", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {
    public static final Companion Companion = new Companion(null);
    private DatabaseConfiguration configuration;
    private final Delegate delegate;
    private final String identityHash;
    private final String legacyHash;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration configuration, Delegate delegate, String identityHash, String legacyHash) {
        super(delegate.version);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration configuration, Delegate delegate, String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.onConfigure(db);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(SupportSQLiteDatabase db) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        boolean zHasEmptySchema$room_runtime_release = Companion.hasEmptySchema$room_runtime_release(db);
        this.delegate.createAllTables(db);
        if (!zHasEmptySchema$room_runtime_release) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(db);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(db);
        this.delegate.onCreate(db);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(SupportSQLiteDatabase db, int i2, int i3) {
        List<Migration> listFindMigrationPath;
        Intrinsics.checkNotNullParameter(db, "db");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration != null && (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i2, i3)) != null) {
            this.delegate.onPreMigrate(db);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(db);
            }
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(db);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Migration didn't properly handle: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
            this.delegate.onPostMigrate(db);
            updateIdentity(db);
            return;
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 != null && !databaseConfiguration2.isMigrationRequired(i2, i3)) {
            this.delegate.dropAllTables(db);
            this.delegate.createAllTables(db);
            return;
        }
        throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(SupportSQLiteDatabase db, int i2, int i3) {
        Intrinsics.checkNotNullParameter(db, "db");
        onUpgrade(db, i2, i3);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(SupportSQLiteDatabase db) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        super.onOpen(db);
        checkIdentity(db);
        this.delegate.onOpen(db);
        this.configuration = null;
    }

    private final void checkIdentity(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
        if (Companion.hasRoomMasterTable$room_runtime_release(supportSQLiteDatabase)) {
            Cursor cursorQuery = supportSQLiteDatabase.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
            try {
                Cursor cursor = cursorQuery;
                String string = cursor.moveToFirst() ? cursor.getString(0) : null;
                CloseableKt.closeFinally(cursorQuery, null);
                if (!Intrinsics.areEqual(this.identityHash, string) && !Intrinsics.areEqual(this.legacyHash, string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorQuery, th);
                    throw th2;
                }
            }
        }
        ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
        if (!validationResultOnValidateSchema.isValid) {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
        }
        this.delegate.onPostMigrate(supportSQLiteDatabase);
        updateIdentity(supportSQLiteDatabase);
    }

    private final void updateIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(this.identityHash));
    }

    private final void createMasterTableIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
    }

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u0012\u007fјnjO0LeN2ZS@\u000fs{:$aI\bّkUH|b\u0014_Rug\u0007J\t\fß\u0013\u0006$z3:WX\u0011]@\u0013bF}DKM\u001eC\u007f\u0005=D\u0013'J\"f}5\u0005(/`\u0010%\u0001\noT >H\t:\u0001\u0011}\t(\u0017\u001e>N\u0007d\u00010\\DQ\u0005]h3S\u0007wGf'\u000e6CqUTb1%v\u0010\"[DE:-%\u0002\tMf$M\u0011J\n=3lW+9N\fWd^F(]9]\u0019urTi5Un\u0011?+}i\u0012dV6\u0006\t\u0014\rj\b>\n5MF-HlN!\u0004\u0003\u0001SXP0_x\u0004Qʰ8а)\u007f;ٿݶ\u001fu"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0eK\u0001 yGv\u0019<\u0004c\u0014Y\u0005 9i%.#", "", "Dda@\\6G", "", "uH\u0018#", "1qT.g,\u001aZ mv[3|\u0017", "", "2a", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "2q^=43EB\u0015{\u0002^:", "=m2?X(MS", "=m>=X5", "=m?<f;&W\u001b\fvm,", "=m??X\u0014BU&z\n^", "=mE._0=O(~h\\/|\u0011+", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0eK\u0001 yGv\u0019<\u0004c&U\u0005$6i%2WL(kB.\u001cw7", "D`[6W(MS\u0001\u0003|k(\f\r9n", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Delegate {
        public final int version;

        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onPostMigrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onPreMigrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public Delegate(int i2) {
            this.version = i2;
        }

        @Deprecated(message = "\u0018Y\u0001tl\u0004#MYS1~Q)1A_T\u000e4\u00060~g\u0007V}|bg\u0015Rq`i&Npi;G18\u0003\u000f")
        @InterfaceC1492Gx
        protected void validateMigration(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        public ValidationResult onValidateSchema(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            validateMigration(db);
            return new ValidationResult(true, null);
        }
    }

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\r.4\u0012}\u0007l\u007fOӄtev-\u0013h:\u0013y{L$\n%\u0002IIW2\u007f8\b}Q˗knX^[S\u001d\b.z\u0001+wX/ahƉ4Բs?;ݹ@KG`\r63!h&\u000fю\u0007в\u001e*PƵ͵~H"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0eK\u0001 yGv\u0019<\u0004c&U\u0005$6i%2WL(kB.\u001cw7", "", "7rE._0=", "", "3w_2V;>Ry\t\u000bg+d\u00171", "", "uY;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class ValidationResult {
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z2, String str) {
            this.isValid = z2;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007ll?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004h(~:\t}P\u0018k|Mr\u000bq\u0013Lǝѱn,OZAp \u0015JB\u001eAcQ}@Q`#:Kړݨ&8\u007f\fи\u001e2"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0eK\u0001 yGv\u0019<\u0004c\u0013c\u0006+3v\u001a8V\u0019", "", "u(E", "6`b\u0012`7Mg\u0007|}^4x", "", "2a", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "6`b\u0012`7Mg\u0007|}^4xG<o\n0uM\u0011 &Kw\u000e6\u0004%<Yy.7", "6`b\u001fb6F;\u0015\r\n^9k\u0005,l\u007f", "6`b\u001fb6F;\u0015\r\n^9k\u0005,l\u007ff\tJ\u000b\u001f\u0011T\u007f\u0017Kz-5S\u000b >m\u0012<M", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean hasRoomMasterTable$room_runtime_release(SupportSQLiteDatabase db) throws IOException {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor cursorQuery = db.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = cursorQuery;
                boolean z2 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z2 = true;
                    }
                }
                CloseableKt.closeFinally(cursorQuery, null);
                return z2;
            } finally {
            }
        }

        public final boolean hasEmptySchema$room_runtime_release(SupportSQLiteDatabase db) throws IOException {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor cursorQuery = db.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = cursorQuery;
                boolean z2 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) == 0) {
                        z2 = true;
                    }
                }
                CloseableKt.closeFinally(cursorQuery, null);
                return z2;
            } finally {
            }
        }
    }
}
