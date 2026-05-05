package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.horcrux.svg.events.SvgLoadEvent;
import com.rncamerakit.events.ErrorEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4C\u0007\":\u001e\u007f\u0007loA0ZeP\u008cZS8\u0017s{:'qҕ\u0010Uk[*\u007f2\t}Ȟ\u0016f'Jl\u001e\u0004l\f\u0016\tn:Imx\f\u0013\u001f6PqW3{pM=nwN\u0005N32@\u007f\u0005\u000f\u001eBJ&u)H[\u0014\u00180NvRT#L3\u001f\"\fD \u000f%tg|7Xrc:=+\u001bipO7e6|[\u0016^TU\u000e\u0007g$+NAM\u0015STΫ\u000bRiJKE\u007fI\u001dhU4qI<]Df\u0018\u0014C:\u0016!&z4l\u001dSv\u000bU8\u0016u\u0014V\u001c9\u0010z*\u0012\u0003\u0018^\u00145LF/0e6\u0013\nςtՂDP\nމ\u0013\f\tdN\u0017S\u0001\nڂ;ӸjQiݢiZE\u0004\u001d\rL$W͜#ƟX\u000ehٽk`\u0006ZIQn>\u001fݓ\fՒAm\f͏3\u00108\nHI\u0016.*\u0016\u0005ϒ'ھ_9+ܩ<\u000eVN\u007fv3a?\u05c8kʐL@*ÂfC8\u0010$Zre[ߛRԜ\\,\u0019۳ɥX\u001b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#a(3o\u0016\u0015W?:KE\u001e\u001ew7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "Ata3T*>7\u0018", "", "DhTD<+", "3uT;g\u001bR^\u0019", "3qa<e\u0014>a'z|^", "", "And?V,.`\u001d", "EhSA[", "6dX4[;", ":nP1X+", "Bnc._", "uH8\u0016?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\u001fO\u0018\u0002XY", "1qT.g,\u001ed\u0019\b\n=(\f\u0005\u001do\u00105y@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "5dc\u0010b(ES'|~g.b\tC", "", "5dc\u0012i,Gbwz\nZ", "5dc\u0012i,Gb\u0002z\u0003^", "\u0011n\\=T5B]\"", "\u0017lP4X\fOS\"\u000eir7|", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ImageLoadEvent extends Event<ImageLoadEvent> {
    public static final Companion Companion = new Companion(null);
    public static final int ON_ERROR = 1;
    public static final int ON_LOAD = 2;
    public static final int ON_LOAD_END = 3;
    public static final int ON_LOAD_START = 4;
    public static final int ON_PROGRESS = 5;
    private final String errorMessage;
    private final int eventType;
    private final int height;
    private final int loaded;
    private final String sourceUri;
    private final int total;
    private final int width;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u000e\u0007nj?1LeV/ZS0\u0010s{B0c$wJA٬\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\t:Pmx\f\u001a?6PxW3{qm=n~N\u0005N4R<\b\u0010\u0019\u001aXTV{CYY\u0013*0nxjV\u001bW\u001d\u001a@\bn$\u000f)tg|B\u000fq&H=0\u001bipVWc>\u0007e\rtVm\u0012?w,8X7c\u001dUW\u0011\u0010j[m\u0005ouK\u000f\u0001'U-\u0010x ff\u000e,\u0015YW=a\u0001/t\u0005\u007fb<+9Y{K~\u0010X}\t\u000b%>\u001a\r47x2;+~\b<5%vaRh\u0002\rDF\u007f*^%3\u00183YAKj_kS\u0019|9,\u000b\u001b-;\u0003\u0005 \nd>d#,lw\u007f3\u0002DKZf\n\b?4\t9p\u0010=\u001c0u\b_\u007f\u001f8/%e]\u007f(i\u0002\u0010[\\g%\r\u0011larjHn$\u001f\u001aE4!\f\tF+\n4\u0001blD\u0011{$\u0005\u000b\f\u0011+ \u000byl%3\u001afO\u0017k\u001bSk\u0019=1|6\b~\u001c\u0012eNv3cS\u0014\u0014oh\u000f\u0014m>)\n!\u000fPg$Z\u000b0R6Vt(w*F~\u0012!AWs23ZAI`#]\u001b\u001epC-\rmp\u0001\u0010-Vy)Kw2\f!\u0001~l!su\u0011a,+bh2\u0012]C\u001a>UPj\u000bñuȷ\u0003s\bø8XUO\u0005\u0016$WR\u0094h׀=Q7ˋc\u001b\r-J\u0002[G#ǰ8˛Q\u0012/ϕM\u0006\u001d@\u0001.\u0016\nAѸ~߯nJWܷg.\u0005d\u000b#6fVן4â~GkҺߕ_W"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#a(3o\u0016\u0015W?:KE\u001e\u001ew \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u001dMN\u0012E\u0019(@", "", "\u001dMN\u0019B\b\u001d", "\u001dMN\u0019B\b\u001dMxgY", "\u001dMN\u0019B\b\u001dM\u0007mVK\u001b", "\u001dMN\u001dE\u0016 @xlh", "1qT.g,\u001e`&\t\b>=|\u0012>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#a(3o\u0016\u0015W?:KE\u001e\u001ew7", "Ata3T*>7\u0018", "DhTD<+", "Bga<j(;Z\u0019", "", "1qT.g,%]\u0015}Zg+\\\u001a/n\u000f", "1qT.g,%]\u0015}Zo,\u0006\u0018", "7lP4X\u001cKW", "", "EhSA[", "6dX4[;", "1qT.g,%]\u0015}hm(\n\u0018\u000fv\u007f1\u000b", "1qT.g,)`#\u0001\b^:\u000bh@e\t7", ":nP1X+", "Bnc._", "3uT;g\u0015:[\u0019_\u0005k\u001b\u0011\u0014/", "3uT;g\u001bR^\u0019", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ImageLoadEvent createErrorEvent(int i2, int i3, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new ImageLoadEvent(i2, i3, 1, throwable.getMessage(), null, 0, 0, 0, 0, null);
        }

        @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u0011`n[\u001b\f\u001bm\u001af6\\s|a}3t(`lCa\u001cmQV*<=\u001bjX\u0013alIFjQs%!Y\u001aE\u001e{\u001d\u00062\r\u0003v\u001dY=|o)\u001d\tM\u001eS", replaceWith = @ReplaceWith(expression = "createErrorEvent(surfaceId, viewId, throwable)", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ImageLoadEvent createErrorEvent(int i2, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return createErrorEvent(-1, i2, throwable);
        }

        @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u0018]]Pm5\tM\"W\u0005Z.\u0001S\u00077owZ$VU]|xK6CF\u001bYU\u000e.q\bOfI9%KZ)V!w7\u0007[\u0010/8/\u000b~\n\u001d#\u001a\u0003]\u001dD\tU", replaceWith = @ReplaceWith(expression = "createLoadEndEvent(surfaceId, viewId)", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ImageLoadEvent createLoadEndEvent(int i2) {
            return createLoadEndEvent(-1, i2);
        }

        @JvmStatic
        public final ImageLoadEvent createLoadEndEvent(int i2, int i3) {
            return new ImageLoadEvent(i2, i3, 3, null, null, 0, 0, 0, 0, 504, null);
        }

        @JvmStatic
        public final ImageLoadEvent createLoadEvent(int i2, int i3, String str, int i4, int i5) {
            return new ImageLoadEvent(i2, i3, 2, null, str, i4, i5, 0, 0, null);
        }

        @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u0018]]Pm=\nv \u0012\rK\u0001}W\u00042&|TeV\ra\u0001IR'6C&be96YS@x}G'\u001eM\u0015G _8As\u001f/8*\u000b~\u000ed7\u0015\u0001V$", replaceWith = @ReplaceWith(expression = "createLoadEvent(surfaceId, viewId, imageUri, width, height)", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ImageLoadEvent createLoadEvent(int i2, String str, int i3, int i4) {
            return createLoadEvent(-1, i2, str, i3, i4);
        }

        @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u0018]]P{;\u0006z 7\rK|~\u000e\u000b)x{UsP\rpp:Z]8R\"bU|+lTT%R5\u001d\u0011ZSW0\t:\u0003u\u0011X;[L\u0011;^0G|Z\u0017T\bF<<", replaceWith = @ReplaceWith(expression = "createLoadStartEvent(surfaceId, viewId)", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ImageLoadEvent createLoadStartEvent(int i2) {
            return createLoadStartEvent(-1, i2);
        }

        @JvmStatic
        public final ImageLoadEvent createLoadStartEvent(int i2, int i3) {
            return new ImageLoadEvent(i2, i3, 4, null, null, 0, 0, 0, 0, 504, null);
        }

        @JvmStatic
        public final ImageLoadEvent createProgressEvent(int i2, int i3, String str, int i4, int i5) {
            return new ImageLoadEvent(i2, i3, 5, null, str, 0, 0, i4, i5, null);
        }

        @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u001c`kS\u001b,\u0018{ph{T\u0003*dy6yq[r\u0002adiM\u0006#KJ\u001e_O\u00036dazy??\u0017\u001f\u0007'Y-|5\u0005wtsv\u001d^=|ka\t\u000eO%L\u007fOB", replaceWith = @ReplaceWith(expression = "createProgressEvent(surfaceId, viewId, imageUri, loaded, total)", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ImageLoadEvent createProgressEvent(int i2, String str, int i3, int i4) {
            return createProgressEvent(-1, i2, str, i3, i4);
        }

        @JvmStatic
        public final String eventNameForType(int i2) {
            if (i2 == 1) {
                return ErrorEvent.EVENT_NAME;
            }
            if (i2 == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (i2 == 3) {
                return "topLoadEnd";
            }
            if (i2 == 4) {
                return "topLoadStart";
            }
            if (i2 == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + i2).toString());
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0012Dr'5#a(3o\u0016\u0015W?:KE\u001e\u001ew \u001d\u000f_.NV8GU]\u001bp]r\u0013", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ImageEventType {
    }

    private ImageLoadEvent(int i2, int i3, int i4, String str, String str2, int i5, int i6, int i7, int i8) {
        super(i2, i3);
        this.eventType = i4;
        this.errorMessage = str;
        this.sourceUri = str2;
        this.width = i5;
        this.height = i6;
        this.loaded = i7;
        this.total = i8;
    }

    /* synthetic */ ImageLoadEvent(int i2, int i3, int i4, String str, String str2, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, (i9 & 8) != 0 ? null : str, (i9 & 16) == 0 ? str2 : null, (-1) - (((-1) - i9) | ((-1) - 32)) != 0 ? 0 : i5, (-1) - (((-1) - i9) | ((-1) - 64)) != 0 ? 0 : i6, (i9 & 128) != 0 ? 0 : i7, (-1) - (((-1) - i9) | ((-1) - 256)) == 0 ? i8 : 0);
    }

    public /* synthetic */ ImageLoadEvent(int i2, int i3, int i4, String str, String str2, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, str, str2, i5, i6, i7, i8);
    }

    @JvmStatic
    public static final ImageLoadEvent createErrorEvent(int i2, int i3, Throwable th) {
        return Companion.createErrorEvent(i2, i3, th);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u0011`n[\u001b\f\u001bm\u001af6\\s|a}3t(`lCa\u001cmQV*<=\u001bjX\u0013alIFjQs%!Y\u001aE\u001e{\u001d\u00062\r\u0003v\u001dY=|o)\u001d\tM\u001eS", replaceWith = @ReplaceWith(expression = "createErrorEvent(surfaceId, viewId, throwable)", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ImageLoadEvent createErrorEvent(int i2, Throwable th) {
        return Companion.createErrorEvent(i2, th);
    }

    private final WritableMap createEventDataSource() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", this.sourceUri);
        writableMapCreateMap.putDouble("width", this.width);
        writableMapCreateMap.putDouble("height", this.height);
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u0018]]Pm5\tM\"W\u0005Z.\u0001S\u00077owZ$VU]|xK6CF\u001bYU\u000e.q\bOfI9%KZ)V!w7\u0007[\u0010/8/\u000b~\n\u001d#\u001a\u0003]\u001dD\tU", replaceWith = @ReplaceWith(expression = "createLoadEndEvent(surfaceId, viewId)", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ImageLoadEvent createLoadEndEvent(int i2) {
        return Companion.createLoadEndEvent(i2);
    }

    @JvmStatic
    public static final ImageLoadEvent createLoadEndEvent(int i2, int i3) {
        return Companion.createLoadEndEvent(i2, i3);
    }

    @JvmStatic
    public static final ImageLoadEvent createLoadEvent(int i2, int i3, String str, int i4, int i5) {
        return Companion.createLoadEvent(i2, i3, str, i4, i5);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u0018]]Pm=\nv \u0012\rK\u0001}W\u00042&|TeV\ra\u0001IR'6C&be96YS@x}G'\u001eM\u0015G _8As\u001f/8*\u000b~\u000ed7\u0015\u0001V$", replaceWith = @ReplaceWith(expression = "createLoadEvent(surfaceId, viewId, imageUri, width, height)", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ImageLoadEvent createLoadEvent(int i2, String str, int i3, int i4) {
        return Companion.createLoadEvent(i2, str, i3, i4);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u0018]]P{;\u0006z 7\rK|~\u000e\u000b)x{UsP\rpp:Z]8R\"bU|+lTT%R5\u001d\u0011ZSW0\t:\u0003u\u0011X;[L\u0011;^0G|Z\u0017T\bF<<", replaceWith = @ReplaceWith(expression = "createLoadStartEvent(surfaceId, viewId)", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ImageLoadEvent createLoadStartEvent(int i2) {
        return Companion.createLoadStartEvent(i2);
    }

    @JvmStatic
    public static final ImageLoadEvent createLoadStartEvent(int i2, int i3) {
        return Companion.createLoadStartEvent(i2, i3);
    }

    @JvmStatic
    public static final ImageLoadEvent createProgressEvent(int i2, int i3, String str, int i4, int i5) {
        return Companion.createProgressEvent(i2, i3, str, i4, i5);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017[Y-{d\u001a\u001c`kS\u001b,\u0018{ph{T\u0003*dy6yq[r\u0002adiM\u0006#KJ\u001e_O\u00036dazy??\u0017\u001f\u0007'Y-|5\u0005wtsv\u001d^=|ka\t\u000eO%L\u007fOB", replaceWith = @ReplaceWith(expression = "createProgressEvent(surfaceId, viewId, imageUri, loaded, total)", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ImageLoadEvent createProgressEvent(int i2, String str, int i3, int i4) {
        return Companion.createProgressEvent(i2, str, i3, i4);
    }

    @JvmStatic
    public static final String eventNameForType(int i2) {
        return Companion.eventNameForType(i2);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) this.eventType;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i2 = this.eventType;
        if (i2 == 1) {
            writableMapCreateMap.putString("error", this.errorMessage);
        } else if (i2 == 2) {
            writableMapCreateMap.putMap("source", createEventDataSource());
        } else if (i2 == 5) {
            writableMapCreateMap.putInt("loaded", this.loaded);
            writableMapCreateMap.putInt("total", this.total);
            writableMapCreateMap.putDouble("progress", ((double) this.loaded) / ((double) this.total));
        }
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return Companion.eventNameForType(this.eventType);
    }
}
