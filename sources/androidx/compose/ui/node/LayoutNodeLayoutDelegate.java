package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0RkP.XY2\u000fy\u0005<$a0yCQU\"}(\u000eWN}gvJ`\u0019K\u000f\u001c\u0016\u0001j2K]xs\u0012\u00172HtG3coE9fu>\u000562*8\b\u0005\t\u001a0b\u0016͌\u0011ŏ{\f@/xp 9MX\u0015\u001e \u0006V /\u001f֔kNDJ5hH\u007f;\u0003\u0018\u000e\u0015ϋۢ4|S^\u000fX5_\u000faLv\t;Ch=S1R\u001bfMWWqkP/ѧݳ/Iy-~c\u000ej-+}X$ö͉`\u0005W8T29({K~Yn»ߡ\u007f\rB]V\u00115#F-H2NԄ\u07baxrY\u001c\u0019\u0006l\u001f\u0018z\u0010\u0002_=\u000e\u0011C9I2\u0002eIwf7*%S\u001eƹ\u007f͙Ĳ_V\u0014@#{\u001d\u0010_\u0013i@k\u0014~\u000eg\u001c\u0006\u0004\u001f\u0003H*̯/ϚĬ3}\u0017\u0011%\u0006\u007f_G\u00079k0\u0014\rk\u0005ixh\u00025#ZN%\u0007\u0016e.?J1զfʰoTlZ2\u0016[\"%)\f\u0011+ \u000b\u007fl%3\u0017fO\u0017q)\u00124܊1çjCaʤ\u0004\u0010]Cl>USi\u001co_G6MJz\u0005\u0007nrW\u001aat(P:\u0007/fǵ\bΌR\u0018\u001bԵWs\"C:<9^\u001bX\u0011+\u0013c\u000b\u001bwZ\u0017!/XA+\u001biR\u0006GE'ʛ|״k\u0005Qؓ\u0015b(@OeU\u001b,j0~\u0005\u001f1\u001e\u0017s.X\u0018PUS\u0005\u0016$f:dl֤Eֺ3I\u001bÁ\u0017+8\u001a;Yltkj[(w\u0017\u000b\u0015';\u0017?\u0018\fx\u000bD`\u0019[\u000e\u0015mǲ\u0003݈v)\u0010ۭ\u0018{gb\t[4f\u0019xVI!\u000b\u0010z%˼~ġ#\"=\u0003u@\u000b@}Z5<.y*.C\u0002\u0014.ݩ-Ӡ̥\u000e%܌i\bDe\u001c\u0011ps.II[a[\u0015=PD#GޢG۳Τ\u0007Aީ8\u0011KJG\t~x\tY\u0019/\u0016f5-cߡXݍ>\u0013wϘ\u0005JmO\fC,%\u000fG3+eS\u0016~,\f3֦V؝\u000e\u0011\u0004ς\u0007\u0014\"c.j(n\u0017W\u001esFG\u0018ݨnƀ@\t,҉|X\u00164[T\u0018.@~\u000e`w\u000fEZ\u00014\u0012ٚ\u001a֭|b^ޠ\u001dbK\u000b/UQ\u0013\u001d_6zK03q|\u0013\u0006ѳ4ݏW!!\u001dp|\rluMR\u0003Q\u001bVi1\u000fSd[I0GB\f\u007fԝwƴ\u0010D ӽ5D\u001eJGe1a|`l!&\u0007\\\u0016\u000f\u0012\u0015c~&7\u0006\u0013|<MHSaĆ[ζsn5ًfy=u(\u00157F/:\u001a\u00134b)a\u001e5[Nyn\"A\u0014W\u0002L<Hvê3ؗx'dަ&h\u0010\u0013)Nf}$\u0019\u001a\tAavɏ:ؠxr\u0012ڔXR]9K\u0002Ao\no\u0006;X'Y}D\u0003\"Ж\u0005Ơgrkߛm\r\t\u001f?jJ\u0017;\u000b5\u000f=L\\L)ZhÎ\u0004*f+\u0018\u001a+%MoXbWց\u000e$?ҵwϪ_\u00133Ԛ\u0004,gl>\u000fn\u0014-7\u000e\bX\u0013x\u0015iۮ$˿fԚ`rJĠ&`pgr5\\E\">\u0017H\r\"C8T\r6d]HW_2ƭSֿ\u000b\nMÒ>#7\u0015M/\b>\u00193@v?\u000b\u0011Ŋ\u0001ʷ.B\u0011ۂPs:q^Tk\"}ڕ0މh\u0003.ɔ\u0016GPMD\u0011<We\u001fߣ$Bt\u001c\"\u0003_{\u0012+\u001fJ->\u0016q\u0017\u0019c6\u007f\u001e{ܼ\u0003Ϙ\u0005\rGƗ\u0002\u007fH@OrQOe\u0378'̩eծŝ4dͺ+\u000e\neXL\u001eud]y,w={\\P\u07bbB·\u000e#<&\fE1\u000bӝ1Q2bbȠr\"V\f&0U˽H\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016c\u0002", "", ":`h<h;']\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004\u00114", "/kX4a4>\\(e~g,\u000brAn\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ%}=\u001e\">", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/si:\u0005@\u000eU'Ki\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006R,9[\u0007(7v%\u0015QL;y\u001e0\u001ehn\u000f", "D`[BX", "", "1gX9W9>\\t|x^:\u000b\r8g]2\u0006M\u007f\u001b C~\u000eJU5B]\u0007\"\"t\u0012,MK;tC", "5dc\u0010[0ER&~\u0004:*z\t=s\u00041}\u001e\u000b!$Fs\u00178\u0006%C8\u000e-;v\u0018\u0019T?9k<\u001e\u001ew", "u(8", "Adc\u0010[0ER&~\u0004:*z\t=s\u00041}\u001e\u000b!$Fs\u00178\u0006%C8\u000e-;v\u0018\u0019T?9k<\u001e\u001ew", "uH\u0018#", "1gX9W9>\\t|x^:\u000b\r8gf2\u0006F|\u001a\u0017CnkF\u000124]\u0007\u001cFm$\r]P?t6\t\u001cd_9\u000fc5]", "5dc\u0010[0ER&~\u0004:*z\t=s\u00041}'\u000b!\u001dCr\u000e8u\u0003?c\u000b\u001f;v\u0012=MQ\u001a{A\"\u001ejL@\u0003a,Vv0V", "Adc\u0010[0ER&~\u0004:*z\t=s\u00041}'\u000b!\u001dCr\u000e8u\u0003?c\u000b\u001f;v\u0012=MQ\u001a{A\"\u001ejL@\u0003a,Vv0V", "", "1n^?W0GO(~\t:*z\t=s\u007f'ZP\u000e\u001b IW\u0018;z&9Y\u000b\u000b>i\u0014.UCDz", "5dc\u0010b6KR\u001d\bvm,\u000bd-c\u007f6\n@\u007fu'Ts\u0017>^/4]~$7z\u00015IA;s4'$", "u(I", "Adc\u0010b6KR\u001d\bvm,\u000bd-c\u007f6\n@\u007fu'Ts\u0017>^/4]~$7z\u00015IA;s4'$", "uY\u0018#", "1n^?W0GO(~\t:*z\t=s\u007f'ZP\u000e\u001b IZ\u00158t%=Y\u0007/", "5dc\u0010b6KR\u001d\bvm,\u000bd-c\u007f6\n@\u007fu'Ts\u0017>a,1W}(7v%", "Adc\u0010b6KR\u001d\bvm,\u000bd-c\u007f6\n@\u007fu'Ts\u0017>a,1W}(7v%", "\nrTA \u0006\u0017", "2dc.V/>Ry\f\u0005f\u0017x\u0016/n\u000f\u000f\u0006J\u0007\u0013\u001aGk\r'r3C", "5dc\u0011X;:Q\u001c~y?9\u0007\u0011\u001aa\r(\u0005Og!!Mk\u0011<r$ U\f.u}\u001a(ZCBk0,\u0015", "6dX4[;", "5dc\u0015X0@V(=\u000bb&\n\t6e{6{", ":`bA66Ga(\fvb5\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0019T:M1#\b\tm9x\r8t\u000eoZ2p\u001a)-\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006T/>g\r-3q\u001f=[\u0019", ":`bA?6HY\u0015\u0002zZ+Z\u00138s\u000f5wD\n&%", "5dc\u0019T:M:#\t\u0001Z/|\u0005.C\n1\nO\u000e\u0013\u001bP~\u001c\u0004U\u0017%\\\u0010\u0006I", ":`h<h;)S\"}~g.", "5dc\u0019T@Hc(izg+\u0001\u00121$\u0010,uM\u0001\u001e\u0017C}\u000e", ":`h<h;)S\"}~g.]\u0013<A\u0007,}I\t\u0017 V", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u0015IWE{C\f$dp9\\", ":`h<h;,b\u0015\u000ez", "5dc\u0019T@Hc(l\nZ;|G?iy5{G\u0001\u0013%G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.\f*7\u007f>.$Vp5\u0016c\u0002", ":n^8T/>O\u0018Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%\u0001Yx\u000eI", "5dc\u0019b6DO\u001c~v]\b\u0004\r1n\b(\u0005Og\u001b G}wN\u007f%B\u0018\u000e$1z\u00165M?Ik", ":n^8T/>O\u0018\\\u0005h9{\r8a\u000f(\n\u001c~\u0015\u0017U}\u000e;U5B]\u0007\"\u001fw\u00152NG;x\u001f%\u0011faA\u0007l;", "5dc\u0019b6DO\u001c~v]\n\u0007\u0013<d\u00041wO\u0001%rEm\u000eJ\u0005%48\u000e-;v\u0018\u0016WB?l8\u001e\"Sh5\u0005c4N\u007f6", "Adc\u0019b6DO\u001c~v]\n\u0007\u0013<d\u00041wO\u0001%rEm\u000eJ\u0005%48\u000e-;v\u0018\u0016WB?l8\u001e\"Sh5\u0005c4N\u007f6", ":n^8T/>O\u0018\\\u0005h9{\r8a\u000f(\n\u001c~\u0015\u0017U}\u000e;U5B]\u0007\"\"t\u0012,MK;tC", "5dc\u0019b6DO\u001c~v]\n\u0007\u0013<d\u00041wO\u0001%rEm\u000eJ\u0005%48\u000e-;v\u0018\u0019T?9k<\u001e\u001ew", "Adc\u0019b6DO\u001c~v]\n\u0007\u0013<d\u00041wO\u0001%rEm\u000eJ\u0005%48\u000e-;v\u0018\u0019T?9k<\u001e\u001ew", ":n^8T/>O\u0018evr6\r\u0018\u001ae\t'\u007fI\u0003", "5dc\u0019b6DO\u001c~v]\u0013x\u001d9u\u000f\u0013{I\u007f\u001b I.\u001e@p25`}\u001cEm", ":n^8T/>O\u0018evr6\r\u0018\u001ae\t'\u007fI\u0003w!TK\u0015@x.=Y\u0007/", ":n^8T/>O\u0018fzZ:\r\u0016/P\u007f1zD\n\u0019", "5dc\u0019b6DO\u001c~v]\u0014|\u0005=u\r(f@\n\u0016\u001bPqLLz\u001fBY\u0005 3{\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016cj5\u00011MHQ,XQ]9\" 9\u000eU+\u000f\u0001hAy", ":n^8T/>O\u0018ivl:[\t6e\u0002$\u000b@", "5dc\u0019b6DO\u001c~v]\u0017x\u0017=D\u007f/{B|&\u0017\u0006\u007f\u00126\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.4?OuD-shh9\t_;N5\u000eQVT(_Rn<~\u000eh\u001c-+\u0014\u0005[=3n\u001a", ";dP@h9>>\u0015\r\t=,\u0004\t1a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016cj6v#U\\[,GN\u0001Kr\u0012a\u000eP'\u001c\u0005/", "5dc\u001aX(Lc&~eZ:\u000bg/l\u007f*wO\u0001U'Ki\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.4?OuD-shh9\t_;N5\u000fGH\\<iR]9\" 9\u000eU+\u000f\u0001hAy", ";dP@h9>>\u0019\byb5~", "5dc\u001aX(Lc&~e^5{\r8g>8\u007f:\u000e\u0017\u001eGk\u001c<", "<dgA6/BZ\u0018e\u0005h2x\f/a~\u0013\u0003<~\u0017\u0001Tn\u000eI", "<dgA6/BZ\u0018i\u0002Z*|r<d\u007f5", "=tc2e\nH]&}~g(\f\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "5dc\u001ch;>`v\t\u0005k+\u0001\u0012+t\n5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", ">da3b9F;\u0019z\tn9|e6o}.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", ">da3b9F;\u0019z\tn9|f9n\u000e7\t<\u0005 &U", "\u0018", "EhSA[", "5dc$\\+MVW\u000f~X9|\u0010/a\u000e(", "3mbBe,%]#\u0005va,x\b\u000ee\u0007(}<\u0010\u0017tTo\nKv$", "3mbBe,%]#\u0005va,x\b\u000ee\u0007(}<\u0010\u0017tTo\nKv$si\u0002\u001aDm\u001d.IQ;", "7me._0=O(~eZ9|\u0012>D{7w", ";`a86/BZ\u0018\fzg\u000b\u0001\u0016>y", ";`a8?(R])\u000ee^5{\r8g", ";`a8?(R])\u000ee^5{\r8g>8\u007f:\u000e\u0017\u001eGk\u001c<", ";`a8?6HY\u0015\u0002zZ+c\u0005Co\u00107f@\n\u0016\u001bPq", ";`a8?6HY\u0015\u0002zZ+c\u0005Co\u00107f@\n\u0016\u001bPqLLz\u001fBY\u0005 3{\u0016", ";`a8?6HY\u0015\u0002zZ+d\t+s\u00105{+\u0001 \u0016Kx\u0010", ";`a8?6HY\u0015\u0002zZ+d\t+s\u00105{+\u0001 \u0016Kx\u0010z\u0007)/f}'7i$.", ";`a8@,:a)\fzI,\u0006\b3n\u0002", ";`a8@,:a)\fzI,\u0006\b3n\u0002f\fDz$\u0017No\nJv", "=m2<b9=W\"z\n^:l\u0017/d", ">da3b9F:#\t\u0001Z/|\u0005.M\u007f$\nP\u000e\u0017", "1n]@g9:W\"\u000e\t", ">da3b9F:#\t\u0001Z/|\u0005.M\u007f$\nP\u000e\u0017^$\\|I\u000b/\u007f", "uI\u0018#", ">da3b9F;\u0019z\tn9|", ">da3b9F;\u0019z\tn9|P\fRn5\u0010JK", "@db2g\bEW\u001b\b\u0003^5\fo3n\u007f6", "CoS.g,)O&~\u0004m\u000bx\u0018+", "\u001an^8T/>O\u0018ivl:[\t6e\u0002$\u000b@", "\u001bdP@h9>>\u0015\r\t=,\u0004\t1a\u000f(", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutNodeLayoutDelegate {
    public static final int $stable = 8;
    private int childrenAccessingCoordinatesDuringPlacement;
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;
    private final LayoutNode layoutNode;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;
    private boolean lookaheadCoordinatesAccessedDuringPlacement;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;
    private LookaheadPassDelegate lookaheadPassDelegate;
    private boolean measurePending;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;
    private LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate();
    private long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final Function0<Unit> performMeasureBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.getOuterCoordinator().mo5514measureBRTryo0(this.this$0.performMeasureConstraints);
        }
    };

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    /* JADX INFO: renamed from: getLastConstraints-DWUhwKw */
    public final Constraints m5682getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m5690getLastConstraintsDWUhwKw();
    }

    /* JADX INFO: renamed from: getLastLookaheadConstraints-DWUhwKw */
    public final Constraints m5683getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.m5685getLastConstraintsDWUhwKw();
        }
        return null;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    public final boolean getDetachedFromParentLookaheadPass$ui_release() {
        return this.detachedFromParentLookaheadPass;
    }

    public final LayoutNode.LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePending;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutPending;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.lookaheadMeasurePending;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.lookaheadLayoutPending;
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z2) {
        if (this.coordinatesAccessedDuringPlacement != z2) {
            this.coordinatesAccessedDuringPlacement = z2;
            if (!z2 || this.coordinatesAccessedDuringModifierPlacement) {
                if (z2 || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
                return;
            }
            setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
        }
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z2) {
        if (this.coordinatesAccessedDuringModifierPlacement != z2) {
            this.coordinatesAccessedDuringModifierPlacement = z2;
            if (!z2 || this.coordinatesAccessedDuringPlacement) {
                if (z2 || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
                return;
            }
            setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
        }
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i2) {
        int i3 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i2;
        if ((i3 == 0) != (i2 == 0)) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutDelegate$ui_release() : null;
            if (layoutDelegate$ui_release != null) {
                if (i2 == 0) {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate$ui_release.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    public final void setLookaheadCoordinatesAccessedDuringPlacement(boolean z2) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z2) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z2;
            if (!z2 || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                if (z2 || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                return;
            }
            setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
        }
    }

    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    public final void setLookaheadCoordinatesAccessedDuringModifierPlacement(boolean z2) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z2) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z2;
            if (!z2 || this.lookaheadCoordinatesAccessedDuringPlacement) {
                if (z2 || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                return;
            }
            setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
        }
    }

    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    public final void setChildrenAccessingLookaheadCoordinatesDuringPlacement(int i2) {
        int i3 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i2;
        if ((i3 == 0) != (i2 == 0)) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutDelegate$ui_release() : null;
            if (layoutDelegate$ui_release != null) {
                if (i2 == 0) {
                    layoutDelegate$ui_release.setChildrenAccessingLookaheadCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate$ui_release.setChildrenAccessingLookaheadCoordinatesDuringPlacement(layoutDelegate$ui_release.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.measurePassDelegate;
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui_release = this.layoutNode.getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null && lookaheadPassDelegate.getLayingOutChildren()) {
                setLookaheadCoordinatesAccessedDuringPlacement(true);
            } else {
                setLookaheadCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
    }

    /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яī\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\rfr9FDmHDR[ճ\u0017k\u00124,[*rK;c8\u0006\"\u000fPVguwRZ\u0011I\u0017\u0006,xr,O^\u0001](\u000f:Bu@;M\u0006=Aś|6\u001b :\"Ny\r\u0001(*P\u0010\rzKŷ\u0014\u0012F@x:X\rU\u0005(\u0017\u000e>&\u0002&\\}N>ԟt]P/+\u0003oEV'm6\u0005M\u0013N\\'\u001bǸi\u001e1Q?5#G[\u0003\u001dRc?\try=\u001bh/'1Iyɕ8nÜD\u0015YN=]!&\r\u0005\u007fa<'YQ$Nח\u0012(\u0006}D\u001fJa&\u00127J>-HF\u0018\u0010Ct!\u0013n/Hr\u000b\u0006\tBN\u0017S-y+\u0002!t3y;G{}{M',\u0006\u0019nO\t\u0005\u001enx3`\bSAQn>XP\u001aYk\u001b2\u001c)\u0016r#>,\u0018/*>^+3\u001bsI3'{\u0006vֳ8v3fxUyRvmP\u001a\\ն0Q\u001bh*|\u0005\u001a\u0010\u0005\\:we\u001c\u0003fD݈\u0013hh\u0006$9%>{\u007flwSe]85wjEC\u0007k<\u0005\u0002dA ic>\u000f\u0019\u000b\\JJN\u001dX\u0015o\u001aێȺ`((\u001f\u0011p\u001ee\u0014D|9Y2\bw*#D1G\n[HK,P1\u0015\t\u000e\u001a\u0019\u0014\rEK$1)j\tQ\u000f^N\to\u00168y0\u000bS:-o\u0011{-nm0\\L|Q\u0007/w\u000e<\u007fLuq3*çTݨ°\u001a\u001c?G=4[\u0013\r!J\u0002[r\u0015\u0001sJe\u0012U:-}\u001d,\u0001.\u0016G1\u0005tnxDgTEa'b\u0001\u0016 d.9(ZCKqO#[lv;\tg8f8+2e\u001em\u0007}\u001f\u00155[pm\u001d^{\"--a\f\u00178;\bʭ\u000e>t\u00141rϣ݁scWϣ1\u0004xWʵ}V\"R\u001a3GV۷v B7d=7V\u001c|p\u0005k}#=̓e\u001f?\u001drf[h?\u007f\u007fD.\u000eW\nB,?ڎG%\u0017{\u001ayȓlжů\u000fN\u0015Ϟ\n\nωmZIKյUob7]6x&݁@Sb3l9(B\u0007T\b9v\u0005n\u0014ؓy\u0018F\u000e8]D÷rĩټ\u0012X~ֺUVμ_\u000ee/ƫ\u007f\u0017\u000faKA\u0001?ܕl^T]\u0011b\u0006a߽\b3j}/\u0017)9\u001fl9I[\t\u0019\u0019Ժ\\[\\\u00128\u0014GW\u001a{q\u001c8F*3AFFʦU\u0011e%`e\u0019٥cff\r\u0011\u0015{\u0015\"Ə}ғէ\u0012@\u0010ۓ\n'ۧq8.;ٙM\u00107qG1\u001cR͌\u0006$|\u0012vK1\u0014\u0010E=w\u001eD?\n߿RS\u0011\u0018\"0'2!1^g\u000e\u00157s\u001ahAޭ\u001ab\b7CW.ɔ-bv\t\t\\1|Oه2øեb]qջ NӜ*5\u001fPžg\u0011\n\u0012|\u0014rc\u007f\u001bf_{Ԭm߲ȃ!\r-Ӟ-!͏Y\u0003\u0016aރW)\u007fBBn&DʞaA\u0010}\u0011/\u00054ViÓ*GkX\u000fwD\u001b/\fλx\u000e\u0004X\u0002X\u001bI܅LVe7϶k\tWVcx܃c\r\fW$M\u0015Vb)\u001dDL\u0003\"\u0013ӵ\b\u0019Ma;L7ԅ\u0006٣M&)ܐ#Q)>J\u000b\u001e0Mׂ\u0005̯fz\b˟Z\u000bx\tu6}bbH21i*}h1\u0379\u001cEfH68GLgː\\ߣ$Bt\u001c\"H_A\u00121\u001f\u0010-84\u007f]ؓA֚U_-ܹ\u0019~\u0007\u001eM\fQm@\u0007E\u0007sG\u001d\u00053W\u0015K{ˠqͺ+\u0018\nʆb\u0001Syd!\u0002.OLS2JgN\u0018\"\u001fR=<JyǞG˜L.w^Fp\u0002rTH8S\u0007DQW\u001d|\u0002&DiF\u0004#*8ƁM˒\u0018%LëB/r$S_\t{\u0011b\u001bYdY\u001d%A3E\r@S\u007f\\CI!]m\u001b4ٱ\u001fű\bF:݃N{M_g<&/\u0018tq~;\u0010_\u0002(8@\u001d=\b\u0006Rj`.p[l}֦\u0003̒:h\u0001\u0090Yd\u0011b\u001d6~0H/\u0019\u001afEV;\u001a\u007f`_C8i\fڌ@ڧ\u0381Uzؗ!\u0015s'\fKu\u0012\u0018Mc\u001ap?O29\u0017!ղAǙ`\u0005]ؽ\u001c\u00049?\u0018};0WVlF:Z\u0016\u000es\u0012^\u000fr$ه,m6^\u0007ɲ\u000b\u0082G]\tߵoQcD}~`\u0013\u000e֤p˨*ŋɓmQї'/\u0001\u0002\u0011A\u0012%!=6Sgeyє\u0019жB{\u0010֟\u001aq\u000b\"a\u00101qz%=\"W/o[+\u0017<Ǳ%ٮC\u0005\u0014Ԍ?&\fH2t8%wD:e\u0013NFVWuy\u0011g\u07b2Dً\u0013z|ޛ~$F\u000e\u001e=4J9ɐAņcL4Ȩ\t\u000bM\nx7Jgu#\u0003\u0017\u001eW941>_1G8&ȇ\u0016،U`p@\u001d\u00184\u0002c\u000e(_>a*X\u007fܩ#ƬgmrԔ%r\u001f\u001dLk^$0G=ͺ@ͷB@`n\u001f+]?k]R(!`\u001fX\u0018řn܍0'>Ų;%\u000fGcaE$\u000eݱ\u0003ƛk3Bɉ26a%=I`\u0005<k\u0018Lkُ_ֈ:\u0011\b.\u0003]\u0013\b7\u0013\u00128\u001dOF\u0003\u001aybLh\\4/p&\u001c3Fzdۿ\t۶0t[߰iw%?rLs*(\u0010o9u1iл%۠\f2UëK\u000bf,=.*EO\u0016P\u0018Mlo3:s.Ŵ[͇a$1Կ\u0002y&]ySTuXtgor\u0013m.{%5\u0011\u0013հCӫ\u000e\"1ͣX#5T`6`1PLWضBφNfvݰu(s_G\b\u0006\u0010Bml v_w4ojk\\-pԿ3q\u000ey ԇ\u000b֖K\u000eQڿ\u000bcZB\u000e[k\u0005lߕ\u0013پ\u0003έ\u0602r_ݖF\u0019\u007f\bpe<F\n\u001d\u001b\u0014\u0019~\u0005ߑfɼrl~ʶ2\u001cKl%\u00143NJޱ/կ)_h݃PW\u0017H57\u007f\u0005\u0015\u000fR-@``}PO\u001fڗrÝ\u001f\b\rċ|\u001c\u001c\u0012S:\u0011W#5\u001cg\u0012ax٬T̉,/\u0012ϔfR+ZM9;'\u0001bC\u0004v\t\u0004VLgEʴ\u0014Ë48Oɴr\"57\u0016jθfUX\u0010Gؗ\t\\u~r\u001d^ʸ\u0006ȡD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016cj6v#U\\[,GN\u0001Kr\u0012a\u000eP'\u001c\u0005/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ%}=\u001e\">", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uF\u0006)?bj 8m#.VA;V;\u001a\u0013hi9\u0010r\u000bN}'IH],2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0015IWE{C|\u0015oa;\u0003r,$:\u0018", "-bW6_+\u001dS ~|Z;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016c\u0002", "/kX4a4>\\(e~g,\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ\u0011", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006R,9[\u0007(7v%\u0015QL;y\n", "1gX9W\u000b>Z\u0019\u0001vm,\u000b", "", "5dc\u0010[0ERw~\u0002^.x\u0018/s>8\u007f:\u000e\u0017\u001eGk\u001c<", "u(;7T=:\u001d)\u000e~euc\r=tU", "1gX9W\u000b>Z\u0019\u0001vm,\u000bg3r\u000f<", "", "5dc\u0010[0ERw~\u0002^.x\u0018/s^,\tO\u0015U'Ki\u001b<}%1g}", "u(I", "Adc\u0010[0ERw~\u0002^.x\u0018/s^,\tO\u0015U'Ki\u001b<}%1g}", "uY\u0018#", "2ta6a.\u001aZ\u001d\u0001\u0004f,\u0006\u0018\u0016i\t(\n,\u0011\u0017$[", "5dc\u0011h9B\\\u001bZ\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%\u0003Wo\u001bP559S\u000b >m\u0012<M", "Adc\u0011h9B\\\u001bZ\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%\u0003Wo\u001bP559S\u000b >m\u0012<M", "7m]2e\nH]&}~g(\f\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "5dc\u0016a5>`v\t\u0005k+\u0001\u0012+t\n5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", "\nrTA \u0006\u0017", "7r?9T*>R", "Adc\u001d_(<S\u0018=\u000bb&\n\t6e{6{", "7r?9T*>Ru\u0013eZ9|\u0012>", "Adc\u001d_(<S\u0018[\u000fI(\n\t8t>8\u007f:\u000e\u0017\u001eGk\u001c<", "<df", "7r?9T*>R\t\by^9d\u0013>i\n1\\M|\u001f\u00171pz<w%BY\u0007\u001e7", "Adc\u001d_(<S\u0018n\u0004],\np9t\u00042\u0005!\u000e\u0013\u001fGY\u000f)v&5f})5m", ":`bA66Ga(\fvb5\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0019T:M1#\b\tm9x\r8t\u000eoZ2p\u001a)-\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006T/>g\r-3q\u001f=[\u0019", ":`bA8?IZ\u001d|~m\u0013x\u001d/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ":`bA?(RS&[\u0002h*\u0003", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ":`bAC6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "\u0018", ":`bAM\u0010GR\u0019\u0012", "", ":`h6a.(c(\\}b3{\u0016/n", "5dc\u0019T@B\\\u001bh\u000bm\n\u007f\r6d\r(\u0005", ":`h<h;\u001cV\u001d\u0006yk,\u0006e6o}.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";dP@h9>Ru\u0013eZ9|\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u001e[?=k\u00112\u007fdn9\u0010r\u0002", "5dc\u001aX(Lc&~y;@g\u0005<e\t7:P\u0005\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.\f3Ig6\u001eq|L5\u0014c5]L", "Adc\u001aX(Lc&~y;@g\u0005<e\t7:P\u0005\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016l=Q7m4z)S]F\u0007l;$:\u0018", ";dP@h9>R{~~`/\f", "", "5dc\u001aX(Lc&~yA,\u0001\u000b2t", "u(8", ";dP@h9>R\u0003\bx^", ";dP@h9>R\u000b\u0003ym/", "5dc\u001aX(Lc&~yP0{\u00182", "<dT1f\nH]&}~g(\f\t=U\u000b'wO\u0001", "=m=<W,)Z\u0015|z]\nx\u00106e~", ">`a2a;\u001aZ\u001d\u0001\u0004f,\u0006\u0018\u0016i\t(\n*\u0013 \u0017T", "5dc\u001dT9>\\(Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%\u0001Yx\u000eI", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006R,9[\u0007(7v%\u0015QL;y\u001e0\u001ehn\u000f", "", ">`a2a;\u001dO(z", "5dc\u001dT9>\\(]vm(", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ">`a2a;\u001dO(zYb9\f\u001d", ">kP0X\u0016KR\u0019\f", "5dc\u001d_(<S\u0003\fy^9;\u00193_\r(\u0003@|%\u0017", ">kP0X\u0016Nb\u0019\fXh6\n\b3n{7\u0006M]\u001e!Eu", ">kP0X\u0016Nb\u0019\fXh6\n\b3n{7\u0006Mg\u0013+G|", ">kP0X\u0016Nb\u0019\fXh6\n\b3n{7\u0006Mg\u0013+G|jC\u0001#;", ">kP0X\u0016Nb\u0019\fXh6\n\b3n{7\u0006Mk!%K~\u0012F\u007f", ">kP0X\u0016Nb\u0019\fXh6\n\b3n{7\u0006Muz Fo!", ">kP0X+(\\\u0017~", ">qTC\\6Na\u0004\u0006v\\,f\u0016.e\r", "5dc\u001de,OW#\u000f\tI3x\u0007/O\r'{M?'\u001bA|\u000eCv!CY", "@d[.l6Nb\u000b\u0003\na6\r\u0018\u001aa\r(\u0005Od \u0002Ty\u0010Iv3C", "HH]1X?", "5dc'<5=S,=\u000bb&\n\t6e{6{", "u(5", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "1gT0^\nAW }\b^5g\u0010+c\u007f\u0012\t?\u0001$wQ|}Gu!DY\f", "1kT.e\u0017EO\u0017~dk+|\u0016", "4na\u0012T*A1\u001c\u0003\u0002]\b\u0004\r1n\b(\u0005Og\u001b G}wN\u007f%B", "0k^0^", "4na\u0012T*A1\u001c\u0003\u0002]\u000b|\u0010/g{7{", "5dc", "/kX4a4>\\(e~g,", "7me._0=O(~^g;\n\r8s\u0004&\n+|$\u0017P~", "4na0X\u0019>_)~\tm", "7me._0=O(~eZ9|\u0012>D{7w", ":`h<h;\u001cV\u001d\u0006yk,\u0006", ";`a87,MO\u0017\u0002z]\r\n\u00137P{5{I\u0010}!Qu\n?v!4Dy.E", ";`a87,MO\u0017\u0002z]\r\n\u00137P{5{I\u0010}!Qu\n?v!4Dy.E,&2GP;r4\u001a#h", ";`a8A6=St\byL<y\u0018<e\u007f\u0004\n+\b\u0013\u0015Gn", ";`a8F<;b&~z::e\u0013>P\u0007$y@\u007f", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bukik@\u0007S", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Nk\"F\u00074~D\u0005\u001c5m\u0012+TC\u0011", ";dP@h9>0\u0015\rz]\u0016\u0006o9o\u0006$~@|\u0016", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "<nc6Y@\u001cV\u001d\u0006yk,\u0006x=i\t*YJ\u000b$\u0016Kx\nKv3'\\\u0002'7X\u001d*KGDm", "=m12Y6KS\u007fz\u000fh<\ff2i\u0007'\t@\n", "=m8;g9B\\'\u0003xl\u0018\r\t<i\u007f'", "=m=<W,\u001dS(zxa,{", "=m=<W,)Z\u0015|z]", "=m=<W,)Z\u0015|z]j\r\r)r\u007f/{<\u000f\u0017", ">kP0X\bM", ">nb6g0H\\", ":`h2e\tE]\u0017\u0005", ">kP0X\bM\u001b\u001aQ\u000eO\u000e\u0006\u0013", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1\u0007", ":`h2e", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG'3\u0002\u0016;\u0017%Hg?!\u0019fo \u0003w,[Lj8", ">kP0X\t:a\u0019}dg\u0013\u0007\u00135a\u0003(w?", ">kP0X\u0016Nb\u0019\fXh6\n\b3n{7\u0006M", ">kP0X\u0016Nb\u0019\fXh6\n\b3n{7\u0006MH~}I\u0003j6E", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016P9X]uA\u0012 $\u0015J?\r\u0012##1jO:#\u0006:0}Oh\u000eaY~", ">kP0X\u001a>Z\u001a", ">kP0X\u001a>Z\u001aFbE.\u0010e)4", "@d\\2T:N`\u0019", "@d\\2T:N`\u0019FWK\u001b\n\u001d90", "uI\u0018'", "@d_9T*>", "@d`BX:M:\u0015\u0013\u0005n;", "@d`BX:M;\u0019z\tn9|", "BqP0^\u0014>O'\u000f\b^4|\u0012>B\u0014\u0013wM\u0001 &", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "CoS.g,)O&~\u0004m\u000bx\u0018+", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private boolean isPlacedByParent;
        private boolean isPlacedUnderMotionFrameOfReference;
        private GraphicsLayer lastExplicitLayer;
        private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;
        private boolean measuredOnce;
        private boolean needsCoordinatesUpdate;
        private boolean onNodePlacedCalled;
        private Object parentData;
        private final Function0<Unit> placeOuterCoordinatorBlock;
        private GraphicsLayer placeOuterCoordinatorLayer;
        private Function1<? super GraphicsLayerScope, Unit> placeOuterCoordinatorLayerBlock;
        private float placeOuterCoordinatorZIndex;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private float zIndex;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = IntOffset.Companion.m6776getZeronOccac();
        private boolean parentDataDirty = true;
        private final AlignmentLines alignmentLines = new LayoutNodeAlignmentLines(this);
        private final MutableVector<MeasurePassDelegate> _childDelegates = new MutableVector<>(new MeasurePassDelegate[16], 0);
        private boolean childDelegatesDirty = true;
        private final Function0<Unit> layoutChildrenBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.clearPlaceOrder();
                this.this$0.forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                    }
                });
                this.this$0.getInnerCoordinator().getMeasureResult$ui_release().placeChildren();
                this.this$0.checkChildrenPlaceOrderForUpdates();
                this.this$0.forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui_release());
                    }
                });
            }
        };
        private long placeOuterCoordinatorPosition = IntOffset.Companion.m6776getZeronOccac();

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public MeasurePassDelegate() {
            this.placeOuterCoordinatorBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Placeable.PlacementScope placementScope;
                    NodeCoordinator wrappedBy$ui_release = layoutNodeLayoutDelegate.getOuterCoordinator().getWrappedBy$ui_release();
                    if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                        placementScope = LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate.layoutNode).getPlacementScope();
                    }
                    LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
                    Function1<? super GraphicsLayerScope, Unit> function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                    GraphicsLayer graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
                    if (graphicsLayer != null) {
                        placementScope.m5593placeWithLayeraW9wM(layoutNodeLayoutDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, graphicsLayer, measurePassDelegate.placeOuterCoordinatorZIndex);
                    } else if (function1 == null) {
                        placementScope.m5584place70tqf50(layoutNodeLayoutDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex);
                    } else {
                        placementScope.m5592placeWithLayeraW9wM(layoutNodeLayoutDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex, function1);
                    }
                }
            };
        }

        public final int getPreviousPlaceOrder$ui_release() {
            return this.previousPlaceOrder;
        }

        public final int getPlaceOrder$ui_release() {
            return this.placeOrder;
        }

        /* JADX INFO: renamed from: getLastConstraints-DWUhwKw */
        public final Constraints m5690getLastConstraintsDWUhwKw() {
            if (this.measuredOnce) {
                return Constraints.m6579boximpl(m5574getMeasurementConstraintsmsEJaDk());
            }
            return null;
        }

        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z2) {
            this.duringAlignmentLinesQuery = z2;
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.parentData;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        public void setPlaced$ui_release(boolean z2) {
            this.isPlaced = z2;
        }

        public final boolean isPlacedByParent() {
            return this.isPlacedByParent;
        }

        public final void setPlacedByParent$ui_release(boolean z2) {
            this.isPlacedByParent = z2;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.childDelegatesDirty;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z2) {
            this.childDelegatesDirty = z2;
        }

        public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.updateChildrenIfDirty$ui_release();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.asMutableList();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<MeasurePassDelegate> mutableVector = this._childDelegates;
            MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector2.getContent();
                int i2 = 0;
                do {
                    LayoutNode layoutNode2 = content[i2];
                    if (mutableVector.getSize() <= i2) {
                        mutableVector.add(layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                    } else {
                        mutableVector.set(i2, layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                    }
                    i2++;
                } while (i2 < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.asMutableList();
        }

        public final void markDetachedFromParentLookaheadPass$ui_release() {
            LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = true;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            if (LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.layoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, this.layoutChildrenBlock);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        public final void checkChildrenPlaceOrderForUpdates() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    LayoutNode layoutNode2 = content[i2];
                    if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                        layoutNode.onZSortedChildrenInvalidated$ui_release();
                        layoutNode.invalidateLayer$ui_release();
                        if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            layoutNode2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        }
                    }
                    i2++;
                } while (i2 < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i2 = 0;
                setPlaced$ui_release(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
                for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                    outerCoordinator$ui_release.releaseLayer();
                }
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        content[i2].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        i2++;
                    } while (i2 < size);
                }
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean zIsPlaced = isPlaced();
            setPlaced$ui_release(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            if (!zIsPlaced) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
                } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
                }
            }
            NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    LayoutNode layoutNode2 = content[i2];
                    if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        layoutNode2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
                    }
                    i2++;
                } while (i2 < size);
            }
        }

        public final float getZIndex$ui_release() {
            return this.zIndex;
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
            NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
                zIndex += layoutModifierNodeCoordinator.getZIndex();
                outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!isPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                    if (!(this.placeOrder == Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
                    }
                    this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder;
                    parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder++;
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        public final void clearPlaceOrder() {
            LayoutNodeLayoutDelegate.this.nextChildPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    MeasurePassDelegate measurePassDelegate$ui_release = content[i2].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
                    measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    measurePassDelegate$ui_release.isPlacedByParent = false;
                    if (measurePassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i2++;
                } while (i2 < size);
            }
        }

        private final void forEachChildDelegate(Function1<? super MeasurePassDelegate, Unit> function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    function1.invoke(content[i2].getMeasurePassDelegate$ui_release());
                    i2++;
                } while (i2 < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo5514measureBRTryo0(long j2) {
            if (LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                lookaheadPassDelegate$ui_release.mo5514measureBRTryo0(j2);
            }
            trackMeasurementByParent(LayoutNodeLayoutDelegate.this.layoutNode);
            m5691remeasureBRTryo0(j2);
            return this;
        }

        /* JADX INFO: renamed from: remeasure-BRTryo0 */
        public final boolean m5691remeasureBRTryo0(long j2) {
            if (LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            boolean z2 = true;
            LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
            if (!LayoutNodeLayoutDelegate.this.layoutNode.getMeasurePending$ui_release() && Constraints.m6584equalsimpl0(m5574getMeasurementConstraintsmsEJaDk(), j2)) {
                Owner.forceMeasureTheSubtree$default(ownerRequireOwner, LayoutNodeLayoutDelegate.this.layoutNode, false, 2, null);
                LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                return false;
            }
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                    invoke2(alignmentLinesOwner);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                }
            });
            this.measuredOnce = true;
            long jMo5522getSizeYbymL2g = LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo5522getSizeYbymL2g();
            m5577setMeasurementConstraintsBRTryo0(j2);
            LayoutNodeLayoutDelegate.this.m5681performMeasureBRTryo0(j2);
            if (IntSize.m6806equalsimpl0(LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo5522getSizeYbymL2g(), jMo5522getSizeYbymL2g) && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight() == getHeight()) {
                z2 = false;
            }
            m5576setMeasuredSizeozmzZPI(IntSizeKt.IntSize(LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth(), LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight()));
            return z2;
        }

        private final void trackMeasurementByParent(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure$ui_release())) {
                    InlineClassHelperKt.throwIllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
                int i2 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i2 == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i2 == 2) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.Measuring) {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            int i2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i2;
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno */
        public void mo5515placeAtf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            m5689placeSelfMLgxB_4(j2, f2, function1, null);
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno */
        public void mo5575placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) {
            m5689placeSelfMLgxB_4(j2, f2, null, graphicsLayer);
        }

        @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public boolean isPlacedUnderMotionFrameOfReference() {
            return this.isPlacedUnderMotionFrameOfReference;
        }

        @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public void setPlacedUnderMotionFrameOfReference(boolean z2) {
            boolean zIsPlacedUnderMotionFrameOfReference = LayoutNodeLayoutDelegate.this.getOuterCoordinator().isPlacedUnderMotionFrameOfReference();
            if (z2 != zIsPlacedUnderMotionFrameOfReference) {
                LayoutNodeLayoutDelegate.this.getOuterCoordinator().setPlacedUnderMotionFrameOfReference(zIsPlacedUnderMotionFrameOfReference);
                this.needsCoordinatesUpdate = true;
            }
            this.isPlacedUnderMotionFrameOfReference = z2;
        }

        /* JADX INFO: renamed from: placeSelf-MLgxB_4 */
        private final void m5689placeSelfMLgxB_4(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1, GraphicsLayer graphicsLayer) {
            Placeable.PlacementScope placementScope;
            this.isPlacedByParent = true;
            if (!IntOffset.m6765equalsimpl0(j2, this.lastPosition) || this.needsCoordinatesUpdate) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                    LayoutNodeLayoutDelegate.this.layoutPending = true;
                    this.needsCoordinatesUpdate = false;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                NodeCoordinator wrappedBy$ui_release = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy$ui_release();
                if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                    placementScope = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode).getPlacementScope();
                }
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeLayoutDelegate.getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                LayoutNode parent$ui_release = layoutNodeLayoutDelegate.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate$ui_release.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                Placeable.PlacementScope.place$default(placementScope, lookaheadPassDelegate$ui_release, IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2), 0.0f, 4, null);
            }
            LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if ((lookaheadPassDelegate$ui_release2 == null || lookaheadPassDelegate$ui_release2.getPlacedOnce$ui_release()) ? false : true) {
                InlineClassHelperKt.throwIllegalStateException("Error: Placement happened before lookahead.");
            }
            m5688placeOuterCoordinatorMLgxB_4(j2, f2, function1, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeOuterCoordinator-MLgxB_4 */
        private final void m5688placeOuterCoordinatorMLgxB_4(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1, GraphicsLayer graphicsLayer) {
            if (LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
            this.lastPosition = j2;
            this.lastZIndex = f2;
            this.lastLayerBlock = function1;
            this.lastExplicitLayer = graphicsLayer;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
            if (!LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release() && isPlaced()) {
                LayoutNodeLayoutDelegate.this.getOuterCoordinator().m5739placeSelfApparentToRealOffsetMLgxB_4(j2, f2, function1, graphicsLayer);
                onNodePlaced$ui_release();
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                this.placeOuterCoordinatorLayerBlock = function1;
                this.placeOuterCoordinatorPosition = j2;
                this.placeOuterCoordinatorZIndex = f2;
                this.placeOuterCoordinatorLayer = graphicsLayer;
                ownerRequireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(LayoutNodeLayoutDelegate.this.layoutNode, false, this.placeOuterCoordinatorBlock);
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    InlineClassHelperKt.throwIllegalStateException("replace called on unplaced item");
                }
                boolean zIsPlaced = isPlaced();
                m5688placeOuterCoordinatorMLgxB_4(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (zIsPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i2) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i2) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i2) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i2) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(i2);
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release;
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, false, 7, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i2 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i2 == 1) {
                intrinsicsUsageByParent$ui_release = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i2 == 2) {
                intrinsicsUsageByParent$ui_release = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                intrinsicsUsageByParent$ui_release = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(intrinsicsUsageByParent$ui_release);
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public final boolean updateParentData() {
            if ((getParentData() == null && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData() == null) || !this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            this.parentData = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData();
            return true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(Function1<? super AlignmentLinesOwner, Unit> function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    function1.invoke(content[i2].getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
                    i2++;
                } while (i2 < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, false, 7, null);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode = content[i2];
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                i2++;
            } while (i2 < size);
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    LayoutNode layoutNode2 = content[i2];
                    if (layoutNode2.getMeasurePending$ui_release() && layoutNode2.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m5665remeasure_Sx5XlM$ui_release$default(layoutNode2, null, 1, null)) {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, false, 7, null);
                    }
                    i2++;
                } while (i2 < size);
            }
        }

        public final void invalidateIntrinsicsParent(boolean z2) {
            LayoutNode layoutNode;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                do {
                    layoutNode = parent$ui_release;
                    if (layoutNode.getIntrinsicsUsageByParent$ui_release() != intrinsicsUsageByParent$ui_release) {
                        break;
                    } else {
                        parent$ui_release = layoutNode.getParent$ui_release();
                    }
                } while (parent$ui_release != null);
                int i2 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i2 == 1) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, z2, false, false, 6, null);
                } else {
                    if (i2 == 2) {
                        layoutNode.requestRelayout$ui_release(z2);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }

        public final void measureBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("layoutNode parent is not set");
                throw new KotlinNothingValueException();
            }
            if (lookaheadPassDelegate$ui_release != null) {
                if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                    Constraints constraintsM5685getLastConstraintsDWUhwKw = lookaheadPassDelegate$ui_release.m5685getLastConstraintsDWUhwKw();
                    Intrinsics.checkNotNull(constraintsM5685getLastConstraintsDWUhwKw);
                    mo5514measureBRTryo0(constraintsM5685getLastConstraintsDWUhwKw.m6597unboximpl());
                    return;
                } else {
                    if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InLayoutBlock || parent$ui_release.getLayoutState$ui_release() != LayoutNode.LayoutState.LayingOut) {
                        return;
                    }
                    Constraints constraintsM5685getLastConstraintsDWUhwKw2 = lookaheadPassDelegate$ui_release.m5685getLastConstraintsDWUhwKw();
                    Intrinsics.checkNotNull(constraintsM5685getLastConstraintsDWUhwKw2);
                    mo5514measureBRTryo0(constraintsM5685getLastConstraintsDWUhwKw2.m6597unboximpl());
                    return;
                }
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("invalid lookaheadDelegate");
            throw new KotlinNothingValueException();
        }

        public final void placeBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                m5689placeSelfMLgxB_4(lookaheadPassDelegate$ui_release.m5686getLastPositionnOccac$ui_release(), lookaheadPassDelegate$ui_release.getLastZIndex$ui_release(), lookaheadPassDelegate$ui_release.getLastLayerBlock$ui_release(), lookaheadPassDelegate$ui_release.getLastExplicitLayer$ui_release());
            } else {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("invalid lookaheadDelegate");
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яı\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\rfr9FDmHDR[ճ\u0017k\u00124,[*rK;c8\u0006\"\u000fPVguwRZ\u0011I\u0017\u0006,xr,O[\u0001](\u000f:Bu@;M\u0006=A`z7\r H\"@y\u001b\u0001\"*V\u0010~zYK\u0014\u00126Ax:h\rU\u0005 \u0014\u000e>.\u0006&\\mS>H\u0003]B/)\u0004qBd'g0\u0003P\u0015Fb-\u0015vg%3@Eߎ\u001d%Y\u000f\u000fRia\u000b?\b=\rh-U3I\nW>X\u0006\u0014\u001bۇQ#ƞ#&\u000b\u0004\u0002`:'[O\u0012L\u0001\u000eVy;~Ɂ@\u0004\u001c\toZ<\u000e2r\u0018\u0010Ct!6PR\u0012^pH)C|+m\u0006A\u000fQ\u001b\u0015}(;aTE`\u001d\rLOGniubsx\u0015I\u0001(a?8XIXP\u001aYkn\u0014rr\u0002X0^qFCD0<~=7\neS5yh`Tw|\u0015d\u0017ׅ:RvF2p&7X5:\u0005\u000bߢ\u000b4_bAD\u0011{d\u0005\u000b\fq+ \u000bZ\u0003ư%XZ]S\u0002j{\n:)=ROY\u001d{V[GKK5\u007f\u0010Xg`d,?j\u000fKl/Hazr\\VNxH3\u0016\u0006k\\N:?x?:*B\u001dI\u0019\u000b]x\u0007,4Y|7(!|X\rb&<\u0003\u0018l%\r\u000fDtp\u001e0?]t\u0015n\u0017EA\u007f4I*c\u0018\u00014+EM\u0013ϗ~øѨPIRc$m\u001e\n.\u000f29\u007fwm\u0017\u001dpA20u\f`;s_G*')E*\u0013I\\Fg637@)nXJl\u0017P#'x1\u0004|\u007f(\u000e\rz\u0010ib\bs>w\u001fIY\u0005RFz\u001d\u001fLQI|0ĝ4ECUI\\ߐӄ3\u0016gӢh8o\bʯ\u000e>t\u00140\\h$˵ai]`lhNg˟=:$\u001b9r`x̱\u0007Z\u001cD\u000fCHo\u0010\u0001XHM9[\u0014e5VޛtVagY\u0002ё3ʝʡ.wIͦ\u0013lǁ$Y{a܍l\u0006K\u000b7z\u0014\u0018ΞzIn@Mm%d̵a!04*H;Oݮa\u001d<7Jz>ҽ\u0007ՁͲXm\fؒy\u000eʕ^Wc@\u0089rSV<\u0001)adޤ\u0004xE\u000fRZ\u0006\r۵26xcg5\u0006T߂.{E\u0011U-\tI\u0016_\u0001v%Ypj8IR\u0092\u0005\u000bK\u000bsP\u0010Ԗ\u0003_+\u0004j\u001e2~\u0018ն\u001c\u00adɓ\u001f=WΥ^\u0005ѷ]Snr̽c\u000f\u0012\u0015b~&7t\u0013|<^õ\u000eԥĢSvu۽,Zϥv\u007fH(ݖ\u0016\\)58EjTɣ,\u001e5[i\u0010~\\.\n\u008cRS}6Lf;L\u0006/ǌV&f8\nK@$ޟ\u0015z\u00037ަOf\u0004vO\u0003ұ\tF\bd_RI\u0010\u0017vc{}1DUߜ=\u0006pQ\u0017}`ɫn̼rU\u0013ӆ7Cd\u0001\u0007-~%_߇Oܻ\u0017^bϐ)U&a\u001f\nd14*N\u0012r/ S\u0012֬Ak}a;7e*\u0001Ԟ3ëV\"\u0016!\u007f\u0003\u00128%@#JnMlt_ϟxܣ[\u001afȥ@fz\u001d7&\u001d\u0001Nq\u001f'\u0005^\u00013|/e)uʻ\u0019Ӵd\u0013\fـa('G`Q;98\"}<G#\u0011Rzt.Cx]IϜiǋ1Jl? Ag?>|\u0011BcEfR^Ћ\u001dã\u0015;b߀8@b6*Mq5G6\u001f\u0015eZ\u0014\u000f\u001f\u0019cz\u0002W3H\u0019|/\u001d}N\bˠFތ;~+˄'q!vtME7kl5 R|X eel\u000e\u0010N\u007fyď\u001d\u0099²?~ˌ#(<\b{F\u000ei\u0002h8\u0007tBlr\u0006*V0D\u0014\\%]k'\u001aHl@ѣ\u007f\u008c_g<С\u0013\u0016\u001flLS}/\u0015se{\n\rT\rs?G\u0011\u0016)aC\u0013\u000f}\u001ĉ/Ixz_ska+\u0007\u0014<Bad%WBi*4Y(S\u0012\u0015ݺqQe=vRcŰ\u0010ֶ5Xhٻx\u001f\u001eVY'\u0017Zj+eA\u0011<p\u00132\u0004FB:<DV\u0005Є#Ҵ|\u07bfï\u0014\u0012чK{IG \f\u0014##DiYVAu\"_?\u0004(\tAGX#mx\u000fs&3ձa٠Oj3ۢ\u0018l1fU\u0010\u000f68\u0013\u001e\u000estx\u0014R\u001e\\(\u001c@np'ڋf\u05cfa\u0007$\u05fbUW\u001b!\rD3Ki!)-MV\u001dt,ƭ9Ե\u0001Ϸ¨@\u0018ҝ\u000f\u001e[դ\u00039\u0002JIB*F-I\u0004\u0003$\bf¶cő%3\u001eA5\u0001Y-'}MZo?-NvΕ0ˊ\u00170jӺ+k\u0014emGl8\\nV\u0012*#t\n\u0003\u000f)=B\u0003bޢWΤA\n)d\"~I*\u00118<<!G}zR۔qݸjtaƲ\u0016=\u0004eV1 Y\u001a$6֓pӐ`\\V\u0019]sN]R&+ty{v9\u0007Ŀaۣqj{\u06031%g\u0004\u00042zx!g\u001b\u0013:ޮ>´p\u001d~Q\u0004k_\u00163)nD`C&a\u001b~W<V\u00101\u0003\u0017J\u0010iR\b\u001bԻ/ת7@*ڣ:UcyU V\u001ax8\u0010\u0015*m\nͮ\u0019҈0|\u001dџ\u000f~\u0001[\u0005\u0005{xZΐ;ȭJfH˸E\\-FvRJ\u0010\u0012V\u0013\u0007?k`-\u000e\u001f!tUӾ*\u05c9EcA݃9\u0015\tuJ\u001aRO^X|l-;<Z\u001e\u001f@\u000b,9zf\f{a 0\u0010\u000b\u07ba*ă\u0002i\u007f\u07bd]w c{JQ_@δ\u001dҐ2M\u007fˎƅ<bI\u0005\u0010߈ER\u0007\u001d'\bgОN\u07b6!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016cj5\u00011MHQ,XQ]9\" 9\u000eU+\u000f\u0001hAy", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ%}=\u001e\">", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uF\u0006)?bj 8m#.VA;V;\u001a\u0013hi9\u0010r\u000bN}'IH],2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0015IWE{C|\u0015oa;\u0003r,$:\u0018", "-bW6_+\u001dS ~|Z;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016c\u0002", "/kX4a4>\\(e~g,\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ\u0011", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006R,9[\u0007(7v%\u0015QL;y\n", "1gX9W\u000b>Z\u0019\u0001vm,\u000b", "", "5dc\u0010[0ERw~\u0002^.x\u0018/s>8\u007f:\u000e\u0017\u001eGk\u001c<", "u(;7T=:\u001d)\u000e~euc\r=tU", "1gX9W\u000b>Z\u0019\u0001vm,\u000bg3r\u000f<", "", "5dc\u0010[0ERw~\u0002^.x\u0018/s^,\tO\u0015U'Ki\u001b<}%1g}", "u(I", "Adc\u0010[0ERw~\u0002^.x\u0018/s^,\tO\u0015U'Ki\u001b<}%1g}", "uY\u0018#", "2ta6a.\u001aZ\u001d\u0001\u0004f,\u0006\u0018\u0016i\t(\n,\u0011\u0017$[", "5dc\u0011h9B\\\u001bZ\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%\u0003Wo\u001bP559S\u000b >m\u0012<M", "Adc\u0011h9B\\\u001bZ\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%\u0003Wo\u001bP559S\u000b >m\u0012<M", "7m]2e\nH]&}~g(\f\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "5dc\u0016a5>`v\t\u0005k+\u0001\u0012+t\n5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Y[*Az\u00152V?JuAs", "7r?9T*>R", "Adc\u001d_(<S\u0018", "<df", "7r?9T*>R\t\by^9d\u0013>i\n1\\M|\u001f\u00171pz<w%BY\u0007\u001e7", "Adc\u001d_(<S\u0018n\u0004],\np9t\u00042\u0005!\u000e\u0013\u001fGY\u000f)v&5f})5m", ":`bA66Ga(\fvb5\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0019T:M1#\b\tm9x\r8t\u000eoZ2p\u001a)-\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006T/>g\r-3q\u001f=[\u0019", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ":`bA8?IZ\u001d|~m\u0013x\u001d/r", "5dc\u0019T:M3,\n\u0002b*\u0001\u0018\u0016a\u0014(\t~\u0011\u001b\u0011To\u0015<r35", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u0005\u001cKm#w/P7v7\"\u0013vH5\u001bc9$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ":`bA?(RS&[\u0002h*\u0003", "5dc\u0019T:M:\u0015\u0013zk\t\u0004\u0013-k>8\u007f:\u000e\u0017\u001eGk\u001c<", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", ":`bAC6LW(\u0003\u0005g", "5dc\u0019T:M>#\r~m0\u0007\u0012vni&y\b|\u0015UWs\bIv,5U\f ", "u(9", "\u0018", "", ":`bAM\u0010GR\u0019\u0012", "5dc\u0019T:MH|\by^?;\u00193_\r(\u0003@|%\u0017", "u(5", ":`h6a.(c(\\}b3{\u0016/n", "5dc\u0019T@B\\\u001bh\u000bm\n\u007f\r6d\r(\u0005", ":n^8T/>O\u0018\\\u0005g:\f\u0016+i\t7\n", ";dP@h9>>\u0015\r\t=,\u0004\t1a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6m|*aMKz\u0013\u001e\u001chc5\u0016cj6v#U\\[,GN\u0001Kr\u0012a\u000eP'\u001c\u0005/", "5dc\u001aX(Lc&~eZ:\u000bg/l\u007f*wO\u0001U'Ki\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.4?OuD-shh9\t_;N5\u000fGH\\<iR]9\" 9\u000eU+\u000f\u0001hAy", ";dP@h9>Ru\u0013eZ9|\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mT\u001e[?=k\u00112\u007fdn9\u0010r\u0002", "5dc\u001aX(Lc&~y;@g\u0005<e\t7:P\u0005\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.\f3Ig6\u001eq|L5\u0014c5]L", "Adc\u001aX(Lc&~y;@g\u0005<e\t7:P\u0005\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016l=Q7m4z)S]F\u0007l;$:\u0018", ";dP@h9>R{~~`/\f", "", "5dc\u001aX(Lc&~yA,\u0001\u000b2t", "u(8", ";dP@h9>R\u0003\bx^", ";dP@h9>R\u000b\u0003ym/", "5dc\u001aX(Lc&~yP0{\u00182", "=m=<W,)Z\u0015|z]\nx\u00106e~", ">`a2a;\u001aZ\u001d\u0001\u0004f,\u0006\u0018\u0016i\t(\n*\u0013 \u0017T", "5dc\u001dT9>\\(Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%\u0001Yx\u000eI", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006R,9[\u0007(7v%\u0015QL;y\u001e0\u001ehn\u000f", "", ">`a2a;\u001dO(z", "5dc\u001dT9>\\(]vm(", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ">`a2a;\u001dO(zYb9\f\u001d", ">kP0X\u0016KR\u0019\f", "5dc\u001d_(<S\u0003\fy^9;\u00193_\r(\u0003@|%\u0017", "Adc\u001d_(<S\u0003\fy^9;\u00193_\r(\u0003@|%\u0017", "uH\u0018#", ">kP0X+(\\\u0017~", "5dc\u001d_(<S\u0018h\u0004\\,;\u00193_\r(\u0003@|%\u0017", "Adc\u001d_(<S\u0018h\u0004\\,;\u00193_\r(\u0003@|%\u0017", ">qTC\\6Na\u0004\u0006v\\,f\u0016.e\r", "@d[.l6Nb\u000b\u0003\na6\r\u0018\u001aa\r(\u0005Od \u0002Ty\u0010Iv3C", "1`[0h3:b\u0019Z\u0002b.\u0006\u0011/n\u000f\u000f\u007fI\u0001%", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "1gT0^\nAW }\b^5g\u0010+c\u007f\u0012\t?\u0001$wQ|}Gu!DY\f", "1kT.e\u0017EO\u0017~dk+|\u0016", "4na\u0012T*A1\u001c\u0003\u0002]\b\u0004\r1n\b(\u0005Og\u001b G}wN\u007f%B", "0k^0^", "4na\u0012T*A1\u001c\u0003\u0002]\u000b|\u0010/g{7{", "5dc", "/kX4a4>\\(e~g,", "7me._0=O(~^g;\n\r8s\u0004&\n+|$\u0017P~", "4na0X\u0019>_)~\tm", "7me._0=O(~eZ9|\u0012>D{7w", ":`h<h;\u001cV\u001d\u0006yk,\u0006", ";`a8A6=St\byL<y\u0018<e\u007f\u0004\n+\b\u0013\u0015Gn", ";`a8F<;b&~z::e\u0013>P\u0007$y@\u007f", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bukik@\u0007S", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Nk\"F\u00074~D\u0005\u001c5m\u0012+TC\u0011", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "<nc6Y@\u001cV\u001d\u0006yk,\u0006x=i\t*bJ\u000b\u001d\u0013Jo\n;T/?f|$@i%.[5>o;\u001e\u007fo]7\u000bl.", "=m12Y6KS\u007fz\u000fh<\ff2i\u0007'\t@\n", "=m8;g9B\\'\u0003xl\u0018\r\t<i\u007f'", "=m=<W,\u001dS(zxa,{", "=m=<W,)Z\u0015|z]", "=m=<W,)Z\u0015|z]j\r\r)r\u007f/{<\u000f\u0017", ">kP0X\bM", ">nb6g0H\\", "HH]1X?", ":`h2e\tE]\u0017\u0005", ">kP0X\bM\u001b\u001aQ\u000eO\u000e\u0006\u0013", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1\u0007", ":`h2e", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG'3\u0002\u0016;\u0017%Hg?!\u0019fo \u0003w,[Lj8", ">kP0X\u001a>Z\u001a", ">kP0X\u001a>Z\u001aFbE.\u0010e)4", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016P9X]uA\u0012 $\u0015J?\r\u0012##1jO:#\u0006:0}Oh\u000eaY~", "@d\\2T:N`\u0019", "@d\\2T:N`\u0019FWK\u001b\n\u001d90", "uI\u0018'", "@d_9T*>", "@d`BX:M:\u0015\u0013\u0005n;", "@d`BX:M;\u0019z\tn9|", "BqP0^\u0013H]\u001fz}^({p/a\u000e8\t@\t\u0017 VL\"'r25b\r", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "CoS.g,)O&~\u0004m\u000bx\u0018+", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private boolean isPlacedUnderMotionFrameOfReference;
        private GraphicsLayer lastExplicitLayer;
        private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;
        private Constraints lookaheadConstraints;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = IntOffset.Companion.m6776getZeronOccac();
        private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);
        private final MutableVector<LookaheadPassDelegate> _childDelegates = new MutableVector<>(new LookaheadPassDelegate[16], 0);
        private boolean childDelegatesDirty = true;
        private boolean parentDataDirty = true;
        private Object parentData = getMeasurePassDelegate$ui_release().getParentData();

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public LookaheadPassDelegate() {
        }

        public final int getPlaceOrder$ui_release() {
            return this.placeOrder;
        }

        public final void setPlaceOrder$ui_release(int i2) {
            this.placeOrder = i2;
        }

        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate$ui_release();
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z2) {
            this.duringAlignmentLinesQuery = z2;
        }

        public final boolean getPlacedOnce$ui_release() {
            return this.placedOnce;
        }

        public final void setPlacedOnce$ui_release(boolean z2) {
            this.placedOnce = z2;
        }

        /* JADX INFO: renamed from: getLastConstraints-DWUhwKw */
        public final Constraints m5685getLastConstraintsDWUhwKw() {
            return this.lookaheadConstraints;
        }

        /* JADX INFO: renamed from: getLastPosition-nOcc-ac$ui_release */
        public final long m5686getLastPositionnOccac$ui_release() {
            return this.lastPosition;
        }

        public final float getLastZIndex$ui_release() {
            return this.lastZIndex;
        }

        public final Function1<GraphicsLayerScope, Unit> getLastLayerBlock$ui_release() {
            return this.lastLayerBlock;
        }

        public final GraphicsLayer getLastExplicitLayer$ui_release() {
            return this.lastExplicitLayer;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        public void setPlaced(boolean z2) {
            this.isPlaced = z2;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.childDelegatesDirty;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z2) {
            this.childDelegatesDirty = z2;
        }

        public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.getChildren$ui_release();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.asMutableList();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<LookaheadPassDelegate> mutableVector = this._childDelegates;
            MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector2.getContent();
                int i2 = 0;
                do {
                    LayoutNode layoutNode2 = content[i2];
                    if (mutableVector.getSize() <= i2) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        mutableVector.add(lookaheadPassDelegate$ui_release);
                    } else {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release2);
                        mutableVector.set(i2, lookaheadPassDelegate$ui_release2);
                    }
                    i2++;
                } while (i2 < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.asMutableList();
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        private final void forEachChildDelegate(Function1<? super LookaheadPassDelegate, Unit> function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i2].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    function1.invoke(lookaheadPassDelegate$ui_release);
                    i2++;
                } while (i2 < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            final LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            if (LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                Owner ownerRequireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNodeLayoutDelegate.this.setLookaheadCoordinatesAccessedDuringPlacement(false);
                OwnerSnapshotObserver snapshotObserver = ownerRequireOwner.getSnapshotObserver();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(snapshotObserver, layoutNode, false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.clearPlaceOrder();
                        this.this$0.forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                                invoke2(alignmentLinesOwner);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                                alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                            }
                        });
                        LookaheadDelegate lookaheadDelegate2 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
                        if (lookaheadDelegate2 != null) {
                            boolean zIsPlacingForAlignment$ui_release = lookaheadDelegate2.isPlacingForAlignment$ui_release();
                            List<LayoutNode> children$ui_release = layoutNodeLayoutDelegate.layoutNode.getChildren$ui_release();
                            int size = children$ui_release.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                LookaheadDelegate lookaheadDelegate3 = children$ui_release.get(i2).getOuterCoordinator$ui_release().getLookaheadDelegate();
                                if (lookaheadDelegate3 != null) {
                                    lookaheadDelegate3.setPlacingForAlignment$ui_release(zIsPlacingForAlignment$ui_release);
                                }
                            }
                        }
                        lookaheadDelegate.getMeasureResult$ui_release().placeChildren();
                        LookaheadDelegate lookaheadDelegate4 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
                        if (lookaheadDelegate4 != null) {
                            lookaheadDelegate4.isPlacingForAlignment$ui_release();
                            List<LayoutNode> children$ui_release2 = layoutNodeLayoutDelegate.layoutNode.getChildren$ui_release();
                            int size2 = children$ui_release2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                LookaheadDelegate lookaheadDelegate5 = children$ui_release2.get(i3).getOuterCoordinator$ui_release().getLookaheadDelegate();
                                if (lookaheadDelegate5 != null) {
                                    lookaheadDelegate5.setPlacingForAlignment$ui_release(false);
                                }
                            }
                        }
                        this.this$0.checkChildrenPlaceOrderForUpdates();
                        this.this$0.forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                                invoke2(alignmentLinesOwner);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                                alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui_release());
                            }
                        });
                    }
                }, 2, null);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (LayoutNodeLayoutDelegate.this.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui_release()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i2 = 0;
                setPlaced(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i2].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                        i2++;
                    } while (i2 < size);
                }
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getLookaheadAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(Function1<? super AlignmentLinesOwner, Unit> function1) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = content[i2].getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                    Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
                    function1.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i2++;
                } while (i2 < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, false, 7, null);
        }

        public final void notifyChildrenUsingLookaheadCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingLookaheadCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode = content[i2];
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLookaheadLayoutPending$ui_release()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutDelegate$ui_release.getLookaheadPassDelegate$ui_release();
                if (lookaheadPassDelegate$ui_release != null) {
                    lookaheadPassDelegate$ui_release.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
                }
                i2++;
            } while (i2 < size);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0029  */
        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.compose.ui.layout.Placeable mo5514measureBRTryo0(long r4) {
            /*
                r3 = this;
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
                r2 = 0
                if (r0 == 0) goto L56
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.getLayoutState$ui_release()
            L11:
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
                if (r1 == r0) goto L29
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
                if (r0 == 0) goto L25
                androidx.compose.ui.node.LayoutNode$LayoutState r2 = r0.getLayoutState$ui_release()
            L25:
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
                if (r2 != r0) goto L2f
            L29:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r1 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                r0 = 0
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$setDetachedFromParentLookaheadPass$p(r1, r0)
            L2f:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                r3.trackLookaheadMeasurementByParent(r0)
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r0.getIntrinsicsUsageByParent$ui_release()
                androidx.compose.ui.node.LayoutNode$UsageByParent r0 = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed
                if (r1 != r0) goto L4f
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                r0.clearSubtreeIntrinsicsUsage$ui_release()
            L4f:
                r3.m5687remeasureBRTryo0(r4)
                r0 = r3
                androidx.compose.ui.layout.Placeable r0 = (androidx.compose.ui.layout.Placeable) r0
                return r0
            L56:
                r1 = r2
                goto L11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.mo5514measureBRTryo0(long):androidx.compose.ui.layout.Placeable");
        }

        private final void trackLookaheadMeasurementByParent(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure$ui_release())) {
                    InlineClassHelperKt.throwIllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
                int i2 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i2 == 3 || i2 == 4) {
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.parentData;
        }

        /* JADX INFO: renamed from: remeasure-BRTryo0 */
        public final boolean m5687remeasureBRTryo0(long j2) {
            long jIntSize;
            if (LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
            if (!LayoutNodeLayoutDelegate.this.layoutNode.getLookaheadMeasurePending$ui_release()) {
                Constraints constraints = this.lookaheadConstraints;
                if (constraints == null ? false : Constraints.m6584equalsimpl0(constraints.m6597unboximpl(), j2)) {
                    Owner owner$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getOwner$ui_release();
                    if (owner$ui_release != null) {
                        owner$ui_release.forceMeasureTheSubtree(LayoutNodeLayoutDelegate.this.layoutNode, true);
                    }
                    LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
            }
            this.lookaheadConstraints = Constraints.m6579boximpl(j2);
            m5577setMeasurementConstraintsBRTryo0(j2);
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                    invoke2(alignmentLinesOwner);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                }
            });
            if (this.measuredOnce) {
                jIntSize = m5573getMeasuredSizeYbymL2g();
            } else {
                jIntSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            this.measuredOnce = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                InlineClassHelperKt.throwIllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
            }
            LayoutNodeLayoutDelegate.this.m5680performLookaheadMeasureBRTryo0(j2);
            m5576setMeasuredSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
            return (IntSize.m6808getWidthimpl(jIntSize) == lookaheadDelegate.getWidth() && IntSize.m6807getHeightimpl(jIntSize) == lookaheadDelegate.getHeight()) ? false : true;
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno */
        public void mo5515placeAtf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            m5684placeSelfMLgxB_4(j2, f2, function1, null);
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno */
        public void mo5575placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) {
            m5684placeSelfMLgxB_4(j2, f2, null, graphicsLayer);
        }

        @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public boolean isPlacedUnderMotionFrameOfReference() {
            return this.isPlacedUnderMotionFrameOfReference;
        }

        @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
        public void setPlacedUnderMotionFrameOfReference(boolean z2) {
            LookaheadDelegate lookaheadDelegate;
            LookaheadDelegate lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            if (!Intrinsics.areEqual(Boolean.valueOf(z2), lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.isPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate()) != null) {
                lookaheadDelegate.setPlacedUnderMotionFrameOfReference(z2);
            }
            this.isPlacedUnderMotionFrameOfReference = z2;
        }

        /* JADX INFO: renamed from: placeSelf-MLgxB_4 */
        private final void m5684placeSelfMLgxB_4(final long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1, GraphicsLayer graphicsLayer) {
            if (LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!IntOffset.m6765equalsimpl0(j2, this.lastPosition)) {
                if (LayoutNodeLayoutDelegate.this.getLookaheadCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = true;
                }
                notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            final Owner ownerRequireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
            if (!LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release() && isPlaced()) {
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                lookaheadDelegate.m5698placeSelfApparentToRealOffsetgyyYBs$ui_release(j2);
                onNodePlaced$ui_release();
            } else {
                LayoutNodeLayoutDelegate.this.setLookaheadCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                OwnerSnapshotObserver snapshotObserver = ownerRequireOwner.getSnapshotObserver();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(snapshotObserver, layoutNode, false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeSelf$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        LookaheadDelegate lookaheadDelegate2;
                        Placeable.PlacementScope placementScope = null;
                        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
                            NodeCoordinator wrappedBy$ui_release = layoutNodeLayoutDelegate.getOuterCoordinator().getWrappedBy$ui_release();
                            if (wrappedBy$ui_release != null) {
                                placementScope = wrappedBy$ui_release.getPlacementScope();
                            }
                        } else {
                            NodeCoordinator wrappedBy$ui_release2 = layoutNodeLayoutDelegate.getOuterCoordinator().getWrappedBy$ui_release();
                            if (wrappedBy$ui_release2 != null && (lookaheadDelegate2 = wrappedBy$ui_release2.getLookaheadDelegate()) != null) {
                                placementScope = lookaheadDelegate2.getPlacementScope();
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ownerRequireOwner.getPlacementScope();
                        }
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeLayoutDelegate;
                        long j3 = j2;
                        LookaheadDelegate lookaheadDelegate3 = layoutNodeLayoutDelegate2.getOuterCoordinator().getLookaheadDelegate();
                        Intrinsics.checkNotNull(lookaheadDelegate3);
                        Placeable.PlacementScope.m5578place70tqf50$default(placementScope, lookaheadDelegate3, j3, 0.0f, 2, null);
                    }
                }, 2, null);
            }
            this.lastPosition = j2;
            this.lastZIndex = f2;
            this.lastLayerBlock = function1;
            this.lastExplicitLayer = graphicsLayer;
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LookaheadMeasuring) {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            int i2 = lookaheadDelegate.get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i2;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i2) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i2) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i2) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i2) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(i2);
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, false, 7, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i2 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i2 == 2) {
                intrinsicsUsageByParent$ui_release = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i2 == 3) {
                intrinsicsUsageByParent$ui_release = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                intrinsicsUsageByParent$ui_release = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(intrinsicsUsageByParent$ui_release);
        }

        public final void invalidateIntrinsicsParent(boolean z2) {
            LayoutNode layoutNode;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                do {
                    layoutNode = parent$ui_release;
                    if (layoutNode.getIntrinsicsUsageByParent$ui_release() != intrinsicsUsageByParent$ui_release) {
                        break;
                    } else {
                        parent$ui_release = layoutNode.getParent$ui_release();
                    }
                } while (parent$ui_release != null);
                int i2 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i2 == 1) {
                    if (layoutNode.getLookaheadRoot$ui_release() != null) {
                        LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, z2, false, false, 6, null);
                        return;
                    } else {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNode, z2, false, false, 6, null);
                        return;
                    }
                }
                if (i2 == 2) {
                    if (layoutNode.getLookaheadRoot$ui_release() != null) {
                        layoutNode.requestLookaheadRelayout$ui_release(z2);
                        return;
                    } else {
                        layoutNode.requestRelayout$ui_release(z2);
                        return;
                    }
                }
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public final boolean updateParentData() {
            if (getParentData() == null) {
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            LookaheadDelegate lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return true;
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (!isPlaced()) {
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && (parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                    if (!(this.placeOrder == Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
                    }
                    this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder;
                    parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder++;
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        public final void clearPlaceOrder() {
            int i2 = 0;
            LayoutNodeLayoutDelegate.this.nextChildLookaheadPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i2].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.previousPlaceOrder = lookaheadPassDelegate$ui_release.placeOrder;
                    lookaheadPassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i2++;
                } while (i2 < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean zIsPlaced = isPlaced();
            setPlaced(true);
            if (!zIsPlaced && LayoutNodeLayoutDelegate.this.getLookaheadMeasurePending$ui_release()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, true, false, false, 6, null);
            }
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size <= 0) {
                return;
            }
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode = content[i2];
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                if (lookaheadPassDelegate$ui_release == null) {
                    throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.".toString());
                }
                if (lookaheadPassDelegate$ui_release.placeOrder != Integer.MAX_VALUE) {
                    lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsPlaced();
                    layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                }
                i2++;
            } while (i2 < size);
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    LayoutNode layoutNode2 = content[i2];
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && layoutNode2.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        Constraints constraintsM5683getLastLookaheadConstraintsDWUhwKw = layoutNode2.getLayoutDelegate$ui_release().m5683getLastLookaheadConstraintsDWUhwKw();
                        Intrinsics.checkNotNull(constraintsM5683getLastLookaheadConstraintsDWUhwKw);
                        if (lookaheadPassDelegate$ui_release.m5687remeasureBRTryo0(constraintsM5683getLastLookaheadConstraintsDWUhwKw.m6597unboximpl())) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, false, 7, null);
                        }
                    }
                    i2++;
                } while (i2 < size);
            }
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    InlineClassHelperKt.throwIllegalStateException("replace() called on item that was not placed");
                }
                this.onNodePlacedCalled = false;
                boolean zIsPlaced = isPlaced();
                m5684placeSelfMLgxB_4(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);
                if (zIsPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced(false);
        }

        public final void checkChildrenPlaceOrderForUpdates() {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i2].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    int i3 = lookaheadPassDelegate$ui_release.previousPlaceOrder;
                    int i4 = lookaheadPassDelegate$ui_release.placeOrder;
                    if (i3 != i4 && i4 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                    }
                    i2++;
                } while (i2 < size);
            }
        }
    }

    /* JADX INFO: renamed from: performMeasure-BRTryo0 */
    public final void m5681performMeasureBRTryo0(long j2) {
        if (!(this.layoutState == LayoutNode.LayoutState.Idle)) {
            InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
        }
        this.layoutState = LayoutNode.LayoutState.Measuring;
        this.measurePending = false;
        this.performMeasureConstraints = j2;
        LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.layoutNode, false, this.performMeasureBlock);
        if (this.layoutState == LayoutNode.LayoutState.Measuring) {
            markLayoutPending$ui_release();
            this.layoutState = LayoutNode.LayoutState.Idle;
        }
    }

    /* JADX INFO: renamed from: performLookaheadMeasure-BRTryo0 */
    public final void m5680performLookaheadMeasureBRTryo0(final long j2) {
        this.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performLookaheadMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LookaheadDelegate lookaheadDelegate = this.this$0.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                lookaheadDelegate.mo5514measureBRTryo0(j2);
            }
        }, 2, null);
        markLookaheadLayoutPending$ui_release();
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.layoutState = LayoutNode.LayoutState.Idle;
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate();
        }
    }

    public final void updateParentData() {
        LayoutNode parent$ui_release;
        if (this.measurePassDelegate.updateParentData() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 7, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null && lookaheadPassDelegate.updateParentData()) {
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, false, false, 7, null);
                    return;
                }
                return;
            }
            LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release3 != null) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, false, 7, null);
            }
        }
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui_release();
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }
}
