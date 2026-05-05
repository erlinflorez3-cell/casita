package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.ChunkedDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŅ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.Jչ*,(w\u000f߿r9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006\"\u000fOVg}nRҙ\u0013C\u001d\f\u001eюr,_U\u0001]\u0018\u0010:B\u0006?;Mu>A`\u000b6\rړ:\"Fy\rЏ\"*V\u0019~zIL\u0014\u0012>CxíZ\r[\u000f\"Ň\u000e>.\u0005&\\mP>HzbBǂ+\u0003\u007fBV'e0\u0005M#F\\'\u0013vi\u001e9G?5\u001b&[\u0003\u0015Qc?\tAy=\u001bh/'1L{WD`\bϬ\u001d+]\u0019er,\\\rQv\f/+ecSP\u00141}\t\u0012Ȟl\u0004<\u0005WH\\-Jf6\u000fksE\u0014m`\u0006lD\u0018z\u00109')\u000e7C9IkaeI\u001ff7*\f\u001d\"1\t\u0007!\n]\u001ef#%lyg0\u007fKףLN\u0018e\u0006{\u0012\nz\u0002X\u001e`K\u000e7\u0014\u0011\\ kK$?1<\u0004\u0002v`.vMvvp\u0002Rv^Rr$?B\t:cth\u0013\u000bhT\u0007<WMdZ\u0015\u001e \u0013Nz>Pi+\u001eogh\u0018\r\u0014qR+=\nOY\u001d\u0010Tk\u0002dAZic>\b\u0019\u000b\\MJ\n\u001dX\u0015R\u0004\u0010hd@\"`Q1$@\nRv$\u0013`O\" BUI\u0019\u000b\u001e\u000f\u0017fHO'!_\t\u0014V\u0013\u001dA2/\u0002$#61Tjx\bg'Rr\u0011)(;oi5G6\u001c61:\u000bR\u001f~\"0\u000e{\u0015MZ\u001e.u\u0004\ff\u0016b?_aU\u0013=2oFJ3S\u0001\u000be\u007f]X'C\u0003\bDSh\\\u0006N~94n!bQj\u0016P.%\u0007k\u0016r8\u0012at\u000bwgb\u0013s>w{IY\u0005\bF6\u001d\u001fd_!q(ĜCgs++\u001e\u0010\u0014]\u001e\u0012aw\u000fFy\u0011\u001fV~s?Di&qrQ$lity_\r{:&\u0003\u0002\t\u00031\fڇF\tBK{gO$\tV~\b+1\u0004օ\u0015f=zd\u0017R\u0019\u007f\u007fD.&d\"\u007fD(ڎG%\u001f\u000e\u001cm{/c\\9\rU\u001eS\u0002?2*\u001ckd\u001dk+2>K\f\u0018d]k\u0002\u0013\u0003!?D=L\u00179\bҰm\u0010\u0016C\u0010LeX'4Hya!\u001eV\t\\\u0005d3(\fti0\u000fJ'3L={1M{T!Gc`\u001d\u0004!\u0017#\u0003O-ok?\rbGh@X/)uaQ\u0018\u001a62\fom4}\u001a\b0|K^H\u001fGY)_%9%\u000b\u001ex\\5\u000f\u0012\u0015pv$?})\b>@\u0018`#\u0019}76b}X\\\u0005OCH\u000fmװ+ܰ\u0010|k˪k9\u0014DE=wzjՠ\b\u009cW;\u0006Иp.5\u000e\r#rV<q`܄'Ɛ\u001aq\u001eȈR\u0017!a8\u0006DI#\u0005`ڗ\n˩S\u0002;øcmgm\u0010!n*߿p\fJŮ\u0001z\u0010vzw?c\u0019\t~1\u0005\u0001%߲'Ɂ\u000bߓQ.\u001b̽+F\u001fW8X?\u0005jݾ(̢:\bjϪ`aq}\tk}qcĢ1֗.g9Èj \u00046\b\u000eċ.("}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u001c\\P;g<\"\u001ejFG\u0011l\u000bNt1FL[\u0002", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b\\ 5w\u0015.Z\u0019", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[#Gv\u001c.L\";i>\u001d\u0015u7", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#Y\u001dE|#*KR\u001ak2(\u0014hn\u000f", "8r^;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bS", ";nS2", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_ ZGJk\u001c(\u0014h7", ":dg2e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\nJQJx0\u001c$MoC\u0010J,av4\u001d", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "2hb0e0FW\"z\nh9_\u00136d\u007f5", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u001c\\P;g<\"\u001ejFG\u0011l\u000bNt1FL[j;V\u0001;!\u0016b\u0012W'\u001c\u000ff$.uC7,]", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007u\u001es =TGD~},\u0015ue5\u000egAJ\u0006+QU\u00181j\\{\u0007\u0018\u001bi\u000e[4\t\f#31rS7\u0007\u0012+IW\"n\u000b\u001b\u001d\u0012>}:PV\u001dKu\u001cyV%wJchCLOOksh\u0015n\u001diC6+]M\u0016)w]*\b\u000b8\u001f|[`gzG&P\u001f*H|bJN\u0003\u001fJt4#G\u0003{'.gx5}v\u0003484q\tVv\"KlB\u0003,iE#-\u0015<!=Xg\u0001{H\u001b>\u0006g\u0012\u001di9:,/scU\u0013\u0003d\u001bp1pc\u000b@\u001c\u000bLSx^+O\u000eBh\u0003\u0011\u0010P\u0012|rI?#X\n\u001cUR,ho\u0003\u0001p\u0017\u001c;T\u001c]\u001df7c?Q\u001c\u0005wB\u0019^cJ\u0014pUe1<", "1n]3\\.N`\u0015\u000e~h5", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b[*@n\u001a0]P7z8(\u001e>", "1ta?X5M7\"}zq", "", "3kT:X5M;\u0015\f\u0001^9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDK;\u001e\u001dhjHn_9Tv4\u001d", "5dc\u0017f6G", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011t\u001cF\u007fn\u001ag\b)\r", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "0dV6a\u001aM`)|\nn9|", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaF\\", "1gT0^\u0013>O\u0018\u0003\u0004`\n\u0007\u00117a", "", "1nT?V,\"\\$\u000f\nO(\u0004\u0019/", "", "7mS2k", "2dR<W,\u001b]#\u0006zZ5", "2dR<W,\u001bg(~", "", "2dR<W,\u001cV\u0015\f", "", "2dR<W,\u001d]){\u0002^", "", "2dR<W,\u001eZ\u0019\u0007zg;`\u0012.e\u0013", "2dR<W,\u001e\\)\u0007", "3md:7,LQ&\u0003\u0006m6\n", "2dR<W,\u001fZ#z\n", "", "2dR<W,\"\\ \u0003\u0004^", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#\\ 5w\u0015.Z\u0019", "2dR<W,\"\\(", "2dR<W,#a#\bZe,\u0005\t8t", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b]'7u\u00167\\\u0019", "2dR<W,%W'\u000e^g+|\u001c", "2dR<W,%]\"\u0001", "", "2dR<W,&O$b\u0004],\u0010", "2dR<W,'](g\u000be3d\u0005<k", "2dR<W,'c \u0006", "", "2dR<W,(P\u001e~xm\u0010\u0006\b/x", "2dR<W,,S&\u0003ve0\u0012\u0005,l\u007f\b\u0003@\t\u0017 V", "\"", "2db2e0:Z\u001d\u0014zk", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", ">qTC\\6Na\nz\u0002n,", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000b.RX;cV{P] Z\u001bR'\u0014\tn=3rN@hf,W\u0002Hl|\u0013\u001a#1ytL_}V\u0007\u0011\u0005A+|\u001c@duX=\u000fi&m\u000e)\u0007Y?:\"#G\\\u0002mL?\u0006EZ\r{TCQdL\u0019xGy", "2dR<W,,S&\u0003ve0\u0012\u0005,l\u007f\u0019wG\u0011\u0017", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `&o\u001c<\u0004)1`\u000253|\u001a8V1Jx0-\u0015ju\u000fJJ1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$", "2dR<W,,V#\f\n", "", "2dR<W,,b&\u0003\u0004`", "", "2dR<W,,b&\u0003\u0004`\n\u007f\u00198k\u007f'", "1n]@h4>1\u001c\u000f\u0004d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1gd;^", "2dR<W,,b&\u0003\u0004`\u0012|\u001d", "3mS g9NQ(\u000f\b^", "6`]1_,.\\\u001f\b\u0005p5", "9dh", "AjX=?,?b#\u0010zk\f\u0004\t7e\t7\n", "Bqh ^0I", "CmZ;b>G9\u0019\u0013", "\u0012hb0e0FW\"z\nh9_\u00136d\u007f5", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder, ChunkedDecoder {
    private final JsonConfiguration configuration;
    private int currentIndex;
    private DiscriminatorHolder discriminatorHolder;
    private final JsonElementMarker elementMarker;
    private final Json json;
    public final AbstractJsonLexer lexer;
    private final WriteMode mode;
    private final SerializersModule serializersModule;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0005ӬBߚ(\u0007\u0015iy=TkV.jU@\u000e\u001a|Č([2s\u0014Mc\u001a\u0016$\u001fN|h\u001er\t^aÄ\u001bو\u001axrߚ֘Y{"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u001c\\P;g<\"\u001ejFG\u0011l\u000bNt1FL[j;V\u0001;!\u0016b\u0012W'\u001c\u000ff$.uC7,]", "", "2hb0e0FW\"z\nh9k\u0013\u001dk\u00043", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DiscriminatorHolder {
        public String discriminatorToSkip;

        public DiscriminatorHolder(String str) {
            this.discriminatorToSkip = str;
        }
    }

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
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonDecoder(Json json, WriteMode mode, AbstractJsonLexer lexer, SerialDescriptor descriptor, DiscriminatorHolder discriminatorHolder) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = discriminatorHolder;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new JsonElementMarker(descriptor);
    }

    private final void checkLeadingComma() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean coerceInputValue(SerialDescriptor serialDescriptor, int i2) {
        String strPeekString;
        Json json = this.json;
        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i2);
        if (!elementDescriptor.isNullable() && this.lexer.tryConsumeNull(true)) {
            return true;
        }
        if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && this.lexer.tryConsumeNull(false)) || (strPeekString = this.lexer.peekString(this.configuration.isLenient())) == null || JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, strPeekString) != -3)) {
            return false;
        }
        this.lexer.consumeString();
        return true;
    }

    private final int decodeListIndex() {
        boolean zTryConsumeComma = this.lexer.tryConsumeComma();
        if (!this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma) {
                return -1;
            }
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = this.currentIndex;
        if (i2 != -1 && !zTryConsumeComma) {
            AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i3 = i2 + 1;
        this.currentIndex = i3;
        return i3;
    }

    private final int decodeMapIndex() {
        int i2 = this.currentIndex;
        boolean zTryConsumeComma = false;
        boolean z2 = i2 % 2 != 0;
        if (!z2) {
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
        } else if (i2 != -1) {
            zTryConsumeComma = this.lexer.tryConsumeComma();
        }
        if (!this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma) {
                return -1;
            }
            AbstractJsonLexer.fail$default(this.lexer, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z2) {
            if (this.currentIndex == -1) {
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                int i3 = abstractJsonLexer.currentPosition;
                if (zTryConsumeComma) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer, "Unexpected trailing comma", i3, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                int i4 = abstractJsonLexer2.currentPosition;
                if (!zTryConsumeComma) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer2, "Expected comma after the key-value pair", i4, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i5 = this.currentIndex + 1;
        this.currentIndex = i5;
        return i5;
    }

    private final int decodeObjectIndex(SerialDescriptor serialDescriptor) {
        boolean zTryConsumeComma = this.lexer.tryConsumeComma();
        while (this.lexer.canConsumeValue()) {
            String strDecodeStringKey = decodeStringKey();
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(serialDescriptor, this.json, strDecodeStringKey);
            boolean z2 = false;
            if (jsonNameIndex == -3) {
                zTryConsumeComma = false;
                z2 = true;
            } else {
                if (!this.configuration.getCoerceInputValues() || !coerceInputValue(serialDescriptor, jsonNameIndex)) {
                    JsonElementMarker jsonElementMarker = this.elementMarker;
                    if (jsonElementMarker != null) {
                        jsonElementMarker.mark$kotlinx_serialization_json(jsonNameIndex);
                    }
                    return jsonNameIndex;
                }
                zTryConsumeComma = this.lexer.tryConsumeComma();
            }
            if (z2) {
                zTryConsumeComma = handleUnknown(strDecodeStringKey);
            }
        }
        if (zTryConsumeComma) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        JsonElementMarker jsonElementMarker2 = this.elementMarker;
        if (jsonElementMarker2 != null) {
            return jsonElementMarker2.nextUnmarkedIndex$kotlinx_serialization_json();
        }
        return -1;
    }

    private final String decodeStringKey() {
        return this.configuration.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeKeyString();
    }

    private final boolean handleUnknown(String str) {
        if (this.configuration.getIgnoreUnknownKeys() || trySkip(this.discriminatorHolder, str)) {
            this.lexer.skipElement(this.configuration.isLenient());
        } else {
            this.lexer.failOnUnknownKey(str);
        }
        return this.lexer.tryConsumeComma();
    }

    private final void skipLeftoverElements(SerialDescriptor serialDescriptor) {
        while (decodeElementIndex(serialDescriptor) != -1) {
        }
    }

    private final boolean trySkip(DiscriminatorHolder discriminatorHolder, String str) {
        if (discriminatorHolder == null || !Intrinsics.areEqual(discriminatorHolder.discriminatorToSkip, str)) {
            return false;
        }
        discriminatorHolder.discriminatorToSkip = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeSwitchMode = WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(writeModeSwitchMode.begin);
        checkLeadingComma();
        int i2 = WhenMappings.$EnumSwitchMapping$0[writeModeSwitchMode.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer, descriptor, this.discriminatorHolder);
        }
        return (this.mode == writeModeSwitchMode && this.json.getConfiguration().getExplicitNulls()) ? this : new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return this.configuration.isLenient() ? this.lexer.consumeBooleanLenient() : this.lexer.consumeBoolean();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b2 = (byte) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == b2) {
            return b2;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String strConsumeStringLenient = this.lexer.consumeStringLenient();
        if (strConsumeStringLenient.length() == 1) {
            return strConsumeStringLenient.charAt(0);
        }
        AbstractJsonLexer.fail$default(this.lexer, "Expected single char, but got '" + strConsumeStringLenient + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String strConsumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            double d2 = Double.parseDouble(strConsumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues() || !(Double.isInfinite(d2) || Double.isNaN(d2))) {
                return d2;
            }
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Double.valueOf(d2));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'double' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        int iDecodeListIndex = i2 != 2 ? i2 != 4 ? decodeListIndex() : decodeObjectIndex(descriptor) : decodeMapIndex();
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(iDecodeListIndex);
        }
        return iDecodeListIndex;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, decodeString(), " at path " + this.lexer.path.getPath());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String strConsumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            float f2 = Float.parseFloat(strConsumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues() || !(Float.isInfinite(f2) || Float.isNaN(f2))) {
                return f2;
            }
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Float.valueOf(f2));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'float' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(descriptor) ? new JsonDecoderForUnsignedTypes(this.lexer, this.json) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i2 = (int) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == i2) {
            return i2;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse int for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return ((jsonElementMarker != null ? jsonElementMarker.isUnmarkedNull$kotlinx_serialization_json() : false) || AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, null)) ? false : true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(SerialDescriptor descriptor, int i2, DeserializationStrategy<? extends T> deserializer, T t2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z2 = this.mode == WriteMode.MAP && (-1) - (((-1) - i2) | ((-1) - 1)) == 0;
        if (z2) {
            this.lexer.path.resetCurrentMapKey();
        }
        T t3 = (T) super.decodeSerializableElement(descriptor, i2, deserializer, t2);
        if (z2) {
            this.lexer.path.updateCurrentMapKey(t3);
        }
        return t3;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if (!(deserializer instanceof AbstractPolymorphicSerializer) || this.json.getConfiguration().getUseArrayPolymorphism()) {
                return deserializer.deserialize(this);
            }
            String strClassDiscriminator = PolymorphicKt.classDiscriminator(deserializer.getDescriptor(), this.json);
            String strConsumeLeadingMatchingValue = this.lexer.consumeLeadingMatchingValue(strClassDiscriminator, this.configuration.isLenient());
            DeserializationStrategy<T> deserializationStrategyFindPolymorphicSerializerOrNull = strConsumeLeadingMatchingValue != null ? ((AbstractPolymorphicSerializer) deserializer).findPolymorphicSerializerOrNull(this, strConsumeLeadingMatchingValue) : null;
            if (deserializationStrategyFindPolymorphicSerializerOrNull == null) {
                return (T) PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializer);
            }
            this.discriminatorHolder = new DiscriminatorHolder(strClassDiscriminator);
            return deserializationStrategyFindPolymorphicSerializerOrNull.deserialize(this);
        } catch (MissingFieldException e2) {
            throw new MissingFieldException(e2.getMissingFields(), e2.getMessage() + " at path: " + this.lexer.path.getPath(), e2);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s2 = (short) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == s2) {
            return s2;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        return this.configuration.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.ChunkedDecoder
    public void decodeStringChunked(Function1<? super String, Unit> consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        this.lexer.consumeStringChunked(this.configuration.isLenient(), consumeChunk);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.json.getConfiguration().getIgnoreUnknownKeys() && descriptor.getElementsCount() == 0) {
            skipLeftoverElements(descriptor);
        }
        this.lexer.consumeNextToken(this.mode.end);
        this.lexer.path.popDescriptor();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
