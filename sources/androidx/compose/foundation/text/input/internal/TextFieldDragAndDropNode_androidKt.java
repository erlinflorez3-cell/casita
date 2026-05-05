package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: TextFieldDragAndDropNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!4i\bӵLc\u000b\u0004I\u0006>+6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.hS2\u000fq{<$q$yّCU(\u0007*ޛWN}gvJp\u000bK\u000f\u0014\u0016\u0001j2K]xs\u0012\u00172HrWޟM}މQ`#550@\"P\u0006\u0015\t*0X\u0012\u0007zqN:\u0014^A!n`\u0011e5*#\u0016MN\u0007ɉ`qT=XrcB?%\tohW7p@\f{\u0017ТX1\u0013}q$1HG7\u001b+y\u000e\u0017Tk?1K B5x54CU\u0004YFX.#%-_\r\f\u0003Tj5tf\f5<g\u0001[a\u001e7&\nԫ\u0011F\n\u0015\u0016-N6=\u001cl\u000e4E\u0005tc@~\u0012tA.\t\u0012Y\u001d%\u000eFCV+wapi(\u05ee;\u0006\u000b\u0014.)\u0007v1]Z\u0014\u0007'+V\bQ_aV<v\\:|Cm\u0012\u0005z\u001f:\u0015@V.Dɨ\u00158\u001d,Ga?+1m\bNj}\u0007\u0007ph\u0002yhGn0\u001f9=*\u0017#rat\u0016{_\u0003g¯\u0015W\"[\u0017\u0004\u000e\u001b0^}BG7 P_h\u0018zc\\83_\n=Y|\u0004&tIoCD\u007frߧe\\|\u001bOBh\rhhHY2ll*22vz&v*R~/\u00192M\u000b4Q<B)kCWҴ\"LG\u0004\u0019e`p \u0001Z9J\u0015y&\u0005\t/`ro\u001eu?̢ؼ\u0001z"}, d2 = {"BdgA90>Z\u0018]\bZ.X\u0012.D\r2\u0007)\u000b\u0016\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)|r`=\bg,[_1FL$", "6h]A@,=W\u0015m\u000fi,\u000b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_\u0016MB?g#2 h7", "=m3?b7", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+\u0017v%;a\u0019", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1kX=85M`-", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+\u001fm%*L?Jg\n", "1kX=@,MO\u0018z\nZ", "", "2qP445=2&\t\u0006K,\t\u0019/s\u000f\u0013{M\t\u001b%Us\u0018E", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)tyaB\u00169", "", "=mBAT9MS\u0018", "3uT;g", "=m4;g,KS\u0018", "=m<<i,=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">nb6g0H\\", "=m25T5@S\u0018", "=m4E\\;>R", "=m4;W,=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldDragAndDropNode_androidKt {
    public static /* synthetic */ DragAndDropModifierNode textFieldDragAndDropNode$default(Function0 function0, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, int i2, Object obj) {
        Function1 function18 = function16;
        Function1 function19 = function15;
        Function1 function110 = function14;
        Function1 function111 = function13;
        Function1 function112 = function12;
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            function112 = null;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            function111 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            function110 = null;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            function19 = null;
        }
        if ((i2 + 128) - (i2 | 128) != 0) {
            function18 = null;
        }
        return textFieldDragAndDropNode(function0, function2, function1, function112, function111, function110, function19, function18, (i2 + 256) - (i2 | 256) == 0 ? function17 : null);
    }

    public static final DragAndDropModifierNode textFieldDragAndDropNode(final Function0<? extends Set<MediaType>> function0, final Function2<? super ClipEntry, ? super ClipMetadata, Boolean> function2, final Function1<? super DragAndDropEvent, Unit> function1, final Function1<? super DragAndDropEvent, Unit> function12, final Function1<? super DragAndDropEvent, Unit> function13, final Function1<? super Offset, Unit> function14, final Function1<? super DragAndDropEvent, Unit> function15, final Function1<? super DragAndDropEvent, Unit> function16, final Function1<? super DragAndDropEvent, Unit> function17) {
        return DragAndDropNodeKt.DragAndDropModifierNode(new Function1<DragAndDropEvent, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                ClipDescription clipDescription = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
                Set<MediaType> setInvoke = function0.invoke();
                boolean z2 = false;
                if (!(setInvoke instanceof Collection) || !setInvoke.isEmpty()) {
                    for (MediaType mediaType : setInvoke) {
                        if (Intrinsics.areEqual(mediaType, MediaType.Companion.getAll()) || clipDescription.hasMimeType(mediaType.getRepresentation())) {
                            z2 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode.2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                function1.invoke(dragAndDropEvent);
                return function2.invoke(AndroidClipboardManager_androidKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription())).booleanValue();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent dragAndDropEvent) {
                Function1<DragAndDropEvent, Unit> function18 = function12;
                if (function18 != null) {
                    function18.invoke(dragAndDropEvent);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent dragAndDropEvent) {
                Function1<DragAndDropEvent, Unit> function18 = function13;
                if (function18 != null) {
                    function18.invoke(dragAndDropEvent);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onMoved(DragAndDropEvent dragAndDropEvent) {
                DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
                Function1<Offset, Unit> function18 = function14;
                if (function18 != null) {
                    function18.invoke(Offset.m3926boximpl(OffsetKt.Offset(androidDragEvent.getX(), androidDragEvent.getY())));
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent dragAndDropEvent) {
                Function1<DragAndDropEvent, Unit> function18 = function16;
                if (function18 != null) {
                    function18.invoke(dragAndDropEvent);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onChanged(DragAndDropEvent dragAndDropEvent) {
                Function1<DragAndDropEvent, Unit> function18 = function15;
                if (function18 != null) {
                    function18.invoke(dragAndDropEvent);
                    Unit unit = Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent dragAndDropEvent) {
                Function1<DragAndDropEvent, Unit> function18 = function17;
                if (function18 != null) {
                    function18.invoke(dragAndDropEvent);
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
    }
}
