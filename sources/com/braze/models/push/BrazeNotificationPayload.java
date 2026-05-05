package com.braze.models.push;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.Person;
import androidx.core.view.GravityCompat;
import androidx.webkit.ProxyConfig;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.JsonUtils;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativeincodesdk.ModuleNames;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xu;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0LeN.ZS8\u0015s{:(c$\u007faCU0}*\tUOog|ibŏK\u000f\u0014\"\u0001j2l]xs\u0012\u00172HpG3[\u0012E9vt>\u0005&3*8\b(\t\u001a0W\u0018v\tJS\f\u00188HpH[\u0015M\u000bN\u001a\u0006T \t\u001eb\u0001V6Vle:5+\tnX÷E۾/-M;E\r/̗uҬ\u001dҨ?˻4֘$\u00146\rWkE\u0011?\n?\u001bgU(;QyWDZ\u0018\u0016+*}\u000emz,\\\u0013Tx\u000e=*}g[X\u0014(\u0006\u007f\u0014\u000fR\u0003<\fόL.;!/\u0010\u001cߏs\u000bTnщ\u0001%BH\u000fo١\u0016=\u0001aڸ8Kp_pS\u001f^9\f\u0005;/Q\u00167/iڥ\rx\u0016IǑv\u00025_(UH|m\"S{֊oz\u0003X˯/w\f=ɡ\u0010F\u001e5:k:Q݆j0]\rn\u0005ސ_\u0001S\u0018i\u000fTr\r$?B\u000b\"Yrm;1'Ԁd¯\u0015[$T\u0015\f \u0015&f\u0006GA'\u0016Z]u:\u007f[l\"+?hGY\u001d|<go#ۋ9U{\u0012gd\u0005'\u0010Np\u0019plRU\u001cZ\u000b9PG\u001fН\u001cȑ\u007fDVۼcLM\b46B0GskȄ\u000fٿFM\u0005ȁw\\n(\rmS&\t\u00042\u0010Y\u001b^x\tq}wwCSʧ.έE]=ӧ>W(\u0006B\u0016C\t\u0005\u0012\u000eb8fUk\u0005\u0018\fT*7l֤Eֺ3I\u001bÁ\u0017+8\";^ltkr[-w\u0013\u000b{';\u0017/>ŔvҔ0lr\u07bagV\u001dD\u0005\u0002\u0013%\u000e\t\u000e\u001f2j\tm{V!Zl`)\u0007\u0018@%̃\tġ#0-˚\u007f$\u0003\\;k?\u001f\u001c!\"H5cc\u0014}IJ|\u001d+\rg\u001a+\u0012\u001cF̬]Є6G@Ծq\u0001DM2\u0019#DN\u0018\u00066\u0013#B<KJWc\u001fm\u000fԎ\u0017ɣ\u0002r\u000fԭ%r\\\fH,\u0010\u007f:_mED]\fFvE;\u0010{j>ơyљ`\u0017R\u05fa\"\r\u0002d|+<?&\u000be}YJ\u0014)08W:\u0011\u001c\u0013ʆ0Ҭ0H\u0010Ձ[Vo<\u001e\u0014 HeF%M\u0013\u000eIY&V\u000f[\u0005L[ށQȚ%6\tϓ'5$1Cj%oL\u000f=\u001f\u0003\u0016aY!!zQ\u000ffShrdo_Ϝ\\\u0005#Gc\u0002W\u0015\u0007\u0016Uh\u0006q\u007f\u000eH\u0018+Zp-qʆSμcv8͜[rr\u000f|\u0005\"jbP8(-\u0012\r\u0010L\n=MG\u0011)4ܑ1Pfy=\u0007(Eg^7L$\u000bsJ+/\u001c4[TYl$'*\u001a\u0002\u0002TЛ\"Č+\u0004|ե-w\u001c/\"_19D\tFh\u0010P+R6\u0003\\a33`ڛ\u0014˩S\b;ø+`_5\u0006:\u0011A97\u001eDag'!:ؠo߾Y\u0017\u000bϟIX\u007f:;i=\u000b-\u001a<.)vH^k\"n\u0010.\u001dkҸ+߱\fp1\u0010]q\u0001rq\u001ei\u0018K1qyo>\u0001l,N7{\f\u0003Xk~ׄGܑQJlӷtnH)\u001cw\u000b*jG\u001aDd!\r\u001cv\u001d#6VrL{?9)\u001f\n$u\"]ʞQõ*-9ĜW\u001d=\u0007\u00194Hx\u0017XH9E\"8\u001a!r.@b1\u0005X\u0014ԫ3ڵ(\u007flܞ6MK\u0012P0D\u0013\u0014k=6X\"D9(y\fsA 1\u0011/mn\n.\u000boǂvܱW72ʈ\r\u0003\u0013\u001f\bY\u0004<y\u0018\u0001~O\u0011u|eD\f=CHd':e<ڋ\u000bߚgb\u0017ʨDK;(,^uB\u0006o-\u000bt\u001e\u0004\u000b\u0018E_,\u0001تhȡZ\u007f_ƨ>,<VR\bgn~\\\u0018\u0013:0\u0002Nsab%Qߴ%ܵB65ì\u001fGSR\bod\u000fK~EuVKA\u0003\u0015\u0010}Uv/\bv$ҕhґ@%{̜J4g#\boX[0q;vtepX{80(F\u0001%\r2[\b\u05f6lڞd) ñcxL%j]mChzNutv<3$\u000b4y\u0005Њ#ў\u0002Vhň+5MdO,2X\u0002\u0013+w,?\u0014\u0018\u007fl]>\u0004\t/״Eߵ\u000fyRկMgbxc:kf1\n\u000e\u0006{JULV\u001c@W4\u0017\u001cŀTЄH\u0007L({>H2VuhN}\u0003\"\u0017Kbe\u007f\r+z9qc?B\u000eǡzדY/5Ҽ\u001a\u0005\u0016;',+ Y4@>D'?:\u0014\nrH\u0004\u0014Dۥ\u001cØeV)ǒ\u001eA5>Y\u0006vgE\u0017eZO\u001c.'<\u0006A%\u008ek\u001aqپ:b\tԖ5dL\u0019jg˶eZl%y#\u0015\u0005ۆD˴\nM\u000e\u0011p*M>eޑ+<{)JUǮz8r@\t\u0003ʃL]-\f\u0018l\nH¸oٷc'vRjУ=/[,đ\u0012\u0010®\u001cFe\u0002ţ(>ŅT4\u000bxԟSx\u0013o3\u001aG;Ҽ~ڳhLkޗTKrÏe]\u0017;TJЋ\bn\f\u0019`\u001eخkD)LG\u0019\"W\u0382Wڼ\u001b$?D\u00051\u007f6@ɘ`0^}(M͖\u0005\u001cw2\u0015#ى\\K8#nZ\u0014kѦJܯv\u0012t϶e3\nΡ.@_zC\"ޢY5\t9'8ė\u000b\u0015\u0007Bm\u0002[(΅+ʒh\u000f+\u001e(Oo<M̫\u0012\u0011$\\\u000b8âW\t{)y3ԃz\u001e\u001f@KRҡxͭw\f;ݞ\nS:ߏ\u001d7\u0558h\u0018$\u0013ܘ\u0011\u0012զIsgwύ\u0010u5]z\u0017Zj֊@0\u001aXmΆ\f\u001a?\u0005NГI@5s\u0015\u001dպ\u0017bm~{5\n\u0014ץ.#\u000bdٵyӇwfeØ\u0005^KϦ\\\u0017GC. \u001f\"ɜyȽ/U\u0016ɨ.=Uٚl\u0004t]W\u001cߴ\u0006}\u001f\u0002+\u0002ԾZZ\u0017&k9Ԝwϳ\u007fU\u000b̝\u0003N4߲YtS\ryVݲ\u000fK|]/\u0013٨rA#n\t6ηsճ?\u0017xƸOTKڿ\nRuHc8Ӥ\u0011\u001d/)\u0002\u001cܣ\u0001\u001dK\u0013}l˞QߡDY\u001d֛\u001cjiÉ!u-\f+5ޫv$\u001dm\u001dC݂\f\fRt4\u0016u_Դ/Ǣ+|Wȫ\n38К\\h9O^\u000eΉItg!*OؤkFx\rqEVk΄6Հ&+Kȸ1j\u000bܒkIv\tVjҴ\u001d|v,I>ܪ\u00059\u0015W\u001eDqzӦ\fޛ_GWv\u000fζG+\u0010 ď-\u0016ĕ\u0004\u0006P\u000bŋ\tO\u0602>طtǢ*"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`\u000f", "", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "0qPGX\fQb&z\t", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "uKP;W9HW\u0018H\u0005luY\u00198d\u0007(Q'| \u0016Ty\u0012;@/C#Z0@l\u001d.#*7t3+\u001fl`\u0003\u0005m5]v0V\u0016,6earP#gA\fX3V\u0002f=9n\u000e5)\u0011-M\u0004Ku|\u001b\u001a\u0018>4MOR%GW\u001f~B-jVf[\tKKNM7n\u001dc\u001c\\G\u0010g\u0005", "/bR2a;\u001c] \t\b", "", "5dc\u000eV*>\\(\\\u0005e6\n", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u000eV*>\\(\\\u0005e6\n", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "/bc6b5\u001bc(\u000e\u0005g:", "", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wba;R\u00010$\\];f[H", "5dc\u000eV;B]\"[\u000bm;\u0007\u0012=", "u(;7T=:\u001d)\u000e~euc\r=tU", "/bc6b5\u001bc(\u000e\u0005g:`\u0012>e\r1wG", "", "0hV\u0016`(@S\t\f\u0002", "", "5dc\u000f\\.\"[\u0015\u0001zN9\u0004", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000f\\.\"[\u0015\u0001zN9\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0hV h4FO&\u0013i^?\f", "5dc\u000f\\.,c!\u0007vk@k\tBt", "Adc\u000f\\.,c!\u0007vk@k\tBt", "0hV!\\;ES\b~\u000em", "5dc\u000f\\.-W(\u0006zM,\u0010\u0018", "Adc\u000f\\.-W(\u0006zM,\u0010\u0018", "5dc\u000fe(SSx\u0012\nk(\u000b", "u(;.a+K]\u001d}Dh:Fe?n~/{\u0016", "Adc\u000fe(SSx\u0012\nk(\u000b", "uKP;W9HW\u0018H\u0005luY\u00198d\u0007(Q\u0004q", "1`\\=T0@\\|}", "5dc\u0010T4IO\u001d\u0001\u0004B+;\u00058n\n7wO\u0005! U", "u(E", "5dc\u0010T4IO\u001d\u0001\u0004B+", "Adc\u0010T4IO\u001d\u0001\u0004B+", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138P\r2\rD\u007f\u0017$", "u(;0b4\bP&z\u0010^uz\u00138f\u0004*\fM|&\u001bQxW\u0019\u0004!JY[*@n\u001a0]P7z8(\u001eSnC\u0018g+N\u0004|", "Adc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138P\r2\rD\u007f\u0017$", "uKR<`u;`\u0015\u0014z(*\u0007\u00120i\u00028\t<\u0010\u001b!P9jIr:57\b)8q\u0018>Z?Jo>'\u007fukJ\u000bb,[Lj8", "1n]AX5M1\u0015\fyL@\u0006\u0007\u000ea\u000f$", "5dc\u0010b5MS\"\u000eXZ9{vCn}\u0007wO|", "Adc\u0010b5MS\"\u000eXZ9{vCn}\u0007wO|", "1n]AX5M1\u0015\fyL@\u0006\u0007\u001fs\u007f5_?", "5dc\u0010b5MS\"\u000eXZ9{vCn}\u0018\n@\u000ez\u0016", "Adc\u0010b5MS\"\u000eXZ9{vCn}\u0018\n@\u000ez\u0016", "1n]AX5MB\u0019\u0012\n", "5dc\u0010b5MS\"\u000ei^?\f", "Adc\u0010b5MS\"\u000ei^?\f", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "Adc\u0010b5MS,\u000e", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "1n]CX9LO(\u0003\u0005g\u0014|\u0017=a\u0002(\n", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wdm5_v4UH]0f[Z=\" V\u0010N\u0001", "5dc\u0010b5OS&\rvm0\u0007\u0012\u0017e\u000e6wB\u0001%", "1n]CX9LO(\u0003\u0005g\u0014|\u0017=a\u0002(\n$\n&\u0017Tx\nC", "1n]CX9LO(\u0003\u0005g\u0017|\u0016=o\t\u0010wK", "", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wdm5_v4UH]0f[]=! d\u0017$", "5dc\u0010b5OS&\rvm0\u0007\u0012\u001ae\r6\u0006Ih\u0013\"", "u(;7T=:\u001d)\u000e~eud\u0005:;", "1n]CX9LO(\u0003\u0005g\u0017|\u0016=o\t\u0010wKd &G|\u00178}", "", "\nrTA \u0006\u0017", "1n]CX9LO(\u0003\u0005g\u0019|\u00146yj(\tN\u000b zF", "5dc\u0010b5OS&\rvm0\u0007\u0012\u001ce\u000b/\u0010+\u0001$%Qxq;", "1n]CX9LO(\u0003\u0005g\u001a\u007f\u0013<t}8\u000b$\u007f", "5dc\u0010b5OS&\rvm0\u0007\u0012\u001dh\n5\u000b>\u0011&zF", "Adc\u0010b5OS&\rvm0\u0007\u0012\u001dh\n5\u000b>\u0011&zF", "1tbAb4'](\u0003{b*x\u00183o\t\fz", "5dc\u0010h:M]!g\u0005m0}\r-a\u000f,\u0006Id\u0016", "Adc\u0010h:M]!g\u0005m0}\r-a\u000f,\u0006Id\u0016", "2dT=_0GY", "5dc\u0011X,IZ\u001d\b\u0001", "Adc\u0011X,IZ\u001d\b\u0001", "3wc?T:", "5dc\u0012k;KO'", "Adc\u0012k;KO'", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "4kd@[\u0014:f\u0001\u0003\u0004n;|\u0017", "", "5dc\u0013_<LV\u0001z\u000eF0\u0006\u0019>e\u000efwI\n!&C~\u0012F\u007f3", "5dc\u0013_<LV\u0001z\u000eF0\u0006\u0019>e\u000e", "u(9", "Adc\u0013_<LV\u0001z\u000eF0\u0006\u0019>e\u000e", "uI\u0018#", "4kd@[\u0014B\\\u0001\u0003\u0004n;|\u0017", "5dc\u0013_<LV\u0001\u0003\u0004F0\u0006\u0019>e\u000efwI\n!&C~\u0012F\u007f3", "5dc\u0013_<LV\u0001\u0003\u0004F0\u0006\u0019>e\u000e", "Adc\u0013_<LV\u0001\u0003\u0004F0\u0006\u0019>e\u000e", "7r2<a=>`'z\nb6\u0006\u00056P\u00106~", "", "u(I", "Adc\u0010b5OS&\rvm0\u0007\u0012+lj8\nC", "uY\u0018#", "7r8;_0GS|\u0007v`,g\u0019=h", "Adc\u0016a3B\\\u0019b\u0003Z.|s?s\u0003", "7r=2j3R@\u0019|zb=|\b\u001au\u000e+iO\u000b$+", "Adc\u001bX>Eg\u0006~x^0\u000e\t.P\u00106~.\u0010!$[", "7r?Bf/\u001dS \u0003\f^9\u0011h8a|/{?", "7r?Bf/\u001dS \u0003\f^9\u0011h8a|/{??\u0013 Py\u001d8\u0006)?b\f", "Adc\u001dh:A2\u0019\u0006~o,\n\u001d\u000fn{%\u0003@\u007f", "7r?Bf/,b#\f\u000f", "Adc\u001dh:AA(\t\br", "7rD;\\5Lb\u0015\u0006\u0002M9x\u00075i\t*fP\u000f\u001a", "Adc\"a0Ga(z\u0002e\u001b\n\u0005-k\u00041}+\u0011%\u001a", ":`a4X\u0010<]\"", "5dc\u0019T9@S||\u0005g", "Adc\u0019T9@S||\u0005g", "<nc6Y0<O(\u0003\u0005g\tx\b1eh8\u0004=\u0001$", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\fa~*{)\u0011\u001f\u0014G|", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\fa~*{)\u0011\u001f\u0014G|", "<nc6Y0<O(\u0003\u0005g\nx\u0018/g\n5\u0010", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\ra\u000f(}J\u000e+", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\ra\u000f(}J\u000e+", "<nc6Y0<O(\u0003\u0005g\n\u007f\u00058n\u007f/_?", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\rh{1\u0005@\bz\u0016", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\rh{1\u0005@\bz\u0016", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u000fx\u000f5wN", "<nc6Y0<O(\u0003\u0005g\u0017\n\r9r\u00047\u0010$\n&", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001ar\u00042\tD\u0010+zP~", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\u001ar\u00042\tD\u0010+zP~", "<nc6Y0<O(\u0003\u0005g\u0019|\u0007/i\u0011(z/\u0005\u001f\u0017U~\nD\u0002\r9`\u0005$E", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001ce}(\u007fQ\u0001\u0016\u0006Kw\u000eJ\u0006!=de$>t\u001a<", "u(;7T=:\u001d z\u0004`uc\u00138gU", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\u001ce}(\u007fQ\u0001\u0016\u0006Kw\u000eJ\u0006!=de$>t\u001a<", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;C\u0019", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "<nc6Y0<O(\u0003\u0005g\u001a\u0007\u00198d", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001do\u00101z", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\u001do\u00101z", "<nc6Y0<O(\u0003\u0005g\u001d\u0001\u00173b\u0004/\u007fO\u0015", "5dc\u001bb;BT\u001d|vm0\u0007\u0012 i\u000e,xD\b\u001b&[", "Adc\u001bb;BT\u001d|vm0\u0007\u0012 i\u000e,xD\b\u001b&[", ">tQ9\\*'](\u0003{b*x\u00183o\t\b\u000fO\u000e\u0013%", "5dc\u001dh)EW\u0017g\u0005m0}\r-a\u000f,\u0006I`*&Tk\u001c", "Adc\u001dh)EW\u0017g\u0005m0}\r-a\u000f,\u0006I`*&Tk\u001c", ">tb57<KO(\u0003\u0005g", "5dc\u001dh:A2)\fvm0\u0007\u0012", "Adc\u001dh:A2)\fvm0\u0007\u0012", ">tb5F;H`-iv`,`\u0012.e\u0013", "5dc\u001dh:AA(\t\br\u0017x\u000b/I\t'{S", "u(8", "Adc\u001dh:AA(\t\br\u0017x\u000b/I\t'{S", "uH\u0018#", ">tb5F;H`-iv`,\u000b", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wqs:Qd6QYb\u0017XTr\u0013", "5dc\u001dh:AA(\t\br\u0017x\u000b/s", ">tb5F;H`-iv`,\u000bl8t\u007f5\u0005<\b", ">tb5H5B_)~^]", "5dc\u001dh:AC\"\u0003\u0007n,`\b", "Adc\u001dh:AC\"\u0003\u0007n,`\b", "Ag^B_+\u001fS(|}M,\u000b\u0018\u001er\u0004*}@\u000e%", "5dc [6NZ\u0018_zm*\u007fw/s\u000f\u0017\tD\u0003\u0019\u0017T}", "Adc [6NZ\u0018_zm*\u007fw/s\u000f\u0017\tD\u0003\u0019\u0017T}", "Ag^B_++S\u001a\fzl/]\t+t\u00105{!\b\u0013\u0019U", "5dc [6NZ\u0018kz_9|\u00172F\u007f$\u000bP\u000e\u0017wNk\u0010J", "Adc [6NZ\u0018kz_9|\u00172F\u007f$\u000bP\u000e\u0017wNk\u0010J", "Ag^B_+,g\"|\\^6}\t8c\u007f6", "5dc [6NZ\u0018l\u000fg*^\t9f\u007f1y@\u000f", "Adc [6NZ\u0018l\u000fg*^\t9f\u007f1y@\u000f", "At\\:T9RB\u0019\u0012\n", "5dc h4FO&\u0013i^?\f", "Adc h4FO&\u0013i^?\f", "Bhc9X\u001b>f(", "5dc!\\;ES\b~\u000em", "Adc!\\;ES\b~\u000em", "CrT$X)/W\u0019\u0011", "5dc\"f,0S\u0016o~^>", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adc\"f,0S\u0016o~^>", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", ">`a@X\u0017:g \tv]\r\u0001\t6d\u000e\t\tJ\ts'Pn\u0015<", "", "Adc\u000eV;B]\"[\u000bm;\u0007\u0012=", "Adc\u0016f\u0010GZ\u001d\bzB4x\u000b/P\u00106~", "Adc\u001dh:AA(\t\br\u0017x\u000b/s", "BnBAe0GU", "\u000fbc6b5\u001bc(\u000e\u0005g", "\u0011n\\=T5B]\"", "\u0011n]CX9LO(\u0003\u0005g\u0014|\u0017=a\u0002(", "\u0011n]CX9LO(\u0003\u0005g\u0017|\u0016=o\t", "\u001etb5F;H`-iv`,", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeNotificationPayload {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_PUSH_DELIVERY_MAX_FLUSH = 120;
    public static final long DEFAULT_PUSH_DELIVERY_MIN_FLUSH = 5;
    private Integer accentColor;
    private List<ActionButton> actionButtonsInternal;
    private String bigImageUrl;
    private String bigSummaryText;
    private String bigTitleText;
    private Bundle brazeExtras;
    private String campaignId;
    private BrazeConfigurationProvider configurationProvider;
    private String contentCardSyncData;
    private String contentCardSyncUserId;
    private String contentText;
    private Context context;
    private final List<ConversationMessage> conversationMessagesInternal;
    private final Map<String, ConversationPerson> conversationPersonMapInternal;
    private String conversationReplyPersonId;
    private String conversationShortcutId;
    private Integer customNotificationId;
    private String deeplink;
    private Map<String, String> extras;
    private long flushMaxMinutes;
    private long flushMinMinutes;
    private boolean isConversationalPush;
    private boolean isInlineImagePush;
    private boolean isNewlyReceivedPushStory;
    private boolean isPushDeliveryEnabled;
    private boolean isPushStory;
    private boolean isUninstallTrackingPush;
    private String largeIcon;
    private Integer notificationBadgeNumber;
    private String notificationCategory;
    private String notificationChannelId;
    private final Bundle notificationExtras;
    private Integer notificationPriorityInt;
    private Long notificationReceivedTimestampMillis;
    private String notificationSound;
    private Integer notificationVisibility;
    private String publicNotificationExtras;
    private Integer pushDuration;
    private int pushStoryPageIndex;
    private List<PushStoryPage> pushStoryPagesInternal;
    private String pushUniqueId;
    private boolean shouldFetchTestTriggers;
    private boolean shouldRefreshFeatureFlags;
    private boolean shouldSyncGeofences;
    private String summaryText;
    private String titleText;
    private Boolean useWebView;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u0007njG<LeNAZS8\u000fs{:%a)\bّkUH|b\u001c_Rug\u0007J\t\fS\u0013\u0014\u0018\u0011jZLǤ|] \u0013zN}ZKM\u001eYid\u0003S\u001d `#\u0001\u007f\u0013\u001f2*v\u0016=\u000f\u0014e\u001a\u0017HB\u00079\u0001\u0013$į&Ū\nJ(ҵ6^mUDP\r_@81\r:Z\\)w0+PcІ`ܮ\u0011\u0003iӜCB=@#1s\u0005\r_iMSY\u007fL\u001dj=&YOJɕBݼ\u0004 \u001dۀg\u000fc\u00034d%Sf\u001d55 }Yb&*\u000ey*\u0013\u0013ǐ\u001aΝ+T6Ʀ2h\u000e!A|\u0013UFd\u0010h\u0013\u001a\tvN\u0019;~a1\u0010ӜrЂeG!\u05cbO}\u000b#,+!p'rb\u00181/)l\u0010SGPnC\u001fݗ\u0016ՒAy\f͏z\u00040\u001d>O 1\u0002+<!Ï;z"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wba;R\u00010$\\];f[H", "", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "/bc6b5\"\\\u0018~\u000e", "", "uKP;W9HW\u0018H\u0005luY\u00198d\u0007(Q$D\b", "/bc6b5\"R", "", "5dc\u000eV;B]\"by", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000eV;B]\"by", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u000eV;B]\"b\u0004],\u0010", "u(8", "Adc\u000eV;B]\"b\u0004],\u0010", "uH\u0018#", "BdgA", "5dc!X?M", "Adc!X?M", "Bx_2", "5dc!l7>", "Adc!l7>", "CqX", "5dc\"e0", "Adc\"e0", "CrT$X)OW\u0019\u0011", "5dc\"f,0S\u0016\u0010~^>", "Adc\"f,0S\u0016\u0010~^>", ">tc\u0016a;H0)\bye,", "", "2dbA\\5:b\u001d\t\u0004", "BnBAe0GU", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ActionButton {
        private String actionId;
        private int actionIndex;
        private String text;
        private String type;
        private String uri;
        private String useWebview;

        public ActionButton(Bundle notificationExtras, int i2) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            this.actionIndex = i2;
            Companion companion = BrazeNotificationPayload.Companion;
            this.type = companion.getTemplateFieldAtIndex(i2, notificationExtras, Constants.BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            this.actionId = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_ACTION_ID_KEY_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_ACTION_URI_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE);
            this.text = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_ACTION_TEXT_KEY_TEMPLATE);
        }

        public final String getActionId() {
            return this.actionId;
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUri() {
            return this.uri;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void putIntoBundle(Bundle destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            destination.putInt(Constants.BRAZE_ACTION_INDEX_KEY, this.actionIndex);
            destination.putString(Constants.BRAZE_ACTION_TYPE_KEY, this.type);
            destination.putString(Constants.BRAZE_ACTION_ID_KEY, this.actionId);
            destination.putString(Constants.BRAZE_ACTION_URI_KEY, this.uri);
            destination.putString(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY, this.useWebview);
        }

        public final void setActionId(String str) {
            this.actionId = str;
        }

        public final void setActionIndex(int i2) {
            this.actionIndex = i2;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public final void setUri(String str) {
            this.uri = str;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            return sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex))).append(companion.stringAndKey("Type", this.type)).append(companion.stringAndKey("Id", this.actionId)).append(companion.stringAndKey("Uri", this.uri)).append(companion.stringAndKey("UseWebview", this.useWebview)).append(companion.stringAndKey("Text", this.text)).toString();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005$4\u0012\u000e\u0007nj?0LeV4ZS0\u000fs{B0c$wCCU(\u0007*\tU]m˯o`ҙ;C=\u0005V}p,֒Yxk\u0012WBPuW3{vm?n|N\u000761P?@\nI88Q(v)M{\u0010 ;Xph\\=Q\u0013\"*\u0006l'1\"jsf6vy$?wC\u0011wZP=^^\n}\u0011Tc?\r%kN/N?M\u0015SZ3\u000b`gW\u0003m~\u0004\n1M59as\u0006F\t\u0004\" CO;g#*j\ri`:.[SqWh\u000eV\u0005+\u007f\u001bM\u001c\u000e47\u000f3u@t\u0016&3#t\u0004D^\rvB.\u0005\u0012:%-\u00183Y@Kj_mS\u0019|D,\t\u001b/;\u0001\u001d#\"YV\u000b#)lyg0\u007fMmL\\\u0019q=\u001c\u000e!f\u00102\u001c0u\u0007_\u007f\u001f:/%ehi)/|\u001aJZf%\u0012'm\u001c\u0007`ZX$\u0005\u0015e,9\u0010hW|\u0005\u001aW\u0005\\:%e\u001c\u0003\u0014D\r˙$\\\u0006Qi=\u001edgj\u007fi{j:)=yOY\u001dr>[GrK5\u007fpVf\u001b\u0015\"VTb3b\u0017Fa\u001fr\\V)bLx$\u0010{r[<\u0017@P\n\u001cb6w\u001e%-V\u001b6DW{7l\u000bl\u001e\u0012l3R\n\u001a(\u0003\u001d\u0019P\u000b}6lA_:\u0016x\"[Q\u00029'9m\"\u0017;-'\u0015\u0013\f\u007fut\u0013L\u0015\n$\u0010m}6\u0015HC\u00023K&'~W921S`\u000be\u007fZX,ϸ\u0001y\u001dV1Ku$\u0003rB_\u0019T\u007fX%5\u000f^!*8h\u000e\u000eyF)T*Yߏ_>W\u000eKvJkP~\u001b\u001eL'1s0\u0010M-q.M\u001a\u0006(G\u0015\u0010j0tЦ}b\u001d;=}\u0012J{\u0016\u001eo\u0002a@ZPI\b\fn(2\r\u001bD^i&\u0007\t\t\u0005!AIYd\u001fXnԇaɂP֨\u000b2\u0015ߞf]@\u0016}}\u0005Bm.\fC,\u0016\u0015ƹ{ݐ Ϭksuжl\rP\u0014\u0018\u000bֳ5\u0010"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wdm4Yr0KVW\u0002", "", "u(E", "\u0012D5\u000eH\u0013-M\u0004nhA&[h\u0016Ip\bh4z~r:in#f\u0013\u0018", "", "5dc\u00118\r\u001aC\u007fmtI\u001cjk)D_\u000f_1`\u0004\u000bAWi/p\u0006\u001cIk\u0003ui\u001f-ZM?j.,\u0014n[6\u0003q,H\u0004'NLJ:\\\u0011nF\u001d\u001ci\n]/\u0017\u000eg", "\u0012D5\u000eH\u0013-M\u0004nhA&[h\u0016Ip\bh4z~z0in#f\u0013\u0018", "5dc\u00118\r\u001aC\u007fmtI\u001cjk)D_\u000f_1`\u0004\u000bAWq%p\u0006\u001cIk\u0003ui\u001f-ZM?j.,\u0014n[6\u0003q,H\u0004'NLJ:\\\u0011nF\u001d\u001ci\n]/\u0017\u000eg", "5dc\u000eg;:Q\u001c~y;9x\u001e/E\u00137\t<\u000f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "5dc\u001dh:AA(\t\br\u000e\n\u0005@i\u000f<WOd \u0016G\u0003", "", "/bc6b5\"\\\u0018~\u000e", "/bc6b5\u001fW\u0019\u0006yD,\u0011w/m\u000b/wO\u0001", "", "5dc!X4IZ\u0015\u000ez?0|\u0010.A\u000f\f\u0005?\u0001*", "7mS2k", "", "2dU.h3MD\u0015\u0006\u000b^", ">`a@X\u0013H\\\u001b", "0t]1_,", "9dh", "uKP;W9HW\u0018H\u0005luY\u00198d\u0007(Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u0011*@gE\u001a^o]B\t-\u0013X\u007f)\u001d", ">`a@X\u0015H\\u\u0006vg2j\u0018<i\t*", ">`a@X\u0016;X\u0019|\n::`\u0012>e\u0002(\t", ">`a@X\u001aM`\u001d\b|", ">`a@X\u001aM`\u001d\b|::Y\u00139l\u007f$\u0005", ">`a@X\u001aM`\u001d\b|::Z\u00136o\r\f\u0005O", "uKP;W9HW\u0018H\u0005luY\u00198d\u0007(Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u0011*@gE\u001a^o]B\t-\u0010W\u0006'IL[\u0002", ">`a@X\u001aM`\u001d\b|::`\u0012>e\u0002(\t", ">`a@X\u001aM`\u001d\b|::c\u00138g", "Asa6a.\u001a\\\u0018dzr", ">qT3\\?", "D`[BX", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDEFAULT_PUSH_DELIVERY_MAX_FLUSH$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getDEFAULT_PUSH_DELIVERY_MIN_FLUSH$android_sdk_base_release$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String stringAndKey(String str, Object obj) {
            return obj != null ? "\n" + str + " = " + obj : "";
        }

        @JvmStatic
        public final Bundle getAttachedBrazeExtras(Bundle bundle) {
            if (bundle == null) {
                return new Bundle();
            }
            if (bundle.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED) && !bundle.getBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                Bundle bundle2 = bundle.getBundle("extra");
                return bundle2 == null ? new Bundle() : bundle2;
            }
            if (Constants.isAmazonDevice()) {
                return new Bundle(bundle);
            }
            Object obj = bundle.get("extra");
            return obj instanceof String ? JsonUtils.parseJsonObjectIntoBundle((String) obj) : obj instanceof Bundle ? (Bundle) obj : new Bundle();
        }

        @JvmStatic
        public final int getPushStoryGravityAtIndex(int i2, Bundle notificationExtras, String actionFieldKeyTemplate) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(StringsKt.replace$default(actionFieldKeyTemplate, ProxyConfig.MATCH_ALL_SCHEMES, String.valueOf(i2), false, 4, (Object) null));
            if (string != null && !StringsKt.isBlank(string)) {
                int iHashCode = string.hashCode();
                if (iHashCode == -1364013995) {
                    string.equals("center");
                } else if (iHashCode != 100571) {
                    if (iHashCode == 109757538 && string.equals(ViewProps.START)) {
                        return GravityCompat.START;
                    }
                } else if (string.equals(ViewProps.END)) {
                    return GravityCompat.END;
                }
            }
            return 17;
        }

        @JvmStatic
        public final long getTemplateFieldAtIndex(int i2, Bundle notificationExtras, String actionFieldKeyTemplate, long j2) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(StringsKt.replace$default(actionFieldKeyTemplate, ProxyConfig.MATCH_ALL_SCHEMES, String.valueOf(i2), false, 4, (Object) null));
            if (string == null) {
                return j2;
            }
            try {
                j2 = Long.parseLong(string);
                return j2;
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) b.f2676a, 4, (Object) null);
                return j2;
            }
        }

        @JvmStatic
        public final String getTemplateFieldAtIndex(int i2, Bundle notificationExtras, String actionFieldKeyTemplate) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            return getTemplateFieldAtIndex(i2, notificationExtras, actionFieldKeyTemplate, "");
        }

        @JvmStatic
        public final String getTemplateFieldAtIndex(int i2, Bundle notificationExtras, String actionFieldKeyTemplate, String str) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(StringsKt.replace$default(actionFieldKeyTemplate, ProxyConfig.MATCH_ALL_SCHEMES, String.valueOf(i2), false, 4, (Object) null));
            return string == null ? str : string;
        }

        @JvmStatic
        public final boolean getTemplateFieldAtIndex(int i2, Bundle notificationExtras, String actionFieldKeyTemplate, boolean z2) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            String string = notificationExtras.getString(StringsKt.replace$default(actionFieldKeyTemplate, ProxyConfig.MATCH_ALL_SCHEMES, String.valueOf(i2), false, 4, (Object) null));
            if (string == null) {
                return z2;
            }
            try {
                z2 = Boolean.parseBoolean(string);
                return z2;
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) a.f2675a, 4, (Object) null);
                return z2;
            }
        }

        @JvmStatic
        public final Long parseLong(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key)) {
                    return Long.valueOf(bundle.getLong(key));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c(bundle, key), 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final String parseNonBlankString(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                String string = parseString(bundle, key);
                if (string == null) {
                    return null;
                }
                if (StringsKt.isBlank(string)) {
                    return null;
                }
                return string;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(bundle, key), 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final int parseObjectAsInteger(Bundle bundle, String key, int i2) {
            Object obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key) && (obj = bundle.get(key)) != null) {
                    return Integer.parseInt(obj.toString());
                }
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(bundle, key), 7, (Object) null);
            }
            return i2;
        }

        @JvmStatic
        public final String parseString(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key)) {
                    return bundle.getString(key);
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f(bundle, key), 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final boolean parseStringAsBoolean(Bundle bundle, String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return false;
                }
                return Boolean.parseBoolean(string);
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g(bundle, key), 7, (Object) null);
                return false;
            }
        }

        @JvmStatic
        public final Integer parseStringAsColorInt(Bundle bundle, String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Integer.valueOf((int) Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h(bundle, key), 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final Integer parseStringAsInteger(Bundle bundle, String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i(bundle, key), 7, (Object) null);
                return null;
            }
        }

        @JvmStatic
        public final Long parseStringAsLong(Bundle bundle, String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (!bundle.containsKey(key) || (string = bundle.getString(key)) == null) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(string));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j(bundle, key), 7, (Object) null);
                return null;
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u0007njG<LeN1ZS8\u0016s{:&a)\bّkUH|b\u001c_Rug\u0007J\t\fS\u0013\u0014\u0018\u0011jZLǤ|] \u0013zH}NKM\u001eC\u007ftEG\u0013%J$Nx3\u0007ʀ.N\u0018͌\u0013EQ\u0013 8\u0011\u0002H[%O\u001b\u0019@\f̧$\u0007&ձ\u007fP<Rze\u000b>1\u000e\u0002B|3ۢ4\u0003Uε^V-\u001a\u0005oԅ/P"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wdm5_v4UH]0f[Z=\" V\u0010N\u0001", "", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "7mS2k", "", "uKP;W9HW\u0018H\u0005luY\u00198d\u0007(Q$D\b", ";db@T.>", "", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ">da@b5\"R", "5dc\u001dX9L]\"by", "Bh\\2f;:[$", "", "5dc!\\4>a(z\u0003i", "u(9", "BnBAe0GU", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ConversationMessage {
        private final String message;
        private final String personId;
        private final long timestamp;

        public ConversationMessage(Bundle notificationExtras, int i2) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.message = companion.getTemplateFieldAtIndex(i2, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            this.timestamp = companion.getTemplateFieldAtIndex(i2, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE, 0L);
            this.personId = companion.getTemplateFieldAtIndex(i2, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            return sb.append(companion.stringAndKey("Message", this.message)).append(companion.stringAndKey("Timestamp", Long.valueOf(this.timestamp))).append(companion.stringAndKey("PersonId", this.personId)).toString();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u0007njG9LeN/ZS8\u001bs{:%c$\bCCU \u0004(\u000eeȞ\u0018g\u001dI\u001b\u001eS\u0013\u0014\u0016\u0011jZJe|k\u0014'2prУ7M}A\u0002f\u0003K\u001d `,~\u000eU\u0010(/`\u0010%\u0001ŲO\u0012\u001aؓXr@W\u001bTU) \u000eV /$֔kT>ԟ\u0005_@71\n:S\\0w2\u0013L;Pù+\u0013~ѭ6-FBC!ub\u0011\u0014j[m\u0011u6ݘ\tl?)1X\u0002g\u0007i\u000e%--e\f\f|͉`\u000bYӠ$)1aqW!\u001f6\u000b\u0013}#;2\u0018Ν+N6Ʀ2h\u000e\"A\u0001ɪWV"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wdm5_v4UH]0f[]=! d\u0017$", "", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "7mS2k", "", "uKP;W9HW\u0018H\u0005luY\u00198d\u0007(Q$D\b", "7r1<g", "", "u(I", "7r8:c6Kb\u0015\b\n", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ">da@b5", "\u001a`]1e6BR,Hxh9|R+p\u000bqf@\u000e%!PE", "5dc\u001dX9L]\"", "u(;.a+K]\u001d}\u000e(*\u0007\u0016//{3\u0007\nk\u0017$Uy\u0017\u0012", ">da@b5\"R", "5dc\u001dX9L]\"by", "CqX", "5dc\"e0", "BnBAe0GU", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ConversationPerson {
        private final boolean isBot;
        private final boolean isImportant;
        private final String name;
        private final String personId;
        private final String uri;

        public ConversationPerson(Bundle notificationExtras, int i2) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.personId = companion.getTemplateFieldAtIndex(i2, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            this.name = companion.getTemplateFieldAtIndex(i2, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(i2, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE, (String) null);
            this.isImportant = companion.getTemplateFieldAtIndex(i2, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE, false);
            this.isBot = companion.getTemplateFieldAtIndex(i2, notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE, false);
        }

        public final String getName() {
            return this.name;
        }

        public final Person getPerson() {
            Person personBuild = new Person.Builder().setKey(this.personId).setName(this.name).setUri(this.uri).setBot(this.isBot).setImportant(this.isImportant).build();
            Intrinsics.checkNotNullExpressionValue(personBuild, "Builder()\n              …\n                .build()");
            return personBuild;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final String getUri() {
            return this.uri;
        }

        public final boolean isBot() {
            return this.isBot;
        }

        public final boolean isImportant() {
            return this.isImportant;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            return sb.append(companion.stringAndKey("PersonId", this.personId)).append(companion.stringAndKey(ModuleNames.NAME, this.name)).append(companion.stringAndKey("Uri", this.uri)).append(companion.stringAndKey("IsImportant", Boolean.valueOf(this.isImportant))).append(companion.stringAndKey("IsBot", Boolean.valueOf(this.isBot))).toString();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u000bnjG<LeNIXX@ş\u001c{b#\u001c7\u0002GIU2}P\n_Rui\u0007J\t\u000eß\u0013\u0006$|32W{\u0011]@\u0019xV@WAO\b=gcKȉ\u0011ڶ6.@ц\u001d\u0003 /V\u0016\u0017|IR\u001a\u001a\u0001Z~Cj\u000fc\u0004H\u001c\\̋,Ә\"hoޮNJrhH;C\u0005oO\\50A\u000b\\%Hj&;\u0001Ґ\"1HʺM\u0017+c\u0011\u0013#uM\u0014WsS\u0004\u00171}ǩUָ[B`Ü,\u00171a\u001bi\u0013(b\u0018_n\\A9c{Mf\rV\u0002Qԏ\u0019ʀ\b\u001a\u000eΩ`03/t\u0014.5z\taN!\u001clY\u0018|w5E/VĘ7ݰ\u001frYĥS\u001bTO\n\u0011- )\u001a|/,l\u001cz-\u001b\u0003z(Ŀ]͘ATVˣq?s\u001f~h\",\nLU\b\u007f\u0016\u001fK/'MZg-wȄ\u000eҩHs~ݓxjY\b`T`$t5E8Y$hd|\u0005\u001aS+З8ҭQ(\\͵\u0016\n\u0019Aj}\\#+2\\W9\u0004xpu\f;.\u0015A0ʫwް[EfڨMSi4o^\u0017\u0016Eap\u0013׃ji"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wqs:Qd6QYb\u0017XTr\u0013", "", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "/bc6b5\"\\\u0018~\u000e", "", "uKP;W9HW\u0018H\u0005luY\u00198d\u0007(Q$D\b", "5dc\u000eV;B]\"b\u0004],\u0010", "u(8", "Adc\u000eV;B]\"b\u0004],\u0010", "uH\u0018#", "0hc:T7.` ", "", "5dc\u000f\\;FO$n\be", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000f\\;FO$n\be", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1`\\=T0@\\|}", "5dc\u0010T4IO\u001d\u0001\u0004B+", "2dT=_0GY", "5dc\u0011X,IZ\u001d\b\u0001", "Adc\u0011X,IZ\u001d\b\u0001", "As^?l\u0017:U\u0019by", "5dc g6Kg\u0004z|^\u0010{", "Adc g6Kg\u0004z|^\u0010{", "AtQA\\;ES", "5dc h)MW(\u0006z", "Adc h)MW(\u0006z", "AtQA\\;ESz\fvo0\f\u001d", "5dc h)MW(\u0006z@9x\u001a3t\u0014", "Adc h)MW(\u0006z@9x\u001a3t\u0014", "Bhc9X", "5dc!\\;ES", "Adc!\\;ES", "Bhc9X\u000eKO*\u0003\nr", "5dc!\\;ESz\fvo0\f\u001d", "Adc!\\;ESz\fvo0\f\u001d", "CrT$X)OW\u0019\u0011", "5dc\"f,0S\u0016\u0010~^>", "Adc\"f,0S\u0016\u0010~^>", "BnBAe0GU", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PushStoryPage {
        private int actionIndex;
        private String bitmapUrl;
        private final String campaignId;
        private String deeplink;
        private String storyPageId;
        private String subtitle;
        private int subtitleGravity;
        private String title;
        private int titleGravity;
        private String useWebview;

        public PushStoryPage(Bundle notificationExtras, int i2) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            this.actionIndex = i2;
            Companion companion = BrazeNotificationPayload.Companion;
            this.campaignId = companion.parseString(notificationExtras, "cid");
            this.title = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_TITLE_KEY_TEMPLATE);
            this.titleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.subtitle = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_SUBTITLE_KEY_TEMPLATE);
            this.subtitleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.bitmapUrl = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            this.storyPageId = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_ID_KEY_TEMPLATE, "");
            this.deeplink = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, Constants.BRAZE_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE);
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getBitmapUrl() {
            return this.bitmapUrl;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getStoryPageId() {
            return this.storyPageId;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getSubtitleGravity() {
            return this.subtitleGravity;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTitleGravity() {
            return this.titleGravity;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void setActionIndex(int i2) {
            this.actionIndex = i2;
        }

        public final void setBitmapUrl(String str) {
            this.bitmapUrl = str;
        }

        public final void setDeeplink(String str) {
            this.deeplink = str;
        }

        public final void setStoryPageId(String str) {
            this.storyPageId = str;
        }

        public final void setSubtitle(String str) {
            this.subtitle = str;
        }

        public final void setSubtitleGravity(int i2) {
            this.subtitleGravity = i2;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setTitleGravity(int i2) {
            this.titleGravity = i2;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            return sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex))).append(companion.stringAndKey("CampaignId", this.campaignId)).append(companion.stringAndKey("Title", this.title)).append(companion.stringAndKey("TitleGravity", Integer.valueOf(this.titleGravity))).append(companion.stringAndKey("Subtitle", this.subtitle)).append(companion.stringAndKey("SubtitleGravity=", Integer.valueOf(this.subtitleGravity))).append(companion.stringAndKey("BitmapUrl", this.bitmapUrl)).append(companion.stringAndKey("StoryPageId", this.storyPageId)).append(companion.stringAndKey("Deeplink", this.deeplink)).append(companion.stringAndKey("UseWebview", this.useWebview)).toString();
        }
    }

    public BrazeNotificationPayload(Bundle bundle) {
        this(bundle, null, null, null, 14, null);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2) {
        this(bundle, bundle2, null, null, 12, null);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context) {
        this(bundle, bundle2, context, null, 8, null);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider) throws Throwable {
        Context context2;
        this.configurationProvider = brazeConfigurationProvider;
        this.notificationExtras = bundle == null ? new Bundle() : bundle;
        this.brazeExtras = bundle2 == null ? new Bundle() : bundle2;
        this.extras = BundleUtils.toStringMap(bundle2);
        if (context != null) {
            Class<?> cls = Class.forName(Qg.kd("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014", (short) (OY.Xd() ^ 1229), (short) (OY.Xd() ^ 19726)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (OY.Xd() ^ 27070);
            short sXd2 = (short) (OY.Xd() ^ 4085);
            int[] iArr = new int["\"\u001f-x'&!\u001d\u0016\u0013%\u0019\u001e\u001co\u001b\u0019\u001e\u000e \u001b".length()];
            QB qb = new QB("\"\u001f-x'&!\u001d\u0016\u0013%\u0019\u001e\u001co\u001b\u0019\u001e\u000e \u001b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                context2 = (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            context2 = null;
        }
        this.context = context2;
        this.flushMinMinutes = 5L;
        this.flushMaxMinutes = 120L;
        this.actionButtonsInternal = new ArrayList();
        this.pushStoryPagesInternal = new ArrayList();
        this.conversationMessagesInternal = new ArrayList();
        this.conversationPersonMapInternal = new HashMap();
        parsePayloadFieldsFromBundle();
    }

    public /* synthetic */ BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, (i2 + 2) - (2 | i2) != 0 ? Companion.getAttachedBrazeExtras(bundle) : bundle2, (4 & i2) != 0 ? null : context, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : brazeConfigurationProvider);
    }

    @JvmStatic
    public static final Bundle getAttachedBrazeExtras(Bundle bundle) {
        return Companion.getAttachedBrazeExtras(bundle);
    }

    public static /* synthetic */ void getCampaignId$annotations() {
    }

    public static /* synthetic */ void getFlushMaxMinutes$annotations() {
    }

    public static /* synthetic */ void getFlushMinMinutes$annotations() {
    }

    @JvmStatic
    public static final int getPushStoryGravityAtIndex(int i2, Bundle bundle, String str) {
        return Companion.getPushStoryGravityAtIndex(i2, bundle, str);
    }

    @JvmStatic
    public static final long getTemplateFieldAtIndex(int i2, Bundle bundle, String str, long j2) {
        return Companion.getTemplateFieldAtIndex(i2, bundle, str, j2);
    }

    @JvmStatic
    public static final String getTemplateFieldAtIndex(int i2, Bundle bundle, String str) {
        return Companion.getTemplateFieldAtIndex(i2, bundle, str);
    }

    @JvmStatic
    public static final String getTemplateFieldAtIndex(int i2, Bundle bundle, String str, String str2) {
        return Companion.getTemplateFieldAtIndex(i2, bundle, str, str2);
    }

    @JvmStatic
    public static final boolean getTemplateFieldAtIndex(int i2, Bundle bundle, String str, boolean z2) {
        return Companion.getTemplateFieldAtIndex(i2, bundle, str, z2);
    }

    public static /* synthetic */ void isPushDeliveryEnabled$annotations() {
    }

    @JvmStatic
    public static final Long parseLong(Bundle bundle, String str) {
        return Companion.parseLong(bundle, str);
    }

    @JvmStatic
    public static final String parseNonBlankString(Bundle bundle, String str) {
        return Companion.parseNonBlankString(bundle, str);
    }

    @JvmStatic
    public static final int parseObjectAsInteger(Bundle bundle, String str, int i2) {
        return Companion.parseObjectAsInteger(bundle, str, i2);
    }

    private final void parsePayloadFieldsFromBundle() {
        parsePayloadFieldsFromBundle$parseNotificationMetadata(this);
        parsePayloadFieldsFromBundle$parseContentCardData(this);
        parsePayloadFieldsFromBundle$parseVisibleContent(this);
        parsePayloadFieldsFromBundle$parseBigTextStyle(this);
        parsePayloadFieldsFromBundle$parseBigImageStyle(this);
        parsePayloadFieldsFromBundle$parseActionButtons(this);
        parsePayloadFieldsFromBundle$parsePushStoryData(this);
        parsePayloadFieldsFromBundle$parseConversationPushData(this);
        parsePayloadFieldsFromBundle$parsePushDeliveryEventData(this);
    }

    private static final void parsePayloadFieldsFromBundle$parseActionButtons(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.actionButtonsInternal.clear();
        int i2 = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i2, brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || StringsKt.isBlank(templateFieldAtIndex)) {
                return;
            }
            brazeNotificationPayload.actionButtonsInternal.add(new ActionButton(brazeNotificationPayload.notificationExtras, i2));
            i2++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigImageStyle(BrazeNotificationPayload brazeNotificationPayload) {
        String str;
        String nonBlankString = Companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY);
        brazeNotificationPayload.bigImageUrl = nonBlankString;
        if ((nonBlankString != null && !StringsKt.isBlank(nonBlankString)) || (str = brazeNotificationPayload.extras.get(Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY)) == null || StringsKt.isBlank(str)) {
            return;
        }
        brazeNotificationPayload.bigImageUrl = str;
    }

    private static final void parsePayloadFieldsFromBundle$parseBigTextStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.bigSummaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.bigTitleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_BIG_TITLE_TEXT_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseContentCardData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.contentCardSyncData = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_CARD_SYNC_DATA_KEY);
        brazeNotificationPayload.contentCardSyncUserId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseConversationPushData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.conversationShortcutId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY);
        brazeNotificationPayload.conversationReplyPersonId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY);
        brazeNotificationPayload.conversationMessagesInternal.clear();
        brazeNotificationPayload.conversationPersonMapInternal.clear();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i3, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            if (templateFieldAtIndex == null || StringsKt.isBlank(templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.conversationMessagesInternal.add(new ConversationMessage(brazeNotificationPayload.notificationExtras, i3));
            i3++;
        }
        while (true) {
            String templateFieldAtIndex2 = Companion.getTemplateFieldAtIndex(i2, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            if (templateFieldAtIndex2 == null || StringsKt.isBlank(templateFieldAtIndex2)) {
                return;
            }
            ConversationPerson conversationPerson = new ConversationPerson(brazeNotificationPayload.notificationExtras, i2);
            brazeNotificationPayload.conversationPersonMapInternal.put(conversationPerson.getPersonId(), conversationPerson);
            i2++;
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseNotificationMetadata(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.pushDuration = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_DURATION_KEY);
        brazeNotificationPayload.isPushStory = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_STORY_KEY);
        brazeNotificationPayload.notificationCategory = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CATEGORY_KEY);
        brazeNotificationPayload.notificationVisibility = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_VISIBILITY_KEY);
        brazeNotificationPayload.notificationBadgeNumber = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_BADGE_COUNT_KEY);
        brazeNotificationPayload.publicNotificationExtras = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_PUBLIC_NOTIFICATION_KEY);
        brazeNotificationPayload.customNotificationId = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID);
        brazeNotificationPayload.notificationReceivedTimestampMillis = companion.parseLong(brazeNotificationPayload.notificationExtras, "braze_push_received_timestamp");
        brazeNotificationPayload.isInlineImagePush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_INLINE_IMAGE_STYLE_KEY);
        brazeNotificationPayload.isConversationalPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_CONVERSATIONAL_PUSH_STYLE_KEY);
        brazeNotificationPayload.notificationPriorityInt = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "p");
        brazeNotificationPayload.shouldFetchTestTriggers = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY);
        brazeNotificationPayload.shouldSyncGeofences = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_SYNC_GEOFENCES_KEY);
        brazeNotificationPayload.shouldRefreshFeatureFlags = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_REFRESH_FEATURE_FLAGS);
        brazeNotificationPayload.isUninstallTrackingPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY) || brazeNotificationPayload.brazeExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY);
        brazeNotificationPayload.deeplink = companion.parseString(brazeNotificationPayload.notificationExtras, "uri");
        brazeNotificationPayload.campaignId = companion.parseString(brazeNotificationPayload.notificationExtras, "cid");
        brazeNotificationPayload.pushUniqueId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_UNIQUE_ID);
        brazeNotificationPayload.useWebView = Boolean.valueOf(companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void parsePayloadFieldsFromBundle$parsePushDeliveryEventData(com.braze.models.push.BrazeNotificationPayload r3) {
        /*
            com.braze.models.push.BrazeNotificationPayload$Companion r2 = com.braze.models.push.BrazeNotificationPayload.Companion
            android.os.Bundle r1 = r3.notificationExtras
            java.lang.String r0 = "bz_p_e"
            java.lang.Integer r0 = r2.parseStringAsInteger(r1, r0)
            if (r0 == 0) goto L3c
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L3c
        L13:
            r3.isPushDeliveryEnabled = r0
            android.os.Bundle r1 = r3.notificationExtras
            java.lang.String r0 = "bz_p_fn"
            java.lang.Long r0 = r2.parseStringAsLong(r1, r0)
            if (r0 == 0) goto L39
            long r0 = r0.longValue()
        L23:
            r3.flushMinMinutes = r0
            android.os.Bundle r1 = r3.notificationExtras
            java.lang.String r0 = "bz_p_fx"
            java.lang.Long r0 = r2.parseStringAsLong(r1, r0)
            if (r0 == 0) goto L36
            long r0 = r0.longValue()
        L33:
            r3.flushMaxMinutes = r0
            return
        L36:
            r0 = 120(0x78, double:5.93E-322)
            goto L33
        L39:
            r0 = 5
            goto L23
        L3c:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.push.BrazeNotificationPayload.parsePayloadFieldsFromBundle$parsePushDeliveryEventData(com.braze.models.push.BrazeNotificationPayload):void");
    }

    private static final void parsePayloadFieldsFromBundle$parsePushStoryData(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.pushStoryPageIndex = Companion.parseObjectAsInteger(brazeNotificationPayload.notificationExtras, Constants.BRAZE_STORY_INDEX_KEY, 0);
        int i2 = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i2, brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || StringsKt.isBlank(templateFieldAtIndex)) {
                break;
            }
            brazeNotificationPayload.pushStoryPagesInternal.add(new PushStoryPage(brazeNotificationPayload.notificationExtras, i2));
            i2++;
        }
        brazeNotificationPayload.isNewlyReceivedPushStory = brazeNotificationPayload.notificationExtras.getBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, false);
    }

    private static final void parsePayloadFieldsFromBundle$parseVisibleContent(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.notificationChannelId = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
        brazeNotificationPayload.titleText = companion.parseString(brazeNotificationPayload.notificationExtras, "t");
        brazeNotificationPayload.contentText = companion.parseString(brazeNotificationPayload.notificationExtras, "a");
        brazeNotificationPayload.largeIcon = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_LARGE_ICON_KEY);
        brazeNotificationPayload.notificationSound = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_KEY);
        brazeNotificationPayload.summaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.accentColor = companion.parseStringAsColorInt(brazeNotificationPayload.notificationExtras, Constants.BRAZE_PUSH_ACCENT_KEY);
    }

    @JvmStatic
    public static final String parseString(Bundle bundle, String str) {
        return Companion.parseString(bundle, str);
    }

    @JvmStatic
    public static final boolean parseStringAsBoolean(Bundle bundle, String str) {
        return Companion.parseStringAsBoolean(bundle, str);
    }

    @JvmStatic
    public static final Integer parseStringAsColorInt(Bundle bundle, String str) {
        return Companion.parseStringAsColorInt(bundle, str);
    }

    @JvmStatic
    public static final Integer parseStringAsInteger(Bundle bundle, String str) {
        return Companion.parseStringAsInteger(bundle, str);
    }

    @JvmStatic
    public static final Long parseStringAsLong(Bundle bundle, String str) {
        return Companion.parseStringAsLong(bundle, str);
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final List<ActionButton> getActionButtons() {
        return this.actionButtonsInternal;
    }

    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public final String getBigSummaryText() {
        return this.bigSummaryText;
    }

    public final String getBigTitleText() {
        return this.bigTitleText;
    }

    public final Bundle getBrazeExtras() {
        return this.brazeExtras;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final String getContentCardSyncData() {
        return this.contentCardSyncData;
    }

    public final String getContentCardSyncUserId() {
        return this.contentCardSyncUserId;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ConversationMessage> getConversationMessages() {
        return this.conversationMessagesInternal;
    }

    public final Map<String, ConversationPerson> getConversationPersonMap() {
        return this.conversationPersonMapInternal;
    }

    public final String getConversationReplyPersonId() {
        return this.conversationReplyPersonId;
    }

    public final String getConversationShortcutId() {
        return this.conversationShortcutId;
    }

    public final Integer getCustomNotificationId() {
        return this.customNotificationId;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final long getFlushMaxMinutes() {
        return this.flushMaxMinutes;
    }

    public final long getFlushMinMinutes() {
        return this.flushMinMinutes;
    }

    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final Integer getNotificationBadgeNumber() {
        return this.notificationBadgeNumber;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final Bundle getNotificationExtras() {
        return this.notificationExtras;
    }

    public final Integer getNotificationPriorityInt() {
        return this.notificationPriorityInt;
    }

    public final Long getNotificationReceivedTimestampMillis() {
        return this.notificationReceivedTimestampMillis;
    }

    public final String getNotificationSound() {
        return this.notificationSound;
    }

    public final Integer getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public final String getPublicNotificationExtras() {
        return this.publicNotificationExtras;
    }

    public final Integer getPushDuration() {
        return this.pushDuration;
    }

    public final int getPushStoryPageIndex() {
        return this.pushStoryPageIndex;
    }

    public final List<PushStoryPage> getPushStoryPages() {
        return this.pushStoryPagesInternal;
    }

    public final String getPushUniqueId() {
        return this.pushUniqueId;
    }

    public final boolean getShouldFetchTestTriggers() {
        return this.shouldFetchTestTriggers;
    }

    public final boolean getShouldRefreshFeatureFlags() {
        return this.shouldRefreshFeatureFlags;
    }

    public final boolean getShouldSyncGeofences() {
        return this.shouldSyncGeofences;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final Boolean getUseWebView() {
        return this.useWebView;
    }

    public final boolean isConversationalPush() {
        return this.isConversationalPush;
    }

    public final boolean isInlineImagePush() {
        return this.isInlineImagePush;
    }

    public final boolean isNewlyReceivedPushStory() {
        return this.isNewlyReceivedPushStory;
    }

    public final boolean isPushDeliveryEnabled() {
        return this.isPushDeliveryEnabled;
    }

    public final boolean isPushStory() {
        return this.isPushStory;
    }

    public final boolean isUninstallTrackingPush() {
        return this.isUninstallTrackingPush;
    }

    public final void setAccentColor(Integer num) {
        this.accentColor = num;
    }

    public final void setActionButtons(List<ActionButton> actionButtons) {
        Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
        this.actionButtonsInternal = actionButtons;
    }

    public final void setBigImageUrl(String str) {
        this.bigImageUrl = str;
    }

    public final void setBigSummaryText(String str) {
        this.bigSummaryText = str;
    }

    public final void setBigTitleText(String str) {
        this.bigTitleText = str;
    }

    public final void setBrazeExtras(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.brazeExtras = bundle;
    }

    public final void setCampaignId(String str) {
        this.campaignId = str;
    }

    public final void setConfigurationProvider(BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setContentCardSyncData(String str) {
        this.contentCardSyncData = str;
    }

    public final void setContentCardSyncUserId(String str) {
        this.contentCardSyncUserId = str;
    }

    public final void setContentText(String str) {
        this.contentText = str;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setConversationShortcutId(String str) {
        this.conversationShortcutId = str;
    }

    public final void setConversationalPush(boolean z2) {
        this.isConversationalPush = z2;
    }

    public final void setCustomNotificationId(Integer num) {
        this.customNotificationId = num;
    }

    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    public final void setExtras(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extras = map;
    }

    public final void setFlushMaxMinutes(long j2) {
        this.flushMaxMinutes = j2;
    }

    public final void setFlushMinMinutes(long j2) {
        this.flushMinMinutes = j2;
    }

    public final void setInlineImagePush(boolean z2) {
        this.isInlineImagePush = z2;
    }

    public final void setIsInlineImagePush(boolean z2) {
        this.isInlineImagePush = z2;
    }

    public final void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public final void setNewlyReceivedPushStory(boolean z2) {
        this.isNewlyReceivedPushStory = z2;
    }

    public final void setNotificationBadgeNumber(Integer num) {
        this.notificationBadgeNumber = num;
    }

    public final void setNotificationCategory(String str) {
        this.notificationCategory = str;
    }

    public final void setNotificationChannelId(String str) {
        this.notificationChannelId = str;
    }

    public final void setNotificationPriorityInt(Integer num) {
        this.notificationPriorityInt = num;
    }

    public final void setNotificationReceivedTimestampMillis(Long l2) {
        this.notificationReceivedTimestampMillis = l2;
    }

    public final void setNotificationSound(String str) {
        this.notificationSound = str;
    }

    public final void setNotificationVisibility(Integer num) {
        this.notificationVisibility = num;
    }

    public final void setPublicNotificationExtras(String str) {
        this.publicNotificationExtras = str;
    }

    public final void setPushDeliveryEnabled(boolean z2) {
        this.isPushDeliveryEnabled = z2;
    }

    public final void setPushDuration(Integer num) {
        this.pushDuration = num;
    }

    public final void setPushStory(boolean z2) {
        this.isPushStory = z2;
    }

    public final void setPushStoryPageIndex(int i2) {
        this.pushStoryPageIndex = i2;
    }

    public final void setPushStoryPages(List<PushStoryPage> pushStoryPages) {
        Intrinsics.checkNotNullParameter(pushStoryPages, "pushStoryPages");
        this.pushStoryPagesInternal = pushStoryPages;
    }

    public final void setPushUniqueId(String str) {
        this.pushUniqueId = str;
    }

    public final void setShouldFetchTestTriggers(boolean z2) {
        this.shouldFetchTestTriggers = z2;
    }

    public final void setShouldRefreshFeatureFlags(boolean z2) {
        this.shouldRefreshFeatureFlags = z2;
    }

    public final void setShouldSyncGeofences(boolean z2) {
        this.shouldSyncGeofences = z2;
    }

    public final void setSummaryText(String str) {
        this.summaryText = str;
    }

    public final void setTitleText(String str) {
        this.titleText = str;
    }

    public final void setUninstallTrackingPush(boolean z2) {
        this.isUninstallTrackingPush = z2;
    }

    public final void setUseWebView(Boolean bool) {
        this.useWebView = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Companion companion = Companion;
        sb.append(companion.stringAndKey("PushDuration", this.pushDuration)).append(companion.stringAndKey("IsPushStory", Boolean.valueOf(this.isPushStory))).append(companion.stringAndKey("IsInlineImagePush", Boolean.valueOf(this.isInlineImagePush))).append(companion.stringAndKey("IsConversationalPush", Boolean.valueOf(this.isConversationalPush))).append(companion.stringAndKey("PublicNotificationExtras", this.publicNotificationExtras)).append(companion.stringAndKey("NotificationChannelId", this.notificationChannelId)).append(companion.stringAndKey("NotificationCategory", this.notificationCategory)).append(companion.stringAndKey("NotificationVisibility", this.notificationVisibility)).append(companion.stringAndKey("NotificationBadgeNumber", this.notificationBadgeNumber)).append(companion.stringAndKey("CustomNotificationId", this.customNotificationId)).append(companion.stringAndKey("NotificationReceivedTimestampMillis", this.notificationReceivedTimestampMillis)).append(companion.stringAndKey("ContentCardSyncData", this.contentCardSyncData)).append(companion.stringAndKey("ContentCardSyncUserId", this.contentCardSyncUserId)).append(companion.stringAndKey("TitleText", this.titleText)).append(companion.stringAndKey("ContentText", this.contentText)).append(companion.stringAndKey("LargeIcon", this.largeIcon)).append(companion.stringAndKey("NotificationSound", this.notificationSound)).append(companion.stringAndKey("SummaryText", this.summaryText)).append(companion.stringAndKey("AccentColor", this.accentColor)).append(companion.stringAndKey("BigSummaryText", this.bigSummaryText)).append(companion.stringAndKey("BigTitleText", this.bigTitleText)).append(companion.stringAndKey("BigImageUrl", this.bigImageUrl)).append(companion.stringAndKey("ActionButtons", getActionButtons()));
        sb.append(companion.stringAndKey("PushStoryPageIndex", Integer.valueOf(this.pushStoryPageIndex))).append(companion.stringAndKey("PushStoryPages", this.pushStoryPagesInternal)).append(companion.stringAndKey("ConversationMessages", this.conversationMessagesInternal)).append(companion.stringAndKey("ConversationPersonMap", this.conversationPersonMapInternal)).append(companion.stringAndKey("PushDeliveryEnabled", Boolean.valueOf(this.isPushDeliveryEnabled))).append(companion.stringAndKey("PushUniqueId", this.pushUniqueId)).append(companion.stringAndKey("ConversationShortcutId", this.conversationShortcutId));
        return sb.toString();
    }
}
