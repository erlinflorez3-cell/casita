package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1vSDK;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0010nj?0LeV4ZS0\u0011s{J$c$\bCCU ~*\t]UogtJb\u000bY\u000f\u000e\u0016~j4Ic\u0005e\u0012\u001d2JoE4UoS9ht<\u0005(288\u0002\u0005\u0007\u001d2H&v\u0003CQ\u000e\u00185V\u0081X{=S\u0015\u001c\"\u0006l /\u001d\u0015gw`\tym>=%\u001bipOϮc2\u0003P\u001bJ\u001d4\u001b|y\u001eYE}5չ)U\t\r`b\b\u0018MzU\u0005\u0017,W/Wuo6\u0007\bZ\u0015ۣS\u000fc{4fMfn\u0017?+}h{T\u001c*\u0010z*\u0015\u0003\u0005؝\n)N9;$/\u001d\u001c?\rr\u0002E\u0001\u0006lD\u0018z\u0010>]%ő7-?'t[*X'^O{3\u0012N'\u000fp9[\u0003\u001b\u0011\u0019)c\u0010Q__\u0007=˓R\f_M{\u00159\u007f\u00103\u001c0u\u0005_\u007f\u001f0/%ehi'/z\u001aHru=\u0005¾lUo[VQj{$JB\t:l\u000byʰoRZk:%\u0016)b\u0017\u0016\bA5#\r˶%'\u0016^]~2\u007f[m\"%]ng]|m&Wgky5Ʉg\u0012gb\u0005+\bIp\u0011pfpXRlڅ,$8Tx\u0017@\u0017R^$\u0013`X\u001a\u001cb,a\u001fj\u0017`\u00054Ao\u0015O_˖l\u0012\u0005dA>S{2\b!\u0001~\\'o>ղKض\u0001d*/GlC5vg0qL|Q$5sVüi֙KPt\u0018{s\n?f,G]G=A/5)\tČ/։PvmSS35\u001dM\f\u001dF\u0001.\u0016\r!2\u0003ߏlߝSX/$|\u0002\u0001*X}\u000e\nyF)L\u001a\u0016aϹűI\u03a2\u0007cDP>!\u0013D6'\u0007\u000b0\u0004\u0006?QO5\u0016&:e\u00158Ӥkܓ2}j\u0011,\u0018s+|v$\u000ezQ\fDqx ʶ˟>ѐ(p\u000bDN\u0013\u0006-"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\bv\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b~\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u0004\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b\f\u0013\u0014?S", ">/", "\nh]6g\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn;B:#8cuz^", "", "1n_FW,?O)\u0006\n", "u(I", "", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "uH\u0018'", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\bv\u0013\u0014?<{\u0018ia>;\"!A", ">0", "5dc\u001fX=>\\)~", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~U\t+En\u001dBMP\u0005o=-\u0015uj5\u000e-\b/vrG:-\u0012\u001b.S9_\"Hl4\u0001Py", "", "\u000fE01E,OS\"\u000fz=(\f\u0005", "u(9", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b\u0007\u0013\u0014?S", "u(;0b4\bO$\n\t_3\u0011\t</\u00041\u000b@\u000e \u0013N9i\u001dvpEG\\\u0006\r", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ ", "", "", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn?B2#8cu\u001er\u0012?I\rBg= ^VpF\u000bl.$:\u0018", "1n\\=b5>\\(L", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u0004\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\by\u0013\u0014?S", "1n\\=b5>\\(M", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\by\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", "1n\\=b5>\\(J", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", "1n\\=b5>\\(K", "1n_F", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\bv\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\bv\u0013\u0014?S", "/qT\u000e_3\u001fW\u0019\u0006yl\u001dx\u00103d", "\u000fEP}g\u001a\u001d9", "\u000fEP}h\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFe1eSDK extends AFe1mSDK<AFh1rSDK> {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    private final Lazy areAllFieldsValid;
    private final AFc1oSDK component1;
    private final AFc1eSDK component2;
    private final AFh1rSDK component3;
    private final AFc1hSDK component4;
    private final Lazy copy;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gّ1!Ǟr~P+R~\rfʴ=2JeV/"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\bv\u0013\u0014?<{\u0018ia=;\"!A", "", "\nh]6g\u0005", "u(E"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLc\u0003\u0010Iي8\u000b<K\u0007\"2\u0012\u007f\u0007|jA0ZeP.Xa2\u000fy\u0002<$a2wٔAkڼ.\"7N\u000f\u001dwvPZ\u0019D'\b,w\u0019,Y]~] \u0012JD\u0006>aO\u007fC?`\u0003:\u001d `$H\u0004\u000b\u0001(1`\u0014%\u007f,Kj\u0018ضDr@Z\u001bVM* \u0010V\"\u0017\u001d\u000bg\u0015ɬIǰa<5-\u0011t\u000b^5kH~c\ftVm̡wҐ\"-FCC\"ma\u0011\u0015j[m\u0005\u0006҃>ݾl)-9W\u0003 Hf\u0010,\u0019YTu]Q,#ԬRԃ\u0010)1_q\\\u0019L6\n\u0013{;ɝ4\u0016\f'V/E\u001c|\u0007<3%zY@^\u0005vD\u0016y\u00108G+\u000639=3f\u007fck#T7\n\f%\"Q\u0006W!:ZT׳\u0014ôXyWC_S\u0006`\\\u001fq=\u001c\u0006!h\u0010>\u001c2]~]zWқ\u0018É;]?8/\u0002JVR\u007f\u000f\u0005\u000f\u007f\u001a\u05f6Q͕D$t.ECQ\u001ah^|\u0005\u001aP\u001bѨ+ҭQ\u001eZ!\f\u0013cBjxT#;\u000f|O\u001fn)R4܋1çjGapq\u000feTv5;mq\u001b\u0002T|1MZ3%fjZS:\\\u0013-`7\u001fТ\u001cȑ\u007fTV\u000e\u00196M\u0011462Q'k5J\t?PcM%ma\u0001\u0014-Y\u001c$aoZy_ɞRʷtyozO3\u000b\u0004:/GuC*vw0kL~9\u0006-u6L&Q\u001eƊxטye\u0004\"\u001c\u001dGvG?\u0019\u0012\r6R\u00043kZ\u001a"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\bv\u0013\u0014?<{\u0018ia>;\"!A", "", "", "/ce2e;Ba\u001d\b|B+", "", "7r;6`0M/\u0018m\bZ*\u0003\r8g_1w=\b\u0017\u0016", "/ce2e;Ba\u001d\b|B+n\r>ha3\n", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "5`X189K]&", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0012c\b'7i\u001f\u0004B*@gE\u001a^o]B\t-\u001a]\u0004+PN+<`Yq=!g\u001e~", "1n\\=b5>\\(J", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(K", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "1n\\=b5>\\(L", "u(I", "1n\\=b5>\\(M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*XP\u0005\u001e\u0016G|c", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0012c\b'7i\u001f\u0004B*@gE\u001a^o]B\t-\u001a]\u0004+PN+<`Yq=!g\u001etL5\u0015NUL/|E>3\b9\u0013\u0006Dw\u0001\u0019\u001f\n<4L#V[Ggs[\u007f\u0005IB%og&'\u001b", "=sW2e", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u000eW=>`(\u0003\tb5~l.", "Adc\u000eW=>`(\u0003\tb5~l.", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "(", "5dc\u000eW=>`(\u0003\tb5~l.W\u00047~\"\f%", "Adc\u000eW=>`(\u0003\tb5~l.W\u00047~\"\f%", "uY\u0018#", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "5dc\u0014T0=3&\f\u0005k", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "Adc\u0019\\4Bbt}ik(z\u000f3n\u0002\b\u0005<}\u001e\u0017F", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AFa1uSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1uSDK() {
            this(null, null, false, null, 15, null);
        }

        public AFa1uSDK(String str, Boolean bool, boolean z2, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z2;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1uSDK(String str, Boolean bool, boolean z2, StringBuilder sb, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : bool, (4 & i2) != 0 ? false : z2, (i2 + 8) - (i2 | 8) != 0 ? new StringBuilder() : sb);
        }

        public static /* synthetic */ AFa1uSDK copy$default(AFa1uSDK aFa1uSDK, String str, Boolean bool, boolean z2, StringBuilder sb, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = aFa1uSDK.advertisingId;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                bool = aFa1uSDK.isLimitAdTrackingEnabled;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                z2 = aFa1uSDK.advertisingIdWithGps;
            }
            if ((i2 + 8) - (i2 | 8) != 0) {
                sb = aFa1uSDK.gaidError;
            }
            return aFa1uSDK.copy(str, bool, z2, sb);
        }

        public final String component1() {
            return this.advertisingId;
        }

        public final Boolean component2() {
            return this.isLimitAdTrackingEnabled;
        }

        public final boolean component3() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder component4() {
            return this.gaidError;
        }

        public final AFa1uSDK copy(String str, Boolean bool, boolean z2, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1uSDK(str, bool, z2, gaidError);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Intrinsics.areEqual(this.advertisingId, aFa1uSDK.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFa1uSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1uSDK.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, aFa1uSDK.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z2 = this.advertisingIdWithGps;
            ?? r02 = z2;
            if (z2) {
                r02 = 1;
            }
            return ((iHashCode2 + r02) * 31) + this.gaidError.hashCode();
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z2) {
            this.advertisingIdWithGps = z2;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000b<N\u0007\"2\u0012\u007f\u0007t\rAӄld߉4Ziճ?k*3li2q[;\u0004\u001b.&\u0017Qfg\u0016q\u0011nS]\u001d\n.x\u0019-ye\u0007b*\u001bBD\u007f?aP\u007f?I`#93&x6ة}\f"}, d2 = {"1n\\{T7Ia\u001a\u0006\u000f^9F\r8t\u007f5\u0005<\b`\u0015Qw\u0019F\u007f%>h\fiC}\u0016>M\rJgB$#2B9\u0016a/*u8GY]0jV{?w\u0011I\n\\1K\u0006YP\"q&3#\u0007\u001cW\u0006Djn\b\u001e\u001cEsr0U\u0016\u0006E", "\u001ab^:\"::['\u000f\u0004`ux\u0012.r\n,z\n\u0003\u0013\u001fG9\fC\u000154[y(77\u0015.^\rIj:grokI\u0006B,_T#NSK(ZXH", "=m4?e6K", "", "@dP@b5", "", "=mBBV*>a'", "9h]1f", "", "!C:,c9HR\u0006~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1ySDK implements CloudDevCallback {
        final /* synthetic */ AFa1uSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        AFa1ySDK(AFa1uSDK aFa1uSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1uSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            this.$fetchGaidData.getGaidError().append(reason).append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.FETCH_ADVERTISING_ID, new AFe1pSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        AFc1hSDK aFc1hSDKAFInAppEventParameterName = aFd1zSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(aFc1hSDKAFInAppEventParameterName, "");
        this.component4 = aFc1hSDKAFInAppEventParameterName;
        AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
        this.component1 = aFc1oSDKAFAdRevenueData;
        AFc1eSDK aFc1eSDKForce = aFd1zSDK.force();
        Intrinsics.checkNotNullExpressionValue(aFc1eSDKForce, "");
        this.component2 = aFc1eSDKForce;
        this.component3 = new AFh1rSDK(null, null, null, null, null, null, null, null, 255, null);
        this.areAllFieldsValid = LazyKt.lazy(new Function0<Long>() { // from class: com.appsflyer.internal.AFe1eSDK.4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                Long longOrNull;
                String currencyIso4217Code = AFe1eSDK.this.component1.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((currencyIso4217Code == null || (longOrNull = StringsKt.toLongOrNull(currencyIso4217Code)) == null) ? 1000L : longOrNull.longValue());
            }
        });
        this.copy = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFe1eSDK.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.component1.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
            }
        });
    }

    private static boolean component2() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th.getMessage();
            }
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, null);
            return false;
        }
    }

    private final boolean component3() {
        return ((Boolean) this.copy.getValue()).booleanValue();
    }

    private final boolean copydefault() {
        boolean z2 = false;
        for (int i2 = 2; i2 > 0; i2--) {
            z2 = true;
            if (component3() && getMonetizationNetwork(i2)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else if (getCurrencyIso4217Code(i2)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
            } else {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                z2 = false;
            }
            if (z2) {
                break;
            }
        }
        this.component2.component3 = this.component3;
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean getCurrencyIso4217Code(int r15) {
        /*
            r14 = this;
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1ySDK r0 = (com.appsflyer.internal.AFh1ySDK) r0
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r4 = 4
            r5 = 0
            java.lang.String r2 = "Trying to fetch GAID..."
            r3 = 0
            com.appsflyer.internal.AFh1ySDK.i$default(r0, r1, r2, r3, r4, r5)
            com.appsflyer.internal.AFe1eSDK$AFa1uSDK r7 = new com.appsflyer.internal.AFe1eSDK$AFa1uSDK
            r12 = 15
            r13 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            com.appsflyer.internal.AFc1hSDK r0 = r14.component4
            android.content.Context r0 = r0.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r5 = getRevenue(r0)
            com.appsflyer.internal.AFc1hSDK r0 = r14.component4
            android.content.Context r0 = r0.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r14.getCurrencyIso4217Code(r0, r7)
            r6 = 0
            r2 = 1
            if (r0 != 0) goto L8c
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "enableGpsFallback"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L8a
            com.appsflyer.internal.AFc1hSDK r0 = r14.component4
            android.content.Context r0 = r0.getMonetizationNetwork
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r14.getRevenue(r0, r7)
            if (r0 == 0) goto L8a
            r4 = r2
        L4f:
            java.lang.StringBuilder r0 = r7.getGaidError()
            java.lang.String r3 = r0.toString()
            r1 = r3
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L62
            boolean r0 = kotlin.text.StringsKt.isBlank(r1)
            if (r0 == 0) goto L6a
        L62:
            com.appsflyer.internal.AFh1rSDK r0 = r14.component3
            getRevenue(r0, r3)
            if (r4 != 0) goto L8c
            return r6
        L6a:
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r1)
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r5)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = r0.toString()
            goto L62
        L8a:
            r4 = r6
            goto L4f
        L8c:
            com.appsflyer.internal.AFh1rSDK r1 = r14.component3
            java.lang.String r0 = r7.getAdvertisingId()
            r1.getCurrencyIso4217Code = r0
            java.lang.Boolean r0 = r7.isLimitAdTrackingEnabled()
            r1.getRevenue = r0
            java.lang.Boolean r0 = r7.isLimitAdTrackingEnabled()
            if (r0 == 0) goto Lc4
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        La9:
            r1.AFAdRevenueData = r0
            boolean r0 = r7.getAdvertisingIdWithGps()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.getMediationNetwork = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.getMonetizationNetwork = r0
            r0 = 2
            if (r15 == r0) goto Lbd
            r6 = r2
        Lbd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.component2 = r0
            return r2
        Lc4:
            r0 = 0
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1eSDK.getCurrencyIso4217Code(int):boolean");
    }

    private final boolean getCurrencyIso4217Code(Context context, AFa1uSDK aFa1uSDK) throws IllegalStateException {
        Unit unit;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                aFa1uSDK.setAdvertisingId(advertisingIdInfo.getId());
                aFa1uSDK.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                aFa1uSDK.setAdvertisingIdWithGps(true);
                String advertisingId = aFa1uSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    aFa1uSDK.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            AFe1eSDK aFe1eSDK = this;
            aFa1uSDK.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null".toString());
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Google Play Services is missing " + th.getMessage(), th, false, false, false, false, 88, null);
            aFa1uSDK.getGaidError().append(th.getClass().getSimpleName()).append(" |");
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private final boolean getMediationNetwork(int i2) {
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component2()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.component4.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.component4.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.listOf("gaid"), new AFa1ySDK(aFa1uSDK, countDownLatch));
                    countDownLatch.await(((Number) this.areAllFieldsValid.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    try {
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th instanceof InterruptedException ? "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout" : th instanceof ClassNotFoundException ? "CloudDevSdk not found" : "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage(), th, true, false, false, false, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, null);
                        aFa1uSDK.getGaidError().append(th.getClass().getSimpleName()).append(" |");
                        if (aFa1uSDK.getGaidError().length() > 0) {
                        }
                    } finally {
                        if (aFa1uSDK.getGaidError().length() > 0) {
                            getRevenue(this.component3, aFa1uSDK.getGaidError().toString());
                        }
                    }
                }
                String advertisingId = aFa1uSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1rSDK aFh1rSDK = this.component3;
                aFh1rSDK.getCurrencyIso4217Code = aFa1uSDK.getAdvertisingId();
                aFh1rSDK.getRevenue = Boolean.FALSE;
                aFh1rSDK.AFAdRevenueData = Boolean.TRUE;
                aFh1rSDK.getMediationNetwork = Boolean.FALSE;
                aFh1rSDK.getMonetizationNetwork = Boolean.TRUE;
                aFh1rSDK.component2 = Boolean.valueOf(i2 != 2);
                return true;
            }
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    private final boolean getMonetizationNetwork(int i2) {
        return getMediationNetwork(i2);
    }

    private static int getRevenue(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private static void getRevenue(AFh1rSDK aFh1rSDK, String str) {
        String str2;
        if (str == null) {
            return;
        }
        String str3 = aFh1rSDK.component3;
        if (str3 != null && (str2 = str3 + " | " + str) != null) {
            str = str2;
        }
        aFh1rSDK.component3 = str;
    }

    private final boolean getRevenue(Context context, AFa1uSDK aFa1uSDK) throws IllegalStateException {
        try {
            AFb1vSDK.AFa1ySDK aFa1ySDKAFAdRevenueData = AFb1vSDK.AFAdRevenueData(context);
            aFa1uSDK.setAdvertisingId(aFa1ySDKAFAdRevenueData.getCurrencyIso4217Code);
            aFa1uSDK.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1ySDKAFAdRevenueData.AFAdRevenueData()));
            String advertisingId = aFa1uSDK.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                aFa1uSDK.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.INSTANCE != null) {
                return true;
            }
            AFe1eSDK aFe1eSDK = this;
            aFa1uSDK.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)".toString());
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID: " + th.getMessage(), th, true, false, false, false, 64, null);
            aFa1uSDK.getGaidError().append(th.getClass().getSimpleName()).append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, localizedMessage, false, 4, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return ((Number) this.areAllFieldsValid.getValue()).longValue();
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        if (this.component2.AFAdRevenueData()) {
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1uSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFe1uSDK aFe1uSDK = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(copydefault()), Boolean.FALSE, Boolean.FALSE}).contains(Boolean.TRUE) ? AFe1uSDK.SUCCESS : AFe1uSDK.FAILURE;
        AFc1eSDK aFc1eSDK = this.component2;
        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1aSDK.getMediationNetwork + "ms", false, 4, null);
        aFc1eSDK.getMediationNetwork(aFd1aSDK);
        return aFe1uSDK;
    }
}
