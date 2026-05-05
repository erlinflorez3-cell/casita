package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яě\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.J~(0\u001aw\u001dfrˎ8D{H6Ri*\u0017k\u00025,[2qKП]\u001a\u0014\"\u0011ѧVg}nRZ\u0011C\u0017\u0006$\u0002rߚQU\u000f]\u001a\u000f8Dw?IMw=?`|6\u001b :\"Ny\r\u00010*P\u0010\rzKŷ\u0014\u0012F@x:h\rU\u0005 \u0015\u000e>6\u0001&\\mN>H\u0003]B/)\u0018qB\\9gܞ\u0005M\u001bK\\'\u0013|i\u001eA@?5\u001b(Yϐ\u0007h¹o\u0003mp}\nn'ݳ/I\u0002W~\u0019\u000e#-+}\u001d\u000ev4m\u001dQ\u000f\u001eW1UcYc&(&\u000f,\u0013B\u0004\u001c\u001b?H\\8Jl\u000e\u000eA\u000b\u000bSng2dH\u007f\tyN\u0017S\u0019y0߆\u001aƘЂe=\u001fhE\u0017M>,?\u0019nOk\u0005\u0012n23T&oaWF=Va\"Yk\u00024vh\u00028\u0019HG.:,\u00174\u00173Ms9Q82\u0007ҩHg\u0005$)üRwn`@P~F;8&$Zr\u00035qVTf?)MJh7\u0004\u000e\u0013.r\u0010<O<@TUhw\u007fe]80_\u0006=Y|\f&pI`C5\u007f\u0006 cbvBbLd\u0015X\u0015Ri\u000b\t}͈&2N\u000f@\u001b\u0002D\\1+OOs,4ZS)^%H1ARC\r\t\u000e\u0002x\u0012\u000fTa41\u0010˨x\t\u0007t\rvug\u0007qD|\u000f$]GW5'Om\"\u00176C(ʍ}͞õKiRqZ\u0018^'c\u00188\u0016HI\u00023K?'~W_23KL\u0001xiM@;+\u0003\u007f\u000fI}Fg6u!2fjXel\u0017P\u000e%wן\fd\u000e(*w\tc{T9knM\u00012q<|h-\u000b%\u001e3\u0014\b\"+I]I-\u001d$\r,/Cl\u000eou.\bx'&#|J1І\u001aop\u0003&н:Feq~l2Tp\u0011q`j&8r\u000f:\rA[Yd\u001fjhS\u0011/\f|\u001f,;\b\u0007a@\u0013}\u0013L.\u000e5$b\u0004\u0014lc=*]Uwm\u001cml\rZ\u000f8.\f3~\u0012JM6U\u0006\u0004ס4\u0006y<fdAb\u0013a!AD.L\b9edk\u0016\u0010)#Va\u001f\u0017`i\u0004=f\u000e\u0003\t\u000b|߃\t`K\u0005Q0\u0007~\u001d[6xc35sLT=\rJ\u0001\u0002\u001fO ̻Nƫݝ)-J~GMpc\u000f ]]qTH;\u0086K){\u001f8\u0001F-\u0015\u001dp#K?W\u0011m+H^9|\u0015Tjv \u001cjNPP/\u0001\u0003\u000eJ@'\u000bGv#uh-Z\u0006\u00107qA1\u001dJ)\u0015D\u0015ctB]\f;-K\u0003\u0003\u0014U#\bYA}\u0016Z8'2\u001cQb]\u000etEu\u001bh=\"\u001ch\u0002\u0017Oh 2Uzzx\n<ENO0ZH\u0018ɾXŕ֏%B-izE\u000b{v\u0019\"c\u001bs\u001fY\u0019C~1\u0005\u001c\u001f1^^!'{QC\\h|)SNZA\u0004\"X>\u001fd/))\u05faNɪ\u05cftmU \u001bpwֹ)owHRL\u000eGy$&ZX6\\SV{\u0007\u0015\rj6ZW<)\u001b,r@$)BG/LlH+4t\u001aNh=l1\u001f\n4wd\u0015<]ITHaVMQO29\u0017Xz\u001fORb#\u0002ZF\u0017@\u0018gZ/vXKh?YRo\u0015\u00074s]8p\n\\\u0015\u001c:GZf\"ny(<SjCC)\u0011/7H\b\u007f\u0007GXzSc%X\u0011\u0013\u007f;`ƺ5k@\u0018g\u00141T'\r+Yv;SWuN7\f0\tZ\u0001]c\u00056q.Y5s.({ˑ\u0004\n%HT\n\u0004r\u0018E__p_Ҁ?Ѳؾ[\u0006,zD@\r_U?\u0011s8<\u0012\u0018\"\u0007\feB\u0003\u0013\u0014Ggn.;/\u001fE{<*\u000fRP]\u0014e66-Ak\u0015\u0010}<p/WHe/\u000b(\u0003\u0013Ǉ\u0003͡ߴe8\u007f\u001eN1z\u001d;\u0013lc\u0019lӼP̙߉7\u0011Է\u0011\f\u007f1`e\u0018b#\u001b5OG]Db\u0011Mod\u0089?ǃƔ]-̚\u0010\u0013\u000e\u0016<M/\u0004\u0004Qn\u0019c?U{YG@_R\u05f7\u001fǱ_%\u000eȷ8\u0001UImq\u0007Ha39y\u0001\u0017\fƷ^֓Y%cf1\"\u000exݟ.P^A \u008et4\rMdN/ͳ|\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-\u0016m\u0017*]JJy\n", "", "u(E", "\"hR8F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc!\\*DA\u001d\u0014z&\u000bPh45\u0001\u0010", "u(5", "\u0014", "\"qP0^\u001aM]$b\u0004]0z\u0005>o\r\u0016\u007fU\u0001", "5dc!e(<Y\u0007\u000e\u0005i\u0010\u0006\b3c{7\u0006Mn\u001b,G7l\u0010V*\u0005Ze", "BqP0^\u0017:b\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "2dU.h3MA \u0003y^9Z\u00136o\r6", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-\u0015w\u001d8ZQ\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000ehe0{\t<C\n/\u0006M\u000fU\u001fC~\u000eIz!<'w-7t\u0016*[C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNGH(mDD|\u00123S\u000fI>", "\"gd:U", "", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n[<e:", "3mP/_,=", "", "Bgd:U\u001aBh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\"gd:Us\u0012:\u001dl\u0005F:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u001c.$d^@\u0007G5]v4CJ]0f[`G$\u001fX\u000e$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U&\u0012~RzAZ\u0011Ky\"K(%qEfi}FT\u000f`4l\u0017i+\\\u0004B #q&\u001fdW{SiZ\u0015qR\u0007EqN#\bFy3RBBNnbFx&2\u0015y\u0002\u001a=b\u0003+>:\u0014=9:l\u0005\u0015E\"Fi\u0003#,i\u0017\u000b\ny-", "\"qP0^", "@`]4X\u001aEW\u0018~\bL;x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!>[}\u000e>q\u0015.Z1JgC\u001ej", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00121b\u007f %t\u001a-MP)z0-\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018\u0013\u0017\u0004]B(nQ\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\u0002\u0011\u0005A6lB`-C5HIa*qii$fGHy\tX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DE4G|_NE93F|2)Y{\u0005g\u0016<8\u001c", "2qPDF;H^|\byb*x\u00189r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2qPDG0<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bgd:U\u001bKO\u0017\u0005\\Z7j\rDe", "BqP0^\u0010Ga\u001d}z<6\n\u0012/rm,\u0011@", "\"qP0^s\r3y\u0011z: ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00121b\u007f %t\u001a-MP)z0-\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018\u0013\u0017\u0004]B(nQ\r\u0014n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\u001dqP)uJUfG\u0011/Lf)d\u0019='cDG2iX\u001f%wW2\u0013EX\"z\u001czwpE(~B-L7<VNmd@~0k!b}\u001cA_x4>2\u0015<s7t\u000eIv\u001cHg\u0007^\rlJ%5:F\u001c\r!DVS:\u0017g,k\f\ru~/#mpmV\u000fPj'dDeg\u0001\u00010\u0010FTy#'ST&?=\u0006", "AkX1X9)]'\u0003\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-\"w$2\\GEtBs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013<]| DX <QR?u=,jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W65\f\tZE${\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYOu$uN-dM')gNEDb7B\u0016f'iH\u0010\u0019zm\"\u001auZ2\t\u000f\u001d\u000f|Z\u0005quGb\bH-MqcF\u000fM_D\u007f1-K\tMu\u0016\u001ce", "AkX1X9,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-%|\u0012=M\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013<]| D[%*\\C\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007{\u001cY\u0012O/\r\u0012/( wCD)\f+\\K9r\t\u0017 \u001c54x>e\u0010T}\u0011|\u000frVM]^yT\u001fOi4q\u001a5\u0012C6C#!{\u001d\u001a{\u001a,\u0014\u0004^\u001b\u0001RCtwP(~@$\bKeNPyc<\u0002|\u0003/?h", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013<]| D[%*\\C\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007{\u001cY\u0012O/\r\u0012/6\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:JR\u001fG\u0007\u0019qHv24`cxGN#l1n\u0019mrC@D3\u001bu\"dma6S|c\u001apa}qpUb[H-<|_PN<+#z1.R\u007f\u0001[7i|tu=\r29:n\u000eY1xNgv$0fJt{\u0017\u001dy;Tb\u0003vB\r{h_\u0012\u0016m??\u0019/rsQ\u001e\u000be\u0017%\u0013kg\fA`\u0006K\u001fSxj7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W<2\u0011\u0004YN\u0002xKA,\u0016\u0002", "Bgd:U\nHZ#\f", "/bc6i,-`\u0015|\u0001<6\u0004\u0013<", "/bc6i,-W\u0017\u0005Xh3\u0007\u0016", "7mP0g0OS\b\fv\\2Z\u00136o\r", "7mP0g0OS\b\u0003xd\n\u0007\u00109r", "2hb.U3>R\b\u0002\u000bf)Z\u00136o\r", "2hb.U3>Rt|\nb=|w<a}.YJ\b!$", "2hb.U3>Rt|\nb=|w3c\u0006\u0006\u0006G\u000b$", "2hb.U3>R|\bv\\;\u0001\u001a/T\r$yF^!\u001eQ|", "2hb.U3>R|\bv\\;\u0001\u001a/T\u0004&\u0002\u001e\u000b\u001e!T", "1n[<e:\u0006_c\u0001t)@X", "uI9\u0017=\u0011#8}c_E(\u0006\b<o\u0004'\u000f\n~!\u001fRy\u001c<@2Eb\r$?m_\fWKFuB\u001e\">E\u001dj'\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u0015\u0001hA1r@>lQ\u001aP\u0006:h\u000ei \u0015?w~\u0018", "2qPDF*H^\u0019", "=eU@X;", "Ahi2", "1n[<e", "2qPDF;H^|\byb*x\u00189rG;I*L\u001c\u0001U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023W\f\u000b=", "2qPDG9:Q\u001f", "BhR899:Q(\u0003\u0005g:", "", "/bc6i,+O\"\u0001zL;x\u0016>", "", "/bc6i,+O\"\u0001z>5{", "6dX4[;", "AsP?g\u001bAc!{lb+\f\f", "3mS![<FP\u000b\u0003ym/", "7rA.a.>A \u0003y^9", "2qPDG9:Q\u001fF\u0004`\u0011Gv\rU", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u0002DW\b(13\u0011A3S\u001etrA\u0014X:\u0014\tb\u000b)\u007fL\u0001 \u00185G\u0011?r\n\u001a_nEsnQZ\u001aPFj\\G3wM]hCLRM,+t\u0015],`DC2]R)$f_2\u0014\u0005!fg\u0016j", "2qPDG9:Q\u001fivm/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "AsP?g\nH`\"~\bK({\r?s", "3mS\u0010b9GS&kv]0\r\u0017", "2qPDG9:Q\u001fivm/DfB2]\"l\u001c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023[\f(-\u0012\u001d", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TrackStopIndicatorSize = SliderTokens.INSTANCE.m3517getStopIndicatorSizeD9Ej5fM();
    private static final float TickSize = SliderTokens.INSTANCE.m3517getStopIndicatorSizeD9Ej5fM();
    private static final Path trackPath = AndroidPath_androidKt.Path();

    private SliderDefaults() {
    }

    public final SliderColors colors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1376295968, "C(colors)845@36907L11:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i2, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSliderColors$material3_release;
    }

    /* JADX INFO: renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2513colorsq0g_0yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i2, int i3, int i4) {
        long jM4214getUnspecified0d7_KjU = j9;
        long jM4214getUnspecified0d7_KjU2 = j11;
        long jM4214getUnspecified0d7_KjU3 = j10;
        long jM4214getUnspecified0d7_KjU4 = j4;
        long jM4214getUnspecified0d7_KjU5 = j8;
        long jM4214getUnspecified0d7_KjU6 = j2;
        long jM4214getUnspecified0d7_KjU7 = j5;
        long jM4214getUnspecified0d7_KjU8 = j6;
        long jM4214getUnspecified0d7_KjU9 = j7;
        long jM4214getUnspecified0d7_KjU10 = j3;
        ComposerKt.sourceInformationMarkerStart(composer, 885588574, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)887@39230L11:Slider.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU10 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 4) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 8) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 16) - (i4 | 16) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            jM4214getUnspecified0d7_KjU9 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 64) - (i4 | 64) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 + 128) - (i4 | 128) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i4 & 512) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i2, i3, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)");
        }
        SliderColors sliderColorsM2491copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2491copyK518z4(jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU10, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return sliderColorsM2491copyK518z4;
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached$material3_release = colorScheme.getDefaultSliderColorsCached$material3_release();
        if (defaultSliderColorsCached$material3_release != null) {
            return defaultSliderColorsCached$material3_release;
        }
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledHandleColor()), SliderTokens.INSTANCE.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* JADX INFO: renamed from: Thumb-9LiSoMs, reason: not valid java name */
    public final void m2510Thumb9LiSoMs(final MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z2, long j2, Composer composer, final int i2, final int i3) {
        int i4;
        long j3 = j2;
        boolean z3 = z2;
        SliderColors sliderColorsColors = sliderColors;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-290277409);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Thumb)P(2,3!,4:c#ui.unit.DpSize)947@42562L8,951@42678L46,952@42767L658,952@42733L692,975@43824L5,971@43620L220:Slider.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 4) - (i3 | 4) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 256 : 128)));
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i8 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(j3) ? 16384 : 8192)));
        }
        if ((i3 & 32) != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(this) ? 131072 : 65536)));
        }
        if ((i4 + 74899) - (74899 | i4) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    sliderColorsColors = colors(composerStartRestartGroup, (i4 >> 15) & 14);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if (i8 != 0) {
                    j3 = SliderKt.ThumbSize;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 = (i4 - 897) - (i4 | (-897));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-290277409, i4, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
            int i9 = (-1) - (((-1) - i4) | ((-1) - 14));
            boolean z4 = i9 == 4;
            SliderDefaults$Thumb$1$1 sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || sliderDefaults$Thumb$1$1RememberedValue == Composer.Companion.getEmpty()) {
                sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i9);
            SpacerKt.Spacer(BackgroundKt.m572backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m1064size6HolHcs(companion, !snapshotStateList.isEmpty() ? DpSize.m6729copyDwJknco$default(j3, Dp.m6638constructorimpl(DpSize.m6736getWidthD9Ej5fM(j3) / 2), 0.0f, 2, null) : j3), mutableInteractionSource, false, 2, null), sliderColorsColors.m2502thumbColorvNxB06k$material3_release(z3), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j4 = j3;
            final boolean z5 = z3;
            final SliderColors sliderColors2 = sliderColorsColors;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    this.$tmp2_rcvr.m2510Thumb9LiSoMs(mutableInteractionSource, modifier2, sliderColors2, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    @Deprecated(message = "\u0018Y\u0001t\by'jaV6:d\u001d-b\u001c_\u001e7\u0015w\u001ef\n\u0006\u0002vWx)x(_xCaa")
    @InterfaceC1492Gx
    public final void Track(final SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z3 = z2;
        SliderColors sliderColorsColors = sliderColors;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1546713545);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Track)P(3,2)997@44755L8,1004@45160L1834,1004@45108L1886:Slider.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changed(sliderPositions) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = ((i3 & 4) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i8 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        if ((i3 & 16) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(this) ? 16384 : 8192)));
        }
        if ((i4 + 9363) - (9363 | i4) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    sliderColorsColors = colors(composerStartRestartGroup, (i4 >> 12) & 14);
                    i4 &= -897;
                }
                if (i8 != 0) {
                    z3 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 4) - (i3 | 4) != 0) {
                    i4 = (i4 - 897) - (i4 | (-897));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1546713545, i4, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:999)");
            }
            final long jM2504trackColorWaAFU9c$material3_release = sliderColorsColors.m2504trackColorWaAFU9c$material3_release(z3, false);
            final long jM2504trackColorWaAFU9c$material3_release2 = sliderColorsColors.m2504trackColorWaAFU9c$material3_release(z3, true);
            final long jM2503tickColorWaAFU9c$material3_release = sliderColorsColors.m2503tickColorWaAFU9c$material3_release(z3, false);
            final long jM2503tickColorWaAFU9c$material3_release2 = sliderColorsColors.m2503tickColorWaAFU9c$material3_release(z3, true);
            Modifier modifierM1049height3ABfNKs = SizeKt.m1049height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801023075, "CC(remember):Slider.kt#9igjgp");
            int i9 = (-1) - (((-1) - (composerStartRestartGroup.changed(jM2504trackColorWaAFU9c$material3_release) ? 1 : 0)) & ((-1) - ((i4 + 14) - (i4 | 14) == 4 ? 1 : 0)));
            boolean zChanged = composerStartRestartGroup.changed(jM2504trackColorWaAFU9c$material3_release2);
            boolean z4 = (-1) - (((-1) - (((i9 + (zChanged ? 1 : 0)) - (i9 & (zChanged ? 1 : 0)) != 1 ? 0 : 1) | (composerStartRestartGroup.changed(jM2503tickColorWaAFU9c$material3_release) ? 1 : 0))) & ((-1) - (composerStartRestartGroup.changed(jM2503tickColorWaAFU9c$material3_release2) ? 1 : 0))) == 1;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        boolean z5 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                        long jOffset = OffsetKt.Offset(0.0f, Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()));
                        long jOffset2 = OffsetKt.Offset(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()), Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()));
                        long j2 = z5 ? jOffset2 : jOffset;
                        if (!z5) {
                            jOffset = jOffset2;
                        }
                        float f2 = drawScope.mo710toPx0680j_4(SliderDefaults.INSTANCE.m2514getTickSizeD9Ej5fM());
                        float f3 = drawScope.mo710toPx0680j_4(SliderKt.getTrackHeight());
                        long j3 = jOffset;
                        long j4 = j2;
                        DrawScope.m4720drawLineNGM6Ib0$default(drawScope, jM2504trackColorWaAFU9c$material3_release, j2, jOffset, f3, StrokeCap.Companion.m4532getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        DrawScope.m4720drawLineNGM6Ib0$default(drawScope, jM2504trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3937getXimpl(j4) + ((Offset.m3937getXimpl(j3) - Offset.m3937getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3937getXimpl(j4) + ((Offset.m3937getXimpl(j3) - Offset.m3937getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0())), f3, StrokeCap.Companion.m4532getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        float[] tickFractions = sliderPositions.getTickFractions();
                        SliderPositions sliderPositions2 = sliderPositions;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int length = tickFractions.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            float f4 = tickFractions[i10];
                            Boolean boolValueOf = Boolean.valueOf(f4 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f4 < sliderPositions2.getActiveRange().getStart().floatValue());
                            Object obj = linkedHashMap.get(boolValueOf);
                            if (obj == null) {
                                obj = (List) new ArrayList();
                                linkedHashMap.put(boolValueOf, obj);
                            }
                            ((List) obj).add(Float.valueOf(f4));
                        }
                        long j5 = jM2503tickColorWaAFU9c$material3_release;
                        long j6 = jM2503tickColorWaAFU9c$material3_release2;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(list.size());
                            int size = list.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                arrayList.add(Offset.m3926boximpl(OffsetKt.Offset(Offset.m3937getXimpl(OffsetKt.m3960lerpWko1d7g(j4, j3, ((Number) list.get(i11)).floatValue())), Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()))));
                            }
                            DrawScope.m4725drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m4484getPointsr_lszbg(), zBooleanValue ? j5 : j6, f2, StrokeCap.Companion.m4532getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CanvasKt.Canvas(modifierM1049height3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final SliderColors sliderColors2 = sliderColorsColors;
            final boolean z5 = z3;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    SliderDefaults sliderDefaults = SliderDefaults.this;
                    SliderPositions sliderPositions2 = sliderPositions;
                    Modifier modifier3 = modifier2;
                    SliderColors sliderColors3 = sliderColors2;
                    boolean z6 = z5;
                    int i11 = i2;
                    sliderDefaults.Track(sliderPositions2, modifier3, sliderColors3, z6, composer2, RecomposeScopeImplKt.updateChangedFlags((i11 + 1) - (i11 & 1)), i3);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017g]-\r\\$-R\u001c`\u0011(\u0019( S\u0002K\u0002*Nx6g\u007f?xQ]Ev=O!4N!hLEaXLMfU(\u001b\u000fR\u0014\u0010ZvH\n\b\u0019q+.L\u0001\u0007D#\u0018nQ*Dz\u0001/65\u0013oOe\u001dq\u0007\t\u00045M\u0014+a*'\u0019>d\u0005)9C71:*+FzVIP8\u001dRR%z.d8*r\u0006\u0011?pp\u0018\u0004feI'1\u0012w\u0011c<\tI1=\nzu\nsh3K~z\u0011\u0001!=}a\"vmcO2Pu[", replaceWith = @ReplaceWith(expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    @InterfaceC1492Gx
    public final /* synthetic */ void Track(final SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        boolean z3 = z2;
        SliderColors sliderColorsColors = sliderColors;
        Composer composerStartRestartGroup = composer.startRestartGroup(593554206);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Track)P(3,2)1079@48295L8,1082@48353L213:Slider.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(sliderState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= ((i3 + 4) - (i3 | 4) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 256 : 128;
        }
        int i6 = (i3 + 8) - (i3 | 8);
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
        }
        if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    sliderColorsColors = colors(composerStartRestartGroup, (i4 >> 12) & 14);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if (i6 != 0) {
                    z3 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(593554206, i4, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1081)");
            }
            int i7 = ((i4 + 14) - (14 | i4)) | 14155776;
            int i8 = 112 & i4;
            int i9 = i4 >> 3;
            int i10 = ((i7 + i8) - (i7 & i8)) | ((i9 + 896) - (i9 | 896));
            int i11 = (-1) - (((-1) - (i4 << 3)) | ((-1) - 7168));
            int i12 = i4 << 12;
            m2512Track4EFweAY(sliderState, companion, z3, sliderColorsColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, SliderKt.ThumbTrackGapSize, SliderKt.TrackInsideCornerSize, composerStartRestartGroup, ((i10 + i11) - (i10 & i11)) | ((i12 + 234881024) - (i12 | 234881024)), 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final SliderColors sliderColors2 = sliderColorsColors;
            final boolean z4 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    SliderDefaults.this.Track(sliderState, modifier2, sliderColors2, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /* JADX INFO: renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2512Track4EFweAY(final androidx.compose.material3.SliderState r40, androidx.compose.ui.Modifier r41, boolean r42, androidx.compose.material3.SliderColors r43, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r44, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.graphics.Color, kotlin.Unit> r45, float r46, float r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2512Track4EFweAY(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017g]-\r\\$-R\u001c`\u0011(\u0019( S\u0002K\u0002*Nx6g\u007f?xQ]Ev=O!4N!hLEaXLMfU(\u001b\u000fR\u0014\u0010ZvH\n\b\u0019q+.L\u0001\u0007D#\u0018nQ*Dz\u0001/65\u0013oOe\u001dq\u0007\t\u00045M\u0014+a*'\u0019>d\u0005)9C71:*+FzVIP8\u001dRR$o3g8\u000b\f\u000e\b4v^\u0019Qgc\u000f\u001fa\nF<\\\f\u000e\u000428:zu]so@\u0011.|\u0014oW>zSx}wpa[IkQ\u001ap1.r", replaceWith = @ReplaceWith(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    @InterfaceC1492Gx
    public final /* synthetic */ void Track(final RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z3 = z2;
        SliderColors sliderColorsColors = sliderColors;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1617869097);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Track)P(3,2)1187@52807L8,1190@52865L218:Slider.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(rangeSliderState) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = ((i3 & 4) == 0 && composerStartRestartGroup.changed(sliderColorsColors)) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(this) ? 16384 : 8192)));
        }
        if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 4) != 0) {
                    sliderColorsColors = colors(composerStartRestartGroup, (i4 >> 12) & 14);
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if (i8 != 0) {
                    z3 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1617869097, i4, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1189)");
            }
            float f2 = SliderKt.ThumbTrackGapSize;
            float f3 = SliderKt.TrackInsideCornerSize;
            int i9 = i4 & 14;
            int i10 = ((i9 + 14155776) - (i9 & 14155776)) | ((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4));
            int i11 = i4 >> 3;
            int i12 = (i11 + 896) - (i11 | 896);
            int i13 = i4 << 3;
            int i14 = i4 << 12;
            m2511Track4EFweAY(rangeSliderState, companion, z3, sliderColorsColors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f2, f3, composerStartRestartGroup, ((i10 + i12) - (i10 & i12)) | ((i13 + 7168) - (i13 | 7168)) | ((i14 + 234881024) - (i14 | 234881024)), 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final SliderColors sliderColors2 = sliderColorsColors;
            final boolean z4 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    SliderDefaults.this.Track(rangeSliderState, modifier2, sliderColors2, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023d  */
    /* JADX INFO: renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2511Track4EFweAY(final androidx.compose.material3.RangeSliderState r40, androidx.compose.ui.Modifier r41, boolean r42, androidx.compose.material3.SliderColors r43, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r44, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.graphics.Color, kotlin.Unit> r45, float r46, float r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2511Track4EFweAY(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawTrack-ngJ0SCU, reason: not valid java name */
    public final void m2508drawTrackngJ0SCU(DrawScope drawScope, float[] fArr, float f2, float f3, long j2, long j3, long j4, long j5, float f4, float f5, float f6, float f7, float f8, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, boolean z2) {
        float f9;
        float f10;
        long jOffset = OffsetKt.Offset(0.0f, Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()));
        long jOffset2 = OffsetKt.Offset(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()), Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()));
        float f11 = drawScope.mo710toPx0680j_4(f4);
        long jOffset3 = OffsetKt.Offset(Offset.m3937getXimpl(jOffset) + ((Offset.m3937getXimpl(jOffset2) - Offset.m3937getXimpl(jOffset)) * f3), Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()));
        long jOffset4 = OffsetKt.Offset(Offset.m3937getXimpl(jOffset) + ((Offset.m3937getXimpl(jOffset2) - Offset.m3937getXimpl(jOffset)) * f2), Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()));
        float f12 = 2;
        float f13 = f11 / f12;
        float f14 = drawScope.mo710toPx0680j_4(f8);
        if (Dp.m6637compareTo0680j_4(f7, Dp.m6638constructorimpl(0)) > 0) {
            f9 = (drawScope.mo710toPx0680j_4(f5) / f12) + drawScope.mo710toPx0680j_4(f7);
            f10 = (drawScope.mo710toPx0680j_4(f6) / f12) + drawScope.mo710toPx0680j_4(f7);
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        if (z2 && Offset.m3937getXimpl(jOffset4) > Offset.m3937getXimpl(jOffset) + f9 + f13) {
            float fM3937getXimpl = Offset.m3937getXimpl(jOffset);
            m2509drawTrackPathCx2C_VA(drawScope, Offset.Companion.m3953getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size((Offset.m3937getXimpl(jOffset4) - f9) - fM3937getXimpl, f11), j2, f13, f14);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m3926boximpl(OffsetKt.Offset(fM3937getXimpl + f13, Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()))));
            }
        }
        if (Offset.m3937getXimpl(jOffset3) < (Offset.m3937getXimpl(jOffset2) - f10) - f13) {
            float fM3937getXimpl2 = Offset.m3937getXimpl(jOffset3) + f10;
            float fM3937getXimpl3 = Offset.m3937getXimpl(jOffset2);
            m2509drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(fM3937getXimpl2, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(fM3937getXimpl3 - fM3937getXimpl2, f11), j2, f14, f13);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m3926boximpl(OffsetKt.Offset(fM3937getXimpl3 - f13, Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()))));
            }
        }
        float fM3937getXimpl4 = z2 ? Offset.m3937getXimpl(jOffset4) + f9 : 0.0f;
        float fM3937getXimpl5 = Offset.m3937getXimpl(jOffset3) - f10;
        float f15 = z2 ? f14 : f13;
        float f16 = fM3937getXimpl5 - fM3937getXimpl4;
        if (f16 > f15) {
            m2509drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(fM3937getXimpl4, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(f16, f11), j3, f15, f14);
        }
        long jOffset5 = OffsetKt.Offset(Offset.m3937getXimpl(jOffset) + f13, Offset.m3938getYimpl(jOffset));
        long jOffset6 = OffsetKt.Offset(Offset.m3937getXimpl(jOffset2) - f13, Offset.m3938getYimpl(jOffset2));
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(Offset.m3937getXimpl(jOffset4) - f9, Offset.m3937getXimpl(jOffset4) + f9);
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2 = RangesKt.rangeTo(Offset.m3937getXimpl(jOffset3) - f10, Offset.m3937getXimpl(jOffset3) + f10);
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            float f17 = fArr[i3];
            int i4 = i2 + 1;
            boolean z3 = true;
            if (function2 == null || ((!z2 || i2 != 0) && i2 != fArr.length - 1)) {
                if (f17 <= f3 && f17 >= f2) {
                    z3 = false;
                }
                long jOffset7 = OffsetKt.Offset(Offset.m3937getXimpl(OffsetKt.m3960lerpWko1d7g(jOffset5, jOffset6, f17)), Offset.m3938getYimpl(drawScope.mo4733getCenterF1C5BW0()));
                if ((!z2 || !closedFloatingPointRangeRangeTo.contains(Float.valueOf(Offset.m3937getXimpl(jOffset7)))) && !closedFloatingPointRangeRangeTo2.contains(Float.valueOf(Offset.m3937getXimpl(jOffset7)))) {
                    function3.invoke(drawScope, Offset.m3926boximpl(jOffset7), Color.m4168boximpl(z3 ? j4 : j5));
                }
            }
            i3++;
            i2 = i4;
        }
    }

    /* JADX INFO: renamed from: drawTrackPath-Cx2C_VA, reason: not valid java name */
    private final void m2509drawTrackPathCx2C_VA(DrawScope drawScope, long j2, long j3, long j4, float f2, float f3) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f2, f2);
        long jCornerRadius2 = CornerRadiusKt.CornerRadius(f3, f3);
        RoundRect roundRectM3989RoundRectZAM2FJo = RoundRectKt.m3989RoundRectZAM2FJo(RectKt.m3977Recttz77jQw(OffsetKt.Offset(Offset.m3937getXimpl(j2), 0.0f), androidx.compose.ui.geometry.SizeKt.Size(Size.m4006getWidthimpl(j3), Size.m4003getHeightimpl(j3))), jCornerRadius, jCornerRadius2, jCornerRadius2, jCornerRadius);
        Path path = trackPath;
        Path.addRoundRect$default(path, roundRectM3989RoundRectZAM2FJo, null, 2, null);
        DrawScope.m4724drawPathLG529CI$default(drawScope, path, j4, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m2507drawStopIndicatorx3O1jOs(DrawScope drawScope, long j2, float f2, long j3) {
        DrawScope.m4715drawCircleVaOC9Bg$default(drawScope, j3, drawScope.mo710toPx0680j_4(f2) / 2.0f, j2, 0.0f, null, null, 0, 120, null);
    }

    /* JADX INFO: renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2515getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* JADX INFO: renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m2514getTickSizeD9Ej5fM() {
        return TickSize;
    }
}
