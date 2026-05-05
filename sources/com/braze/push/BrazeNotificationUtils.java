package com.braze.push;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.events.BrazePushEvent;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яē\u0014D57\u001eq\u007fR܀kt\nA\u000e0\u0019:J~(,\u001aw\u001dfr96EmHDR[*\u0015l\u000442[,ڎK;k\u001a\u0006̝\u0011O\\monPZ\u0013C%\u0006\u001exp-QU\u000f]\u001a\u000f8Bw?IMwމA`\u000b6\rړ:\"Ny\r\u0001 *P\u0010\rzKK\u0012\u00158@~CZ\rS\u0010\"\u0012\u001c>(\u0001$^oNLHt]@0+\u0003\u007fBV'e<\u0005M#F\\'\u0013~gԣ+Vʺe\u0015SR;\u0006*\u001cD\t?џA\u0005v'oAW\u007fo6\u0007\rD\u00199]%]!5\r\t_p$'Y`*P\u0019\u001c6\n\u0013{;M4\u0012\u0014:`.[.-\rVA\u0003\bk@~\u0013\u000fF\u000e\u000ey6E9F8sG)|iai\u001b~;\n\u0018%\u001eQ\u00155&$t\u001cw-\u001b\u0003\u0010\u00025_NUH|\u0019\nA{\u001d\tb0,46U\u001aG}'-E@}[\u0002=/\b\u001aJZf%\"\u0011la\bjHnA\u001f\u001cED!\u000epC\u0013 2U\u001dn:1e\u001c\u0003\u0014.\f!.twj0U\u0014\\p\u0001i\u0019o$\u000fm=tZqn\u001a\u001b\b=lFMQ\u0012$(W?*M`z\u0005\u0007srW\u001aht(PAxn\u001e\u0019\u0014D|.Y7\b\b*YD1GiEL\u0011,ZA+\u0018\u0010^v1\u0017TaFInl\u000b\u0017'h\\\u001f|\u0018|W:\u0015`P<qUC:>UP\u000bz\u0002k\u0015\r\u001b\u0018G\u0016twPz7\u000eU*B\\\u001f\u0002_=f+\u000f-Qb\u0006;_dr\u0014l\u0014\u0017o\t\u000b$';\u0017V\u0018\fx\u001cD`\u0019[\u0016Y_<\u0005\u000b\u000b#6q0\u007foT\u0013IyS9jnO\u00010q>d7+\u0007e#m\u000f}P\u00155[PW!$\u000b,/Cu$n8<\b\u0012'&#\u000e40q)\bb\u007fqx@\u0001Wg/V\"R\u00153FV}\u0010\bp\u001dz\u0012{^O\u0016\tVfZ;3\ft\u001f,;\u007f\u0007_H4\b}bP&/<k\fEvCS\u001e}Wu{\u0006K\u000b\u001az\u0013\u0018=\u00141\u001d-LC.\nod\u001f/4uH:Ooz\u0005j1j4tR\u0016<[T\u0018\u0013@~\u000eTw\u000fEArwI\f&T'\u0013\u001dMMvS\u00189*/\f?7,\u0007M13|vX=\u0005J\u0001\u0002?O 3o\r\u001f=+rai\u001f6f\u0019\u000bslsM\u0010o\u001cGW\u0010\u001cu\u001aR0~3AF6\u007fQY\f\u0005hv\u000b\u0004q~h\u0005 ~R|1Y\u0003\t7&<8J;\u001f]\r\bdCK|\u0013gK \u0001%WA\t\"{\u0012Za-NS;yajB4,[aI\u0016\bN/W\b\u0003;tW<\u0002:a)M.qDvH\u000e[f.AFJ#\u007f:2\u0016tg\u0002aACbg~\u0010!n;qqNXY)\u0011\n\u0012y\u0014rcI\u001bf_\u0016*r;c5\tUat\u0018!pHRk \u0007\u001e0\u0018#d766\"Y\u0014]v\u0001p\u001ac\"\u0012sOyly1^_N\u0002-\b\u000e\u0004XcX\u0019I\u0015e>\u0013H\rrPq&`\u0001'\u0013\u0010R.\\\u001d\r\fv\u0011AAvv,rG7G.\f\u0011U\u001f\u001f\u0004s\tV'?lW\u001dM19\u000bn{Y\u0019H'\r\u007fXj9v\u000e&D-t\u0014m\u001e5l<m\u0013\u0017lP\u000eNPMD\u0011<\u001e_^F^V\\H[kUAT1\u0011/)~\u000b83'{\u0003Q\u00022Z\u0005\u000b\u000f%?(@\u001cD\u0002~\u000b)?\u000fu\u001cmei.eiZ7$\u0002\u0014[/Qq\u001f'aZZ{Jf\u0010c\n\u0018\nM1T\n\u0004a\u0018E_\bZcjSns\u0006\u0018l/~\u0005Rm_l'\u0001:0wV\fd\n!dE\t'1Dl>sqO[[4\u0012\u000br\u001au\u0018EM\u001e)aV-\u0014]\u0005X+w\u0007\u00144%sJ_\f\u0004hC\u0012:\b\u0015XYXT]\u0016b\"\u0003j\u001c\u0011&\u0015\u0001(\u001b\\\u001cw__\u0011\u0004n[0'y6v:j\feA\u0011\u001f\u0007\u0014lt<\u0013$\u000b4#^L%@\u0016J\u000fTC7U\u0007YG@jB&e'iv\u001e%\u0016wwCc0p=gr;qXkMe\u000b\u0019\u001c&\u0014z9g\u0018jY;wZLXBX4MuhV#\\xr<45xF^RrC\f\u000eL#K\u0014-e-q\u0013;iw)+ek5W\u001eC;M\u001a\u0003>iI\u0017\u0019,k9`2$\u0011?\u0014\u0014\b\u000b\u0018\u0006\u0003{c(\u0005wIOJLDwOYAnemA\bC\r\u001f8'R\u001aY)+q!@&\"\u000e+t6\u0005K\u000fP*\u001dtC\u0003\u000f)vb˛^ޮY\u0006Eڽan*8S_n.\u0005\u0080\u000bºSj\u0004ۑ6~txqMs0,^҅5u)eUe\"u\"ofF/[6@\u0019\u0003H&\\'ҨL-H\u0019[m{uԽX9"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007\u0010Fq\u001d<#", "", "u(E", "!ND\u001f6\f89xr", "", "\"@6", "/bc6i,'](\u0003{b*x\u00183o\t\tw>\u0010!$[", "\u001ab^:\")KO.~DB\t\n\u0005Deh2\u000bD\u0002\u001b\u0015C~\u0012F\u007f\u00061W\r*D\u0002k", "5dc\u000eV;Bd\u0019g\u0005m0}\r-a\u000f,\u0006Ia\u0013\u0015Vy\u001bP", "u(;0b4\bP&z\u0010^u`e<a\u0015(dJ\u0010\u001b\u0018Km\nKz/>:y\u001eFw#B#", "<nc6Y0<O(\u0003\u0005g\u0019|\u0007/i\u0011(\t\u001e\b\u0013%U", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001ce}(\u007fQ\u0001$tNk\u001cJ", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1`]0X3'](\u0003{b*x\u00183o\t", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<nc6Y0<O(\u0003\u0005g\u0010{", "", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u0013d", ">`h9b(=", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`\u000f", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001ar\u00042\tD\u0010+", "5dc\u001ce\nKS\u0015\u000ezG6\f\r0i}$\u000bD\u000b tJk\u0017Ev,\u0019X", "5dc\u001dh:A/\u0017\u000e~h5g\t8d\u00041}$\n&\u0017P~", "\u001a`]1e6BRbz\u0006iug\t8d\u00041}$\n&\u0017P~c", "/bc6b5", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "5dc#T3BR\u0002\t\nb-\u0001\u0007+t\u00042\u0005\u001e\u0004\u0013 Po\u0015", "\u001a`]1e6BRbz\u0006iue\u0013>i\u0001,y<\u0010\u001b!PM\u00118\u007f.5`S", "<nc6Y0<O(\u0003\u0005g\u0014x\u0012+g\u007f5", "\u001a`]1e6BRbz\u0006iue\u0013>i\u0001,y<\u0010\u001b!PW\nEr'5fS", "6`]1_,\u001cO\"|ze\u0015\u0007\u00183f\u0004&wO\u0005! #m\u001d@\u0001.", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "6`]1_,\u001c]\"\u000ezg;Z\u0005<d\u000e\u0016{M\u0005\u0013\u001eK\u0005\u000e;T!BXa!\"z\u0016<MLJ", "6`]1_,'](\u0003{b*x\u00183o\t\u0007{G\u0001&\u0017F", "6`]1_,'](\u0003{b*x\u00183o\t\u0012\u0007@\n\u0017\u0016", "6`]1_,)c'\u0002hm6\n\u001d\u001aa\u0002(YG\u0005\u0015\u001dGn", "7r=<g0?W\u0017z\nb6\u0006p/s\u000e$}@", "", "7rD;\\5Lb\u0015\u0006\u0002M9x\u00075i\t*fP\u000f\u001a", "7rE._0=<#\u000e~_0z\u0005>i\n1lD\u000f\u001b\u0014Kv\u0012K\u000b", "Dhb6U0EW(\u0013", ":nV\u000fT0=c\u0002\t\nb-\u0001\u0007+t\u00042\u0005\u001e\b\u001b\u0015M", "1tbAb4\u001c]\"\u000ezg;j\u0018<i\t*", ">qT3X;<Vu\u0003\nf(\b\u0017\u0013fh(\u000eG\u0015\u0004\u0017Eo\u0012Mv$#h\b-KX&<P", "@dU?X:A4\u0019z\nn9|i6a\u00026_A\\\"\"Ty\u0019Iz!DY", "@d`BX:M5\u0019\t{^5z\t\u001ce\u00015{N\u0004z\u0018#z\u0019I\u00010B]y/7", "@ndAX\u001cLS&p~m/e\u0013>i\u0001,y<\u0010\u001b!PY\u0019<\u007f%4=\u0007/7v%", "3wc?T:", "2dT=?0GY", "CrT$X)/W\u0019\u0011", "0qPGX\u0017Na\u001c", "\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u0002W}\u0011\u001c\b%>hS", "Ad]1A6MW\u001a\u0003xZ;\u0001\u00138O\u000b(\u0005@\u007fs$Qk\r:r3D", "Ad]1C<LVt|\nb6\u0006l8t\u007f1\u000b", ">tb5<5MS\"\u000e", "0q^.W*:a(m\u000fi,", "\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007\u0010Fq\u001d<\f HgI\u001e}rp=\bg*J\u0006+QU+9fNq;\u0010 i|b6\rZ", "Ad]1C<LV\u0001~\tl(~\t\u001ce}(\u007fQ\u0001\u0016sTy\n;t!Ch", "Adc\u000eV*>\\(\\\u0005e6\nl0P\r(\n@\n&rPn{L\u00020?f\r 6", "<nc6Y0<O(\u0003\u0005g\t\r\r6d\u007f5", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l*S?r3\u001e\">", "Adc\u0010T;>U#\f\u000fB-g\u0016/s\u007f1\u000b\u001c\n\u0016\u0005Wz\u0019F\u000445X", "Adc\u0010b5MS\"\u000e^_\u0017\n\t=e\t7", "Adc\u0010b5MS\"\u000e^g;|\u0012>I\u0001\u0013\t@\u000f\u0017 V", "Adc\u0011X3>b\u0019b\u0004m,\u0006\u0018", "Adc\u0019T9@S||\u0005g\u0010}s<e\u000e(\u0005O\\ \u00165\u007f\u0019G\u00012DY|", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\fa~*{)\u0011\u001f\u0014G|q=a25g})F", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\u000eu\r$\u000bD\u000b rNk\u001bD", "BgX@63:a'", "2ta.g0H\\|\bbb3\u0004\r=", "Adc\u001de0H`\u001d\u000e\u000fB-g\u0016/s\u007f1\u000b\u001c\n\u0016\u0005Wz\u0019F\u000445X", "Adc\u001dh)EW\u0017ozk:\u0001\u00138I\u0001\u0013\t@\u000f\u0017 VK\u0017;d5@d\b-Fm\u0015", "Adc X;,V#\u0011la,\u0006", "Adc `(EZ||\u0005g", "/o_\u0010b5?W\u001b\u000f\bZ;\u0001\u00138P\r2\rD\u007f\u0017$", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "Adc b<GR|\u007fek,\u000b\t8t[1z.\u0011\"\"Q|\u001d<u", "Adc h4FO&\u0013i^?\fl0P\r(\n@\n&rPn{L\u00020?f\r 6", "Adc!\\*DS&b{I9|\u0017/n\u000f", "Adc!\\;ES|\u007fek,\u000b\t8t", "Adc#\\:BP\u001d\u0006~m@`\n\u001ar\u007f6{I\u0010r F]\u001eG\u0002/Bh}\u001f", "E`Z2F*KS\u0019\b^_\b\b\u0014<o\u000b5\u007f<\u0010\u0017", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "7r1?TA>>)\r}F,\u000b\u0017+g\u007f", "\u0010qPGX\u0015Hb\u001d\u007f~\\(\f\r9n\\5\u0006<\u007f\u0015\u0013U~|P\u0002%", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeNotificationUtils {
    private static final String SOURCE_KEY = "source";
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeNotificationUtils.class);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004W\u00068\u000b4G\u0005ӯ+(Մ7lz;@D\u0014߉\\Q\u00147\u0015k\f82[<qq<ڈ\u001e}0\u000b ]ug\u0007J\t\fß\u0013\f\u001eю\u0003.OX\u0007az\u000f8GX?9SX=?gӃ:\r"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007\u0010Fq\u001d<\f HgI\u001e}rp=\bg*J\u0006+QU+9fNq;\u0010 i|b6\rZ", "", "0qPGX\u0017Na\u001c^\f^5\fwCp\u007f", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\u0002'UrmMv.DH\u0012+7C", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'~!\u001f\u0011l\u001b8\f%~Y\u00070?{_\u000bZ?Pk\u001f.#kAJ\u0007l;=\u000b2G\"\u0012\u001d", "5dc\u000fe(SS\u0004\u000f\ta\f\u000e\t8tn<\u0007@", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqXM|,\u00172\u007f\u001c?V65b\r\u000fKx\u0016\u0004", "\u001dO4\u001b8\u000b", " D2\u0012<\u001d\u001e2", "\u0012D;\u0012G\f\u001d", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private enum BrazeNotificationBroadcastType {
        OPENED(BrazePushEventType.NOTIFICATION_OPENED),
        RECEIVED(BrazePushEventType.NOTIFICATION_RECEIVED),
        DELETED(BrazePushEventType.NOTIFICATION_DELETED);

        private final BrazePushEventType brazePushEventType;

        BrazeNotificationBroadcastType(BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }

        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            try {
                iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$cancelNotification$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        final /* synthetic */ int $notificationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i2) {
            super(0);
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cancelling notification action with id: " + i;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$cancelNotification$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Exception occurred attempting to cancel notification.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$getNotificationId$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08951 extends Lambda implements Function0<String> {
        final /* synthetic */ Integer $customNotificationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08951(Integer num) {
            super(0);
            num = num;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Using notification id provided in the message's extras bundle: " + num;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$getNotificationId$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function0<String> {
        final /* synthetic */ int $notificationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(int i2) {
            super(0);
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Message without notification id provided in the extras bundle received. Using a hash of the message: " + i;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$getOrCreateNotificationChannelId$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08961 extends Lambda implements Function0<String> {
        final /* synthetic */ String $channelIdFromExtras;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08961(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Found notification channel in extras with id: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$getOrCreateNotificationChannelId$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08972 extends Lambda implements Function0<String> {
        final /* synthetic */ String $channelIdFromExtras;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08972(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification channel from extras is invalid. No channel found with id: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$getOrCreateNotificationChannelId$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<String> {
        public static final AnonymousClass3 INSTANCE = ;

        AnonymousClass3() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Braze default notification channel does not exist on device. Creating default channel.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08981 extends Lambda implements Function0<String> {
        public static final C08981 INSTANCE = ;

        C08981() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification extras bundle was null. Could not find a valid notification channel";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08992 extends Lambda implements Function0<String> {
        final /* synthetic */ String $channelIdFromExtras;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08992(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Found notification channel in extras with id: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09003 extends Lambda implements Function0<String> {
        final /* synthetic */ String $channelIdFromExtras;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09003(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification channel from extras is invalid, no channel found with id: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09014 extends Lambda implements Function0<String> {
        public static final C09014 INSTANCE = ;

        C09014() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Braze default notification channel does not exist on device.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$handleCancelNotificationAction$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09021 extends Lambda implements Function0<String> {
        final /* synthetic */ int $notificationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09021(int i2) {
            super(0);
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cancelling notification action with id: " + i;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$handleCancelNotificationAction$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09032 extends Lambda implements Function0<String> {
        public static final C09032 INSTANCE = ;

        C09032() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Exception occurred handling cancel notification intent.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$handleContentCardsSerializedCardIfPresent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09041 extends Lambda implements Function0<String> {
        final /* synthetic */ String $contentCardData;
        final /* synthetic */ String $contentCardDataUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09041(String str, String str2) {
            super(0);
            str = str;
            str = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Push contains associated Content Cards card. User id: " + str + " Card data: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$handleNotificationDeleted$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09051 extends Lambda implements Function0<String> {
        public static final C09051 INSTANCE = ;

        C09051() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Sending notification deleted broadcast";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$handleNotificationDeleted$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09062 extends Lambda implements Function0<String> {
        public static final C09062 INSTANCE = ;

        C09062() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Exception occurred attempting to handle notification delete intent.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$handleNotificationOpened$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09071 extends Lambda implements Function0<String> {
        public static final C09071 INSTANCE = ;

        C09071() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not handling deep links automatically, skipping deep link handling";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$handleNotificationOpened$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09082 extends Lambda implements Function0<String> {
        public static final C09082 INSTANCE = ;

        C09082() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Exception occurred attempting to handle notification opened intent.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$handlePushStoryPageClicked$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09091 extends Lambda implements Function0<String> {
        final /* synthetic */ String $deepLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09091(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not handling deep links automatically, skipping deep link handling for '" + str + '\'';
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$handlePushStoryPageClicked$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09102 extends Lambda implements Function0<String> {
        public static final C09102 INSTANCE = ;

        C09102() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught exception while handling story click.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$isUninstallTrackingPush$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09111 extends Lambda implements Function0<String> {
        public static final C09111 INSTANCE = ;

        C09111() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to determine if push is uninstall tracking. Returning false.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$logBaiduNotificationClick$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09121 extends Lambda implements Function0<String> {
        public static final C09121 INSTANCE = ;

        C09121() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "customContentString was null. Doing nothing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$logBaiduNotificationClick$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09132 extends Lambda implements Function0<String> {
        public static final C09132 INSTANCE = ;

        C09132() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot log baidu click with null context. Doing nothing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$logBaiduNotificationClick$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09143 extends Lambda implements Function0<String> {
        final /* synthetic */ String $customContentString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09143(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught an exception processing customContentString: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$refreshFeatureFlagsIfAppropriate$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09151 extends Lambda implements Function0<String> {
        public static final C09151 INSTANCE = ;

        C09151() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Feature flag refresh key was true. Refreshing feature flags.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$refreshFeatureFlagsIfAppropriate$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09162 extends Lambda implements Function0<String> {
        public static final C09162 INSTANCE = ;

        C09162() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09171 extends Lambda implements Function0<String> {
        public static final C09171 INSTANCE = ;

        C09171() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Geofence sync key was true. Syncing geofences.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09182 extends Lambda implements Function0<String> {
        public static final C09182 INSTANCE = ;

        C09182() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Geofence sync key not included in push payload or false. Not syncing geofences.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09191 extends Lambda implements Function0<String> {
        public static final C09191 INSTANCE = ;

        C09191() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "routeUserWithNotificationOpenedIntent called with Intent";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09202 extends Lambda implements Function0<String> {
        public static final C09202 INSTANCE = ;

        C09202() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "routeUserWithNotificationOpenedIntent called with BrazePushEvent";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09213 extends Lambda implements Function0<String> {
        final /* synthetic */ String $deepLink;
        final /* synthetic */ boolean $useWebView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09213(String str, boolean z2) {
            super(0);
            str = str;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Found a deep link: " + str + ". Use webview set to: " + z;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function0<String> {
        final /* synthetic */ Intent $mainActivityIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Intent intent) {
            super(0);
            intent = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Push notification had no deep link. Opening main activity: " + intent;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$sendNotificationOpenedBroadcast$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09221 extends Lambda implements Function0<String> {
        public static final C09221 INSTANCE = ;

        C09221() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Sending notification opened broadcast";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$sendPushActionIntent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09231 extends Lambda implements Function0<String> {
        C09231() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Sending Braze broadcast receiver intent for " + brazeNotificationBroadcastType;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$sendPushActionIntent$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09242 extends Lambda implements Function0<String> {
        final /* synthetic */ Intent $pushIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09242(Intent intent) {
            super(0);
            intent = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Sending push action intent: " + intent;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$sendPushMessageReceivedBroadcast$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09251 extends Lambda implements Function0<String> {
        public static final C09251 INSTANCE = ;

        C09251() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Sending push message received broadcast";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setAccentColorIfPresentAndSupported$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09261 extends Lambda implements Function0<String> {
        public static final C09261 INSTANCE = ;

        C09261() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Using accent color for notification from extras bundle";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setCategoryIfPresentAndSupported$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09271 extends Lambda implements Function0<String> {
        public static final C09271 INSTANCE = ;

        C09271() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting category for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setCategoryIfPresentAndSupported$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09282 extends Lambda implements Function0<String> {
        public static final C09282 INSTANCE = ;

        C09282() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Category not present in notification extras. Not setting category for notification.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setContentIfPresent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09291 extends Lambda implements Function0<String> {
        public static final C09291 INSTANCE = ;

        C09291() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting content for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setContentIntentIfPresent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09301 extends Lambda implements Function0<String> {
        public static final C09301 INSTANCE = ;

        C09301() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error setting content intent.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setDeleteIntent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09311 extends Lambda implements Function0<String> {
        public static final C09311 INSTANCE = ;

        C09311() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error setting delete intent.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09321 extends Lambda implements Function0<String> {
        public static final C09321 INSTANCE = ;

        C09321() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Large icon not supported in story push.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09332 extends Lambda implements Function0<String> {
        public static final C09332 INSTANCE = ;

        C09332() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting large icon for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09344 extends Lambda implements Function0<String> {
        public static final C09344 INSTANCE = ;

        C09344() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09355 extends Lambda implements Function0<String> {
        public static final C09355 INSTANCE = ;

        C09355() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Large icon resource id not present for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$6 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function0<String> {
        public static final AnonymousClass6 INSTANCE = ;

        AnonymousClass6() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error setting large notification icon";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$7 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends Lambda implements Function0<String> {
        public static final AnonymousClass7 INSTANCE = ;

        AnonymousClass7() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Large icon not set for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setNotificationBadgeNumberIfPresent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09361 extends Lambda implements Function0<String> {
        public static final C09361 INSTANCE = new C09361();

        C09361() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification badge number not supported on this android version. Not setting badge number for notification.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setNotificationDurationAlarm$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09371 extends Lambda implements Function0<String> {
        final /* synthetic */ int $durationInMillis;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09371(int i2) {
            super(0);
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting Notification duration alarm for " + i + " ms";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setPriorityIfPresentAndSupported$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09381 extends Lambda implements Function0<String> {
        public static final C09381 INSTANCE = ;

        C09381() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting priority for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09391 extends Lambda implements Function0<String> {
        public static final C09391 INSTANCE = new C09391();

        C09391() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot set public version before Lollipop";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09402 extends Lambda implements Function0<String> {
        C09402() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting public version of notification with payload: " + brazeNotificationPayload;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setSetShowWhen$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09411 extends Lambda implements Function0<String> {
        public static final C09411 INSTANCE = ;

        C09411() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Set show when not supported in story push.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setSmallIcon$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09421 extends Lambda implements Function0<String> {
        public static final C09421 INSTANCE = ;

        C09421() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setSmallIcon$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09432 extends Lambda implements Function0<String> {
        public static final C09432 INSTANCE = ;

        C09432() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting small icon for notification via resource id";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setSoundIfPresentAndSupported$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09441 extends Lambda implements Function0<String> {
        public static final C09441 INSTANCE = ;

        C09441() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting default sound for notification.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setSoundIfPresentAndSupported$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09452 extends Lambda implements Function0<String> {
        public static final C09452 INSTANCE = ;

        C09452() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting sound for notification via uri.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setSummaryTextIfPresentAndSupported$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09461 extends Lambda implements Function0<String> {
        public static final C09461 INSTANCE = ;

        C09461() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting summary text for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setSummaryTextIfPresentAndSupported$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09472 extends Lambda implements Function0<String> {
        public static final C09472 INSTANCE = ;

        C09472() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Summary text not present. Not setting summary text for notification.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setTickerIfPresent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09481 extends Lambda implements Function0<String> {
        public static final C09481 INSTANCE = ;

        C09481() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting ticker for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setTitleIfPresent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09491 extends Lambda implements Function0<String> {
        public static final C09491 INSTANCE = ;

        C09491() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting title for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setVisibilityIfPresentAndSupported$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09501 extends Lambda implements Function0<String> {
        public static final C09501 INSTANCE = ;

        C09501() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Setting visibility for notification";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setVisibilityIfPresentAndSupported$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09512 extends Lambda implements Function0<String> {
        final /* synthetic */ Integer $visibility;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09512(Integer num) {
            super(0);
            num = num;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Received invalid notification visibility " + num;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09521 extends Lambda implements Function0<String> {
        public static final C09521 INSTANCE = ;

        C09521() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not waking this TV UI mode device";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09532 extends Lambda implements Function0<String> {
        public static final C09532 INSTANCE = ;

        C09532() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to check for TV status during screen wake. Continuing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09543 extends Lambda implements Function0<String> {
        public static final C09543 INSTANCE = ;

        C09543() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not waking screen on Android O+ device, could not find notification channel.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09554 extends Lambda implements Function0<String> {
        final /* synthetic */ NotificationChannel $notificationChannel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09554(NotificationChannel notificationChannel) {
            super(0);
            notificationChannel = notificationChannel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not acquiring wake-lock for Android O+ notification with importance: " + notificationChannel.getImportance();
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09565 extends Lambda implements Function0<String> {
        public static final C09565 INSTANCE = ;

        C09565() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Waking screen for notification";
        }
    }

    private BrazeNotificationUtils() {
    }

    @JvmStatic
    public static final void cancelNotification(Context context, int i2) {
        Intrinsics.checkNotNullParameter(context, hg.Vd("\u007f\u000b\t\u000e}\u0010\u000b", (short) (Od.Xd() ^ (-20131)), (short) (Od.Xd() ^ (-12919))));
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.cancelNotification.1
                final /* synthetic */ int $notificationId;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(int i22) {
                    super(0);
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cancelling notification action with id: " + i;
                }
            }, 7, (Object) null);
            Intent intent = new Intent(C1561oA.ud("?JG\u0007:I7O9\u000134D8=;y\u000e\u000b\u0017\u000b\f\u0012$\u0012\u0012\u0016\n\u0006\b\u0001}\u0010\u0004\t\u0007", (short) (Od.Xd() ^ (-25648)))).setClass(context, getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, C1561oA.yd("\u000e4;-7>r\u000f<<BD2@GGbw\tx\u0013~\u001a~禮-3)'+&%YOVV;ONQVdTb4^TgH~", (short) (OY.Xd() ^ 20856)));
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd("o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011Ka\u000f\u000f\u0016\b\u001c\u0019", (short) (C1607wl.Xd() ^ 31764))).getMethod(Xg.qd("ml|Yknwnut^r\u007fx", (short) (C1607wl.Xd() ^ 23220), (short) (C1607wl.Xd() ^ 7557)), new Class[0]);
            try {
                method.setAccessible(true);
                intent.setPackage((String) method.invoke(context, objArr));
                intent.putExtra(Jg.Wd("O\u001e\u0018", (short) (OY.Xd() ^ 28931), (short) (OY.Xd() ^ 19897)), i22);
                IntentUtils.addComponentAndSendBroadcast(context, intent);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) AnonymousClass2.INSTANCE, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.Companion.getCustomBrazeNotificationFactory();
        return customBrazeNotificationFactory == null ? BrazeNotificationFactory.Companion.getInstance() : customBrazeNotificationFactory;
    }

    @JvmStatic
    public static final int getNotificationId(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer customNotificationId = payload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.getNotificationId.1
                final /* synthetic */ Integer $customNotificationId;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C08951(Integer customNotificationId2) {
                    super(0);
                    num = customNotificationId2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Using notification id provided in the message's extras bundle: " + num;
                }
            }, 7, (Object) null);
            return customNotificationId2.intValue();
        }
        String titleText = payload.getTitleText();
        String str = titleText != null ? "" + titleText : "";
        String contentText = payload.getContentText();
        if (contentText != null) {
            str = str + contentText;
        }
        int iHashCode = str != null ? str.hashCode() : 0;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.getNotificationId.4
            final /* synthetic */ int $notificationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(int iHashCode2) {
                super(0);
                i = iHashCode2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Message without notification id provided in the extras bundle received. Using a hash of the message: " + i;
            }
        }, 7, (Object) null);
        return iHashCode2;
    }

    @JvmStatic
    public static final int getNotificationPriority(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer notificationPriorityInt = payload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = payload.getNotificationPriorityInt();
        if (notificationPriorityInt2 == null) {
            return 0;
        }
        int iIntValue = notificationPriorityInt2.intValue();
        if (-2 <= iIntValue && iIntValue < 3) {
            return iIntValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$getNotificationPriority$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Received invalid notification priority " + notificationPriorityInt;
            }
        }, 6, (Object) null);
        return 0;
    }

    @JvmStatic
    public static final Class<?> getNotificationReceiverClass() {
        return Constants.isAmazonDevice() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    @JvmStatic
    public static final String getOrCreateNotificationChannelId(BrazeNotificationPayload brazeNotificationPayload) throws Throwable {
        Object objInvoke;
        Intrinsics.checkNotNullParameter(brazeNotificationPayload, ZO.xd("Z]O&?<J", (short) (C1607wl.Xd() ^ 30404), (short) (C1607wl.Xd() ^ 27403)));
        String notificationChannelId = brazeNotificationPayload.getNotificationChannelId();
        Context context = brazeNotificationPayload.getContext();
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (context != null) {
            String strUd = C1626yg.Ud("h.l\u0016avg$u\b\u001am", (short) (C1607wl.Xd() ^ 19339), (short) (C1607wl.Xd() ^ 25174));
            short sXd = (short) (Od.Xd() ^ (-2827));
            int[] iArr = new int["D'nYOk\u000fx^[`@e`z\u0013j\u0005L6gG%".length()];
            QB qb = new QB("D'nYOk\u000fx^[`@e`z\u0013j\u0005L6gG%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Object[] objArr = {strUd};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("JGU3XQQAH->JM?89", (short) (ZN.Xd() ^ 6936)), Class.forName(EO.Od("u\"[`gZ%-HMj4`[n\u0010", (short) (C1580rY.Xd() ^ (-21802)))));
            try {
                method.setAccessible(true);
                objInvoke = method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            objInvoke = null;
        }
        Intrinsics.checkNotNull(objInvoke, C1593ug.zd("OWOP\u0005IHVWY_\fOS\u000fSReg\u0014ie\u0017fhh(jrjk u{si%gul{ytp;o\u007f\u0001?`\u0003\t~|\u0001{z\u000f\u0005\f\fk\u0001\u000f\u0003\n\t\u0017", (short) (OY.Xd() ^ 1703), (short) (OY.Xd() ^ 28951)));
        NotificationManager notificationManager = (NotificationManager) objInvoke;
        if (notificationChannelId != null) {
            if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.getOrCreateNotificationChannelId.1
                    final /* synthetic */ String $channelIdFromExtras;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C08961(String notificationChannelId2) {
                        super(0);
                        str = notificationChannelId2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Found notification channel in extras with id: " + str;
                    }
                }, 7, (Object) null);
                return notificationChannelId2;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.getOrCreateNotificationChannelId.2
                final /* synthetic */ String $channelIdFromExtras;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C08972(String notificationChannelId2) {
                    super(0);
                    str = notificationChannelId2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Notification channel from extras is invalid. No channel found with id: " + str;
                }
            }, 7, (Object) null);
        }
        String strOd = C1561oA.od("\u001e)&\u0017\u0018&%\u0016\"+\u0010\u0014\u0014\u0014\u000e!\u0017\u001e\b\u0016\u0016\u001a\u000e\n\f\u0005\u0002\u0014\b\r\u000bz}\u0002y\u0006\u0005z\u0001", (short) (Od.Xd() ^ (-4164)));
        if (notificationManager.getNotificationChannel(strOd) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) AnonymousClass3.INSTANCE, 7, (Object) null);
            NotificationChannel notificationChannel = new NotificationChannel(strOd, configurationProvider != null ? configurationProvider.getDefaultNotificationChannelName() : null, 3);
            notificationChannel.setDescription(configurationProvider != null ? configurationProvider.getDefaultNotificationChannelDescription() : null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return strOd;
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(str).setClass(context, NotificationTrampolineActivity.class);
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(action).setClass(…lineActivity::class.java)");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(context, get… pushActionIntent, flags)");
        return activity;
    }

    @JvmStatic
    public static final NotificationChannel getValidNotificationChannel(NotificationManager notificationManager, Bundle bundle) {
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        if (bundle == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C08981.INSTANCE, 7, (Object) null);
            return null;
        }
        String string = bundle.getString(Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY, null);
        String str = string;
        if (str != null && !StringsKt.isBlank(str)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.getValidNotificationChannel.2
                    final /* synthetic */ String $channelIdFromExtras;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C08992(String string2) {
                        super(0);
                        str = string2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Found notification channel in extras with id: " + str;
                    }
                }, 7, (Object) null);
                return notificationChannel;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.getValidNotificationChannel.3
                final /* synthetic */ String $channelIdFromExtras;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C09003(String string2) {
                    super(0);
                    str = string2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Notification channel from extras is invalid, no channel found with id: " + str;
                }
            }, 7, (Object) null);
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID);
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09014.INSTANCE, 7, (Object) null);
        return null;
    }

    @JvmStatic
    public static final void handleCancelNotificationAction(Context context, Intent intent) throws Throwable {
        String strKd = C1561oA.Kd("GC?", (short) (C1580rY.Xd() ^ (-1432)));
        Intrinsics.checkNotNullParameter(context, Wg.Zd("alfkWi`", (short) (C1499aX.Xd() ^ (-1965)), (short) (C1499aX.Xd() ^ (-28292))));
        Intrinsics.checkNotNullParameter(intent, C1561oA.Xd("06=/9@", (short) (C1499aX.Xd() ^ (-18327))));
        try {
            if (intent.hasExtra(strKd)) {
                int intExtra = intent.getIntExtra(strKd, -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.handleCancelNotificationAction.1
                    final /* synthetic */ int $notificationId;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C09021(int intExtra2) {
                        super(0);
                        i = intExtra2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Cancelling notification action with id: " + i;
                    }
                }, 7, (Object) null);
                short sXd = (short) (C1607wl.Xd() ^ 26746);
                int[] iArr = new int["UUYMIKDASGLJ".length()];
                QB qb = new QB("UUYMIKDASGLJ");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                Class<?> cls = Class.forName(Qg.kd("_k`mib\\%YdbgW_d\u001d1\\Z_Oa\\", (short) (C1607wl.Xd() ^ 23254), (short) (C1607wl.Xd() ^ 9057)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(hg.Vd("\u0005z\u000fxD\u0002u\u0002y?c\u0004\u0001vzr", (short) (C1607wl.Xd() ^ 16341), (short) (C1607wl.Xd() ^ 26441)));
                Object[] objArr = {str};
                Method method = cls.getMethod(C1561oA.ud("C@N,QJJ:A&7CF812", (short) (FB.Xd() ^ 10407)), clsArr);
                try {
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(context, objArr);
                    short sXd2 = (short) (C1580rY.Xd() ^ (-20428));
                    int[] iArr2 = new int["|\u0003|{*lmy\u0005\u0005\r7tv4v_pt\u001fnh\u001cius5uwmp##'!\u0015J\u000b\u001b\u0010)%\"\u001c`\u0013%$Lk\u0010\u0014\u0004\u007f\u0006~\b\u001a\u0012\u0017\u0011n\u0006\u0012/45A".length()];
                    QB qb2 = new QB("|\u0003|{*lmy\u0005\u0005\r7tv4v_pt\u001fnh\u001cius5uwmp##'!\u0015J\u000b\u001b\u0010)%\"\u001c`\u0013%$Lk\u0010\u0014\u0004\u007f\u0006~\b\u001a\u0012\u0017\u0011n\u0006\u0012/45A");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                        i3++;
                    }
                    Intrinsics.checkNotNull(objInvoke, new String(iArr2, 0, i3));
                    ((NotificationManager) objInvoke).cancel(C1561oA.Yd("=MNAOZAQSYOMQLK_U\\\\", (short) (Od.Xd() ^ (-23228))), intExtra2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) C09032.INSTANCE, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final void handleContentCardsSerializedCardIfPresent(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        String contentCardSyncData = payload.getContentCardSyncData();
        String contentCardSyncUserId = payload.getContentCardSyncUserId();
        Context context = payload.getContext();
        if (contentCardSyncData == null || context == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent.1
            final /* synthetic */ String $contentCardData;
            final /* synthetic */ String $contentCardDataUserId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C09041(String contentCardSyncUserId2, String contentCardSyncData2) {
                super(0);
                str = contentCardSyncUserId2;
                str = contentCardSyncData2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push contains associated Content Cards card. User id: " + str + " Card data: " + str;
            }
        }, 7, (Object) null);
        BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData2, contentCardSyncUserId2);
    }

    @JvmStatic
    public static final void handleNotificationDeleted(Context context, Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09051.INSTANCE, 7, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
            } else {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C09062.INSTANCE, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final void handleNotificationOpened(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Braze.Companion.getInstance(context).logPushNotificationOpened(intent);
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            sendNotificationOpenedBroadcast(context, intent);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) C09071.INSTANCE, 6, (Object) null);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C09082.INSTANCE, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final void handlePushStoryPageClicked(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Braze.Companion.getInstance(context).logPushStoryPageClicked(intent.getStringExtra(Constants.BRAZE_CAMPAIGN_ID), intent.getStringExtra(Constants.BRAZE_STORY_PAGE_ID));
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, 0);
            if (configurationProvider.getDoesPushStoryDismissOnClick() && intExtra != 0) {
                cancelNotification(context, intExtra);
            }
            String stringExtra = intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY);
            String str = stringExtra;
            if (str == null || StringsKt.isBlank(str)) {
                intent.removeExtra("uri");
            } else {
                intent.putExtra("uri", intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY));
                String stringExtra2 = intent.getStringExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY);
                String str2 = stringExtra2;
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    intent.putExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, stringExtra2);
                }
            }
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            sendNotificationOpenedBroadcast(context, intent);
            if (configurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.handlePushStoryPageClicked.1
                    final /* synthetic */ String $deepLink;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C09091(String stringExtra3) {
                        super(0);
                        str = stringExtra3;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Not handling deep links automatically, skipping deep link handling for '" + str + '\'';
                    }
                }, 6, (Object) null);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C09102.INSTANCE, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final boolean isBrazePushMessage(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return StringsKt.equals("true", extras.getString(Constants.BRAZE_PUSH_BRAZE_KEY), true);
    }

    @JvmStatic
    public static final boolean isNotificationMessage(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey("t") && extras.containsKey("a");
    }

    @Deprecated(message = "\u0013R\u00016\u0005yTlkLg\\b\u0016FSJ[\u001d0\u000bq\u000fS\u000bO}x>u=rwMh\n\u0016*qL;,<H%jM\u0006.LZ<hI= \u0013\u0007\u001dR.\u000b9\u0003v")
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isUninstallTrackingPush(Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
        try {
            if (notificationExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY)) {
                return true;
            }
            Bundle bundle = notificationExtras.getBundle("extra");
            if (bundle != null) {
                return bundle.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY);
            }
            return false;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C09111.INSTANCE, 4, (Object) null);
            return false;
        }
    }

    @JvmStatic
    public static final boolean isValidNotificationVisibility(int i2) {
        return i2 == -1 || i2 == 0 || i2 == 1;
    }

    @JvmStatic
    public static final void logBaiduNotificationClick(Context context, String str) {
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) C09121.INSTANCE, 6, (Object) null);
            return;
        }
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) C09132.INSTANCE, 6, (Object) null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optionalString = JsonUtils.getOptionalString(jSONObject, "source");
            String optionalString2 = JsonUtils.getOptionalString(jSONObject, "cid");
            if (optionalString == null || !Intrinsics.areEqual(optionalString, Constants.BRAZE) || optionalString2 == null) {
                return;
            }
            Braze.Companion.getInstance(context).logPushNotificationOpened(optionalString2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.logBaiduNotificationClick.3
                final /* synthetic */ String $customContentString;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C09143(String str2) {
                    super(0);
                    str = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Caught an exception processing customContentString: " + str;
                }
            }, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (context != null && payload.isPushStory() && payload.isNewlyReceivedPushStory()) {
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = pushStoryPages.iterator();
            while (it.hasNext()) {
                String bitmapUrl = ((BrazeNotificationPayload.PushStoryPage) it.next()).getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (final String str : arrayList) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$prefetchBitmapsIfNewlyReceivedStoryPush$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Pre-fetching bitmap at URL: " + str;
                    }
                }, 6, (Object) null);
                Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            payload.setNewlyReceivedPushStory(false);
        }
    }

    @JvmStatic
    public static final boolean refreshFeatureFlagsIfAppropriate(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldRefreshFeatureFlags() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) C09162.INSTANCE, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09151.INSTANCE, 7, (Object) null);
        BrazeInternal.refreshFeatureFlags(context);
        return true;
    }

    @JvmStatic
    public static final boolean requestGeofenceRefreshIfAppropriate(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldSyncGeofences() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09182.INSTANCE, 7, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09171.INSTANCE, 7, (Object) null);
        BrazeInternal.requestGeofenceRefresh(context, true);
        return true;
    }

    @JvmStatic
    public static final void routeUserWithNotificationOpenedIntent(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09191.INSTANCE, 7, (Object) null);
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString("cid", intent.getStringExtra("cid"));
        bundleExtra.putString("source", Constants.BRAZE);
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, bundleExtra, intent.getStringExtra("uri"), StringsKt.equals("true", intent.getStringExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY), true));
    }

    private final void routeUserWithNotificationOpenedIntent(Context context, Bundle bundle, String str, boolean z2) throws Exception {
        String str2 = str;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.routeUserWithNotificationOpenedIntent.3
                final /* synthetic */ String $deepLink;
                final /* synthetic */ boolean $useWebView;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C09213(String str3, boolean z22) {
                    super(0);
                    str = str3;
                    z = z22;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Found a deep link: " + str + ". Use webview set to: " + z;
                }
            }, 7, (Object) null);
            bundle.putString(Xg.qd("64,", (short) (C1580rY.Xd() ^ (-30604)), (short) (C1580rY.Xd() ^ (-9640))), str3);
            bundle.putBoolean(Jg.Wd("Z}\u001cTuh%APo'\u001cYo", (short) (FB.Xd() ^ 30587), (short) (FB.Xd() ^ 27163)), z22);
            UriAction uriActionCreateUriActionFromUrlString = BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(str3, bundle, z22, Channel.PUSH);
            if (uriActionCreateUriActionFromUrlString != null) {
                BrazeDeeplinkHandler.Companion.getInstance().gotoUri(context, uriActionCreateUriActionFromUrlString);
                return;
            }
            return;
        }
        Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, bundle);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.routeUserWithNotificationOpenedIntent.5
            final /* synthetic */ Intent $mainActivityIntent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(Intent mainActivityIntent2) {
                super(0);
                intent = mainActivityIntent2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push notification had no deep link. Opening main activity: " + intent;
            }
        }, 7, (Object) null);
        CX.ud();
        short sXd = (short) (OY.Xd() ^ 1265);
        short sXd2 = (short) (OY.Xd() ^ 27058);
        int[] iArr = new int["\u0013t+{\u000fH@\u0006FQHPtRVv|8\"7\tX\u0014".length()];
        QB qb = new QB("\u0013t+{\u000fH@\u0006FQHPtRVv|8\"7\tX\u0014");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = {mainActivityIntent2};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Ig.wd("^\ndjCj\u001dN\fmZ+a", (short) (C1607wl.Xd() ^ 2415)), Class.forName(C1626yg.Ud("x\n\rF\u0012\u0018u\u000bTl(PM1M%B\u00166z~k", (short) (C1607wl.Xd() ^ 1619), (short) (C1607wl.Xd() ^ 29477))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @JvmStatic
    public static final void routeUserWithNotificationOpenedIntent(Context context, BrazePushEvent brazePush) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazePush, "brazePush");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09202.INSTANCE, 7, (Object) null);
        Bundle brazeExtras = brazePush.getNotificationPayload().getBrazeExtras();
        brazeExtras.putString("cid", brazePush.getNotificationPayload().getCampaignId());
        brazeExtras.putString("source", Constants.BRAZE);
        String deeplink = brazePush.getNotificationPayload().getDeeplink();
        Boolean useWebView = brazePush.getNotificationPayload().getUseWebView();
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, brazeExtras, deeplink, useWebView != null ? useWebView.booleanValue() : false);
    }

    @JvmStatic
    public static final void sendNotificationOpenedBroadcast(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09221.INSTANCE, 7, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
        } else {
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
        }
    }

    private final void sendPushActionIntent(Context context, Intent intent, Bundle bundle) throws Throwable {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.sendPushActionIntent.2
            final /* synthetic */ Intent $pushIntent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C09242(Intent intent2) {
                super(0);
                intent = intent2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Sending push action intent: " + intent;
            }
        }, 6, (Object) null);
        if (bundle != null) {
            intent2.putExtras(bundle);
        }
        IntentUtils.addComponentAndSendBroadcast(context, intent2);
    }

    private final void sendPushActionIntent(Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) throws Throwable {
        Intent intent;
        int i2 = WhenMappings.$EnumSwitchMapping$0[brazeNotificationBroadcastType.ordinal()];
        String strOd = EO.Od("i-'\u0001z@foC\u0001\u0019\u00010$R:_k>\u000eWqbf쨙=b<6o\u0014$IpZUa\u00167+)B\n\u000eaw_5E<", (short) (Od.Xd() ^ (-26794)));
        if (i2 == 1) {
            Intent intent2 = new Intent(Wg.vd("\u007f\r\fMz\f{\u0016yC\u0007\r\u0004y@|\u001b\"\u0014\u001e\u001dWxzxnlpcbvlKK]NH>H@8", (short) (C1499aX.Xd() ^ (-28481))));
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("(4)62+%m\"-+0 (-ey%#(\u0018*%", (short) (C1580rY.Xd() ^ (-12157)), (short) (C1580rY.Xd() ^ (-11830)))).getMethod(hg.Vd("fcqL\\]dY^[CU`W", (short) (Od.Xd() ^ (-24399)), (short) (Od.Xd() ^ (-18497))), new Class[0]);
            try {
                method.setAccessible(true);
                intent = intent2.setPackage((String) method.invoke(context, objArr));
                Intrinsics.checkNotNullExpressionValue(intent, strOd);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else if (i2 == 2) {
            Intent intent3 = new Intent(C1561oA.Kd("\u0003\u0010\u000fP\u0006\u0017\u0007!\rV\u001a \u001f\u0015[\u0018\u001e%\u0017!(b\u0004\u0006\f\u0002\u007f\u0004~}\u0012\b\u000f\u000f!\u0015\t\b\u000b\u0010\u001e\u000e\u000e", (short) (OY.Xd() ^ 28394)));
            short sXd = (short) (C1607wl.Xd() ^ 11904);
            short sXd2 = (short) (C1607wl.Xd() ^ 2918);
            int[] iArr = new int["\f<*\u0014\u0005d]\r4^UG,\u0019\u000f.5\u0011\u0006mLE?".length()];
            QB qb = new QB("\f<*\u0014\u0005d]\r4^UG,\u0019\u000f.5\u0011\u0006mLE?");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i3)).getMethod(C1561oA.Xd(")(8\u0015'*3*10\u001a.;4", (short) (ZN.Xd() ^ 14533)), new Class[0]);
            try {
                method2.setAccessible(true);
                intent = intent3.setPackage((String) method2.invoke(context, objArr2));
                Intrinsics.checkNotNullExpressionValue(intent, strOd);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Intent intent4 = new Intent(C1561oA.Qd("\"-*i\u001d,\u001a2\u001cc%)&\u001a^\u0019\u001d\"\u0012\u001a\u001fWvvznjlebthmk{__e]k[Y", (short) (ZN.Xd() ^ 13141)));
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(C1593ug.zd("}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'", (short) (C1499aX.Xd() ^ (-15960)), (short) (C1499aX.Xd() ^ (-12646)))).getMethod(C1561oA.od("85C\u001e./6+0-\u0015'2)", (short) (C1607wl.Xd() ^ 20166)), new Class[0]);
            try {
                method3.setAccessible(true);
                intent = intent4.setPackage((String) method3.invoke(context, objArr3));
                Intrinsics.checkNotNullExpressionValue(intent, strOd);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.sendPushActionIntent.1
            C09231() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Sending Braze broadcast receiver intent for " + brazeNotificationBroadcastType;
            }
        }, 6, (Object) null);
        sendPushActionIntent(context, intent, bundle);
        if (brazeNotificationPayload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, brazeNotificationBroadcastType.getBrazePushEventType(), brazeNotificationPayload);
        }
    }

    static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i2, Object obj) throws Throwable {
        if ((i2 + 8) - (i2 | 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    @JvmStatic
    public static final void sendPushMessageReceivedBroadcast(Context context, Bundle notificationExtras, BrazeNotificationPayload payload) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09251.INSTANCE, 7, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, notificationExtras, payload);
    }

    @JvmStatic
    public static final void setAccentColorIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer accentColor = payload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09261.INSTANCE, 7, (Object) null);
            notificationBuilder.setColor(accentColor.intValue());
            return;
        }
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils$setAccentColorIfPresentAndSupported$2$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Using default accent color for notification";
                }
            }, 7, (Object) null);
            notificationBuilder.setColor(configurationProvider.getDefaultNotificationAccentColor());
        }
    }

    @JvmStatic
    public static final void setCategoryIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationCategory = payload.getNotificationCategory();
        if (notificationCategory == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09282.INSTANCE, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09271.INSTANCE, 7, (Object) null);
            notificationBuilder.setCategory(notificationCategory);
        }
    }

    @JvmStatic
    public static final void setContentIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09291.INSTANCE, 7, (Object) null);
        String contentText = payload.getContentText();
        if (contentText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.setContentText(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    @JvmStatic
    public static final void setContentIntentIfPresent(Context context, NotificationCompat.Builder notificationBuilder, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            notificationBuilder.setContentIntent(INSTANCE.getPushActionPendingIntent(context, Constants.BRAZE_PUSH_CLICKED_ACTION, bundle));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C09301.INSTANCE, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final void setDeleteIntent(Context context, NotificationCompat.Builder notificationBuilder, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            Intent intent = new Intent(Constants.BRAZE_PUSH_DELETED_ACTION).setClass(context, getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_P…otificationReceiverClass)");
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            notificationBuilder.setDeleteIntent(PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C09311.INSTANCE, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final boolean setLargeIconIfPresentAndSupported(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) throws Throwable {
        BrazeConfigurationProvider configurationProvider;
        BrazeNotificationUtils brazeNotificationUtils;
        String largeIcon;
        Intrinsics.checkNotNullParameter(builder, C1561oA.ud("@@D846/,>275\b:-/&&2", (short) (Od.Xd() ^ (-24431))));
        Intrinsics.checkNotNullParameter(brazeNotificationPayload, C1561oA.yd("\r~\u0014\b\bzz", (short) (Od.Xd() ^ (-6557))));
        if (brazeNotificationPayload.isPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09321.INSTANCE, 7, (Object) null);
            return false;
        }
        Context context = brazeNotificationPayload.getContext();
        if (context == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09332.INSTANCE, 7, (Object) null);
            largeIcon = brazeNotificationPayload.getLargeIcon();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) AnonymousClass6.INSTANCE, 4, (Object) null);
        }
        if (largeIcon != null) {
            builder.setLargeIcon(Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON));
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09344.INSTANCE, 7, (Object) null);
        int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
        if (largeNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09355.INSTANCE, 7, (Object) null);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) AnonymousClass7.INSTANCE, 7, (Object) null);
            return false;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("N\\Sb`[W\"Xeel^ho*@mmtfzw", (short) (FB.Xd() ^ 30657))).getMethod(Xg.qd("NM]<P_\\caSVe", (short) (ZN.Xd() ^ 18192), (short) (ZN.Xd() ^ 14482)), new Class[0]);
        try {
            method.setAccessible(true);
            builder.setLargeIcon(BitmapFactory.decodeResource((Resources) method.invoke(context, objArr), largeNotificationIconResourceId));
            return true;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @JvmStatic
    public static final void setNotificationBadgeNumberIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            notificationBuilder.setNumber(notificationBadgeNumber.intValue());
        }
    }

    @JvmStatic
    public static final void setNotificationDurationAlarm(Context context, Class<?> cls, int i2, int i3) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Jg.Wd("\u0017<_\u0006\u0013HD", (short) (C1580rY.Xd() ^ (-13679)), (short) (C1580rY.Xd() ^ (-27006))));
        Intent intent = new Intent(context, cls);
        intent.setAction(ZO.xd("AEAd'@=dP!Z)R@\u001cZIx%\u0002sY\u0005H.\u0004^Y\u001bRd\u000fNm\u0005n", (short) (FB.Xd() ^ 2976), (short) (FB.Xd() ^ 31506)));
        intent.putExtra(C1626yg.Ud("\u001bHl", (short) (OY.Xd() ^ 8703), (short) (OY.Xd() ^ 32345)), i2);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, (-1) - (((-1) - 134217728) & ((-1) - IntentUtils.getImmutablePendingIntentFlags())));
        Object[] objArr = {Ig.wd("\\\"Cq2", (short) (C1633zX.Xd() ^ (-28775)))};
        Method method = Class.forName(EO.Od("e#\rx'~\u0014^oML.n\u0004o\tC\u0010HDpA\u0019", (short) (C1607wl.Xd() ^ 28251))).getMethod(C1593ug.zd("?>N.UPRDM4GUZNIL", (short) (C1499aX.Xd() ^ (-28650)), (short) (C1499aX.Xd() ^ (-496))), Class.forName(C1561oA.Qd("\u0001v\u000bt@}q}u;_\u007f|rvn", (short) (C1499aX.Xd() ^ (-24483)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, C1561oA.od("W]SR\u0005GDPOOS}?Az=:KKuICr@@>{<B87i=A7+d%1&3/(\"j\u001d+*fx#\u0017'!\u007f\u0013\u001f\u0011\u0016\u0013\u001f", (short) (C1499aX.Xd() ^ (-20814))));
            AlarmManager alarmManager = (AlarmManager) objInvoke;
            if (i3 >= 1000) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.setNotificationDurationAlarm.1
                    final /* synthetic */ int $durationInMillis;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C09371(int i32) {
                        super(0);
                        i = i32;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Setting Notification duration alarm for " + i + " ms";
                    }
                }, 7, (Object) null);
                alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) i32), broadcast);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @JvmStatic
    public static final void setPriorityIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09381.INSTANCE, 7, (Object) null);
        notificationBuilder.setPriority(getNotificationPriority(payload));
    }

    @JvmStatic
    public static final void setPublicVersionIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) throws Throwable {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (context == null || payload.getPublicNotificationExtras() == null || configurationProvider == null) {
            return;
        }
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        String orCreateNotificationChannelId = getOrCreateNotificationChannelId(payload);
        Bundle jsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(payload.getPublicNotificationExtras());
        if (jsonObjectIntoBundle.isEmpty()) {
            return;
        }
        BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(jsonObjectIntoBundle, null, context, configurationProvider, 2, null);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, orCreateNotificationChannelId);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.setPublicVersionIfPresentAndSupported.2
            C09402() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Setting public version of notification with payload: " + brazeNotificationPayload;
            }
        }, 7, (Object) null);
        setContentIfPresent(builder, brazeNotificationPayload);
        setTitleIfPresent(builder, brazeNotificationPayload);
        setSummaryTextIfPresentAndSupported(builder, brazeNotificationPayload);
        setSmallIcon(configurationProvider, builder);
        setAccentColorIfPresentAndSupported(builder, brazeNotificationPayload);
        notificationBuilder.setPublicVersion(builder.build());
    }

    @JvmStatic
    public static final void setSetShowWhen(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.isPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09411.INSTANCE, 7, (Object) null);
            notificationBuilder.setShowWhen(false);
        }
    }

    @JvmStatic
    public static final int setSmallIcon(BrazeConfigurationProvider appConfigurationProvider, NotificationCompat.Builder notificationBuilder) throws Throwable {
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        int smallNotificationIconResourceId = appConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09421.INSTANCE, 7, (Object) null);
            smallNotificationIconResourceId = appConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09432.INSTANCE, 7, (Object) null);
        }
        notificationBuilder.setSmallIcon(smallNotificationIconResourceId);
        return smallNotificationIconResourceId;
    }

    @JvmStatic
    public static final void setSoundIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationSound = payload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (Intrinsics.areEqual(notificationSound, "d")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09441.INSTANCE, 7, (Object) null);
            notificationBuilder.setDefaults(1);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09452.INSTANCE, 7, (Object) null);
            notificationBuilder.setSound(Uri.parse(notificationSound));
        }
    }

    @JvmStatic
    public static final void setSummaryTextIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String summaryText = payload.getSummaryText();
        if (summaryText == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09472.INSTANCE, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09461.INSTANCE, 7, (Object) null);
            notificationBuilder.setSubText(summaryText);
        }
    }

    @JvmStatic
    public static final void setTickerIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09481.INSTANCE, 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null) {
            return;
        }
        notificationBuilder.setTicker(titleText);
    }

    @JvmStatic
    public static final void setTitleIfPresent(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09491.INSTANCE, 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.setContentTitle(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    @JvmStatic
    public static final void setVisibilityIfPresentAndSupported(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer notificationVisibility = payload.getNotificationVisibility();
        if (notificationVisibility != null) {
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            if (!isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.setVisibilityIfPresentAndSupported.2
                    final /* synthetic */ Integer $visibility;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C09512(Integer notificationVisibility2) {
                        super(0);
                        num = notificationVisibility2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Received invalid notification visibility " + num;
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09501.INSTANCE, 7, (Object) null);
                notificationBuilder.setVisibility(notificationVisibility2.intValue());
            }
        }
    }

    @JvmStatic
    public static final boolean wakeScreenIfAppropriate(Context context, BrazeConfigurationProvider configurationProvider, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(bundle, null, context, configurationProvider, 2, null));
    }

    @JvmStatic
    public static final boolean wakeScreenIfAppropriate(BrazeNotificationPayload brazeNotificationPayload) throws Throwable {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(brazeNotificationPayload, C1561oA.Kd("WIbVZMQ", (short) (FB.Xd() ^ 28416)));
        Context context = brazeNotificationPayload.getContext();
        if (context == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return false;
        }
        Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
        if (!PermissionUtils.hasPermission(context, Wg.Zd("\u00078N\u0007e\u0002%\u0011>S\u0003&\u00068Zra\u0003j8\u00026P\u000fd\b&P", (short) (C1499aX.Xd() ^ (-22863)), (short) (C1499aX.Xd() ^ (-18908)))) || !configurationProvider.isPushWakeScreenForNotificationEnabled()) {
            return false;
        }
        String strXd = C1561oA.Xd("'\u001c!$\u001a\u001c", (short) (Od.Xd() ^ (-32301)));
        short sXd = (short) (C1607wl.Xd() ^ 16105);
        int[] iArr = new int["SaXg]XT\u001fMZZaKU\\\u0017Errycwt".length()];
        QB qb = new QB("SaXg]XT\u001fMZZaKU\\\u0017Errycwt");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Qg.kd(")\u001f3\u001dh&\u001a&\u001ec\b(%\u001b\u001f\u0017", (short) (OY.Xd() ^ 32746), (short) (OY.Xd() ^ 18756)));
            Object[] objArr = {strXd};
            Method method = cls.getMethod(hg.Vd("C@N,QJJ:A&7CF812", (short) (ZN.Xd() ^ 32229), (short) (ZN.Xd() ^ 19823)), clsArr);
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                Intrinsics.checkNotNull(objInvoke, C1561oA.ud("\u000b\u0011\u0007\u00068zw\u0004\u0003\u0003\u00071rt.pm~~)|v&ssq/oukj\u001dptj^\u0018XdYfb[U\u001eP^]\u001a@S6WKK2EQCHEQ", (short) (OY.Xd() ^ 17570)));
                if (((UiModeManager) objInvoke).getCurrentModeType() == 4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09521.INSTANCE, 7, (Object) null);
                    return false;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) C09532.INSTANCE, 4, (Object) null);
        }
        Object[] objArr2 = {C1561oA.yd("\u001d\u001d!\u0015\u0011\u0013\f\t+\u001f$\"", (short) (C1499aX.Xd() ^ (-21589)))};
        Method method2 = Class.forName(C1561oA.Yd("z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cVl\u001a\u001a!\u0013'$", (short) (C1633zX.Xd() ^ (-24936)))).getMethod(Jg.Wd("(Y\\.K9/\u0017\u0013kpujXB?", (short) (C1607wl.Xd() ^ 25222), (short) (C1607wl.Xd() ^ 14028)), Class.forName(Xg.qd("\u0015\r#\u000f\\\u001c\u0012 \u001aa\b*)!'!", (short) (OY.Xd() ^ 25633), (short) (OY.Xd() ^ 14972))));
        try {
            method2.setAccessible(true);
            Object objInvoke2 = method2.invoke(context, objArr2);
            Intrinsics.checkNotNull(objInvoke2, ZO.xd("'w1u@'BGY6rw\u0007v\u0010P/rd\u0001F\u0015p-?mOf^L\u001e\u0004\u001eU\"+7;U}\u0011T\rR$,^Mr\u0007\u0005\u0013Q=i\u0019w`dn4F\\\u0001\u0013rh1", (short) (Od.Xd() ^ (-22780)), (short) (Od.Xd() ^ (-29261))));
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) objInvoke2, notificationExtras);
            if (validNotificationChannel == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09543.INSTANCE, 7, (Object) null);
                return false;
            }
            if (validNotificationChannel.getImportance() == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationUtils.wakeScreenIfAppropriate.4
                    final /* synthetic */ NotificationChannel $notificationChannel;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C09554(NotificationChannel validNotificationChannel2) {
                        super(0);
                        notificationChannel = validNotificationChannel2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Not acquiring wake-lock for Android O+ notification with importance: " + notificationChannel.getImportance();
                    }
                }, 7, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09565.INSTANCE, 7, (Object) null);
            String strUd = C1626yg.Ud("c5WS,", (short) (OY.Xd() ^ 9857), (short) (OY.Xd() ^ 25026));
            short sXd2 = (short) (C1580rY.Xd() ^ (-3784));
            int[] iArr2 = new int["p0T\u0006\"oBS:*+\u000f1@f\nFx/Y\fJ\u0018".length()];
            QB qb2 = new QB("p0T\u0006\"oBS:*+\u000f1@f\nFx/Y\fJ\u0018");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                i3++;
            }
            Object[] objArr3 = {strUd};
            Method method3 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Qd("41?\u001dB;;+2\u0017(47)\"#", (short) (C1580rY.Xd() ^ (-17149))), Class.forName(EO.Od("y\u001b\"tXde*N\u0019<;hYvM", (short) (C1633zX.Xd() ^ (-7410)))));
            try {
                method3.setAccessible(true);
                Object objInvoke3 = method3.invoke(context, objArr3);
                Intrinsics.checkNotNull(objInvoke3, C1593ug.zd("[c[\\\u0011UTbcek\u0018[_\u001b_^qs uq#rtt4v~vw,\u0002\b\u007fu1s\u0002x\b\u0006\u0001|G\n\u000fJm\u000e\u0017\u0006\u0014o\u0005\u0013\u0007\u000e\r\u001b", (short) (C1580rY.Xd() ^ (-17744)), (short) (C1580rY.Xd() ^ (-31110))));
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) objInvoke3).newWakeLock(268435482, TAG);
                wakeLockNewWakeLock.acquire();
                wakeLockNewWakeLock.release();
                return true;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
