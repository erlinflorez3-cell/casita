package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.Wg;
import yg.ZN;

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
/* JADX INFO: compiled from: SupportSQLiteCompat.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\tG\u000bFé^B-!d\u0015x\tin>pIkH¯VS8\u000fӯ\u007f:"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}}Au!*\\\u0019", "", "u(E", "\u000foX})\u0010F^ ", "\u000foX},\u0010F^ ", "\u000foX~$\u0010F^ ", "\u000foX~&\u0010F^ ", "\u000foX~,\u0010F^ ", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SupportSQLiteCompat {
    private SupportSQLiteCompat() {
    }

    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RnP\u008cZS@\u000fs{:$c$\bCCU }*\teNo˧vJh\u0017KƤ\u000e\u0016\u0007y4I[xe\u0012%2JoE6UoS9ht<\u0005&ލ\"Nц5\u0001H)\t\u0015|zŲO\f 0\t~HS%M3\u001cB\nL#\u0019\u001e\u000bk\u0015;\u0011rk?G#1m\tSom>\u0003e\rt[W\u0011\u0005i6+n@{\u001ama\u0011\u0011j[m\u0005ouK\u0010\u0001'U7\u0010x Df\r,\u0015YV=a\u00011t\u0005\u007flR,s\u0017qYh\u000eV\u0007+\u007f\u001bG\u001c\u000e43x2;*~\b<D%\u0001aRh\fnH\u0006yq8-$.DYLKl_uS\u001bd6*\u0016=\"1\u0004\u0007!\nX>d#0lw\u007fG\u0018EףLN\u0018p\u0006\u0004\u0012\tz\u0002X\u0006`K\u000e:\u0014\u0011\\#U;iR;!\u001a\t\u000fI0\r\u0013z\u0001S\u0018TxD0\n.7X%<^R\u0002\u001dk~[\u001f1ҳQ:"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}}Au!*\\\u0002\u0017v8ieLiD\u000e9", "", "u(E", "1`]0X3", "", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "1qT.g,\u001cO\"|ze3x\u00183o\t\u0016\u007fB\n\u0013\u001e", "2d[2g,\u001dO(zwZ:|", "", "4h[2", "\u001aiPCTuB]b_~e,R", "2hb.U3>E&\u0003\n^\b\u007f\t+df2}B\u0005 \u0019", "AP;6g,\u001dO(zwZ:|", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z458y/3j\u0012<M\u0019", "7rF?\\;>/\u001c~v]\u0013\u0007\u000b1i\t*[I|\u0014\u001eGn", "@`f\u001eh,Kg\u000b\u0003\na\rx\u0007>o\r<", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "Ap[", "", "Ad[2V;B]\"Z\b`:", "", "3cXAG(;Z\u0019", "1ta@b9\u001fO\u0017\u000e\u0005k@", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z458y/3j\u0012<M\u0002\u0019{A,\u001fuB5\u0005r6[\u000b|", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fq\nL\b\u001b&G9{(])DY\\\u001cFi\u0013*[C\u0011R9\u001a&d+@\u0003l.\u0018d6TPW.2HYB\u0010#VWU'\u0016\u0007#/3{H@!]\u0013N}LdJ\u0013\u0012\u001774^Qc\u0014P{j\\=2gSccx\u0011KS,\b`\u0015]\u001dcA63\u0018{\"\tlR7\u0006\u0003)wn[xtqK\u0018D7 MiXBSo\u001fJ\u0001.#Z{A\u007f\u001e?x:t\f\u007fC&3`\u0013K&uNk\u0007\u001f9==%5@I'\u0015\u000fJqu=\u001br#`Q\r^D-\u0016asc\u0012l\u0017j%eB7", "Adc\u0013b9>W\u001b\b`^@Z\u00138s\u000f5wD\n&%'x\n9}%4", "3mP/_,", "Adc$e0MSt\u0002zZ+c\u00131g\u00041} \n\u0013\u0014No\r", "AP;6g,(^\u0019\b]^3\b\t<", "\u001a`]1e6BRb}vm(y\u0005=eI6\bG\u0005&\u0017\u0011]y#z45C\t @P\u00165XCHA", "3mP/_,=", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api16Impl {
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        @JvmStatic
        public static final void cancel(CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @JvmStatic
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }

        @JvmStatic
        public static final boolean deleteDatabase(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @JvmStatic
        public static final Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String str, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
            Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
            Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return cursorRawQueryWithFactory;
        }

        @JvmStatic
        public static final void setForeignKeyConstraintsEnabled(SQLiteDatabase sQLiteDatabase, boolean z2) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z2);
        }

        @JvmStatic
        public static final void disableWriteAheadLogging(SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @JvmStatic
        public static final boolean isWriteAheadLoggingEnabled(SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @JvmStatic
        public static final void setWriteAheadLoggingEnabled(SQLiteOpenHelper sQLiteOpenHelper, boolean z2) {
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z2);
        }
    }

    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜P.hS2şqۜ4:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7Xh\f[\u000f4\u0018)n:Lmx\f\u0016U7\u000b}M8eok?\u0011xD\f82P@@\nи\u001e3"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}}Au!*\\\u0002\u0017v8ihLiD\u000e9", "", "u(E", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001fr\u0004", "\u001a`]1e6BRb\bzmul\u00163;", "1ta@b9", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "7r;<j\u0019:[w~\fb*|", "", "/bc6i0Mg\u0001z\u0004Z.|\u0016", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTh\u0013 Cq\u000eIL", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api19Impl {
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        @JvmStatic
        public static final Uri getNotificationUri(Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            Intrinsics.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @JvmStatic
        public static final boolean isLowRamDevice(ActivityManager activityManager) {
            Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјl˙9FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}}Au!*\\\u0002\u0017v8j`LiD\u000e9", "", "u(E", "5dc\u001bb\t:Q\u001f\u000f\u0006?0\u0004\t=D\u00045", "\u001aiPCTuB]b_~e,R", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api21Impl {
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @JvmStatic
        public static final File getNoBackupFilesDir(Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, C1561oA.Kd("r\u007f\u007f\u0007x\r\n", (short) (ZN.Xd() ^ 23951)));
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.Zd("\tJU*:Wfc@\u0001\u0001;A\u0010*\u0007/ 6pb+K", (short) (C1607wl.Xd() ^ 22421), (short) (C1607wl.Xd() ^ 2674))).getMethod(C1561oA.Xd("%$4\u000f1\u0005%(1<8\u000f371@\u00128B", (short) (C1607wl.Xd() ^ 26783)), new Class[0]);
            try {
                method.setAccessible(true);
                File file = (File) method.invoke(context, objArr);
                Intrinsics.checkNotNullExpressionValue(file, Wg.vd("_llseyv1rtHhkt\u007f{2VZTc5[e", (short) (Od.Xd() ^ (-20902))));
                return file;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜NÔRiճ?k*3d`*qٴ?U(}j\u001f]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\ttЩ7T"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}}Au!*\\\u0002\u0017v8jbLiD\u000e9", "", "u(E", "Adc\u0012k;KO'", "", "1ta@b9", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "3wc?T:", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        @JvmStatic
        public static final void setExtras(Cursor cursor, Bundle extras) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    /* JADX INFO: compiled from: SupportSQLiteCompat.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>)6B\u0015\"4ߚ\u007f\u0007|jAӄLeV.Zݷ2\u000f\u0002{<$a$wڙ;kڼ.\"7N\u000flmnН^\u000bQ\u000fN*\u0007kDOezm\u0012=5pqo7[sU9\u000fy|\nhX0>\u0012\u0005/!ZL\u001ez\u0013Cy\u0011B4NxRR;V5& \u0010V(\u0011\"lid5vo\f<u(ɮmM"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}}Au!*\\\u0002\u0017v8jhLiD\u000e9", "", "u(E", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001fr\u00046", "", "\u001a`]1e6BRb\bzmul\u00163;", "1ta@b9", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\u001fr\u00046", "", "1q", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001 &4o\u001cF}65fS", "CqX@", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void setNotificationUris(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }

        @JvmStatic
        public static final List<Uri> getNotificationUris(Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            Intrinsics.checkNotNull(notificationUris);
            return notificationUris;
        }
    }
}
