package about.gui.test;

import about.gui.main.ScriptBase;
import org.testng.annotations.Test;

/**
 * Created by wasey on 10/20/16.
 */
public class FunctionalityTest extends ScriptBase {

    @Test
    public void testUi() throws Exception
    {


       nss().Action().verifytitle();

    }
}
