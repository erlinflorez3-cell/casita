package com.braze.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import bo.app.a8;
import bo.app.b8;
import bo.app.c8;
import bo.app.d8;
import bo.app.e8;
import bo.app.f8;
import bo.app.g8;
import bo.app.h8;
import bo.app.i8;
import bo.app.j8;
import bo.app.k8;
import bo.app.l8;
import bo.app.m8;
import bo.app.n8;
import bo.app.s7;
import bo.app.wu;
import bo.app.x7;
import bo.app.xk;
import bo.app.xu;
import bo.app.y7;
import bo.app.z7;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĉ\u0014D57\u001eq\u007fZDkt\u0012O\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6RY*\u0017k\n4,[*qK;k\u001a\u0006\"\u000fRVguzRZ\u0011E\u0017\u0006$\u0002r,OV\u0001] /:BuB;M\u0006=A`z:\r @(@y\u000b\u0004\"*V\u0017~zI_\u0014\u0012F@x:X\u0016U\u00050\u0012\u000e>&\u0013&\\}N>HrbB/9\u0003qBT3eE\u0013ձ+A\u0005';u\u001a\u001e'DwB%)a\u0010\u001fR\nKƄCsC}v!odWzo<h\u0002$\u0015a˽;c\u00132bӤ_a4-;QsK\u0007ʫVw+\u0006\u001b?\u001c\u0014\u0016)X.cԿ\u0015\n>7\u0003wk@~\u0006%Bȸ~c<\u001e3\b{8G%~Q\u0010D_SѼ\u007f\u0007\u0013(1\f??ia&`C'\u000bȭ(ĺS͘AXV\f_J{\u0012\u0001d\b;\u0012;_\u00025\u000b\u001f>g=EqQ#O}8\t\u001bϜxݶdrckX]N-\u0007\u0018==\u0017 +Sr\u001d\u0004P\u0003obUܖ X\u001f\u007f\u000e+.uHK/?(N}\u007f /ܷa\u000e=1lQg\b<#eWv9ESs\u0010\u0010d%/u\u0001И\t\\~DY(hyx1@h\u0003\u0010&\u000ez\u0013ܟ\u00176Ws\"S:Eik#l\u001b\u001epb3Mރ^l(\u0001ZU2&:3\u0003.\u0019P\u000b\b&,֑M0\u0015b(ROj\u0006(4{:hb\u0014YKҋw\u0004_iRmZ\u0006f\u0005c#8\u0016HP\bsˮ\u0017\u0013\u0017+8);^\u001d\u0002s|e\u0012U#3>ӛ?lFi\u000e\u0014~V1yX|l\u0017P\u001f\u00157ן\fh\u0018{gr\tq4c\u0019\rVI!1\u0010\u0001ҡ<\u0001\u001d!$T\u000f r\fC`['K>.Xڏ\u0019euku`\b\r_;\u0003\u001c\u001c,\u0012>&'жa<K:O\u000f\rI:&r7Pr;\t\u0016z!6#2vS\u001b5ެ<Q#1\u0004\u001e\u0015@]\u007fd\u0016R\u0013\u001e\u0015jrʡ.w[\u007f\u001a\u0018Q>a\\a#\u0006mysA\u000f؝\u000e\u000f\u00143tM*Vpee !04\u0006Nzװ?f\u001d>\u000f`B@\r\u0017\u0019\u0003li4\"1Dʮc\u0013/4H2Ij^c\u0007\u001enH3\t{%Ճ.\u0005\u0017\u00119^\u0007_\u0002\u001a{\u000bl/\u0012Z7\u0019\u009b\r%zQ\u0005*36\\V?]6\u0003Q\u001cS&[K\u001852\r_2Ãs\u0010P\u001a\u0003cP_kH_Zwv^uA\u001a͇Rh\u000f\u0014l\u001c\\;y\u0010\tH&> \u000e9+\u00067ƚf1dP}\u0002Q.Q&Ru\u001f\f+z|_ұ\n9E?O7\"@Lfa\t\u0016\bN7]Hȯ%`o\u0010lWk4\u000b%\u007fdz\u00027*\u0007dɯ2N\rt\u0010|\u0016O \u0013AR+`oj&3vk߿p\nZMnH\u0018w=x|*#\tv3fy\u001d~~#?lӰ2\u0017p\\@cas)&\u000ej-,/8\u0018bWa}i\u001f5քS_%-5A85\u0002?`u\u0016\u001f(\r:oķ,\u0019SXS\u0016r\"-{P0&^\u0019?\u001b9צ-\u0018\u0015\u0001N7\u001f,\u0005U\u0001w|/e0U ǏKd\u001f\u0006K#4:\u0002aMuO29\u0007^;\u05ce\u0007>zv\u0006\u0005P\"C\u000fu\bEF\u0003TPkڵ(q|\u0005,'SQ\u0013\u0017:n&\u0011]qndۋ`\u001e4=W\u0010O2a\u0010#\u0017\u001eo50k/ܱW)B\u0003\u0003_\u001bXJ@y\u001a\f7!:eSΘ\u001f[~=+\u0015sew\u001b\u0010Gb~{\f\rSˋ0MMG$ZcjP\u001b-\b<\b\f\".Wg\r\u008dc`XXy:\u0012:zE|*;G\u001b!*Nߢm\u001c\ffaFBkK)'-V0=n\u0017E{O(\u0011zQӘ\u0018;'\b/\u001b%P`^\u007f*CI!de!ґ@\u0017\f\u0006@\u001coOJVNDB\u0006[)\u000b(ènqia\u0016# &]\u0013\u0006\u001dj`.wS\\ĔOz^8bd[Z3\u001aN{<^\\YBOʲ\u001a2`\u0019\bjXye\"A5\fAu)\r@ؗ!\u0015s'\f\u0013u\u0004\u0018TcbpCI5\u001bmxGck\u0013IȜ%O|-\u001box~~Vd02*\u0007\u001dD\nŜL\u0014\\zJ\u001a{I\u0001A^rrEs\u007fJ1s\u001aȀi\u0003Jd=Nr%{FedjUQD/FК\u0014E1\u0015\u0011\u0013aR\u00032\u0002\u0005I>*\u001f\u0013\u000eʳ\u0001qa\u0012\tXX:ǻ\n<"}, d2 = {"\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011M\n:y%47\b)8q\u0018>Z?Jo>'\u007fukJ\u000bb,[L", "", "\u0013", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "B`a4X;\u001e\\)\u0007Xe(\u000b\u0017", "\u001aa^{T7I\u001d-PP", "1n]3\\.\u001fW\u0019\u0006y", "\u001aiPCTuNb\u001d\u0006D>5\r\u0011\u001de\u000f}", "5dc\u0014X5>`\u001d|Zg<\u0005v/t`5\u0006Hn&$Kx\u0010*v4", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000fxJJ\u0013\"R9\"\u000eLh\u001c^y137&=QJ\u0005K=.\u001dVaH\\", "", "1kT.e", "u(E", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0010b5MS,\u000e9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "5dc\u0010b5MS,\u000e9Z5{\u00169i~\"\n?\u0007\u0011\u0014C}\u000e6\u0004%<Yy.7,\u00127VMJgC\"\u001fqo", "", "5dc X9OS&mvk.|\u0018", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc X9OS&mvk.|\u0018ma\t1\u0006O|&\u001bQx\u001c", "AdaCX9-O&\u0001zm", "", "7r??X=>\\(b\u0004:7\bp/s\u000e$}@_\u001b%Rv\nPW/B8\u0002!8m#.VR+y4+#Hj5\u0004j,M", "u(I", "7r4=[,FS&z\u0002>=|\u0012>s_1w=\b\u0017\u0016", "", "5dc\u0012c/>[\u0019\fve\f\u000e\t8te(\u0010N", "u(;7T=:\u001d)\u000e~euj\t>;", "3oW2`,KO ^\f^5\fn/y\u000e", "5dc\u000fT:>C&\u0006[h9i\t;u\u007f6\u000bN", "0`b2H9E4#\fg^8\r\t=t\u000e", "\u001aa^{T7I\u001d'PP", "5dc\u000fe(SSt\n~D,\u0011", "u(;/bu:^$H\t0\u0002", "0qPGX\bIW~~\u000f", "7r01`\u0014>a'z|b5~u/g\u00046\u000bM|&\u001bQxmEr\"<Y|", "7r;<V(MW#\bXh3\u0004\t-t\u00042\u0005 \n\u0013\u0014No\r", "7r62b->\\\u0017~\t>5x\u00066e~", "", "5dc `(EZ\u0002\t\nb-\u0001\u0007+t\u00042\u0005$~! 4o\u001cF\u000723Ya\u001f", "u(8", "AlP9_\u0015Hb\u001d\u007f~\\(\f\r9nc&\u0006Im\u0017%Q\u007f\u001b:v\t4", "5dc\u0019T9@S\u0002\t\nb-\u0001\u0007+t\u00042\u0005$~! 4o\u001cF\u000723Ya\u001f", ":`a4X\u0015Hb\u001d\u007f~\\(\f\r9nc&\u0006Im\u0017%Q\u007f\u001b:v\t4", "", "5dc!e0@U\u0019\fV\\;\u0001\u00138M\u00041\u007fH\u0011\u001f\u0006Kw\u000e \u007f45f\u000f\u001c>Q\u001f\u001cMAEt3,", "u(9", "BqX4Z,K/\u0017\u000e~h5d\r8i\b8\u0004/\u0005\u001f\u0017+x\u001d<\u000461`a)%m\u00148VBI", "5dc X:LW#\bib4|\u0013?tm(yJ\n\u0016%", "Adb@\\6GB\u001d\u0007zh<\fv/c\n1zN", "5dc#X9LW#\bXh+|", "5dc#X9LW#\bXh+|G+n\t2\u000b<\u0010\u001b!P}", "Dda@\\6G1#}z", "5dc\u0010h:M]!^\u0004]7\u0007\r8t", "1tbAb4\u001e\\\u0018\n\u0005b5\f", "5dc\u0011b,L6\u0015\bye,g\u0019=h^({Kg\u001b M}iL\u0006/=U\r$5i\u001d5a", "2nT@;(GR ~en:\u007fg/e\u000b\u000f\u007fI\u0007%rW~\u0018Dr49Wy'>\u0002", "7r=2j:?S\u0019}kb:\r\u00056I\t'\u007f>|&!TY\u0017", "5dc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nt\u001aCx\u0017<}\u000e1a}", "2dU.h3M<#\u000e~_0z\u0005>i\n1YC|  Gvv8~%", "5dc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nt\u001aCx\u0017<}\u00045g{-;x%2WL", "2dU.h3M<#\u000e~_0z\u0005>i\n1YC|  Gvl<\u0005#B]\t/;w\u001f", "5dc\u000ec7EW\u0017z\nb6\u0006l-o\t\u0015{N\u000b'$Eoq;", "/o_9\\*:b\u001d\t\u0004B*\u0007\u0012\u001ce\u000e2\fM~\u0017zF", "5dc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nr\u0015Eo\u0017KT/<c\u000b", "5dc\u0011X-:c \u000ech;\u0001\n3c{7\u007fJ\nr\u0015Eo\u0017KT/<c\u000b^3v\u001f8\\?Jo>'#", "2dU.h3M<#\u000e~_0z\u0005>i\n1W>~\u0017 VM\u0018C\u00012", "\u001ab^:\")KO.~D^5\r\u0011=/m'\u0002!\b\u0013(Q|c", "5dc W2\u001fZ\u0015\u0010\u0005k", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqi?\u0007w\u001eC\u0001\u0018IL", "AcZ\u0013_(O]&", "7r?Bf/\u001dS\u0019\nab5\u0003e+c\u0006\u0016\u000b<~\u001drE~\u0012Mz4I9\u0007\u001c4t\u0016-", "5dc\u001dh:A2\u0019~\u0006E0\u0006\u000f\fa}.iO|\u0015\u001d#m\u001d@\b)Dm['3{$\u0017IK;", ">tb57,>^\u007f\u0003\u0004d\tx\u00075S\u000f$yF\\\u0015&K\u0001\u0012K\u000b\u0003<U\f. i\u001e.", "7rB2f:B]\"l\nZ9\fe+s\u007f'jD\t\u0017!W~mEr\"<Y|", "7r56e,;O'~Xe6\r\b\u0017e\u000e6wB\u0005 \u00194o\u0010@\u00054BU\r$Avu7I@Bk3", "7r2<a;>\\(\\vk+\u000bx8r\u007f$z1\u0005%'CvqEu)3U\r*DM\u001f*JJ;j", "5dc\u0013\\9>P\u0015\rz<3\u0007\u0019.M\u007f6\n<\u0003\u001b I]\u000eEu%B=|\u00067\u0002", "4ha2U(LSv\u0006\u0005n+d\t=s{*\u007fI\u0003\u0005\u0017Pn\u000eIZ$\u001bY\u0012", "\u001ab^:\")KO.~D^5\r\u0011=/^(\rD~\u0017|G\u0004c", "5dc\u0011X=BQ\u0019hwc,z\u0018!h\u00047{G\u0005%&", "u(;7T=:\u001d)\u000e~eu\\\u0012?mm(\u000b\u0016", "2de6V,(P\u001e~xm\u001e\u007f\r>e\u0007,\nO", "5dc\u0011X=BQ\u0019hwc,z\u0018\u000bl\u00072\u000eG\u0005%&", "2de6V,(P\u001e~xm\b\u0004\u00109w\u0007,\nO", "7r32i0<S\u0003{\u007f^*\fz2i\u000f(\u0003D\u000f&vPk\u000bCv$", "7r32i0<S\u0003{\u007f^*\fd6l\n:\u0003D\u000f&vPk\u000bCv$", "7r8;47I;\u0019\r\tZ.|d-c\u007f6\nD}\u001b\u001eK~\"\u001c\n#<i\f$Hm}8LC\u001bt0\u001b\u001ch`", "7r?Bf/0O\u001f~h\\9|\t8F\n5dJ\u0010\u001b\u0018Km\nKz/>9\u0007\u001c4t\u0016-", "7r?Bf/'](\u0003{b*x\u00183o\t\u000b\u000bH\b\u0004\u0017Pn\u000eIz.79\u0007\u001c4t\u0016-", "5dc\u0011b,L>)\r}L;\u0007\u0016CD\u00046\u0004D\u000f%\u0001PM\u0015@t+", "2nT@C<LV\u0007\u000e\u0005k@[\r=m\u00046\n*\nt\u001eKm\u0014", "7r8;47I;\u0019\r\tZ.|w/s\u000f\u0013\fN\u0004v\u0013Io\u001b\u001bz3@`y4\u0017v\u0012+TC:", "7r0Bg6FO(\u0003x@,\u0007\n/n}(h@\r'\u0017U~\u001c\u001c\u007f!2`}\u001f", "5dc\u0019b.@S&b\u0004b;\u0001\u00056L\n*b@\u0012\u0017\u001e", ":nV4X9\"\\\u001d\u000e~Z3c\u00131L\u007f9{G", "5dc\u0010h:M]!a\nf3n\t,V\u0004(\u000e\u001c~&\u001bXs\u001dPT,1g\f\t3u\u0016", "1tbAb4!b!\u0006l^)m\r/w[&\u000bD\u0012\u001b&[M\u00158\u00053\u001eU\u0006 ", "5dc\u0016a\bI^\u0001~\tl(~\t!e|\u0019\u007f@\u0013t\u001eKo\u0017K`. U\u007f \u0018q\u001f2[F;j\u001c\u001a(Z]=\u0016K:", "7m0=c\u0014>a'z|^\u001e|\u0006 i\u007f:YG\u0005\u0017 VY\u0017'r'5:\u0002);{\u0019.L+7~&\u001a\u0019wIG", "\u001ab^:\")KO.~D^5\r\u0011=/f2y<\u0010\u001b!PZ\u001bF\b)4Y\u000b\t3u\u0016\u0004", "5dc\u0010h:M]!e\u0005\\(\f\r9nj5\u0006Q\u0005\u0016\u0017TX\nDv3", "1tbAb4%]\u0017z\nb6\u0006s<o\u0011,z@\u000e\u007f\u0013Oo\u001c", "7r56e,;O'~b^:\u000b\u00051i\t*i@\u000e(\u001bEowE_%GH\b&7v\u0003.OGIzA\u001a$lkBfl(K}'F", "7rB1^\bNb\u001c~\u0004m0z\u0005>i\n1[I|\u0014\u001eGn", "7rC<h*A;#}zK,\t\u00193r\u007f'\\J\u000ey&OvqER0@A}.Ei\u0018.[", "7r7A`3\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0004\u0007K\b+\tKx\rF\t\t>g}/EM\u001f*JJ;j", "7r7A`3\"\\t\n\u0006F,\u000b\u0017+g\u007f\u000b\u000bH\b}\u001bPu|8\u0004'5h])3j\u001d.L", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\u0005\u0016MW\u000eKr$1hyu", "5dc W2&S(zyZ;x", "AcZ\u001aX;:R\u0015\u000ev", "7r5._3;O\u0017\u0005[b9|\u0006+s\u007f\u0010{N\u000f\u0013\u0019Kx\u0010*v2F]{ \u0017v\u0012+TC:", "5dc\u0013T3EP\u0015|\u0001?0\n\t,a\u000e(c@\u000f%\u0013Is\u0017>d%Bj\u0002\u001e7K\u001d*[QFgC!", "4`[9U(<Yy\u0003\b^)x\u0017/M\u007f6\n<\u0003\u001b I]\u000eI\b)3Y['3{$9IR>", "5dc [6NZ\u0018h\u0006m\u0010\u0006z2e\t\u0013\fN\u0004r'Vr\u0018Iz:5X", "Ag^B_+(^(b\u0004P/|\u0012\u001au\u000e+WP\u0010\u001a!Ts#<u", "5dc [6NZ\u0018n\t^\u001e\u0001\u0012.o\u0012\t\u0003<\u0003\u0005\u0017E\u007f\u001b<Z.\u0011W\r$Hq%2MQ", "Ag^B_+.a\u0019p~g+\u0007\u001b\u0010l{*i@~'$GS\u0017\u0018t49j\u0002/;m$", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "\u0011n\\=T5B]\"", "0n\u001e.c7\bfj", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final x7 Companion = new x7();
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = (int) TimeUnit.SECONDS.toMillis(15);
    public static final String DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE = "";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE = "General";
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 10;
    private static final int DEFAULT_TRIGGER_MINIMUM_INTERVAL = 30;
    public static final int MAX_ALLOWED_EPHEMERAL_EVENTS = 12;
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context) throws Throwable {
        super(context, false, null, 6, null);
        Intrinsics.checkNotNullParameter(context, Jg.Wd("\u0004>\u001cA\u0011R-", (short) (C1607wl.Xd() ^ 34), (short) (C1607wl.Xd() ^ 19221)));
        short sXd = (short) (ZN.Xd() ^ 15671);
        short sXd2 = (short) (ZN.Xd() ^ 16469);
        int[] iArr = new int["0-f%X]gD\u0002\"N\u0011r`Vhp2(4\u0013\r\u0016".length()];
        QB qb = new QB("0-f%X]gD\u0002\"N\u0011r`Vhp2(4\u0013\r\u0016");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud("$^mCF\u007f3md\u0001\u001dY\u0019K<krf\u0005FZ", (short) (C1633zX.Xd() ^ (-18089)), (short) (C1633zX.Xd() ^ (-31087))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            short sXd3 = (short) (ZN.Xd() ^ 11182);
            int[] iArr2 = new int["l+&\u0006\u0014R|SDAI!OEE0Pn3\"\f\\N9\u001ac".length()];
            QB qb2 = new QB("l+&\u0006\u0014R|SDAI!OEE0Pn3\"\f\\N9\u001ac");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                i3++;
            }
            Intrinsics.checkNotNullExpressionValue(context2, new String(iArr2, 0, i3));
            this.context = context2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void getContext$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getDefaultNotificationAccentColor$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> targetEnumClass, y7 y7Var) {
        String str = y7Var.f2277a;
        if (getConfigurationCache().containsKey(str)) {
            Object obj = getConfigurationCache().get(str);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.EnumSet<E of com.braze.configuration.BrazeConfigurationProvider.getGenericEnumSetFromStringSet>");
            return (EnumSet) obj;
        }
        Set<String> sourceStringSet = getStringSetValue(y7Var.f2277a, new HashSet());
        if (sourceStringSet == null) {
            sourceStringSet = new HashSet<>();
        }
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        Intrinsics.checkNotNullParameter(sourceStringSet, "sourceStringSet");
        EnumSet<E> result = (EnumSet<E>) EnumSet.noneOf(targetEnumClass);
        for (String str2 : sourceStringSet) {
            try {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String enumValue = str2.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(enumValue, "this as java.lang.String).toUpperCase(locale)");
                Intrinsics.checkNotNullParameter(enumValue, "enumValue");
                Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
                result.add(Enum.valueOf(targetEnumClass, enumValue));
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.support.e.f2703a, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new wu(str2), 4, (Object) null);
            }
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        getConfigurationCache().put(str, result);
        return result;
    }

    private final String getServerTarget() {
        String stringValue = getStringValue("com_braze_server_target", "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    private static /* synthetic */ void getServerTarget$annotations() {
    }

    public static /* synthetic */ void getVersionCode$annotations() {
    }

    public final void clear() {
        getConfigurationCache().clear();
        getRuntimeAppConfigurationProvider().getStorageMap().edit().clear().apply();
    }

    public final int getApplicationIconResourceId() throws Throwable {
        ApplicationInfo applicationInfo;
        Map<String, Object> configurationCache = getConfigurationCache();
        short sXd = (short) (C1580rY.Xd() ^ (-21919));
        int[] iArr = new int["Y\u0016\u0006_.\u0006\u0016B\u0007^Y*\u007f\n\u007fb".length()];
        QB qb = new QB("Y\u0016\u0006_.\u0006\u0016B\u0007^Y*\u007f\n\u007fb");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        if (configurationCache.containsKey(str)) {
            Object obj = getConfigurationCache().get(str);
            Intrinsics.checkNotNull(obj, C1561oA.Qd("hndc\u0016XUa``d\u000fPR\fNK\\\\\u0007ZT\u0004QQO\rMSIHzNRH<u@CG>:>|\u0017;@", (short) (OY.Xd() ^ 19995)));
            return ((Integer) obj).intValue();
        }
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("Vd[jhc_*`mmtfpw2Huu|n\u0003\u007f", (short) (OY.Xd() ^ 18354), (short) (OY.Xd() ^ 6576))).getMethod(C1561oA.od("wt\u0003]mnujolTfqh", (short) (ZN.Xd() ^ 27967)), new Class[0]);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(context, objArr);
            int i3 = 0;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context2 = this.context;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.Kd("HVM\\ZUQ\u001cR__fXbi$:ggn`tq", (short) (FB.Xd() ^ 19934))).getMethod(Wg.Zd("0\u0004V\u0017.\u0015`;F\u0019d}p(\u0012\u0014\u0007", (short) (OY.Xd() ^ 10047), (short) (OY.Xd() ^ 26463)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                        PackageManager.ApplicationInfoFlags applicationInfoFlagsOf = PackageManager.ApplicationInfoFlags.of(0L);
                        Class<?> cls = Class.forName(C1561oA.Xd("esjywrn9o||\u0004u\u007f\u0007A\u0005\u0003Dgy|\u0006|\u0004\u0003k\u0001\u000f\u0003\n\t\u0017", (short) (C1499aX.Xd() ^ (-28743))));
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = Class.forName(Wg.vd("+!9#j( , e\u000e.'\u001d%\u001d", (short) (ZN.Xd() ^ 21266)));
                        short sXd2 = (short) (C1499aX.Xd() ^ (-28323));
                        short sXd3 = (short) (C1499aX.Xd() ^ (-32601));
                        int[] iArr2 = new int["\u0019%\u001a'#\u001c\u0016^\u0013\u001e\u001c!\u0011\u0019\u001eV\u0018\u0014St\u0005\u0006\r\u0002\u0007\u0004j}\n{\u0001}\n:V\u0005\u0004~zsp\u0003v{ySwnvLqeju".length()];
                        QB qb2 = new QB("\u0019%\u001a'#\u001c\u0016^\u0013\u001e\u001c!\u0011\u0019\u001eV\u0018\u0014St\u0005\u0006\r\u0002\u0007\u0004j}\n{\u0001}\n:V\u0005\u0004~zsp\u0003v{ySwnvLqeju");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK(((sXd2 + i4) + xuXd2.CK(iKK2)) - sXd3);
                            i4++;
                        }
                        clsArr[1] = Class.forName(new String(iArr2, 0, i4));
                        Object[] objArr3 = {str2, applicationInfoFlagsOf};
                        Method method3 = cls.getMethod(hg.Vd("\u001a\u0017%p\u001f\u001e\u0019\u0015\u000e\u000b\u001d\u0011\u0016\u0014m\u0012\t\u0011", (short) (Od.Xd() ^ (-13699)), (short) (Od.Xd() ^ (-23646))), clsArr);
                        try {
                            method3.setAccessible(true);
                            applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } else {
                    Context context3 = this.context;
                    short sXd4 = (short) (C1499aX.Xd() ^ (-20074));
                    int[] iArr3 = new int["\u0014 \u0015\"\u001e\u0017\u0011Y\u000e\u0019\u0017\u001c\f\u0014\u0019Qe\u0011\u000f\u0014\u0004\u0016\u0011".length()];
                    QB qb3 = new QB("\u0014 \u0015\"\u001e\u0017\u0011Y\u000e\u0019\u0017\u001c\f\u0014\u0019Qe\u0011\u000f\u0014\u0004\u0016\u0011");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(sXd4 + i5 + xuXd3.CK(iKK3));
                        i5++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr3, 0, i5));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr4 = new Object[0];
                    short sXd5 = (short) (ZN.Xd() ^ 15524);
                    int[] iArr4 = new int["@?O,69B9HG0EK?FE;".length()];
                    QB qb4 = new QB("@?O,69B9HG0EK?FE;");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i6));
                        i6++;
                    }
                    Method method4 = cls2.getMethod(new String(iArr4, 0, i6), clsArr2);
                    try {
                        method4.setAccessible(true);
                        PackageManager packageManager2 = (PackageManager) method4.invoke(context3, objArr4);
                        short sXd6 = (short) (C1580rY.Xd() ^ (-20072));
                        int[] iArr5 = new int["o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011K\u000f\rNq\u0004\u0007\u0010\u0007\u000e\ru\u000b\u0019\r\u0014\u0013!".length()];
                        QB qb5 = new QB("o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011K\u000f\rNq\u0004\u0007\u0010\u0007\u000e\ru\u000b\u0019\r\u0014\u0013!");
                        int i7 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i7] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd6 + sXd6) + sXd6) + i7));
                            i7++;
                        }
                        Class<?> cls3 = Class.forName(new String(iArr5, 0, i7));
                        Class<?>[] clsArr3 = new Class[2];
                        clsArr3[0] = Class.forName(Xg.qd("RJ`L\u001aYO]W\u001fEgf^d^", (short) (C1633zX.Xd() ^ (-30763)), (short) (C1633zX.Xd() ^ (-21817))));
                        clsArr3[1] = Integer.TYPE;
                        Object[] objArr5 = {str2, 0};
                        Method method5 = cls3.getMethod(Jg.Wd("?jPssj=\n\\\u0011r@\u001d\u000b=;\u0002A", (short) (Od.Xd() ^ (-2618)), (short) (Od.Xd() ^ (-4343))), clsArr3);
                        try {
                            method5.setAccessible(true);
                            applicationInfo = (ApplicationInfo) method5.invoke(packageManager2, objArr5);
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                }
                short sXd7 = (short) (C1499aX.Xd() ^ (-2745));
                short sXd8 = (short) (C1499aX.Xd() ^ (-3166));
                int[] iArr6 = new int["qJQ\u001enIH4MMYt3g|\u001a_P'\\B8|kꔎ!P=\u001dO\u0006JCQ>E\u000bTQyS8XT7{\n^=[".length()];
                QB qb6 = new QB("qJQ\u001enIH4MMYt3g|\u001a_P'\\B8|kꔎ!P=\u001dO\u0006JCQ>E\u000bTQyS8XT7{\n^=[");
                int i8 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i8] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((i8 * sXd8) + sXd7)));
                    i8++;
                }
                Intrinsics.checkNotNullExpressionValue(applicationInfo, new String(iArr6, 0, i8));
                i3 = applicationInfo.icon;
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new z7(str2), 4, (Object) null);
            }
            getConfigurationCache().put(str, Integer.valueOf(i3));
            return i3;
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = serverTarget.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return Intrinsics.areEqual("STAGING", upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final s7 getBrazeApiKey() {
        String stringValue = (String) getConfigurationCache().get("com_braze_api_key");
        if (stringValue == null) {
            stringValue = getRuntimeAppConfigurationProvider().getStringValue("com_braze_api_key", null);
            if (stringValue != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) b8.f250a, 6, (Object) null);
            } else {
                stringValue = getStringValue("com_braze_api_key", null);
            }
            if (stringValue != null) {
                getConfigurationCache().put("com_braze_api_key", stringValue);
            }
        }
        if (stringValue != null) {
            return new s7(stringValue);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) c8.f323a, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) d8.f466a, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) e8.f552a, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) f8.f624a, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) g8.f724a, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) h8.f810a, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) i8.f883a, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) j8.f990a, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) a8.f178a, 6, (Object) null);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
    }

    public final Context getContext$android_sdk_base_release() {
        return this.context;
    }

    public final String getCustomEndpoint() {
        return getStringValue("com_braze_custom_endpoint", null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        return getStringValue("com_braze_custom_html_webview_activity_class_name", "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, y7.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        Integer colorValue = getColorValue("com_braze_default_notification_accent_color");
        if (colorValue == null) {
            return 0;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) k8.f1083a, 7, (Object) null);
        return colorValue.intValue();
    }

    public final String getDefaultNotificationChannelDescription() {
        String stringValue = getStringValue("com_braze_default_notification_channel_description", "");
        return stringValue == null ? "" : stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        String stringValue = getStringValue("com_braze_default_notification_channel_name", DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE);
        return stringValue == null ? DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE : stringValue;
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, y7.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    @Deprecated(message = "\u0018Y\u0001t\rT!`fRg=W\u001a@2ab\u0012*\nW\u000e\\{I\u0003KZ\u00013}TUwV\u0015%\u0006", replaceWith = @ReplaceWith(expression = "getDeviceObjectAllowlist", imports = {}))
    @InterfaceC1492Gx
    public final EnumSet<DeviceKey> getDeviceObjectWhitelist() {
        return getDeviceObjectAllowlist();
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        return getBooleanValue("com_braze_handle_push_deep_links_automatically", false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        return getBooleanValue("com_braze_does_push_story_dismiss_on_click", true);
    }

    public final Set<String> getEphemeralEventKeys() {
        Set<String> stringSetValue = getStringSetValue("com_braze_ephemeral_events_keys", SetsKt.emptySet());
        if (stringSetValue == null) {
            stringSetValue = SetsKt.emptySet();
        }
        if (stringSetValue.size() > 12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) l8.f1173a, 6, (Object) null);
        }
        return CollectionsKt.toSet(CollectionsKt.take(stringSetValue, 12));
    }

    public final String getFallbackFirebaseMessagingServiceClasspath() {
        return getStringValue("com_braze_fallback_firebase_cloud_messaging_service_classpath", null);
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        return getStringValue("com_braze_firebase_cloud_messaging_sender_id", null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        return getIntValue("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        return getDrawableValue("com_braze_push_large_notification_icon", 0);
    }

    public final int getLoggerInitialLogLevel() {
        return getIntValue("com_braze_logger_initial_log_level", 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        return getStringValue("com_braze_push_deep_link_back_stack_activity_class_name", "");
    }

    public final SdkFlavor getSdkFlavor() {
        SdkFlavor sdkFlavorValueOf = null;
        String stringValue = getStringValue("com_braze_sdk_flavor", null);
        if (stringValue == null || StringsKt.isBlank(stringValue)) {
            return null;
        }
        try {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = stringValue.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sdkFlavorValueOf = SdkFlavor.valueOf(upperCase);
            return sdkFlavorValueOf;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) m8.f1264a, 4, (Object) null);
            return sdkFlavorValueOf;
        }
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        String upperCase;
        int i2;
        xk xkVar = xk.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(xkVar, "com_braze_internal_sdk_metadata", new HashSet());
        Intrinsics.checkNotNull(resourceConfigurationValue, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        Set<String> setAsMutableSet = TypeIntrinsics.asMutableSet(resourceConfigurationValue);
        Object resourceConfigurationValue2 = getResourceConfigurationValue(xkVar, "com_braze_sdk_metadata", new HashSet());
        Intrinsics.checkNotNull(resourceConfigurationValue2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        Object runtimeConfigurationValue = getRuntimeConfigurationValue(xkVar, "com_braze_sdk_metadata", new HashSet());
        Intrinsics.checkNotNull(runtimeConfigurationValue, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        setAsMutableSet.addAll((Set) resourceConfigurationValue2);
        setAsMutableSet.addAll((Set) runtimeConfigurationValue);
        EnumSet<BrazeSdkMetadata> result = EnumSet.noneOf(BrazeSdkMetadata.class);
        for (String str : setAsMutableSet) {
            try {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                upperCase = str.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.support.e.f2703a, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new xu(str), 4, (Object) null);
            }
            for (BrazeSdkMetadata brazeSdkMetadata : BrazeSdkMetadata.values()) {
                if (Intrinsics.areEqual(brazeSdkMetadata.name(), upperCase)) {
                    result.add(brazeSdkMetadata);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final int getSessionTimeoutSeconds() {
        return getIntValue("com_braze_session_timeout", 10);
    }

    public final boolean getShouldOptInWhenPushAuthorized() {
        return getBooleanValue("com_braze_optin_when_push_authorized", true);
    }

    public final boolean getShouldUseWindowFlagSecureInActivities() {
        return getBooleanValue("com_braze_use_activity_window_flag_secure", false);
    }

    public final int getSmallNotificationIconResourceId() {
        return getDrawableValue("com_braze_push_small_notification_icon", 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        return getIntValue("com_braze_trigger_action_minimum_time_interval_seconds", 30);
    }

    public final int getVersionCode() throws Throwable {
        int i2;
        Map<String, Object> configurationCache = getConfigurationCache();
        String strUd = C1626yg.Ud("\u000eS0\n\u001btp HTM(", (short) (C1607wl.Xd() ^ 3372), (short) (C1607wl.Xd() ^ 2955));
        if (configurationCache.containsKey(strUd)) {
            Object obj = getConfigurationCache().get(strUd);
            short sXd = (short) (ZN.Xd() ^ 4924);
            int[] iArr = new int["\u0017mv\u000e2A#wQ]`2JG}f(4\ro.`~I4\u001f?0)qUn\u001byf!-\\\u007fvrG\u001aK\u0018)K".length()];
            QB qb = new QB("\u0017mv\u000e2A#wQ]`2JG}f(4\ro.`~I4\u001f?0)qUn\u001byf!-\\\u007fvrG\u001aK\u0018)K");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                i3++;
            }
            Intrinsics.checkNotNull(obj, new String(iArr, 0, i3));
            return ((Integer) obj).intValue();
        }
        try {
            String resourcePackageName = PackageUtils.getResourcePackageName(this.context);
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("\"v@4k#8+\u001c\n\tj\u000b \\5\u0010$|HtUm", (short) (C1580rY.Xd() ^ (-32408)))).getMethod(C1561oA.Qd("ZWe@PQXMRO6IUGLIU", (short) (OY.Xd() ^ 8288)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(C1593ug.zd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016P\u0014\u0012Sv\t\f\u0015\f\u0013\u0012z\u0010\u001e\u0012\u0019\u0018&", (short) (Od.Xd() ^ (-8823)), (short) (Od.Xd() ^ (-24093))));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.od("\u0018\u000e\"\fW\u0015\t\u0015\rRv\u0017\u0014\n\u000e\u0006", (short) (C1633zX.Xd() ^ (-29885))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {resourcePackageName, 0};
                Method method2 = cls.getMethod(C1561oA.Kd(")(8\u0015'*3*10\u0015;4>", (short) (OY.Xd() ^ 15120)), clsArr);
                try {
                    method2.setAccessible(true);
                    i2 = ((PackageInfo) method2.invoke(packageManager, objArr2)).versionCode;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) n8.f1347a, 4, (Object) null);
            i2 = -1;
        }
        getConfigurationCache().put(strUd, Integer.valueOf(i2));
        return i2;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        return getBooleanValue("com_braze_push_adm_messaging_registration_enabled", false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        return getBooleanValue("com_braze_automatic_geofence_requests_enabled", true);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        return getBooleanValue("com_braze_content_cards_unread_visual_indicator_enabled", true);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        return getBooleanValue("com_braze_device_object_whitelisting_enabled", false);
    }

    @Deprecated(message = "\u0018Y\u0001t\rT!`fRg=W\u001a@7o0\u000e=\u000ek\u0011AxPsmbU0rwcpK`pMGG ??\u0016\u001e\u0015\u0017", replaceWith = @ReplaceWith(expression = "isDeviceObjectAllowlistEnabled", imports = {}))
    @InterfaceC1492Gx
    public final boolean isDeviceObjectWhitelistEnabled() {
        return isDeviceObjectAllowlistEnabled();
    }

    public final boolean isEphemeralEventsEnabled() {
        return getBooleanValue("com_braze_ephemeral_events_enabled", false);
    }

    public final boolean isFallbackFirebaseMessagingServiceEnabled() {
        return getBooleanValue("com_braze_fallback_firebase_cloud_messaging_service_enabled", false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        return getBooleanValue("com_braze_firebase_cloud_messaging_registration_enabled", false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        return getBooleanValue("com_braze_firebase_messaging_service_automatically_register_on_new_token", isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        return getBooleanValue("com_braze_geofences_enabled", isLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageApplyWindowInsetsEnabled() {
        return getBooleanValue("com_braze_html_in_app_message_apply_insets", false);
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        return getBooleanValue("com_braze_html_in_app_message_enable_html_link_target", true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        return getBooleanValue("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        return getBooleanValue("com_braze_in_app_message_push_test_eager_display_enabled", true);
    }

    public final boolean isLocationCollectionEnabled() {
        return getBooleanValue("com_braze_enable_location_collection", false);
    }

    public final boolean isNewsfeedVisualIndicatorOn() {
        return getBooleanValue("com_braze_newsfeed_unread_visual_indicator_on", true);
    }

    public final boolean isPreventInAppMessageDisplayForDifferentUsersEnabled() {
        return getBooleanValue("com_braze_prevent_in_app_message_display_for_different_user", false);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        return getBooleanValue("com_braze_push_deep_link_back_stack_activity_enabled", true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        return getBooleanValue("com_braze_push_notification_html_rendering_enabled", false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        return getBooleanValue("com_braze_push_wake_screen_for_notification_enabled", true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        return getBooleanValue("com_braze_sdk_authentication_enabled", false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        return getBooleanValue("com_braze_session_start_based_timeout_enabled", false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        return getBooleanValue("com_braze_require_touch_mode_for_html_in_app_messages", true);
    }
}
