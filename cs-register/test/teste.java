
import cs.register.cddao;
import cs.register.partida;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cddao dao = new cddao();
        System.out.println("passou aqui");
       dao.lerd();
        partida part = new partida(10,2,2,1,9999,2);
        dao.addlist(part);
        dao.salvaresair(1);
        List<partida>p = dao.getList1();
        for (partida c  : p ){
            System.out.println("raar"+c);
        }
        
    }
    
}
