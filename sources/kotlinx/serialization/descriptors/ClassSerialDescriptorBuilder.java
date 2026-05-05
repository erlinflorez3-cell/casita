package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":0\u007f\u0007t\u0004A0JjP.`r2\u000fq{<$q$yCAW\"}0\u0012WNmnvJh,KƤ\u000e\u0016\u0007j4I[zs܈?2pn\u007f@SڎM=ntN\u0005N3ŕ<y\u0013\u0003bXV0\u000fzql<\u0016>b\t:\u0001\u000e}\t(5\u001e>N\u0011NhmNDK\u0005cJ13\u0003\u0018G|+\u00106\u0003M\u001bjl';\f2F9CO;%'c\u00035W\nC9C0A[ؚ3ݳ/[{ɎFZ\u0006\u001a#2g\u000fcz4e%Sf\u001656 \u0002Y\\&4\b\u0003\f\u0013L\u0006\u001e\u0006UM\\1Hs^ԅ5ϢvYHА\u001a`H\u000e\tj\u0007/3\u000fK1I\u001dvQ\u0010KG[\u000eާ\u0007ڟ\")\t͙9]Z\u001fn\u001ekl\u0006cIWP?XN8ZkzZ͐d͆.\n8Ϛ\u00181\u0002$< uOiM;'{\u0004XD\u0016\f3m?׆kʐLF*Â.90\u001f\u001ac\u0015\u0007\u0013\u0003hT\u0007AGQZX]ê\u0014˙$n\u007f˓1'\u0016f]o\u0002lSt\u0018>Oh=s|\u0007^fG^K5\u007fdߧeX~ܝW>h!f\u0004\u0013e\u001axt.24Xj>x*c%ۿ\u0015\u0558Cq$عϢ5>"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001K\u001d*[Q)kA\"\u0011o@9\u0015a9R\u00026QY+<`Yq=!g", "", "Ada6T3'O!~", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "/m]<g(MW#\b\t", "", "", "5dc\u000ea5Hb\u0015\u000e~h5\u000bG+n\t2\u000b<\u0010\u001b!P}", "u(E", "5dc\u000ea5Hb\u0015\u000e~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u000ea5Hb\u0015\u000e~h5\u000b", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "3kT:X5M/\"\b\u0005m(\f\r9n\u000e", "", "5dc\u0012_,FS\"\u000eVg5\u0007\u0018+t\u00042\u0005N?\u001d!Vv\u0012E\n\u001fCY\u000b$3t\u001aCIR?u=\u0018\u0013rn9", "3kT:X5M2\u0019\rxk0\b\u00189r\u000e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "5dc\u0012_,FS\"\u000eY^:z\u00163p\u000f2\tN?\u001d!Vv\u0012E\n\u001fCY\u000b$3t\u001aCIR?u=\u0018\u0013rn9", "3kT:X5M<\u0015\u0007zl", "5dc\u0012_,FS\"\u000ecZ4|\u0017mk\n7\u0003D\n*\u0011Uo\u001b@r,9ny/;w\u001f(KMHk", "3kT:X5M=$\u000e~h5x\u00103t\u0014", "", "5dc\u0012_,FS\"\u000edi;\u0001\u00138a\u0007,\u000bT?\u001d!Vv\u0012E\n\u001fCY\u000b$3t\u001aCIR?u=\u0018\u0013rn9", "7r=B_3:P ~", "7r=B_3:P ~9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(I", "Adc\u001bh3EO\u0016\u0006z", "uY\u0018#", "5dc X9BO gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "CmX>h,'O!~\t", "", "3kT:X5M", "", "3kT:X5M<\u0015\u0007z", "2db0e0Ib#\f", "7r>=g0H\\\u0015\u0006", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ClassSerialDescriptorBuilder {
    private List<? extends Annotation> annotations;
    private final List<List<Annotation>> elementAnnotations;
    private final List<SerialDescriptor> elementDescriptors;
    private final List<String> elementNames;
    private final List<Boolean> elementOptionality;
    private boolean isNullable;
    private final String serialName;
    private final Set<String> uniqueNames;

    public ClassSerialDescriptorBuilder(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.annotations = CollectionsKt.emptyList();
        this.elementNames = new ArrayList();
        this.uniqueNames = new HashSet();
        this.elementDescriptors = new ArrayList();
        this.elementAnnotations = new ArrayList();
        this.elementOptionality = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String str, SerialDescriptor serialDescriptor, List list, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        classSerialDescriptorBuilder.element(str, serialDescriptor, list, z2);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAnnotations$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = ",YiJ}\u0001\u0016YdLg\u0004^(5Ra\f\u000b<\u000et\u0010E{XwkZX)yk^mRakzxO1r>\u0017f^~%Y\\@i\fs\u0002\u0018L\u0015W 6I\u0015wKb<.T~\bA'\u001b~Z\u0019O\u000fP@u?h{GT\u001ez\u0001_z:X\u00154\u0012$$\u0019xa _ }9z\u0004#*FM\u0016oPD1[M\u007f")
    @InterfaceC1492Gx
    @ExperimentalSerializationApi
    public static /* synthetic */ void isNullable$annotations() {
    }

    public final void element(String elementName, SerialDescriptor descriptor, List<? extends Annotation> annotations, boolean z2) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!this.uniqueNames.add(elementName)) {
            throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.serialName).toString());
        }
        this.elementNames.add(elementName);
        this.elementDescriptors.add(descriptor);
        this.elementAnnotations.add(annotations);
        this.elementOptionality.add(Boolean.valueOf(z2));
    }

    public final List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public final List<List<Annotation>> getElementAnnotations$kotlinx_serialization_core() {
        return this.elementAnnotations;
    }

    public final List<SerialDescriptor> getElementDescriptors$kotlinx_serialization_core() {
        return this.elementDescriptors;
    }

    public final List<String> getElementNames$kotlinx_serialization_core() {
        return this.elementNames;
    }

    public final List<Boolean> getElementOptionality$kotlinx_serialization_core() {
        return this.elementOptionality;
    }

    public final String getSerialName() {
        return this.serialName;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    public final void setAnnotations(List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.annotations = list;
    }

    public final void setNullable(boolean z2) {
        this.isNullable = z2;
    }
}
