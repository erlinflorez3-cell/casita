package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: RoomSQLiteQuery.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0016\u007f\u0007t}A0JfP.`b2\u000fy\f<$a&yCIf\"}(\tWNu{vJ`\u000bK\u000f\u0014\"\u0001j2N]xk\u0012\u00172HpG3[sEʠhtD\f(2(D\u007f\n\u0017ɝH|@v)B{\f@0xpm\u0007MZ\u000b\u001a\"\nL!\u0019\u001e\u000biߑ:Hz`\u0003E1#\u0002B|H\u00104\u000bo%F\u0003)=zoAC@eC[9\u001c\u0019\u0015vs?1`\"A\u0013\u000b?'YK$[D{\u0018\u0014CP\u0016!&\t4\u0003\u001dQ\u000f-W/]\u0006cP<*(~\n0T\u0004<-m\\v;(\u000f \u000ea\u0016#WNr\u001a^p\u0002Au~-3)K+g<\u0017Uo]1Ne}5\u0011,F\u0019nOt\u001b\")#)~\u0010Q_rpAVy\"YkmJ\u0005+\b80HG.PB%v\u001d3ds9QB2\u0016\u0011Pu%\u001d`\u0017t\u001aVVo:nDճr\u001d\u001a\u000b\\d3\r\u0001XfD)MJm7\u0002\u0016D8\\&>i)\u001e\u0001gh\u0018\f\u001ey\u0018*Gfe[\u001fo\u001c[Q^a7\u00104fз^λ\u0018EDϵ\u001dZlHa\u0013+n6*JH\u0019\u0019NӾF«\u0010\u0019:ŭ\u0002\u001e:6?$-3V\u000f6JQ\u0001\u0019apg>\r\u0003@Z\u0007@ˍv֊\u0005Xdp}w\tK2\fn-}U_61&\u0004$\u001f8SɅ\tҋw\u0006OхdIR}$|&\u0010.(29\u007fBs\u0017eȷ+ɨ\u00063Mɣ\u0003gWa 2K\u0011\b$Sh\\}>nGݢbʧNU\\ϟ2xd\n1\u00135\u000e\by^|]b\u0003$2ůU\u03a2\u0007YDѾ\t\u000f\u001396%/\tXQ\fԝEے!\u001a\u0010\u001650oy:\u000e<\u0017z\u00176xu\u0006BbD\t\u0011^\u00146\u0012ͷK˕\u0003F*$z\"RJp\u0016\u0016Mޯ8B"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0i,g\u001b&G[\u001e<\u00049\u000b", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B#", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\u000bDw\u0018;IK\u0011", "1`_.V0Mg", "", "uH\u0018#", "\nrTA \u0006\u0017", "/qV\u0010b<Gb", "5dc\u000ee.\u001c])\b\n", "u(8", "0h]1\\5@B-\nzl", "", "5dc\u000f\\5=W\"\u0001ir7|\u0017ma\t1\u0006O|&\u001bQx\u001c", "u(E", "0k^/50GR\u001d\b|l", "", "", "5dc\u000f_6;0\u001d\byb5~\u0017ma\t1\u0006O|&\u001bQx\u001c", ")Z1", "5dc\u0010T7:Q\u001d\u000e\u000f", "2nd/_,\u001bW\"}~g.\u000b", "", "5dc\u0011b<;Z\u0019[~g+\u0001\u00121s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", ":n]450GR\u001d\b|l", "", "5dc\u0019b5@0\u001d\byb5~\u0017ma\t1\u0006O|&\u001bQx\u001c", "?tT?l", "", "Ap[", "5dc d3", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Asa6a.\u001bW\"}~g.\u000b", "5dc g9B\\\u001b[~g+\u0001\u00121s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "0h]153HP", "", "7mS2k", "D`[BX", "0h]176NP ~", "", "0h]1?6GU", "", "0h]1A<EZ", "0h]1F;KW\"\u0001", "0h]1G6", "AsPAX4>\\(", "1kT.e\tB\\\u0018\u0003\u0004`:", "1k^@X", "1n_F49@c!~\u0004m:]\u00169m", "=sW2e", "7mXA", "7mXA49@1#\u000f\u0004m", "@d[2T:>", "\u0010h]1\\5@", "\u0011n\\=T5B]\"", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;
    private final int[] bindingTypes;
    public final byte[][] blobBindings;
    private final int capacity;
    public final double[] doubleBindings;
    public final long[] longBindings;
    private volatile String query;
    public final String[] stringBindings;
    public static final Companion Companion = new Companion(null);
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    /* JADX INFO: compiled from: RoomSQLiteQuery.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0i,g\u001b&G[\u001e<\u00049s6\u0002)6q\u001f0#", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Binding {
    }

    public /* synthetic */ RoomSQLiteQuery(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    @JvmStatic
    public static final RoomSQLiteQuery acquire(String str, int i2) {
        return Companion.acquire(str, i2);
    }

    @JvmStatic
    public static final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
        return Companion.copyFrom(supportSQLiteQuery);
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    public static /* synthetic */ void getLongBindings$annotations() {
    }

    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    private RoomSQLiteQuery(int i2) {
        this.capacity = i2;
        int i3 = i2 + 1;
        this.bindingTypes = new int[i3];
        this.longBindings = new long[i3];
        this.doubleBindings = new double[i3];
        this.stringBindings = new String[i3];
        this.blobBindings = new byte[i3][];
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final void init(String query, int i2) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
        this.argCount = i2;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            Companion.prunePoolLocked$room_runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.bindingTypes[i2];
            if (i3 == 1) {
                statement.bindNull(i2);
            } else if (i3 == 2) {
                statement.bindLong(i2, this.longBindings[i2]);
            } else if (i3 == 3) {
                statement.bindDouble(i2, this.doubleBindings[i2]);
            } else if (i3 == 4) {
                String str = this.stringBindings[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.bindString(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.blobBindings[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.bindBlob(i2, bArr);
            }
            if (i2 == argCount) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i2) {
        this.bindingTypes[i2] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i2, long j2) {
        this.bindingTypes[i2] = 2;
        this.longBindings[i2] = j2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i2, double d2) {
        this.bindingTypes[i2] = 3;
        this.doubleBindings[i2] = d2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[i2] = 4;
        this.stringBindings[i2] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i2, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[i2] = 5;
        this.blobBindings[i2] = value;
    }

    public final void copyArgumentsFrom(RoomSQLiteQuery other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int argCount = other.getArgCount() + 1;
        System.arraycopy(other.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(other.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        Arrays.fill(this.bindingTypes, 1);
        Arrays.fill(this.stringBindings, (Object) null);
        Arrays.fill(this.blobBindings, (Object) null);
        this.query = null;
    }

    /* JADX INFO: compiled from: RoomSQLiteQuery.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005)4\u0012\u000e\u0007njO0LeN/ZS8\u001bs{:%c$\bCC٥\"}0\tWNmgtЁ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b\u0006MBeokF\u0011xD\u001582PI*\t\u000f,BH>xAH\u0014\u001a CXph_=Q\u0013.*\u0006l5G#%r\\L`l\fQu݊ɨmBT?0<\u000bN%F\u0003)cǻ4ӿ/@?ߎe9a\u0006\u001fR\nA9CHܽWص+-3ɞ\u0004Y<\\\u000e\u0014e7]\u0012urT^[Ĭ3В++WҪ\u001c\\\u001c.\u0010z*\u000f\u0013ǌ`Ν+H6Ʀjr\u0016\u0015Kt!U\u0017ГTެF\u007f\u0003ʨ\u0007+3\bK+g\u001d\u001dU8ݪk\u05ee;\u0002\rټ.%\u0007w/[%\u001an\u001f3T&S\b҈\u0013ףLN\u0012ԯ\u000e\u000e\u0012{z\u000e:\u0006@G.1\f\u0013>\u0017SD\nEY%BȽJזk|\r\u009bxUo`V@̷r/"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0i,g\u001b&G[\u001e<\u00049s7\b(Bi\u001f2WL\u0011", "", "u(E", "\u0010K>\u000f", "", "\u0012DB\u0016E\f\u001dM\u0004hdE&jl$E", "5dc\u00118\u001a\"@x]tI\u0016fo)Sc\u001d[~|  Q~\nKz/>g", "\u0012ND\u000f?\f", "\u001aN=\u0014", "\u001cT;\u0019", "\u001eN>\u0019R\u0013\";|m", "5dc\u001dB\u0016%M\u007fbbB\u001b;\u00058n\n7wO\u0005! U", "!SA\u0016A\u000e", "?tT?l\u0017H] ", "\u001aiPCTuNb\u001d\u0006DM9|\t\u0017a\u000b}", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0i,g\u001b&G[\u001e<\u00049\u000b", "5dc\u001eh,Kg\u0004\t\u0005ejx\u00128o\u000f$\u000bD\u000b %", "/b`B\\9>", "?tT?l", "", "/qVB`,Gbv\t\u000bg;", "1n_F99H[", "At_=b9MA\u0005e~m,h\u0019/r\u0014", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B#", ">qd;X\u0017H] e\u0005\\2|\b", "", ">qd;X\u0017H] e\u0005\\2|\bmr\n2\u0004:\u000e' Vs\u0016<p25`}\u001cEm", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        public static /* synthetic */ void getQueryPool$annotations() {
        }

        private Companion() {
        }

        @JvmStatic
        public final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
            Intrinsics.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
            final RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindBlob(int i2, byte[] value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    roomSQLiteQueryAcquire.bindBlob(i2, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindDouble(int i2, double d2) {
                    roomSQLiteQueryAcquire.bindDouble(i2, d2);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindLong(int i2, long j2) {
                    roomSQLiteQueryAcquire.bindLong(i2, j2);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindNull(int i2) {
                    roomSQLiteQueryAcquire.bindNull(i2);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindString(int i2, String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    roomSQLiteQueryAcquire.bindString(i2, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void clearBindings() {
                    roomSQLiteQueryAcquire.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    roomSQLiteQueryAcquire.close();
                }
            });
            return roomSQLiteQueryAcquire;
        }

        @JvmStatic
        public final RoomSQLiteQuery acquire(String query, int i2) {
            Intrinsics.checkNotNullParameter(query, "query");
            synchronized (RoomSQLiteQuery.queryPool) {
                Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = RoomSQLiteQuery.queryPool.ceilingEntry(Integer.valueOf(i2));
                if (entryCeilingEntry != null) {
                    RoomSQLiteQuery.queryPool.remove(entryCeilingEntry.getKey());
                    RoomSQLiteQuery sqliteQuery = entryCeilingEntry.getValue();
                    sqliteQuery.init(query, i2);
                    Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                    return sqliteQuery;
                }
                Unit unit = Unit.INSTANCE;
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i2, null);
                roomSQLiteQuery.init(query, i2);
                return roomSQLiteQuery;
            }
        }

        public final void prunePoolLocked$room_runtime_release() {
            if (RoomSQLiteQuery.queryPool.size() <= 15) {
                return;
            }
            int size = RoomSQLiteQuery.queryPool.size() - 10;
            Iterator<Integer> it = RoomSQLiteQuery.queryPool.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i2 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i2;
            }
        }
    }
}
