package com.dynatrace.agent.userinteraction.model;

import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.userinteraction.util.UserInteractionKeys;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!4i\bDZc|İY\u0010>éFB-!T\u0012&\u0007-ʑ˷4E"}, d2 = {"Bn9 B\u0015(P\u001e~xm", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dg", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TouchUserInteractionKt {
    public static final JSONObject toJSONObject(TouchUserInteraction touchUserInteraction) throws JSONException {
        Intrinsics.checkNotNullParameter(touchUserInteraction, "<this>");
        List<TouchEvent> positions = touchUserInteraction.getPositions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(positions, 10));
        for (TouchEvent touchEvent : positions) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", (int) touchEvent.getX());
            jSONObject.put("y", (int) touchEvent.getY());
            arrayList.add(jSONObject);
        }
        ArrayList arrayList2 = arrayList;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(EventKeys.Characteristics.HAS_USER_INTERACTION, true);
        jSONObject2.put(UserInteractionKeys.INTERACTION_NAME, PointerEventHelper.POINTER_TYPE_TOUCH);
        UiElement ancestor = touchUserInteraction.getAncestor();
        if (ancestor != null) {
            jSONObject2.put(UserInteractionKeys.ELEMENT_ANCESTOR_NAME, ancestor.getName());
            jSONObject2.put(UserInteractionKeys.ELEMENT_ANCESTOR_COMPONENT, ancestor.getComponent());
            jSONObject2.put(UserInteractionKeys.ELEMENT_ANCESTOR_ID, ancestor.getId());
        }
        jSONObject2.put(UserInteractionKeys.ELEMENT_NAME, touchUserInteraction.getElement().getName());
        jSONObject2.put(UserInteractionKeys.ELEMENT_COMPONENT, touchUserInteraction.getElement().getComponent());
        jSONObject2.put(UserInteractionKeys.ELEMENT_ID, touchUserInteraction.getElement().getId());
        jSONObject2.put("positions", new JSONArray((Collection) arrayList2));
        return jSONObject2;
    }
}
