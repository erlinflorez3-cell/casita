package io.cobrowse;

import android.content.res.Resources;
import android.view.View;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class Selector {
    final List<Part> parts;

    static class Part extends ViewProperties {
        Part(String str, String str2, Map<String, String> map) {
            super(str, str2, map);
        }

        static Part from(Map map) {
            HashMap map2;
            String str = (String) TypeUtils.check(map.get("tag"), String.class);
            String str2 = (String) TypeUtils.check(map.get("id"), String.class);
            Map map3 = (Map) TypeUtils.check(map.get(Session.JsonKeys.ATTRS), Map.class);
            if (map3 != null) {
                map2 = new HashMap();
                for (Object obj : map3.keySet()) {
                    String str3 = (String) TypeUtils.check(obj, String.class);
                    String str4 = (String) TypeUtils.check(map3.get(obj), String.class);
                    if (str3 != null && str4 != null) {
                        map2.put(str3, str4);
                    }
                }
            } else {
                map2 = null;
            }
            return new Part(str, str2, map2);
        }

        boolean matches(View view) {
            return matches(ViewProperties.describing(view, this.attributes == null ? null : this.attributes.keySet()));
        }

        boolean matches(ViewProperties viewProperties) {
            return matches(viewProperties.tag, viewProperties.id, viewProperties.attributes);
        }

        boolean matches(String str, String str2, Map<String, String> map) {
            String str3;
            if (this.tag != null && !this.tag.equals(str)) {
                return false;
            }
            if (this.id != null && !this.id.equals(str2)) {
                return false;
            }
            if (this.attributes == null) {
                return true;
            }
            for (Map.Entry<String, String> entry : this.attributes.entrySet()) {
                if (map == null || (str3 = map.get(entry.getKey())) == null || !str3.equals(entry.getValue())) {
                    return false;
                }
            }
            return true;
        }
    }

    static class ViewProperties {
        final Map<String, String> attributes;
        final String id;
        final String tag;

        ViewProperties(String str, String str2, Map<String, String> map) {
            this.tag = str;
            this.id = str2;
            this.attributes = map;
        }

        static Map<String, String> attributesFor(View view, Set<String> set) {
            if (set == null) {
                return null;
            }
            HashMap map = new HashMap();
            for (String str : set) {
                str.hashCode();
                if (str.equals("contentDescription")) {
                    map.put(str, (String) view.getContentDescription());
                } else if (!str.equals("tag")) {
                    map.put(str, "invalid key");
                } else if (view.getTag() instanceof CharSequence) {
                    map.put(str, String.valueOf(view.getTag()));
                }
            }
            return map;
        }

        static ViewProperties describing(View view, Set<String> set) {
            return new ViewProperties(tagFor(view), idFor(view), attributesFor(view, set));
        }

        static String idFor(View view) {
            try {
                if (view.getId() == -1) {
                    return null;
                }
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }

        static String tagFor(View view) {
            return view.getClass().getSimpleName();
        }
    }

    Selector(List<Part> list) {
        this.parts = list;
    }

    static Selector from(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Map) {
                arrayList.add(Part.from((Map) obj));
            }
        }
        return new Selector(arrayList);
    }

    Set<String> attributesUsed() {
        HashSet hashSet = new HashSet();
        for (Part part : this.parts) {
            if (part.attributes != null) {
                hashSet.addAll(part.attributes.keySet());
            }
        }
        return hashSet;
    }

    Part lastPart() {
        return this.parts.get(r1.size() - 1);
    }

    boolean matches(View view) {
        if (lastPart().matches(view)) {
            return matches(ViewProperties.describing(view, attributesUsed()), new ArrayList<ViewProperties>(view) { // from class: io.cobrowse.Selector.1
                final /* synthetic */ View val$view;

                {
                    this.val$view = view;
                    Iterator<View> it = TreeUtils.allParents(view).iterator();
                    while (it.hasNext()) {
                        add(ViewProperties.describing(it.next(), Selector.this.attributesUsed()));
                    }
                }
            });
        }
        return false;
    }

    boolean matches(ViewProperties viewProperties, List<ViewProperties> list) {
        if (!lastPart().matches(viewProperties)) {
            return false;
        }
        return matchesDescendantChain(list, this.parts.subList(0, r1.size() - 1)).booleanValue();
    }

    Boolean matchesDescendantChain(List<ViewProperties> list, List<Part> list2) {
        if (list2.isEmpty()) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        Part part = list2.get(list2.size() - 1);
        ViewProperties viewProperties = list.get(list.size() - 1);
        List<ViewProperties> listSubList = list.subList(0, list.size() - 1);
        return part.matches(viewProperties.tag, viewProperties.id, viewProperties.attributes) ? matchesDescendantChain(listSubList, list2.subList(0, list2.size() - 1)) : matchesDescendantChain(listSubList, list2);
    }
}
