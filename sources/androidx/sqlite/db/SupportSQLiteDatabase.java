package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
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
/* JADX INFO: compiled from: SupportSQLiteDatabase.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u0016DLш|\u0004O$8\u000bDB\u0007\":\u001e\u007f\u0007lkA0RnP.XX2\u000fy\u0003<$a,yCI[\"}(\fWNugvJ`\fK\u000f\u001c\u0016\u0001j2I]xs\u0012\u00172HrG3[~E9nҚ>\u0005&<*8\u0010\u0005\t\u001a0I\u0018v\u0011CS\f(0H\u0081BR#M\r\u001a\u0018\tF \u0017\u001edgT>NQsŽ_#1h\u000bT5~H|{-\rxo\u0013\u0005\u00036+nW{9ma\u0011)j[m#ouK(\u0001'UO\u0010\u0018 Df%,\u0015Yo=a\u0001It\u0005\u007f\u0005RKs]qqh\u000eV\u001f+\u007f\u001bd\u001c\u000e4*\u000fRuKt1&3#\r\u0004D^,vB.}\u0012<%P\u00185A8Ii\u0002qIEfC\f\u000b\u0013\u001d3\u0003\u0005 \n\u0003$_CH\u001b\u001cΦ5QNl\u0011T\u0018\nUm2\u0011)'r\n>x\u0018/*\u0018t;m=ik;!\u001a\"\u000fh0 \u0013\u0014\u0001S\u0018rxD0\u0017.7X\f<lJc\u0013 h`h2\u0017L,V\u001d|6A6[&ig9ŎROv\u001f3[k@=/\u0015W\nry6o9\r6{u,5o\t\u000f\u0014m\\\u0013\tf\u000fZS:]\r60f`t }\u0002C^\u000e)1m JarUǬ`\u0015V8fHO4!_\toV#\u001dQ2;\u0002$#\u00181Tj\u001b\bg'L\\\u0001n[EA\u007fOI*c\\\u00014+^M#<\u000eU$dGzsFyc98\u0016HS\u0018S\u0006!\u001d=A20luP\u0001$iM@gA!B'I'Fg6*!0n)bO\u0003WR|l4;\nz~($\r \u0010qbIs>w23]J\rP|3\"dII\u00150;M-qfM\u001a\u0006RG\u0015\u0010`\u001a}<.z\u00196zk\u0003<e,n\u0011\u007f\f_\u0002\\ա]~Lelz\u0011\u0007`j&(r\rBRKHok7{\u0001[\u0019u\u0016f5L=td#R\u0013\u001eFzR(8\u0002\r\u0016\u0014\rcU\u0015[\u001e\u007fm\u001ce#/\u0013\u001d\u0018V\u00141\u001d!LA.#ob7?L\u0018`<O\tz\u0005j)jXt}\u0016Y[T\u0018 @~\u000epw\u000fE5rwI\u0010&T'v\u0007L\u0013\u001b]`Oe1\u0005\u001d^6zK03pvd=\u0010J\rc#\u000f\u001azQ\u0015eSYZSgHn|܁\u000fEk\u0013\u0012\bDT_)\u001cr60\u0001&\u000bmZ\u0018I@\u0002\u0015mHH^9d+r5\u001d fjb27\u000f\u0007\r\u0010L\n=\u000e)Q\u0003o\u00110zP\u000e6q\u001b7{\u001bͯ\tѼ\u0001g^\u001d3\nC2\u000eYx\u001a?{\u0006Z\u0012֢\nÙ$+\u001cv'be\u00167\u001ak$R\u0016 \u001d9֖\u000b\u07b3T$\u001c0P}\u0001\u0012~\u001aDY\u001a30\u001a\u0015.Bփ#͛+/\u0005\bHUv\u0001Zszn\u0007U9\n=ܙXӖr1h\u001f\u000f2[6chhF)SN_g\u05ce\u0016ޞ*#N\nh5\u001eW4z~xg[;2eQ\u0001Մ3ëV\"\u0016!\u007f\u0003\u00122%8#InMls_Ѕnܣ[\u0012vl.t\u0003\u001dy*\u000b\u0011`^?\"\u000bп~۠h9O\u001b%n\u001bX\u0001\t\nYW;qC`U39H\n\u001e+Mג\u0005̯fx\u0018,H \u0001\u00188B;_l=HA0ޥy҉\u00070cG>]\u0016H1\u0010\u0017LhVօ=юӍ\u001c?Y5G8?\u007fͪ<X̐\u000b\u0018"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "/sc.V/>Rw{\t", "", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "", "5dc\u000eg;:Q\u001c~y=)\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "7r3.g(;O'~^g;|\u000b<i\u000f<eF", "", "u(I", "7r3/?6<Y\u0019}Wr\n\r\u0016<e\t7jC\u000e\u0017\u0013F", "7r4EX*)S&\\\u0005g5|\u0007>i\n1i,g\u0005'Rz\u0018I\u0006%4", "7r>=X5", "7rA2T+(\\ \u0013", "7rF?\\;>/\u001c~v]\u0013\u0007\u000b1i\t*[I|\u0014\u001eGn", ";`g6`<FA\u001d\u0014z", "", "5dc\u001aT?B[)\u0007hbA|", "u(9", ">`V2F0SS", "5dc\u001dT.>A\u001d\u0014z", "Adc\u001dT.>A\u001d\u0014z", "uI\u0018#", ">`c5", "5dc\u001dT;A", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Dda@\\6G", "", "5dc#X9LW#\b", "u(8", "Adc#X9LW#\b", "uH\u0018#", "0dV6a\u001bKO\"\rv\\;\u0001\u00138", "", "0dV6a\u001bKO\"\rv\\;\u0001\u00138N\n1[S~\u001e'Us\u001f<", "0dV6a\u001bKO\"\rv\\;\u0001\u00138W\u00047~'\u0005%&Gx\u000eI", "BqP;f(<b\u001d\t\u0004E0\u000b\u0018/n\u007f5", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z45H\u000b\u001c@{\u0012,\\GEt\u001b\"#waB\u0007p\u0002", "0dV6a\u001bKO\"\rv\\;\u0001\u00138W\u00047~'\u0005%&Gx\u000eI_/>9\u0011\u001e>}$2^C", "1n\\=\\3>A(z\n^4|\u0012>", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "Ap[", "2d[2g,", "B`Q9X", "EgT?X\nEO)\rz", "EgT?X\bKU'", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g\u001cdj;PM)Sv%V\"\u0012\u0010", "2hb.U3>E&\u0003\n^\b\u007f\t+df2}B\u0005 \u0019", "3mP/_,0`\u001d\u000ez:/|\u0005.L\n*}D\n\u0019", "3mS!e(Ga\u0015|\nb6\u0006", "3wT0C,K1#\b\u0004^*\f\r9nm\u0014b", "0h]149@a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00114", "3wT0F\u0018%", "7mC?T5LO\u0017\u000e~h5", "7mb2e;", "1n]3_0<bt\u0006|h9\u0001\u00182m", "D`[BX:", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001 &8k\u0015Lv3\u000b", "<dT1H7@`\u0015}z", "<df#X9LW#\b", "?tT?l", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B#", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*7t3+\u001fl`\u0003\u0006_;Js#UL\u0018\nl_\u0001G!g", "Adc\u0013b9>W\u001b\b`^@Z\u00138s\u000f5wD\n&%'x\n9}%4", "3mP/_,=", "Adc\u0019b*:Z\u0019", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "Adc\u001aT?,_ \\v\\/|v3z\u007f", "1`R5X\u001aBh\u0019", "Adc\u001aT?B[)\u0007hbA|", "<t\\\u000fl;>a", "Adc!e(Ga\u0015|\nb6\u0006v?c}(\nN\u0002'\u001e", "CoS.g,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'| \u0016Ty\u0012;@#?b\r @|_\fWLJk=-\u0006dhI\u0007q\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bz@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b.T", "GhT9W\u0010?1#\b\n^5{\t.S{){G\u0015", "AkT2c\b?b\u0019\fnb,\u0004\b\u000ee\u0007$\u0010(\u0005\u001e\u001eK}", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener);

    SupportSQLiteStatement compileStatement(String str);

    int delete(String str, String str2, Object[] objArr);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    void execSQL(String str) throws SQLException;

    void execSQL(String str, Object[] objArr) throws SQLException;

    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(String str, int i2, ContentValues contentValues) throws SQLException;

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i2);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    Cursor query(String str);

    Cursor query(String str, Object[] objArr);

    void setForeignKeyConstraintsEnabled(boolean z2);

    void setLocale(Locale locale);

    void setMaxSqlCacheSize(int i2);

    long setMaximumSize(long j2);

    void setPageSize(long j2);

    void setTransactionSuccessful();

    void setVersion(int i2);

    int update(String str, int i2, ContentValues contentValues, String str2, Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j2);

    default void execPerConnectionSQL(String sql, Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        throw new UnsupportedOperationException();
    }
}
