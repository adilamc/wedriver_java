package dropdown;

import base.BaseTests_1;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests_1 {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect no of selections");
        assertTrue(selectedOptions.contains(option),"option not selected");
    }

    @Test
    public void testAddMultipleAttributeOption(){
        var dropDownPage = homePage.clickDropdown();
        dropDownPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1","Option 2") ;
        optionsToSelect.forEach(dropDownPage::selectFromDropdown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect),"all are not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(),"option not selected");
    }
}
