package androidx.work.impl;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: WorkDatabase.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0016~\u0010Bկs\n\u000e\u0012=1znPsPڱA9nt~\u000b.3:8(\u0007G>rN\u001ey\u0013Cy\u0010XT\tvHW%M3 X*\u0007&\u000f%tg|>\u000f\u0011&@=,\u001bipXm\u0004x\u0003[\u0018^TU\u0019=\u0006f1NDM\u0015SaI+\u001baM\u0012Wqk\u0015/Kݹ/["}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E2\u000b$\u001d&k\u001d8s!CYS", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012", "u(E", "2d_2a+>\\\u0017\u0013YZ6", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9l<\u0002%>X})5\u0002t*W\u0019", ">qT3X9>\\\u0017~YZ6", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9xIv&5f})5mt*W\u0019", "@`f$b9D7\"\u007f\u0005=(\u0007", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9z8\t\u0017?f\u0004\u0004@n \rIM\u0011", "AxbAX4\"R|\b{h\u000bx\u0013", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9{P\u000545aa\u001f\u001bv\u00178,?EA", "Ena8A(FSwz\u0005", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+\u001eU\u0006 \u0016i \u0004", "Ena8C9HU&~\tl\u000bx\u0013", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+ f\b\"Dm$<,?EA", "Ena8F7>Qwz\u0005", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\u0016i \u0004", "Ena8G(@2\u0015\t", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+$U\u007f~3wk", "\u0011n\\=T5B]\"", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class WorkDatabase extends RoomDatabase {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final WorkDatabase create(Context context, Executor executor, boolean z2) {
        return Companion.create(context, executor, z2);
    }

    public abstract DependencyDao dependencyDao();

    public abstract PreferenceDao preferenceDao();

    public abstract RawWorkInfoDao rawWorkInfoDao();

    public abstract SystemIdInfoDao systemIdInfoDao();

    public abstract WorkNameDao workNameDao();

    public abstract WorkProgressDao workProgressDao();

    public abstract WorkSpecDao workSpecDao();

    public abstract WorkTagDao workTagDao();

    /* JADX INFO: compiled from: WorkDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`\\2şqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7hh\f[\u000f4\u0018)n:Lmx\f\u0016?6PtW3{um=n{N\u0005N:h=ѯ\t\n"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E2\u000b$\u001d&k\u001d8s!CY<}Au!*VGEt\n", "", "u(E", "1qT.g,", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E2\u000b$\u001d&k\u001d8s!CYS", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "?tT?l\fQS\u0017\u000f\nh9", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "CrT!X:M2\u0015\u000ev[(\u000b\t", "", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WorkDatabase create(final Context context, Executor queryExecutor, boolean z2) {
            RoomDatabase.Builder builderOpenHelperFactory;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            if (z2) {
                builderOpenHelperFactory = Room.inMemoryDatabaseBuilder(context, WorkDatabase.class).allowMainThreadQueries();
            } else {
                builderOpenHelperFactory = Room.databaseBuilder(context, WorkDatabase.class, WorkDatabasePathHelperKt.WORK_DATABASE_NAME).openHelperFactory(new SupportSQLiteOpenHelper.Factory() { // from class: androidx.work.impl.WorkDatabase$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
                    public final SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
                        return WorkDatabase.Companion.create$lambda$0(context, configuration);
                    }
                });
            }
            return (WorkDatabase) builderOpenHelperFactory.setQueryExecutor(queryExecutor).addCallback(CleanupCallback.INSTANCE).addMigrations(Migration_1_2.INSTANCE).addMigrations(new RescheduleMigration(context, 2, 3)).addMigrations(Migration_3_4.INSTANCE).addMigrations(Migration_4_5.INSTANCE).addMigrations(new RescheduleMigration(context, 5, 6)).addMigrations(Migration_6_7.INSTANCE).addMigrations(Migration_7_8.INSTANCE).addMigrations(Migration_8_9.INSTANCE).addMigrations(new WorkMigration9To10(context)).addMigrations(new RescheduleMigration(context, 10, 11)).addMigrations(Migration_11_12.INSTANCE).addMigrations(Migration_12_13.INSTANCE).addMigrations(Migration_15_16.INSTANCE).fallbackToDestructiveMigration().build();
        }

        public static final SupportSQLiteOpenHelper create$lambda$0(Context context, SupportSQLiteOpenHelper.Configuration configuration) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            SupportSQLiteOpenHelper.Configuration.Builder builder = SupportSQLiteOpenHelper.Configuration.Companion.builder(context);
            builder.name(configuration.name).callback(configuration.callback).noBackupDirectory(true).allowDataLossOnRecovery(true);
            return new FrameworkSQLiteOpenHelperFactory().create(builder.build());
        }
    }
}
