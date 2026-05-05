package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.modules.SerializersModule;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1250)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĹ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfr9FDmH<R[*\u0015k\u00044:[,qI<]\u001a\f.\u0011ѧVg}nRZ\u0011D\u0017\u0006,xrߚQU\u000f]\u001a\u000f8Ew?ASw=?e|6\u001b :\">{\r\u0001(3PƵ~zQN\u0014۵8@~DZ҈U\u0005(\u0016\u000e>&\u0003&\\uS>ԟt]P/+\u0003oCV'm7\u0005M\u0013F\\'\u001b~i\u001e1@?5#Ǭ[\u0003\rSc?\t@y=\u000bk/'AI{WLX\b\u0014++WՕ\u0006ri#\u000b\u0003vϯW+}b{P<(8\u001c\u0002\u000fL\b\u001c\u0007?H\\/*v\u0016\u0011K\u0001\u0003UPP0cR\u0002\u000bad\u001dS\u0004Ĵ/9)m\u001aoI+f7*\u0018=\"1\u0015\u0007!\niTt]1b\u000ei1\u007fMmL\\!q=\u001c\u0011!f\u0010B\u001c0u\ru\u000eYD%>O[g0Qo\u0010\\\\g%\u001a\u0011la\u0004jHn=5(\u007f8\u0017(rD\u0013\u000b\u001cTbuD\u0011{!\u001b\u001bF\u000e!>twj'k$\u0017Uv\t\u0003M\f\u0010kC/^g\u000f\u0004\u000e\u0006?~5;ȡq1\u0012\\\u00056WBr\u0007hf\tt:}\r,0V`jV\u0019BX«\u0010\u0013@d:2BRI\u0019\u000b\u001bx\u0007,iY|7l\u000bl\u001e#l3R+06=\u001f\u000fytp\u001em)M:$x\"[N\u00029'Jm\"\u0017^C5O\u0015\u0002+_gzM|p$\u001dm{N#J=_SU\u0013=+oDJCSy\u000be\u007fSB+\t$\u0012\u000fiu^k\u0016\u000f\t,\u000f\u0019\u0011a\u001d50&vrQ\u000e\u0015\u0004\b\t^zup\u0005\u000finar1nlRF.\u001d\u001fL@G\u0002j\u0013C_['K\u001c(\u0018=<y]\u0018|^}p3>t\u00147ru^\u0006p\u0006u2imy]\re:$\u001b\u0010rLx. B7ISE\u0011Wr(n8{\u0011_\u0002t.D\r\u001fc\f>!\u0014\u00164\\zp\u0006\f\u0014\"\u0017[%?S\u0004k{\u0015c\\9W?\u000e\u0019 In@U\u00042\u001fepCH\u0006\"\u001efEI\n\u001d<71z>\u0005\u001e\u0019~li4\u0016+\u0004T\u0007'\u0017`O$?d2lx\u000b\u0013\u000f\u0017)[n^B\u0001-\u0015c\"\u0007\\I\u0005\u001cS\u00053qV\u0019SK\u0016a|\u0018\u0015tcCD\u0003?K,f(#E\fPy\u0006D(_)\u001c+6\u001e\u0001&\u000b]Z\u0018I?\u0002\u0015m\u000bH^9j+`-| (jNP.E\u001fE)JL'\u000bG\u0013#spTdN&Ds\u001e\u000fM\\)5!Cc̍\u001f-\u0014yuPW0,'*\u001e\u0004?\f/8 U\u0011;\"Ǜ[\u000etQ&1H^\n\u0016\u0011\b9\u0017^i\u001c.x\u0002#\u000e<%NO08H7'oyB9@US\u001d\nP_\u0001x8x\u001dg|o#\u0003\u0015L\u001d\u000e?;^%!'{7IZ1ϖ\u0013\u05c9$X\u0019֧d$4 N\b\u0011+֤SipҴ\u0004Qa\u00179:<Bo4H^.\u007f/y$\t:V8\u0015i\\{B;Ӻ^\u05cfFW\u0016ߜ;6r\u0001$+*{-U5ƺ\u001f̭Jr&ҋ\u007fF'-s\ruo=H٣M*93XO)Hֻ\npsC^݄>1"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\nJQJx0\u001c$MoC\u0010R9Nv\u0007PJX+\\_H", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#f\u001c?m\u0015\u001fIJKk\u0014'\u0013r`9\u00149", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b])5w\u0015.Z\u0019", "8r^;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bS", "<nS266Ga)\u0007zk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b]'7u\u00167\\\u0019", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007u\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b&c\u0012\u001c", "1n]3\\.N`\u0015\u000e~h5", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b[*@n\u001a0]P7z8(\u001e>", "5dc\u0017f6G", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011t\u001cF\u007fn\u001ag\b)\r", ">n[F`6K^\u001c\u0003x=0\u000b\u0007<i\b,\u0005<\u0010!$", "", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "0dV6a\u001aM`)|\nn9|", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;K=\u001c\u001fgaF\\", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "1n\\=b:><\u0015\u0007z", ">`a2a;'O!~", "1gX9W\u0015:[\u0019", "3kT:X5M<\u0015\u0007z", "7mS2k", "", "3mR<W,#a#\bZe,\u0005\t8t", "3kT:X5M", "3mR<W,'](g\u000be3d\u0005<k", "3mR<W,'c \u0006", "3mR<W,,S&\u0003ve0\u0012\u0005,l\u007f\u0019wG\u0011\u0017", "\"", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `5o\u001b@r,9ny/;w\u001f\u001c\\P7z4 )>H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001e~", "3mR<W,-O\u001b\u0001z]\t\u0007\u00136e{1", "B`V", "", "3mR<W,-O\u001b\u0001z]\t\u0011\u0018/", "", "3mR<W,-O\u001b\u0001z]\n\u007f\u0005<", "", "3mR<W,-O\u001b\u0001z]\u000b\u0007\u0019,l\u007f", "", "3mR<W,-O\u001b\u0001z]\f\u0006\u00197", "3md:7,LQ&\u0003\u0006m6\n", "=qS6a(E", "3mR<W,-O\u001b\u0001z]\r\u0004\u0013+t", "", "3mR<W,-O\u001b\u0001z]\u0010\u0006\u00103n\u007f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "7m[6a,\u001dS'|\bb7\f\u0013<", "3mR<W,-O\u001b\u0001z]\u0010\u0006\u0018", "3mR<W,-O\u001b\u0001z]\u0013\u0007\u00121", "", "3mR<W,-O\u001b\u0001z]\u0015\r\u00106", "3mR<W,-O\u001b\u0001z]\u001a\u007f\u0013<t", "", "3mR<W,-O\u001b\u0001z]\u001a\f\u00163n\u0002", "3mR<W,-O\u001b\u0001z]\u001dx\u0010?e", "", "3mS\u0012a*HR\u0019", "5dc\u0010h9KS\"\u000e", "7m[6a,.\\%\u000f\u0005m,{o3t\u007f5wG` \u0015Qn\u000eI", "9nc9\\5Q\u001d'~\bb(\u0004\rDa\u000f,\u0006IJ\u001c%QxW@\u007f45f\u0007\u001c>7q+[RHg2-yvkBup,NV0EVM,i\u0011vF\u001b\u0016c\u000e>4\u0019\u0015cP$m+;.\b9E\t\u001bq~\u0016\u0015\u000eB)<", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKx!\u0006\u0005%B]y';\u0003\u0012=QMD53\u001e#fn=\u0012r6[\u0005p5L[0XYQ=\"\u0010g\u0012Y:\u0017\u0012/\u0005\u000btNF&\f5\\KIh\u000e\u0010\u0012\u00159\u007flQZ\u001aPC\u001a\u0004K22JbnyTJAis@\tm,i683x\u007f#$W].\n[\\\u000f|Qyt&K\"\u0002<->]dRUyd<s\u000e#Z{\u0005\u000e98})~,\u0004Ah\u0002:", "7m[6a,.\\'\u0003|g,{q?m|(\t \n\u0015!Fo\u001b", "9nc9\\5Q\u001d'~\bb(\u0004\rDa\u000f,\u0006IJ\u001c%QxW@\u007f45f\u0007\u001c>7q+[RHg2-yvkBup,NV0EVM,i\u0011vF\u001b\u0016c\u000e>4\u001b\t[J$m-G'\u0005,VaDf\u000b\u000b\u0016\u001bs6", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0007!&Ns\u0017O@35f\u0002\u001c>q+*\\GEt}##rj\u0003\u000bl;N\u00040CS\u0018\bY`\u0002J\u0010\u0010ir\\5\u0016sfA$NM5)\u0007,V@?q\b\u0010\u001f\u000e%s~FX\u0019Gx}\u0006I&hS9hwQ@Eoh0a", ">tc\u0012_,FS\"\u000e", "9dh", "Ag^B_+\u001e\\\u0017\ty^\f\u0004\t7e\t7Z@\u0002\u0013'N~", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDVA\"\u001dlp=\u0018c\fWt1FL[\u0002", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDZA\u001e\u0015Hj7\u0011b,[L", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDZA\u001e\u0015OeG\u0016C5L\u0001&GY$", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@ExperimentalSerializationApi
abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {
    protected final JsonConfiguration configuration;
    private final Json json;
    private final Function1<JsonElement, Unit> nodeConsumer;
    private String polymorphicDiscriminator;

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractJsonTreeEncoder(Json json, Function1<? super JsonElement, Unit> function1) {
        this.json = json;
        this.nodeConsumer = function1;
        this.configuration = json.getConfiguration();
    }

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1] */
    private final AnonymousClass1 inlineUnquotedLiteralEncoder(final String str, final SerialDescriptor serialDescriptor) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.inlineUnquotedLiteralEncoder.1
            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeString(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AbstractJsonTreeEncoder.this.putElement(str, new JsonLiteral(value, false, serialDescriptor));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public SerializersModule getSerializersModule() {
                return AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1] */
    private final C14521 inlineUnsignedNumberEncoder(final String str) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.inlineUnsignedNumberEncoder.1
            private final SerializersModule serializersModule;

            {
                this.serializersModule = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte b2) {
                putUnquotedString(UByte.m9042toStringimpl(UByte.m8998constructorimpl(b2)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int i2) {
                putUnquotedString(Integer.toUnsignedString(UInt.m9075constructorimpl(i2)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long j2) {
                putUnquotedString(Long.toUnsignedString(ULong.m9154constructorimpl(j2)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short s2) {
                putUnquotedString(UShort.m9305toStringimpl(UShort.m9261constructorimpl(s2)));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public SerializersModule getSerializersModule() {
                return this.serializersModule;
            }

            public final void putUnquotedString(String s2) {
                Intrinsics.checkNotNullParameter(s2, "s");
                AbstractJsonTreeEncoder.this.putElement(str, new JsonLiteral(s2, false, null, 4, null));
            }
        };
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        JsonTreeEncoder jsonTreeEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1<JsonElement, Unit> function1 = getCurrentTagOrNull() == null ? this.nodeConsumer : new Function1<JsonElement, Unit>() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$beginStructure$consumer$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonElement jsonElement) {
                invoke2(jsonElement);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JsonElement node) {
                Intrinsics.checkNotNullParameter(node, "node");
                AbstractJsonTreeEncoder abstractJsonTreeEncoder = this.this$0;
                abstractJsonTreeEncoder.putElement(abstractJsonTreeEncoder.getCurrentTag(), node);
            }
        };
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) ? true : kind instanceof PolymorphicKind) {
            jsonTreeEncoder = new JsonTreeListEncoder(this.json, function1);
        } else if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json = this.json;
            SerialDescriptor serialDescriptorCarrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
            SerialKind kind2 = serialDescriptorCarrierDescriptor.getKind();
            if ((kind2 instanceof PrimitiveKind) || Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
                jsonTreeEncoder = new JsonTreeMapEncoder(this.json, function1);
            } else {
                if (!json.getConfiguration().getAllowStructuredMapKeys()) {
                    throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
                }
                jsonTreeEncoder = new JsonTreeListEncoder(this.json, function1);
            }
        } else {
            jsonTreeEncoder = new JsonTreeEncoder(this.json, function1);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            jsonTreeEncoder.putElement(str, JsonElementKt.JsonPrimitive(descriptor.getSerialName()));
            this.polymorphicDiscriminator = null;
        }
        return jsonTreeEncoder;
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    protected String composeName(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    protected String elementName(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return JsonNamesMapKt.getJsonElementName(descriptor, this.json, i2);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(currentTagOrNull);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (getCurrentTagOrNull() == null && TreeJsonEncoderKt.getRequiresTopLevelTag(WriteModeKt.carrierDescriptor(serializer.getDescriptor(), getSerializersModule()))) {
            JsonPrimitiveEncoder jsonPrimitiveEncoder = new JsonPrimitiveEncoder(this.json, this.nodeConsumer);
            jsonPrimitiveEncoder.encodeSerializableValue(serializer, t2);
            jsonPrimitiveEncoder.endEncode(serializer.getDescriptor());
            return;
        }
        AbstractJsonTreeEncoder abstractJsonTreeEncoder = this;
        if (!(serializer instanceof AbstractPolymorphicSerializer) || abstractJsonTreeEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(abstractJsonTreeEncoder, t2);
            return;
        }
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
        String strClassDiscriminator = PolymorphicKt.classDiscriminator(serializer.getDescriptor(), abstractJsonTreeEncoder.getJson());
        AbstractJsonTreeEncoder abstractJsonTreeEncoder2 = abstractJsonTreeEncoder;
        Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.Any");
        SerializationStrategy serializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, abstractJsonTreeEncoder2, t2);
        PolymorphicKt.validateIfSealed(abstractPolymorphicSerializer, serializationStrategyFindPolymorphicSerializer, strClassDiscriminator);
        PolymorphicKt.checkKind(serializationStrategyFindPolymorphicSerializer.getDescriptor().getKind());
        this.polymorphicDiscriminator = strClassDiscriminator;
        serializationStrategyFindPolymorphicSerializer.serialize(abstractJsonTreeEncoder2, t2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedBoolean(String tag, boolean z2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Boolean.valueOf(z2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedByte(String tag, byte b2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Byte.valueOf(b2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedChar(String tag, char c2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(String.valueOf(c2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedDouble(String tag, double d2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Double.valueOf(d2)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(d2), tag, getCurrent().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedEnum(String tag, SerialDescriptor enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        putElement(tag, JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(i2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedFloat(String tag, float f2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Float.valueOf(f2)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(f2), tag, getCurrent().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public Encoder encodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? inlineUnsignedNumberEncoder(tag) : StreamingJsonEncoderKt.isUnquotedLiteral(inlineDescriptor) ? inlineUnquotedLiteralEncoder(tag, inlineDescriptor) : super.encodeTaggedInline(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedInt(String tag, int i2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Integer.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedLong(String tag, long j2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Long.valueOf(j2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedNull(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonNull.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedShort(String tag, short s2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, JsonElementKt.JsonPrimitive(Short.valueOf(s2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedString(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedValue(String tag, Object value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, JsonElementKt.JsonPrimitive(value.toString()));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    protected void endEncode(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.nodeConsumer.invoke(getCurrent());
    }

    public abstract JsonElement getCurrent();

    @Override // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final SerializersModule getSerializersModule() {
        return this.json.getSerializersModule();
    }

    public abstract void putElement(String str, JsonElement jsonElement);

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }
}
