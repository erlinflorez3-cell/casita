package fr.antelop.sdk.digitalcard;

import android.os.Process;
import fr.antelop.sdk.exception.WalletValidationDomain;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.util.Random;
import o.ea.m;
import o.er.k;

/* JADX INFO: loaded from: classes5.dex */
public class ClickToPayCustomerProfile {
    private final k innerCustomerProfile;

    public static class Builder {
        private String countryCode;
        private String email;
        private String firstName;
        private String languageCode;
        private String lastName;
        private String mobileNumberCountryCode;
        private String mobileNumberPhoneNumber;

        public ClickToPayCustomerProfile build() throws WalletValidationException {
            String str = this.firstName;
            if (str == null) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`firstName` is null");
            }
            if (str.length() > 30) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "firstname length is longer than 30 chars.");
            }
            String str2 = this.lastName;
            if (str2 == null) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`lastName` is null");
            }
            if (str2.length() > 30) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "lastname length is longer than 30 chars.");
            }
            String str3 = this.email;
            if (str3 == null) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`email` is null");
            }
            if (str3.length() > 255) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "email length is longer than 255 chars.");
            }
            String str4 = this.mobileNumberCountryCode;
            if (str4 == null) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`mobileNumberCountryCode` is null");
            }
            if (str4.length() > 3) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "countryCode length is longer than 3 chars.");
            }
            if (!m.b(this.mobileNumberCountryCode)) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "countryCode of mobile number must be only digits.");
            }
            String str5 = this.mobileNumberPhoneNumber;
            if (str5 == null) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`mobileNumberPhoneNumber` is null");
            }
            if (str5.length() > 16) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "phoneNumber of mobile number is longer than 16 chars.");
            }
            if (!m.b(this.mobileNumberPhoneNumber)) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "phoneNumber of mobile number must be only digits.");
            }
            String str6 = this.languageCode;
            if (str6 == null) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`languageCode` is null");
            }
            if (str6.length() != 2) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`languageCode` length must be 2 chars.");
            }
            Object[] objArr = {this.languageCode};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i2 = m.f23567h * 947030722;
            m.f23567h = i2;
            int iNextInt = new Random().nextInt();
            int i3 = m.f23566g * (-336382192);
            m.f23566g = i3;
            if (!((Boolean) m.c(objArr, i3, i2, 1261928450, iMaxMemory, -1261928446, iNextInt)).booleanValue()) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`languageCode` must be uppercase letters only.");
            }
            String str7 = this.countryCode;
            if (str7 == null) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`countryCode` is null");
            }
            if (str7.length() != 2) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`countryCode` length must be 2 chars.");
            }
            Object[] objArr2 = {this.countryCode};
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i4 = m.f23567h * 947030722;
            m.f23567h = i4;
            int iNextInt2 = new Random().nextInt();
            int i5 = m.f23566g * (-336382192);
            m.f23566g = i5;
            if (((Boolean) m.c(objArr2, i5, i4, 1261928450, iMaxMemory2, -1261928446, iNextInt2)).booleanValue()) {
                return new ClickToPayCustomerProfile(new k(this.firstName, this.lastName, this.email, this.mobileNumberCountryCode, this.mobileNumberPhoneNumber, this.languageCode, this.countryCode));
            }
            throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`countryCode` must be uppercase letters only.");
        }

        public Builder setCountryCode(String str) {
            this.countryCode = str;
            return this;
        }

        public Builder setEmail(String str) {
            this.email = str;
            return this;
        }

        public Builder setFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public Builder setLanguageCode(String str) {
            this.languageCode = str;
            return this;
        }

        public Builder setLastName(String str) {
            this.lastName = str;
            return this;
        }

        public Builder setMobileNumberCountryCode(String str) {
            this.mobileNumberCountryCode = str;
            return this;
        }

        public Builder setMobileNumberPhoneNumber(String str) {
            this.mobileNumberPhoneNumber = str;
            return this;
        }
    }

    public ClickToPayCustomerProfile(k kVar) {
        this.innerCustomerProfile = kVar;
    }

    public String getCountryCode() {
        return this.innerCustomerProfile.g();
    }

    public String getEmail() {
        return this.innerCustomerProfile.d();
    }

    public String getFirstName() {
        Object[] objArr = {this.innerCustomerProfile};
        int iNextInt = new Random().nextInt();
        int iMyPid = Process.myPid();
        int i2 = k.f25018b * (-91568461);
        k.f25018b = i2;
        int i3 = k.f25017a * (-1816306970);
        k.f25017a = i3;
        return (String) k.c(iMyPid, 2051927583, i3, iNextInt, objArr, i2, -2051927583);
    }

    protected k getInnerCustomerProfile() {
        return this.innerCustomerProfile;
    }

    public String getLanguageCode() {
        Object[] objArr = {this.innerCustomerProfile};
        int priority = Thread.currentThread().getPriority();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = k.f25021e * (-460678624);
        k.f25021e = i3;
        int i4 = k.f25020d * 1879643041;
        k.f25020d = i4;
        return (String) k.c(i2, -377784092, i4, priority, objArr, i3, 377784093);
    }

    public String getLastName() {
        return this.innerCustomerProfile.b();
    }

    public String getMobileNumberCountryCode() {
        return this.innerCustomerProfile.e();
    }

    public String getMobileNumberPhoneNumber() {
        Object[] objArr = {this.innerCustomerProfile};
        int i2 = k.f25019c * (-1583409397);
        k.f25019c = i2;
        int iMyTid = Process.myTid();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = k.f25022g * (-1155363413);
        k.f25022g = i3;
        return (String) k.c(iMyTid, 357010820, i3, i2, objArr, iMaxMemory, -357010818);
    }
}
