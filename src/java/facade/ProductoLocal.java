/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import modelo.Productos;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author Buging
 */
public interface ProductoLocal {

    void addProducto(Productos producto);

    void editProducto(Productos producto);

    void deleteProducto(int codigo);

    Productos getProducto(int codigo);

    List<Productos> getAllProductos();
    
}
