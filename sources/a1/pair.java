package a1;

import android.util.JsonWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pair implements z0.pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pair f90a = new pair();

    @Override // z0.pair
    public final void a(Object obj, JsonWriter jsonWriter) throws IOException {
        g0.pair pairVar = (g0.pair) obj;
        jsonWriter.beginObject();
        jsonWriter.name("device_folders");
        jsonWriter.beginArray();
        ArrayList arrayList = pairVar.f19664a;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            g0.civilian civilianVar = (g0.civilian) obj2;
            jsonWriter.beginObject();
            jsonWriter.name("qemu_file");
            File file = civilianVar.f19660a;
            jsonWriter.beginObject();
            jsonWriter.name("path");
            jsonWriter.value(file.getPath());
            jsonWriter.endObject();
            jsonWriter.name("pipe");
            jsonWriter.value(civilianVar.f19661b);
            jsonWriter.endObject();
        }
        jsonWriter.endArray();
        jsonWriter.name("operator_name");
        jsonWriter.value(pairVar.f19665b);
        jsonWriter.name("qemu_driver");
        jsonWriter.beginArray();
        ArrayList arrayList2 = pairVar.f19666c;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            jsonWriter.value((String) obj3);
        }
        jsonWriter.endArray();
        jsonWriter.name("vpn");
        jsonWriter.value(pairVar.f19667d);
        jsonWriter.endObject();
    }
}
