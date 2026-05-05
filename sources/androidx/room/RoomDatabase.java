package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

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
/* JADX INFO: compiled from: RoomDatabase.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŋ\u0014D57\u001eq\u007fR܀kt\nA\u000e0\u00197Jչ*,(w\u000f߿r9>gmHDR[*%k\u00044*_,qQG]\u001a\u0004\"\u0011OdgoñRZ!C\u0017\u0006\u001cxr,_U\u0001]\u0018\u0017:B}];M\u0006=A`z6\r H\"@y\u000b\u0007\"*^\u0010~ٙKK\"\u00128@~@Z\rS\n\"\u0012\u0014>(\u0001$_oNLHt]@1+\u0003\u007fBV'e0\u0005M#F\\'\u001b\u0019iӜ3@M5\u001d%Y\u0003\u000fRi_\u000b?wH\rh='3I\nW>ݙ\b\u0014++WՕer4k\rQf\r/+ecSִ\u0016(\u000ez\u0004\rB\u000f\u0014*=ΞL\u001dJf6\rky`B0AsQ6@}ˋ:\u00173\u007f{1GT~Q\u0010u_c\u007f\u0002\u0013H6#/)gp\u001d\u0014nQ3T&\fwf\tCV\f\"Yk(J\u0016+\b8BHG.iB%v%3vs9Qa\u001c\u0006V\u0006\u007fv3o/g2XV\u0003:nDNp+ThR(\u001dk~f\t0\u001f\u00124T5CN5hb\u0006\u00039%>\t\u0016}2\u0013[%\"+?hGY\u001d4<yivA>iw kb~$CBa\u0015X\u0015J\u0002\u0013j^8\"`P\u0019Y>\u0011\rY\u001a]J? gzι֞\u001d\\\u001b\u0015K2P\u000f\u0015\u0017odx\u0018\u000fX9#\u0013iR|7\b~+7\u00050\u0019W{\u0015z23QUE\u0019,VPoD\t3\u0011\u000fy\u0010KwLMM\u001b\u001d$w*i\\-\u0002r=\u000e+\u0011\u0015(xSMGRǩs#}\u001c5M\u0015\u007f\u001f=x..Y\u0019wrtʧNObjj|lG;\b\u0013\u0002@u\u000f\tU9l\u000b\nxyv\u00110TNfBK4f+\u000fG:|cg\n'e\u001c\u0006lG\u0015\u0010\u00180ov\bph>t\u0014>\\g$JzQ\fX\u0002J\u0012s\r\u001a:$\u001b_rLxS B7\u0012=;NArOn:c\n]]-\u001ct4~2s:AL.8<;Bsq\rDnQ\u0006)Ycmsl[^!I=\t!z_PX0ݞ$VeEQ>\u0014W06ou\u0013\tJm<4Z\"N\u001f\fswi(zF-\u007f\u0011\u001dϨPZk`\u001c9\u0011bfJ\u0015`\fGO\u0012G\u0013ܓ7\u001e\u0007\u001ey\u000b{0l/\u0012lGhe2)Ug\u0001|$q\u0016t;!ιfR;Ok/a\bF\u0006W)4=\u001e\u0013h\u001c\u000bEZ\u0018IK\u0018\u0011چz0lw&p\\e\u000f\u0012\u0015T%à5Ή~|\u0016ڳZ\u001d\u0019\u001cgt\u0006a[P%ߚCƴ\u001e\u0001\u001f\u05edyS\u001a\u0006{Z+7\u0016==AOi$'*_\u0002B\u000e\n0 U\f#'\ro\u001ck\"q+D&y&f\b\b#PN\f\\Q\u0005t\u001a.6>}\biEQ\"0Ś\u0004̝D33ˊ\u001eDQr\u0007\u0015\u0004nizc\u0018S\u0004?d\u0012z=R-\tU\\>\u0015hZh\u0010\u0002&\u000fV\u05ca\u0018\u001b.˿N\nh9\u001eZ4t~|g[;=\u0006շVՀ50ZʴN+\b\t\u001c*\u0003<k͊\u0003؉Bd\u0011Ϟ=Ne#vjVxK׆Uِ\u0001~P՝a%B\\\u000b\u001e\u0013F\u000eض!˝\u0011MhԂ\u001cGO>/J#Q)QJ\u000b\u001e*-OY̍d߰\u0004.Z\u000bx\u001buH}^bZ2'\b&$9YΐMԺ<L\u0018.\u0017,\u001f/r:&[j6lP_RY\u0019?\u0003K}۰s\u0011)7pqa%B\u0003\u0003 \u001b[JOy[\f?\u0003%?\u000f\u001e>meiGkg\u000b)b֑qڧ\u0003SkǾ\u001fc2mCEn\u0012ce\u0018\f5#R,,%>G\b\u06006ن`F^؛g\u0006,QDn\u00155U\u0015\u0011s8> lJ\u0080]Ɉ8E\u0013\u0016\u001fmLT}~\u0015peh(\u001fza\u001cƀ9ʷ\n-K\u0019\u0003<]\u001f\u00117W!e/\u000b\r\u0013ͫu̿>2i\u058cJ^N\nB\f=\u0014dc\u0019\u001d\u001c\u0003\u0016U١\u0016\u0013\u0015Խ\u00103X\u0014\u000e\u0015m*5\u0001\u000fFdp/\"\u0018Ǫ\rڝ\u0013(v0HB\u00193fJVN\u001a\u000eZf%\u0017CGyBu\u0019f}1\u001d?ZS\f{٣lߒCUyة\u000eEAC\u0006J\u00077<ڧ\u0011Ȝ%KlƓ܋\u0004_"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012", "", "u(E", "/k[<j\u0014:W\"m}k,x\b\u001bu\u007f5\u007f@\u000f", "", "/tc<63Ha\u0019\f", "\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u0017TE", "\nrTA \u0006\u0017", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,H\bh6\u0005R7i\u00025wO\u0005! \u0011K\u001eK\u0001\r9[\u000b\u001cFq 7;N;i\n", "/tc<@0@`\u0015\u000e~h5j\u0014/c\u000e", "5dc\u000eh;H;\u001d\u0001\bZ;\u0001\u00138S\u000b(yN", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc\u000eh;H;\u001d\u0001\bZ;\u0001\u00138S\u000b(yN", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "0`R8\\5@4\u001d~\u0002]\u0014x\u0014", "", "5dc\u000fT*DW\"\u0001[b,\u0004\b\u0017a\u000b", "7mc2e5:Z\u0003\nzg\u000f|\u0010:e\r", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkAs", "7mc2e5:Z\u0005\u000fzk@\\\u001c/c\u00107\u0006M", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "7mc2e5:Z\b\fvg:x\u0007>i\n1[S\u0001\u0015'Vy\u001b", "7me._0=O(\u0003\u0005g\u001b\n\u0005-k\u007f5", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-\r", "5dc\u0016a=:Z\u001d}vm0\u0007\u0012\u001er{&\u0002@\u000e", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/c1\r<\b\u001b\u0016C~\u0012F\u007f\u0014BU{&7zk", "7r<.\\5-V&~v]", "7r<.\\5-V&~v]j\n\u00139my5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "u(I", "7r>=X5", "7r>=X5|O\"\b\u0005m(\f\r9n\u000e", "7r>=X5\"\\(~\bg(\u0004", "7r>=X5\"\\(~\bg(\u0004G+n\t2\u000b<\u0010\u001b!P}", ";BP9_):Q\u001f\r", "", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezT!<`z\u001c5sk", "5dc\u001a6(EZ\u0016zxd:;\u00058n\n7wO\u0005! U", ";CPAT):a\u0019", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "5dc\u001a7(MO\u0016z\t^jx\u00128o\u000f$\u000bD\u000b %", "=oT;;,E^\u0019\f", "5dc\u001cc,G6\u0019\u0006\u0006^9", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7W!.V&;r?\u001e\">", "?tT?l\fQS\u0017\u000f\nh9", "5dc\u001eh,Kgx\u0012z\\<\f\u0013<", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`'\u0003\u000e:\u00074?fS", "@dP1J9Bb\u0019e\u0005\\2", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u001bM?:]A\"$hHC\u0005i\u0002", "Atb=X5=W\"\u0001ik(\u0006\u0017+c\u000f,\u0006Id\u0016", "\u001aiPCTuEO\"\u0001DM/\n\t+df2y<\bl", "", "5dc h:IS\"}~g.k\u0016+n\u000e$yO\u0005! +n", "u(;7T=:\u001d z\u0004`uk\f<e{'bJ~\u0013\u001e\u001d", "BqP;f(<b\u001d\t\u0004>?|\u0007?t\n5", "5dc!e(Ga\u0015|\nb6\u0006hBe}8\u000bJ\u000e", "Bx_266Gd\u0019\f\n^9\u000b", "EqXAX\bAS\u0015}ah.~\r8g_1w=\b\u0017\u0016", "/rb2e;'](fvb5k\f<e{'", "", "/rb2e;'](l\u000bl7|\u0012.i\t*jM| %Cm\u001d@\u0001.", "0dV6a\u001bKO\"\rv\\;\u0001\u00138", "1kT.e\bEZ\bzwe,\u000b", "1k^@X", "1n\\=\\3>A(z\n^4|\u0012>", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "Ap[", "1qT.g,\"\\*z\u0002b+x\u00183o\t\u0017\t<~\u001d\u0017T", "1qT.g,(^\u0019\b]^3\b\t<", "1n]3\\.", "\u001a`]1e6BR,H\bh6\u0005R\u000ea\u000f$x<\u000f\u0017tQx\u000f@x5BU\r$Avk", "3mS!e(Ga\u0015|\nb6\u0006", "5dc\u000eh;H;\u001d\u0001\bZ;\u0001\u00138s", "\u001a`]1e6BR,H\bh6\u0005R7i\u00025wO\u0005! \u0011W\u0012>\u0004!D]\b)\r", "", "5dc\u0010_6LS\u007f\txd", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006]/3_S", "5dc\u0010_6LS\u007f\txdj\n\u00139my5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "5dc\u001fX8NW&~y:<\f\u0013\u0017i\u00025wO\u0005! 5z\u000e:\u0005", "", "5dc\u001fX8NW&~yM@\b\t\ro\t9{M\u0010\u0017$U", "5dc!l7>1#\b\f^9\f\t<", "\"", "9kP@f", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkbE|(\u0013\u0011v\nExn\u001fV\u0003 5|k", "7mC?T5LO\u0017\u000e~h5", "7mXA", "1n]3\\.N`\u0015\u000e~h5", "7mc2e5:Zu~|b5k\u0016+n\u000e$yO\u0005! ", "7mc2e5:Zx\byM9x\u0012=a}7\u007fJ\n", "7mc2e5:Z|\b~m\u0010\u0006\u001a+l\u0004'wO\u0005! 6|\n:|%B", "2a", "?tT?l", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B#", "AhV;T3", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "/qV@", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*7t3+\u001fl`\u0003\u0006_;Js#UL\u0018\nl_\u0001G!g", "@t]\u0016a\u001bKO\"\rv\\;\u0001\u00138", "0nSF", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "$", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Nv\n9}%\u000b", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`tCv\u00158s,5/A\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002", "Adc!e(Ga\u0015|\nb6\u0006v?c}(\nN\u0002'\u001e", "Cmf?T7(^\u0019\b]^3\b\t<", "1kPGm", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fwI\u007f$!Kn!\u0006\u00051<]\r \u0001l\u0013w;SFv>+$VM \u000br,8\u0002'P/N3gR\u007f\u0013Wx_\n_'V\fUJ&8.4$\b*XW", "\u0010tX9W,K", "\u0011`[9U(<Y", "\u0011n\\=T5B]\"", "\u0018nd?a(E;#}z", "\u001bhV?T;B]\"\\\u0005g;x\r8e\r", "\u001eqT=T*DO\u001b~y=(\f\u0005,a\u000e(Y<\b\u001e\u0014Cm\u0014", "\u001ftT?l\n:Z {v\\2", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class RoomDatabase {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AutoCloser autoCloser;
    private final Map<String, Object> backingFieldMap;
    private SupportSQLiteOpenHelper internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<? extends Callback> mCallbacks;
    protected volatile SupportSQLiteDatabase mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final InvalidationTracker invalidationTracker = createInvalidationTracker();
    private Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lk?TZ͜x.\u0001Rj\u0012ө\u007f42[l\u007fQ<m\u001a,$9S\\j\u007fnx^QWW\u0014$}\u0003,wW)a \u0012JB\u001eCya8KGf\r63\"b&F|\u001d\u0001H.\u000f$͵~J"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezT!<`z\u001c5sk", "", "u(E", "=m2?X(MS", "", "2a", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "=m32f;Kc\u0017\u000e~o,d\r1r{7\u007fJ\n", "=m>=X5", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Callback {
        public void onCreate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onDestructiveMigration(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onOpen(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјl\u000fOӄtev-\u0013V֖\u0013k\n4li2r[;\u0004\u001c.&\u0017Rfg\u0016r\u0011nŸG\u0014"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000eza25dy\u001e=i\u0018.L\"7z0\u001b\u0011va\u0017\u0003j3Kr%M\"", "", "u(E", "=m>=X5)`\u0019\nv\\2x\u000b/d^$\u000b<}\u0013%G", "", "2a", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r.4ߚ\u007f\u0007t\tAӄJσߊ-hݷZ\u000f\u001az|Bi$\nCiVJ\u00020\u000bgN\u0016j\u001fVh\u000f[\u0017\u0016\u001a\tlBH\u0004w\f\u0017UVֈnЀݏMsE;f\u0014d\u0004ڼ6(ف}\u0004"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezb55f\u0012}3t\u001d+IAAA", "", "=m@BX9R", "", "Ap[\u001eh,Kg", "", "0h]149@a", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface QueryCallback {
        void onQuery(String str, List<? extends Object> list);
    }

    @Deprecated(message = "\u001aO\bA1v\u001a\u0017`P,~U#kWj\f\nf\u000b} g\tK.|S\u0001)g{Q2")
    @InterfaceC1492Gx
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated(message = "\u001aO\bA1v\u001a\u0017`P,~U#kWj\f\u001d/\n(\u001aW\u000fZ.|S\u0001)g{Q2")
    @InterfaceC1492Gx
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public abstract void clearAllTables();

    protected abstract InvalidationTracker createInvalidationTracker();

    protected abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration);

    public final Cursor query(SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public RoomDatabase() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    public InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    protected final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    protected final void setAutoMigrationSpecs(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        return lock;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public <T> T getTypeConverter(Class<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public void init(DatabaseConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends AutoMigrationSpec>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i2 = -1;
            if (it.hasNext()) {
                Class<? extends AutoMigrationSpec> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i2 = size;
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size = i3;
                        }
                    }
                }
                if (i2 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i2));
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i4 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i4 < 0) {
                            break;
                        } else {
                            size2 = i4;
                        }
                    }
                }
                Iterator<Migration> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Migration next2 = it2.next();
                    if (!configuration.migrationContainer.contains(next2.startVersion, next2.endVersion)) {
                        configuration.migrationContainer.addMigrations(next2);
                    }
                }
                SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (SQLiteCopyOpenHelper) unwrapOpenHelper(SQLiteCopyOpenHelper.class, getOpenHelper());
                if (sQLiteCopyOpenHelper != null) {
                    sQLiteCopyOpenHelper.setDatabaseConfiguration(configuration);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) unwrapOpenHelper(AutoClosingRoomOpenHelper.class, getOpenHelper());
                if (autoClosingRoomOpenHelper != null) {
                    this.autoCloser = autoClosingRoomOpenHelper.autoCloser;
                    getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.autoCloser);
                }
                boolean z2 = configuration.journalMode == JournalMode.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z2);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new TransactionExecutor(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z2;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    getInvalidationTracker().startMultiInstanceInvalidation$room_runtime_release(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i5 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i5 < 0) {
                                    break;
                                } else {
                                    size3 = i5;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i6 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i6 >= 0) {
                        size4 = i6;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    private final <T> T unwrapOpenHelper(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return (T) supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return (T) unwrapOpenHelper(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return MapsKt.emptyMap();
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return SetsKt.emptySet();
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            zIsOpen = autoCloser.isActive();
        } else {
            SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
            if (supportSQLiteDatabase == null) {
                boolValueOf = null;
                return Intrinsics.areEqual((Object) boolValueOf, (Object) true);
            }
            zIsOpen = supportSQLiteDatabase.isOpen();
        }
        boolValueOf = Boolean.valueOf(zIsOpen);
        return Intrinsics.areEqual((Object) boolValueOf, (Object) true);
    }

    public final boolean isOpenInternal() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            ReentrantReadWriteLock.WriteLock writeLock2 = writeLock;
            writeLock2.lock();
            try {
                getInvalidationTracker().stopMultiInstanceInvalidation$room_runtime_release();
                getOpenHelper().close();
            } finally {
                writeLock2.unlock();
            }
        }
    }

    public final boolean isMainThread$room_runtime_release() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Ig.wd("N\u0013z`=\u0003*r\u0012e&\"\u0013\r\u0012d9", (short) (FB.Xd() ^ 4828))).getDeclaredMethod(EO.Od("f7TP$QF\ff\u0006\t\u001c\u0014", (short) (ZN.Xd() ^ 19626)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Looper) declaredMethod.invoke(null, objArr)).getThread() == Thread.currentThread();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public Cursor query(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(query, objArr));
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    public Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().getWritableDatabase().query(query, cancellationSignal) : getOpenHelper().getWritableDatabase().query(query);
    }

    public SupportSQLiteStatement compileStatement(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    @Deprecated(message = "%K\u0003>\u007fh'XfZ)}d\u001e;\\$\u0015H0\u0018(\u0010W\u0007XsmO\t)j", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    @InterfaceC1492Gx
    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.RoomDatabase.beginTransaction.1
                AnonymousClass1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    RoomDatabase.this.internalBeginTransaction();
                    return null;
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$beginTransaction$1 */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,˛\bӵLc\u000b\u0004Iي>éFD\u0015!Z\u0011(\u000btjQ0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<SupportSQLiteDatabase, Object> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(SupportSQLiteDatabase it) {
            Intrinsics.checkNotNullParameter(it, "it");
            RoomDatabase.this.internalBeginTransaction();
            return null;
        }
    }

    public final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().syncTriggers$room_runtime_release(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    @Deprecated(message = "(T\u007f)\u0004u#jYJ<\u0004_#s\u0017\u001cU\u001cf\tm\u001cd{Io~Sx", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    @InterfaceC1492Gx
    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new Function1<SupportSQLiteDatabase, Object>() { // from class: androidx.room.RoomDatabase.endTransaction.1
                C08301() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(SupportSQLiteDatabase it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    RoomDatabase.this.internalEndTransaction();
                    return null;
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$endTransaction$1 */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,˛\bӵLc\u000b\u0004Iي>éFD\u0015!Z\u0011(\u000btjQ0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08301 extends Lambda implements Function1<SupportSQLiteDatabase, Object> {
        C08301() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(SupportSQLiteDatabase it) {
            Intrinsics.checkNotNullParameter(it, "it");
            RoomDatabase.this.internalEndTransaction();
            return null;
        }
    }

    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    @Deprecated(message = "6K\u0010)\u0004u#jYJ<\u0004_#\u001fc_O\u000e:\u0018n!^>\u000f.sa4(kx^iENpm=", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    @InterfaceC1492Gx
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public void runInTransaction(Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public <V> V runInTransaction(Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }

    public void internalInitInvalidationTracker(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        getInvalidationTracker().internalInit$room_runtime_release(db);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().inTransaction();
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eRLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.XV0Ŧj\u0012éTa4sS;\u0004ڼ,!ITTg̊rJh\u000b\f\u001d\u0014\u0017\u0011jZK\u0006|k\u0015'2ps\u00063\u0016\u0003K>xtdӌP60>\u0012\u0005/!pϺǘzzISt\u00126IY:X\u00176\u0005 \u001dĈB,"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ez[/Ef\u0007\u001c>U -M\u0019", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "7r;<j\u0019:[w~\fb*|", "", "/bc6i0Mg\u0001z\u0004Z.|\u0016", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTh\u0013 Cq\u000eIL", "@db<_=>", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@db<_=>\u0012&\t\u0005f&\n\u00198t\u00040{:\u000e\u0017\u001eGk\u001c<", "\u000fTC\u001c@\b-7v", "\"QD\u001b6\b-3", "%Q8!8&\u001a6xZYX\u0013fj\u0011Ih\n", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public final JournalMode resolve$room_runtime_release(Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, C1561oA.Yd("lyy\u0001r\u0007\u0004", (short) (C1607wl.Xd() ^ 20371)));
            if (this != AUTOMATIC) {
                return this;
            }
            Object[] objArr = {Xg.qd("+.@6D8DJ", (short) (C1607wl.Xd() ^ 30699), (short) (C1607wl.Xd() ^ 16141))};
            Method method = Class.forName(Jg.Wd("x Ay\u00104\u001a\u0001`\u00181`<_\u0013v7}e\u0017\"b\t", (short) (Od.Xd() ^ (-14405)), (short) (Od.Xd() ^ (-31083)))).getMethod(C1626yg.Ud("Z8 `jZ1FQ'\u000blS@l&", (short) (C1499aX.Xd() ^ (-31002)), (short) (C1499aX.Xd() ^ (-2558))), Class.forName(ZO.xd(">\u001bK=k?8\u0016\u0018Nd\u0012mF\u0014M", (short) (C1580rY.Xd() ^ (-13453)), (short) (C1580rY.Xd() ^ (-18330)))));
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                ActivityManager activityManager = objInvoke instanceof ActivityManager ? (ActivityManager) objInvoke : null;
                if (activityManager != null && !isLowRamDevice(activityManager)) {
                    return WRITE_AHEAD_LOGGING;
                }
                return TRUNCATE;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return SupportSQLiteCompat.Api19Impl.isLowRamDevice(activityManager);
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яĭ\u0014D57\u001eqܜLDyt\fA\u0014ֶ\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmH<^[*\u0015k\u000442d,qI;]\u001a\u0014\"\u0011ѧVguuRҙ\u0013C\u001d%\u001ex\u0001,Qǁ\u0001](\u000f:Bu?;M\u0006=Aś|6\u001b :\"Ny\rЏ\"*^\u0010~ٙKK\"\u00128ϋx:h\rUĨ\"\u0012\u0014_(\u0001,boN<Ht]P/+ɅqBd'gܞ\u0005M#F\\܋\u0015vw\u001e3@==\u001d%a\u0012\u000fRq?\u000b?wJ\rh5:3Iy`<l\u0016Ϭ=1UՕkqN\\3Q\u0011\fU,\u0010\tQִ\u001e,\u0006|\u0014\rj\u0007\u001e\u00105LF3*h\u0018\u000eiο!XPV\u0010dZ\u0002\u0011`d\u001eӾ\u000439Acz_\u0013S\u001f^9\f\u0005C̔QЧ\u001f%i\u0007&`C-\u001b\f\u001aE_sUN^\fi=$Վ\u001fç2.\u0012d_\u007f]\u0010WB_JE\u0011Q)1m\u0012Hzϙ%ݓ\u0011xa jPP&t\u0015G*7D\t{\u0005\u0005\u001a\t\u001bl¯\u0015M*\u000eO\u0012\u0016M8b\b>1%Fʚ}Ŗ\u001an[\u0019\"%]g}m7w\u001cbQdC7acFР\u0001ΘZS\u0005m\u0013\u0015~B\nێ!p͈&2V(X\f\n\u0003f\u0012#4OqRعZջI`#\b\u001b\u001epHC\u001d(vvN\u0017ZC&\u0013iZڏ7ɖ\u0001`~/\u007fxw3-d0aYQcAljj|B=;\r\u000fu\u0010G\u001eնuƂ\u001d\u001a\u0004\u0017\u0014 D1\u007fewY!O\u0017/B\u0004=E\u0003ǩ\u0014ʸ}\u00165<\u0015y=R\u00192u<\u0003pZ\t1_\u0018n%d\u000fd\u0003%\u0018d6ט\u0010¿+Qq\u0018#aNK\u0003\u0003\bV|QC\u001ag@3C\b(\r7=C]ݴDߐD9#%uo\u007f0\nb=@#~40qJ\bb\u007f\u0006xP\u0001UgCV(4n\u0013B~۳&٤\t\u001d|\u0019A\u000eYj\u0001XHMAɀ,օM@U\td\"R\u0019\u007f\u007fD.\u0016͈\"ʕ.\u001cl\u000b=\u0011{\u001c\bm\u001cn#\u001f\u0013\u001b\u0018T\u00147~\u0014,=V݈\u0006łODN\n&\u0001YAr\u0007L\tZ҉Zф8\u0011Qo\u0002\b&y.b&#_PP?S\\\u001eV\t\\\rޠ3ݺuf')\u000f\r'3L\be5\u0013y^T]px\u0016\u001c1\u0017g\u0003U\u000fh5+zǴgЉX\\\u000f(]]qgHJL[7;\u0004u\u001c:(|S\u00adFÇiU\u001f.\u000f0\r1\u001cy\u0017\u0001\u0005a~X^$9~1Մ<ڳ:\u0013\u0019Bgr\u001e\r]P\\HOCH-]Xq\u001b\u001aN{L+/\u00165c֑wݝD+\n(k;,4f4o\u0018\u0003st]\u001eh\u001a]QŭDފFf\u0010Y+PN0t^E~\u00187 6}\f\nû\u001fȨ]k\u007f˺\u001139w\u001eByrOƀoؼgn]̃St?b\u0012pCOK\u0016}Ӑ: \\ZBÎ$,f\u001f\u0018\u0014C5uߑ\u0014Ԗ-\u0010Wɪ9\u0003y_s\u0013;1{*\u0010C^ctݜ+ݺy\u00042Ĕx'IieDt\u000bllpk<oAۭfé\u0010)\u001cΙOTl\u0013+4tutҎ1ё\u001d\u001fcƬ\u0018n\u0015\u0019]K< _Y\u0016אCכ\u000fo0ϓa\u0011Hx\r\u0002@A7\nVן8\u0082JTEԣwm2\u0006|\u000b6MU8p\"B\u0010<*\u0006էDԯB\\\"ˡ\f_A\\1\u0013\u0017\u0014f\"Fޡ%ǝnQ[Ϸz\r\u000b\u001e%?(OB¢\u007f٥v#7ݩ@-ejS+Eg\\'B\u058b\u0014OU\u07baeȡ\u0013a4ݹ\u0006Q,\u0019m@.*u߾&Թy#\bӚ\u0002\\8\u0001tHfug\u0004TMLmrE\u001eؠ\u0005ݨ\u000e,qѢDvi\u0006LG\u000b\u0016)DlM[\u000f]ŸY˫}\u000bLԹ\u0016\"E4\u001e+I\u0016+6&ƃL\u0557MrUҍ-kJ\u0019\f\u0006P1\u0010=PÜBĐ.\u00065\u009a%qx\u0012\u0006Su\u000ff:cŲ\u0010ֶ5Rhٻ1+&Pcx\\5\u000b#$ڬn\u07b4D\u000f,ۋ~P\u001a6\u001e\u0018DGE.T߂lū\u00173Oؓ\u0012U \u0004\u0014#3\u0010\nQ\\Ⱥs\u0095K?]ߎ)IGa#mxb\fƹh֓Y!S\u07bd{#\u000e\u001aC0]UlF\u0001ӈ\u0012کIdPϡ\u0015\u000bRX\u00066@2`~\tD\f\u0012r\u05fe?֘\u0019e\u0007Ʈĸ;/"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezS59`| DC", "\"", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "9kP@f", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "<`\\2", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\fT?Iy\n\u0005\u001adr5Pj(Wxp5[[0eTH\u0001\u0005", "/k[<j\u000b>a(\f\u000b\\;\u0001\u001a/M\u0004*\t<\u0010\u001b!PY\u0017\u001b\u00017>[\u000b\u001c6m", "", "/k[<j\u0014:W\"m}k,x\b\u001bu\u007f5\u007f@\u000f", "/tc<63Ha\u0019m~f,l\u00123t", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "/tc<63Ha\u0019m~f,\u0007\u0019>", "", "/tc<@0@`\u0015\u000e~h5j\u0014/c\u000e", "", "\u001a`]1e6BR,H\bh6\u0005R7i\u00025wO\u0005! \u0011K\u001eK\u0001\r9[\u000b\u001cFq 7;N;i\n", "1`[9U(<Y'", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezT!<`z\u001c5sk", "1n_F99H[t\r\t^;g\u0005>h", "1n_F99H[y\u0003\u0002^", "\u001aiPCTuB]b_~e,R", "1n_F99H[|\b\u0006n;j\u0018<e{0", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Nv\n9}%\u000b", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "4`RAb9R", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\ud_H\u0011p@$", "8nd?a(E;#}z", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ez[/Ef\u0007\u001c>U -M\u0019", ";hV?T;B]\"\\\u0005g;x\r8e\r", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ez^)7fy/;w\u001f\fWLJg8'\u0015u7", ";hV?T;B]\"l\nZ9\fd8d_1z1\u0001$%Ky\u0017J", "", "", ";hV?T;B]\"\rch;i\t;u\u00045{?a$!O", ";t[A\\\u0010Ga(z\u0004\\,`\u0012@a\u0007,z<\u0010\u001b!PS\u0017Kv.D", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", ">qT=T*DO\u001b~y=(\f\u0005,a\u000e(Y<\b\u001e\u0014Cm\u0014", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000eza25dy\u001e=i\u0018.L\"7z0\u001b\u0011va\u0017\u0003j3Kr%M\"", "?tT?l\n:Z {v\\2", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezb55f\u0012}3t\u001d+IAAA", "?tT?l\n:Z {v\\2\\\u001c/c\u00107\u0006M", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "?tT?l\fQS\u0017\u000f\nh9", "@d`B\\9>;\u001d\u0001\bZ;\u0001\u00138", "BqP;f(<b\u001d\t\u0004>?|\u0007?t\n5", "Bx_266Gd\u0019\f\n^9\u000b", "/cS\u000eh;H;\u001d\u0001\bZ;\u0001\u00138S\u000b(y", "/tc<@0@`\u0015\u000e~h5j\u0014/c", "/cS\u0010T3EP\u0015|\u0001", "1`[9U(<Y", "/cS\u001a\\.KO(\u0003\u0005g:", ";hV?T;B]\"\r", "", "\u001a`]1e6BR,H\bh6\u0005R7i\u00025wO\u0005! \u0011W\u0012>\u0004!D]\b)\r", "uZ;.a+K]\u001d}\u000e(9\u0007\u00137/\b,}M|&\u001bQxW$z'BU\r$Avkq4?DjA(\u0019gt\u0003\u0014m6V@\u0014QVV\u000bXan:\u0010 ZL+;\u0011\fXA1D", "/cS!l7>1#\b\f^9\f\t<", "Bx_266Gd\u0019\f\n^9", "0tX9W", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/l2\u0006H_\u0013&Cl\nJvz", "1qT.g,\u001f`#\u0007Vl:|\u0018", "2`c.U(LSy\u0003\u0002^\u0017x\u00182", "1qT.g,\u001f`#\u0007[b3|", "2`c.U(LSy\u0003\u0002^", "1qT.g,\u001f`#\u0007^g7\r\u0018\u001dt\r(wH", "7m_Bg\u001aM`\u0019z\u0003<(\u0004\u0010+b\u0007(", "3mP/_,&c \u000e~B5\u000b\u0018+n}(_I\u0012\u0013\u001eKn\nKz/>", "4`[9U(<Y\b\tY^:\f\u0016?c\u000f,\r@h\u001b\u0019Tk\u001d@\u0001.", "4`[9U(<Y\b\tY^:\f\u0016?c\u000f,\r@h\u001b\u0019Tk\u001d@\u0001.\u0016f\b(", "AsP?g\u001d>`'\u0003\u0005g:", "", "4`[9U(<Y\b\tY^:\f\u0016?c\u000f,\r@h\u001b\u0019Tk\u001d@\u0001.\u001fb\\*Iv\u0018;IB;", "=oT;;,E^\u0019\f[Z*\f\u0013<y", "Adc\u000eh;H1 \t\t^\u001b\u0001\u0011/o\u00107", "Adc\u0017b<K\\\u0015\u0006bh+|", "Adc\u001ah3MW|\b\tm(\u0006\u0007/I\t9wG\u0005\u0016\u0013Vs\u0018Ed%Bj\u0002\u001e7Q\u001f=MLJ", "7me._0=O(\u0003\u0005g\u001a|\u0016@i}(_I\u0010\u0017 V", "Adc\u001eh,Kgvz\u0002e)x\u00075", "3wT0h;H`", "Adc\u001eh,Kgx\u0012z\\<\f\u0013<", "Adc!e(Ga\u0015|\nb6\u0006hBe}8\u000bJ\u000e", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;
        private List<AutoMigrationSpec> autoMigrationSpecs;
        private final List<Callback> callbacks;
        private final Context context;
        private String copyFromAssetPath;
        private File copyFromFile;
        private Callable<InputStream> copyFromInputStream;
        private SupportSQLiteOpenHelper.Factory factory;
        private JournalMode journalMode;
        private final Class<T> klass;
        private final MigrationContainer migrationContainer;
        private Set<Integer> migrationStartAndEndVersions;
        private Set<Integer> migrationsNotRequiredFrom;
        private Intent multiInstanceInvalidationIntent;
        private final String name;
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;
        private QueryCallback queryCallback;
        private Executor queryCallbackExecutor;
        private Executor queryExecutor;
        private boolean requireMigration;
        private Executor transactionExecutor;
        private final List<Object> typeConverters;

        public Builder(Context context, Class<T> klass, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.context = context;
            this.klass = klass;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        public Builder<T> createFromAsset(String databaseFilePath) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        public Builder<T> createFromAsset(String databaseFilePath, PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        public Builder<T> createFromFile(File databaseFile) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        public Builder<T> createFromFile(File databaseFile, PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        public Builder<T> createFromInputStream(Callable<InputStream> inputStreamCallable) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        public Builder<T> createFromInputStream(Callable<InputStream> inputStreamCallable, PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        public Builder<T> openHelperFactory(SupportSQLiteOpenHelper.Factory factory) {
            this.factory = factory;
            return this;
        }

        public Builder<T> addMigrations(Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (Migration migration : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                Intrinsics.checkNotNull(set);
                set.add(Integer.valueOf(migration.startVersion));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                Intrinsics.checkNotNull(set2);
                set2.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public Builder<T> addAutoMigrationSpec(AutoMigrationSpec autoMigrationSpec) {
            Intrinsics.checkNotNullParameter(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public Builder<T> setJournalMode(JournalMode journalMode) {
            Intrinsics.checkNotNullParameter(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        public Builder<T> setQueryExecutor(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.queryExecutor = executor;
            return this;
        }

        public Builder<T> setTransactionExecutor(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.transactionExecutor = executor;
            return this;
        }

        public Builder<T> enableMultiInstanceInvalidation() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        public Builder<T> setMultiInstanceInvalidationServiceIntent(Intent invalidationServiceIntent) {
            Intrinsics.checkNotNullParameter(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationFrom(int... startVersions) {
            Intrinsics.checkNotNullParameter(startVersions, "startVersions");
            for (int i2 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i2));
            }
            return this;
        }

        public Builder<T> addCallback(Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        public Builder<T> setQueryCallback(QueryCallback queryCallback, Executor executor) {
            Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            return this;
        }

        public Builder<T> addTypeConverter(Object typeConverter) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        public Builder<T> setAutoCloseTimeout(long j2, TimeUnit autoCloseTimeUnit) {
            Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (j2 < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0".toString());
            }
            this.autoCloseTimeout = j2;
            this.autoCloseTimeUnit = autoCloseTimeUnit;
            return this;
        }

        public T build() throws Throwable {
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            if (set != null) {
                Intrinsics.checkNotNull(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (this.migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            SQLiteCopyOpenHelperFactory queryInterceptorOpenHelperFactory = this.factory;
            if (queryInterceptorOpenHelperFactory == null) {
                queryInterceptorOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            }
            if (queryInterceptorOpenHelperFactory != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                    long j2 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    Executor executor2 = this.queryExecutor;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    queryInterceptorOpenHelperFactory = new AutoClosingRoomOpenHelperFactory(queryInterceptorOpenHelperFactory, new AutoCloser(j2, timeUnit, executor2));
                }
                String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                    if ((str == null ? 0 : 1) + (this.copyFromFile == null ? 0 : 1) + (this.copyFromInputStream != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                    }
                    queryInterceptorOpenHelperFactory = new SQLiteCopyOpenHelperFactory(this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, queryInterceptorOpenHelperFactory);
                }
            } else {
                queryInterceptorOpenHelperFactory = null;
            }
            if (queryInterceptorOpenHelperFactory == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (this.queryCallback != null) {
                Executor executor3 = this.queryCallbackExecutor;
                if (executor3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                QueryCallback queryCallback = this.queryCallback;
                if (queryCallback == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                queryInterceptorOpenHelperFactory = new QueryInterceptorOpenHelperFactory(queryInterceptorOpenHelperFactory, executor3, queryCallback);
            }
            Context context = this.context;
            String str2 = this.name;
            MigrationContainer migrationContainer = this.migrationContainer;
            List<Callback> list = this.callbacks;
            boolean z2 = this.allowMainThreadQueries;
            JournalMode journalModeResolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor4 = this.queryExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Executor executor5 = this.transactionExecutor;
            if (executor5 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, queryInterceptorOpenHelperFactory, migrationContainer, list, z2, journalModeResolve$room_runtime_release, executor4, executor5, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, (List<? extends Object>) this.typeConverters, this.autoMigrationSpecs);
            T t2 = (T) Room.getGeneratedImplementation(this.klass, "_Impl");
            t2.init(databaseConfiguration);
            return t2;
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006>.6B\r(4\u0012\u000e\u0007njO0L͜P.`S2\u000fq{<$i3yّCU(\u001c*ޛWNupvJ`\u0010K\u000f\u00145\u0001j2I]xk4\u0017˰H\u0004U\u074c}ok8!wȥ\t @\"\u0001\b\u0013\u00072*v\u0017'~QS$\u0012^E7:\u001b,[\u000e2\u00124EP\u0011,]\u007fVFLr\\J/Q\b\u0018Ln'\u000e5CaϘJT5\u0018?u,4X7c\u001cU]\u0011\bjaO\u0005Oqk\n\u00173m?\u0012\beCp\u007fB#[S\u001bl\u000b&\u000b\b\u0002d\u001a7CO\u0012N\u0019,6\t\u0013\u0004\u001d>\u0014\u000e4,^-[&\u0017\f\u001cE\rr\u0002C\u0001\u0006lU\u0018z\u00109]9Hg9M3nacK\u0019|<\u0012\u0004;*S\u000b|6sZ\u001eb%\u001b\u0003|\u007fG\u0002DK_f\n\bK\u001e\b~t\u001a*23w\u0004=\u000f).E(}[\u0002A/\u0004\u001a`Ti\u0007\u0005\u000fkcwbTP$~\u0016e-\u0019\u000ejD\u0013\n\u001ai\u0003qr%\u001e@b\b\u0016 #\"lwj$5\u001e^[xkzM\f\r51v7\bs\u001a\u0012\u0006;5ګ7Ʉg\u0010i\u05ecρ\u0018Y"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ez^)7fy/;w\u001f\fWLJg8'\u0015u7", "", "u(E", ";hV?T;B]\"\r", "", "", "\u001aiPCTuNb\u001d\u0006DM9|\t\u0017a\u000b}", "\u001a`]1e6BR,H\bh6\u0005R7i\u00025wO\u0005! \u0011W\u0012>\u0004!D]\b)\r", "/cS\u001a\\.KO(\u0003\u0005g", "", ";hV?T;B]\"", "/cS\u001a\\.KO(\u0003\u0005g:", "", "uZ;.a+K]\u001d}\u000e(9\u0007\u00137/\b,}M|&\u001bQxW$z'BU\r$Avkq>", "", "1n]AT0Ga", "", "AsP?g\u001d>`'\u0003\u0005g", "3mS#X9LW#\b", "4h]1@0@`\u0015\u000e~h5g\u0005>h", "AsP?g", "3mS", "4h]1H7&W\u001b\fvm0\u0007\u0012\u001aa\u000f+", "@dbB_;", "", "CoV?T+>", "5dc\u001a\\.KO(\u0003\u0005g:", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class MigrationContainer {
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        public void addMigrations(List<? extends Migration> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                addMigration((Migration) it.next());
            }
        }

        private final void addMigration(Migration migration) {
            int i2 = migration.startVersion;
            int i3 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i2);
            TreeMap<Integer, Migration> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            TreeMap<Integer, Migration> treeMap3 = treeMap2;
            if (treeMap3.containsKey(Integer.valueOf(i3))) {
                String str = "Overriding migration " + treeMap2.get(Integer.valueOf(i3)) + " with " + migration;
            }
            treeMap3.put(Integer.valueOf(i3), migration);
        }

        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        public List<Migration> findMigrationPath(int i2, int i3) {
            if (i2 == i3) {
                return CollectionsKt.emptyList();
            }
            return findUpMigrationPath(new ArrayList(), i3 > i2, i2, i3);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0014  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0013 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<androidx.room.migration.Migration> findUpMigrationPath(java.util.List<androidx.room.migration.Migration> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L63
                if (r9 >= r10) goto L66
            L4:
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r1 = r6.migrations
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                java.lang.Object r5 = r1.get(r0)
                java.util.TreeMap r5 = (java.util.TreeMap) r5
                r4 = 0
                if (r5 != 0) goto L14
                return r4
            L14:
                if (r8 == 0) goto L5e
                java.util.NavigableSet r0 = r5.descendingKeySet()
                java.util.Set r0 = (java.util.Set) r0
            L1c:
                java.util.Iterator r3 = r0.iterator()
            L20:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L5c
                java.lang.Object r2 = r3.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.String r0 = "targetVersion"
                if (r8 == 0) goto L50
                int r1 = r9 + 1
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                int r0 = r2.intValue()
                if (r1 > r0) goto L20
                if (r0 > r10) goto L20
            L3e:
                java.lang.Object r0 = r5.get(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r7.add(r0)
                int r9 = r2.intValue()
                r0 = 1
            L4d:
                if (r0 != 0) goto L0
                return r4
            L50:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                int r0 = r2.intValue()
                if (r10 > r0) goto L20
                if (r0 >= r9) goto L20
                goto L3e
            L5c:
                r0 = 0
                goto L4d
            L5e:
                java.util.Set r0 = r5.keySet()
                goto L1c
            L63:
                if (r9 <= r10) goto L66
                goto L4
            L66:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.MigrationContainer.findUpMigrationPath(java.util.List, boolean, int, int):java.util.List");
        }

        public final boolean contains(int i2, int i3) {
            Map<Integer, Map<Integer, Migration>> migrations = getMigrations();
            if (!migrations.containsKey(Integer.valueOf(i2))) {
                return false;
            }
            Map<Integer, Migration> mapEmptyMap = migrations.get(Integer.valueOf(i2));
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return mapEmptyMap.containsKey(Integer.valueOf(i3));
        }

        public void addMigrations(Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (Migration migration : migrations) {
                addMigration(migration);
            }
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\nB%s$ EqYpԊt\u07beSNo˧ĚN]"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000ezT/=dy);w\u001f\u0004", "", "u(E", "\u001b@G,5\u0010'2\u0013iVK\bdh\u001eEl\"Y)o", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
