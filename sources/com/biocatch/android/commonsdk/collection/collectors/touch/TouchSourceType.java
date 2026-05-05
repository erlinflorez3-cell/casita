package com.biocatch.android.commonsdk.collection.collectors.touch;

import android.view.MotionEvent;
import androidx.core.view.InputDeviceCompat;
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0019Gّ/!Ǟ`\u0014R2\"y\u0017f\u0019ˎ^C\u001eGC\u0013X0\u000fө\u007f42[\rqI<>\u001a\u0004$qOTjPnP^sC\u0015\u000b~xp22U~dz\u000f8JX?9VX=?j]6\u000b+\u001b\">\u0006m\u0001 71\u0010|\t,K\u0012!\u0019@vJ;\rS\u0016\u0003\u0012\fP\t\u0001$oPN<\\ǶaP"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pVV^*_\u001caG$\u0010]{X;\u001a\u0003Y08yD\r", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "!ND\u001f6\f8C\u0002dcH\u001ee", "!ND\u001f6\f80\u007fnZM\u0016fw\u0012_m\u0017o'p\u0005", "!ND\u001f6\f81\u007fZhL&ar#Sn\fY&", "!ND\u001f6\f81\u007fZhL&gr\u0013Nn\bh", "!ND\u001f6\f81\u007fZhL&gr\u001dIn\fe)", "!ND\u001f6\f81\u007fZhL&ku\u000bCe\u0005W'g", "!ND\u001f6\f82\u0004ZY", "!ND\u001f6\f85tfZI\b[", "!ND\u001f6\f86wf^", "!ND\u001f6\f88\u0003rhM\u0010Zn", "!ND\u001f6\f89xrWH\big", "!ND\u001f6\f8;\u0003nh>", "!ND\u001f6\f8;\u0003nh>&ih\u0016An\fl ", "!ND\u001f6\f8@\u0003mVK vh\u0018Ci\u0007[-", "!ND\u001f6\f8A\braN\u001a", "!ND\u001f6\f8B\u0003nXA\u0017Xg", "!ND\u001f6\f8B\u0003nXA\u001aZu\u000fEh", "!ND\u001f6\f8B\u0003nXA&ed Ia\u0004j$j\u007f", "!ND\u001f6\f8B\u0006ZXD\tXo\u0016", "#MB\"C\u0017(@\b^Y", "\u0011n\\=T5B]\"", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public enum TouchSourceType {
    SOURCE_UNKNOWN,
    SOURCE_BLUETOOTH_STYLUS,
    SOURCE_CLASS_JOYSTICK,
    SOURCE_CLASS_POINTER,
    SOURCE_CLASS_POSITION,
    SOURCE_CLASS_TRACKBALL,
    SOURCE_DPAD,
    SOURCE_GAMEPAD,
    SOURCE_HDMI,
    SOURCE_JOYSTICK,
    SOURCE_KEYBOARD,
    SOURCE_MOUSE,
    SOURCE_MOUSE_RELATIVE,
    SOURCE_ROTARY_ENCODER,
    SOURCE_STYLUS,
    SOURCE_TOUCHPAD,
    SOURCE_TOUCHSCREEN,
    SOURCE_TOUCH_NAVIGATION,
    SOURCE_TRACKBALL,
    UNSUPPORTED;

    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pVV^*_\u001caG$\u0010]{X;\u001a\u0003Y08yDu|\u00124T}Dl\u000b\u0015k", "", "u(E", "5dc b<KQ\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pVV^*_\u001caG$\u0010]{X;\u001a\u0003Y08yD\r", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TouchSourceType getSource(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            switch (event.getSource()) {
                case 0:
                    return TouchSourceType.SOURCE_UNKNOWN;
                case 2:
                    return TouchSourceType.SOURCE_CLASS_POINTER;
                case 4:
                    return TouchSourceType.SOURCE_CLASS_TRACKBALL;
                case 8:
                    return TouchSourceType.SOURCE_CLASS_POSITION;
                case 16:
                    return TouchSourceType.SOURCE_CLASS_JOYSTICK;
                case 257:
                    return TouchSourceType.SOURCE_KEYBOARD;
                case 513:
                    return TouchSourceType.SOURCE_DPAD;
                case 1025:
                    return TouchSourceType.SOURCE_GAMEPAD;
                case 4098:
                    return TouchSourceType.SOURCE_TOUCHSCREEN;
                case 8194:
                    return TouchSourceType.SOURCE_MOUSE;
                case 16386:
                    return TouchSourceType.SOURCE_STYLUS;
                case 49154:
                    return TouchSourceType.SOURCE_BLUETOOTH_STYLUS;
                case InputDeviceCompat.SOURCE_TRACKBALL /* 65540 */:
                    return TouchSourceType.SOURCE_TRACKBALL;
                case 131076:
                    return TouchSourceType.SOURCE_MOUSE_RELATIVE;
                case InputDeviceCompat.SOURCE_TOUCHPAD /* 1048584 */:
                    return TouchSourceType.SOURCE_TOUCHPAD;
                case 2097152:
                    return TouchSourceType.SOURCE_TOUCH_NAVIGATION;
                case 4194304:
                    return TouchSourceType.SOURCE_ROTARY_ENCODER;
                case InputDeviceCompat.SOURCE_JOYSTICK /* 16777232 */:
                    return TouchSourceType.SOURCE_JOYSTICK;
                case InputDeviceCompat.SOURCE_HDMI /* 33554433 */:
                    return TouchSourceType.SOURCE_HDMI;
                default:
                    return TouchSourceType.UNSUPPORTED;
            }
        }
    }
}
