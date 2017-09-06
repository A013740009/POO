/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaaerolinea;

/**
 *
 * @author ercv1
 */
public class Person {

    private int age;

    public void setAge(int newAge) throws IllegalArgumentException{
        this.age = newAge;
        if (newAge < 0 || newAge > 125) {
            throw new IllegalArgumentException("La edad introducida no es real!");//es la excepcion de edad8
    
        }
    }
}
