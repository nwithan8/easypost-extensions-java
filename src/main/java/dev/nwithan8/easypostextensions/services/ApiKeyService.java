package dev.nwithan8.easypostextensions.services;


public class AddressService {

    public static com.easypost.model.Address verify(com.easypost.service.AddressService service,
                                                    com.easypost.model.Address address)
            throws com.easypost.exception.EasyPostException {
        return service.verify(address.getId());
    }
}
