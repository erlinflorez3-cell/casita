package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
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
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4K\u0007\":\u001b\u007f\u0007lqA0RkP\u008cXX@ş\u001c{b#\u001cG\u0002GIU2}P\n_Rui\u0007J\t\fS\u0013\u0014\u0019\u0011jZJe|k\u0016'2ppУ7M}B\u0002{\u00036\u001d `#h}\u0013\r2*v\u001d=yǈJ\u000bݮ/ϋ¤>T\u0013[\u0013)Z!L\"\u0019\u001e\u000bh~:Vxu:]0IhƢM&ܸ/ŧ֔\u0011HZ7\u001b\u0006*T9QO5CǬ\u0004\t\rRi?\u001b? >5n-'9K\fWdY0\u001a\u001b+]\u0010urT]5Wf\f5/gcyQ̤'»ߡ\u007f\u000fB\u0016\u001c\u0019oY<A2f6\u001bcz\u0001hXR\u0018]p~Aʿ6_+\u000eIC9I}\u0018u\f0\\7\u0014\u0005;\u001fƹ\u007f͙ƈZS\u05f8d\u001d#T\u0006YISFCVUZpKo\u001cp\u0011\u0003ň\u0003\u0382ѓ~.ɨ\u00156\u001f%EcQ%'t\u0010O\u0015~\u0005\bxh\u0002j˦Gؗ·m\u0015֖.\u0011\u0014ZRl\u001dmV^f3ad*X\u001f}6\u0014ٷ[ɼ͌ $ŎRWpixUu\f+:t>խnt\u0016Z?ӶOcPk\u0010gqρ\u0018W"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S5Dh\b)\u0015w\u001d8ZQ\u0011", "", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>Rv\t\u0004m,\u0006\u0018\ro\u00072\t", "uI9\u0017=\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109rGrz\u0012z|\u001c7", "u(9", "\u0018", "5dc\u0010b5MS\"\u000eXh3\u0007\u0016v0~yu&\u0006\u0007", "5dc\u0011\\::P ~y<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc\u0011\\::P ~y<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$^\u0012n_6\\*%", "3mP/_,=", "", "1n]AT0GS&\\\u0005e6\nP@N\u0013\u0005F\u0011\u0007U\u001fC~\u000eIz!<'w-7t\u0016*[C", "uY\u0018\u0017", "1n]AX5M1#\u0006\u0005ks\u000eqBBJx\u0002~\t\u0013&G|\u00128}r/f}'7i$.", "1n_F", "1n_F 1+Z\n}\u0005h", "uI9\u0017=o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Ok\u001d<\u0004)1`Ki\u0014}%=WL\u0019u;(\"v7", "3pd._:", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ButtonColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ ButtonColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    private ButtonColors(long j2, long j3, long j4, long j5) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.disabledContainerColor = j4;
        this.disabledContentColor = j5;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1822getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m1823getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1824getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m1825getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    /* JADX INFO: renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ ButtonColors m1818copyjRlVdoo$default(ButtonColors buttonColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            j2 = buttonColors.containerColor;
        }
        if ((2 & i2) != 0) {
            j3 = buttonColors.contentColor;
        }
        if ((4 & i2) != 0) {
            j4 = buttonColors.disabledContainerColor;
        }
        if ((i2 & 8) != 0) {
            j5 = buttonColors.disabledContentColor;
        }
        return buttonColors.m1821copyjRlVdoo(j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: copy-jRlVdoo, reason: not valid java name */
    public final ButtonColors m1821copyjRlVdoo(long j2, long j3, long j4, long j5) {
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        long j9 = j5;
        if (j6 == 16) {
            j6 = this.containerColor;
        }
        if (j7 == 16) {
            j7 = this.contentColor;
        }
        if (j8 == 16) {
            j8 = this.disabledContainerColor;
        }
        if (j9 == 16) {
            j9 = this.disabledContentColor;
        }
        return new ButtonColors(j6, j7, j8, j9, null);
    }

    /* JADX INFO: renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1819containerColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.containerColor : this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: contentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1820contentColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.contentColor : this.disabledContentColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        return Color.m4179equalsimpl0(this.containerColor, buttonColors.containerColor) && Color.m4179equalsimpl0(this.contentColor, buttonColors.contentColor) && Color.m4179equalsimpl0(this.disabledContainerColor, buttonColors.disabledContainerColor) && Color.m4179equalsimpl0(this.disabledContentColor, buttonColors.disabledContentColor);
    }

    public int hashCode() {
        return (((((Color.m4185hashCodeimpl(this.containerColor) * 31) + Color.m4185hashCodeimpl(this.contentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledContentColor);
    }
}
