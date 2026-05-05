package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.core.util.Pools;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.events.TouchEventType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00136Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`X2\u000fq\u007f<$i-yّCU(}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~j4Ic~e܈\u00172P{G3StE9n{>ӌ(288\u0002\u0005\u0007\u001c@Ϻ.\u001e+I[\u000e\"0n\u0081hQEL,Z\u0017\f>ŋ\u0005\u001ejg\u0017<Vzu:]2I}\u000b\\5oH|{\u001evX5\u001f\u000faL>\u0007K}#3g\u001b\u0007\u0001lo\u0007M\u0004U\u0005\u0017<m?\u0012yeLp\u007fB\u0017qcUc\u0001=t\u0005\u007fxR9sUqdh\u000eV\u0012A\u0010U@\u0012)\u001e'v2u\u001et$&3#x\u001c\t^\u001fvB.\f\u0012:%C\u00183YQKj_\u0001S\u0019|O,\u000b\u001b#;\u0003\u0005 \nZ>d#;lw\u007f5\u0002DKif\n\b_\u001e\b~k\u001a*28w\u0004=\b).E-g_GF9k0l\u000bg?\u000bn\u000eki\u0001Y\u000767\u001cEP!\f\tS+\u0005<\\bYD\u0011{\u001e+\u0378\nݔ\u0017 dɼ\r/3\u0013fQ~h\u0019Q4܆1çj7aʤ<\u001ce>v5KP\u0012\u00168ׯ\u0003݀C<jڳ)\u0003P\\$Z\u000b0R6Vq(w*L\rLiԼKۇ :4ջ1^\u001bR\u0011)\u0013]\u000b\u0015wZ\u0017\u0018/XA+\u001biR|GA'ʛ|״k~Qؓ\u0015b(:O\\ڪ\u001dN"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001dWS9n\u0014/\u0015qp\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "u(E", "1nP9X:<W\"\u0001`^@", "", ";nc6b5\u001ed\u0019\b\n", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "Bnd0[\fOS\"\u000eir7|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001dWS9n\u0014/\u0015qp(\u001bn,$", "\nrTA \u0006\u0017", "", "DhTDK", "5dc#\\,PF", "u(5", "DhTDL", "5dc#\\,PG", "1`]\u0010b(ES'|z", "", "2hb=T;<V", "", "@bc\u0012i,Gbx\u0007~m;|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001b+2\u001b|4'$Hi=\u0016r,[L", "2hb=T;<V\u0001\ty^9\u0006", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001b+2#u3\u001e\"qAJ\u0007l;.~+V[N92", "5dc\u0010b(ES'|~g.b\tC", "5dc\u0012i,Gbvz\n^.\u0007\u0016C", "", "5dc\u0012i,Gb\u0002z\u0003^", "", "5dc\u001ab;B]\"^\f^5\f", "5dc!b<<Vx\u0010zg;k\u001d:e", "7mXA", "Ata3T*>7\u0018", "DhTDG(@", ";nc6b5\u001ed\u0019\b\nM6Z\u0013:y", "5dbAh9>A(z\bm\u001b\u0001\u0011/", "", "Bnd0[\fOS\"\u000eXh(\u0004\t=c\u00041}&\u0001+yGv\u0019<\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001dWS9n\u0014/\u0015qp\u0017\u0011_3N\u0005%KUP\u0012\\fU=\u001b\u001dZ\u001b$", "=m36f7Ha\u0019", "Dda6Y@&](\u0003\u0005g\f\u000e\t8t", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TouchEvent extends Event<TouchEvent> {
    private static final int TOUCH_EVENTS_POOL_SIZE = 3;
    public static final long UNSET = Long.MIN_VALUE;
    private short coalescingKey;
    private MotionEvent motionEvent;
    private TouchEventType touchEventType;
    private float viewX;
    private float viewY;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "TouchEvent";
    private static final Pools.SynchronizedPool<TouchEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(3);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tvA0JeP.`Y2şs{B+c$wDCU0}*ޛWN}gvJ`\u000bK\u000f\u0014\u001b\u0001j2I]xs\u0012\u00172HoEݓN\u0006މi`#5E%8\"أ}\u0005\u000f\u001ar\u000b\u001e\u0002\u0013Cy\u000fB4N|RR;U5  \u0013V\"\u0017\u001d\u000bu~<V{u<E\"1yrR5pH|{\u0017vX5\u001f\u000faL>p;C)=S1\u001a\u0003_M\u0018Wqk\u001b/,ouW~o6\u0007\u0003D\u00199f%]!.\r\t_l$'YW\u0014Q^\u001b@y\u0011z;J4\u0014\u00146`0C\u0019\u0015\u0018>7\u0003\u0004k@~\f\u000fF\u000e\ry6E8079M3f\u007ftk\u001d\\L\u0014\u0005;4i\u0006?3iU&f%\u001ddw\u007f4\u007fB\u0014ʳP̆]=uՎAv\u0010.\u001c8e\u0006W}'-E*e`\u0010\u05fd#Ƞ\u0006HLϙG\u0011noki\u0001P\u0017̑Aގ;*\u0011ȱ+Pr\u000e\u0004P\u0003b\u0003ґ ɟX\u0007\u0006ܱ˟$t"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001dWS9n\u0014/\u0015qpwdm4Yr0KVW\u0002", "", "u(E", "\u0013U4\u001bG\u001a8>\u0003ha", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.{P\u007f#8f\b);\u0003\u0016-8MEr\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001dWS9n\u0014/\u0015qp\u000f", "\"@6", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\"ND\u0010;&\u001eDxgiL&gr\u0019Ly\u0016_5`", "", "#MB\u0012G", "", "=ac.\\5", "DhTDG(@", "Bnd0[\fOS\"\u000eir7|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001dWS9n\u0014/\u0015qp(\u001bn,$", ";nc6b5\u001ed\u0019\b\nM6Z\u0013:y", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "5dbAh9>A(z\bm\u001b\u0001\u0011/", "DhTDK", "", "DhTDL", "Bnd0[\fOS\"\u000eXh(\u0004\t=c\u00041}&\u0001+yGv\u0019<\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001dWS9n\u0014/\u0015qp\u0017\u0011_3N\u0005%KUP\u0012\\fU=\u001b\u001dZ\u001b$", "Ata3T*>7\u0018", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final TouchEvent obtain(int i2, int i3, TouchEventType touchEventType, MotionEvent motionEvent, long j2, float f2, float f3, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
            Intrinsics.checkNotNullParameter(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            TouchEvent touchEvent = (TouchEvent) TouchEvent.EVENTS_POOL.acquire();
            if (touchEvent == null) {
                touchEvent = new TouchEvent(null);
            }
            Object objAssertNotNull = Assertions.assertNotNull(motionEvent);
            Intrinsics.checkNotNullExpressionValue(objAssertNotNull, "assertNotNull(...)");
            touchEvent.init(i2, i3, touchEventType, (MotionEvent) objAssertNotNull, j2, f2, f3, touchEventCoalescingKeyHelper);
            return touchEvent;
        }

        @Deprecated(message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001ak]pT\u000e9Dw\"W\tR}kR43l(`lG\rkjMG'Ay\u001f[`\u00021\\\u0014z|F=\u0015\u0014\u0007\u0019\\+\u0003=\u0005{ {P[[\u0010\u000bs+\f\u0001[OR\u0010S4)4XX?", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, ...)", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public final TouchEvent obtain(int i2, TouchEventType touchEventType, MotionEvent motionEvent, long j2, float f2, float f3, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
            Intrinsics.checkNotNullParameter(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            return obtain(-1, i2, touchEventType, (MotionEvent) Assertions.assertNotNull(motionEvent), j2, f2, f3, touchEventCoalescingKeyHelper);
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TouchEventType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TouchEventType.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TouchEvent() {
    }

    public /* synthetic */ TouchEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(int i2, int i3, TouchEventType touchEventType, MotionEvent motionEvent, long j2, float f2, float f3, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        super.init(i2, i3, motionEvent.getEventTime());
        short coalescingKey = 0;
        SoftAssertions.assertCondition(j2 != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            touchEventCoalescingKeyHelper.addCoalescingKey(j2);
        } else if (action == 1) {
            touchEventCoalescingKeyHelper.removeCoalescingKey(j2);
        } else if (action == 2) {
            coalescingKey = touchEventCoalescingKeyHelper.getCoalescingKey(j2);
        } else if (action == 3) {
            touchEventCoalescingKeyHelper.removeCoalescingKey(j2);
        } else {
            if (action != 5 && action != 6) {
                throw new RuntimeException("Unhandled MotionEvent action: " + action);
            }
            touchEventCoalescingKeyHelper.incrementCoalescingKey(j2);
        }
        this.motionEvent = MotionEvent.obtain(motionEvent);
        this.touchEventType = touchEventType;
        this.coalescingKey = coalescingKey;
        this.viewX = f2;
        this.viewY = f3;
    }

    @JvmStatic
    public static final TouchEvent obtain(int i2, int i3, TouchEventType touchEventType, MotionEvent motionEvent, long j2, float f2, float f3, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        return Companion.obtain(i2, i3, touchEventType, motionEvent, j2, f2, f3, touchEventCoalescingKeyHelper);
    }

    @Deprecated(message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001ak]pT\u000e9Dw\"W\tR}kR43l(`lG\rkjMG'Ay\u001f[`\u00021\\\u0014z|F=\u0015\u0014\u0007\u0019\\+\u0003=\u0005{ {P[[\u0010\u000bs+\f\u0001[OR\u0010S4)4XX?", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, ...)", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final TouchEvent obtain(int i2, TouchEventType touchEventType, MotionEvent motionEvent, long j2, float f2, float f3, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        return Companion.obtain(i2, touchEventType, motionEvent, j2, f2, f3, touchEventCoalescingKeyHelper);
    }

    private final boolean verifyMotionEvent() {
        if (this.motionEvent != null) {
            return true;
        }
        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        TouchEventType touchEventType = (TouchEventType) Assertions.assertNotNull(this.touchEventType);
        int i2 = touchEventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return false;
        }
        if (i2 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.touchEventType);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (verifyMotionEvent()) {
            TouchesHelper.sendTouchesLegacy(rctEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (verifyMotionEvent()) {
            rctEventEmitter.receiveTouches(this);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected int getEventCategory() {
        TouchEventType touchEventType = this.touchEventType;
        if (touchEventType == null) {
            return 2;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2 || i2 == 3) {
            return 1;
        }
        if (i2 == 4) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        TouchEventType.Companion companion = TouchEventType.Companion;
        Object objAssertNotNull = Assertions.assertNotNull(this.touchEventType);
        Intrinsics.checkNotNullExpressionValue(objAssertNotNull, "assertNotNull(...)");
        return companion.getJSEventName((TouchEventType) objAssertNotNull);
    }

    public final MotionEvent getMotionEvent() {
        Object objAssertNotNull = Assertions.assertNotNull(this.motionEvent);
        Intrinsics.checkNotNullExpressionValue(objAssertNotNull, "assertNotNull(...)");
        return (MotionEvent) objAssertNotNull;
    }

    public final TouchEventType getTouchEventType() {
        Object objAssertNotNull = Assertions.assertNotNull(this.touchEventType);
        Intrinsics.checkNotNullExpressionValue(objAssertNotNull, "assertNotNull(...)");
        return (TouchEventType) objAssertNotNull;
    }

    public final float getViewX() {
        return this.viewX;
    }

    public final float getViewY() {
        return this.viewY;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.motionEvent = null;
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e2) {
            ReactSoftExceptionLogger.logSoftException(TAG, e2);
        }
    }
}
