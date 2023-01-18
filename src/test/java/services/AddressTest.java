package services;

import com.easypost.exception.EasyPostException;
import com.easypost.exception.General.MissingParameterError;
import com.easypost.model.Address;
import com.easypost.service.EasyPostClient;
import lombok.experimental.ExtensionMethod;
import org.junit.jupiter.api.Test;

import com.easypost.EasyPost;

import dev.nwithan8.easypostextensions.services.AddressService;

@ExtensionMethod (AddressService.class)
public final class AddressTest {

    @Test
    public void testCreate() throws EasyPostException {
        EasyPostClient client = new EasyPostClient("some-api-key");

        com.easypost.service.AddressService addressService = client.address;

        Address address = addressService.verify(new Address());
    }
}
