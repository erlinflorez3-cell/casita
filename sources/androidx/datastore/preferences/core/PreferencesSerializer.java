package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.Preferences;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: PreferencesSerializer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000e6B\r.4\u0012}\bnjG0LeN.ZS@\u000fsڔ<$q$yّCU(Ԃ*\tUNog\u0005Jb\u000bI\u0011\u000e\u0016\u000fj4I[xc݉\u000fHԏ ECO\u007f=g`#5E%8\"أ}\u0005\u000f\u001brf\u001e\u007f\u0013Cy\u0016B4N{RR;S5\u001e \u0012V /+\rk\\D`l\fIu#KwP^?_^\n}\u0011T`?\r%rd+\tNC'=S1\u0007\u0003_M\u0016Wqk\u0019/ѾeɛH֕ɱ:X\u000e)]J]#urTf5Un#?+}c{T\u001c@\u0010z*&\u0003ǠLϳ&ΞͶ1\u001at\"^E\u0003tk@~\u0002\u0015\u0017Vфcي\u001b)\u001851<)j\"sI\u001ef7*\u000bc̛eъr'c٪&b\u001b\"b\u007fΆ1SH=Ně]X"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGtc9Rr.KaN92", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011]\u000eIz!<]\u0013 DC", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "u(E", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u0011X-:c \u000ekZ3\r\t", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\"$Gp\u000eIv.3Y\fi5w#.\u0017.Hk5\u001e\"hj7\u0007q\u0002", "4h[28?MS\"\r~h5", "", "5dc\u0013\\3>3,\u000ezg:\u0001\u00138", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/cS\u001de6M]x\b\nk@k\u0013\u001ar\u007f){M\u0001 \u0015G}", "", "<`\\2", "D`[BX", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#h-7n\u0016;ML9kB\t\"rpCET(U\u0007'\u001d", ";tc.U3>>&~{^9|\u0012-e\u000e", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\"", "5dc#T3NS\u0004\f\u0005m6", "", "@dP199H[", "7m_Bg", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "uKY.i(\bW#H^g7\r\u0018\u001dt\r(wHV}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005I>'$ljI\u0003r0X\u007f|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "EqXAX\u001bH", "B", "=tc=h;", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n\f$\u0017Ho\u001b<\u007f#5gG\u001eAz\u0016w8P;l4+\u0015q_9\u00159\u0013Sr8C\u0016R6&<\u0003L\u001f\"i{]8\r\u0001a\u0017\u000btNF&\f5\u0013\u007fEu\u000b\u001c%\u0012>j~\f4\u001aP\t\u0019~Q%wJchO\u000b(J^;`Uf\u0019e<\u0004\u000e\u0011v\u0019\u0019w&", "2`c.f;H`\u0019F\u0006k,}\t<e\t&{NH\u0015!To"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class PreferencesSerializer implements Serializer<Preferences> {
    public static final PreferencesSerializer INSTANCE = new PreferencesSerializer();
    private static final String fileExtension = "preferences_pb";

    /* JADX INFO: compiled from: PreferencesSerializer.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PreferencesSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(Preferences preferences, OutputStream outputStream, Continuation continuation) {
        return writeTo2(preferences, outputStream, (Continuation<? super Unit>) continuation);
    }

    public final String getFileExtension() {
        return fileExtension;
    }

    @Override // androidx.datastore.core.Serializer
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation<? super Preferences> continuation) throws IOException {
        PreferencesProto.PreferenceMap from = PreferencesMapCompat.Companion.readFrom(inputStream);
        MutablePreferences mutablePreferencesCreateMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        Map<String, PreferencesProto.Value> preferencesMap = from.getPreferencesMap();
        Intrinsics.checkNotNullExpressionValue(preferencesMap, "preferencesProto.preferencesMap");
        for (Map.Entry<String, PreferencesProto.Value> entry : preferencesMap.entrySet()) {
            String name = entry.getKey();
            PreferencesProto.Value value = entry.getValue();
            PreferencesSerializer preferencesSerializer = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            preferencesSerializer.addProtoEntryToPreferences(name, value, mutablePreferencesCreateMutable);
        }
        return mutablePreferencesCreateMutable.toPreferences();
    }

    /* JADX INFO: renamed from: writeTo */
    public Object writeTo2(Preferences preferences, OutputStream outputStream, Continuation<? super Unit> continuation) throws IOException {
        Map<Preferences.Key<?>, Object> mapAsMap = preferences.asMap();
        PreferencesProto.PreferenceMap.Builder builderNewBuilder = PreferencesProto.PreferenceMap.newBuilder();
        for (Map.Entry<Preferences.Key<?>, Object> entry : mapAsMap.entrySet()) {
            builderNewBuilder.putPreferences(entry.getKey().getName(), getValueProto(entry.getValue()));
        }
        builderNewBuilder.build().writeTo(outputStream);
        return Unit.INSTANCE;
    }

    private final PreferencesProto.Value getValueProto(Object obj) {
        if (obj instanceof Boolean) {
            PreferencesProto.Value valueBuild = PreferencesProto.Value.newBuilder().setBoolean(((Boolean) obj).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder().setBoolean(value).build()");
            return valueBuild;
        }
        if (obj instanceof Float) {
            PreferencesProto.Value valueBuild2 = PreferencesProto.Value.newBuilder().setFloat(((Number) obj).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild2, "newBuilder().setFloat(value).build()");
            return valueBuild2;
        }
        if (obj instanceof Double) {
            PreferencesProto.Value valueBuild3 = PreferencesProto.Value.newBuilder().setDouble(((Number) obj).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild3, "newBuilder().setDouble(value).build()");
            return valueBuild3;
        }
        if (obj instanceof Integer) {
            PreferencesProto.Value valueBuild4 = PreferencesProto.Value.newBuilder().setInteger(((Number) obj).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild4, "newBuilder().setInteger(value).build()");
            return valueBuild4;
        }
        if (obj instanceof Long) {
            PreferencesProto.Value valueBuild5 = PreferencesProto.Value.newBuilder().setLong(((Number) obj).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild5, "newBuilder().setLong(value).build()");
            return valueBuild5;
        }
        if (obj instanceof String) {
            PreferencesProto.Value valueBuild6 = PreferencesProto.Value.newBuilder().setString((String) obj).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild6, "newBuilder().setString(value).build()");
            return valueBuild6;
        }
        if (obj instanceof Set) {
            PreferencesProto.Value valueBuild7 = PreferencesProto.Value.newBuilder().setStringSet(PreferencesProto.StringSet.newBuilder().addAllStrings((Set) obj)).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return valueBuild7;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("PreferencesSerializer does not support type: ", obj.getClass().getName()));
    }

    private final void addProtoEntryToPreferences(String str, PreferencesProto.Value value, MutablePreferences mutablePreferences) throws CorruptionException {
        PreferencesProto.Value.ValueCase valueCase = value.getValueCase();
        switch (valueCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.set(PreferencesKeys.booleanKey(str), Boolean.valueOf(value.getBoolean()));
                return;
            case 2:
                mutablePreferences.set(PreferencesKeys.floatKey(str), Float.valueOf(value.getFloat()));
                return;
            case 3:
                mutablePreferences.set(PreferencesKeys.doubleKey(str), Double.valueOf(value.getDouble()));
                return;
            case 4:
                mutablePreferences.set(PreferencesKeys.intKey(str), Integer.valueOf(value.getInteger()));
                return;
            case 5:
                mutablePreferences.set(PreferencesKeys.longKey(str), Long.valueOf(value.getLong()));
                return;
            case 6:
                Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(str);
                String string = value.getString();
                Intrinsics.checkNotNullExpressionValue(string, "value.string");
                mutablePreferences.set(keyStringKey, string);
                return;
            case 7:
                Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
                List<String> stringsList = value.getStringSet().getStringsList();
                Intrinsics.checkNotNullExpressionValue(stringsList, "value.stringSet.stringsList");
                mutablePreferences.set(keyStringSetKey, CollectionsKt.toSet(stringsList));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }
}
