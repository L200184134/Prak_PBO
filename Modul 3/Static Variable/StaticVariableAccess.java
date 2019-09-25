/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariable;

public class StaticVariableAccess {
    public static void main (String [] args) {
        StaticVariable.akreditasi ='B';
        StaticVariable sv = new StaticVariable();
        sv.firstMethod();
        sv.secondMethod();
    }
}
