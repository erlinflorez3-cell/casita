package kotlin.reflect;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0013\u007f\u0007tsAӄLeV\u008cZݷ2\u000fy\u000b<$a$yCIa\"}(\tWNumvJ`\fI\u0010\u001cǝ\u0017|\\I\u0004w\u000e\u0012=2znQsd\u007fCGa\r8\u001b\u001f`$H\u007f\u0013\u00042,^\u000f%|ŲO\f 4\t\u0002HW%M3 B\fL'\u0019 rf|>\u000fǤ]\u0003@1\f\u0002H^)o0+O;P\u001b;˼za,6\t=C!=S1\u0014\u0019o\b\u0014M\u007fU\u000bx)7+wu\u0006@\u001f\u0014Џ\u0019+]\u0018&x4k\u001dQ\u000f\u001cm?\u0018iYa&(&\bB!\r\u0012\u001c\t?JD,Hh^ԇ5ϢvSHАRlP\u0001\u0013cL\u0016S\u0002\nڂ;ӸjQiݢϳRJ"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xW\u0004/z>|$\u00166\u0004\u0019<Z-@`S", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqmD\b\u0016\u0015C|\r+\u000b05/", "\u001aj^A_0G\u001d&~{e,z\u0018xT\u00143{$\t\"\u001e\u001d", "Co_2e\tHc\"}", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqjT\f\u0017l", ":nf2e\tHc\"}", "uKY.i(\bZ\u0015\b|(9|\n6e}7E/\u0015\"\u0017\u001dV\u00138\b!~`y)97#.NJ;iCg\u0004|l9\\'\u001d", "3pd._:", "", "=sW2e", "", "5dc\u0019b>>`u\t\u000bg+\u000b", "", "u(J\u0019](OOb\u0006vg.F\u0016/f\u0007(yOJ\u0006+Roc", "5dc!l7><\u0015\u0007z", "", "5dc\"c7>`u\t\u000bg+\u000b", "6`b566=S", "", "BnBAe0GU", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class WildcardTypeImpl implements WildcardType, TypeImpl {
    public static final Companion Companion = new Companion(null);
    private static final WildcardTypeImpl STAR = new WildcardTypeImpl(null, null);
    private final Type lowerBound;
    private final Type upperBound;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001aj^A_0G\u001d&~{e,z\u0018xW\u0004/z>|$\u00166\u0004\u0019<Z-@`<}Au!*VGEt\n", "", "u(E", "!S0\u001f", "\u001aj^A_0G\u001d&~{e,z\u0018xW\u0004/z>|$\u00166\u0004\u0019<Z-@`S", "5dc G\b+", "u(;8b;EW\"H\b^-\u0004\t-tI\u001a\u007fG\u007f\u0015\u0013Tn|P\u0002%\u0019a\t'\r", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WildcardTypeImpl getSTAR() {
            return WildcardTypeImpl.STAR;
        }
    }

    public WildcardTypeImpl(Type type, Type type2) {
        this.upperBound = type;
        this.lowerBound = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    public String getTypeName() {
        if (this.lowerBound != null) {
            return "? super " + TypesJVMKt.typeToString(this.lowerBound);
        }
        Type type = this.upperBound;
        return (type == null || Intrinsics.areEqual(type, Object.class)) ? Global.QUESTION : "? extends " + TypesJVMKt.typeToString(this.upperBound);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Class cls = this.upperBound;
        if (cls == null) {
        }
        typeArr[0] = cls;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
