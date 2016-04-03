package com.test;

import com.test.businessservice.ProductService;
import com.test.model.Product;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.ArrayList;
import java.util.List;

@WebService(name = "MyName", portName = "MyPortName", targetNamespace = "MyTNS", serviceName = "MyServicename")
public class ProductCatalog {

    ProductService productService = new ProductService();

    @WebMethod(action = "Get_Categories", operationName = "getCategories")
    public List<String> getProductCategories(){
        return productService.getProductCategories();
    }

    @WebResult(name = "Products")
    public List<Product> getProductCategoriesv2(){
        return productService.getProducts();
    }

//    @WebMethod(exclude = true)
    public TestingClass getTestingClass(){
        return new TestingClass();
    }

//    @WebMethod(exclude = true)
    public String sayHello(String name){
        return "Hello" + name;
    }

//    @WebMethod(exclude = true)
    public String testingName(TestingClass testingClass){
        return testingClass.name;
    }

}
