package ma.atos.ecommerce.service;

import ma.atos.ecommerce.dto.Out_OperationDto;
import ma.atos.ecommerce.dto.Product_InventoryDto;
import ma.atos.ecommerce.model.Out_Operation;
import ma.atos.ecommerce.model.Product_Inventory;

import java.util.List;

public interface IProductsInventoryService {
    List<Product_Inventory> save(Product_InventoryDto product_inventoryDto);
}
