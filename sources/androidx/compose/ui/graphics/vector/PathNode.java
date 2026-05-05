package androidx.compose.ui.graphics.vector;

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
/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4V\u0007\"B\u0012\u007f\u0007|jA0ZeP.hS2\u000f\u0002{<$q$yCQU\"}8\tWN}gvJp\u000bK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172XoG3coE9vt>\u000562*8\u0010\u0005\t\u001a@H\u0018͌\u0001xaÈB0norc\u0012S\f\"\u001b\u0010I,\u000e,kw_H[\u0001rPFc\u001coD^-e0\u000bM%F\u0003(\u001d|g\u001e9BO5C&٨\u0007\u0007`^\u0010\u0012MqU\u0005\u0017(ݳ/O{ɎNZ\u0006\u0014#/ \u001ckt>\\3Rԃ\u0010-3Ւ{MV\u00106{߁z\u001eT\u001d(!CeLL:\b*1W\u001a\u0019zhy,\u07b2F+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "", "7r2Be=>", "", "7r@BT+", "uYIuI", "u(I", "\u000fqR!b", "\u0011k^@X", "\u0011taCX\u001bH", "\u0016na6m6Gb\u0015\u0006ih", "\u001ah]2G6", "\u001bne2G6", "\u001ftP1G6", " dU9X*MW*~Xn9\u000e\t\u001eo", " dU9X*MW*~fn({w9", " d[.g0OSt\fxM6", " d[.g0OSv\u000f\bo,k\u0013", " d[.g0OS{\t\bbA\u0007\u0012>a\u0007\u0017\u0006", " d[.g0OS\u007f\u0003\u0004^\u001b\u0007", " d[.g0OS\u0001\t\f^\u001b\u0007", " d[.g0OS\u0005\u000fv]\u001b\u0007", " d[.g0OS\u0006~{e,z\u00183v\u007f\u0006\fM\u0012\u0017\u0006Q", " d[.g0OS\u0006~{e,z\u00183v\u007f\u0014\f<\u007f\u0006!", " d[.g0OS\n~\bm0z\u00056T\n", "$daA\\*:Z\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'=F\u0005R6$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'?@\u0011q,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'?I\u0014t,=\u0001|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'DC\u0014gAX\u007f6CS=62", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'H=\u0010c\u001bXL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'IC\u0018c\u001bXL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'MI\u0003b\u001bXL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\bj,L\u0006+XL,<icr,\u001eg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\bj,L\u0006+XL:<XQaGi", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'#YL\u001bf(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'%\\[=\\A|\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'*V[0q\\{L\u0010\u0019I\u0018$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'.PW,K\\H", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'/V_,K\\H", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'3\\J+K\\H", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'4LO3\\P\u0002A%\u00128\u001e[<\rsc\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'4LO3\\P\u0002A%\u0012F\u001eJ*{\u000f/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'8L[;`PnD\u0003\u001c0", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'R9\u0014r0Lr.6V$", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class PathNode {
    private final boolean isCurve;
    private final boolean isQuad;

    public /* synthetic */ PathNode(boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3);
    }

    private PathNode(boolean z2, boolean z3) {
        this.isCurve = z2;
        this.isQuad = z3;
    }

    public /* synthetic */ PathNode(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? false : z3, null);
    }

    public final boolean isCurve() {
        return this.isCurve;
    }

    public final boolean isQuad() {
        return this.isQuad;
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004Gڒ0!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'?@\u0011q,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "u(E", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Close extends PathNode {
        public static final Close INSTANCE = new Close();

        /* JADX WARN: Illegal instructions before constructor call */
        private Close() {
            boolean z2 = false;
            super(z2, z2, 3, null);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000fzwrXZ#C=\u0007&|x.aU'^ܫ\u00132Pr\b:[vU9\u000fu|ԓ!z)F\u0002\u001d\u0001H+\u000fǼwC^Y\u0015*0n\u0081jX\u0013M\u0013\u001a*\u0006l!1$bg\\8`l\f;uޑ\u00022S\\1w0+X=Lb3%xw\u001dYM}¤\u0016mZ\u0011\u0015j[m\u0012\u0006ғ<Mo57CI\"h|ް~d$9O%]!'ػ\tWhϯ?-UgYU^7\u0006|\u0014\rj\u0005؝\n-P͓E\u001cl\u000e\u001c8Ϩve"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'/V_,K\\H", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "2w", "", "2x", "uE5uI", "5dc\u0011k", "u(5", "5dc\u0011l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RelativeMoveTo extends PathNode {
        private final float dx;
        private final float dy;

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f2, float f3, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                f2 = relativeMoveTo.dx;
            }
            if ((i2 & 2) != 0) {
                f3 = relativeMoveTo.dy;
            }
            return relativeMoveTo.copy(f2, f3);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeMoveTo copy(float f2, float f3) {
            return new RelativeMoveTo(f2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.dx, relativeMoveTo.dx) == 0 && Float.compare(this.dy, relativeMoveTo.dy) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeMoveTo(float f2, float f3) {
            boolean z2 = false;
            super(z2, z2, 3, null);
            this.dx = f2;
            this.dy = f3;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000fzwrXZ#C=\u0007&|x.aU'^ܫ\u00132Pr\b:[vU9\u000fu|ԓ!z)F\u0002\u001d\u0001H+\u000fǼwC^Y\u0015*0n\u0081jX\u0013M\u0013\u001a*\u0006l!1$bg\\8`l\f;uޑ\u00022S\\1w0+X=Lb3%xw\u001dYM}¤\u0016mZ\u0011\u0015j[m\u0012\u0006ғ<Mo57CI\"h|ް~d$9O%]!'ػ\tWhϯ?-UgYU^7\u0006|\u0014\rj\u0005؝\n-P͓E\u001cl\u000e\u001c8Ϩve"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'IC\u0018c\u001bXL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "F", "", "G", "uE5uI", "5dc%", "u(5", "5dc&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class MoveTo extends PathNode {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final float f116x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final float f117y;

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f2, float f3, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = moveTo.f116x;
            }
            if ((i2 & 2) != 0) {
                f3 = moveTo.f117y;
            }
            return moveTo.copy(f2, f3);
        }

        public final float component1() {
            return this.f116x;
        }

        public final float component2() {
            return this.f117y;
        }

        public final MoveTo copy(float f2, float f3) {
            return new MoveTo(f2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.f116x, moveTo.f116x) == 0 && Float.compare(this.f117y, moveTo.f117y) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f116x) * 31) + Float.hashCode(this.f117y);
        }

        public String toString() {
            return "MoveTo(x=" + this.f116x + ", y=" + this.f117y + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MoveTo(float f2, float f3) {
            boolean z2 = false;
            super(z2, z2, 3, null);
            this.f116x = f2;
            this.f117y = f3;
        }

        public final float getX() {
            return this.f116x;
        }

        public final float getY() {
            return this.f117y;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000fzwrXZ#C=\u0007&|x.aU'^ܫ\u00132Pr\b:[vU9\u000fu|ԓ!z)F\u0002\u001d\u0001H+\u000fǼwC^Y\u0015*0n\u0081jX\u0013M\u0013\u001a*\u0006l!1$bg\\8`l\f;uޑ\u00022S\\1w0+X=Lb3%xw\u001dYM}¤\u0016mZ\u0011\u0015j[m\u0012\u0006ғ<Mo57CI\"h|ް~d$9O%]!'ػ\tWhϯ?-UgYU^7\u0006|\u0014\rj\u0005؝\n-P͓E\u001cl\u000e\u001c8Ϩve"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'.PW,K\\H", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "2w", "", "2x", "uE5uI", "5dc\u0011k", "u(5", "5dc\u0011l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RelativeLineTo extends PathNode {
        private final float dx;
        private final float dy;

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f2, float f3, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = relativeLineTo.dx;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                f3 = relativeLineTo.dy;
            }
            return relativeLineTo.copy(f2, f3);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeLineTo copy(float f2, float f3) {
            return new RelativeLineTo(f2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.dx, relativeLineTo.dx) == 0 && Float.compare(this.dy, relativeLineTo.dy) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeLineTo(float f2, float f3) {
            boolean z2 = false;
            super(z2, z2, 3, null);
            this.dx = f2;
            this.dy = f3;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000fzwrXZ#C=\u0007&|x.aU'^ܫ\u00132Pr\b:[vU9\u000fu|ԓ!z)F\u0002\u001d\u0001H+\u000fǼwC^Y\u0015*0n\u0081jX\u0013M\u0013\u001a*\u0006l!1$bg\\8`l\f;uޑ\u00022S\\1w0+X=Lb3%xw\u001dYM}¤\u0016mZ\u0011\u0015j[m\u0012\u0006ғ<Mo57CI\"h|ް~d$9O%]!'ػ\tWhϯ?-UgYU^7\u0006|\u0014\rj\u0005؝\n-P͓E\u001cl\u000e\u001c8Ϩve"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'H=\u0010c\u001bXL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "F", "", "G", "uE5uI", "5dc%", "u(5", "5dc&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class LineTo extends PathNode {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final float f114x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final float f115y;

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f2, float f3, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = lineTo.f114x;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                f3 = lineTo.f115y;
            }
            return lineTo.copy(f2, f3);
        }

        public final float component1() {
            return this.f114x;
        }

        public final float component2() {
            return this.f115y;
        }

        public final LineTo copy(float f2, float f3) {
            return new LineTo(f2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.f114x, lineTo.f114x) == 0 && Float.compare(this.f115y, lineTo.f115y) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f114x) * 31) + Float.hashCode(this.f115y);
        }

        public String toString() {
            return "LineTo(x=" + this.f114x + ", y=" + this.f115y + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LineTo(float f2, float f3) {
            boolean z2 = false;
            super(z2, z2, 3, null);
            this.f114x = f2;
            this.f115y = f3;
        }

        public final float getX() {
            return this.f114x;
        }

        public final float getY() {
            return this.f115y;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000frwrXZ#C=\u0007Ȁ|j:K\u001e\u007fk\u0017'2pp\u0006ޓN8NGf\r63ړb(>y\u0013\u00012*v\u0011=ڠB\u0014\u001d 7XphZ=S\u0013#*\bT\u001f/(#ʸO~OzhR/Q\u000f0ƀMof>\ne\rtbm̰u2-9@O5C&٨\u0007\rZ¹W\u0005EtK\tػ+6"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'*V[0q\\{L\u0010\u0019I\u0018$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "2w", "", "uE\u0018#", "5dc\u0011k", "u(5", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RelativeHorizontalTo extends PathNode {
        private final float dx;

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f2, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                f2 = relativeHorizontalTo.dx;
            }
            return relativeHorizontalTo.copy(f2);
        }

        public final float component1() {
            return this.dx;
        }

        public final RelativeHorizontalTo copy(float f2) {
            return new RelativeHorizontalTo(f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.dx, ((RelativeHorizontalTo) obj).dx) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.dx);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.dx + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeHorizontalTo(float f2) {
            boolean z2 = false;
            super(z2, z2, 3, null);
            this.dx = f2;
        }

        public final float getDx() {
            return this.dx;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000frwrXZ#C=\u0007Ȁ|j:K\u001e\u007fk\u0017'2pp\u0006ޓN8NGf\r63ړb(>y\u0013\u00012*v\u0011=ڠB\u0014\u001d 7XphZ=S\u0013#*\bT\u001f/(#ʸO~OzhR/Q\u000f0ƀMof>\ne\rtbm̰u2-9@O5C&٨\u0007\rZ¹W\u0005EtK\tػ+6"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'DC\u0014gAX\u007f6CS=62", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "F", "", "uE\u0018#", "5dc%", "u(5", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class HorizontalTo extends PathNode {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final float f113x;

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = horizontalTo.f113x;
            }
            return horizontalTo.copy(f2);
        }

        public final float component1() {
            return this.f113x;
        }

        public final HorizontalTo copy(float f2) {
            return new HorizontalTo(f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f113x, ((HorizontalTo) obj).f113x) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f113x);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f113x + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public HorizontalTo(float f2) {
            boolean z2 = false;
            super(z2, z2, 3, null);
            this.f113x = f2;
        }

        public final float getX() {
            return this.f113x;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000frwrXZ#C=\u0007Ȁ|j:K\u001e\u007fk\u0017'2pp\u0006ޓN8NGf\r63ړb(>y\u0013\u00012*v\u0011=ڠB\u0014\u001d 7XphZ=S\u0013#*\bT\u001f/(#ʸO~OzhR/Q\u000f0ƀMof>\ne\rtbm̰u2-9@O5C&٨\u0007\rZ¹W\u0005EtK\tػ+6"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'8L[;`PnD\u0003\u001c0", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "2x", "", "uE\u0018#", "5dc\u0011l", "u(5", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RelativeVerticalTo extends PathNode {
        private final float dy;

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = relativeVerticalTo.dy;
            }
            return relativeVerticalTo.copy(f2);
        }

        public final float component1() {
            return this.dy;
        }

        public final RelativeVerticalTo copy(float f2) {
            return new RelativeVerticalTo(f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.dy, ((RelativeVerticalTo) obj).dy) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.dy);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.dy + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeVerticalTo(float f2) {
            boolean z2 = false;
            super(z2, z2, 3, null);
            this.dy = f2;
        }

        public final float getDy() {
            return this.dy;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4F\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000frwrXZ#C=\u0007Ȁ|j:K\u001e\u007fk\u0017'2pp\u0006ޓN8NGf\r63ړb(>y\u0013\u00012*v\u0011=ڠB\u0014\u001d 7XphZ=S\u0013#*\bT\u001f/(#ʸO~OzhR/Q\u000f0ƀMof>\ne\rtbm̰u2-9@O5C&٨\u0007\rZ¹W\u0005EtK\tػ+6"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'R9\u0014r0Lr.6V$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "G", "", "uE\u0018#", "5dc&", "u(5", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class VerticalTo extends PathNode {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final float f120y;

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = verticalTo.f120y;
            }
            return verticalTo.copy(f2);
        }

        public final float component1() {
            return this.f120y;
        }

        public final VerticalTo copy(float f2) {
            return new VerticalTo(f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f120y, ((VerticalTo) obj).f120y) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f120y);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f120y + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public VerticalTo(float f2) {
            boolean z2 = false;
            super(z2, z2, 3, null);
            this.f120y = f2;
        }

        public final float getY() {
            return this.f120y;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4U\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000f\u001bwrXZ#C=\u0007&|x.aU'^\"\u0013@E\b?aN\u007fAGd\r63!B&F~\u001d\u0001H+X\u0014\u0005\u0001[K:\u0013ضDpHYUT\u0013)*\u0006l!Gɭ]0UDX\u0005]h0iʌj\u000bU5pH|{\u000e\rĝ(U}o0C@e6[ȳTK\u000e`nW\u0003mr\u0004ޢio.9]\fWdYFг\u0016s\u0013\u001br\u000b&\u000bӤ\u0002f\u0012'9O{K~\u000fX}\u0001{\u001b>\u001c\u000e4(x43\u001at\u000b&3#s\u0004FV\u0002lF\u0018z\u00107G+\u000639>3f\u007fbk\u001fT7\n\u000b%\u001eQ\u00025ŖZ\u001d\u001fn+3T&haWNU`P Xk\u0007JΦcJ1\u0012J_\u007f]\u0017Wқ\u0016m>iU;!\u001a\u001f\u000f؊fG\u0014nhki\u0001Iغ&t\u001eճB\u000b\u0012bRmUz^Wp,?NɟX\r\u0006ܱ+\"b\u0002J*u\u001f\\T\u0001i\u0019Nύ\u000e+7ωO[tv\u001c`\nmA7ic>b؏z\u001aGֺz\u0007^rP\\\\ij,:2vkݻ{\u0002L\u0088$\u00158L\u007f%\u0005;?\u001ft\u0015v\u0004ٿFG\u0005ȁw\\n\u001e\r]օ(!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'%\\[=\\A|\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "2w ", "", "2x ", "2w!", "2x!", "2w\"", "2x\"", "uE5\u00139\r\u001f\u0017\n", "5dc\u0011kw", "u(5", "5dc\u0011kx", "5dc\u0011ky", "5dc\u0011lw", "5dc\u0011lx", "5dc\u0011ly", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RelativeCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f2, float f3, float f4, float f5, float f6, float f7, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = relativeCurveTo.dx1;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                f3 = relativeCurveTo.dy1;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                f4 = relativeCurveTo.dx2;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                f5 = relativeCurveTo.dy2;
            }
            if ((16 & i2) != 0) {
                f6 = relativeCurveTo.dx3;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
                f7 = relativeCurveTo.dy3;
            }
            return relativeCurveTo.copy(f2, f3, f4, f5, f6, f7);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final float component5() {
            return this.dx3;
        }

        public final float component6() {
            return this.dy3;
        }

        public final RelativeCurveTo copy(float f2, float f3, float f4, float f5, float f6, float f7) {
            return new RelativeCurveTo(f2, f3, f4, f5, f6, f7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && Float.compare(this.dy3, relativeCurveTo.dy3) == 0;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2)) * 31) + Float.hashCode(this.dx3)) * 31) + Float.hashCode(this.dy3);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public RelativeCurveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
            super(true, false, 2, null);
            this.dx1 = f2;
            this.dy1 = f3;
            this.dx2 = f4;
            this.dy2 = f5;
            this.dx3 = f6;
            this.dy3 = f7;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4U\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000f\u001bwrXZ#C=\u0007&|x.aU'^\"\u0013@E\b?aN\u007fAGd\r63!B&F~\u001d\u0001H+X\u0014\u0005\u0001[K:\u0013ضDpHYUT\u0013)*\u0006l!Gɭ]0UDX\u0005]h0iʌj\u000bU5pH|{\u000e\rĝ(U}o0C@e6[ȳTK\u000e`nW\u0003mr\u0004ޢio.9]\fWdYFг\u0016s\u0013\u001br\u000b&\u000bӤ\u0002f\u0012'9O{K~\u000fX}\u0001{\u001b>\u001c\u000e4(x43\u001at\u000b&3#s\u0004FV\u0002lF\u0018z\u00107G+\u000639>3f\u007fbk\u001fT7\n\u000b%\u001eQ\u00025ŖZ\u001d\u001fn+3T&haWNU`P Xk\u0007JΦcJ1\u0012J_\u007f]\u0017Wқ\u0016m>iU;!\u001a\u001f\u000f؊fG\u0014nhki\u0001Iغ&t\u001eճB\u000b\u0012bRmUz^Wp,?NɟX\r\u0006ܱ+\"b\u0002J*u\u001f\\T\u0001i\u0019Nύ\u000e+7ωO[tv\u001c`\nmA7ic>b؏z\u001aGֺz\u0007^rP\\\\ij,:2vkݻ{\u0002L\u0088$\u00158L\u007f%\u0005;?\u001ft\u0015v\u0004ٿFG\u0005ȁw\\n\u001e\r]օ(!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'?I\u0014t,=\u0001|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "F0", "", "G0", "F1", "G1", "F2", "G2", "uE5\u00139\r\u001f\u0017\n", "5dc%$", "u(5", "5dc%%", "5dc%&", "5dc&$", "5dc&%", "5dc&&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class CurveTo extends PathNode {
        private final float x1;
        private final float x2;
        private final float x3;
        private final float y1;
        private final float y2;
        private final float y3;

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f2, float f3, float f4, float f5, float f6, float f7, int i2, Object obj) {
            if ((1 & i2) != 0) {
                f2 = curveTo.x1;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                f3 = curveTo.y1;
            }
            if ((4 & i2) != 0) {
                f4 = curveTo.x2;
            }
            if ((i2 + 8) - (8 | i2) != 0) {
                f5 = curveTo.y2;
            }
            if ((i2 + 16) - (16 | i2) != 0) {
                f6 = curveTo.x3;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
                f7 = curveTo.y3;
            }
            return curveTo.copy(f2, f3, f4, f5, f6, f7);
        }

        public final float component1() {
            return this.x1;
        }

        public final float component2() {
            return this.y1;
        }

        public final float component3() {
            return this.x2;
        }

        public final float component4() {
            return this.y2;
        }

        public final float component5() {
            return this.x3;
        }

        public final float component6() {
            return this.y3;
        }

        public final CurveTo copy(float f2, float f3, float f4, float f5, float f6, float f7) {
            return new CurveTo(f2, f3, f4, f5, f6, f7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.x1, curveTo.x1) == 0 && Float.compare(this.y1, curveTo.y1) == 0 && Float.compare(this.x2, curveTo.x2) == 0 && Float.compare(this.y2, curveTo.y2) == 0 && Float.compare(this.x3, curveTo.x3) == 0 && Float.compare(this.y3, curveTo.y3) == 0;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.x1) * 31) + Float.hashCode(this.y1)) * 31) + Float.hashCode(this.x2)) * 31) + Float.hashCode(this.y2)) * 31) + Float.hashCode(this.x3)) * 31) + Float.hashCode(this.y3);
        }

        public String toString() {
            return "CurveTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", x3=" + this.x3 + ", y3=" + this.y3 + ')';
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY2() {
            return this.y2;
        }

        public final float getX3() {
            return this.x3;
        }

        public final float getY3() {
            return this.y3;
        }

        public CurveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
            super(true, false, 2, null);
            this.x1 = f2;
            this.y1 = f3;
            this.x2 = f4;
            this.y2 = f5;
            this.x3 = f6;
            this.y3 = f7;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4O\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000f\u000bwrXZ#C=\u0007&|x.aU'^\"\u0013@E\b?aN\u007fAGd\r63!ݨ&8\b\nI!8S(v)D\u0012ď\u0013xG~Fj\r{\u0006`Ǝ\u0007\u0007'\u000f+tg|7\u000fȔ^\u000361\u0011\u0002B|(&ݥ}\u0016<Tc?\r%ѭN1F7C\u0015=S1\b\u0003aE\u0003MsU\u0005\u0017(W1Ose9p\u007fB\u0016[U\u0013]\u0001*t\u0005\u007faR˳*\u0018tY`&(&\f,\u0013J\u0016&\b=G\\@`Ȩ\tV:\u0003\u0007k@~\u0017%ܤ~ChD-=\u007faB\u007fԬe\"pI\u0019f7*\u0006ڟ\")\t͙9]Z\u0014n\u001ckc\u0006TIQn>˓R\u0010aƝ\u0006\u0006vj\u00101T?U\u0002G{?/ϲ)=cݽ;#q\u000bVK8\u0006\u0013d\u0001S\u0018S͕D(vݫO,\u000f\u0016hK\u0087\t\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'4LO3\\P\u0002A%\u00128\u001e[<\rsc\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "2w ", "", "2x ", "2w!", "2x!", "uE5\u00139o/", "5dc\u0011kw", "u(5", "5dc\u0011kx", "5dc\u0011lw", "5dc\u0011lx", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RelativeReflectiveCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f2, float f3, float f4, float f5, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = relativeReflectiveCurveTo.dx1;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                f3 = relativeReflectiveCurveTo.dy1;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                f4 = relativeReflectiveCurveTo.dx2;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                f5 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f2, f3, f4, f5);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeReflectiveCurveTo copy(float f2, float f3, float f4, float f5) {
            return new RelativeReflectiveCurveTo(f2, f3, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public RelativeReflectiveCurveTo(float f2, float f3, float f4, float f5) {
            super(true, false, 2, null);
            this.dx1 = f2;
            this.dy1 = f3;
            this.dx2 = f4;
            this.dy2 = f5;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4O\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000f\u000bwrXZ#C=\u0007&|x.aU'^\"\u0013@E\b?aN\u007fAGd\r63!ݨ&8\b\nI!8S(v)D\u0012ď\u0013xG~Fj\r{\u0006`Ǝ\u0007\u0007'\u000f+tg|7\u000fȔ^\u000361\u0011\u0002B|(&ݥ}\u0016<Tc?\r%ѭN1F7C\u0015=S1\b\u0003aE\u0003MsU\u0005\u0017(W1Ose9p\u007fB\u0016[U\u0013]\u0001*t\u0005\u007faR˳*\u0018tY`&(&\f,\u0013J\u0016&\b=G\\@`Ȩ\tV:\u0003\u0007k@~\u0017%ܤ~ChD-=\u007faB\u007fԬe\"pI\u0019f7*\u0006ڟ\")\t͙9]Z\u0014n\u001ckc\u0006TIQn>˓R\u0010aƝ\u0006\u0006vj\u00101T?U\u0002G{?/ϲ)=cݽ;#q\u000bVK8\u0006\u0013d\u0001S\u0018S͕D(vݫO,\u000f\u0016hK\u0087\t\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\bj,L\u0006+XL,<icr,\u001eg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "F0", "", "G0", "F1", "G1", "uE5\u00139o/", "5dc%$", "u(5", "5dc%%", "5dc&$", "5dc&%", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ReflectiveCurveTo extends PathNode {
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f2, float f3, float f4, float f5, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = reflectiveCurveTo.x1;
            }
            if ((2 & i2) != 0) {
                f3 = reflectiveCurveTo.y1;
            }
            if ((i2 + 4) - (4 | i2) != 0) {
                f4 = reflectiveCurveTo.x2;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                f5 = reflectiveCurveTo.y2;
            }
            return reflectiveCurveTo.copy(f2, f3, f4, f5);
        }

        public final float component1() {
            return this.x1;
        }

        public final float component2() {
            return this.y1;
        }

        public final float component3() {
            return this.x2;
        }

        public final float component4() {
            return this.y2;
        }

        public final ReflectiveCurveTo copy(float f2, float f3, float f4, float f5) {
            return new ReflectiveCurveTo(f2, f3, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.x1, reflectiveCurveTo.x1) == 0 && Float.compare(this.y1, reflectiveCurveTo.y1) == 0 && Float.compare(this.x2, reflectiveCurveTo.x2) == 0 && Float.compare(this.y2, reflectiveCurveTo.y2) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.x1) * 31) + Float.hashCode(this.y1)) * 31) + Float.hashCode(this.x2)) * 31) + Float.hashCode(this.y2);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY2() {
            return this.y2;
        }

        public ReflectiveCurveTo(float f2, float f3, float f4, float f5) {
            super(true, false, 2, null);
            this.x1 = f2;
            this.y1 = f3;
            this.x2 = f4;
            this.y2 = f5;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4O\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000f\u000bwrXZ#C=\u0007&|x.aU'^\"\u0013@E\b?aN\u007fAGd\r63!ݨ&8\b\nI!8S(v)D\u0012ď\u0013xG~Fj\r{\u0006`Ǝ\u0007\u0007'\u000f+tg|7\u000fȔ^\u000361\u0011\u0002B|(&ݥ}\u0016<Tc?\r%ѭN1F7C\u0015=S1\b\u0003aE\u0003MsU\u0005\u0017(W1Ose9p\u007fB\u0016[U\u0013]\u0001*t\u0005\u007faR˳*\u0018tY`&(&\f,\u0013J\u0016&\b=G\\@`Ȩ\tV:\u0003\u0007k@~\u0017%ܤ~ChD-=\u007faB\u007fԬe\"pI\u0019f7*\u0006ڟ\")\t͙9]Z\u0014n\u001ckc\u0006TIQn>˓R\u0010aƝ\u0006\u0006vj\u00101T?U\u0002G{?/ϲ)=cݽ;#q\u000bVK8\u0006\u0013d\u0001S\u0018S͕D(vݫO,\u000f\u0016hK\u0087\t\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'3\\J+K\\H", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "2w ", "", "2x ", "2w!", "2x!", "uE5\u00139o/", "5dc\u0011kw", "u(5", "5dc\u0011kx", "5dc\u0011lw", "5dc\u0011lx", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RelativeQuadTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f2, float f3, float f4, float f5, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                f2 = relativeQuadTo.dx1;
            }
            if ((2 & i2) != 0) {
                f3 = relativeQuadTo.dy1;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                f4 = relativeQuadTo.dx2;
            }
            if ((i2 & 8) != 0) {
                f5 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f2, f3, f4, f5);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeQuadTo copy(float f2, float f3, float f4, float f5) {
            return new RelativeQuadTo(f2, f3, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && Float.compare(this.dy2, relativeQuadTo.dy2) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public RelativeQuadTo(float f2, float f3, float f4, float f5) {
            super(false, true, true ? 1 : 0, null);
            this.dx1 = f2;
            this.dy1 = f3;
            this.dx2 = f4;
            this.dy2 = f5;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4O\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000f\u000bwrXZ#C=\u0007&|x.aU'^\"\u0013@E\b?aN\u007fAGd\r63!ݨ&8\b\nI!8S(v)D\u0012ď\u0013xG~Fj\r{\u0006`Ǝ\u0007\u0007'\u000f+tg|7\u000fȔ^\u000361\u0011\u0002B|(&ݥ}\u0016<Tc?\r%ѭN1F7C\u0015=S1\b\u0003aE\u0003MsU\u0005\u0017(W1Ose9p\u007fB\u0016[U\u0013]\u0001*t\u0005\u007faR˳*\u0018tY`&(&\f,\u0013J\u0016&\b=G\\@`Ȩ\tV:\u0003\u0007k@~\u0017%ܤ~ChD-=\u007faB\u007fԬe\"pI\u0019f7*\u0006ڟ\")\t͙9]Z\u0014n\u001ckc\u0006TIQn>˓R\u0010aƝ\u0006\u0006vj\u00101T?U\u0002G{?/ϲ)=cݽ;#q\u000bVK8\u0006\u0013d\u0001S\u0018S͕D(vݫO,\u000f\u0016hK\u0087\t\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'MI\u0003b\u001bXL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "F0", "", "G0", "F1", "G1", "uE5\u00139o/", "5dc%$", "u(5", "5dc%%", "5dc&$", "5dc&%", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class QuadTo extends PathNode {
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f2, float f3, float f4, float f5, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                f2 = quadTo.x1;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                f3 = quadTo.y1;
            }
            if ((i2 + 4) - (4 | i2) != 0) {
                f4 = quadTo.x2;
            }
            if ((i2 & 8) != 0) {
                f5 = quadTo.y2;
            }
            return quadTo.copy(f2, f3, f4, f5);
        }

        public final float component1() {
            return this.x1;
        }

        public final float component2() {
            return this.y1;
        }

        public final float component3() {
            return this.x2;
        }

        public final float component4() {
            return this.y2;
        }

        public final QuadTo copy(float f2, float f3, float f4, float f5) {
            return new QuadTo(f2, f3, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.x1, quadTo.x1) == 0 && Float.compare(this.y1, quadTo.y1) == 0 && Float.compare(this.x2, quadTo.x2) == 0 && Float.compare(this.y2, quadTo.y2) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.x1) * 31) + Float.hashCode(this.y1)) * 31) + Float.hashCode(this.x2)) * 31) + Float.hashCode(this.y2);
        }

        public String toString() {
            return "QuadTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY2() {
            return this.y2;
        }

        public QuadTo(float f2, float f3, float f4, float f5) {
            super(false, true, true ? 1 : 0, null);
            this.x1 = f2;
            this.y1 = f3;
            this.x2 = f4;
            this.y2 = f5;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000fzwrXZ#C=\u0007&|x.aU'^ܫ\u00132Pr\b:[vU9\u000fu|ԓ!z)F\u0002\u001d\u0001H+\u000fǼwC^Y\u0015*0n\u0081jX\u0013M\u0013\u001a*\u0006l!1$bg\\8`l\f;uޑ\u00022S\\1w0+X=Lb3%xw\u001dYM}¤\u0016mZ\u0011\u0015j[m\u0012\u0006ғ<Mo57CI\"h|ް~d$9O%]!'ػ\tWhϯ?-UgYU^7\u0006|\u0014\rj\u0005؝\n-P͓E\u001cl\u000e\u001c8Ϩve"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'4LO3\\P\u0002A%\u0012F\u001eJ*{\u000f/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "2w", "", "2x", "uE5uI", "5dc\u0011k", "u(5", "5dc\u0011l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RelativeReflectiveQuadTo extends PathNode {
        private final float dx;
        private final float dy;

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f2, float f3, int i2, Object obj) {
            if ((1 & i2) != 0) {
                f2 = relativeReflectiveQuadTo.dx;
            }
            if ((i2 & 2) != 0) {
                f3 = relativeReflectiveQuadTo.dy;
            }
            return relativeReflectiveQuadTo.copy(f2, f3);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeReflectiveQuadTo copy(float f2, float f3) {
            return new RelativeReflectiveQuadTo(f2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.dx, relativeReflectiveQuadTo.dx) == 0 && Float.compare(this.dy, relativeReflectiveQuadTo.dy) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public RelativeReflectiveQuadTo(float f2, float f3) {
            super(false, true, true ? 1 : 0, null);
            this.dx = f2;
            this.dy = f3;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4I\u0007\":\u001b\u007fјnjGӄL͜P.`Y2şs{B0cҕwٙAkڼ.\"7N\u000fzwrXZ#C=\u0007&|x.aU'^ܫ\u00132Pr\b:[vU9\u000fu|ԓ!z)F\u0002\u001d\u0001H+\u000fǼwC^Y\u0015*0n\u0081jX\u0013M\u0013\u001a*\u0006l!1$bg\\8`l\f;uޑ\u00022S\\1w0+X=Lb3%xw\u001dYM}¤\u0016mZ\u0011\u0015j[m\u0012\u0006ғ<Mo57CI\"h|ް~d$9O%]!'ػ\tWhϯ?-UgYU^7\u0006|\u0014\rj\u0005؝\n-P͓E\u001cl\u000e\u001c8Ϩve"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\bj,L\u0006+XL:<XQaGi", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "F", "", "G", "uE5uI", "5dc%", "u(5", "5dc&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ReflectiveQuadTo extends PathNode {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final float f118x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final float f119y;

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f2, float f3, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = reflectiveQuadTo.f118x;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                f3 = reflectiveQuadTo.f119y;
            }
            return reflectiveQuadTo.copy(f2, f3);
        }

        public final float component1() {
            return this.f118x;
        }

        public final float component2() {
            return this.f119y;
        }

        public final ReflectiveQuadTo copy(float f2, float f3) {
            return new ReflectiveQuadTo(f2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.f118x, reflectiveQuadTo.f118x) == 0 && Float.compare(this.f119y, reflectiveQuadTo.f119y) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f118x) * 31) + Float.hashCode(this.f119y);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f118x + ", y=" + this.f119y + ')';
        }

        public final float getX() {
            return this.f118x;
        }

        public final float getY() {
            return this.f119y;
        }

        public ReflectiveQuadTo(float f2, float f3) {
            super(false, true, true ? 1 : 0, null);
            this.f118x = f2;
            this.f119y = f3;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4C\u0007\":\u001b\u007f\u0007l}A0R͜P\u008cZS8\u0015sڔ<$i0yّA٭ \u0014̝9O|f(*Z^\u0019C'\u0006Dyz0WW\u0011]@\u0010BF}BKM\u001e>Id\u0003:\u001d `'H}\u0013\u00072*v\u0015\u0007~QR$\u0012^A\u0001>`\u0015e\u0005H\u0013ĂB \u000f'%n\\G`l\f;uޑ\u00042I\\9w0+NSцUo\u0014\u0005t6+n8{֝&\u001c\n\u0015fs?1D8ݼ\u00061.5@as\u0006;\u001fģ\u0015]2]#urT]KŰaT.9f{K~\u000fnĂ{DZJ\u001c&\u0006UΞ^3 f\u0016\u000eKt!TpV\b^P\u0002\u0013ad\u0018U\u00069+G\u001e~Q\u0010<IT={\u0013\u00116#/sQaZ\u000en\u001b3T&VaWF=VU\"Ykn4vh\u00028\fHG.0BÄ-_6EtQ#Op2NR\u0002\u000f\u0007vg\u0002\u0005\u0019ΉAju$SB\t:w\u000bµ\u00044WbvD\u0011{;\u001bό|X\".c\u0010<O&ŎRUpȉ\u0003Oc\u00143:7Fgv\u0004\u000e\u0006:ӷ7;Yү(cX\u0003\"J\rq\u0013X~B\u0002\rȺ`.*õ`l\u0016\u0005\nO\u001f\u001b!6WqJ9Ϝ5\u001fdé`\u0005$FO\u000bYnhn(~\u00038ʗ\u0007o,ڏ!\u0003Vb~}8\bW/\u0015`P.ۮU;!ğm$nC\u000b.W\u000e\u0002\u0002_gzHƥp\u001c}ɝ\u0014\"\u001c*G\\ȦA3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'N9\u000e_;R\b'#YL\u001bf(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "6na6m6Gb\u0015\u0006Ze3\u0001\u0014=el$zD\u0011%", "", "DdaA\\*:Zx\u0006\u0002b7\u000b\t\u001ca~,\fN", "BgTAT", "7r<<e,-V\u0015\b]Z3}", "", "7r?<f0MW*~Vk*", "/qR g(Kbw\u0012", "/qR g(Kbw\u0013", "uE5\u0013M!\u001f4\\o", "5dc\u000ee*,b\u0015\f\n=?", "u(5", "5dc\u000ee*,b\u0015\f\n=@", "5dc\u0015b9Bh#\b\nZ3\\\u00106i\u000b6{-|\u0016\u001bW}", "u(I", "5dc![,MO", "5dc#X9MW\u0017z\u0002>3\u0004\r:s\u007f\u0015w?\u0005'%", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RelativeArcTo extends PathNode {
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                f2 = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                f3 = relativeArcTo.verticalEllipseRadius;
            }
            if ((4 & i2) != 0) {
                f4 = relativeArcTo.theta;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                z2 = relativeArcTo.isMoreThanHalf;
            }
            if ((16 & i2) != 0) {
                z3 = relativeArcTo.isPositiveArc;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
                f5 = relativeArcTo.arcStartDx;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
                f6 = relativeArcTo.arcStartDy;
            }
            return relativeArcTo.copy(f2, f3, f4, z2, z3, f5, f6);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartDx;
        }

        public final float component7() {
            return this.arcStartDy;
        }

        public final RelativeArcTo copy(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
            return new RelativeArcTo(f2, f3, f4, z2, z3, f5, f6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartDx)) * 31) + Float.hashCode(this.arcStartDy);
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeArcTo(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
            boolean z4 = false;
            super(z4, z4, 3, null);
            this.horizontalEllipseRadius = f2;
            this.verticalEllipseRadius = f3;
            this.theta = f4;
            this.isMoreThanHalf = z2;
            this.isPositiveArc = z3;
            this.arcStartDx = f5;
            this.arcStartDy = f6;
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4C\u0007\":\u001b\u007f\u0007l}A0R͜P\u008cZS8\u0015sڔ<$i0yّA٭ \u0014̝9O|f(*Z^\u0019C'\u0006Dyz0WW\u0011]@\u0010BF}BKM\u001e>Id\u0003:\u001d `'H}\u0013\u00072*v\u0015\u0007~QR$\u0012^A\u0001>`\u0015e\u0005H\u0013ĂB \u000f'%n\\G`l\f;uޑ\u00042I\\9w0+NSцUo\u0014\u0005t6+n8{֝&\u001c\n\u0015fs?1D8ݼ\u00061.5@as\u0006;\u001fģ\u0015]2]#urT]KŰaT.9f{K~\u000fnĂ{DZJ\u001c&\u0006UΞ^3 f\u0016\u000eKt!TpV\b^P\u0002\u0013ad\u0018U\u00069+G\u001e~Q\u0010<IT={\u0013\u00116#/sQaZ\u000en\u001b3T&VaWF=VU\"Ykn4vh\u00028\fHG.0BÄ-_6EtQ#Op2NR\u0002\u000f\u0007vg\u0002\u0005\u0019ΉAju$SB\t:w\u000bµ\u00044WbvD\u0011{;\u001bό|X\".c\u0010<O&ŎRUpȉ\u0003Oc\u00143:7Fgv\u0004\u000e\u0006:ӷ7;Yү(cX\u0003\"J\rq\u0013X~B\u0002\rȺ`.*õ`l\u0016\u0005\nO\u001f\u001b!6WqJ9Ϝ5\u001fdé`\u0005$FO\u000bYnhn(~\u00038ʗ\u0007o,ڏ!\u0003Vb~}8\bW/\u0015`P.ۮU;!ğm$nC\u000b.W\u000e\u0002\u0002_gzHƥp\u001c}ɝ\u0014\"\u001c*G\\ȦA3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015'=F\u0005R6$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "6na6m6Gb\u0015\u0006Ze3\u0001\u0014=el$zD\u0011%", "", "DdaA\\*:Zx\u0006\u0002b7\u000b\t\u001ca~,\fN", "BgTAT", "7r<<e,-V\u0015\b]Z3}", "", "7r?<f0MW*~Vk*", "/qR g(Kb\f", "/qR g(Kb\r", "uE5\u0013M!\u001f4\\o", "5dc\u000ee*,b\u0015\f\nQ", "u(5", "5dc\u000ee*,b\u0015\f\nR", "5dc\u0015b9Bh#\b\nZ3\\\u00106i\u000b6{-|\u0016\u001bW}", "u(I", "5dc![,MO", "5dc#X9MW\u0017z\u0002>3\u0004\r:s\u007f\u0015w?\u0005'%", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ArcTo extends PathNode {
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                f2 = arcTo.horizontalEllipseRadius;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                f3 = arcTo.verticalEllipseRadius;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                f4 = arcTo.theta;
            }
            if ((8 & i2) != 0) {
                z2 = arcTo.isMoreThanHalf;
            }
            if ((i2 + 16) - (16 | i2) != 0) {
                z3 = arcTo.isPositiveArc;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
                f5 = arcTo.arcStartX;
            }
            if ((i2 + 64) - (i2 | 64) != 0) {
                f6 = arcTo.arcStartY;
            }
            return arcTo.copy(f2, f3, f4, z2, z3, f5, f6);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartX;
        }

        public final float component7() {
            return this.arcStartY;
        }

        public final ArcTo copy(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
            return new ArcTo(f2, f3, f4, z2, z3, f5, f6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && Float.compare(this.arcStartY, arcTo.arcStartY) == 0;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartX)) * 31) + Float.hashCode(this.arcStartY);
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ArcTo(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
            boolean z4 = false;
            super(z4, z4, 3, null);
            this.horizontalEllipseRadius = f2;
            this.verticalEllipseRadius = f3;
            this.theta = f4;
            this.isMoreThanHalf = z2;
            this.isPositiveArc = z3;
            this.arcStartX = f5;
            this.arcStartY = f6;
        }
    }
}
