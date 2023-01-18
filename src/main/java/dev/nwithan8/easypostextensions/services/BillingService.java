package dev.nwithan8.easypostextensions.services;


import com.easypost.exception.EasyPostException;
import com.easypost.model.PaymentMethod;
import dev.nwithan8.easypostextensions.internal.Extensions;
import lombok.experimental.ExtensionMethod;

@ExtensionMethod (Extensions.class)
public class BillingService {
    /**
     * Fund your wallet by a specific amount.
     * Funds will be drawn from your primary payment method.
     *
     * @param service The {@link com.easypost.service.BillingService} to use.
     * @param amount   The amount to fund your wallet by.
     * @throws EasyPostException when the request fails.
     */
    public static void fundWallet(final com.easypost.service.BillingService service, final int amount)
            throws com.easypost.exception.EasyPostException {
        service.fundWallet(Extensions.toString(amount));
    }

    /**
     * Fund your wallet by a specific amount.
     *
     * @param service The {@link com.easypost.service.BillingService} to use.
     * @param amount   The amount to fund your wallet by.
     * @param priority The {@link PaymentMethod.Priority} to draw funds from.
     * @throws EasyPostException when the request fails.
     */
    public static void fundWallet(final com.easypost.service.BillingService service,
                                  final int amount, final PaymentMethod.Priority priority)
            throws com.easypost.exception.EasyPostException {
        service.fundWallet(Extensions.toString(amount), priority);
    }
}
