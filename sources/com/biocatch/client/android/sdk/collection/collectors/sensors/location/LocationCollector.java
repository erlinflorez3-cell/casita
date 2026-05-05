package com.biocatch.client.android.sdk.collection.collectors.sensors.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.techicalServices.SingleThreadExecutor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.ensureAvailable(CodedInputStream.java:1080)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1215)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĕ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,[*qK;c!\u0006̝\u0011OdgonP[\u0013C%\u0006\u001exp-QU\u0007i\u001a\u000f8Cw?IMwމA`\u0003?\rړ:\"Ny\r\u0001 *P\u0010\rzKŷ\u0014\u0012>Ex:X\rU\u00050\u0012\u000e>&\u0004&\\uN>ԟt]P/+\u0003oHV'm6\u0005ձ\u0015Fj'\u0015vg!1¨MߎE+c\u0005\u0017R\n?1>\"=3iW'YK4rF\\\u000e\u0017-+}\u0011mv4a\u001dQ\u000f\u00127/]jcP<0Þ~{\u001bEL\u001c\u0014Q`.[E\u0017\f\u001c_\rr\u0002m\u0017\u0016'P\u000e)y6EP079h3f\u007f~\u0002\u0019\u0017E\n5%\u001eQ,\u001f%i\u0004&`C8\u001b\f\u001a?_qUH|5\nA{6\tb0?JD\u0010\u000e=/).EPg_GU9k0]\u000b{?'n\u001dki\u0001sp(|HO,\u001f\u000b\tY\u0015\ty\u0006lXZG}\"b>\u0016\n)\u001f\u000b0\u00035m\u0016\\\t\u0001i\u0019x$\u001fm5tqqn\u001a9\u001eM'AC\r{\u0010\u0010g'\u0018Mqz\u0005\u0007\u001d\tST`jd:2v\u0016V\rLP\\\u0016+2m|rؼ8֞\u001d\\\u001dǽS0PM\u0015\t\u000eg\u001fdUԵ5ʗ\u0007m<v\u000f\u000f^kA\u0002u\ta,+qX\u0002\u0018ٲ7Ԋ*Y:j:\u000f1\u001aO\u007f\u000eN\u007fLuTCָwʀ\u007f \u001e֝\nc=Q+\u000f->hV\u0004սNȌiUe\u0014-\u0011\u000b\u0011_IvF\u007f\n\u0001oZyA\u07bd[ݚ\u001b\"~ܥC/\u0016~\u0018y\u0010aQõoӝ\u000f[FδC\u0011gXf:\u0013\u0004M;{˝{ݕ\u000155ξw+$\u0016,1+`\f~FІ\u0006ˏ\u0013&|ЁT8q\u0019\bb\u007fa\tձ:ա]~FЭtx\u0011a`j&(\u0019މ@٢7HIЬAbFn#/,\t]\u0530\u0019\u0080Z[Bܤ@\nBQw*\"NTйjǜ)\u0011Uω8y{ot\u000bx4`Ν}ϥr\u0012$ܻpbe\t!04~n݀Mވf\u0005Dɿt@:c \u000bq_@е\u001cĢ\u0004Fgʕg>P\u001cSV<_Oַb߃\t`MǷq6\u000f('3L\u0004\f̐\u0011֪JT7Ѳ\u0003\ra\"!\u001b\u0019UUܽ'ŠHTAЉϢ\\>"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0019d\fJ:\u0011\u000fb\u000b\u000bxB3.\f6R_Eo\b\f\u0014\u001d?wF", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0019d\fJ:\u0011\u000fb\u000b\u000bxB3.\f6RaLh\n\u001b}\u00184jw\u0018", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "\u001a`]1e6BRb\u0006\u0005\\(\f\r9nI\u000f\u0006>|&\u001bQxt@\u000545b}-\r", ":nR.g0H\\v\t\u0002e,z\u00189rm(\u000bO\u0005 \u0019U", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0019d\fJ:\u0011\u000fb\u000b\u000bxB3.\f6R_Eo\b\f\u0014\u001d?w^Be\u001fK\u0003\u0017\u0004\u0017", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016\\,e`|J\"[a\u0018L'\u001c\tcJmUN5\u001b\u00170S\u000b\u0019r\b\u0013\u0016\fDt}0V\u001fV}\u001ewO~ODcgCDEO`&s\nbfXC91\u001eu\u0018dfZ6\u0012\u0006\\\u001fqXCeqT\u0019D(3Bti\u001c,k^;\u00021#JEu\u001c;gt4\u0004va>3Ed\u0018Z=[/", "1n[9X*MW#\bhm(\n\u0018\u001ei\b(", "", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "6`]1_,KB\u001c\fzZ+", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5jC\u000e\u0017\u0013FE", "7rF.\\;B\\\u001b_\u0005k\r\u0001\u0016=tm$\u0004K\b\u0017", "", ":`bA?6<O(\u0003\u0005g", "\u001a`]1e6BRb\u0006\u0005\\(\f\r9nI\u000f\u0006>|&\u001bQxc", ":`bAC9Hd\u001d}zk", ":nR.g0H\\\u0001z\u0004Z.|\u0016", "\u001a`]1e6BRb\u0006\u0005\\(\f\r9nI\u000f\u0006>|&\u001bQxu8\u007f!7Y\u000bu", ":nR.g0H\\\u0006~{k,\u000b\f\u000ei\u000e7wI~\u0017", "", ":nR.g0H\\\u0006~{k,\u000b\f\u001ei\b(", ":nR.g0H\\\u0006~\u0007n,\u000b\u0018\u001da\b3\u0003@o\u001a$Gk\r\u001c\n%3i\r*D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u001aR\u007f)NL=/iRn<s%Z\f^:\u0017\u0012/", "@d`BX:M2\u0019\u0006vr", "@d`BX:MA(z\bm\u001b\u0001\u0011/", "@d`BX:MB\u001d\u0007zh<\f", "Bh\\2b<M", "1n]3\\.N`\u0019", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "6`]1_,%]\u0017z\nb6\u0006h@e\t7", ":nR.g0H\\", "=m;<V(MW#\bXa(\u0006\u000b/d", "=m??b=BR\u0019\fYb:x\u00066e~", ">q^C\\+>`", "=m??b=BR\u0019\fZg(y\u0010/d", "=mBAT;Nav\u0002vg.|\b", "AsPAh:", "", "3wc?T:", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "@t]", "AsP?g", "AsPAh:-]\u0007\u000e\bb5~", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LocationCollector extends ContinuousCollector<LocationEventModel> implements Runnable, LocationListener {
    private long collectionStartTime;
    private final Context context;
    private HandlerThread handlerThread;
    private boolean isWaitingForFirstSample;
    private Location lastLocation;
    private String lastProvider;
    private final LocationCollectorSettings locationCollectorSettings;
    private LocationManager locationManager;
    private float locationRefreshDistance;
    private long locationRefreshTime;
    private final SingleThreadExecutor locationRequestSampleThreadExecutor;
    private long requestDelay;
    private long requestStartTime;
    private long requestTimeout;
    private long timeout;
    private final Utils utils;

    public LocationCollector(LocationCollectorSettings locationCollectorSettings, Utils utils, Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(locationCollectorSettings, C1561oA.Yd("\r\u0011\u0006\u0005\u0019\u000f\u0016\u0016k\u0019\u0017\u0018\u0012\u0011#\u001f#\u0005\u0018()\u001f%\u001f,", (short) (FB.Xd() ^ 24423)));
        short sXd = (short) (ZN.Xd() ^ 23292);
        short sXd2 = (short) (ZN.Xd() ^ 29355);
        int[] iArr = new int["VVLPX".length()];
        QB qb = new QB("VVLPX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(utils, new String(iArr, 0, i2));
        short sXd3 = (short) (C1499aX.Xd() ^ (-9137));
        short sXd4 = (short) (C1499aX.Xd() ^ (-32720));
        int[] iArr2 = new int["\u0011)uH\tZ&".length()];
        QB qb2 = new QB("\u0011)uH\tZ&");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr2, 0, i3));
        this.locationCollectorSettings = locationCollectorSettings;
        this.utils = utils;
        this.context = context;
        this.locationRequestSampleThreadExecutor = new SingleThreadExecutor(ZO.xd("5k:o3\u0001<\u000b`-\u0012X@\u0001#\u0017=\u001eEv\u0019W\u0003\u001d:{h\nu\n", (short) (OY.Xd() ^ 19077), (short) (OY.Xd() ^ 27383)));
        this.isWaitingForFirstSample = true;
        this.timeout = locationCollectorSettings.getTimeout();
        this.requestDelay = locationCollectorSettings.getRequestDelay();
        this.locationRefreshTime = locationCollectorSettings.getLocationRefreshTime();
        this.locationRefreshDistance = locationCollectorSettings.getLocationRefreshDistance();
        this.requestTimeout = locationCollectorSettings.getRequestTimeout();
        short sXd5 = (short) (C1633zX.Xd() ^ (-433));
        short sXd6 = (short) (C1633zX.Xd() ^ (-1306));
        int[] iArr3 = new int["K-8t\u00040,O".length()];
        QB qb3 = new QB("K-8t\u00040,O");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
            i4++;
        }
        String str = new String(iArr3, 0, i4);
        short sXd7 = (short) (FB.Xd() ^ 20566);
        int[] iArr4 = new int["F\u001f``Cx\n\u0011o}tF\t\u001e\u000e'\u00144x\t3\u001cw".length()];
        QB qb4 = new QB("F\u001f``Cx\n\u0011o}tF\t\u001e\u000e'\u00144x\t3\u001cw");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd7 + i5)));
            i5++;
        }
        Class<?> cls = Class.forName(new String(iArr4, 0, i5));
        Class<?>[] clsArr = {Class.forName(EO.Od("Q\u00129L\u0002l3Q\u0016*OP\u001e\u0011{T", (short) (C1499aX.Xd() ^ (-495))))};
        Object[] objArr = {str};
        short sXd8 = (short) (FB.Xd() ^ 17303);
        int[] iArr5 = new int["mjxV{ttdkPampb[\\".length()];
        QB qb5 = new QB("mjxV{ttdkPampb[\\");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i6] = xuXd5.fK(sXd8 + sXd8 + sXd8 + i6 + xuXd5.CK(iKK5));
            i6++;
        }
        Method method = cls.getMethod(new String(iArr5, 0, i6), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, C1593ug.zd("\u001c$\u001c\u001dQ\u0016\u0015#$&,X\u001c [ \u001f24`62c355t7?78lBH@6q4B9HFA=\bGK@?SIPP\u00110TIH\\RYY9N\\PWVd", (short) (C1499aX.Xd() ^ (-17590)), (short) (C1499aX.Xd() ^ (-22217))));
            this.locationManager = (LocationManager) objInvoke;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void handleLocationEvent(Location location) {
        String str;
        try {
            if (this.isWaitingForFirstSample) {
                this.collectionStartTime = this.utils.currentTimeMillis();
                this.isWaitingForFirstSample = false;
            }
            long time = location.getTime();
            if (time - this.collectionStartTime >= this.timeout) {
                Log.Companion.getLogger().info("Location duration time has reached. Stopping collection");
                stop();
                return;
            }
            Location location2 = this.lastLocation;
            if (location2 != null && location.distanceTo(location2) == 0.0f && ((str = this.lastProvider) == null || Intrinsics.areEqual(str, location.getProvider()))) {
                Log.Companion.getLogger().debug("location equals previous sample: " + location);
                return;
            }
            this.lastLocation = location;
            this.lastProvider = location.getProvider();
            addToQueue(new LocationEventModel(getContextIDCache().get(), getCurrentEventId(), time, location.getLongitude(), location.getLatitude(), location.getAccuracy(), location.getSpeed(), location.getProvider()));
        } catch (Throwable th) {
            Log.Companion.getLogger().error(th.toString());
        }
    }

    private final String statusToString(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN" : "AVAILABLE" : "TEMPORARILY_UNAVAILABLE" : "OUT_OF_SERVICE";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        super.configure(configurationRepository);
        this.timeout = this.locationCollectorSettings.getTimeout();
        this.requestDelay = this.locationCollectorSettings.getRequestDelay();
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.Location;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isLocationEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "locationEvents";
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        handleLocationEvent(location);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Log.Companion.getLogger().warning("Provider: " + provider + " is disabled");
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Log.Companion.getLogger().warning("Provider: " + provider + " is enabled");
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i2, Bundle bundle) {
        Log.Companion.getLogger().warning("Provider: " + str + " status changed. Status: " + statusToString(i2));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            if (this.utils.currentTimeMillis() - this.requestStartTime <= this.requestTimeout) {
                this.locationRequestSampleThreadExecutor.postDelayed(this, this.requestDelay);
                return;
            } else {
                Log.Companion.getLogger().info("location permission is denied. Collector stopped location data will not be collected");
                stop();
                return;
            }
        }
        try {
            Log.Companion.getLogger().info("location permission is granted. Start receiving location updates");
            HandlerThread handlerThread = this.handlerThread;
            if (handlerThread != null) {
                handlerThread.start();
            }
            HandlerThread handlerThread2 = this.handlerThread;
            Looper looper = handlerThread2 != null ? handlerThread2.getLooper() : null;
            this.locationManager.requestLocationUpdates("gps", this.locationRefreshTime, this.locationRefreshDistance, this, looper);
            this.locationManager.requestLocationUpdates("network", this.locationRefreshTime, this.locationRefreshDistance, this, looper);
            this.locationRequestSampleThreadExecutor.stop();
        } catch (Throwable th) {
            Log.Companion.getLogger().error(th.toString());
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Location events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Location events collector is already started. Aborting the start operation.");
        }
        this.handlerThread = new HandlerThread("BC_LocationUpdatesHandlerThread");
        this.locationRequestSampleThreadExecutor.start();
        this.locationRequestSampleThreadExecutor.postDelayed(this, 0L);
        this.requestStartTime = this.utils.currentTimeMillis();
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        this.locationRequestSampleThreadExecutor.stop();
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.handlerThread = null;
        Log.Companion.getLogger().debug("Stop receiving location updates");
        this.locationManager.removeUpdates(this);
        setStarted(false);
        this.isWaitingForFirstSample = true;
    }
}
