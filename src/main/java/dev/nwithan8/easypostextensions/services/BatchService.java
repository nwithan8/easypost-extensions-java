package dev.nwithan8.easypostextensions.services;

import com.easypost.exception.EasyPostException;
import com.easypost.model.Batch;
import com.easypost.model.Shipment;
import com.easypost.model.ScanForm;

import java.util.List;
import java.util.Map;

public class BatchService {
    /**
     * Label a {@link Batch}.
     *
     * @param service The {@link com.easypost.service.BatchService} to use.
     * @param batch   The {@link Batch} to label.
     * @param params  The parameters to use for the request.
     * @return The labeled {@link Batch}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Batch label(final com.easypost.service.BatchService service,
                                                 final com.easypost.model.Batch batch, final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.label(batch.getId(), params);
    }

    /**
     * Add shipments to a {@link Batch}.
     *
     * @param service The {@link com.easypost.service.BatchService} to use.
     * @param batch   The {@link Batch} to add shipments to.
     * @param params  The parameters to use for the request.
     * @return The updated {@link Batch}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Batch addShipments(final com.easypost.service.BatchService service,
                                                        final com.easypost.model.Batch batch,
                                                        final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.addShipments(batch.getId(), params);
    }

    /**
     * Add shipments to a {@link Batch}.
     *
     * @param service   The {@link com.easypost.service.BatchService} to use.
     * @param batch     The {@link Batch} to add shipments to.
     * @param shipments The {@link Shipment}s to add.
     * @return The updated {@link Batch}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Batch addShipments(final com.easypost.service.BatchService service,
                                                        final com.easypost.model.Batch batch,
                                                        final List<Shipment> shipments)
            throws com.easypost.exception.EasyPostException {
        return service.addShipments(batch.getId(), shipments);
    }

    /**
     * Remove shipments from a {@link Batch}.
     *
     * @param service The {@link com.easypost.service.BatchService} to use.
     * @param batch   The {@link Batch} to remove shipments from.
     * @param params  The parameters to use for the request.
     * @return The updated {@link Batch}.
     * @throws com.easypost.exception.EasyPostException when the request fails.
     */
    public static com.easypost.model.Batch removeShipments(final com.easypost.service.BatchService service,
                                                           final com.easypost.model.Batch batch,
                                                           final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.removeShipments(batch.getId(), params);
    }

    /**
     * Remove shipments from a {@link Batch}.
     *
     * @param service   The {@link com.easypost.service.BatchService} to use.
     * @param batch     The {@link Batch} to remove shipments from.
     * @param shipments The {@link Shipment}s to remove.
     * @return The updated {@link Batch}.
     * @throws com.easypost.exception.EasyPostException when the request fails.
     */
    public static com.easypost.model.Batch removeShipments(final com.easypost.service.BatchService service,
                                                           final com.easypost.model.Batch batch,
                                                           final List<Shipment> shipments)
            throws com.easypost.exception.EasyPostException {
        return service.removeShipments(batch.getId(), shipments);
    }

    /**
     * Buy a {@link Batch}.
     *
     * @param service The {@link com.easypost.service.BatchService} to use.
     * @param batch   The {@link Batch} to buy.
     * @return The purchased {@link Batch}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Batch buy(final com.easypost.service.BatchService service,
                                               final com.easypost.model.Batch batch)
            throws com.easypost.exception.EasyPostException {
        return service.buy(batch.getId());
    }

    /**
     * Buy a {@link Batch}.
     *
     * @param service The {@link com.easypost.service.BatchService} to use.
     * @param batch   The {@link Batch} to buy.
     * @param params  The parameters to use for the request.
     * @return The purchased {@link Batch}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Batch buy(final com.easypost.service.BatchService service,
                                               final com.easypost.model.Batch batch, final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.buy(batch.getId(), params);
    }

    /**
     * Create a {@link ScanForm} for a {@link Batch}.
     *
     * @param service The {@link com.easypost.service.BatchService} to use.
     * @param batch   The {@link Batch} to create a {@link ScanForm} for.
     * @return The updated {@link Batch}.
     * @throws EasyPostException when the request fails.
     */
    public static com.easypost.model.Batch createScanForm(final com.easypost.service.BatchService service,
                                                          final com.easypost.model.Batch batch)
            throws com.easypost.exception.EasyPostException {
        return service.createScanForm(batch.getId());
    }

    /**
     * Create a {@link ScanForm} for a {@link Batch}.
     *
     * @param service The {@link com.easypost.service.BatchService} to use.
     * @param batch   The {@link Batch} to create a {@link ScanForm} for.
     * @param params  The parameters to use for the request.
     * @return The updated {@link Batch}.
     * @throws com.easypost.exception.EasyPostException when the request fails.
     */
    public static com.easypost.model.Batch createScanForm(final com.easypost.service.BatchService service,
                                                          final com.easypost.model.Batch batch,
                                                          final Map<String, Object> params)
            throws com.easypost.exception.EasyPostException {
        return service.createScanForm(batch.getId(), params);
    }
}
