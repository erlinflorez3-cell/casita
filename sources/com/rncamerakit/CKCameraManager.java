package com.rncamerakit;

import android.util.Size;
import androidx.core.internal.view.SupportMenu;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.rncamerakit.events.CaptureButtonPressInEvent;
import com.rncamerakit.events.CaptureButtonPressOutEvent;
import com.rncamerakit.events.ErrorEvent;
import com.rncamerakit.events.OrientationChangeEvent;
import com.rncamerakit.events.PictureTakenEvent;
import com.rncamerakit.events.ReadCodeEvent;
import com.rncamerakit.events.ZoomEvent;
import com.swmansion.rnscreens.Screen;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0015\u007f\u0007|jAӄLeVPZS8\u001bs{Břc$wCCU(}*\tUOog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[}e\u0012\u001d8JoE7UoK=ht<\t(20A\u0002\u0005\u0007$@Ϻ@|\u000bE[\f@0noz]\u001dQ\u0013\u001b*\u0006l\"Ә\"\\uQ~VzdR/Q\u0003\u001aF\\(w0+USX\u001d9\u001b\u007fy*;BG5C0c\u0005\u0017R\nK1I8QMn54CI\"b|lH6#9g\r\f\u0002V`\u0013ax\fU+\u007fiYa&*\u000ey*\u0018l\n\u001c\u0018?JD,HyN\"{\r\u0001gXP0mr\u0004\tqN\u0017S\u007fc1G0~Sw:Gd}\u0001M%,:\u0019nOj\u0005\u0012n%3T&QaWNU`P XkxJu+\u001a8\u001dHG.>,\u0015<'=7\n9S'y\u001c`F}u3k/X2jV[:nDFZ\r\u001aj\\d3k\u0001ZfF)O2S5\tN\u0018h{\u0006X9%>]\u007flwze]8%_n=X|\t&YO]aS\u0018hߧeR\u00053\b[p%pfpb<^j8:2vj@\u007f\u0002C\\)+4UpJRr6Ǭ`\u0015V\"fZO\u001e!_\tw@\u0005bC<\u0005\u007f##\t1Vj\u0013\bi\u000fHZ\b)8;di5G5\u0006&vD\u0015#5~$\u0004U\fdGz\u0012\\z\u001e\u0014.<29\u007f>m\u0017\u001d\u000fA20-uR\u0001\riO(&)\b@\u0014\u0004\u0001<\u0010 j\u001f;\u0011pX_l\u00198u\rrS\u000er\"\u0012c\\yun\u001d(igar1hlTF\r\u001d!4$/oR\u0003CO[)3\u0015&2ڏ\u0019ak\t8D\b\r'&#t42q&\bdg\\`;hMg!V\"R\u000bKXV\u0016\u0010\bp\u0018d\u0013AXYf\u0007UfM;3\f\t\u001f,;\u001d\u001fsH@\b}b=\u00100\u0002S\u0016\u0016tBS\u0011}Yu\u0010\u0006Mr\nx\u001aR!\n_\u0007\u0012JLPZer!04sH:Ojz\u0005j5j9tT\u0016;[T\u0018\u0015@\u0001\u000eVw\u0011-1pskZ\u001cv\u0011\\\u0005fKe\u000ev/[\u0019~=BN|CA\u001dmtT_g@0k\u001d7G1TG|3]\\Tg*X\\\u000f\u001b]]qI2:\u0012zAm\u001a\u000eR=`\u0013+v0\u001bg`Ac\u0005@v\u000b\u0004d~h\u0005A~R|No\u0004C\u0015\u001cq\"\u000f9(\u007fv}rEL|wgI(\u001b/F?\u0006:\b*KcC\u0014kE=wyD+\ngk;,\bP$5(\r!\u000b|TkRu)q.qDq2\r!`8\u0004\\J%x\u0018H 8e\u0001a\rYc*\u0004\u0006\"X'Yn\\ףWи|\u0016kؙ{p[\u000f\u0011kQX\u007ft;Sɨ\r_"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/]\u000eY<\t\u0017$CW\nEr'5fS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#]\u0006+>m\u00072MU#g=\u001a\u0017hn\u000f", "\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/]\u000eY<\t\u0017$CE", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "5dc\u0010b5MS,\u000e", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u00125U{/\u0013x!5QA7z8(\u001eFkB\u0016c?]L", "Adc\u0010b5MS,\u000e", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", "", "", "5dc\u001bT4>", "@dR2\\=>1#\u0007\u0003Z5{", "", "DhTD", "1n\\:T5=7\u0018", "/qV@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc\u000fT9<]\u0018~[k(\u0005\t\u001di\u0015(", "4qP:X\u001aBh\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "Adc\u0010T4>`\u0015m\u000fi,", "Bx_2", "Adc\u0013_(LV\u0001\ty^", ";nS2", "Adc\u0013b*Na\u0001\ty^", "Adc\u0013e(FSv\t\u0002h9", "1n[<e", "", "uKR<`uK\\\u0017z\u0003^9x\u000f3tI\u0006a\u001e|\u001f\u0017Tkc#{!FUG'3v\u0018w1LJk6\u001e\">%*", "Adc\u0019T:>`v\t\u0002h9", "Adc\u001aT?)V#\u000e\u0005J<x\u00103t\u0014\u0013\tD\u000b$\u001bVs#8\u0006)?b", "D`[BX", "Adc\u001aT?3]#\u0007", "4`RAb9", "", "Adc\u001ch;Ic(ivm/", ">`c5", "Adc\u001fT;B]\u0003\u0010zk3x\u001d", "Adc\u001fT;B]\u0003\u0010zk3x\u001d\ro\u00072\t", "Adc\u001fX:>by\txn:k\r7e\n8\u000b", "Adc\u001fX:>by\txn:n\f/ng2\u000bD\u000b uG~\u000e:\u0006%4", "", "Adc\u001fX:Bh\u0019f\u0005],", "Adc V(G0\u0015\fxh+|", "3mP/_,=", "Adc V(GB\u001c\f\u0005m;\u0004\t\u000ee\u0007$\u0010", "Adc [6P4&z\u0003^", "Adc [<Mb\u0019\fVg0\u0005\u0005>i\n1ZP\u000e\u0013&Ky\u0017", "2ta.g0H\\", "Adc [<Mb\u0019\fea6\f\u0013\u001do\u00101z", "Adc!b9<V\u0001\ty^", "Adc'b6F", "Adc'b6F;#}z", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CKCameraManager extends SimpleViewManager<CKCamera> {
    private ReactApplicationContext context;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CKCameraManager(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public CKCamera createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new CKCamera(context);
    }

    public final ReactApplicationContext getContext() {
        return this.context;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapOf = MapBuilder.of(OrientationChangeEvent.EVENT_NAME, MapBuilder.of("registrationName", "onOrientationChange"), ReadCodeEvent.EVENT_NAME, MapBuilder.of("registrationName", "onReadCode"), PictureTakenEvent.EVENT_NAME, MapBuilder.of("registrationName", "onPictureTaken"), ZoomEvent.EVENT_NAME, MapBuilder.of("registrationName", "onZoom"), ErrorEvent.EVENT_NAME, MapBuilder.of("registrationName", "onError"), CaptureButtonPressInEvent.EVENT_NAME, MapBuilder.of("registrationName", "onCaptureButtonPressIn"), CaptureButtonPressOutEvent.EVENT_NAME, MapBuilder.of("registrationName", "onCaptureButtonPressOut"));
        Intrinsics.checkNotNullExpressionValue(mapOf, "of(...)");
        return mapOf;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CKCamera";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(CKCamera view, String str, ReadableArray readableArray) {
        String str2;
        Intrinsics.checkNotNullParameter(view, "view");
        String str3 = "CameraManager received command " + str + "(";
        int size = readableArray != null ? readableArray.size() : 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                ReadableType type = readableArray != null ? readableArray.getType(0) : null;
                switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                    case 1:
                        str2 = "Null";
                        break;
                    case 2:
                        str2 = "Array";
                        break;
                    case 3:
                        str2 = "Boolean";
                        break;
                    case 4:
                        str2 = "Map";
                        break;
                    case 5:
                        str2 = "Number";
                        break;
                    case 6:
                        str2 = "String";
                        break;
                    default:
                        str2 = "";
                        break;
                }
                str3 = str3 + str2;
                if (i2 != size) {
                    i2++;
                }
            }
        }
        String str4 = str3 + ")";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003Pq|\u000b,\u0013^h7=\u001bThuB")
    public final void setBarcodeFrameSize(CKCamera view, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (readableMap != null && readableMap.hasKey("width") && readableMap.hasKey("height")) {
            view.setBarcodeFrameSize(new Size(readableMap.getInt("width"), readableMap.getInt("height")));
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004Pl~\u000e)\u0002\u0012f;")
    public final void setCameraType(CKCamera view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null) {
            str = "back";
        }
        view.setCameraType(str);
    }

    public final void setContext(ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "<set-?>");
        this.context = reactApplicationContext;
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007[`\r\u0004\u0015\u001d|[")
    public final void setFlashMode(CKCamera view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFlashMode(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^b\u000f\u000f\u0015\u001d|[")
    public final void setFocusMode(CKCamera view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null) {
            str = "on";
        }
        view.setAutoFocus(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = -16711936, name = "\u0007a`\u0007\u0001\u000b\u001d\u0005eH")
    public final void setFrameColor(CKCamera view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFrameColor(num != null ? num.intValue() : -16711936);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = SupportMenu.CATEGORY_MASK, name = "\rPr~\u000e\u000b\u001d\u0005eH")
    public final void setLaserColor(CKCamera view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLaserColor(num != null ? num.intValue() : SupportMenu.CATEGORY_MASK);
    }

    public final void setMaxPhotoQualityPrioritization(CKCamera cKCamera, String str) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultDouble = 420.0d, name = "\u000ePws\u000b7\u001b")
    public final void setMaxZoom(CKCamera view, double d2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setMaxZoom(Double.valueOf(d2));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010ds\n\u0011<}yj>")
    public final void setOutputPath(CKCamera view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null) {
            str = "";
        }
        view.setOutputPath(str);
    }

    public final void setRatioOverlay(CKCamera cKCamera, String str) {
    }

    public final void setRatioOverlayColor(CKCamera cKCamera, Integer num) {
    }

    public final void setResetFocusTimeout(CKCamera cKCamera, int i2) {
    }

    public final void setResetFocusWhenMotionDetected(CKCamera cKCamera, boolean z2) {
    }

    public final void setResizeMode(CKCamera cKCamera, String str) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014R`\b]) {e:5")
    public final void setScanBarcode(CKCamera view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScanBarcode(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014R`\bo0 \bjJ<\u001bEdg>$")
    public final void setScanThrottleDelay(CKCamera cKCamera, int i2) {
        if (cKCamera != null) {
            cKCamera.setScanThrottleDelay(i2);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wn\u0011a:\u000f\u0006[")
    public final void setShowFrame(CKCamera view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShowFrame(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wt\u000e\u0010- Yd?=\u0017uhjKn\u001a^\t[$\u0018\u0013")
    public final void setShutterAnimationDuration(CKCamera view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShutterAnimationDuration(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wt\u000e\u0010- h^ED%TnpK\u000f")
    public final void setShutterPhotoSound(CKCamera view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShutterPhotoSound(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015^q|\u0004\u0015\u001d|[")
    public final void setTorchMode(CKCamera view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTorchMode(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultDouble = Screen.SHEET_FIT_TO_CONTENTS, name = "\u001b^n\u0007")
    public final void setZoom(CKCamera view, double d2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setZoom(d2 == -1.0d ? null : Double.valueOf(d2));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001b^n\u0007h7\u0012}")
    public final void setZoomMode(CKCamera view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setZoomMode(str);
    }
}
