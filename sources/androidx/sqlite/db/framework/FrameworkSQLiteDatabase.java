package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
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
/* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*, \u0016\u000ff\u000198DsT6RY+\u0017k\n=,[*vK;c!\u0006\"\u000fYVgutRZ\u0011G\u0017\u0006$xr,OV\u0001](\u000f:Bu@;M\u0006=A`z9\r @1@y\u0013Џ\"*N\u001a~zYK\u0014\u00126Cx:h\rU\u00050\u0012\u000ē(\u00014\\oN<Kt]P/+\u0003oJTϋuܞ\u001b(=F\u0003&Ev;xkKG9#%k\u00035SÜC\u0003Ms\u0006\u000bvL?+w\u001a\u001eJ!\u0006\"<CO;\u00049:%\u0013_\t$'Yu\u0014O^7@w)&SPL\u001c\u0014R`.[@\u0017\f\u001c\\\rr\u0002j\u0017\u0016'H\u000e'y6EKFGsG)\u0014iaiG~;\n4%\u001eQ\u000755$\u0006\u001c\u0011-\u001b\u0003\u0017\u00025_qUH|\u0010\nC{6\td\u0018)26w\u0010=/):'+=ZI%7j0}Zf%9'|רmRVvjt$nB\t:\u0001\u000byMq^\rp,?WbhO\u0004\u0016L8\\&bg9Xu]#\u0002j{\u0004:)=\u0016OY\u001dq>gG\u001aKAai\u0016`bx*>j\u0018\u001bW\u0015v\u001a Ⱥ`(0n\u0011x\u001e5\u0014D|2C6M!44Z7_p]m\u0011[ZA+/\u0010^v?\u0017Ta*3w20!\u000b`bvnwz_++\u0016Pa\beڤ\u001d&c^1:\u000ba\u001f~\"\n\u000e{\u0015eZ,.u\u0004\u000eP\u001a(ji/k\u0019?\u00037r\u001a-sk#i_\u000f*')?@#\u0004t<+ j\u001f6\u0011nX\u0014l\u0017Pw'\u00011M|\u007f(kv~U*l\u000b\n]\u0010\u0007KgJ\u0016P|3gN)\u000f7:|cv\n;e.\u0006[G\u0015\u0010&\u001as<Az\u000fT>\u0016\n:..qxP\f}\u0002M\u0012g\r\u0006:$\u001bKrLx? B7:SG\u0011fr8n8{S_\u0002tND\r\u001f\\\fH!+\u0016>>e0rS\u007f*]qZ?\u0002\u001a{ƽqKjW\u0013\u001d\u0018X\u00141\u001d8LA.%ob7:L\t`DO\u000bz\u0005j/T8:\r \u000bq&0\u001aX\t\u000e\u0019w\u000fEXrwI*&T'{\u001d\\MnSv9*/\u0011?7,\nM13\u007f\rhwi@Uk\u001d7A1cG(3\u0001\\Tg:X\\\u000f<]]qO2:\u0012\bAm\u001a\u000f<<&>5BF]iW\u001f\u0012\u000f2t\n\u0004j~t\u0005E~^^(/}\u000b~$;8D!\u0018}'6vυPN\u0006\u000e\f \u000fn\\)5\u0016Cw\u000f);]M-kS\u001b\u00185ToSi\u0010N4pM\u0012w9pg\u001cv\u0016m\u001dJ\u0016 \u001cr\u0004\u0019\u0013~&23`s!\u000ed\\\rе\u0004ג\u0006\u0017v[q~/Hw7z\u0006ZK\u0017y`ɫn̼rU\u0013ӆ7Cd\u0003\u0007-~'?{$ܯ\u0015͠^>)U&a\u001f\u000bd'4+N\b\u00113F$:׃rքS_%-5w8l\u0002B`+\u0016\u001f(\u007f:~+Ӧ\u0017ͪZQVf\u000fizM( lx@d#\u0016_hS۟Jր\u0015\u0017LHx,r:\b+-j%G\u000f\u0011:\u001a ¥#ܳVC398\u001a}3G#\u0011Jzt.4x^IϜiǋ1Jl? 7g/>\u0007\u00119cEfT80\u001f\u001f)/\tJV\u0013\u001bnrԴ]ߥE#)\u0003\u001bL\u0014\u0005'\u001b;\u0001_juL\u000f\u0015\u0019\rm\faoH\u0005OrQAEDY,=օ1̂iV?\u000e\b~X\u0014me\\)oC\u001aIS9\u0012WV~8%Zx\\Å%ǪI5`,exNsDy\u0012FB6\u001dcSKz\u0017\f\nZ\tNH#08ƁM˒\u0018#\\@0Nz)eOn\u001d\u0019hբIo"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015G]H\u0003`(\\v|", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "2d[2Z(MS", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z458y/3j\u0012<M\u0019", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fq\nL\b\u001b&G9{(])DY\\\u001cFi\u0013*[C\u0011/%", "/sc.V/>Rw{\t", "", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "", "5dc\u000eg;:Q\u001c~y=)\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "7r3.g(;O'~^g;|\u000b<i\u000f<eF", "", "u(I", "7r3/?6<Y\u0019}Wr\n\r\u0016<e\t7jC\u000e\u0017\u0013F", "7r4EX*)S&\\\u0005g5|\u0007>i\n1i,g\u0005'Rz\u0018I\u0006%4", "7r>=X5", "7rA2T+(\\ \u0013", "7rF?\\;>/\u001c~v]\u0013\u0007\u000b1i\t*[I|\u0014\u001eGn", "<t\\\u000fl;>a", "", ";`g6`<FA\u001d\u0014z", "5dc\u001aT?B[)\u0007hbA|", "u(9", "Adc\u001aT?B[)\u0007hbA|", "uI\u0018#", ">`V2F0SS", "5dc\u001dT.>A\u001d\u0014z", "Adc\u001dT.>A\u001d\u0014z", ">`c5", "5dc\u001dT;A", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "D`[BX", "", "Dda@\\6G", "5dc#X9LW#\b", "u(8", "Adc#X9LW#\b", "uH\u0018#", "0dV6a\u001bKO\"\rv\\;\u0001\u00138", "", "0dV6a\u001bKO\"\rv\\;\u0001\u00138N\n1[S~\u001e'Us\u001f<", "0dV6a\u001bKO\"\rv\\;\u0001\u00138W\u00047~'\u0005%&Gx\u000eI", "BqP;f(<b\u001d\t\u0004E0\u000b\u0018/n\u007f5", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z45H\u000b\u001c@{\u0012,\\GEt\u001b\"#waB\u0007p\u0002", "0dV6a\u001bKO\"\rv\\;\u0001\u00138W\u00047~'\u0005%&Gx\u000eI_/>9\u0011\u001e>}$2^C", "1k^@X", "1n\\=\\3>A(z\n^4|\u0012>", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "Ap[", "2d[2g,", "B`Q9X", "EgT?X\nEO)\rz", "EgT?X\bKU'", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g\u001cdj;PM)Sv%V\"\u0012\u0010", "2hb.U3>E&\u0003\n^\b\u007f\t+df2}B\u0005 \u0019", "3mP/_,0`\u001d\u000ez:/|\u0005.L\n*}D\n\u0019", "3mS!e(Ga\u0015|\nb6\u0006", "3wT0C,K1#\b\u0004^*\f\r9nm\u0014b", "0h]149@a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00114", "3wT0F\u0018%", "7mC?T5LO\u0017\u000e~h5", "7mb2e;", "1n]3_0<bt\u0006|h9\u0001\u00182m", "D`[BX:", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001 &8k\u0015Lv3\u000b", "7r32_,@O(~", "Ap;6g,\u001dO(zwZ:|", "<dT1H7@`\u0015}z", "<df#X9LW#\b", "?tT?l", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B#", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*7t3+\u001fl`\u0003\u0006_;Js#UL\u0018\nl_\u0001G!g", "Adc\u0013b9>W\u001b\b`^@Z\u00138s\u000f5wD\n&%'x\n9}%4", "3mP/_,=", "Adc\u0019b*:Z\u0019", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "Adc\u001aT?,_ \\v\\/|v3z\u007f", "1`R5X\u001aBh\u0019", "Adc!e(Ga\u0015|\nb6\u0006v?c}(\nN\u0002'\u001e", "CoS.g,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'| \u0016Ty\u0012;@#?b\r @|_\fWLJk=-\u0006dhI\u0007q\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bz@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b.T", "GhT9W\u0010?1#\b\n^5{\t.S{){G\u0015", "AkT2c\b?b\u0019\fnb,\u0004\b\u000ee\u0007$\u0010(\u0005\u001e\u001eK}", "\u000foX\u007f#\u0010F^ ", "\u0011n\\=T5B]\"", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    private final SQLiteDatabase delegate;
    public static final Companion Companion = new Companion(null);
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    public FrameworkSQLiteDatabase(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j2) {
        return this.delegate.yieldIfContendedSafely(j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i2) {
        this.delegate.setVersion(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    /* JADX INFO: renamed from: setMaximumSize */
    public void m6977setMaximumSize(long j2) {
        this.delegate.setMaximumSize(j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j2) {
        this.delegate.setMaximumSize(j2);
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(String sql, Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.INSTANCE.execPerConnectionSQL(this.delegate, sql, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + Build.VERSION.SDK_INT);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j2) {
        this.delegate.setPageSize(j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query(new SimpleSQLiteQuery(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String query, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        return query(new SimpleSQLiteQuery(query, bindArgs));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final Function4<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> function4 = new Function4<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                SupportSQLiteQuery supportSQLiteQuery = query;
                Intrinsics.checkNotNull(sQLiteQuery);
                supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda1
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.query$lambda$0(function4, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getSql(), EMPTY_STRING_ARRAY, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public static final Cursor query$lambda$0(Function4 tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String sql = query.getSql();
        String[] strArr = EMPTY_STRING_ARRAY;
        Intrinsics.checkNotNull(cancellationSignal);
        return SupportSQLiteCompat.Api16Impl.rawQueryWithFactory(sQLiteDatabase, sql, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.query$lambda$1(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    public static final Cursor query$lambda$1(SupportSQLiteQuery query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        query.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(String table, int i2, ContentValues values) throws SQLException {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.delegate.insertWithOnConflict(table, null, values, i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(String table, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(table);
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(string);
        SimpleSQLiteQuery.Companion.bind(supportSQLiteStatementCompileStatement, objArr);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(String table, int i2, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(CONFLICT_VALUES[i2]);
        sb.append(table);
        sb.append(" SET ");
        int i3 = 0;
        for (String str2 : values.keySet()) {
            sb.append(i3 > 0 ? "," : "");
            sb.append(str2);
            objArr2[i3] = values.get(str2);
            sb.append("=?");
            i3++;
        }
        if (objArr != null) {
            for (int i4 = size; i4 < length; i4++) {
                objArr2[i4] = objArr[i4 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(string);
        SimpleSQLiteQuery.Companion.bind(supportSQLiteStatementCompileStatement, objArr2);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String sql) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String sql, Object[] bindArgs) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i2) {
        return this.delegate.needUpgrade(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public String getPath() {
        return this.delegate.getPath();
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
    public void setForeignKeyConstraintsEnabled(boolean z2) {
        SupportSQLiteCompat.Api16Impl.setForeignKeyConstraintsEnabled(this.delegate, z2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
        SupportSQLiteCompat.Api16Impl.disableWriteAheadLogging(this.delegate);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return SupportSQLiteCompat.Api16Impl.isWriteAheadLoggingEnabled(this.delegate);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final boolean isDelegate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual(this.delegate, sqLiteDatabase);
    }

    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjG<L͜P.`b2\u000fq{:ƛ[:ڎs;\u0004\u0019>'\u000fOɁkg|J#:Q\u0010\u001e\u0016'l\\Mc{u\u0012=6rsM8eok?\u0011\u0005D\f8>2>\u007f\u0004\u0011\u001c@G>u\u0011By\u0014X5Ϯt:`\u0016̈\t$"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015G]H\u0003`(\\ve#WRy'6zH\u001bg", "", "u(E", "3wT0C,K1#\b\u0004^*\f\r9nm\u0014b", "", "AP;6g,\u001dO(zwZ:|", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z458y/3j\u0012<M\u0019", "Ap[", "", "0h]149@a", "", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fq\nL\b\u001b&G9{(])DY\\\u001cFi\u0013*[C\u0011R9\u001a&d+@\u0003l.\u0018d6TPW.2HYB\u0010#VWU'\u0016\u0007#+!sD5.]o:", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final void execPerConnectionSQL(SQLiteDatabase sQLiteDatabase, String sql, Object[] objArr) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, objArr);
        }
    }

    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\r.4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BWIV2\u00042\u000b_N\u0016j\u001dL1ŒEǇ\n\u0018\u0001j:M&\u000fk\u0017':RsO5cnk<\u000fv\rӏ\"ݨ&:\u0002\u0005\u000f\u001eݻL\u0016"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015G]H\u0003`(\\ve%VV7X[vG\u001dg", "", "u(E", "\u0011N=\u0013?\u0010\u001cB\u0013oVE\u001c\\v", "", "", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "\u0013L?!L&,B\u0006bc@&Xu\u001cAs", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
