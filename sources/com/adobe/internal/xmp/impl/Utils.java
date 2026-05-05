package com.adobe.internal.xmp.impl;

import com.adobe.internal.xmp.XMPConst;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes4.dex */
public class Utils implements XMPConst {
    static Set<String> EXTERNAL_XMPDM_PROPS = null;
    public static final int UUID_LENGTH = 36;
    public static final int UUID_SEGMENT_COUNT = 4;
    private static boolean[] xmlNameChars = null;
    private static boolean[] xmlNameStartChars = null;

    static {
        initCharTables();
        EXTERNAL_XMPDM_PROPS = new HashSet<String>() { // from class: com.adobe.internal.xmp.impl.Utils.1
            {
                add("xmpDM:album");
                add("xmpDM:altTapeName");
                add("xmpDM:altTimecode");
                add("xmpDM:artist");
                add("xmpDM:cameraAngle");
                add("xmpDM:cameraLabel");
                add("xmpDM:cameraModel");
                add("xmpDM:cameraMove");
                add("xmpDM:client");
                add("xmpDM:comment");
                add("xmpDM:composer");
                add("xmpDM:director");
                add("xmpDM:directorPhotography");
                add("xmpDM:engineer");
                add("xmpDM:genre");
                add("xmpDM:good");
                add("xmpDM:instrument");
                add("xmpDM:logComment");
                add("xmpDM:projectName");
                add("xmpDM:releaseDate");
                add("xmpDM:scene");
                add("xmpDM:shotDate");
                add("xmpDM:shotDay");
                add("xmpDM:shotLocation");
                add("xmpDM:shotName");
                add("xmpDM:shotNumber");
                add("xmpDM:shotSize");
                add("xmpDM:speakerPlacement");
                add("xmpDM:takeNumber");
                add("xmpDM:tapeName");
                add("xmpDM:trackNumber");
                add("xmpDM:videoAlphaMode");
                add("xmpDM:videoAlphaPremultipleColor");
            }
        };
    }

    private Utils() {
    }

    static boolean checkUUIDFormat(String str) {
        if (str == null) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        boolean z2 = true;
        while (i2 < str.length()) {
            if (str.charAt(i2) == '-') {
                i3++;
                z2 = z2 && (i2 == 8 || i2 == 13 || i2 == 18 || i2 == 23);
            }
            i2++;
        }
        return z2 && 4 == i3 && 36 == i2;
    }

    public static String escapeXML(String str, boolean z2, boolean z3) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '<' || cCharAt == '>' || cCharAt == '&' || ((z3 && (cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r')) || (z2 && cCharAt == '\"'))) {
                StringBuffer stringBuffer = new StringBuffer((str.length() * 4) / 3);
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char cCharAt2 = str.charAt(i3);
                    if (z3 && (cCharAt2 == '\t' || cCharAt2 == '\n' || cCharAt2 == '\r')) {
                        stringBuffer.append("&#x");
                        stringBuffer.append(Integer.toHexString(cCharAt2).toUpperCase());
                        stringBuffer.append(';');
                    } else if (cCharAt2 == '\"') {
                        stringBuffer.append(z2 ? "&quot;" : "\"");
                    } else if (cCharAt2 == '&') {
                        stringBuffer.append("&amp;");
                    } else if (cCharAt2 == '<') {
                        stringBuffer.append("&lt;");
                    } else if (cCharAt2 != '>') {
                        stringBuffer.append(cCharAt2);
                    } else {
                        stringBuffer.append("&gt;");
                    }
                }
                return stringBuffer.toString();
            }
        }
        return str;
    }

    private static void initCharTables() {
        xmlNameChars = new boolean[256];
        xmlNameStartChars = new boolean[256];
        char c2 = 0;
        while (true) {
            boolean[] zArr = xmlNameChars;
            if (c2 >= zArr.length) {
                return;
            }
            boolean[] zArr2 = xmlNameStartChars;
            boolean z2 = true;
            boolean z3 = c2 == ':' || ('A' <= c2 && c2 <= 'Z') || c2 == '_' || (('a' <= c2 && c2 <= 'z') || ((192 <= c2 && c2 <= 214) || ((216 <= c2 && c2 <= 246) || (248 <= c2 && c2 <= 255))));
            zArr2[c2] = z3;
            if (!z3 && c2 != '-' && c2 != '.' && (('0' > c2 || c2 > '9') && c2 != 183)) {
                z2 = false;
            }
            zArr[c2] = z2;
            c2 = (char) (c2 + 1);
        }
    }

    static boolean isControlChar(char c2) {
        return ((c2 > 31 && c2 != 127) || c2 == '\t' || c2 == '\n' || c2 == '\r') ? false : true;
    }

    static boolean isInternalProperty(String str, String str2) {
        if ("http://purl.org/dc/elements/1.1/".equals(str)) {
            if ("dc:format".equals(str2) || "dc:language".equals(str2)) {
                return true;
            }
        } else if ("http://ns.adobe.com/xap/1.0/".equals(str)) {
            if ("xmp:BaseURL".equals(str2) || "xmp:CreatorTool".equals(str2) || "xmp:Format".equals(str2) || "xmp:Locale".equals(str2) || "xmp:MetadataDate".equals(str2) || "xmp:ModifyDate".equals(str2)) {
                return true;
            }
        } else if (XMPConst.NS_PDF.equals(str)) {
            if ("pdf:BaseURL".equals(str2) || "pdf:Creator".equals(str2) || "pdf:ModDate".equals(str2) || "pdf:PDFVersion".equals(str2) || "pdf:Producer".equals(str2)) {
                return true;
            }
        } else if ("http://ns.adobe.com/tiff/1.0/".equals(str)) {
            if (!"tiff:ImageDescription".equals(str2) && !"tiff:Artist".equals(str2) && !"tiff:Copyright".equals(str2)) {
                return true;
            }
        } else if ("http://ns.adobe.com/exif/1.0/".equals(str)) {
            if (!"exif:UserComment".equals(str2)) {
                return true;
            }
        } else {
            if ("http://ns.adobe.com/exif/1.0/aux/".equals(str)) {
                return true;
            }
            if ("http://ns.adobe.com/photoshop/1.0/".equals(str)) {
                if ("photoshop:ICCProfile".equals(str2) || "photoshop:TextLayers".equals(str2)) {
                    return true;
                }
            } else {
                if (XMPConst.NS_DM.equals(str)) {
                    return true ^ EXTERNAL_XMPDM_PROPS.contains(str2);
                }
                if (XMPConst.NS_CAMERARAW.equals(str)) {
                    return true;
                }
                if (XMPConst.NS_SCRIPT.equals(str)) {
                    if (!"xmpScript:action".equals(str2) && !"xmpScript:character".equals(str2) && !"xmpScript:dialog".equals(str2) && !"xmpScript:sceneSetting".equals(str2) && !"xmpScript:sceneTimeOfDay".equals(str2)) {
                        return true;
                    }
                } else if (XMPConst.NS_BWF.equals(str)) {
                    if ("bext:version".equals(str2)) {
                        return true;
                    }
                } else if (XMPConst.NS_ADOBESTOCKPHOTO.equals(str) || XMPConst.NS_XMP_MM.equals(str) || XMPConst.TYPE_TEXT.equals(str) || XMPConst.TYPE_PAGEDFILE.equals(str) || XMPConst.TYPE_GRAPHICS.equals(str) || XMPConst.TYPE_IMAGE.equals(str) || XMPConst.TYPE_FONT.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isNameChar(char c2) {
        return (c2 <= 255 && xmlNameChars[c2]) || isNameStartChar(c2) || (c2 >= 768 && c2 <= 879) || (c2 >= 8255 && c2 <= 8256);
    }

    private static boolean isNameStartChar(char c2) {
        return (c2 <= 255 && xmlNameStartChars[c2]) || (c2 >= 256 && c2 <= 767) || ((c2 >= 880 && c2 <= 893) || ((c2 >= 895 && c2 <= 8191) || ((c2 >= 8204 && c2 <= 8205) || ((c2 >= 8304 && c2 <= 8591) || ((c2 >= 11264 && c2 <= 12271) || ((c2 >= 12289 && c2 <= 55295) || ((c2 >= 63744 && c2 <= 64975) || ((c2 >= 65008 && c2 <= 65533) || (c2 >= 0 && c2 <= 65535)))))))));
    }

    public static boolean isXMLName(String str) {
        if (str.length() > 0 && !isNameStartChar(str.charAt(0))) {
            return false;
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            if (!isNameChar(str.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isXMLNameNS(String str) {
        if (str.length() > 0 && (!isNameStartChar(str.charAt(0)) || str.charAt(0) == ':')) {
            return false;
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            if (!isNameChar(str.charAt(i2)) || str.charAt(i2) == ':') {
                return false;
            }
        }
        return true;
    }

    public static String normalizeLangValue(String str) {
        if (XMPConst.X_DEFAULT.equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != ' ') {
                if (cCharAt == '-' || cCharAt == '_') {
                    stringBuffer.append(Soundex.SILENT_MARKER);
                    i2++;
                } else if (i2 != 2) {
                    stringBuffer.append(Character.toLowerCase(str.charAt(i3)));
                } else {
                    stringBuffer.append(Character.toUpperCase(str.charAt(i3)));
                }
            }
        }
        return stringBuffer.toString();
    }

    static String removeControlChars(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i2 = 0; i2 < stringBuffer.length(); i2++) {
            if (isControlChar(stringBuffer.charAt(i2))) {
                stringBuffer.setCharAt(i2, TokenParser.SP);
            }
        }
        return stringBuffer.toString();
    }

    static String[] splitNameAndValue(String str) {
        int iIndexOf = str.indexOf(61);
        String strSubstring = str.substring(str.charAt(1) == '?' ? 2 : 1, iIndexOf);
        char cCharAt = str.charAt(iIndexOf + 1);
        int i2 = iIndexOf + 2;
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - iIndexOf);
        while (i2 < length) {
            stringBuffer.append(str.charAt(i2));
            int i3 = i2 + 1;
            i2 = str.charAt(i3) == cCharAt ? i2 + 2 : i3;
        }
        return new String[]{strSubstring, stringBuffer.toString()};
    }
}
