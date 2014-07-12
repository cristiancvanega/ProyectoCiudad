/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementacion;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author CRISTIAN
 */
public class Pedido {

    String id;
    int[][] pedido; //Matriz que contiene produco y cantidad
    Date fSolicitud;
    Date fENvio;
    Date fEntrga;
    String pvEntrega;//Placa vehiculo entrega
    String pvEnviado;//Placa vehículo enviado
    Date hsalida;//Hora de solicitud del pedido.
    int caDestino;//Dirección o id centro de abastecimiento destino
    int cdDestino;//Dirección centro de distribución destino.
}
