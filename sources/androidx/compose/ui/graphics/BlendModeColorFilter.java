package androidx.compose.ui.graphics;

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
/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0Le^.ZS0\u0015s{B-cҕyCI٥\"Ԃ*\t]To˧vJh\u0017KƤ\f\u001b\u000f̓\\I\u0004w\u001e'\u0015FRsM3eok:pxD\u000782P;ѩ\t\u0001(.\t1|ٙSO\u001a\u0012H@\u001f;b\u0011[\u00072\u00124A0\t,a\u007fRdNU]\u00196ݭ\u0007iPVop>\fe\rtdW\u0013\u0005r6-V6c'kٜ\u0003OXiR\u001b? QK|o-9^\fWdnF(eB]\u000furT_՝PӠѨ&*յgSX\u000e6\u0003\u0013}\u0013E\u0012\u0018V>V.E\u001a\u0015\tս2οʺR?г\u0006fJ\u007f\toN\u0019+\fA8ݐ\u001boYdAϬjez\r\r$Bѐr8"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M!Er>+ulhH\u0007p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "uI8\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "<`c6i,\u001c] \t\b?0\u0004\u0018/r", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$wKv\u001d<\u0004z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hms8TMHL8%$hn\u000f", "uI8\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\n^!\u001eQ|n@}45fS\u0007=w%5QL\u0005pE&^ljH\u0007p5J}p&LO(lY\u0002\u001b\u001e\u001bh\u001d[;\u000b\u0014cN\fjQ=\u001f\u0015\u0002\rr", "5dc\u000f_,GR\u0001\ty^sG\u0012\u00196p:k", "u(8", "\u0017", "5dc\u0010b3H``Iy0&b\u000e\u001f", "u(9", "\u0018", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BlendModeColorFilter extends ColorFilter {
    private final int blendMode;
    private final long color;

    public /* synthetic */ BlendModeColorFilter(long j2, int i2, android.graphics.ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, i2, colorFilter);
    }

    public /* synthetic */ BlendModeColorFilter(long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, i2);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public final long m4123getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public final int m4122getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    private BlendModeColorFilter(long j2, int i2, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j2;
        this.blendMode = i2;
    }

    private BlendModeColorFilter(long j2, int i2) {
        this(j2, i2, AndroidColorFilter_androidKt.m4044actualTintColorFilterxETnrds(j2, i2), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.m4179equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m4089equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
    }

    public int hashCode() {
        return (Color.m4185hashCodeimpl(this.color) * 31) + BlendMode.m4090hashCodeimpl(this.blendMode);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) Color.m4186toStringimpl(this.color)) + ", blendMode=" + ((Object) BlendMode.m4091toStringimpl(this.blendMode)) + ')';
    }
}
