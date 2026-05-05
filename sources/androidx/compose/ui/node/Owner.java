package androidx.compose.ui.node;

import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: Owner.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŧ\u0015D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H\u007f*,(w\u000ffp<8D{H6RY,\u0017k\u00124,[*rK;k\u001a\u0006\"\u000fPVg}nRZ\u0011D\u0017\u0006,xr,OV\u0001](\u000f:Bu@;M\u0006=A`z7\r H\"@y\u000b\u0003\"*^\u0010~zIL\u0014\u0012F@x:X\u000eU\u00050\u0012\u000e>&\u0002&\\}N>Hr^B/1\nqBT(g0\u0013M\u0015FZ(\u0015vw\u001e3@=6\u001d%i\u0003\u000fRa@\u000b?\b=\rh-(3I\nW>X\u0006\u0015\u001d+e\rer,]\rQn\u0015/+UgSP$(\u007fz\u0002\u000eD\u0004$\u0006/H4.\"f\u001e\u000e;txTHP\u0018^J\u007f\u0001b>\u0017;\u007f;+?\u001cnQw;!N=|\r\r4#\tn'`\\\u000ev\u0015#Ƙ\u007fQGQH=^N\u0012YSm\fph\u00022\u0004FG\b\u07fc\u0004\u0011<\u0017-ڛc99!s\u0002NGov\u001b`pׅqR^@*n\u001c92\t\"ZLd\u000brXTn,\u0019M2T\u000f}\u000e\u001a(\\\u000e<)%\u0016OWhwiUΪ\u0012%Ef?Y\u0005k\u0016WGӔ;5gc\u0018aXx\u001a\u001eRϵ#וerS:Y\u0015*Ϫ1ˇiX\u0010\n<f\fA+ou*.D1GU[lԊ\u001dՓ˩\u0001\u000beUv\fGmA!\u001biRm9\u0005^Z\to\u0016q\u0010P̂_õέET;Ө%c\u001e1!\u000bȿ\u0006\u0017t.ûf|\tẐ\u0015\u000e\u0012\f5&-g֝.ˮ\u0017\u001c\u0005Ȃ1\u00125KɫquTS\u0018MϞ{\n&K}Df6ψoݽdwP֩S'*|ܭq3\u000bj\u0006 ӞE\u000bJsU9Ё=w΄\u0002\nI\\̈{\u001d'.(\u0011pPĨ4[ό&M }\u0014=֡`ul\u0006-(ʶ\u000el\u0019. :ϳ\u0015\bc\u007fϭ1k=W˃}V\"R:3INj\u0006ٶA!4;\r\u000fe-\u0011dШL#2\u0014e5Ձ\f!\\iƺ\u0012\b~bʳ^p\u0018̎|жڎG)\u0017ߔRuƲl\u0014\u0004\u0019\u0380\u000e\"\f*ώmB!KփUob7}6y&ݗ@Sc3Ð\bjX˯;ފդGXoю\u000f\tıE(\"%ЁA\f<\u0005աS)c\\H\u0013ޘDx!XZE3{/\u0007\u00940\u001dnt߈.\u00147\u000fӕ\u001c!\u001b\u0019\u001dE\u000bm<Rȕ83)\u0007۪\nubQ͒\u0001N\u0004uv4\u00108\u0014F°{5CFÓ8\u00185(\u000e>Ϳ\nme|ВuBq`ƭ!A\u0005)թ\r%\u000bmՋ\u0018\u0016\u00188s;ٲM\u00108qך\u007fGI7ܞ\u000b\u0015cths*}_Kƾi,(*\u0085Rk\u0003\u0016Ç\u001f?\u0004#n\r^\u0014f\u0018ܓ\u001aR\u0016 o\u0013\t\u000f\u0013^ܩ\u0003FJ#L:5\u000e6]\u05f82\u001a\u0013\r32\u001cig5\u0086k\u001eCyСw:hz̪mm\u000b14a]\u007fn;ǲ\u001c!'{\bC_`:\u001f\u05cf\u001fp\u0011.m[Jg>\u0016ԟ((P\u0012ָo2s$&9ՇjBb_ÔQN\u000b-ޅt\u001c2d+%<\u0005ײ=\u0013ԅ[3f  lɔ'|u:Õ\u0013-\u0005V\u058b\u0010+5tޡ\u001d+S\u007f -˫\f_`5]\fmn2?Ŏ>38`ЯnX{\u001fܬ9zt.w\t-;?uǛ,^Uk\u0557&\nP{қ\u0002>rK7R\u000b<\u0012<ŧ.jB0Fl\u001d,<\u007f߶@Gֽ\u007f%=\u0016r\u001d\u0018c֯P\u0002ϼ)ʫ\u0001\u0002\u0013\u05fdxw˰xތ;s1˾\u000e@+efS%cf#ۥ\u000e֮iN\u0017OiX\u001dd|cCI6{k?.\u000fU\nzԾw¡\u0004OAJ0ejGnu]\f43\u0007\u0007R-_l'~@\u0012@Ҋu\u008c_kDC\u0001 'KV,3y\u0015S\u001ex\b\u001a\\\rs$\u000eʻ\bԠ7\u001b\u0015\u0012U\u0003N=\u001a\u0003[Bt]j'J̓<ߴe:\u0012IFn8\u001c}\"bz\u0003j\u001ci6ݷ:ݙ\u0011\u0011\u001cy7kn\u001a1-&BcvtR3ܵOیf\u000fX\u0011*{<`\\\u001b\u00145FHE\"Tߦbū\u00177_uGh xL1+4s%4I>\u0099IˇYup??X\u0019\u0014\u001bpC\rt\u0005\u0004I\u0002\t\u0002܊\u0002Ԑ/8WXDC8_\u001e\u0010K\u000fV;\u0015\tRT\u00060^]'ګ\\\u05cfa\u00054!C\u0004#\u0015OBpgsd?\\\u000eȁpדY'Ez\b5\u001eti#\u0019Rk9`XJՃ3Ĩ\u007f\ftK[3{\u0001`\u0013o\u00039/4x\u0006ϼMгZiW\u001b]y\rGp72B+$\u0011%iْ\u0010ݤc\u0007d8\\gV\u000b*!t\u0003\u0003\u000f)6b˿\u000eޮY\nU\b\u0017%*x\fqNpFp7\r\u0006?RۨgݸjxqOKq\u0004`\u000fA\u007fY{O\u000e]EӔ^мB\u001bo(F]\u0010em6oH`)^d,ۧoحwXx\u0013_\u0003y\u007f5\n\u00017|>\u0012\u0010\u0013¸næjS\u0016\u001dW\u0017p\\1\u0001V\u0016(b\u001b\u0002}̥Jц\u001d\u0005\u0019Mgm\"\u000f\u0015\u00171BK:P;RWk}_J4g)GNĔ\bׁ7@%q2X#a^hxazc\u001e@\u0012KG2t;\u0017̟/ނ+q\u0001\n0o\u001a_U<|7jQ$\u0004Iճ\u0001Ԡ\"\u001eYY?-/yS)JoJM\u0007cE˰^ï2\u007f\u001e!\u0018,\n =Q\u0002gKW <\u000bߞ ă\u0002m\u0010\"\u0013Y r4Z1?\u0002b?N\u0005פy˱]@qC\b{0\u001ct\u0018#\u001b\u001aHb?\t؛%ò\u0013:0Lld\u0007\u001cÇd\u000bױt\u0001\u00165sӆ\u0010\u0015\\o6G\\\u0004\\̌Iՙ.˘\fJ"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X <QR?u={\u0011o_I\u000e_;X\u0004|", "/bR2f:BP\u001d\u0006~m@d\u00058a\u0002(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0006\u0011q];\u0007p\u0002", "5dc\u000eV*>a'\u0003wb3\u0001\u0018CM{1wB\u0001$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y\u001e5m$<Q@?r8-)P]B\u0003e,[L", "/tc<Y0EZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5#", "5dc\u000eh;HT\u001d\u0006\u0002\u001d(\u0006\u00129t{7\u007fJ\n%", "u(E", "5dc\u000eh;HT\u001d\u0006\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0013W~\u0018=z,<#Y0Fw\u00172TJ\u0011", "/tc<Y0EZ\b\fz^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5<P;k\n", "5dc\u000eh;HT\u001d\u0006\u0002M9|\tma\t1\u0006O|&\u001bQx\u001c", "5dc\u000eh;HT\u001d\u0006\u0002M9|\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0013W~\u0018=z,<#Y0Fw\u00172TJ*x4\u001ej", "1kX=U6:`\u0018fvg(~\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+4w\u0012;L+7t0 \u0015u7", "5dc\u0010_0IP#z\b]\u0014x\u0012+g\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#[';x\u00138IP:S0'\u0011jaF\\", "1na<h;B\\\u0019\\\u0005g;|\u001c>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "2qP445=2&\t\u0006F(\u0006\u00051e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)|dj5\tc9$", "5dc\u0011e(@/\"}Yk6\bp+n{*{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0016Tk\u00108\u007f$4f\b+\u0001L#*O\u001fDj\u0013+\u001fsI5\u0010_.N\u0004|", "4nRBf\u0016P\\\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egg2@m#\u0004", "5dc\u0013b*Na\u0003\u0011\u0004^9", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.!\u007f\u001f.Z\u0019", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "5dc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rH\\\u0002hoC\u000et,[L", "4n]A?6:R\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,\u0003.[MKx2\u001e{r]8\u0007p\u0002", "5dc\u0013b5M:#zy^9;\u00058n\n7wO\u0005! U", "5dc\u0013b5M:#zy^9", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%l:CIuD+\u0013hHC\u0003b,[L", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "5dc\u0014e(IV\u001d|\t<6\u0006\u0018/x\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#_-3x\u00192KQ\u0019u=-\u0015{p\u000f", "6`_A\\*\u001fS\u0019}WZ*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0004\u0013\"Vs\f=v%4Vy\u001e=7x*XR?i\u0015\u001e\u0015g^5\u0005i\u0002", "5dc\u0015T7MW\u0017_z^+Y\u0005-k", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001aCz\u001d@t&5Y|\u001d3k\u001cw0?Fz8\u001cuha8\u0004_*TL", "7m_Bg\u0014HR\u0019fvg(~\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~W \u007f0Ehe*6m}*V?=kAs", "5dc\u0016a7Nb\u0001\ty^\u0014x\u0012+g\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@\t>d\u000e/\u001fw\u0015.5?Dg6\u001e\">", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", ";dP@h9>7(~\bZ;\u0001\u00138", "", "5dc\u001aX(Lc&~^m,\n\u0005>i\n1", "u(9", ";nS6Y0>`\u007f\txZ3d\u00058a\u0002(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u0011q];\u0007p\u0002", "5dc\u001ab+BT\u001d~\bE6z\u00056M{1wB\u0001$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001fQn\u0012=z%B#e*6q\u00172MP\"u2\u001a\u001cP]B\u0003e,[L", ">kP0X4>\\(lxh7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "5dc\u001d_(<S!~\u0004m\u001az\u0013:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n `y\u001e7i\u00135M\u0002&r0\u001c\u0015paB\u0016Q*X\u0002'\u001d", ">nX;g,K7\u0017\t\u0004L,\n\u001a3c\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001c\u001fqO9\u0014t0Lv|", "5dc\u001db0Gb\u0019\f^\\6\u0006v/r\u0011,y@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\u0019WGDz4+xfkBtc9_z%G\"", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "5dc\u001fb6M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", "@n^A96KB\u0019\r\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9zF\u00014\u0016c\u000b\u000f7{%\u0004", "5dc\u001fb6M4#\fi^:\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006c/?h^*D\\\u0016<\\\u0019", "AgP?X+\u001d`\u0015\u0011h\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mt;IU)i>)\u0015>", "5dc [(KS\u0018]\bZ>j\u00079p\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.,P7}\"\u001c\u001fsa\u000f", "\nrTA \u0006\u0017", "", "Ag^D?(R])\u000eWh<\u0006\b=", "5dc [6P:\u0015\u0013\u0005n;Y\u0013?n~6", "u(I", "Adc [6P:\u0015\u0013\u0005n;Y\u0013?n~6", "uY\u0018#", "AmP=f/Hb\u0003{\t^9\u000e\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG\u0007\u001cB{\u00198\\-8y4+&hn\u000f", "5dc a(Ia\u001c\t\nH)\u000b\t<v\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006`7>Y\u000b\u000e@i!<PMJU1,\u0015ur9\u00149", "AnUAj(KS~~\u000f[6x\u0016.C\n1\u000bM\u000b\u001e\u001eG|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#c~/Ii#.3COh>\u001a\"g?C\u0010r9X}.GY$", "5dc b-Me\u0015\fzD,\u0011\u00069a\r'YJ\n&$Qv\u0015<\u0004", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#k*8|(*ZC!kH\u001b\u001fdn8dm5]\u00041NSN92", "BdgA<5Ic(lzk=\u0001\u0007/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4+&l_9\\", "5dc!X?M7\"\n\u000bm\u001a|\u0016@i}(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=1LF{C\f\u0015ur=\u0005c\u0002", "BdgAG6HZ\u0016z\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n$Y\u0011/&w 5J?HA", "5dc!X?MB#\t\u0002[(\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#l J|\u00058WJ8gAs", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "Eh]1b>\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n']\u0007\u001fA\u007fy7NM\u0011", "5dc$\\5=]+b\u0004_6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#o$@l @1L<u\n", "1`[0h3:b\u0019e\u0005\\(\u0004s9s\u00047\u007fJ\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">nb6g0H\\|\blb5{\u0013A", "1`[0h3:b\u0019e\u0005\\(\u0004s9s\u00047\u007fJ\n^~-7pQJ\u0015", "uI\u0018\u0017", "1`[0h3:b\u0019i\u0005l0\f\r9nc1mD\n\u0016!Y", ":nR._\u0017Ha\u001d\u000e~h5", "1`[0h3:b\u0019i\u0005l0\f\r9nc1mD\n\u0016!Y7u\">\bJ-m", "1qT.g,%O-~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%4@y47zk", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ">`a2a;%O-~\b", "", "7me._0=O(~eZ9|\u0012>L{<{M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "3w_9\\*Bb\u007fz\u000f^9", "4na0X\u0014>O'\u000f\b^\u001b\u007f\t\u001du|7\t@\u0001", ":`h<h;']\u0018~", "/eU2V;L:#\t\u0001Z/|\u0005.", "5dc\u0013b*Naw\u0003\b^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", "9dh\u0012i,Gb", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "5dc\u0013b*Naw\u0003\b^*\f\r9nG\u0013N\u001c\u0016yd+", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bV\nEu2?]|3\u0001k 6XMIk}.\u00192bC\u0005s:\u0018W1E\\\\\u000b`_r;#\u0016d\u0017$", ";dP@h9>/\"}aZ@\u0007\u0019>", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>/\"}aZ@\u0007\u0019>-J.bL]#)", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u00042\u0007,", "Ad]1C6B\\(~\bN7{\u0005>e", "=m0Ag(<V", "<nS2", "=m32g(<V", "=m4;W\bI^ \u0013Xa(\u0006\u000b/s", "=m8;g,K]$o~^>c\u0005Co\u00107YC| \u0019G", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG\u0004@|\u0016;WN,o40j", "=m;.l6Nbv\u0002vg.|", "=mA2d<>a(fzZ:\r\u0016/", "4na0X\u0019>_)~\tm", "AbW2W<ES\u0001~vl<\n\t\u000bn~\u000fwT\u000b'&", "=mA2d<>a(kze(\u0011\u0013?t", "=mB2`(Gb\u001d|\t</x\u00121e", "@dV6f;>`\u0003\bZg+X\u0014:l\u0014\u0006~<\n\u0019\u0017UV\u0012J\u0006%>Y\u000b", ":hbAX5>`", "@dV6f;>`\u0003\baZ@\u0007\u0019>C\n0\u0007G\u0001&\u0017FV\u0012J\u0006%>Y\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B\u0018g)\u001ei*8]R\u0019u<)\u001chp9\u0006J0\\\u0006'PL[\u0002", "@d`BX:M4#|\u000bl", "@d`BX:M=\"i\u0005l0\f\r9n\u007f'Y<\b\u001e\u0014Cm\u0014", "BdgA<5Ic(lzl:\u0001\u00138", "", "Adb@\\6G", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp'\u0007q:R\u000105JX7\\(", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "\u0011n\\=T5B]\"", "\u001dm;.l6Nbv\t\u0003i3|\u0018/df,\nO\u0001 \u0017T", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Owner extends PositionCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Owner.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLш|\u0004O\u00068é4'\u0015Ӭ\\\u0012&\u0006/pG0\\ev/\u0019w\u05ec\u000eӆڗ4(c&wbiTۥ\u0002$ߜSM"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B\u0018g)\u001ei*8]R\u0019u<)\u001chp9\u0006J0\\\u0006'PL[\u0002", "", "=m;.l6Nbv\t\u0003i3|\u0018/", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    static /* synthetic */ void getAutofill$annotations() {
    }

    static /* synthetic */ void getAutofillTree$annotations() {
    }

    @Deprecated(message = ")U\nI]\u0004\u0016[]Yg\u0004cT0Sl^\u000e*\u0006|\u0011VB\u0006\u0004}S4*uv`JCZetR8#FI\u001elQ\f", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    @InterfaceC1492Gx
    static /* synthetic */ void getFontLoader$annotations() {
    }

    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U */
    long mo5802calculateLocalPositionMKHz9U(long j2);

    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U */
    long mo5803calculatePositionInWindowMKHz9U(long j2);

    OwnedLayer createLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0, GraphicsLayer graphicsLayer);

    void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z2);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillTree getAutofillTree();

    ClipboardManager getClipboardManager();

    CoroutineContext getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    /* JADX INFO: renamed from: getFocusDirection-P8AzH3I */
    FocusDirection mo5804getFocusDirectionP8AzH3I(KeyEvent keyEvent);

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    GraphicsContext getGraphicsContext();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    ModifierLocalManager getModifierLocalManager();

    PointerIconService getPointerIconService();

    LayoutNode getRoot();

    RootForTest getRootForTest();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void measureAndLayout(boolean z2);

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    void mo5805measureAndLayout0kLqBqw(LayoutNode layoutNode, long j2);

    void onAttach(LayoutNode layoutNode);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    void onInteropViewLayoutChange(View view);

    void onLayoutChange(LayoutNode layoutNode);

    void onRequestMeasure(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4);

    void onRequestRelayout(LayoutNode layoutNode, boolean z2, boolean z3);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(Function0<Unit> function0);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener onLayoutCompletedListener);

    boolean requestFocus();

    void requestOnPositionedCallback(LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z2);

    Object textInputSession(Function2<? super PlatformTextInputSessionScope, ? super Continuation<?>, ? extends Object> function2, Continuation<?> continuation);

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            z2 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z3 = false;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            z4 = true;
        }
        owner.onRequestMeasure(layoutNode, z2, z3, z4);
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z2, boolean z3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        owner.onRequestRelayout(layoutNode, z2, z3);
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        owner.measureAndLayout(z2);
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z2);
    }

    static /* synthetic */ OwnedLayer createLayer$default(Owner owner, Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i2 & 4) != 0) {
            graphicsLayer = null;
        }
        return owner.createLayer(function2, function0, graphicsLayer);
    }

    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    /* JADX INFO: compiled from: Owner.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005<i%\nCiWpԉ.\u07beSZo˧\u0007L`\u000eQ\u0013&\u0018~o:OǪ|d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B\u0018[*?x\u00127QMDA", "", "u(E", "3mP/_,\u001ef(\fv::\u000b\t<t\u00042\u0005N", "", "5dc\u0012a(;Z\u0019^\u000em9xd=s\u007f5\u000bD\u000b %", "u(I", "Adc\u0012a(;Z\u0019^\u000em9xd=s\u007f5\u000bD\u000b %", "uY\u0018#", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions = false;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z2) {
            enableExtraAssertions = z2;
        }
    }
}
