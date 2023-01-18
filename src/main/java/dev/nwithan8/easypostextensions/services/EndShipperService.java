package dev.nwithan8.easypostextensions.services;


import com.easypost.exception.EasyPostException;
import com.easypost.model.EndShipper;

import java.util.Map;

public class EndShipperService {
    /**
     * Update an {@link EndShipper}.
     *
     * @param service The {@link com.easypost.service.EndShipperService} to use.
     * @param endShipper   The {@link EndShipper} to update.
     * @param params  The parameters to use for the request.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.EndShipper update(final com.easypost.service.EndShipperService service,
                                                       final com.easypost.model.EndShipper endShipper,
                                                       final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.update(endShipper.getId(), params);
    }
}
