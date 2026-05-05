package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.GestureHandlerRegistry;
import java.util.ArrayList;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\r(4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<$a&yCIU\"}(\rWN}gvJ`\rYƤ6\u0016'ilLǤ|] \u000fz^}GKM\u001eFid\u0003@\u001d `%h}\u0013\f2*v\u0013'~QW$\u0012^C9L`\u001ae\u0005H 6F.\u00106`wN<I\u001bb\u0001/k\u0007wRf'\u000e>EY\u001bWl';\u0005\u0012\"9JO5C(\u001c\u0015\u0015dsE\u0013?w>\u001bgU,[M\u0002aNX.\u0017]E] u~6b\u0015Up\f-,}haO</(~\n!T\u0004<\u001bm\\vE(| \u001aCz\u0003WPP\b_p\u0005\u0011`d\u001eU\u0004A6Q\u001b\u0015T*K'eO{3\u001bN+\u000f}9_d\u000ef\u0016IY@k?iX=v\\:]Kx\u001cp\u0011\u0005Z\f>V\u00183\f\u00114\u0018S<\"9s5y\u0003`Lwz\u0015b~R\u0018UvBxÅ\u0018֖.\t\u0014ɮ\u0015z\u0013oh^h2!Q,T\r~6\u0018N^N˖#ٚ\u0014NWŖ:\u0007[c\"5?rGc~q\u001e[I^96\u007fh>h\u0001xj̶>И\tXn̻Ζ\u0010s"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[c'IP\\;ifH", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014P,Pz5VYb\u0002", "u(E", "/sc.V/>R\b\t", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "", "6`]1_,Ka", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "6`]1_,Kay\t\bO0|\u001b", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "/sc.V/!O\"}\u0002^9k\u0013 i\u007f:", "", "6`]1_,KB\u0015\u0001", "DhTDG(@", "/bc6b5-g$~", "2dc.V/!O\"}\u0002^9", "", "6`]1_,K", "2q^=43E6\u0015\bye,\n\u0017", "2q^=;(GR ~\b", "5dc\u0015T5=Z\u0019\f", "5dc\u0015T5=Z\u0019\f\t?6\ny3e\u0012", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u0015T5=Z\u0019\f\t?6\ny3e\u0012\u001a\u007fO\u0004\u0006\u0013I", "@dV6f;>`{z\u0004]3|\u0016", "@dV6f;>`{z\u0004]3|\u0016\u0010o\r\u0019\u007f@\u0013\t\u001bVr|8x", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNGestureHandlerRegistry implements GestureHandlerRegistry {
    private final SparseArray<GestureHandler<?>> handlers = new SparseArray<>();
    private final SparseArray<Integer> attachedTo = new SparseArray<>();
    private final SparseArray<ArrayList<GestureHandler<?>>> handlersForView = new SparseArray<>();

    private final synchronized void detachHandler(final GestureHandler<?> gestureHandler) {
        Integer num = this.attachedTo.get(gestureHandler.getTag());
        if (num != null) {
            this.attachedTo.remove(gestureHandler.getTag());
            ArrayList<GestureHandler<?>> arrayList = this.handlersForView.get(num.intValue());
            if (arrayList != null) {
                synchronized (arrayList) {
                    arrayList.remove(gestureHandler);
                }
                if (arrayList.size() == 0) {
                    this.handlersForView.remove(num.intValue());
                }
            }
        }
        if (gestureHandler.getView() != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerRegistry$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RNGestureHandlerRegistry.detachHandler$lambda$4(gestureHandler);
                }
            });
        }
    }

    public static final void detachHandler$lambda$4(GestureHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "$handler");
        handler.cancel();
    }

    private final synchronized void registerHandlerForViewWithTag(int i2, GestureHandler<?> gestureHandler) {
        if (this.attachedTo.get(gestureHandler.getTag()) != null) {
            throw new IllegalStateException(("Handler " + gestureHandler + " already attached").toString());
        }
        this.attachedTo.put(gestureHandler.getTag(), Integer.valueOf(i2));
        ArrayList<GestureHandler<?>> arrayList = this.handlersForView.get(i2);
        if (arrayList == null) {
            ArrayList<GestureHandler<?>> arrayList2 = new ArrayList<>(1);
            arrayList2.add(gestureHandler);
            this.handlersForView.put(i2, arrayList2);
        } else {
            synchronized (arrayList) {
                arrayList.add(gestureHandler);
            }
        }
    }

    public final synchronized boolean attachHandlerToView(int i2, int i3, int i4) {
        boolean z2;
        GestureHandler<?> gestureHandler = this.handlers.get(i2);
        if (gestureHandler != null) {
            detachHandler(gestureHandler);
            gestureHandler.setActionType(i4);
            registerHandlerForViewWithTag(i3, gestureHandler);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final synchronized void dropAllHandlers() {
        this.handlers.clear();
        this.attachedTo.clear();
        this.handlersForView.clear();
    }

    public final synchronized void dropHandler(int i2) {
        GestureHandler<?> gestureHandler = this.handlers.get(i2);
        if (gestureHandler != null) {
            detachHandler(gestureHandler);
            this.handlers.remove(i2);
        }
    }

    public final synchronized GestureHandler<?> getHandler(int i2) {
        return this.handlers.get(i2);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandlerRegistry
    public synchronized ArrayList<GestureHandler<?>> getHandlersForView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return getHandlersForViewWithTag(view.getId());
    }

    public final synchronized ArrayList<GestureHandler<?>> getHandlersForViewWithTag(int i2) {
        return this.handlersForView.get(i2);
    }

    public final synchronized void registerHandler(GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handlers.put(handler.getTag(), handler);
    }
}
