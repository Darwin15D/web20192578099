/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.List;
import modelo.dao.ProductoDAO;
import modelo.dto.ProductoDTO;

/**
 * 
 * @author Darwin Melo Perez
 */
public class Facade {
public List <ProductoDTO> listarproductos()
{
 List<ProductoDTO> lista = null;
 ProductoDAO dao = new ProductoDAO();
 lista = dao.readAll();
 return lista;
}
public boolean borrar(ProductoDTO elim) 
{
        ProductoDAO dao = new ProductoDAO();
        return dao.delete(elim);
        
    }
}
