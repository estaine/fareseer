package com.estaine.fareseer.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class WizzAirResponseTest {

    private Set<SimpleResponse> expectedSimpleResponseSet;

    @Before
    public void prepare() {
        expectedSimpleResponseSet = new HashSet<>();

        expectedSimpleResponseSet.add(new SimpleResponse(
                "LTN", "VNO", "2017-06-08T14:35:00", "2017-06-08T19:15:00", "W6", "8004", 52.99, "GBP"));
        expectedSimpleResponseSet.add(new SimpleResponse(
                "LTN", "VNO", "2017-06-08T21:20:00", "2017-06-09T01:55:00", "W6", "8006", 52.99, "GBP"));
    }

    @Test
    public void test() throws IOException {
        final String response = "{\n"
                + "  \"outboundFlights\": [\n"
                + "    {\n"
                + "      \"departureStation\": \"LTN\",\n"
                + "      \"arrivalStation\": \"VNO\",\n"
                + "      \"carrierCode\": \"W6\",\n"
                + "      \"flightNumber\": \"8004\",\n"
                + "      \"flightSellKey\": \"W6~8004~ ~~LTN~06/08/2017 14:35~VNO~06/08/2017 19:15~\",\n"
                + "      \"departureDateTime\": \"2017-06-08T14:35:00\",\n"
                + "      \"arrivalDateTime\": \"2017-06-08T19:15:00\",\n"
                + "      \"fares\": [\n"
                + "        { \n"
                + "          \"fareSellKey\": \"0~L~~LREG~REG1~~12~X\",\n"
                + "          \"administrationFeePrice\": {\n"
                + "            \"amount\": 7.5,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"basePrice\": {\n"
                + "            \"amount\": 52.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedPrice\": {\n"
                + "            \"amount\": 52.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"fullBasePrice\": {\n"
                + "            \"amount\": 52.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedFarePrice\": {\n"
                + "            \"amount\": 45.4900,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"flightChangeFeePrice\": {\n"
                + "            \"amount\": 0.0,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"bundle\": \"BASIC\",\n"
                + "          \"fareDiscountType\": \"none\",\n"
                + "          \"wdc\": false,\n"
                + "          \"availableCount\": 6\n"
                + "        },\n"
                + "        {\n"
                + "          \"fareSellKey\": \"0~L~~LREG~REG1~~12~X\",\n"
                + "          \"administrationFeePrice\": {\n"
                + "            \"amount\": 7.5,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"basePrice\": {\n"
                + "            \"amount\": 81.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedPrice\": {\n"
                + "            \"amount\": 81.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"fullBasePrice\": {\n"
                + "            \"amount\": 94.49,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedFarePrice\": {\n"
                + "            \"amount\": 45.4900,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"flightChangeFeePrice\": {\n"
                + "            \"amount\": 0.0,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"bundle\": \"MIDDLE\",\n"
                + "          \"fareDiscountType\": \"none\",\n"
                + "          \"wdc\": false,\n"
                + "          \"availableCount\": 6\n"
                + "        },\n"
                + "        {\n"
                + "          \"fareSellKey\": \"0~L~~LREG~REG1~~12~X\",\n"
                + "          \"administrationFeePrice\": {\n"
                + "            \"amount\": 7.5,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"basePrice\": {\n"
                + "            \"amount\": 96.49,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedPrice\": {\n"
                + "            \"amount\": 96.49,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"fullBasePrice\": {\n"
                + "            \"amount\": 139.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedFarePrice\": {\n"
                + "            \"amount\": 45.4900,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"flightChangeFeePrice\": {\n"
                + "            \"amount\": 0.0,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"bundle\": \"PLUS\",\n"
                + "          \"fareDiscountType\": \"none\",\n"
                + "          \"wdc\": false,\n"
                + "          \"availableCount\": 6\n"
                + "        }\n"
                + "      ],\n"
                + "      \"infantLimitExceeded\": {\n"
                + "        \"limitExceeded\": false,\n"
                + "        \"isBlocking\": true\n"
                + "      },\n"
                + "      \"wheelchairLimitExceeded\": {\n"
                + "        \"unavailableCount\": 0,\n"
                + "        \"limitExceeded\": false,\n"
                + "        \"isBlocking\": false\n"
                + "      },\n"
                + "      \"oxyLimitExceeded\": {\n"
                + "        \"limitExceeded\": false,\n"
                + "        \"isBlocking\": true\n"
                + "      },\n"
                + "      \"sportsEquipmentLimitExceeded\": {\n"
                + "        \"unavailableCount\": 0,\n"
                + "        \"limitExceeded\": false,\n"
                + "        \"isBlocking\": false\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"departureStation\": \"LTN\",\n"
                + "      \"arrivalStation\": \"VNO\",\n"
                + "      \"carrierCode\": \"W6\",\n"
                + "      \"flightNumber\": \"8006\",\n"
                + "      \"flightSellKey\": \"W6~8006~ ~~LTN~06/08/2017 21:20~VNO~06/09/2017 01:55~\",\n"
                + "      \"departureDateTime\": \"2017-06-08T21:20:00\",\n"
                + "      \"arrivalDateTime\": \"2017-06-09T01:55:00\",\n"
                + "      \"fares\": [\n"
                + "        {\n"
                + "          \"fareSellKey\": \"0~L~~LREG~REG1~~12~X\",\n"
                + "          \"administrationFeePrice\": {\n"
                + "            \"amount\": 7.5,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"basePrice\": {\n"
                + "            \"amount\": 52.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedPrice\": {\n"
                + "            \"amount\": 52.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"fullBasePrice\": {\n"
                + "            \"amount\": 52.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedFarePrice\": {\n"
                + "            \"amount\": 45.4900,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"flightChangeFeePrice\": {\n"
                + "            \"amount\": 0.0,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"bundle\": \"BASIC\",\n"
                + "          \"fareDiscountType\": \"none\",\n"
                + "          \"wdc\": false,\n"
                + "          \"availableCount\": 7\n"
                + "        },\n"
                + "        {\n"
                + "          \"fareSellKey\": \"0~L~~LREG~REG1~~12~X\",\n"
                + "          \"administrationFeePrice\": {\n"
                + "            \"amount\": 7.5,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"basePrice\": {\n"
                + "            \"amount\": 81.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedPrice\": {\n"
                + "            \"amount\": 81.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"fullBasePrice\": {\n"
                + "            \"amount\": 94.49,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedFarePrice\": {\n"
                + "            \"amount\": 45.4900,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"flightChangeFeePrice\": {\n"
                + "            \"amount\": 0.0,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"bundle\": \"MIDDLE\",\n"
                + "          \"fareDiscountType\": \"none\",\n"
                + "          \"wdc\": false,\n"
                + "          \"availableCount\": 7\n"
                + "        },\n"
                + "        {\n"
                + "          \"fareSellKey\": \"0~L~~LREG~REG1~~12~X\",\n"
                + "          \"administrationFeePrice\": {\n"
                + "            \"amount\": 7.5,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"basePrice\": {\n"
                + "            \"amount\": 96.49,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedPrice\": {\n"
                + "            \"amount\": 96.49,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"fullBasePrice\": {\n"
                + "            \"amount\": 139.99,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"discountedFarePrice\": {\n"
                + "            \"amount\": 45.4900,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"flightChangeFeePrice\": {\n"
                + "            \"amount\": 0.0,\n"
                + "            \"currencyCode\": \"GBP\"\n"
                + "          },\n"
                + "          \"bundle\": \"PLUS\",\n"
                + "          \"fareDiscountType\": \"none\",\n"
                + "          \"wdc\": false,\n"
                + "          \"availableCount\": 7\n"
                + "        }\n"
                + "      ],\n"
                + "      \"infantLimitExceeded\": {\n"
                + "        \"limitExceeded\": false,\n"
                + "        \"isBlocking\": true\n"
                + "      },\n"
                + "      \"wheelchairLimitExceeded\": {\n"
                + "        \"unavailableCount\": 0,\n"
                + "        \"limitExceeded\": false,\n"
                + "        \"isBlocking\": false\n"
                + "      },\n"
                + "      \"oxyLimitExceeded\": {\n"
                + "        \"limitExceeded\": false,\n"
                + "        \"isBlocking\": true\n"
                + "      },\n"
                + "      \"sportsEquipmentLimitExceeded\": {\n"
                + "        \"unavailableCount\": 0,\n"
                + "        \"limitExceeded\": false,\n"
                + "        \"isBlocking\": false\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"returnFlights\": null,\n"
                + "  \"outboundBundles\": [\n"
                + "    {\n"
                + "      \"code\": \"BASIC\",\n"
                + "      \"ancillaryServices\": [\n"
                + "        \"bundle-ancillary-online-check-in\",\n"
                + "        \"bundle-ancillary-small-cabin-baggage\"\n"
                + "      ]\n"
                + "    },\n"
                + "    {\n"
                + "      \"code\": \"MIDDLE\",\n"
                + "      \"ancillaryServices\": [\n"
                + "        \"bundle-ancillary-online-check-in\",\n"
                + "        \"bundle-ancillary-seat-selection\",\n"
                + "        \"bundle-ancillary-large-cabin-baggage\",\n"
                + "        \"bundle-ancillary-light-checked-in-baggage\"\n"
                + "      ]\n"
                + "    },\n"
                + "    {\n"
                + "      \"code\": \"PLUS\",\n"
                + "      \"ancillaryServices\": [\n"
                + "        \"bundle-ancillary-seat-selection\",\n"
                + "        \"bundle-ancillary-large-cabin-baggage\",\n"
                + "        \"bundle-ancillary-heavy-checked-in-baggage\",\n"
                + "        \"bundle-ancillary-wizz-flex\",\n"
                + "        \"bundle-ancillary-wizz-account-refund\",\n"
                + "        \"bundle-ancillary-priority-boarding\",\n"
                + "        \"bundle-ancillary-small-personal-item\",\n"
                + "        \"bundle-ancillary-airport-check-in\"\n"
                + "      ]\n"
                + "    }\n"
                + "  ],\n"
                + "  \"returnBundles\": null,\n"
                + "  \"currencyCode\": \"GBP\",\n"
                + "  \"arrivalStationCurrencyCode\": \"EUR\",\n"
                + "  \"isDomestic\": false\n"
                + "}";

        WizzAirResponse wizzAirResponse = (new ObjectMapper()).readValue(response, WizzAirResponse.class);
        Set<SimpleResponse> simpleResponseSet = wizzAirResponse.process();

        assert expectedSimpleResponseSet.equals(simpleResponseSet);
    }

}