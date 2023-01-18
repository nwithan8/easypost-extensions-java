package dev.nwithan8.easypostextensions.services;


import com.easypost.model.Webhook;
import com.easypost.exception.EasyPostException;

import java.util.Map;

public class WebhookService {
    /**
     * Delete a {@link Webhook}.
     *
     * @param service The {@link com.easypost.service.WebhookService} to use.
     * @param webhook The {@link Webhook} to delete.
     * @throws EasyPostException when the request fails.
     */
    public static void delete(final com.easypost.service.WebhookService service,
                              final com.easypost.model.Webhook webhook)
            throws com.easypost.exception.EasyPostException {
        service.delete(webhook.getId());
    }

    /**
     * Toggle the enabled state of a {@link Webhook}.
     *
     * @param service The {@link com.easypost.service.WebhookService} to use.
     * @param webhook The {@link Webhook} to toggle.
     * @throws EasyPostException when the request fails.
     */
    public static void toggle(final com.easypost.service.WebhookService service,
                              final com.easypost.model.Webhook webhook)
            throws com.easypost.exception.EasyPostException {
        service.update(webhook.getId());
    }

    /**
     * Update a {@link Webhook}.
     *
     * @param service The {@link com.easypost.service.WebhookService} to use.
     * @param webhook The {@link Webhook} to update.
     * @param params  The parameters to use for the request.
     * @throws EasyPostException when the request fails.
     */
    public static void update(final com.easypost.service.WebhookService service,
                              final com.easypost.model.Webhook webhook, final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        service.update(webhook.getId(), params);
    }
}
