package com.forezp.servicegateway;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class GatewayDefineRepository {

    public List<GatewayDefine> findAll(){
        GatewayDefine gatewayDefine = new GatewayDefine();
        gatewayDefine.setId("service-hi");
        gatewayDefine.setUri("lb://SERVICE-HI");
        gatewayDefine.setFilters("[{\"name\":\"StripPrefix\",\"args\":{\"_genkey_0\":\"1\"}},{\"name\":\"RequestTime\",\"args\":{\"_genkey_0\":\"true\"}}]");
        gatewayDefine.setPredicates("[{\"name\":\"Path\",\"args\":{\"_genkey_0\":\"/demo-v1/**\"}}]");

        GatewayDefine gatewayDefine2 = new GatewayDefine();
        gatewayDefine2.setId("service-kq");
        gatewayDefine2.setUri("lb://SERVICE-KQ");
        gatewayDefine2.setFilters("[{\"name\":\"StripPrefix\",\"args\":{\"_genkey_0\":\"1\"}},{\"name\":\"RequestTime\",\"args\":{\"_genkey_0\":\"true\"}}]");
        gatewayDefine2.setPredicates("[{\"name\":\"Path\",\"args\":{\"_genkey_0\":\"/hello-v1/**\"}}]");
        ArrayList<GatewayDefine> gatewayDefines = new ArrayList<>();
        gatewayDefines.add(gatewayDefine);
        gatewayDefines.add(gatewayDefine2);
        return gatewayDefines;
    }
    public GatewayDefine save(GatewayDefine gatewayDefine){
        return gatewayDefine;
    }
    public void deleteById(String id){

    }
    public boolean existsById(String id){
        return true;
    }

}
