package geb.com.intershop.b2x.pages.storefront.responsive.modules

import geb.Module

class OrderShippingAddressSlot extends Module
{
    static content =
    {
        addressSummary { $("div[data-testing-id='address-slot-ship-to-address']") }
        shipTo { addressSummary.$("address") }
    }
 
    def boolean isShipToAddress(companyName, fName,lName,address,city,postal)
    {
        return  (shipTo.text().contains(companyName) &&
        shipTo.text().contains(fName) &&
        shipTo.text().contains(lName) &&
        shipTo.text().contains(address) &&
        shipTo.text().contains(city) &&
        shipTo.text().contains(postal))
    }
}
