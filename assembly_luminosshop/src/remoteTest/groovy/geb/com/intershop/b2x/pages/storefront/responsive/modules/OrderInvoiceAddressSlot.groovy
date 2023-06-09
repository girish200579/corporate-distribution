package geb.com.intershop.b2x.pages.storefront.responsive.modules

import geb.Module

class OrderInvoiceAddressSlot extends Module
{
    static content =
    {
        addressSummary { $("div[data-testing-id='address-slot-invoice-to-address']") }
        invoiceTo { addressSummary.$("address") }
    }
 
    def boolean isInvoiceToAddress(companyName, fName,lName,address,city,postal)
    {
        return  (invoiceTo.text().contains(companyName) &&
        invoiceTo.text().contains(fName) &&
        invoiceTo.text().contains(lName) &&
        invoiceTo.text().contains(address) &&
        invoiceTo.text().contains(city) &&
        invoiceTo.text().contains(postal))
    }
}
