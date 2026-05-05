package com.braze.models.outgoing;

import android.location.Location;
import bo.app.qd;
import bo.app.rd;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import yg.InterfaceC1492Gx;

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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u0003\bI\u00066\u00106B\u0015\"4\u0012}\u000enjG<LeN.ZS8\u0015s{:$c$\u007fّC٥\"}0\u0012WNmuvJp\u000bK\u000f\f\u001b~̛2_ǁ\u0017\u000eB\u000f`A(>d\u000e+C>pxD\u001082P8\n\t\u000f&BH>v\u000bKQ\f =XrPQ;M\u0015\"\u0018\u0006L.\u0019 rf|6Xtc:=2\u001bkXMU_݁\u0001O\u0013obQM\u0006g2;DEa-%\u0002.\u07baV]E,M\u001f}\u0014n;7/W\"o6\u0007\bЏ\u0019-U6k\"nj\u0013Rx\fU+\u0016ӭLח\u0012*}{\n\u000f\u0005\u0012\u001c\t?H\\-`Ȕ\tԧ7vxVNRJnP\u0004\u0013cL\u0016S\u007fyۂ:ӸjSg?'S\u007f\f\u0013\u00136%\u0017mO[\u001bؘaڠ\u001fV}W?V\tMVU\"[Sl2p)ͦ+˙4I\u00066\n\u0016v$3@s9Q)2\u0016ҩHi|\u000enr\u001c0`XX\"\u001dݫg0\u000f\fhO|\u0005\u001aP\u0005^2\u0011[(l\u0007,\bC(bwJ.=\u0012dN\u0017i\u001bUc\n3=~9om\u001a\u000e\bAd3C`{\u0012wQ%\u0014\u0006\u0601aۖ\\hHc\u001ak%60E`j>\nBπMܟ\u00174E\u0005*Ht?'r-H13\t̝{Ȥc\\n&\rk{<\u0011\u0005<t7\u001b\u0001b~\t\u007fz_++xhϡBپ9\u001b,p0\u0005\u0005\u000f1\u0012\u0017s.G\u001eL\u001eƅnטyY\u0004\"\u001c%Gn\u007fO!\u001b\u0017)`\u0002cE#Ǭg˛Q\u0016/|\u0003\u0006\u001dX9Bu\u0015\u0003rB_\u0019J\u0006TmǴx݈v'\u0010f\u0006\u0007odK[qb#]TH!\u0003\u0010<%˾~ġ#\"-\u0003u0\u000bS}W5,.y*.Ca\u0014iFІ{ˏ\u0013*|g\n;q4@t_}J;fI\u0010S\u0015ф&к\u0007F`l}'P\u000b\u0005\u001fAjYd\u001fVn\"aɗ\u007f֨\u000b0%r\\|H\u0015@\u0012BRw,\nB,\u0014\u0015\u0018{ݥOϬkq\u0006Mb.X\u0014Z\u001f\nW\u0007\u00142<NV\u000e7_ތ\b֯\u001c:Y=h*J\u000etH:d \rYS\u0018\u0006FOVʢaʸ\u001b6ZuA}\u001cYܨ`\t"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI2\fO\u0003!\u001bPqW\u0019\u0004!JYd*5i%2WL\u0011", "\u001ab^:\")KO.~Df6{\t6sI\fXM|,\u0017.y\f8\u0006)?bS", "", "1n\\=b5>\\(J", "u(3", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "-kPA\\;NR\u0019", "-k^;Z0Mc\u0018~", "-`[A\\;NR\u0019", "-`R0h9:Q-", "-uT?g0<O Zx\\<\n\u0005-y", "1n_F", "uC3\u0019](OOb\u0006vg.Fg9u|/{\u0016g\u001c\u0013XkWCr.7#\\*Gj\u001d.#*@gE\u001a^o]B\t-\u000bX\u0007$NL$oCP|E]\u000fg\nc+V\rc@$uR\u0001)\u0018;K\f?q\u0003Ur\u001b1\u007fp)`\u000eC\t\u0019\u007fJ~", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "6`b566=S", "u(8", "", "=sW2e", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "\u0012", "\u001aiPCTuEO\"\u0001D=6\r\u00066eU", "5dc\u0019T;Bb)}z", ":`c6g<=S", "5dc\u0019b5@W(\u000fy^", ":n]4\\;NR\u0019", "5dc\u000e_;Bb)}z", "/kc6g<=S", "5dc\u000eV*N`\u0015|\u000f", "/bRBe(<g", "5dc#X9MW\u0017z\u0002:*z\u0019<a}<", "DdaA\\*:Zt|xn9x\u0007C", "\nh]6g\u0005", "uC3\u0019](OOb\u0006vg.Fg9u|/{\u0016g\u001c\u0013XkWCr.7#\\*Gj\u001d.#*@gE\u001a^o]B\t-\u000bX\u0007$NL$oM", "\u001a`]1e6BRb\u0006\u0005\\(\f\r9nI\u000f\u0006>|&\u001bQxc", ":nR.g0H\\", "uKP;W9HW\u0018H\u0002h*x\u00183o\tqbJ~\u0013&Ky\u0017\u0012:\u0016", "8r^;B)CS\u0017\u000e", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOVZ\b", "\u0011n\\=T5B]\"", "0n\u001e.c7\b_\u0018", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class BrazeLocation implements IBrazeLocation {
    private static final qd Companion = new qd();
    private final Double _accuracy;
    private final Double _altitude;
    private final double _latitude;
    private final double _longitude;
    private final Double _verticalAccuracy;

    public BrazeLocation(double d2, double d3) {
        this(d2, d3, null, null, null, 28, null);
    }

    public BrazeLocation(double d2, double d3, Double d4) {
        this(d2, d3, d4, null, null, 24, null);
    }

    public BrazeLocation(double d2, double d3, Double d4, Double d5) {
        this(d2, d3, d4, d5, null, 16, null);
    }

    public BrazeLocation(double d2, double d3, Double d4, Double d5, Double d6) {
        this._latitude = d2;
        this._longitude = d3;
        this._altitude = d4;
        this._accuracy = d5;
        this._verticalAccuracy = d6;
        if (!ValidationUtils.isValidLocation(getLatitude(), getLongitude())) {
            throw new IllegalArgumentException("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively".toString());
        }
    }

    public /* synthetic */ BrazeLocation(double d2, double d3, Double d4, Double d5, Double d6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, d3, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : d4, (i2 & 8) != 0 ? null : d5, (i2 & 16) == 0 ? d6 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null, location.hasAccuracy() ? Double.valueOf(location.getAccuracy()) : null, qd.a(Companion, location));
        Intrinsics.checkNotNullParameter(location, "location");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(JSONObject jsonObject) {
        this(jsonObject.getDouble(IBrazeLocation.LATITUDE), jsonObject.getDouble(IBrazeLocation.LONGITUDE), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.ALTITUDE), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.ACCURACY), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.VERTICAL_ACCURACY));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
    }

    private final double component1() {
        return this._latitude;
    }

    private final double component2() {
        return this._longitude;
    }

    private final Double component3() {
        return this._altitude;
    }

    private final Double component4() {
        return this._accuracy;
    }

    private final Double component5() {
        return this._verticalAccuracy;
    }

    public static /* synthetic */ BrazeLocation copy$default(BrazeLocation brazeLocation, double d2, double d3, Double d4, Double d5, Double d6, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            d2 = brazeLocation._latitude;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            d3 = brazeLocation._longitude;
        }
        if ((4 & i2) != 0) {
            d4 = brazeLocation._altitude;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            d5 = brazeLocation._accuracy;
        }
        if ((i2 & 16) != 0) {
            d6 = brazeLocation._verticalAccuracy;
        }
        return brazeLocation.copy(d2, d3, d4, d5, d6);
    }

    public final BrazeLocation copy(double d2, double d3, Double d4, Double d5, Double d6) {
        return new BrazeLocation(d2, d3, d4, d5, d6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazeLocation)) {
            return false;
        }
        BrazeLocation brazeLocation = (BrazeLocation) obj;
        return Double.compare(this._latitude, brazeLocation._latitude) == 0 && Double.compare(this._longitude, brazeLocation._longitude) == 0 && Intrinsics.areEqual((Object) this._altitude, (Object) brazeLocation._altitude) && Intrinsics.areEqual((Object) this._accuracy, (Object) brazeLocation._accuracy) && Intrinsics.areEqual((Object) this._verticalAccuracy, (Object) brazeLocation._verticalAccuracy);
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IBrazeLocation.LATITUDE, getLatitude());
            jSONObject.put(IBrazeLocation.LONGITUDE, getLongitude());
            if (getAltitude() != null) {
                jSONObject.put(IBrazeLocation.ALTITUDE, getAltitude());
            }
            if (getAccuracy() != null) {
                jSONObject.put(IBrazeLocation.ACCURACY, getAccuracy());
            }
            if (getVerticalAccuracy() != null) {
                jSONObject.put(IBrazeLocation.VERTICAL_ACCURACY, getVerticalAccuracy());
            }
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) rd.f1675a, 4, (Object) null);
        }
        return jSONObject;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAccuracy() {
        return this._accuracy;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAltitude() {
        return this._altitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLatitude() {
        return this._latitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLongitude() {
        return this._longitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getVerticalAccuracy() {
        return this._verticalAccuracy;
    }

    public int hashCode() {
        int iHashCode = (Double.hashCode(this._longitude) + (Double.hashCode(this._latitude) * 31)) * 31;
        Double d2 = this._altitude;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this._accuracy;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this._verticalAccuracy;
        return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        return "BrazeLocation(_latitude=" + this._latitude + ", _longitude=" + this._longitude + ", _altitude=" + this._altitude + ", _accuracy=" + this._accuracy + ", _verticalAccuracy=" + this._verticalAccuracy + ')';
    }
}
