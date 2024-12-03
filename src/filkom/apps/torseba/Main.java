package filkom.apps.torseba;
import filkom.apps.torseba.util.*;
import java.util.*;

/**
 * <h1>Torseba Main App</h1>
 * 
 * @author Syafa Hadyan Rasendriya
 */
public class Main
{
    static GeneratePage generatePage = new GeneratePage();
    static DataStruct getData = new DataStruct();
    static Scanner input = new Scanner(System.in);
    /*
     * Email
     * Password
     * No telfon
     * Nama
     * Role
     * Umur
     * Jenis kelamin
     * Alamat
     */
    public static void main(String[] args)
    {
        String userLogin = "";
        String userPassword = "";
        String userType = "";
        int menuChoose = 0;
        while (true)
        {
            generatePage.defaultWelcomeHeader(getData.DEFAULT_SUB_HEADER);
            generatePage.body("Empty",4);
            generatePage.bodyWithContent(2,"1. Login",false);
            generatePage.bodyWithContent(2,"2. Register",false);
            generatePage.body("Empty",1);
            generatePage.bodyWithContent(2,"3. Keluar",false);
            menuChoose = Integer.parseInt(generatePage.bodyWithContent(2,"Pilihan anda",true));
            generatePage.body("Empty",1);
            generatePage.headerFooter();
        }
    }
}