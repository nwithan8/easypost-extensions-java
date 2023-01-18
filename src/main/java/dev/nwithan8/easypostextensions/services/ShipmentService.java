package dev.nwithan8.easypostextensions.services;


import com.easypost.exception.EasyPostException;
import com.easypost.model.Rate;
import com.easypost.model.Shipment;
import com.easypost.model.SmartRate;
import com.easypost.model.EndShipper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipmentService {
    /**
     * Get new {@link Rate}s for a {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to generate rates for.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment newRates(final com.easypost.service.ShipmentService service,
                                                       final com.easypost.model.Shipment shipment)
            throws com.easypost.exception.EasyPostException {
        return service.newRates(shipment.getId());
    }

    /**
     * Get new {@link Rate}s for an {@link Shipment}.
     *
     * @param service          The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment         The {@link Shipment} to generate rates for.
     * @param withCarbonOffset Whether to account for carbon offset in the rates.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment newRates(final com.easypost.service.ShipmentService service,
                                                       final com.easypost.model.Shipment shipment,
                                                       boolean withCarbonOffset)
            throws com.easypost.exception.EasyPostException {
        return service.newRates(shipment.getId(), withCarbonOffset);
    }

    /**
     * Get new {@link Rate}s for an {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to generate rates for.
     * @param params   The parameters to use for the request.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment newRates(final com.easypost.service.ShipmentService service,
                                                       final com.easypost.model.Shipment shipment,
                                                       final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.newRates(shipment.getId(), params);
    }

    /**
     * Get new {@link Rate}s for an {@link Shipment}.
     *
     * @param service          The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment         The {@link Shipment} to generate rates for.
     * @param params           The parameters to use for the request.
     * @param withCarbonOffset Whether to account for carbon offset in the rates.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment newRates(final com.easypost.service.ShipmentService service,
                                                       final com.easypost.model.Shipment shipment,
                                                       final Map<String, Object> params, final boolean withCarbonOffset)
            throws com.easypost.exception.EasyPostException {
        return service.newRates(shipment.getId(), params, withCarbonOffset);
    }

    /**
     * Get new {@link SmartRate}s for a {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to generate smart rates for.
     * @throws EasyPostException when the request fails.
     */
    public static List<SmartRate> getSmartRates(final com.easypost.service.ShipmentService service,
                                                final com.easypost.model.Shipment shipment)
            throws com.easypost.exception.EasyPostException {
        return service.smartrates(shipment.getId());
    }

    /**
     * Get new {@link SmartRate}s for an {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to generate smart rates for.
     * @param params   The parameters to use for the request.
     * @throws EasyPostException when the request fails.
     */
    public static List<SmartRate> getSmartRates(final com.easypost.service.ShipmentService service,
                                                final com.easypost.model.Shipment shipment,
                                                final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.smartrates(shipment.getId(), params);
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to buy.
     * @param rate     The {@link Rate} to use for the purchase.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final com.easypost.model.Rate rate)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), rate);
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service          The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment         The {@link Shipment} to buy.
     * @param rate             The {@link Rate} to use for the purchase.
     * @param withCarbonOffset Whether to add a carbon offset to the shipment.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final com.easypost.model.Rate rate, final boolean withCarbonOffset)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), rate, withCarbonOffset);
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service      The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment     The {@link Shipment} to buy.
     * @param rate         The {@link Rate} to use for the purchase.
     * @param endShipperId The ID of the {@link EndShipper} to purchase this shipment with.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final com.easypost.model.Rate rate, final String endShipperId)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), rate, endShipperId);
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service    The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment   The {@link Shipment} to buy.
     * @param rate       The {@link Rate} to use for the purchase.
     * @param endShipper The {@link EndShipper} to purchase this shipment with.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final com.easypost.model.Rate rate,
                                                  final com.easypost.model.EndShipper endShipper)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), rate, endShipper.getId());
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service          The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment         The {@link Shipment} to buy.
     * @param rate             The {@link Rate} to use for the purchase.
     * @param withCarbonOffset Whether to add a carbon offset to the shipment.
     * @param endShipperId     The ID of the {@link EndShipper} to purchase this shipment with.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final com.easypost.model.Rate rate, final boolean withCarbonOffset,
                                                  final String endShipperId)
            throws com.easypost.exception.EasyPostException {
        Map<String, Object> params = new HashMap<>();
        params.put("rate", rate);
        return service.buy(shipment.getId(), params, withCarbonOffset, endShipperId);
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service          The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment         The {@link Shipment} to buy.
     * @param rate             The {@link Rate} to use for the purchase.
     * @param withCarbonOffset Whether to add a carbon offset to the shipment.
     * @param endShipper       The {@link EndShipper} to purchase this shipment with.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final com.easypost.model.Rate rate, final boolean withCarbonOffset,
                                                  final com.easypost.model.EndShipper endShipper)
            throws com.easypost.exception.EasyPostException {
        Map<String, Object> params = new HashMap<>();
        params.put("rate", rate);
        return service.buy(shipment.getId(), params, withCarbonOffset, endShipper.getId());
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to buy.
     * @param params   The parameters to use for the request.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), params);
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service          The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment         The {@link Shipment} to buy.
     * @param params           The parameters to use for the request.
     * @param withCarbonOffset Whether to add a carbon offset to the shipment.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final Map<String, Object> params, final boolean withCarbonOffset)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), params, withCarbonOffset);
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service      The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment     The {@link Shipment} to buy.
     * @param params       The parameters to use for the request.
     * @param endShipperId The ID of the {@link EndShipper} to purchase this shipment with.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final Map<String, Object> params, final String endShipperId)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), params, endShipperId);
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service    The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment   The {@link Shipment} to buy.
     * @param params     The parameters to use for the request.
     * @param endShipper The {@link EndShipper} to purchase this shipment with.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final Map<String, Object> params,
                                                  final com.easypost.model.EndShipper endShipper)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), params, endShipper.getId());
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service          The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment         The {@link Shipment} to buy.
     * @param params           The parameters to use for the request.
     * @param withCarbonOffset Whether to add a carbon offset to the shipment.
     * @param endShipperId     The ID of the {@link EndShipper} to purchase this shipment with.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final Map<String, Object> params, final boolean withCarbonOffset,
                                                  final String endShipperId)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), params, withCarbonOffset, endShipperId);
    }

    /**
     * Buy a {@link Shipment}.
     *
     * @param service          The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment         The {@link Shipment} to buy.
     * @param params           The parameters to use for the request.
     * @param withCarbonOffset Whether to add a carbon offset to the shipment.
     * @param endShipper       The {@link EndShipper} to purchase this shipment with.
     * @return The purchased {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment buy(final com.easypost.service.ShipmentService service,
                                                  final com.easypost.model.Shipment shipment,
                                                  final Map<String, Object> params, final boolean withCarbonOffset,
                                                  final com.easypost.model.EndShipper endShipper)
            throws com.easypost.exception.EasyPostException {
        return service.buy(shipment.getId(), params, withCarbonOffset, endShipper.getId());
    }

    /**
     * Refund a {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to refund.
     * @return The refunded {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment refund(final com.easypost.service.ShipmentService service,
                                                     final com.easypost.model.Shipment shipment)
            throws com.easypost.exception.EasyPostException {
        return service.refund(shipment.getId());
    }

    /**
     * Refund a {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to refund.
     * @param params   The parameters to use for the request.
     * @return The refunded {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment refund(final com.easypost.service.ShipmentService service,
                                                     final com.easypost.model.Shipment shipment,
                                                     final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.refund(shipment.getId(), params);
    }

    /**
     * Label a {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to label.
     * @param params   The parameters to use for the request.
     * @return The labeled {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment label(final com.easypost.service.ShipmentService service,
                                                    final com.easypost.model.Shipment shipment,
                                                    final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.label(shipment.getId(), params);
    }

    /**
     * Insure a {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to insure.
     * @param params   The parameters to use for the request.
     * @return The insured {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Shipment insure(final com.easypost.service.ShipmentService service,
                                                     final com.easypost.model.Shipment shipment,
                                                     final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.insure(shipment.getId(), params);
    }

    /**
     * Get the lowest {@link SmartRate} of a {@link Shipment}.
     *
     * @param service      The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment     The {@link Shipment} to get smart rates from.
     * @param deliveryDays The number of days to deliver the shipment in.
     * @param accuracy     The accuracy of the delivery days.
     * @return The lowest {@link SmartRate}.
     * @throws EasyPostException when the request fails.
     */
    public static SmartRate getLowestRate(final com.easypost.service.ShipmentService service,
                                          final com.easypost.model.Shipment shipment, final int deliveryDays,
                                          final com.easypost.model.SmartrateAccuracy accuracy)
            throws com.easypost.exception.EasyPostException {
        return service.lowestSmartRate(shipment.getId(), deliveryDays, accuracy);
    }

    /**
     * Generate a form for a {@link Shipment}.
     *
     * @param service  The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment The {@link Shipment} to generate a form for.
     * @param formType The type of form to generate.
     * @return The updated {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static Shipment generateForm(final com.easypost.service.ShipmentService service,
                                        final com.easypost.model.Shipment shipment, final String formType)
            throws com.easypost.exception.EasyPostException {
        return service.generateForm(shipment.getId(), formType);
    }

    /**
     * Generate a form for a {@link Shipment}.
     *
     * @param service     The {@link com.easypost.service.ShipmentService} to use.
     * @param shipment    The {@link Shipment} to generate a form for.
     * @param formType    The type of form to generate.
     * @param formOptions The options to use for the form.
     * @return The updated {@link Shipment}.
     * @throws EasyPostException when the request fails.
     */
    public static Shipment generateForm(final com.easypost.service.ShipmentService service,
                                        final com.easypost.model.Shipment shipment, final String formType,
                                        final Map<String, Object> formOptions)
            throws com.easypost.exception.EasyPostException {
        return service.generateForm(shipment.getId(), formType, formOptions);
    }
}
