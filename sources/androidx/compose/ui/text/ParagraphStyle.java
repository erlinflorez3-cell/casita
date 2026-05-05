package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
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
/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2z]xk\u001b\u00172HoG3[uE9fu>\u0005.>*\u0600\u007f\n\u0017ɝZH>u;3Q!\"8FpHR%O\u001b\u0019@\u0007N(\u0007\u001ejif8^k\f=?)\tiPR?_^\u0002]\u0015LT5\u0013\u000fc4*n>E\u001d+S\u0011\u000fj]U\u0002mzM\rn'55aum5\u0007\u000b$\u001d1O\u001bi\u000b(r\u0004\u007fm\u001c/1OqYh\u0010>v)\u000b\u001dD\n\u000e\u00147`0C\u0019\u0015\u0019ԧ7t\u0001e\u0001\u0004\bsR\b\u0001aD\u0017=\u0002I*g\u001cvYg;'PO}\u001b\fL&\u0011t'[b\u0012x\u0015IY\bY7QNC`P Xktձtb\u0010=D{M\u0015?\u0004\u0017.%%O]O\"Ol\u0012PJg\u0005\u0007xjih\u0001KP(t\u0016E.!\f\tIt\rqPb^D\u0013c\u001b\u0003\u000e\u000e\u0010\u0019 j\u007fT#;\u000f|XxqpMk\u0014=1|6\by«\u0012WGrs\u0019Wx iXv\"?Td\u001bW\u0015Cc\u0014`\\6$JJ\u0001\u000f&~TT\u0012\u0013@C\n\u001cb1A!b\u0015V\t6DW{7fjp\u0016~b;<\u0005\u007f##\u0012\u0011Xbp}q\u0011KB{\u000f-=IW5'2m$~3+0\u0017\u0007y\u007fUudIbkD\u0005ʀ\u007f $/y7?C\u0019\u000f\r)J\u0002[F\\xkQ[\u0014?z+|\u001fAn.u\f\u0003pZezRUT%(\u000f`\t\"6k\u0010\u0002gF\tO{V!ZlR\u0003\u000b_<\\B\u0015\u00075\u001dS\f\u007f(\u00035;O?\u001dD\u0005$5\u001bakw\b.(q\u001f.ze\u0012<{\u0018\u0006a\u007fnщ?8WoG/0]\u0005\u0003pו\u001b}\u000eB\u00174%3vB\u0015v\\8[\rG}\u0015\n\\\u0013vVi>+o,9^g0sQ\u0004,`Y$?T\u0004osmYd#L%\t9\u0005av\u0018\u001cK*nYx\b^\u0011$\u001e<AIn\u001d<71d2B\b\u0019Qli4\u001f+\bL_\u001d'JD\n:\u0005\u001f\u0603wִƪL\u0007f\u007fn\\r?\rHK\u001e'߶a\rsFb/{4\u0017RK\nKrU~t'CFj8I+\t\u0007\u0011EkGa\u0002d\tw1sk}\u0012P\u001a\u0013\u001cp\u001fa>ު\u0010٣۞4`\u0011\u0012r\f-M  jNPĖ/\u0003\u0003\u000eJ\n'\r/N!p\u00135RN\u00069[\u001c\u0017\u0016r,7\u0012\u0003cT\u001fE\u0006c2mQp\u00145\u0002oUQ|6'P/\nt/do\u0010|\t\f$j\u001ew\u0016p\f!\u0015f\u001f29\u0011yԓ\tڔĝ:Q\bq\u0010R'Hy19@Uߜ\u001d\u000eHKvx\"e\u0003b\u001dV;\u000bl1d{\u0007/f\u001c7*}4\u0019Xh>)SN]A\b\u001a\u00154%N\nx(>V\u0014pvk]c%-EjXja8X\u001e\f)\u0012w\u001a)\u00033EC\\MLp!^\u0003A\u0006\u001b\u000fr.d\u0003\u001aA\u0016\u0013}vmW\u0018\u0383Eݱ۠h1=Y-\u001dUBn@\u001cEw\u008eQ9X?)7J\r\u0006'%\u00123Bht\u000e,Z\u000b\t~\u0016/]LZ=(+q$\u001ci3.QEFH .'\r?6\u000b@&>j\"4=g2o\"A\t\u001b8\u0014y\u001f\u001bKi\u007f^U2\u0007|\u000f\u0019W{Gjh\u0001gz)/\u001d}3Y|:SD\u0016T-\f\u0010ub\u0001cb\u0005 (1߲4\u0096ɭ}WFB\u0018bl5\u0014:;\u007fsvx0m#XX\nV2%p\u07b6n\r)U4\u0011s8t0,<vi+LA)߭ILD*;3\u001fGcg(ޠ\u000b\u0012\u000e#EY\u001e)aٚ-\u0014]8X+wל\u0014ҕ\\&B!?\u001c:`.|\u000e\u0018`gA\u001e/(S\u0012y!3(̡\u0012ڷ\u0011ԔǨ\u0003vٽVj\u0010b#05d\u000fH<v\u0007h\u0012\u0003\u0019\\'&t-p\u0019AKlǢJȿ\u0001Ѫ·_\u0014Θ7Q\u0004CM/d\u00159\u001f\u0017y3%u\bxgWW\bWk:iPDԺZ̻dڤשT ʢh5%\u0002pL<`n@ Lf)^erl(F\u000fCVpfu\u0007ɷ\u0001ØBיՖ\u001b\u001eߚY\u001fu\u00018\bEt|\u00131]e\u0016#l1;\u0011\u00021\u001fŖ\u0018Ѻɳ\u001dRև6+{\r?h\u0014\nbqc&>`\u001e\u000fyJO<П>ćюJkʂiG!WM)$\"-O\u0014<tyu\u0017\u0002\u000ePdΕKܹ;(Gä]\u0019nBx=\u0013v\u0012Z\u001ae&\u0017K\u0010)d24ijޱ04xĤ_Qp+8\u0016@w\u0003aeGAtGGқu\u0017kٔw\u0016t\u0003j\u000b\u000f.e&X\u00130\u001bާ%ȿӾG(݉\u001b]kmx\u001elb\u0017\rB\u0015\u0001{\bt~dlf\u008f;\u0091֨\u0018e\u008f\u0002#YDp3xrNu\u001e\f==5<`l/\u007f/Rڼ\u001b\u001a?ݮ\u000f%mhHX23am=I`\u0005<{˧{\u001b\u0004֞K8\u0013':5ϲ\u0005Gnu\nɁ!{/\fk5Qմ^\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:[%BTC\u0011", "", "BdgA43BU\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|q5QEDA", "BdgA70KS\u0017\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t2ZC9z8(\u001e>", ":h]2;,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "BdgA<5=S\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|y7LCDz\n", ">kPAY6K[\u0007\u000e\u000fe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr46c\u000b(\"i#*OP7v7\f$|h9\\", ":h]2;,BU\u001c\u000ehm@\u0004\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mx.QE>z\"-)oa\u000f", ":h]259>O\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?AA", "6x_5X5L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#`4Bp\u00167[\u0019", "BdgA@6MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEt\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\nTG=t\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0013hU+n\u000e&\u001f\u001b;(\u0006Hh~\u001b\u001a\u0018>@U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u00042#\u0006 \u001b2?.\u001d\u000b7\u001aqR\u0003v=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{gt>\u0004vn;&Ee\u000fXo\u0003:kt\u00179XL*\u0014EP\u001a?!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001f\u000b'&[Hp)\u000fFf\r>\u0013V\u00190FaB_{\u0018\u0018t3\u0002lI\u0019\u0002P\n\u0019}N&^$L\u0001p '8$=#\u001flsn7`\"RvG \u0003Y\r{tQ\u0010JXrW]E\u000b2\u0002\u0010V+7JO@PMw\u001b B\u0001T\u000f!=xB\rE\\34Q`8,CC\u0016jS+'=\u001f\u0018(,>\fV?\u0002(u1\u001d\t\u0018v|^mB\u0002\u00113TX40KwR\u0005\u0006IR#;5\u001f>d~\u001f\u0018By?Yu\u0012\tM0\n\u001be0/\u0005G,p\u001760j\f\u000bk-6*^bW$\\ ~FW$\u000bC+\u0012\u0016\"S>X=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\nTG=t\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0013hU+n\u000e&\u001f\u001b;(\u0006Hh~\u001b\u001a\u0018>@U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u00042#\u0006 \u001b2?.\u001d\u000b7\u001aqR\u0003v=.\u001f\u0005G+Bv%KVw\u001f@}6\u001fX\u0005s\u0019{7t,p=\u000bC\b@m\u0013Zt(<m\u0003\"\u0014XN-&C\u0012V0", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\nTG=t\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0013hU+n\u000e&\u001f\u001b;(\u0006Hh~\u001b\u001a\u0018>@U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u00042#\u0006 \u001b2?.\u001d\u000b7\u001aqR\u0003v=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{gt>\u0004vn;&Ee\u000fXo\u0003:kt\u00179XL*\u0014EP\u001a?!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001f\u000b'&[Hp)\u000fFf\r>\u0013V\u00190FaB_{\u0018\u0018t3\u0002lI\u0019\u0002Z\u000b)wH+)\u0016\u0014\u000b0\u001c%=\u0016Jb\u000bos>7N\u000f\u0019oGi\u0006bQ$}X\u000e|U\u007fCS|*6\u0006f\r\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\nTG=t\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0013hU+n\u000e&\u001f\u001b;(\u0006Hh~\u001b\u001a\u0018>@U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u00042#\u0006 \u001b2?.\u001d\u000b7\u001aqR\u0003v=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{gt>\u0004vn;&Ee\u000fXo\u0003:kt\u00179XL*\u0014EP\u001a?!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001f\u000b'&[Hp)\u000fFf\r>\u0013V\u00190FaB_{\u0018\u0018t3\u0002lI\u0019\u0002P\n\u0019}N&^$L\u0001p '8$=#\u001flsn7`\"RvG \u0003Y\r{tQ\u0010JXrW]E\u000b2\u0002\u0010V+7JO@PMw\u001b B\u0001T\u000f!=xB\rE\\34Q`8,CC\u0016jS+'=\u001f\")<8\u0006[\nso\u007fp\u0019\u0007\u001dh\n\u001eYE\u0002`3BEz)KAU\u000eJi_ *\\\u001f<Hp#H[\u0001\u000b\u000e_", "uH8\u0017?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011~\u000eO\u0006nCh\u0012'77\u0005.`R\u001ft3\u001e\u001ew7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u001c\u0005lPmYK3.\t6V\n&d\u000e\b\u0018\u001b1us0e$Nyj\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m#q,*2^=\u001e\u0003SZYV\u0003gJG\u001d|;3,|oMEE9 [#(J\t\u0002\u00161k>)~5\u000f>86.\u0015O1'>q\b^:kU.&\u007f+\u0013RZK\u007f{B\u0018qtH\u000e\u0018q<5\"/jtPX\u000bf&[Bj[\b\u00011\u0006?E\u007f\u001c6$\tKi\t\"\u0019\u00053wr1?(Z\u0001'F\b\u0013", "2d_?X*:b\u0019}t[6\u0010\r8gy+\u0010K\u0004\u0017 U", "5dc\u0015l7AS\"\rB>(j\u001c\u0013n\u000efwI\n!&C~\u0012F\u007f3", "u(E", "5dc\u0015l7AS\"\rB>(j\u001c\u0013n\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u001a\u0002!1MLIA", "2d_?X*:b\u0019}t[6\u0010\r8gy/\u007fI\u0001s$Gk\u0014", "5dc\u0019\\5>0&~vdsc\u000b\rV\u007f=\u0006~|  Q~\nKz/>g", "5dc\u0019\\5>0&~vdsc\u000b\rV\u007f=\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u001eq\u001f.*P;g:s", "2d_?X*:b\u0019}t[6\u0010\r8gy7{S\u0010r\u001eKq\u0017", "5dc!X?M/ \u0003|gsy\u0019\u000b5Ltk~|  Q~\nKz/>g", "5dc!X?M/ \u0003|gsy\u0019\u000b5Ltk", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=)J?m=s", "2d_?X*:b\u0019}t[6\u0010\r8gy7{S\u0010u\u001bTo\fKz/>", "5dc!X?M2\u001d\fz\\;\u0001\u00138-\b0\fFL&!\u0006k\u0017E\u000141h\u0002*@{", "5dc!X?M2\u001d\fz\\;\u0001\u00138-\b0\fFL&!", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=,GHk2-\u0019rj\u000f", "5dc\u0015l7AS\"\rBo4y}.UR", "u(8", "\u0017", "5dc\u0019\\5>0&~vds\nd\u00113nt\u0002", "5dc\u0019\\5>6\u0019\u0003|a;D{\u001dAc\fp ", "u(9", "\u0018", "5dc\u0019\\5>6\u0019\u0003|a;j\u0018Cl\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u001eq\u001f.0C?m7-\u0003wu@\u00079", "5dc\u001d_(MT#\f\u0003L;\u0011\u0010/", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006a,1h~*Du\u0001*Z?=x0)\u0018VpM\u000ec\u0002", "5dc!X?M/ \u0003|gs|S\u0016S\u0006\u000e\u0002", "5dc!X?M2\u001d\fz\\;\u0001\u00138-\u000e\"M3H\u0015!", "5dc!X?M7\"}zg;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=1L:k=-j", "5dc!X?M;#\u000e~h5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=5MJo>'j", "1n_F", "1n_F @Dh\u0005fKd", "uH8\u0017?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011~\u000eO\u0006nCh\u0012'77\u0005.`R\u001ft3\u001e\u001ew7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u001c\u0005lPmYK3.\t6V\n&d\u000e\b\u0018\u001b1us0e$Nyj\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m#q,*2^=\u001e\u0003SZYV\u0003gJG\u001d|;3,|oMEE9 [#(J\t\u0002\u00161k>)~5\u000f>86.\u0015O1'>q\b^:kU.&\u007f+\u0013RZK\u007f{B\u0018qt%n\nk4>#idv\u0012\r\u0011e\"eCa)\u0011;\u001c\u0015>\\~^\u0012B\f>]\u0007\u0011\u0014\n\u0012|yPCp", "1n_F \fEa!\u0006wd", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\nTG=t\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0013hU+n\u000e&\u001f\u001b;(\u0006Hh~\u001b\u001a\u0018>@U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u00042#\u0006 \u001b2?.\u001d\u000b7\u001aqR\u0003v=\u000b\u007fvA#Kw_EX9SF|2)Y{A\"6\"\u0004+\b<M\u001f&C`\u0007Xc#AL\b)3\\\u0017", "1n_F ?)VhoI`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\nTG=t\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0013hU+n\u000e&\u001f\u001b;(\u0006Hh~\u001b\u001a\u0018>@U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u00042#\u0006 \u001b2?.\u001d\u000b7\u001aqR\u0003v=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{gt>\u0004vn;&Ee\u000fXo\u0003:kt\u00179XL*\u0014EP\u001a?!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001f\u000b'&[Hp)\u000fFf\r>\u0013V\u00190FaB_{\u0018\u0018t3\u0002lI\u0019^;|#oQ,c\u0010\u0016Ld\"$9 KYXx.)FM&\u00182#\b\tUE\"lS\u0013[Z\u0007bWE", "1n_F *BA,\u0014\t)", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\nTG=t\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0013hU+n\u000e&\u001f\u001b;(\u0006Hh~\u001b\u001a\u0018>@U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u00042#\u0006 \u001b2?.\u001d\u000b7\u001aqR\u0003v=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{gt>\u0004vn;&Ee\u000fXo\u0003:kt\u00179XL*\u0014EP\u001a?!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001f\u000b'&[Hp)\u000fFf\r>\u0013V\u00190FaB_{\u0018\u0018t3\u0002lI\u0019\u0002P\n\u0019}N&^$L\u0001p '8$=#\u001flsn7`\"RvG \u0003Y\r{tQ\u0010JXrW]E\u000b2\u0002\u0010V+7JO@PMw\u001b B\u0001T\u000f!=xB\rE\\34Q`8,CC\u0016jS+'={\u0003\u001b60\u000f\\DmqA%\u001f\u0006\u0019r\u000b\u0015'N<KBA\\yk'_X\u0001>gN\u001b/;$Cgtk", "1n_F \u0015!\u001f\u001f\u0005\rN", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\nTG=t\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V\u0013hU+n\u000e&\u001f\u001b;(\u0006Hh~\u001b\u001a\u0018>@U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u00042#\u0006 \u001b2?.\u001d\u000b7\u001aqR\u0003v=.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{gt>\u0004vn;&Ee\u000fXo\u0003:kt\u00179XL*\u0014EP\u001a?!Jqu=\u001br#`\u001bW`?9$osc\u0012\u001f\u000b'&[Hp)\u000fFf\r>\u0013V\u00190FaB_{\u0018\u0018t3\u0002lI\u0019\u0002P\n\u0019}N&^$L\u0001p '8$=#\u001flsn7`\"RvG \u0003Y\r{tQ\u0010JXrW]E\u000b2\u0002\u0010V+7JO@PMw\u001b B\u0001T\u000f!=xB\rE\\34Q`8,CC\u0016jS+'=\u001f\u0018(,>\fV?\u0002(u1\u001d\t\u0018v|^mB\u0002\u00113TX40KwR\u0005\u0006IR#;5\u001f>d~\u001f\u0018\u001fZ1Sm\u001b\n\b*\f\\\u001a6.\u0001Q-gd?jU\u001b\n\u0003,x\u0006|eJ\u0018Z\u000fyK6)\u0012b/Z", "3pd._:", "", "=sW2e", "6`b566=S", "", ";da4X", ">kd@", "BnBAe0GU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ParagraphStyle {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    public /* synthetic */ ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013G\u000e6x\u0007\u0016g`:<\u0014\\\u001akQkZ\u001c;\u0017}\u000ff\u0006X\u0002*b|%z(`eMR\u001cvNR*4<\u001e[\fm'p\\\u001cqG; W\u0007\bI3\u000b\u0018\u000b\u0005\u0011rK%Z\fG\u001d\u000e\u0011\nMqQ\u007fB9spT}?\u0013\u0004\b\f(z0WO'\u0011 T\u000f>b$%\"?Kj~de1G[^^6[dL7.& A\u001d\u0017D\u0007>r~,VlZ\u001e.4:O\u0005Y\u000f{\u000421\u007f{u\noa@\r{m o*A(Oty(i]*\u0014t^%f)!lJ\u0005K/FTXaqL,DR_\u0011huuivX}eFXD j)\u0003#D$A>\u0003CF\u000eJ8p2PS\u0010Yr\u001bw>z\f\u000e\b&b\n\u0016$U1aW`o,)m\u001f(Eo\f\u0010$b<< G3*\u007f=1N")
    @InterfaceC1492Gx
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013G\u000e6x\u0007\u0016g`:<\u0014\\\u001akQkZ\u001c;\u0017}\u000ff\u0006X\u0002*b|%z(Ps\u0002[k|xZ\u001f>?QdQ\u0011ak\\<gJ9Q\u001cH&E({H\u0007\u0005\u001f/C%V\u0003;I+\u0016\u0001*\"D{Lyg\u0019l\u007fCX*\u0002G_i'\\$\u0013\u000e/\u001e\u001aG\u0012\u00132$};j\u000b)+D<jbO~[?E7o8er-\u0013\nCClpWR\\nI26{:\tY<yS,<\u000fz\u0006Mso@\u001f<")
    @InterfaceC1492Gx
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013G\u000e6x\u0007\u0016g`:<\u0014\\\u001akQkZ\u001c;\u0017}\u000ff\u0006X\u0002*b|%z(Ps\u0002[k|xZ\u001f>?QdQ\u0011ak\\<gJ9Q\u001cH&E({H\u0007\u0005\u001f/C%V\u0003;I+\u0016\u00010\u0015H\u0002IB\u001bEl{@\u001f[Z\u0005.z\u0004V\u0015'\nfTrRb\u001a%-Qvf\r\u001ceE@foP4\u001dc>6<dP?\u001d\u0001\u0018\tny~\u001d\u0004k_\u000f^0\u007fO<g\u0011wF*.:k\u007fXrt@!q|\u001b|+{")
    @InterfaceC1492Gx
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013G\u000e6x\u0007\u0016g`:<\u0014\\\u001akQkZ\u001c;\u0017}\u000ff\u0006X\u0002*b|%z(Ps\u0002[k|xZ\u001f>?QdQ\u0011ak\\<gJ9Q\u001cH&E({H\u0007\u0005\u001f/C%V\u0003;I+\u0016\u00010\u0015H\u0002IB\u001bEl{@\u001f[Z\u0005.z\u0004V\u0015'\nfTrRb\u001a%-Qvf\r\u001ceE@foP4\u001dc>6<dP?\u001d\u0001\u0018\tny~\u001d\u0004k_\u000f^0\u007fO<g\u0011wF*.:k\u007fXrt@!q|\u001b|e")
    @InterfaceC1492Gx
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u000eK\fI1z$i\u0018I)}[,-``_H*\u0014u\u001cS\u000bOpsZ}8\u007f6")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m6014getHyphensEaSxIns$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u000eK\fI1z$i\u0018I)}[,-``_H*\u0014u\u001cS\u000bOpsZ}8\u007f6")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m6015getLineBreakLgCVezo$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u000eK\fI1z$i\u0018I)}[,-``_H*\u0014u\u001cS\u000bOpsZ}8\u007f6")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m6016getTextAlignbuA522U$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u000eK\fI1z$i\u0018I)}[,-``_H*\u0014u\u001cS\u000bOpsZ}8\u007f6")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m6017getTextDirectionmmuk1to$annotations() {
    }

    private ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        this.textAlign = i2;
        this.textDirection = i3;
        this.lineHeight = j2;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i4;
        this.hyphens = i5;
        this.textMotion = textMotion;
        if (!TextUnit.m6828equalsimpl0(j2, TextUnit.Companion.m6842getUnspecifiedXSAIIZE()) && TextUnit.m6831getValueimpl(j2) < 0.0f) {
            throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m6831getValueimpl(j2) + ')').toString());
        }
    }

    public /* synthetic */ ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 + 1) - (i6 | 1) != 0 ? TextAlign.Companion.m6533getUnspecifiede0LSkKk() : i2, (-1) - (((-1) - i6) | ((-1) - 2)) != 0 ? TextDirection.Companion.m6546getUnspecifieds_7Xco() : i3, (i6 + 4) - (i6 | 4) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j2, (i6 + 8) - (i6 | 8) != 0 ? null : textIndent, (i6 & 16) != 0 ? null : platformParagraphStyle, (i6 + 32) - (i6 | 32) != 0 ? null : lineHeightStyle, (i6 & 64) != 0 ? LineBreak.Companion.m6460getUnspecifiedrAG3T2k() : i4, (i6 & 128) != 0 ? Hyphens.Companion.m6439getUnspecifiedvmbZdU8() : i5, (i6 + 256) - (i6 | 256) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m6029getTextAligne0LSkKk() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m6031getTextDirections_7Xco() {
        return this.textDirection;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m6027getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    /* JADX INFO: renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m6026getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* JADX INFO: renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m6024getHyphensvmbZdU8() {
        return this.hyphens;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m6028getTextAlignbuA522U() {
        return TextAlign.m6520boximpl(this.textAlign);
    }

    /* JADX INFO: renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m6030getTextDirectionmmuk1to() {
        return TextDirection.m6534boximpl(this.textDirection);
    }

    /* JADX INFO: renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m6023getHyphensEaSxIns() {
        return Hyphens.m6430boximpl(this.hyphens);
    }

    /* JADX INFO: renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m6025getLineBreakLgCVezo() {
        return LineBreak.m6440boximpl(this.lineBreak);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : textAlign, (i2 + 2) - (i2 | 2) != 0 ? null : textDirection, (i2 + 4) - (i2 | 4) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j2, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : textIndent, (i2 & 16) != 0 ? null : platformParagraphStyle, (i2 & 32) != 0 ? null : lineHeightStyle, (i2 + 64) - (i2 | 64) != 0 ? null : lineBreak, (i2 + 128) - (i2 | 128) != 0 ? null : hyphens, (i2 + 256) - (i2 | 256) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : textAlign, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : textDirection, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j2, (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? textIndent : null, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent) {
        this(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j2, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : textAlign, (i2 + 2) - (i2 | 2) != 0 ? null : textDirection, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j2, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : textIndent, (i2 + 16) - (i2 | 16) != 0 ? null : platformParagraphStyle, (i2 & 32) == 0 ? lineHeightStyle : null, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : textAlign, (i2 + 2) - (i2 | 2) != 0 ? null : textDirection, (i2 + 4) - (i2 | 4) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j2, (i2 + 8) - (i2 | 8) != 0 ? null : textIndent, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : platformParagraphStyle, (i2 & 32) != 0 ? null : lineHeightStyle, (i2 + 64) - (i2 | 64) != 0 ? null : lineBreak, (i2 & 128) == 0 ? hyphens : null, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.m6032fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    public final ParagraphStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    /* JADX INFO: renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6009copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            textAlign = TextAlign.m6520boximpl(paragraphStyle.textAlign);
        }
        if ((2 & i2) != 0) {
            textDirection = TextDirection.m6534boximpl(paragraphStyle.textDirection);
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m6018copyElsmlbk(textAlign, textDirection, j2, textIndent);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013G\u000e6x\u0007\u0016g`:<\u0014\\\u001akQk\\\"f\bw\u001ae\u000bX\u0004mb\u00046y(`lCa\u001clH\u0006,BNQjM\u0005'\u0018V@|}G&\rI IZ\u00075\u0014s\u0019tK!]\u0011;i+\u0013\u0001\b{H\tF\u0016-:ZwOF0\b\b%Aa0\u00194\u0004|'\u0010:]]_\u0007WGm\u007f%9\u0001<hb\u000b5!_K7q&t8\u001cMDs;il+I\u0017l\u001d$a\u000f@\u0002\u0014\u000b{[]<\u000firVd 1\u001b~\u0002Km'<{bt\nko].\u0015")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6018copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent) {
        return new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j2, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6012copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            textAlign = TextAlign.m6520boximpl(paragraphStyle.textAlign);
        }
        if ((2 & i2) != 0) {
            textDirection = TextDirection.m6534boximpl(paragraphStyle.textDirection);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((8 & i2) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i2 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m6021copyxPh5V4g(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013G\u000e6x\u0007\u0016g`:<\u0014\\\u001akQk\\\"f\bw\u001ae\u000bX\u0004mb\u00046y(`lCa\u001clH\u0006,BNQjM\u0005'\u0018V@|}G&\rI IZ\u00075\u0014s\u0019tK!]\u0011;i+\u0013\u0001\b{H\tF\u0016-:ZwOF0\b\b%Aa0\u00194\u0004|'\u0010:]]_\u0007WGm\u007f%9\u0001<hb\u000b5!_K7q&t8\u001cMDs;il+I\u0017l\u001d$a\u000f@\u0002\u0014\u000b{[]<\u000firVd 1\u001b~\u0002Km'<{bt\nko].\u0015")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6021copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6011copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i2, Object obj) {
        if ((1 & i2) != 0) {
            textAlign = TextAlign.m6520boximpl(paragraphStyle.textAlign);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            textDirection = TextDirection.m6534boximpl(paragraphStyle.textDirection);
        }
        if ((4 & i2) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((16 & i2) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((32 & i2) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            lineBreak = LineBreak.m6440boximpl(paragraphStyle.lineBreak);
        }
        if ((i2 & 128) != 0) {
            hyphens = Hyphens.m6430boximpl(paragraphStyle.hyphens);
        }
        return paragraphStyle.m6020copyciSxzs0(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013G\u000e6x\u0007\u0016g`:<\u0014\\\u001akQk\\\"f\bw\u001ae\u000bX\u0004mb\u00046y(`lCa\u001clH\u0006,BNQjM\u0005'\u0018V@|}G&\rI IZ\u00075\u0014s\u0019tK!]\u0011;i+\u0013\u0001\b{H\tF\u0010:6Tz\u0007\u0013\u0004\b\f(z0W[er -\u001f&a&).Lvf\r\u001ceE@foP4\u001dc>6<dP?\u001d\u0001\u0018\tny~\u001d\u0004k_\u000f^0\u007fO<g\u0011wF*.:k\u007fZx 1\u001b|{ |-1|]tB")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6020copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), this.textMotion, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6010copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            textAlign = TextAlign.m6520boximpl(paragraphStyle.textAlign);
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            textDirection = TextDirection.m6534boximpl(paragraphStyle.textDirection);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((64 & i2) != 0) {
            lineBreak = LineBreak.m6440boximpl(paragraphStyle.lineBreak);
        }
        if ((i2 + 128) - (128 | i2) != 0) {
            hyphens = Hyphens.m6430boximpl(paragraphStyle.hyphens);
        }
        if ((i2 & 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        return paragraphStyle.m6019copyNH1kkwU(textAlign, textDirection, j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013G\u000e6x\u0007\u0016g`:<\u0014\\\u001akQk\\\"f\bw\u001ae\u000bX\u0004mb\u00046y(`lCa\u001c|:Q#rH'bXz$dMzYCL&lS\u001dK)Bsuw$\u0004\u001b%]\u0003~q+\u0017\n\u0014O+\u0004O3\nCXpF\u001f[o\n$5\n] .\u0004)(J:d\u0017_#CGw\u007f\u001a'U@Z+\u000b!(T:EsduF\u001d?\u0006C=i\u0003WGfe\u001d34\u0010;\u0011c\u000f6[&.\rm0^geA\u0011.x\r|\u0019;mbg\u0007{\u001bO.L&W(ht-uQC\rC=M\u001aaI`,;\r6\nsw;'yT\u0003e6X9\")8\u0003/\u0011#+\u0004\u0006C5\u0017\u00056'DT\u0019\u001eT`\u001720\u007f\u0019\u0015\b%,\u0001\u001d\u001fTm\\\u001ade\u001d}\u001d %Q \n\b5ZHIm6<,qm5\u0006I(<V`")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6019copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign != null ? textAlign.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m6540unboximpl() : TextDirection.Companion.m6546getUnspecifieds_7Xco(), j2, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m6452unboximpl() : LineBreak.Companion.m6460getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m6436unboximpl() : Hyphens.Companion.m6439getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6013copyykzQM6k$default(ParagraphStyle paragraphStyle, int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion, int i6, Object obj) {
        if ((1 & i6) != 0) {
            i2 = paragraphStyle.textAlign;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i3 = paragraphStyle.textDirection;
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            j2 = paragraphStyle.lineHeight;
        }
        if ((i6 + 8) - (8 | i6) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16)) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((32 & i6) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((64 & i6) != 0) {
            i4 = paragraphStyle.lineBreak;
        }
        if ((128 & i6) != 0) {
            i5 = paragraphStyle.hyphens;
        }
        if ((i6 + 256) - (i6 | 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        return paragraphStyle.m6022copyykzQM6k(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion);
    }

    /* JADX INFO: renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m6022copyykzQM6k(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        return new ParagraphStyle(i2, i3, j2, textIndent, platformParagraphStyle, lineHeightStyle, i4, i5, textMotion, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        return TextAlign.m6523equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m6537equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m6828equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent) && Intrinsics.areEqual(this.platformStyle, paragraphStyle.platformStyle) && Intrinsics.areEqual(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m6446equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m6433equalsimpl0(this.hyphens, paragraphStyle.hyphens) && Intrinsics.areEqual(this.textMotion, paragraphStyle.textMotion);
    }

    public int hashCode() {
        int iM6524hashCodeimpl = ((((TextAlign.m6524hashCodeimpl(this.textAlign) * 31) + TextDirection.m6538hashCodeimpl(this.textDirection)) * 31) + TextUnit.m6832hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iM6524hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (((((iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + LineBreak.m6450hashCodeimpl(this.lineBreak)) * 31) + Hyphens.m6434hashCodeimpl(this.hyphens)) * 31;
        TextMotion textMotion = this.textMotion;
        return iHashCode3 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m6525toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m6539toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m6838toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m6451toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m6435toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }
}
