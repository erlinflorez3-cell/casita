package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
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
/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007toA0JrP.`\\2\u000fq{<$i*yّCU(\n*\tUNml\u0005Ϻx&s\u000f4\u00151iG\nv\tc\u0018\u000f@B\b?aN\u007fC?`\u00038\u001d `%H\u007f\u000b\u0001(.`\u0010%\u007fŲO\f 6\t\u001dHc%M3܅B\fD \u000f\u001etg|7xrc:=%\u001bipQWe6|[\u0011^TU\u0012ɱ`ӜҋD9;'3fK\u0018`oW\u0003m\u0007m\u000bv=?-_r\u00065\u001fó\u0014]1]$urTtKe)\u00125DgcyjT<H\u0015\n\u0011T\u0004<\u000b]L\u0005Ʈ\u001cǴ\f\u001a;ο\u0003UFW\u0010fZ\u0002\u0001jD!u\"A+Q\u001b\u0015R\u0018?oד9\u009e\u0004ټ\u038d\"\u007fͼ%i\\\u000en#+V}\\?YX?NZ\u0018f\u000e\u0010\u0012rz\u0002X\u0007fKV\u0083}ö-Ϗğ6Zޠ'/s\u0002VRwx\u000bov[\u0002TNP0{ݮ73\u0011\u000f`և\u00013jXT^KҳQ8"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "0kd?E(=W)\r", "", "uI9\u0013?2Hb \u0003\u0004(1\u000e\u0011xi\t7{M\n\u0013\u001e\u0011N\u000e=r5<h[*@{%;]AJuA\u0006\u0011ug9\u00149o?", "5dc\u000f_<K@\u0015}~n:;\u00058n\n7wO\u0005! U", "u(E", "5dc\u000f_<K@\u0015}~n:", "u(5", "5dc\u0010b3H``Iy0&b\u000e\u001f${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u0010b3H``Iy0&b\u000e\u001f", "u(9", "\u0018", "5dc\u001cY-LS(F[*\nLe!0>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u001cY-LS(F[*\nLe!0", "1n_F", "1n_F 8<PkMeF", "uI9\u0013\u001c\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001[\u0019*LMMA", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Shadow {
    public static final Companion Companion = new Companion(null);
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    public /* synthetic */ Shadow(long j2, long j3, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, f2);
    }

    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU$annotations */
    public static /* synthetic */ void m4500getColor0d7_KjU$annotations() {
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0$annotations */
    public static /* synthetic */ void m4501getOffsetF1C5BW0$annotations() {
    }

    private Shadow(long j2, long j3, float f2) {
        this.color = j2;
        this.offset = j3;
        this.blurRadius = f2;
    }

    public /* synthetic */ Shadow(long j2, long j3, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? ColorKt.Color(4278190080L) : j2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? Offset.Companion.m3953getZeroF1C5BW0() : j3, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? 0.0f : f2, null);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public final long m4503getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0 */
    public final long m4504getOffsetF1C5BW0() {
        return this.offset;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: compiled from: Shadow.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005>i%\nCiWP\u0002xޣQɁksvϺj\rI\u0012\u0014\u0016\u0011l2Mc}ٛ\u0016\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fT\fWKFg=\"\u001fq7", "", "u(E", "\u001cn]2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "5dc\u001bb5>\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u001bb5>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3l @#", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        private Companion() {
        }

        public final Shadow getNone() {
            return Shadow.None;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.m4179equalsimpl0(this.color, shadow.color) && Offset.m3934equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public int hashCode() {
        return (((Color.m4185hashCodeimpl(this.color) * 31) + Offset.m3939hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) Color.m4186toStringimpl(this.color)) + ", offset=" + ((Object) Offset.m3945toStringimpl(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    /* JADX INFO: renamed from: copy-qcb84PM$default */
    public static /* synthetic */ Shadow m4499copyqcb84PM$default(Shadow shadow, long j2, long j3, float f2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            j2 = shadow.color;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = shadow.offset;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            f2 = shadow.blurRadius;
        }
        return shadow.m4502copyqcb84PM(j2, j3, f2);
    }

    /* JADX INFO: renamed from: copy-qcb84PM */
    public final Shadow m4502copyqcb84PM(long j2, long j3, float f2) {
        return new Shadow(j2, j3, f2, null);
    }
}
