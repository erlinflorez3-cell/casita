package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.ArrayList;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\u0015\"4ߚ\u007f\u0007tvAӄLeV.ZS0\u0010s{J$c$wCAZ0Ԃ@\u0016\u007fTwi~J\t\u000bq\u000e>\u0015\u0006+/֒Yxk\u0013W@PqW3{om=nwN\u0005N6hLB\u000b\u000f\u001fBH>|AW\u0014, 7XphZ=Q\u0013#*\u0006l 1\"jqf6vr\u000e@=.\u001bkXMUkv\u0011֚\u0011T"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\r<s57[\u0002)9w'.ZJ7\u007f}|\u0015eq;\tg5P`8GYU(p:nF\u0010\u0014Z\u001b$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#]\u0006+>m\u00072MU#g=\u001a\u0017hn\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\r<s57[\u0002)9w'.ZJ7\u007f}|\u0015eq;\tg5P`8GYU(p(", "u(E", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u001bT4>", "", "@dR2\\=>1#\u0007\u0003Z5{", "", "DhTD", "1n\\:T5=7\u0018", "/qV@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0004$ 2#\"#'\u001f\u0006,\u001a&\u001f\u0013*")
public final class DebuggingOverlayManager extends SimpleViewManager<DebuggingOverlay> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "DebuggingOverlay";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\r<s57[\u0002)9w'.ZJ7\u007f}|\u0015eq;\tg5P`8GYU(p:nF\u0010\u0014Z\u001b\r\t\u0017\rd=-rN@t", "", "u(E", " D0\u0010G&\u001c:tlh", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public DebuggingOverlay createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DebuggingOverlay(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(DebuggingOverlay view, String commandId, ReadableArray readableArray) throws Exception {
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        int iHashCode = commandId.hashCode();
        if (iHashCode != -1942063165) {
            if (iHashCode != 1326903961) {
                if (iHashCode == 1385348555 && commandId.equals("highlightElements")) {
                    if (readableArray == null) {
                        return;
                    }
                    ReadableArray array = readableArray.getArray(0);
                    ArrayList arrayList = new ArrayList();
                    int size = array.size();
                    boolean z2 = true;
                    for (int i2 = 0; i2 < size; i2++) {
                        ReadableMap map = array.getMap(i2);
                        try {
                            float f4 = (float) map.getDouble("x");
                            float f5 = (float) map.getDouble("y");
                            try {
                                try {
                                    arrayList.add(new RectF(PixelUtil.INSTANCE.dpToPx(f4), PixelUtil.INSTANCE.dpToPx(f5), PixelUtil.INSTANCE.dpToPx((float) (((double) f4) + map.getDouble("width"))), PixelUtil.INSTANCE.dpToPx((float) (((double) f5) + map.getDouble("height")))));
                                } catch (Exception e2) {
                                    e = e2;
                                    if (!(e instanceof NoSuchKeyException ? true : e instanceof UnexpectedNativeTypeException)) {
                                        throw e;
                                    }
                                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                                    z2 = false;
                                }
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } catch (Exception e4) {
                            e = e4;
                        }
                    }
                    if (z2) {
                        view.setHighlightedElementsRectangles(arrayList);
                        return;
                    }
                    return;
                }
            } else if (commandId.equals("highlightTraceUpdates")) {
                if (readableArray == null) {
                    return;
                }
                boolean z3 = false;
                ReadableArray array2 = readableArray.getArray(0);
                ArrayList arrayList2 = new ArrayList();
                int size2 = array2.size();
                int i3 = 0;
                boolean z4 = true;
                while (true) {
                    if (i3 >= size2) {
                        z3 = z4;
                        break;
                    }
                    ReadableMap map2 = array2.getMap(i3);
                    ReadableMap map3 = map2.getMap("rectangle");
                    if (map3 == null) {
                        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field is null"));
                        break;
                    }
                    int i4 = map2.getInt("id");
                    int i5 = map2.getInt("color");
                    try {
                        f2 = (float) map3.getDouble("x");
                        try {
                            f3 = (float) map3.getDouble("y");
                            try {
                                try {
                                } catch (Exception e5) {
                                    e = e5;
                                }
                            } catch (Exception e6) {
                                e = e6;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } catch (Exception e8) {
                        e = e8;
                    }
                    try {
                        arrayList2.add(new TraceUpdate(i4, new RectF(PixelUtil.INSTANCE.dpToPx(f2), PixelUtil.INSTANCE.dpToPx(f3), PixelUtil.INSTANCE.dpToPx((float) (((double) f2) + map3.getDouble("width"))), PixelUtil.INSTANCE.dpToPx((float) (((double) f3) + map3.getDouble("height")))), i5));
                    } catch (Exception e9) {
                        e = e9;
                        if (!(e instanceof NoSuchKeyException ? true : e instanceof UnexpectedNativeTypeException)) {
                            throw e;
                        }
                        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"));
                        z4 = false;
                    }
                    i3++;
                    z3 = false;
                }
                if (z3) {
                    view.setTraceUpdates(arrayList2);
                    return;
                }
                return;
            }
        } else if (commandId.equals("clearElementsHighlights")) {
            view.clearElementsHighlights();
            return;
        }
        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Received unexpected command in DebuggingOverlayManager"));
    }
}
