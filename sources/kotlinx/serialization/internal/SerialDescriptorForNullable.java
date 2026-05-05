package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\r@4\u0012\u0006 nj?1LeV4ZS0\u0010s{B-c$wDCU0}*\tUQog|Vb\u000bI\u0010\u000e\u0016\u0007\u000b4I[ze\u0012\u001d˰JoE;SڎSʠ\u0011td\u0004P2P8:\u0010\u0011\u001e8I(v)Bƚ\u0010\u0012>B9K`+e\u0005H\u001f6D. 6^}Mdh3Ү:w8\u0011\u000bZT7a@|{\u0012tXW\u0011\u0005\u00046+n@{ծ$\u001c\u0012\u0015us?1>\"A\u0013\u000b?'YR:ɦ5!\u000f\"9CO;f#*j*i`:>qժb\u0014_\u001cN\u0010z*$l\b\u001c(?H\\6`ǩ\u0007V9\u0003\u001ak@~\u000b%VH\no^/%.@[=)\tiai\"\u0015ѱzM\u0013,L\u0019nOr\u001b\"1-)W\u0010WASP=vS8]sBZͧe͆.\bHI\u00065\n\u0018~)3?s9Q*\"\u0016\u001f\u05cbjЛ\td\u0001Uo\\VKr\u0001$CB\t:gz9[߯SԜ\\0)O\"`\u0015\fX%.k\u0010<O2F#&ŭkҷQa\"'5uEg?}\u001cgQ^aF\bwfиUλ\u0018CTd\u000bjtU$\u001eh]@\"`GAݙyԞHT\u0014ƎJAw0BA\u0002+j+`\u0003LY\u0018Ҩ\u000bރ^n\u0018зl5*\u001bw=E!\u000fjtv\u007fi\tIZ\u0014\u000f=\u0004ۢSڤ\u001d,]Ȩ\u00016\u0003?\u0015\u001c·\u0004q"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#k Dq\u00125,CIiA\" wkFgm97\u0007.NHK3\\(", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#[\u001c5p\u0016-6?CkBs", "=qX4\\5:Z", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[Lj8", "/m]<g(MW#\b\t", "", "", "5dc\u000ea5Hb\u0015\u000e~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "3kT:X5Mav\t\u000bg;", "", "5dc\u0012_,FS\"\u000e\t<6\r\u0012>", "u(8", "7r8;_0GS", "", "u(I", "7r=B_3:P ~", "9h]1", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BQ8'\u0014>", "5dc\u0018\\5=", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;\u0004\u0019q`\u000f", "5dc\u001ce0@W\"z\u0002\u001d2\u0007\u00186i\t;uN\u0001$\u001bCv\u0012Qr49c\u0007\u001a5w#.", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;|\u0015v_F\u000bn;X\u0004|", "Ada6T3'O!~", "", "5dc X9BO gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ada6T3'O!~\t", "", "5dc X9BO gvf,\u000b", "u(;7T=:\u001d)\u000e~euj\t>;", "3pd._:", "=sW2e", "", "5dc\u0012_,FS\"\u000eVg5\u0007\u0018+t\u00042\u0005N", "7mS2k", "5dc\u0012_,FS\"\u000eY^:z\u00163p\u000f2\t", "5dc\u0012_,FS\"\u000e^g+|\u001c", "<`\\2", "5dc\u0012_,FS\"\u000ecZ4|", "6`b566=S", "7r49X4>\\(h\u0006m0\u0007\u0012+l", "BnBAe0GU", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SerialDescriptorForNullable implements SerialDescriptor, CachedNames {
    private final SerialDescriptor original;
    private final String serialName;
    private final Set<String> serialNames;

    public SerialDescriptorForNullable(SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.original = original;
        this.serialName = original.getSerialName() + '?';
        this.serialNames = Platform_commonKt.cachedSerialNames(original);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SerialDescriptorForNullable) && Intrinsics.areEqual(this.original, ((SerialDescriptorForNullable) obj).original);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.original.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    public List<Annotation> getElementAnnotations(int i2) {
        return this.original.getElementAnnotations(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    public SerialDescriptor getElementDescriptor(int i2) {
        return this.original.getElementDescriptor(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.original.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    public String getElementName(int i2) {
        return this.original.getElementName(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.original.getKind();
    }

    public final SerialDescriptor getOriginal$kotlinx_serialization_core() {
        return this.original;
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
        return this.original.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @ExperimentalSerializationApi
    public boolean isElementOptional(int i2) {
        return this.original.isElementOptional(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return true;
    }

    public String toString() {
        return new StringBuilder().append(this.original).append('?').toString();
    }
}
