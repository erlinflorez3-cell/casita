package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.modules.SerializersModule;
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
@Metadata(bv = {}, d1 = {"ЯŃ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*\u001dz\u00044*[,qY;]\u001a\u0004\"\u0011OdgoñRZ\u0019L\u0017\u0006\u001czr,Wa\u0001ز\u001a\u000fHBw?9Nw=O`|Ȃ\r H\"@y\u000b\u0002\"*^\u0010~zYK\u0014\u00126Bx:`\rU\u0005 \u0012\u000e>.\u0004&ձoNDRtҗB/1\u0007qBT'g0\u000bS\u0015FZ(\u0015vo#3¨?5+%[\u0003\rSc?\u0019?yܵ\rh5.3IyW>X\u000eϬ\u001dۀW\rsr.\\\u000bSh\f53WcQS\u0014ߊ\u000e\u07be,\rj\u0003>\u0006UHnZ t\u0018\u0012Au\u000bSnR\u0012bP\u0003\u0013ad\u001b5\u0004A0Q\u001b\u0015WqG'UO\u0004\u0015\u0011.%\u0017mOZ\u0003\u0016\u05ce\u0019\u001bb\u0001\u0012^aDKRf\n\bH}\b~e\u001a*24W\u0004=\u0001).E+GiG*9u\u0012LTi\r\u0004\u000fgih\u0001Pغ&n$Cr\u0017\u001at\\d3\u0007\u0001XfH)MJqM\u0012Pc.z\u0010<gD0VUŖw\nc\\2%]qg\u000e|\f&\bIoCD\u007feߧe\\|6OBh(hhHY2~l92Avzݻ{\u0006Jp\u001c\u00198b\u0002\u001e:2W(l\u0017X\u0003dao\u001eOݣ`ӳ\u0014~bXl\u0011wJ\r\t/w\rt}\u0010\u0011IZ\r'6uO_^1&\u0004I\u00198\u000bK\u001f~\"*\u000e{\u0015UZ\u0018.u\u0004#P\u001a(ai/k?U\u0013q@\u0010Z]L!\r\u0002Q O\u0013|(=\u0002|v}\u0016\u001a\t,\u000fzzSb3:v\r\u0010S\fr0\u0012at,\u000ew\u001d!ipar1\u0001lRF0\u001d\u001fLB1s0-M-qXc*@\"=Iy]\u0018\u0017^}p7>t\u00149rw^}p\bu2ioy]\rZ:$\u001b \t\\3\u0006\u0016z!4;ZxEr\u0019n8{<u\u0012/\u0015:F\tV\naCs\fnF_X/\n\u0012\\lQa)M\u0002\u000f\u001eqY\u0005#J=GQ\u0010yt ZU \u0005~)\u001dxC\u0002WNAi\n%B\u000fӗBKd\b9\u0004\u0005m\u0014,\u0013\u007ft|?\u001b@r\f;\u0005?\u0005\u0003j\u0018`\u000bpGp!p -Qc$\u0007]I\u0007\u0004E\u001bN*FݏW\u001d\u0017^3v\r+=+r{Y\u001d.߰\u000f*ugQ\u000b\u001a<\u0014I9m2\u000f:zH\u0001+j0\u001b\u007fpWs۞4^\u0019\u001b-\\r=*f\u0001uR-\r#\u0015\u000ejQU\u001fa]\u00018z-zu(;QB\u0019\u0017r>M EqTdE\u0006cTmMx0?{\u0006p\u0002}P..q\u001ctO\u0004\b\u0012t&u\u001bh38*+\u0018\u0017^h 2>zx\u0001&F\bdl27\u0010CvY\u001a)gTw7z\u0010ZK\u0017\u0004`ɫn̼rU\u0013ӆ7=d\u0007\u0007-~+_\u07b3Oܻ\u0017Xbϐa_.g)\u007fB%|̂Bʭf)\u0018˖4z~ng[;/\u0006\u058b,Հ56Zʴ\u0016!\u007f\u0007\u0012<%4#@nMlj_ϡnܣ[\u000efȥx|\u0003\u0013A\u001e\r\u0003X`'\u0012bE\t\u001d\u00137\u000eآ!˝\u0011Ih\u0007\u0012X\u001a4/EjA16` FČ\u0003\u05ce\u0007:jߍP<P\u001f\u000b\u007f\u0016C\u0004ČVٗ\u001e-aݾ\u0006f\t>Y^јFT"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u001c\\P;g<\"\u001ejFG\u0011l\fWt1FL[\u0002", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b])5w\u0015.Z\u0019", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#Y\u001dE|#*KR\u001bt2(\u0014hn\u000f", "=tc=h;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MD]A\"$hn\u000f", "8r^;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bS", ";nS2", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_ ZGJk\u001c(\u0014h7", ";nS2E,Na\u0019\\v\\/|", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@)>h}-@i\u001dw2QEt&+\u0019waF\\J2X\u0006.KUaujR\u007fA\u0010\u0019^#J:\u0011\u000fb\u000b)|N@hl:S\u000b\u0011O\u0007\u0016%\u00159s\u0004\fd\u0010T}\u0011|E>dU]i\u0003\u0011FSl3.\u0010h,\\GC \u001b;\u000b(l_.q\u0006R\u0011HH`mqV ~A7\b{[SIk\\@\n#.O\u0006\u0001[7f~4>\u0012\u0012>3\u0016m\u0003Uf\u0018K4<\u0006", "1n\\=b:>`", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\fWKFuB\u001e\">", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@)>h}-@i\u001dw+MCv>,\u0015u7 \rm;Uz0Z\u0016\\,iVnD\u0018'V\u001dR5\u0016N^O.w\u000e\u001c-\u00125\u001fhAr\u0010\u0013\u001a\u0017H4~Bc\u0014C\u0001\u0019\u000b=8lPb)~UKN,.m\u001b_*e6Am\u0006~\u001d*h88\t{)\u0007YX\u0004vnK\"\u000e\u00022>z_BLsj8\u0004+)TE| <a>\u0010\u00037\r\u001434n\u0004Ktm\u0002O", "1n]3\\.N`\u0015\u000e~h5", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b[*@n\u001a0]P7z8(\u001e>", "4na0X\u0018N](\u0003\u0004`", "", "5dc\u0017f6G", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011t\u001cF\u007fn\u001ag\b)\r", ")KZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u007f@k -MP\u0011", ">n[F`6K^\u001c\u0003x=0\u000b\u0007<i\b,\u0005<\u0010!$", "", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "0dV6a\u001aM`)|\nn9|", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;K=\u001c\u001fgaF\\", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "1n\\=b:>`t\r", "\"", "1n\\=b:>`v\fzZ;\u0007\u0016", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "EqXAX9", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc\u001es =TGD~},\u0015ue5\u000egAJ\u0006+QU\u00181j\\{\u0007\u0018\u001bi\u000e[4\t\f#\u001f.vOA-\b9\u001f", "3mR<W,\u001b]#\u0006zZ5", "", "D`[BX", "3mR<W,\u001bg(~", "", "3mR<W,\u001cV\u0015\f", "", "3mR<W,\u001d]){\u0002^", "", "3mR<W,\u001eZ\u0019\u0007zg;", "7mS2k", "", "3mR<W,\u001e\\)\u0007", "3md:7,LQ&\u0003\u0006m6\n", "3mR<W,\u001fZ#z\n", "", "3mR<W,\"\\ \u0003\u0004^", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "3mR<W,\"\\(", "3mR<W,#a#\bZe,\u0005\t8t", "3kT:X5M", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b]'7u\u00167\\\u0019", "3mR<W,%]\"\u0001", "", "3mR<W,'c \u0006", "3mR<W,'c \u0006v[3|v/r\u0004$\u0003D\u0016\u0013\u0014NomCv-5b\r", "", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000b.RX;cV{P] Z\u001bR'\u0014\tn=3rN@hu,V\u00067o\u0005!\u0012\u001d9ty0e\u001dC\t\u0015wU~OKUpu\u0011HAk,.u\\\"\\8IyWb", "3mR<W,,S&\u0003ve0\u0012\u0005,l\u007f\u0019wG\u0011\u0017", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `5o\u001b@r,9ny/;w\u001f\u001c\\P7z4 )>H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001e~", "3mR<W,,V#\f\n", "", "3mR<W,,b&\u0003\u0004`", "3mR<W,-g$~^g-\u0007", "3mS g9NQ(\u000f\b^", "Ag^B_+\u001e\\\u0017\ty^\f\u0004\t7e\t7Z@\u0002\u0013'N~", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {
    private final Composer composer;
    private final JsonConfiguration configuration;
    private boolean forceQuoting;
    private final Json json;
    private final WriteMode mode;
    private final JsonEncoder[] modeReuseCache;
    private String polymorphicDiscriminator;
    private final SerializersModule serializersModule;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonEncoder(Composer composer, Json json, WriteMode mode, JsonEncoder[] jsonEncoderArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = jsonEncoderArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int iOrdinal = mode.ordinal();
        if (jsonEncoderArr != null) {
            JsonEncoder jsonEncoder = jsonEncoderArr[iOrdinal];
            if (jsonEncoder == null && jsonEncoder == this) {
                return;
            }
            jsonEncoderArr[iOrdinal] = this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamingJsonEncoder(JsonWriter output, Json json, WriteMode mode, JsonEncoder[] modeReuseCache) {
        this(ComposersKt.Composer(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }

    private final /* synthetic */ <T extends Composer> T composerAs(Function2<? super JsonWriter, ? super Boolean, ? extends T> function2) {
        Composer composer = this.composer;
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        return composer instanceof Composer ? (T) this.composer : function2.invoke(this.composer.writer, Boolean.valueOf(this.forceQuoting));
    }

    private final void encodeTypeInfo(SerialDescriptor serialDescriptor) {
        this.composer.nextItem();
        String str = this.polymorphicDiscriminator;
        Intrinsics.checkNotNull(str);
        encodeString(str);
        this.composer.print(AbstractJsonLexerKt.COLON);
        this.composer.space();
        encodeString(serialDescriptor.getSerialName());
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        JsonEncoder streamingJsonEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeSwitchMode = WriteModeKt.switchMode(getJson(), descriptor);
        if (writeModeSwitchMode.begin != 0) {
            this.composer.print(writeModeSwitchMode.begin);
            this.composer.indent();
        }
        if (this.polymorphicDiscriminator != null) {
            encodeTypeInfo(descriptor);
            this.polymorphicDiscriminator = null;
        }
        if (this.mode == writeModeSwitchMode) {
            return this;
        }
        JsonEncoder[] jsonEncoderArr = this.modeReuseCache;
        if (jsonEncoderArr == null || (streamingJsonEncoder = jsonEncoderArr[writeModeSwitchMode.ordinal()]) == null) {
            streamingJsonEncoder = new StreamingJsonEncoder(this.composer, getJson(), writeModeSwitchMode, this.modeReuseCache);
        }
        return streamingJsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z2) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(z2));
        } else {
            this.composer.print(z2);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b2) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) b2));
        } else {
            this.composer.print(b2);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c2) {
        encodeString(String.valueOf(c2));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double d2) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(d2));
        } else {
            this.composer.print(d2);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(d2), this.composer.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public boolean encodeElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i3 != 1) {
            boolean z2 = false;
            if (i3 != 2) {
                if (i3 != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.print(AbstractJsonLexerKt.COMMA);
                    }
                    this.composer.nextItem();
                    encodeString(JsonNamesMapKt.getJsonElementName(descriptor, getJson(), i2));
                    this.composer.print(AbstractJsonLexerKt.COLON);
                    this.composer.space();
                } else {
                    if (i2 == 0) {
                        this.forceQuoting = true;
                    }
                    if (i2 == 1) {
                        this.composer.print(AbstractJsonLexerKt.COMMA);
                        this.composer.space();
                        this.forceQuoting = false;
                    }
                }
            } else if (this.composer.getWritingFirst()) {
                this.forceQuoting = true;
                this.composer.nextItem();
            } else {
                if (i2 % 2 == 0) {
                    this.composer.print(AbstractJsonLexerKt.COMMA);
                    this.composer.nextItem();
                    z2 = true;
                } else {
                    this.composer.print(AbstractJsonLexerKt.COLON);
                    this.composer.space();
                }
                this.forceQuoting = z2;
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.print(AbstractJsonLexerKt.COMMA);
            }
            this.composer.nextItem();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(SerialDescriptor enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.getElementName(i2));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f2) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(f2));
        } else {
            this.composer.print(f2);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(f2), this.composer.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public Encoder encodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(descriptor)) {
            ComposerForUnsignedNumbers composerForUnsignedNumbers = this.composer;
            if (!(composerForUnsignedNumbers instanceof ComposerForUnsignedNumbers)) {
                composerForUnsignedNumbers = new ComposerForUnsignedNumbers(composerForUnsignedNumbers.writer, this.forceQuoting);
            }
            return new StreamingJsonEncoder(composerForUnsignedNumbers, getJson(), this.mode, (JsonEncoder[]) null);
        }
        if (!StreamingJsonEncoderKt.isUnquotedLiteral(descriptor)) {
            return super.encodeInline(descriptor);
        }
        ComposerForUnquotedLiterals composerForUnquotedLiterals = this.composer;
        if (!(composerForUnquotedLiterals instanceof ComposerForUnquotedLiterals)) {
            composerForUnquotedLiterals = new ComposerForUnquotedLiterals(composerForUnquotedLiterals.writer, this.forceQuoting);
        }
        return new StreamingJsonEncoder(composerForUnquotedLiterals, getJson(), this.mode, (JsonEncoder[]) null);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i2) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(i2));
        } else {
            this.composer.print(i2);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j2) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(j2));
        } else {
            this.composer.print(j2);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        this.composer.print("null");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(SerialDescriptor descriptor, int i2, SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (t2 != null || this.configuration.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, i2, serializer, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        StreamingJsonEncoder streamingJsonEncoder = this;
        if (!(serializer instanceof AbstractPolymorphicSerializer) || streamingJsonEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(streamingJsonEncoder, t2);
            return;
        }
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
        String strClassDiscriminator = PolymorphicKt.classDiscriminator(serializer.getDescriptor(), streamingJsonEncoder.getJson());
        StreamingJsonEncoder streamingJsonEncoder2 = streamingJsonEncoder;
        Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.Any");
        SerializationStrategy serializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, streamingJsonEncoder2, t2);
        PolymorphicKt.validateIfSealed(abstractPolymorphicSerializer, serializationStrategyFindPolymorphicSerializer, strClassDiscriminator);
        PolymorphicKt.checkKind(serializationStrategyFindPolymorphicSerializer.getDescriptor().getKind());
        this.polymorphicDiscriminator = strClassDiscriminator;
        serializationStrategyFindPolymorphicSerializer.serialize(streamingJsonEncoder2, t2);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s2) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) s2));
        } else {
            this.composer.print(s2);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.composer.printQuoted(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.unIndent();
            this.composer.nextItem();
            this.composer.print(this.mode.end);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }
}
