package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: QueryInterceptorStatement.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS8.s{BřcҕyCIU\"Ԃ*\t]To˧vJh\u001bKƤ\u000e\u0016\u0007n4կ]xk\u0019\u00172HyE\u074ccڎm9\u000fsv(0608\u0012\u0005/\u0019:L\u001ew\u0013Cy\u000e\"4NsRR;Q\u0015\u001e \u000bV /$֔kNDO5sH:;\u0003\u0018N~+m=\u0015M;T\u0005+\u001b\u0006y\u001eYP}I];a\u0014\u001fR\nK3C\u007fJ\u001dhU5[M\u0002fNX.&[?\u0018#k\u0006>\\3]\u0011\u001058gcy^>,\u0006\n\u0014\rj\u0018T\u001aoV<B2f6\u001acx\u0001`XP0l\t\u0014CwD-=\u007fa7i\u001ft^y;G\\g\u007f\u0013\u001c6#/pgo\u001d\u0014n,3T&]we\tDVf\"YkyJͦaJ0\u0012I_\u007f]\bWB_+EuQ#O\u007fH\\\rm\u0005 xh\u0002w\u0019\\\t:|2O*7\u0018\u000bHr\"\u0004P\u0003f\\\u0017[+l\t\u0014\u0007A*#w\u0005'3.fO\u0017}1a&\u00123N~9om\u001a\u0010\u001eM/GCY{\u0018qV\u0007\u0016U;\u0011\u000f\u0007o\u0019Ͱ\u000eȺ`(*õ\u0019v\u001ew\u0014D|\u000biԸAۇ 44ջih#M\u001b\u001epGSȄa˖l\u0010\u0007Ԟ\u00040\u0011l<t7\u0005'ʗr״kxQؓMl0.YQc\u001b|š$מ8|+Ȕґw "}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001bu\u007f5\u0010$\n&\u0017Tm\u000eG\u0006/BG\r\u001cFm\u001e.VR\u0011", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "2d[2Z(MS", "Ap[ g(MS!~\u0004m", "", "?tT?l\n:Z {v\\2\\\u001c/c\u00107\u0006M", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "?tT?l\n:Z {v\\2", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezb55f\u0012}3t\u001d+IAAA", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\nn'\"Ry\u001bKd\u0011\u001c]\r %|\u0012=MK;tCs{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013z\u0017V\u001fJt\u001d\u0014]HmlN@\u001d\u00189V\u0002DwJk)\u000e3z\u007fLce.u\u001etN3lEl)\u0007QKM,\u0017n\u0016g{XI6!\u0010\u007f\u0019YT`.\u0017\u00101\ryYvceMn>)", "0h]149@avzxa,", "", "", "0h]153HP", "", "7mS2k", "", "D`[BX", "", "0h]176NP ~", "", "0h]1?6GU", "", "0h]1A<EZ", "0h]1F;KW\"\u0001", "1kT.e\tB\\\u0018\u0003\u0004`:", "1k^@X", "3wT0h;>", "3wT0h;>7\"\rzk;", "3wT0h;>C$}vm,[\t6e\u000f(", "A`e249@a\b\tXZ*\u007f\t", "0h]1<5=S,", "Ah\\=_,*c\u0019\f\u000f?6\no9n\u0002", "Ah\\=_,*c\u0019\f\u000f?6\nv>r\u00041}", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> bindArgsCache;
    private final SupportSQLiteStatement delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;
    private final String sqlStatement;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public QueryInterceptorStatement(SupportSQLiteStatement delegate, String sqlStatement, Executor queryCallbackExecutor, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqlStatement, "sqlStatement");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorStatement$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.execute$lambda$0(this.f$0);
            }
        });
        this.delegate.execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorStatement$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(this.f$0);
            }
        });
        return this.delegate.executeUpdateDelete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeUpdateDelete$lambda$1(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorStatement$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeInsert$lambda$2(this.f$0);
            }
        });
        return this.delegate.executeInsert();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeInsert$lambda$2(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorStatement$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForLong$lambda$3(this.f$0);
            }
        });
        return this.delegate.simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForLong$lambda$3(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public String simpleQueryForString() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorStatement$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForString$lambda$4(this.f$0);
            }
        });
        return this.delegate.simpleQueryForString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForString$lambda$4(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i2) {
        saveArgsToCache(i2, null);
        this.delegate.bindNull(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i2, long j2) {
        saveArgsToCache(i2, Long.valueOf(j2));
        this.delegate.bindLong(i2, j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i2, double d2) {
        saveArgsToCache(i2, Double.valueOf(d2));
        this.delegate.bindDouble(i2, d2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i2, value);
        this.delegate.bindString(i2, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i2, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i2, value);
        this.delegate.bindBlob(i2, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    private final void saveArgsToCache(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 >= this.bindArgsCache.size()) {
            int size = (i3 - this.bindArgsCache.size()) + 1;
            for (int i4 = 0; i4 < size; i4++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i3, obj);
    }
}
