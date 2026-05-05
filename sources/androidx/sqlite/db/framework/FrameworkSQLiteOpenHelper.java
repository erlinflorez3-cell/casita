package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
/* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLeV7ZS0\u0013s{J$c$wFCU0}*ޛWN}gvJ`\u000fK\u000f\u0014\u0016\u0001j2M[ތs܈-Rrom2\u0006p]Z\u00035i\u000b%B&Fy\u001d\u0001H+X\u0016\u0005|[M\"\u0011^C\u0001>`\u0011e\u0005H\u0017\u0016D&\u0001,b\u007fNdO|c@/1\u000b\u0002B|.ۢ4|[\u0016\u000fZ5)\u000faLH\u0007K}#3q\u001b\u0007\u0001xo\u0007M\u0011U\u0005\u0017.m@\u001a\u007fe>p\u007fB\u001c\u0002̀\u000fǁv&dӤ\"l\u001a+CO\u0012P'ʮ*Þ~{\u0015ɝT\u001a\u0014'`.[\u001b=ڟ\u0010\u07baxr[ó!\u0016lL\u0018|w5E(6\b\u0002ݤ\u001dƻUeS\u001bTB\n\u0011]71\u000e\u0007!\nbD!kÔƝwΦ5[X?N_\u0018keo\n\u007fp\u0012z\u0016>Z\u00185\f\u0013>\u0017SE\nMyܬmɘLDoϸUnvU\u0002T^?Pqlն,Á\u0010ZLߟU}^ip,?cR)]ù\n˙$`\u0010>'<\u001ef twpe]8,\u0006ό9֍rk\u0016ã\npANic>w\tKj͊>И\t\\~DY&htx.@c\u0003\u0010&\u0003\u001b\u008b\u0018Ʊ6?yʉ٢0T"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\"", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkAs", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<`\\2", "", "1`[9U(<Y", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rdh@\u0004_*TL", "CrT\u001bb\t:Q\u001f\u000f\u0006=0\n\t-t\n5\u0010", "", "/k[<j\u000b:b\u0015e\u0005l:f\u0012\u001ce}2\r@\u000e+", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsHlI]\rCw\u001bK6\u001e,7", "2`c.U(LS\u0002z\u0003^", "5dc\u0011T;:P\u0015\rzG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "2d[2Z(MS", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b87\\[U=\u001b\u001dZ\u001b$", "5dc\u0011X3>U\u0015\u000ez\u001d+|\u0010/g{7{", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\n\u0002$\u0013Oo F\u0004+~:\u000b\u001c?m(8ZI)W\u001b\"$hKD\u0007l\u000fN}2GY$oCWnN\u0010[a\nW-VnVF$lS\r", "5dc\u0011X3>U\u0015\u000ez", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0018$Cw\u000eN\u00012;#^-3u\u0016@WPAY \u0005\u0019wa#\u0012c51v.RL[jF]rFv\u0012a\u0019N8b", ":`iF7,ES\u001bz\n^", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "@dP1T)ESwz\nZ)x\u0017/", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "5dc\u001fX(=O\u0016\u0006z=(\f\u0005,a\u000e(", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7L\u0012=I@7y4s", "EqXAT)ESwz\nZ)x\u0017/", "5dc$e0MO\u0016\u0006z=(\f\u0005,a\u000e(", "EqXAX\bAS\u0015}ah.~\r8g_1w=\b\u0017\u0016", "1k^@X", "", "Adc$e0MSt\u0002zZ+c\u00131g\u00041} \n\u0013\u0014No\r", "3mP/_,=", "\u0011n\\=T5B]\"", "\u0012AA2Y\u000fHZ\u0018~\b", "\u001doT;;,E^\u0019\f", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SupportSQLite";
    private final boolean allowDataLossOnRecovery;
    private final SupportSQLiteOpenHelper.Callback callback;
    private final Context context;
    private final Lazy<OpenHelper> lazyDelegate;
    private final String name;
    private final boolean useNoBackupDirectory;
    private boolean writeAheadLoggingEnabled;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback) {
        this(context, str, callback, false, false, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z2) {
        this(context, str, callback, z2, false, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z2;
        this.allowDataLossOnRecovery = z3;
        this.lazyDelegate = LazyKt.lazy(new Function0<OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                if (this.this$0.name != null && this.this$0.useNoBackupDirectory) {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.context, new File(SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(this.this$0.context), this.this$0.name).getAbsolutePath(), new FrameworkSQLiteOpenHelper.DBRefHolder(null), this.this$0.callback, this.this$0.allowDataLossOnRecovery);
                } else {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(this.this$0.context, this.this$0.name, new FrameworkSQLiteOpenHelper.DBRefHolder(null), this.this$0.callback, this.this$0.allowDataLossOnRecovery);
                }
                SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, this.this$0.writeAheadLoggingEnabled);
                return openHelper;
            }
        });
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, callback, (8 & i2) != 0 ? false : z2, (i2 & 16) == 0 ? z3 : false);
    }

    private final OpenHelper getDelegate() {
        return this.lazyDelegate.getValue();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.name;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z2) {
        if (this.lazyDelegate.isInitialized()) {
            SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(getDelegate(), z2);
        }
        this.writeAheadLoggingEnabled = z2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return getDelegate().getSupportDatabase(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        return getDelegate().getSupportDatabase(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.isInitialized()) {
            getDelegate().close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<$a,yCQU\"}(\nWNugvϺb\u000bY\u000f\u000e\u0016~j4Ikxe܈\u00172XoG3StE9nz>\u0005&7(8\u0010ڎ\u001fGZH>u3Dv8?pm\u0001>`\re\u0005H\u0013\u0016D.\u00036^}MdK|aH3;\u0003\u0018G^+m6\u0015M;Md+\u001b~y\u001eYI˝9\u00153]K\r`rW\u0003m\n\u0004\u0019135Das\u0006P\t\u0004\"0CO;f;2j!i`:D[Sqih\u000eV\u0017C\n\u001b\\\u001c\u000e4Fx2;5~\b<<;r\u001cN^#vB.\u001a\u0012:%@\u00183YBaf\u001aoI;f7*\u001d=\"1$\u0007!\nsTt])b\u001ci1\u007fXmL\\(q=\u001c#7vJH\u0012U_\u007f]\u0014A2%HO[gBQo\u0010n\\g%,\u0011la\u0012jHnI5*\u007f8\u00175rD\u0013\u001d\u001cTb{D\u0011{;\u001b\u001bF&!Jtwj9U\u0014\\m\u0001i\u0019l\u000e\u000e3U~7\b\u0016\u001c\u0012eav3cx*$2a\u0005\u001cW<\u0011\u000eֽjH[ێr^.-@T;\u001f\u0006\u0002\\N:\u001a\u0558Cw$عD3\u001fi#VS-PA\u0015\t\u000e[ӳ\u0014\u0005\\՜<\u0005o3\u0003\u0019Q_jt\bg'Nض\u0001f*ΊYS;*4grtB\u0010;\u0007-\bVûi֙KLtֵFa\n5.\u001agZ\u0006ˎ\u001fä\u0003):Ĉ}QZ\t}Q{\u001b}Ϙ\tɍ\u0013;p֫Կ\f\u0019"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b87\\[U=\u001b\u001dZ\u001b$", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z45C\t @P\u00165XCHA", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<`\\2", "", "2aA2Y", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b-\tIRs \u001e\u0019Y\u000e[\u0001", "1`[9U(<Y", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rdh@\u0004_*TL", "/k[<j\u000b:b\u0015e\u0005l:f\u0012\u001ce}2\r@\u000e+", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[[\u001bJ3\r\u0017cN*8%D\u001b\u0010,[\fHnnw|\u0012DjZMV\u0019*y\u001c\u0001A6'%6LyH$Oi)d\u00195\u0004XC91\u001eu\u0018.2^:\u0011\u007fb\u0011<Qv1UW$\u0006B1M[G-I~U&\u007f'(.{~\u001d2e3\tp4\u000b1&4jZ@+\t", "5dc\u000e_3Hewz\nZ\u0013\u0007\u0017=O\t\u0015{>\u000b(\u0017T\u0004", "u(I", "5dc\u0010T3EP\u0015|\u0001", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7W!.V&;r?\u001e\"'?5\u000ej)Jt-\u001d", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "5dc\u0011U\u0019>T", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0018$Cw\u000eN\u00012;#^-3u\u0016@WPAY \u0005\u0019wa#\u0012c51v.RL[j;/_=\u0015td\u0015M+\u001aZ", ":nR8", "\u001a`]1e6BR,H\tj3\u0001\u0018//\u00107\u007fGJ\u0002$Qm\u000eJ\u0005\f?W\u0004u", ";hV?T;>R", "=oT;X+", "1k^@X", "", "5dc h7I]&\u000eYZ;x\u0006+s\u007f", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "EqXAT)ES", "5dc$e(I^\u0019}Y[", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015G]H\u0003`(\\v|", "Ap;6g,\u001dO(zwZ:|", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z458y/3j\u0012<M\u0019", "5dc$e0MO\u0016\u0006zH9i\t+d{%\u0003@_\u0013&Cl\nJv", "7m]2e\u000e>bwz\nZ)x\u0017/", "=m2<a-BU)\fz", "2a", "=m2?X(MS", "=m3<j5@`\u0015}z", "=kS#X9LW#\b", "", "<df#X9LW#\b", "=m>=X5", "=mD=Z9:R\u0019", "\u0011`[9U(<Yx\u0012x^7\f\r9n", "\u0011`[9U(<Y\u0002z\u0003^", "\u0011n\\=T5B]\"", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class OpenHelper extends SQLiteOpenHelper {
        public static final Companion Companion = new Companion(null);
        private final boolean allowDataLossOnRecovery;
        private final SupportSQLiteOpenHelper.Callback callback;
        private final Context context;
        private final DBRefHolder dbRef;
        private final ProcessLock lock;
        private boolean migrated;
        private boolean opened;

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\tGً/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOӂ\u000fI"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b87\\[U=\u001b\u001dZ\u001b\r\t\t\f`> lJ \u001b\u0010,\u001f", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001dMN\u0010B\u0015\u001f7zng>", "\u001dMN\u0010E\f\u001aBx", "\u001dMN\"C\u000e+/w^", "\u001dMN\u0011B\u001e'5\u0006ZY>", "\u001dMN\u001cC\f'", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final Context getContext() {
            return this.context;
        }

        public final DBRefHolder getDbRef() {
            return this.dbRef;
        }

        public final SupportSQLiteOpenHelper.Callback getCallback() {
            return this.callback;
        }

        public final boolean getAllowDataLossOnRecovery() {
            return this.allowDataLossOnRecovery;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OpenHelper(Context context, String str, final DBRefHolder dBRefHolder, final SupportSQLiteOpenHelper.Callback callback, boolean z2) throws Throwable {
            String string = str;
            Intrinsics.checkNotNullParameter(context, Qg.kd("\u0015 \u001e#\u0013% ", (short) (OY.Xd() ^ 17091), (short) (OY.Xd() ^ CasioType2MakernoteDirectory.TAG_FILTER)));
            Intrinsics.checkNotNullParameter(dBRefHolder, hg.Vd("}zi{{", (short) (C1580rY.Xd() ^ (-26890)), (short) (C1580rY.Xd() ^ (-6182))));
            Intrinsics.checkNotNullParameter(callback, C1561oA.ud("xu\u007f~sqry", (short) (Od.Xd() ^ (-31713))));
            super(context, string, null, callback.version, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$$ExternalSyntheticLambda0
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper._init_$lambda$0(callback, dBRefHolder, sQLiteDatabase);
                }
            });
            this.context = context;
            this.dbRef = dBRefHolder;
            this.callback = callback;
            this.allowDataLossOnRecovery = z2;
            if (string == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, C1561oA.yd("wgulpoXYFB')'njO\n\t\u0001\u0007x:<", (short) (C1607wl.Xd() ^ 12246)));
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd("/=4CA<8\u00039FFM?IP\u000b!NNUG[X", (short) (C1499aX.Xd() ^ (-17257)))).getMethod(Xg.qd("baqA`cigGmw", (short) (OY.Xd() ^ 19403), (short) (OY.Xd() ^ 21008)), new Class[0]);
            try {
                method.setAccessible(true);
                this.lock = new ProcessLock(string, (File) method.invoke(context, objArr), false);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(SupportSQLiteOpenHelper.Callback callback, DBRefHolder dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            Companion companion = Companion;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.onCorruption(companion.getWrappedDb(dbRef, dbObj));
        }

        public final SupportSQLiteDatabase getSupportDatabase(boolean z2) {
            try {
                this.lock.lock((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase sQLiteDatabaseInnerGetDatabase = innerGetDatabase(z2);
                if (this.migrated) {
                    close();
                    return getSupportDatabase(z2);
                }
                return getWrappedDb(sQLiteDatabaseInnerGetDatabase);
            } finally {
                this.lock.unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
        private final SQLiteDatabase innerGetDatabase(boolean z2) throws Throwable {
            boolean z3;
            String databaseName = getDatabaseName();
            boolean z4 = this.opened;
            if (databaseName != null && !z4) {
                Context context = this.context;
                Class<?> cls = Class.forName(Jg.Wd("\u0002^e\u001fMnzSV\u0016\u00027y\r\"\u0005M'9\r\r-X", (short) (ZN.Xd() ^ 18497), (short) (ZN.Xd() ^ 30005)));
                Class<?>[] clsArr = {Class.forName(ZO.xd("\u001ff@xQ'\\8e\\XAnB\u001f^", (short) (C1499aX.Xd() ^ (-3406)), (short) (C1499aX.Xd() ^ (-6064))))};
                z3 = new Object[]{databaseName};
                short sXd = (short) (FB.Xd() ^ 6499);
                short sXd2 = (short) (FB.Xd() ^ 1037);
                int[] iArr = new int["j+p~e>X!bpl\\IcY".length()];
                QB qb = new QB("j+p~e>X!bpl\\IcY");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    File parentFile = ((File) method.invoke(context, z3)).getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                        if (!parentFile.isDirectory()) {
                            String str = Ig.wd("H\u001f\u0013d.}\u0013TJl\u007f\r?BVoQ*Pg\u001cNh2}#E\u0012X{d\u000f&x\u0003\tj\n\u0016phO\u007f#)\u007fM", (short) (Od.Xd() ^ (-2452))) + parentFile;
                            EO.Od("{Xu\u0016\rT:a21d\u00165", (short) (C1580rY.Xd() ^ (-12270)));
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            try {
                z3 = z2;
                return getWritableOrReadableDatabase(z3);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return getWritableOrReadableDatabase(z3);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        Throwable cause = callbackException.getCause();
                        int i3 = WhenMappings.$EnumSwitchMapping$0[callbackException.getCallbackName().ordinal()];
                        if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th;
                    }
                    Context context2 = this.context;
                    Class<?> cls2 = Class.forName(C1561oA.Qd("lxmzvoi2fqotdlq*>igl\\ni", (short) (OY.Xd() ^ 5631)));
                    Class<?>[] clsArr2 = new Class[1];
                    short sXd3 = (short) (Od.Xd() ^ (-9729));
                    short sXd4 = (short) (Od.Xd() ^ (-10534));
                    int[] iArr2 = new int["F>T@\u000eMCQK\u00139[ZRXR".length()];
                    QB qb2 = new QB("F>T@\u000eMCQK\u00139[ZRXR");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i4)) - sXd4);
                        i4++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr2, 0, i4));
                    Object[] objArr = {databaseName};
                    short sXd5 = (short) (C1580rY.Xd() ^ (-14985));
                    int[] iArr3 = new int["||\u0003z\txVr\u0005ppn\u007fp".length()];
                    QB qb3 = new QB("||\u0003z\txVr\u0005ppn\u007fp");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(sXd5 + sXd5 + i5 + xuXd3.CK(iKK3));
                        i5++;
                    }
                    Method method2 = cls2.getMethod(new String(iArr3, 0, i5), clsArr2);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(context2, objArr);
                        try {
                            return getWritableOrReadableDatabase(z3);
                        } catch (CallbackException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                }
            }
        }

        private final SQLiteDatabase getWritableOrReadableDatabase(boolean z2) {
            if (z2) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return Companion.getWrappedDb(this.dbRef, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.onCreate(getWrappedDb(sqLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i2, int i3) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.onUpgrade(getWrappedDb(sqLiteDatabase), i2, i3);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.migrated && this.callback.version != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.onConfigure(getWrappedDb(db));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i2, int i3) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.migrated = true;
            try {
                this.callback.onDowngrade(getWrappedDb(db), i2, i3);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.migrated) {
                try {
                    this.callback.onOpen(getWrappedDb(db));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                ProcessLock.lock$default(this.lock, false, 1, null);
                super.close();
                this.dbRef.setDb(null);
                this.opened = false;
            } finally {
                this.lock.unlock();
            }
        }

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\bnj?4Je^\u008c\u0003WX\u000eT{\u0013$\u001c7\u0002GIV2}P\u000b_Ruj\u0007J\t\u000fß\u0013\u0006$};;WV\u0011]@\u0011̓FuG\u074ceqC?n{\u0007\u0017.5:8(\tWɴ,Н\u0014|\u0003ŏc\u000e\u00188NyĖV\u0017"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b87\\[U=\u001b\u001dZ\u001b\r\t\t\f`> lJ\u00172\u0006,T\u0011?r\na", "\u001aiPCTuEO\"\u0001DK<\u0006\u00183m\u007f\b\u000f>\u0001\"&Ky\u0017\u0012", "\u001aj^A_0G\u001d\u0006\u000f\u0004m0\u0005\t\u000fx}(\u0007O\u0005! \u001d", "1`[9U(<Y\u0002z\u0003^", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b87\\[U=\u001b\u001dZ\u001b\r\t\t\f`> lJ \u001b\u0010,\u001f", "1`d@X", "", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\n\u0002$\u0013Oo F\u0004+~:\u000b\u001c?m(8ZI)W\u001b\"$hKD\u0007l\u000fN}2GY\r\u0016gR{ \u0014\u0019e\u000e[ij\u0001`H!jB=\b\u00044IW\"m|\u001d\u0012W<fyD ~J\u0007\u001f\b=&oF/#j", "5dc\u0010T3EP\u0015|\u0001G(\u0005\t", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0018$Cw\u000eN\u00012;#^-3u\u0016@WPAY \u0005\u0019wa#\u0012c51v.RL[jF]rFv\u0012a\u0019N8KbUH+k@5%p(Q\u0002\u0011", "5dc\u0010T<LS", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        private static final class CallbackException extends RuntimeException {
            private final CallbackName callbackName;
            private final Throwable cause;

            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(CallbackName callbackName, Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }
        }

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u001d]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8ԸsF"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b87\\[U=\u001b\u001dZ\u001b\r\t\u0017\rd=-rN@t", "", "u(E", "5dc$e(I^\u0019}Y[", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015G]H\u0003`(\\v|", "@dU\u0015b3=S&", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b-\tIRs \u001e\u0019Y\u000e[\u0001", "Ap;6g,\u001dO(zwZ:|", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z458y/3j\u0012<M\u0019", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final FrameworkSQLiteDatabase getWrappedDb(DBRefHolder refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase db = refHolder.getDb();
                if (db != null && db.isDelegate(sqLiteDatabase)) {
                    return db;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sqLiteDatabase);
                refHolder.setDb(frameworkSQLiteDatabase);
                return frameworkSQLiteDatabase;
            }
        }
    }

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\"@6", "", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4E\u0005\"Bߚ(\u0007\u0015iy=TkV.jU@\u000e\u001a|Č([2s\u0014Uc\u001a\u0016$\u001fN|h>øVҼ\u000fO\u0017إ.zp/WY\u0019_\u0018\u0014@DŌC9"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015Rl9\u0010F,U\u0002'T\u000b-\tIRs \u001e\u0019Y\u000e[\u0001", "", "2a", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%EA\u000e\u0013\u001fG\u0002\u0018I|n\u0016fy(7\u007f ;S1'R8-\u0015G]H\u0003`(\\v|", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\n\u0002$\u0013Oo F\u0004+~:\u000b\u001c?m(8ZI)W\u001b\"$h@5\u0016_)J\u0005'\u001d\u0010?", "5dc\u0011U", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0018$Cw\u000eN\u00012;#^-3u\u0016@WPAY \u0005\u0019wa\u0018\u0003r(Kr5G\"", "Adc\u0011U", "Ap[6g,\u0006T&z\u0003^>\u0007\u00165_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class DBRefHolder {
        private FrameworkSQLiteDatabase db;

        public DBRefHolder(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }

        public final FrameworkSQLiteDatabase getDb() {
            return this.db;
        }

        public final void setDb(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }
    }
}
