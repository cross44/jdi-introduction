package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.example.site.pages.HomePage;

@JSite("https://epam.github.io/JDI/")
public class JdiTestSite {
    public static HomePage homePage;

}
