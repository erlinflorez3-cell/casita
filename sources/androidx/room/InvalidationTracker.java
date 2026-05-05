package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
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
/* JADX INFO: compiled from: InvalidationTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĳ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~0;\u001aw\u0015rr96DmH<t[ճ\u0017k\nT,[:qK;[\u001a\u0006\"\u001fOVʴon`Z\u0013C\u0015\u000b\u001exx5Qǁ\u0001](\u000f:ԏw?IMwމA`\u000b6\rړ:\"Ny\r\u00010*P\u0010\rzKK\u0012\u00138@\u0007:Z\rS\u0006\"\u0012\u001c>(\u0001$^oNDNt]@5+\u0003wBV'e1\u0005M#F\\'\u0013vi\u001eA@?5\u001b)[\u0003\u001dRc?\tLy=\u001bh/'1I{WLX\b\u0014\u001b9U!söD@5Q\u000f\u000b_.3H17uh\u0019\u0001\u0011\u001d@\u0012\u000e\u001e'v/=*t\n&;\u0005vY?`\u0002\rF.}\u00026E)ő7+G '&g@)RE{\u001d\rL$\u0011~/al\u001ap\u0017+T&UASP=vR8`M\t\u0012xz\u0019:\u0006@G.3\f\u001e>\"59k9Q%\u001a\u000bҩHg|\u000f\u000focy`JX*~\u001a=)\u0019\f\tH\u0013\b\fP\u0003\\¯\u0015M*_O\f\u0016I8\\&sQ)\u001e\u0007gh\u0018\u000b\u0014rR3= OY\u001d#>[G\u0017K5\u007f\u0004Vv\u001b.\"yTh\u0015ZvB\u001aH\t\u0018H$8ʋxL(\bRP$\u001bBCw\u001bD,_\u001d\u000b\u0018x\u000f,\u007fY\u0005\u0019cjj&}\u001boRA09ڲ\r\u0001^\u001c9/u3a2\rb2-\b\u000ecTFW(ֻB9S\u0013\ru\u0018OwPMK|\u0016$Y*#F\u001eG\u0012G=A&/5@?EM\\vuSc\u0011m7+8UPÿ2g\u0016,97n-bO\u0003.hԮ݈v#\u000e(H\ro\u000b\u0013G\u0012\f;_LI\u000b\u0003\b\u0002\u0015˻٫\t\u001f$kI\u000f0DM-q^M&\u0006\\G\u001dqaon>y\u0011\u0013Tw\u0006\u0004Zg\\t͈U]@\u0005\u0001OgIV\"R$IB\u0011p\u0006SZ\tbDy\\\nj~#PM9fD{O:\u001b>n[hJ \u0002Bfw*\"cD)'f3_e[wqsJl\u000bx\u00138\u000e,=|a4E0Z]a\u001904wF9\b;ك\t<\u0017t|?JY#C\u0003!6\u0014\t\f^_=$x߿Ǡ?V\u0014'A\u007fd\u001c\u001d`s\u0018Q.\u000fS'3LNe5\u0013D^T]gb\u0005at!\u001b\u0019(Eܺު/DZ\u0013c>f[#E\fzy\u0006D__)\u001c1 \u0010Ft\u0015\u001dpFa9\u001a\u001cmTH^9\r+̯Щz\u0012l1\u001787^\u0013|<s:\u0013\u0019tgr\u001e(]P\\TOCH/]Dq\u0012\u001a]{FIdLזϦAIpuo\u000fe4S}6WP+\u0012t9\\\u0006S-Ŋܤ\u001f:\u001cS^\u0006\u0010k+X0\b4I\u0005r8269\u007f\u000eA\u0004+fio} P'Yp4E\u0012hǰ\u000ecz4?c\u0019\u000f~3lx\u001d:'ɂ\u0015ߓQ.\u001b̽+T\u001fa8Z'~B$|̀Bʭf5\u0018˖{jv{]l--5}8t\u0002B`\u001e\u0016\u001f(vZ՟VӲ\u0019A^צVf\u000fpzW(\u001al\u0001@d##\u007fذ\t۫L^\u0019ӂ\u0005R\u00016|/e2uʽ\u000fӴd\u0007\fـ\u001a4/KjA16`&FČ\u0003\u05ce\u0007:jߍP6P%\u000b\u007f\u0016I\u0004øVٗ\u001e'aݾ>\u0005\u0011DcQHD\u0018,?.!1j8N_\u000b9Rԝ(߄C˵\u0015\u0007\u001dƉ\u001eq\r;C\u000e\"g3N\u0019|/2u?\bˑ<ތ;x+˄'q!}tbuIst?\f0\u000f\u0001\u0003$ޗXւe2QʿU \u007f\u007fN+Z72*\u001e\u00023\u0002U1v.o^PV\"[2-\u0001ޢp\u07b2'GtԭD\u0016:\u00160s\u0013Z8ŭC˒\u0018\u0019LëzKz4]Yx{\u001bD;I$9\u001f\u0006WaE\u0004fނŝ/OzىG^ck!$TV@\u0013N\u0002WD_)\u0016-@X\u0012mA҄S̼\u0014@\u001a\r\u001b8\u00103X\u0013\u000e\u0014m$5\u0001\u000fFd[O\u0093CǶ\u000f@\u0017ě/QP\u0014#\u001d&0X\u00170\u0002Zm%\u001eCI\u0004Au\u0016\u0005\u0005ؗ!\u0011a/4,>߶IˇYq`\u05ed٣7s"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-\r", "", "2`c.U(LS", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012", "B`Q9X\u0015:[\u0019\r", "", "", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xR\n2\u0004\u001f|&\u0013Dk\u001c<L\u001b\u001c^y137\u001d*VE\u0005YC+\u0019qc\u000fJT", "AgP1b>-O\u0016\u0006zl\u0014x\u0014", "", "DhTDG(;Z\u0019\r", "", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xR\n2\u0004\u001f|&\u0013Dk\u001c<L\f:U\u000f\u001c\u0001}%2T\r#g?s{m]J\u0003-<]z.\u00114J72HYB\u0010#VWU'\u0016\u0007#/3{H@!]o:", "/tc<63Ha\u0019\f", "\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u0017TE", "1kT.a<IA(z\n^4|\u0012>", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000eFi%.UCDz\n", "5dc\u0010_,:\\)\nhm(\f\t7e\t7:M\u000b!\u001fA|\u001eE\u0006)=Yw-7t\u0016*[C", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7[%*\\CCk=-j", "Adc\u0010_,:\\)\nhm(\f\t7e\t7:M\u000b!\u001fA|\u001eE\u0006)=Yw-7t\u0016*[C", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\nn'\"Ry\u001bKd\u0011\u001c]\r %|\u0012=MK;tCsXY", "5dc\u0011T;:P\u0015\rz\u001d9\u0007\u00137_\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/l2\u0006H_\u0013&Cl\nJvz", "7mXA\\(EW.~y", "", "7me._0=O(\u0003\u0005g\u0013\u0001\u001a/D{7w\u001e\u000b &Cs\u0017<\u0004", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017#z658y/3K 7\\??t4+j", ";t[A\\\u0010Ga(z\u0004\\,`\u0012@a\u0007,z<\u0010\u001b!PM\u0015@v.D", "\u001a`]1e6BR,H\bh6\u0005R\u0017u\u00077\u007f$\n%&Cx\f<Z.FU\u0005$6i%2WL\u0019r8\u001e\u001ew7", "=ab2e=>R\bzwe,k\u0016+c\u0006(\t", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLk3\r\u0011eh9up(L|'T\"", "=ab2e=>`\u0001z\u0006", "\u001a`]1e6BR,Hvk*\u007fR-o\r(ED\n&\u0017Tx\nC@\u00131Z}\u0004Fm#*JJ;S0)j", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLkAs", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLkA\u0010\"dlD\u0007p\u0002", "5dc\u001cU:>`*~\bF(\bG<o\n0uM\u0011 &Kw\u000e6\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e((\n\u00072/}2\t@J\u001b Vo\u001bEr,~Gy!7Q%.Z?8r4\u0006\u0011s7", ">d]1\\5@@\u0019\u007f\b^:\u007f", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "5dc\u001dX5=W\"\u0001g^-\n\t=h", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u000bWMBk0'j", "@dU?X:A@)\b\u0004Z)\u0004\t", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "5dc\u001fX-KS'\u0002gn5\u0006\u0005,l\u007ffwI\n!&C~\u0012F\u007f3", "u(E", "Ax]0G9BU\u001b~\bl\u0013\u0007\u00075", "B`Q9X\u0010=:#\t\u0001n7", "", "5dc!T)ES|}ah6\u0003\u0019:$\r2\u0006Hz$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "u(;7T=:\u001d)\u000e~eud\u0005:;", "B`Q9X:'O!~\t", "5dc!T)ES'gvf,\u000bG<o\n0uM\u0011 &Kw\u000e6\u0004%<Yy.7", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "BqP0^,K:#|\u0001", "/cS\u001cU:>`*~\b", "", "=ab2e=>`", "/cS$X(D=\u0016\rzk=|\u0016", "1qT.g,%W*~YZ;x", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "\"", "1n\\=h;>4)\bxm0\u0007\u0012", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Nv\n9}%\u000b", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u001eKz,~W\b)5}#;MLJ5\u0012\u001a\u001co]6\u000ec\u0002\u0012]#PK[6`Q\u0006\u0007\u001b\u0016[\u000eL?\u000b\fY\u000b\u000brU7}\u0004;EW", "7mC?T5LO\u0017\u000e~h5", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q5g\u001c\u0013XkWL\u0006)<#{*@k&;ZCDz}{\u0011oh5\u0004j,$:\u000eCUM9fVqP]\u0019^\u000fN)!\u0003`AmUHH\u001ff(X}\u0011", "3mbBe,\"\\\u001d\u000e~Z3\u0001\u001e+t\u00042\u0005", "3mbBe,\"\\\u001d\u000e~Z3\u0001\u001e+t\u00042\u0005~\u000e!!Oi\u001bL\u007f49a}\u001aDm\u001d.IQ;", "7mc2e5:Z|\b~m", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "7mc2e5:Z|\b~mj\n\u00139my5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "<nc6Y@(P'~\bo,\n\u0017\fyn$xG\u0001\u007f\u0013Oo\u001c", "B`Q9X:", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", "=m0Bg6\u001cZ#\rz<(\u0004\u0010,a}.", "@dU?X:AD\u0019\f\tb6\u0006\u0017\u000bs\u00141y", "@dU?X:AD\u0019\f\tb6\u0006\u0017\u001dy\t&", "@d\\<i,(P'~\bo,\n", "@db<_=>D\u001d~\rl", "<`\\2f", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004v}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019", "Adc\u000eh;H1 \t\t^9", "Adc\u000eh;H1 \t\t^9;\u00169o\b\"\tP\n&\u001bOo\bIv,5U\f ", "AsP?g\u0014NZ(\u0003^g:\f\u00058c\u007f\f\u0005Q|\u001e\u001bFk\u001d@\u0001.", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<`\\2", "AdaC\\*>7\"\u000ezg;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "AsP?g\u0014NZ(\u0003^g:\f\u00058c\u007f\f\u0005Q|\u001e\u001bFk\u001d@\u0001.sf\b*?g#>VR?s4\u0018\"hh9\u0003q,", "AsP?g\u001bKO\u0017\u0005~g.k\u0005,l\u007f", "2a", "B`Q9X\u0010=", "As^=@<Eb\u001db\u0004l;x\u0012-ec1\r<\b\u001b\u0016C~\u0012F\u007f", "As^=@<Eb\u001db\u0004l;x\u0012-ec1\r<\b\u001b\u0016C~\u0012F\u007fcBc\b(1z&7\\GCk.+\u0015oa5\u0015c", "As^=G9:Q\u001f\u0003\u0004`\u001bx\u00066e", "Ax]0G9BU\u001b~\bl", "Ax]0G9BU\u001b~\blj\n\u00139my5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "D`[6W(MSt\byK,\u000b\u00136v\u007f\u0017w=\b\u0017\u007fCw\u000eJ", "\u0011n\\=T5B]\"", "\u001dab2e=>R\bzwe,k\u0016+c\u0006(\t", "\u001dab2e=>`", "\u001dab2e=>`\u000b\fvi7|\u0016", "%dP8B)LS&\u0010zk", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class InvalidationTracker {
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
    private AutoCloser autoCloser;
    private volatile SupportSQLiteStatement cleanupStatement;
    private final RoomDatabase database;
    private volatile boolean initialized;
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    private final ObservedTableTracker observedTableTracker;
    private final SafeIterableMap<Observer, ObserverWrapper> observerMap;
    private final AtomicBoolean pendingRefresh;
    public final Runnable refreshRunnable;
    private final Map<String, String> shadowTablesMap;
    private final Object syncTriggersLock;
    private final Map<String, Integer> tableIdLookup;
    private final String[] tablesNames;
    private final Object trackerLock;
    private final Map<String, Set<String>> viewTables;
    public static final Companion Companion = new Companion(null);
    private static final String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};

    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    public InvalidationTracker(RoomDatabase database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new ObservedTableTracker(tableNames.length);
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.observerMap = new SafeIterableMap<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = tableNames[i2];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i2));
            String str2 = this.shadowTablesMap.get(tableNames[i2]);
            if (str2 != null) {
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                lowerCase = str2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i2] = lowerCase2;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale US3 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US3, "US");
            String lowerCase3 = value.toLowerCase(US3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String key = entry.getKey();
                Locale US4 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US4, "US");
                String lowerCase4 = key.toLowerCase(US4);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase4, (Integer) MapsKt.getValue(map, lowerCase3));
            }
        }
        this.refreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                Set<Integer> setEmptySet;
                AutoCloser autoCloser;
                AutoCloser autoCloser2;
                Lock closeLock$room_runtime_release = this.this$0.getDatabase$room_runtime_release().getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                        try {
                        } catch (SQLiteException e2) {
                            SQLiteException sQLiteException = e2;
                            setEmptySet = SetsKt.emptySet();
                            closeLock$room_runtime_release.unlock();
                            autoCloser = this.this$0.autoCloser;
                            if (autoCloser != null) {
                            }
                        }
                    } catch (IllegalStateException e3) {
                        IllegalStateException illegalStateException = e3;
                        setEmptySet = SetsKt.emptySet();
                        closeLock$room_runtime_release.unlock();
                        autoCloser = this.this$0.autoCloser;
                        if (autoCloser != null) {
                        }
                    }
                    if (!this.this$0.ensureInitialization$room_runtime_release()) {
                        if (autoCloser2 != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (!this.this$0.getPendingRefresh().compareAndSet(true, false)) {
                        closeLock$room_runtime_release.unlock();
                        AutoCloser autoCloser3 = this.this$0.autoCloser;
                        if (autoCloser3 != null) {
                            autoCloser3.decrementCountAndScheduleClose();
                            return;
                        }
                        return;
                    }
                    if (this.this$0.getDatabase$room_runtime_release().inTransaction()) {
                        closeLock$room_runtime_release.unlock();
                        AutoCloser autoCloser4 = this.this$0.autoCloser;
                        if (autoCloser4 != null) {
                            autoCloser4.decrementCountAndScheduleClose();
                            return;
                        }
                        return;
                    }
                    SupportSQLiteDatabase writableDatabase = this.this$0.getDatabase$room_runtime_release().getOpenHelper().getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        setEmptySet = checkUpdatedTable();
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        closeLock$room_runtime_release.unlock();
                        autoCloser = this.this$0.autoCloser;
                        if (autoCloser != null) {
                            autoCloser.decrementCountAndScheduleClose();
                        }
                        if (setEmptySet.isEmpty()) {
                            return;
                        }
                        SafeIterableMap<InvalidationTracker.Observer, InvalidationTracker.ObserverWrapper> observerMap$room_runtime_release = this.this$0.getObserverMap$room_runtime_release();
                        InvalidationTracker invalidationTracker = this.this$0;
                        synchronized (observerMap$room_runtime_release) {
                            Iterator<Map.Entry<K, V>> it = invalidationTracker.getObserverMap$room_runtime_release().iterator();
                            while (it.hasNext()) {
                                ((InvalidationTracker.ObserverWrapper) ((Map.Entry) it.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(setEmptySet);
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } finally {
                    closeLock$room_runtime_release.unlock();
                    autoCloser2 = this.this$0.autoCloser;
                    if (autoCloser2 != null) {
                        autoCloser2.decrementCountAndScheduleClose();
                    }
                }
            }

            private final Set<Integer> checkUpdatedTable() throws IOException {
                InvalidationTracker invalidationTracker = this.this$0;
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                Cursor cursorQuery$default = RoomDatabase.query$default(invalidationTracker.getDatabase$room_runtime_release(), new SimpleSQLiteQuery(InvalidationTracker.SELECT_UPDATED_TABLES_SQL), null, 2, null);
                try {
                    Cursor cursor = cursorQuery$default;
                    while (cursor.moveToNext()) {
                        setCreateSetBuilder.add(Integer.valueOf(cursor.getInt(0)));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery$default, null);
                    Set<Integer> setBuild = SetsKt.build(setCreateSetBuilder);
                    if (!setBuild.isEmpty()) {
                        if (this.this$0.getCleanupStatement$room_runtime_release() == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        SupportSQLiteStatement cleanupStatement$room_runtime_release = this.this$0.getCleanupStatement$room_runtime_release();
                        if (cleanupStatement$room_runtime_release == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        cleanupStatement$room_runtime_release.executeUpdateDelete();
                    }
                    return setBuild;
                } finally {
                }
            }
        };
    }

    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.tableIdLookup;
    }

    public final String[] getTablesNames$room_runtime_release() {
        return this.tablesNames;
    }

    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    public final SupportSQLiteStatement getCleanupStatement$room_runtime_release() {
        return this.cleanupStatement;
    }

    public final void setCleanupStatement$room_runtime_release(SupportSQLiteStatement supportSQLiteStatement) {
        this.cleanupStatement = supportSQLiteStatement;
    }

    public final SafeIterableMap<Observer, ObserverWrapper> getObserverMap$room_runtime_release() {
        return this.observerMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvalidationTracker(RoomDatabase database, String... tableNames) {
        this(database, MapsKt.emptyMap(), MapsKt.emptyMap(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
    }

    public final void setAutoCloser$room_runtime_release(AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new Runnable() { // from class: androidx.room.InvalidationTracker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onAutoCloseCallback();
            }
        });
    }

    public final void internalInit$room_runtime_release(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL(CREATE_TRACKING_TABLE_SQL);
            syncTriggers$room_runtime_release(database);
            this.cleanupStatement = database.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.initialized = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.resetTriggerState();
            SupportSQLiteStatement supportSQLiteStatement = this.cleanupStatement;
            if (supportSQLiteStatement != null) {
                supportSQLiteStatement.close();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() throws Throwable {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
        this.multiInstanceInvalidationClient = null;
    }

    private final void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i2) {
        String str = this.tablesNames[i2];
        for (String str2 : TRIGGERS) {
            String str3 = "DROP TRIGGER IF EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    private final void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i2) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.tablesNames[i2];
        for (String str2 : TRIGGERS) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i2 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    public void addObserver(Observer observer) {
        ObserverWrapper observerWrapperPutIfAbsent;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] strArrResolveViews = resolveViews(observer.getTables$room_runtime_release());
        ArrayList arrayList = new ArrayList(strArrResolveViews.length);
        for (String str : strArrResolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] intArray = CollectionsKt.toIntArray(arrayList);
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, intArray, strArrResolveViews);
        synchronized (this.observerMap) {
            observerWrapperPutIfAbsent = this.observerMap.putIfAbsent(observer, observerWrapper);
        }
        if (observerWrapperPutIfAbsent == null && this.observedTableTracker.onAdded(Arrays.copyOf(intArray, intArray.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    private final String[] validateAndResolveTableNames(String[] strArr) {
        String[] strArrResolveViews = resolveViews(strArr);
        for (String str : strArrResolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return strArrResolveViews;
    }

    private final String[] resolveViews(String[] strArr) {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.viewTables;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = str.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                Intrinsics.checkNotNull(set);
                setCreateSetBuilder.addAll(set);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        return (String[]) SetsKt.build(setCreateSetBuilder).toArray(new String[0]);
    }

    public void addWeakObserver(Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    public void removeObserver(Observer observer) {
        ObserverWrapper observerWrapperRemove;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.observerMap) {
            observerWrapperRemove = this.observerMap.remove(observer);
        }
        if (observerWrapperRemove != null) {
            ObservedTableTracker observedTableTracker = this.observedTableTracker;
            int[] tableIds$room_runtime_release = observerWrapperRemove.getTableIds$room_runtime_release();
            if (observedTableTracker.onRemoved(Arrays.copyOf(tableIds$room_runtime_release, tableIds$room_runtime_release.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.database.isOpenInternal()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().getWritableDatabase();
        }
        return this.initialized;
    }

    public void refreshVersionsAsync() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.autoCloser;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    public void refreshVersionsSync() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    public final void notifyObserversByTableNames(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.observerMap) {
            Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                Observer observer = (Observer) entry.getKey();
                ObserverWrapper observerWrapper = (ObserverWrapper) entry.getValue();
                if (!observer.isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(tables);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void syncTriggers$room_runtime_release(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] tablesToSync = this.observedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        return;
                    }
                    Companion.beginTransactionInternal$room_runtime_release(database);
                    try {
                        int length = tablesToSync.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i4 = tablesToSync[i2];
                            int i5 = i3 + 1;
                            if (i4 == 1) {
                                startTrackingTable(database, i3);
                            } else if (i4 == 2) {
                                stopTrackingTable(database, i3);
                            }
                            i2++;
                            i3 = i5;
                        }
                        database.setTransactionSuccessful();
                        database.endTransaction();
                        Unit unit = Unit.INSTANCE;
                        closeLock$room_runtime_release.unlock();
                    } catch (Throwable th) {
                        database.endTransaction();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e2) {
        } catch (IllegalStateException e3) {
        }
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.database.isOpenInternal()) {
            syncTriggers$room_runtime_release(this.database.getOpenHelper().getWritableDatabase());
        }
    }

    @Deprecated(message = "\u0018Y\u0001tlw'\\Y[-fY+12]`\nnw|\u001e[\u0005Mig\u001a4&uwXiC[((\u001cG*?;\u0014bQB\u001f")
    @InterfaceC1492Gx
    public <T> LiveData<T> createLiveData(String[] tableNames, Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, computeFunction);
    }

    public <T> LiveData<T> createLiveData(String[] tableNames, boolean z2, Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return this.invalidationLiveDataContainer.create(validateAndResolveTableNames(tableNames), z2, computeFunction);
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r54ߚ\u007f\u0007tyA0RqP.XU2\u000fy\u001c<$a&yCIU\"Ԃ*\t]TogtN`ŏYƤ6\u0016'ille|k\u0012'2ppO7[qU9\u000fwF\u0011.6:@\n\t\u0007\u0019:H>|)Hƚ\u0010\u0012>G9U`\u001ce\u0005H\"6J.\u00126dwRFJ\u0003\\hAQ\u000e0ĩĚ+_6\u0010\u0016*Th?\r%qN7NLM\u001d5W\t\u0006b[m\tmv\u0004ݛص+)1_\u0002n\u0007j\u000e\u0014-+}\u000e4÷(ػ\tWhϯ?-UkYY^:\u0006\u0005\u0014\u0013L\u0006\u001e\u0006UN\\8pǔ\nԧ7tzԟ\u0011b\u0010`Z\u007f)d\rЎ'ő71Aӕ~SgG'[\b\u0012\u0013\u00116+\u0011r'Zd\u000e\u000f\u001bIYNΆ3ҨD?PN\u0018gǆq\u001c"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLkA\u0010\"dlD\u0007p\u0002", "", "=ab2e=>`", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLkAs", "B`Q9X\u0010=a", "", "B`Q9X\u0015:[\u0019\r", "", "", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xI\t9wG\u0005\u0016\u0013Vs\u0018Ee21W\u0004 D,\u007f+[CH|4+j^E/mh(_rpNHW.&@\u0002J\u0018\u001b\\c\u0012\u001c", "5dc\u001cU:>`*~\b\u001d9\u0007\u00137_\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/c1\r<\b\u001b\u0016C~\u0012F\u007f\u0014BU{&7zT\u0018JQ;xE\u001e\">", "Ah]4_,-O\u0016\u0006zL,\f", "", "5dc!T)ES|}\t\u001d9\u0007\u00137_\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "u(J\u0016", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "<nc6Y@\u001bg\bzwe,`\u0012@a\u0007,z.\u0010\u0013&W}", "", "7me._0=O(~yM(y\u0010/sc'\n", "", "<nc6Y@\u001bg\bzwe,`\u0012@a\u0007,z.\u0010\u0013&W}LI\u0001/=S\u000b0@|\u001a6M=Hk;\u001e\u0011va", "<nc6Y@\u001bg\bzwe,e\u00057e\u000e", "B`Q9X:", "<nc6Y@\u001bg\bzwe,e\u00057e\u000ef\tJ\u000b\u001f\u0011T\u007f\u0017Kz-5S\u000b >m\u0012<M", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ObserverWrapper {
        private final Observer observer;
        private final Set<String> singleTableSet;
        private final int[] tableIds;
        private final String[] tableNames;

        public ObserverWrapper(Observer observer, int[] tableIds, String[] tableNames) {
            Set<String> setEmptySet;
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            if (!(tableNames.length == 0)) {
                setEmptySet = SetsKt.setOf(tableNames[0]);
            } else {
                setEmptySet = SetsKt.emptySet();
            }
            this.singleTableSet = setEmptySet;
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final Observer getObserver$room_runtime_release() {
            return this.observer;
        }

        public final int[] getTableIds$room_runtime_release() {
            return this.tableIds;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(Set<Integer> invalidatedTablesIds) {
            Set<String> setEmptySet;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i2 = 0;
                if (length == 1) {
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                        setEmptySet = this.singleTableSet;
                    } else {
                        setEmptySet = SetsKt.emptySet();
                    }
                } else {
                    Set setCreateSetBuilder = SetsKt.createSetBuilder();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i3 = 0;
                    while (i2 < length2) {
                        int i4 = i3 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i2]))) {
                            setCreateSetBuilder.add(this.tableNames[i3]);
                        }
                        i2++;
                        i3 = i4;
                    }
                    setEmptySet = SetsKt.build(setCreateSetBuilder);
                }
            } else {
                setEmptySet = SetsKt.emptySet();
            }
            if (setEmptySet.isEmpty()) {
                return;
            }
            this.observer.onInvalidated(setEmptySet);
        }

        public final void notifyByTableNames$room_runtime_release(String[] tables) {
            Set<String> setEmptySet;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.tableNames.length;
            if (length != 0) {
                if (length != 1) {
                    Set setCreateSetBuilder = SetsKt.createSetBuilder();
                    for (String str : tables) {
                        for (String str2 : this.tableNames) {
                            if (StringsKt.equals(str2, str, true)) {
                                setCreateSetBuilder.add(str2);
                            }
                        }
                    }
                    setEmptySet = SetsKt.build(setCreateSetBuilder);
                } else {
                    int length2 = tables.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            if (StringsKt.equals(tables[i2], this.tableNames[0], true)) {
                                setEmptySet = this.singleTableSet;
                                break;
                            }
                            i2++;
                        } else {
                            setEmptySet = SetsKt.emptySet();
                            break;
                        }
                    }
                }
            } else {
                setEmptySet = SetsKt.emptySet();
            }
            if (setEmptySet.isEmpty()) {
                return;
            }
            this.observer.onInvalidated(setEmptySet);
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r14\u0012}\tnjG9LeN2ZS8\u000fs{BDcҕwgQ٥J}P\b\u0010omy~Nh\u000b[\u000f4\u0017\tz:Km\u0001m\u0016\u00151Rom4{r]9\u000fuȥ\t @&x\r\u0015\r(/`\u0018\u0007~IJ\u001c\u0012^A\u001f=ň\u0011M\u0013 Z\u001aL.\u0019\u001e\u000bv~@Vqu@?%\u0013ipOUov!\u001e\u001fT[?\r%iTy\u0017ˋ7չ)W\u001b\tXdM\r\u0010\u000eK\n\u0001/7/Org6\u0007\u0001B\u0018\u0002˾\u000fǁv.d\u0005_m$)1ZqWם\u00129"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLkAs", "", "4ha@g\u001b:P ~", "", "@dbA", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "B`Q9X:", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", "7rA2`6MS", "", "7rA2`6MSW\f\u0005h4v\u0016?n\u000f,\u0004@z$\u0017No\nJv", "u(I", "5dc!T)ES'=\bh6\u0005\u0003<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "=m8;i(EW\u0018z\n^+", "", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Observer {
        private final String[] tables;

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);

        public Observer(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.tables = tables;
        }

        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        protected Observer(String firstTable, String... rest) {
            Intrinsics.checkNotNullParameter(firstTable, "firstTable");
            Intrinsics.checkNotNullParameter(rest, "rest");
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            CollectionsKt.addAll(listCreateListBuilder, rest);
            listCreateListBuilder.add(firstTable);
            this((String[]) CollectionsKt.build(listCreateListBuilder).toArray(new String[0]));
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u001b\u007f\u0007lmA0RyP.XT2\u000fy\u000f<řc$\u007fYCU \u0001*\t]NogtJ`ŏYƤ$-)jZH\u000ewtR\u001aBF}?KM\u001e>˃dtD\u0007h:0I\u0012\u0007\u0017\u0019XVV{CSY\u001e*0ntjZ\u001b`\u001d\u001a@\u0014^ /\u001f%w\\J`l\f>_+\u0011|ZNUmP|{\u000e\u000fX5\"\u000faLA\u0011OC\u0018=S1\u000b)ÀKƄC}Eݛ\u0001)-0Wyw8^\u0007\"\u001d{^\u001bf\u000b&\u000b\u000fŌd\u0012/˃geQ[\u001c4H\u0007\n\u001aT\u0004<\u0014}Ρ0ǉ\u001ef\u0010Ԅ\u0004\u0001\u0001bXP0n\u0019Ș|ˋ:\u0017-Įĺ/Q"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLk3\r\u0011eh9up(L|'T\"", "", "B`Q9X\nHc\"\u000e", "", "uH\u0018#", "<dT1f\u001aR\\\u0017", "", "5dc\u001bX,=a\u0007\u0013\u0004\\", "u(I", "Adc\u001bX,=a\u0007\u0013\u0004\\", "uY\u0018#", "B`Q9X\u0016;a\u0019\f\f^9\u000b", "", "5dc!T)ES\u0003{\t^9\u000e\t<s", "u(J\u0017", "BqX4Z,KA(z\n^\n\u007f\u00058g\u007f6", "", "BqX4Z,KA(z\n^:", "", "5dc!T)ES'm\u0005L@\u0006\u0007", "=m01W,=", "B`Q9X\u0010=a", "=mA2`6OS\u0018", "@db2g\u001bKW\u001b\u0001zk\u001a\f\u0005>e", "", "\u0011n\\=T5B]\"", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ObservedTableTracker {
        public static final int ADD = 1;
        public static final Companion Companion = new Companion(null);
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;
        private boolean needsSync;
        private final long[] tableObservers;
        private final int[] triggerStateChanges;
        private final boolean[] triggerStates;

        public ObservedTableTracker(int i2) {
            this.tableObservers = new long[i2];
            this.triggerStates = new boolean[i2];
            this.triggerStateChanges = new int[i2];
        }

        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        public final void setNeedsSync(boolean z2) {
            this.needsSync = z2;
        }

        public final boolean onAdded(int... tableIds) {
            boolean z2;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z2 = false;
                for (int i2 : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j2 = jArr[i2];
                    jArr[i2] = 1 + j2;
                    if (j2 == 0) {
                        z2 = true;
                        this.needsSync = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            return z2;
        }

        public final boolean onRemoved(int... tableIds) {
            boolean z2;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z2 = false;
                for (int i2 : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        z2 = true;
                        this.needsSync = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            return z2;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final int[] getTablesToSync() {
            synchronized (this) {
                if (!this.needsSync) {
                    return null;
                }
                long[] jArr = this.tableObservers;
                int length = jArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    boolean z2 = jArr[i2] > 0;
                    boolean[] zArr = this.triggerStates;
                    if (z2 != zArr[i3]) {
                        this.triggerStateChanges[i3] = z2 ? 1 : 2;
                    } else {
                        this.triggerStateChanges[i3] = 0;
                    }
                    zArr[i3] = z2;
                    i2++;
                    i3 = i4;
                }
                this.needsSync = false;
                return (int[]) this.triggerStateChanges.clone();
            }
        }

        /* JADX INFO: compiled from: InvalidationTracker.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLk3\r\u0011eh9up(L|'T\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\u000fC3", "", "\u001cNN\u001cC", " D<\u001cI\f", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lmA0ReP\u008cZS8/s{B0cҕwّQ٥J}P\b\u0010awk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004wٕ\u0016\u000f@E8SAW\b=gk%@\u0013,J(H{\u0015\u0001H8v\u001d=\u000f\u0014`\u001a\u0016HF\u0001<b\r{\u0004H\u0017ĂB&\tȦtiT<Vs.I=#\u001bipOϮc6\u0005ձ%HZ/\u001b\u007fҖ\":"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-u_\u0016*S-8y4+&hn\u000f", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLkAs", "BqP0^,K", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-\r", "2d[2Z(MS", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xI\t9wG\u0005\u0016\u0013Vs\u0018Ee21W\u0004 DC|*VBHu8\u001d(2nC\u0011ku2\u007f8CSR+XavG\u001d\u0001g\nL1\r\u0012\u0018+!|DD0\b9\u001fE,", "2d[2Z(MS\u0006~{", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "5dc\u0011X3>U\u0015\u000ezK,}", "u(;7T=:\u001d z\u0004`u\n\t0/q(wFm\u0017\u0018G|\u000eEt%\u000b", "5dc!e(<Y\u0019\f", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/c1\r<\b\u001b\u0016C~\u0012F\u007f\u0014BU{&7zk", "=m8;i(EW\u0018z\n^+", "", "B`Q9X:", "", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class WeakObserver extends Observer {
        private final WeakReference<Observer> delegateRef;
        private final InvalidationTracker tracker;

        public final InvalidationTracker getTracker() {
            return this.tracker;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(InvalidationTracker tracker, Observer delegate) {
            super(delegate.getTables$room_runtime_release());
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new WeakReference<>(delegate);
        }

        public final WeakReference<Observer> getDelegateRef() {
            return this.delegateRef;
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Observer observer = this.delegateRef.get();
            if (observer == null) {
                this.tracker.removeObserver(this);
            } else {
                observer.onInvalidated(tables);
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005'4\u0012\u0006\u0016nj?1LeV.Zݷ2\u000f\u0002{<$a(w٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fN)\u0007wDI\u0004\u0007\u000e\u0016\u001dAZomC\u0014ڎެ=`zGM;@4Py3\u0003J.V#\u000fzqM<\u0016>T\t:\u0001\u000f\u0014Ĩܨ\u0016\u0006D5Q*jhf6vn4ƀ\u0002ݭ\u0007iJ÷wk>\u007fe\rtV}˜IҐ\"+Hʺ\u0006)3W\u001b\u0007\u0001]uš\u0016о\u0010ݾl-/ǢYu];f\u007fd)9U%]!(\u0013Ӥ(Ӣ^ˏ/Uk֟`\u0010.~\t{]H\u0012\u0016\u001e'v0\u0004Ղ9ڿ\u00123|Ɂ$T^\u000bvH\u0010|q6E'.=\u0002ݐ\u001dƻUcC\u0019\\BL\u0011\u001b*;\u0001\u001d#2٭`\u05ce\u0019\u001b\\ȭά5g"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uK 6X?Do>'j", "", "u(E", "\u0011Q4\u000eG\f8B\u0006ZXD\u0010ej)T[\u0005b z\u0005\u0003.", "", "\u0017ME\u000e?\u0010\u001d/\b^YX\nfo\u001fMh\"d\u001chv", " DB\u0012G&.>wZi>\u000bvw\u000bBf\bi:n\u0003}", "5dc\u001f8\u001a\u001eB\u0013ne=\bkh\u000e_n\u0004X'`\u0005\u00115[tz\u0004/?aw-Gv%2UC5x4%\u0015do9E_5W\u00016C[R6e`", "!D;\u00126\u001b8C\u0004]VM\f[\u0003\u001eA\\\u000f[.z\u0005\u0003.", "5dc 8\u0013\u001e1\bxjI\u000bXw\u000fDy\u0017W\u001dgv\u0005A]y#52?c\u0006\u001aD}\u001f=QK;eA\u001e\u001ch]G\u0007\"(W\u007f1VH]0f[\u0001", "\"@1\u00198&\"2\u0013\\dE\u001cdq)N[\u0010[", "\"Q8\u0014:\f+A", "", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "#O3\u000eG\f8Bt[a>&ed\u0017E", "0dV6a\u001bKO\"\rv\\;\u0001\u00138I\t7{M\n\u0013\u001e", "", "2`c.U(LS", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "0dV6a\u001bKO\"\rv\\;\u0001\u00138I\t7{M\n\u0013\u001e\u0006|\u0018F~\u001fBi\u0007/;u\u0016(ZCBk0,\u0015", "5dc!e0@U\u0019\fcZ4|", "B`Q9X\u0015:[\u0019", "BqX4Z,KB-\nz", "5dc!e0@U\u0019\fcZ4|G<o\n0uM\u0011 &Kw\u000e6\u0004%<Yy.7", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        private Companion() {
        }

        public final String getTriggerName$room_runtime_release(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        public final void beginTransactionInternal$room_runtime_release(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }
    }
}
