package androidx.compose.ui.window;

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
/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4E\u0007\"B\u0012\u007f\u0007lmA0RkP.Xc0\u0014\u0002ڔd$\n#2pAi*\u0004(\t]N\u007fg\u001dKj\u0011I\u000f\u0014\u0018\u0011jZJe~c\u0012\u001d5Zom4]uC9nxN\u0005N3ŕ<y\u0013\u0006ZkN$\u0007\u0001IK\u001a\u0012H@\u001f;b\u0013S\u0005(\u0014\u001e>N\u0002.bmNDK\u0005]h03\toB\\-w0+T\u001dLZ'\u001b~y\u001eYAG;\u001b%a\u0007\u001fR\n@ƄCqK\u000e)r-?Yy]6f\u007f,\u0015YP\u001dcx&j\u0007i`:(;UiK^\u0011@w)|\u001dB\n\u000e\u0014-`.[!v\u000e\u00143\u0003zk@~\u0003nH\u0006zo:/%.4;?!f_kS\u0019|8߉\t\r,.A,1_b\u001ax\u0015Ia\bW7QNK`N8ZMs\npp\u0004B\u0004^H\u00105\u0002\u0011<\u001a=7\n:3'q\u0002VL\u007fv3axYoRVJ:nD8Ҋ\r\fhS-\u0016yllXZ\u0012}\"b$\u0016\n)\u001f\u000bv\u0003ư%XT]\u0007\u0002j{jP9\u007fuE]\u0007k<Xo#ۋ9U{\u0012gb\u0005%\u0010Kp\u0007pfpT۱^b0ίJJp\"\u0006\r\u0015]\u001a\u0016J? \u001dٜ07!¢-J\t1PRM\u0018mb\u0001\u0010-Uտ(\tq˅\r\u000b\u0007dj\u0002@y\u0007UD|\u000f/\u0004یSڤ\u001d,]Ȩ\u00016\u00038\u0015\u0015D\u000fUgdGzmL:ʀ\u007f$.\u001c?h=Nc!\r7J\u0002[F#Ǫg˛Q\u0018/ϕ\u0015{\u0015Sv?8\u0017xvD`\u0019Q\u0006\u0019Ђ&zvt)!r\u001aJpT\u0005_c\u0003\fИBOzÅq>TS\u000b\u0016Ƚ\"D"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bDw!.ZR?kBs", "", "4nRBf(;Z\u0019", "", "2hb:\\:L=\"[v\\2g\u0016/s\u000e", "2hb:\\:L=\"\\\u0002b*\u0003r?t\u000e,z@", "1kX=c0GUx\bv[3|\b", "uYI'Mo/", "AdRBe,)] \u0003xr", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006d%3i\u000b \u0018t\u001208MBo22j", "3wR9h+>4&\t\u0003L@\u000b\u0018/ma(\nO\u0011$\u0017", "uYI'?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011\u0002\u0012Eu/G#k 5}#..J7m\u001f(\u001cl_M\\X!\u0012g", "CrT\u001d_(MT#\f\u0003=,}\u0005?l\u000f\u001a\u007f?\u0010\u001a", "uYI'?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011\u0002\u0012Eu/G#k 5}#..J7m\u001f(\u001cl_M\\X!C:\u0018", "4kP4f", "", "7mW2e0MA\u0019|\u000bk,g\u00136i}<", "uHI'M!3\u0017\n", "5dc\u0010_0I^\u001d\b|>5x\u00066e~", "u(I", "5dc\u0011\\:FW'\rdg\tx\u00075P\r(\nN", "5dc\u0011\\:FW'\rdg\n\u0004\r-ki8\u000bN\u0005\u0016\u0017", "5dc\u0012k*Ec\u0018~[k6\u0005vCs\u000f(\u0004\"\u0001%&W|\u000e", "5dc\u0013_(@aW\u000f~X9|\u0010/a\u000e(", "u(8", "5dc\u0013b*Na\u0015{\u0002^", "5dc\u0016a/>`\u001d\u000eh^*\r\u0016/P\n/\u007f>\u0015U'Ki\u001b<}%1g}", "5dc X*N`\u0019i\u0005e0z\u001d", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`)Kx\rF\tn#Y{0Dmv5IE&u;\"\u0013|7", "5dc\"f,)Z\u0015\u000e{h9\u0005g/f{8\u0003Or\u001b\u0016Vr", "3pd._:", "=sW2e", "6`b566=S", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final int flags;
    private final boolean inheritSecurePolicy;
    private final boolean usePlatformDefaultWidth;

    public PopupProperties(int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.flags = i2;
        this.inheritSecurePolicy = z2;
        this.dismissOnBackPress = z3;
        this.dismissOnClickOutside = z4;
        this.excludeFromSystemGesture = z5;
        this.usePlatformDefaultWidth = z6;
    }

    public /* synthetic */ PopupProperties(int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? true : z2, (4 & i3) != 0 ? true : z3, (8 & i3) != 0 ? true : z4, (16 & i3) == 0 ? z5 : true, (-1) - (((-1) - i3) | ((-1) - 32)) != 0 ? false : z6);
    }

    public final int getFlags$ui_release() {
        return this.flags;
    }

    public final boolean getInheritSecurePolicy$ui_release() {
        return this.inheritSecurePolicy;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public /* synthetic */ PopupProperties(boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? true : z3, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? true : z4, (i2 & 8) != 0 ? true : z5);
    }

    public PopupProperties(boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z2, z3, z4, SecureFlagPolicy.Inherit, true, z5);
    }

    public /* synthetic */ PopupProperties(boolean z2, boolean z3, boolean z4, SecureFlagPolicy secureFlagPolicy, boolean z5, boolean z6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2, (2 & i2) != 0 ? true : z3, (4 & i2) != 0 ? true : z4, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (16 & i2) != 0 ? true : z5, (-1) - (((-1) - i2) | ((-1) - 32)) == 0 ? z6 : true);
    }

    public PopupProperties(boolean z2, boolean z3, boolean z4, SecureFlagPolicy secureFlagPolicy, boolean z5, boolean z6) {
        this(z2, z3, z4, secureFlagPolicy, z5, z6, false);
    }

    public /* synthetic */ PopupProperties(boolean z2, boolean z3, boolean z4, SecureFlagPolicy secureFlagPolicy, boolean z5, boolean z6, boolean z7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2, (i2 & 2) != 0 ? true : z3, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? true : z4, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i2 + 16) - (i2 | 16) != 0 ? true : z5, (i2 & 32) == 0 ? z6 : true, (i2 & 64) == 0 ? z7 : false);
    }

    public PopupProperties(boolean z2, boolean z3, boolean z4, SecureFlagPolicy secureFlagPolicy, boolean z5, boolean z6, boolean z7) {
        this(AndroidPopup_androidKt.createFlags(z2, secureFlagPolicy, z6), secureFlagPolicy == SecureFlagPolicy.Inherit, z3, z4, z5, z7);
    }

    public final boolean getFocusable() {
        return (-1) - (((-1) - this.flags) | ((-1) - 8)) == 0;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        if (this.inheritSecurePolicy) {
            return SecureFlagPolicy.Inherit;
        }
        int i2 = this.flags;
        return (i2 + 8192) - (i2 | 8192) == 0 ? SecureFlagPolicy.SecureOff : SecureFlagPolicy.SecureOn;
    }

    public final boolean getClippingEnabled() {
        return (-1) - (((-1) - this.flags) | ((-1) - 512)) == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.flags == popupProperties.flags && this.inheritSecurePolicy == popupProperties.inheritSecurePolicy && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.usePlatformDefaultWidth == popupProperties.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((((this.flags * 31) + Boolean.hashCode(this.inheritSecurePolicy)) * 31) + Boolean.hashCode(this.dismissOnBackPress)) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + Boolean.hashCode(this.excludeFromSystemGesture)) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth);
    }
}
