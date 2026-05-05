package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007fјnjG7LeN0ZS81s{J$c$wTCU(\n*ޛeȞ\u0018g\u001dI\u001bxS\u0015\f\u0016\u0007jDI\u0004ym\u0018\u00152PqW3{pMAftD\b8487(\t\u0011\"0H\u001e{\u0013Ea\u000b@6Px@R\u001bT\u001d\u001c(\u0005l&\u0011&bg\\>`ns9])\u0013qHN5hH~c\ftZ7#|a,5XGE\u001b5W\u0013\u0007X\\m\u000fOsM\u0005\u0017&U6ʁwWDeH\b#Dg\r\föVb\u000bQn\f?+}d{V\u0014(\u0006|\u0014\rj\u0005>\u000e-H<02h\u001e\rax#[FP\u0010cZ\u0002\u0011`d\u001dU\b9+G\"~Sw:GTg\u0004\u000b\r,+\u0019p7Z\u0003\u0014\u0011\u001d!T\u0006ZISV<vT:oCm\u0012zz\u0012:\n@K\u0010/\u0002\u0012\\#59k9Q \u001a\rҩHg\u0005\u001f)\u000ea\u0005jJV!52W0\u000fȱh`\r\u0005\u001aO\u0005d:.e$d\u000b\u0004\u0007# #\u0014j-ٚ\u0014N]\u00072p[|\"%]\u0007}m?~\u001c^Q`I4\u007fiߧeZ~\u0014MLz\u0007^tPb\\yj2:BXp {\fDT\rA>Os,4Z0GgČL\t&ՓY~\u000fphz`\u000eb5<\u0003\u0018%ڲ\r\u0007Xʔ\tqmzW?Mo0-YQc\u001ałY(pؔ\u0015%\r~\u0002\u0013\u0018zZPdn,t\u0004\u0002°\u001a\"AQ=M+\u0011\u0005=@\u0011}XZz}Sc\u0011U\u0001܃}\u0017Ch<w lvAny\u001bbb\u001c:xtqQ\u000eܐ\u0004\u0002iF\tW{V\u0011qLXC\u0014g?f:\u0013\u0004M\"ݵ\u0005u*ĜM/I>+.߹\u0018P"}, d2 = {"\u001anZ6bu\u001fW ~b^;x\b+t{}", "", "7rA2Z<EO&_~e,", "", "7r36e,<b#\f\u000f", "Ax\\9\\5DB\u0015\f|^;", "\u001anZ6bu)O(\u0002P", "Ahi2", "", "1qT.g,=/(f~e3\u0001\u0017", ":`bA@6=W\u001a\u0003z]\b\fp3l\u0007,\n", ":`bA4*<S'\rz]\b\fp3l\u0007,\n", "3wc?T:", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "uYI\u0019b2B]bivm/Ro4a\u0011$EG| \u0019\u0011V\u0018Exz\u001c^y137\u001d*VE\u0005R>'\u0017>H>\u0003t(\u0018}#PN\u0018\u0013f[t\u0013z\u0017V\u001fJt\u0014\u0001bCmUN@!]\u0013N}LdJ\u001c%\u0012<4X>ae\u000bj", "5dc\u0010e,:b\u0019}Vm\u0014\u0001\u00106i\u000e", "u(;7T=:\u001d z\u0004`uc\u00138gU", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc\u0012k;KO'", "u(;7T=:\u001d)\u000e~eud\u0005:;", "u(I", "5dc\u0019T:M/\u0017|zl:|\b\u000btg,\u0003G\u0005%", "5dc\u0019T:M;#}~_0|\b\u000btg,\u0003G\u0005%", "5dc \\A>", "5dc l4EW\"\u0005iZ9~\t>", "u(;<^0H\u001d\u0004z\na\u0002", "1n_F", "uYI\u0019b2B]bivm/Ro4a\u0011$EG| \u0019\u0011V\u0018Exz\u001c^y137\u001d*VE\u0005R>'\u0017>H>\u0003t(\u0018}#PN\u0018\u0013f[t\u0013z\u0017V\u001fJt\u0014\u0001bCmUN@!]\u0013N}LdJ\u001c%\u0012<4X>ae\u000b`\u001f{E32']fy/AT^)`\u001b[r", "3wc?T", "\"", "Bx_2", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l\u000bV\u00138\b!~`y)97\u007f+RC9z\n", "BnBAe0GU", "", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FileMetadata {
    private final Long createdAtMillis;
    private final Map<KClass<?>, Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final Long lastAccessedAtMillis;
    private final Long lastModifiedAtMillis;
    private final Long size;
    private final Path symlinkTarget;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public FileMetadata(boolean z2, boolean z3, Path path, Long l2, Long l3, Long l4, Long l5, Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.isRegularFile = z2;
        this.isDirectory = z3;
        this.symlinkTarget = path;
        this.size = l2;
        this.createdAtMillis = l3;
        this.lastModifiedAtMillis = l4;
        this.lastAccessedAtMillis = l5;
        this.extras = MapsKt.toMap(extras);
    }

    public /* synthetic */ FileMetadata(boolean z2, boolean z3, Path path, Long l2, Long l3, Long l4, Long l5, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 2)) == 0 ? z3 : false, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : path, (i2 & 8) != 0 ? null : l2, (i2 & 16) != 0 ? null : l3, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? null : l4, (-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? l5 : null, (i2 + 128) - (i2 | 128) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileMetadata copy$default(FileMetadata fileMetadata, boolean z2, boolean z3, Path path, Long l2, Long l3, Long l4, Long l5, Map map, int i2, Object obj) {
        if ((1 & i2) != 0) {
            z2 = fileMetadata.isRegularFile;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z3 = fileMetadata.isDirectory;
        }
        if ((4 & i2) != 0) {
            path = fileMetadata.symlinkTarget;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            l2 = fileMetadata.size;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            l3 = fileMetadata.createdAtMillis;
        }
        if ((i2 + 32) - (32 | i2) != 0) {
            l4 = fileMetadata.lastModifiedAtMillis;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            l5 = fileMetadata.lastAccessedAtMillis;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            map = fileMetadata.extras;
        }
        return fileMetadata.copy(z2, z3, path, l2, l3, l4, l5, map);
    }

    public final FileMetadata copy(boolean z2, boolean z3, Path path, Long l2, Long l3, Long l4, Long l5, Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new FileMetadata(z2, z3, path, l2, l3, l4, l5, extras);
    }

    public final <T> T extra(KClass<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = this.extras.get(type);
        if (obj == null) {
            return null;
        }
        return (T) KClasses.cast(type, obj);
    }

    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public final Map<KClass<?>, Object> getExtras() {
        return this.extras;
    }

    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public final boolean isRegularFile() {
        return this.isRegularFile;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }
}
