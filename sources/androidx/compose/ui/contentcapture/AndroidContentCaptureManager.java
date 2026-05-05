package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.ArraySet;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.util.LongSparseArrayKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яœ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.Jչ*,(w\u000f߿r9FDmHDR[*\u0015k\u000442b,ڎK;k\u001a\u0006\"\u0017OVʴon`Z\u0013C%\u0006\u001eюr,_U\u0001ز\u001a\u000f@KwЀ;M\u0006=A`z<\r H\"@y\u001b\u0001\"*N\u0015~zYK\u0014\u00126Ix:h\rU\u0005 \u0012\u000e>6\u0001&\\}N>ԟt]P/+\u0003oGV'm6\u0005M\u0013Q\\'\u001b\u000biӜ3@EH\u001dǬ[\u0003\u001dRc?\u0019?y=\u000bq/'AI{W<Y\b\u0014++W\rct.\\\u001bQh\f=+WcQQ\u0016(\u000ez\u0004\rB\u0006\u0016\u00065T6- o\u000eԄIο#SnO2^p\u007f+ad\u0018]\u007f0)y6vUo=1Ne~\u0015\u0019,'\u0019v1_d\u0010v\u0014IZ&VśU@KO\u0017\u0018gy\u0006\u0004\u001fnHÐBΥK\u000259\u001fl_=E\u001bQ#Ow2LR(\u000f\u0005\u000f*\u0004o`\u000bX$\u0005\u0015e9O\f#RrH\u0004P\u0003d\\\u0015[\\l\u0007,IY %\fJe=\u0010|[\u0019sx\u0013u\u001051v7\b\u000e\u001a,\u001e9'9C\u0018{\u0010\u0010^=\u0014\bBpLpfp_RZ%.0z`j>\u0004BD\u0017\u001a!{WqJ@\\5''-H1U\tAE\u0014m&\u0001\u0010-`yɴғm$zUI{j>\bg'U\\\u0001npEA\u007f\u0005I*cr\u00014+t7\u000b\u0002R_o\\K\\n,t\u0004PNi`8ֺ3=\u0019dG4@XEEz~,ʸ̊\u0016'\u0001TB\"IAFg6v!0n5bO\u0003NhԮ݈v#\u000e>H\u0005o!\u0013G\u0012`QϵƏMr\t5\u0005YFY\u001d\u001fL1Gǻݕ\u000153!o+$V,/Cm\u000em}\u000e\u0012b=\u0007;yL:qw\bb\u007fib?F)q~l\u0003j\u0001KPVM\u0010\bp\u0015d\u0011A,Yd\u001f;~aS=\fL\u001f,;|\u0007_Hv\b}b\u0013&><f\fzvCS\u001d}WuU\u0006K\u000b֥z\u001b\u0018s\u00149~\u0016,?6U\u0006M7\u001aLr͛:AANMR\u0017\u0011L,j\u0014;GbW\u001e\u0010)nvc\u001d\u0007JB\"n\u001d\u000e\u001d\u000fjG`\u0005\u000fQ\u0011%8r\u0017\u000fa_)9?w\u0006F\u0003#*2Ii+}3j}\u000b\u0017)92l9I\u0017\t\u0005\u00195uCw5|\u0004\u0010/{a\b\ff$C\u001d\u000b&)0i\u0011\u000e\u0003`b\u0019M|N\u0013eXf\u001b\\0\"\u0017z+\u001al\u000e\u001d\u00031O!^)-\u0015T\u00061[\u001a/#\u000b)O\u001a\u000b^^\u001b[\u0012e1KA\u0003\u0014Uj\u001eS\u0004\n\u0016\u001c8)\u001asOk\u007f\u000e\u0015x$\u001b\u000b\"\u007f\u001ez\u00027\u001c'܃\u0010̛Ntz˖~\u001aDY\u001a9\u0012\u0015nY\u001a\u0004OK}ߟnތFKpǍZuzp\u0007[\u001b\u0005v1\u0005\t\u001d;'ɂ\u000bߓQ.\u001b̽+F\u001fc8X?\u0011jݾ(̢:\bjϪ`[qz\tk}ncĎ;֗.a9È#*\f3\u0012u2?+Ӓ\u0017ͪZMFĹY\u0001zXo\u0010tiVj+׃gحSۊTր\u0015%<И\u0003 jFE17]\u0013`n!$GOA/M#_)TJ\u0011\u007f*\u0007\u00111Y\u0011\u00136h\u0019ս~Ϩk85õl? GgE\u000ef\tHYh\tN\u0016P)\u000e?B1߃,ۋ`\u001a$ԝ\"?O>)\u0001CA\\˒\u0013ص9jYƚu<\u000f#\u0019\rm!\bˊ<ތ;x+˄'q!\u007ftduMsv?\f0x\u0001=$ސXւe6Y7KI\bmX\u0002\u0010K2QV\u00161\u0004]9X.o^VU\"]2+\u0001ަz\u07b2'Stԭ\f\f2\u0018&#\u0005]gdO,d+RpB3|\tUM\u0017-9RcҸ ʁ\u0013\u00061ؔg\t\u001e\u0004\n@Y|Iٌ;ۺa<\u001bŎTL@\u0017N\u007fWBi*4d@\u000b:ÈlҦU_\u0018ؾb\u0019\u001b<\u00101\u0001\u001aVц)Ȥ+K~˯\u0007k\u0007OYb9CǦ(d6˷$\r\fP<\u0004ǯ\u0006ѫI"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n~! Vo\u0017Kt!@h\u000e-77q7LPEo3{\u001fqp9\u0010r\nJ\u00026WYN\u0014X[n?\u0014\u001f0", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n~! Vo\u0017Kt!@h\u000e-77s8VR;tC{\u0011spI\u0014c\u0014J\u007f#IL[\u0002", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E\u001f\u0001\u0018\u0013Wv\u001d#z&5W\u0012\u001e>m\u007f+[CH|4+j", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI\\&&Cm\u0011*\u0006!DY[#3v\u0018.4GIz4'\u0015u7", "DhTD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "=m2<a;>\\(\\vi;\r\u0016/S\u007f6\nD\u000b ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n3c\u000b Ep\u001a6[\r\u0019u=-\u0015qp\u0017\u0003n;^\u0004'5L\\:`\\{\u001b\u001e\u001ae\n]\u0001", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u00199\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RL\u0011,q", "!d]1E,<c&\f~g.Z\u00138t\u007f1\u000b\u001e|\"&W|\u000e\u001c\b%>h\f\u0004@|\u0016;^?BS8%\u001clo", "", "0nd;W:.^\u0018z\n^\n\u007f\u00058n\u007f/", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "", "0tU3X9>Rt\n\u0006^(\n\t.N\n'{N", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n3c\u000b Ep\u001a6[\r,o40\u0003wnI\u0005r<[v\u0005QTY(k(", "0tU3X9>Rw\u0003\tZ7\b\t+r\u007f'dJ\u007f\u0017%", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DG}/\r", "1gT0^0GUy\t\bL,\u0005\u00058t\u0004&\n\u001e\u0004\u0013 Io\u001c", "", "1n]AX5M1\u0015\n\nn9|f2a\t*{\u001e\u0004\u0017\u0015Mo\u001b", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "1n]AX5M1\u0015\n\nn9|v/s\u000e,\u0006I", "5dc\u0010b5MS\"\u000eXZ7\f\u0019<em(\nN\u0005! \u0006\u007f\u00126\u0004%<Yy.7,\u00127VMJgC\"\u001fqo", "u(E", "5dc\u0010b5MS\"\u000eXZ7\f\u0019<em(\nN\u0005! \u0006\u007f\u00126\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#{*Dm$1QKI5\u0012(\u001ewaB\u0016A(Y\u00067TL<,j`vG\u001dod\u0016Y'\u001cZ", "Adc\u0010b5MS\"\u000eXZ7\f\u0019<em(\nN\u0005! \u0006\u007f\u00126\u0004%<Yy.7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~W\b-7{\u00192UQ\u0005I>'$hjHd_7]\u00074G:N:jV|Fq\u001cb\u0019J:bHJ", "1ta?X5MA\u0019\u0007vg;\u0001\u0007=N\n'{N", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &1l\u0013<t4\u001dU\tu", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#Y\u0006\u001c@|\u001a,[,Ej4\u0010\u0019wd\u0015\u0006h<\\\u0006'F)X<eQ\u0001\u0013", "5dc\u0010h9KS\"\u000eh^4x\u0012>i}6dJ\u007f\u0017%\u0006\u007f\u00126\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`zP~w9{%3he\u001cBC", "Adc\u0010h9KS\"\u000eh^4x\u0012>i}6dJ\u007f\u0017%\u0006\u007f\u00126\u0004%<Yy.7", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJz VY\u000bAv#DAy+\r1\u0007", "1ta?X5MA\u0019\u0007vg;\u0001\u0007=N\n'{Nd (Cv\u0012;r45X", "1ta?X5MA\u0019\u0007vg;\u0001\u0007=N\n'{Nn \u0013R}\u0011F\u0006\u00149a}.Fi\u001e95GBr8,", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "5dc\u0015T5=Z\u0019\f9n0v\u0016/l\u007f$\n@", "u(;.a+K]\u001d}Dh:Fk+n~/{MV", "7r4;T)ES\u0018", "7r4;T)ES\u0018=\u000bb&\n\t6e{6{~|  Q~\nKz/>g", "7r4;T)ES\u0018=\u000bb&\n\t6e{6{", "u(I", "5dc\u001ca\nH\\(~\u0004m\nx\u0014>u\r(i@\u000f%\u001bQx", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u001ca\nH\\(~\u0004m\nx\u0014>u\r(i@\u000f%\u001bQx", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", ">qTC\\6Na\u0007~\u0003Z5\f\r-sh2z@\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#Y\u0006\u001c@|\u001a,[,Ej4{\u001fsu\u000f", ">qTC\\6Na\u0007~\u0003Z5\f\r-sl2\u0006O", "AtQAe,>1\u001cz\u0004`,{o+y\n8\u000b)\u000b\u0016\u0017U", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\\$$C\u0004{<\u0006z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "BqP;f3:b\u0019l\nZ;\r\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n~! Vo\u0017Kt!@h\u000e-77q7LPEo3{\u001fqp9\u0010r\nJ\u00026WYN\u0014X[n?\u0014\u001f\u0019|['\u0016\u0013`=3n2F\u001b\u0017<WW", "5dc#\\,P", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L!Es?(#hR=\u0007u\u0002", "0nd;W:.^\u0018z\n^:\\\u001a/n\u000f\u000f\u0006J\f", "0nd;W:.^\u0018z\n^:\\\u001a/n\u000f\u000f\u0006J\fU'Ki\u001b<}%1g}", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "0tU3X9\u001c]\"\u000ezg;Z\u0005:t\u00105{1\u0005\u0017)#z\u0019<r25X", "DhaAh(E7\u0018", "", "DhTDF;Kc\u0017\u000e\u000bk,", "0tU3X9\u001c]\"\u000ezg;Z\u0005:t\u00105{1\u0005\u0017)&s\u001c8\u000205U\u000b 6", "1gT0^\rH`v\t\u0004m,\u0006\u0018\ra\u000b7\fM\u0001\u0002$Qz\u000eI\u00069\u0013\\y)9m$", "<df X4:\\(\u0003xl\u0015\u0007\b/s", "1kT.e\u001bKO\"\r\u0002Z;|\b\u001ee\u00137", "6hS2G9:\\'\u0006vm,{w/x\u000f", "<nc6Y@\u001c]\"\u000ezg;Z\u0005:t\u00105{\u001e\u0004\u0013 Io\u001c", "<nc6Y@,c\u0016\u000e\b^,j\u0018+t\u007f\u0006~<\n\u0019\u0017+pv<v$5X", ":`h<h;']\u0018~", "=m29X(KB&z\u0004l3x\u00183o\t", "=m29X(KB&z\u0004l3x\u00183o\tf\fDz$\u0017No\nJv", "=m2?X(MS\n\u0003\bm<x\u0010 i\u007f:jM| %Nk\u001d@\u0001.\"Y\n07{%<", "DhaAh(E7\u0018\r", "", "At_=b9MS\u0018_\u0005k4x\u0018=", "", "@d`BX:Mav\t\u0002e,z\u00189r", "\u001aiPCTuNb\u001d\u0006D_<\u0006\u0007>i\n1E\u001e\u000b %Ww\u000eIL", "\u001a`]1e6BRb\u0010~^>F\u0018<a\t6\u0003<\u0010\u001b!P9~@v7$fy)Et\u0012=QMDX4*%hoH\\", "=m2?X(MS\n\u0003\bm<x\u0010 i\u007f:jM| %Nk\u001d@\u0001.\"Y\n07{%<\fS?eA\u001e\u001ch]G\u0007", "=m76W,-`\u0015\b\te(\f\r9n", "=m76W,-`\u0015\b\te(\f\r9n>8\u007f:\u000e\u0017\u001eGk\u001c<", "=m;.l6Nbv\u0002vg.|", "=m;.l6Nbv\u0002vg.|G?iy5{G\u0001\u0013%G", "=mB2`(Gb\u001d|\t</x\u00121e", "=mB2`(Gb\u001d|\t</x\u00121e>8\u007f:\u000e\u0017\u001eGk\u001c<", "=mB5b>-`\u0015\b\te(\f\r9n", "=mB5b>-`\u0015\b\te(\f\r9n>8\u007f:\u000e\u0017\u001eGk\u001c<", "=mBAT9M", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "=mBAb7", "=mE6X>\u001ab(zxa,{w9W\u00041zJ\u0013", "D", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=mE6X>\u001dS(zxa,{i<o\b\u001a\u007fI\u007f!)", "=mE6e;NO o~^>k\u0016+n\u000e/wO\u0005! 4o\u001cG\u0001.CY\f", "1n]AX5M1\u0015\n\nn9|p+n{*{M", "@db=b5LS", "\u001a`]1e6BRb\u000f\nb3Fo9n\u0002\u0016\u0007<\u000e%\u0017#|\u001b8\u000bz", "\u001a`]1e6BRb\u0010~^>F\u0018<a\t6\u0003<\u0010\u001b!P9~@v7$fy)Et\u0012=QMDX4, rjG\u00079", "=mE6e;NO o~^>k\u0016+n\u000e/wO\u0005! 4o\u001cG\u0001.CY\f^Gq\u0010;MJ;gB\u001e", "Ad]166Gb\u0019\b\n<(\b\u0018?r\u007f\u0016\u000bM\u0011\u0015&W|\u000e\u001ay!>[}\u007fHm\u001f=[", "<df\u001bb+>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "=kS\u001bb+>", "Ad]166Gb\u0019\b\n<(\b\u0018?r\u007f\u0017{S\u0010\u0007\"Fk\u001d<V65b\r", "7c", "<df!X?M", "", "Ad]1F,FO\"\u000e~\\:j\u0018<u}7\fM\u0001t\u001aCx\u0010<V65b\r.", "Ag^DG9:\\'\u0006vm,{w/x\u000f", "CoS.g,\u001bc\u001a\u007fzk:f\u0012\u000bp\u000b(wM\u0001\u0016", "<nS2", "CoS.g,\u001bc\u001a\u007fzk:f\u0012\u000ei\u000e$\u0007K\u0001\u0013$Gn", "CoS.g,,S!z\u0004m0z\u0017\ro\u000b<", "CoS.g,-`\u0015\b\te(\f\r9ni1WK\f\u0017\u0013To\r", "BnE6X>,b&\u000fxm<\n\t", "\"qP;f3:b\u0019l\nZ;\r\u0017", "$hTDG9:\\'\u0006vm0\u0007\u0012\u0012e\u00073{Mh\u0017&Jy\rJ", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    private boolean checkingForSemanticsChanges;
    private final Runnable contentCaptureChangeChecker;
    private ContentCaptureSessionCompat contentCaptureSession;
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private long currentSemanticsNodesSnapshotTimestampMillis;
    private final Handler handler;
    private Function0<? extends ContentCaptureSessionCompat> onContentCaptureSession;
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private final AndroidComposeView view;
    private final MutableIntObjectMap<ViewStructureCompat> bufferedAppearedNodes = new MutableIntObjectMap<>(0, 1, null);
    private final MutableIntSet bufferedDisappearedNodes = new MutableIntSet(0, 1, null);
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
    private final Channel<Unit> boundsUpdateChannel = ChannelKt.Channel$default(1, null, null, 6, null);

    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0006Gٍ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wEшY\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n~! Vo\u0017Kt!@h\u000e-77q7LPEo3{\u001fqp9\u0010r\nJ\u00026WYN\u0014X[n?\u0014\u001f\u0019|['\u0016\u0013`=3n2F\u001b\u0017<WW", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "!G>$R\u0016+7zbc:\u0013", "!G>$R\u001b+/\u0002la:\u001b\\g", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Function0<? extends ContentCaptureSessionCompat> function0) throws Throwable {
        this.view = androidComposeView;
        this.onContentCaptureSession = function0;
        Class<?> cls = Class.forName(hg.Vd("\u001d)\u001e+' \u001ab#&_|\u001f\u001e\u001e\u0012\u001e", (short) (Od.Xd() ^ (-23026)), (short) (Od.Xd() ^ (-1421))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-28893));
        int[] iArr = new int["ZWe=PW[8ZYYMY".length()];
        QB qb = new QB("ZWe=PW[8ZYYMY");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
            this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
            this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
            this.contentCaptureChangeChecker = new Runnable() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0(this.f$0);
                }
            };
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final Function0<ContentCaptureSessionCompat> getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    public final void setOnContentCaptureSession(Function0<? extends ContentCaptureSessionCompat> function0) {
        this.onContentCaptureSession = function0;
    }

    public final ContentCaptureSessionCompat getContentCaptureSession$ui_release() {
        return this.contentCaptureSession;
    }

    public final void setContentCaptureSession$ui_release(ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final Handler getHandler$ui_release() {
        return this.handler;
    }

    public final void setCurrentSemanticsNodes$ui_release(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        this.currentSemanticsNodes = intObjectMap;
    }

    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public static final void contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.isEnabled$ui_release()) {
            Owner.measureAndLayout$default(androidContentCaptureManager.view, false, 1, null);
            androidContentCaptureManager.sendSemanticsStructureChangeEvents(androidContentCaptureManager.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
            androidContentCaptureManager.sendContentCaptureStructureChangeEvents(androidContentCaptureManager.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
            androidContentCaptureManager.checkForContentCapturePropertyChanges(androidContentCaptureManager.getCurrentSemanticsNodes$ui_release());
            androidContentCaptureManager.updateSemanticsCopy();
            androidContentCaptureManager.checkingForSemanticsChanges = false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final boolean isEnabled$ui_release() {
        return ContentCaptureManager.Companion.isEnabled() && this.contentCaptureSession != null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        this.contentCaptureSession = this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007d A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:73:0x0037, B:79:0x0063, B:84:0x0075, B:86:0x007d, B:88:0x0086, B:89:0x0089, B:91:0x008d, B:93:0x00a1, B:95:0x00bf, B:97:0x00e1, B:98:0x00e6, B:105:0x0105, B:106:0x0109, B:99:0x00ed, B:83:0x0072), top: B:118:0x0022, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.contentcapture.AndroidContentCaptureManager] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.contentcapture.AndroidContentCaptureManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x00fe -> B:102:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation<? super kotlin.Unit> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void onSemanticsChange$ui_release() throws Throwable {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        Handler handler = this.handler;
        Object[] objArr = {this.contentCaptureChangeChecker};
        Method method = Class.forName(ZO.xd("+Zj\u0018F'L,Uak\u0011%x\u0015FD>", (short) (C1607wl.Xd() ^ 11021), (short) (C1607wl.Xd() ^ 21392))).getMethod(Ig.wd("u&Z\u0002", (short) (Od.Xd() ^ (-20923))), Class.forName(C1626yg.Ud("\\q;;\u000f#fY\u0011`{\u0019[6WUaZ", (short) (Od.Xd() ^ (-9422)), (short) (Od.Xd() ^ (-25049)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeStateChangeIfNeeded(layoutNode);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendSemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode r18, androidx.compose.ui.platform.SemanticsNodeCopy r19) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.sendSemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.platform.SemanticsNodeCopy):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendContentCaptureStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode r18, androidx.compose.ui.platform.SemanticsNodeCopy r19) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.sendContentCaptureStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.platform.SemanticsNodeCopy):void");
    }

    private final void sendContentCaptureTextUpdateEvent(int i2, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.contentCaptureSession) != null) {
            AutofillId autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(i2);
            if (autofillIdNewAutofillId != null) {
                contentCaptureSessionCompat.notifyViewTextChanged(autofillIdNewAutofillId, str);
            } else {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateSemanticsCopy() {
        /*
            r16 = this;
            r8 = r16
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> r0 = r8.previousSemanticsNodes
            r0.clear()
            androidx.collection.IntObjectMap r0 = r16.getCurrentSemanticsNodes$ui_release()
            int[] r13 = r0.keys
            java.lang.Object[] r12 = r0.values
            long[] r11 = r0.metadata
            int r0 = r11.length
            int r10 = r0 + (-2)
            if (r10 < 0) goto L68
            r9 = 0
        L17:
            r5 = r11[r9]
            long r0 = ~r5
            r2 = 7
            long r0 = r0 << r2
            long r14 = r0 + r5
            long r0 = r0 | r5
            long r14 = r14 - r0
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r14 + r3
            long r14 = r14 | r3
            long r1 = r1 - r14
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L63
            int r0 = r9 - r10
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r7 = 0
        L37:
            if (r7 >= r14) goto L61
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5d
            int r0 = r9 << 3
            int r0 = r0 + r7
            r4 = r13[r0]
            r0 = r12[r0]
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r0 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r0
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> r3 = r8.previousSemanticsNodes
            androidx.compose.ui.platform.SemanticsNodeCopy r2 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.semantics.SemanticsNode r1 = r0.getSemanticsNode()
            androidx.collection.IntObjectMap r0 = r16.getCurrentSemanticsNodes$ui_release()
            r2.<init>(r1, r0)
            r3.set(r4, r2)
        L5d:
            long r5 = r5 >> r15
            int r7 = r7 + 1
            goto L37
        L61:
            if (r14 != r15) goto L68
        L63:
            if (r9 == r10) goto L68
            int r9 = r9 + 1
            goto L17
        L68:
            androidx.compose.ui.platform.SemanticsNodeCopy r2 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.platform.AndroidComposeView r0 = r8.view
            androidx.compose.ui.semantics.SemanticsOwner r0 = r0.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r1 = r0.getUnmergedRootSemanticsNode()
            androidx.collection.IntObjectMap r0 = r16.getCurrentSemanticsNodes$ui_release()
            r2.<init>(r1, r0)
            r8.previousSemanticsRoot = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.updateSemanticsCopy():void");
    }

    private final void notifySubtreeStateChangeIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo10484trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String strM5906toLegacyClassNameV4PA4sw;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        if (semanticsNode.getParent() != null) {
            autofillId2 = contentCaptureSessionCompat.newAutofillId(r0.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (viewStructureCompatNewVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        if (unmergedConfig$ui_release.contains(SemanticsProperties.INSTANCE.getPassword())) {
            return null;
        }
        Bundle extras = viewStructureCompatNewVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getTestTag());
        if (str != null) {
            viewStructureCompatNewVirtualViewStructure.setId(semanticsNode.getId(), null, null, str);
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.TextView");
            viewStructureCompatNewVirtualViewStructure.setText(ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getEditableText());
        if (annotatedString != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
            viewStructureCompatNewVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getContentDescription());
        if (list2 != null) {
            viewStructureCompatNewVirtualViewStructure.setContentDescription(ListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getRole());
        if (role != null && (strM5906toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m5906toLegacyClassNameV4PA4sw(role.m5932unboximpl())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(strM5906toLegacyClassNameV4PA4sw);
        }
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui_release);
        if (textLayoutResult != null) {
            TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            viewStructureCompatNewVirtualViewStructure.setTextStyle(TextUnit.m6831getValueimpl(layoutInput.getStyle().m6154getFontSizeXSAIIZE()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
        }
        Rect boundsInParent$ui_release = semanticsNode.getBoundsInParent$ui_release();
        viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInParent$ui_release.getLeft(), (int) boundsInParent$ui_release.getTop(), 0, 0, (int) boundsInParent$ui_release.getWidth(), (int) boundsInParent$ui_release.getHeight());
        return viewStructureCompatNewVirtualViewStructure;
    }

    private final void bufferContentCaptureViewAppeared(int i2, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        if (this.bufferedDisappearedNodes.contains(i2)) {
            this.bufferedDisappearedNodes.remove(i2);
        } else {
            this.bufferedAppearedNodes.set(i2, viewStructureCompat);
        }
    }

    private final void bufferContentCaptureViewDisappeared(int i2) {
        if (this.bufferedAppearedNodes.containsKey(i2)) {
            this.bufferedAppearedNodes.remove(i2);
        } else {
            this.bufferedDisappearedNodes.add(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void notifyContentCaptureChanges() {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.notifyContentCaptureChanges():void");
    }

    private final void updateBuffersOnAppeared(SemanticsNode semanticsNode) {
        if (isEnabled$ui_release()) {
            updateTranslationOnAppeared(semanticsNode);
            bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode));
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                updateBuffersOnAppeared(replacedChildren$ui_release.get(i2));
            }
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (isEnabled$ui_release()) {
            bufferContentCaptureViewDisappeared(semanticsNode.getId());
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                updateBuffersOnDisappeared(replacedChildren$ui_release.get(i2));
            }
        }
    }

    private final void updateTranslationOnAppeared(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Function1 function12;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && Intrinsics.areEqual((Object) bool, (Object) true)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 != null && (function12 = (Function1) accessibilityAction2.getAction()) != null) {
                return;
            }
            return;
        }
        if (this.translateStatus == TranslateStatus.SHOW_TRANSLATED && Intrinsics.areEqual((Object) bool, (Object) false) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
        }
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), (Object) false) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), (Object) true) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.values;
        long[] jArr = currentSemanticsNodes$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).getSemanticsNode().getUnmergedConfig$ui_release();
                        if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (function0 = (Function0) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0Le^.ZS0\u000fs{B8cҕyCIh\"Ԃ*\teNog\u0005Jb\u000bI\u000f\fȡx\u0001ߚyU'\\R\u00148BņC3[o\u0006WnuN\u0005N4R<\b\b\u0019\u001aXL@\u0003\tHc\u0014\"4PrPQ;T3 X\u0006\u0007N\u000f&tg|8xpk=G#1mrR5hH|{\u0017vX5\u0018\u000faL7pCC\"=[\u0013\u000bb]U\u0002m\u0001k\u0013/,oIW\u0004o6\u0007\u0002D\u00199R%]!*\r\u0011_e$/;SsMf\rV~)\u0002SAǲ\u0012\u0017"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n~! Vo\u0017Kt!@h\u000e-77q7LPEo3{\u001fqp9\u0010r\nJ\u00026WYN\u0014X[n?\u0014\u001f\u0019~R+\u001fsf=-|K3.\f6Rd;o\f\f#u5ysLU\u001e\u001d", "", "u(E", "2nC?T5LZ\u0015\u000e~h5", "", "1n]AX5M1\u0015\n\nn9|p+n{*{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n~! Vo\u0017Kt!@h\u000e-77q7LPEo3{\u001fqp9\u0010r\nJ\u00026WYN\u0014X[n?\u0014\u001f0", "@db=b5LS", "\u001a`]1e6BRb\u000f\nb3Fo9n\u0002\u0016\u0007<\u000e%\u0017#|\u001b8\u000bz", "\u001a`]1e6BRb\u0010~^>F\u0018<a\t6\u0003<\u0010\u001b!P9~@v7$fy)Et\u0012=QMDX4, rjG\u00079", "=m2?X(MS\n\u0003\bm<x\u0010 i\u007f:jM| %Nk\u001d@\u0001.\"Y\n07{%<", "DhaAh(E7\u0018\r", "", "At_=b9MS\u0018_\u0005k4x\u0018=", "", "@d`BX:Mav\t\u0002e,z\u00189r", "\u001aiPCTuNb\u001d\u0006D_<\u0006\u0007>i\n1E\u001e\u000b %Ww\u000eIL", "\u001a`]1e6BRb\u0010~^>F\u0018<a\t6\u0003<\u0010\u001b!P9~@v7$fy)Et\u0012=QMDX4*%hoH\\", "=mE6e;NO o~^>k\u0016+n\u000e/wO\u0005! 4o\u001cG\u0001.CY\f", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class ViewTranslationHelperMethods {
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        public final void onVirtualViewTranslationResponses(final AndroidContentCaptureManager androidContentCaptureManager, final LongSparseArray<ViewTranslationResponse> longSparseArray) throws Throwable {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Yd("Xf]ljea,ns/Nrsuky", (short) (Od.Xd() ^ (-20653)))).getDeclaredMethod(Xg.qd("^]mG\\ekJnoqgu", (short) (ZN.Xd() ^ 16608), (short) (ZN.Xd() ^ 12164)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                if (Intrinsics.areEqual(((Looper) declaredMethod.invoke(null, objArr)).getThread(), Thread.currentThread())) {
                    doTranslation(androidContentCaptureManager, longSparseArray);
                } else {
                    androidContentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$ViewTranslationHelperMethods$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidContentCaptureManager.ViewTranslationHelperMethods.onVirtualViewTranslationResponses$lambda$1(androidContentCaptureManager, longSparseArray);
                        }
                    });
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public static final void onVirtualViewTranslationResponses$lambda$1(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
        }

        private final void doTranslation(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            Function1 function1;
            LongIterator longIteratorKeyIterator = LongSparseArrayKt.keyIterator(longSparseArray);
            while (longIteratorKeyIterator.hasNext()) {
                long jNextLong = longIteratorKeyIterator.nextLong();
                ViewTranslationResponse viewTranslationResponse = longSparseArray.get(jNextLong);
                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = androidContentCaptureManager.getCurrentSemanticsNodes$ui_release().get((int) jNextLong)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                }
            }
        }

        public final void onCreateVirtualViewTranslationRequests(AndroidContentCaptureManager androidContentCaptureManager, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode semanticsNode;
            String strFastJoinToString$default;
            for (long j2 : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = androidContentCaptureManager.getCurrentSemanticsNodes$ui_release().get((int) j2);
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidContentCaptureManager.getView().getAutofillId(), semanticsNode.getId());
                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
                    if (list != null && (strFastJoinToString$default = ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builder.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(strFastJoinToString$default, null, null, 6, null)));
                        consumer.accept(builder.build());
                    }
                }
            }
        }
    }

    public final void onCreateVirtualViewTranslationRequests$ui_release(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
    }

    public final void onVirtualViewTranslationResponses$ui_release(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) throws Throwable {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(androidContentCaptureManager, longSparseArray);
    }

    private final void checkForContentCapturePropertyChanges(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        int[] iArr = intObjectMap.keys;
        long[] jArr = intObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i6 = iArr[(i2 << 3) + i5];
                        SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i6);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(i6);
                        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode != null) {
                            if (semanticsNodeCopy == null) {
                                Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsNode.getUnmergedConfig$ui_release().iterator();
                                while (it.hasNext()) {
                                    if (Intrinsics.areEqual(it.next().getKey(), SemanticsProperties.INSTANCE.getText())) {
                                        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
                                        sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null));
                                    }
                                }
                            } else {
                                Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it2 = semanticsNode.getUnmergedConfig$ui_release().iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.areEqual(it2.next().getKey(), SemanticsProperties.INSTANCE.getText())) {
                                        List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
                                        AnnotatedString annotatedString = list2 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list2) : null;
                                        List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
                                        AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list3) : null;
                                        if (!Intrinsics.areEqual(annotatedString, annotatedString2)) {
                                            sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(annotatedString2));
                                        }
                                    }
                                }
                            }
                            i3 = 8;
                        } else {
                            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                    }
                    j2 >>= i3;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }
}
