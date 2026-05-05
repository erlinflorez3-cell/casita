package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
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
/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4K\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:)qҕ\"CiTZ\u001b(ޛ_Rug\u0007J\t\fS\u0013\u0014\u0018\u0011jZJe|k\u0015'2ppУ7M}A\u0002q\u0003B\u001d `/h\u007f\u0013\u000f2,^\u000f%y\nƎ\fZ6N\u007fRR;]K.Z\fL1\u0019\u001e\u000by\u0015J\u0019\u0004k=G#1jƢMϋܸ/{֔\u0011N\\'\u001b}y 1EE;e<a\u0003\u001fR\n@ǚ>мޮ\u0004gҊ+3Qse=p\u0002\u001a\u001d9U]r\u0001/t\u0005\u007faBk̼NҪؘO\r߭{~\u0014\u000fB\u000e\u001c\fw_</2f6\u000f\u008fsɁ֘?OؿbJ\bzo=/'\u0006>9?ӘfZi>\u001f\u05edS*\u0004\u0015\u001e) \u0382%n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2D\b.;|\u001a8V\u0019", "", ":dUA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "EhSA[", "1n]AX5ME\u001d}\na", "uE5\u0013?2Hb \u0003\u0004(1\u000e\u0011xi\t7{M\n\u0013\u001e\u0011N\u000e=r5<h[*@{%;]AJuA\u0006\u0011ug9\u00149o?", "5dc\u0010b5MS\"\u000elb+\f\fvDS\b\u0001\u0010\u0002~", "u(5", "\u0014", "5dc\u0019X-M\u001bwRZc{}p", "@hV5g", "5dc\u001f\\.Ab`]N>1L\n\u0017", "5dc$\\+MV`]N>1L\n\u0017", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TabPosition {
    public static final int $stable = 0;
    private final float contentWidth;
    private final float left;
    private final float width;

    public /* synthetic */ TabPosition(float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4);
    }

    private TabPosition(float f2, float f3, float f4) {
        this.left = f2;
        this.width = f3;
        this.contentWidth = f4;
    }

    /* JADX INFO: renamed from: getContentWidth-D9Ej5fM, reason: not valid java name */
    public final float m2600getContentWidthD9Ej5fM() {
        return this.contentWidth;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m2601getLeftD9Ej5fM() {
        return this.left;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m2603getWidthD9Ej5fM() {
        return this.width;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m2602getRightD9Ej5fM() {
        return Dp.m6638constructorimpl(this.left + this.width);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.m6643equalsimpl0(this.left, tabPosition.left) && Dp.m6643equalsimpl0(this.width, tabPosition.width) && Dp.m6643equalsimpl0(this.contentWidth, tabPosition.contentWidth);
    }

    public int hashCode() {
        return (((Dp.m6644hashCodeimpl(this.left) * 31) + Dp.m6644hashCodeimpl(this.width)) * 31) + Dp.m6644hashCodeimpl(this.contentWidth);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m6649toStringimpl(this.left)) + ", right=" + ((Object) Dp.m6649toStringimpl(m2602getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m6649toStringimpl(this.width)) + ", contentWidth=" + ((Object) Dp.m6649toStringimpl(this.contentWidth)) + ')';
    }
}
