package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.content.ContextCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Qg;
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
/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0015Wي`\u000b\\A71-\u0014z\u000bkp@8MoS:_a9\u001f|<9*[ҸuCIUۥ\u00024"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:2", "", "u(E", "\u0011`_Ah9>D\u001d}zh", "\u0011qT.g,\u001d]\u0017\u000f\u0003^5\f", "\u0015dc\u0010b5MS\"\u000e", "\u0015dc\u001ah3MW$\u0006z<6\u0006\u0018/n\u000f6", "\u001doT;76<c!~\u0004m", "\u001doT;76<c!~\u0004m\u001b\n\t/", "\u001doT;@<Eb\u001d\n\u0002^\u000b\u0007\u0007?m\u007f1\u000bN", "\u001ehR866Gb\u0015|\n", "\u001ehR8@<Eb\u001d\n\u0002^\u001d\u0001\u0017?a\u0007\u0010{?\u0005\u0013", "\u001ehR8I0Lc\u0015\u0006b^+\u0001\u0005", " d`BX:M;)\u0006\nb7\u0004\t\u001ae\r0\u007fN\u000f\u001b!P}", " d`BX:M>\u0019\f\u0003b:\u000b\r9n", "!sP?g\b<b\u001d\u0010~m@]\u0013<R\u007f6\fG\u0010", "!sP?g\u0010Gb\u0019\b\nL,\u0006\b/r`2\t-\u0001%'N~", "\"`Z2C0<b)\fz", "\"`Z2C0<b)\fzI9|\u001a3e\u0012", "\"`Z2I0=S#", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ActivityResultContracts {
    private ActivityResultContracts() {
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?1LeV4ZS0\u0010\u0002ڔR/\f0\u0002EKUH}2\u000b_N\u0016h\u001dI\u0013\nNO\tȀ|j:K\u001e\u000fk\u0015'2poo7[sU9\u000fyf\t.8:8(\u0005G.r`\u001e}\u0013Cy\rB4NxRR;V5  \u0010V\"\u0017\u001d\u000bg\u0015JՈpi"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b@\u00029!!6\f]/\u001e\thU\u0005xQ$\u001f\u0016<P\u0011\u0011", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR\u0011", "u(E", "1qT.g,\"\\(~\u0004m", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "\u0011n\\=T5B]\"", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Intent input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return input;
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b@\u00029!!6\f]/\u001e\thU\u0005xQ$\u001f\u0016<P\u0011yF\u000b\u0014!\n>nzK,", "", "u(E", "\u0013WC\u001f4&\u001a1\bbkB\u001bp\u0003\u0019Pn\fe)n\u0011s7Xl#V", "", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XT2\u000fy\u0002<$a%\bّYaJ\n2\u000b_N\u0016g~Lj\u000bq\u00104\u00151i8\nXޯa\u0012\u001d4\u000b\u0006M6eok=\u0011xD\n82P>*\t\u000f!BH>vAW\u0014$ 8XphS=Q\u0013#*\u0006l*1$jrf8^k\f>u7ɮmO"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b@\u00029!!>\u0017]+\u0016\u0014GA-mDD\u007f\u001296\u0002Ix\b\u001bk", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9qE\u0006%>hk @l\u0016;:CG{4,$>", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9i:\u0006)F]\r4$m$>TR\u0011", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "\u0011n\\=T5B]\"", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b@\u00029!!>\u0017]+\u0016\u0014GA-mDD\u007f\u001296\u0002Ix\b\u001bTk?r{>_\u0014Q\u0003j", "", "u(E", "\u000fBC\u0016B\u001587\u0002mZG\u001bvv\u000fN^\bh:mv\u00037O{+", "", "\u0013WC\u001f4&\"<\b^cM&jh\u0018D_\u0015u-`\u0003\u0007']|", "\u0013WC\u001f4&,3\u0002]tB\u0015kh\u0018Ty\bn\u001e`\u0002\u0006+Yv", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, IntentSenderRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u0003\u0013I\u0006>\u00176B\rD4\u0012\u0006\u0010njO0LeN.ZS@\u000fsڔ<$q$yCAV\"}8\tWNmhvJh\u0011K\u000f\f\u0017\u000f̓J\\\u0006\u001cm\u001a\u001f8RqO3{pk9p\bF\u00160428(\u0006\u0011!:M>yټGK\u0012\u0016^B\u001f9\u000b\f`E\u001dŪ\n>.\u0006f}uTNH\u001bdj31\u000b\u0002B|0\u0010:\u000bW%Ld)\u001dv\u0010\u001fY@}Iչ)S\u0011\u0012\u001b\u0011M\u000fW\u0006M\u0013x37-Ys\u00067h\u0002$\u0015YR;_\t%\u000b\u0012\u0002d\u001a/CO\u0012T\u0001\u00186\u0002\u0013\u0002\u001d>\u0014\u000e4(v.s.Ǵ\f\u000eA\u0003;wN_\u001ajR\u0002\u000bad\u00185\u0002C+g\u001e\u0015S\u0012?'^O{3\u001eN)\u000f\u00019]j\r\u000f\u001cahɖUE"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b?rI$\u0012h\u001d6;\u0014\u0014]L+n/7,\u00100W\u0010?r\n\u001ak", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "", "", "", "", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VE\u0004#{!FUG'3v\u0018w;RHo= j,H5\u0010b9Xz&\u0011JX5kR{L]uc\u001dN4\u001cZ", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VE\u0004#{!FUG'3v\u0018w;RHo= j,H5\u0010b9Xz&Z\u0016J*kV\u0004A#&$\u001bN9\u001d\fh\u000b\"xMF,\u0004*XK\u0017f\u0010\u0010'\u0012D~]Bd N\tr\u007fJ8uBWn85UN`-q\u0016h'lH'$\"\u0002 *>", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "\u0011n\\=T5B]\"", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {
        public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u000e\u0007nʑA0RtP.XT0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\u0003|Or\u000bq\u00156 \u0007qDOezm\u0012=4pw\u0006\u074cޜs??i\u0003@U,@#Py3\u0003pݙ\u001bǘzzKŷ\\\u001e>C\t:\u0001\u000f$įlŪ\n>(ҵnhuRNH\u001b_\u0011ǉuɨmBVϋۨ4\b"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b?rI$\u0012h\u001d6;\u0014\u0014]L+n/7,\u00100W\u0010?r\n\u001aTk?r{>_\u0014Q\u0003j", "", "u(E", "\u000fBC\u0016B\u00158@xjj>\u001ak\u0003\u001aEl\u0010_.nz\u00010]", "", "\u0013WC\u001f4&)3\u0006f^L\u001a`r\u0018S", "\u0013WC\u001f4&)3\u0006f^L\u001a`r\u0018_a\u0015W)o\u0011\u0004']}#e\u0013", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "7m_Bg", "", "1qT.g,\"\\(~\u0004mjx\u0007>i\u0011,\u000bTz$\u0017No\nJv", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004g\u0013 F|\u0018@un3c\u0007/7v%w1LJk=-j", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Intent createIntent$activity_release(String[] input) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intentPutExtra = new Intent(RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(RequestMultiplePermissions.EXTRA_PERMISSIONS, input);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return Companion.createIntent$activity_release(input);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(Context context, String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (input.length == 0) {
                return new ActivityResultContract.SynchronousResult<>(MapsKt.emptyMap());
            }
            for (String str : input) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(input.length), 16));
            for (String str2 : input) {
                Pair pair = TuplesKt.to(str2, true);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Map<String, Boolean> parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                return MapsKt.emptyMap();
            }
            if (intent == null) {
                return MapsKt.emptyMap();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
            int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return MapsKt.emptyMap();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i3 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i3 == 0));
            }
            return MapsKt.toMap(CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList));
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u0003\u0010I\u0006>\u00146B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a$yCI[\"}(\neȞ\u0018s~Lj\u000bq\u000f\u0016\u0018\tjZJ\u0004w\u001e\u0015Ƥ6B}A{c}@Q`#:5$@'Py3\u0007J.V\u0017\u000fzqKR&x^~Bj\u0015]\u0007*\u00124?6\u007fLe\u0018RDM\u0005]h5S\u0007wIf'\u000e0CaUcb1%v\u0010\u001f[DE@-%\u0002\u000f7XiL\u001bA\b<3lm;ȅMseDނ\u0004#"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b?rI$\u0012h\u001d9+\u001a\r]O2rN@t", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "", "", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "uH;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq_I\u0010\u0017 VEQ#{!FUG'3v\u0018w*MEr4\u001a\u001e>", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return RequestMultiplePermissions.Companion.createIntent$activity_release(new String[]{input});
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Boolean parseResult(int i2, Intent intent) {
            boolean z2 = false;
            if (intent == null || i2 != -1) {
                return false;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (intArrayExtra[i3] == 0) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
            }
            return Boolean.valueOf(z2);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (ContextCompat.checkSelfPermission(context, input) == 0) {
                return new ActivityResultContract.SynchronousResult<>(true);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a$yCI[\"}(\tUb}˧\u001fZj\u000fS\u0011\u001c\u0015'j<Mezs\u0011=3pn\u007f6ޜs=Gb=N\u0013#J\"f}5\u0005(/`\u0010%\u0001sQ\u001a\u0019HB\u00079\u0001\r\u0014\u001ab2\u0014F8\u000b.`wPLG\u001b^P.Q\f\u001aF\\,w0+S=Lb.%xw\u001dY@\u007fM#/k\u0005\u001dQ\n@3C\u007fH\u001dhU3[O\u0002dNZ\u0016\u0013C/̦\u0011k"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001bAnC\u0014|^\f];\u001a\u0005DN$\u007fH71]", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Void r3) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Void r4) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Bitmap parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u00146B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a$yCI[\"}(\nUb}˧\u001fVj\rS\u000f4\u0016\tl<I\u0004y\f\u0011O5Բs?AO8SGc\r63$b&F~\u001d\u0001H0x\u0014\u0005\u0002[K:\u0012vU9V`\u0015e\r*\u0014\u0016>N\u00024[\u0016WfLzbR/Q\t\u001aF\\.w0+MUab1%v\u0010\u001f[DE@-%\u0002\u000f7XiL\u001bA\b<3lҊ++W\u0002ɷ:g"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001bAnC\u0014|^\f];\u001a\u0005/", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001a`]1e6BRb\bzmul\u00163;", "", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "uH;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq_I\u0010\u0017 VEQ#{!FUG'3v\u0018w*MEr4\u001a\u001e>", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Boolean parseResult(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a$yCI[\"}(\tUc}˧\u001fXj\rS\u000f4\u0016\tn<Kkw\f\u0013=1\u0003rУ7M}?\u0002v\u00039\u001d `&h}\u0013\u00062*v\u0016'~QR$\u0012^@7O\u001b+[\r2\u001c\u0016B0\u00034[\u0016OLG\u001bfj31\b\u0002B|-\u00104\u000bT%F\u0003'U\u000fo(CBM4C&\u0004\u0007\u0015]s?1K\"C\u0013u?)AH\"[͕\\\u000e"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001bAnC\u0014\u0003^\rN5b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001a`]1e6BRb\bzmul\u00163;", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Deprecated(message = "\u0017N\u0001t\u0006|*dZU)\u0004\\T.WpY\n7Dq\u001f\u0012\tG\u0001oZ\u000ecxm`yT[alxG,7y\u001bi\f\b1l\b<%EC!\u0010\u0007'M\"\u00055\u000e2 ~v P\u0012\u0001o/\u0011\nM9~:\u0001mgpjw@g$s\u000e_\n*IO<\b\u001f\u001a\u001axi\u00133^?:y\u0010\u00182MT\u0016p`4\u001fTLEt:l?1?\b\u0005?x\u0001*I[%I\u00145\u007fw\u00184\t\u007fR)h]i\u0001^tr3\u0002wl\u0011y5mq\\u\tm\\Ri")
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Bitmap parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u00146B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a$yCI[\"}(\nUb}˧\u001fVj\rS\u000f4\u0016\tl<I\u0004y\f\u0011O5Բs?AO8SGc\r63$b&F~\u001d\u0001H0x\u0014\u0005\u0002[K:\u0012vU9V`\u0015e\r*\u0014\u0016>N\u00024[\u0016WfLzbR/Q\t\u001aF\\.w0+MUab1%v\u0010\u001f[DE@-%\u0002\u000f7XiL\u001bA\b<3lҊ++W\u0002ɷ:g"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b0nH#\"g\u000e?/\f\u0005c\u0017", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001a`]1e6BRb\bzmul\u00163;", "", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "uH;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq_I\u0010\u0017 VEQ#{!FUG'3v\u0018w*MEr4\u001a\u001e>", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Boolean parseResult(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XT2\u000fy\u0002<$a$\bّke*\u00022\u000beM\u0016g~Nj\rY\u000e4\u0017'ilLǤ|] \u0011zZ}BKM\u001eAid\u0003;\u001d `(h\u007f\u0013\b2,^\u000f%z\n_T,>H\t<h\f{\u0006J\u0016\u0014G8\u0001Lf\u0018TDS\u0005_P.Q\u00070VĠ+k"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001aod\u0017]'\u000b\u0014/", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "\u001a`]1e6BRb\bzmul\u00163;", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Void r4) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u0003\u0010I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a$yCI[\"}(\tUb}˧\u001fXj\rS\u000f4\u0016\tn<Kkw\f\u0013=1\u0003rУ7M}?\u0002v\u00039\u001d `&h}\u0013\u00062*v\u0016'~QR$\u0012^@7O\u001b+[\r2\u001c\u0016B0\u00034[\u0016OLG\u001bfj31\b\u0002B|-\u00104\u000bT%F\u0003'U\u000fo(CBM4C&\u0004\u0007\u0015]s?1K\"C\u0013u?)AH\"[͕\\\u000e"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b4rLq\u001cc\u001dN4\u001cZ", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "", "\u001a`]1e6BRb\bzmul\u00163;", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u0003\u0010I\u0006>)6B\u0015\"4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000f\u0002{<$a$yCQU\"}(\tWNumvJ`\fI$\u001cǝ\u0017z\\`ezm\u0012=2R|O>]vM>\u000fvȥ\t 8%fz3\u007fR)XPyټGK\u001a\u0016xV~?j\r{\u000bJ\u0016\u0014E8\u0001Ld\u0018RDQ\u0005]h/i\u00182d\\1w>\rU\u001dLd)\u001dv\u0010 YAM4C0\u0004\u0007\u0015Ys?1G\"A\u0013q?'YI<sDd\u0018\u001a%-_\r\ftT]5Un\u0019?+}q{V\u001c7\u0010|\u0012\fj\nأ\n8"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b4rL{\"a\u001dR6\u0014\u00057K-}D@.\u0016\u0002", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "", "", "\u001a`]1e6BRb\bzmul\u00163;", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "\u0011n\\=T5B]\"", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {
        public static final Companion Companion = new Companion(null);

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i2, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i2 != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = Companion.getClipDataUris$activity_release(intent)) == null) ? CollectionsKt.emptyList() : clipDataUris$activity_release;
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>)6B\u0015\"4\u0012\u000e\u0007nj?0J͞IDɟ\u0004*=j<9*[ҸuCIUb\u00130\ngTwi~J\t\u000eq\u0011.\u0016'nrկǤ|]\u0018\u0014̙Fu"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b4rL{\"a\u001dR6\u0014\u00057K-}D@.\u0016j'\fCs|\u0015\u001a\u0018>@", "", "u(E", "5dc\u0010_0I2\u0015\u000evN9\u0001\u0017", "", "\u001a`]1e6BRb\bzmul\u00163;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "5dc\u0010_0I2\u0015\u000evN9\u0001\u0017ma}7\u007fQ\u0005&+A|\u000eCv!CY", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final List<Uri> getClipDataUris$activity_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u0003\u0013I\u0006>\u00176B\u0015\"4\u0012}\u0007njO0L͜P.hS2\u000fq|<$q$yCAV\"}0\u000fWNmgt_pŏs#\u0016\u001e\tp<Kex\f\u0013=2RsO5cnk;\u000fsv\bڶ6\"F|M\"(.`\u0010%\u007fsO\u001a\u0018H@\u001fA\u0003\u0017[\r2\u0018\u0016@0\u0001L]\u0016N|]ǰa:=,K\u0013PX?i@\u0001]\u000f\\SU\u000f\r`L6p;C\u001b=S1\u000e\u0003eM\u000bWwM\u0007x'U,wsɱ:X\u000e ]C]\u001aut<[3S\u0011\u001059gcy_>.\u0006\u000b\u0014\u000fR\u0003<\u000bϒL?"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b<}=\u001dpd\f^3\r\u000eh\u0017", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "", "", "\u001a`]1e6BRb\bzmul\u00163;", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VE\u0004#{!FUG'3v\u0018w;RHo= j,H5\u0010b9Xz&\u0011JX5kR{L]uc\u001dN4\u001cZ", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VE\u0004#{!FUG'3v\u0018w;RHo= j,H5\u0010b9Xz&Z\u0016J*kV\u0004A#&$\u001bN9\u001d\fh\u000b\"xMF,\u0004*XK\u0017f\u0010\u0010'\u0012D~]Bd N\tr\u007fJ8uBWn85UN`-q\u0016h'lH'$\"\u0002 *>", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u0003\u0013I\u0006>\u00176B\r@4\u0012\u000e\u0007njO0LeN.ZS@\u000fsڔ<$q$yCAV\"}8\tWNmhvJh\u0011K\u000f\f\u0016~\u007fBկ\u0006\u0016m\u001a\u001f8RqO3{pk9p\u0002F\u0010092=(\bв\u001e*N\u0014%|qJL\u0015ضDpHWUn\u0013 *\u0006l'1\"jof6vu\u000eD=-\u001boRP7_^}{\r\riܮ\u0011vo)smEA-3c\u000b\u0017XkA\u0013? @3j=&YV$[D`\u0018\u0014C4\u007f\u0017k|>b\u0015Sp\fU,}cׂT\u000e6\u0006C\u0018\u001bK\u001c\u0014\u0016)X.[\u001d\u0015\n>7\u0003\u0003k@~\u0013\u000fH\u000e\ry8-$.:ڨ=."}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b<}=\u001dyj\u0015]/\u0018\fY .lT?\u001f\u0011;WW", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "", "", "", "\u001a`]1e6BRb\bzmul\u00163;", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VE\u0004#{!FUG'3v\u0018w;RHo= j,H5\u0010b9Xz&\u0011JX5kR{L]uc\u001dN4\u001cZ", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VE\u0004#{!FUG'3v\u0018w;RHo= j,H5\u0010b9Xz&Z\u0016J*kV\u0004A#&$\u001bN9\u001d\fh\u000b\"xMF,\u0004*XK\u0017f\u0010\u0010'\u0012D~]Bd N\tr\u007fJ8uBWn85UN`-q\u0016h'lH'$\"\u0002 *>", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i2, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i2 != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? CollectionsKt.emptyList() : clipDataUris$activity_release;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq{<$i*yCAU \u00138ޛ\u007f^wk~Lp\nq\u000f\u0016\u001a\tlBH\u0004x\f\u0011O5Բs?AN8UGb\r63#b&F}\u001d\u0001H/x\u0016\u0005\u0001[M\"\u0011^@7O\u001b-[\f2\u001c\u0016B0\u00034[\u0016NLG\u001bej31\u0007\u0002B|,\u00106\u000bS%Hj&;v*69IO7+$\u0002\u00037ViI\u001b? H5n53CK\nVd[ą\u0018\""}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b<}=\u001dpd\f^3\r\u000eh01nD\r", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001a`]1e6BRb\bzmul\u00163;", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u0003\u0010I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a$yCI[\"}(\tUc}˧\u001fXj\rS\u000f4\u0016\tn<Kkw\f\u0013=1\u0003tEHޜs=Gb5A\u0015$@%Py3\u0001ʀ.H\u001ezCYY\u0011*0nvjV\u001bT\u001d\u001a@\u000en$\u000f'tg|6\u000f\u0002&X=-\u001bsRR7aF{{\u000e\\SU\u0018'e,2X7c\u001dUW\u0011\u0010j[m\u0003\b\nK\u0011\u0001)=*wt\b:f\r,\u0015Y]=c\u00015t\u0007g_:-{[qNh\u000eVwQԋ\u000fʀ\b\u000e\u000eΩχ2="}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b0\u007f=\u0010!ZlX)\u001d\rYJ3D", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "", "\u001a`]1e6BRb\bzmul\u00163;", "u(E", ";h\\2G@IS", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class CreateDocument extends ActivityResultContract<String, Uri> {
        private final String mimeType;

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        public CreateDocument(String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.mimeType = mimeType;
        }

        @Deprecated(message = "\u0018Y\u0005Cx4\u0016\u0017oP4~S\u0016>R\u001cY\u00124\n( k\u0007K.\u0002W\t,&K^iCaaLHI3@? j\f\u00035\u0018VJy}F\u0017\u000fV!Q \u00058\u0007vKpJ[T\u0012;_4\r|S#~\u000fI3g2h\u0004J`\u001d\u0003\u0005#5*E\u001e*\u000b$#\u0012xa\u0018_%GCj:\u001c>U@dpT@*b\u0007qW3sG\u001d\u0001\tOnw{\u001dG`]#^6\u0003=<a\u0006\u0004I]=\u0014xu\naym!\u0002q\u001aqWBpS\"wwia0Y{L-i:^tM8 \u0001EIW'n\u000b!=\r#\u0018ueHl\u0006X/3=`9S}?\u000e$Di-L\tQ\u0001I\u0005\u0018y6E( /n\u000e\bHv\u0014\u0019Jc,\b\u0015!U|]&a\"b2+", replaceWith = @ReplaceWith(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        @InterfaceC1492Gx
        public CreateDocument() {
            this("*/*");
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<$a$yCI[\"}(\u000fUc}˧\rX\u000b\u0019S\u0011\u0016\u0016'j<Mezs\u0011=3pnw7[~MJr\bv\bڶ6\"F{M\u0017(-`\u0010%~sO\u001a\u0017H@\u001f@\u0003\u0011[\f2\u00124>f\u0016fzuVNR|aJ19\u0002\u0018Cd&\u000e9-Q\u001bKl';|\u0012\"9GO5C%\u001c\u001b\u0015\\sA\u0019> >5l52CI\"cf^\u000e!--e\f\fv͏`\u0019"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u001a", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9x@t+&]\f03t}.LG7X4*%hoH\\", "\u001a`]1e6BRb\bzmul\u00163;", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "\u0011n\\=T5B]\"", "\u0017lP4X\bGR\n\u0003y^6", "\u0017lP4X\u0016GZ-", "!h]4_,&W!~ir7|", "$hS2b\u0016GZ-", "$hbBT3&S\u0018\u0003vM@\b\t", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {
        public static final String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        public static final String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";
        public static final String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑ?%Z͜x.\u0001Rն\u000em{5&^ԎpّТU\u001e\u0006$\u000fn|f̐rNӚ\u000fB"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003(#\u0016<E\t#h\u007f\u0010\u0012|Iup\u0018", "", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003\u001b'\u0004.I]Dgq\u0010\u0015\u000e?@", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003\u001b'\u0004.IkDo\u0015a", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003%#\u0011.P\u0002#l\t\f\u0005\"@jF", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003(#\u0007,SkDo\u0015a", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public interface VisualMediaType {
        }

        @Deprecated(message = "\u0017N\u0005H1\u0002\u001ak`V,:Y(kRa\\\u001b,\bi Wz\u0006wx\u000ez%|w^$QS\u001cqL6&BN!FU|-]Z\u001c{?=\u001e\rI IbyC\u0010\u0007\u0011\bKd\u000b\u0012\u000b\u001d5\u001d\fX\u001fQ\u000f\u0001B06\u0013\u007fDV's\u000e_\u00064S&/\u0003 \u0019J;kQ5/B8y{\u00192Fziv^E!\\x3~5s", replaceWith = @ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public static final boolean isPhotoPickerAvailable() {
            return Companion.isPhotoPickerAvailable();
        }

        @JvmStatic
        public static final boolean isPhotoPickerAvailable(Context context) {
            return Companion.isPhotoPickerAvailable(context);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, PickVisualMediaRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005&4\u0012\u000e\u0007nʑA0ZeP.XV2\u000f\u0002{<$a$yCI^\"}(\u000eUȥh}ñzZ9BO\u000b\u001cx̶0Icx&'\u001d:ZqU2{xm=n~N\u0005N=h7ѩ\t\u0001 6\u0011%\u0005\b[M\"\u0011^I!>`\u0017e\u0005H\u001dL=ŋ\u0005\u001ebu\u0017KV{u<E\"1krR5oH|{\u001e\rÖܮ\u0011vg0sSEH-%\u0002\u00177ViI\u001b? HKgҊ++O\t <f\u0016,\u0015YcSb;4j\u001bi`:;[SqUh\u000eV\u0003A\u0001UO\u0012%\u001e'vB]\u001et\u0012&3#}\u001a?г\u0006^H\u0018ClD0=\u007fa?\u007f\u001aƻUaA3\u001fI\n\u0006%\u001eQ\u0003EĖ.ڍ\u0012f\u001dÑdyW4_@\u000eZ\\\u000eq=\u001c\u0006GîTò\b6Oĉ?}\u00173%%\bgG)9k0J\u001bϚIݶdh[֟#TN)\u0007\u0016e,_Ȳ-ֈh\u0005s¬Ԣ\\G"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003\u0015)\u00107E\u000b?r\na", "", "u(E", "\u000fBC\u0016B\u00158A\rli>\u0014vi\u000bLf\u0005W\u001ef\u0011\u0002+Ms6Z\r\u0011;]\u000e", "", "5dc\u000e6\u001b\"=\u0002xhR\u001akh\u0017_`\u0004b']rt-ix T\u000b/=e{\u0019M\u0004lILDuC\u001a$lkB\u0015", "\u0013WC\u001f4&,G\u0007mZF&]d\u0016L\\\u0004Y&z\u0002z%U\b ^\u0001\u00179k\u001a\u001fI\t", "5dc\u0012K\u001b+/\u0013lnL\u001b\\p)F[\u000fb\u001d\\t|AZq\u001a\\\u001f\u0019AY\u0002\u0017[\u0010\u0016)6yg='\u001fw]H\u000bm5\\", "\u0015LB,4\n-7\u0003gtI\u0010Zn)Ig\u0004] n", "\u0015LB,8\u001f-@txeB\nb\u0003\u0013M[\n[.z~r:", "5dc\u0014`:)W\u0017\u0005zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\u000b0E-\u0001%!N\u0001\u000e \u007f&?/", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0014`:)W\u0017\u0005zkjx\u0007>i\u0011,\u000bTz$\u0017No\nJv", "5dc l:MS!_ve3y\u0005-kj,yF\u0001$", "5dc l:MS!_ve3y\u0005-kj,yF\u0001$UCm\u001d@\b)Dmw-7t\u0016*[C", "5dc#\\:NO f~f,k\u001d:e", "7m_Bg", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003(#\u0016<E\t#h\u007f\u0010\u0012|Iup\u0018", "5dc#\\:NO f~f,k\u001d:e>$yO\u0005(\u001bV\u0004\bIv,5U\f ", "7r6:f\u0017BQ\u001f~\b:=x\r6a|/{", "", "7r6:f\u0017BQ\u001f~\b:=x\r6a|/{~|\u0015&K\u0001\u0012K\u000b\u001fBY\u0005 3{\u0016", "7r?5b;H>\u001d|\u0001^9X\u001a+i\u0007$xG\u0001", "7rBFf;>[yz\u0002e)x\u00075P\u0004&\u0002@\u000er(Cs\u00158s,5", "7rBFf;>[yz\u0002e)x\u00075P\u0004&\u0002@\u000er(Cs\u00158s,5\u0018y\u001eFq'2\\W5x4%\u0015do9", "7rBFf;>[\u0004\u0003xd,\nd@a\u0004/w=\b\u0017", "7rBFf;>[\u0004\u0003xd,\nd@a\u0004/w=\b\u0017UCm\u001d@\b)Dmw-7t\u0016*[C", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
            }

            private Companion() {
            }

            @Deprecated(message = "\u0017N\u0005H1\u0002\u001ak`V,:Y(kRa\\\u001b,\bi Wz\u0006wx\u000ez%|w^$QS\u001cqL6&BN!FU|-]Z\u001c{?=\u001e\rI IbyC\u0010\u0007\u0011\bKd\u000b\u0012\u000b\u001d5\u001d\fX\u001fQ\u000f\u0001B06\u0013\u007fDV's\u000e_\u00064S&/\u0003 \u0019J;kQ5/B8y{\u00192Fziv^E!\\x3~5s", replaceWith = @ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @JvmStatic
            @InterfaceC1492Gx
            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity_release();
            }

            @JvmStatic
            public final boolean isPhotoPickerAvailable(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return isSystemPickerAvailable$activity_release() || isSystemFallbackPickerAvailable$activity_release(context) || isGmsPickerAvailable$activity_release(context);
            }

            @JvmStatic
            public final boolean isSystemPickerAvailable$activity_release() {
                if (Build.VERSION.SDK_INT >= 33) {
                    return true;
                }
                return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            @JvmStatic
            public final boolean isSystemFallbackPickerAvailable$activity_release(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return getSystemFallbackPicker$activity_release(context) != null;
            }

            @JvmStatic
            public final ResolveInfo getSystemFallbackPicker$activity_release(Context context) throws Throwable {
                short sXd = (short) (C1607wl.Xd() ^ 24267);
                int[] iArr = new int["7D@G5IB".length()];
                QB qb = new QB("7D@G5IB");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
                Object[] objArr = new Object[0];
                Method method = Class.forName(Qg.kd("\u0014 \u0015\"\u001e\u0017\u0011Y\u000e\u0019\u0017\u001c\f\u0014\u0019Qe\u0011\u000f\u0014\u0004\u0016\u0011", (short) (ZN.Xd() ^ 30892), (short) (ZN.Xd() ^ 29552))).getMethod(hg.Vd("52@\u001b+,3(-*\u0011$0\"'$0", (short) (C1580rY.Xd() ^ (-2047)), (short) (C1580rY.Xd() ^ (-26671))), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Object[] objArr2 = {new Intent(C1561oA.ud("9E:GC<6I}01A5A3=At8*78.5m\"-+0-\u001b\u001c,d\u0017\u0018(\u001c!\u001f]~vov\nruhmjw", (short) (Od.Xd() ^ (-11569)))), 1114112};
                    Method method2 = Class.forName(C1561oA.yd("n|s\u0003xso:x\u0006\u0006\rv\u0001\bB\u000e\fMpz}\u0007}\r\ft\n\u0010\u0004\u000b\n ", (short) (FB.Xd() ^ 19319))).getMethod(Xg.qd("eYhecn^;^pfthtz", (short) (FB.Xd() ^ 1724), (short) (FB.Xd() ^ 23992)), Class.forName(C1561oA.Yd("8F=LJEA\fBOOVHRY\u00140V]OY`", (short) (ZN.Xd() ^ 573))), Integer.TYPE);
                    try {
                        method2.setAccessible(true);
                        return (ResolveInfo) method2.invoke(packageManager, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }

            @JvmStatic
            public final boolean isGmsPickerAvailable$activity_release(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return getGmsPicker$activity_release(context) != null;
            }

            @JvmStatic
            public final ResolveInfo getGmsPicker$activity_release(Context context) throws Throwable {
                Intrinsics.checkNotNullParameter(context, EO.Od(">\u0010#OK\u000bR", (short) (C1633zX.Xd() ^ (-28298))));
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Qd("4@5B>71y.97<,49q\u00061/4$61", (short) (FB.Xd() ^ 32734))).getMethod(C1593ug.zd("XWgDVYbY`_H]k_fes", (short) (Od.Xd() ^ (-23811)), (short) (Od.Xd() ^ (-30347))), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    short sXd = (short) (ZN.Xd() ^ 17376);
                    int[] iArr = new int["KVS\u0013KRQHLD\f>J?LHA;\u0004<AF\u007fAB>D600<v)*:.31o\u0011\t\u0002\t\u001c\u0005\bz\u007f|\n".length()];
                    QB qb = new QB("KVS\u0013KRQHLD\f>J?LHA;\u0004<AF\u007fAB>D600<v)*:.31o\u0011\t\u0002\t\u001c\u0005\bz\u007f|\n");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Object[] objArr2 = {new Intent(new String(iArr, 0, i2)), 1114112};
                    Method method2 = Class.forName(C1561oA.Kd("`netrmi4jww~pz\u0002<\u007f}?btw\u0001w~}f{\n}\u0005\u0004\u0012", (short) (C1499aX.Xd() ^ (-23249)))).getMethod(C1561oA.Xd("\t|\f\t\u0007\u0012\u0002^\u0002\u0014\n\u0018\f\u0018\u001e", (short) (Od.Xd() ^ (-23811))), Class.forName(Wg.Zd("c[CC2~k'nL>6\u0019sl\u0018E=5\u0019\u0014k", (short) (C1499aX.Xd() ^ (-292)), (short) (C1499aX.Xd() ^ (-26338)))), Integer.TYPE);
                    try {
                        method2.setAccessible(true);
                        return (ResolveInfo) method2.invoke(packageManager, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }

            public final String getVisualMimeType$activity_release(VisualMediaType input) {
                Intrinsics.checkNotNullParameter(input, "input");
                if (input instanceof ImageOnly) {
                    return "image/*";
                }
                if (input instanceof VideoOnly) {
                    return "video/*";
                }
                if (input instanceof SingleMimeType) {
                    return ((SingleMimeType) input).getMimeType();
                }
                if (input instanceof ImageAndVideo) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004Gڑ0!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003\u001b'\u0004.IkDo\u0015a", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003(#\u0016<E\t#h\u007f\u0010\u0012|Iup\u0018", "u(E", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class ImageOnly implements VisualMediaType {
            public static final ImageOnly INSTANCE = new ImageOnly();

            private ImageOnly() {
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004Gڑ0!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003(#\u0007,SkDo\u0015a", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003(#\u0016<E\t#h\u007f\u0010\u0012|Iup\u0018", "u(E", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class VideoOnly implements VisualMediaType {
            public static final VideoOnly INSTANCE = new VideoOnly();

            private VideoOnly() {
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004Gڑ0!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003\u001b'\u0004.I]Dgq\u0010\u0015\u000e?@", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003(#\u0016<E\t#h\u007f\u0010\u0012|Iup\u0018", "u(E", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class ImageAndVideo implements VisualMediaType {
            public static final ImageAndVideo INSTANCE = new ImageAndVideo();

            private ImageAndVideo() {
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4D\u0015Ӭ\\\u0012&\u0006'uI4Re`.\u0001T֖\u0013k\n6tj2q[;\u0004\u001bԥ&\u000fWȞ\u007fitMh\u000få\u0013\u000b"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003%#\u0011.P\u0002#l\t\f\u0005\"@jF", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001a\u0003^\u001c^'\u0014lY@(j\u0003(#\u0016<E\t#h\u007f\u0010\u0012|Iup\u0018", ";h\\2G@IS", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001a\\4>B-\nz", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class SingleMimeType implements VisualMediaType {
            private final String mimeType;

            public SingleMimeType(String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                this.mimeType = mimeType;
            }

            public final String getMimeType() {
                return this.mimeType;
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, PickVisualMediaRequest input) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Companion companion = Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                return intent;
            }
            if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                Intent intent2 = new Intent(ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                return intent2;
            }
            if (companion.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                Intent intent3 = new Intent(GMS_ACTION_PICK_IMAGES);
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                return intent3;
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
            if (intent4.getType() == null) {
                intent4.setType("*/*");
                intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent4;
            }
            return intent4;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            return data == null ? (Uri) CollectionsKt.firstOrNull((List) GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) : data;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>)6B\u0015\"4\u0012\u000e\u0007nʑA0RkP.XS2\u000f\u0002{<řc$\bCCU }*\teNogtM` YƤ$')\u0002<Kex\f\u0012\u001f?RzO:]tk;žx6\u000b#`#fx=\u007f+jU |\u0001CY\u0010*0nuĐV\r[\u000bb(\u0014E8\u0001Ld\u0018RDQ\u0005]h9S\u0007wMf'\u000e0CbUmb3%\nq+;KG<%*\u0002\u0005\u07baV[E\u0006mrS\u0004\u00174W/W|o6\u0007\nD\u00199Z%]!&%!_n$-;QsK~\u0010Vx+\u007f\u001bK\u001c\u000e4,x4;*~\n$2#z$L^\u0006vB.\u007f8ت\u0019Ӿ\u000433ݍӾjc"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001ayj\u0015]/\u0018\fY2(|T3&o,H\u00067>", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9x@t+&]\f03t}.LG7X4*%hoH\\", "", "\u001a`]1e6BRb\bzmul\u00163;", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", ";`g\u0016g,Fa", "", "uH\u0018#", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "7mc2a;", "\u0011n\\=T5B]\"", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {
        public static final Companion Companion = new Companion(null);
        private final int maxItems;

        public PickMultipleVisualMedia() {
            this(0, 1, null);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, PickVisualMediaRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        public /* synthetic */ PickMultipleVisualMedia(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? Companion.getMaxItems$activity_release() : i2);
        }

        public PickMultipleVisualMedia(int i2) {
            this.maxItems = i2;
            if (i2 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, PickVisualMediaRequest input) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (PickVisualMedia.Companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(PickVisualMedia.Companion.getVisualMimeType$activity_release(input.getMediaType()));
                if (this.maxItems > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxItems);
                return intent;
            }
            if (PickVisualMedia.Companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = PickVisualMedia.Companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                Intent intent2 = new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(PickVisualMedia.Companion.getVisualMimeType$activity_release(input.getMediaType()));
                intent2.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX, this.maxItems);
                return intent2;
            }
            if (PickVisualMedia.Companion.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = PickVisualMedia.Companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                Intent intent3 = new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES);
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.putExtra(PickVisualMedia.GMS_EXTRA_PICK_IMAGES_MAX, this.maxItems);
                return intent3;
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(PickVisualMedia.Companion.getVisualMimeType$activity_release(input.getMediaType()));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() == null) {
                intent4.setType("*/*");
                intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent4;
            }
            return intent4;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i2, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i2 != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? CollectionsKt.emptyList() : clipDataUris$activity_release;
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{|/i%\nCiW`|̀\rOTj̐rN"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]:\u001b=v;\u001ayj\u0015]/\u0018\fY2(|T3&o,H\u00067'^\u0016\u001e\u00191stL_e", "", "u(E", "5dc\u001aT?\"b\u0019\u0007\t", "", "5dc\u001aT?\"b\u0019\u0007\t\u001d(z\u00183v\u00047\u0010:\u000e\u0017\u001eGk\u001c<", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final int getMaxItems$activity_release() {
                if (PickVisualMedia.Companion.isSystemPickerAvailable$activity_release()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }
        }
    }
}
