package com.braze.ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njGӄLeN.ZS@\u000fsڔ<$i-yّCU0}*ޛWNugvJ`\fYƤ6\u0016'idHf9t\u0018#BF}?KM\u001e>If\u00038\u001d\"H!f|ڱ\u0005\u001a8LP\u0016\u000bGY\f*0nqJX\u001bR\u001d\u001c(\u0005l&\u0011$jif8^k\f=ǥ'\u0003wI\u0017=m:\u0015M;Q\u0005+\u001bvy\u001eYAg9#1k\u00035_\"SKK\u007fK\u001dhU6[M\u0002gNX.\u001de9]\u0015ut<[3Z7ϲ3˦ScSִ˔,\n"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u001dWS9n\u00100\u0011ua'\u0019g7NU+UTR:jA|M\u0012\u0015A\u0012\\:\r\u000eYNy", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u001c_GFk\u0013\"#peG\u0015R6^t*.P\\;\\[rJi", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1`[9U(<Y'", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u001c_GFk\u0013\"#peG\u0015R6^t*.P\\;\\[rJRp^\u001cV/\u001b\u00137=+uA3\u001d\u000e:\u001f", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011l\u001b8\f%~i\u0002i;v\u00129XK;yB\u001a\u0017h+@\u000bq;N\u007f'TZ\u0018\u001anV}=r\u0016h\u0016R9\u001bscQ\"q+;-\u0017,R\u0002H'_\u0010$\u00169x~ R\u0017Nv\u0011sG7>\nJ", "BnZ2a", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044AEs}\u001b\"dv9Ps0\u0018z0CWY4\\`\u00019\u0016\u0012$\u0015R9\u001c\u0005bA1|\u000e%1\f7I`?v\t\u0010$\u001c$t\u0001@YvK\b$uJ)u\u00058c\bOESp\b`\u0013f\u001aX8@2i5\n", "Bnd0[\u0013Ba(~\u0004^9", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u001dWS9n\u00100\u0011ua'\u0019g7NU+UTR:jA|M\u0012\u0015A\u0012\\:\r\u000eYNbR3A/\u0006/0\u0006Iw\u0001\u0015\u0016\u001b\u000b", "=mC<h*A", "", ";nc6b5\u001ed\u0019\b\n", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "Adc!b<<V\u007f\u0003\tm,\u0006\t<", "", "<df!b<<V\u007f\u0003\tm,\u0006\t<", "\u0017S^BV/%W'\u000ezg,\n", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener {
    private ITouchListener touchListener;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4B\u0005\u0007Bߚ(\u0007\u0015i\u00026Re`.\u0001Tp34\u0002B&s$ D\u0002yܵ|̝ޞORoiti\t\nå\u0013\tȞ|i"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u001dWS9n\u00100\u0011ua'\u0019g7NU+UTR:jA|M\u0012\u0015A\u0012\\:\r\u000eYNbR3A/\u0006/0\u0006Iw\u0001\u0015\u0016\u001b\u000b", "", "=mC<h*A3\"}z]", "", "=mC<h*AA(z\bm,{r<C\n1\u000bD\n'\u0017F", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface ITouchListener {
        void onTouchEnded();

        void onTouchStartedOrContinued();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        this(view, null, dismissCallbacks);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        super(view, obj, dismissCallbacks);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ITouchListener iTouchListener;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action == 0) {
            ITouchListener iTouchListener2 = this.touchListener;
            if (iTouchListener2 != null) {
                iTouchListener2.onTouchStartedOrContinued();
            }
        } else if ((action == 1 || action == 3) && (iTouchListener = this.touchListener) != null) {
            iTouchListener.onTouchEnded();
        }
        return super.onTouch(view, motionEvent);
    }

    public final void setTouchListener(ITouchListener newTouchListener) {
        Intrinsics.checkNotNullParameter(newTouchListener, "newTouchListener");
        this.touchListener = newTouchListener;
    }
}
