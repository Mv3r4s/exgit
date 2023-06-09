package guru;

import utilities.Config;
import utilities.Driver;

public class TestPom {
    public void menuTest(){
        Driver.getDriver().get(Config.getValue("guruURL"));

    }
}
