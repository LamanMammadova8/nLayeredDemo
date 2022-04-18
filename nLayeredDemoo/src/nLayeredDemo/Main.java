package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jlogger.LoggerManager;

public class Main {

    public static void main(String[] args) {
        ProductService productService=new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
        Product product=new Product(6534,345, "HP Pavilion", 2600, 12);
        Product product1=new Product(135,1,"Asus ROG Zephyrus", 4599,7);
        Product product2=new Product(894,129,"MSI Stealth G",9450,3);
        productService.add(product);
        productService.add(product1);
        productService.add(product2);
    }
}
