package a1;

import android.content.pm.ResolveInfo;
import android.util.JsonWriter;
import g0.misplace;
import g0.taste;
import io.cobrowse.CobrowseIO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class superior implements z0.pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final superior f91a = new superior();

    @Override // z0.pair
    public final void a(Object obj, JsonWriter jsonWriter) throws IOException {
        g0.superior superiorVar = (g0.superior) obj;
        jsonWriter.beginObject();
        jsonWriter.name("device_properties");
        jsonWriter.beginArray();
        ArrayList arrayList = superiorVar.f19668a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            taste tasteVar = (taste) obj2;
            jsonWriter.beginObject();
            jsonWriter.name("name");
            jsonWriter.value(tasteVar.f19671a);
            jsonWriter.name("type");
            jsonWriter.value(tasteVar.f19672b.f19659a);
            jsonWriter.name("to_name");
            jsonWriter.value(tasteVar.f19673c);
            jsonWriter.name("result");
            jsonWriter.value(tasteVar.f19674d);
            jsonWriter.endObject();
        }
        jsonWriter.endArray();
        misplace misplaceVar = superiorVar.f19669b;
        if (misplaceVar != null) {
            jsonWriter.name("device_telephony");
            jsonWriter.beginObject();
            String str = misplaceVar.f19662a;
            if (str != null) {
                jsonWriter.name(CobrowseIO.DEVICE_ID_KEY);
                jsonWriter.value(str);
            }
            String str2 = misplaceVar.f19663b;
            if (str2 != null) {
                jsonWriter.name("imsi");
                jsonWriter.value(str2);
            }
            jsonWriter.endObject();
        }
        jsonWriter.name("device_resolve_info");
        jsonWriter.beginArray();
        Iterator it = superiorVar.f19670c.iterator();
        while (it.hasNext()) {
            civilian.f89a.a((ResolveInfo) it.next(), jsonWriter);
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
    }
}
