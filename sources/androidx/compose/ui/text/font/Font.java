package androidx.compose.ui.text.font;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007ljA0ZeP.XV0t\u0002ڔR/\f$ BsU%\nr!]N\u007fg\u001dK\u0011_\u001aƻ\bɖw̓ÒHTޯa\u0016'4HqM6\u001e\u0006K=xtd\nvݬ$ٹxڎ҈\u0019)Н\u0014z\u0013EQ\u0012 3\u0011\u0001HY%M3\"hĆ@ŋ\u0005\"tiT?VvԐ9/ݍ\u0003xJQ-ۡL+L\u0015FZF\u0015xg=Y?ˣ9\"ȭW\u0002"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "", ":nP1\\5@A(\fvm,~\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FT *LGDm\"-\"dp9\tw\u0002", "5dc\u0019b(=W\"\u0001hm9x\u0018/g\u0014of&i\u0004}([", "u(8", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "5dc g@ES`xBE\n{\u001b\u000b", "EdX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "5dc$X0@V(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCs", "\u0011n\\=T5B]\"", " db<h9<S\u007f\tv],\n", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Font {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    /* JADX INFO: compiled from: Font.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005\bBߚ(\u0007\u0015i\u0002>Re`.\u0001RZ\u0013y|L$\n&8hҘTڼԅ\"\rWPm\u0007\u001dIӂ\u000fFǥ\n\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,\u0003.[MKx2\u001e{r]8\u0007p\u0002", "", ":nP1", "4n]A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Deprecated(message = "\u0015K\fArw\u001a[\u0018^1\u000fXT\u0012]j`n(\u0012q\u0018kD8s}]\u0001:kz\fhW_ev@\u00062;?Q_Z\u000e4gLPhR=!\u001a\u0007#JZwG\u001b\u0001\u000f/=+Y\u0012\u000f)a\t\bTOT\u000eB5-D\u0013\u0003Cb1z\u007f_w'\u0004\"+\u000f'\u0016\u000e>V__\u0002SJy\n$eTPX`W2/b>E.(aAW\u0002\nC2sy.Iik\u000f#a\u0004F\u0011c<w\u0004\u00048\t|VKli:%<Z\u0011}':~St4jt\u000e\u001fHrU\"h/^cW<\rU6.[0o1!<V,\"YgIv}it8{`Myx4\u0012\u0005\u0006/1\u000b\u001bu8\u0011TA}6V_ZNn\u0019\u0007@\n\u001aM")
    public interface ResourceLoader {
        @Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:6$:bBM\u00160\u0011\u0002YD{Y}vdy62(`lK`\u001cu>Z&B>QiT\t7dLzsMHQ\u000eLSG\u001c\u0003@\u0007v", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        @InterfaceC1492Gx
        Object load(Font font);
    }

    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    int mo6188getStyle_LCdwA();

    FontWeight getWeight();

    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo6180getLoadingStrategyPKNRLFQ() {
        return FontLoadingStrategy.Companion.m6225getBlockingPKNRLFQ();
    }

    /* JADX INFO: compiled from: Font.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,s8UN7t8(\u001e>", "", "u(E", "\u001b`g6`<F/'\u0013\u0004\\\u001b\u0001\u0011/o\u00107cD\b\u001e\u001bU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }
}
