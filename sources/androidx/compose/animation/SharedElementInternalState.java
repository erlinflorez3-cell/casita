package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: SharedElement.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u0018sڔ<$q$yCAU\"}8\tWȞog|Ob\u000bI\u0016\u000e\u0016\u000fj4I[ze\u0012%2JoE8UoS9htL\u0005(2(;\u0002\u0005\u0017\u001a2H\u0016'\u0003Ca\f\u001a0FpBR\u001bM\r܅\u001a\u0006T \t\u001ebiTȤ^Ǎ\u000e:]\"3ipNg#@\u0001[\u000e^TU\u000f\u0007e,.X7c\u00195W\u0011\fj[m\tOuK\f\u0001'U3Ywe?p\u007fB\u001f;S\u001bh\u000b&\u000b\rad\u001a3CO\u0012X`\u00126\u0006\u0013{;KǬ\u0012\u00065Xv>(F \u000eaUʺR?҉\u0001މ۰\u0004|g\u0018%THA9\u001c3f\u007fEk\u001d\\\u001c\u0014\u0005;\u0004i\u00157'i;&`C~\u001b\f\u001a7_(UH|m Q6\n~K\u001a*2\u0014\u000e\u0014\u007f%\u001f1/%e_i'/|\u001aHrk-I\u001f-*֦ɼHغ&~\u001e90\u001f\u001aq\\f\u000b}^gx.\u0017a*iW\u0018\u0016+8^\u000e;O>fʛ[ŹmvUΪ\"'5\u0001Et\u000fm\u0014sG{\u0004b_\u0003(chuB]lh\u0013i~Di\u000b\tz^fp\rAݟǽ{ΌR\u001c\u001b4E\u0016*KD3\u001f|#i# Hc\u000b,0zv5\u0017\\C(\u0013k:s7(~\u0003Gטs֑M8\u0005ʠ:/GyCBFW(\u0013B(s\u001c\r \u0018G\u0016y}\u0011ͷ\u0015߯˖z\u001fک\u001e=i1CA\u001d.y[\u00106]L!o\u0002Q 8\u0013|(\u0019q-l,^υҀ,߯nZWV\u001dV\u0005u\u000b%\u000e\u0015\u000e+\u0002H\u0001yq\b[uL~\u000b\u0005o;|˻Sĕ+Ǫ)\rwܲ\u001573y5T6y\u001ag#\u001b.\u0013}3\u0012b=,%i\u0012={\u0016\u001eh\b\"p\u007f\u000fՅˁ~й&4t\u0005H\u0007x\u000f D\u000fn\u001bnhCj-du\u001e4=\t~\u0007Z\u0015!ZiK+o,<d$h8\u001aͦх^ǜ)!UUm1{bt\rPN\u0018K\u001c3tS*\u007fp\u007fei!04{H:OLz\u0005j\u0011Zxj\u0001^Ո͞TɎ\n \u0003\u0002L&\u001d.JDy\u007fdNtzb\u001cVG1nn\"B\u0001-\u0011c\"\u0007FI\u0005\u001cH\u000bs\"vWҼ\u0087\tƨn_\u0007h+vRkQ\u001d. \u000fSe_I\u0013\u0010\u0001TY7:\u0004o:@N=s°\u001aê=U)a|}lK&v\\3\u000f\u0012\u0015Z\u0005`\u007fͧ|է\u0012@\"\u0011\u0011h]3@q;\u001dfweKPEӢH-\u001f\u000e\u00035T[}\u0015C\u007fUI\u0019\u001c]@\u009cW?\u0016\n&s5DEJjc&f8jK>$\u0003.b0\u0016I\u0015^H\u0005\u0604Ƣr˹2\u0018>Q\b\f\u0010*v[qL/\u0016G-r\\P#9\"\u0018q\u0005c\u001dd;\u0007tBny\u001d<\u0007qG{$ܯ\u008cXŷ>![\"^n\u000er-(%\u0010\u0016=I\u0012U?vMդOd\u0015.5֖F\u001008R$\u001dώ}_"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJO=-\u0015uj5\u000eQ;J\u0006'\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006]!IY\u000b\r7v\u0015.ZCHA", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "AgP?X+\u001eZ\u0019\u0007zg;", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJA", "0nd;W:\u001a\\\u001d\u0007vm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006S/Eb|.\u0013v\u001a6IR?u=s", ">kP0X\u000fHZ\u0018~\bL0\u0012\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0017Ur%G/X3[R\u007f+\u0018'Zc", "@d]1X9(\\ \u0013la,\u0006y3s\u0004%\u0003@", "", "=uT?_(R1 \u0003\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0016_v4NHb\ncV}\u0013", "@d]1X9\"\\\u0003\u0010zk3x\u001d\u000eu\r,\u0005Bo$\u0013P}\u0012Kz/>", "CrT?F;:b\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u001aQr4GK,6earF#\u007fi\n]+b", "HH]1X?", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6M\u001d.UCDz\n\u0005\u0011q`F\u0011g+a@%QTY6jR<9\u001d\u0016b\n]/\u0017\u000e#\u001e.~M6-c5M\n7w\u0005\u0016\u001fc\u001cfyAc\u001aKx(??3pQcmy\u0011=Nf2`\u001bc'e\u0004('\u0010~\u0019\u001aW]*\u0013\nW v\\\u0003UeQ$zv\u000fEiYF(y\\;t4\rO\u0011wg'?p4s:\u000e8)I.\u0003Uo#Hlx^(eE/\"E@\u001dH\u0015QxhK\u000eg\u000en\u0004\u0017p9@\u001donQF\u0019\u0012]UEFal\b3fcEMzj\u001c-zKZ\u0007\u001f\r\u000677cSK&^\u000f\u001a:@+c\u0019~\u0012j\"%w\u0004@U\u001ch)NDI\u001c\u0017lG\u0010\u0006b1\u0013zS\u0010,9uWdo#\u0014\u0003\u001aX!<Z*\u0006NRoevwq", "\nrTA \u0006\u0017", "5dc\u000fb<GR'Z\u0004b4x\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0012c\u000e)6{q7QK7z8(\u001e>", "Adc\u000fb<GR'Z\u0004b4x\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0002?i\u0007\u001fEI\u001f2U?Jo>'j,R", "0nd;W:\u001a\\\u001d\u0007vm0\u0007\u0012md\u007f/{B|&\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1kX=C(MV|\bdo,\n\u0010+y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "5dc\u0010_0I>\u0015\u000e}B5f\u001a/r\u0007$\u0010~| \u001bOk\u001d@\u0001./f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001cFpk", "Adc\u0010_0I>\u0015\u000e}B5f\u001a/r\u0007$\u0010~| \u001bOk\u001d@\u0001./f}'7i$.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:CY\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ":`h2e", "5dc\u0019T@>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u0005\u001cKm#w/P7v7\"\u0013vH5\u001bc9$", "Adc\u0019T@>`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~`y47z_\u0010Z?Fn8\u001c#O]M\u0007p\u0002\u0012g", ":`h2ej=S ~|Z;|", ":n^8T/>O\u0018\\\u0005h9{\u0017", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u0019b6DO\u001c~v]\n\u0007\u0013<d\u000e", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u0019b6DO\u001c~v]\n\u0007\u0013<d\u000e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "<n]\u001bh3E:#\t\u0001Z/|\u0005.S\u0004={", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u001bb5'c \u0006ah6\u0003\u00052e{'iD\u0016\u0017^0RUAs\u00123", "u(9", "5dc\u001ci,KZ\u0015\u0013Xe0\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,\r`8GYU(p0yA\u001fg", "Adc\u001ci,KZ\u0015\u0013Xe0\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6\\#*VQ?z8(\u001eV_C\u0012cj8\b'TSJ@:YvHiUK", "=uT?_(R1 \u0003\u0006\u001d+|\u0010/g{7{", ">`a2a;,b\u0015\u000ez", "5dc\u001dT9>\\(l\nZ;|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7lu5MK;tC\u0002\u001ewaF\u0010_3<\u0006#VL$", "Adc\u001dT9>\\(l\nZ;|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6M\u001d.UCDz\u0018'$hnB\u0003j\u001a]r6G\"\u0012\u001d", "5dc\u001d_(<S{\t\u0002],\nv3z\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,\ra.CJN\u000ffYq=!\u007f^#N\u0001", "Adc\u001d_(<S{\t\u0002],\nv3z\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6\\#*VQ?z8(\u001eV_C\u0012cj9}#EL16cQrJ\u0002\u0016o\u000e$n}", ">kP0X\u000fHZ\u0018~\bL0\u0012\tmd\u007f/{B|&\u0017", "5dc\u001fX5=S&b\u0004H=|\u00166a\u0014\u0007\fM\u0005 \u00196|\nE\u0005)D]\b)", "u(I", "Adc\u001fX5=S&b\u0004H=|\u00166a\u0014\u0007\fM\u0005 \u00196|\nE\u0005)D]\b)", "uY\u0018#", "@d]1X9\"\\\u0003\u0010zk3x\u001d\u000eu\r,\u0005Bo$\u0013P}\u0012Kz/>\u0018| >m\u0018*\\C", "5dc\u001fX5=S&h\u0004e@n\f/np,\nD}\u001e\u0017", "Adc\u001fX5=S&h\u0004e@n\f/np,\nD}\u001e\u0017", "@d]1X9(\\ \u0013la,\u0006y3s\u0004%\u0003@?\u0016\u0017No\u00108\u0006%", "5dc [(KS\u0018^\u0002^4|\u0012>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7lu5MK;tCs", "Adc [(KS\u0018^\u0002^4|\u0012>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6M\u001d.UCDz\na\u0006", "AgP?X+\u001eZ\u0019\u0007zg;;\b/l\u007f*wO\u0001", "Ag^B_++S\"}zk\tx\u0017/di1j<\u000e\u0019\u0017V", "5dc [6NZ\u0018kzg+|\u0016\fa\u000e(z*\n\u0006\u0013Tq\u000eK", "Ag^B_++S\"}zk\u0010\u0006r@e\r/wT", "5dc [6NZ\u0018kzg+|\u0016\u0013ni9{M\b\u0013+\u0006k\u0017@~!D]\b)1z\u00165M?Ik", "Ag^B_++S\"}zk\u0010\u0006s6a}(", "5dc [6NZ\u0018kzg+|\u0016\u0013nj/w>\u0001", "B`a4X;", "5dc!T9@S(", "5dc\"f,KA(z\n^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,\rd*CYN+:\\{L\u0014\u001bi{]'\u001c\u0005/", "Adc\"f,KA(z\n^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6\\#*VQ?z8(\u001eV_C\u0012cj<y#TLM\nf[\u0002=\u001d!H\u001dJ:\rZ\u001d2", "CrT?F;:b\u0019=y^3|\u000b+t\u007f", "5dc'<5=S,", "u(5", "Adc'<5=S,", "uE\u0018#", "HH]1X?|R\u0019\u0006z`(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "1`[0h3:b\u0019e\u0005h2x\f/a~\u0012|A\u000f\u0017&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1`[0h3:b\u0019e\u0005h2x\f/a~\u0012|A\u000f\u0017&\u000fPY\u001aF\u0002'$", "2qPD<5(d\u0019\f\u0002Z@", "", "2qPDF*H^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "=m0/T5=]\"~y", "=m5<e.Hb(~\u0004", "=mA2`,FP\u0019\fz]", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {
    public static final int $stable = 8;
    private final MutableState boundsAnimation$delegate;
    private Path clipPathInOverlay;
    private final MutableState overlayClip$delegate;
    private SharedElementInternalState parentState;
    private final MutableState placeHolderSize$delegate;
    private final MutableState renderInOverlayDuringTransition$delegate;
    private final MutableState renderOnlyWhenVisible$delegate;
    private final MutableState sharedElement$delegate;
    private final MutableState userState$delegate;
    private final MutableFloatState zIndex$delegate;
    private Function0<? extends LayoutCoordinates> lookaheadCoords = new Function0() { // from class: androidx.compose.animation.SharedElementInternalState$lookaheadCoords$1
        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            return null;
        }
    };
    private final MutableState layer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    public SharedElementInternalState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, SharedTransitionScope.OverlayClip overlayClip, boolean z3, SharedTransitionScope.SharedContentState sharedContentState, float f2) {
        this.zIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.renderInOverlayDuringTransition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z3), null, 2, null);
        this.sharedElement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.boundsAnimation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.placeHolderSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(placeHolderSize, null, 2, null);
        this.renderOnlyWhenVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
        this.overlayClip$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.userState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentState, null, 2, null);
    }

    @Override // androidx.compose.animation.LayerRenderer
    public float getZIndex() {
        return this.zIndex$delegate.getFloatValue();
    }

    public void setZIndex(float f2) {
        this.zIndex$delegate.setFloatValue(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderInOverlayDuringTransition() {
        return ((Boolean) this.renderInOverlayDuringTransition$delegate.getValue()).booleanValue();
    }

    public final void setRenderInOverlayDuringTransition(boolean z2) {
        this.renderInOverlayDuringTransition$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedElement getSharedElement() {
        return (SharedElement) this.sharedElement$delegate.getValue();
    }

    public final void setSharedElement(SharedElement sharedElement) {
        this.sharedElement$delegate.setValue(sharedElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation) this.boundsAnimation$delegate.getValue();
    }

    public final void setBoundsAnimation(BoundsAnimation boundsAnimation) {
        this.boundsAnimation$delegate.setValue(boundsAnimation);
    }

    public final SharedTransitionScope.PlaceHolderSize getPlaceHolderSize() {
        return (SharedTransitionScope.PlaceHolderSize) this.placeHolderSize$delegate.getValue();
    }

    public final void setPlaceHolderSize(SharedTransitionScope.PlaceHolderSize placeHolderSize) {
        this.placeHolderSize$delegate.setValue(placeHolderSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderOnlyWhenVisible() {
        return ((Boolean) this.renderOnlyWhenVisible$delegate.getValue()).booleanValue();
    }

    public final void setRenderOnlyWhenVisible(boolean z2) {
        this.renderOnlyWhenVisible$delegate.setValue(Boolean.valueOf(z2));
    }

    public final SharedTransitionScope.OverlayClip getOverlayClip() {
        return (SharedTransitionScope.OverlayClip) this.overlayClip$delegate.getValue();
    }

    public final void setOverlayClip(SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip$delegate.setValue(overlayClip);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedTransitionScope.SharedContentState getUserState() {
        return (SharedTransitionScope.SharedContentState) this.userState$delegate.getValue();
    }

    public final void setUserState(SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState$delegate.setValue(sharedContentState);
    }

    public final Path getClipPathInOverlay$animation_release() {
        return this.clipPathInOverlay;
    }

    public final void setClipPathInOverlay$animation_release(Path path) {
        this.clipPathInOverlay = path;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public void drawInOverlay(DrawScope drawScope) {
        GraphicsLayer layer = getLayer();
        if (layer != null && getShouldRenderInOverlay$animation_release()) {
            if (getSharedElement().getCurrentBounds() == null) {
                throw new IllegalArgumentException("Error: current bounds not set yet.".toString());
            }
            Rect currentBounds = getSharedElement().getCurrentBounds();
            Unit unit = null;
            Offset offsetM3926boximpl = currentBounds != null ? Offset.m3926boximpl(currentBounds.m3972getTopLeftF1C5BW0()) : null;
            Intrinsics.checkNotNull(offsetM3926boximpl);
            long jM3947unboximpl = offsetM3926boximpl.m3947unboximpl();
            float fM3937getXimpl = Offset.m3937getXimpl(jM3947unboximpl);
            float fM3938getYimpl = Offset.m3938getYimpl(jM3947unboximpl);
            Path path = this.clipPathInOverlay;
            if (path != null) {
                int iM4167getIntersectrtfAjoo = ClipOp.Companion.m4167getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo4657clipPathmtrdDE(path, iM4167getIntersectrtfAjoo);
                    drawScope.getDrawContext().getTransform().translate(fM3937getXimpl, fM3938getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, layer);
                        drawScope.getDrawContext().getTransform().translate(-fM3937getXimpl, -fM3938getYimpl);
                        drawContext.getCanvas().restore();
                        drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                        unit = Unit.INSTANCE;
                    } finally {
                    }
                } catch (Throwable th) {
                    drawContext.getCanvas().restore();
                    drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                    throw th;
                }
            }
            if (unit != null) {
                return;
            }
            drawScope.getDrawContext().getTransform().translate(fM3937getXimpl, fM3938getYimpl);
            try {
                GraphicsLayerKt.drawLayer(drawScope, layer);
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: getNonNullLookaheadSize-NH-jbRc */
    public final long m444getNonNullLookaheadSizeNHjbRc() {
        LayoutCoordinates layoutCoordinatesInvoke = this.lookaheadCoords.invoke();
        if (layoutCoordinatesInvoke == null) {
            throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + getSharedElement().getKey() + '.').toString());
        }
        return IntSizeKt.m6820toSizeozmzZPI(layoutCoordinatesInvoke.mo5522getSizeYbymL2g());
    }

    public final Function0<LayoutCoordinates> getLookaheadCoords() {
        return this.lookaheadCoords;
    }

    public final void setLookaheadCoords(Function0<? extends LayoutCoordinates> function0) {
        this.lookaheadCoords = function0;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public SharedElementInternalState getParentState() {
        return this.parentState;
    }

    public void setParentState(SharedElementInternalState sharedElementInternalState) {
        this.parentState = sharedElementInternalState;
    }

    /* JADX INFO: renamed from: calculateLookaheadOffset-F1C5BW0 */
    public final long m443calculateLookaheadOffsetF1C5BW0() {
        LayoutCoordinates layoutCoordinatesInvoke = this.lookaheadCoords.invoke();
        if (layoutCoordinatesInvoke == null) {
            throw new IllegalArgumentException("Error: lookahead coordinates is null.".toString());
        }
        return getSharedElement().getScope().getLookaheadRoot$animation_release().mo5523localPositionOfR5De75A(layoutCoordinatesInvoke, Offset.Companion.m3953getZeroF1C5BW0());
    }

    public final boolean getTarget() {
        return getBoundsAnimation().getTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GraphicsLayer getLayer() {
        return (GraphicsLayer) this.layer$delegate.getValue();
    }

    public final void setLayer(GraphicsLayer graphicsLayer) {
        this.layer$delegate.setValue(graphicsLayer);
    }

    private final boolean getShouldRenderBasedOnTarget() {
        return Intrinsics.areEqual(getSharedElement().getTargetBoundsProvider$animation_release(), this) || !getRenderOnlyWhenVisible();
    }

    public final boolean getShouldRenderInOverlay$animation_release() {
        return getShouldRenderBasedOnTarget() && getSharedElement().getFoundMatch() && getRenderInOverlayDuringTransition();
    }

    public final boolean getShouldRenderInPlace() {
        return !getSharedElement().getFoundMatch() || (!getShouldRenderInOverlay$animation_release() && getShouldRenderBasedOnTarget());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        getSharedElement().getScope().onStateAdded$animation_release(this);
        getSharedElement().updateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        getSharedElement().getScope().onStateRemoved$animation_release(this);
        getSharedElement().updateTargetBoundsProvider();
    }
}
