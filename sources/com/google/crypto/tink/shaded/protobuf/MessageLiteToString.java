package com.google.crypto.tink.shaded.protobuf;

import com.dynatrace.android.agent.Global;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
final class MessageLiteToString {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, TokenParser.SP);
    }

    private MessageLiteToString() {
    }

    private static void indent(int indent, StringBuilder buffer) {
        while (indent > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = indent > cArr.length ? cArr.length : indent;
            buffer.append(cArr, 0, length);
            indent -= length;
        }
    }

    private static boolean isDefaultValue(Object o2) {
        return o2 instanceof Boolean ? !((Boolean) o2).booleanValue() : o2 instanceof Integer ? ((Integer) o2).intValue() == 0 : o2 instanceof Float ? Float.floatToRawIntBits(((Float) o2).floatValue()) == 0 : o2 instanceof Double ? Double.doubleToRawLongBits(((Double) o2).doubleValue()) == 0 : o2 instanceof String ? o2.equals("") : o2 instanceof ByteString ? o2.equals(ByteString.EMPTY) : o2 instanceof MessageLite ? o2 == ((MessageLite) o2).getDefaultInstanceForType() : (o2 instanceof java.lang.Enum) && ((java.lang.Enum) o2).ordinal() == 0;
    }

    private static String pascalCaseToSnakeCase(String pascalCase) {
        if (pascalCase.isEmpty()) {
            return pascalCase;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(pascalCase.charAt(0)));
        for (int i2 = 1; i2 < pascalCase.length(); i2++) {
            char cCharAt = pascalCase.charAt(i2);
            if (Character.isUpperCase(cCharAt)) {
                sb.append(Global.UNDERSCORE);
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    static void printField(StringBuilder buffer, int indent, String name, Object object) {
        if (object instanceof List) {
            Iterator it = ((List) object).iterator();
            while (it.hasNext()) {
                printField(buffer, indent, name, it.next());
            }
            return;
        }
        if (object instanceof Map) {
            Iterator it2 = ((Map) object).entrySet().iterator();
            while (it2.hasNext()) {
                printField(buffer, indent, name, (Map.Entry) it2.next());
            }
            return;
        }
        buffer.append('\n');
        indent(indent, buffer);
        buffer.append(pascalCaseToSnakeCase(name));
        if (object instanceof String) {
            buffer.append(": \"").append(TextFormatEscaper.escapeText((String) object)).append('\"');
            return;
        }
        if (object instanceof ByteString) {
            buffer.append(": \"").append(TextFormatEscaper.escapeBytes((ByteString) object)).append('\"');
            return;
        }
        if (object instanceof GeneratedMessageLite) {
            buffer.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) object, buffer, indent + 2);
            buffer.append("\n");
            indent(indent, buffer);
            buffer.append("}");
            return;
        }
        if (!(object instanceof Map.Entry)) {
            buffer.append(": ").append(object);
            return;
        }
        buffer.append(" {");
        Map.Entry entry = (Map.Entry) object;
        int i2 = indent + 2;
        printField(buffer, i2, "key", entry.getKey());
        printField(buffer, i2, "value", entry.getValue());
        buffer.append("\n");
        indent(indent, buffer);
        buffer.append("}");
    }

    private static void reflectivePrintWithIndent(MessageLite messageLite, StringBuilder buffer, int indent) {
        int i2;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith(LIST_SUFFIX) && !strSubstring.endsWith(BUILDER_LIST_SUFFIX) && !strSubstring.equals(LIST_SUFFIX) && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                printField(buffer, indent, strSubstring.substring(0, strSubstring.length() - LIST_SUFFIX.length()), GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0]));
            } else if (strSubstring.endsWith(MAP_SUFFIX) && !strSubstring.equals(MAP_SUFFIX) && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                printField(buffer, indent, strSubstring.substring(0, strSubstring.length() - MAP_SUFFIX.length()), GeneratedMessageLite.invokeOrDie(method, messageLite, new Object[0]));
            } else if (hashSet.contains("set" + strSubstring) && (!strSubstring.endsWith(BYTES_SUFFIX) || !treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - BYTES_SUFFIX.length())))) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                if (method4 != null) {
                    boolean zBooleanValue = false;
                    Object objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method4, messageLite, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method5, messageLite, new Object[0])).booleanValue();
                    } else if (!isDefaultValue(objInvokeOrDie)) {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        printField(buffer, indent, strSubstring, objInvokeOrDie);
                    }
                }
            }
            i2 = 3;
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator<Map.Entry<T, Object>> it = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                printField(buffer, indent, "[" + ((GeneratedMessageLite.ExtensionDescriptor) entry2.getKey()).getNumber() + "]", entry2.getValue());
            }
        }
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) messageLite;
        if (generatedMessageLite.unknownFields != null) {
            generatedMessageLite.unknownFields.printWithIndent(buffer, indent);
        }
    }

    static String toString(MessageLite messageLite, String commentString) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(commentString);
        reflectivePrintWithIndent(messageLite, sb, 0);
        return sb.toString();
    }
}
