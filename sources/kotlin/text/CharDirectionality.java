package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4Y\u0005ӳܧ\u0012\u000eј\u0005\u0004i6TgX.\u0001ݷX\u000e$zMdh*qS?c\u001a\u0016\"7PɁkg|L+\u001aQ\u000f\u001e\u0016'k߽M[\u0001ز*\u00118E}C\u001cMuB\"`z<m 8)!y\u000b\t\u0003*N\u0019_zIUt\u00126KY:X\u00196\u0005 \u001fn>&\u000f\u0007\\m]\u001fHrm#/)\u0014RBT9H0\u0003`uFZ;uvg3\u0014@=K}%Y\u001aoRaWƊC\f"}, d2 = {"\u001aj^A_0G\u001d(~\u000emuZ\f+r^,\t@~&\u001bQx\nCz4I/", "", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc#T3NS", "u(8", "#M3\u00129\u0010'3w", "\u001aD5!R\u001b(M\u0006b\\A\u001b", " H6\u0015G&-=\u0013eZ?\u001b", " H6\u0015G&-=\u0013eZ?\u001bvd\u001cA\\\fY", "\u0013TA\u001cC\f\u001a<\u0013gjF\t\\u", "\u0013TA\u001cC\f\u001a<\u0013gjF\t\\u)S_\u0013W-\\\u0006\u00014", "\u0013TA\u001cC\f\u001a<\u0013gjF\t\\u)T_\u0015c$ir\u00061\\", "\u000fQ0\u000f<\n8<\tfW>\u0019", "\u0011N<\u001aB\u00158<\tfW>\u0019vv\u000fP[\u0015W/j\u0004", "\u001cN= C\b\u001c7\u0002`tF\bin", "\u0010ND\u001b7\b+G\u0013gZN\u001bid\u0016", "\u001e@A\u000e:\u0019\u001a>{xh>\u0017Xu\u000bTi\u0015", "!D6\u001a8\u0015-M\u0007^e:\u0019Xw\u0019R", "%G8!8\u001a)/v^", "\u001dS7\u0012E&'3\tmg:\u0013j", "\u001aD5!R\u001b(M\u0006b\\A\u001bvh\u0017B_\u0007Z$ix", "\u001aD5!R\u001b(M\u0006b\\A\u001bvr El\u0015_\u001f`", " H6\u0015G&-=\u0013eZ?\u001bvh\u0017B_\u0007Z$ix", " H6\u0015G&-=\u0013eZ?\u001bvr El\u0015_\u001f`", "\u001eN?,7\u0010+3vm^H\u0015Xo)Fi\u0015c\u001co", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CharDirectionality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CharDirectionality[] $VALUES;
    public static final Companion Companion;
    private static final Lazy<Map<Integer, CharDirectionality>> directionalityMap$delegate;
    private final int value;
    public static final CharDirectionality UNDEFINED = new CharDirectionality("UNDEFINED", 0, -1);
    public static final CharDirectionality LEFT_TO_RIGHT = new CharDirectionality("LEFT_TO_RIGHT", 1, 0);
    public static final CharDirectionality RIGHT_TO_LEFT = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);
    public static final CharDirectionality RIGHT_TO_LEFT_ARABIC = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);
    public static final CharDirectionality EUROPEAN_NUMBER = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);
    public static final CharDirectionality EUROPEAN_NUMBER_SEPARATOR = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
    public static final CharDirectionality EUROPEAN_NUMBER_TERMINATOR = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
    public static final CharDirectionality ARABIC_NUMBER = new CharDirectionality("ARABIC_NUMBER", 7, 6);
    public static final CharDirectionality COMMON_NUMBER_SEPARATOR = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);
    public static final CharDirectionality NONSPACING_MARK = new CharDirectionality("NONSPACING_MARK", 9, 8);
    public static final CharDirectionality BOUNDARY_NEUTRAL = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);
    public static final CharDirectionality PARAGRAPH_SEPARATOR = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);
    public static final CharDirectionality SEGMENT_SEPARATOR = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);
    public static final CharDirectionality WHITESPACE = new CharDirectionality("WHITESPACE", 13, 12);
    public static final CharDirectionality OTHER_NEUTRALS = new CharDirectionality("OTHER_NEUTRALS", 14, 13);
    public static final CharDirectionality LEFT_TO_RIGHT_EMBEDDING = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
    public static final CharDirectionality LEFT_TO_RIGHT_OVERRIDE = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
    public static final CharDirectionality RIGHT_TO_LEFT_EMBEDDING = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
    public static final CharDirectionality RIGHT_TO_LEFT_OVERRIDE = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
    public static final CharDirectionality POP_DIRECTIONAL_FORMAT = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>-6B\r(4\u0012\u000e\u0007nj?5JͣIDɟ\u0004*=j<9*[ҸuCIUb\n0\u0012gN\u0016k\u001fNh\u0015[\u000f4\u0019I\u0010:Jm\u0005m\u0014\u001f2prO5]ok=\u000fvlEv݈ķ8ѩ\t\u000b\",N\u0017\u0005\u0003[M\u0012\u0017>Fª>]"}, d2 = {"\u001aj^A_0G\u001d(~\u000emuZ\f+r^,\t@~&\u001bQx\nCz4I\u0018[*?x\u00127QMDA", "", "u(E", "2ha2V;B]\"z\u0002b;\u0011p+p", "", "", "\u001aj^A_0G\u001d(~\u000emuZ\f+r^,\t@~&\u001bQx\nCz4I/", "5dc\u0011\\9>Q(\u0003\u0005g(\u0004\r>yg$\u0007", "u(;7T=:\u001d)\u000e~eud\u0005:;", "2ha2V;B]\"z\u0002b;\u0011p+p>'{G\u0001\u0019\u0013Vo", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "D`[BX\u0016?", "2ha2V;B]\"z\u0002b;\u0011", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<Integer, CharDirectionality> getDirectionalityMap() {
            return (Map) CharDirectionality.directionalityMap$delegate.getValue();
        }

        public final CharDirectionality valueOf(int i2) {
            CharDirectionality charDirectionality = getDirectionalityMap().get(Integer.valueOf(i2));
            if (charDirectionality != null) {
                return charDirectionality;
            }
            throw new IllegalArgumentException("Directionality #" + i2 + " is not defined.");
        }
    }

    private static final /* synthetic */ CharDirectionality[] $values() {
        return new CharDirectionality[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
    }

    static {
        CharDirectionality[] charDirectionalityArr$values = $values();
        $VALUES = charDirectionalityArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(charDirectionalityArr$values);
        Companion = new Companion(null);
        directionalityMap$delegate = LazyKt.lazy(new Function0<Map<Integer, ? extends CharDirectionality>>() { // from class: kotlin.text.CharDirectionality$Companion$directionalityMap$2
            @Override // kotlin.jvm.functions.Function0
            public final Map<Integer, ? extends CharDirectionality> invoke() {
                EnumEntries<CharDirectionality> entries = CharDirectionality.getEntries();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
                for (CharDirectionality charDirectionality : entries) {
                    linkedHashMap.put(Integer.valueOf(charDirectionality.getValue()), charDirectionality);
                }
                return linkedHashMap;
            }
        });
    }

    private CharDirectionality(String str, int i2, int i3) {
        this.value = i3;
    }

    public static EnumEntries<CharDirectionality> getEntries() {
        return $ENTRIES;
    }

    public static CharDirectionality valueOf(String str) {
        return (CharDirectionality) Enum.valueOf(CharDirectionality.class, str);
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
