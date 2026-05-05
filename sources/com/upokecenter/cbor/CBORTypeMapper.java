package com.upokecenter.cbor;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class CBORTypeMapper {
    private final List<String> typePrefixes = new ArrayList();
    private final List<String> typeNames = new ArrayList();
    private final Map<Object, ConverterInfo> converters = new HashMap();

    static final class ConverterInfo {
        private Object propVarconverter;
        private Object propVarfromobject;
        private Object propVartoobject;

        ConverterInfo() {
        }

        public final Object getConverter() {
            return this.propVarconverter;
        }

        public final Object getFromObject() {
            return this.propVarfromobject;
        }

        public final Object getToObject() {
            return this.propVartoobject;
        }

        public final void setConverter(Object obj) {
            this.propVarconverter = obj;
        }

        public final void setFromObject(Object obj) {
            this.propVarfromobject = obj;
        }

        public final void setToObject(Object obj) {
            this.propVartoobject = obj;
        }
    }

    public <T> CBORTypeMapper AddConverter(Type type, ICBORConverter<T> iCBORConverter) {
        if (type == null) {
            throw new NullPointerException("type");
        }
        if (iCBORConverter == null) {
            throw new NullPointerException("converter");
        }
        ConverterInfo converterInfo = new ConverterInfo();
        converterInfo.setConverter(iCBORConverter);
        converterInfo.setToObject(PropertyMap.FindOneArgumentMethod(iCBORConverter, "ToCBORObject", type));
        if (converterInfo.getToObject() == null) {
            throw new IllegalArgumentException("Converter doesn't contain a proper ToCBORObject method");
        }
        converterInfo.setFromObject(PropertyMap.FindOneArgumentMethod(iCBORConverter, "FromCBORObject", CBORObject.class));
        this.converters.put(type, converterInfo);
        return this;
    }

    public CBORTypeMapper AddTypeName(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("name is empty.");
        }
        this.typeNames.add(str);
        return this;
    }

    public CBORTypeMapper AddTypePrefix(String str) {
        if (str == null) {
            throw new NullPointerException("prefix");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("prefix is empty.");
        }
        this.typePrefixes.add(str);
        return this;
    }

    <T> T ConvertBackWithConverter(CBORObject cBORObject, Type type) {
        ConverterInfo converterInfo;
        if (!this.converters.containsKey(type) || (converterInfo = this.converters.get(type)) == null || converterInfo.getFromObject() == null) {
            return null;
        }
        return (T) PropertyMap.CallFromObject(converterInfo, cBORObject);
    }

    CBORObject ConvertWithConverter(Object obj) {
        ConverterInfo converterInfo;
        Class<?> cls = obj.getClass();
        if (!this.converters.containsKey(cls) || (converterInfo = this.converters.get(cls)) == null) {
            return null;
        }
        return PropertyMap.CallToObject(converterInfo, obj);
    }

    public boolean FilterTypeName(String str) {
        if (str != null && str.length() != 0) {
            for (String str2 : this.typePrefixes) {
                if (str.length() >= str2.length() && str.substring(0, str2.length()).equals(str2)) {
                    return true;
                }
            }
            Iterator<String> it = this.typeNames.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
