package androidx.room.util;

import androidx.room.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: TableInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\rD4\u0012\u000e\u0007nʑA0R\u0006P.hS2\u000fq{<$q$yCAU\"}0\u0012WNmgvJh\u0011K\u000f\f\u001c~oBկs\f\u000e\u0012=1zsQFa\u0005SP!$<\u00190608\u0012\u0005/\u001b:X\u001ex\u0013O[\u000e\"0nqJT\u001dM3\u001e@\tN*\u000f#tm^8Xl\fA])ɨmB\\/ o\rQ\u001bFl';wq.9BOA%'c\u00035SkA\u0013? A3k719N\f]FZ\u0010\u0014C2}\u0013m\u0001,\\\u0013Zx\u00147-_cyZ$'&\u0001ԫ\u0011<\u0012\u0019N8V:E\u001a\u0015\u0015>9\u0003\u0001kBf\u0001\rAFфa~\u001d3\u000fK+g+-e*A'_O{3\u000ed7Q\t/]l\u001ap\u0017+T&RASP=vR8\\sqZ͗d͆.\u00048ϚPC\n\u0016F\u001d59k9Q(\u001a\b~H>Ѐ\u0007¾lSqɭ\u0019V0w.?:\u000b\u001cZrn\u001bj~Z\u000f0gۻ\u001eΤ\u000b}\u0010ʶpj\u0006<9%>O\u0006l@ҜOύ\u000e%7ωƦ]\u0007"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001z", "", "<`\\2", "", "1n[B`5L", "", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0013c\u00050?vk", "4na2\\.G9\u0019\u0013\t", "", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0016c\u000b ;o\u001f\u0014MW\u0011", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tu\u001er\u0012?I\rKz8%^VaH\\'\u001d", "7mS6V,L", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0019b| JC", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tu\u001er\u0012?I\rKz8%^VaH\\J1J\b#\u0011\\]0c\u001c`=#g\u001e~", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0011n[B`5", "\u0011n\\=T5B]\"", "\u0011qT.g,=4&\t\u0003", "\u0014na2\\.G9\u0019\u0013", "\u0014na2\\.G9\u0019\u0013lb;\u007fv/q\u0010(\u0005>\u0001", "\u0017mS2k", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;
    public static final Companion Companion = new Companion(null);
    public final Map<String, Column> columns;
    public final Set<ForeignKey> foreignKeys;
    public final Set<Index> indices;
    public final String name;

    /* JADX INFO: compiled from: TableInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0013f}\u001cFm\u0015\u000fZMCA", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface CreatedFrom {
    }

    @JvmStatic
    public static final TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public TableInfo(String name, Map<String, Column> columns, Set<ForeignKey> foreignKeys, Set<Index> set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.name = name;
        this.columns = columns;
        this.foreignKeys = foreignKeys;
        this.indices = set;
    }

    public /* synthetic */ TableInfo(String str, Map map, Set set, Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, set, (i2 & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableInfo(String name, Map<String, Column> columns, Set<ForeignKey> foreignKeys) {
        this(name, columns, foreignKeys, SetsKt.emptySet());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
    }

    public boolean equals(Object obj) {
        Set<Index> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!Intrinsics.areEqual(this.name, tableInfo.name) || !Intrinsics.areEqual(this.columns, tableInfo.columns) || !Intrinsics.areEqual(this.foreignKeys, tableInfo.foreignKeys)) {
            return false;
        }
        Set<Index> set2 = this.indices;
        if (set2 == null || (set = tableInfo.indices) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.foreignKeys.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u001bsڔ:Š\\:ڎs;\u0004\u0019>'\u000fOɁkg|J#!Q\u0014\u001e\u0016'p\\Mc\u007fu\u0012=:rsM<eokC'y\u0007\u0011.3:8(\u0007Wɤ|Н\u0014v\u0003ŏ\u001c\u0018 3XphTc˦Wܨ\u0016\u0006FĨQ*jkf6vn4Ƅ\u0002ݭ\u0007iJ÷ϴc;"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0013c\u0006+3v\u001a8V\u0019", "", "u(E", "\u0011Q4\u000eG\f\u001dMykdF&[d\u001eA\\\u0004i ", "", "\u0011Q4\u000eG\f\u001dMykdF&\\q\u001eIn\u001c", "\u0011Q4\u000eG\f\u001dMykdF&lq\u0015Ni\u001ad", "@dP1", "\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001z", "2`c.U(LS", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "B`Q9X\u0015:[\u0019", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TableInfo read(SupportSQLiteDatabase database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return TableInfoKt.readTableInfo(database, tableName);
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u001b\u007fјnjG6LeN<hݷH$\u001c{b#\u0014#\u0007\u0004`[/\u000e&\u0017Ofg\u0016oZ^\u0019E'\u0006Dyz0WX\u0011]@\u0013BF}DKM\u001eC˃dtD\f`g2<\b\u0005\u0019\u001aXI z\tEc\f@1PtHU%M3\u001e\"\nL%\u0019\u001e\u000bm^<Vtu<E\"1jRR5hH|{\u0013ТX'\u001b\u0001*/9PO5C)\u0004\t\u0015csA\u0019> <Kة'o;W\u0006o6\u0007\u0006D\u001b9Q%_\t%\u000b\u0006\u0018aT-9b{K~\u0014n\fC\u0002\u001bP\u001c\u000e4(\u000fB}.t\u0013&3#x\nD'ؤ`۰\u0004\u0001iا''\u0006?9Fkt_jS\u0019|=2\tc̜%ъr!c٪^p##lyg0\u007fAsL%˫[ǀq\u0004xçR9\u0012>_\u007f]\u007fGrϲ);s;)/y\u0011\u0019Ruv\u001d`\u0017T V\u001f؟$å\u001a72\u009e\\hRg\u001dk~X\u000f0gۻ\u001eΤ\u000b}\u0010ʶpj\u0006A9%>T\u0006l@ҜOύ\u000e%7ω\bg|m&Wg_i9(ҷ\u0012уVv\u001c̳ףf\u001b"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0013c\u00050?vk", "", "<`\\2", "", "Bx_2", "<nc\u001bh3E", "", ">qX:T9R9\u0019\u0013eh:\u0001\u00183o\t", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#1\u0007,", "2dU.h3MD\u0015\u0006\u000b^", "1qT.g,=4&\t\u0003", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#1*@gE\u001a^o]B\t-\u001a]\u0004+PN$\u0010 C", "/eU6a0Mg", "5dc\u000eY-B\\\u001d\u000e\u000f\u001d(\u0006\u00129t{7\u007fJ\n%", "u(E", "7r??\\4:`-dzr", "u(I", "3pd._:", "=sW2e", "4h]14-?W\"\u0003\nr", "6`b566=S", "BnBAe0GU", "\u0011n\\=T5B]\"", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Column {
        public static final Companion Companion = new Companion(null);
        public final int affinity;
        public final int createdFrom;
        public final String defaultValue;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final String type;

        @JvmStatic
        public static final boolean defaultValueEquals(String str, String str2) {
            return Companion.defaultValueEquals(str, str2);
        }

        public static /* synthetic */ void getAffinity$annotations() {
        }

        public Column(String name, String type, boolean z2, int i2, String str, int i3) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.name = name;
            this.type = type;
            this.notNull = z2;
            this.primaryKeyPosition = i2;
            this.defaultValue = str;
            this.createdFrom = i3;
            this.affinity = findAffinity(type);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Deprecated(message = "\u0018Y\u0001t\rT!`fRg]_!A[j\u000fk6\u0011}\u0019`>9\u0003|W\u0003+2(?xTVjo\u0005\u0006 BI\u001e[M\bm\u0018QIy\ns\u0005 Y\u001dR\"Bs\u000b\u0001 8T[T\f\u000fq'\t\u007f\u0016")
        @InterfaceC1492Gx
        public Column(String name, String type, boolean z2, int i2) {
            this(name, type, z2, i2, null, 0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
        }

        private final int findAffinity(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            String str2 = upperCase;
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "CHAR", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "CLOB", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            return (StringsKt.contains$default((CharSequence) str2, (CharSequence) "REAL", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "FLOA", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
        }

        /* JADX INFO: compiled from: TableInfo.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\":\u001e\u007f\u0007lk?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004c(~:\t}P\u0018k|Mr\u000bq\u0013L\u0016A\u0003:Nmx\f\u0014?6PrW3{sm?nzN\u000761P<@\nи\u001e1"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0013c\u00050?vT\fWKFg=\"\u001fq7", "", "u(E", "1n]AT0Ga\u0007\u000f\bk6\r\u0012.i\t*f<\u000e\u0017 Vr\u000eJz3", "", "1ta?X5M", "", "2dU.h3MD\u0015\u0006\u000b^\f\t\u0019+l\u000e", "=sW2e", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final boolean defaultValueEquals(String current, String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.areEqual(current, str)) {
                    return true;
                }
                if (!containsSurroundingParenthesis(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.areEqual(StringsKt.trim((CharSequence) strSubstring).toString(), str);
            }

            private final boolean containsSurroundingParenthesis(String str) {
                String str2 = str;
                if (str2.length() == 0) {
                    return false;
                }
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < str2.length()) {
                    char cCharAt = str2.charAt(i2);
                    int i5 = i4 + 1;
                    if (i4 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i3++;
                    } else if (cCharAt == ')' && i3 - 1 == 0 && i4 != str.length() - 1) {
                        return false;
                    }
                    i2++;
                    i4 = i5;
                }
                return i3 == 0;
            }
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Column) || this.primaryKeyPosition != ((Column) obj).primaryKeyPosition) {
                return false;
            }
            Column column = (Column) obj;
            if (!Intrinsics.areEqual(this.name, column.name) || this.notNull != column.notNull) {
                return false;
            }
            if (this.createdFrom == 1 && column.createdFrom == 2 && (str3 = this.defaultValue) != null && !Companion.defaultValueEquals(str3, column.defaultValue)) {
                return false;
            }
            if (this.createdFrom == 2 && column.createdFrom == 1 && (str2 = column.defaultValue) != null && !Companion.defaultValueEquals(str2, this.defaultValue)) {
                return false;
            }
            int i2 = this.createdFrom;
            return (i2 == 0 || i2 != column.createdFrom || ((str = this.defaultValue) == null ? column.defaultValue == null : Companion.defaultValueEquals(str, column.defaultValue))) && this.affinity == column.affinity;
        }

        public final boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        public String toString() {
            StringBuilder sbAppend = new StringBuilder("Column{name='").append(this.name).append("', type='").append(this.type).append("', affinity='").append(this.affinity).append("', notNull=").append(this.notNull).append(", primaryKeyPosition=").append(this.primaryKeyPosition).append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            return sbAppend.append(str).append("'}").toString();
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4C\u0007\":0\u007f\u0007lkA0RnP.XS2\u000fy\u0002<$a$wHQ٥J}P\b\u0010\u0006wk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004ym\u0016\u001d5Zom4]yK=xzF\u000702P9(\n\u0011$8N(|\u000bE[\f@1nuĐV\r[\fb#\u0014F8\u0001Le\u0018TDR\u0005_P.Q\u00020ŀNoe>\be\rt`m!?g,8X7c\u0016kgS\u001b`_W\tOsM\u0005\u0017(U0\u007fw.̴Zÿ\u0018\u00153˽]k\u0001(t\u0005\u007faB+\u0002՚eׂT\u000e0»K\n\u001b?\u001c\u000e4(~2\u0004Շhڿ\u00123|Ɂ$T^\bvH\u0010|q6E&.8a=qƠSň?\u0019VљL\u0013\u001b\u001e;\u0001\u001d\"\u0012Xdֳ\u0017ôXwYĸҮDK"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0016c\u000b ;o\u001f\u0014MW\u0011", "", "@dU2e,GQ\u0019mv[3|", "", "=m32_,MS", "=mD=W(MS", "1n[B`5'O!~\t", "", "@dU2e,GQ\u0019\\\u0005e<\u0005\u0012\u0018a\b(\n", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<M#\u0016aW5/\u001b\u0014/()jU3h\u0018;M\t\u0005O\u0005\u001a%cx[", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ForeignKey {
        public final List<String> columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List<String> referenceColumnNames;
        public final String referenceTable;

        public ForeignKey(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.referenceTable = referenceTable;
            this.onDelete = onDelete;
            this.onUpdate = onUpdate;
            this.columnNames = columnNames;
            this.referenceColumnNames = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (Intrinsics.areEqual(this.referenceTable, foreignKey.referenceTable) && Intrinsics.areEqual(this.onDelete, foreignKey.onDelete) && Intrinsics.areEqual(this.onUpdate, foreignKey.onUpdate) && Intrinsics.areEqual(this.columnNames, foreignKey.columnNames)) {
                return Intrinsics.areEqual(this.referenceColumnNames, foreignKey.referenceColumnNames);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + AbstractJsonLexerKt.END_OBJ;
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eQLш|\u0004O\f8\u000b4B\u0007\":\u001e\u007f\u0007ls?ӄZ͜x4bU:\u000f\u001aڔb#\u001cG\u0002GIU2}P\n_Rui\u0007J\t\fS\u0013\u0014\u0019\u0011jZMe|k\u0017'2psУ7M}C\u0002o\u0003C\u001d `#h}\u0013\u000f2*vƵ=ٰC\u001c\u001b 3XphVҫQ\u000b\"Ň\u001e@&\b,d8]DH\u0005]h0ݭ\u0007oJ÷?a6\u0006[\u0017\u0017c5\u000f\u000faL,Ë;;\u001dǬk\u0005\r]iISN\u007fB\u001dhU+ȅMy_̬p\u0002\u001a!9Wվa\u0002"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0016c\u000b ;o\u001f\u0014MW-oC!\u0003hmI\u0007l*NL", "", "7c", "", "Ad`BX5<S", "4q^:", "", "Bn", "uH8\u0019](OOb\u0006vg.Fv>r\u00041}\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#\u0007,", "5dc\u0013e6F", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0016W", "u(8", "5dc X8NS\"|z", "5dc!b", "1n\\=T9>B#", "=sW2e", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
        private final String from;
        private final int id;
        private final int sequence;
        private final String to;

        public ForeignKeyWithSequence(int i2, int i3, String from, String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.id = i2;
            this.sequence = i3;
            this.from = from;
            this.to = to;
        }

        public final int getId() {
            return this.id;
        }

        public final int getSequence() {
            return this.sequence;
        }

        public final String getFrom() {
            return this.from;
        }

        public final String getTo() {
            return this.to;
        }

        @Override // java.lang.Comparable
        public int compareTo(ForeignKeyWithSequence other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i2 = this.id - other.id;
            return i2 == 0 ? this.sequence - other.sequence : i2;
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r+4ߚ\u007f\u0007t\tA0JiP.`Y2\u000fq|:)qҕ\u0010QkUH|Z\b]\u000f\u000bm\u0004Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012BL}CKS\u007f?I`#73%ݨ&8\b\u000bAI:L\u001ev\u0013Cy\r\"4NrRR;P\u0015$ \nV&\u0011 lg|7vqmD=*\u001boRP7_^}{\u0012ТX'\u001b~*/9IO5C(\u0004\t\u0015\\sA\u0019> <Kة'o1W~o6\u0007\fZ)sU\u001bj\u000b&\u000b\u0006\u0018t\\;9S{Q`\u00108w)|;A:\u0012\\αJͶ1\u001anڜ^A\u0003rk@~\u0003\u0015FVеcي\u001b%\bđ{O)migK\u001b^7*\u0006;#Y\u0005-%2ٲ\u001a\u05ce\u0019\u001b\\ȭ\"?_BUH|\r\u0010ADՖrĊ\u0006*\f\u0382Ѓ\u0004>"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0019b| JC", "", "<`\\2", "", "CmX>h,", "", "1n[B`5L", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'\u0006\u0013(C9\u001eKz,~@\u0002.FCY\u001f", "=qS2e:", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'\u0006\u0013(C9\u001eKz,~@\u0002.FC|3IT75D-\u0019o+ \u000bq;$:\u0018", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0011n\\=T5B]\"", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Index {
        public static final Companion Companion = new Companion(null);
        public static final String DEFAULT_PREFIX = "index_";
        public final List<String> columns;
        public final String name;
        public List<String> orders;
        public final boolean unique;

        public Index(String name, boolean z2, List<String> columns, List<String> orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.name = name;
            this.unique = z2;
            this.columns = columns;
            this.orders = orders;
            ArrayList arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(Index.Order.ASC.name());
                }
                arrayList = arrayList2;
            }
            this.orders = arrayList;
        }

        /* JADX INFO: compiled from: TableInfo.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R?t\u0004/E/|\u0014\u001eGS\u0017=\u0001c\u0019b| J,s8UN7t8(\u001e>", "", "u(E", "\u0012D5\u000eH\u0013-M\u0004kZ?\u0010o", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Deprecated(message = "\u0018Y\u0001t\rT!`fRg=9#0St\u0014{;\u0017q\u001aYB\u0006py]\u0001)gv\u0018$.Vo|\u0005\u0006\n<M&\u001fi")
        @InterfaceC1492Gx
        public Index(String name, boolean z2, List<String> columns) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(Index.Order.ASC.name());
            }
            this(name, z2, columns, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Index)) {
                return false;
            }
            Index index = (Index) obj;
            if (this.unique == index.unique && Intrinsics.areEqual(this.columns, index.columns) && Intrinsics.areEqual(this.orders, index.orders)) {
                return StringsKt.startsWith$default(this.name, DEFAULT_PREFIX, false, 2, (Object) null) ? StringsKt.startsWith$default(index.name, DEFAULT_PREFIX, false, 2, (Object) null) : Intrinsics.areEqual(this.name, index.name);
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            if (StringsKt.startsWith$default(this.name, DEFAULT_PREFIX, false, 2, (Object) null)) {
                iHashCode = DEFAULT_PREFIX.hashCode();
            } else {
                iHashCode = this.name.hashCode();
            }
            return (((((iHashCode * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode()) * 31) + this.orders.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + ", orders=" + this.orders + "'}";
        }
    }
}
