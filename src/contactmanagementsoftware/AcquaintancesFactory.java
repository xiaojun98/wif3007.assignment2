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
    
    private static AcquaintancesFactory instance;
    
    public static AcquaintancesFactory getInstance() {
        if(instance == null) {
            instance = new AcquaintancesFactory();
        }
        return instance;
    }
    
    private AcquaintancesFactory() {}

    @Override
    public Acquaintances createAcquaintance(String type) {
        switch(type) {
            case "Personal":
                return new PersonalFriends();
            case "Relative":
                return new Relatives();
            case "Professional":
                return new ProfessionalFriends();
            case "Casual":
                return new CasualAcquaintances();
        }
        throw new UnsupportedOperationException("Not supported type - ".concat(type)); //To change body of generated methods, choose Tools | Templates.
    }
    
}
