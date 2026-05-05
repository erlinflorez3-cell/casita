package androidx.work;

import android.net.Uri;
import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u001b\u007f\u0007llA0RlP.XS2\u000fy\u001c<$q$yCA^\"}0\u000fWNmi\u0005Ϻx's\u000f4\u00151kGer9j\u0018#BF}?KM\u001eމ˃dtD\u0006`\f2>\u007f\u0005\u000f\u001cBH>y\u000bIQ\f 4XphW\u001dS\u000b\u001a \fV /#lmT6Vsu:](\u0013oHN5gH|{\u0012VZ-\r\u0005j6+nAE\u001b+S\u0011\u0012j[m\rO}C\u0005v3?1Yug6\u0007\u000eB\"ۣS\rk\u0002nm\u0013hx\fU0\u007fiYP&*\u000ey*\f\u0003Ǡ\u000eN-VFE\u001a\u0015\rT8=xaYh\u0002\r\\F\u000f*:%,\u00183Y>cj_eS\u0019|<D\u000b\u001b$;\u0001\u001d&\"YVd##lw\u007f6\"TKSf\n\bG$\bGï\u0004ò\b6OĉG}\u0017>%6\boG,9k0RzkMݛbĈWoZ̲X$t(E;Y&hP|\u000b{RdXZ\u001f{)\u000b\u000bTܹ\u0015ء`}Dƙ=\u0012Tbv};ak\f=/\u0015:\u0010rBޕYߍb9=ȡ{\u0012gg\u0005*\u0010Jp\fpfpXBZ3̩$ĘLj\u0018ǮLR\\\u0010+2mvR4\u0003տ\u001bÅ\u0019H\u000bٜ\u0013O\u000b\u000fwZ\u0017\u00155T\nɸ\u0005Ȑ(t\u0011ɖ!j~w\u007fxw13`xΎCپ9\u0019.ŞɑlR"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}c", "", "=sW2e", "uKP;W9HW\u0018\u0012Dp6\n\u000fxC\n1\nO\u000e\u0013\u001bP~\u001c\u0012:\u0016", "@d`B\\9>R\u0002~\np6\n\u000f\u001ey\u000b(", "\u001a`]1e6BR,H\rh9\u0003R\u0018e\u000f:\u0006M\u0007\u0006+Roc", "@d`B\\9>av\u0002vk.\u0001\u00121", "", "@d`B\\9>aw~\fb*|l.l\u007f", "@d`B\\9>auz\nm,\n\u001d\u0018o\u000f\u000f\u0006R", "@d`B\\9>a\u0007\u000e\u0005k(~\t\u0018o\u000f\u000f\u0006R", "1n]AX5MB&\u0003|`,\nx:d{7{\u001f\u0001\u001e\u0013[W\u0012C})C", "", "1n]AX5MB&\u0003|`,\np+x^(\u0003<\u0015~\u001bNv\u0012J", "1n]AX5MC&\u0003ik0~\u000b/r\u000e", "", "\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}L\u001a\u0001.DY\u0007/'z\u001a\u001dZG=m4+j", "uKP;W9HW\u0018\u0012Dp6\n\u000fxN\u007f7\u000eJ\u000e\u001d\u0006[z\u000e\u0012k\u001a*Nb\u0005\u001er\u0012?I\rKz8%^VaH\\'\u001d", "5dc\u0010b5MS\"\u000eik0~\u000b/rg$\u000f\u001f\u0001\u001e\u0013[W\u0012C})C", "u(9", "5dc\u0010b5MS\"\u000eik0~\u000b/ro3z<\u0010\u0017uGv\nP^)<`\u0002.", "5dc\u0010b5MS\"\u000ejk0k\u00163g\u0002(\tN", "u(;7T=:\u001d)\u000e~euj\t>;", "5dc\u001fX8NW&~yG,\f\u001b9r\u0006\u0017\u0010K\u0001", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/h(\u000bR\u000b$\u001d6\u0004\u0019<L", "3pd._:", "6`b\u0010b5MS\"\u000ejk0k\u00163g\u0002(\tN", "6`b566=S", "", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "\u0011n]AX5MC&\u0003ik0~\u000b/r", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final Constraints NONE = new Constraints(null, false, false, false, false, 0, 0, null, 255, null);
    private final long contentTriggerMaxDelayMillis;
    private final long contentTriggerUpdateDelayMillis;
    private final Set<ContentUriTrigger> contentUriTriggers;
    private final NetworkType requiredNetworkType;
    private final boolean requiresBatteryNotLow;
    private final boolean requiresCharging;
    private final boolean requiresDeviceIdle;
    private final boolean requiresStorageNotLow;

    public Constraints() {
        this(null, false, false, false, false, 0L, 0L, null, 255, null);
    }

    public Constraints(NetworkType requiredNetworkType, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, Set<ContentUriTrigger> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z2;
        this.requiresDeviceIdle = z3;
        this.requiresBatteryNotLow = z4;
        this.requiresStorageNotLow = z5;
        this.contentTriggerUpdateDelayMillis = j2;
        this.contentTriggerMaxDelayMillis = j3;
        this.contentUriTriggers = contentUriTriggers;
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i2 & 2) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? false : z3, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? false : z4, (-1) - (((-1) - i2) | ((-1) - 16)) == 0 ? z5 : false, (i2 + 32) - (i2 | 32) != 0 ? -1L : j2, (i2 & 64) == 0 ? j3 : -1L, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? SetsKt.emptySet() : set);
    }

    public final NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    public final Set<ContentUriTrigger> getContentUriTriggers() {
        return this.contentUriTriggers;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Constraints(Constraints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z2 = other.requiresCharging;
        boolean z3 = other.requiresDeviceIdle;
        this(other.requiredNetworkType, z2, z3, other.requiresBatteryNotLow, other.requiresStorageNotLow, other.contentTriggerUpdateDelayMillis, other.contentTriggerMaxDelayMillis, other.contentUriTriggers);
    }

    public final boolean requiresCharging() {
        return this.requiresCharging;
    }

    public final boolean requiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    public final boolean requiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    public final boolean requiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    public final boolean hasContentUriTriggers() {
        return !this.contentUriTriggers.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.requiresCharging == constraints.requiresCharging && this.requiresDeviceIdle == constraints.requiresDeviceIdle && this.requiresBatteryNotLow == constraints.requiresBatteryNotLow && this.requiresStorageNotLow == constraints.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == constraints.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == constraints.contentTriggerMaxDelayMillis && this.requiredNetworkType == constraints.requiredNetworkType) {
            return Intrinsics.areEqual(this.contentUriTriggers, constraints.contentUriTriggers);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j2 = this.contentTriggerUpdateDelayMillis;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.contentTriggerMaxDelayMillis;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.contentUriTriggers.hashCode();
    }

    /* JADX INFO: compiled from: Constraints.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006(njO0L͜P.hS2şs{B-c$wECU(\u0005*\tUOog\u0005Jb\u000bI\u0017\u000e\u0016\u000fj4կ]xs\u0012\u00172HoU\u074c}ok8!y<\u0019ڶ6\"FyE\u000e ?X\u0014\u0005{[K:\u0014ضDpHUUc\u0013+*\u0006lĨ1\"jyf6v\u007f\u000e>=7\u001bipXmdx\u0001[\"^TU\u000f?m,AX7cՖUW\u0011\u001ej[m\u000b\b}K\u001d\u0001'UǢywe?p\u007fB\u001fs[\u001bv\u000b&\u000bӤ\u0002d\u001a2CO\u0012U\u0019\u001c6\u0012\u0013{;ɝ4\u0012\u00143`.[$-\rV?\u0003\u000ek@~\u061c\u000fF\u000e\by6E/HA9U3f\u007fĥk\u001d\\T\u0014\u0005;<i\u000677ip&`CÑ\u0005{_Ni@kW~\u000eg\\\u0006\u0004\u001f\u0003H/L>U!G{?фG)ExQ#O\nHM\r}\u0005&xh\u0002֟\u0003LN?\u0007\u0016e99\u0010hc|\u0005\u001ap\u001b]|#[ l\r\u000e\n# \u000b}j&{ĮZћlirܔ.\u001636~7\bvBސcߍb3=ȡ4\u001co[\u000f\u0014mF9ڶdڋFS\u0014ȗ-40=`j>\u0002RͬZܟ\u00172Gڤl@:=1\\CRYٟN˩\u0001\tgʳ9\u001c\raK$1szڒ\u0015ɹT\\xב8\u0005W:\u0015`P<\u0018ٞAԊ*U*ֻ\u0005\t1\u0017\u0017s.V>չSƥp\u0016}ɝޑ$8"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}L\u0019\u0007)<X}-\r", "", "u(E", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}c", "uKP;W9HW\u0018\u0012Dp6\n\u000fxC\n1\nO\u000e\u0013\u001bP~\u001c\u0012:\u0016", "1n]AX5MC&\u0003ik0~\u000b/r\u000e", "", "\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}L\u001a\u0001.DY\u0007/'z\u001a\u001dZG=m4+j", "@d`B\\9>R\u0002~\np6\n\u000f\u001ey\u000b(", "\u001a`]1e6BR,H\rh9\u0003R\u0018e\u000f:\u0006M\u0007\u0006+Roc", "@d`B\\9>auz\nm,\n\u001d\u0018o\u000f\u000f\u0006R", "", "@d`B\\9>av\u0002vk.\u0001\u00121", "@d`B\\9>aw~\fb*|l.l\u007f", "@d`B\\9>a\u0007\u000e\u0005k(~\t\u0018o\u000f\u000f\u0006R", "BqX4Z,K1#\b\n^5\fp+x^(\u0003<\u0015", "", "BqX4Z,K1#\b\n^5\fx:d{7{\u001f\u0001\u001e\u0013[", "/cS\u0010b5MS\"\u000ejk0k\u00163g\u0002(\t", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "BqX4Z,K4#\fY^:z\t8d{1\u000bN", "0tX9W", "Adc\u001fX8NW&~yG,\f\u001b9r\u0006\u0017\u0010K\u0001", "<dcDb9DB-\nz", "Adc\u001fX8NW&~\t;(\f\u0018/r\u0014\u0011\u0006Og!)", "Adc\u001fX8NW&~\t</x\u00161i\t*", "Adc\u001fX8NW&~\t=,\u000e\r-ec'\u0003@", "Adc\u001fX8NW&~\tL;\u0007\u0016+g\u007f\u0011\u0006Og!)", "Adc!e0@U\u0019\fXh5\f\t8tg$\u000f\u001f\u0001\u001e\u0013[", "2ta.g0H\\", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "Bh\\2H5Bb", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "Adc!e0@U\u0019\fXh5\f\t8to3z<\u0010\u0017uGv\nP", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private Set<ContentUriTrigger> contentUriTriggers;
        private NetworkType requiredNetworkType;
        private boolean requiresBatteryNotLow;
        private boolean requiresCharging;
        private boolean requiresDeviceIdle;
        private boolean requiresStorageNotLow;
        private long triggerContentMaxDelay;
        private long triggerContentUpdateDelay;

        public Builder() {
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
        }

        public Builder(Constraints constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
            this.requiresCharging = constraints.requiresCharging();
            this.requiresDeviceIdle = constraints.requiresDeviceIdle();
            this.requiredNetworkType = constraints.getRequiredNetworkType();
            this.requiresBatteryNotLow = constraints.requiresBatteryNotLow();
            this.requiresStorageNotLow = constraints.requiresStorageNotLow();
            this.triggerContentUpdateDelay = constraints.getContentTriggerUpdateDelayMillis();
            this.triggerContentMaxDelay = constraints.getContentTriggerMaxDelayMillis();
            this.contentUriTriggers = CollectionsKt.toMutableSet(constraints.getContentUriTriggers());
        }

        public final Builder setRequiresCharging(boolean z2) {
            this.requiresCharging = z2;
            return this;
        }

        public final Builder setRequiresDeviceIdle(boolean z2) {
            this.requiresDeviceIdle = z2;
            return this;
        }

        public final Builder setRequiredNetworkType(NetworkType networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.requiredNetworkType = networkType;
            return this;
        }

        public final Builder setRequiresBatteryNotLow(boolean z2) {
            this.requiresBatteryNotLow = z2;
            return this;
        }

        public final Builder setRequiresStorageNotLow(boolean z2) {
            this.requiresStorageNotLow = z2;
            return this;
        }

        public final Builder addContentUriTrigger(Uri uri, boolean z2) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.contentUriTriggers.add(new ContentUriTrigger(uri, z2));
            return this;
        }

        public final Builder setTriggerContentUpdateDelay(long j2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.triggerContentUpdateDelay = timeUnit.toMillis(j2);
            return this;
        }

        public final Builder setTriggerContentUpdateDelay(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.triggerContentUpdateDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public final Builder setTriggerContentMaxDelay(long j2, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.triggerContentMaxDelay = timeUnit.toMillis(j2);
            return this;
        }

        public final Builder setTriggerContentMaxDelay(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.triggerContentMaxDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        public final Constraints build() {
            Set set = CollectionsKt.toSet(this.contentUriTriggers);
            long j2 = this.triggerContentUpdateDelay;
            long j3 = this.triggerContentMaxDelay;
            return new Constraints(this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, j2, j3, set);
        }
    }

    /* JADX INFO: compiled from: Constraints.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r+4\u0012}\fnjG6L͜^\u008c\u0003SX\u000e,\u000fD(i$\nCiV*\u00020\u000bgN\u0016jĔNZ\u0019GW\u0017$\u0001\u0003,wX)c \u0018JD\u0006>aL6ޠ9)zD\u000f82PC@\u0019Q)8J(v)Fƚ\u0010\u00188ϋ\t<X\u000f[\nj!\u0014>8\u0001L]ʄR<PǍu<5)\u0011pŒR3"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}L\u001a\u0001.DY\u0007/'z\u001a\u001dZG=m4+j", "", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "7rC?\\.@S&~y?6\ng/s}(\u0005?| &U", "", "uKP;W9HW\u0018H\u0004^;Fx<iU\u001d?1", "u(I", "5dc\"e0", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "3pd._:", "=sW2e", "6`b566=S", "", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class ContentUriTrigger {
        private final boolean isTriggeredForDescendants;
        private final Uri uri;

        public ContentUriTrigger(Uri uri, boolean z2) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z2;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final boolean isTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) obj;
            return Intrinsics.areEqual(this.uri, contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + Boolean.hashCode(this.isTriggeredForDescendants);
        }
    }

    /* JADX INFO: compiled from: Constraints.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\nB%s$ EqYpԊ$\u07beSNo˧ĚN]"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}L\u001a\u0001-@U\u0007$Avk", "", "u(E", "\u001cN=\u0012", "\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}c", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
