package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
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
@Metadata(bv = {}, d1 = {"Яč\u0014D57\u001eqܜLDyt\fA\u001c0\u0013.H\u0004*,(w\u000ffp:8D{H6Ri*\u0017k\u00024,[:qKП]\u001a\f\"\u0011ѧVguwRZ\u0011C\u0017\u0006$~rߚQU\u0007`\u001a\u000f8Bw?AWw=?`|6\u0013$:\">}\r\u0001(/P\u0010|~KK\u001a\u00198@v=Z\r[Ĩ\"Ň\u000e>6\u0001&\\mO>HzeB/)\u0003qB\\3g0\u0003r\u0013kj܋5xgӜ9?g5C%\u0004\u00035S\u001cBƄCqK\u0007155:as\u00067\t\u0004\"%CO;n9:%\u0011_r$'Yb\u0014O^\"@w)\u0011UX\u0012$\u001e'vA]\u001et\u0018&3#\u0004\u0004D^\u0019vB.\u0013\u0012:%9\u00183YNcr_zS\u0019|J,\t\u001b2;\u0001\u001d;$p\u001c{-\u001b\u0003\u000b\u00025_PUH|\u001b\nA{\u001b\tb0B44U\u0014G{?H_1EwQ#O~2LR{\u000f\u0005\u000f\u0006\u001c\u0006`fX\"\u001d)g.\u0017\u001crD\u0013\u0016\u001cTboD\u0011{4\u0005\u000b\f\u001c+ \u000b\u0015\u0005-3/fO\u0017|\u001bQk\u001e=/\u0015W\"\u000by/o9\rFeUq yR%%o@p\u001cpfpk<^j<:2v\u000bX\u000e\nff\fAGou*WD1GmEL\u00115ZA+!&Z1$\rxK$1|Tx\u0017&h\\\u001f\u0001\u0018|WC\u0015`PE\n]C?>UP{d\u00011\u001b\u0017s.n0hUt\u0005\u0016$h,$$*QQ]NC\u0013\r@J\u0002[]|vsee\u0012U\"E\u0006\u001dd\u0001.\u0016\b\u001bt:p\u0003J}e_6\u0005\t\u000b#6d0}oV\u0013G\u0012e;_L`\u000b\u0003\bT\u0017D\u000b07\u001eS\u0014 &\u000bIECU5^\u0014\"[-a\f| 2\br'&#v40q-\bb\u007fub?F]q~l:lx\u0011o`j&\u001br\rB!KHo\u00139rF|#/,y70\u001b\u0001n[h$ \u0002BEw*\"[.\u0018lW=\u0011{\u00020s{{t\u000bx\"P\u001fD7|C4=Ni\u001evQm\u0014&06oN\u0003\u000bB\b2gT<6?sXw\u0016(z.W\u0010\u0013%IZsin>^\u0007\u0012nN\u0015bU`g]/5?9,\rM3\u001bl\r\buw҅\u0005S+@c\"]7~%YWt;!'f4;IkSa\u0002d\u0015w-{\u0003\b\ff0-'PM3?a\u0013ovv\u00129\f\u0015Rr\u000b*f\u0019\u0002h=Ή~|\u001csR\u001b\u0019Rgr\u001eu]P\\\fOCH;_`7B$|\u0012YK1\u0014EE=w{D+\nnk;, P$5\u0018\r!\u000b\u0012Vr\u0018\u001a3:D\u0005Ff\u0010\u001d+PNAvf\u00031\".6I\u007f\u0006A\u0012+^\b|(%N>Cl4Z{l\u0007\u001e{l\u0012,\u001e&\u0011&IV(\u0002]T+I?Md߾\t^H%k \u0007&F&ޞ*\u001fDI+D\u001e\u0012{h\u001f~\u007f_\u001bkGk`ԝa4`2\u0016\u001f(\u0010J<ķ,\u0015I\u001a\u0016YrMtlpj>bxh|tBÉD\u0001\r\\v\u0011AQ\r\u0005۠h/E^gv\u001b\u000ex\u00072Xy*/qj?QΠb\u000f}<\u000f\u00111Z)\u0007ʷ.B\u0017:H\u000b:u^Tk-W]2.|\u0003\\ɔu<P-D\u0011<\"_^FiV\\H4\u0002cߥE\u0019\u001fK]S\u0014;\u001f\u0019c}\u0002W3j\u0019|7\u008do}?\u007fRse\u001aiAތs\u001be3\u0004@C3d':\u0002\u0016N\r\u000e{VEʨ\\MC\u00146y\u0004QF\u001cڍ($\u0014Ek\u001bS\u0002`*\u000eopZ\u0002\u0018\u001c&`ޟ\u001fH1[\u0005x\"\"r{҅wdi3|\\\tf1Dl=]p\u0015\u0006eh0ޠt\u0011S(O\u000f4Wy)ϧ\u0014O\u007f\u0014s\\\u0001\"G\\\fOCw\u0012zJal̖\u000eRĐ.\u0006;g\u001dvxA\u0006Q\u000e#h\u0016\u001bM\u001cwgׯ'\u0012Ѧ!\u00185!?aD4\u0011Mou;D\u001ddv.xԽ;\n$B`\u001708\u0011rū\u00173UL\nb 0\u0014!K$\f)\u0014e\u007fj}ʤ\u0006ufQQ39+\u0011j˥i\\\u00130ifr\u0007-\u007f\u0019>^Kd~2*\u000fƙ>Ir\\(D'xn\u007fԊ40^[#Qk^4\u001fkhEi\rBz7\nuW=\u007fc|1m#[\f2\u0007\u001eQ1\u00139/\u001cD@\u0003\f\rgąB\nׂMU\u000br\u0012#\u0011Bb!]\u0019o3O-\u0005V\u001cǪ_YĄ\u0003\f.|l\u001d!\u0007zgIث6\"\u000e\u0014|:d@`K\b)-dً\u0013z\u0003o~\u001eFX\u001e=<\u0086\u0019^\fĨaޱ02\t\u000bMSx\u0001zy}l\r[cDaܲO\u0001\bަ\u0013̑Sc,pWcfCgi4H+\u0002H&\\6RŲ+݉\u001bY{op}bkauBwHt\ntvdt͔lI1r)h_}QЪ#p_ȥrזE\u0010j۪\u0557+\u001b"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#l\u001c9o\u0016--L9u3\u001e\">", "\"`V", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;K=\u001c\u001fgaF\\", "u(E", "1ta?X5MB\u0015\u0001", "5dc\u0010h9KS\"\u000eiZ.", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1ta?X5MB\u0015\u0001dk\u0015\r\u00106", "5dc\u0010h9KS\"\u000eiZ.f\u0016\u0018u\u0007/", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "B`V g(<Y", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "0dV6a\u001aM`)|\nn9|", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "3mR<W,\u001b]#\u0006zZ5", "", "D`[BX", "", "3mR<W,\u001b]#\u0006zZ5\\\u0010/m\u007f1\u000b", "7mS2k", "", "3mR<W,\u001bg(~", "", "3mR<W,\u001bg(~Ze,\u0005\t8t", "3mR<W,\u001cV\u0015\f", "", "3mR<W,\u001cV\u0015\fZe,\u0005\t8t", "3mR<W,\u001d]){\u0002^", "", "3mR<W,\u001d]){\u0002^\f\u0004\t7e\t7", "3mR<W,\u001eZ\u0019\u0007zg;", "2db0", "3mR<W,\u001e\\)\u0007", "3md:7,LQ&\u0003\u0006m6\n", "3mR<W,\u001fZ#z\n", "", "3mR<W,\u001fZ#z\n>3|\u0011/n\u000f", "3mR<W,\"\\ \u0003\u0004^", "3mR<W,\"\\ \u0003\u0004^\f\u0004\t7e\t7", "3mR<W,\"\\(", "3mR<W,\"\\(^\u0002^4|\u0012>", "3mR<W,%]\"\u0001", "", "3mR<W,%]\"\u0001Ze,\u0005\t8t", "3mR<W,'](g\u000be3d\u0005<k", "3mR<W,'c \u0006", "3mR<W,'c \u0006v[3|v/r\u0004$\u0003D\u0016\u0013\u0014NomCv-5b\r", "\"", "", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000b.RX;cV{P] Z\u001bR'\u0014\tn=3rN@hu,V\u00067o\u0005!\u0012\u001d9ty0e\u001dC\t\u0015wU~OKUpu\u0011HAk,.u\\\"\\8IyWb", "3mR<W,,S&\u0003ve0\u0012\u0005,l\u007f\b\u0003@\t\u0017 V", "3mR<W,,V#\f\n", "", "3mR<W,,V#\f\n>3|\u0011/n\u000f", "3mR<W,,b&\u0003\u0004`", "", "3mR<W,,b&\u0003\u0004`\f\u0004\t7e\t7", "3mR<W,-O\u001b\u0001z]\t\u0007\u00136e{1", "B`V", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}p\u0004q", "3mR<W,-O\u001b\u0001z]\t\u0011\u0018/", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}X\u0004q", "3mR<W,-O\u001b\u0001z]\n\u007f\u0005<", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}Y\u0004q", "3mR<W,-O\u001b\u0001z]\u000b\u0007\u0019,l\u007f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}Z\u0004q", "3mR<W,-O\u001b\u0001z]\f\u0006\u00197", "=qS6a(E", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKx!\u0006\u0005%B]y';\u0003\u0012=QMD53\u001e#fn=\u0012r6[\u0005p5L[0XYQ=\"\u0010g\u0012Y:\u0017\u0012/%g_", "3mR<W,-O\u001b\u0001z]\r\u0004\u0013+t", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\\u0004q", "3mR<W,-O\u001b\u0001z]\u0010\u0006\u00103n\u007f", "7m[6a,\u001dS'|\bb7\f\u0013<", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKx!\u0006\u0005%B]y';\u0003\u0012=QMD53\u001e#fn=\u0012r6[\u0005p5L[0XYQ=\"\u0010g\u0012Y:\u0017\u0012/\u0005\u000btNF&\f5\\KIh\u000e\u0010\u0012\u00159\u007flQZ\u001aPC\u0015~?3gJbaC'JCl)d\u00195", "3mR<W,-O\u001b\u0001z]\u0010\u0006\u0018", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_\u0004q", "3mR<W,-O\u001b\u0001z]\u0013\u0007\u00121", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}`\u0004q", "3mR<W,-O\u001b\u0001z]\u0015\u0007\u0012\u0018u\u0007/c<\u000e\u001d", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "3mR<W,-O\u001b\u0001z]\u0015\r\u00106", "3mR<W,-O\u001b\u0001z]\u001a\u007f\u0013<t", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}i\u0004q", "3mR<W,-O\u001b\u0001z]\u001a\f\u00163n\u0002", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "3mR<W,-O\u001b\u0001z]\u001dx\u0010?e", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "3mS\u0012a*HR\u0019", "3mS g9NQ(\u000f\b^", ">n_!T.", ">tb5G(@", "<`\\2", "5dc!T.", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000b\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@InternalSerializationApi
public abstract class TaggedEncoder<Tag> implements Encoder, CompositeEncoder {
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    private final boolean encodeElement(SerialDescriptor serialDescriptor, int i2) {
        pushTag(getTag(serialDescriptor, i2));
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginCollection(SerialDescriptor serialDescriptor, int i2) {
        return Encoder.DefaultImpls.beginCollection(this, serialDescriptor, i2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean z2) {
        encodeTaggedBoolean(popTag(), z2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(SerialDescriptor descriptor, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedBoolean(getTag(descriptor, i2), z2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b2) {
        encodeTaggedByte(popTag(), b2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(SerialDescriptor descriptor, int i2, byte b2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedByte(getTag(descriptor, i2), b2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char c2) {
        encodeTaggedChar(popTag(), c2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(SerialDescriptor descriptor, int i2, char c2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedChar(getTag(descriptor, i2), c2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double d2) {
        encodeTaggedDouble(popTag(), d2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(SerialDescriptor descriptor, int i2, double d2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedDouble(getTag(descriptor, i2), d2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(SerialDescriptor enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeTaggedEnum(popTag(), enumDescriptor, i2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float f2) {
        encodeTaggedFloat(popTag(), f2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(SerialDescriptor descriptor, int i2, float f2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedFloat(getTag(descriptor, i2), f2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder encodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return encodeTaggedInline(popTag(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final Encoder encodeInlineElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return encodeTaggedInline(getTag(descriptor, i2), descriptor.getElementDescriptor(i2));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int i2) {
        encodeTaggedInt(popTag(), i2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(SerialDescriptor descriptor, int i2, int i3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedInt(getTag(descriptor, i2), i3);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long j2) {
        encodeTaggedLong(popTag(), j2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(SerialDescriptor descriptor, int i2, long j2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedLong(getTag(descriptor, i2), j2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
        encodeTaggedNonNullMark(getCurrentTag());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        encodeTaggedNull(popTag());
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(SerialDescriptor descriptor, int i2, SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, i2)) {
            encodeNullableSerializableValue(serializer, t2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @ExperimentalSerializationApi
    public <T> void encodeNullableSerializableValue(SerializationStrategy<? super T> serializationStrategy, T t2) {
        Encoder.DefaultImpls.encodeNullableSerializableValue(this, serializationStrategy, t2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeSerializableElement(SerialDescriptor descriptor, int i2, SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, i2)) {
            encodeSerializableValue(serializer, t2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializationStrategy, T t2) {
        Encoder.DefaultImpls.encodeSerializableValue(this, serializationStrategy, t2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short s2) {
        encodeTaggedShort(popTag(), s2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(SerialDescriptor descriptor, int i2, short s2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        encodeTaggedShort(getTag(descriptor, i2), s2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        encodeTaggedString(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(SerialDescriptor descriptor, int i2, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        encodeTaggedString(getTag(descriptor, i2), value);
    }

    protected void encodeTaggedBoolean(Tag tag, boolean z2) {
        encodeTaggedValue(tag, Boolean.valueOf(z2));
    }

    protected void encodeTaggedByte(Tag tag, byte b2) {
        encodeTaggedValue(tag, Byte.valueOf(b2));
    }

    protected void encodeTaggedChar(Tag tag, char c2) {
        encodeTaggedValue(tag, Character.valueOf(c2));
    }

    protected void encodeTaggedDouble(Tag tag, double d2) {
        encodeTaggedValue(tag, Double.valueOf(d2));
    }

    protected void encodeTaggedEnum(Tag tag, SerialDescriptor enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeTaggedValue(tag, Integer.valueOf(i2));
    }

    protected void encodeTaggedFloat(Tag tag, float f2) {
        encodeTaggedValue(tag, Float.valueOf(f2));
    }

    protected Encoder encodeTaggedInline(Tag tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        pushTag(tag);
        return this;
    }

    protected void encodeTaggedInt(Tag tag, int i2) {
        encodeTaggedValue(tag, Integer.valueOf(i2));
    }

    protected void encodeTaggedLong(Tag tag, long j2) {
        encodeTaggedValue(tag, Long.valueOf(j2));
    }

    protected void encodeTaggedNonNullMark(Tag tag) {
    }

    protected void encodeTaggedNull(Tag tag) {
        throw new SerializationException("null is not supported");
    }

    protected void encodeTaggedShort(Tag tag, short s2) {
        encodeTaggedValue(tag, Short.valueOf(s2));
    }

    protected void encodeTaggedString(Tag tag, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        encodeTaggedValue(tag, value);
    }

    protected void encodeTaggedValue(Tag tag, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    protected void endEncode(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.tagStack.isEmpty()) {
            popTag();
        }
        endEncode(descriptor);
    }

    protected final Tag getCurrentTag() {
        return (Tag) CollectionsKt.last((List) this.tagStack);
    }

    protected final Tag getCurrentTagOrNull() {
        return (Tag) CollectionsKt.lastOrNull((List) this.tagStack);
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public SerializersModule getSerializersModule() {
        return SerializersModuleBuildersKt.EmptySerializersModule();
    }

    protected abstract Tag getTag(SerialDescriptor serialDescriptor, int i2);

    protected final Tag popTag() {
        if (this.tagStack.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.tagStack;
        return arrayList.remove(CollectionsKt.getLastIndex(arrayList));
    }

    protected final void pushTag(Tag tag) {
        this.tagStack.add(tag);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    @ExperimentalSerializationApi
    public boolean shouldEncodeElementDefault(SerialDescriptor serialDescriptor, int i2) {
        return CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(this, serialDescriptor, i2);
    }
}
