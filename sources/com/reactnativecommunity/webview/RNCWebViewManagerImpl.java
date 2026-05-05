package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.autofill.HintConstants;
import androidx.core.view.ViewCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\":\u001e\u007fјnjG6LeNNZS@\u000fs{:%c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2I]xk4\u00172HpG3[oE9fy>\u000562*8\u007fB\u0017ɝHϽ\u000f'zqJD\u0012ؖ?1Gb\u0013S\u0005(\u0012\u001e>N\u0002ɉ`g\\8\u0011xkhG#1\u0019rR5\u0010H|{>\u000f`5?\u000faL^p;CE=S18\u001boM5Wqk8\u0019+5[as\u0006g\t\u0004\"ICO;\r;8j:in\u001c);O\u0012O`\u00108w)\u0002#;2DN/VeE\u001c|\u0007<7;r\u001cH^:vD\u0016y\u0010:]%HK9r3f\u007f\u001ck\u001d\\r\u0014\u0005;QS\u0007|]sV$_CD\u001bw\u001a=_}UH|D\nA{?\tb0]L<U>G{?hG)E\u0017Q#O\u001fJdR'\u000f\u0005\u000f#\u0004m`\u0004X\"\u001dIg.\u0017LrD\u0013\t\u001cTb\u001aD\u0011{^\u001d\u001b\fK+ \u000b2l%3KfO\u0017\u001d\u001bQkN=/\u00158\"\u0003ySo9\rmeUqKyR%Go@pKpfpTTnjo:2v%@{\n\u007ff\fAeou*|D1G]]\\\u0011gZA+C\u0010^vK\u0017TaW3m2;!\u0001~]9\u0004uCa,+\u001bR1O\rM\u0019T\tRlBH;\u0007-tH]u\u0019_L\u001bP&Y\n[.\u001ag\u0005_C!\\\u0017+H\u0001[I\u0015\ts e\u0012U5-}\u001dv\u0001.\u0016;\u001bv:0\u0003LeSE&?t\u0001s d.4\u0012J\t\u0003{T9\u000fnO\u0001Tq>d7+.g23S\b\"+o]G5X.wBbEek5\b.(cW<\u00039\u001c,\u0012P f_\u0019J;f|\n\u0005Lv<n\u0019Avn@\u001cP^L\ra\u0003qh~\u0012PM9b.j\u0015r%p\u0005\\\u0003!}TL.\u000ed$I\fZvE;\u0010{W0\u0002{#t\u000bxI:\u000f\nl\u0007\u0012JpPZe.!04t`JO\u0014z\u0005jCT8:w \u000bq\b\u001a\n\u001eA\u0018F\u000e\u0010_FPMSV<\u000f)`d\u0004\u001d`s\u0014Q.\u000fE'3Ly}E\u0013H^T]\u001eb\u0005aX!\u001b\u0019\u0003/j3q\\Tg\u001cpl\u000ff]]q\u00042:\u0012\u0003Am\u001a#<<&H5BF\u001c\u0002g\u001f<\u000f0\rE\u0006h\\ \u000f\u0012\u0015\u0006~(7\\\u0013~$;8\u0013S/]Q\bb[\u0007~{E~2\u0001EwY\r\u001aC{H1,49uQWJ,'*\u0012\u0004?\fC8 U7%%j\u001e&f8^cN$R.b0CCT.?FJ#&:2\u0016|g\u0002a\u0003[tgM\u0010!na[p\u0014}ch'=\u0014rq5m\r\u0019e_ZB\u0003;35\tU\b^\u0017f\u0016R\u0011\u0002S\t\u0015\u000eZ-&M7Pv7sgc\u0017+\u001cSiHC/\u001a]\u00125>\u001e6}Mz>\u001289@\u0015i\u0011}DrOtnXV<b3<rZ$)B7/LlL+4t&Nh=}1\u001f\n\u000e\u0010v\u0015j]IT[aVMVO29#X|\u001fIRd\u000b~X\u0005Q\u0007\u000eOD-t\u000fm\u001e5\u0015<m\u00136VOS~Z\bZ\u0012V'=CP l\u0017J I\rKAGD1\u001bFL\b\t/4\u0019U\u001c98j\u0015\u0001;y*5yu\f7!V_\u0013}aofi+}{Z\u0012$\u0002\u0014\u0005/Qq\u0012'aZ|eK,emB\u0016\tM(l\u001a\u0004\u0010\u0018E_\u0003Zcj{ns\u00067V.D5\\#umA\n\u0018\u001a\u0002\u0018\"\u001f\feB|\u0013\u0014Gwn0;[\u001fGcg(\u000f\r!S\u0004O\u000f4cc\u001b\u000bKgqn^yv[zt]j\u0014<\u0018H#y6(\u0002p]8AE\u0012\u0003\u0017\u001bn{Cw\u0010f\u0013U!\u0012jIR\u000f:\u0011!&bcvti\r|[\bz\u000bn\u0010lr<6$\u000b4P^L%=\u0016J\u000fHC7U:YG@WD5+\u0006s%4_\u0018nUzmq\u0007pi7\u00194bXcf%\u0019c\u0017cdYO0n9i_VlMZ\\\u0014T]dv\u0011\r\rR\u001f\u00060^j\u0001\u0003h~u\u0001JRmY#,\u00172\u00118$x\u001f#OW\u001d\r\u0006';4\u001a\u0003>tI\u0017\u0019dk9`$<#?7\u0014\b\u000b\u0004\u0006\u0001{\u0005(\u0003\u0010}Q5\u0014{GCak\u0005\u000f\b-e9\u0017\fNaT\n!_zgA\u001d>&mId6\u0005/\u0011_g\f~B\u0019I+x\u001ai$8\u00049m\n\u001f.45i`\tB<l!G}%,.s+~t\b\u0001u1\u0004\u0016V3\b\u0010\u0012S(\"|OtXlQ\b*NN\u001a\u001aKY({\u0011>>ĽT{m\u0019.\u0005d\u001f\u0015Lk^\u0018*vt0Vcl=\u0011{'ʢN\u0016\u001b\u007f~\u0013\rn%`A>\u00123,wBVm1\u0001/O8߮VϘHv+ׇ\u0004L0f:S\f+\u001e͍H¤ng\u007fí\u0014_9=\u001bw|\u000f#\u000eVf!\nCϽ\u0010ܝ\bq7Ȋ^\\F&;bw\u007fv\u0013B\u000e:\u0003[\u06021֪VW}ص\u000bf\u0005/,\"\u0012iGT9\u00131\u001f\u0013·tï\\\u0001vˉt'4\n\u0014'bT\nD\u0005A\"\u0002\nݥ4ٝ8c&à\u0016k}0\u001bsb\u0016q[;O\u0018hgѴpנ{\ra߫qC\b\u001c01t\u001a#:\u001aHbP\t\u05fbeò\u0013< ɗ~p~9\u0017m\\A\u0003\u000b&2\u001cDJԵ û8GEφu\u0001KC=yX]W\u0005\u0017+u\u0014 ۆ|÷Ps}؉UV\u001cJ\u0015wTC\u001e\rx[p\u001dNÖ%Ըo@\u0004Ҟ\u001b\u0016pe<\"+x|\b\u000fP\u0010\u0016\u0014ӰOн\tD{ޮ;B+{noPG\u0017\u000e57\u007fI;Ϙ\u0007ګ,`:Ҽb\u001bVv~\u000eI\u0006[Ď'Χ\u001a9M\u07be\u0011W#z\u001cg\u0012Ux٬\u000b̉,/\u0012ϔfB+ M9;w'Ҷwڞb\t]˰^3|p q^6\u001eɷ\u001dʬ3[\u0010͛\u001brZr%A5p\u0005֙9݆\u001b?\u001dͽzQ0@[eGh[ۥxՀah[˭K*|\u007fs'^~\\Í\u001fՖ#\u0016\u0016ǮX\u000e\u0003\u0001LQ\f\u007fnLi¶&ÿ2\b\u001cպ6X\u0013[\"A_@*ɗ%މ{_fȝU\u001b3H@\r.'\u0010piӡ!ܹ&C\u001b؊k{\u001784K;\b[zMĥ&Ŀ\u0014 ]Ӆ\u0010\u0018!\rvy\u0016 w4\u0007Ƽ\u0015ۮPm\u0006҄;}x#v\u0012epjaUԪBޅ,\u0010.͍\f p\t\\'\nU\u001bܴ\u001aڏ#*,ח\\z>\u001bth,pMǛdۢd4vκӘDۍ*"}, d2 = {"\u001ab^:\"9>O\u0017\u000e\u0004Z;\u0001\u001a/c\n0\u0004P\n\u001b&[9 <s69Y\u0010i$Vs M@,o40|dj5\tc92~2N\"", "", "<df\u000ee*A", "", "uY\u0018#", "\u0010K0\u001b>&.@\u007f", "", "\u0011N<\u001a4\u0015\u001dMveZ:\u0019vf\u000bCb\b", "", "5dc\u0010B\u0014&/\u0002]t<\u0013\\d\u001c_]\u0004Y#`", "u(8", "\u0011N<\u001a4\u0015\u001dMveZ:\u0019vi\u0019Rg\"Z\u001cor", "5dc\u0010B\u0014&/\u0002]t<\u0013\\d\u001c_`\u0012h(zur6K", "\u0011N<\u001a4\u0015\u001dMveZ:\u0019vk\u0013Sn\u0012h4", "5dc\u0010B\u0014&/\u0002]t<\u0013\\d\u001c_b\fi/j\u0004\u000b", "\u0011N<\u001a4\u0015\u001dMyhXN\u001a", "5dc\u0010B\u0014&/\u0002]t?\u0016Zx\u001d", "\u0011N<\u001a4\u0015\u001dMzht;\bZn", "5dc\u0010B\u0014&/\u0002]t@\u0016ve\u000bCe", "\u0011N<\u001a4\u0015\u001dMzht?\u0016iz\u000bR^", "5dc\u0010B\u0014&/\u0002]t@\u0016vi\u0019Rq\u0004h\u001f", "\u0011N<\u001a4\u0015\u001dM|g_>\nk\u0003\u0014Ap\u0004i\u001emz\u00026", "5dc\u0010B\u0014&/\u0002]tB\u0015ah\rTy\rW1\\\u0005t4Sx+", "\u0011N<\u001a4\u0015\u001dM\u007fhV=&lu\u0016", "5dc\u0010B\u0014&/\u0002]tE\u0016Xg)Ul\u000f", "\u0011N<\u001a4\u0015\u001dM\u0004hhM&dh\u001dS[\n[", "5dc\u0010B\u0014&/\u0002]tI\u0016jw)M_\u0016i\u001cbv", "\u0011N<\u001a4\u0015\u001dM\u0006^aH\b[", "5dc\u0010B\u0014&/\u0002]tK\fcr\u000bD", "\u0011N<\u001a4\u0015\u001dM\u0007mdI&cr\u000bDc\u0011]", "5dc\u0010B\u0014&/\u0002]tL\u001bfs)Li\u0004Z$ix", "\u0012D5\u000eH\u0013-MwhlG\u0013fd\u000eIh\nu(`\u0005\u0005#Qm", "\u0012D5\u000eH\u0013-M\u007fZXD&gh\u001cMc\u0016i$j\u007f\u00116Y\b\u001b`\u0017\u001e@g{\u0016g}\u000e;1\u0017M\u0014", "\u0016S<\u0019R\f'1\u0003]^G\u000e", "\u0016S<\u0019R\u0014\";xxiR\u0017\\", "\u0016SC\u001dR\u0014\u001eB{hYX\u0017fv\u001e", "\"@6", ";@[9b>L4)\u0006\u0002l*\n\t/np,z@\u000b", ";@[9b>L>&\t\n^*\f\t.M\u007f'\u007f<", ";C^Da3HO\u0018\u0003\u0004`\u0014|\u0017=a\u0002(", ";GP@B5(^\u0019\blb5{\u0013AE\u0011(\u0005O", ";KP0^\u0017>`!\u0003\tl0\u0007\u0012\u001eo^2\u000eI\b!\u0013FW\u000eJ\u0005!7Y", ";OT;W0GU\u0007\t\u000bk*|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", ";Tb2e\b@S\"\u000e", ";Tb2e\b@S\"\u000elb;\u007fd:p\u0007,y<\u0010\u001b!PX\nDv", ";VT/I0>ev\t\u0004_0~", "\u001ab^:\"9>O\u0017\u000e\u0004Z;\u0001\u001a/c\n0\u0004P\n\u001b&[9 <s69Y\u0010i$Vs M@,o40rrj:\u000be\u0002", "1qT.g,+<vpz[\u001d\u0001\tAI\t6\u000b<\n\u0015\u0017", "\u001ab^:\"9>O\u0017\u000e\u0004Z;\u0001\u001a/c\n0\u0004P\n\u001b&[9 <s69Y\u0010i$Vs M@,o40j", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "\u001ab^:\"9>O\u0017\u000e\u0004Z;\u0001\u001a/c\n0\u0004P\n\u001b&[9 <s69Y\u0010i$Vs M@,o40\u0007u]D\u0012c9$", "EdQ#\\,P", "5dc\u0010b4FO\"}\tF(\b", "", "5dc\u0011b>GZ#zyb5~p/s\u000e$}@j$uGp\nL}4", "5dc\u0019T*D>\u0019\f\u0003b:\u000b\r9nn2ZJ\u0013 \u001eQk\r$v3CU\u007f !zt.N?KrC", ":nP1F6N`\u0017~", "", "DhTDJ9:^$~\b", "And?V,", "=m03g,KC$}vm,k\u0016+n\u000e$yO\u0005! ", "=m3?b7/W\u0019\u0011^g:\f\u00058c\u007f", "@dR2\\=>1#\u0007\u0003Z5{", "1n\\:T5=7\u0018", "/qV@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc\u000e_3Hey\u0003\u0002^\bz\u0007/s\u000e", "/k[<j\rBZ\u0019Zx\\,\u000b\u0017", "Adc\u000e_3Hey\u0003\u0002^\bz\u0007/s\u000e\t\tJ\tw\u001bNo})]3", "D`[BX", "Adc\u000e_3He\t\b~o,\n\u0017+l[&y@\u000f%wTy\u0016\u001dz,5Ij\u0007E", "/k[<j", "Adc\u000e_3He'_\u000be3\u000b\u0007<e\u007f1lD\u007f\u0017!", "Adc\u000e_3He'i\bh;|\u0007>e~\u0010{?\u0005\u0013", "3mP/_,=", "Adc\u000ea+K]\u001d}aZ@|\u0016\u001ey\u000b(", ":`h2e\u001bR^\u0019l\nk0\u0006\u000b", "Adc\u000ec7EW\u0017z\nb6\u0006q+m\u007f\t\u0006Mp%\u0017TK\u0010<\u007f4", "/o_9\\*:b\u001d\t\u0004G(\u0005\t", "Adc\u000fT:BQt\u000f\na\n\n\t.e\t7\u007f<\b", "1qT1X5MW\u0015\u0006", "Adc\u0010T*ASx\bv[3|\b", "Adc\u0010T*AS\u0001\ty^", "1`R5X\u0014HR\u0019l\nk0\u0006\u000b", "Adc\u0011b4,b#\fv`,\\\u0012+b\u0007(z", "Adc\u0011b>GZ#zyb5~p/s\u000e$}@", "Adc\u0013b9<Swz\bd\u0016\u0006", "Adc\u0014X6E]\u0017z\nb6\u0006h8a|/{?", "Adc\u0015T:(\\\u0003\nzg\u001e\u0001\u0012.o\u0012\b\r@\n&", "Adc\u0015T:(\\\u0007|\bh3\u0004", "Adc\u0016a*HU\"\u0003\nh", "Adc\u0016a1>Q(~yC(\u000e\u0005\u001dc\r,\u0007O", "7mY2V;>R}z\fZ\u001az\u00163p\u000f", "Adc\u0016a1>Q(~yC(\u000e\u0005\u001dc\r,\u0007O]\u0017\u0018Q|\u000e\u001a\u0001.DY\u0007/\u001ew\u0012-MB", "Adc\u0016a1>Q(~yC(\u000e\u0005\u001dc\r,\u0007O]\u0017\u0018Q|\u000e\u001a\u0001.DY\u0007/\u001ew\u0012-MB\u001cuA\u0006\u0011lj\u001a\u0014_4N`0N`", "Adc\u0016a1>Q(~yC(\u000e\u0005\u001dc\r,\u0007Oa!$/k\u0012EW21a}\n@t*", "Adc\u0016a1>Q(~yC(\u000e\u0005\u001dc\r,\u0007Oj\u0014\u001cGm\u001d", "Adc\u0017T=:A\u0017\f~i;Z\u00058O\u000b(\u00052\u0005 \u0016Q\u0002\u001c\u0018\u00074?ay/;k\u00125TW", "Adc\u0017T=:A\u0017\f~i;\\\u0012+b\u0007(z", "Adc\u0019T*D>\u0019\f\u0003b:\u000b\r9nn2ZJ\u0013 \u001eQk\r$v3CU\u007f ", "Adc\u001aX+BO\u0004\u0006vr)x\u00075R\u007f4\fD\u000e\u0017%7}\u000eIR#D]\b)", "Adc\u001aX5N1)\r\nh4`\u0018/m\u000e", "Adc\u001aX:LO\u001b\u0003\u0004`\f\u0006\u0005,l\u007f'", "Adc\u001aX:LO\u001b\u0003\u0004`\u0014\u0007\b?l\u007f\u0011wH\u0001", "Adc\u001a\\5B[)\u0007[h5\fv3z\u007f", "Adc\u001a\\?>Rv\t\u0004m,\u0006\u0018\u0017o~(", ";hg2W\nH\\(~\u0004m\u0014\u0007\b/", "Adc\u001bX:MS\u0018lxk6\u0004\u0010\u000fn{%\u0003@\u007f", "Adc\u001ci,KA\u0017\f\u0005e3d\u0013.e", "=uT?F*K] \u0006bh+|v>r\u00041}", "Adc\u001dT@FS\"\u000eg^8\r\t=t_1w=\b\u0017\u0016", "Adc T=>4#\f\u0003=(\f\u0005\u000ei\u000e$xG\u0001\u0016", "2hb.U3>R", "Adc V(ES'iv`,k\u0013\u0010i\u000f", "Adc X;\u001bc\u001d\u0006\nB5q\u00139m]2\u0005O\u000e!\u001eU", "Adc X;\u001dW'\n\u0002Z@q\u00139m]2\u0005O\u000e!\u001eU", "Adc X;,c$\n\u0005k;d\u00196t\u00043\u0003@r\u001b Fy J", "Adc [6Pa{\t\bbA\u0007\u0012>a\u0007\u0016yM\u000b\u001e\u001e+x\r@t!Dc\u000b", "Adc [6Pa\n~\bm0z\u00056S}5\u0006G\bz Fs\f8\u0006/B", "Adc b<KQ\u0019", "Adc!X?MH#\t\u0003", "Adc![0KR\u0004z\bm@Z\u00139k\u0004(\n \n\u0013\u0014No\r", "Adc\"f,K/\u001b~\u0004m", "CrT?4.>\\(", "Adc\"f,K/\u001b~\u0004m\u001a\f\u00163n\u0002", "Adc$X)OW\u0019\u0011Y^)\r\u000b1i\t*[I|\u0014\u001eGn", "AdcBc\u001e>Pv\u0002\bh4|f6i\u007f1\u000b", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000f\t,v\u0004(\u000e:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNCWebViewManagerImpl {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RNCWebView";
    private final String BLANK_URL;
    private final int COMMAND_CLEAR_CACHE;
    private final int COMMAND_CLEAR_FORM_DATA;
    private final int COMMAND_CLEAR_HISTORY;
    private final int COMMAND_FOCUS;
    private final int COMMAND_GO_BACK;
    private final int COMMAND_GO_FORWARD;
    private final int COMMAND_INJECT_JAVASCRIPT;
    private final int COMMAND_LOAD_URL;
    private final int COMMAND_POST_MESSAGE;
    private final int COMMAND_RELOAD;
    private final int COMMAND_STOP_LOADING;
    private final String DEFAULT_DOWNLOADING_MESSAGE;
    private final String DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE;
    private final String HTML_ENCODING;
    private final String HTML_MIME_TYPE;
    private final String HTTP_METHOD_POST;
    private final String TAG;
    private boolean mAllowsFullscreenVideo;
    private boolean mAllowsProtectedMedia;
    private String mDownloadingMessage;
    private boolean mHasOnOpenWindowEvent;
    private String mLackPermissionToDownloadMessage;
    private ReadableMap mPendingSource;
    private String mUserAgent;
    private String mUserAgentWithApplicationName;
    private RNCWebViewConfig mWebViewConfig;
    private final boolean newArch;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"9>O\u0017\u000e\u0004Z;\u0001\u001a/c\n0\u0004P\n\u001b&[9 <s69Y\u0010i$Vs M@,o40|dj5\tc92~2N\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\u001c@<\u0012", "", "@dP0gsGO(\u0003\f^s\u000f\t,v\u0004(\u000e:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebViewManagerImpl$setupWebChromeClient$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u000b\u0004IيX\nǞH\u00078ܥBw5e3A>D}JDQ\u0002+U\u007fڽ8&"}, d2 = {"1n\\{e,:Q(\bvm0\u000e\t-o\b0\fI\u0005&+\u0011\u0002\u000e9\b)5kG\r K\b.J4?kF\u0006\u0011q];\u0007p\u0010V\u0002.\u0006ZN;l]d=\u0011o]\u001bX3\rb`E$wSuj", "\u001ab^:\"9>O\u0017\u000e\u0004Z;\u0001\u001a/c\n0\u0004P\n\u001b&[9 <s69Y\u0010i$Vs M@\u0019nA(\u001dh?@\u000bc5]L", "5dc\u0011X-:c \u000ekb+|\u0013\u001ao\u000e7{M", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "@dP0gsGO(\u0003\f^s\u000f\t,v\u0004(\u000e:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends RNCWebChromeClient {
        AnonymousClass1(RNCWebView rNCWebView) {
            super(rNCWebView);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    public RNCWebViewManagerImpl() {
        this(false, 1, null);
    }

    public RNCWebViewManagerImpl(boolean z2) {
        this.newArch = z2;
        this.TAG = "RNCWebViewManagerImpl";
        this.mWebViewConfig = new RNCWebViewConfig() { // from class: com.reactnativecommunity.webview.RNCWebViewManagerImpl$$ExternalSyntheticLambda0
            @Override // com.reactnativecommunity.webview.RNCWebViewConfig
            public final void configWebView(WebView webView) {
                RNCWebViewManagerImpl.mWebViewConfig$lambda$0(webView);
            }
        };
        this.HTML_ENCODING = "UTF-8";
        this.HTML_MIME_TYPE = "text/html";
        this.HTTP_METHOD_POST = HttpPost.METHOD_NAME;
        this.BLANK_URL = "about:blank";
        this.DEFAULT_DOWNLOADING_MESSAGE = "Downloading";
        this.DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";
        this.COMMAND_GO_BACK = 1;
        this.COMMAND_GO_FORWARD = 2;
        this.COMMAND_RELOAD = 3;
        this.COMMAND_STOP_LOADING = 4;
        this.COMMAND_POST_MESSAGE = 5;
        this.COMMAND_INJECT_JAVASCRIPT = 6;
        this.COMMAND_LOAD_URL = 7;
        this.COMMAND_FOCUS = 8;
        this.COMMAND_CLEAR_FORM_DATA = 1000;
        this.COMMAND_CLEAR_CACHE = 1001;
        this.COMMAND_CLEAR_HISTORY = 1002;
    }

    public /* synthetic */ RNCWebViewManagerImpl(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2);
    }

    public static final void createViewInstance$lambda$1(RNCWebView webView, RNCWebViewManagerImpl this$0, String str, String str2, String str3, String str4, long j2) {
        Intrinsics.checkNotNullParameter(webView, "$webView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) webView.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
        if (rNCWebViewModule == null) {
            return;
        }
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String strGuessFileName = URLUtil.guessFileName(str, str3, str4);
            Intrinsics.checkNotNull(strGuessFileName);
            String strReplace = RNCWebViewManagerImplKt.getInvalidCharRegex().replace(strGuessFileName, Global.UNDERSCORE);
            String str5 = "Downloading " + strReplace;
            try {
                URL url = new URL(str);
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e2) {
                String str6 = this$0.TAG;
            }
            request.addRequestHeader("User-Agent", str2);
            request.setTitle(strReplace);
            request.setDescription(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strReplace);
            rNCWebViewModule.setDownloadRequest(request);
            if (rNCWebViewModule.grantFileDownloaderPermissions(this$0.getDownloadingMessageOrDefault(), this$0.getLackPermissionToDownloadMessageOrDefault())) {
                rNCWebViewModule.downloadFile(this$0.getDownloadingMessageOrDefault());
            }
        } catch (IllegalArgumentException e3) {
            String str7 = this$0.TAG;
        }
    }

    private final String getDownloadingMessageOrDefault() {
        String str = this.mDownloadingMessage;
        return str == null ? this.DEFAULT_DOWNLOADING_MESSAGE : str;
    }

    private final String getLackPermissionToDownloadMessageOrDefault() {
        String str = this.mLackPermissionToDownloadMessage;
        return str == null ? this.DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE : str;
    }

    private final void loadSource(RNCWebViewWrapper rNCWebViewWrapper, ReadableMap readableMap) {
        byte[] bytes;
        RNCWebView webView = rNCWebViewWrapper.getWebView();
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                String string2 = readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "";
                Intrinsics.checkNotNull(string);
                webView.loadDataWithBaseURL(string2, string, this.HTML_MIME_TYPE, this.HTML_ENCODING, null);
                return;
            }
            if (readableMap.hasKey("uri")) {
                String string3 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !Intrinsics.areEqual(url, string3)) {
                    if (readableMap.hasKey("method") && StringsKt.equals(readableMap.getString("method"), this.HTTP_METHOD_POST, true)) {
                        if (readableMap.hasKey("body")) {
                            String string4 = readableMap.getString("body");
                            try {
                                Intrinsics.checkNotNull(string4);
                                Charset charsetForName = Charset.forName("UTF-8");
                                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                                bytes = string4.getBytes(charsetForName);
                                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            } catch (UnsupportedEncodingException unused) {
                                Intrinsics.checkNotNull(string4);
                                bytes = string4.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            }
                        } else {
                            bytes = null;
                        }
                        if (bytes == null) {
                            bytes = new byte[0];
                        }
                        Intrinsics.checkNotNull(string3);
                        webView.postUrl(string3, bytes);
                        return;
                    }
                    HashMap map = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        if (this.newArch) {
                            ReadableArray array = readableMap.getArray("headers");
                            Intrinsics.checkNotNull(array);
                            for (Object obj : array.toArrayList()) {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
                                HashMap map2 = (HashMap) obj;
                                String str = (String) map2.get("name");
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = (String) map2.get("value");
                                if (str2 == null) {
                                    str2 = "";
                                }
                                Locale ENGLISH = Locale.ENGLISH;
                                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                                String lowerCase = str.toLowerCase(ENGLISH);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (Intrinsics.areEqual("user-agent", lowerCase)) {
                                    webView.getSettings().setUserAgentString(str2);
                                } else {
                                    map.put(str, str2);
                                }
                            }
                        } else {
                            ReadableMap map3 = readableMap.getMap("headers");
                            Intrinsics.checkNotNull(map3);
                            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map3.keySetIterator();
                            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                                Locale ENGLISH2 = Locale.ENGLISH;
                                Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
                                String lowerCase2 = strNextKey.toLowerCase(ENGLISH2);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                if (Intrinsics.areEqual("user-agent", lowerCase2)) {
                                    webView.getSettings().setUserAgentString(map3.getString(strNextKey));
                                } else {
                                    map.put(strNextKey, map3.getString(strNextKey));
                                }
                            }
                        }
                    }
                    Intrinsics.checkNotNull(string3);
                    webView.loadUrl(string3, map);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(this.BLANK_URL);
    }

    public static final void mWebViewConfig$lambda$0(WebView webView) {
    }

    private final void setUserAgentString(RNCWebViewWrapper rNCWebViewWrapper) {
        RNCWebView webView = rNCWebViewWrapper.getWebView();
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    private final void setupWebChromeClient(final RNCWebView rNCWebView) {
        final Activity currentActivity = rNCWebView.getThemedReactContext().getCurrentActivity();
        if (this.mAllowsFullscreenVideo && currentActivity != null) {
            final int requestedOrientation = currentActivity.getRequestedOrientation();
            RNCWebChromeClient rNCWebChromeClient = new RNCWebChromeClient(rNCWebView) { // from class: com.reactnativecommunity.webview.RNCWebViewManagerImpl$setupWebChromeClient$webChromeClient$1
                @Override // android.webkit.WebChromeClient
                public Bitmap getDefaultVideoPoster() {
                    return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                }

                @Override // android.webkit.WebChromeClient
                public void onHideCustomView() {
                    if (this.mVideoView == null) {
                        return;
                    }
                    ViewGroup rootView = getRootView();
                    if (rootView.getRootView() != this.mWebView.getRootView()) {
                        this.mWebView.getRootView().setVisibility(0);
                    } else {
                        this.mWebView.setVisibility(0);
                    }
                    currentActivity.getWindow().clearFlags(512);
                    rootView.removeView(this.mVideoView);
                    this.mCustomViewCallback.onCustomViewHidden();
                    this.mVideoView = null;
                    this.mCustomViewCallback = null;
                    currentActivity.setRequestedOrientation(requestedOrientation);
                    this.mWebView.getThemedReactContext().removeLifecycleEventListener(this);
                }

                @Override // android.webkit.WebChromeClient
                public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    if (this.mVideoView != null) {
                        callback.onCustomViewHidden();
                        return;
                    }
                    this.mVideoView = view;
                    this.mCustomViewCallback = callback;
                    currentActivity.setRequestedOrientation(-1);
                    this.mVideoView.setSystemUiVisibility(7942);
                    currentActivity.getWindow().setFlags(512, 512);
                    this.mVideoView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                    ViewGroup rootView = getRootView();
                    rootView.addView(this.mVideoView, RNCWebChromeClient.FULLSCREEN_LAYOUT_PARAMS);
                    if (rootView.getRootView() != this.mWebView.getRootView()) {
                        this.mWebView.getRootView().setVisibility(8);
                    } else {
                        this.mWebView.setVisibility(8);
                    }
                    this.mWebView.getThemedReactContext().addLifecycleEventListener(this);
                }
            };
            rNCWebChromeClient.setAllowsProtectedMedia(this.mAllowsProtectedMedia);
            rNCWebChromeClient.setHasOnOpenWindowEvent(this.mHasOnOpenWindowEvent);
            rNCWebView.setWebChromeClient(rNCWebChromeClient);
            return;
        }
        RNCWebChromeClient rNCWebChromeClient2 = (RNCWebChromeClient) rNCWebView.getWebChromeClient();
        if (rNCWebChromeClient2 != null) {
            rNCWebChromeClient2.onHideCustomView();
        }
        AnonymousClass1 anonymousClass1 = new RNCWebChromeClient(rNCWebView) { // from class: com.reactnativecommunity.webview.RNCWebViewManagerImpl.setupWebChromeClient.1
            AnonymousClass1(final RNCWebView rNCWebView2) {
                super(rNCWebView2);
            }

            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            }
        };
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        anonymousClass12.setAllowsProtectedMedia(this.mAllowsProtectedMedia);
        anonymousClass12.setHasOnOpenWindowEvent(this.mHasOnOpenWindowEvent);
        rNCWebView2.setWebChromeClient(anonymousClass1);
    }

    public final RNCWebView createRNCWebViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new RNCWebView(context);
    }

    public final RNCWebViewWrapper createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return createViewInstance(context, createRNCWebViewInstance(context));
    }

    public final RNCWebViewWrapper createViewInstance(ThemedReactContext context, final RNCWebView webView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        setupWebChromeClient(webView);
        context.addLifecycleEventListener(webView);
        this.mWebViewConfig.configWebView(webView);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (ReactBuildConfig.DEBUG) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView.setDownloadListener(new DownloadListener() { // from class: com.reactnativecommunity.webview.RNCWebViewManagerImpl$$ExternalSyntheticLambda1
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
                RNCWebViewManagerImpl.createViewInstance$lambda$1(webView, this, str, str2, str3, str4, j2);
            }
        });
        return new RNCWebViewWrapper(context, webView);
    }

    public final int getCOMMAND_CLEAR_CACHE() {
        return this.COMMAND_CLEAR_CACHE;
    }

    public final int getCOMMAND_CLEAR_FORM_DATA() {
        return this.COMMAND_CLEAR_FORM_DATA;
    }

    public final int getCOMMAND_CLEAR_HISTORY() {
        return this.COMMAND_CLEAR_HISTORY;
    }

    public final int getCOMMAND_FOCUS() {
        return this.COMMAND_FOCUS;
    }

    public final int getCOMMAND_GO_BACK() {
        return this.COMMAND_GO_BACK;
    }

    public final int getCOMMAND_GO_FORWARD() {
        return this.COMMAND_GO_FORWARD;
    }

    public final int getCOMMAND_INJECT_JAVASCRIPT() {
        return this.COMMAND_INJECT_JAVASCRIPT;
    }

    public final int getCOMMAND_LOAD_URL() {
        return this.COMMAND_LOAD_URL;
    }

    public final int getCOMMAND_POST_MESSAGE() {
        return this.COMMAND_POST_MESSAGE;
    }

    public final int getCOMMAND_RELOAD() {
        return this.COMMAND_RELOAD;
    }

    public final int getCOMMAND_STOP_LOADING() {
        return this.COMMAND_STOP_LOADING;
    }

    public final Map<String, Integer> getCommandsMap() {
        return MapBuilder.builder().put("goBack", Integer.valueOf(this.COMMAND_GO_BACK)).put("goForward", Integer.valueOf(this.COMMAND_GO_FORWARD)).put("reload", Integer.valueOf(this.COMMAND_RELOAD)).put("stopLoading", Integer.valueOf(this.COMMAND_STOP_LOADING)).put("postMessage", Integer.valueOf(this.COMMAND_POST_MESSAGE)).put("injectJavaScript", Integer.valueOf(this.COMMAND_INJECT_JAVASCRIPT)).put("loadUrl", Integer.valueOf(this.COMMAND_LOAD_URL)).put("requestFocus", Integer.valueOf(this.COMMAND_FOCUS)).put("clearFormData", Integer.valueOf(this.COMMAND_CLEAR_FORM_DATA)).put("clearCache", Integer.valueOf(this.COMMAND_CLEAR_CACHE)).put("clearHistory", Integer.valueOf(this.COMMAND_CLEAR_HISTORY)).build();
    }

    public final void onAfterUpdateTransaction(RNCWebViewWrapper viewWrapper) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        ReadableMap readableMap = this.mPendingSource;
        if (readableMap != null) {
            loadSource(viewWrapper, readableMap);
        }
        this.mPendingSource = null;
    }

    public final void onDropViewInstance(RNCWebViewWrapper viewWrapper) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        webView.getThemedReactContext().removeLifecycleEventListener(webView);
        webView.cleanupCallbacksAndDestroy();
        webView.mWebChromeClient = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void receiveCommand(RNCWebViewWrapper viewWrapper, String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(args, "args");
        RNCWebView webView = viewWrapper.getWebView();
        switch (commandId.hashCode()) {
            case -1241591313:
                if (commandId.equals("goBack")) {
                    webView.goBack();
                    return;
                }
                return;
            case -948122918:
                if (commandId.equals("stopLoading")) {
                    webView.stopLoading();
                    return;
                }
                return;
            case -934641255:
                if (commandId.equals("reload")) {
                    webView.reload();
                    return;
                }
                return;
            case -759238347:
                if (commandId.equals("clearCache")) {
                    webView.clearCache(args.getBoolean(0));
                    return;
                }
                return;
            case -318289731:
                if (commandId.equals("goForward")) {
                    webView.goForward();
                    return;
                }
                return;
            case -265032709:
                if (commandId.equals("clearFormData")) {
                    webView.clearFormData();
                    return;
                }
                return;
            case 336631465:
                if (commandId.equals("loadUrl")) {
                    String string = args.getString(0);
                    if (string == null) {
                        throw new RuntimeException("Arguments for loading an url are null!");
                    }
                    webView.progressChangedFilter.setWaitingForCommandLoadUrl(false);
                    webView.loadUrl(string);
                    return;
                }
                return;
            case 903120263:
                if (commandId.equals("clearHistory")) {
                    webView.clearHistory();
                    return;
                }
                return;
            case 1280029577:
                if (commandId.equals("requestFocus")) {
                    webView.requestFocus();
                    return;
                }
                return;
            case 1490029383:
                if (commandId.equals("postMessage")) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", args.getString(0));
                        webView.evaluateJavascriptWithFallback("(function () {var event;var data = " + jSONObject + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                        return;
                    } catch (JSONException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                return;
            case 2104576510:
                if (commandId.equals("injectJavaScript")) {
                    webView.evaluateJavascriptWithFallback(args.getString(0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void setAllowFileAccess(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccess(z2);
    }

    public final void setAllowFileAccessFromFileURLs(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccessFromFileURLs(z2);
    }

    public final void setAllowUniversalAccessFromFileURLs(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowUniversalAccessFromFileURLs(z2);
    }

    public final void setAllowsFullscreenVideo(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        this.mAllowsFullscreenVideo = z2;
        setupWebChromeClient(webView);
    }

    public final void setAllowsProtectedMedia(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        this.mAllowsProtectedMedia = z2;
        WebChromeClient webChromeClient = webView.getWebChromeClient();
        if (webChromeClient == null || !(webChromeClient instanceof RNCWebChromeClient)) {
            return;
        }
        ((RNCWebChromeClient) webChromeClient).setAllowsProtectedMedia(z2);
    }

    public final void setAndroidLayerType(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setLayerType(Intrinsics.areEqual(str, "hardware") ? 2 : Intrinsics.areEqual(str, "software") ? 1 : 0, null);
    }

    public final void setApplicationNameForUserAgent(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        if (str != null) {
            this.mUserAgentWithApplicationName = WebSettings.getDefaultUserAgent(viewWrapper.getWebView().getContext()) + Global.BLANK + str;
        } else {
            this.mUserAgentWithApplicationName = null;
        }
        setUserAgentString(viewWrapper);
    }

    public final void setBasicAuthCredential(RNCWebViewWrapper viewWrapper, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setBasicAuthCredential((readableMap != null && readableMap.hasKey("username") && readableMap.hasKey(HintConstants.AUTOFILL_HINT_PASSWORD)) ? new RNCBasicAuthCredential(readableMap.getString("username"), readableMap.getString(HintConstants.AUTOFILL_HINT_PASSWORD)) : null);
    }

    public final void setCacheEnabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setCacheMode(z2 ? -1 : 2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setCacheMode(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        WebSettings settings = viewWrapper.getWebView().getSettings();
        int i2 = -1;
        if (str != null) {
            switch (str.hashCode()) {
                case -2059164003:
                    if (str.equals("LOAD_NO_CACHE")) {
                        i2 = 2;
                    }
                    break;
                case -1215135800:
                    str.equals("LOAD_DEFAULT");
                    break;
                case -873877826:
                    if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                        i2 = 1;
                    }
                    break;
                case 1548620642:
                    if (str.equals("LOAD_CACHE_ONLY")) {
                        i2 = 3;
                    }
                    break;
            }
        }
        settings.setCacheMode(i2);
    }

    public final void setDomStorageEnabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDomStorageEnabled(z2);
    }

    public final void setDownloadingMessage(String str) {
        this.mDownloadingMessage = str;
    }

    public final void setForceDarkOn(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (Build.VERSION.SDK_INT > 28) {
            if (WebViewFeature.isFeatureSupported("FORCE_DARK")) {
                WebSettingsCompat.setForceDark(webView.getSettings(), z2 ? 2 : 0);
            }
            if (z2 && WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
                WebSettingsCompat.setForceDarkStrategy(webView.getSettings(), 2);
            }
        }
    }

    public final void setGeolocationEnabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setGeolocationEnabled(z2);
    }

    public final void setHasOnOpenWindowEvent(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        this.mHasOnOpenWindowEvent = z2;
        setupWebChromeClient(webView);
    }

    public final void setHasOnScroll(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHasScrollEvent(z2);
    }

    public final void setIncognito(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (z2) {
            CookieManager.getInstance().removeAllCookies(null);
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    public final void setInjectedJavaScript(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().injectedJS = str;
    }

    public final void setInjectedJavaScriptBeforeContentLoaded(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().injectedJSBeforeContentLoaded = str;
    }

    public final void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().injectedJavaScriptBeforeContentLoadedForMainFrameOnly = z2;
    }

    public final void setInjectedJavaScriptForMainFrameOnly(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().injectedJavaScriptForMainFrameOnly = z2;
    }

    public final void setInjectedJavaScriptObject(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setInjectedJavaScriptObject(str);
    }

    public final void setJavaScriptCanOpenWindowsAutomatically(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptCanOpenWindowsAutomatically(z2);
    }

    public final void setJavaScriptEnabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptEnabled(z2);
    }

    public final void setLackPermissionToDownloadMessage(String str) {
        this.mLackPermissionToDownloadMessage = str;
    }

    public final void setMediaPlaybackRequiresUserAction(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(z2);
    }

    public final void setMenuCustomItems(RNCWebViewWrapper viewWrapper, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (readableArray == null) {
            webView.setMenuCustomItems(null);
            return;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
        webView.setMenuCustomItems(arrayList);
    }

    public final void setMessagingEnabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setMessagingEnabled(z2);
    }

    public final void setMessagingModuleName(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().messagingModuleName = str;
    }

    public final void setMinimumFontSize(RNCWebViewWrapper viewWrapper, int i2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMinimumFontSize(i2);
    }

    public final void setMixedContentMode(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (str == null || Intrinsics.areEqual(ReactScrollViewHelper.OVER_SCROLL_NEVER, str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if (Intrinsics.areEqual(ReactScrollViewHelper.OVER_SCROLL_ALWAYS, str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if (Intrinsics.areEqual("compatibility", str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    public final void setNestedScrollEnabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().nestedScrollEnabled = z2;
    }

    public final void setOverScrollMode(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        int i2 = 0;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1414557169) {
                str.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS);
            } else if (iHashCode != 104712844) {
                if (iHashCode == 951530617 && str.equals("content")) {
                    i2 = 1;
                }
            } else if (str.equals(ReactScrollViewHelper.OVER_SCROLL_NEVER)) {
                i2 = 2;
            }
        }
        webView.setOverScrollMode(i2);
    }

    public final void setPaymentRequestEnabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        if (WebViewFeature.isFeatureSupported("PAYMENT_REQUEST")) {
            WebSettingsCompat.setPaymentRequestEnabled(webView.getSettings(), z2);
        }
    }

    public final void setSaveFormDataDisabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSaveFormData(!z2);
    }

    public final void setScalesPageToFit(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView webView = viewWrapper.getWebView();
        webView.getSettings().setLoadWithOverviewMode(z2);
        webView.getSettings().setUseWideViewPort(z2);
    }

    public final void setSetBuiltInZoomControls(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setBuiltInZoomControls(z2);
    }

    public final void setSetDisplayZoomControls(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDisplayZoomControls(z2);
    }

    public final void setSetSupportMultipleWindows(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSupportMultipleWindows(z2);
    }

    public final void setShowsHorizontalScrollIndicator(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHorizontalScrollBarEnabled(z2);
    }

    public final void setShowsVerticalScrollIndicator(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setVerticalScrollBarEnabled(z2);
    }

    public final void setSource(RNCWebViewWrapper viewWrapper, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        this.mPendingSource = readableMap;
    }

    public final void setTextZoom(RNCWebViewWrapper viewWrapper, int i2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setTextZoom(i2);
    }

    public final void setThirdPartyCookiesEnabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        CookieManager.getInstance().setAcceptThirdPartyCookies(viewWrapper.getWebView(), z2);
    }

    public final void setUserAgent(RNCWebViewWrapper viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        this.mUserAgent = str;
        setUserAgentString(viewWrapper);
    }

    public final void setWebviewDebuggingEnabled(RNCWebViewWrapper viewWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        RNCWebView.setWebContentsDebuggingEnabled(z2);
    }
}
