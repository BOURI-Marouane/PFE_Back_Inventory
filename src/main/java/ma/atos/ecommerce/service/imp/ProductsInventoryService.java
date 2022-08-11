package ma.atos.ecommerce.service.imp;

import ma.atos.ecommerce.dto.Product_InventoryDto;
import ma.atos.ecommerce.mappers.Out_OperationMappers;
import ma.atos.ecommerce.mappers.Product_InventoryMappers;
import ma.atos.ecommerce.model.Out_Operation;
import ma.atos.ecommerce.model.Product_Inventory;
import ma.atos.ecommerce.repository.OUT_OperationRepository;
import ma.atos.ecommerce.repository.ProductsInventoryTrpository;
import ma.atos.ecommerce.service.IProductsInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsInventoryService implements IProductsInventoryService {

    @Autowired
    ProductsInventoryTrpository productsInventoryTrpository;

    @Autowired
    Product_InventoryMappers product_inventoryMappers;


    @Override
    public List<Product_Inventory> save(Product_InventoryDto product_inventoryDto) {
        Product_Inventory product_inventory = product_inventoryMappers.toOperation(product_inventoryDto);
        productsInventoryTrpository.save(product_inventory);
        return productsInventoryTrpository.findAll();
    }


}
