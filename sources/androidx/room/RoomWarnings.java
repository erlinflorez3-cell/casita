package androidx.room;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: RoomWarnings.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005G\u001aFéLC/\"Z\u00110\u0006g+>6YͿL.`S֜\u0013m"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0m<\u000e \u001bPq\u001c\u0012", "", "u(E", "\u0011n\\=T5B]\"", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class RoomWarnings {
    public static final String AMBIGUOUS_COLUMN_IN_RESULT = "ROOM_AMBIGUOUS_COLUMN_IN_RESULT";
    public static final String CANNOT_CREATE_VERIFICATION_DATABASE = "ROOM_CANNOT_CREATE_VERIFICATION_DATABASE";
    public static final String CURSOR_MISMATCH = "ROOM_CURSOR_MISMATCH";
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_CONSTRUCTOR = "ROOM_DEFAULT_CONSTRUCTOR";
    public static final String DOES_NOT_IMPLEMENT_EQUALS_HASHCODE = "ROOM_TYPE_DOES_NOT_IMPLEMENT_EQUALS_HASHCODE";
    public static final String INDEX_FROM_EMBEDDED_ENTITY_IS_DROPPED = "ROOM_EMBEDDED_ENTITY_INDEX_IS_DROPPED";
    public static final String INDEX_FROM_EMBEDDED_FIELD_IS_DROPPED = "ROOM_EMBEDDED_INDEX_IS_DROPPED";
    public static final String INDEX_FROM_PARENT_FIELD_IS_DROPPED = "ROOM_PARENT_FIELD_INDEX_IS_DROPPED";
    public static final String INDEX_FROM_PARENT_IS_DROPPED = "ROOM_PARENT_INDEX_IS_DROPPED";
    public static final String MISMATCHED_GETTER = "ROOM_MISMATCHED_GETTER_TYPE";
    public static final String MISMATCHED_SETTER = "ROOM_MISMATCHED_SETTER_TYPE";
    public static final String MISSING_INDEX_ON_FOREIGN_KEY_CHILD = "ROOM_MISSING_FOREIGN_KEY_CHILD_INDEX";
    public static final String MISSING_INDEX_ON_JUNCTION = "MISSING_INDEX_ON_JUNCTION";
    public static final String MISSING_JAVA_TMP_DIR = "ROOM_MISSING_JAVA_TMP_DIR";
    public static final String MISSING_SCHEMA_LOCATION = "ROOM_MISSING_SCHEMA_LOCATION";
    public static final String PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED = "ROOM_EMBEDDED_PRIMARY_KEY_IS_DROPPED";
    public static final String RELATION_QUERY_WITHOUT_TRANSACTION = "ROOM_RELATION_QUERY_WITHOUT_TRANSACTION";
    public static final String RELATION_TYPE_MISMATCH = "ROOM_RELATION_TYPE_MISMATCH";
    public static final String UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE = "ROOM_UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE";

    /* JADX INFO: compiled from: RoomWarnings.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u000532ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\n,\u0015YQcƥE͉`\u0005YӠ\\39Z{K~\u0010~ÂMԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޞGɤW@X\u061c/N\u000e\by6E'VĘ}ݰ\u001ffYĥ\f%\\E\u0014\u0005; yЮAĲ_T\u0016֫e'b\u0007i1\u007fB\u0014ʷ!̆]=uՎAn\u0010:\u001c0u\u0002\u0006Ɍcѧ\u001b%?ك\n//|\u001aHriMݚ3ĈWiZ̲\u0011.|(O*7\u000e1լ7ʰoP\\А|\u001d[/l\u0007,\ni\u0605/ʟ@!-ī\u001f[v}\u0003M\f\f{Ë9Ơ]nsލČ=s"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0m<\u000e \u001bPq\u001czT/=dy);w\u001f\u0004", "", "u(E", "\u000fL1\u0016:\u001c(C\u0007xXH\u0013lp\u0018_c\u0011u-`\u0005\u0007.^", "", "\u0011@=\u001bB\u001b81\u0006^VM\fvy\u000fRc\t_\u001e\\\u0006z1X\b\u001bR\u0014\u00116Y\u000e\u0017", "\u0011TA B\u00198;|lb:\u001bZk", "\u0012D5\u000eH\u0013-MvhcL\u001bix\rTi\u0015", "\u0012N4 R\u0015(B\u0013bbI\u0013\\p\u000fNn\"[,pr}5ip\u0018d\b\u0013C\\\u007f", "\u0017M3\u0012K&\u001f@\u0003ft>\u0014Yh\u000eD_\u0007u i\u0006z6c\b d\u001f\u0014Fg\u000b\"Mt", "\u0017M3\u0012K&\u001f@\u0003ft>\u0014Yh\u000eD_\u0007u!dv}&iq*p\u0004\"Ch\u000b\u0017L", "\u0017M3\u0012K&\u001f@\u0003ftI\bih\u0018Ty\t_ gu\u0011+]\b\u001bc\u000f D]~", "\u0017M3\u0012K&\u001f@\u0003ftI\bih\u0018Ty\fi:_\u0004\u00012Zm\u001b", "\u001bHB\u001a4\u001b\u001c6x]t@\fkw\u000fR", "\u001bHB\u001a4\u001b\u001c6x]tL\fkw\u000fR", "\u001bHB <\u0015 M|gY>\u001fvr\u0018_`\u0012h dx\u007fAUm0p\u0003\u0018=d~", "\u001bHB <\u0015 M|gY>\u001fvr\u0018_d\u0018d\u001eoz\u00010", "\u001bHB <\u0015 M}Zk:&kp\u001a_^\fh", "\u001bHB <\u0015 M\u0007\\]>\u0014X\u0003\u0016O]\u0004j$j\u007f", "\u001eQ8\u001a4\u00192M~^nX\rir\u0017__\u0010X _uv&iq*p\u0004\"Ch\u000b\u0017L", " D;\u000eG\u0010(<\u0013jj>\u0019p\u0003!In\u000be0o\u0011\u00064Kv*R\u0003$=g\t", " D;\u000eG\u0010(<\u0013mnI\fvp\u0013Sg\u0004j\u001ec", "#M=\u00126\f,AtknX\u0015lo\u0016A\\\fb$o\u000b\u0011+X\b\u001bR\u000f/F]\u000f'Z~(<7&K", "@n^: *H[!\t\u0004"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Deprecated(message = "\u0017N\u0005H1\t.g]\u0007;\u0003_*8R\u001cZ\u0018;Dj\u0011\u0012\u007fT\u0002~O\u00038oi`iF\r]{xO2r=!d`z+f[ztL@+KZ(E/\u007f7A\u007f\u0011\u0004?+O\u0011I\u001d")
    @InterfaceC1492Gx
    public RoomWarnings() {
    }
}
