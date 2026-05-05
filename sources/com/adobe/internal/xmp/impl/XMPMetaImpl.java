package com.adobe.internal.xmp.impl;

import com.adobe.internal.xmp.XMPConst;
import com.adobe.internal.xmp.XMPDateTime;
import com.adobe.internal.xmp.XMPException;
import com.adobe.internal.xmp.XMPIterator;
import com.adobe.internal.xmp.XMPMeta;
import com.adobe.internal.xmp.XMPPathFactory;
import com.adobe.internal.xmp.XMPUtils;
import com.adobe.internal.xmp.impl.xpath.XMPPath;
import com.adobe.internal.xmp.impl.xpath.XMPPathParser;
import com.adobe.internal.xmp.options.IteratorOptions;
import com.adobe.internal.xmp.options.ParseOptions;
import com.adobe.internal.xmp.options.PropertyOptions;
import com.adobe.internal.xmp.properties.XMPProperty;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public class XMPMetaImpl implements XMPMeta, XMPConst {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int VALUE_BASE64 = 7;
    private static final int VALUE_BOOLEAN = 1;
    private static final int VALUE_CALENDAR = 6;
    private static final int VALUE_DATE = 5;
    private static final int VALUE_DOUBLE = 4;
    private static final int VALUE_INTEGER = 2;
    private static final int VALUE_LONG = 3;
    private static final int VALUE_STRING = 0;
    private String packetHeader;
    private XMPNode tree;

    /* JADX INFO: renamed from: com.adobe.internal.xmp.impl.XMPMetaImpl$1 */
    class AnonymousClass1 implements XMPProperty {
        final /* synthetic */ XMPNode val$itemNode;

        AnonymousClass1(XMPNode xMPNode) {
            xMPNode = xMPNode;
        }

        @Override // com.adobe.internal.xmp.properties.XMPProperty
        public String getLanguage() {
            return xMPNode.getQualifier(1).getValue();
        }

        @Override // com.adobe.internal.xmp.properties.XMPProperty
        public PropertyOptions getOptions() {
            return xMPNode.getOptions();
        }

        @Override // com.adobe.internal.xmp.properties.XMPProperty
        public String getValue() {
            return xMPNode.getValue();
        }

        public String toString() {
            return xMPNode.getValue().toString();
        }
    }

    /* JADX INFO: renamed from: com.adobe.internal.xmp.impl.XMPMetaImpl$2 */
    class AnonymousClass2 implements XMPProperty {
        final /* synthetic */ XMPNode val$propNode;
        final /* synthetic */ Object val$value;

        AnonymousClass2(Object obj, XMPNode xMPNode) {
            obj = obj;
            xMPNode = xMPNode;
        }

        @Override // com.adobe.internal.xmp.properties.XMPProperty
        public String getLanguage() {
            return null;
        }

        @Override // com.adobe.internal.xmp.properties.XMPProperty
        public PropertyOptions getOptions() {
            return xMPNode.getOptions();
        }

        @Override // com.adobe.internal.xmp.properties.XMPProperty
        public String getValue() {
            Object obj = obj;
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }

        public String toString() {
            return obj.toString();
        }
    }

    public XMPMetaImpl() {
        this.packetHeader = null;
        this.tree = new XMPNode(null, null, null);
    }

    public XMPMetaImpl(XMPNode xMPNode) {
        this.packetHeader = null;
        this.tree = xMPNode;
    }

    private void doSetArrayItem(XMPNode xMPNode, int i2, String str, PropertyOptions propertyOptions, boolean z2) throws XMPException {
        XMPNode xMPNode2 = new XMPNode("[]", null);
        PropertyOptions propertyOptionsVerifySetOptions = XMPNodeUtils.verifySetOptions(propertyOptions, str);
        int childrenLength = xMPNode.getChildrenLength();
        if (z2) {
            childrenLength++;
        }
        if (i2 == -1) {
            i2 = childrenLength;
        }
        if (1 > i2 || i2 > childrenLength) {
            throw new XMPException("Array index out of bounds", 104);
        }
        if (!z2) {
            xMPNode.removeChild(i2);
        }
        xMPNode.addChild(i2, xMPNode2);
        setNode(xMPNode2, str, propertyOptionsVerifySetOptions, false);
    }

    private Object evaluateNodeValue(int i2, XMPNode xMPNode) throws XMPException {
        String value = xMPNode.getValue();
        switch (i2) {
            case 1:
                return new Boolean(XMPUtils.convertToBoolean(value));
            case 2:
                return new Integer(XMPUtils.convertToInteger(value));
            case 3:
                return new Long(XMPUtils.convertToLong(value));
            case 4:
                return new Double(XMPUtils.convertToDouble(value));
            case 5:
                return XMPUtils.convertToDate(value);
            case 6:
                return XMPUtils.convertToDate(value).getCalendar();
            case 7:
                return XMPUtils.decodeBase64(value);
            default:
                if (value == null && !xMPNode.getOptions().isCompositeProperty()) {
                    value = "";
                }
                return value;
        }
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void appendArrayItem(String str, String str2, PropertyOptions propertyOptions, String str3, PropertyOptions propertyOptions2) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertArrayName(str2);
        if (propertyOptions == null) {
            propertyOptions = new PropertyOptions();
        }
        if (!propertyOptions.isOnlyArrayOptions()) {
            throw new XMPException("Only array form flags allowed for arrayOptions", 103);
        }
        PropertyOptions propertyOptionsVerifySetOptions = XMPNodeUtils.verifySetOptions(propertyOptions, null);
        XMPPath xMPPathExpandXPath = XMPPathParser.expandXPath(str, str2);
        XMPNode xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, xMPPathExpandXPath, false, null);
        if (xMPNodeFindNode != null) {
            if (!xMPNodeFindNode.getOptions().isArray()) {
                throw new XMPException("The named property is not an array", 102);
            }
        } else {
            if (!propertyOptionsVerifySetOptions.isArray()) {
                throw new XMPException("Explicit arrayOptions required to create new array", 103);
            }
            xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, xMPPathExpandXPath, true, propertyOptionsVerifySetOptions);
            if (xMPNodeFindNode == null) {
                throw new XMPException("Failure creating array node", 102);
            }
        }
        doSetArrayItem(xMPNodeFindNode, -1, str3, propertyOptions2, true);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void appendArrayItem(String str, String str2, String str3) throws XMPException {
        appendArrayItem(str, str2, null, str3, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public Object clone() {
        return new XMPMetaImpl((XMPNode) this.tree.clone());
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public int countArrayItems(String str, String str2) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertArrayName(str2);
        XMPNode xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, XMPPathParser.expandXPath(str, str2), false, null);
        if (xMPNodeFindNode == null) {
            return 0;
        }
        if (xMPNodeFindNode.getOptions().isArray()) {
            return xMPNodeFindNode.getChildrenLength();
        }
        throw new XMPException("The named property is not an array", 102);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void deleteArrayItem(String str, String str2, int i2) {
        try {
            ParameterAsserts.assertSchemaNS(str);
            ParameterAsserts.assertArrayName(str2);
            deleteProperty(str, XMPPathFactory.composeArrayItemPath(str2, i2));
        } catch (XMPException unused) {
        }
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void deleteProperty(String str, String str2) {
        try {
            ParameterAsserts.assertSchemaNS(str);
            ParameterAsserts.assertPropName(str2);
            XMPNode xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, XMPPathParser.expandXPath(str, str2), false, null);
            if (xMPNodeFindNode != null) {
                XMPNodeUtils.deleteNode(xMPNodeFindNode);
            }
        } catch (XMPException unused) {
        }
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void deleteQualifier(String str, String str2, String str3, String str4) {
        try {
            ParameterAsserts.assertSchemaNS(str);
            ParameterAsserts.assertPropName(str2);
            deleteProperty(str, str2 + XMPPathFactory.composeQualifierPath(str3, str4));
        } catch (XMPException unused) {
        }
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void deleteStructField(String str, String str2, String str3, String str4) {
        try {
            ParameterAsserts.assertSchemaNS(str);
            ParameterAsserts.assertStructName(str2);
            deleteProperty(str, str2 + XMPPathFactory.composeStructFieldPath(str3, str4));
        } catch (XMPException unused) {
        }
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public boolean doesArrayItemExist(String str, String str2, int i2) {
        try {
            ParameterAsserts.assertSchemaNS(str);
            ParameterAsserts.assertArrayName(str2);
            return doesPropertyExist(str, XMPPathFactory.composeArrayItemPath(str2, i2));
        } catch (XMPException unused) {
            return false;
        }
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public boolean doesPropertyExist(String str, String str2) {
        try {
            ParameterAsserts.assertSchemaNS(str);
            ParameterAsserts.assertPropName(str2);
            return XMPNodeUtils.findNode(this.tree, XMPPathParser.expandXPath(str, str2), false, null) != null;
        } catch (XMPException unused) {
            return false;
        }
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public boolean doesQualifierExist(String str, String str2, String str3, String str4) {
        try {
            ParameterAsserts.assertSchemaNS(str);
            ParameterAsserts.assertPropName(str2);
            return doesPropertyExist(str, str2 + XMPPathFactory.composeQualifierPath(str3, str4));
        } catch (XMPException unused) {
            return false;
        }
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public boolean doesStructFieldExist(String str, String str2, String str3, String str4) {
        try {
            ParameterAsserts.assertSchemaNS(str);
            ParameterAsserts.assertStructName(str2);
            return doesPropertyExist(str, str2 + XMPPathFactory.composeStructFieldPath(str3, str4));
        } catch (XMPException unused) {
            return false;
        }
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public String dumpObject() {
        return getRoot().dumpNode(true);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public XMPProperty getArrayItem(String str, String str2, int i2) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertArrayName(str2);
        return getProperty(str, XMPPathFactory.composeArrayItemPath(str2, i2));
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public XMPProperty getLocalizedText(String str, String str2, String str3, String str4) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertArrayName(str2);
        ParameterAsserts.assertSpecificLang(str4);
        String strNormalizeLangValue = str3 != null ? Utils.normalizeLangValue(str3) : null;
        String strNormalizeLangValue2 = Utils.normalizeLangValue(str4);
        XMPNode xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, XMPPathParser.expandXPath(str, str2), false, null);
        if (xMPNodeFindNode == null) {
            return null;
        }
        Object[] objArrChooseLocalizedText = XMPNodeUtils.chooseLocalizedText(xMPNodeFindNode, strNormalizeLangValue, strNormalizeLangValue2);
        int iIntValue = ((Integer) objArrChooseLocalizedText[0]).intValue();
        XMPNode xMPNode = (XMPNode) objArrChooseLocalizedText[1];
        if (iIntValue != 0) {
            return new XMPProperty() { // from class: com.adobe.internal.xmp.impl.XMPMetaImpl.1
                final /* synthetic */ XMPNode val$itemNode;

                AnonymousClass1(XMPNode xMPNode2) {
                    xMPNode = xMPNode2;
                }

                @Override // com.adobe.internal.xmp.properties.XMPProperty
                public String getLanguage() {
                    return xMPNode.getQualifier(1).getValue();
                }

                @Override // com.adobe.internal.xmp.properties.XMPProperty
                public PropertyOptions getOptions() {
                    return xMPNode.getOptions();
                }

                @Override // com.adobe.internal.xmp.properties.XMPProperty
                public String getValue() {
                    return xMPNode.getValue();
                }

                public String toString() {
                    return xMPNode.getValue().toString();
                }
            };
        }
        return null;
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public String getObjectName() {
        return this.tree.getName() != null ? this.tree.getName() : "";
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public String getPacketHeader() {
        return this.packetHeader;
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public XMPProperty getProperty(String str, String str2) throws XMPException {
        return getProperty(str, str2, 0);
    }

    protected XMPProperty getProperty(String str, String str2, int i2) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertPropName(str2);
        XMPNode xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, XMPPathParser.expandXPath(str, str2), false, null);
        if (xMPNodeFindNode == null) {
            return null;
        }
        if (i2 == 0 || !xMPNodeFindNode.getOptions().isCompositeProperty()) {
            return new XMPProperty() { // from class: com.adobe.internal.xmp.impl.XMPMetaImpl.2
                final /* synthetic */ XMPNode val$propNode;
                final /* synthetic */ Object val$value;

                AnonymousClass2(Object obj, XMPNode xMPNodeFindNode2) {
                    obj = obj;
                    xMPNode = xMPNodeFindNode2;
                }

                @Override // com.adobe.internal.xmp.properties.XMPProperty
                public String getLanguage() {
                    return null;
                }

                @Override // com.adobe.internal.xmp.properties.XMPProperty
                public PropertyOptions getOptions() {
                    return xMPNode.getOptions();
                }

                @Override // com.adobe.internal.xmp.properties.XMPProperty
                public String getValue() {
                    Object obj = obj;
                    if (obj != null) {
                        return obj.toString();
                    }
                    return null;
                }

                public String toString() {
                    return obj.toString();
                }
            };
        }
        throw new XMPException("Property must be simple when a value type is requested", 102);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public byte[] getPropertyBase64(String str, String str2) throws XMPException {
        return (byte[]) getPropertyObject(str, str2, 7);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public Boolean getPropertyBoolean(String str, String str2) throws XMPException {
        return (Boolean) getPropertyObject(str, str2, 1);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public Calendar getPropertyCalendar(String str, String str2) throws XMPException {
        return (Calendar) getPropertyObject(str, str2, 6);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public XMPDateTime getPropertyDate(String str, String str2) throws XMPException {
        return (XMPDateTime) getPropertyObject(str, str2, 5);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public Double getPropertyDouble(String str, String str2) throws XMPException {
        return (Double) getPropertyObject(str, str2, 4);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public Integer getPropertyInteger(String str, String str2) throws XMPException {
        return (Integer) getPropertyObject(str, str2, 2);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public Long getPropertyLong(String str, String str2) throws XMPException {
        return (Long) getPropertyObject(str, str2, 3);
    }

    protected Object getPropertyObject(String str, String str2, int i2) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertPropName(str2);
        XMPNode xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, XMPPathParser.expandXPath(str, str2), false, null);
        if (xMPNodeFindNode == null) {
            return null;
        }
        if (i2 == 0 || !xMPNodeFindNode.getOptions().isCompositeProperty()) {
            return evaluateNodeValue(i2, xMPNodeFindNode);
        }
        throw new XMPException("Property must be simple when a value type is requested", 102);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public String getPropertyString(String str, String str2) throws XMPException {
        return (String) getPropertyObject(str, str2, 0);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public XMPProperty getQualifier(String str, String str2, String str3, String str4) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertPropName(str2);
        return getProperty(str, str2 + XMPPathFactory.composeQualifierPath(str3, str4));
    }

    public XMPNode getRoot() {
        return this.tree;
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public XMPProperty getStructField(String str, String str2, String str3, String str4) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertStructName(str2);
        return getProperty(str, str2 + XMPPathFactory.composeStructFieldPath(str3, str4));
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void insertArrayItem(String str, String str2, int i2, String str3) throws XMPException {
        insertArrayItem(str, str2, i2, str3, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void insertArrayItem(String str, String str2, int i2, String str3, PropertyOptions propertyOptions) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertArrayName(str2);
        XMPNode xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, XMPPathParser.expandXPath(str, str2), false, null);
        if (xMPNodeFindNode == null) {
            throw new XMPException("Specified array does not exist", 102);
        }
        doSetArrayItem(xMPNodeFindNode, i2, str3, propertyOptions, true);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public XMPIterator iterator() throws XMPException {
        return iterator(null, null, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public XMPIterator iterator(IteratorOptions iteratorOptions) throws XMPException {
        return iterator(null, null, iteratorOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public XMPIterator iterator(String str, String str2, IteratorOptions iteratorOptions) throws XMPException {
        return new XMPIteratorImpl(this, str, str2, iteratorOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void normalize(ParseOptions parseOptions) throws XMPException {
        if (parseOptions == null) {
            parseOptions = new ParseOptions();
        }
        XMPNormalizer.process(this, parseOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setArrayItem(String str, String str2, int i2, String str3) throws XMPException {
        setArrayItem(str, str2, i2, str3, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setArrayItem(String str, String str2, int i2, String str3, PropertyOptions propertyOptions) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertArrayName(str2);
        XMPNode xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, XMPPathParser.expandXPath(str, str2), false, null);
        if (xMPNodeFindNode == null) {
            throw new XMPException("Specified array does not exist", 102);
        }
        doSetArrayItem(xMPNodeFindNode, i2, str3, propertyOptions, false);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setLocalizedText(String str, String str2, String str3, String str4, String str5) throws XMPException {
        setLocalizedText(str, str2, str3, str4, str5, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x016a, code lost:
    
        throw new com.adobe.internal.xmp.XMPException("Language qualifier must be first", 102);
     */
    @Override // com.adobe.internal.xmp.XMPMeta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setLocalizedText(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.adobe.internal.xmp.options.PropertyOptions r18) throws com.adobe.internal.xmp.XMPException {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.internal.xmp.impl.XMPMetaImpl.setLocalizedText(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.adobe.internal.xmp.options.PropertyOptions):void");
    }

    void setNode(XMPNode xMPNode, Object obj, PropertyOptions propertyOptions, boolean z2) throws XMPException {
        if (z2) {
            xMPNode.clear();
        }
        xMPNode.getOptions().mergeWith(propertyOptions);
        if ((-1) - (((-1) - xMPNode.getOptions().getOptions()) | ((-1) - 7936)) == 0) {
            XMPNodeUtils.setNodeValue(xMPNode, obj);
            return;
        }
        if (obj != null && obj.toString().length() > 0) {
            throw new XMPException("Composite nodes can't have values", 102);
        }
        if ((xMPNode.getOptions().getOptions() & 7936) != 0) {
            int options = propertyOptions.getOptions() & 7936;
            int options2 = xMPNode.getOptions().getOptions();
            if (options != (options2 + 7936) - (options2 | 7936)) {
                throw new XMPException("Requested and existing composite form mismatch", 102);
            }
        }
        xMPNode.removeChildren();
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setObjectName(String str) {
        this.tree.setName(str);
    }

    public void setPacketHeader(String str) {
        this.packetHeader = str;
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setProperty(String str, String str2, Object obj) throws XMPException {
        setProperty(str, str2, obj, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setProperty(String str, String str2, Object obj, PropertyOptions propertyOptions) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertPropName(str2);
        PropertyOptions propertyOptionsVerifySetOptions = XMPNodeUtils.verifySetOptions(propertyOptions, obj);
        XMPNode xMPNodeFindNode = XMPNodeUtils.findNode(this.tree, XMPPathParser.expandXPath(str, str2), true, propertyOptionsVerifySetOptions);
        if (xMPNodeFindNode == null) {
            throw new XMPException("Specified property does not exist", 102);
        }
        setNode(xMPNodeFindNode, obj, propertyOptionsVerifySetOptions, false);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyBase64(String str, String str2, byte[] bArr) throws XMPException {
        setProperty(str, str2, bArr, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyBase64(String str, String str2, byte[] bArr, PropertyOptions propertyOptions) throws XMPException {
        setProperty(str, str2, bArr, propertyOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyBoolean(String str, String str2, boolean z2) throws XMPException {
        setProperty(str, str2, z2 ? XMPConst.TRUESTR : XMPConst.FALSESTR, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyBoolean(String str, String str2, boolean z2, PropertyOptions propertyOptions) throws XMPException {
        setProperty(str, str2, z2 ? XMPConst.TRUESTR : XMPConst.FALSESTR, propertyOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyCalendar(String str, String str2, Calendar calendar) throws XMPException {
        setProperty(str, str2, calendar, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyCalendar(String str, String str2, Calendar calendar, PropertyOptions propertyOptions) throws XMPException {
        setProperty(str, str2, calendar, propertyOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyDate(String str, String str2, XMPDateTime xMPDateTime) throws XMPException {
        setProperty(str, str2, xMPDateTime, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyDate(String str, String str2, XMPDateTime xMPDateTime, PropertyOptions propertyOptions) throws XMPException {
        setProperty(str, str2, xMPDateTime, propertyOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyDouble(String str, String str2, double d2) throws XMPException {
        setProperty(str, str2, new Double(d2), null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyDouble(String str, String str2, double d2, PropertyOptions propertyOptions) throws XMPException {
        setProperty(str, str2, new Double(d2), propertyOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyInteger(String str, String str2, int i2) throws XMPException {
        setProperty(str, str2, new Integer(i2), null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyInteger(String str, String str2, int i2, PropertyOptions propertyOptions) throws XMPException {
        setProperty(str, str2, new Integer(i2), propertyOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyLong(String str, String str2, long j2) throws XMPException {
        setProperty(str, str2, new Long(j2), null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setPropertyLong(String str, String str2, long j2, PropertyOptions propertyOptions) throws XMPException {
        setProperty(str, str2, new Long(j2), propertyOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setQualifier(String str, String str2, String str3, String str4, String str5) throws XMPException {
        setQualifier(str, str2, str3, str4, str5, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setQualifier(String str, String str2, String str3, String str4, String str5, PropertyOptions propertyOptions) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertPropName(str2);
        if (!doesPropertyExist(str, str2)) {
            throw new XMPException("Specified property does not exist!", 102);
        }
        setProperty(str, str2 + XMPPathFactory.composeQualifierPath(str3, str4), str5, propertyOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setStructField(String str, String str2, String str3, String str4, String str5) throws XMPException {
        setStructField(str, str2, str3, str4, str5, null);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void setStructField(String str, String str2, String str3, String str4, String str5, PropertyOptions propertyOptions) throws XMPException {
        ParameterAsserts.assertSchemaNS(str);
        ParameterAsserts.assertStructName(str2);
        setProperty(str, str2 + XMPPathFactory.composeStructFieldPath(str3, str4), str5, propertyOptions);
    }

    @Override // com.adobe.internal.xmp.XMPMeta
    public void sort() {
        this.tree.sort();
    }
}
