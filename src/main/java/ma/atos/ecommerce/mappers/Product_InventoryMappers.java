package ma.atos.ecommerce.mappers;

import ma.atos.ecommerce.dto.OperationDto;
import ma.atos.ecommerce.dto.Product_InventoryDto;
import ma.atos.ecommerce.model.Operation;
import ma.atos.ecommerce.model.Product_Inventory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Product_InventoryMappers {
    @Autowired
    private ModelMapper modelMapper;

    public Product_Inventory toOperation(Product_InventoryDto product_inventoryDto)
    {
        Product_Inventory product_inventory = modelMapper.map(product_inventoryDto, Product_Inventory.class);
        System.out.println(product_inventory);
        return product_inventory;
    }
}
