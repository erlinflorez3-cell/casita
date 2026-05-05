package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eQLc\u000b\u0004Iي8\u000b<I\u0007Ӭ4\u0012\u0006\rnj?0Le^.ZS0\u000fs{J$c$wJCU(\u0007*\t]ȞogtLb\u000bQ\u001b\u000eǝ\u0001j:I]ތe\u0012%2JoE4cڎ[Y\u0011zF\u000702P\u0600(\u00041\u001aXHHu\u001b\u0004`\u0012&@D~;j\r{\u0007*\u0016\u0014A8\u0001L`ʄR6Vq\u001eG57\u0013mPT?_^\u0004֔\u0011Fb/M\u0004g3;DE>-%\u0002\r\u07baV[M\u000e\b\u0001K\u0015\u0001'U/yweGp\u007fBƃq̔\r&x4n\u001dQ\u000f\u0010m?\u0018tYc&(&\u000f,\u0013J\u0015&\b=G\\B`Ǩ\bV9\u0003\tk@~\u0006%VH~oM/%.:s?)~iai#\u0015<D\u000b\u001b7;\u0001\u001d;\"hVv#6lw\u007fM\u0002DKef\n\b[\u001e\b~\u0002\u001a*24\u000e\u0014\u007f\u000b\u001f1/%e_ޠ''sȵ`Fm\u0003\u0013m9bwS`@Ppގ;0\u0011ȱrFj\u0013y_Ԣ\\M"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\no\u001b\u001fG}\u001d8~0\u000b", "", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001l", "AdR<a+L", "", "<`]<f,<]\"}\t", "", "uI8uI", "2`c2", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "uKY.i(\bc(\u0003\u0002(\u000bx\u0018/;C\u0019", "Bh\\2", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "uKY.i(\bb\u001d\u0007z(\u0010\u0006\u0017>a\t7Q\u0004q", "5dc\u001bT5Ha\u0019|\u0005g+\u000b", "u(8", "5dc X*H\\\u0018\r", "u(9", "1n\\=T9>B#", "=sW2e", "2db0e0;Sv\t\u0004m,\u0006\u0018=", "3pd._:", "", "", "6`b566=S", "Bn3.g,", "Bn8;f;:\\(", "BnBAe0GU", "", "EqXAX\u001bH>\u0015\fx^3", "", "2dbA", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007}", "4kP4f", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#?a\u0006*@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int i2) {
            return new Timestamp[i2];
        }
    };

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007njG0L͜P.`Z2şs{B*cҕyCQU\"}8\tWȞmˮo`ҙ;C=\u0005V}p,֒Yxk\u0012W8PsW3{r\u0004>)\u000bD\n82P>*\t\u000f!BH>~+GY\u0015*0nz\u0001RUc\u0013%*\u0012N\"\u0011\u001e\u000bo^8Xl\fD]/+ip[m_\u0001\u0011[\u000e^Z7\u000f\u0007aL.n9k\u0019{ٍ\u0005\u07baV[GšӳuK"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\no\u001b\u001fG}\u001d8~0s7\b(Bi\u001f2WL\u0011", "", "u(E", "\u0011Q4\u000eG\u0016+", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001UtTo\nK\u00012\u000b", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\no\u001b\u001fG}\u001d8~0\u000b", "<nf", "D`[6W(MS\u0006z\u0004`,", "", "AdR<a+L", "", "<`]<f,<]\"}\t", "", "Bn??X*Ba\u0019m~f,", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#?a\u0006*@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<Long, Integer> toPreciseTime(Date date) {
            long j2 = 1000;
            long time = date.getTime() / j2;
            int time2 = (int) ((date.getTime() % j2) * ((long) 1000000));
            return time2 < 0 ? TuplesKt.to(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : TuplesKt.to(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long j2, int i2) {
            if (i2 < 0 || i2 >= 1000000000) {
                throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i2).toString());
            }
            if (-62135596800L > j2 || j2 >= 253402300800L) {
                throw new IllegalArgumentException(("Timestamp seconds out of range: " + j2).toString());
            }
        }

        @JvmStatic
        public final Timestamp now() {
            return new Timestamp(new Date());
        }
    }

    public Timestamp(long j2, int i2) {
        Companion.validateRange(j2, i2);
        this.seconds = j2;
        this.nanoseconds = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Timestamp(Instant time) {
        this(time.getEpochSecond(), time.getNano());
        Intrinsics.checkNotNullParameter(time, "time");
    }

    public Timestamp(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Companion companion = Companion;
        Pair preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((Number) preciseTime.component1()).longValue();
        int iIntValue = ((Number) preciseTime.component2()).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    @JvmStatic
    public static final Timestamp now() {
        return Companion.now();
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return ComparisonsKt.compareValuesBy(this, other, (Function1<? super Timestamp, ? extends Comparable<?>>[]) new Function1[]{new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        }});
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0);
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j2 = this.seconds;
        return (((((int) j2) * 1369) + ((int) (j2 >> 32))) * 37) + this.nanoseconds;
    }

    public final Date toDate() {
        return new Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / 1000000)));
    }

    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return instantOfEpochSecond;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.seconds + ", nanoseconds=" + this.nanoseconds + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }
}
