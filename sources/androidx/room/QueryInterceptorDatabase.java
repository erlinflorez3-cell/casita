package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: QueryInterceptorDatabase.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fZDkt\nA\u000e0!.Jչ*,(w\u000ffp98Dsf6Ri*\u0017k\n@,[*rK;c#\u0006\"\u000fTVguuRZ\u0011K\u0017\u0006$~r,OX\u0001] \u000f:Bu@;M\u0006=A`z7\r H\"@y\u000b\u0004\"*V\u001f~zQŷ\u0014\u00126Jx:h\rU\u0005 \u0013\u000e>6\u0001&\\}N>ԟt]P/+\u0003oEV'u0\u0005M\u0013NZ܋#Ǹ\u0012\u001eY?wP%)a\u0003\u001fR\n>\u0013C\u007f>\u001dhU);M\u0002ZNX.\u0018Ʀ/O\u001bb;,j*i`:Mqc,Q^5@w)\"SPL\u001c\u0014O`.[@\u0017\f\u001c\\\rr\u0002j\u0017\u0016'P\u000e&y6EK079b3f\u007f\f\u0002-\u0017>\n1%\u001eQ'5ĦZ\u001d\u001cnB3T&\u007faUNl`N8b\u0004\u0002L#p2B\u0004^g03\nBF\u0017S@\f?1S\u0004\u0004^C\u0016\u007f5pv\u0007\u0002^XF(m&9@\b:\u0010Zc3 \u0017ԐW¯\u0015M*\u000bO\u0005\u0016J8\\&bgُ\u000f\u0017Vv\"\u0003M\f\u0017kÛe\u007f_|%&Wg\u0005yI\u001a\u000e\u001e\u001cjvBelf\u0013\b~B\u0002\u0015\u000bn.!@\u0004\u0003\u001c\b\u0002JM\u001c\u0015H> QJ+_M#ĀGҴ\"BO9Qmh&(~\u0003YT\u0007wS\r\t/Y#\u00058\r\u0007\u0007D|\u000fH]E_d1&\u0004+\u0019B\u000b^\u001f\t\u0004\u0006Mf\\IbkD+\u00040f*׀=Q=y[\u0016\rgJ\u0002[R\u0013Ȁd\u001al f\u0013|($kl<\u0019 j\u001f5\u0011nX\u0010l\u0017P\u0017\u000fv1I|\u007f($\rۀF,c\u0019\u001fVI!\u0010\n@\\|\u0015\u0005M>k˱nj\u000bCr['K\\(\u0018=Zy]\u00187t\u000e+'4:}\u0004Z*Fsp\u0017u2i\u007fy_\r\u0007:&\u0003\u0002p\u00121\fPP\u0017y%3v\b\u0015td}e\u000b]\u0007-\u001bt2~\u001cs:A6.8<%Bsq\u0007DlQ`)Wcmsl[^!I=?90w\u0003݁ =.! q\u0017{\u001esF\\q?pQT\tRArќ\u0007SRb7\u001e\u0010)&vc\u001deJB\"\u000b\u001dլSAkd\u0019\u001d`s\u0007Q.\u000fP'3L\u0019{̤\u00046Ub\u0002{2/hM\r)>g~\u0015:q׳S\u0002!6-\u0019\u000bs\u0004\n]Jx\u0012\u001dAm\u001a\u0010<<&.5BF$iU\u001f \u000f0\r+\u0006h\\&\u000f\u0012\u0015\u0015~(71\u0013~$;8\u0018;)]&\bn=RTvGE0\u007fEy?\u0006:1*́\u001aұ\n5;\u0014\u0012q\"~\u0014W\u0002HDЯ\u001fh6\u0012L9\\\u0006\u001b\u0017\u000eksR\u0016 +)ֆ\bcv.\nF^\u0005\u0001\u001a:\u00188_\u0002a\u000b#`ik&*n/Ak4I\u0002=OƔfؼgrm\r\tp?aJz;P5\tUL\u0005\u0080Zŷ>\u0011[ݰ)!\u000e -&MC^Ԋ,֤Sg\u0001rq[i\u001b{?y9y1^_tݰ\"ݺy\bBV.$Id\u001ePr\u0019tlpdD3A܁gé\u0010-,~\u0005Xl\u001fcDT\u00046d]Do۩^ǏKd\u001f\u0006KZ4/\u0002bM-O29|~Ϫ\u0014ܾ>f\r\u00020T\u0017\u0001Py:@^Tk']/zݽg݁*O]:H\u001b:\u001f^!=nP lqp˸>Ǿ7E1\u0013\u0007+F\u001d@\u001d'M\u0003Q\u0002:\u0001ʟ\nӸ\u0011I\u00123qS\u0002N\u0013%5)}6(xIAMgb&:\u000b<ڛ\u0002ߚgZ'c2fCcn\u0006cC\u0018\nM(zԙw¡\u0004E9\u05fazkjAns\u0006\u0006|Ĥ8˷H#O؝I\n\u0018K\u0002\u0018\"\u00052ȼAф~\u001e1FDK;\u000f'GS\f\b/\u07b6\u0011\u001f"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001bu\u007f5\u0010$\n&\u0017Tm\u000eG\u0006/B8y/3j\u0012<M\u0019", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "2d[2Z(MS", "?tT?l\n:Z {v\\2\\\u001c/c\u00107\u0006M", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "?tT?l\n:Z {v\\2", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezb55f\u0012}3t\u001d+IAAA", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\nn'\"Ry\u001bKd\u0011\u001c]\r \u0016i%*J?Ik\n\u0005\u001adr5Ps;R}pEVW*l_\u007f=\u001d!$ma+\u000b\u0015hK1D+3(\u00079S\u0006:{J\u0019 \u0018=4]L`\u0018&u$q>%vF\u0018K\nGNY@&k\u0013\\\u0019Z@\u0010g\u0005", "/sc.V/>Rw{\t", "", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "", "5dc\u000eg;:Q\u001c~y=)\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "7r3.g(;O'~^g;|\u000b<i\u000f<eF", "", "u(I", "7r3/?6<Y\u0019}Wr\n\r\u0016<e\t7jC\u000e\u0017\u0013F", "7r4EX*)S&\\\u0005g5|\u0007>i\n1i,g\u0005'Rz\u0018I\u0006%4", "7r>=X5", "7rA2T+(\\ \u0013", "7rF?\\;>/\u001c~v]\u0013\u0007\u000b1i\t*[I|\u0014\u001eGn", ";`g6`<FA\u001d\u0014z", "", "5dc\u001aT?B[)\u0007hbA|", "u(9", ">`V2F0SS", "5dc\u001dT.>A\u001d\u0014z", "Adc\u001dT.>A\u001d\u0014z", "uI\u0018#", ">`c5", "5dc\u001dT;A", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Dda@\\6G", "", "5dc#X9LW#\b", "u(8", "Adc#X9LW#\b", "uH\u0018#", "0dV6a\u001bKO\"\rv\\;\u0001\u00138", "", "0dV6a\u001bKO\"\rv\\;\u0001\u00138N\n1[S~\u001e'Us\u001f<", "0dV6a\u001bKO\"\rv\\;\u0001\u00138W\u00047~'\u0005%&Gx\u000eI", "BqP;f(<b\u001d\t\u0004E0\u000b\u0018/n\u007f5", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z45H\u000b\u001c@{\u0012,\\GEt\u001b\"#waB\u0007p\u0002", "0dV6a\u001bKO\"\rv\\;\u0001\u00138W\u00047~'\u0005%&Gx\u000eI_/>9\u0011\u001e>}$2^C", "1k^@X", "1n\\=\\3>A(z\n^4|\u0012>", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "Ap[", "2d[2g,", "B`Q9X", "EgT?X\nEO)\rz", "EgT?X\bKU'", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g\u001cdj;PM)Sv%V\"\u0012\u0010", "2hb.U3>E&\u0003\n^\b\u007f\t+df2}B\u0005 \u0019", "3mP/_,0`\u001d\u000ez:/|\u0005.L\n*}D\n\u0019", "3mS!e(Ga\u0015|\nb6\u0006", "3wT0C,K1#\b\u0004^*\f\r9nm\u0014b", "0h]149@a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00114", "3wT0F\u0018%", "7mC?T5LO\u0017\u000e~h5", "7mb2e;", "1n]3_0<bt\u0006|h9\u0001\u00182m", "D`[BX:", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001 &8k\u0015Lv3\u000b", "<dT1H7@`\u0015}z", "<df#X9LW#\b", "?tT?l", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B#", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*7t3+\u001fl`\u0003\u0006_;Js#UL\u0018\nl_\u0001G!g", "Adc\u0013b9>W\u001b\b`^@Z\u00138s\u000f5wD\n&%'x\n9}%4", "3mP/_,=", "Adc\u0019b*:Z\u0019", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "Adc\u001aT?,_ \\v\\/|v3z\u007f", "1`R5X\u001aBh\u0019", "Adc\u001aT?B[)\u0007hbA|", "<t\\\u000fl;>a", "Adc!e(Ga\u0015|\nb6\u0006v?c}(\nN\u0002'\u001e", "CoS.g,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'| \u0016Ty\u0012;@#?b\r @|_\fWLJk=-\u0006dhI\u0007q\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bz@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b.T", "GhT9W\u0010?1#\b\n^5{\t.S{){G\u0015", "AkT2c\b?b\u0019\fnb,\u0004\b\u000ee\u0007$\u0010(\u0005\u001e\u001eK}", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    private final SupportSQLiteDatabase delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(String table, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        return this.delegate.delete(table, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(String sql, Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.delegate.execPerConnectionSQL(sql, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(String table, int i2, ContentValues values) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.delegate.insert(table, i2, values);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return this.delegate.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i2) {
        return this.delegate.needUpgrade(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean z2) {
        this.delegate.setForeignKeyConstraintsEnabled(z2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i2) {
        this.delegate.setMaxSqlCacheSize(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j2) {
        return this.delegate.setMaximumSize(j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j2) {
        this.delegate.setPageSize(j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i2) {
        this.delegate.setVersion(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(String table, int i2, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.delegate.update(table, i2, values, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j2) {
        return this.delegate.yieldIfContendedSafely(j2);
    }

    public QueryInterceptorDatabase(SupportSQLiteDatabase delegate, Executor queryCallbackExecutor, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return new QueryInterceptorStatement(this.delegate.compileStatement(sql), sql, this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransaction$lambda$0(this.f$0);
            }
        });
        this.delegate.beginTransaction();
    }

    public static final void beginTransaction$lambda$0(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(this.f$0);
            }
        });
        this.delegate.beginTransactionNonExclusive();
    }

    public static final void beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2(this.f$0);
            }
        });
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    public static final void beginTransactionWithListener$lambda$2(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3(this.f$0);
            }
        });
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    public static final void beginTransactionWithListenerNonExclusive$lambda$3(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.endTransaction$lambda$4(this.f$0);
            }
        });
        this.delegate.endTransaction();
    }

    public static final void endTransaction$lambda$4(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("END TRANSACTION", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(this.f$0);
            }
        });
        this.delegate.setTransactionSuccessful();
    }

    public static final void setTransactionSuccessful$lambda$5(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery("TRANSACTION SUCCESSFUL", CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$6(this.f$0, query);
            }
        });
        return this.delegate.query(query);
    }

    public static final void query$lambda$6(QueryInterceptorDatabase this$0, String query) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        this$0.queryCallback.onQuery(query, CollectionsKt.emptyList());
    }

    public static final void query$lambda$7(QueryInterceptorDatabase this$0, String query, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(bindArgs, "$bindArgs");
        this$0.queryCallback.onQuery(query, ArraysKt.toList(bindArgs));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final String query, final Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$7(this.f$0, query, bindArgs);
            }
        });
        return this.delegate.query(query, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$8(this.f$0, query, queryInterceptorProgram);
            }
        });
        return this.delegate.query(query);
    }

    public static final void query$lambda$8(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.onQuery(query.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$9(this.f$0, query, queryInterceptorProgram);
            }
        });
        return this.delegate.query(query);
    }

    public static final void query$lambda$9(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.onQuery(query.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$10(this.f$0, sql);
            }
        });
        this.delegate.execSQL(sql);
    }

    public static final void execSQL$lambda$10(QueryInterceptorDatabase this$0, String sql) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        this$0.queryCallback.onQuery(sql, CollectionsKt.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        CollectionsKt.addAll(listCreateListBuilder, bindArgs);
        final List listBuild = CollectionsKt.build(listCreateListBuilder);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$12(this.f$0, sql, listBuild);
            }
        });
        this.delegate.execSQL(sql, listBuild.toArray(new Object[0]));
    }

    public static final void execSQL$lambda$12(QueryInterceptorDatabase this$0, String sql, List inputArguments) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        Intrinsics.checkNotNullParameter(inputArguments, "$inputArguments");
        this$0.queryCallback.onQuery(sql, inputArguments);
    }
}
