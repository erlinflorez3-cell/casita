package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŗ\u0014D߬)\u001ew\tLDyt\fA\f1\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6RY+\u0017k\n4,[*qK;c8\u0006\"\u001fOVʴon`Z\u0013C\u001d\f\u001exp,QU\u0007b\u001a\u000f8Ew?IMw=?a|6\u001b :Ĳ@y\u001b\u0001\"*N\u0014~zYK\u0014\u00126Ax:h\rU\u0005 \u0015\u000e>6\u0001&\\mO>H\u0003]B/9\u0003qBd'g0\u0013M\u0015Fj'\u0015vw\u001e3@=5\u001d%a\u000f\u000fRaC\u000b?\b=\rh-)3I\nW>X\u0006\u0016\u001d+e\rer,\\\rQv\f/+UcSP\u001cߊ\u007fz\u0002\u0010D\u0004$\u0006/H4-\"f\u001e\u000e;ο\u000buNS\u001a`X~)ef\u001b3\u0005K+g!\u0017UoB1Ne\u0004K\r\u038d\"Чͼ%]Z\u0017n\u001f3\u0019\u0006\\IQnIxT\u0018fUo\u001ao\u0011\u0002Z\u0014>U\u0018;\f\u0019>\u001d59k9Q!\u001a\u0012vS\u0018\u0013\u0013q\u0001kyTX@Pn&9:\t:mTf\u0015k~gh.!MJ`5\u0010Nʶ8j\u0006P9%>M\u007flwqe]8-ufO\u0002|\u0001&Wgtc9_z(a\u0001|DCJz\u001dX\u0015X\u0004\u0010hc@\"`P1\u0010ɧzͩ«\u0010\u00158X\u007f6L6?4t\u0015v\u0002FBo\u0019O_r|\u001e\u001cl3R\u0003\u0012&\u000b\b/P\rt}\u0006\u0011IZ|'\"Em_T1&\u0004.\u00114+C7\u0003\u0002!_gzi|p$\u0019m{N)J=_SU\u0013=\u0012oɅƁ,զʆvgWr M\u0013)\b6Sh\\s0j\u001fL\u0011pXwl\u00198u\r\u001cS\fr#\u0012at\u000ewgb/s>w\u0006IYÚM˻٫\t\u001f$O\u0019\u001c0(M-q3E\u0016&4_\u001bo\n\u0002qDx\u0011<Vxs2DcD\u0006\u0013UkUS8wl/B0H\u0005\u0003p[1w n\u0017c%3vM\rp\u0005X}\u000f=\u001f~\u0007Z/!Zi]+o,G^c8\u0018[}Bq\nљ߇LωܭqoQ\r\u0019p'.\u0019-In@(e \u0005w\u0013\u000f>8\f\u001aL@i\u00165@\u0017GL,j\u001b;Gb\u000e\u001e\u0010)\u0013\r_'e@v\f;\u0005\u001a|x\u000bvx\tnzx!X\u001d/\u001fA,\u0011AA\r}Ld1s2/SK\u0019Iy\u007f#t[Cdd=+*n\u007f9}mEY\u0002d=W+}k\u001eFH\u001a\r\u001dpS+;a\u0011\u000e3^\u0016QU|rr4*f\u0001ZJ)-\u001b-\u0014JH'\r/N!/\u00131Zq\u00107q-1\u001bRM\u001f\f+v\r\u001bE:CmUI\u0019 O{\u0006sk\u0002\u0016a8'2zQ`e\u0015~\n\f#j\u001a\u007f9z\u00027&\u0001$\u0012Rbt!\u001dtú̿N\u05ceג\u0006\u0015d\u001cy;9d5o\u0005\u0006pW\u0011x8\u0004\u001di|\u001b#\u0005|0\u0005@\u001f1^@!'{AC\\h^)SNkW\u007f,A4fN\b\u001158O\u0012\t!o]r%+]qZe?Hj\u001e,5*y\u00121l(CC\u001dצͷcӷЁpD]Vl4@\u0019\u0003SA\u0014+\u000bp^?3dJ\u00015|/e\u001fO_\u001b_x\u00072[y*/8j?I?b\u000f}r\u000f\u00111\u0006)ߍ̍)Х֟v\u0002mx;\u0014la(uq$\u001cp+&yehH\u0016{)\u0010'.\t\tPBj=4;\u007fFq\u001d\u001f%-84\u0003MؒM\u000f_%=*/\t)\rm\u001aaqHFOt9.=CK[t^=5\u0014_W\u0010\u0010\nb~{v\u001d\u000fyNW\n]\u001e(ah\u007f8?T(\u0014K;\u007fs\bx.m\u007fXV\"j4*8Z\u0007DQZ3ԭ\f*:A0s\u0013g\n4o\u001bD#R\u0017B3|\tUM\u0017y9T=I\">'\u0006W;]|(&\u007f\u001aCI!YW\\\f\\Cw\u0012oJad\u0016wPg8\u001e9\"\\spzoa_>8@\u001d;\u0013(5`g\u0018`K Wo\u0005|N|\tQQd!?=\\n0R\f9?&0X\u001708Zb%\u0013a\u0003\u0004CW\u0012\u00058OTW\u0603=*3B\u0003Gma\u001aXkYc\u0011{&p7{[32QOrN-\u007f\u0019>^Kdb2*\u0007\u0019TȊ|l\u001e\"\u0011DVyX0^p/`Q<\u0019\u001e5<\u0004t\u0016\u0003@zO[\u0013'[;eujUQ5?ߏ#&OÈ+\u000bLRa2QsCq\u0015ϓ\nׂMY\u0015oO\u0011\u0011cı!4\u000eB5Ϸg\u001bU͗Cy"}, d2 = {"<dT1f\u0013>b(~\bL7x\u00073n\u0002\u0016\u0007<\n", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", "5dc\u001bX,=a\u007f~\nm,\nv:a},\u0005Bn\"\u0013P", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W*\u0002!>G\r4>mkqB", "1qT.g,%S(\u000ezk\u001a\b\u0005-i\t*iK| ", "\u001a`]1e6BRb\u000ezq;F\u0017>y\u0007(E(\u0001&$Kmi=w%3h\u0002)9[!*V\u0019", ":dcAX9,^\u0015|~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1qT.g,%S(\u000ezk\u001a\b\u0005-i\t*iK| ^GK\u000f6T\u000e!", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KCY\u0015IL:x>\"\u00142p9\u001aru\\\u0006;NL\u0018\u0014\\a\u007fA\u0012m[\u000fN)\u001c\tbC\u0012y@@t", "4kPAg,G4#\b\nL;\u0011\u0010/s[1z\u001c\f\"\u001e[", "", "1n]AX?M4#\b\nL7x\u0012\u001dt\u0014/{", "AoP;F;RZ\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "7r=<a\u0013B\\\u0019z\b?6\u0006\u0018\u001dc{/\u007fI\u0003r\u0015Vs\u001f<", "@db<_=>:\u001d\bzA,\u0001\u000b2tc1fS", "", ":h]2;,BU\u001c\u000e", "1n]AX?M4#\b\nL0\u0012\t", "@db<_=>:\u001d\bzA,\u0001\u000b2tc1fSH!c3R_DZ", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Wx\u0012K@\u00045b\f$F\u0002kq.", "6`b\u0013b5M/(\u000e\bb)\r\u0018/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", ";da4X", "AoP;F;RZ\u0019", "Adc\u000fT*DU&\t\u000bg+", "\u001a`]1e6BRb\u000ezq;Fv:a\t1w=\b\u0017l", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "AsP?g", "3mS", "Adc\u000fT*DU&\t\u000bg+Du\u001ams\b\u0002F", "uKP;W9HW\u0018H\n^?\fR\u001dp{1\u0005<}\u001e\u0017\u001dTq :\u0016", "Adc\u000fT:>Z\u001d\bzL/\u0001\n>", "0`b2_0GS\u0007\u0002~_;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "Adc\u000fT:>Z\u001d\bzL/\u0001\n>-J2y.\u0003 ~", "Adc\u000fe<LV", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "Adc\u0010b3H`", "Adc\u0010b3H``kef \\\u000f5", "Adc\u0011e(PA(\u0013\u0002^", "2qPDF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003wu@\u00079", "Adc\u0013b5M/(\u000e\bb)\r\u0018/s", "1n]AX?MB\u0019\u0012\nL;\u0011\u0010/", "@db<_=>B-\nz_(z\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "Adc\u0013b5M4\u0019z\nn9|v/t\u000f,\u0005B\u000f", "4n]A9,:b)\fzL,\f\u00183n\u00026", "", "Adc\u0013b5MA\u001d\u0014z", "4n]AF0SS", "Adc\u0013b5MA\u001d\u0014z&\u0012\u0005u\u00114^\b", "uKP;W9HW\u0018H\n^?\fR\u001dp{1\u0005<}\u001e\u0017\u001dTt8\u007f$Bc\u0002\u001fJ7\u00148UNEy4g%l+I\u0010g;\u0018U'PZR;p(V!W\u0003", "Adc\u0014X6FS(\f~\\\u001b\n\u00058s\u00012\tH", "BdgA:,H[\u0019\u000e\bb*k\u0016+n\u000e)\u0006M\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|w.WK;zA\"\u0013Wn5\u0010q-X\u0004/\u001d", "Adc\u0019\\5>6\u0019\u0003|a;", "Adc\u0019\\5>6\u0019\u0003|a;D\u0016\u0003B{\u000efB", "uKP;W9HW\u0018H\n^?\fR\u001dp{1\u0005<}\u001e\u0017\u001dTn#r.4f\b$6\u0001_,WKFuB\u001e^xe\u0003\u0017l0]@\u0006GU\\0kfH\u0001\u0005", ":h]2;,BU\u001c\u000ehm@\u0004\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oa\u000f", "Adc\u0019\\5>6\u0019\u0003|a;Dn7RavZ ", "uKP;W9HW\u0018H\n^?\fR\u001dp{1\u0005<}\u001e\u0017\u001dTn#r.4f\b$6\u0001_,WKFuB\u001e^xe\u0003\u0017l0]@\u0006GU\\0kfH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buY\u0006\u0005w\u0001\u001f%WCy\u0005IVY.}\u001eu$)lH\\ngVULb\u007f(|", "Adc\u0019b*:Z\u0019e~l;", ":nR._,%W'\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u0006,~@\b\u001e3t\u0016\u0015QQJA", "Adc [(=]+", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "Adc c(G", "AoP;", "", "Adc c(GA(\u0013\u0002^", "AoP;F;RZ\u0019kvg.|", "Adc c(GA(\u0013\u0002^:", "Adc!X?M2\u0019|\u0005k(\f\r9n", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "Adc!X?M7\"}zg;", "BdgA<5=S\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|y7LCDz\n", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SpannableExtensions_androidKt {
    public static final void setSpan(Spannable spannable, Object obj, int i2, int i3) {
        spannable.setSpan(obj, i2, i3, 33);
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f2, Density density) {
        float fM6831getValueimpl;
        if (textIndent != null) {
            if ((!TextUnit.m6828equalsimpl0(textIndent.m6551getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) || !TextUnit.m6828equalsimpl0(textIndent.m6552getRestLineXSAIIZE(), TextUnitKt.getSp(0))) && !TextUnitKt.m6849isUnspecifiedR2X_6o(textIndent.m6551getFirstLineXSAIIZE()) && !TextUnitKt.m6849isUnspecifiedR2X_6o(textIndent.m6552getRestLineXSAIIZE())) {
                long jM6830getTypeUIouoOA = TextUnit.m6830getTypeUIouoOA(textIndent.m6551getFirstLineXSAIIZE());
                float fM6831getValueimpl2 = 0.0f;
                if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6864getSpUIouoOA())) {
                    fM6831getValueimpl = density.mo709toPxR2X_6o(textIndent.m6551getFirstLineXSAIIZE());
                } else {
                    fM6831getValueimpl = TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6863getEmUIouoOA()) ? TextUnit.m6831getValueimpl(textIndent.m6551getFirstLineXSAIIZE()) * f2 : 0.0f;
                }
                long jM6830getTypeUIouoOA2 = TextUnit.m6830getTypeUIouoOA(textIndent.m6552getRestLineXSAIIZE());
                if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA2, TextUnitType.Companion.m6864getSpUIouoOA())) {
                    fM6831getValueimpl2 = density.mo709toPxR2X_6o(textIndent.m6552getRestLineXSAIIZE());
                } else if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA2, TextUnitType.Companion.m6863getEmUIouoOA())) {
                    fM6831getValueimpl2 = TextUnit.m6831getValueimpl(textIndent.m6552getRestLineXSAIIZE()) * f2;
                }
                setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fM6831getValueimpl), (int) Math.ceil(fM6831getValueimpl2)), 0, spannable.length());
            }
        }
    }

    /* JADX INFO: renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m6404setLineHeightKmRG4DE(Spannable spannable, long j2, float f2, Density density, LineHeightStyle lineHeightStyle) {
        float fM6399resolveLineHeightInPxo2QH7mI = m6399resolveLineHeightInPxo2QH7mI(j2, f2, density);
        if (Float.isNaN(fM6399resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        Spannable spannable2 = spannable;
        setSpan(spannable, new LineHeightStyleSpan(fM6399resolveLineHeightInPxo2QH7mI, 0, (spannable2.length() == 0 || StringsKt.last(spannable2) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m6512isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m6495getTrimEVpEnUU()), LineHeightStyle.Trim.m6513isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m6495getTrimEVpEnUU()), lineHeightStyle.m6494getAlignmentPIaL0Z0()), 0, spannable.length());
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m6405setLineHeightr9BaKPg(Spannable spannable, long j2, float f2, Density density) {
        float fM6399resolveLineHeightInPxo2QH7mI = m6399resolveLineHeightInPxo2QH7mI(j2, f2, density);
        if (Float.isNaN(fM6399resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM6399resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    /* JADX INFO: renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m6399resolveLineHeightInPxo2QH7mI(long j2, float f2, Density density) {
        float fM6831getValueimpl;
        long jM6830getTypeUIouoOA = TextUnit.m6830getTypeUIouoOA(j2);
        if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6864getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo709toPxR2X_6o(j2);
            }
            fM6831getValueimpl = TextUnit.m6831getValueimpl(j2) / TextUnit.m6831getValueimpl(density.mo713toSpkPz2Gy4(f2));
        } else {
            if (!TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6863getEmUIouoOA())) {
                return Float.NaN;
            }
            fM6831getValueimpl = TextUnit.m6831getValueimpl(j2);
        }
        return fM6831getValueimpl * f2;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, Density density, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        MetricAffectingSpan metricAffectingSpanM6398createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, function4);
        int size = list.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i2);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density);
                if (getNeedsLetterSpacingSpan(range.getItem())) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnnotatedString.Range<SpanStyle> range2 = list.get(i3);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle item = range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM6398createLetterSpacingSpaneAf_CNQ = m6398createLetterSpacingSpaneAf_CNQ(item.m6077getLetterSpacingXSAIIZE(), density)) != null) {
                    setSpan(spannable, metricAffectingSpanM6398createLetterSpacingSpaneAf_CNQ, start2, end2);
                }
            }
        }
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m6401setBaselineShift0ocSgnM(spannable, item.m6072getBaselineShift5SSeXJ0(), start, end);
        m6402setColorRPmYEkk(spannable, item.m6073getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m6403setFontSizeKmRG4DE(spannable, item.m6074getFontSizeXSAIIZE(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m6400setBackgroundRPmYEkk(spannable, item.m6071getBackground0d7_KjU(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> function3) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            function3.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i2 = size * 2;
        Integer[] numArr = new Integer[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            numArr[i3] = 0;
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i4);
            numArr[i4] = Integer.valueOf(range.getStart());
            numArr[i4 + size] = Integer.valueOf(range.getEnd());
        }
        ArraysKt.sort((Object[]) numArr);
        int iIntValue = ((Number) ArraysKt.first(numArr)).intValue();
        for (int i5 = 0; i5 < i2; i5++) {
            int iIntValue2 = numArr[i5].intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i6 = 0; i6 < size3; i6++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i6);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iIntValue, iIntValue2, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    function3.invoke(spanStyleMerge, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                }
                iIntValue = iIntValue2;
            }
        }
    }

    /* JADX INFO: renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m6398createLetterSpacingSpaneAf_CNQ(long j2, Density density) {
        long jM6830getTypeUIouoOA = TextUnit.m6830getTypeUIouoOA(j2);
        if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6864getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo709toPxR2X_6o(j2));
        }
        if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6863getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m6831getValueimpl(j2));
        }
        return null;
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        return TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(spanStyle.m6077getLetterSpacingXSAIIZE()), TextUnitType.Companion.m6864getSpUIouoOA()) || TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(spanStyle.m6077getLetterSpacingXSAIIZE()), TextUnitType.Companion.m6863getEmUIouoOA());
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i2, int i3) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m4232toArgb8_81llA(shadow.m4503getColor0d7_KjU()), Offset.m3937getXimpl(shadow.m4504getOffsetF1C5BW0()), Offset.m3938getYimpl(shadow.m4504getOffsetF1C5BW0()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i2, i3);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i2, int i3) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i2, i3);
        }
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m6400setBackgroundRPmYEkk(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m4232toArgb8_81llA(j2)), i2, i3);
        }
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i2, int i3) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i2, i3);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i2, int i3) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i2, i3);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i2, i3);
        }
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i2, int i3) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i2, i3);
        }
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m6403setFontSizeKmRG4DE(Spannable spannable, long j2, Density density, int i2, int i3) {
        long jM6830getTypeUIouoOA = TextUnit.m6830getTypeUIouoOA(j2);
        if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6864getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(MathKt.roundToInt(density.mo709toPxR2X_6o(j2)), false), i2, i3);
        } else if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6863getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m6831getValueimpl(j2)), i2, i3);
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i2, int i3) {
        if (textDecoration != null) {
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(TextDecoration.Companion.getUnderline()), textDecoration.contains(TextDecoration.Companion.getLineThrough())), i2, i3);
        }
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m6402setColorRPmYEkk(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m4232toArgb8_81llA(j2)), i2, i3);
        }
    }

    /* JADX INFO: renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m6401setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i2, int i3) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m6417unboximpl()), i2, i3);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f2, int i2, int i3) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m6402setColorRPmYEkk(spannable, ((SolidColor) brush).m4513getValue0d7_KjU(), i2, i3);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f2), i2, i3);
            }
        }
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m6156getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, final Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i2);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().m6076getFontSynthesisZQGJjVo() != null) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = arrayList;
        flattenFontStylesAndApply(!hasFontAttributes(textStyle) ? null : new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m6155getFontStyle4Lr2A7w(), textStyle.m6156getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (DefaultConstructorMarker) null), arrayList2, new Function3<SpanStyle, Integer, Integer, Unit>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
                invoke(spanStyle, num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(SpanStyle spanStyle, int i3, int i4) {
                Spannable spannable2 = spannable;
                Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> function42 = function4;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                FontStyle fontStyleM6075getFontStyle4Lr2A7w = spanStyle.m6075getFontStyle4Lr2A7w();
                FontStyle fontStyleM6230boximpl = FontStyle.m6230boximpl(fontStyleM6075getFontStyle4Lr2A7w != null ? fontStyleM6075getFontStyle4Lr2A7w.m6236unboximpl() : FontStyle.Companion.m6240getNormal_LCdwA());
                FontSynthesis fontSynthesisM6076getFontSynthesisZQGJjVo = spanStyle.m6076getFontSynthesisZQGJjVo();
                spannable2.setSpan(new TypefaceSpan(function42.invoke(fontFamily, fontWeight, fontStyleM6230boximpl, FontSynthesis.m6241boximpl(fontSynthesisM6076getFontSynthesisZQGJjVo != null ? fontSynthesisM6076getFontSynthesisZQGJjVo.m6249unboximpl() : FontSynthesis.Companion.m6250getAllGVVA2EU()))), i3, i4, 33);
            }
        });
    }
}
