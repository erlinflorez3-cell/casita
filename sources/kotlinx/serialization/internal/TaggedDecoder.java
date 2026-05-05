package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĝ\u0014D57\u001eqܜLDyt\fA\u001c0\u0013.H\u0004*, \u0001\u000f߿r9FDmH4S[*%k\u00044:[,qI;]\u001a\u0014\"\u0011ѧVgunRZ\u0011E\u0017\u0006$~rߚQU\u0007`\u001a\u000f8Bw?AWw=?`|6\u0013$:\">{\r\u0001(/P\u0010|~KK\u001a\u00198@v;Z\r[\u0004\"\u0012\f>(\u0001,ձoޮ>H\u0003]B/)\u0007qB\\/g0\u0003M\u0015Fb3\u0015vgB3@M5\u001d%Y\u0005\rwqΪ+Awܵ\u0013gW'YI$WdY@\u0017Ʀ/O\u001b_;4j\u0016i`:([Sq]h\u000eV\u000bA\u0010UP\u0012\"\u001e'vC]$t\u001e&9\u0005tc@\u0007\u061c\rۍF|*:%<\u00183YBcz_yS\u0019|@,\t\u001b0;\u0001\u001d4\fX\u001cy-\u001b\u0003\u0012\u001a5_[UH|&\"Q{!\tb0F44U\u0012G{?AG)EtQ#O\u0006JLR\u0006\u000f\u0005\u000f\b\u001c}`hX\"\u001d5g.\u0017\u001erD\u0013\u0018\u001cTbqD\u0011{6\u001d\u000b\f)+ \u000b\u001a\u0005533fO\u0017\f\u001bQk\u001c=/\u0015J\nry'o9\rM}]q4yR%.o@p*pfpfT^jN:2v\u0012X\f\nlf\fAYou*FD1GoEL\u00117ZA+#(fv9\u0017Ta$3m2\u0007!\u0001~o9\u0004u#a,+`R1OcM\u0019ThRlB\u0016;\u0007-\u000eHKuw_L\u001b0>i\nL.\u001agk_A!!\u0017)`\u0015]IZ\f}Q{,o~\u000b'';\u0017\\0\u001cx D`\u0019x\u007fX%4\u000f^!68h\u000e\u0013yF)a,Z\u0019\fVI!\f P\u0017>\u000b67 ;\u007f\u001eTEt;v?\u001f,vZc5gch}b\"b=[%i\u0012>{\u0016\u001eu\u0002a@TPI\b\u0019n.2#\u001bJXn\b\nX\bzAa\u007fqj~\u000fPO!.D\u001b¡0\r~\u0010$q!*\u00164t\u0014JuI|\"\u0013s)\u001f_kg\u001c\u0001{`\u0019c'\n9\u0016ax RU&fYr\tv:\"OfGI\u001b\u001d>\u001f#z`ѧ\f\u000bQ\u000e2/\u001e6\u0018F&C74HrI\u000b>^\u0007\u0013nN\u0015bU`g^/6?9,1M3\u001bl\r\tuu҅\u0005S+Ecn]<~%Y\u0003\u001dM)gp\u00019\u0004\u000eGW\u0014N\u0004u<\u001eo}%P\u0018+7\u000b\u001c)yi\u0011\u000e8xr\u0019\u0018|N\u00138Bj``:)-\u000e-\u0012J#'\u000bGi;\u0003ppdN&@s\u001e\u000f[\\)=љCu̍\u001f-\u0014zuPW1,'*s\u0004?\fL8 ]״;3Ǜ[\u000etQ&.H^\n\u0016\u0011!9\u0017^d\u001c.\u0001Ɠ9\u001cڷ\f6]K{\u0015!)qk&Cp+91\u001eB\u0002Е?\u001cʋpc|!S\u001et}ny\u001dG\u0001!\u0017ke.I̽\u000b>\u001fx8X?\u0013Z'Ӕ#6\u00160q#]2\u0001p\u001av\f\u00119s\u0004*\u0018ɵvd˗\u0002\u001f\bELEbx-;\u0005Mnh\u0017!\u0005B\u000eВ\u000fn66\r\fW'C\u0011Ŀb\u0011!\u0007\u000f\u0006,8G7G9\f\u0011U%\u001f\u0004{Òl3ܳV?)\fz\u001e}}\u000f\u00111h\u0013x\u000enZ\t)υ.>\u0082JTKpol2E|\u0003TTu<PLD\u0011Dıulߣ$>j_dP_\fY\u001b'\u007fCj6s\u0015]Mj\bƚk<ʫ\u0001\u0001\u001b\u0019BDy\u0015\f7!a_\u0013}_ofqä{wͺ+\f\u0010A\u0013\u0012[@n\u000f\u0010my9Sb\u0012Uv\u0094P1\u009d(\u0006\u0004\u0001HX?'B_\u000bu\u0007weH>*l˔\u000b5ؼpx\u0002itw&T|[\u0010Iq~\"+\\>X@3\u001b\u000eXv[#DCҵZ9ʷ\n)A\u001cE#]TX+w\b}3jAT\u0013*̜\u00014ݦ:yU%\"Q\u0014\u0013*T*Q\u000boW^\u001e\u001fB\u0011\u001bH\u00101\tϒ0j+\u007f?Q\u0007HF\\?4oKQ@Ǧ(^<,T\"\u0014\u0001FHMл&J\u000f(C7U\rYG@pBCͻ\u0015[3quyxJWU(ةs{\nٓoՕ\\9}^\u000bY/P5?#\u0006\u0003-DF\rÍPl/ƞ\u0010ȭhL(F~K6r\u0001<>X\u0017ZqfW߸+ߚY\u0015mۿ\u0003tEe|\u0011YB\u000eC)ы%٭|\u0006\u001b\u0012G%!\u0018noG@;\u0004\u001d3N{>֟wdesY\u0012\u0013a\u0001Ą\u000e\u0016\u0016ĊCپpVmǪϼ[,"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#l\u001c9o\u0016-,C9u3\u001e\">", "\"`V", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#\\ 5w\u0015.Z\u0019", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaF\\", "u(E", "1ta?X5MB\u0015\u0001", "5dc\u0010h9KS\"\u000eiZ.", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1ta?X5MB\u0015\u0001dk\u0015\r\u00106", "5dc\u0010h9KS\"\u000eiZ.f\u0016\u0018u\u0007/", "4kP4", "", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "B`V g(<Y", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "0dV6a\u001aM`)|\nn9|", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "1n_FG(@a\b\t", "", "=sW2e", "2dR<W,\u001b]#\u0006zZ5", "2dR<W,\u001b]#\u0006zZ5\\\u0010/m\u007f1\u000b", "7mS2k", "", "2dR<W,\u001bg(~", "", "2dR<W,\u001bg(~Ze,\u0005\t8t", "2dR<W,\u001cV\u0015\f", "", "2dR<W,\u001cV\u0015\fZe,\u0005\t8t", "2dR<W,\u001d]){\u0002^", "", "2dR<W,\u001d]){\u0002^\f\u0004\t7e\t7", "2dR<W,\u001e\\)\u0007", "3md:7,LQ&\u0003\u0006m6\n", "2dR<W,\u001fZ#z\n", "", "2dR<W,\u001fZ#z\n>3|\u0011/n\u000f", "2dR<W,\"\\ \u0003\u0004^", "2dR<W,\"\\ \u0003\u0004^\f\u0004\t7e\t7", "2dR<W,\"\\(", "2dR<W,\"\\(^\u0002^4|\u0012>", "2dR<W,%]\"\u0001", "", "2dR<W,%]\"\u0001Ze,\u0005\t8t", "2dR<W,'](g\u000be3d\u0005<k", "2dR<W,'c \u0006", "", "2dR<W,'c \u0006v[3|v/r\u0004$\u0003D\u0016\u0013\u0014NomCv-5b\r", "\"", "", "2db2e0:Z\u001d\u0014zk", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", ">qTC\\6Na\nz\u0002n,", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000b.RX;cV{P] Z\u001bR'\u0014\tn=3rN@hf,W\u0002Hl|\u0013\u001a#1ytL_}V\u0007\u0011\u0005A+|\u001c@duX=\u000fi&m\u000e)\u0007Y?:\"#G\\\u0002mL?\u0006EZ\r{TCQdL\u0019xGy", "2dR<W,,S&\u0003ve0\u0012\u0005,l\u007f\b\u0003@\t\u0017 V", "2dR<W,,S&\u0003ve0\u0012\u0005,l\u007f\u0019wG\u0011\u0017", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `&o\u001c<\u0004)1`\u000253|\u001a8V1Jx0-\u0015ju\u000fmh(_rpNHW.&<oB\u0014\u0010ic\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "2dR<W,,V#\f\n", "", "2dR<W,,V#\f\n>3|\u0011/n\u000f", "2dR<W,,b&\u0003\u0004`", "", "2dR<W,,b&\u0003\u0004`\f\u0004\t7e\t7", "2dR<W,-O\u001b\u0001z]\t\u0007\u00136e{1", "B`V", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "2dR<W,-O\u001b\u0001z]\t\u0011\u0018/", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?\u001d", "2dR<W,-O\u001b\u0001z]\n\u007f\u0005<", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?\u001e", "2dR<W,-O\u001b\u0001z]\u000b\u0007\u0019,l\u007f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?\u001f", "2dR<W,-O\u001b\u0001z]\f\u0006\u00197", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKx!\u0006\u0005%B]y';\u0003\u0012=QMD53\u001e#fn=\u0012r6[\u0005p5L[0XYQ=\"\u0010g\u0012Y:\u0017\u0012/\u0005\b", "2dR<W,-O\u001b\u0001z]\r\u0004\u0013+t", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?!", "2dR<W,-O\u001b\u0001z]\u0010\u0006\u00103n\u007f", "7m[6a,\u001dS'|\bb7\f\u0013<", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKx!\u0006\u0005%B]y';\u0003\u0012=QMD53\u001e#fn=\u0012r6[\u0005p5L[0XYQ=\"\u0010g\u0012Y:\u0017\u0012/\u0005\u000btNF&\f5\\KIh\u000e\u0010\u0012\u00159\u007flQZ\u001aPC\u0015~?3gJbaC&ACl)d\u00195", "2dR<W,-O\u001b\u0001z]\u0010\u0006\u0018", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "2dR<W,-O\u001b\u0001z]\u0013\u0007\u00121", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?%", "2dR<W,-O\u001b\u0001z]\u0015\u0007\u0018\u0018u\u0007/c<\u000e\u001d", "2dR<W,-O\u001b\u0001z]\u0015\r\u00106", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~J\b$6C", "2dR<W,-O\u001b\u0001z]\u001a\u007f\u0013<t", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?.", "2dR<W,-O\u001b\u0001z]\u001a\f\u00163n\u0002", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "2dR<W,-O\u001b\u0001z]\u001dx\u0010?e", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "3mS g9NQ(\u000f\b^", ">n_!T.", ">tb5G(@", "<`\\2", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "B`V\u000f_6<Y", "\u0013", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "5dc!T.", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000b\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@InternalSerializationApi
public abstract class TaggedDecoder<Tag> implements Decoder, CompositeDecoder {
    private boolean flag;
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    private final <E> E tagBlock(Tag tag, Function0<? extends E> function0) {
        pushTag(tag);
        E eInvoke = function0.invoke();
        if (!this.flag) {
            popTag();
        }
        this.flag = false;
        return eInvoke;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    protected final void copyTagsTo(TaggedDecoder<Tag> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.tagStack.addAll(this.tagStack);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        return decodeTaggedBoolean(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedBoolean(getTag(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        return decodeTaggedByte(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedByte(getTag(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        return decodeTaggedChar(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedChar(getTag(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(SerialDescriptor serialDescriptor) {
        return CompositeDecoder.DefaultImpls.decodeCollectionSize(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        return decodeTaggedDouble(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedDouble(getTag(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return decodeTaggedEnum(popTag(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        return decodeTaggedFloat(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedFloat(getTag(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInline(popTag(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Decoder decodeInlineElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInline(getTag(descriptor, i2), descriptor.getElementDescriptor(i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        return decodeTaggedInt(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInt(getTag(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return decodeTaggedLong(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedLong(getTag(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        Tag currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            return false;
        }
        return decodeTaggedNotNullMark(currentTagOrNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeNullableSerializableElement(SerialDescriptor descriptor, int i2, final DeserializationStrategy<? extends T> deserializer, final T t2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) tagBlock(getTag(descriptor, i2), new Function0<T>(this) { // from class: kotlinx.serialization.internal.TaggedDecoder.decodeNullableSerializableElement.1
            final /* synthetic */ TaggedDecoder<Tag> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                if (!this.this$0.decodeNotNullMark()) {
                    return (T) this.this$0.decodeNull();
                }
                return (T) this.this$0.decodeSerializableValue((DeserializationStrategy<? extends T>) deserializer, t2);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @ExperimentalSerializationApi
    public <T> T decodeNullableSerializableValue(DeserializationStrategy<? extends T> deserializationStrategy) {
        return (T) Decoder.DefaultImpls.decodeNullableSerializableValue(this, deserializationStrategy);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    @ExperimentalSerializationApi
    public boolean decodeSequentially() {
        return CompositeDecoder.DefaultImpls.decodeSequentially(this);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeSerializableElement(SerialDescriptor descriptor, int i2, final DeserializationStrategy<? extends T> deserializer, final T t2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) tagBlock(getTag(descriptor, i2), new Function0<T>(this) { // from class: kotlinx.serialization.internal.TaggedDecoder.decodeSerializableElement.1
            final /* synthetic */ TaggedDecoder<Tag> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) this.this$0.decodeSerializableValue((DeserializationStrategy<? extends T>) deserializer, t2);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializationStrategy) {
        return (T) Decoder.DefaultImpls.decodeSerializableValue(this, deserializationStrategy);
    }

    protected <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializer, T t2) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        return decodeTaggedShort(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedShort(getTag(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String decodeString() {
        return decodeTaggedString(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final String decodeStringElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedString(getTag(descriptor, i2));
    }

    protected boolean decodeTaggedBoolean(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeTaggedValue).booleanValue();
    }

    protected byte decodeTaggedByte(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeTaggedValue).byteValue();
    }

    protected char decodeTaggedChar(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeTaggedValue).charValue();
    }

    protected double decodeTaggedDouble(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeTaggedValue).doubleValue();
    }

    protected int decodeTaggedEnum(Tag tag, SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeTaggedValue).intValue();
    }

    protected float decodeTaggedFloat(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeTaggedValue).floatValue();
    }

    protected Decoder decodeTaggedInline(Tag tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        pushTag(tag);
        return this;
    }

    protected int decodeTaggedInt(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeTaggedValue).intValue();
    }

    protected long decodeTaggedLong(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeTaggedValue).longValue();
    }

    protected boolean decodeTaggedNotNullMark(Tag tag) {
        return true;
    }

    protected Void decodeTaggedNull(Tag tag) {
        return null;
    }

    protected short decodeTaggedShort(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeTaggedValue).shortValue();
    }

    protected String decodeTaggedString(Tag tag) {
        Object objDecodeTaggedValue = decodeTaggedValue(tag);
        Intrinsics.checkNotNull(objDecodeTaggedValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeTaggedValue;
    }

    protected Object decodeTaggedValue(Tag tag) {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    protected final Tag getCurrentTag() {
        return (Tag) CollectionsKt.last((List) this.tagStack);
    }

    protected final Tag getCurrentTagOrNull() {
        return (Tag) CollectionsKt.lastOrNull((List) this.tagStack);
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return SerializersModuleBuildersKt.EmptySerializersModule();
    }

    protected abstract Tag getTag(SerialDescriptor serialDescriptor, int i2);

    protected final Tag popTag() {
        ArrayList<Tag> arrayList = this.tagStack;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.flag = true;
        return tagRemove;
    }

    protected final void pushTag(Tag tag) {
        this.tagStack.add(tag);
    }
}
