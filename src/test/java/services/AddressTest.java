package services;

import com.easypost.exception.EasyPostException;
import com.easypost.model.Address;
import com.easypost.service.EasyPostClient;
import dev.nwithan8.easypostextensions.parameters.Addresses;
import lombok.experimental.ExtensionMethod;
import org.junit.jupiter.api.Test;

import dev.nwithan8.easypostextensions.services.AddressService;

import java.util.Map;

@ExtensionMethod (AddressService.class)
public final class AddressTest {

    @Test
    public void testCreate() throws EasyPostException {
        EasyPostClient client = new EasyPostClient("some-api-key");

        com.easypost.service.AddressService addressService = client.address;

        // Address address = addressService.verify(new Address());

        Addresses.Create createParameters = new Addresses.Create();
        createParameters.carrierFacility = "some-carrier-facility";

        Map<String, Object> parameters = createParameters.toDictionary();

        System.out.println(parameters);
    }
}
