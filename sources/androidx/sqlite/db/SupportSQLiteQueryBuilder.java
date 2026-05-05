package androidx.sqlite.db;

import cz.msebera.android.httpclient.message.TokenParser;
import java.util.regex.Pattern;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: SupportSQLiteQueryBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":!\u007f\u0007llA0RnP.XX2\u000f\u0002{<$a$yCIU\"}8\tWN}gvJ`\u000fYƤ$1)jZH\u000ewxR\u001c8B\u007fCAM\b=gaҽ:\u0005.4jS\b\u000b\u0019\u001aXϺ@\u0005\tIc\u0016\"4FoJR;N\u001b\u0019@\ņ$\u0001,k0RDX\u0005]h@k\u0007wJf'\u000eܞE[\u001bPl';Ǹ\u0012$9JO7+$\u0002\u0004O`iJ\u001b? ܵ5n52CK\nVdYH #7g\r\föV`\u0013]x\fU,\u0018qY]&(&\u07be,\u0013J\u0011&\b=G\\.b\u000e\u0016\u001cKt!ԟpV\u0010lZ\u0002\u0011`d\u0018U\u0010A.Q'vWg:)PMz3\f4\"/rĲ_T\u001cr];b\u000bi1\u007fTeL|\u001fB=L\u001a!f\u0010A\u001c0u\u0001_\u0002\u001fF/'MZg$gkJkR\u0001\u000f\u0005\u000f|{m\u0001])\"M,g6\u0017\u0012rLt\tqOdXZ\u0012{ \u001b\u0007ą\f\u0013.vHV/((Z_noi]_ $]eMX\u001dodæEӷ77Yc\u001ef#\u000f\"ETl\u0015\\lAc\f\t]>!`LAݛ\u0004ԞHP\u0014\u0013@FB(B4I\u0019\u000b\u001e\u001fҔ*նE|\u0011ݠ+v\u001e\tl5:\u0002\u0018%Kժ\r˩`pwΟIW:\bx$C@\u007f6oĢaɋl4\u0005ȽW\r\u0002\f_ibFzml߲aދ$\u0016\"ߙ\"=K '\u0001?10.\u001cɦ~ϯUM\u001a\u05fdK\u000b\b\u001dSjDf6kGݝlʧNO\\ϟr\u0003lr;\b\u0013\u0001PӖHیKc\\ެОBe"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B*S?r3\u001e\">", "", "B`Q9X", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0h]149@a", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "1n[B`5L", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "2hbA\\5<b", "", "5q^Bc\tR", "6`e6a.", ":h\\6g", "=qS2e\tR", "Ad[2V;B]\"", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004g\u0013 F|\u0018@u8~g\n';|\u0016wL@\u0005YD) rnHtO\u0013R\u0006'3\\N9p/\u0003A\u001b\u0011Z\u001b$", "1qT.g,", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B#", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*7t3+\u001fl`LPq8Uz6G\u0016M)&@\u0003H\u001f\u001cg\u001d<\u0017s\thA\u0010~DD3d<M\t:h\u000ea", "/o_2a+\u001cZ\u0015\u000f\t^", "", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "<`\\2", "1kPBf,", "/o_2a+\u001c] \u000f\u0003g:", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002\u0005\fD\b\u0016\u0017TE\u0004#{!FUG'3v\u0018w;RHo= j,R", "\u0011n\\=T5B]\"", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SupportSQLiteQueryBuilder {
    public static final Companion Companion = new Companion(null);
    private static final Pattern limitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private Object[] bindArgs;
    private String[] columns;
    private boolean distinct;
    private String groupBy;
    private String having;
    private String limit;
    private String orderBy;
    private String selection;
    private final String table;

    public /* synthetic */ SupportSQLiteQueryBuilder(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @JvmStatic
    public static final SupportSQLiteQueryBuilder builder(String str) {
        return Companion.builder(str);
    }

    private SupportSQLiteQueryBuilder(String str) {
        this.table = str;
    }

    public final SupportSQLiteQueryBuilder distinct() {
        this.distinct = true;
        return this;
    }

    public final SupportSQLiteQueryBuilder columns(String[] strArr) {
        this.columns = strArr;
        return this;
    }

    public final SupportSQLiteQueryBuilder selection(String str, Object[] objArr) {
        this.selection = str;
        this.bindArgs = objArr;
        return this;
    }

    public final SupportSQLiteQueryBuilder groupBy(String str) {
        this.groupBy = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder having(String str) {
        this.having = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder orderBy(String str) {
        this.orderBy = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder limit(String limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        String str = limit;
        boolean zMatches = limitPattern.matcher(str).matches();
        if (str.length() != 0 && !zMatches) {
            throw new IllegalArgumentException(("invalid LIMIT clauses:" + limit).toString());
        }
        this.limit = limit;
        return this;
    }

    public final SupportSQLiteQuery create() {
        String str;
        String str2 = this.groupBy;
        if ((str2 == null || str2.length() == 0) && (str = this.having) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause".toString());
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (this.distinct) {
            sb.append("DISTINCT ");
        }
        String[] strArr = this.columns;
        if (strArr != null && strArr.length != 0) {
            Intrinsics.checkNotNull(strArr);
            appendColumns(sb, strArr);
        } else {
            sb.append("* ");
        }
        sb.append("FROM ");
        sb.append(this.table);
        appendClause(sb, " WHERE ", this.selection);
        appendClause(sb, " GROUP BY ", this.groupBy);
        appendClause(sb, " HAVING ", this.having);
        appendClause(sb, " ORDER BY ", this.orderBy);
        appendClause(sb, " LIMIT ", this.limit);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return new SimpleSQLiteQuery(string, this.bindArgs);
    }

    private final void appendClause(StringBuilder sb, String str, String str2) {
        String str3 = str2;
        if (str3 != null && str3.length() != 0) {
            sb.append(str);
            sb.append(str2);
        }
    }

    private final void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(TokenParser.SP);
    }

    /* JADX INFO: compiled from: SupportSQLiteQueryBuilder.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0RqP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018\\uk\u0007J\t\u0010s\u0013\u0014\u001c\u0011jZP\u001c}.&\u001d3Zw]6uqS8\u000fvd\u0007v݈$أ}\u0005\tɝݻL\u0018"}, d2 = {"\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B*S?r3\u001e\"'?C\u000fn(Wz1P\"", "", "u(E", ":h\\6g\u0017:b(~\bg", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/j$\u000bO\u0001$ \u001d", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "0tX9W,K", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B*S?r3\u001e\">", "B`Q9X\u0015:[\u0019", "", "Ap[6g,8`\u0019\u0006zZ:|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SupportSQLiteQueryBuilder builder(String tableName) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new SupportSQLiteQueryBuilder(tableName, null);
        }
    }
}
