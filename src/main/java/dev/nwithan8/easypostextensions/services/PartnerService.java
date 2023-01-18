package dev.nwithan8.easypostextensions.services;


import com.easypost.exception.EasyPostException;

public class PartnerService {
    /**
     * Update the email address for a {@link com.easypost.model.ReferralCustomer}.
     *
     * @param service          The {@link com.easypost.service.OrderService} to use.
     * @param email            The new email address.
     * @param referralCustomer The {@link com.easypost.model.ReferralCustomer} to update an email address for.
     * @throws EasyPostException when the request fails.
     */
    public static void updateEmail(final com.easypost.service.ReferralCustomerService service, final String email,
                                   final com.easypost.model.ReferralCustomer referralCustomer)
            throws com.easypost.exception.EasyPostException {
        service.updateEmail(email, referralCustomer.getId());
    }
}
