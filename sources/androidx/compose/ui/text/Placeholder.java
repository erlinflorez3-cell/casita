package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
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
/* JADX INFO: compiled from: Placeholder.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ltA0RnP.XS2\u000fy\u0002<řc$\u007fOC٥ \u00038ޛ\u007fN\u0016f/ej\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=3RsM6eok=žx6\u0013%zNF\u0007\u001d\u0001Hݒx\u0016|zQK$\u0012^A!@X\r[\u00072\u00124?P\u0007$\\uQNH\u001baǶ.݊ɨmDT5m?E^\u001bVl';\b\u0012$9RO7+$\u0002\u0002Mҏ[\b\tM\u0005U\u0005\u0017;m?\u0012yeKp\u007fB+qc]t\u0001(t\u0005\u007faѨ&˃\u05cbbJח\u00120\u007fz\n\u0015T\u0006\u0014\f5O~D(i \u000eaxʺRó҉\u0001]۰\u0004\u0003i6%0\u001851B)p\"xI\u0019f7*\u0006۵\u001dŀҠm ƟX\u0016h\u0015)\\\u0010S7]NDʳN\u0013a@sհ\r\u0011\u00012\u00046fĲ3\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "", "EhSA[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "6dX4[;", ">kP0X/HZ\u0018~\bO,\n\u00183c{/WG\u0005\u0019 ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u001fMPJo2\u001a\u001cDh=\tl\u0002", "uI9\u0016?2Hb \u0003\u0004(1\u000e\u0011xi\t7{M\n\u0013\u001e\u0011N\u000e=r5<h[*@{%;]AJuA\u0006\u0011ug9\u00149o?", "5dc\u0015X0@V(FmL\b`l$E", "u(9", "\u0018", "5dc\u001d_(<S\u001c\t\u0002],\ny/r\u000f,y<\br\u001eKq\u0017\u0004[u;=K(5", "u(8", "\u0017", "5dc$\\+MV`qh:\u0010`}\u000f", "1n_F", "1n_F \u0012\u0011?`xt1", "uI9\u0016\u001c\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u001d<\n4~D\u0005\u001c5m\u00198TB;x\n", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    public /* synthetic */ Placeholder(long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, i2);
    }

    private Placeholder(long j2, long j3, int i2) {
        this.width = j2;
        this.height = j3;
        this.placeholderVerticalAlign = i2;
        if (TextUnitKt.m6849isUnspecifiedR2X_6o(j2)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        }
        if (TextUnitKt.m6849isUnspecifiedR2X_6o(j3)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }

    /* JADX INFO: renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m6037getWidthXSAIIZE() {
        return this.width;
    }

    /* JADX INFO: renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m6035getHeightXSAIIZE() {
        return this.height;
    }

    /* JADX INFO: renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m6036getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* JADX INFO: renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m6033copyK8Q__8$default(Placeholder placeholder, long j2, long j3, int i2, int i3, Object obj) {
        if ((1 & i3) != 0) {
            j2 = placeholder.width;
        }
        if ((2 & i3) != 0) {
            j3 = placeholder.height;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i2 = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m6034copyK8Q__8(j2, j3, i2);
    }

    /* JADX INFO: renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m6034copyK8Q__8(long j2, long j3, int i2) {
        return new Placeholder(j2, j3, i2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.m6828equalsimpl0(this.width, placeholder.width) && TextUnit.m6828equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m6041equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    public int hashCode() {
        return (((TextUnit.m6832hashCodeimpl(this.width) * 31) + TextUnit.m6832hashCodeimpl(this.height)) * 31) + PlaceholderVerticalAlign.m6042hashCodeimpl(this.placeholderVerticalAlign);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m6838toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m6838toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m6043toStringimpl(this.placeholderVerticalAlign)) + ')';
    }
}
