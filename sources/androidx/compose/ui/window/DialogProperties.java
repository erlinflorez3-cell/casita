package androidx.compose.ui.window;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4D\u0007\"B\u0012\u007f\u0007luA0RkP\u008cXX@ş\u001c{b#\u001cGwWK[ }0\tgN\u0016h~P`\u000bQ\u0011\u001e\u0016'k<O[xk\u0015'2ppУ7M}Ay\u0004zK\u0015&8\"Fy\u001d\u0001H+X\u0016|zQM$\u0012^A\u0001@X\r[\n2\u00124Dŋ\u0005\u001ejn\u000fkXrc:=#\u001bipO7e6|[\u000f^TU\u000e\u0007g$+N<M\u0015SY\u0013\rX[M\u0006Wqk\u0006x--+W{o6\u0007\u0001Џ\u0019+]\u0016&\u00044m\u001dQ\u000f\rW1]ucR$'&yBȵ<L\u0014\u0014:`.[.-\u001c^B\u0003zk@~\u0003ެF\u0006\u0003ʨN\u0019+\nA6\n*tQy;GOѼ\u007f\u000b\u0015̔;\u0003t-i_^o#\u001dlw\u007f2ҨDCPݐ\"[Cz\u0012{3\u00118\tHG.5ɨ\u00154\u001f¦O]?1/zRWRj\u000f\u0005\u000fiרmXPؗ:p\u001cG8\u0014ɚ^Y"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006U)1`\b\"\"z 9MPJo4,j", "", "2hb:\\:L=\"[v\\2g\u0016/s\u000e", "", "2hb:\\:L=\"\\\u0002b*\u0003r?t\u000e,z@", "CrT\u001d_(MT#\f\u0003=,}\u0005?l\u000f\u001a\u007f?\u0010\u001a", "uYI'\u001c\u001d", "AdRBe,)] \u0003xr", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006d%3i\u000b \u0018t\u001208MBo22j", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Ys\u0017;\u00017~G}\u001eGz\u0016\u000fT?=V>%\u0019fu\u000fJT", "2dR<e\rBb'l\u000fl;|\u0011!i\t'\u0006R\u000f", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Ys\u0017;\u00017~G}\u001eGz\u0016\u000fT?=V>%\u0019fu\u000f{Xo?", "5dc\u0011X*H`y\u0003\nl\u001a\u0011\u0017>e\b\u001a\u007fI\u007f!)U", "u(I", "5dc\u0011\\:FW'\rdg\tx\u00075P\r(\nN", "5dc\u0011\\:FW'\rdg\n\u0004\r-ki8\u000bN\u0005\u0016\u0017", "5dc X*N`\u0019i\u0005e0z\u001d", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`)Kx\rF\tn#Y{0Dmv5IE&u;\"\u0013|7", "5dc\"f,)Z\u0015\u000e{h9\u0005g/f{8\u0003Or\u001b\u0016Vr", "3pd._:", "=sW2e", "6`b566=S", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DialogProperties {
    public static final int $stable = 0;
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    public DialogProperties() {
        this(false, false, null, false, false, 31, null);
    }

    public DialogProperties(boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this.dismissOnBackPress = z2;
        this.dismissOnClickOutside = z3;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z4;
        this.decorFitsSystemWindows = z5;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public /* synthetic */ DialogProperties(boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? true : z2, (2 & i2) != 0 ? true : z3, (i2 + 4) - (4 | i2) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? true : z4, (i2 + 16) - (i2 | 16) == 0 ? z5 : true);
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public /* synthetic */ DialogProperties(boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? true : z2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? true : z3, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? true : z4);
    }

    public DialogProperties(boolean z2, boolean z3, boolean z4) {
        this(z2, z3, SecureFlagPolicy.Inherit, z4, true);
    }

    public /* synthetic */ DialogProperties(boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? true : z2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? true : z3, (i2 + 4) - (i2 | 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    public /* synthetic */ DialogProperties(boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy) {
        this(z2, z3, secureFlagPolicy, true, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + Boolean.hashCode(this.decorFitsSystemWindows);
    }
}
