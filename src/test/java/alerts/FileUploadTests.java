package alerts;

import base.BaseTests_1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests_1 {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickOnFileUpload();
        uploadPage.uploadFile("C:/Users/LENOVO/wedriver_java/resources/chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe","Upload unsuccessfull");
    }
}
