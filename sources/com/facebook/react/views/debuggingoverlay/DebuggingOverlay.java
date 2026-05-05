package com.facebook.react.views.debuggingoverlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjGOLe^.Zݷ2\u000f\u0002{<$i*yCQU\"}8\tWNmgvJp\u000bKƤ\u000e\u0016\u0007j4I[xe\u0012%2JoE5UoKWhҚLӌP2P7:\u0010\u0011\u001e8H(v)Dƚ\u0010\u0012>B9@`\u001de\u0005H#LCh\u000f,n\u007fNdY\u001daHB;\u0003\u0018V\u0015;(D\u000bb%F\u00038=\u0001o4CFG7%%\u0002\n5X\"DKS\u007fT\u001dhU8[S\u0002oN^\u0010\u0016%+}\u001c\f\flaU]n\u000f?+}g\"ַ\u0010߭{z\u0004Ȟ\r\u0016\u001c\u000b?N>/*f6\u0015azIԢLг\u0006^JȕK\nD\u001f=\u001cC-I\u001b\u0015[q=)Ne\u00073\u0016\u0007/\u0011p1[\u0003\u0018p\u0017+T&\\\u0010]\u0017׃Jݳ\u000eYEЧT|p\u000fB\u0004^KV߿} 2\u0017-ڛ,a1/\u0004\u001eXFwv3jxUyRvOPw~C:\u000b\u001cZrn\u0015m`T\u0007;oYr΄\tą\f\u0013(οʥ@;"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\r<s57[\u0002)9w'.ZJ7\u007f}|\u0015eq;\tg5P`8GYU(p(", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "6hV5_0@V(~y>3|\u0011/n\u000f6f<\u0005 &", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "6hV5_0@V(~y>3|\u0011/n\u000f6h@~&\u0013Pq\u0015<\u0005", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "BqP0X\u001cIR\u0015\u000ezB+k\u0013\rl\u007f$\u0005P\f\u0004'Px\n9}%\u001dU\t", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "BqP0X\u001cIR\u0015\u000ezI(\u0001\u0012>", "BqP0X\u001cIR\u0015\u000ezl\u001b\u0007g3s\u000b/wTh\u0013\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\r<s57[\u0002)9w'.ZJ7\u007f}\r\"d_9vn+J\u0006'\u001d", "1kT.e\fES!~\u0004m:_\r1h\u0007,}C\u0010%", "", "=m3?T>", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "Adc\u0015\\.AZ\u001d\u0001}m,{h6e\b(\u0005O\u000f\u0004\u0017E~\nEx,5g", "3kT:X5Ma\u0006~xm(\u0006\u000b6e\u000e", "Adc!e(<S\t\nyZ;|\u0017", "BqP0X\u001cIR\u0015\u000ezl", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DebuggingOverlay extends View {
    private final Paint highlightedElementsPaint;
    private List<RectF> highlightedElementsRectangles;
    private final HashMap<Integer, Runnable> traceUpdateIdToCleanupRunnableMap;
    private final Paint traceUpdatePaint;
    private final HashMap<Integer, TraceUpdate> traceUpdatesToDisplayMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebuggingOverlay(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.traceUpdatePaint = paint;
        this.traceUpdatesToDisplayMap = new HashMap<>();
        this.traceUpdateIdToCleanupRunnableMap = new HashMap<>();
        Paint paint2 = new Paint();
        this.highlightedElementsPaint = paint2;
        this.highlightedElementsRectangles = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDraw$lambda$0(DebuggingOverlay this$0, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.traceUpdatesToDisplayMap.remove(Integer.valueOf(i2));
        this$0.traceUpdateIdToCleanupRunnableMap.remove(Integer.valueOf(i2));
        this$0.invalidate();
    }

    public final void clearElementsHighlights() {
        this.highlightedElementsRectangles.clear();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) throws Throwable {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        for (TraceUpdate traceUpdate : this.traceUpdatesToDisplayMap.values()) {
            this.traceUpdatePaint.setColor(traceUpdate.getColor());
            canvas.drawRect(traceUpdate.getRectangle(), this.traceUpdatePaint);
            final int id = traceUpdate.getId();
            Runnable runnable = new Runnable() { // from class: com.facebook.react.views.debuggingoverlay.DebuggingOverlay$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DebuggingOverlay.onDraw$lambda$0(this.f$0, id);
                }
            };
            if (!this.traceUpdateIdToCleanupRunnableMap.containsKey(Integer.valueOf(id))) {
                this.traceUpdateIdToCleanupRunnableMap.put(Integer.valueOf(id), runnable);
                UiThreadUtil.runOnUiThread(runnable, 2000L);
            }
        }
        Iterator<RectF> it = this.highlightedElementsRectangles.iterator();
        while (it.hasNext()) {
            canvas.drawRect(it.next(), this.highlightedElementsPaint);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> elementsRectangles) {
        Intrinsics.checkNotNullParameter(elementsRectangles, "elementsRectangles");
        this.highlightedElementsRectangles = elementsRectangles;
        invalidate();
    }

    public final void setTraceUpdates(List<TraceUpdate> traceUpdates) {
        Intrinsics.checkNotNullParameter(traceUpdates, "traceUpdates");
        for (TraceUpdate traceUpdate : traceUpdates) {
            int id = traceUpdate.getId();
            if (this.traceUpdateIdToCleanupRunnableMap.containsKey(Integer.valueOf(id))) {
                UiThreadUtil.removeOnUiThread(this.traceUpdateIdToCleanupRunnableMap.get(Integer.valueOf(id)));
                this.traceUpdateIdToCleanupRunnableMap.remove(Integer.valueOf(id));
            }
            this.traceUpdatesToDisplayMap.put(Integer.valueOf(id), traceUpdate);
        }
        invalidate();
    }
}
