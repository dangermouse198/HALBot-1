package HALBot;

import java.util.HashMap;

/**
 * Created by hjs on 09/11/2016.
 */
public class EnemyManager {
    private EnemyManager() {
        //
    }
    private static EnemyManager theInstance = null;
    private HashMap<String,EnemyRobot> theMap;

    public static EnemyManager GetEnemyManager()
    {
        if (theInstance == null)
        {
            synchronized(EnemyManager.class) {
                if ( theInstance == null ) {
                    theInstance = new EnemyManager();
                }
            }
        }
        return theInstance;
    }

    public EnemyRobot getEnemy(String id)
    {
        EnemyRobot bot = theMap.get(id);
        if ( theMap.get(id) == null )
        {
            bot = new EnemyRobot();
            theMap.put(id, bot);
        }
        return bot;
    }


}
