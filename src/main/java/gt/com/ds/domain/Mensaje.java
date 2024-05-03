/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.ds.domain;

import lombok.Data;

/**
 * Esta clase se utiliza para crear objetos que se utilizan en las notificaciones de alertas
 *
 * @author cjbojorquez
 * 
 */
@Data
public class Mensaje {
    private String asunto;
    private String url;
}
