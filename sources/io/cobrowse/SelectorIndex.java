package io.cobrowse;

import io.cobrowse.Selector;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class SelectorIndex {
    private final Set<String> knownAttributes = new HashSet();
    private final Map<String, HashSet<Selector>> byTag = new HashMap();
    private final Map<String, HashSet<Selector>> byID = new HashMap();
    private final Map<String, HashSet<Selector>> byAttribute = new HashMap();

    SelectorIndex(List<Selector> list) {
        for (Selector selector : list) {
            Selector.Part partLastPart = selector.lastPart();
            if (partLastPart.tag != null) {
                if (!this.byTag.containsKey(partLastPart.tag)) {
                    this.byTag.put(partLastPart.tag, new HashSet<>());
                }
                this.byTag.get(partLastPart.tag).add(selector);
            }
            if (partLastPart.id != null) {
                if (!this.byID.containsKey(partLastPart.id)) {
                    this.byID.put(partLastPart.id, new HashSet<>());
                }
                this.byID.get(partLastPart.id).add(selector);
            }
            if (partLastPart.attributes != null) {
                for (Map.Entry<String, String> entry : partLastPart.attributes.entrySet()) {
                    this.knownAttributes.add(entry.getKey());
                    String strAttrKey = attrKey(entry);
                    if (!this.byAttribute.containsKey(strAttrKey)) {
                        this.byAttribute.put(strAttrKey, new HashSet<>());
                    }
                    this.byAttribute.get(strAttrKey).add(selector);
                }
            }
        }
    }

    private String attrKey(Map.Entry<String, String> entry) {
        return entry.getKey() + "=" + entry.getValue();
    }

    Set<String> getKnownAttributes() {
        return new HashSet(this.knownAttributes);
    }

    Set<Selector> possibleMatches(String str, String str2, Map<String, String> map) {
        HashSet<Selector> hashSet;
        HashSet<Selector> hashSet2;
        HashSet hashSet3 = new HashSet();
        if (str != null && (hashSet2 = this.byTag.get(str)) != null) {
            hashSet3.addAll(hashSet2);
        }
        if (str2 != null && (hashSet = this.byID.get(str2)) != null) {
            hashSet3.addAll(hashSet);
        }
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                HashSet<Selector> hashSet4 = this.byAttribute.get(attrKey(it.next()));
                if (hashSet4 != null) {
                    hashSet3.addAll(hashSet4);
                }
            }
        }
        return hashSet3;
    }
}
