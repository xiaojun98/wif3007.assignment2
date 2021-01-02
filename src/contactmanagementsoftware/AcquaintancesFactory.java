/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author thechee
 */
public class AcquaintancesFactory implements AcquaintancesAbstractFactory{

    @Override
    public Acquaintances createAcquaintance(int type) {
        switch(type) {
            case 0:
                return new PersonalFriends();
            case 1:
                return new Relatives();
            case 2:
                return new ProfessionalFriends();
            case 3:
                return new CasualAcquaintances();
        }
        throw new UnsupportedOperationException("Not supported type (0-3)."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
