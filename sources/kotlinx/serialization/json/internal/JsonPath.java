package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":!\u007f\u0007ljA0RxP\u008cZS8\u001bsڔ<$i$yCAW\"}8\tWNmntϺpŏs\u000f4\u00151iD\nXޯa\u0012\u001d2\u000bsM;eokB)xD\u000f82PCB\u0015\u000f&BH>\u007f+IY\u0019*2VohQSMM& \u0014V /)\rk\\E`l\fJw'\u0011zZNUjx\u0003[\u001f^TU\u0018=af1NJM\u0015S\\I\u001b\u001biM\u0017Wqk\u0010\u0019-5@aum5\u0007~\\!9e%]!1\r\t_w$'YQ4W^\u000f@w)}cɠ\u0010؝\n'P͓}0t\u000b&;\u0005vcBf\u0001\rA.~8ت#Ӿ\u0004539)k\"mI\u001ff7*\fc̗/ъr!c٪\u05fed."}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDV0-\u0018>", "", "u(E", "1ta?X5M2\u0019\n\na", "", "1ta?X5M=\u0016\u0004z\\;g\u0005>h", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "7mS6V0>a", "", "5dc\u001dT;A", "", ">n_\u0011X:<`\u001d\n\nh9", "", ">qTAg@,b&\u0003\u0004`", "7s", ">tb57,LQ&\u0003\u0006m6\n", "Ac", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "@db2g\nN`&~\u0004m\u0014x\u0014\u0015e\u0014", "@db6m,", "BnBAe0GU", "CoS.g,\u001cc&\fzg;d\u0005:K\u007f<", "9dh", "CoS.g,\u001dS'|\bb7\f\u0013<I\t'{S", "7mS2k", "\"n\\/f;H\\\u0019", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonPath {
    private int currentDepth;
    private Object[] currentObjectPath = new Object[8];
    private int[] indicies;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gڍ0!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDV0-\u0018'PC\u000f`:]\u00010G\"", "", "u(E", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Tombstone {
        public static final Tombstone INSTANCE = new Tombstone();

        private Tombstone() {
        }
    }

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    private final String prettyString(Object obj) {
        String serialName;
        SerialDescriptor serialDescriptor = obj instanceof SerialDescriptor ? (SerialDescriptor) obj : null;
        return (serialDescriptor == null || (serialName = serialDescriptor.getSerialName()) == null) ? String.valueOf(obj) : serialName;
    }

    private final void resize() {
        int i2 = this.currentDepth * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.currentObjectPath, i2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        this.currentObjectPath = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.indicies, i2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
        this.indicies = iArrCopyOf;
    }

    public final String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.currentDepth + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = this.currentObjectPath[i3];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.areEqual(serialDescriptor.getKind(), StructureKind.LIST.INSTANCE)) {
                    int i4 = this.indicies[i3];
                    if (i4 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.getElementName(i4));
                    }
                } else if (this.indicies[i3] != -1) {
                    sb.append("[");
                    sb.append(this.indicies[i3]);
                    sb.append("]");
                }
            } else if (obj != Tombstone.INSTANCE) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void popDescriptor() {
        int i2 = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            this.currentDepth = i2 - 1;
        }
        int i3 = this.currentDepth;
        if (i3 != -1) {
            this.currentDepth = i3 - 1;
        }
    }

    public final void pushDescriptor(SerialDescriptor sd) {
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i2 = this.currentDepth + 1;
        this.currentDepth = i2;
        if (i2 == this.currentObjectPath.length) {
            resize();
        }
        this.currentObjectPath[i2] = sd;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.indicies;
        int i2 = this.currentDepth;
        if (iArr[i2] == -2) {
            this.currentObjectPath[i2] = Tombstone.INSTANCE;
        }
    }

    public String toString() {
        return getPath();
    }

    public final void updateCurrentMapKey(Object obj) {
        int[] iArr = this.indicies;
        int i2 = this.currentDepth;
        if (iArr[i2] != -2) {
            int i3 = i2 + 1;
            this.currentDepth = i3;
            if (i3 == this.currentObjectPath.length) {
                resize();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i4 = this.currentDepth;
        objArr[i4] = obj;
        this.indicies[i4] = -2;
    }

    public final void updateDescriptorIndex(int i2) {
        this.indicies[this.currentDepth] = i2;
    }
}
