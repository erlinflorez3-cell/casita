package com.facebook.react.views.scroll;

import androidx.core.util.Pools;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.scroll.ScrollEventType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006\u0010nʑA0ZeP.XT2\u000fy\u0001<$a'yCQU\"Ԃ*\t]Zo˧vJh\u000bK\u000f\f\u0019\u000f̓Jb\u0006~m\u0014\u001f2pģm2\u0006nVyez6ӯ$208B\u000b\u000f)BH>{AW\u0014\u0012 4XphWS_M  \u0016V //#y\u0017<V~u:]6I}\u000b75sH|{\"vX5#\u000faL-p;C,=S1\t\u0003aM\tWsS\u0004\u0017.W/W}o6\u0007\u000bD\u00199[%]!1\r\t_m$'YZ\u0014O^\u001c@w)\u0007=@\u0012\u0011\u001e'v0]\u001et\t&3#t\u0004D^\u000bvB.|\u0012:%-\u00183Y;Kj_eS\u0019|<B\u0005U$1\u0019\u0007!\niTte'bxi1\u007fB\u0014ʳZ̆]=uՎAn\u0010-\u001c0u\u0002\u0006Ɉ\u001dѧ\u001b%?ك\n//o\u001aHrlMݖlĈWiZ̲\u00110|\u001cO,\u001f\u000b\tK;ʐwÏXX4Ҋ\u001e(b\u000f\u0016\bA\"3ɿHƼ)\u0010Vи9uxVu\nS1=ƀeˇo\u000e_ު/?C[{\u0010\u0010]MܠKםf\u0005`٨\u0013_\u001aft(P=\u001fН\u001cȑ\u007fDVۼc>M~44Z<o¥!Ƞ\u0007\u001eJˆM\u0015mh\u0001\u0010-_\nɷ\u000fȐ(t\u0011ɖ˯`\u000b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-j", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "u(E", "1n]AX5M6\u0019\u0003|a;", "", "1n]AX5ME\u001d}\na", "3w_2e0FS\"\u000eve&\u0001\u0017\u001dy\t&~M\u000b !W}", "", "Aba<_3\u001ed\u0019\b\nM@\b\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-\u0004|l9\\", "Aba<_3/W\u0019\u0011]^0~\f>", "Aba<_3/W\u0019\u0011lb+\f\f", "Aba<_31", "", "Aba<_32", "FUT9b*Bb-", "GUT9b*Bb-", "1`]\u0010b(ES'|z", "5dc\u0012i,Gbwz\nZ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "5dc\u0012i,Gb\u0002z\u0003^", "", "7mXA", "", "Ata3T*>7\u0018", "DhTDG(@", "=m36f7Ha\u0019", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScrollEvent extends Event<ScrollEvent> {
    private int contentHeight;
    private int contentWidth;
    private boolean experimental_isSynchronous;
    private ScrollEventType scrollEventType;
    private int scrollViewHeight;
    private int scrollViewWidth;
    private float scrollX;
    private float scrollY;
    private float xVelocity;
    private float yVelocity;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ScrollEvent";
    private static final Pools.SynchronizedPool<ScrollEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(3);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tvA0JfP.`Y2şs{J$cҕyCIZ\"}(\u0010WNupvϺ`ŖD%إFx\u0019+\nZ~]ܫ\u00132Po\b\f[vU9\u000fwf\t.::8(\u000e1 8R(x\u0011By\u0017B4N|RR;Z5\u001e \u0014V /+\rk\\E`l\fG_'\u0011yZNUl`\u0001[\u001e^TU\u0016'e,=X7c\u001eUW\u0011\u001aj[m\fouK\u0019\u0001'U4\u0010x \u001ff\u0007,\u0015YR=a\u0001;t\u0005\u007fi<+9W{K~\u0017X}\t\u0006%>\u001a\r42x2;&~\b<@%vaNh\u0002\rO0~oE/%.@[=)viai&~;\n\u0016%\u001eQ\n\u001f%if&`C$\u0005{_Di@kQ~\u000egQ\u0006\u0004\u001fk2.\u0012F_\u007f]\u0013W3g7E\\Q)1m\u0012Hrj%\u00077èUׂVHH̎?*E.!\u0014xJ\r\u0007\u0002O\u0003]Z\u0016$ȿVΘ\u0002\b\u001b\u05feϨ{T"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-SFkA\u0012_5R\u00010\u001d", "", "u(E", "\u0013U4\u001bG\u001a8>\u0003ha", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.{P\u007f#8f\b);\u0003\u0016-8MEr\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-j", "\"@6", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=ac.\\5", "DhTDG(@", "", "Aba<_3\u001ed\u0019\b\nM@\b\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-\u0004|l9\\", "Aba<_31", "", "Aba<_32", "FUT9b*Bb-", "GUT9b*Bb-", "1n]AX5ME\u001d}\na", "1n]AX5M6\u0019\u0003|a;", "Aba<_3/W\u0019\u0011lb+\f\f", "Aba<_3/W\u0019\u0011]^0~\f>", "Ata3T*>7\u0018", "3w_2e0FS\"\u000eve&\u0001\u0017\u001dy\t&~M\u000b !W}", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ScrollEvent obtain(int i2, int i3, ScrollEventType scrollEventType, float f2, float f3, float f4, float f5, int i4, int i5, int i6, int i7, boolean z2) {
            ScrollEvent scrollEvent = (ScrollEvent) ScrollEvent.EVENTS_POOL.acquire();
            if (scrollEvent == null) {
                scrollEvent = new ScrollEvent(null);
            }
            scrollEvent.init(i2, i3, scrollEventType, f2, f3, f4, f5, i4, i5, i6, i7, z2);
            return scrollEvent;
        }

        @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017gI<{Y#kda^\u001c0\u0014vKf~G\u0003*S\r4rqOmVYu(MG)8MQia\f(YK@NBs\u0013\u001f\u0007\u0015RZwF\t\b\u0019tE0", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, viewTag, scrollEventType, scrollX, scrollY, xVelocity, yVelocity, contentWidth, contentHeight, scrollViewWidth, scrollViewHeight)", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public final ScrollEvent obtain(int i2, ScrollEventType scrollEventType, float f2, float f3, float f4, float f5, int i3, int i4, int i5, int i6) {
            return obtain(-1, i2, scrollEventType, f2, f3, f4, f5, i3, i4, i5, i6, false);
        }
    }

    private ScrollEvent() {
    }

    public /* synthetic */ ScrollEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(int i2, int i3, ScrollEventType scrollEventType, float f2, float f3, float f4, float f5, int i4, int i5, int i6, int i7, boolean z2) {
        super.init(i2, i3);
        this.scrollEventType = scrollEventType;
        this.scrollX = f2;
        this.scrollY = f3;
        this.xVelocity = f4;
        this.yVelocity = f5;
        this.contentWidth = i4;
        this.contentHeight = i5;
        this.scrollViewWidth = i6;
        this.scrollViewHeight = i7;
        this.experimental_isSynchronous = z2;
    }

    @JvmStatic
    public static final ScrollEvent obtain(int i2, int i3, ScrollEventType scrollEventType, float f2, float f3, float f4, float f5, int i4, int i5, int i6, int i7, boolean z2) {
        return Companion.obtain(i2, i3, scrollEventType, f2, f3, f4, f5, i4, i5, i6, i7, z2);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017gI<{Y#kda^\u001c0\u0014vKf~G\u0003*S\r4rqOmVYu(MG)8MQia\f(YK@NBs\u0013\u001f\u0007\u0015RZwF\t\b\u0019tE0", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, viewTag, scrollEventType, scrollX, scrollY, xVelocity, yVelocity, contentWidth, contentHeight, scrollViewWidth, scrollViewHeight)", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final ScrollEvent obtain(int i2, ScrollEventType scrollEventType, float f2, float f3, float f4, float f5, int i3, int i4, int i5, int i6) {
        return Companion.obtain(i2, scrollEventType, f2, f3, f4, f5, i3, i4, i5, i6);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return this.scrollEventType == ScrollEventType.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected boolean experimental_isSynchronous() {
        return this.experimental_isSynchronous;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", 0.0d);
        writableMapCreateMap.putDouble(ViewProps.BOTTOM, 0.0d);
        writableMapCreateMap.putDouble("left", 0.0d);
        writableMapCreateMap.putDouble(ViewProps.RIGHT, 0.0d);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", PixelUtil.toDIPFromPixel(this.scrollX));
        writableMapCreateMap2.putDouble("y", PixelUtil.toDIPFromPixel(this.scrollY));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble("width", PixelUtil.toDIPFromPixel(this.contentWidth));
        writableMapCreateMap3.putDouble("height", PixelUtil.toDIPFromPixel(this.contentHeight));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble("width", PixelUtil.toDIPFromPixel(this.scrollViewWidth));
        writableMapCreateMap4.putDouble("height", PixelUtil.toDIPFromPixel(this.scrollViewHeight));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putDouble("x", this.xVelocity);
        writableMapCreateMap5.putDouble("y", this.yVelocity);
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        writableMapCreateMap6.putMap("contentInset", writableMapCreateMap);
        writableMapCreateMap6.putMap("contentOffset", writableMapCreateMap2);
        writableMapCreateMap6.putMap("contentSize", writableMapCreateMap3);
        writableMapCreateMap6.putMap("layoutMeasurement", writableMapCreateMap4);
        writableMapCreateMap6.putMap("velocity", writableMapCreateMap5);
        writableMapCreateMap6.putInt("target", getViewTag());
        writableMapCreateMap6.putBoolean("responderIgnoreScroll", true);
        Intrinsics.checkNotNull(writableMapCreateMap6);
        return writableMapCreateMap6;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        ScrollEventType.Companion companion = ScrollEventType.Companion;
        Object objAssertNotNull = Assertions.assertNotNull(this.scrollEventType);
        Intrinsics.checkNotNullExpressionValue(objAssertNotNull, "assertNotNull(...)");
        return companion.getJSEventName((ScrollEventType) objAssertNotNull);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e2) {
            ReactSoftExceptionLogger.logSoftException(TAG, e2);
        }
    }
}
