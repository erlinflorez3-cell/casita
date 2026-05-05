package kotlinx.serialization.json;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToStringWriter;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.json.internal.WriteMode;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN7ZS@\u000fsڔ<$q$yCAV\"}0\u0015WNmhvJp\u000bK\u000f\f\u001a\u0001jBI]xs\u0012\u0017˰H$U\u074ck\u0012m9\u000fsn\u0004Br7>{\u0015\u0005(*`\u0010%{SO\u001a\u0014H@\u001f=ň\u0011M\u0013\u001eZ+L/\u0019\u001e#wn8NǍkJ_-\u0011zZT7a@|\u0014\u001dtfW\u0011\u0005t6+nK߱\u0019%a\u0018OwiU\u001b?8M%j-ݐ9Y$aDi\u0018\u001a%-_\r$\u0003Tn5Un#?+}{ׂT\u000e6\u0011C!\u001bV\u001c\u000e4;h03Կt\u0018>=\u0003\u000ekF`\u0004nBF\u000b\u0010RG)\u000ePC9avЂe;'l\u007f!\u0013,6#/\u0007A]Zוn%K^\u0006lIWP?XNPik\n4tp\u001fB\u0004vWĬ3{\u001fN_1E|Q#O\u007f2LR~\u000f\u0005\u000f\u0001$\u0004`MX\"\u001d\u001cmѧ_ȳ\\ֈh\u0011s¬dZ2\u0018[$l\t\u0004\u0011!*-\u0007J!=\u0010|PŹmpUΪ\"'5qEe?}\u001cYQ^a8(ӆ\u0012уV|\u001c̳Td\u000betPͰ\u000bZ\u007fLϘ6m"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bS", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005V|\u0012Ex\u0006?f\u0006\u001cFC", "1n]3\\.N`\u0015\u000e~h5", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b[*@n\u001a0]P7z8(\u001e>", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007}Av\u00172OSHgC\"\u001fq7 \rm;Uz0Z\u0016\\,iVnD\u0018'V\u001dR5\u0016NaK#~K7-Q\u001aI\u000f?d\b\u0010+\u000eBxXLU Nyj92", "-rR5X4:1\u0015|}^", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\rMQ9x8)$rn'\u0005f,Vr\u0005CJQ,2", "5dc,f*AS!zXZ*\u007f\tmk\n7\u0003D\n*\u0011Uo\u001b@r,9ny/;w\u001f(RQEtr\u001a\u001eqkH\u0003r0X\u007f5", "u(E", "5dc,f*AS!zXZ*\u007f\tmk\n7\u0003D\n*\u0011Uo\u001b@r,9ny/;w\u001f(RQEt", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011t\u001cF\u007fn9b\r Dv\u00125\u0017\";y2+\u0019spC\u0014Q*Qv/C*J*_RH", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011t\u001cF\u007fn\u001ag\b)\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "2dR<W,\u001f`#\u0007_l6\u0006h6e\b(\u0005O", "\"", "2db2e0:Z\u001d\u0014zk", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "3kT:X5M", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b]'7u\u00167\\\u0019", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `&o\u001c<\u0004)1`\u000253|\u001a8V1Jx0-\u0015ju\u000fmi6]}+P_\u0018:\\_v9\u001b\u0016o\n]/\u0017\u000e#F2xM\u0001\u0004\u00166RaBh\t\f\u001f\u001d\u000b.WGR!CC\u001cqJ+20VdyEP\u001b", "2dR<W,\u001f`#\u0007hm9\u0001\u00121", "Asa6a.", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `&o\u001c<\u0004)1`\u000253|\u001a8V1Jx0-\u0015ju\u000fmh(_rpNHW.&@\u0002J\u0018\u001b\\c\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "3mR<W,-]}\r\u0005g\f\u0004\t7e\t7", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `5o\u001b@r,9ny/;w\u001f\u001c\\P7z4 )>H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001etT5\u001c\f]J78R7,\f(P\u0006Pd\u0010\u0010 \u0017~o~L_Y,\b\u001f~!0hNYh\t\u001d", "3mR<W,-]\u0007\u000e\bb5~", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `5o\u001b@r,9ny/;w\u001f\u001c\\P7z4 )>H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001etS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>", ">`a@X\u001bH8'\t\u0004>3|\u0011/n\u000f", "\u0012dU.h3M", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b<~7n\u0012>TR\u0011", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?ba(Btk", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Json implements StringFormat {
    public static final Default Default = new Default(null);
    private final DescriptorSchemaCache _schemaCache;
    private final JsonConfiguration configuration;
    private final SerializersModule serializersModule;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004Gْ1!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b<~7n\u0012>TR\u0011", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bS", "u(E", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Default extends Json {
        private Default() {
            super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, 8191, null), SerializersModuleBuildersKt.EmptySerializersModule(), null);
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule) {
        this.configuration = jsonConfiguration;
        this.serializersModule = serializersModule;
        this._schemaCache = new DescriptorSchemaCache();
    }

    public /* synthetic */ Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonConfiguration, serializersModule);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0016N\u000bJ}xTeg[g|UT-Q_Q\u001c:\nlKV\u007fXsmb\u0001=2(awG\rF{HTkF=\u001a[Yz\u0005YKCj}5\u0015\u000fL'W*\ts\u000b\u0001\u001f\u0004<\u001dO", replaceWith = @ReplaceWith(expression = "schemaCache", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void get_schemaCache$kotlinx_serialization_json$annotations() {
    }

    public final <T> T decodeFromJsonElement(DeserializationStrategy<? extends T> deserializer, JsonElement element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return (T) TreeJsonDecoderKt.readJson(this, element, deserializer);
    }

    @Override // kotlinx.serialization.StringFormat
    public final <T> T decodeFromString(DeserializationStrategy<? extends T> deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        StringJsonLexer stringJsonLexer = new StringJsonLexer(string);
        T t2 = (T) new StreamingJsonDecoder(this, WriteMode.OBJ, stringJsonLexer, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        stringJsonLexer.expectEof();
        return t2;
    }

    public final <T> JsonElement encodeToJsonElement(SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return TreeJsonEncoderKt.writeJson(this, t2, serializer);
    }

    @Override // kotlinx.serialization.StringFormat
    public final <T> String encodeToString(SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        JsonToStringWriter jsonToStringWriter = new JsonToStringWriter();
        try {
            JsonStreamsKt.encodeByWriter(this, jsonToStringWriter, serializer, t2);
            return jsonToStringWriter.toString();
        } finally {
            jsonToStringWriter.release();
        }
    }

    public final JsonConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // kotlinx.serialization.SerialFormat
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public final DescriptorSchemaCache get_schemaCache$kotlinx_serialization_json() {
        return this._schemaCache;
    }

    public final JsonElement parseToJsonElement(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return (JsonElement) decodeFromString(JsonElementSerializer.INSTANCE, string);
    }
}
