package com.adobe.internal.xmp.impl;

import com.adobe.internal.xmp.XMPException;
import com.adobe.internal.xmp.XMPIterator;
import com.adobe.internal.xmp.XMPMetaFactory;
import com.adobe.internal.xmp.impl.xpath.XMPPath;
import com.adobe.internal.xmp.impl.xpath.XMPPathParser;
import com.adobe.internal.xmp.options.IteratorOptions;
import com.adobe.internal.xmp.options.PropertyOptions;
import com.adobe.internal.xmp.properties.XMPPropertyInfo;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class XMPIteratorImpl implements XMPIterator {
    private String baseNS;
    private Iterator nodeIterator;
    private IteratorOptions options;
    protected boolean skipSiblings = false;
    protected boolean skipSubtree = false;

    private class NodeIterator implements Iterator {
        protected static final int ITERATE_CHILDREN = 1;
        protected static final int ITERATE_NODE = 0;
        protected static final int ITERATE_QUALIFIER = 2;
        private Iterator childrenIterator;
        private int index;
        private String path;
        private XMPPropertyInfo returnProperty;
        private int state;
        private Iterator subIterator;
        private XMPNode visitedNode;

        public NodeIterator() {
            this.state = 0;
            this.childrenIterator = null;
            this.index = 0;
            this.subIterator = Collections.EMPTY_LIST.iterator();
            this.returnProperty = null;
        }

        public NodeIterator(XMPNode xMPNode, String str, int i2) {
            this.state = 0;
            this.childrenIterator = null;
            this.index = 0;
            this.subIterator = Collections.EMPTY_LIST.iterator();
            this.returnProperty = null;
            this.visitedNode = xMPNode;
            this.state = 0;
            if (xMPNode.getOptions().isSchemaNode()) {
                XMPIteratorImpl.this.setBaseNS(xMPNode.getName());
            }
            this.path = accumulatePath(xMPNode, str, i2);
        }

        private boolean iterateChildren(Iterator it) {
            if (XMPIteratorImpl.this.skipSiblings) {
                XMPIteratorImpl.this.skipSiblings = false;
                this.subIterator = Collections.EMPTY_LIST.iterator();
            }
            if (!this.subIterator.hasNext() && it.hasNext()) {
                XMPNode xMPNode = (XMPNode) it.next();
                int i2 = this.index + 1;
                this.index = i2;
                this.subIterator = XMPIteratorImpl.this.new NodeIterator(xMPNode, this.path, i2);
            }
            if (!this.subIterator.hasNext()) {
                return false;
            }
            this.returnProperty = (XMPPropertyInfo) this.subIterator.next();
            return true;
        }

        protected String accumulatePath(XMPNode xMPNode, String str, int i2) {
            String name;
            String str2;
            if (xMPNode.getParent() == null || xMPNode.getOptions().isSchemaNode()) {
                return null;
            }
            if (xMPNode.getParent().getOptions().isArray()) {
                name = "[" + String.valueOf(i2) + "]";
                str2 = "";
            } else {
                name = xMPNode.getName();
                str2 = RemoteSettings.FORWARD_SLASH_STRING;
            }
            return (str == null || str.length() == 0) ? name : XMPIteratorImpl.this.getOptions().isJustLeafname() ? !name.startsWith(Global.QUESTION) ? name : name.substring(1) : str + str2 + name;
        }

        protected XMPPropertyInfo createPropertyInfo(final XMPNode xMPNode, final String str, final String str2) {
            final String value = xMPNode.getOptions().isSchemaNode() ? null : xMPNode.getValue();
            return new XMPPropertyInfo() { // from class: com.adobe.internal.xmp.impl.XMPIteratorImpl.NodeIterator.1
                @Override // com.adobe.internal.xmp.properties.XMPProperty
                public String getLanguage() {
                    return null;
                }

                @Override // com.adobe.internal.xmp.properties.XMPPropertyInfo
                public String getNamespace() {
                    if (xMPNode.getOptions().isSchemaNode()) {
                        return str;
                    }
                    return XMPMetaFactory.getSchemaRegistry().getNamespaceURI(new QName(xMPNode.getName()).getPrefix());
                }

                @Override // com.adobe.internal.xmp.properties.XMPPropertyInfo, com.adobe.internal.xmp.properties.XMPProperty
                public PropertyOptions getOptions() {
                    return xMPNode.getOptions();
                }

                @Override // com.adobe.internal.xmp.properties.XMPPropertyInfo
                public String getPath() {
                    return str2;
                }

                @Override // com.adobe.internal.xmp.properties.XMPPropertyInfo, com.adobe.internal.xmp.properties.XMPProperty
                public String getValue() {
                    return value;
                }
            };
        }

        protected Iterator getChildrenIterator() {
            return this.childrenIterator;
        }

        protected XMPPropertyInfo getReturnProperty() {
            return this.returnProperty;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.returnProperty != null) {
                return true;
            }
            int i2 = this.state;
            if (i2 == 0) {
                return reportNode();
            }
            if (i2 != 1) {
                if (this.childrenIterator == null) {
                    this.childrenIterator = this.visitedNode.iterateQualifier();
                }
                return iterateChildren(this.childrenIterator);
            }
            if (this.childrenIterator == null) {
                this.childrenIterator = this.visitedNode.iterateChildren();
            }
            boolean zIterateChildren = iterateChildren(this.childrenIterator);
            if (zIterateChildren || !this.visitedNode.hasQualifier() || XMPIteratorImpl.this.getOptions().isOmitQualifiers()) {
                return zIterateChildren;
            }
            this.state = 2;
            this.childrenIterator = null;
            return hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException("There are no more nodes to return");
            }
            XMPPropertyInfo xMPPropertyInfo = this.returnProperty;
            this.returnProperty = null;
            return xMPPropertyInfo;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        protected boolean reportNode() {
            this.state = 1;
            if (this.visitedNode.getParent() == null || (XMPIteratorImpl.this.getOptions().isJustLeafnodes() && this.visitedNode.hasChildren())) {
                return hasNext();
            }
            this.returnProperty = createPropertyInfo(this.visitedNode, XMPIteratorImpl.this.getBaseNS(), this.path);
            return true;
        }

        protected void setChildrenIterator(Iterator it) {
            this.childrenIterator = it;
        }

        protected void setReturnProperty(XMPPropertyInfo xMPPropertyInfo) {
            this.returnProperty = xMPPropertyInfo;
        }
    }

    private class NodeIteratorChildren extends NodeIterator {
        private Iterator childrenIterator;
        private int index;
        private String parentPath;

        public NodeIteratorChildren(XMPNode xMPNode, String str) {
            super();
            this.index = 0;
            if (xMPNode.getOptions().isSchemaNode()) {
                XMPIteratorImpl.this.setBaseNS(xMPNode.getName());
            }
            this.parentPath = accumulatePath(xMPNode, str, 1);
            this.childrenIterator = xMPNode.iterateChildren();
        }

        @Override // com.adobe.internal.xmp.impl.XMPIteratorImpl.NodeIterator, java.util.Iterator
        public boolean hasNext() {
            String strAccumulatePath;
            if (getReturnProperty() != null) {
                return true;
            }
            if (XMPIteratorImpl.this.skipSiblings || !this.childrenIterator.hasNext()) {
                return false;
            }
            XMPNode xMPNode = (XMPNode) this.childrenIterator.next();
            this.index++;
            if (!xMPNode.getOptions().isSchemaNode()) {
                strAccumulatePath = xMPNode.getParent() != null ? accumulatePath(xMPNode, this.parentPath, this.index) : null;
                if (!XMPIteratorImpl.this.getOptions().isJustLeafnodes() && xMPNode.hasChildren()) {
                    return hasNext();
                }
                setReturnProperty(createPropertyInfo(xMPNode, XMPIteratorImpl.this.getBaseNS(), strAccumulatePath));
                return true;
            }
            XMPIteratorImpl.this.setBaseNS(xMPNode.getName());
            if (!XMPIteratorImpl.this.getOptions().isJustLeafnodes()) {
            }
            setReturnProperty(createPropertyInfo(xMPNode, XMPIteratorImpl.this.getBaseNS(), strAccumulatePath));
            return true;
        }
    }

    public XMPIteratorImpl(XMPMetaImpl xMPMetaImpl, String str, String str2, IteratorOptions iteratorOptions) throws XMPException {
        XMPNode xMPNodeFindSchemaNode;
        String string = null;
        this.baseNS = null;
        this.nodeIterator = null;
        this.options = iteratorOptions == null ? new IteratorOptions() : iteratorOptions;
        boolean z2 = str != null && str.length() > 0;
        boolean z3 = str2 != null && str2.length() > 0;
        if (!z2 && !z3) {
            xMPNodeFindSchemaNode = xMPMetaImpl.getRoot();
        } else if (z2 && z3) {
            XMPPath xMPPathExpandXPath = XMPPathParser.expandXPath(str, str2);
            XMPPath xMPPath = new XMPPath();
            for (int i2 = 0; i2 < xMPPathExpandXPath.size() - 1; i2++) {
                xMPPath.add(xMPPathExpandXPath.getSegment(i2));
            }
            xMPNodeFindSchemaNode = XMPNodeUtils.findNode(xMPMetaImpl.getRoot(), xMPPathExpandXPath, false, null);
            this.baseNS = str;
            string = xMPPath.toString();
        } else {
            if (!z2 || z3) {
                throw new XMPException("Schema namespace URI is required", 101);
            }
            xMPNodeFindSchemaNode = XMPNodeUtils.findSchemaNode(xMPMetaImpl.getRoot(), str, false);
        }
        if (xMPNodeFindSchemaNode == null) {
            this.nodeIterator = Collections.EMPTY_LIST.iterator();
        } else if (this.options.isJustChildren()) {
            this.nodeIterator = new NodeIteratorChildren(xMPNodeFindSchemaNode, string);
        } else {
            this.nodeIterator = new NodeIterator(xMPNodeFindSchemaNode, string, 1);
        }
    }

    protected String getBaseNS() {
        return this.baseNS;
    }

    protected IteratorOptions getOptions() {
        return this.options;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.nodeIterator.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.nodeIterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }

    protected void setBaseNS(String str) {
        this.baseNS = str;
    }

    @Override // com.adobe.internal.xmp.XMPIterator
    public void skipSiblings() {
        skipSubtree();
        this.skipSiblings = true;
    }

    @Override // com.adobe.internal.xmp.XMPIterator
    public void skipSubtree() {
        this.skipSubtree = true;
    }
}
