/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.gob.bomberosquito.java.soap.cxfclient;

import org.tempuri.EcConsultarPrediosEgresados;
import org.tempuri.EcConsultarPrediosEgresadosResponse;
import org.tempuri.WsEntidadColaboradora;
import org.tempuri.WsEntidadColaboradoraSoap;

/**
 *
 * @author danielhwang
 */
public class JavaSoapCxfclient {

    public static void main(String[] args) {
        EcConsultarPrediosEgresados params = new EcConsultarPrediosEgresados();
        params.setClaveCatastral("1011205001");
        params.setUsuarioSeg("bomberos");
        params.setPasswordSeg("17212475241");
        params.setEntidadColaboradora(3);
        EcConsultarPrediosEgresadosResponse consultarPrediosEgresadosResponse = new EcConsultarPrediosEgresadosResponse();
        WsEntidadColaboradora service = new WsEntidadColaboradora();
        WsEntidadColaboradoraSoap wsService = service.getWsEntidadColaboradoraSoap();
        consultarPrediosEgresadosResponse =wsService.ecConsultarPrediosEgresados(params);
        System.out.println("CODIGO: " + consultarPrediosEgresadosResponse.getLstPrediosEgresados().getClsEntColaPredioglobalEntity().get(0).getNombrePropietario());
        
    }
}
