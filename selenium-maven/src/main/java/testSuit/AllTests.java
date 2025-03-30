package testSuit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Web_Elements.RadioButtonTest;
import Web_Elements.TextBoxTest;
import Web_Elements.WebTablesTest;
import Web_Elements.checkBoxTest;

@RunWith(Suite.class)
@SuiteClasses({TextBoxTest.class , checkBoxTest.class , RadioButtonTest.class , WebTablesTest.class})

public class AllTests {

}
