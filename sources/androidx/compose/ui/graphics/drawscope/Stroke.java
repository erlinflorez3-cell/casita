package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq\u0005<$i-yّCU(Ԃ*ޛWNumvϺb\u000bQ\u001b\u000e\u0016~jBկs\u0014\u000e\u0012=1znZs\u0005\u007fC?`\u00036\u001d `#H\u007f\u000b\u0001(,`\u0010%{SQ\u0012\u0012>C\t:\u0001\u0011]\u000b \u0012\u0014C8\u0001LbwV<HzdR19\u0002\u0018JĚ+_>\u0006\u0016\u001eTg?\r%uN1NLM\u0017;R1\u001d\u0019Ð?KE\u007fT\u001dhU?q]<]Dq\u0018\u0014CE\u0016!.\n4_\u001dQ\u000f\u0010̥*ՒԣJOˎ,\u007f\u0003{\u001bH\u001c\u0010\f1V9}1t\r&3#x֘?Аڕ]Aȸ~i>\u00173\fK-?(t\\2J'PO{3\u000e̷'\u0007vďsV\u0014n#*%\t_8iBSG|\u0012ՒAs\f͏z\u00040\u0014>XP>\n\u0011F\u0017S8٦=))ǽ\u001aJJy\u0005\u0014\u009eh\\qUNع>\u001d\u0015?*\u000f+ʗH\u0001"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r)zA(\u001bh7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "EhSA[", "", ";hc2e", "1`_", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "8nX;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", ">`c58-?S\u0017\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0017n\u0017.KR\u0011", "uE5\u0016<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001X\u0012=P#<l4\u001c$>H?\u0011r3R\u007fpL]Vu`[\u0002=!\u001bV\u0015\u0018\n\r\u0006UQ+}\"A(\u0016;V\u00129w\u000b\u0019}\nBppO,S8", "5dc\u0010T7\u00069\u0015i]d\u000e\u000f", "u(8", "\u0017", "5dc\u0017b0G\u001b\u007f\u0012[;4\u0003[", "5dc\u001a\\;>`", "u(5", "5dc\u001dT;A3\u001a\u007fz\\;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001cFpu/NC9z\n", "5dc$\\+MV", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Stroke extends DrawStyle {
    public static final Companion Companion = new Companion(null);
    private static final int DefaultCap = StrokeCap.Companion.m4531getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m4542getMiterLxFBmk8();
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;

    public /* synthetic */ Stroke(float f2, float f3, int i2, int i3, PathEffect pathEffect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, i2, i3, pathEffect);
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getMiter() {
        return this.miter;
    }

    public /* synthetic */ Stroke(float f2, float f3, int i2, int i3, PathEffect pathEffect, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i4) != 0 ? 0.0f : f2, (i4 + 2) - (2 | i4) != 0 ? 4.0f : f3, (4 & i4) != 0 ? DefaultCap : i2, (-1) - (((-1) - i4) | ((-1) - 8)) != 0 ? DefaultJoin : i3, (i4 & 16) != 0 ? null : pathEffect, null);
    }

    /* JADX INFO: renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m4803getCapKaPHkGw() {
        return this.cap;
    }

    /* JADX INFO: renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m4804getJoinLxFBmk8() {
        return this.join;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    /* JADX INFO: compiled from: DrawScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?0LeV3ZS0\u000fqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug?ah\f[\u000f4\u0018ӇiߚרTwٕ\u0016\u0017:B}DKOu@GdEM\u0013&J\"f\u0001܇\u007fɝߋG\u000fͯ~KS\f 5Xr@Z\u001bQU& \u000fV /(3ɨ!ɇLleŽ\u007f/\u0011tZNUi\u0007Ů ϘJT/˙ǻa'3C=߰1SR\u000b\u0007Xzϓ\u0007K"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r)zA(\u001bh \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u0012dU.h3M1\u0015\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "5dc\u0011X-:c \u000eXZ7Dn+Pb.]R", "u(8", "\u0017", "\u0012dU.h3M8#\u0003\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "5dc\u0011X-:c \u000e_h0\u0006P\u0016x`\u0005\u0004FS", "\u0012dU.h3M;\u001d\u000ezk", "", "\u0016`X?_0GS\u000b\u0003ym/", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m4805getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* JADX INFO: renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m4806getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }
    }

    private Stroke(float f2, float f3, int i2, int i3, PathEffect pathEffect) {
        super(null);
        this.width = f2;
        this.miter = f3;
        this.cap = i2;
        this.join = i3;
        this.pathEffect = pathEffect;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.width == stroke.width && this.miter == stroke.miter && StrokeCap.m4527equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m4537equalsimpl0(this.join, stroke.join) && Intrinsics.areEqual(this.pathEffect, stroke.pathEffect);
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + StrokeCap.m4528hashCodeimpl(this.cap)) * 31) + StrokeJoin.m4538hashCodeimpl(this.join)) * 31;
        PathEffect pathEffect = this.pathEffect;
        return iHashCode + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m4529toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m4539toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }
}
