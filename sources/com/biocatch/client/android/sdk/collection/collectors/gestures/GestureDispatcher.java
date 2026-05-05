package com.biocatch.client.android.sdk.collection.collectors.gestures;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.biocatch.android.commonsdk.logging.Log;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u0014\u001f\u0001j2K]xk\u0017\u00172HoG3[oE9fz<ӌ6݅R8(\u00041\u001aXH@v)D{\f@2pphUMPŋ\u001e\u0012\u0014Bh\u000f,k\u007fNdX\u001daH@;\u0003\u0018J\u0015;(X\u000b_%F\u00037=|o1CBM4C-\u0004\u0007\u0015cs?1G\"A\u0013|?'Y^$[Dn\u0018\u0014C@\u0016!&\u00014s\u001dQ\u000f$W/]tcP<0>\u000fD5J\u001d&\u0006UX^3(y \u0010Is![pT\u0010oZ\u007f)if\u001b3\u001aK+g0\u0017UoV1Ne\u0011K!f1\u000f\u000b9[\u0003&\u0011\u0019)e\u0010Q_Y\u0007Q\u0011\\\u0018vUm2\u0001\u0013\u00068\u0015HG.7B%v%3Us9Q9\u001c\u0006VI\u007fv3f/g2`V^:nDOZ\r\u001ac\\d3u\u0017h!:\u001fk4T5\u00168\u0017.g\u0010<O1Vb\u0018vw\te]8=_jEf\u0007k<e\u007fr{C_\u0003(a\u0001\u000fDCJg\u001dX\u0015H\u001a #j6AJH\u0019((\u007fRW$\u0013`I80|:?8t\u0015v\u001bNFO\b!_\ttV\u0013\u001dA2\"\u0002$#!1Tj}\bg'Wr\u001110;Fi7/%\u0004(?ؗ\tɠ\u000b~{Ò\u0018uZNdn,t\u0004\u0004vډ&\u07fcU/EП_\r7;\u001a/[K!o(˪\u001eؠ~|\u0002Ҹ\fv<r l\u0007+\u000fv!֥`Ђ&vfаs\u0016r\r\u0012c\\yuq+ޯgƏMr\u000bʛ\u008aRX"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[<\u000e\\:\u001d\u0012Y (|O3.\u0006/I\u000f\u0011", "\u001a`]1e6BRb\u0010~^>Fj/s\u000f8\t@_\u0017&Gm\u001dF\u0004c\u001fb_ E|&;M*?yC\u001e\u001ehn\u000f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>nU/\u0016\u00079R$wS\u0017'\f;X\u0002H>", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>tX4\u000fofA2|$H\u001f\u0011;)\n?w\u0010\f#c", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>xJ4l\u0016YJ3NL;.\u0017,VW", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>|J6l\u0016YJ3NL;.\u0017,VW", "u(E", "4kX;Z\fOS\"\u000eab:\f\t8e\r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>nU/\u0016\u00079R$wS\u001e#\u0016;I\u000b;uV", ":`bAB5\u001d]+\bZo,\u0006\u0018", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", ":n]4C9>a'^\f^5\fo3s\u000f(\u0005@\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>tX4\u000fofA2|$H\u001f\u0011;0\u0006Iw\u0001\u0015\u0016\u001b\u000b", ">`]\u0012i,Gb\u007f\u0003\tm,\u0006\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>xJ4l\u0016YJ3UHE.\b5I\u000f\u0011", "B`_\u0012i,Gb\u007f\u0003\tm,\u0006\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>|J6l\u0016YJ3UHE.\b5I\u000f\u0011", "=m3<j5", "", "3uT;g", "=m59\\5@", "Bnd0[\u000bHe\"", "Dd[<V0Mg\f", "", "Dd[<V0Mg\r", "=m;<a.)`\u0019\r\t", "", "=mB0e6EZ", "2hbAT5<S\f", "2hbAT5<S\r", "=mB5b>)`\u0019\r\t", "=mB6a.ES\bz\u0006N7", "@d\\<i,\u001ed\u0019\b\nE0\u000b\u0018/n\u007f5", "Adc\u0012i,Gb\u007f\u0003\tm,\u0006\t<", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class GestureDispatcher implements GestureDetector.OnGestureListener, IFlingEventEmitter, ILongPressEventEmitter, IPanEventEmitter, ITapEventEmitter {
    private IFlingEventListener flingEventListener;
    private MotionEvent lastOnDownEvent;
    private ILongPressEventListener longPressEventListener;
    private IPanEventListener panEventListener;
    private ITapEventListener tapEventListener;

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.lastOnDownEvent = event;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent event, float f2, float f3) {
        Intrinsics.checkNotNullParameter(event, "event");
        IFlingEventListener iFlingEventListener = this.flingEventListener;
        if (iFlingEventListener == null) {
            return false;
        }
        iFlingEventListener.onFling(event, f2, f3);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ILongPressEventListener iLongPressEventListener = this.longPressEventListener;
        if (iLongPressEventListener != null) {
            iLongPressEventListener.onLongPress(event);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent event, float f2, float f3) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (motionEvent == null) {
            motionEvent = this.lastOnDownEvent;
        }
        if (motionEvent == null) {
            Log.Companion.getLogger().debug("Skipped processing of pan gesture because the touch down value is unavailable");
            return false;
        }
        IPanEventListener iPanEventListener = this.panEventListener;
        if (iPanEventListener != null) {
            iPanEventListener.onPan(motionEvent, event, f2, f3);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ITapEventListener iTapEventListener = this.tapEventListener;
        if (iTapEventListener == null) {
            return false;
        }
        iTapEventListener.onTap(event);
        return false;
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.IFlingEventEmitter
    public void removeEventListener(IFlingEventListener flingEventListener) {
        Intrinsics.checkNotNullParameter(flingEventListener, "flingEventListener");
        if (this.flingEventListener == flingEventListener) {
            this.flingEventListener = null;
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.ILongPressEventEmitter
    public void removeEventListener(ILongPressEventListener longPressEventListener) {
        Intrinsics.checkNotNullParameter(longPressEventListener, "longPressEventListener");
        if (this.longPressEventListener == longPressEventListener) {
            this.longPressEventListener = null;
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.IPanEventEmitter
    public void removeEventListener(IPanEventListener panEventListener) {
        Intrinsics.checkNotNullParameter(panEventListener, "panEventListener");
        if (this.panEventListener == panEventListener) {
            this.panEventListener = null;
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.ITapEventEmitter
    public void removeEventListener(ITapEventListener tapEventListener) {
        Intrinsics.checkNotNullParameter(tapEventListener, "tapEventListener");
        if (this.tapEventListener == tapEventListener) {
            this.tapEventListener = null;
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.IFlingEventEmitter
    public void setEventListener(IFlingEventListener flingEventListener) {
        Intrinsics.checkNotNullParameter(flingEventListener, "flingEventListener");
        this.flingEventListener = flingEventListener;
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.ILongPressEventEmitter
    public void setEventListener(ILongPressEventListener longPressEventListener) {
        Intrinsics.checkNotNullParameter(longPressEventListener, "longPressEventListener");
        this.longPressEventListener = longPressEventListener;
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.IPanEventEmitter
    public void setEventListener(IPanEventListener panEventListener) {
        Intrinsics.checkNotNullParameter(panEventListener, "panEventListener");
        this.panEventListener = panEventListener;
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.ITapEventEmitter
    public void setEventListener(ITapEventListener tapEventListener) {
        Intrinsics.checkNotNullParameter(tapEventListener, "tapEventListener");
        this.tapEventListener = tapEventListener;
    }
}
