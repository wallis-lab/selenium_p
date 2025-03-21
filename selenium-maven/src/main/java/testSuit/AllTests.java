package testSuit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Web_Elements.RadioButtonTest;
import Web_Elements.TextBox;
import Web_Elements.checkBoxTest;

@RunWith(Suite.class)
@SuiteClasses({TextBox.class , checkBoxTest.class , RadioButtonTest.class})

public class AllTests {

}
