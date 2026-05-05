package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4D\u0007\"B\u0012\u007f\u0007l\nA0RnP\u008cZS@\u000fs{:*c$\u007fICU \u0003*\t]ZogtJ`ŗI%إ45\u001b,wT1\\NO}RsM3eok:pxD\u000782P9\n\t\u000f\u001dBH>w\u000bGY\u0010*0nqJX\u0013M\u0013\u001f*\u0006l&\u0011$bg\\=`l\f@?)\tiPV?_^\u0003]\u0013LT5\u0016\u000faL1Ë;5#/\u001c\n\u0015ms?1@8ݼ\u00061.5Gas\u00067\u001fģ\u0015]2]*urT]KŰaT.9m{K~\u000fnĂ{D!J#&\u0006UNtǭ\u001bɊ\u0007\r\u008fsɁՂDR\b~P\u000fCuD8=\u007fa1\u007fԜgј`:уMљ߉\t\u000f$E\u000f}iob1x\u0015IZ>ϊ2Ӿ?<̩MˣՒAo\n\u0015p\u0011r\u0018>l\u0018/*\u0017tЖ&ܔZ8ٳ ǽɘLFm\u001d\u0013o1lwy`@P\u0017F;82$Zr\u000fKߟPղW\u008cҭQ\u001eZ2\f4[\u0002j%T!Sī~UnixMu\nS0\u0017=_ny\u0010o9\r4eWi\u0010oU\u000f\u0014m=\u0013\u000b^fPW$Z\u000b)R8Nj\u001e|\u0014D|\u0012C8Eq*;D1GbEN\t\u001ePI\u0015\t\u000e`\u0019\u0016\u0005TA-\u001biRzOʝO̍oבς|K2+nQuR_e1&\u0004J\u0019:\u000bT\u001f\u0001\n~uf\u0013ݘM5\u001d\u0004\b\u0014 DM\u007f\u05ee.\u00069\u001d3A20.uP\u0001\u001biM@(+\u0001\bESh\\h8n~cxjxP\u0005\u001b0/vrQ\t+\u007fBgT4_c\u0003ެ\">\u0012x\u0011\u0014TNf8K3n3\u000fz:~K,qگsȹ\u0004ӄ3\u0015iӠ:~<}z\u000fTuФ\b2kܞ\bdWi@H\t`g\bV\"RrŐAוݬv\u0007ɚ\r<\u00153VQ|r\\F[\u001a\u007f\u0015t\u000fD\r\u001f\\ޣ9ܤ\u0383|3ˀc2{C\f$vE+\"[b8|{]t\u000bx\u0010@O֭5r*\u001eC3dd3\u0018>\u0006\f\u0018dBވf\u000bDɿ<62P\u0016\u0018\u0014cw\t(z.Gݍ\u0013\u001d:߿\f=\\#b\u0006-eV\u0007xE\u000f\"Ǆ\u0005\u0005\u0017ɼ6z;G\u0013z\u0017k=hJ\u0001\u0002#θ\u001a˂̣}eު/L\\9)8p\u0003\u0011\\kR\u001a\u0019D\u000b_)\u001cqȊ\u000bՄć{\u001cÐ\u001c#AQ\u001fo\u000f2d#cs\u001fs\u0005+~R|#_CҶ\u0001\u0012T\f\u0015%'\\Ζok5OT߹Sq\u0019\t\u0017JHܶ\u0010:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0019", "", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "Bn_\u0019X-M1#\f\u0004^9i\u0005.i\u00106", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", "Bn_\u001f\\.Abv\t\bg,\nu+d\u00048\n", "0ncAb4+W\u001b\u0002\n<6\n\u0012/rl$zD\u0011%", "0ncAb4%S\u001a\u000eXh9\u0006\t<R{'\u007fP\u000f", "uE5\u00139\u0011#8}e\u0001h;\u0004\r8/\u00059\u0004\n\u0005 &G|\u00178}n\u0014Y~\u001cGt%\fWLIzA.\u0013wkFn_9Tv4\u001d\u0010?", "-rR._,=@\u0015}~b\u0019|\u0007>", "5dc\u000fb;M]!", "u(5", "5dc\u000fb;M]!ez_;Z\u0013<n\u007f5h<\u007f\u001b'U7\u0014\"Y\n7@\f", "u(9", "\u0018", "5dc\u000fb;M]!k~`/\ff9r\t(\t-|\u0016\u001bW}UB\\\b\u001a[d.", "6dX4[;", "5dc\u0015X0@V(", "5dc\u0019X-M", "5dc\u001f\\.Ab", "5dc!b7", "5dc!b7%S\u001a\u000eXh9\u0006\t<R{'\u007fP\u000f^\u001d-Rr>]3", "5dc!b7+W\u001b\u0002\n<6\n\u0012/rl$zD\u0011%^MUp!x\fC", "EhSA[", "5dc$\\+MV", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(NBd\u0012_m1L\u000e", "1n\\=b5>\\(O", "1n\\=b5>\\(OBd\u0012_m1L\u000e", "1n\\=b5>\\(P", "1n\\=b5>\\(PBd\u0012_m1L\u000e", "1n\\=b5>\\(Q", "1n\\=b5>\\(QBd\u0012_m1L\u000e", "1n]AT0Ga", "", ">nX;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1n]AT0Ga`\u0005B-3hS\u0017", "uI\u0018'", "1n_F", "1n_F \u0014\u001d4&\r\nl", "uE5\u00139\u0011#8}BaZ5{\u00169i~;E>\u000b\u001f\"Q}\u000e\u0006\u0007)~[}*?m%;a\r(uD'\u0014Ua7\u00169", "3pd._:", "=sW2e", "6`b566=S", "", ";h]\u001fT+Bc'", ";h]", "@`S6h:\n", "@`S6h:\u000b", ":h\\6g", "AbP9X++O\u0018\u0003~K,z\u0018", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RoundRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m3991RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m3922getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    public /* synthetic */ RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m3978copyMDFrsts$default(RoundRect roundRect, float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = roundRect.left;
        }
        if ((2 & i2) != 0) {
            f3 = roundRect.top;
        }
        if ((4 & i2) != 0) {
            f4 = roundRect.right;
        }
        if ((8 & i2) != 0) {
            f5 = roundRect.bottom;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            j2 = roundRect.topLeftCornerRadius;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            j3 = roundRect.topRightCornerRadius;
        }
        if ((64 & i2) != 0) {
            j4 = roundRect.bottomRightCornerRadius;
        }
        if ((i2 & 128) != 0) {
            j5 = roundRect.bottomLeftCornerRadius;
        }
        return roundRect.m3984copyMDFrsts(f2, f3, f4, f5, j2, j3, j4, j5);
    }

    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m3979component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m3980component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m3981component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m3982component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m3984copyMDFrsts(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        return new RoundRect(f2, f3, f4, f5, j2, j3, j4, j5, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m3911equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m3911equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m3911equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m3911equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m3914hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m3914hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m3914hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m3914hashCodeimpl(this.bottomLeftCornerRadius);
    }

    private RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
        this.topLeftCornerRadius = j2;
        this.topRightCornerRadius = j3;
        this.bottomRightCornerRadius = j4;
        this.bottomLeftCornerRadius = j5;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public /* synthetic */ RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, (i2 + 16) - (i2 | 16) != 0 ? CornerRadius.Companion.m3922getZerokKHJgLs() : j2, (i2 + 32) - (i2 | 32) != 0 ? CornerRadius.Companion.m3922getZerokKHJgLs() : j3, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? CornerRadius.Companion.m3922getZerokKHJgLs() : j4, (i2 + 128) - (i2 | 128) != 0 ? CornerRadius.Companion.m3922getZerokKHJgLs() : j5, null);
    }

    /* JADX INFO: renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m3987getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m3988getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m3986getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m3985getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m3913getYimpl(this.bottomLeftCornerRadius), CornerRadius.m3913getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m3912getXimpl(this.topLeftCornerRadius), CornerRadius.m3912getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m3913getYimpl(this.topRightCornerRadius), CornerRadius.m3913getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m3912getXimpl(this.bottomRightCornerRadius), CornerRadius.m3912getXimpl(this.bottomLeftCornerRadius), getWidth());
        RoundRect roundRect2 = new RoundRect(this.left * fMinRadius, this.top * fMinRadius, this.right * fMinRadius, this.bottom * fMinRadius, CornerRadiusKt.CornerRadius(CornerRadius.m3912getXimpl(this.topLeftCornerRadius) * fMinRadius, CornerRadius.m3913getYimpl(this.topLeftCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m3912getXimpl(this.topRightCornerRadius) * fMinRadius, CornerRadius.m3913getYimpl(this.topRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m3912getXimpl(this.bottomRightCornerRadius) * fMinRadius, CornerRadius.m3913getYimpl(this.bottomRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m3912getXimpl(this.bottomLeftCornerRadius) * fMinRadius, CornerRadius.m3913getYimpl(this.bottomLeftCornerRadius) * fMinRadius), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    private final float minRadius(float f2, float f3, float f4, float f5) {
        float f6 = f3 + f4;
        return (f6 <= f5 || f6 == 0.0f) ? f2 : Math.min(f2, f5 / f6);
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m3983containsk4lQ0M(long j2) {
        float fM3937getXimpl;
        float fM3938getYimpl;
        float fM3912getXimpl;
        float fM3913getYimpl;
        if (Offset.m3937getXimpl(j2) < this.left || Offset.m3937getXimpl(j2) >= this.right || Offset.m3938getYimpl(j2) < this.top || Offset.m3938getYimpl(j2) >= this.bottom) {
            return false;
        }
        RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
        if (Offset.m3937getXimpl(j2) < this.left + CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius) && Offset.m3938getYimpl(j2) < this.top + CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius)) {
            fM3937getXimpl = (Offset.m3937getXimpl(j2) - this.left) - CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM3938getYimpl = (Offset.m3938getYimpl(j2) - this.top) - CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM3912getXimpl = CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM3913getYimpl = CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m3937getXimpl(j2) > this.right - CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.topRightCornerRadius) && Offset.m3938getYimpl(j2) < this.top + CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.topRightCornerRadius)) {
            fM3937getXimpl = (Offset.m3937getXimpl(j2) - this.right) + CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM3938getYimpl = (Offset.m3938getYimpl(j2) - this.top) - CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM3912getXimpl = CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM3913getYimpl = CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m3937getXimpl(j2) > this.right - CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius) && Offset.m3938getYimpl(j2) > this.bottom - CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius)) {
            fM3937getXimpl = (Offset.m3937getXimpl(j2) - this.right) + CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM3938getYimpl = (Offset.m3938getYimpl(j2) - this.bottom) + CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM3912getXimpl = CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM3913getYimpl = CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
        } else {
            if (Offset.m3937getXimpl(j2) >= this.left + CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) || Offset.m3938getYimpl(j2) <= this.bottom - CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius)) {
                return true;
            }
            fM3937getXimpl = (Offset.m3937getXimpl(j2) - this.left) - CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM3938getYimpl = (Offset.m3938getYimpl(j2) - this.bottom) + CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM3912getXimpl = CornerRadius.m3912getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM3913getYimpl = CornerRadius.m3913getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
        }
        float f2 = fM3937getXimpl / fM3912getXimpl;
        float f3 = fM3938getYimpl / fM3913getYimpl;
        return (f2 * f2) + (f3 * f3) <= 1.0f;
    }

    public String toString() {
        long j2 = this.topLeftCornerRadius;
        long j3 = this.topRightCornerRadius;
        long j4 = this.bottomRightCornerRadius;
        long j5 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        return (CornerRadius.m3911equalsimpl0(j2, j3) && CornerRadius.m3911equalsimpl0(j3, j4) && CornerRadius.m3911equalsimpl0(j4, j5)) ? CornerRadius.m3912getXimpl(j2) == CornerRadius.m3913getYimpl(j2) ? "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m3912getXimpl(j2), 1) + ')' : "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m3912getXimpl(j2), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m3913getYimpl(j2), 1) + ')' : "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m3918toStringimpl(j2)) + ", topRight=" + ((Object) CornerRadius.m3918toStringimpl(j3)) + ", bottomRight=" + ((Object) CornerRadius.m3918toStringimpl(j4)) + ", bottomLeft=" + ((Object) CornerRadius.m3918toStringimpl(j5)) + ')';
    }

    /* JADX INFO: compiled from: RoundRect.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005>i%\nCiWP\u0002xޣQɁksvϺj\rI\u0012\u0014\u0016\u0011l2Mc}ٛ\u0016\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "(da<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0019", "5dc'X9H\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc'X9H", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j*Gv\u0015\u001bMAJA", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }
    }
}
