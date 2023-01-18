package dev.nwithan8.easypostextensions.services;

import com.easypost.exception.EasyPostException;
import com.easypost.model.Address;

public class AddressService {

    /**
     * Verify an {@link Address} with EasyPost.
     *
     * @param service The {@link com.easypost.service.AddressService} to use.
     * @param address The {@link Address} to verify.
     * @return The verified {@link Address}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Address verify(final com.easypost.service.AddressService service,
                                                    final com.easypost.model.Address address)
            throws com.easypost.exception.EasyPostException {
        return service.verify(address.getId());
    }
}
