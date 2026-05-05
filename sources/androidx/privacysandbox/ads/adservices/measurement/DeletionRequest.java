package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: DeletionRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007ljA0R\u0004P.hS2\u000fq\u0006<$i-yCAV\"}0\u0015WNmhtOpŏa*6\u0016'idIo\u0014\u001eY\u001f6PoW3{pM=nvN\u0005N32>\u007f\u0005\u000f\u001dBH>z\u000bIQ\f 5XphV\u001dY\u000b\u001a \fV&\u0011 lg|>vsmF5#\u0011rZT7a@|{\u0015t[ܮ\u0011vo(sQEI-%\u0002\u00187XiU\u001bA\b<3gmݧ+\u0012yeMp\u007fB\u0016qcUc\u0001>t\u0005\u007fyR;{^qKh\u000eVxߡ\u007f\u0013Dǉ&\b-S<9j{\u0016\u0014Kz\u0003UPP0fp\u0007ѐe<\u001fӛ\u001851F)t\"pI\u001ef7*\tڟ\")\t͙9]Z\u001dn%kc\u0006SIQn>˓R\u0010aƝ\u0006\u0006vs\u00106TEU\tG\u0002!0'%ecg*\u074co\bPֳ\u007fx\u000brva:aVC:nD;Ҋ\r\u0012bե|\u0007qcbhµ\u0015i"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]\u0001", "", "2d[2g0H\\\u0001\ty^", "", ";`c0[\t>V\u0015\u0010~h9", "AsP?g", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "3mS", "2n\\.\\5.`\u001d\r", "", "\u001a`]1e6BRb\bzmul\u00163;", "=qX4\\5.`\u001d\r", "uH8\u0019](OOb\u000e~f,Fl8s\u000f$\u0005OV}\u001cC\u0001\n\u0006\u0006)=YG\u0004@{%*VR\u0011R9\u001a&d+I\u0016g3\u0018]+U[$\u0013aN\u00049]\"i\u0012Uts\tgPy25", "5dc\u0011X3>b\u001d\t\u0004F6{\t", "u(8", "5dc\u0011b4:W\"n\bb:", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0012a+", "u(;7T=:\u001d(\u0003\u0003^u`\u0012=t{1\u000b\u0016", "5dc\u001aT;<Vu~}Z=\u0001\u0013<", "5dc\u001ce0@W\"n\bb:", "5dc g(Kb", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DeletionRequest {
    public static final Companion Companion = new Companion(null);
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;
    private final List<Uri> domainUris;
    private final Instant end;
    private final int matchBehavior;
    private final List<Uri> originUris;
    private final Instant start;

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i2, int i3, Instant start, Instant end, List<? extends Uri> domainUris, List<? extends Uri> originUris) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(domainUris, "domainUris");
        Intrinsics.checkNotNullParameter(originUris, "originUris");
        this.deletionMode = i2;
        this.matchBehavior = i3;
        this.start = start;
        this.end = end;
        this.domainUris = domainUris;
        this.originUris = originUris;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeletionRequest(int i2, int i3, Instant instant, Instant instant2, List list, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        List list3 = list2;
        List list4 = list;
        Instant MAX = instant2;
        Instant MIN = instant;
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            MIN = Instant.MIN;
            Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        }
        if ((i4 + 8) - (8 | i4) != 0) {
            MAX = Instant.MAX;
            Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        }
        this(i2, i3, MIN, MAX, (i4 + 16) - (16 | i4) != 0 ? CollectionsKt.emptyList() : list4, (i4 + 32) - (i4 | 32) != 0 ? CollectionsKt.emptyList() : list3);
    }

    public final Instant getStart() {
        return this.start;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final List<Uri> getDomainUris() {
        return this.domainUris;
    }

    public final List<Uri> getOriginUris() {
        return this.originUris;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.deletionMode) * 31) + this.domainUris.hashCode()) * 31) + this.originUris.hashCode()) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + Integer.hashCode(this.matchBehavior);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        return this.deletionMode == deletionRequest.deletionMode && Intrinsics.areEqual(new HashSet(this.domainUris), new HashSet(deletionRequest.domainUris)) && Intrinsics.areEqual(new HashSet(this.originUris), new HashSet(deletionRequest.originUris)) && Intrinsics.areEqual(this.start, deletionRequest.start) && Intrinsics.areEqual(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public String toString() {
        return "DeletionRequest { DeletionMode=" + (this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA") + ", MatchBehavior=" + (this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE") + ", Start=" + this.start + ", End=" + this.end + ", DomainUris=" + this.domainUris + ", OriginUris=" + this.originUris + " }";
    }

    /* JADX INFO: compiled from: DeletionRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005&2ߡx\u001d߿\u001b9^C\u001eH4Y\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȥ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZK,ޓ0ܫ\u00132Jģ\u0010?[sU9\u000fv\rӓrݨ&8\u0002ڎQ&8M(v)E\"ÏdضDpBĥұQ\r"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]ij\u000faL wHA(]", "", "u(E", "\u0012D;\u0012G\u0010(<\u0013fd=\fvd\u0016L", "", "\u0012D;\u0012G\u0010(<\u0013fd=\fvh\"Cf\u0018Z zz\u007f6Oz%R\f/8Y\u000f\u0013", "\u001b@C\u0010;&\u001b3{ZkB\u0016i\u0003\u000eEf\bj ", "\u001b@C\u0010;&\u001b3{ZkB\u0016i\u0003\u001aR_\u0016[-qv", "\u0012d[2g0H\\\u0001\ty^", "\u001b`c0[\t>V\u0015\u0010~h9", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {

        /* JADX INFO: compiled from: DeletionRequest.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĸA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]ij\u000faL wHA(F\u000bI\t;w\u0005\u0016\u001fu?ip\u0018", "", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface DeletionMode {
        }

        /* JADX INFO: compiled from: DeletionRequest.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĸA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]ij\u000faL wHA(F\u0014E\u00119k]\f\u0019\nFnzO,", "", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface MatchBehavior {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: DeletionRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":0\u007f\u0007|jAӄLe^.ZS0\u0010s{J$c$wFAZ0ԂR\t}M(z~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0013Ƥ6B}B{Q}HQ`#BM2@/Py3ЏJ4V\u0014\u000f\u0001SM\u001c\u0012^F\u001f?\u001b\u0019[\u00132\u00124̄P\u0005,c\u007fNdP5oH>;\u0003\u0018ĩ~1m9\u0015S\u001dHd';|\u0010#sLEE-%\u0002Έ7ViI\u001b? EUt5'CI\"X\rݜ\u0002Џ\u0019+WՕ.\u00054`\u001dWp\u000e7+}iyUdߍ\u0004ߡ\u007f\rDǉ^\u00125OF-Hn^ԇ?ϢvSHАRjP\u0002\u0013ad\u0018{ı5ڢ=\u001bnϟ2M'WO\u0002\u0015\u000f.#/tO`+טlڠ\u001fT\u007f\u0383\u0002]NG`N8a\u0014Ъ\u0010Ͳf\u00022ʶΫK\u0011"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]ii\u0015]H#nQ\r", "", "2d[2g0H\\\u0001\ty^", "", ";`c0[\t>V\u0015\u0010~h9", "uH8uI", "2n\\.\\5.`\u001d\r", "", "\u001a`]1e6BRb\bzmul\u00163;", "3mS", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "=qX4\\5.`\u001d\r", "AsP?g", "0tX9W", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018U'NL]0f[_= \"Z\u001c]\u0001", "Adc\u0011b4:W\"n\bb:", "Adc\u0012a+", "Adc\u001ce0@W\"n\bb:", "Adc g(Kb", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private final int deletionMode;
        private List<? extends Uri> domainUris;
        private Instant end;
        private final int matchBehavior;
        private List<? extends Uri> originUris;
        private Instant start;

        public Builder(int i2, int i3) {
            this.deletionMode = i2;
            this.matchBehavior = i3;
            Instant MIN = Instant.MIN;
            Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
            this.start = MIN;
            Instant MAX = Instant.MAX;
            Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
            this.end = MAX;
            this.domainUris = CollectionsKt.emptyList();
            this.originUris = CollectionsKt.emptyList();
        }

        public final Builder setStart(Instant start) {
            Intrinsics.checkNotNullParameter(start, "start");
            this.start = start;
            return this;
        }

        public final Builder setEnd(Instant end) {
            Intrinsics.checkNotNullParameter(end, "end");
            this.end = end;
            return this;
        }

        public final Builder setDomainUris(List<? extends Uri> domainUris) {
            Intrinsics.checkNotNullParameter(domainUris, "domainUris");
            this.domainUris = domainUris;
            return this;
        }

        public final Builder setOriginUris(List<? extends Uri> originUris) {
            Intrinsics.checkNotNullParameter(originUris, "originUris");
            this.originUris = originUris;
            return this;
        }

        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }
    }
}
