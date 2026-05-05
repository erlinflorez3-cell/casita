package com.valid.communication.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import yg.C1499aX;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public final class Json {

    /* JADX INFO: renamed from: com.valid.communication.utils.Json$1 */
    static class AnonymousClass1 implements ParameterizedType {
        public final /* synthetic */ Class val$parameter;
        public final /* synthetic */ Class val$rawClass;

        public AnonymousClass1(Class cls, Class cls2) {
            cls = cls;
            cls = cls2;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            try {
                return new Type[]{cls};
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return null;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return cls;
        }
    }

    public class Exception extends RuntimeException {
    }

    public static <T> JsonObject createRequest(T t2) {
        String json;
        int iXd;
        Gson gson = new Gson();
        short sXd = (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849966722)));
        int[] iArr = new int["M".length()];
        QB qb = new QB("M");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        JsonParser jsonParser = null;
        if (Integer.parseInt(new String(iArr, 0, i2)) != 0) {
            iXd = FB.Xd() ^ 1609527093;
            json = null;
        } else {
            json = gson.toJson(t2);
            iXd = 15;
        }
        if (iXd != 0) {
            jsonParser = new JsonParser();
        } else {
            json = null;
        }
        return (JsonObject) jsonParser.parse(json);
    }

    public static <T> T deSerialize(String str, Class<T> cls) {
        try {
            return (T) new GsonBuilder().create().fromJson(str, (Class) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T deSerializeType(String str, Type type) {
        try {
            return (T) new GsonBuilder().create().fromJson(str, type);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Type getType(Class<?> cls, Class<?> cls2) {
        try {
            return new ParameterizedType() { // from class: com.valid.communication.utils.Json.1
                public final /* synthetic */ Class val$parameter;
                public final /* synthetic */ Class val$rawClass;

                public AnonymousClass1(Class cls22, Class cls3) {
                    cls = cls22;
                    cls = cls3;
                }

                @Override // java.lang.reflect.ParameterizedType
                public Type[] getActualTypeArguments() {
                    try {
                        return new Type[]{cls};
                    } catch (Exception unused) {
                        return null;
                    }
                }

                @Override // java.lang.reflect.ParameterizedType
                public Type getOwnerType() {
                    return null;
                }

                @Override // java.lang.reflect.ParameterizedType
                public Type getRawType() {
                    return cls;
                }
            };
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> String serialize(T t2) {
        try {
            return new Gson().toJson(t2);
        } catch (Exception unused) {
            return null;
        }
    }
}
