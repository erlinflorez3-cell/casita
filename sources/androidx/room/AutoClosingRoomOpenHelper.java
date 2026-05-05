package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\u0007njO0L͜P.`_2\u000fq~<$q$yCAX\"}0\tWNmgvJh\u0014K\u000f\f\u0018~̓Bկ\u0006x\f\u0011?2pow4e\tWys\u0005:\u0013!J\"fx\u0015\u0005(,`\u0010%}ŲO\f 4\tvHe%M3.X\u001a\u0007/\u000f3tg|JxpkPG#1\u0001\tď&0>\u000bO%F\u0003*CǸ8Ӟ-Ë;5\u001dǬ$\u000f\u0015Ws?1EHܸ\u0007ص+'3ɞDiD_\u0018\u0016+*}\u00154č)ػ\tUx\u000e-4]m\u001cb\u001c)\u0010z*\f\u0013Ǡ\u0010Ν+N6Ʀ2h\u000e\u0019A\u0001CeN]\u001a^p\u000e17\rФ'ő7/Q\u001dl`oKi`E\r\u001d\rL17DwƓV\u05f8d\u00193V}c?a͞Ac"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u001bPqzF\u0001-\u001fd})\u001am\u001d9MP\u0011", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkAs", "\u001a`]1e6BR,H\bh6\u0005R\u000ee\u0007(}<\u0010\u001b IY\u0019<\u007f\b5`\t DC", "2d[2Z(MS", "/tc<63Ha\u0019\f", "\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u0017TE", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\nn'\"Ry\u001bKd\u0011\u001c]\r !x\u001670CBv4+jO]B\u0006p6Ru:\u0011YX6d\u001cNM#\u001c8\u0015X9\r\u0012/\u0005\u0015", "/tc<63Ha\u001d\b|=)", "\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u001bPqzF\u0001-\u001fd})\u001am\u001d9MPyGD-\u001fFhC\u0015g5Pd7RWX9k@^$\u0018!ZlJ:\t\u0002UO$D", "2`c.U(LS\u0002z\u0003^", "", "5dc\u0011T;:P\u0015\rzG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0011X3>U\u0015\u000ez", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7W!.V&;r?\u001e\">", "@dP1T)ESwz\nZ)x\u0017/", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "5dc\u001fX(=O\u0016\u0006z=(\f\u0005,a\u000e(", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7L\u0012=I@7y4s", "EqXAT)ESwz\nZ)x\u0017/", "5dc$e0MO\u0016\u0006z=(\f\u0005,a\u000e(", "1k^@X", "", "Adc$e0MSt\u0002zZ+c\u00131g\u00041} \n\u0013\u0014No\r", "3mP/_,=", "", "\u000ftc<63Ha\u001d\b|L<\b\u00149r\u000f\u0016g'\u0005&\u0017&k\u001d8s!CY", "\u000ftc<63Ha\u001d\b|L<\b\u00149r\u000f\u0016\bG\u0005&\u00175~\nKv-5b\r", "\u0019dT=43Bd\u0019\\\u000bk:\u0007\u0016", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    public final AutoCloser autoCloser;
    private final AutoClosingSupportSQLiteDatabase autoClosingDb;
    private final SupportSQLiteOpenHelper delegate;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.delegate.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z2) {
        this.delegate.setWriteAheadLoggingEnabled(z2);
    }

    public AutoClosingRoomOpenHelper(SupportSQLiteOpenHelper delegate, AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        autoCloser.init(getDelegate());
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // androidx.room.DelegatingOpenHelper
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.autoClosingDb.close();
    }

    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яć\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*, \u0016\u000ff\u000198DsT6RY+\u0017k\n=,[*uK;c!\u0006\"\u000fXVgutRZ\u0011F\u0017\u0006$xr,OV\u0001](\u000f:Bu@;M\u0006=A`z9\r @1@y\u0013Џ\"*N\u0019~zYK\u0014\u00126Bx:h\rU\u00050\u0012\u000ē(\u00014\\oN<Kt]P/+\u0003oITϋuܞ-M;E\u00152\u001dzo\u001eC@e6չ)S\u0011\t\u001baM%Wqk(/;o1W\u0018o6\u0007#Z)s]\u001b\u0003\u000b&\u000b(\u0002d\u001aMCO\u0012r\u0017\"p\u0006\t$%<216+VTE\u001a\u0015/TG=xaih\u0002\reF\u000f*D%O\u00183YdKj_\u000eS\u0019|=B\u0019UO1.\u0007!\nq>d#Ilw\u007f7\u0002FKwf\fo<\u001c\n!r\u0010Z\u001c<W\u00065z!0-$e\u000eO\"O\u001dH\\זkv\u0013\u00141Yw\u0007`@P\u0012\\Kr\u000f\u001a\u0010\\d3u\u0017h!2\u001f\u00044T5!N'hj\u0006s9%>q\u007flw\u0017e]8+uz\u007f~|#&Wg\u0002c9_\u0010(a\u0001|DMJ\u001b\u001dbvHY\u000bj^>!`z\u0019A>\u0010ΌR\f!k\bw*nD1Gf[\\K<P|\u0015\t\u000ek\u0019\u0014\r\u0003K$1oTx\u0017=h\\\u001f\r\u0018|Wi\u0015`Pk\be}'4\u0015:hb\u0007S\u000b\r4\u0018G\u0016i\u000e`5\u001a\u0004\u0017\u0014 D=\u0002_=\u007f+\u000f-lb\u0006;\bdr\u0014\u0016\u0014&o\u0013\u000b<';\u0017q\u0018\fx3D`\u0019\u000f\u007fZ%g\u000f`\t\"6+F\u000f*T\t\n{T9\u001fnM\u0001Eq<|>C\u0019gC3C\b\"+x]G5_.wB5Eok\"\b8\nh\u0015%\u0005g\u001a+\u0012H\u001e\u0014\u0018qщ?8W!GL0l\u0005\u0003pk\u001b{\u0016\f!4;=\u000fV-~d\u0003e\u000b]!\u0017\u000b:X\tV\n\u0007Y\u0004FB<-Bsq!DbQs)M\u0002\u00054\u0002\u0014j\u0019\u001a'\n9\rar 0U \u0005h)\u001dx\f\u0002hNAi\u0006KPQeB}T\b9`\u0005m\u0014>\u0013\u007fte?\u001b@~\f;\u0005+\u0005|j\u0014`\u0005\u000f\u0004\u0011'80\u0017\u0011I\u001d';a\u0015{vl;s8\u0007R-\u000b1i}1|$Yu\u001bMЬ,X\u000f]\u000ecQ\u001d\u001a62Qo\u00024}\u001a\f0|KLH\u001fG&)_%A%\u001f&\u000b\\g\u000f&v`^.9\u0001\u000b|<B\u001a\u0011\u001b\u0019}x\u001egCK|{m\u0018pݜ\u0019ؐ-\u000b$~iM)5VA;=ajB(R߽Uȯ\u0002\b(éw\u0016\u0003*tW<p@2qƄ\u0018ޭ\u001af\u001a\u000b\u0019Y.\u000f~\\\u0003~\".6@\u0006V\nď\u0015Ȩ]o\u0010#F39wVTYu\u0011\n\u0012v\u001aC,̚\u0005Ђ5Z\u0012p3]+\u0014w_<!pZh\u001b\nt/Ӑ\u0002ȗ\u0019*78\u000ep7\u001b uv\u007f\u0004O\n\u0017a\u0005Bˢcʘ4V6\u007f%\t\u0004\u000fzf6%SV{O\u001b]3׃DŃ\u0012b\u0003*j\u0007\u001a<d\u001f\r]v\u0011AEvv,xG7G0\u0012a\u00065]ʮQõ*+ITE1EE+q.\u000e\u001f\u001b\u000bv\u0003\u0019BD\u001fq.mb\u0002\u001d¾?Ն+]<oj\u001d4f\u0016ZP$D\u0011<._^F<V\\H9q&q\u0016o֝\rͤ<\u0010\b\t\u001fSxps'0!\u000b\"¶CO"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u001bPqzF\u0001-\u001fd})\u001am\u001d9MPyGD-\u001fFhC\u0015g5Pd7RWX9k@^$\u0018!ZlJ:\t\u0002UO$D", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "/tc<63Ha\u0019\f", "\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u0017TE", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xA\u00107\u0006\u001e\b!%G|c\u007fg", "/sc.V/>Rw{\t", "", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "", "5dc\u000eg;:Q\u001c~y=)\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "7r3.g(;O'~^g;|\u000b<i\u000f<eF", "", "u(I", "7r3/?6<Y\u0019}Wr\n\r\u0016<e\t7jC\u000e\u0017\u0013F", "7r>=X5", "7rA2T+(\\ \u0013", "7rF?\\;>/\u001c~v]\u0013\u0007\u000b1i\t*[I|\u0014\u001eGn", ";`g6`<FA\u001d\u0014z", "", "5dc\u001aT?B[)\u0007hbA|", "u(9", "<t\\\u000fl;>a", ">`V2F0SS", "5dc\u001dT.>A\u001d\u0014z", "Adc\u001dT.>A\u001d\u0014z", "uI\u0018#", ">`c5", "5dc\u001dT;A", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Dda@\\6G", "", "5dc#X9LW#\b", "u(8", "Adc#X9LW#\b", "uH\u0018#", "0dV6a\u001bKO\"\rv\\;\u0001\u00138", "", "0dV6a\u001bKO\"\rv\\;\u0001\u00138N\n1[S~\u001e'Us\u001f<", "0dV6a\u001bKO\"\rv\\;\u0001\u00138W\u00047~'\u0005%&Gx\u000eI", "BqP;f(<b\u001d\t\u0004E0\u000b\u0018/n\u007f5", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z45H\u000b\u001c@{\u0012,\\GEt\u001b\"#waB\u0007p\u0002", "0dV6a\u001bKO\"\rv\\;\u0001\u00138W\u00047~'\u0005%&Gx\u000eI_/>9\u0011\u001e>}$2^C", "1k^@X", "1n\\=\\3>A(z\n^4|\u0012>", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "Ap[", "2d[2g,", "B`Q9X", "EgT?X\nEO)\rz", "EgT?X\bKU'", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g\u001cdj;PM)Sv%V\"\u0012\u0010", "2hb.U3>E&\u0003\n^\b\u007f\t+df2}B\u0005 \u0019", "3mP/_,0`\u001d\u000ez:/|\u0005.L\n*}D\n\u0019", "3mS!e(Ga\u0015|\nb6\u0006", "3wT0F\u0018%", "0h]149@a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00114", "7mC?T5LO\u0017\u000e~h5", "7mb2e;", "1n]3_0<bt\u0006|h9\u0001\u00182m", "D`[BX:", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001 &8k\u0015Lv3\u000b", "<dT1H7@`\u0015}z", "<df#X9LW#\b", ">nZ2B7>\\", "?tT?l", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B#", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*7t3+\u001fl`\u0003\u0006_;Js#UL\u0018\nl_\u0001G!g", "Adc\u0013b9>W\u001b\b`^@Z\u00138s\u000f5wD\n&%'x\n9}%4", "3mP/_,=", "Adc\u0019b*:Z\u0019", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "Adc\u001aT?,_ \\v\\/|v3z\u007f", "1`R5X\u001aBh\u0019", "Adc\u001aT?B[)\u0007hbA|", "Adc!e(Ga\u0015|\nb6\u0006v?c}(\nN\u0002'\u001e", "CoS.g,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'| \u0016Ty\u0012;@#?b\r @|_\fWLJk=-\u0006dhI\u0007q\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bz@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b.T", "GhT9W\u0010?1#\b\n^5{\t.S{){G\u0015", "AkT2c\b?b\u0019\fnb,\u0004\b\u000ee\u0007$\u0010(\u0005\u001e\u001eK}", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        private final AutoCloser autoCloser;

        public AutoClosingSupportSQLiteDatabase(AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        public final void pokeOpen() {
            this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pokeOpen$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public SupportSQLiteStatement compileStatement(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new AutoClosingSupportSqliteStatement(sql, this.autoCloser);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
            try {
                SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
                Intrinsics.checkNotNull(delegateDatabase$room_runtime_release);
                delegateDatabase$room_runtime_release.endTransaction();
            } finally {
                this.autoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            Unit unit;
            SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release != null) {
                delegateDatabase$room_runtime_release.setTransactionSuccessful();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long j2) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public void set(Object obj, Object obj2) {
                    ((SupportSQLiteDatabase) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(final int i2) {
            this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setVersion(i2);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long setMaximumSize(final long j2) {
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Long.valueOf(db.setMaximumSize(j2));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public void set(Object obj, Object obj2) {
                    ((SupportSQLiteDatabase) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setPageSize(final long j2) {
            this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setPageSize(j2);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(String query, Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(SupportSQLiteQuery query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(final String table, final int i2, final ContentValues values) throws SQLException {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Long.valueOf(db.insert(table, i2, values));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int delete(final String table, final String str, final Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Integer.valueOf(db.delete(table, str, objArr));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(final String table, final int i2, final ContentValues values, final String str, final Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Integer.valueOf(db.update(table, i2, values, str, objArr));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(final String sql) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.execSQL(sql);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(final String sql, final Object[] bindArgs) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.execSQL(sql, bindArgs);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SupportSQLiteDatabase obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Boolean.valueOf(obj.isReadOnly());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release == null) {
                return false;
            }
            return delegateDatabase$room_runtime_release.isOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean needUpgrade(final int i2) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Boolean.valueOf(db.needUpgrade(i2));
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public String getPath() {
            return (String) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, String>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(SupportSQLiteDatabase obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.getPath();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(final Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setLocale(locale);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(final int i2) {
            this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaxSqlCacheSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setMaxSqlCacheSize(i2);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setForeignKeyConstraintsEnabled(final boolean z2) {
            this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.setForeignKeyConstraintsEnabled(z2);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    return Boolean.valueOf(db.isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, List<? extends Pair<String, String>>>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // kotlin.jvm.functions.Function1
                public final List<Pair<String, String>> invoke(SupportSQLiteDatabase obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.getAttachedDbs();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SupportSQLiteDatabase obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Boolean.valueOf(obj.isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.autoCloser.closeDatabaseIfOpen();
        }
    }

    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яė\u0014D57\u001eq\u007fZDkt\nA\u000e0!.J~(,\u001aw\u0015fr96DmH<X[ճ\u0017k\u00124,[*rK;c*\u0006\"\u000fOVguzRZ\u0011D\u0017\u0006$\br,OV\u0001] \u0013:ԏw?IMwމA`\u0003;\r 8\"@y\u0013\b\"ݒP\u0010\rzKŷ\u0014\u0012>^x:X\rU\u0005(\u001a\u000e>&\u0002&\\uW>HrhB/9\u0003qĩV'u0\u0005M\u0013I\\'#vi\u001e1D=5+Ǭ\u0004\u00035Q\u001cR\u0013C\u007f=\u001dhU&;M\u0002XNX.\u0016Ʀ/O\u001b`;,j\ti`:,qc,j^\u0014@w)\u0001=@\u0012\u0015\u001e'v6]&t\u0011&;\u0013}{Bf\u0001\rL.\u0005(ؾ\u0016m\u0007A7Q\u001b\u0015V(ݺ\u0018\u0017N\n\u0012%&A\f\u0017#qS<nC)\u0005{_8i@kP\u0015˺X\u0006t\u0012\u007fz\u0002X\fvϱ~w\u0013\u001f>/%eci//r\u001aPbr\u001f\u0007vg\u0002z\u0001Y\u0007̥m^N8\u001b$Zrl5w^[p4/XDV\u001d|6$Nm>˪ m'\\b\u0001q\tX\u0006\f;.\u0015H\b\u007f\u001c\u0012e@v3cY*ߛ`\u001b)\"ST\t\u0015bvJq\u0017\u0003^>!`Y\u0019!\u0016\u0007l`\u001c\u001f8>\u0002$R7Y\u001br\u0014v\u0014LSW{7t\t}VюSտ(\u0003w:=\u0010\u000fgtp\u001eo?̹+Eo0EYQc2VY0oL|Q\u000fE͵~\u0010vZadt4\u0001}}6\u0015HT\u007fJ\u0004ж\u000eG8@\u001eEEz\u0010\u0016U[\u0019?z+\u0002U§gvv\u0016\t\t,\u000frzSb\u001e:v\rziοcH\toe\u0013G\u0012t;_LP\u000b\u0003\bD\u0015̒{M%,F\u0019oP\u001f{B\f3+9\u0010\u001a?\u0017q]\u0018\u0012\\\u001e)$n{s)DcDw)Ъ\\zJFoq~lITp\u0011I`j&\u0010\tޝ3UJVi|xtCu\rE|\u0015\u0018Z\u001e!ZiA+o,<tʕ)<R\f=vCS\u0019}Wut\u0006K\u000b\u0013\u0011ؑ\tS\u0003?\u0019*\u001ckK\u001d͇aQ7\u0014 06of)Ŵ;Q+BYT\b9n\u001bɂ\u0005X\u0002\u000etw\u000fE]\tǔ:\u001f\u0015b(tVv0'ѻ_i1\u000f/'3L${̤\u00046Ub`{2/~M\r)qg~\u0015-q׳S\u0002*6\u000b\u0019\u000bs\tsM\u0010=\u001cGWu2ƨ\u000b\u0001\u001f\u000bPZ\u0018Id\u0018ΰ^?7l?md|\u0010=Ժe\u001bU0^\u0017z+9\u0003\u0093\u000eS(])\bb[w~{EJ2\u0001ELoܤ\u000bEjTRE\u0006cX\u0004ƭi\\>\n\u0010k;,\rP,5\u000b\r)zb6h \\IsD+\\ȟ\u0001Q*^Z\u001c.xy#\u0016<\u000fNW >*\u0015tX\u001a3O{m߳kNIY%\u0011\n\u0012\u0018*߳TS\"tnn\u0002\r8x\u001f\u001f&{IAs\u000bF\u001fZ8`/\u000b<\u0017<\u001ed#\u0011DV˭b1~y\u000es\rY4\u001c.opHRL\u0019e\u000f>+8\u0015@\u0015i[}Jr\u0010tt`b6`\u0001'\u00136:jD\t\rQv\u00191?nt4c]YGA\"ǃF)#\u0012\ba&O6\u0003C)zJ\u000b\u001ei'\u001b\u0011~zz\u0010,R\t!\"\u0016Ps[\u001dT(lq$\u001ci32YLPJ&79\u0010'.\tqNw#ӡ\u001b\u0004hA\b1\u0011/\u001ah\u0012}\u000e1=\t\\{'@\u007f+<;z@۾j\u000b\u007fEs;/=qqʳh֑)5m͗w\u0018\u0010eb~{b-բcϕM5MɊÂY\b"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u001bPqzF\u0001-\u001fd})\u001am\u001d9MPyQ4\u001e Dh=\u0018c\n^\u00045QY$", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "2d[2Z(MS", "/tc<63Ha\u0019\f", "\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u0017TE", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fqYP\u000e%!TEt8\u007f$Bc\u0002\u001fJ7#8WK\u0005GD-\u001fFhC\u0015c9$:\u0018", "1k^@X", "", "1n_FF;KW\"\u0001ih\t\r\n0e\r", ">/", "", ">0", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006~<\u000er$Tk\"\u0019\u0007&6Y\u000bu", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "2dP0g0OO(~", "5dc\u000f_6;", "", "5dc\u0010b3N[\"\\\u0005n5\f", "5dc\u0010b3N[\"b\u0004],\u0010", "", "5dc\u0010b3N[\"b\u0004],\u0010r<T\u00035\u0006R", "5dc\u0010b3N[\"gvf,", "5dc\u0010b3N[\"gvf,\u000b", "", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "5dc\u0010b<Gb", "5dc\u0011b<;Z\u0019", "", "5dc\u0012k;KO'", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "5dc\u0013_6:b", "", "5dc\u0016a;", "5dc\u0019b5@", "", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001fr\u0004", "\u001a`]1e6BRb\bzmul\u00163;", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001fr\u00046", "", "5dc\u001db:Bb\u001d\t\u0004", "5dc [6Kb", "", "5dc g9B\\\u001b", "5dc!l7>", "5dc$T5Mat\u0006\u0002H5d\u0013@e]$\u0003G\u000f", "", "7r03g,K:\u0015\r\n", "7r12Y6KSy\u0003\bl;", "7r29b:>R", "7r56e:M", "7r;.f;", "7r=B_3", ";ne2", ";ne2G6\u001fW&\r\n", ";ne2G6%O'\u000e", ";ne2G6'S,\u000e", ";ne2G6)]'\u0003\nb6\u0006", ";ne2G6)`\u0019\u0010~h<\u000b", "@dV6f;>`v\t\u0004m,\u0006\u0018\u0019b\u000e(\tQ\u0001$", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\u0006I\u0010\u0017 VY\u000bJv2FY\u000bu", "@dV6f;>`wz\nZ\u001a|\u0018\u0019b\u000e(\tQ\u0001$", "\u001a`]1e6BRb}vm(y\u0005=eI\u0007wO|\u0005\u0017VY\u000bJv2FY\u000bu", "@d`BX9R", "@db=b5=", "Adc\u0012k;KO'", "3wc?T:", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\u001fr\u0004", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001 &4o\u001cF}65fS", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\u001fr\u00046", "1q", "CqX@", "Cma2Z0Lb\u0019\fXh5\f\t8ti%\n@\u000e(\u0017T", "Cma2Z0Lb\u0019\fYZ;xv/ti%\n@\u000e(\u0017T", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class KeepAliveCursor implements Cursor {
        private final AutoCloser autoCloser;
        private final Cursor delegate;

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
            this.delegate.copyStringToBuffer(i2, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
        @InterfaceC1492Gx
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i2) {
            return this.delegate.getBlob(i2);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.delegate.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.delegate.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i2) {
            return this.delegate.getColumnName(i2);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i2) {
            return this.delegate.getDouble(i2);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i2) {
            return this.delegate.getFloat(i2);
        }

        @Override // android.database.Cursor
        public int getInt(int i2) {
            return this.delegate.getInt(i2);
        }

        @Override // android.database.Cursor
        public long getLong(int i2) {
            return this.delegate.getLong(i2);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i2) {
            return this.delegate.getShort(i2);
        }

        @Override // android.database.Cursor
        public String getString(int i2) {
            return this.delegate.getString(i2);
        }

        @Override // android.database.Cursor
        public int getType(int i2) {
            return this.delegate.getType(i2);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i2) {
            return this.delegate.isNull(i2);
        }

        @Override // android.database.Cursor
        public boolean move(int i2) {
            return this.delegate.move(i2);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i2) {
            return this.delegate.moveToPosition(i2);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.delegate.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
        @InterfaceC1492Gx
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.delegate.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.delegate.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.delegate.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.unregisterDataSetObserver(dataSetObserver);
        }

        public KeepAliveCursor(Cursor delegate, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            SupportSQLiteCompat.Api29Impl.setNotificationUris(this.delegate, cr, uris);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return SupportSQLiteCompat.Api19Impl.getNotificationUri(this.delegate);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return SupportSQLiteCompat.Api29Impl.getNotificationUris(this.delegate);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            SupportSQLiteCompat.Api23Impl.setExtras(this.delegate, extras);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4\u0012}\u0007njO0LeV\u008cZS@\u000fsڔ<$i$yّCU(\u0004*ޛWNuwvϺb\u000bQ\u0013\u000eǝ\u0001j:P]xc\u001b\u00172XoG3StC9vҚf\u0005N1bK\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsĐV\r[\tb(\u0014G8\u0001Lf\u0018RDS\u0005]h;S\u0007wOf'\u000e>CaU\\b6%v\u0010([DE@-%\u0002\u000f7ViL\u001b? MK|o=9Z\fWdb0\u0018#6g\r\f~V`\u0013^x\fU=\u0016w\u0014^\u001c;\u0010z*\u0017l\b\u001c\u0011?H\\9`zP$A\t\u000bSnZ2bP\u000b\u0013ad#U\u0004A8Q\u001b\u0015R(OaTE\u0011\u001d\rL-G\u0003iab$x\u0015I^>ey_NT`N8cmq\u0012\tz\u0002X\u0003vGH5\n*F\u0017SA\"Mk'y\u001c`D\u0016\tKt1xwm`@h\u000b690\u009e\u001avtt\u0013\th`h.!MJS\u0017\u007f\u0018\u0013fx&Zg%ŎROv\t3Sk*=/\u0015C \u00034&eZv3c[\u0014\u0014ot\u000f\u0014mH\u0013\u000bfsZU\"Y\u000b/h2\u0011p\u001e\u001b\u0014D|\u001eYF\by*XD3/[CII2\u0013M\u000b\u000bwZ\u0017\u0013Uԡ5ʗ\u0007i,ڏY!^a\t\u0004w|Y.\u0013_P4oW\u001e!6Y2jJ{Q\u000e]{Vûi֙KLtֵFa\n .\u001agR\u0006ˎ\u0015ä\u0003):ĈθIq"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u001bPqzF\u0001-\u001fd})\u001am\u001d9MPyGD-\u001fFhC\u0015g5Pd7RWX9k@~D\u0018!Z{]'\u001c\u0005aA-}\u001a", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "Ap[", "", "/tc<63Ha\u0019\f", "\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u0017TE", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@2?c\u0006i\u0013}%8+JEy4+j,R", "0h]1f", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "0h]153HP", "", "7mS2k", "", "D`[BX", "", "0h]176NP ~", "", "0h]1?6GU", "", "0h]1A<EZ", "0h]1F;KW\"\u0001", "1kT.e\tB\\\u0018\u0003\u0004`:", "1k^@X", "2n16a+L", "At_=b9MA\u0005e~m,j\u0018+t\u007f0{I\u0010", "3wT0h;>", "3wT0h;>7\"\rzk;", "3wT0h;>A%\u0006~m,j\u0018+t\u007f0{I\u0010\t\u001bVrz<w\u0003?i\u0007/", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "3wT0h;>C$}vm,[\t6e\u000f(", "A`e250GR'", "0h]1<5=S,", "Ah\\=_,*c\u0019\f\u000f?6\no9n\u0002", "Ah\\=_,*c\u0019\f\u000f?6\nv>r\u00041}", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {
        private final AutoCloser autoCloser;
        private final ArrayList<Object> binds;
        private final String sql;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public AutoClosingSupportSqliteStatement(String sql, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.binds = new ArrayList<>();
        }

        private final <T> T executeSqliteStatementWithRefCount(final Function1<? super SupportSQLiteStatement, ? extends T> function1) {
            return (T) this.autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, T>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final T invoke(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    SupportSQLiteStatement supportSQLiteStatementCompileStatement = db.compileStatement(this.this$0.sql);
                    this.this$0.doBinds(supportSQLiteStatementCompileStatement);
                    return function1.invoke(supportSQLiteStatementCompileStatement);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void doBinds(SupportSQLiteStatement supportSQLiteStatement) {
            Iterator<T> it = this.binds.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.binds.get(i2);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i3);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.bindLong(i3, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.bindDouble(i3, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.bindString(i3, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i3, (byte[]) obj);
                }
                i2 = i3;
            }
        }

        private final void saveBinds(int i2, Object obj) {
            int size;
            int i3 = i2 - 1;
            if (i3 >= this.binds.size() && (size = this.binds.size()) <= i3) {
                while (true) {
                    this.binds.add(null);
                    if (size == i3) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i3, obj);
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public void execute() {
            executeSqliteStatementWithRefCount(new Function1<SupportSQLiteStatement, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteStatement statement) {
                    Intrinsics.checkNotNullParameter(statement, "statement");
                    statement.execute();
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((Number) executeSqliteStatementWithRefCount(new Function1<SupportSQLiteStatement, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1
                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(SupportSQLiteStatement obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Integer.valueOf(obj.executeUpdateDelete());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long executeInsert() {
            return ((Number) executeSqliteStatementWithRefCount(new Function1<SupportSQLiteStatement, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1
                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(SupportSQLiteStatement obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Long.valueOf(obj.executeInsert());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long simpleQueryForLong() {
            return ((Number) executeSqliteStatementWithRefCount(new Function1<SupportSQLiteStatement, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1
                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(SupportSQLiteStatement obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return Long.valueOf(obj.simpleQueryForLong());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public String simpleQueryForString() {
            return (String) executeSqliteStatementWithRefCount(new Function1<SupportSQLiteStatement, String>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForString$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(SupportSQLiteStatement obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.simpleQueryForString();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindNull(int i2) {
            saveBinds(i2, null);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindLong(int i2, long j2) {
            saveBinds(i2, Long.valueOf(j2));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindDouble(int i2, double d2) {
            saveBinds(i2, Double.valueOf(d2));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindString(int i2, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            saveBinds(i2, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindBlob(int i2, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            saveBinds(i2, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void clearBindings() {
            this.binds.clear();
        }
    }
}
