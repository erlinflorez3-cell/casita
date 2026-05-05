package com.braze.support;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import bo.app.gd;
import bo.app.hd;
import bo.app.id;
import bo.app.ih0;
import bo.app.jd;
import bo.app.kd;
import bo.app.ld;
import bo.app.md;
import bo.app.nd;
import bo.app.od;
import bo.app.pd;
import bo.app.sc;
import bo.app.tc;
import bo.app.u;
import bo.app.uc;
import bo.app.vc;
import bo.app.wc;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeLogger;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;

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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&˛\bDRi|\u0004G\u000b8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ReP.XW2\u000f\u0002{<řc$\bCCU \u0003*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4I[\u007fe\u0012%2JoE5UoKEht<\r8E09\u0012\u0005/\u001aZL\u001eu\u0013CyÈܘ4Bv;`\u000fe\u0018(\u0015\u001e>N\u0001N`uMNH\u001bҗƠ3%\tlPP?z>\u0003e\rtTW\u0011\u0005e6+n7e\u00193X\u001b\u0007\u0001[ύ\u0007AwC\u0013o?D9V\fWdd0\u001a#4g\u000fsqTd5Un\u0017?+}mׂT\u0010.\u0005\t\n%U\u0012\u001d\u001e'v:U\u001a\u0015\u0012>9\u0003{kBf\u0001\rJȸ~c<&3\u0010K6G,~Q\u0010;ϭR9\u0002\u0016\u001b0;\u0016|7sT<uE\u001fb\fi1\u007fS\u0004Mݳ\u000e[C\u0004\u0012\bz'8\u001fHG./,\u0015</=7\nNS%y\u001b`D\u0016v5dvm\u0002Rv@hsގ;,\u000f'h`|*yrlXZ2} b\u0006\u0016\bA\u05fe\r{J?=\u0010|l\u0019opMk*=/\u0015V֍rm\u0014yG\u0002KZ_\b(chuBGlf\u0013v~B\u0002)\u000b`6;JH\u0019\u0010(\u007fRh$\u0013`?ۇ 62U'\u0002-m\u0011DZA+*\u0010^v.\u0017TaA3m2\u000e!\u0001~\\!su\u0013a,+`h-ۮU7\u001fLcI\u0001e\u000bL\u001f\u0001\n~uo|MZ\u0001.wkzN)J=_WU\u0013=\u0014Y6\u0010F]L!e\u0002Q A\u0013|(\u000f\u0002h\u05cek\np\u001a:\u000b\u0003s]\u0001/.\u0007`\u0003#6d\u0010{qF)G\u0012\u007f;_LH\u000b\u0003\bߢ~<\u000b%7\u001eS 6\"Ŀ9/IS+C\u00105=Cyiyq>y\u0011\u000f6vu\u0004ZcD\u001b\u0013Uk1S8wʲEЖѐ(n\tpV\u001a\u0018\u001aP:L\raxwdGތ:Ԫ\u000f3\u0006h\r]\u001b#vmHF\b}b.\u0016*JʘPљbG-\u0013S\u0007u\"\u000e]j@b\u000f8\u000b21Eܡnݞ$Z_d\u000fe\u0014(8HOqz\u0005j\tZ4\u0003чZդGXq\b\u00161\u000ez\u007f'%iZsiVDXOּ)߃\tjMb'a\u000f3\u001f5$1Cjܳq\u0001"}, d2 = {"\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]AX?M", "", "5dc\u0011\\:IZ\u0015\u0013lb+\f\f\u001ai\u0013(\u0003N", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ ", "5dc\u0011X5LW(\u0013Yi0", "2oX", "2o", "5dc\u001d\\?>Z'_\bh4[\t8s\u00047\u0010\u001c\n\u0016uR", "uH8u<", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "0hc:T7", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "7lP4X\u001dBS+", "", "@db6m,\"[\u0015\u0001zO0|\u001b\u001eo\\,\u000bH|\"uKw\u000eE\u0005)?b\f", "uKP;W9HW\u0018H|k(\b\f3c\u000eqXD\u0010\u001f\u0013REt8\u007f$Bc\u0002\u001f\u0001\u007f\u001a-OCJ5\u0018&\u0011ja*\u000bc>$:\u0018", "@db6m,-]u\u0003\nf(\bg3m\u007f1\nD\u000b %", "uKP;W9HW\u0018H\rb+~\t>/c0wB\u0001\b\u001bG\u0002c#r.4f\b$67\u0018;IN>o2,^EeH\u000f_7$:\u0018", "5dc\u0016`(@S\u007f\tv],\nf+c\u0003(iD\u0016\u0017", "u(8", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "7m_Bg\u001aM`\u0019z\u0003", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"(k\fK\u00012I\u0018g+Fq 7[\u0019", "5dc\u000f\\;FO$fzm({\u0005>a`5\u0006Hn&$Gk\u0016", "uKY.i(\bW#H^g7\r\u0018\u001dt\r(wHVZ}Cx\rI\u0001)4#\u007f-3x\u00192KQ\u0005H8-\u001ddl\u001a\u0003a;X\u0004;\u00066Y;`\\{Ki", "=oc6b5L", "2dbA\\5:b\u001d\t\u0004P0{\u00182", "2dbA\\5:b\u001d\t\u0004A,\u0001\u000b2t", "1`[0h3:b\u0019b\u0004L(\u0005\u00146em,\u0011@", "uKP;W9HW\u0018H|k(\b\f3c\u000eqXD\u0010\u001f\u0013RP\n:\u0006/Bm<\nB|\u001a8VQ\u0011O\u0018ax", "\u001a`]1e6BRb\bzmul\u00163;", "CqX", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\b\u001bG\u0002jF\u0007.4gS", "DhTD56N\\\u0018\r", "\u001aa^{T7I\u001d)T", "5dc\u000f\\;FO$", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001v\u0016=\u00173Ho\n\u0005\u0013ri\u0003\u0004p(cvpGU^4j\u001cOJ\u0010'Z~R+\u001facQ-mR\rbn)SK7s\fU&c", "5dc\u0019b*:Zu\u0003\nf(\b", "uKP;W9HW\u0018H\u0004^;Fx<iU\f_\u0004g\u0013 F|\u0018@un7fy+:q\u0014<\u0017 ?z<\u001a >", "5dc\u001fX4Hb\u0019[~m4x\u0014", "uKP;W9HW\u0018H\u0004^;Fx<iU\f_\u0004g\u0014!\u0011k\u0019G@5\u000b", "7lP4X\u0014>b\u0015}vm(", "2dR<W,,O!\n\u0002^+Y\r>m{3\\M\u000b\u001f\u0005V|\u000e8~", "uKY.i(\bW#H^g7\r\u0018\u001dt\r(wHV}\u0013Pn\u001bFz$~[\u000b\u001cBp\u001a,[\r\u0018oC&\u0011sB5\u0005r6[\u000be1W]0f[\u0001\u0013wu\u001etJ4\f\u0012cE#8FD\u001b\u0013/M\u007fI2]\u0010%\u00161uF", "\u001aj^A_0G\u001d\u0004z~k\u0002", "5dc\u0011X:MW\"z\nb6\u0006k/i\u0002+\u000b\u001c\n\u0016\tKn\u001d?a)HY\u0005.", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~V\u000b\u001cLm_.VSCy}z\"dv9wg,`S1WUM:2\u0016YC\u001e!a\u0012Wtw\u0001]Ny", "5dc\u0011\\:IZ\u0015\u0013]^0~\f>A\t'mD\u007f&\u001a2s!<}3", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#|/D`\u0002)\u0001X\u00122Z\u0019", "", "\"@6", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "\u001bH=,<\u0014\u001a5xxX:\n_h)Sc\u001d[:]\u000b\u0006']", "\u0017", "\u001b@G,<\u0014\u001a5xxX:\n_h)Sc\u001d[:]\u000b\u0006']", "\u001fT0\u001fG\f+M\u0001ZmX\u001aXp\u001aL_\u0007u$hrx'ij0e\u0005#", " T=!<\u0014\u001eM\u0001^bH\u0019p\u0003\u0013M[\n[:g\u0001r&Oz6f\u0013\u0011;]\u001a#]\u007f\u001d1#$Z", "5dc\u001fH\u0015-7\u0001^tF\fdr\u001cYy\fc\u001cbv\u0011.Yi\u001bV\u0012/Ik{\u0019M\u0010\u001a=-*O\u0014\u0007\u0004']B\u0010m;J\u0006+QU\\", "u(E", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xs = "")
public final class BrazeImageUtils {
    private static final int MAX_IMAGE_CACHE_SIZE_BYTES = 33554432;
    private static final int MIN_IMAGE_CACHE_SIZE_BYTES = 1024;
    private static final int QUARTER_MAX_SAMPLED_IMAGE_BYTES = 4194304;
    public static final int RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT = 8;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    public static final int calculateInSampleSize(BitmapFactory.Options options, int i2, int i3) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (i3 == 0 || i2 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) sc.f1758a, 14, (Object) null);
            return 1;
        }
        long j2 = options.outHeight;
        long j3 = options.outWidth;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tc(options, i2, i3), 14, (Object) null);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1;
        long j4 = i3;
        if (j2 > j4 || j3 > i2) {
            long j5 = 2;
            long j6 = j2 / j5;
            long j7 = j3 / j5;
            while (true) {
                int i4 = intRef.element;
                long j8 = i4;
                if (j6 / j8 < j4 && j7 / j8 < i2 && (j3 * j2) / ((long) (i4 * i4)) <= 4194304) {
                    break;
                }
                intRef.element = i4 * 2;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new uc(intRef, j3, j2), 14, (Object) null);
        return intRef.element;
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i2, int i3) {
        options.inSampleSize = calculateInSampleSize(options, i2, i3);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final u getBitmap(Context context, Uri uri, BrazeViewBounds viewBounds) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(viewBounds, "viewBounds");
        Pair<Integer, Integer> destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, viewBounds);
        int iIntValue = destinationHeightAndWidthPixels.component1().intValue();
        int iIntValue2 = destinationHeightAndWidthPixels.component2().intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return new u(getLocalBitmap(uri, iIntValue2, iIntValue), null);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, iIntValue2, iIntValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new vc(uri), 12, (Object) null);
        return new u(null, null);
    }

    public static /* synthetic */ u getBitmap$default(Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return getBitmap(context, uri, brazeViewBounds);
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    public static final int getDensityDpi(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1626yg.Ud("@91\u001d(P}", (short) (OY.Xd() ^ 2725), (short) (OY.Xd() ^ 20577)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("\fs5\"\u0005!F>\u0014'&\f-*24 L\u0012m\u001f\rl", (short) (C1607wl.Xd() ^ 22523))).getMethod(EO.Od("\u0017fG\u0001t0<\u0012Zjj\u001b", (short) (C1607wl.Xd() ^ 16023)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getConfiguration().densityDpi;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final Pair<Integer, Integer> getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) throws Throwable {
        Pair<Integer, Integer> displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        int iIntValue = displayHeightAndWidthPixels.component1().intValue();
        int iIntValue2 = displayHeightAndWidthPixels.component2().intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new wc(iIntValue2, iIntValue), 12, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new Pair<>(Integer.valueOf(Math.min(iIntValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(iIntValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
    }

    public static final Pair<Integer, Integer> getDisplayHeightAndWidthPixels(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Qd("\u0004\u000f\r\u0012\u0002\u0014\u000f", (short) (C1580rY.Xd() ^ (-644))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("*8/><73}4AAH:DK\u0006\u001cIIPBVS", (short) (C1580rY.Xd() ^ (-12802)), (short) (C1580rY.Xd() ^ (-11898)))).getMethod(C1561oA.od("UR`=O\\W\\XHIV", (short) (C1607wl.Xd() ^ 313)), new Class[0]);
        try {
            method.setAccessible(true);
            DisplayMetrics displayMetrics = ((Resources) method.invoke(context, objArr)).getDisplayMetrics();
            return new Pair<>(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final int getDisplayWidthPixels(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getDisplayHeightAndWidthPixels(context).getSecond().intValue();
    }

    public static final int getImageLoaderCacheSize() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / ((long) 8), 2147483647L), MAX_IMAGE_CACHE_SIZE_BYTES));
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Bitmap getLocalBitmap(android.net.Uri r13, int r14, int r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.getLocalBitmap(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    public static final int getPixelsFromDensityAndDp(int i2, int i3) {
        return Math.abs((i2 * i3) / 160);
    }

    public static /* synthetic */ void getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.InputStream] */
    private static final u getRemoteBitmap(Uri uri, int i2, int i3) throws Throwable {
        ?? r02;
        HttpURLConnection httpURLConnectionA;
        u uVar;
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        ?? outboundNetworkRequestsOffline = Braze.Companion.getOutboundNetworkRequestsOffline();
        HttpURLConnection httpURLConnection = null;
        try {
            if (outboundNetworkRequestsOffline != 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new gd(string), 12, (Object) null);
                return new u(null, null);
            }
            try {
                URL url = new URL(string);
                ih0 ih0Var = ih0.f914a;
                httpURLConnectionA = ih0Var.a(url);
                try {
                    int responseCode = Callback.getResponseCode(httpURLConnectionA);
                    if (responseCode != 200) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new hd(responseCode, url), 12, (Object) null);
                        u uVar2 = new u(null, null);
                        httpURLConnectionA.disconnect();
                        return uVar2;
                    }
                    outboundNetworkRequestsOffline = Callback.getInputStream((URLConnection) httpURLConnectionA);
                    try {
                        if (i2 == 0 || i3 == 0) {
                            uVar = new u(BitmapFactory.decodeStream(outboundNetworkRequestsOffline), Callback.getHeaderFields(httpURLConnectionA));
                            outboundNetworkRequestsOffline = outboundNetworkRequestsOffline;
                        } else {
                            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                            String str = TAG;
                            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new id(i3, i2), 14, (Object) null);
                            BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(outboundNetworkRequestsOffline);
                            httpURLConnectionA.disconnect();
                            httpURLConnectionA = ih0Var.a(url);
                            InputStream inputStream = Callback.getInputStream((URLConnection) httpURLConnectionA);
                            if (bitmapMetadataFromStream.outHeight == 0 || bitmapMetadataFromStream.outWidth == 0) {
                                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new jd(url, bitmapMetadataFromStream), 12, (Object) null);
                                uVar = new u(BitmapFactory.decodeStream(inputStream), Callback.getHeaderFields(httpURLConnectionA));
                                outboundNetworkRequestsOffline = inputStream;
                            } else {
                                uVar = new u(decodeSampledBitmapFromStream(inputStream, bitmapMetadataFromStream, i2, i3), Callback.getHeaderFields(httpURLConnectionA));
                                outboundNetworkRequestsOffline = inputStream;
                            }
                        }
                        httpURLConnectionA.disconnect();
                        if (outboundNetworkRequestsOffline != 0) {
                            try {
                                outboundNetworkRequestsOffline.close();
                            } catch (IOException e2) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) ld.f1188a, 8, (Object) null);
                            }
                        }
                        return uVar;
                    } catch (Exception e3) {
                        e = e3;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new kd(string, e), 8, (Object) null);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        if (outboundNetworkRequestsOffline != 0) {
                            try {
                                outboundNetworkRequestsOffline.close();
                            } catch (IOException e4) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) ld.f1188a, 8, (Object) null);
                            }
                        }
                        return new u(null, null);
                    }
                } catch (Exception e5) {
                    e = e5;
                    outboundNetworkRequestsOffline = 0;
                } catch (Throwable th) {
                    th = th;
                    outboundNetworkRequestsOffline = 0;
                }
            } catch (Exception e6) {
                e = e6;
                httpURLConnectionA = null;
                outboundNetworkRequestsOffline = 0;
            } catch (Throwable th2) {
                th = th2;
                r02 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        httpURLConnection = httpURLConnectionA;
        r02 = outboundNetworkRequestsOffline;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (r02 != 0) {
            try {
                r02.close();
            } catch (IOException e7) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e7, false, (Function0) ld.f1188a, 8, (Object) null);
            }
        }
        throw th;
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(ImageView imageView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) md.f1277a, 12, (Object) null);
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new nd(imageView), 12, (Object) null);
            return;
        }
        if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new od(imageView), 12, (Object) null);
            return;
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new pd(width, imageView), 12, (Object) null);
        imageView.setLayoutParams(imageView.getLayoutParams());
    }
}
