package ma.atos.ecommerce.web;

import ma.atos.ecommerce.dto.*;
import ma.atos.ecommerce.exceptions.Out_Operation_Exception;
import ma.atos.ecommerce.mappers.In_OperationMappers;
import ma.atos.ecommerce.mappers.Out_OperationMappers;
import ma.atos.ecommerce.model.In_Operation;
import ma.atos.ecommerce.model.Out_Operation;
import ma.atos.ecommerce.model.Product_Inventory;
import ma.atos.ecommerce.repository.ProductsInventoryTrpository;
import ma.atos.ecommerce.service.imp.IN_OperationService;
import ma.atos.ecommerce.service.imp.OUT_OperationService;
import ma.atos.ecommerce.service.imp.ProductsInventoryService;
import ma.atos.ecommerce.web.Responses.In_Operation_Response;
import ma.atos.ecommerce.web.Responses.Out_Operation_Response;
import ma.atos.ecommerce.web.Responses.Response_ListIn;
import ma.atos.ecommerce.web.Responses.Response_ListOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/operation")
public class Controllers {
    @Autowired
    IN_OperationService in_operationService;
    @Autowired
    OUT_OperationService out_operationService;

    @Autowired
    ProductsInventoryTrpository productsInventoryTrpository;

    @Autowired
    Out_OperationMappers out_operationMappers;

    @Autowired
    In_OperationMappers in_operationMappers;

    @Autowired
    ProductsInventoryService productsInventoryService;
    /********************************************* In Operation ***********************************************/
    @PostMapping("/in_operation/save")
    private In_Operation_Response save(@RequestBody In_OperationDto in_operationDto)
    {
        In_Operation_Response in_operation_response = null;
        try{
            in_operation_response = in_operationMappers.intOperationResponse(in_operationService.save(in_operationDto));
            in_operation_response.setMessage("200");
            in_operation_response.setHttpStatus("succès de la requête");
        }catch (Exception e)
        {
            in_operation_response.setHttpStatus("500");
            in_operation_response.setMessage("erreurs serveur");
        }
        return in_operation_response;
    }


    @PostMapping("/in_operation/findBySupplier")
    private Response_ListIn findInByCustomer(@RequestBody GetSupplierId getSupplierId) throws Exception
    {
        Response_ListIn response_listIn = new Response_ListIn();
        try {
            response_listIn.setList_outOperations(in_operationService.findInByCustomer(getSupplierId));
            response_listIn.setMessage("succès de la requête");
            response_listIn.setHttpStatus("200");
        }catch (Out_Operation_Exception out_operation_exception)
        {
            response_listIn.setMessage("Invalid In operation : The agency you are looking could not be found");
            response_listIn.setHttpStatus("404");
        }
        catch (Exception e)
        {
            response_listIn.setMessage("erreurs serveur");
            response_listIn.setHttpStatus("500");
        }
        return response_listIn;
    }
/********************************************* Out Operation ***********************************************/
    @PostMapping("/out_operation/save")
    private Out_Operation_Response save(@RequestBody Out_OperationDto out_operationDto)
    {
        Out_Operation_Response out_operation_response = null;
        try{
            out_operation_response = out_operationMappers.outOperationResponse(out_operationService.save(out_operationDto));
            out_operation_response.setMessage("200");
            out_operation_response.setHttpStatus("succès de la requête");
        }catch (Exception e)
        {
            out_operation_response.setHttpStatus("500");
            out_operation_response.setMessage("erreurs serveur");
        }
            return out_operation_response;
    }



    @PostMapping("/out_operation/findByCustomer")
    private Response_ListOut findByCustomer(@RequestBody GetIdCustomer getIdCustomer) throws Exception
    {
        Response_ListOut response_listOut = new Response_ListOut();
        try {
            response_listOut.setList_outOperations(out_operationService.findByCustomer(getIdCustomer));
            response_listOut.setMessage("succès de la requête");
            response_listOut.setHttpStatus("200");
        }catch (Out_Operation_Exception out_operation_exception)
        {
            response_listOut.setMessage("Invalid Normal Cart : The agency you are looking could not be found");
            response_listOut.setHttpStatus("404");
        }
        catch (Exception e)
        {
            response_listOut.setMessage("erreurs serveur");
            response_listOut.setHttpStatus("500");
        }
        return response_listOut;
    }


    /********************************************* product inventory ***********************************************/
    @PostMapping("/productInventory/save")
    private List<Product_Inventory> save(@RequestBody Product_InventoryDto product_inventoryDto)
    {
        return productsInventoryService.save(product_inventoryDto);
    }

}
