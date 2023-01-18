package dev.nwithan8.easypostextensions.services;


import com.easypost.exception.EasyPostException;
import com.easypost.model.Rate;
import com.easypost.model.Order;

import java.util.Map;

public class OrderService {
    /**
     * Get new {@link Rate}s for an {@link Order}.
     *
     * @param service The {@link com.easypost.service.OrderService} to use.
     * @param order   The {@link Order} to generate rates for.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Order newRates(final com.easypost.service.OrderService service,
                                                    final com.easypost.model.Order order)
            throws com.easypost.exception.EasyPostException {
        return service.newRates(order.getId());
    }

    /**
     * Get new {@link Rate}s for an {@link Order}.
     *
     * @param service The {@link com.easypost.service.OrderService} to use.
     * @param order   The {@link Order} to generate rates for.
     * @param params  The parameters to use for the request.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Order newRates(final com.easypost.service.OrderService service,
                                                    final com.easypost.model.Order order,
                                                    final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.newRates(order.getId(), params);
    }

    /**
     * Buy an {@link Order}.
     *
     * @param service The {@link com.easypost.service.OrderService} to use.
     * @param order   The {@link Order} to buy.
     * @return The purchased {@link Order}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Order buy(final com.easypost.service.OrderService service,
                                               final com.easypost.model.Order order, final com.easypost.model.Rate rate)
            throws com.easypost.exception.EasyPostException {
        return service.buy(order.getId(), rate);
    }

    /**
     * Buy an {@link Order}.
     *
     * @param service The {@link com.easypost.service.OrderService} to use.
     * @param order   The {@link Order} to buy.
     * @param params  The parameters to use for the request.
     * @return The purchased {@link Order}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Order buy(final com.easypost.service.OrderService service,
                                               final com.easypost.model.Order order, final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.buy(order.getId(), params);
    }
}
