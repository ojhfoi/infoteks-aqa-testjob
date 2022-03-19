package core.settings;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:ProjectSetting.properties")
public interface ProjectSetting extends Config {

    ProjectSetting PROJECT_SETTING = ConfigFactory.create(ProjectSetting.class);

    @Config.Key("browser.setting")
    String getBrowser();

    @Config.Key("url.setting")
    String getUrl();
}
