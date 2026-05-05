package kotlinx.serialization.internal;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
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
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<N\u0007Ӭ4\u0012\u000e\u0007nʑA0RkP.XY2\u000fy\u001a<$i=yCAV\"}0\u0018WN}gvJ`\rK\u000f\u00145\u0001j2I]xk(\u0017˰JoMUUڎE9vt>\u0005&9*8\b%\t\u001a0M\u0018v\tCS\f\u00180HpH[\u0015M\u000b\u001b\u001a\u0006LĨ\t\u001ebrTE^Ǎ\u000e:]\"3ipNg\u0003@\u0001[\u000e^TU\u000f\u0007m$+N:M\u001b5S\t\bhZm\u0007OuK\n\u0001'U1ʁwWD_H*#]g\r\f&V`\u0013\u0006x\fU-\u007fiQP\u001c]\u0010z*C\u0005\u0016\u001c=?T>/*f6\u0010Cv\u0003SnV0}\t\u007fCrDO=\u007faai!t\u000by=/Me6Kړ\u001ek\u0015|\\sZ\u001eb%\u001b\u0003\b\u007f@\u0002DK\u0005f\n\bC4\u00189p\u0010g\u001c0u~_\u007f\u001fj/%ea\u007f7iy\u0010\u0007\\g%\u000b\u0011la\u001ejHn$5*\u007f8\u0017KrD\u0013\u0007\u001cTb\u0015D\u0011{\"\u001b\u001bF\u000e!`twj'k$\u0017]v+\u0003M\f@U3tsqn\u001a\u0014\u001eM'?C\u0014{\u0010\u0010\u0006'\u0018M\u007fz\u0005\u0007v\u000b_\u001a\u001ft(Pexn\u001e=\u0014D|\u001c[8M844Z3_pea\u0011&ZA+\u000f\u0016\u001b?ɰмTտ(\rq&z\u0014\u000f\\trup\u0007S|\tn/EA\u007f;oĢaɋl4\u0005ȽW\u0017\u0002\u000e_m\\I\\lD\u0006\u0004\u000bVjp߰SȠA\u0017'\u0001/C\u0010?\u0016o\u0001xiW\"-\u000b\u0001\n\u000fAi\\|6~'l7ʇ\u07bfOݚ\u001b,~`x;\u0016p\u0018{g\\\t^4h\u0019tVQ\u0003\u0005i<|H\u0013\u0004M8{˝{ݕ\u000155ξw,$|,/Cgԃmu6Ӡz\u0011,\u0010s\u000e|o$\fzQ\fO\u0012ͲK˕\u0003>*غ=\u0015PK\u0003}\u0018B\u000f5#2vE;ݨXиQ\u000b7̎7\u001f:+\tbk<#o,6>a:sq\u0004B}\u001aќ\u001dߠWguޮ\u001cn\u0019j'\n9\u001dgChΩ?֕Z[z\u000b6(\u0002;\u0007UI\u0007\u001dB\u0019&D,j\n9W+Ȯ\bخ~\u0002N_\u001d<\u0003^\u0002an\u001cd\u0003l^X\u0007pE\u000f1@\u007f-)a2O߹3ܭqH\\/qYQe+\n3j}\u0001=ޞ-\u05ffX?#ιp\u0003\u0011mkl\u001a\u001aD._/}m\u007f\ff\u001a+HxlqʚSμczH`\u0011\u0002r{5\u0016 \u0015jT2+\u000fz+\rj\u001eEIoۛΘoܑ1VVy=t(\r/F/6\u001a-ޖJb"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h'Go\u001a7/CDkA\u001a$h`'\u0007p0J}\u0006GZL9`]\u0002G!g", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#[\u001c5p\u0016-6?CkBs", "Ada6T3'O!~", "", "5d]2e(MS\u0018lzk0x\u00103z\u007f5", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#_ @m#*\\C:Y4+\u0019dh=\u001cc9$", "3kT:X5Mav\t\u000bg;", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKx!\u0006\u0005%B]y';\u0003\u0012=QMD58'$hnB\u0003ju0v0GYJ;\\Q`=!\u0016V\u0015R@\r\u0012/%g_", "-gP@[\nHR\u0019", "5dc,[(LVv\ty^", "u(8", "-gP@[\nHR\u0019=y^3|\u000b+t\u007f", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "/cS2W", "/m]<g(MW#\b\t", "", "", "5dc\u000ea5Hb\u0015\u000e~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "1gX9W\u001a>`\u001dz\u0002bA|\u0016=", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "5dc\u0010[0ER\u0007~\bb(\u0004\rDe\r6", "u(J\u0019^6MZ\u001d\b\u000e(:|\u00163a\u0007,\u0011<\u0010\u001b!P9s*v29U\u0005$Lm#\u0004", "1gX9W\u001a>`\u001dz\u0002bA|\u0016=$~(\u0003@\u0003\u0013&G", "1kP@f\bG\\#\u000evm0\u0007\u0012=", "", "5dc\u0012_,FS\"\u000e\t<6\r\u0012>", "3kT:X5Ma\u0003\n\nb6\u0006\u00056i\u000f<", "", "7mS6V,L", "", "9h]1", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BQ8'\u0014>", "5dc\u0018\\5=", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;\u0004\u0019q`\u000f", "<`\\2f", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", ">q^=X9MW\u0019\rVg5\u0007\u0018+t\u00042\u0005N", ")KY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;", "5dc X9BO gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ada6T3'O!~\t", "", "5dc X9BO gvf,\u000b", "u(;7T=:\u001d)\u000e~euj\t>;", "Bx_2C(KO!~\n^9[\t=c\r,\u0007O\u000b$%", "5dc!l7>>\u0015\fvf,\f\t<D\u007f6yM\u0005\"&Q|\u001cz|/D`\u0002)Jg$.ZG7r83\u0011weC\u0010]*X\u0004'", "u(J\u0019^6MZ\u001d\b\u000e(:|\u00163a\u0007,\u0011<\u0010\u001b!P9\r<\u0005#B]\t/Az$w;CHo0%sho7\u0014g7]\u00014\u001d", "Bx_2C(KO!~\n^9[\t=c\r,\u0007O\u000b$%\u0006n\u000eCv'1h}", "/cS\u0012_,FS\"\u000e", "", "<`\\2", "7r>=g0H\\\u0015\u0006", "", "0tX9W\u0010GR\u001d|zl", "3pd._:", "=sW2e", "", "5dc\u0012_,FS\"\u000eVg5\u0007\u0018+t\u00042\u0005N", "7mS2k", "5dc\u0012_,FS\"\u000eY^:z\u00163p\u000f2\t", "5dc\u0012_,FS\"\u000e^g+|\u001c", "5dc\u0012_,FS\"\u000ecZ4|", "6`b566=S", "7r49X4>\\(h\u0006m0\u0007\u0012+l", ">tb545G](z\nb6\u0006", "/m]<g(MW#\b", ">tb563:a'Z\u0004g6\f\u0005>i\n1", RemoteSettings.FORWARD_SLASH_STRING, "BnBAe0GU", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {
    private final Lazy _hashCode$delegate;
    private int added;
    private final Lazy childSerializers$delegate;
    private List<Annotation> classAnnotations;
    private final int elementsCount;
    private final boolean[] elementsOptionality;
    private final GeneratedSerializer<?> generatedSerializer;
    private Map<String, Integer> indices;
    private final String[] names;
    private final List<Annotation>[] propertiesAnnotations;
    private final String serialName;
    private final Lazy typeParameterDescriptors$delegate;

    /* JADX INFO: renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$toString$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,t\bӵLc\u0003\nIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<Integer, CharSequence> {
        AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(int i2) {
            return PluginGeneratedSerialDescriptor.this.getElementName(i2) + ": " + PluginGeneratedSerialDescriptor.this.getElementDescriptor(i2).getSerialName();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    public PluginGeneratedSerialDescriptor(String serialName, GeneratedSerializer<?> generatedSerializer, int i2) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = generatedSerializer;
        this.elementsCount = i2;
        this.added = -1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i4 = this.elementsCount;
        this.propertiesAnnotations = new List[i4];
        this.elementsOptionality = new boolean[i4];
        this.indices = MapsKt.emptyMap();
        this.childSerializers$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<KSerializer<?>[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$childSerializers$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<?>[] invoke() {
                KSerializer<?>[] kSerializerArrChildSerializers;
                GeneratedSerializer generatedSerializer2 = this.this$0.generatedSerializer;
                return (generatedSerializer2 == null || (kSerializerArrChildSerializers = generatedSerializer2.childSerializers()) == null) ? PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY : kSerializerArrChildSerializers;
            }
        });
        this.typeParameterDescriptors$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<SerialDescriptor[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$typeParameterDescriptors$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SerialDescriptor[] invoke() {
                ArrayList arrayList;
                KSerializer<?>[] kSerializerArrTypeParametersSerializers;
                GeneratedSerializer generatedSerializer2 = this.this$0.generatedSerializer;
                if (generatedSerializer2 == null || (kSerializerArrTypeParametersSerializers = generatedSerializer2.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                    for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                        arrayList2.add(kSerializer.getDescriptor());
                    }
                    arrayList = arrayList2;
                }
                return Platform_commonKt.compactArray(arrayList);
            }
        });
        this._hashCode$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<Integer>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$_hashCode$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.this$0;
                return Integer.valueOf(PluginGeneratedSerialDescriptorKt.hashCodeImpl(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core()));
            }
        });
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 + 2) - (i3 | 2) != 0 ? null : generatedSerializer, i2);
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        pluginGeneratedSerialDescriptor.addElement(str, z2);
    }

    private final Map<String, Integer> buildIndices() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i2 = 0; i2 < length; i2++) {
            map.put(this.names[i2], Integer.valueOf(i2));
        }
        return map;
    }

    private final KSerializer<?>[] getChildSerializers() {
        return (KSerializer[]) this.childSerializers$delegate.getValue();
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    public final void addElement(String name, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.names;
        int i2 = this.added + 1;
        this.added = i2;
        strArr[i2] = name;
        this.elementsOptionality[i2] = z2;
        this.propertiesAnnotations[i2] = null;
        if (i2 == this.elementsCount - 1) {
            this.indices = buildIndices();
        }
    }

    public boolean equals(Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this;
        if (pluginGeneratedSerialDescriptor == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(pluginGeneratedSerialDescriptor.getSerialName(), serialDescriptor.getSerialName()) && Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((PluginGeneratedSerialDescriptor) obj).getTypeParameterDescriptors$kotlinx_serialization_core()) && pluginGeneratedSerialDescriptor.getElementsCount() == serialDescriptor.getElementsCount()) {
                int elementsCount = pluginGeneratedSerialDescriptor.getElementsCount();
                for (int i2 = 0; i2 < elementsCount; i2++) {
                    if (Intrinsics.areEqual(pluginGeneratedSerialDescriptor.getElementDescriptor(i2).getSerialName(), serialDescriptor.getElementDescriptor(i2).getSerialName()) && Intrinsics.areEqual(pluginGeneratedSerialDescriptor.getElementDescriptor(i2).getKind(), serialDescriptor.getElementDescriptor(i2).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int i2) {
        List<Annotation> list = this.propertiesAnnotations[i2];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i2) {
        return getChildSerializers()[i2].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i2) {
        return this.names[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[]) this.typeParameterDescriptors$delegate.getValue();
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i2) {
        return this.elementsOptionality[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    public final void pushAnnotation(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        ArrayList arrayList = this.propertiesAnnotations[this.added];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.propertiesAnnotations[this.added] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void pushClassAnnotation(Annotation a2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        Intrinsics.checkNotNull(list);
        list.add(a2);
    }

    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.elementsCount), ", ", getSerialName() + '(', ")", 0, null, new Function1<Integer, CharSequence>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.toString.1
            AnonymousClass1() {
                super(1);
            }

            public final CharSequence invoke(int i2) {
                return PluginGeneratedSerialDescriptor.this.getElementName(i2) + ": " + PluginGeneratedSerialDescriptor.this.getElementDescriptor(i2).getSerialName();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, 24, null);
    }
}
