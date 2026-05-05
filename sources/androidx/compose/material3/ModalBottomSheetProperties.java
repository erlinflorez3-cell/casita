package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007lrA0RkP\u008cXX@ş\u001c{b#\u001c3wWK[ }0\tgN\u0016hĔNZ\u0019EO#\u001c\u000ez0WX\u0011]@\u0013BF}DKM\u001e>Id\u00036\u001d `#أ}\u0005\u000f j_ |\u0001CY\u000f*0ntJX\u0013M\u0013\u001a*\u0006l!Ә\"\\uU~YziR/Q\u0004\u001aH\\4w2\u0013L;E\u001bܢ\r?g,9X7c$kgS\u0016`^W\u0003muݘ\tn/ݐCKy_DaP##+g\r\fs͉`\u000bYӠ$)1YqVם\u00128"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^/4U\u0005|A|%8U1>k4-\u007fukD\u0007p;Rv5\u001d", "", "Ag^B_+\u001dW'\u0007~l:f\u0012\fa}.fM\u0001%%", "", "uY\u0018#", "AdRBe,)] \u0003xr", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006d%3i\u000b \u0018t\u001208MBo22j", "7r5<V<LO\u0016\u0006z", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ)\u001bPn\u0018N@\u00135W\u000e-7N\u001d*O.Er8\u001c)>V.JT", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ)\u001bPn\u0018N@\u00135W\u000e-7N\u001d*O.Er8\u001c)>V|w", "5dc X*N`\u0019i\u0005e0z\u001d", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`)Kx\rF\tn#Y{0Dmv5IE&u;\"\u0013|7", "5dc [6NZ\u0018]~l4\u0001\u0017=O\t\u0005w>\u0007\u0002$G}\u001c", "u(I", "3pd._:", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ModalBottomSheetProperties {
    public static final int $stable = 0;
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    public ModalBottomSheetProperties() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z2) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z2;
    }

    public /* synthetic */ ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i2 + 2) - (i2 | 2) != 0 ? true : z2);
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? true : z2);
    }

    public ModalBottomSheetProperties(boolean z2) {
        this(SecureFlagPolicy.Inherit, z2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "iO\u000f\u001b\u0001w*jYI4\u007f\u0017T<OnM\u0016f\u000e{K`\u0006\u0006zy\\{)x(awGQ*(.Y#r=!d_\u000e4mKOtPs)\u0015[\u001cS0\u000bs\u0016z\u0015\u0003v,L\u0010|j'\u001c\u0001Z]", replaceWith = @ReplaceWith(expression = "ModalBottomSheetProperties(securePolicy, shouldDismissOnBackPress)", imports = {}))
    @InterfaceC1492Gx
    public ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z2, boolean z3) {
        this(secureFlagPolicy, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModalBottomSheetProperties) && this.securePolicy == ((ModalBottomSheetProperties) obj).securePolicy;
    }

    public int hashCode() {
        return (this.securePolicy.hashCode() * 31) + Boolean.hashCode(this.shouldDismissOnBackPress);
    }
}
