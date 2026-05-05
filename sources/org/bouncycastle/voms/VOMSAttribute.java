package org.bouncycastle.voms;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.IetfAttrSyntax;
import org.bouncycastle.cert.X509AttributeCertificateHolder;

/* JADX INFO: loaded from: classes2.dex */
public class VOMSAttribute {
    public static final String VOMS_ATTR_OID = "1.3.6.1.4.1.8005.100.100.4";
    private X509AttributeCertificateHolder myAC;
    private String myHostPort;
    private String myVo;
    private List myStringList = new ArrayList();
    private List myFQANs = new ArrayList();

    public class FQAN {
        String capability;
        String fqan;
        String group;
        String role;

        public FQAN(String str) {
            this.fqan = str;
        }

        public FQAN(String str, String str2, String str3) {
            this.group = str;
            this.role = str2;
            this.capability = str3;
        }

        public String getCapability() {
            if (this.group == null && this.fqan != null) {
                split();
            }
            return this.capability;
        }

        public String getFQAN() {
            String str = this.fqan;
            if (str != null) {
                return str;
            }
            StringBuilder sbAppend = new StringBuilder().append(this.group).append("/Role=");
            String str2 = this.role;
            if (str2 == null) {
                str2 = "";
            }
            String string = sbAppend.append(str2).append(this.capability != null ? "/Capability=" + this.capability : "").toString();
            this.fqan = string;
            return string;
        }

        public String getGroup() {
            if (this.group == null && this.fqan != null) {
                split();
            }
            return this.group;
        }

        public String getRole() {
            if (this.group == null && this.fqan != null) {
                split();
            }
            return this.role;
        }

        protected void split() {
            this.fqan.length();
            int iIndexOf = this.fqan.indexOf("/Role=");
            if (iIndexOf < 0) {
                return;
            }
            this.group = this.fqan.substring(0, iIndexOf);
            int i2 = iIndexOf + 6;
            int iIndexOf2 = this.fqan.indexOf("/Capability=", i2);
            String str = this.fqan;
            String strSubstring = iIndexOf2 < 0 ? str.substring(i2) : str.substring(i2, iIndexOf2);
            String str2 = null;
            if (strSubstring.length() == 0) {
                strSubstring = null;
            }
            this.role = strSubstring;
            String strSubstring2 = iIndexOf2 < 0 ? null : this.fqan.substring(iIndexOf2 + 12);
            if (strSubstring2 != null && strSubstring2.length() != 0) {
                str2 = strSubstring2;
            }
            this.capability = str2;
        }

        public String toString() {
            return getFQAN();
        }
    }

    public VOMSAttribute(X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        if (x509AttributeCertificateHolder == null) {
            throw new IllegalArgumentException("VOMSAttribute: AttributeCertificate is NULL");
        }
        this.myAC = x509AttributeCertificateHolder;
        Attribute[] attributes = x509AttributeCertificateHolder.getAttributes(new ASN1ObjectIdentifier("1.3.6.1.4.1.8005.100.100.4"));
        if (attributes == null) {
            return;
        }
        for (int i2 = 0; i2 != attributes.length; i2++) {
            try {
                IetfAttrSyntax ietfAttrSyntax = IetfAttrSyntax.getInstance(attributes[i2].getAttributeValues()[0]);
                String string = ((DERIA5String) ietfAttrSyntax.getPolicyAuthority().getNames()[0].getName()).getString();
                int iIndexOf = string.indexOf("://");
                if (iIndexOf < 0 || iIndexOf == string.length() - 1) {
                    throw new IllegalArgumentException("Bad encoding of VOMS policyAuthority : [" + string + "]");
                }
                this.myVo = string.substring(0, iIndexOf);
                this.myHostPort = string.substring(iIndexOf + 3);
                if (ietfAttrSyntax.getValueType() != 1) {
                    throw new IllegalArgumentException("VOMS attribute values are not encoded as octet strings, policyAuthority = " + string);
                }
                ASN1OctetString[] aSN1OctetStringArr = (ASN1OctetString[]) ietfAttrSyntax.getValues();
                for (int i3 = 0; i3 != aSN1OctetStringArr.length; i3++) {
                    String str = new String(aSN1OctetStringArr[i3].getOctets());
                    FQAN fqan = new FQAN(str);
                    if (!this.myStringList.contains(str) && str.startsWith(RemoteSettings.FORWARD_SLASH_STRING + this.myVo + RemoteSettings.FORWARD_SLASH_STRING)) {
                        this.myStringList.add(str);
                        this.myFQANs.add(fqan);
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (Exception unused) {
                throw new IllegalArgumentException("Badly encoded VOMS extension in AC issued by " + x509AttributeCertificateHolder.getIssuer());
            }
        }
    }

    public X509AttributeCertificateHolder getAC() {
        return this.myAC;
    }

    public List getFullyQualifiedAttributes() {
        return this.myStringList;
    }

    public String getHostPort() {
        return this.myHostPort;
    }

    public List getListOfFQAN() {
        return this.myFQANs;
    }

    public String getVO() {
        return this.myVo;
    }

    public String toString() {
        return "VO      :" + this.myVo + "\nHostPort:" + this.myHostPort + "\nFQANs   :" + this.myFQANs;
    }
}
