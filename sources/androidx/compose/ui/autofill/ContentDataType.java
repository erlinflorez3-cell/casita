package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ContentDataType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\":\u001b\u007f\u0007lnA0RqP.XU0š*\u0012éBlTqq:\u000e\u0019\u000fb\u0016_Rug\u0007J\t\fß\u0013\b\u001czx/\u0012m\u0007c*\u000f`I EAU\b?O_#5K۪3ŕ<{\u000b\n(4\u0011\u001e\u0005\u0006[K:\u0013vТoĐV\u000fS\u0011(\u0015NL.\u000e6\\\u0016\\|նkҺ>1)\u0012wR\u001f6m0\u0015M;Gù+\u0013~ѭ6-F;C\u001aǵR\u0003߀Vm"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\rIR7ZH)\u0015>", "", "2`c.G@IS", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "5dc\u0011T;:B-\nz", "u(8", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ContentDataType {
    private final int dataType;
    public static final Companion Companion = new Companion(null);
    private static final int Text = m3796constructorimpl(1);
    private static final int List = m3796constructorimpl(3);
    private static final int Date = m3796constructorimpl(4);
    private static final int Toggle = m3796constructorimpl(2);
    private static final int None = m3796constructorimpl(0);

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ ContentDataType m3795boximpl(int i2) {
        return new ContentDataType(i2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static int m3796constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m3797equalsimpl(int i2, Object obj) {
        return (obj instanceof ContentDataType) && i2 == ((ContentDataType) obj).m3801unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m3798equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m3799hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m3800toStringimpl(int i2) {
        return "ContentDataType(dataType=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3797equalsimpl(this.dataType, obj);
    }

    public int hashCode() {
        return m3799hashCodeimpl(this.dataType);
    }

    public String toString() {
        return m3800toStringimpl(this.dataType);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ int m3801unboximpl() {
        return this.dataType;
    }

    private /* synthetic */ ContentDataType(int i2) {
        this.dataType = i2;
    }

    public final int getDataType() {
        return this.dataType;
    }

    /* JADX INFO: compiled from: ContentDataType.android.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005-4\u0012\u0006\rnj?1J͝IDɟ\u0004*=j<9*[ҸuCIUb\u00190\u0017gN\u0016i\u001fNh\u001a[\u000f4&?̓ÒHT\u0084\\܈Ƥ6DuPA_@TGa\r63\"\u07be!\u0600ҿ\u0004\u007fʀ.P\u0018v\tHc\u000e\u00183Nt\u000bi\u001bS\u001d\u001a@\bͽ\u001fҵʟ[fߑ:Pt]H4;\u0005oI\\+0G\u000bU%F\u0003)͒uѭՕ*?˝9\u001d-S\u0011\fj]E\fMu\u000e\u001cv1?+wuˇ5ݙŕ\u0013\u0014ۣS\u0015er4a\u001dSf\u00175/ zY\\&(&|ց\fɝɂ\r\u0005όL65\u001at\r&5z\u007faDГ\u0002gJ\u0003\u0001ˊRE$\b31XӾjd"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\rIR7ZH)\u0015'?C\u000fn(Wz1P\"", "", "u(E", "\u0012`c2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\rIR7ZH)\u0015>", "5dc\u0011T;>\u001btMMi.\u000f[", "u(8", "\u0017", "\u001ahbA", "5dc\u0019\\:M\u001btMMi.\u000f[", "\u001cn]2", "5dc\u001bb5>\u001btMMi.\u000f[", "\"dgA", "5dc!X?M\u001btMMi.\u000f[", "\"nV4_,", "5dc!b.@Z\u0019FV-~\b\u000bA8", "4q^:", "D`[BX", "", "4q^: \u0013 5{nF1j\r\r)r\u007f/{<\u000f\u0017", "uH\u0018\u0016", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getText-A48pgw8 */
        public final int m3806getTextA48pgw8() {
            return ContentDataType.Text;
        }

        /* JADX INFO: renamed from: getList-A48pgw8 */
        public final int m3804getListA48pgw8() {
            return ContentDataType.List;
        }

        /* JADX INFO: renamed from: getDate-A48pgw8 */
        public final int m3803getDateA48pgw8() {
            return ContentDataType.Date;
        }

        /* JADX INFO: renamed from: getToggle-A48pgw8 */
        public final int m3807getToggleA48pgw8() {
            return ContentDataType.Toggle;
        }

        /* JADX INFO: renamed from: getNone-A48pgw8 */
        public final int m3805getNoneA48pgw8() {
            return ContentDataType.None;
        }

        /* JADX INFO: renamed from: from-LGGHU18$ui_release */
        public final int m3802fromLGGHU18$ui_release(int i2) {
            if (i2 == 0) {
                return m3805getNoneA48pgw8();
            }
            if (i2 == 1) {
                return m3806getTextA48pgw8();
            }
            if (i2 == 2) {
                return m3807getToggleA48pgw8();
            }
            if (i2 == 3) {
                return m3804getListA48pgw8();
            }
            if (i2 == 4) {
                return m3803getDateA48pgw8();
            }
            throw new IllegalArgumentException("Invalid autofill type value: " + i2);
        }
    }
}
