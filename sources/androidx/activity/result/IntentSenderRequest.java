package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
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
/* JADX INFO: compiled from: IntentSenderRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.`Y2\u000fq\u0005<$i$yCAX \u00038ޛmf\u0018g\u001dI\u0013\u000bZ'F#~x<Mcxu\u0012=3Բs?AO0j?ś\u0005:\u0013#J\"f}\u0015\t *V\u0015\u000f|YJ:\u0018@Fv:`\u0014e\u0005H\u001a\u0016D&\u0001,e\u007fNdPǰa:=-KoP`?_^\u0005\u0014!\u000fj5 \u000faL?p;C*=S1\b\u0003_M\u0019Wqk\r/;w<Wxo8n~B\u001bۣS\u0013eö>^\u000b\\n\u0018w:]jcP<0Þ~\u0002\u0015ɝ\u001c\u0010\f4V<})t\u0011&3#zՂDV\nމZ\u0002\u0001pD%u\u000fA.Q\u001b\u0015Uň?\u001fVљ\u0014\u0007\u0013.1\u0012\u0382%t"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9qE\u0006%>hk @l\u0016;:CG{4,$>", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001l", ">`a0X3", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007}", "uKP;W9HW\u0018H\u0005lug\u0005<c\u007f/Q\u0004q", "7mc2a;,S\"}zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&\u0005Gx\r<\u0004z", "4h[9<5\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "4kP4f\u0014:a\u001f", "", "4kP4f\u001d:Z)~\t", "uKP;W9HW\u0018Hxh5\f\t8tI\f\u0005O\u0001 &5o\u0017;v2\u000b@y)6z 2L\r9u=-\u0015qp\u0003jl;N\u007f6\u001d02oM", "5dc\u0013\\3E7\"b\u0004m,\u0006\u0018", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq_I\u0010\u0017 VE", "5dc\u0013_(@a\u0001z\td", "u(8", "5dc\u0013_(@a\nz\u0002n,\u000b", "5dc\u0016a;>\\(lzg+|\u0016", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq_I\u0010\u0017 V]\u000eEu%B/", "2db0e0;Sv\t\u0004m,\u0006\u0018=", "EqXAX\u001bH>\u0015\fx^3", "", "2dbA", "4kP4f", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntentSenderRequest implements Parcelable {
    private final Intent fillInIntent;
    private final int flagsMask;
    private final int flagsValues;
    private final IntentSender intentSender;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i2) {
            return new IntentSenderRequest[i2];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i2, int i3) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i2;
        this.flagsValues = i3;
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(intentSender, (i4 + 2) - (2 | i4) != 0 ? null : intent, (-1) - (((-1) - i4) | ((-1) - 4)) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }

    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagsMask() {
        return this.flagsMask;
    }

    public final int getFlagsValues() {
        return this.flagsValues;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.intentSender, i2);
        dest.writeParcelable(this.fillInIntent, i2);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS8\u0015s{:$c$\bCCU \u00028ޛ\u007fN\u0016f'IkKP\u0015\u001a&|x,aU'^ܫ\u00132Pq\u007f>]sK<xtd\tڶ6\"F~M\u0005(5`\u0010%\u0007\fY\u001a\u001fH@\u001fí\u0003\u0013[\u000b2\u0014\u001c=N\bfpu\\NH\u001bҗj31\u0012\u0002B|0\u00104\u000b]%F\u00030]\u0005o$CBM4C,*\u038b\u0013қ_?\u000bӊBI\u0013p?'YRJɑBݼ\u0004\u0014\u001dۀ \u0019k|>\\3Z7ϲ3˦ScSִ^4\u0006}\u0014\rj\bdͽ)ρ2-\"Ǒۅ\u0012E"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9qE\u0006%>hk @l\u0016;:CG{4,$'>I\u000bj+N\u0004|", "", ">d]1\\5@7\"\u000ezg;", "\u001a`]1e6BRbz\u0006iug\t8d\u00041}$\n&\u0017P~c", "uKP;W9HW\u0018Hvi7Fs/n~,\u0005Bd &Gx\u001d\u0012:\u0016", "7mc2a;,S\"}zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&\u0005Gx\r<\u0004z", "uKP;W9HW\u0018Hxh5\f\t8tI\f\u0005O\u0001 &5o\u0017;v2\u000b\u001dn", "4h[9<5\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "4kP4f\u0014:a\u001f", "", "4kP4f\u001d:Z)~\t", "0tX9W", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9qE\u0006%>hk @l\u0016;:CG{4,$>", "Adc\u0013\\3E7\"b\u0004m,\u0006\u0018", "Adc\u0013_(@a", "D`[BX:", ";`b8", "\u0014kP4", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private Intent fillInIntent;
        private int flagsMask;
        private int flagsValues;
        private final IntentSender intentSender;

        /* JADX INFO: compiled from: IntentSenderRequest.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĴA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9qE\u0006%>hk @l\u0016;:CG{4,$'>I\u000bj+N\u0004e(SJ.2", "", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        private @interface Flag {
        }

        public Builder(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.intentSender = intentSender;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }

        public final Builder setFillInIntent(Intent intent) {
            this.fillInIntent = intent;
            return this;
        }

        public final Builder setFlags(int i2, int i3) {
            this.flagsValues = i2;
            this.flagsMask = i3;
            return this;
        }

        public final IntentSenderRequest build() {
            return new IntentSenderRequest(this.intentSender, this.fillInIntent, this.flagsMask, this.flagsValues);
        }
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007lʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B]IV2\u00042\u000b_N\u0016j\u001dL\u0011\u000f\u001aƬ\bȀ|p4կezc\u0016\u001d2ԸsD"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9qE\u0006%>hk @l\u0016;:CG{4,$'?C\u000fn(Wz1P\"", "", "u(E", "\u0011Q4\u000eG\u0016+", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001UtTo\nK\u00012\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9qE\u0006%>hk @l\u0016;:CG{4,$>", "5dc\u0010E\f\u001aB\u0003k9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }
    }
}
