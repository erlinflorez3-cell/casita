package com.biocatch.android.commonsdk.collection.collectors.touch;

import android.view.MotionEvent;
import com.biocatch.android.commonsdk.backend.CollectionItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\fnjG4LeN.ZS8\u0014s{:&c$\bCCU (*\teNo˧\u0005Ϻ\u000b\u000bq\u000eFȏwz4OU\u0007]*\u0011HA\u001e@CUu=Gb\r8\u001b\u001f`%H}\u0013\u00052*v\u0013\u0007\u0003IK\u001a\u0017HB\u00079\u0001\u000e]\t(\u0018\u001e>N\u0002.dmNDO\u0005_P.Q\u0004yJT'm8\u0015O#E\u0003(\u001d~g\u001e9IO7+$\u0002\u0004\u0017Za?\u0011I\n?\u001bgU2;QyWDd\u0018\u0016+*}\u0018mz,\\\u0013^x\u000e=*}q[X\u0014(\u0006\n\u0014\u000fR\u0003<\u00077P4-(v \u0010Is!^PX\b^P\u0011\u0013cL\u0016S\u000bC3?\u001btcy=/Me\u000f˿\u0011\u001e1\u00157'i\u0014&`C[\u001b\f\"M_@UJd\t\b>DՕ|Ċ\u00068\f0U\u0019G}\u0017C%;W]?:/\u0004RYRy\u000f\u0007vg\u0002|ʐLF*Â.90#\u001au\u0015\u0001\u0013mhVn+?PrΈ\u0013ą\f!(\\\u0006\\9'\u0016j]\u0006\nlS{\u0018D\u007f\u0003E^\u0007m$Vg_\n̗]Ӓ\u0014oZv\"XTd\u000bytXs\u000e`~6:\u0003Wx\u0016\u0010{rOܟ\u00178Gڤ462T'\u0001ed\u0011(ZC\u0013\b\u000ee?ɴ\u000bՁ72\u000bi2\u001e!\u0003V\u0002~\u0016\bzOS\u000b\trIO]M\u001b<TPs\u000bñ/ȷ\u0003\u0002\bGuu_Nr@\u0004{\u001c\"\u001cEGy\u007fY!\u001f\u0017+H\u0001[P#ǰq˛Q /z\u000b#'=nZu.\u000br2\u000exr p%1\u000f`\t\"6eVןmâ~UkT\u0019tVKx1gRn:\u00034-6u\u0010}&\u00155[Fے!\u001c\u007fҡG\u0017g\u000ew!~\u0016p >v{\u0003Znl˸nжa@C8W\u0003\u0017@(Vz)bJp+\u0016jYP\u001b<`Czo\u00059$ߙ;̱j\u00154\r~os<\u0019$\fJNa0)Q\u0016dzQ2)Oif\u001c{\"œ\u0017Ί\u0013\u0018\u0013{?)*\u001eCVd\u000f\u0003\u000b6>\u0002Q\u0007]Ii\u001d>\u001f#b-\u0013ޑ\u0017ͲXw\u000e\u0010\t\u0019^a\u0015R@X\u0014=\\Jb\u0011-rV\rxGv X\u0002U۷?\u038b|C9\u0005{_l1io\u000fi=\u000b!)]\u0017ݣ)l"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pVV^*_\u001caG$\u0010]m_+\u0016\u0014AK#nK\r", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", "3uT;g\u001bR^\u0019", "6`b5", "F", "G", "Bnd0[\u0010GR\u0019\u0012", ";`Y<e\bQW'", "", ";h]<e\bQW'", "Bnd0[\u0017KS'\r\u000bk,", "", "And?V,-g$~", "Ahi2", "Bnd0[\bKS\u0015h\bb,\u0006\u0018+t\u00042\u0005", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q'\u0006\u0013(C9\u00158\u007f'~@\b)9Cz\u0015R?Lg}%\u0011qc\u0003jl;Nx'T\"2\u0013aN\u00049]\u0019V\u0017Ptp\u000ehA&nQ\r\u0006\r(Z}\u0005o|\u0015\u0018W\u0019s\u007fBX\u0010TO{z=:d\u0010`[\u0003I\u000b)k9d\u000e_*2!? %mb\"dY0SZ]!oYy=NL\u0015\f4mEidH\u000fN_Lq.\u001f!b|\u000eCT>2p6\u0006}\u000b=n\u0001Z=~CZ\n\u0011uc=0(\u007f \u001cNKeuy\u0014tm\u001br\u0004Wi1:\u001b/DmX\f\u000e]lB:]p|\u0001Y\u0002GK9s1V{I[O{\u0005\u0010#zoMBde\u0005\u001a\u0003\u000e\ni \u0007\row-.\u001fL/RY", "5dc\u0010b5MS,\u000e^=", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0010b5MS,\u000e^=", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0012i,Gb", "u(;.a+K]\u001d}Do0|\u001bxM\n7\u007fJ\nv(Gx\u001d\u0012", "5dc\u0012i,Gb|]", "u(;7T=:\u001d z\u0004`uc\u00138gU", "Adc\u0012i,Gb|]", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;C\u0019", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc\u0012i,Gb\b\u0013\u0006^", "Adc\u0012i,Gb\b\u0013\u0006^", "5dc\u0015T:A", "u(8", "5dc\u001aT1H`t\u0012~l", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "Adc\u001aT1H`t\u0012~l", "uKY.i(\bZ\u0015\b|(\u000b\u0007\u0019,l\u007f}?1", "\u001aiPCTuEO\"\u0001D=6\r\u00066eU", "5dc\u001a\\5H`t\u0012~l", "Adc\u001a\\5H`t\u0012~l", "5dc \\A>", "Adc \\A>", "5dc b<KQ\u0019m\u000fi,", "Adc b<KQ\u0019m\u000fi,", "5dc!\\4>a(z\u0003i", "u(9", "5dc!b<<Vt\fzZ\u0016\n\r/n\u000f$\u000bD\u000b ", "Adc!b<<Vt\fzZ\u0016\n\r/n\u000f$\u000bD\u000b ", "5dc!b<<V|\by^?", "Adc!b<<V|\by^?", "5dc!b<<V\u0004\fzl:\r\u0016/", "u(;7T=:\u001d z\u0004`u]\u00109a\u000f}", "Adc!b<<V\u0004\fzl:\r\u0016/", "uKY.i(\bZ\u0015\b|(\r\u0004\u0013+tUkl", "\u001aiPCTuEO\"\u0001D?3\u0007\u0005>;", "5dc%", "Adc%", "5dc&", "Adc&", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TouchEventModel extends CollectionItem {
    private Integer contextID;
    private final MotionEvent event;
    private Long eventID;
    private Integer eventType;
    private final int hash;
    private Double majorAxis;
    private Double minorAxis;
    private Double size;
    private Integer sourceType;
    private final long timestamp;
    private Double touchAreaOrientation;
    private Integer touchIndex;
    private Float touchPressure;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Integer f2610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Integer f2611y;

    public TouchEventModel(Integer num, Long l2, long j2, Integer num2, int i2, Integer num3, Integer num4, Integer num5, Double d2, Double d3, Float f2, Integer num6, Double d4, Double d5, MotionEvent motionEvent) {
        this.contextID = num;
        this.eventID = l2;
        this.timestamp = j2;
        this.eventType = num2;
        this.hash = i2;
        this.f2610x = num3;
        this.f2611y = num4;
        this.touchIndex = num5;
        this.majorAxis = d2;
        this.minorAxis = d3;
        this.touchPressure = f2;
        this.sourceType = num6;
        this.size = d4;
        this.touchAreaOrientation = d5;
        this.event = motionEvent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TouchEventModel(Integer num, Long l2, long j2, Integer num2, int i2, Integer num3, Integer num4, Integer num5, Double d2, Double d3, Float f2, Integer num6, Double d4, Double d5, MotionEvent motionEvent, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? num : num, (i3 + 2) - (i3 | 2) != 0 ? 0L : l2, j2, (i3 & 8) != 0 ? Integer.valueOf(TouchActions.UNSUPPORTED.ordinal()) : num2, i2, (i3 & 32) != 0 ? num : num3, (i3 + 64) - (i3 | 64) != 0 ? num : num4, (-1) - (((-1) - i3) | ((-1) - 128)) == 0 ? num5 : 0, (i3 + 256) - (i3 | 256) != 0 ? Double.valueOf(0.0d) : d2, (i3 & 512) != 0 ? Double.valueOf(0.0d) : d3, (-1) - (((-1) - i3) | ((-1) - 1024)) != 0 ? Float.valueOf(0.0f) : f2, (i3 & 2048) != 0 ? Integer.valueOf(TouchSourceType.UNSUPPORTED.ordinal()) : num6, (i3 + 4096) - (i3 | 4096) != 0 ? Double.valueOf(0.0d) : d4, (-1) - (((-1) - i3) | ((-1) - 8192)) != 0 ? Double.valueOf(0.0d) : d5, (-1) - (((-1) - i3) | ((-1) - 16384)) != 0 ? null : motionEvent);
    }

    public final Integer getContextID() {
        return this.contextID;
    }

    public final MotionEvent getEvent() {
        return this.event;
    }

    public final Long getEventID() {
        return this.eventID;
    }

    public final Integer getEventType() {
        return this.eventType;
    }

    public final int getHash() {
        return this.hash;
    }

    public final Double getMajorAxis() {
        return this.majorAxis;
    }

    public final Double getMinorAxis() {
        return this.minorAxis;
    }

    public final Double getSize() {
        return this.size;
    }

    public final Integer getSourceType() {
        return this.sourceType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final Double getTouchAreaOrientation() {
        return this.touchAreaOrientation;
    }

    public final Integer getTouchIndex() {
        return this.touchIndex;
    }

    public final Float getTouchPressure() {
        return this.touchPressure;
    }

    public final Integer getX() {
        return this.f2610x;
    }

    public final Integer getY() {
        return this.f2611y;
    }

    public final void setContextID(Integer num) {
        this.contextID = num;
    }

    public final void setEventID(Long l2) {
        this.eventID = l2;
    }

    public final void setEventType(Integer num) {
        this.eventType = num;
    }

    public final void setMajorAxis(Double d2) {
        this.majorAxis = d2;
    }

    public final void setMinorAxis(Double d2) {
        this.minorAxis = d2;
    }

    public final void setSize(Double d2) {
        this.size = d2;
    }

    public final void setSourceType(Integer num) {
        this.sourceType = num;
    }

    public final void setTouchAreaOrientation(Double d2) {
        this.touchAreaOrientation = d2;
    }

    public final void setTouchIndex(Integer num) {
        this.touchIndex = num;
    }

    public final void setTouchPressure(Float f2) {
        this.touchPressure = f2;
    }

    public final void setX(Integer num) {
        this.f2610x = num;
    }

    public final void setY(Integer num) {
        this.f2611y = num;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(clearNull(this.contextID));
        jSONArray.put(clearNull(this.eventID));
        jSONArray.put(this.timestamp);
        jSONArray.put(clearNull(this.eventType));
        jSONArray.put(2);
        jSONArray.put(this.hash);
        jSONArray.put(clearNull(this.f2610x));
        jSONArray.put(clearNull(this.f2611y));
        jSONArray.put(clearNull(this.touchIndex));
        jSONArray.put(clearNull(this.majorAxis));
        jSONArray.put(clearNull(this.minorAxis));
        jSONArray.put(-1);
        jSONArray.put(-1);
        jSONArray.put(-1);
        jSONArray.put(-1);
        jSONArray.put(0);
        jSONArray.put(clearNull(this.touchPressure));
        jSONArray.put(clearNull(this.sourceType));
        jSONArray.put(clearNull(this.size));
        jSONArray.put(clearNull(this.touchAreaOrientation));
        return jSONArray;
    }
}
