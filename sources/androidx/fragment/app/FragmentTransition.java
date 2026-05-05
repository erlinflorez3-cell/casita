package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: FragmentTransition.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0007nʑA0ZeP.XS2\u000fy\u0005<řc$\bCCU(\n*\teNogtLb\u000bQ-\u000eǝ\u0001j:O]xc\u0016\u0015̱B\u0006ЀcM\u001e<yez6ӯ$208B?\u000f\u001eBH>{+GY\u0012*0nwjV\u001bU\u001d\u001a@\rn$\u000f'tg|@x|kEG/\u0013kRNUl@~]\rtbU\u0019'e,:X7c\u001fkXK\u000f`kW\u0005Upk\u0007/'oGW\u0005o6\u0007\u0005D\u001f9a%c\u0003(l\u0005\u007fn::[Sq_h\u000eV\rA\u0001UB\u0012$\u001e'v8s\u001f/(\u001cJ\rti?~\u000f\u0007N\u0010|q6E2\u00105;9Is\u007fmk\u001d\\O\u0014\u0005;+i\u00067Kim&`C |\u0004a3a@kU^\fi=\u001c\u0011\u001fn2:\u0012J_\f?}!.E2G]I#Oy0T\u000blG\u0015nikkhGn$%\u001a\u000eѯ\u000bɔ^Dlʍ<`b[D\u0013c\u001b\u0003\t4\fi؆^ʟ@!-ī˃S\u0004"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DH\u000b\u001c@{\u001a=QMDA", "", "u(E", "\u001eK0!9\u0016+;\u0013bbI\u0013", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DH\u000b\u001c@{\u001a=QMDO<)\u001c>", "!T?\u001dB\u0019-M|feE", "1`[9F/:`\u0019}Ze,\u0005\t8tm7wM\u0010v F", "", "7m5?T.FS\"\u000e", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "=tc\u0013e(@[\u0019\b\n", "7r?<c", "", "AgP?X+\u001eZ\u0019\u0007zg;\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\\$$C\u0004u8\u0002z", "", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7rBAT9M", "@db<_=>A)\n\u0006h9\fl7p\u0007", "Adc#\\,PD\u001d\r~[0\u0004\r>y", "DhTDf", "", "Dhb6U0EW(\u0013", "", "At_=b9Ma\b\fvg:\u0001\u00183o\t", "4h]1>,R4#\fkZ3\r\t", "D`[BX", "@dc.\\5/O \u000fzl", "<`\\2W\u001dBS+\r", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FragmentTransition {
    public static final FragmentTransition INSTANCE;
    public static final FragmentTransitionImpl PLATFORM_IMPL;
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    private FragmentTransition() {
    }

    static {
        FragmentTransition fragmentTransition = new FragmentTransition();
        INSTANCE = fragmentTransition;
        PLATFORM_IMPL = new FragmentTransitionCompat21();
        SUPPORT_IMPL = fragmentTransition.resolveSupportImpl();
    }

    private final FragmentTransitionImpl resolveSupportImpl() {
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (FragmentTransitionImpl) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    public static final String findKeyForValue(ArrayMap<String, String> arrayMap, String value) {
        Intrinsics.checkNotNullParameter(arrayMap, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : arrayMap.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt.firstOrNull((List) arrayList);
    }

    @JvmStatic
    public static final void retainValues(ArrayMap<String, String> arrayMap, ArrayMap<String, View> namedViews) {
        Intrinsics.checkNotNullParameter(arrayMap, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        for (int size = arrayMap.size() - 1; -1 < size; size--) {
            if (!namedViews.containsKey(arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    @JvmStatic
    public static final void callSharedElementStartEnd(Fragment inFragment, Fragment outFragment, boolean z2, ArrayMap<String, View> sharedElements, boolean z3) {
        SharedElementCallback enterTransitionCallback;
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        if (z2) {
            enterTransitionCallback = outFragment.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = inFragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayMap<String, View> arrayMap = sharedElements;
            ArrayList arrayList = new ArrayList(arrayMap.size());
            Iterator<Map.Entry<String, View>> it = arrayMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(arrayMap.size());
            Iterator<Map.Entry<String, View>> it2 = arrayMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().getKey());
            }
            ArrayList arrayList4 = arrayList3;
            if (z3) {
                enterTransitionCallback.onSharedElementStart(arrayList4, arrayList2, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList4, arrayList2, null);
            }
        }
    }

    @JvmStatic
    public static final void setViewVisibility(List<? extends View> views, int i2) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i2);
        }
    }

    @JvmStatic
    public static final boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
