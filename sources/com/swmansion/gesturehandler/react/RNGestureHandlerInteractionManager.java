package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.GestureHandlerInteractionController;
import com.swmansion.gesturehandler.core.NativeViewGestureHandler;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\r54\u0012}\bnjG0L͜P.hS2şs{J$c$wCCU(\n*\tUNog|Pb\u000bI\u000f\u000e\u0016\u0007s4I[|s܈-Krom2\u0006nVycҽ:\u0005.2jP\b\u000b\u0019\u001aXO@~\tKc\u0010\"0Fqh[=Q\u0013$*\u0006l+I4jsf6vo\u000e>=-\u001bipYWc>\ne\rtbm\r?m,:X7c\u001cUW\u0011\u0017j[m\u0014\buK\u0017\u0001'U2\u0012\u0012eIp\u007fB)[W\u001be\u000b*l\u0005Wa:0[Wq`h\u00128w\u0001|;EJ\"NEVDE\u001a\u0015\u001c>;\u0003zkD`\u0002dC.\u0004\u0012>%:\u00187;9!g\u007fj\u0002-\u0017U\n\u001c%\u001eQ\u0015\u001f)i\\&d%\u001bZx\u007f:\u0002HK]f\u000ei=s\u0005\u001fkH>LNU\u0018G{?BG-EcQ'1k\bIrp'\rn}kmbHF#\u001d\u001f}>Y\u001ehE|\u000b{RdXZ\u0014{\u001e+\u0378\u007fݔ\u0017 dɼ\r33\u0014fUxkzM\f\rS1=ƀ[ˇo\u000e_ު/ECV{\u0016qT\u0007\u0014m?\u0011\u0007/٫Dΐ\u0010Zd̥Ϙ6b"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[Z0VL[(ZavG\u001dyV\u0017J-\r\u0012/", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014G5]v4CJ]0f[PG\u001d!g\u0018U2\r\u0012/", "u(E", "0k^0^0GU\u0006~\u0002Z;\u0001\u00138s", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "", "Ah\\B_;:\\\u0019\t\u000bl\u0019|\u0010+t\u00042\u0005N", "E`XA96K@\u0019\u0006vm0\u0007\u0012=", "1n]3\\.N`\u0019b\u0004m,\n\u0005-t\u00042\u0005N", "", "6`]1_,K", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "1n]CX9M6\u0015\bye,\nw+g\u000e\u0004\tM|+", "9dh", "", "2q^=E,EO(\u0003\u0005g:]\u0013<H{1zG\u0001$\tK~\u0011+r'", "6`]1_,KB\u0015\u0001", "", "@db2g", "Ag^B_+!O\"}\u0002^9Y\t\ra\t&{G\b\u0017\u0016$\u0004", "", "=sW2e\u000f:\\\u0018\u0006zk", "Ag^B_++S\u0017\t|g0\u0012\t\u001di\b8\u0003O| \u0017Q\u007f\u001cC\u000b", "Ag^B_++S%\u000f~k,_\u00058d\u0007(\t/\u000b\t\u0013K~nF\u0004\u00061]\u00050Dm", "Ag^B_+0O\u001d\u000e[h9_\u00058d\u0007(\t!|\u001b\u001eW|\u000e", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNGestureHandlerInteractionManager implements GestureHandlerInteractionController {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_BLOCKS_HANDLERS = "blocksHandlers";
    private static final String KEY_SIMULTANEOUS_HANDLERS = "simultaneousHandlers";
    private static final String KEY_WAIT_FOR = "waitFor";
    private final SparseArray<int[]> waitForRelations = new SparseArray<>();
    private final SparseArray<int[]> simultaneousRelations = new SparseArray<>();
    private final SparseArray<int[]> blockingRelations = new SparseArray<>();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[Z0VL[(ZavG\u001dyV\u0017J-\r\u0012\u0018\u001f.vO3(\f6RW", "", "u(E", "\u0019DH,5\u0013(1~ltA\beg\u0016El\u0016", "", "\u0019DH,F\u0010&C\u007fmVG\ffx\u001d_b\u0004d\u001fgv\u00045", "\u0019DH,J\b\"B\u0013_dK", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final int[] convertHandlerTagsArray(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        Intrinsics.checkNotNull(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = array.getInt(i2);
        }
        return iArr;
    }

    public final void configureInteractions(GestureHandler<?> handler, ReadableMap config) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        handler.setInteractionController(this);
        if (config.hasKey(KEY_WAIT_FOR)) {
            this.waitForRelations.put(handler.getTag(), convertHandlerTagsArray(config, KEY_WAIT_FOR));
        }
        if (config.hasKey(KEY_SIMULTANEOUS_HANDLERS)) {
            this.simultaneousRelations.put(handler.getTag(), convertHandlerTagsArray(config, KEY_SIMULTANEOUS_HANDLERS));
        }
        if (config.hasKey(KEY_BLOCKS_HANDLERS)) {
            this.blockingRelations.put(handler.getTag(), convertHandlerTagsArray(config, KEY_BLOCKS_HANDLERS));
        }
    }

    public final void dropRelationsForHandlerWithTag(int i2) {
        this.waitForRelations.remove(i2);
        this.simultaneousRelations.remove(i2);
    }

    public final void reset() {
        this.waitForRelations.clear();
        this.simultaneousRelations.clear();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandlerInteractionController
    public boolean shouldHandlerBeCancelledBy(GestureHandler<?> handler, GestureHandler<?> otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        return otherHandler instanceof NativeViewGestureHandler ? ((NativeViewGestureHandler) otherHandler).getDisallowInterruption() : otherHandler instanceof RNGestureHandlerRootHelper.RootViewGestureHandler;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandlerInteractionController
    public boolean shouldRecognizeSimultaneously(GestureHandler<?> handler, GestureHandler<?> otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = this.simultaneousRelations.get(handler.getTag());
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == otherHandler.getTag()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandlerInteractionController
    public boolean shouldRequireHandlerToWaitForFailure(GestureHandler<?> handler, GestureHandler<?> otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = this.blockingRelations.get(handler.getTag());
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == otherHandler.getTag()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandlerInteractionController
    public boolean shouldWaitForHandlerFailure(GestureHandler<?> handler, GestureHandler<?> otherHandler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(otherHandler, "otherHandler");
        int[] iArr = this.waitForRelations.get(handler.getTag());
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == otherHandler.getTag()) {
                return true;
            }
        }
        return false;
    }
}
