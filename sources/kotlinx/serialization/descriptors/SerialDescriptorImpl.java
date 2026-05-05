package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
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
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<N\u0007Ӭ4\u0012\u000e\u0007nʑA0RkP\u008cZS8-sڔ<$q$yCAZ\"}0\"WNmhvJh\u001aK\u000f\f\u001a\u0001j:_]xc\u0014\u00172P\u0012G3SpE9n\u0015>\u0005&4*8\b\u000e\tɝ2H\u001e͌\u0003CQ\u0014\u0018ؓV\u0081jR;L5\u001a@\u0006~Q\u0011\"jhf6vnm>=&\u001bipR7c>\u0002e\rtZ7\u0017\u0005h61P9E\u0015SR1\u000fb_M\fWqk\u000fص+'9T<hD\u0003\u0018\u0014CV\u007f\u0013k\u001f>^\u001bP\u000f9m˚O,_^<@}\u000b}\u001d<2 4/x2;I~\b<9;\u0007\u001cN^2vB.y\u0012:%T\u00183Y?az\u001aoIJf7*\u000b=\"13\u0007!\nVTt])b+i1\u007fBmL\\9q=\u001c\n7vJ0\u0012d_\u007f]\u0002WB_3E\u0011Q#O\u00172LR\u0017\u000f\u0005\u000fn\u001a}\u001bNNX\u0007\u0016e,O +]r\u0011\u0004P\u0003^bQ$ȿΆ\u0007ą\f\u001d(^}K/5(PUuwx\u001eu\u00186GlG[~k<igf\ņSӒ\u0014gZΘ,ABu\u0013l7\\a!rh8*BNz\u0012\b{r`:\u001b`UHʌ6Ϝ5\u001bd\u0015V\u001anVO\u0015!ejj ~\u00032R\u0019@ˈv֊\u0005Rdp}\u0001I]:\u0017x(=Ca5G(\u00048?ؗ~ɠ\u000b\u0001{\u007fU\u0003\u001dSZ\t.u\u0004\u0019vډ\u001c\u07fcU/EП_\u001177\u001a-sRIϣS̊\u0016-\u0003۠\u0012\u0011A\u0007<uX|~/xjxS+϶$Ցbx+Ψ|\u0002\u007f\u0001T\u001b\u0018{b,sJYt\u0013YjPH~\u0015\u001fL+/\u0012xğ7ԩG'%ȶH&=\u0016y]\u0018q\u0005ӷdϪ*zmֽDe\u001c\u0013pu.JI]a_\u000f@2$\u001b\u0005pnA͂\nɚ\r:\u0015Ή`Cj\u0018d`\u001e\u001f='~\r<\u000f\u0001V\n9A\u0006Tұ0ʡ.uK}\"wǢ)H"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m92~2N\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#[\u001c5p\u0016-6?CkBs", "Ada6T3'O!~", "", "9h]1", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BQ8'\u0014>", "3kT:X5Mav\t\u000bg;", "", "Bx_2C(KO!~\n^9\u000b", "", "0tX9W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001K\u001d*[Q)kA\"\u0011o@9\u0015a9R\u00026QY+<`Yq=!g", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKx!\u0006\u0005%B]y';\u0003\u0012=QMD53\u001e#fn=\u0012r6[\u0005p5L[0XYXA\u001d\u00110q50\t\u0016U\u000b4}H>hn0W\u0011\u0011O\u0007\u0016%\u00159s\u0004\fd\u0010T}\u0011|E>dU]i\u0003\u0011@Ep(q\u0010j,fGHmqx\u0015)v>.\u0017\u007fO\u0018QR\betK$\nB1\u001b}_MDob\u00128\u0018", "-gP@[\nHR\u0019", "5dc,[(LVv\ty^", "u(8", "-gP@[\nHR\u0019=y^3|\u000b+t\u007f", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "/m]<g(MW#\b\t", "", "5dc\u000ea5Hb\u0015\u000e~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "3kT:X5M/\"\b\u0005m(\f\r9n\u000e", "", ")KY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;", "3kT:X5M2\u0019\rxk0\b\u00189r\u000e", ")KZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L", "3kT:X5M<\u0015\u0007zl", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "3kT:X5M=$\u000e~h5x\u00103t\u0014", "", "5dc\u0012_,FS\"\u000e\t<6\r\u0012>", "5dc\u0018\\5=", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;\u0004\u0019q`\u000f", "<`\\2%\u0010GR\u0019\u0012", "", "5dc X9BO gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ada6T3'O!~\t", "", "5dc X9BO gvf,\u000b", "u(;7T=:\u001d)\u000e~euj\t>;", "Bx_2C(KO!~\n^9\u000bg/s}5\u007fK\u0010!$U", "3pd._:", "", "=sW2e", "", "5dc\u0012_,FS\"\u000eVg5\u0007\u0018+t\u00042\u0005N", "7mS2k", "5dc\u0012_,FS\"\u000eY^:z\u00163p\u000f2\t", "5dc\u0012_,FS\"\u000e^g+|\u001c", "<`\\2", "5dc\u0012_,FS\"\u000ecZ4|", "6`b566=S", "7r49X4>\\(h\u0006m0\u0007\u0012+l", "BnBAe0GU", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {
    private final Lazy _hashCode$delegate;
    private final List<Annotation> annotations;
    private final List<Annotation>[] elementAnnotations;
    private final SerialDescriptor[] elementDescriptors;
    private final String[] elementNames;
    private final boolean[] elementOptionality;
    private final int elementsCount;
    private final SerialKind kind;
    private final Map<String, Integer> name2Index;
    private final String serialName;
    private final Set<String> serialNames;
    private final SerialDescriptor[] typeParametersDescriptors;

    public SerialDescriptorImpl(String serialName, SerialKind kind, int i2, List<? extends SerialDescriptor> typeParameters, ClassSerialDescriptorBuilder builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = i2;
        this.annotations = builder.getAnnotations();
        this.serialNames = CollectionsKt.toHashSet(builder.getElementNames$kotlinx_serialization_core());
        String[] strArr = (String[]) builder.getElementNames$kotlinx_serialization_core().toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = Platform_commonKt.compactArray(builder.getElementDescriptors$kotlinx_serialization_core());
        this.elementAnnotations = (List[]) builder.getElementAnnotations$kotlinx_serialization_core().toArray(new List[0]);
        this.elementOptionality = CollectionsKt.toBooleanArray(builder.getElementOptionality$kotlinx_serialization_core());
        Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.name2Index = MapsKt.toMap(arrayList);
        this.typeParametersDescriptors = Platform_commonKt.compactArray(typeParameters);
        this._hashCode$delegate = LazyKt.lazy(new Function0<Integer>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$_hashCode$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                SerialDescriptorImpl serialDescriptorImpl = this.this$0;
                return Integer.valueOf(PluginGeneratedSerialDescriptorKt.hashCodeImpl(serialDescriptorImpl, serialDescriptorImpl.typeParametersDescriptors));
            }
        });
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    public boolean equals(Object obj) {
        SerialDescriptorImpl serialDescriptorImpl = this;
        if (serialDescriptorImpl == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(serialDescriptorImpl.getSerialName(), serialDescriptor.getSerialName()) && Arrays.equals(this.typeParametersDescriptors, ((SerialDescriptorImpl) obj).typeParametersDescriptors) && serialDescriptorImpl.getElementsCount() == serialDescriptor.getElementsCount()) {
                int elementsCount = serialDescriptorImpl.getElementsCount();
                for (int i2 = 0; i2 < elementsCount; i2++) {
                    if (Intrinsics.areEqual(serialDescriptorImpl.getElementDescriptor(i2).getSerialName(), serialDescriptor.getElementDescriptor(i2).getSerialName()) && Intrinsics.areEqual(serialDescriptorImpl.getElementDescriptor(i2).getKind(), serialDescriptor.getElementDescriptor(i2).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int i2) {
        return this.elementAnnotations[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i2) {
        return this.elementDescriptors[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i2) {
        return this.elementNames[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.serialNames;
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i2) {
        return this.elementOptionality[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, getElementsCount()), ", ", getSerialName() + '(', ")", 0, null, new Function1<Integer, CharSequence>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl.toString.1
            {
                super(1);
            }

            public final CharSequence invoke(int i2) {
                return SerialDescriptorImpl.this.getElementName(i2) + ": " + SerialDescriptorImpl.this.getElementDescriptor(i2).getSerialName();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, 24, null);
    }
}
