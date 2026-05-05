package androidx.compose.runtime;

import java.util.List;
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
/* JADX INFO: compiled from: HotReloader.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005G\u0006FéLC/\"Z\u00110\u0006g+<ӧHeV.ʈW,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9pF\u0006\u00125`\b\u001c6m#\u0004", "", "u(E", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class HotReloader {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: HotReloader.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6B\u0005\"4\u0012\u0006%njO0LeN/ZS8\u0015s{:*aҜrYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001a\u0014\u0017\u0011jZK\u001cwٕ\u0016\u000f8E8PAQ\bCIb\u000563&`'~xڱ\u0005\u001a0OX\n\tKc\f@2ptH[%M3$X\u0005̧$\u0001$g0\\DT\u0005]h1S\u0007wOf'\u000e/CMUTb5%v\u0010\u001d[DED-%\u0002\u0002MR$R\u0011O\n=3jW+9X\fWdWF\u0013Ʀ/O\u0013nğ*n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9pF\u0006\u00125`\b\u001c6m#l+MCv0'\u0019rj\u000f", "", "u(E", "1kT.e\fK`#\f\t", "", "1kT.e\fK`#\f\t\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "5dc\u0010h9KS\"\u000eZk9\u0007\u0016=", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7zu;ZMHO=\u001f\u001f>", "5dc\u0010h9KS\"\u000eZk9\u0007\u0016=$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "7me._0=O(~\\k6\r\u0014=W\u00047~&\u0001+", "9dh", "", "7me._0=O(~\\k6\r\u0014=W\u00047~&\u0001+UT\u007f\u0017Kz-5S\u000b >m\u0012<M", ":nP1F;:b\u0019Z\u0004]\n\u0007\u0011:o\u000e(", "BnZ2a", "A`e2F;:b\u0019Z\u0004]\u000b\u0001\u0017:o\u000e(", "1n]AX?M", "Ah\\B_(MS{\t\nK,\u0004\u0013+d", "Ah\\B_(MS{\t\nK,\u0004\u0013+d>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final Object saveStateAndDispose(Object obj) {
            return Recomposer.Companion.saveStateAndDisposeForHotReload$runtime_release();
        }

        private final void loadStateAndCompose(Object obj) {
            Recomposer.Companion.loadStateAndComposeForHotReload$runtime_release(obj);
        }

        public final void simulateHotReload$runtime_release(Object obj) {
            loadStateAndCompose(saveStateAndDispose(obj));
        }

        public final void invalidateGroupsWithKey$runtime_release(int i2) {
            Recomposer.Companion.invalidateGroupsWithKey$runtime_release(i2);
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            return Recomposer.Companion.getCurrentErrors$runtime_release();
        }

        public final void clearErrors$runtime_release() {
            Recomposer.Companion.clearErrors$runtime_release();
        }
    }
}
