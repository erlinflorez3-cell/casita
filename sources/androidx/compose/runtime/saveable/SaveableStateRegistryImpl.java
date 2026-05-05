package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004O(8\u000b<N\u0007\":0\u007f\u0007tʑAӄLe^.ZS8\u0018sڔ<$iGyّCU(\u001d*\teNogtMb\u000bY\u000f\u000e\u0016~j2Ikތ\u000e\u0012=1\u0003%OM[oUOpvF\u0005N42B\n\r\u0011\u001e:J&u)Gy\u000f(/nqJb\u001bR\u001d&\"\bN /\"li^6vs\f@ǥ'\u0003wJ\u00175m5\u0015M;M\u0005+\u001b\u0004y\u001eYD}I]5a\u0011\u001fTq>1C\"A\u0013w?'YK:k~r\u000e$-?_\u000fmrT^\u0015[p\u00147/_eaO<,&}*\u000e\u0003\u0018V$5YF-Hx8\u0012A\u0004\u000bSnR2jP\u0013\u0013iF\u001b5\u0002I*g\u001f\u0015](OifE\u0001\u001d\u0019.%\u0011nO_d\u0010p\u0015I[&W\b҈BףLN\u0012ԯ\u000e\u000e\u0012pz\u0016:\u0006@G.1\f\u001b>\u001f5;k;9 \u001a\u0006vG\u0016\u007f[\u009ejרmRPؗr\u0015$AB#\u001c\\Td3m`dh:!W,\\\u0017\u0002\u0018\u00156[&@O1>Y}q@җOύ\u000e%7ωƦ]\u0003"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`24gYH", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`$", "@dbAb9>R", "", "", "", "", "1`]\u000fX\u001a:d\u0019}", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `L\u0001\u0016\u0006w5>W\r$Av$w.SDiC\"\u001fq-\u000fJT", "", "D`[BX\u0017K]*\u0003y^9\u000b", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "D`[BX", "1n]@h4>@\u0019\r\nh9|\b", "9dh", ">da3b9FA\u0015\u0010z", "@dV6f;>`\u0004\f\u0005o0{\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`\r\fea\u007fQi", "D`[BX\u0017K]*\u0003y^9", "@t]A\\4>\u001b'z\f^(y\u0010/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final Function1<Object, Boolean> canBeSaved;
    private final Map<String, List<Object>> restored;
    private final Map<String, List<Function0<Object>>> valueProviders;

    public SaveableStateRegistryImpl(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        LinkedHashMap mutableMap;
        this.canBeSaved = function1;
        this.restored = (map == null || (mutableMap = MapsKt.toMutableMap(map)) == null) ? new LinkedHashMap() : mutableMap;
        this.valueProviders = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.canBeSaved.invoke(obj).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        List<Object> listRemove = this.restored.remove(str);
        if (listRemove == null || listRemove.isEmpty()) {
            return null;
        }
        if (listRemove.size() > 1) {
            this.restored.put(str, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(final String str, final Function0<? extends Object> function0) {
        if (SaveableStateRegistryKt.fastIsBlank(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        Map<String, List<Function0<Object>>> map = this.valueProviders;
        ArrayList arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(function0);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.registerProvider.3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public void unregister() {
                List list = (List) SaveableStateRegistryImpl.this.valueProviders.remove(str);
                if (list != null) {
                    list.remove(function0);
                }
                if (list == null || list.isEmpty()) {
                    return;
                }
                SaveableStateRegistryImpl.this.valueProviders.put(str, list);
            }
        };
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        Map<String, List<Object>> mutableMap = MapsKt.toMutableMap(this.restored);
        for (Map.Entry<String, List<Function0<Object>>> entry : this.valueProviders.entrySet()) {
            String key = entry.getKey();
            List<Function0<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object objInvoke = value.get(0).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!canBeSaved(objInvoke)) {
                        throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(objInvoke).toString());
                    }
                    mutableMap.put(key, CollectionsKt.arrayListOf(objInvoke));
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Object objInvoke2 = value.get(i2).invoke();
                    if (objInvoke2 == null || canBeSaved(objInvoke2)) {
                        arrayList.add(objInvoke2);
                    } else {
                        throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(objInvoke2).toString());
                    }
                }
                mutableMap.put(key, arrayList);
            }
        }
        return mutableMap;
    }
}
