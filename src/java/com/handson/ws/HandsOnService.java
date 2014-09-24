/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.handson.ws;

import com.google.common.collect.Sets;
import com.handson.tools.InterSeptionTool;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author admin
 */
@WebService(serviceName = "HandsOnService")
public class HandsOnService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "handleInterSeption")
    public Set<String> handleInterSeption(@WebParam(name = "firstList") Set<String> firstList, @WebParam(name = "secondList") Set<String> secondList) throws Exception {
       if (firstList==null||secondList==null) throw new Exception("List Values cannot be null");
       else if (firstList.size()<0||secondList.size()<0) throw new Exception("List Values cannot be Empty");
       return new InterSeptionTool().beginInterception(firstList,secondList);
     
    }
  
 
   
}
