package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import com.braze.models.FeatureFlag;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0RnP.XS0Ƨk\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\f|Kr\u000bq\u00116\u001c~j:Nmx\f\u0018?8HoM:eokA\u0011z<\u0005.;:8(\rG\u001fzW\u001ew\u0013Cy\u000eܘ4Fxíj\u000fS\b(\u0016ĈB*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^/4U\u0005|A|%8U1>k4-shb5\u0017j;\\L", "", "u(E", ">q^=X9MW\u0019\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^/4U\u0005|A|%8U1>k4-\u007fukD\u0007p;Rv5\u001d", "5dc\u001de6IS&\u000e~^:", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn\u001dc|\u001c>J =\\MCY7\u001e\u0015wLF\u0011n,[\u0006+GZ$", "AdRBe,)] \u0003xr", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006d%3i\u000b \u0018t\u001208MBo22j", "7r5<V<LO\u0016\u0006z", "", "Ag^B_+\u001dW'\u0007~l:f\u0012\fa}.fM\u0001%%", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ModalBottomSheetDefaults {
    public static final int $stable = 0;
    public static final ModalBottomSheetDefaults INSTANCE = new ModalBottomSheetDefaults();
    private static final ModalBottomSheetProperties properties = new ModalBottomSheetProperties(false, 1, (DefaultConstructorMarker) null);

    private ModalBottomSheetDefaults() {
    }

    public final ModalBottomSheetProperties getProperties() {
        return properties;
    }

    public static /* synthetic */ ModalBottomSheetProperties properties$default(ModalBottomSheetDefaults modalBottomSheetDefaults, SecureFlagPolicy secureFlagPolicy, boolean z2, boolean z3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            secureFlagPolicy = SecureFlagPolicy.Inherit;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        return modalBottomSheetDefaults.properties(secureFlagPolicy, z2, z3);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "iO\u000f\u001b\u0001w*jYI4\u007f\u0017T<OnM\u0016f\u000e{K`\u0006\u0006zy\\{)x(awGQ*(.Y#rP\u0013ba~aoQOmMI&K[\u001cM.6D\u0003\u0005\r|<0P\u0010I", replaceWith = @ReplaceWith(expression = FeatureFlag.PROPERTIES, imports = {}))
    @InterfaceC1492Gx
    public final ModalBottomSheetProperties properties(SecureFlagPolicy secureFlagPolicy, boolean z2, boolean z3) {
        return new ModalBottomSheetProperties(secureFlagPolicy, z3);
    }
}
