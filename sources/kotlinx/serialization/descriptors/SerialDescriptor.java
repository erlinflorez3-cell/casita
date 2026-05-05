package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004O$8\u000b<[\u0007\"2\u0015\u007f\u0007tpA0JgP.`\\2\u000fq}<$q$yCAW\"}0\u0015WNmpt/pŏs\u000f4\u0015A~:dm~m\u0014\u001f2pqm4}sKUxtd\rfWjF\b\"\u0019\u001aXϺ@z\t_c\f@8\u0007\u0016\u0003`\u001bk\u001d\u001a@\u000en$\u000f=tg|M\u000f\u0012&H=C\u001bipeWc>\u0019e\rt\\m2?o,LX7c\"UW\u0011#j[m\u000b\u0006\u0017\u000e#v'?1Yug6\u0007\u0002B\u0016a$cƶt͉`\u000fab\u0012*9S{MV\u00136}K\u0014\u001bC\u001c\u000e4/~R\u0004էhڿ\u0012=\u0005tYI^\u0006vD\u0006\u0005oAg7\u000e?C9Is\b6\u0012ϡPѼ\u007f\t% )\r|/,l\u001co-\u001b\u0003\u0005\b\u0006(͍?˓R\u0014i?s\u0014~f\u001a,\n?U\u000e\u007f\u0014\u001f?/%emoGwȥ\u0004ҩHq\u0007\u0007f{amjJF6|+\bB\u0017\"rD\u0013\u001c\"t+и.ҭQ&d\t\u0004 !$tyB:3*˃S\u000b"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "", "/m]<g(MW#\b\t", "", "", "5dc\u000ea5Hb\u0015\u000e~h5\u000bG+n\t2\u000b<\u0010\u001b!P}", "u(E", "5dc\u000ea5Hb\u0015\u000e~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "3kT:X5Mav\t\u000bg;", "", "5dc\u0012_,FS\"\u000e\t<6\r\u0012>${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u0012_,FS\"\u000e\t<6\r\u0012>", "u(8", "7r8;_0GS", "", "u(I", "7r=B_3:P ~", "7r=B_3:P ~9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "9h]1", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BQ8'\u0014>", "5dc\u0018\\5=\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u0018\\5=", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;\u0004\u0019q`\u000f", "Ada6T3'O!~", "", "5dc X9BO gvf,;\u00058n\n7wO\u0005! U", "5dc X9BO gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0012_,FS\"\u000eVg5\u0007\u0018+t\u00042\u0005N", "7mS2k", "5dc\u0012_,FS\"\u000eY^:z\u00163p\u000f2\t", "5dc\u0012_,FS\"\u000e^g+|\u001c", "<`\\2", "5dc\u0012_,FS\"\u000ecZ4|", "7r49X4>\\(h\u0006m0\u0007\u0012+l", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SerialDescriptor {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static List<Annotation> getAnnotations(SerialDescriptor serialDescriptor) {
            return CollectionsKt.emptyList();
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getAnnotations$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getElementsCount$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getKind$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSerialName$annotations() {
        }

        public static boolean isInline(SerialDescriptor serialDescriptor) {
            return false;
        }

        public static boolean isNullable(SerialDescriptor serialDescriptor) {
            return false;
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void isNullable$annotations() {
        }
    }

    List<Annotation> getAnnotations();

    @ExperimentalSerializationApi
    List<Annotation> getElementAnnotations(int i2);

    @ExperimentalSerializationApi
    SerialDescriptor getElementDescriptor(int i2);

    @ExperimentalSerializationApi
    int getElementIndex(String str);

    @ExperimentalSerializationApi
    String getElementName(int i2);

    int getElementsCount();

    SerialKind getKind();

    String getSerialName();

    @ExperimentalSerializationApi
    boolean isElementOptional(int i2);

    boolean isInline();

    boolean isNullable();
}
