package com.facebook.fresco.middleware;

import java.util.Map;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005$4\u0012\u0006)njO0L͜P.`S2\u000fq\u007f:\tqҕ\u0010SkUH|Z\b_\u0017\u0003unb\\!BU\u00076zpߚWV)a \u0011JB\u001eByqڱA9nx~,.2::\u0010\u0004G\u001bJJ\u0016͌\tD{\u0010 2XphU=U\u000b\u001a \u000bV\"\u0017\u001d#h\u0015ZՂp]H5k\u001bwIf9o2\rM;Id+\u001dxw\u001dY?e=}%2\fMv$b\u0011I\n=3sG)1ɞ\u0002Xf\\\u000e\u0016-+}\u0010\u000ex4h\u001dSv\u000bm,\u0016\bׂT\u000e6\u0005C\u001c\u001bJ\u001c\u000e42xD;)~\u001a\u001e5\u0005r\u0002C`\u0006nD\u0016y\u00105E-h3\nBa\u000bЈeL"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\t\u001b\u0016Fv\u000eNr25#`\u001cEM)=Z?\u001agC\u001aj", "", "5dc\u0012k;KO", "\u0013", "9dh", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "D`[BX\u0010?<#\u000e[h<\u0006\b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "5dc\u0012k;KO'", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\t\u001b\u0016Fv\u000eNr25#]3Fz\u0012<#", ">tc\u0012k;KO", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", ">tc\u0012k;KO'", "3wc?T:", "\u0011n\\=T5B]\"", ";hS1_,PO&~tk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface HasExtraData {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String KEY_BITMAP_CONFIG = "bitmap_config";
    public static final String KEY_COLOR_SPACE = "image_color_space";
    public static final String KEY_ENCODED_HEIGHT = "encoded_height";
    public static final String KEY_ENCODED_SIZE = "encoded_size";
    public static final String KEY_ENCODED_WIDTH = "encoded_width";
    public static final String KEY_ID = "id";
    public static final String KEY_IMAGE_FORMAT = "image_format";
    public static final String KEY_IMAGE_SOURCE_EXTRAS = "image_source_extras";
    public static final String KEY_IS_ROUNDED = "is_rounded";
    public static final String KEY_LAST_SCAN_NUMBER = "last_scan_num";
    public static final String KEY_MODIFIED_URL = "modified_url";
    public static final String KEY_MULTIPLEX_BITMAP_COUNT = "multiplex_bmp_cnt";
    public static final String KEY_MULTIPLEX_ENCODED_COUNT = "multiplex_enc_cnt";
    public static final String KEY_NON_FATAL_DECODE_ERROR = "non_fatal_decode_error";
    public static final String KEY_ORIGIN = "origin";
    public static final String KEY_ORIGIN_SUBCATEGORY = "origin_sub";
    public static final String KEY_URI_SOURCE = "uri_source";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u000512ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\n,\u0015YQcƥE͉`\u0005YӠ\\39Z{K~\u0010~ÂMԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޞGɤW@X\u061c/N\u000e\by6E'VĘ}ݰ\u001ffYĥ\f%\\E\u0014\u0005; yЮAĲ_T\u0016֫e'b\u0007i1\u007fB\u0014ʷ!̆]=uՎAn\u0010:\u001c0u\u0002\u0006Ɍcѧ\u001b%?ك\n//|\u001aHriMݚ3ĈWiZ̲\u0011.|(O*7\u000e1լ7ʰoP\\Аµ\u0015`"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\t\u001b\u0016Fv\u000eNr25#`\u001cEM)=Z?\u001agC\u001aSFkA\u0012_5R\u00010\u001d", "", "u(E", "\u0019DH,5\u0010-;tit<\u0016ei\u0013G", "", "\u0019DH,6\u0016%=\u0006xhI\bZh", "\u0019DH,8\u0015\u001c=w^YX\u000f\\l\u0011Hn", "\u0019DH,8\u0015\u001c=w^YX\u001a`}\u000f", "\u0019DH,8\u0015\u001c=w^YX\u001e`g\u001eH", "\u0019DH,<\u000b", "\u0019DH,<\u0014\u001a5xx[H\u0019dd\u001e", "\u0019DH,<\u0014\u001a5xxhH\u001cif\u000f__\u001bj-\\\u0005", "\u0019DH,<\u001a8@\u0003nc=\f[", "\u0019DH,?\b,B\u0013lX:\u0015vq\u001fM\\\bh", "\u0019DH,@\u0016\u001d7ybZ=&lu\u0016", "\u0019DH,@\u001c%B|ia>\u001fve\u0013Tg\u0004f:^\u0001\u00070^", "\u0019DH,@\u001c%B|ia>\u001fvh\u0018Ci\u0007[\u001fzt\u00017X|", "\u0019DH,A\u0016'MyZi:\u0013vg\u000fCi\u0007[:`\u0004\u00041\\", "\u0019DH,B\u0019\"5|g", "\u0019DH,B\u0019\"5|gtL\u001cYf\u000bT_\ne-t", "\u0019DH,H\u0019\"M\u0007hjK\n\\", ";hS1_,PO&~tk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String KEY_BITMAP_CONFIG = "bitmap_config";
        public static final String KEY_COLOR_SPACE = "image_color_space";
        public static final String KEY_ENCODED_HEIGHT = "encoded_height";
        public static final String KEY_ENCODED_SIZE = "encoded_size";
        public static final String KEY_ENCODED_WIDTH = "encoded_width";
        public static final String KEY_ID = "id";
        public static final String KEY_IMAGE_FORMAT = "image_format";
        public static final String KEY_IMAGE_SOURCE_EXTRAS = "image_source_extras";
        public static final String KEY_IS_ROUNDED = "is_rounded";
        public static final String KEY_LAST_SCAN_NUMBER = "last_scan_num";
        public static final String KEY_MODIFIED_URL = "modified_url";
        public static final String KEY_MULTIPLEX_BITMAP_COUNT = "multiplex_bmp_cnt";
        public static final String KEY_MULTIPLEX_ENCODED_COUNT = "multiplex_enc_cnt";
        public static final String KEY_NON_FATAL_DECODE_ERROR = "non_fatal_decode_error";
        public static final String KEY_ORIGIN = "origin";
        public static final String KEY_ORIGIN_SUBCATEGORY = "origin_sub";
        public static final String KEY_URI_SOURCE = "uri_source";

        private Companion() {
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ Object getExtra$default(HasExtraData hasExtraData, String str, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExtra");
            }
            if ((i2 & 2) != 0) {
                obj = null;
            }
            return hasExtraData.getExtra(str, obj);
        }
    }

    <E> E getExtra(String str);

    <E> E getExtra(String str, E e2);

    Map<String, Object> getExtras();

    <E> void putExtra(String str, E e2);

    void putExtras(Map<String, ? extends Object> map);
}
