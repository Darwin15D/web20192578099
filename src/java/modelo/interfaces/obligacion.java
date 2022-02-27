/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.interfaces;

import java.util.List;


public interface obligacion <Cualquiercosa>{
    public boolean create(Cualquiercosa nuevo);
    public List <Cualquiercosa> readAll();
    public Cualquiercosa read(Cualquiercosa filter);
    public boolean update (Cualquiercosa item);
    public boolean delete (Cualquiercosa item);
}
