package com.shelach.orders.testbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.ResponseCreator;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.client.response.MockRestResponseCreators;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
@Profile("test")
public class MockServerBeans {
    @SuppressWarnings("FieldCanBeLocal")
    private final MockRestServiceServer mockRestServiceServer;

    MockServerBeans(RestTemplate restTemplate, @Value("${comax.api.items-url}") String baseurl) {
        this.mockRestServiceServer = MockRestServiceServer.createServer(restTemplate);
        mockRestServiceServer.expect(ExpectedCount.manyTimes(), MockRestRequestMatchers.anything()).andRespond(new MyResponseCreator(baseurl));

    }


    private String getAllItemsPricesByParamsResult() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
                "\t<soap:Body>\n" +
                "\t\t<Get_AllItemsPricesByParamsResponse xmlns=\"http://ws.comax.co.il/Comax_WebServices/\">\n" +
                "\t\t\t<Get_AllItemsPricesByParamsResult>\n" +
                "\t\t\t\t<ClsItemsSalePrices>\n" +
                "\t\t\t\t\t<Name>AmitItemName</Name>\n" +
                "\t\t\t\t\t<ID>0</ID>\n" +
                "\t\t\t\t\t<Barcode>0</Barcode>\n" +
                "\t\t\t\t\t<AlternateID />\n" +
                "\t\t\t\t\t<SalesPrice>\n" +
                "\t\t\t\t\t\t<ClsItemPrices>\n" +
                "\t\t\t\t\t\t\t<PriceListID>7525</PriceListID>\n" +
                "\t\t\t\t\t\t\t<Currency />\n" +
                "\t\t\t\t\t\t\t<IsIncludeVat>false</IsIncludeVat>\n" +
                "\t\t\t\t\t\t\t<Price>19.7</Price>\n" +
                "\t\t\t\t\t\t\t<NetPrice>19.7</NetPrice>\n" +
                "\t\t\t\t\t\t</ClsItemPrices>\n" +
                "\t\t\t\t\t\t<ClsItemPrices>\n" +
                "\t\t\t\t\t\t\t<PriceListID>99999</PriceListID>\n" +
                "\t\t\t\t\t\t\t<Currency />\n" +
                "\t\t\t\t\t\t\t<IsIncludeVat>false</IsIncludeVat>\n" +
                "\t\t\t\t\t\t\t<Price>19.7</Price>\n" +
                "\t\t\t\t\t\t\t<NetPrice>19.7</NetPrice>\n" +
                "\t\t\t\t\t\t</ClsItemPrices>\n" +
                "\t\t\t\t\t\t<ClsItemPrices>\n" +
                "\t\t\t\t\t\t\t<PriceListID>12</PriceListID>\n" +
                "\t\t\t\t\t\t\t<Currency />\n" +
                "\t\t\t\t\t\t\t<IsIncludeVat>true</IsIncludeVat>\n" +
                "\t\t\t\t\t\t\t<Price>29.9</Price>\n" +
                "\t\t\t\t\t\t\t<NetPrice>29.9</NetPrice>\n" +
                "\t\t\t\t\t\t</ClsItemPrices>\n" +
                "\t\t\t\t\t</SalesPrice>\n" +
                "\t\t\t\t</ClsItemsSalePrices>" +
                "\t\t\t</Get_AllItemsPricesByParamsResult>\n" +
                "\t\t</Get_AllItemsPricesByParamsResponse>\n" +
                "\t</soap:Body>\n" +
                "</soap:Envelope>";
    }


    private String getItemsDetailsResponse() {
        //noinspection SpellCheckingInspection
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<ArrayOfClsItems xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns=\"http://ws.comax.co.il/Comax_WebServices/\">\n" +
                "\t<ClsItems>\n" +
                "\t\t<Name>עע</Name>\n" +
                "\t\t<Size />\n" +
                "\t\t<ID>0</ID>\n" +
                "\t\t<OldID>0</OldID>\n" +
                "\t\t<Barcode>0</Barcode>\n" +
                "\t\t<PurchasingAccountID>0</PurchasingAccountID>\n" +
                "\t\t<SalesAccountID>0</SalesAccountID>\n" +
                "\t\t<AlternateID />\n" +
                "\t\t<WorkByAlternateID>false</WorkByAlternateID>\n" +
                "\t\t<SerialNo />\n" +
                "\t\t<Price>0</Price>\n" +
                "\t\t<Quantity>0</Quantity>\n" +
                "\t\t<DiscountPercent>0</DiscountPercent>\n" +
                "\t\t<DiscountTotal>0</DiscountTotal>\n" +
                "\t\t<TotalSum>0</TotalSum>\n" +
                "\t\t<MaxQuantityInOrder>0</MaxQuantityInOrder>\n" +
                "\t\t<CorrectionPrice>0</CorrectionPrice>\n" +
                "\t\t<CorrectionDiscountPercent>0</CorrectionDiscountPercent>\n" +
                "\t\t<CorrectionQuantity>0</CorrectionQuantity>\n" +
                "\t\t<ConversionQuantity>0</ConversionQuantity>\n" +
                "\t\t<SuperDepartment />\n" +
                "\t\t<SuperDepartmentCode>0</SuperDepartmentCode>\n" +
                "\t\t<Department>עופות טריים</Department>\n" +
                "\t\t<DepartmentCode>6</DepartmentCode>\n" +
                "\t\t<DepartmentEnglishName />\n" +
                "\t\t<Group />\n" +
                "\t\t<GroupCode>0</GroupCode>\n" +
                "\t\t<GroupEnglishName />\n" +
                "\t\t<Sub_Group />\n" +
                "\t\t<Sub_GroupCode>0</Sub_GroupCode>\n" +
                "\t\t<Sub_GroupEnglishName />\n" +
                "\t\t<Manufacturer />\n" +
                "\t\t<ManufacturerCode>0</ManufacturerCode>\n" +
                "\t\t<ItemModel>\n" +
                "\t\t\t<Name />\n" +
                "\t\t\t<ID />\n" +
                "\t\t</ItemModel>\n" +
                "\t\t<ItemColor>\n" +
                "\t\t\t<Name />\n" +
                "\t\t\t<ID />\n" +
                "\t\t</ItemColor>\n" +
                "\t\t<ItemSize>\n" +
                "\t\t\t<Name />\n" +
                "\t\t\t<ID />\n" +
                "\t\t</ItemSize>\n" +
                "\t\t<Attribute1 />\n" +
                "\t\t<Attribute1Code />\n" +
                "\t\t<Attribute2 />\n" +
                "\t\t<Attribute2Code />\n" +
                "\t\t<Attribute3 />\n" +
                "\t\t<Attribute3Code />\n" +
                "\t\t<Attribute4 />\n" +
                "\t\t<Attribute4Code />\n" +
                "\t\t<Attribute5 />\n" +
                "\t\t<Attribute5Code />\n" +
                "\t\t<SupplierID>6015</SupplierID>\n" +
                "\t\t<SupplierName>נטו מלינדה סחר בע\"מ</SupplierName>\n" +
                "\t\t<SupplierCatalogNumber />\n" +
                "\t\t<SupplierPrice>19.7</SupplierPrice>\n" +
                "\t\t<ArchiveDate />\n" +
                "\t\t<BlockPurchaseDate />\n" +
                "\t\t<BlockSalesDate />\n" +
                "\t\t<EnglishName />\n" +
                "\t\t<PromoID>0</PromoID>\n" +
                "\t\t<PromoRank>0</PromoRank>\n" +
                "\t\t<MatchingItemID>0</MatchingItemID>\n" +
                "\t\t<MatchingItemQuantity>0</MatchingItemQuantity>\n" +
                "\t\t<UnitsQuantity>0</UnitsQuantity>\n" +
                "\t\t<Length>0</Length>\n" +
                "\t\t<LengthSize />\n" +
                "\t\t<Width>0</Width>\n" +
                "\t\t<WidthSize />\n" +
                "\t\t<Height>0</Height>\n" +
                "\t\t<HeightSize />\n" +
                "\t\t<Weight>0</Weight>\n" +
                "\t\t<WeightSize />\n" +
                "\t\t<CurrentStoreID>0</CurrentStoreID>\n" +
                "\t\t<BaseLine>0</BaseLine>\n" +
                "\t\t<BaseDocNumber>0</BaseDocNumber>\n" +
                "\t\t<BaseReference>0</BaseReference>\n" +
                "\t\t<BaseYear>0</BaseYear>\n" +
                "\t\t<Conversion>0</Conversion>\n" +
                "\t\t<AdditionalConversion>0</AdditionalConversion>\n" +
                "\t\t<NotShowInWeb>false</NotShowInWeb>\n" +
                "\t\t<SetModelProperties>false</SetModelProperties>\n" +
                "\t\t<HierarchyUpdate>false</HierarchyUpdate>\n" +
                "\t\t<DownloadPriceTransparencyAfter48Hours>FalseValue</DownloadPriceTransparencyAfter48Hours>\n" +
                "\t\t<ItemData>;עופות טריים;;</ItemData>\n" +
                "\t\t<RejectTypeID>0</RejectTypeID>\n" +
                "\t\t<OpenDate>11/10/2013</OpenDate>\n" +
                "\t\t<WarrantyMonths>0</WarrantyMonths>\n" +
                "\t\t<Ingredients />\n" +
                "\t\t<FullIngredientsReplace>false</FullIngredientsReplace>\n" +
                "\t\t<CmtAmara>0</CmtAmara>\n" +
                "\t\t<AmaraBy />\n" +
                "\t\t<CmtAmara2>0</CmtAmara2>\n" +
                "\t\t<InternalAmara>0</InternalAmara>\n" +
                "\t\t<Line>0</Line>\n" +
                "\t\t<LengthOptic>0</LengthOptic>\n" +
                "\t\t<DiagonalOptic>0</DiagonalOptic>\n" +
                "\t\t<HeightOptic>0</HeightOptic>\n" +
                "\t\t<NameInWeb />\n" +
                "\t\t<NosafKod_2 />\n" +
                "\t\t<NosafNm_2 />\n" +
                "\t\t<NosafKod_3 />\n" +
                "\t\t<NosafNm_3 />\n" +
                "\t\t<AtarDescription />\n" +
                "\t\t<Energia>0</Energia>\n" +
                "\t\t<Pahmemot>0</Pahmemot>\n" +
                "\t\t<Helbonim>0</Helbonim>\n" +
                "\t\t<Shumanim>0</Shumanim>\n" +
                "\t\t<Colestrol>0</Colestrol>\n" +
                "\t\t<MhrMivza>0</MhrMivza>\n" +
                "\t\t<SwBonos>false</SwBonos>\n" +
                "\t\t<BonosFline>0</BonosFline>\n" +
                "\t\t<BonosTline>0</BonosTline>\n" +
                "\t\t<Mirsham_PhrmaSoft>0</Mirsham_PhrmaSoft>\n" +
                "\t\t<CustomerMakat>0</CustomerMakat>\n" +
                "\t\t<QtyType>Empty</QtyType>\n" +
                "\t\t<NoDiscount>0</NoDiscount>\n" +
                "\t\t<PriceUSD>0</PriceUSD>\n" +
                "\t\t<PriceNIS>0</PriceNIS>\n" +
                "\t\t<WarrantySupplier>0</WarrantySupplier>\n" +
                "\t\t<WarrantyRemark />\n" +
                "\t</ClsItems>\n" +
                "\t<ClsItems>\n" +
                "\t\t<Name>מיני שוקולד עלית</Name>\n" +
                "\t\t<Size />\n" +
                "\t\t<ID>1</ID>\n" +
                "\t\t<OldID>0</OldID>\n" +
                "\t\t<Barcode>1</Barcode>\n" +
                "\t\t<PurchasingAccountID>0</PurchasingAccountID>\n" +
                "\t\t<SalesAccountID>0</SalesAccountID>\n" +
                "\t\t<AlternateID />\n" +
                "\t\t<WorkByAlternateID>false</WorkByAlternateID>\n" +
                "\t\t<SerialNo />\n" +
                "\t\t<Price>0</Price>\n" +
                "\t\t<Quantity>0</Quantity>\n" +
                "\t\t<DiscountPercent>0</DiscountPercent>\n" +
                "\t\t<DiscountTotal>0</DiscountTotal>\n" +
                "\t\t<TotalSum>0</TotalSum>\n" +
                "\t\t<MaxQuantityInOrder>0</MaxQuantityInOrder>\n" +
                "\t\t<CorrectionPrice>0</CorrectionPrice>\n" +
                "\t\t<CorrectionDiscountPercent>0</CorrectionDiscountPercent>\n" +
                "\t\t<CorrectionQuantity>0</CorrectionQuantity>\n" +
                "\t\t<ConversionQuantity>0</ConversionQuantity>\n" +
                "\t\t<SuperDepartment />\n" +
                "\t\t<SuperDepartmentCode>0</SuperDepartmentCode>\n" +
                "\t\t<Department>מכולת</Department>\n" +
                "\t\t<DepartmentCode>1</DepartmentCode>\n" +
                "\t\t<DepartmentEnglishName />\n" +
                "\t\t<Group />\n" +
                "\t\t<GroupCode>0</GroupCode>\n" +
                "\t\t<GroupEnglishName />\n" +
                "\t\t<Sub_Group />\n" +
                "\t\t<Sub_GroupCode>0</Sub_GroupCode>\n" +
                "\t\t<Sub_GroupEnglishName />\n" +
                "\t\t<Manufacturer />\n" +
                "\t\t<ManufacturerCode>0</ManufacturerCode>\n" +
                "\t\t<ItemModel>\n" +
                "\t\t\t<Name />\n" +
                "\t\t\t<ID />\n" +
                "\t\t</ItemModel>\n" +
                "\t\t<ItemColor>\n" +
                "\t\t\t<Name />\n" +
                "\t\t\t<ID />\n" +
                "\t\t</ItemColor>\n" +
                "\t\t<ItemSize>\n" +
                "\t\t\t<Name />\n" +
                "\t\t\t<ID />\n" +
                "\t\t</ItemSize>\n" +
                "\t\t<Attribute1 />\n" +
                "\t\t<Attribute1Code />\n" +
                "\t\t<Attribute2 />\n" +
                "\t\t<Attribute2Code />\n" +
                "\t\t<Attribute3 />\n" +
                "\t\t<Attribute3Code />\n" +
                "\t\t<Attribute4 />\n" +
                "\t\t<Attribute4Code />\n" +
                "\t\t<Attribute5 />\n" +
                "\t\t<Attribute5Code />\n" +
                "\t\t<SupplierID>5028</SupplierID>\n" +
                "\t\t<SupplierName>שטראוס גרופ בע\"מ</SupplierName>\n" +
                "\t\t<SupplierCatalogNumber />\n" +
                "\t\t<SupplierPrice>0</SupplierPrice>\n" +
                "\t\t<ArchiveDate />\n" +
                "\t\t<BlockPurchaseDate />\n" +
                "\t\t<BlockSalesDate />\n" +
                "\t\t<EnglishName />\n" +
                "\t\t<PromoID>0</PromoID>\n" +
                "\t\t<PromoRank>0</PromoRank>\n" +
                "\t\t<MatchingItemID>0</MatchingItemID>\n" +
                "\t\t<MatchingItemQuantity>0</MatchingItemQuantity>\n" +
                "\t\t<UnitsQuantity>0</UnitsQuantity>\n" +
                "\t\t<Length>0</Length>\n" +
                "\t\t<LengthSize />\n" +
                "\t\t<Width>0</Width>\n" +
                "\t\t<WidthSize />\n" +
                "\t\t<Height>0</Height>\n" +
                "\t\t<HeightSize />\n" +
                "\t\t<Weight>0</Weight>\n" +
                "\t\t<WeightSize />\n" +
                "\t\t<PicURL>https://www.comax.co.il/Max2000Upload/1382/Prt_Pic/2/119212.jpg</PicURL>\n" +
                "\t\t<CurrentStoreID>0</CurrentStoreID>\n" +
                "\t\t<BaseLine>0</BaseLine>\n" +
                "\t\t<BaseDocNumber>0</BaseDocNumber>\n" +
                "\t\t<BaseReference>0</BaseReference>\n" +
                "\t\t<BaseYear>0</BaseYear>\n" +
                "\t\t<Conversion>0</Conversion>\n" +
                "\t\t<AdditionalConversion>0</AdditionalConversion>\n" +
                "\t\t<NotShowInWeb>false</NotShowInWeb>\n" +
                "\t\t<SetModelProperties>false</SetModelProperties>\n" +
                "\t\t<HierarchyUpdate>false</HierarchyUpdate>\n" +
                "\t\t<DownloadPriceTransparencyAfter48Hours>FalseValue</DownloadPriceTransparencyAfter48Hours>\n" +
                "\t\t<ItemData>;מכולת;;</ItemData>\n" +
                "\t\t<RejectTypeID>0</RejectTypeID>\n" +
                "\t\t<OpenDate>01/01/2013</OpenDate>\n" +
                "\t\t<WarrantyMonths>0</WarrantyMonths>\n" +
                "\t\t<Ingredients />\n" +
                "\t\t<FullIngredientsReplace>false</FullIngredientsReplace>\n" +
                "\t\t<CmtAmara>0</CmtAmara>\n" +
                "\t\t<AmaraBy />\n" +
                "\t\t<CmtAmara2>0</CmtAmara2>\n" +
                "\t\t<InternalAmara>0</InternalAmara>\n" +
                "\t\t<Line>0</Line>\n" +
                "\t\t<LengthOptic>0</LengthOptic>\n" +
                "\t\t<DiagonalOptic>0</DiagonalOptic>\n" +
                "\t\t<HeightOptic>0</HeightOptic>\n" +
                "\t\t<NameInWeb />\n" +
                "\t\t<NosafKod_2 />\n" +
                "\t\t<NosafNm_2 />\n" +
                "\t\t<NosafKod_3 />\n" +
                "\t\t<NosafNm_3 />\n" +
                "\t\t<AtarDescription />\n" +
                "\t\t<Energia>0</Energia>\n" +
                "\t\t<Pahmemot>0</Pahmemot>\n" +
                "\t\t<Helbonim>0</Helbonim>\n" +
                "\t\t<Shumanim>0</Shumanim>\n" +
                "\t\t<Colestrol>0</Colestrol>\n" +
                "\t\t<MhrMivza>0</MhrMivza>\n" +
                "\t\t<SwBonos>false</SwBonos>\n" +
                "\t\t<BonosFline>0</BonosFline>\n" +
                "\t\t<BonosTline>0</BonosTline>\n" +
                "\t\t<Mirsham_PhrmaSoft>0</Mirsham_PhrmaSoft>\n" +
                "\t\t<CustomerMakat>0</CustomerMakat>\n" +
                "\t\t<QtyType>Empty</QtyType>\n" +
                "\t\t<NoDiscount>0</NoDiscount>\n" +
                "\t\t<PriceUSD>0</PriceUSD>\n" +
                "\t\t<PriceNIS>0</PriceNIS>\n" +
                "\t\t<WarrantySupplier>0</WarrantySupplier>\n" +
                "\t\t<WarrantyRemark />\n" +
                "\t</ClsItems>\n" +
                "</ArrayOfClsItems>";
    }

    private class MyResponseCreator implements ResponseCreator {
        private final String baseurl;

        public MyResponseCreator(String baseurl) {

            this.baseurl = baseurl;
        }

        @Override
        public ClientHttpResponse createResponse(ClientHttpRequest request) throws IOException {
            @SuppressWarnings("ConstantConditions") String url = request.getURI().toString();
            if (url.equals(baseurl + "/Get_AllItemsDetailsBySearch_plus")) {
                return MockRestResponseCreators.withSuccess(getItemsDetailsResponse(), MediaType.APPLICATION_ATOM_XML).createResponse(request);
            } else if (url.equals(baseurl)) {
                return MockRestResponseCreators.withSuccess(getAllItemsPricesByParamsResult(), MediaType.APPLICATION_ATOM_XML).createResponse(request);

            } else throw new IllegalArgumentException("Request to <" + url + "> is not supported");


        }
    }
}
