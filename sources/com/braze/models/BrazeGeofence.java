package com.braze.models;

import bo.app.pa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u00186Ȑ\u0007\":\u001b\u007f\u0007ljA0RqP.XV2\u000fy\u0002<$a$yCI٥\"}(\u0010WNukvJ`0I\u0014\u001cǝ\u0017)\\Qe|m\u0014%1pom2}uM;ptdӌN3Z79Eh ݒX\u0014\u0005\u000f[K:\u0012@D~Pj\r{\u000b*\u0016\u0014X8\u0001LuwRDf\u0005]hH3\u0007wbf'\u000e<\rQ\u001bil';\u0003q\"9eO5C1c\u0007\u0015ys?1B\u0002A\u0013\u0014?'YL\u0004[D\u0006\u0018\u0014C._\u0011k\">\\3Tp\u00105\\gcy\\ˎ,y\u00017\u001bxD\u001d\f;X2;.~\b<3ϢvUF\f\u0010\u001c\u000b\u0013\teN\u0017S\u0003c/G\u001d~Q\u0010ݢϭR9\u0002\t\u001b#k\u000e|(sT<f[/ƻ{S7XNE\u0011[\u0018bUm2p)\u0016ò\b2M\t=\u0006YD%2O[g/Qo\u0010S\\g%ݓ'üSׂVJF/|$\u007fB\u0017\u001crD\u0013\b\u001cVbcD\u0013c\u001b\u0003\u0016D݈\u0013ء`yB13!\u0017\\v{\u0003M\f\u0016kCϬ;[t}\u001cj\npAIic>a\tvj̶>И\t\\nDY hqx7@^\u0003\u0010&\u0002zRܟ\u0017<Gs\"J:H1^\u001b`\u0011&\u0013V\u000b#wZ\u0017)5Xտ(\rq&z#\u000fktru\u0004\u0007f|\u0012n@EA\u007fNO*Ɓ&r<~)%\r\u000f\u0018ImkUi=+\u0004u\u0014 D&oVȠA\u001d\u0017\u0001/R\u0010N]Nx\b_`b<\t \u0012\u000fitdkŰnz4bpm]u/$|\u0003\u00016Xy\u000e\u001fyF)S\u001aXߏ_HQt\t~JoP~\u000bE,8Q\u00050$M-q*S\u001a߳\u00189\u001dcc\u0011}V\u0012d\u0015O\u0003\u0010TAqA\bb\u007f`h?ΒMc\u0007@(Oz+ZJp$\u0016lYI\u001b``A\u0013s\r=Ԫ\u000f9\u0006h\rY\u001b\u0019n]@A}(\u0005CmY\fC,\u0017\u0015HѼ\u0015W[is\u001dY\u0005#L\u0015:\u0019&\u0002\u0004 MU \u0005c\u0019\u000eޘ\n} 8Glp&T\u000b*f:OX1Q\b\u0002\u0006>\u00146J\u001e\u0013mϰNǠ?l\u0016V~\u0010dc\u0015bK\u0018/b\u0019\u0001\u0015g,\u0016U3\u000b#T\u000b\u007fr@;k\u001d74!\u0014ǎj)CFZr)E\u0098\u0005K"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI\u0005\t<\u0016\u0017xGy\u000f<\u007f#5/", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "", "=sW2e\u000e>]\u001a~\u0004\\,", "", "3pd6i(ES\"\u000eh^9\u000e\t<D{7w", "uKR<`u;`\u0015\u0014z(4\u0007\b/l\u000eqXM|,\u0017)o\u0018=v.3YSc,", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "=sW2e", "", "1n\\=T9>B#", "uKR<`u;`\u0015\u0014z(4\u0007\b/l\u000eqXM|,\u0017)o\u0018=v.3YSc\u001b", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "6`b566=S", "u(8", "8r^;B)CS\u0017\u000e", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "7c", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0016W", "", ":`c6g<=S", "\u0012", "5dc\u0019T;Bb)}z", "u(3", ":n]4\\;NR\u0019", "5dc\u0019b5@W(\u000fy^", "@`S6h:&S(~\b", "\u0017", "5dc\u001fT+Bc'fzm,\n", "1n^9W6P\\x\b\n^9j\t-o\t'\n", "5dc\u0010b6ER#\u0011\u0004>5\f\t<S\u007f&\u0006I\u007f%", "1n^9W6P\\x\u0012~m\u001a|\u00079n~6", "5dc\u0010b6ER#\u0011\u0004>?\u0001\u0018\u001de}2\u0005?\u000f", "/mP9l;BQ'^\u0004Z)\u0004\t.E\t7{M", "(", "5dc\u000ea(Eg(\u0003xl\f\u0006\u0005,l\u007f'[I\u0010\u0017$", "u(I", "/mP9l;BQ'^\u0004Z)\u0004\t.E\u0013,\u000b", "5dc\u000ea(Eg(\u0003xl\f\u0006\u0005,l\u007f'[S\u0005&", "3mc2e\fOS\"\u000e\t", "5dc\u0012a;>`x\u0010zg;\u000b", "3wXA8=>\\(\r", "5dc\u0012k0M3*~\u0004m:", "<nc6Y0<O(\u0003\u0005g\u0019|\u0017:o\t6\u007fQ\u0001 \u0017U}uJ", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001ce\u000e3\u0006I\u000f\u001b(Gx\u000eJ\u0005\rC", "2hbAT5<Sy\f\u0005f\u000e|\u00130e\t&{-\u0001\u0018$G}\u0011", "5dc\u0011\\:MO\"|z?9\u0007\u0011\u0011e\n){I~\u0017\u0004Gp\u001b<\u0005(", "Adc\u0011\\:MO\"|z?9\u0007\u0011\u0011e\n){I~\u0017\u0004Gp\u001b<\u0005(", "uC\u0018#", "5dc\u0011\\:MO\"|z?9\u0007\u0011\u0011e\n){I~\u0017\u0004Gp\u001b<\u0005(sU\u0007)A|\u0012=QMDy", "u(E", "5dc\u001fT+Bc'fzm,\n\u0017", "@`S6h:&S(~\bl", "\nh]6g\u0005", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\u001aJ\u0018\u0002x]V.{Go?", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOVZ\b", "\u0011n\\=T5B]\"", "0n\u001e.c7\b^\u0015", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    private static final String ANALYTICS_ENABLED_ENTER = "analytics_enabled_enter";
    private static final String ANALYTICS_ENABLED_EXIT = "analytics_enabled_exit";
    private static final String COOLDOWN_ENTER_SECONDS = "cooldown_enter";
    private static final String COOLDOWN_EXIT_SECONDS = "cooldown_exit";
    public static final pa Companion = new pa();
    private static final int DEFAULT_NOTIFICATION_RESPONSIVENESS_MS = 30000;
    private static final String ENTER_EVENTS = "enter_events";
    private static final String EXIT_EVENTS = "exit_events";
    private static final String ID = "id";
    private static final String LATITUDE = "latitude";
    private static final String LONGITUDE = "longitude";
    private static final String NOTIFICATION_RESPONSIVENESS_MS = "notification_responsiveness";
    private static final String RADIUS_METERS = "radius";
    private final boolean analyticsEnabledEnter;
    private final boolean analyticsEnabledExit;
    private final int cooldownEnterSeconds;
    private final int cooldownExitSeconds;
    private double distanceFromGeofenceRefresh;
    private final boolean enterEvents;
    private final boolean exitEvents;
    private final String id;
    private final JSONObject jsonObject;
    private final double latitude;
    private final double longitude;
    private final int notificationResponsivenessMs;
    private final int radiusMeter;

    /* JADX WARN: Illegal instructions before constructor call */
    public BrazeGeofence(JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(ID)");
        this(jsonObject, string, jsonObject.getDouble("latitude"), jsonObject.getDouble("longitude"), jsonObject.getInt(RADIUS_METERS), jsonObject.getInt(COOLDOWN_ENTER_SECONDS), jsonObject.getInt(COOLDOWN_EXIT_SECONDS), jsonObject.getBoolean(ANALYTICS_ENABLED_ENTER), jsonObject.getBoolean(ANALYTICS_ENABLED_EXIT), jsonObject.optBoolean(ENTER_EVENTS, true), jsonObject.optBoolean(EXIT_EVENTS, true), jsonObject.optInt(NOTIFICATION_RESPONSIVENESS_MS, 30000));
    }

    public BrazeGeofence(JSONObject jsonObject, String id, double d2, double d3, int i2, int i3, int i4, boolean z2, boolean z3, boolean z4, boolean z5, int i5) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(id, "id");
        this.jsonObject = jsonObject;
        this.id = id;
        this.latitude = d2;
        this.longitude = d3;
        this.radiusMeter = i2;
        this.cooldownEnterSeconds = i3;
        this.cooldownExitSeconds = i4;
        this.analyticsEnabledEnter = z2;
        this.analyticsEnabledExit = z3;
        this.enterEvents = z4;
        this.exitEvents = z5;
        this.notificationResponsivenessMs = i5;
        this.distanceFromGeofenceRefresh = -1.0d;
    }

    public static /* synthetic */ void getDistanceFromGeofenceRefresh$annotations() {
    }

    @Override // java.lang.Comparable
    public int compareTo(BrazeGeofence other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d2 = this.distanceFromGeofenceRefresh;
        return (d2 != -1.0d && d2 < other.distanceFromGeofenceRefresh) ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(BrazeGeofence.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.braze.models.BrazeGeofence");
        BrazeGeofence brazeGeofence = (BrazeGeofence) obj;
        return Intrinsics.areEqual(this.id, brazeGeofence.id) && this.latitude == brazeGeofence.latitude && this.longitude == brazeGeofence.longitude && this.radiusMeter == brazeGeofence.radiusMeter && this.cooldownEnterSeconds == brazeGeofence.cooldownEnterSeconds && this.cooldownExitSeconds == brazeGeofence.cooldownExitSeconds && this.analyticsEnabledEnter == brazeGeofence.analyticsEnabledEnter && this.analyticsEnabledExit == brazeGeofence.analyticsEnabledExit && this.enterEvents == brazeGeofence.enterEvents && this.exitEvents == brazeGeofence.exitEvents && this.notificationResponsivenessMs == brazeGeofence.notificationResponsivenessMs;
    }

    public final boolean equivalentServerData(BrazeGeofence otherGeofence) {
        Intrinsics.checkNotNullParameter(otherGeofence, "otherGeofence");
        try {
            return Intrinsics.areEqual(this, otherGeofence);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        return this.jsonObject;
    }

    public final boolean getAnalyticsEnabledEnter() {
        return this.analyticsEnabledEnter;
    }

    public final boolean getAnalyticsEnabledExit() {
        return this.analyticsEnabledExit;
    }

    public final int getCooldownEnterSeconds() {
        return this.cooldownEnterSeconds;
    }

    public final int getCooldownExitSeconds() {
        return this.cooldownExitSeconds;
    }

    public final double getDistanceFromGeofenceRefresh() {
        return this.distanceFromGeofenceRefresh;
    }

    public final boolean getEnterEvents() {
        return this.enterEvents;
    }

    public final boolean getExitEvents() {
        return this.exitEvents;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getNotificationResponsivenessMs() {
        return this.notificationResponsivenessMs;
    }

    public final int getRadiusMeter() {
        return this.radiusMeter;
    }

    public final double getRadiusMeters() {
        return this.radiusMeter;
    }

    public int hashCode() {
        return Double.hashCode(getRadiusMeters()) + ((((Boolean.hashCode(this.exitEvents) + ((Boolean.hashCode(this.enterEvents) + ((Boolean.hashCode(this.analyticsEnabledExit) + ((Boolean.hashCode(this.analyticsEnabledEnter) + ((((((((Double.hashCode(this.longitude) + ((Double.hashCode(this.latitude) + ((this.id.hashCode() + (this.jsonObject.hashCode() * 31)) * 31)) * 31)) * 31) + this.radiusMeter) * 31) + this.cooldownEnterSeconds) * 31) + this.cooldownExitSeconds) * 31)) * 31)) * 31)) * 31)) * 31) + this.notificationResponsivenessMs) * 31);
    }

    public final void setDistanceFromGeofenceRefresh(double d2) {
        this.distanceFromGeofenceRefresh = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BrazeGeofence{id=");
        sb.append(this.id).append(", \n            |latitude, longitude=(").append(this.latitude).append(", ").append(this.longitude).append("),\n            |radiusMeters=").append(this.radiusMeter).append(", \n            |cooldownEnterSeconds=").append(this.cooldownEnterSeconds).append(", \n            |cooldownExitSeconds=").append(this.cooldownExitSeconds).append(", \n            |analyticsEnabledEnter=").append(this.analyticsEnabledEnter).append(", \n            |analyticsEnabledExit=").append(this.analyticsEnabledExit).append(", \n            |enterEvents=").append(this.enterEvents).append(", \n            |exitEvents=").append(this.exitEvents).append(", \n            |notificationResponsivenessMs=").append(this.notificationResponsivenessMs).append(", \n            |distanceFromGeofenceRefresh=");
        sb.append(this.distanceFromGeofenceRefresh).append(" }\n            |\n        ");
        return StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }
}
