package com.test;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by salonivithalani on 4/3/16.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ShopInfo {

    public ArrayList<String> getShopName(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        return list;
    }

    public String testingName(TestingClass testingClass){
        return testingClass.name;
    }
}
