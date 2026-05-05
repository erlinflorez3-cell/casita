package defpackage;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLc\u0003\u0012Iي8\u000b<H\u0007\"2\u001c}џ\u0080jOӄbrx.\u0001RZ\u0015{}D$\nҕ CsT'>1\u000fO^kuobZ9EǇ\n\u0018~m:M&\u000bk\u0013'2pq\u0016ݣOڱA?hҚN\u0007&70>b\u0005\u0007!\u0013H\u0016~cCQ\u0015z0Fz#R\u0013Xm\u001a\u0018\u0012̭$\u000f"}, d2 = {"\u001a@a0[0MS\u0017\u000e\u000bk,R", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "", "D`[BX", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc#T3NS", "u(8", "\u000fQ<\u007f%", "\u000fQ<\u0003'", "&7%", "&7%,)z", " HB\u0010I|\r", "\u001cN=\u0012", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class Architecture implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Architecture[] $VALUES;
    public static final ProtoAdapter<Architecture> ADAPTER;
    public static final Architecture ARM32;
    public static final Architecture ARM64;
    public static final Companion Companion;
    public static final Architecture NONE;
    public static final Architecture RISCV64;
    public static final Architecture X86;
    public static final Architecture X86_64;
    private final int value;

    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4\u0012}\u0007njG6L͜N\u0093Siճ?k*3db*qٴ?W }0\n\u0018^ul\u0007Lp\nq\u00136\u001a\u0007pDI\u0004\u007f$\u0017_FPqW9]qM9\u000fxd\bV6x؈{ڱ\u0005\u001a2ϺǞz\u0003"}, d2 = {"\u001a@a0[0MS\u0017\u000e\u000bk,;f9m\u000b$\u0005D\u000b l", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001a@a0[0MS\u0017\u000e\u000bk,R", "4q^:I(Ec\u0019", "D`[BX", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Architecture fromValue(int i2) {
            if (i2 == 0) {
                return Architecture.ARM32;
            }
            if (i2 == 1) {
                return Architecture.ARM64;
            }
            if (i2 == 2) {
                return Architecture.X86;
            }
            if (i2 == 3) {
                return Architecture.X86_64;
            }
            if (i2 == 4) {
                return Architecture.RISCV64;
            }
            if (i2 != 5) {
                return null;
            }
            return Architecture.NONE;
        }
    }

    private static final /* synthetic */ Architecture[] $values() {
        return new Architecture[]{ARM32, ARM64, X86, X86_64, RISCV64, NONE};
    }

    static {
        final Architecture architecture = new Architecture("ARM32", 0, 0);
        ARM32 = architecture;
        ARM64 = new Architecture("ARM64", 1, 1);
        X86 = new Architecture("X86", 2, 2);
        X86_64 = new Architecture("X86_64", 3, 3);
        RISCV64 = new Architecture("RISCV64", 4, 4);
        NONE = new Architecture("NONE", 5, 5);
        Architecture[] architectureArr$values = $values();
        $VALUES = architectureArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(architectureArr$values);
        Companion = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Architecture.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Architecture>(orCreateKotlinClass, syntax, architecture) { // from class: Architecture$Companion$ADAPTER$1
            {
                Architecture architecture2 = architecture;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Architecture fromValue(int i2) {
                return Architecture.Companion.fromValue(i2);
            }
        };
    }

    private Architecture(String str, int i2, int i3) {
        this.value = i3;
    }

    @JvmStatic
    public static final Architecture fromValue(int i2) {
        return Companion.fromValue(i2);
    }

    public static EnumEntries<Architecture> getEntries() {
        return $ENTRIES;
    }

    public static Architecture valueOf(String str) {
        return (Architecture) Enum.valueOf(Architecture.class, str);
    }

    public static Architecture[] values() {
        return (Architecture[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }
}
