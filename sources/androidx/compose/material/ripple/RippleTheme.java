package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(level = DeprecationLevel.ERROR, message = "\u0015O\fE}y\t_]T-:Q#0\u000eH[\f(\u0011Z\u0015b\u0007Rs^Vy1k(TeXR\u001cj>K,r>\u0017f^~%Y\\@i}\u0001Q O\u0019]ZwF\u00072\u001a~K[N\r\tm#\u001c\u0005J\u001cD:X7<9\u0013\u0004CX[|\u0001754M 6\u000b T\u0014Fb\u001e%,CEy{+/PI\u0016r^:*VxFv* A\u001d\u0017Dl=ht\u001bEk`\u0019-a[(eg<\u000bL\u001f=:x\u0003Yui2\u0011.v\u001b~\u00190tS\"\u0005mmT+YsJ']-^iRG\u001ePGMY'i_3|\r\u0006\u0018y\"7'~\\v85g=#we\u00054\u000e&->\u0003\u00127=G6j<K&*`m\u000f2D\u007f\f\u0014\u0015/$\u000f\u001d)^y\r(fe\u001b|bY,Hs\u0003\u0017bX>MeA=9q@p\u0002V\u0019?W\u001c|\u000e\u0006ks")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lk?\u0016Z͜f5\u0003SX\u000e$z;ln2q[;\u0004\u001bDG\u0093NȞ̭fmН^\rI\u0011\u0014\u0019Au:Mmx\f\u0017UWԲs?AS܇<9ŞtE\r 8A@|\u000bб6XG\u0018x\u0001by\u000bܞ4HÂ>Q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC*n4&\u0015>", "", "2dU.h3M1#\u0006\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2dU.h3M1#\u0006\u0005ksn\u0005\u000bFo{y", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq2", "@h_=_,\u001aZ$\u0002v", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019$\u001bR6\u0018\fY\u000b\u0011rOB&\b\bP\r>dV", "\u0011n\\=T5B]\"", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface RippleTheme {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0015O\fE}y\t_]T-:Q#0\u000eH[\f(\u0011Z\u0015b\u0007Rs^Vy1k(TeXR\u001cj>K,r>\u0017f^~%Y\\@i}\u0001Q O\u0019]ZwF\u00072\u001a~K[N\r\tm#\u001c\u0005J\u001cD:X7<9\u0013\u0004CX[|\u0001754M 6\u000b T\u0014Fb\u001e%,CEy{+/PI\u0016r^:*VxFv* A\u001d\u0017Dl=ht\u001bEk`\u0019-a[(eg<\u000bL\u001f=:x\u0003Yui2\u0011.v\u001b~\u00190tS\"\u0005mmT+YsJ']-^iRG\u001ePGMY'i_3|\r\u0006\u0018y\"7'~\\v85g=#we\u00054\u000e&->\u0003\u00127=G6j<K&*`m\u000f2D\u007f\f\u0014\u0015/$\u000f\u001d)^y\r(fe\u001b|bY,Hs\u0003\u0017bX>MeA=9q@p\u0002V\u0019?W\u001c|\u000e\u0006ks")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: defaultColor-WaAFU9c */
    long mo1754defaultColorWaAFU9c(Composer composer, int i2);

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0015O\fE}y\t_]T-:Q#0\u000eH[\f(\u0011Z\u0015b\u0007Rs^Vy1k(TeXR\u001cj>K,r>\u0017f^~%Y\\@i}\u0001Q O\u0019]ZwF\u00072\u001a~K[N\r\tm#\u001c\u0005J\u001cD:X7<9\u0013\u0004CX[|\u0001754M 6\u000b T\u0014Fb\u001e%,CEy{+/PI\u0016r^:*VxFv* A\u001d\u0017Dl=ht\u001bEk`\u0019-a[(eg<\u000bL\u001f=:x\u0003Yui2\u0011.v\u001b~\u00190tS\"\u0005mmT+YsJ']-^iRG\u001ePGMY'i_3|\r\u0006\u0018y\"7'~\\v85g=#we\u00054\u000e&->\u0003\u00127=G6j<K&*`m\u000f2D\u007f\f\u0014\u0015/$\u000f\u001d)^y\r(fe\u001b|bY,Hs\u0003\u0017bX>MeA=9q@p\u0002V\u0019?W\u001c|\u000e\u0006ks")
    @InterfaceC1492Gx
    RippleAlpha rippleAlpha(Composer composer, int i2);

    /* JADX INFO: compiled from: RippleTheme.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9LeN2Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018nuh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u0006|k\u0017'2pu\u00068߲nމ˃dv<\f.:jX\b\u000e\u0019\u001aXL@z\tFc\f@4ptHW%M3 X\u000bͽ\u001fҵɉ`iT@VwҚ:4+\u0006oŋjU^݇\u0001Y"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC*n4&\u0015'?C\u000fn(Wz1P\"", "", "u(E", "2dU.h3M@\u001d\n\u0006e,X\u0010:h{", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "1n]AX5M1#\u0006\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ":hV5g\u001bAS!~", "", "2dU.h3M@\u001d\n\u0006e,X\u0010:h{oZSh&\u001f<m", "uIIu?(GR&\t~]?F\u00079m\u000b2\n@J\u001f\u0013Vo\u001b@r,~f\u0002+Bt\u0016w:GFv;\u001epol<\u00039", "2dU.h3M@\u001d\n\u0006e,Z\u00136o\r", "2dU.h3M@\u001d\n\u0006e,Z\u00136o\roKQj\u0017cUc", "uIIu=", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0017N\u0001tuy\u001bXmS<:b\u001e<^hQH*\u0014t\u001bd6\\o|Wy7&jQxYRavxJ#FC\u0019d\f\r;k\\@r}J\u0017\u001eZ\u001dS)\n\u000eA\u0007\u0014xJ[Q\u0013\n`6\u0011\u000bVOS\u007fD66:VpG_5.\u0005-\u0006.I\u001d+\r/(JMZ\u0017_#C=f\u0010#:\u0001PibOp\u001ehxFv* @\u0019\u0014\n\u00168ewWP`Y\u001c 4\u0014\u0004<V\u0012\u000b\u0004'<:v\u007f^\u001fuA\u0011r(\u000e\u0004WBpS\"\u0002ioS.PgUk\u001a4(bW8\u001eZ~\b@1\u001b]%<\\6\u000e'eEuwh\u0003/Cas\u0015w*=+\u000e03>\u0016\f8=I:m2Y /^\u001f\u0018\u0002MvE\u0018\u001742\t\u001b&ima'\u001at\"n\u001d\u001e\u001bRi\u0001\u0011bgRJt:;hx7%\u0013I'F\u0014R\rH\bokZP8@~}^\u000f 3\u0016\"{\u0019e<%\u0013V3&f[8|KBq(PV\n,Q9d/n'L@po\u0002\u000bqP0jeZ\u007f\u001f=PM}jnoRvoP9'nIM\u0011\t\u0011%}^\u0012@\u0005p\u0015MN\u0005A\u000fCy\u0001n-k\u0003n\u000f\u0012\u00110\u000bv\u0007~!CT<1\u0011jb6q\u001eA=2*7\n`I\bH}3.|.\fW)\u000b,^f\u0018dh\u0003+-E/|X\rE\rqj\u0016<3C^\u0005)B\u0019$\f@d5@\u0012nCb\u001fYXT\u00177")
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
        public final long m1767defaultRippleColor5vOe2sY(long j2, boolean z2) {
            return (z2 || ((double) ColorKt.m4230luminance8_81llA(j2)) >= 0.5d) ? j2 : Color.Companion.m4215getWhite0d7_KjU();
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0017N\u0001tuy\u001bXmS<:b\u001e<^hQH(\u0011x\u0014S6\\o|Wy7&jQxYRavxJ#FC\u0019d\f\r;k\\@r}J\u0017\u001eZ\u001dS)\n\u000eA\u0007\u0014xJ[Q\u0013\n`6\u0011\u000bVOS\u007fD66:VpG_5.\u0005-\u0006.I\u001d+\r/(JMZ\u0017_#C=f\u0010#:\u0001PibOp\u001ehxFv* @\u0019\u0014\n\u00168ewWP`Y\u001c 4\u0014\u0004<V\u0012\u000b\u0004'<:v\u007f^\u001fuA\u0011r(\u000e\u0004WBpS\"\u0002ioS.PgUk\u001a4(bW8\u001eZ~\b@1\u001b]%<\\6\u000e'eEuwh\u0003/Cas\u0015w*=+\u000e03>\u0016\f8=I:m2Y /^\u001f\u0018\u0002MvE\u0018\u001742\t\u001b&ima'\u001at\"n\u001d\u001e\u001bRi\u0001\u0011bgRJt:;hx7%\u0013I'F\u0014R\rH\bokZP8@~}^\u000f 3\u0016\"{\u0019e<%\u0013V3&f[8|KBq(PV\n,Q9d/n'L@po\u0002\u000bqP0jeZ\u007f\u001f=PM}jnoRvoP9'nIM\u0011\t\u0011%}^\u0012@\u0005p\u0015MN\u0005A\u000fCy\u0001n-k\u0003n\u000f\u0012\u00110\u000bv\u0007~!CT<1\u0011jb6q\u001eA=2*7\n`I\bH}3.z+\u0010P\u0018\u000b,^f\u0018dh\u0003+-E/|X\rE\rqj\u0016<\u001d5du6=\u0006pz:h6:W^BU'[(M\u0004jwu:52xwsWWE3%m_T?")
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
        public final RippleAlpha m1766defaultRippleAlphaDxMtmZc(long j2, boolean z2) {
            if (z2) {
                return ((double) ColorKt.m4230luminance8_81llA(j2)) > 0.5d ? RippleThemeKt.LightThemeHighContrastRippleAlpha : RippleThemeKt.LightThemeLowContrastRippleAlpha;
            }
            return RippleThemeKt.DarkThemeRippleAlpha;
        }
    }
}
