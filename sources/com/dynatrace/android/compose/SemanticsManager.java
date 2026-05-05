package com.dynatrace.android.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.api.compose.SemanticsExtensionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007lpA0ZeP.XT2\u000fy\u0005<řc$\bCCU }*\teNogtM`ƑC%إFx\u0019+\n\\~]ܫ\u00134HoM4\u0016uKCxvL\u0004N1j>\b\u0010\u0019\u001c@G>yCSY\u0018*2VohU=S\u0013'*\bT\u001f/,%w\\E`ns9]&3mP^?_^\u0002\u0014\r\u000f`5\u001e\u000faL=p;C(=S1\u001b\u001boM\u0018Wqk\u0017\u0019+5>as\u0006J\t\u0004\"+CO;t;6j\u001dib\"&YR\u0014O^'@w)\u0001S<L\u001e\u0014A`0C\u0019\u0015\u000b>7\u0003\fk@~\u0007%BH\u000boQ/'\u00162Y<Kj_zS\u0019|<B\u0005]*1\u0003\u0007!\nWd֮\u0017ôXwYĸ\"ZKLf\fo<\u001c\tGî\u000eò\b<OĉG}\u00174%,W]?+/tɞL`"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~G}(3v%2KQ#g=\u001a\u0017hn\u000f", "", "\nh]6g\u0005", "u(E", "\"@6", "", "1n]3\\.N`\u0015\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u0012(\u001eie;\u0017p(]z1P\"", "Adc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAII>'\u0016lcI\u0014_;R\u00010\u001d\u0010?", "4dc0[\u0019HZ\u0019", "4dc0[\u0015:[\u0019Z\u0004]\n\u0004\t+r", "4dc0[\u001a>[\u0015\b\nb*\u000bq+m\u007f\t\tJ\t~!Fs\u000f@v2", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "4dc0[\u001a>[\u0015\b\nb*\u000bq+m\u007f", "Ad\\.a;BQ'", "7rA2_,:a\u0019Zxm0\u0007\u0012\u001dt{7{", "", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "7r56a(E@\u0019\u0006zZ:|d-t\u00042\u0005.\u0010\u0013&G", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "4dc0[\u0015:[\u0019_\u0005k\u000b\fs<o\u000b(\tO\u0015", "1n]3\\.", "4dc0[\u0015:[\u0019_\u0005k\u000b|\u0017-r\u00043\u000bD\u000b \u0002Ty\u0019<\u00044I", "4dc0[\u0015:[\u0019_\u0005k\u001b|\u001c>P\r2\u0007@\u000e&+", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SemanticsManager {
    private static SemanticsConfiguration configuration = null;
    public static final SemanticsManager INSTANCE = new SemanticsManager();
    private static final String TAG = Global.LOG_PREFIX + "SemanticsManager";
    public static final int $stable = 8;

    private SemanticsManager() {
    }

    private final String fetchNameForDescriptionProperty(SemanticsConfiguration semanticsConfiguration) {
        Object next;
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((String) next).length() > 0) {
                    break;
                }
            }
            String strFetchNameForTextProperty = (String) next;
            if (strFetchNameForTextProperty == null) {
                strFetchNameForTextProperty = INSTANCE.fetchNameForTextProperty(semanticsConfiguration);
            }
            if (strFetchNameForTextProperty != null) {
                return strFetchNameForTextProperty;
            }
        }
        return fetchNameForTextProperty(semanticsConfiguration);
    }

    private final String fetchNameForDtProperty(SemanticsConfiguration semanticsConfiguration) {
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsExtensionKt.getDtActionName());
        if (str != null) {
            String strFetchNameForDescriptionProperty = str;
            if (strFetchNameForDescriptionProperty.length() == 0) {
                strFetchNameForDescriptionProperty = INSTANCE.fetchNameForDescriptionProperty(semanticsConfiguration);
            }
            String str2 = strFetchNameForDescriptionProperty;
            if (str2 != null) {
                return str2;
            }
        }
        return fetchNameForDescriptionProperty(semanticsConfiguration);
    }

    private final String fetchNameForTextProperty(SemanticsConfiguration semanticsConfiguration) {
        Object next;
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getText());
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AnnotatedString) next).getText().length() > 0) {
                break;
            }
        }
        AnnotatedString annotatedString = (AnnotatedString) next;
        if (annotatedString != null) {
            return annotatedString.getText();
        }
        return null;
    }

    private final String fetchSemanticsName(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.contains(SemanticsExtensionKt.getDtActionName())) {
            return fetchNameForDtProperty(semanticsConfiguration);
        }
        if (semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            return fetchNameForDescriptionProperty(semanticsConfiguration);
        }
        if (semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getText())) {
            return fetchNameForTextProperty(semanticsConfiguration);
        }
        return null;
    }

    public static final Unit fetchSemanticsNameFromModifier$lambda$5(SemanticsConfiguration semanticsConfiguration, List list, List list2, Unit unit, Modifier.Element element) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        Intrinsics.checkNotNullParameter(element, "element");
        if (element instanceof SemanticsModifier) {
            SemanticsModifier semanticsModifier = (SemanticsModifier) element;
            String str = (String) SemanticsConfigurationKt.getOrNull(semanticsModifier.getSemanticsConfiguration(), SemanticsExtensionKt.getDtActionName());
            if (str != null) {
                semanticsConfiguration.set(SemanticsExtensionKt.getDtActionName(), str);
            }
            List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsModifier.getSemanticsConfiguration(), SemanticsProperties.INSTANCE.getContentDescription());
            if (list3 != null) {
                list.addAll(list3);
            }
            List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsModifier.getSemanticsConfiguration(), SemanticsProperties.INSTANCE.getText());
            if (list4 != null) {
                list2.addAll(list4);
            }
        }
        return Unit.INSTANCE;
    }

    public final String fetchNameAndClear() {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, configuration == null ? "onUA: no SemanticsConfiguration value available" : "onUA: " + configuration);
        }
        SemanticsConfiguration semanticsConfiguration = configuration;
        String strFetchSemanticsName = semanticsConfiguration != null ? INSTANCE.fetchSemanticsName(semanticsConfiguration) : null;
        configuration = null;
        return strFetchSemanticsName;
    }

    public final Object fetchRole() {
        SemanticsConfiguration semanticsConfiguration = configuration;
        if (semanticsConfiguration != null) {
            return (Role) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getRole());
        }
        return null;
    }

    public final String fetchSemanticsNameFromModifier(Modifier modifier) {
        final SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (modifier != null) {
            modifier.foldIn(Unit.INSTANCE, new Function2() { // from class: com.dynatrace.android.compose.SemanticsManager$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SemanticsManager.fetchSemanticsNameFromModifier$lambda$5(semanticsConfiguration, arrayList, arrayList2, (Unit) obj, (Modifier.Element) obj2);
                }
            });
        }
        semanticsConfiguration.set(SemanticsProperties.INSTANCE.getContentDescription(), arrayList);
        semanticsConfiguration.set(SemanticsProperties.INSTANCE.getText(), arrayList2);
        return fetchSemanticsName(semanticsConfiguration);
    }

    public final SemanticsConfiguration getConfiguration() {
        return configuration;
    }

    public final boolean isFinalReleaseActionState(PointerEvent event, PointerEventPass pass) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(pass, "pass");
        return PointerEventType.m5334equalsimpl0(event.m5327getType7fucELk(), PointerEventType.Companion.m5342getRelease7fucELk()) && pass.ordinal() == PointerEventPass.Final.ordinal();
    }

    public final boolean isReleaseActionState(PointerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return PointerEventType.m5334equalsimpl0(event.m5327getType7fucELk(), PointerEventType.Companion.m5342getRelease7fucELk());
    }

    public final void setConfiguration(SemanticsConfiguration semanticsConfiguration) {
        configuration = semanticsConfiguration;
    }
}
