package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: HandwritingGesture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĹ\u0014D57\u001eq\u007fR܀kt\nA\u000e0\u00194Jչ*,(w\u000f߿r9FDmHDR[*\u001dk\u00044*[,qY;]ڼ\u0006\"\u001fOVʴonXc\u0013C\u0015\b\u001exx8QU~]\u001a\u000fHBw?9Nw=O`|6\u000b :\"Ny\r\u0001 +P\u0010\rzKK\"\u00128ϋx:h\rUĨ\"\u0012\u001c>(\u0001$aoNLHt]@0+\u0003\u007fBVϋg0\u0013M\u0015Ͽ\\'#viӜ3@M5\u001dǬ[\u0003\u001dRc?\t@y=\u001bh/ݐ3I\nW>X\u0006\u0016\u001d+e\rer,]\u000bū`\"ʬ[O\u0012J\u0011\u0013.wߡ\u007f\rJ\u0004V(5IF-Hh8\u0012Aw\u000bSnT2nP\u0005\u0013mF\u00195\u007fa2I\u001dvQ\u0010CGT}|MI,,\u0019nOc\u0005\u0012n\u001f3T&\\aUNI`N8fmq\u0012~z\u0002X\u0013`W\u000e4\u0014\u001d>\u001957\n@3#{\u0002vL\u0016|KaŞR֟ʐLB(~$Hr3\u001al\\d3s\u0001Xf?)MJV7\u0002\u0016\u001f8\\&PQ5\u001eSgtyl]]8,?hGY\u001ds<]\u007f_{k_x(a\u0001~DCJl\u001dX\u0015M\u0004\u0012hr@$HG\u0019'(\fRS$\u001fBA\u0002\u001cb3A\u001bl\u0015v\u000bLH\b}ɺ^ʳӳ\u0014\u0001ZK2\u001c26\u0003#\u0019P\u000br\u0018g'd\\\u0001n%EA\u007f9_'\u001eFvP\u0015#5\u0007\u001c\u007fu\u0003|KZv.u\u0004\u0007P\u001a(Vi/k1U~ɴ1ĈβINx\u0005_mZU\t\u001e\u0012\u000fijVg6\r!0nmbO\u0003:Rzl~;\b\u0013\r*qT\u007f_od\rk>wy\u0013[LNf\u00053%d&I\n0\u001eM-q)E\u0016&/_\u0019o`\u0002o\\\u001d\u0013\u00134\u0019}\u0004Z\t\\p+\u007fkXS8w['>PF\u001d\u0007PK\u0003w6i98\u001b?`A\u0013}\u0007H[\u0010G\nv\t<\r\u001f]k<#o,<\\ept\f\u0018\"\u0005[%?O{g\u001c\t{`\u0019M'\n9#ar @U \u0005|)\nx*\u0002@NAij-<7?d0J1#C\u0003t6\u0014\t\u000e^_=&xCȶ:ٙոXzb\u0001V0)\u0005nMB\u0001-\u0011[\u001e'Wa\t{Il/\u001261Y+63le}\u0015<[Jbg3*n\u007f9t\u000eSW\u0007N\u0010W+}k\u001e\u0013H\u001a\r\u001dp I?\u0018\u0010چz0d;\u001e\u000e\\\u0011\u000f\u0012\u0015Tv\"W\u001a+\u0001\u001cm\"\u000f9\u001d\u007fv}\u0007EL|\u001dgI(//F?\u0006:,*Eɴ1\u0006;]\u0006yxF?{\u0006Uc}6BP+\u0012w9\\\u0006A\u0017\u0010kIR\u0018\b\u0015\u001119#^%\u001c:Zv\u0003\n\\\u000fFQ\u001230\u001b\r_2xid5]\u0005\u0006pM\u0011x8~\u001dg|X#\u0003\u0015d\u0007}|Qh\u001d7L}4!\u0007r<'RN\bW\u0001\\M4SN\b\u0011+8O\u0012\u000b!o]^%+]!Ze?<j\u001e,,*{\u0012Xl*+:\u0005|nt\u0017a\u0005Ng\u0010njVk\u0005\u000e9\u0014+\u0007vdW\u0014|j\u0001R|/e\u001bG[;b\u0011\u000b\u0012Ha&Of\u0003C)[J\u000b\u001eM'\u0017\u0011hzv\u0016)p89\u00010d;|l=H)\u0002$\u001c\u00073*YHPB6cA\u0012\u001f;r8NK\r *ii5W\u0018?0EH\u0014t\u001f%ElaSS1\u0011~\u0011\rm\u0002_q\u0001t\u007f\u00171e'oIY\u000f;SP\u0016P5\u000f\u001aex6}gd3y,wZu$\b\u0004X\u0002 \u001eRSLvk0Si`*\u000e^hV\"y4*89\u0007DQ\u0001\u001d~\u0002 Dk.r\u0013r\u0012DO\u007f,%T@:-\u001b\u000eUOxy9L;KZ8W 7k/|>Q\u001a@Yd#Q=_u<A-4>@\u0006Nyue +N] \u000f{j\u0019oy_>ZB\u0011\u001b\u0007\u00101\u0001\u001c0f+.?M\rEds)]Og#L\u001f&n.p\u0013\u001b\b&.v\u001f0\u0004\u0011a]-A\u0002\fAu\u0014~{O8A_3\t=g\u0019\u0003oY\u007f|U9a04K!Qs\u0019\u001dUOS\r+C\"\u001b/<Jn>HM\t\f\u001cr|J&C'[nnxJ>\r\u0017Zqe)\u001cMX\u0006\u0019s\u0002Jbe~\u0015\u00159[on\u0001zi.A\u001e\u0011MY\u0019A\u0013FSgTSw\u001b4V{6\u0004y[\u000b\u001ba\u0012\u0019`x8u\u0007\bIO\t\u0005V\u0014GAWm\u001a<$5'\u001e\u0013R\n\u0018\u0017w2:_1q|WqsY\u0018)fpy7z#.^\u0010FX\u001e=4P\u0013\"ChwBB-\u001f wUx<Bg\u0006e#\u001b\u0014Dαy\u0019Ds::q\u000ew\u0014\u001d`\u0005Xl2\b*ND\u001a\u001aKe\u0012\u007fVMH\u0017\u0004\t\u001ep\u0002\u0015x\u0013o3\u001aq+xܛjdD&\u0007XV01f}\u0006CQr\u00059d~KY\u0010\u0011&\\-Du\u0003\u001b\u0017\u007fyx]\u0015\u007f^\u0005f\u007f3h*\n\"\u0002xUKX\t&j\u00101E\u007fkWN\r\u001eQC\u0016MZt7\u001cl3UX\u0004\u001aQbJhC4-\tb\u001en\u0016W&\u000e\u0013\u0004Z\u0006\u001aS\u001a\u0010-7|~Q&BA\u0006Tw%!\u00061<6m}\\\t\u0013p\\SSB\u0007g)PAMlo:$3\u0006s\u00165¯\u001d(ָhʰߠ\u0011m\u0018Kq\u0013вOrj\u0014cĘi&\u0006a<_`ӱ\u000ek"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PF(Wu9TP]0eTT=\"!j\u001bN\u0007\u0018\t'\u0010y", "", "u(E", "4`[9U(<Y\u0003\ba^.x\u0007CT\u007f;\u000b!\u0005\u0017\u001eF", "", "5dbAh9>", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9p8\u007f$Gf\u0002/;v\u0018\u0010MQJ{A\u001ej", "3cXA66F[\u0015\by<6\u0006\u0017?m\u007f5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "", ">da3b9F2\u0019\u0006zm0\u0007\u0012\u0019nf(}<~+\u0006G\u0003\u001d\u001dz%<X", "@`]4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "/cYBf;+O\"\u0001z", "", ">da3b9F2\u0019\u0006zm0\u0007\u0012\u0019nf(}<~+\u0006G\u0003\u001d\u001dz%<XE1\u001cPf\rM'", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s\nOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tK\u001d", ">da3b9F7\"\rzk;\u0001\u00138O\t\u000f{B|\u0015+6o!KW)5`|", "=eU@X;", "", ">da3b9FA\u0019\u0006z\\;\u0001\u00138O\t\u000f{B|\u0015+6o!KW)5`|", "BdgAF,ES\u0017\u000e~h5d\u00058a\u0002(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHgg,Uu\u0015GSN*kV|F{\u000ec\nP+\u001aZ", ">da3b9FA\u0019\u0006z\\;\u0001\u00138O\t\u000f{B|\u0015+6o!KW)5`|g\nn\u00173\u001e\u000e'", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2P9\u001ar\rRv.F:N3\\P\u0002A\u001e\u001bB\nW'\u000f\u0005f\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb+O\u000b2", "4`[9U(<Y", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "6hV5_0@V(kvg.|", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-wlc<\u000eg.Q\u0006\u0016[WN\u0002", "6hV5_0@V(kvg.|P\"Jl\b\u0011\u001e`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0004ko:", ">da3b9F2\u0019\u0006zm,^\t=t\u00105{", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9l<}%DY_ E|&;M\u0019", ":`h<h;,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", ">da3b9F2\u0019\u0006zm,i\u00058g\u007f\n{N\u0010'$G", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9l<}%DYj\u001c@o\u0016\u0010MQJ{A\u001ej", ">da3b9F2\u0019\u0006zm0\u0007\u0012", "@`]4X\u0010GB&z\u0004l-\u0007\u00167e~\u0017{S\u0010", ">da3b9F2\u0019\u0006zm0\u0007\u0012vS|oX>M~", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0004|o:", ">da3b9F6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G", "BdgA90>Z\u0018lze,z\u00183o\t\u0010wI|\u0019\u0017T", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", ">da3b9F6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "6`]1j9Bb\u001d\b|@,\u000b\u0018?r\u007f", ">da3b9F7\"\rzk;^\t=t\u00105{", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u0005%Bh_ E|&;M\u0019", ">da3b9F8#\u0003\u0004H9j\u00146i\u000f\n{N\u0010'$G", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9rFz.\u001ffk+>q%\u0010MQJ{A\u001ej", ">da3b9F@\u0019\u0007\u0005o,j\u0014+c\u007f\n{N\u0010'$G", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9z<~/FYk+3k\u0016\u0010MQJ{A\u001ej", ">da3b9FA\u0019\u0006z\\;^\t=t\u00105{", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9{<}%3h_ E|&;M\u0019", ">da3b9FA\u0019\u0006z\\;i\u00058g\u007f\n{N\u0010'$G", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9{<}%3hj\u001c@o\u0016\u0010MQJ{A\u001ej", ">qTC\\,P2\u0019\u0006zm,^\t=t\u00105{", ">qTC\\,P2\u0019\u0006zm,i\u00058g\u007f\n{N\u0010'$G", ">qTC\\,P6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9xIv69Y\u0010\u001c4t\u0016\u0011IL:}A\"$lj;hc:]\u00074G\"", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", ">qTC\\,P6\u0015\byp9\u0001\u00183n\u0002\n{N\u0010'$G.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", ">qTC\\,PA\u0019\u0006z\\;^\t=t\u00105{", ">qTC\\,PA\u0019\u0006z\\;i\u00058g\u007f\n{N\u0010'$G", "BnC2k; `\u0015\b\u000be(\n\r>y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0017fy)Gt\u0012;QROA", "BnC2k; `\u0015\b\u000be(\n\r>yG\u0011kR\u0014\u0017\u0019'", "uH\u0018\u0016", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HandwritingGestureApi34 {
    public static final int $stable = 0;
    public static final HandwritingGestureApi34 INSTANCE = new HandwritingGestureApi34();

    private HandwritingGestureApi34() {
    }

    public final int performHandwritingGesture$foundation_release(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        if (handwritingGesture instanceof SelectGesture) {
            return performSelectGesture(transformedTextFieldState, (SelectGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof DeleteGesture) {
            return performDeleteGesture(transformedTextFieldState, (DeleteGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof SelectRangeGesture) {
            return performSelectRangeGesture(transformedTextFieldState, (SelectRangeGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof DeleteRangeGesture) {
            return performDeleteRangeGesture(transformedTextFieldState, (DeleteRangeGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof JoinOrSplitGesture) {
            return performJoinOrSplitGesture(transformedTextFieldState, (JoinOrSplitGesture) handwritingGesture, textLayoutState, viewConfiguration);
        }
        if (handwritingGesture instanceof InsertGesture) {
            return performInsertGesture(transformedTextFieldState, (InsertGesture) handwritingGesture, textLayoutState, viewConfiguration);
        }
        if (handwritingGesture instanceof RemoveSpaceGesture) {
            return performRemoveSpaceGesture(transformedTextFieldState, (RemoveSpaceGesture) handwritingGesture, textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(final TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        if (previewableHandwritingGesture instanceof SelectGesture) {
            previewSelectGesture(transformedTextFieldState, (SelectGesture) previewableHandwritingGesture, textLayoutState);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            previewDeleteGesture(transformedTextFieldState, (DeleteGesture) previewableHandwritingGesture, textLayoutState);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            previewSelectRangeGesture(transformedTextFieldState, (SelectRangeGesture) previewableHandwritingGesture, textLayoutState);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            previewDeleteRangeGesture(transformedTextFieldState, (DeleteRangeGesture) previewableHandwritingGesture, textLayoutState);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1(transformedTextFieldState);
            }
        });
        return true;
    }

    private final int performSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        long jM1508getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1508getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1490toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6117getCollapsedimpl(jM1508getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, selectGesture);
        }
        transformedTextFieldState.m1571selectCharsIn5zctL8(jM1508getRangeForScreenRectOH9lIzo);
        return 1;
    }

    private final void previewSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        m1486highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m1508getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1490toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m1459getHandwritingSelectPreviewsxJuwY());
    }

    private final int performDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        int iM1490toTextGranularityNUwxegE = m1490toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM1508getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1508getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM1490toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6117getCollapsedimpl(jM1508getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, deleteGesture);
        }
        m1487performDeletionSbBc2M(transformedTextFieldState, jM1508getRangeForScreenRectOH9lIzo, TextGranularity.m6083equalsimpl0(iM1490toTextGranularityNUwxegE, TextGranularity.Companion.m6088getWordDRrd7Zo()));
        return 1;
    }

    private final void previewDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        m1486highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m1508getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m1490toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m1458getHandwritingDeletePreviewsxJuwY());
    }

    private final int performSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        long jM1510getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1510getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1490toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6117getCollapsedimpl(jM1510getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, selectRangeGesture);
        }
        transformedTextFieldState.m1571selectCharsIn5zctL8(jM1510getRangeForScreenRectsO048IG0);
        return 1;
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        m1486highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m1510getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1490toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m1459getHandwritingSelectPreviewsxJuwY());
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int iM1490toTextGranularityNUwxegE = m1490toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM1510getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1510getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM1490toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6117getCollapsedimpl(jM1510getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, deleteRangeGesture);
        }
        m1487performDeletionSbBc2M(transformedTextFieldState, jM1510getRangeForScreenRectsO048IG0, TextGranularity.m6083equalsimpl0(iM1490toTextGranularityNUwxegE, TextGranularity.Companion.m6088getWordDRrd7Zo()));
        return 1;
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        m1486highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m1510getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m1490toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m1458getHandwritingDeletePreviewsxJuwY());
    }

    private final int performJoinOrSplitGesture(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        TextLayoutResult layoutResult;
        if (transformedTextFieldState.getOutputText() != transformedTextFieldState.getUntransformedText()) {
            return 3;
        }
        int iM1503getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1503getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (iM1503getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = textLayoutState.getLayoutResult()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(layoutResult, iM1503getOffsetForHandwritingGestured4ec7I))) {
            long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(transformedTextFieldState.getVisualText(), iM1503getOffsetForHandwritingGestured4ec7I);
            if (TextRange.m6117getCollapsedimpl(jRangeOfWhitespaces)) {
                TransformedTextFieldState.m1564replaceTextM8tDOmk$default(transformedTextFieldState, Global.BLANK, jRangeOfWhitespaces, null, false, 12, null);
            } else {
                m1487performDeletionSbBc2M(transformedTextFieldState, jRangeOfWhitespaces, false);
            }
            return 1;
        }
        return fallback(transformedTextFieldState, joinOrSplitGesture);
    }

    private final int performInsertGesture(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        int iM1503getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1503getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iM1503getOffsetForHandwritingGestured4ec7I == -1) {
            return fallback(transformedTextFieldState, insertGesture);
        }
        TransformedTextFieldState.m1564replaceTextM8tDOmk$default(transformedTextFieldState, insertGesture.getTextToInsert(), TextRangeKt.TextRange(iM1503getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
        return 1;
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        long jM1505getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m1505getRangeForRemoveSpaceGesture5iVPX68(textLayoutState.getLayoutResult(), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m6117getCollapsedimpl(jM1505getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallback(transformedTextFieldState, removeSpaceGesture);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String strReplace = new Regex("\\s+").replace(TextRangeKt.m6130substringFDrldGo(transformedTextFieldState.getVisualText(), jM1505getRangeForRemoveSpaceGesture5iVPX68), new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(MatchResult matchResult) {
                if (intRef.element == -1) {
                    intRef.element = matchResult.getRange().getFirst();
                }
                intRef2.element = matchResult.getRange().getLast() + 1;
                return "";
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return fallback(transformedTextFieldState, removeSpaceGesture);
        }
        long jTextRange = TextRangeKt.TextRange(TextRange.m6123getStartimpl(jM1505getRangeForRemoveSpaceGesture5iVPX68) + intRef.element, TextRange.m6123getStartimpl(jM1505getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element);
        String strSubstring = strReplace.substring(intRef.element, strReplace.length() - (TextRange.m6119getLengthimpl(jM1505getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        TransformedTextFieldState.m1564replaceTextM8tDOmk$default(transformedTextFieldState, strSubstring, jTextRange, null, false, 12, null);
        return 1;
    }

    /* JADX INFO: renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m1487performDeletionSbBc2M(TransformedTextFieldState transformedTextFieldState, long j2, boolean z2) {
        long jM1499adjustHandwritingDeleteGestureRange72CqOWE = j2;
        if (z2) {
            jM1499adjustHandwritingDeleteGestureRange72CqOWE = HandwritingGesture_androidKt.m1499adjustHandwritingDeleteGestureRange72CqOWE(jM1499adjustHandwritingDeleteGestureRange72CqOWE, transformedTextFieldState.getVisualText());
        }
        TransformedTextFieldState.m1564replaceTextM8tDOmk$default(transformedTextFieldState, "", jM1499adjustHandwritingDeleteGestureRange72CqOWE, null, false, 12, null);
    }

    /* JADX INFO: renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m1486highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j2, int i2) {
        if (TextRange.m6117getCollapsedimpl(j2)) {
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
            textFieldState.getMainBuffer$foundation_release().clearHighlight();
            textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
            return;
        }
        transformedTextFieldState.m1565highlightCharsIn7RAjNK8(i2, j2);
    }

    public final int performHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            return performSelectGesture(legacyTextFieldState, (SelectGesture) handwritingGesture, textFieldSelectionManager, function1);
        }
        if (handwritingGesture instanceof DeleteGesture) {
            return performDeleteGesture(legacyTextFieldState, (DeleteGesture) handwritingGesture, untransformedText, function1);
        }
        if (handwritingGesture instanceof SelectRangeGesture) {
            return performSelectRangeGesture(legacyTextFieldState, (SelectRangeGesture) handwritingGesture, textFieldSelectionManager, function1);
        }
        if (handwritingGesture instanceof DeleteRangeGesture) {
            return performDeleteRangeGesture(legacyTextFieldState, (DeleteRangeGesture) handwritingGesture, untransformedText, function1);
        }
        if (handwritingGesture instanceof JoinOrSplitGesture) {
            return performJoinOrSplitGesture(legacyTextFieldState, (JoinOrSplitGesture) handwritingGesture, untransformedText, viewConfiguration, function1);
        }
        if (handwritingGesture instanceof InsertGesture) {
            return performInsertGesture(legacyTextFieldState, (InsertGesture) handwritingGesture, viewConfiguration, function1);
        }
        if (handwritingGesture instanceof RemoveSpaceGesture) {
            return performRemoveSpaceGesture(legacyTextFieldState, (RemoveSpaceGesture) handwritingGesture, untransformedText, viewConfiguration, function1);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (previewableHandwritingGesture instanceof SelectGesture) {
            previewSelectGesture(legacyTextFieldState, (SelectGesture) previewableHandwritingGesture, textFieldSelectionManager);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            previewDeleteGesture(legacyTextFieldState, (DeleteGesture) previewableHandwritingGesture, textFieldSelectionManager);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            previewSelectRangeGesture(legacyTextFieldState, (SelectRangeGesture) previewableHandwritingGesture, textFieldSelectionManager);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, (DeleteRangeGesture) previewableHandwritingGesture, textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$9(textFieldSelectionManager);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$9(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation_release();
        }
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long jM1507getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1507getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1490toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6117getCollapsedimpl(jM1507getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(selectGesture, function1);
        }
        m1489performSelectionOnLegacyTextField8ffj60Q(jM1507getRangeForScreenRectOH9lIzo, textFieldSelectionManager, function1);
        return 1;
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m1742setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m1507getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1490toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        int iM1490toTextGranularityNUwxegE = m1490toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM1507getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1507getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM1490toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6117getCollapsedimpl(jM1507getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(deleteGesture, function1);
        }
        m1488performDeletionOnLegacyTextFieldvJH6DeI(jM1507getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m6083equalsimpl0(iM1490toTextGranularityNUwxegE, TextGranularity.Companion.m6088getWordDRrd7Zo()), function1);
        return 1;
    }

    private final void previewDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m1741setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m1507getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m1490toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long jM1509getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1509getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1490toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6117getCollapsedimpl(jM1509getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(selectRangeGesture, function1);
        }
        m1489performSelectionOnLegacyTextField8ffj60Q(jM1509getRangeForScreenRectsO048IG0, textFieldSelectionManager, function1);
        return 1;
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m1742setSelectionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m1509getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1490toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        int iM1490toTextGranularityNUwxegE = m1490toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM1509getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1509getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM1490toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m6117getCollapsedimpl(jM1509getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(deleteRangeGesture, function1);
        }
        m1488performDeletionOnLegacyTextFieldvJH6DeI(jM1509getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m6083equalsimpl0(iM1490toTextGranularityNUwxegE, TextGranularity.Companion.m6088getWordDRrd7Zo()), function1);
        return 1;
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m1741setDeletionPreviewHighlight5zctL8$foundation_release(HandwritingGesture_androidKt.m1509getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m1490toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final int performJoinOrSplitGesture(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM1502getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1502getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
            if (iM1502getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM1502getOffsetForHandwritingGestured4ec7I))) {
                long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(annotatedString, iM1502getOffsetForHandwritingGestured4ec7I);
                if (TextRange.m6117getCollapsedimpl(jRangeOfWhitespaces)) {
                    performInsertionOnLegacyTextField(TextRange.m6123getStartimpl(jRangeOfWhitespaces), Global.BLANK, function1);
                } else {
                    m1488performDeletionOnLegacyTextFieldvJH6DeI(jRangeOfWhitespaces, annotatedString, false, function1);
                }
                return 1;
            }
            return fallbackOnLegacyTextField(joinOrSplitGesture, function1);
        }
        return fallbackOnLegacyTextField(joinOrSplitGesture, function1);
    }

    private final int performInsertGesture(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM1502getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1502getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
            if (iM1502getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = legacyTextFieldState.getLayoutResult()) != null && (value = layoutResult.getValue()) != null && HandwritingGesture_androidKt.isBiDiBoundary(value, iM1502getOffsetForHandwritingGestured4ec7I))) {
                return fallbackOnLegacyTextField(insertGesture, function1);
            }
            performInsertionOnLegacyTextField(iM1502getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), function1);
            return 1;
        }
        return fallbackOnLegacyTextField(insertGesture, function1);
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        long jM1505getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m1505getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m6117getCollapsedimpl(jM1505getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(removeSpaceGesture, function1);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String strReplace = new Regex("\\s+").replace(TextRangeKt.m6130substringFDrldGo(annotatedString, jM1505getRangeForRemoveSpaceGesture5iVPX68), new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(MatchResult matchResult) {
                if (intRef.element == -1) {
                    intRef.element = matchResult.getRange().getFirst();
                }
                intRef2.element = matchResult.getRange().getLast() + 1;
                return "";
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return fallbackOnLegacyTextField(removeSpaceGesture, function1);
        }
        int iM6123getStartimpl = TextRange.m6123getStartimpl(jM1505getRangeForRemoveSpaceGesture5iVPX68) + intRef.element;
        int iM6123getStartimpl2 = TextRange.m6123getStartimpl(jM1505getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element;
        String strSubstring = strReplace.substring(intRef.element, strReplace.length() - (TextRange.m6119getLengthimpl(jM1505getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        function1.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(iM6123getStartimpl, iM6123getStartimpl2), new CommitTextCommand(strSubstring, 1)));
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int i2, String str, Function1<? super EditCommand, Unit> function1) {
        function1.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(i2, i2), new CommitTextCommand(str, 1)));
    }

    /* JADX INFO: renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m1489performSelectionOnLegacyTextField8ffj60Q(long j2, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        function1.invoke(new SetSelectionCommand(TextRange.m6123getStartimpl(j2), TextRange.m6118getEndimpl(j2)));
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.enterSelectionMode$foundation_release(true);
        }
    }

    /* JADX INFO: renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m1488performDeletionOnLegacyTextFieldvJH6DeI(long j2, AnnotatedString annotatedString, boolean z2, Function1<? super EditCommand, Unit> function1) {
        if (z2) {
            j2 = HandwritingGesture_androidKt.m1499adjustHandwritingDeleteGestureRange72CqOWE(j2, annotatedString);
        }
        function1.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m6118getEndimpl(j2), TextRange.m6118getEndimpl(j2)), new DeleteSurroundingTextCommand(TextRange.m6119getLengthimpl(j2), 0)));
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture handwritingGesture, Function1<? super EditCommand, Unit> function1) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        function1.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m1490toTextGranularityNUwxegE(int i2) {
        if (i2 == 1) {
            return TextGranularity.Companion.m6088getWordDRrd7Zo();
        }
        if (i2 == 2) {
            return TextGranularity.Companion.m6087getCharacterDRrd7Zo();
        }
        return TextGranularity.Companion.m6087getCharacterDRrd7Zo();
    }

    private final int fallback(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer$foundation_release().clearHighlight();
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, fallbackText, true, null, 4, null);
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$1(TransformedTextFieldState transformedTextFieldState) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer$foundation_release().clearHighlight();
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }
}
