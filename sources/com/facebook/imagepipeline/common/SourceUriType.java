package com.facebook.imagepipeline.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000e]Lcz\u0004Gْ0!Ǟ`~R,@v?ejyӄǸiI"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001[ >ZA;[A\"\u0004|l9\\", "", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface SourceUriType {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int SOURCE_TYPE_DATA = 7;
    public static final int SOURCE_TYPE_LOCAL_ASSET = 5;
    public static final int SOURCE_TYPE_LOCAL_CONTENT = 4;
    public static final int SOURCE_TYPE_LOCAL_FILE = 1;
    public static final int SOURCE_TYPE_LOCAL_IMAGE_FILE = 3;
    public static final int SOURCE_TYPE_LOCAL_RESOURCE = 6;
    public static final int SOURCE_TYPE_LOCAL_VIDEO_FILE = 2;
    public static final int SOURCE_TYPE_NETWORK = 0;
    public static final int SOURCE_TYPE_QUALIFIED_RESOURCE = 8;
    public static final int SOURCE_TYPE_UNKNOWN = -1;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005*2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\n,\u0015YQcƥE͉`\u0005YӠ\\39Z{K~\u0010~ÂMԫ\u0011<\f\u05faΣ+T"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001[ >ZA;[A\"\u0004|l9EA6V\u0002#PPX52", "", "u(E", "!ND\u001f6\f8B\riZX\u000bXw\u000b", "", "!ND\u001f6\f8B\riZX\u0013ff\u000bLy\u0004i.`\u0006", "!ND\u001f6\f8B\riZX\u0013ff\u000bLy\u0006e)ov\u007f6", "!ND\u001f6\f8B\riZX\u0013ff\u000bLy\t_'`", "!ND\u001f6\f8B\riZX\u0013ff\u000bLy\fc\u001cbv\u0011(St\u001c", "!ND\u001f6\f8B\riZX\u0013ff\u000bLy\u0015[.j\u0007\u0004%O", "!ND\u001f6\f8B\riZX\u0013ff\u000bLy\u0019_\u001f`\u0001\u0011(St\u001c", "!ND\u001f6\f8B\riZX\u0015\\w!Ol\u000e", "!ND\u001f6\f8B\riZX\u0018ld\u0016I`\f[\u001fz\u0004v5Y})T\u0005", "!ND\u001f6\f8B\riZX\u001cen\u0018Oq\u0011", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int SOURCE_TYPE_DATA = 7;
        public static final int SOURCE_TYPE_LOCAL_ASSET = 5;
        public static final int SOURCE_TYPE_LOCAL_CONTENT = 4;
        public static final int SOURCE_TYPE_LOCAL_FILE = 1;
        public static final int SOURCE_TYPE_LOCAL_IMAGE_FILE = 3;
        public static final int SOURCE_TYPE_LOCAL_RESOURCE = 6;
        public static final int SOURCE_TYPE_LOCAL_VIDEO_FILE = 2;
        public static final int SOURCE_TYPE_NETWORK = 0;
        public static final int SOURCE_TYPE_QUALIFIED_RESOURCE = 8;
        public static final int SOURCE_TYPE_UNKNOWN = -1;

        private Companion() {
        }
    }
}
