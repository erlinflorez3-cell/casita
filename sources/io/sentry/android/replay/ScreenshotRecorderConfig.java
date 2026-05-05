package io.sentry.android.replay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import io.sentry.SentryReplayOptions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4C\u0007\":\u0018\u007f\u0007l|A0RnP.XT2\u000fy\b<$a$wٙAkڼ\u001cA9O|f mi\u001b I\u001d\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom4ޜs=Gc5i\u0015$@&Py3\u0006*.V\u0016\u000fzqP\u001c\u0016>@\t:\u0001\u000e]\t(\u0014\u001e>N\u0002.`uUNH\u001bbJ31\u000b\u0002B|,ۢ4|[\u0016\u000f[5\u001f\u000faL0\u0007́6],a\u0016\u001fR\nDIԑr\u0006\fv;?+wt\u001eͳYH\u001b#@g\r\fslٟ\u0006\u001ag\u001a=CO\u0012P\u0017˲)@\u0002\n$T\u0004<\u000bmϥ/u]t &3#Ɂ\u0004FV\u0002lF\u0018z\u0010;G+\u000639?3f\u007ffk\u001fT7\n\u0005%\u001eQ\u0002\u001f'aT\u001cb-\u001b\u0003x\u00027W@KOf\n\bB\u001e\nvb\u00102\u001c0u\u0005uʌ\u0010v(3Ps9Q;\u001c\bV_\u007fx\u001b_\u0017R0˄I\t)|2O*7\u0011!ּcMr^qp,?kbϘ\u0006N\u0017!(twj&ٚ\u0014TWŖ\u0002lSg\u00180\u007fuE`\u0007k<\\ߍb9=ȡ{\u0012g^\u0005\u001f\u0010Kp\u000bpfpX۱^b0ίJJp\u001d\u0006\u0007\u0015]\u001a\u0017J? !ٜ07!¢-J\t,PLM\u0018mZ\u0001\u0010-Uտ(\tq˅\r\u000b\u0007_j\u0001@v\u0007KD|\u000f#έEW=ӧ>W(yB\rɦ\u000b\u001f"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "", "AbP9X\r:Q(\t\bQ", "", "AbP9X\r:Q(\t\bR", "uE5uI", "@dR<e+B\\\u001bp~];\u007f", "", "@dR<e+B\\\u001bazb.\u007f\u0018", "4qP:X\u0019:b\u0019", "0hc\u001fT;>", "uH8\u00139\u0010\"\u0017\n", "5dc\u000f\\;+O(~", "u(8", "5dc\u0013e(FS\u0006z\n^", "5dc\u001fX*H`\u0018\u0003\u0004`\u000f|\r1h\u000f", "5dc\u001fX*H`\u0018\u0003\u0004`\u001e\u0001\b>h", "5dc V(ESyzxm6\n{", "u(5", "5dc V(ESyzxm6\n|", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScreenshotRecorderConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int bitRate;
    private final int frameRate;
    private final int recordingHeight;
    private final int recordingWidth;
    private final float scaleFactorX;
    private final float scaleFactorY;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`Y2şqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7^h\f[\u000f4\u0018)n:Lmx\f\u0016?6PtW3{u\u0006Cn{N\u0005N:J8(\rG\u001aݻL\u0019"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000bej,\u0001/RHW0f[H", "", "u(E", "4q^:", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Adb@\\6G@\u0019\n\u0002Z@", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yl(\u0007G|+\u0001R~\u0012F\u007f3\u000b", "/cYBf;-]u\u0006\u0005\\2j\rDe", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int adjustToBlockSize(int i2) {
            int i3 = i2 % 16;
            return i3 <= 8 ? i2 - i3 : i2 + (16 - i3);
        }

        public final ScreenshotRecorderConfig from(Context context, SentryReplayOptions sentryReplayOptions) throws Throwable {
            Rect rect;
            short sXd = (short) (C1607wl.Xd() ^ 29684);
            short sXd2 = (short) (C1607wl.Xd() ^ 353);
            int[] iArr = new int["S\rD\u000434.".length()];
            QB qb = new QB("S\rD\u000434.");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
            Intrinsics.checkNotNullParameter(sentryReplayOptions, C1626yg.Ud("\u0019+\u0002N]\u001ew\u0012W~=\\k", (short) (C1633zX.Xd() ^ (-4343)), (short) (C1633zX.Xd() ^ (-21024))));
            Object[] objArr = {Ig.wd("-PG!tH", (short) (Od.Xd() ^ (-18758)))};
            Method method = Class.forName(EO.Od("\u0010M'\u001b\tHe@I\u0017.\u001885i\u000bEy\"N\u0003C#", (short) (Od.Xd() ^ (-22826)))).getMethod(C1593ug.zd("65E%LGI;D+>LQE@C", (short) (ZN.Xd() ^ 27638), (short) (ZN.Xd() ^ 19780)), Class.forName(C1561oA.Qd("#\u0019-\u0017b \u0014 \u0018]\u0002\"\u001f\u0015\u0019\u0011", (short) (ZN.Xd() ^ 31304))));
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                short sXd3 = (short) (C1580rY.Xd() ^ (-24473));
                int[] iArr2 = new int["28.-_\"\u001f+**.X\u001a\u001cU\u0018\u0015&&P$\u001eM\u001b\u001b\u0019V\u0017\u001d\u0013\u0012D\u0018\u001c\u0012\u0006?\u007f\f\u0001\u000e\n\u0003|E\r~y\u000b@hy}r|\u0004Xkwinkw".length()];
                QB qb2 = new QB("28.-_\"\u001f+**.X\u001a\u001cU\u0018\u0015&&P$\u001eM\u001b\u001b\u0019V\u0017\u001d\u0013\u0012D\u0018\u001c\u0012\u0006?\u007f\f\u0001\u000e\n\u0003|E\r~y\u000b@hy}r|\u0004Xkwinkw");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Intrinsics.checkNotNull(objInvoke, new String(iArr2, 0, i3));
                WindowManager windowManager = (WindowManager) objInvoke;
                if (Build.VERSION.SDK_INT >= 30) {
                    rect = windowManager.getCurrentWindowMetrics().getBounds();
                } else {
                    Point point = new Point();
                    windowManager.getDefaultDisplay().getRealSize(point);
                    rect = new Rect(0, 0, point.x, point.y);
                }
                Intrinsics.checkNotNullExpressionValue(rect, C1561oA.Kd("IG\u0002\u000b:*8:188\u0019?19N9?F\u001322\u0016M맨^h=krlcs/{,\u000e%&'()*+,-./0\u000f", (short) (OY.Xd() ^ 17469)));
                float fHeight = rect.height();
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.Zd(":A19(\u0014\tL\u0004\u0012\u000b\u000bmhh\u001c3A::\u001d*\u0018", (short) (ZN.Xd() ^ 11019), (short) (ZN.Xd() ^ 16009))).getMethod(C1561oA.Xd("ml|[o~{\u0003\u0001ru\u0005", (short) (OY.Xd() ^ 3999)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    Integer numValueOf = Integer.valueOf(adjustToBlockSize(MathKt.roundToInt((fHeight / ((Resources) method2.invoke(context, objArr2)).getDisplayMetrics().density) * sentryReplayOptions.getQuality().sizeScale)));
                    float fWidth = rect.width();
                    Class<?> cls = Class.forName(Wg.vd("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBv\" %\u0015'\"", (short) (C1633zX.Xd() ^ (-4421))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd4 = (short) (C1499aX.Xd() ^ (-9631));
                    short sXd5 = (short) (C1499aX.Xd() ^ (-29093));
                    int[] iArr3 = new int["96D!3@;@<,-:".length()];
                    QB qb3 = new QB("96D!3@;@<,-:");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                        i4++;
                    }
                    Method method3 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                    try {
                        method3.setAccessible(true);
                        Pair pair = TuplesKt.to(numValueOf, Integer.valueOf(adjustToBlockSize(MathKt.roundToInt((fWidth / ((Resources) method3.invoke(context, objArr3)).getDisplayMetrics().density) * sentryReplayOptions.getQuality().sizeScale))));
                        int iIntValue = ((Number) pair.component1()).intValue();
                        int iIntValue2 = ((Number) pair.component2()).intValue();
                        return new ScreenshotRecorderConfig(iIntValue2, iIntValue, iIntValue2 / rect.width(), iIntValue / rect.height(), sentryReplayOptions.getFrameRate(), sentryReplayOptions.getQuality().bitRate);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    public ScreenshotRecorderConfig(float f2, float f3) {
        this(0, 0, f2, f3, 0, 0);
    }

    public ScreenshotRecorderConfig(int i2, int i3, float f2, float f3, int i4, int i5) {
        this.recordingWidth = i2;
        this.recordingHeight = i3;
        this.scaleFactorX = f2;
        this.scaleFactorY = f3;
        this.frameRate = i4;
        this.bitRate = i5;
    }

    public static /* synthetic */ ScreenshotRecorderConfig copy$default(ScreenshotRecorderConfig screenshotRecorderConfig, int i2, int i3, float f2, float f3, int i4, int i5, int i6, Object obj) {
        if ((1 & i6) != 0) {
            i2 = screenshotRecorderConfig.recordingWidth;
        }
        if ((i6 + 2) - (2 | i6) != 0) {
            i3 = screenshotRecorderConfig.recordingHeight;
        }
        if ((4 & i6) != 0) {
            f2 = screenshotRecorderConfig.scaleFactorX;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            f3 = screenshotRecorderConfig.scaleFactorY;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 16)) != 0) {
            i4 = screenshotRecorderConfig.frameRate;
        }
        if ((i6 & 32) != 0) {
            i5 = screenshotRecorderConfig.bitRate;
        }
        return screenshotRecorderConfig.copy(i2, i3, f2, f3, i4, i5);
    }

    public final int component1() {
        return this.recordingWidth;
    }

    public final int component2() {
        return this.recordingHeight;
    }

    public final float component3() {
        return this.scaleFactorX;
    }

    public final float component4() {
        return this.scaleFactorY;
    }

    public final int component5() {
        return this.frameRate;
    }

    public final int component6() {
        return this.bitRate;
    }

    public final ScreenshotRecorderConfig copy(int i2, int i3, float f2, float f3, int i4, int i5) {
        return new ScreenshotRecorderConfig(i2, i3, f2, f3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenshotRecorderConfig)) {
            return false;
        }
        ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) obj;
        return this.recordingWidth == screenshotRecorderConfig.recordingWidth && this.recordingHeight == screenshotRecorderConfig.recordingHeight && Float.compare(this.scaleFactorX, screenshotRecorderConfig.scaleFactorX) == 0 && Float.compare(this.scaleFactorY, screenshotRecorderConfig.scaleFactorY) == 0 && this.frameRate == screenshotRecorderConfig.frameRate && this.bitRate == screenshotRecorderConfig.bitRate;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.recordingWidth) * 31) + Integer.hashCode(this.recordingHeight)) * 31) + Float.hashCode(this.scaleFactorX)) * 31) + Float.hashCode(this.scaleFactorY)) * 31) + Integer.hashCode(this.frameRate)) * 31) + Integer.hashCode(this.bitRate);
    }

    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.recordingWidth + ", recordingHeight=" + this.recordingHeight + ", scaleFactorX=" + this.scaleFactorX + ", scaleFactorY=" + this.scaleFactorY + ", frameRate=" + this.frameRate + ", bitRate=" + this.bitRate + ')';
    }
}
