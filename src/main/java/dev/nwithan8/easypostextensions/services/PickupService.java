package dev.nwithan8.easypostextensions.services;


import com.easypost.exception.EasyPostException;
import com.easypost.model.Pickup;
import com.easypost.model.PickupRate;

import java.util.Map;

public class PickupService {
    /**
     * Buy a {@link Pickup}.
     *
     * @param service The {@link com.easypost.service.PickupService} to use.
     * @param pickup  The {@link Pickup} to buy.
     * @return The purchased {@link Pickup}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Pickup buy(final com.easypost.service.PickupService service,
                                                final com.easypost.model.Pickup pickup)
            throws com.easypost.exception.EasyPostException {
        return service.buy(pickup.getId());
    }

    /**
     * Buy a {@link Pickup}.
     *
     * @param service The {@link com.easypost.service.PickupService} to use.
     * @param pickup  The {@link Pickup} to buy.
     * @param rate    The {@link PickupRate} to use when purchasing the {@link Pickup}.
     * @return The purchased {@link Pickup}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Pickup buy(final com.easypost.service.PickupService service,
                                                final com.easypost.model.Pickup pickup,
                                                final com.easypost.model.PickupRate rate)
            throws com.easypost.exception.EasyPostException {
        return service.buy(pickup.getId(), rate);
    }

    /**
     * Buy a {@link Pickup}.
     *
     * @param service The {@link com.easypost.service.PickupService} to use.
     * @param pickup  The {@link Pickup} to buy.
     * @param params  The parameters to use for the request.
     * @return The purchased {@link Pickup}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Pickup buy(final com.easypost.service.PickupService service,
                                                final com.easypost.model.Pickup pickup,
                                                final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.buy(pickup.getId(), params);
    }

    /**
     * Cancel a {@link Pickup}.
     *
     * @param service The {@link com.easypost.service.PickupService} to use.
     * @param pickup  The {@link Pickup} to cancel.
     * @return The cancelled {@link Pickup}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Pickup cancel(final com.easypost.service.PickupService service,
                                                   final com.easypost.model.Pickup pickup)
            throws com.easypost.exception.EasyPostException {
        return service.cancel(pickup.getId());
    }

    /**
     * Cancel a {@link Pickup}.
     *
     * @param service The {@link com.easypost.service.PickupService} to use.
     * @param pickup  The {@link Pickup} to cancel.
     * @param params  The parameters to use for the request.
     * @return The cancelled {@link Pickup}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Pickup cancel(final com.easypost.service.PickupService service,
                                                   final com.easypost.model.Pickup pickup,
                                                   final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.cancel(pickup.getId(), params);
    }
}
