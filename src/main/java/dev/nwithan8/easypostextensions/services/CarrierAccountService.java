package dev.nwithan8.easypostextensions.services;

import com.easypost.model.CarrierAccount;
import com.easypost.exception.EasyPostException;

import java.util.Map;

public class CarrierAccountService {
    /**
     * Update a {@link CarrierAccount}.
     *
     * @param service        The {@link com.easypost.service.CarrierAccountService} to use.
     * @param carrierAccount The {@link CarrierAccount} to update.
     * @param params         The parameters to use for the request.
     * @return The updated {@link CarrierAccount}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.CarrierAccount update(final com.easypost.service.CarrierAccountService service,
                                                           final com.easypost.model.CarrierAccount carrierAccount,
                                                           final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.update(carrierAccount.getId(), params);
    }

    /**
     * Delete a {@link CarrierAccount}.
     *
     * @param service        The {@link com.easypost.service.CarrierAccountService} to use.
     * @param carrierAccount The {@link CarrierAccount} to delete.
     * @throws EasyPostException when the request fails.
     */
    public static void delete(final com.easypost.service.CarrierAccountService service,
                              final com.easypost.model.CarrierAccount carrierAccount)
            throws com.easypost.exception.EasyPostException {
        service.delete(carrierAccount.getId());
    }
}
