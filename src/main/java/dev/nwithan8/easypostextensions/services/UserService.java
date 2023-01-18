package dev.nwithan8.easypostextensions.services;


import com.easypost.exception.EasyPostException;
import com.easypost.model.ApiKey;
import com.easypost.model.Brand;
import com.easypost.model.User;

import java.util.List;
import java.util.Map;

public class UserService {
    /**
     * Update a {@link User}.
     *
     * @param service The {@link com.easypost.service.UserService} to use.
     * @param user    The {@link User} to update.
     * @param params  The parameters to use for the request.
     * @return The updated {@link User}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.User update(final com.easypost.service.UserService service,
                                                 final com.easypost.model.User user, final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.update(user.getId(), params);
    }

    /**
     * Delete a {@link User}.
     *
     * @param service The {@link com.easypost.service.UserService} to use.
     * @param user    The {@link User} to delete.
     * @throws EasyPostException when the request fails.
     */
    public static void delete(final com.easypost.service.UserService service, final com.easypost.model.User user)
            throws com.easypost.exception.EasyPostException {
        service.delete(user.getId());
    }

    /**
     * Get a list of {@link ApiKey}s associated with a {@link User}.
     *
     * @param service The {@link com.easypost.service.CarrierAccountService} to use.
     * @param user    The {@link User} to retrieve {@link ApiKey}s for
     * @return A list of {@link ApiKey}s.
     * @throws EasyPostException when the request fails.
     */
    public static List<ApiKey> apiKeys(final com.easypost.service.UserService service,
                                       final com.easypost.model.User user)
            throws com.easypost.exception.EasyPostException {
        return service.apiKeys(user.getId());
    }

    /**
     * Update your {@link Brand}.
     *
     * @param service The {@link com.easypost.service.CarrierAccountService} to use.
     * @param user    The {@link User} to update the {@link Brand} for.
     * @param params  The parameters to use for the request.
     * @return The updated {@link Brand}.
     * @throws EasyPostException when the request fails.
     */
    public static Brand updateBrand(final com.easypost.service.UserService service, final com.easypost.model.User user,
                                    final Map<String, Object> params) throws com.easypost.exception.EasyPostException {
        return service.updateBrand(user.getId(), params);
    }
}
