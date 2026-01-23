/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.dao.impl;

import java.util.List;
import poly.cafe.dao.DrinkDAO;
import poly.cafe.entity.Category;
import poly.cafe.entity.Drink;
import poly.cafe.util.XQuery;

/**
 *
 * @author nguyenvv
 */
public class DrinkDAOImpl implements DrinkDAO{
    
    String sqlFindAll = "SELECT * from Drinks";
    
    String findByCategoryName ="SELECT Drinks.* from Drinks inner join "
            + " Categories On Drinks.CategoryId = Categories.Id WHERE  Categories.Name = ?";

    @Override
    public Drink create(Drink entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Drink entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Drink> findAll() {
        // get all
        return XQuery.getBeanList(Drink.class, sqlFindAll);
    }

    @Override
    public Drink findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     @Override
    public List<Drink> findByCategoryName(String name){
        return XQuery.getBeanList(Drink.class, findByCategoryName, name );
    }
    
}
