/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import DTOs.ClienteInfo;
import DataLayer.*;
import java.util.ArrayList;

/**
 *
 * @author wochoa
 */
public class BusVentas {
    ClienteData dc = new ClienteData();
    
    public ArrayList<ClienteInfo> ObtieneClientes(){   
        
         return dc.ObtieneClientes();
    }
}
