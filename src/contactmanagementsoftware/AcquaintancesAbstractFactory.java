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
public interface AcquaintancesAbstractFactory {
    /**
     * create acquaintance
     *
     * @param type type of acquaintance, where 0 = PersonalFriends, 1 = Relatives, 2 = ProfessionalFriends, 3 = CasualAcquaintances
     * @return Acquaintances
     */
    Acquaintances createAcquaintance(int type);
}
