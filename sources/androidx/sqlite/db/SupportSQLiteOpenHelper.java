package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4C\u0007\"B\u0012\u007f\u0007lmA0ReP.XS2\u000fy\u0005<$a&w(Q٥J}P\b\bOvw\u007f\u0013`\u0019M'\u0006D\u00041P\u0012c\u0007i*\u000f`M CAZ\b=gn;[U2@\"P{\u001b\u007fH+\u001fǜxټGO$\u00146B~=#\u001d[\t2\u00124CvӜ ֔kRNJrcH6s\u0013wJf'\u000e5S֘\u000fТX+%xg'9G̳4ՖǯS\u0007\u000fTa^1>ѥA\u0017ٓ+&"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkAs", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "2`c.U(LS\u0002z\u0003^", "", "5dc\u0011T;:P\u0015\rzG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "@dP1T)ESwz\nZ)x\u0017/", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "5dc\u001fX(=O\u0016\u0006z=(\f\u0005,a\u000e(", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7L\u0012=I@7y4s", "EqXAT)ESwz\nZ)x\u0017/", "5dc$e0MO\u0016\u0006z=(\f\u0005,a\u000e(", "1k^@X", "", "Adc$e0MSt\u0002zZ+c\u00131g\u00041} \n\u0013\u0014No\r", "3mP/_,=", "", "\u0011`[9U(<Y", "\u0011n]3\\.N`\u0015\u000e~h5", "\u0014`RAb9R", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SupportSQLiteOpenHelper extends Closeable {

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ}ҿ\u0000iOӄtev-\u001ba8\u000f\u0004{b%\f(\u007fESUH\u0001h-ӠMʴ˪nNb\rI.4\u0015ѷn0ְYw"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\ud_H\u0011p@$", "", "1qT.g,", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkAs", "1n]3\\.N`\u0015\u000e~h5", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rrj:\u000be<[r6KVW\u0002", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Factory {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z2);

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u0012\u007fјnjG<LeN.ZS@\u000fs{:+aH\bّYfJ}P\b\bMx(yZ^\u0019C'\u0006Dy̶0Icz& \u001d5Zom7}sK>xtd\u000bf2jF\b\f\u0019\u001aXL@z\tKc\f@9\u0007\u0005\u0003`\u001bW\u001d\u001a@\nn$\u000f&tg|?\u000f\u0001&H=.\u001bipRWc>\u0005e\rt]m1?\u007f,7X7c\u0019UW\u0011\u000fj[m\fouK\u0012\u0001'U,yweDp\u007fB\u0016qcUk\u00015t\u0005\u007fd<+9W{K~\u0017n\fC\u001a\u001bL\u001c\u000e4+x2;\"~\b<<%vaMh\u0002\rC0~oD/%.4q]kt_aS\u0019|82\tc̜%ъr!c٪\u05fed'"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rdh@\u0004_*TL", "", "Dda@\\6G", "", "uH\u0018#", "2d[2g,\u001dO(zwZ:|i3l\u007f", "", "4h[2A(FS", "", "=m2<a-BU)\fz", "2a", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "=m2<e9N^(\u0003\u0005g", "=m2?X(MS", "=m3<j5@`\u0015}z", "=kS#X9LW#\b", "<df#X9LW#\b", "=m>=X5", "=mD=Z9:R\u0019", "\u0011n\\=T5B]\"", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Callback {
        public static final Companion Companion = new Companion(null);
        private static final String TAG = "SupportSQLite";
        public final int version;

        public void onConfigure(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onOpen(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3);

        public Callback(int i2) {
            this.version = i2;
        }

        public void onDowngrade(SupportSQLiteDatabase db, int i2, int i3) {
            Intrinsics.checkNotNullParameter(db, "db");
            throw new SQLiteException("Can't downgrade database from version " + i2 + " to " + i3);
        }

        public void onCorruption(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            String str = "Corruption reported by sqlite on database: " + db + ".path";
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = db.getAttachedDbs();
                } finally {
                    if (attachedDbs == null) {
                        String path2 = db.getPath();
                        if (path2 != null) {
                            deleteDatabaseFile(path2);
                        }
                    } else {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                            deleteDatabaseFile((String) obj);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        }

        private final void deleteDatabaseFile(String str) {
            if (StringsKt.equals(str, ":memory:", true)) {
                return;
            }
            String str2 = str;
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.compare((int) str2.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            if (str2.subSequence(i2, length + 1).toString().length() == 0) {
                return;
            }
            String str3 = "deleting the database file: " + str;
            try {
                SupportSQLiteCompat.Api16Impl.deleteDatabase(new File(str));
            } catch (Exception e2) {
            }
        }

        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӭ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rdh@\u0004_*T5\u0005QTY(eV|Fi", "", "u(E", "\"@6", "", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLeV7ZS0\u0012\u0002ڔR/\f$ BsU$\tb:_Rug\u0007J\t\fS\u0015\u0014\u0018\u0011lBH\u0004{m\u0016\u001d6Zom8]uC9nzN\u0005N92>\u007f\u0005\u000f\"BH>}ټGK\u001a\u001b\u0001N~Bj\r{\fP\u0016\\̌\"Ә\"\\oޮ\u0007VzaR/Q\b F%ϓa݁\u0001M\u0015Ͽ%5\u001bvy\u001eYAm9kǴUΫ\u000bRcΪSO\u007f?\u001dj=&YL*[\rݡ\u0002Џ\u0019+WՕ.\u00014b\u001dQ\u000f\u0013]/&ҲMח\u0012(\u007f\u07beԱ\u0011H"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rrj:\u000be<[r6KVW\u0002", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<`\\2", "", "1`[9U(<Y", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rdh@\u0004_*TL", "CrT\u001bb\t:Q\u001f\u000f\u0006=0\n\t-t\n5\u0010", "", "/k[<j\u000b:b\u0015e\u0005l:f\u0012\u001ce}2\r@\u000e+", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M\npUXU0kR<<\u0011[H\u001eY6\u0017\u0012h/\u0010UHF\u001fq7I\u000b\u001eh\b\u0017\u0016\u001bsHlI]\rCw\u001bK6\u001e,7", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Configuration {
        public static final Companion Companion = new Companion(null);
        public final boolean allowDataLossOnRecovery;
        public final Callback callback;
        public final Context context;
        public final String name;
        public final boolean useNoBackupDirectory;

        @JvmStatic
        public static final Builder builder(Context context) {
            return Companion.builder(context);
        }

        public Configuration(Context context, String str, Callback callback, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z2;
            this.allowDataLossOnRecovery = z3;
        }

        public /* synthetic */ Configuration(Context context, String str, Callback callback, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, callback, (i2 + 8) - (8 | i2) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 16)) == 0 ? z3 : false);
        }

        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007fјnjO0L͜P.`_2\u000fq{<$q$yCAU \u00128ޛ\u007fN\u0016f/W`ŏS\u0013\u0014\u0016\u0011jZJǤ|] \u0011zP}BKM\u001eމid\u00039\u001d `&~\u000eM\u0007(4`\u0010%\u0006\n_T >E\t:\u0001҈}\t(\u0017\u001e>N\u0007dp0^DO\u0005]hǂS\twIf)u/+USZ\u001d5\u001b\u0003y\u001eY¨g9#.k\u00035V\"SSK\u007f@\u001dhU+\u0002ɡ\u007fɱ:X\bϬe9]\u0012ut<[3W7ϲ3˦ScSִ^4\u0006z\u0014\rj\u0005dͽ)ρ2-\"ǑX\u001cA{\u000bUVO0f\u0019Ș\u0007ˋ:\u0017-Į\u00047G$~Q\u0010?o\u05ceC߉\t\r&ŀѐr."}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rrj:\u000be<[r6KVWj9bvD\u0013\u0012gc", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/k[<j\u000b:b\u0015e\u0005l:f\u0012\u001ce}2\r@\u000e+", "", "1`[9U(<Y", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rdh@\u0004_*TL", "<`\\2", "", "CrT\u001bb\t:Q\u001f\u000f\u0006=0\n\t-t\n5\u0010", "0tX9W", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rrj:\u000be<[r6KVW\u0002", "<n1.V2N^w\u0003\b^*\f\u0013<y", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static class Builder {
            private boolean allowDataLossOnRecovery;
            private Callback callback;
            private final Context context;
            private String name;
            private boolean useNoBackupDirectory;

            public Builder(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.context = context;
            }

            public Configuration build() {
                String str;
                Callback callback = this.callback;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                return new Configuration(this.context, this.name, callback, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder callback(Callback callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.callback = callback;
                return this;
            }

            public Builder noBackupDirectory(boolean z2) {
                this.useNoBackupDirectory = z2;
                return this;
            }

            public Builder allowDataLossOnRecovery(boolean z2) {
                this.allowDataLossOnRecovery = z2;
                return this;
            }
        }

        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rrj:\u000be<[r6KVWj:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "0tX9W,K", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkA\\rrj:\u000be<[r6KVWj9bvD\u0013\u0012gc", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Builder builder(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new Builder(context);
            }
        }
    }
}
