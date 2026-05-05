package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
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
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!4i\bDR\u0006|\u0004O\u00128\u000b<H\u0007\"2\u0015\u007f\u0007tyA0JfP.hS2şs{J$c$wJCU0}*\tUPog|Sb\u000bI\u000f\u000e\u0016\u000fj4Ikxe\u0012\u00152JoU3UڎE9nt>ӌ8P0C\u0012\u0011\u0011\u001c:H>w\u000bE[\f@2npbR;Y5\u001e \u0013V /,#gfTV{uF?%\u0013ipO7a@|{\u000ftTO\r%oN/NGM\u0015S_IޗjuM\u0014Wqk\u0006\u0011'U7yweCp\u007fB#[S\u001bo\u000b&\u000b\u0007\u0018Ӡ$A9b{K~\u0010Pw)\b=@\u0012\u001b\u001e'v<]\u001et\u001c&3#s\u001aóh&lW\u0018z\u00108?%.?[=)siai'~;\n\u0019%\u001eQ\u0002\u001f'aT\u001cv-\u001b\u0003x\u0018ĸiTK_f\fo<\u001c\u001c\u0019b0644U\rG{?<]¦O\u0001G<9q\u0012JTg%\u0006\u000fp{i\u0001Tp&|#O*7\u001a\u000bHr\u001f\u0004P\u0003prҊܖ T\u0015\u0019 l.x\u0010<OB8N}v\u001an[{\"%]rgx|\u000b&rIoCD\u007f\u0001ߧe\\|5OBh\u0019hhHY2|l*22v\b>\u0018,P\\/+:Ou,6B0G]Cl3*HA\u000b.w`x\u0012\u000fTaJ1\u000ejڐ\u000fˏOʔ\u0011\u001cuծa>\rn29QSE\u0019TV2jD|Q\t-s.F\u001eն\u001eƄnטya\u0004\u008d&\u001c?T=A+\u0011\u0005.@\bMkZy}]]\u001a7\u0001\r{\u001f;\u0017/\u0016\u0010\u0019obߌA\u07bcQݚ\u001b.~ܥ\u0003%\u000em\u000e}yH\u0001QqZޯ[CQu\tʵl|7ٱ\tF"}, d2 = {"\u0018r^;7,LS&\u0003ve0\u0012\u0005>i\n1d<\t\u0017%-o\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\rMQ9x8)$rn'\u0005f,Vr\u0005CJQ,\u001b8rQi", "", "", "", "5dc\u0017f6G2\u0019\rzk0x\u00103z{7\u007fJ\n\u007f\u0013Oo\u001c\"v9sU\u0007)A|\u0012=QMDy", "u(E", "5dc\u0017f6G2\u0019\rzk0x\u00103z{7\u007fJ\n\u007f\u0013Oo\u001c\"v9", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011t\u001cF\u007fn9b\r Dv\u00125\u0017\";y2+\u0019spC\u0014Q*Qv/C*J*_R1#\u0014&0", "\u0018r^;F,KW\u0015\u0006~s(\f\r9nh$\u0004@\u000f|\u0017[", "", "5dc\u0017f6GA\u0019\f~Z3\u0001\u001e+t\u00042\u0005)|\u001f\u0017UU\u000eP5!>b\b/3|\u001a8VQ", "5dc\u0017f6GA\u0019\f~Z3\u0001\u001e+t\u00042\u0005)|\u001f\u0017UU\u000eP", "0tX9W\u000b>a\u0019\f~Z3\u0001\u001e+t\u00042\u0005)|\u001f\u0017UW\nG", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "8r^;", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bS", "2db2e0:Z\u001d\u0014vm0\u0007\u0012\u0018a\b(\n(|\"", "2db0e0Ib#\f", "5dc\u0017f6G3 ~\u0003^5\fq+m\u007f", "7mS2k", "5dc\u0017f6G<\u0015\u0007zB5{\tB", "<`\\2", "5dc\u0017f6G<\u0015\u0007zB5{\tBO\r\u0017~M\u000b)", "AtU3\\?", "<`\\6a.,b&z\n^.\u0011", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bf\u001c?q\u001f0;RHgC\u001e\u0017|7", "Ada6T3Bh\u0015\u000e~h5e\u00057e\u000e\f\u0005?\u0005\u0015\u0017U", "Asa.g,@g", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000eMV]3`[\u0006\u0007\"\u0012g\u0012J2\u0011\u001aUP(xM\u0001$\u00166RK v\u000b\u0015kt;t\u007fIZ\u0019ZC#uN-dM]tuVEOksi\u001ai&&\u001fH.\u001dZ\u0015#lY0w\u000b`\r\u0002R{{=\u000b\u000fa= Oi%MAxW\u0006b6,O\u0005yg", "Bqh\u0010b,KQ\u0019ove<|", "", "3kT:X5M2\u0019\rxk0\b\u00189r", ">dT8A<EZ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "1n]@h4>", ">dT8F;KW\"\u0001", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "=m4;h4\u001c]\u0019\fxb5~", "", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonNamesMapKt {
    private static final DescriptorSchemaCache.Key<Map<String, Integer>> JsonDeserializationNamesKey = new DescriptorSchemaCache.Key<>();
    private static final DescriptorSchemaCache.Key<String[]> JsonSerializationNamesKey = new DescriptorSchemaCache.Key<>();

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonNamesMapKt$deserializationNamesMap$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,\f\bDRo|\u0004O\f8é<Ȑ\u0017.<\u0014\b\u0007\u0015jI2Tev/\u0001Rp\u0017ө\u007f4*]"}, d2 = {"\n`]<a@F])\rS", "", "", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Map<String, ? extends Integer>> {
        final /* synthetic */ Json $this_deserializationNamesMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Json json) {
            super(0);
            json = json;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends Integer> invoke() {
            return JsonNamesMapKt.buildDeserializationNamesMap(serialDescriptor, json);
        }
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonNamesMapKt$serializationNamesIndices$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,x\bDRo|\u0004G\u0006>éFH\u000f$<\u0012&\u0007\u0015i\u007f8ǲiJ4Sa,"}, d2 = {"\n`]<a@F])\rS", "", "", "7me<^,", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C14531 extends Lambda implements Function0<String[]> {
        final /* synthetic */ JsonNamingStrategy $strategy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14531(JsonNamingStrategy jsonNamingStrategy) {
            super(0);
            jsonNamingStrategy = jsonNamingStrategy;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String[] invoke() {
            int elementsCount = serialDescriptor.getElementsCount();
            String[] strArr = new String[elementsCount];
            for (int i2 = 0; i2 < elementsCount; i2++) {
                strArr[i2] = jsonNamingStrategy.serialNameForJson(serialDescriptor, i2, serialDescriptor.getElementName(i2));
            }
            return strArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonNamesMapKt$tryCoerceValue$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class C14541 extends Lambda implements Function0<Unit> {
        public static final C14541 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
        }
    }

    public static final Map<String, Integer> buildDeserializationNamesMap(SerialDescriptor serialDescriptor, Json json) {
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = namingStrategy(serialDescriptor, json);
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i2 = 0; i2 < elementsCount; i2++) {
            List<Annotation> elementAnnotations = serialDescriptor.getElementAnnotations(i2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : elementAnnotations) {
                if (obj instanceof JsonNames) {
                    arrayList.add(obj);
                }
            }
            JsonNames jsonNames = (JsonNames) CollectionsKt.singleOrNull((List) arrayList);
            if (jsonNames != null && (strArrNames = jsonNames.names()) != null) {
                for (String str : strArrNames) {
                    buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, str, i2);
                }
            }
            if (jsonNamingStrategyNamingStrategy != null) {
                buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, jsonNamingStrategyNamingStrategy.serialNameForJson(serialDescriptor, i2, serialDescriptor.getElementName(i2)), i2);
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.emptyMap() : linkedHashMap;
    }

    private static final void buildDeserializationNamesMap$putOrThrow(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i2) {
        if (map.containsKey(str)) {
            throw new JsonException("The suggested name '" + str + "' for property " + serialDescriptor.getElementName(i2) + " is already one of the names for property " + serialDescriptor.getElementName(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + serialDescriptor);
        }
        map.put(str, Integer.valueOf(i2));
    }

    public static final Map<String, Integer> deserializationNamesMap(Json json, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(descriptor, JsonDeserializationNamesKey, new Function0<Map<String, ? extends Integer>>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt.deserializationNamesMap.1
            final /* synthetic */ Json $this_deserializationNamesMap;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Json json2) {
                super(0);
                json = json2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends Integer> invoke() {
                return JsonNamesMapKt.buildDeserializationNamesMap(serialDescriptor, json);
            }
        });
    }

    public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonDeserializationNamesKey() {
        return JsonDeserializationNamesKey;
    }

    public static /* synthetic */ void getJsonDeserializationNamesKey$annotations() {
    }

    public static final String getJsonElementName(SerialDescriptor serialDescriptor, Json json, int i2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = namingStrategy(serialDescriptor, json);
        return jsonNamingStrategyNamingStrategy == null ? serialDescriptor.getElementName(i2) : serializationNamesIndices(serialDescriptor, json, jsonNamingStrategyNamingStrategy)[i2];
    }

    public static final int getJsonNameIndex(SerialDescriptor serialDescriptor, Json json, String name) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (namingStrategy(serialDescriptor, json) != null) {
            return getJsonNameIndex$getJsonNameIndexSlowPath(json, serialDescriptor, name);
        }
        int elementIndex = serialDescriptor.getElementIndex(name);
        return (elementIndex == -3 && json.getConfiguration().getUseAlternativeNames()) ? getJsonNameIndex$getJsonNameIndexSlowPath(json, serialDescriptor, name) : elementIndex;
    }

    private static final int getJsonNameIndex$getJsonNameIndexSlowPath(Json json, SerialDescriptor serialDescriptor, String str) {
        Integer num = deserializationNamesMap(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int getJsonNameIndexOrThrow(SerialDescriptor serialDescriptor, Json json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, name);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new SerializationException(serialDescriptor.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    public static final DescriptorSchemaCache.Key<String[]> getJsonSerializationNamesKey() {
        return JsonSerializationNamesKey;
    }

    public static /* synthetic */ void getJsonSerializationNamesKey$annotations() {
    }

    public static final JsonNamingStrategy namingStrategy(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(serialDescriptor.getKind(), StructureKind.CLASS.INSTANCE)) {
            return json.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    public static final String[] serializationNamesIndices(SerialDescriptor serialDescriptor, Json json, JsonNamingStrategy strategy) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return (String[]) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonSerializationNamesKey, new Function0<String[]>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt.serializationNamesIndices.1
            final /* synthetic */ JsonNamingStrategy $strategy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14531(JsonNamingStrategy strategy2) {
                super(0);
                jsonNamingStrategy = strategy2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String[] invoke() {
                int elementsCount = serialDescriptor.getElementsCount();
                String[] strArr = new String[elementsCount];
                for (int i2 = 0; i2 < elementsCount; i2++) {
                    strArr[i2] = jsonNamingStrategy.serialNameForJson(serialDescriptor, i2, serialDescriptor.getElementName(i2));
                }
                return strArr;
            }
        });
    }

    public static final boolean tryCoerceValue(Json json, SerialDescriptor elementDescriptor, Function1<? super Boolean, Boolean> peekNull, Function0<String> peekString, Function0<Unit> onEnumCoercing) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        if (!elementDescriptor.isNullable() && peekNull.invoke(true).booleanValue()) {
            return true;
        }
        if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && peekNull.invoke(false).booleanValue()) || (strInvoke = peekString.invoke()) == null || getJsonNameIndex(elementDescriptor, json, strInvoke) != -3)) {
            return false;
        }
        onEnumCoercing.invoke();
        return true;
    }

    public static /* synthetic */ boolean tryCoerceValue$default(Json json, SerialDescriptor elementDescriptor, Function1 peekNull, Function0 peekString, Function0 onEnumCoercing, int i2, Object obj) {
        String str;
        if ((i2 + 8) - (i2 | 8) != 0) {
            onEnumCoercing = C14541.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        if (!elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(true)).booleanValue()) {
            return true;
        }
        if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(false)).booleanValue()) || (str = (String) peekString.invoke()) == null || getJsonNameIndex(elementDescriptor, json, str) != -3)) {
            return false;
        }
        onEnumCoercing.invoke();
        return true;
    }
}
