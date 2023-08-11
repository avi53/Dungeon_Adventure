package models;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author Hassan Bassam Farhat
 * @author Avinash Bavisetty
 * @version Summer 2023
 */
public class Gremlin extends AbstractMonster implements Serializable {

    protected Gremlin() {
    }

    @Serial
    private static final long serialVersionUID = -5687175985038661820L;

    // instance fields
    /** . */
    private static final String GREMLIN_IMG_BATTLE_FILE_PATH = "src/imgs/Gremlin1.png";


    // constructor

    public Gremlin(final String theName, final int theHealth, final int theHit,
                   final int theAttack, final double theChance, final int theMaxDam,
                   final int theMinDam) {
        super(theName, theHealth, theHit, theAttack, theChance, theMaxDam, theMinDam);
    }


    // methods

    /** . */
    @Override
    public String getMonsterBattleImgFilePath() {
        return GREMLIN_IMG_BATTLE_FILE_PATH;
    }

    /** . */
    @Override
    public String toString() {
        return "Gremlin";
    }

}
