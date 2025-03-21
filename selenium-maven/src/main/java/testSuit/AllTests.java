package testSuit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testfile.checkBoxTest;
import testfile.RadioButtonTest;
import testfile.TextBox;

@RunWith(Suite.class)
@SuiteClasses({TextBox.class , checkBoxTest.class , RadioButtonTest.class})

public class AllTests {

}
